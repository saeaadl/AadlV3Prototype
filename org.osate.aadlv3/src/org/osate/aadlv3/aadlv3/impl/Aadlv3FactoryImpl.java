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
		case Aadlv3Package.PROPERTY:
			return createProperty();
		case Aadlv3Package.PROPERTY_SET:
			return createPropertySet();
		case Aadlv3Package.DATA_TYPE:
			return createDataType();
		case Aadlv3Package.COMPONENT_INTERFACE:
			return createComponentInterface();
		case Aadlv3Package.COMPONENT_IMPLEMENTATION:
			return createComponentImplementation();
		case Aadlv3Package.COMPONENT_CONFIGURATION:
			return createComponentConfiguration();
		case Aadlv3Package.FEATURE:
			return createFeature();
		case Aadlv3Package.COMPONENT:
			return createComponent();
		case Aadlv3Package.IMPORT:
			return createImport();
		case Aadlv3Package.ASSOCIATION:
			return createAssociation();
		case Aadlv3Package.PATH_SEQUENCE:
			return createPathSequence();
		case Aadlv3Package.PATH_ELEMENT:
			return createPathElement();
		case Aadlv3Package.CONFIGURATION_ASSIGNMENT:
			return createConfigurationAssignment();
		case Aadlv3Package.CONFIGURATION_ASSIGNMENT_PATTERN:
			return createConfigurationAssignmentPattern();
		case Aadlv3Package.MODEL_ELEMENT_REFERENCE:
			return createModelElementReference();
		case Aadlv3Package.CONFIGURATION_PARAMETER:
			return createConfigurationParameter();
		case Aadlv3Package.TYPE_REFERENCE:
			return createTypeReference();
		case Aadlv3Package.CONFIGURATION_ACTUAL:
			return createConfigurationActual();
		case Aadlv3Package.WORKINGSET:
			return createWorkingset();
		case Aadlv3Package.PROPERTY_VALUE:
			return createPropertyValue();
		case Aadlv3Package.PROPERTY_ASSOCIATION:
			return createPropertyAssociation();
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
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
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
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
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
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
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
	public ConfigurationAssignment createConfigurationAssignment() {
		ConfigurationAssignmentImpl configurationAssignment = new ConfigurationAssignmentImpl();
		return configurationAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigurationAssignmentPattern createConfigurationAssignmentPattern() {
		ConfigurationAssignmentPatternImpl configurationAssignmentPattern = new ConfigurationAssignmentPatternImpl();
		return configurationAssignmentPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelElementReference createModelElementReference() {
		ModelElementReferenceImpl modelElementReference = new ModelElementReferenceImpl();
		return modelElementReference;
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
	public PropertyValue createPropertyValue() {
		PropertyValueImpl propertyValue = new PropertyValueImpl();
		return propertyValue;
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
