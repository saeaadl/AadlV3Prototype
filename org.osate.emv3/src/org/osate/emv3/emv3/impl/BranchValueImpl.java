/**
 * Copyright Text	Copyright 2018 Carnegie Mellon University. All Rights Reserved....
 */
package org.osate.emv3.emv3.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.emv3.emv3.BranchValue;
import org.osate.emv3.emv3.Emv3Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Branch Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.emv3.emv3.impl.BranchValueImpl#getRealvalue <em>Realvalue</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.impl.BranchValueImpl#isOthers <em>Others</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BranchValueImpl extends MinimalEObjectImpl.Container implements BranchValue {
	/**
	 * The default value of the '{@link #getRealvalue() <em>Realvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealvalue()
	 * @generated
	 * @ordered
	 */
	protected static final String REALVALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRealvalue() <em>Realvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealvalue()
	 * @generated
	 * @ordered
	 */
	protected String realvalue = REALVALUE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BranchValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Emv3Package.Literals.BRANCH_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRealvalue() {
		return realvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRealvalue(String newRealvalue) {
		String oldRealvalue = realvalue;
		realvalue = newRealvalue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Emv3Package.BRANCH_VALUE__REALVALUE, oldRealvalue, realvalue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Emv3Package.BRANCH_VALUE__OTHERS, oldOthers, others));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Emv3Package.BRANCH_VALUE__REALVALUE:
				return getRealvalue();
			case Emv3Package.BRANCH_VALUE__OTHERS:
				return isOthers();
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
			case Emv3Package.BRANCH_VALUE__REALVALUE:
				setRealvalue((String)newValue);
				return;
			case Emv3Package.BRANCH_VALUE__OTHERS:
				setOthers((Boolean)newValue);
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
			case Emv3Package.BRANCH_VALUE__REALVALUE:
				setRealvalue(REALVALUE_EDEFAULT);
				return;
			case Emv3Package.BRANCH_VALUE__OTHERS:
				setOthers(OTHERS_EDEFAULT);
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
			case Emv3Package.BRANCH_VALUE__REALVALUE:
				return REALVALUE_EDEFAULT == null ? realvalue != null : !REALVALUE_EDEFAULT.equals(realvalue);
			case Emv3Package.BRANCH_VALUE__OTHERS:
				return others != OTHERS_EDEFAULT;
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
		result.append(" (realvalue: ");
		result.append(realvalue);
		result.append(", others: ");
		result.append(others);
		result.append(')');
		return result.toString();
	}

} //BranchValueImpl
