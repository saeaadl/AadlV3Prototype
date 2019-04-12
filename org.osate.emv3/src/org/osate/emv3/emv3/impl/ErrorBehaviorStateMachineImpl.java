/**
 * Copyright Text	Copyright 2018 Carnegie Mellon University. All Rights Reserved....
 */
package org.osate.emv3.emv3.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadlv3.aadlv3.impl.NamedElementImpl;

import org.osate.emv3.emv3.Emv3Package;
import org.osate.emv3.emv3.ErrorBehaviorEvent;
import org.osate.emv3.emv3.ErrorBehaviorState;
import org.osate.emv3.emv3.ErrorBehaviorStateMachine;
import org.osate.emv3.emv3.ErrorBehaviorTransition;
import org.osate.emv3.emv3.ErrorModelLibrary;
import org.osate.emv3.emv3.TypeTransformationSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Behavior State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.emv3.emv3.impl.ErrorBehaviorStateMachineImpl#getUseTypes <em>Use Types</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.impl.ErrorBehaviorStateMachineImpl#getUseTransformation <em>Use Transformation</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.impl.ErrorBehaviorStateMachineImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.impl.ErrorBehaviorStateMachineImpl#getStates <em>States</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.impl.ErrorBehaviorStateMachineImpl#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErrorBehaviorStateMachineImpl extends NamedElementImpl implements ErrorBehaviorStateMachine {
	/**
	 * The cached value of the '{@link #getUseTypes() <em>Use Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ErrorModelLibrary> useTypes;

	/**
	 * The cached value of the '{@link #getUseTransformation() <em>Use Transformation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseTransformation()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeTransformationSet> useTransformation;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<ErrorBehaviorEvent> events;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<ErrorBehaviorState> states;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<ErrorBehaviorTransition> transitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorBehaviorStateMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Emv3Package.Literals.ERROR_BEHAVIOR_STATE_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ErrorModelLibrary> getUseTypes() {
		if (useTypes == null) {
			useTypes = new EObjectResolvingEList<ErrorModelLibrary>(ErrorModelLibrary.class, this, Emv3Package.ERROR_BEHAVIOR_STATE_MACHINE__USE_TYPES);
		}
		return useTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeTransformationSet> getUseTransformation() {
		if (useTransformation == null) {
			useTransformation = new EObjectResolvingEList<TypeTransformationSet>(TypeTransformationSet.class, this, Emv3Package.ERROR_BEHAVIOR_STATE_MACHINE__USE_TRANSFORMATION);
		}
		return useTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ErrorBehaviorEvent> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<ErrorBehaviorEvent>(ErrorBehaviorEvent.class, this, Emv3Package.ERROR_BEHAVIOR_STATE_MACHINE__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ErrorBehaviorState> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<ErrorBehaviorState>(ErrorBehaviorState.class, this, Emv3Package.ERROR_BEHAVIOR_STATE_MACHINE__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ErrorBehaviorTransition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<ErrorBehaviorTransition>(ErrorBehaviorTransition.class, this, Emv3Package.ERROR_BEHAVIOR_STATE_MACHINE__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Emv3Package.ERROR_BEHAVIOR_STATE_MACHINE__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case Emv3Package.ERROR_BEHAVIOR_STATE_MACHINE__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case Emv3Package.ERROR_BEHAVIOR_STATE_MACHINE__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
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
			case Emv3Package.ERROR_BEHAVIOR_STATE_MACHINE__USE_TYPES:
				return getUseTypes();
			case Emv3Package.ERROR_BEHAVIOR_STATE_MACHINE__USE_TRANSFORMATION:
				return getUseTransformation();
			case Emv3Package.ERROR_BEHAVIOR_STATE_MACHINE__EVENTS:
				return getEvents();
			case Emv3Package.ERROR_BEHAVIOR_STATE_MACHINE__STATES:
				return getStates();
			case Emv3Package.ERROR_BEHAVIOR_STATE_MACHINE__TRANSITIONS:
				return getTransitions();
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
			case Emv3Package.ERROR_BEHAVIOR_STATE_MACHINE__USE_TYPES:
				getUseTypes().clear();
				getUseTypes().addAll((Collection<? extends ErrorModelLibrary>)newValue);
				return;
			case Emv3Package.ERROR_BEHAVIOR_STATE_MACHINE__USE_TRANSFORMATION:
				getUseTransformation().clear();
				getUseTransformation().addAll((Collection<? extends TypeTransformationSet>)newValue);
				return;
			case Emv3Package.ERROR_BEHAVIOR_STATE_MACHINE__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends ErrorBehaviorEvent>)newValue);
				return;
			case Emv3Package.ERROR_BEHAVIOR_STATE_MACHINE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends ErrorBehaviorState>)newValue);
				return;
			case Emv3Package.ERROR_BEHAVIOR_STATE_MACHINE__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends ErrorBehaviorTransition>)newValue);
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
			case Emv3Package.ERROR_BEHAVIOR_STATE_MACHINE__USE_TYPES:
				getUseTypes().clear();
				return;
			case Emv3Package.ERROR_BEHAVIOR_STATE_MACHINE__USE_TRANSFORMATION:
				getUseTransformation().clear();
				return;
			case Emv3Package.ERROR_BEHAVIOR_STATE_MACHINE__EVENTS:
				getEvents().clear();
				return;
			case Emv3Package.ERROR_BEHAVIOR_STATE_MACHINE__STATES:
				getStates().clear();
				return;
			case Emv3Package.ERROR_BEHAVIOR_STATE_MACHINE__TRANSITIONS:
				getTransitions().clear();
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
			case Emv3Package.ERROR_BEHAVIOR_STATE_MACHINE__USE_TYPES:
				return useTypes != null && !useTypes.isEmpty();
			case Emv3Package.ERROR_BEHAVIOR_STATE_MACHINE__USE_TRANSFORMATION:
				return useTransformation != null && !useTransformation.isEmpty();
			case Emv3Package.ERROR_BEHAVIOR_STATE_MACHINE__EVENTS:
				return events != null && !events.isEmpty();
			case Emv3Package.ERROR_BEHAVIOR_STATE_MACHINE__STATES:
				return states != null && !states.isEmpty();
			case Emv3Package.ERROR_BEHAVIOR_STATE_MACHINE__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ErrorBehaviorStateMachineImpl
