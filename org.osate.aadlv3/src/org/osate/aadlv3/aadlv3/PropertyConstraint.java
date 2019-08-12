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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.PropertyConstraint#getConstrainedProperty <em>Constrained Property</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.PropertyConstraint#getConstraintExpression <em>Constraint Expression</em>}</li>
 * </ul>
 *
 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getPropertyConstraint()
 * @model
 * @generated
 */
public interface PropertyConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Constrained Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrained Property</em>' reference.
	 * @see #setConstrainedProperty(PropertyDefinition)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getPropertyConstraint_ConstrainedProperty()
	 * @model
	 * @generated
	 */
	PropertyDefinition getConstrainedProperty();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.PropertyConstraint#getConstrainedProperty <em>Constrained Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constrained Property</em>' reference.
	 * @see #getConstrainedProperty()
	 * @generated
	 */
	void setConstrainedProperty(PropertyDefinition value);

	/**
	 * Returns the value of the '<em><b>Constraint Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Expression</em>' containment reference.
	 * @see #setConstraintExpression(MultiLiteralConstraint)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getPropertyConstraint_ConstraintExpression()
	 * @model containment="true"
	 * @generated
	 */
	MultiLiteralConstraint getConstraintExpression();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.PropertyConstraint#getConstraintExpression <em>Constraint Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Expression</em>' containment reference.
	 * @see #getConstraintExpression()
	 * @generated
	 */
	void setConstraintExpression(MultiLiteralConstraint value);

} // PropertyConstraint
