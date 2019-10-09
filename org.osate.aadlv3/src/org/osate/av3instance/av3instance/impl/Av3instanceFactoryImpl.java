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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.osate.av3instance.av3instance.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Av3instanceFactoryImpl extends EFactoryImpl implements Av3instanceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Av3instanceFactory init() {
		try {
			Av3instanceFactory theAv3instanceFactory = (Av3instanceFactory) EPackage.Registry.INSTANCE
					.getEFactory(Av3instancePackage.eNS_URI);
			if (theAv3instanceFactory != null) {
				return theAv3instanceFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Av3instanceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Av3instanceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Av3instancePackage.FEATURE_INSTANCE:
			return createFeatureInstance();
		case Av3instancePackage.COMPONENT_INSTANCE:
			return createComponentInstance();
		case Av3instancePackage.ASSOCIATION_INSTANCE:
			return createAssociationInstance();
		case Av3instancePackage.PATH_INSTANCE:
			return createPathInstance();
		case Av3instancePackage.BEHAVIOR_RULE_INSTANCE:
			return createBehaviorRuleInstance();
		case Av3instancePackage.GENERATOR_INSTANCE:
			return createGeneratorInstance();
		case Av3instancePackage.CONSTRAINED_INSTANCE_OBJECT:
			return createConstrainedInstanceObject();
		case Av3instancePackage.STATE_INSTANCE:
			return createStateInstance();
		case Av3instancePackage.SINK_INSTANCE:
			return createSinkInstance();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureInstance createFeatureInstance() {
		FeatureInstanceImpl featureInstance = new FeatureInstanceImpl();
		return featureInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentInstance createComponentInstance() {
		ComponentInstanceImpl componentInstance = new ComponentInstanceImpl();
		return componentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssociationInstance createAssociationInstance() {
		AssociationInstanceImpl associationInstance = new AssociationInstanceImpl();
		return associationInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PathInstance createPathInstance() {
		PathInstanceImpl pathInstance = new PathInstanceImpl();
		return pathInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BehaviorRuleInstance createBehaviorRuleInstance() {
		BehaviorRuleInstanceImpl behaviorRuleInstance = new BehaviorRuleInstanceImpl();
		return behaviorRuleInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeneratorInstance createGeneratorInstance() {
		GeneratorInstanceImpl generatorInstance = new GeneratorInstanceImpl();
		return generatorInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstrainedInstanceObject createConstrainedInstanceObject() {
		ConstrainedInstanceObjectImpl constrainedInstanceObject = new ConstrainedInstanceObjectImpl();
		return constrainedInstanceObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateInstance createStateInstance() {
		StateInstanceImpl stateInstance = new StateInstanceImpl();
		return stateInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SinkInstance createSinkInstance() {
		SinkInstanceImpl sinkInstance = new SinkInstanceImpl();
		return sinkInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Av3instancePackage getAv3instancePackage() {
		return (Av3instancePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Av3instancePackage getPackage() {
		return Av3instancePackage.eINSTANCE;
	}

} //Av3instanceFactoryImpl
