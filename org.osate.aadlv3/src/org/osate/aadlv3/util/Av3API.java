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
import org.osate.aadlv3.aadlv3.PrimitiveType;
import org.osate.aadlv3.aadlv3.Property;
import org.osate.aadlv3.aadlv3.PropertySet;
import org.osate.aadlv3.aadlv3.Workingset;

public class Av3API {

	
	public static Property lookupProperty(EObject context, String qpname) {
		return Aadlv3GlobalScopeUtil.get(context, Aadlv3Package.eINSTANCE.getProperty(), qpname);
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

	public static PrimitiveType lookupPrimitiveType(EObject context, String qpname) {
		return Aadlv3GlobalScopeUtil.get(context, Aadlv3Package.eINSTANCE.getPrimitiveType(), qpname);
	}

	public static Workingset lookupWorkingset(EObject context, String qpname) {
		return Aadlv3GlobalScopeUtil.get(context, Aadlv3Package.eINSTANCE.getWorkingset(), qpname);
	}

	public static ComponentInterface getComponentInterface(ComponentRealization creal) {
		if (creal.getInterface() != null) {
			return creal.getInterface();
		}
		String iname = creal.getName();
		String ifname = iname.substring(0,iname.lastIndexOf('.'));
		 ComponentInterface cif = (ComponentInterface) Aadlv3GlobalScopeUtil.get(creal, Aadlv3Package.eINSTANCE.getComponentRealization_Interface(), ifname);
		 if (cif != null) {
			 creal.setInterface(cif);
		 }
		 return cif;
	}


	public static Collection<ComponentRealization> getComponentRealizations(ComponentInterface cinterface) {
		return Aadlv3GlobalScopeUtil.getAll(cinterface, Aadlv3Package.eINSTANCE.getComponentRealization());
	}

	public static Collection<ComponentImplementation> getComponentImplementations(ComponentInterface cinterface) {
		return Aadlv3GlobalScopeUtil.getAll(cinterface, Aadlv3Package.eINSTANCE.getComponentImplementation());
	}

	public static Collection<ComponentConfiguration> getComponentConfigurations(ComponentInterface cinterface) {
		return Aadlv3GlobalScopeUtil.getAll(cinterface, Aadlv3Package.eINSTANCE.getComponentConfiguration());
	}
	
}
