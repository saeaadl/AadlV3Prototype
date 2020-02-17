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
import org.osate.aadlv3.aadlv3.ComponentCategory;

import org.osate.aadlv3.aadlv3.Subcomponent;
import org.osate.av3instance.av3instance.AssociationInstance;
import org.osate.av3instance.av3instance.Av3instancePackage;
import org.osate.av3instance.av3instance.BehaviorInstance;
import org.osate.av3instance.av3instance.ComponentInstance;
import org.osate.av3instance.av3instance.ConstrainedInstanceObject;
import org.osate.av3instance.av3instance.FeatureInstance;
import org.osate.av3instance.av3instance.GeneratorInstance;
import org.osate.av3instance.av3instance.PathInstance;
import org.osate.av3instance.av3instance.StateSynchronizationInstance;
import org.osate.av3instance.av3instance.StateTransitionInstance;
import org.osate.av3instance.av3instance.StateVariableInstance;
import static org.osate.aadlv3.util.AIv3API.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.av3instance.av3instance.impl.ComponentInstanceImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.ComponentInstanceImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.ComponentInstanceImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.ComponentInstanceImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.ComponentInstanceImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.ComponentInstanceImpl#getPaths <em>Paths</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.ComponentInstanceImpl#getBehaviors <em>Behaviors</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.ComponentInstanceImpl#getGenerators <em>Generators</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.ComponentInstanceImpl#getStateVariables <em>State Variables</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.ComponentInstanceImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.ComponentInstanceImpl#getStateTransitions <em>State Transitions</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.ComponentInstanceImpl#getStateSynchronizations <em>State Synchronizations</em>}</li>
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
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInstance> components;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected Subcomponent component;

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
	 * The cached value of the '{@link #getPaths() <em>Paths</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaths()
	 * @generated
	 * @ordered
	 */
	protected EList<PathInstance> paths;

	/**
	 * The cached value of the '{@link #getBehaviors() <em>Behaviors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviors()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviorInstance> behaviors;

	/**
	 * The cached value of the '{@link #getGenerators() <em>Generators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerators()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneratorInstance> generators;

	/**
	 * The cached value of the '{@link #getStateVariables() <em>State Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<StateVariableInstance> stateVariables;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstrainedInstanceObject> actions;

	/**
	 * The cached value of the '{@link #getStateTransitions() <em>State Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<StateTransitionInstance> stateTransitions;

	/**
	 * The cached value of the '{@link #getStateSynchronizations() <em>State Synchronizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateSynchronizations()
	 * @generated
	 * @ordered
	 */
	protected EList<StateSynchronizationInstance> stateSynchronizations;

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
	public EList<ComponentInstance> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<ComponentInstance>(ComponentInstance.class, this,
					Av3instancePackage.COMPONENT_INSTANCE__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subcomponent getComponent() {
		if (component != null && component.eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject) component;
			component = (Subcomponent) eResolveProxy(oldComponent);
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
	public Subcomponent basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponent(Subcomponent newComponent) {
		Subcomponent oldComponent = component;
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
	public EList<BehaviorInstance> getBehaviors() {
		if (behaviors == null) {
			behaviors = new EObjectContainmentEList<BehaviorInstance>(BehaviorInstance.class, this,
					Av3instancePackage.COMPONENT_INSTANCE__BEHAVIORS);
		}
		return behaviors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GeneratorInstance> getGenerators() {
		if (generators == null) {
			generators = new EObjectContainmentEList<GeneratorInstance>(GeneratorInstance.class, this,
					Av3instancePackage.COMPONENT_INSTANCE__GENERATORS);
		}
		return generators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StateVariableInstance> getStateVariables() {
		if (stateVariables == null) {
			stateVariables = new EObjectContainmentEList<StateVariableInstance>(StateVariableInstance.class, this,
					Av3instancePackage.COMPONENT_INSTANCE__STATE_VARIABLES);
		}
		return stateVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConstrainedInstanceObject> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<ConstrainedInstanceObject>(ConstrainedInstanceObject.class, this,
					Av3instancePackage.COMPONENT_INSTANCE__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StateTransitionInstance> getStateTransitions() {
		if (stateTransitions == null) {
			stateTransitions = new EObjectContainmentEList<StateTransitionInstance>(StateTransitionInstance.class, this,
					Av3instancePackage.COMPONENT_INSTANCE__STATE_TRANSITIONS);
		}
		return stateTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StateSynchronizationInstance> getStateSynchronizations() {
		if (stateSynchronizations == null) {
			stateSynchronizations = new EObjectContainmentEList<StateSynchronizationInstance>(
					StateSynchronizationInstance.class, this,
					Av3instancePackage.COMPONENT_INSTANCE__STATE_SYNCHRONIZATIONS);
		}
		return stateSynchronizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Av3instancePackage.COMPONENT_INSTANCE__COMPONENTS:
			return ((InternalEList<?>) getComponents()).basicRemove(otherEnd, msgs);
		case Av3instancePackage.COMPONENT_INSTANCE__CONNECTIONS:
			return ((InternalEList<?>) getConnections()).basicRemove(otherEnd, msgs);
		case Av3instancePackage.COMPONENT_INSTANCE__FEATURES:
			return ((InternalEList<?>) getFeatures()).basicRemove(otherEnd, msgs);
		case Av3instancePackage.COMPONENT_INSTANCE__PATHS:
			return ((InternalEList<?>) getPaths()).basicRemove(otherEnd, msgs);
		case Av3instancePackage.COMPONENT_INSTANCE__BEHAVIORS:
			return ((InternalEList<?>) getBehaviors()).basicRemove(otherEnd, msgs);
		case Av3instancePackage.COMPONENT_INSTANCE__GENERATORS:
			return ((InternalEList<?>) getGenerators()).basicRemove(otherEnd, msgs);
		case Av3instancePackage.COMPONENT_INSTANCE__STATE_VARIABLES:
			return ((InternalEList<?>) getStateVariables()).basicRemove(otherEnd, msgs);
		case Av3instancePackage.COMPONENT_INSTANCE__ACTIONS:
			return ((InternalEList<?>) getActions()).basicRemove(otherEnd, msgs);
		case Av3instancePackage.COMPONENT_INSTANCE__STATE_TRANSITIONS:
			return ((InternalEList<?>) getStateTransitions()).basicRemove(otherEnd, msgs);
		case Av3instancePackage.COMPONENT_INSTANCE__STATE_SYNCHRONIZATIONS:
			return ((InternalEList<?>) getStateSynchronizations()).basicRemove(otherEnd, msgs);
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
		case Av3instancePackage.COMPONENT_INSTANCE__COMPONENTS:
			return getComponents();
		case Av3instancePackage.COMPONENT_INSTANCE__COMPONENT:
			if (resolve)
				return getComponent();
			return basicGetComponent();
		case Av3instancePackage.COMPONENT_INSTANCE__CONNECTIONS:
			return getConnections();
		case Av3instancePackage.COMPONENT_INSTANCE__FEATURES:
			return getFeatures();
		case Av3instancePackage.COMPONENT_INSTANCE__PATHS:
			return getPaths();
		case Av3instancePackage.COMPONENT_INSTANCE__BEHAVIORS:
			return getBehaviors();
		case Av3instancePackage.COMPONENT_INSTANCE__GENERATORS:
			return getGenerators();
		case Av3instancePackage.COMPONENT_INSTANCE__STATE_VARIABLES:
			return getStateVariables();
		case Av3instancePackage.COMPONENT_INSTANCE__ACTIONS:
			return getActions();
		case Av3instancePackage.COMPONENT_INSTANCE__STATE_TRANSITIONS:
			return getStateTransitions();
		case Av3instancePackage.COMPONENT_INSTANCE__STATE_SYNCHRONIZATIONS:
			return getStateSynchronizations();
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
		case Av3instancePackage.COMPONENT_INSTANCE__COMPONENTS:
			getComponents().clear();
			getComponents().addAll((Collection<? extends ComponentInstance>) newValue);
			return;
		case Av3instancePackage.COMPONENT_INSTANCE__COMPONENT:
			setComponent((Subcomponent) newValue);
			return;
		case Av3instancePackage.COMPONENT_INSTANCE__CONNECTIONS:
			getConnections().clear();
			getConnections().addAll((Collection<? extends AssociationInstance>) newValue);
			return;
		case Av3instancePackage.COMPONENT_INSTANCE__FEATURES:
			getFeatures().clear();
			getFeatures().addAll((Collection<? extends FeatureInstance>) newValue);
			return;
		case Av3instancePackage.COMPONENT_INSTANCE__PATHS:
			getPaths().clear();
			getPaths().addAll((Collection<? extends PathInstance>) newValue);
			return;
		case Av3instancePackage.COMPONENT_INSTANCE__BEHAVIORS:
			getBehaviors().clear();
			getBehaviors().addAll((Collection<? extends BehaviorInstance>) newValue);
			return;
		case Av3instancePackage.COMPONENT_INSTANCE__GENERATORS:
			getGenerators().clear();
			getGenerators().addAll((Collection<? extends GeneratorInstance>) newValue);
			return;
		case Av3instancePackage.COMPONENT_INSTANCE__STATE_VARIABLES:
			getStateVariables().clear();
			getStateVariables().addAll((Collection<? extends StateVariableInstance>) newValue);
			return;
		case Av3instancePackage.COMPONENT_INSTANCE__ACTIONS:
			getActions().clear();
			getActions().addAll((Collection<? extends ConstrainedInstanceObject>) newValue);
			return;
		case Av3instancePackage.COMPONENT_INSTANCE__STATE_TRANSITIONS:
			getStateTransitions().clear();
			getStateTransitions().addAll((Collection<? extends StateTransitionInstance>) newValue);
			return;
		case Av3instancePackage.COMPONENT_INSTANCE__STATE_SYNCHRONIZATIONS:
			getStateSynchronizations().clear();
			getStateSynchronizations().addAll((Collection<? extends StateSynchronizationInstance>) newValue);
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
		case Av3instancePackage.COMPONENT_INSTANCE__COMPONENTS:
			getComponents().clear();
			return;
		case Av3instancePackage.COMPONENT_INSTANCE__COMPONENT:
			setComponent((Subcomponent) null);
			return;
		case Av3instancePackage.COMPONENT_INSTANCE__CONNECTIONS:
			getConnections().clear();
			return;
		case Av3instancePackage.COMPONENT_INSTANCE__FEATURES:
			getFeatures().clear();
			return;
		case Av3instancePackage.COMPONENT_INSTANCE__PATHS:
			getPaths().clear();
			return;
		case Av3instancePackage.COMPONENT_INSTANCE__BEHAVIORS:
			getBehaviors().clear();
			return;
		case Av3instancePackage.COMPONENT_INSTANCE__GENERATORS:
			getGenerators().clear();
			return;
		case Av3instancePackage.COMPONENT_INSTANCE__STATE_VARIABLES:
			getStateVariables().clear();
			return;
		case Av3instancePackage.COMPONENT_INSTANCE__ACTIONS:
			getActions().clear();
			return;
		case Av3instancePackage.COMPONENT_INSTANCE__STATE_TRANSITIONS:
			getStateTransitions().clear();
			return;
		case Av3instancePackage.COMPONENT_INSTANCE__STATE_SYNCHRONIZATIONS:
			getStateSynchronizations().clear();
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
		case Av3instancePackage.COMPONENT_INSTANCE__COMPONENTS:
			return components != null && !components.isEmpty();
		case Av3instancePackage.COMPONENT_INSTANCE__COMPONENT:
			return component != null;
		case Av3instancePackage.COMPONENT_INSTANCE__CONNECTIONS:
			return connections != null && !connections.isEmpty();
		case Av3instancePackage.COMPONENT_INSTANCE__FEATURES:
			return features != null && !features.isEmpty();
		case Av3instancePackage.COMPONENT_INSTANCE__PATHS:
			return paths != null && !paths.isEmpty();
		case Av3instancePackage.COMPONENT_INSTANCE__BEHAVIORS:
			return behaviors != null && !behaviors.isEmpty();
		case Av3instancePackage.COMPONENT_INSTANCE__GENERATORS:
			return generators != null && !generators.isEmpty();
		case Av3instancePackage.COMPONENT_INSTANCE__STATE_VARIABLES:
			return stateVariables != null && !stateVariables.isEmpty();
		case Av3instancePackage.COMPONENT_INSTANCE__ACTIONS:
			return actions != null && !actions.isEmpty();
		case Av3instancePackage.COMPONENT_INSTANCE__STATE_TRANSITIONS:
			return stateTransitions != null && !stateTransitions.isEmpty();
		case Av3instancePackage.COMPONENT_INSTANCE__STATE_SYNCHRONIZATIONS:
			return stateSynchronizations != null && !stateSynchronizations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();
		String type = this.getCategory() == null ? "interface"
				: this.getCategory().getLiteral();
		return type + " " + getInstanceObjectPath(this);
	}

} //ComponentInstanceImpl
