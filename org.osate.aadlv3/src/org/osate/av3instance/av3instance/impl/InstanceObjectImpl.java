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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadlv3.aadlv3.impl.NamedElementImpl;
import org.osate.av3instance.av3instance.AssociationInstance;
import org.osate.av3instance.av3instance.Av3instancePackage;
import org.osate.av3instance.av3instance.InstanceObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.av3instance.av3instance.impl.InstanceObjectImpl#getIncomingAssociations <em>Incoming Associations</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.InstanceObjectImpl#getOutgoingAssociations <em>Outgoing Associations</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InstanceObjectImpl extends NamedElementImpl implements InstanceObject {
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
	 * The cached value of the '{@link #getOutgoingAssociations() <em>Outgoing Associations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<AssociationInstance> outgoingAssociations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Av3instancePackage.Literals.INSTANCE_OBJECT;
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
					Av3instancePackage.INSTANCE_OBJECT__INCOMING_ASSOCIATIONS,
					Av3instancePackage.ASSOCIATION_INSTANCE__DESTINATION);
		}
		return incomingAssociations;
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
					Av3instancePackage.INSTANCE_OBJECT__OUTGOING_ASSOCIATIONS,
					Av3instancePackage.ASSOCIATION_INSTANCE__SOURCE);
		}
		return outgoingAssociations;
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
		case Av3instancePackage.INSTANCE_OBJECT__INCOMING_ASSOCIATIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncomingAssociations()).basicAdd(otherEnd,
					msgs);
		case Av3instancePackage.INSTANCE_OBJECT__OUTGOING_ASSOCIATIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoingAssociations()).basicAdd(otherEnd,
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
		case Av3instancePackage.INSTANCE_OBJECT__INCOMING_ASSOCIATIONS:
			return ((InternalEList<?>) getIncomingAssociations()).basicRemove(otherEnd, msgs);
		case Av3instancePackage.INSTANCE_OBJECT__OUTGOING_ASSOCIATIONS:
			return ((InternalEList<?>) getOutgoingAssociations()).basicRemove(otherEnd, msgs);
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
		case Av3instancePackage.INSTANCE_OBJECT__INCOMING_ASSOCIATIONS:
			return getIncomingAssociations();
		case Av3instancePackage.INSTANCE_OBJECT__OUTGOING_ASSOCIATIONS:
			return getOutgoingAssociations();
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
		case Av3instancePackage.INSTANCE_OBJECT__INCOMING_ASSOCIATIONS:
			getIncomingAssociations().clear();
			getIncomingAssociations().addAll((Collection<? extends AssociationInstance>) newValue);
			return;
		case Av3instancePackage.INSTANCE_OBJECT__OUTGOING_ASSOCIATIONS:
			getOutgoingAssociations().clear();
			getOutgoingAssociations().addAll((Collection<? extends AssociationInstance>) newValue);
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
		case Av3instancePackage.INSTANCE_OBJECT__INCOMING_ASSOCIATIONS:
			getIncomingAssociations().clear();
			return;
		case Av3instancePackage.INSTANCE_OBJECT__OUTGOING_ASSOCIATIONS:
			getOutgoingAssociations().clear();
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
		case Av3instancePackage.INSTANCE_OBJECT__INCOMING_ASSOCIATIONS:
			return incomingAssociations != null && !incomingAssociations.isEmpty();
		case Av3instancePackage.INSTANCE_OBJECT__OUTGOING_ASSOCIATIONS:
			return outgoingAssociations != null && !outgoingAssociations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InstanceObjectImpl
