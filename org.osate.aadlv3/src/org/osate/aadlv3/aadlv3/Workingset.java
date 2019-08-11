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
 * A representation of the model object '<em><b>Workingset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.Workingset#getInstanceRoots <em>Instance Roots</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.Workingset#getUseProperties <em>Use Properties</em>}</li>
 * </ul>
 *
 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getWorkingset()
 * @model
 * @generated
 */
public interface Workingset extends PackageElement {
	/**
	 * Returns the value of the '<em><b>Instance Roots</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.InstanceConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Roots</em>' containment reference list.
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getWorkingset_InstanceRoots()
	 * @model containment="true"
	 * @generated
	 */
	EList<InstanceConfiguration> getInstanceRoots();

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
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getWorkingset_UseProperties()
	 * @model
	 * @generated
	 */
	EList<PropertySet> getUseProperties();

} // Workingset
