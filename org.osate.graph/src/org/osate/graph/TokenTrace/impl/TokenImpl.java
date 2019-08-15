/**
 */
package org.osate.graph.TokenTrace.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.osate.graph.TokenTrace.LogicOperation;
import org.osate.graph.TokenTrace.Token;
import org.osate.graph.TokenTrace.TokenTracePackage;

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
 *   <li>{@link org.osate.graph.TokenTrace.impl.TokenImpl#getK <em>K</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.impl.TokenImpl#getRelatedInstanceObject <em>Related Instance Object</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.impl.TokenImpl#getRelatedToken <em>Related Token</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.impl.TokenImpl#getReferenceCount <em>Reference Count</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.impl.TokenImpl#getTokenLogic <em>Token Logic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TokenImpl extends MinimalEObjectImpl.Container implements Token {
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
	 * The default value of the '{@link #getK() <em>K</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getK()
	 * @generated
	 * @ordered
	 */
	protected static final int K_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getK() <em>K</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getK()
	 * @generated
	 * @ordered
	 */
	protected int k = K_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelatedInstanceObject() <em>Related Instance Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedInstanceObject()
	 * @generated
	 * @ordered
	 */
	protected EObject relatedInstanceObject;

	/**
	 * The cached value of the '{@link #getRelatedToken() <em>Related Token</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedToken()
	 * @generated
	 * @ordered
	 */
	protected EObject relatedToken;

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
	 * The default value of the '{@link #getTokenLogic() <em>Token Logic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenLogic()
	 * @generated
	 * @ordered
	 */
	protected static final LogicOperation TOKEN_LOGIC_EDEFAULT = LogicOperation.OR;

	/**
	 * The cached value of the '{@link #getTokenLogic() <em>Token Logic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenLogic()
	 * @generated
	 * @ordered
	 */
	protected LogicOperation tokenLogic = TOKEN_LOGIC_EDEFAULT;

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
	public int getK() {
		return k;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setK(int newK) {
		int oldK = k;
		k = newK;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TokenTracePackage.TOKEN__K, oldK, k));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getRelatedInstanceObject() {
		if (relatedInstanceObject != null && relatedInstanceObject.eIsProxy()) {
			InternalEObject oldRelatedInstanceObject = (InternalEObject)relatedInstanceObject;
			relatedInstanceObject = eResolveProxy(oldRelatedInstanceObject);
			if (relatedInstanceObject != oldRelatedInstanceObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TokenTracePackage.TOKEN__RELATED_INSTANCE_OBJECT, oldRelatedInstanceObject, relatedInstanceObject));
			}
		}
		return relatedInstanceObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetRelatedInstanceObject() {
		return relatedInstanceObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelatedInstanceObject(EObject newRelatedInstanceObject) {
		EObject oldRelatedInstanceObject = relatedInstanceObject;
		relatedInstanceObject = newRelatedInstanceObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TokenTracePackage.TOKEN__RELATED_INSTANCE_OBJECT, oldRelatedInstanceObject, relatedInstanceObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getRelatedToken() {
		if (relatedToken != null && relatedToken.eIsProxy()) {
			InternalEObject oldRelatedToken = (InternalEObject)relatedToken;
			relatedToken = eResolveProxy(oldRelatedToken);
			if (relatedToken != oldRelatedToken) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TokenTracePackage.TOKEN__RELATED_TOKEN, oldRelatedToken, relatedToken));
			}
		}
		return relatedToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetRelatedToken() {
		return relatedToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelatedToken(EObject newRelatedToken) {
		EObject oldRelatedToken = relatedToken;
		relatedToken = newRelatedToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TokenTracePackage.TOKEN__RELATED_TOKEN, oldRelatedToken, relatedToken));
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
	public LogicOperation getTokenLogic() {
		return tokenLogic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTokenLogic(LogicOperation newTokenLogic) {
		LogicOperation oldTokenLogic = tokenLogic;
		tokenLogic = newTokenLogic == null ? TOKEN_LOGIC_EDEFAULT : newTokenLogic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TokenTracePackage.TOKEN__TOKEN_LOGIC, oldTokenLogic, tokenLogic));
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
			case TokenTracePackage.TOKEN__K:
				return getK();
			case TokenTracePackage.TOKEN__RELATED_INSTANCE_OBJECT:
				if (resolve) return getRelatedInstanceObject();
				return basicGetRelatedInstanceObject();
			case TokenTracePackage.TOKEN__RELATED_TOKEN:
				if (resolve) return getRelatedToken();
				return basicGetRelatedToken();
			case TokenTracePackage.TOKEN__REFERENCE_COUNT:
				return getReferenceCount();
			case TokenTracePackage.TOKEN__TOKEN_LOGIC:
				return getTokenLogic();
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
			case TokenTracePackage.TOKEN__K:
				setK((Integer)newValue);
				return;
			case TokenTracePackage.TOKEN__RELATED_INSTANCE_OBJECT:
				setRelatedInstanceObject((EObject)newValue);
				return;
			case TokenTracePackage.TOKEN__RELATED_TOKEN:
				setRelatedToken((EObject)newValue);
				return;
			case TokenTracePackage.TOKEN__REFERENCE_COUNT:
				setReferenceCount((Integer)newValue);
				return;
			case TokenTracePackage.TOKEN__TOKEN_LOGIC:
				setTokenLogic((LogicOperation)newValue);
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
			case TokenTracePackage.TOKEN__K:
				setK(K_EDEFAULT);
				return;
			case TokenTracePackage.TOKEN__RELATED_INSTANCE_OBJECT:
				setRelatedInstanceObject((EObject)null);
				return;
			case TokenTracePackage.TOKEN__RELATED_TOKEN:
				setRelatedToken((EObject)null);
				return;
			case TokenTracePackage.TOKEN__REFERENCE_COUNT:
				setReferenceCount(REFERENCE_COUNT_EDEFAULT);
				return;
			case TokenTracePackage.TOKEN__TOKEN_LOGIC:
				setTokenLogic(TOKEN_LOGIC_EDEFAULT);
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
			case TokenTracePackage.TOKEN__K:
				return k != K_EDEFAULT;
			case TokenTracePackage.TOKEN__RELATED_INSTANCE_OBJECT:
				return relatedInstanceObject != null;
			case TokenTracePackage.TOKEN__RELATED_TOKEN:
				return relatedToken != null;
			case TokenTracePackage.TOKEN__REFERENCE_COUNT:
				return referenceCount != REFERENCE_COUNT_EDEFAULT;
			case TokenTracePackage.TOKEN__TOKEN_LOGIC:
				return tokenLogic != TOKEN_LOGIC_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", message: ");
		result.append(message);
		result.append(", k: ");
		result.append(k);
		result.append(", referenceCount: ");
		result.append(referenceCount);
		result.append(", tokenLogic: ");
		result.append(tokenLogic);
		result.append(')');
		return result.toString();
	}

} //TokenImpl
