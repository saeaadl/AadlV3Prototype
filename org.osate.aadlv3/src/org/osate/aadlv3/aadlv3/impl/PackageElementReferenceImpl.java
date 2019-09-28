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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.osate.aadlv3.aadlv3.Aadlv3Package;
import org.osate.aadlv3.aadlv3.Literal;
import org.osate.aadlv3.aadlv3.PackageElement;
import org.osate.aadlv3.aadlv3.PackageElementReference;
import org.osate.aadlv3.aadlv3.TypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Element Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.PackageElementReferenceImpl#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageElementReferenceImpl extends NamedElementImpl implements PackageElementReference {
	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected PackageElement element;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageElementReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadlv3Package.Literals.PACKAGE_ELEMENT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PackageElement getElement() {
		if (element != null && element.eIsProxy()) {
			InternalEObject oldElement = (InternalEObject) element;
			element = (PackageElement) eResolveProxy(oldElement);
			if (element != oldElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Aadlv3Package.PACKAGE_ELEMENT_REFERENCE__ELEMENT, oldElement, element));
			}
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageElement basicGetElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElement(PackageElement newElement) {
		PackageElement oldElement = element;
		element = newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadlv3Package.PACKAGE_ELEMENT_REFERENCE__ELEMENT,
					oldElement, element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Aadlv3Package.PACKAGE_ELEMENT_REFERENCE__ELEMENT:
			if (resolve)
				return getElement();
			return basicGetElement();
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
		case Aadlv3Package.PACKAGE_ELEMENT_REFERENCE__ELEMENT:
			setElement((PackageElement) newValue);
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
		case Aadlv3Package.PACKAGE_ELEMENT_REFERENCE__ELEMENT:
			setElement((PackageElement) null);
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
		case Aadlv3Package.PACKAGE_ELEMENT_REFERENCE__ELEMENT:
			return element != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public boolean sameAs(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		if (obj instanceof PackageElementReference) {
			PackageElementReferenceImpl other = (PackageElementReferenceImpl) obj;
			if (element == null) {
				if (other.element != null)
					return false;
			} else if (this.getElement() != other.getElement())
				return false;
			return true;
		} else if (obj instanceof TypeReference) {
			TypeReferenceImpl other = (TypeReferenceImpl) obj;
			if (element == null) {
				if (other.type != null)
					return false;
			} else if (this.getElement() != other.getType())
				return false;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return element != null ? getElement().getName() : "";
	}

	@Override
	public boolean contains(Literal element) {
		// TODO Auto-generated method stub
		return false;
	}

} //PackageElementReferenceImpl
