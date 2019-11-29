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

import org.eclipse.emf.common.util.EList;
import org.osate.aadlv3.aadlv3.StateVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Variable Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.av3instance.av3instance.StateVariableInstance#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.StateVariableInstance#getStateVariable <em>State Variable</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.StateVariableInstance#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see org.osate.av3instance.av3instance.Av3instancePackage#getStateVariableInstance()
 * @model
 * @generated
 */
public interface StateVariableInstance extends InstanceObject {
	/**
	 * Returns the value of the '<em><b>Current State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current State</em>' reference.
	 * @see #setCurrentState(StateInstance)
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getStateVariableInstance_CurrentState()
	 * @model
	 * @generated
	 */
	StateInstance getCurrentState();

	/**
	 * Sets the value of the '{@link org.osate.av3instance.av3instance.StateVariableInstance#getCurrentState <em>Current State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current State</em>' reference.
	 * @see #getCurrentState()
	 * @generated
	 */
	void setCurrentState(StateInstance value);

	/**
	 * Returns the value of the '<em><b>State Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Variable</em>' reference.
	 * @see #setStateVariable(StateVariable)
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getStateVariableInstance_StateVariable()
	 * @model
	 * @generated
	 */
	StateVariable getStateVariable();

	/**
	 * Sets the value of the '{@link org.osate.av3instance.av3instance.StateVariableInstance#getStateVariable <em>State Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Variable</em>' reference.
	 * @see #getStateVariable()
	 * @generated
	 */
	void setStateVariable(StateVariable value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.av3instance.av3instance.StateInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getStateVariableInstance_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<StateInstance> getStates();

} // StateVariableInstance
