/**
 * Copyright Text	Copyright 2018 Carnegie Mellon University. All Rights Reserved....
 */
package org.osate.emv3.emv3;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadlv3.aadlv3.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subcomponent Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.emv3.emv3.SubcomponentElement#getSubcomponent <em>Subcomponent</em>}</li>
 * </ul>
 *
 * @see org.osate.emv3.emv3.Emv3Package#getSubcomponentElement()
 * @model
 * @generated
 */
public interface SubcomponentElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subcomponent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subcomponent</em>' reference.
	 * @see #setSubcomponent(Component)
	 * @see org.osate.emv3.emv3.Emv3Package#getSubcomponentElement_Subcomponent()
	 * @model
	 * @generated
	 */
	Component getSubcomponent();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.SubcomponentElement#getSubcomponent <em>Subcomponent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subcomponent</em>' reference.
	 * @see #getSubcomponent()
	 * @generated
	 */
	void setSubcomponent(Component value);

} // SubcomponentElement
