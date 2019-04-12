/**
 * Copyright Text	Copyright 2018 Carnegie Mellon University. All Rights Reserved....
 */
package org.osate.emv3.emv3.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.aadlv3.aadlv3.NamedElement;

import org.osate.emv3.emv3.Emv3Package;
import org.osate.emv3.emv3.ErrorBehaviorState;
import org.osate.emv3.emv3.ErrorSource;
import org.osate.emv3.emv3.TypeSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.emv3.emv3.impl.ErrorSourceImpl#getSourceModelElement <em>Source Model Element</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.impl.ErrorSourceImpl#isAll <em>All</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.impl.ErrorSourceImpl#getFailureModeReference <em>Failure Mode Reference</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.impl.ErrorSourceImpl#getFailureModeType <em>Failure Mode Type</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.impl.ErrorSourceImpl#getFailureModeDescription <em>Failure Mode Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErrorSourceImpl extends ErrorFlowImpl implements ErrorSource {
	/**
	 * The cached value of the '{@link #getSourceModelElement() <em>Source Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceModelElement()
	 * @generated
	 * @ordered
	 */
	protected NamedElement sourceModelElement;

	/**
	 * The default value of the '{@link #isAll() <em>All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAll()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAll() <em>All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAll()
	 * @generated
	 * @ordered
	 */
	protected boolean all = ALL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFailureModeReference() <em>Failure Mode Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureModeReference()
	 * @generated
	 * @ordered
	 */
	protected ErrorBehaviorState failureModeReference;

	/**
	 * The cached value of the '{@link #getFailureModeType() <em>Failure Mode Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureModeType()
	 * @generated
	 * @ordered
	 */
	protected TypeSet failureModeType;

	/**
	 * The default value of the '{@link #getFailureModeDescription() <em>Failure Mode Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureModeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String FAILURE_MODE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFailureModeDescription() <em>Failure Mode Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureModeDescription()
	 * @generated
	 * @ordered
	 */
	protected String failureModeDescription = FAILURE_MODE_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Emv3Package.Literals.ERROR_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedElement getSourceModelElement() {
		if (sourceModelElement != null && sourceModelElement.eIsProxy()) {
			InternalEObject oldSourceModelElement = (InternalEObject)sourceModelElement;
			sourceModelElement = (NamedElement)eResolveProxy(oldSourceModelElement);
			if (sourceModelElement != oldSourceModelElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Emv3Package.ERROR_SOURCE__SOURCE_MODEL_ELEMENT, oldSourceModelElement, sourceModelElement));
			}
		}
		return sourceModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement basicGetSourceModelElement() {
		return sourceModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceModelElement(NamedElement newSourceModelElement) {
		NamedElement oldSourceModelElement = sourceModelElement;
		sourceModelElement = newSourceModelElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Emv3Package.ERROR_SOURCE__SOURCE_MODEL_ELEMENT, oldSourceModelElement, sourceModelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAll() {
		return all;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAll(boolean newAll) {
		boolean oldAll = all;
		all = newAll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Emv3Package.ERROR_SOURCE__ALL, oldAll, all));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErrorBehaviorState getFailureModeReference() {
		if (failureModeReference != null && failureModeReference.eIsProxy()) {
			InternalEObject oldFailureModeReference = (InternalEObject)failureModeReference;
			failureModeReference = (ErrorBehaviorState)eResolveProxy(oldFailureModeReference);
			if (failureModeReference != oldFailureModeReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Emv3Package.ERROR_SOURCE__FAILURE_MODE_REFERENCE, oldFailureModeReference, failureModeReference));
			}
		}
		return failureModeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorBehaviorState basicGetFailureModeReference() {
		return failureModeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFailureModeReference(ErrorBehaviorState newFailureModeReference) {
		ErrorBehaviorState oldFailureModeReference = failureModeReference;
		failureModeReference = newFailureModeReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Emv3Package.ERROR_SOURCE__FAILURE_MODE_REFERENCE, oldFailureModeReference, failureModeReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeSet getFailureModeType() {
		return failureModeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFailureModeType(TypeSet newFailureModeType, NotificationChain msgs) {
		TypeSet oldFailureModeType = failureModeType;
		failureModeType = newFailureModeType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Emv3Package.ERROR_SOURCE__FAILURE_MODE_TYPE, oldFailureModeType, newFailureModeType);
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
	public void setFailureModeType(TypeSet newFailureModeType) {
		if (newFailureModeType != failureModeType) {
			NotificationChain msgs = null;
			if (failureModeType != null)
				msgs = ((InternalEObject)failureModeType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Emv3Package.ERROR_SOURCE__FAILURE_MODE_TYPE, null, msgs);
			if (newFailureModeType != null)
				msgs = ((InternalEObject)newFailureModeType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Emv3Package.ERROR_SOURCE__FAILURE_MODE_TYPE, null, msgs);
			msgs = basicSetFailureModeType(newFailureModeType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Emv3Package.ERROR_SOURCE__FAILURE_MODE_TYPE, newFailureModeType, newFailureModeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFailureModeDescription() {
		return failureModeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFailureModeDescription(String newFailureModeDescription) {
		String oldFailureModeDescription = failureModeDescription;
		failureModeDescription = newFailureModeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Emv3Package.ERROR_SOURCE__FAILURE_MODE_DESCRIPTION, oldFailureModeDescription, failureModeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Emv3Package.ERROR_SOURCE__FAILURE_MODE_TYPE:
				return basicSetFailureModeType(null, msgs);
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
			case Emv3Package.ERROR_SOURCE__SOURCE_MODEL_ELEMENT:
				if (resolve) return getSourceModelElement();
				return basicGetSourceModelElement();
			case Emv3Package.ERROR_SOURCE__ALL:
				return isAll();
			case Emv3Package.ERROR_SOURCE__FAILURE_MODE_REFERENCE:
				if (resolve) return getFailureModeReference();
				return basicGetFailureModeReference();
			case Emv3Package.ERROR_SOURCE__FAILURE_MODE_TYPE:
				return getFailureModeType();
			case Emv3Package.ERROR_SOURCE__FAILURE_MODE_DESCRIPTION:
				return getFailureModeDescription();
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
			case Emv3Package.ERROR_SOURCE__SOURCE_MODEL_ELEMENT:
				setSourceModelElement((NamedElement)newValue);
				return;
			case Emv3Package.ERROR_SOURCE__ALL:
				setAll((Boolean)newValue);
				return;
			case Emv3Package.ERROR_SOURCE__FAILURE_MODE_REFERENCE:
				setFailureModeReference((ErrorBehaviorState)newValue);
				return;
			case Emv3Package.ERROR_SOURCE__FAILURE_MODE_TYPE:
				setFailureModeType((TypeSet)newValue);
				return;
			case Emv3Package.ERROR_SOURCE__FAILURE_MODE_DESCRIPTION:
				setFailureModeDescription((String)newValue);
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
			case Emv3Package.ERROR_SOURCE__SOURCE_MODEL_ELEMENT:
				setSourceModelElement((NamedElement)null);
				return;
			case Emv3Package.ERROR_SOURCE__ALL:
				setAll(ALL_EDEFAULT);
				return;
			case Emv3Package.ERROR_SOURCE__FAILURE_MODE_REFERENCE:
				setFailureModeReference((ErrorBehaviorState)null);
				return;
			case Emv3Package.ERROR_SOURCE__FAILURE_MODE_TYPE:
				setFailureModeType((TypeSet)null);
				return;
			case Emv3Package.ERROR_SOURCE__FAILURE_MODE_DESCRIPTION:
				setFailureModeDescription(FAILURE_MODE_DESCRIPTION_EDEFAULT);
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
			case Emv3Package.ERROR_SOURCE__SOURCE_MODEL_ELEMENT:
				return sourceModelElement != null;
			case Emv3Package.ERROR_SOURCE__ALL:
				return all != ALL_EDEFAULT;
			case Emv3Package.ERROR_SOURCE__FAILURE_MODE_REFERENCE:
				return failureModeReference != null;
			case Emv3Package.ERROR_SOURCE__FAILURE_MODE_TYPE:
				return failureModeType != null;
			case Emv3Package.ERROR_SOURCE__FAILURE_MODE_DESCRIPTION:
				return FAILURE_MODE_DESCRIPTION_EDEFAULT == null ? failureModeDescription != null : !FAILURE_MODE_DESCRIPTION_EDEFAULT.equals(failureModeDescription);
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
		result.append(" (all: ");
		result.append(all);
		result.append(", failureModeDescription: ");
		result.append(failureModeDescription);
		result.append(')');
		return result.toString();
	}

} //ErrorSourceImpl
