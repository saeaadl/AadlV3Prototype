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
 * A representation of the model object '<em><b>State Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.StateVariable#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.StateVariable#getStateType <em>State Type</em>}</li>
 * </ul>
 *
 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getStateVariable()
 * @model
 * @generated
 */
public interface StateVariable extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' containment reference.
	 * @see #setInitialState(EnumerationLiteral)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getStateVariable_InitialState()
	 * @model containment="true"
	 * @generated
	 */
	EnumerationLiteral getInitialState();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.StateVariable#getInitialState <em>Initial State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' containment reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(EnumerationLiteral value);

	/**
	 * Returns the value of the '<em><b>State Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Type</em>' reference.
	 * @see #setStateType(TypeDef)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getStateVariable_StateType()
	 * @model
	 * @generated
	 */
	TypeDef getStateType();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.StateVariable#getStateType <em>State Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Type</em>' reference.
	 * @see #getStateType()
	 * @generated
	 */
	void setStateType(TypeDef value);

} // StateVariable
