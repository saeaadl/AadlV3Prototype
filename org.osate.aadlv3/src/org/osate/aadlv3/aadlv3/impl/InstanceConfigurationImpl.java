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

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.osate.aadlv3.aadlv3.Aadlv3Package;
import org.osate.aadlv3.aadlv3.InstanceConfiguration;
import org.osate.aadlv3.aadlv3.PropertyConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.InstanceConfigurationImpl#getPropertyConstraint <em>Property Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceConfigurationImpl extends SubcomponentImpl implements InstanceConfiguration {
	/**
	 * The cached value of the '{@link #getPropertyConstraint() <em>Property Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyConstraint()
	 * @generated
	 * @ordered
	 */
	protected PropertyConstraint propertyConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadlv3Package.Literals.INSTANCE_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyConstraint getPropertyConstraint() {
		return propertyConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyConstraint(PropertyConstraint newPropertyConstraint,
			NotificationChain msgs) {
		PropertyConstraint oldPropertyConstraint = propertyConstraint;
		propertyConstraint = newPropertyConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Aadlv3Package.INSTANCE_CONFIGURATION__PROPERTY_CONSTRAINT, oldPropertyConstraint,
					newPropertyConstraint);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropertyConstraint(PropertyConstraint newPropertyConstraint) {
		if (newPropertyConstraint != propertyConstraint) {
			NotificationChain msgs = null;
			if (propertyConstraint != null)
				msgs = ((InternalEObject) propertyConstraint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Aadlv3Package.INSTANCE_CONFIGURATION__PROPERTY_CONSTRAINT, null, msgs);
			if (newPropertyConstraint != null)
				msgs = ((InternalEObject) newPropertyConstraint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Aadlv3Package.INSTANCE_CONFIGURATION__PROPERTY_CONSTRAINT, null, msgs);
			msgs = basicSetPropertyConstraint(newPropertyConstraint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Aadlv3Package.INSTANCE_CONFIGURATION__PROPERTY_CONSTRAINT, newPropertyConstraint,
					newPropertyConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Aadlv3Package.INSTANCE_CONFIGURATION__PROPERTY_CONSTRAINT:
			return basicSetPropertyConstraint(null, msgs);
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
		case Aadlv3Package.INSTANCE_CONFIGURATION__PROPERTY_CONSTRAINT:
			return getPropertyConstraint();
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
		case Aadlv3Package.INSTANCE_CONFIGURATION__PROPERTY_CONSTRAINT:
			setPropertyConstraint((PropertyConstraint) newValue);
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
		case Aadlv3Package.INSTANCE_CONFIGURATION__PROPERTY_CONSTRAINT:
			setPropertyConstraint((PropertyConstraint) null);
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
		case Aadlv3Package.INSTANCE_CONFIGURATION__PROPERTY_CONSTRAINT:
			return propertyConstraint != null;
		}
		return super.eIsSet(featureID);
	}

} //InstanceConfigurationImpl
