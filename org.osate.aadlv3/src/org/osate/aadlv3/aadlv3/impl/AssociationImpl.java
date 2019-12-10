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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.osate.aadlv3.aadlv3.Aadlv3Package;
import org.osate.aadlv3.aadlv3.Association;
import org.osate.aadlv3.aadlv3.AssociationType;
import org.osate.aadlv3.aadlv3.NamedElementReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.AssociationImpl#getAssociationType <em>Association Type</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.AssociationImpl#getBindingType <em>Binding Type</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.AssociationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.AssociationImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.AssociationImpl#isBidirectional <em>Bidirectional</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationImpl extends ModelElementImpl implements Association {
	/**
	 * The default value of the '{@link #getAssociationType() <em>Association Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationType()
	 * @generated
	 * @ordered
	 */
	protected static final AssociationType ASSOCIATION_TYPE_EDEFAULT = AssociationType.CONNECTION;

	/**
	 * The cached value of the '{@link #getAssociationType() <em>Association Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationType()
	 * @generated
	 * @ordered
	 */
	protected AssociationType associationType = ASSOCIATION_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBindingType() <em>Binding Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingType()
	 * @generated
	 * @ordered
	 */
	protected EObject bindingType;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected NamedElementReference source;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected NamedElementReference destination;

	/**
	 * The default value of the '{@link #isBidirectional() <em>Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBidirectional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BIDIRECTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBidirectional() <em>Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBidirectional()
	 * @generated
	 * @ordered
	 */
	protected boolean bidirectional = BIDIRECTIONAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadlv3Package.Literals.ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssociationType getAssociationType() {
		return associationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssociationType(AssociationType newAssociationType) {
		AssociationType oldAssociationType = associationType;
		associationType = newAssociationType == null ? ASSOCIATION_TYPE_EDEFAULT : newAssociationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadlv3Package.ASSOCIATION__ASSOCIATION_TYPE,
					oldAssociationType, associationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getBindingType() {
		if (bindingType != null && bindingType.eIsProxy()) {
			InternalEObject oldBindingType = (InternalEObject) bindingType;
			bindingType = eResolveProxy(oldBindingType);
			if (bindingType != oldBindingType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadlv3Package.ASSOCIATION__BINDING_TYPE,
							oldBindingType, bindingType));
			}
		}
		return bindingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetBindingType() {
		return bindingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBindingType(EObject newBindingType) {
		EObject oldBindingType = bindingType;
		bindingType = newBindingType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadlv3Package.ASSOCIATION__BINDING_TYPE,
					oldBindingType, bindingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedElementReference getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(NamedElementReference newSource, NotificationChain msgs) {
		NamedElementReference oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Aadlv3Package.ASSOCIATION__SOURCE, oldSource, newSource);
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
	public void setSource(NamedElementReference newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject) source).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Aadlv3Package.ASSOCIATION__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject) newSource).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Aadlv3Package.ASSOCIATION__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadlv3Package.ASSOCIATION__SOURCE, newSource,
					newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedElementReference getDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestination(NamedElementReference newDestination, NotificationChain msgs) {
		NamedElementReference oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Aadlv3Package.ASSOCIATION__DESTINATION, oldDestination, newDestination);
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
	public void setDestination(NamedElementReference newDestination) {
		if (newDestination != destination) {
			NotificationChain msgs = null;
			if (destination != null)
				msgs = ((InternalEObject) destination).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Aadlv3Package.ASSOCIATION__DESTINATION, null, msgs);
			if (newDestination != null)
				msgs = ((InternalEObject) newDestination).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Aadlv3Package.ASSOCIATION__DESTINATION, null, msgs);
			msgs = basicSetDestination(newDestination, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadlv3Package.ASSOCIATION__DESTINATION,
					newDestination, newDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBidirectional() {
		return bidirectional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBidirectional(boolean newBidirectional) {
		boolean oldBidirectional = bidirectional;
		bidirectional = newBidirectional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadlv3Package.ASSOCIATION__BIDIRECTIONAL,
					oldBidirectional, bidirectional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Aadlv3Package.ASSOCIATION__SOURCE:
			return basicSetSource(null, msgs);
		case Aadlv3Package.ASSOCIATION__DESTINATION:
			return basicSetDestination(null, msgs);
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
		case Aadlv3Package.ASSOCIATION__ASSOCIATION_TYPE:
			return getAssociationType();
		case Aadlv3Package.ASSOCIATION__BINDING_TYPE:
			if (resolve)
				return getBindingType();
			return basicGetBindingType();
		case Aadlv3Package.ASSOCIATION__SOURCE:
			return getSource();
		case Aadlv3Package.ASSOCIATION__DESTINATION:
			return getDestination();
		case Aadlv3Package.ASSOCIATION__BIDIRECTIONAL:
			return isBidirectional();
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
		case Aadlv3Package.ASSOCIATION__ASSOCIATION_TYPE:
			setAssociationType((AssociationType) newValue);
			return;
		case Aadlv3Package.ASSOCIATION__BINDING_TYPE:
			setBindingType((EObject) newValue);
			return;
		case Aadlv3Package.ASSOCIATION__SOURCE:
			setSource((NamedElementReference) newValue);
			return;
		case Aadlv3Package.ASSOCIATION__DESTINATION:
			setDestination((NamedElementReference) newValue);
			return;
		case Aadlv3Package.ASSOCIATION__BIDIRECTIONAL:
			setBidirectional((Boolean) newValue);
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
		case Aadlv3Package.ASSOCIATION__ASSOCIATION_TYPE:
			setAssociationType(ASSOCIATION_TYPE_EDEFAULT);
			return;
		case Aadlv3Package.ASSOCIATION__BINDING_TYPE:
			setBindingType((EObject) null);
			return;
		case Aadlv3Package.ASSOCIATION__SOURCE:
			setSource((NamedElementReference) null);
			return;
		case Aadlv3Package.ASSOCIATION__DESTINATION:
			setDestination((NamedElementReference) null);
			return;
		case Aadlv3Package.ASSOCIATION__BIDIRECTIONAL:
			setBidirectional(BIDIRECTIONAL_EDEFAULT);
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
		case Aadlv3Package.ASSOCIATION__ASSOCIATION_TYPE:
			return associationType != ASSOCIATION_TYPE_EDEFAULT;
		case Aadlv3Package.ASSOCIATION__BINDING_TYPE:
			return bindingType != null;
		case Aadlv3Package.ASSOCIATION__SOURCE:
			return source != null;
		case Aadlv3Package.ASSOCIATION__DESTINATION:
			return destination != null;
		case Aadlv3Package.ASSOCIATION__BIDIRECTIONAL:
			return bidirectional != BIDIRECTIONAL_EDEFAULT;
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
		result.append(" (associationType: ");
		result.append(associationType);
		result.append(", bidirectional: ");
		result.append(bidirectional);
		result.append(')');
		return result.toString();
	}

} //AssociationImpl
