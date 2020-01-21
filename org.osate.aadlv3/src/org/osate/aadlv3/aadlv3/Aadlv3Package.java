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
package org.osate.aadlv3.aadlv3;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.osate.aadlv3.aadlv3.Aadlv3Factory
 * @model kind="package"
 * @generated
 */
public interface Aadlv3Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "aadlv3";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.osate.org/aadlv3/Aadlv3";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "aadlv3";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Aadlv3Package eINSTANCE = org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.NamedElementImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATIONS = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ANNOTATIONS = 2;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.PackageElementImpl <em>Package Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.PackageElementImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getPackageElement()
	 * @generated
	 */
	int PACKAGE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT__OWNED_PROPERTY_ASSOCIATIONS = NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT__ANNOTATIONS = NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT__PRIVATE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Package Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.PackageDeclarationImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getPackageDeclaration()
	 * @generated
	 */
	int PACKAGE_DECLARATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DECLARATION__NAME = PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DECLARATION__OWNED_PROPERTY_ASSOCIATIONS = PACKAGE_ELEMENT__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DECLARATION__ANNOTATIONS = PACKAGE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DECLARATION__PRIVATE = PACKAGE_ELEMENT__PRIVATE;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DECLARATION__IMPORTS = PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DECLARATION__ELEMENTS = PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Package Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DECLARATION_FEATURE_COUNT = PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.PropertyDefinitionImpl <em>Property Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.PropertyDefinitionImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getPropertyDefinition()
	 * @generated
	 */
	int PROPERTY_DEFINITION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DEFINITION__NAME = PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DEFINITION__OWNED_PROPERTY_ASSOCIATIONS = PACKAGE_ELEMENT__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DEFINITION__ANNOTATIONS = PACKAGE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DEFINITION__PRIVATE = PACKAGE_ELEMENT__PRIVATE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DEFINITION__TYPE = PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component Categories</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DEFINITION__COMPONENT_CATEGORIES = PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Feature Categories</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DEFINITION__FEATURE_CATEGORIES = PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Association Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DEFINITION__ASSOCIATION_TYPES = PACKAGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>For All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DEFINITION__FOR_ALL = PACKAGE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Property Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DEFINITION_FEATURE_COUNT = PACKAGE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.PropertySetImpl <em>Property Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.PropertySetImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getPropertySet()
	 * @generated
	 */
	int PROPERTY_SET = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SET__NAME = PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SET__OWNED_PROPERTY_ASSOCIATIONS = PACKAGE_ELEMENT__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SET__ANNOTATIONS = PACKAGE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SET__PRIVATE = PACKAGE_ELEMENT__PRIVATE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SET__PROPERTIES = PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SET_FEATURE_COUNT = PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.ModelElementImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__OWNED_PROPERTY_ASSOCIATIONS = NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__ANNOTATIONS = NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>In States</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__IN_STATES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.NamedTypeImpl <em>Named Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.NamedTypeImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getNamedType()
	 * @generated
	 */
	int NAMED_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__NAME = PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__OWNED_PROPERTY_ASSOCIATIONS = PACKAGE_ELEMENT__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__ANNOTATIONS = PACKAGE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__PRIVATE = PACKAGE_ELEMENT__PRIVATE;

	/**
	 * The number of structural features of the '<em>Named Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_FEATURE_COUNT = PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.ClassifierImpl <em>Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.ClassifierImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getClassifier()
	 * @generated
	 */
	int CLASSIFIER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__NAME = NAMED_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__OWNED_PROPERTY_ASSOCIATIONS = NAMED_TYPE__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__ANNOTATIONS = NAMED_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__PRIVATE = NAMED_TYPE__PRIVATE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__CATEGORY = NAMED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__SUPER_CLASSIFIERS = NAMED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__TRANSITIONS = NAMED_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__BEHAVIORS = NAMED_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>State Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__STATE_VARIABLES = NAMED_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__GENERATORS = NAMED_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Annex Subclause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__ANNEX_SUBCLAUSE = NAMED_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_COUNT = NAMED_TYPE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.ComponentInterfaceImpl <em>Component Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.ComponentInterfaceImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getComponentInterface()
	 * @generated
	 */
	int COMPONENT_INTERFACE = 8;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.ComponentRealizationImpl <em>Component Realization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.ComponentRealizationImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getComponentRealization()
	 * @generated
	 */
	int COMPONENT_REALIZATION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REALIZATION__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REALIZATION__OWNED_PROPERTY_ASSOCIATIONS = CLASSIFIER__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REALIZATION__ANNOTATIONS = CLASSIFIER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REALIZATION__PRIVATE = CLASSIFIER__PRIVATE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REALIZATION__CATEGORY = CLASSIFIER__CATEGORY;

	/**
	 * The feature id for the '<em><b>Super Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REALIZATION__SUPER_CLASSIFIERS = CLASSIFIER__SUPER_CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REALIZATION__TRANSITIONS = CLASSIFIER__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REALIZATION__BEHAVIORS = CLASSIFIER__BEHAVIORS;

	/**
	 * The feature id for the '<em><b>State Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REALIZATION__STATE_VARIABLES = CLASSIFIER__STATE_VARIABLES;

	/**
	 * The feature id for the '<em><b>Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REALIZATION__GENERATORS = CLASSIFIER__GENERATORS;

	/**
	 * The feature id for the '<em><b>Annex Subclause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REALIZATION__ANNEX_SUBCLAUSE = CLASSIFIER__ANNEX_SUBCLAUSE;

	/**
	 * The feature id for the '<em><b>Cached Interface Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REALIZATION__CACHED_INTERFACE_REFERENCE = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classifier Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REALIZATION__CLASSIFIER_ASSIGNMENTS = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REALIZATION_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__OWNED_PROPERTY_ASSOCIATIONS = CLASSIFIER__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__ANNOTATIONS = CLASSIFIER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__PRIVATE = CLASSIFIER__PRIVATE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__CATEGORY = CLASSIFIER__CATEGORY;

	/**
	 * The feature id for the '<em><b>Super Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__SUPER_CLASSIFIERS = CLASSIFIER__SUPER_CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__TRANSITIONS = CLASSIFIER__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__BEHAVIORS = CLASSIFIER__BEHAVIORS;

	/**
	 * The feature id for the '<em><b>State Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__STATE_VARIABLES = CLASSIFIER__STATE_VARIABLES;

	/**
	 * The feature id for the '<em><b>Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__GENERATORS = CLASSIFIER__GENERATORS;

	/**
	 * The feature id for the '<em><b>Annex Subclause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__ANNEX_SUBCLAUSE = CLASSIFIER__ANNEX_SUBCLAUSE;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__FEATURES = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Use Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__USE_PROPERTIES = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.ComponentImplementationImpl <em>Component Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.ComponentImplementationImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getComponentImplementation()
	 * @generated
	 */
	int COMPONENT_IMPLEMENTATION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__NAME = COMPONENT_REALIZATION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__OWNED_PROPERTY_ASSOCIATIONS = COMPONENT_REALIZATION__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__ANNOTATIONS = COMPONENT_REALIZATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__PRIVATE = COMPONENT_REALIZATION__PRIVATE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__CATEGORY = COMPONENT_REALIZATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Super Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__SUPER_CLASSIFIERS = COMPONENT_REALIZATION__SUPER_CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__TRANSITIONS = COMPONENT_REALIZATION__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__BEHAVIORS = COMPONENT_REALIZATION__BEHAVIORS;

	/**
	 * The feature id for the '<em><b>State Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__STATE_VARIABLES = COMPONENT_REALIZATION__STATE_VARIABLES;

	/**
	 * The feature id for the '<em><b>Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__GENERATORS = COMPONENT_REALIZATION__GENERATORS;

	/**
	 * The feature id for the '<em><b>Annex Subclause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__ANNEX_SUBCLAUSE = COMPONENT_REALIZATION__ANNEX_SUBCLAUSE;

	/**
	 * The feature id for the '<em><b>Cached Interface Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__CACHED_INTERFACE_REFERENCE = COMPONENT_REALIZATION__CACHED_INTERFACE_REFERENCE;

	/**
	 * The feature id for the '<em><b>Classifier Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__CLASSIFIER_ASSIGNMENTS = COMPONENT_REALIZATION__CLASSIFIER_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__COMPONENTS = COMPONENT_REALIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__CONNECTIONS = COMPONENT_REALIZATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Flow Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__FLOW_ASSIGNMENTS = COMPONENT_REALIZATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__PATHS = COMPONENT_REALIZATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__BINDINGS = COMPONENT_REALIZATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Component Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION_FEATURE_COUNT = COMPONENT_REALIZATION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.ComponentConfigurationImpl <em>Component Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.ComponentConfigurationImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getComponentConfiguration()
	 * @generated
	 */
	int COMPONENT_CONFIGURATION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__NAME = COMPONENT_REALIZATION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__OWNED_PROPERTY_ASSOCIATIONS = COMPONENT_REALIZATION__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__ANNOTATIONS = COMPONENT_REALIZATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__PRIVATE = COMPONENT_REALIZATION__PRIVATE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__CATEGORY = COMPONENT_REALIZATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Super Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__SUPER_CLASSIFIERS = COMPONENT_REALIZATION__SUPER_CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__TRANSITIONS = COMPONENT_REALIZATION__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__BEHAVIORS = COMPONENT_REALIZATION__BEHAVIORS;

	/**
	 * The feature id for the '<em><b>State Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__STATE_VARIABLES = COMPONENT_REALIZATION__STATE_VARIABLES;

	/**
	 * The feature id for the '<em><b>Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__GENERATORS = COMPONENT_REALIZATION__GENERATORS;

	/**
	 * The feature id for the '<em><b>Annex Subclause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__ANNEX_SUBCLAUSE = COMPONENT_REALIZATION__ANNEX_SUBCLAUSE;

	/**
	 * The feature id for the '<em><b>Cached Interface Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__CACHED_INTERFACE_REFERENCE = COMPONENT_REALIZATION__CACHED_INTERFACE_REFERENCE;

	/**
	 * The feature id for the '<em><b>Classifier Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__CLASSIFIER_ASSIGNMENTS = COMPONENT_REALIZATION__CLASSIFIER_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__PARAMETERS = COMPONENT_REALIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameterized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__PARAMETERIZED = COMPONENT_REALIZATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__BINDINGS = COMPONENT_REALIZATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Component Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION_FEATURE_COUNT = COMPONENT_REALIZATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.FeatureImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNED_PROPERTY_ASSOCIATIONS = MODEL_ELEMENT__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ANNOTATIONS = MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>In States</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__IN_STATES = MODEL_ELEMENT__IN_STATES;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DIRECTION = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CATEGORY = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__TYPE_REFERENCE = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Propagation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__PROPAGATION = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.SubcomponentImpl <em>Subcomponent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.SubcomponentImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getSubcomponent()
	 * @generated
	 */
	int SUBCOMPONENT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT__OWNED_PROPERTY_ASSOCIATIONS = MODEL_ELEMENT__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT__ANNOTATIONS = MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>In States</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT__IN_STATES = MODEL_ELEMENT__IN_STATES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT__CATEGORY = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT__TYPE_REFERENCES = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT__COMPONENTS = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT__BINDINGS = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT__CONNECTIONS = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT__FEATURES = MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Subcomponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.ImportImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 13;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORTED_NAMESPACE = 0;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__ALIAS = 1;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.AssociationImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNED_PROPERTY_ASSOCIATIONS = MODEL_ELEMENT__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ANNOTATIONS = MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>In States</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__IN_STATES = MODEL_ELEMENT__IN_STATES;

	/**
	 * The feature id for the '<em><b>Association Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ASSOCIATION_TYPE = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__BINDING_TYPE = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__DESTINATION = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__BIDIRECTIONAL = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.ConfigurationParameterImpl <em>Configuration Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.ConfigurationParameterImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getConfigurationParameter()
	 * @generated
	 */
	int CONFIGURATION_PARAMETER = 20;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.TypeReferenceImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getTypeReference()
	 * @generated
	 */
	int TYPE_REFERENCE = 30;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.ConfigurationActualImpl <em>Configuration Actual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.ConfigurationActualImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getConfigurationActual()
	 * @generated
	 */
	int CONFIGURATION_ACTUAL = 21;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.WorkingsetImpl <em>Workingset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.WorkingsetImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getWorkingset()
	 * @generated
	 */
	int WORKINGSET = 22;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.PropertyAssociationImpl <em>Property Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.PropertyAssociationImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getPropertyAssociation()
	 * @generated
	 */
	int PROPERTY_ASSOCIATION = 46;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.PathElementImpl <em>Path Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.PathElementImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getPathElement()
	 * @generated
	 */
	int PATH_ELEMENT = 16;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.PathSequenceImpl <em>Path Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.PathSequenceImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getPathSequence()
	 * @generated
	 */
	int PATH_SEQUENCE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_SEQUENCE__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_SEQUENCE__OWNED_PROPERTY_ASSOCIATIONS = MODEL_ELEMENT__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_SEQUENCE__ANNOTATIONS = MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>In States</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_SEQUENCE__IN_STATES = MODEL_ELEMENT__IN_STATES;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_SEQUENCE__TARGET = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_SEQUENCE__ELEMENTS = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Path Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_SEQUENCE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.ClassifierAssignmentImpl <em>Classifier Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.ClassifierAssignmentImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getClassifierAssignment()
	 * @generated
	 */
	int CLASSIFIER_ASSIGNMENT = 17;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.ClassifierAssignmentPatternImpl <em>Classifier Assignment Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.ClassifierAssignmentPatternImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getClassifierAssignmentPattern()
	 * @generated
	 */
	int CLASSIFIER_ASSIGNMENT_PATTERN = 18;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.TypeImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getType()
	 * @generated
	 */
	int TYPE = 24;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.LiteralImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 31;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.InstanceConfigurationImpl <em>Instance Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.InstanceConfigurationImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getInstanceConfiguration()
	 * @generated
	 */
	int INSTANCE_CONFIGURATION = 23;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.TypeDefImpl <em>Type Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.TypeDefImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getTypeDef()
	 * @generated
	 */
	int TYPE_DEF = 26;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.NumberLiteralImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getNumberLiteral()
	 * @generated
	 */
	int NUMBER_LITERAL = 32;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.IntegerLiteralImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getIntegerLiteral()
	 * @generated
	 */
	int INTEGER_LITERAL = 33;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.ListLiteralImpl <em>List Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.ListLiteralImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getListLiteral()
	 * @generated
	 */
	int LIST_LITERAL = 40;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.SetLiteralImpl <em>Set Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.SetLiteralImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getSetLiteral()
	 * @generated
	 */
	int SET_LITERAL = 41;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.DirectionalLiteralImpl <em>Directional Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.DirectionalLiteralImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getDirectionalLiteral()
	 * @generated
	 */
	int DIRECTIONAL_LITERAL = 38;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.AnnexSubclauseImpl <em>Annex Subclause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.AnnexSubclauseImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getAnnexSubclause()
	 * @generated
	 */
	int ANNEX_SUBCLAUSE = 47;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.AnnexLibraryImpl <em>Annex Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.AnnexLibraryImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getAnnexLibrary()
	 * @generated
	 */
	int ANNEX_LIBRARY = 49;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.PrimitiveTypeImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 28;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.CompositeTypeImpl <em>Composite Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.CompositeTypeImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getCompositeType()
	 * @generated
	 */
	int COMPOSITE_TYPE = 29;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.ExpressionImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 42;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.EnumerationTypeImpl <em>Enumeration Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.EnumerationTypeImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getEnumerationType()
	 * @generated
	 */
	int ENUMERATION_TYPE = 27;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.NamedElementReferenceImpl <em>Named Element Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.NamedElementReferenceImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getNamedElementReference()
	 * @generated
	 */
	int NAMED_ELEMENT_REFERENCE = 19;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_REFERENCE__ELEMENT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_REFERENCE__CONTEXT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Named Element Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_REFERENCE_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ELEMENT__ELEMENT = NAMED_ELEMENT_REFERENCE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ELEMENT__CONTEXT = NAMED_ELEMENT_REFERENCE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ELEMENT__PREVIOUS = NAMED_ELEMENT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ELEMENT__NEXT = NAMED_ELEMENT_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Path Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_ASSIGNMENT__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Classifier Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_ASSIGNMENT__CLASSIFIER_ASSIGNMENTS = 1;

	/**
	 * The feature id for the '<em><b>Assigned Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_ASSIGNMENT__ASSIGNED_CLASSIFIERS = 2;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_ASSIGNMENT__OWNED_PROPERTY_ASSOCIATIONS = 3;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_ASSIGNMENT__BINDINGS = 4;

	/**
	 * The feature id for the '<em><b>Annex Subclause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_ASSIGNMENT__ANNEX_SUBCLAUSE = 5;

	/**
	 * The number of structural features of the '<em>Classifier Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_ASSIGNMENT_FEATURE_COUNT = 6;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_ASSIGNMENT_PATTERN__TARGET = CLASSIFIER_ASSIGNMENT__TARGET;

	/**
	 * The feature id for the '<em><b>Classifier Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_ASSIGNMENT_PATTERN__CLASSIFIER_ASSIGNMENTS = CLASSIFIER_ASSIGNMENT__CLASSIFIER_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_ASSIGNMENT_PATTERN__ASSIGNED_CLASSIFIERS = CLASSIFIER_ASSIGNMENT__ASSIGNED_CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_ASSIGNMENT_PATTERN__OWNED_PROPERTY_ASSOCIATIONS = CLASSIFIER_ASSIGNMENT__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_ASSIGNMENT_PATTERN__BINDINGS = CLASSIFIER_ASSIGNMENT__BINDINGS;

	/**
	 * The feature id for the '<em><b>Annex Subclause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_ASSIGNMENT_PATTERN__ANNEX_SUBCLAUSE = CLASSIFIER_ASSIGNMENT__ANNEX_SUBCLAUSE;

	/**
	 * The feature id for the '<em><b>Target Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_ASSIGNMENT_PATTERN__TARGET_PATTERN = CLASSIFIER_ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Classifier Assignment Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_ASSIGNMENT_PATTERN_FEATURE_COUNT = CLASSIFIER_ASSIGNMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PARAMETER__NAME = NAMED_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PARAMETER__OWNED_PROPERTY_ASSOCIATIONS = NAMED_TYPE__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PARAMETER__ANNOTATIONS = NAMED_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PARAMETER__PRIVATE = NAMED_TYPE__PRIVATE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PARAMETER__TYPE = NAMED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Configuration Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PARAMETER_FEATURE_COUNT = NAMED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ACTUAL__PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Assigned Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ACTUAL__ASSIGNED_CLASSIFIERS = 1;

	/**
	 * The number of structural features of the '<em>Configuration Actual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ACTUAL_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKINGSET__NAME = PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKINGSET__OWNED_PROPERTY_ASSOCIATIONS = PACKAGE_ELEMENT__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKINGSET__ANNOTATIONS = PACKAGE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKINGSET__PRIVATE = PACKAGE_ELEMENT__PRIVATE;

	/**
	 * The feature id for the '<em><b>Instance Roots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKINGSET__INSTANCE_ROOTS = PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Use Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKINGSET__USE_PROPERTIES = PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Workingset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKINGSET_FEATURE_COUNT = PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CONFIGURATION__NAME = SUBCOMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CONFIGURATION__OWNED_PROPERTY_ASSOCIATIONS = SUBCOMPONENT__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CONFIGURATION__ANNOTATIONS = SUBCOMPONENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>In States</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CONFIGURATION__IN_STATES = SUBCOMPONENT__IN_STATES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CONFIGURATION__CATEGORY = SUBCOMPONENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Type References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CONFIGURATION__TYPE_REFERENCES = SUBCOMPONENT__TYPE_REFERENCES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CONFIGURATION__COMPONENTS = SUBCOMPONENT__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CONFIGURATION__BINDINGS = SUBCOMPONENT__BINDINGS;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CONFIGURATION__CONNECTIONS = SUBCOMPONENT__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CONFIGURATION__FEATURES = SUBCOMPONENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Productline Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CONFIGURATION__PRODUCTLINE_CONSTRAINT = SUBCOMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CONFIGURATION__ACTIONS = SUBCOMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instance Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CONFIGURATION_FEATURE_COUNT = SUBCOMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__NAME = NAMED_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__OWNED_PROPERTY_ASSOCIATIONS = NAMED_TYPE__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__ANNOTATIONS = NAMED_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__PRIVATE = NAMED_TYPE__PRIVATE;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__SUPER_TYPE = NAMED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__BASE_TYPE = NAMED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF_FEATURE_COUNT = NAMED_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__LITERALS = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Primitive Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__PRIMITIVE_TYPE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Composite Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__COMPOSITE_TYPE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__TYPE = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__REVERSE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__TYPE = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__ACTUALS = LITERAL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL__UNIT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__UNIT = NUMBER_LITERAL__UNIT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__VALUE = NUMBER_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_FEATURE_COUNT = NUMBER_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.RealLiteralImpl <em>Real Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.RealLiteralImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getRealLiteral()
	 * @generated
	 */
	int REAL_LITERAL = 34;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL__UNIT = NUMBER_LITERAL__UNIT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL__VALUE = NUMBER_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Real Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL_FEATURE_COUNT = NUMBER_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.StringLiteralImpl <em>String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.StringLiteralImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getStringLiteral()
	 * @generated
	 */
	int STRING_LITERAL = 35;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.BooleanLiteralImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getBooleanLiteral()
	 * @generated
	 */
	int BOOLEAN_LITERAL = 36;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.EnumerationLiteralImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getEnumerationLiteral()
	 * @generated
	 */
	int ENUMERATION_LITERAL = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__OWNED_PROPERTY_ASSOCIATIONS = NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__ANNOTATIONS = NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIONAL_LITERAL__DIRECTION = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIONAL_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Directional Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIONAL_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.ECollectionImpl <em>ECollection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.ECollectionImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getECollection()
	 * @generated
	 */
	int ECOLLECTION = 39;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOLLECTION__ELEMENTS = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ECollection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOLLECTION_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_LITERAL__ELEMENTS = ECOLLECTION__ELEMENTS;

	/**
	 * The number of structural features of the '<em>List Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_LITERAL_FEATURE_COUNT = ECOLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LITERAL__ELEMENTS = ECOLLECTION__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Set Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LITERAL_FEATURE_COUNT = ECOLLECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.MultiOperandExpressionImpl <em>Multi Operand Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.MultiOperandExpressionImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getMultiOperandExpression()
	 * @generated
	 */
	int MULTI_OPERAND_EXPRESSION = 44;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_OPERAND_EXPRESSION__ELEMENTS = ECOLLECTION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_OPERAND_EXPRESSION__OPERATOR = ECOLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>K</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_OPERAND_EXPRESSION__K = ECOLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Multi Operand Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_OPERAND_EXPRESSION_FEATURE_COUNT = ECOLLECTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.MultiLiteralConstraintImpl <em>Multi Literal Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.MultiLiteralConstraintImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getMultiLiteralConstraint()
	 * @generated
	 */
	int MULTI_LITERAL_CONSTRAINT = 43;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LITERAL_CONSTRAINT__ELEMENTS = MULTI_OPERAND_EXPRESSION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LITERAL_CONSTRAINT__OPERATOR = MULTI_OPERAND_EXPRESSION__OPERATOR;

	/**
	 * The feature id for the '<em><b>K</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LITERAL_CONSTRAINT__K = MULTI_OPERAND_EXPRESSION__K;

	/**
	 * The number of structural features of the '<em>Multi Literal Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LITERAL_CONSTRAINT_FEATURE_COUNT = MULTI_OPERAND_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.BinaryOperationImpl <em>Binary Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.BinaryOperationImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getBinaryOperation()
	 * @generated
	 */
	int BINARY_OPERATION = 45;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__LEFT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__OPERATOR = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__RIGHT = LITERAL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 3;

	int MULTI_LITERAL_CONSTRAINT_OPERATION_COUNT = 0;
	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSOCIATION__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSOCIATION__PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSOCIATION__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Property Association Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSOCIATION__PROPERTY_ASSOCIATION_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Property Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSOCIATION__PROPERTY_ASSOCIATION = 4;

	/**
	 * The number of structural features of the '<em>Property Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSOCIATION_FEATURE_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_SUBCLAUSE__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_SUBCLAUSE__OWNED_PROPERTY_ASSOCIATIONS = MODEL_ELEMENT__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_SUBCLAUSE__ANNOTATIONS = MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>In States</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_SUBCLAUSE__IN_STATES = MODEL_ELEMENT__IN_STATES;

	/**
	 * The number of structural features of the '<em>Annex Subclause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_SUBCLAUSE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.DefaultAnnexSubclauseImpl <em>Default Annex Subclause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.DefaultAnnexSubclauseImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getDefaultAnnexSubclause()
	 * @generated
	 */
	int DEFAULT_ANNEX_SUBCLAUSE = 48;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_ANNEX_SUBCLAUSE__NAME = ANNEX_SUBCLAUSE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_ANNEX_SUBCLAUSE__OWNED_PROPERTY_ASSOCIATIONS = ANNEX_SUBCLAUSE__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_ANNEX_SUBCLAUSE__ANNOTATIONS = ANNEX_SUBCLAUSE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>In States</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_ANNEX_SUBCLAUSE__IN_STATES = ANNEX_SUBCLAUSE__IN_STATES;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_ANNEX_SUBCLAUSE__BODY = ANNEX_SUBCLAUSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Default Annex Subclause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_ANNEX_SUBCLAUSE_FEATURE_COUNT = ANNEX_SUBCLAUSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_LIBRARY__NAME = PACKAGE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_LIBRARY__OWNED_PROPERTY_ASSOCIATIONS = PACKAGE_DECLARATION__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_LIBRARY__ANNOTATIONS = PACKAGE_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_LIBRARY__PRIVATE = PACKAGE_DECLARATION__PRIVATE;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_LIBRARY__IMPORTS = PACKAGE_DECLARATION__IMPORTS;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_LIBRARY__ELEMENTS = PACKAGE_DECLARATION__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Annex Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_LIBRARY_FEATURE_COUNT = PACKAGE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.BehaviorSpecificationImpl <em>Behavior Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.BehaviorSpecificationImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getBehaviorSpecification()
	 * @generated
	 */
	int BEHAVIOR_SPECIFICATION = 50;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_SPECIFICATION__NAME = ANNEX_SUBCLAUSE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_SPECIFICATION__OWNED_PROPERTY_ASSOCIATIONS = ANNEX_SUBCLAUSE__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_SPECIFICATION__ANNOTATIONS = ANNEX_SUBCLAUSE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>In States</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_SPECIFICATION__IN_STATES = ANNEX_SUBCLAUSE__IN_STATES;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_SPECIFICATION__TRANSITIONS = ANNEX_SUBCLAUSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_SPECIFICATION__BEHAVIORS = ANNEX_SUBCLAUSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>State Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_SPECIFICATION__STATE_VARIABLES = ANNEX_SUBCLAUSE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_SPECIFICATION__GENERATORS = ANNEX_SUBCLAUSE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Behavior Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_SPECIFICATION_FEATURE_COUNT = ANNEX_SUBCLAUSE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.StateTransitionImpl <em>State Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.StateTransitionImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getStateTransition()
	 * @generated
	 */
	int STATE_TRANSITION = 51;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TRANSITION__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TRANSITION__OWNED_PROPERTY_ASSOCIATIONS = MODEL_ELEMENT__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TRANSITION__ANNOTATIONS = MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>In States</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TRANSITION__IN_STATES = MODEL_ELEMENT__IN_STATES;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TRANSITION__CONDITION = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TRANSITION__TARGET_STATE = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>State Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TRANSITION_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.BehaviorImpl <em>Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.BehaviorImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 52;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_PROPERTY_ASSOCIATIONS = MODEL_ELEMENT__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__ANNOTATIONS = MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>In States</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__IN_STATES = MODEL_ELEMENT__IN_STATES;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__CONDITION = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__ACTIONS = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__SOURCE = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sink</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__SINK = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__CATEGORY = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.StateVariableImpl <em>State Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.StateVariableImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getStateVariable()
	 * @generated
	 */
	int STATE_VARIABLE = 53;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE__OWNED_PROPERTY_ASSOCIATIONS = MODEL_ELEMENT__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE__ANNOTATIONS = MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>In States</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE__IN_STATES = MODEL_ELEMENT__IN_STATES;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE__INITIAL_STATE = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE__STATE_TYPE = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>State Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.GeneratorImpl <em>Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.GeneratorImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getGenerator()
	 * @generated
	 */
	int GENERATOR = 54;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__OWNED_PROPERTY_ASSOCIATIONS = MODEL_ELEMENT__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__ANNOTATIONS = MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>In States</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__IN_STATES = MODEL_ELEMENT__IN_STATES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__TYPE = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__VALUE = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.ConstantImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 55;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__NAME = PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__OWNED_PROPERTY_ASSOCIATIONS = PACKAGE_ELEMENT__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__ANNOTATIONS = PACKAGE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__PRIVATE = PACKAGE_ELEMENT__PRIVATE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__VALUE = PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__TYPE = PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.PackageElementReferenceImpl <em>Package Element Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.PackageElementReferenceImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getPackageElementReference()
	 * @generated
	 */
	int PACKAGE_ELEMENT_REFERENCE = 56;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT_REFERENCE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT_REFERENCE__OWNED_PROPERTY_ASSOCIATIONS = NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT_REFERENCE__ANNOTATIONS = NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT_REFERENCE__ELEMENT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Package Element Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT_REFERENCE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.ComponentCategory <em>Component Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.ComponentCategory
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getComponentCategory()
	 * @generated
	 */
	int COMPONENT_CATEGORY = 57;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.FeatureCategory <em>Feature Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.FeatureCategory
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getFeatureCategory()
	 * @generated
	 */
	int FEATURE_CATEGORY = 58;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.FeatureDirection <em>Feature Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.FeatureDirection
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getFeatureDirection()
	 * @generated
	 */
	int FEATURE_DIRECTION = 59;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.AssociationType <em>Association Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.AssociationType
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getAssociationType()
	 * @generated
	 */
	int ASSOCIATION_TYPE = 60;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.Primitive <em>Primitive</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.Primitive
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getPrimitive()
	 * @generated
	 */
	int PRIMITIVE = 61;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.Composite <em>Composite</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.Composite
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getComposite()
	 * @generated
	 */
	int COMPOSITE = 62;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.EOperator <em>EOperator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.EOperator
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getEOperator()
	 * @generated
	 */
	int EOPERATOR = 63;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.BinaryOperator <em>Binary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.BinaryOperator
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getBinaryOperator()
	 * @generated
	 */
	int BINARY_OPERATOR = 64;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.PropertyAssociationType <em>Property Association Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.PropertyAssociationType
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getPropertyAssociationType()
	 * @generated
	 */
	int PROPERTY_ASSOCIATION_TYPE = 65;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.BehaviorCategory <em>Behavior Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.BehaviorCategory
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getBehaviorCategory()
	 * @generated
	 */
	int BEHAVIOR_CATEGORY = 66;

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.PackageDeclaration <em>Package Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Declaration</em>'.
	 * @see org.osate.aadlv3.aadlv3.PackageDeclaration
	 * @generated
	 */
	EClass getPackageDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.PackageDeclaration#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.osate.aadlv3.aadlv3.PackageDeclaration#getImports()
	 * @see #getPackageDeclaration()
	 * @generated
	 */
	EReference getPackageDeclaration_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.PackageDeclaration#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.osate.aadlv3.aadlv3.PackageDeclaration#getElements()
	 * @see #getPackageDeclaration()
	 * @generated
	 */
	EReference getPackageDeclaration_Elements();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.osate.aadlv3.aadlv3.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.aadlv3.aadlv3.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.osate.aadlv3.aadlv3.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.NamedElement#getOwnedPropertyAssociations <em>Owned Property Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Property Associations</em>'.
	 * @see org.osate.aadlv3.aadlv3.NamedElement#getOwnedPropertyAssociations()
	 * @see #getNamedElement()
	 * @generated
	 */
	EReference getNamedElement_OwnedPropertyAssociations();

	/**
	 * Returns the meta object for the attribute list '{@link org.osate.aadlv3.aadlv3.NamedElement#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Annotations</em>'.
	 * @see org.osate.aadlv3.aadlv3.NamedElement#getAnnotations()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Annotations();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.PackageElement <em>Package Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Element</em>'.
	 * @see org.osate.aadlv3.aadlv3.PackageElement
	 * @generated
	 */
	EClass getPackageElement();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.aadlv3.aadlv3.PackageElement#isPrivate <em>Private</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private</em>'.
	 * @see org.osate.aadlv3.aadlv3.PackageElement#isPrivate()
	 * @see #getPackageElement()
	 * @generated
	 */
	EAttribute getPackageElement_Private();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.PropertyDefinition <em>Property Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Definition</em>'.
	 * @see org.osate.aadlv3.aadlv3.PropertyDefinition
	 * @generated
	 */
	EClass getPropertyDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.aadlv3.aadlv3.PropertyDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.osate.aadlv3.aadlv3.PropertyDefinition#getType()
	 * @see #getPropertyDefinition()
	 * @generated
	 */
	EReference getPropertyDefinition_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.osate.aadlv3.aadlv3.PropertyDefinition#getComponentCategories <em>Component Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Component Categories</em>'.
	 * @see org.osate.aadlv3.aadlv3.PropertyDefinition#getComponentCategories()
	 * @see #getPropertyDefinition()
	 * @generated
	 */
	EAttribute getPropertyDefinition_ComponentCategories();

	/**
	 * Returns the meta object for the attribute list '{@link org.osate.aadlv3.aadlv3.PropertyDefinition#getFeatureCategories <em>Feature Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Feature Categories</em>'.
	 * @see org.osate.aadlv3.aadlv3.PropertyDefinition#getFeatureCategories()
	 * @see #getPropertyDefinition()
	 * @generated
	 */
	EAttribute getPropertyDefinition_FeatureCategories();

	/**
	 * Returns the meta object for the attribute list '{@link org.osate.aadlv3.aadlv3.PropertyDefinition#getAssociationTypes <em>Association Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Association Types</em>'.
	 * @see org.osate.aadlv3.aadlv3.PropertyDefinition#getAssociationTypes()
	 * @see #getPropertyDefinition()
	 * @generated
	 */
	EAttribute getPropertyDefinition_AssociationTypes();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.aadlv3.aadlv3.PropertyDefinition#isForAll <em>For All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For All</em>'.
	 * @see org.osate.aadlv3.aadlv3.PropertyDefinition#isForAll()
	 * @see #getPropertyDefinition()
	 * @generated
	 */
	EAttribute getPropertyDefinition_ForAll();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.PropertySet <em>Property Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Set</em>'.
	 * @see org.osate.aadlv3.aadlv3.PropertySet
	 * @generated
	 */
	EClass getPropertySet();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.aadlv3.aadlv3.PropertySet#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Properties</em>'.
	 * @see org.osate.aadlv3.aadlv3.PropertySet#getProperties()
	 * @see #getPropertySet()
	 * @generated
	 */
	EReference getPropertySet_Properties();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see org.osate.aadlv3.aadlv3.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.aadlv3.aadlv3.ModelElement#getInStates <em>In States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In States</em>'.
	 * @see org.osate.aadlv3.aadlv3.ModelElement#getInStates()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_InStates();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier</em>'.
	 * @see org.osate.aadlv3.aadlv3.Classifier
	 * @generated
	 */
	EClass getClassifier();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.aadlv3.aadlv3.Classifier#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see org.osate.aadlv3.aadlv3.Classifier#getCategory()
	 * @see #getClassifier()
	 * @generated
	 */
	EAttribute getClassifier_Category();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.Classifier#getSuperClassifiers <em>Super Classifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Super Classifiers</em>'.
	 * @see org.osate.aadlv3.aadlv3.Classifier#getSuperClassifiers()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_SuperClassifiers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.Classifier#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see org.osate.aadlv3.aadlv3.Classifier#getTransitions()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.Classifier#getBehaviors <em>Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviors</em>'.
	 * @see org.osate.aadlv3.aadlv3.Classifier#getBehaviors()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_Behaviors();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.Classifier#getStateVariables <em>State Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State Variables</em>'.
	 * @see org.osate.aadlv3.aadlv3.Classifier#getStateVariables()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_StateVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.Classifier#getGenerators <em>Generators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generators</em>'.
	 * @see org.osate.aadlv3.aadlv3.Classifier#getGenerators()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_Generators();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.Classifier#getAnnexSubclause <em>Annex Subclause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annex Subclause</em>'.
	 * @see org.osate.aadlv3.aadlv3.Classifier#getAnnexSubclause()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_AnnexSubclause();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.ComponentInterface <em>Component Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Interface</em>'.
	 * @see org.osate.aadlv3.aadlv3.ComponentInterface
	 * @generated
	 */
	EClass getComponentInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.ComponentInterface#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see org.osate.aadlv3.aadlv3.ComponentInterface#getFeatures()
	 * @see #getComponentInterface()
	 * @generated
	 */
	EReference getComponentInterface_Features();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.aadlv3.aadlv3.ComponentInterface#getUseProperties <em>Use Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Use Properties</em>'.
	 * @see org.osate.aadlv3.aadlv3.ComponentInterface#getUseProperties()
	 * @see #getComponentInterface()
	 * @generated
	 */
	EReference getComponentInterface_UseProperties();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.ComponentImplementation <em>Component Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Implementation</em>'.
	 * @see org.osate.aadlv3.aadlv3.ComponentImplementation
	 * @generated
	 */
	EClass getComponentImplementation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.ComponentImplementation#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.osate.aadlv3.aadlv3.ComponentImplementation#getComponents()
	 * @see #getComponentImplementation()
	 * @generated
	 */
	EReference getComponentImplementation_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.ComponentImplementation#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see org.osate.aadlv3.aadlv3.ComponentImplementation#getConnections()
	 * @see #getComponentImplementation()
	 * @generated
	 */
	EReference getComponentImplementation_Connections();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.ComponentImplementation#getFlowAssignments <em>Flow Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flow Assignments</em>'.
	 * @see org.osate.aadlv3.aadlv3.ComponentImplementation#getFlowAssignments()
	 * @see #getComponentImplementation()
	 * @generated
	 */
	EReference getComponentImplementation_FlowAssignments();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.ComponentImplementation#getPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paths</em>'.
	 * @see org.osate.aadlv3.aadlv3.ComponentImplementation#getPaths()
	 * @see #getComponentImplementation()
	 * @generated
	 */
	EReference getComponentImplementation_Paths();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.ComponentImplementation#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see org.osate.aadlv3.aadlv3.ComponentImplementation#getBindings()
	 * @see #getComponentImplementation()
	 * @generated
	 */
	EReference getComponentImplementation_Bindings();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.ComponentConfiguration <em>Component Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Configuration</em>'.
	 * @see org.osate.aadlv3.aadlv3.ComponentConfiguration
	 * @generated
	 */
	EClass getComponentConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.ComponentConfiguration#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.osate.aadlv3.aadlv3.ComponentConfiguration#getParameters()
	 * @see #getComponentConfiguration()
	 * @generated
	 */
	EReference getComponentConfiguration_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.aadlv3.aadlv3.ComponentConfiguration#isParameterized <em>Parameterized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameterized</em>'.
	 * @see org.osate.aadlv3.aadlv3.ComponentConfiguration#isParameterized()
	 * @see #getComponentConfiguration()
	 * @generated
	 */
	EAttribute getComponentConfiguration_Parameterized();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.ComponentConfiguration#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see org.osate.aadlv3.aadlv3.ComponentConfiguration#getBindings()
	 * @see #getComponentConfiguration()
	 * @generated
	 */
	EReference getComponentConfiguration_Bindings();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see org.osate.aadlv3.aadlv3.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.aadlv3.aadlv3.Feature#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.osate.aadlv3.aadlv3.Feature#getDirection()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Direction();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.aadlv3.aadlv3.Feature#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see org.osate.aadlv3.aadlv3.Feature#getCategory()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Category();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.aadlv3.aadlv3.Feature#getTypeReference <em>Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Reference</em>'.
	 * @see org.osate.aadlv3.aadlv3.Feature#getTypeReference()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_TypeReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.aadlv3.aadlv3.Feature#getPropagation <em>Propagation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Propagation</em>'.
	 * @see org.osate.aadlv3.aadlv3.Feature#getPropagation()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Propagation();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.Subcomponent <em>Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subcomponent</em>'.
	 * @see org.osate.aadlv3.aadlv3.Subcomponent
	 * @generated
	 */
	EClass getSubcomponent();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.aadlv3.aadlv3.Subcomponent#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see org.osate.aadlv3.aadlv3.Subcomponent#getCategory()
	 * @see #getSubcomponent()
	 * @generated
	 */
	EAttribute getSubcomponent_Category();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.Subcomponent#getTypeReferences <em>Type References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type References</em>'.
	 * @see org.osate.aadlv3.aadlv3.Subcomponent#getTypeReferences()
	 * @see #getSubcomponent()
	 * @generated
	 */
	EReference getSubcomponent_TypeReferences();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.Subcomponent#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.osate.aadlv3.aadlv3.Subcomponent#getComponents()
	 * @see #getSubcomponent()
	 * @generated
	 */
	EReference getSubcomponent_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.Subcomponent#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see org.osate.aadlv3.aadlv3.Subcomponent#getBindings()
	 * @see #getSubcomponent()
	 * @generated
	 */
	EReference getSubcomponent_Bindings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.Subcomponent#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see org.osate.aadlv3.aadlv3.Subcomponent#getConnections()
	 * @see #getSubcomponent()
	 * @generated
	 */
	EReference getSubcomponent_Connections();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.Subcomponent#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see org.osate.aadlv3.aadlv3.Subcomponent#getFeatures()
	 * @see #getSubcomponent()
	 * @generated
	 */
	EReference getSubcomponent_Features();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see org.osate.aadlv3.aadlv3.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.aadlv3.aadlv3.Import#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Namespace</em>'.
	 * @see org.osate.aadlv3.aadlv3.Import#getImportedNamespace()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportedNamespace();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.aadlv3.aadlv3.Import#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.osate.aadlv3.aadlv3.Import#getAlias()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_Alias();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see org.osate.aadlv3.aadlv3.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.aadlv3.aadlv3.Association#getAssociationType <em>Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Association Type</em>'.
	 * @see org.osate.aadlv3.aadlv3.Association#getAssociationType()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_AssociationType();

	/**
	 * Returns the meta object for the reference '{@link org.osate.aadlv3.aadlv3.Association#getBindingType <em>Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Binding Type</em>'.
	 * @see org.osate.aadlv3.aadlv3.Association#getBindingType()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_BindingType();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.aadlv3.aadlv3.Association#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.osate.aadlv3.aadlv3.Association#getSource()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Source();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.aadlv3.aadlv3.Association#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Destination</em>'.
	 * @see org.osate.aadlv3.aadlv3.Association#getDestination()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Destination();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.aadlv3.aadlv3.Association#isBidirectional <em>Bidirectional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bidirectional</em>'.
	 * @see org.osate.aadlv3.aadlv3.Association#isBidirectional()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_Bidirectional();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.ConfigurationParameter <em>Configuration Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Parameter</em>'.
	 * @see org.osate.aadlv3.aadlv3.ConfigurationParameter
	 * @generated
	 */
	EClass getConfigurationParameter();

	/**
	 * Returns the meta object for the reference '{@link org.osate.aadlv3.aadlv3.ConfigurationParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.osate.aadlv3.aadlv3.ConfigurationParameter#getType()
	 * @see #getConfigurationParameter()
	 * @generated
	 */
	EReference getConfigurationParameter_Type();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.TypeReference <em>Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Reference</em>'.
	 * @see org.osate.aadlv3.aadlv3.TypeReference
	 * @generated
	 */
	EClass getTypeReference();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.aadlv3.aadlv3.TypeReference#isReverse <em>Reverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reverse</em>'.
	 * @see org.osate.aadlv3.aadlv3.TypeReference#isReverse()
	 * @see #getTypeReference()
	 * @generated
	 */
	EAttribute getTypeReference_Reverse();

	/**
	 * Returns the meta object for the reference '{@link org.osate.aadlv3.aadlv3.TypeReference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.osate.aadlv3.aadlv3.TypeReference#getType()
	 * @see #getTypeReference()
	 * @generated
	 */
	EReference getTypeReference_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.TypeReference#getActuals <em>Actuals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actuals</em>'.
	 * @see org.osate.aadlv3.aadlv3.TypeReference#getActuals()
	 * @see #getTypeReference()
	 * @generated
	 */
	EReference getTypeReference_Actuals();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.osate.aadlv3.aadlv3.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.NamedType <em>Named Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Type</em>'.
	 * @see org.osate.aadlv3.aadlv3.NamedType
	 * @generated
	 */
	EClass getNamedType();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.TypeDef <em>Type Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Def</em>'.
	 * @see org.osate.aadlv3.aadlv3.TypeDef
	 * @generated
	 */
	EClass getTypeDef();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.aadlv3.aadlv3.TypeDef#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Super Type</em>'.
	 * @see org.osate.aadlv3.aadlv3.TypeDef#getSuperType()
	 * @see #getTypeDef()
	 * @generated
	 */
	EReference getTypeDef_SuperType();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.aadlv3.aadlv3.TypeDef#getBaseType <em>Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base Type</em>'.
	 * @see org.osate.aadlv3.aadlv3.TypeDef#getBaseType()
	 * @see #getTypeDef()
	 * @generated
	 */
	EReference getTypeDef_BaseType();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.EnumerationType <em>Enumeration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Type</em>'.
	 * @see org.osate.aadlv3.aadlv3.EnumerationType
	 * @generated
	 */
	EClass getEnumerationType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.EnumerationType#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see org.osate.aadlv3.aadlv3.EnumerationType#getLiterals()
	 * @see #getEnumerationType()
	 * @generated
	 */
	EReference getEnumerationType_Literals();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.ConfigurationActual <em>Configuration Actual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Actual</em>'.
	 * @see org.osate.aadlv3.aadlv3.ConfigurationActual
	 * @generated
	 */
	EClass getConfigurationActual();

	/**
	 * Returns the meta object for the reference '{@link org.osate.aadlv3.aadlv3.ConfigurationActual#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see org.osate.aadlv3.aadlv3.ConfigurationActual#getParameter()
	 * @see #getConfigurationActual()
	 * @generated
	 */
	EReference getConfigurationActual_Parameter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.ConfigurationActual#getAssignedClassifiers <em>Assigned Classifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assigned Classifiers</em>'.
	 * @see org.osate.aadlv3.aadlv3.ConfigurationActual#getAssignedClassifiers()
	 * @see #getConfigurationActual()
	 * @generated
	 */
	EReference getConfigurationActual_AssignedClassifiers();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.Workingset <em>Workingset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workingset</em>'.
	 * @see org.osate.aadlv3.aadlv3.Workingset
	 * @generated
	 */
	EClass getWorkingset();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.Workingset#getInstanceRoots <em>Instance Roots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instance Roots</em>'.
	 * @see org.osate.aadlv3.aadlv3.Workingset#getInstanceRoots()
	 * @see #getWorkingset()
	 * @generated
	 */
	EReference getWorkingset_InstanceRoots();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.aadlv3.aadlv3.Workingset#getUseProperties <em>Use Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Use Properties</em>'.
	 * @see org.osate.aadlv3.aadlv3.Workingset#getUseProperties()
	 * @see #getWorkingset()
	 * @generated
	 */
	EReference getWorkingset_UseProperties();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.InstanceConfiguration <em>Instance Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Configuration</em>'.
	 * @see org.osate.aadlv3.aadlv3.InstanceConfiguration
	 * @generated
	 */
	EClass getInstanceConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.aadlv3.aadlv3.InstanceConfiguration#getProductlineConstraint <em>Productline Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Productline Constraint</em>'.
	 * @see org.osate.aadlv3.aadlv3.InstanceConfiguration#getProductlineConstraint()
	 * @see #getInstanceConfiguration()
	 * @generated
	 */
	EReference getInstanceConfiguration_ProductlineConstraint();

	/**
	 * Returns the meta object for the attribute list '{@link org.osate.aadlv3.aadlv3.InstanceConfiguration#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Actions</em>'.
	 * @see org.osate.aadlv3.aadlv3.InstanceConfiguration#getActions()
	 * @see #getInstanceConfiguration()
	 * @generated
	 */
	EAttribute getInstanceConfiguration_Actions();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.NumberLiteral <em>Number Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Literal</em>'.
	 * @see org.osate.aadlv3.aadlv3.NumberLiteral
	 * @generated
	 */
	EClass getNumberLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.aadlv3.aadlv3.NumberLiteral#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.osate.aadlv3.aadlv3.NumberLiteral#getUnit()
	 * @see #getNumberLiteral()
	 * @generated
	 */
	EAttribute getNumberLiteral_Unit();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.IntegerLiteral <em>Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Literal</em>'.
	 * @see org.osate.aadlv3.aadlv3.IntegerLiteral
	 * @generated
	 */
	EClass getIntegerLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.aadlv3.aadlv3.IntegerLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.osate.aadlv3.aadlv3.IntegerLiteral#getValue()
	 * @see #getIntegerLiteral()
	 * @generated
	 */
	EAttribute getIntegerLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.RealLiteral <em>Real Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Literal</em>'.
	 * @see org.osate.aadlv3.aadlv3.RealLiteral
	 * @generated
	 */
	EClass getRealLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.aadlv3.aadlv3.RealLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.osate.aadlv3.aadlv3.RealLiteral#getValue()
	 * @see #getRealLiteral()
	 * @generated
	 */
	EAttribute getRealLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal</em>'.
	 * @see org.osate.aadlv3.aadlv3.StringLiteral
	 * @generated
	 */
	EClass getStringLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.aadlv3.aadlv3.StringLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.osate.aadlv3.aadlv3.StringLiteral#getValue()
	 * @see #getStringLiteral()
	 * @generated
	 */
	EAttribute getStringLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal</em>'.
	 * @see org.osate.aadlv3.aadlv3.BooleanLiteral
	 * @generated
	 */
	EClass getBooleanLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.aadlv3.aadlv3.BooleanLiteral#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.osate.aadlv3.aadlv3.BooleanLiteral#isValue()
	 * @see #getBooleanLiteral()
	 * @generated
	 */
	EAttribute getBooleanLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.EnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Literal</em>'.
	 * @see org.osate.aadlv3.aadlv3.EnumerationLiteral
	 * @generated
	 */
	EClass getEnumerationLiteral();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.ListLiteral <em>List Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Literal</em>'.
	 * @see org.osate.aadlv3.aadlv3.ListLiteral
	 * @generated
	 */
	EClass getListLiteral();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.SetLiteral <em>Set Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Literal</em>'.
	 * @see org.osate.aadlv3.aadlv3.SetLiteral
	 * @generated
	 */
	EClass getSetLiteral();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.DirectionalLiteral <em>Directional Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directional Literal</em>'.
	 * @see org.osate.aadlv3.aadlv3.DirectionalLiteral
	 * @generated
	 */
	EClass getDirectionalLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.aadlv3.aadlv3.DirectionalLiteral#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.osate.aadlv3.aadlv3.DirectionalLiteral#getDirection()
	 * @see #getDirectionalLiteral()
	 * @generated
	 */
	EAttribute getDirectionalLiteral_Direction();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.aadlv3.aadlv3.DirectionalLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.osate.aadlv3.aadlv3.DirectionalLiteral#getValue()
	 * @see #getDirectionalLiteral()
	 * @generated
	 */
	EReference getDirectionalLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.ECollection <em>ECollection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECollection</em>'.
	 * @see org.osate.aadlv3.aadlv3.ECollection
	 * @generated
	 */
	EClass getECollection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.ECollection#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.osate.aadlv3.aadlv3.ECollection#getElements()
	 * @see #getECollection()
	 * @generated
	 */
	EReference getECollection_Elements();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see org.osate.aadlv3.aadlv3.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.osate.aadlv3.aadlv3.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.MultiLiteralConstraint <em>Multi Literal Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Literal Constraint</em>'.
	 * @see org.osate.aadlv3.aadlv3.MultiLiteralConstraint
	 * @generated
	 */
	EClass getMultiLiteralConstraint();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.MultiOperandExpression <em>Multi Operand Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Operand Expression</em>'.
	 * @see org.osate.aadlv3.aadlv3.MultiOperandExpression
	 * @generated
	 */
	EClass getMultiOperandExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.aadlv3.aadlv3.MultiOperandExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.osate.aadlv3.aadlv3.MultiOperandExpression#getOperator()
	 * @see #getMultiOperandExpression()
	 * @generated
	 */
	EAttribute getMultiOperandExpression_Operator();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.aadlv3.aadlv3.MultiOperandExpression#getK <em>K</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>K</em>'.
	 * @see org.osate.aadlv3.aadlv3.MultiOperandExpression#getK()
	 * @see #getMultiOperandExpression()
	 * @generated
	 */
	EAttribute getMultiOperandExpression_K();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.BinaryOperation <em>Binary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Operation</em>'.
	 * @see org.osate.aadlv3.aadlv3.BinaryOperation
	 * @generated
	 */
	EClass getBinaryOperation();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.aadlv3.aadlv3.BinaryOperation#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see org.osate.aadlv3.aadlv3.BinaryOperation#getLeft()
	 * @see #getBinaryOperation()
	 * @generated
	 */
	EReference getBinaryOperation_Left();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.aadlv3.aadlv3.BinaryOperation#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.osate.aadlv3.aadlv3.BinaryOperation#getOperator()
	 * @see #getBinaryOperation()
	 * @generated
	 */
	EAttribute getBinaryOperation_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.aadlv3.aadlv3.BinaryOperation#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see org.osate.aadlv3.aadlv3.BinaryOperation#getRight()
	 * @see #getBinaryOperation()
	 * @generated
	 */
	EReference getBinaryOperation_Right();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.PropertyAssociation <em>Property Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Association</em>'.
	 * @see org.osate.aadlv3.aadlv3.PropertyAssociation
	 * @generated
	 */
	EClass getPropertyAssociation();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.aadlv3.aadlv3.PropertyAssociation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.osate.aadlv3.aadlv3.PropertyAssociation#getTarget()
	 * @see #getPropertyAssociation()
	 * @generated
	 */
	EReference getPropertyAssociation_Target();

	/**
	 * Returns the meta object for the reference '{@link org.osate.aadlv3.aadlv3.PropertyAssociation#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see org.osate.aadlv3.aadlv3.PropertyAssociation#getProperty()
	 * @see #getPropertyAssociation()
	 * @generated
	 */
	EReference getPropertyAssociation_Property();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.aadlv3.aadlv3.PropertyAssociation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.osate.aadlv3.aadlv3.PropertyAssociation#getValue()
	 * @see #getPropertyAssociation()
	 * @generated
	 */
	EReference getPropertyAssociation_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.aadlv3.aadlv3.PropertyAssociation#getPropertyAssociationType <em>Property Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Association Type</em>'.
	 * @see org.osate.aadlv3.aadlv3.PropertyAssociation#getPropertyAssociationType()
	 * @see #getPropertyAssociation()
	 * @generated
	 */
	EAttribute getPropertyAssociation_PropertyAssociationType();

	/**
	 * Returns the meta object for the reference '{@link org.osate.aadlv3.aadlv3.PropertyAssociation#getPropertyAssociation <em>Property Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property Association</em>'.
	 * @see org.osate.aadlv3.aadlv3.PropertyAssociation#getPropertyAssociation()
	 * @see #getPropertyAssociation()
	 * @generated
	 */
	EReference getPropertyAssociation_PropertyAssociation();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.AnnexSubclause <em>Annex Subclause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annex Subclause</em>'.
	 * @see org.osate.aadlv3.aadlv3.AnnexSubclause
	 * @generated
	 */
	EClass getAnnexSubclause();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.DefaultAnnexSubclause <em>Default Annex Subclause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Annex Subclause</em>'.
	 * @see org.osate.aadlv3.aadlv3.DefaultAnnexSubclause
	 * @generated
	 */
	EClass getDefaultAnnexSubclause();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.aadlv3.aadlv3.DefaultAnnexSubclause#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see org.osate.aadlv3.aadlv3.DefaultAnnexSubclause#getBody()
	 * @see #getDefaultAnnexSubclause()
	 * @generated
	 */
	EAttribute getDefaultAnnexSubclause_Body();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.AnnexLibrary <em>Annex Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annex Library</em>'.
	 * @see org.osate.aadlv3.aadlv3.AnnexLibrary
	 * @generated
	 */
	EClass getAnnexLibrary();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.BehaviorSpecification <em>Behavior Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Specification</em>'.
	 * @see org.osate.aadlv3.aadlv3.BehaviorSpecification
	 * @generated
	 */
	EClass getBehaviorSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.BehaviorSpecification#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see org.osate.aadlv3.aadlv3.BehaviorSpecification#getTransitions()
	 * @see #getBehaviorSpecification()
	 * @generated
	 */
	EReference getBehaviorSpecification_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.BehaviorSpecification#getBehaviors <em>Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviors</em>'.
	 * @see org.osate.aadlv3.aadlv3.BehaviorSpecification#getBehaviors()
	 * @see #getBehaviorSpecification()
	 * @generated
	 */
	EReference getBehaviorSpecification_Behaviors();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.BehaviorSpecification#getStateVariables <em>State Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State Variables</em>'.
	 * @see org.osate.aadlv3.aadlv3.BehaviorSpecification#getStateVariables()
	 * @see #getBehaviorSpecification()
	 * @generated
	 */
	EReference getBehaviorSpecification_StateVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.BehaviorSpecification#getGenerators <em>Generators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generators</em>'.
	 * @see org.osate.aadlv3.aadlv3.BehaviorSpecification#getGenerators()
	 * @see #getBehaviorSpecification()
	 * @generated
	 */
	EReference getBehaviorSpecification_Generators();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.StateTransition <em>State Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Transition</em>'.
	 * @see org.osate.aadlv3.aadlv3.StateTransition
	 * @generated
	 */
	EClass getStateTransition();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.aadlv3.aadlv3.StateTransition#getTargetState <em>Target State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target State</em>'.
	 * @see org.osate.aadlv3.aadlv3.StateTransition#getTargetState()
	 * @see #getStateTransition()
	 * @generated
	 */
	EReference getStateTransition_TargetState();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.aadlv3.aadlv3.StateTransition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.osate.aadlv3.aadlv3.StateTransition#getCondition()
	 * @see #getStateTransition()
	 * @generated
	 */
	EReference getStateTransition_Condition();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior</em>'.
	 * @see org.osate.aadlv3.aadlv3.Behavior
	 * @generated
	 */
	EClass getBehavior();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.aadlv3.aadlv3.Behavior#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.osate.aadlv3.aadlv3.Behavior#getCondition()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.Behavior#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see org.osate.aadlv3.aadlv3.Behavior#getActions()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_Actions();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.aadlv3.aadlv3.Behavior#isSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.osate.aadlv3.aadlv3.Behavior#isSource()
	 * @see #getBehavior()
	 * @generated
	 */
	EAttribute getBehavior_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.aadlv3.aadlv3.Behavior#isSink <em>Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sink</em>'.
	 * @see org.osate.aadlv3.aadlv3.Behavior#isSink()
	 * @see #getBehavior()
	 * @generated
	 */
	EAttribute getBehavior_Sink();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.aadlv3.aadlv3.Behavior#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see org.osate.aadlv3.aadlv3.Behavior#getCategory()
	 * @see #getBehavior()
	 * @generated
	 */
	EAttribute getBehavior_Category();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.StateVariable <em>State Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Variable</em>'.
	 * @see org.osate.aadlv3.aadlv3.StateVariable
	 * @generated
	 */
	EClass getStateVariable();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.aadlv3.aadlv3.StateVariable#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial State</em>'.
	 * @see org.osate.aadlv3.aadlv3.StateVariable#getInitialState()
	 * @see #getStateVariable()
	 * @generated
	 */
	EReference getStateVariable_InitialState();

	/**
	 * Returns the meta object for the reference '{@link org.osate.aadlv3.aadlv3.StateVariable#getStateType <em>State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State Type</em>'.
	 * @see org.osate.aadlv3.aadlv3.StateVariable#getStateType()
	 * @see #getStateVariable()
	 * @generated
	 */
	EReference getStateVariable_StateType();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.Generator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator</em>'.
	 * @see org.osate.aadlv3.aadlv3.Generator
	 * @generated
	 */
	EClass getGenerator();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.aadlv3.aadlv3.Generator#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.osate.aadlv3.aadlv3.Generator#getType()
	 * @see #getGenerator()
	 * @generated
	 */
	EAttribute getGenerator_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.aadlv3.aadlv3.Generator#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.osate.aadlv3.aadlv3.Generator#getValue()
	 * @see #getGenerator()
	 * @generated
	 */
	EReference getGenerator_Value();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see org.osate.aadlv3.aadlv3.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.aadlv3.aadlv3.Constant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.osate.aadlv3.aadlv3.Constant#getValue()
	 * @see #getConstant()
	 * @generated
	 */
	EReference getConstant_Value();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.aadlv3.aadlv3.Constant#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.osate.aadlv3.aadlv3.Constant#getType()
	 * @see #getConstant()
	 * @generated
	 */
	EReference getConstant_Type();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.PackageElementReference <em>Package Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Element Reference</em>'.
	 * @see org.osate.aadlv3.aadlv3.PackageElementReference
	 * @generated
	 */
	EClass getPackageElementReference();

	/**
	 * Returns the meta object for the reference '{@link org.osate.aadlv3.aadlv3.PackageElementReference#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see org.osate.aadlv3.aadlv3.PackageElementReference#getElement()
	 * @see #getPackageElementReference()
	 * @generated
	 */
	EReference getPackageElementReference_Element();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see org.osate.aadlv3.aadlv3.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.aadlv3.aadlv3.PrimitiveType#getPrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primitive Type</em>'.
	 * @see org.osate.aadlv3.aadlv3.PrimitiveType#getPrimitiveType()
	 * @see #getPrimitiveType()
	 * @generated
	 */
	EAttribute getPrimitiveType_PrimitiveType();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.CompositeType <em>Composite Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Type</em>'.
	 * @see org.osate.aadlv3.aadlv3.CompositeType
	 * @generated
	 */
	EClass getCompositeType();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.aadlv3.aadlv3.CompositeType#getCompositeType <em>Composite Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Composite Type</em>'.
	 * @see org.osate.aadlv3.aadlv3.CompositeType#getCompositeType()
	 * @see #getCompositeType()
	 * @generated
	 */
	EAttribute getCompositeType_CompositeType();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.aadlv3.aadlv3.CompositeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.osate.aadlv3.aadlv3.CompositeType#getType()
	 * @see #getCompositeType()
	 * @generated
	 */
	EReference getCompositeType_Type();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.PathElement <em>Path Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Element</em>'.
	 * @see org.osate.aadlv3.aadlv3.PathElement
	 * @generated
	 */
	EClass getPathElement();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.aadlv3.aadlv3.PathElement#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Previous</em>'.
	 * @see org.osate.aadlv3.aadlv3.PathElement#getPrevious()
	 * @see #getPathElement()
	 * @generated
	 */
	EReference getPathElement_Previous();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.aadlv3.aadlv3.PathElement#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Next</em>'.
	 * @see org.osate.aadlv3.aadlv3.PathElement#getNext()
	 * @see #getPathElement()
	 * @generated
	 */
	EReference getPathElement_Next();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.ClassifierAssignment <em>Classifier Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier Assignment</em>'.
	 * @see org.osate.aadlv3.aadlv3.ClassifierAssignment
	 * @generated
	 */
	EClass getClassifierAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.aadlv3.aadlv3.ClassifierAssignment#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.osate.aadlv3.aadlv3.ClassifierAssignment#getTarget()
	 * @see #getClassifierAssignment()
	 * @generated
	 */
	EReference getClassifierAssignment_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.ClassifierAssignment#getClassifierAssignments <em>Classifier Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classifier Assignments</em>'.
	 * @see org.osate.aadlv3.aadlv3.ClassifierAssignment#getClassifierAssignments()
	 * @see #getClassifierAssignment()
	 * @generated
	 */
	EReference getClassifierAssignment_ClassifierAssignments();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.ClassifierAssignment#getAssignedClassifiers <em>Assigned Classifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assigned Classifiers</em>'.
	 * @see org.osate.aadlv3.aadlv3.ClassifierAssignment#getAssignedClassifiers()
	 * @see #getClassifierAssignment()
	 * @generated
	 */
	EReference getClassifierAssignment_AssignedClassifiers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.ClassifierAssignment#getOwnedPropertyAssociations <em>Owned Property Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Property Associations</em>'.
	 * @see org.osate.aadlv3.aadlv3.ClassifierAssignment#getOwnedPropertyAssociations()
	 * @see #getClassifierAssignment()
	 * @generated
	 */
	EReference getClassifierAssignment_OwnedPropertyAssociations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.ClassifierAssignment#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see org.osate.aadlv3.aadlv3.ClassifierAssignment#getBindings()
	 * @see #getClassifierAssignment()
	 * @generated
	 */
	EReference getClassifierAssignment_Bindings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.ClassifierAssignment#getAnnexSubclause <em>Annex Subclause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annex Subclause</em>'.
	 * @see org.osate.aadlv3.aadlv3.ClassifierAssignment#getAnnexSubclause()
	 * @see #getClassifierAssignment()
	 * @generated
	 */
	EReference getClassifierAssignment_AnnexSubclause();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.ClassifierAssignmentPattern <em>Classifier Assignment Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier Assignment Pattern</em>'.
	 * @see org.osate.aadlv3.aadlv3.ClassifierAssignmentPattern
	 * @generated
	 */
	EClass getClassifierAssignmentPattern();

	/**
	 * Returns the meta object for the reference '{@link org.osate.aadlv3.aadlv3.ClassifierAssignmentPattern#getTargetPattern <em>Target Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Pattern</em>'.
	 * @see org.osate.aadlv3.aadlv3.ClassifierAssignmentPattern#getTargetPattern()
	 * @see #getClassifierAssignmentPattern()
	 * @generated
	 */
	EReference getClassifierAssignmentPattern_TargetPattern();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.NamedElementReference <em>Named Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element Reference</em>'.
	 * @see org.osate.aadlv3.aadlv3.NamedElementReference
	 * @generated
	 */
	EClass getNamedElementReference();

	/**
	 * Returns the meta object for the reference '{@link org.osate.aadlv3.aadlv3.NamedElementReference#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see org.osate.aadlv3.aadlv3.NamedElementReference#getElement()
	 * @see #getNamedElementReference()
	 * @generated
	 */
	EReference getNamedElementReference_Element();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.aadlv3.aadlv3.NamedElementReference#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see org.osate.aadlv3.aadlv3.NamedElementReference#getContext()
	 * @see #getNamedElementReference()
	 * @generated
	 */
	EReference getNamedElementReference_Context();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.PathSequence <em>Path Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Sequence</em>'.
	 * @see org.osate.aadlv3.aadlv3.PathSequence
	 * @generated
	 */
	EClass getPathSequence();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.aadlv3.aadlv3.PathSequence#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.osate.aadlv3.aadlv3.PathSequence#getTarget()
	 * @see #getPathSequence()
	 * @generated
	 */
	EReference getPathSequence_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.PathSequence#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.osate.aadlv3.aadlv3.PathSequence#getElements()
	 * @see #getPathSequence()
	 * @generated
	 */
	EReference getPathSequence_Elements();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.ComponentRealization <em>Component Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Realization</em>'.
	 * @see org.osate.aadlv3.aadlv3.ComponentRealization
	 * @generated
	 */
	EClass getComponentRealization();

	/**
	 * Returns the meta object for the reference '{@link org.osate.aadlv3.aadlv3.ComponentRealization#getCachedInterfaceReference <em>Cached Interface Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cached Interface Reference</em>'.
	 * @see org.osate.aadlv3.aadlv3.ComponentRealization#getCachedInterfaceReference()
	 * @see #getComponentRealization()
	 * @generated
	 */
	EReference getComponentRealization_CachedInterfaceReference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.ComponentRealization#getClassifierAssignments <em>Classifier Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classifier Assignments</em>'.
	 * @see org.osate.aadlv3.aadlv3.ComponentRealization#getClassifierAssignments()
	 * @see #getComponentRealization()
	 * @generated
	 */
	EReference getComponentRealization_ClassifierAssignments();

	/**
	 * Returns the meta object for enum '{@link org.osate.aadlv3.aadlv3.ComponentCategory <em>Component Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Component Category</em>'.
	 * @see org.osate.aadlv3.aadlv3.ComponentCategory
	 * @generated
	 */
	EEnum getComponentCategory();

	/**
	 * Returns the meta object for enum '{@link org.osate.aadlv3.aadlv3.FeatureCategory <em>Feature Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Feature Category</em>'.
	 * @see org.osate.aadlv3.aadlv3.FeatureCategory
	 * @generated
	 */
	EEnum getFeatureCategory();

	/**
	 * Returns the meta object for enum '{@link org.osate.aadlv3.aadlv3.FeatureDirection <em>Feature Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Feature Direction</em>'.
	 * @see org.osate.aadlv3.aadlv3.FeatureDirection
	 * @generated
	 */
	EEnum getFeatureDirection();

	/**
	 * Returns the meta object for enum '{@link org.osate.aadlv3.aadlv3.AssociationType <em>Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Association Type</em>'.
	 * @see org.osate.aadlv3.aadlv3.AssociationType
	 * @generated
	 */
	EEnum getAssociationType();

	/**
	 * Returns the meta object for enum '{@link org.osate.aadlv3.aadlv3.Primitive <em>Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive</em>'.
	 * @see org.osate.aadlv3.aadlv3.Primitive
	 * @generated
	 */
	EEnum getPrimitive();

	/**
	 * Returns the meta object for enum '{@link org.osate.aadlv3.aadlv3.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Composite</em>'.
	 * @see org.osate.aadlv3.aadlv3.Composite
	 * @generated
	 */
	EEnum getComposite();

	/**
	 * Returns the meta object for enum '{@link org.osate.aadlv3.aadlv3.EOperator <em>EOperator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EOperator</em>'.
	 * @see org.osate.aadlv3.aadlv3.EOperator
	 * @generated
	 */
	EEnum getEOperator();

	/**
	 * Returns the meta object for enum '{@link org.osate.aadlv3.aadlv3.BinaryOperator <em>Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Operator</em>'.
	 * @see org.osate.aadlv3.aadlv3.BinaryOperator
	 * @generated
	 */
	EEnum getBinaryOperator();

	/**
	 * Returns the meta object for enum '{@link org.osate.aadlv3.aadlv3.PropertyAssociationType <em>Property Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Association Type</em>'.
	 * @see org.osate.aadlv3.aadlv3.PropertyAssociationType
	 * @generated
	 */
	EEnum getPropertyAssociationType();

	/**
	 * Returns the meta object for enum '{@link org.osate.aadlv3.aadlv3.BehaviorCategory <em>Behavior Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Behavior Category</em>'.
	 * @see org.osate.aadlv3.aadlv3.BehaviorCategory
	 * @generated
	 */
	EEnum getBehaviorCategory();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Aadlv3Factory getAadlv3Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.PackageDeclarationImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getPackageDeclaration()
		 * @generated
		 */
		EClass PACKAGE_DECLARATION = eINSTANCE.getPackageDeclaration();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_DECLARATION__IMPORTS = eINSTANCE.getPackageDeclaration_Imports();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_DECLARATION__ELEMENTS = eINSTANCE.getPackageDeclaration_Elements();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.NamedElementImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Owned Property Associations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATIONS = eINSTANCE.getNamedElement_OwnedPropertyAssociations();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__ANNOTATIONS = eINSTANCE.getNamedElement_Annotations();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.PackageElementImpl <em>Package Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.PackageElementImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getPackageElement()
		 * @generated
		 */
		EClass PACKAGE_ELEMENT = eINSTANCE.getPackageElement();

		/**
		 * The meta object literal for the '<em><b>Private</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_ELEMENT__PRIVATE = eINSTANCE.getPackageElement_Private();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.PropertyDefinitionImpl <em>Property Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.PropertyDefinitionImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getPropertyDefinition()
		 * @generated
		 */
		EClass PROPERTY_DEFINITION = eINSTANCE.getPropertyDefinition();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_DEFINITION__TYPE = eINSTANCE.getPropertyDefinition_Type();

		/**
		 * The meta object literal for the '<em><b>Component Categories</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_DEFINITION__COMPONENT_CATEGORIES = eINSTANCE.getPropertyDefinition_ComponentCategories();

		/**
		 * The meta object literal for the '<em><b>Feature Categories</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_DEFINITION__FEATURE_CATEGORIES = eINSTANCE.getPropertyDefinition_FeatureCategories();

		/**
		 * The meta object literal for the '<em><b>Association Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_DEFINITION__ASSOCIATION_TYPES = eINSTANCE.getPropertyDefinition_AssociationTypes();

		/**
		 * The meta object literal for the '<em><b>For All</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_DEFINITION__FOR_ALL = eINSTANCE.getPropertyDefinition_ForAll();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.PropertySetImpl <em>Property Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.PropertySetImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getPropertySet()
		 * @generated
		 */
		EClass PROPERTY_SET = eINSTANCE.getPropertySet();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_SET__PROPERTIES = eINSTANCE.getPropertySet_Properties();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.ModelElementImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>In States</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__IN_STATES = eINSTANCE.getModelElement_InStates();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.ClassifierImpl <em>Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.ClassifierImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getClassifier()
		 * @generated
		 */
		EClass CLASSIFIER = eINSTANCE.getClassifier();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER__CATEGORY = eINSTANCE.getClassifier_Category();

		/**
		 * The meta object literal for the '<em><b>Super Classifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__SUPER_CLASSIFIERS = eINSTANCE.getClassifier_SuperClassifiers();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__TRANSITIONS = eINSTANCE.getClassifier_Transitions();

		/**
		 * The meta object literal for the '<em><b>Behaviors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__BEHAVIORS = eINSTANCE.getClassifier_Behaviors();

		/**
		 * The meta object literal for the '<em><b>State Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__STATE_VARIABLES = eINSTANCE.getClassifier_StateVariables();

		/**
		 * The meta object literal for the '<em><b>Generators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__GENERATORS = eINSTANCE.getClassifier_Generators();

		/**
		 * The meta object literal for the '<em><b>Annex Subclause</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__ANNEX_SUBCLAUSE = eINSTANCE.getClassifier_AnnexSubclause();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.ComponentInterfaceImpl <em>Component Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.ComponentInterfaceImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getComponentInterface()
		 * @generated
		 */
		EClass COMPONENT_INTERFACE = eINSTANCE.getComponentInterface();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INTERFACE__FEATURES = eINSTANCE.getComponentInterface_Features();

		/**
		 * The meta object literal for the '<em><b>Use Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INTERFACE__USE_PROPERTIES = eINSTANCE.getComponentInterface_UseProperties();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.ComponentImplementationImpl <em>Component Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.ComponentImplementationImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getComponentImplementation()
		 * @generated
		 */
		EClass COMPONENT_IMPLEMENTATION = eINSTANCE.getComponentImplementation();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_IMPLEMENTATION__COMPONENTS = eINSTANCE.getComponentImplementation_Components();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_IMPLEMENTATION__CONNECTIONS = eINSTANCE.getComponentImplementation_Connections();

		/**
		 * The meta object literal for the '<em><b>Flow Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_IMPLEMENTATION__FLOW_ASSIGNMENTS = eINSTANCE.getComponentImplementation_FlowAssignments();

		/**
		 * The meta object literal for the '<em><b>Paths</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_IMPLEMENTATION__PATHS = eINSTANCE.getComponentImplementation_Paths();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_IMPLEMENTATION__BINDINGS = eINSTANCE.getComponentImplementation_Bindings();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.ComponentConfigurationImpl <em>Component Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.ComponentConfigurationImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getComponentConfiguration()
		 * @generated
		 */
		EClass COMPONENT_CONFIGURATION = eINSTANCE.getComponentConfiguration();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_CONFIGURATION__PARAMETERS = eINSTANCE.getComponentConfiguration_Parameters();

		/**
		 * The meta object literal for the '<em><b>Parameterized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_CONFIGURATION__PARAMETERIZED = eINSTANCE.getComponentConfiguration_Parameterized();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_CONFIGURATION__BINDINGS = eINSTANCE.getComponentConfiguration_Bindings();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.FeatureImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__DIRECTION = eINSTANCE.getFeature_Direction();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__CATEGORY = eINSTANCE.getFeature_Category();

		/**
		 * The meta object literal for the '<em><b>Type Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__TYPE_REFERENCE = eINSTANCE.getFeature_TypeReference();

		/**
		 * The meta object literal for the '<em><b>Propagation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__PROPAGATION = eINSTANCE.getFeature_Propagation();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.SubcomponentImpl <em>Subcomponent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.SubcomponentImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getSubcomponent()
		 * @generated
		 */
		EClass SUBCOMPONENT = eINSTANCE.getSubcomponent();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBCOMPONENT__CATEGORY = eINSTANCE.getSubcomponent_Category();

		/**
		 * The meta object literal for the '<em><b>Type References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBCOMPONENT__TYPE_REFERENCES = eINSTANCE.getSubcomponent_TypeReferences();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBCOMPONENT__COMPONENTS = eINSTANCE.getSubcomponent_Components();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBCOMPONENT__BINDINGS = eINSTANCE.getSubcomponent_Bindings();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBCOMPONENT__CONNECTIONS = eINSTANCE.getSubcomponent_Connections();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBCOMPONENT__FEATURES = eINSTANCE.getSubcomponent_Features();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.ImportImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__ALIAS = eINSTANCE.getImport_Alias();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.AssociationImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Association Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__ASSOCIATION_TYPE = eINSTANCE.getAssociation_AssociationType();

		/**
		 * The meta object literal for the '<em><b>Binding Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__BINDING_TYPE = eINSTANCE.getAssociation_BindingType();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__SOURCE = eINSTANCE.getAssociation_Source();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__DESTINATION = eINSTANCE.getAssociation_Destination();

		/**
		 * The meta object literal for the '<em><b>Bidirectional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__BIDIRECTIONAL = eINSTANCE.getAssociation_Bidirectional();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.ConfigurationParameterImpl <em>Configuration Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.ConfigurationParameterImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getConfigurationParameter()
		 * @generated
		 */
		EClass CONFIGURATION_PARAMETER = eINSTANCE.getConfigurationParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_PARAMETER__TYPE = eINSTANCE.getConfigurationParameter_Type();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.TypeReferenceImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getTypeReference()
		 * @generated
		 */
		EClass TYPE_REFERENCE = eINSTANCE.getTypeReference();

		/**
		 * The meta object literal for the '<em><b>Reverse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_REFERENCE__REVERSE = eINSTANCE.getTypeReference_Reverse();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_REFERENCE__TYPE = eINSTANCE.getTypeReference_Type();

		/**
		 * The meta object literal for the '<em><b>Actuals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_REFERENCE__ACTUALS = eINSTANCE.getTypeReference_Actuals();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.TypeImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.NamedTypeImpl <em>Named Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.NamedTypeImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getNamedType()
		 * @generated
		 */
		EClass NAMED_TYPE = eINSTANCE.getNamedType();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.TypeDefImpl <em>Type Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.TypeDefImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getTypeDef()
		 * @generated
		 */
		EClass TYPE_DEF = eINSTANCE.getTypeDef();

		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DEF__SUPER_TYPE = eINSTANCE.getTypeDef_SuperType();

		/**
		 * The meta object literal for the '<em><b>Base Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DEF__BASE_TYPE = eINSTANCE.getTypeDef_BaseType();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.EnumerationTypeImpl <em>Enumeration Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.EnumerationTypeImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getEnumerationType()
		 * @generated
		 */
		EClass ENUMERATION_TYPE = eINSTANCE.getEnumerationType();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_TYPE__LITERALS = eINSTANCE.getEnumerationType_Literals();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.ConfigurationActualImpl <em>Configuration Actual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.ConfigurationActualImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getConfigurationActual()
		 * @generated
		 */
		EClass CONFIGURATION_ACTUAL = eINSTANCE.getConfigurationActual();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_ACTUAL__PARAMETER = eINSTANCE.getConfigurationActual_Parameter();

		/**
		 * The meta object literal for the '<em><b>Assigned Classifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_ACTUAL__ASSIGNED_CLASSIFIERS = eINSTANCE.getConfigurationActual_AssignedClassifiers();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.WorkingsetImpl <em>Workingset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.WorkingsetImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getWorkingset()
		 * @generated
		 */
		EClass WORKINGSET = eINSTANCE.getWorkingset();

		/**
		 * The meta object literal for the '<em><b>Instance Roots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKINGSET__INSTANCE_ROOTS = eINSTANCE.getWorkingset_InstanceRoots();

		/**
		 * The meta object literal for the '<em><b>Use Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKINGSET__USE_PROPERTIES = eINSTANCE.getWorkingset_UseProperties();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.InstanceConfigurationImpl <em>Instance Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.InstanceConfigurationImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getInstanceConfiguration()
		 * @generated
		 */
		EClass INSTANCE_CONFIGURATION = eINSTANCE.getInstanceConfiguration();

		/**
		 * The meta object literal for the '<em><b>Productline Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_CONFIGURATION__PRODUCTLINE_CONSTRAINT = eINSTANCE
				.getInstanceConfiguration_ProductlineConstraint();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_CONFIGURATION__ACTIONS = eINSTANCE.getInstanceConfiguration_Actions();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.NumberLiteralImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getNumberLiteral()
		 * @generated
		 */
		EClass NUMBER_LITERAL = eINSTANCE.getNumberLiteral();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_LITERAL__UNIT = eINSTANCE.getNumberLiteral_Unit();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.IntegerLiteralImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getIntegerLiteral()
		 * @generated
		 */
		EClass INTEGER_LITERAL = eINSTANCE.getIntegerLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_LITERAL__VALUE = eINSTANCE.getIntegerLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.RealLiteralImpl <em>Real Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.RealLiteralImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getRealLiteral()
		 * @generated
		 */
		EClass REAL_LITERAL = eINSTANCE.getRealLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_LITERAL__VALUE = eINSTANCE.getRealLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.StringLiteralImpl <em>String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.StringLiteralImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getStringLiteral()
		 * @generated
		 */
		EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.BooleanLiteralImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getBooleanLiteral()
		 * @generated
		 */
		EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.EnumerationLiteralImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getEnumerationLiteral()
		 * @generated
		 */
		EClass ENUMERATION_LITERAL = eINSTANCE.getEnumerationLiteral();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.ListLiteralImpl <em>List Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.ListLiteralImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getListLiteral()
		 * @generated
		 */
		EClass LIST_LITERAL = eINSTANCE.getListLiteral();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.SetLiteralImpl <em>Set Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.SetLiteralImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getSetLiteral()
		 * @generated
		 */
		EClass SET_LITERAL = eINSTANCE.getSetLiteral();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.DirectionalLiteralImpl <em>Directional Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.DirectionalLiteralImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getDirectionalLiteral()
		 * @generated
		 */
		EClass DIRECTIONAL_LITERAL = eINSTANCE.getDirectionalLiteral();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTIONAL_LITERAL__DIRECTION = eINSTANCE.getDirectionalLiteral_Direction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTIONAL_LITERAL__VALUE = eINSTANCE.getDirectionalLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.ECollectionImpl <em>ECollection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.ECollectionImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getECollection()
		 * @generated
		 */
		EClass ECOLLECTION = eINSTANCE.getECollection();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECOLLECTION__ELEMENTS = eINSTANCE.getECollection_Elements();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.LiteralImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.ExpressionImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.MultiLiteralConstraintImpl <em>Multi Literal Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.MultiLiteralConstraintImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getMultiLiteralConstraint()
		 * @generated
		 */
		EClass MULTI_LITERAL_CONSTRAINT = eINSTANCE.getMultiLiteralConstraint();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.MultiOperandExpressionImpl <em>Multi Operand Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.MultiOperandExpressionImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getMultiOperandExpression()
		 * @generated
		 */
		EClass MULTI_OPERAND_EXPRESSION = eINSTANCE.getMultiOperandExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_OPERAND_EXPRESSION__OPERATOR = eINSTANCE.getMultiOperandExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>K</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_OPERAND_EXPRESSION__K = eINSTANCE.getMultiOperandExpression_K();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.BinaryOperationImpl <em>Binary Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.BinaryOperationImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getBinaryOperation()
		 * @generated
		 */
		EClass BINARY_OPERATION = eINSTANCE.getBinaryOperation();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATION__LEFT = eINSTANCE.getBinaryOperation_Left();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_OPERATION__OPERATOR = eINSTANCE.getBinaryOperation_Operator();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATION__RIGHT = eINSTANCE.getBinaryOperation_Right();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.PropertyAssociationImpl <em>Property Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.PropertyAssociationImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getPropertyAssociation()
		 * @generated
		 */
		EClass PROPERTY_ASSOCIATION = eINSTANCE.getPropertyAssociation();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_ASSOCIATION__TARGET = eINSTANCE.getPropertyAssociation_Target();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_ASSOCIATION__PROPERTY = eINSTANCE.getPropertyAssociation_Property();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_ASSOCIATION__VALUE = eINSTANCE.getPropertyAssociation_Value();

		/**
		 * The meta object literal for the '<em><b>Property Association Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_ASSOCIATION__PROPERTY_ASSOCIATION_TYPE = eINSTANCE
				.getPropertyAssociation_PropertyAssociationType();

		/**
		 * The meta object literal for the '<em><b>Property Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_ASSOCIATION__PROPERTY_ASSOCIATION = eINSTANCE.getPropertyAssociation_PropertyAssociation();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.AnnexSubclauseImpl <em>Annex Subclause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.AnnexSubclauseImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getAnnexSubclause()
		 * @generated
		 */
		EClass ANNEX_SUBCLAUSE = eINSTANCE.getAnnexSubclause();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.DefaultAnnexSubclauseImpl <em>Default Annex Subclause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.DefaultAnnexSubclauseImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getDefaultAnnexSubclause()
		 * @generated
		 */
		EClass DEFAULT_ANNEX_SUBCLAUSE = eINSTANCE.getDefaultAnnexSubclause();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_ANNEX_SUBCLAUSE__BODY = eINSTANCE.getDefaultAnnexSubclause_Body();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.AnnexLibraryImpl <em>Annex Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.AnnexLibraryImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getAnnexLibrary()
		 * @generated
		 */
		EClass ANNEX_LIBRARY = eINSTANCE.getAnnexLibrary();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.BehaviorSpecificationImpl <em>Behavior Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.BehaviorSpecificationImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getBehaviorSpecification()
		 * @generated
		 */
		EClass BEHAVIOR_SPECIFICATION = eINSTANCE.getBehaviorSpecification();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_SPECIFICATION__TRANSITIONS = eINSTANCE.getBehaviorSpecification_Transitions();

		/**
		 * The meta object literal for the '<em><b>Behaviors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_SPECIFICATION__BEHAVIORS = eINSTANCE.getBehaviorSpecification_Behaviors();

		/**
		 * The meta object literal for the '<em><b>State Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_SPECIFICATION__STATE_VARIABLES = eINSTANCE.getBehaviorSpecification_StateVariables();

		/**
		 * The meta object literal for the '<em><b>Generators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_SPECIFICATION__GENERATORS = eINSTANCE.getBehaviorSpecification_Generators();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.StateTransitionImpl <em>State Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.StateTransitionImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getStateTransition()
		 * @generated
		 */
		EClass STATE_TRANSITION = eINSTANCE.getStateTransition();

		/**
		 * The meta object literal for the '<em><b>Target State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_TRANSITION__TARGET_STATE = eINSTANCE.getStateTransition_TargetState();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_TRANSITION__CONDITION = eINSTANCE.getStateTransition_Condition();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.BehaviorImpl <em>Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.BehaviorImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getBehavior()
		 * @generated
		 */
		EClass BEHAVIOR = eINSTANCE.getBehavior();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__CONDITION = eINSTANCE.getBehavior_Condition();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__ACTIONS = eINSTANCE.getBehavior_Actions();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR__SOURCE = eINSTANCE.getBehavior_Source();

		/**
		 * The meta object literal for the '<em><b>Sink</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR__SINK = eINSTANCE.getBehavior_Sink();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR__CATEGORY = eINSTANCE.getBehavior_Category();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.StateVariableImpl <em>State Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.StateVariableImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getStateVariable()
		 * @generated
		 */
		EClass STATE_VARIABLE = eINSTANCE.getStateVariable();

		/**
		 * The meta object literal for the '<em><b>Initial State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_VARIABLE__INITIAL_STATE = eINSTANCE.getStateVariable_InitialState();

		/**
		 * The meta object literal for the '<em><b>State Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_VARIABLE__STATE_TYPE = eINSTANCE.getStateVariable_StateType();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.GeneratorImpl <em>Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.GeneratorImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getGenerator()
		 * @generated
		 */
		EClass GENERATOR = eINSTANCE.getGenerator();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR__TYPE = eINSTANCE.getGenerator_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR__VALUE = eINSTANCE.getGenerator_Value();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.ConstantImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT__VALUE = eINSTANCE.getConstant_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT__TYPE = eINSTANCE.getConstant_Type();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.PackageElementReferenceImpl <em>Package Element Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.PackageElementReferenceImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getPackageElementReference()
		 * @generated
		 */
		EClass PACKAGE_ELEMENT_REFERENCE = eINSTANCE.getPackageElementReference();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_ELEMENT_REFERENCE__ELEMENT = eINSTANCE.getPackageElementReference_Element();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.PrimitiveTypeImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Primitive Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_TYPE__PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType_PrimitiveType();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.CompositeTypeImpl <em>Composite Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.CompositeTypeImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getCompositeType()
		 * @generated
		 */
		EClass COMPOSITE_TYPE = eINSTANCE.getCompositeType();

		/**
		 * The meta object literal for the '<em><b>Composite Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_TYPE__COMPOSITE_TYPE = eINSTANCE.getCompositeType_CompositeType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_TYPE__TYPE = eINSTANCE.getCompositeType_Type();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.PathElementImpl <em>Path Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.PathElementImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getPathElement()
		 * @generated
		 */
		EClass PATH_ELEMENT = eINSTANCE.getPathElement();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_ELEMENT__PREVIOUS = eINSTANCE.getPathElement_Previous();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_ELEMENT__NEXT = eINSTANCE.getPathElement_Next();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.ClassifierAssignmentImpl <em>Classifier Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.ClassifierAssignmentImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getClassifierAssignment()
		 * @generated
		 */
		EClass CLASSIFIER_ASSIGNMENT = eINSTANCE.getClassifierAssignment();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_ASSIGNMENT__TARGET = eINSTANCE.getClassifierAssignment_Target();

		/**
		 * The meta object literal for the '<em><b>Classifier Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_ASSIGNMENT__CLASSIFIER_ASSIGNMENTS = eINSTANCE
				.getClassifierAssignment_ClassifierAssignments();

		/**
		 * The meta object literal for the '<em><b>Assigned Classifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_ASSIGNMENT__ASSIGNED_CLASSIFIERS = eINSTANCE
				.getClassifierAssignment_AssignedClassifiers();

		/**
		 * The meta object literal for the '<em><b>Owned Property Associations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_ASSIGNMENT__OWNED_PROPERTY_ASSOCIATIONS = eINSTANCE
				.getClassifierAssignment_OwnedPropertyAssociations();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_ASSIGNMENT__BINDINGS = eINSTANCE.getClassifierAssignment_Bindings();

		/**
		 * The meta object literal for the '<em><b>Annex Subclause</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_ASSIGNMENT__ANNEX_SUBCLAUSE = eINSTANCE.getClassifierAssignment_AnnexSubclause();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.ClassifierAssignmentPatternImpl <em>Classifier Assignment Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.ClassifierAssignmentPatternImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getClassifierAssignmentPattern()
		 * @generated
		 */
		EClass CLASSIFIER_ASSIGNMENT_PATTERN = eINSTANCE.getClassifierAssignmentPattern();

		/**
		 * The meta object literal for the '<em><b>Target Pattern</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_ASSIGNMENT_PATTERN__TARGET_PATTERN = eINSTANCE
				.getClassifierAssignmentPattern_TargetPattern();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.NamedElementReferenceImpl <em>Named Element Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.NamedElementReferenceImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getNamedElementReference()
		 * @generated
		 */
		EClass NAMED_ELEMENT_REFERENCE = eINSTANCE.getNamedElementReference();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ELEMENT_REFERENCE__ELEMENT = eINSTANCE.getNamedElementReference_Element();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ELEMENT_REFERENCE__CONTEXT = eINSTANCE.getNamedElementReference_Context();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.PathSequenceImpl <em>Path Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.PathSequenceImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getPathSequence()
		 * @generated
		 */
		EClass PATH_SEQUENCE = eINSTANCE.getPathSequence();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_SEQUENCE__TARGET = eINSTANCE.getPathSequence_Target();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_SEQUENCE__ELEMENTS = eINSTANCE.getPathSequence_Elements();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.ComponentRealizationImpl <em>Component Realization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.ComponentRealizationImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getComponentRealization()
		 * @generated
		 */
		EClass COMPONENT_REALIZATION = eINSTANCE.getComponentRealization();

		/**
		 * The meta object literal for the '<em><b>Cached Interface Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_REALIZATION__CACHED_INTERFACE_REFERENCE = eINSTANCE
				.getComponentRealization_CachedInterfaceReference();

		/**
		 * The meta object literal for the '<em><b>Classifier Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_REALIZATION__CLASSIFIER_ASSIGNMENTS = eINSTANCE
				.getComponentRealization_ClassifierAssignments();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.ComponentCategory <em>Component Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.ComponentCategory
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getComponentCategory()
		 * @generated
		 */
		EEnum COMPONENT_CATEGORY = eINSTANCE.getComponentCategory();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.FeatureCategory <em>Feature Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.FeatureCategory
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getFeatureCategory()
		 * @generated
		 */
		EEnum FEATURE_CATEGORY = eINSTANCE.getFeatureCategory();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.FeatureDirection <em>Feature Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.FeatureDirection
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getFeatureDirection()
		 * @generated
		 */
		EEnum FEATURE_DIRECTION = eINSTANCE.getFeatureDirection();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.AssociationType <em>Association Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.AssociationType
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getAssociationType()
		 * @generated
		 */
		EEnum ASSOCIATION_TYPE = eINSTANCE.getAssociationType();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.Primitive <em>Primitive</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.Primitive
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getPrimitive()
		 * @generated
		 */
		EEnum PRIMITIVE = eINSTANCE.getPrimitive();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.Composite <em>Composite</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.Composite
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getComposite()
		 * @generated
		 */
		EEnum COMPOSITE = eINSTANCE.getComposite();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.EOperator <em>EOperator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.EOperator
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getEOperator()
		 * @generated
		 */
		EEnum EOPERATOR = eINSTANCE.getEOperator();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.BinaryOperator <em>Binary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.BinaryOperator
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getBinaryOperator()
		 * @generated
		 */
		EEnum BINARY_OPERATOR = eINSTANCE.getBinaryOperator();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.PropertyAssociationType <em>Property Association Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.PropertyAssociationType
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getPropertyAssociationType()
		 * @generated
		 */
		EEnum PROPERTY_ASSOCIATION_TYPE = eINSTANCE.getPropertyAssociationType();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.BehaviorCategory <em>Behavior Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.BehaviorCategory
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getBehaviorCategory()
		 * @generated
		 */
		EEnum BEHAVIOR_CATEGORY = eINSTANCE.getBehaviorCategory();

	}

} //Aadlv3Package
