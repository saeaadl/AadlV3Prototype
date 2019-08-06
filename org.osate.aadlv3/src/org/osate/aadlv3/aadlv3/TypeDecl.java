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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.TypeDecl#getOwnedPropertyAssociations <em>Owned Property Associations</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.TypeDecl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getTypeDecl()
 * @model
 * @generated
 */
public interface TypeDecl extends ClassifierOrType, PackageElement {
	/**
	 * Returns the value of the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.PropertyAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Property Associations</em>' containment reference list.
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getTypeDecl_OwnedPropertyAssociations()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyAssociation> getOwnedPropertyAssociations();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(EObject)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getTypeDecl_Type()
	 * @model containment="true"
	 * @generated
	 */
	EObject getType();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.TypeDecl#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EObject value);

} // TypeDecl
