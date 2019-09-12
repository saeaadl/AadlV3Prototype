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
 *   <li>{@link org.osate.aadlv3.aadlv3.BehaviorSpecification#getRules <em>Rules</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.BehaviorSpecification#getStates <em>States</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.BehaviorSpecification#getGenerators <em>Generators</em>}</li>
 * </ul>
 *
 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getBehaviorSpecification()
 * @model
 * @generated
 */
public interface BehaviorSpecification extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.BehaviorRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getBehaviorSpecification_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<BehaviorRule> getRules();

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference.
	 * @see #setStates(TypeDef)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getBehaviorSpecification_States()
	 * @model
	 * @generated
	 */
	TypeDef getStates();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.BehaviorSpecification#getStates <em>States</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>States</em>' reference.
	 * @see #getStates()
	 * @generated
	 */
	void setStates(TypeDef value);

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
