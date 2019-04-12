/**
 * Copyright Text	Copyright 2018 Carnegie Mellon University. All Rights Reserved....
 */
package org.osate.emv3.emv3;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadlv3.aadlv3.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualified Propagation Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.emv3.emv3.QualifiedPropagationPoint#getSubcomponent <em>Subcomponent</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.QualifiedPropagationPoint#getNext <em>Next</em>}</li>
 *   <li>{@link org.osate.emv3.emv3.QualifiedPropagationPoint#getPropagationPoint <em>Propagation Point</em>}</li>
 * </ul>
 *
 * @see org.osate.emv3.emv3.Emv3Package#getQualifiedPropagationPoint()
 * @model
 * @generated
 */
public interface QualifiedPropagationPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Subcomponent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subcomponent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subcomponent</em>' containment reference.
	 * @see #setSubcomponent(SubcomponentElement)
	 * @see org.osate.emv3.emv3.Emv3Package#getQualifiedPropagationPoint_Subcomponent()
	 * @model containment="true"
	 * @generated
	 */
	SubcomponentElement getSubcomponent();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.QualifiedPropagationPoint#getSubcomponent <em>Subcomponent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subcomponent</em>' containment reference.
	 * @see #getSubcomponent()
	 * @generated
	 */
	void setSubcomponent(SubcomponentElement value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' containment reference.
	 * @see #setNext(QualifiedPropagationPoint)
	 * @see org.osate.emv3.emv3.Emv3Package#getQualifiedPropagationPoint_Next()
	 * @model containment="true"
	 * @generated
	 */
	QualifiedPropagationPoint getNext();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.QualifiedPropagationPoint#getNext <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' containment reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(QualifiedPropagationPoint value);

	/**
	 * Returns the value of the '<em><b>Propagation Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Propagation Point</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propagation Point</em>' reference.
	 * @see #setPropagationPoint(NamedElement)
	 * @see org.osate.emv3.emv3.Emv3Package#getQualifiedPropagationPoint_PropagationPoint()
	 * @model
	 * @generated
	 */
	NamedElement getPropagationPoint();

	/**
	 * Sets the value of the '{@link org.osate.emv3.emv3.QualifiedPropagationPoint#getPropagationPoint <em>Propagation Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Propagation Point</em>' reference.
	 * @see #getPropagationPoint()
	 * @generated
	 */
	void setPropagationPoint(NamedElement value);

} // QualifiedPropagationPoint
