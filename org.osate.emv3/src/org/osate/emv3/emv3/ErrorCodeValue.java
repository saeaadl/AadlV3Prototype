/**
 * Copyright Text	Copyright 2018 Carnegie Mellon University. All Rights Reserved....
 */
package org.osate.emv3.emv3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Code Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.emv3.emv3.ErrorCodeValue#getIntValue <em>Int Value</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorCodeValue#getEnumLiteral <em>Enum Literal</em>}</li>
 * </ul>
 *
 * @see org.osate.emv3.emv3.Emv3Package#getErrorCodeValue()
 * @model
 * @generated
 */
public interface ErrorCodeValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Int Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Value</em>' attribute.
	 * @see #setIntValue(String)
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorCodeValue_IntValue()
	 * @model
	 * @generated
	 */
	String getIntValue();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.ErrorCodeValue#getIntValue <em>Int Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int Value</em>' attribute.
	 * @see #getIntValue()
	 * @generated
	 */
	void setIntValue(String value);

	/**
	 * Returns the value of the '<em><b>Enum Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Literal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Literal</em>' attribute.
	 * @see #setEnumLiteral(String)
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorCodeValue_EnumLiteral()
	 * @model
	 * @generated
	 */
	String getEnumLiteral();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.ErrorCodeValue#getEnumLiteral <em>Enum Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Literal</em>' attribute.
	 * @see #getEnumLiteral()
	 * @generated
	 */
	void setEnumLiteral(String value);

} // ErrorCodeValue
