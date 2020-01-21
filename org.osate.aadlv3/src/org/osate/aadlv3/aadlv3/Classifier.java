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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.Classifier#getCategory <em>Category</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.Classifier#getSuperClassifiers <em>Super Classifiers</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.Classifier#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.Classifier#getBehaviors <em>Behaviors</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.Classifier#getStateVariables <em>State Variables</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.Classifier#getGenerators <em>Generators</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.Classifier#getAnnexSubclause <em>Annex Subclause</em>}</li>
 * </ul>
 *
 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getClassifier()
 * @model abstract="true"
 * @generated
 */
public interface Classifier extends NamedType {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The default value is <code>"interface"</code>.
	 * The literals are from the enumeration {@link org.osate.aadlv3.aadlv3.ComponentCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see org.osate.aadlv3.aadlv3.ComponentCategory
	 * @see #setCategory(ComponentCategory)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getClassifier_Category()
	 * @model default="interface"
	 * @generated
	 */
	ComponentCategory getCategory();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.Classifier#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see org.osate.aadlv3.aadlv3.ComponentCategory
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(ComponentCategory value);

	/**
	 * Returns the value of the '<em><b>Super Classifiers</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.TypeReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Classifiers</em>' containment reference list.
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getClassifier_SuperClassifiers()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeReference> getSuperClassifiers();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.StateTransition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getClassifier_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<StateTransition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Behaviors</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.Behavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviors</em>' containment reference list.
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getClassifier_Behaviors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Behavior> getBehaviors();

	/**
	 * Returns the value of the '<em><b>State Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.StateVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Variables</em>' containment reference list.
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getClassifier_StateVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<StateVariable> getStateVariables();

	/**
	 * Returns the value of the '<em><b>Generators</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.Generator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generators</em>' containment reference list.
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getClassifier_Generators()
	 * @model containment="true"
	 * @generated
	 */
	EList<Generator> getGenerators();

	/**
	 * Returns the value of the '<em><b>Annex Subclause</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.AnnexSubclause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annex Subclause</em>' containment reference list.
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getClassifier_AnnexSubclause()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnnexSubclause> getAnnexSubclause();

} // Classifier
