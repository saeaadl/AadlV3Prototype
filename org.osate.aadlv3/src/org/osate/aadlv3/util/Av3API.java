package org.osate.aadlv3.util;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.osate.aadlv3.aadlv3.Aadlv3Package;
import org.osate.aadlv3.aadlv3.ComponentClassifier;
import org.osate.aadlv3.aadlv3.ComponentConfiguration;
import org.osate.aadlv3.aadlv3.ComponentImplementation;
import org.osate.aadlv3.aadlv3.ComponentInterface;
import org.osate.aadlv3.aadlv3.ComponentRealization;
import org.osate.aadlv3.aadlv3.PackageDeclaration;
import org.osate.aadlv3.aadlv3.PackageElement;
import org.osate.aadlv3.aadlv3.DataType;
import org.osate.aadlv3.aadlv3.PropertyDefinition;
import org.osate.aadlv3.aadlv3.PropertySet;
import org.osate.aadlv3.aadlv3.Workingset;

public class Av3API {

	
	public static PropertyDefinition lookupPropertyDefinition(EObject context, String qpname) {
		return Aadlv3GlobalScopeUtil.get(context, Aadlv3Package.eINSTANCE.getPropertyDefinition(), qpname);
	}
	
	public static PropertySet lookupPropertySet(EObject context, String qpname) {
		return Aadlv3GlobalScopeUtil.get(context, Aadlv3Package.eINSTANCE.getPropertySet(), qpname);
	}

	public static PackageDeclaration lookupPackage(EObject context, String qpname) {
		return Aadlv3GlobalScopeUtil.get(context, Aadlv3Package.eINSTANCE.getPackageDeclaration(), qpname);
	}

	public static ComponentClassifier lookupComponentClassifier(EObject context, String qpname) {
		return Aadlv3GlobalScopeUtil.get(context, Aadlv3Package.eINSTANCE.getComponentClassifier(), qpname);
	}

	public static DataType lookupDataType(EObject context, String qpname) {
		return Aadlv3GlobalScopeUtil.get(context, Aadlv3Package.eINSTANCE.getDataType(), qpname);
	}

	public static Workingset lookupWorkingset(EObject context, String qpname) {
		return Aadlv3GlobalScopeUtil.get(context, Aadlv3Package.eINSTANCE.getWorkingset(), qpname);
	}

	public static PackageElement lookupPackageElement(EObject context, String qpname) {
		return Aadlv3GlobalScopeUtil.get(context, Aadlv3Package.eINSTANCE.getPackageElement(), qpname);
	}

	public static ComponentInterface getComponentInterface(ComponentClassifier ccl) {
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

	public static Collection<ComponentRealization> getComponentRealizations(ComponentInterface cinterface) {
		return Aadlv3GlobalScopeUtil.getAllInContext(cinterface, Aadlv3Package.eINSTANCE.getComponentRealization());
	}

	public static Collection<ComponentImplementation> getComponentImplementations(ComponentInterface cinterface) {
		return Aadlv3GlobalScopeUtil.getAllInContext(cinterface, Aadlv3Package.eINSTANCE.getComponentImplementation());
	}

	public static Collection<ComponentConfiguration> getComponentConfigurations(ComponentInterface cinterface) {
		return Aadlv3GlobalScopeUtil.getAllInContext(cinterface, Aadlv3Package.eINSTANCE.getComponentConfiguration());
	}
	
}
