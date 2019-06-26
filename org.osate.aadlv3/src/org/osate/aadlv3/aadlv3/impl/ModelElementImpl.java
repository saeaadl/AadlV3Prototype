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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadlv3.aadlv3.Aadlv3Package;
import org.osate.aadlv3.aadlv3.AnnexElement;
import org.osate.aadlv3.aadlv3.Mode;
import org.osate.aadlv3.aadlv3.ModelElement;
import org.osate.aadlv3.aadlv3.PropertyAssociation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.ModelElementImpl#getPropertyAssociations <em>Property Associations</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.ModelElementImpl#getInModes <em>In Modes</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.ModelElementImpl#getAnnexElements <em>Annex Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ModelElementImpl extends NamedElementImpl implements ModelElement {
	/**
	 * The cached value of the '{@link #getPropertyAssociations() <em>Property Associations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyAssociation> propertyAssociations;

	/**
	 * The cached value of the '{@link #getInModes() <em>In Modes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInModes()
	 * @generated
	 * @ordered
	 */
	protected EList<Mode> inModes;

	/**
	 * The cached value of the '{@link #getAnnexElements() <em>Annex Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnexElements()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnexElement> annexElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadlv3Package.Literals.MODEL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PropertyAssociation> getPropertyAssociations() {
		if (propertyAssociations == null) {
			propertyAssociations = new EObjectContainmentEList<PropertyAssociation>(PropertyAssociation.class, this,
					Aadlv3Package.MODEL_ELEMENT__PROPERTY_ASSOCIATIONS);
		}
		return propertyAssociations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Mode> getInModes() {
		if (inModes == null) {
			inModes = new EObjectResolvingEList<Mode>(Mode.class, this, Aadlv3Package.MODEL_ELEMENT__IN_MODES);
		}
		return inModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnexElement> getAnnexElements() {
		if (annexElements == null) {
			annexElements = new EObjectContainmentEList<AnnexElement>(AnnexElement.class, this,
					Aadlv3Package.MODEL_ELEMENT__ANNEX_ELEMENTS);
		}
		return annexElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Aadlv3Package.MODEL_ELEMENT__PROPERTY_ASSOCIATIONS:
			return ((InternalEList<?>) getPropertyAssociations()).basicRemove(otherEnd, msgs);
		case Aadlv3Package.MODEL_ELEMENT__ANNEX_ELEMENTS:
			return ((InternalEList<?>) getAnnexElements()).basicRemove(otherEnd, msgs);
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
		case Aadlv3Package.MODEL_ELEMENT__PROPERTY_ASSOCIATIONS:
			return getPropertyAssociations();
		case Aadlv3Package.MODEL_ELEMENT__IN_MODES:
			return getInModes();
		case Aadlv3Package.MODEL_ELEMENT__ANNEX_ELEMENTS:
			return getAnnexElements();
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
		case Aadlv3Package.MODEL_ELEMENT__PROPERTY_ASSOCIATIONS:
			getPropertyAssociations().clear();
			getPropertyAssociations().addAll((Collection<? extends PropertyAssociation>) newValue);
			return;
		case Aadlv3Package.MODEL_ELEMENT__IN_MODES:
			getInModes().clear();
			getInModes().addAll((Collection<? extends Mode>) newValue);
			return;
		case Aadlv3Package.MODEL_ELEMENT__ANNEX_ELEMENTS:
			getAnnexElements().clear();
			getAnnexElements().addAll((Collection<? extends AnnexElement>) newValue);
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
		case Aadlv3Package.MODEL_ELEMENT__PROPERTY_ASSOCIATIONS:
			getPropertyAssociations().clear();
			return;
		case Aadlv3Package.MODEL_ELEMENT__IN_MODES:
			getInModes().clear();
			return;
		case Aadlv3Package.MODEL_ELEMENT__ANNEX_ELEMENTS:
			getAnnexElements().clear();
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
		case Aadlv3Package.MODEL_ELEMENT__PROPERTY_ASSOCIATIONS:
			return propertyAssociations != null && !propertyAssociations.isEmpty();
		case Aadlv3Package.MODEL_ELEMENT__IN_MODES:
			return inModes != null && !inModes.isEmpty();
		case Aadlv3Package.MODEL_ELEMENT__ANNEX_ELEMENTS:
			return annexElements != null && !annexElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelElementImpl
