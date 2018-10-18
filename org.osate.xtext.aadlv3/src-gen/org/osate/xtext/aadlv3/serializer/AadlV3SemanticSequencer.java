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
import org.osate.aadlv3.aadlv3.ConfigurationParameter;
import org.osate.aadlv3.aadlv3.Feature;
import org.osate.aadlv3.aadlv3.Import;
import org.osate.aadlv3.aadlv3.ModelElementReference;
import org.osate.aadlv3.aadlv3.PackageDeclaration;
import org.osate.aadlv3.aadlv3.PathElement;
import org.osate.aadlv3.aadlv3.PathSequence;
import org.osate.aadlv3.aadlv3.PrimitiveType;
import org.osate.aadlv3.aadlv3.Property;
import org.osate.aadlv3.aadlv3.PropertyAssociation;
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
				if (rule == grammarAccess.getConnectionRule()) {
					sequence_Connection_PropertiesBlock(context, (Association) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getFeatureMappingRule()) {
					sequence_FeatureMapping_PropertiesBlock(context, (Association) semanticObject); 
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
				sequence_Component_NestedComponentImplementationBlock(context, (Component) semanticObject); 
				return; 
			case Aadlv3Package.COMPONENT_CONFIGURATION:
				sequence_ClassifierExtensions_ComponentConfiguration_ConfigurationElementBlock_Parameters(context, (ComponentConfiguration) semanticObject); 
				return; 
			case Aadlv3Package.COMPONENT_IMPLEMENTATION:
				sequence_ClassifierExtensions_ComponentImplementation_ImplementationBody(context, (ComponentImplementation) semanticObject); 
				return; 
			case Aadlv3Package.COMPONENT_INTERFACE:
				sequence_ComponentInterface_InterfaceBody_InterfaceExtensions(context, (ComponentInterface) semanticObject); 
				return; 
			case Aadlv3Package.CONFIGURATION_ACTUAL:
				sequence_ConfigurationActual(context, (ConfigurationActual) semanticObject); 
				return; 
			case Aadlv3Package.CONFIGURATION_ASSIGNMENT:
				sequence_ConfigurationAssignment_CurlyConfigurationElementBlock(context, (ConfigurationAssignment) semanticObject); 
				return; 
			case Aadlv3Package.CONFIGURATION_PARAMETER:
				sequence_ConfigurationParameter(context, (ConfigurationParameter) semanticObject); 
				return; 
			case Aadlv3Package.FEATURE:
				sequence_Feature_PropertiesBlock(context, (Feature) semanticObject); 
				return; 
			case Aadlv3Package.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case Aadlv3Package.MODEL_ELEMENT_REFERENCE:
				if (rule == grammarAccess.getModelElementReferenceRule()
						|| action == grammarAccess.getModelElementReferenceAccess().getModelElementReferenceContextAction_1_0_0()) {
					sequence_ModelElementReference(context, (ModelElementReference) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPropertyReferenceRule()) {
					sequence_PropertyReference(context, (ModelElementReference) semanticObject); 
					return; 
				}
				else if (action == grammarAccess.getPropertyReferenceAccess().getModelElementReferenceContextAction_0_1_0_0()) {
					sequence_PropertyReference_ModelElementReference_0_1_0_0(context, (ModelElementReference) semanticObject); 
					return; 
				}
				else break;
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
			case Aadlv3Package.PRIMITIVE_TYPE:
				sequence_PrimitiveType_PropertiesBlock(context, (PrimitiveType) semanticObject); 
				return; 
			case Aadlv3Package.PROPERTY:
				sequence_Property(context, (Property) semanticObject); 
				return; 
			case Aadlv3Package.PROPERTY_ASSOCIATION:
				sequence_PropertyAssociation(context, (PropertyAssociation) semanticObject); 
				return; 
			case Aadlv3Package.PROPERTY_SET:
				sequence_PropertySet(context, (PropertySet) semanticObject); 
				return; 
			case Aadlv3Package.PROPERTY_VALUE:
				sequence_PropertyValue(context, (PropertyValue) semanticObject); 
				return; 
			case Aadlv3Package.TYPE_REFERENCE:
				if (rule == grammarAccess.getReversableTypeReferenceRule()) {
					sequence_ConfigurationActuals_ReversableTypeReference(context, (TypeReference) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTypeReferenceRule()) {
					sequence_ConfigurationActuals_TypeReference(context, (TypeReference) semanticObject); 
					return; 
				}
				else break;
			case Aadlv3Package.WORKINGSET:
				sequence_Workingset(context, (Workingset) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ComponentConfiguration returns ComponentConfiguration
	 *
	 * Constraint:
	 *     (
	 *         name=QualifiedName 
	 *         (parameterized?='(' (parameters+=ConfigurationParameter parameters+=ConfigurationParameter*)?)? 
	 *         superClassifiers+=TypeReference 
	 *         superClassifiers+=TypeReference* 
	 *         (propertyAssociations+=PropertyAssociation | assignments+=ConfigurationAssignment)*
	 *     )
	 */
	protected void sequence_ClassifierExtensions_ComponentConfiguration_ConfigurationElementBlock_Parameters(ISerializationContext context, ComponentConfiguration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ComponentImplementation returns ComponentImplementation
	 *
	 * Constraint:
	 *     (
	 *         category=ComponentCategory 
	 *         name=QualifiedName 
	 *         (superClassifiers+=TypeReference superClassifiers+=TypeReference*)? 
	 *         (
	 *             connections+=Connection | 
	 *             connections+=FeatureMapping | 
	 *             components+=Component | 
	 *             paths+=Path | 
	 *             flowAssignments+=FlowAssignment | 
	 *             assignments+=ConfigurationAssignment | 
	 *             propertyAssociations+=PropertyAssociation
	 *         )*
	 *     )
	 */
	protected void sequence_ClassifierExtensions_ComponentImplementation_ImplementationBody(ISerializationContext context, ComponentImplementation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ComponentInterface returns ComponentInterface
	 *
	 * Constraint:
	 *     (
	 *         category=ComponentCategory? 
	 *         name=ID 
	 *         (superClassifiers+=ReversableTypeReference superClassifiers+=ReversableTypeReference*)? 
	 *         (features+=Feature | flows+=FlowPath | flows+=FlowSource | flows+=FlowSink | propertyAssociations+=PropertyAssociation)* 
	 *         (useProperties+=[PropertySet|QualifiedName] useProperties+=[PropertySet|QualifiedName]*)?
	 *     )
	 */
	protected void sequence_ComponentInterface_InterfaceBody_InterfaceExtensions(ISerializationContext context, ComponentInterface semanticObject) {
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
	 *         typeReference=TypeReference? 
	 *         (features+=Feature | connections+=Connection | connections+=FeatureMapping | components+=Component | propertyAssociations+=PropertyAssociation)*
	 *     )
	 */
	protected void sequence_Component_NestedComponentImplementationBlock(ISerializationContext context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConfigurationActual returns ConfigurationActual
	 *
	 * Constraint:
	 *     (parameter=[ConfigurationParameter|ID] value=TypeReference)
	 */
	protected void sequence_ConfigurationActual(ISerializationContext context, ConfigurationActual semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.CONFIGURATION_ACTUAL__PARAMETER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.CONFIGURATION_ACTUAL__PARAMETER));
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.CONFIGURATION_ACTUAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.CONFIGURATION_ACTUAL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConfigurationActualAccess().getParameterConfigurationParameterIDTerminalRuleCall_0_0_1(), semanticObject.eGet(Aadlv3Package.Literals.CONFIGURATION_ACTUAL__PARAMETER, false));
		feeder.accept(grammarAccess.getConfigurationActualAccess().getValueTypeReferenceParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ReversableTypeReference returns TypeReference
	 *
	 * Constraint:
	 *     (reverse?='reverse'? type=[Type|QualifiedName] (actuals+=ConfigurationActual actuals+=ConfigurationActual*)?)
	 */
	protected void sequence_ConfigurationActuals_ReversableTypeReference(ISerializationContext context, TypeReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TypeReference returns TypeReference
	 *
	 * Constraint:
	 *     (type=[Type|QualifiedName] (actuals+=ConfigurationActual actuals+=ConfigurationActual*)?)
	 */
	protected void sequence_ConfigurationActuals_TypeReference(ISerializationContext context, TypeReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConfigurationAssignment returns ConfigurationAssignment
	 *
	 * Constraint:
	 *     (target=ModelElementReference value=TypeReference? (propertyAssociations+=PropertyAssociation | assignments+=ConfigurationAssignment)*)
	 */
	protected void sequence_ConfigurationAssignment_CurlyConfigurationElementBlock(ISerializationContext context, ConfigurationAssignment semanticObject) {
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
	 *     (name=ID associationType=ConnectionType source=ModelElementReference destination=ModelElementReference propertyAssociations+=PropertyAssociation*)
	 */
	protected void sequence_Connection_PropertiesBlock(ISerializationContext context, Association semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FeatureMapping returns Association
	 *
	 * Constraint:
	 *     (name=ID associationType=MappingType source=ModelElementReference destination=ModelElementReference propertyAssociations+=PropertyAssociation*)
	 */
	protected void sequence_FeatureMapping_PropertiesBlock(ISerializationContext context, Association semanticObject) {
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
	 *         sampled?='sampled'? 
	 *         category=FeatureCategory 
	 *         reverse?='reverse'? 
	 *         type=[Type|QualifiedName]? 
	 *         propertyAssociations+=PropertyAssociation*
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
	 *     (name=ID associationType=FlowPathType source=ModelElementReference destination=ModelElementReference propertyAssociations+=PropertyAssociation*)
	 */
	protected void sequence_FlowPath_PropertiesBlock(ISerializationContext context, Association semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FlowSink returns Association
	 *
	 * Constraint:
	 *     (name=ID associationType=FlowSinkType source=ModelElementReference propertyAssociations+=PropertyAssociation*)
	 */
	protected void sequence_FlowSink_PropertiesBlock(ISerializationContext context, Association semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FlowSource returns Association
	 *
	 * Constraint:
	 *     (name=ID associationType=FlowSourceType destination=ModelElementReference propertyAssociations+=PropertyAssociation*)
	 */
	protected void sequence_FlowSource_PropertiesBlock(ISerializationContext context, Association semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Import returns Import
	 *
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
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
	 *
	 * Constraint:
	 *     (
	 *         name=QualifiedName 
	 *         imports+=Import* 
	 *         (
	 *             elements+=PackageDeclaration | 
	 *             elements+=PrimitiveType | 
	 *             elements+=ComponentInterface | 
	 *             elements+=ComponentImplementation | 
	 *             elements+=ComponentConfiguration | 
	 *             elements+=Property | 
	 *             elements+=PropertySet | 
	 *             elements+=Workingset
	 *         )*
	 *     )
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
	 *     (name=ID elements+=PathElement elements+=PathElement+ propertyAssociations+=PropertyAssociation*)
	 */
	protected void sequence_Path_PropertiesBlock(ISerializationContext context, PathSequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PrimitiveType returns PrimitiveType
	 *
	 * Constraint:
	 *     (name=ID propertyAssociations+=PropertyAssociation*)
	 */
	protected void sequence_PrimitiveType_PropertiesBlock(ISerializationContext context, PrimitiveType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PropertyAssociation returns PropertyAssociation
	 *
	 * Constraint:
	 *     (target=PropertyReference value=PropertyValue)
	 */
	protected void sequence_PropertyAssociation(ISerializationContext context, PropertyAssociation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.PROPERTY_ASSOCIATION__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.PROPERTY_ASSOCIATION__TARGET));
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.PROPERTY_ASSOCIATION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.PROPERTY_ASSOCIATION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPropertyAssociationAccess().getTargetPropertyReferenceParserRuleCall_0_0(), semanticObject.getTarget());
		feeder.accept(grammarAccess.getPropertyAssociationAccess().getValuePropertyValueParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PropertyReference returns ModelElementReference
	 *
	 * Constraint:
	 *     (
	 *         (element=[ModelElement|ID] | (context=PropertyReference_ModelElementReference_0_1_0_0 element=[ModelElement|ID]))? 
	 *         property=[Property|QualifiedName]
	 *     )
	 */
	protected void sequence_PropertyReference(ISerializationContext context, ModelElementReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PropertyReference.ModelElementReference_0_1_0_0 returns ModelElementReference
	 *
	 * Constraint:
	 *     (element=[ModelElement|ID] | (context=PropertyReference_ModelElementReference_0_1_0_0 element=[ModelElement|ID]))
	 */
	protected void sequence_PropertyReference_ModelElementReference_0_1_0_0(ISerializationContext context, ModelElementReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PropertySet returns PropertySet
	 *
	 * Constraint:
	 *     (name=ID properties+=[Property|QualifiedName] properties+=[Property|QualifiedName]*)
	 */
	protected void sequence_PropertySet(ISerializationContext context, PropertySet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PropertyValue returns PropertyValue
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_PropertyValue(ISerializationContext context, PropertyValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.PROPERTY_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.PROPERTY_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPropertyValueAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Property returns Property
	 *
	 * Constraint:
	 *     (name=ID type=[Type|QualifiedName])
	 */
	protected void sequence_Property(ISerializationContext context, Property semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.PROPERTY__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.PROPERTY__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPropertyAccess().getTypeTypeQualifiedNameParserRuleCall_2_0_1(), semanticObject.eGet(Aadlv3Package.Literals.PROPERTY__TYPE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Workingset returns Workingset
	 *
	 * Constraint:
	 *     (name=QualifiedName rootComponents+=Component*)
	 */
	protected void sequence_Workingset(ISerializationContext context, Workingset semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
