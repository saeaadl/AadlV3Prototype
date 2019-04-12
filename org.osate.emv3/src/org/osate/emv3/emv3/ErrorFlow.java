/**
 * Copyright Text	Copyright 2018 Carnegie Mellon University. All Rights Reserved....
 */
package org.osate.emv3.emv3;

import org.osate.aadlv3.aadlv3.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.emv3.emv3.ErrorFlow#getTypeTokenConstraint <em>Type Token Constraint</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorFlow#getFlowcondition <em>Flowcondition</em>}</li>
 * </ul>
 *
 * @see org.osate.emv3.emv3.Emv3Package#getErrorFlow()
 * @model
 * @generated
 */
public interface ErrorFlow extends NamedElement {
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
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorFlow_TypeTokenConstraint()
	 * @model containment="true"
	 * @generated
	 */
	TypeSet getTypeTokenConstraint();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.ErrorFlow#getTypeTokenConstraint <em>Type Token Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Token Constraint</em>' containment reference.
	 * @see #getTypeTokenConstraint()
	 * @generated
	 */
	void setTypeTokenConstraint(TypeSet value);

	/**
	 * Returns the value of the '<em><b>Flowcondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flowcondition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flowcondition</em>' containment reference.
	 * @see #setFlowcondition(IfCondition)
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorFlow_Flowcondition()
	 * @model containment="true"
	 * @generated
	 */
	IfCondition getFlowcondition();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.ErrorFlow#getFlowcondition <em>Flowcondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flowcondition</em>' containment reference.
	 * @see #getFlowcondition()
	 * @generated
	 */
	void setFlowcondition(IfCondition value);

} // ErrorFlow
