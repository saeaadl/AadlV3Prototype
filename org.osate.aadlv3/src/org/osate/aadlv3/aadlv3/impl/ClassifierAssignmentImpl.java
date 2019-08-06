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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadlv3.aadlv3.Aadlv3Package;
import org.osate.aadlv3.aadlv3.AnnexSubclause;
import org.osate.aadlv3.aadlv3.Association;
import org.osate.aadlv3.aadlv3.ClassifierAssignment;
import org.osate.aadlv3.aadlv3.ModelElementReference;
import org.osate.aadlv3.aadlv3.PropertyAssociation;
import org.osate.aadlv3.aadlv3.TypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.ClassifierAssignmentImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.ClassifierAssignmentImpl#getClassifierAssignments <em>Classifier Assignments</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.ClassifierAssignmentImpl#getAssignedClassifiers <em>Assigned Classifiers</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.ClassifierAssignmentImpl#getOwnedPropertyAssociations <em>Owned Property Associations</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.ClassifierAssignmentImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.ClassifierAssignmentImpl#getAnnexSubclause <em>Annex Subclause</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassifierAssignmentImpl extends MinimalEObjectImpl.Container implements ClassifierAssignment {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ModelElementReference target;

	/**
	 * The cached value of the '{@link #getClassifierAssignments() <em>Classifier Assignments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassifierAssignment> classifierAssignments;

	/**
	 * The cached value of the '{@link #getAssignedClassifiers() <em>Assigned Classifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedClassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeReference> assignedClassifiers;

	/**
	 * The cached value of the '{@link #getOwnedPropertyAssociations() <em>Owned Property Associations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPropertyAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyAssociation> ownedPropertyAssociations;

	/**
	 * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> bindings;

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
	protected ClassifierAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadlv3Package.Literals.CLASSIFIER_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelElementReference getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(ModelElementReference newTarget, NotificationChain msgs) {
		ModelElementReference oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Aadlv3Package.CLASSIFIER_ASSIGNMENT__TARGET, oldTarget, newTarget);
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
	public void setTarget(ModelElementReference newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Aadlv3Package.CLASSIFIER_ASSIGNMENT__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject) newTarget).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Aadlv3Package.CLASSIFIER_ASSIGNMENT__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadlv3Package.CLASSIFIER_ASSIGNMENT__TARGET,
					newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClassifierAssignment> getClassifierAssignments() {
		if (classifierAssignments == null) {
			classifierAssignments = new EObjectContainmentEList<ClassifierAssignment>(ClassifierAssignment.class, this,
					Aadlv3Package.CLASSIFIER_ASSIGNMENT__CLASSIFIER_ASSIGNMENTS);
		}
		return classifierAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeReference> getAssignedClassifiers() {
		if (assignedClassifiers == null) {
			assignedClassifiers = new EObjectContainmentEList<TypeReference>(TypeReference.class, this,
					Aadlv3Package.CLASSIFIER_ASSIGNMENT__ASSIGNED_CLASSIFIERS);
		}
		return assignedClassifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PropertyAssociation> getOwnedPropertyAssociations() {
		if (ownedPropertyAssociations == null) {
			ownedPropertyAssociations = new EObjectContainmentEList<PropertyAssociation>(PropertyAssociation.class,
					this, Aadlv3Package.CLASSIFIER_ASSIGNMENT__OWNED_PROPERTY_ASSOCIATIONS);
		}
		return ownedPropertyAssociations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Association> getBindings() {
		if (bindings == null) {
			bindings = new EObjectContainmentEList<Association>(Association.class, this,
					Aadlv3Package.CLASSIFIER_ASSIGNMENT__BINDINGS);
		}
		return bindings;
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
					Aadlv3Package.CLASSIFIER_ASSIGNMENT__ANNEX_SUBCLAUSE);
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
		case Aadlv3Package.CLASSIFIER_ASSIGNMENT__TARGET:
			return basicSetTarget(null, msgs);
		case Aadlv3Package.CLASSIFIER_ASSIGNMENT__CLASSIFIER_ASSIGNMENTS:
			return ((InternalEList<?>) getClassifierAssignments()).basicRemove(otherEnd, msgs);
		case Aadlv3Package.CLASSIFIER_ASSIGNMENT__ASSIGNED_CLASSIFIERS:
			return ((InternalEList<?>) getAssignedClassifiers()).basicRemove(otherEnd, msgs);
		case Aadlv3Package.CLASSIFIER_ASSIGNMENT__OWNED_PROPERTY_ASSOCIATIONS:
			return ((InternalEList<?>) getOwnedPropertyAssociations()).basicRemove(otherEnd, msgs);
		case Aadlv3Package.CLASSIFIER_ASSIGNMENT__BINDINGS:
			return ((InternalEList<?>) getBindings()).basicRemove(otherEnd, msgs);
		case Aadlv3Package.CLASSIFIER_ASSIGNMENT__ANNEX_SUBCLAUSE:
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
		case Aadlv3Package.CLASSIFIER_ASSIGNMENT__TARGET:
			return getTarget();
		case Aadlv3Package.CLASSIFIER_ASSIGNMENT__CLASSIFIER_ASSIGNMENTS:
			return getClassifierAssignments();
		case Aadlv3Package.CLASSIFIER_ASSIGNMENT__ASSIGNED_CLASSIFIERS:
			return getAssignedClassifiers();
		case Aadlv3Package.CLASSIFIER_ASSIGNMENT__OWNED_PROPERTY_ASSOCIATIONS:
			return getOwnedPropertyAssociations();
		case Aadlv3Package.CLASSIFIER_ASSIGNMENT__BINDINGS:
			return getBindings();
		case Aadlv3Package.CLASSIFIER_ASSIGNMENT__ANNEX_SUBCLAUSE:
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
		case Aadlv3Package.CLASSIFIER_ASSIGNMENT__TARGET:
			setTarget((ModelElementReference) newValue);
			return;
		case Aadlv3Package.CLASSIFIER_ASSIGNMENT__CLASSIFIER_ASSIGNMENTS:
			getClassifierAssignments().clear();
			getClassifierAssignments().addAll((Collection<? extends ClassifierAssignment>) newValue);
			return;
		case Aadlv3Package.CLASSIFIER_ASSIGNMENT__ASSIGNED_CLASSIFIERS:
			getAssignedClassifiers().clear();
			getAssignedClassifiers().addAll((Collection<? extends TypeReference>) newValue);
			return;
		case Aadlv3Package.CLASSIFIER_ASSIGNMENT__OWNED_PROPERTY_ASSOCIATIONS:
			getOwnedPropertyAssociations().clear();
			getOwnedPropertyAssociations().addAll((Collection<? extends PropertyAssociation>) newValue);
			return;
		case Aadlv3Package.CLASSIFIER_ASSIGNMENT__BINDINGS:
			getBindings().clear();
			getBindings().addAll((Collection<? extends Association>) newValue);
			return;
		case Aadlv3Package.CLASSIFIER_ASSIGNMENT__ANNEX_SUBCLAUSE:
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
		case Aadlv3Package.CLASSIFIER_ASSIGNMENT__TARGET:
			setTarget((ModelElementReference) null);
			return;
		case Aadlv3Package.CLASSIFIER_ASSIGNMENT__CLASSIFIER_ASSIGNMENTS:
			getClassifierAssignments().clear();
			return;
		case Aadlv3Package.CLASSIFIER_ASSIGNMENT__ASSIGNED_CLASSIFIERS:
			getAssignedClassifiers().clear();
			return;
		case Aadlv3Package.CLASSIFIER_ASSIGNMENT__OWNED_PROPERTY_ASSOCIATIONS:
			getOwnedPropertyAssociations().clear();
			return;
		case Aadlv3Package.CLASSIFIER_ASSIGNMENT__BINDINGS:
			getBindings().clear();
			return;
		case Aadlv3Package.CLASSIFIER_ASSIGNMENT__ANNEX_SUBCLAUSE:
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
		case Aadlv3Package.CLASSIFIER_ASSIGNMENT__TARGET:
			return target != null;
		case Aadlv3Package.CLASSIFIER_ASSIGNMENT__CLASSIFIER_ASSIGNMENTS:
			return classifierAssignments != null && !classifierAssignments.isEmpty();
		case Aadlv3Package.CLASSIFIER_ASSIGNMENT__ASSIGNED_CLASSIFIERS:
			return assignedClassifiers != null && !assignedClassifiers.isEmpty();
		case Aadlv3Package.CLASSIFIER_ASSIGNMENT__OWNED_PROPERTY_ASSOCIATIONS:
			return ownedPropertyAssociations != null && !ownedPropertyAssociations.isEmpty();
		case Aadlv3Package.CLASSIFIER_ASSIGNMENT__BINDINGS:
			return bindings != null && !bindings.isEmpty();
		case Aadlv3Package.CLASSIFIER_ASSIGNMENT__ANNEX_SUBCLAUSE:
			return annexSubclause != null && !annexSubclause.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClassifierAssignmentImpl
