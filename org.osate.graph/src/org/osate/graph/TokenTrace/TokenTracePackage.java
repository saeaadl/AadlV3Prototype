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
	 * The feature id for the '<em><b>Token Trace Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TRACE__TOKEN_TRACE_TYPE = 2;

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
	 * The feature id for the '<em><b>Inferred Root Literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TRACE__INFERRED_ROOT_LITERAL = 6;

	/**
	 * The number of structural features of the '<em>Token Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TRACE_FEATURE_COUNT = 7;

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
	 * The feature id for the '<em><b>Token Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__TOKEN_TYPE = Aadlv3Package.MULTI_LITERAL_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Related Instance Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__RELATED_INSTANCE_OBJECT = Aadlv3Package.MULTI_LITERAL_CONSTRAINT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Related Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__RELATED_LITERAL = Aadlv3Package.MULTI_LITERAL_CONSTRAINT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Literal Sink</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__LITERAL_SINK = Aadlv3Package.MULTI_LITERAL_CONSTRAINT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Reference Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__REFERENCE_COUNT = Aadlv3Package.MULTI_LITERAL_CONSTRAINT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Assigned Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__ASSIGNED_PROBABILITY = Aadlv3Package.MULTI_LITERAL_CONSTRAINT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Computed Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__COMPUTED_PROBABILITY = Aadlv3Package.MULTI_LITERAL_CONSTRAINT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__SCALE = Aadlv3Package.MULTI_LITERAL_CONSTRAINT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_FEATURE_COUNT = Aadlv3Package.MULTI_LITERAL_CONSTRAINT_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Probability</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN___GET_PROBABILITY = Aadlv3Package.MULTI_LITERAL_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_OPERATION_COUNT = Aadlv3Package.MULTI_LITERAL_CONSTRAINT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.osate.graph.TokenTrace.TokenType <em>Token Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.graph.TokenTrace.TokenType
	 * @see org.osate.graph.TokenTrace.impl.TokenTracePackageImpl#getTokenType()
	 * @generated
	 */
	int TOKEN_TYPE = 2;

	/**
	 * The meta object id for the '{@link org.osate.graph.TokenTrace.TokenTraceType <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.graph.TokenTrace.TokenTraceType
	 * @see org.osate.graph.TokenTrace.impl.TokenTracePackageImpl#getTokenTraceType()
	 * @generated
	 */
	int TOKEN_TRACE_TYPE = 3;


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
	 * Returns the meta object for the attribute '{@link org.osate.graph.TokenTrace.TokenTrace#getTokenTraceType <em>Token Trace Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token Trace Type</em>'.
	 * @see org.osate.graph.TokenTrace.TokenTrace#getTokenTraceType()
	 * @see #getTokenTrace()
	 * @generated
	 */
	EAttribute getTokenTrace_TokenTraceType();

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
	 * Returns the meta object for the containment reference '{@link org.osate.graph.TokenTrace.TokenTrace#getInferredRootLiteral <em>Inferred Root Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inferred Root Literal</em>'.
	 * @see org.osate.graph.TokenTrace.TokenTrace#getInferredRootLiteral()
	 * @see #getTokenTrace()
	 * @generated
	 */
	EReference getTokenTrace_InferredRootLiteral();

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
	 * Returns the meta object for the attribute '{@link org.osate.graph.TokenTrace.Token#getTokenType <em>Token Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token Type</em>'.
	 * @see org.osate.graph.TokenTrace.Token#getTokenType()
	 * @see #getToken()
	 * @generated
	 */
	EAttribute getToken_TokenType();

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
	 * Returns the meta object for the reference '{@link org.osate.graph.TokenTrace.Token#getRelatedLiteral <em>Related Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Related Literal</em>'.
	 * @see org.osate.graph.TokenTrace.Token#getRelatedLiteral()
	 * @see #getToken()
	 * @generated
	 */
	EReference getToken_RelatedLiteral();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.graph.TokenTrace.Token#getLiteralSink <em>Literal Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literal Sink</em>'.
	 * @see org.osate.graph.TokenTrace.Token#getLiteralSink()
	 * @see #getToken()
	 * @generated
	 */
	EReference getToken_LiteralSink();

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
	 * Returns the meta object for the attribute '{@link org.osate.graph.TokenTrace.Token#getAssignedProbability <em>Assigned Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assigned Probability</em>'.
	 * @see org.osate.graph.TokenTrace.Token#getAssignedProbability()
	 * @see #getToken()
	 * @generated
	 */
	EAttribute getToken_AssignedProbability();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.graph.TokenTrace.Token#getComputedProbability <em>Computed Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Computed Probability</em>'.
	 * @see org.osate.graph.TokenTrace.Token#getComputedProbability()
	 * @see #getToken()
	 * @generated
	 */
	EAttribute getToken_ComputedProbability();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.graph.TokenTrace.Token#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see org.osate.graph.TokenTrace.Token#getScale()
	 * @see #getToken()
	 * @generated
	 */
	EAttribute getToken_Scale();

	/**
	 * Returns the meta object for the '{@link org.osate.graph.TokenTrace.Token#getProbability() <em>Get Probability</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Probability</em>' operation.
	 * @see org.osate.graph.TokenTrace.Token#getProbability()
	 * @generated
	 */
	EOperation getToken__GetProbability();

	/**
	 * Returns the meta object for enum '{@link org.osate.graph.TokenTrace.TokenType <em>Token Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Token Type</em>'.
	 * @see org.osate.graph.TokenTrace.TokenType
	 * @generated
	 */
	EEnum getTokenType();

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
		 * The meta object literal for the '<em><b>Token Trace Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_TRACE__TOKEN_TRACE_TYPE = eINSTANCE.getTokenTrace_TokenTraceType();

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
		 * The meta object literal for the '<em><b>Inferred Root Literal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_TRACE__INFERRED_ROOT_LITERAL = eINSTANCE.getTokenTrace_InferredRootLiteral();

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
		 * The meta object literal for the '<em><b>Token Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN__TOKEN_TYPE = eINSTANCE.getToken_TokenType();

		/**
		 * The meta object literal for the '<em><b>Related Instance Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN__RELATED_INSTANCE_OBJECT = eINSTANCE.getToken_RelatedInstanceObject();

		/**
		 * The meta object literal for the '<em><b>Related Literal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN__RELATED_LITERAL = eINSTANCE.getToken_RelatedLiteral();

		/**
		 * The meta object literal for the '<em><b>Literal Sink</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN__LITERAL_SINK = eINSTANCE.getToken_LiteralSink();

		/**
		 * The meta object literal for the '<em><b>Reference Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN__REFERENCE_COUNT = eINSTANCE.getToken_ReferenceCount();

		/**
		 * The meta object literal for the '<em><b>Assigned Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN__ASSIGNED_PROBABILITY = eINSTANCE.getToken_AssignedProbability();

		/**
		 * The meta object literal for the '<em><b>Computed Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN__COMPUTED_PROBABILITY = eINSTANCE.getToken_ComputedProbability();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN__SCALE = eINSTANCE.getToken_Scale();

		/**
		 * The meta object literal for the '<em><b>Get Probability</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOKEN___GET_PROBABILITY = eINSTANCE.getToken__GetProbability();

		/**
		 * The meta object literal for the '{@link org.osate.graph.TokenTrace.TokenType <em>Token Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.graph.TokenTrace.TokenType
		 * @see org.osate.graph.TokenTrace.impl.TokenTracePackageImpl#getTokenType()
		 * @generated
		 */
		EEnum TOKEN_TYPE = eINSTANCE.getTokenType();

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
