/**
 * Copyright Text	Copyright 2018 Carnegie Mellon University. All Rights Reserved....
 */
package org.osate.emv3.emv3;

import org.osate.aadlv3.aadlv3.Feature;
import org.osate.aadlv3.aadlv3.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Detection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.emv3.emv3.ErrorDetection#getState <em>State</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorDetection#getTypeTokenConstraint <em>Type Token Constraint</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorDetection#isAllStates <em>All States</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorDetection#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorDetection#getDetectionReportingPort <em>Detection Reporting Port</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorDetection#getErrorCode <em>Error Code</em>}</li>
 * </ul>
 *
 * @see org.osate.emv3.emv3.Emv3Package#getErrorDetection()
 * @model
 * @generated
 */
public interface ErrorDetection extends NamedElement {
	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(ErrorBehaviorState)
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorDetection_State()
	 * @model
	 * @generated
	 */
	ErrorBehaviorState getState();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.ErrorDetection#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(ErrorBehaviorState value);

	/**
	 * Returns the value of the '<em><b>Type Token Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Token Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Token Constraint</em>' containment reference.
	 * @see #setTypeTokenConstraint(TypeSet)
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorDetection_TypeTokenConstraint()
	 * @model containment="true"
	 * @generated
	 */
	TypeSet getTypeTokenConstraint();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.ErrorDetection#getTypeTokenConstraint <em>Type Token Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Token Constraint</em>' containment reference.
	 * @see #getTypeTokenConstraint()
	 * @generated
	 */
	void setTypeTokenConstraint(TypeSet value);

	/**
	 * Returns the value of the '<em><b>All States</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All States</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All States</em>' attribute.
	 * @see #setAllStates(boolean)
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorDetection_AllStates()
	 * @model
	 * @generated
	 */
	boolean isAllStates();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.ErrorDetection#isAllStates <em>All States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All States</em>' attribute.
	 * @see #isAllStates()
	 * @generated
	 */
	void setAllStates(boolean value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(ConditionExpression)
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorDetection_Condition()
	 * @model containment="true"
	 * @generated
	 */
	ConditionExpression getCondition();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.ErrorDetection#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(ConditionExpression value);

	/**
	 * Returns the value of the '<em><b>Detection Reporting Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detection Reporting Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detection Reporting Port</em>' reference.
	 * @see #setDetectionReportingPort(Feature)
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorDetection_DetectionReportingPort()
	 * @model
	 * @generated
	 */
	Feature getDetectionReportingPort();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.ErrorDetection#getDetectionReportingPort <em>Detection Reporting Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detection Reporting Port</em>' reference.
	 * @see #getDetectionReportingPort()
	 * @generated
	 */
	void setDetectionReportingPort(Feature value);

	/**
	 * Returns the value of the '<em><b>Error Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Code</em>' containment reference.
	 * @see #setErrorCode(ErrorCodeValue)
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorDetection_ErrorCode()
	 * @model containment="true"
	 * @generated
	 */
	ErrorCodeValue getErrorCode();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.ErrorDetection#getErrorCode <em>Error Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Code</em>' containment reference.
	 * @see #getErrorCode()
	 * @generated
	 */
	void setErrorCode(ErrorCodeValue value);

} // ErrorDetection
