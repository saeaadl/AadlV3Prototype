package org.osate.aadlv3.util

import com.google.common.collect.HashMultimap
import com.google.common.collect.SetMultimap
import java.util.Collection
import java.util.Collections
import java.util.HashMap
import java.util.HashSet
import java.util.LinkedHashSet
import java.util.Stack
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.osate.aadlv3.aadlv3.Association
import org.osate.aadlv3.aadlv3.AssociationType
import org.osate.aadlv3.aadlv3.Component
import org.osate.aadlv3.aadlv3.ComponentCategory
import org.osate.aadlv3.aadlv3.ComponentClassifier
import org.osate.aadlv3.aadlv3.ComponentConfiguration
import org.osate.aadlv3.aadlv3.ComponentImplementation
import org.osate.aadlv3.aadlv3.ComponentInterface
import org.osate.aadlv3.aadlv3.ConfigurationActual
import org.osate.aadlv3.aadlv3.ClassifierAssignment
import org.osate.aadlv3.aadlv3.ClassifierAssignmentPattern
import org.osate.aadlv3.aadlv3.ConfigurationParameter
import org.osate.aadlv3.aadlv3.DataType
import org.osate.aadlv3.aadlv3.Feature
import org.osate.aadlv3.aadlv3.FeatureCategory
import org.osate.aadlv3.aadlv3.FeatureDirection
import org.osate.aadlv3.aadlv3.Import
import org.osate.aadlv3.aadlv3.ModelElement
import org.osate.aadlv3.aadlv3.ModelElementReference
import org.osate.aadlv3.aadlv3.PackageDeclaration
import org.osate.aadlv3.aadlv3.PathSequence
import org.osate.aadlv3.aadlv3.PropertyAssociation
import org.osate.aadlv3.aadlv3.PropertyDefinition
import org.osate.aadlv3.aadlv3.Type
import org.osate.aadlv3.aadlv3.TypeReference
import org.osate.aadlv3.aadlv3.Workingset
import org.osate.av3instance.av3instance.AssociationInstance
import org.osate.av3instance.av3instance.ComponentInstance
import org.osate.av3instance.av3instance.FeatureInstance
import org.osate.av3instance.av3instance.InstanceObject

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import static extension org.eclipse.xtext.EcoreUtil2.*
import static extension org.osate.aadlv3.util.Av3API.*
import org.osate.aadlv3.aadlv3.Aadlv3Factory
import org.eclipse.xtext.EcoreUtil2

class Aadlv3Util {
	/**
	 * return category of classifier collection. Returns first assigned category or ABSTRACT.
	 * Assumes All classifier categories are the same or ABSTRACT.
	 */
	static def ComponentCategory getComponentCategory(Iterable<? extends Type> types){
		for (t: types){
			var type = t
			if (t instanceof ConfigurationParameter){
				type = t.type
			}
			if (type instanceof DataType){
				
			} else if (type instanceof ComponentClassifier){
				if (type.category != ComponentCategory.INTERFACE){
					return type.category
				}
			} else {
				
			}
		}
		ComponentCategory.INTERFACE;
	}
	
	/**
	 * return category of classifier or its super classifiers. 
	 * Returns first assigned category or ABSTRACT.
	 * Assumes all categories are the same or ABSTRACT.
	 */
	static def ComponentCategory getComponentCategory( ComponentClassifier classifier){
		val classifiers = classifier.allComponentClassifiers
		for (cl: classifiers){
			if (cl.category != ComponentCategory.INTERFACE){
				return cl.category
			}
		}
		ComponentCategory.INTERFACE;
	}
	/**
	 * returns an ordered set of component classifier.
	 * The list consists of the classifiers as well as all  super classifiers referenced by trs.
	 * In addition, the BaseInterface classifier is added.
	 */
	static def Iterable<ComponentClassifier> getAllComponentClassifiers(Iterable<TypeReference> trs) {
		val result = new LinkedHashSet<ComponentClassifier>
		for (tr: trs){
			val t = tr.type
			switch (t){
				ComponentClassifier: {
					result.add(t)
					t.addSuperComponentClassifiers(result)
					val base = t.getBaseInterface(result.componentCategory)
					if (base !== null) result += base
				}
				DataType: {
				}
				ConfigurationParameter: {
				}
			}
		}
		return result
	}

	/**
	 * returns an ordered set of component classifier.
	 * The list consists of the classifier cc as well as all its super classifiers.
	 * In addition, the BaseInterface classifier is added.
	 */
	static def Iterable<ComponentClassifier> getAllComponentClassifiers(ComponentClassifier cc) {
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

	/**
	 * returns an ordered set of component classifier.
	 * The list consists of all its super classifiers.
	 * In addition, the BaseInterface classifier is added.
	 */
	static def Iterable<ComponentClassifier> getAllSuperComponentClassifiers(ComponentClassifier cc) {
		val result = new LinkedHashSet<ComponentClassifier>
		if(cc === null || cc.eIsProxy) return result
		cc.addSuperComponentClassifiers(result)
		val base = cc.getBaseInterface(result.componentCategory)
		if (base !== null) result += base
		return result
	}

	/**
	 * Add all super classifiers of a given classifier to the set.
	 * First add the interface and its super interfaces
	 * then add direct super implementations/configurations
	 * finally add their super classifiers
	 */
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



	
	/**
	 * returns implementation that is the extension of all other implementations
	 */
	static def DataType getTopDataType(Iterable<TypeReference> trs){
		var DataType top = null
		for (tr : trs){
			if (tr.type instanceof DataType){
				val cl = tr.type as DataType
				if (top === null || top.isSuperDataTypeOf(cl)){
					top = cl
				}
			}
		}
		return top
	}
	
	static def boolean isDataType(Iterable<TypeReference> trs){
		for (tr : trs){
			if (tr.type instanceof DataType){
				return true
			}
		}
		return false
	}
	
	static def boolean isComponentClassifier(Iterable<TypeReference> trs){
		if (trs.empty) return true
		for (tr : trs){
			if (tr.type instanceof DataType){
				return false
			}
		}
		return true
	}

	/**
	 * returns the top implementation of the set of type references
	 */
	static def ComponentImplementation getComponentImplementation(Iterable<TypeReference> trs){
		for (tr : trs){
			if (tr.type instanceof ComponentImplementation){
				return tr.type as ComponentImplementation
			}
		}
		return null
	}
	
	
	/**
	 * returns the trs of explicitly assigned implementations
	 */
	static def Iterable<TypeReference> getComponentImplementationTrs(Iterable<TypeReference> trs){
		return  trs.filter[tr|tr.type instanceof ComponentImplementation]
	}
	
	/**
	 * returns the trs of explicitly assigned configurations
	 */
	static def Iterable<TypeReference> getComponentConfigurationTrs(Iterable<TypeReference> trs){
		return  trs.filter[tr|tr.type instanceof ComponentConfiguration]
	}
	
	/**
	 * returns the trs of subcomponent classifier
	 */
	static def Iterable<TypeReference> getSubcomponentClassifierTrs(Iterable<TypeReference> trs){
		return  trs.filter[tr|tr.eContainer instanceof Component]
	}
	
	/**
	 * returns the top implementation of the set of type references
	 */
	static def ComponentImplementation getTopComponentImplementation(Iterable<TypeReference> trs){
		var ComponentImplementation top = null
		for (tr : trs){
			if (tr.type instanceof ComponentClassifier){
				val cl = tr.type.getTopComponentImplementation
				if (top === null || top.isSuperImplementationOf(cl)){
					top = cl
				}
			}
		}
		return top
	}
	
	/**
	 * returns the top implementation of a classifier and its ancestor classifiers
	 */
	static def ComponentImplementation getTopComponentImplementation(Type cl){
		var ComponentImplementation top = null
		if (cl instanceof ComponentClassifier){
		val cls = cl.allComponentClassifiers
		for (scl : cls){
			if (scl instanceof ComponentImplementation){
				if (top === null || top.isSuperImplementationOf(scl)){
					top = scl
				}
			}
		}
		}
		return top
	}
	
	
	
	/**
	 * returns interface that is the extension of all other interfaces
	 */
	static def ComponentInterface getTopComponentInterface(Iterable<TypeReference> trs){
		var ComponentInterface top = null
		for (tr : trs){
			if (tr.type instanceof ComponentClassifier){
				val cif = getComponentInterface(tr.type as ComponentClassifier)
				if (top === null || top.isSuperInterfaceOf(cif)){
					top = cif
				}
			}
		}
		return top
	}
	/**
	 * returns implementation or interface that is the extension of all other implementations or interfaces
	 */
	static def ComponentClassifier getTopComponentInterfaceOrImplementation(Iterable<TypeReference> trs){
		val res = trs.topComponentImplementation
		if (res !== null) return res
		return trs.topComponentInterface
	}

	/**
	 * return set of component configurations of a given classifier in its extend hierarchy
	 */
	static def Iterable<ComponentConfiguration> getAllComponentConfigurations(ComponentClassifier cc) {
		if(cc === null || cc.eIsProxy || !(cc instanceof ComponentConfiguration)) return Collections.EMPTY_LIST
		val result = new LinkedHashSet<ComponentConfiguration>
		result.add(cc as ComponentConfiguration)
		cc.addSuperComponentConfigurations(result)
		return result
	}

	/**
	 * return set of all super configurations of a given classifier in its extend hierarchy
	 */
	static def Iterable<ComponentConfiguration> getAllSuperComponentConfigurations(ComponentClassifier cc) {
		if(cc === null || cc.eIsProxy|| !(cc instanceof ComponentConfiguration)) return Collections.EMPTY_LIST
		val result = new LinkedHashSet<ComponentConfiguration>
		cc.addSuperComponentConfigurations(result)
		return result
	}

	/**
	 * add super configurations to set
	 */
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


	/**
	 * return collection of flow specs for given classifier
	 * TODO check whether the same flow spec is added more than once
	 */
	static def Iterable<Association> getAllFlowSpecs(ComponentInstance ci) {
		val conftrs = ci.configuredTypeReferences
		if (conftrs.empty){
			// flow specs in nested declaration
			return Collections.EMPTY_LIST //ci.component.flows
		} else {
			// flow specs from classifier
			val cls = conftrs.allComponentClassifiers
			return cls.map[cl|cl.eContents.typeSelect(Association)].flatten.filter[a| a.isFlowSpec]
		}
	}

	/**
	 * return collection of end to end flows for given classifier
	 * TODO check whether the same flow path is added more than once
	 */
	static def Iterable<PathSequence> getAllPaths(ComponentInstance ci) {
		val conftrs = ci.configuredTypeReferences
		if (conftrs.empty){
			// flow paths in nested declaration
			return Collections.EMPTY_LIST //ci.component.paths
		} else {
			// flow paths from classifier
			val cls = conftrs.allComponentClassifiers
			return cls.map[cl|cl.eContents.typeSelect(PathSequence)].flatten.filter[ps|ps.isEndToEndFlow]
		}
	}

	/**
	 * return collection of flow assignments for given classifier
	 * TODO check whether the same flow assignment is added more than once
	 */
	static def Iterable<PathSequence> getAllFlowAssignments(ComponentInstance ci) {
		val conftrs = ci.configuredTypeReferences
		if (conftrs.empty){
			// flow implementation in nested declaration
			return Collections.EMPTY_LIST //ci.component.flowassignments
		} else {
			// flow implementation from classifier
			val cls = conftrs.allComponentClassifiers
			return cls.map[cl|cl.eContents.typeSelect(PathSequence)].flatten.filter[ps|ps.isFlowAssignment]
		}
	}


	/**
	 * return collection of features of a component.
	 * These are features declared as part of the classifier or as part of the nested declaration
	 */
	static def Iterable<Feature> getAllFeatures(ComponentInstance ci) {
		val conftrs = ci.configuredTypeReferences
		if (conftrs.empty){
			// features in nested declaration
			return ci.component.features
		} else {
			return conftrs.allFeatures+ci.component.features
		}
	}
	static def Iterable<Feature> getAllFeatures(FeatureInstance fi) {
		val fcl = fi.feature?.typeReference?.type
		if (fcl instanceof ComponentInterface){
			return fcl.allFeatures
		}
	}
	static def Iterable<Feature> getAllFeatures(Iterable<TypeReference> trs) {
		// features from classifier
		val cls = trs.allComponentClassifiers
		return cls.filter[ccl|ccl instanceof ComponentInterface].map[cif|cif.eContents.typeSelect(Feature)].flatten
	}
	static def Iterable<Feature> getAllFeatures(ComponentClassifier cl) {
		// features from classifier
		val cls = cl.allComponentClassifiers
		return cls.filter[ccl|ccl instanceof ComponentInterface].map[cif|cif.eContents.typeSelect(Feature)].flatten
	}
	
	static def boolean contains(Iterable <Feature> feas, Feature f){
		for (fea : feas){
			if (fea === f) return true
		}
		return false
	}

	static def boolean isReverseFeature(Iterable <TypeReference> trs, Feature f) {
		if(trs.empty) return false
		val features = trs.allFeatures
		if (features.contains(f)){
			return false
		}
		Aadlv3Util.isReverseFeature(features,f, false)
	}
	
	static def boolean isReverseFeature(Iterable<Feature> features, Feature f, boolean reverse){
		for (fea : features) {
			val typ = fea?.typeReference?.type
			if(typ instanceof ComponentInterface){
				if (typ.features.contains(f)){
					val doreverse = if (reverse) !fea?.typeReference?.reverse else fea?.typeReference?.reverse
					return doreverse
				}
			}
		}
		for (fea : features) {
			val typ = fea?.typeReference?.type
			if (typ instanceof ComponentInterface) {
				val res = Aadlv3Util.isReverseFeature(typ.features, f, reverse)
				val doreverse = if(reverse) !res else res
				return doreverse
			}
		}
		false
	}
	
	static def FeatureDirection getRealFeatureDirection(ModelElementReference mer){
		val fea = mer.element
		if (fea instanceof Feature){
			val fd = fea.direction
			if (mer.context === null || !(mer.context.element instanceof Feature)){
				return fd
			}
			val cxtcl = (mer.context.element as Feature)?.typeReference?.type
			if (cxtcl instanceof ComponentClassifier){
				var doReverse = isReverseFeature(cxtcl.allFeatures, fea, false)
				var pathelement = mer
				doReverse = if (doReverse) !fea?.typeReference?.reverse else fea?.typeReference?.reverse 
				while (pathelement.context !== null && pathelement.context.element instanceof Feature){
					pathelement = pathelement.context
					val nextfea = pathelement.element as Feature
					doReverse = if (doReverse) !nextfea?.typeReference?.reverse else nextfea?.typeReference?.reverse
				}
				return if (doReverse) reverseDirection(fd) else fd
			}
		}
		FeatureDirection.NONE
	}

	/**
	 * return collection of sub-components of a component.
	 * These are sub-components declared as part of the classifier or as part of the nested declaration
	 */
	static def Iterable<Component> getAllSubcomponents(ComponentInstance ci) {
		val conftrs = ci.configuredTypeReferences
		if (conftrs.empty){
			// subcomponents in nested declaration
			return ci.component.components
		} else {
			// subcomponents from classifier
			val cls = conftrs.allComponentClassifiers
			return cls.map[cl|cl.eContents.typeSelect(Component)].flatten
		}
	}

	static def Iterable<Component> getAllSubcomponents(ComponentClassifier cl) {
		// features from classifier
		val cls = cl.allComponentClassifiers
		return cls.filter[ccl|ccl instanceof ComponentImplementation].map[cif|cif.eContents.typeSelect(Component)].flatten
	}
	
	static def Iterable<Component> getAllSubcomponents(Iterable<TypeReference> trs, Component component) {
		if (trs.empty){
			// subcomponents in nested declaration
			if (component === null){
				return Collections.EMPTY_LIST
			}
			return component.components
		} else {
			// subcomponents from classifier
			val cls = trs.allComponentClassifiers
			return cls.map[cl|cl.eContents.typeSelect(Component)].flatten
		}
	}

	/**
	 * return collection of associations of a component instance.
	 * These are associations declared as part of the classifier or as part of the nested declaration
	 */
	static def Iterable<Association> getAllAssociations(ComponentInstance ci) {
		val conftrs = ci.configuredTypeReferences
		if (conftrs.empty){
			// connections in nested declaration
			return ci.component.connections
		} else {
			val cls = conftrs.allComponentClassifiers
			return cls.map[cl|cl.eContents.typeSelect(Association)].flatten
		}
	}

	
	// return all configuration assignments and nested CAs including those of super configurations 
	static def Iterable<ClassifierAssignment> getAllClassifierAssignments(Iterable<TypeReference> trs) {
		if(trs.empty) return Collections.EMPTY_LIST
		val cls = trs.allComponentClassifiers
		if (cls.empty) return Collections.EMPTY_LIST
		cls.map[cl|cl.getAllGivenClassifierClassifierAssignments].flatten
	}

	
	// return all configuration assignments and nested CAs including those of super configurations 
	static def Iterable<ClassifierAssignment> getAllClassifierAssignments(ComponentClassifier ccl) {
		if(ccl === null || ccl.eIsProxy) return Collections.EMPTY_LIST
		val cls = ccl.allComponentClassifiers
		if (cls.empty) return Collections.EMPTY_LIST
		cls.map[cl|cl.getAllGivenClassifierClassifierAssignments].flatten
	}

	// returns all configuration assignments for given classifier including nested configuration assignments
	// does not process super classifiers
	static def Iterable<ClassifierAssignment> getAllGivenClassifierClassifierAssignments(ComponentClassifier cl) {
		if(cl === null || cl.eIsProxy) return Collections.EMPTY_LIST
		val Iterable<ClassifierAssignment> cas = EcoreUtil2.getAllContentsOfType(cl, ClassifierAssignment)
		cas
	}

	// returns configuration assignments from all super configurations
	static def Iterable<ClassifierAssignment> getAllSuperClassifierAssignments(ComponentClassifier cc) {
		if(cc === null || cc.eIsProxy || cc.superClassifiers.isEmpty) return Collections.EMPTY_LIST
		val supercls = cc.allSuperComponentClassifiers
		if (supercls.empty) return Collections.EMPTY_LIST
		 supercls.map[cl|cl.getAllGivenClassifierClassifierAssignments].flatten
	}
	

	static def Iterable<PropertyAssociation> getAllOwnedPropertyAssociations(Iterable<TypeReference> trs) {
		if(trs.empty) return Collections.EMPTY_LIST
		val cls = trs.allComponentClassifiers
		cls.map[cl|cl.propertyAssociations].flatten
	}

	static def Iterable<PropertyAssociation> getAllCAPropertyAssociations(Iterable<TypeReference> trs) {
		if(trs.empty) return Collections.EMPTY_LIST
		val cas = trs.allClassifierAssignments
		cas.map[ca|ca.propertyAssociations].flatten
	}

	static def Iterable<PropertyAssociation> getAllOwnedPropertyAssociations(ComponentClassifier cl) {
		val cls = cl.allComponentClassifiers
		cls.map[cll|cll.propertyAssociations].flatten
	}

	static def Iterable<PropertyAssociation> getAllCAPropertyAssociations(ComponentClassifier cl) {
		val cas = cl.allClassifierAssignments
		cas.map[ca|ca.propertyAssociations].flatten
	}

	static def Iterable<PropertyAssociation> getAllPropertyAssociations(Iterable<TypeReference> trs) {
		if(trs.empty) return Collections.EMPTY_LIST
		val cls = trs.allComponentClassifiers
		cls.map[cl|cl.getAllGivenClassifierPropertyAssociations].flatten
	}

	static def Iterable<PropertyAssociation> getAllPropertyAssociations(ComponentClassifier cl) {
		val cls = cl.allComponentClassifiers
		cls.map[cll|cll.getAllGivenClassifierPropertyAssociations].flatten
	}
	
	// returns all PAs for given classifier including those in CAs and nested subcomponents
	// does not process super classifiers
	static def Iterable<PropertyAssociation> getAllGivenClassifierPropertyAssociations(ComponentClassifier cl) {
		if(cl === null || cl.eIsProxy) return Collections.EMPTY_LIST
		EcoreUtil2.getAllContentsOfType(cl, PropertyAssociation)
	}
	

	static def boolean isParameterizedConfiguration(Type cc) {
		cc instanceof ComponentConfiguration && (cc as ComponentConfiguration).parameterized
	}

	// This method is used to determine the classifier used for determining the scope of model element references found inside a classifier
	// match is the target component to be matched by a configuration assignment of depth one 
	// we have added only one scope as references are resolved relative to the enclosing model element reference
	def static Iterable<TypeReference> getConfiguredTypeReferences(Component match,
		Stack<Iterable<ClassifierAssignment>> casscopes) {
		val ctyperefs = match.typeReferences
		val n = casscopes.size
		// component has no type or 
		if(ctyperefs.empty ) return ctyperefs
		// we have a component classifier
		if(n == 0) return ctyperefs
		// we have configuration assignment scopes, find a matching assignment and use its value
		var res = ctyperefs as Iterable<TypeReference>
		for (typeref : ctyperefs) {
			for (ca : casscopes.get(0)) {
				if (ca.target?.element === match) {
					val trscl = ca.assignedClassifiers.filter[tr|tr.type instanceof ComponentClassifier ]
					res = res + trscl
				}
			}
		}
		return res
	}

	// this method is used to determine the type for instantiation as component instance
	// match is component in instance hierarchy with enclosing container a component rather than the original which may be the classifier
	// match can be a component or component instance
	// TODO when we override we want to make sure it does not change the implementation
	def static Iterable<TypeReference> getConfiguredTypeReferences(Component match,
		Stack<Iterable<ClassifierAssignment>> casscopes, ComponentInstance context) {
		val mtyperefs = match.typeReferences
		if (mtyperefs.empty) {
			return Collections.EMPTY_LIST
			// TODO error message if ca tries to assign
			}
		val EList<TypeReference> ctyperefs = new BasicEList<TypeReference>()
		ctyperefs.addAll(mtyperefs)
		val n = casscopes.size
		if(n===0 ) return ctyperefs 
		// Also handle ConfigurationParameter
		// We work from inner to outer CA scope reaching in
		for (k : n - 1 .. 0) {
			for (ca : casscopes.get(k)) {
				if (ca.matchesTarget(match, n - k, context)) {
					val atrs = ca.assignedClassifiers
					for (atr : atrs) {
						val actualClorP = atr.type
						if (actualClorP instanceof ComponentClassifier) {
							ctyperefs.add(atr)
						} else if (actualClorP instanceof ConfigurationParameter) {
							actualClorP.resolveParameter(ca.containingComponentConfiguration, context,ctyperefs)
						}
					}
				}
			}
		}
		return ctyperefs
	}


	// find the actual value assigned in an argument. 
	// A parameter actual may be passed as parameter actual, thus, we need to recurse
	def static void resolveParameter(ConfigurationParameter par, ComponentConfiguration cxtconfig, ComponentInstance context,Collection<TypeReference> ctyperefs) {
		var parent = context
		var TypeReference found = null
		while (parent !== null&& found===null) {
			for (tr : parent.configuredTypeReferences){
				val t = tr.type
				if (t instanceof ComponentClassifier){
					if (cxtconfig.isSuperClassifierOf(t)){
						found = tr
					}
				}
				
			}
			parent = parent.eContainer as ComponentInstance
		}
		if ( found === null) return 
		val args = found.allActuals
		for (arg : args) {
			if (arg.parameter === par) {
				for (tr: arg.assignedClassifiers){
					val actualClorP = tr.type
						if (actualClorP instanceof ComponentClassifier) {
							ctyperefs.add(tr)
						} else if (actualClorP instanceof ConfigurationParameter) {
							actualClorP.resolveParameter(arg.containingComponentConfiguration, parent,ctyperefs)
						}
				}
			}
		}
		return 
	}

	// get the arguments from the classifier reference or the first classifier being extended
	// TODO handle configurations with partially bound parameters
	def static Collection<ConfigurationActual> getAllActuals(TypeReference tr) {
		if(!tr.actuals.empty) return tr.actuals
		val cl = tr.type as ComponentClassifier
		for (clr : cl.superClassifiers) {
			if (!clr.eIsProxy) {
				val act = clr.actuals
				if (!act.empty) {
					return act
				}
			}
		}
		Collections.EMPTY_LIST
	}



	// depth indicates the target path length to be considered
	def static boolean matchesTarget(ClassifierAssignment ca, ModelElement match, int depth, ComponentInstance context) {
		if (ca instanceof ClassifierAssignmentPattern){
			return ca.matchesTargetPattern(match)
		} else {
			return ca.target.matchesTarget(match, depth, context)
		}
	}

	// depth indicates the target path length to be considered
	private def static boolean matchesTarget(ModelElementReference mer, ModelElement match, int depth, ComponentInstance context) {
		if(mer === null || mer?.element.name != match.name) return false
		if(depth == 1) return true // we found a match
		if (context !== null) {
			// there is an enclosing element in the model
			if (mer.context !== null) {
				// more elements in the path
				return mer.context.matchesTarget(context.component, depth - 1, context.eContainer as ComponentInstance)
			} else {
				// end of path in mer path; check to see if there is an enclosing configuration assignment
				val cxt = mer.modelElementReferenceContext?.eContainer
				if (cxt instanceof ClassifierAssignment) {
					// look for enclosing configuration assignment
					return cxt.target.matchesTarget(context.component, depth - 1,context.eContainer as ComponentInstance)
				}
			}
		}
		return false
	}

	// depth indicates the target path length to be considered
	private def static boolean matchesTargetPattern(ClassifierAssignment pat, ModelElement match) {
		if (pat instanceof ClassifierAssignmentPattern){
			val patternType = pat.targetPattern
			if (match instanceof Component){
				return patternType.isSuperTypeOf(match.typeReferences)
			} else if (match instanceof Feature){
				return patternType.isSuperTypeOf(match?.typeReference?.type)
			}
		}
		return false
	}
	
	/**
	 * collect all configuration assignments to all (recursive and nested) subcomponents for a given classifier's implementation.
	 * recursively handles configuration assignments contained in assigned configurations
	 */
	def static SetMultimap <String, TypeReference> cacheClassifierAssignments(ComponentClassifier cl) {
		val SetMultimap <String, TypeReference> map = HashMultimap.create();
		cl.processClassifierAssignments(map,"")
		// recurse on subcomponents to process their assigned configuration
		val subs = cl.getAllSubcomponents
		for (sub : subs) {
			sub.processSubcomponentClassifierAssignments(map, sub.name)
		}
		return map
	}
		
	/**
	 * add all configuration assignments of collection of type references and declared classifiers of assignment targets into cache
	 */
	def static void processSubcomponentClassifierAssignments(Component sub, SetMultimap<String, TypeReference> cache, String targetpath) {
		val Iterable<TypeReference> subtrs = sub.typeReferences + cache.get(targetpath)
		val cls = subtrs.allComponentClassifiers
		for (cl : cls){
			cl.processClassifierAssignments(cache,targetpath)
		}
		val subsubs = subtrs.getAllSubcomponents(sub)
		for (subsub : subsubs){
			subsub.processSubcomponentClassifierAssignments(cache,targetpath+"."+subsub.name)
		}
	}
		
	/**
	 * add all configuration assignments of classifier cl and declared classifiers of assignment targets into cache
	 */
	def static void processClassifierAssignments(ComponentClassifier cl, SetMultimap<String, TypeReference> cache, String targetpathprefix) {
		val cas = cl.allClassifierAssignments
		for (ca : cas){
			val targetcomp = ca.target?.element
			if (targetcomp instanceof Component){
				val targettrs = targetcomp.typeReferences
				val fulltrs = targettrs+ca.assignedClassifiers
				// put in multi map
				val fulltargetpath = if (targetpathprefix.empty)ca.targetPath else targetpathprefix+"."+ca.targetPath
				cache.putAll(fulltargetpath,fulltrs)
			}
		}
	}
	

// methods used primarily by validator and scope provider
	
	static def Iterable<ModelElement> getAllModelElements(ComponentClassifier cl) {
		if(cl === null) return Collections.EMPTY_LIST
		cl.allComponentClassifiers.map[cif|cif.eContents.typeSelect(ModelElement)].flatten
	}

	static def Iterable<ModelElement> getAllModelElements(Iterable<TypeReference> trs) {
		trs.allComponentClassifiers.map[cif|cif.eContents.typeSelect(ModelElement)].flatten
	}


	/**
	 * return collection of model elements of a component.
	 * These are model elements declared as part of the classifier or as part of the nested declaration
	 */
	static def Iterable<ModelElement> getAllModelElements(Component comp) {
		if (comp.typeReferences.empty || comp.typeReferences.isDataType){
			// model elements in nested declaration
			return comp.eContents.typeSelect(ModelElement)
		} else {
			return getAllModelElements(comp.typeReferences)
		}
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
		f.category == FeatureCategory.BINDING
	}
	
	def static boolean categoriesMatch(ComponentCategory ccat, FeatureCategory fcat){
		return (ccat === ComponentCategory.DATA && fcat === FeatureCategory.DATAACCESS)
		|| (ccat === ComponentCategory.BUS && fcat === FeatureCategory.BUSACCESS)
		|| (ccat === ComponentCategory.VIRTUALBUS && fcat === FeatureCategory.VIRTUALBUSACCESS)
		|| (ccat === ComponentCategory.SUBPROGRAM && fcat === FeatureCategory.SUBPROGRAMACCESS)
		|| (ccat === ComponentCategory.SUBPROGRAMGROUP && fcat === FeatureCategory.SUBPROGRAMGROUPACCESS)
	}
	
	def static boolean isBiDirectional(FeatureDirection fd){
		fd == FeatureDirection.INOUT || fd == FeatureDirection.REQUIRESINOUT || fd == FeatureDirection.PROVIDESINOUT|| fd == FeatureDirection.NONE 
		|| fd == FeatureDirection.PROVIDES || fd == FeatureDirection.REQUIRES
	}
	
	def static boolean isOutgoing(FeatureDirection fd){
		fd.outgoingPort || fd.outgoingFeature || fd.outgoingAccess|| fd.outgoingBinding || fd.outgoingDirectionalAccess
	}
	
	def static boolean isOutgoingPort(FeatureDirection fd){
		fd == FeatureDirection.OUT || fd == FeatureDirection.INOUT 
	}
	
	def static boolean isOutgoingFeature(FeatureDirection fd){
		fd == FeatureDirection.OUT || fd == FeatureDirection.NONE 
	}
	
	def static boolean isOutgoingDirectionalAccess(FeatureDirection fd){
		fd == FeatureDirection.PROVIDESIN || fd == FeatureDirection.REQUIRESINOUT 
		|| fd == FeatureDirection.REQUIRESOUT 
	}
	
	def static boolean isOutgoingAccess(FeatureDirection fd){
		fd == FeatureDirection.REQUIRES
	}
	
	def static boolean isOutgoingBinding(FeatureDirection fd){
		fd == FeatureDirection.REQUIRES
	}
	
	def static boolean isIncoming(FeatureDirection fd){
		fd.incomingPort || fd.incomingFeature || fd.incomingBusAccess|| fd.incomingBinding || fd.incomingDirectionalAccess 
	}
	
	def static boolean isIncomingPort(FeatureDirection fd){
		fd == FeatureDirection.IN || fd == FeatureDirection.INOUT 
	}
	
	def static boolean isIncomingFeature(FeatureDirection fd){
		fd == FeatureDirection.IN || fd == FeatureDirection.NONE 
	}
	
	def static boolean isIncomingDirectionalAccess(FeatureDirection fd){
		fd == FeatureDirection.PROVIDESOUT  
		|| fd == FeatureDirection.REQUIRESIN || fd == FeatureDirection.PROVIDESINOUT
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
			case FeatureDirection.PROVIDESIN: FeatureDirection.REQUIRESIN
			case FeatureDirection.REQUIRESIN: FeatureDirection.PROVIDESIN
			case FeatureDirection.PROVIDESOUT: FeatureDirection.REQUIRESOUT
			case FeatureDirection.REQUIRESOUT: FeatureDirection.PROVIDESOUT
			case FeatureDirection.PROVIDESINOUT: FeatureDirection.REQUIRESINOUT
			case FeatureDirection.REQUIRESINOUT: FeatureDirection.PROVIDESINOUT
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
	
	
	// returns true if superTyperef is a super type of any of type in trefs
	def static boolean isSuperTypeOf(Type superType, Iterable<TypeReference> trefs) {
		return trefs.exists[tref| superType.isSuperTypeOf(tref.type)]
	
	}

	// returns true if if superType is a super type of type
	def static boolean isSuperTypeOf(Type superType, Type type) {
		if (superType instanceof DataType && type instanceof DataType){
			return (superType as DataType).isSuperDataTypeOf(type as DataType)
		}
		if (superType instanceof ComponentClassifier && type instanceof ComponentClassifier){
			return 	(superType as ComponentClassifier).isSuperClassifierOf(type as ComponentClassifier)
		}
		false
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
	// superInterface has to be a direct or indirect super implementation, or the same
	def static boolean isSuperInterfaceOf(ComponentInterface superInterface, ComponentInterface cinterface) {
		if( cinterface === null || superInterface.eIsProxy || cinterface.eIsProxy) return false
		if (superInterface === null || superInterface === cinterface) return true
		var superclrefs = cinterface.superClassifiers
		for (superclref : superclrefs) {
			val stype = superclref.type
			if (stype instanceof ComponentInterface){
				if(stype == superInterface) return true
				if(superInterface.isSuperInterfaceOf(stype)) return true
			}
		}
		false
	}
	

	// superImpl has to be a direct or indirect super implementation, or the same
	def static boolean isSuperDataTypeOf(DataType superdt, DataType dt) {
		if( dt === null || superdt.eIsProxy || dt.eIsProxy) return false
		if (superdt === null || superdt === dt) return true
		false
	}
	
	// returns the enclosing component classifier. For a component configuration as 'elem' it is returned
	def static Iterable<Import> getAliases(EObject elem) {
		val pkg = elem.containingPackage
		pkg.imports.filter[im|im.alias !== null]
	}
	

	// returns the enclosing component classifier. For a component configuration as 'elem' it is returned
	def static PackageDeclaration getContainingPackage(EObject elem) {
		var cxt = elem
		while (cxt !== null && !(cxt instanceof PackageDeclaration)) {
			cxt = cxt.eContainer as EObject
		}
		return cxt as PackageDeclaration
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


	// returns the enclosing component. 
	def static Component getContainingSubcomponent(EObject elem) {
		var cxt = elem
		while (cxt !== null && !(cxt instanceof Component)) {
			cxt = cxt.eContainer as EObject
		}
		return cxt as Component
	}
	// returns the enclosing component. 
	def static ClassifierAssignment getContainingClassifierAssignment(EObject elem) {
		var cxt = if (elem instanceof ClassifierAssignment) elem.eContainer as EObject else elem
		while (cxt !== null && !(cxt instanceof ClassifierAssignment)) {
			cxt = cxt.eContainer as EObject
		}
		return cxt as ClassifierAssignment
	}

	
	// mapping maps an outgoing feature, i.e., a source
	def static boolean isOutgoingFeatureDelegation(Association conn){
		if (conn.associationType == AssociationType.CONNECTION ){
			val el = conn.source.element
			if (el instanceof Feature){
				return el.direction.outgoing
			}
		}
		false
	}

	// mapping maps an incoming features, i.e., a destination
	def static boolean isIncomingFeatureDelegation(Association conn){
		if (conn.associationType == AssociationType.CONNECTION ){
			val el = conn.source.element
			if (el instanceof Feature){
				return el.direction.incoming
			}
		}
		false
	}

	
	// source mapping takes into account element of feature group that matches one in the destination feature mappings
	def static boolean isSourceFeatureDelegation(Association conn, AssociationInstance conni ){
		val srcfi = conni.source
		if (srcfi instanceof FeatureInstance){
			conn.associationType == AssociationType.CONNECTION &&
			((conn.source.element == srcfi.feature || srcfi.features.exists[subfi|subfi.feature == conn.source.element])
				|| (conn.destination.element == srcfi.feature || srcfi.features.exists[subfi|subfi.feature == conn.destination.element])
			)
		} else {
			false
		}
	}
	
	// destination mapping takes into account element of feature group that matches one in the source feature mappings
	def static boolean isDestinationFeatureDelegation(Association conn, AssociationInstance conni){
		val dstfi = conni.destination
		if (dstfi instanceof FeatureInstance){
			val srcmappings = conni.sourceDelegates
			conn.associationType == AssociationType.CONNECTION &&
			((conn.source.element == dstfi.feature || dstfi.features.
				exists[subfi|subfi.feature == conn.source.element && (srcmappings.exists[srcconn|srcconn.source.element == conn.source.element]
					|| srcmappings.exists[srcconn|srcconn.source.element == conn.destination.element]
				)])
			|| ((conn.source.element == dstfi.feature || dstfi.features.
				exists[subfi|subfi.feature == conn.destination.element && (srcmappings.exists[srcconn|srcconn.source.element == conn.destination.element]
					|| srcmappings.exists[srcconn|srcconn.destination.element == conn.destination.element]
				)])
			))
		} else {
			false
		}
	}
	
	// association is connection 
	def static boolean isConnection(Association assoc){
		val connType = assoc.associationType
		connType == AssociationType.CONNECTION &&(assoc.source.firstModelElement instanceof Component && assoc.destination.firstModelElement instanceof Component)
		 
	}
	
	// mapping from an outer to an inner feature
	def static boolean isFeatureDelegation(Association conn){
		conn.associationType === AssociationType.CONNECTION &&
		(conn.source.firstModelElement instanceof Feature || conn.destination.firstModelElement instanceof Feature)
	}
	
	
	// association represents a flow specification
	def static boolean isFlowSpec(AssociationType connType){
		connType == AssociationType.FLOWSINK ||
		connType == AssociationType.FLOWSOURCE ||
		connType == AssociationType.FLOW 
	}
	// association represents a binding
	def static boolean isBinding(AssociationType connType){
		connType == AssociationType.BINDING 
	}

	
	// path sequence represents an end to end flow
	def static boolean isEndToEndFlow(PathSequence path){
		return (path.name !== null) 
	}
	// path sequence represents an end to end flow
	def static boolean isFlowAssignment(PathSequence path){
		return (path.name === null) 
	}
	
	// association represents a flow specification
	def static boolean isFlowSpec(Association conn){
		isFlowSpec(conn.associationType) 
	}
	
	//-------------------------
	// ModelElementReference methods
	//-------------------------

	// add component to MER
	def static ModelElementReference addComponent(ModelElementReference path, Component comp){
		val cref = Aadlv3Factory.eINSTANCE.createModelElementReference
		cref.element = comp
		cref.context=path
		cref
	}
	
	// trim MER by one element
	def static ModelElementReference removeComponent(ModelElementReference path){
		val res = path.context
		path.context=null
		res
	}

	// model element reference reaches into a component
	def static boolean modelElementReferenceIncludesComponent(ModelElementReference mer) {
		mer.getClosestReferencedComponent !== null
	}
	
	// model element reference reaches into a component
	def static boolean modelElementReferenceReachDown(ModelElementReference mer) {
		if (mer === null) return false
		val firstcomp = mer.getClosestReferencedComponent
		firstcomp !== null // reachdown
		&& !(firstcomp === mer.element && mer.context === null) // not the only element in mer
	}
	
	/**
	 * returns the closest component reference in the MER path
	 */
	def static Component getClosestReferencedComponent(ModelElementReference mer) {
		var closest = mer
		if (closest.element instanceof Component){
			return closest.element as Component
		}
		while (closest.context !== null) {
			closest = closest.context
			if (closest.element instanceof Component){
				return closest.element as Component
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
		if(mer === null || mer.element === null) return null
		var ModelElementReference cxt = mer
		while (cxt.context !== null) {
			cxt = cxt.context
		}
		cxt
	}

	// returns the first element of the path
	// this is the MER without a context reference
	def static ModelElement getFirstModelElement(ModelElementReference mer) {
		if(mer === null || mer.element === null) return null
		var ModelElementReference cxt = mer
		while (cxt.context !== null) {
			cxt = cxt.context
		}
		cxt.element
	}
	
	// returns target path relative to the enclosing classifier, i.e., for nested CAs we add the path of the enclosing CA
	def static String getTargetPath(ClassifierAssignment ca){
		var res = ca.target.targetPath
		var cxt = ca.containingClassifierAssignment
		while (cxt !== null){
			res = cxt.target.targetPath + '.' + res
			cxt = cxt.containingClassifierAssignment
		}
		return res
		
	}
	
		
	/**
	 * get full target path that includes the paths of any enclosing CAs
	 */
	def static String getTargetPath(PropertyAssociation pa){
		val PApath = getTargetPath(pa.target)
		val ca = pa.containingClassifierAssignment
		if (ca === null) return PApath
		val CApath = ca.targetPath
		if (CApath.isEmpty) return PApath
		if (PApath.isEmpty) return CApath
		return CApath+'.'+PApath
	}
	

	
	def static String getTargetPath(ModelElementReference mer){
		if (mer === null) return ""
		var res = mer.element.name
		var cxt = mer.context
		while( cxt !== null){
			res = cxt.element.name + "." + res
			cxt = cxt.context
		}
		return res
		
	}
	
	/**
	 * return the target of a feature delegate, i.e., the association end that includes a (sub)component or tis feature
	 */
	def static ModelElementReference getDelegationTarget(Association assoc){
		if (assoc.source.modelElementReferenceIncludesComponent){
			assoc.source
		} else {
			assoc.destination
		}
	}
	
	
	// depth indicates the target path length to be considered
	def static boolean matchesReachDown(ModelElementReference reachdown, ModelElementReference target, int depth, ModelElementReference context) {
		var trgt = target
		var rd = reachdown
		while (trgt !== null && rd !== null){
			if (trgt.element !== rd.element){
				return false
			}
			trgt = trgt.context
			rd = rd.context
		}
		var cxt = context
		var countdown = depth
		while (cxt !== null && rd !== null && countdown > 0){
			if (cxt.element !== rd.element){
				return false
			}
			cxt = cxt.context
			rd = rd.context
			countdown--
		}
		return true
	}
	

	
	////////////////////////////////////
	// deal with predeclared base interfaces for different component categories
	///////////////////////////////////
	
	def static ComponentInterface getBaseInterface(EObject context, ComponentCategory cat){
		switch cat {
			case ComponentCategory.THREAD: {
				Av3API.lookupComponentClassifier(context,"BaseInterfaces::BaseThread") as ComponentInterface
				}
			case BUS: {
			}
			case ABSTRACT: {
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
				Av3API.lookupComponentClassifier(context,"BaseInterfaces::BaseProcessor") as ComponentInterface
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
			case INTERFACE: {
			}
		}
	}
	
	////////////////////////////////////////
	// Instance Model methods
	///////////////////////////////////////
//
//	def static FeatureInstance createFeatureInstance(Feature f, boolean reverse) {
//		val featurei = Av3instanceFactory.eINSTANCE.createFeatureInstance
//		featurei.name = f.name
//		featurei.direction = if (reverse) f.direction.reverseDirection else f.direction
//		featurei.feature = f
//		featurei.category = f.category
//		return featurei
//	}
//
//	def static PathInstance createPathSequenceInstance(PathSequence ps) {
//		val psi = Av3instanceFactory.eINSTANCE.createPathInstance
//		psi.name = ps.name
//		psi.path = ps
//		return psi
//	}
//
//	def static AssociationInstance createAssociationInstance(Association assoc) {
//		val associ = Av3instanceFactory.eINSTANCE.createAssociationInstance
//		associ.name = assoc.name
//		associ.association = assoc
//		associ.associationType = assoc.associationType
//		return associ
//	}
//
//	def static ComponentInstance createComponentInstance(Component c, Iterable<TypeReference> configuredtypereferences) {
//		val compi = Av3instanceFactory.eINSTANCE.createComponentInstance
//		compi.name = c.name
//		compi.category = c.category
//		compi.component = c
//		Aadlv3Util.configuredClassifierTypereferenceCache.put(compi, configuredtypereferences)
//		return compi
//	}
//	
//	def static createPropertyAssociationInstance(PropertyAssociation pa){
//		val pai = Av3instanceFactory.eINSTANCE.createPropertyAssociationInstance
//		pai.property = pa.property
//		pai.propertyAssociation = pa
//		pai.propertyAssociationType = pa.propertyAssociationType
//		pai.value = pa.value.copy
//		return pai
//	}

	static HashMap<ComponentInstance, Iterable<TypeReference>> configuredClassifierTypereferenceCache = new HashMap;
	
	def static void resetComponentInstanceCache(){
		configuredClassifierTypereferenceCache.clear
	}
	
	def static getConfiguredTypeReferences(ComponentInstance ci){
		configuredClassifierTypereferenceCache.get(ci)
	}

	def static void putConfiguredTypeReferences(ComponentInstance ci,Iterable<TypeReference> configuredtypereferences){
		configuredClassifierTypereferenceCache.put(ci,configuredtypereferences)
	}

	
	
	////////////////////////////////////////
	// Property Definition / Set methods
	///////////////////////////////////////
	
	/**
	 * return all property definitions specified in use properties declarations of component interfaces
	 */
	def static Iterable<PropertyDefinition> getAllowedUseProperties(Iterable<TypeReference> trefs){
		val cls = trefs.allComponentClassifiers
		val pss = cls.filter[ccl|ccl instanceof ComponentInterface].map[cif|(cif as ComponentInterface).useProperties].flatten
		pss.map[ps|ps.properties].flatten
	}
	

	/** 
	 * return list of property definitions listed in use properties statement of workingset
	 */
	def static Iterable<PropertyDefinition> getExpectedProperties(Workingset ws){
		val pss = ws.useProperties
		pss.map[ps|ps.properties].flatten
	}
	
	/** 
	 * return list of property definitions based on category of EObject
	 */
	def static Iterable<PropertyDefinition> getAllowedProperties(InstanceObject target){
		val pds = target.getAllPropertyDefinitions()
		switch (target){
			ComponentInstance: {
				val targetcomp = target.component
				pds.filter[pd|pd.appliesToCategory(target.category)]+targetcomp.typeReferences.allowedUseProperties
			}
			FeatureInstance: {
				pds.filter[pd|pd.appliesToCategory(target.category)]
			}
			AssociationInstance: {
				pds.filter[pd|pd.appliesToCategory(target.associationType)]
			}
			default: {
				Collections.EMPTY_LIST
			}
		}
	}

	
	def static boolean appliesTo(PropertyDefinition pd, InstanceObject io){
		switch(io){
			ComponentInstance: {
				appliesToCategory(pd,io.category) || io.component?.typeReferences.allowedUseProperties.exists[iopd|sameProperty(iopd, pd)]
			}
			FeatureInstance: {
				appliesToCategory(pd,io.category)
			}
			AssociationInstance: {
				appliesToCategory(pd,io.associationType)
			}
		}
		false
	}
	
	
	def static boolean appliesToCategory(PropertyDefinition pd, ComponentCategory ccat){
		if (ccat === null){
			return pd.appliesToAll || !pd.componentCategories.empty
		}
		if (ccat === ComponentCategory.INTERFACE){
			return pd.appliesToAll || !pd.componentCategories.empty
		}
		pd.componentCategories.contains(ccat) || pd.appliesToAll
	}
	
	def static boolean appliesToCategory(PropertyDefinition pd, FeatureCategory fcat){
		pd.featureCategories.contains(fcat) || pd.appliesToAll
	}
	
	def static boolean appliesToCategory(PropertyDefinition pd, AssociationType acat){
		pd.associationTypes.contains(acat) || pd.appliesToAll
	}
	
	def static boolean appliesToAll(PropertyDefinition pd){
		pd.forAll
//		pd.componentCategories.empty && pd.featureCategories.empty && pd.associationTypes.empty
	}
	
	def static boolean sameProperty(PropertyDefinition first, PropertyDefinition second){
		return first.name == second.name
	}
	
	def static boolean samePropertyAndPath(PropertyAssociation first, PropertyAssociation second){
		return first.property.name == second.property.name && first.target.targetPath == second.target.targetPath
	}
	
		
	static def boolean contains(Iterable <PropertyAssociation> pas, PropertyAssociation pa){
		for (p : pas){
			if (samePropertyAndPath(p,pa)) return true
		}
		return false
	}
	
	
	def static boolean overridesPropertyAssociation(PropertyAssociation first, PropertyAssociation second){
			val firstCl = first.containingComponentClassifier
			val secondCl = second.containingComponentClassifier
		return firstCl.isSuperClassifierOf(secondCl)|| secondCl.isSuperClassifierOf(firstCl)
	}
	
}
