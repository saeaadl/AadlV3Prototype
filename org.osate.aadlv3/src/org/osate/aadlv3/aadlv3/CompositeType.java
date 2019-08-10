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
 * A representation of the model object '<em><b>Composite Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.CompositeType#getCompositeType <em>Composite Type</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.CompositeType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getCompositeType()
 * @model
 * @generated
 */
public interface CompositeType extends Type {
	/**
	 * Returns the value of the '<em><b>Composite Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.osate.aadlv3.aadlv3.Composite}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Type</em>' attribute.
	 * @see org.osate.aadlv3.aadlv3.Composite
	 * @see #setCompositeType(Composite)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getCompositeType_CompositeType()
	 * @model
	 * @generated
	 */
	Composite getCompositeType();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.CompositeType#getCompositeType <em>Composite Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite Type</em>' attribute.
	 * @see org.osate.aadlv3.aadlv3.Composite
	 * @see #getCompositeType()
	 * @generated
	 */
	void setCompositeType(Composite value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Type)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getCompositeType_Type()
	 * @model containment="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.CompositeType#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // CompositeType
