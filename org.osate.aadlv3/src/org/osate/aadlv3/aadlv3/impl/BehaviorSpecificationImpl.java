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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.osate.aadlv3.aadlv3.Aadlv3Package;
import org.osate.aadlv3.aadlv3.BehaviorRule;
import org.osate.aadlv3.aadlv3.BehaviorSpecification;
import org.osate.aadlv3.aadlv3.Generator;
import org.osate.aadlv3.aadlv3.StateTransition;
import org.osate.aadlv3.aadlv3.StateVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.BehaviorSpecificationImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.BehaviorSpecificationImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.BehaviorSpecificationImpl#getStateVariables <em>State Variables</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.BehaviorSpecificationImpl#getGenerators <em>Generators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviorSpecificationImpl extends AnnexSubclauseImpl implements BehaviorSpecification {
	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<StateTransition> transitions;

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
	 * The cached value of the '{@link #getStateVariables() <em>State Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<StateVariable> stateVariables;

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
	public EList<StateTransition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<StateTransition>(StateTransition.class, this,
					Aadlv3Package.BEHAVIOR_SPECIFICATION__TRANSITIONS);
		}
		return transitions;
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
					Aadlv3Package.BEHAVIOR_SPECIFICATION__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StateVariable> getStateVariables() {
		if (stateVariables == null) {
			stateVariables = new EObjectContainmentEList<StateVariable>(StateVariable.class, this,
					Aadlv3Package.BEHAVIOR_SPECIFICATION__STATE_VARIABLES);
		}
		return stateVariables;
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
					Aadlv3Package.BEHAVIOR_SPECIFICATION__GENERATORS);
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
		case Aadlv3Package.BEHAVIOR_SPECIFICATION__TRANSITIONS:
			return ((InternalEList<?>) getTransitions()).basicRemove(otherEnd, msgs);
		case Aadlv3Package.BEHAVIOR_SPECIFICATION__RULES:
			return ((InternalEList<?>) getRules()).basicRemove(otherEnd, msgs);
		case Aadlv3Package.BEHAVIOR_SPECIFICATION__STATE_VARIABLES:
			return ((InternalEList<?>) getStateVariables()).basicRemove(otherEnd, msgs);
		case Aadlv3Package.BEHAVIOR_SPECIFICATION__GENERATORS:
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
		case Aadlv3Package.BEHAVIOR_SPECIFICATION__TRANSITIONS:
			return getTransitions();
		case Aadlv3Package.BEHAVIOR_SPECIFICATION__RULES:
			return getRules();
		case Aadlv3Package.BEHAVIOR_SPECIFICATION__STATE_VARIABLES:
			return getStateVariables();
		case Aadlv3Package.BEHAVIOR_SPECIFICATION__GENERATORS:
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
		case Aadlv3Package.BEHAVIOR_SPECIFICATION__TRANSITIONS:
			getTransitions().clear();
			getTransitions().addAll((Collection<? extends StateTransition>) newValue);
			return;
		case Aadlv3Package.BEHAVIOR_SPECIFICATION__RULES:
			getRules().clear();
			getRules().addAll((Collection<? extends BehaviorRule>) newValue);
			return;
		case Aadlv3Package.BEHAVIOR_SPECIFICATION__STATE_VARIABLES:
			getStateVariables().clear();
			getStateVariables().addAll((Collection<? extends StateVariable>) newValue);
			return;
		case Aadlv3Package.BEHAVIOR_SPECIFICATION__GENERATORS:
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
		case Aadlv3Package.BEHAVIOR_SPECIFICATION__TRANSITIONS:
			getTransitions().clear();
			return;
		case Aadlv3Package.BEHAVIOR_SPECIFICATION__RULES:
			getRules().clear();
			return;
		case Aadlv3Package.BEHAVIOR_SPECIFICATION__STATE_VARIABLES:
			getStateVariables().clear();
			return;
		case Aadlv3Package.BEHAVIOR_SPECIFICATION__GENERATORS:
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
		case Aadlv3Package.BEHAVIOR_SPECIFICATION__TRANSITIONS:
			return transitions != null && !transitions.isEmpty();
		case Aadlv3Package.BEHAVIOR_SPECIFICATION__RULES:
			return rules != null && !rules.isEmpty();
		case Aadlv3Package.BEHAVIOR_SPECIFICATION__STATE_VARIABLES:
			return stateVariables != null && !stateVariables.isEmpty();
		case Aadlv3Package.BEHAVIOR_SPECIFICATION__GENERATORS:
			return generators != null && !generators.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BehaviorSpecificationImpl
