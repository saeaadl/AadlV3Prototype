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

import org.osate.aadlv3.aadlv3.Literal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constrained Instance Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.av3instance.av3instance.ConstrainedInstanceObject#getInstanceObject <em>Instance Object</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.ConstrainedInstanceObject#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.ConstrainedInstanceObject#isOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @see org.osate.av3instance.av3instance.Av3instancePackage#getConstrainedInstanceObject()
 * @model
 * @generated
 */
public interface ConstrainedInstanceObject extends InstanceObject, Literal {
	/**
	 * Returns the value of the '<em><b>Instance Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Object</em>' reference.
	 * @see #setInstanceObject(InstanceObject)
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getConstrainedInstanceObject_InstanceObject()
	 * @model
	 * @generated
	 */
	InstanceObject getInstanceObject();

	/**
	 * Sets the value of the '{@link org.osate.av3instance.av3instance.ConstrainedInstanceObject#getInstanceObject <em>Instance Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Object</em>' reference.
	 * @see #getInstanceObject()
	 * @generated
	 */
	void setInstanceObject(InstanceObject value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference.
	 * @see #setConstraint(Literal)
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getConstrainedInstanceObject_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	Literal getConstraint();

	/**
	 * Sets the value of the '{@link org.osate.av3instance.av3instance.ConstrainedInstanceObject#getConstraint <em>Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' containment reference.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(Literal value);

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' attribute.
	 * @see #setOutgoing(boolean)
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getConstrainedInstanceObject_Outgoing()
	 * @model
	 * @generated
	 */
	boolean isOutgoing();

	/**
	 * Sets the value of the '{@link org.osate.av3instance.av3instance.ConstrainedInstanceObject#isOutgoing <em>Outgoing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing</em>' attribute.
	 * @see #isOutgoing()
	 * @generated
	 */
	void setOutgoing(boolean value);

} // ConstrainedInstanceObject
