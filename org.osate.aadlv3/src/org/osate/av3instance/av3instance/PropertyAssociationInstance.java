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

import org.osate.aadlv3.aadlv3.Property;
import org.osate.aadlv3.aadlv3.PropertyAssociationType;
import org.osate.aadlv3.aadlv3.PropertyValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Association Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.av3instance.av3instance.PropertyAssociationInstance#getProperty <em>Property</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.PropertyAssociationInstance#getValue <em>Value</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.PropertyAssociationInstance#getPropertyAssociationType <em>Property Association Type</em>}</li>
 * </ul>
 *
 * @see org.osate.av3instance.av3instance.Av3instancePackage#getPropertyAssociationInstance()
 * @model
 * @generated
 */
public interface PropertyAssociationInstance extends InstanceObject {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(Property)
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getPropertyAssociationInstance_Property()
	 * @model
	 * @generated
	 */
	Property getProperty();

	/**
	 * Sets the value of the '{@link org.osate.av3instance.av3instance.PropertyAssociationInstance#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Property value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(PropertyValue)
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getPropertyAssociationInstance_Value()
	 * @model containment="true"
	 * @generated
	 */
	PropertyValue getValue();

	/**
	 * Sets the value of the '{@link org.osate.av3instance.av3instance.PropertyAssociationInstance#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(PropertyValue value);

	/**
	 * Returns the value of the '<em><b>Property Association Type</b></em>' attribute.
	 * The default value is <code>"FinalValue"</code>.
	 * The literals are from the enumeration {@link org.osate.aadlv3.aadlv3.PropertyAssociationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Association Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Association Type</em>' attribute.
	 * @see org.osate.aadlv3.aadlv3.PropertyAssociationType
	 * @see #setPropertyAssociationType(PropertyAssociationType)
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getPropertyAssociationInstance_PropertyAssociationType()
	 * @model default="FinalValue"
	 * @generated
	 */
	PropertyAssociationType getPropertyAssociationType();

	/**
	 * Sets the value of the '{@link org.osate.av3instance.av3instance.PropertyAssociationInstance#getPropertyAssociationType <em>Property Association Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Association Type</em>' attribute.
	 * @see org.osate.aadlv3.aadlv3.PropertyAssociationType
	 * @see #getPropertyAssociationType()
	 * @generated
	 */
	void setPropertyAssociationType(PropertyAssociationType value);

} // PropertyAssociationInstance
