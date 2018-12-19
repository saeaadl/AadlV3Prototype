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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.osate.aadlv3.aadlv3.Aadlv3Package;
import org.osate.aadlv3.aadlv3.AssociationType;
import org.osate.aadlv3.aadlv3.ComponentCategory;
import org.osate.aadlv3.aadlv3.FeatureCategory;
import org.osate.aadlv3.aadlv3.PropertyDefinition;
import org.osate.aadlv3.aadlv3.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.PropertyDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.PropertyDefinitionImpl#getComponentCategories <em>Component Categories</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.PropertyDefinitionImpl#getFeatureCategories <em>Feature Categories</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.PropertyDefinitionImpl#getAssociationTypes <em>Association Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyDefinitionImpl extends PackageElementImpl implements PropertyDefinition {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The cached value of the '{@link #getComponentCategories() <em>Component Categories</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentCategory> componentCategories;
	/**
	 * The cached value of the '{@link #getFeatureCategories() <em>Feature Categories</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureCategory> featureCategories;
	/**
	 * The cached value of the '{@link #getAssociationTypes() <em>Association Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<AssociationType> associationTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadlv3Package.Literals.PROPERTY_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (Type) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadlv3Package.PROPERTY_DEFINITION__TYPE,
							oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadlv3Package.PROPERTY_DEFINITION__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentCategory> getComponentCategories() {
		if (componentCategories == null) {
			componentCategories = new EDataTypeUniqueEList<ComponentCategory>(ComponentCategory.class, this,
					Aadlv3Package.PROPERTY_DEFINITION__COMPONENT_CATEGORIES);
		}
		return componentCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FeatureCategory> getFeatureCategories() {
		if (featureCategories == null) {
			featureCategories = new EDataTypeUniqueEList<FeatureCategory>(FeatureCategory.class, this,
					Aadlv3Package.PROPERTY_DEFINITION__FEATURE_CATEGORIES);
		}
		return featureCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AssociationType> getAssociationTypes() {
		if (associationTypes == null) {
			associationTypes = new EDataTypeUniqueEList<AssociationType>(AssociationType.class, this,
					Aadlv3Package.PROPERTY_DEFINITION__ASSOCIATION_TYPES);
		}
		return associationTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Aadlv3Package.PROPERTY_DEFINITION__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case Aadlv3Package.PROPERTY_DEFINITION__COMPONENT_CATEGORIES:
			return getComponentCategories();
		case Aadlv3Package.PROPERTY_DEFINITION__FEATURE_CATEGORIES:
			return getFeatureCategories();
		case Aadlv3Package.PROPERTY_DEFINITION__ASSOCIATION_TYPES:
			return getAssociationTypes();
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
		case Aadlv3Package.PROPERTY_DEFINITION__TYPE:
			setType((Type) newValue);
			return;
		case Aadlv3Package.PROPERTY_DEFINITION__COMPONENT_CATEGORIES:
			getComponentCategories().clear();
			getComponentCategories().addAll((Collection<? extends ComponentCategory>) newValue);
			return;
		case Aadlv3Package.PROPERTY_DEFINITION__FEATURE_CATEGORIES:
			getFeatureCategories().clear();
			getFeatureCategories().addAll((Collection<? extends FeatureCategory>) newValue);
			return;
		case Aadlv3Package.PROPERTY_DEFINITION__ASSOCIATION_TYPES:
			getAssociationTypes().clear();
			getAssociationTypes().addAll((Collection<? extends AssociationType>) newValue);
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
		case Aadlv3Package.PROPERTY_DEFINITION__TYPE:
			setType((Type) null);
			return;
		case Aadlv3Package.PROPERTY_DEFINITION__COMPONENT_CATEGORIES:
			getComponentCategories().clear();
			return;
		case Aadlv3Package.PROPERTY_DEFINITION__FEATURE_CATEGORIES:
			getFeatureCategories().clear();
			return;
		case Aadlv3Package.PROPERTY_DEFINITION__ASSOCIATION_TYPES:
			getAssociationTypes().clear();
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
		case Aadlv3Package.PROPERTY_DEFINITION__TYPE:
			return type != null;
		case Aadlv3Package.PROPERTY_DEFINITION__COMPONENT_CATEGORIES:
			return componentCategories != null && !componentCategories.isEmpty();
		case Aadlv3Package.PROPERTY_DEFINITION__FEATURE_CATEGORIES:
			return featureCategories != null && !featureCategories.isEmpty();
		case Aadlv3Package.PROPERTY_DEFINITION__ASSOCIATION_TYPES:
			return associationTypes != null && !associationTypes.isEmpty();
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
		result.append(" (componentCategories: ");
		result.append(componentCategories);
		result.append(", featureCategories: ");
		result.append(featureCategories);
		result.append(", associationTypes: ");
		result.append(associationTypes);
		result.append(')');
		return result.toString();
	}

} //PropertyDefinitionImpl
