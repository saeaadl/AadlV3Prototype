/**
 * Copyright Text	Copyright 2018 Carnegie Mellon University. All Rights Reserved....
 */
package org.osate.emv3.emv3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadlv3.aadlv3.Mode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error State To Mode Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.emv3.emv3.ErrorStateToModeMapping#getErrorState <em>Error State</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorStateToModeMapping#getTypeToken <em>Type Token</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorStateToModeMapping#getMappedModes <em>Mapped Modes</em>}</li>
 * </ul>
 *
 * @see org.osate.emv3.emv3.Emv3Package#getErrorStateToModeMapping()
 * @model
 * @generated
 */
public interface ErrorStateToModeMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Error State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error State</em>' reference.
	 * @see #setErrorState(ErrorBehaviorState)
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorStateToModeMapping_ErrorState()
	 * @model
	 * @generated
	 */
	ErrorBehaviorState getErrorState();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.ErrorStateToModeMapping#getErrorState <em>Error State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error State</em>' reference.
	 * @see #getErrorState()
	 * @generated
	 */
	void setErrorState(ErrorBehaviorState value);

	/**
	 * Returns the value of the '<em><b>Type Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Token</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Token</em>' containment reference.
	 * @see #setTypeToken(TypeSet)
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorStateToModeMapping_TypeToken()
	 * @model containment="true"
	 * @generated
	 */
	TypeSet getTypeToken();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.ErrorStateToModeMapping#getTypeToken <em>Type Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Token</em>' containment reference.
	 * @see #getTypeToken()
	 * @generated
	 */
	void setTypeToken(TypeSet value);

	/**
	 * Returns the value of the '<em><b>Mapped Modes</b></em>' reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.Mode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapped Modes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapped Modes</em>' reference list.
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorStateToModeMapping_MappedModes()
	 * @model
	 * @generated
	 */
	EList<Mode> getMappedModes();

} // ErrorStateToModeMapping
