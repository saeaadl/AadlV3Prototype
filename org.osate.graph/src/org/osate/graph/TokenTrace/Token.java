/**
 */
package org.osate.graph.TokenTrace;

import java.math.BigDecimal;
import org.eclipse.emf.common.util.EList;
import org.osate.aadlv3.aadlv3.Literal;
import org.osate.aadlv3.aadlv3.MultiLiteralConstraint;
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
 *   <li>{@link org.osate.graph.TokenTrace.Token#getTokenType <em>Token Type</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.Token#getRelatedInstanceObject <em>Related Instance Object</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.Token#getRelatedLiteral <em>Related Literal</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.Token#getReferenceCount <em>Reference Count</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.Token#getAssignedProbability <em>Assigned Probability</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.Token#getComputedProbability <em>Computed Probability</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.Token#getScale <em>Scale</em>}</li>
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
	 * Returns the value of the '<em><b>Token Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.osate.graph.TokenTrace.TokenType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Type</em>' attribute.
	 * @see org.osate.graph.TokenTrace.TokenType
	 * @see #setTokenType(TokenType)
	 * @see org.osate.graph.TokenTrace.TokenTracePackage#getToken_TokenType()
	 * @model
	 * @generated
	 */
	TokenType getTokenType();

	/**
	 * Sets the value of the '{@link org.osate.graph.TokenTrace.Token#getTokenType <em>Token Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token Type</em>' attribute.
	 * @see org.osate.graph.TokenTrace.TokenType
	 * @see #getTokenType()
	 * @generated
	 */
	void setTokenType(TokenType value);

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
	 * Returns the value of the '<em><b>Related Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Literal</em>' reference.
	 * @see #setRelatedLiteral(Literal)
	 * @see org.osate.graph.TokenTrace.TokenTracePackage#getToken_RelatedLiteral()
	 * @model
	 * @generated
	 */
	Literal getRelatedLiteral();

	/**
	 * Sets the value of the '{@link org.osate.graph.TokenTrace.Token#getRelatedLiteral <em>Related Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Literal</em>' reference.
	 * @see #getRelatedLiteral()
	 * @generated
	 */
	void setRelatedLiteral(Literal value);

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
	 * Returns the value of the '<em><b>Assigned Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Probability</em>' attribute.
	 * @see #setAssignedProbability(BigDecimal)
	 * @see org.osate.graph.TokenTrace.TokenTracePackage#getToken_AssignedProbability()
	 * @model
	 * @generated
	 */
	BigDecimal getAssignedProbability();

	/**
	 * Sets the value of the '{@link org.osate.graph.TokenTrace.Token#getAssignedProbability <em>Assigned Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned Probability</em>' attribute.
	 * @see #getAssignedProbability()
	 * @generated
	 */
	void setAssignedProbability(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Computed Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computed Probability</em>' attribute.
	 * @see #setComputedProbability(BigDecimal)
	 * @see org.osate.graph.TokenTrace.TokenTracePackage#getToken_ComputedProbability()
	 * @model
	 * @generated
	 */
	BigDecimal getComputedProbability();

	/**
	 * Sets the value of the '{@link org.osate.graph.TokenTrace.Token#getComputedProbability <em>Computed Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computed Probability</em>' attribute.
	 * @see #getComputedProbability()
	 * @generated
	 */
	void setComputedProbability(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #setScale(BigDecimal)
	 * @see org.osate.graph.TokenTrace.TokenTracePackage#getToken_Scale()
	 * @model default="1.0"
	 * @generated
	 */
	BigDecimal getScale();

	/**
	 * Sets the value of the '{@link org.osate.graph.TokenTrace.Token#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(BigDecimal value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	BigDecimal getProbability();

} // Token
