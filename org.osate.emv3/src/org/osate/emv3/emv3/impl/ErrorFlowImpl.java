/**
 * Copyright Text	Copyright 2018 Carnegie Mellon University. All Rights Reserved....
 */
package org.osate.emv3.emv3.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.aadlv3.aadlv3.impl.NamedElementImpl;

import org.osate.emv3.emv3.Emv3Package;
import org.osate.emv3.emv3.ErrorFlow;
import org.osate.emv3.emv3.IfCondition;
import org.osate.emv3.emv3.TypeSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.emv3.emv3.impl.ErrorFlowImpl#getTypeTokenConstraint <em>Type Token Constraint</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.impl.ErrorFlowImpl#getFlowcondition <em>Flowcondition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErrorFlowImpl extends NamedElementImpl implements ErrorFlow {
	/**
	 * The cached value of the '{@link #getTypeTokenConstraint() <em>Type Token Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeTokenConstraint()
	 * @generated
	 * @ordered
	 */
	protected TypeSet typeTokenConstraint;

	/**
	 * The cached value of the '{@link #getFlowcondition() <em>Flowcondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowcondition()
	 * @generated
	 * @ordered
	 */
	protected IfCondition flowcondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Emv3Package.Literals.ERROR_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeSet getTypeTokenConstraint() {
		return typeTokenConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeTokenConstraint(TypeSet newTypeTokenConstraint, NotificationChain msgs) {
		TypeSet oldTypeTokenConstraint = typeTokenConstraint;
		typeTokenConstraint = newTypeTokenConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Emv3Package.ERROR_FLOW__TYPE_TOKEN_CONSTRAINT, oldTypeTokenConstraint, newTypeTokenConstraint);
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
	public void setTypeTokenConstraint(TypeSet newTypeTokenConstraint) {
		if (newTypeTokenConstraint != typeTokenConstraint) {
			NotificationChain msgs = null;
			if (typeTokenConstraint != null)
				msgs = ((InternalEObject)typeTokenConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Emv3Package.ERROR_FLOW__TYPE_TOKEN_CONSTRAINT, null, msgs);
			if (newTypeTokenConstraint != null)
				msgs = ((InternalEObject)newTypeTokenConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Emv3Package.ERROR_FLOW__TYPE_TOKEN_CONSTRAINT, null, msgs);
			msgs = basicSetTypeTokenConstraint(newTypeTokenConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Emv3Package.ERROR_FLOW__TYPE_TOKEN_CONSTRAINT, newTypeTokenConstraint, newTypeTokenConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfCondition getFlowcondition() {
		return flowcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlowcondition(IfCondition newFlowcondition, NotificationChain msgs) {
		IfCondition oldFlowcondition = flowcondition;
		flowcondition = newFlowcondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Emv3Package.ERROR_FLOW__FLOWCONDITION, oldFlowcondition, newFlowcondition);
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
	public void setFlowcondition(IfCondition newFlowcondition) {
		if (newFlowcondition != flowcondition) {
			NotificationChain msgs = null;
			if (flowcondition != null)
				msgs = ((InternalEObject)flowcondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Emv3Package.ERROR_FLOW__FLOWCONDITION, null, msgs);
			if (newFlowcondition != null)
				msgs = ((InternalEObject)newFlowcondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Emv3Package.ERROR_FLOW__FLOWCONDITION, null, msgs);
			msgs = basicSetFlowcondition(newFlowcondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Emv3Package.ERROR_FLOW__FLOWCONDITION, newFlowcondition, newFlowcondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Emv3Package.ERROR_FLOW__TYPE_TOKEN_CONSTRAINT:
				return basicSetTypeTokenConstraint(null, msgs);
			case Emv3Package.ERROR_FLOW__FLOWCONDITION:
				return basicSetFlowcondition(null, msgs);
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
			case Emv3Package.ERROR_FLOW__TYPE_TOKEN_CONSTRAINT:
				return getTypeTokenConstraint();
			case Emv3Package.ERROR_FLOW__FLOWCONDITION:
				return getFlowcondition();
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
			case Emv3Package.ERROR_FLOW__TYPE_TOKEN_CONSTRAINT:
				setTypeTokenConstraint((TypeSet)newValue);
				return;
			case Emv3Package.ERROR_FLOW__FLOWCONDITION:
				setFlowcondition((IfCondition)newValue);
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
			case Emv3Package.ERROR_FLOW__TYPE_TOKEN_CONSTRAINT:
				setTypeTokenConstraint((TypeSet)null);
				return;
			case Emv3Package.ERROR_FLOW__FLOWCONDITION:
				setFlowcondition((IfCondition)null);
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
			case Emv3Package.ERROR_FLOW__TYPE_TOKEN_CONSTRAINT:
				return typeTokenConstraint != null;
			case Emv3Package.ERROR_FLOW__FLOWCONDITION:
				return flowcondition != null;
		}
		return super.eIsSet(featureID);
	}

} //ErrorFlowImpl
