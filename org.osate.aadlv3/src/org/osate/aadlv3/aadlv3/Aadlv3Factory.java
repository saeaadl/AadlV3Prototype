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
	 * Returns a new object of class '<em>Subcomponent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subcomponent</em>'.
	 * @generated
	 */
	Subcomponent createSubcomponent();

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
	 * Returns a new object of class '<em>Named Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Type</em>'.
	 * @generated
	 */
	NamedType createNamedType();

	/**
	 * Returns a new object of class '<em>Type Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Def</em>'.
	 * @generated
	 */
	TypeDef createTypeDef();

	/**
	 * Returns a new object of class '<em>Enumeration Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration Type</em>'.
	 * @generated
	 */
	EnumerationType createEnumerationType();

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
	 * Returns a new object of class '<em>Instance Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance Configuration</em>'.
	 * @generated
	 */
	InstanceConfiguration createInstanceConfiguration();

	/**
	 * Returns a new object of class '<em>Integer Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Literal</em>'.
	 * @generated
	 */
	IntegerLiteral createIntegerLiteral();

	/**
	 * Returns a new object of class '<em>Real Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Real Literal</em>'.
	 * @generated
	 */
	RealLiteral createRealLiteral();

	/**
	 * Returns a new object of class '<em>String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Literal</em>'.
	 * @generated
	 */
	StringLiteral createStringLiteral();

	/**
	 * Returns a new object of class '<em>Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Literal</em>'.
	 * @generated
	 */
	BooleanLiteral createBooleanLiteral();

	/**
	 * Returns a new object of class '<em>Enumeration Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration Literal</em>'.
	 * @generated
	 */
	EnumerationLiteral createEnumerationLiteral();

	/**
	 * Returns a new object of class '<em>List Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Literal</em>'.
	 * @generated
	 */
	ListLiteral createListLiteral();

	/**
	 * Returns a new object of class '<em>Set Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Literal</em>'.
	 * @generated
	 */
	SetLiteral createSetLiteral();

	/**
	 * Returns a new object of class '<em>Directional Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Directional Literal</em>'.
	 * @generated
	 */
	DirectionalLiteral createDirectionalLiteral();

	/**
	 * Returns a new object of class '<em>ECollection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ECollection</em>'.
	 * @generated
	 */
	ECollection createECollection();

	/**
	 * Returns a new object of class '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression</em>'.
	 * @generated
	 */
	Expression createExpression();

	/**
	 * Returns a new object of class '<em>Multi Literal Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Literal Constraint</em>'.
	 * @generated
	 */
	MultiLiteralConstraint createMultiLiteralConstraint();

	/**
	 * Returns a new object of class '<em>Multi Operand Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Operand Expression</em>'.
	 * @generated
	 */
	MultiOperandExpression createMultiOperandExpression();

	/**
	 * Returns a new object of class '<em>Binary Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Operation</em>'.
	 * @generated
	 */
	BinaryOperation createBinaryOperation();

	/**
	 * Returns a new object of class '<em>Property Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Association</em>'.
	 * @generated
	 */
	PropertyAssociation createPropertyAssociation();

	/**
	 * Returns a new object of class '<em>Default Annex Subclause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Annex Subclause</em>'.
	 * @generated
	 */
	DefaultAnnexSubclause createDefaultAnnexSubclause();

	/**
	 * Returns a new object of class '<em>Annex Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annex Library</em>'.
	 * @generated
	 */
	AnnexLibrary createAnnexLibrary();

	/**
	 * Returns a new object of class '<em>Annotation Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Block</em>'.
	 * @generated
	 */
	AnnotationBlock createAnnotationBlock();

	/**
	 * Returns a new object of class '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation</em>'.
	 * @generated
	 */
	Annotation createAnnotation();

	/**
	 * Returns a new object of class '<em>Name Value Pair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Name Value Pair</em>'.
	 * @generated
	 */
	NameValuePair createNameValuePair();

	/**
	 * Returns a new object of class '<em>State Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Transition</em>'.
	 * @generated
	 */
	StateTransition createStateTransition();

	/**
	 * Returns a new object of class '<em>State Synchronization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Synchronization</em>'.
	 * @generated
	 */
	StateSynchronization createStateSynchronization();

	/**
	 * Returns a new object of class '<em>Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavior</em>'.
	 * @generated
	 */
	Behavior createBehavior();

	/**
	 * Returns a new object of class '<em>State Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Variable</em>'.
	 * @generated
	 */
	StateVariable createStateVariable();

	/**
	 * Returns a new object of class '<em>Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generator</em>'.
	 * @generated
	 */
	Generator createGenerator();

	/**
	 * Returns a new object of class '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant</em>'.
	 * @generated
	 */
	Constant createConstant();

	/**
	 * Returns a new object of class '<em>Package Element Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Element Reference</em>'.
	 * @generated
	 */
	PackageElementReference createPackageElementReference();

	/**
	 * Returns a new object of class '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type</em>'.
	 * @generated
	 */
	PrimitiveType createPrimitiveType();

	/**
	 * Returns a new object of class '<em>Composite Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Type</em>'.
	 * @generated
	 */
	CompositeType createCompositeType();

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
	 * Returns a new object of class '<em>Named Element Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Element Reference</em>'.
	 * @generated
	 */
	NamedElementReference createNamedElementReference();

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
