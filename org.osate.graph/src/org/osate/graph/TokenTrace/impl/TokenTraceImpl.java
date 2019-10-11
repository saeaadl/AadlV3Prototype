/**
 */
package org.osate.graph.TokenTrace.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadlv3.aadlv3.Literal;
import org.osate.graph.TokenTrace.Token;
import org.osate.graph.TokenTrace.TokenTrace;
import org.osate.graph.TokenTrace.TokenTracePackage;
import org.osate.graph.TokenTrace.TokenTraceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Token Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.graph.TokenTrace.impl.TokenTraceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.impl.TokenTraceImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.impl.TokenTraceImpl#getTokenTraceType <em>Token Trace Type</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.impl.TokenTraceImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.impl.TokenTraceImpl#getInstanceRoot <em>Instance Root</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.impl.TokenTraceImpl#getTokens <em>Tokens</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.impl.TokenTraceImpl#getInferredRootLiteral <em>Inferred Root Literal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TokenTraceImpl extends MinimalEObjectImpl.Container implements TokenTrace {
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
	 * The default value of the '{@link #getTokenTraceType() <em>Token Trace Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenTraceType()
	 * @generated
	 * @ordered
	 */
	protected static final TokenTraceType TOKEN_TRACE_TYPE_EDEFAULT = TokenTraceType.TOKEN_GRAPH;

	/**
	 * The cached value of the '{@link #getTokenTraceType() <em>Token Trace Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenTraceType()
	 * @generated
	 * @ordered
	 */
	protected TokenTraceType tokenTraceType = TOKEN_TRACE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected Token root;

	/**
	 * The cached value of the '{@link #getInstanceRoot() <em>Instance Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceRoot()
	 * @generated
	 * @ordered
	 */
	protected EObject instanceRoot;

	/**
	 * The cached value of the '{@link #getTokens() <em>Tokens</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<Token> tokens;

	/**
	 * The cached value of the '{@link #getInferredRootLiteral() <em>Inferred Root Literal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInferredRootLiteral()
	 * @generated
	 * @ordered
	 */
	protected Literal inferredRootLiteral;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TokenTracePackage.Literals.TOKEN_TRACE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TokenTracePackage.TOKEN_TRACE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TokenTracePackage.TOKEN_TRACE__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TokenTraceType getTokenTraceType() {
		return tokenTraceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTokenTraceType(TokenTraceType newTokenTraceType) {
		TokenTraceType oldTokenTraceType = tokenTraceType;
		tokenTraceType = newTokenTraceType == null ? TOKEN_TRACE_TYPE_EDEFAULT : newTokenTraceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TokenTracePackage.TOKEN_TRACE__TOKEN_TRACE_TYPE, oldTokenTraceType, tokenTraceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Token getRoot() {
		if (root != null && root.eIsProxy()) {
			InternalEObject oldRoot = (InternalEObject)root;
			root = (Token)eResolveProxy(oldRoot);
			if (root != oldRoot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TokenTracePackage.TOKEN_TRACE__ROOT, oldRoot, root));
			}
		}
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token basicGetRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoot(Token newRoot) {
		Token oldRoot = root;
		root = newRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TokenTracePackage.TOKEN_TRACE__ROOT, oldRoot, root));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getInstanceRoot() {
		if (instanceRoot != null && instanceRoot.eIsProxy()) {
			InternalEObject oldInstanceRoot = (InternalEObject)instanceRoot;
			instanceRoot = eResolveProxy(oldInstanceRoot);
			if (instanceRoot != oldInstanceRoot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TokenTracePackage.TOKEN_TRACE__INSTANCE_ROOT, oldInstanceRoot, instanceRoot));
			}
		}
		return instanceRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetInstanceRoot() {
		return instanceRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstanceRoot(EObject newInstanceRoot) {
		EObject oldInstanceRoot = instanceRoot;
		instanceRoot = newInstanceRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TokenTracePackage.TOKEN_TRACE__INSTANCE_ROOT, oldInstanceRoot, instanceRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Token> getTokens() {
		if (tokens == null) {
			tokens = new EObjectContainmentEList<Token>(Token.class, this, TokenTracePackage.TOKEN_TRACE__TOKENS);
		}
		return tokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Literal getInferredRootLiteral() {
		return inferredRootLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInferredRootLiteral(Literal newInferredRootLiteral, NotificationChain msgs) {
		Literal oldInferredRootLiteral = inferredRootLiteral;
		inferredRootLiteral = newInferredRootLiteral;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TokenTracePackage.TOKEN_TRACE__INFERRED_ROOT_LITERAL, oldInferredRootLiteral, newInferredRootLiteral);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInferredRootLiteral(Literal newInferredRootLiteral) {
		if (newInferredRootLiteral != inferredRootLiteral) {
			NotificationChain msgs = null;
			if (inferredRootLiteral != null)
				msgs = ((InternalEObject)inferredRootLiteral).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TokenTracePackage.TOKEN_TRACE__INFERRED_ROOT_LITERAL, null, msgs);
			if (newInferredRootLiteral != null)
				msgs = ((InternalEObject)newInferredRootLiteral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TokenTracePackage.TOKEN_TRACE__INFERRED_ROOT_LITERAL, null, msgs);
			msgs = basicSetInferredRootLiteral(newInferredRootLiteral, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TokenTracePackage.TOKEN_TRACE__INFERRED_ROOT_LITERAL, newInferredRootLiteral, newInferredRootLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TokenTracePackage.TOKEN_TRACE__TOKENS:
				return ((InternalEList<?>)getTokens()).basicRemove(otherEnd, msgs);
			case TokenTracePackage.TOKEN_TRACE__INFERRED_ROOT_LITERAL:
				return basicSetInferredRootLiteral(null, msgs);
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
			case TokenTracePackage.TOKEN_TRACE__NAME:
				return getName();
			case TokenTracePackage.TOKEN_TRACE__MESSAGE:
				return getMessage();
			case TokenTracePackage.TOKEN_TRACE__TOKEN_TRACE_TYPE:
				return getTokenTraceType();
			case TokenTracePackage.TOKEN_TRACE__ROOT:
				if (resolve) return getRoot();
				return basicGetRoot();
			case TokenTracePackage.TOKEN_TRACE__INSTANCE_ROOT:
				if (resolve) return getInstanceRoot();
				return basicGetInstanceRoot();
			case TokenTracePackage.TOKEN_TRACE__TOKENS:
				return getTokens();
			case TokenTracePackage.TOKEN_TRACE__INFERRED_ROOT_LITERAL:
				return getInferredRootLiteral();
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
			case TokenTracePackage.TOKEN_TRACE__NAME:
				setName((String)newValue);
				return;
			case TokenTracePackage.TOKEN_TRACE__MESSAGE:
				setMessage((String)newValue);
				return;
			case TokenTracePackage.TOKEN_TRACE__TOKEN_TRACE_TYPE:
				setTokenTraceType((TokenTraceType)newValue);
				return;
			case TokenTracePackage.TOKEN_TRACE__ROOT:
				setRoot((Token)newValue);
				return;
			case TokenTracePackage.TOKEN_TRACE__INSTANCE_ROOT:
				setInstanceRoot((EObject)newValue);
				return;
			case TokenTracePackage.TOKEN_TRACE__TOKENS:
				getTokens().clear();
				getTokens().addAll((Collection<? extends Token>)newValue);
				return;
			case TokenTracePackage.TOKEN_TRACE__INFERRED_ROOT_LITERAL:
				setInferredRootLiteral((Literal)newValue);
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
			case TokenTracePackage.TOKEN_TRACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TokenTracePackage.TOKEN_TRACE__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
			case TokenTracePackage.TOKEN_TRACE__TOKEN_TRACE_TYPE:
				setTokenTraceType(TOKEN_TRACE_TYPE_EDEFAULT);
				return;
			case TokenTracePackage.TOKEN_TRACE__ROOT:
				setRoot((Token)null);
				return;
			case TokenTracePackage.TOKEN_TRACE__INSTANCE_ROOT:
				setInstanceRoot((EObject)null);
				return;
			case TokenTracePackage.TOKEN_TRACE__TOKENS:
				getTokens().clear();
				return;
			case TokenTracePackage.TOKEN_TRACE__INFERRED_ROOT_LITERAL:
				setInferredRootLiteral((Literal)null);
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
			case TokenTracePackage.TOKEN_TRACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TokenTracePackage.TOKEN_TRACE__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
			case TokenTracePackage.TOKEN_TRACE__TOKEN_TRACE_TYPE:
				return tokenTraceType != TOKEN_TRACE_TYPE_EDEFAULT;
			case TokenTracePackage.TOKEN_TRACE__ROOT:
				return root != null;
			case TokenTracePackage.TOKEN_TRACE__INSTANCE_ROOT:
				return instanceRoot != null;
			case TokenTracePackage.TOKEN_TRACE__TOKENS:
				return tokens != null && !tokens.isEmpty();
			case TokenTracePackage.TOKEN_TRACE__INFERRED_ROOT_LITERAL:
				return inferredRootLiteral != null;
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
		result.append(", tokenTraceType: ");
		result.append(tokenTraceType);
		result.append(')');
		return result.toString();
	}

} //TokenTraceImpl
