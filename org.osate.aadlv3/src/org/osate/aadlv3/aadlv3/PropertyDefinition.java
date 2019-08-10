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
 * A representation of the model object '<em><b>Property Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.PropertyDefinition#getType <em>Type</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.PropertyDefinition#getComponentCategories <em>Component Categories</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.PropertyDefinition#getFeatureCategories <em>Feature Categories</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.PropertyDefinition#getAssociationTypes <em>Association Types</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.PropertyDefinition#isForAll <em>For All</em>}</li>
 * </ul>
 *
 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getPropertyDefinition()
 * @model
 * @generated
 */
public interface PropertyDefinition extends PackageElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Type)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getPropertyDefinition_Type()
	 * @model containment="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.PropertyDefinition#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Component Categories</b></em>' attribute list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.ComponentCategory}.
	 * The literals are from the enumeration {@link org.osate.aadlv3.aadlv3.ComponentCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Categories</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Categories</em>' attribute list.
	 * @see org.osate.aadlv3.aadlv3.ComponentCategory
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getPropertyDefinition_ComponentCategories()
	 * @model
	 * @generated
	 */
	EList<ComponentCategory> getComponentCategories();

	/**
	 * Returns the value of the '<em><b>Feature Categories</b></em>' attribute list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.FeatureCategory}.
	 * The literals are from the enumeration {@link org.osate.aadlv3.aadlv3.FeatureCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Categories</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Categories</em>' attribute list.
	 * @see org.osate.aadlv3.aadlv3.FeatureCategory
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getPropertyDefinition_FeatureCategories()
	 * @model
	 * @generated
	 */
	EList<FeatureCategory> getFeatureCategories();

	/**
	 * Returns the value of the '<em><b>Association Types</b></em>' attribute list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.AssociationType}.
	 * The literals are from the enumeration {@link org.osate.aadlv3.aadlv3.AssociationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Types</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Types</em>' attribute list.
	 * @see org.osate.aadlv3.aadlv3.AssociationType
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getPropertyDefinition_AssociationTypes()
	 * @model
	 * @generated
	 */
	EList<AssociationType> getAssociationTypes();

	/**
	 * Returns the value of the '<em><b>For All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For All</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For All</em>' attribute.
	 * @see #setForAll(boolean)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getPropertyDefinition_ForAll()
	 * @model
	 * @generated
	 */
	boolean isForAll();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.PropertyDefinition#isForAll <em>For All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For All</em>' attribute.
	 * @see #isForAll()
	 * @generated
	 */
	void setForAll(boolean value);

} // PropertyDefinition
