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

import org.osate.aadlv3.aadlv3.Behavior;
import org.osate.aadlv3.aadlv3.BehaviorCategory;
import org.osate.aadlv3.aadlv3.Literal;

import org.osate.av3instance.av3instance.Av3instancePackage;
import org.osate.av3instance.av3instance.BehaviorInstance;
import org.osate.av3instance.av3instance.ConstrainedInstanceObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.av3instance.av3instance.impl.BehaviorInstanceImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.BehaviorInstanceImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.BehaviorInstanceImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.BehaviorInstanceImpl#isSink <em>Sink</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.BehaviorInstanceImpl#isSource <em>Source</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.BehaviorInstanceImpl#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviorInstanceImpl extends InstanceObjectImpl implements BehaviorInstance {
	/**
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior behavior;

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
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final BehaviorCategory CATEGORY_EDEFAULT = BehaviorCategory.FLOW;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected BehaviorCategory category = CATEGORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Av3instancePackage.Literals.BEHAVIOR_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Behavior getBehavior() {
		if (behavior != null && behavior.eIsProxy()) {
			InternalEObject oldBehavior = (InternalEObject) behavior;
			behavior = (Behavior) eResolveProxy(oldBehavior);
			if (behavior != oldBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Av3instancePackage.BEHAVIOR_INSTANCE__BEHAVIOR, oldBehavior, behavior));
			}
		}
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetBehavior() {
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBehavior(Behavior newBehavior) {
		Behavior oldBehavior = behavior;
		behavior = newBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Av3instancePackage.BEHAVIOR_INSTANCE__BEHAVIOR,
					oldBehavior, behavior));
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
					Av3instancePackage.BEHAVIOR_INSTANCE__CONDITION, oldCondition, newCondition);
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
						EOPPOSITE_FEATURE_BASE - Av3instancePackage.BEHAVIOR_INSTANCE__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject) newCondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Av3instancePackage.BEHAVIOR_INSTANCE__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Av3instancePackage.BEHAVIOR_INSTANCE__CONDITION,
					newCondition, newCondition));
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
					Av3instancePackage.BEHAVIOR_INSTANCE__ACTIONS);
		}
		return actions;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Av3instancePackage.BEHAVIOR_INSTANCE__SINK, oldSink,
					sink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Av3instancePackage.BEHAVIOR_INSTANCE__SOURCE,
					oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BehaviorCategory getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategory(BehaviorCategory newCategory) {
		BehaviorCategory oldCategory = category;
		category = newCategory == null ? CATEGORY_EDEFAULT : newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Av3instancePackage.BEHAVIOR_INSTANCE__CATEGORY,
					oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Av3instancePackage.BEHAVIOR_INSTANCE__CONDITION:
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
		case Av3instancePackage.BEHAVIOR_INSTANCE__BEHAVIOR:
			if (resolve)
				return getBehavior();
			return basicGetBehavior();
		case Av3instancePackage.BEHAVIOR_INSTANCE__CONDITION:
			return getCondition();
		case Av3instancePackage.BEHAVIOR_INSTANCE__ACTIONS:
			return getActions();
		case Av3instancePackage.BEHAVIOR_INSTANCE__SINK:
			return isSink();
		case Av3instancePackage.BEHAVIOR_INSTANCE__SOURCE:
			return isSource();
		case Av3instancePackage.BEHAVIOR_INSTANCE__CATEGORY:
			return getCategory();
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
		case Av3instancePackage.BEHAVIOR_INSTANCE__BEHAVIOR:
			setBehavior((Behavior) newValue);
			return;
		case Av3instancePackage.BEHAVIOR_INSTANCE__CONDITION:
			setCondition((Literal) newValue);
			return;
		case Av3instancePackage.BEHAVIOR_INSTANCE__ACTIONS:
			getActions().clear();
			getActions().addAll((Collection<? extends ConstrainedInstanceObject>) newValue);
			return;
		case Av3instancePackage.BEHAVIOR_INSTANCE__SINK:
			setSink((Boolean) newValue);
			return;
		case Av3instancePackage.BEHAVIOR_INSTANCE__SOURCE:
			setSource((Boolean) newValue);
			return;
		case Av3instancePackage.BEHAVIOR_INSTANCE__CATEGORY:
			setCategory((BehaviorCategory) newValue);
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
		case Av3instancePackage.BEHAVIOR_INSTANCE__BEHAVIOR:
			setBehavior((Behavior) null);
			return;
		case Av3instancePackage.BEHAVIOR_INSTANCE__CONDITION:
			setCondition((Literal) null);
			return;
		case Av3instancePackage.BEHAVIOR_INSTANCE__ACTIONS:
			getActions().clear();
			return;
		case Av3instancePackage.BEHAVIOR_INSTANCE__SINK:
			setSink(SINK_EDEFAULT);
			return;
		case Av3instancePackage.BEHAVIOR_INSTANCE__SOURCE:
			setSource(SOURCE_EDEFAULT);
			return;
		case Av3instancePackage.BEHAVIOR_INSTANCE__CATEGORY:
			setCategory(CATEGORY_EDEFAULT);
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
		case Av3instancePackage.BEHAVIOR_INSTANCE__BEHAVIOR:
			return behavior != null;
		case Av3instancePackage.BEHAVIOR_INSTANCE__CONDITION:
			return condition != null;
		case Av3instancePackage.BEHAVIOR_INSTANCE__ACTIONS:
			return actions != null && !actions.isEmpty();
		case Av3instancePackage.BEHAVIOR_INSTANCE__SINK:
			return sink != SINK_EDEFAULT;
		case Av3instancePackage.BEHAVIOR_INSTANCE__SOURCE:
			return source != SOURCE_EDEFAULT;
		case Av3instancePackage.BEHAVIOR_INSTANCE__CATEGORY:
			return category != CATEGORY_EDEFAULT;
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
		result.append(", category: "); //$NON-NLS-1$
		result.append(category);
		result.append(')');
		return result.toString();
	}

} //BehaviorInstanceImpl
