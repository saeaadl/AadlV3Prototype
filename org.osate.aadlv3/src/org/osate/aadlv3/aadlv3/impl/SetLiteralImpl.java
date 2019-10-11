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
package org.osate.aadlv3.aadlv3.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.osate.aadlv3.aadlv3.Aadlv3Package;
import org.osate.aadlv3.aadlv3.Expression;
import org.osate.aadlv3.aadlv3.SetLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SetLiteralImpl extends ECollectionImpl implements SetLiteral {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadlv3Package.Literals.SET_LITERAL;
	}

	@Override
	public String toString() {
		String values = "";
		for (Expression elem : this.getElements()) {
			values = values + (values.isEmpty() ? elem.toString() : ", " + elem.toString());
		}
		return "{" + values + "}";
	}

	@Override
	public boolean add(Expression obj) {
		if (!this.contains(obj)) {
			this.getElements().add(obj);
			return true;
		}
		return false;
	}

	@Override
	public boolean remove(EList<Expression> subCollection) {
		if (this.getElements().isEmpty() || subCollection.isEmpty())
			return false;
		Collection<Expression> removeme = new UniqueEList<Expression>();
		for (Expression subelement : subCollection) {
			for (Expression elem : this.getElements()) {
				if (elem.sameAs(subelement)) {
					removeme.add(elem);
				}
			}
		}
		return this.getElements().removeAll(removeme);
	}

} //SetLiteralImpl
