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
import org.osate.av3instance.av3instance.BehaviorInstance;
import org.osate.av3instance.av3instance.ComponentInstance;
import org.osate.av3instance.av3instance.ConstrainedInstanceObject;
import org.osate.av3instance.av3instance.FeatureInstance;
import org.osate.av3instance.av3instance.GeneratorInstance;
import org.osate.av3instance.av3instance.InstanceObject;
import org.osate.av3instance.av3instance.PathInstance;
import org.osate.av3instance.av3instance.StateInstance;
import org.osate.av3instance.av3instance.StateTransitionInstance;
import org.osate.av3instance.av3instance.StateVariableInstance;

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
	private EClass pathInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constrainedInstanceObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateVariableInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateTransitionInstanceEClass = null;

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
	public EReference getInstanceObject_IncomingAssociations() {
		return (EReference) instanceObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstanceObject_OutgoingAssociations() {
		return (EReference) instanceObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstanceObject_InStates() {
		return (EReference) instanceObjectEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getFeatureInstance_Category() {
		return (EAttribute) featureInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureInstance_Features() {
		return (EReference) featureInstanceEClass.getEStructuralFeatures().get(3);
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
	public EReference getComponentInstance_Paths() {
		return (EReference) componentInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentInstance_Behaviors() {
		return (EReference) componentInstanceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentInstance_Generators() {
		return (EReference) componentInstanceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentInstance_StateVariables() {
		return (EReference) componentInstanceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentInstance_Actions() {
		return (EReference) componentInstanceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentInstance_StateTransitions() {
		return (EReference) componentInstanceEClass.getEStructuralFeatures().get(10);
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
	public EReference getAssociationInstance_SourceDelegates() {
		return (EReference) associationInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociationInstance_DestinationDelegates() {
		return (EReference) associationInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssociationInstance_Bidirectional() {
		return (EAttribute) associationInstanceEClass.getEStructuralFeatures().get(7);
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
	public EClass getBehaviorInstance() {
		return behaviorInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehaviorInstance_Behavior() {
		return (EReference) behaviorInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehaviorInstance_Condition() {
		return (EReference) behaviorInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehaviorInstance_Actions() {
		return (EReference) behaviorInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBehaviorInstance_Sink() {
		return (EAttribute) behaviorInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBehaviorInstance_Source() {
		return (EAttribute) behaviorInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBehaviorInstance_Category() {
		return (EAttribute) behaviorInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeneratorInstance() {
		return generatorInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeneratorInstance_Generator() {
		return (EReference) generatorInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeneratorInstance_GeneratedLiterals() {
		return (EReference) generatorInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeneratorInstance_Type() {
		return (EAttribute) generatorInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstrainedInstanceObject() {
		return constrainedInstanceObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstrainedInstanceObject_InstanceObject() {
		return (EReference) constrainedInstanceObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstrainedInstanceObject_Constraint() {
		return (EReference) constrainedInstanceObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstrainedInstanceObject_Outgoing() {
		return (EAttribute) constrainedInstanceObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStateVariableInstance() {
		return stateVariableInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStateVariableInstance_CurrentState() {
		return (EReference) stateVariableInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStateVariableInstance_StateVariable() {
		return (EReference) stateVariableInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStateVariableInstance_States() {
		return (EReference) stateVariableInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStateInstance() {
		return stateInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStateTransitionInstance() {
		return stateTransitionInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStateTransitionInstance_StateTransition() {
		return (EReference) stateTransitionInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStateTransitionInstance_Condition() {
		return (EReference) stateTransitionInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStateTransitionInstance_TargetState() {
		return (EReference) stateTransitionInstanceEClass.getEStructuralFeatures().get(2);
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
		createEReference(instanceObjectEClass, INSTANCE_OBJECT__INCOMING_ASSOCIATIONS);
		createEReference(instanceObjectEClass, INSTANCE_OBJECT__OUTGOING_ASSOCIATIONS);
		createEReference(instanceObjectEClass, INSTANCE_OBJECT__IN_STATES);

		featureInstanceEClass = createEClass(FEATURE_INSTANCE);
		createEReference(featureInstanceEClass, FEATURE_INSTANCE__FEATURE);
		createEAttribute(featureInstanceEClass, FEATURE_INSTANCE__DIRECTION);
		createEAttribute(featureInstanceEClass, FEATURE_INSTANCE__CATEGORY);
		createEReference(featureInstanceEClass, FEATURE_INSTANCE__FEATURES);

		componentInstanceEClass = createEClass(COMPONENT_INSTANCE);
		createEAttribute(componentInstanceEClass, COMPONENT_INSTANCE__CATEGORY);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__COMPONENTS);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__COMPONENT);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__CONNECTIONS);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__FEATURES);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__PATHS);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__BEHAVIORS);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__GENERATORS);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__STATE_VARIABLES);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__ACTIONS);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__STATE_TRANSITIONS);

		associationInstanceEClass = createEClass(ASSOCIATION_INSTANCE);
		createEAttribute(associationInstanceEClass, ASSOCIATION_INSTANCE__ASSOCIATION_TYPE);
		createEReference(associationInstanceEClass, ASSOCIATION_INSTANCE__ASSOCIATION);
		createEReference(associationInstanceEClass, ASSOCIATION_INSTANCE__SOURCE);
		createEReference(associationInstanceEClass, ASSOCIATION_INSTANCE__DESTINATION);
		createEReference(associationInstanceEClass, ASSOCIATION_INSTANCE__SOURCE_DELEGATES);
		createEReference(associationInstanceEClass, ASSOCIATION_INSTANCE__DESTINATION_DELEGATES);
		createEAttribute(associationInstanceEClass, ASSOCIATION_INSTANCE__EXTERNAL);
		createEAttribute(associationInstanceEClass, ASSOCIATION_INSTANCE__BIDIRECTIONAL);

		pathInstanceEClass = createEClass(PATH_INSTANCE);
		createEReference(pathInstanceEClass, PATH_INSTANCE__ELEMENTS);
		createEReference(pathInstanceEClass, PATH_INSTANCE__PATH);

		behaviorInstanceEClass = createEClass(BEHAVIOR_INSTANCE);
		createEReference(behaviorInstanceEClass, BEHAVIOR_INSTANCE__BEHAVIOR);
		createEReference(behaviorInstanceEClass, BEHAVIOR_INSTANCE__CONDITION);
		createEReference(behaviorInstanceEClass, BEHAVIOR_INSTANCE__ACTIONS);
		createEAttribute(behaviorInstanceEClass, BEHAVIOR_INSTANCE__SINK);
		createEAttribute(behaviorInstanceEClass, BEHAVIOR_INSTANCE__SOURCE);
		createEAttribute(behaviorInstanceEClass, BEHAVIOR_INSTANCE__CATEGORY);

		generatorInstanceEClass = createEClass(GENERATOR_INSTANCE);
		createEReference(generatorInstanceEClass, GENERATOR_INSTANCE__GENERATOR);
		createEReference(generatorInstanceEClass, GENERATOR_INSTANCE__GENERATED_LITERALS);
		createEAttribute(generatorInstanceEClass, GENERATOR_INSTANCE__TYPE);

		constrainedInstanceObjectEClass = createEClass(CONSTRAINED_INSTANCE_OBJECT);
		createEReference(constrainedInstanceObjectEClass, CONSTRAINED_INSTANCE_OBJECT__INSTANCE_OBJECT);
		createEReference(constrainedInstanceObjectEClass, CONSTRAINED_INSTANCE_OBJECT__CONSTRAINT);
		createEAttribute(constrainedInstanceObjectEClass, CONSTRAINED_INSTANCE_OBJECT__OUTGOING);

		stateVariableInstanceEClass = createEClass(STATE_VARIABLE_INSTANCE);
		createEReference(stateVariableInstanceEClass, STATE_VARIABLE_INSTANCE__CURRENT_STATE);
		createEReference(stateVariableInstanceEClass, STATE_VARIABLE_INSTANCE__STATE_VARIABLE);
		createEReference(stateVariableInstanceEClass, STATE_VARIABLE_INSTANCE__STATES);

		stateInstanceEClass = createEClass(STATE_INSTANCE);

		stateTransitionInstanceEClass = createEClass(STATE_TRANSITION_INSTANCE);
		createEReference(stateTransitionInstanceEClass, STATE_TRANSITION_INSTANCE__STATE_TRANSITION);
		createEReference(stateTransitionInstanceEClass, STATE_TRANSITION_INSTANCE__CONDITION);
		createEReference(stateTransitionInstanceEClass, STATE_TRANSITION_INSTANCE__TARGET_STATE);
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
		instanceObjectEClass.getESuperTypes().add(theAadlv3Package.getNamedElement());
		featureInstanceEClass.getESuperTypes().add(this.getInstanceObject());
		componentInstanceEClass.getESuperTypes().add(this.getInstanceObject());
		associationInstanceEClass.getESuperTypes().add(this.getInstanceObject());
		pathInstanceEClass.getESuperTypes().add(this.getInstanceObject());
		behaviorInstanceEClass.getESuperTypes().add(this.getInstanceObject());
		generatorInstanceEClass.getESuperTypes().add(this.getInstanceObject());
		constrainedInstanceObjectEClass.getESuperTypes().add(this.getInstanceObject());
		constrainedInstanceObjectEClass.getESuperTypes().add(theAadlv3Package.getLiteral());
		stateVariableInstanceEClass.getESuperTypes().add(this.getInstanceObject());
		stateInstanceEClass.getESuperTypes().add(this.getInstanceObject());
		stateTransitionInstanceEClass.getESuperTypes().add(this.getInstanceObject());

		// Initialize classes and features; add operations and parameters
		initEClass(instanceObjectEClass, InstanceObject.class, "InstanceObject", IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstanceObject_IncomingAssociations(), this.getAssociationInstance(),
				this.getAssociationInstance_Destination(), "incomingAssociations", null, 0, -1, InstanceObject.class, //$NON-NLS-1$
				IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getInstanceObject_OutgoingAssociations(), this.getAssociationInstance(),
				this.getAssociationInstance_Source(), "outgoingAssociations", null, 0, -1, InstanceObject.class, //$NON-NLS-1$
				IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getInstanceObject_InStates(), this.getStateInstance(), null, "inStates", null, 0, -1, //$NON-NLS-1$
				InstanceObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureInstanceEClass, FeatureInstance.class, "FeatureInstance", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureInstance_Feature(), theAadlv3Package.getFeature(), null, "feature", null, 0, 1, //$NON-NLS-1$
				FeatureInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureInstance_Direction(), theAadlv3Package.getFeatureDirection(), "direction", null, 0, 1, //$NON-NLS-1$
				FeatureInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureInstance_Category(), theAadlv3Package.getFeatureCategory(), "category", null, 0, 1, //$NON-NLS-1$
				FeatureInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureInstance_Features(), this.getFeatureInstance(), null, "features", null, 0, -1, //$NON-NLS-1$
				FeatureInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentInstanceEClass, ComponentInstance.class, "ComponentInstance", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentInstance_Category(), theAadlv3Package.getComponentCategory(), "category", //$NON-NLS-1$
				"interface", 0, 1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, //$NON-NLS-1$
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_Components(), this.getComponentInstance(), null, "components", null, 0, -1, //$NON-NLS-1$
				ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_Component(), theAadlv3Package.getSubcomponent(), null, "component", null, 0, //$NON-NLS-1$
				1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_Connections(), this.getAssociationInstance(), null, "connections", null, 0, //$NON-NLS-1$
				-1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_Features(), this.getFeatureInstance(), null, "features", null, 0, -1, //$NON-NLS-1$
				ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_Paths(), this.getPathInstance(), null, "paths", null, 0, -1, //$NON-NLS-1$
				ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_Behaviors(), this.getBehaviorInstance(), null, "behaviors", null, 0, -1, //$NON-NLS-1$
				ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_Generators(), this.getGeneratorInstance(), null, "generators", null, 0, -1, //$NON-NLS-1$
				ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_StateVariables(), this.getStateVariableInstance(), null, "stateVariables", //$NON-NLS-1$
				null, 0, -1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_Actions(), this.getConstrainedInstanceObject(), null, "actions", null, 0, //$NON-NLS-1$
				-1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_StateTransitions(), this.getStateTransitionInstance(), null,
				"stateTransitions", null, 0, -1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, //$NON-NLS-1$
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationInstanceEClass, AssociationInstance.class, "AssociationInstance", !IS_ABSTRACT, //$NON-NLS-1$
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssociationInstance_AssociationType(), theAadlv3Package.getAssociationType(),
				"associationType", null, 0, 1, AssociationInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, //$NON-NLS-1$
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationInstance_Association(), theAadlv3Package.getAssociation(), null, "association", //$NON-NLS-1$
				null, 0, 1, AssociationInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationInstance_Source(), this.getInstanceObject(),
				this.getInstanceObject_OutgoingAssociations(), "source", null, 0, 1, AssociationInstance.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssociationInstance_Destination(), this.getInstanceObject(),
				this.getInstanceObject_IncomingAssociations(), "destination", null, 0, 1, AssociationInstance.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssociationInstance_SourceDelegates(), theAadlv3Package.getAssociation(), null,
				"sourceDelegates", null, 0, -1, AssociationInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, //$NON-NLS-1$
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationInstance_DestinationDelegates(), theAadlv3Package.getAssociation(), null,
				"destinationDelegates", null, 0, -1, AssociationInstance.class, !IS_TRANSIENT, !IS_VOLATILE, //$NON-NLS-1$
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociationInstance_External(), ecorePackage.getEBoolean(), "external", null, 0, 1, //$NON-NLS-1$
				AssociationInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociationInstance_Bidirectional(), ecorePackage.getEBoolean(), "bidirectional", null, 0, 1, //$NON-NLS-1$
				AssociationInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathInstanceEClass, PathInstance.class, "PathInstance", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPathInstance_Elements(), this.getInstanceObject(), null, "elements", null, 0, -1, //$NON-NLS-1$
				PathInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathInstance_Path(), theAadlv3Package.getPathSequence(), null, "path", null, 0, 1, //$NON-NLS-1$
				PathInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behaviorInstanceEClass, BehaviorInstance.class, "BehaviorInstance", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehaviorInstance_Behavior(), theAadlv3Package.getBehavior(), null, "behavior", null, 0, 1, //$NON-NLS-1$
				BehaviorInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorInstance_Condition(), theAadlv3Package.getLiteral(), null, "condition", null, 0, 1, //$NON-NLS-1$
				BehaviorInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorInstance_Actions(), this.getConstrainedInstanceObject(), null, "actions", null, 0, -1, //$NON-NLS-1$
				BehaviorInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehaviorInstance_Sink(), ecorePackage.getEBoolean(), "sink", null, 0, 1, //$NON-NLS-1$
				BehaviorInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehaviorInstance_Source(), ecorePackage.getEBoolean(), "source", null, 0, 1, //$NON-NLS-1$
				BehaviorInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehaviorInstance_Category(), theAadlv3Package.getBehaviorCategory(), "category", "flow", 0, 1, //$NON-NLS-1$//$NON-NLS-2$
				BehaviorInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(generatorInstanceEClass, GeneratorInstance.class, "GeneratorInstance", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneratorInstance_Generator(), theAadlv3Package.getGenerator(), null, "generator", null, 0, 1, //$NON-NLS-1$
				GeneratorInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneratorInstance_GeneratedLiterals(), this.getConstrainedInstanceObject(), null,
				"generatedLiterals", null, 0, -1, GeneratorInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, //$NON-NLS-1$
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratorInstance_Type(), ecorePackage.getEString(), "type", null, 0, 1, //$NON-NLS-1$
				GeneratorInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(constrainedInstanceObjectEClass, ConstrainedInstanceObject.class, "ConstrainedInstanceObject", //$NON-NLS-1$
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstrainedInstanceObject_InstanceObject(), this.getInstanceObject(), null, "instanceObject", //$NON-NLS-1$
				null, 0, 1, ConstrainedInstanceObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstrainedInstanceObject_Constraint(), theAadlv3Package.getLiteral(), null, "constraint", //$NON-NLS-1$
				null, 0, 1, ConstrainedInstanceObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstrainedInstanceObject_Outgoing(), ecorePackage.getEBoolean(), "outgoing", null, 0, 1, //$NON-NLS-1$
				ConstrainedInstanceObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateVariableInstanceEClass, StateVariableInstance.class, "StateVariableInstance", !IS_ABSTRACT, //$NON-NLS-1$
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateVariableInstance_CurrentState(), this.getStateInstance(), null, "currentState", null, 0, //$NON-NLS-1$
				1, StateVariableInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateVariableInstance_StateVariable(), theAadlv3Package.getStateVariable(), null,
				"stateVariable", null, 0, 1, StateVariableInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, //$NON-NLS-1$
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateVariableInstance_States(), this.getStateInstance(), null, "states", null, 0, -1, //$NON-NLS-1$
				StateVariableInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateInstanceEClass, StateInstance.class, "StateInstance", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(stateTransitionInstanceEClass, StateTransitionInstance.class, "StateTransitionInstance", //$NON-NLS-1$
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateTransitionInstance_StateTransition(), theAadlv3Package.getStateTransition(), null,
				"stateTransition", null, 0, 1, StateTransitionInstance.class, !IS_TRANSIENT, !IS_VOLATILE, //$NON-NLS-1$
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateTransitionInstance_Condition(), theAadlv3Package.getLiteral(), null, "condition", null, //$NON-NLS-1$
				0, 1, StateTransitionInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateTransitionInstance_TargetState(), this.getStateInstance(), null, "targetState", null, 0, //$NON-NLS-1$
				1, StateTransitionInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Av3instancePackageImpl
