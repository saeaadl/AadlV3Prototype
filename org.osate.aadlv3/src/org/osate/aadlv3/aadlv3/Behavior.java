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
 * A representation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.Behavior#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.Behavior#getActions <em>Actions</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.Behavior#isSource <em>Source</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.Behavior#isSink <em>Sink</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.Behavior#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getBehavior()
 * @model
 * @generated
 */
public interface Behavior extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Literal)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getBehavior_Condition()
	 * @model containment="true"
	 * @generated
	 */
	Literal getCondition();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.Behavior#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Literal value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.BinaryOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getBehavior_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<BinaryOperation> getActions();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(boolean)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getBehavior_Source()
	 * @model
	 * @generated
	 */
	boolean isSource();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.Behavior#isSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #isSource()
	 * @generated
	 */
	void setSource(boolean value);

	/**
	 * Returns the value of the '<em><b>Sink</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sink</em>' attribute.
	 * @see #setSink(boolean)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getBehavior_Sink()
	 * @model
	 * @generated
	 */
	boolean isSink();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.Behavior#isSink <em>Sink</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sink</em>' attribute.
	 * @see #isSink()
	 * @generated
	 */
	void setSink(boolean value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The default value is <code>"flow"</code>.
	 * The literals are from the enumeration {@link org.osate.aadlv3.aadlv3.BehaviorCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see org.osate.aadlv3.aadlv3.BehaviorCategory
	 * @see #setCategory(BehaviorCategory)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getBehavior_Category()
	 * @model default="flow"
	 * @generated
	 */
	BehaviorCategory getCategory();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.Behavior#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see org.osate.aadlv3.aadlv3.BehaviorCategory
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(BehaviorCategory value);

} // Behavior
