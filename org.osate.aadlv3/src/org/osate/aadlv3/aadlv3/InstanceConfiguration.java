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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.InstanceConfiguration#getPropertyConstraint <em>Property Constraint</em>}</li>
 * </ul>
 *
 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getInstanceConfiguration()
 * @model
 * @generated
 */
public interface InstanceConfiguration extends Subcomponent {
	/**
	 * Returns the value of the '<em><b>Property Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Constraint</em>' containment reference.
	 * @see #setPropertyConstraint(PropertyConstraint)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getInstanceConfiguration_PropertyConstraint()
	 * @model containment="true"
	 * @generated
	 */
	PropertyConstraint getPropertyConstraint();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.InstanceConfiguration#getPropertyConstraint <em>Property Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Constraint</em>' containment reference.
	 * @see #getPropertyConstraint()
	 * @generated
	 */
	void setPropertyConstraint(PropertyConstraint value);

} // InstanceConfiguration
