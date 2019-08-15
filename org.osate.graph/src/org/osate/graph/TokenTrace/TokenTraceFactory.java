/**
 */
package org.osate.graph.TokenTrace;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.osate.graph.TokenTrace.TokenTracePackage
 * @generated
 */
public interface TokenTraceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TokenTraceFactory eINSTANCE = org.osate.graph.TokenTrace.impl.TokenTraceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Token Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token Trace</em>'.
	 * @generated
	 */
	TokenTrace createTokenTrace();

	/**
	 * Returns a new object of class '<em>Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token</em>'.
	 * @generated
	 */
	Token createToken();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TokenTracePackage getTokenTracePackage();

} //TokenTraceFactory
