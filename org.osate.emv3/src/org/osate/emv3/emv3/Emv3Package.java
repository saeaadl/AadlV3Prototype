/**
 * Copyright Text	Copyright 2018 Carnegie Mellon University. All Rights Reserved....
 */
package org.osate.emv3.emv3;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.osate.emv3.emv3.Emv3Factory
 * @model kind="package"
 * @generated
 */
public interface Emv3Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "emv3";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.osate.org/emv3/Emv3";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "emv3";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Emv3Package eINSTANCE = org.osate.emv3.emv3.impl.Emv3PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.ErrorModelSubclauseImpl <em>Error Model Subclause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.ErrorModelSubclauseImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getErrorModelSubclause()
	 * @generated
	 */
	int ERROR_MODEL_SUBCLAUSE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_SUBCLAUSE__NAME = Aadlv3Package.PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_SUBCLAUSE__PRIVATE = Aadlv3Package.PACKAGE_ELEMENT__PRIVATE;

	/**
	 * The feature id for the '<em><b>Use Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_SUBCLAUSE__USE_TYPES = Aadlv3Package.PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Equivalence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_SUBCLAUSE__TYPE_EQUIVALENCE = Aadlv3Package.PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Mapping Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_SUBCLAUSE__TYPE_MAPPING_SET = Aadlv3Package.PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Use Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_SUBCLAUSE__USE_BEHAVIOR = Aadlv3Package.PACKAGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Propagations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_SUBCLAUSE__PROPAGATIONS = Aadlv3Package.PACKAGE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_SUBCLAUSE__FLOWS = Aadlv3Package.PACKAGE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Use Transformation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_SUBCLAUSE__USE_TRANSFORMATION = Aadlv3Package.PACKAGE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_SUBCLAUSE__EVENTS = Aadlv3Package.PACKAGE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_SUBCLAUSE__TRANSITIONS = Aadlv3Package.PACKAGE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Outgoing Propagation Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_SUBCLAUSE__OUTGOING_PROPAGATION_CONDITIONS = Aadlv3Package.PACKAGE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Error Detections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_SUBCLAUSE__ERROR_DETECTIONS = Aadlv3Package.PACKAGE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Error State To Mode Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_SUBCLAUSE__ERROR_STATE_TO_MODE_MAPPINGS = Aadlv3Package.PACKAGE_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_SUBCLAUSE__STATES = Aadlv3Package.PACKAGE_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Type Transformation Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_SUBCLAUSE__TYPE_TRANSFORMATION_SET = Aadlv3Package.PACKAGE_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Connection Error Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_SUBCLAUSE__CONNECTION_ERROR_SOURCES = Aadlv3Package.PACKAGE_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_SUBCLAUSE__POINTS = Aadlv3Package.PACKAGE_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_SUBCLAUSE__PATHS = Aadlv3Package.PACKAGE_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Error Model Subclause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_SUBCLAUSE_FEATURE_COUNT = Aadlv3Package.PACKAGE_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.ErrorModelLibraryImpl <em>Error Model Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.ErrorModelLibraryImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getErrorModelLibrary()
	 * @generated
	 */
	int ERROR_MODEL_LIBRARY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_LIBRARY__NAME = Aadlv3Package.PACKAGE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_LIBRARY__PRIVATE = Aadlv3Package.PACKAGE_DECLARATION__PRIVATE;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_LIBRARY__IMPORTS = Aadlv3Package.PACKAGE_DECLARATION__IMPORTS;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_LIBRARY__ELEMENTS = Aadlv3Package.PACKAGE_DECLARATION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Use Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_LIBRARY__USE_TYPES = Aadlv3Package.PACKAGE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_LIBRARY__EXTENDS = Aadlv3Package.PACKAGE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_LIBRARY__TYPES = Aadlv3Package.PACKAGE_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Typesets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_LIBRARY__TYPESETS = Aadlv3Package.PACKAGE_DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_LIBRARY__BEHAVIORS = Aadlv3Package.PACKAGE_DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_LIBRARY__MAPPINGS = Aadlv3Package.PACKAGE_DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Transformations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_LIBRARY__TRANSFORMATIONS = Aadlv3Package.PACKAGE_DECLARATION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Error Model Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_LIBRARY_FEATURE_COUNT = Aadlv3Package.PACKAGE_DECLARATION_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.ErrorTypesImpl <em>Error Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.ErrorTypesImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getErrorTypes()
	 * @generated
	 */
	int ERROR_TYPES = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPES__NAME = Aadlv3Package.PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPES__PRIVATE = Aadlv3Package.PACKAGE_ELEMENT__PRIVATE;

	/**
	 * The number of structural features of the '<em>Error Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPES_FEATURE_COUNT = Aadlv3Package.PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.ErrorTypeImpl <em>Error Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.ErrorTypeImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getErrorType()
	 * @generated
	 */
	int ERROR_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE__NAME = ERROR_TYPES__NAME;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE__PRIVATE = ERROR_TYPES__PRIVATE;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE__SUPER_TYPE = ERROR_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aliased Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE__ALIASED_TYPE = ERROR_TYPES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Error Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE_FEATURE_COUNT = ERROR_TYPES_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.TypeSetImpl <em>Type Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.TypeSetImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getTypeSet()
	 * @generated
	 */
	int TYPE_SET = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SET__NAME = ERROR_TYPES__NAME;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SET__PRIVATE = ERROR_TYPES__PRIVATE;

	/**
	 * The feature id for the '<em><b>Type Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SET__TYPE_TOKENS = ERROR_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aliased Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SET__ALIASED_TYPE = ERROR_TYPES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SET_FEATURE_COUNT = ERROR_TYPES_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.TypeTokenImpl <em>Type Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.TypeTokenImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getTypeToken()
	 * @generated
	 */
	int TYPE_TOKEN = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TOKEN__NAME = Aadlv3Package.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TOKEN__TYPE = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>No Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TOKEN__NO_ERROR = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TOKEN_FEATURE_COUNT = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.TypeTransformationSetImpl <em>Type Transformation Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.TypeTransformationSetImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getTypeTransformationSet()
	 * @generated
	 */
	int TYPE_TRANSFORMATION_SET = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TRANSFORMATION_SET__NAME = Aadlv3Package.PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TRANSFORMATION_SET__PRIVATE = Aadlv3Package.PACKAGE_ELEMENT__PRIVATE;

	/**
	 * The feature id for the '<em><b>Use Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TRANSFORMATION_SET__USE_TYPES = Aadlv3Package.PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TRANSFORMATION_SET__TRANSFORMATION = Aadlv3Package.PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Transformation Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TRANSFORMATION_SET_FEATURE_COUNT = Aadlv3Package.PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.TypeTransformationImpl <em>Type Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.TypeTransformationImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getTypeTransformation()
	 * @generated
	 */
	int TYPE_TRANSFORMATION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TRANSFORMATION__NAME = Aadlv3Package.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TRANSFORMATION__SOURCE = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TRANSFORMATION__ALL_SOURCES = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contributor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TRANSFORMATION__CONTRIBUTOR = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TRANSFORMATION__TARGET = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Type Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TRANSFORMATION_FEATURE_COUNT = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.TypeMappingSetImpl <em>Type Mapping Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.TypeMappingSetImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getTypeMappingSet()
	 * @generated
	 */
	int TYPE_MAPPING_SET = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAPPING_SET__NAME = Aadlv3Package.PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAPPING_SET__PRIVATE = Aadlv3Package.PACKAGE_ELEMENT__PRIVATE;

	/**
	 * The feature id for the '<em><b>Use Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAPPING_SET__USE_TYPES = Aadlv3Package.PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAPPING_SET__MAPPING = Aadlv3Package.PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Mapping Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAPPING_SET_FEATURE_COUNT = Aadlv3Package.PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.TypeMappingImpl <em>Type Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.TypeMappingImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getTypeMapping()
	 * @generated
	 */
	int TYPE_MAPPING = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAPPING__NAME = Aadlv3Package.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAPPING__SOURCE = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAPPING__TARGET = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAPPING_FEATURE_COUNT = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.ErrorPropagationImpl <em>Error Propagation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.ErrorPropagationImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getErrorPropagation()
	 * @generated
	 */
	int ERROR_PROPAGATION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROPAGATION__NAME = Aadlv3Package.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROPAGATION__KIND = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Featureor PP Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROPAGATION__FEATUREOR_PP_REF = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROPAGATION__NOT = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROPAGATION__DIRECTION = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROPAGATION__TYPE_SET = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Error Propagation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROPAGATION_FEATURE_COUNT = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.FeatureorPPReferenceImpl <em>Featureor PP Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.FeatureorPPReferenceImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getFeatureorPPReference()
	 * @generated
	 */
	int FEATUREOR_PP_REFERENCE = 11;

	/**
	 * The feature id for the '<em><b>Featureor PP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATUREOR_PP_REFERENCE__FEATUREOR_PP = 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATUREOR_PP_REFERENCE__NEXT = 1;

	/**
	 * The number of structural features of the '<em>Featureor PP Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATUREOR_PP_REFERENCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.ErrorFlowImpl <em>Error Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.ErrorFlowImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getErrorFlow()
	 * @generated
	 */
	int ERROR_FLOW = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_FLOW__NAME = Aadlv3Package.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type Token Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_FLOW__TYPE_TOKEN_CONSTRAINT = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flowcondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_FLOW__FLOWCONDITION = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Error Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_FLOW_FEATURE_COUNT = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.ErrorSourceImpl <em>Error Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.ErrorSourceImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getErrorSource()
	 * @generated
	 */
	int ERROR_SOURCE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_SOURCE__NAME = ERROR_FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Type Token Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_SOURCE__TYPE_TOKEN_CONSTRAINT = ERROR_FLOW__TYPE_TOKEN_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Flowcondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_SOURCE__FLOWCONDITION = ERROR_FLOW__FLOWCONDITION;

	/**
	 * The feature id for the '<em><b>Source Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_SOURCE__SOURCE_MODEL_ELEMENT = ERROR_FLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_SOURCE__ALL = ERROR_FLOW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Failure Mode Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_SOURCE__FAILURE_MODE_REFERENCE = ERROR_FLOW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Failure Mode Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_SOURCE__FAILURE_MODE_TYPE = ERROR_FLOW_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Failure Mode Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_SOURCE__FAILURE_MODE_DESCRIPTION = ERROR_FLOW_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Error Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_SOURCE_FEATURE_COUNT = ERROR_FLOW_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.ErrorSinkImpl <em>Error Sink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.ErrorSinkImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getErrorSink()
	 * @generated
	 */
	int ERROR_SINK = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_SINK__NAME = ERROR_FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Type Token Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_SINK__TYPE_TOKEN_CONSTRAINT = ERROR_FLOW__TYPE_TOKEN_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Flowcondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_SINK__FLOWCONDITION = ERROR_FLOW__FLOWCONDITION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_SINK__INCOMING = ERROR_FLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>All Incoming</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_SINK__ALL_INCOMING = ERROR_FLOW_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Error Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_SINK_FEATURE_COUNT = ERROR_FLOW_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.ErrorPathImpl <em>Error Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.ErrorPathImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getErrorPath()
	 * @generated
	 */
	int ERROR_PATH = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PATH__NAME = ERROR_FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Type Token Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PATH__TYPE_TOKEN_CONSTRAINT = ERROR_FLOW__TYPE_TOKEN_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Flowcondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PATH__FLOWCONDITION = ERROR_FLOW__FLOWCONDITION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PATH__INCOMING = ERROR_FLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>All Incoming</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PATH__ALL_INCOMING = ERROR_FLOW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PATH__OUTGOING = ERROR_FLOW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>All Outgoing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PATH__ALL_OUTGOING = ERROR_FLOW_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PATH__TARGET_TOKEN = ERROR_FLOW_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type Mapping Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PATH__TYPE_MAPPING_SET = ERROR_FLOW_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Error Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PATH_FEATURE_COUNT = ERROR_FLOW_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.IfConditionImpl <em>If Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.IfConditionImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getIfCondition()
	 * @generated
	 */
	int IF_CONDITION = 16;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_CONDITION__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Resolute Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_CONDITION__RESOLUTE_FUNCTION = 1;

	/**
	 * The feature id for the '<em><b>Java Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_CONDITION__JAVA_METHOD = 2;

	/**
	 * The number of structural features of the '<em>If Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_CONDITION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.PropagationPointImpl <em>Propagation Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.PropagationPointImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getPropagationPoint()
	 * @generated
	 */
	int PROPAGATION_POINT = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_POINT__NAME = Aadlv3Package.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Propagation Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_POINT_FEATURE_COUNT = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.PropagationPathImpl <em>Propagation Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.PropagationPathImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getPropagationPath()
	 * @generated
	 */
	int PROPAGATION_PATH = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_PATH__NAME = Aadlv3Package.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_PATH__SOURCE = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_PATH__TARGET = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Propagation Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_PATH_FEATURE_COUNT = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.QualifiedPropagationPointImpl <em>Qualified Propagation Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.QualifiedPropagationPointImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getQualifiedPropagationPoint()
	 * @generated
	 */
	int QUALIFIED_PROPAGATION_POINT = 19;

	/**
	 * The feature id for the '<em><b>Subcomponent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_PROPAGATION_POINT__SUBCOMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_PROPAGATION_POINT__NEXT = 1;

	/**
	 * The feature id for the '<em><b>Propagation Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_PROPAGATION_POINT__PROPAGATION_POINT = 2;

	/**
	 * The number of structural features of the '<em>Qualified Propagation Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_PROPAGATION_POINT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.ErrorBehaviorStateMachineImpl <em>Error Behavior State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.ErrorBehaviorStateMachineImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getErrorBehaviorStateMachine()
	 * @generated
	 */
	int ERROR_BEHAVIOR_STATE_MACHINE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_STATE_MACHINE__NAME = Aadlv3Package.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Use Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_STATE_MACHINE__USE_TYPES = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Use Transformation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_STATE_MACHINE__USE_TRANSFORMATION = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_STATE_MACHINE__EVENTS = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_STATE_MACHINE__STATES = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_STATE_MACHINE__TRANSITIONS = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Error Behavior State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_STATE_MACHINE_FEATURE_COUNT = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.ErrorBehaviorEventImpl <em>Error Behavior Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.ErrorBehaviorEventImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getErrorBehaviorEvent()
	 * @generated
	 */
	int ERROR_BEHAVIOR_EVENT = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_EVENT__NAME = Aadlv3Package.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Error Behavior Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_EVENT_FEATURE_COUNT = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.ErrorEventImpl <em>Error Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.ErrorEventImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getErrorEvent()
	 * @generated
	 */
	int ERROR_EVENT = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_EVENT__NAME = ERROR_BEHAVIOR_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Type Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_EVENT__TYPE_SET = ERROR_BEHAVIOR_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Eventcondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_EVENT__EVENTCONDITION = ERROR_BEHAVIOR_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Error Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_EVENT_FEATURE_COUNT = ERROR_BEHAVIOR_EVENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.RepairEventImpl <em>Repair Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.RepairEventImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getRepairEvent()
	 * @generated
	 */
	int REPAIR_EVENT = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR_EVENT__NAME = ERROR_BEHAVIOR_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Event Initiator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR_EVENT__EVENT_INITIATOR = ERROR_BEHAVIOR_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Repair Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR_EVENT_FEATURE_COUNT = ERROR_BEHAVIOR_EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.RecoverEventImpl <em>Recover Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.RecoverEventImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getRecoverEvent()
	 * @generated
	 */
	int RECOVER_EVENT = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVER_EVENT__NAME = ERROR_BEHAVIOR_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Event Initiator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVER_EVENT__EVENT_INITIATOR = ERROR_BEHAVIOR_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVER_EVENT__CONDITION = ERROR_BEHAVIOR_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Recover Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVER_EVENT_FEATURE_COUNT = ERROR_BEHAVIOR_EVENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.ErrorBehaviorStateImpl <em>Error Behavior State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.ErrorBehaviorStateImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getErrorBehaviorState()
	 * @generated
	 */
	int ERROR_BEHAVIOR_STATE = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_STATE__NAME = Aadlv3Package.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Intial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_STATE__INTIAL = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_STATE__TYPE_SET = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Error Behavior State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_STATE_FEATURE_COUNT = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.ErrorBehaviorTransitionImpl <em>Error Behavior Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.ErrorBehaviorTransitionImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getErrorBehaviorTransition()
	 * @generated
	 */
	int ERROR_BEHAVIOR_TRANSITION = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_TRANSITION__NAME = Aadlv3Package.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_TRANSITION__SOURCE = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Token Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_TRANSITION__TYPE_TOKEN_CONSTRAINT = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>All States</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_TRANSITION__ALL_STATES = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_TRANSITION__CONDITION = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_TRANSITION__TARGET = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Target Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_TRANSITION__TARGET_TOKEN = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Steady State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_TRANSITION__STEADY_STATE = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Destination Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_TRANSITION__DESTINATION_BRANCHES = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Error Behavior Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_TRANSITION_FEATURE_COUNT = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.TransitionBranchImpl <em>Transition Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.TransitionBranchImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getTransitionBranch()
	 * @generated
	 */
	int TRANSITION_BRANCH = 27;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_BRANCH__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Target Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_BRANCH__TARGET_TOKEN = 1;

	/**
	 * The feature id for the '<em><b>Steady State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_BRANCH__STEADY_STATE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_BRANCH__VALUE = 3;

	/**
	 * The number of structural features of the '<em>Transition Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_BRANCH_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.BranchValueImpl <em>Branch Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.BranchValueImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getBranchValue()
	 * @generated
	 */
	int BRANCH_VALUE = 28;

	/**
	 * The feature id for the '<em><b>Realvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_VALUE__REALVALUE = 0;

	/**
	 * The feature id for the '<em><b>Others</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_VALUE__OTHERS = 1;

	/**
	 * The number of structural features of the '<em>Branch Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_VALUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.ConditionExpressionImpl <em>Condition Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.ConditionExpressionImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getConditionExpression()
	 * @generated
	 */
	int CONDITION_EXPRESSION = 29;

	/**
	 * The number of structural features of the '<em>Condition Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.OrmoreExpressionImpl <em>Ormore Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.OrmoreExpressionImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getOrmoreExpression()
	 * @generated
	 */
	int ORMORE_EXPRESSION = 30;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORMORE_EXPRESSION__COUNT = CONDITION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORMORE_EXPRESSION__OPERANDS = CONDITION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ormore Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORMORE_EXPRESSION_FEATURE_COUNT = CONDITION_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.OrlessExpressionImpl <em>Orless Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.OrlessExpressionImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getOrlessExpression()
	 * @generated
	 */
	int ORLESS_EXPRESSION = 31;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORLESS_EXPRESSION__COUNT = CONDITION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORLESS_EXPRESSION__OPERANDS = CONDITION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Orless Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORLESS_EXPRESSION_FEATURE_COUNT = CONDITION_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.EventOrPropagationImpl <em>Event Or Propagation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.EventOrPropagationImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getEventOrPropagation()
	 * @generated
	 */
	int EVENT_OR_PROPAGATION = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OR_PROPAGATION__NAME = Aadlv3Package.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Event Or Propagation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OR_PROPAGATION_FEATURE_COUNT = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.OutgoingPropagationConditionImpl <em>Outgoing Propagation Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.OutgoingPropagationConditionImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getOutgoingPropagationCondition()
	 * @generated
	 */
	int OUTGOING_PROPAGATION_CONDITION = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_PROPAGATION_CONDITION__NAME = Aadlv3Package.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_PROPAGATION_CONDITION__STATE = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Token Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_PROPAGATION_CONDITION__TYPE_TOKEN_CONSTRAINT = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>All States</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_PROPAGATION_CONDITION__ALL_STATES = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_PROPAGATION_CONDITION__CONDITION = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_PROPAGATION_CONDITION__OUTGOING = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>All Propagations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_PROPAGATION_CONDITION__ALL_PROPAGATIONS = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Type Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_PROPAGATION_CONDITION__TYPE_TOKEN = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Outgoing Propagation Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_PROPAGATION_CONDITION_FEATURE_COUNT = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.ErrorDetectionImpl <em>Error Detection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.ErrorDetectionImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getErrorDetection()
	 * @generated
	 */
	int ERROR_DETECTION = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_DETECTION__NAME = Aadlv3Package.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_DETECTION__STATE = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Token Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_DETECTION__TYPE_TOKEN_CONSTRAINT = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>All States</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_DETECTION__ALL_STATES = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_DETECTION__CONDITION = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Detection Reporting Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_DETECTION__DETECTION_REPORTING_PORT = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_DETECTION__ERROR_CODE = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Error Detection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_DETECTION_FEATURE_COUNT = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.ErrorCodeValueImpl <em>Error Code Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.ErrorCodeValueImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getErrorCodeValue()
	 * @generated
	 */
	int ERROR_CODE_VALUE = 35;

	/**
	 * The feature id for the '<em><b>Int Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_CODE_VALUE__INT_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Enum Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_CODE_VALUE__ENUM_LITERAL = 1;

	/**
	 * The number of structural features of the '<em>Error Code Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_CODE_VALUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.ErrorStateToModeMappingImpl <em>Error State To Mode Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.ErrorStateToModeMappingImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getErrorStateToModeMapping()
	 * @generated
	 */
	int ERROR_STATE_TO_MODE_MAPPING = 36;

	/**
	 * The feature id for the '<em><b>Error State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATE_TO_MODE_MAPPING__ERROR_STATE = 0;

	/**
	 * The feature id for the '<em><b>Type Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATE_TO_MODE_MAPPING__TYPE_TOKEN = 1;

	/**
	 * The feature id for the '<em><b>Mapped Modes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATE_TO_MODE_MAPPING__MAPPED_MODES = 2;

	/**
	 * The number of structural features of the '<em>Error State To Mode Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATE_TO_MODE_MAPPING_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.CompositeStateImpl <em>Composite State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.CompositeStateImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getCompositeState()
	 * @generated
	 */
	int COMPOSITE_STATE = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__NAME = Aadlv3Package.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__CONDITION = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Others</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__OTHERS = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__STATE = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Typed Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__TYPED_TOKEN = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Composite State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE_FEATURE_COUNT = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.QualifiedErrorBehaviorStateImpl <em>Qualified Error Behavior State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.QualifiedErrorBehaviorStateImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getQualifiedErrorBehaviorState()
	 * @generated
	 */
	int QUALIFIED_ERROR_BEHAVIOR_STATE = 38;

	/**
	 * The feature id for the '<em><b>Subcomponent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_ERROR_BEHAVIOR_STATE__SUBCOMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_ERROR_BEHAVIOR_STATE__NEXT = 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_ERROR_BEHAVIOR_STATE__STATE = 2;

	/**
	 * The number of structural features of the '<em>Qualified Error Behavior State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_ERROR_BEHAVIOR_STATE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.SubcomponentElementImpl <em>Subcomponent Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.SubcomponentElementImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getSubcomponentElement()
	 * @generated
	 */
	int SUBCOMPONENT_ELEMENT = 39;

	/**
	 * The feature id for the '<em><b>Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT_ELEMENT__SUBCOMPONENT = 0;

	/**
	 * The number of structural features of the '<em>Subcomponent Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.EMV2RootImpl <em>EMV2 Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.EMV2RootImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getEMV2Root()
	 * @generated
	 */
	int EMV2_ROOT = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMV2_ROOT__NAME = Aadlv3Package.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Library</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMV2_ROOT__LIBRARY = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subclauses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMV2_ROOT__SUBCLAUSES = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EMV2 Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMV2_ROOT_FEATURE_COUNT = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.OrExpressionImpl <em>Or Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.OrExpressionImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getOrExpression()
	 * @generated
	 */
	int OR_EXPRESSION = 41;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION__OPERANDS = CONDITION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Or Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION_FEATURE_COUNT = CONDITION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.AndExpressionImpl <em>And Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.AndExpressionImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getAndExpression()
	 * @generated
	 */
	int AND_EXPRESSION = 42;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION__OPERANDS = CONDITION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>And Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION_FEATURE_COUNT = CONDITION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.AllExpressionImpl <em>All Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.AllExpressionImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getAllExpression()
	 * @generated
	 */
	int ALL_EXPRESSION = 43;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_EXPRESSION__COUNT = CONDITION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_EXPRESSION__OPERANDS = CONDITION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>All Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_EXPRESSION_FEATURE_COUNT = CONDITION_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.ConditionElementImpl <em>Condition Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.ConditionElementImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getConditionElement()
	 * @generated
	 */
	int CONDITION_ELEMENT = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT__NAME = Aadlv3Package.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Condition Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT_FEATURE_COUNT = Aadlv3Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.emv3.emv3.impl.SConditionElementImpl <em>SCondition Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.emv3.emv3.impl.SConditionElementImpl
	 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getSConditionElement()
	 * @generated
	 */
	int SCONDITION_ELEMENT = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONDITION_ELEMENT__NAME = CONDITION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONDITION_ELEMENT__QUALIFIED_STATE = CONDITION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SCondition Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONDITION_ELEMENT_FEATURE_COUNT = CONDITION_ELEMENT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.ErrorModelSubclause <em>Error Model Subclause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Model Subclause</em>'.
	 * @see org.osate.emv3.emv3.ErrorModelSubclause
	 * @generated
	 */
	EClass getErrorModelSubclause();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.emv3.emv3.ErrorModelSubclause#getUseTypes <em>Use Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Use Types</em>'.
	 * @see org.osate.emv3.emv3.ErrorModelSubclause#getUseTypes()
	 * @see #getErrorModelSubclause()
	 * @generated
	 */
	EReference getErrorModelSubclause_UseTypes();

	/**
	 * Returns the meta object for the reference '{@link org.osate.emv3.emv3.ErrorModelSubclause#getTypeEquivalence <em>Type Equivalence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Equivalence</em>'.
	 * @see org.osate.emv3.emv3.ErrorModelSubclause#getTypeEquivalence()
	 * @see #getErrorModelSubclause()
	 * @generated
	 */
	EReference getErrorModelSubclause_TypeEquivalence();

	/**
	 * Returns the meta object for the reference '{@link org.osate.emv3.emv3.ErrorModelSubclause#getTypeMappingSet <em>Type Mapping Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Mapping Set</em>'.
	 * @see org.osate.emv3.emv3.ErrorModelSubclause#getTypeMappingSet()
	 * @see #getErrorModelSubclause()
	 * @generated
	 */
	EReference getErrorModelSubclause_TypeMappingSet();

	/**
	 * Returns the meta object for the reference '{@link org.osate.emv3.emv3.ErrorModelSubclause#getUseBehavior <em>Use Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Use Behavior</em>'.
	 * @see org.osate.emv3.emv3.ErrorModelSubclause#getUseBehavior()
	 * @see #getErrorModelSubclause()
	 * @generated
	 */
	EReference getErrorModelSubclause_UseBehavior();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.emv3.emv3.ErrorModelSubclause#getPropagations <em>Propagations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Propagations</em>'.
	 * @see org.osate.emv3.emv3.ErrorModelSubclause#getPropagations()
	 * @see #getErrorModelSubclause()
	 * @generated
	 */
	EReference getErrorModelSubclause_Propagations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.emv3.emv3.ErrorModelSubclause#getFlows <em>Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flows</em>'.
	 * @see org.osate.emv3.emv3.ErrorModelSubclause#getFlows()
	 * @see #getErrorModelSubclause()
	 * @generated
	 */
	EReference getErrorModelSubclause_Flows();

	/**
	 * Returns the meta object for the reference '{@link org.osate.emv3.emv3.ErrorModelSubclause#getUseTransformation <em>Use Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Use Transformation</em>'.
	 * @see org.osate.emv3.emv3.ErrorModelSubclause#getUseTransformation()
	 * @see #getErrorModelSubclause()
	 * @generated
	 */
	EReference getErrorModelSubclause_UseTransformation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.emv3.emv3.ErrorModelSubclause#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see org.osate.emv3.emv3.ErrorModelSubclause#getEvents()
	 * @see #getErrorModelSubclause()
	 * @generated
	 */
	EReference getErrorModelSubclause_Events();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.emv3.emv3.ErrorModelSubclause#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see org.osate.emv3.emv3.ErrorModelSubclause#getTransitions()
	 * @see #getErrorModelSubclause()
	 * @generated
	 */
	EReference getErrorModelSubclause_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.emv3.emv3.ErrorModelSubclause#getOutgoingPropagationConditions <em>Outgoing Propagation Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoing Propagation Conditions</em>'.
	 * @see org.osate.emv3.emv3.ErrorModelSubclause#getOutgoingPropagationConditions()
	 * @see #getErrorModelSubclause()
	 * @generated
	 */
	EReference getErrorModelSubclause_OutgoingPropagationConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.emv3.emv3.ErrorModelSubclause#getErrorDetections <em>Error Detections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Error Detections</em>'.
	 * @see org.osate.emv3.emv3.ErrorModelSubclause#getErrorDetections()
	 * @see #getErrorModelSubclause()
	 * @generated
	 */
	EReference getErrorModelSubclause_ErrorDetections();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.emv3.emv3.ErrorModelSubclause#getErrorStateToModeMappings <em>Error State To Mode Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Error State To Mode Mappings</em>'.
	 * @see org.osate.emv3.emv3.ErrorModelSubclause#getErrorStateToModeMappings()
	 * @see #getErrorModelSubclause()
	 * @generated
	 */
	EReference getErrorModelSubclause_ErrorStateToModeMappings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.emv3.emv3.ErrorModelSubclause#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see org.osate.emv3.emv3.ErrorModelSubclause#getStates()
	 * @see #getErrorModelSubclause()
	 * @generated
	 */
	EReference getErrorModelSubclause_States();

	/**
	 * Returns the meta object for the reference '{@link org.osate.emv3.emv3.ErrorModelSubclause#getTypeTransformationSet <em>Type Transformation Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Transformation Set</em>'.
	 * @see org.osate.emv3.emv3.ErrorModelSubclause#getTypeTransformationSet()
	 * @see #getErrorModelSubclause()
	 * @generated
	 */
	EReference getErrorModelSubclause_TypeTransformationSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.emv3.emv3.ErrorModelSubclause#getConnectionErrorSources <em>Connection Error Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection Error Sources</em>'.
	 * @see org.osate.emv3.emv3.ErrorModelSubclause#getConnectionErrorSources()
	 * @see #getErrorModelSubclause()
	 * @generated
	 */
	EReference getErrorModelSubclause_ConnectionErrorSources();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.emv3.emv3.ErrorModelSubclause#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Points</em>'.
	 * @see org.osate.emv3.emv3.ErrorModelSubclause#getPoints()
	 * @see #getErrorModelSubclause()
	 * @generated
	 */
	EReference getErrorModelSubclause_Points();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.emv3.emv3.ErrorModelSubclause#getPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paths</em>'.
	 * @see org.osate.emv3.emv3.ErrorModelSubclause#getPaths()
	 * @see #getErrorModelSubclause()
	 * @generated
	 */
	EReference getErrorModelSubclause_Paths();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.ErrorModelLibrary <em>Error Model Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Model Library</em>'.
	 * @see org.osate.emv3.emv3.ErrorModelLibrary
	 * @generated
	 */
	EClass getErrorModelLibrary();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.emv3.emv3.ErrorModelLibrary#getUseTypes <em>Use Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Use Types</em>'.
	 * @see org.osate.emv3.emv3.ErrorModelLibrary#getUseTypes()
	 * @see #getErrorModelLibrary()
	 * @generated
	 */
	EReference getErrorModelLibrary_UseTypes();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.emv3.emv3.ErrorModelLibrary#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extends</em>'.
	 * @see org.osate.emv3.emv3.ErrorModelLibrary#getExtends()
	 * @see #getErrorModelLibrary()
	 * @generated
	 */
	EReference getErrorModelLibrary_Extends();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.emv3.emv3.ErrorModelLibrary#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see org.osate.emv3.emv3.ErrorModelLibrary#getTypes()
	 * @see #getErrorModelLibrary()
	 * @generated
	 */
	EReference getErrorModelLibrary_Types();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.emv3.emv3.ErrorModelLibrary#getTypesets <em>Typesets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Typesets</em>'.
	 * @see org.osate.emv3.emv3.ErrorModelLibrary#getTypesets()
	 * @see #getErrorModelLibrary()
	 * @generated
	 */
	EReference getErrorModelLibrary_Typesets();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.emv3.emv3.ErrorModelLibrary#getBehaviors <em>Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviors</em>'.
	 * @see org.osate.emv3.emv3.ErrorModelLibrary#getBehaviors()
	 * @see #getErrorModelLibrary()
	 * @generated
	 */
	EReference getErrorModelLibrary_Behaviors();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.emv3.emv3.ErrorModelLibrary#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see org.osate.emv3.emv3.ErrorModelLibrary#getMappings()
	 * @see #getErrorModelLibrary()
	 * @generated
	 */
	EReference getErrorModelLibrary_Mappings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.emv3.emv3.ErrorModelLibrary#getTransformations <em>Transformations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformations</em>'.
	 * @see org.osate.emv3.emv3.ErrorModelLibrary#getTransformations()
	 * @see #getErrorModelLibrary()
	 * @generated
	 */
	EReference getErrorModelLibrary_Transformations();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.ErrorTypes <em>Error Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Types</em>'.
	 * @see org.osate.emv3.emv3.ErrorTypes
	 * @generated
	 */
	EClass getErrorTypes();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.ErrorType <em>Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Type</em>'.
	 * @see org.osate.emv3.emv3.ErrorType
	 * @generated
	 */
	EClass getErrorType();

	/**
	 * Returns the meta object for the reference '{@link org.osate.emv3.emv3.ErrorType#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Type</em>'.
	 * @see org.osate.emv3.emv3.ErrorType#getSuperType()
	 * @see #getErrorType()
	 * @generated
	 */
	EReference getErrorType_SuperType();

	/**
	 * Returns the meta object for the reference '{@link org.osate.emv3.emv3.ErrorType#getAliasedType <em>Aliased Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aliased Type</em>'.
	 * @see org.osate.emv3.emv3.ErrorType#getAliasedType()
	 * @see #getErrorType()
	 * @generated
	 */
	EReference getErrorType_AliasedType();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.TypeSet <em>Type Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Set</em>'.
	 * @see org.osate.emv3.emv3.TypeSet
	 * @generated
	 */
	EClass getTypeSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.emv3.emv3.TypeSet#getTypeTokens <em>Type Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Tokens</em>'.
	 * @see org.osate.emv3.emv3.TypeSet#getTypeTokens()
	 * @see #getTypeSet()
	 * @generated
	 */
	EReference getTypeSet_TypeTokens();

	/**
	 * Returns the meta object for the reference '{@link org.osate.emv3.emv3.TypeSet#getAliasedType <em>Aliased Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aliased Type</em>'.
	 * @see org.osate.emv3.emv3.TypeSet#getAliasedType()
	 * @see #getTypeSet()
	 * @generated
	 */
	EReference getTypeSet_AliasedType();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.TypeToken <em>Type Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Token</em>'.
	 * @see org.osate.emv3.emv3.TypeToken
	 * @generated
	 */
	EClass getTypeToken();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.emv3.emv3.TypeToken#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type</em>'.
	 * @see org.osate.emv3.emv3.TypeToken#getType()
	 * @see #getTypeToken()
	 * @generated
	 */
	EReference getTypeToken_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.emv3.emv3.TypeToken#isNoError <em>No Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Error</em>'.
	 * @see org.osate.emv3.emv3.TypeToken#isNoError()
	 * @see #getTypeToken()
	 * @generated
	 */
	EAttribute getTypeToken_NoError();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.TypeTransformationSet <em>Type Transformation Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Transformation Set</em>'.
	 * @see org.osate.emv3.emv3.TypeTransformationSet
	 * @generated
	 */
	EClass getTypeTransformationSet();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.emv3.emv3.TypeTransformationSet#getUseTypes <em>Use Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Use Types</em>'.
	 * @see org.osate.emv3.emv3.TypeTransformationSet#getUseTypes()
	 * @see #getTypeTransformationSet()
	 * @generated
	 */
	EReference getTypeTransformationSet_UseTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.emv3.emv3.TypeTransformationSet#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformation</em>'.
	 * @see org.osate.emv3.emv3.TypeTransformationSet#getTransformation()
	 * @see #getTypeTransformationSet()
	 * @generated
	 */
	EReference getTypeTransformationSet_Transformation();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.TypeTransformation <em>Type Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Transformation</em>'.
	 * @see org.osate.emv3.emv3.TypeTransformation
	 * @generated
	 */
	EClass getTypeTransformation();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.emv3.emv3.TypeTransformation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.osate.emv3.emv3.TypeTransformation#getSource()
	 * @see #getTypeTransformation()
	 * @generated
	 */
	EReference getTypeTransformation_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.emv3.emv3.TypeTransformation#isAllSources <em>All Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All Sources</em>'.
	 * @see org.osate.emv3.emv3.TypeTransformation#isAllSources()
	 * @see #getTypeTransformation()
	 * @generated
	 */
	EAttribute getTypeTransformation_AllSources();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.emv3.emv3.TypeTransformation#getContributor <em>Contributor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contributor</em>'.
	 * @see org.osate.emv3.emv3.TypeTransformation#getContributor()
	 * @see #getTypeTransformation()
	 * @generated
	 */
	EReference getTypeTransformation_Contributor();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.emv3.emv3.TypeTransformation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.osate.emv3.emv3.TypeTransformation#getTarget()
	 * @see #getTypeTransformation()
	 * @generated
	 */
	EReference getTypeTransformation_Target();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.TypeMappingSet <em>Type Mapping Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Mapping Set</em>'.
	 * @see org.osate.emv3.emv3.TypeMappingSet
	 * @generated
	 */
	EClass getTypeMappingSet();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.emv3.emv3.TypeMappingSet#getUseTypes <em>Use Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Use Types</em>'.
	 * @see org.osate.emv3.emv3.TypeMappingSet#getUseTypes()
	 * @see #getTypeMappingSet()
	 * @generated
	 */
	EReference getTypeMappingSet_UseTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.emv3.emv3.TypeMappingSet#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mapping</em>'.
	 * @see org.osate.emv3.emv3.TypeMappingSet#getMapping()
	 * @see #getTypeMappingSet()
	 * @generated
	 */
	EReference getTypeMappingSet_Mapping();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.TypeMapping <em>Type Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Mapping</em>'.
	 * @see org.osate.emv3.emv3.TypeMapping
	 * @generated
	 */
	EClass getTypeMapping();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.emv3.emv3.TypeMapping#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.osate.emv3.emv3.TypeMapping#getSource()
	 * @see #getTypeMapping()
	 * @generated
	 */
	EReference getTypeMapping_Source();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.emv3.emv3.TypeMapping#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.osate.emv3.emv3.TypeMapping#getTarget()
	 * @see #getTypeMapping()
	 * @generated
	 */
	EReference getTypeMapping_Target();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.ErrorPropagation <em>Error Propagation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Propagation</em>'.
	 * @see org.osate.emv3.emv3.ErrorPropagation
	 * @generated
	 */
	EClass getErrorPropagation();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.emv3.emv3.ErrorPropagation#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.osate.emv3.emv3.ErrorPropagation#getKind()
	 * @see #getErrorPropagation()
	 * @generated
	 */
	EAttribute getErrorPropagation_Kind();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.emv3.emv3.ErrorPropagation#getFeatureorPPRef <em>Featureor PP Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Featureor PP Ref</em>'.
	 * @see org.osate.emv3.emv3.ErrorPropagation#getFeatureorPPRef()
	 * @see #getErrorPropagation()
	 * @generated
	 */
	EReference getErrorPropagation_FeatureorPPRef();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.emv3.emv3.ErrorPropagation#isNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not</em>'.
	 * @see org.osate.emv3.emv3.ErrorPropagation#isNot()
	 * @see #getErrorPropagation()
	 * @generated
	 */
	EAttribute getErrorPropagation_Not();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.emv3.emv3.ErrorPropagation#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.osate.emv3.emv3.ErrorPropagation#getDirection()
	 * @see #getErrorPropagation()
	 * @generated
	 */
	EAttribute getErrorPropagation_Direction();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.emv3.emv3.ErrorPropagation#getTypeSet <em>Type Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Set</em>'.
	 * @see org.osate.emv3.emv3.ErrorPropagation#getTypeSet()
	 * @see #getErrorPropagation()
	 * @generated
	 */
	EReference getErrorPropagation_TypeSet();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.FeatureorPPReference <em>Featureor PP Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Featureor PP Reference</em>'.
	 * @see org.osate.emv3.emv3.FeatureorPPReference
	 * @generated
	 */
	EClass getFeatureorPPReference();

	/**
	 * Returns the meta object for the reference '{@link org.osate.emv3.emv3.FeatureorPPReference#getFeatureorPP <em>Featureor PP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Featureor PP</em>'.
	 * @see org.osate.emv3.emv3.FeatureorPPReference#getFeatureorPP()
	 * @see #getFeatureorPPReference()
	 * @generated
	 */
	EReference getFeatureorPPReference_FeatureorPP();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.emv3.emv3.FeatureorPPReference#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next</em>'.
	 * @see org.osate.emv3.emv3.FeatureorPPReference#getNext()
	 * @see #getFeatureorPPReference()
	 * @generated
	 */
	EReference getFeatureorPPReference_Next();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.ErrorFlow <em>Error Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Flow</em>'.
	 * @see org.osate.emv3.emv3.ErrorFlow
	 * @generated
	 */
	EClass getErrorFlow();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.emv3.emv3.ErrorFlow#getTypeTokenConstraint <em>Type Token Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Token Constraint</em>'.
	 * @see org.osate.emv3.emv3.ErrorFlow#getTypeTokenConstraint()
	 * @see #getErrorFlow()
	 * @generated
	 */
	EReference getErrorFlow_TypeTokenConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.emv3.emv3.ErrorFlow#getFlowcondition <em>Flowcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flowcondition</em>'.
	 * @see org.osate.emv3.emv3.ErrorFlow#getFlowcondition()
	 * @see #getErrorFlow()
	 * @generated
	 */
	EReference getErrorFlow_Flowcondition();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.ErrorSource <em>Error Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Source</em>'.
	 * @see org.osate.emv3.emv3.ErrorSource
	 * @generated
	 */
	EClass getErrorSource();

	/**
	 * Returns the meta object for the reference '{@link org.osate.emv3.emv3.ErrorSource#getSourceModelElement <em>Source Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Model Element</em>'.
	 * @see org.osate.emv3.emv3.ErrorSource#getSourceModelElement()
	 * @see #getErrorSource()
	 * @generated
	 */
	EReference getErrorSource_SourceModelElement();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.emv3.emv3.ErrorSource#isAll <em>All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All</em>'.
	 * @see org.osate.emv3.emv3.ErrorSource#isAll()
	 * @see #getErrorSource()
	 * @generated
	 */
	EAttribute getErrorSource_All();

	/**
	 * Returns the meta object for the reference '{@link org.osate.emv3.emv3.ErrorSource#getFailureModeReference <em>Failure Mode Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Failure Mode Reference</em>'.
	 * @see org.osate.emv3.emv3.ErrorSource#getFailureModeReference()
	 * @see #getErrorSource()
	 * @generated
	 */
	EReference getErrorSource_FailureModeReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.emv3.emv3.ErrorSource#getFailureModeType <em>Failure Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Failure Mode Type</em>'.
	 * @see org.osate.emv3.emv3.ErrorSource#getFailureModeType()
	 * @see #getErrorSource()
	 * @generated
	 */
	EReference getErrorSource_FailureModeType();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.emv3.emv3.ErrorSource#getFailureModeDescription <em>Failure Mode Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failure Mode Description</em>'.
	 * @see org.osate.emv3.emv3.ErrorSource#getFailureModeDescription()
	 * @see #getErrorSource()
	 * @generated
	 */
	EAttribute getErrorSource_FailureModeDescription();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.ErrorSink <em>Error Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Sink</em>'.
	 * @see org.osate.emv3.emv3.ErrorSink
	 * @generated
	 */
	EClass getErrorSink();

	/**
	 * Returns the meta object for the reference '{@link org.osate.emv3.emv3.ErrorSink#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Incoming</em>'.
	 * @see org.osate.emv3.emv3.ErrorSink#getIncoming()
	 * @see #getErrorSink()
	 * @generated
	 */
	EReference getErrorSink_Incoming();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.emv3.emv3.ErrorSink#isAllIncoming <em>All Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All Incoming</em>'.
	 * @see org.osate.emv3.emv3.ErrorSink#isAllIncoming()
	 * @see #getErrorSink()
	 * @generated
	 */
	EAttribute getErrorSink_AllIncoming();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.ErrorPath <em>Error Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Path</em>'.
	 * @see org.osate.emv3.emv3.ErrorPath
	 * @generated
	 */
	EClass getErrorPath();

	/**
	 * Returns the meta object for the reference '{@link org.osate.emv3.emv3.ErrorPath#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Incoming</em>'.
	 * @see org.osate.emv3.emv3.ErrorPath#getIncoming()
	 * @see #getErrorPath()
	 * @generated
	 */
	EReference getErrorPath_Incoming();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.emv3.emv3.ErrorPath#isAllIncoming <em>All Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All Incoming</em>'.
	 * @see org.osate.emv3.emv3.ErrorPath#isAllIncoming()
	 * @see #getErrorPath()
	 * @generated
	 */
	EAttribute getErrorPath_AllIncoming();

	/**
	 * Returns the meta object for the reference '{@link org.osate.emv3.emv3.ErrorPath#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outgoing</em>'.
	 * @see org.osate.emv3.emv3.ErrorPath#getOutgoing()
	 * @see #getErrorPath()
	 * @generated
	 */
	EReference getErrorPath_Outgoing();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.emv3.emv3.ErrorPath#isAllOutgoing <em>All Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All Outgoing</em>'.
	 * @see org.osate.emv3.emv3.ErrorPath#isAllOutgoing()
	 * @see #getErrorPath()
	 * @generated
	 */
	EAttribute getErrorPath_AllOutgoing();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.emv3.emv3.ErrorPath#getTargetToken <em>Target Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Token</em>'.
	 * @see org.osate.emv3.emv3.ErrorPath#getTargetToken()
	 * @see #getErrorPath()
	 * @generated
	 */
	EReference getErrorPath_TargetToken();

	/**
	 * Returns the meta object for the reference '{@link org.osate.emv3.emv3.ErrorPath#getTypeMappingSet <em>Type Mapping Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Mapping Set</em>'.
	 * @see org.osate.emv3.emv3.ErrorPath#getTypeMappingSet()
	 * @see #getErrorPath()
	 * @generated
	 */
	EReference getErrorPath_TypeMappingSet();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.IfCondition <em>If Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Condition</em>'.
	 * @see org.osate.emv3.emv3.IfCondition
	 * @generated
	 */
	EClass getIfCondition();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.emv3.emv3.IfCondition#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.osate.emv3.emv3.IfCondition#getDescription()
	 * @see #getIfCondition()
	 * @generated
	 */
	EAttribute getIfCondition_Description();

	/**
	 * Returns the meta object for the reference '{@link org.osate.emv3.emv3.IfCondition#getResoluteFunction <em>Resolute Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resolute Function</em>'.
	 * @see org.osate.emv3.emv3.IfCondition#getResoluteFunction()
	 * @see #getIfCondition()
	 * @generated
	 */
	EReference getIfCondition_ResoluteFunction();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.emv3.emv3.IfCondition#getJavaMethod <em>Java Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Java Method</em>'.
	 * @see org.osate.emv3.emv3.IfCondition#getJavaMethod()
	 * @see #getIfCondition()
	 * @generated
	 */
	EAttribute getIfCondition_JavaMethod();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.PropagationPoint <em>Propagation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagation Point</em>'.
	 * @see org.osate.emv3.emv3.PropagationPoint
	 * @generated
	 */
	EClass getPropagationPoint();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.PropagationPath <em>Propagation Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagation Path</em>'.
	 * @see org.osate.emv3.emv3.PropagationPath
	 * @generated
	 */
	EClass getPropagationPath();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.emv3.emv3.PropagationPath#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.osate.emv3.emv3.PropagationPath#getSource()
	 * @see #getPropagationPath()
	 * @generated
	 */
	EReference getPropagationPath_Source();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.emv3.emv3.PropagationPath#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.osate.emv3.emv3.PropagationPath#getTarget()
	 * @see #getPropagationPath()
	 * @generated
	 */
	EReference getPropagationPath_Target();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.QualifiedPropagationPoint <em>Qualified Propagation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualified Propagation Point</em>'.
	 * @see org.osate.emv3.emv3.QualifiedPropagationPoint
	 * @generated
	 */
	EClass getQualifiedPropagationPoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.emv3.emv3.QualifiedPropagationPoint#getSubcomponent <em>Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subcomponent</em>'.
	 * @see org.osate.emv3.emv3.QualifiedPropagationPoint#getSubcomponent()
	 * @see #getQualifiedPropagationPoint()
	 * @generated
	 */
	EReference getQualifiedPropagationPoint_Subcomponent();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.emv3.emv3.QualifiedPropagationPoint#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next</em>'.
	 * @see org.osate.emv3.emv3.QualifiedPropagationPoint#getNext()
	 * @see #getQualifiedPropagationPoint()
	 * @generated
	 */
	EReference getQualifiedPropagationPoint_Next();

	/**
	 * Returns the meta object for the reference '{@link org.osate.emv3.emv3.QualifiedPropagationPoint#getPropagationPoint <em>Propagation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Propagation Point</em>'.
	 * @see org.osate.emv3.emv3.QualifiedPropagationPoint#getPropagationPoint()
	 * @see #getQualifiedPropagationPoint()
	 * @generated
	 */
	EReference getQualifiedPropagationPoint_PropagationPoint();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.ErrorBehaviorStateMachine <em>Error Behavior State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Behavior State Machine</em>'.
	 * @see org.osate.emv3.emv3.ErrorBehaviorStateMachine
	 * @generated
	 */
	EClass getErrorBehaviorStateMachine();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.emv3.emv3.ErrorBehaviorStateMachine#getUseTypes <em>Use Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Use Types</em>'.
	 * @see org.osate.emv3.emv3.ErrorBehaviorStateMachine#getUseTypes()
	 * @see #getErrorBehaviorStateMachine()
	 * @generated
	 */
	EReference getErrorBehaviorStateMachine_UseTypes();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.emv3.emv3.ErrorBehaviorStateMachine#getUseTransformation <em>Use Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Use Transformation</em>'.
	 * @see org.osate.emv3.emv3.ErrorBehaviorStateMachine#getUseTransformation()
	 * @see #getErrorBehaviorStateMachine()
	 * @generated
	 */
	EReference getErrorBehaviorStateMachine_UseTransformation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.emv3.emv3.ErrorBehaviorStateMachine#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see org.osate.emv3.emv3.ErrorBehaviorStateMachine#getEvents()
	 * @see #getErrorBehaviorStateMachine()
	 * @generated
	 */
	EReference getErrorBehaviorStateMachine_Events();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.emv3.emv3.ErrorBehaviorStateMachine#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see org.osate.emv3.emv3.ErrorBehaviorStateMachine#getStates()
	 * @see #getErrorBehaviorStateMachine()
	 * @generated
	 */
	EReference getErrorBehaviorStateMachine_States();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.emv3.emv3.ErrorBehaviorStateMachine#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see org.osate.emv3.emv3.ErrorBehaviorStateMachine#getTransitions()
	 * @see #getErrorBehaviorStateMachine()
	 * @generated
	 */
	EReference getErrorBehaviorStateMachine_Transitions();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.ErrorBehaviorEvent <em>Error Behavior Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Behavior Event</em>'.
	 * @see org.osate.emv3.emv3.ErrorBehaviorEvent
	 * @generated
	 */
	EClass getErrorBehaviorEvent();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.ErrorEvent <em>Error Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Event</em>'.
	 * @see org.osate.emv3.emv3.ErrorEvent
	 * @generated
	 */
	EClass getErrorEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.emv3.emv3.ErrorEvent#getTypeSet <em>Type Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Set</em>'.
	 * @see org.osate.emv3.emv3.ErrorEvent#getTypeSet()
	 * @see #getErrorEvent()
	 * @generated
	 */
	EReference getErrorEvent_TypeSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.emv3.emv3.ErrorEvent#getEventcondition <em>Eventcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eventcondition</em>'.
	 * @see org.osate.emv3.emv3.ErrorEvent#getEventcondition()
	 * @see #getErrorEvent()
	 * @generated
	 */
	EReference getErrorEvent_Eventcondition();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.RepairEvent <em>Repair Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repair Event</em>'.
	 * @see org.osate.emv3.emv3.RepairEvent
	 * @generated
	 */
	EClass getRepairEvent();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.emv3.emv3.RepairEvent#getEventInitiator <em>Event Initiator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Event Initiator</em>'.
	 * @see org.osate.emv3.emv3.RepairEvent#getEventInitiator()
	 * @see #getRepairEvent()
	 * @generated
	 */
	EReference getRepairEvent_EventInitiator();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.RecoverEvent <em>Recover Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recover Event</em>'.
	 * @see org.osate.emv3.emv3.RecoverEvent
	 * @generated
	 */
	EClass getRecoverEvent();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.emv3.emv3.RecoverEvent#getEventInitiator <em>Event Initiator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Event Initiator</em>'.
	 * @see org.osate.emv3.emv3.RecoverEvent#getEventInitiator()
	 * @see #getRecoverEvent()
	 * @generated
	 */
	EReference getRecoverEvent_EventInitiator();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.emv3.emv3.RecoverEvent#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.osate.emv3.emv3.RecoverEvent#getCondition()
	 * @see #getRecoverEvent()
	 * @generated
	 */
	EReference getRecoverEvent_Condition();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.ErrorBehaviorState <em>Error Behavior State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Behavior State</em>'.
	 * @see org.osate.emv3.emv3.ErrorBehaviorState
	 * @generated
	 */
	EClass getErrorBehaviorState();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.emv3.emv3.ErrorBehaviorState#isIntial <em>Intial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intial</em>'.
	 * @see org.osate.emv3.emv3.ErrorBehaviorState#isIntial()
	 * @see #getErrorBehaviorState()
	 * @generated
	 */
	EAttribute getErrorBehaviorState_Intial();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.emv3.emv3.ErrorBehaviorState#getTypeSet <em>Type Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Set</em>'.
	 * @see org.osate.emv3.emv3.ErrorBehaviorState#getTypeSet()
	 * @see #getErrorBehaviorState()
	 * @generated
	 */
	EReference getErrorBehaviorState_TypeSet();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.ErrorBehaviorTransition <em>Error Behavior Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Behavior Transition</em>'.
	 * @see org.osate.emv3.emv3.ErrorBehaviorTransition
	 * @generated
	 */
	EClass getErrorBehaviorTransition();

	/**
	 * Returns the meta object for the reference '{@link org.osate.emv3.emv3.ErrorBehaviorTransition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.osate.emv3.emv3.ErrorBehaviorTransition#getSource()
	 * @see #getErrorBehaviorTransition()
	 * @generated
	 */
	EReference getErrorBehaviorTransition_Source();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.emv3.emv3.ErrorBehaviorTransition#getTypeTokenConstraint <em>Type Token Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Token Constraint</em>'.
	 * @see org.osate.emv3.emv3.ErrorBehaviorTransition#getTypeTokenConstraint()
	 * @see #getErrorBehaviorTransition()
	 * @generated
	 */
	EReference getErrorBehaviorTransition_TypeTokenConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.emv3.emv3.ErrorBehaviorTransition#isAllStates <em>All States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All States</em>'.
	 * @see org.osate.emv3.emv3.ErrorBehaviorTransition#isAllStates()
	 * @see #getErrorBehaviorTransition()
	 * @generated
	 */
	EAttribute getErrorBehaviorTransition_AllStates();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.emv3.emv3.ErrorBehaviorTransition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.osate.emv3.emv3.ErrorBehaviorTransition#getCondition()
	 * @see #getErrorBehaviorTransition()
	 * @generated
	 */
	EReference getErrorBehaviorTransition_Condition();

	/**
	 * Returns the meta object for the reference '{@link org.osate.emv3.emv3.ErrorBehaviorTransition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.osate.emv3.emv3.ErrorBehaviorTransition#getTarget()
	 * @see #getErrorBehaviorTransition()
	 * @generated
	 */
	EReference getErrorBehaviorTransition_Target();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.emv3.emv3.ErrorBehaviorTransition#getTargetToken <em>Target Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Token</em>'.
	 * @see org.osate.emv3.emv3.ErrorBehaviorTransition#getTargetToken()
	 * @see #getErrorBehaviorTransition()
	 * @generated
	 */
	EReference getErrorBehaviorTransition_TargetToken();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.emv3.emv3.ErrorBehaviorTransition#isSteadyState <em>Steady State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Steady State</em>'.
	 * @see org.osate.emv3.emv3.ErrorBehaviorTransition#isSteadyState()
	 * @see #getErrorBehaviorTransition()
	 * @generated
	 */
	EAttribute getErrorBehaviorTransition_SteadyState();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.emv3.emv3.ErrorBehaviorTransition#getDestinationBranches <em>Destination Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Destination Branches</em>'.
	 * @see org.osate.emv3.emv3.ErrorBehaviorTransition#getDestinationBranches()
	 * @see #getErrorBehaviorTransition()
	 * @generated
	 */
	EReference getErrorBehaviorTransition_DestinationBranches();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.TransitionBranch <em>Transition Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Branch</em>'.
	 * @see org.osate.emv3.emv3.TransitionBranch
	 * @generated
	 */
	EClass getTransitionBranch();

	/**
	 * Returns the meta object for the reference '{@link org.osate.emv3.emv3.TransitionBranch#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.osate.emv3.emv3.TransitionBranch#getTarget()
	 * @see #getTransitionBranch()
	 * @generated
	 */
	EReference getTransitionBranch_Target();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.emv3.emv3.TransitionBranch#getTargetToken <em>Target Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Token</em>'.
	 * @see org.osate.emv3.emv3.TransitionBranch#getTargetToken()
	 * @see #getTransitionBranch()
	 * @generated
	 */
	EReference getTransitionBranch_TargetToken();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.emv3.emv3.TransitionBranch#isSteadyState <em>Steady State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Steady State</em>'.
	 * @see org.osate.emv3.emv3.TransitionBranch#isSteadyState()
	 * @see #getTransitionBranch()
	 * @generated
	 */
	EAttribute getTransitionBranch_SteadyState();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.emv3.emv3.TransitionBranch#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.osate.emv3.emv3.TransitionBranch#getValue()
	 * @see #getTransitionBranch()
	 * @generated
	 */
	EReference getTransitionBranch_Value();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.BranchValue <em>Branch Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch Value</em>'.
	 * @see org.osate.emv3.emv3.BranchValue
	 * @generated
	 */
	EClass getBranchValue();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.emv3.emv3.BranchValue#getRealvalue <em>Realvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Realvalue</em>'.
	 * @see org.osate.emv3.emv3.BranchValue#getRealvalue()
	 * @see #getBranchValue()
	 * @generated
	 */
	EAttribute getBranchValue_Realvalue();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.emv3.emv3.BranchValue#isOthers <em>Others</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Others</em>'.
	 * @see org.osate.emv3.emv3.BranchValue#isOthers()
	 * @see #getBranchValue()
	 * @generated
	 */
	EAttribute getBranchValue_Others();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.ConditionExpression <em>Condition Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Expression</em>'.
	 * @see org.osate.emv3.emv3.ConditionExpression
	 * @generated
	 */
	EClass getConditionExpression();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.OrmoreExpression <em>Ormore Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ormore Expression</em>'.
	 * @see org.osate.emv3.emv3.OrmoreExpression
	 * @generated
	 */
	EClass getOrmoreExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.emv3.emv3.OrmoreExpression#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see org.osate.emv3.emv3.OrmoreExpression#getCount()
	 * @see #getOrmoreExpression()
	 * @generated
	 */
	EAttribute getOrmoreExpression_Count();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.emv3.emv3.OrmoreExpression#getOperands <em>Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operands</em>'.
	 * @see org.osate.emv3.emv3.OrmoreExpression#getOperands()
	 * @see #getOrmoreExpression()
	 * @generated
	 */
	EReference getOrmoreExpression_Operands();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.OrlessExpression <em>Orless Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orless Expression</em>'.
	 * @see org.osate.emv3.emv3.OrlessExpression
	 * @generated
	 */
	EClass getOrlessExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.emv3.emv3.OrlessExpression#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see org.osate.emv3.emv3.OrlessExpression#getCount()
	 * @see #getOrlessExpression()
	 * @generated
	 */
	EAttribute getOrlessExpression_Count();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.emv3.emv3.OrlessExpression#getOperands <em>Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operands</em>'.
	 * @see org.osate.emv3.emv3.OrlessExpression#getOperands()
	 * @see #getOrlessExpression()
	 * @generated
	 */
	EReference getOrlessExpression_Operands();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.EventOrPropagation <em>Event Or Propagation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Or Propagation</em>'.
	 * @see org.osate.emv3.emv3.EventOrPropagation
	 * @generated
	 */
	EClass getEventOrPropagation();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.OutgoingPropagationCondition <em>Outgoing Propagation Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outgoing Propagation Condition</em>'.
	 * @see org.osate.emv3.emv3.OutgoingPropagationCondition
	 * @generated
	 */
	EClass getOutgoingPropagationCondition();

	/**
	 * Returns the meta object for the reference '{@link org.osate.emv3.emv3.OutgoingPropagationCondition#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see org.osate.emv3.emv3.OutgoingPropagationCondition#getState()
	 * @see #getOutgoingPropagationCondition()
	 * @generated
	 */
	EReference getOutgoingPropagationCondition_State();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.emv3.emv3.OutgoingPropagationCondition#getTypeTokenConstraint <em>Type Token Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Token Constraint</em>'.
	 * @see org.osate.emv3.emv3.OutgoingPropagationCondition#getTypeTokenConstraint()
	 * @see #getOutgoingPropagationCondition()
	 * @generated
	 */
	EReference getOutgoingPropagationCondition_TypeTokenConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.emv3.emv3.OutgoingPropagationCondition#isAllStates <em>All States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All States</em>'.
	 * @see org.osate.emv3.emv3.OutgoingPropagationCondition#isAllStates()
	 * @see #getOutgoingPropagationCondition()
	 * @generated
	 */
	EAttribute getOutgoingPropagationCondition_AllStates();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.emv3.emv3.OutgoingPropagationCondition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.osate.emv3.emv3.OutgoingPropagationCondition#getCondition()
	 * @see #getOutgoingPropagationCondition()
	 * @generated
	 */
	EReference getOutgoingPropagationCondition_Condition();

	/**
	 * Returns the meta object for the reference '{@link org.osate.emv3.emv3.OutgoingPropagationCondition#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outgoing</em>'.
	 * @see org.osate.emv3.emv3.OutgoingPropagationCondition#getOutgoing()
	 * @see #getOutgoingPropagationCondition()
	 * @generated
	 */
	EReference getOutgoingPropagationCondition_Outgoing();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.emv3.emv3.OutgoingPropagationCondition#isAllPropagations <em>All Propagations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All Propagations</em>'.
	 * @see org.osate.emv3.emv3.OutgoingPropagationCondition#isAllPropagations()
	 * @see #getOutgoingPropagationCondition()
	 * @generated
	 */
	EAttribute getOutgoingPropagationCondition_AllPropagations();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.emv3.emv3.OutgoingPropagationCondition#getTypeToken <em>Type Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Token</em>'.
	 * @see org.osate.emv3.emv3.OutgoingPropagationCondition#getTypeToken()
	 * @see #getOutgoingPropagationCondition()
	 * @generated
	 */
	EReference getOutgoingPropagationCondition_TypeToken();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.ErrorDetection <em>Error Detection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Detection</em>'.
	 * @see org.osate.emv3.emv3.ErrorDetection
	 * @generated
	 */
	EClass getErrorDetection();

	/**
	 * Returns the meta object for the reference '{@link org.osate.emv3.emv3.ErrorDetection#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see org.osate.emv3.emv3.ErrorDetection#getState()
	 * @see #getErrorDetection()
	 * @generated
	 */
	EReference getErrorDetection_State();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.emv3.emv3.ErrorDetection#getTypeTokenConstraint <em>Type Token Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Token Constraint</em>'.
	 * @see org.osate.emv3.emv3.ErrorDetection#getTypeTokenConstraint()
	 * @see #getErrorDetection()
	 * @generated
	 */
	EReference getErrorDetection_TypeTokenConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.emv3.emv3.ErrorDetection#isAllStates <em>All States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All States</em>'.
	 * @see org.osate.emv3.emv3.ErrorDetection#isAllStates()
	 * @see #getErrorDetection()
	 * @generated
	 */
	EAttribute getErrorDetection_AllStates();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.emv3.emv3.ErrorDetection#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.osate.emv3.emv3.ErrorDetection#getCondition()
	 * @see #getErrorDetection()
	 * @generated
	 */
	EReference getErrorDetection_Condition();

	/**
	 * Returns the meta object for the reference '{@link org.osate.emv3.emv3.ErrorDetection#getDetectionReportingPort <em>Detection Reporting Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Detection Reporting Port</em>'.
	 * @see org.osate.emv3.emv3.ErrorDetection#getDetectionReportingPort()
	 * @see #getErrorDetection()
	 * @generated
	 */
	EReference getErrorDetection_DetectionReportingPort();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.emv3.emv3.ErrorDetection#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error Code</em>'.
	 * @see org.osate.emv3.emv3.ErrorDetection#getErrorCode()
	 * @see #getErrorDetection()
	 * @generated
	 */
	EReference getErrorDetection_ErrorCode();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.ErrorCodeValue <em>Error Code Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Code Value</em>'.
	 * @see org.osate.emv3.emv3.ErrorCodeValue
	 * @generated
	 */
	EClass getErrorCodeValue();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.emv3.emv3.ErrorCodeValue#getIntValue <em>Int Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int Value</em>'.
	 * @see org.osate.emv3.emv3.ErrorCodeValue#getIntValue()
	 * @see #getErrorCodeValue()
	 * @generated
	 */
	EAttribute getErrorCodeValue_IntValue();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.emv3.emv3.ErrorCodeValue#getEnumLiteral <em>Enum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enum Literal</em>'.
	 * @see org.osate.emv3.emv3.ErrorCodeValue#getEnumLiteral()
	 * @see #getErrorCodeValue()
	 * @generated
	 */
	EAttribute getErrorCodeValue_EnumLiteral();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.ErrorStateToModeMapping <em>Error State To Mode Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error State To Mode Mapping</em>'.
	 * @see org.osate.emv3.emv3.ErrorStateToModeMapping
	 * @generated
	 */
	EClass getErrorStateToModeMapping();

	/**
	 * Returns the meta object for the reference '{@link org.osate.emv3.emv3.ErrorStateToModeMapping#getErrorState <em>Error State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Error State</em>'.
	 * @see org.osate.emv3.emv3.ErrorStateToModeMapping#getErrorState()
	 * @see #getErrorStateToModeMapping()
	 * @generated
	 */
	EReference getErrorStateToModeMapping_ErrorState();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.emv3.emv3.ErrorStateToModeMapping#getTypeToken <em>Type Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Token</em>'.
	 * @see org.osate.emv3.emv3.ErrorStateToModeMapping#getTypeToken()
	 * @see #getErrorStateToModeMapping()
	 * @generated
	 */
	EReference getErrorStateToModeMapping_TypeToken();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.emv3.emv3.ErrorStateToModeMapping#getMappedModes <em>Mapped Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mapped Modes</em>'.
	 * @see org.osate.emv3.emv3.ErrorStateToModeMapping#getMappedModes()
	 * @see #getErrorStateToModeMapping()
	 * @generated
	 */
	EReference getErrorStateToModeMapping_MappedModes();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.CompositeState <em>Composite State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite State</em>'.
	 * @see org.osate.emv3.emv3.CompositeState
	 * @generated
	 */
	EClass getCompositeState();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.emv3.emv3.CompositeState#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.osate.emv3.emv3.CompositeState#getCondition()
	 * @see #getCompositeState()
	 * @generated
	 */
	EReference getCompositeState_Condition();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.emv3.emv3.CompositeState#isOthers <em>Others</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Others</em>'.
	 * @see org.osate.emv3.emv3.CompositeState#isOthers()
	 * @see #getCompositeState()
	 * @generated
	 */
	EAttribute getCompositeState_Others();

	/**
	 * Returns the meta object for the reference '{@link org.osate.emv3.emv3.CompositeState#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see org.osate.emv3.emv3.CompositeState#getState()
	 * @see #getCompositeState()
	 * @generated
	 */
	EReference getCompositeState_State();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.emv3.emv3.CompositeState#getTypedToken <em>Typed Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Typed Token</em>'.
	 * @see org.osate.emv3.emv3.CompositeState#getTypedToken()
	 * @see #getCompositeState()
	 * @generated
	 */
	EReference getCompositeState_TypedToken();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.QualifiedErrorBehaviorState <em>Qualified Error Behavior State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualified Error Behavior State</em>'.
	 * @see org.osate.emv3.emv3.QualifiedErrorBehaviorState
	 * @generated
	 */
	EClass getQualifiedErrorBehaviorState();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.emv3.emv3.QualifiedErrorBehaviorState#getSubcomponent <em>Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subcomponent</em>'.
	 * @see org.osate.emv3.emv3.QualifiedErrorBehaviorState#getSubcomponent()
	 * @see #getQualifiedErrorBehaviorState()
	 * @generated
	 */
	EReference getQualifiedErrorBehaviorState_Subcomponent();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.emv3.emv3.QualifiedErrorBehaviorState#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next</em>'.
	 * @see org.osate.emv3.emv3.QualifiedErrorBehaviorState#getNext()
	 * @see #getQualifiedErrorBehaviorState()
	 * @generated
	 */
	EReference getQualifiedErrorBehaviorState_Next();

	/**
	 * Returns the meta object for the reference '{@link org.osate.emv3.emv3.QualifiedErrorBehaviorState#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see org.osate.emv3.emv3.QualifiedErrorBehaviorState#getState()
	 * @see #getQualifiedErrorBehaviorState()
	 * @generated
	 */
	EReference getQualifiedErrorBehaviorState_State();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.SubcomponentElement <em>Subcomponent Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subcomponent Element</em>'.
	 * @see org.osate.emv3.emv3.SubcomponentElement
	 * @generated
	 */
	EClass getSubcomponentElement();

	/**
	 * Returns the meta object for the reference '{@link org.osate.emv3.emv3.SubcomponentElement#getSubcomponent <em>Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subcomponent</em>'.
	 * @see org.osate.emv3.emv3.SubcomponentElement#getSubcomponent()
	 * @see #getSubcomponentElement()
	 * @generated
	 */
	EReference getSubcomponentElement_Subcomponent();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.EMV2Root <em>EMV2 Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMV2 Root</em>'.
	 * @see org.osate.emv3.emv3.EMV2Root
	 * @generated
	 */
	EClass getEMV2Root();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.emv3.emv3.EMV2Root#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Library</em>'.
	 * @see org.osate.emv3.emv3.EMV2Root#getLibrary()
	 * @see #getEMV2Root()
	 * @generated
	 */
	EReference getEMV2Root_Library();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.emv3.emv3.EMV2Root#getSubclauses <em>Subclauses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subclauses</em>'.
	 * @see org.osate.emv3.emv3.EMV2Root#getSubclauses()
	 * @see #getEMV2Root()
	 * @generated
	 */
	EReference getEMV2Root_Subclauses();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.OrExpression <em>Or Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Expression</em>'.
	 * @see org.osate.emv3.emv3.OrExpression
	 * @generated
	 */
	EClass getOrExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.emv3.emv3.OrExpression#getOperands <em>Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operands</em>'.
	 * @see org.osate.emv3.emv3.OrExpression#getOperands()
	 * @see #getOrExpression()
	 * @generated
	 */
	EReference getOrExpression_Operands();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.AndExpression <em>And Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Expression</em>'.
	 * @see org.osate.emv3.emv3.AndExpression
	 * @generated
	 */
	EClass getAndExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.emv3.emv3.AndExpression#getOperands <em>Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operands</em>'.
	 * @see org.osate.emv3.emv3.AndExpression#getOperands()
	 * @see #getAndExpression()
	 * @generated
	 */
	EReference getAndExpression_Operands();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.AllExpression <em>All Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Expression</em>'.
	 * @see org.osate.emv3.emv3.AllExpression
	 * @generated
	 */
	EClass getAllExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.emv3.emv3.AllExpression#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see org.osate.emv3.emv3.AllExpression#getCount()
	 * @see #getAllExpression()
	 * @generated
	 */
	EAttribute getAllExpression_Count();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.emv3.emv3.AllExpression#getOperands <em>Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operands</em>'.
	 * @see org.osate.emv3.emv3.AllExpression#getOperands()
	 * @see #getAllExpression()
	 * @generated
	 */
	EReference getAllExpression_Operands();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.ConditionElement <em>Condition Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Element</em>'.
	 * @see org.osate.emv3.emv3.ConditionElement
	 * @generated
	 */
	EClass getConditionElement();

	/**
	 * Returns the meta object for class '{@link org.osate.emv3.emv3.SConditionElement <em>SCondition Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SCondition Element</em>'.
	 * @see org.osate.emv3.emv3.SConditionElement
	 * @generated
	 */
	EClass getSConditionElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.emv3.emv3.SConditionElement#getQualifiedState <em>Qualified State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Qualified State</em>'.
	 * @see org.osate.emv3.emv3.SConditionElement#getQualifiedState()
	 * @see #getSConditionElement()
	 * @generated
	 */
	EReference getSConditionElement_QualifiedState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Emv3Factory getEmv3Factory();

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
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.ErrorModelSubclauseImpl <em>Error Model Subclause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.ErrorModelSubclauseImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getErrorModelSubclause()
		 * @generated
		 */
		EClass ERROR_MODEL_SUBCLAUSE = eINSTANCE.getErrorModelSubclause();

		/**
		 * The meta object literal for the '<em><b>Use Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_SUBCLAUSE__USE_TYPES = eINSTANCE.getErrorModelSubclause_UseTypes();

		/**
		 * The meta object literal for the '<em><b>Type Equivalence</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_SUBCLAUSE__TYPE_EQUIVALENCE = eINSTANCE.getErrorModelSubclause_TypeEquivalence();

		/**
		 * The meta object literal for the '<em><b>Type Mapping Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_SUBCLAUSE__TYPE_MAPPING_SET = eINSTANCE.getErrorModelSubclause_TypeMappingSet();

		/**
		 * The meta object literal for the '<em><b>Use Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_SUBCLAUSE__USE_BEHAVIOR = eINSTANCE.getErrorModelSubclause_UseBehavior();

		/**
		 * The meta object literal for the '<em><b>Propagations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_SUBCLAUSE__PROPAGATIONS = eINSTANCE.getErrorModelSubclause_Propagations();

		/**
		 * The meta object literal for the '<em><b>Flows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_SUBCLAUSE__FLOWS = eINSTANCE.getErrorModelSubclause_Flows();

		/**
		 * The meta object literal for the '<em><b>Use Transformation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_SUBCLAUSE__USE_TRANSFORMATION = eINSTANCE.getErrorModelSubclause_UseTransformation();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_SUBCLAUSE__EVENTS = eINSTANCE.getErrorModelSubclause_Events();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_SUBCLAUSE__TRANSITIONS = eINSTANCE.getErrorModelSubclause_Transitions();

		/**
		 * The meta object literal for the '<em><b>Outgoing Propagation Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_SUBCLAUSE__OUTGOING_PROPAGATION_CONDITIONS = eINSTANCE.getErrorModelSubclause_OutgoingPropagationConditions();

		/**
		 * The meta object literal for the '<em><b>Error Detections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_SUBCLAUSE__ERROR_DETECTIONS = eINSTANCE.getErrorModelSubclause_ErrorDetections();

		/**
		 * The meta object literal for the '<em><b>Error State To Mode Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_SUBCLAUSE__ERROR_STATE_TO_MODE_MAPPINGS = eINSTANCE.getErrorModelSubclause_ErrorStateToModeMappings();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_SUBCLAUSE__STATES = eINSTANCE.getErrorModelSubclause_States();

		/**
		 * The meta object literal for the '<em><b>Type Transformation Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_SUBCLAUSE__TYPE_TRANSFORMATION_SET = eINSTANCE.getErrorModelSubclause_TypeTransformationSet();

		/**
		 * The meta object literal for the '<em><b>Connection Error Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_SUBCLAUSE__CONNECTION_ERROR_SOURCES = eINSTANCE.getErrorModelSubclause_ConnectionErrorSources();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_SUBCLAUSE__POINTS = eINSTANCE.getErrorModelSubclause_Points();

		/**
		 * The meta object literal for the '<em><b>Paths</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_SUBCLAUSE__PATHS = eINSTANCE.getErrorModelSubclause_Paths();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.ErrorModelLibraryImpl <em>Error Model Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.ErrorModelLibraryImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getErrorModelLibrary()
		 * @generated
		 */
		EClass ERROR_MODEL_LIBRARY = eINSTANCE.getErrorModelLibrary();

		/**
		 * The meta object literal for the '<em><b>Use Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_LIBRARY__USE_TYPES = eINSTANCE.getErrorModelLibrary_UseTypes();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_LIBRARY__EXTENDS = eINSTANCE.getErrorModelLibrary_Extends();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_LIBRARY__TYPES = eINSTANCE.getErrorModelLibrary_Types();

		/**
		 * The meta object literal for the '<em><b>Typesets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_LIBRARY__TYPESETS = eINSTANCE.getErrorModelLibrary_Typesets();

		/**
		 * The meta object literal for the '<em><b>Behaviors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_LIBRARY__BEHAVIORS = eINSTANCE.getErrorModelLibrary_Behaviors();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_LIBRARY__MAPPINGS = eINSTANCE.getErrorModelLibrary_Mappings();

		/**
		 * The meta object literal for the '<em><b>Transformations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_LIBRARY__TRANSFORMATIONS = eINSTANCE.getErrorModelLibrary_Transformations();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.ErrorTypesImpl <em>Error Types</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.ErrorTypesImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getErrorTypes()
		 * @generated
		 */
		EClass ERROR_TYPES = eINSTANCE.getErrorTypes();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.ErrorTypeImpl <em>Error Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.ErrorTypeImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getErrorType()
		 * @generated
		 */
		EClass ERROR_TYPE = eINSTANCE.getErrorType();

		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_TYPE__SUPER_TYPE = eINSTANCE.getErrorType_SuperType();

		/**
		 * The meta object literal for the '<em><b>Aliased Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_TYPE__ALIASED_TYPE = eINSTANCE.getErrorType_AliasedType();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.TypeSetImpl <em>Type Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.TypeSetImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getTypeSet()
		 * @generated
		 */
		EClass TYPE_SET = eINSTANCE.getTypeSet();

		/**
		 * The meta object literal for the '<em><b>Type Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_SET__TYPE_TOKENS = eINSTANCE.getTypeSet_TypeTokens();

		/**
		 * The meta object literal for the '<em><b>Aliased Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_SET__ALIASED_TYPE = eINSTANCE.getTypeSet_AliasedType();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.TypeTokenImpl <em>Type Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.TypeTokenImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getTypeToken()
		 * @generated
		 */
		EClass TYPE_TOKEN = eINSTANCE.getTypeToken();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_TOKEN__TYPE = eINSTANCE.getTypeToken_Type();

		/**
		 * The meta object literal for the '<em><b>No Error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_TOKEN__NO_ERROR = eINSTANCE.getTypeToken_NoError();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.TypeTransformationSetImpl <em>Type Transformation Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.TypeTransformationSetImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getTypeTransformationSet()
		 * @generated
		 */
		EClass TYPE_TRANSFORMATION_SET = eINSTANCE.getTypeTransformationSet();

		/**
		 * The meta object literal for the '<em><b>Use Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_TRANSFORMATION_SET__USE_TYPES = eINSTANCE.getTypeTransformationSet_UseTypes();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_TRANSFORMATION_SET__TRANSFORMATION = eINSTANCE.getTypeTransformationSet_Transformation();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.TypeTransformationImpl <em>Type Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.TypeTransformationImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getTypeTransformation()
		 * @generated
		 */
		EClass TYPE_TRANSFORMATION = eINSTANCE.getTypeTransformation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_TRANSFORMATION__SOURCE = eINSTANCE.getTypeTransformation_Source();

		/**
		 * The meta object literal for the '<em><b>All Sources</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_TRANSFORMATION__ALL_SOURCES = eINSTANCE.getTypeTransformation_AllSources();

		/**
		 * The meta object literal for the '<em><b>Contributor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_TRANSFORMATION__CONTRIBUTOR = eINSTANCE.getTypeTransformation_Contributor();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_TRANSFORMATION__TARGET = eINSTANCE.getTypeTransformation_Target();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.TypeMappingSetImpl <em>Type Mapping Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.TypeMappingSetImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getTypeMappingSet()
		 * @generated
		 */
		EClass TYPE_MAPPING_SET = eINSTANCE.getTypeMappingSet();

		/**
		 * The meta object literal for the '<em><b>Use Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MAPPING_SET__USE_TYPES = eINSTANCE.getTypeMappingSet_UseTypes();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MAPPING_SET__MAPPING = eINSTANCE.getTypeMappingSet_Mapping();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.TypeMappingImpl <em>Type Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.TypeMappingImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getTypeMapping()
		 * @generated
		 */
		EClass TYPE_MAPPING = eINSTANCE.getTypeMapping();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MAPPING__SOURCE = eINSTANCE.getTypeMapping_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MAPPING__TARGET = eINSTANCE.getTypeMapping_Target();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.ErrorPropagationImpl <em>Error Propagation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.ErrorPropagationImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getErrorPropagation()
		 * @generated
		 */
		EClass ERROR_PROPAGATION = eINSTANCE.getErrorPropagation();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_PROPAGATION__KIND = eINSTANCE.getErrorPropagation_Kind();

		/**
		 * The meta object literal for the '<em><b>Featureor PP Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_PROPAGATION__FEATUREOR_PP_REF = eINSTANCE.getErrorPropagation_FeatureorPPRef();

		/**
		 * The meta object literal for the '<em><b>Not</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_PROPAGATION__NOT = eINSTANCE.getErrorPropagation_Not();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_PROPAGATION__DIRECTION = eINSTANCE.getErrorPropagation_Direction();

		/**
		 * The meta object literal for the '<em><b>Type Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_PROPAGATION__TYPE_SET = eINSTANCE.getErrorPropagation_TypeSet();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.FeatureorPPReferenceImpl <em>Featureor PP Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.FeatureorPPReferenceImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getFeatureorPPReference()
		 * @generated
		 */
		EClass FEATUREOR_PP_REFERENCE = eINSTANCE.getFeatureorPPReference();

		/**
		 * The meta object literal for the '<em><b>Featureor PP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATUREOR_PP_REFERENCE__FEATUREOR_PP = eINSTANCE.getFeatureorPPReference_FeatureorPP();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATUREOR_PP_REFERENCE__NEXT = eINSTANCE.getFeatureorPPReference_Next();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.ErrorFlowImpl <em>Error Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.ErrorFlowImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getErrorFlow()
		 * @generated
		 */
		EClass ERROR_FLOW = eINSTANCE.getErrorFlow();

		/**
		 * The meta object literal for the '<em><b>Type Token Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_FLOW__TYPE_TOKEN_CONSTRAINT = eINSTANCE.getErrorFlow_TypeTokenConstraint();

		/**
		 * The meta object literal for the '<em><b>Flowcondition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_FLOW__FLOWCONDITION = eINSTANCE.getErrorFlow_Flowcondition();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.ErrorSourceImpl <em>Error Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.ErrorSourceImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getErrorSource()
		 * @generated
		 */
		EClass ERROR_SOURCE = eINSTANCE.getErrorSource();

		/**
		 * The meta object literal for the '<em><b>Source Model Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_SOURCE__SOURCE_MODEL_ELEMENT = eINSTANCE.getErrorSource_SourceModelElement();

		/**
		 * The meta object literal for the '<em><b>All</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_SOURCE__ALL = eINSTANCE.getErrorSource_All();

		/**
		 * The meta object literal for the '<em><b>Failure Mode Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_SOURCE__FAILURE_MODE_REFERENCE = eINSTANCE.getErrorSource_FailureModeReference();

		/**
		 * The meta object literal for the '<em><b>Failure Mode Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_SOURCE__FAILURE_MODE_TYPE = eINSTANCE.getErrorSource_FailureModeType();

		/**
		 * The meta object literal for the '<em><b>Failure Mode Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_SOURCE__FAILURE_MODE_DESCRIPTION = eINSTANCE.getErrorSource_FailureModeDescription();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.ErrorSinkImpl <em>Error Sink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.ErrorSinkImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getErrorSink()
		 * @generated
		 */
		EClass ERROR_SINK = eINSTANCE.getErrorSink();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_SINK__INCOMING = eINSTANCE.getErrorSink_Incoming();

		/**
		 * The meta object literal for the '<em><b>All Incoming</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_SINK__ALL_INCOMING = eINSTANCE.getErrorSink_AllIncoming();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.ErrorPathImpl <em>Error Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.ErrorPathImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getErrorPath()
		 * @generated
		 */
		EClass ERROR_PATH = eINSTANCE.getErrorPath();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_PATH__INCOMING = eINSTANCE.getErrorPath_Incoming();

		/**
		 * The meta object literal for the '<em><b>All Incoming</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_PATH__ALL_INCOMING = eINSTANCE.getErrorPath_AllIncoming();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_PATH__OUTGOING = eINSTANCE.getErrorPath_Outgoing();

		/**
		 * The meta object literal for the '<em><b>All Outgoing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_PATH__ALL_OUTGOING = eINSTANCE.getErrorPath_AllOutgoing();

		/**
		 * The meta object literal for the '<em><b>Target Token</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_PATH__TARGET_TOKEN = eINSTANCE.getErrorPath_TargetToken();

		/**
		 * The meta object literal for the '<em><b>Type Mapping Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_PATH__TYPE_MAPPING_SET = eINSTANCE.getErrorPath_TypeMappingSet();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.IfConditionImpl <em>If Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.IfConditionImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getIfCondition()
		 * @generated
		 */
		EClass IF_CONDITION = eINSTANCE.getIfCondition();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IF_CONDITION__DESCRIPTION = eINSTANCE.getIfCondition_Description();

		/**
		 * The meta object literal for the '<em><b>Resolute Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_CONDITION__RESOLUTE_FUNCTION = eINSTANCE.getIfCondition_ResoluteFunction();

		/**
		 * The meta object literal for the '<em><b>Java Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IF_CONDITION__JAVA_METHOD = eINSTANCE.getIfCondition_JavaMethod();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.PropagationPointImpl <em>Propagation Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.PropagationPointImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getPropagationPoint()
		 * @generated
		 */
		EClass PROPAGATION_POINT = eINSTANCE.getPropagationPoint();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.PropagationPathImpl <em>Propagation Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.PropagationPathImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getPropagationPath()
		 * @generated
		 */
		EClass PROPAGATION_PATH = eINSTANCE.getPropagationPath();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPAGATION_PATH__SOURCE = eINSTANCE.getPropagationPath_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPAGATION_PATH__TARGET = eINSTANCE.getPropagationPath_Target();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.QualifiedPropagationPointImpl <em>Qualified Propagation Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.QualifiedPropagationPointImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getQualifiedPropagationPoint()
		 * @generated
		 */
		EClass QUALIFIED_PROPAGATION_POINT = eINSTANCE.getQualifiedPropagationPoint();

		/**
		 * The meta object literal for the '<em><b>Subcomponent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIED_PROPAGATION_POINT__SUBCOMPONENT = eINSTANCE.getQualifiedPropagationPoint_Subcomponent();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIED_PROPAGATION_POINT__NEXT = eINSTANCE.getQualifiedPropagationPoint_Next();

		/**
		 * The meta object literal for the '<em><b>Propagation Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIED_PROPAGATION_POINT__PROPAGATION_POINT = eINSTANCE.getQualifiedPropagationPoint_PropagationPoint();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.ErrorBehaviorStateMachineImpl <em>Error Behavior State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.ErrorBehaviorStateMachineImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getErrorBehaviorStateMachine()
		 * @generated
		 */
		EClass ERROR_BEHAVIOR_STATE_MACHINE = eINSTANCE.getErrorBehaviorStateMachine();

		/**
		 * The meta object literal for the '<em><b>Use Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_BEHAVIOR_STATE_MACHINE__USE_TYPES = eINSTANCE.getErrorBehaviorStateMachine_UseTypes();

		/**
		 * The meta object literal for the '<em><b>Use Transformation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_BEHAVIOR_STATE_MACHINE__USE_TRANSFORMATION = eINSTANCE.getErrorBehaviorStateMachine_UseTransformation();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_BEHAVIOR_STATE_MACHINE__EVENTS = eINSTANCE.getErrorBehaviorStateMachine_Events();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_BEHAVIOR_STATE_MACHINE__STATES = eINSTANCE.getErrorBehaviorStateMachine_States();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_BEHAVIOR_STATE_MACHINE__TRANSITIONS = eINSTANCE.getErrorBehaviorStateMachine_Transitions();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.ErrorBehaviorEventImpl <em>Error Behavior Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.ErrorBehaviorEventImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getErrorBehaviorEvent()
		 * @generated
		 */
		EClass ERROR_BEHAVIOR_EVENT = eINSTANCE.getErrorBehaviorEvent();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.ErrorEventImpl <em>Error Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.ErrorEventImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getErrorEvent()
		 * @generated
		 */
		EClass ERROR_EVENT = eINSTANCE.getErrorEvent();

		/**
		 * The meta object literal for the '<em><b>Type Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_EVENT__TYPE_SET = eINSTANCE.getErrorEvent_TypeSet();

		/**
		 * The meta object literal for the '<em><b>Eventcondition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_EVENT__EVENTCONDITION = eINSTANCE.getErrorEvent_Eventcondition();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.RepairEventImpl <em>Repair Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.RepairEventImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getRepairEvent()
		 * @generated
		 */
		EClass REPAIR_EVENT = eINSTANCE.getRepairEvent();

		/**
		 * The meta object literal for the '<em><b>Event Initiator</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPAIR_EVENT__EVENT_INITIATOR = eINSTANCE.getRepairEvent_EventInitiator();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.RecoverEventImpl <em>Recover Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.RecoverEventImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getRecoverEvent()
		 * @generated
		 */
		EClass RECOVER_EVENT = eINSTANCE.getRecoverEvent();

		/**
		 * The meta object literal for the '<em><b>Event Initiator</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECOVER_EVENT__EVENT_INITIATOR = eINSTANCE.getRecoverEvent_EventInitiator();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECOVER_EVENT__CONDITION = eINSTANCE.getRecoverEvent_Condition();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.ErrorBehaviorStateImpl <em>Error Behavior State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.ErrorBehaviorStateImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getErrorBehaviorState()
		 * @generated
		 */
		EClass ERROR_BEHAVIOR_STATE = eINSTANCE.getErrorBehaviorState();

		/**
		 * The meta object literal for the '<em><b>Intial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_BEHAVIOR_STATE__INTIAL = eINSTANCE.getErrorBehaviorState_Intial();

		/**
		 * The meta object literal for the '<em><b>Type Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_BEHAVIOR_STATE__TYPE_SET = eINSTANCE.getErrorBehaviorState_TypeSet();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.ErrorBehaviorTransitionImpl <em>Error Behavior Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.ErrorBehaviorTransitionImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getErrorBehaviorTransition()
		 * @generated
		 */
		EClass ERROR_BEHAVIOR_TRANSITION = eINSTANCE.getErrorBehaviorTransition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_BEHAVIOR_TRANSITION__SOURCE = eINSTANCE.getErrorBehaviorTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Type Token Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_BEHAVIOR_TRANSITION__TYPE_TOKEN_CONSTRAINT = eINSTANCE.getErrorBehaviorTransition_TypeTokenConstraint();

		/**
		 * The meta object literal for the '<em><b>All States</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_BEHAVIOR_TRANSITION__ALL_STATES = eINSTANCE.getErrorBehaviorTransition_AllStates();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_BEHAVIOR_TRANSITION__CONDITION = eINSTANCE.getErrorBehaviorTransition_Condition();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_BEHAVIOR_TRANSITION__TARGET = eINSTANCE.getErrorBehaviorTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Target Token</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_BEHAVIOR_TRANSITION__TARGET_TOKEN = eINSTANCE.getErrorBehaviorTransition_TargetToken();

		/**
		 * The meta object literal for the '<em><b>Steady State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_BEHAVIOR_TRANSITION__STEADY_STATE = eINSTANCE.getErrorBehaviorTransition_SteadyState();

		/**
		 * The meta object literal for the '<em><b>Destination Branches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_BEHAVIOR_TRANSITION__DESTINATION_BRANCHES = eINSTANCE.getErrorBehaviorTransition_DestinationBranches();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.TransitionBranchImpl <em>Transition Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.TransitionBranchImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getTransitionBranch()
		 * @generated
		 */
		EClass TRANSITION_BRANCH = eINSTANCE.getTransitionBranch();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_BRANCH__TARGET = eINSTANCE.getTransitionBranch_Target();

		/**
		 * The meta object literal for the '<em><b>Target Token</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_BRANCH__TARGET_TOKEN = eINSTANCE.getTransitionBranch_TargetToken();

		/**
		 * The meta object literal for the '<em><b>Steady State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_BRANCH__STEADY_STATE = eINSTANCE.getTransitionBranch_SteadyState();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_BRANCH__VALUE = eINSTANCE.getTransitionBranch_Value();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.BranchValueImpl <em>Branch Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.BranchValueImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getBranchValue()
		 * @generated
		 */
		EClass BRANCH_VALUE = eINSTANCE.getBranchValue();

		/**
		 * The meta object literal for the '<em><b>Realvalue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH_VALUE__REALVALUE = eINSTANCE.getBranchValue_Realvalue();

		/**
		 * The meta object literal for the '<em><b>Others</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH_VALUE__OTHERS = eINSTANCE.getBranchValue_Others();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.ConditionExpressionImpl <em>Condition Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.ConditionExpressionImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getConditionExpression()
		 * @generated
		 */
		EClass CONDITION_EXPRESSION = eINSTANCE.getConditionExpression();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.OrmoreExpressionImpl <em>Ormore Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.OrmoreExpressionImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getOrmoreExpression()
		 * @generated
		 */
		EClass ORMORE_EXPRESSION = eINSTANCE.getOrmoreExpression();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORMORE_EXPRESSION__COUNT = eINSTANCE.getOrmoreExpression_Count();

		/**
		 * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORMORE_EXPRESSION__OPERANDS = eINSTANCE.getOrmoreExpression_Operands();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.OrlessExpressionImpl <em>Orless Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.OrlessExpressionImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getOrlessExpression()
		 * @generated
		 */
		EClass ORLESS_EXPRESSION = eINSTANCE.getOrlessExpression();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORLESS_EXPRESSION__COUNT = eINSTANCE.getOrlessExpression_Count();

		/**
		 * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORLESS_EXPRESSION__OPERANDS = eINSTANCE.getOrlessExpression_Operands();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.EventOrPropagationImpl <em>Event Or Propagation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.EventOrPropagationImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getEventOrPropagation()
		 * @generated
		 */
		EClass EVENT_OR_PROPAGATION = eINSTANCE.getEventOrPropagation();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.OutgoingPropagationConditionImpl <em>Outgoing Propagation Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.OutgoingPropagationConditionImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getOutgoingPropagationCondition()
		 * @generated
		 */
		EClass OUTGOING_PROPAGATION_CONDITION = eINSTANCE.getOutgoingPropagationCondition();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTGOING_PROPAGATION_CONDITION__STATE = eINSTANCE.getOutgoingPropagationCondition_State();

		/**
		 * The meta object literal for the '<em><b>Type Token Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTGOING_PROPAGATION_CONDITION__TYPE_TOKEN_CONSTRAINT = eINSTANCE.getOutgoingPropagationCondition_TypeTokenConstraint();

		/**
		 * The meta object literal for the '<em><b>All States</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTGOING_PROPAGATION_CONDITION__ALL_STATES = eINSTANCE.getOutgoingPropagationCondition_AllStates();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTGOING_PROPAGATION_CONDITION__CONDITION = eINSTANCE.getOutgoingPropagationCondition_Condition();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTGOING_PROPAGATION_CONDITION__OUTGOING = eINSTANCE.getOutgoingPropagationCondition_Outgoing();

		/**
		 * The meta object literal for the '<em><b>All Propagations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTGOING_PROPAGATION_CONDITION__ALL_PROPAGATIONS = eINSTANCE.getOutgoingPropagationCondition_AllPropagations();

		/**
		 * The meta object literal for the '<em><b>Type Token</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTGOING_PROPAGATION_CONDITION__TYPE_TOKEN = eINSTANCE.getOutgoingPropagationCondition_TypeToken();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.ErrorDetectionImpl <em>Error Detection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.ErrorDetectionImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getErrorDetection()
		 * @generated
		 */
		EClass ERROR_DETECTION = eINSTANCE.getErrorDetection();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_DETECTION__STATE = eINSTANCE.getErrorDetection_State();

		/**
		 * The meta object literal for the '<em><b>Type Token Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_DETECTION__TYPE_TOKEN_CONSTRAINT = eINSTANCE.getErrorDetection_TypeTokenConstraint();

		/**
		 * The meta object literal for the '<em><b>All States</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_DETECTION__ALL_STATES = eINSTANCE.getErrorDetection_AllStates();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_DETECTION__CONDITION = eINSTANCE.getErrorDetection_Condition();

		/**
		 * The meta object literal for the '<em><b>Detection Reporting Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_DETECTION__DETECTION_REPORTING_PORT = eINSTANCE.getErrorDetection_DetectionReportingPort();

		/**
		 * The meta object literal for the '<em><b>Error Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_DETECTION__ERROR_CODE = eINSTANCE.getErrorDetection_ErrorCode();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.ErrorCodeValueImpl <em>Error Code Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.ErrorCodeValueImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getErrorCodeValue()
		 * @generated
		 */
		EClass ERROR_CODE_VALUE = eINSTANCE.getErrorCodeValue();

		/**
		 * The meta object literal for the '<em><b>Int Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_CODE_VALUE__INT_VALUE = eINSTANCE.getErrorCodeValue_IntValue();

		/**
		 * The meta object literal for the '<em><b>Enum Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_CODE_VALUE__ENUM_LITERAL = eINSTANCE.getErrorCodeValue_EnumLiteral();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.ErrorStateToModeMappingImpl <em>Error State To Mode Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.ErrorStateToModeMappingImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getErrorStateToModeMapping()
		 * @generated
		 */
		EClass ERROR_STATE_TO_MODE_MAPPING = eINSTANCE.getErrorStateToModeMapping();

		/**
		 * The meta object literal for the '<em><b>Error State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_STATE_TO_MODE_MAPPING__ERROR_STATE = eINSTANCE.getErrorStateToModeMapping_ErrorState();

		/**
		 * The meta object literal for the '<em><b>Type Token</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_STATE_TO_MODE_MAPPING__TYPE_TOKEN = eINSTANCE.getErrorStateToModeMapping_TypeToken();

		/**
		 * The meta object literal for the '<em><b>Mapped Modes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_STATE_TO_MODE_MAPPING__MAPPED_MODES = eINSTANCE.getErrorStateToModeMapping_MappedModes();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.CompositeStateImpl <em>Composite State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.CompositeStateImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getCompositeState()
		 * @generated
		 */
		EClass COMPOSITE_STATE = eINSTANCE.getCompositeState();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_STATE__CONDITION = eINSTANCE.getCompositeState_Condition();

		/**
		 * The meta object literal for the '<em><b>Others</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_STATE__OTHERS = eINSTANCE.getCompositeState_Others();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_STATE__STATE = eINSTANCE.getCompositeState_State();

		/**
		 * The meta object literal for the '<em><b>Typed Token</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_STATE__TYPED_TOKEN = eINSTANCE.getCompositeState_TypedToken();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.QualifiedErrorBehaviorStateImpl <em>Qualified Error Behavior State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.QualifiedErrorBehaviorStateImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getQualifiedErrorBehaviorState()
		 * @generated
		 */
		EClass QUALIFIED_ERROR_BEHAVIOR_STATE = eINSTANCE.getQualifiedErrorBehaviorState();

		/**
		 * The meta object literal for the '<em><b>Subcomponent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIED_ERROR_BEHAVIOR_STATE__SUBCOMPONENT = eINSTANCE.getQualifiedErrorBehaviorState_Subcomponent();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIED_ERROR_BEHAVIOR_STATE__NEXT = eINSTANCE.getQualifiedErrorBehaviorState_Next();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIED_ERROR_BEHAVIOR_STATE__STATE = eINSTANCE.getQualifiedErrorBehaviorState_State();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.SubcomponentElementImpl <em>Subcomponent Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.SubcomponentElementImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getSubcomponentElement()
		 * @generated
		 */
		EClass SUBCOMPONENT_ELEMENT = eINSTANCE.getSubcomponentElement();

		/**
		 * The meta object literal for the '<em><b>Subcomponent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBCOMPONENT_ELEMENT__SUBCOMPONENT = eINSTANCE.getSubcomponentElement_Subcomponent();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.EMV2RootImpl <em>EMV2 Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.EMV2RootImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getEMV2Root()
		 * @generated
		 */
		EClass EMV2_ROOT = eINSTANCE.getEMV2Root();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMV2_ROOT__LIBRARY = eINSTANCE.getEMV2Root_Library();

		/**
		 * The meta object literal for the '<em><b>Subclauses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMV2_ROOT__SUBCLAUSES = eINSTANCE.getEMV2Root_Subclauses();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.OrExpressionImpl <em>Or Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.OrExpressionImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getOrExpression()
		 * @generated
		 */
		EClass OR_EXPRESSION = eINSTANCE.getOrExpression();

		/**
		 * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR_EXPRESSION__OPERANDS = eINSTANCE.getOrExpression_Operands();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.AndExpressionImpl <em>And Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.AndExpressionImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getAndExpression()
		 * @generated
		 */
		EClass AND_EXPRESSION = eINSTANCE.getAndExpression();

		/**
		 * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND_EXPRESSION__OPERANDS = eINSTANCE.getAndExpression_Operands();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.AllExpressionImpl <em>All Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.AllExpressionImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getAllExpression()
		 * @generated
		 */
		EClass ALL_EXPRESSION = eINSTANCE.getAllExpression();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALL_EXPRESSION__COUNT = eINSTANCE.getAllExpression_Count();

		/**
		 * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALL_EXPRESSION__OPERANDS = eINSTANCE.getAllExpression_Operands();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.ConditionElementImpl <em>Condition Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.ConditionElementImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getConditionElement()
		 * @generated
		 */
		EClass CONDITION_ELEMENT = eINSTANCE.getConditionElement();

		/**
		 * The meta object literal for the '{@link org.osate.emv3.emv3.impl.SConditionElementImpl <em>SCondition Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.emv3.emv3.impl.SConditionElementImpl
		 * @see org.osate.emv3.emv3.impl.Emv3PackageImpl#getSConditionElement()
		 * @generated
		 */
		EClass SCONDITION_ELEMENT = eINSTANCE.getSConditionElement();

		/**
		 * The meta object literal for the '<em><b>Qualified State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCONDITION_ELEMENT__QUALIFIED_STATE = eINSTANCE.getSConditionElement_QualifiedState();

	}

} //Emv3Package
