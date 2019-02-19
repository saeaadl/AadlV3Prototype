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
	int INSTANCE_OBJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT__PROPERTY_ASSOCIATIONS = 1;

	/**
	 * The number of structural features of the '<em>Instance Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Instance Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INSTANCE__PROPERTY_ASSOCIATIONS = INSTANCE_OBJECT__PROPERTY_ASSOCIATIONS;

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
	 * The feature id for the '<em><b>Outgoing Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INSTANCE__OUTGOING_ASSOCIATIONS = INSTANCE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Incoming Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INSTANCE__INCOMING_ASSOCIATIONS = INSTANCE_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Feature Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INSTANCE_FEATURE_COUNT = INSTANCE_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Feature Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INSTANCE_OPERATION_COUNT = INSTANCE_OBJECT_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__PROPERTY_ASSOCIATIONS = INSTANCE_OBJECT__PROPERTY_ASSOCIATIONS;

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
	 * The number of structural features of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_FEATURE_COUNT = INSTANCE_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_OPERATION_COUNT = INSTANCE_OBJECT_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_INSTANCE__PROPERTY_ASSOCIATIONS = INSTANCE_OBJECT__PROPERTY_ASSOCIATIONS;

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
	 * The feature id for the '<em><b>Source Mappings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_INSTANCE__SOURCE_MAPPINGS = INSTANCE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Destination Mappings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_INSTANCE__DESTINATION_MAPPINGS = INSTANCE_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_INSTANCE__EXTERNAL = INSTANCE_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Association Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_INSTANCE_FEATURE_COUNT = INSTANCE_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Association Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_INSTANCE_OPERATION_COUNT = INSTANCE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.av3instance.av3instance.impl.PropertyAssociationInstanceImpl <em>Property Association Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.av3instance.av3instance.impl.PropertyAssociationInstanceImpl
	 * @see org.osate.av3instance.av3instance.impl.Av3instancePackageImpl#getPropertyAssociationInstance()
	 * @generated
	 */
	int PROPERTY_ASSOCIATION_INSTANCE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSOCIATION_INSTANCE__NAME = INSTANCE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSOCIATION_INSTANCE__PROPERTY_ASSOCIATIONS = INSTANCE_OBJECT__PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSOCIATION_INSTANCE__PROPERTY = INSTANCE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSOCIATION_INSTANCE__VALUE = INSTANCE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property Association Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSOCIATION_INSTANCE__PROPERTY_ASSOCIATION_TYPE = INSTANCE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Property Association Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSOCIATION_INSTANCE_FEATURE_COUNT = INSTANCE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Property Association Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSOCIATION_INSTANCE_OPERATION_COUNT = INSTANCE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.av3instance.av3instance.impl.PathInstanceImpl <em>Path Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.av3instance.av3instance.impl.PathInstanceImpl
	 * @see org.osate.av3instance.av3instance.impl.Av3instancePackageImpl#getPathInstance()
	 * @generated
	 */
	int PATH_INSTANCE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_INSTANCE__NAME = INSTANCE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_INSTANCE__PROPERTY_ASSOCIATIONS = INSTANCE_OBJECT__PROPERTY_ASSOCIATIONS;

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
	 * The number of operations of the '<em>Path Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_INSTANCE_OPERATION_COUNT = INSTANCE_OBJECT_OPERATION_COUNT + 0;

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
	 * Returns the meta object for the attribute '{@link org.osate.av3instance.av3instance.InstanceObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.osate.av3instance.av3instance.InstanceObject#getName()
	 * @see #getInstanceObject()
	 * @generated
	 */
	EAttribute getInstanceObject_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.av3instance.av3instance.InstanceObject#getPropertyAssociations <em>Property Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Associations</em>'.
	 * @see org.osate.av3instance.av3instance.InstanceObject#getPropertyAssociations()
	 * @see #getInstanceObject()
	 * @generated
	 */
	EReference getInstanceObject_PropertyAssociations();

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
	 * Returns the meta object for the reference list '{@link org.osate.av3instance.av3instance.FeatureInstance#getOutgoingAssociations <em>Outgoing Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Associations</em>'.
	 * @see org.osate.av3instance.av3instance.FeatureInstance#getOutgoingAssociations()
	 * @see #getFeatureInstance()
	 * @generated
	 */
	EReference getFeatureInstance_OutgoingAssociations();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.av3instance.av3instance.FeatureInstance#getIncomingAssociations <em>Incoming Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Associations</em>'.
	 * @see org.osate.av3instance.av3instance.FeatureInstance#getIncomingAssociations()
	 * @see #getFeatureInstance()
	 * @generated
	 */
	EReference getFeatureInstance_IncomingAssociations();

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
	 * Returns the meta object for the reference list '{@link org.osate.av3instance.av3instance.AssociationInstance#getSourceMappings <em>Source Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Mappings</em>'.
	 * @see org.osate.av3instance.av3instance.AssociationInstance#getSourceMappings()
	 * @see #getAssociationInstance()
	 * @generated
	 */
	EReference getAssociationInstance_SourceMappings();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.av3instance.av3instance.AssociationInstance#getDestinationMappings <em>Destination Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Destination Mappings</em>'.
	 * @see org.osate.av3instance.av3instance.AssociationInstance#getDestinationMappings()
	 * @see #getAssociationInstance()
	 * @generated
	 */
	EReference getAssociationInstance_DestinationMappings();

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
	 * Returns the meta object for class '{@link org.osate.av3instance.av3instance.PropertyAssociationInstance <em>Property Association Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Association Instance</em>'.
	 * @see org.osate.av3instance.av3instance.PropertyAssociationInstance
	 * @generated
	 */
	EClass getPropertyAssociationInstance();

	/**
	 * Returns the meta object for the reference '{@link org.osate.av3instance.av3instance.PropertyAssociationInstance#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see org.osate.av3instance.av3instance.PropertyAssociationInstance#getProperty()
	 * @see #getPropertyAssociationInstance()
	 * @generated
	 */
	EReference getPropertyAssociationInstance_Property();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.av3instance.av3instance.PropertyAssociationInstance#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.osate.av3instance.av3instance.PropertyAssociationInstance#getValue()
	 * @see #getPropertyAssociationInstance()
	 * @generated
	 */
	EReference getPropertyAssociationInstance_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.av3instance.av3instance.PropertyAssociationInstance#getPropertyAssociationType <em>Property Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Association Type</em>'.
	 * @see org.osate.av3instance.av3instance.PropertyAssociationInstance#getPropertyAssociationType()
	 * @see #getPropertyAssociationInstance()
	 * @generated
	 */
	EAttribute getPropertyAssociationInstance_PropertyAssociationType();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_OBJECT__NAME = eINSTANCE.getInstanceObject_Name();

		/**
		 * The meta object literal for the '<em><b>Property Associations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_OBJECT__PROPERTY_ASSOCIATIONS = eINSTANCE.getInstanceObject_PropertyAssociations();

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
		 * The meta object literal for the '<em><b>Outgoing Associations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_INSTANCE__OUTGOING_ASSOCIATIONS = eINSTANCE.getFeatureInstance_OutgoingAssociations();

		/**
		 * The meta object literal for the '<em><b>Incoming Associations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_INSTANCE__INCOMING_ASSOCIATIONS = eINSTANCE.getFeatureInstance_IncomingAssociations();

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
		 * The meta object literal for the '<em><b>Source Mappings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_INSTANCE__SOURCE_MAPPINGS = eINSTANCE.getAssociationInstance_SourceMappings();

		/**
		 * The meta object literal for the '<em><b>Destination Mappings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_INSTANCE__DESTINATION_MAPPINGS = eINSTANCE.getAssociationInstance_DestinationMappings();

		/**
		 * The meta object literal for the '<em><b>External</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_INSTANCE__EXTERNAL = eINSTANCE.getAssociationInstance_External();

		/**
		 * The meta object literal for the '{@link org.osate.av3instance.av3instance.impl.PropertyAssociationInstanceImpl <em>Property Association Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.av3instance.av3instance.impl.PropertyAssociationInstanceImpl
		 * @see org.osate.av3instance.av3instance.impl.Av3instancePackageImpl#getPropertyAssociationInstance()
		 * @generated
		 */
		EClass PROPERTY_ASSOCIATION_INSTANCE = eINSTANCE.getPropertyAssociationInstance();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_ASSOCIATION_INSTANCE__PROPERTY = eINSTANCE.getPropertyAssociationInstance_Property();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_ASSOCIATION_INSTANCE__VALUE = eINSTANCE.getPropertyAssociationInstance_Value();

		/**
		 * The meta object literal for the '<em><b>Property Association Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_ASSOCIATION_INSTANCE__PROPERTY_ASSOCIATION_TYPE = eINSTANCE
				.getPropertyAssociationInstance_PropertyAssociationType();

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

	}

} //Av3instancePackage
