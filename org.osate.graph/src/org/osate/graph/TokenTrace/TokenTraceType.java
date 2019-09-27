/**
 */
package org.osate.graph.TokenTrace;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.osate.graph.TokenTrace.TokenTracePackage#getTokenTraceType()
 * @model
 * @generated
 */
public enum TokenTraceType implements Enumerator {
	/**
	 * The '<em><b>Token Graph</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOKEN_GRAPH_VALUE
	 * @generated
	 * @ordered
	 */
	TOKEN_GRAPH(0, "TokenGraph", "TokenGraph"), /**
	 * The '<em><b>Token Trace</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOKEN_TRACE_VALUE
	 * @generated
	 * @ordered
	 */
	TOKEN_TRACE(1, "TokenTrace", "TokenTrace"),

	/**
	 * The '<em><b>Composite Parts</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPOSITE_PARTS_VALUE
	 * @generated
	 * @ordered
	 */
	COMPOSITE_PARTS(2, "CompositeParts", "CompositeParts"),

	/**
	 * The '<em><b>Minimal Cut Set</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINIMAL_CUT_SET_VALUE
	 * @generated
	 * @ordered
	 */
	MINIMAL_CUT_SET(3, "MinimalCutSet", "MinimalCutSet");

	/**
	 * The '<em><b>Token Graph</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOKEN_GRAPH
	 * @model name="TokenGraph"
	 * @generated
	 * @ordered
	 */
	public static final int TOKEN_GRAPH_VALUE = 0;

	/**
	 * The '<em><b>Token Trace</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOKEN_TRACE
	 * @model name="TokenTrace"
	 * @generated
	 * @ordered
	 */
	public static final int TOKEN_TRACE_VALUE = 1;

	/**
	 * The '<em><b>Composite Parts</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPOSITE_PARTS
	 * @model name="CompositeParts"
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_PARTS_VALUE = 2;

	/**
	 * The '<em><b>Minimal Cut Set</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINIMAL_CUT_SET
	 * @model name="MinimalCutSet"
	 * @generated
	 * @ordered
	 */
	public static final int MINIMAL_CUT_SET_VALUE = 3;

	/**
	 * An array of all the '<em><b>Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TokenTraceType[] VALUES_ARRAY =
		new TokenTraceType[] {
			TOKEN_GRAPH,
			TOKEN_TRACE,
			COMPOSITE_PARTS,
			MINIMAL_CUT_SET,
		};

	/**
	 * A public read-only list of all the '<em><b>Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TokenTraceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TokenTraceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TokenTraceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TokenTraceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TokenTraceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TokenTraceType get(int value) {
		switch (value) {
			case TOKEN_GRAPH_VALUE: return TOKEN_GRAPH;
			case TOKEN_TRACE_VALUE: return TOKEN_TRACE;
			case COMPOSITE_PARTS_VALUE: return COMPOSITE_PARTS;
			case MINIMAL_CUT_SET_VALUE: return MINIMAL_CUT_SET;
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
	private TokenTraceType(int value, String name, String literal) {
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
	
} //TokenTraceType
