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
import static org.osate.aadlv3.util.AIv3API.getInstanceObjectPath;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.osate.aadlv3.aadlv3.Generator;
import org.osate.av3instance.av3instance.Av3instancePackage;
import org.osate.av3instance.av3instance.ConstrainedInstanceObject;
import org.osate.av3instance.av3instance.GeneratorInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.av3instance.av3instance.impl.GeneratorInstanceImpl#getGenerator <em>Generator</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.GeneratorInstanceImpl#getGeneratedLiterals <em>Generated Literals</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.impl.GeneratorInstanceImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneratorInstanceImpl extends InstanceObjectImpl implements GeneratorInstance {
	/**
	 * The cached value of the '{@link #getGenerator() <em>Generator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerator()
	 * @generated
	 * @ordered
	 */
	protected Generator generator;

	/**
	 * The cached value of the '{@link #getGeneratedLiterals() <em>Generated Literals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedLiterals()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstrainedInstanceObject> generatedLiterals;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Av3instancePackage.Literals.GENERATOR_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Generator getGenerator() {
		if (generator != null && generator.eIsProxy()) {
			InternalEObject oldGenerator = (InternalEObject) generator;
			generator = (Generator) eResolveProxy(oldGenerator);
			if (generator != oldGenerator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Av3instancePackage.GENERATOR_INSTANCE__GENERATOR, oldGenerator, generator));
			}
		}
		return generator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generator basicGetGenerator() {
		return generator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerator(Generator newGenerator) {
		Generator oldGenerator = generator;
		generator = newGenerator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Av3instancePackage.GENERATOR_INSTANCE__GENERATOR,
					oldGenerator, generator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConstrainedInstanceObject> getGeneratedLiterals() {
		if (generatedLiterals == null) {
			generatedLiterals = new EObjectContainmentEList<ConstrainedInstanceObject>(ConstrainedInstanceObject.class,
					this, Av3instancePackage.GENERATOR_INSTANCE__GENERATED_LITERALS);
		}
		return generatedLiterals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Av3instancePackage.GENERATOR_INSTANCE__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Av3instancePackage.GENERATOR_INSTANCE__GENERATED_LITERALS:
			return ((InternalEList<?>) getGeneratedLiterals()).basicRemove(otherEnd, msgs);
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
		case Av3instancePackage.GENERATOR_INSTANCE__GENERATOR:
			if (resolve)
				return getGenerator();
			return basicGetGenerator();
		case Av3instancePackage.GENERATOR_INSTANCE__GENERATED_LITERALS:
			return getGeneratedLiterals();
		case Av3instancePackage.GENERATOR_INSTANCE__TYPE:
			return getType();
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
		case Av3instancePackage.GENERATOR_INSTANCE__GENERATOR:
			setGenerator((Generator) newValue);
			return;
		case Av3instancePackage.GENERATOR_INSTANCE__GENERATED_LITERALS:
			getGeneratedLiterals().clear();
			getGeneratedLiterals().addAll((Collection<? extends ConstrainedInstanceObject>) newValue);
			return;
		case Av3instancePackage.GENERATOR_INSTANCE__TYPE:
			setType((String) newValue);
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
		case Av3instancePackage.GENERATOR_INSTANCE__GENERATOR:
			setGenerator((Generator) null);
			return;
		case Av3instancePackage.GENERATOR_INSTANCE__GENERATED_LITERALS:
			getGeneratedLiterals().clear();
			return;
		case Av3instancePackage.GENERATOR_INSTANCE__TYPE:
			setType(TYPE_EDEFAULT);
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
		case Av3instancePackage.GENERATOR_INSTANCE__GENERATOR:
			return generator != null;
		case Av3instancePackage.GENERATOR_INSTANCE__GENERATED_LITERALS:
			return generatedLiterals != null && !generatedLiterals.isEmpty();
		case Av3instancePackage.GENERATOR_INSTANCE__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		}
		return super.eIsSet(featureID);
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

		String result = "Generator " + getInstanceObjectPath(this);
		return result;
	}

} //GeneratorInstanceImpl
