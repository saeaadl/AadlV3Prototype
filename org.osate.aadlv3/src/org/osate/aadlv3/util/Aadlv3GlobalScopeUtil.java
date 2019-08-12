package org.osate.aadlv3.util;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.osate.aadlv3.aadlv3.Aadlv3Package;
import org.osate.aadlv3.aadlv3.Classifier;
import org.osate.aadlv3.aadlv3.ComponentInterface;
import org.osate.aadlv3.aadlv3.ComponentRealization;
import org.osate.aadlv3.aadlv3.MultiLiteralConstraint;
import org.osate.aadlv3.aadlv3.NamedType;

import com.google.inject.Inject;
import com.google.inject.Injector;

/**
 * Utility class that helps finding globally visible AADL elements by name.
 *
 * @since 2.3.4
 */
public class Aadlv3GlobalScopeUtil {

	@Inject
	static IEClassGlobalScopeProvider globalScopeProvider;
	@Inject
	static ImportedNamespaceAwareLocalScopeProvider nameSpaceScope;

	@Inject
	static IQualifiedNameConverter qnameConverter;

	@Inject
	static IQualifiedNameProvider qnameProvider;

	static {
		Injector injector = IResourceServiceProvider.Registry.INSTANCE
				.getResourceServiceProvider(URI.createFileURI("dummy.av3")).get(Injector.class);
		globalScopeProvider = injector.getInstance(IEClassGlobalScopeProvider.class);
		nameSpaceScope = injector.getInstance(ImportedNamespaceAwareLocalScopeProvider.class);
		qnameConverter = injector.getInstance(IQualifiedNameConverter.class);
		qnameProvider = injector.getInstance(IQualifiedNameProvider.class);
	}

	/**
	 * Find an AADL element by EClass in the global scope. Simple names are also looked up
	 * in predeclared property sets.
	 *
	 * @since 2.3.4
	 *
	 * @param context The starting point for the global scope.
	 * @param eClass The meta class of the element to find.
	 * @param qname The qualified name to search.
	 * @return The EObject that matches class and name, null if the name cannot be found.
	 */
	@SuppressWarnings("unchecked")
	public static <T extends EObject> T get(EObject context, EClass eClass, String qname) {
		T result = null;
		IScope scope = globalScopeProvider.getScope(context.eResource(), eClass);
		IEObjectDescription desc = scope.getSingleElement(qnameConverter.toQualifiedName(qname));
		if (desc != null) {
			EObject o = desc.getEObjectOrProxy();
			if (o.eIsProxy()) {
				o = EcoreUtil.resolve(o, context);
			}
			result = o.eIsProxy() ? null : (T) o;
		}
		return result;
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends EObject> T get(EObject context, EReference eRef, String name) {
		T result = null;
		IScope scope = nameSpaceScope.getScope(context, eRef);
		IEObjectDescription desc = scope.getSingleElement(qnameConverter.toQualifiedName(name));
		if (desc != null) {
			EObject o = desc.getEObjectOrProxy();
			if (o.eIsProxy()) {
				o = EcoreUtil.resolve(o, context);
			}
			result = o.eIsProxy() ? null : (T) o;
		}
		return result;
	}


	/**
	 * Get all global definitions of a specified eClass
	 * @param context used for determining a resourceset for resolution
	 * @param eClass
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T extends EObject> Collection<T> getAll(Resource rsc, EClass eClass) {
		Collection<T> result = new ArrayList<T>();
		IScope scope = globalScopeProvider.getAllScope(rsc, eClass);
		for(IEObjectDescription desc: scope.getAllElements()) {
			if (desc != null) {
				EObject o = desc.getEObjectOrProxy();
				if (o.eIsProxy()) {
					o = EcoreUtil.resolve(o, rsc);
				}
				if (!o.eIsProxy()) result.add((T) o);
			}
		}
		return result;
	}

	
	/** 
	 * Get all extensions of the component interface of eclass.
	 * This can be all classifier (incl. interfaces), realizations, all implementations, or all configurations that are extensions
	 * In addition if the constraint is non-null then the constraint must be satisfied as well
	 * @param context the component interface 
	 * @param eClass
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static  <T extends Classifier> Collection<T> getAllExtensions(Classifier context,EClass eclass,MultiLiteralConstraint productLineQualifierconstraint) {
		Resource rsc = context.eResource();
		Collection<T> result = new ArrayList<T>();
		IScope scope = globalScopeProvider.getAllScope(rsc, eclass);
		for(IEObjectDescription desc: scope.getAllElements()) {
			if (desc != null) {
				EObject o = desc.getEObjectOrProxy();
				if (o.eIsProxy()) {
					o = EcoreUtil.resolve(o, rsc);
				}
				if (!o.eIsProxy()) {
					T cl = (T)o;
					if (Aadlv3Util.isSuperClassifierOf(context, cl)) {
						if (productLineQualifierconstraint == null || Aadlv3Util.satisfies(cl, productLineQualifierconstraint)) {
							result.add(cl);
						}
					}
				}
			}
		}
		return result;
	}

	/**
	 * Get all objects of class eclass (assuming they are Classifiers) that are a extensions of classifier context
	 * This can be all classifier (incl. interfaces), realizations, all implementations, or all configurations that are extensions
	 * @param <T>
	 * @param context
	 * @param eclass
	 * @return
	 */
	public static  <T extends Classifier> Collection<T> getAllExtensions(Classifier context,EClass eclass) {
		return getAllExtensions(context, eclass, null);
	}
	
	/**
	 * Get all extensions of name type context
	 * @param <T>
	 * @param context
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static  <T extends NamedType> Collection<T> getAllExtensions(NamedType context) {
		Resource rsc = context.eResource();
		Collection<T> result = new ArrayList<T>();
		IScope scope = globalScopeProvider.getAllScope(rsc, Aadlv3Package.eINSTANCE.getNamedType());
		for(IEObjectDescription desc: scope.getAllElements()) {
			if (desc != null) {
				EObject o = desc.getEObjectOrProxy();
				if (o.eIsProxy()) {
					o = EcoreUtil.resolve(o, rsc);
				}
				if (!o.eIsProxy()) {
					T tp = (T)o;
					if (Aadlv3Util.isSuperTypeOf(context, tp)) {
						result.add(tp);
					}
				}
			}
		}
		return result;
	}

}
