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

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.osate.aadlv3.aadlv3.Aadlv3Package;
import org.osate.aadlv3.aadlv3.Assignment;
import org.osate.aadlv3.aadlv3.BehaviorRule;
import org.osate.aadlv3.aadlv3.Literal;
import org.osate.aadlv3.aadlv3.StateSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.BehaviorRuleImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.BehaviorRuleImpl#getTargetState <em>Target State</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.BehaviorRuleImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.BehaviorRuleImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviorRuleImpl extends ModelElementImpl implements BehaviorRule {
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
	 * The cached value of the '{@link #getTargetState() <em>Target State</em>}' containment reference.
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
	protected Literal condition;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Assignment> action;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadlv3Package.Literals.BEHAVIOR_RULE;
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
					Aadlv3Package.BEHAVIOR_RULE__GUARD, oldGuard, newGuard);
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
						EOPPOSITE_FEATURE_BASE - Aadlv3Package.BEHAVIOR_RULE__GUARD, null, msgs);
			if (newGuard != null)
				msgs = ((InternalEObject) newGuard).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Aadlv3Package.BEHAVIOR_RULE__GUARD, null, msgs);
			msgs = basicSetGuard(newGuard, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadlv3Package.BEHAVIOR_RULE__GUARD, newGuard,
					newGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateSpecification getTargetState() {
		return targetState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetState(StateSpecification newTargetState, NotificationChain msgs) {
		StateSpecification oldTargetState = targetState;
		targetState = newTargetState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Aadlv3Package.BEHAVIOR_RULE__TARGET_STATE, oldTargetState, newTargetState);
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
	public void setTargetState(StateSpecification newTargetState) {
		if (newTargetState != targetState) {
			NotificationChain msgs = null;
			if (targetState != null)
				msgs = ((InternalEObject) targetState).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Aadlv3Package.BEHAVIOR_RULE__TARGET_STATE, null, msgs);
			if (newTargetState != null)
				msgs = ((InternalEObject) newTargetState).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Aadlv3Package.BEHAVIOR_RULE__TARGET_STATE, null, msgs);
			msgs = basicSetTargetState(newTargetState, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadlv3Package.BEHAVIOR_RULE__TARGET_STATE,
					newTargetState, newTargetState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Literal getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Literal newCondition, NotificationChain msgs) {
		Literal oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Aadlv3Package.BEHAVIOR_RULE__CONDITION, oldCondition, newCondition);
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
	public void setCondition(Literal newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject) condition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Aadlv3Package.BEHAVIOR_RULE__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject) newCondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Aadlv3Package.BEHAVIOR_RULE__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadlv3Package.BEHAVIOR_RULE__CONDITION, newCondition,
					newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Assignment> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<Assignment>(Assignment.class, this,
					Aadlv3Package.BEHAVIOR_RULE__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Aadlv3Package.BEHAVIOR_RULE__GUARD:
			return basicSetGuard(null, msgs);
		case Aadlv3Package.BEHAVIOR_RULE__TARGET_STATE:
			return basicSetTargetState(null, msgs);
		case Aadlv3Package.BEHAVIOR_RULE__CONDITION:
			return basicSetCondition(null, msgs);
		case Aadlv3Package.BEHAVIOR_RULE__ACTION:
			return ((InternalEList<?>) getAction()).basicRemove(otherEnd, msgs);
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
		case Aadlv3Package.BEHAVIOR_RULE__GUARD:
			return getGuard();
		case Aadlv3Package.BEHAVIOR_RULE__TARGET_STATE:
			return getTargetState();
		case Aadlv3Package.BEHAVIOR_RULE__CONDITION:
			return getCondition();
		case Aadlv3Package.BEHAVIOR_RULE__ACTION:
			return getAction();
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
		case Aadlv3Package.BEHAVIOR_RULE__GUARD:
			setGuard((StateSpecification) newValue);
			return;
		case Aadlv3Package.BEHAVIOR_RULE__TARGET_STATE:
			setTargetState((StateSpecification) newValue);
			return;
		case Aadlv3Package.BEHAVIOR_RULE__CONDITION:
			setCondition((Literal) newValue);
			return;
		case Aadlv3Package.BEHAVIOR_RULE__ACTION:
			getAction().clear();
			getAction().addAll((Collection<? extends Assignment>) newValue);
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
		case Aadlv3Package.BEHAVIOR_RULE__GUARD:
			setGuard((StateSpecification) null);
			return;
		case Aadlv3Package.BEHAVIOR_RULE__TARGET_STATE:
			setTargetState((StateSpecification) null);
			return;
		case Aadlv3Package.BEHAVIOR_RULE__CONDITION:
			setCondition((Literal) null);
			return;
		case Aadlv3Package.BEHAVIOR_RULE__ACTION:
			getAction().clear();
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
		case Aadlv3Package.BEHAVIOR_RULE__GUARD:
			return guard != null;
		case Aadlv3Package.BEHAVIOR_RULE__TARGET_STATE:
			return targetState != null;
		case Aadlv3Package.BEHAVIOR_RULE__CONDITION:
			return condition != null;
		case Aadlv3Package.BEHAVIOR_RULE__ACTION:
			return action != null && !action.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BehaviorRuleImpl
