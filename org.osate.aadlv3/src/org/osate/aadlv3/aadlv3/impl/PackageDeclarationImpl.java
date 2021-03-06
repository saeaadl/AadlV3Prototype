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
import org.osate.aadlv3.aadlv3.AnnotationBlock;
import org.osate.aadlv3.aadlv3.Import;
import org.osate.aadlv3.aadlv3.PackageDeclaration;
import org.osate.aadlv3.aadlv3.PackageElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.PackageDeclarationImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.PackageDeclarationImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.PackageDeclarationImpl#getAnnotationBlocks <em>Annotation Blocks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageDeclarationImpl extends PackageElementImpl implements PackageDeclaration {
	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> imports;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageElement> elements;

	/**
	 * The cached value of the '{@link #getAnnotationBlocks() <em>Annotation Blocks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationBlocks()
	 * @generated
	 * @ordered
	 */
	protected AnnotationBlock annotationBlocks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadlv3Package.Literals.PACKAGE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Import> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<Import>(Import.class, this,
					Aadlv3Package.PACKAGE_DECLARATION__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PackageElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<PackageElement>(PackageElement.class, this,
					Aadlv3Package.PACKAGE_DECLARATION__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationBlock getAnnotationBlocks() {
		return annotationBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotationBlocks(AnnotationBlock newAnnotationBlocks, NotificationChain msgs) {
		AnnotationBlock oldAnnotationBlocks = annotationBlocks;
		annotationBlocks = newAnnotationBlocks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Aadlv3Package.PACKAGE_DECLARATION__ANNOTATION_BLOCKS, oldAnnotationBlocks, newAnnotationBlocks);
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
	public void setAnnotationBlocks(AnnotationBlock newAnnotationBlocks) {
		if (newAnnotationBlocks != annotationBlocks) {
			NotificationChain msgs = null;
			if (annotationBlocks != null)
				msgs = ((InternalEObject) annotationBlocks).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Aadlv3Package.PACKAGE_DECLARATION__ANNOTATION_BLOCKS, null, msgs);
			if (newAnnotationBlocks != null)
				msgs = ((InternalEObject) newAnnotationBlocks).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Aadlv3Package.PACKAGE_DECLARATION__ANNOTATION_BLOCKS, null, msgs);
			msgs = basicSetAnnotationBlocks(newAnnotationBlocks, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadlv3Package.PACKAGE_DECLARATION__ANNOTATION_BLOCKS,
					newAnnotationBlocks, newAnnotationBlocks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Aadlv3Package.PACKAGE_DECLARATION__IMPORTS:
			return ((InternalEList<?>) getImports()).basicRemove(otherEnd, msgs);
		case Aadlv3Package.PACKAGE_DECLARATION__ELEMENTS:
			return ((InternalEList<?>) getElements()).basicRemove(otherEnd, msgs);
		case Aadlv3Package.PACKAGE_DECLARATION__ANNOTATION_BLOCKS:
			return basicSetAnnotationBlocks(null, msgs);
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
		case Aadlv3Package.PACKAGE_DECLARATION__IMPORTS:
			return getImports();
		case Aadlv3Package.PACKAGE_DECLARATION__ELEMENTS:
			return getElements();
		case Aadlv3Package.PACKAGE_DECLARATION__ANNOTATION_BLOCKS:
			return getAnnotationBlocks();
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
		case Aadlv3Package.PACKAGE_DECLARATION__IMPORTS:
			getImports().clear();
			getImports().addAll((Collection<? extends Import>) newValue);
			return;
		case Aadlv3Package.PACKAGE_DECLARATION__ELEMENTS:
			getElements().clear();
			getElements().addAll((Collection<? extends PackageElement>) newValue);
			return;
		case Aadlv3Package.PACKAGE_DECLARATION__ANNOTATION_BLOCKS:
			setAnnotationBlocks((AnnotationBlock) newValue);
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
		case Aadlv3Package.PACKAGE_DECLARATION__IMPORTS:
			getImports().clear();
			return;
		case Aadlv3Package.PACKAGE_DECLARATION__ELEMENTS:
			getElements().clear();
			return;
		case Aadlv3Package.PACKAGE_DECLARATION__ANNOTATION_BLOCKS:
			setAnnotationBlocks((AnnotationBlock) null);
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
		case Aadlv3Package.PACKAGE_DECLARATION__IMPORTS:
			return imports != null && !imports.isEmpty();
		case Aadlv3Package.PACKAGE_DECLARATION__ELEMENTS:
			return elements != null && !elements.isEmpty();
		case Aadlv3Package.PACKAGE_DECLARATION__ANNOTATION_BLOCKS:
			return annotationBlocks != null;
		}
		return super.eIsSet(featureID);
	}

} //PackageDeclarationImpl
