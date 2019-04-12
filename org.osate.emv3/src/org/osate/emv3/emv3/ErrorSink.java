/**
 * Copyright Text	Copyright 2018 Carnegie Mellon University. All Rights Reserved....
 */
package org.osate.emv3.emv3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Sink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.emv3.emv3.ErrorSink#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorSink#isAllIncoming <em>All Incoming</em>}</li>
 * </ul>
 *
 * @see org.osate.emv3.emv3.Emv3Package#getErrorSink()
 * @model
 * @generated
 */
public interface ErrorSink extends ErrorFlow {
	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference.
	 * @see #setIncoming(ErrorPropagation)
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorSink_Incoming()
	 * @model
	 * @generated
	 */
	ErrorPropagation getIncoming();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.ErrorSink#getIncoming <em>Incoming</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming</em>' reference.
	 * @see #getIncoming()
	 * @generated
	 */
	void setIncoming(ErrorPropagation value);

	/**
	 * Returns the value of the '<em><b>All Incoming</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Incoming</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Incoming</em>' attribute.
	 * @see #setAllIncoming(boolean)
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorSink_AllIncoming()
	 * @model
	 * @generated
	 */
	boolean isAllIncoming();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.ErrorSink#isAllIncoming <em>All Incoming</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Incoming</em>' attribute.
	 * @see #isAllIncoming()
	 * @generated
	 */
	void setAllIncoming(boolean value);

} // ErrorSink
