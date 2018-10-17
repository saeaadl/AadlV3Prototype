package org.osate.aadlv3.util

import java.util.Collection
import java.util.Collections
import java.util.HashMap
import java.util.HashSet
import java.util.Stack
import org.eclipse.emf.ecore.EObject
import org.osate.aadlv3.aadlv3.Component
import org.osate.aadlv3.aadlv3.ComponentClassifier
import org.osate.aadlv3.aadlv3.ComponentConfiguration
import org.osate.aadlv3.aadlv3.ComponentImplementation
import org.osate.aadlv3.aadlv3.ComponentInterface
import org.osate.aadlv3.aadlv3.ConfigurationActual
import org.osate.aadlv3.aadlv3.ConfigurationAssignment
import org.osate.aadlv3.aadlv3.ConfigurationParameter
import org.osate.aadlv3.aadlv3.Feature
import org.osate.aadlv3.aadlv3.FeatureCategory
import org.osate.aadlv3.aadlv3.FeatureDirection
import org.osate.aadlv3.aadlv3.ModelElement
import org.osate.aadlv3.aadlv3.ModelElementReference
import org.osate.aadlv3.aadlv3.PrimitiveType
import org.osate.aadlv3.aadlv3.PropertyAssociation
import org.osate.aadlv3.aadlv3.Type
import org.osate.aadlv3.aadlv3.TypeReference

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import static extension org.eclipse.xtext.EcoreUtil2.*
import org.osate.aadlv3.aadlv3.PathSequence
import org.osate.aadlv3.aadlv3.ComponentCategory
import org.osate.aadlv3.aadlv3.AssociationType
import org.osate.aadlv3.aadlv3.Association
import org.osate.av3instance.av3instance.ComponentInstance
import org.osate.av3instance.av3instance.InstanceObject
import org.osate.av3instance.av3instance.FeatureInstance
import org.osate.av3instance.av3instance.Av3instanceFactory
import org.osate.av3instance.av3instance.PathInstance
import org.osate.av3instance.av3instance.AssociationInstance
import org.osate.av3instance.av3instance.PropertyAssociationInstance
import java.util.LinkedHashSet

import static extension org.osate.aadlv3.util.Av3API.*

class Aadlv3Util {
	
	static def String getFullName(ComponentClassifier cl){
		switch (cl){
			ComponentInterface: cl.name
			ComponentImplementation: cl.componentInterface.name+"."+cl.name
			ComponentConfiguration: cl.componentInterface.name+"."+cl.name
		}
	}
	
	static def ComponentCategory getComponentCategory(Iterable<? extends ComponentClassifier> classifiers){
		for (cl: classifiers){
			if (cl.category != ComponentCategory.COMPONENT){
				return cl.category
			}
		}
		ComponentCategory.COMPONENT;
	}
	
	static def ComponentCategory getComponentCategory( ComponentClassifier classifier){
		val classifiers = classifier.allComponentClassifiers
		for (cl: classifiers){
			if (cl.category != ComponentCategory.COMPONENT){
				return cl.category
			}
		}
		ComponentCategory.COMPONENT;
	}

	static def HashSet<ComponentClassifier> getAllComponentClassifiers(ComponentClassifier cc) {
		val result = new LinkedHashSet<ComponentClassifier>
		if(cc === null || cc.eIsProxy) return result
		if (cc instanceof ComponentClassifier) {
			result.add(cc)
		}
		cc.addSuperComponentClassifiers(result)
		val base = cc.getBaseInterface(result.componentCategory)
		if (base !== null) result += base
		return result
	}

	private static def void addSuperComponentClassifiers(ComponentClassifier cl, HashSet<ComponentClassifier> set) {
		if (cl instanceof ComponentImplementation){
			if (cl.superClassifiers.empty){
				if (cl.componentInterface !== null) {
					set.add(cl.componentInterface)
					addSuperComponentClassifiers(cl.componentInterface, set)
				}
			}
		}
		if(cl.superClassifiers.empty) return
		val supercls = cl.superClassifiers.map[scc|scc.type]
		supercls.forEach [ scl |
			if (scl instanceof ComponentClassifier){
				set.add(scl)
			}
		]
		supercls.forEach [ scl |
			if (scl instanceof ComponentClassifier){
				addSuperComponentClassifiers(scl, set)
			}
		]
	}

	static def Iterable<? extends ComponentInterface> getAllComponentInterfaces(ComponentClassifier cc) {
		if(cc === null || cc.eIsProxy) return Collections.EMPTY_LIST
		val result = new LinkedHashSet<ComponentInterface>
		val cif = switch cc {
			ComponentInterface: cc
			ComponentImplementation: cc.componentInterface
			ComponentConfiguration: cc.componentInterface
		}
		if (cif !== null){
			result.add(cif)
			cif.addSuperComponentInterfaces(result)
		}
		return result
	}

	private static def void addSuperComponentInterfaces(ComponentInterface cl,
		HashSet<ComponentInterface> set) {
		if(cl.superClassifiers.empty) return
		val supercls = cl.superClassifiers.map[scc|scc.type as ComponentInterface]
		supercls.forEach [ scl |
			if (scl !== null) set.add(scl)
		]
		supercls.forEach [ scl |
			if (scl !== null) addSuperComponentInterfaces(scl, set)
		]
	}

	static def Iterable<? extends ComponentImplementation> getAllComponentImplementations(ComponentClassifier cc) {
		if(cc === null || cc.eIsProxy) return Collections.EMPTY_LIST
		val result = new LinkedHashSet<ComponentImplementation>
		if (cc instanceof ComponentImplementation) {
			result.add(cc)
			cc.addSuperComponentImplementations(result)
		} else if (cc instanceof ComponentConfiguration){
			cc.addSuperComponentImplementations(result)
		}
		return result
	}

	private static def void addSuperComponentImplementations(ComponentClassifier cl,
		HashSet<ComponentImplementation> set) {
		if(cl.superClassifiers.empty) return
		val supercls = cl.superClassifiers.map[scc|scc.type as ComponentClassifier]
		supercls.forEach [ scl |
			if(scl instanceof ComponentImplementation) {
				set.add(scl)
			}
		]
		supercls.forEach [ scl |
			if(scl instanceof ComponentImplementation || scl instanceof ComponentConfiguration) {
				addSuperComponentImplementations(scl, set)
			}
		]
	}
	
	static def ComponentImplementation getTopComponentImplementation(ComponentClassifier cl){
		val impls = getAllComponentImplementations(cl)
		var top = impls.head
		for (impl : impls){
			if(impl instanceof ComponentImplementation){
				if (top.isSuperImplementationOf(impl)){
					top = impl
				}
			}
		}
		return top
	}
	
	static def ComponentImplementation getTopComponentImplementation(Iterable<? extends ComponentClassifier> cls){
		var ComponentImplementation top = null
		for (cl : cls){
			if (cl instanceof ComponentImplementation){
				if (top.isSuperImplementationOf(cl)){
					top = cl
				}
			}
		}
		return top
	}

	static def Iterable<? extends ComponentConfiguration> getAllComponentConfigurations(ComponentClassifier cc) {
		if(cc === null || cc.eIsProxy || !(cc instanceof ComponentConfiguration)) return Collections.EMPTY_LIST
		val result = new LinkedHashSet<ComponentConfiguration>
		result.add(cc as ComponentConfiguration)
		cc.addSuperComponentConfigurations(result)
		return result
	}

	static def Iterable<? extends ComponentConfiguration> getAllSuperComponentConfigurations(ComponentClassifier cc) {
		if(cc === null || cc.eIsProxy|| !(cc instanceof ComponentConfiguration)) return Collections.EMPTY_LIST
		val result = new LinkedHashSet<ComponentConfiguration>
		cc.addSuperComponentConfigurations(result)
		return result
	}

	private static def void addSuperComponentConfigurations(ComponentClassifier cl,
		HashSet<ComponentConfiguration> set) {
		if(cl.superClassifiers.empty) return
		val supercls = cl.superClassifiers.map[scc|scc.type]
		supercls.forEach [ scl |
			if(scl instanceof ComponentConfiguration) {
				set.add(scl);
			}
		]
		supercls.forEach [ scl |
			if(scl instanceof ComponentConfiguration) {
				addSuperComponentConfigurations(scl, set)
			}
		]
	}


	static def Iterable<? extends Association> getAllFlowSpecs(ComponentClassifier cc) {
		if(cc === null || cc.eIsProxy) return Collections.EMPTY_LIST
		val cls = cc.allComponentInterfaces
		return cls.map[cl|cl.flows].flatten
	}

	static def Iterable<? extends PathSequence> getAllPaths(ComponentClassifier cc) {
		if(cc === null || cc.eIsProxy) return Collections.EMPTY_LIST
		val cls = cc.allComponentImplementations
		return cls.map[cl|cl.paths].flatten
	}

	static def Iterable<? extends PathSequence> getAllFlowAssignments(ComponentClassifier cc) {
		if(cc === null || cc.eIsProxy) return Collections.EMPTY_LIST
		val cimpls =cc.allComponentImplementations
		if (cimpls.empty) return Collections.EMPTY_LIST
		return cimpls.map[cl|cl.flowAssignments].flatten
	}

	static def Iterable<? extends Feature> getAllClassifierFeatures(ComponentClassifier cc) {
		if(cc === null || cc.eIsProxy) return Collections.EMPTY_LIST
		val cls = cc.allComponentInterfaces
		return cls.map[cl|cl.features].flatten
	}

	static def Iterable<? extends Feature> getAllFeatures(Component comp) {
		val contents = comp.allContents
		return contents.filter[me|me instanceof Feature] as Iterable<? extends Feature>
	}

	static def boolean isReverseFeature(ComponentClassifier cc, Feature f) {
		if(cc === null || cc.eIsProxy) return false
		val cif = if (cc instanceof ComponentInterface) {
			cc
		} else if (cc instanceof ComponentImplementation){
			cc.componentInterface
		} else if (cc instanceof ComponentConfiguration){
			cc.componentInterface
		}
		if (cif.features.contains(f)){
			return false
		}
		val res = Aadlv3Util.isReverseFeature(cc,f, false)
		if (res === null) false else res.booleanValue
	}
	
	private static def Boolean isReverseFeature(ComponentClassifier cc, Feature f, boolean reverse){
		val superciftyperefs = cc.superClassifiers
		for (sciftr : superciftyperefs) {
			val typ = sciftr.type
			if(typ instanceof ComponentInterface){
				if (typ.features.contains(f)){
					val doreverse = if (reverse) !sciftr.reverse else sciftr.reverse
					return new Boolean(doreverse)
				}
			}
		}
		for (sciftr : superciftyperefs) {
			val typ = sciftr.type
			if(typ instanceof ComponentInterface){
				if (typ.features.contains(f)){
					val res = Aadlv3Util.isReverseFeature(typ,f,reverse)
					val doreverse = if (reverse) !res else res
					return new Boolean(doreverse)
				}
			}
		}
		null
	}
	
	static def FeatureDirection getRealFeatureDirection(ModelElementReference mer){
		val fea = mer.element
		if (fea instanceof Feature){
			val fd = fea.direction
			if (mer.context === null || !(mer.context.element instanceof Feature)){
				return fd
			}
			val cxtcl = (mer.context.element as Feature).type as ComponentClassifier
			var doReverse = isReverseFeature(cxtcl, fea)
			var pathelement = mer
			doReverse = if (doReverse) !fea.reverse else fea.reverse 
			while (pathelement.context !== null && pathelement.context.element instanceof Feature){
				pathelement = pathelement.context
				val nextfea = pathelement.element as Feature
				doReverse = if (doReverse) !nextfea.reverse else nextfea.reverse
			}
			return if (doReverse) reverseDirection(fd) else fd
		}
		FeatureDirection.NONE
	}

	static def Iterable<? extends Component> getAllComponents(ComponentClassifier cc) {
		if(cc === null || cc.eIsProxy) return Collections.EMPTY_LIST
		val cls = cc.allComponentImplementations
		val res = cls.map[cl|cl.components].flatten
		res
	}

	static def Iterable<? extends Association> getAllConnections(ComponentClassifier cc) {
		if(cc === null || cc.eIsProxy) return Collections.EMPTY_LIST
		val cls = cc.allComponentImplementations
		val res = cls.map[cl|cl.connections].flatten
		res
	}

	// return all configuration assignments including those of super configurations
	// Those from super configurations may get overridden if they are for the same target
	static def Iterable<ConfigurationAssignment> getAllConfigurationAssignments(ComponentConfiguration cc) {
		if(cc === null || cc.eIsProxy ) return Collections.EMPTY_LIST
		val cas = cc.assignments
		if (cc.superClassifiers.isEmpty) return cas
		val supercls = cc.allSuperComponentConfigurations
		val supercas = supercls.map[cl|cl.allOwnConfigurationAssignments.filter[superca|!cas.containsAdditionTarget(superca)]].flatten
		cas+supercas
	}


	// returns configuration assignments from all super configurations
	// if two super configurations contain the same configuration assignment target the first one is used
	static def Iterable<ConfigurationAssignment> getAllSuperConfigurationAssignments(ComponentConfiguration cc) {
		if(cc === null || cc.eIsProxy || cc.superClassifiers.isEmpty) return Collections.EMPTY_LIST
		val supercls = cc.allSuperComponentConfigurations
		if (supercls.empty) return Collections.EMPTY_LIST
		val firstcas = supercls.head.allOwnConfigurationAssignments
		if (supercls.tail.empty) return firstcas
		val supercas = supercls.tail.map[cl|cl.allOwnConfigurationAssignments.filter[superca|!firstcas.containsAdditionTarget(superca)]].flatten
		firstcas+supercas
	}

	
	// return configuration assignments defined in configuration including those down the hierarchy
	// out assignments override inner ones
	private static def Iterable<ConfigurationAssignment> getAllOwnConfigurationAssignments(ComponentConfiguration cc) {
		val cassignments = cc.assignments
		val nestedcas = cassignments.map[ca|ca.nestedConfigurationAssignments].flatten
		return cassignments+nestedcas.filter[nca|!cassignments.containsAdditionTarget(nca)]
	}
	
	// return configuration assignments that are contained in the specified configuration assignment
	private static def Iterable<ConfigurationAssignment> getNestedConfigurationAssignments(ConfigurationAssignment ca) {
		return ca.assignments+ca.assignments.map[subca| subca.fullTargetPath(ca.target)].map[subca|subca.nestedConfigurationAssignments].flatten.filter[nca|!ca.assignments.containsAdditionTarget(nca)]
	}
	
	// makes a copy of the configuration assignment with the target path expanded
	private static def ConfigurationAssignment fullTargetPath(ConfigurationAssignment ca, ModelElementReference contextpath){
		val fullca = ca.copy
		val newcontextpath = contextpath.copy
		val first = fullca.target.firstModelElementReference
		if (first !== null){
			first.context = newcontextpath
		} else {
			fullca.target = newcontextpath
		}
		return fullca
	}
	
	// the specified list contains a configuration assignment with the same target as the addition
	static def boolean containsAdditionTarget(Iterable<ConfigurationAssignment> primary, ConfigurationAssignment addition){
		for ( pca : primary){
			if (pca.target.isSamePath(addition.target)){
				return true
			}
		}
		return false
	}

	static def Iterable<? extends PropertyAssociation> getAllPropertyAssociations(ComponentClassifier cc) {
		if(cc === null || cc.eIsProxy) return Collections.EMPTY_LIST
		val cls = cc.allComponentClassifiers
		val clas = cls.map[cl|cl.propertyAssociations].flatten
		clas
	}

	// return configuration assignments defined in configuration including those down the hierarchy
	private static def Iterable<PropertyAssociation> getAllOwnPropertyAssociations(ComponentClassifier cc) {
		val propassignments = cc.propertyAssociations
		if (cc instanceof ComponentConfiguration){
			return propassignments+ cc.assignments.map[subca|subca.nestedPropertyAssociations].flatten.filter[subpa|!propassignments.containsAdditionTarget(subpa)]
		}
		return propassignments
	}
	
	// return property associations and any associations further down that are not overridden by the outer ones
	private static def Iterable<PropertyAssociation> getNestedPropertyAssociations(ConfigurationAssignment ca) {
		val pas = ca.propertyAssociations.map[pa| pa.fullTargetPath(ca.target)]
		return pas+ca.assignments.map[subca|subca.nestedPropertyAssociations].flatten.filter[subpa|!pas.containsAdditionTarget(subpa)]
	}
	
	
	private static def PropertyAssociation fullTargetPath(PropertyAssociation pa, ModelElementReference contextpath){
		val fullpa = pa.copy
		val newcontextpath = contextpath.copy
		val first = fullpa.target.firstModelElementReference
		if (first !== null){
			first.context = newcontextpath
		} else {
			fullpa.target = newcontextpath
		}
		return fullpa
	}
	
	static def boolean containsAdditionTarget(Iterable<PropertyAssociation> primary, PropertyAssociation addition){
		for ( pca : primary){
			if (pca.target.isSamePath(addition.target)){
				return true
			}
		}
		return false
	}


	static def boolean isParameterizedConfiguration(Type cc) {
		cc instanceof ComponentConfiguration && (cc as ComponentConfiguration).parameterized
	}

	// This method is used to determine the classifier used for determining the scope of model element references found inside a classifier
	// match is the target component to be matched by a configuration assignment of depth one 
	// we have added only one scope as references are resolved relative to the enclosing model element reference
	def static ComponentClassifier getConfiguredClassifier(Component match,
		Stack<Iterable<ConfigurationAssignment>> casscopes) {
		val ctype = match.typeReference?.type
		val n = casscopes.size
		// component has no type or 
		if(ctype === null || !(ctype instanceof ComponentClassifier) || ctype.isParameterizedConfiguration) return null
		// we have a component classifier
		var ccl = ctype as ComponentClassifier
		if(n == 0) return ccl
		// we have configuration assignment scopes, find a matching assignment and use its vlaue
		for (ca : casscopes.get(0)) {
			if (ca.target.element === match) {
				val actualClorP = ca.value?.type
				if (actualClorP instanceof ComponentClassifier) {
					if (ccl.isSuperClassifierOf(actualClorP)) {
						ccl = actualClorP
					}
				} else if (actualClorP instanceof ConfigurationParameter) {
					// it does not have an actual yet. 
					// Only if we interpret the classifier in the declaration we should find it
					// For that we go to the enclosing classifier of the configuration assignment
					// which we may need to pass in as parameter
				}
			}
		}
		return ccl
	}

	// this method is used to determine the type for instantiation as component instance
	// match is component in instance hierarchy with enclosing container a component rather than the original which may be the classifier
	// match can be a component or component instance
	// TODO currently returns the last match - inner to outer
	// TODO when we override we want to make sure it does not change the implementation
	def static TypeReference getConfiguredTypeReference(Component match,
		Stack<Iterable<ConfigurationAssignment>> casscopes, ComponentInstance context) {
		var ctyperef = match.typeReference
		if (ctyperef === null) return null
		val n = casscopes.size
		if(n===0 || ctyperef.type instanceof PrimitiveType) return ctyperef 
		// Also handle ConfigurationParameter
		// We work from inner to outer CA scope reaching in
		for (k : n - 1 .. 0) {
			for (ca : casscopes.get(k)) {
				if (ca.target.isSamePath(match, n - k, context)) {
					val actualClorP = ca.value?.type
					if (actualClorP instanceof ComponentClassifier) {
						val ccl = ctyperef.type as ComponentClassifier
						if (ccl.isSuperClassifierOf(actualClorP)) {
							ctyperef = ca.value
						}
					} else if (actualClorP instanceof ConfigurationParameter) {
						val ptyperef = actualClorP.resolveParameter(ca, context)
						if (ptyperef !== null && ctyperef.isSuperClassifierOf(ptyperef)) {
							ctyperef = ptyperef
						}
					}
				}
			}
		}
		return ctyperef
	}


	// find the actual value assigned in an argument. 
	// A parameter actual may be passed as parameter actual, thus, we need to recurse
	def static TypeReference resolveParameter(ConfigurationParameter par, ConfigurationAssignment ca, ComponentInstance context) {
		val cxtcomp = ca.getContainingComponentConfiguration
		var parent = context
		while (parent !== null&& !cxtcomp.isSuperClassifierOf(parent.configuredClassifier) ){
			parent = parent.eContainer as ComponentInstance
		}
		if (parent === null) return null
		val args = parent.actuals
		for (arg : args) {
			if (arg.parameter === par) {
				val ne = arg.value.type
				if (ne instanceof ComponentClassifier) {
					return arg.value
				} else if (ne instanceof ConfigurationParameter) {
					return arg.value //TODO ne.resolveParameter(parent)
				}
			}
		}
		return null
	}

	// get the arguments from the classifier reference or the first classifier being extended
	def static Collection<ConfigurationActual> getActuals(ComponentInstance c) {
		var clr = Aadlv3Util.configuredClassifierTypereferenceCache.get(c)
		if (clr === null) return Collections.EMPTY_LIST
		var cl = clr?.type as ComponentClassifier
		while (clr !== null && cl !== null && !cl.eIsProxy) {
			if (!clr.actuals.empty) {
				return clr.actuals
			}
			clr = cl.superClassifiers.head
		}
		Collections.EMPTY_LIST
	}

	// true of model element reference paths are the same, i.e., all referenced elements are the same
	def static boolean isSamePath(ModelElementReference mer1, ModelElementReference mer2) {
		var m1 = mer1
		var m2 = mer2
		while (m1?.element === m2.element){
			// the next elements up the path must match
			if (m1.context !== null && m2.context !== null){
				m1 = m1.context
				m2 = m2.context
			} else if (m1.context === null && m2.context === null){
				return true
			} else {
				return false
			}
		}
		return false
	}


	// depth indicates the target path length to be considered
	def static boolean isSamePath(ModelElementReference mer, ModelElement match, int depth, ComponentInstance context) {
		if(mer?.element.name != match.name) return false
		if(depth == 1) return true // we found a match
		if (context !== null) {
			// there is an enclosing element in the model
			if (mer.context !== null) {
				// more elements in the path
				return mer.context.isSamePath(context.component, depth - 1, context.eContainer as ComponentInstance)
			} else {
				// end of path in mer path; check to see if there is an enclosing configuration assignment
				val cxt = mer.modelElementReferenceContext?.eContainer
				if (cxt instanceof ConfigurationAssignment) {
					// look for enclosing configuration assignment
					return cxt.target.isSamePath(context.component, depth - 1,context.eContainer as ComponentInstance)
				}
			}
		}
		return false
	}

// methods used primarily by validator and scope provider
	static def Iterable<? extends ModelElement> getAllModelElements(Iterable<? extends ComponentClassifier> cls) {
		if(cls.empty) return Collections.EMPTY_LIST
		val res = cls.map[cl|cl.eContents.typeSelect(ModelElement)].flatten
		res
	}

	static def Iterable<? extends ModelElement> myContents(ComponentClassifier co) {
		co.eContents.typeSelect(ModelElement)
	}

	// handle component pointing to classifier
	static def Iterable<? extends ModelElement> getAllContents(Component co) {
		val ctype = co.typeReference?.type
		if (ctype instanceof ComponentClassifier){
			var cls = ctype.allComponentClassifiers
			val cat = cls.componentCategory
			if (co.category != cat){
				val base = co.getBaseInterface(cat)
				if (base !== null) cls += base
			}
			cls.allModelElements 
		} else {
			myContents(co)
		}
	}

	// model elements of the component - dealing with nested component declarations
	static def Iterable<? extends ModelElement> myContents(Component co) {
		co.eContents.typeSelect(ModelElement)
	}

	def static String getNamePath(InstanceObject elem, InstanceObject context) {
		var res = elem.name
		var pe = elem.eContainer as InstanceObject
		while( pe != context && pe !== null){
			res = pe.name + "." + res
			pe = pe.eContainer as InstanceObject
		}
		return res
	}

	def static boolean isInterfaceFeature(Feature f) {
		f.category == FeatureCategory.INTERFACE
	}

	def static boolean isDataAccessFeature(Feature f) {
		f.category == FeatureCategory.DATAACCESS
	}

	def static boolean isBusAccessFeature(Feature f) {
		f.category == FeatureCategory.BUSACCESS
	}

	def static boolean isBindingPoint(Feature f) {
		f.category == FeatureCategory.BINDINGPOINT
	}
	
	def static boolean isOutgoing(FeatureDirection fd){
		fd.outgoingPort || fd.outgoingFeature || fd.outgoingBusAccess|| fd.outgoingBinding || fd.outgoingDataAccess
	}
	
	def static boolean isOutgoingPort(FeatureDirection fd){
		fd == FeatureDirection.OUT || fd == FeatureDirection.INOUT 
	}
	
	def static boolean isOutgoingFeature(FeatureDirection fd){
		fd == FeatureDirection.OUT || fd == FeatureDirection.NONE 
	}
	
	def static boolean isOutgoingDataAccess(FeatureDirection fd){
		fd == FeatureDirection.PROVIDESREAD || fd == FeatureDirection.PROVIDESREADWRITE 
		|| fd == FeatureDirection.REQUIRESWRITE || fd == FeatureDirection.REQUIRESREADWRITE
	}
	
	def static boolean isOutgoingBusAccess(FeatureDirection fd){
		fd == FeatureDirection.REQUIRES
	}
	
	def static boolean isOutgoingBinding(FeatureDirection fd){
		fd == FeatureDirection.REQUIRES
	}
	
	def static boolean isIncoming(FeatureDirection fd){
		fd.incomingPort || fd.incomingFeature || fd.incomingBusAccess|| fd.incomingBinding || fd.incomingDataAccess 
	}
	
	def static boolean isIncomingPort(FeatureDirection fd){
		fd == FeatureDirection.IN || fd == FeatureDirection.INOUT 
	}
	
	def static boolean isIncomingFeature(FeatureDirection fd){
		fd == FeatureDirection.IN || fd == FeatureDirection.NONE 
	}
	
	def static boolean isIncomingDataAccess(FeatureDirection fd){
		fd == FeatureDirection.PROVIDESWRITE || fd == FeatureDirection.PROVIDESREADWRITE 
		|| fd == FeatureDirection.REQUIRESREAD || fd == FeatureDirection.REQUIRESREADWRITE
	}
	
	def static boolean isIncomingBusAccess(FeatureDirection fd){
		fd == FeatureDirection.PROVIDES
	}
	
	def static boolean isIncomingBinding(FeatureDirection fd){
		fd == FeatureDirection.PROVIDES
	}
	
	def static FeatureDirection reverseDirection(FeatureDirection fd){
		switch (fd){
			case FeatureDirection.IN: FeatureDirection.OUT
			case FeatureDirection.OUT: FeatureDirection.IN
			case FeatureDirection.PROVIDES: FeatureDirection.PROVIDES
			case FeatureDirection.REQUIRES: FeatureDirection.PROVIDES
			case FeatureDirection.PROVIDESREAD: FeatureDirection.REQUIRESREAD
			case FeatureDirection.REQUIRESREAD: FeatureDirection.PROVIDESREAD
			case FeatureDirection.PROVIDESWRITE: FeatureDirection.REQUIRESWRITE
			case FeatureDirection.REQUIRESWRITE: FeatureDirection.PROVIDESWRITE
			case FeatureDirection.PROVIDESREADWRITE: FeatureDirection.REQUIRESREADWRITE
			case FeatureDirection.REQUIRESREADWRITE: FeatureDirection.PROVIDESREADWRITE
			default: { fd
			}
		}
	}

	// superClassifer has to be a direct or indirect super classifier, or the same
	// handle the case that a component implementation or configuration also refers to an interface
	def static boolean isSuperClassifierOf(ComponentClassifier superClassifier, ComponentClassifier cl) {
		if( cl === null || superClassifier.eIsProxy || cl.eIsProxy) return false
		if (superClassifier === null || superClassifier === cl) return true
		val clinterface = if (cl instanceof ComponentImplementation){
			cl.componentInterface
		} else if (cl instanceof ComponentConfiguration){
			cl.componentInterface
		}
		if (clinterface !== null){
			if(clinterface == superClassifier) return true
			if(superClassifier.isSuperClassifierOf(clinterface)) return true
			
		}
		var superclrefs = cl.superClassifiers
		for (superclref : superclrefs) {
			val stype = superclref.type
			if (stype instanceof ComponentClassifier){
				if(stype == superClassifier) return true
				if(superClassifier.isSuperClassifierOf(stype)) return true
			}
		}
		false
	}

	// returns true if superClassifierref is a super classifier of clref, i.e., clref is extended from super, or an implementation, or a configuration
	def static boolean isSuperClassifierOf(TypeReference superClassifierref, TypeReference clref) {
		(superClassifierref.type as ComponentClassifier).isSuperClassifierOf(clref.type as ComponentClassifier)
	}


	// superImpl has to be a direct or indirect super implementation, or the same
	def static boolean isSuperImplementationOf(ComponentImplementation superImpl, ComponentImplementation impl) {
		if( impl === null || superImpl.eIsProxy || impl.eIsProxy) return false
		if (superImpl === null || superImpl === impl) return true
		var superclrefs = impl.superClassifiers
		for (superclref : superclrefs) {
			val stype = superclref.type
			if (stype instanceof ComponentImplementation){
				if(stype == superImpl) return true
				if(superImpl.isSuperClassifierOf(stype)) return true
			}
		}
		false
	}

	// returns the enclosing component classifier. For a component configuration as 'elem' it is returned
	def static ComponentClassifier getContainingComponentClassifier(EObject elem) {
		var cxt = elem
		while (cxt !== null && !(cxt instanceof ComponentClassifier)) {
			cxt = cxt.eContainer as EObject
		}
		return cxt as ComponentClassifier
	}

	// returns the enclosing component configuration. For a component configuration as 'elem' it is returned
	def static ComponentConfiguration getContainingComponentConfiguration(EObject elem) {
		var cxt = elem
		while (cxt !== null && !(cxt instanceof ComponentConfiguration)) {
			cxt = cxt.eContainer as EObject
		}
		return cxt as ComponentConfiguration
	}

	/** 
	 * two model elements are the same if their eClass and name are the same
	 * In addition for features the category, direction and type must match
	 * For components the category and type must match
	 */
	def static isSame(ModelElement e1, ModelElement e2) {
		if (e1.eClass == e2.eClass && e1.name == e2.name) {
			switch e1 {
				Feature: {
					val ee2 = e2 as Feature;
					return e1.category == ee2.category && e1.direction == ee2.direction && e1.type == ee2.type
				}
				Component: {
					val ee2 = e2 as Component;
					return e1.category == ee2.category && e1.typeReference?.type == ee2.typeReference?.type 
				}
			}
		}
		return false
	}

	
	// mapping maps an outgoing feature, i.e., a source
	def static boolean isOutgoingFeatureMapping(Association conn){
		if (conn.associationType == AssociationType.FEATUREMAPPING ){
			val el = conn.source.element
			if (el instanceof Feature){
				return el.direction.outgoing
			}
		}
		false
	}

	// mapping maps an incoming features, i.e., a destination
	def static boolean isIncomingFeatureMapping(Association conn){
		if (conn.associationType == AssociationType.FEATUREMAPPING ){
			val el = conn.source.element
			if (el instanceof Feature){
				return el.direction.incoming
			}
		}
		false
	}

	
	// source mapping takes into account element of feature group that matches one in the destination feature mappings
	def static boolean isSourceFeatureMapping(Association conn, AssociationInstance conni ){
		val srcfi = conni.source
		conn.associationType == AssociationType.FEATUREMAPPING &&
		(conn.source.element == srcfi.feature || srcfi.features.exists[subfi|subfi.feature == conn.source.element])
	}
	
	// destination mapping takes into account element of feature group that matches one in the source feature mappings
	def static boolean isDestinationFeatureMapping(Association conn, AssociationInstance conni){
		val dstfi = conni.destination
		val srcmappings = conni.sourceMappings
		conn.associationType == AssociationType.FEATUREMAPPING &&
		(conn.source.element == dstfi.feature || dstfi.features.
			exists[subfi|subfi.feature == conn.source.element && srcmappings.exists[srcconn|srcconn.source.element == conn.source.element]
			
		])
	}
	
	// association is connection 
	def static boolean isConnection(AssociationType connType){
		connType == AssociationType.FEATURECONNECTION || connType == AssociationType.PORTCONNECTION ||connType == AssociationType.DATACONNECTION 
		||connType == AssociationType.BUSCONNECTION  ||connType == AssociationType.INTERFACECONNECTION
	}

	// association is connection 
	def static boolean isConnection(Association assoc){
		val connType = assoc.associationType
		connType == AssociationType.FEATURECONNECTION || connType == AssociationType.PORTCONNECTION ||connType == AssociationType.DATACONNECTION 
		||connType == AssociationType.BUSCONNECTION  ||connType == AssociationType.INTERFACECONNECTION
	}
	
	// mapping from an outer to an inner feature
	def static boolean isFeatureMapping(Association conn){
		conn.associationType === AssociationType.FEATUREMAPPING
	}
	
	// mapping from an outer to an inner feature
	def static boolean isFeatureMapping(AssociationType connType){
		connType === AssociationType.FEATUREMAPPING
	}
	
	// association represents a flow specification
	def static boolean isFlowSpec(AssociationType connType){
		connType == AssociationType.FLOWPATH || connType == AssociationType.FLOWSOURCE ||connType == AssociationType.FLOWSINK 
	}
	// association represents a binding
	def static boolean isBinding(AssociationType connType){
		connType == AssociationType.BINDING 
	}

	
	// association represents a flow specification
	def static boolean isFlowSpec(Association conn){
		val connType = conn.associationType
		connType == AssociationType.FLOWPATH || connType == AssociationType.FLOWSOURCE ||connType == AssociationType.FLOWSINK 
	}
	
	//-------------------------
	// ModelElementReference methods
	//-------------------------

	// model element reference reaches into a component, i.e., the first path element refers to a component
	def static boolean isContainedComponentModelElementReference(ModelElementReference mer) {
		mer.getReferencedContainingComponent !== null
	}
	
	/**
	 * returns the closest component reference in the MER path
	 */
	def static Component getReferencedContainingComponent(ModelElementReference mer) {
		var first = mer
		while (first.context !== null) {
			first = first.context
			if (first.element instanceof Component){
				return first.element as Component
			}
		}
		null
	}

	// returns the EObject that contains the Model Element Reference
	def static EObject getModelElementReferenceContext(ModelElementReference mer) {
		var EObject cxt = mer
		while (cxt instanceof ModelElementReference) {
			cxt = cxt.eContainer
		}
		cxt
	}

	// returns the the Model Element Reference identifying the first element of the path
	// this is the MER without a context reference
	def static ModelElementReference getFirstModelElementReference(ModelElementReference mer) {
		if(mer === null) return null
		var ModelElementReference cxt = mer
		while (cxt.context !== null) {
			cxt = cxt.context
		}
		cxt
	}
	
	def static String getTargetPath(ModelElementReference mer){
		var res = mer.element.name
		var cxt = mer.context
		while( cxt !== null){
			res = cxt.element.name + "." + res
			cxt = cxt.context
		}
		return res
		
	}

	
	////////////////////////////////////
	// deal with predeclared base interfaces for different component categories
	///////////////////////////////////
	
	def static ComponentInterface getBaseInterface(EObject context, ComponentCategory cat){
		switch cat {
			case ComponentCategory.THREAD: {
				Av3API.lookupComponentClassifier(context,"BaseInterfaces.BaseThread") as ComponentInterface
				}
			case BUS: {
			}
			case COMPONENT: {
			}
			case DATA: {
			}
			case DEVICE: {
			}
			case MEMORY: {
			}
			case PROCESS: {
			}
			case PROCESSOR: {
				Av3API.lookupComponentClassifier(context,"BaseInterfaces.BaseProcessor") as ComponentInterface
			}
			case SUBPROGRAM: {
			}
			case SUBPROGRAMGROUP: {
			}
			case SYSTEM: {
			}
			case THREADGROUP: {
			}
			case VIRTUALBUS: {
			}
			case VIRTUALDEVICE: {
			}
			case VIRTUALMEMORY: {
			}
			case VIRTUALPROCESSOR: {
			}
		}
	}
	
	////////////////////////////////////////
	// Instance Model methods
	///////////////////////////////////////

	def static FeatureInstance createFeatureInstance(Feature f, boolean reverse) {
		val featurei = Av3instanceFactory.eINSTANCE.createFeatureInstance
		featurei.name = f.name
		featurei.direction = if (reverse) f.direction.reverseDirection else f.direction
		featurei.feature = f
		featurei.category = f.category
		featurei.sampled = f.sampled
		return featurei
	}

	def static PathInstance createPathSequenceInstance(PathSequence ps) {
		val psi = Av3instanceFactory.eINSTANCE.createPathInstance
		psi.name = ps.name
		psi.path = ps
		return psi
	}

	def static AssociationInstance createAssociationInstance(Association assoc) {
		val associ = Av3instanceFactory.eINSTANCE.createAssociationInstance
		associ.name = assoc.name
		associ.association = assoc
		associ.associationType = assoc.associationType
		return associ
	}

	def static ComponentInstance createComponentInstance(Component c, TypeReference configuredtype) {
		val compi = Av3instanceFactory.eINSTANCE.createComponentInstance
		compi.name = c.name
		compi.category = c.category
		compi.component = c
		if (configuredtype?.type instanceof ComponentClassifier){
			Aadlv3Util.configuredClassifierTypereferenceCache.put(compi, configuredtype.copy)
		}
		return compi
	}
	
	def static createPropertyAssociationInstance(PropertyAssociation pa){
		val pai = Av3instanceFactory.eINSTANCE.createPropertyAssociationInstance
		pai.property = pa.target.property
		pai.value = pa.value.copy
		return pai
	}

	static HashMap<ComponentInstance, TypeReference> configuredClassifierTypereferenceCache = new HashMap;
	
	def static void resetComponentInstanceCache(){
		configuredClassifierTypereferenceCache.clear
	}
	
	def static getConfiguredClassifier(ComponentInstance ci){
		configuredClassifierTypereferenceCache.get(ci)?.type as ComponentClassifier
	}
	
	def static getConfiguredTypeReference(ComponentInstance ci){
		configuredClassifierTypereferenceCache.get(ci)
	}
	
	/**
	 * get the instance object pointed to my model element reference using the instance object context as root of the path
	 */
	def static InstanceObject getInstanceElement(InstanceObject context, ModelElementReference mer){
		if (mer === null || mer.element === null) return context
		val cxt = if(mer.context !== null) getInstanceElement(context, mer.context) else context
		cxt.getInstanceElement(mer.element)
	}
	
	/**
	 * get the instance object representing the model element. It is directly contained in the context object
	 */
	def static InstanceObject getInstanceElement(InstanceObject context, ModelElement me){
		switch (context){
			ComponentInstance: {
				switch (me) {
					Component: {
						for (compi : context.subcomponents) {
							if (compi.component == me) return compi
						}
					}
					Feature: {
						for (fi : context.features) {
							if (fi.feature == me) return fi
						}
					}
					Association: {
						for (conni : context.connections) {
							if (conni.association == me) return conni
						}
						for (fsi : context.flowspecs) {
							if (fsi.association == me) return fsi
						}
					}
					PathSequence: {
						for (pi : context.paths) {
							if (pi.path == me) return pi
						}
					}
				}
			}
			FeatureInstance: {
				for (fi : context.features) {
					if (fi.feature == me) return fi
				}
			}
		}
		context
	}
	
	// return containing component instance 
	// for component instance as input return it
	def static containingComponentInstance(InstanceObject io){
		var res = io
		while (!(res instanceof ComponentInstance) && res.eContainer !== null){
			res = res.eContainer as InstanceObject
		}
		res as ComponentInstance
	}

	
	// add property association instance
	// check if instance already exists.
	// If yes override its value if the existing association is not final
	// return false if the property association or its value was not added  
	def static boolean addPropertyAssociationInstance(InstanceObject io, PropertyAssociationInstance pai){
		val pais = io.properties
		for (epai : pais){
			if (epai.property == pai.property){
				if (!epai.final){
					epai.value = pai.value
					return true
				} else {
					return false
				}
			}
		}
		pais += pai
		true
	}
	
		
	// association instance represents a flow specification
	def static boolean isFlowSpec(InstanceObject conn){
		if (conn instanceof AssociationInstance){
		   conn.association.associationType.isFlowSpec 
		} else false
	}

	// association instance represents a connection
	def static boolean isConnection(InstanceObject conn){
		if (conn instanceof AssociationInstance){
		   conn.associationType.isConnection 
		} else false
	}
	// association instance represents a connection
	def static boolean isBinding(InstanceObject conn){
		if (conn instanceof AssociationInstance){
		   conn.associationType == AssociationType.BINDING 
		} else false
	}
	
	def static AssociationInstance findFlowSpecInstance(FeatureInstance infi, FeatureInstance outfi){
		val ci = infi.containingComponentInstance
		for (fsi : ci.flowspecs){
			if (fsi.source === infi && fsi.destination === outfi){
				return fsi
			}
		}
		null
	}

	
	def static AssociationInstance findAssociationInstance(FeatureInstance srcfi, FeatureInstance dstfi){
		var ci = srcfi.containingComponentInstance
		while (ci !== null){
			for (conni : ci.connections){
				if (conni.source === srcfi && conni.destination === dstfi){
					return conni
				}
			}
			ci = ci.eContainer as ComponentInstance
		}
		null
	}

	def static String getInstanceObjectPath(InstanceObject io) {
		if (io.eContainer === null) {
			return io.getName();
		}
		val path = (io.eContainer as InstanceObject).getInstanceObjectPath();
		val localname = io.getName();

		return if (path.empty ) localname else path + "." + localname;
	}
	
	
}
