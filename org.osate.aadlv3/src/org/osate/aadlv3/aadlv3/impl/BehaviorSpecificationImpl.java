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
import org.osate.aadlv3.aadlv3.BehaviorSpecification;
import org.osate.aadlv3.aadlv3.Literal;
import org.osate.aadlv3.aadlv3.MultiLiteralConstraint;
import org.osate.aadlv3.aadlv3.StateSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.BehaviorSpecificationImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.BehaviorSpecificationImpl#getTargetState <em>Target State</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.BehaviorSpecificationImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.BehaviorSpecificationImpl#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviorSpecificationImpl extends ModelElementImpl implements BehaviorSpecification {
	/**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected StateSpecification guard;

	/**
	 * The cached value of the '{@link #getTargetState() <em>Target State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetState()
	 * @generated
	 * @ordered
	 */
	protected StateSpecification targetState;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected MultiLiteralConstraint condition;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected Literal result;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadlv3Package.Literals.BEHAVIOR_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateSpecification getGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuard(StateSpecification newGuard, NotificationChain msgs) {
		StateSpecification oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Aadlv3Package.BEHAVIOR_SPECIFICATION__GUARD, oldGuard, newGuard);
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
	public void setGuard(StateSpecification newGuard) {
		if (newGuard != guard) {
			NotificationChain msgs = null;
			if (guard != null)
				msgs = ((InternalEObject) guard).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Aadlv3Package.BEHAVIOR_SPECIFICATION__GUARD, null, msgs);
			if (newGuard != null)
				msgs = ((InternalEObject) newGuard).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Aadlv3Package.BEHAVIOR_SPECIFICATION__GUARD, null, msgs);
			msgs = basicSetGuard(newGuard, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadlv3Package.BEHAVIOR_SPECIFICATION__GUARD, newGuard,
					newGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateSpecification getTargetState() {
		if (targetState != null && targetState.eIsProxy()) {
			InternalEObject oldTargetState = (InternalEObject) targetState;
			targetState = (StateSpecification) eResolveProxy(oldTargetState);
			if (targetState != oldTargetState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Aadlv3Package.BEHAVIOR_SPECIFICATION__TARGET_STATE, oldTargetState, targetState));
			}
		}
		return targetState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateSpecification basicGetTargetState() {
		return targetState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetState(StateSpecification newTargetState) {
		StateSpecification oldTargetState = targetState;
		targetState = newTargetState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadlv3Package.BEHAVIOR_SPECIFICATION__TARGET_STATE,
					oldTargetState, targetState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiLiteralConstraint getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(MultiLiteralConstraint newCondition, NotificationChain msgs) {
		MultiLiteralConstraint oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Aadlv3Package.BEHAVIOR_SPECIFICATION__CONDITION, oldCondition, newCondition);
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
	public void setCondition(MultiLiteralConstraint newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject) condition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Aadlv3Package.BEHAVIOR_SPECIFICATION__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject) newCondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Aadlv3Package.BEHAVIOR_SPECIFICATION__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadlv3Package.BEHAVIOR_SPECIFICATION__CONDITION,
					newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Literal getResult() {
		if (result != null && result.eIsProxy()) {
			InternalEObject oldResult = (InternalEObject) result;
			result = (Literal) eResolveProxy(oldResult);
			if (result != oldResult) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Aadlv3Package.BEHAVIOR_SPECIFICATION__RESULT, oldResult, result));
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal basicGetResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResult(Literal newResult) {
		Literal oldResult = result;
		result = newResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadlv3Package.BEHAVIOR_SPECIFICATION__RESULT,
					oldResult, result));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Aadlv3Package.BEHAVIOR_SPECIFICATION__GUARD:
			return basicSetGuard(null, msgs);
		case Aadlv3Package.BEHAVIOR_SPECIFICATION__CONDITION:
			return basicSetCondition(null, msgs);
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
		case Aadlv3Package.BEHAVIOR_SPECIFICATION__GUARD:
			return getGuard();
		case Aadlv3Package.BEHAVIOR_SPECIFICATION__TARGET_STATE:
			if (resolve)
				return getTargetState();
			return basicGetTargetState();
		case Aadlv3Package.BEHAVIOR_SPECIFICATION__CONDITION:
			return getCondition();
		case Aadlv3Package.BEHAVIOR_SPECIFICATION__RESULT:
			if (resolve)
				return getResult();
			return basicGetResult();
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
		case Aadlv3Package.BEHAVIOR_SPECIFICATION__GUARD:
			setGuard((StateSpecification) newValue);
			return;
		case Aadlv3Package.BEHAVIOR_SPECIFICATION__TARGET_STATE:
			setTargetState((StateSpecification) newValue);
			return;
		case Aadlv3Package.BEHAVIOR_SPECIFICATION__CONDITION:
			setCondition((MultiLiteralConstraint) newValue);
			return;
		case Aadlv3Package.BEHAVIOR_SPECIFICATION__RESULT:
			setResult((Literal) newValue);
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
		case Aadlv3Package.BEHAVIOR_SPECIFICATION__GUARD:
			setGuard((StateSpecification) null);
			return;
		case Aadlv3Package.BEHAVIOR_SPECIFICATION__TARGET_STATE:
			setTargetState((StateSpecification) null);
			return;
		case Aadlv3Package.BEHAVIOR_SPECIFICATION__CONDITION:
			setCondition((MultiLiteralConstraint) null);
			return;
		case Aadlv3Package.BEHAVIOR_SPECIFICATION__RESULT:
			setResult((Literal) null);
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
		case Aadlv3Package.BEHAVIOR_SPECIFICATION__GUARD:
			return guard != null;
		case Aadlv3Package.BEHAVIOR_SPECIFICATION__TARGET_STATE:
			return targetState != null;
		case Aadlv3Package.BEHAVIOR_SPECIFICATION__CONDITION:
			return condition != null;
		case Aadlv3Package.BEHAVIOR_SPECIFICATION__RESULT:
			return result != null;
		}
		return super.eIsSet(featureID);
	}

} //BehaviorSpecificationImpl
