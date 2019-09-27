/**
 */
package org.osate.graph.TokenTrace.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.osate.aadlv3.aadlv3.TypeReference;
import org.osate.aadlv3.aadlv3.impl.MultiLiteralConstraintImpl;
import org.osate.av3instance.av3instance.InstanceObject;
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
 *   <li>{@link org.osate.graph.TokenTrace.impl.TokenImpl#getRelatedInstanceObject <em>Related Instance Object</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.impl.TokenImpl#getRelatedType <em>Related Type</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.impl.TokenImpl#getReferenceCount <em>Reference Count</em>}</li>
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
	 * The cached value of the '{@link #getRelatedInstanceObject() <em>Related Instance Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedInstanceObject()
	 * @generated
	 * @ordered
	 */
	protected InstanceObject relatedInstanceObject;

	/**
	 * The cached value of the '{@link #getRelatedType() <em>Related Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedType()
	 * @generated
	 * @ordered
	 */
	protected TypeReference relatedType;

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
	public InstanceObject getRelatedInstanceObject() {
		if (relatedInstanceObject != null && relatedInstanceObject.eIsProxy()) {
			InternalEObject oldRelatedInstanceObject = (InternalEObject)relatedInstanceObject;
			relatedInstanceObject = (InstanceObject)eResolveProxy(oldRelatedInstanceObject);
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
	public InstanceObject basicGetRelatedInstanceObject() {
		return relatedInstanceObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelatedInstanceObject(InstanceObject newRelatedInstanceObject) {
		InstanceObject oldRelatedInstanceObject = relatedInstanceObject;
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
	public TypeReference getRelatedType() {
		if (relatedType != null && relatedType.eIsProxy()) {
			InternalEObject oldRelatedType = (InternalEObject)relatedType;
			relatedType = (TypeReference)eResolveProxy(oldRelatedType);
			if (relatedType != oldRelatedType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TokenTracePackage.TOKEN__RELATED_TYPE, oldRelatedType, relatedType));
			}
		}
		return relatedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference basicGetRelatedType() {
		return relatedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelatedType(TypeReference newRelatedType) {
		TypeReference oldRelatedType = relatedType;
		relatedType = newRelatedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TokenTracePackage.TOKEN__RELATED_TYPE, oldRelatedType, relatedType));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TokenTracePackage.TOKEN__NAME:
				return getName();
			case TokenTracePackage.TOKEN__MESSAGE:
				return getMessage();
			case TokenTracePackage.TOKEN__TOKENS:
				return getTokens();
			case TokenTracePackage.TOKEN__RELATED_INSTANCE_OBJECT:
				if (resolve) return getRelatedInstanceObject();
				return basicGetRelatedInstanceObject();
			case TokenTracePackage.TOKEN__RELATED_TYPE:
				if (resolve) return getRelatedType();
				return basicGetRelatedType();
			case TokenTracePackage.TOKEN__REFERENCE_COUNT:
				return getReferenceCount();
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
			case TokenTracePackage.TOKEN__RELATED_INSTANCE_OBJECT:
				setRelatedInstanceObject((InstanceObject)newValue);
				return;
			case TokenTracePackage.TOKEN__RELATED_TYPE:
				setRelatedType((TypeReference)newValue);
				return;
			case TokenTracePackage.TOKEN__REFERENCE_COUNT:
				setReferenceCount((Integer)newValue);
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
			case TokenTracePackage.TOKEN__RELATED_INSTANCE_OBJECT:
				setRelatedInstanceObject((InstanceObject)null);
				return;
			case TokenTracePackage.TOKEN__RELATED_TYPE:
				setRelatedType((TypeReference)null);
				return;
			case TokenTracePackage.TOKEN__REFERENCE_COUNT:
				setReferenceCount(REFERENCE_COUNT_EDEFAULT);
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
			case TokenTracePackage.TOKEN__RELATED_INSTANCE_OBJECT:
				return relatedInstanceObject != null;
			case TokenTracePackage.TOKEN__RELATED_TYPE:
				return relatedType != null;
			case TokenTracePackage.TOKEN__REFERENCE_COUNT:
				return referenceCount != REFERENCE_COUNT_EDEFAULT;
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
		result.append(", referenceCount: ");
		result.append(referenceCount);
		result.append(')');
		return result.toString();
	}

} //TokenImpl
