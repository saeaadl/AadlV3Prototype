/**
 * Copyright Text	Copyright 2018 Carnegie Mellon University. All Rights Reserved....
 */
package org.osate.emv3.emv3;

import org.eclipse.emf.common.util.EList;

import org.osate.aadlv3.aadlv3.PackageElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Transformation Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.emv3.emv3.TypeTransformationSet#getUseTypes <em>Use Types</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.TypeTransformationSet#getTransformation <em>Transformation</em>}</li>
 * </ul>
 *
 * @see org.osate.emv3.emv3.Emv3Package#getTypeTransformationSet()
 * @model
 * @generated
 */
public interface TypeTransformationSet extends PackageElement {
	/**
	 * Returns the value of the '<em><b>Use Types</b></em>' reference list.
	 * The list contents are of type {@link org.osate.emv3.emv3.ErrorModelLibrary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Types</em>' reference list.
	 * @see org.osate.emv3.emv3.Emv3Package#getTypeTransformationSet_UseTypes()
	 * @model
	 * @generated
	 */
	EList<ErrorModelLibrary> getUseTypes();

	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.emv3.emv3.TypeTransformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' containment reference list.
	 * @see org.osate.emv3.emv3.Emv3Package#getTypeTransformationSet_Transformation()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeTransformation> getTransformation();

} // TypeTransformationSet
