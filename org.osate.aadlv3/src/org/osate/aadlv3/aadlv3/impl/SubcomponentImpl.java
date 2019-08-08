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
import org.osate.aadlv3.aadlv3.Association;
import org.osate.aadlv3.aadlv3.ComponentCategory;
import org.osate.aadlv3.aadlv3.Feature;
import org.osate.aadlv3.aadlv3.Subcomponent;
import org.osate.aadlv3.aadlv3.TypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.SubcomponentImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.SubcomponentImpl#getTypeReferences <em>Type References</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.SubcomponentImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.SubcomponentImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.SubcomponentImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.SubcomponentImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubcomponentImpl extends ModelElementImpl implements Subcomponent {
	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final ComponentCategory CATEGORY_EDEFAULT = ComponentCategory.INTERFACE;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected ComponentCategory category = CATEGORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypeReferences() <em>Type References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeReference> typeReferences;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Subcomponent> components;

	/**
	 * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> bindings;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> connections;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubcomponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadlv3Package.Literals.SUBCOMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentCategory getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategory(ComponentCategory newCategory) {
		ComponentCategory oldCategory = category;
		category = newCategory == null ? CATEGORY_EDEFAULT : newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadlv3Package.SUBCOMPONENT__CATEGORY, oldCategory,
					category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeReference> getTypeReferences() {
		if (typeReferences == null) {
			typeReferences = new EObjectContainmentEList<TypeReference>(TypeReference.class, this,
					Aadlv3Package.SUBCOMPONENT__TYPE_REFERENCES);
		}
		return typeReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Subcomponent> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<Subcomponent>(Subcomponent.class, this,
					Aadlv3Package.SUBCOMPONENT__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Association> getBindings() {
		if (bindings == null) {
			bindings = new EObjectContainmentEList<Association>(Association.class, this,
					Aadlv3Package.SUBCOMPONENT__BINDINGS);
		}
		return bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Association> getConnections() {
		if (connections == null) {
			connections = new EObjectContainmentEList<Association>(Association.class, this,
					Aadlv3Package.SUBCOMPONENT__CONNECTIONS);
		}
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<Feature>(Feature.class, this, Aadlv3Package.SUBCOMPONENT__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Aadlv3Package.SUBCOMPONENT__TYPE_REFERENCES:
			return ((InternalEList<?>) getTypeReferences()).basicRemove(otherEnd, msgs);
		case Aadlv3Package.SUBCOMPONENT__COMPONENTS:
			return ((InternalEList<?>) getComponents()).basicRemove(otherEnd, msgs);
		case Aadlv3Package.SUBCOMPONENT__BINDINGS:
			return ((InternalEList<?>) getBindings()).basicRemove(otherEnd, msgs);
		case Aadlv3Package.SUBCOMPONENT__CONNECTIONS:
			return ((InternalEList<?>) getConnections()).basicRemove(otherEnd, msgs);
		case Aadlv3Package.SUBCOMPONENT__FEATURES:
			return ((InternalEList<?>) getFeatures()).basicRemove(otherEnd, msgs);
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
		case Aadlv3Package.SUBCOMPONENT__CATEGORY:
			return getCategory();
		case Aadlv3Package.SUBCOMPONENT__TYPE_REFERENCES:
			return getTypeReferences();
		case Aadlv3Package.SUBCOMPONENT__COMPONENTS:
			return getComponents();
		case Aadlv3Package.SUBCOMPONENT__BINDINGS:
			return getBindings();
		case Aadlv3Package.SUBCOMPONENT__CONNECTIONS:
			return getConnections();
		case Aadlv3Package.SUBCOMPONENT__FEATURES:
			return getFeatures();
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
		case Aadlv3Package.SUBCOMPONENT__CATEGORY:
			setCategory((ComponentCategory) newValue);
			return;
		case Aadlv3Package.SUBCOMPONENT__TYPE_REFERENCES:
			getTypeReferences().clear();
			getTypeReferences().addAll((Collection<? extends TypeReference>) newValue);
			return;
		case Aadlv3Package.SUBCOMPONENT__COMPONENTS:
			getComponents().clear();
			getComponents().addAll((Collection<? extends Subcomponent>) newValue);
			return;
		case Aadlv3Package.SUBCOMPONENT__BINDINGS:
			getBindings().clear();
			getBindings().addAll((Collection<? extends Association>) newValue);
			return;
		case Aadlv3Package.SUBCOMPONENT__CONNECTIONS:
			getConnections().clear();
			getConnections().addAll((Collection<? extends Association>) newValue);
			return;
		case Aadlv3Package.SUBCOMPONENT__FEATURES:
			getFeatures().clear();
			getFeatures().addAll((Collection<? extends Feature>) newValue);
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
		case Aadlv3Package.SUBCOMPONENT__CATEGORY:
			setCategory(CATEGORY_EDEFAULT);
			return;
		case Aadlv3Package.SUBCOMPONENT__TYPE_REFERENCES:
			getTypeReferences().clear();
			return;
		case Aadlv3Package.SUBCOMPONENT__COMPONENTS:
			getComponents().clear();
			return;
		case Aadlv3Package.SUBCOMPONENT__BINDINGS:
			getBindings().clear();
			return;
		case Aadlv3Package.SUBCOMPONENT__CONNECTIONS:
			getConnections().clear();
			return;
		case Aadlv3Package.SUBCOMPONENT__FEATURES:
			getFeatures().clear();
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
		case Aadlv3Package.SUBCOMPONENT__CATEGORY:
			return category != CATEGORY_EDEFAULT;
		case Aadlv3Package.SUBCOMPONENT__TYPE_REFERENCES:
			return typeReferences != null && !typeReferences.isEmpty();
		case Aadlv3Package.SUBCOMPONENT__COMPONENTS:
			return components != null && !components.isEmpty();
		case Aadlv3Package.SUBCOMPONENT__BINDINGS:
			return bindings != null && !bindings.isEmpty();
		case Aadlv3Package.SUBCOMPONENT__CONNECTIONS:
			return connections != null && !connections.isEmpty();
		case Aadlv3Package.SUBCOMPONENT__FEATURES:
			return features != null && !features.isEmpty();
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
		result.append(" (category: ");
		result.append(category);
		result.append(')');
		return result.toString();
	}

} //SubcomponentImpl
