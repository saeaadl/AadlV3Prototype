/**
 * Copyright 2018 Carnegie Mellon University. All Rights Reserved.
 * 
 * NO WARRANTY. THIS CARNEGIE MELLON UNIVERSITY AND SOFTWARE ENGINEERING INSTITUTE
 * MATERIAL IS FURNISHED ON AN "AS-IS" BASIS. CARNEGIE MELLON UNIVERSITY MAKES NO
 * WARRANTIES OF ANY KIND, EITHER EXPRESSED OR IMPLIED, AS TO ANY MATTER INCLUDING,
 * BUT NOT LIMITED TO, WARRANTY OF FITNESS FOR PURPOSE OR MERCHANTABILITY,
 * EXCLUSIVITY, OR RESULTS OBTAINED FROM USE OF THE MATERIAL. CARNEGIE MELLON
 * UNIVERSITY DOES NOT MAKE ANY WARRANTY OF ANY KIND WITH RESPECT TO FREEDOM FROM
 * PATENT, TRADEMARK, OR COPYRIGHT INFRINGEMENT.
 * 
 * Released under the Eclipse Public License (http://www.eclipse.org/org/documents/epl-v10.php)
 * 
 * See COPYRIGHT file for full details.
 */
package org.osate.aadlv3.aadlv3.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.osate.aadlv3.aadlv3.Aadlv3Factory;
import org.osate.aadlv3.aadlv3.Aadlv3Package;
import org.osate.aadlv3.aadlv3.Association;
import org.osate.aadlv3.aadlv3.AssociationType;
import org.osate.aadlv3.aadlv3.Component;
import org.osate.aadlv3.aadlv3.ComponentCategory;
import org.osate.aadlv3.aadlv3.ComponentClassifier;
import org.osate.aadlv3.aadlv3.ComponentConfiguration;
import org.osate.aadlv3.aadlv3.ComponentImplementation;
import org.osate.aadlv3.aadlv3.ComponentInterface;
import org.osate.aadlv3.aadlv3.ComponentRealization;
import org.osate.aadlv3.aadlv3.ConfigurationActual;
import org.osate.aadlv3.aadlv3.ConfigurationAssignment;
import org.osate.aadlv3.aadlv3.ConfigurationAssignmentPattern;
import org.osate.aadlv3.aadlv3.ConfigurationParameter;
import org.osate.aadlv3.aadlv3.DataType;
import org.osate.aadlv3.aadlv3.Feature;
import org.osate.aadlv3.aadlv3.FeatureCategory;
import org.osate.aadlv3.aadlv3.FeatureDirection;
import org.osate.aadlv3.aadlv3.Import;
import org.osate.aadlv3.aadlv3.ModelElement;
import org.osate.aadlv3.aadlv3.ModelElementReference;
import org.osate.aadlv3.aadlv3.NamedElement;
import org.osate.aadlv3.aadlv3.PackageDeclaration;
import org.osate.aadlv3.aadlv3.PackageElement;
import org.osate.aadlv3.aadlv3.PathElement;
import org.osate.aadlv3.aadlv3.PathSequence;
import org.osate.aadlv3.aadlv3.PropertyAssociation;
import org.osate.aadlv3.aadlv3.PropertyAssociationType;
import org.osate.aadlv3.aadlv3.PropertyDefinition;
import org.osate.aadlv3.aadlv3.PropertySet;
import org.osate.aadlv3.aadlv3.PropertyValue;
import org.osate.aadlv3.aadlv3.Type;
import org.osate.aadlv3.aadlv3.TypeReference;
import org.osate.aadlv3.aadlv3.Workingset;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Aadlv3PackageImpl extends EPackageImpl implements Aadlv3Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertySetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationAssignmentPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationActualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workingsetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathSequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum componentCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum featureCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum featureDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum associationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum propertyAssociationTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Aadlv3PackageImpl() {
		super(eNS_URI, Aadlv3Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Aadlv3Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Aadlv3Package init() {
		if (isInited)
			return (Aadlv3Package) EPackage.Registry.INSTANCE.getEPackage(Aadlv3Package.eNS_URI);

		// Obtain or create and register package
		Object registeredAadlv3Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Aadlv3PackageImpl theAadlv3Package = registeredAadlv3Package instanceof Aadlv3PackageImpl
				? (Aadlv3PackageImpl) registeredAadlv3Package
				: new Aadlv3PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theAadlv3Package.createPackageContents();

		// Initialize created meta-data
		theAadlv3Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAadlv3Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Aadlv3Package.eNS_URI, theAadlv3Package);
		return theAadlv3Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackageDeclaration() {
		return packageDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackageDeclaration_Imports() {
		return (EReference) packageDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackageDeclaration_Elements() {
		return (EReference) packageDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackageElement() {
		return packageElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPackageElement_Private() {
		return (EAttribute) packageElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyDefinition() {
		return propertyDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyDefinition_Type() {
		return (EReference) propertyDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyDefinition_ComponentCategories() {
		return (EAttribute) propertyDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyDefinition_FeatureCategories() {
		return (EAttribute) propertyDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyDefinition_AssociationTypes() {
		return (EAttribute) propertyDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertySet() {
		return propertySetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertySet_Properties() {
		return (EReference) propertySetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelElement() {
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelElement_PropertyAssociations() {
		return (EReference) modelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataType_PropertyAssociations() {
		return (EReference) dataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentClassifier() {
		return componentClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentClassifier_Category() {
		return (EAttribute) componentClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentClassifier_SuperClassifiers() {
		return (EReference) componentClassifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentClassifier_PropertyAssociations() {
		return (EReference) componentClassifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentInterface() {
		return componentInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentInterface_Features() {
		return (EReference) componentInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentInterface_Flows() {
		return (EReference) componentInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentInterface_UseProperties() {
		return (EReference) componentInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentImplementation() {
		return componentImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementation_Components() {
		return (EReference) componentImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementation_Connections() {
		return (EReference) componentImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementation_ConfigurationAssignments() {
		return (EReference) componentImplementationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementation_FlowAssignments() {
		return (EReference) componentImplementationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementation_Paths() {
		return (EReference) componentImplementationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementation_Bindings() {
		return (EReference) componentImplementationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentConfiguration() {
		return componentConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentConfiguration_Parameters() {
		return (EReference) componentConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentConfiguration_ConfigurationAssignments() {
		return (EReference) componentConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentConfiguration_Parameterized() {
		return (EAttribute) componentConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentConfiguration_Bindings() {
		return (EReference) componentConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_Direction() {
		return (EAttribute) featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_Sampled() {
		return (EAttribute) featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_Category() {
		return (EAttribute) featureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_Reverse() {
		return (EAttribute) featureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_Type() {
		return (EReference) featureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Category() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_TypeReferences() {
		return (EReference) componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Components() {
		return (EReference) componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Bindings() {
		return (EReference) componentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Connections() {
		return (EReference) componentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Features() {
		return (EReference) componentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImport() {
		return importEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImport_ImportedNamespace() {
		return (EAttribute) importEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImport_Alias() {
		return (EAttribute) importEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssociation_AssociationType() {
		return (EAttribute) associationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociation_Source() {
		return (EReference) associationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociation_Destination() {
		return (EReference) associationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfigurationAssignment() {
		return configurationAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfigurationAssignment_Target() {
		return (EReference) configurationAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfigurationAssignment_ConfigurationAssignments() {
		return (EReference) configurationAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfigurationAssignment_AssignedClassifiers() {
		return (EReference) configurationAssignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfigurationAssignment_PropertyAssociations() {
		return (EReference) configurationAssignmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfigurationAssignment_Bindings() {
		return (EReference) configurationAssignmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfigurationAssignmentPattern() {
		return configurationAssignmentPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfigurationAssignmentPattern_TargetPattern() {
		return (EReference) configurationAssignmentPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelElementReference() {
		return modelElementReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelElementReference_Element() {
		return (EReference) modelElementReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelElementReference_Context() {
		return (EReference) modelElementReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfigurationParameter() {
		return configurationParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfigurationParameter_Type() {
		return (EReference) configurationParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeReference() {
		return typeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTypeReference_Reverse() {
		return (EAttribute) typeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeReference_Type() {
		return (EReference) typeReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeReference_Actuals() {
		return (EReference) typeReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfigurationActual() {
		return configurationActualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfigurationActual_Parameter() {
		return (EReference) configurationActualEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfigurationActual_AssignedClassifiers() {
		return (EReference) configurationActualEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkingset() {
		return workingsetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkingset_RootComponents() {
		return (EReference) workingsetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkingset_UseProperties() {
		return (EReference) workingsetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyValue() {
		return propertyValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyValue_Value() {
		return (EAttribute) propertyValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyValue_Unit() {
		return (EAttribute) propertyValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyAssociation() {
		return propertyAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyAssociation_Target() {
		return (EReference) propertyAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyAssociation_Property() {
		return (EReference) propertyAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyAssociation_Value() {
		return (EReference) propertyAssociationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyAssociation_PropertyAssociationType() {
		return (EAttribute) propertyAssociationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPathElement() {
		return pathElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPathElement_Previous() {
		return (EReference) pathElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPathElement_Next() {
		return (EReference) pathElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPathSequence() {
		return pathSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPathSequence_Target() {
		return (EReference) pathSequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPathSequence_Elements() {
		return (EReference) pathSequenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentRealization() {
		return componentRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentRealization_CachedInterfaceReference() {
		return (EReference) componentRealizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getComponentCategory() {
		return componentCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFeatureCategory() {
		return featureCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFeatureDirection() {
		return featureDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAssociationType() {
		return associationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPropertyAssociationType() {
		return propertyAssociationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aadlv3Factory getAadlv3Factory() {
		return (Aadlv3Factory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		packageDeclarationEClass = createEClass(PACKAGE_DECLARATION);
		createEReference(packageDeclarationEClass, PACKAGE_DECLARATION__IMPORTS);
		createEReference(packageDeclarationEClass, PACKAGE_DECLARATION__ELEMENTS);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		packageElementEClass = createEClass(PACKAGE_ELEMENT);
		createEAttribute(packageElementEClass, PACKAGE_ELEMENT__PRIVATE);

		propertyDefinitionEClass = createEClass(PROPERTY_DEFINITION);
		createEReference(propertyDefinitionEClass, PROPERTY_DEFINITION__TYPE);
		createEAttribute(propertyDefinitionEClass, PROPERTY_DEFINITION__COMPONENT_CATEGORIES);
		createEAttribute(propertyDefinitionEClass, PROPERTY_DEFINITION__FEATURE_CATEGORIES);
		createEAttribute(propertyDefinitionEClass, PROPERTY_DEFINITION__ASSOCIATION_TYPES);

		propertySetEClass = createEClass(PROPERTY_SET);
		createEReference(propertySetEClass, PROPERTY_SET__PROPERTIES);

		modelElementEClass = createEClass(MODEL_ELEMENT);
		createEReference(modelElementEClass, MODEL_ELEMENT__PROPERTY_ASSOCIATIONS);

		typeEClass = createEClass(TYPE);

		dataTypeEClass = createEClass(DATA_TYPE);
		createEReference(dataTypeEClass, DATA_TYPE__PROPERTY_ASSOCIATIONS);

		componentClassifierEClass = createEClass(COMPONENT_CLASSIFIER);
		createEAttribute(componentClassifierEClass, COMPONENT_CLASSIFIER__CATEGORY);
		createEReference(componentClassifierEClass, COMPONENT_CLASSIFIER__SUPER_CLASSIFIERS);
		createEReference(componentClassifierEClass, COMPONENT_CLASSIFIER__PROPERTY_ASSOCIATIONS);

		componentRealizationEClass = createEClass(COMPONENT_REALIZATION);
		createEReference(componentRealizationEClass, COMPONENT_REALIZATION__CACHED_INTERFACE_REFERENCE);

		componentInterfaceEClass = createEClass(COMPONENT_INTERFACE);
		createEReference(componentInterfaceEClass, COMPONENT_INTERFACE__FEATURES);
		createEReference(componentInterfaceEClass, COMPONENT_INTERFACE__FLOWS);
		createEReference(componentInterfaceEClass, COMPONENT_INTERFACE__USE_PROPERTIES);

		componentImplementationEClass = createEClass(COMPONENT_IMPLEMENTATION);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__COMPONENTS);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__CONNECTIONS);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__CONFIGURATION_ASSIGNMENTS);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__FLOW_ASSIGNMENTS);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__PATHS);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__BINDINGS);

		componentConfigurationEClass = createEClass(COMPONENT_CONFIGURATION);
		createEReference(componentConfigurationEClass, COMPONENT_CONFIGURATION__PARAMETERS);
		createEReference(componentConfigurationEClass, COMPONENT_CONFIGURATION__CONFIGURATION_ASSIGNMENTS);
		createEAttribute(componentConfigurationEClass, COMPONENT_CONFIGURATION__PARAMETERIZED);
		createEReference(componentConfigurationEClass, COMPONENT_CONFIGURATION__BINDINGS);

		featureEClass = createEClass(FEATURE);
		createEAttribute(featureEClass, FEATURE__DIRECTION);
		createEAttribute(featureEClass, FEATURE__SAMPLED);
		createEAttribute(featureEClass, FEATURE__CATEGORY);
		createEAttribute(featureEClass, FEATURE__REVERSE);
		createEReference(featureEClass, FEATURE__TYPE);

		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__CATEGORY);
		createEReference(componentEClass, COMPONENT__TYPE_REFERENCES);
		createEReference(componentEClass, COMPONENT__COMPONENTS);
		createEReference(componentEClass, COMPONENT__BINDINGS);
		createEReference(componentEClass, COMPONENT__CONNECTIONS);
		createEReference(componentEClass, COMPONENT__FEATURES);

		importEClass = createEClass(IMPORT);
		createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);
		createEAttribute(importEClass, IMPORT__ALIAS);

		associationEClass = createEClass(ASSOCIATION);
		createEAttribute(associationEClass, ASSOCIATION__ASSOCIATION_TYPE);
		createEReference(associationEClass, ASSOCIATION__SOURCE);
		createEReference(associationEClass, ASSOCIATION__DESTINATION);

		pathSequenceEClass = createEClass(PATH_SEQUENCE);
		createEReference(pathSequenceEClass, PATH_SEQUENCE__TARGET);
		createEReference(pathSequenceEClass, PATH_SEQUENCE__ELEMENTS);

		pathElementEClass = createEClass(PATH_ELEMENT);
		createEReference(pathElementEClass, PATH_ELEMENT__PREVIOUS);
		createEReference(pathElementEClass, PATH_ELEMENT__NEXT);

		configurationAssignmentEClass = createEClass(CONFIGURATION_ASSIGNMENT);
		createEReference(configurationAssignmentEClass, CONFIGURATION_ASSIGNMENT__TARGET);
		createEReference(configurationAssignmentEClass, CONFIGURATION_ASSIGNMENT__CONFIGURATION_ASSIGNMENTS);
		createEReference(configurationAssignmentEClass, CONFIGURATION_ASSIGNMENT__ASSIGNED_CLASSIFIERS);
		createEReference(configurationAssignmentEClass, CONFIGURATION_ASSIGNMENT__PROPERTY_ASSOCIATIONS);
		createEReference(configurationAssignmentEClass, CONFIGURATION_ASSIGNMENT__BINDINGS);

		configurationAssignmentPatternEClass = createEClass(CONFIGURATION_ASSIGNMENT_PATTERN);
		createEReference(configurationAssignmentPatternEClass, CONFIGURATION_ASSIGNMENT_PATTERN__TARGET_PATTERN);

		modelElementReferenceEClass = createEClass(MODEL_ELEMENT_REFERENCE);
		createEReference(modelElementReferenceEClass, MODEL_ELEMENT_REFERENCE__ELEMENT);
		createEReference(modelElementReferenceEClass, MODEL_ELEMENT_REFERENCE__CONTEXT);

		configurationParameterEClass = createEClass(CONFIGURATION_PARAMETER);
		createEReference(configurationParameterEClass, CONFIGURATION_PARAMETER__TYPE);

		typeReferenceEClass = createEClass(TYPE_REFERENCE);
		createEAttribute(typeReferenceEClass, TYPE_REFERENCE__REVERSE);
		createEReference(typeReferenceEClass, TYPE_REFERENCE__TYPE);
		createEReference(typeReferenceEClass, TYPE_REFERENCE__ACTUALS);

		configurationActualEClass = createEClass(CONFIGURATION_ACTUAL);
		createEReference(configurationActualEClass, CONFIGURATION_ACTUAL__PARAMETER);
		createEReference(configurationActualEClass, CONFIGURATION_ACTUAL__ASSIGNED_CLASSIFIERS);

		workingsetEClass = createEClass(WORKINGSET);
		createEReference(workingsetEClass, WORKINGSET__ROOT_COMPONENTS);
		createEReference(workingsetEClass, WORKINGSET__USE_PROPERTIES);

		propertyValueEClass = createEClass(PROPERTY_VALUE);
		createEAttribute(propertyValueEClass, PROPERTY_VALUE__VALUE);
		createEAttribute(propertyValueEClass, PROPERTY_VALUE__UNIT);

		propertyAssociationEClass = createEClass(PROPERTY_ASSOCIATION);
		createEReference(propertyAssociationEClass, PROPERTY_ASSOCIATION__TARGET);
		createEReference(propertyAssociationEClass, PROPERTY_ASSOCIATION__PROPERTY);
		createEReference(propertyAssociationEClass, PROPERTY_ASSOCIATION__VALUE);
		createEAttribute(propertyAssociationEClass, PROPERTY_ASSOCIATION__PROPERTY_ASSOCIATION_TYPE);

		// Create enums
		componentCategoryEEnum = createEEnum(COMPONENT_CATEGORY);
		featureCategoryEEnum = createEEnum(FEATURE_CATEGORY);
		featureDirectionEEnum = createEEnum(FEATURE_DIRECTION);
		associationTypeEEnum = createEEnum(ASSOCIATION_TYPE);
		propertyAssociationTypeEEnum = createEEnum(PROPERTY_ASSOCIATION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		packageDeclarationEClass.getESuperTypes().add(this.getPackageElement());
		packageElementEClass.getESuperTypes().add(this.getNamedElement());
		propertyDefinitionEClass.getESuperTypes().add(this.getPackageElement());
		propertySetEClass.getESuperTypes().add(this.getPackageElement());
		modelElementEClass.getESuperTypes().add(this.getNamedElement());
		typeEClass.getESuperTypes().add(this.getNamedElement());
		dataTypeEClass.getESuperTypes().add(this.getPackageElement());
		dataTypeEClass.getESuperTypes().add(this.getType());
		componentClassifierEClass.getESuperTypes().add(this.getPackageElement());
		componentClassifierEClass.getESuperTypes().add(this.getType());
		componentRealizationEClass.getESuperTypes().add(this.getComponentClassifier());
		componentInterfaceEClass.getESuperTypes().add(this.getComponentClassifier());
		componentImplementationEClass.getESuperTypes().add(this.getComponentRealization());
		componentConfigurationEClass.getESuperTypes().add(this.getComponentRealization());
		featureEClass.getESuperTypes().add(this.getModelElement());
		componentEClass.getESuperTypes().add(this.getModelElement());
		associationEClass.getESuperTypes().add(this.getModelElement());
		pathSequenceEClass.getESuperTypes().add(this.getModelElement());
		pathElementEClass.getESuperTypes().add(this.getModelElementReference());
		configurationAssignmentPatternEClass.getESuperTypes().add(this.getConfigurationAssignment());
		configurationParameterEClass.getESuperTypes().add(this.getType());
		workingsetEClass.getESuperTypes().add(this.getPackageElement());

		// Initialize classes and features; add operations and parameters
		initEClass(packageDeclarationEClass, PackageDeclaration.class, "PackageDeclaration", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackageDeclaration_Imports(), this.getImport(), null, "imports", null, 0, -1,
				PackageDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackageDeclaration_Elements(), this.getPackageElement(), null, "elements", null, 0, -1,
				PackageDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageElementEClass, PackageElement.class, "PackageElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackageElement_Private(), ecorePackage.getEBoolean(), "private", null, 0, 1,
				PackageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(propertyDefinitionEClass, PropertyDefinition.class, "PropertyDefinition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyDefinition_Type(), this.getType(), null, "type", null, 0, 1, PropertyDefinition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyDefinition_ComponentCategories(), this.getComponentCategory(), "componentCategories",
				null, 0, -1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyDefinition_FeatureCategories(), this.getFeatureCategory(), "featureCategories", null,
				0, -1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyDefinition_AssociationTypes(), this.getAssociationType(), "associationTypes", null, 0,
				-1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertySetEClass, PropertySet.class, "PropertySet", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertySet_Properties(), this.getPropertyDefinition(), null, "properties", null, 0, -1,
				PropertySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelElementEClass, ModelElement.class, "ModelElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelElement_PropertyAssociations(), this.getPropertyAssociation(), null,
				"propertyAssociations", null, 0, -1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataType_PropertyAssociations(), this.getPropertyAssociation(), null, "propertyAssociations",
				null, 0, -1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentClassifierEClass, ComponentClassifier.class, "ComponentClassifier", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentClassifier_Category(), this.getComponentCategory(), "category", "interface", 0, 1,
				ComponentClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentClassifier_SuperClassifiers(), this.getTypeReference(), null, "superClassifiers",
				null, 0, -1, ComponentClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentClassifier_PropertyAssociations(), this.getPropertyAssociation(), null,
				"propertyAssociations", null, 0, -1, ComponentClassifier.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentRealizationEClass, ComponentRealization.class, "ComponentRealization", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentRealization_CachedInterfaceReference(), this.getComponentInterface(), null,
				"cachedInterfaceReference", null, 0, 1, ComponentRealization.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(componentInterfaceEClass, ComponentInterface.class, "ComponentInterface", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentInterface_Features(), this.getFeature(), null, "features", null, 0, -1,
				ComponentInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInterface_Flows(), this.getAssociation(), null, "flows", null, 0, -1,
				ComponentInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInterface_UseProperties(), this.getPropertySet(), null, "useProperties", null, 0, -1,
				ComponentInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentImplementationEClass, ComponentImplementation.class, "ComponentImplementation",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentImplementation_Components(), this.getComponent(), null, "components", null, 0, -1,
				ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentImplementation_Connections(), this.getAssociation(), null, "connections", null, 0,
				-1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentImplementation_ConfigurationAssignments(), this.getConfigurationAssignment(), null,
				"configurationAssignments", null, 0, -1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentImplementation_FlowAssignments(), this.getPathSequence(), null, "flowAssignments",
				null, 0, -1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentImplementation_Paths(), this.getPathSequence(), null, "paths", null, 0, -1,
				ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentImplementation_Bindings(), this.getAssociation(), null, "bindings", null, 0, -1,
				ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentConfigurationEClass, ComponentConfiguration.class, "ComponentConfiguration", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentConfiguration_Parameters(), this.getConfigurationParameter(), null, "parameters",
				null, 0, -1, ComponentConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentConfiguration_ConfigurationAssignments(), this.getConfigurationAssignment(), null,
				"configurationAssignments", null, 0, -1, ComponentConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentConfiguration_Parameterized(), ecorePackage.getEBoolean(), "parameterized", null, 0,
				1, ComponentConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentConfiguration_Bindings(), this.getAssociation(), null, "bindings", null, 0, -1,
				ComponentConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeature_Direction(), this.getFeatureDirection(), "direction", null, 0, 1, Feature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Sampled(), ecorePackage.getEBoolean(), "sampled", null, 0, 1, Feature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Category(), this.getFeatureCategory(), "category", null, 0, 1, Feature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Reverse(), ecorePackage.getEBoolean(), "reverse", null, 0, 1, Feature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_Type(), this.getType(), null, "type", null, 0, 1, Feature.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_Category(), this.getComponentCategory(), "category", null, 0, 1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_TypeReferences(), this.getTypeReference(), null, "typeReferences", null, 0, -1,
				Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Components(), this.getComponent(), null, "components", null, 0, -1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Bindings(), this.getAssociation(), null, "bindings", null, 0, -1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Connections(), this.getAssociation(), null, "connections", null, 0, -1,
				Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Features(), this.getFeature(), null, "features", null, 0, -1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1,
				Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getImport_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, Import.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssociation_AssociationType(), this.getAssociationType(), "associationType", null, 0, 1,
				Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_Source(), this.getModelElementReference(), null, "source", null, 0, 1,
				Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_Destination(), this.getModelElementReference(), null, "destination", null, 0, 1,
				Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathSequenceEClass, PathSequence.class, "PathSequence", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPathSequence_Target(), this.getModelElementReference(), null, "target", null, 0, 1,
				PathSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathSequence_Elements(), this.getPathElement(), null, "elements", null, 0, -1,
				PathSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathElementEClass, PathElement.class, "PathElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPathElement_Previous(), this.getPathElement(), null, "previous", null, 0, -1,
				PathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathElement_Next(), this.getPathElement(), null, "next", null, 0, -1, PathElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationAssignmentEClass, ConfigurationAssignment.class, "ConfigurationAssignment",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurationAssignment_Target(), this.getModelElementReference(), null, "target", null, 0, 1,
				ConfigurationAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationAssignment_ConfigurationAssignments(), this.getConfigurationAssignment(), null,
				"configurationAssignments", null, 0, -1, ConfigurationAssignment.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationAssignment_AssignedClassifiers(), this.getTypeReference(), null,
				"assignedClassifiers", null, 0, -1, ConfigurationAssignment.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationAssignment_PropertyAssociations(), this.getPropertyAssociation(), null,
				"propertyAssociations", null, 0, -1, ConfigurationAssignment.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationAssignment_Bindings(), this.getAssociation(), null, "bindings", null, 0, -1,
				ConfigurationAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationAssignmentPatternEClass, ConfigurationAssignmentPattern.class,
				"ConfigurationAssignmentPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurationAssignmentPattern_TargetPattern(), this.getType(), null, "targetPattern", null,
				0, 1, ConfigurationAssignmentPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelElementReferenceEClass, ModelElementReference.class, "ModelElementReference", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelElementReference_Element(), this.getModelElement(), null, "element", null, 0, 1,
				ModelElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElementReference_Context(), this.getModelElementReference(), null, "context", null, 0, 1,
				ModelElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationParameterEClass, ConfigurationParameter.class, "ConfigurationParameter", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurationParameter_Type(), this.getType(), null, "type", null, 0, 1,
				ConfigurationParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeReferenceEClass, TypeReference.class, "TypeReference", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeReference_Reverse(), ecorePackage.getEBoolean(), "reverse", null, 0, 1,
				TypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getTypeReference_Type(), this.getType(), null, "type", null, 0, 1, TypeReference.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeReference_Actuals(), this.getConfigurationActual(), null, "actuals", null, 0, -1,
				TypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationActualEClass, ConfigurationActual.class, "ConfigurationActual", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurationActual_Parameter(), this.getConfigurationParameter(), null, "parameter", null, 0,
				1, ConfigurationActual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationActual_AssignedClassifiers(), this.getTypeReference(), null,
				"assignedClassifiers", null, 0, -1, ConfigurationActual.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workingsetEClass, Workingset.class, "Workingset", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkingset_RootComponents(), this.getComponent(), null, "rootComponents", null, 0, -1,
				Workingset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkingset_UseProperties(), this.getPropertySet(), null, "useProperties", null, 0, -1,
				Workingset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyValueEClass, PropertyValue.class, "PropertyValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyValue_Value(), ecorePackage.getEInt(), "value", null, 0, 1, PropertyValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyValue_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, PropertyValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyAssociationEClass, PropertyAssociation.class, "PropertyAssociation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyAssociation_Target(), this.getModelElementReference(), null, "target", null, 0, 1,
				PropertyAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyAssociation_Property(), this.getPropertyDefinition(), null, "property", null, 0, 1,
				PropertyAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyAssociation_Value(), this.getPropertyValue(), null, "value", null, 0, 1,
				PropertyAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyAssociation_PropertyAssociationType(), this.getPropertyAssociationType(),
				"propertyAssociationType", "FinalValue", 0, 1, PropertyAssociation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(componentCategoryEEnum, ComponentCategory.class, "ComponentCategory");
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.INTERFACE);
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.THREAD);
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.SYSTEM);
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.PROCESS);
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.PROCESSOR);
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.MEMORY);
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.BUS);
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.DEVICE);
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.VIRTUALBUS);
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.VIRTUALPROCESSOR);
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.VIRTUALMEMORY);
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.VIRTUALDEVICE);
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.SUBPROGRAM);
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.SUBPROGRAMGROUP);
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.THREADGROUP);
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.DATA);
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.ABSTRACT);

		initEEnum(featureCategoryEEnum, FeatureCategory.class, "FeatureCategory");
		addEEnumLiteral(featureCategoryEEnum, FeatureCategory.FEATURE);
		addEEnumLiteral(featureCategoryEEnum, FeatureCategory.PORT);
		addEEnumLiteral(featureCategoryEEnum, FeatureCategory.DATAACCESS);
		addEEnumLiteral(featureCategoryEEnum, FeatureCategory.BUSACCESS);
		addEEnumLiteral(featureCategoryEEnum, FeatureCategory.BINDINGPOINT);
		addEEnumLiteral(featureCategoryEEnum, FeatureCategory.INTERFACE);

		initEEnum(featureDirectionEEnum, FeatureDirection.class, "FeatureDirection");
		addEEnumLiteral(featureDirectionEEnum, FeatureDirection.NONE);
		addEEnumLiteral(featureDirectionEEnum, FeatureDirection.IN);
		addEEnumLiteral(featureDirectionEEnum, FeatureDirection.OUT);
		addEEnumLiteral(featureDirectionEEnum, FeatureDirection.INOUT);
		addEEnumLiteral(featureDirectionEEnum, FeatureDirection.REQUIRES);
		addEEnumLiteral(featureDirectionEEnum, FeatureDirection.PROVIDES);
		addEEnumLiteral(featureDirectionEEnum, FeatureDirection.REQUIRESWRITE);
		addEEnumLiteral(featureDirectionEEnum, FeatureDirection.REQUIRESREADWRITE);
		addEEnumLiteral(featureDirectionEEnum, FeatureDirection.REQUIRESREAD);
		addEEnumLiteral(featureDirectionEEnum, FeatureDirection.PROVIDESWRITE);
		addEEnumLiteral(featureDirectionEEnum, FeatureDirection.PROVIDESREADWRITE);
		addEEnumLiteral(featureDirectionEEnum, FeatureDirection.PROVIDESREAD);

		initEEnum(associationTypeEEnum, AssociationType.class, "AssociationType");
		addEEnumLiteral(associationTypeEEnum, AssociationType.CONNECTION);
		addEEnumLiteral(associationTypeEEnum, AssociationType.BINDING);
		addEEnumLiteral(associationTypeEEnum, AssociationType.FEATUREMAPPING);
		addEEnumLiteral(associationTypeEEnum, AssociationType.FLOWPATH);
		addEEnumLiteral(associationTypeEEnum, AssociationType.FLOWSOURCE);
		addEEnumLiteral(associationTypeEEnum, AssociationType.FLOWSINK);
		addEEnumLiteral(associationTypeEEnum, AssociationType.FLOW);

		initEEnum(propertyAssociationTypeEEnum, PropertyAssociationType.class, "PropertyAssociationType");
		addEEnumLiteral(propertyAssociationTypeEEnum, PropertyAssociationType.FINAL_VALUE);
		addEEnumLiteral(propertyAssociationTypeEEnum, PropertyAssociationType.DEFAULT_VALUE);
		addEEnumLiteral(propertyAssociationTypeEEnum, PropertyAssociationType.OVERRIDE_VALUE);

		// Create resource
		createResource(eNS_URI);
	}

} //Aadlv3PackageImpl
