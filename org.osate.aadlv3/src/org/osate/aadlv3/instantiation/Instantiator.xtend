package org.osate.aadlv3.instantiation

import java.util.ArrayList
import java.util.Collection
import java.util.Collections
import java.util.Stack
import org.eclipse.xtext.EcoreUtil2
import org.osate.aadlv3.aadlv3.Association
import org.osate.aadlv3.aadlv3.BehaviorRule
import org.osate.aadlv3.aadlv3.BehaviorSpecification
import org.osate.aadlv3.aadlv3.Classifier
import org.osate.aadlv3.aadlv3.ClassifierAssignment
import org.osate.aadlv3.aadlv3.ComponentInterface
import org.osate.aadlv3.aadlv3.ConditionOperation
import org.osate.aadlv3.aadlv3.ECollection
import org.osate.aadlv3.aadlv3.Feature
import org.osate.aadlv3.aadlv3.FeatureCategory
import org.osate.aadlv3.aadlv3.Generator
import org.osate.aadlv3.aadlv3.ListLiteral
import org.osate.aadlv3.aadlv3.ModelElementReference
import org.osate.aadlv3.aadlv3.PathElement
import org.osate.aadlv3.aadlv3.PathSequence
import org.osate.aadlv3.aadlv3.PropertyAssociation
import org.osate.aadlv3.aadlv3.PropertyAssociationType
import org.osate.aadlv3.aadlv3.PropertyDefinition
import org.osate.aadlv3.aadlv3.Subcomponent
import org.osate.aadlv3.aadlv3.TypeReference
import org.osate.aadlv3.aadlv3.Workingset
import org.osate.av3instance.av3instance.AssociationInstance
import org.osate.av3instance.av3instance.ComponentInstance
import org.osate.av3instance.av3instance.FeatureInstance
import org.osate.av3instance.av3instance.InstanceObject
import org.osate.av3instance.av3instance.PathInstance

import static org.osate.aadlv3.util.ProductLineConstraint.*

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import static extension org.osate.aadlv3.util.AIv3API.*
import static extension org.osate.aadlv3.util.Aadlv3Util.*
import org.osate.aadlv3.aadlv3.TypeDef
import org.osate.aadlv3.aadlv3.EnumerationType

class Instantiator {
	
	static var Iterable<PropertyDefinition> expectedProperties = Collections.EMPTY_LIST
	
	static var ListLiteral configurationConstraint = null;
	
	def instantiate(Workingset ws) {
		expectedProperties = ws.expectedProperties
		var ComponentInstance root = null
		for (iroot : ws.instanceRoots) {
			configurationConstraint = getProductLineConstraint(iroot);
			val rootinstance = iroot.instantiateRoot
			rootinstance.eResource.save(null)
			root = rootinstance
// XXX TODO 
//		//  check whether all expected properties have been set
//			val PVissues = validateExpectedPropertyValues(rootinstance,expectedProperties)
//		// validate product line constraint
//		val PLCissues = validateProductLineConstraint(rootinstance,configurationConstraint)
		// analyze token paths
		}
		return root
	}
	
	def getInstanceURI(Workingset ws, Subcomponent root){
		val wsURI = ws.eResource.URI.trimFileExtension
		val wsname = wsURI.lastSegment
		val rootname = root.name
		wsURI.trimSegments(1).appendSegment("instances").appendSegment(wsname).appendSegment(rootname).appendFileExtension("aiv3")
	}


	def ComponentInstance instantiateRoot(Subcomponent c) {
		// cas scope represents the configuration assignments (CAs) for a given nesting level in the Subcomponent hierarchy
		// The top of the stack has the CAs whose single path element references are relevant
		resetComponentInstanceCache
		val ws = c.eContainer as Workingset
		val wsinstancesresourceURI = getInstanceURI(ws, c)
		var instanceResource = ws.eResource.resourceSet.getResource(wsinstancesresourceURI,false)
		if (instanceResource === null){
			instanceResource = ws.eResource.resourceSet.createResource(wsinstancesresourceURI)
		}
		instanceResource.contents.clear
		
		val casscopes = new Stack <Iterable<ClassifierAssignment>>()
		val tref = c.getConfiguredTypeReferences(casscopes, null)
		// set component instance to configured classifier
		// XXX TODO check product line constraint
		val ci = c.createComponentInstance(tref)
		//  val issues = validateConfiguredComponentInstance(subci, configurationConstraint)
		instanceResource.contents.add(ci)
		c.instantiateComponent(casscopes,ci)
		return ci
	}

	//  component to be instantiated using configured classifier confcl and set of configuration assignments
	def void instantiateComponent(Subcomponent comp,  Stack<Iterable<ClassifierAssignment>> casscopes, ComponentInstance context) {
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
		// XXX TODO check product line constraint
		//  val issues = validateConfiguredComponentInstance(subci, configurationConstraint)
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
			val cas = trefs.allClassifierAssignments
			casscopes.push(cas)
			comps.forEach[subc|subc.instantiateComponent(casscopes, ci)]
			casscopes.pop
		}
		// now we fill in connection instances
		val ctyperefs = ci.configuredTypeReferences
		if (ctyperefs !== null){
			val allassocs = ci.allAssociations
			val actualConns = allassocs.filter[conn|conn.isConnection]
			for (conn: actualConns){
				conn.instantiateConnection(ci)
			}
			if (isRoot){
			// generate external connections - only for the root component
				val incomingConns = allassocs.filter[conn|conn.isIncomingFeatureDelegation]
				for (conn : incomingConns){
					conn.instantiateExternalIncomingConnection(ci)
				}
				val outgoingConns = allassocs.filter[conn|conn.isOutgoingFeatureDelegation]
				for (conn : outgoingConns){
					conn.instantiateExternalOutgoingConnection(ci)
				}
			}
			// now generate all (end to end) flows
			for (flow : ci.allPaths){
				flow.instantiatePath(ci)
			}
			
			// finally we fill in property assignments found in list of classifiers for component
			// this includes property associations from configurations and configuration assignments
			// NOTE: we to this for contained components. Outer components may still configure us.
			for (pa : ctyperefs.allPropertyAssociations){
				ci.addPropertyAssociationInstance(pa)
			}
			for (ca : ctyperefs.allClassifierAssignments){
				ci.processClassifierAssignmentPropertyAssociations(ca)
			}
		}
		// now we handle Generators and Behavior Rules in annexes
		val subcls = ci.getAllSubclauses
		for (subclause: subcls){
			if (subclause instanceof BehaviorSpecification){
				for (gen : subclause.generators){
					gen.instantiateGenerator(ci)
				}
			}
		}
		for (subclause: subcls){
			if (subclause instanceof BehaviorSpecification){
				if (subclause.states !== null){
					subclause.states.instantiateStates(ci)
				}
				for (br: subclause.rules){
					br.instantiateBehaviorRule(ci)
				}
			}
		}
		// handle property assignments attached to (sub)component
		// This is done for nested subcomponent declarations as well
		for (pa : comp.ownedPropertyAssociations) {
			ci.addPropertyAssociationInstance(pa)
		}
		// fill in default property values for all expected properties that do not have an explicitly assigned value
		if (expectedProperties.empty){
			// fill in default for all allowed properties
			val allowedProperties = ci.allowedProperties
			ci.addDefaultPropertyValues(allowedProperties)
			for (fi : ci.features) {
				fi.addDefaultPropertyValues(fi.allowedProperties)
			}
			for (conni : ci.connections) {
				conni.addDefaultPropertyValues(conni.allowedProperties)
			}
		} else {
			// fill in default for all expected properties
			ci.addDefaultPropertyValues(expectedProperties)
		}
	}
	
	def FeatureInstance instantiateFeature(Feature f, boolean reverse){
		val fi = f.createFeatureInstance(reverse)
		if (f.category === FeatureCategory.INTERFACE ){
			val cl = fi.feature?.typeReference?.type 
			if (cl instanceof ComponentInterface){
				fi.allFeatures.forEach[subf| 
					val doreverse = cl.allFeatures.isReverseFeature(subf, reverse)
					fi.features += instantiateFeature(subf,doreverse)
				]
			}
		}
		for (pa : f.ownedPropertyAssociations){
			fi.addPropertyAssociationInstance(pa)
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
		for (pa : conn.ownedPropertyAssociations){
			fsi.addPropertyAssociationInstance(pa)
		}
		context.flowspecs += fsi
	}

	
	def void instantiateConnection(Association conn, ComponentInstance context){
		val conni = conn.createAssociationInstance
		conni.bidirectional = conn.bidirectional
		val srcinstance= context.getInstanceElement(conn.source)
		val dstinstance = context.getInstanceElement(conn.destination)
		conni.source = srcinstance 
		conni.destination = dstinstance 
		val allconnis = expandFeatureMappings(conni, context)
		context.connections += allconnis
		for (finalconni : allconnis){
			// add in local property assignment
			for (pa : conn.ownedPropertyAssociations){
				finalconni.addPropertyAssociationInstance(pa)
			}
		}
	}

	
	def void instantiateExternalOutgoingConnection(Association conn, ComponentInstance context){
		val conni = conn.createAssociationInstance
		val dstinstance= context.getInstanceElement(conn.destination)
		val srcinstance = dstinstance
		conni.source = srcinstance 
		conni.destination = dstinstance 
		val expandedSources = new ArrayList<AssociationInstance>()
		expandSourceFeatureDelegates(conni, expandedSources)
		context.connections += expandedSources
		for (finalconni : expandedSources){
			finalconni.external = true
			for (pa : conn.ownedPropertyAssociations){
				finalconni.addPropertyAssociationInstance(pa)
			}
		}
	}
	
	def void instantiateExternalIncomingConnection(Association conn, ComponentInstance context){
		val conni = conn.createAssociationInstance
		val srcinstance= context.getInstanceElement(conn.source)
		val dstinstance = srcinstance
		conni.source = srcinstance 
		conni.destination = dstinstance 
		val expandedDestinations = new ArrayList<AssociationInstance>()
		expandDestinationFeatureDelegates(conni, expandedDestinations)
		context.connections += expandedDestinations
		for (finalconni : expandedDestinations){
			finalconni.external = true
			for (pa : conn.ownedPropertyAssociations){
				finalconni.addPropertyAssociationInstance(pa)
			}
		}
	}

	
	def Collection<AssociationInstance> expandFeatureMappings(AssociationInstance conni, ComponentInstance context){
		val expandedSources = new ArrayList<AssociationInstance>()
		val expandedDestinations = new ArrayList<AssociationInstance>()
		expandSourceFeatureDelegates(conni,expandedSources)
		for(srcconni: expandedSources){
			expandDestinationFeatureDelegates(srcconni,expandedDestinations)
		}
		expandedDestinations
	}
	
	def void expandSourceFeatureDelegates(AssociationInstance conni, Collection<AssociationInstance> result){
		val srccxt = conni.source.containingComponentInstanceOrSelf
		val srcconftrs = srccxt.configuredTypeReferences
		if (srcconftrs === null) return
		// TODO handle expansion in nested declarations
		val srcmappings = srccxt.allAssociations.filter[conn| conn.isSourceFeatureDelegation(conni)]
		if(srcmappings.size > 1){
			// need to make a copy of conni
			val last = srcmappings.last
			for (element : srcmappings) {
				var expconni = conni
				if (element !== last){
					// copy for all but last
					expconni = conni.copy
					// copy since they are bi-directional references
					expconni.source= conni.source
					expconni.destination = conni.destination
				}
				expconni.sourceDelegates += element
				expconni.source = srccxt.getInstanceElement(element.destination) 
				result += expconni
				expconni.expandSourceFeatureDelegates(result)
			}
		} else if (srcmappings.size == 1){
			val element = srcmappings.head
			conni.sourceDelegates += element
			conni.source = srccxt.getInstanceElement(element.delegationTarget) 
			if (!result.contains(conni)){
				result += conni
			}
			conni.expandSourceFeatureDelegates(result)
		} else {
			if (!result.contains(conni)){
				result += conni
			}
		}
	}
	
	def void expandDestinationFeatureDelegates(AssociationInstance conni, Collection<AssociationInstance> result){
		val dstcxt = conni.destination.containingComponentInstanceOrSelf
		val dstconftrs = dstcxt.configuredTypeReferences
		if (dstconftrs === null) return
		val dstmappings = dstcxt.allAssociations.filter[conn| conn.isDestinationFeatureDelegation(conni)]
		if(dstmappings.size > 1){
			// need to make a copy of conni
			val last = dstmappings.last
			for (element : dstmappings) {
				var expconni = conni
				if (element !== last ){
					// copy for all but last
					expconni = conni.copy
					// copy source and destination since they did not get copied due to bidirectional reference
					expconni.source = conni.source
					expconni.destination = conni.destination
				}
				expconni.destinationDelegates += element
				expconni.destination = dstcxt.getInstanceElement(element.delegationTarget) 
				result += expconni
				expconni.expandDestinationFeatureDelegates(result)
			}
		} else if (dstmappings.size == 1){
			val element = dstmappings.head
			conni.destinationDelegates += element
			conni.destination = dstcxt.getInstanceElement(element.delegationTarget) 
			if (!result.contains(conni)){
				result += conni
			}
			conni.expandDestinationFeatureDelegates(result)
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
		for (pa : ps.ownedPropertyAssociations){
			// local property assignment
			psi.addPropertyAssociationInstance(pa)
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
							val conni = findConnectionInstance(src,dst)
							if (conni !== null){
								psi.elements += conni
							}
						}
					}
					pe.processFlowSpec(psi,context)
 			} else if (flowelement instanceof Subcomponent){
				// find component instance
				val ci = context.getInstanceElement(pe)
				psi.elements += ci
 			} else if (flowelement instanceof Association && (flowelement as Association).isConnection){
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
 							psi.elements += (previousflowelementinstance as AssociationInstance).destination.containingComponentInstanceOrSelf
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
	
	def void processClassifierAssignmentPropertyAssociations(InstanceObject context, ClassifierAssignment ca){
		val target = context.getInstanceElement(ca.target)
		for (pa : ca.ownedPropertyAssociations){
			target.addPropertyAssociationInstance(pa)
		}
		for (subca : ca.classifierAssignments){
			target.processClassifierAssignmentPropertyAssociations(subca)
		}
	}
	
		
	// add property association instance
	// check if instance already exists.
	// If yes override its value if the existing association is not final
	// return false if the property association or its value was not added  
	def static void addPropertyAssociationInstance(InstanceObject context, PropertyAssociation pa){
		val target = context.getInstanceElement(pa.target)
		val pais = target.ownedPropertyAssociations
		var found = false
		for (epai : pais) {
			if (samePropertyDefinition(epai.property, pa.property)) {
				if (epai.value instanceof ECollection){
					epai.addValues(pa)
				} else {
					overridePropertyValue(epai, pa)
				}
				found = true
			}
		}
		if (!found && pa.propertyAssociationType !== PropertyAssociationType.DEFAULT_VALUE){
			pais += createPropertyAssociationInstance(pa)
		}
	}
	
	
	def static void addValues(PropertyAssociation epai, PropertyAssociation npa) {
		val values = epai.value as ECollection
		val newvalues = npa.value.copy as ECollection
		values.elements.addAll(newvalues.elements)
	}
	
	/**
	 * override existing property value with return value true indicating that is was overridden
	 * True if existing value is constant and new is override, existing value was default.
	 * False if existing final and new is not override, existing is default in implementation and new is in configuration, existing is override
	 * epai existing property association instance
	 * npa new property association
	 */
	def static void overridePropertyValue(PropertyAssociation epai, PropertyAssociation npa) {
		switch (epai.propertyAssociationType) {
			case PropertyAssociationType.FINAL_VALUE: {
				if (epai.propertyAssociation.eContainer instanceof Classifier) {
					val ecl = epai.propertyAssociation.eContainer as Classifier
					if (npa.eContainer instanceof Classifier) {
						val tcl = npa.eContainer as Classifier
						if (npa.target.modelElementReferenceReachDown) {
							// reachdown assignment to subcomponent (should be final)
							// in implementation vs configuration
							if (tcl.isSuperClassifierOf(ecl)) {
								if (npa.propertyAssociationType == PropertyAssociationType.FINAL_VALUE) {
									// earlier final value assignment
									epai.assignNewValue(npa)
								// WARNING
								} else {
									// WARNING DEFAULT or VARIABLE trying to override FINAL
								}
							} else if (ecl.isSuperClassifierOf(tcl)) {
								// WARNING FINAL, VARIABLE or DEFAULT trying to override FINAL
							} else {
								// ERROR independent classifiers
							}

						} else {
							// existing and new are assignment to component of classifier or model element other than subcomponent
							if (tcl.isSuperClassifierOf(ecl)) {
								if (npa.propertyAssociationType == PropertyAssociationType.FINAL_VALUE) {
									// earlier final value assignment
									epai.assignNewValue(npa)
								// WARNING
								} else {
									// WARNING DEFAULT or VARIABLE trying to override FINAL
								}
							} else if (ecl.isSuperClassifierOf(tcl)) {
								// WARNING FINAL, VARIABLE or DEFAULT trying to override FINAL
							} else {
								// ERROR independent classifiers
							}
						}
					} else {
						// existing one is in classifier and final
						// new one is not directly in classifier. Either local or CA -> ERROR
					}
				} else {
					// existing is not in classifier
					// if existing in configuration assignment
					if (epai.propertyAssociation.eContainer instanceof ClassifierAssignment) {
						if (!(npa.eContainer instanceof ClassifierAssignment)) {
							// if new in classifier or local then new value and ERROR
							epai.assignNewValue(npa)
						} else {
							// if new configuration assignment then ERROR (conflicting values)
						}
					} else {
						// existing is local assignment
						if (npa.eContainer instanceof Classifier &&
							npa.propertyAssociationType === PropertyAssociationType.FINAL_VALUE) {
							// if new classifier use new value if FINAL and ERROR
							epai.assignNewValue(npa)
						} else if (npa.eContainer instanceof ClassifierAssignment) {
							// ERROR local was already final
						} else {
							// npa is local ERROR should not have occurred
						}
					}
				}
			}
			case VARIABLE_VALUE: {
				if (npa.propertyAssociationType === PropertyAssociationType.DEFAULT_VALUE) {
					// ERROR should not assign default value
				} else {
					epai.assignNewValue(npa)
				// new in ca or in configuration WARNING it should not be VARIABLE
				}
			}
			case DEFAULT_VALUE: {
				// ERROR should not reassign to default value
			}
		}

	}
	
	def static void assignNewValue(PropertyAssociation epai, PropertyAssociation npa) {
		epai.value = npa.value.copy
		epai.propertyAssociation = npa
		epai.propertyAssociationType = npa.propertyAssociationType
	}
	
	def static void addDefaultPropertyValues(InstanceObject io, Iterable<PropertyDefinition> pds){
		for (pd : pds) {
			if (!io.hasPropertyAssociation(pd)){
				val defaultpa = findDefaultPropertyValue(io,pd)
				if (defaultpa !== null){
					addDefaultPropertyAssociationInstance(io, defaultpa)
				}
			}
		}
	}
	
	def static void addDefaultPropertyAssociationInstance(InstanceObject context, PropertyAssociation pa){
		val target = context.getInstanceElement(pa.target)
		val pais = target.ownedPropertyAssociations
		pais += createPropertyAssociationInstance(pa)
	}
	
	def static PropertyAssociation findDefaultPropertyValue(InstanceObject io, PropertyDefinition pd){
		var ci = io.containingComponentInstanceOrSelf
		while (ci !== null) {
			for (pa : ci.configuredTypeReferences.allPropertyAssociations) {
				if (pa.propertyAssociationType === PropertyAssociationType.DEFAULT_VALUE &&
					samePropertyDefinition(pd, pa.property) && appliesTo(pd,io)) {
					return pa
				}
			}
			ci = ci.eContainer as ComponentInstance
		}
		return null
	}
	
	def void instantiateStates(TypeDef stateType, ComponentInstance context){
		val enum = stateType.baseType
		if (enum instanceof EnumerationType){
			for (lit : enum.literals){
				context.states += createStateInstance(lit);
			}
		}
	}


	// Behavior Rules
	def void instantiateBehaviorRule(BehaviorRule br, ComponentInstance context) {
		val bri = br.createBehaviorRuleInstance
		if (br.condition !== null) {
			var behaviorCondition = br.condition.copy
			// now replace ConditionElements by respective instances
			val cos = EcoreUtil2.eAllOfType(behaviorCondition, ConditionOperation);
			for (co : cos) {
				val cio = co.createConstrainedInstanceObject(context, false)
				val container = co.eContainer
				if (container instanceof ECollection) {
					container.elements.remove(co)
					container.elements.add(cio)
				} else if (container === null) {
					// single condition element as condition
					behaviorCondition = cio
				}
			}
			// do the same for Generator references without types
			val mers = EcoreUtil2.eAllOfType(behaviorCondition, ModelElementReference);
			for (mer : mers) {
				val cio = mer.createConstrainedInstanceObject(context, false)
				val container = mer.eContainer
				if (container instanceof ECollection) {
					container.elements.remove(mer)
					container.elements.add(cio)
				} else if (container === null) {
					// single condition element as condition
					behaviorCondition = cio
				}
			}
			if (br.currentState !== null){
				bri.currentState = br.currentState.createConstrainedInstanceObject(context)
			}
			if (br.targetState !== null){
				bri.targetState = br.targetState.createConstrainedInstanceObject(context)
			}
			bri.condition = behaviorCondition
		}
		// now actions
		for (action : br.actions) {
			val tio = action.target.createConstrainedInstanceObject(context, true)
			if (action.value !== null) {
				tio.constraint = action.value.copy
			}
			bri.actions += tio
		}
		context.behaviorRules += bri
	}

	// Generator
	def void instantiateGenerator(Generator g, ComponentInstance context){
		val gi = g.createGeneratorInstance
			if (g.value !== null){
				gi.value = g.value.copy
			}
		context.generators += gi
	}


}
