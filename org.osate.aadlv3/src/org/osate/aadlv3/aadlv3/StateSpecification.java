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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.StateSpecification#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.StateSpecification#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getStateSpecification()
 * @model
 * @generated
 */
public interface StateSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Current State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current State</em>' containment reference.
	 * @see #setCurrentState(EnumerationLiteral)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getStateSpecification_CurrentState()
	 * @model containment="true"
	 * @generated
	 */
	EnumerationLiteral getCurrentState();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.StateSpecification#getCurrentState <em>Current State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current State</em>' containment reference.
	 * @see #getCurrentState()
	 * @generated
	 */
	void setCurrentState(EnumerationLiteral value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TypeReference)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getStateSpecification_Type()
	 * @model
	 * @generated
	 */
	TypeReference getType();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.StateSpecification#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeReference value);

} // StateSpecification
