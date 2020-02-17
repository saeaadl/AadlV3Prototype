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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.osate.aadlv3.aadlv3.Literal;
import org.osate.av3instance.av3instance.Av3instancePackage;
import org.osate.av3instance.av3instance.ConstrainedInstanceObject;
import org.osate.av3instance.av3instance.InstanceObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constrained Instance Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.av3instance.av3instance.impl.ConstrainedInstanceObjectImpl#getInstanceObject <em>Instance Object</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.ConstrainedInstanceObjectImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.ConstrainedInstanceObjectImpl#isOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstrainedInstanceObjectImpl extends InstanceObjectImpl implements ConstrainedInstanceObject {
	/**
	 * The cached value of the '{@link #getInstanceObject() <em>Instance Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceObject()
	 * @generated
	 * @ordered
	 */
	protected InstanceObject instanceObject;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected Literal constraint;

	/**
	 * The default value of the '{@link #isOutgoing() <em>Outgoing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutgoing()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OUTGOING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOutgoing() <em>Outgoing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutgoing()
	 * @generated
	 * @ordered
	 */
	protected boolean outgoing = OUTGOING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstrainedInstanceObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Av3instancePackage.Literals.CONSTRAINED_INSTANCE_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstanceObject getInstanceObject() {
		if (instanceObject != null && instanceObject.eIsProxy()) {
			InternalEObject oldInstanceObject = (InternalEObject) instanceObject;
			instanceObject = (InstanceObject) eResolveProxy(oldInstanceObject);
			if (instanceObject != oldInstanceObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Av3instancePackage.CONSTRAINED_INSTANCE_OBJECT__INSTANCE_OBJECT, oldInstanceObject,
							instanceObject));
			}
		}
		return instanceObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceObject basicGetInstanceObject() {
		return instanceObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstanceObject(InstanceObject newInstanceObject) {
		InstanceObject oldInstanceObject = instanceObject;
		instanceObject = newInstanceObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Av3instancePackage.CONSTRAINED_INSTANCE_OBJECT__INSTANCE_OBJECT, oldInstanceObject,
					instanceObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Literal getConstraint() {
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraint(Literal newConstraint, NotificationChain msgs) {
		Literal oldConstraint = constraint;
		constraint = newConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Av3instancePackage.CONSTRAINED_INSTANCE_OBJECT__CONSTRAINT, oldConstraint, newConstraint);
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
	public void setConstraint(Literal newConstraint) {
		if (newConstraint != constraint) {
			NotificationChain msgs = null;
			if (constraint != null)
				msgs = ((InternalEObject) constraint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Av3instancePackage.CONSTRAINED_INSTANCE_OBJECT__CONSTRAINT, null,
						msgs);
			if (newConstraint != null)
				msgs = ((InternalEObject) newConstraint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Av3instancePackage.CONSTRAINED_INSTANCE_OBJECT__CONSTRAINT, null,
						msgs);
			msgs = basicSetConstraint(newConstraint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Av3instancePackage.CONSTRAINED_INSTANCE_OBJECT__CONSTRAINT, newConstraint, newConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOutgoing() {
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutgoing(boolean newOutgoing) {
		boolean oldOutgoing = outgoing;
		outgoing = newOutgoing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Av3instancePackage.CONSTRAINED_INSTANCE_OBJECT__OUTGOING, oldOutgoing, outgoing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Av3instancePackage.CONSTRAINED_INSTANCE_OBJECT__CONSTRAINT:
			return basicSetConstraint(null, msgs);
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
		case Av3instancePackage.CONSTRAINED_INSTANCE_OBJECT__INSTANCE_OBJECT:
			if (resolve)
				return getInstanceObject();
			return basicGetInstanceObject();
		case Av3instancePackage.CONSTRAINED_INSTANCE_OBJECT__CONSTRAINT:
			return getConstraint();
		case Av3instancePackage.CONSTRAINED_INSTANCE_OBJECT__OUTGOING:
			return isOutgoing();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Av3instancePackage.CONSTRAINED_INSTANCE_OBJECT__INSTANCE_OBJECT:
			setInstanceObject((InstanceObject) newValue);
			return;
		case Av3instancePackage.CONSTRAINED_INSTANCE_OBJECT__CONSTRAINT:
			setConstraint((Literal) newValue);
			return;
		case Av3instancePackage.CONSTRAINED_INSTANCE_OBJECT__OUTGOING:
			setOutgoing((Boolean) newValue);
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
		case Av3instancePackage.CONSTRAINED_INSTANCE_OBJECT__INSTANCE_OBJECT:
			setInstanceObject((InstanceObject) null);
			return;
		case Av3instancePackage.CONSTRAINED_INSTANCE_OBJECT__CONSTRAINT:
			setConstraint((Literal) null);
			return;
		case Av3instancePackage.CONSTRAINED_INSTANCE_OBJECT__OUTGOING:
			setOutgoing(OUTGOING_EDEFAULT);
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
		case Av3instancePackage.CONSTRAINED_INSTANCE_OBJECT__INSTANCE_OBJECT:
			return instanceObject != null;
		case Av3instancePackage.CONSTRAINED_INSTANCE_OBJECT__CONSTRAINT:
			return constraint != null;
		case Av3instancePackage.CONSTRAINED_INSTANCE_OBJECT__OUTGOING:
			return outgoing != OUTGOING_EDEFAULT;
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
		ConstrainedInstanceObjectImpl other = (ConstrainedInstanceObjectImpl) obj;
		if (instanceObject == null) {
			if (other.instanceObject != null)
				return false;
		} else if (this.getInstanceObject() != other.getInstanceObject())
			return false;
		if (constraint == null) {
			if (other.constraint != null)
				return false;
		} else if (!constraint.sameAs(other.constraint))
			return false;
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();
		return "("+this.getInstanceObject().toString()
				+ (this.getConstraint() != null ? ":" + this.getConstraint().toString() : "")+")";
	}

	@Override
	public boolean contains(Literal element) {
		return sameAs(element);
	}

} //ConstrainedInstanceObjectImpl
