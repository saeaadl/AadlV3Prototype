/**
 */
package org.osate.graph.TokenTrace;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.graph.TokenTrace.Event#getSubEvents <em>Sub Events</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.Event#getAssignedProbability <em>Assigned Probability</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.Event#getComputedProbability <em>Computed Probability</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.Event#getType <em>Type</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.Event#getScale <em>Scale</em>}</li>
 * </ul>
 *
 * @see org.osate.graph.TokenTrace.TokenTracePackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends Token {
	/**
	 * Returns the value of the '<em><b>Sub Events</b></em>' reference list.
	 * The list contents are of type {@link org.osate.graph.TokenTrace.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Events</em>' reference list.
	 * @see org.osate.graph.TokenTrace.TokenTracePackage#getEvent_SubEvents()
	 * @model
	 * @generated
	 */
	EList<Event> getSubEvents();

	/**
	 * Returns the value of the '<em><b>Assigned Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Probability</em>' attribute.
	 * @see #setAssignedProbability(BigDecimal)
	 * @see org.osate.graph.TokenTrace.TokenTracePackage#getEvent_AssignedProbability()
	 * @model
	 * @generated
	 */
	BigDecimal getAssignedProbability();

	/**
	 * Sets the value of the '{@link org.osate.graph.TokenTrace.Event#getAssignedProbability <em>Assigned Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned Probability</em>' attribute.
	 * @see #getAssignedProbability()
	 * @generated
	 */
	void setAssignedProbability(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Computed Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computed Probability</em>' attribute.
	 * @see #setComputedProbability(BigDecimal)
	 * @see org.osate.graph.TokenTrace.TokenTracePackage#getEvent_ComputedProbability()
	 * @model
	 * @generated
	 */
	BigDecimal getComputedProbability();

	/**
	 * Sets the value of the '{@link org.osate.graph.TokenTrace.Event#getComputedProbability <em>Computed Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computed Probability</em>' attribute.
	 * @see #getComputedProbability()
	 * @generated
	 */
	void setComputedProbability(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.osate.graph.TokenTrace.EventType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.osate.graph.TokenTrace.EventType
	 * @see #setType(EventType)
	 * @see org.osate.graph.TokenTrace.TokenTracePackage#getEvent_Type()
	 * @model
	 * @generated
	 */
	EventType getType();

	/**
	 * Sets the value of the '{@link org.osate.graph.TokenTrace.Event#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.osate.graph.TokenTrace.EventType
	 * @see #getType()
	 * @generated
	 */
	void setType(EventType value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #setScale(BigDecimal)
	 * @see org.osate.graph.TokenTrace.TokenTracePackage#getEvent_Scale()
	 * @model default="1.0"
	 * @generated
	 */
	BigDecimal getScale();

	/**
	 * Sets the value of the '{@link org.osate.graph.TokenTrace.Event#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(BigDecimal value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	BigDecimal getProbability();

} // Event
