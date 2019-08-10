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
package org.osate.aadlv3.aadlv3.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.osate.aadlv3.aadlv3.*;

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
 * @see org.osate.aadlv3.aadlv3.Aadlv3Package
 * @generated
 */
public class Aadlv3Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Aadlv3Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aadlv3Switch() {
		if (modelPackage == null) {
			modelPackage = Aadlv3Package.eINSTANCE;
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
		case Aadlv3Package.PACKAGE_DECLARATION: {
			PackageDeclaration packageDeclaration = (PackageDeclaration) theEObject;
			T result = casePackageDeclaration(packageDeclaration);
			if (result == null)
				result = casePackageElement(packageDeclaration);
			if (result == null)
				result = caseNamedElement(packageDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.NAMED_ELEMENT: {
			NamedElement namedElement = (NamedElement) theEObject;
			T result = caseNamedElement(namedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.PACKAGE_ELEMENT: {
			PackageElement packageElement = (PackageElement) theEObject;
			T result = casePackageElement(packageElement);
			if (result == null)
				result = caseNamedElement(packageElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.PROPERTY_DEFINITION: {
			PropertyDefinition propertyDefinition = (PropertyDefinition) theEObject;
			T result = casePropertyDefinition(propertyDefinition);
			if (result == null)
				result = casePackageElement(propertyDefinition);
			if (result == null)
				result = caseNamedElement(propertyDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.PROPERTY_SET: {
			PropertySet propertySet = (PropertySet) theEObject;
			T result = casePropertySet(propertySet);
			if (result == null)
				result = casePackageElement(propertySet);
			if (result == null)
				result = caseNamedElement(propertySet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.MODEL_ELEMENT: {
			ModelElement modelElement = (ModelElement) theEObject;
			T result = caseModelElement(modelElement);
			if (result == null)
				result = caseNamedElement(modelElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.CLASSIFIER: {
			Classifier classifier = (Classifier) theEObject;
			T result = caseClassifier(classifier);
			if (result == null)
				result = caseNamedType(classifier);
			if (result == null)
				result = casePackageElement(classifier);
			if (result == null)
				result = caseType(classifier);
			if (result == null)
				result = caseNamedElement(classifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.COMPONENT_REALIZATION: {
			ComponentRealization componentRealization = (ComponentRealization) theEObject;
			T result = caseComponentRealization(componentRealization);
			if (result == null)
				result = caseClassifier(componentRealization);
			if (result == null)
				result = caseNamedType(componentRealization);
			if (result == null)
				result = casePackageElement(componentRealization);
			if (result == null)
				result = caseType(componentRealization);
			if (result == null)
				result = caseNamedElement(componentRealization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.COMPONENT_INTERFACE: {
			ComponentInterface componentInterface = (ComponentInterface) theEObject;
			T result = caseComponentInterface(componentInterface);
			if (result == null)
				result = caseClassifier(componentInterface);
			if (result == null)
				result = caseNamedType(componentInterface);
			if (result == null)
				result = casePackageElement(componentInterface);
			if (result == null)
				result = caseType(componentInterface);
			if (result == null)
				result = caseNamedElement(componentInterface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.COMPONENT_IMPLEMENTATION: {
			ComponentImplementation componentImplementation = (ComponentImplementation) theEObject;
			T result = caseComponentImplementation(componentImplementation);
			if (result == null)
				result = caseComponentRealization(componentImplementation);
			if (result == null)
				result = caseClassifier(componentImplementation);
			if (result == null)
				result = caseNamedType(componentImplementation);
			if (result == null)
				result = casePackageElement(componentImplementation);
			if (result == null)
				result = caseType(componentImplementation);
			if (result == null)
				result = caseNamedElement(componentImplementation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.COMPONENT_CONFIGURATION: {
			ComponentConfiguration componentConfiguration = (ComponentConfiguration) theEObject;
			T result = caseComponentConfiguration(componentConfiguration);
			if (result == null)
				result = caseComponentRealization(componentConfiguration);
			if (result == null)
				result = caseClassifier(componentConfiguration);
			if (result == null)
				result = caseNamedType(componentConfiguration);
			if (result == null)
				result = casePackageElement(componentConfiguration);
			if (result == null)
				result = caseType(componentConfiguration);
			if (result == null)
				result = caseNamedElement(componentConfiguration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.FEATURE: {
			Feature feature = (Feature) theEObject;
			T result = caseFeature(feature);
			if (result == null)
				result = caseModelElement(feature);
			if (result == null)
				result = caseNamedElement(feature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.SUBCOMPONENT: {
			Subcomponent subcomponent = (Subcomponent) theEObject;
			T result = caseSubcomponent(subcomponent);
			if (result == null)
				result = caseModelElement(subcomponent);
			if (result == null)
				result = caseNamedElement(subcomponent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.IMPORT: {
			Import import_ = (Import) theEObject;
			T result = caseImport(import_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.ASSOCIATION: {
			Association association = (Association) theEObject;
			T result = caseAssociation(association);
			if (result == null)
				result = caseModelElement(association);
			if (result == null)
				result = caseNamedElement(association);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.PATH_SEQUENCE: {
			PathSequence pathSequence = (PathSequence) theEObject;
			T result = casePathSequence(pathSequence);
			if (result == null)
				result = caseModelElement(pathSequence);
			if (result == null)
				result = caseNamedElement(pathSequence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.PATH_ELEMENT: {
			PathElement pathElement = (PathElement) theEObject;
			T result = casePathElement(pathElement);
			if (result == null)
				result = caseModelElementReference(pathElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.CLASSIFIER_ASSIGNMENT: {
			ClassifierAssignment classifierAssignment = (ClassifierAssignment) theEObject;
			T result = caseClassifierAssignment(classifierAssignment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.CLASSIFIER_ASSIGNMENT_PATTERN: {
			ClassifierAssignmentPattern classifierAssignmentPattern = (ClassifierAssignmentPattern) theEObject;
			T result = caseClassifierAssignmentPattern(classifierAssignmentPattern);
			if (result == null)
				result = caseClassifierAssignment(classifierAssignmentPattern);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.MODEL_ELEMENT_REFERENCE: {
			ModelElementReference modelElementReference = (ModelElementReference) theEObject;
			T result = caseModelElementReference(modelElementReference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.CONFIGURATION_PARAMETER: {
			ConfigurationParameter configurationParameter = (ConfigurationParameter) theEObject;
			T result = caseConfigurationParameter(configurationParameter);
			if (result == null)
				result = caseNamedType(configurationParameter);
			if (result == null)
				result = casePackageElement(configurationParameter);
			if (result == null)
				result = caseType(configurationParameter);
			if (result == null)
				result = caseNamedElement(configurationParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.CONFIGURATION_ACTUAL: {
			ConfigurationActual configurationActual = (ConfigurationActual) theEObject;
			T result = caseConfigurationActual(configurationActual);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.WORKINGSET: {
			Workingset workingset = (Workingset) theEObject;
			T result = caseWorkingset(workingset);
			if (result == null)
				result = casePackageElement(workingset);
			if (result == null)
				result = caseNamedElement(workingset);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.TYPE: {
			Type type = (Type) theEObject;
			T result = caseType(type);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.NAMED_TYPE: {
			NamedType namedType = (NamedType) theEObject;
			T result = caseNamedType(namedType);
			if (result == null)
				result = casePackageElement(namedType);
			if (result == null)
				result = caseType(namedType);
			if (result == null)
				result = caseNamedElement(namedType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.TYPE_DECL: {
			TypeDecl typeDecl = (TypeDecl) theEObject;
			T result = caseTypeDecl(typeDecl);
			if (result == null)
				result = caseNamedType(typeDecl);
			if (result == null)
				result = casePackageElement(typeDecl);
			if (result == null)
				result = caseType(typeDecl);
			if (result == null)
				result = caseNamedElement(typeDecl);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.PRIMITIVE_TYPE: {
			PrimitiveType primitiveType = (PrimitiveType) theEObject;
			T result = casePrimitiveType(primitiveType);
			if (result == null)
				result = caseType(primitiveType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.COMPOSITE_TYPE: {
			CompositeType compositeType = (CompositeType) theEObject;
			T result = caseCompositeType(compositeType);
			if (result == null)
				result = caseType(compositeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.TYPE_REFERENCE: {
			TypeReference typeReference = (TypeReference) theEObject;
			T result = caseTypeReference(typeReference);
			if (result == null)
				result = caseType(typeReference);
			if (result == null)
				result = caseSingleLiteral(typeReference);
			if (result == null)
				result = caseLiteral(typeReference);
			if (result == null)
				result = caseExpression(typeReference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.LITERAL: {
			Literal literal = (Literal) theEObject;
			T result = caseLiteral(literal);
			if (result == null)
				result = caseExpression(literal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.SINGLE_LITERAL: {
			SingleLiteral singleLiteral = (SingleLiteral) theEObject;
			T result = caseSingleLiteral(singleLiteral);
			if (result == null)
				result = caseLiteral(singleLiteral);
			if (result == null)
				result = caseExpression(singleLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.NUMBER_LITERAL: {
			NumberLiteral numberLiteral = (NumberLiteral) theEObject;
			T result = caseNumberLiteral(numberLiteral);
			if (result == null)
				result = caseSingleLiteral(numberLiteral);
			if (result == null)
				result = caseLiteral(numberLiteral);
			if (result == null)
				result = caseExpression(numberLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.INTEGER_LITERAL: {
			IntegerLiteral integerLiteral = (IntegerLiteral) theEObject;
			T result = caseIntegerLiteral(integerLiteral);
			if (result == null)
				result = caseNumberLiteral(integerLiteral);
			if (result == null)
				result = caseSingleLiteral(integerLiteral);
			if (result == null)
				result = caseLiteral(integerLiteral);
			if (result == null)
				result = caseExpression(integerLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.REAL_LITERAL: {
			RealLiteral realLiteral = (RealLiteral) theEObject;
			T result = caseRealLiteral(realLiteral);
			if (result == null)
				result = caseNumberLiteral(realLiteral);
			if (result == null)
				result = caseSingleLiteral(realLiteral);
			if (result == null)
				result = caseLiteral(realLiteral);
			if (result == null)
				result = caseExpression(realLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.STRING_LITERAL: {
			StringLiteral stringLiteral = (StringLiteral) theEObject;
			T result = caseStringLiteral(stringLiteral);
			if (result == null)
				result = caseSingleLiteral(stringLiteral);
			if (result == null)
				result = caseLiteral(stringLiteral);
			if (result == null)
				result = caseExpression(stringLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.BOOLEAN_LITERAL: {
			BooleanLiteral booleanLiteral = (BooleanLiteral) theEObject;
			T result = caseBooleanLiteral(booleanLiteral);
			if (result == null)
				result = caseSingleLiteral(booleanLiteral);
			if (result == null)
				result = caseLiteral(booleanLiteral);
			if (result == null)
				result = caseExpression(booleanLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.DIRECTIONAL_LITERAL: {
			DirectionalLiteral directionalLiteral = (DirectionalLiteral) theEObject;
			T result = caseDirectionalLiteral(directionalLiteral);
			if (result == null)
				result = caseLiteral(directionalLiteral);
			if (result == null)
				result = caseExpression(directionalLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.ECOLLECTION: {
			ECollection eCollection = (ECollection) theEObject;
			T result = caseECollection(eCollection);
			if (result == null)
				result = caseExpression(eCollection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.LCOLLECTION: {
			LCollection lCollection = (LCollection) theEObject;
			T result = caseLCollection(lCollection);
			if (result == null)
				result = caseLiteral(lCollection);
			if (result == null)
				result = caseExpression(lCollection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.LIST_LITERAL: {
			ListLiteral listLiteral = (ListLiteral) theEObject;
			T result = caseListLiteral(listLiteral);
			if (result == null)
				result = caseLCollection(listLiteral);
			if (result == null)
				result = caseLiteral(listLiteral);
			if (result == null)
				result = caseExpression(listLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.SET_LITERAL: {
			SetLiteral setLiteral = (SetLiteral) theEObject;
			T result = caseSetLiteral(setLiteral);
			if (result == null)
				result = caseLCollection(setLiteral);
			if (result == null)
				result = caseLiteral(setLiteral);
			if (result == null)
				result = caseExpression(setLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.EXPRESSION: {
			Expression expression = (Expression) theEObject;
			T result = caseExpression(expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.MULTI_LITERAL_OPERATION: {
			MultiLiteralOperation multiLiteralOperation = (MultiLiteralOperation) theEObject;
			T result = caseMultiLiteralOperation(multiLiteralOperation);
			if (result == null)
				result = caseLCollection(multiLiteralOperation);
			if (result == null)
				result = caseLiteral(multiLiteralOperation);
			if (result == null)
				result = caseExpression(multiLiteralOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.MULTI_EXPRESSION_OPERATION: {
			MultiExpressionOperation multiExpressionOperation = (MultiExpressionOperation) theEObject;
			T result = caseMultiExpressionOperation(multiExpressionOperation);
			if (result == null)
				result = caseECollection(multiExpressionOperation);
			if (result == null)
				result = caseExpression(multiExpressionOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.PROPERTY_ASSOCIATION: {
			PropertyAssociation propertyAssociation = (PropertyAssociation) theEObject;
			T result = casePropertyAssociation(propertyAssociation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.STATE: {
			State state = (State) theEObject;
			T result = caseState(state);
			if (result == null)
				result = caseModelElement(state);
			if (result == null)
				result = caseNamedElement(state);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.TRANSITION: {
			Transition transition = (Transition) theEObject;
			T result = caseTransition(transition);
			if (result == null)
				result = caseModelElement(transition);
			if (result == null)
				result = caseNamedElement(transition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.TRANSITION_TRIGGER_ASSIGNMENT: {
			TransitionTriggerAssignment transitionTriggerAssignment = (TransitionTriggerAssignment) theEObject;
			T result = caseTransitionTriggerAssignment(transitionTriggerAssignment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.MODE_ASSIGNMENT: {
			ModeAssignment modeAssignment = (ModeAssignment) theEObject;
			T result = caseModeAssignment(modeAssignment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.STATE_MACHINE: {
			StateMachine stateMachine = (StateMachine) theEObject;
			T result = caseStateMachine(stateMachine);
			if (result == null)
				result = casePackageElement(stateMachine);
			if (result == null)
				result = caseNamedElement(stateMachine);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.ANNEX_SUBCLAUSE: {
			AnnexSubclause annexSubclause = (AnnexSubclause) theEObject;
			T result = caseAnnexSubclause(annexSubclause);
			if (result == null)
				result = caseModelElement(annexSubclause);
			if (result == null)
				result = caseNamedElement(annexSubclause);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.ANNEX_LIBRARY: {
			AnnexLibrary annexLibrary = (AnnexLibrary) theEObject;
			T result = caseAnnexLibrary(annexLibrary);
			if (result == null)
				result = casePackageDeclaration(annexLibrary);
			if (result == null)
				result = casePackageElement(annexLibrary);
			if (result == null)
				result = caseNamedElement(annexLibrary);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Property Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyDefinition(PropertyDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertySet(PropertySet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifier(Classifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentInterface(ComponentInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentImplementation(ComponentImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentConfiguration(ComponentConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subcomponent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subcomponent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubcomponent(Subcomponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImport(Import object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociation(Association object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElementReference(ModelElementReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationParameter(ConfigurationParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeReference(TypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedType(NamedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Actual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Actual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationActual(ConfigurationActual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workingset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workingset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkingset(Workingset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberLiteral(NumberLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerLiteral(IntegerLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealLiteral(RealLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringLiteral(StringLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanLiteral(BooleanLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListLiteral(ListLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetLiteral(SetLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directional Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directional Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectionalLiteral(DirectionalLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ECollection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ECollection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseECollection(ECollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LCollection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LCollection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLCollection(LCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteral(Literal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleLiteral(SingleLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Literal Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Literal Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiLiteralOperation(MultiLiteralOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Expression Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Expression Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiExpressionOperation(MultiExpressionOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyAssociation(PropertyAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Trigger Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Trigger Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionTriggerAssignment(TransitionTriggerAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeAssignment(ModeAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateMachine(StateMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annex Subclause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annex Subclause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnexSubclause(AnnexSubclause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annex Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annex Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnexLibrary(AnnexLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDecl(TypeDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveType(PrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeType(CompositeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathElement(PathElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifierAssignment(ClassifierAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier Assignment Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier Assignment Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifierAssignmentPattern(ClassifierAssignmentPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathSequence(PathSequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Realization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Realization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentRealization(ComponentRealization object) {
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

} //Aadlv3Switch
