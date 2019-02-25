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

import org.osate.aadlv3.aadlv3.Association;
import org.osate.aadlv3.aadlv3.AssociationType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.av3instance.av3instance.AssociationInstance#getAssociationType <em>Association Type</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.AssociationInstance#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.AssociationInstance#getSource <em>Source</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.AssociationInstance#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.AssociationInstance#getSourceDelegates <em>Source Delegates</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.AssociationInstance#getDestinationDelegates <em>Destination Delegates</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.AssociationInstance#isExternal <em>External</em>}</li>
 * </ul>
 *
 * @see org.osate.av3instance.av3instance.Av3instancePackage#getAssociationInstance()
 * @model
 * @generated
 */
public interface AssociationInstance extends InstanceObject {
	/**
	 * Returns the value of the '<em><b>Association Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.osate.aadlv3.aadlv3.AssociationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Type</em>' attribute.
	 * @see org.osate.aadlv3.aadlv3.AssociationType
	 * @see #setAssociationType(AssociationType)
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getAssociationInstance_AssociationType()
	 * @model
	 * @generated
	 */
	AssociationType getAssociationType();

	/**
	 * Sets the value of the '{@link org.osate.av3instance.av3instance.AssociationInstance#getAssociationType <em>Association Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association Type</em>' attribute.
	 * @see org.osate.aadlv3.aadlv3.AssociationType
	 * @see #getAssociationType()
	 * @generated
	 */
	void setAssociationType(AssociationType value);

	/**
	 * Returns the value of the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' reference.
	 * @see #setAssociation(Association)
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getAssociationInstance_Association()
	 * @model
	 * @generated
	 */
	Association getAssociation();

	/**
	 * Sets the value of the '{@link org.osate.av3instance.av3instance.AssociationInstance#getAssociation <em>Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association</em>' reference.
	 * @see #getAssociation()
	 * @generated
	 */
	void setAssociation(Association value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.osate.av3instance.av3instance.InstanceObject#getOutgoingAssociations <em>Outgoing Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(InstanceObject)
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getAssociationInstance_Source()
	 * @see org.osate.av3instance.av3instance.InstanceObject#getOutgoingAssociations
	 * @model opposite="outgoingAssociations" resolveProxies="false" ordered="false"
	 * @generated
	 */
	InstanceObject getSource();

	/**
	 * Sets the value of the '{@link org.osate.av3instance.av3instance.AssociationInstance#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(InstanceObject value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(InstanceObject)
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getAssociationInstance_Destination()
	 * @model resolveProxies="false" ordered="false"
	 * @generated
	 */
	InstanceObject getDestination();

	/**
	 * Sets the value of the '{@link org.osate.av3instance.av3instance.AssociationInstance#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(InstanceObject value);

	/**
	 * Returns the value of the '<em><b>Source Delegates</b></em>' reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.Association}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Delegates</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Delegates</em>' reference list.
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getAssociationInstance_SourceDelegates()
	 * @model
	 * @generated
	 */
	EList<Association> getSourceDelegates();

	/**
	 * Returns the value of the '<em><b>Destination Delegates</b></em>' reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.Association}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Delegates</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Delegates</em>' reference list.
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getAssociationInstance_DestinationDelegates()
	 * @model
	 * @generated
	 */
	EList<Association> getDestinationDelegates();

	/**
	 * Returns the value of the '<em><b>External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External</em>' attribute.
	 * @see #setExternal(boolean)
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getAssociationInstance_External()
	 * @model
	 * @generated
	 */
	boolean isExternal();

	/**
	 * Sets the value of the '{@link org.osate.av3instance.av3instance.AssociationInstance#isExternal <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External</em>' attribute.
	 * @see #isExternal()
	 * @generated
	 */
	void setExternal(boolean value);

} // AssociationInstance
