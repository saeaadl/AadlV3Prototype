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
import org.osate.aadlv3.aadlv3.Behavior;
import org.osate.aadlv3.aadlv3.BehaviorCategory;
import org.osate.aadlv3.aadlv3.BinaryOperation;
import org.osate.aadlv3.aadlv3.Literal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.BehaviorImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.BehaviorImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.BehaviorImpl#isSource <em>Source</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.BehaviorImpl#isSink <em>Sink</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.BehaviorImpl#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviorImpl extends ModelElementImpl implements Behavior {
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
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<BinaryOperation> actions;

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
	protected BehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadlv3Package.Literals.BEHAVIOR;
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
					Aadlv3Package.BEHAVIOR__CONDITION, oldCondition, newCondition);
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
						EOPPOSITE_FEATURE_BASE - Aadlv3Package.BEHAVIOR__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject) newCondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Aadlv3Package.BEHAVIOR__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadlv3Package.BEHAVIOR__CONDITION, newCondition,
					newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BinaryOperation> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<BinaryOperation>(BinaryOperation.class, this,
					Aadlv3Package.BEHAVIOR__ACTIONS);
		}
		return actions;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Aadlv3Package.BEHAVIOR__SOURCE, oldSource, source));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Aadlv3Package.BEHAVIOR__SINK, oldSink, sink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Aadlv3Package.BEHAVIOR__CATEGORY, oldCategory,
					category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Aadlv3Package.BEHAVIOR__CONDITION:
			return basicSetCondition(null, msgs);
		case Aadlv3Package.BEHAVIOR__ACTIONS:
			return ((InternalEList<?>) getActions()).basicRemove(otherEnd, msgs);
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
		case Aadlv3Package.BEHAVIOR__CONDITION:
			return getCondition();
		case Aadlv3Package.BEHAVIOR__ACTIONS:
			return getActions();
		case Aadlv3Package.BEHAVIOR__SOURCE:
			return isSource();
		case Aadlv3Package.BEHAVIOR__SINK:
			return isSink();
		case Aadlv3Package.BEHAVIOR__CATEGORY:
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
		case Aadlv3Package.BEHAVIOR__CONDITION:
			setCondition((Literal) newValue);
			return;
		case Aadlv3Package.BEHAVIOR__ACTIONS:
			getActions().clear();
			getActions().addAll((Collection<? extends BinaryOperation>) newValue);
			return;
		case Aadlv3Package.BEHAVIOR__SOURCE:
			setSource((Boolean) newValue);
			return;
		case Aadlv3Package.BEHAVIOR__SINK:
			setSink((Boolean) newValue);
			return;
		case Aadlv3Package.BEHAVIOR__CATEGORY:
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
		case Aadlv3Package.BEHAVIOR__CONDITION:
			setCondition((Literal) null);
			return;
		case Aadlv3Package.BEHAVIOR__ACTIONS:
			getActions().clear();
			return;
		case Aadlv3Package.BEHAVIOR__SOURCE:
			setSource(SOURCE_EDEFAULT);
			return;
		case Aadlv3Package.BEHAVIOR__SINK:
			setSink(SINK_EDEFAULT);
			return;
		case Aadlv3Package.BEHAVIOR__CATEGORY:
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
		case Aadlv3Package.BEHAVIOR__CONDITION:
			return condition != null;
		case Aadlv3Package.BEHAVIOR__ACTIONS:
			return actions != null && !actions.isEmpty();
		case Aadlv3Package.BEHAVIOR__SOURCE:
			return source != SOURCE_EDEFAULT;
		case Aadlv3Package.BEHAVIOR__SINK:
			return sink != SINK_EDEFAULT;
		case Aadlv3Package.BEHAVIOR__CATEGORY:
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
		result.append(" (source: ");
		result.append(source);
		result.append(", sink: ");
		result.append(sink);
		result.append(", category: ");
		result.append(category);
		result.append(')');
		return result.toString();
	}

} //BehaviorImpl
