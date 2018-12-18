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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.aadlv3.aadlv3.Aadlv3Package;
import org.osate.aadlv3.aadlv3.ConfigurationAssignmentPattern;
import org.osate.aadlv3.aadlv3.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Assignment Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.ConfigurationAssignmentPatternImpl#getTargetPattern <em>Target Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationAssignmentPatternImpl extends ConfigurationAssignmentImpl
		implements ConfigurationAssignmentPattern {
	/**
	 * The cached value of the '{@link #getTargetPattern() <em>Target Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPattern()
	 * @generated
	 * @ordered
	 */
	protected Type targetPattern;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationAssignmentPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadlv3Package.Literals.CONFIGURATION_ASSIGNMENT_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getTargetPattern() {
		if (targetPattern != null && targetPattern.eIsProxy()) {
			InternalEObject oldTargetPattern = (InternalEObject) targetPattern;
			targetPattern = (Type) eResolveProxy(oldTargetPattern);
			if (targetPattern != oldTargetPattern) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Aadlv3Package.CONFIGURATION_ASSIGNMENT_PATTERN__TARGET_PATTERN, oldTargetPattern,
							targetPattern));
			}
		}
		return targetPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetTargetPattern() {
		return targetPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetPattern(Type newTargetPattern) {
		Type oldTargetPattern = targetPattern;
		targetPattern = newTargetPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Aadlv3Package.CONFIGURATION_ASSIGNMENT_PATTERN__TARGET_PATTERN, oldTargetPattern, targetPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Aadlv3Package.CONFIGURATION_ASSIGNMENT_PATTERN__TARGET_PATTERN:
			if (resolve)
				return getTargetPattern();
			return basicGetTargetPattern();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Aadlv3Package.CONFIGURATION_ASSIGNMENT_PATTERN__TARGET_PATTERN:
			setTargetPattern((Type) newValue);
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
		case Aadlv3Package.CONFIGURATION_ASSIGNMENT_PATTERN__TARGET_PATTERN:
			setTargetPattern((Type) null);
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
		case Aadlv3Package.CONFIGURATION_ASSIGNMENT_PATTERN__TARGET_PATTERN:
			return targetPattern != null;
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationAssignmentPatternImpl
