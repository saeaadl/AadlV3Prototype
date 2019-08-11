package org.osate.aadlv3.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.scoping.IScope;

import com.google.common.base.Predicate;
import com.google.inject.ImplementedBy;

@ImplementedBy(EClassGlobalScopeProvider.class)
public interface IEClassGlobalScopeProvider extends IGlobalScopeProvider {

	IScope getScope(Resource resource, EClass type, Predicate<IEObjectDescription> filter);

	IScope getScope(Resource resource, EClass type);
	
	IScope getAllScope( final Resource containerContext,  EClass type) ;

	IScope getAllScope( final Resource containerContext,  EClass type, Predicate<IEObjectDescription> filter);

}
