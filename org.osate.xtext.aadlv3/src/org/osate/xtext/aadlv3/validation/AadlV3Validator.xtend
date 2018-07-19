/*
 * generated by Xtext 2.14.0
 */
package org.osate.xtext.aadlv3.validation

import org.osate.aadlv3.aadlv3.ComponentInterface
import org.eclipse.xtext.validation.Check
import org.osate.aadlv3.aadlv3.Aadlv3Package
import static extension org.osate.aadlv3.util.Aadlv3Util.*
import org.osate.aadlv3.aadlv3.ComponentImplementation
import org.osate.aadlv3.aadlv3.ComponentConfiguration
import org.osate.aadlv3.aadlv3.ComponentClassifier
import org.osate.aadlv3.aadlv3.Feature
import org.osate.aadlv3.aadlv3.FeatureCategory
import org.osate.aadlv3.aadlv3.FeatureDirection
import org.osate.aadlv3.aadlv3.ComponentCategory
import org.osate.aadlv3.aadlv3.ModelElement
import org.osate.aadlv3.aadlv3.Association
import org.osate.aadlv3.aadlv3.AssociationType
import org.osate.aadlv3.aadlv3.ConfigurationAssignment
import org.osate.aadlv3.aadlv3.Component
import org.osate.aadlv3.aadlv3.PathSequence
import org.osate.aadlv3.aadlv3.PrimitiveType
import org.osate.aadlv3.aadlv3.ConfigurationActual
import org.osate.aadlv3.aadlv3.ConfigurationParameter
import org.osate.aadlv3.aadlv3.PathElement

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class AadlV3Validator extends AbstractAadlV3Validator {
	
	public static val DUPLICATE_NAMES = 'DuplicateNames'
	public static val ONLY_SUPER_INTERFACES = 'OnlySuperInterfaces'
	public static val NO_SUPER_CONFIGURATIONS = 'NoSuperConfigurations'
	public static val BAD_BINDING_POINT_DIRECTION = 'BadBindingPointDirection'
	public static val BAD_BUS_ACCESS_DIRECTION = 'BadBusAccessDirection'
	public static val BAD_DATA_ACCESS_DIRECTION = 'BadDataAccessDirection'
	public static val BAD_PORT_DIRECTION = 'BadPortDirection'
	public static val BAD_FEATURE_DIRECTION = 'BadFeatureDirection'
	public static val BAD_INTERFACE_DIRECTION = 'BadInterfaceDirection'
	public static val ONLY_PORTS_SAMPLE = 'OnlyPortsSample'
	public static val ONLY_INTERFACES_REVERSE = 'OnlyInterfacesReverse'
	public static val MISMATCHED_COMPONENT_CATEGORY = 'MismatchedCategory'
	public static val IN_TO_OUT = 'InToOut'
	public static val OUT_TO_IN = 'OutToIn'
	public static val SAME_DIRECTION = 'SameDirection'
	public static val REQUIRES_TO_PROVIDES = 'RequiresToProvides'
	public static val MUST_BE_OUT = 'MustBeOut'
	public static val MUST_BE_IN = 'MustBeIn'
	public static val MATCH_FEATURE_CATEGORY = 'MatchFeatureCategory'
	public static val MUST_BE_BINDING_POINT = 'MustBeBindingPoint'
	public static val NO_BINDING_POINT = 'NoBindingPoint'
	public static val BetweenSubcomponents = 'BetweenSubcomponents'
	public static val ToSubcomponents = 'ToSubcomponents'
	public static val ToSubcomponent = 'ToSubcomponent'
	public static val NotSubcomponentFeature = 'NotSubcomponentFeature'
	public static val BetweenFeatures = 'BetweenFeatures'
	public static val MatchingTypes ='MatchingTypes'
	public static val ToFlowSpec ='ToFlowSpec'
	public static val MissingOneType = 'MissingOneType'
	public static val OnlyPropertyAssociations = 'OnlyPropertyAssociations'
	public static val MustBePrimitiveType = 'MustBePrimitiveType'
	public static val NoPrimitiveType = 'NoPrimitiveType'
	public static val FormalActualMismatch = 'FormalActualMismatch'
	public static val ParameterNotInterface= 'ParameterNotInterface'
	public static val OverrideType = 'OverrideType'
	public static val DifferentComponentInPath = 'DifferentComponentInPath'

	@Check
	def checkComponentClassifier(ComponentClassifier cl) {
		cl.checkConsistentCategory()
	}

	@Check
	def checkComponentInterface(ComponentInterface cif) {
		cif.checkUniqueModelElementNames()
		cif.checkComponentInterfaceExtensions()
	}
	
	@Check
	def checkComponentImplementation(ComponentImplementation cimpl) {
		cimpl.checkUniqueModelElementNames()
		cimpl.checkComponentImplementationExtensions()
	}
	
	@Check
	def checkFeature(Feature fea) {
		fea.checkFeatureDirection()
		if (fea.category != FeatureCategory.PORT && fea.isSampled){
			error('Only ports can be sampled', fea,
			Aadlv3Package.Literals.FEATURE__SAMPLED,
			ONLY_PORTS_SAMPLE)
		}
		if (fea.category != FeatureCategory.INTERFACE && fea.isReverse){
			error('Only interface features can reverse direction', fea,
			Aadlv3Package.Literals.FEATURE__REVERSE,
			ONLY_INTERFACES_REVERSE)
		}
	}
	
	@Check 
	def checkAssociation(Association assoc){
		assoc.checkConsistentDirection
		assoc.checkConsistentFeatureCategory
		assoc.checkConsistentTargets
		assoc.checkMatchingTypes
	}
	
	@Check 
	def checkConfigurationAssignment(ConfigurationAssignment ca){
		if (!(ca.target.element instanceof Component)){
			// TODO in the future we may configure features
			error('Configuration assignment must be for subcomponent', ca,
			Aadlv3Package.Literals.CONFIGURATION_ASSIGNMENT__TARGET,
			ToSubcomponent)
		} else {
			val comp = ca.target.element as Component
			val assignedtype = ca.value.type
			if (assignedtype instanceof ComponentClassifier){
				val clcat = assignedtype.componentCategory
				if (!(comp.category === clcat || clcat === ComponentCategory.COMPONENT)){
					error('Category of assigned classifier must be the same as the category of the component or must be "component"', ca,
					null,
					MISMATCHED_COMPONENT_CATEGORY)
				}
				
			} else {
				// primitive type
				if (comp.category === ComponentCategory.DATA || comp.category === ComponentCategory.COMPONENT ){
					if (comp.typeReference !== null){
						error('Assigned primitive type cannot override existing type', ca,
						null,
						OverrideType)
					}
				} else {
					error('Configuration assignment expects component classifier', ca,
					null,
					NoPrimitiveType)
				}
			}
		}
		
	}

	@Check 
	def checkPathSequence(PathSequence flowa){
		// flow assignment or end to end path
		if (flowa.name === null || flowa.name.empty){
			// flow assignment
			if (!(flowa.target.element instanceof Association && (flowa.target.element as Association).isFlowSpec)){
				error('Flow assignment must be for flow specification', flowa,
				Aadlv3Package.Literals.PATH_SEQUENCE__TARGET,
				ToFlowSpec)
			}
			// the first and last path element may be feature mappings
		}
		// for both the sequence has to be consistent
		flowa.checkPathSequenceConsistency
	}
	
	
	@Check 
	def checkPathElement(PathElement pe){
		if (!(pe.element instanceof Association && ((pe.element as Association).isFlowSpec || (pe.element as Association).isConnection)
			|| pe.element instanceof Component)){
			error('path element must reference a connection, flow spec, or component', pe,
			null,
			ToFlowSpec)
		}
	}
	

	@Check 
	def checkComponent(Component comp){
		if (comp.typeReference !== null){
			if(!(comp.typeReference.type instanceof PrimitiveType)){
			// we have a classifier reference
			comp.checkComponentWithClassifier
			} else {
				// primitive type
				comp.checkComponentWithPrimitiveType
			}
		} 		
	}
	
	@Check 
	def checkConfigurationParameter(ConfigurationParameter param){
		if (!(param.type instanceof ComponentInterface)){
				error('Configuration parameter type is not a component interface', param,
				Aadlv3Package.Literals.CONFIGURATION_PARAMETER__TYPE,
				ParameterNotInterface)
		}
	}
	

	@Check 
	def checkConfigurationActual(ConfigurationActual ca){
		val cif = ca.parameter.type
		if (cif instanceof ComponentInterface){
			val assignedcif = ca.value.componentinterface
			if(!(cif.isSuperClassifierOf(assignedcif))){
				error('Configuration actual does not match interface of configuration parameter', ca,
				null,
				FormalActualMismatch)
			}
		} 		
	}
	
	def checkUniqueModelElementNames(ComponentInterface cl){
		val mels = cl.allComponentInterfaces.allModelElements.toList
		val max = mels.length
		for (var firstidx = 0; firstidx < max-1; firstidx++){
			val first = mels.get(firstidx)
			for (var secondidx = firstidx+1 ; secondidx <max; secondidx++){
				val second = mels.get(secondidx)
				if (first !== second && first.name == second.name){
					reportDuplicateNames(first,cl)
					reportDuplicateNames(second,cl)
				}
			}
		}
	}

	
	def checkUniqueModelElementNames(ComponentImplementation cl){
		val mels = cl.allComponentImplementations.allModelElements.toList
		val maxmels = mels.length
		for (var firstidx = 0; firstidx < maxmels-1; firstidx++){
			val first = mels.get(firstidx)
			for (var secondidx = firstidx+1 ; secondidx <maxmels; secondidx++){
				val second = mels.get(secondidx)
				if (first !== second && first.name == second.name){
					reportDuplicateNames(first,cl)
					reportDuplicateNames(second,cl)
				}
			}
		}
		// check whether duplicate names in interface elements and implementation elements
		val ifmels = cl.interface.allComponentInterfaces.allModelElements.toList
		val maxifmels = ifmels.length
		for (var firstidx = 0; firstidx < maxifmels; firstidx++){
			val first = ifmels.get(firstidx)
			for (var secondidx = 0 ; secondidx <maxmels; secondidx++){
				val second = mels.get(secondidx)
				if (first !== second && first.name == second.name){
					reportDuplicateNames(first,cl)
					reportDuplicateNames(second,cl)
				}
			}
		}
	}
	
	def void reportDuplicateNames (ModelElement first, ComponentClassifier cl){
		val firstcl = first.containingComponentClassifier
		if (firstcl == cl){
			error('Duplicate model element with name '+first.name, first,
			Aadlv3Package.Literals.NAMED_ELEMENT__NAME,
			DUPLICATE_NAMES)
		} else {
			var idx = 0;
			for (sclref : cl.superClassifiers){
				val scl = sclref.type as ComponentClassifier
				if (firstcl === scl || firstcl.isSuperClassifierOf(scl)){
					idx = cl.superClassifiers.indexOf(sclref)
				}
			}
			error('Duplicate model element with name '+first.name, cl,
				Aadlv3Package.Literals.COMPONENT_CLASSIFIER__SUPER_CLASSIFIERS, idx,
				DUPLICATE_NAMES)
		}
	}
	
	def checkComponentInterfaceExtensions(ComponentInterface cif){
		if (!cif.allComponentClassifiers.forall[scif|scif instanceof ComponentInterface]){
			error('Interface extensions must be interfaces', cif,
					Aadlv3Package.Literals.COMPONENT_CLASSIFIER__SUPER_CLASSIFIERS,
					ONLY_SUPER_INTERFACES)
		}
	}
	
	def checkComponentImplementationExtensions(ComponentImplementation cim){
		if (cim.allComponentClassifiers.forall[scil|scil instanceof ComponentConfiguration]){
			error('Implementation extensions cannot be configurations', cim,
					Aadlv3Package.Literals.COMPONENT_CLASSIFIER__SUPER_CLASSIFIERS,
					NO_SUPER_CONFIGURATIONS)
		}
	}
	
	def checkFeatureDirection(Feature fea){
		switch (fea.category){
			case FeatureCategory.BINDINGPOINT: {
				if (!(fea.direction ==FeatureDirection.PROVIDES || fea.direction ==FeatureDirection.REQUIRES)){
					error('Binding point direction must be provides or requires', fea,
					Aadlv3Package.Literals.FEATURE__DIRECTION,
					BAD_BINDING_POINT_DIRECTION)
				}
			}
			case BUSACCESS: {
				if (!(fea.direction ==FeatureDirection.PROVIDES || fea.direction ==FeatureDirection.REQUIRES)){
					error('Bus access direction must be provides or requires', fea,
					Aadlv3Package.Literals.FEATURE__DIRECTION,
					BAD_BUS_ACCESS_DIRECTION)
				}
			}
			case DATAACCESS: {
				if (!(fea.direction ==FeatureDirection.PROVIDESREAD || fea.direction ==FeatureDirection.REQUIRESREAD
					|| fea.direction ==FeatureDirection.PROVIDESWRITE || fea.direction ==FeatureDirection.REQUIRESWRITE
					|| fea.direction ==FeatureDirection.PROVIDESREADWRITE || fea.direction ==FeatureDirection.REQUIRESREADWRITE
				)){
					error('Data access direction must be provides or requires', fea,
					Aadlv3Package.Literals.FEATURE__DIRECTION,
					BAD_DATA_ACCESS_DIRECTION)
				}
			}
			case FEATURE: {
				if (!(fea.direction ==FeatureDirection.IN || fea.direction ==FeatureDirection.OUT || fea.direction ==FeatureDirection.NONE)){
					error('Feature direction must be in, out, or no direction', fea,
					Aadlv3Package.Literals.FEATURE__DIRECTION,
					BAD_FEATURE_DIRECTION)
				}
			}
			case INTERFACE: {
				if (!(fea.direction ==FeatureDirection.IN || fea.direction ==FeatureDirection.OUT || fea.direction ==FeatureDirection.NONE)){
					error('Interface direction must be in, out, or no direction', fea,
					Aadlv3Package.Literals.FEATURE__DIRECTION,
					BAD_FEATURE_DIRECTION)
				}
			}
			
			case PORT: {
				if (!(fea.direction ==FeatureDirection.IN || fea.direction ==FeatureDirection.OUT || fea.direction ==FeatureDirection.INOUT)){
					error('Port direction must be in, out, or in out', fea,
					Aadlv3Package.Literals.FEATURE__DIRECTION,
					BAD_FEATURE_DIRECTION)
				}
			}
		}
	}
	
	
	def checkConsistentCategory(ComponentClassifier cl){
		val cls = cl.allComponentClassifiers
		val targetcat = cl.componentCategory
		for (matchcl : cls){
			if (matchcl !== cl){
			val matchcat = matchcl.componentCategory
			if (matchcat != targetcat && matchcat != ComponentCategory.COMPONENT){
				error('Extension category differs', matchcl,
					Aadlv3Package.Literals.COMPONENT_CLASSIFIER__SUPER_CLASSIFIERS,
					org.osate.xtext.aadlv3.validation.AadlV3Validator.MISMATCHED_COMPONENT_CATEGORY)
			}
			}
		}
	}
	
	def checkConsistentDirection(Association assoc){
		val srcdir = assoc.source.realFeatureDirection
		val dstdir = assoc.destination.realFeatureDirection
		if (assoc.associationType.isConnection){
			if (!(srcdir.outgoing&&dstdir.incoming)){
				error('Connection source must be outgoing and destination must be incoming', assoc,
					null,
					OUT_TO_IN)
			}
		} else if (assoc.associationType.isFeatureMapping){
			if (!(srcdir === dstdir)){
				error('Feature mapping directions must be same', assoc,
					null,
					SAME_DIRECTION)
			}
		} else if (assoc.associationType === AssociationType.FLOWPATH){
			if (!(srcdir.incoming&&dstdir.outgoing)){
				error('FLow path must be from incoming to outgoing', assoc,
					null,
					IN_TO_OUT)
				
			}
		} else if (assoc.associationType === AssociationType.FLOWSINK){
			if (!(srcdir.incoming)){
				error('Flow sink must be incoming', assoc,
					Aadlv3Package.Literals.ASSOCIATION__SOURCE,
					MUST_BE_IN)
			}
		} else if (assoc.associationType === AssociationType.FLOWSOURCE){
			if (!(dstdir.outgoing)){
				error('FLow source must be outgoing', assoc,
					Aadlv3Package.Literals.ASSOCIATION__DESTINATION,
					MUST_BE_OUT)
			}
		} else if (assoc.associationType.isBinding){
			if (!(srcdir.outgoingBinding&&dstdir.incomingBinding)){
				error('Binding must be from requires to provides', assoc,
					null,
					REQUIRES_TO_PROVIDES)
			}
		}
	}

	def checkConsistentFeatureCategory(Association assoc){
		val src = assoc.source.element as Feature
		val dst = assoc.destination.element as Feature
		if (assoc.associationType.isConnection){
			if (!(src.category === dst.category)){
				error('Feature category of connection ends must match', assoc,
					null,
					MATCH_FEATURE_CATEGORY)
			}
		} else if (assoc.associationType.isFeatureMapping){
			if (!(src.category === dst.category)){
				error('Feature category of connection ends must match', assoc,
					null,
					MATCH_FEATURE_CATEGORY)
			}
		} 
		if (assoc.associationType.isBinding){
			if (!(src.isBindingPoint&&dst.isBindingPoint)){
				error('Binding must be between bindingpoints', assoc,
					null,
					MUST_BE_BINDING_POINT)
			}
		} else {
			// others should not have binding points
			if (src.isBindingPoint||dst.isBindingPoint){
				error('Bindingpoints can only be in bindings', assoc,
					null,
					NO_BINDING_POINT)
			}
		}
	}
	
	def checkConsistentTargets(Association assoc){
		if (assoc.associationType.isConnection){
			if (!(assoc.source.containedComponentModelElementReference&&assoc.destination.containedComponentModelElementReference)){
				error('Connection must be between subcomponents', assoc,
					null,
					BetweenSubcomponents)
			}
		} 
		if (assoc.associationType.isFeatureMapping){
			if (!(!assoc.source.containedComponentModelElementReference&&assoc.destination.containedComponentModelElementReference)){
				error('Feature mapping must from feature to feature in subcomponent', assoc,
					null,
					ToSubcomponent)
			}
		} else if (assoc.associationType === AssociationType.FLOWPATH){
			if (!(!assoc.source.containedComponentModelElementReference&&!assoc.destination.containedComponentModelElementReference)){
				error('Flow path must not be between features of subcomponents', assoc,
					null,
					BetweenFeatures)
			}
		} else if (assoc.associationType === AssociationType.FLOWSINK){
			if (!(!assoc.source.containedComponentModelElementReference)){
				error('Flow source must not be a subcomponent feature', assoc,
					Aadlv3Package.Literals.ASSOCIATION__SOURCE,
					NotSubcomponentFeature)
			}
		} else if (assoc.associationType === AssociationType.FLOWSOURCE){
			if (!(!assoc.destination.containedComponentModelElementReference)){
				error('Flow sink must not be a subcomponent feature', assoc,
					Aadlv3Package.Literals.ASSOCIATION__DESTINATION,
					NotSubcomponentFeature)
			}
		} else if (assoc.associationType.isBinding){
			if (!(!assoc.source.containedComponentModelElementReference&&!assoc.destination.containedComponentModelElementReference)){
				error('Binding must be between subcomponents', assoc,
					null,
					BetweenSubcomponents)
			}
		}
	}
	
	def checkMatchingTypes(Association assoc){
		if (assoc.associationType.flowSpec) return
		val src = assoc.source.element as Feature
		val dst = assoc.destination.element as Feature
		if (src.type !== null && dst.type !==null &&src.type !== dst.type){
				error('Association ends must have same type', assoc,
					null,
					MatchingTypes)
		}
		if (src.type !== null && dst.type === null || src.type === null && dst.type !== null){
				warning('One association has a type, while the other does not', assoc,
					null,
					MissingOneType)
		}
	}
	
	def checkComponentWithClassifier(Component comp){
		// the categories must be consistent
		val clcat = (comp.typeReference.type as ComponentClassifier).componentCategory
		if (!(clcat === comp.category || clcat === ComponentCategory.COMPONENT)){
			error('Component category conflicts with classifier category', comp,
			Aadlv3Package.Literals.COMPONENT__CATEGORY,
			MISMATCHED_COMPONENT_CATEGORY)
		}
	    // if has classifier then {} can only contain property associations
	    if (!comp.features.empty || !comp.connections.empty || !comp.components.empty){
			error('Component with classifier can only have property associations in {}', comp,
			null,
			OnlyPropertyAssociations)
	    }
	    // data component cannot have classifier, only primitive type
	    if (comp.category === ComponentCategory.DATA){
			error('Data component must have primitive type', comp,
			Aadlv3Package.Literals.COMPONENT__CATEGORY,
			MustBePrimitiveType)
	    }
	}
	
	def checkComponentWithPrimitiveType(Component comp){
		// If primitive type features are ok in {} to allow access features on data components	
		if (!(comp.connections.empty && comp.components.empty && comp.features.forall[f|f.dataAccessFeature])){
			error('Component with primitive type can only have property associations or data access features in {}', comp,
			null,
			OnlyPropertyAssociations)
		}
	    if (comp.category !== ComponentCategory.DATA || comp.category !==ComponentCategory.COMPONENT){
			error('Components other than "data" or "component" cannot have primitive type', comp,
			Aadlv3Package.Literals.COMPONENT__CATEGORY,
			NoPrimitiveType)
	    }
	}
	
	def checkPathSequenceConsistency(PathSequence path){
		var PathElement prevPathElement = null
		for (pathElement : path.elements){
			val element = pathElement.element
			val prevElement = prevPathElement.element
			val elementidx = path.elements.indexOf(pathElement)
			if (prevElement instanceof Association){
				if(prevElement.isFlowSpec){
					// previous flow spec
					val prevdstcomp = prevPathElement.referencedContainingComponent
					if( element instanceof Association){
						if (element.isFlowSpec){
							// there must be a connection between them
						} else if (element.isConnection){
							// connection must start from prev flow spec component
							val currentsrccomp = element.source.referencedContainingComponent
							if (prevdstcomp !== currentsrccomp){
								error('Connection source component differs from destination component of preceding flow spec', path,
								Aadlv3Package.Literals.PATH_SEQUENCE__ELEMENTS, elementidx,
								DifferentComponentInPath)
							}
						}
					} else if (element instanceof Component){
						// connection destination must be the component
						if (prevdstcomp !== element){
							error('Component differs from destination component of preceding connection', path,
							Aadlv3Package.Literals.PATH_SEQUENCE__ELEMENTS, elementidx,
							DifferentComponentInPath)
						}
					}
				} else if (prevElement.isConnection){
					// previous connection
					val prevdstcomp = (prevElement as Association).destination.referencedContainingComponent
					if( element instanceof Association){
						if (element.isFlowSpec){
							val currentsrccomp = pathElement.referencedContainingComponent
							if (prevdstcomp !== currentsrccomp){
								error('Component of flow spec differs from from destination component of preceding connection', path,
								Aadlv3Package.Literals.PATH_SEQUENCE__ELEMENTS, elementidx,
								DifferentComponentInPath)
							}
						} else if (element.isConnection){
							// both are connection
							// they must connect to the same component
							val currentsrccomp = element.source.referencedContainingComponent
							if (prevdstcomp !== currentsrccomp){
								error('Connection source component differs from destination component of preceding connection', path,
								Aadlv3Package.Literals.PATH_SEQUENCE__ELEMENTS, elementidx,
								DifferentComponentInPath)
							}
						}
					} else if (element instanceof Component){
						// connection destination must be the component
						if (prevdstcomp !== element){
							error('Component differs from destination component of preceding connection', path,
							Aadlv3Package.Literals.PATH_SEQUENCE__ELEMENTS, elementidx,
							DifferentComponentInPath)
						}
					}
				}
			} else if (prevElement instanceof Component){
				// previous component
				if( element instanceof Association){
					if (element.isFlowSpec){
						// there must be a connection
					} else if (element.isConnection){
						// element is a connection
						// connection source must be same as prev component
						val currentsrccomp = element.source.referencedContainingComponent
						if (prevElement !== currentsrccomp){
							error('Preceding component differs from source component of connection', path,
							Aadlv3Package.Literals.PATH_SEQUENCE__ELEMENTS, elementidx,
							DifferentComponentInPath)
						}
					}
				} else if (element instanceof Component){
					// both are component
					// there must be a connection
				}
			}
			prevPathElement = pathElement
		}
	}
	
}
