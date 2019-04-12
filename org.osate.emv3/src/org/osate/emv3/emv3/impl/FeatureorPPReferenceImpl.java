/**
 * Copyright Text	Copyright 2018 Carnegie Mellon University. All Rights Reserved....
 */
package org.osate.emv3.emv3.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.aadlv3.aadlv3.NamedElement;

import org.osate.emv3.emv3.Emv3Package;
import org.osate.emv3.emv3.FeatureorPPReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Featureor PP Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.emv3.emv3.impl.FeatureorPPReferenceImpl#getFeatureorPP <em>Featureor PP</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.impl.FeatureorPPReferenceImpl#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureorPPReferenceImpl extends MinimalEObjectImpl.Container implements FeatureorPPReference {
	/**
	 * The cached value of the '{@link #getFeatureorPP() <em>Featureor PP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureorPP()
	 * @generated
	 * @ordered
	 */
	protected NamedElement featureorPP;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected FeatureorPPReference next;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureorPPReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Emv3Package.Literals.FEATUREOR_PP_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedElement getFeatureorPP() {
		if (featureorPP != null && featureorPP.eIsProxy()) {
			InternalEObject oldFeatureorPP = (InternalEObject)featureorPP;
			featureorPP = (NamedElement)eResolveProxy(oldFeatureorPP);
			if (featureorPP != oldFeatureorPP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Emv3Package.FEATUREOR_PP_REFERENCE__FEATUREOR_PP, oldFeatureorPP, featureorPP));
			}
		}
		return featureorPP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement basicGetFeatureorPP() {
		return featureorPP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeatureorPP(NamedElement newFeatureorPP) {
		NamedElement oldFeatureorPP = featureorPP;
		featureorPP = newFeatureorPP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Emv3Package.FEATUREOR_PP_REFERENCE__FEATUREOR_PP, oldFeatureorPP, featureorPP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureorPPReference getNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNext(FeatureorPPReference newNext, NotificationChain msgs) {
		FeatureorPPReference oldNext = next;
		next = newNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Emv3Package.FEATUREOR_PP_REFERENCE__NEXT, oldNext, newNext);
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
	public void setNext(FeatureorPPReference newNext) {
		if (newNext != next) {
			NotificationChain msgs = null;
			if (next != null)
				msgs = ((InternalEObject)next).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Emv3Package.FEATUREOR_PP_REFERENCE__NEXT, null, msgs);
			if (newNext != null)
				msgs = ((InternalEObject)newNext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Emv3Package.FEATUREOR_PP_REFERENCE__NEXT, null, msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Emv3Package.FEATUREOR_PP_REFERENCE__NEXT, newNext, newNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Emv3Package.FEATUREOR_PP_REFERENCE__NEXT:
				return basicSetNext(null, msgs);
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
			case Emv3Package.FEATUREOR_PP_REFERENCE__FEATUREOR_PP:
				if (resolve) return getFeatureorPP();
				return basicGetFeatureorPP();
			case Emv3Package.FEATUREOR_PP_REFERENCE__NEXT:
				return getNext();
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
			case Emv3Package.FEATUREOR_PP_REFERENCE__FEATUREOR_PP:
				setFeatureorPP((NamedElement)newValue);
				return;
			case Emv3Package.FEATUREOR_PP_REFERENCE__NEXT:
				setNext((FeatureorPPReference)newValue);
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
			case Emv3Package.FEATUREOR_PP_REFERENCE__FEATUREOR_PP:
				setFeatureorPP((NamedElement)null);
				return;
			case Emv3Package.FEATUREOR_PP_REFERENCE__NEXT:
				setNext((FeatureorPPReference)null);
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
			case Emv3Package.FEATUREOR_PP_REFERENCE__FEATUREOR_PP:
				return featureorPP != null;
			case Emv3Package.FEATUREOR_PP_REFERENCE__NEXT:
				return next != null;
		}
		return super.eIsSet(featureID);
	}

} //FeatureorPPReferenceImpl
