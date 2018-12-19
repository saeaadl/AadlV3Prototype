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
 * A representation of the literals of the enumeration '<em><b>Component Category</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.osate.aadlv3.aadlv3.Aadlv3Package#getComponentCategory()
 * @model
 * @generated
 */
public enum ComponentCategory implements Enumerator {
	/**
	 * The '<em><b>Interface</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERFACE_VALUE
	 * @generated
	 * @ordered
	 */
	INTERFACE(0, "interface", "interface"),
	/**
	 * The '<em><b>Thread</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #THREAD_VALUE
	 * @generated
	 * @ordered
	 */
	THREAD(1, "thread", "thread"),

	/**
	 * The '<em><b>System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	SYSTEM(2, "system", "system"),

	/**
	 * The '<em><b>Process</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESS_VALUE
	 * @generated
	 * @ordered
	 */
	PROCESS(3, "process", "process"),

	/**
	 * The '<em><b>Processor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESSOR_VALUE
	 * @generated
	 * @ordered
	 */
	PROCESSOR(4, "processor", "processor"),

	/**
	 * The '<em><b>Memory</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMORY_VALUE
	 * @generated
	 * @ordered
	 */
	MEMORY(5, "memory", "memory"),

	/**
	 * The '<em><b>Bus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUS_VALUE
	 * @generated
	 * @ordered
	 */
	BUS(6, "bus", "bus"),

	/**
	 * The '<em><b>Device</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE(7, "device", "device"),

	/**
	 * The '<em><b>Virtualbus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIRTUALBUS_VALUE
	 * @generated
	 * @ordered
	 */
	VIRTUALBUS(8, "virtualbus", "virtual bus"),

	/**
	 * The '<em><b>Virtualprocessor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIRTUALPROCESSOR_VALUE
	 * @generated
	 * @ordered
	 */
	VIRTUALPROCESSOR(9, "virtualprocessor", "virtual processor"),

	/**
	 * The '<em><b>Virtualmemory</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIRTUALMEMORY_VALUE
	 * @generated
	 * @ordered
	 */
	VIRTUALMEMORY(10, "virtualmemory", "virtual memory"),

	/**
	 * The '<em><b>Virtualdevice</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIRTUALDEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	VIRTUALDEVICE(11, "virtualdevice", "virtual device"),

	/**
	 * The '<em><b>Subprogram</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBPROGRAM_VALUE
	 * @generated
	 * @ordered
	 */
	SUBPROGRAM(11, "subprogram", "subprogram"),

	/**
	 * The '<em><b>Subprogramgroup</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBPROGRAMGROUP_VALUE
	 * @generated
	 * @ordered
	 */
	SUBPROGRAMGROUP(12, "subprogramgroup", "subprogram group"),

	/**
	 * The '<em><b>Threadgroup</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THREADGROUP_VALUE
	 * @generated
	 * @ordered
	 */
	THREADGROUP(13, "threadgroup", "thread group"),

	/**
	 * The '<em><b>Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_VALUE
	 * @generated
	 * @ordered
	 */
	DATA(14, "data", "data"),
	/**
	 * The '<em><b>Abstract</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #ABSTRACT_VALUE
	 * @generated
	 * @ordered
	 */
	ABSTRACT(15, "abstract", "abstract");

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
	public static final int INTERFACE_VALUE = 0;

	/**
	 * The '<em><b>Thread</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Thread</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THREAD
	 * @model name="thread"
	 * @generated
	 * @ordered
	 */
	public static final int THREAD_VALUE = 1;

	/**
	 * The '<em><b>System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>System</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYSTEM
	 * @model name="system"
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEM_VALUE = 2;

	/**
	 * The '<em><b>Process</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Process</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROCESS
	 * @model name="process"
	 * @generated
	 * @ordered
	 */
	public static final int PROCESS_VALUE = 3;

	/**
	 * The '<em><b>Processor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Processor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROCESSOR
	 * @model name="processor"
	 * @generated
	 * @ordered
	 */
	public static final int PROCESSOR_VALUE = 4;

	/**
	 * The '<em><b>Memory</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Memory</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEMORY
	 * @model name="memory"
	 * @generated
	 * @ordered
	 */
	public static final int MEMORY_VALUE = 5;

	/**
	 * The '<em><b>Bus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bus</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUS
	 * @model name="bus"
	 * @generated
	 * @ordered
	 */
	public static final int BUS_VALUE = 6;

	/**
	 * The '<em><b>Device</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Device</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEVICE
	 * @model name="device"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_VALUE = 7;

	/**
	 * The '<em><b>Virtualbus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Virtualbus</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VIRTUALBUS
	 * @model name="virtualbus" literal="virtual bus"
	 * @generated
	 * @ordered
	 */
	public static final int VIRTUALBUS_VALUE = 8;

	/**
	 * The '<em><b>Virtualprocessor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Virtualprocessor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VIRTUALPROCESSOR
	 * @model name="virtualprocessor" literal="virtual processor"
	 * @generated
	 * @ordered
	 */
	public static final int VIRTUALPROCESSOR_VALUE = 9;

	/**
	 * The '<em><b>Virtualmemory</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Virtualmemory</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VIRTUALMEMORY
	 * @model name="virtualmemory" literal="virtual memory"
	 * @generated
	 * @ordered
	 */
	public static final int VIRTUALMEMORY_VALUE = 10;

	/**
	 * The '<em><b>Virtualdevice</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Virtualdevice</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VIRTUALDEVICE
	 * @model name="virtualdevice" literal="virtual device"
	 * @generated
	 * @ordered
	 */
	public static final int VIRTUALDEVICE_VALUE = 11;

	/**
	 * The '<em><b>Subprogram</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Subprogram</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBPROGRAM
	 * @model name="subprogram"
	 * @generated
	 * @ordered
	 */
	public static final int SUBPROGRAM_VALUE = 11;

	/**
	 * The '<em><b>Subprogramgroup</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Subprogramgroup</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBPROGRAMGROUP
	 * @model name="subprogramgroup" literal="subprogram group"
	 * @generated
	 * @ordered
	 */
	public static final int SUBPROGRAMGROUP_VALUE = 12;

	/**
	 * The '<em><b>Threadgroup</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Threadgroup</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THREADGROUP
	 * @model name="threadgroup" literal="thread group"
	 * @generated
	 * @ordered
	 */
	public static final int THREADGROUP_VALUE = 13;

	/**
	 * The '<em><b>Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Data</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATA
	 * @model name="data"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_VALUE = 14;

	/**
	 * The '<em><b>Abstract</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Abstract</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABSTRACT
	 * @model name="abstract"
	 * @generated
	 * @ordered
	 */
	public static final int ABSTRACT_VALUE = 15;

	/**
	 * An array of all the '<em><b>Component Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ComponentCategory[] VALUES_ARRAY = new ComponentCategory[] { INTERFACE, THREAD, SYSTEM,
			PROCESS, PROCESSOR, MEMORY, BUS, DEVICE, VIRTUALBUS, VIRTUALPROCESSOR, VIRTUALMEMORY, VIRTUALDEVICE,
			SUBPROGRAM, SUBPROGRAMGROUP, THREADGROUP, DATA, ABSTRACT, };

	/**
	 * A public read-only list of all the '<em><b>Component Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ComponentCategory> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Component Category</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComponentCategory get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComponentCategory result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Component Category</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComponentCategory getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComponentCategory result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Component Category</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComponentCategory get(int value) {
		switch (value) {
		case INTERFACE_VALUE:
			return INTERFACE;
		case THREAD_VALUE:
			return THREAD;
		case SYSTEM_VALUE:
			return SYSTEM;
		case PROCESS_VALUE:
			return PROCESS;
		case PROCESSOR_VALUE:
			return PROCESSOR;
		case MEMORY_VALUE:
			return MEMORY;
		case BUS_VALUE:
			return BUS;
		case DEVICE_VALUE:
			return DEVICE;
		case VIRTUALBUS_VALUE:
			return VIRTUALBUS;
		case VIRTUALPROCESSOR_VALUE:
			return VIRTUALPROCESSOR;
		case VIRTUALMEMORY_VALUE:
			return VIRTUALMEMORY;
		case VIRTUALDEVICE_VALUE:
			return VIRTUALDEVICE;
		case SUBPROGRAMGROUP_VALUE:
			return SUBPROGRAMGROUP;
		case THREADGROUP_VALUE:
			return THREADGROUP;
		case DATA_VALUE:
			return DATA;
		case ABSTRACT_VALUE:
			return ABSTRACT;
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
	private ComponentCategory(int value, String name, String literal) {
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

} //ComponentCategory
