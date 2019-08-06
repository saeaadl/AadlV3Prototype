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
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.osate.aadlv3.aadlv3.Aadlv3Package;
import org.osate.aadlv3.aadlv3.AnnexElement;
import org.osate.aadlv3.aadlv3.AnnexLibrary;
import org.osate.aadlv3.aadlv3.AnnexSubclause;
import org.osate.aadlv3.aadlv3.Association;
import org.osate.aadlv3.aadlv3.ClassifierAssignment;
import org.osate.aadlv3.aadlv3.ClassifierAssignmentPattern;
import org.osate.aadlv3.aadlv3.Component;
import org.osate.aadlv3.aadlv3.ComponentConfiguration;
import org.osate.aadlv3.aadlv3.ComponentImplementation;
import org.osate.aadlv3.aadlv3.ComponentInterface;
import org.osate.aadlv3.aadlv3.ConfigurationActual;
import org.osate.aadlv3.aadlv3.ConfigurationParameter;
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
import org.osate.aadlv3.aadlv3.TypeDecl;
import org.osate.aadlv3.aadlv3.TypeReference;
import org.osate.aadlv3.aadlv3.TypeSet;
import org.osate.aadlv3.aadlv3.Workingset;
import org.osate.expr.expr.Argument;
import org.osate.expr.expr.Assertion;
import org.osate.expr.expr.BagLiteral;
import org.osate.expr.expr.BagType;
import org.osate.expr.expr.BinaryOperation;
import org.osate.expr.expr.Block;
import org.osate.expr.expr.Category;
import org.osate.expr.expr.Conditional;
import org.osate.expr.expr.EBoolean;
import org.osate.expr.expr.EBooleanLiteral;
import org.osate.expr.expr.EInteger;
import org.osate.expr.expr.EIntegerLiteral;
import org.osate.expr.expr.EReal;
import org.osate.expr.expr.ERealLiteral;
import org.osate.expr.expr.EString;
import org.osate.expr.expr.EStringLiteral;
import org.osate.expr.expr.EnumLiteral;
import org.osate.expr.expr.EnumType;
import org.osate.expr.expr.ExprLibrary;
import org.osate.expr.expr.ExprModel;
import org.osate.expr.expr.ExprPackage;
import org.osate.expr.expr.ExprSubclause;
import org.osate.expr.expr.Field;
import org.osate.expr.expr.FieldValue;
import org.osate.expr.expr.FunDecl;
import org.osate.expr.expr.ListLiteral;
import org.osate.expr.expr.ListType;
import org.osate.expr.expr.MapLiteral;
import org.osate.expr.expr.MapType;
import org.osate.expr.expr.MetaClass;
import org.osate.expr.expr.NamedElementRef;
import org.osate.expr.expr.PropertyExpression;
import org.osate.expr.expr.Range;
import org.osate.expr.expr.RangeType;
import org.osate.expr.expr.Real;
import org.osate.expr.expr.RecordLiteral;
import org.osate.expr.expr.RecordType;
import org.osate.expr.expr.Selection;
import org.osate.expr.expr.SetLiteral;
import org.osate.expr.expr.SetType;
import org.osate.expr.expr.TupleLiteral;
import org.osate.expr.expr.TupleType;
import org.osate.expr.expr.TypeRef;
import org.osate.expr.expr.UnaryOperation;
import org.osate.expr.expr.UnionLiteral;
import org.osate.expr.expr.UnionType;
import org.osate.expr.expr.UnitExpression;
import org.osate.expr.expr.UnitLiteral;
import org.osate.expr.expr.UnitsType;
import org.osate.expr.expr.VarDecl;
import org.osate.expr.expr.WrappedNamedElement;
import org.osate.expr.serializer.ExprSemanticSequencer;
import org.osate.xtext.aadlv3.services.AadlV3GrammarAccess;

@SuppressWarnings("all")
public class AadlV3SemanticSequencer extends ExprSemanticSequencer {

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
			case Aadlv3Package.ANNEX_ELEMENT:
				sequence_AnnexElement(context, (AnnexElement) semanticObject); 
				return; 
			case Aadlv3Package.ANNEX_LIBRARY:
				sequence_AnnexLibrary(context, (AnnexLibrary) semanticObject); 
				return; 
			case Aadlv3Package.ANNEX_SUBCLAUSE:
				sequence_AnnexSubclause(context, (AnnexSubclause) semanticObject); 
				return; 
			case Aadlv3Package.ASSOCIATION:
				if (rule == grammarAccess.getBindingRule()) {
					sequence_Binding_PropertiesBlock(context, (Association) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getConnectionRule()) {
					sequence_Connection_PropertiesBlock(context, (Association) semanticObject); 
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
			case Aadlv3Package.CLASSIFIER_ASSIGNMENT:
				sequence_ClassifierAssignment_ConfigurationElement(context, (ClassifierAssignment) semanticObject); 
				return; 
			case Aadlv3Package.CLASSIFIER_ASSIGNMENT_PATTERN:
				sequence_ClassifierAssignmentPattern_ConfigurationElement_QueryExpression(context, (ClassifierAssignmentPattern) semanticObject); 
				return; 
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
				sequence_ComponentInterface_InterfaceElement_InterfaceExtensions(context, (ComponentInterface) semanticObject); 
				return; 
			case Aadlv3Package.CONFIGURATION_ACTUAL:
				sequence_ConfigurationActual(context, (ConfigurationActual) semanticObject); 
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
			case Aadlv3Package.TYPE_DECL:
				sequence_TypeDecl(context, (TypeDecl) semanticObject); 
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
			case Aadlv3Package.TYPE_SET:
				if (rule == grammarAccess.getEPropagationsRule()) {
					sequence_EPropagations(context, (TypeSet) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPropagationsRule()) {
					sequence_Propagations(context, (TypeSet) semanticObject); 
					return; 
				}
				else break;
			case Aadlv3Package.WORKINGSET:
				sequence_UseProps_Workingset(context, (Workingset) semanticObject); 
				return; 
			}
		else if (epackage == ExprPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ExprPackage.ARGUMENT:
				sequence_Argument(context, (Argument) semanticObject); 
				return; 
			case ExprPackage.ASSERTION:
				sequence_Assertion(context, (Assertion) semanticObject); 
				return; 
			case ExprPackage.BAG_LITERAL:
				sequence_BagLiteral_ExpressionList(context, (BagLiteral) semanticObject); 
				return; 
			case ExprPackage.BAG_TYPE:
				sequence_BagType(context, (BagType) semanticObject); 
				return; 
			case ExprPackage.BINARY_OPERATION:
				sequence_AdditiveExpression_AndExpression_EqualityExpression_MultiplicativeExpression_OrExpression_RelationalExpression(context, (BinaryOperation) semanticObject); 
				return; 
			case ExprPackage.BLOCK:
				sequence_BlockExpression(context, (Block) semanticObject); 
				return; 
			case ExprPackage.CATEGORY:
				sequence_Category(context, (Category) semanticObject); 
				return; 
			case ExprPackage.CONDITIONAL:
				sequence_IfExpression(context, (Conditional) semanticObject); 
				return; 
			case ExprPackage.EBOOLEAN:
				sequence_PrimitiveType(context, (EBoolean) semanticObject); 
				return; 
			case ExprPackage.EBOOLEAN_LITERAL:
				sequence_EBooleanLiteral(context, (EBooleanLiteral) semanticObject); 
				return; 
			case ExprPackage.EINTEGER:
				sequence_EInteger(context, (EInteger) semanticObject); 
				return; 
			case ExprPackage.EINTEGER_LITERAL:
				sequence_EIntegerLiteral(context, (EIntegerLiteral) semanticObject); 
				return; 
			case ExprPackage.EREAL:
				sequence_EReal(context, (EReal) semanticObject); 
				return; 
			case ExprPackage.EREAL_LITERAL:
				sequence_ERealLiteral(context, (ERealLiteral) semanticObject); 
				return; 
			case ExprPackage.ESTRING:
				sequence_PrimitiveType(context, (EString) semanticObject); 
				return; 
			case ExprPackage.ESTRING_LITERAL:
				sequence_EStringLiteral(context, (EStringLiteral) semanticObject); 
				return; 
			case ExprPackage.ENUM_LITERAL:
				sequence_EnumLiteral(context, (EnumLiteral) semanticObject); 
				return; 
			case ExprPackage.ENUM_TYPE:
				sequence_EnumType(context, (EnumType) semanticObject); 
				return; 
			case ExprPackage.EXPR_LIBRARY:
				sequence_Declarations_ExprLibrary(context, (ExprLibrary) semanticObject); 
				return; 
			case ExprPackage.EXPR_MODEL:
				sequence_ExprModel(context, (ExprModel) semanticObject); 
				return; 
			case ExprPackage.EXPR_SUBCLAUSE:
				sequence_Declarations_ExprSubclause(context, (ExprSubclause) semanticObject); 
				return; 
			case ExprPackage.FIELD:
				if (rule == grammarAccess.getNamedElementRule()
						|| rule == grammarAccess.getFieldRule()) {
					sequence_Field(context, (Field) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTupleFieldRule()) {
					sequence_TupleField(context, (Field) semanticObject); 
					return; 
				}
				else break;
			case ExprPackage.FIELD_VALUE:
				sequence_FieldValue(context, (FieldValue) semanticObject); 
				return; 
			case ExprPackage.FUN_DECL:
				sequence_Args_FunDecl(context, (FunDecl) semanticObject); 
				return; 
			case ExprPackage.INTEGER:
				sequence_INTVALUE(context, (org.osate.expr.expr.Integer) semanticObject); 
				return; 
			case ExprPackage.LIST_LITERAL:
				sequence_ExpressionList_ListLiteral(context, (ListLiteral) semanticObject); 
				return; 
			case ExprPackage.LIST_TYPE:
				sequence_ListType(context, (ListType) semanticObject); 
				return; 
			case ExprPackage.MAP_LITERAL:
				sequence_MapLiteral(context, (MapLiteral) semanticObject); 
				return; 
			case ExprPackage.MAP_TYPE:
				sequence_MapType(context, (MapType) semanticObject); 
				return; 
			case ExprPackage.META_CLASS:
				sequence_MetaClass(context, (MetaClass) semanticObject); 
				return; 
			case ExprPackage.NAMED_ELEMENT_REF:
				sequence_NamedElementRef(context, (NamedElementRef) semanticObject); 
				return; 
			case ExprPackage.PROPERTY_EXPRESSION:
				sequence_PropertyExpression(context, (PropertyExpression) semanticObject); 
				return; 
			case ExprPackage.RANGE:
				sequence_RangeExpression(context, (Range) semanticObject); 
				return; 
			case ExprPackage.RANGE_TYPE:
				sequence_RangeType(context, (RangeType) semanticObject); 
				return; 
			case ExprPackage.REAL:
				sequence_REALVALUE_SignedReal(context, (Real) semanticObject); 
				return; 
			case ExprPackage.RECORD_LITERAL:
				sequence_RecordLiteral(context, (RecordLiteral) semanticObject); 
				return; 
			case ExprPackage.RECORD_TYPE:
				sequence_RecordType(context, (RecordType) semanticObject); 
				return; 
			case ExprPackage.SELECTION:
				sequence_SelectExpression(context, (Selection) semanticObject); 
				return; 
			case ExprPackage.SET_LITERAL:
				sequence_ExpressionList_SetLiteral(context, (SetLiteral) semanticObject); 
				return; 
			case ExprPackage.SET_TYPE:
				sequence_SetType(context, (SetType) semanticObject); 
				return; 
			case ExprPackage.TUPLE_LITERAL:
				sequence_ExpressionList_TupleLiteral(context, (TupleLiteral) semanticObject); 
				return; 
			case ExprPackage.TUPLE_TYPE:
				sequence_TupleType(context, (TupleType) semanticObject); 
				return; 
			case ExprPackage.TYPE_REF:
				sequence_TypeRef(context, (TypeRef) semanticObject); 
				return; 
			case ExprPackage.UNARY_OPERATION:
				sequence_UnaryOperation(context, (UnaryOperation) semanticObject); 
				return; 
			case ExprPackage.UNION_LITERAL:
				sequence_UnionLiteral(context, (UnionLiteral) semanticObject); 
				return; 
			case ExprPackage.UNION_TYPE:
				sequence_UnionType(context, (UnionType) semanticObject); 
				return; 
			case ExprPackage.UNIT_EXPRESSION:
				sequence_UnitExpression(context, (UnitExpression) semanticObject); 
				return; 
			case ExprPackage.UNIT_LITERAL:
				if (rule == grammarAccess.getUnitLiteralConversionRule()) {
					sequence_UnitLiteralConversion(context, (UnitLiteral) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getUnitLiteralRule()) {
					sequence_UnitLiteral(context, (UnitLiteral) semanticObject); 
					return; 
				}
				else break;
			case ExprPackage.UNITS_TYPE:
				if (rule == grammarAccess.getUnitsTypeRule()) {
					sequence_UnitsType(context, (UnitsType) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getUnnamedUnitsTypeRule()) {
					sequence_UnnamedUnitsType(context, (UnitsType) semanticObject); 
					return; 
				}
				else break;
			case ExprPackage.VAR_DECL:
				sequence_VarDecl(context, (VarDecl) semanticObject); 
				return; 
			case ExprPackage.WRAPPED_NAMED_ELEMENT:
				sequence_WrappedNamedElement(context, (WrappedNamedElement) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AnnexElement returns AnnexElement
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_AnnexElement(ISerializationContext context, AnnexElement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAnnexElementAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
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
	 *     AnnexSubclause returns AnnexSubclause
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_AnnexSubclause(ISerializationContext context, AnnexSubclause semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAnnexSubclauseAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
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
	 *         type=[ClassifierOrType|QualifiedReference] 
	 *         (forAll?='all' | (componentCategories+=ComponentCategory | featureCategories+=FeatureCategory | associationTypes+=AssociationType)+)?
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
	 *         bindingType=[TypeDecl|QualifiedName]? 
	 *         associationType=IsBinding 
	 *         source=ModelElementReference 
	 *         destination=ModelElementReference 
	 *         ownedPropertyAssociations+=PropertyAssociation*
	 *     )
	 */
	protected void sequence_Binding_PropertiesBlock(ISerializationContext context, Association semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ClassifierAssignmentPattern returns ClassifierAssignmentPattern
	 *
	 * Constraint:
	 *     (
	 *         targetPattern=[ClassifierOrType|QualifiedTypesReference] 
	 *         (
	 *             (assignedClassifiers+=TypeReference assignedClassifiers+=TypeReference*) | 
	 *             (
	 *                 (assignedClassifiers+=TypeReference assignedClassifiers+=TypeReference*) 
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
	 *             (assignedClassifiers+=TypeReference assignedClassifiers+=TypeReference*) | 
	 *             (
	 *                 (assignedClassifiers+=TypeReference assignedClassifiers+=TypeReference*) 
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
	 *     PackageElement returns ComponentConfiguration
	 *     ComponentConfiguration returns ComponentConfiguration
	 *
	 * Constraint:
	 *     (
	 *         private?='private'? 
	 *         name=DottedName 
	 *         (parameterized?='(' (parameters+=ConfigurationParameter parameters+=ConfigurationParameter*)?)? 
	 *         (superClassifiers+=TypeReference superClassifiers+=TypeReference*)? 
	 *         (
	 *             ownedPropertyAssociations+=PropertyAssociation | 
	 *             bindings+=Binding | 
	 *             classifierAssignments+=ClassifierAssignment | 
	 *             classifierAssignments+=ClassifierAssignmentPattern | 
	 *             annexSubclause+=AnnexSubclause
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
	 *             bindings+=Binding | 
	 *             components+=Component | 
	 *             paths+=Path | 
	 *             flowAssignments+=FlowAssignment | 
	 *             classifierAssignments+=ClassifierAssignment | 
	 *             classifierAssignments+=ClassifierAssignmentPattern | 
	 *             ownedPropertyAssociations+=PropertyAssociation | 
	 *             annexSubclause+=AnnexSubclause
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
	 *             features+=Feature | 
	 *             flows+=FlowPath | 
	 *             flows+=FlowSource | 
	 *             flows+=FlowSink | 
	 *             ownedPropertyAssociations+=PropertyAssociation | 
	 *             annexSubclause+=AnnexSubclause
	 *         )*
	 *     )
	 */
	protected void sequence_ComponentInterface_InterfaceElement_InterfaceExtensions(ISerializationContext context, ComponentInterface semanticObject) {
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
	 *         (features+=Feature | connections+=Connection | bindings+=Binding | components+=Component | ownedPropertyAssociations+=PropertyAssociation)*
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
	 *     (type=[ClassifierOrType|QualifiedTypesReference] (actuals+=ConfigurationActual actuals+=ConfigurationActual*)?)
	 */
	protected void sequence_ConfigurationActuals_TypeReference(ISerializationContext context, TypeReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConfigurationParameter returns ConfigurationParameter
	 *
	 * Constraint:
	 *     (name=ID type=[ClassifierOrType|QualifiedName])
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
		feeder.accept(grammarAccess.getConfigurationParameterAccess().getTypeClassifierOrTypeQualifiedNameParserRuleCall_2_0_1(), semanticObject.eGet(Aadlv3Package.Literals.CONFIGURATION_PARAMETER__TYPE, false));
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
	 *         ownedPropertyAssociations+=PropertyAssociation*
	 *     )
	 */
	protected void sequence_Connection_PropertiesBlock(ISerializationContext context, Association semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EPropagations returns TypeSet
	 *
	 * Constraint:
	 *     (
	 *         direction=FeatureDirection? 
	 *         propagatedTypes+=[ClassifierOrType|QualifiedTypesReference] 
	 *         propagatedTypes+=[ClassifierOrType|QualifiedTypesReference]*
	 *     )
	 */
	protected void sequence_EPropagations(ISerializationContext context, TypeSet semanticObject) {
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
	 *         (propagation=Propagations | propagation=EPropagations)? 
	 *         annexElements+=AnnexElement* 
	 *         ownedPropertyAssociations+=PropertyAssociation*
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
	 *     (name=ID associationType=IsFlow source=ModelElementReference destination=ModelElementReference ownedPropertyAssociations+=PropertyAssociation*)
	 */
	protected void sequence_FlowPath_PropertiesBlock(ISerializationContext context, Association semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FlowSink returns Association
	 *
	 * Constraint:
	 *     (name=ID associationType=IsFlowSink source=ModelElementReference ownedPropertyAssociations+=PropertyAssociation*)
	 */
	protected void sequence_FlowSink_PropertiesBlock(ISerializationContext context, Association semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FlowSource returns Association
	 *
	 * Constraint:
	 *     (name=ID associationType=IsFlowSource destination=ModelElementReference ownedPropertyAssociations+=PropertyAssociation*)
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
	 *     (private?='private'? name=QualifiedName (elements+=AnnexLibrary | (imports+=Import | elements+=PackageElement)+)?)
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
	 *     (name=ID elements+=PathElement elements+=PathElement+ ownedPropertyAssociations+=PropertyAssociation*)
	 */
	protected void sequence_Path_PropertiesBlock(ISerializationContext context, PathSequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Propagations returns TypeSet
	 *
	 * Constraint:
	 *     (
	 *         direction=FeatureDirection? 
	 *         propagatedTypes+=[ClassifierOrType|QualifiedTypesReference] 
	 *         propagatedTypes+=[ClassifierOrType|QualifiedTypesReference]*
	 *     )
	 */
	protected void sequence_Propagations(ISerializationContext context, TypeSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PropertyAssociation returns PropertyAssociation
	 *
	 * Constraint:
	 *     (target=ModelElementReference? property=[PropertyDefinition|QCREF] propertyAssociationType=PropertyAssociationType value=PropertyValue)
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
	 *     expr=Expression
	 */
	protected void sequence_PropertyValue(ISerializationContext context, PropertyValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.PROPERTY_VALUE__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.PROPERTY_VALUE__EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPropertyValueAccess().getExprExpressionParserRuleCall_0(), semanticObject.getExpr());
		feeder.finish();
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
	 *     (reverse?='reverse'? type=[ClassifierOrType|QualifiedReference])
	 */
	protected void sequence_ReversableTypeReference(ISerializationContext context, TypeReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PackageElement returns TypeDecl
	 *     TypeDecl returns TypeDecl
	 *
	 * Constraint:
	 *     (name=ID type=Type (ownedPropertyAssociations+=PropertyAssociation ownedPropertyAssociations+=PropertyAssociation*)?)
	 */
	protected void sequence_TypeDecl(ISerializationContext context, TypeDecl semanticObject) {
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
	 *         rootComponents+=Component*
	 *     )
	 */
	protected void sequence_UseProps_Workingset(ISerializationContext context, Workingset semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
