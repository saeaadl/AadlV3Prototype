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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadlv3.aadlv3.impl.NamedElementImpl;

import org.osate.emv3.emv3.EMV2Root;
import org.osate.emv3.emv3.Emv3Package;
import org.osate.emv3.emv3.ErrorModelLibrary;
import org.osate.emv3.emv3.ErrorModelSubclause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMV2 Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.emv3.emv3.impl.EMV2RootImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.impl.EMV2RootImpl#getSubclauses <em>Subclauses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EMV2RootImpl extends NamedElementImpl implements EMV2Root {
	/**
	 * The cached value of the '{@link #getLibrary() <em>Library</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected ErrorModelLibrary library;

	/**
	 * The cached value of the '{@link #getSubclauses() <em>Subclauses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubclauses()
	 * @generated
	 * @ordered
	 */
	protected EList<ErrorModelSubclause> subclauses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMV2RootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Emv3Package.Literals.EMV2_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErrorModelLibrary getLibrary() {
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLibrary(ErrorModelLibrary newLibrary, NotificationChain msgs) {
		ErrorModelLibrary oldLibrary = library;
		library = newLibrary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Emv3Package.EMV2_ROOT__LIBRARY, oldLibrary, newLibrary);
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
	public void setLibrary(ErrorModelLibrary newLibrary) {
		if (newLibrary != library) {
			NotificationChain msgs = null;
			if (library != null)
				msgs = ((InternalEObject)library).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Emv3Package.EMV2_ROOT__LIBRARY, null, msgs);
			if (newLibrary != null)
				msgs = ((InternalEObject)newLibrary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Emv3Package.EMV2_ROOT__LIBRARY, null, msgs);
			msgs = basicSetLibrary(newLibrary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Emv3Package.EMV2_ROOT__LIBRARY, newLibrary, newLibrary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ErrorModelSubclause> getSubclauses() {
		if (subclauses == null) {
			subclauses = new EObjectContainmentEList<ErrorModelSubclause>(ErrorModelSubclause.class, this, Emv3Package.EMV2_ROOT__SUBCLAUSES);
		}
		return subclauses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Emv3Package.EMV2_ROOT__LIBRARY:
				return basicSetLibrary(null, msgs);
			case Emv3Package.EMV2_ROOT__SUBCLAUSES:
				return ((InternalEList<?>)getSubclauses()).basicRemove(otherEnd, msgs);
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
			case Emv3Package.EMV2_ROOT__LIBRARY:
				return getLibrary();
			case Emv3Package.EMV2_ROOT__SUBCLAUSES:
				return getSubclauses();
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
			case Emv3Package.EMV2_ROOT__LIBRARY:
				setLibrary((ErrorModelLibrary)newValue);
				return;
			case Emv3Package.EMV2_ROOT__SUBCLAUSES:
				getSubclauses().clear();
				getSubclauses().addAll((Collection<? extends ErrorModelSubclause>)newValue);
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
			case Emv3Package.EMV2_ROOT__LIBRARY:
				setLibrary((ErrorModelLibrary)null);
				return;
			case Emv3Package.EMV2_ROOT__SUBCLAUSES:
				getSubclauses().clear();
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
			case Emv3Package.EMV2_ROOT__LIBRARY:
				return library != null;
			case Emv3Package.EMV2_ROOT__SUBCLAUSES:
				return subclauses != null && !subclauses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EMV2RootImpl
