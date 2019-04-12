/**
 * Copyright Text	Copyright 2018 Carnegie Mellon University. All Rights Reserved....
 */
package org.osate.emv3.emv3;

import org.eclipse.emf.common.util.EList;

import org.osate.aadlv3.aadlv3.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recover Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.emv3.emv3.RecoverEvent#getEventInitiator <em>Event Initiator</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.RecoverEvent#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see org.osate.emv3.emv3.Emv3Package#getRecoverEvent()
 * @model
 * @generated
 */
public interface RecoverEvent extends ErrorBehaviorEvent {
	/**
	 * Returns the value of the '<em><b>Event Initiator</b></em>' reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Initiator</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Initiator</em>' reference list.
	 * @see org.osate.emv3.emv3.Emv3Package#getRecoverEvent_EventInitiator()
	 * @model
	 * @generated
	 */
	EList<NamedElement> getEventInitiator();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(IfCondition)
	 * @see org.osate.emv3.emv3.Emv3Package#getRecoverEvent_Condition()
	 * @model containment="true"
	 * @generated
	 */
	IfCondition getCondition();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.RecoverEvent#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(IfCondition value);

} // RecoverEvent
