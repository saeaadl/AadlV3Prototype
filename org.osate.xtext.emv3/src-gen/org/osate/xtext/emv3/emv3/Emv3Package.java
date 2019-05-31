/**
 * generated by Xtext 2.16.0
 */
package org.osate.xtext.emv3.emv3;

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
 * @see org.osate.xtext.emv3.emv3.Emv3Factory
 * @model kind="package"
 * @generated
 */
public interface Emv3Package extends EPackage
{
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
  String eNS_URI = "http://www.osate.org/xtext/emv3/Emv3";

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
  Emv3Package eINSTANCE = org.osate.xtext.emv3.emv3.impl.Emv3PackageImpl.init();

  /**
   * The meta object id for the '{@link org.osate.xtext.emv3.emv3.impl.ErrorPropagationImpl <em>Error Propagation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.emv3.emv3.impl.ErrorPropagationImpl
   * @see org.osate.xtext.emv3.emv3.impl.Emv3PackageImpl#getErrorPropagation()
   * @generated
   */
  int ERROR_PROPAGATION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_PROPAGATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_PROPAGATION__TYPE = 1;

  /**
   * The number of structural features of the '<em>Error Propagation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_PROPAGATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.emv3.emv3.impl.ErrorTypeImpl <em>Error Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.emv3.emv3.impl.ErrorTypeImpl
   * @see org.osate.xtext.emv3.emv3.impl.Emv3PackageImpl#getErrorType()
   * @generated
   */
  int ERROR_TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_TYPE__NAME = Aadlv3Package.PACKAGE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Private</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_TYPE__PRIVATE = Aadlv3Package.PACKAGE_ELEMENT__PRIVATE;

  /**
   * The number of structural features of the '<em>Error Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_TYPE_FEATURE_COUNT = Aadlv3Package.PACKAGE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.osate.xtext.emv3.emv3.impl.Emv3SubclauseImpl <em>Subclause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.emv3.emv3.impl.Emv3SubclauseImpl
   * @see org.osate.xtext.emv3.emv3.impl.Emv3PackageImpl#getEmv3Subclause()
   * @generated
   */
  int EMV3_SUBCLAUSE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMV3_SUBCLAUSE__NAME = Aadlv3Package.PACKAGE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Private</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMV3_SUBCLAUSE__PRIVATE = Aadlv3Package.PACKAGE_ELEMENT__PRIVATE;

  /**
   * The feature id for the '<em><b>Emv3statement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMV3_SUBCLAUSE__EMV3STATEMENT = Aadlv3Package.PACKAGE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Subclause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMV3_SUBCLAUSE_FEATURE_COUNT = Aadlv3Package.PACKAGE_ELEMENT_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.osate.xtext.emv3.emv3.ErrorPropagation <em>Error Propagation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Error Propagation</em>'.
   * @see org.osate.xtext.emv3.emv3.ErrorPropagation
   * @generated
   */
  EClass getErrorPropagation();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.emv3.emv3.ErrorPropagation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.xtext.emv3.emv3.ErrorPropagation#getName()
   * @see #getErrorPropagation()
   * @generated
   */
  EAttribute getErrorPropagation_Name();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.emv3.emv3.ErrorPropagation#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.osate.xtext.emv3.emv3.ErrorPropagation#getType()
   * @see #getErrorPropagation()
   * @generated
   */
  EReference getErrorPropagation_Type();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.emv3.emv3.ErrorType <em>Error Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Error Type</em>'.
   * @see org.osate.xtext.emv3.emv3.ErrorType
   * @generated
   */
  EClass getErrorType();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.emv3.emv3.Emv3Subclause <em>Subclause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subclause</em>'.
   * @see org.osate.xtext.emv3.emv3.Emv3Subclause
   * @generated
   */
  EClass getEmv3Subclause();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.emv3.emv3.Emv3Subclause#getEmv3statement <em>Emv3statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Emv3statement</em>'.
   * @see org.osate.xtext.emv3.emv3.Emv3Subclause#getEmv3statement()
   * @see #getEmv3Subclause()
   * @generated
   */
  EReference getEmv3Subclause_Emv3statement();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.osate.xtext.emv3.emv3.impl.ErrorPropagationImpl <em>Error Propagation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.emv3.emv3.impl.ErrorPropagationImpl
     * @see org.osate.xtext.emv3.emv3.impl.Emv3PackageImpl#getErrorPropagation()
     * @generated
     */
    EClass ERROR_PROPAGATION = eINSTANCE.getErrorPropagation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ERROR_PROPAGATION__NAME = eINSTANCE.getErrorPropagation_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_PROPAGATION__TYPE = eINSTANCE.getErrorPropagation_Type();

    /**
     * The meta object literal for the '{@link org.osate.xtext.emv3.emv3.impl.ErrorTypeImpl <em>Error Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.emv3.emv3.impl.ErrorTypeImpl
     * @see org.osate.xtext.emv3.emv3.impl.Emv3PackageImpl#getErrorType()
     * @generated
     */
    EClass ERROR_TYPE = eINSTANCE.getErrorType();

    /**
     * The meta object literal for the '{@link org.osate.xtext.emv3.emv3.impl.Emv3SubclauseImpl <em>Subclause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.emv3.emv3.impl.Emv3SubclauseImpl
     * @see org.osate.xtext.emv3.emv3.impl.Emv3PackageImpl#getEmv3Subclause()
     * @generated
     */
    EClass EMV3_SUBCLAUSE = eINSTANCE.getEmv3Subclause();

    /**
     * The meta object literal for the '<em><b>Emv3statement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMV3_SUBCLAUSE__EMV3STATEMENT = eINSTANCE.getEmv3Subclause_Emv3statement();

  }

} //Emv3Package