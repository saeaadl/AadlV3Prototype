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
package org.osate.av3instance.av3instance;

import org.osate.aadlv3.aadlv3.EnumerationLiteral;
import org.osate.aadlv3.aadlv3.Literal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.av3instance.av3instance.StateInstance#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.StateInstance#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @see org.osate.av3instance.av3instance.Av3instancePackage#getStateInstance()
 * @model
 * @generated
 */
public interface StateInstance extends InstanceObject {
	/**
	 * Returns the value of the '<em><b>Current State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current State</em>' containment reference.
	 * @see #setCurrentState(EnumerationLiteral)
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getStateInstance_CurrentState()
	 * @model containment="true"
	 * @generated
	 */
	EnumerationLiteral getCurrentState();

	/**
	 * Sets the value of the '{@link org.osate.av3instance.av3instance.StateInstance#getCurrentState <em>Current State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current State</em>' containment reference.
	 * @see #getCurrentState()
	 * @generated
	 */
	void setCurrentState(EnumerationLiteral value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference.
	 * @see #setConstraint(Literal)
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getStateInstance_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	Literal getConstraint();

	/**
	 * Sets the value of the '{@link org.osate.av3instance.av3instance.StateInstance#getConstraint <em>Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' containment reference.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(Literal value);

} // StateInstance
