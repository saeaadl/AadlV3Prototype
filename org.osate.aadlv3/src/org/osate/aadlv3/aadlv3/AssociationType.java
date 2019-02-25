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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Association Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getAssociationType()
 * @model
 * @generated
 */
public enum AssociationType implements Enumerator {
	/**
	 * The '<em><b>Connection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTION_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECTION(0, "connection", "connection"),
	/**
	 * The '<em><b>Binding</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #BINDING_VALUE
	 * @generated
	 * @ordered
	 */
	BINDING(1, "binding", "binding"),

	/**
	 * The '<em><b>Featuredelegate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEATUREDELEGATE_VALUE
	 * @generated
	 * @ordered
	 */
	FEATUREDELEGATE(2, "featuredelegate", "feature delegate"),
	/**
	 * The '<em><b>Flowpath</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #FLOWPATH_VALUE
	 * @generated
	 * @ordered
	 */
	FLOWPATH(3, "flowpath", "flow path"),
	/**
	 * The '<em><b>Flowsource</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #FLOWSOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	FLOWSOURCE(4, "flowsource", "flow source"),
	/**
	 * The '<em><b>Flowsink</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #FLOWSINK_VALUE
	 * @generated
	 * @ordered
	 */
	FLOWSINK(5, "flowsink", "flow sink"),
	/**
	 * The '<em><b>Flow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOW_VALUE
	 * @generated
	 * @ordered
	 */
	FLOW(6, "flow", "flow");

	/**
	 * The '<em><b>Connection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Connection</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONNECTION
	 * @model name="connection"
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTION_VALUE = 0;

	/**
	 * The '<em><b>Binding</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Binding</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BINDING
	 * @model name="binding"
	 * @generated
	 * @ordered
	 */
	public static final int BINDING_VALUE = 1;

	/**
	 * The '<em><b>Featuredelegate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Featuredelegate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FEATUREDELEGATE
	 * @model name="featuredelegate" literal="feature delegate"
	 * @generated
	 * @ordered
	 */
	public static final int FEATUREDELEGATE_VALUE = 2;

	/**
	 * The '<em><b>Flowpath</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Flowpath</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLOWPATH
	 * @model name="flowpath" literal="flow path"
	 * @generated
	 * @ordered
	 */
	public static final int FLOWPATH_VALUE = 3;

	/**
	 * The '<em><b>Flowsource</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Flowsource</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLOWSOURCE
	 * @model name="flowsource" literal="flow source"
	 * @generated
	 * @ordered
	 */
	public static final int FLOWSOURCE_VALUE = 4;

	/**
	 * The '<em><b>Flowsink</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Flowsink</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLOWSINK
	 * @model name="flowsink" literal="flow sink"
	 * @generated
	 * @ordered
	 */
	public static final int FLOWSINK_VALUE = 5;

	/**
	 * The '<em><b>Flow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Flow</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLOW
	 * @model name="flow"
	 * @generated
	 * @ordered
	 */
	public static final int FLOW_VALUE = 6;

	/**
	 * An array of all the '<em><b>Association Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AssociationType[] VALUES_ARRAY = new AssociationType[] { CONNECTION, BINDING, FEATUREDELEGATE,
			FLOWPATH, FLOWSOURCE, FLOWSINK, FLOW, };

	/**
	 * A public read-only list of all the '<em><b>Association Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AssociationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Association Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AssociationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssociationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Association Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AssociationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssociationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Association Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AssociationType get(int value) {
		switch (value) {
		case CONNECTION_VALUE:
			return CONNECTION;
		case BINDING_VALUE:
			return BINDING;
		case FEATUREDELEGATE_VALUE:
			return FEATUREDELEGATE;
		case FLOWPATH_VALUE:
			return FLOWPATH;
		case FLOWSOURCE_VALUE:
			return FLOWSOURCE;
		case FLOWSINK_VALUE:
			return FLOWSINK;
		case FLOW_VALUE:
			return FLOW;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AssociationType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //AssociationType
