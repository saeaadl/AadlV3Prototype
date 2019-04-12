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
import org.osate.emv3.emv3.TypeTransformation;
import org.osate.emv3.emv3.TypeTransformationSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Transformation Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.emv3.emv3.impl.TypeTransformationSetImpl#getUseTypes <em>Use Types</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.impl.TypeTransformationSetImpl#getTransformation <em>Transformation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeTransformationSetImpl extends PackageElementImpl implements TypeTransformationSet {
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
	 * The cached value of the '{@link #getTransformation() <em>Transformation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeTransformation> transformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTransformationSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Emv3Package.Literals.TYPE_TRANSFORMATION_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ErrorModelLibrary> getUseTypes() {
		if (useTypes == null) {
			useTypes = new EObjectResolvingEList<ErrorModelLibrary>(ErrorModelLibrary.class, this, Emv3Package.TYPE_TRANSFORMATION_SET__USE_TYPES);
		}
		return useTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeTransformation> getTransformation() {
		if (transformation == null) {
			transformation = new EObjectContainmentEList<TypeTransformation>(TypeTransformation.class, this, Emv3Package.TYPE_TRANSFORMATION_SET__TRANSFORMATION);
		}
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Emv3Package.TYPE_TRANSFORMATION_SET__TRANSFORMATION:
				return ((InternalEList<?>)getTransformation()).basicRemove(otherEnd, msgs);
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
			case Emv3Package.TYPE_TRANSFORMATION_SET__USE_TYPES:
				return getUseTypes();
			case Emv3Package.TYPE_TRANSFORMATION_SET__TRANSFORMATION:
				return getTransformation();
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
			case Emv3Package.TYPE_TRANSFORMATION_SET__USE_TYPES:
				getUseTypes().clear();
				getUseTypes().addAll((Collection<? extends ErrorModelLibrary>)newValue);
				return;
			case Emv3Package.TYPE_TRANSFORMATION_SET__TRANSFORMATION:
				getTransformation().clear();
				getTransformation().addAll((Collection<? extends TypeTransformation>)newValue);
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
			case Emv3Package.TYPE_TRANSFORMATION_SET__USE_TYPES:
				getUseTypes().clear();
				return;
			case Emv3Package.TYPE_TRANSFORMATION_SET__TRANSFORMATION:
				getTransformation().clear();
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
			case Emv3Package.TYPE_TRANSFORMATION_SET__USE_TYPES:
				return useTypes != null && !useTypes.isEmpty();
			case Emv3Package.TYPE_TRANSFORMATION_SET__TRANSFORMATION:
				return transformation != null && !transformation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypeTransformationSetImpl
