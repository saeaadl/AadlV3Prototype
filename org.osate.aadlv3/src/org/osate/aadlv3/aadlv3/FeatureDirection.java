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
 * A representation of the literals of the enumeration '<em><b>Feature Direction</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getFeatureDirection()
 * @model
 * @generated
 */
public enum FeatureDirection implements Enumerator {
	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "NONE", "none"),

	/**
	 * The '<em><b>IN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_VALUE
	 * @generated
	 * @ordered
	 */
	IN(1, "IN", "in"),

	/**
	 * The '<em><b>OUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUT_VALUE
	 * @generated
	 * @ordered
	 */
	OUT(2, "OUT", "out"),

	/**
	 * The '<em><b>INOUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INOUT_VALUE
	 * @generated
	 * @ordered
	 */
	INOUT(3, "INOUT", "in out"),

	/**
	 * The '<em><b>REQUIRES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUIRES_VALUE
	 * @generated
	 * @ordered
	 */
	REQUIRES(4, "REQUIRES", "requires"),

	/**
	 * The '<em><b>PROVIDES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROVIDES_VALUE
	 * @generated
	 * @ordered
	 */
	PROVIDES(5, "PROVIDES", "provides"),

	/**
	 * The '<em><b>REQUIRESOUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUIRESOUT_VALUE
	 * @generated
	 * @ordered
	 */
	REQUIRESOUT(6, "REQUIRESOUT", "requires out"),
	/**
	 * The '<em><b>REQUIRESINOUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #REQUIRESINOUT_VALUE
	 * @generated
	 * @ordered
	 */
	REQUIRESINOUT(7, "REQUIRESINOUT", "requires in out"),
	/**
	 * The '<em><b>REQUIRESIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #REQUIRESIN_VALUE
	 * @generated
	 * @ordered
	 */
	REQUIRESIN(8, "REQUIRESIN", "requires in"),
	/**
	 * The '<em><b>PROVIDESOUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #PROVIDESOUT_VALUE
	 * @generated
	 * @ordered
	 */
	PROVIDESOUT(9, "PROVIDESOUT", "provides out"),
	/**
	 * The '<em><b>PROVIDESINOUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #PROVIDESINOUT_VALUE
	 * @generated
	 * @ordered
	 */
	PROVIDESINOUT(10, "PROVIDESINOUT", "provides in out"),
	/**
	 * The '<em><b>PROVIDESIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #PROVIDESIN_VALUE
	 * @generated
	 * @ordered
	 */
	PROVIDESIN(11, "PROVIDESIN", "provides in");

	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model literal="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>IN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IN
	 * @model literal="in"
	 * @generated
	 * @ordered
	 */
	public static final int IN_VALUE = 1;

	/**
	 * The '<em><b>OUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OUT
	 * @model literal="out"
	 * @generated
	 * @ordered
	 */
	public static final int OUT_VALUE = 2;

	/**
	 * The '<em><b>INOUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INOUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INOUT
	 * @model literal="in out"
	 * @generated
	 * @ordered
	 */
	public static final int INOUT_VALUE = 3;

	/**
	 * The '<em><b>REQUIRES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REQUIRES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUIRES
	 * @model literal="requires"
	 * @generated
	 * @ordered
	 */
	public static final int REQUIRES_VALUE = 4;

	/**
	 * The '<em><b>PROVIDES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROVIDES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROVIDES
	 * @model literal="provides"
	 * @generated
	 * @ordered
	 */
	public static final int PROVIDES_VALUE = 5;

	/**
	 * The '<em><b>REQUIRESOUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REQUIRESOUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUIRESOUT
	 * @model literal="requires out"
	 * @generated
	 * @ordered
	 */
	public static final int REQUIRESOUT_VALUE = 6;

	/**
	 * The '<em><b>REQUIRESINOUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REQUIRESINOUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUIRESINOUT
	 * @model literal="requires in out"
	 * @generated
	 * @ordered
	 */
	public static final int REQUIRESINOUT_VALUE = 7;

	/**
	 * The '<em><b>REQUIRESIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REQUIRESIN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUIRESIN
	 * @model literal="requires in"
	 * @generated
	 * @ordered
	 */
	public static final int REQUIRESIN_VALUE = 8;

	/**
	 * The '<em><b>PROVIDESOUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROVIDESOUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROVIDESOUT
	 * @model literal="provides out"
	 * @generated
	 * @ordered
	 */
	public static final int PROVIDESOUT_VALUE = 9;

	/**
	 * The '<em><b>PROVIDESINOUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROVIDESINOUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROVIDESINOUT
	 * @model literal="provides in out"
	 * @generated
	 * @ordered
	 */
	public static final int PROVIDESINOUT_VALUE = 10;

	/**
	 * The '<em><b>PROVIDESIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROVIDESIN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROVIDESIN
	 * @model literal="provides in"
	 * @generated
	 * @ordered
	 */
	public static final int PROVIDESIN_VALUE = 11;

	/**
	 * An array of all the '<em><b>Feature Direction</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FeatureDirection[] VALUES_ARRAY = new FeatureDirection[] { NONE, IN, OUT, INOUT, REQUIRES,
			PROVIDES, REQUIRESOUT, REQUIRESINOUT, REQUIRESIN, PROVIDESOUT, PROVIDESINOUT, PROVIDESIN, };

	/**
	 * A public read-only list of all the '<em><b>Feature Direction</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FeatureDirection> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Feature Direction</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FeatureDirection get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FeatureDirection result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Feature Direction</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FeatureDirection getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FeatureDirection result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Feature Direction</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FeatureDirection get(int value) {
		switch (value) {
		case NONE_VALUE:
			return NONE;
		case IN_VALUE:
			return IN;
		case OUT_VALUE:
			return OUT;
		case INOUT_VALUE:
			return INOUT;
		case REQUIRES_VALUE:
			return REQUIRES;
		case PROVIDES_VALUE:
			return PROVIDES;
		case REQUIRESOUT_VALUE:
			return REQUIRESOUT;
		case REQUIRESINOUT_VALUE:
			return REQUIRESINOUT;
		case REQUIRESIN_VALUE:
			return REQUIRESIN;
		case PROVIDESOUT_VALUE:
			return PROVIDESOUT;
		case PROVIDESINOUT_VALUE:
			return PROVIDESINOUT;
		case PROVIDESIN_VALUE:
			return PROVIDESIN;
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
	private FeatureDirection(int value, String name, String literal) {
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

} //FeatureDirection
