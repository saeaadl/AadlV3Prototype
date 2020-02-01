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
package org.osate.av3instance.av3instance;

import org.eclipse.emf.common.util.EList;
import org.osate.aadlv3.aadlv3.ComponentCategory;
import org.osate.aadlv3.aadlv3.Subcomponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.av3instance.av3instance.ComponentInstance#getCategory <em>Category</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.ComponentInstance#getComponents <em>Components</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.ComponentInstance#getComponent <em>Component</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.ComponentInstance#getConnections <em>Connections</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.ComponentInstance#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.ComponentInstance#getPaths <em>Paths</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.ComponentInstance#getBehaviors <em>Behaviors</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.ComponentInstance#getGenerators <em>Generators</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.ComponentInstance#getStateVariables <em>State Variables</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.ComponentInstance#getActions <em>Actions</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.ComponentInstance#getStateTransitions <em>State Transitions</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.ComponentInstance#getStateSynchronizations <em>State Synchronizations</em>}</li>
 * </ul>
 *
 * @see org.osate.av3instance.av3instance.Av3instancePackage#getComponentInstance()
 * @model
 * @generated
 */
public interface ComponentInstance extends InstanceObject {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The default value is <code>"interface"</code>.
	 * The literals are from the enumeration {@link org.osate.aadlv3.aadlv3.ComponentCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see org.osate.aadlv3.aadlv3.ComponentCategory
	 * @see #setCategory(ComponentCategory)
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getComponentInstance_Category()
	 * @model default="interface"
	 * @generated
	 */
	ComponentCategory getCategory();

	/**
	 * Sets the value of the '{@link org.osate.av3instance.av3instance.ComponentInstance#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see org.osate.aadlv3.aadlv3.ComponentCategory
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(ComponentCategory value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.av3instance.av3instance.ComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getComponentInstance_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentInstance> getComponents();

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(Subcomponent)
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getComponentInstance_Component()
	 * @model
	 * @generated
	 */
	Subcomponent getComponent();

	/**
	 * Sets the value of the '{@link org.osate.av3instance.av3instance.ComponentInstance#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Subcomponent value);

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.av3instance.av3instance.AssociationInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getComponentInstance_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<AssociationInstance> getConnections();

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.av3instance.av3instance.FeatureInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getComponentInstance_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeatureInstance> getFeatures();

	/**
	 * Returns the value of the '<em><b>Paths</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.av3instance.av3instance.PathInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paths</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paths</em>' containment reference list.
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getComponentInstance_Paths()
	 * @model containment="true"
	 * @generated
	 */
	EList<PathInstance> getPaths();

	/**
	 * Returns the value of the '<em><b>Behaviors</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.av3instance.av3instance.BehaviorInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviors</em>' containment reference list.
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getComponentInstance_Behaviors()
	 * @model containment="true"
	 * @generated
	 */
	EList<BehaviorInstance> getBehaviors();

	/**
	 * Returns the value of the '<em><b>Generators</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.av3instance.av3instance.GeneratorInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generators</em>' containment reference list.
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getComponentInstance_Generators()
	 * @model containment="true"
	 * @generated
	 */
	EList<GeneratorInstance> getGenerators();

	/**
	 * Returns the value of the '<em><b>State Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.av3instance.av3instance.StateVariableInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Variables</em>' containment reference list.
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getComponentInstance_StateVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<StateVariableInstance> getStateVariables();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.av3instance.av3instance.ConstrainedInstanceObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getComponentInstance_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConstrainedInstanceObject> getActions();

	/**
	 * Returns the value of the '<em><b>State Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.av3instance.av3instance.StateTransitionInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Transitions</em>' containment reference list.
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getComponentInstance_StateTransitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<StateTransitionInstance> getStateTransitions();

	/**
	 * Returns the value of the '<em><b>State Synchronizations</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.av3instance.av3instance.StateSynchronizationInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Synchronizations</em>' containment reference list.
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getComponentInstance_StateSynchronizations()
	 * @model containment="true"
	 * @generated
	 */
	EList<StateSynchronizationInstance> getStateSynchronizations();

} // ComponentInstance
