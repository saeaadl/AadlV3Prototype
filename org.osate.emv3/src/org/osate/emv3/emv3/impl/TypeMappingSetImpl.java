/**
 * Copyright Text	Copyright 2018 Carnegie Mellon University. All Rights Reserved....
 */
package org.osate.emv3.emv3.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadlv3.aadlv3.impl.PackageElementImpl;

import org.osate.emv3.emv3.Emv3Package;
import org.osate.emv3.emv3.ErrorModelLibrary;
import org.osate.emv3.emv3.TypeMapping;
import org.osate.emv3.emv3.TypeMappingSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Mapping Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.emv3.emv3.impl.TypeMappingSetImpl#getUseTypes <em>Use Types</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.impl.TypeMappingSetImpl#getMapping <em>Mapping</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeMappingSetImpl extends PackageElementImpl implements TypeMappingSet {
	/**
	 * The cached value of the '{@link #getUseTypes() <em>Use Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ErrorModelLibrary> useTypes;

	/**
	 * The cached value of the '{@link #getMapping() <em>Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeMapping> mapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMappingSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Emv3Package.Literals.TYPE_MAPPING_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ErrorModelLibrary> getUseTypes() {
		if (useTypes == null) {
			useTypes = new EObjectResolvingEList<ErrorModelLibrary>(ErrorModelLibrary.class, this, Emv3Package.TYPE_MAPPING_SET__USE_TYPES);
		}
		return useTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeMapping> getMapping() {
		if (mapping == null) {
			mapping = new EObjectContainmentEList<TypeMapping>(TypeMapping.class, this, Emv3Package.TYPE_MAPPING_SET__MAPPING);
		}
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Emv3Package.TYPE_MAPPING_SET__MAPPING:
				return ((InternalEList<?>)getMapping()).basicRemove(otherEnd, msgs);
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
			case Emv3Package.TYPE_MAPPING_SET__USE_TYPES:
				return getUseTypes();
			case Emv3Package.TYPE_MAPPING_SET__MAPPING:
				return getMapping();
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
			case Emv3Package.TYPE_MAPPING_SET__USE_TYPES:
				getUseTypes().clear();
				getUseTypes().addAll((Collection<? extends ErrorModelLibrary>)newValue);
				return;
			case Emv3Package.TYPE_MAPPING_SET__MAPPING:
				getMapping().clear();
				getMapping().addAll((Collection<? extends TypeMapping>)newValue);
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
			case Emv3Package.TYPE_MAPPING_SET__USE_TYPES:
				getUseTypes().clear();
				return;
			case Emv3Package.TYPE_MAPPING_SET__MAPPING:
				getMapping().clear();
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
			case Emv3Package.TYPE_MAPPING_SET__USE_TYPES:
				return useTypes != null && !useTypes.isEmpty();
			case Emv3Package.TYPE_MAPPING_SET__MAPPING:
				return mapping != null && !mapping.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypeMappingSetImpl
