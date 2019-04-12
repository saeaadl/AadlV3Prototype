/**
 * Copyright Text	Copyright 2018 Carnegie Mellon University. All Rights Reserved....
 */
package org.osate.emv3.emv3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SCondition Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.emv3.emv3.SConditionElement#getQualifiedState <em>Qualified State</em>}</li>
 * </ul>
 *
 * @see org.osate.emv3.emv3.Emv3Package#getSConditionElement()
 * @model
 * @generated
 */
public interface SConditionElement extends ConditionElement {
	/**
	 * Returns the value of the '<em><b>Qualified State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified State</em>' containment reference.
	 * @see #setQualifiedState(QualifiedErrorBehaviorState)
	 * @see org.osate.emv3.emv3.Emv3Package#getSConditionElement_QualifiedState()
	 * @model containment="true"
	 * @generated
	 */
	QualifiedErrorBehaviorState getQualifiedState();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.SConditionElement#getQualifiedState <em>Qualified State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified State</em>' containment reference.
	 * @see #getQualifiedState()
	 * @generated
	 */
	void setQualifiedState(QualifiedErrorBehaviorState value);

} // SConditionElement
