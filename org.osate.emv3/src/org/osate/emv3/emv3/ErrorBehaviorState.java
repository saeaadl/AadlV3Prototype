/**
 * Copyright Text	Copyright 2018 Carnegie Mellon University. All Rights Reserved....
 */
package org.osate.emv3.emv3;

import org.osate.aadlv3.aadlv3.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Behavior State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.emv3.emv3.ErrorBehaviorState#isIntial <em>Intial</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorBehaviorState#getTypeSet <em>Type Set</em>}</li>
 * </ul>
 *
 * @see org.osate.emv3.emv3.Emv3Package#getErrorBehaviorState()
 * @model
 * @generated
 */
public interface ErrorBehaviorState extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Intial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intial</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intial</em>' attribute.
	 * @see #setIntial(boolean)
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorBehaviorState_Intial()
	 * @model
	 * @generated
	 */
	boolean isIntial();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.ErrorBehaviorState#isIntial <em>Intial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intial</em>' attribute.
	 * @see #isIntial()
	 * @generated
	 */
	void setIntial(boolean value);

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
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorBehaviorState_TypeSet()
	 * @model containment="true"
	 * @generated
	 */
	TypeSet getTypeSet();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.ErrorBehaviorState#getTypeSet <em>Type Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Set</em>' containment reference.
	 * @see #getTypeSet()
	 * @generated
	 */
	void setTypeSet(TypeSet value);

} // ErrorBehaviorState
