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
import org.osate.aadlv3.aadlv3.BehaviorRule;
import org.osate.aadlv3.aadlv3.BehaviorSpecification;
import org.osate.aadlv3.aadlv3.EMSubclause;
import org.osate.aadlv3.aadlv3.Generator;
import org.osate.aadlv3.aadlv3.TypeDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EM Subclause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.EMSubclauseImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.EMSubclauseImpl#getStates <em>States</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.EMSubclauseImpl#getGenerators <em>Generators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EMSubclauseImpl extends AnnexSubclauseImpl implements EMSubclause {
	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviorRule> rules;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected TypeDef states;

	/**
	 * The cached value of the '{@link #getGenerators() <em>Generators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerators()
	 * @generated
	 * @ordered
	 */
	protected EList<Generator> generators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMSubclauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadlv3Package.Literals.EM_SUBCLAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BehaviorRule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<BehaviorRule>(BehaviorRule.class, this,
					Aadlv3Package.EM_SUBCLAUSE__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeDef getStates() {
		if (states != null && states.eIsProxy()) {
			InternalEObject oldStates = (InternalEObject) states;
			states = (TypeDef) eResolveProxy(oldStates);
			if (states != oldStates) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadlv3Package.EM_SUBCLAUSE__STATES,
							oldStates, states));
			}
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDef basicGetStates() {
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStates(TypeDef newStates) {
		TypeDef oldStates = states;
		states = newStates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadlv3Package.EM_SUBCLAUSE__STATES, oldStates,
					states));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Generator> getGenerators() {
		if (generators == null) {
			generators = new EObjectContainmentEList<Generator>(Generator.class, this,
					Aadlv3Package.EM_SUBCLAUSE__GENERATORS);
		}
		return generators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Aadlv3Package.EM_SUBCLAUSE__RULES:
			return ((InternalEList<?>) getRules()).basicRemove(otherEnd, msgs);
		case Aadlv3Package.EM_SUBCLAUSE__GENERATORS:
			return ((InternalEList<?>) getGenerators()).basicRemove(otherEnd, msgs);
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
		case Aadlv3Package.EM_SUBCLAUSE__RULES:
			return getRules();
		case Aadlv3Package.EM_SUBCLAUSE__STATES:
			if (resolve)
				return getStates();
			return basicGetStates();
		case Aadlv3Package.EM_SUBCLAUSE__GENERATORS:
			return getGenerators();
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
		case Aadlv3Package.EM_SUBCLAUSE__RULES:
			getRules().clear();
			getRules().addAll((Collection<? extends BehaviorRule>) newValue);
			return;
		case Aadlv3Package.EM_SUBCLAUSE__STATES:
			setStates((TypeDef) newValue);
			return;
		case Aadlv3Package.EM_SUBCLAUSE__GENERATORS:
			getGenerators().clear();
			getGenerators().addAll((Collection<? extends Generator>) newValue);
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
		case Aadlv3Package.EM_SUBCLAUSE__RULES:
			getRules().clear();
			return;
		case Aadlv3Package.EM_SUBCLAUSE__STATES:
			setStates((TypeDef) null);
			return;
		case Aadlv3Package.EM_SUBCLAUSE__GENERATORS:
			getGenerators().clear();
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
		case Aadlv3Package.EM_SUBCLAUSE__RULES:
			return rules != null && !rules.isEmpty();
		case Aadlv3Package.EM_SUBCLAUSE__STATES:
			return states != null;
		case Aadlv3Package.EM_SUBCLAUSE__GENERATORS:
			return generators != null && !generators.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == BehaviorSpecification.class) {
			switch (derivedFeatureID) {
			case Aadlv3Package.EM_SUBCLAUSE__RULES:
				return Aadlv3Package.BEHAVIOR_SPECIFICATION__RULES;
			case Aadlv3Package.EM_SUBCLAUSE__STATES:
				return Aadlv3Package.BEHAVIOR_SPECIFICATION__STATES;
			case Aadlv3Package.EM_SUBCLAUSE__GENERATORS:
				return Aadlv3Package.BEHAVIOR_SPECIFICATION__GENERATORS;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == BehaviorSpecification.class) {
			switch (baseFeatureID) {
			case Aadlv3Package.BEHAVIOR_SPECIFICATION__RULES:
				return Aadlv3Package.EM_SUBCLAUSE__RULES;
			case Aadlv3Package.BEHAVIOR_SPECIFICATION__STATES:
				return Aadlv3Package.EM_SUBCLAUSE__STATES;
			case Aadlv3Package.BEHAVIOR_SPECIFICATION__GENERATORS:
				return Aadlv3Package.EM_SUBCLAUSE__GENERATORS;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EMSubclauseImpl
