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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.aadlv3.aadlv3.Aadlv3Package;
import org.osate.aadlv3.aadlv3.EnumerationLiteral;
import org.osate.aadlv3.aadlv3.Literal;
import org.osate.aadlv3.aadlv3.StateSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.StateSpecificationImpl#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.StateSpecificationImpl#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateSpecificationImpl extends MinimalEObjectImpl.Container implements StateSpecification {
	/**
	 * The cached value of the '{@link #getCurrentState() <em>Current State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentState()
	 * @generated
	 * @ordered
	 */
	protected EnumerationLiteral currentState;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected Literal constraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadlv3Package.Literals.STATE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumerationLiteral getCurrentState() {
		return currentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentState(EnumerationLiteral newCurrentState, NotificationChain msgs) {
		EnumerationLiteral oldCurrentState = currentState;
		currentState = newCurrentState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Aadlv3Package.STATE_SPECIFICATION__CURRENT_STATE, oldCurrentState, newCurrentState);
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
	public void setCurrentState(EnumerationLiteral newCurrentState) {
		if (newCurrentState != currentState) {
			NotificationChain msgs = null;
			if (currentState != null)
				msgs = ((InternalEObject) currentState).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Aadlv3Package.STATE_SPECIFICATION__CURRENT_STATE, null, msgs);
			if (newCurrentState != null)
				msgs = ((InternalEObject) newCurrentState).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Aadlv3Package.STATE_SPECIFICATION__CURRENT_STATE, null, msgs);
			msgs = basicSetCurrentState(newCurrentState, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadlv3Package.STATE_SPECIFICATION__CURRENT_STATE,
					newCurrentState, newCurrentState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Literal getConstraint() {
		if (constraint != null && constraint.eIsProxy()) {
			InternalEObject oldConstraint = (InternalEObject) constraint;
			constraint = (Literal) eResolveProxy(oldConstraint);
			if (constraint != oldConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Aadlv3Package.STATE_SPECIFICATION__CONSTRAINT, oldConstraint, constraint));
			}
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal basicGetConstraint() {
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstraint(Literal newConstraint) {
		Literal oldConstraint = constraint;
		constraint = newConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadlv3Package.STATE_SPECIFICATION__CONSTRAINT,
					oldConstraint, constraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Aadlv3Package.STATE_SPECIFICATION__CURRENT_STATE:
			return basicSetCurrentState(null, msgs);
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
		case Aadlv3Package.STATE_SPECIFICATION__CURRENT_STATE:
			return getCurrentState();
		case Aadlv3Package.STATE_SPECIFICATION__CONSTRAINT:
			if (resolve)
				return getConstraint();
			return basicGetConstraint();
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
		case Aadlv3Package.STATE_SPECIFICATION__CURRENT_STATE:
			setCurrentState((EnumerationLiteral) newValue);
			return;
		case Aadlv3Package.STATE_SPECIFICATION__CONSTRAINT:
			setConstraint((Literal) newValue);
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
		case Aadlv3Package.STATE_SPECIFICATION__CURRENT_STATE:
			setCurrentState((EnumerationLiteral) null);
			return;
		case Aadlv3Package.STATE_SPECIFICATION__CONSTRAINT:
			setConstraint((Literal) null);
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
		case Aadlv3Package.STATE_SPECIFICATION__CURRENT_STATE:
			return currentState != null;
		case Aadlv3Package.STATE_SPECIFICATION__CONSTRAINT:
			return constraint != null;
		}
		return super.eIsSet(featureID);
	}

} //StateSpecificationImpl
