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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.osate.aadlv3.aadlv3.PropertyAssociationType;
import org.osate.aadlv3.aadlv3.PropertyDefinition;
import org.osate.aadlv3.aadlv3.PropertyValue;

import org.osate.av3instance.av3instance.Av3instancePackage;
import org.osate.av3instance.av3instance.PropertyAssociationInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Association Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.av3instance.av3instance.impl.PropertyAssociationInstanceImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.PropertyAssociationInstanceImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.PropertyAssociationInstanceImpl#getPropertyAssociationType <em>Property Association Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyAssociationInstanceImpl extends InstanceObjectImpl implements PropertyAssociationInstance {
	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected PropertyDefinition property;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected PropertyValue value;

	/**
	 * The default value of the '{@link #getPropertyAssociationType() <em>Property Association Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyAssociationType()
	 * @generated
	 * @ordered
	 */
	protected static final PropertyAssociationType PROPERTY_ASSOCIATION_TYPE_EDEFAULT = PropertyAssociationType.FINAL_VALUE;

	/**
	 * The cached value of the '{@link #getPropertyAssociationType() <em>Property Association Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyAssociationType()
	 * @generated
	 * @ordered
	 */
	protected PropertyAssociationType propertyAssociationType = PROPERTY_ASSOCIATION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyAssociationInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Av3instancePackage.Literals.PROPERTY_ASSOCIATION_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyDefinition getProperty() {
		if (property != null && property.eIsProxy()) {
			InternalEObject oldProperty = (InternalEObject) property;
			property = (PropertyDefinition) eResolveProxy(oldProperty);
			if (property != oldProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Av3instancePackage.PROPERTY_ASSOCIATION_INSTANCE__PROPERTY, oldProperty, property));
			}
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyDefinition basicGetProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProperty(PropertyDefinition newProperty) {
		PropertyDefinition oldProperty = property;
		property = newProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Av3instancePackage.PROPERTY_ASSOCIATION_INSTANCE__PROPERTY, oldProperty, property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyValue getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(PropertyValue newValue, NotificationChain msgs) {
		PropertyValue oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Av3instancePackage.PROPERTY_ASSOCIATION_INSTANCE__VALUE, oldValue, newValue);
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
	public void setValue(PropertyValue newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject) value).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Av3instancePackage.PROPERTY_ASSOCIATION_INSTANCE__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject) newValue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Av3instancePackage.PROPERTY_ASSOCIATION_INSTANCE__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Av3instancePackage.PROPERTY_ASSOCIATION_INSTANCE__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyAssociationType getPropertyAssociationType() {
		return propertyAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropertyAssociationType(PropertyAssociationType newPropertyAssociationType) {
		PropertyAssociationType oldPropertyAssociationType = propertyAssociationType;
		propertyAssociationType = newPropertyAssociationType == null ? PROPERTY_ASSOCIATION_TYPE_EDEFAULT
				: newPropertyAssociationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Av3instancePackage.PROPERTY_ASSOCIATION_INSTANCE__PROPERTY_ASSOCIATION_TYPE,
					oldPropertyAssociationType, propertyAssociationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Av3instancePackage.PROPERTY_ASSOCIATION_INSTANCE__VALUE:
			return basicSetValue(null, msgs);
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
		case Av3instancePackage.PROPERTY_ASSOCIATION_INSTANCE__PROPERTY:
			if (resolve)
				return getProperty();
			return basicGetProperty();
		case Av3instancePackage.PROPERTY_ASSOCIATION_INSTANCE__VALUE:
			return getValue();
		case Av3instancePackage.PROPERTY_ASSOCIATION_INSTANCE__PROPERTY_ASSOCIATION_TYPE:
			return getPropertyAssociationType();
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
		case Av3instancePackage.PROPERTY_ASSOCIATION_INSTANCE__PROPERTY:
			setProperty((PropertyDefinition) newValue);
			return;
		case Av3instancePackage.PROPERTY_ASSOCIATION_INSTANCE__VALUE:
			setValue((PropertyValue) newValue);
			return;
		case Av3instancePackage.PROPERTY_ASSOCIATION_INSTANCE__PROPERTY_ASSOCIATION_TYPE:
			setPropertyAssociationType((PropertyAssociationType) newValue);
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
		case Av3instancePackage.PROPERTY_ASSOCIATION_INSTANCE__PROPERTY:
			setProperty((PropertyDefinition) null);
			return;
		case Av3instancePackage.PROPERTY_ASSOCIATION_INSTANCE__VALUE:
			setValue((PropertyValue) null);
			return;
		case Av3instancePackage.PROPERTY_ASSOCIATION_INSTANCE__PROPERTY_ASSOCIATION_TYPE:
			setPropertyAssociationType(PROPERTY_ASSOCIATION_TYPE_EDEFAULT);
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
		case Av3instancePackage.PROPERTY_ASSOCIATION_INSTANCE__PROPERTY:
			return property != null;
		case Av3instancePackage.PROPERTY_ASSOCIATION_INSTANCE__VALUE:
			return value != null;
		case Av3instancePackage.PROPERTY_ASSOCIATION_INSTANCE__PROPERTY_ASSOCIATION_TYPE:
			return propertyAssociationType != PROPERTY_ASSOCIATION_TYPE_EDEFAULT;
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
		result.append(" (propertyAssociationType: "); //$NON-NLS-1$
		result.append(propertyAssociationType);
		result.append(')');
		return result.toString();
	}

} //PropertyAssociationInstanceImpl
