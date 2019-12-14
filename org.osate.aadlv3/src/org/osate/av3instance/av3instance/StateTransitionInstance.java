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

import org.osate.aadlv3.aadlv3.Literal;
import org.osate.aadlv3.aadlv3.StateTransition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Transition Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.av3instance.av3instance.StateTransitionInstance#getStateTransition <em>State Transition</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.StateTransitionInstance#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.StateTransitionInstance#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.StateTransitionInstance#getTargetState <em>Target State</em>}</li>
 * </ul>
 *
 * @see org.osate.av3instance.av3instance.Av3instancePackage#getStateTransitionInstance()
 * @model
 * @generated
 */
public interface StateTransitionInstance extends InstanceObject {
	/**
	 * Returns the value of the '<em><b>State Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Transition</em>' reference.
	 * @see #setStateTransition(StateTransition)
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getStateTransitionInstance_StateTransition()
	 * @model
	 * @generated
	 */
	StateTransition getStateTransition();

	/**
	 * Sets the value of the '{@link org.osate.av3instance.av3instance.StateTransitionInstance#getStateTransition <em>State Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Transition</em>' reference.
	 * @see #getStateTransition()
	 * @generated
	 */
	void setStateTransition(StateTransition value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Literal)
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getStateTransitionInstance_Condition()
	 * @model containment="true"
	 * @generated
	 */
	Literal getCondition();

	/**
	 * Sets the value of the '{@link org.osate.av3instance.av3instance.StateTransitionInstance#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Literal value);

	/**
	 * Returns the value of the '<em><b>Current State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current State</em>' reference.
	 * @see #setCurrentState(StateInstance)
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getStateTransitionInstance_CurrentState()
	 * @model
	 * @generated
	 */
	StateInstance getCurrentState();

	/**
	 * Sets the value of the '{@link org.osate.av3instance.av3instance.StateTransitionInstance#getCurrentState <em>Current State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current State</em>' reference.
	 * @see #getCurrentState()
	 * @generated
	 */
	void setCurrentState(StateInstance value);

	/**
	 * Returns the value of the '<em><b>Target State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target State</em>' reference.
	 * @see #setTargetState(StateInstance)
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getStateTransitionInstance_TargetState()
	 * @model
	 * @generated
	 */
	StateInstance getTargetState();

	/**
	 * Sets the value of the '{@link org.osate.av3instance.av3instance.StateTransitionInstance#getTargetState <em>Target State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target State</em>' reference.
	 * @see #getTargetState()
	 * @generated
	 */
	void setTargetState(StateInstance value);

} // StateTransitionInstance
