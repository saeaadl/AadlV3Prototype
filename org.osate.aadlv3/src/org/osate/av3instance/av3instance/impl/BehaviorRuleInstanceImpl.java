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
package org.osate.av3instance.av3instance.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.osate.aadlv3.aadlv3.BehaviorRule;

import org.osate.aadlv3.aadlv3.Literal;
import org.osate.av3instance.av3instance.Av3instancePackage;
import org.osate.av3instance.av3instance.BehaviorRuleInstance;
import org.osate.av3instance.av3instance.ConstrainedInstanceObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Rule Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.av3instance.av3instance.impl.BehaviorRuleInstanceImpl#getBehaviorRule <em>Behavior Rule</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.BehaviorRuleInstanceImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.BehaviorRuleInstanceImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.BehaviorRuleInstanceImpl#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.BehaviorRuleInstanceImpl#getTargetState <em>Target State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviorRuleInstanceImpl extends InstanceObjectImpl implements BehaviorRuleInstance {
	/**
	 * The cached value of the '{@link #getBehaviorRule() <em>Behavior Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviorRule()
	 * @generated
	 * @ordered
	 */
	protected BehaviorRule behaviorRule;

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
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstrainedInstanceObject> actions;

	/**
	 * The cached value of the '{@link #getCurrentState() <em>Current State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentState()
	 * @generated
	 * @ordered
	 */
	protected ConstrainedInstanceObject currentState;

	/**
	 * The cached value of the '{@link #getTargetState() <em>Target State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetState()
	 * @generated
	 * @ordered
	 */
	protected ConstrainedInstanceObject targetState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorRuleInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Av3instancePackage.Literals.BEHAVIOR_RULE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BehaviorRule getBehaviorRule() {
		if (behaviorRule != null && behaviorRule.eIsProxy()) {
			InternalEObject oldBehaviorRule = (InternalEObject) behaviorRule;
			behaviorRule = (BehaviorRule) eResolveProxy(oldBehaviorRule);
			if (behaviorRule != oldBehaviorRule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Av3instancePackage.BEHAVIOR_RULE_INSTANCE__BEHAVIOR_RULE, oldBehaviorRule, behaviorRule));
			}
		}
		return behaviorRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorRule basicGetBehaviorRule() {
		return behaviorRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBehaviorRule(BehaviorRule newBehaviorRule) {
		BehaviorRule oldBehaviorRule = behaviorRule;
		behaviorRule = newBehaviorRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Av3instancePackage.BEHAVIOR_RULE_INSTANCE__BEHAVIOR_RULE, oldBehaviorRule, behaviorRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConstrainedInstanceObject> getActions() {
		if (actions == null) {
			actions = new EObjectResolvingEList<ConstrainedInstanceObject>(ConstrainedInstanceObject.class, this,
					Av3instancePackage.BEHAVIOR_RULE_INSTANCE__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstrainedInstanceObject getCurrentState() {
		return currentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentState(ConstrainedInstanceObject newCurrentState, NotificationChain msgs) {
		ConstrainedInstanceObject oldCurrentState = currentState;
		currentState = newCurrentState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Av3instancePackage.BEHAVIOR_RULE_INSTANCE__CURRENT_STATE, oldCurrentState, newCurrentState);
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
	public void setCurrentState(ConstrainedInstanceObject newCurrentState) {
		if (newCurrentState != currentState) {
			NotificationChain msgs = null;
			if (currentState != null)
				msgs = ((InternalEObject) currentState).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Av3instancePackage.BEHAVIOR_RULE_INSTANCE__CURRENT_STATE, null, msgs);
			if (newCurrentState != null)
				msgs = ((InternalEObject) newCurrentState).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Av3instancePackage.BEHAVIOR_RULE_INSTANCE__CURRENT_STATE, null, msgs);
			msgs = basicSetCurrentState(newCurrentState, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Av3instancePackage.BEHAVIOR_RULE_INSTANCE__CURRENT_STATE, newCurrentState, newCurrentState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstrainedInstanceObject getTargetState() {
		return targetState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetState(ConstrainedInstanceObject newTargetState, NotificationChain msgs) {
		ConstrainedInstanceObject oldTargetState = targetState;
		targetState = newTargetState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Av3instancePackage.BEHAVIOR_RULE_INSTANCE__TARGET_STATE, oldTargetState, newTargetState);
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
	public void setTargetState(ConstrainedInstanceObject newTargetState) {
		if (newTargetState != targetState) {
			NotificationChain msgs = null;
			if (targetState != null)
				msgs = ((InternalEObject) targetState).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Av3instancePackage.BEHAVIOR_RULE_INSTANCE__TARGET_STATE, null, msgs);
			if (newTargetState != null)
				msgs = ((InternalEObject) newTargetState).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Av3instancePackage.BEHAVIOR_RULE_INSTANCE__TARGET_STATE, null, msgs);
			msgs = basicSetTargetState(newTargetState, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Av3instancePackage.BEHAVIOR_RULE_INSTANCE__TARGET_STATE, newTargetState, newTargetState));
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
					Av3instancePackage.BEHAVIOR_RULE_INSTANCE__CONDITION, oldCondition, newCondition);
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
						EOPPOSITE_FEATURE_BASE - Av3instancePackage.BEHAVIOR_RULE_INSTANCE__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject) newCondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Av3instancePackage.BEHAVIOR_RULE_INSTANCE__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Av3instancePackage.BEHAVIOR_RULE_INSTANCE__CONDITION,
					newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Av3instancePackage.BEHAVIOR_RULE_INSTANCE__CONDITION:
			return basicSetCondition(null, msgs);
		case Av3instancePackage.BEHAVIOR_RULE_INSTANCE__CURRENT_STATE:
			return basicSetCurrentState(null, msgs);
		case Av3instancePackage.BEHAVIOR_RULE_INSTANCE__TARGET_STATE:
			return basicSetTargetState(null, msgs);
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
		case Av3instancePackage.BEHAVIOR_RULE_INSTANCE__BEHAVIOR_RULE:
			if (resolve)
				return getBehaviorRule();
			return basicGetBehaviorRule();
		case Av3instancePackage.BEHAVIOR_RULE_INSTANCE__CONDITION:
			return getCondition();
		case Av3instancePackage.BEHAVIOR_RULE_INSTANCE__ACTIONS:
			return getActions();
		case Av3instancePackage.BEHAVIOR_RULE_INSTANCE__CURRENT_STATE:
			return getCurrentState();
		case Av3instancePackage.BEHAVIOR_RULE_INSTANCE__TARGET_STATE:
			return getTargetState();
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
		case Av3instancePackage.BEHAVIOR_RULE_INSTANCE__BEHAVIOR_RULE:
			setBehaviorRule((BehaviorRule) newValue);
			return;
		case Av3instancePackage.BEHAVIOR_RULE_INSTANCE__CONDITION:
			setCondition((Literal) newValue);
			return;
		case Av3instancePackage.BEHAVIOR_RULE_INSTANCE__ACTIONS:
			getActions().clear();
			getActions().addAll((Collection<? extends ConstrainedInstanceObject>) newValue);
			return;
		case Av3instancePackage.BEHAVIOR_RULE_INSTANCE__CURRENT_STATE:
			setCurrentState((ConstrainedInstanceObject) newValue);
			return;
		case Av3instancePackage.BEHAVIOR_RULE_INSTANCE__TARGET_STATE:
			setTargetState((ConstrainedInstanceObject) newValue);
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
		case Av3instancePackage.BEHAVIOR_RULE_INSTANCE__BEHAVIOR_RULE:
			setBehaviorRule((BehaviorRule) null);
			return;
		case Av3instancePackage.BEHAVIOR_RULE_INSTANCE__CONDITION:
			setCondition((Literal) null);
			return;
		case Av3instancePackage.BEHAVIOR_RULE_INSTANCE__ACTIONS:
			getActions().clear();
			return;
		case Av3instancePackage.BEHAVIOR_RULE_INSTANCE__CURRENT_STATE:
			setCurrentState((ConstrainedInstanceObject) null);
			return;
		case Av3instancePackage.BEHAVIOR_RULE_INSTANCE__TARGET_STATE:
			setTargetState((ConstrainedInstanceObject) null);
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
		case Av3instancePackage.BEHAVIOR_RULE_INSTANCE__BEHAVIOR_RULE:
			return behaviorRule != null;
		case Av3instancePackage.BEHAVIOR_RULE_INSTANCE__CONDITION:
			return condition != null;
		case Av3instancePackage.BEHAVIOR_RULE_INSTANCE__ACTIONS:
			return actions != null && !actions.isEmpty();
		case Av3instancePackage.BEHAVIOR_RULE_INSTANCE__CURRENT_STATE:
			return currentState != null;
		case Av3instancePackage.BEHAVIOR_RULE_INSTANCE__TARGET_STATE:
			return targetState != null;
		}
		return super.eIsSet(featureID);
	}

} //BehaviorRuleInstanceImpl
