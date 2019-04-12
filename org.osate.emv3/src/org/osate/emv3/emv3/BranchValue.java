/**
 * Copyright Text	Copyright 2018 Carnegie Mellon University. All Rights Reserved....
 */
package org.osate.emv3.emv3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.emv3.emv3.BranchValue#getRealvalue <em>Realvalue</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.BranchValue#isOthers <em>Others</em>}</li>
 * </ul>
 *
 * @see org.osate.emv3.emv3.Emv3Package#getBranchValue()
 * @model
 * @generated
 */
public interface BranchValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Realvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realvalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realvalue</em>' attribute.
	 * @see #setRealvalue(String)
	 * @see org.osate.emv3.emv3.Emv3Package#getBranchValue_Realvalue()
	 * @model
	 * @generated
	 */
	String getRealvalue();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.BranchValue#getRealvalue <em>Realvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realvalue</em>' attribute.
	 * @see #getRealvalue()
	 * @generated
	 */
	void setRealvalue(String value);

	/**
	 * Returns the value of the '<em><b>Others</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Others</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Others</em>' attribute.
	 * @see #setOthers(boolean)
	 * @see org.osate.emv3.emv3.Emv3Package#getBranchValue_Others()
	 * @model
	 * @generated
	 */
	boolean isOthers();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.BranchValue#isOthers <em>Others</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Others</em>' attribute.
	 * @see #isOthers()
	 * @generated
	 */
	void setOthers(boolean value);

} // BranchValue
