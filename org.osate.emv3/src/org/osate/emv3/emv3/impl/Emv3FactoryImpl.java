/**
 * Copyright Text	Copyright 2018 Carnegie Mellon University. All Rights Reserved....
 */
package org.osate.emv3.emv3.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.osate.emv3.emv3.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Emv3FactoryImpl extends EFactoryImpl implements Emv3Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Emv3Factory init() {
		try {
			Emv3Factory theEmv3Factory = (Emv3Factory)EPackage.Registry.INSTANCE.getEFactory(Emv3Package.eNS_URI);
			if (theEmv3Factory != null) {
				return theEmv3Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Emv3FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Emv3FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Emv3Package.ERROR_MODEL_SUBCLAUSE: return createErrorModelSubclause();
			case Emv3Package.ERROR_MODEL_LIBRARY: return createErrorModelLibrary();
			case Emv3Package.ERROR_TYPES: return createErrorTypes();
			case Emv3Package.ERROR_TYPE: return createErrorType();
			case Emv3Package.TYPE_SET: return createTypeSet();
			case Emv3Package.TYPE_TOKEN: return createTypeToken();
			case Emv3Package.TYPE_TRANSFORMATION_SET: return createTypeTransformationSet();
			case Emv3Package.TYPE_TRANSFORMATION: return createTypeTransformation();
			case Emv3Package.TYPE_MAPPING_SET: return createTypeMappingSet();
			case Emv3Package.TYPE_MAPPING: return createTypeMapping();
			case Emv3Package.ERROR_PROPAGATION: return createErrorPropagation();
			case Emv3Package.FEATUREOR_PP_REFERENCE: return createFeatureorPPReference();
			case Emv3Package.ERROR_FLOW: return createErrorFlow();
			case Emv3Package.ERROR_SOURCE: return createErrorSource();
			case Emv3Package.ERROR_SINK: return createErrorSink();
			case Emv3Package.ERROR_PATH: return createErrorPath();
			case Emv3Package.IF_CONDITION: return createIfCondition();
			case Emv3Package.PROPAGATION_POINT: return createPropagationPoint();
			case Emv3Package.PROPAGATION_PATH: return createPropagationPath();
			case Emv3Package.QUALIFIED_PROPAGATION_POINT: return createQualifiedPropagationPoint();
			case Emv3Package.ERROR_BEHAVIOR_STATE_MACHINE: return createErrorBehaviorStateMachine();
			case Emv3Package.ERROR_BEHAVIOR_EVENT: return createErrorBehaviorEvent();
			case Emv3Package.ERROR_EVENT: return createErrorEvent();
			case Emv3Package.REPAIR_EVENT: return createRepairEvent();
			case Emv3Package.RECOVER_EVENT: return createRecoverEvent();
			case Emv3Package.ERROR_BEHAVIOR_STATE: return createErrorBehaviorState();
			case Emv3Package.ERROR_BEHAVIOR_TRANSITION: return createErrorBehaviorTransition();
			case Emv3Package.TRANSITION_BRANCH: return createTransitionBranch();
			case Emv3Package.BRANCH_VALUE: return createBranchValue();
			case Emv3Package.CONDITION_EXPRESSION: return createConditionExpression();
			case Emv3Package.ORMORE_EXPRESSION: return createOrmoreExpression();
			case Emv3Package.ORLESS_EXPRESSION: return createOrlessExpression();
			case Emv3Package.EVENT_OR_PROPAGATION: return createEventOrPropagation();
			case Emv3Package.OUTGOING_PROPAGATION_CONDITION: return createOutgoingPropagationCondition();
			case Emv3Package.ERROR_DETECTION: return createErrorDetection();
			case Emv3Package.ERROR_CODE_VALUE: return createErrorCodeValue();
			case Emv3Package.ERROR_STATE_TO_MODE_MAPPING: return createErrorStateToModeMapping();
			case Emv3Package.COMPOSITE_STATE: return createCompositeState();
			case Emv3Package.QUALIFIED_ERROR_BEHAVIOR_STATE: return createQualifiedErrorBehaviorState();
			case Emv3Package.SUBCOMPONENT_ELEMENT: return createSubcomponentElement();
			case Emv3Package.EMV2_ROOT: return createEMV2Root();
			case Emv3Package.OR_EXPRESSION: return createOrExpression();
			case Emv3Package.AND_EXPRESSION: return createAndExpression();
			case Emv3Package.ALL_EXPRESSION: return createAllExpression();
			case Emv3Package.CONDITION_ELEMENT: return createConditionElement();
			case Emv3Package.SCONDITION_ELEMENT: return createSConditionElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErrorModelSubclause createErrorModelSubclause() {
		ErrorModelSubclauseImpl errorModelSubclause = new ErrorModelSubclauseImpl();
		return errorModelSubclause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErrorModelLibrary createErrorModelLibrary() {
		ErrorModelLibraryImpl errorModelLibrary = new ErrorModelLibraryImpl();
		return errorModelLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErrorTypes createErrorTypes() {
		ErrorTypesImpl errorTypes = new ErrorTypesImpl();
		return errorTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErrorType createErrorType() {
		ErrorTypeImpl errorType = new ErrorTypeImpl();
		return errorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeSet createTypeSet() {
		TypeSetImpl typeSet = new TypeSetImpl();
		return typeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeToken createTypeToken() {
		TypeTokenImpl typeToken = new TypeTokenImpl();
		return typeToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeTransformationSet createTypeTransformationSet() {
		TypeTransformationSetImpl typeTransformationSet = new TypeTransformationSetImpl();
		return typeTransformationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeTransformation createTypeTransformation() {
		TypeTransformationImpl typeTransformation = new TypeTransformationImpl();
		return typeTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeMappingSet createTypeMappingSet() {
		TypeMappingSetImpl typeMappingSet = new TypeMappingSetImpl();
		return typeMappingSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeMapping createTypeMapping() {
		TypeMappingImpl typeMapping = new TypeMappingImpl();
		return typeMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErrorPropagation createErrorPropagation() {
		ErrorPropagationImpl errorPropagation = new ErrorPropagationImpl();
		return errorPropagation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureorPPReference createFeatureorPPReference() {
		FeatureorPPReferenceImpl featureorPPReference = new FeatureorPPReferenceImpl();
		return featureorPPReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErrorFlow createErrorFlow() {
		ErrorFlowImpl errorFlow = new ErrorFlowImpl();
		return errorFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErrorSource createErrorSource() {
		ErrorSourceImpl errorSource = new ErrorSourceImpl();
		return errorSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErrorSink createErrorSink() {
		ErrorSinkImpl errorSink = new ErrorSinkImpl();
		return errorSink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErrorPath createErrorPath() {
		ErrorPathImpl errorPath = new ErrorPathImpl();
		return errorPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfCondition createIfCondition() {
		IfConditionImpl ifCondition = new IfConditionImpl();
		return ifCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropagationPoint createPropagationPoint() {
		PropagationPointImpl propagationPoint = new PropagationPointImpl();
		return propagationPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropagationPath createPropagationPath() {
		PropagationPathImpl propagationPath = new PropagationPathImpl();
		return propagationPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QualifiedPropagationPoint createQualifiedPropagationPoint() {
		QualifiedPropagationPointImpl qualifiedPropagationPoint = new QualifiedPropagationPointImpl();
		return qualifiedPropagationPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErrorBehaviorStateMachine createErrorBehaviorStateMachine() {
		ErrorBehaviorStateMachineImpl errorBehaviorStateMachine = new ErrorBehaviorStateMachineImpl();
		return errorBehaviorStateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErrorBehaviorEvent createErrorBehaviorEvent() {
		ErrorBehaviorEventImpl errorBehaviorEvent = new ErrorBehaviorEventImpl();
		return errorBehaviorEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErrorEvent createErrorEvent() {
		ErrorEventImpl errorEvent = new ErrorEventImpl();
		return errorEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RepairEvent createRepairEvent() {
		RepairEventImpl repairEvent = new RepairEventImpl();
		return repairEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecoverEvent createRecoverEvent() {
		RecoverEventImpl recoverEvent = new RecoverEventImpl();
		return recoverEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErrorBehaviorState createErrorBehaviorState() {
		ErrorBehaviorStateImpl errorBehaviorState = new ErrorBehaviorStateImpl();
		return errorBehaviorState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErrorBehaviorTransition createErrorBehaviorTransition() {
		ErrorBehaviorTransitionImpl errorBehaviorTransition = new ErrorBehaviorTransitionImpl();
		return errorBehaviorTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransitionBranch createTransitionBranch() {
		TransitionBranchImpl transitionBranch = new TransitionBranchImpl();
		return transitionBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BranchValue createBranchValue() {
		BranchValueImpl branchValue = new BranchValueImpl();
		return branchValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionExpression createConditionExpression() {
		ConditionExpressionImpl conditionExpression = new ConditionExpressionImpl();
		return conditionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrmoreExpression createOrmoreExpression() {
		OrmoreExpressionImpl ormoreExpression = new OrmoreExpressionImpl();
		return ormoreExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrlessExpression createOrlessExpression() {
		OrlessExpressionImpl orlessExpression = new OrlessExpressionImpl();
		return orlessExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventOrPropagation createEventOrPropagation() {
		EventOrPropagationImpl eventOrPropagation = new EventOrPropagationImpl();
		return eventOrPropagation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutgoingPropagationCondition createOutgoingPropagationCondition() {
		OutgoingPropagationConditionImpl outgoingPropagationCondition = new OutgoingPropagationConditionImpl();
		return outgoingPropagationCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErrorDetection createErrorDetection() {
		ErrorDetectionImpl errorDetection = new ErrorDetectionImpl();
		return errorDetection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErrorCodeValue createErrorCodeValue() {
		ErrorCodeValueImpl errorCodeValue = new ErrorCodeValueImpl();
		return errorCodeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErrorStateToModeMapping createErrorStateToModeMapping() {
		ErrorStateToModeMappingImpl errorStateToModeMapping = new ErrorStateToModeMappingImpl();
		return errorStateToModeMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeState createCompositeState() {
		CompositeStateImpl compositeState = new CompositeStateImpl();
		return compositeState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QualifiedErrorBehaviorState createQualifiedErrorBehaviorState() {
		QualifiedErrorBehaviorStateImpl qualifiedErrorBehaviorState = new QualifiedErrorBehaviorStateImpl();
		return qualifiedErrorBehaviorState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubcomponentElement createSubcomponentElement() {
		SubcomponentElementImpl subcomponentElement = new SubcomponentElementImpl();
		return subcomponentElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMV2Root createEMV2Root() {
		EMV2RootImpl emv2Root = new EMV2RootImpl();
		return emv2Root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrExpression createOrExpression() {
		OrExpressionImpl orExpression = new OrExpressionImpl();
		return orExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AndExpression createAndExpression() {
		AndExpressionImpl andExpression = new AndExpressionImpl();
		return andExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllExpression createAllExpression() {
		AllExpressionImpl allExpression = new AllExpressionImpl();
		return allExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionElement createConditionElement() {
		ConditionElementImpl conditionElement = new ConditionElementImpl();
		return conditionElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SConditionElement createSConditionElement() {
		SConditionElementImpl sConditionElement = new SConditionElementImpl();
		return sConditionElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Emv3Package getEmv3Package() {
		return (Emv3Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Emv3Package getPackage() {
		return Emv3Package.eINSTANCE;
	}

} //Emv3FactoryImpl
