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
package org.osate.aadlv3.aadlv3.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.osate.aadlv3.aadlv3.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Aadlv3FactoryImpl extends EFactoryImpl implements Aadlv3Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Aadlv3Factory init() {
		try {
			Aadlv3Factory theAadlv3Factory = (Aadlv3Factory) EPackage.Registry.INSTANCE
					.getEFactory(Aadlv3Package.eNS_URI);
			if (theAadlv3Factory != null) {
				return theAadlv3Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Aadlv3FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aadlv3FactoryImpl() {
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
		case Aadlv3Package.PACKAGE_DECLARATION:
			return createPackageDeclaration();
		case Aadlv3Package.PROPERTY_DEFINITION:
			return createPropertyDefinition();
		case Aadlv3Package.PROPERTY_SET:
			return createPropertySet();
		case Aadlv3Package.COMPONENT_INTERFACE:
			return createComponentInterface();
		case Aadlv3Package.COMPONENT_IMPLEMENTATION:
			return createComponentImplementation();
		case Aadlv3Package.COMPONENT_CONFIGURATION:
			return createComponentConfiguration();
		case Aadlv3Package.FEATURE:
			return createFeature();
		case Aadlv3Package.SUBCOMPONENT:
			return createSubcomponent();
		case Aadlv3Package.IMPORT:
			return createImport();
		case Aadlv3Package.ASSOCIATION:
			return createAssociation();
		case Aadlv3Package.PATH_SEQUENCE:
			return createPathSequence();
		case Aadlv3Package.PATH_ELEMENT:
			return createPathElement();
		case Aadlv3Package.CLASSIFIER_ASSIGNMENT:
			return createClassifierAssignment();
		case Aadlv3Package.CLASSIFIER_ASSIGNMENT_PATTERN:
			return createClassifierAssignmentPattern();
		case Aadlv3Package.NAMED_ELEMENT_REFERENCE:
			return createNamedElementReference();
		case Aadlv3Package.CONFIGURATION_PARAMETER:
			return createConfigurationParameter();
		case Aadlv3Package.CONFIGURATION_ACTUAL:
			return createConfigurationActual();
		case Aadlv3Package.WORKINGSET:
			return createWorkingset();
		case Aadlv3Package.INSTANCE_CONFIGURATION:
			return createInstanceConfiguration();
		case Aadlv3Package.NAMED_TYPE:
			return createNamedType();
		case Aadlv3Package.TYPE_DEF:
			return createTypeDef();
		case Aadlv3Package.ENUMERATION_TYPE:
			return createEnumerationType();
		case Aadlv3Package.PRIMITIVE_TYPE:
			return createPrimitiveType();
		case Aadlv3Package.COMPOSITE_TYPE:
			return createCompositeType();
		case Aadlv3Package.TYPE_REFERENCE:
			return createTypeReference();
		case Aadlv3Package.INTEGER_LITERAL:
			return createIntegerLiteral();
		case Aadlv3Package.REAL_LITERAL:
			return createRealLiteral();
		case Aadlv3Package.STRING_LITERAL:
			return createStringLiteral();
		case Aadlv3Package.BOOLEAN_LITERAL:
			return createBooleanLiteral();
		case Aadlv3Package.ENUMERATION_LITERAL:
			return createEnumerationLiteral();
		case Aadlv3Package.DIRECTIONAL_LITERAL:
			return createDirectionalLiteral();
		case Aadlv3Package.ECOLLECTION:
			return createECollection();
		case Aadlv3Package.LIST_LITERAL:
			return createListLiteral();
		case Aadlv3Package.SET_LITERAL:
			return createSetLiteral();
		case Aadlv3Package.EXPRESSION:
			return createExpression();
		case Aadlv3Package.MULTI_LITERAL_CONSTRAINT:
			return createMultiLiteralConstraint();
		case Aadlv3Package.MULTI_OPERAND_EXPRESSION:
			return createMultiOperandExpression();
		case Aadlv3Package.ASSIGNMENT:
			return createAssignment();
		case Aadlv3Package.ACTION:
			return createAction();
		case Aadlv3Package.CONDITION_OPERATION:
			return createConditionOperation();
		case Aadlv3Package.PROPERTY_ASSOCIATION:
			return createPropertyAssociation();
		case Aadlv3Package.DEFAULT_ANNEX_SUBCLAUSE:
			return createDefaultAnnexSubclause();
		case Aadlv3Package.ANNEX_LIBRARY:
			return createAnnexLibrary();
		case Aadlv3Package.EM_SUBCLAUSE:
			return createEMSubclause();
		case Aadlv3Package.BA_SUBCLAUSE:
			return createBASubclause();
		case Aadlv3Package.BEHAVIOR_SPECIFICATION:
			return createBehaviorSpecification();
		case Aadlv3Package.BEHAVIOR_RULE:
			return createBehaviorRule();
		case Aadlv3Package.STATE_SPECIFICATION:
			return createStateSpecification();
		case Aadlv3Package.GENERATOR:
			return createGenerator();
		case Aadlv3Package.CONSTANT:
			return createConstant();
		case Aadlv3Package.PACKAGE_ELEMENT_REFERENCE:
			return createPackageElementReference();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case Aadlv3Package.COMPONENT_CATEGORY:
			return createComponentCategoryFromString(eDataType, initialValue);
		case Aadlv3Package.FEATURE_CATEGORY:
			return createFeatureCategoryFromString(eDataType, initialValue);
		case Aadlv3Package.FEATURE_DIRECTION:
			return createFeatureDirectionFromString(eDataType, initialValue);
		case Aadlv3Package.ASSOCIATION_TYPE:
			return createAssociationTypeFromString(eDataType, initialValue);
		case Aadlv3Package.PRIMITIVE:
			return createPrimitiveFromString(eDataType, initialValue);
		case Aadlv3Package.COMPOSITE:
			return createCompositeFromString(eDataType, initialValue);
		case Aadlv3Package.EOPERATOR:
			return createEOperatorFromString(eDataType, initialValue);
		case Aadlv3Package.COPERATOR:
			return createCOperatorFromString(eDataType, initialValue);
		case Aadlv3Package.PROPERTY_ASSOCIATION_TYPE:
			return createPropertyAssociationTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case Aadlv3Package.COMPONENT_CATEGORY:
			return convertComponentCategoryToString(eDataType, instanceValue);
		case Aadlv3Package.FEATURE_CATEGORY:
			return convertFeatureCategoryToString(eDataType, instanceValue);
		case Aadlv3Package.FEATURE_DIRECTION:
			return convertFeatureDirectionToString(eDataType, instanceValue);
		case Aadlv3Package.ASSOCIATION_TYPE:
			return convertAssociationTypeToString(eDataType, instanceValue);
		case Aadlv3Package.PRIMITIVE:
			return convertPrimitiveToString(eDataType, instanceValue);
		case Aadlv3Package.COMPOSITE:
			return convertCompositeToString(eDataType, instanceValue);
		case Aadlv3Package.EOPERATOR:
			return convertEOperatorToString(eDataType, instanceValue);
		case Aadlv3Package.COPERATOR:
			return convertCOperatorToString(eDataType, instanceValue);
		case Aadlv3Package.PROPERTY_ASSOCIATION_TYPE:
			return convertPropertyAssociationTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PackageDeclaration createPackageDeclaration() {
		PackageDeclarationImpl packageDeclaration = new PackageDeclarationImpl();
		return packageDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyDefinition createPropertyDefinition() {
		PropertyDefinitionImpl propertyDefinition = new PropertyDefinitionImpl();
		return propertyDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertySet createPropertySet() {
		PropertySetImpl propertySet = new PropertySetImpl();
		return propertySet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentInterface createComponentInterface() {
		ComponentInterfaceImpl componentInterface = new ComponentInterfaceImpl();
		return componentInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentImplementation createComponentImplementation() {
		ComponentImplementationImpl componentImplementation = new ComponentImplementationImpl();
		return componentImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentConfiguration createComponentConfiguration() {
		ComponentConfigurationImpl componentConfiguration = new ComponentConfigurationImpl();
		return componentConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subcomponent createSubcomponent() {
		SubcomponentImpl subcomponent = new SubcomponentImpl();
		return subcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigurationParameter createConfigurationParameter() {
		ConfigurationParameterImpl configurationParameter = new ConfigurationParameterImpl();
		return configurationParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeReference createTypeReference() {
		TypeReferenceImpl typeReference = new TypeReferenceImpl();
		return typeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedType createNamedType() {
		NamedTypeImpl namedType = new NamedTypeImpl();
		return namedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeDef createTypeDef() {
		TypeDefImpl typeDef = new TypeDefImpl();
		return typeDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumerationType createEnumerationType() {
		EnumerationTypeImpl enumerationType = new EnumerationTypeImpl();
		return enumerationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigurationActual createConfigurationActual() {
		ConfigurationActualImpl configurationActual = new ConfigurationActualImpl();
		return configurationActual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Workingset createWorkingset() {
		WorkingsetImpl workingset = new WorkingsetImpl();
		return workingset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstanceConfiguration createInstanceConfiguration() {
		InstanceConfigurationImpl instanceConfiguration = new InstanceConfigurationImpl();
		return instanceConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerLiteral createIntegerLiteral() {
		IntegerLiteralImpl integerLiteral = new IntegerLiteralImpl();
		return integerLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RealLiteral createRealLiteral() {
		RealLiteralImpl realLiteral = new RealLiteralImpl();
		return realLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringLiteral createStringLiteral() {
		StringLiteralImpl stringLiteral = new StringLiteralImpl();
		return stringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanLiteral createBooleanLiteral() {
		BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
		return booleanLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumerationLiteral createEnumerationLiteral() {
		EnumerationLiteralImpl enumerationLiteral = new EnumerationLiteralImpl();
		return enumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListLiteral createListLiteral() {
		ListLiteralImpl listLiteral = new ListLiteralImpl();
		return listLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetLiteral createSetLiteral() {
		SetLiteralImpl setLiteral = new SetLiteralImpl();
		return setLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectionalLiteral createDirectionalLiteral() {
		DirectionalLiteralImpl directionalLiteral = new DirectionalLiteralImpl();
		return directionalLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ECollection createECollection() {
		ECollectionImpl eCollection = new ECollectionImpl();
		return eCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiLiteralConstraint createMultiLiteralConstraint() {
		MultiLiteralConstraintImpl multiLiteralConstraint = new MultiLiteralConstraintImpl();
		return multiLiteralConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiOperandExpression createMultiOperandExpression() {
		MultiOperandExpressionImpl multiOperandExpression = new MultiOperandExpressionImpl();
		return multiOperandExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Assignment createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionOperation createConditionOperation() {
		ConditionOperationImpl conditionOperation = new ConditionOperationImpl();
		return conditionOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyAssociation createPropertyAssociation() {
		PropertyAssociationImpl propertyAssociation = new PropertyAssociationImpl();
		return propertyAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefaultAnnexSubclause createDefaultAnnexSubclause() {
		DefaultAnnexSubclauseImpl defaultAnnexSubclause = new DefaultAnnexSubclauseImpl();
		return defaultAnnexSubclause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnexLibrary createAnnexLibrary() {
		AnnexLibraryImpl annexLibrary = new AnnexLibraryImpl();
		return annexLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BehaviorRule createBehaviorRule() {
		BehaviorRuleImpl behaviorRule = new BehaviorRuleImpl();
		return behaviorRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMSubclause createEMSubclause() {
		EMSubclauseImpl emSubclause = new EMSubclauseImpl();
		return emSubclause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BASubclause createBASubclause() {
		BASubclauseImpl baSubclause = new BASubclauseImpl();
		return baSubclause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BehaviorSpecification createBehaviorSpecification() {
		BehaviorSpecificationImpl behaviorSpecification = new BehaviorSpecificationImpl();
		return behaviorSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateSpecification createStateSpecification() {
		StateSpecificationImpl stateSpecification = new StateSpecificationImpl();
		return stateSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Generator createGenerator() {
		GeneratorImpl generator = new GeneratorImpl();
		return generator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Constant createConstant() {
		ConstantImpl constant = new ConstantImpl();
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PackageElementReference createPackageElementReference() {
		PackageElementReferenceImpl packageElementReference = new PackageElementReferenceImpl();
		return packageElementReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeType createCompositeType() {
		CompositeTypeImpl compositeType = new CompositeTypeImpl();
		return compositeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PathElement createPathElement() {
		PathElementImpl pathElement = new PathElementImpl();
		return pathElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassifierAssignment createClassifierAssignment() {
		ClassifierAssignmentImpl classifierAssignment = new ClassifierAssignmentImpl();
		return classifierAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassifierAssignmentPattern createClassifierAssignmentPattern() {
		ClassifierAssignmentPatternImpl classifierAssignmentPattern = new ClassifierAssignmentPatternImpl();
		return classifierAssignmentPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedElementReference createNamedElementReference() {
		NamedElementReferenceImpl namedElementReference = new NamedElementReferenceImpl();
		return namedElementReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PathSequence createPathSequence() {
		PathSequenceImpl pathSequence = new PathSequenceImpl();
		return pathSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentCategory createComponentCategoryFromString(EDataType eDataType, String initialValue) {
		ComponentCategory result = ComponentCategory.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComponentCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureCategory createFeatureCategoryFromString(EDataType eDataType, String initialValue) {
		FeatureCategory result = FeatureCategory.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFeatureCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureDirection createFeatureDirectionFromString(EDataType eDataType, String initialValue) {
		FeatureDirection result = FeatureDirection.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFeatureDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationType createAssociationTypeFromString(EDataType eDataType, String initialValue) {
		AssociationType result = AssociationType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssociationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Primitive createPrimitiveFromString(EDataType eDataType, String initialValue) {
		Primitive result = Primitive.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composite createCompositeFromString(EDataType eDataType, String initialValue) {
		Composite result = Composite.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompositeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperator createEOperatorFromString(EDataType eDataType, String initialValue) {
		EOperator result = EOperator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COperator createCOperatorFromString(EDataType eDataType, String initialValue) {
		COperator result = COperator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyAssociationType createPropertyAssociationTypeFromString(EDataType eDataType, String initialValue) {
		PropertyAssociationType result = PropertyAssociationType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyAssociationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aadlv3Package getAadlv3Package() {
		return (Aadlv3Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Aadlv3Package getPackage() {
		return Aadlv3Package.eINSTANCE;
	}

} //Aadlv3FactoryImpl
