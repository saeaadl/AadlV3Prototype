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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.BehaviorSpecification#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.BehaviorSpecification#getBehaviors <em>Behaviors</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.BehaviorSpecification#getStateVariables <em>State Variables</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.BehaviorSpecification#getGenerators <em>Generators</em>}</li>
 * </ul>
 *
 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getBehaviorSpecification()
 * @model
 * @generated
 */
public interface BehaviorSpecification extends AnnexSubclause {
	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.StateTransition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getBehaviorSpecification_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<StateTransition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Behaviors</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.Behavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviors</em>' containment reference list.
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getBehaviorSpecification_Behaviors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Behavior> getBehaviors();

	/**
	 * Returns the value of the '<em><b>State Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.StateVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Variables</em>' containment reference list.
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getBehaviorSpecification_StateVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<StateVariable> getStateVariables();

	/**
	 * Returns the value of the '<em><b>Generators</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.Generator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generators</em>' containment reference list.
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getBehaviorSpecification_Generators()
	 * @model containment="true"
	 * @generated
	 */
	EList<Generator> getGenerators();

} // BehaviorSpecification
