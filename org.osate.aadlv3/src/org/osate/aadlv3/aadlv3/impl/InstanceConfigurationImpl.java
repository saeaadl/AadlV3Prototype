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
import org.osate.aadlv3.aadlv3.MultiLiteralOperation;
import org.osate.aadlv3.aadlv3.PropertyDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.InstanceConfigurationImpl#getConstrainedProperty <em>Constrained Property</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.InstanceConfigurationImpl#getConstraintExpression <em>Constraint Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceConfigurationImpl extends SubcomponentImpl implements InstanceConfiguration {
	/**
	 * The cached value of the '{@link #getConstrainedProperty() <em>Constrained Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainedProperty()
	 * @generated
	 * @ordered
	 */
	protected PropertyDefinition constrainedProperty;
	/**
	 * The cached value of the '{@link #getConstraintExpression() <em>Constraint Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintExpression()
	 * @generated
	 * @ordered
	 */
	protected MultiLiteralOperation constraintExpression;

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
	public PropertyDefinition getConstrainedProperty() {
		if (constrainedProperty != null && constrainedProperty.eIsProxy()) {
			InternalEObject oldConstrainedProperty = (InternalEObject) constrainedProperty;
			constrainedProperty = (PropertyDefinition) eResolveProxy(oldConstrainedProperty);
			if (constrainedProperty != oldConstrainedProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Aadlv3Package.INSTANCE_CONFIGURATION__CONSTRAINED_PROPERTY, oldConstrainedProperty,
							constrainedProperty));
			}
		}
		return constrainedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyDefinition basicGetConstrainedProperty() {
		return constrainedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstrainedProperty(PropertyDefinition newConstrainedProperty) {
		PropertyDefinition oldConstrainedProperty = constrainedProperty;
		constrainedProperty = newConstrainedProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Aadlv3Package.INSTANCE_CONFIGURATION__CONSTRAINED_PROPERTY, oldConstrainedProperty,
					constrainedProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiLiteralOperation getConstraintExpression() {
		return constraintExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraintExpression(MultiLiteralOperation newConstraintExpression,
			NotificationChain msgs) {
		MultiLiteralOperation oldConstraintExpression = constraintExpression;
		constraintExpression = newConstraintExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Aadlv3Package.INSTANCE_CONFIGURATION__CONSTRAINT_EXPRESSION, oldConstraintExpression,
					newConstraintExpression);
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
	public void setConstraintExpression(MultiLiteralOperation newConstraintExpression) {
		if (newConstraintExpression != constraintExpression) {
			NotificationChain msgs = null;
			if (constraintExpression != null)
				msgs = ((InternalEObject) constraintExpression).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Aadlv3Package.INSTANCE_CONFIGURATION__CONSTRAINT_EXPRESSION, null,
						msgs);
			if (newConstraintExpression != null)
				msgs = ((InternalEObject) newConstraintExpression).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Aadlv3Package.INSTANCE_CONFIGURATION__CONSTRAINT_EXPRESSION, null,
						msgs);
			msgs = basicSetConstraintExpression(newConstraintExpression, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Aadlv3Package.INSTANCE_CONFIGURATION__CONSTRAINT_EXPRESSION, newConstraintExpression,
					newConstraintExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Aadlv3Package.INSTANCE_CONFIGURATION__CONSTRAINT_EXPRESSION:
			return basicSetConstraintExpression(null, msgs);
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
		case Aadlv3Package.INSTANCE_CONFIGURATION__CONSTRAINED_PROPERTY:
			if (resolve)
				return getConstrainedProperty();
			return basicGetConstrainedProperty();
		case Aadlv3Package.INSTANCE_CONFIGURATION__CONSTRAINT_EXPRESSION:
			return getConstraintExpression();
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
		case Aadlv3Package.INSTANCE_CONFIGURATION__CONSTRAINED_PROPERTY:
			setConstrainedProperty((PropertyDefinition) newValue);
			return;
		case Aadlv3Package.INSTANCE_CONFIGURATION__CONSTRAINT_EXPRESSION:
			setConstraintExpression((MultiLiteralOperation) newValue);
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
		case Aadlv3Package.INSTANCE_CONFIGURATION__CONSTRAINED_PROPERTY:
			setConstrainedProperty((PropertyDefinition) null);
			return;
		case Aadlv3Package.INSTANCE_CONFIGURATION__CONSTRAINT_EXPRESSION:
			setConstraintExpression((MultiLiteralOperation) null);
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
		case Aadlv3Package.INSTANCE_CONFIGURATION__CONSTRAINED_PROPERTY:
			return constrainedProperty != null;
		case Aadlv3Package.INSTANCE_CONFIGURATION__CONSTRAINT_EXPRESSION:
			return constraintExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //InstanceConfigurationImpl
