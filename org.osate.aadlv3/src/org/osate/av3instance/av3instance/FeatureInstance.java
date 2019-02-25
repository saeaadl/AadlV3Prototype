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

import org.osate.aadlv3.aadlv3.Feature;
import org.osate.aadlv3.aadlv3.FeatureCategory;
import org.osate.aadlv3.aadlv3.FeatureDirection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.av3instance.av3instance.FeatureInstance#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.FeatureInstance#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.FeatureInstance#getCategory <em>Category</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.FeatureInstance#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see org.osate.av3instance.av3instance.Av3instancePackage#getFeatureInstance()
 * @model
 * @generated
 */
public interface FeatureInstance extends InstanceObject {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(Feature)
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getFeatureInstance_Feature()
	 * @model
	 * @generated
	 */
	Feature getFeature();

	/**
	 * Sets the value of the '{@link org.osate.av3instance.av3instance.FeatureInstance#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Feature value);

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
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getFeatureInstance_Direction()
	 * @model
	 * @generated
	 */
	FeatureDirection getDirection();

	/**
	 * Sets the value of the '{@link org.osate.av3instance.av3instance.FeatureInstance#getDirection <em>Direction</em>}' attribute.
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
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getFeatureInstance_Category()
	 * @model
	 * @generated
	 */
	FeatureCategory getCategory();

	/**
	 * Sets the value of the '{@link org.osate.av3instance.av3instance.FeatureInstance#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see org.osate.aadlv3.aadlv3.FeatureCategory
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(FeatureCategory value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.av3instance.av3instance.FeatureInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getFeatureInstance_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeatureInstance> getFeatures();

} // FeatureInstance
