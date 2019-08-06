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
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

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
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DEFINITION__PRIVATE = PACKAGE_ELEMENT__PRIVATE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
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
	int MODEL_ELEMENT__OWNED_PROPERTY_ASSOCIATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Modes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__IN_MODES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annex Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__ANNEX_ELEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.ClassifierOrTypeImpl <em>Classifier Or Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.ClassifierOrTypeImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getClassifierOrType()
	 * @generated
	 */
	int CLASSIFIER_OR_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_OR_TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Classifier Or Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_OR_TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.ComponentClassifierImpl <em>Component Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.ComponentClassifierImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getComponentClassifier()
	 * @generated
	 */
	int COMPONENT_CLASSIFIER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CLASSIFIER__NAME = PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CLASSIFIER__PRIVATE = PACKAGE_ELEMENT__PRIVATE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CLASSIFIER__CATEGORY = PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CLASSIFIER__SUPER_CLASSIFIERS = PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CLASSIFIER__OWNED_PROPERTY_ASSOCIATIONS = PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Use Modes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CLASSIFIER__USE_MODES = PACKAGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inherits Modes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CLASSIFIER__INHERITS_MODES = PACKAGE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Annex Subclause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CLASSIFIER__ANNEX_SUBCLAUSE = PACKAGE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Component Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CLASSIFIER_FEATURE_COUNT = PACKAGE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.ComponentInterfaceImpl <em>Component Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.ComponentInterfaceImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getComponentInterface()
	 * @generated
	 */
	int COMPONENT_INTERFACE = 9;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.ComponentRealizationImpl <em>Component Realization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.ComponentRealizationImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getComponentRealization()
	 * @generated
	 */
	int COMPONENT_REALIZATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REALIZATION__NAME = COMPONENT_CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REALIZATION__PRIVATE = COMPONENT_CLASSIFIER__PRIVATE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REALIZATION__CATEGORY = COMPONENT_CLASSIFIER__CATEGORY;

	/**
	 * The feature id for the '<em><b>Super Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REALIZATION__SUPER_CLASSIFIERS = COMPONENT_CLASSIFIER__SUPER_CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REALIZATION__OWNED_PROPERTY_ASSOCIATIONS = COMPONENT_CLASSIFIER__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Use Modes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REALIZATION__USE_MODES = COMPONENT_CLASSIFIER__USE_MODES;

	/**
	 * The feature id for the '<em><b>Inherits Modes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REALIZATION__INHERITS_MODES = COMPONENT_CLASSIFIER__INHERITS_MODES;

	/**
	 * The feature id for the '<em><b>Annex Subclause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REALIZATION__ANNEX_SUBCLAUSE = COMPONENT_CLASSIFIER__ANNEX_SUBCLAUSE;

	/**
	 * The feature id for the '<em><b>Cached Interface Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REALIZATION__CACHED_INTERFACE_REFERENCE = COMPONENT_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classifier Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REALIZATION__CLASSIFIER_ASSIGNMENTS = COMPONENT_CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REALIZATION_FEATURE_COUNT = COMPONENT_CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__NAME = COMPONENT_CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__PRIVATE = COMPONENT_CLASSIFIER__PRIVATE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__CATEGORY = COMPONENT_CLASSIFIER__CATEGORY;

	/**
	 * The feature id for the '<em><b>Super Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__SUPER_CLASSIFIERS = COMPONENT_CLASSIFIER__SUPER_CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__OWNED_PROPERTY_ASSOCIATIONS = COMPONENT_CLASSIFIER__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Use Modes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__USE_MODES = COMPONENT_CLASSIFIER__USE_MODES;

	/**
	 * The feature id for the '<em><b>Inherits Modes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__INHERITS_MODES = COMPONENT_CLASSIFIER__INHERITS_MODES;

	/**
	 * The feature id for the '<em><b>Annex Subclause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__ANNEX_SUBCLAUSE = COMPONENT_CLASSIFIER__ANNEX_SUBCLAUSE;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__FEATURES = COMPONENT_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__FLOWS = COMPONENT_CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Use Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__USE_PROPERTIES = COMPONENT_CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Component Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE_FEATURE_COUNT = COMPONENT_CLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.ComponentImplementationImpl <em>Component Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.ComponentImplementationImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getComponentImplementation()
	 * @generated
	 */
	int COMPONENT_IMPLEMENTATION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__NAME = COMPONENT_REALIZATION__NAME;

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
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__OWNED_PROPERTY_ASSOCIATIONS = COMPONENT_REALIZATION__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Use Modes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__USE_MODES = COMPONENT_REALIZATION__USE_MODES;

	/**
	 * The feature id for the '<em><b>Inherits Modes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__INHERITS_MODES = COMPONENT_REALIZATION__INHERITS_MODES;

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
	int COMPONENT_CONFIGURATION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__NAME = COMPONENT_REALIZATION__NAME;

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
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__OWNED_PROPERTY_ASSOCIATIONS = COMPONENT_REALIZATION__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Use Modes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__USE_MODES = COMPONENT_REALIZATION__USE_MODES;

	/**
	 * The feature id for the '<em><b>Inherits Modes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__INHERITS_MODES = COMPONENT_REALIZATION__INHERITS_MODES;

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
	int FEATURE = 12;

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
	 * The feature id for the '<em><b>In Modes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__IN_MODES = MODEL_ELEMENT__IN_MODES;

	/**
	 * The feature id for the '<em><b>Annex Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ANNEX_ELEMENTS = MODEL_ELEMENT__ANNEX_ELEMENTS;

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
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.ComponentImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OWNED_PROPERTY_ASSOCIATIONS = MODEL_ELEMENT__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>In Modes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__IN_MODES = MODEL_ELEMENT__IN_MODES;

	/**
	 * The feature id for the '<em><b>Annex Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ANNEX_ELEMENTS = MODEL_ELEMENT__ANNEX_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CATEGORY = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TYPE_REFERENCES = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENTS = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__BINDINGS = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONNECTIONS = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__FEATURES = MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.ImportImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 14;

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
	int ASSOCIATION = 15;

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
	 * The feature id for the '<em><b>In Modes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__IN_MODES = MODEL_ELEMENT__IN_MODES;

	/**
	 * The feature id for the '<em><b>Annex Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ANNEX_ELEMENTS = MODEL_ELEMENT__ANNEX_ELEMENTS;

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
	 * The feature id for the '<em><b>Annex Subclause</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ANNEX_SUBCLAUSE = MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.ModelElementReferenceImpl <em>Model Element Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.ModelElementReferenceImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getModelElementReference()
	 * @generated
	 */
	int MODEL_ELEMENT_REFERENCE = 20;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.ConfigurationParameterImpl <em>Configuration Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.ConfigurationParameterImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getConfigurationParameter()
	 * @generated
	 */
	int CONFIGURATION_PARAMETER = 21;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.TypeReferenceImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getTypeReference()
	 * @generated
	 */
	int TYPE_REFERENCE = 22;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.ConfigurationActualImpl <em>Configuration Actual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.ConfigurationActualImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getConfigurationActual()
	 * @generated
	 */
	int CONFIGURATION_ACTUAL = 23;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.WorkingsetImpl <em>Workingset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.WorkingsetImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getWorkingset()
	 * @generated
	 */
	int WORKINGSET = 24;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.PropertyValueImpl <em>Property Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.PropertyValueImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getPropertyValue()
	 * @generated
	 */
	int PROPERTY_VALUE = 25;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.PropertyAssociationImpl <em>Property Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.PropertyAssociationImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getPropertyAssociation()
	 * @generated
	 */
	int PROPERTY_ASSOCIATION = 26;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.PathElementImpl <em>Path Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.PathElementImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getPathElement()
	 * @generated
	 */
	int PATH_ELEMENT = 17;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.PathSequenceImpl <em>Path Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.PathSequenceImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getPathSequence()
	 * @generated
	 */
	int PATH_SEQUENCE = 16;

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
	 * The feature id for the '<em><b>In Modes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_SEQUENCE__IN_MODES = MODEL_ELEMENT__IN_MODES;

	/**
	 * The feature id for the '<em><b>Annex Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_SEQUENCE__ANNEX_ELEMENTS = MODEL_ELEMENT__ANNEX_ELEMENTS;

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
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_REFERENCE__ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_REFERENCE__CONTEXT = 1;

	/**
	 * The number of structural features of the '<em>Model Element Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_REFERENCE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ELEMENT__ELEMENT = MODEL_ELEMENT_REFERENCE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ELEMENT__CONTEXT = MODEL_ELEMENT_REFERENCE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ELEMENT__PREVIOUS = MODEL_ELEMENT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ELEMENT__NEXT = MODEL_ELEMENT_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Path Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ELEMENT_FEATURE_COUNT = MODEL_ELEMENT_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.ClassifierAssignmentImpl <em>Classifier Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.ClassifierAssignmentImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getClassifierAssignment()
	 * @generated
	 */
	int CLASSIFIER_ASSIGNMENT = 18;

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
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.ClassifierAssignmentPatternImpl <em>Classifier Assignment Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.ClassifierAssignmentPatternImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getClassifierAssignmentPattern()
	 * @generated
	 */
	int CLASSIFIER_ASSIGNMENT_PATTERN = 19;

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
	int CONFIGURATION_PARAMETER__NAME = CLASSIFIER_OR_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PARAMETER__TYPE = CLASSIFIER_OR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Configuration Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PARAMETER_FEATURE_COUNT = CLASSIFIER_OR_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__REVERSE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__ACTUALS = 2;

	/**
	 * The number of structural features of the '<em>Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_FEATURE_COUNT = 3;

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
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKINGSET__PRIVATE = PACKAGE_ELEMENT__PRIVATE;

	/**
	 * The feature id for the '<em><b>Root Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKINGSET__ROOT_COMPONENTS = PACKAGE_ELEMENT_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE__EXPR = 0;

	/**
	 * The number of structural features of the '<em>Property Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_FEATURE_COUNT = 1;

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
	 * The number of structural features of the '<em>Property Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSOCIATION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.ModeImpl <em>Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.ModeImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getMode()
	 * @generated
	 */
	int MODE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__OWNED_PROPERTY_ASSOCIATIONS = MODEL_ELEMENT__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>In Modes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__IN_MODES = MODEL_ELEMENT__IN_MODES;

	/**
	 * The feature id for the '<em><b>Annex Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__ANNEX_ELEMENTS = MODEL_ELEMENT__ANNEX_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__INITIAL = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.ModeTransitionImpl <em>Mode Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.ModeTransitionImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getModeTransition()
	 * @generated
	 */
	int MODE_TRANSITION = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION__OWNED_PROPERTY_ASSOCIATIONS = MODEL_ELEMENT__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>In Modes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION__IN_MODES = MODEL_ELEMENT__IN_MODES;

	/**
	 * The feature id for the '<em><b>Annex Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION__ANNEX_ELEMENTS = MODEL_ELEMENT__ANNEX_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION__SOURCE = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION__TARGET = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION__TRIGGERS = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mode Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.ModeTransitionTriggerAssignmentImpl <em>Mode Transition Trigger Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.ModeTransitionTriggerAssignmentImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getModeTransitionTriggerAssignment()
	 * @generated
	 */
	int MODE_TRANSITION_TRIGGER_ASSIGNMENT = 29;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION_TRIGGER_ASSIGNMENT__TRIGGERS = 0;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION_TRIGGER_ASSIGNMENT__TRANSITION = 1;

	/**
	 * The number of structural features of the '<em>Mode Transition Trigger Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION_TRIGGER_ASSIGNMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.ModeAssignmentImpl <em>Mode Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.ModeAssignmentImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getModeAssignment()
	 * @generated
	 */
	int MODE_ASSIGNMENT = 30;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_ASSIGNMENT__MEMBERS = 0;

	/**
	 * The number of structural features of the '<em>Mode Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_ASSIGNMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.ModeStateMachineImpl <em>Mode State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.ModeStateMachineImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getModeStateMachine()
	 * @generated
	 */
	int MODE_STATE_MACHINE = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_STATE_MACHINE__NAME = PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_STATE_MACHINE__PRIVATE = PACKAGE_ELEMENT__PRIVATE;

	/**
	 * The feature id for the '<em><b>Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_STATE_MACHINE__MODES = PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_STATE_MACHINE__TRANSITIONS = PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mode State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_STATE_MACHINE_FEATURE_COUNT = PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.AnnexSubclauseImpl <em>Annex Subclause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.AnnexSubclauseImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getAnnexSubclause()
	 * @generated
	 */
	int ANNEX_SUBCLAUSE = 32;

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
	 * The feature id for the '<em><b>In Modes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_SUBCLAUSE__IN_MODES = MODEL_ELEMENT__IN_MODES;

	/**
	 * The feature id for the '<em><b>Annex Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_SUBCLAUSE__ANNEX_ELEMENTS = MODEL_ELEMENT__ANNEX_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Annex Subclause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_SUBCLAUSE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.AnnexElementImpl <em>Annex Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.AnnexElementImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getAnnexElement()
	 * @generated
	 */
	int ANNEX_ELEMENT = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_ELEMENT__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_ELEMENT__OWNED_PROPERTY_ASSOCIATIONS = MODEL_ELEMENT__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>In Modes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_ELEMENT__IN_MODES = MODEL_ELEMENT__IN_MODES;

	/**
	 * The feature id for the '<em><b>Annex Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_ELEMENT__ANNEX_ELEMENTS = MODEL_ELEMENT__ANNEX_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Annex Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_ELEMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.TypeSetImpl <em>Type Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.TypeSetImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getTypeSet()
	 * @generated
	 */
	int TYPE_SET = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SET__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SET__OWNED_PROPERTY_ASSOCIATIONS = MODEL_ELEMENT__OWNED_PROPERTY_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>In Modes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SET__IN_MODES = MODEL_ELEMENT__IN_MODES;

	/**
	 * The feature id for the '<em><b>Annex Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SET__ANNEX_ELEMENTS = MODEL_ELEMENT__ANNEX_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SET__DIRECTION = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Propagated Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SET__PROPAGATED_TYPES = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SET_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.AnnexLibraryImpl <em>Annex Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.AnnexLibraryImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getAnnexLibrary()
	 * @generated
	 */
	int ANNEX_LIBRARY = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_LIBRARY__NAME = PACKAGE_DECLARATION__NAME;

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
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.AnnexDefinitionImpl <em>Annex Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.AnnexDefinitionImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getAnnexDefinition()
	 * @generated
	 */
	int ANNEX_DEFINITION = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_DEFINITION__NAME = PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_DEFINITION__PRIVATE = PACKAGE_ELEMENT__PRIVATE;

	/**
	 * The number of structural features of the '<em>Annex Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_DEFINITION_FEATURE_COUNT = PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.impl.TypeDeclImpl <em>Type Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.impl.TypeDeclImpl
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getTypeDecl()
	 * @generated
	 */
	int TYPE_DECL = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECL__NAME = CLASSIFIER_OR_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECL__PRIVATE = CLASSIFIER_OR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECL__OWNED_PROPERTY_ASSOCIATIONS = CLASSIFIER_OR_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECL__TYPE = CLASSIFIER_OR_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Type Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECL_FEATURE_COUNT = CLASSIFIER_OR_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.ComponentCategory <em>Component Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.ComponentCategory
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getComponentCategory()
	 * @generated
	 */
	int COMPONENT_CATEGORY = 38;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.FeatureCategory <em>Feature Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.FeatureCategory
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getFeatureCategory()
	 * @generated
	 */
	int FEATURE_CATEGORY = 39;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.FeatureDirection <em>Feature Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.FeatureDirection
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getFeatureDirection()
	 * @generated
	 */
	int FEATURE_DIRECTION = 40;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.AssociationType <em>Association Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.AssociationType
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getAssociationType()
	 * @generated
	 */
	int ASSOCIATION_TYPE = 41;

	/**
	 * The meta object id for the '{@link org.osate.aadlv3.aadlv3.PropertyAssociationType <em>Property Association Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.aadlv3.aadlv3.PropertyAssociationType
	 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getPropertyAssociationType()
	 * @generated
	 */
	int PROPERTY_ASSOCIATION_TYPE = 42;

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
	 * Returns the meta object for the reference '{@link org.osate.aadlv3.aadlv3.PropertyDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
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
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.ModelElement#getOwnedPropertyAssociations <em>Owned Property Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Property Associations</em>'.
	 * @see org.osate.aadlv3.aadlv3.ModelElement#getOwnedPropertyAssociations()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_OwnedPropertyAssociations();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.aadlv3.aadlv3.ModelElement#getInModes <em>In Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Modes</em>'.
	 * @see org.osate.aadlv3.aadlv3.ModelElement#getInModes()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_InModes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.ModelElement#getAnnexElements <em>Annex Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annex Elements</em>'.
	 * @see org.osate.aadlv3.aadlv3.ModelElement#getAnnexElements()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_AnnexElements();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.ClassifierOrType <em>Classifier Or Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier Or Type</em>'.
	 * @see org.osate.aadlv3.aadlv3.ClassifierOrType
	 * @generated
	 */
	EClass getClassifierOrType();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.ComponentClassifier <em>Component Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Classifier</em>'.
	 * @see org.osate.aadlv3.aadlv3.ComponentClassifier
	 * @generated
	 */
	EClass getComponentClassifier();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.aadlv3.aadlv3.ComponentClassifier#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see org.osate.aadlv3.aadlv3.ComponentClassifier#getCategory()
	 * @see #getComponentClassifier()
	 * @generated
	 */
	EAttribute getComponentClassifier_Category();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.ComponentClassifier#getSuperClassifiers <em>Super Classifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Super Classifiers</em>'.
	 * @see org.osate.aadlv3.aadlv3.ComponentClassifier#getSuperClassifiers()
	 * @see #getComponentClassifier()
	 * @generated
	 */
	EReference getComponentClassifier_SuperClassifiers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.ComponentClassifier#getOwnedPropertyAssociations <em>Owned Property Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Property Associations</em>'.
	 * @see org.osate.aadlv3.aadlv3.ComponentClassifier#getOwnedPropertyAssociations()
	 * @see #getComponentClassifier()
	 * @generated
	 */
	EReference getComponentClassifier_OwnedPropertyAssociations();

	/**
	 * Returns the meta object for the reference '{@link org.osate.aadlv3.aadlv3.ComponentClassifier#getUseModes <em>Use Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Use Modes</em>'.
	 * @see org.osate.aadlv3.aadlv3.ComponentClassifier#getUseModes()
	 * @see #getComponentClassifier()
	 * @generated
	 */
	EReference getComponentClassifier_UseModes();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.aadlv3.aadlv3.ComponentClassifier#isInheritsModes <em>Inherits Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherits Modes</em>'.
	 * @see org.osate.aadlv3.aadlv3.ComponentClassifier#isInheritsModes()
	 * @see #getComponentClassifier()
	 * @generated
	 */
	EAttribute getComponentClassifier_InheritsModes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.ComponentClassifier#getAnnexSubclause <em>Annex Subclause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annex Subclause</em>'.
	 * @see org.osate.aadlv3.aadlv3.ComponentClassifier#getAnnexSubclause()
	 * @see #getComponentClassifier()
	 * @generated
	 */
	EReference getComponentClassifier_AnnexSubclause();

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
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.ComponentInterface#getFlows <em>Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flows</em>'.
	 * @see org.osate.aadlv3.aadlv3.ComponentInterface#getFlows()
	 * @see #getComponentInterface()
	 * @generated
	 */
	EReference getComponentInterface_Flows();

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
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.osate.aadlv3.aadlv3.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.aadlv3.aadlv3.Component#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see org.osate.aadlv3.aadlv3.Component#getCategory()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Category();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.Component#getTypeReferences <em>Type References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type References</em>'.
	 * @see org.osate.aadlv3.aadlv3.Component#getTypeReferences()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_TypeReferences();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.Component#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.osate.aadlv3.aadlv3.Component#getComponents()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.Component#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see org.osate.aadlv3.aadlv3.Component#getBindings()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Bindings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.Component#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see org.osate.aadlv3.aadlv3.Component#getConnections()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Connections();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.Component#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see org.osate.aadlv3.aadlv3.Component#getFeatures()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Features();

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
	 * Returns the meta object for the reference list '{@link org.osate.aadlv3.aadlv3.Association#getAnnexSubclause <em>Annex Subclause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Annex Subclause</em>'.
	 * @see org.osate.aadlv3.aadlv3.Association#getAnnexSubclause()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_AnnexSubclause();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.ModelElementReference <em>Model Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element Reference</em>'.
	 * @see org.osate.aadlv3.aadlv3.ModelElementReference
	 * @generated
	 */
	EClass getModelElementReference();

	/**
	 * Returns the meta object for the reference '{@link org.osate.aadlv3.aadlv3.ModelElementReference#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see org.osate.aadlv3.aadlv3.ModelElementReference#getElement()
	 * @see #getModelElementReference()
	 * @generated
	 */
	EReference getModelElementReference_Element();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.aadlv3.aadlv3.ModelElementReference#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see org.osate.aadlv3.aadlv3.ModelElementReference#getContext()
	 * @see #getModelElementReference()
	 * @generated
	 */
	EReference getModelElementReference_Context();

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
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.Workingset#getRootComponents <em>Root Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Root Components</em>'.
	 * @see org.osate.aadlv3.aadlv3.Workingset#getRootComponents()
	 * @see #getWorkingset()
	 * @generated
	 */
	EReference getWorkingset_RootComponents();

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
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.PropertyValue <em>Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Value</em>'.
	 * @see org.osate.aadlv3.aadlv3.PropertyValue
	 * @generated
	 */
	EClass getPropertyValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.aadlv3.aadlv3.PropertyValue#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see org.osate.aadlv3.aadlv3.PropertyValue#getExpr()
	 * @see #getPropertyValue()
	 * @generated
	 */
	EReference getPropertyValue_Expr();

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
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode</em>'.
	 * @see org.osate.aadlv3.aadlv3.Mode
	 * @generated
	 */
	EClass getMode();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.aadlv3.aadlv3.Mode#isInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial</em>'.
	 * @see org.osate.aadlv3.aadlv3.Mode#isInitial()
	 * @see #getMode()
	 * @generated
	 */
	EAttribute getMode_Initial();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.ModeTransition <em>Mode Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode Transition</em>'.
	 * @see org.osate.aadlv3.aadlv3.ModeTransition
	 * @generated
	 */
	EClass getModeTransition();

	/**
	 * Returns the meta object for the reference '{@link org.osate.aadlv3.aadlv3.ModeTransition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.osate.aadlv3.aadlv3.ModeTransition#getSource()
	 * @see #getModeTransition()
	 * @generated
	 */
	EReference getModeTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link org.osate.aadlv3.aadlv3.ModeTransition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.osate.aadlv3.aadlv3.ModeTransition#getTarget()
	 * @see #getModeTransition()
	 * @generated
	 */
	EReference getModeTransition_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.ModeTransition#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triggers</em>'.
	 * @see org.osate.aadlv3.aadlv3.ModeTransition#getTriggers()
	 * @see #getModeTransition()
	 * @generated
	 */
	EReference getModeTransition_Triggers();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.ModeTransitionTriggerAssignment <em>Mode Transition Trigger Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode Transition Trigger Assignment</em>'.
	 * @see org.osate.aadlv3.aadlv3.ModeTransitionTriggerAssignment
	 * @generated
	 */
	EClass getModeTransitionTriggerAssignment();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.ModeTransitionTriggerAssignment#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triggers</em>'.
	 * @see org.osate.aadlv3.aadlv3.ModeTransitionTriggerAssignment#getTriggers()
	 * @see #getModeTransitionTriggerAssignment()
	 * @generated
	 */
	EReference getModeTransitionTriggerAssignment_Triggers();

	/**
	 * Returns the meta object for the reference '{@link org.osate.aadlv3.aadlv3.ModeTransitionTriggerAssignment#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transition</em>'.
	 * @see org.osate.aadlv3.aadlv3.ModeTransitionTriggerAssignment#getTransition()
	 * @see #getModeTransitionTriggerAssignment()
	 * @generated
	 */
	EReference getModeTransitionTriggerAssignment_Transition();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.ModeAssignment <em>Mode Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode Assignment</em>'.
	 * @see org.osate.aadlv3.aadlv3.ModeAssignment
	 * @generated
	 */
	EClass getModeAssignment();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.aadlv3.aadlv3.ModeAssignment#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Members</em>'.
	 * @see org.osate.aadlv3.aadlv3.ModeAssignment#getMembers()
	 * @see #getModeAssignment()
	 * @generated
	 */
	EReference getModeAssignment_Members();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.ModeStateMachine <em>Mode State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode State Machine</em>'.
	 * @see org.osate.aadlv3.aadlv3.ModeStateMachine
	 * @generated
	 */
	EClass getModeStateMachine();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.ModeStateMachine#getModes <em>Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modes</em>'.
	 * @see org.osate.aadlv3.aadlv3.ModeStateMachine#getModes()
	 * @see #getModeStateMachine()
	 * @generated
	 */
	EReference getModeStateMachine_Modes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.ModeStateMachine#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see org.osate.aadlv3.aadlv3.ModeStateMachine#getTransitions()
	 * @see #getModeStateMachine()
	 * @generated
	 */
	EReference getModeStateMachine_Transitions();

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
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.AnnexElement <em>Annex Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annex Element</em>'.
	 * @see org.osate.aadlv3.aadlv3.AnnexElement
	 * @generated
	 */
	EClass getAnnexElement();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.TypeSet <em>Type Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Set</em>'.
	 * @see org.osate.aadlv3.aadlv3.TypeSet
	 * @generated
	 */
	EClass getTypeSet();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.aadlv3.aadlv3.TypeSet#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.osate.aadlv3.aadlv3.TypeSet#getDirection()
	 * @see #getTypeSet()
	 * @generated
	 */
	EAttribute getTypeSet_Direction();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.aadlv3.aadlv3.TypeSet#getPropagatedTypes <em>Propagated Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Propagated Types</em>'.
	 * @see org.osate.aadlv3.aadlv3.TypeSet#getPropagatedTypes()
	 * @see #getTypeSet()
	 * @generated
	 */
	EReference getTypeSet_PropagatedTypes();

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
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.AnnexDefinition <em>Annex Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annex Definition</em>'.
	 * @see org.osate.aadlv3.aadlv3.AnnexDefinition
	 * @generated
	 */
	EClass getAnnexDefinition();

	/**
	 * Returns the meta object for class '{@link org.osate.aadlv3.aadlv3.TypeDecl <em>Type Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Decl</em>'.
	 * @see org.osate.aadlv3.aadlv3.TypeDecl
	 * @generated
	 */
	EClass getTypeDecl();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.aadlv3.aadlv3.TypeDecl#getOwnedPropertyAssociations <em>Owned Property Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Property Associations</em>'.
	 * @see org.osate.aadlv3.aadlv3.TypeDecl#getOwnedPropertyAssociations()
	 * @see #getTypeDecl()
	 * @generated
	 */
	EReference getTypeDecl_OwnedPropertyAssociations();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.aadlv3.aadlv3.TypeDecl#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.osate.aadlv3.aadlv3.TypeDecl#getType()
	 * @see #getTypeDecl()
	 * @generated
	 */
	EReference getTypeDecl_Type();

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
	 * Returns the meta object for enum '{@link org.osate.aadlv3.aadlv3.PropertyAssociationType <em>Property Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Association Type</em>'.
	 * @see org.osate.aadlv3.aadlv3.PropertyAssociationType
	 * @generated
	 */
	EEnum getPropertyAssociationType();

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
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
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
		 * The meta object literal for the '<em><b>Owned Property Associations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__OWNED_PROPERTY_ASSOCIATIONS = eINSTANCE.getModelElement_OwnedPropertyAssociations();

		/**
		 * The meta object literal for the '<em><b>In Modes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__IN_MODES = eINSTANCE.getModelElement_InModes();

		/**
		 * The meta object literal for the '<em><b>Annex Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__ANNEX_ELEMENTS = eINSTANCE.getModelElement_AnnexElements();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.ClassifierOrTypeImpl <em>Classifier Or Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.ClassifierOrTypeImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getClassifierOrType()
		 * @generated
		 */
		EClass CLASSIFIER_OR_TYPE = eINSTANCE.getClassifierOrType();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.ComponentClassifierImpl <em>Component Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.ComponentClassifierImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getComponentClassifier()
		 * @generated
		 */
		EClass COMPONENT_CLASSIFIER = eINSTANCE.getComponentClassifier();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_CLASSIFIER__CATEGORY = eINSTANCE.getComponentClassifier_Category();

		/**
		 * The meta object literal for the '<em><b>Super Classifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_CLASSIFIER__SUPER_CLASSIFIERS = eINSTANCE.getComponentClassifier_SuperClassifiers();

		/**
		 * The meta object literal for the '<em><b>Owned Property Associations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_CLASSIFIER__OWNED_PROPERTY_ASSOCIATIONS = eINSTANCE
				.getComponentClassifier_OwnedPropertyAssociations();

		/**
		 * The meta object literal for the '<em><b>Use Modes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_CLASSIFIER__USE_MODES = eINSTANCE.getComponentClassifier_UseModes();

		/**
		 * The meta object literal for the '<em><b>Inherits Modes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_CLASSIFIER__INHERITS_MODES = eINSTANCE.getComponentClassifier_InheritsModes();

		/**
		 * The meta object literal for the '<em><b>Annex Subclause</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_CLASSIFIER__ANNEX_SUBCLAUSE = eINSTANCE.getComponentClassifier_AnnexSubclause();

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
		 * The meta object literal for the '<em><b>Flows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INTERFACE__FLOWS = eINSTANCE.getComponentInterface_Flows();

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
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.ComponentImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__CATEGORY = eINSTANCE.getComponent_Category();

		/**
		 * The meta object literal for the '<em><b>Type References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__TYPE_REFERENCES = eINSTANCE.getComponent_TypeReferences();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__COMPONENTS = eINSTANCE.getComponent_Components();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__BINDINGS = eINSTANCE.getComponent_Bindings();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__CONNECTIONS = eINSTANCE.getComponent_Connections();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__FEATURES = eINSTANCE.getComponent_Features();

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
		 * The meta object literal for the '<em><b>Annex Subclause</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__ANNEX_SUBCLAUSE = eINSTANCE.getAssociation_AnnexSubclause();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.ModelElementReferenceImpl <em>Model Element Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.ModelElementReferenceImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getModelElementReference()
		 * @generated
		 */
		EClass MODEL_ELEMENT_REFERENCE = eINSTANCE.getModelElementReference();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT_REFERENCE__ELEMENT = eINSTANCE.getModelElementReference_Element();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT_REFERENCE__CONTEXT = eINSTANCE.getModelElementReference_Context();

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
		 * The meta object literal for the '<em><b>Root Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKINGSET__ROOT_COMPONENTS = eINSTANCE.getWorkingset_RootComponents();

		/**
		 * The meta object literal for the '<em><b>Use Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKINGSET__USE_PROPERTIES = eINSTANCE.getWorkingset_UseProperties();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.PropertyValueImpl <em>Property Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.PropertyValueImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getPropertyValue()
		 * @generated
		 */
		EClass PROPERTY_VALUE = eINSTANCE.getPropertyValue();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_VALUE__EXPR = eINSTANCE.getPropertyValue_Expr();

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
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.ModeImpl <em>Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.ModeImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getMode()
		 * @generated
		 */
		EClass MODE = eINSTANCE.getMode();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODE__INITIAL = eINSTANCE.getMode_Initial();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.ModeTransitionImpl <em>Mode Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.ModeTransitionImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getModeTransition()
		 * @generated
		 */
		EClass MODE_TRANSITION = eINSTANCE.getModeTransition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE_TRANSITION__SOURCE = eINSTANCE.getModeTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE_TRANSITION__TARGET = eINSTANCE.getModeTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE_TRANSITION__TRIGGERS = eINSTANCE.getModeTransition_Triggers();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.ModeTransitionTriggerAssignmentImpl <em>Mode Transition Trigger Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.ModeTransitionTriggerAssignmentImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getModeTransitionTriggerAssignment()
		 * @generated
		 */
		EClass MODE_TRANSITION_TRIGGER_ASSIGNMENT = eINSTANCE.getModeTransitionTriggerAssignment();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE_TRANSITION_TRIGGER_ASSIGNMENT__TRIGGERS = eINSTANCE
				.getModeTransitionTriggerAssignment_Triggers();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE_TRANSITION_TRIGGER_ASSIGNMENT__TRANSITION = eINSTANCE
				.getModeTransitionTriggerAssignment_Transition();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.ModeAssignmentImpl <em>Mode Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.ModeAssignmentImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getModeAssignment()
		 * @generated
		 */
		EClass MODE_ASSIGNMENT = eINSTANCE.getModeAssignment();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE_ASSIGNMENT__MEMBERS = eINSTANCE.getModeAssignment_Members();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.ModeStateMachineImpl <em>Mode State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.ModeStateMachineImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getModeStateMachine()
		 * @generated
		 */
		EClass MODE_STATE_MACHINE = eINSTANCE.getModeStateMachine();

		/**
		 * The meta object literal for the '<em><b>Modes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE_STATE_MACHINE__MODES = eINSTANCE.getModeStateMachine_Modes();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE_STATE_MACHINE__TRANSITIONS = eINSTANCE.getModeStateMachine_Transitions();

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
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.AnnexElementImpl <em>Annex Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.AnnexElementImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getAnnexElement()
		 * @generated
		 */
		EClass ANNEX_ELEMENT = eINSTANCE.getAnnexElement();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.TypeSetImpl <em>Type Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.TypeSetImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getTypeSet()
		 * @generated
		 */
		EClass TYPE_SET = eINSTANCE.getTypeSet();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_SET__DIRECTION = eINSTANCE.getTypeSet_Direction();

		/**
		 * The meta object literal for the '<em><b>Propagated Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_SET__PROPAGATED_TYPES = eINSTANCE.getTypeSet_PropagatedTypes();

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
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.AnnexDefinitionImpl <em>Annex Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.AnnexDefinitionImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getAnnexDefinition()
		 * @generated
		 */
		EClass ANNEX_DEFINITION = eINSTANCE.getAnnexDefinition();

		/**
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.impl.TypeDeclImpl <em>Type Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.impl.TypeDeclImpl
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getTypeDecl()
		 * @generated
		 */
		EClass TYPE_DECL = eINSTANCE.getTypeDecl();

		/**
		 * The meta object literal for the '<em><b>Owned Property Associations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DECL__OWNED_PROPERTY_ASSOCIATIONS = eINSTANCE.getTypeDecl_OwnedPropertyAssociations();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DECL__TYPE = eINSTANCE.getTypeDecl_Type();

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
		 * The meta object literal for the '{@link org.osate.aadlv3.aadlv3.PropertyAssociationType <em>Property Association Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.aadlv3.aadlv3.PropertyAssociationType
		 * @see org.osate.aadlv3.aadlv3.impl.Aadlv3PackageImpl#getPropertyAssociationType()
		 * @generated
		 */
		EEnum PROPERTY_ASSOCIATION_TYPE = eINSTANCE.getPropertyAssociationType();

	}

} //Aadlv3Package
