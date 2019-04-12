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
import org.osate.emv3.emv3.QualifiedPropagationPoint;
import org.osate.emv3.emv3.SubcomponentElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qualified Propagation Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.emv3.emv3.impl.QualifiedPropagationPointImpl#getSubcomponent <em>Subcomponent</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.impl.QualifiedPropagationPointImpl#getNext <em>Next</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.impl.QualifiedPropagationPointImpl#getPropagationPoint <em>Propagation Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualifiedPropagationPointImpl extends MinimalEObjectImpl.Container implements QualifiedPropagationPoint {
	/**
	 * The cached value of the '{@link #getSubcomponent() <em>Subcomponent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubcomponent()
	 * @generated
	 * @ordered
	 */
	protected SubcomponentElement subcomponent;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected QualifiedPropagationPoint next;

	/**
	 * The cached value of the '{@link #getPropagationPoint() <em>Propagation Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropagationPoint()
	 * @generated
	 * @ordered
	 */
	protected NamedElement propagationPoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualifiedPropagationPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Emv3Package.Literals.QUALIFIED_PROPAGATION_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubcomponentElement getSubcomponent() {
		return subcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubcomponent(SubcomponentElement newSubcomponent, NotificationChain msgs) {
		SubcomponentElement oldSubcomponent = subcomponent;
		subcomponent = newSubcomponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Emv3Package.QUALIFIED_PROPAGATION_POINT__SUBCOMPONENT, oldSubcomponent, newSubcomponent);
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
	public void setSubcomponent(SubcomponentElement newSubcomponent) {
		if (newSubcomponent != subcomponent) {
			NotificationChain msgs = null;
			if (subcomponent != null)
				msgs = ((InternalEObject)subcomponent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Emv3Package.QUALIFIED_PROPAGATION_POINT__SUBCOMPONENT, null, msgs);
			if (newSubcomponent != null)
				msgs = ((InternalEObject)newSubcomponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Emv3Package.QUALIFIED_PROPAGATION_POINT__SUBCOMPONENT, null, msgs);
			msgs = basicSetSubcomponent(newSubcomponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Emv3Package.QUALIFIED_PROPAGATION_POINT__SUBCOMPONENT, newSubcomponent, newSubcomponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QualifiedPropagationPoint getNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNext(QualifiedPropagationPoint newNext, NotificationChain msgs) {
		QualifiedPropagationPoint oldNext = next;
		next = newNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Emv3Package.QUALIFIED_PROPAGATION_POINT__NEXT, oldNext, newNext);
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
	public void setNext(QualifiedPropagationPoint newNext) {
		if (newNext != next) {
			NotificationChain msgs = null;
			if (next != null)
				msgs = ((InternalEObject)next).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Emv3Package.QUALIFIED_PROPAGATION_POINT__NEXT, null, msgs);
			if (newNext != null)
				msgs = ((InternalEObject)newNext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Emv3Package.QUALIFIED_PROPAGATION_POINT__NEXT, null, msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Emv3Package.QUALIFIED_PROPAGATION_POINT__NEXT, newNext, newNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedElement getPropagationPoint() {
		if (propagationPoint != null && propagationPoint.eIsProxy()) {
			InternalEObject oldPropagationPoint = (InternalEObject)propagationPoint;
			propagationPoint = (NamedElement)eResolveProxy(oldPropagationPoint);
			if (propagationPoint != oldPropagationPoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Emv3Package.QUALIFIED_PROPAGATION_POINT__PROPAGATION_POINT, oldPropagationPoint, propagationPoint));
			}
		}
		return propagationPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement basicGetPropagationPoint() {
		return propagationPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropagationPoint(NamedElement newPropagationPoint) {
		NamedElement oldPropagationPoint = propagationPoint;
		propagationPoint = newPropagationPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Emv3Package.QUALIFIED_PROPAGATION_POINT__PROPAGATION_POINT, oldPropagationPoint, propagationPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Emv3Package.QUALIFIED_PROPAGATION_POINT__SUBCOMPONENT:
				return basicSetSubcomponent(null, msgs);
			case Emv3Package.QUALIFIED_PROPAGATION_POINT__NEXT:
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
			case Emv3Package.QUALIFIED_PROPAGATION_POINT__SUBCOMPONENT:
				return getSubcomponent();
			case Emv3Package.QUALIFIED_PROPAGATION_POINT__NEXT:
				return getNext();
			case Emv3Package.QUALIFIED_PROPAGATION_POINT__PROPAGATION_POINT:
				if (resolve) return getPropagationPoint();
				return basicGetPropagationPoint();
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
			case Emv3Package.QUALIFIED_PROPAGATION_POINT__SUBCOMPONENT:
				setSubcomponent((SubcomponentElement)newValue);
				return;
			case Emv3Package.QUALIFIED_PROPAGATION_POINT__NEXT:
				setNext((QualifiedPropagationPoint)newValue);
				return;
			case Emv3Package.QUALIFIED_PROPAGATION_POINT__PROPAGATION_POINT:
				setPropagationPoint((NamedElement)newValue);
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
			case Emv3Package.QUALIFIED_PROPAGATION_POINT__SUBCOMPONENT:
				setSubcomponent((SubcomponentElement)null);
				return;
			case Emv3Package.QUALIFIED_PROPAGATION_POINT__NEXT:
				setNext((QualifiedPropagationPoint)null);
				return;
			case Emv3Package.QUALIFIED_PROPAGATION_POINT__PROPAGATION_POINT:
				setPropagationPoint((NamedElement)null);
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
			case Emv3Package.QUALIFIED_PROPAGATION_POINT__SUBCOMPONENT:
				return subcomponent != null;
			case Emv3Package.QUALIFIED_PROPAGATION_POINT__NEXT:
				return next != null;
			case Emv3Package.QUALIFIED_PROPAGATION_POINT__PROPAGATION_POINT:
				return propagationPoint != null;
		}
		return super.eIsSet(featureID);
	}

} //QualifiedPropagationPointImpl
