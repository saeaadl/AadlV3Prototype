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
 * A representation of the model object '<em><b>Component Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.ComponentInterface#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.ComponentInterface#getImplementations <em>Implementations</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.ComponentInterface#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.ComponentInterface#getFlows <em>Flows</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.ComponentInterface#getUseProperties <em>Use Properties</em>}</li>
 * </ul>
 *
 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getComponentInterface()
 * @model
 * @generated
 */
public interface ComponentInterface extends ComponentClassifier {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getComponentInterface_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Implementations</b></em>' reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.ComponentImplementation}.
	 * It is bidirectional and its opposite is '{@link org.osate.aadlv3.aadlv3.ComponentImplementation#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementations</em>' reference list.
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getComponentInterface_Implementations()
	 * @see org.osate.aadlv3.aadlv3.ComponentImplementation#getInterface
	 * @model opposite="interface" transient="true" ordered="false"
	 * @generated
	 */
	EList<ComponentImplementation> getImplementations();

	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.ComponentConfiguration}.
	 * It is bidirectional and its opposite is '{@link org.osate.aadlv3.aadlv3.ComponentConfiguration#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configurations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' reference list.
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getComponentInterface_Configurations()
	 * @see org.osate.aadlv3.aadlv3.ComponentConfiguration#getInterface
	 * @model opposite="interface" resolveProxies="false" transient="true" ordered="false"
	 * @generated
	 */
	EList<ComponentConfiguration> getConfigurations();

	/**
	 * Returns the value of the '<em><b>Flows</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.Association}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flows</em>' containment reference list.
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getComponentInterface_Flows()
	 * @model containment="true"
	 * @generated
	 */
	EList<Association> getFlows();

	/**
	 * Returns the value of the '<em><b>Use Properties</b></em>' reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.PropertySet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Properties</em>' reference list.
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getComponentInterface_UseProperties()
	 * @model
	 * @generated
	 */
	EList<PropertySet> getUseProperties();

} // ComponentInterface
