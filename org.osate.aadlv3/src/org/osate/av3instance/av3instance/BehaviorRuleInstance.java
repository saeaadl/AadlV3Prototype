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
import org.osate.aadlv3.aadlv3.BehaviorRule;
import org.osate.aadlv3.aadlv3.Literal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Rule Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.av3instance.av3instance.BehaviorRuleInstance#getBehaviorRule <em>Behavior Rule</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.BehaviorRuleInstance#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.BehaviorRuleInstance#getActions <em>Actions</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.BehaviorRuleInstance#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.BehaviorRuleInstance#getTargetState <em>Target State</em>}</li>
 * </ul>
 *
 * @see org.osate.av3instance.av3instance.Av3instancePackage#getBehaviorRuleInstance()
 * @model
 * @generated
 */
public interface BehaviorRuleInstance extends InstanceObject {
	/**
	 * Returns the value of the '<em><b>Behavior Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior Rule</em>' reference.
	 * @see #setBehaviorRule(BehaviorRule)
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getBehaviorRuleInstance_BehaviorRule()
	 * @model
	 * @generated
	 */
	BehaviorRule getBehaviorRule();

	/**
	 * Sets the value of the '{@link org.osate.av3instance.av3instance.BehaviorRuleInstance#getBehaviorRule <em>Behavior Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior Rule</em>' reference.
	 * @see #getBehaviorRule()
	 * @generated
	 */
	void setBehaviorRule(BehaviorRule value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.av3instance.av3instance.ConstrainedInstanceObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getBehaviorRuleInstance_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConstrainedInstanceObject> getActions();

	/**
	 * Returns the value of the '<em><b>Current State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current State</em>' containment reference.
	 * @see #setCurrentState(StateInstance)
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getBehaviorRuleInstance_CurrentState()
	 * @model containment="true"
	 * @generated
	 */
	StateInstance getCurrentState();

	/**
	 * Sets the value of the '{@link org.osate.av3instance.av3instance.BehaviorRuleInstance#getCurrentState <em>Current State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current State</em>' containment reference.
	 * @see #getCurrentState()
	 * @generated
	 */
	void setCurrentState(StateInstance value);

	/**
	 * Returns the value of the '<em><b>Target State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target State</em>' containment reference.
	 * @see #setTargetState(StateInstance)
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getBehaviorRuleInstance_TargetState()
	 * @model containment="true"
	 * @generated
	 */
	StateInstance getTargetState();

	/**
	 * Sets the value of the '{@link org.osate.av3instance.av3instance.BehaviorRuleInstance#getTargetState <em>Target State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target State</em>' containment reference.
	 * @see #getTargetState()
	 * @generated
	 */
	void setTargetState(StateInstance value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Literal)
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getBehaviorRuleInstance_Condition()
	 * @model containment="true"
	 * @generated
	 */
	Literal getCondition();

	/**
	 * Sets the value of the '{@link org.osate.av3instance.av3instance.BehaviorRuleInstance#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Literal value);

} // BehaviorRuleInstance
