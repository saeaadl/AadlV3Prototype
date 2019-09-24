/**
 */
package org.osate.graph.TokenTrace;

import org.eclipse.emf.common.util.EList;
import org.osate.aadlv3.aadlv3.MultiLiteralConstraint;
import org.osate.aadlv3.aadlv3.TypeReference;
import org.osate.av3instance.av3instance.InstanceObject;

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
 *   <li>{@link org.osate.graph.TokenTrace.Token#getRelatedInstanceObject <em>Related Instance Object</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.Token#getRelatedType <em>Related Type</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.Token#getReferenceCount <em>Reference Count</em>}</li>
 * </ul>
 *
 * @see org.osate.graph.TokenTrace.TokenTracePackage#getToken()
 * @model
 * @generated
 */
public interface Token extends MultiLiteralConstraint {
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
	 * Returns the value of the '<em><b>Related Instance Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Instance Object</em>' reference.
	 * @see #setRelatedInstanceObject(InstanceObject)
	 * @see org.osate.graph.TokenTrace.TokenTracePackage#getToken_RelatedInstanceObject()
	 * @model
	 * @generated
	 */
	InstanceObject getRelatedInstanceObject();

	/**
	 * Sets the value of the '{@link org.osate.graph.TokenTrace.Token#getRelatedInstanceObject <em>Related Instance Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Instance Object</em>' reference.
	 * @see #getRelatedInstanceObject()
	 * @generated
	 */
	void setRelatedInstanceObject(InstanceObject value);

	/**
	 * Returns the value of the '<em><b>Related Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Type</em>' reference.
	 * @see #setRelatedType(TypeReference)
	 * @see org.osate.graph.TokenTrace.TokenTracePackage#getToken_RelatedType()
	 * @model
	 * @generated
	 */
	TypeReference getRelatedType();

	/**
	 * Sets the value of the '{@link org.osate.graph.TokenTrace.Token#getRelatedType <em>Related Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Type</em>' reference.
	 * @see #getRelatedType()
	 * @generated
	 */
	void setRelatedType(TypeReference value);

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

} // Token
