/**
 */
package org.osate.graph.TokenTrace.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.osate.aadlv3.aadlv3.Aadlv3Package;

import org.osate.av3instance.av3instance.Av3instancePackage;

import org.osate.graph.TokenTrace.Event;
import org.osate.graph.TokenTrace.EventType;
import org.osate.graph.TokenTrace.Token;
import org.osate.graph.TokenTrace.TokenTrace;
import org.osate.graph.TokenTrace.TokenTraceFactory;
import org.osate.graph.TokenTrace.TokenTracePackage;
import org.osate.graph.TokenTrace.TokenTraceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TokenTracePackageImpl extends EPackageImpl implements TokenTracePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eventTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tokenTraceTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.osate.graph.TokenTrace.TokenTracePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TokenTracePackageImpl() {
		super(eNS_URI, TokenTraceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TokenTracePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TokenTracePackage init() {
		if (isInited) return (TokenTracePackage)EPackage.Registry.INSTANCE.getEPackage(TokenTracePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTokenTracePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TokenTracePackageImpl theTokenTracePackage = registeredTokenTracePackage instanceof TokenTracePackageImpl ? (TokenTracePackageImpl)registeredTokenTracePackage : new TokenTracePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		Av3instancePackage.eINSTANCE.eClass();
		Aadlv3Package.eINSTANCE.eClass();

		// Create package meta-data objects
		theTokenTracePackage.createPackageContents();

		// Initialize created meta-data
		theTokenTracePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTokenTracePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TokenTracePackage.eNS_URI, theTokenTracePackage);
		return theTokenTracePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTokenTrace() {
		return tokenTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTokenTrace_Name() {
		return (EAttribute)tokenTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTokenTrace_Message() {
		return (EAttribute)tokenTraceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTokenTrace_TokenTraceType() {
		return (EAttribute)tokenTraceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTokenTrace_Root() {
		return (EReference)tokenTraceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTokenTrace_InstanceRoot() {
		return (EReference)tokenTraceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTokenTrace_Tokens() {
		return (EReference)tokenTraceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getToken() {
		return tokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getToken_Name() {
		return (EAttribute)tokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getToken_Message() {
		return (EAttribute)tokenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getToken_Tokens() {
		return (EReference)tokenEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getToken_RelatedInstanceObject() {
		return (EReference)tokenEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getToken_RelatedType() {
		return (EReference)tokenEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getToken_ReferenceCount() {
		return (EAttribute)tokenEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvent_AssignedProbability() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvent_ComputedProbability() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvent_Type() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvent_Scale() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEvent__GetProbability() {
		return eventEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEventType() {
		return eventTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTokenTraceType() {
		return tokenTraceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TokenTraceFactory getTokenTraceFactory() {
		return (TokenTraceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		tokenTraceEClass = createEClass(TOKEN_TRACE);
		createEAttribute(tokenTraceEClass, TOKEN_TRACE__NAME);
		createEAttribute(tokenTraceEClass, TOKEN_TRACE__MESSAGE);
		createEAttribute(tokenTraceEClass, TOKEN_TRACE__TOKEN_TRACE_TYPE);
		createEReference(tokenTraceEClass, TOKEN_TRACE__ROOT);
		createEReference(tokenTraceEClass, TOKEN_TRACE__INSTANCE_ROOT);
		createEReference(tokenTraceEClass, TOKEN_TRACE__TOKENS);

		tokenEClass = createEClass(TOKEN);
		createEAttribute(tokenEClass, TOKEN__NAME);
		createEAttribute(tokenEClass, TOKEN__MESSAGE);
		createEReference(tokenEClass, TOKEN__TOKENS);
		createEReference(tokenEClass, TOKEN__RELATED_INSTANCE_OBJECT);
		createEReference(tokenEClass, TOKEN__RELATED_TYPE);
		createEAttribute(tokenEClass, TOKEN__REFERENCE_COUNT);

		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__ASSIGNED_PROBABILITY);
		createEAttribute(eventEClass, EVENT__COMPUTED_PROBABILITY);
		createEAttribute(eventEClass, EVENT__TYPE);
		createEAttribute(eventEClass, EVENT__SCALE);
		createEOperation(eventEClass, EVENT___GET_PROBABILITY);

		// Create enums
		eventTypeEEnum = createEEnum(EVENT_TYPE);
		tokenTraceTypeEEnum = createEEnum(TOKEN_TRACE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		Aadlv3Package theAadlv3Package = (Aadlv3Package)EPackage.Registry.INSTANCE.getEPackage(Aadlv3Package.eNS_URI);
		Av3instancePackage theAv3instancePackage = (Av3instancePackage)EPackage.Registry.INSTANCE.getEPackage(Av3instancePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tokenEClass.getESuperTypes().add(theAadlv3Package.getMultiLiteralConstraint());
		eventEClass.getESuperTypes().add(this.getToken());

		// Initialize classes, features, and operations; add parameters
		initEClass(tokenTraceEClass, TokenTrace.class, "TokenTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTokenTrace_Name(), ecorePackage.getEString(), "name", null, 0, 1, TokenTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTokenTrace_Message(), ecorePackage.getEString(), "message", null, 0, 1, TokenTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTokenTrace_TokenTraceType(), this.getTokenTraceType(), "tokenTraceType", null, 0, 1, TokenTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTokenTrace_Root(), this.getToken(), null, "root", null, 0, 1, TokenTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTokenTrace_InstanceRoot(), ecorePackage.getEObject(), null, "instanceRoot", null, 0, 1, TokenTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTokenTrace_Tokens(), this.getToken(), null, "tokens", null, 0, -1, TokenTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tokenEClass, Token.class, "Token", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToken_Name(), ecorePackage.getEString(), "name", null, 0, 1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToken_Message(), ecorePackage.getEString(), "message", null, 0, 1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToken_Tokens(), this.getToken(), null, "tokens", null, 0, -1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToken_RelatedInstanceObject(), theAv3instancePackage.getInstanceObject(), null, "relatedInstanceObject", null, 0, 1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToken_RelatedType(), theAadlv3Package.getTypeReference(), null, "relatedType", null, 0, 1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToken_ReferenceCount(), ecorePackage.getEInt(), "referenceCount", "0", 0, 1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_AssignedProbability(), ecorePackage.getEBigDecimal(), "assignedProbability", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_ComputedProbability(), ecorePackage.getEBigDecimal(), "computedProbability", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Type(), this.getEventType(), "type", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Scale(), ecorePackage.getEBigDecimal(), "scale", "1.0", 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getEvent__GetProbability(), ecorePackage.getEBigDecimal(), "getProbability", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eventTypeEEnum, EventType.class, "EventType");
		addEEnumLiteral(eventTypeEEnum, EventType.BASIC);
		addEEnumLiteral(eventTypeEEnum, EventType.EXTERNAL);
		addEEnumLiteral(eventTypeEEnum, EventType.UNDEVELOPED);
		addEEnumLiteral(eventTypeEEnum, EventType.INTERMEDIATE);

		initEEnum(tokenTraceTypeEEnum, TokenTraceType.class, "TokenTraceType");
		addEEnumLiteral(tokenTraceTypeEEnum, TokenTraceType.TOKEN_GRAPH);
		addEEnumLiteral(tokenTraceTypeEEnum, TokenTraceType.TOKEN_TRACE);
		addEEnumLiteral(tokenTraceTypeEEnum, TokenTraceType.COMPOSITE_PARTS);
		addEEnumLiteral(tokenTraceTypeEEnum, TokenTraceType.MINIMAL_CUT_SET);

		// Create resource
		createResource(eNS_URI);
	}

} //TokenTracePackageImpl
