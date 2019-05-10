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
 * A representation of the literals of the enumeration '<em><b>Feature Category</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getFeatureCategory()
 * @model
 * @generated
 */
public enum FeatureCategory implements Enumerator {
	/**
	 * The '<em><b>Feature</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEATURE_VALUE
	 * @generated
	 * @ordered
	 */
	FEATURE(0, "feature", "feature"),

	/**
	 * The '<em><b>Port</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PORT_VALUE
	 * @generated
	 * @ordered
	 */
	PORT(1, "port", "port"),

	/**
	 * The '<em><b>Dataaccess</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATAACCESS_VALUE
	 * @generated
	 * @ordered
	 */
	DATAACCESS(2, "dataaccess", "data access"),

	/**
	 * The '<em><b>Busaccess</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSACCESS_VALUE
	 * @generated
	 * @ordered
	 */
	BUSACCESS(3, "busaccess", "bus access"),

	/**
	 * The '<em><b>Bindingpoint</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BINDINGPOINT_VALUE
	 * @generated
	 * @ordered
	 */
	BINDINGPOINT(4, "bindingpoint", "binding point"),

	/**
	 * The '<em><b>Interface</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERFACE_VALUE
	 * @generated
	 * @ordered
	 */
	INTERFACE(5, "interface", "interface"),
	/**
	 * The '<em><b>Virtualbusaccess</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #VIRTUALBUSACCESS_VALUE
	 * @generated
	 * @ordered
	 */
	VIRTUALBUSACCESS(6, "virtualbusaccess", "virtual bus access"),
	/**
	 * The '<em><b>Subprogramaccess</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #SUBPROGRAMACCESS_VALUE
	 * @generated
	 * @ordered
	 */
	SUBPROGRAMACCESS(7, "subprogramaccess", "subprogram access"),
	/**
	 * The '<em><b>Subprogramgroupaccess</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #SUBPROGRAMGROUPACCESS_VALUE
	 * @generated
	 * @ordered
	 */
	SUBPROGRAMGROUPACCESS(8, "subprogramgroupaccess", "subprogram group access"),
	/**
	* The '<em><b>Parameter</b></em>' literal object.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #PARAMETER_VALUE
	* @generated
	* @ordered
	*/
	PARAMETER(9, "parameter", "parameter");

	/**
	 * The '<em><b>Feature</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Feature</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FEATURE
	 * @model name="feature"
	 * @generated
	 * @ordered
	 */
	public static final int FEATURE_VALUE = 0;

	/**
	 * The '<em><b>Port</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Port</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PORT
	 * @model name="port"
	 * @generated
	 * @ordered
	 */
	public static final int PORT_VALUE = 1;

	/**
	 * The '<em><b>Dataaccess</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dataaccess</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATAACCESS
	 * @model name="dataaccess" literal="data access"
	 * @generated
	 * @ordered
	 */
	public static final int DATAACCESS_VALUE = 2;

	/**
	 * The '<em><b>Busaccess</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Busaccess</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUSACCESS
	 * @model name="busaccess" literal="bus access"
	 * @generated
	 * @ordered
	 */
	public static final int BUSACCESS_VALUE = 3;

	/**
	 * The '<em><b>Bindingpoint</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bindingpoint</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BINDINGPOINT
	 * @model name="bindingpoint" literal="binding point"
	 * @generated
	 * @ordered
	 */
	public static final int BINDINGPOINT_VALUE = 4;

	/**
	 * The '<em><b>Interface</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Interface</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERFACE
	 * @model name="interface"
	 * @generated
	 * @ordered
	 */
	public static final int INTERFACE_VALUE = 5;

	/**
	 * The '<em><b>Virtualbusaccess</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Virtualbusaccess</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VIRTUALBUSACCESS
	 * @model name="virtualbusaccess" literal="virtual bus access"
	 * @generated
	 * @ordered
	 */
	public static final int VIRTUALBUSACCESS_VALUE = 6;

	/**
	 * The '<em><b>Subprogramaccess</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Subprogramaccess</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBPROGRAMACCESS
	 * @model name="subprogramaccess" literal="subprogram access"
	 * @generated
	 * @ordered
	 */
	public static final int SUBPROGRAMACCESS_VALUE = 7;

	/**
	 * The '<em><b>Subprogramgroupaccess</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Subprogramgroupaccess</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBPROGRAMGROUPACCESS
	 * @model name="subprogramgroupaccess" literal="subprogram group access"
	 * @generated
	 * @ordered
	 */
	public static final int SUBPROGRAMGROUPACCESS_VALUE = 8;

	/**
	 * The '<em><b>Parameter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAMETER
	 * @model name="parameter"
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETER_VALUE = 9;

	/**
	 * An array of all the '<em><b>Feature Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FeatureCategory[] VALUES_ARRAY = new FeatureCategory[] { FEATURE, PORT, DATAACCESS, BUSACCESS,
			BINDINGPOINT, INTERFACE, VIRTUALBUSACCESS, SUBPROGRAMACCESS, SUBPROGRAMGROUPACCESS, PARAMETER, };

	/**
	 * A public read-only list of all the '<em><b>Feature Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FeatureCategory> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Feature Category</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FeatureCategory get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FeatureCategory result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Feature Category</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FeatureCategory getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FeatureCategory result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Feature Category</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FeatureCategory get(int value) {
		switch (value) {
		case FEATURE_VALUE:
			return FEATURE;
		case PORT_VALUE:
			return PORT;
		case DATAACCESS_VALUE:
			return DATAACCESS;
		case BUSACCESS_VALUE:
			return BUSACCESS;
		case BINDINGPOINT_VALUE:
			return BINDINGPOINT;
		case INTERFACE_VALUE:
			return INTERFACE;
		case VIRTUALBUSACCESS_VALUE:
			return VIRTUALBUSACCESS;
		case SUBPROGRAMACCESS_VALUE:
			return SUBPROGRAMACCESS;
		case SUBPROGRAMGROUPACCESS_VALUE:
			return SUBPROGRAMGROUPACCESS;
		case PARAMETER_VALUE:
			return PARAMETER;
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
	private FeatureCategory(int value, String name, String literal) {
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

} //FeatureCategory
