/**
 * Copyright Text	Copyright 2018 Carnegie Mellon University. All Rights Reserved....
 */
package org.osate.emv3.emv3;

import org.eclipse.emf.common.util.EList;

import org.osate.aadlv3.aadlv3.PackageElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Model Subclause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.emv3.emv3.ErrorModelSubclause#getUseTypes <em>Use Types</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorModelSubclause#getTypeEquivalence <em>Type Equivalence</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorModelSubclause#getTypeMappingSet <em>Type Mapping Set</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorModelSubclause#getUseBehavior <em>Use Behavior</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorModelSubclause#getPropagations <em>Propagations</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorModelSubclause#getFlows <em>Flows</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorModelSubclause#getUseTransformation <em>Use Transformation</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorModelSubclause#getEvents <em>Events</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorModelSubclause#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorModelSubclause#getOutgoingPropagationConditions <em>Outgoing Propagation Conditions</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorModelSubclause#getErrorDetections <em>Error Detections</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorModelSubclause#getErrorStateToModeMappings <em>Error State To Mode Mappings</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorModelSubclause#getStates <em>States</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorModelSubclause#getTypeTransformationSet <em>Type Transformation Set</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorModelSubclause#getConnectionErrorSources <em>Connection Error Sources</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorModelSubclause#getPoints <em>Points</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorModelSubclause#getPaths <em>Paths</em>}</li>
 * </ul>
 *
 * @see org.osate.emv3.emv3.Emv3Package#getErrorModelSubclause()
 * @model
 * @generated
 */
public interface ErrorModelSubclause extends PackageElement {
	/**
	 * Returns the value of the '<em><b>Use Types</b></em>' reference list.
	 * The list contents are of type {@link org.osate.emv3.emv3.ErrorModelLibrary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Types</em>' reference list.
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorModelSubclause_UseTypes()
	 * @model
	 * @generated
	 */
	EList<ErrorModelLibrary> getUseTypes();

	/**
	 * Returns the value of the '<em><b>Type Equivalence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Equivalence</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Equivalence</em>' reference.
	 * @see #setTypeEquivalence(TypeMappingSet)
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorModelSubclause_TypeEquivalence()
	 * @model
	 * @generated
	 */
	TypeMappingSet getTypeEquivalence();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.ErrorModelSubclause#getTypeEquivalence <em>Type Equivalence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Equivalence</em>' reference.
	 * @see #getTypeEquivalence()
	 * @generated
	 */
	void setTypeEquivalence(TypeMappingSet value);

	/**
	 * Returns the value of the '<em><b>Type Mapping Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Mapping Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Mapping Set</em>' reference.
	 * @see #setTypeMappingSet(TypeMappingSet)
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorModelSubclause_TypeMappingSet()
	 * @model
	 * @generated
	 */
	TypeMappingSet getTypeMappingSet();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.ErrorModelSubclause#getTypeMappingSet <em>Type Mapping Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Mapping Set</em>' reference.
	 * @see #getTypeMappingSet()
	 * @generated
	 */
	void setTypeMappingSet(TypeMappingSet value);

	/**
	 * Returns the value of the '<em><b>Use Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Behavior</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Behavior</em>' reference.
	 * @see #setUseBehavior(ErrorBehaviorStateMachine)
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorModelSubclause_UseBehavior()
	 * @model
	 * @generated
	 */
	ErrorBehaviorStateMachine getUseBehavior();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.ErrorModelSubclause#getUseBehavior <em>Use Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Behavior</em>' reference.
	 * @see #getUseBehavior()
	 * @generated
	 */
	void setUseBehavior(ErrorBehaviorStateMachine value);

	/**
	 * Returns the value of the '<em><b>Propagations</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.emv3.emv3.ErrorPropagation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Propagations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propagations</em>' containment reference list.
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorModelSubclause_Propagations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ErrorPropagation> getPropagations();

	/**
	 * Returns the value of the '<em><b>Flows</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.emv3.emv3.ErrorFlow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flows</em>' containment reference list.
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorModelSubclause_Flows()
	 * @model containment="true"
	 * @generated
	 */
	EList<ErrorFlow> getFlows();

	/**
	 * Returns the value of the '<em><b>Use Transformation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Transformation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Transformation</em>' reference.
	 * @see #setUseTransformation(TypeTransformationSet)
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorModelSubclause_UseTransformation()
	 * @model
	 * @generated
	 */
	TypeTransformationSet getUseTransformation();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.ErrorModelSubclause#getUseTransformation <em>Use Transformation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Transformation</em>' reference.
	 * @see #getUseTransformation()
	 * @generated
	 */
	void setUseTransformation(TypeTransformationSet value);

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.emv3.emv3.ErrorBehaviorEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorModelSubclause_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<ErrorBehaviorEvent> getEvents();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.emv3.emv3.ErrorBehaviorTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorModelSubclause_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ErrorBehaviorTransition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Outgoing Propagation Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.emv3.emv3.OutgoingPropagationCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Propagation Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Propagation Conditions</em>' containment reference list.
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorModelSubclause_OutgoingPropagationConditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutgoingPropagationCondition> getOutgoingPropagationConditions();

	/**
	 * Returns the value of the '<em><b>Error Detections</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.emv3.emv3.ErrorDetection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Detections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Detections</em>' containment reference list.
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorModelSubclause_ErrorDetections()
	 * @model containment="true"
	 * @generated
	 */
	EList<ErrorDetection> getErrorDetections();

	/**
	 * Returns the value of the '<em><b>Error State To Mode Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.emv3.emv3.ErrorStateToModeMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error State To Mode Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error State To Mode Mappings</em>' containment reference list.
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorModelSubclause_ErrorStateToModeMappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ErrorStateToModeMapping> getErrorStateToModeMappings();

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.emv3.emv3.CompositeState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorModelSubclause_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompositeState> getStates();

	/**
	 * Returns the value of the '<em><b>Type Transformation Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Transformation Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Transformation Set</em>' reference.
	 * @see #setTypeTransformationSet(TypeTransformationSet)
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorModelSubclause_TypeTransformationSet()
	 * @model
	 * @generated
	 */
	TypeTransformationSet getTypeTransformationSet();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.ErrorModelSubclause#getTypeTransformationSet <em>Type Transformation Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Transformation Set</em>' reference.
	 * @see #getTypeTransformationSet()
	 * @generated
	 */
	void setTypeTransformationSet(TypeTransformationSet value);

	/**
	 * Returns the value of the '<em><b>Connection Error Sources</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.emv3.emv3.ErrorSource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Error Sources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Error Sources</em>' containment reference list.
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorModelSubclause_ConnectionErrorSources()
	 * @model containment="true"
	 * @generated
	 */
	EList<ErrorSource> getConnectionErrorSources();

	/**
	 * Returns the value of the '<em><b>Points</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.emv3.emv3.PropagationPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' containment reference list.
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorModelSubclause_Points()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropagationPoint> getPoints();

	/**
	 * Returns the value of the '<em><b>Paths</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.emv3.emv3.PropagationPath}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paths</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paths</em>' containment reference list.
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorModelSubclause_Paths()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropagationPath> getPaths();

} // ErrorModelSubclause
