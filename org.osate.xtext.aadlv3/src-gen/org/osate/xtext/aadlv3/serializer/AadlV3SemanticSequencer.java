/**
 * Copyright 2018 Carnegie Mellon University. All Rights Reserved.
 * 
 * NO WARRANTY. THIS CARNEGIE MELLON UNIVERSITY AND SOFTWARE ENGINEERING INSTITUTE
 * MATERIAL IS FURNISHED ON AN AS-IS BASIS. CARNEGIE MELLON UNIVERSITY MAKES NO
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
package org.osate.xtext.aadlv3.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.osate.aadlv3.aadlv3.Aadlv3Package;
import org.osate.aadlv3.aadlv3.Association;
import org.osate.aadlv3.aadlv3.Component;
import org.osate.aadlv3.aadlv3.ComponentConfiguration;
import org.osate.aadlv3.aadlv3.ComponentImplementation;
import org.osate.aadlv3.aadlv3.ComponentInterface;
import org.osate.aadlv3.aadlv3.ConfigurationActual;
import org.osate.aadlv3.aadlv3.ConfigurationAssignment;
import org.osate.aadlv3.aadlv3.ConfigurationAssignmentPattern;
import org.osate.aadlv3.aadlv3.ConfigurationParameter;
import org.osate.aadlv3.aadlv3.DataType;
import org.osate.aadlv3.aadlv3.Feature;
import org.osate.aadlv3.aadlv3.Import;
import org.osate.aadlv3.aadlv3.ModelElementReference;
import org.osate.aadlv3.aadlv3.PackageDeclaration;
import org.osate.aadlv3.aadlv3.PathElement;
import org.osate.aadlv3.aadlv3.PathSequence;
import org.osate.aadlv3.aadlv3.PropertyAssociation;
import org.osate.aadlv3.aadlv3.PropertyDefinition;
import org.osate.aadlv3.aadlv3.PropertySet;
import org.osate.aadlv3.aadlv3.PropertyValue;
import org.osate.aadlv3.aadlv3.TypeReference;
import org.osate.aadlv3.aadlv3.Workingset;
import org.osate.xtext.aadlv3.services.AadlV3GrammarAccess;

@SuppressWarnings("all")
public class AadlV3SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AadlV3GrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == Aadlv3Package.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case Aadlv3Package.ASSOCIATION:
				if (rule == grammarAccess.getBindingRule()) {
					sequence_Binding_PropertiesBlock(context, (Association) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getConnectionRule()) {
					sequence_Connection_PropertiesBlock(context, (Association) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getFeatureDelegateRule()) {
					sequence_FeatureDelegate_PropertiesBlock(context, (Association) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getFlowPathRule()) {
					sequence_FlowPath_PropertiesBlock(context, (Association) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getFlowSinkRule()) {
					sequence_FlowSink_PropertiesBlock(context, (Association) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getFlowSourceRule()) {
					sequence_FlowSource_PropertiesBlock(context, (Association) semanticObject); 
					return; 
				}
				else break;
			case Aadlv3Package.COMPONENT:
				sequence_Component_NestedImplementationElement(context, (Component) semanticObject); 
				return; 
			case Aadlv3Package.COMPONENT_CONFIGURATION:
				sequence_ComponentConfiguration_ConfigurationElement_ConfigurationExtensions_Parameters(context, (ComponentConfiguration) semanticObject); 
				return; 
			case Aadlv3Package.COMPONENT_IMPLEMENTATION:
				sequence_ComponentImplementation_ImplementationElement_ImplementationExtensions(context, (ComponentImplementation) semanticObject); 
				return; 
			case Aadlv3Package.COMPONENT_INTERFACE:
				sequence_ComponentInterface_InterfaceElement_InterfaceExtensions_UseProps(context, (ComponentInterface) semanticObject); 
				return; 
			case Aadlv3Package.CONFIGURATION_ACTUAL:
				sequence_ConfigurationActual(context, (ConfigurationActual) semanticObject); 
				return; 
			case Aadlv3Package.CONFIGURATION_ASSIGNMENT:
				sequence_ConfigurationAssignment_ConfigurationElement(context, (ConfigurationAssignment) semanticObject); 
				return; 
			case Aadlv3Package.CONFIGURATION_ASSIGNMENT_PATTERN:
				sequence_ConfigurationAssignmentPattern_ConfigurationElement(context, (ConfigurationAssignmentPattern) semanticObject); 
				return; 
			case Aadlv3Package.CONFIGURATION_PARAMETER:
				sequence_ConfigurationParameter(context, (ConfigurationParameter) semanticObject); 
				return; 
			case Aadlv3Package.DATA_TYPE:
				sequence_DataType_PropertiesBlock(context, (DataType) semanticObject); 
				return; 
			case Aadlv3Package.FEATURE:
				sequence_Feature_PropertiesBlock(context, (Feature) semanticObject); 
				return; 
			case Aadlv3Package.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case Aadlv3Package.MODEL_ELEMENT_REFERENCE:
				sequence_ModelElementReference(context, (ModelElementReference) semanticObject); 
				return; 
			case Aadlv3Package.PACKAGE_DECLARATION:
				sequence_PackageDeclaration(context, (PackageDeclaration) semanticObject); 
				return; 
			case Aadlv3Package.PATH_ELEMENT:
				sequence_PathElement(context, (PathElement) semanticObject); 
				return; 
			case Aadlv3Package.PATH_SEQUENCE:
				if (rule == grammarAccess.getFlowAssignmentRule()) {
					sequence_FlowAssignment(context, (PathSequence) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPathRule()) {
					sequence_Path_PropertiesBlock(context, (PathSequence) semanticObject); 
					return; 
				}
				else break;
			case Aadlv3Package.PROPERTY_ASSOCIATION:
				sequence_PropertyAssociation(context, (PropertyAssociation) semanticObject); 
				return; 
			case Aadlv3Package.PROPERTY_DEFINITION:
				sequence_AppliesTo_PropertyDefinition(context, (PropertyDefinition) semanticObject); 
				return; 
			case Aadlv3Package.PROPERTY_SET:
				sequence_PropertySet(context, (PropertySet) semanticObject); 
				return; 
			case Aadlv3Package.PROPERTY_VALUE:
				sequence_PropertyValue(context, (PropertyValue) semanticObject); 
				return; 
			case Aadlv3Package.TYPE_REFERENCE:
				if (rule == grammarAccess.getRealizationReferenceRule()) {
					sequence_ConfigurationActuals_RealizationReference(context, (TypeReference) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTypeReferenceRule()) {
					sequence_ConfigurationActuals_TypeReference(context, (TypeReference) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getImplementationReferenceRule()) {
					sequence_ImplementationReference(context, (TypeReference) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getReversableInterfaceReferenceRule()) {
					sequence_ReversableInterfaceReference(context, (TypeReference) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getReversableTypeReferenceRule()) {
					sequence_ReversableTypeReference(context, (TypeReference) semanticObject); 
					return; 
				}
				else break;
			case Aadlv3Package.WORKINGSET:
				sequence_UseProps_Workingset(context, (Workingset) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     PackageElement returns PropertyDefinition
	 *     PropertyDefinition returns PropertyDefinition
	 *
	 * Constraint:
	 *     (
	 *         private?='private'? 
	 *         name=ID 
	 *         type=[Type|QualifiedReference] 
	 *         (componentCategories+=ComponentCategory | featureCategories+=FeatureCategory | associationTypes+=AssociationType)*
	 *     )
	 */
	protected void sequence_AppliesTo_PropertyDefinition(ISerializationContext context, PropertyDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Binding returns Association
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         associationType=BindingType 
	 *         source=ModelElementReference 
	 *         destination=ModelElementReference 
	 *         (propertyAssociations+=PropertyAssociation propertyAssociations+=PropertyAssociation*)?
	 *     )
	 */
	protected void sequence_Binding_PropertiesBlock(ISerializationContext context, Association semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PackageElement returns ComponentConfiguration
	 *     ComponentConfiguration returns ComponentConfiguration
	 *
	 * Constraint:
	 *     (
	 *         private?='private'? 
	 *         name=DottedName 
	 *         (parameterized?='(' (parameters+=ConfigurationParameter parameters+=ConfigurationParameter*)?)? 
	 *         superClassifiers+=RealizationReference 
	 *         superClassifiers+=RealizationReference* 
	 *         (
	 *             propertyAssociations+=PropertyAssociation | 
	 *             bindings+=Binding | 
	 *             configurationAssignments+=ConfigurationAssignment | 
	 *             configurationAssignments+=ConfigurationAssignmentPattern
	 *         )*
	 *     )
	 */
	protected void sequence_ComponentConfiguration_ConfigurationElement_ConfigurationExtensions_Parameters(ISerializationContext context, ComponentConfiguration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PackageElement returns ComponentImplementation
	 *     ComponentImplementation returns ComponentImplementation
	 *
	 * Constraint:
	 *     (
	 *         private?='private'? 
	 *         category=ComponentCategory 
	 *         name=DottedName 
	 *         (superClassifiers+=ImplementationReference superClassifiers+=ImplementationReference*)? 
	 *         (
	 *             connections+=Connection | 
	 *             connections+=FeatureDelegate | 
	 *             bindings+=Binding | 
	 *             components+=Component | 
	 *             paths+=Path | 
	 *             flowAssignments+=FlowAssignment | 
	 *             configurationAssignments+=ConfigurationAssignment | 
	 *             configurationAssignments+=ConfigurationAssignmentPattern | 
	 *             propertyAssociations+=PropertyAssociation
	 *         )*
	 *     )
	 */
	protected void sequence_ComponentImplementation_ImplementationElement_ImplementationExtensions(ISerializationContext context, ComponentImplementation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PackageElement returns ComponentInterface
	 *     ComponentInterface returns ComponentInterface
	 *
	 * Constraint:
	 *     (
	 *         private?='private'? 
	 *         category=ComponentCategory? 
	 *         name=ID 
	 *         (superClassifiers+=ReversableInterfaceReference superClassifiers+=ReversableInterfaceReference*)? 
	 *         (
	 *             (features+=Feature | flows+=FlowPath | flows+=FlowSource | flows+=FlowSink | propertyAssociations+=PropertyAssociation)? 
	 *             (useProperties+=[PropertySet|QualifiedName] useProperties+=[PropertySet|QualifiedName]*)?
	 *         )+
	 *     )
	 */
	protected void sequence_ComponentInterface_InterfaceElement_InterfaceExtensions_UseProps(ISerializationContext context, ComponentInterface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Component returns Component
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         category=ComponentCategory 
	 *         typeReferences+=TypeReference? 
	 *         (
	 *             features+=Feature | 
	 *             connections+=Connection | 
	 *             connections+=FeatureDelegate | 
	 *             bindings+=Binding | 
	 *             components+=Component | 
	 *             propertyAssociations+=PropertyAssociation
	 *         )*
	 *     )
	 */
	protected void sequence_Component_NestedImplementationElement(ISerializationContext context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConfigurationActual returns ConfigurationActual
	 *
	 * Constraint:
	 *     (parameter=[ConfigurationParameter|ID] assignedClassifiers+=TypeReference assignedClassifiers+=TypeReference*)
	 */
	protected void sequence_ConfigurationActual(ISerializationContext context, ConfigurationActual semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RealizationReference returns TypeReference
	 *
	 * Constraint:
	 *     (type=[ComponentRealization|QualifiedDottedReference] (actuals+=ConfigurationActual actuals+=ConfigurationActual*)?)
	 */
	protected void sequence_ConfigurationActuals_RealizationReference(ISerializationContext context, TypeReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TypeReference returns TypeReference
	 *
	 * Constraint:
	 *     (type=[Type|QualifiedTypesReference] (actuals+=ConfigurationActual actuals+=ConfigurationActual*)?)
	 */
	protected void sequence_ConfigurationActuals_TypeReference(ISerializationContext context, TypeReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConfigurationAssignmentPattern returns ConfigurationAssignmentPattern
	 *
	 * Constraint:
	 *     (
	 *         targetPattern=[Type|QualifiedTypesReference] 
	 *         (
	 *             (assignedClassifiers+=TypeReference assignedClassifiers+=TypeReference*) | 
	 *             (
	 *                 (assignedClassifiers+=TypeReference assignedClassifiers+=TypeReference*) 
	 *                 (
	 *                     propertyAssociations+=PropertyAssociation | 
	 *                     bindings+=Binding | 
	 *                     configurationAssignments+=ConfigurationAssignment | 
	 *                     configurationAssignments+=ConfigurationAssignmentPattern
	 *                 )+
	 *             )
	 *         )?
	 *     )
	 */
	protected void sequence_ConfigurationAssignmentPattern_ConfigurationElement(ISerializationContext context, ConfigurationAssignmentPattern semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConfigurationAssignment returns ConfigurationAssignment
	 *
	 * Constraint:
	 *     (
	 *         target=ModelElementReference 
	 *         (
	 *             (assignedClassifiers+=TypeReference assignedClassifiers+=TypeReference*) | 
	 *             (
	 *                 (assignedClassifiers+=TypeReference assignedClassifiers+=TypeReference*) 
	 *                 (
	 *                     propertyAssociations+=PropertyAssociation | 
	 *                     bindings+=Binding | 
	 *                     configurationAssignments+=ConfigurationAssignment | 
	 *                     configurationAssignments+=ConfigurationAssignmentPattern
	 *                 )+
	 *             )
	 *         )?
	 *     )
	 */
	protected void sequence_ConfigurationAssignment_ConfigurationElement(ISerializationContext context, ConfigurationAssignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConfigurationParameter returns ConfigurationParameter
	 *
	 * Constraint:
	 *     (name=ID type=[Type|QualifiedName])
	 */
	protected void sequence_ConfigurationParameter(ISerializationContext context, ConfigurationParameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.CONFIGURATION_PARAMETER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.CONFIGURATION_PARAMETER__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConfigurationParameterAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getConfigurationParameterAccess().getTypeTypeQualifiedNameParserRuleCall_2_0_1(), semanticObject.eGet(Aadlv3Package.Literals.CONFIGURATION_PARAMETER__TYPE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Connection returns Association
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         associationType=ConnectionType 
	 *         source=ModelElementReference 
	 *         directional?='->'? 
	 *         destination=ModelElementReference 
	 *         (propertyAssociations+=PropertyAssociation propertyAssociations+=PropertyAssociation*)?
	 *     )
	 */
	protected void sequence_Connection_PropertiesBlock(ISerializationContext context, Association semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PackageElement returns DataType
	 *     DataType returns DataType
	 *
	 * Constraint:
	 *     (private?='private'? name=ID (propertyAssociations+=PropertyAssociation propertyAssociations+=PropertyAssociation*)?)
	 */
	protected void sequence_DataType_PropertiesBlock(ISerializationContext context, DataType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FeatureDelegate returns Association
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         associationType=DelegateType 
	 *         source=ModelElementReference 
	 *         directional?='->'? 
	 *         destination=ModelElementReference 
	 *         (propertyAssociations+=PropertyAssociation propertyAssociations+=PropertyAssociation*)?
	 *     )
	 */
	protected void sequence_FeatureDelegate_PropertiesBlock(ISerializationContext context, Association semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Feature returns Feature
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         direction=FeatureDirection? 
	 *         category=FeatureCategory 
	 *         typeReference=ReversableTypeReference? 
	 *         (propertyAssociations+=PropertyAssociation propertyAssociations+=PropertyAssociation*)?
	 *     )
	 */
	protected void sequence_Feature_PropertiesBlock(ISerializationContext context, Feature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FlowAssignment returns PathSequence
	 *
	 * Constraint:
	 *     (target=ModelElementReference elements+=PathElement elements+=PathElement*)
	 */
	protected void sequence_FlowAssignment(ISerializationContext context, PathSequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FlowPath returns Association
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         associationType=FlowPathType 
	 *         source=ModelElementReference 
	 *         destination=ModelElementReference 
	 *         (propertyAssociations+=PropertyAssociation propertyAssociations+=PropertyAssociation*)?
	 *     )
	 */
	protected void sequence_FlowPath_PropertiesBlock(ISerializationContext context, Association semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FlowSink returns Association
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         associationType=FlowSinkType 
	 *         source=ModelElementReference 
	 *         (propertyAssociations+=PropertyAssociation propertyAssociations+=PropertyAssociation*)?
	 *     )
	 */
	protected void sequence_FlowSink_PropertiesBlock(ISerializationContext context, Association semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FlowSource returns Association
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         associationType=FlowSourceType 
	 *         destination=ModelElementReference 
	 *         (propertyAssociations+=PropertyAssociation propertyAssociations+=PropertyAssociation*)?
	 *     )
	 */
	protected void sequence_FlowSource_PropertiesBlock(ISerializationContext context, Association semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ImplementationReference returns TypeReference
	 *
	 * Constraint:
	 *     type=[ComponentImplementation|QualifiedDottedReference]
	 */
	protected void sequence_ImplementationReference(ISerializationContext context, TypeReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.TYPE_REFERENCE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.TYPE_REFERENCE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImplementationReferenceAccess().getTypeComponentImplementationQualifiedDottedReferenceParserRuleCall_0_1(), semanticObject.eGet(Aadlv3Package.Literals.TYPE_REFERENCE__TYPE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Import returns Import
	 *
	 * Constraint:
	 *     ((importedNamespace=QualifiedNameWithWildcard | importedNamespace=QualifiedName) alias=ID?)
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ModelElementReference returns ModelElementReference
	 *     ModelElementReference.ModelElementReference_1_0_0 returns ModelElementReference
	 *
	 * Constraint:
	 *     (element=[ModelElement|ID] | (context=ModelElementReference_ModelElementReference_1_0_0 element=[ModelElement|ID]))
	 */
	protected void sequence_ModelElementReference(ISerializationContext context, ModelElementReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PackageDeclaration returns PackageDeclaration
	 *     PackageElement returns PackageDeclaration
	 *
	 * Constraint:
	 *     (private?='private'? name=QualifiedName (imports+=Import | elements+=PackageElement)*)
	 */
	protected void sequence_PackageDeclaration(ISerializationContext context, PackageDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PathElement returns PathElement
	 *     PathElement.PathElement_1_0_0 returns PathElement
	 *
	 * Constraint:
	 *     (element=[ModelElement|ID] | (context=PathElement_PathElement_1_0_0 element=[ModelElement|ID]))
	 */
	protected void sequence_PathElement(ISerializationContext context, PathElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Path returns PathSequence
	 *
	 * Constraint:
	 *     (name=ID elements+=PathElement elements+=PathElement+ (propertyAssociations+=PropertyAssociation propertyAssociations+=PropertyAssociation*)?)
	 */
	protected void sequence_Path_PropertiesBlock(ISerializationContext context, PathSequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PropertyAssociation returns PropertyAssociation
	 *
	 * Constraint:
	 *     (target=ModelElementReference? property=[PropertyDefinition|QualifiedName] propertyAssociationType=PropertyAssociationType? value=PropertyValue)
	 */
	protected void sequence_PropertyAssociation(ISerializationContext context, PropertyAssociation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PackageElement returns PropertySet
	 *     PropertySet returns PropertySet
	 *
	 * Constraint:
	 *     (private?='private'? name=ID properties+=[PropertyDefinition|QualifiedReference] properties+=[PropertyDefinition|QualifiedName]*)
	 */
	protected void sequence_PropertySet(ISerializationContext context, PropertySet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PropertyValue returns PropertyValue
	 *
	 * Constraint:
	 *     (value=INT unit=ID?)
	 */
	protected void sequence_PropertyValue(ISerializationContext context, PropertyValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ReversableInterfaceReference returns TypeReference
	 *
	 * Constraint:
	 *     (reverse?='reverse'? type=[ComponentInterface|QualifiedReference])
	 */
	protected void sequence_ReversableInterfaceReference(ISerializationContext context, TypeReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ReversableTypeReference returns TypeReference
	 *
	 * Constraint:
	 *     (reverse?='reverse'? type=[Type|QualifiedReference])
	 */
	protected void sequence_ReversableTypeReference(ISerializationContext context, TypeReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PackageElement returns Workingset
	 *     Workingset returns Workingset
	 *
	 * Constraint:
	 *     (
	 *         private?='private'? 
	 *         name=QualifiedName 
	 *         (useProperties+=[PropertySet|QualifiedName] useProperties+=[PropertySet|QualifiedName]*)? 
	 *         rootComponents+=Component 
	 *         rootComponents+=Component*
	 *     )
	 */
	protected void sequence_UseProps_Workingset(ISerializationContext context, Workingset semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
