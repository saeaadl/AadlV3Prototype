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
	 * The '<em><b>Featureconnection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEATURECONNECTION_VALUE
	 * @generated
	 * @ordered
	 */
	FEATURECONNECTION(0, "featureconnection", "feature connection"),

	/**
	 * The '<em><b>Busconnection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSCONNECTION_VALUE
	 * @generated
	 * @ordered
	 */
	BUSCONNECTION(1, "busconnection", "bus connection"),

	/**
	 * The '<em><b>Binding</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BINDING_VALUE
	 * @generated
	 * @ordered
	 */
	BINDING(2, "binding", "binding"),

	/**
	 * The '<em><b>Interfaceconnection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERFACECONNECTION_VALUE
	 * @generated
	 * @ordered
	 */
	INTERFACECONNECTION(3, "interfaceconnection", "interface connection"),

	/**
	 * The '<em><b>Portconnection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PORTCONNECTION_VALUE
	 * @generated
	 * @ordered
	 */
	PORTCONNECTION(4, "portconnection", "port connection"),

	/**
	 * The '<em><b>Dataconnection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATACONNECTION_VALUE
	 * @generated
	 * @ordered
	 */
	DATACONNECTION(5, "dataconnection", "data connection"),

	/**
	 * The '<em><b>Flowpath</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOWPATH_VALUE
	 * @generated
	 * @ordered
	 */
	FLOWPATH(6, "flowpath", "flow path"),

	/**
	 * The '<em><b>Flowsource</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOWSOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	FLOWSOURCE(7, "flowsource", "flow source"),

	/**
	 * The '<em><b>Flowsink</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOWSINK_VALUE
	 * @generated
	 * @ordered
	 */
	FLOWSINK(8, "flowsink", "flow sink"),

	/**
	 * The '<em><b>Featuremapping</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEATUREMAPPING_VALUE
	 * @generated
	 * @ordered
	 */
	FEATUREMAPPING(9, "featuremapping", "feature mapping");

	/**
	 * The '<em><b>Featureconnection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Featureconnection</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FEATURECONNECTION
	 * @model name="featureconnection" literal="feature connection"
	 * @generated
	 * @ordered
	 */
	public static final int FEATURECONNECTION_VALUE = 0;

	/**
	 * The '<em><b>Busconnection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Busconnection</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUSCONNECTION
	 * @model name="busconnection" literal="bus connection"
	 * @generated
	 * @ordered
	 */
	public static final int BUSCONNECTION_VALUE = 1;

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
	public static final int BINDING_VALUE = 2;

	/**
	 * The '<em><b>Interfaceconnection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Interfaceconnection</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERFACECONNECTION
	 * @model name="interfaceconnection" literal="interface connection"
	 * @generated
	 * @ordered
	 */
	public static final int INTERFACECONNECTION_VALUE = 3;

	/**
	 * The '<em><b>Portconnection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Portconnection</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PORTCONNECTION
	 * @model name="portconnection" literal="port connection"
	 * @generated
	 * @ordered
	 */
	public static final int PORTCONNECTION_VALUE = 4;

	/**
	 * The '<em><b>Dataconnection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dataconnection</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATACONNECTION
	 * @model name="dataconnection" literal="data connection"
	 * @generated
	 * @ordered
	 */
	public static final int DATACONNECTION_VALUE = 5;

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
	public static final int FLOWPATH_VALUE = 6;

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
	public static final int FLOWSOURCE_VALUE = 7;

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
	public static final int FLOWSINK_VALUE = 8;

	/**
	 * The '<em><b>Featuremapping</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Featuremapping</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FEATUREMAPPING
	 * @model name="featuremapping" literal="feature mapping"
	 * @generated
	 * @ordered
	 */
	public static final int FEATUREMAPPING_VALUE = 9;

	/**
	 * An array of all the '<em><b>Association Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AssociationType[] VALUES_ARRAY = new AssociationType[] { FEATURECONNECTION, BUSCONNECTION,
			BINDING, INTERFACECONNECTION, PORTCONNECTION, DATACONNECTION, FLOWPATH, FLOWSOURCE, FLOWSINK,
			FEATUREMAPPING, };

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
		case FEATURECONNECTION_VALUE:
			return FEATURECONNECTION;
		case BUSCONNECTION_VALUE:
			return BUSCONNECTION;
		case BINDING_VALUE:
			return BINDING;
		case INTERFACECONNECTION_VALUE:
			return INTERFACECONNECTION;
		case PORTCONNECTION_VALUE:
			return PORTCONNECTION;
		case DATACONNECTION_VALUE:
			return DATACONNECTION;
		case FLOWPATH_VALUE:
			return FLOWPATH;
		case FLOWSOURCE_VALUE:
			return FLOWSOURCE;
		case FLOWSINK_VALUE:
			return FLOWSINK;
		case FEATUREMAPPING_VALUE:
			return FEATUREMAPPING;
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
