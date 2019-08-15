/**
 */
package org.osate.graph.TokenTrace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.graph.TokenTrace.Token#getName <em>Name</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.Token#getMessage <em>Message</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.Token#getTokens <em>Tokens</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.Token#getK <em>K</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.Token#getRelatedInstanceObject <em>Related Instance Object</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.Token#getRelatedToken <em>Related Token</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.Token#getReferenceCount <em>Reference Count</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.Token#getTokenLogic <em>Token Logic</em>}</li>
 * </ul>
 *
 * @see org.osate.graph.TokenTrace.TokenTracePackage#getToken()
 * @model
 * @generated
 */
public interface Token extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.osate.graph.TokenTrace.TokenTracePackage#getToken_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.osate.graph.TokenTrace.Token#getName <em>Name</em>}' attribute.
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
	 * @see org.osate.graph.TokenTrace.TokenTracePackage#getToken_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.osate.graph.TokenTrace.Token#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' reference list.
	 * The list contents are of type {@link org.osate.graph.TokenTrace.Token}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' reference list.
	 * @see org.osate.graph.TokenTrace.TokenTracePackage#getToken_Tokens()
	 * @model
	 * @generated
	 */
	EList<Token> getTokens();

	/**
	 * Returns the value of the '<em><b>K</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>K</em>' attribute.
	 * @see #setK(int)
	 * @see org.osate.graph.TokenTrace.TokenTracePackage#getToken_K()
	 * @model default="1"
	 * @generated
	 */
	int getK();

	/**
	 * Sets the value of the '{@link org.osate.graph.TokenTrace.Token#getK <em>K</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>K</em>' attribute.
	 * @see #getK()
	 * @generated
	 */
	void setK(int value);

	/**
	 * Returns the value of the '<em><b>Related Instance Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Instance Object</em>' reference.
	 * @see #setRelatedInstanceObject(EObject)
	 * @see org.osate.graph.TokenTrace.TokenTracePackage#getToken_RelatedInstanceObject()
	 * @model
	 * @generated
	 */
	EObject getRelatedInstanceObject();

	/**
	 * Sets the value of the '{@link org.osate.graph.TokenTrace.Token#getRelatedInstanceObject <em>Related Instance Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Instance Object</em>' reference.
	 * @see #getRelatedInstanceObject()
	 * @generated
	 */
	void setRelatedInstanceObject(EObject value);

	/**
	 * Returns the value of the '<em><b>Related Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Token</em>' reference.
	 * @see #setRelatedToken(EObject)
	 * @see org.osate.graph.TokenTrace.TokenTracePackage#getToken_RelatedToken()
	 * @model
	 * @generated
	 */
	EObject getRelatedToken();

	/**
	 * Sets the value of the '{@link org.osate.graph.TokenTrace.Token#getRelatedToken <em>Related Token</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Token</em>' reference.
	 * @see #getRelatedToken()
	 * @generated
	 */
	void setRelatedToken(EObject value);

	/**
	 * Returns the value of the '<em><b>Reference Count</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Count</em>' attribute.
	 * @see #setReferenceCount(int)
	 * @see org.osate.graph.TokenTrace.TokenTracePackage#getToken_ReferenceCount()
	 * @model default="0"
	 * @generated
	 */
	int getReferenceCount();

	/**
	 * Sets the value of the '{@link org.osate.graph.TokenTrace.Token#getReferenceCount <em>Reference Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Count</em>' attribute.
	 * @see #getReferenceCount()
	 * @generated
	 */
	void setReferenceCount(int value);

	/**
	 * Returns the value of the '<em><b>Token Logic</b></em>' attribute.
	 * The literals are from the enumeration {@link org.osate.graph.TokenTrace.LogicOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Logic</em>' attribute.
	 * @see org.osate.graph.TokenTrace.LogicOperation
	 * @see #setTokenLogic(LogicOperation)
	 * @see org.osate.graph.TokenTrace.TokenTracePackage#getToken_TokenLogic()
	 * @model
	 * @generated
	 */
	LogicOperation getTokenLogic();

	/**
	 * Sets the value of the '{@link org.osate.graph.TokenTrace.Token#getTokenLogic <em>Token Logic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token Logic</em>' attribute.
	 * @see org.osate.graph.TokenTrace.LogicOperation
	 * @see #getTokenLogic()
	 * @generated
	 */
	void setTokenLogic(LogicOperation value);

} // Token
