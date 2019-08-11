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
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.osate.aadlv3.aadlv3.Classifier;
import org.osate.aadlv3.aadlv3.ComponentInterface;

import com.google.common.base.Predicate;
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
	 * Get all global definitions in specified context
	 * Primarily used to get all implementations or configurations for a given interface
	 * @param context the component interface (or other context object whose global content is to be returned
	 * @param eClass
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T extends EObject> Collection<T> getAllInContext(ComponentInterface context, EClass eClass) {
		Collection<T> result = new ArrayList<T>();
		final QualifiedName qn = qnameProvider.getFullyQualifiedName(context);
		final String ifname = qn.getLastSegment();
		IScope scope = globalScopeProvider.getAllScope(context.eResource(), eClass,new Predicate<IEObjectDescription>() {
			@Override
			public boolean apply(IEObjectDescription input) {
				return ifname.equals(Aadlv3Util.stripExtensionInName(input.getQualifiedName().getLastSegment()));
			}
		});
		for(IEObjectDescription desc: scope.getAllElements()) {
			if (desc != null) {
				EObject o = desc.getEObjectOrProxy();
				if (o.eIsProxy()) {
					o = EcoreUtil.resolve(o, context);
				}
				if (!o.eIsProxy()) result.add((T) o);
			}
		}
		return result;
	}

}
