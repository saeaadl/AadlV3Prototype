package org.osate.aadlv3.util;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider;

import com.google.common.base.Predicate;
import com.google.common.collect.Lists;

/**
 * Global scope provider that can build scopes for EClasses.
 * It just exposes methods that are not public in DefaultGlobalScopeProvider.
 */
public class EClassGlobalScopeProvider extends DefaultGlobalScopeProvider implements IEClassGlobalScopeProvider {

	@Override
	public IScope getScope(Resource resource, EClass type, Predicate<IEObjectDescription> filter) {
		return getScope(resource, false, type, filter);
	}

	@Override
	public IScope getScope(Resource resource, EClass type) {
		return getScope(resource, type, null);
	}


	public IScope getAllScope( final Resource containerContext,  EClass type) {
		return getAllScope(containerContext,type, null);
	}
	
	public IScope getAllScope( final Resource containerContext,  EClass type, Predicate<IEObjectDescription> filter) {
		IScope result = IScope.NULLSCOPE;
		List<IContainer> containers = Lists.newArrayList(getVisibleContainers(containerContext));
		Collections.reverse(containers);
		Iterator<IContainer> iter = containers.iterator();
		while (iter.hasNext()) {
			IContainer container = iter.next();
			result = createContainerScope(result, container, filter, type, false);
		}
		return result;
	}

	
}
