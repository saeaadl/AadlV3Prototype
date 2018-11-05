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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.osate.aadlv3.aadlv3.Association;
import org.osate.aadlv3.aadlv3.AssociationType;

import org.osate.av3instance.av3instance.AssociationInstance;
import org.osate.av3instance.av3instance.Av3instancePackage;
import org.osate.av3instance.av3instance.FeatureInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.av3instance.av3instance.impl.AssociationInstanceImpl#getAssociationType <em>Association Type</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.AssociationInstanceImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.AssociationInstanceImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.AssociationInstanceImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.AssociationInstanceImpl#getSourceMappings <em>Source Mappings</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.AssociationInstanceImpl#getDestinationMappings <em>Destination Mappings</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.AssociationInstanceImpl#isExternal <em>External</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationInstanceImpl extends InstanceObjectImpl implements AssociationInstance {
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
	 * The cached value of the '{@link #getAssociation() <em>Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociation()
	 * @generated
	 * @ordered
	 */
	protected Association association;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected FeatureInstance source;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected FeatureInstance destination;

	/**
	 * The cached value of the '{@link #getSourceMappings() <em>Source Mappings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> sourceMappings;

	/**
	 * The cached value of the '{@link #getDestinationMappings() <em>Destination Mappings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> destinationMappings;

	/**
	 * The default value of the '{@link #isExternal() <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTERNAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExternal() <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternal()
	 * @generated
	 * @ordered
	 */
	protected boolean external = EXTERNAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Av3instancePackage.Literals.ASSOCIATION_INSTANCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Av3instancePackage.ASSOCIATION_INSTANCE__ASSOCIATION_TYPE, oldAssociationType, associationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Association getAssociation() {
		if (association != null && association.eIsProxy()) {
			InternalEObject oldAssociation = (InternalEObject) association;
			association = (Association) eResolveProxy(oldAssociation);
			if (association != oldAssociation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Av3instancePackage.ASSOCIATION_INSTANCE__ASSOCIATION, oldAssociation, association));
			}
		}
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetAssociation() {
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssociation(Association newAssociation) {
		Association oldAssociation = association;
		association = newAssociation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Av3instancePackage.ASSOCIATION_INSTANCE__ASSOCIATION,
					oldAssociation, association));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureInstance getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(FeatureInstance newSource, NotificationChain msgs) {
		FeatureInstance oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Av3instancePackage.ASSOCIATION_INSTANCE__SOURCE, oldSource, newSource);
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
	public void setSource(FeatureInstance newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject) source).eInverseRemove(this,
						Av3instancePackage.FEATURE_INSTANCE__OUTGOING_ASSOCIATIONS, FeatureInstance.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject) newSource).eInverseAdd(this,
						Av3instancePackage.FEATURE_INSTANCE__OUTGOING_ASSOCIATIONS, FeatureInstance.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Av3instancePackage.ASSOCIATION_INSTANCE__SOURCE,
					newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureInstance getDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestination(FeatureInstance newDestination, NotificationChain msgs) {
		FeatureInstance oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Av3instancePackage.ASSOCIATION_INSTANCE__DESTINATION, oldDestination, newDestination);
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
	public void setDestination(FeatureInstance newDestination) {
		if (newDestination != destination) {
			NotificationChain msgs = null;
			if (destination != null)
				msgs = ((InternalEObject) destination).eInverseRemove(this,
						Av3instancePackage.FEATURE_INSTANCE__INCOMING_ASSOCIATIONS, FeatureInstance.class, msgs);
			if (newDestination != null)
				msgs = ((InternalEObject) newDestination).eInverseAdd(this,
						Av3instancePackage.FEATURE_INSTANCE__INCOMING_ASSOCIATIONS, FeatureInstance.class, msgs);
			msgs = basicSetDestination(newDestination, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Av3instancePackage.ASSOCIATION_INSTANCE__DESTINATION,
					newDestination, newDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Association> getSourceMappings() {
		if (sourceMappings == null) {
			sourceMappings = new EObjectResolvingEList<Association>(Association.class, this,
					Av3instancePackage.ASSOCIATION_INSTANCE__SOURCE_MAPPINGS);
		}
		return sourceMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Association> getDestinationMappings() {
		if (destinationMappings == null) {
			destinationMappings = new EObjectResolvingEList<Association>(Association.class, this,
					Av3instancePackage.ASSOCIATION_INSTANCE__DESTINATION_MAPPINGS);
		}
		return destinationMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExternal() {
		return external;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternal(boolean newExternal) {
		boolean oldExternal = external;
		external = newExternal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Av3instancePackage.ASSOCIATION_INSTANCE__EXTERNAL,
					oldExternal, external));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Av3instancePackage.ASSOCIATION_INSTANCE__SOURCE:
			if (source != null)
				msgs = ((InternalEObject) source).eInverseRemove(this,
						Av3instancePackage.FEATURE_INSTANCE__OUTGOING_ASSOCIATIONS, FeatureInstance.class, msgs);
			return basicSetSource((FeatureInstance) otherEnd, msgs);
		case Av3instancePackage.ASSOCIATION_INSTANCE__DESTINATION:
			if (destination != null)
				msgs = ((InternalEObject) destination).eInverseRemove(this,
						Av3instancePackage.FEATURE_INSTANCE__INCOMING_ASSOCIATIONS, FeatureInstance.class, msgs);
			return basicSetDestination((FeatureInstance) otherEnd, msgs);
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
		case Av3instancePackage.ASSOCIATION_INSTANCE__SOURCE:
			return basicSetSource(null, msgs);
		case Av3instancePackage.ASSOCIATION_INSTANCE__DESTINATION:
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
		case Av3instancePackage.ASSOCIATION_INSTANCE__ASSOCIATION_TYPE:
			return getAssociationType();
		case Av3instancePackage.ASSOCIATION_INSTANCE__ASSOCIATION:
			if (resolve)
				return getAssociation();
			return basicGetAssociation();
		case Av3instancePackage.ASSOCIATION_INSTANCE__SOURCE:
			return getSource();
		case Av3instancePackage.ASSOCIATION_INSTANCE__DESTINATION:
			return getDestination();
		case Av3instancePackage.ASSOCIATION_INSTANCE__SOURCE_MAPPINGS:
			return getSourceMappings();
		case Av3instancePackage.ASSOCIATION_INSTANCE__DESTINATION_MAPPINGS:
			return getDestinationMappings();
		case Av3instancePackage.ASSOCIATION_INSTANCE__EXTERNAL:
			return isExternal();
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
		case Av3instancePackage.ASSOCIATION_INSTANCE__ASSOCIATION_TYPE:
			setAssociationType((AssociationType) newValue);
			return;
		case Av3instancePackage.ASSOCIATION_INSTANCE__ASSOCIATION:
			setAssociation((Association) newValue);
			return;
		case Av3instancePackage.ASSOCIATION_INSTANCE__SOURCE:
			setSource((FeatureInstance) newValue);
			return;
		case Av3instancePackage.ASSOCIATION_INSTANCE__DESTINATION:
			setDestination((FeatureInstance) newValue);
			return;
		case Av3instancePackage.ASSOCIATION_INSTANCE__SOURCE_MAPPINGS:
			getSourceMappings().clear();
			getSourceMappings().addAll((Collection<? extends Association>) newValue);
			return;
		case Av3instancePackage.ASSOCIATION_INSTANCE__DESTINATION_MAPPINGS:
			getDestinationMappings().clear();
			getDestinationMappings().addAll((Collection<? extends Association>) newValue);
			return;
		case Av3instancePackage.ASSOCIATION_INSTANCE__EXTERNAL:
			setExternal((Boolean) newValue);
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
		case Av3instancePackage.ASSOCIATION_INSTANCE__ASSOCIATION_TYPE:
			setAssociationType(ASSOCIATION_TYPE_EDEFAULT);
			return;
		case Av3instancePackage.ASSOCIATION_INSTANCE__ASSOCIATION:
			setAssociation((Association) null);
			return;
		case Av3instancePackage.ASSOCIATION_INSTANCE__SOURCE:
			setSource((FeatureInstance) null);
			return;
		case Av3instancePackage.ASSOCIATION_INSTANCE__DESTINATION:
			setDestination((FeatureInstance) null);
			return;
		case Av3instancePackage.ASSOCIATION_INSTANCE__SOURCE_MAPPINGS:
			getSourceMappings().clear();
			return;
		case Av3instancePackage.ASSOCIATION_INSTANCE__DESTINATION_MAPPINGS:
			getDestinationMappings().clear();
			return;
		case Av3instancePackage.ASSOCIATION_INSTANCE__EXTERNAL:
			setExternal(EXTERNAL_EDEFAULT);
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
		case Av3instancePackage.ASSOCIATION_INSTANCE__ASSOCIATION_TYPE:
			return associationType != ASSOCIATION_TYPE_EDEFAULT;
		case Av3instancePackage.ASSOCIATION_INSTANCE__ASSOCIATION:
			return association != null;
		case Av3instancePackage.ASSOCIATION_INSTANCE__SOURCE:
			return source != null;
		case Av3instancePackage.ASSOCIATION_INSTANCE__DESTINATION:
			return destination != null;
		case Av3instancePackage.ASSOCIATION_INSTANCE__SOURCE_MAPPINGS:
			return sourceMappings != null && !sourceMappings.isEmpty();
		case Av3instancePackage.ASSOCIATION_INSTANCE__DESTINATION_MAPPINGS:
			return destinationMappings != null && !destinationMappings.isEmpty();
		case Av3instancePackage.ASSOCIATION_INSTANCE__EXTERNAL:
			return external != EXTERNAL_EDEFAULT;
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
		result.append(" (associationType: "); //$NON-NLS-1$
		result.append(associationType);
		result.append(", external: "); //$NON-NLS-1$
		result.append(external);
		result.append(')');
		return result.toString();
	}

} //AssociationInstanceImpl
