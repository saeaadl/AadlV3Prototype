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
 * A representation of the model object '<em><b>Configuration Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.ConfigurationAssignment#getTarget <em>Target</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.ConfigurationAssignment#getConfigurationAssignments <em>Configuration Assignments</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.ConfigurationAssignment#getAssignedClassifiers <em>Assigned Classifiers</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.ConfigurationAssignment#getPropertyAssociations <em>Property Associations</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.ConfigurationAssignment#getBindings <em>Bindings</em>}</li>
 * </ul>
 *
 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getConfigurationAssignment()
 * @model
 * @generated
 */
public interface ConfigurationAssignment extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(ModelElementReference)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getConfigurationAssignment_Target()
	 * @model containment="true"
	 * @generated
	 */
	ModelElementReference getTarget();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.ConfigurationAssignment#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ModelElementReference value);

	/**
	 * Returns the value of the '<em><b>Configuration Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.ConfigurationAssignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Assignments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Assignments</em>' containment reference list.
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getConfigurationAssignment_ConfigurationAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigurationAssignment> getConfigurationAssignments();

	/**
	 * Returns the value of the '<em><b>Assigned Classifiers</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.TypeReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned Classifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Classifiers</em>' containment reference list.
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getConfigurationAssignment_AssignedClassifiers()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeReference> getAssignedClassifiers();

	/**
	 * Returns the value of the '<em><b>Property Associations</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.PropertyAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Associations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Associations</em>' containment reference list.
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getConfigurationAssignment_PropertyAssociations()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyAssociation> getPropertyAssociations();

	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.Association}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getConfigurationAssignment_Bindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Association> getBindings();

} // ConfigurationAssignment
