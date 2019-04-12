/**
 * Copyright Text	Copyright 2018 Carnegie Mellon University. All Rights Reserved....
 */
package org.osate.emv3.emv3;

import org.osate.aadlv3.aadlv3.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Propagation Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.emv3.emv3.PropagationPath#getSource <em>Source</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.PropagationPath#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.osate.emv3.emv3.Emv3Package#getPropagationPath()
 * @model
 * @generated
 */
public interface PropagationPath extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(QualifiedPropagationPoint)
	 * @see org.osate.emv3.emv3.Emv3Package#getPropagationPath_Source()
	 * @model containment="true"
	 * @generated
	 */
	QualifiedPropagationPoint getSource();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.PropagationPath#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(QualifiedPropagationPoint value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(QualifiedPropagationPoint)
	 * @see org.osate.emv3.emv3.Emv3Package#getPropagationPath_Target()
	 * @model containment="true"
	 * @generated
	 */
	QualifiedPropagationPoint getTarget();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.PropagationPath#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(QualifiedPropagationPoint value);

} // PropagationPath
