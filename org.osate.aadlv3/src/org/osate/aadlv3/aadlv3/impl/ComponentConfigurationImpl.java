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
import org.osate.aadlv3.aadlv3.ComponentConfiguration;
import org.osate.aadlv3.aadlv3.ConfigurationAssignment;
import org.osate.aadlv3.aadlv3.ConfigurationParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.ComponentConfigurationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.ComponentConfigurationImpl#getAssignments <em>Assignments</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.ComponentConfigurationImpl#isParameterized <em>Parameterized</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentConfigurationImpl extends ComponentRealizationImpl implements ComponentConfiguration {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationParameter> parameters;

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
	 * The default value of the '{@link #isParameterized() <em>Parameterized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParameterized()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PARAMETERIZED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isParameterized() <em>Parameterized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParameterized()
	 * @generated
	 * @ordered
	 */
	protected boolean parameterized = PARAMETERIZED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadlv3Package.Literals.COMPONENT_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConfigurationParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<ConfigurationParameter>(ConfigurationParameter.class, this,
					Aadlv3Package.COMPONENT_CONFIGURATION__PARAMETERS);
		}
		return parameters;
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
					Aadlv3Package.COMPONENT_CONFIGURATION__ASSIGNMENTS);
		}
		return assignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isParameterized() {
		return parameterized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameterized(boolean newParameterized) {
		boolean oldParameterized = parameterized;
		parameterized = newParameterized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadlv3Package.COMPONENT_CONFIGURATION__PARAMETERIZED,
					oldParameterized, parameterized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Aadlv3Package.COMPONENT_CONFIGURATION__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
		case Aadlv3Package.COMPONENT_CONFIGURATION__ASSIGNMENTS:
			return ((InternalEList<?>) getAssignments()).basicRemove(otherEnd, msgs);
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
		case Aadlv3Package.COMPONENT_CONFIGURATION__PARAMETERS:
			return getParameters();
		case Aadlv3Package.COMPONENT_CONFIGURATION__ASSIGNMENTS:
			return getAssignments();
		case Aadlv3Package.COMPONENT_CONFIGURATION__PARAMETERIZED:
			return isParameterized();
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
		case Aadlv3Package.COMPONENT_CONFIGURATION__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends ConfigurationParameter>) newValue);
			return;
		case Aadlv3Package.COMPONENT_CONFIGURATION__ASSIGNMENTS:
			getAssignments().clear();
			getAssignments().addAll((Collection<? extends ConfigurationAssignment>) newValue);
			return;
		case Aadlv3Package.COMPONENT_CONFIGURATION__PARAMETERIZED:
			setParameterized((Boolean) newValue);
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
		case Aadlv3Package.COMPONENT_CONFIGURATION__PARAMETERS:
			getParameters().clear();
			return;
		case Aadlv3Package.COMPONENT_CONFIGURATION__ASSIGNMENTS:
			getAssignments().clear();
			return;
		case Aadlv3Package.COMPONENT_CONFIGURATION__PARAMETERIZED:
			setParameterized(PARAMETERIZED_EDEFAULT);
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
		case Aadlv3Package.COMPONENT_CONFIGURATION__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case Aadlv3Package.COMPONENT_CONFIGURATION__ASSIGNMENTS:
			return assignments != null && !assignments.isEmpty();
		case Aadlv3Package.COMPONENT_CONFIGURATION__PARAMETERIZED:
			return parameterized != PARAMETERIZED_EDEFAULT;
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
		result.append(" (parameterized: ");
		result.append(parameterized);
		result.append(')');
		return result.toString();
	}

} //ComponentConfigurationImpl
