/*
 * generated by Xtext 2.14.0
 */
package org.osate.xtext.aadlv3.scoping

import java.util.Collections
import java.util.Stack
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.SimpleScope
import org.eclipse.xtext.util.SimpleAttributeResolver
import org.osate.aadlv3.aadlv3.Aadlv3Package
import org.osate.aadlv3.aadlv3.Component
import org.osate.aadlv3.aadlv3.ComponentClassifier
import org.osate.aadlv3.aadlv3.ComponentConfiguration
import org.osate.aadlv3.aadlv3.ComponentInterface
import org.osate.aadlv3.aadlv3.ConfigurationActual
import org.osate.aadlv3.aadlv3.ConfigurationAssignment
import org.osate.aadlv3.aadlv3.Feature
import org.osate.aadlv3.aadlv3.ModelElementReference
import org.osate.aadlv3.aadlv3.PathSequence
import org.osate.aadlv3.aadlv3.DataType
import org.osate.aadlv3.aadlv3.PropertyAssociation
import org.osate.aadlv3.aadlv3.Type
import org.osate.aadlv3.aadlv3.TypeReference

import static extension org.osate.aadlv3.util.Aadlv3Util.*
import org.osate.aadlv3.aadlv3.Association
import com.google.common.collect.Iterables
import com.google.common.base.Function
import org.eclipse.xtext.resource.EObjectDescription
import com.google.common.base.Predicates
import org.eclipse.xtext.resource.IEObjectDescription
import org.osate.aadlv3.aadlv3.Import
import org.osate.aadlv3.util.Av3API
import org.eclipse.xtext.naming.IQualifiedNameConverter
import com.google.inject.Inject

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class AadlV3ScopeProvider extends AbstractAadlV3ScopeProvider {

	@Inject
	static IQualifiedNameConverter qnameConverter;

	override getScope(EObject context, EReference reference) {
		// We want to define the Scope for the Element's superElement cross-reference
		if (context instanceof ModelElementReference &&
			reference == Aadlv3Package.Literals.MODEL_ELEMENT_REFERENCE__ELEMENT) {
			// Create IEObjectDescriptions and puts them into an IScope instance
			val mer = context as ModelElementReference
			val modelElements = if (mer.context === null) {
					// container is connection or configuration assignment
					switch cc: mer.modelElementReferenceContext {
						Association,
						PathSequence: {
							switch container : cc.eContainer {
								ComponentClassifier: {
									container.allComponentClassifiers.allModelElements ?: Collections.EMPTY_LIST
								}
								Component: {
									container?.allContents ?: Collections.EMPTY_LIST
								}
							}
						}
						ConfigurationAssignment,
						PropertyAssociation: {
							switch ccc: cc.eContainer {
								ComponentClassifier:
									ccc.allComponentClassifiers.allModelElements
								ConfigurationAssignment: {
									// enclosing configuration assignment may configure a classifier or it may be empty, thus, we need to go to its target
									// We only need to go to the enclosing configuration assignment as it acts as the root context for resolving the model element reference path
									val ne = ccc.value?.type;
									if (ne instanceof ComponentClassifier) {
										ne.allComponentClassifiers.allModelElements
									} else if (ne instanceof Type) {
										// no contained model elements unless we access record fields (TODO)
										Collections.EMPTY_LIST
									} else {
										// container is a configuration assignment with a configuration parameter reference on the right
										// or without a value on the right
										// We need to look at the classifier associated with the target on the left
										val el = ccc.target?.element;
										if (el instanceof Component) {
											val casscopes = new Stack<Iterable<ConfigurationAssignment>>()
											casscopes.push(
												context.containingComponentConfiguration.
													allSuperConfigurationAssignments)
											el.getConfiguredClassifier(casscopes)?.allComponentClassifiers.
												allModelElements ?: Collections.EMPTY_LIST
										} else if (el instanceof Feature) {
											val ftype = el.type
											if (ftype instanceof ComponentInterface) {
												ftype.allClassifierFeatures
											} else {
												Collections.EMPTY_LIST
											}
										} else {
											Collections.EMPTY_LIST
										}
									}
								}
								default:
									Collections.EMPTY_LIST
							}
						}
					}
				} else {
					// context element is not null
					switch previousElement : mer.context.element {
						case null,
						case previousElement.eIsProxy:
							// Don't provide a scope if the previous element could not be resolved
							Collections.EMPTY_LIST
						Component: {
							// super classifier of containing classifier of configuration assignment may have configured the component
							val casscopes = new Stack<Iterable<ConfigurationAssignment>>()
							casscopes.push(context.containingComponentConfiguration.allSuperConfigurationAssignments)
							val pcl = previousElement.getConfiguredClassifier(casscopes)
							if (pcl !== null) {
								if (!pcl.eIsProxy) {
									pcl.allComponentClassifiers.allModelElements
								} else {
									Collections.EMPTY_LIST
								}
							} else {
								if (previousElement.typeReference === null) {
									// nested component without classifier or primitive type
									previousElement.components + previousElement.features + previousElement.connections
								} else {
									// we do have a classifier or primitive type
									if (previousElement.typeReference.type.eIsProxy) {
										Collections.EMPTY_LIST
									} else if (previousElement.typeReference.type instanceof DataType) {
										previousElement.features
									} else {
										// we have a classifier
										val prevcl = previousElement.typeReference.type as ComponentClassifier
										prevcl?.allClassifierFeatures + prevcl?.allComponents
									}
								}
							}
						}
						Feature: {
							val at = previousElement.type
							if (at instanceof ComponentClassifier) {
								at.allComponentClassifiers.allModelElements
							}
						}
					}
				}
			if (modelElements === null) {
				return IScope::NULLSCOPE
			}
			return new SimpleScope(IScope::NULLSCOPE, Scopes::scopedElementsFor(modelElements,
				QualifiedName::wrapper(SimpleAttributeResolver::NAME_RESOLVER)), false)
		} // ModelElement Reference
		if (context instanceof TypeReference) {
			if (reference == Aadlv3Package.Literals.TYPE_REFERENCE__TYPE) {
				// we have a primitive type, component interface, or configuration parameter reference
				var classifierscope = super.getScope(context, reference)
				val aliases = scopedElementsForImportAlias(context.containingPackage.imports);
				if (!aliases.empty){
					classifierscope = new SimpleScope(classifierscope,aliases, false)
				}
				val conf = context.containingComponentConfiguration
				if (conf !== null) {
					return new SimpleScope(classifierscope,
						Scopes::scopedElementsFor(conf.parameters,
							QualifiedName::wrapper(SimpleAttributeResolver::NAME_RESOLVER)), false)
				} else {
					return classifierscope
				}
			}
		}

		if (context instanceof ConfigurationActual &&
			reference == Aadlv3Package.Literals.CONFIGURATION_ACTUAL__PARAMETER) {
			val ref = context.eContainer
			if (ref instanceof TypeReference) {
				val cl = ref.type
				if (cl instanceof ComponentConfiguration) {
					return new SimpleScope(IScope.NULLSCOPE,
						Scopes::scopedElementsFor(cl.parameters,
							QualifiedName::wrapper(SimpleAttributeResolver::NAME_RESOLVER)), false)
				}
			}
		}
		return super.getScope(context, reference);
	}

	def <T extends EObject> Iterable<IEObjectDescription> scopedElementsForImportAlias(Iterable<Import> elements) {
		val transformed = Iterables.transform(elements, new Function<Import, IEObjectDescription>() {
			override apply(Import from) {
				if (from.alias === null){
					return null;
				}
				val qualifiedName = qnameConverter.toQualifiedName(from.importedNamespace)
				val target = Av3API.lookupComponentClassifier(from, from.importedNamespace)
				if (qualifiedName !== null && target !== null)
					return new EObjectDescription(qualifiedName, target, null);
				return null;
			}
		});
		val res = Iterables.filter(transformed, Predicates.notNull());
		return res;
	}

}
