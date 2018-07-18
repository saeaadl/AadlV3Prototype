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
 * A representation of the model object '<em><b>Component Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.ComponentConfiguration#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.ComponentConfiguration#getAssignments <em>Assignments</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.ComponentConfiguration#isParameterized <em>Parameterized</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.ComponentConfiguration#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getComponentConfiguration()
 * @model
 * @generated
 */
public interface ComponentConfiguration extends ComponentClassifier {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.ConfigurationParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getComponentConfiguration_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigurationParameter> getParameters();

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
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getComponentConfiguration_Assignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigurationAssignment> getAssignments();

	/**
	 * Returns the value of the '<em><b>Parameterized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameterized</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameterized</em>' attribute.
	 * @see #setParameterized(boolean)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getComponentConfiguration_Parameterized()
	 * @model
	 * @generated
	 */
	boolean isParameterized();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.ComponentConfiguration#isParameterized <em>Parameterized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameterized</em>' attribute.
	 * @see #isParameterized()
	 * @generated
	 */
	void setParameterized(boolean value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.osate.aadlv3.aadlv3.ComponentInterface#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' reference.
	 * @see #setInterface(ComponentInterface)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getComponentConfiguration_Interface()
	 * @see org.osate.aadlv3.aadlv3.ComponentInterface#getConfigurations
	 * @model opposite="configurations" resolveProxies="false" ordered="false"
	 * @generated
	 */
	ComponentInterface getInterface();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.ComponentConfiguration#getInterface <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(ComponentInterface value);

} // ComponentConfiguration
