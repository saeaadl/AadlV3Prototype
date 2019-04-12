/**
 * Copyright Text	Copyright 2018 Carnegie Mellon University. All Rights Reserved....
 */
package org.osate.emv3.emv3.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.osate.aadlv3.aadlv3.NamedElement;
import org.osate.aadlv3.aadlv3.PackageDeclaration;
import org.osate.aadlv3.aadlv3.PackageElement;

import org.osate.emv3.emv3.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.osate.emv3.emv3.Emv3Package
 * @generated
 */
public class Emv3Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Emv3Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Emv3Switch() {
		if (modelPackage == null) {
			modelPackage = Emv3Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Emv3Package.ERROR_MODEL_SUBCLAUSE: {
				ErrorModelSubclause errorModelSubclause = (ErrorModelSubclause)theEObject;
				T result = caseErrorModelSubclause(errorModelSubclause);
				if (result == null) result = casePackageElement(errorModelSubclause);
				if (result == null) result = caseNamedElement(errorModelSubclause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.ERROR_MODEL_LIBRARY: {
				ErrorModelLibrary errorModelLibrary = (ErrorModelLibrary)theEObject;
				T result = caseErrorModelLibrary(errorModelLibrary);
				if (result == null) result = casePackageDeclaration(errorModelLibrary);
				if (result == null) result = casePackageElement(errorModelLibrary);
				if (result == null) result = caseNamedElement(errorModelLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.ERROR_TYPES: {
				ErrorTypes errorTypes = (ErrorTypes)theEObject;
				T result = caseErrorTypes(errorTypes);
				if (result == null) result = casePackageElement(errorTypes);
				if (result == null) result = caseNamedElement(errorTypes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.ERROR_TYPE: {
				ErrorType errorType = (ErrorType)theEObject;
				T result = caseErrorType(errorType);
				if (result == null) result = caseErrorTypes(errorType);
				if (result == null) result = casePackageElement(errorType);
				if (result == null) result = caseNamedElement(errorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.TYPE_SET: {
				TypeSet typeSet = (TypeSet)theEObject;
				T result = caseTypeSet(typeSet);
				if (result == null) result = caseErrorTypes(typeSet);
				if (result == null) result = casePackageElement(typeSet);
				if (result == null) result = caseNamedElement(typeSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.TYPE_TOKEN: {
				TypeToken typeToken = (TypeToken)theEObject;
				T result = caseTypeToken(typeToken);
				if (result == null) result = caseNamedElement(typeToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.TYPE_TRANSFORMATION_SET: {
				TypeTransformationSet typeTransformationSet = (TypeTransformationSet)theEObject;
				T result = caseTypeTransformationSet(typeTransformationSet);
				if (result == null) result = casePackageElement(typeTransformationSet);
				if (result == null) result = caseNamedElement(typeTransformationSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.TYPE_TRANSFORMATION: {
				TypeTransformation typeTransformation = (TypeTransformation)theEObject;
				T result = caseTypeTransformation(typeTransformation);
				if (result == null) result = caseNamedElement(typeTransformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.TYPE_MAPPING_SET: {
				TypeMappingSet typeMappingSet = (TypeMappingSet)theEObject;
				T result = caseTypeMappingSet(typeMappingSet);
				if (result == null) result = casePackageElement(typeMappingSet);
				if (result == null) result = caseNamedElement(typeMappingSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.TYPE_MAPPING: {
				TypeMapping typeMapping = (TypeMapping)theEObject;
				T result = caseTypeMapping(typeMapping);
				if (result == null) result = caseNamedElement(typeMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.ERROR_PROPAGATION: {
				ErrorPropagation errorPropagation = (ErrorPropagation)theEObject;
				T result = caseErrorPropagation(errorPropagation);
				if (result == null) result = caseEventOrPropagation(errorPropagation);
				if (result == null) result = caseNamedElement(errorPropagation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.FEATUREOR_PP_REFERENCE: {
				FeatureorPPReference featureorPPReference = (FeatureorPPReference)theEObject;
				T result = caseFeatureorPPReference(featureorPPReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.ERROR_FLOW: {
				ErrorFlow errorFlow = (ErrorFlow)theEObject;
				T result = caseErrorFlow(errorFlow);
				if (result == null) result = caseNamedElement(errorFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.ERROR_SOURCE: {
				ErrorSource errorSource = (ErrorSource)theEObject;
				T result = caseErrorSource(errorSource);
				if (result == null) result = caseErrorFlow(errorSource);
				if (result == null) result = caseNamedElement(errorSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.ERROR_SINK: {
				ErrorSink errorSink = (ErrorSink)theEObject;
				T result = caseErrorSink(errorSink);
				if (result == null) result = caseErrorFlow(errorSink);
				if (result == null) result = caseNamedElement(errorSink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.ERROR_PATH: {
				ErrorPath errorPath = (ErrorPath)theEObject;
				T result = caseErrorPath(errorPath);
				if (result == null) result = caseErrorFlow(errorPath);
				if (result == null) result = caseNamedElement(errorPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.IF_CONDITION: {
				IfCondition ifCondition = (IfCondition)theEObject;
				T result = caseIfCondition(ifCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.PROPAGATION_POINT: {
				PropagationPoint propagationPoint = (PropagationPoint)theEObject;
				T result = casePropagationPoint(propagationPoint);
				if (result == null) result = caseNamedElement(propagationPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.PROPAGATION_PATH: {
				PropagationPath propagationPath = (PropagationPath)theEObject;
				T result = casePropagationPath(propagationPath);
				if (result == null) result = caseNamedElement(propagationPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.QUALIFIED_PROPAGATION_POINT: {
				QualifiedPropagationPoint qualifiedPropagationPoint = (QualifiedPropagationPoint)theEObject;
				T result = caseQualifiedPropagationPoint(qualifiedPropagationPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.ERROR_BEHAVIOR_STATE_MACHINE: {
				ErrorBehaviorStateMachine errorBehaviorStateMachine = (ErrorBehaviorStateMachine)theEObject;
				T result = caseErrorBehaviorStateMachine(errorBehaviorStateMachine);
				if (result == null) result = caseNamedElement(errorBehaviorStateMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.ERROR_BEHAVIOR_EVENT: {
				ErrorBehaviorEvent errorBehaviorEvent = (ErrorBehaviorEvent)theEObject;
				T result = caseErrorBehaviorEvent(errorBehaviorEvent);
				if (result == null) result = caseEventOrPropagation(errorBehaviorEvent);
				if (result == null) result = caseNamedElement(errorBehaviorEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.ERROR_EVENT: {
				ErrorEvent errorEvent = (ErrorEvent)theEObject;
				T result = caseErrorEvent(errorEvent);
				if (result == null) result = caseErrorBehaviorEvent(errorEvent);
				if (result == null) result = caseEventOrPropagation(errorEvent);
				if (result == null) result = caseNamedElement(errorEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.REPAIR_EVENT: {
				RepairEvent repairEvent = (RepairEvent)theEObject;
				T result = caseRepairEvent(repairEvent);
				if (result == null) result = caseErrorBehaviorEvent(repairEvent);
				if (result == null) result = caseEventOrPropagation(repairEvent);
				if (result == null) result = caseNamedElement(repairEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.RECOVER_EVENT: {
				RecoverEvent recoverEvent = (RecoverEvent)theEObject;
				T result = caseRecoverEvent(recoverEvent);
				if (result == null) result = caseErrorBehaviorEvent(recoverEvent);
				if (result == null) result = caseEventOrPropagation(recoverEvent);
				if (result == null) result = caseNamedElement(recoverEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.ERROR_BEHAVIOR_STATE: {
				ErrorBehaviorState errorBehaviorState = (ErrorBehaviorState)theEObject;
				T result = caseErrorBehaviorState(errorBehaviorState);
				if (result == null) result = caseNamedElement(errorBehaviorState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.ERROR_BEHAVIOR_TRANSITION: {
				ErrorBehaviorTransition errorBehaviorTransition = (ErrorBehaviorTransition)theEObject;
				T result = caseErrorBehaviorTransition(errorBehaviorTransition);
				if (result == null) result = caseNamedElement(errorBehaviorTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.TRANSITION_BRANCH: {
				TransitionBranch transitionBranch = (TransitionBranch)theEObject;
				T result = caseTransitionBranch(transitionBranch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.BRANCH_VALUE: {
				BranchValue branchValue = (BranchValue)theEObject;
				T result = caseBranchValue(branchValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.CONDITION_EXPRESSION: {
				ConditionExpression conditionExpression = (ConditionExpression)theEObject;
				T result = caseConditionExpression(conditionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.ORMORE_EXPRESSION: {
				OrmoreExpression ormoreExpression = (OrmoreExpression)theEObject;
				T result = caseOrmoreExpression(ormoreExpression);
				if (result == null) result = caseConditionExpression(ormoreExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.ORLESS_EXPRESSION: {
				OrlessExpression orlessExpression = (OrlessExpression)theEObject;
				T result = caseOrlessExpression(orlessExpression);
				if (result == null) result = caseConditionExpression(orlessExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.EVENT_OR_PROPAGATION: {
				EventOrPropagation eventOrPropagation = (EventOrPropagation)theEObject;
				T result = caseEventOrPropagation(eventOrPropagation);
				if (result == null) result = caseNamedElement(eventOrPropagation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.OUTGOING_PROPAGATION_CONDITION: {
				OutgoingPropagationCondition outgoingPropagationCondition = (OutgoingPropagationCondition)theEObject;
				T result = caseOutgoingPropagationCondition(outgoingPropagationCondition);
				if (result == null) result = caseNamedElement(outgoingPropagationCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.ERROR_DETECTION: {
				ErrorDetection errorDetection = (ErrorDetection)theEObject;
				T result = caseErrorDetection(errorDetection);
				if (result == null) result = caseNamedElement(errorDetection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.ERROR_CODE_VALUE: {
				ErrorCodeValue errorCodeValue = (ErrorCodeValue)theEObject;
				T result = caseErrorCodeValue(errorCodeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.ERROR_STATE_TO_MODE_MAPPING: {
				ErrorStateToModeMapping errorStateToModeMapping = (ErrorStateToModeMapping)theEObject;
				T result = caseErrorStateToModeMapping(errorStateToModeMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.COMPOSITE_STATE: {
				CompositeState compositeState = (CompositeState)theEObject;
				T result = caseCompositeState(compositeState);
				if (result == null) result = caseNamedElement(compositeState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.QUALIFIED_ERROR_BEHAVIOR_STATE: {
				QualifiedErrorBehaviorState qualifiedErrorBehaviorState = (QualifiedErrorBehaviorState)theEObject;
				T result = caseQualifiedErrorBehaviorState(qualifiedErrorBehaviorState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.SUBCOMPONENT_ELEMENT: {
				SubcomponentElement subcomponentElement = (SubcomponentElement)theEObject;
				T result = caseSubcomponentElement(subcomponentElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.EMV2_ROOT: {
				EMV2Root emv2Root = (EMV2Root)theEObject;
				T result = caseEMV2Root(emv2Root);
				if (result == null) result = caseNamedElement(emv2Root);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.OR_EXPRESSION: {
				OrExpression orExpression = (OrExpression)theEObject;
				T result = caseOrExpression(orExpression);
				if (result == null) result = caseConditionExpression(orExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.AND_EXPRESSION: {
				AndExpression andExpression = (AndExpression)theEObject;
				T result = caseAndExpression(andExpression);
				if (result == null) result = caseConditionExpression(andExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.ALL_EXPRESSION: {
				AllExpression allExpression = (AllExpression)theEObject;
				T result = caseAllExpression(allExpression);
				if (result == null) result = caseConditionExpression(allExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.CONDITION_ELEMENT: {
				ConditionElement conditionElement = (ConditionElement)theEObject;
				T result = caseConditionElement(conditionElement);
				if (result == null) result = caseNamedElement(conditionElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Emv3Package.SCONDITION_ELEMENT: {
				SConditionElement sConditionElement = (SConditionElement)theEObject;
				T result = caseSConditionElement(sConditionElement);
				if (result == null) result = caseConditionElement(sConditionElement);
				if (result == null) result = caseNamedElement(sConditionElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Model Subclause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Model Subclause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorModelSubclause(ErrorModelSubclause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Model Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Model Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorModelLibrary(ErrorModelLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorTypes(ErrorTypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorType(ErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSet(TypeSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeToken(TypeToken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Transformation Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Transformation Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTransformationSet(TypeTransformationSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTransformation(TypeTransformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mapping Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mapping Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMappingSet(TypeMappingSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMapping(TypeMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Propagation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Propagation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorPropagation(ErrorPropagation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Featureor PP Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Featureor PP Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureorPPReference(FeatureorPPReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorFlow(ErrorFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorSource(ErrorSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Sink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Sink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorSink(ErrorSink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorPath(ErrorPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfCondition(IfCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagation Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagation Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagationPoint(PropagationPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagation Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagation Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagationPath(PropagationPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualified Propagation Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualified Propagation Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualifiedPropagationPoint(QualifiedPropagationPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Behavior State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Behavior State Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorBehaviorStateMachine(ErrorBehaviorStateMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Behavior Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Behavior Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorBehaviorEvent(ErrorBehaviorEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorEvent(ErrorEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repair Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repair Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepairEvent(RepairEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recover Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recover Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecoverEvent(RecoverEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Behavior State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Behavior State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorBehaviorState(ErrorBehaviorState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Behavior Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Behavior Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorBehaviorTransition(ErrorBehaviorTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Branch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Branch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionBranch(TransitionBranch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Branch Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Branch Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBranchValue(BranchValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionExpression(ConditionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ormore Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ormore Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrmoreExpression(OrmoreExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orless Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orless Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrlessExpression(OrlessExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Or Propagation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Or Propagation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventOrPropagation(EventOrPropagation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outgoing Propagation Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outgoing Propagation Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutgoingPropagationCondition(OutgoingPropagationCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Detection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Detection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorDetection(ErrorDetection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Code Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Code Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorCodeValue(ErrorCodeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error State To Mode Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error State To Mode Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorStateToModeMapping(ErrorStateToModeMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeState(CompositeState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualified Error Behavior State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualified Error Behavior State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualifiedErrorBehaviorState(QualifiedErrorBehaviorState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subcomponent Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subcomponent Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubcomponentElement(SubcomponentElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMV2 Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMV2 Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMV2Root(EMV2Root object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrExpression(OrExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndExpression(AndExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllExpression(AllExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionElement(ConditionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SCondition Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SCondition Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSConditionElement(SConditionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageElement(PackageElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageDeclaration(PackageDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Emv3Switch
