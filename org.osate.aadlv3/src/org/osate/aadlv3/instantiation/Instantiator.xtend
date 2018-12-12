package org.osate.aadlv3.instantiation

import java.util.ArrayList
import java.util.Collection
import java.util.Collections
import java.util.Stack
import org.osate.aadlv3.aadlv3.Association
import org.osate.aadlv3.aadlv3.Component
import org.osate.aadlv3.aadlv3.ComponentConfiguration
import org.osate.aadlv3.aadlv3.ComponentImplementation
import org.osate.aadlv3.aadlv3.ComponentInterface
import org.osate.aadlv3.aadlv3.ConfigurationAssignment
import org.osate.aadlv3.aadlv3.DataType
import org.osate.aadlv3.aadlv3.Feature
import org.osate.aadlv3.aadlv3.FeatureCategory
import org.osate.aadlv3.aadlv3.PathElement
import org.osate.aadlv3.aadlv3.PathSequence
import org.osate.aadlv3.aadlv3.TypeReference
import org.osate.aadlv3.aadlv3.Workingset
import org.osate.aadlv3.util.Aadlv3Util
import org.osate.av3instance.av3instance.AssociationInstance
import org.osate.av3instance.av3instance.ComponentInstance
import org.osate.av3instance.av3instance.FeatureInstance
import org.osate.av3instance.av3instance.InstanceObject
import org.osate.av3instance.av3instance.PathInstance

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import static extension org.osate.aadlv3.util.Aadlv3Util.*

class Instantiator {
	def instantiate(Workingset ws) {
		for (iroot : ws.rootComponents) {
			val rootinstance = iroot.instantiateRoot
			rootinstance.eResource.save(null)
		}
	}
	
	def getInstanceURI(Workingset ws, Component root){
		val wsURI = ws.eResource.URI.trimFileExtension
		val wsname = wsURI.lastSegment
		val rootname = root.name
		wsURI.trimSegments(1).appendSegment("instances").appendSegment(wsname).appendSegment(rootname).appendFileExtension("aiv3")
	}


	def ComponentInstance instantiateRoot(Component c) {
		// cas scope represents the configuration assignments (CAs) for a given nesting level in the component hierarchy
		// The top of the stack has the CAs whose single path element references are relevant
		Aadlv3Util.resetComponentInstanceCache
		val ws = c.eContainer as Workingset
		val wsinstancesresourceURI = getInstanceURI(ws, c)
		var instanceResource = ws.eResource.resourceSet.getResource(wsinstancesresourceURI,false)
		if (instanceResource === null){
			instanceResource = ws.eResource.resourceSet.createResource(wsinstancesresourceURI)
		}
		instanceResource.contents.clear
		
		val casscopes = new Stack <Iterable<ConfigurationAssignment>>()
		val tref = c.getConfiguredTypeReferences(casscopes, null)
		// set component instance to configured classifier
		val ci = c.createComponentInstance(tref)
		instanceResource.contents.add(ci)
		c.instantiateComponent(casscopes,ci)
		return ci
	}

	//  component to be instantiated using configured classifier confcl and set of configuration assignments
	def void instantiateComponent(Component comp,  Stack<Iterable<ConfigurationAssignment>> casscopes, ComponentInstance context) {
		var Iterable<TypeReference> trefs = null
		val isRoot = comp.eContainer instanceof Workingset
		val ci = if (isRoot){
			// root
			trefs = context.configuredTypeReferences
			context
		} else {
			// subcomponent
			trefs = comp.getConfiguredTypeReferences(casscopes, context)
			// set component instance to configured classifier
			val subci = comp.createComponentInstance(trefs)
			context.components += subci
			subci
		}
		if (trefs === null) {
			// inline subcomponents without explicit classifier
			comp.features.forEach[f| ci.features += f.instantiateFeature(false)]
			casscopes.push(Collections.EMPTY_LIST)
			comp.components.forEach[subc|subc.instantiateComponent(casscopes,ci)]
			casscopes.pop
		} else {
			val trs = trefs
			ci.allFeatures.forEach[f|ci.features += f.instantiateFeature(trs.isReverseFeature(f))]
			ci.allFlowSpecs.forEach[fs|fs.instantiateFlowSpec(ci)]
			val comps = ci.allSubcomponents
			val cas = trefs.allConfigurationAssignments
			casscopes.push(cas)
			comps.forEach[subc|subc.instantiateComponent(casscopes, ci)]
			casscopes.pop
		}
		// now we fill in connection instances
		val cl = ci.configuredTypeReferences
		if (cl !== null){
			val allassocs = ci.allAssociations
			val actualConns = allassocs.filter[conn|conn.associationType.isConnection]
			for (conn: actualConns){
				conn.instantiateConnection(ci)
			}
			if (isRoot){
			// generate external connections - only for the root component
				val incomingConns = allassocs.filter[conn|conn.isIncomingFeatureMapping]
				for (conn : incomingConns){
					conn.instantiateExternalIncomingConnection(ci)
				}
				val outgoingConns = allassocs.filter[conn|conn.isOutgoingFeatureMapping]
				for (conn : outgoingConns){
					conn.instantiateExternalOutgoingConnection(ci)
				}
			}
			// now generate all (end to end) flows
			for (flow : ci.allPaths){
				flow.instantiatePath(ci)
			}
			
			// finally we fill in property associations
			// should do:
			// in classifier order
			// outer over inner
			// currently we assign inner first
//			for (pa : cl.allPropertyAssociations){
//				val target = ci.getInstanceElement(pa.target)
//				val pai = createPropertyAssociationInstance(pa)
//				if (pai.containingComponentConfiguration !== null){
//					pai.final = true
//				}
//				target.addPropertyAssociationInstance(pai)
//			}
//			for (pa : comp.propertyAssociations){
//				val target = ci.getInstanceElement(pa.target)
//				target.addPropertyAssociationInstance(createPropertyAssociationInstance(pa))
//			}
//			if (cl instanceof ComponentConfiguration){
//				// process property associations contained in configuration assignments
//				val cas = cl.allConfigurationAssignments
//				for (ca : cas){
//					processConfigurationAssignmentProperties(ca, ci)
//				}
//			}
		}
	}
	
	def void processConfigurationAssignmentProperties(ConfigurationAssignment ca, InstanceObject context){
		if (ca.propertyAssociations.empty){
			return
		}
		val targetio = context.getInstanceElement(ca.target)
		for (pa: ca.propertyAssociations){
			val target = targetio.getInstanceElement(pa.target)
			target.addPropertyAssociationInstance(createPropertyAssociationInstance(pa))
		}
		for (subca: ca.configurationAssignments){
			ca.processConfigurationAssignmentProperties(targetio)
		}
	}
	
	def FeatureInstance instantiateFeature(Feature f, boolean reverse){
		val fi = f.createFeatureInstance(reverse)
		if (f.category === FeatureCategory.INTERFACE ){
			val cl = fi.feature.type 
			if (cl instanceof ComponentInterface){
				fi.allFeatures.forEach[subf| 
					val doreverse = cl.allFeatures.isReverseFeature(subf, reverse)
					fi.features += instantiateFeature(subf,doreverse)
				]
			}
		}
		for (pa : f.propertyAssociations){
			val target = fi.getInstanceElement(pa.target)
			target.addPropertyAssociationInstance(createPropertyAssociationInstance(pa))
		}
		fi
	}

	
	def void instantiateFlowSpec(Association conn, ComponentInstance context){
		val fsi = conn.createAssociationInstance
		if (conn.source !== null){
			fsi.source = context.getInstanceElement(conn.source) as FeatureInstance
		}
		if (conn.destination !== null){
			fsi.destination = context.getInstanceElement(conn.destination) as FeatureInstance
		}
		for (pa : conn.propertyAssociations){
			val target = fsi.getInstanceElement(pa.target)
			target.addPropertyAssociationInstance(createPropertyAssociationInstance(pa))
		}
		context.flowspecs += fsi
	}

	
	def void instantiateConnection(Association conn, ComponentInstance context){
		if (conn.source.context === null || conn.destination.context === null) return
		val conni = conn.createAssociationInstance
		val srcinstance= context.getInstanceElement(conn.source)
		val dstinstance = context.getInstanceElement(conn.destination)
		if (srcinstance instanceof FeatureInstance) conni.source = srcinstance as FeatureInstance
		if (dstinstance instanceof FeatureInstance) conni.destination = dstinstance as FeatureInstance
		val allconnis = expandFeatureMappings(conni, context)
		context.connections += allconnis
		for (finalconni : allconnis){
			for (pa : conn.propertyAssociations){
				val target = finalconni.getInstanceElement(pa.target)
				target.addPropertyAssociationInstance(createPropertyAssociationInstance(pa))
			}
		}
	}

	
	def void instantiateExternalOutgoingConnection(Association conn, ComponentInstance context){
		val conni = conn.createAssociationInstance
		val dstinstance= context.getInstanceElement(conn.destination)
		val srcinstance = dstinstance
		conni.source = srcinstance as FeatureInstance
		conni.destination = dstinstance as FeatureInstance
		val expandedSources = new ArrayList<AssociationInstance>()
		expandSourceFeatureMappings(conni, expandedSources)
		context.connections += expandedSources
		for (finalconni : expandedSources){
			finalconni.external = true
			for (pa : conn.propertyAssociations){
				val target = finalconni.getInstanceElement(pa.target)
				target.addPropertyAssociationInstance(createPropertyAssociationInstance(pa))
			}
		}
	}
	
	def void instantiateExternalIncomingConnection(Association conn, ComponentInstance context){
		val conni = conn.createAssociationInstance
		val srcinstance= context.getInstanceElement(conn.source)
		val dstinstance = srcinstance
		conni.source = srcinstance as FeatureInstance
		conni.destination = dstinstance as FeatureInstance
		val expandedDestinations = new ArrayList<AssociationInstance>()
		expandDestinationFeatureMappings(conni, expandedDestinations)
		context.connections += expandedDestinations
		for (finalconni : expandedDestinations){
			finalconni.external = true
			for (pa : conn.propertyAssociations){
				val target = finalconni.getInstanceElement(pa.target)
				target.addPropertyAssociationInstance(createPropertyAssociationInstance(pa))
			}
		}
	}

	
	def Collection<AssociationInstance> expandFeatureMappings(AssociationInstance conni, ComponentInstance context){
		val expandedSources = new ArrayList<AssociationInstance>()
		val expandedDestinations = new ArrayList<AssociationInstance>()
		expandSourceFeatureMappings(conni,expandedSources)
		for(srcconni: expandedSources){
			expandDestinationFeatureMappings(srcconni,expandedDestinations)
		}
		expandedDestinations
	}
	
	def void expandSourceFeatureMappings(AssociationInstance conni, Collection<AssociationInstance> result){
		val srccxt = conni.source.containingComponentInstance
		val srcconftrs = srccxt.configuredTypeReferences
		if (srcconftrs === null) return
		// TODO handle expansion in nested declaraitons
		val srcmappings = srccxt.allAssociations.filter[conn| conn.isSourceFeatureMapping(conni)]
		if(srcmappings.size > 1){
			// need to make a copy of conni
			for (element : srcmappings) {
				val expconni = conni.copy
				expconni.sourceMappings += element
				expconni.source = srccxt.getInstanceElement(element.destination) as FeatureInstance
				result += expconni
				expconni.expandSourceFeatureMappings(result)
			}
		} else if (srcmappings.size == 1){
			val element = srcmappings.head
			conni.sourceMappings += element
			conni.source = srccxt.getInstanceElement(element.destination) as FeatureInstance
			if (!result.contains(conni)){
				result += conni
			}
			conni.expandSourceFeatureMappings(result)
		} else {
			if (!result.contains(conni)){
				result += conni
			}
		}
	}
	
	def void expandDestinationFeatureMappings(AssociationInstance conni, Collection<AssociationInstance> result){
		val dstcxt = conni.destination.containingComponentInstance
		val dstconftrs = dstcxt.configuredTypeReferences
		if (dstconftrs === null) return
		val dstmappings = dstcxt.allAssociations.filter[conn| conn.isDestinationFeatureMapping(conni)]
		if(dstmappings.size > 1){
			// need to make a copy of conni
			for (element : dstmappings) {
				val expconni = conni.copy
				expconni.destinationMappings += element
				expconni.destination = dstcxt.getInstanceElement(element.destination) as FeatureInstance
				result += expconni
				expconni.expandDestinationFeatureMappings(result)
			}
		} else if (dstmappings.size == 1){
			val element = dstmappings.head
			conni.destinationMappings += element
			conni.destination = dstcxt.getInstanceElement(element.destination) as FeatureInstance
			if (!result.contains(conni)){
				result += conni
			}
			conni.expandDestinationFeatureMappings(result)
		} else {
			if (!result.contains(conni)){
				result += conni
			}
		}
	}
	
	def void instantiatePath(PathSequence ps, ComponentInstance context){
		val psi = ps.createPathSequenceInstance
		context.paths += psi
		ps.processPath(psi,context)
		for (pa : ps.propertyAssociations){
			val target = psi.getInstanceElement(pa.target)
			target.addPropertyAssociationInstance(createPropertyAssociationInstance(pa))
		}
	}
	
	// process a path sequence. this may be the ETEF or a flow assignment sequence 
	def void processPath(PathSequence ps, PathInstance psi, ComponentInstance context){
		for (pe : ps.elements){
			val InstanceObject previousflowelementinstance = psi.elements.last
			val flowelement = pe.element
			if (flowelement instanceof Association && (flowelement as Association).isFlowSpec){
					// expand flowspec by its configured flow
					if (previousflowelementinstance.isFlowSpec){
						// find the missing connection instance
						val fsi = context.getInstanceElement(pe) 
						if (fsi.flowSpec){
							val src = (previousflowelementinstance as AssociationInstance).destination
							val dst = (fsi as AssociationInstance).source
							val conni = findAssociationInstance(src,dst)
							if (conni !== null){
								psi.elements += conni
							}
						}
					}
					pe.processFlowSpec(psi,context)
 			} else if (flowelement instanceof Component){
				// find component instance
				val ci = context.getInstanceElement(pe)
				psi.elements += ci
 			} else if (flowelement instanceof Association && (flowelement as Association).associationType.isConnection){
 				// find connection instance
				// skips feature mappings, such as the (optional) first and last element of a flow implementation
 				val conni = context.getInstanceElement(pe)
 				if (conni instanceof AssociationInstance){
 					if (previousflowelementinstance.isConnection){
 						// put in place component/flowspec between two connections
 						val fsi = findFlowSpecInstance((previousflowelementinstance as AssociationInstance).destination, conni.source)
 						if (fsi !== null){
 							psi.elements += fsi
 						} else {
 							psi.elements += (previousflowelementinstance as AssociationInstance).destination.containingComponentInstance
 						}
 					}
					psi.elements += conni
 				}
 			}
		}
	}
	
	// process a flow specification. Expand it is there is a flow assignment in the component implementation
	def processFlowSpec(PathElement pe, PathInstance psi, ComponentInstance context){
		val fscontext = context.getInstanceElement(pe.context)
		if (fscontext instanceof ComponentInstance){
			for (fa : fscontext.allFlowAssignments) {
				if (fa.target.element == pe.element){
					// recursively process the path
					fa.processPath(psi,fscontext)
					return
				}
			}
		}
		psi.elements += context.getInstanceElement(pe)
	}

}
