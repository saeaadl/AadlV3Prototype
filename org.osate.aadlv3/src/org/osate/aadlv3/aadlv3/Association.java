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
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadlv3.aadlv3.Association#getAssociationType <em>Association Type</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.Association#getBindingType <em>Binding Type</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.Association#getSource <em>Source</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.Association#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.Association#isBidirectional <em>Bidirectional</em>}</li>
 *   <li>{@link org.osate.aadlv3.aadlv3.Association#getAnnexSubclause <em>Annex Subclause</em>}</li>
 * </ul>
 *
 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getAssociation()
 * @model
 * @generated
 */
public interface Association extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Association Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.osate.aadlv3.aadlv3.AssociationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Type</em>' attribute.
	 * @see org.osate.aadlv3.aadlv3.AssociationType
	 * @see #setAssociationType(AssociationType)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getAssociation_AssociationType()
	 * @model
	 * @generated
	 */
	AssociationType getAssociationType();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.Association#getAssociationType <em>Association Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association Type</em>' attribute.
	 * @see org.osate.aadlv3.aadlv3.AssociationType
	 * @see #getAssociationType()
	 * @generated
	 */
	void setAssociationType(AssociationType value);

	/**
	 * Returns the value of the '<em><b>Binding Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Type</em>' reference.
	 * @see #setBindingType(EObject)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getAssociation_BindingType()
	 * @model
	 * @generated
	 */
	EObject getBindingType();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.Association#getBindingType <em>Binding Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Type</em>' reference.
	 * @see #getBindingType()
	 * @generated
	 */
	void setBindingType(EObject value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(NamedElementReference)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getAssociation_Source()
	 * @model containment="true"
	 * @generated
	 */
	NamedElementReference getSource();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.Association#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(NamedElementReference value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' containment reference.
	 * @see #setDestination(NamedElementReference)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getAssociation_Destination()
	 * @model containment="true"
	 * @generated
	 */
	NamedElementReference getDestination();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.Association#getDestination <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' containment reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(NamedElementReference value);

	/**
	 * Returns the value of the '<em><b>Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bidirectional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bidirectional</em>' attribute.
	 * @see #setBidirectional(boolean)
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getAssociation_Bidirectional()
	 * @model
	 * @generated
	 */
	boolean isBidirectional();

	/**
	 * Sets the value of the '{@link org.osate.aadlv3.aadlv3.Association#isBidirectional <em>Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bidirectional</em>' attribute.
	 * @see #isBidirectional()
	 * @generated
	 */
	void setBidirectional(boolean value);

	/**
	 * Returns the value of the '<em><b>Annex Subclause</b></em>' reference list.
	 * The list contents are of type {@link org.osate.aadlv3.aadlv3.AnnexSubclause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annex Subclause</em>' reference list.
	 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getAssociation_AnnexSubclause()
	 * @model
	 * @generated
	 */
	EList<AnnexSubclause> getAnnexSubclause();

} // Association
