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
package org.osate.aadlv3.aadlv3.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.aadlv3.aadlv3.Aadlv3Package;
import org.osate.aadlv3.aadlv3.EnumerationLiteral;
import org.osate.aadlv3.aadlv3.StateVariable;
import org.osate.aadlv3.aadlv3.TypeDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.StateVariableImpl#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.StateVariableImpl#getStateType <em>State Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateVariableImpl extends ModelElementImpl implements StateVariable {
	/**
	 * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
	protected EnumerationLiteral initialState;

	/**
	 * The cached value of the '{@link #getStateType() <em>State Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateType()
	 * @generated
	 * @ordered
	 */
	protected TypeDef stateType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadlv3Package.Literals.STATE_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumerationLiteral getInitialState() {
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialState(EnumerationLiteral newInitialState, NotificationChain msgs) {
		EnumerationLiteral oldInitialState = initialState;
		initialState = newInitialState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Aadlv3Package.STATE_VARIABLE__INITIAL_STATE, oldInitialState, newInitialState);
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
	public void setInitialState(EnumerationLiteral newInitialState) {
		if (newInitialState != initialState) {
			NotificationChain msgs = null;
			if (initialState != null)
				msgs = ((InternalEObject) initialState).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Aadlv3Package.STATE_VARIABLE__INITIAL_STATE, null, msgs);
			if (newInitialState != null)
				msgs = ((InternalEObject) newInitialState).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Aadlv3Package.STATE_VARIABLE__INITIAL_STATE, null, msgs);
			msgs = basicSetInitialState(newInitialState, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadlv3Package.STATE_VARIABLE__INITIAL_STATE,
					newInitialState, newInitialState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeDef getStateType() {
		if (stateType != null && stateType.eIsProxy()) {
			InternalEObject oldStateType = (InternalEObject) stateType;
			stateType = (TypeDef) eResolveProxy(oldStateType);
			if (stateType != oldStateType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadlv3Package.STATE_VARIABLE__STATE_TYPE,
							oldStateType, stateType));
			}
		}
		return stateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDef basicGetStateType() {
		return stateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStateType(TypeDef newStateType) {
		TypeDef oldStateType = stateType;
		stateType = newStateType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadlv3Package.STATE_VARIABLE__STATE_TYPE,
					oldStateType, stateType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Aadlv3Package.STATE_VARIABLE__INITIAL_STATE:
			return basicSetInitialState(null, msgs);
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
		case Aadlv3Package.STATE_VARIABLE__INITIAL_STATE:
			return getInitialState();
		case Aadlv3Package.STATE_VARIABLE__STATE_TYPE:
			if (resolve)
				return getStateType();
			return basicGetStateType();
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
		case Aadlv3Package.STATE_VARIABLE__INITIAL_STATE:
			setInitialState((EnumerationLiteral) newValue);
			return;
		case Aadlv3Package.STATE_VARIABLE__STATE_TYPE:
			setStateType((TypeDef) newValue);
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
		case Aadlv3Package.STATE_VARIABLE__INITIAL_STATE:
			setInitialState((EnumerationLiteral) null);
			return;
		case Aadlv3Package.STATE_VARIABLE__STATE_TYPE:
			setStateType((TypeDef) null);
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
		case Aadlv3Package.STATE_VARIABLE__INITIAL_STATE:
			return initialState != null;
		case Aadlv3Package.STATE_VARIABLE__STATE_TYPE:
			return stateType != null;
		}
		return super.eIsSet(featureID);
	}

} //StateVariableImpl
