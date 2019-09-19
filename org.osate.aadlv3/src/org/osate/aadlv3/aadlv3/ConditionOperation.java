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
package org.osate.aadlv3.aadlv3;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.ConditionOperation#getElement <em>Element</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.ConditionOperation#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.ConditionOperation#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getConditionOperation()
 * @model
 * @generated
 */
public interface ConditionOperation extends Literal {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference.
	 * @see #setElement(Literal)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getConditionOperation_Element()
	 * @model containment="true"
	 * @generated
	 */
	Literal getElement();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.ConditionOperation#getElement <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' containment reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(Literal value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.osate.aadlv3.aadlv3.COperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.osate.aadlv3.aadlv3.COperator
	 * @see #setOperator(COperator)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getConditionOperation_Operator()
	 * @model
	 * @generated
	 */
	COperator getOperator();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.ConditionOperation#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.osate.aadlv3.aadlv3.COperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(COperator value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference.
	 * @see #setConstraint(Literal)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getConditionOperation_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	Literal getConstraint();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.ConditionOperation#getConstraint <em>Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' containment reference.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(Literal value);

} // ConditionOperation
