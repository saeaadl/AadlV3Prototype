/**
 * Copyright Text	Copyright 2018 Carnegie Mellon University. All Rights Reserved....
 */
package org.osate.emv3.emv3.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.aadlv3.aadlv3.impl.NamedElementImpl;

import org.osate.emv3.emv3.CompositeState;
import org.osate.emv3.emv3.ConditionExpression;
import org.osate.emv3.emv3.Emv3Package;
import org.osate.emv3.emv3.ErrorBehaviorState;
import org.osate.emv3.emv3.TypeSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.emv3.emv3.impl.CompositeStateImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.impl.CompositeStateImpl#isOthers <em>Others</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.impl.CompositeStateImpl#getState <em>State</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.impl.CompositeStateImpl#getTypedToken <em>Typed Token</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeStateImpl extends NamedElementImpl implements CompositeState {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected ConditionExpression condition;

	/**
	 * The default value of the '{@link #isOthers() <em>Others</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOthers()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OTHERS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOthers() <em>Others</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOthers()
	 * @generated
	 * @ordered
	 */
	protected boolean others = OTHERS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected ErrorBehaviorState state;

	/**
	 * The cached value of the '{@link #getTypedToken() <em>Typed Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedToken()
	 * @generated
	 * @ordered
	 */
	protected TypeSet typedToken;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Emv3Package.Literals.COMPOSITE_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionExpression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(ConditionExpression newCondition, NotificationChain msgs) {
		ConditionExpression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Emv3Package.COMPOSITE_STATE__CONDITION, oldCondition, newCondition);
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
	public void setCondition(ConditionExpression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Emv3Package.COMPOSITE_STATE__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Emv3Package.COMPOSITE_STATE__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Emv3Package.COMPOSITE_STATE__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOthers() {
		return others;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOthers(boolean newOthers) {
		boolean oldOthers = others;
		others = newOthers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Emv3Package.COMPOSITE_STATE__OTHERS, oldOthers, others));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErrorBehaviorState getState() {
		if (state != null && state.eIsProxy()) {
			InternalEObject oldState = (InternalEObject)state;
			state = (ErrorBehaviorState)eResolveProxy(oldState);
			if (state != oldState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Emv3Package.COMPOSITE_STATE__STATE, oldState, state));
			}
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorBehaviorState basicGetState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(ErrorBehaviorState newState) {
		ErrorBehaviorState oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Emv3Package.COMPOSITE_STATE__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeSet getTypedToken() {
		return typedToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypedToken(TypeSet newTypedToken, NotificationChain msgs) {
		TypeSet oldTypedToken = typedToken;
		typedToken = newTypedToken;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Emv3Package.COMPOSITE_STATE__TYPED_TOKEN, oldTypedToken, newTypedToken);
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
	public void setTypedToken(TypeSet newTypedToken) {
		if (newTypedToken != typedToken) {
			NotificationChain msgs = null;
			if (typedToken != null)
				msgs = ((InternalEObject)typedToken).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Emv3Package.COMPOSITE_STATE__TYPED_TOKEN, null, msgs);
			if (newTypedToken != null)
				msgs = ((InternalEObject)newTypedToken).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Emv3Package.COMPOSITE_STATE__TYPED_TOKEN, null, msgs);
			msgs = basicSetTypedToken(newTypedToken, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Emv3Package.COMPOSITE_STATE__TYPED_TOKEN, newTypedToken, newTypedToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Emv3Package.COMPOSITE_STATE__CONDITION:
				return basicSetCondition(null, msgs);
			case Emv3Package.COMPOSITE_STATE__TYPED_TOKEN:
				return basicSetTypedToken(null, msgs);
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
			case Emv3Package.COMPOSITE_STATE__CONDITION:
				return getCondition();
			case Emv3Package.COMPOSITE_STATE__OTHERS:
				return isOthers();
			case Emv3Package.COMPOSITE_STATE__STATE:
				if (resolve) return getState();
				return basicGetState();
			case Emv3Package.COMPOSITE_STATE__TYPED_TOKEN:
				return getTypedToken();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Emv3Package.COMPOSITE_STATE__CONDITION:
				setCondition((ConditionExpression)newValue);
				return;
			case Emv3Package.COMPOSITE_STATE__OTHERS:
				setOthers((Boolean)newValue);
				return;
			case Emv3Package.COMPOSITE_STATE__STATE:
				setState((ErrorBehaviorState)newValue);
				return;
			case Emv3Package.COMPOSITE_STATE__TYPED_TOKEN:
				setTypedToken((TypeSet)newValue);
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
			case Emv3Package.COMPOSITE_STATE__CONDITION:
				setCondition((ConditionExpression)null);
				return;
			case Emv3Package.COMPOSITE_STATE__OTHERS:
				setOthers(OTHERS_EDEFAULT);
				return;
			case Emv3Package.COMPOSITE_STATE__STATE:
				setState((ErrorBehaviorState)null);
				return;
			case Emv3Package.COMPOSITE_STATE__TYPED_TOKEN:
				setTypedToken((TypeSet)null);
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
			case Emv3Package.COMPOSITE_STATE__CONDITION:
				return condition != null;
			case Emv3Package.COMPOSITE_STATE__OTHERS:
				return others != OTHERS_EDEFAULT;
			case Emv3Package.COMPOSITE_STATE__STATE:
				return state != null;
			case Emv3Package.COMPOSITE_STATE__TYPED_TOKEN:
				return typedToken != null;
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
		result.append(" (others: ");
		result.append(others);
		result.append(')');
		return result.toString();
	}

} //CompositeStateImpl
