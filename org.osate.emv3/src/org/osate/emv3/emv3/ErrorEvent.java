/**
 * Copyright Text	Copyright 2018 Carnegie Mellon University. All Rights Reserved....
 */
package org.osate.emv3.emv3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.emv3.emv3.ErrorEvent#getTypeSet <em>Type Set</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorEvent#getEventcondition <em>Eventcondition</em>}</li>
 * </ul>
 *
 * @see org.osate.emv3.emv3.Emv3Package#getErrorEvent()
 * @model
 * @generated
 */
public interface ErrorEvent extends ErrorBehaviorEvent {
	/**
	 * Returns the value of the '<em><b>Type Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Set</em>' containment reference.
	 * @see #setTypeSet(TypeSet)
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorEvent_TypeSet()
	 * @model containment="true"
	 * @generated
	 */
	TypeSet getTypeSet();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.ErrorEvent#getTypeSet <em>Type Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Set</em>' containment reference.
	 * @see #getTypeSet()
	 * @generated
	 */
	void setTypeSet(TypeSet value);

	/**
	 * Returns the value of the '<em><b>Eventcondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eventcondition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eventcondition</em>' containment reference.
	 * @see #setEventcondition(IfCondition)
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorEvent_Eventcondition()
	 * @model containment="true"
	 * @generated
	 */
	IfCondition getEventcondition();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.ErrorEvent#getEventcondition <em>Eventcondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eventcondition</em>' containment reference.
	 * @see #getEventcondition()
	 * @generated
	 */
	void setEventcondition(IfCondition value);

} // ErrorEvent
