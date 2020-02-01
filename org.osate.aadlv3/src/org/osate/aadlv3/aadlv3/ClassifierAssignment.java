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
 * A representation of the model object '<em><b>Classifier Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.ClassifierAssignment#getTarget <em>Target</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.ClassifierAssignment#getClassifierAssignments <em>Classifier Assignments</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.ClassifierAssignment#getAssignedClassifiers <em>Assigned Classifiers</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.ClassifierAssignment#getOwnedPropertyAssociations <em>Owned Property Associations</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.ClassifierAssignment#getElements <em>Elements</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.ClassifierAssignment#getFlowAssignments <em>Flow Assignments</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.ClassifierAssignment#getConnectionAssignments <em>Connection Assignments</em>}</li>
 * </ul>
 *
 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getClassifierAssignment()
 * @model
 * @generated
 */
public interface ClassifierAssignment extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(NamedElementReference)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getClassifierAssignment_Target()
	 * @model containment="true"
	 * @generated
	 */
	NamedElementReference getTarget();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.ClassifierAssignment#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(NamedElementReference value);

	/**
	 * Returns the value of the '<em><b>Classifier Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.ClassifierAssignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier Assignments</em>' containment reference list.
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getClassifierAssignment_ClassifierAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassifierAssignment> getClassifierAssignments();

	/**
	 * Returns the value of the '<em><b>Assigned Classifiers</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.TypeReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Classifiers</em>' containment reference list.
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getClassifierAssignment_AssignedClassifiers()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeReference> getAssignedClassifiers();

	/**
	 * Returns the value of the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.PropertyAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Property Associations</em>' containment reference list.
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getClassifierAssignment_OwnedPropertyAssociations()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyAssociation> getOwnedPropertyAssociations();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getClassifierAssignment_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelElement> getElements();

	/**
	 * Returns the value of the '<em><b>Flow Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.PathSequence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Assignments</em>' containment reference list.
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getClassifierAssignment_FlowAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<PathSequence> getFlowAssignments();

	/**
	 * Returns the value of the '<em><b>Connection Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.PathSequence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Assignments</em>' containment reference list.
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getClassifierAssignment_ConnectionAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<PathSequence> getConnectionAssignments();

} // ClassifierAssignment
