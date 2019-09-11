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
 * A representation of the model object '<em><b>Behavior Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.BehaviorSpecification#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.BehaviorSpecification#getTargetState <em>Target State</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.BehaviorSpecification#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.BehaviorSpecification#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getBehaviorSpecification()
 * @model
 * @generated
 */
public interface BehaviorSpecification extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(StateSpecification)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getBehaviorSpecification_Guard()
	 * @model containment="true"
	 * @generated
	 */
	StateSpecification getGuard();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.BehaviorSpecification#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(StateSpecification value);

	/**
	 * Returns the value of the '<em><b>Target State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target State</em>' reference.
	 * @see #setTargetState(StateSpecification)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getBehaviorSpecification_TargetState()
	 * @model ordered="false"
	 * @generated
	 */
	StateSpecification getTargetState();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.BehaviorSpecification#getTargetState <em>Target State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target State</em>' reference.
	 * @see #getTargetState()
	 * @generated
	 */
	void setTargetState(StateSpecification value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(MultiLiteralConstraint)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getBehaviorSpecification_Condition()
	 * @model containment="true"
	 * @generated
	 */
	MultiLiteralConstraint getCondition();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.BehaviorSpecification#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(MultiLiteralConstraint value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' reference.
	 * @see #setResult(Literal)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getBehaviorSpecification_Result()
	 * @model
	 * @generated
	 */
	Literal getResult();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.BehaviorSpecification#getResult <em>Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(Literal value);

} // BehaviorSpecification
