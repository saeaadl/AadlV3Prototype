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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.TypeReference#isReverse <em>Reverse</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.TypeReference#getType <em>Type</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.TypeReference#getActuals <em>Actuals</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.TypeReference#getComponentinterface <em>Componentinterface</em>}</li>
 * </ul>
 *
 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getTypeReference()
 * @model
 * @generated
 */
public interface TypeReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reverse</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reverse</em>' attribute.
	 * @see #setReverse(boolean)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getTypeReference_Reverse()
	 * @model
	 * @generated
	 */
	boolean isReverse();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.TypeReference#isReverse <em>Reverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reverse</em>' attribute.
	 * @see #isReverse()
	 * @generated
	 */
	void setReverse(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getTypeReference_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.TypeReference#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Actuals</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.ConfigurationActual}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actuals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuals</em>' containment reference list.
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getTypeReference_Actuals()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigurationActual> getActuals();

	/**
	 * Returns the value of the '<em><b>Componentinterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Componentinterface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Componentinterface</em>' reference.
	 * @see #setComponentinterface(ComponentInterface)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getTypeReference_Componentinterface()
	 * @model
	 * @generated
	 */
	ComponentInterface getComponentinterface();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.TypeReference#getComponentinterface <em>Componentinterface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Componentinterface</em>' reference.
	 * @see #getComponentinterface()
	 * @generated
	 */
	void setComponentinterface(ComponentInterface value);

} // TypeReference
