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
import org.osate.aadlv3.aadlv3.DirectionalLiteral;
import org.osate.aadlv3.aadlv3.Feature;
import org.osate.aadlv3.aadlv3.FeatureCategory;
import org.osate.aadlv3.aadlv3.FeatureDirection;
import org.osate.aadlv3.aadlv3.TypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.FeatureImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.FeatureImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.FeatureImpl#getTypeReference <em>Type Reference</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.FeatureImpl#getPropagation <em>Propagation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureImpl extends ModelElementImpl implements Feature {
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
	 * The cached value of the '{@link #getTypeReference() <em>Type Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeReference()
	 * @generated
	 * @ordered
	 */
	protected TypeReference typeReference;

	/**
	 * The cached value of the '{@link #getPropagation() <em>Propagation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropagation()
	 * @generated
	 * @ordered
	 */
	protected DirectionalLiteral propagation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadlv3Package.Literals.FEATURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Aadlv3Package.FEATURE__DIRECTION, oldDirection,
					direction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Aadlv3Package.FEATURE__CATEGORY, oldCategory,
					category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeReference getTypeReference() {
		return typeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeReference(TypeReference newTypeReference, NotificationChain msgs) {
		TypeReference oldTypeReference = typeReference;
		typeReference = newTypeReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Aadlv3Package.FEATURE__TYPE_REFERENCE, oldTypeReference, newTypeReference);
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
	public void setTypeReference(TypeReference newTypeReference) {
		if (newTypeReference != typeReference) {
			NotificationChain msgs = null;
			if (typeReference != null)
				msgs = ((InternalEObject) typeReference).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Aadlv3Package.FEATURE__TYPE_REFERENCE, null, msgs);
			if (newTypeReference != null)
				msgs = ((InternalEObject) newTypeReference).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Aadlv3Package.FEATURE__TYPE_REFERENCE, null, msgs);
			msgs = basicSetTypeReference(newTypeReference, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadlv3Package.FEATURE__TYPE_REFERENCE,
					newTypeReference, newTypeReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectionalLiteral getPropagation() {
		return propagation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropagation(DirectionalLiteral newPropagation, NotificationChain msgs) {
		DirectionalLiteral oldPropagation = propagation;
		propagation = newPropagation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Aadlv3Package.FEATURE__PROPAGATION, oldPropagation, newPropagation);
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
	public void setPropagation(DirectionalLiteral newPropagation) {
		if (newPropagation != propagation) {
			NotificationChain msgs = null;
			if (propagation != null)
				msgs = ((InternalEObject) propagation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Aadlv3Package.FEATURE__PROPAGATION, null, msgs);
			if (newPropagation != null)
				msgs = ((InternalEObject) newPropagation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Aadlv3Package.FEATURE__PROPAGATION, null, msgs);
			msgs = basicSetPropagation(newPropagation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadlv3Package.FEATURE__PROPAGATION, newPropagation,
					newPropagation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Aadlv3Package.FEATURE__TYPE_REFERENCE:
			return basicSetTypeReference(null, msgs);
		case Aadlv3Package.FEATURE__PROPAGATION:
			return basicSetPropagation(null, msgs);
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
		case Aadlv3Package.FEATURE__DIRECTION:
			return getDirection();
		case Aadlv3Package.FEATURE__CATEGORY:
			return getCategory();
		case Aadlv3Package.FEATURE__TYPE_REFERENCE:
			return getTypeReference();
		case Aadlv3Package.FEATURE__PROPAGATION:
			return getPropagation();
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
		case Aadlv3Package.FEATURE__DIRECTION:
			setDirection((FeatureDirection) newValue);
			return;
		case Aadlv3Package.FEATURE__CATEGORY:
			setCategory((FeatureCategory) newValue);
			return;
		case Aadlv3Package.FEATURE__TYPE_REFERENCE:
			setTypeReference((TypeReference) newValue);
			return;
		case Aadlv3Package.FEATURE__PROPAGATION:
			setPropagation((DirectionalLiteral) newValue);
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
		case Aadlv3Package.FEATURE__DIRECTION:
			setDirection(DIRECTION_EDEFAULT);
			return;
		case Aadlv3Package.FEATURE__CATEGORY:
			setCategory(CATEGORY_EDEFAULT);
			return;
		case Aadlv3Package.FEATURE__TYPE_REFERENCE:
			setTypeReference((TypeReference) null);
			return;
		case Aadlv3Package.FEATURE__PROPAGATION:
			setPropagation((DirectionalLiteral) null);
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
		case Aadlv3Package.FEATURE__DIRECTION:
			return direction != DIRECTION_EDEFAULT;
		case Aadlv3Package.FEATURE__CATEGORY:
			return category != CATEGORY_EDEFAULT;
		case Aadlv3Package.FEATURE__TYPE_REFERENCE:
			return typeReference != null;
		case Aadlv3Package.FEATURE__PROPAGATION:
			return propagation != null;
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
		result.append(" (direction: ");
		result.append(direction);
		result.append(", category: ");
		result.append(category);
		result.append(')');
		return result.toString();
	}

} //FeatureImpl
