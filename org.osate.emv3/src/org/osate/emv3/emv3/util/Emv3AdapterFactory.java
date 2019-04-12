/**
 * Copyright Text	Copyright 2018 Carnegie Mellon University. All Rights Reserved....
 */
package org.osate.emv3.emv3.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadlv3.aadlv3.NamedElement;
import org.osate.aadlv3.aadlv3.PackageDeclaration;
import org.osate.aadlv3.aadlv3.PackageElement;

import org.osate.emv3.emv3.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.osate.emv3.emv3.Emv3Package
 * @generated
 */
public class Emv3AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Emv3Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Emv3AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Emv3Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Emv3Switch<Adapter> modelSwitch =
		new Emv3Switch<Adapter>() {
			@Override
			public Adapter caseErrorModelSubclause(ErrorModelSubclause object) {
				return createErrorModelSubclauseAdapter();
			}
			@Override
			public Adapter caseErrorModelLibrary(ErrorModelLibrary object) {
				return createErrorModelLibraryAdapter();
			}
			@Override
			public Adapter caseErrorTypes(ErrorTypes object) {
				return createErrorTypesAdapter();
			}
			@Override
			public Adapter caseErrorType(ErrorType object) {
				return createErrorTypeAdapter();
			}
			@Override
			public Adapter caseTypeSet(TypeSet object) {
				return createTypeSetAdapter();
			}
			@Override
			public Adapter caseTypeToken(TypeToken object) {
				return createTypeTokenAdapter();
			}
			@Override
			public Adapter caseTypeTransformationSet(TypeTransformationSet object) {
				return createTypeTransformationSetAdapter();
			}
			@Override
			public Adapter caseTypeTransformation(TypeTransformation object) {
				return createTypeTransformationAdapter();
			}
			@Override
			public Adapter caseTypeMappingSet(TypeMappingSet object) {
				return createTypeMappingSetAdapter();
			}
			@Override
			public Adapter caseTypeMapping(TypeMapping object) {
				return createTypeMappingAdapter();
			}
			@Override
			public Adapter caseErrorPropagation(ErrorPropagation object) {
				return createErrorPropagationAdapter();
			}
			@Override
			public Adapter caseFeatureorPPReference(FeatureorPPReference object) {
				return createFeatureorPPReferenceAdapter();
			}
			@Override
			public Adapter caseErrorFlow(ErrorFlow object) {
				return createErrorFlowAdapter();
			}
			@Override
			public Adapter caseErrorSource(ErrorSource object) {
				return createErrorSourceAdapter();
			}
			@Override
			public Adapter caseErrorSink(ErrorSink object) {
				return createErrorSinkAdapter();
			}
			@Override
			public Adapter caseErrorPath(ErrorPath object) {
				return createErrorPathAdapter();
			}
			@Override
			public Adapter caseIfCondition(IfCondition object) {
				return createIfConditionAdapter();
			}
			@Override
			public Adapter casePropagationPoint(PropagationPoint object) {
				return createPropagationPointAdapter();
			}
			@Override
			public Adapter casePropagationPath(PropagationPath object) {
				return createPropagationPathAdapter();
			}
			@Override
			public Adapter caseQualifiedPropagationPoint(QualifiedPropagationPoint object) {
				return createQualifiedPropagationPointAdapter();
			}
			@Override
			public Adapter caseErrorBehaviorStateMachine(ErrorBehaviorStateMachine object) {
				return createErrorBehaviorStateMachineAdapter();
			}
			@Override
			public Adapter caseErrorBehaviorEvent(ErrorBehaviorEvent object) {
				return createErrorBehaviorEventAdapter();
			}
			@Override
			public Adapter caseErrorEvent(ErrorEvent object) {
				return createErrorEventAdapter();
			}
			@Override
			public Adapter caseRepairEvent(RepairEvent object) {
				return createRepairEventAdapter();
			}
			@Override
			public Adapter caseRecoverEvent(RecoverEvent object) {
				return createRecoverEventAdapter();
			}
			@Override
			public Adapter caseErrorBehaviorState(ErrorBehaviorState object) {
				return createErrorBehaviorStateAdapter();
			}
			@Override
			public Adapter caseErrorBehaviorTransition(ErrorBehaviorTransition object) {
				return createErrorBehaviorTransitionAdapter();
			}
			@Override
			public Adapter caseTransitionBranch(TransitionBranch object) {
				return createTransitionBranchAdapter();
			}
			@Override
			public Adapter caseBranchValue(BranchValue object) {
				return createBranchValueAdapter();
			}
			@Override
			public Adapter caseConditionExpression(ConditionExpression object) {
				return createConditionExpressionAdapter();
			}
			@Override
			public Adapter caseOrmoreExpression(OrmoreExpression object) {
				return createOrmoreExpressionAdapter();
			}
			@Override
			public Adapter caseOrlessExpression(OrlessExpression object) {
				return createOrlessExpressionAdapter();
			}
			@Override
			public Adapter caseEventOrPropagation(EventOrPropagation object) {
				return createEventOrPropagationAdapter();
			}
			@Override
			public Adapter caseOutgoingPropagationCondition(OutgoingPropagationCondition object) {
				return createOutgoingPropagationConditionAdapter();
			}
			@Override
			public Adapter caseErrorDetection(ErrorDetection object) {
				return createErrorDetectionAdapter();
			}
			@Override
			public Adapter caseErrorCodeValue(ErrorCodeValue object) {
				return createErrorCodeValueAdapter();
			}
			@Override
			public Adapter caseErrorStateToModeMapping(ErrorStateToModeMapping object) {
				return createErrorStateToModeMappingAdapter();
			}
			@Override
			public Adapter caseCompositeState(CompositeState object) {
				return createCompositeStateAdapter();
			}
			@Override
			public Adapter caseQualifiedErrorBehaviorState(QualifiedErrorBehaviorState object) {
				return createQualifiedErrorBehaviorStateAdapter();
			}
			@Override
			public Adapter caseSubcomponentElement(SubcomponentElement object) {
				return createSubcomponentElementAdapter();
			}
			@Override
			public Adapter caseEMV2Root(EMV2Root object) {
				return createEMV2RootAdapter();
			}
			@Override
			public Adapter caseOrExpression(OrExpression object) {
				return createOrExpressionAdapter();
			}
			@Override
			public Adapter caseAndExpression(AndExpression object) {
				return createAndExpressionAdapter();
			}
			@Override
			public Adapter caseAllExpression(AllExpression object) {
				return createAllExpressionAdapter();
			}
			@Override
			public Adapter caseConditionElement(ConditionElement object) {
				return createConditionElementAdapter();
			}
			@Override
			public Adapter caseSConditionElement(SConditionElement object) {
				return createSConditionElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter casePackageElement(PackageElement object) {
				return createPackageElementAdapter();
			}
			@Override
			public Adapter casePackageDeclaration(PackageDeclaration object) {
				return createPackageDeclarationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.ErrorModelSubclause <em>Error Model Subclause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.ErrorModelSubclause
	 * @generated
	 */
	public Adapter createErrorModelSubclauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.ErrorModelLibrary <em>Error Model Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.ErrorModelLibrary
	 * @generated
	 */
	public Adapter createErrorModelLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.ErrorTypes <em>Error Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.ErrorTypes
	 * @generated
	 */
	public Adapter createErrorTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.ErrorType <em>Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.ErrorType
	 * @generated
	 */
	public Adapter createErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.TypeSet <em>Type Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.TypeSet
	 * @generated
	 */
	public Adapter createTypeSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.TypeToken <em>Type Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.TypeToken
	 * @generated
	 */
	public Adapter createTypeTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.TypeTransformationSet <em>Type Transformation Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.TypeTransformationSet
	 * @generated
	 */
	public Adapter createTypeTransformationSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.TypeTransformation <em>Type Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.TypeTransformation
	 * @generated
	 */
	public Adapter createTypeTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.TypeMappingSet <em>Type Mapping Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.TypeMappingSet
	 * @generated
	 */
	public Adapter createTypeMappingSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.TypeMapping <em>Type Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.TypeMapping
	 * @generated
	 */
	public Adapter createTypeMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.ErrorPropagation <em>Error Propagation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.ErrorPropagation
	 * @generated
	 */
	public Adapter createErrorPropagationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.FeatureorPPReference <em>Featureor PP Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.FeatureorPPReference
	 * @generated
	 */
	public Adapter createFeatureorPPReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.ErrorFlow <em>Error Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.ErrorFlow
	 * @generated
	 */
	public Adapter createErrorFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.ErrorSource <em>Error Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.ErrorSource
	 * @generated
	 */
	public Adapter createErrorSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.ErrorSink <em>Error Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.ErrorSink
	 * @generated
	 */
	public Adapter createErrorSinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.ErrorPath <em>Error Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.ErrorPath
	 * @generated
	 */
	public Adapter createErrorPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.IfCondition <em>If Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.IfCondition
	 * @generated
	 */
	public Adapter createIfConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.PropagationPoint <em>Propagation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.PropagationPoint
	 * @generated
	 */
	public Adapter createPropagationPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.PropagationPath <em>Propagation Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.PropagationPath
	 * @generated
	 */
	public Adapter createPropagationPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.QualifiedPropagationPoint <em>Qualified Propagation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.QualifiedPropagationPoint
	 * @generated
	 */
	public Adapter createQualifiedPropagationPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.ErrorBehaviorStateMachine <em>Error Behavior State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.ErrorBehaviorStateMachine
	 * @generated
	 */
	public Adapter createErrorBehaviorStateMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.ErrorBehaviorEvent <em>Error Behavior Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.ErrorBehaviorEvent
	 * @generated
	 */
	public Adapter createErrorBehaviorEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.ErrorEvent <em>Error Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.ErrorEvent
	 * @generated
	 */
	public Adapter createErrorEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.RepairEvent <em>Repair Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.RepairEvent
	 * @generated
	 */
	public Adapter createRepairEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.RecoverEvent <em>Recover Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.RecoverEvent
	 * @generated
	 */
	public Adapter createRecoverEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.ErrorBehaviorState <em>Error Behavior State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.ErrorBehaviorState
	 * @generated
	 */
	public Adapter createErrorBehaviorStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.ErrorBehaviorTransition <em>Error Behavior Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.ErrorBehaviorTransition
	 * @generated
	 */
	public Adapter createErrorBehaviorTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.TransitionBranch <em>Transition Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.TransitionBranch
	 * @generated
	 */
	public Adapter createTransitionBranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.BranchValue <em>Branch Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.BranchValue
	 * @generated
	 */
	public Adapter createBranchValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.ConditionExpression <em>Condition Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.ConditionExpression
	 * @generated
	 */
	public Adapter createConditionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.OrmoreExpression <em>Ormore Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.OrmoreExpression
	 * @generated
	 */
	public Adapter createOrmoreExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.OrlessExpression <em>Orless Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.OrlessExpression
	 * @generated
	 */
	public Adapter createOrlessExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.EventOrPropagation <em>Event Or Propagation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.EventOrPropagation
	 * @generated
	 */
	public Adapter createEventOrPropagationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.OutgoingPropagationCondition <em>Outgoing Propagation Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.OutgoingPropagationCondition
	 * @generated
	 */
	public Adapter createOutgoingPropagationConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.ErrorDetection <em>Error Detection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.ErrorDetection
	 * @generated
	 */
	public Adapter createErrorDetectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.ErrorCodeValue <em>Error Code Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.ErrorCodeValue
	 * @generated
	 */
	public Adapter createErrorCodeValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.ErrorStateToModeMapping <em>Error State To Mode Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.ErrorStateToModeMapping
	 * @generated
	 */
	public Adapter createErrorStateToModeMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.CompositeState <em>Composite State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.CompositeState
	 * @generated
	 */
	public Adapter createCompositeStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.QualifiedErrorBehaviorState <em>Qualified Error Behavior State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.QualifiedErrorBehaviorState
	 * @generated
	 */
	public Adapter createQualifiedErrorBehaviorStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.SubcomponentElement <em>Subcomponent Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.SubcomponentElement
	 * @generated
	 */
	public Adapter createSubcomponentElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.EMV2Root <em>EMV2 Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.EMV2Root
	 * @generated
	 */
	public Adapter createEMV2RootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.OrExpression <em>Or Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.OrExpression
	 * @generated
	 */
	public Adapter createOrExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.AndExpression <em>And Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.AndExpression
	 * @generated
	 */
	public Adapter createAndExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.AllExpression <em>All Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.AllExpression
	 * @generated
	 */
	public Adapter createAllExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.ConditionElement <em>Condition Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.ConditionElement
	 * @generated
	 */
	public Adapter createConditionElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.emv3.emv3.SConditionElement <em>SCondition Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.emv3.emv3.SConditionElement
	 * @generated
	 */
	public Adapter createSConditionElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.aadlv3.aadlv3.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.aadlv3.aadlv3.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.aadlv3.aadlv3.PackageElement <em>Package Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.aadlv3.aadlv3.PackageElement
	 * @generated
	 */
	public Adapter createPackageElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.aadlv3.aadlv3.PackageDeclaration <em>Package Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.aadlv3.aadlv3.PackageDeclaration
	 * @generated
	 */
	public Adapter createPackageDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Emv3AdapterFactory
