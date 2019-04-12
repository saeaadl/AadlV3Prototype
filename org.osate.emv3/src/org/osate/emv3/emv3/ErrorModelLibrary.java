/**
 * Copyright Text	Copyright 2018 Carnegie Mellon University. All Rights Reserved....
 */
package org.osate.emv3.emv3;

import org.eclipse.emf.common.util.EList;

import org.osate.aadlv3.aadlv3.PackageDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Model Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.emv3.emv3.ErrorModelLibrary#getUseTypes <em>Use Types</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorModelLibrary#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorModelLibrary#getTypes <em>Types</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorModelLibrary#getTypesets <em>Typesets</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorModelLibrary#getBehaviors <em>Behaviors</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorModelLibrary#getMappings <em>Mappings</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.ErrorModelLibrary#getTransformations <em>Transformations</em>}</li>
 * </ul>
 *
 * @see org.osate.emv3.emv3.Emv3Package#getErrorModelLibrary()
 * @model
 * @generated
 */
public interface ErrorModelLibrary extends PackageDeclaration {
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
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorModelLibrary_UseTypes()
	 * @model
	 * @generated
	 */
	EList<ErrorModelLibrary> getUseTypes();

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference list.
	 * The list contents are of type {@link org.osate.emv3.emv3.ErrorModelLibrary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference list.
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorModelLibrary_Extends()
	 * @model
	 * @generated
	 */
	EList<ErrorModelLibrary> getExtends();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.emv3.emv3.ErrorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorModelLibrary_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<ErrorType> getTypes();

	/**
	 * Returns the value of the '<em><b>Typesets</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.emv3.emv3.TypeSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typesets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typesets</em>' containment reference list.
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorModelLibrary_Typesets()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeSet> getTypesets();

	/**
	 * Returns the value of the '<em><b>Behaviors</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.emv3.emv3.ErrorBehaviorStateMachine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behaviors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviors</em>' containment reference list.
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorModelLibrary_Behaviors()
	 * @model containment="true"
	 * @generated
	 */
	EList<ErrorBehaviorStateMachine> getBehaviors();

	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.emv3.emv3.TypeMappingSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' containment reference list.
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorModelLibrary_Mappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeMappingSet> getMappings();

	/**
	 * Returns the value of the '<em><b>Transformations</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.emv3.emv3.TypeTransformationSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformations</em>' containment reference list.
	 * @see org.osate.emv3.emv3.Emv3Package#getErrorModelLibrary_Transformations()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeTransformationSet> getTransformations();

} // ErrorModelLibrary
