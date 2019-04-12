/**
 * Copyright Text	Copyright 2018 Carnegie Mellon University. All Rights Reserved....
 */
package org.osate.emv3.emv3;

import org.osate.aadlv3.aadlv3.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.emv3.emv3.TypeTransformation#getSource <em>Source</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.TypeTransformation#isAllSources <em>All Sources</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.TypeTransformation#getContributor <em>Contributor</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.TypeTransformation#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.osate.emv3.emv3.Emv3Package#getTypeTransformation()
 * @model
 * @generated
 */
public interface TypeTransformation extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(TypeSet)
	 * @see org.osate.emv3.emv3.Emv3Package#getTypeTransformation_Source()
	 * @model containment="true"
	 * @generated
	 */
	TypeSet getSource();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.TypeTransformation#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(TypeSet value);

	/**
	 * Returns the value of the '<em><b>All Sources</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Sources</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Sources</em>' attribute.
	 * @see #setAllSources(boolean)
	 * @see org.osate.emv3.emv3.Emv3Package#getTypeTransformation_AllSources()
	 * @model
	 * @generated
	 */
	boolean isAllSources();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.TypeTransformation#isAllSources <em>All Sources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Sources</em>' attribute.
	 * @see #isAllSources()
	 * @generated
	 */
	void setAllSources(boolean value);

	/**
	 * Returns the value of the '<em><b>Contributor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contributor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributor</em>' containment reference.
	 * @see #setContributor(TypeSet)
	 * @see org.osate.emv3.emv3.Emv3Package#getTypeTransformation_Contributor()
	 * @model containment="true"
	 * @generated
	 */
	TypeSet getContributor();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.TypeTransformation#getContributor <em>Contributor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contributor</em>' containment reference.
	 * @see #getContributor()
	 * @generated
	 */
	void setContributor(TypeSet value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(TypeSet)
	 * @see org.osate.emv3.emv3.Emv3Package#getTypeTransformation_Target()
	 * @model containment="true"
	 * @generated
	 */
	TypeSet getTarget();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.TypeTransformation#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TypeSet value);

} // TypeTransformation
