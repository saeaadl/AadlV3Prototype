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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadlv3.aadlv3.Aadlv3Package;
import org.osate.aadlv3.aadlv3.Association;
import org.osate.aadlv3.aadlv3.ComponentInterface;
import org.osate.aadlv3.aadlv3.Feature;
import org.osate.aadlv3.aadlv3.PropertySet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.ComponentInterfaceImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.ComponentInterfaceImpl#getFlows <em>Flows</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.ComponentInterfaceImpl#getUseProperties <em>Use Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentInterfaceImpl extends ComponentClassifierImpl implements ComponentInterface {
	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> features;

	/**
	 * The cached value of the '{@link #getFlows() <em>Flows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> flows;

	/**
	 * The cached value of the '{@link #getUseProperties() <em>Use Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertySet> useProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadlv3Package.Literals.COMPONENT_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<Feature>(Feature.class, this,
					Aadlv3Package.COMPONENT_INTERFACE__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Association> getFlows() {
		if (flows == null) {
			flows = new EObjectContainmentEList<Association>(Association.class, this,
					Aadlv3Package.COMPONENT_INTERFACE__FLOWS);
		}
		return flows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PropertySet> getUseProperties() {
		if (useProperties == null) {
			useProperties = new EObjectResolvingEList<PropertySet>(PropertySet.class, this,
					Aadlv3Package.COMPONENT_INTERFACE__USE_PROPERTIES);
		}
		return useProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Aadlv3Package.COMPONENT_INTERFACE__FEATURES:
			return ((InternalEList<?>) getFeatures()).basicRemove(otherEnd, msgs);
		case Aadlv3Package.COMPONENT_INTERFACE__FLOWS:
			return ((InternalEList<?>) getFlows()).basicRemove(otherEnd, msgs);
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
		case Aadlv3Package.COMPONENT_INTERFACE__FEATURES:
			return getFeatures();
		case Aadlv3Package.COMPONENT_INTERFACE__FLOWS:
			return getFlows();
		case Aadlv3Package.COMPONENT_INTERFACE__USE_PROPERTIES:
			return getUseProperties();
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
		case Aadlv3Package.COMPONENT_INTERFACE__FEATURES:
			getFeatures().clear();
			getFeatures().addAll((Collection<? extends Feature>) newValue);
			return;
		case Aadlv3Package.COMPONENT_INTERFACE__FLOWS:
			getFlows().clear();
			getFlows().addAll((Collection<? extends Association>) newValue);
			return;
		case Aadlv3Package.COMPONENT_INTERFACE__USE_PROPERTIES:
			getUseProperties().clear();
			getUseProperties().addAll((Collection<? extends PropertySet>) newValue);
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
		case Aadlv3Package.COMPONENT_INTERFACE__FEATURES:
			getFeatures().clear();
			return;
		case Aadlv3Package.COMPONENT_INTERFACE__FLOWS:
			getFlows().clear();
			return;
		case Aadlv3Package.COMPONENT_INTERFACE__USE_PROPERTIES:
			getUseProperties().clear();
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
		case Aadlv3Package.COMPONENT_INTERFACE__FEATURES:
			return features != null && !features.isEmpty();
		case Aadlv3Package.COMPONENT_INTERFACE__FLOWS:
			return flows != null && !flows.isEmpty();
		case Aadlv3Package.COMPONENT_INTERFACE__USE_PROPERTIES:
			return useProperties != null && !useProperties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentInterfaceImpl
