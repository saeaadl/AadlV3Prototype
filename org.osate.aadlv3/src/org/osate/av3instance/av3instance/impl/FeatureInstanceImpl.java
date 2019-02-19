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
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadlv3.aadlv3.Feature;
import org.osate.aadlv3.aadlv3.FeatureCategory;
import org.osate.aadlv3.aadlv3.FeatureDirection;

import org.osate.av3instance.av3instance.AssociationInstance;
import org.osate.av3instance.av3instance.Av3instancePackage;
import org.osate.av3instance.av3instance.FeatureInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.av3instance.av3instance.impl.FeatureInstanceImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.FeatureInstanceImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.FeatureInstanceImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.FeatureInstanceImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.FeatureInstanceImpl#getOutgoingAssociations <em>Outgoing Associations</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.FeatureInstanceImpl#getIncomingAssociations <em>Incoming Associations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureInstanceImpl extends InstanceObjectImpl implements FeatureInstance {
	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature feature;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final FeatureDirection DIRECTION_EDEFAULT = FeatureDirection.NONE;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected FeatureDirection direction = DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final FeatureCategory CATEGORY_EDEFAULT = FeatureCategory.FEATURE;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected FeatureCategory category = CATEGORY_EDEFAULT;

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
	 * The cached value of the '{@link #getOutgoingAssociations() <em>Outgoing Associations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<AssociationInstance> outgoingAssociations;

	/**
	 * The cached value of the '{@link #getIncomingAssociations() <em>Incoming Associations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<AssociationInstance> incomingAssociations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Av3instancePackage.Literals.FEATURE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getFeature() {
		if (feature != null && feature.eIsProxy()) {
			InternalEObject oldFeature = (InternalEObject) feature;
			feature = (Feature) eResolveProxy(oldFeature);
			if (feature != oldFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Av3instancePackage.FEATURE_INSTANCE__FEATURE, oldFeature, feature));
			}
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeature(Feature newFeature) {
		Feature oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Av3instancePackage.FEATURE_INSTANCE__FEATURE,
					oldFeature, feature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureDirection getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirection(FeatureDirection newDirection) {
		FeatureDirection oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Av3instancePackage.FEATURE_INSTANCE__DIRECTION,
					oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureCategory getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategory(FeatureCategory newCategory) {
		FeatureCategory oldCategory = category;
		category = newCategory == null ? CATEGORY_EDEFAULT : newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Av3instancePackage.FEATURE_INSTANCE__CATEGORY,
					oldCategory, category));
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
					Av3instancePackage.FEATURE_INSTANCE__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AssociationInstance> getOutgoingAssociations() {
		if (outgoingAssociations == null) {
			outgoingAssociations = new EObjectWithInverseEList<AssociationInstance>(AssociationInstance.class, this,
					Av3instancePackage.FEATURE_INSTANCE__OUTGOING_ASSOCIATIONS,
					Av3instancePackage.ASSOCIATION_INSTANCE__SOURCE);
		}
		return outgoingAssociations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AssociationInstance> getIncomingAssociations() {
		if (incomingAssociations == null) {
			incomingAssociations = new EObjectWithInverseEList<AssociationInstance>(AssociationInstance.class, this,
					Av3instancePackage.FEATURE_INSTANCE__INCOMING_ASSOCIATIONS,
					Av3instancePackage.ASSOCIATION_INSTANCE__DESTINATION);
		}
		return incomingAssociations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Av3instancePackage.FEATURE_INSTANCE__OUTGOING_ASSOCIATIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoingAssociations()).basicAdd(otherEnd,
					msgs);
		case Av3instancePackage.FEATURE_INSTANCE__INCOMING_ASSOCIATIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncomingAssociations()).basicAdd(otherEnd,
					msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Av3instancePackage.FEATURE_INSTANCE__FEATURES:
			return ((InternalEList<?>) getFeatures()).basicRemove(otherEnd, msgs);
		case Av3instancePackage.FEATURE_INSTANCE__OUTGOING_ASSOCIATIONS:
			return ((InternalEList<?>) getOutgoingAssociations()).basicRemove(otherEnd, msgs);
		case Av3instancePackage.FEATURE_INSTANCE__INCOMING_ASSOCIATIONS:
			return ((InternalEList<?>) getIncomingAssociations()).basicRemove(otherEnd, msgs);
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
		case Av3instancePackage.FEATURE_INSTANCE__FEATURE:
			if (resolve)
				return getFeature();
			return basicGetFeature();
		case Av3instancePackage.FEATURE_INSTANCE__DIRECTION:
			return getDirection();
		case Av3instancePackage.FEATURE_INSTANCE__CATEGORY:
			return getCategory();
		case Av3instancePackage.FEATURE_INSTANCE__FEATURES:
			return getFeatures();
		case Av3instancePackage.FEATURE_INSTANCE__OUTGOING_ASSOCIATIONS:
			return getOutgoingAssociations();
		case Av3instancePackage.FEATURE_INSTANCE__INCOMING_ASSOCIATIONS:
			return getIncomingAssociations();
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
		case Av3instancePackage.FEATURE_INSTANCE__FEATURE:
			setFeature((Feature) newValue);
			return;
		case Av3instancePackage.FEATURE_INSTANCE__DIRECTION:
			setDirection((FeatureDirection) newValue);
			return;
		case Av3instancePackage.FEATURE_INSTANCE__CATEGORY:
			setCategory((FeatureCategory) newValue);
			return;
		case Av3instancePackage.FEATURE_INSTANCE__FEATURES:
			getFeatures().clear();
			getFeatures().addAll((Collection<? extends FeatureInstance>) newValue);
			return;
		case Av3instancePackage.FEATURE_INSTANCE__OUTGOING_ASSOCIATIONS:
			getOutgoingAssociations().clear();
			getOutgoingAssociations().addAll((Collection<? extends AssociationInstance>) newValue);
			return;
		case Av3instancePackage.FEATURE_INSTANCE__INCOMING_ASSOCIATIONS:
			getIncomingAssociations().clear();
			getIncomingAssociations().addAll((Collection<? extends AssociationInstance>) newValue);
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
		case Av3instancePackage.FEATURE_INSTANCE__FEATURE:
			setFeature((Feature) null);
			return;
		case Av3instancePackage.FEATURE_INSTANCE__DIRECTION:
			setDirection(DIRECTION_EDEFAULT);
			return;
		case Av3instancePackage.FEATURE_INSTANCE__CATEGORY:
			setCategory(CATEGORY_EDEFAULT);
			return;
		case Av3instancePackage.FEATURE_INSTANCE__FEATURES:
			getFeatures().clear();
			return;
		case Av3instancePackage.FEATURE_INSTANCE__OUTGOING_ASSOCIATIONS:
			getOutgoingAssociations().clear();
			return;
		case Av3instancePackage.FEATURE_INSTANCE__INCOMING_ASSOCIATIONS:
			getIncomingAssociations().clear();
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
		case Av3instancePackage.FEATURE_INSTANCE__FEATURE:
			return feature != null;
		case Av3instancePackage.FEATURE_INSTANCE__DIRECTION:
			return direction != DIRECTION_EDEFAULT;
		case Av3instancePackage.FEATURE_INSTANCE__CATEGORY:
			return category != CATEGORY_EDEFAULT;
		case Av3instancePackage.FEATURE_INSTANCE__FEATURES:
			return features != null && !features.isEmpty();
		case Av3instancePackage.FEATURE_INSTANCE__OUTGOING_ASSOCIATIONS:
			return outgoingAssociations != null && !outgoingAssociations.isEmpty();
		case Av3instancePackage.FEATURE_INSTANCE__INCOMING_ASSOCIATIONS:
			return incomingAssociations != null && !incomingAssociations.isEmpty();
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
		result.append(" (direction: "); //$NON-NLS-1$
		result.append(direction);
		result.append(", category: "); //$NON-NLS-1$
		result.append(category);
		result.append(')');
		return result.toString();
	}

} //FeatureInstanceImpl
