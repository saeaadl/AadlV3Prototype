/**
 */
package org.osate.graph.TokenTrace;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.osate.aadlv3.aadlv3.Aadlv3Package;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.osate.graph.TokenTrace.TokenTraceFactory
 * @model kind="package"
 * @generated
 */
public interface TokenTracePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TokenTrace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.osate.org/TokenTrace";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "TokenTrace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TokenTracePackage eINSTANCE = org.osate.graph.TokenTrace.impl.TokenTracePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.osate.graph.TokenTrace.impl.TokenTraceImpl <em>Token Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.graph.TokenTrace.impl.TokenTraceImpl
	 * @see org.osate.graph.TokenTrace.impl.TokenTracePackageImpl#getTokenTrace()
	 * @generated
	 */
	int TOKEN_TRACE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TRACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TRACE__MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Fault Tree Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TRACE__FAULT_TREE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TRACE__ROOT = 3;

	/**
	 * The feature id for the '<em><b>Instance Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TRACE__INSTANCE_ROOT = 4;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TRACE__TOKENS = 5;

	/**
	 * The number of structural features of the '<em>Token Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TRACE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Token Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TRACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.osate.graph.TokenTrace.impl.TokenImpl <em>Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.graph.TokenTrace.impl.TokenImpl
	 * @see org.osate.graph.TokenTrace.impl.TokenTracePackageImpl#getToken()
	 * @generated
	 */
	int TOKEN = 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__ELEMENTS = Aadlv3Package.MULTI_LITERAL_CONSTRAINT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__OPERATOR = Aadlv3Package.MULTI_LITERAL_CONSTRAINT__OPERATOR;

	/**
	 * The feature id for the '<em><b>K</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__K = Aadlv3Package.MULTI_LITERAL_CONSTRAINT__K;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__NAME = Aadlv3Package.MULTI_LITERAL_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__MESSAGE = Aadlv3Package.MULTI_LITERAL_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__TOKENS = Aadlv3Package.MULTI_LITERAL_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Related Instance Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__RELATED_INSTANCE_OBJECT = Aadlv3Package.MULTI_LITERAL_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Related Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__RELATED_TYPE = Aadlv3Package.MULTI_LITERAL_CONSTRAINT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Reference Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__REFERENCE_COUNT = Aadlv3Package.MULTI_LITERAL_CONSTRAINT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Token Logic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__TOKEN_LOGIC = Aadlv3Package.MULTI_LITERAL_CONSTRAINT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_FEATURE_COUNT = Aadlv3Package.MULTI_LITERAL_CONSTRAINT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_OPERATION_COUNT = Aadlv3Package.MULTI_LITERAL_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.graph.TokenTrace.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.graph.TokenTrace.impl.EventImpl
	 * @see org.osate.graph.TokenTrace.impl.TokenTracePackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 2;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ELEMENTS = TOKEN__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__OPERATOR = TOKEN__OPERATOR;

	/**
	 * The feature id for the '<em><b>K</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__K = TOKEN__K;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = TOKEN__NAME;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__MESSAGE = TOKEN__MESSAGE;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TOKENS = TOKEN__TOKENS;

	/**
	 * The feature id for the '<em><b>Related Instance Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__RELATED_INSTANCE_OBJECT = TOKEN__RELATED_INSTANCE_OBJECT;

	/**
	 * The feature id for the '<em><b>Related Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__RELATED_TYPE = TOKEN__RELATED_TYPE;

	/**
	 * The feature id for the '<em><b>Reference Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__REFERENCE_COUNT = TOKEN__REFERENCE_COUNT;

	/**
	 * The feature id for the '<em><b>Token Logic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TOKEN_LOGIC = TOKEN__TOKEN_LOGIC;

	/**
	 * The feature id for the '<em><b>Sub Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__SUB_EVENTS = TOKEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assigned Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ASSIGNED_PROBABILITY = TOKEN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Computed Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__COMPUTED_PROBABILITY = TOKEN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TYPE = TOKEN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__SCALE = TOKEN_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = TOKEN_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Probability</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___GET_PROBABILITY = TOKEN_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = TOKEN_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.osate.graph.TokenTrace.EventType <em>Event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.graph.TokenTrace.EventType
	 * @see org.osate.graph.TokenTrace.impl.TokenTracePackageImpl#getEventType()
	 * @generated
	 */
	int EVENT_TYPE = 3;

	/**
	 * The meta object id for the '{@link org.osate.graph.TokenTrace.LogicOperation <em>Logic Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.graph.TokenTrace.LogicOperation
	 * @see org.osate.graph.TokenTrace.impl.TokenTracePackageImpl#getLogicOperation()
	 * @generated
	 */
	int LOGIC_OPERATION = 4;

	/**
	 * The meta object id for the '{@link org.osate.graph.TokenTrace.TokenTraceType <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.graph.TokenTrace.TokenTraceType
	 * @see org.osate.graph.TokenTrace.impl.TokenTracePackageImpl#getTokenTraceType()
	 * @generated
	 */
	int TOKEN_TRACE_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link org.osate.graph.TokenTrace.TokenTrace <em>Token Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Trace</em>'.
	 * @see org.osate.graph.TokenTrace.TokenTrace
	 * @generated
	 */
	EClass getTokenTrace();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.graph.TokenTrace.TokenTrace#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.osate.graph.TokenTrace.TokenTrace#getName()
	 * @see #getTokenTrace()
	 * @generated
	 */
	EAttribute getTokenTrace_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.graph.TokenTrace.TokenTrace#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.osate.graph.TokenTrace.TokenTrace#getMessage()
	 * @see #getTokenTrace()
	 * @generated
	 */
	EAttribute getTokenTrace_Message();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.graph.TokenTrace.TokenTrace#getFaultTreeType <em>Fault Tree Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Tree Type</em>'.
	 * @see org.osate.graph.TokenTrace.TokenTrace#getFaultTreeType()
	 * @see #getTokenTrace()
	 * @generated
	 */
	EAttribute getTokenTrace_FaultTreeType();

	/**
	 * Returns the meta object for the reference '{@link org.osate.graph.TokenTrace.TokenTrace#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root</em>'.
	 * @see org.osate.graph.TokenTrace.TokenTrace#getRoot()
	 * @see #getTokenTrace()
	 * @generated
	 */
	EReference getTokenTrace_Root();

	/**
	 * Returns the meta object for the reference '{@link org.osate.graph.TokenTrace.TokenTrace#getInstanceRoot <em>Instance Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance Root</em>'.
	 * @see org.osate.graph.TokenTrace.TokenTrace#getInstanceRoot()
	 * @see #getTokenTrace()
	 * @generated
	 */
	EReference getTokenTrace_InstanceRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.graph.TokenTrace.TokenTrace#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tokens</em>'.
	 * @see org.osate.graph.TokenTrace.TokenTrace#getTokens()
	 * @see #getTokenTrace()
	 * @generated
	 */
	EReference getTokenTrace_Tokens();

	/**
	 * Returns the meta object for class '{@link org.osate.graph.TokenTrace.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token</em>'.
	 * @see org.osate.graph.TokenTrace.Token
	 * @generated
	 */
	EClass getToken();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.graph.TokenTrace.Token#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.osate.graph.TokenTrace.Token#getName()
	 * @see #getToken()
	 * @generated
	 */
	EAttribute getToken_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.graph.TokenTrace.Token#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.osate.graph.TokenTrace.Token#getMessage()
	 * @see #getToken()
	 * @generated
	 */
	EAttribute getToken_Message();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.graph.TokenTrace.Token#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tokens</em>'.
	 * @see org.osate.graph.TokenTrace.Token#getTokens()
	 * @see #getToken()
	 * @generated
	 */
	EReference getToken_Tokens();

	/**
	 * Returns the meta object for the reference '{@link org.osate.graph.TokenTrace.Token#getRelatedInstanceObject <em>Related Instance Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Related Instance Object</em>'.
	 * @see org.osate.graph.TokenTrace.Token#getRelatedInstanceObject()
	 * @see #getToken()
	 * @generated
	 */
	EReference getToken_RelatedInstanceObject();

	/**
	 * Returns the meta object for the reference '{@link org.osate.graph.TokenTrace.Token#getRelatedType <em>Related Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Related Type</em>'.
	 * @see org.osate.graph.TokenTrace.Token#getRelatedType()
	 * @see #getToken()
	 * @generated
	 */
	EReference getToken_RelatedType();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.graph.TokenTrace.Token#getReferenceCount <em>Reference Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Count</em>'.
	 * @see org.osate.graph.TokenTrace.Token#getReferenceCount()
	 * @see #getToken()
	 * @generated
	 */
	EAttribute getToken_ReferenceCount();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.graph.TokenTrace.Token#getTokenLogic <em>Token Logic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token Logic</em>'.
	 * @see org.osate.graph.TokenTrace.Token#getTokenLogic()
	 * @see #getToken()
	 * @generated
	 */
	EAttribute getToken_TokenLogic();

	/**
	 * Returns the meta object for class '{@link org.osate.graph.TokenTrace.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see org.osate.graph.TokenTrace.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.graph.TokenTrace.Event#getSubEvents <em>Sub Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Events</em>'.
	 * @see org.osate.graph.TokenTrace.Event#getSubEvents()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_SubEvents();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.graph.TokenTrace.Event#getAssignedProbability <em>Assigned Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assigned Probability</em>'.
	 * @see org.osate.graph.TokenTrace.Event#getAssignedProbability()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_AssignedProbability();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.graph.TokenTrace.Event#getComputedProbability <em>Computed Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Computed Probability</em>'.
	 * @see org.osate.graph.TokenTrace.Event#getComputedProbability()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_ComputedProbability();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.graph.TokenTrace.Event#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.osate.graph.TokenTrace.Event#getType()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.graph.TokenTrace.Event#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see org.osate.graph.TokenTrace.Event#getScale()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Scale();

	/**
	 * Returns the meta object for the '{@link org.osate.graph.TokenTrace.Event#getProbability() <em>Get Probability</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Probability</em>' operation.
	 * @see org.osate.graph.TokenTrace.Event#getProbability()
	 * @generated
	 */
	EOperation getEvent__GetProbability();

	/**
	 * Returns the meta object for enum '{@link org.osate.graph.TokenTrace.EventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Type</em>'.
	 * @see org.osate.graph.TokenTrace.EventType
	 * @generated
	 */
	EEnum getEventType();

	/**
	 * Returns the meta object for enum '{@link org.osate.graph.TokenTrace.LogicOperation <em>Logic Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logic Operation</em>'.
	 * @see org.osate.graph.TokenTrace.LogicOperation
	 * @generated
	 */
	EEnum getLogicOperation();

	/**
	 * Returns the meta object for enum '{@link org.osate.graph.TokenTrace.TokenTraceType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see org.osate.graph.TokenTrace.TokenTraceType
	 * @generated
	 */
	EEnum getTokenTraceType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TokenTraceFactory getTokenTraceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.osate.graph.TokenTrace.impl.TokenTraceImpl <em>Token Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.graph.TokenTrace.impl.TokenTraceImpl
		 * @see org.osate.graph.TokenTrace.impl.TokenTracePackageImpl#getTokenTrace()
		 * @generated
		 */
		EClass TOKEN_TRACE = eINSTANCE.getTokenTrace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_TRACE__NAME = eINSTANCE.getTokenTrace_Name();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_TRACE__MESSAGE = eINSTANCE.getTokenTrace_Message();

		/**
		 * The meta object literal for the '<em><b>Fault Tree Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_TRACE__FAULT_TREE_TYPE = eINSTANCE.getTokenTrace_FaultTreeType();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_TRACE__ROOT = eINSTANCE.getTokenTrace_Root();

		/**
		 * The meta object literal for the '<em><b>Instance Root</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_TRACE__INSTANCE_ROOT = eINSTANCE.getTokenTrace_InstanceRoot();

		/**
		 * The meta object literal for the '<em><b>Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_TRACE__TOKENS = eINSTANCE.getTokenTrace_Tokens();

		/**
		 * The meta object literal for the '{@link org.osate.graph.TokenTrace.impl.TokenImpl <em>Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.graph.TokenTrace.impl.TokenImpl
		 * @see org.osate.graph.TokenTrace.impl.TokenTracePackageImpl#getToken()
		 * @generated
		 */
		EClass TOKEN = eINSTANCE.getToken();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN__NAME = eINSTANCE.getToken_Name();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN__MESSAGE = eINSTANCE.getToken_Message();

		/**
		 * The meta object literal for the '<em><b>Tokens</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN__TOKENS = eINSTANCE.getToken_Tokens();

		/**
		 * The meta object literal for the '<em><b>Related Instance Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN__RELATED_INSTANCE_OBJECT = eINSTANCE.getToken_RelatedInstanceObject();

		/**
		 * The meta object literal for the '<em><b>Related Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN__RELATED_TYPE = eINSTANCE.getToken_RelatedType();

		/**
		 * The meta object literal for the '<em><b>Reference Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN__REFERENCE_COUNT = eINSTANCE.getToken_ReferenceCount();

		/**
		 * The meta object literal for the '<em><b>Token Logic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN__TOKEN_LOGIC = eINSTANCE.getToken_TokenLogic();

		/**
		 * The meta object literal for the '{@link org.osate.graph.TokenTrace.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.graph.TokenTrace.impl.EventImpl
		 * @see org.osate.graph.TokenTrace.impl.TokenTracePackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Sub Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__SUB_EVENTS = eINSTANCE.getEvent_SubEvents();

		/**
		 * The meta object literal for the '<em><b>Assigned Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__ASSIGNED_PROBABILITY = eINSTANCE.getEvent_AssignedProbability();

		/**
		 * The meta object literal for the '<em><b>Computed Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__COMPUTED_PROBABILITY = eINSTANCE.getEvent_ComputedProbability();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__TYPE = eINSTANCE.getEvent_Type();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__SCALE = eINSTANCE.getEvent_Scale();

		/**
		 * The meta object literal for the '<em><b>Get Probability</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EVENT___GET_PROBABILITY = eINSTANCE.getEvent__GetProbability();

		/**
		 * The meta object literal for the '{@link org.osate.graph.TokenTrace.EventType <em>Event Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.graph.TokenTrace.EventType
		 * @see org.osate.graph.TokenTrace.impl.TokenTracePackageImpl#getEventType()
		 * @generated
		 */
		EEnum EVENT_TYPE = eINSTANCE.getEventType();

		/**
		 * The meta object literal for the '{@link org.osate.graph.TokenTrace.LogicOperation <em>Logic Operation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.graph.TokenTrace.LogicOperation
		 * @see org.osate.graph.TokenTrace.impl.TokenTracePackageImpl#getLogicOperation()
		 * @generated
		 */
		EEnum LOGIC_OPERATION = eINSTANCE.getLogicOperation();

		/**
		 * The meta object literal for the '{@link org.osate.graph.TokenTrace.TokenTraceType <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.graph.TokenTrace.TokenTraceType
		 * @see org.osate.graph.TokenTrace.impl.TokenTracePackageImpl#getTokenTraceType()
		 * @generated
		 */
		EEnum TOKEN_TRACE_TYPE = eINSTANCE.getTokenTraceType();

	}

} //TokenTracePackage
