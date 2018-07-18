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
 * A representation of the model object '<em><b>Component Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.ComponentImplementation#getComponents <em>Components</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.ComponentImplementation#getConnections <em>Connections</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.ComponentImplementation#getAssignments <em>Assignments</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.ComponentImplementation#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.ComponentImplementation#getFlowAssignments <em>Flow Assignments</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.ComponentImplementation#getPaths <em>Paths</em>}</li>
 * </ul>
 *
 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getComponentImplementation()
 * @model
 * @generated
 */
public interface ComponentImplementation extends ComponentClassifier {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getComponentImplementation_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.Association}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getComponentImplementation_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Association> getConnections();

	/**
	 * Returns the value of the '<em><b>Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.ConfigurationAssignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignments</em>' containment reference list.
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getComponentImplementation_Assignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigurationAssignment> getAssignments();

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.osate.aadlv3.aadlv3.ComponentInterface#getImplementations <em>Implementations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' reference.
	 * @see #setInterface(ComponentInterface)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getComponentImplementation_Interface()
	 * @see org.osate.aadlv3.aadlv3.ComponentInterface#getImplementations
	 * @model opposite="implementations" resolveProxies="false" ordered="false"
	 * @generated
	 */
	ComponentInterface getInterface();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.ComponentImplementation#getInterface <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(ComponentInterface value);

	/**
	 * Returns the value of the '<em><b>Flow Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.PathSequence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Assignments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Assignments</em>' containment reference list.
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getComponentImplementation_FlowAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<PathSequence> getFlowAssignments();

	/**
	 * Returns the value of the '<em><b>Paths</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.PathSequence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paths</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paths</em>' containment reference list.
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getComponentImplementation_Paths()
	 * @model containment="true"
	 * @generated
	 */
	EList<PathSequence> getPaths();

} // ComponentImplementation
