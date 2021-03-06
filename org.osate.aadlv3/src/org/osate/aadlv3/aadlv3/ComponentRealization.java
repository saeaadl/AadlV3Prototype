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
 * A representation of the model object '<em><b>Component Realization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.ComponentRealization#getCachedInterfaceReference <em>Cached Interface Reference</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.ComponentRealization#getClassifierAssignments <em>Classifier Assignments</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.ComponentRealization#getFlowAssignments <em>Flow Assignments</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.ComponentRealization#getConnectionAssignments <em>Connection Assignments</em>}</li>
 * </ul>
 *
 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getComponentRealization()
 * @model abstract="true"
 * @generated
 */
public interface ComponentRealization extends Classifier {

	/**
	 * Returns the value of the '<em><b>Cached Interface Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cached Interface Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cached Interface Reference</em>' reference.
	 * @see #setCachedInterfaceReference(ComponentInterface)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getComponentRealization_CachedInterfaceReference()
	 * @model resolveProxies="false" transient="true" ordered="false"
	 * @generated
	 */
	ComponentInterface getCachedInterfaceReference();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.ComponentRealization#getCachedInterfaceReference <em>Cached Interface Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cached Interface Reference</em>' reference.
	 * @see #getCachedInterfaceReference()
	 * @generated
	 */
	void setCachedInterfaceReference(ComponentInterface value);

	/**
	 * Returns the value of the '<em><b>Classifier Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.ClassifierAssignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier Assignments</em>' containment reference list.
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getComponentRealization_ClassifierAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassifierAssignment> getClassifierAssignments();

	/**
	 * Returns the value of the '<em><b>Flow Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.PathSequence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Assignments</em>' containment reference list.
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getComponentRealization_FlowAssignments()
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
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getComponentRealization_ConnectionAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<PathSequence> getConnectionAssignments();
} // ComponentRealization
