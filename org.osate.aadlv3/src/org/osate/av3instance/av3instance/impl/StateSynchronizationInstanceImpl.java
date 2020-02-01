/**
 * Copyright 2018 Carnegie Mellon University. All Rights Reserved.
 * 
 * NO WARRANTY. THIS CARNEGIE MELLON UNIVERSITY AND SOFTWARE ENGINEERING INSTITUTE
 * MATERIAL IS FURNISHED ON AN "AS-IS" BASIS. CARNEGIE MELLON UNIVERSITY MAKES NO
 * WARRANTIES OF ANY KIND, EITHER EXPRESSED OR IMPLIED, AS TO ANY MATTER INCLUDING,
 * BUT NOT LIMITED TO, WARRANTY OF FITNESS FOR PURPOSE OR MERCHANTABILITY,
 * EXCLUSIVITY, OR RESULTS OBTAINED FROM USE OF THE MATERIAL. CARNEGIE MELLON
 * UNIVERSITY DOES NOT MAKE ANY WARRANTY OF ANY KIND WITH RESPECT TO FREEDOM FROM
 * PATENT, TRADEMARK, OR COPYRIGHT INFRINGEMENT.
 * 
 * Released under the Eclipse Public License (http://www.eclipse.org/org/documents/epl-v10.php)
 * 
 * See COPYRIGHT file for full details.
 */
package org.osate.av3instance.av3instance.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.aadlv3.aadlv3.Literal;
import org.osate.aadlv3.aadlv3.StateSynchronization;

import org.osate.av3instance.av3instance.Av3instancePackage;
import org.osate.av3instance.av3instance.StateInstance;
import org.osate.av3instance.av3instance.StateSynchronizationInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Synchronization Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.av3instance.av3instance.impl.StateSynchronizationInstanceImpl#getStateSynchronization <em>State Synchronization</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.StateSynchronizationInstanceImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.StateSynchronizationInstanceImpl#getTargetState <em>Target State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateSynchronizationInstanceImpl extends InstanceObjectImpl implements StateSynchronizationInstance {
	/**
	 * The cached value of the '{@link #getStateSynchronization() <em>State Synchronization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateSynchronization()
	 * @generated
	 * @ordered
	 */
	protected StateSynchronization stateSynchronization;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Literal condition;

	/**
	 * The cached value of the '{@link #getTargetState() <em>Target State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetState()
	 * @generated
	 * @ordered
	 */
	protected StateInstance targetState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateSynchronizationInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Av3instancePackage.Literals.STATE_SYNCHRONIZATION_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateSynchronization getStateSynchronization() {
		if (stateSynchronization != null && stateSynchronization.eIsProxy()) {
			InternalEObject oldStateSynchronization = (InternalEObject) stateSynchronization;
			stateSynchronization = (StateSynchronization) eResolveProxy(oldStateSynchronization);
			if (stateSynchronization != oldStateSynchronization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Av3instancePackage.STATE_SYNCHRONIZATION_INSTANCE__STATE_SYNCHRONIZATION,
							oldStateSynchronization, stateSynchronization));
			}
		}
		return stateSynchronization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateSynchronization basicGetStateSynchronization() {
		return stateSynchronization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStateSynchronization(StateSynchronization newStateSynchronization) {
		StateSynchronization oldStateSynchronization = stateSynchronization;
		stateSynchronization = newStateSynchronization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Av3instancePackage.STATE_SYNCHRONIZATION_INSTANCE__STATE_SYNCHRONIZATION, oldStateSynchronization,
					stateSynchronization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Literal getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Literal newCondition, NotificationChain msgs) {
		Literal oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Av3instancePackage.STATE_SYNCHRONIZATION_INSTANCE__CONDITION, oldCondition, newCondition);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(Literal newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject) condition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Av3instancePackage.STATE_SYNCHRONIZATION_INSTANCE__CONDITION, null,
						msgs);
			if (newCondition != null)
				msgs = ((InternalEObject) newCondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Av3instancePackage.STATE_SYNCHRONIZATION_INSTANCE__CONDITION, null,
						msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Av3instancePackage.STATE_SYNCHRONIZATION_INSTANCE__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateInstance getTargetState() {
		if (targetState != null && targetState.eIsProxy()) {
			InternalEObject oldTargetState = (InternalEObject) targetState;
			targetState = (StateInstance) eResolveProxy(oldTargetState);
			if (targetState != oldTargetState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Av3instancePackage.STATE_SYNCHRONIZATION_INSTANCE__TARGET_STATE, oldTargetState,
							targetState));
			}
		}
		return targetState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateInstance basicGetTargetState() {
		return targetState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetState(StateInstance newTargetState) {
		StateInstance oldTargetState = targetState;
		targetState = newTargetState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Av3instancePackage.STATE_SYNCHRONIZATION_INSTANCE__TARGET_STATE, oldTargetState, targetState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Av3instancePackage.STATE_SYNCHRONIZATION_INSTANCE__CONDITION:
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
		case Av3instancePackage.STATE_SYNCHRONIZATION_INSTANCE__STATE_SYNCHRONIZATION:
			if (resolve)
				return getStateSynchronization();
			return basicGetStateSynchronization();
		case Av3instancePackage.STATE_SYNCHRONIZATION_INSTANCE__CONDITION:
			return getCondition();
		case Av3instancePackage.STATE_SYNCHRONIZATION_INSTANCE__TARGET_STATE:
			if (resolve)
				return getTargetState();
			return basicGetTargetState();
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
		case Av3instancePackage.STATE_SYNCHRONIZATION_INSTANCE__STATE_SYNCHRONIZATION:
			setStateSynchronization((StateSynchronization) newValue);
			return;
		case Av3instancePackage.STATE_SYNCHRONIZATION_INSTANCE__CONDITION:
			setCondition((Literal) newValue);
			return;
		case Av3instancePackage.STATE_SYNCHRONIZATION_INSTANCE__TARGET_STATE:
			setTargetState((StateInstance) newValue);
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
		case Av3instancePackage.STATE_SYNCHRONIZATION_INSTANCE__STATE_SYNCHRONIZATION:
			setStateSynchronization((StateSynchronization) null);
			return;
		case Av3instancePackage.STATE_SYNCHRONIZATION_INSTANCE__CONDITION:
			setCondition((Literal) null);
			return;
		case Av3instancePackage.STATE_SYNCHRONIZATION_INSTANCE__TARGET_STATE:
			setTargetState((StateInstance) null);
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
		case Av3instancePackage.STATE_SYNCHRONIZATION_INSTANCE__STATE_SYNCHRONIZATION:
			return stateSynchronization != null;
		case Av3instancePackage.STATE_SYNCHRONIZATION_INSTANCE__CONDITION:
			return condition != null;
		case Av3instancePackage.STATE_SYNCHRONIZATION_INSTANCE__TARGET_STATE:
			return targetState != null;
		}
		return super.eIsSet(featureID);
	}

} //StateSynchronizationInstanceImpl
