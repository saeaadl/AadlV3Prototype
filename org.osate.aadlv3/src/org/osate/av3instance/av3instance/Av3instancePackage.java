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
package org.osate.av3instance.av3instance;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.osate.aadlv3.aadlv3.Aadlv3Package;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.osate.av3instance.av3instance.Av3instanceFactory
 * @model kind="package"
 * @generated
 */
public interface Av3instancePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "av3instance"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.osate.org/aadlv3/AV3Instance"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "av3instance"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Av3instancePackage eINSTANCE = org.osate.av3instance.av3instance.impl.Av3instancePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.osate.av3instance.av3instance.impl.InstanceObjectImpl <em>Instance Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.av3instance.av3instance.impl.InstanceObjectImpl
	 * @see org.osate.av3instance.av3instance.impl.Av3instancePackageImpl#getInstanceObject()
	 * @generated
	 */
	int INSTANCE_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT__NAME = Aadlv3Package.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT__OWNED_PROPERTY_ASSOCIATIONS = Aadlv3Package.NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Incoming Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT__INCOMING_ASSOCIATIONS = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT__OUTGOING_ASSOCIATIONS = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instance Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT_FEATURE_COUNT = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.osate.av3instance.av3instance.impl.FeatureInstanceImpl <em>Feature Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.av3instance.av3instance.impl.FeatureInstanceImpl
	 * @see org.osate.av3instance.av3instance.impl.Av3instancePackageImpl#getFeatureInstance()
	 * @generated
	 */
	int FEATURE_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INSTANCE__NAME = INSTANCE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INSTANCE__OWNED_PROPERTY_ASSOCIATIONS = INSTANCE_OBJECT__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Incoming Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INSTANCE__INCOMING_ASSOCIATIONS = INSTANCE_OBJECT__INCOMING_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INSTANCE__OUTGOING_ASSOCIATIONS = INSTANCE_OBJECT__OUTGOING_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INSTANCE__FEATURE = INSTANCE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INSTANCE__DIRECTION = INSTANCE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INSTANCE__CATEGORY = INSTANCE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INSTANCE__FEATURES = INSTANCE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Feature Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INSTANCE_FEATURE_COUNT = INSTANCE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.osate.av3instance.av3instance.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.av3instance.av3instance.impl.ComponentInstanceImpl
	 * @see org.osate.av3instance.av3instance.impl.Av3instancePackageImpl#getComponentInstance()
	 * @generated
	 */
	int COMPONENT_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__NAME = INSTANCE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__OWNED_PROPERTY_ASSOCIATIONS = INSTANCE_OBJECT__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Incoming Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__INCOMING_ASSOCIATIONS = INSTANCE_OBJECT__INCOMING_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__OUTGOING_ASSOCIATIONS = INSTANCE_OBJECT__OUTGOING_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__CATEGORY = INSTANCE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__COMPONENTS = INSTANCE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__COMPONENT = INSTANCE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__CONNECTIONS = INSTANCE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__FEATURES = INSTANCE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Flowspecs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__FLOWSPECS = INSTANCE_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__PATHS = INSTANCE_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Behavior Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__BEHAVIOR_RULES = INSTANCE_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__GENERATORS = INSTANCE_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__STATES = INSTANCE_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__ACTIONS = INSTANCE_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Sinks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__SINKS = INSTANCE_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_FEATURE_COUNT = INSTANCE_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.osate.av3instance.av3instance.impl.AssociationInstanceImpl <em>Association Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.av3instance.av3instance.impl.AssociationInstanceImpl
	 * @see org.osate.av3instance.av3instance.impl.Av3instancePackageImpl#getAssociationInstance()
	 * @generated
	 */
	int ASSOCIATION_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_INSTANCE__NAME = INSTANCE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_INSTANCE__OWNED_PROPERTY_ASSOCIATIONS = INSTANCE_OBJECT__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Incoming Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_INSTANCE__INCOMING_ASSOCIATIONS = INSTANCE_OBJECT__INCOMING_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_INSTANCE__OUTGOING_ASSOCIATIONS = INSTANCE_OBJECT__OUTGOING_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Association Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_INSTANCE__ASSOCIATION_TYPE = INSTANCE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_INSTANCE__ASSOCIATION = INSTANCE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_INSTANCE__SOURCE = INSTANCE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_INSTANCE__DESTINATION = INSTANCE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Source Delegates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_INSTANCE__SOURCE_DELEGATES = INSTANCE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Destination Delegates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_INSTANCE__DESTINATION_DELEGATES = INSTANCE_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_INSTANCE__EXTERNAL = INSTANCE_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_INSTANCE__BIDIRECTIONAL = INSTANCE_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Association Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_INSTANCE_FEATURE_COUNT = INSTANCE_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.osate.av3instance.av3instance.impl.PathInstanceImpl <em>Path Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.av3instance.av3instance.impl.PathInstanceImpl
	 * @see org.osate.av3instance.av3instance.impl.Av3instancePackageImpl#getPathInstance()
	 * @generated
	 */
	int PATH_INSTANCE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_INSTANCE__NAME = INSTANCE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_INSTANCE__OWNED_PROPERTY_ASSOCIATIONS = INSTANCE_OBJECT__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Incoming Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_INSTANCE__INCOMING_ASSOCIATIONS = INSTANCE_OBJECT__INCOMING_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_INSTANCE__OUTGOING_ASSOCIATIONS = INSTANCE_OBJECT__OUTGOING_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_INSTANCE__ELEMENTS = INSTANCE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_INSTANCE__PATH = INSTANCE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Path Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_INSTANCE_FEATURE_COUNT = INSTANCE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.osate.av3instance.av3instance.impl.BehaviorRuleInstanceImpl <em>Behavior Rule Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.av3instance.av3instance.impl.BehaviorRuleInstanceImpl
	 * @see org.osate.av3instance.av3instance.impl.Av3instancePackageImpl#getBehaviorRuleInstance()
	 * @generated
	 */
	int BEHAVIOR_RULE_INSTANCE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_RULE_INSTANCE__NAME = INSTANCE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_RULE_INSTANCE__OWNED_PROPERTY_ASSOCIATIONS = INSTANCE_OBJECT__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Incoming Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_RULE_INSTANCE__INCOMING_ASSOCIATIONS = INSTANCE_OBJECT__INCOMING_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_RULE_INSTANCE__OUTGOING_ASSOCIATIONS = INSTANCE_OBJECT__OUTGOING_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Behavior Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_RULE_INSTANCE__BEHAVIOR_RULE = INSTANCE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_RULE_INSTANCE__CONDITION = INSTANCE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_RULE_INSTANCE__ACTIONS = INSTANCE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Current State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_RULE_INSTANCE__CURRENT_STATE = INSTANCE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_RULE_INSTANCE__TARGET_STATE = INSTANCE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sink</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_RULE_INSTANCE__SINK = INSTANCE_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Behavior Rule Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_RULE_INSTANCE_FEATURE_COUNT = INSTANCE_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.osate.av3instance.av3instance.impl.GeneratorInstanceImpl <em>Generator Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.av3instance.av3instance.impl.GeneratorInstanceImpl
	 * @see org.osate.av3instance.av3instance.impl.Av3instancePackageImpl#getGeneratorInstance()
	 * @generated
	 */
	int GENERATOR_INSTANCE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_INSTANCE__NAME = INSTANCE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_INSTANCE__OWNED_PROPERTY_ASSOCIATIONS = INSTANCE_OBJECT__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Incoming Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_INSTANCE__INCOMING_ASSOCIATIONS = INSTANCE_OBJECT__INCOMING_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_INSTANCE__OUTGOING_ASSOCIATIONS = INSTANCE_OBJECT__OUTGOING_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_INSTANCE__GENERATOR = INSTANCE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generated Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_INSTANCE__GENERATED_LITERALS = INSTANCE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Generator Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_INSTANCE_FEATURE_COUNT = INSTANCE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.osate.av3instance.av3instance.impl.ConstrainedInstanceObjectImpl <em>Constrained Instance Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.av3instance.av3instance.impl.ConstrainedInstanceObjectImpl
	 * @see org.osate.av3instance.av3instance.impl.Av3instancePackageImpl#getConstrainedInstanceObject()
	 * @generated
	 */
	int CONSTRAINED_INSTANCE_OBJECT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINED_INSTANCE_OBJECT__NAME = INSTANCE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINED_INSTANCE_OBJECT__OWNED_PROPERTY_ASSOCIATIONS = INSTANCE_OBJECT__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Incoming Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINED_INSTANCE_OBJECT__INCOMING_ASSOCIATIONS = INSTANCE_OBJECT__INCOMING_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINED_INSTANCE_OBJECT__OUTGOING_ASSOCIATIONS = INSTANCE_OBJECT__OUTGOING_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Instance Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINED_INSTANCE_OBJECT__INSTANCE_OBJECT = INSTANCE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINED_INSTANCE_OBJECT__CONSTRAINT = INSTANCE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINED_INSTANCE_OBJECT__OUTGOING = INSTANCE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Constrained Instance Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINED_INSTANCE_OBJECT_FEATURE_COUNT = INSTANCE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.osate.av3instance.av3instance.impl.StateInstanceImpl <em>State Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.av3instance.av3instance.impl.StateInstanceImpl
	 * @see org.osate.av3instance.av3instance.impl.Av3instancePackageImpl#getStateInstance()
	 * @generated
	 */
	int STATE_INSTANCE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INSTANCE__NAME = INSTANCE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INSTANCE__OWNED_PROPERTY_ASSOCIATIONS = INSTANCE_OBJECT__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Incoming Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INSTANCE__INCOMING_ASSOCIATIONS = INSTANCE_OBJECT__INCOMING_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INSTANCE__OUTGOING_ASSOCIATIONS = INSTANCE_OBJECT__OUTGOING_ASSOCIATIONS;

	/**
	 * The number of structural features of the '<em>State Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INSTANCE_FEATURE_COUNT = INSTANCE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.av3instance.av3instance.impl.SinkInstanceImpl <em>Sink Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.av3instance.av3instance.impl.SinkInstanceImpl
	 * @see org.osate.av3instance.av3instance.impl.Av3instancePackageImpl#getSinkInstance()
	 * @generated
	 */
	int SINK_INSTANCE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_INSTANCE__NAME = INSTANCE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_INSTANCE__OWNED_PROPERTY_ASSOCIATIONS = INSTANCE_OBJECT__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Incoming Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_INSTANCE__INCOMING_ASSOCIATIONS = INSTANCE_OBJECT__INCOMING_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_INSTANCE__OUTGOING_ASSOCIATIONS = INSTANCE_OBJECT__OUTGOING_ASSOCIATIONS;

	/**
	 * The number of structural features of the '<em>Sink Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_INSTANCE_FEATURE_COUNT = INSTANCE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.osate.av3instance.av3instance.InstanceObject <em>Instance Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Object</em>'.
	 * @see org.osate.av3instance.av3instance.InstanceObject
	 * @generated
	 */
	EClass getInstanceObject();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.av3instance.av3instance.InstanceObject#getIncomingAssociations <em>Incoming Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Associations</em>'.
	 * @see org.osate.av3instance.av3instance.InstanceObject#getIncomingAssociations()
	 * @see #getInstanceObject()
	 * @generated
	 */
	EReference getInstanceObject_IncomingAssociations();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.av3instance.av3instance.InstanceObject#getOutgoingAssociations <em>Outgoing Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Associations</em>'.
	 * @see org.osate.av3instance.av3instance.InstanceObject#getOutgoingAssociations()
	 * @see #getInstanceObject()
	 * @generated
	 */
	EReference getInstanceObject_OutgoingAssociations();

	/**
	 * Returns the meta object for class '{@link org.osate.av3instance.av3instance.FeatureInstance <em>Feature Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Instance</em>'.
	 * @see org.osate.av3instance.av3instance.FeatureInstance
	 * @generated
	 */
	EClass getFeatureInstance();

	/**
	 * Returns the meta object for the reference '{@link org.osate.av3instance.av3instance.FeatureInstance#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.osate.av3instance.av3instance.FeatureInstance#getFeature()
	 * @see #getFeatureInstance()
	 * @generated
	 */
	EReference getFeatureInstance_Feature();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.av3instance.av3instance.FeatureInstance#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.osate.av3instance.av3instance.FeatureInstance#getDirection()
	 * @see #getFeatureInstance()
	 * @generated
	 */
	EAttribute getFeatureInstance_Direction();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.av3instance.av3instance.FeatureInstance#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see org.osate.av3instance.av3instance.FeatureInstance#getCategory()
	 * @see #getFeatureInstance()
	 * @generated
	 */
	EAttribute getFeatureInstance_Category();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.av3instance.av3instance.FeatureInstance#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see org.osate.av3instance.av3instance.FeatureInstance#getFeatures()
	 * @see #getFeatureInstance()
	 * @generated
	 */
	EReference getFeatureInstance_Features();

	/**
	 * Returns the meta object for class '{@link org.osate.av3instance.av3instance.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance</em>'.
	 * @see org.osate.av3instance.av3instance.ComponentInstance
	 * @generated
	 */
	EClass getComponentInstance();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.av3instance.av3instance.ComponentInstance#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see org.osate.av3instance.av3instance.ComponentInstance#getCategory()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EAttribute getComponentInstance_Category();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.av3instance.av3instance.ComponentInstance#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.osate.av3instance.av3instance.ComponentInstance#getComponents()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Components();

	/**
	 * Returns the meta object for the reference '{@link org.osate.av3instance.av3instance.ComponentInstance#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see org.osate.av3instance.av3instance.ComponentInstance#getComponent()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.av3instance.av3instance.ComponentInstance#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see org.osate.av3instance.av3instance.ComponentInstance#getConnections()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Connections();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.av3instance.av3instance.ComponentInstance#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see org.osate.av3instance.av3instance.ComponentInstance#getFeatures()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Features();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.av3instance.av3instance.ComponentInstance#getFlowspecs <em>Flowspecs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flowspecs</em>'.
	 * @see org.osate.av3instance.av3instance.ComponentInstance#getFlowspecs()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Flowspecs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.av3instance.av3instance.ComponentInstance#getPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paths</em>'.
	 * @see org.osate.av3instance.av3instance.ComponentInstance#getPaths()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Paths();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.av3instance.av3instance.ComponentInstance#getBehaviorRules <em>Behavior Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behavior Rules</em>'.
	 * @see org.osate.av3instance.av3instance.ComponentInstance#getBehaviorRules()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_BehaviorRules();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.av3instance.av3instance.ComponentInstance#getGenerators <em>Generators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generators</em>'.
	 * @see org.osate.av3instance.av3instance.ComponentInstance#getGenerators()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Generators();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.av3instance.av3instance.ComponentInstance#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see org.osate.av3instance.av3instance.ComponentInstance#getStates()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_States();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.av3instance.av3instance.ComponentInstance#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see org.osate.av3instance.av3instance.ComponentInstance#getActions()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Actions();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.av3instance.av3instance.ComponentInstance#getSinks <em>Sinks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sinks</em>'.
	 * @see org.osate.av3instance.av3instance.ComponentInstance#getSinks()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Sinks();

	/**
	 * Returns the meta object for class '{@link org.osate.av3instance.av3instance.AssociationInstance <em>Association Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Instance</em>'.
	 * @see org.osate.av3instance.av3instance.AssociationInstance
	 * @generated
	 */
	EClass getAssociationInstance();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.av3instance.av3instance.AssociationInstance#getAssociationType <em>Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Association Type</em>'.
	 * @see org.osate.av3instance.av3instance.AssociationInstance#getAssociationType()
	 * @see #getAssociationInstance()
	 * @generated
	 */
	EAttribute getAssociationInstance_AssociationType();

	/**
	 * Returns the meta object for the reference '{@link org.osate.av3instance.av3instance.AssociationInstance#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Association</em>'.
	 * @see org.osate.av3instance.av3instance.AssociationInstance#getAssociation()
	 * @see #getAssociationInstance()
	 * @generated
	 */
	EReference getAssociationInstance_Association();

	/**
	 * Returns the meta object for the reference '{@link org.osate.av3instance.av3instance.AssociationInstance#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.osate.av3instance.av3instance.AssociationInstance#getSource()
	 * @see #getAssociationInstance()
	 * @generated
	 */
	EReference getAssociationInstance_Source();

	/**
	 * Returns the meta object for the reference '{@link org.osate.av3instance.av3instance.AssociationInstance#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see org.osate.av3instance.av3instance.AssociationInstance#getDestination()
	 * @see #getAssociationInstance()
	 * @generated
	 */
	EReference getAssociationInstance_Destination();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.av3instance.av3instance.AssociationInstance#getSourceDelegates <em>Source Delegates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Delegates</em>'.
	 * @see org.osate.av3instance.av3instance.AssociationInstance#getSourceDelegates()
	 * @see #getAssociationInstance()
	 * @generated
	 */
	EReference getAssociationInstance_SourceDelegates();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.av3instance.av3instance.AssociationInstance#getDestinationDelegates <em>Destination Delegates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Destination Delegates</em>'.
	 * @see org.osate.av3instance.av3instance.AssociationInstance#getDestinationDelegates()
	 * @see #getAssociationInstance()
	 * @generated
	 */
	EReference getAssociationInstance_DestinationDelegates();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.av3instance.av3instance.AssociationInstance#isExternal <em>External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External</em>'.
	 * @see org.osate.av3instance.av3instance.AssociationInstance#isExternal()
	 * @see #getAssociationInstance()
	 * @generated
	 */
	EAttribute getAssociationInstance_External();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.av3instance.av3instance.AssociationInstance#isBidirectional <em>Bidirectional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bidirectional</em>'.
	 * @see org.osate.av3instance.av3instance.AssociationInstance#isBidirectional()
	 * @see #getAssociationInstance()
	 * @generated
	 */
	EAttribute getAssociationInstance_Bidirectional();

	/**
	 * Returns the meta object for class '{@link org.osate.av3instance.av3instance.PathInstance <em>Path Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Instance</em>'.
	 * @see org.osate.av3instance.av3instance.PathInstance
	 * @generated
	 */
	EClass getPathInstance();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.av3instance.av3instance.PathInstance#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see org.osate.av3instance.av3instance.PathInstance#getElements()
	 * @see #getPathInstance()
	 * @generated
	 */
	EReference getPathInstance_Elements();

	/**
	 * Returns the meta object for the reference '{@link org.osate.av3instance.av3instance.PathInstance#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Path</em>'.
	 * @see org.osate.av3instance.av3instance.PathInstance#getPath()
	 * @see #getPathInstance()
	 * @generated
	 */
	EReference getPathInstance_Path();

	/**
	 * Returns the meta object for class '{@link org.osate.av3instance.av3instance.BehaviorRuleInstance <em>Behavior Rule Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Rule Instance</em>'.
	 * @see org.osate.av3instance.av3instance.BehaviorRuleInstance
	 * @generated
	 */
	EClass getBehaviorRuleInstance();

	/**
	 * Returns the meta object for the reference '{@link org.osate.av3instance.av3instance.BehaviorRuleInstance#getBehaviorRule <em>Behavior Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Behavior Rule</em>'.
	 * @see org.osate.av3instance.av3instance.BehaviorRuleInstance#getBehaviorRule()
	 * @see #getBehaviorRuleInstance()
	 * @generated
	 */
	EReference getBehaviorRuleInstance_BehaviorRule();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.av3instance.av3instance.BehaviorRuleInstance#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actions</em>'.
	 * @see org.osate.av3instance.av3instance.BehaviorRuleInstance#getActions()
	 * @see #getBehaviorRuleInstance()
	 * @generated
	 */
	EReference getBehaviorRuleInstance_Actions();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.av3instance.av3instance.BehaviorRuleInstance#getCurrentState <em>Current State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Current State</em>'.
	 * @see org.osate.av3instance.av3instance.BehaviorRuleInstance#getCurrentState()
	 * @see #getBehaviorRuleInstance()
	 * @generated
	 */
	EReference getBehaviorRuleInstance_CurrentState();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.av3instance.av3instance.BehaviorRuleInstance#getTargetState <em>Target State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target State</em>'.
	 * @see org.osate.av3instance.av3instance.BehaviorRuleInstance#getTargetState()
	 * @see #getBehaviorRuleInstance()
	 * @generated
	 */
	EReference getBehaviorRuleInstance_TargetState();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.av3instance.av3instance.BehaviorRuleInstance#isSink <em>Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sink</em>'.
	 * @see org.osate.av3instance.av3instance.BehaviorRuleInstance#isSink()
	 * @see #getBehaviorRuleInstance()
	 * @generated
	 */
	EAttribute getBehaviorRuleInstance_Sink();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.av3instance.av3instance.BehaviorRuleInstance#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.osate.av3instance.av3instance.BehaviorRuleInstance#getCondition()
	 * @see #getBehaviorRuleInstance()
	 * @generated
	 */
	EReference getBehaviorRuleInstance_Condition();

	/**
	 * Returns the meta object for class '{@link org.osate.av3instance.av3instance.GeneratorInstance <em>Generator Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Instance</em>'.
	 * @see org.osate.av3instance.av3instance.GeneratorInstance
	 * @generated
	 */
	EClass getGeneratorInstance();

	/**
	 * Returns the meta object for the reference '{@link org.osate.av3instance.av3instance.GeneratorInstance#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generator</em>'.
	 * @see org.osate.av3instance.av3instance.GeneratorInstance#getGenerator()
	 * @see #getGeneratorInstance()
	 * @generated
	 */
	EReference getGeneratorInstance_Generator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.av3instance.av3instance.GeneratorInstance#getGeneratedLiterals <em>Generated Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generated Literals</em>'.
	 * @see org.osate.av3instance.av3instance.GeneratorInstance#getGeneratedLiterals()
	 * @see #getGeneratorInstance()
	 * @generated
	 */
	EReference getGeneratorInstance_GeneratedLiterals();

	/**
	 * Returns the meta object for class '{@link org.osate.av3instance.av3instance.ConstrainedInstanceObject <em>Constrained Instance Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constrained Instance Object</em>'.
	 * @see org.osate.av3instance.av3instance.ConstrainedInstanceObject
	 * @generated
	 */
	EClass getConstrainedInstanceObject();

	/**
	 * Returns the meta object for the reference '{@link org.osate.av3instance.av3instance.ConstrainedInstanceObject#getInstanceObject <em>Instance Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance Object</em>'.
	 * @see org.osate.av3instance.av3instance.ConstrainedInstanceObject#getInstanceObject()
	 * @see #getConstrainedInstanceObject()
	 * @generated
	 */
	EReference getConstrainedInstanceObject_InstanceObject();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.av3instance.av3instance.ConstrainedInstanceObject#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraint</em>'.
	 * @see org.osate.av3instance.av3instance.ConstrainedInstanceObject#getConstraint()
	 * @see #getConstrainedInstanceObject()
	 * @generated
	 */
	EReference getConstrainedInstanceObject_Constraint();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.av3instance.av3instance.ConstrainedInstanceObject#isOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outgoing</em>'.
	 * @see org.osate.av3instance.av3instance.ConstrainedInstanceObject#isOutgoing()
	 * @see #getConstrainedInstanceObject()
	 * @generated
	 */
	EAttribute getConstrainedInstanceObject_Outgoing();

	/**
	 * Returns the meta object for class '{@link org.osate.av3instance.av3instance.StateInstance <em>State Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Instance</em>'.
	 * @see org.osate.av3instance.av3instance.StateInstance
	 * @generated
	 */
	EClass getStateInstance();

	/**
	 * Returns the meta object for class '{@link org.osate.av3instance.av3instance.SinkInstance <em>Sink Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sink Instance</em>'.
	 * @see org.osate.av3instance.av3instance.SinkInstance
	 * @generated
	 */
	EClass getSinkInstance();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Av3instanceFactory getAv3instanceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.osate.av3instance.av3instance.impl.InstanceObjectImpl <em>Instance Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.av3instance.av3instance.impl.InstanceObjectImpl
		 * @see org.osate.av3instance.av3instance.impl.Av3instancePackageImpl#getInstanceObject()
		 * @generated
		 */
		EClass INSTANCE_OBJECT = eINSTANCE.getInstanceObject();

		/**
		 * The meta object literal for the '<em><b>Incoming Associations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_OBJECT__INCOMING_ASSOCIATIONS = eINSTANCE.getInstanceObject_IncomingAssociations();

		/**
		 * The meta object literal for the '<em><b>Outgoing Associations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_OBJECT__OUTGOING_ASSOCIATIONS = eINSTANCE.getInstanceObject_OutgoingAssociations();

		/**
		 * The meta object literal for the '{@link org.osate.av3instance.av3instance.impl.FeatureInstanceImpl <em>Feature Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.av3instance.av3instance.impl.FeatureInstanceImpl
		 * @see org.osate.av3instance.av3instance.impl.Av3instancePackageImpl#getFeatureInstance()
		 * @generated
		 */
		EClass FEATURE_INSTANCE = eINSTANCE.getFeatureInstance();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_INSTANCE__FEATURE = eINSTANCE.getFeatureInstance_Feature();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_INSTANCE__DIRECTION = eINSTANCE.getFeatureInstance_Direction();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_INSTANCE__CATEGORY = eINSTANCE.getFeatureInstance_Category();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_INSTANCE__FEATURES = eINSTANCE.getFeatureInstance_Features();

		/**
		 * The meta object literal for the '{@link org.osate.av3instance.av3instance.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.av3instance.av3instance.impl.ComponentInstanceImpl
		 * @see org.osate.av3instance.av3instance.impl.Av3instancePackageImpl#getComponentInstance()
		 * @generated
		 */
		EClass COMPONENT_INSTANCE = eINSTANCE.getComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INSTANCE__CATEGORY = eINSTANCE.getComponentInstance_Category();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__COMPONENTS = eINSTANCE.getComponentInstance_Components();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__COMPONENT = eINSTANCE.getComponentInstance_Component();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__CONNECTIONS = eINSTANCE.getComponentInstance_Connections();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__FEATURES = eINSTANCE.getComponentInstance_Features();

		/**
		 * The meta object literal for the '<em><b>Flowspecs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__FLOWSPECS = eINSTANCE.getComponentInstance_Flowspecs();

		/**
		 * The meta object literal for the '<em><b>Paths</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__PATHS = eINSTANCE.getComponentInstance_Paths();

		/**
		 * The meta object literal for the '<em><b>Behavior Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__BEHAVIOR_RULES = eINSTANCE.getComponentInstance_BehaviorRules();

		/**
		 * The meta object literal for the '<em><b>Generators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__GENERATORS = eINSTANCE.getComponentInstance_Generators();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__STATES = eINSTANCE.getComponentInstance_States();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__ACTIONS = eINSTANCE.getComponentInstance_Actions();

		/**
		 * The meta object literal for the '<em><b>Sinks</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__SINKS = eINSTANCE.getComponentInstance_Sinks();

		/**
		 * The meta object literal for the '{@link org.osate.av3instance.av3instance.impl.AssociationInstanceImpl <em>Association Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.av3instance.av3instance.impl.AssociationInstanceImpl
		 * @see org.osate.av3instance.av3instance.impl.Av3instancePackageImpl#getAssociationInstance()
		 * @generated
		 */
		EClass ASSOCIATION_INSTANCE = eINSTANCE.getAssociationInstance();

		/**
		 * The meta object literal for the '<em><b>Association Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_INSTANCE__ASSOCIATION_TYPE = eINSTANCE.getAssociationInstance_AssociationType();

		/**
		 * The meta object literal for the '<em><b>Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_INSTANCE__ASSOCIATION = eINSTANCE.getAssociationInstance_Association();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_INSTANCE__SOURCE = eINSTANCE.getAssociationInstance_Source();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_INSTANCE__DESTINATION = eINSTANCE.getAssociationInstance_Destination();

		/**
		 * The meta object literal for the '<em><b>Source Delegates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_INSTANCE__SOURCE_DELEGATES = eINSTANCE.getAssociationInstance_SourceDelegates();

		/**
		 * The meta object literal for the '<em><b>Destination Delegates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_INSTANCE__DESTINATION_DELEGATES = eINSTANCE
				.getAssociationInstance_DestinationDelegates();

		/**
		 * The meta object literal for the '<em><b>External</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_INSTANCE__EXTERNAL = eINSTANCE.getAssociationInstance_External();

		/**
		 * The meta object literal for the '<em><b>Bidirectional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_INSTANCE__BIDIRECTIONAL = eINSTANCE.getAssociationInstance_Bidirectional();

		/**
		 * The meta object literal for the '{@link org.osate.av3instance.av3instance.impl.PathInstanceImpl <em>Path Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.av3instance.av3instance.impl.PathInstanceImpl
		 * @see org.osate.av3instance.av3instance.impl.Av3instancePackageImpl#getPathInstance()
		 * @generated
		 */
		EClass PATH_INSTANCE = eINSTANCE.getPathInstance();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_INSTANCE__ELEMENTS = eINSTANCE.getPathInstance_Elements();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_INSTANCE__PATH = eINSTANCE.getPathInstance_Path();

		/**
		 * The meta object literal for the '{@link org.osate.av3instance.av3instance.impl.BehaviorRuleInstanceImpl <em>Behavior Rule Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.av3instance.av3instance.impl.BehaviorRuleInstanceImpl
		 * @see org.osate.av3instance.av3instance.impl.Av3instancePackageImpl#getBehaviorRuleInstance()
		 * @generated
		 */
		EClass BEHAVIOR_RULE_INSTANCE = eINSTANCE.getBehaviorRuleInstance();

		/**
		 * The meta object literal for the '<em><b>Behavior Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_RULE_INSTANCE__BEHAVIOR_RULE = eINSTANCE.getBehaviorRuleInstance_BehaviorRule();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_RULE_INSTANCE__ACTIONS = eINSTANCE.getBehaviorRuleInstance_Actions();

		/**
		 * The meta object literal for the '<em><b>Current State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_RULE_INSTANCE__CURRENT_STATE = eINSTANCE.getBehaviorRuleInstance_CurrentState();

		/**
		 * The meta object literal for the '<em><b>Target State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_RULE_INSTANCE__TARGET_STATE = eINSTANCE.getBehaviorRuleInstance_TargetState();

		/**
		 * The meta object literal for the '<em><b>Sink</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR_RULE_INSTANCE__SINK = eINSTANCE.getBehaviorRuleInstance_Sink();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_RULE_INSTANCE__CONDITION = eINSTANCE.getBehaviorRuleInstance_Condition();

		/**
		 * The meta object literal for the '{@link org.osate.av3instance.av3instance.impl.GeneratorInstanceImpl <em>Generator Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.av3instance.av3instance.impl.GeneratorInstanceImpl
		 * @see org.osate.av3instance.av3instance.impl.Av3instancePackageImpl#getGeneratorInstance()
		 * @generated
		 */
		EClass GENERATOR_INSTANCE = eINSTANCE.getGeneratorInstance();

		/**
		 * The meta object literal for the '<em><b>Generator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_INSTANCE__GENERATOR = eINSTANCE.getGeneratorInstance_Generator();

		/**
		 * The meta object literal for the '<em><b>Generated Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_INSTANCE__GENERATED_LITERALS = eINSTANCE.getGeneratorInstance_GeneratedLiterals();

		/**
		 * The meta object literal for the '{@link org.osate.av3instance.av3instance.impl.ConstrainedInstanceObjectImpl <em>Constrained Instance Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.av3instance.av3instance.impl.ConstrainedInstanceObjectImpl
		 * @see org.osate.av3instance.av3instance.impl.Av3instancePackageImpl#getConstrainedInstanceObject()
		 * @generated
		 */
		EClass CONSTRAINED_INSTANCE_OBJECT = eINSTANCE.getConstrainedInstanceObject();

		/**
		 * The meta object literal for the '<em><b>Instance Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINED_INSTANCE_OBJECT__INSTANCE_OBJECT = eINSTANCE
				.getConstrainedInstanceObject_InstanceObject();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINED_INSTANCE_OBJECT__CONSTRAINT = eINSTANCE.getConstrainedInstanceObject_Constraint();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINED_INSTANCE_OBJECT__OUTGOING = eINSTANCE.getConstrainedInstanceObject_Outgoing();

		/**
		 * The meta object literal for the '{@link org.osate.av3instance.av3instance.impl.StateInstanceImpl <em>State Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.av3instance.av3instance.impl.StateInstanceImpl
		 * @see org.osate.av3instance.av3instance.impl.Av3instancePackageImpl#getStateInstance()
		 * @generated
		 */
		EClass STATE_INSTANCE = eINSTANCE.getStateInstance();

		/**
		 * The meta object literal for the '{@link org.osate.av3instance.av3instance.impl.SinkInstanceImpl <em>Sink Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.av3instance.av3instance.impl.SinkInstanceImpl
		 * @see org.osate.av3instance.av3instance.impl.Av3instancePackageImpl#getSinkInstance()
		 * @generated
		 */
		EClass SINK_INSTANCE = eINSTANCE.getSinkInstance();

	}

} //Av3instancePackage
