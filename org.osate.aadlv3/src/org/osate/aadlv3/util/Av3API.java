package org.osate.aadlv3.util;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.osate.aadlv3.aadlv3.Aadlv3Package;
import org.osate.aadlv3.aadlv3.Classifier;
import org.osate.aadlv3.aadlv3.ComponentConfiguration;
import org.osate.aadlv3.aadlv3.ComponentImplementation;
import org.osate.aadlv3.aadlv3.ComponentInterface;
import org.osate.aadlv3.aadlv3.ComponentRealization;
import org.osate.aadlv3.aadlv3.Import;
import org.osate.aadlv3.aadlv3.MultiLiteralConstraint;
import org.osate.aadlv3.aadlv3.PackageDeclaration;
import org.osate.aadlv3.aadlv3.PackageElement;
import org.osate.aadlv3.aadlv3.PropertyDefinition;
import org.osate.aadlv3.aadlv3.PropertySet;
import org.osate.aadlv3.aadlv3.TypeDef;
import org.osate.aadlv3.aadlv3.Workingset;

public class Av3API {

	
	public static PropertyDefinition lookupPropertyDefinition(EObject context, String qpname) {
		return Aadlv3GlobalScopeUtil.get(context, Aadlv3Package.eINSTANCE.getPropertyDefinition(), qpname);
	}
	
	public static Collection<PropertyDefinition> getAllPropertyDefinitions(EObject context) {
		return Aadlv3GlobalScopeUtil.getAll(context.eResource(), Aadlv3Package.eINSTANCE.getPropertyDefinition());
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

	public static TypeDef lookupTypeDef(EObject context, String qpname) {
		return Aadlv3GlobalScopeUtil.get(context, Aadlv3Package.eINSTANCE.getTypeDef(), qpname);
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
			String ifname = Aadlv3Util.stripExtensionInName(iname);
			PackageDeclaration pkg = Aadlv3Util.getContainingPackage(ccl);
			for (Import importdecl : pkg.getImports()) {
				if (importdecl.getAlias() != null && importdecl.getAlias().equals(ifname)){
					ifname = importdecl.getImportedNamespace();
				}
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

	/**
	 * get all extensions of a given classifier 
	 * This includes component interfaces, implementations, and configurations.
	 * @param cl
	 * @return
	 */
	public static Collection<Classifier> getAllClassifierExtensions(Classifier cl) {
		return Aadlv3GlobalScopeUtil.getAllExtensions(cl, Aadlv3Package.eINSTANCE.getClassifier());
	}

	/**
	 * get all realizations of a given component interface
	 * @param cinterface
	 * @return
	 */
	public static Collection<ComponentRealization> getAllRealizations(ComponentInterface cinterface) {
		return Aadlv3GlobalScopeUtil.getAllExtensions(cinterface, Aadlv3Package.eINSTANCE.getComponentRealization());
	}

	/**
	 * get all implementations of a given component interface
	 * @param cinterface
	 * @return
	 */
	public static Collection<ComponentImplementation> getAllImplementations(ComponentInterface cinterface) {
		return Aadlv3GlobalScopeUtil.getAllExtensions(cinterface, Aadlv3Package.eINSTANCE.getComponentImplementation());
	}

	/**
	 * get all configurations of a given component interface
	 * @param cinterface
	 * @return
	 */
	public static Collection<ComponentConfiguration> getAllConfigurations(ComponentInterface cinterface) {
		return Aadlv3GlobalScopeUtil.getAllExtensions(cinterface, Aadlv3Package.eINSTANCE.getComponentConfiguration());
	}

	/**
	 * get all realizations of a given component interface that satisfy the specified Product Line Qualifier constraint
	 * @param cinterface
	 * @return
	 */
	public static Collection<ComponentRealization> getConfigurableRealizations(ComponentInterface classifier, MultiLiteralConstraint productLineQualifierconstraint) {
		Collection<ComponentRealization> all = Aadlv3GlobalScopeUtil.getAllExtensions(classifier, Aadlv3Package.eINSTANCE.getComponentRealization(),productLineQualifierconstraint);
		return all;
	}
	
}
