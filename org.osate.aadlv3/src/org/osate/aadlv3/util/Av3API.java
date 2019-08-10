package org.osate.aadlv3.util;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.osate.aadlv3.aadlv3.Aadlv3Package;
import org.osate.aadlv3.aadlv3.Classifier;
import org.osate.aadlv3.aadlv3.ComponentConfiguration;
import org.osate.aadlv3.aadlv3.ComponentImplementation;
import org.osate.aadlv3.aadlv3.ComponentInterface;
import org.osate.aadlv3.aadlv3.ComponentRealization;
import org.osate.aadlv3.aadlv3.PackageDeclaration;
import org.osate.aadlv3.aadlv3.PackageElement;
import org.osate.aadlv3.aadlv3.PropertyDefinition;
import org.osate.aadlv3.aadlv3.PropertySet;
import org.osate.aadlv3.aadlv3.TypeDecl;
import org.osate.aadlv3.aadlv3.Workingset;

public class Av3API {

	
	public static PropertyDefinition lookupPropertyDefinition(EObject context, String qpname) {
		return Aadlv3GlobalScopeUtil.get(context, Aadlv3Package.eINSTANCE.getPropertyDefinition(), qpname);
	}
	
	public static Collection<PropertyDefinition> getAllPropertyDefinitions(EObject context) {
		return Aadlv3GlobalScopeUtil.getAll(context, Aadlv3Package.eINSTANCE.getPropertyDefinition());
	}
	
	public static PropertySet lookupPropertySet(EObject context, String qpname) {
		return Aadlv3GlobalScopeUtil.get(context, Aadlv3Package.eINSTANCE.getPropertySet(), qpname);
	}

	public static PackageDeclaration lookupPackage(EObject context, String qpname) {
		return Aadlv3GlobalScopeUtil.get(context, Aadlv3Package.eINSTANCE.getPackageDeclaration(), qpname);
	}

	public static Classifier lookupClassifier(EObject context, String qpname) {
		return Aadlv3GlobalScopeUtil.get(context, Aadlv3Package.eINSTANCE.getClassifier(), qpname);
	}

	public static TypeDecl lookupTypeDecl(EObject context, String qpname) {
		return Aadlv3GlobalScopeUtil.get(context, Aadlv3Package.eINSTANCE.getTypeDecl(), qpname);
	}

	public static Workingset lookupWorkingset(EObject context, String qpname) {
		return Aadlv3GlobalScopeUtil.get(context, Aadlv3Package.eINSTANCE.getWorkingset(), qpname);
	}

	public static PackageElement lookupPackageElement(EObject context, String qpname) {
		return Aadlv3GlobalScopeUtil.get(context, Aadlv3Package.eINSTANCE.getPackageElement(), qpname);
	}

	public static ComponentInterface getInterface(Classifier ccl) {
		if (ccl instanceof ComponentRealization) {
			ComponentRealization creal = (ComponentRealization) ccl;
			if (creal.getCachedInterfaceReference() != null) {
				return creal.getCachedInterfaceReference();
			}
			String iname = creal.getName();
			String ifname = iname;
			int idx = iname.lastIndexOf('.');
			if (idx >= 0) {
				ifname = iname.substring(0, idx);
			}
			ComponentInterface cif = (ComponentInterface) Aadlv3GlobalScopeUtil.get(creal,
					Aadlv3Package.eINSTANCE.getComponentRealization_CachedInterfaceReference(), ifname);
			if (cif != null) {
				creal.setCachedInterfaceReference(cif);
			}
			return cif;
		} else {
			return (ComponentInterface) ccl;
		}
	}

	public static Collection<ComponentRealization> getAllRealizations(ComponentInterface cinterface) {
		return Aadlv3GlobalScopeUtil.getAllInContext(cinterface, Aadlv3Package.eINSTANCE.getComponentRealization());
	}

	public static Collection<ComponentImplementation> getAllImplementations(ComponentInterface cinterface) {
		return Aadlv3GlobalScopeUtil.getAllInContext(cinterface, Aadlv3Package.eINSTANCE.getComponentImplementation());
	}

	public static Collection<ComponentConfiguration> getAllConfigurations(ComponentInterface cinterface) {
		return Aadlv3GlobalScopeUtil.getAllInContext(cinterface, Aadlv3Package.eINSTANCE.getComponentConfiguration());
	}

	public static Collection<ComponentRealization> getConfigurableRealizations(Classifier classifier) {
		ComponentInterface cinterface = getInterface(classifier);
		Collection<ComponentRealization> allif = Aadlv3GlobalScopeUtil.getAllInContext(cinterface, Aadlv3Package.eINSTANCE.getComponentRealization());
//		allif.stream().filter(uri -> uri.getHost().equals("www.jgrapht.org")).findAny();
		Collection<ComponentRealization> all = Aadlv3GlobalScopeUtil.getAllInContext(classifier, Aadlv3Package.eINSTANCE.getComponentRealization());
		return all;
	}
	
}
