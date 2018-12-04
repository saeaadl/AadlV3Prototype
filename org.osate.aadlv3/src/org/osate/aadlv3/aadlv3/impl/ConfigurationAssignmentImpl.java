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
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.ConfigurationAssignmentImpl#getConfigurationAssignments <em>Configuration Assignments</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.ConfigurationAssignmentImpl#getAssignedClassifiers <em>Assigned Classifiers</em>}</li>
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
	 * The cached value of the '{@link #getConfigurationAssignments() <em>Configuration Assignments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationAssignment> configurationAssignments;

	/**
	 * The cached value of the '{@link #getAssignedClassifiers() <em>Assigned Classifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedClassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeReference> assignedClassifiers;

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
	public EList<ConfigurationAssignment> getConfigurationAssignments() {
		if (configurationAssignments == null) {
			configurationAssignments = new EObjectContainmentEList<ConfigurationAssignment>(
					ConfigurationAssignment.class, this,
					Aadlv3Package.CONFIGURATION_ASSIGNMENT__CONFIGURATION_ASSIGNMENTS);
		}
		return configurationAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeReference> getAssignedClassifiers() {
		if (assignedClassifiers == null) {
			assignedClassifiers = new EObjectContainmentEList<TypeReference>(TypeReference.class, this,
					Aadlv3Package.CONFIGURATION_ASSIGNMENT__ASSIGNED_CLASSIFIERS);
		}
		return assignedClassifiers;
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
		case Aadlv3Package.CONFIGURATION_ASSIGNMENT__CONFIGURATION_ASSIGNMENTS:
			return ((InternalEList<?>) getConfigurationAssignments()).basicRemove(otherEnd, msgs);
		case Aadlv3Package.CONFIGURATION_ASSIGNMENT__ASSIGNED_CLASSIFIERS:
			return ((InternalEList<?>) getAssignedClassifiers()).basicRemove(otherEnd, msgs);
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
		case Aadlv3Package.CONFIGURATION_ASSIGNMENT__CONFIGURATION_ASSIGNMENTS:
			return getConfigurationAssignments();
		case Aadlv3Package.CONFIGURATION_ASSIGNMENT__ASSIGNED_CLASSIFIERS:
			return getAssignedClassifiers();
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
		case Aadlv3Package.CONFIGURATION_ASSIGNMENT__CONFIGURATION_ASSIGNMENTS:
			getConfigurationAssignments().clear();
			getConfigurationAssignments().addAll((Collection<? extends ConfigurationAssignment>) newValue);
			return;
		case Aadlv3Package.CONFIGURATION_ASSIGNMENT__ASSIGNED_CLASSIFIERS:
			getAssignedClassifiers().clear();
			getAssignedClassifiers().addAll((Collection<? extends TypeReference>) newValue);
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
		case Aadlv3Package.CONFIGURATION_ASSIGNMENT__CONFIGURATION_ASSIGNMENTS:
			getConfigurationAssignments().clear();
			return;
		case Aadlv3Package.CONFIGURATION_ASSIGNMENT__ASSIGNED_CLASSIFIERS:
			getAssignedClassifiers().clear();
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
		case Aadlv3Package.CONFIGURATION_ASSIGNMENT__CONFIGURATION_ASSIGNMENTS:
			return configurationAssignments != null && !configurationAssignments.isEmpty();
		case Aadlv3Package.CONFIGURATION_ASSIGNMENT__ASSIGNED_CLASSIFIERS:
			return assignedClassifiers != null && !assignedClassifiers.isEmpty();
		case Aadlv3Package.CONFIGURATION_ASSIGNMENT__PROPERTY_ASSOCIATIONS:
			return propertyAssociations != null && !propertyAssociations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationAssignmentImpl
