/**
 * Copyright Text	Copyright 2018 Carnegie Mellon University. All Rights Reserved....
 */
package org.osate.emv3.emv3;

import org.osate.aadlv3.aadlv3.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.emv3.emv3.ErrorSource#getSourceModelElement <em>Source Model Element</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorSource#isAll <em>All</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorSource#getFailureModeReference <em>Failure Mode Reference</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorSource#getFailureModeType <em>Failure Mode Type</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorSource#getFailureModeDescription <em>Failure Mode Description</em>}</li>
 * </ul>
 *
 * @see org.osate.emv3.emv3.Emv3Package#getErrorSource()
 * @model
 * @generated
 */
public interface ErrorSource extends ErrorFlow {
	/**
	 * Returns the value of the '<em><b>Source Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Model Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Model Element</em>' reference.
	 * @see #setSourceModelElement(NamedElement)
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorSource_SourceModelElement()
	 * @model
	 * @generated
	 */
	NamedElement getSourceModelElement();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.ErrorSource#getSourceModelElement <em>Source Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Model Element</em>' reference.
	 * @see #getSourceModelElement()
	 * @generated
	 */
	void setSourceModelElement(NamedElement value);

	/**
	 * Returns the value of the '<em><b>All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All</em>' attribute.
	 * @see #setAll(boolean)
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorSource_All()
	 * @model
	 * @generated
	 */
	boolean isAll();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.ErrorSource#isAll <em>All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All</em>' attribute.
	 * @see #isAll()
	 * @generated
	 */
	void setAll(boolean value);

	/**
	 * Returns the value of the '<em><b>Failure Mode Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure Mode Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Mode Reference</em>' reference.
	 * @see #setFailureModeReference(ErrorBehaviorState)
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorSource_FailureModeReference()
	 * @model
	 * @generated
	 */
	ErrorBehaviorState getFailureModeReference();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.ErrorSource#getFailureModeReference <em>Failure Mode Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Mode Reference</em>' reference.
	 * @see #getFailureModeReference()
	 * @generated
	 */
	void setFailureModeReference(ErrorBehaviorState value);

	/**
	 * Returns the value of the '<em><b>Failure Mode Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure Mode Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Mode Type</em>' containment reference.
	 * @see #setFailureModeType(TypeSet)
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorSource_FailureModeType()
	 * @model containment="true"
	 * @generated
	 */
	TypeSet getFailureModeType();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.ErrorSource#getFailureModeType <em>Failure Mode Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Mode Type</em>' containment reference.
	 * @see #getFailureModeType()
	 * @generated
	 */
	void setFailureModeType(TypeSet value);

	/**
	 * Returns the value of the '<em><b>Failure Mode Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure Mode Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Mode Description</em>' attribute.
	 * @see #setFailureModeDescription(String)
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorSource_FailureModeDescription()
	 * @model
	 * @generated
	 */
	String getFailureModeDescription();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.ErrorSource#getFailureModeDescription <em>Failure Mode Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Mode Description</em>' attribute.
	 * @see #getFailureModeDescription()
	 * @generated
	 */
	void setFailureModeDescription(String value);

} // ErrorSource
