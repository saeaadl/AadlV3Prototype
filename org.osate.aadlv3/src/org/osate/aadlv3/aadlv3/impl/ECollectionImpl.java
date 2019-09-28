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
import java.util.Iterator;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadlv3.aadlv3.Aadlv3Package;
import org.osate.aadlv3.aadlv3.ECollection;
import org.osate.aadlv3.aadlv3.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ECollection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.impl.ECollectionImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ECollectionImpl extends LiteralImpl implements ECollection {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> elements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ECollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadlv3Package.Literals.ECOLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<Expression>(Expression.class, this,
					Aadlv3Package.ECOLLECTION__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Aadlv3Package.ECOLLECTION__ELEMENTS:
			return ((InternalEList<?>) getElements()).basicRemove(otherEnd, msgs);
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
		case Aadlv3Package.ECOLLECTION__ELEMENTS:
			return getElements();
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
		case Aadlv3Package.ECOLLECTION__ELEMENTS:
			getElements().clear();
			getElements().addAll((Collection<? extends Expression>) newValue);
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
		case Aadlv3Package.ECOLLECTION__ELEMENTS:
			getElements().clear();
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
		case Aadlv3Package.ECOLLECTION__ELEMENTS:
			return elements != null && !elements.isEmpty();
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
		ECollectionImpl other = (ECollectionImpl) obj;
		if (elements == null) {
			if (other.elements != null) {
				return false;
			} else {
				//both are false
				return true;
			}
		} else {
			Iterator<Expression> it1 = elements.iterator();
			Iterator<Expression> it2 = other.elements.iterator();
			while (it1.hasNext() && it2.hasNext()) {
				Expression arg1 = it1.next();
				Expression arg2 = it2.next();
				//				if (!(arg1 instanceof Literal && arg2 instanceof Literal && ((Literal)arg1).sameAs((Literal)arg2)))
				if (!(arg1.sameAs(arg2)))
					return false;
			}
			return true;
		}
	}

	@Override
	public String toString() {
		String values = "";
		for (Expression elem : this.elements) {
			values = values.isEmpty() ? elem.toString() : ", " + elem.toString();
		}
		return "(" + values + ")";
	}

	@Override
	public boolean add(Expression obj) {
		return this.getElements().add(obj);
	}

	@Override
	public boolean add(EList<Expression> obj) {
		boolean res = true;
		for (Expression el : obj) {
			if (!this.add(el)) {
				res = false;
			}
		}
		return res;
	}

	@Override
	public boolean add(ECollection obj) {
		return this.add(obj.getElements());
	}

	@Override
	public boolean remove(Expression obj) {
		return this.getElements().remove(obj);
	}

	@Override
	public boolean remove(EList<Expression> obj) {
		boolean res = true;
		for (Expression el : obj) {
			if (!this.remove(el)) {
				res = false;
			}
		}
		return res;
	}

	@Override
	public boolean remove(ECollection obj) {
		return this.getElements().remove(obj);
	}

	@Override
	public boolean contains(Expression obj) {
		for (Expression el : this.getElements()) {
			if (el.sameAs(obj))
				return true;
		}
		return false;
	}

	@Override
	public boolean contains(EList<Expression> obj) {
		for (Expression el : obj) {
			if (!this.sameAs(el))
				return false;
		}
		return true;
	}

	@Override
	public boolean contains(ECollection obj) {
		for (Expression el : obj.getElements()) {
			if (!this.sameAs(el))
				return false;
		}
		return true;
	}

} //ECollectionImpl
