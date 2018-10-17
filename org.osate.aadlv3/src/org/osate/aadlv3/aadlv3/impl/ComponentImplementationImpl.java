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
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadlv3.aadlv3.Aadlv3Package;
import org.osate.aadlv3.aadlv3.Association;
import org.osate.aadlv3.aadlv3.Component;
import org.osate.aadlv3.aadlv3.ComponentImplementation;
import org.osate.aadlv3.aadlv3.ConfigurationAssignment;
import org.osate.aadlv3.aadlv3.PathSequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.ComponentImplementationImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.ComponentImplementationImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.ComponentImplementationImpl#getAssignments <em>Assignments</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.ComponentImplementationImpl#getFlowAssignments <em>Flow Assignments</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.ComponentImplementationImpl#getPaths <em>Paths</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImplementationImpl extends ComponentRealizationImpl implements ComponentImplementation {
	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;

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
	 * The cached value of the '{@link #getAssignments() <em>Assignments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationAssignment> assignments;

	/**
	 * The cached value of the '{@link #getFlowAssignments() <em>Flow Assignments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<PathSequence> flowAssignments;

	/**
	 * The cached value of the '{@link #getPaths() <em>Paths</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaths()
	 * @generated
	 * @ordered
	 */
	protected EList<PathSequence> paths;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadlv3Package.Literals.COMPONENT_IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<Component>(Component.class, this,
					Aadlv3Package.COMPONENT_IMPLEMENTATION__COMPONENTS);
		}
		return components;
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
					Aadlv3Package.COMPONENT_IMPLEMENTATION__CONNECTIONS);
		}
		return connections;
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
					Aadlv3Package.COMPONENT_IMPLEMENTATION__ASSIGNMENTS);
		}
		return assignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PathSequence> getFlowAssignments() {
		if (flowAssignments == null) {
			flowAssignments = new EObjectContainmentEList<PathSequence>(PathSequence.class, this,
					Aadlv3Package.COMPONENT_IMPLEMENTATION__FLOW_ASSIGNMENTS);
		}
		return flowAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PathSequence> getPaths() {
		if (paths == null) {
			paths = new EObjectContainmentEList<PathSequence>(PathSequence.class, this,
					Aadlv3Package.COMPONENT_IMPLEMENTATION__PATHS);
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
		case Aadlv3Package.COMPONENT_IMPLEMENTATION__COMPONENTS:
			return ((InternalEList<?>) getComponents()).basicRemove(otherEnd, msgs);
		case Aadlv3Package.COMPONENT_IMPLEMENTATION__CONNECTIONS:
			return ((InternalEList<?>) getConnections()).basicRemove(otherEnd, msgs);
		case Aadlv3Package.COMPONENT_IMPLEMENTATION__ASSIGNMENTS:
			return ((InternalEList<?>) getAssignments()).basicRemove(otherEnd, msgs);
		case Aadlv3Package.COMPONENT_IMPLEMENTATION__FLOW_ASSIGNMENTS:
			return ((InternalEList<?>) getFlowAssignments()).basicRemove(otherEnd, msgs);
		case Aadlv3Package.COMPONENT_IMPLEMENTATION__PATHS:
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
		case Aadlv3Package.COMPONENT_IMPLEMENTATION__COMPONENTS:
			return getComponents();
		case Aadlv3Package.COMPONENT_IMPLEMENTATION__CONNECTIONS:
			return getConnections();
		case Aadlv3Package.COMPONENT_IMPLEMENTATION__ASSIGNMENTS:
			return getAssignments();
		case Aadlv3Package.COMPONENT_IMPLEMENTATION__FLOW_ASSIGNMENTS:
			return getFlowAssignments();
		case Aadlv3Package.COMPONENT_IMPLEMENTATION__PATHS:
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
		case Aadlv3Package.COMPONENT_IMPLEMENTATION__COMPONENTS:
			getComponents().clear();
			getComponents().addAll((Collection<? extends Component>) newValue);
			return;
		case Aadlv3Package.COMPONENT_IMPLEMENTATION__CONNECTIONS:
			getConnections().clear();
			getConnections().addAll((Collection<? extends Association>) newValue);
			return;
		case Aadlv3Package.COMPONENT_IMPLEMENTATION__ASSIGNMENTS:
			getAssignments().clear();
			getAssignments().addAll((Collection<? extends ConfigurationAssignment>) newValue);
			return;
		case Aadlv3Package.COMPONENT_IMPLEMENTATION__FLOW_ASSIGNMENTS:
			getFlowAssignments().clear();
			getFlowAssignments().addAll((Collection<? extends PathSequence>) newValue);
			return;
		case Aadlv3Package.COMPONENT_IMPLEMENTATION__PATHS:
			getPaths().clear();
			getPaths().addAll((Collection<? extends PathSequence>) newValue);
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
		case Aadlv3Package.COMPONENT_IMPLEMENTATION__COMPONENTS:
			getComponents().clear();
			return;
		case Aadlv3Package.COMPONENT_IMPLEMENTATION__CONNECTIONS:
			getConnections().clear();
			return;
		case Aadlv3Package.COMPONENT_IMPLEMENTATION__ASSIGNMENTS:
			getAssignments().clear();
			return;
		case Aadlv3Package.COMPONENT_IMPLEMENTATION__FLOW_ASSIGNMENTS:
			getFlowAssignments().clear();
			return;
		case Aadlv3Package.COMPONENT_IMPLEMENTATION__PATHS:
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
		case Aadlv3Package.COMPONENT_IMPLEMENTATION__COMPONENTS:
			return components != null && !components.isEmpty();
		case Aadlv3Package.COMPONENT_IMPLEMENTATION__CONNECTIONS:
			return connections != null && !connections.isEmpty();
		case Aadlv3Package.COMPONENT_IMPLEMENTATION__ASSIGNMENTS:
			return assignments != null && !assignments.isEmpty();
		case Aadlv3Package.COMPONENT_IMPLEMENTATION__FLOW_ASSIGNMENTS:
			return flowAssignments != null && !flowAssignments.isEmpty();
		case Aadlv3Package.COMPONENT_IMPLEMENTATION__PATHS:
			return paths != null && !paths.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentImplementationImpl
