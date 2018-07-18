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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadlv3.aadlv3.Aadlv3Package;
import org.osate.aadlv3.aadlv3.ConfigurationAssignment;
import org.osate.aadlv3.aadlv3.ModelElementReference;
import org.osate.aadlv3.aadlv3.PropertyAssociation;
import org.osate.aadlv3.aadlv3.TypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.ConfigurationAssignmentImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.ConfigurationAssignmentImpl#getAssignments <em>Assignments</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.ConfigurationAssignmentImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.ConfigurationAssignmentImpl#getPropertyAssociations <em>Property Associations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationAssignmentImpl extends MinimalEObjectImpl.Container implements ConfigurationAssignment {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ModelElementReference target;

	/**
	 * The cached value of the '{@link #getAssignments() <em>Assignments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationAssignment> assignments;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected TypeReference value;

	/**
	 * The cached value of the '{@link #getPropertyAssociations() <em>Property Associations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyAssociation> propertyAssociations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadlv3Package.Literals.CONFIGURATION_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelElementReference getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(ModelElementReference newTarget, NotificationChain msgs) {
		ModelElementReference oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Aadlv3Package.CONFIGURATION_ASSIGNMENT__TARGET, oldTarget, newTarget);
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
	public void setTarget(ModelElementReference newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Aadlv3Package.CONFIGURATION_ASSIGNMENT__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject) newTarget).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Aadlv3Package.CONFIGURATION_ASSIGNMENT__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadlv3Package.CONFIGURATION_ASSIGNMENT__TARGET,
					newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConfigurationAssignment> getAssignments() {
		if (assignments == null) {
			assignments = new EObjectContainmentEList<ConfigurationAssignment>(ConfigurationAssignment.class, this,
					Aadlv3Package.CONFIGURATION_ASSIGNMENT__ASSIGNMENTS);
		}
		return assignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeReference getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(TypeReference newValue, NotificationChain msgs) {
		TypeReference oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Aadlv3Package.CONFIGURATION_ASSIGNMENT__VALUE, oldValue, newValue);
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
	public void setValue(TypeReference newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject) value).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Aadlv3Package.CONFIGURATION_ASSIGNMENT__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject) newValue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Aadlv3Package.CONFIGURATION_ASSIGNMENT__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadlv3Package.CONFIGURATION_ASSIGNMENT__VALUE,
					newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PropertyAssociation> getPropertyAssociations() {
		if (propertyAssociations == null) {
			propertyAssociations = new EObjectContainmentEList<PropertyAssociation>(PropertyAssociation.class, this,
					Aadlv3Package.CONFIGURATION_ASSIGNMENT__PROPERTY_ASSOCIATIONS);
		}
		return propertyAssociations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Aadlv3Package.CONFIGURATION_ASSIGNMENT__TARGET:
			return basicSetTarget(null, msgs);
		case Aadlv3Package.CONFIGURATION_ASSIGNMENT__ASSIGNMENTS:
			return ((InternalEList<?>) getAssignments()).basicRemove(otherEnd, msgs);
		case Aadlv3Package.CONFIGURATION_ASSIGNMENT__VALUE:
			return basicSetValue(null, msgs);
		case Aadlv3Package.CONFIGURATION_ASSIGNMENT__PROPERTY_ASSOCIATIONS:
			return ((InternalEList<?>) getPropertyAssociations()).basicRemove(otherEnd, msgs);
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
		case Aadlv3Package.CONFIGURATION_ASSIGNMENT__TARGET:
			return getTarget();
		case Aadlv3Package.CONFIGURATION_ASSIGNMENT__ASSIGNMENTS:
			return getAssignments();
		case Aadlv3Package.CONFIGURATION_ASSIGNMENT__VALUE:
			return getValue();
		case Aadlv3Package.CONFIGURATION_ASSIGNMENT__PROPERTY_ASSOCIATIONS:
			return getPropertyAssociations();
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
		case Aadlv3Package.CONFIGURATION_ASSIGNMENT__TARGET:
			setTarget((ModelElementReference) newValue);
			return;
		case Aadlv3Package.CONFIGURATION_ASSIGNMENT__ASSIGNMENTS:
			getAssignments().clear();
			getAssignments().addAll((Collection<? extends ConfigurationAssignment>) newValue);
			return;
		case Aadlv3Package.CONFIGURATION_ASSIGNMENT__VALUE:
			setValue((TypeReference) newValue);
			return;
		case Aadlv3Package.CONFIGURATION_ASSIGNMENT__PROPERTY_ASSOCIATIONS:
			getPropertyAssociations().clear();
			getPropertyAssociations().addAll((Collection<? extends PropertyAssociation>) newValue);
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
		case Aadlv3Package.CONFIGURATION_ASSIGNMENT__TARGET:
			setTarget((ModelElementReference) null);
			return;
		case Aadlv3Package.CONFIGURATION_ASSIGNMENT__ASSIGNMENTS:
			getAssignments().clear();
			return;
		case Aadlv3Package.CONFIGURATION_ASSIGNMENT__VALUE:
			setValue((TypeReference) null);
			return;
		case Aadlv3Package.CONFIGURATION_ASSIGNMENT__PROPERTY_ASSOCIATIONS:
			getPropertyAssociations().clear();
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
		case Aadlv3Package.CONFIGURATION_ASSIGNMENT__TARGET:
			return target != null;
		case Aadlv3Package.CONFIGURATION_ASSIGNMENT__ASSIGNMENTS:
			return assignments != null && !assignments.isEmpty();
		case Aadlv3Package.CONFIGURATION_ASSIGNMENT__VALUE:
			return value != null;
		case Aadlv3Package.CONFIGURATION_ASSIGNMENT__PROPERTY_ASSOCIATIONS:
			return propertyAssociations != null && !propertyAssociations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationAssignmentImpl
