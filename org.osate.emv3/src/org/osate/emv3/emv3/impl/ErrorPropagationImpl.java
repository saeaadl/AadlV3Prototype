/**
 * Copyright Text	Copyright 2018 Carnegie Mellon University. All Rights Reserved....
 */
package org.osate.emv3.emv3.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.aadlv3.aadlv3.FeatureDirection;

import org.osate.aadlv3.aadlv3.impl.NamedElementImpl;

import org.osate.emv3.emv3.Emv3Package;
import org.osate.emv3.emv3.ErrorPropagation;
import org.osate.emv3.emv3.FeatureorPPReference;
import org.osate.emv3.emv3.TypeSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Propagation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.emv3.emv3.impl.ErrorPropagationImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.impl.ErrorPropagationImpl#getFeatureorPPRef <em>Featureor PP Ref</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.impl.ErrorPropagationImpl#isNot <em>Not</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.impl.ErrorPropagationImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.impl.ErrorPropagationImpl#getTypeSet <em>Type Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErrorPropagationImpl extends NamedElementImpl implements ErrorPropagation {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final String KIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected String kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeatureorPPRef() <em>Featureor PP Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureorPPRef()
	 * @generated
	 * @ordered
	 */
	protected FeatureorPPReference featureorPPRef;

	/**
	 * The default value of the '{@link #isNot() <em>Not</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NOT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNot() <em>Not</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNot()
	 * @generated
	 * @ordered
	 */
	protected boolean not = NOT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final FeatureDirection DIRECTION_EDEFAULT = FeatureDirection.NONE;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected FeatureDirection direction = DIRECTION_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorPropagationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Emv3Package.Literals.ERROR_PROPAGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(String newKind) {
		String oldKind = kind;
		kind = newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Emv3Package.ERROR_PROPAGATION__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureorPPReference getFeatureorPPRef() {
		return featureorPPRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureorPPRef(FeatureorPPReference newFeatureorPPRef, NotificationChain msgs) {
		FeatureorPPReference oldFeatureorPPRef = featureorPPRef;
		featureorPPRef = newFeatureorPPRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Emv3Package.ERROR_PROPAGATION__FEATUREOR_PP_REF, oldFeatureorPPRef, newFeatureorPPRef);
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
	public void setFeatureorPPRef(FeatureorPPReference newFeatureorPPRef) {
		if (newFeatureorPPRef != featureorPPRef) {
			NotificationChain msgs = null;
			if (featureorPPRef != null)
				msgs = ((InternalEObject)featureorPPRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Emv3Package.ERROR_PROPAGATION__FEATUREOR_PP_REF, null, msgs);
			if (newFeatureorPPRef != null)
				msgs = ((InternalEObject)newFeatureorPPRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Emv3Package.ERROR_PROPAGATION__FEATUREOR_PP_REF, null, msgs);
			msgs = basicSetFeatureorPPRef(newFeatureorPPRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Emv3Package.ERROR_PROPAGATION__FEATUREOR_PP_REF, newFeatureorPPRef, newFeatureorPPRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNot() {
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNot(boolean newNot) {
		boolean oldNot = not;
		not = newNot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Emv3Package.ERROR_PROPAGATION__NOT, oldNot, not));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureDirection getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirection(FeatureDirection newDirection) {
		FeatureDirection oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Emv3Package.ERROR_PROPAGATION__DIRECTION, oldDirection, direction));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Emv3Package.ERROR_PROPAGATION__TYPE_SET, oldTypeSet, newTypeSet);
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
				msgs = ((InternalEObject)typeSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Emv3Package.ERROR_PROPAGATION__TYPE_SET, null, msgs);
			if (newTypeSet != null)
				msgs = ((InternalEObject)newTypeSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Emv3Package.ERROR_PROPAGATION__TYPE_SET, null, msgs);
			msgs = basicSetTypeSet(newTypeSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Emv3Package.ERROR_PROPAGATION__TYPE_SET, newTypeSet, newTypeSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Emv3Package.ERROR_PROPAGATION__FEATUREOR_PP_REF:
				return basicSetFeatureorPPRef(null, msgs);
			case Emv3Package.ERROR_PROPAGATION__TYPE_SET:
				return basicSetTypeSet(null, msgs);
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
			case Emv3Package.ERROR_PROPAGATION__KIND:
				return getKind();
			case Emv3Package.ERROR_PROPAGATION__FEATUREOR_PP_REF:
				return getFeatureorPPRef();
			case Emv3Package.ERROR_PROPAGATION__NOT:
				return isNot();
			case Emv3Package.ERROR_PROPAGATION__DIRECTION:
				return getDirection();
			case Emv3Package.ERROR_PROPAGATION__TYPE_SET:
				return getTypeSet();
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
			case Emv3Package.ERROR_PROPAGATION__KIND:
				setKind((String)newValue);
				return;
			case Emv3Package.ERROR_PROPAGATION__FEATUREOR_PP_REF:
				setFeatureorPPRef((FeatureorPPReference)newValue);
				return;
			case Emv3Package.ERROR_PROPAGATION__NOT:
				setNot((Boolean)newValue);
				return;
			case Emv3Package.ERROR_PROPAGATION__DIRECTION:
				setDirection((FeatureDirection)newValue);
				return;
			case Emv3Package.ERROR_PROPAGATION__TYPE_SET:
				setTypeSet((TypeSet)newValue);
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
			case Emv3Package.ERROR_PROPAGATION__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case Emv3Package.ERROR_PROPAGATION__FEATUREOR_PP_REF:
				setFeatureorPPRef((FeatureorPPReference)null);
				return;
			case Emv3Package.ERROR_PROPAGATION__NOT:
				setNot(NOT_EDEFAULT);
				return;
			case Emv3Package.ERROR_PROPAGATION__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case Emv3Package.ERROR_PROPAGATION__TYPE_SET:
				setTypeSet((TypeSet)null);
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
			case Emv3Package.ERROR_PROPAGATION__KIND:
				return KIND_EDEFAULT == null ? kind != null : !KIND_EDEFAULT.equals(kind);
			case Emv3Package.ERROR_PROPAGATION__FEATUREOR_PP_REF:
				return featureorPPRef != null;
			case Emv3Package.ERROR_PROPAGATION__NOT:
				return not != NOT_EDEFAULT;
			case Emv3Package.ERROR_PROPAGATION__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case Emv3Package.ERROR_PROPAGATION__TYPE_SET:
				return typeSet != null;
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(", not: ");
		result.append(not);
		result.append(", direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //ErrorPropagationImpl
