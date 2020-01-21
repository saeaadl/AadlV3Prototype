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
package org.osate.av3instance.av3instance;

import org.eclipse.emf.common.util.EList;
import org.osate.aadlv3.aadlv3.Generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.av3instance.av3instance.GeneratorInstance#getGenerator <em>Generator</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.GeneratorInstance#getGeneratedLiterals <em>Generated Literals</em>}</li>
 *   <li>{@link org.osate.av3instance.av3instance.GeneratorInstance#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.osate.av3instance.av3instance.Av3instancePackage#getGeneratorInstance()
 * @model
 * @generated
 */
public interface GeneratorInstance extends InstanceObject {
	/**
	 * Returns the value of the '<em><b>Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator</em>' reference.
	 * @see #setGenerator(Generator)
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getGeneratorInstance_Generator()
	 * @model
	 * @generated
	 */
	Generator getGenerator();

	/**
	 * Sets the value of the '{@link org.osate.av3instance.av3instance.GeneratorInstance#getGenerator <em>Generator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator</em>' reference.
	 * @see #getGenerator()
	 * @generated
	 */
	void setGenerator(Generator value);

	/**
	 * Returns the value of the '<em><b>Generated Literals</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.av3instance.av3instance.ConstrainedInstanceObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Literals</em>' containment reference list.
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getGeneratorInstance_GeneratedLiterals()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConstrainedInstanceObject> getGeneratedLiterals();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.osate.av3instance.av3instance.Av3instancePackage#getGeneratorInstance_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.osate.av3instance.av3instance.GeneratorInstance#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // GeneratorInstance
