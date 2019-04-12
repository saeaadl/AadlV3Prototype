/**
 * Copyright Text	Copyright 2018 Carnegie Mellon University. All Rights Reserved....
 */
package org.osate.emv3.emv3;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.emv3.emv3.AndExpression#getOperands <em>Operands</em>}</li>
 * </ul>
 *
 * @see org.osate.emv3.emv3.Emv3Package#getAndExpression()
 * @model
 * @generated
 */
public interface AndExpression extends ConditionExpression {
	/**
	 * Returns the value of the '<em><b>Operands</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.emv3.emv3.ConditionExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operands</em>' containment reference list.
	 * @see org.osate.emv3.emv3.Emv3Package#getAndExpression_Operands()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConditionExpression> getOperands();

} // AndExpression
