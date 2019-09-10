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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadlv3.aadlv3.Aadlv3Package;
import org.osate.aadlv3.aadlv3.AnnexSubclause;
import org.osate.aadlv3.aadlv3.Classifier;
import org.osate.aadlv3.aadlv3.ComponentCategory;
import org.osate.aadlv3.aadlv3.EnumerationType;
import org.osate.aadlv3.aadlv3.TypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.ClassifierImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.ClassifierImpl#getSuperClassifiers <em>Super Classifiers</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.ClassifierImpl#getUseModes <em>Use Modes</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.ClassifierImpl#isInheritsModes <em>Inherits Modes</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.ClassifierImpl#getAnnexSubclause <em>Annex Subclause</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ClassifierImpl extends NamedTypeImpl implements Classifier {
	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final ComponentCategory CATEGORY_EDEFAULT = ComponentCategory.INTERFACE;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected ComponentCategory category = CATEGORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSuperClassifiers() <em>Super Classifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperClassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeReference> superClassifiers;

	/**
	 * The cached value of the '{@link #getUseModes() <em>Use Modes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseModes()
	 * @generated
	 * @ordered
	 */
	protected EnumerationType useModes;

	/**
	 * The default value of the '{@link #isInheritsModes() <em>Inherits Modes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInheritsModes()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INHERITS_MODES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInheritsModes() <em>Inherits Modes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInheritsModes()
	 * @generated
	 * @ordered
	 */
	protected boolean inheritsModes = INHERITS_MODES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnnexSubclause() <em>Annex Subclause</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnexSubclause()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnexSubclause> annexSubclause;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadlv3Package.Literals.CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentCategory getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategory(ComponentCategory newCategory) {
		ComponentCategory oldCategory = category;
		category = newCategory == null ? CATEGORY_EDEFAULT : newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadlv3Package.CLASSIFIER__CATEGORY, oldCategory,
					category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeReference> getSuperClassifiers() {
		if (superClassifiers == null) {
			superClassifiers = new EObjectContainmentEList<TypeReference>(TypeReference.class, this,
					Aadlv3Package.CLASSIFIER__SUPER_CLASSIFIERS);
		}
		return superClassifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumerationType getUseModes() {
		if (useModes != null && useModes.eIsProxy()) {
			InternalEObject oldUseModes = (InternalEObject) useModes;
			useModes = (EnumerationType) eResolveProxy(oldUseModes);
			if (useModes != oldUseModes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadlv3Package.CLASSIFIER__USE_MODES,
							oldUseModes, useModes));
			}
		}
		return useModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationType basicGetUseModes() {
		return useModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseModes(EnumerationType newUseModes) {
		EnumerationType oldUseModes = useModes;
		useModes = newUseModes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadlv3Package.CLASSIFIER__USE_MODES, oldUseModes,
					useModes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInheritsModes() {
		return inheritsModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInheritsModes(boolean newInheritsModes) {
		boolean oldInheritsModes = inheritsModes;
		inheritsModes = newInheritsModes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadlv3Package.CLASSIFIER__INHERITS_MODES,
					oldInheritsModes, inheritsModes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnexSubclause> getAnnexSubclause() {
		if (annexSubclause == null) {
			annexSubclause = new EObjectContainmentEList<AnnexSubclause>(AnnexSubclause.class, this,
					Aadlv3Package.CLASSIFIER__ANNEX_SUBCLAUSE);
		}
		return annexSubclause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Aadlv3Package.CLASSIFIER__SUPER_CLASSIFIERS:
			return ((InternalEList<?>) getSuperClassifiers()).basicRemove(otherEnd, msgs);
		case Aadlv3Package.CLASSIFIER__ANNEX_SUBCLAUSE:
			return ((InternalEList<?>) getAnnexSubclause()).basicRemove(otherEnd, msgs);
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
		case Aadlv3Package.CLASSIFIER__CATEGORY:
			return getCategory();
		case Aadlv3Package.CLASSIFIER__SUPER_CLASSIFIERS:
			return getSuperClassifiers();
		case Aadlv3Package.CLASSIFIER__USE_MODES:
			if (resolve)
				return getUseModes();
			return basicGetUseModes();
		case Aadlv3Package.CLASSIFIER__INHERITS_MODES:
			return isInheritsModes();
		case Aadlv3Package.CLASSIFIER__ANNEX_SUBCLAUSE:
			return getAnnexSubclause();
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
		case Aadlv3Package.CLASSIFIER__CATEGORY:
			setCategory((ComponentCategory) newValue);
			return;
		case Aadlv3Package.CLASSIFIER__SUPER_CLASSIFIERS:
			getSuperClassifiers().clear();
			getSuperClassifiers().addAll((Collection<? extends TypeReference>) newValue);
			return;
		case Aadlv3Package.CLASSIFIER__USE_MODES:
			setUseModes((EnumerationType) newValue);
			return;
		case Aadlv3Package.CLASSIFIER__INHERITS_MODES:
			setInheritsModes((Boolean) newValue);
			return;
		case Aadlv3Package.CLASSIFIER__ANNEX_SUBCLAUSE:
			getAnnexSubclause().clear();
			getAnnexSubclause().addAll((Collection<? extends AnnexSubclause>) newValue);
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
		case Aadlv3Package.CLASSIFIER__CATEGORY:
			setCategory(CATEGORY_EDEFAULT);
			return;
		case Aadlv3Package.CLASSIFIER__SUPER_CLASSIFIERS:
			getSuperClassifiers().clear();
			return;
		case Aadlv3Package.CLASSIFIER__USE_MODES:
			setUseModes((EnumerationType) null);
			return;
		case Aadlv3Package.CLASSIFIER__INHERITS_MODES:
			setInheritsModes(INHERITS_MODES_EDEFAULT);
			return;
		case Aadlv3Package.CLASSIFIER__ANNEX_SUBCLAUSE:
			getAnnexSubclause().clear();
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
		case Aadlv3Package.CLASSIFIER__CATEGORY:
			return category != CATEGORY_EDEFAULT;
		case Aadlv3Package.CLASSIFIER__SUPER_CLASSIFIERS:
			return superClassifiers != null && !superClassifiers.isEmpty();
		case Aadlv3Package.CLASSIFIER__USE_MODES:
			return useModes != null;
		case Aadlv3Package.CLASSIFIER__INHERITS_MODES:
			return inheritsModes != INHERITS_MODES_EDEFAULT;
		case Aadlv3Package.CLASSIFIER__ANNEX_SUBCLAUSE:
			return annexSubclause != null && !annexSubclause.isEmpty();
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
		result.append(" (category: ");
		result.append(category);
		result.append(", inheritsModes: ");
		result.append(inheritsModes);
		result.append(')');
		return result.toString();
	}

} //ClassifierImpl
