/**
 * Copyright Text	Copyright 2018 Carnegie Mellon University. All Rights Reserved....
 */
package org.osate.emv3.emv3;

import org.osate.aadlv3.aadlv3.FeatureDirection;
import org.osate.aadlv3.aadlv3.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Propagation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.emv3.emv3.ErrorPropagation#getKind <em>Kind</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorPropagation#getFeatureorPPRef <em>Featureor PP Ref</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorPropagation#isNot <em>Not</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorPropagation#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorPropagation#getTypeSet <em>Type Set</em>}</li>
 * </ul>
 *
 * @see org.osate.emv3.emv3.Emv3Package#getErrorPropagation()
 * @model
 * @generated
 */
public interface ErrorPropagation extends NamedElement, EventOrPropagation {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see #setKind(String)
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorPropagation_Kind()
	 * @model
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.ErrorPropagation#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(String value);

	/**
	 * Returns the value of the '<em><b>Featureor PP Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Featureor PP Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Featureor PP Ref</em>' containment reference.
	 * @see #setFeatureorPPRef(FeatureorPPReference)
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorPropagation_FeatureorPPRef()
	 * @model containment="true"
	 * @generated
	 */
	FeatureorPPReference getFeatureorPPRef();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.ErrorPropagation#getFeatureorPPRef <em>Featureor PP Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Featureor PP Ref</em>' containment reference.
	 * @see #getFeatureorPPRef()
	 * @generated
	 */
	void setFeatureorPPRef(FeatureorPPReference value);

	/**
	 * Returns the value of the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not</em>' attribute.
	 * @see #setNot(boolean)
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorPropagation_Not()
	 * @model
	 * @generated
	 */
	boolean isNot();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.ErrorPropagation#isNot <em>Not</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not</em>' attribute.
	 * @see #isNot()
	 * @generated
	 */
	void setNot(boolean value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.osate.aadlv3.aadlv3.FeatureDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.osate.aadlv3.aadlv3.FeatureDirection
	 * @see #setDirection(FeatureDirection)
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorPropagation_Direction()
	 * @model
	 * @generated
	 */
	FeatureDirection getDirection();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.ErrorPropagation#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.osate.aadlv3.aadlv3.FeatureDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(FeatureDirection value);

	/**
	 * Returns the value of the '<em><b>Type Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Set</em>' containment reference.
	 * @see #setTypeSet(TypeSet)
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorPropagation_TypeSet()
	 * @model containment="true"
	 * @generated
	 */
	TypeSet getTypeSet();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.ErrorPropagation#getTypeSet <em>Type Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Set</em>' containment reference.
	 * @see #getTypeSet()
	 * @generated
	 */
	void setTypeSet(TypeSet value);

} // ErrorPropagation
