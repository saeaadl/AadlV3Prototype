/**
 */
package org.osate.graph.TokenTrace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.graph.TokenTrace.TokenTrace#getName <em>Name</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.TokenTrace#getMessage <em>Message</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.TokenTrace#getTokenTraceType <em>Token Trace Type</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.TokenTrace#getRoot <em>Root</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.TokenTrace#getInstanceRoot <em>Instance Root</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.TokenTrace#getTokens <em>Tokens</em>}</li>
 * </ul>
 *
 * @see org.osate.graph.TokenTrace.TokenTracePackage#getTokenTrace()
 * @model
 * @generated
 */
public interface TokenTrace extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.osate.graph.TokenTrace.TokenTracePackage#getTokenTrace_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.osate.graph.TokenTrace.TokenTrace#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.osate.graph.TokenTrace.TokenTracePackage#getTokenTrace_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.osate.graph.TokenTrace.TokenTrace#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Token Trace Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.osate.graph.TokenTrace.TokenTraceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Trace Type</em>' attribute.
	 * @see org.osate.graph.TokenTrace.TokenTraceType
	 * @see #setTokenTraceType(TokenTraceType)
	 * @see org.osate.graph.TokenTrace.TokenTracePackage#getTokenTrace_TokenTraceType()
	 * @model
	 * @generated
	 */
	TokenTraceType getTokenTraceType();

	/**
	 * Sets the value of the '{@link org.osate.graph.TokenTrace.TokenTrace#getTokenTraceType <em>Token Trace Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token Trace Type</em>' attribute.
	 * @see org.osate.graph.TokenTrace.TokenTraceType
	 * @see #getTokenTraceType()
	 * @generated
	 */
	void setTokenTraceType(TokenTraceType value);

	/**
	 * Returns the value of the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' reference.
	 * @see #setRoot(Token)
	 * @see org.osate.graph.TokenTrace.TokenTracePackage#getTokenTrace_Root()
	 * @model
	 * @generated
	 */
	Token getRoot();

	/**
	 * Sets the value of the '{@link org.osate.graph.TokenTrace.TokenTrace#getRoot <em>Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(Token value);

	/**
	 * Returns the value of the '<em><b>Instance Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Root</em>' reference.
	 * @see #setInstanceRoot(EObject)
	 * @see org.osate.graph.TokenTrace.TokenTracePackage#getTokenTrace_InstanceRoot()
	 * @model
	 * @generated
	 */
	EObject getInstanceRoot();

	/**
	 * Sets the value of the '{@link org.osate.graph.TokenTrace.TokenTrace#getInstanceRoot <em>Instance Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Root</em>' reference.
	 * @see #getInstanceRoot()
	 * @generated
	 */
	void setInstanceRoot(EObject value);

	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.graph.TokenTrace.Token}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' containment reference list.
	 * @see org.osate.graph.TokenTrace.TokenTracePackage#getTokenTrace_Tokens()
	 * @model containment="true"
	 * @generated
	 */
	EList<Token> getTokens();

} // TokenTrace
