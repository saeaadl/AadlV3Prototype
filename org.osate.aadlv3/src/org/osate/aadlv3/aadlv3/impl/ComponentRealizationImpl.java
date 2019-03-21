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
import org.osate.aadlv3.aadlv3.ComponentInterface;
import org.osate.aadlv3.aadlv3.ComponentRealization;
import org.osate.aadlv3.aadlv3.ConfigurationAssignment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.ComponentRealizationImpl#getCachedInterfaceReference <em>Cached Interface Reference</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.ComponentRealizationImpl#getConfigurationAssignments <em>Configuration Assignments</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComponentRealizationImpl extends ComponentClassifierImpl implements ComponentRealization {
	/**
	 * The cached value of the '{@link #getCachedInterfaceReference() <em>Cached Interface Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCachedInterfaceReference()
	 * @generated
	 * @ordered
	 */
	protected ComponentInterface cachedInterfaceReference;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentRealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadlv3Package.Literals.COMPONENT_REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentInterface getCachedInterfaceReference() {
		return cachedInterfaceReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCachedInterfaceReference(ComponentInterface newCachedInterfaceReference) {
		ComponentInterface oldCachedInterfaceReference = cachedInterfaceReference;
		cachedInterfaceReference = newCachedInterfaceReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Aadlv3Package.COMPONENT_REALIZATION__CACHED_INTERFACE_REFERENCE, oldCachedInterfaceReference,
					cachedInterfaceReference));
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
					Aadlv3Package.COMPONENT_REALIZATION__CONFIGURATION_ASSIGNMENTS);
		}
		return configurationAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Aadlv3Package.COMPONENT_REALIZATION__CONFIGURATION_ASSIGNMENTS:
			return ((InternalEList<?>) getConfigurationAssignments()).basicRemove(otherEnd, msgs);
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
		case Aadlv3Package.COMPONENT_REALIZATION__CACHED_INTERFACE_REFERENCE:
			return getCachedInterfaceReference();
		case Aadlv3Package.COMPONENT_REALIZATION__CONFIGURATION_ASSIGNMENTS:
			return getConfigurationAssignments();
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
		case Aadlv3Package.COMPONENT_REALIZATION__CACHED_INTERFACE_REFERENCE:
			setCachedInterfaceReference((ComponentInterface) newValue);
			return;
		case Aadlv3Package.COMPONENT_REALIZATION__CONFIGURATION_ASSIGNMENTS:
			getConfigurationAssignments().clear();
			getConfigurationAssignments().addAll((Collection<? extends ConfigurationAssignment>) newValue);
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
		case Aadlv3Package.COMPONENT_REALIZATION__CACHED_INTERFACE_REFERENCE:
			setCachedInterfaceReference((ComponentInterface) null);
			return;
		case Aadlv3Package.COMPONENT_REALIZATION__CONFIGURATION_ASSIGNMENTS:
			getConfigurationAssignments().clear();
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
		case Aadlv3Package.COMPONENT_REALIZATION__CACHED_INTERFACE_REFERENCE:
			return cachedInterfaceReference != null;
		case Aadlv3Package.COMPONENT_REALIZATION__CONFIGURATION_ASSIGNMENTS:
			return configurationAssignments != null && !configurationAssignments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentRealizationImpl
