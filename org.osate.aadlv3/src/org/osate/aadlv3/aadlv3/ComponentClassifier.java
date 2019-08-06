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
 * A representation of the model object '<em><b>Component Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.ComponentClassifier#getCategory <em>Category</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.ComponentClassifier#getSuperClassifiers <em>Super Classifiers</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.ComponentClassifier#getOwnedPropertyAssociations <em>Owned Property Associations</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.ComponentClassifier#getUseModes <em>Use Modes</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.ComponentClassifier#isInheritsModes <em>Inherits Modes</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.ComponentClassifier#getAnnexSubclause <em>Annex Subclause</em>}</li>
 * </ul>
 *
 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getComponentClassifier()
 * @model abstract="true"
 * @generated
 */
public interface ComponentClassifier extends PackageElement, ClassifierOrType {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The default value is <code>"interface"</code>.
	 * The literals are from the enumeration {@link org.osate.aadlv3.aadlv3.ComponentCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see org.osate.aadlv3.aadlv3.ComponentCategory
	 * @see #setCategory(ComponentCategory)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getComponentClassifier_Category()
	 * @model default="interface"
	 * @generated
	 */
	ComponentCategory getCategory();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.ComponentClassifier#getCategory <em>Category</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Super Classifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Classifiers</em>' containment reference list.
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getComponentClassifier_SuperClassifiers()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeReference> getSuperClassifiers();

	/**
	 * Returns the value of the '<em><b>Owned Property Associations</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.PropertyAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Property Associations</em>' containment reference list.
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getComponentClassifier_OwnedPropertyAssociations()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyAssociation> getOwnedPropertyAssociations();

	/**
	 * Returns the value of the '<em><b>Use Modes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Modes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Modes</em>' reference.
	 * @see #setUseModes(ModeStateMachine)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getComponentClassifier_UseModes()
	 * @model
	 * @generated
	 */
	ModeStateMachine getUseModes();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.ComponentClassifier#getUseModes <em>Use Modes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Modes</em>' reference.
	 * @see #getUseModes()
	 * @generated
	 */
	void setUseModes(ModeStateMachine value);

	/**
	 * Returns the value of the '<em><b>Inherits Modes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherits Modes</em>' attribute.
	 * @see #setInheritsModes(boolean)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getComponentClassifier_InheritsModes()
	 * @model
	 * @generated
	 */
	boolean isInheritsModes();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.ComponentClassifier#isInheritsModes <em>Inherits Modes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inherits Modes</em>' attribute.
	 * @see #isInheritsModes()
	 * @generated
	 */
	void setInheritsModes(boolean value);

	/**
	 * Returns the value of the '<em><b>Annex Subclause</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.AnnexSubclause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annex Subclause</em>' containment reference list.
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getComponentClassifier_AnnexSubclause()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnnexSubclause> getAnnexSubclause();

} // ComponentClassifier
