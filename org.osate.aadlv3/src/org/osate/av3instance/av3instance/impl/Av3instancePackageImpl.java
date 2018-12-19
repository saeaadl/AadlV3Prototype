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
package org.osate.av3instance.av3instance.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.osate.aadlv3.aadlv3.Aadlv3Package;

import org.osate.av3instance.av3instance.AssociationInstance;
import org.osate.av3instance.av3instance.Av3instanceFactory;
import org.osate.av3instance.av3instance.Av3instancePackage;
import org.osate.av3instance.av3instance.ComponentInstance;
import org.osate.av3instance.av3instance.FeatureInstance;
import org.osate.av3instance.av3instance.InstanceObject;
import org.osate.av3instance.av3instance.PathInstance;
import org.osate.av3instance.av3instance.PropertyAssociationInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Av3instancePackageImpl extends EPackageImpl implements Av3instancePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyAssociationInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathInstanceEClass = null;

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
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Av3instancePackageImpl() {
		super(eNS_URI, Av3instanceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Av3instancePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Av3instancePackage init() {
		if (isInited)
			return (Av3instancePackage) EPackage.Registry.INSTANCE.getEPackage(Av3instancePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAv3instancePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Av3instancePackageImpl theAv3instancePackage = registeredAv3instancePackage instanceof Av3instancePackageImpl
				? (Av3instancePackageImpl) registeredAv3instancePackage
				: new Av3instancePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		Aadlv3Package.eINSTANCE.eClass();

		// Create package meta-data objects
		theAv3instancePackage.createPackageContents();

		// Initialize created meta-data
		theAv3instancePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAv3instancePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Av3instancePackage.eNS_URI, theAv3instancePackage);
		return theAv3instancePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstanceObject() {
		return instanceObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstanceObject_Name() {
		return (EAttribute) instanceObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstanceObject_PropertyAssociations() {
		return (EReference) instanceObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureInstance() {
		return featureInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureInstance_Feature() {
		return (EReference) featureInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureInstance_Direction() {
		return (EAttribute) featureInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureInstance_Sampled() {
		return (EAttribute) featureInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureInstance_Category() {
		return (EAttribute) featureInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureInstance_Features() {
		return (EReference) featureInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureInstance_OutgoingAssociations() {
		return (EReference) featureInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureInstance_IncomingAssociations() {
		return (EReference) featureInstanceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentInstance() {
		return componentInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentInstance_Category() {
		return (EAttribute) componentInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentInstance_Components() {
		return (EReference) componentInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentInstance_Component() {
		return (EReference) componentInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentInstance_Connections() {
		return (EReference) componentInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentInstance_Features() {
		return (EReference) componentInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentInstance_Flowspecs() {
		return (EReference) componentInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentInstance_Paths() {
		return (EReference) componentInstanceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssociationInstance() {
		return associationInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssociationInstance_AssociationType() {
		return (EAttribute) associationInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociationInstance_Association() {
		return (EReference) associationInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociationInstance_Source() {
		return (EReference) associationInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociationInstance_Destination() {
		return (EReference) associationInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociationInstance_SourceMappings() {
		return (EReference) associationInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociationInstance_DestinationMappings() {
		return (EReference) associationInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssociationInstance_External() {
		return (EAttribute) associationInstanceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyAssociationInstance() {
		return propertyAssociationInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyAssociationInstance_Property() {
		return (EReference) propertyAssociationInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyAssociationInstance_Value() {
		return (EReference) propertyAssociationInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyAssociationInstance_PropertyAssociationType() {
		return (EAttribute) propertyAssociationInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPathInstance() {
		return pathInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPathInstance_Elements() {
		return (EReference) pathInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPathInstance_Path() {
		return (EReference) pathInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Av3instanceFactory getAv3instanceFactory() {
		return (Av3instanceFactory) getEFactoryInstance();
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
		instanceObjectEClass = createEClass(INSTANCE_OBJECT);
		createEAttribute(instanceObjectEClass, INSTANCE_OBJECT__NAME);
		createEReference(instanceObjectEClass, INSTANCE_OBJECT__PROPERTY_ASSOCIATIONS);

		featureInstanceEClass = createEClass(FEATURE_INSTANCE);
		createEReference(featureInstanceEClass, FEATURE_INSTANCE__FEATURE);
		createEAttribute(featureInstanceEClass, FEATURE_INSTANCE__DIRECTION);
		createEAttribute(featureInstanceEClass, FEATURE_INSTANCE__SAMPLED);
		createEAttribute(featureInstanceEClass, FEATURE_INSTANCE__CATEGORY);
		createEReference(featureInstanceEClass, FEATURE_INSTANCE__FEATURES);
		createEReference(featureInstanceEClass, FEATURE_INSTANCE__OUTGOING_ASSOCIATIONS);
		createEReference(featureInstanceEClass, FEATURE_INSTANCE__INCOMING_ASSOCIATIONS);

		componentInstanceEClass = createEClass(COMPONENT_INSTANCE);
		createEAttribute(componentInstanceEClass, COMPONENT_INSTANCE__CATEGORY);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__COMPONENTS);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__COMPONENT);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__CONNECTIONS);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__FEATURES);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__FLOWSPECS);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__PATHS);

		associationInstanceEClass = createEClass(ASSOCIATION_INSTANCE);
		createEAttribute(associationInstanceEClass, ASSOCIATION_INSTANCE__ASSOCIATION_TYPE);
		createEReference(associationInstanceEClass, ASSOCIATION_INSTANCE__ASSOCIATION);
		createEReference(associationInstanceEClass, ASSOCIATION_INSTANCE__SOURCE);
		createEReference(associationInstanceEClass, ASSOCIATION_INSTANCE__DESTINATION);
		createEReference(associationInstanceEClass, ASSOCIATION_INSTANCE__SOURCE_MAPPINGS);
		createEReference(associationInstanceEClass, ASSOCIATION_INSTANCE__DESTINATION_MAPPINGS);
		createEAttribute(associationInstanceEClass, ASSOCIATION_INSTANCE__EXTERNAL);

		propertyAssociationInstanceEClass = createEClass(PROPERTY_ASSOCIATION_INSTANCE);
		createEReference(propertyAssociationInstanceEClass, PROPERTY_ASSOCIATION_INSTANCE__PROPERTY);
		createEReference(propertyAssociationInstanceEClass, PROPERTY_ASSOCIATION_INSTANCE__VALUE);
		createEAttribute(propertyAssociationInstanceEClass, PROPERTY_ASSOCIATION_INSTANCE__PROPERTY_ASSOCIATION_TYPE);

		pathInstanceEClass = createEClass(PATH_INSTANCE);
		createEReference(pathInstanceEClass, PATH_INSTANCE__ELEMENTS);
		createEReference(pathInstanceEClass, PATH_INSTANCE__PATH);
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

		// Obtain other dependent packages
		Aadlv3Package theAadlv3Package = (Aadlv3Package) EPackage.Registry.INSTANCE.getEPackage(Aadlv3Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		featureInstanceEClass.getESuperTypes().add(this.getInstanceObject());
		componentInstanceEClass.getESuperTypes().add(this.getInstanceObject());
		associationInstanceEClass.getESuperTypes().add(this.getInstanceObject());
		propertyAssociationInstanceEClass.getESuperTypes().add(this.getInstanceObject());
		pathInstanceEClass.getESuperTypes().add(this.getInstanceObject());

		// Initialize classes, features, and operations; add parameters
		initEClass(instanceObjectEClass, InstanceObject.class, "InstanceObject", IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstanceObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, InstanceObject.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstanceObject_PropertyAssociations(), this.getPropertyAssociationInstance(), null,
				"propertyAssociations", null, 0, -1, InstanceObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, //$NON-NLS-1$
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureInstanceEClass, FeatureInstance.class, "FeatureInstance", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureInstance_Feature(), theAadlv3Package.getFeature(), null, "feature", null, 0, 1, //$NON-NLS-1$
				FeatureInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureInstance_Direction(), theAadlv3Package.getFeatureDirection(), "direction", null, 0, 1, //$NON-NLS-1$
				FeatureInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureInstance_Sampled(), ecorePackage.getEBoolean(), "sampled", null, 0, 1, //$NON-NLS-1$
				FeatureInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureInstance_Category(), theAadlv3Package.getFeatureCategory(), "category", null, 0, 1, //$NON-NLS-1$
				FeatureInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureInstance_Features(), this.getFeatureInstance(), null, "features", null, 0, -1, //$NON-NLS-1$
				FeatureInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureInstance_OutgoingAssociations(), this.getAssociationInstance(),
				this.getAssociationInstance_Source(), "outgoingAssociations", null, 0, -1, FeatureInstance.class, //$NON-NLS-1$
				IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureInstance_IncomingAssociations(), this.getAssociationInstance(),
				this.getAssociationInstance_Destination(), "incomingAssociations", null, 0, -1, FeatureInstance.class, //$NON-NLS-1$
				IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(componentInstanceEClass, ComponentInstance.class, "ComponentInstance", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentInstance_Category(), theAadlv3Package.getComponentCategory(), "category", //$NON-NLS-1$
				"interface", 0, 1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, //$NON-NLS-1$
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_Components(), this.getComponentInstance(), null, "components", null, 0, -1, //$NON-NLS-1$
				ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_Component(), theAadlv3Package.getComponent(), null, "component", null, 0, 1, //$NON-NLS-1$
				ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_Connections(), this.getAssociationInstance(), null, "connections", null, 0, //$NON-NLS-1$
				-1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_Features(), this.getFeatureInstance(), null, "features", null, 0, -1, //$NON-NLS-1$
				ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_Flowspecs(), this.getAssociationInstance(), null, "flowspecs", null, 0, -1, //$NON-NLS-1$
				ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_Paths(), this.getPathInstance(), null, "paths", null, 0, -1, //$NON-NLS-1$
				ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationInstanceEClass, AssociationInstance.class, "AssociationInstance", !IS_ABSTRACT, //$NON-NLS-1$
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssociationInstance_AssociationType(), theAadlv3Package.getAssociationType(),
				"associationType", null, 0, 1, AssociationInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, //$NON-NLS-1$
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationInstance_Association(), theAadlv3Package.getAssociation(), null, "association", //$NON-NLS-1$
				null, 0, 1, AssociationInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationInstance_Source(), this.getFeatureInstance(),
				this.getFeatureInstance_OutgoingAssociations(), "source", null, 0, 1, AssociationInstance.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssociationInstance_Destination(), this.getFeatureInstance(),
				this.getFeatureInstance_IncomingAssociations(), "destination", null, 0, 1, AssociationInstance.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssociationInstance_SourceMappings(), theAadlv3Package.getAssociation(), null,
				"sourceMappings", null, 0, -1, AssociationInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, //$NON-NLS-1$
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationInstance_DestinationMappings(), theAadlv3Package.getAssociation(), null,
				"destinationMappings", null, 0, -1, AssociationInstance.class, !IS_TRANSIENT, !IS_VOLATILE, //$NON-NLS-1$
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociationInstance_External(), ecorePackage.getEBoolean(), "external", null, 0, 1, //$NON-NLS-1$
				AssociationInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyAssociationInstanceEClass, PropertyAssociationInstance.class, "PropertyAssociationInstance", //$NON-NLS-1$
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyAssociationInstance_Property(), theAadlv3Package.getPropertyDefinition(), null,
				"property", null, 0, 1, PropertyAssociationInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, //$NON-NLS-1$
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyAssociationInstance_Value(), theAadlv3Package.getPropertyValue(), null, "value", null, //$NON-NLS-1$
				0, 1, PropertyAssociationInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyAssociationInstance_PropertyAssociationType(),
				theAadlv3Package.getPropertyAssociationType(), "propertyAssociationType", "FinalValue", 0, 1, //$NON-NLS-1$//$NON-NLS-2$
				PropertyAssociationInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathInstanceEClass, PathInstance.class, "PathInstance", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPathInstance_Elements(), this.getInstanceObject(), null, "elements", null, 0, -1, //$NON-NLS-1$
				PathInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathInstance_Path(), theAadlv3Package.getPathSequence(), null, "path", null, 0, 1, //$NON-NLS-1$
				PathInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Av3instancePackageImpl
