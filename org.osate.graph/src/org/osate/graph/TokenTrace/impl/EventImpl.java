/**
 */
package org.osate.graph.TokenTrace.impl;

import java.lang.reflect.InvocationTargetException;

import java.math.BigDecimal;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.osate.graph.TokenTrace.Event;
import org.osate.graph.TokenTrace.EventType;
import org.osate.graph.TokenTrace.TokenTracePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.graph.TokenTrace.impl.EventImpl#getAssignedProbability <em>Assigned Probability</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.impl.EventImpl#getComputedProbability <em>Computed Probability</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.impl.EventImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.osate.graph.TokenTrace.impl.EventImpl#getScale <em>Scale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventImpl extends TokenImpl implements Event {
	/**
	 * The default value of the '{@link #getAssignedProbability() <em>Assigned Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedProbability()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ASSIGNED_PROBABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssignedProbability() <em>Assigned Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedProbability()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal assignedProbability = ASSIGNED_PROBABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getComputedProbability() <em>Computed Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputedProbability()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal COMPUTED_PROBABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComputedProbability() <em>Computed Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputedProbability()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal computedProbability = COMPUTED_PROBABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final EventType TYPE_EDEFAULT = EventType.BASIC;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EventType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal SCALE_EDEFAULT = new BigDecimal("1.0");

	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal scale = SCALE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TokenTracePackage.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAssignedProbability() {
		return assignedProbability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssignedProbability(BigDecimal newAssignedProbability) {
		BigDecimal oldAssignedProbability = assignedProbability;
		assignedProbability = newAssignedProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TokenTracePackage.EVENT__ASSIGNED_PROBABILITY, oldAssignedProbability, assignedProbability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getComputedProbability() {
		return computedProbability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComputedProbability(BigDecimal newComputedProbability) {
		BigDecimal oldComputedProbability = computedProbability;
		computedProbability = newComputedProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TokenTracePackage.EVENT__COMPUTED_PROBABILITY, oldComputedProbability, computedProbability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(EventType newType) {
		EventType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TokenTracePackage.EVENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScale(BigDecimal newScale) {
		BigDecimal oldScale = scale;
		scale = newScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TokenTracePackage.EVENT__SCALE, oldScale, scale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getProbability() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TokenTracePackage.EVENT__ASSIGNED_PROBABILITY:
				return getAssignedProbability();
			case TokenTracePackage.EVENT__COMPUTED_PROBABILITY:
				return getComputedProbability();
			case TokenTracePackage.EVENT__TYPE:
				return getType();
			case TokenTracePackage.EVENT__SCALE:
				return getScale();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TokenTracePackage.EVENT__ASSIGNED_PROBABILITY:
				setAssignedProbability((BigDecimal)newValue);
				return;
			case TokenTracePackage.EVENT__COMPUTED_PROBABILITY:
				setComputedProbability((BigDecimal)newValue);
				return;
			case TokenTracePackage.EVENT__TYPE:
				setType((EventType)newValue);
				return;
			case TokenTracePackage.EVENT__SCALE:
				setScale((BigDecimal)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TokenTracePackage.EVENT__ASSIGNED_PROBABILITY:
				setAssignedProbability(ASSIGNED_PROBABILITY_EDEFAULT);
				return;
			case TokenTracePackage.EVENT__COMPUTED_PROBABILITY:
				setComputedProbability(COMPUTED_PROBABILITY_EDEFAULT);
				return;
			case TokenTracePackage.EVENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case TokenTracePackage.EVENT__SCALE:
				setScale(SCALE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TokenTracePackage.EVENT__ASSIGNED_PROBABILITY:
				return ASSIGNED_PROBABILITY_EDEFAULT == null ? assignedProbability != null : !ASSIGNED_PROBABILITY_EDEFAULT.equals(assignedProbability);
			case TokenTracePackage.EVENT__COMPUTED_PROBABILITY:
				return COMPUTED_PROBABILITY_EDEFAULT == null ? computedProbability != null : !COMPUTED_PROBABILITY_EDEFAULT.equals(computedProbability);
			case TokenTracePackage.EVENT__TYPE:
				return type != TYPE_EDEFAULT;
			case TokenTracePackage.EVENT__SCALE:
				return SCALE_EDEFAULT == null ? scale != null : !SCALE_EDEFAULT.equals(scale);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TokenTracePackage.EVENT___GET_PROBABILITY:
				return getProbability();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (assignedProbability: ");
		result.append(assignedProbability);
		result.append(", computedProbability: ");
		result.append(computedProbability);
		result.append(", type: ");
		result.append(type);
		result.append(", scale: ");
		result.append(scale);
		result.append(')');
		return result.toString();
	}

} //EventImpl
