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
import org.osate.aadlv3.aadlv3.Component;
import org.osate.aadlv3.aadlv3.PropertySet;
import org.osate.aadlv3.aadlv3.Workingset;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workingset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.WorkingsetImpl#getRootComponents <em>Root Components</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.WorkingsetImpl#getUseProperties <em>Use Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkingsetImpl extends PackageElementImpl implements Workingset {
	/**
	 * The cached value of the '{@link #getRootComponents() <em>Root Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> rootComponents;

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
	protected WorkingsetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadlv3Package.Literals.WORKINGSET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getRootComponents() {
		if (rootComponents == null) {
			rootComponents = new EObjectContainmentEList<Component>(Component.class, this,
					Aadlv3Package.WORKINGSET__ROOT_COMPONENTS);
		}
		return rootComponents;
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
					Aadlv3Package.WORKINGSET__USE_PROPERTIES);
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
		case Aadlv3Package.WORKINGSET__ROOT_COMPONENTS:
			return ((InternalEList<?>) getRootComponents()).basicRemove(otherEnd, msgs);
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
		case Aadlv3Package.WORKINGSET__ROOT_COMPONENTS:
			return getRootComponents();
		case Aadlv3Package.WORKINGSET__USE_PROPERTIES:
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
		case Aadlv3Package.WORKINGSET__ROOT_COMPONENTS:
			getRootComponents().clear();
			getRootComponents().addAll((Collection<? extends Component>) newValue);
			return;
		case Aadlv3Package.WORKINGSET__USE_PROPERTIES:
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
		case Aadlv3Package.WORKINGSET__ROOT_COMPONENTS:
			getRootComponents().clear();
			return;
		case Aadlv3Package.WORKINGSET__USE_PROPERTIES:
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
		case Aadlv3Package.WORKINGSET__ROOT_COMPONENTS:
			return rootComponents != null && !rootComponents.isEmpty();
		case Aadlv3Package.WORKINGSET__USE_PROPERTIES:
			return useProperties != null && !useProperties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WorkingsetImpl
