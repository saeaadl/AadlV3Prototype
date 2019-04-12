/**
 * Copyright Text	Copyright 2018 Carnegie Mellon University. All Rights Reserved....
 */
package org.osate.emv3.emv3;

import org.eclipse.emf.common.util.EList;

import org.osate.aadlv3.aadlv3.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Behavior State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.emv3.emv3.ErrorBehaviorStateMachine#getUseTypes <em>Use Types</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorBehaviorStateMachine#getUseTransformation <em>Use Transformation</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorBehaviorStateMachine#getEvents <em>Events</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorBehaviorStateMachine#getStates <em>States</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorBehaviorStateMachine#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @see org.osate.emv3.emv3.Emv3Package#getErrorBehaviorStateMachine()
 * @model
 * @generated
 */
public interface ErrorBehaviorStateMachine extends NamedElement {
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
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorBehaviorStateMachine_UseTypes()
	 * @model
	 * @generated
	 */
	EList<ErrorModelLibrary> getUseTypes();

	/**
	 * Returns the value of the '<em><b>Use Transformation</b></em>' reference list.
	 * The list contents are of type {@link org.osate.emv3.emv3.TypeTransformationSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Transformation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Transformation</em>' reference list.
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorBehaviorStateMachine_UseTransformation()
	 * @model
	 * @generated
	 */
	EList<TypeTransformationSet> getUseTransformation();

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
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorBehaviorStateMachine_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<ErrorBehaviorEvent> getEvents();

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.emv3.emv3.ErrorBehaviorState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorBehaviorStateMachine_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<ErrorBehaviorState> getStates();

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
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorBehaviorStateMachine_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ErrorBehaviorTransition> getTransitions();

} // ErrorBehaviorStateMachine
