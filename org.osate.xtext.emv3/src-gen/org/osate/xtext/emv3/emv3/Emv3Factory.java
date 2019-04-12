/**
 * generated by Xtext 2.16.0
 */
package org.osate.xtext.emv3.emv3;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.osate.xtext.emv3.emv3.Emv3Package
 * @generated
 */
public interface Emv3Factory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Emv3Factory eINSTANCE = org.osate.xtext.emv3.emv3.impl.Emv3FactoryImpl.init();

  /**
   * Returns a new object of class '<em>Error Propagation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Error Propagation</em>'.
   * @generated
   */
  ErrorPropagation createErrorPropagation();

  /**
   * Returns a new object of class '<em>Error Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Error Type</em>'.
   * @generated
   */
  ErrorType createErrorType();

  /**
   * Returns a new object of class '<em>Subclause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Subclause</em>'.
   * @generated
   */
  Emv3Subclause createEmv3Subclause();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  Emv3Package getEmv3Package();

} //Emv3Factory
