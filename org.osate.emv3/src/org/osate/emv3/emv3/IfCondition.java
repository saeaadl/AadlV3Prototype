/**
 * Copyright Text	Copyright 2018 Carnegie Mellon University. All Rights Reserved....
 */
package org.osate.emv3.emv3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.emv3.emv3.IfCondition#getDescription <em>Description</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.IfCondition#getResoluteFunction <em>Resolute Function</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.IfCondition#getJavaMethod <em>Java Method</em>}</li>
 * </ul>
 *
 * @see org.osate.emv3.emv3.Emv3Package#getIfCondition()
 * @model
 * @generated
 */
public interface IfCondition extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.osate.emv3.emv3.Emv3Package#getIfCondition_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.IfCondition#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Resolute Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolute Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolute Function</em>' reference.
	 * @see #setResoluteFunction(EObject)
	 * @see org.osate.emv3.emv3.Emv3Package#getIfCondition_ResoluteFunction()
	 * @model
	 * @generated
	 */
	EObject getResoluteFunction();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.IfCondition#getResoluteFunction <em>Resolute Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolute Function</em>' reference.
	 * @see #getResoluteFunction()
	 * @generated
	 */
	void setResoluteFunction(EObject value);

	/**
	 * Returns the value of the '<em><b>Java Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Method</em>' attribute.
	 * @see #setJavaMethod(String)
	 * @see org.osate.emv3.emv3.Emv3Package#getIfCondition_JavaMethod()
	 * @model
	 * @generated
	 */
	String getJavaMethod();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.IfCondition#getJavaMethod <em>Java Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Method</em>' attribute.
	 * @see #getJavaMethod()
	 * @generated
	 */
	void setJavaMethod(String value);

} // IfCondition
