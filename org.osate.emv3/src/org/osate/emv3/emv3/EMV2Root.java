/**
 * Copyright Text	Copyright 2018 Carnegie Mellon University. All Rights Reserved....
 */
package org.osate.emv3.emv3;

import org.eclipse.emf.common.util.EList;

import org.osate.aadlv3.aadlv3.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMV2 Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.emv3.emv3.EMV2Root#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.EMV2Root#getSubclauses <em>Subclauses</em>}</li>
 * </ul>
 *
 * @see org.osate.emv3.emv3.Emv3Package#getEMV2Root()
 * @model
 * @generated
 */
public interface EMV2Root extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Library</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' containment reference.
	 * @see #setLibrary(ErrorModelLibrary)
	 * @see org.osate.emv3.emv3.Emv3Package#getEMV2Root_Library()
	 * @model containment="true"
	 * @generated
	 */
	ErrorModelLibrary getLibrary();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.EMV2Root#getLibrary <em>Library</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' containment reference.
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(ErrorModelLibrary value);

	/**
	 * Returns the value of the '<em><b>Subclauses</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.emv3.emv3.ErrorModelSubclause}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subclauses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subclauses</em>' containment reference list.
	 * @see org.osate.emv3.emv3.Emv3Package#getEMV2Root_Subclauses()
	 * @model containment="true"
	 * @generated
	 */
	EList<ErrorModelSubclause> getSubclauses();

} // EMV2Root
