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
import org.osate.av3instance.av3instance.StateInstance;

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
 *   <li>{@link org.osate.av3instance.av3instance.impl.BehaviorRuleInstanceImpl#isSink <em>Sink</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.BehaviorRuleInstanceImpl#isSource <em>Source</em>}</li>
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
	 * The cached value of the '{@link #getCurrentState() <em>Current State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentState()
	 * @generated
	 * @ordered
	 */
	protected StateInstance currentState;

	/**
	 * The cached value of the '{@link #getTargetState() <em>Target State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetState()
	 * @generated
	 * @ordered
	 */
	protected StateInstance targetState;

	/**
	 * The default value of the '{@link #isSink() <em>Sink</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSink()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SINK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSink() <em>Sink</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSink()
	 * @generated
	 * @ordered
	 */
	protected boolean sink = SINK_EDEFAULT;

	/**
	 * The default value of the '{@link #isSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSource()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SOURCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSource()
	 * @generated
	 * @ordered
	 */
	protected boolean source = SOURCE_EDEFAULT;

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
	public StateInstance getCurrentState() {
		if (currentState != null && currentState.eIsProxy()) {
			InternalEObject oldCurrentState = (InternalEObject) currentState;
			currentState = (StateInstance) eResolveProxy(oldCurrentState);
			if (currentState != oldCurrentState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Av3instancePackage.BEHAVIOR_RULE_INSTANCE__CURRENT_STATE, oldCurrentState, currentState));
			}
		}
		return currentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateInstance basicGetCurrentState() {
		return currentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentState(StateInstance newCurrentState) {
		StateInstance oldCurrentState = currentState;
		currentState = newCurrentState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Av3instancePackage.BEHAVIOR_RULE_INSTANCE__CURRENT_STATE, oldCurrentState, currentState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateInstance getTargetState() {
		if (targetState != null && targetState.eIsProxy()) {
			InternalEObject oldTargetState = (InternalEObject) targetState;
			targetState = (StateInstance) eResolveProxy(oldTargetState);
			if (targetState != oldTargetState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Av3instancePackage.BEHAVIOR_RULE_INSTANCE__TARGET_STATE, oldTargetState, targetState));
			}
		}
		return targetState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateInstance basicGetTargetState() {
		return targetState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetState(StateInstance newTargetState) {
		StateInstance oldTargetState = targetState;
		targetState = newTargetState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Av3instancePackage.BEHAVIOR_RULE_INSTANCE__TARGET_STATE, oldTargetState, targetState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSink() {
		return sink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSink(boolean newSink) {
		boolean oldSink = sink;
		sink = newSink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Av3instancePackage.BEHAVIOR_RULE_INSTANCE__SINK,
					oldSink, sink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(boolean newSource) {
		boolean oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Av3instancePackage.BEHAVIOR_RULE_INSTANCE__SOURCE,
					oldSource, source));
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
			if (resolve)
				return getCurrentState();
			return basicGetCurrentState();
		case Av3instancePackage.BEHAVIOR_RULE_INSTANCE__TARGET_STATE:
			if (resolve)
				return getTargetState();
			return basicGetTargetState();
		case Av3instancePackage.BEHAVIOR_RULE_INSTANCE__SINK:
			return isSink();
		case Av3instancePackage.BEHAVIOR_RULE_INSTANCE__SOURCE:
			return isSource();
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
			setCurrentState((StateInstance) newValue);
			return;
		case Av3instancePackage.BEHAVIOR_RULE_INSTANCE__TARGET_STATE:
			setTargetState((StateInstance) newValue);
			return;
		case Av3instancePackage.BEHAVIOR_RULE_INSTANCE__SINK:
			setSink((Boolean) newValue);
			return;
		case Av3instancePackage.BEHAVIOR_RULE_INSTANCE__SOURCE:
			setSource((Boolean) newValue);
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
			setCurrentState((StateInstance) null);
			return;
		case Av3instancePackage.BEHAVIOR_RULE_INSTANCE__TARGET_STATE:
			setTargetState((StateInstance) null);
			return;
		case Av3instancePackage.BEHAVIOR_RULE_INSTANCE__SINK:
			setSink(SINK_EDEFAULT);
			return;
		case Av3instancePackage.BEHAVIOR_RULE_INSTANCE__SOURCE:
			setSource(SOURCE_EDEFAULT);
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
		case Av3instancePackage.BEHAVIOR_RULE_INSTANCE__SINK:
			return sink != SINK_EDEFAULT;
		case Av3instancePackage.BEHAVIOR_RULE_INSTANCE__SOURCE:
			return source != SOURCE_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (sink: "); //$NON-NLS-1$
		result.append(sink);
		result.append(", source: "); //$NON-NLS-1$
		result.append(source);
		result.append(')');
		return result.toString();
	}

} //BehaviorRuleInstanceImpl
