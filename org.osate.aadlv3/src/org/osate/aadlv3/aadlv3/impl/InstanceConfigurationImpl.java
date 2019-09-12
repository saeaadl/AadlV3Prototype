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
import org.osate.aadlv3.aadlv3.ConditionOperation;
import org.osate.aadlv3.aadlv3.InstanceConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.InstanceConfigurationImpl#getProductlineConstraint <em>Productline Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceConfigurationImpl extends SubcomponentImpl implements InstanceConfiguration {
	/**
	 * The cached value of the '{@link #getProductlineConstraint() <em>Productline Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductlineConstraint()
	 * @generated
	 * @ordered
	 */
	protected ConditionOperation productlineConstraint;

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
	public ConditionOperation getProductlineConstraint() {
		return productlineConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductlineConstraint(ConditionOperation newProductlineConstraint,
			NotificationChain msgs) {
		ConditionOperation oldProductlineConstraint = productlineConstraint;
		productlineConstraint = newProductlineConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Aadlv3Package.INSTANCE_CONFIGURATION__PRODUCTLINE_CONSTRAINT, oldProductlineConstraint,
					newProductlineConstraint);
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
	public void setProductlineConstraint(ConditionOperation newProductlineConstraint) {
		if (newProductlineConstraint != productlineConstraint) {
			NotificationChain msgs = null;
			if (productlineConstraint != null)
				msgs = ((InternalEObject) productlineConstraint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Aadlv3Package.INSTANCE_CONFIGURATION__PRODUCTLINE_CONSTRAINT, null,
						msgs);
			if (newProductlineConstraint != null)
				msgs = ((InternalEObject) newProductlineConstraint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Aadlv3Package.INSTANCE_CONFIGURATION__PRODUCTLINE_CONSTRAINT, null,
						msgs);
			msgs = basicSetProductlineConstraint(newProductlineConstraint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Aadlv3Package.INSTANCE_CONFIGURATION__PRODUCTLINE_CONSTRAINT, newProductlineConstraint,
					newProductlineConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Aadlv3Package.INSTANCE_CONFIGURATION__PRODUCTLINE_CONSTRAINT:
			return basicSetProductlineConstraint(null, msgs);
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
		case Aadlv3Package.INSTANCE_CONFIGURATION__PRODUCTLINE_CONSTRAINT:
			return getProductlineConstraint();
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
		case Aadlv3Package.INSTANCE_CONFIGURATION__PRODUCTLINE_CONSTRAINT:
			setProductlineConstraint((ConditionOperation) newValue);
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
		case Aadlv3Package.INSTANCE_CONFIGURATION__PRODUCTLINE_CONSTRAINT:
			setProductlineConstraint((ConditionOperation) null);
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
		case Aadlv3Package.INSTANCE_CONFIGURATION__PRODUCTLINE_CONSTRAINT:
			return productlineConstraint != null;
		}
		return super.eIsSet(featureID);
	}

} //InstanceConfigurationImpl
