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
		case Aadlv3Package.CLASSIFIER_OR_TYPE: {
			ClassifierOrType classifierOrType = (ClassifierOrType) theEObject;
			T result = caseClassifierOrType(classifierOrType);
			if (result == null)
				result = caseNamedElement(classifierOrType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.CLASSIFIER: {
			Classifier classifier = (Classifier) theEObject;
			T result = caseClassifier(classifier);
			if (result == null)
				result = casePackageElement(classifier);
			if (result == null)
				result = caseClassifierOrType(classifier);
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
				result = casePackageElement(componentRealization);
			if (result == null)
				result = caseClassifierOrType(componentRealization);
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
				result = casePackageElement(componentInterface);
			if (result == null)
				result = caseClassifierOrType(componentInterface);
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
				result = casePackageElement(componentImplementation);
			if (result == null)
				result = caseClassifierOrType(componentImplementation);
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
				result = casePackageElement(componentConfiguration);
			if (result == null)
				result = caseClassifierOrType(componentConfiguration);
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
				result = caseClassifierOrType(configurationParameter);
			if (result == null)
				result = caseNamedElement(configurationParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.TYPE_REFERENCE: {
			TypeReference typeReference = (TypeReference) theEObject;
			T result = caseTypeReference(typeReference);
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
		case Aadlv3Package.NUMBER_LITERAL: {
			NumberLiteral numberLiteral = (NumberLiteral) theEObject;
			T result = caseNumberLiteral(numberLiteral);
			if (result == null)
				result = caseLiteral(numberLiteral);
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
				result = caseLiteral(integerLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.LITERAL: {
			Literal literal = (Literal) theEObject;
			T result = caseLiteral(literal);
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
		case Aadlv3Package.MODE: {
			Mode mode = (Mode) theEObject;
			T result = caseMode(mode);
			if (result == null)
				result = caseModelElement(mode);
			if (result == null)
				result = caseNamedElement(mode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.MODE_TRANSITION: {
			ModeTransition modeTransition = (ModeTransition) theEObject;
			T result = caseModeTransition(modeTransition);
			if (result == null)
				result = caseModelElement(modeTransition);
			if (result == null)
				result = caseNamedElement(modeTransition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.MODE_TRANSITION_TRIGGER_ASSIGNMENT: {
			ModeTransitionTriggerAssignment modeTransitionTriggerAssignment = (ModeTransitionTriggerAssignment) theEObject;
			T result = caseModeTransitionTriggerAssignment(modeTransitionTriggerAssignment);
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
		case Aadlv3Package.MODE_STATE_MACHINE: {
			ModeStateMachine modeStateMachine = (ModeStateMachine) theEObject;
			T result = caseModeStateMachine(modeStateMachine);
			if (result == null)
				result = casePackageElement(modeStateMachine);
			if (result == null)
				result = caseNamedElement(modeStateMachine);
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
		case Aadlv3Package.ANNEX_ELEMENT: {
			AnnexElement annexElement = (AnnexElement) theEObject;
			T result = caseAnnexElement(annexElement);
			if (result == null)
				result = caseModelElement(annexElement);
			if (result == null)
				result = caseNamedElement(annexElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.TYPE_SET: {
			TypeSet typeSet = (TypeSet) theEObject;
			T result = caseTypeSet(typeSet);
			if (result == null)
				result = caseModelElement(typeSet);
			if (result == null)
				result = caseNamedElement(typeSet);
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
		case Aadlv3Package.ANNEX_DEFINITION: {
			AnnexDefinition annexDefinition = (AnnexDefinition) theEObject;
			T result = caseAnnexDefinition(annexDefinition);
			if (result == null)
				result = casePackageElement(annexDefinition);
			if (result == null)
				result = caseNamedElement(annexDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aadlv3Package.TYPE_DECL: {
			TypeDecl typeDecl = (TypeDecl) theEObject;
			T result = caseTypeDecl(typeDecl);
			if (result == null)
				result = caseClassifierOrType(typeDecl);
			if (result == null)
				result = casePackageElement(typeDecl);
			if (result == null)
				result = caseNamedElement(typeDecl);
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
	 * Returns the result of interpreting the object as an instance of '<em>Classifier Or Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier Or Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifierOrType(ClassifierOrType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMode(Mode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeTransition(ModeTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Transition Trigger Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Transition Trigger Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeTransitionTriggerAssignment(ModeTransitionTriggerAssignment object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Mode State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode State Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeStateMachine(ModeStateMachine object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Annex Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annex Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnexElement(AnnexElement object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Annex Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annex Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnexDefinition(AnnexDefinition object) {
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
