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
 * A representation of the model object '<em><b>Type Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.TypeDef#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.TypeDef#getBaseType <em>Base Type</em>}</li>
 * </ul>
 *
 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getTypeDef()
 * @model
 * @generated
 */
public interface TypeDef extends NamedType {
	/**
	 * Returns the value of the '<em><b>Super Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Type</em>' containment reference.
	 * @see #setSuperType(Type)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getTypeDef_SuperType()
	 * @model containment="true"
	 * @generated
	 */
	Type getSuperType();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.TypeDef#getSuperType <em>Super Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Type</em>' containment reference.
	 * @see #getSuperType()
	 * @generated
	 */
	void setSuperType(Type value);

	/**
	 * Returns the value of the '<em><b>Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Type</em>' containment reference.
	 * @see #setBaseType(Type)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getTypeDef_BaseType()
	 * @model containment="true"
	 * @generated
	 */
	Type getBaseType();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.TypeDef#getBaseType <em>Base Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Type</em>' containment reference.
	 * @see #getBaseType()
	 * @generated
	 */
	void setBaseType(Type value);

} // TypeDef
