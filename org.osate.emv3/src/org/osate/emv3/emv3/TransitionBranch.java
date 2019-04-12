/**
 * Copyright Text	Copyright 2018 Carnegie Mellon University. All Rights Reserved....
 */
package org.osate.emv3.emv3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.emv3.emv3.TransitionBranch#getTarget <em>Target</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.TransitionBranch#getTargetToken <em>Target Token</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.TransitionBranch#isSteadyState <em>Steady State</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.TransitionBranch#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.osate.emv3.emv3.Emv3Package#getTransitionBranch()
 * @model
 * @generated
 */
public interface TransitionBranch extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ErrorBehaviorState)
	 * @see org.osate.emv3.emv3.Emv3Package#getTransitionBranch_Target()
	 * @model
	 * @generated
	 */
	ErrorBehaviorState getTarget();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.TransitionBranch#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ErrorBehaviorState value);

	/**
	 * Returns the value of the '<em><b>Target Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Token</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Token</em>' containment reference.
	 * @see #setTargetToken(TypeSet)
	 * @see org.osate.emv3.emv3.Emv3Package#getTransitionBranch_TargetToken()
	 * @model containment="true"
	 * @generated
	 */
	TypeSet getTargetToken();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.TransitionBranch#getTargetToken <em>Target Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Token</em>' containment reference.
	 * @see #getTargetToken()
	 * @generated
	 */
	void setTargetToken(TypeSet value);

	/**
	 * Returns the value of the '<em><b>Steady State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steady State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steady State</em>' attribute.
	 * @see #setSteadyState(boolean)
	 * @see org.osate.emv3.emv3.Emv3Package#getTransitionBranch_SteadyState()
	 * @model
	 * @generated
	 */
	boolean isSteadyState();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.TransitionBranch#isSteadyState <em>Steady State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Steady State</em>' attribute.
	 * @see #isSteadyState()
	 * @generated
	 */
	void setSteadyState(boolean value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(BranchValue)
	 * @see org.osate.emv3.emv3.Emv3Package#getTransitionBranch_Value()
	 * @model containment="true"
	 * @generated
	 */
	BranchValue getValue();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.TransitionBranch#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BranchValue value);

} // TransitionBranch
