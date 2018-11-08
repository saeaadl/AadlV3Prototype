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
package org.osate.av3instance.av3instance.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadlv3.aadlv3.Component;
import org.osate.aadlv3.aadlv3.ComponentCategory;

import org.osate.av3instance.av3instance.AssociationInstance;
import org.osate.av3instance.av3instance.Av3instancePackage;
import org.osate.av3instance.av3instance.ComponentInstance;
import org.osate.av3instance.av3instance.FeatureInstance;
import org.osate.av3instance.av3instance.PathInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.av3instance.av3instance.impl.ComponentInstanceImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.ComponentInstanceImpl#getSubcomponents <em>Subcomponents</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.ComponentInstanceImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.ComponentInstanceImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.ComponentInstanceImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.ComponentInstanceImpl#getFlowspecs <em>Flowspecs</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.ComponentInstanceImpl#getPaths <em>Paths</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentInstanceImpl extends InstanceObjectImpl implements ComponentInstance {
	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final ComponentCategory CATEGORY_EDEFAULT = ComponentCategory.ABSTRACT;

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
	 * The cached value of the '{@link #getSubcomponents() <em>Subcomponents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubcomponents()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInstance> subcomponents;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected Component component;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<AssociationInstance> connections;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureInstance> features;

	/**
	 * The cached value of the '{@link #getFlowspecs() <em>Flowspecs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowspecs()
	 * @generated
	 * @ordered
	 */
	protected EList<AssociationInstance> flowspecs;

	/**
	 * The cached value of the '{@link #getPaths() <em>Paths</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaths()
	 * @generated
	 * @ordered
	 */
	protected EList<PathInstance> paths;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Av3instancePackage.Literals.COMPONENT_INSTANCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Av3instancePackage.COMPONENT_INSTANCE__CATEGORY,
					oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentInstance> getSubcomponents() {
		if (subcomponents == null) {
			subcomponents = new EObjectContainmentEList<ComponentInstance>(ComponentInstance.class, this,
					Av3instancePackage.COMPONENT_INSTANCE__SUBCOMPONENTS);
		}
		return subcomponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component getComponent() {
		if (component != null && component.eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject) component;
			component = (Component) eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Av3instancePackage.COMPONENT_INSTANCE__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponent(Component newComponent) {
		Component oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Av3instancePackage.COMPONENT_INSTANCE__COMPONENT,
					oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AssociationInstance> getConnections() {
		if (connections == null) {
			connections = new EObjectContainmentEList<AssociationInstance>(AssociationInstance.class, this,
					Av3instancePackage.COMPONENT_INSTANCE__CONNECTIONS);
		}
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FeatureInstance> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<FeatureInstance>(FeatureInstance.class, this,
					Av3instancePackage.COMPONENT_INSTANCE__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AssociationInstance> getFlowspecs() {
		if (flowspecs == null) {
			flowspecs = new EObjectContainmentEList<AssociationInstance>(AssociationInstance.class, this,
					Av3instancePackage.COMPONENT_INSTANCE__FLOWSPECS);
		}
		return flowspecs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PathInstance> getPaths() {
		if (paths == null) {
			paths = new EObjectContainmentEList<PathInstance>(PathInstance.class, this,
					Av3instancePackage.COMPONENT_INSTANCE__PATHS);
		}
		return paths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Av3instancePackage.COMPONENT_INSTANCE__SUBCOMPONENTS:
			return ((InternalEList<?>) getSubcomponents()).basicRemove(otherEnd, msgs);
		case Av3instancePackage.COMPONENT_INSTANCE__CONNECTIONS:
			return ((InternalEList<?>) getConnections()).basicRemove(otherEnd, msgs);
		case Av3instancePackage.COMPONENT_INSTANCE__FEATURES:
			return ((InternalEList<?>) getFeatures()).basicRemove(otherEnd, msgs);
		case Av3instancePackage.COMPONENT_INSTANCE__FLOWSPECS:
			return ((InternalEList<?>) getFlowspecs()).basicRemove(otherEnd, msgs);
		case Av3instancePackage.COMPONENT_INSTANCE__PATHS:
			return ((InternalEList<?>) getPaths()).basicRemove(otherEnd, msgs);
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
		case Av3instancePackage.COMPONENT_INSTANCE__CATEGORY:
			return getCategory();
		case Av3instancePackage.COMPONENT_INSTANCE__SUBCOMPONENTS:
			return getSubcomponents();
		case Av3instancePackage.COMPONENT_INSTANCE__COMPONENT:
			if (resolve)
				return getComponent();
			return basicGetComponent();
		case Av3instancePackage.COMPONENT_INSTANCE__CONNECTIONS:
			return getConnections();
		case Av3instancePackage.COMPONENT_INSTANCE__FEATURES:
			return getFeatures();
		case Av3instancePackage.COMPONENT_INSTANCE__FLOWSPECS:
			return getFlowspecs();
		case Av3instancePackage.COMPONENT_INSTANCE__PATHS:
			return getPaths();
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
		case Av3instancePackage.COMPONENT_INSTANCE__CATEGORY:
			setCategory((ComponentCategory) newValue);
			return;
		case Av3instancePackage.COMPONENT_INSTANCE__SUBCOMPONENTS:
			getSubcomponents().clear();
			getSubcomponents().addAll((Collection<? extends ComponentInstance>) newValue);
			return;
		case Av3instancePackage.COMPONENT_INSTANCE__COMPONENT:
			setComponent((Component) newValue);
			return;
		case Av3instancePackage.COMPONENT_INSTANCE__CONNECTIONS:
			getConnections().clear();
			getConnections().addAll((Collection<? extends AssociationInstance>) newValue);
			return;
		case Av3instancePackage.COMPONENT_INSTANCE__FEATURES:
			getFeatures().clear();
			getFeatures().addAll((Collection<? extends FeatureInstance>) newValue);
			return;
		case Av3instancePackage.COMPONENT_INSTANCE__FLOWSPECS:
			getFlowspecs().clear();
			getFlowspecs().addAll((Collection<? extends AssociationInstance>) newValue);
			return;
		case Av3instancePackage.COMPONENT_INSTANCE__PATHS:
			getPaths().clear();
			getPaths().addAll((Collection<? extends PathInstance>) newValue);
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
		case Av3instancePackage.COMPONENT_INSTANCE__CATEGORY:
			setCategory(CATEGORY_EDEFAULT);
			return;
		case Av3instancePackage.COMPONENT_INSTANCE__SUBCOMPONENTS:
			getSubcomponents().clear();
			return;
		case Av3instancePackage.COMPONENT_INSTANCE__COMPONENT:
			setComponent((Component) null);
			return;
		case Av3instancePackage.COMPONENT_INSTANCE__CONNECTIONS:
			getConnections().clear();
			return;
		case Av3instancePackage.COMPONENT_INSTANCE__FEATURES:
			getFeatures().clear();
			return;
		case Av3instancePackage.COMPONENT_INSTANCE__FLOWSPECS:
			getFlowspecs().clear();
			return;
		case Av3instancePackage.COMPONENT_INSTANCE__PATHS:
			getPaths().clear();
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
		case Av3instancePackage.COMPONENT_INSTANCE__CATEGORY:
			return category != CATEGORY_EDEFAULT;
		case Av3instancePackage.COMPONENT_INSTANCE__SUBCOMPONENTS:
			return subcomponents != null && !subcomponents.isEmpty();
		case Av3instancePackage.COMPONENT_INSTANCE__COMPONENT:
			return component != null;
		case Av3instancePackage.COMPONENT_INSTANCE__CONNECTIONS:
			return connections != null && !connections.isEmpty();
		case Av3instancePackage.COMPONENT_INSTANCE__FEATURES:
			return features != null && !features.isEmpty();
		case Av3instancePackage.COMPONENT_INSTANCE__FLOWSPECS:
			return flowspecs != null && !flowspecs.isEmpty();
		case Av3instancePackage.COMPONENT_INSTANCE__PATHS:
			return paths != null && !paths.isEmpty();
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
		result.append(" (category: "); //$NON-NLS-1$
		result.append(category);
		result.append(')');
		return result.toString();
	}

} //ComponentInstanceImpl
