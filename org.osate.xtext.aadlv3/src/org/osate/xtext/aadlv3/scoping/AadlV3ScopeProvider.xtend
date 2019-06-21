/*
 * generated by Xtext 2.14.0
 */
package org.osate.xtext.aadlv3.scoping

import com.google.common.base.Function
import com.google.common.base.Predicates
import com.google.common.collect.Iterables
import com.google.inject.Inject
import java.util.Collections
import java.util.Stack
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.SimpleScope
import org.eclipse.xtext.util.SimpleAttributeResolver
import org.osate.aadlv3.aadlv3.Aadlv3Package
import org.osate.aadlv3.aadlv3.Association
import org.osate.aadlv3.aadlv3.Component
import org.osate.aadlv3.aadlv3.ComponentClassifier
import org.osate.aadlv3.aadlv3.ComponentConfiguration
import org.osate.aadlv3.aadlv3.ComponentInterface
import org.osate.aadlv3.aadlv3.ConfigurationActual
import org.osate.aadlv3.aadlv3.ConfigurationAssignment
import org.osate.aadlv3.aadlv3.Feature
import org.osate.aadlv3.aadlv3.Import
import org.osate.aadlv3.aadlv3.ModelElementReference
import org.osate.aadlv3.aadlv3.PackageElement
import org.osate.aadlv3.aadlv3.PathSequence
import org.osate.aadlv3.aadlv3.PropertyAssociation
import org.osate.aadlv3.aadlv3.TypeReference
import org.osate.aadlv3.util.Av3API

import static extension org.osate.aadlv3.util.Aadlv3Util.*
import org.osate.xtext.aadlv3.naming.AadlV3QualifiedNameConverter

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class AadlV3ScopeProvider extends AbstractAadlV3ScopeProvider {

	static IQualifiedNameConverter qnameConverter = new AadlV3QualifiedNameConverter;

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
									container.allModelElements 
								}
								Component: {
									container.allModelElements 
								}
							}
						}
						ConfigurationAssignment,
						PropertyAssociation: {
							switch ccc: cc.eContainer {
								ComponentClassifier:
									ccc.allModelElements
								Component: {
									ccc.allModelElements 
								}
								ConfigurationAssignment: {
									// enclosing configuration assignment may configure a classifier or it may be empty, thus, we need to go to its target
									// We only need to go to the enclosing configuration assignment as it acts as the root context for resolving the model element reference path
									if (!ccc.assignedClassifiers.empty) {
										val topdt = ccc.assignedClassifiers.topDataType
										if (topdt !== null){
											Collections.EMPTY_LIST
										} else{
											val topimpl = ccc.assignedClassifiers.topComponentImplementation
											if (topimpl !== null){
												topimpl.allModelElements
											}
										}
									} else {
										// container is a configuration assignment with a configuration parameter reference on the right
										// or without a value on the right
										// We need to look at the classifier associated with the target on the left
										val el = ccc.target?.element;
										if (el instanceof Component) {
											val casscopes = new Stack<Iterable<ConfigurationAssignment>>()
											casscopes.push(
												context.containingComponentClassifier.allSuperConfigurationAssignments)
											el.getConfiguredTypeReferences(casscopes).allModelElements 
										} else if (el instanceof Feature) {
											val ftype = el?.typeReference?.type
											if (ftype instanceof ComponentInterface) {
												ftype.allFeatures
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
							casscopes.push(context.containingComponentClassifier.allSuperConfigurationAssignments)
							val ptrs = previousElement.getConfiguredTypeReferences(casscopes)
							if (!ptrs.empty && !ptrs.isDataType) {
								ptrs.allModelElements
							} else {
								previousElement.allModelElements
							}
						}
						Feature: {
							val at = previousElement?.typeReference?.type
							if (at instanceof ComponentClassifier) {
								at.allModelElements
							}
						}
					}
				}
			if (modelElements === null || modelElements.empty) {
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
				val importedname = from.importedNamespace
				if (!importedname.endsWith("::*")){
					val qualifiedName = qnameConverter.toQualifiedName(from.alias)
					val target = Av3API.lookupPackageElement(from, importedname)
					if (qualifiedName !== null && target !== null){
						return new EObjectDescription(qualifiedName, target, null)
					}
				}
				return null;
			}
		});
		var res = Iterables.filter(transformed, Predicates.notNull());
		for (import : elements) {
			if (import.alias !== null){
				val importedname = import.importedNamespace
				if (importedname.endsWith("::*") && import.alias !== null){
					val packagename = importedname.substring(0,importedname.length-3)
					val pkg = Av3API.lookupPackage(import, packagename)
					if (pkg !== null){
						val content = pkg.elements
						val pkgres = Iterables.transform(content, new Function<PackageElement, IEObjectDescription>(){
							override apply(PackageElement elem){
								val qualifiedName = qnameConverter.toQualifiedName(import.alias).append(elem.name)
								return new EObjectDescription(qualifiedName, elem, null);
							}
						})
						res = res + pkgres
					}
				}
			}
		}
		return res;
	}

}
