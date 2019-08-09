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
 * A representation of the model object '<em><b>Directional Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.DirectionalLiteral#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.DirectionalLiteral#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getDirectionalLiteral()
 * @model
 * @generated
 */
public interface DirectionalLiteral extends Literal {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.osate.aadlv3.aadlv3.FeatureDirection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.osate.aadlv3.aadlv3.FeatureDirection
	 * @see #setDirection(FeatureDirection)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getDirectionalLiteral_Direction()
	 * @model
	 * @generated
	 */
	FeatureDirection getDirection();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.DirectionalLiteral#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.osate.aadlv3.aadlv3.FeatureDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(FeatureDirection value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Literal)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getDirectionalLiteral_Value()
	 * @model containment="true"
	 * @generated
	 */
	Literal getValue();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.DirectionalLiteral#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Literal value);

} // DirectionalLiteral
