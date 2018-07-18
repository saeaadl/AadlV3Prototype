package org.osate.aadlv3.util;

import org.eclipse.emf.ecore.EObject;
import org.osate.aadlv3.aadlv3.Aadlv3Package;
import org.osate.aadlv3.aadlv3.ComponentInterface;
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

	public static ComponentInterface lookupComponentInterface(EObject context, String qpname) {
		return Aadlv3GlobalScopeUtil.get(context, Aadlv3Package.eINSTANCE.getComponentInterface(), qpname);
	}

	public static PrimitiveType lookupPrimitiveType(EObject context, String qpname) {
		return Aadlv3GlobalScopeUtil.get(context, Aadlv3Package.eINSTANCE.getPrimitiveType(), qpname);
	}

	public static Workingset lookupWorkingset(EObject context, String qpname) {
		return Aadlv3GlobalScopeUtil.get(context, Aadlv3Package.eINSTANCE.getWorkingset(), qpname);
	}

}
