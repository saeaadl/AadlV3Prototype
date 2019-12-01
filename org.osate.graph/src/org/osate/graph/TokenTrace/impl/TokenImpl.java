/**
 */
package org.osate.graph.TokenTrace.impl;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.osate.aadlv3.aadlv3.Literal;
import org.osate.aadlv3.aadlv3.MultiLiteralConstraint;
import org.osate.aadlv3.aadlv3.impl.MultiLiteralConstraintImpl;
import org.osate.aadlv3.util.AIv3API;
import org.osate.av3instance.av3instance.InstanceObject;
import org.osate.graph.TokenTrace.Token;
import org.osate.graph.TokenTrace.TokenTracePackage;
import org.osate.graph.TokenTrace.TokenType;
import org.osate.graph.TokenTrace.util.TokenTraceUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Token</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.graph.TokenTrace.impl.TokenImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.impl.TokenImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.impl.TokenImpl#getTokens <em>Tokens</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.impl.TokenImpl#getTokenType <em>Token Type</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.impl.TokenImpl#getRelatedEObject <em>Related EObject</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.impl.TokenImpl#getTokenLiteral <em>Token Literal</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.impl.TokenImpl#getLiteralSink <em>Literal Sink</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.impl.TokenImpl#getReferenceCount <em>Reference Count</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.impl.TokenImpl#getAssignedProbability <em>Assigned Probability</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.impl.TokenImpl#getComputedProbability <em>Computed Probability</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.impl.TokenImpl#getScale <em>Scale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TokenImpl extends MultiLiteralConstraintImpl implements Token {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTokens() <em>Tokens</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<Token> tokens;

	/**
	 * The default value of the '{@link #getTokenType() <em>Token Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenType()
	 * @generated
	 * @ordered
	 */
	protected static final TokenType TOKEN_TYPE_EDEFAULT = TokenType.BASIC;

	/**
	 * The cached value of the '{@link #getTokenType() <em>Token Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenType()
	 * @generated
	 * @ordered
	 */
	protected TokenType tokenType = TOKEN_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelatedEObject() <em>Related EObject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedEObject()
	 * @generated
	 * @ordered
	 */
	protected EObject relatedEObject;

	/**
	 * The cached value of the '{@link #getTokenLiteral() <em>Token Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenLiteral()
	 * @generated
	 * @ordered
	 */
	protected Literal tokenLiteral;

	/**
	 * The cached value of the '{@link #getLiteralSink() <em>Literal Sink</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteralSink()
	 * @generated
	 * @ordered
	 */
	protected EList<Literal> literalSink;

	/**
	 * The default value of the '{@link #getReferenceCount() <em>Reference Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceCount()
	 * @generated
	 * @ordered
	 */
	protected static final int REFERENCE_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReferenceCount() <em>Reference Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceCount()
	 * @generated
	 * @ordered
	 */
	protected int referenceCount = REFERENCE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssignedProbability() <em>Assigned Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedProbability()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ASSIGNED_PROBABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssignedProbability() <em>Assigned Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedProbability()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal assignedProbability = ASSIGNED_PROBABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getComputedProbability() <em>Computed Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputedProbability()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal COMPUTED_PROBABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComputedProbability() <em>Computed Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputedProbability()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal computedProbability = COMPUTED_PROBABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal SCALE_EDEFAULT = new BigDecimal("1.0");

	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal scale = SCALE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TokenTracePackage.Literals.TOKEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TokenTracePackage.TOKEN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TokenTracePackage.TOKEN__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Token> getTokens() {
		if (tokens == null) {
			tokens = new EObjectResolvingEList<Token>(Token.class, this, TokenTracePackage.TOKEN__TOKENS);
		}
		return tokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TokenType getTokenType() {
		return tokenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTokenType(TokenType newTokenType) {
		TokenType oldTokenType = tokenType;
		tokenType = newTokenType == null ? TOKEN_TYPE_EDEFAULT : newTokenType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TokenTracePackage.TOKEN__TOKEN_TYPE, oldTokenType, tokenType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getRelatedEObject() {
		if (relatedEObject != null && relatedEObject.eIsProxy()) {
			InternalEObject oldRelatedEObject = (InternalEObject)relatedEObject;
			relatedEObject = eResolveProxy(oldRelatedEObject);
			if (relatedEObject != oldRelatedEObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TokenTracePackage.TOKEN__RELATED_EOBJECT, oldRelatedEObject, relatedEObject));
			}
		}
		return relatedEObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetRelatedEObject() {
		return relatedEObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelatedEObject(EObject newRelatedEObject) {
		EObject oldRelatedEObject = relatedEObject;
		relatedEObject = newRelatedEObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TokenTracePackage.TOKEN__RELATED_EOBJECT, oldRelatedEObject, relatedEObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Literal getTokenLiteral() {
		if (tokenLiteral != null && tokenLiteral.eIsProxy()) {
			InternalEObject oldTokenLiteral = (InternalEObject)tokenLiteral;
			tokenLiteral = (Literal)eResolveProxy(oldTokenLiteral);
			if (tokenLiteral != oldTokenLiteral) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TokenTracePackage.TOKEN__TOKEN_LITERAL, oldTokenLiteral, tokenLiteral));
			}
		}
		return tokenLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal basicGetTokenLiteral() {
		return tokenLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTokenLiteral(Literal newTokenLiteral) {
		Literal oldTokenLiteral = tokenLiteral;
		tokenLiteral = newTokenLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TokenTracePackage.TOKEN__TOKEN_LITERAL, oldTokenLiteral, tokenLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Literal> getLiteralSink() {
		if (literalSink == null) {
			literalSink = new EObjectContainmentEList<Literal>(Literal.class, this, TokenTracePackage.TOKEN__LITERAL_SINK);
		}
		return literalSink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getReferenceCount() {
		return referenceCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferenceCount(int newReferenceCount) {
		int oldReferenceCount = referenceCount;
		referenceCount = newReferenceCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TokenTracePackage.TOKEN__REFERENCE_COUNT, oldReferenceCount, referenceCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAssignedProbability() {
		return assignedProbability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssignedProbability(BigDecimal newAssignedProbability) {
		BigDecimal oldAssignedProbability = assignedProbability;
		assignedProbability = newAssignedProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TokenTracePackage.TOKEN__ASSIGNED_PROBABILITY, oldAssignedProbability, assignedProbability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getComputedProbability() {
		return computedProbability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComputedProbability(BigDecimal newComputedProbability) {
		BigDecimal oldComputedProbability = computedProbability;
		computedProbability = newComputedProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TokenTracePackage.TOKEN__COMPUTED_PROBABILITY, oldComputedProbability, computedProbability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScale(BigDecimal newScale) {
		BigDecimal oldScale = scale;
		scale = newScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TokenTracePackage.TOKEN__SCALE, oldScale, scale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public BigDecimal getProbability() {
		if (this.getComputedProbability() == null || this.getComputedProbability().compareTo(TokenTraceUtil.BigZero) == 0) {
			if (this.getAssignedProbability() != null) {
				return this.getAssignedProbability();
			} else {
				return TokenTraceUtil.BigZero;
			}
		}
		return this.getComputedProbability();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TokenTracePackage.TOKEN__LITERAL_SINK:
				return ((InternalEList<?>)getLiteralSink()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TokenTracePackage.TOKEN__NAME:
				return getName();
			case TokenTracePackage.TOKEN__MESSAGE:
				return getMessage();
			case TokenTracePackage.TOKEN__TOKENS:
				return getTokens();
			case TokenTracePackage.TOKEN__TOKEN_TYPE:
				return getTokenType();
			case TokenTracePackage.TOKEN__RELATED_EOBJECT:
				if (resolve) return getRelatedEObject();
				return basicGetRelatedEObject();
			case TokenTracePackage.TOKEN__TOKEN_LITERAL:
				if (resolve) return getTokenLiteral();
				return basicGetTokenLiteral();
			case TokenTracePackage.TOKEN__LITERAL_SINK:
				return getLiteralSink();
			case TokenTracePackage.TOKEN__REFERENCE_COUNT:
				return getReferenceCount();
			case TokenTracePackage.TOKEN__ASSIGNED_PROBABILITY:
				return getAssignedProbability();
			case TokenTracePackage.TOKEN__COMPUTED_PROBABILITY:
				return getComputedProbability();
			case TokenTracePackage.TOKEN__SCALE:
				return getScale();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TokenTracePackage.TOKEN__NAME:
				setName((String)newValue);
				return;
			case TokenTracePackage.TOKEN__MESSAGE:
				setMessage((String)newValue);
				return;
			case TokenTracePackage.TOKEN__TOKENS:
				getTokens().clear();
				getTokens().addAll((Collection<? extends Token>)newValue);
				return;
			case TokenTracePackage.TOKEN__TOKEN_TYPE:
				setTokenType((TokenType)newValue);
				return;
			case TokenTracePackage.TOKEN__RELATED_EOBJECT:
				setRelatedEObject((EObject)newValue);
				return;
			case TokenTracePackage.TOKEN__TOKEN_LITERAL:
				setTokenLiteral((Literal)newValue);
				return;
			case TokenTracePackage.TOKEN__LITERAL_SINK:
				getLiteralSink().clear();
				getLiteralSink().addAll((Collection<? extends Literal>)newValue);
				return;
			case TokenTracePackage.TOKEN__REFERENCE_COUNT:
				setReferenceCount((Integer)newValue);
				return;
			case TokenTracePackage.TOKEN__ASSIGNED_PROBABILITY:
				setAssignedProbability((BigDecimal)newValue);
				return;
			case TokenTracePackage.TOKEN__COMPUTED_PROBABILITY:
				setComputedProbability((BigDecimal)newValue);
				return;
			case TokenTracePackage.TOKEN__SCALE:
				setScale((BigDecimal)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TokenTracePackage.TOKEN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TokenTracePackage.TOKEN__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
			case TokenTracePackage.TOKEN__TOKENS:
				getTokens().clear();
				return;
			case TokenTracePackage.TOKEN__TOKEN_TYPE:
				setTokenType(TOKEN_TYPE_EDEFAULT);
				return;
			case TokenTracePackage.TOKEN__RELATED_EOBJECT:
				setRelatedEObject((EObject)null);
				return;
			case TokenTracePackage.TOKEN__TOKEN_LITERAL:
				setTokenLiteral((Literal)null);
				return;
			case TokenTracePackage.TOKEN__LITERAL_SINK:
				getLiteralSink().clear();
				return;
			case TokenTracePackage.TOKEN__REFERENCE_COUNT:
				setReferenceCount(REFERENCE_COUNT_EDEFAULT);
				return;
			case TokenTracePackage.TOKEN__ASSIGNED_PROBABILITY:
				setAssignedProbability(ASSIGNED_PROBABILITY_EDEFAULT);
				return;
			case TokenTracePackage.TOKEN__COMPUTED_PROBABILITY:
				setComputedProbability(COMPUTED_PROBABILITY_EDEFAULT);
				return;
			case TokenTracePackage.TOKEN__SCALE:
				setScale(SCALE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TokenTracePackage.TOKEN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TokenTracePackage.TOKEN__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
			case TokenTracePackage.TOKEN__TOKENS:
				return tokens != null && !tokens.isEmpty();
			case TokenTracePackage.TOKEN__TOKEN_TYPE:
				return tokenType != TOKEN_TYPE_EDEFAULT;
			case TokenTracePackage.TOKEN__RELATED_EOBJECT:
				return relatedEObject != null;
			case TokenTracePackage.TOKEN__TOKEN_LITERAL:
				return tokenLiteral != null;
			case TokenTracePackage.TOKEN__LITERAL_SINK:
				return literalSink != null && !literalSink.isEmpty();
			case TokenTracePackage.TOKEN__REFERENCE_COUNT:
				return referenceCount != REFERENCE_COUNT_EDEFAULT;
			case TokenTracePackage.TOKEN__ASSIGNED_PROBABILITY:
				return ASSIGNED_PROBABILITY_EDEFAULT == null ? assignedProbability != null : !ASSIGNED_PROBABILITY_EDEFAULT.equals(assignedProbability);
			case TokenTracePackage.TOKEN__COMPUTED_PROBABILITY:
				return COMPUTED_PROBABILITY_EDEFAULT == null ? computedProbability != null : !COMPUTED_PROBABILITY_EDEFAULT.equals(computedProbability);
			case TokenTracePackage.TOKEN__SCALE:
				return SCALE_EDEFAULT == null ? scale != null : !SCALE_EDEFAULT.equals(scale);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TokenTracePackage.TOKEN___GET_PROBABILITY:
				return getProbability();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();
		String eolabel = this.getRelatedEObject() instanceof InstanceObject? AIv3API.getInstanceObjectPath((InstanceObject)this.getRelatedEObject()):((MultiLiteralConstraint)this.getRelatedEObject()).getOperator().getName();
		return eolabel+(this.getTokenLiteral()!=null?":"+this.getTokenLiteral().toString():"");
	}

} //TokenImpl
