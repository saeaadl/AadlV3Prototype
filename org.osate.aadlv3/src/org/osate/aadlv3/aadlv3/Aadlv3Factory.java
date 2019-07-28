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
package org.osate.aadlv3.aadlv3;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.osate.aadlv3.aadlv3.Aadlv3Package
 * @generated
 */
public interface Aadlv3Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Aadlv3Factory eINSTANCE = org.osate.aadlv3.aadlv3.impl.Aadlv3FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Package Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Declaration</em>'.
	 * @generated
	 */
	PackageDeclaration createPackageDeclaration();

	/**
	 * Returns a new object of class '<em>Property Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Definition</em>'.
	 * @generated
	 */
	PropertyDefinition createPropertyDefinition();

	/**
	 * Returns a new object of class '<em>Property Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Set</em>'.
	 * @generated
	 */
	PropertySet createPropertySet();

	/**
	 * Returns a new object of class '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type</em>'.
	 * @generated
	 */
	DataType createDataType();

	/**
	 * Returns a new object of class '<em>Component Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Interface</em>'.
	 * @generated
	 */
	ComponentInterface createComponentInterface();

	/**
	 * Returns a new object of class '<em>Component Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Implementation</em>'.
	 * @generated
	 */
	ComponentImplementation createComponentImplementation();

	/**
	 * Returns a new object of class '<em>Component Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Configuration</em>'.
	 * @generated
	 */
	ComponentConfiguration createComponentConfiguration();

	/**
	 * Returns a new object of class '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature</em>'.
	 * @generated
	 */
	Feature createFeature();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns a new object of class '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import</em>'.
	 * @generated
	 */
	Import createImport();

	/**
	 * Returns a new object of class '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association</em>'.
	 * @generated
	 */
	Association createAssociation();

	/**
	 * Returns a new object of class '<em>Model Element Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Element Reference</em>'.
	 * @generated
	 */
	ModelElementReference createModelElementReference();

	/**
	 * Returns a new object of class '<em>Configuration Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration Parameter</em>'.
	 * @generated
	 */
	ConfigurationParameter createConfigurationParameter();

	/**
	 * Returns a new object of class '<em>Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Reference</em>'.
	 * @generated
	 */
	TypeReference createTypeReference();

	/**
	 * Returns a new object of class '<em>Configuration Actual</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration Actual</em>'.
	 * @generated
	 */
	ConfigurationActual createConfigurationActual();

	/**
	 * Returns a new object of class '<em>Workingset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workingset</em>'.
	 * @generated
	 */
	Workingset createWorkingset();

	/**
	 * Returns a new object of class '<em>Property Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Value</em>'.
	 * @generated
	 */
	PropertyValue createPropertyValue();

	/**
	 * Returns a new object of class '<em>Property Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Association</em>'.
	 * @generated
	 */
	PropertyAssociation createPropertyAssociation();

	/**
	 * Returns a new object of class '<em>Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mode</em>'.
	 * @generated
	 */
	Mode createMode();

	/**
	 * Returns a new object of class '<em>Mode Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mode Transition</em>'.
	 * @generated
	 */
	ModeTransition createModeTransition();

	/**
	 * Returns a new object of class '<em>Mode Transition Trigger Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mode Transition Trigger Assignment</em>'.
	 * @generated
	 */
	ModeTransitionTriggerAssignment createModeTransitionTriggerAssignment();

	/**
	 * Returns a new object of class '<em>Mode Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mode Assignment</em>'.
	 * @generated
	 */
	ModeAssignment createModeAssignment();

	/**
	 * Returns a new object of class '<em>Mode State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mode State Machine</em>'.
	 * @generated
	 */
	ModeStateMachine createModeStateMachine();

	/**
	 * Returns a new object of class '<em>Annex Subclause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annex Subclause</em>'.
	 * @generated
	 */
	AnnexSubclause createAnnexSubclause();

	/**
	 * Returns a new object of class '<em>Annex Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annex Element</em>'.
	 * @generated
	 */
	AnnexElement createAnnexElement();

	/**
	 * Returns a new object of class '<em>Type Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Set</em>'.
	 * @generated
	 */
	TypeSet createTypeSet();

	/**
	 * Returns a new object of class '<em>Annex Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annex Library</em>'.
	 * @generated
	 */
	AnnexLibrary createAnnexLibrary();

	/**
	 * Returns a new object of class '<em>Annex Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annex Definition</em>'.
	 * @generated
	 */
	AnnexDefinition createAnnexDefinition();

	/**
	 * Returns a new object of class '<em>Path Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path Element</em>'.
	 * @generated
	 */
	PathElement createPathElement();

	/**
	 * Returns a new object of class '<em>Classifier Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Classifier Assignment</em>'.
	 * @generated
	 */
	ClassifierAssignment createClassifierAssignment();

	/**
	 * Returns a new object of class '<em>Classifier Assignment Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Classifier Assignment Pattern</em>'.
	 * @generated
	 */
	ClassifierAssignmentPattern createClassifierAssignmentPattern();

	/**
	 * Returns a new object of class '<em>Path Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path Sequence</em>'.
	 * @generated
	 */
	PathSequence createPathSequence();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Aadlv3Package getAadlv3Package();

} //Aadlv3Factory
