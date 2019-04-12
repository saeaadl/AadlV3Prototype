/**
 * Copyright Text	Copyright 2018 Carnegie Mellon University. All Rights Reserved....
 */
package org.osate.emv3.emv3.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.osate.aadlv3.aadlv3.NamedElement;

import org.osate.emv3.emv3.Emv3Package;
import org.osate.emv3.emv3.IfCondition;
import org.osate.emv3.emv3.RecoverEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recover Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.emv3.emv3.impl.RecoverEventImpl#getEventInitiator <em>Event Initiator</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.impl.RecoverEventImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecoverEventImpl extends ErrorBehaviorEventImpl implements RecoverEvent {
	/**
	 * The cached value of the '{@link #getEventInitiator() <em>Event Initiator</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventInitiator()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement> eventInitiator;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected IfCondition condition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecoverEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Emv3Package.Literals.RECOVER_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedElement> getEventInitiator() {
		if (eventInitiator == null) {
			eventInitiator = new EObjectResolvingEList<NamedElement>(NamedElement.class, this, Emv3Package.RECOVER_EVENT__EVENT_INITIATOR);
		}
		return eventInitiator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfCondition getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(IfCondition newCondition, NotificationChain msgs) {
		IfCondition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Emv3Package.RECOVER_EVENT__CONDITION, oldCondition, newCondition);
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
	public void setCondition(IfCondition newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Emv3Package.RECOVER_EVENT__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Emv3Package.RECOVER_EVENT__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Emv3Package.RECOVER_EVENT__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Emv3Package.RECOVER_EVENT__CONDITION:
				return basicSetCondition(null, msgs);
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
			case Emv3Package.RECOVER_EVENT__EVENT_INITIATOR:
				return getEventInitiator();
			case Emv3Package.RECOVER_EVENT__CONDITION:
				return getCondition();
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
			case Emv3Package.RECOVER_EVENT__EVENT_INITIATOR:
				getEventInitiator().clear();
				getEventInitiator().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case Emv3Package.RECOVER_EVENT__CONDITION:
				setCondition((IfCondition)newValue);
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
			case Emv3Package.RECOVER_EVENT__EVENT_INITIATOR:
				getEventInitiator().clear();
				return;
			case Emv3Package.RECOVER_EVENT__CONDITION:
				setCondition((IfCondition)null);
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
			case Emv3Package.RECOVER_EVENT__EVENT_INITIATOR:
				return eventInitiator != null && !eventInitiator.isEmpty();
			case Emv3Package.RECOVER_EVENT__CONDITION:
				return condition != null;
		}
		return super.eIsSet(featureID);
	}

} //RecoverEventImpl
