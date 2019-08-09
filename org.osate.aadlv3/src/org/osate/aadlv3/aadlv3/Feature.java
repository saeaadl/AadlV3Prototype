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
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.Feature#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.Feature#getCategory <em>Category</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.Feature#getTypeReference <em>Type Reference</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.Feature#getPropagation <em>Propagation</em>}</li>
 * </ul>
 *
 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getFeature()
 * @model
 * @generated
 */
public interface Feature extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.osate.aadlv3.aadlv3.FeatureDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.osate.aadlv3.aadlv3.FeatureDirection
	 * @see #setDirection(FeatureDirection)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getFeature_Direction()
	 * @model
	 * @generated
	 */
	FeatureDirection getDirection();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.Feature#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.osate.aadlv3.aadlv3.FeatureDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(FeatureDirection value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link org.osate.aadlv3.aadlv3.FeatureCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see org.osate.aadlv3.aadlv3.FeatureCategory
	 * @see #setCategory(FeatureCategory)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getFeature_Category()
	 * @model
	 * @generated
	 */
	FeatureCategory getCategory();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.Feature#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see org.osate.aadlv3.aadlv3.FeatureCategory
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(FeatureCategory value);

	/**
	 * Returns the value of the '<em><b>Type Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Reference</em>' containment reference.
	 * @see #setTypeReference(TypeReference)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getFeature_TypeReference()
	 * @model containment="true"
	 * @generated
	 */
	TypeReference getTypeReference();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.Feature#getTypeReference <em>Type Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Reference</em>' containment reference.
	 * @see #getTypeReference()
	 * @generated
	 */
	void setTypeReference(TypeReference value);

	/**
	 * Returns the value of the '<em><b>Propagation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propagation</em>' containment reference.
	 * @see #setPropagation(DirectionalLiteral)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getFeature_Propagation()
	 * @model containment="true"
	 * @generated
	 */
	DirectionalLiteral getPropagation();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.Feature#getPropagation <em>Propagation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Propagation</em>' containment reference.
	 * @see #getPropagation()
	 * @generated
	 */
	void setPropagation(DirectionalLiteral value);

} // Feature
