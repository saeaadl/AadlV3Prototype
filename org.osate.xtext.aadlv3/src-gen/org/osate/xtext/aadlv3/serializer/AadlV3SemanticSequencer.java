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
import org.osate.aadlv3.aadlv3.AnnexLibrary;
import org.osate.aadlv3.aadlv3.Association;
import org.osate.aadlv3.aadlv3.Behavior;
import org.osate.aadlv3.aadlv3.BehaviorSpecification;
import org.osate.aadlv3.aadlv3.BinaryOperation;
import org.osate.aadlv3.aadlv3.BooleanLiteral;
import org.osate.aadlv3.aadlv3.ClassifierAssignment;
import org.osate.aadlv3.aadlv3.ClassifierAssignmentPattern;
import org.osate.aadlv3.aadlv3.ComponentConfiguration;
import org.osate.aadlv3.aadlv3.ComponentImplementation;
import org.osate.aadlv3.aadlv3.ComponentInterface;
import org.osate.aadlv3.aadlv3.CompositeType;
import org.osate.aadlv3.aadlv3.ConfigurationActual;
import org.osate.aadlv3.aadlv3.ConfigurationParameter;
import org.osate.aadlv3.aadlv3.DefaultAnnexSubclause;
import org.osate.aadlv3.aadlv3.DirectionalLiteral;
import org.osate.aadlv3.aadlv3.EnumerationLiteral;
import org.osate.aadlv3.aadlv3.EnumerationType;
import org.osate.aadlv3.aadlv3.Feature;
import org.osate.aadlv3.aadlv3.Generator;
import org.osate.aadlv3.aadlv3.Import;
import org.osate.aadlv3.aadlv3.InstanceConfiguration;
import org.osate.aadlv3.aadlv3.IntegerLiteral;
import org.osate.aadlv3.aadlv3.ListLiteral;
import org.osate.aadlv3.aadlv3.MultiLiteralConstraint;
import org.osate.aadlv3.aadlv3.NamedElementReference;
import org.osate.aadlv3.aadlv3.PackageDeclaration;
import org.osate.aadlv3.aadlv3.PackageElementReference;
import org.osate.aadlv3.aadlv3.PathElement;
import org.osate.aadlv3.aadlv3.PathSequence;
import org.osate.aadlv3.aadlv3.PrimitiveType;
import org.osate.aadlv3.aadlv3.PropertyAssociation;
import org.osate.aadlv3.aadlv3.PropertyDefinition;
import org.osate.aadlv3.aadlv3.PropertySet;
import org.osate.aadlv3.aadlv3.RealLiteral;
import org.osate.aadlv3.aadlv3.SetLiteral;
import org.osate.aadlv3.aadlv3.StateTransition;
import org.osate.aadlv3.aadlv3.StateVariable;
import org.osate.aadlv3.aadlv3.StringLiteral;
import org.osate.aadlv3.aadlv3.Subcomponent;
import org.osate.aadlv3.aadlv3.TypeDef;
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
			case Aadlv3Package.ANNEX_LIBRARY:
				sequence_AnnexLibrary(context, (AnnexLibrary) semanticObject); 
				return; 
			case Aadlv3Package.ASSOCIATION:
				if (rule == grammarAccess.getBindingRule()) {
					sequence_Binding_InStates_PropertiesBlock(context, (Association) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getConnectionRule()) {
					sequence_Connection_InStates_PropertiesBlock(context, (Association) semanticObject); 
					return; 
				}
				else break;
			case Aadlv3Package.BEHAVIOR:
				if (rule == grammarAccess.getBehaviorRule()) {
					sequence_Annotation_ComputationalBehavior_FlowPath_FlowSource_InStates_PropertiesBlock_TokenResultBlock_TypedToken(context, (Behavior) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getComputationalBehaviorRule()) {
					sequence_Annotation_ComputationalBehavior_InStates_PropertiesBlock_TokenResultBlock(context, (Behavior) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getFlowPathRule()) {
					sequence_Annotation_FlowPath_InStates_PropertiesBlock(context, (Behavior) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getFlowSourceRule()) {
					sequence_Annotation_FlowSource_InStates_PropertiesBlock(context, (Behavior) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTypedTokenRule()) {
					sequence_Annotation_InStates_PropertiesBlock_TokenResultBlock_TypedToken(context, (Behavior) semanticObject); 
					return; 
				}
				else break;
			case Aadlv3Package.BEHAVIOR_SPECIFICATION:
				sequence_BehaviorSpecification_BehaviorSpecificationElement(context, (BehaviorSpecification) semanticObject); 
				return; 
			case Aadlv3Package.BINARY_OPERATION:
				if (rule == grammarAccess.getDetectionEventRule()) {
					sequence_DetectionEvent(context, (BinaryOperation) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTokenResultRule()) {
					sequence_DetectionEvent_TokenOutput(context, (BinaryOperation) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getFeatureInputRule()) {
					sequence_FeatureInput(context, (BinaryOperation) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getFlowOutputRule()) {
					sequence_FlowOutput(context, (BinaryOperation) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getModelElementContainsEnumerationLiteralRule()) {
					sequence_ModelElementContainsEnumerationLiteral(context, (BinaryOperation) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getModelElementContainsLiteralRule()
						|| rule == grammarAccess.getLiteralRule()) {
					sequence_ModelElementContainsLiteral(context, (BinaryOperation) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getModelElementEqualsEnumerationLiteralRule()) {
					sequence_ModelElementEqualsEnumerationLiteral(context, (BinaryOperation) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getModelElementEqualsLiteralRule()) {
					sequence_ModelElementEqualsLiteral(context, (BinaryOperation) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getProductLineConstraintRule()) {
					sequence_ProductLineConstraint(context, (BinaryOperation) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTokenOutputRule()) {
					sequence_TokenOutput(context, (BinaryOperation) semanticObject); 
					return; 
				}
				else break;
			case Aadlv3Package.BOOLEAN_LITERAL:
				sequence_BooleanLiteral(context, (BooleanLiteral) semanticObject); 
				return; 
			case Aadlv3Package.CLASSIFIER_ASSIGNMENT:
				sequence_ClassifierAssignment_ConfigurationElement(context, (ClassifierAssignment) semanticObject); 
				return; 
			case Aadlv3Package.CLASSIFIER_ASSIGNMENT_PATTERN:
				sequence_ClassifierAssignmentPattern_ConfigurationElement_QueryExpression(context, (ClassifierAssignmentPattern) semanticObject); 
				return; 
			case Aadlv3Package.COMPONENT_CONFIGURATION:
				if (rule == grammarAccess.getPackageElementRule()) {
					sequence_Annotation_ComponentConfiguration_ConfigurationElement_ConfigurationExtensions_Parameters(context, (ComponentConfiguration) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getComponentConfigurationRule()) {
					sequence_Annotation_ComponentConfiguration_ConfigurationElement_ConfigurationExtensions_Parameters(context, (ComponentConfiguration) semanticObject); 
					return; 
				}
				else break;
			case Aadlv3Package.COMPONENT_IMPLEMENTATION:
				sequence_Annotation_ComponentImplementation_ImplementationElement_ImplementationExtensions(context, (ComponentImplementation) semanticObject); 
				return; 
			case Aadlv3Package.COMPONENT_INTERFACE:
				sequence_Annotation_ComponentInterface_InterfaceElement_InterfaceExtensions(context, (ComponentInterface) semanticObject); 
				return; 
			case Aadlv3Package.COMPOSITE_TYPE:
				sequence_CompositeType(context, (CompositeType) semanticObject); 
				return; 
			case Aadlv3Package.CONFIGURATION_ACTUAL:
				sequence_ConfigurationActual(context, (ConfigurationActual) semanticObject); 
				return; 
			case Aadlv3Package.CONFIGURATION_PARAMETER:
				sequence_ConfigurationParameter(context, (ConfigurationParameter) semanticObject); 
				return; 
			case Aadlv3Package.DEFAULT_ANNEX_SUBCLAUSE:
				sequence_DefaultAnnexSubclause(context, (DefaultAnnexSubclause) semanticObject); 
				return; 
			case Aadlv3Package.DIRECTIONAL_LITERAL:
				sequence_DirectionalLiteral(context, (DirectionalLiteral) semanticObject); 
				return; 
			case Aadlv3Package.ENUMERATION_LITERAL:
				sequence_EnumerationLiteral(context, (EnumerationLiteral) semanticObject); 
				return; 
			case Aadlv3Package.ENUMERATION_TYPE:
				sequence_EnumerationType(context, (EnumerationType) semanticObject); 
				return; 
			case Aadlv3Package.FEATURE:
				sequence_Annotation_Feature_PropertiesBlock(context, (Feature) semanticObject); 
				return; 
			case Aadlv3Package.GENERATOR:
				sequence_Annotation_Generator_InStates_PropertiesBlock(context, (Generator) semanticObject); 
				return; 
			case Aadlv3Package.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case Aadlv3Package.INSTANCE_CONFIGURATION:
				sequence_InstanceConfiguration(context, (InstanceConfiguration) semanticObject); 
				return; 
			case Aadlv3Package.INTEGER_LITERAL:
				sequence_IntegerLiteral(context, (IntegerLiteral) semanticObject); 
				return; 
			case Aadlv3Package.LIST_LITERAL:
				if (rule == grammarAccess.getEnumerationListRule()) {
					sequence_EnumerationList(context, (ListLiteral) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getLiteralRule()
						|| rule == grammarAccess.getListLiteralRule()) {
					sequence_ListLiteral(context, (ListLiteral) semanticObject); 
					return; 
				}
				else break;
			case Aadlv3Package.MULTI_LITERAL_CONSTRAINT:
				sequence_MultiLiteralOperation(context, (MultiLiteralConstraint) semanticObject); 
				return; 
			case Aadlv3Package.NAMED_ELEMENT_REFERENCE:
				if (rule == grammarAccess.getModelElementReferenceRule()
						|| action == grammarAccess.getModelElementReferenceAccess().getNamedElementReferenceContextAction_1_0_0()) {
					sequence_ModelElementReference(context, (NamedElementReference) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getNamedElementReferenceRule()
						|| action == grammarAccess.getNamedElementReferenceAccess().getNamedElementReferenceContextAction_1_0_0()
						|| rule == grammarAccess.getLiteralRule()) {
					sequence_NamedElementReference(context, (NamedElementReference) semanticObject); 
					return; 
				}
				else break;
			case Aadlv3Package.PACKAGE_DECLARATION:
				sequence_Annotation_PackageDeclaration(context, (PackageDeclaration) semanticObject); 
				return; 
			case Aadlv3Package.PACKAGE_ELEMENT_REFERENCE:
				if (rule == grammarAccess.getPackageElementReferenceRule()) {
					sequence_PackageElementReference(context, (PackageElementReference) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getLiteralRule()
						|| rule == grammarAccess.getPropertyReferenceRule()) {
					sequence_PropertyReference(context, (PackageElementReference) semanticObject); 
					return; 
				}
				else break;
			case Aadlv3Package.PATH_ELEMENT:
				sequence_PathElement(context, (PathElement) semanticObject); 
				return; 
			case Aadlv3Package.PATH_SEQUENCE:
				if (rule == grammarAccess.getEndToEndFlowRule()) {
					sequence_EndToEndFlow_PropertiesBlock(context, (PathSequence) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getFlowAssignmentRule()) {
					sequence_FlowAssignment(context, (PathSequence) semanticObject); 
					return; 
				}
				else break;
			case Aadlv3Package.PRIMITIVE_TYPE:
				sequence_PrimitiveType(context, (PrimitiveType) semanticObject); 
				return; 
			case Aadlv3Package.PROPERTY_ASSOCIATION:
				sequence_PropertyAssociation(context, (PropertyAssociation) semanticObject); 
				return; 
			case Aadlv3Package.PROPERTY_DEFINITION:
				sequence_Annotation_AppliesTo_PropertyDefinition(context, (PropertyDefinition) semanticObject); 
				return; 
			case Aadlv3Package.PROPERTY_SET:
				if (rule == grammarAccess.getPackageElementRule()) {
					sequence_Annotation_PropertySet(context, (PropertySet) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPropertySetRule()) {
					sequence_Annotation_PropertySet(context, (PropertySet) semanticObject); 
					return; 
				}
				else break;
			case Aadlv3Package.REAL_LITERAL:
				sequence_RealLiteral(context, (RealLiteral) semanticObject); 
				return; 
			case Aadlv3Package.SET_LITERAL:
				sequence_SetLiteral(context, (SetLiteral) semanticObject); 
				return; 
			case Aadlv3Package.STATE_TRANSITION:
				sequence_Annotation_InStates_PropertiesBlock_Transition(context, (StateTransition) semanticObject); 
				return; 
			case Aadlv3Package.STATE_VARIABLE:
				sequence_Annotation_PropertiesBlock_StateVariable(context, (StateVariable) semanticObject); 
				return; 
			case Aadlv3Package.STRING_LITERAL:
				sequence_StringLiteral(context, (StringLiteral) semanticObject); 
				return; 
			case Aadlv3Package.SUBCOMPONENT:
				sequence_Annotation_InStates_NestedImplementationElement_PropertiesBlock_Subcomponent(context, (Subcomponent) semanticObject); 
				return; 
			case Aadlv3Package.TYPE_DEF:
				sequence_Annotation_PropertiesBlock_TypeDef(context, (TypeDef) semanticObject); 
				return; 
			case Aadlv3Package.TYPE_REFERENCE:
				if (rule == grammarAccess.getClassifierOrTypeReferenceRule()) {
					sequence_ClassifierOrTypeReference_ConfigurationActuals(context, (TypeReference) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getRealizationReferenceRule()) {
					sequence_ConfigurationActuals_RealizationReference(context, (TypeReference) semanticObject); 
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
				else if (rule == grammarAccess.getTypeReferenceRule()
						|| rule == grammarAccess.getTypeRule()) {
					sequence_TypeReference(context, (TypeReference) semanticObject); 
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
	 *     AnnexLibrary returns AnnexLibrary
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_AnnexLibrary(ISerializationContext context, AnnexLibrary semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAnnexLibraryAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PackageElement returns PropertyDefinition
	 *     PropertyDefinition returns PropertyDefinition
	 *
	 * Constraint:
	 *     (
	 *         annotations+=ID* 
	 *         private?='private'? 
	 *         name=ID 
	 *         type=Type 
	 *         (forAll?='all' | (componentCategories+=ComponentCategory | featureCategories+=FeatureCategory | associationTypes+=AssociationType)+)?
	 *     )
	 */
	protected void sequence_Annotation_AppliesTo_PropertyDefinition(ISerializationContext context, PropertyDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PackageElement returns ComponentConfiguration
	 *
	 * Constraint:
	 *     (
	 *         annotations+=ID? 
	 *         private?='private'? 
	 *         name=DottedName 
	 *         (parameterized?='(' (parameters+=ConfigurationParameter parameters+=ConfigurationParameter*)?)? 
	 *         (superClassifiers+=ClassifierOrTypeReference superClassifiers+=ClassifierOrTypeReference*)? 
	 *         (
	 *             ownedPropertyAssociations+=PropertyAssociation | 
	 *             bindings+=Binding | 
	 *             classifierAssignments+=ClassifierAssignment | 
	 *             classifierAssignments+=ClassifierAssignmentPattern | 
	 *             annexSubclause+=AnnexSubclause
	 *         )*
	 *     )
	 */
	protected void sequence_Annotation_ComponentConfiguration_ConfigurationElement_ConfigurationExtensions_Parameters(ISerializationContext context, ComponentConfiguration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	// This method is commented out because it has the same signature as another method in this class.
	// This is probably a bug in Xtext's serializer, please report it here: 
	// https://bugs.eclipse.org/bugs/enter_bug.cgi?product=TMF
	//
	// Contexts:
	//     ComponentConfiguration returns ComponentConfiguration
	//
	// Constraint:
	//     (
	//         annotations+=ID* 
	//         private?='private'? 
	//         name=DottedName 
	//         (parameterized?='(' (parameters+=ConfigurationParameter parameters+=ConfigurationParameter*)?)? 
	//         (superClassifiers+=ClassifierOrTypeReference superClassifiers+=ClassifierOrTypeReference*)? 
	//         (
	//             ownedPropertyAssociations+=PropertyAssociation | 
	//             bindings+=Binding | 
	//             classifierAssignments+=ClassifierAssignment | 
	//             classifierAssignments+=ClassifierAssignmentPattern | 
	//             annexSubclause+=AnnexSubclause
	//         )*
	//     )
	//
	// protected void sequence_Annotation_ComponentConfiguration_ConfigurationElement_ConfigurationExtensions_Parameters(ISerializationContext context, ComponentConfiguration semanticObject) { }
	
	/**
	 * Contexts:
	 *     PackageElement returns ComponentImplementation
	 *     ComponentImplementation returns ComponentImplementation
	 *
	 * Constraint:
	 *     (
	 *         annotations+=ID* 
	 *         private?='private'? 
	 *         category=ComponentCategory 
	 *         name=DottedName 
	 *         (superClassifiers+=ImplementationReference superClassifiers+=ImplementationReference*)? 
	 *         (
	 *             connections+=Connection | 
	 *             bindings+=Binding | 
	 *             components+=Subcomponent | 
	 *             paths+=EndToEndFlow | 
	 *             flowAssignments+=FlowAssignment | 
	 *             classifierAssignments+=ClassifierAssignment | 
	 *             classifierAssignments+=ClassifierAssignmentPattern | 
	 *             stateVariables+=StateVariable | 
	 *             transitions+=Transition | 
	 *             behaviors+=Behavior | 
	 *             generators+=Generator | 
	 *             ownedPropertyAssociations+=PropertyAssociation | 
	 *             annexSubclause+=AnnexSubclause
	 *         )*
	 *     )
	 */
	protected void sequence_Annotation_ComponentImplementation_ImplementationElement_ImplementationExtensions(ISerializationContext context, ComponentImplementation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PackageElement returns ComponentInterface
	 *     ComponentInterface returns ComponentInterface
	 *
	 * Constraint:
	 *     (
	 *         annotations+=ID* 
	 *         private?='private'? 
	 *         category=ComponentCategory? 
	 *         name=ID 
	 *         (superClassifiers+=ReversableInterfaceReference superClassifiers+=ReversableInterfaceReference*)? 
	 *         (
	 *             features+=Feature | 
	 *             stateVariables+=StateVariable | 
	 *             transitions+=Transition | 
	 *             behaviors+=Behavior | 
	 *             generators+=Generator | 
	 *             ownedPropertyAssociations+=PropertyAssociation | 
	 *             annexSubclause+=AnnexSubclause
	 *         )*
	 *     )
	 */
	protected void sequence_Annotation_ComponentInterface_InterfaceElement_InterfaceExtensions(ISerializationContext context, ComponentInterface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Behavior returns Behavior
	 *
	 * Constraint:
	 *     (
	 *         annotations+=ID* 
	 *         (
	 *             (name=ID (condition=ListLiteral | condition=ModelElementReference) (sink?='sink' | (actions+=FlowOutput actions+=FlowOutput*))) | 
	 *             (name=ID source?='source' (condition=ListLiteral | condition=ModelElementReference)? actions+=FlowOutput actions+=FlowOutput*) | 
	 *             (
	 *                 name=ID 
	 *                 source?='source'? 
	 *                 (condition=MultiLiteralOperation | condition=ModelElementContainsLiteral | condition=ModelElementReference) 
	 *                 (sink?='sink' | (actions+=TokenResult actions+=TokenResult*))
	 *             ) | 
	 *             (name=ID condition=Literal actions+=TokenResult actions+=TokenResult*)
	 *         ) 
	 *         (inStates=ModelElementContainsEnumerationLiteral | inStates=ModelElementEqualsEnumerationLiteral)? 
	 *         ownedPropertyAssociations+=PropertyAssociation*
	 *     )
	 */
	protected void sequence_Annotation_ComputationalBehavior_FlowPath_FlowSource_InStates_PropertiesBlock_TokenResultBlock_TypedToken(ISerializationContext context, Behavior semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ComputationalBehavior returns Behavior
	 *
	 * Constraint:
	 *     (
	 *         annotations+=ID* 
	 *         name=ID 
	 *         condition=Literal 
	 *         actions+=TokenResult 
	 *         actions+=TokenResult* 
	 *         (inStates=ModelElementContainsEnumerationLiteral | inStates=ModelElementEqualsEnumerationLiteral)? 
	 *         ownedPropertyAssociations+=PropertyAssociation*
	 *     )
	 */
	protected void sequence_Annotation_ComputationalBehavior_InStates_PropertiesBlock_TokenResultBlock(ISerializationContext context, Behavior semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Feature returns Feature
	 *
	 * Constraint:
	 *     (
	 *         annotations+=ID* 
	 *         name=ID 
	 *         direction=FeatureDirection? 
	 *         category=FeatureCategory 
	 *         typeReference=ReversableTypeReference? 
	 *         ownedPropertyAssociations+=PropertyAssociation*
	 *     )
	 */
	protected void sequence_Annotation_Feature_PropertiesBlock(ISerializationContext context, Feature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FlowPath returns Behavior
	 *
	 * Constraint:
	 *     (
	 *         annotations+=ID* 
	 *         name=ID 
	 *         (condition=ListLiteral | condition=ModelElementReference) 
	 *         (sink?='sink' | (actions+=FlowOutput actions+=FlowOutput*)) 
	 *         (inStates=ModelElementContainsEnumerationLiteral | inStates=ModelElementEqualsEnumerationLiteral)? 
	 *         ownedPropertyAssociations+=PropertyAssociation*
	 *     )
	 */
	protected void sequence_Annotation_FlowPath_InStates_PropertiesBlock(ISerializationContext context, Behavior semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FlowSource returns Behavior
	 *
	 * Constraint:
	 *     (
	 *         annotations+=ID* 
	 *         name=ID 
	 *         source?='source' 
	 *         (condition=ListLiteral | condition=ModelElementReference)? 
	 *         actions+=FlowOutput 
	 *         actions+=FlowOutput* 
	 *         (inStates=ModelElementContainsEnumerationLiteral | inStates=ModelElementEqualsEnumerationLiteral)? 
	 *         ownedPropertyAssociations+=PropertyAssociation*
	 *     )
	 */
	protected void sequence_Annotation_FlowSource_InStates_PropertiesBlock(ISerializationContext context, Behavior semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Generator returns Generator
	 *
	 * Constraint:
	 *     (
	 *         annotations+=ID* 
	 *         name=ID 
	 *         type=ID? 
	 *         value=ListLiteral? 
	 *         (inStates=ModelElementContainsEnumerationLiteral | inStates=ModelElementEqualsEnumerationLiteral)? 
	 *         ownedPropertyAssociations+=PropertyAssociation*
	 *     )
	 */
	protected void sequence_Annotation_Generator_InStates_PropertiesBlock(ISerializationContext context, Generator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Subcomponent returns Subcomponent
	 *
	 * Constraint:
	 *     (
	 *         annotations+=ID* 
	 *         name=ID 
	 *         category=ComponentCategory 
	 *         (
	 *             (typeReferences+=ClassifierOrTypeReference? ownedPropertyAssociations+=PropertyAssociation*) | 
	 *             (
	 *                 (typeReferences+=ClassifierOrTypeReference? (inStates=ModelElementContainsEnumerationLiteral | inStates=ModelElementEqualsEnumerationLiteral))? 
	 *                 (features+=Feature | connections+=Connection | bindings+=Binding | components+=Subcomponent | ownedPropertyAssociations+=PropertyAssociation)+
	 *             ) | 
	 *             (
	 *                 (typeReferences+=ClassifierOrTypeReference? (inStates=ModelElementContainsEnumerationLiteral | inStates=ModelElementEqualsEnumerationLiteral))? 
	 *                 ownedPropertyAssociations+=PropertyAssociation*
	 *             )
	 *         )
	 *     )
	 */
	protected void sequence_Annotation_InStates_NestedImplementationElement_PropertiesBlock_Subcomponent(ISerializationContext context, Subcomponent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TypedToken returns Behavior
	 *
	 * Constraint:
	 *     (
	 *         annotations+=ID* 
	 *         name=ID 
	 *         source?='source'? 
	 *         (condition=MultiLiteralOperation | condition=ModelElementContainsLiteral | condition=ModelElementReference) 
	 *         (sink?='sink' | (actions+=TokenResult actions+=TokenResult*)) 
	 *         (inStates=ModelElementContainsEnumerationLiteral | inStates=ModelElementEqualsEnumerationLiteral)? 
	 *         ownedPropertyAssociations+=PropertyAssociation*
	 *     )
	 */
	protected void sequence_Annotation_InStates_PropertiesBlock_TokenResultBlock_TypedToken(ISerializationContext context, Behavior semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Transition returns StateTransition
	 *
	 * Constraint:
	 *     (
	 *         annotations+=ID* 
	 *         name=ID 
	 *         (condition=MultiLiteralOperation | condition=ModelElementContainsLiteral | condition=ModelElementReference) 
	 *         targetState=ModelElementEqualsEnumerationLiteral 
	 *         (inStates=ModelElementContainsEnumerationLiteral | inStates=ModelElementEqualsEnumerationLiteral)? 
	 *         ownedPropertyAssociations+=PropertyAssociation*
	 *     )
	 */
	protected void sequence_Annotation_InStates_PropertiesBlock_Transition(ISerializationContext context, StateTransition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PackageDeclaration returns PackageDeclaration
	 *     PackageElement returns PackageDeclaration
	 *
	 * Constraint:
	 *     (annotations+=ID* private?='private'? name=QualifiedName (elements+=AnnexLibrary | (imports+=Import | elements+=PackageElement)+)?)
	 */
	protected void sequence_Annotation_PackageDeclaration(ISerializationContext context, PackageDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StateVariable returns StateVariable
	 *
	 * Constraint:
	 *     (annotations+=ID* name=ID stateType=[TypeDef|QualifiedName] initialState=EnumerationLiteral? ownedPropertyAssociations+=PropertyAssociation*)
	 */
	protected void sequence_Annotation_PropertiesBlock_StateVariable(ISerializationContext context, StateVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PackageElement returns TypeDef
	 *     TypeDef returns TypeDef
	 *
	 * Constraint:
	 *     (
	 *         annotations+=ID* 
	 *         private?='private'? 
	 *         name=ID 
	 *         superType=Type? 
	 *         baseType=Type? 
	 *         ownedPropertyAssociations+=PropertyAssociation*
	 *     )
	 */
	protected void sequence_Annotation_PropertiesBlock_TypeDef(ISerializationContext context, TypeDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PackageElement returns PropertySet
	 *
	 * Constraint:
	 *     (annotations+=ID? private?='private'? name=ID properties+=[PropertyDefinition|QualifiedReference] properties+=[PropertyDefinition|QualifiedName]*)
	 */
	protected void sequence_Annotation_PropertySet(ISerializationContext context, PropertySet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	// This method is commented out because it has the same signature as another method in this class.
	// This is probably a bug in Xtext's serializer, please report it here: 
	// https://bugs.eclipse.org/bugs/enter_bug.cgi?product=TMF
	//
	// Contexts:
	//     PropertySet returns PropertySet
	//
	// Constraint:
	//     (annotations+=ID* private?='private'? name=ID properties+=[PropertyDefinition|QualifiedReference] properties+=[PropertyDefinition|QualifiedName]*)
	//
	// protected void sequence_Annotation_PropertySet(ISerializationContext context, PropertySet semanticObject) { }
	
	/**
	 * Contexts:
	 *     AnnexSubclause returns BehaviorSpecification
	 *     BehaviorSpecification returns BehaviorSpecification
	 *
	 * Constraint:
	 *     (name=ID (generators+=Generator | transitions+=Transition | behaviors+=Behavior | stateVariables+=StateVariable)*)
	 */
	protected void sequence_BehaviorSpecification_BehaviorSpecificationElement(ISerializationContext context, BehaviorSpecification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Binding returns Association
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         bindingType=[TypeDef|QualifiedName]? 
	 *         associationType=IsBinding 
	 *         source=ModelElementReference 
	 *         destination=ModelElementReference 
	 *         (inStates=ModelElementContainsEnumerationLiteral | inStates=ModelElementEqualsEnumerationLiteral)? 
	 *         ownedPropertyAssociations+=PropertyAssociation*
	 *     )
	 */
	protected void sequence_Binding_InStates_PropertiesBlock(ISerializationContext context, Association semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Literal returns BooleanLiteral
	 *     BooleanLiteral returns BooleanLiteral
	 *
	 * Constraint:
	 *     value?='true'?
	 */
	protected void sequence_BooleanLiteral(ISerializationContext context, BooleanLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ClassifierAssignmentPattern returns ClassifierAssignmentPattern
	 *
	 * Constraint:
	 *     (
	 *         targetPattern=[Type|QualifiedTypesReference] 
	 *         (
	 *             (assignedClassifiers+=ClassifierOrTypeReference assignedClassifiers+=ClassifierOrTypeReference*) | 
	 *             (
	 *                 (assignedClassifiers+=ClassifierOrTypeReference assignedClassifiers+=ClassifierOrTypeReference*) 
	 *                 (
	 *                     ownedPropertyAssociations+=PropertyAssociation | 
	 *                     bindings+=Binding | 
	 *                     classifierAssignments+=ClassifierAssignment | 
	 *                     classifierAssignments+=ClassifierAssignmentPattern | 
	 *                     annexSubclause+=AnnexSubclause
	 *                 )+
	 *             )
	 *         )?
	 *     )
	 */
	protected void sequence_ClassifierAssignmentPattern_ConfigurationElement_QueryExpression(ISerializationContext context, ClassifierAssignmentPattern semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ClassifierAssignment returns ClassifierAssignment
	 *
	 * Constraint:
	 *     (
	 *         target=ModelElementReference 
	 *         (
	 *             (assignedClassifiers+=ClassifierOrTypeReference assignedClassifiers+=ClassifierOrTypeReference*) | 
	 *             (
	 *                 (assignedClassifiers+=ClassifierOrTypeReference assignedClassifiers+=ClassifierOrTypeReference*) 
	 *                 (
	 *                     ownedPropertyAssociations+=PropertyAssociation | 
	 *                     bindings+=Binding | 
	 *                     classifierAssignments+=ClassifierAssignment | 
	 *                     classifierAssignments+=ClassifierAssignmentPattern | 
	 *                     annexSubclause+=AnnexSubclause
	 *                 )+
	 *             )
	 *         )?
	 *     )
	 */
	protected void sequence_ClassifierAssignment_ConfigurationElement(ISerializationContext context, ClassifierAssignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ClassifierOrTypeReference returns TypeReference
	 *
	 * Constraint:
	 *     (type=[NamedType|QualifiedTypesReference] (actuals+=ConfigurationActual actuals+=ConfigurationActual*)?)
	 */
	protected void sequence_ClassifierOrTypeReference_ConfigurationActuals(ISerializationContext context, TypeReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns CompositeType
	 *     CompositeType returns CompositeType
	 *
	 * Constraint:
	 *     (compositeType=Composite type=TypeReference)
	 */
	protected void sequence_CompositeType(ISerializationContext context, CompositeType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.COMPOSITE_TYPE__COMPOSITE_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.COMPOSITE_TYPE__COMPOSITE_TYPE));
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.COMPOSITE_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.COMPOSITE_TYPE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCompositeTypeAccess().getCompositeTypeCompositeParserRuleCall_0_0(), semanticObject.getCompositeType());
		feeder.accept(grammarAccess.getCompositeTypeAccess().getTypeTypeReferenceParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ConfigurationActual returns ConfigurationActual
	 *
	 * Constraint:
	 *     (parameter=[ConfigurationParameter|ID] assignedClassifiers+=ClassifierOrTypeReference assignedClassifiers+=ClassifierOrTypeReference*)
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
	 *         associationType=IsConnection 
	 *         source=ModelElementReference 
	 *         bidirectional?='<->'? 
	 *         destination=ModelElementReference 
	 *         (inStates=ModelElementContainsEnumerationLiteral | inStates=ModelElementEqualsEnumerationLiteral)? 
	 *         ownedPropertyAssociations+=PropertyAssociation*
	 *     )
	 */
	protected void sequence_Connection_InStates_PropertiesBlock(ISerializationContext context, Association semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AnnexSubclause returns DefaultAnnexSubclause
	 *     DefaultAnnexSubclause returns DefaultAnnexSubclause
	 *
	 * Constraint:
	 *     (name=ID body=ANNEXTEXT)
	 */
	protected void sequence_DefaultAnnexSubclause(ISerializationContext context, DefaultAnnexSubclause semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.DEFAULT_ANNEX_SUBCLAUSE__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.DEFAULT_ANNEX_SUBCLAUSE__BODY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDefaultAnnexSubclauseAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDefaultAnnexSubclauseAccess().getBodyANNEXTEXTTerminalRuleCall_2_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DetectionEvent returns BinaryOperation
	 *
	 * Constraint:
	 *     (left=ModelElementReference operator=OutputOperation right=ListLiteral?)
	 */
	protected void sequence_DetectionEvent(ISerializationContext context, BinaryOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TokenResult returns BinaryOperation
	 *
	 * Constraint:
	 *     (
	 *         (left=ModelElementReference (operator=EqualsOperation right=NamedElementReference)?) | 
	 *         (left=ModelElementReference operator=OutputOperation right=ListLiteral?)
	 *     )
	 */
	protected void sequence_DetectionEvent_TokenOutput(ISerializationContext context, BinaryOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Literal returns DirectionalLiteral
	 *     DirectionalLiteral returns DirectionalLiteral
	 *
	 * Constraint:
	 *     (direction=PropagationDirection value=Literal)
	 */
	protected void sequence_DirectionalLiteral(ISerializationContext context, DirectionalLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.DIRECTIONAL_LITERAL__DIRECTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.DIRECTIONAL_LITERAL__DIRECTION));
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.DIRECTIONAL_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.DIRECTIONAL_LITERAL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDirectionalLiteralAccess().getDirectionPropagationDirectionParserRuleCall_1_0(), semanticObject.getDirection());
		feeder.accept(grammarAccess.getDirectionalLiteralAccess().getValueLiteralParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EndToEndFlow returns PathSequence
	 *
	 * Constraint:
	 *     (name=ID elements+=PathElement elements+=PathElement+ ownedPropertyAssociations+=PropertyAssociation*)
	 */
	protected void sequence_EndToEndFlow_PropertiesBlock(ISerializationContext context, PathSequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EnumerationList returns ListLiteral
	 *
	 * Constraint:
	 *     (elements+=EnumerationLiteral elements+=EnumerationLiteral*)?
	 */
	protected void sequence_EnumerationList(ISerializationContext context, ListLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Literal returns EnumerationLiteral
	 *     EnumerationLiteral returns EnumerationLiteral
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_EnumerationLiteral(ISerializationContext context, EnumerationLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Type returns EnumerationType
	 *     EnumerationType returns EnumerationType
	 *
	 * Constraint:
	 *     literals+=EnumerationLiteral*
	 */
	protected void sequence_EnumerationType(ISerializationContext context, EnumerationType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FeatureInput returns BinaryOperation
	 *
	 * Constraint:
	 *     (left=ModelElementReference operator=InputOperation)
	 */
	protected void sequence_FeatureInput(ISerializationContext context, BinaryOperation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.BINARY_OPERATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.BINARY_OPERATION__LEFT));
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.BINARY_OPERATION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.BINARY_OPERATION__OPERATOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFeatureInputAccess().getLeftModelElementReferenceParserRuleCall_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getFeatureInputAccess().getOperatorInputOperationParserRuleCall_1_0(), semanticObject.getOperator());
		feeder.finish();
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
	 *     FlowOutput returns BinaryOperation
	 *
	 * Constraint:
	 *     left=ModelElementReference
	 */
	protected void sequence_FlowOutput(ISerializationContext context, BinaryOperation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.BINARY_OPERATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.BINARY_OPERATION__LEFT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFlowOutputAccess().getLeftModelElementReferenceParserRuleCall_0(), semanticObject.getLeft());
		feeder.finish();
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
	 *     InstanceConfiguration returns InstanceConfiguration
	 *
	 * Constraint:
	 *     (name=ID category=ComponentCategory typeReferences+=ClassifierOrTypeReference actions+=STRING* productlineConstraint=ProductLineConstraint?)
	 */
	protected void sequence_InstanceConfiguration(ISerializationContext context, InstanceConfiguration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Literal returns IntegerLiteral
	 *     IntegerLiteral returns IntegerLiteral
	 *
	 * Constraint:
	 *     (value=INT unit=ID?)
	 */
	protected void sequence_IntegerLiteral(ISerializationContext context, IntegerLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Literal returns ListLiteral
	 *     ListLiteral returns ListLiteral
	 *
	 * Constraint:
	 *     (elements+=Literal elements+=Literal*)?
	 */
	protected void sequence_ListLiteral(ISerializationContext context, ListLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ModelElementContainsEnumerationLiteral returns BinaryOperation
	 *
	 * Constraint:
	 *     (left=ModelElementReference operator=InOperation right=EnumerationList)
	 */
	protected void sequence_ModelElementContainsEnumerationLiteral(ISerializationContext context, BinaryOperation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.BINARY_OPERATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.BINARY_OPERATION__LEFT));
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.BINARY_OPERATION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.BINARY_OPERATION__OPERATOR));
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.BINARY_OPERATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.BINARY_OPERATION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getModelElementContainsEnumerationLiteralAccess().getLeftModelElementReferenceParserRuleCall_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getModelElementContainsEnumerationLiteralAccess().getOperatorInOperationParserRuleCall_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getModelElementContainsEnumerationLiteralAccess().getRightEnumerationListParserRuleCall_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ModelElementContainsLiteral returns BinaryOperation
	 *     Literal returns BinaryOperation
	 *
	 * Constraint:
	 *     (left=ModelElementReference operator=InOperation right=ListLiteral)
	 */
	protected void sequence_ModelElementContainsLiteral(ISerializationContext context, BinaryOperation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.BINARY_OPERATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.BINARY_OPERATION__LEFT));
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.BINARY_OPERATION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.BINARY_OPERATION__OPERATOR));
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.BINARY_OPERATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.BINARY_OPERATION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getModelElementContainsLiteralAccess().getLeftModelElementReferenceParserRuleCall_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getModelElementContainsLiteralAccess().getOperatorInOperationParserRuleCall_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getModelElementContainsLiteralAccess().getRightListLiteralParserRuleCall_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ModelElementEqualsEnumerationLiteral returns BinaryOperation
	 *
	 * Constraint:
	 *     (left=ModelElementReference operator=EqualsOperation right=EnumerationLiteral)
	 */
	protected void sequence_ModelElementEqualsEnumerationLiteral(ISerializationContext context, BinaryOperation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.BINARY_OPERATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.BINARY_OPERATION__LEFT));
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.BINARY_OPERATION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.BINARY_OPERATION__OPERATOR));
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.BINARY_OPERATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.BINARY_OPERATION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getModelElementEqualsEnumerationLiteralAccess().getLeftModelElementReferenceParserRuleCall_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getModelElementEqualsEnumerationLiteralAccess().getOperatorEqualsOperationParserRuleCall_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getModelElementEqualsEnumerationLiteralAccess().getRightEnumerationLiteralParserRuleCall_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ModelElementEqualsLiteral returns BinaryOperation
	 *
	 * Constraint:
	 *     (left=ModelElementReference operator=EqualsOperation right=NamedElementReference)
	 */
	protected void sequence_ModelElementEqualsLiteral(ISerializationContext context, BinaryOperation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.BINARY_OPERATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.BINARY_OPERATION__LEFT));
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.BINARY_OPERATION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.BINARY_OPERATION__OPERATOR));
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.BINARY_OPERATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.BINARY_OPERATION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getModelElementEqualsLiteralAccess().getLeftModelElementReferenceParserRuleCall_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getModelElementEqualsLiteralAccess().getOperatorEqualsOperationParserRuleCall_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getModelElementEqualsLiteralAccess().getRightNamedElementReferenceParserRuleCall_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ModelElementReference returns NamedElementReference
	 *     ModelElementReference.NamedElementReference_1_0_0 returns NamedElementReference
	 *
	 * Constraint:
	 *     (element=[ModelElement|ID] | (context=ModelElementReference_NamedElementReference_1_0_0 element=[ModelElement|ID]))
	 */
	protected void sequence_ModelElementReference(ISerializationContext context, NamedElementReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Literal returns MultiLiteralConstraint
	 *     MultiLiteralOperation returns MultiLiteralConstraint
	 *
	 * Constraint:
	 *     (operator=EOperation (elements+=Literal elements+=Literal*)?)
	 */
	protected void sequence_MultiLiteralOperation(ISerializationContext context, MultiLiteralConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NamedElementReference returns NamedElementReference
	 *     NamedElementReference.NamedElementReference_1_0_0 returns NamedElementReference
	 *     Literal returns NamedElementReference
	 *
	 * Constraint:
	 *     (element=[NamedElement|QualifiedReference] | (context=NamedElementReference_NamedElementReference_1_0_0 element=[ModelElement|ID]))
	 */
	protected void sequence_NamedElementReference(ISerializationContext context, NamedElementReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PackageElementReference returns PackageElementReference
	 *
	 * Constraint:
	 *     element=[PackageElement|QualifiedName]
	 */
	protected void sequence_PackageElementReference(ISerializationContext context, PackageElementReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.PACKAGE_ELEMENT_REFERENCE__ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.PACKAGE_ELEMENT_REFERENCE__ELEMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPackageElementReferenceAccess().getElementPackageElementQualifiedNameParserRuleCall_0_1(), semanticObject.eGet(Aadlv3Package.Literals.PACKAGE_ELEMENT_REFERENCE__ELEMENT, false));
		feeder.finish();
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
	 *     Type returns PrimitiveType
	 *     PrimitiveType returns PrimitiveType
	 *
	 * Constraint:
	 *     primitiveType=Primitive
	 */
	protected void sequence_PrimitiveType(ISerializationContext context, PrimitiveType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.PRIMITIVE_TYPE__PRIMITIVE_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.PRIMITIVE_TYPE__PRIMITIVE_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimitiveTypeAccess().getPrimitiveTypePrimitiveParserRuleCall_0(), semanticObject.getPrimitiveType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ProductLineConstraint returns BinaryOperation
	 *
	 * Constraint:
	 *     (left=PropertyReference operator=SatisfiesOperation right=ListLiteral)
	 */
	protected void sequence_ProductLineConstraint(ISerializationContext context, BinaryOperation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.BINARY_OPERATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.BINARY_OPERATION__LEFT));
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.BINARY_OPERATION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.BINARY_OPERATION__OPERATOR));
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.BINARY_OPERATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.BINARY_OPERATION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProductLineConstraintAccess().getLeftPropertyReferenceParserRuleCall_2_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getProductLineConstraintAccess().getOperatorSatisfiesOperationParserRuleCall_3_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getProductLineConstraintAccess().getRightListLiteralParserRuleCall_4_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PropertyAssociation returns PropertyAssociation
	 *
	 * Constraint:
	 *     (target=ModelElementReference? property=[PropertyDefinition|QualifiedName] propertyAssociationType=PropertyAssociationType value=Literal)
	 */
	protected void sequence_PropertyAssociation(ISerializationContext context, PropertyAssociation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Literal returns PackageElementReference
	 *     PropertyReference returns PackageElementReference
	 *
	 * Constraint:
	 *     element=[PackageElement|QualifiedName]
	 */
	protected void sequence_PropertyReference(ISerializationContext context, PackageElementReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.PACKAGE_ELEMENT_REFERENCE__ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.PACKAGE_ELEMENT_REFERENCE__ELEMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPropertyReferenceAccess().getElementPackageElementQualifiedNameParserRuleCall_1_0_1(), semanticObject.eGet(Aadlv3Package.Literals.PACKAGE_ELEMENT_REFERENCE__ELEMENT, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Literal returns RealLiteral
	 *     RealLiteral returns RealLiteral
	 *
	 * Constraint:
	 *     (value=DOUBLE unit=ID?)
	 */
	protected void sequence_RealLiteral(ISerializationContext context, RealLiteral semanticObject) {
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
	 *     (reverse?='reverse'? type=[NamedType|QualifiedReference])
	 */
	protected void sequence_ReversableTypeReference(ISerializationContext context, TypeReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Literal returns SetLiteral
	 *     SetLiteral returns SetLiteral
	 *
	 * Constraint:
	 *     (elements+=Literal elements+=Literal*)?
	 */
	protected void sequence_SetLiteral(ISerializationContext context, SetLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Literal returns StringLiteral
	 *     StringLiteral returns StringLiteral
	 *
	 * Constraint:
	 *     value=NoQuoteString
	 */
	protected void sequence_StringLiteral(ISerializationContext context, StringLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.STRING_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.STRING_LITERAL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringLiteralAccess().getValueNoQuoteStringParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TokenOutput returns BinaryOperation
	 *
	 * Constraint:
	 *     (left=ModelElementReference (operator=EqualsOperation right=NamedElementReference)?)
	 */
	protected void sequence_TokenOutput(ISerializationContext context, BinaryOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TypeReference returns TypeReference
	 *     Type returns TypeReference
	 *
	 * Constraint:
	 *     type=[NamedType|QualifiedName]
	 */
	protected void sequence_TypeReference(ISerializationContext context, TypeReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.TYPE_REFERENCE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.TYPE_REFERENCE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTypeReferenceAccess().getTypeNamedTypeQualifiedNameParserRuleCall_0_1(), semanticObject.eGet(Aadlv3Package.Literals.TYPE_REFERENCE__TYPE, false));
		feeder.finish();
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
	 *         instanceRoots+=InstanceConfiguration*
	 *     )
	 */
	protected void sequence_UseProps_Workingset(ISerializationContext context, Workingset semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
