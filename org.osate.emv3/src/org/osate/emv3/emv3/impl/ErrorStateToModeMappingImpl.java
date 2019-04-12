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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.osate.aadlv3.aadlv3.Mode;

import org.osate.emv3.emv3.Emv3Package;
import org.osate.emv3.emv3.ErrorBehaviorState;
import org.osate.emv3.emv3.ErrorStateToModeMapping;
import org.osate.emv3.emv3.TypeSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error State To Mode Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.emv3.emv3.impl.ErrorStateToModeMappingImpl#getErrorState <em>Error State</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.impl.ErrorStateToModeMappingImpl#getTypeToken <em>Type Token</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.impl.ErrorStateToModeMappingImpl#getMappedModes <em>Mapped Modes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErrorStateToModeMappingImpl extends MinimalEObjectImpl.Container implements ErrorStateToModeMapping {
	/**
	 * The cached value of the '{@link #getErrorState() <em>Error State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorState()
	 * @generated
	 * @ordered
	 */
	protected ErrorBehaviorState errorState;

	/**
	 * The cached value of the '{@link #getTypeToken() <em>Type Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeToken()
	 * @generated
	 * @ordered
	 */
	protected TypeSet typeToken;

	/**
	 * The cached value of the '{@link #getMappedModes() <em>Mapped Modes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedModes()
	 * @generated
	 * @ordered
	 */
	protected EList<Mode> mappedModes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorStateToModeMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Emv3Package.Literals.ERROR_STATE_TO_MODE_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErrorBehaviorState getErrorState() {
		if (errorState != null && errorState.eIsProxy()) {
			InternalEObject oldErrorState = (InternalEObject)errorState;
			errorState = (ErrorBehaviorState)eResolveProxy(oldErrorState);
			if (errorState != oldErrorState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Emv3Package.ERROR_STATE_TO_MODE_MAPPING__ERROR_STATE, oldErrorState, errorState));
			}
		}
		return errorState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorBehaviorState basicGetErrorState() {
		return errorState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorState(ErrorBehaviorState newErrorState) {
		ErrorBehaviorState oldErrorState = errorState;
		errorState = newErrorState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Emv3Package.ERROR_STATE_TO_MODE_MAPPING__ERROR_STATE, oldErrorState, errorState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeSet getTypeToken() {
		return typeToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeToken(TypeSet newTypeToken, NotificationChain msgs) {
		TypeSet oldTypeToken = typeToken;
		typeToken = newTypeToken;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Emv3Package.ERROR_STATE_TO_MODE_MAPPING__TYPE_TOKEN, oldTypeToken, newTypeToken);
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
	public void setTypeToken(TypeSet newTypeToken) {
		if (newTypeToken != typeToken) {
			NotificationChain msgs = null;
			if (typeToken != null)
				msgs = ((InternalEObject)typeToken).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Emv3Package.ERROR_STATE_TO_MODE_MAPPING__TYPE_TOKEN, null, msgs);
			if (newTypeToken != null)
				msgs = ((InternalEObject)newTypeToken).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Emv3Package.ERROR_STATE_TO_MODE_MAPPING__TYPE_TOKEN, null, msgs);
			msgs = basicSetTypeToken(newTypeToken, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Emv3Package.ERROR_STATE_TO_MODE_MAPPING__TYPE_TOKEN, newTypeToken, newTypeToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Mode> getMappedModes() {
		if (mappedModes == null) {
			mappedModes = new EObjectResolvingEList<Mode>(Mode.class, this, Emv3Package.ERROR_STATE_TO_MODE_MAPPING__MAPPED_MODES);
		}
		return mappedModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Emv3Package.ERROR_STATE_TO_MODE_MAPPING__TYPE_TOKEN:
				return basicSetTypeToken(null, msgs);
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
			case Emv3Package.ERROR_STATE_TO_MODE_MAPPING__ERROR_STATE:
				if (resolve) return getErrorState();
				return basicGetErrorState();
			case Emv3Package.ERROR_STATE_TO_MODE_MAPPING__TYPE_TOKEN:
				return getTypeToken();
			case Emv3Package.ERROR_STATE_TO_MODE_MAPPING__MAPPED_MODES:
				return getMappedModes();
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
			case Emv3Package.ERROR_STATE_TO_MODE_MAPPING__ERROR_STATE:
				setErrorState((ErrorBehaviorState)newValue);
				return;
			case Emv3Package.ERROR_STATE_TO_MODE_MAPPING__TYPE_TOKEN:
				setTypeToken((TypeSet)newValue);
				return;
			case Emv3Package.ERROR_STATE_TO_MODE_MAPPING__MAPPED_MODES:
				getMappedModes().clear();
				getMappedModes().addAll((Collection<? extends Mode>)newValue);
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
			case Emv3Package.ERROR_STATE_TO_MODE_MAPPING__ERROR_STATE:
				setErrorState((ErrorBehaviorState)null);
				return;
			case Emv3Package.ERROR_STATE_TO_MODE_MAPPING__TYPE_TOKEN:
				setTypeToken((TypeSet)null);
				return;
			case Emv3Package.ERROR_STATE_TO_MODE_MAPPING__MAPPED_MODES:
				getMappedModes().clear();
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
			case Emv3Package.ERROR_STATE_TO_MODE_MAPPING__ERROR_STATE:
				return errorState != null;
			case Emv3Package.ERROR_STATE_TO_MODE_MAPPING__TYPE_TOKEN:
				return typeToken != null;
			case Emv3Package.ERROR_STATE_TO_MODE_MAPPING__MAPPED_MODES:
				return mappedModes != null && !mappedModes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ErrorStateToModeMappingImpl
