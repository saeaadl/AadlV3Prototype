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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.av3instance.av3instance.InstanceObject#getName <em>Name</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.InstanceObject#getPropertyAssociations <em>Property Associations</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.InstanceObject#getIncomingAssociations <em>Incoming Associations</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.InstanceObject#getOutgoingAssociations <em>Outgoing Associations</em>}</li>
 * </ul>
 *
 * @see org.osate.av3instance.av3instance.Av3instancePackage#getInstanceObject()
 * @model abstract="true"
 * @generated
 */
public interface InstanceObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getInstanceObject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.osate.av3instance.av3instance.InstanceObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Property Associations</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.av3instance.av3instance.PropertyAssociationInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Associations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Associations</em>' containment reference list.
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getInstanceObject_PropertyAssociations()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyAssociationInstance> getPropertyAssociations();

	/**
	 * Returns the value of the '<em><b>Incoming Associations</b></em>' reference list.
	 * The list contents are of type {@link org.osate.av3instance.av3instance.AssociationInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Associations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Associations</em>' reference list.
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getInstanceObject_IncomingAssociations()
	 * @model resolveProxies="false" transient="true" ordered="false"
	 * @generated
	 */
	EList<AssociationInstance> getIncomingAssociations();

	/**
	 * Returns the value of the '<em><b>Outgoing Associations</b></em>' reference list.
	 * The list contents are of type {@link org.osate.av3instance.av3instance.AssociationInstance}.
	 * It is bidirectional and its opposite is '{@link org.osate.av3instance.av3instance.AssociationInstance#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Associations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Associations</em>' reference list.
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getInstanceObject_OutgoingAssociations()
	 * @see org.osate.av3instance.av3instance.AssociationInstance#getSource
	 * @model opposite="source" resolveProxies="false" transient="true" ordered="false"
	 * @generated
	 */
	EList<AssociationInstance> getOutgoingAssociations();

} // InstanceObject
