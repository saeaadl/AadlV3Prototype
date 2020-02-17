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

import static org.osate.aadlv3.util.AIv3API.getInstanceObjectPath;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.osate.aadlv3.aadlv3.StateVariable;

import org.osate.av3instance.av3instance.Av3instancePackage;
import org.osate.av3instance.av3instance.StateInstance;
import org.osate.av3instance.av3instance.StateVariableInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Variable Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.av3instance.av3instance.impl.StateVariableInstanceImpl#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.StateVariableInstanceImpl#getStateVariable <em>State Variable</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.StateVariableInstanceImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateVariableInstanceImpl extends InstanceObjectImpl implements StateVariableInstance {
	/**
	 * The cached value of the '{@link #getCurrentState() <em>Current State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentState()
	 * @generated
	 * @ordered
	 */
	protected StateInstance currentState;

	/**
	 * The cached value of the '{@link #getStateVariable() <em>State Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateVariable()
	 * @generated
	 * @ordered
	 */
	protected StateVariable stateVariable;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<StateInstance> states;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateVariableInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Av3instancePackage.Literals.STATE_VARIABLE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateInstance getCurrentState() {
		if (currentState != null && currentState.eIsProxy()) {
			InternalEObject oldCurrentState = (InternalEObject) currentState;
			currentState = (StateInstance) eResolveProxy(oldCurrentState);
			if (currentState != oldCurrentState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Av3instancePackage.STATE_VARIABLE_INSTANCE__CURRENT_STATE, oldCurrentState, currentState));
			}
		}
		return currentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateInstance basicGetCurrentState() {
		return currentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentState(StateInstance newCurrentState) {
		StateInstance oldCurrentState = currentState;
		currentState = newCurrentState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Av3instancePackage.STATE_VARIABLE_INSTANCE__CURRENT_STATE, oldCurrentState, currentState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateVariable getStateVariable() {
		if (stateVariable != null && stateVariable.eIsProxy()) {
			InternalEObject oldStateVariable = (InternalEObject) stateVariable;
			stateVariable = (StateVariable) eResolveProxy(oldStateVariable);
			if (stateVariable != oldStateVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Av3instancePackage.STATE_VARIABLE_INSTANCE__STATE_VARIABLE, oldStateVariable,
							stateVariable));
			}
		}
		return stateVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateVariable basicGetStateVariable() {
		return stateVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStateVariable(StateVariable newStateVariable) {
		StateVariable oldStateVariable = stateVariable;
		stateVariable = newStateVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Av3instancePackage.STATE_VARIABLE_INSTANCE__STATE_VARIABLE, oldStateVariable, stateVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StateInstance> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<StateInstance>(StateInstance.class, this,
					Av3instancePackage.STATE_VARIABLE_INSTANCE__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Av3instancePackage.STATE_VARIABLE_INSTANCE__STATES:
			return ((InternalEList<?>) getStates()).basicRemove(otherEnd, msgs);
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
		case Av3instancePackage.STATE_VARIABLE_INSTANCE__CURRENT_STATE:
			if (resolve)
				return getCurrentState();
			return basicGetCurrentState();
		case Av3instancePackage.STATE_VARIABLE_INSTANCE__STATE_VARIABLE:
			if (resolve)
				return getStateVariable();
			return basicGetStateVariable();
		case Av3instancePackage.STATE_VARIABLE_INSTANCE__STATES:
			return getStates();
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
		case Av3instancePackage.STATE_VARIABLE_INSTANCE__CURRENT_STATE:
			setCurrentState((StateInstance) newValue);
			return;
		case Av3instancePackage.STATE_VARIABLE_INSTANCE__STATE_VARIABLE:
			setStateVariable((StateVariable) newValue);
			return;
		case Av3instancePackage.STATE_VARIABLE_INSTANCE__STATES:
			getStates().clear();
			getStates().addAll((Collection<? extends StateInstance>) newValue);
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
		case Av3instancePackage.STATE_VARIABLE_INSTANCE__CURRENT_STATE:
			setCurrentState((StateInstance) null);
			return;
		case Av3instancePackage.STATE_VARIABLE_INSTANCE__STATE_VARIABLE:
			setStateVariable((StateVariable) null);
			return;
		case Av3instancePackage.STATE_VARIABLE_INSTANCE__STATES:
			getStates().clear();
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
		case Av3instancePackage.STATE_VARIABLE_INSTANCE__CURRENT_STATE:
			return currentState != null;
		case Av3instancePackage.STATE_VARIABLE_INSTANCE__STATE_VARIABLE:
			return stateVariable != null;
		case Av3instancePackage.STATE_VARIABLE_INSTANCE__STATES:
			return states != null && !states.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		String result = "State " + getInstanceObjectPath(this) + getCurrentState()!=null?": "+ getCurrentState().toString():"";
		return result;
	}

} //StateVariableInstanceImpl
