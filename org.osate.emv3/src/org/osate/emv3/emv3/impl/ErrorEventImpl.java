/**
 * Copyright Text	Copyright 2018 Carnegie Mellon University. All Rights Reserved....
 */
package org.osate.emv3.emv3.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.emv3.emv3.Emv3Package;
import org.osate.emv3.emv3.ErrorEvent;
import org.osate.emv3.emv3.IfCondition;
import org.osate.emv3.emv3.TypeSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.emv3.emv3.impl.ErrorEventImpl#getTypeSet <em>Type Set</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.impl.ErrorEventImpl#getEventcondition <em>Eventcondition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErrorEventImpl extends ErrorBehaviorEventImpl implements ErrorEvent {
	/**
	 * The cached value of the '{@link #getTypeSet() <em>Type Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeSet()
	 * @generated
	 * @ordered
	 */
	protected TypeSet typeSet;

	/**
	 * The cached value of the '{@link #getEventcondition() <em>Eventcondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventcondition()
	 * @generated
	 * @ordered
	 */
	protected IfCondition eventcondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Emv3Package.Literals.ERROR_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeSet getTypeSet() {
		return typeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeSet(TypeSet newTypeSet, NotificationChain msgs) {
		TypeSet oldTypeSet = typeSet;
		typeSet = newTypeSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Emv3Package.ERROR_EVENT__TYPE_SET, oldTypeSet, newTypeSet);
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
	public void setTypeSet(TypeSet newTypeSet) {
		if (newTypeSet != typeSet) {
			NotificationChain msgs = null;
			if (typeSet != null)
				msgs = ((InternalEObject)typeSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Emv3Package.ERROR_EVENT__TYPE_SET, null, msgs);
			if (newTypeSet != null)
				msgs = ((InternalEObject)newTypeSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Emv3Package.ERROR_EVENT__TYPE_SET, null, msgs);
			msgs = basicSetTypeSet(newTypeSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Emv3Package.ERROR_EVENT__TYPE_SET, newTypeSet, newTypeSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfCondition getEventcondition() {
		return eventcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventcondition(IfCondition newEventcondition, NotificationChain msgs) {
		IfCondition oldEventcondition = eventcondition;
		eventcondition = newEventcondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Emv3Package.ERROR_EVENT__EVENTCONDITION, oldEventcondition, newEventcondition);
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
	public void setEventcondition(IfCondition newEventcondition) {
		if (newEventcondition != eventcondition) {
			NotificationChain msgs = null;
			if (eventcondition != null)
				msgs = ((InternalEObject)eventcondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Emv3Package.ERROR_EVENT__EVENTCONDITION, null, msgs);
			if (newEventcondition != null)
				msgs = ((InternalEObject)newEventcondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Emv3Package.ERROR_EVENT__EVENTCONDITION, null, msgs);
			msgs = basicSetEventcondition(newEventcondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Emv3Package.ERROR_EVENT__EVENTCONDITION, newEventcondition, newEventcondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Emv3Package.ERROR_EVENT__TYPE_SET:
				return basicSetTypeSet(null, msgs);
			case Emv3Package.ERROR_EVENT__EVENTCONDITION:
				return basicSetEventcondition(null, msgs);
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
			case Emv3Package.ERROR_EVENT__TYPE_SET:
				return getTypeSet();
			case Emv3Package.ERROR_EVENT__EVENTCONDITION:
				return getEventcondition();
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
			case Emv3Package.ERROR_EVENT__TYPE_SET:
				setTypeSet((TypeSet)newValue);
				return;
			case Emv3Package.ERROR_EVENT__EVENTCONDITION:
				setEventcondition((IfCondition)newValue);
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
			case Emv3Package.ERROR_EVENT__TYPE_SET:
				setTypeSet((TypeSet)null);
				return;
			case Emv3Package.ERROR_EVENT__EVENTCONDITION:
				setEventcondition((IfCondition)null);
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
			case Emv3Package.ERROR_EVENT__TYPE_SET:
				return typeSet != null;
			case Emv3Package.ERROR_EVENT__EVENTCONDITION:
				return eventcondition != null;
		}
		return super.eIsSet(featureID);
	}

} //ErrorEventImpl
