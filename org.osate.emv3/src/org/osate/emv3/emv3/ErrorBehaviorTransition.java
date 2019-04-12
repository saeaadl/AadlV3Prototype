/**
 * Copyright Text	Copyright 2018 Carnegie Mellon University. All Rights Reserved....
 */
package org.osate.emv3.emv3;

import org.eclipse.emf.common.util.EList;

import org.osate.aadlv3.aadlv3.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Behavior Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.emv3.emv3.ErrorBehaviorTransition#getSource <em>Source</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorBehaviorTransition#getTypeTokenConstraint <em>Type Token Constraint</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorBehaviorTransition#isAllStates <em>All States</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorBehaviorTransition#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorBehaviorTransition#getTarget <em>Target</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorBehaviorTransition#getTargetToken <em>Target Token</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorBehaviorTransition#isSteadyState <em>Steady State</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorBehaviorTransition#getDestinationBranches <em>Destination Branches</em>}</li>
 * </ul>
 *
 * @see org.osate.emv3.emv3.Emv3Package#getErrorBehaviorTransition()
 * @model
 * @generated
 */
public interface ErrorBehaviorTransition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ErrorBehaviorState)
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorBehaviorTransition_Source()
	 * @model
	 * @generated
	 */
	ErrorBehaviorState getSource();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.ErrorBehaviorTransition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ErrorBehaviorState value);

	/**
	 * Returns the value of the '<em><b>Type Token Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Token Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Token Constraint</em>' containment reference.
	 * @see #setTypeTokenConstraint(TypeSet)
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorBehaviorTransition_TypeTokenConstraint()
	 * @model containment="true"
	 * @generated
	 */
	TypeSet getTypeTokenConstraint();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.ErrorBehaviorTransition#getTypeTokenConstraint <em>Type Token Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Token Constraint</em>' containment reference.
	 * @see #getTypeTokenConstraint()
	 * @generated
	 */
	void setTypeTokenConstraint(TypeSet value);

	/**
	 * Returns the value of the '<em><b>All States</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All States</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All States</em>' attribute.
	 * @see #setAllStates(boolean)
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorBehaviorTransition_AllStates()
	 * @model
	 * @generated
	 */
	boolean isAllStates();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.ErrorBehaviorTransition#isAllStates <em>All States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All States</em>' attribute.
	 * @see #isAllStates()
	 * @generated
	 */
	void setAllStates(boolean value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(ConditionExpression)
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorBehaviorTransition_Condition()
	 * @model containment="true"
	 * @generated
	 */
	ConditionExpression getCondition();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.ErrorBehaviorTransition#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(ConditionExpression value);

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
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorBehaviorTransition_Target()
	 * @model
	 * @generated
	 */
	ErrorBehaviorState getTarget();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.ErrorBehaviorTransition#getTarget <em>Target</em>}' reference.
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
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorBehaviorTransition_TargetToken()
	 * @model containment="true"
	 * @generated
	 */
	TypeSet getTargetToken();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.ErrorBehaviorTransition#getTargetToken <em>Target Token</em>}' containment reference.
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
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorBehaviorTransition_SteadyState()
	 * @model
	 * @generated
	 */
	boolean isSteadyState();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.ErrorBehaviorTransition#isSteadyState <em>Steady State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Steady State</em>' attribute.
	 * @see #isSteadyState()
	 * @generated
	 */
	void setSteadyState(boolean value);

	/**
	 * Returns the value of the '<em><b>Destination Branches</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.emv3.emv3.TransitionBranch}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Branches</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Branches</em>' containment reference list.
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorBehaviorTransition_DestinationBranches()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransitionBranch> getDestinationBranches();

} // ErrorBehaviorTransition
