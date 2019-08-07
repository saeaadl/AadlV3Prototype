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
package org.osate.xtext.aadlv3.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.osate.xtext.aadlv3.ide.contentassist.antlr.internal.InternalAadlV3Parser;
import org.osate.xtext.aadlv3.services.AadlV3GrammarAccess;

public class AadlV3Parser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(AadlV3GrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, AadlV3GrammarAccess grammarAccess) {
			builder.put(grammarAccess.getPackageDeclarationAccess().getAlternatives_4(), "rule__PackageDeclaration__Alternatives_4");
			builder.put(grammarAccess.getPackageDeclarationAccess().getAlternatives_4_1(), "rule__PackageDeclaration__Alternatives_4_1");
			builder.put(grammarAccess.getPackageElementAccess().getAlternatives(), "rule__PackageElement__Alternatives");
			builder.put(grammarAccess.getPropertyDefinitionAccess().getAlternatives_5_2(), "rule__PropertyDefinition__Alternatives_5_2");
			builder.put(grammarAccess.getAppliesToAccess().getAlternatives(), "rule__AppliesTo__Alternatives");
			builder.put(grammarAccess.getInterfaceElementAccess().getAlternatives(), "rule__InterfaceElement__Alternatives");
			builder.put(grammarAccess.getImplementationElementAccess().getAlternatives(), "rule__ImplementationElement__Alternatives");
			builder.put(grammarAccess.getFeatureAccess().getAlternatives_5(), "rule__Feature__Alternatives_5");
			builder.put(grammarAccess.getConnectionAccess().getAlternatives_4(), "rule__Connection__Alternatives_4");
			builder.put(grammarAccess.getImportAccess().getAlternatives_1(), "rule__Import__Alternatives_1");
			builder.put(grammarAccess.getClassifierAssignmentAccess().getAlternatives_2(), "rule__ClassifierAssignment__Alternatives_2");
			builder.put(grammarAccess.getClassifierAssignmentPatternAccess().getAlternatives_2(), "rule__ClassifierAssignmentPattern__Alternatives_2");
			builder.put(grammarAccess.getConfigurationElementAccess().getAlternatives(), "rule__ConfigurationElement__Alternatives");
			builder.put(grammarAccess.getNestedImplementationElementAccess().getAlternatives(), "rule__NestedImplementationElement__Alternatives");
			builder.put(grammarAccess.getComponentCategoryAccess().getAlternatives(), "rule__ComponentCategory__Alternatives");
			builder.put(grammarAccess.getFeatureCategoryAccess().getAlternatives(), "rule__FeatureCategory__Alternatives");
			builder.put(grammarAccess.getFeatureDirectionAccess().getAlternatives(), "rule__FeatureDirection__Alternatives");
			builder.put(grammarAccess.getPropagationDirectionAccess().getAlternatives(), "rule__PropagationDirection__Alternatives");
			builder.put(grammarAccess.getAssociationTypeAccess().getAlternatives(), "rule__AssociationType__Alternatives");
			builder.put(grammarAccess.getExprModelAccess().getAlternatives(), "rule__ExprModel__Alternatives");
			builder.put(grammarAccess.getNamedElementAccess().getAlternatives(), "rule__NamedElement__Alternatives");
			builder.put(grammarAccess.getEDeclarationAccess().getAlternatives(), "rule__EDeclaration__Alternatives");
			builder.put(grammarAccess.getVarDeclAccess().getAlternatives_0(), "rule__VarDecl__Alternatives_0");
			builder.put(grammarAccess.getFunDeclAccess().getAlternatives_7_1(), "rule__FunDecl__Alternatives_7_1");
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getPrimitiveTypeAccess().getAlternatives(), "rule__PrimitiveType__Alternatives");
			builder.put(grammarAccess.getENumberTypeAccess().getAlternatives(), "rule__ENumberType__Alternatives");
			builder.put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
			builder.put(grammarAccess.getOpOrAccess().getAlternatives(), "rule__OpOr__Alternatives");
			builder.put(grammarAccess.getOpAndAccess().getAlternatives(), "rule__OpAnd__Alternatives");
			builder.put(grammarAccess.getOpEqualityAccess().getAlternatives(), "rule__OpEquality__Alternatives");
			builder.put(grammarAccess.getOpCompareAccess().getAlternatives(), "rule__OpCompare__Alternatives");
			builder.put(grammarAccess.getOpAddAccess().getAlternatives(), "rule__OpAdd__Alternatives");
			builder.put(grammarAccess.getOpMultiAccess().getAlternatives(), "rule__OpMulti__Alternatives");
			builder.put(grammarAccess.getUnaryOperationAccess().getAlternatives(), "rule__UnaryOperation__Alternatives");
			builder.put(grammarAccess.getOpUnaryAccess().getAlternatives(), "rule__OpUnary__Alternatives");
			builder.put(grammarAccess.getUnitExpressionAccess().getAlternatives_1_1(), "rule__UnitExpression__Alternatives_1_1");
			builder.put(grammarAccess.getPrimaryExpressionAccess().getAlternatives(), "rule__PrimaryExpression__Alternatives");
			builder.put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
			builder.put(grammarAccess.getEBooleanLiteralAccess().getAlternatives_1(), "rule__EBooleanLiteral__Alternatives_1");
			builder.put(grammarAccess.getNumberLiteralAccess().getAlternatives(), "rule__NumberLiteral__Alternatives");
			builder.put(grammarAccess.getPropertyAssociationTypeAccess().getAlternatives(), "rule__PropertyAssociationType__Alternatives");
			builder.put(grammarAccess.getMetaClassEnumAccess().getAlternatives(), "rule__MetaClassEnum__Alternatives");
			builder.put(grammarAccess.getTargetTypeAccess().getAlternatives(), "rule__TargetType__Alternatives");
			builder.put(grammarAccess.getOperationAccess().getAlternatives(), "rule__Operation__Alternatives");
			builder.put(grammarAccess.getPackageDeclarationAccess().getGroup(), "rule__PackageDeclaration__Group__0");
			builder.put(grammarAccess.getAnnexLibraryAccess().getGroup(), "rule__AnnexLibrary__Group__0");
			builder.put(grammarAccess.getPropertyDefinitionAccess().getGroup(), "rule__PropertyDefinition__Group__0");
			builder.put(grammarAccess.getPropertyDefinitionAccess().getGroup_5(), "rule__PropertyDefinition__Group_5__0");
			builder.put(grammarAccess.getPropertyDefinitionAccess().getGroup_5_2_1(), "rule__PropertyDefinition__Group_5_2_1__0");
			builder.put(grammarAccess.getPropertyDefinitionAccess().getGroup_5_2_1_1(), "rule__PropertyDefinition__Group_5_2_1_1__0");
			builder.put(grammarAccess.getPropertySetAccess().getGroup(), "rule__PropertySet__Group__0");
			builder.put(grammarAccess.getPropertySetAccess().getGroup_6(), "rule__PropertySet__Group_6__0");
			builder.put(grammarAccess.getComponentInterfaceAccess().getGroup(), "rule__ComponentInterface__Group__0");
			builder.put(grammarAccess.getComponentInterfaceAccess().getGroup_4(), "rule__ComponentInterface__Group_4__0");
			builder.put(grammarAccess.getInterfaceBodyAccess().getGroup(), "rule__InterfaceBody__Group__0");
			builder.put(grammarAccess.getComponentImplementationAccess().getGroup(), "rule__ComponentImplementation__Group__0");
			builder.put(grammarAccess.getComponentImplementationAccess().getGroup_3(), "rule__ComponentImplementation__Group_3__0");
			builder.put(grammarAccess.getImplementationBodyAccess().getGroup(), "rule__ImplementationBody__Group__0");
			builder.put(grammarAccess.getComponentConfigurationAccess().getGroup(), "rule__ComponentConfiguration__Group__0");
			builder.put(grammarAccess.getComponentConfigurationAccess().getGroup_4(), "rule__ComponentConfiguration__Group_4__0");
			builder.put(grammarAccess.getFeatureAccess().getGroup(), "rule__Feature__Group__0");
			builder.put(grammarAccess.getComponentAccess().getGroup(), "rule__Component__Group__0");
			builder.put(grammarAccess.getConnectionAccess().getGroup(), "rule__Connection__Group__0");
			builder.put(grammarAccess.getBindingAccess().getGroup(), "rule__Binding__Group__0");
			builder.put(grammarAccess.getFlowPathAccess().getGroup(), "rule__FlowPath__Group__0");
			builder.put(grammarAccess.getFlowSourceAccess().getGroup(), "rule__FlowSource__Group__0");
			builder.put(grammarAccess.getFlowSinkAccess().getGroup(), "rule__FlowSink__Group__0");
			builder.put(grammarAccess.getUsePropsAccess().getGroup(), "rule__UseProps__Group__0");
			builder.put(grammarAccess.getUsePropsAccess().getGroup_3(), "rule__UseProps__Group_3__0");
			builder.put(grammarAccess.getPropagationsAccess().getGroup(), "rule__Propagations__Group__0");
			builder.put(grammarAccess.getPropagationsAccess().getGroup_4(), "rule__Propagations__Group_4__0");
			builder.put(grammarAccess.getEPropagationsAccess().getGroup(), "rule__EPropagations__Group__0");
			builder.put(grammarAccess.getEPropagationsAccess().getGroup_4(), "rule__EPropagations__Group_4__0");
			builder.put(grammarAccess.getPathAccess().getGroup(), "rule__Path__Group__0");
			builder.put(grammarAccess.getPathAccess().getGroup_4(), "rule__Path__Group_4__0");
			builder.put(grammarAccess.getPathElementAccess().getGroup(), "rule__PathElement__Group__0");
			builder.put(grammarAccess.getPathElementAccess().getGroup_1(), "rule__PathElement__Group_1__0");
			builder.put(grammarAccess.getPathElementAccess().getGroup_1_0(), "rule__PathElement__Group_1_0__0");
			builder.put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
			builder.put(grammarAccess.getImportAccess().getGroup_2(), "rule__Import__Group_2__0");
			builder.put(grammarAccess.getClassifierAssignmentAccess().getGroup(), "rule__ClassifierAssignment__Group__0");
			builder.put(grammarAccess.getClassifierAssignmentAccess().getGroup_2_0(), "rule__ClassifierAssignment__Group_2_0__0");
			builder.put(grammarAccess.getClassifierAssignmentAccess().getGroup_2_0_1(), "rule__ClassifierAssignment__Group_2_0_1__0");
			builder.put(grammarAccess.getClassifierAssignmentPatternAccess().getGroup(), "rule__ClassifierAssignmentPattern__Group__0");
			builder.put(grammarAccess.getClassifierAssignmentPatternAccess().getGroup_2_0(), "rule__ClassifierAssignmentPattern__Group_2_0__0");
			builder.put(grammarAccess.getClassifierAssignmentPatternAccess().getGroup_2_0_1(), "rule__ClassifierAssignmentPattern__Group_2_0_1__0");
			builder.put(grammarAccess.getQueryExpressionAccess().getGroup(), "rule__QueryExpression__Group__0");
			builder.put(grammarAccess.getFlowAssignmentAccess().getGroup(), "rule__FlowAssignment__Group__0");
			builder.put(grammarAccess.getFlowAssignmentAccess().getGroup_4(), "rule__FlowAssignment__Group_4__0");
			builder.put(grammarAccess.getConfigurationElementBlockAccess().getGroup(), "rule__ConfigurationElementBlock__Group__0");
			builder.put(grammarAccess.getCurlyConfigurationElementBlockAccess().getGroup(), "rule__CurlyConfigurationElementBlock__Group__0");
			builder.put(grammarAccess.getParametersAccess().getGroup(), "rule__Parameters__Group__0");
			builder.put(grammarAccess.getParametersAccess().getGroup_1(), "rule__Parameters__Group_1__0");
			builder.put(grammarAccess.getParametersAccess().getGroup_1_1(), "rule__Parameters__Group_1_1__0");
			builder.put(grammarAccess.getConfigurationParameterAccess().getGroup(), "rule__ConfigurationParameter__Group__0");
			builder.put(grammarAccess.getReversableInterfaceReferenceAccess().getGroup(), "rule__ReversableInterfaceReference__Group__0");
			builder.put(grammarAccess.getReversableTypeReferenceAccess().getGroup(), "rule__ReversableTypeReference__Group__0");
			builder.put(grammarAccess.getTypeReferenceAccess().getGroup(), "rule__TypeReference__Group__0");
			builder.put(grammarAccess.getRealizationReferenceAccess().getGroup(), "rule__RealizationReference__Group__0");
			builder.put(grammarAccess.getAnnexSubclauseAccess().getGroup(), "rule__AnnexSubclause__Group__0");
			builder.put(grammarAccess.getAnnexElementAccess().getGroup(), "rule__AnnexElement__Group__0");
			builder.put(grammarAccess.getPropertiesBlockAccess().getGroup(), "rule__PropertiesBlock__Group__0");
			builder.put(grammarAccess.getNestedComponentImplementationBlockAccess().getGroup(), "rule__NestedComponentImplementationBlock__Group__0");
			builder.put(grammarAccess.getConfigurationExtensionsAccess().getGroup(), "rule__ConfigurationExtensions__Group__0");
			builder.put(grammarAccess.getConfigurationExtensionsAccess().getGroup_1(), "rule__ConfigurationExtensions__Group_1__0");
			builder.put(grammarAccess.getImplementationExtensionsAccess().getGroup(), "rule__ImplementationExtensions__Group__0");
			builder.put(grammarAccess.getImplementationExtensionsAccess().getGroup_1(), "rule__ImplementationExtensions__Group_1__0");
			builder.put(grammarAccess.getInterfaceExtensionsAccess().getGroup(), "rule__InterfaceExtensions__Group__0");
			builder.put(grammarAccess.getInterfaceExtensionsAccess().getGroup_1(), "rule__InterfaceExtensions__Group_1__0");
			builder.put(grammarAccess.getConfigurationActualsAccess().getGroup(), "rule__ConfigurationActuals__Group__0");
			builder.put(grammarAccess.getConfigurationActualsAccess().getGroup_1(), "rule__ConfigurationActuals__Group_1__0");
			builder.put(grammarAccess.getConfigurationActualsAccess().getGroup_1_1(), "rule__ConfigurationActuals__Group_1_1__0");
			builder.put(grammarAccess.getConfigurationActualAccess().getGroup(), "rule__ConfigurationActual__Group__0");
			builder.put(grammarAccess.getConfigurationActualAccess().getGroup_3(), "rule__ConfigurationActual__Group_3__0");
			builder.put(grammarAccess.getWorkingsetAccess().getGroup(), "rule__Workingset__Group__0");
			builder.put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
			builder.put(grammarAccess.getDottedNameAccess().getGroup(), "rule__DottedName__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
			builder.put(grammarAccess.getQualifiedTypesReferenceAccess().getGroup(), "rule__QualifiedTypesReference__Group__0");
			builder.put(grammarAccess.getQualifiedTypesReferenceAccess().getGroup_1(), "rule__QualifiedTypesReference__Group_1__0");
			builder.put(grammarAccess.getQualifiedDottedReferenceAccess().getGroup(), "rule__QualifiedDottedReference__Group__0");
			builder.put(grammarAccess.getVirtualProcessorKeywordsAccess().getGroup(), "rule__VirtualProcessorKeywords__Group__0");
			builder.put(grammarAccess.getVirtualBusKeywordsAccess().getGroup(), "rule__VirtualBusKeywords__Group__0");
			builder.put(grammarAccess.getVirtualMemoryKeywordsAccess().getGroup(), "rule__VirtualMemoryKeywords__Group__0");
			builder.put(grammarAccess.getVirtualDeviceKeywordsAccess().getGroup(), "rule__VirtualDeviceKeywords__Group__0");
			builder.put(grammarAccess.getThreadGroupKeywordsAccess().getGroup(), "rule__ThreadGroupKeywords__Group__0");
			builder.put(grammarAccess.getSubprogramGroupKeywordsAccess().getGroup(), "rule__SubprogramGroupKeywords__Group__0");
			builder.put(grammarAccess.getFlowSourceKeywordsAccess().getGroup(), "rule__FlowSourceKeywords__Group__0");
			builder.put(grammarAccess.getFlowSinkKeywordsAccess().getGroup(), "rule__FlowSinkKeywords__Group__0");
			builder.put(grammarAccess.getInOutKeywordsAccess().getGroup(), "rule__InOutKeywords__Group__0");
			builder.put(grammarAccess.getBusAccessKeywordsAccess().getGroup(), "rule__BusAccessKeywords__Group__0");
			builder.put(grammarAccess.getVirtualBusAccessKeywordsAccess().getGroup(), "rule__VirtualBusAccessKeywords__Group__0");
			builder.put(grammarAccess.getDataAccessKeywordsAccess().getGroup(), "rule__DataAccessKeywords__Group__0");
			builder.put(grammarAccess.getSubprogramAccessKeywordsAccess().getGroup(), "rule__SubprogramAccessKeywords__Group__0");
			builder.put(grammarAccess.getSubprogramGroupAccessKeywordsAccess().getGroup(), "rule__SubprogramGroupAccessKeywords__Group__0");
			builder.put(grammarAccess.getProvidesReadKeywordsAccess().getGroup(), "rule__ProvidesReadKeywords__Group__0");
			builder.put(grammarAccess.getRequiresReadKeywordsAccess().getGroup(), "rule__RequiresReadKeywords__Group__0");
			builder.put(grammarAccess.getProvidesWriteKeywordsAccess().getGroup(), "rule__ProvidesWriteKeywords__Group__0");
			builder.put(grammarAccess.getRequiresWriteKeywordsAccess().getGroup(), "rule__RequiresWriteKeywords__Group__0");
			builder.put(grammarAccess.getProvidesRWKeywordsAccess().getGroup(), "rule__ProvidesRWKeywords__Group__0");
			builder.put(grammarAccess.getRequiresRWKeywordsAccess().getGroup(), "rule__RequiresRWKeywords__Group__0");
			builder.put(grammarAccess.getExprModelAccess().getGroup_0(), "rule__ExprModel__Group_0__0");
			builder.put(grammarAccess.getExprModelAccess().getGroup_1(), "rule__ExprModel__Group_1__0");
			builder.put(grammarAccess.getExprLibraryAccess().getGroup(), "rule__ExprLibrary__Group__0");
			builder.put(grammarAccess.getExprSubclauseAccess().getGroup(), "rule__ExprSubclause__Group__0");
			builder.put(grammarAccess.getDeclarationsAccess().getGroup(), "rule__Declarations__Group__0");
			builder.put(grammarAccess.getDeclarationsAccess().getGroup_1(), "rule__Declarations__Group_1__0");
			builder.put(grammarAccess.getVarDeclAccess().getGroup(), "rule__VarDecl__Group__0");
			builder.put(grammarAccess.getVarDeclAccess().getGroup_2(), "rule__VarDecl__Group_2__0");
			builder.put(grammarAccess.getVarDeclAccess().getGroup_3(), "rule__VarDecl__Group_3__0");
			builder.put(grammarAccess.getFunDeclAccess().getGroup(), "rule__FunDecl__Group__0");
			builder.put(grammarAccess.getFunDeclAccess().getGroup_7(), "rule__FunDecl__Group_7__0");
			builder.put(grammarAccess.getFunDeclAccess().getGroup_7_1_0(), "rule__FunDecl__Group_7_1_0__0");
			builder.put(grammarAccess.getJavaFQNAccess().getGroup(), "rule__JavaFQN__Group__0");
			builder.put(grammarAccess.getJavaFQNAccess().getGroup_1(), "rule__JavaFQN__Group_1__0");
			builder.put(grammarAccess.getArgsAccess().getGroup(), "rule__Args__Group__0");
			builder.put(grammarAccess.getArgsAccess().getGroup_1(), "rule__Args__Group_1__0");
			builder.put(grammarAccess.getArgumentAccess().getGroup(), "rule__Argument__Group__0");
			builder.put(grammarAccess.getAssertionAccess().getGroup(), "rule__Assertion__Group__0");
			builder.put(grammarAccess.getPrimitiveTypeAccess().getGroup_0(), "rule__PrimitiveType__Group_0__0");
			builder.put(grammarAccess.getPrimitiveTypeAccess().getGroup_2(), "rule__PrimitiveType__Group_2__0");
			builder.put(grammarAccess.getEIntegerAccess().getGroup(), "rule__EInteger__Group__0");
			builder.put(grammarAccess.getERealAccess().getGroup(), "rule__EReal__Group__0");
			builder.put(grammarAccess.getRangeTypeAccess().getGroup(), "rule__RangeType__Group__0");
			builder.put(grammarAccess.getRecordTypeAccess().getGroup(), "rule__RecordType__Group__0");
			builder.put(grammarAccess.getRecordTypeAccess().getGroup_3(), "rule__RecordType__Group_3__0");
			builder.put(grammarAccess.getRecordTypeAccess().getGroup_3_1(), "rule__RecordType__Group_3_1__0");
			builder.put(grammarAccess.getFieldAccess().getGroup(), "rule__Field__Group__0");
			builder.put(grammarAccess.getUnionTypeAccess().getGroup(), "rule__UnionType__Group__0");
			builder.put(grammarAccess.getUnionTypeAccess().getGroup_3(), "rule__UnionType__Group_3__0");
			builder.put(grammarAccess.getUnionTypeAccess().getGroup_3_1(), "rule__UnionType__Group_3_1__0");
			builder.put(grammarAccess.getTupleTypeAccess().getGroup(), "rule__TupleType__Group__0");
			builder.put(grammarAccess.getTupleTypeAccess().getGroup_3(), "rule__TupleType__Group_3__0");
			builder.put(grammarAccess.getTupleTypeAccess().getGroup_3_1(), "rule__TupleType__Group_3_1__0");
			builder.put(grammarAccess.getListTypeAccess().getGroup(), "rule__ListType__Group__0");
			builder.put(grammarAccess.getSetTypeAccess().getGroup(), "rule__SetType__Group__0");
			builder.put(grammarAccess.getBagTypeAccess().getGroup(), "rule__BagType__Group__0");
			builder.put(grammarAccess.getMapTypeAccess().getGroup(), "rule__MapType__Group__0");
			builder.put(grammarAccess.getEnumTypeAccess().getGroup(), "rule__EnumType__Group__0");
			builder.put(grammarAccess.getEnumTypeAccess().getGroup_3(), "rule__EnumType__Group_3__0");
			builder.put(grammarAccess.getEnumTypeAccess().getGroup_3_1(), "rule__EnumType__Group_3_1__0");
			builder.put(grammarAccess.getBlockExpressionAccess().getGroup(), "rule__BlockExpression__Group__0");
			builder.put(grammarAccess.getBlockExpressionAccess().getGroup_2(), "rule__BlockExpression__Group_2__0");
			builder.put(grammarAccess.getOrExpressionAccess().getGroup(), "rule__OrExpression__Group__0");
			builder.put(grammarAccess.getOrExpressionAccess().getGroup_1(), "rule__OrExpression__Group_1__0");
			builder.put(grammarAccess.getOrExpressionAccess().getGroup_1_0(), "rule__OrExpression__Group_1_0__0");
			builder.put(grammarAccess.getOrExpressionAccess().getGroup_1_0_0(), "rule__OrExpression__Group_1_0_0__0");
			builder.put(grammarAccess.getAndExpressionAccess().getGroup(), "rule__AndExpression__Group__0");
			builder.put(grammarAccess.getAndExpressionAccess().getGroup_1(), "rule__AndExpression__Group_1__0");
			builder.put(grammarAccess.getAndExpressionAccess().getGroup_1_0(), "rule__AndExpression__Group_1_0__0");
			builder.put(grammarAccess.getAndExpressionAccess().getGroup_1_0_0(), "rule__AndExpression__Group_1_0_0__0");
			builder.put(grammarAccess.getEqualityExpressionAccess().getGroup(), "rule__EqualityExpression__Group__0");
			builder.put(grammarAccess.getEqualityExpressionAccess().getGroup_1(), "rule__EqualityExpression__Group_1__0");
			builder.put(grammarAccess.getEqualityExpressionAccess().getGroup_1_0(), "rule__EqualityExpression__Group_1_0__0");
			builder.put(grammarAccess.getEqualityExpressionAccess().getGroup_1_0_0(), "rule__EqualityExpression__Group_1_0_0__0");
			builder.put(grammarAccess.getRelationalExpressionAccess().getGroup(), "rule__RelationalExpression__Group__0");
			builder.put(grammarAccess.getRelationalExpressionAccess().getGroup_1(), "rule__RelationalExpression__Group_1__0");
			builder.put(grammarAccess.getRelationalExpressionAccess().getGroup_1_0(), "rule__RelationalExpression__Group_1_0__0");
			builder.put(grammarAccess.getRelationalExpressionAccess().getGroup_1_0_0(), "rule__RelationalExpression__Group_1_0_0__0");
			builder.put(grammarAccess.getAdditiveExpressionAccess().getGroup(), "rule__AdditiveExpression__Group__0");
			builder.put(grammarAccess.getAdditiveExpressionAccess().getGroup_1(), "rule__AdditiveExpression__Group_1__0");
			builder.put(grammarAccess.getAdditiveExpressionAccess().getGroup_1_0(), "rule__AdditiveExpression__Group_1_0__0");
			builder.put(grammarAccess.getAdditiveExpressionAccess().getGroup_1_0_0(), "rule__AdditiveExpression__Group_1_0_0__0");
			builder.put(grammarAccess.getMultiplicativeExpressionAccess().getGroup(), "rule__MultiplicativeExpression__Group__0");
			builder.put(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1(), "rule__MultiplicativeExpression__Group_1__0");
			builder.put(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0(), "rule__MultiplicativeExpression__Group_1_0__0");
			builder.put(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0_0(), "rule__MultiplicativeExpression__Group_1_0_0__0");
			builder.put(grammarAccess.getUnaryOperationAccess().getGroup_0(), "rule__UnaryOperation__Group_0__0");
			builder.put(grammarAccess.getUnitExpressionAccess().getGroup(), "rule__UnitExpression__Group__0");
			builder.put(grammarAccess.getUnitExpressionAccess().getGroup_1(), "rule__UnitExpression__Group_1__0");
			builder.put(grammarAccess.getPropertyExpressionAccess().getGroup(), "rule__PropertyExpression__Group__0");
			builder.put(grammarAccess.getPropertyExpressionAccess().getGroup_1(), "rule__PropertyExpression__Group_1__0");
			builder.put(grammarAccess.getPropertyExpressionAccess().getGroup_1_0(), "rule__PropertyExpression__Group_1_0__0");
			builder.put(grammarAccess.getPropertyExpressionAccess().getGroup_1_0_0(), "rule__PropertyExpression__Group_1_0_0__0");
			builder.put(grammarAccess.getSelectExpressionAccess().getGroup(), "rule__SelectExpression__Group__0");
			builder.put(grammarAccess.getSelectExpressionAccess().getGroup_1(), "rule__SelectExpression__Group_1__0");
			builder.put(grammarAccess.getSelectExpressionAccess().getGroup_1_0(), "rule__SelectExpression__Group_1_0__0");
			builder.put(grammarAccess.getSelectExpressionAccess().getGroup_1_0_3(), "rule__SelectExpression__Group_1_0_3__0");
			builder.put(grammarAccess.getSelectExpressionAccess().getGroup_1_0_3_1(), "rule__SelectExpression__Group_1_0_3_1__0");
			builder.put(grammarAccess.getSelectExpressionAccess().getGroup_1_0_3_1_1(), "rule__SelectExpression__Group_1_0_3_1_1__0");
			builder.put(grammarAccess.getPrimaryExpressionAccess().getGroup_4(), "rule__PrimaryExpression__Group_4__0");
			builder.put(grammarAccess.getNamedElementRefAccess().getGroup(), "rule__NamedElementRef__Group__0");
			builder.put(grammarAccess.getNamedElementRefAccess().getGroup_2(), "rule__NamedElementRef__Group_2__0");
			builder.put(grammarAccess.getNamedElementRefAccess().getGroup_2_1(), "rule__NamedElementRef__Group_2_1__0");
			builder.put(grammarAccess.getNamedElementRefAccess().getGroup_2_1_1(), "rule__NamedElementRef__Group_2_1_1__0");
			builder.put(grammarAccess.getRangeExpressionAccess().getGroup(), "rule__RangeExpression__Group__0");
			builder.put(grammarAccess.getRangeExpressionAccess().getGroup_5(), "rule__RangeExpression__Group_5__0");
			builder.put(grammarAccess.getIfExpressionAccess().getGroup(), "rule__IfExpression__Group__0");
			builder.put(grammarAccess.getIfExpressionAccess().getGroup_5(), "rule__IfExpression__Group_5__0");
			builder.put(grammarAccess.getEBooleanLiteralAccess().getGroup(), "rule__EBooleanLiteral__Group__0");
			builder.put(grammarAccess.getEIntegerLiteralAccess().getGroup(), "rule__EIntegerLiteral__Group__0");
			builder.put(grammarAccess.getERealLiteralAccess().getGroup(), "rule__ERealLiteral__Group__0");
			builder.put(grammarAccess.getEStringLiteralAccess().getGroup(), "rule__EStringLiteral__Group__0");
			builder.put(grammarAccess.getExpressionListAccess().getGroup(), "rule__ExpressionList__Group__0");
			builder.put(grammarAccess.getExpressionListAccess().getGroup_1(), "rule__ExpressionList__Group_1__0");
			builder.put(grammarAccess.getExpressionListAccess().getGroup_1_1(), "rule__ExpressionList__Group_1_1__0");
			builder.put(grammarAccess.getListLiteralAccess().getGroup(), "rule__ListLiteral__Group__0");
			builder.put(grammarAccess.getSetLiteralAccess().getGroup(), "rule__SetLiteral__Group__0");
			builder.put(grammarAccess.getRecordLiteralAccess().getGroup(), "rule__RecordLiteral__Group__0");
			builder.put(grammarAccess.getRecordLiteralAccess().getGroup_3(), "rule__RecordLiteral__Group_3__0");
			builder.put(grammarAccess.getRecordLiteralAccess().getGroup_3_1(), "rule__RecordLiteral__Group_3_1__0");
			builder.put(grammarAccess.getFieldValueAccess().getGroup(), "rule__FieldValue__Group__0");
			builder.put(grammarAccess.getUnionLiteralAccess().getGroup(), "rule__UnionLiteral__Group__0");
			builder.put(grammarAccess.getTupleLiteralAccess().getGroup(), "rule__TupleLiteral__Group__0");
			builder.put(grammarAccess.getBagLiteralAccess().getGroup(), "rule__BagLiteral__Group__0");
			builder.put(grammarAccess.getMapLiteralAccess().getGroup(), "rule__MapLiteral__Group__0");
			builder.put(grammarAccess.getUnitsTypeAccess().getGroup(), "rule__UnitsType__Group__0");
			builder.put(grammarAccess.getUnitsTypeAccess().getGroup_4(), "rule__UnitsType__Group_4__0");
			builder.put(grammarAccess.getUnitLiteralConversionAccess().getGroup(), "rule__UnitLiteralConversion__Group__0");
			builder.put(grammarAccess.getTypeDeclAccess().getGroup(), "rule__TypeDecl__Group__0");
			builder.put(grammarAccess.getTypeDeclAccess().getGroup_4(), "rule__TypeDecl__Group_4__0");
			builder.put(grammarAccess.getTypeDeclAccess().getGroup_4_2(), "rule__TypeDecl__Group_4_2__0");
			builder.put(grammarAccess.getPropertyAssociationAccess().getGroup(), "rule__PropertyAssociation__Group__0");
			builder.put(grammarAccess.getModelElementReferenceAccess().getGroup(), "rule__ModelElementReference__Group__0");
			builder.put(grammarAccess.getModelElementReferenceAccess().getGroup_1(), "rule__ModelElementReference__Group_1__0");
			builder.put(grammarAccess.getModelElementReferenceAccess().getGroup_1_0(), "rule__ModelElementReference__Group_1_0__0");
			builder.put(grammarAccess.getQCREFAccess().getGroup(), "rule__QCREF__Group__0");
			builder.put(grammarAccess.getQCREFAccess().getGroup_0(), "rule__QCREF__Group_0__0");
			builder.put(grammarAccess.getQPREFAccess().getGroup(), "rule__QPREF__Group__0");
			builder.put(grammarAccess.getQPREFAccess().getGroup_0(), "rule__QPREF__Group_0__0");
			builder.put(grammarAccess.getQPREFAccess().getGroup_2(), "rule__QPREF__Group_2__0");
			builder.put(grammarAccess.getPackageDeclarationAccess().getPrivateAssignment_0(), "rule__PackageDeclaration__PrivateAssignment_0");
			builder.put(grammarAccess.getPackageDeclarationAccess().getNameAssignment_2(), "rule__PackageDeclaration__NameAssignment_2");
			builder.put(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_4_0(), "rule__PackageDeclaration__ElementsAssignment_4_0");
			builder.put(grammarAccess.getPackageDeclarationAccess().getImportsAssignment_4_1_0(), "rule__PackageDeclaration__ImportsAssignment_4_1_0");
			builder.put(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_4_1_1(), "rule__PackageDeclaration__ElementsAssignment_4_1_1");
			builder.put(grammarAccess.getAnnexLibraryAccess().getNameAssignment_1(), "rule__AnnexLibrary__NameAssignment_1");
			builder.put(grammarAccess.getPropertyDefinitionAccess().getPrivateAssignment_0(), "rule__PropertyDefinition__PrivateAssignment_0");
			builder.put(grammarAccess.getPropertyDefinitionAccess().getNameAssignment_2(), "rule__PropertyDefinition__NameAssignment_2");
			builder.put(grammarAccess.getPropertyDefinitionAccess().getTypeAssignment_4(), "rule__PropertyDefinition__TypeAssignment_4");
			builder.put(grammarAccess.getPropertyDefinitionAccess().getForAllAssignment_5_2_0(), "rule__PropertyDefinition__ForAllAssignment_5_2_0");
			builder.put(grammarAccess.getAppliesToAccess().getComponentCategoriesAssignment_0(), "rule__AppliesTo__ComponentCategoriesAssignment_0");
			builder.put(grammarAccess.getAppliesToAccess().getFeatureCategoriesAssignment_1(), "rule__AppliesTo__FeatureCategoriesAssignment_1");
			builder.put(grammarAccess.getAppliesToAccess().getAssociationTypesAssignment_2(), "rule__AppliesTo__AssociationTypesAssignment_2");
			builder.put(grammarAccess.getPropertySetAccess().getPrivateAssignment_0(), "rule__PropertySet__PrivateAssignment_0");
			builder.put(grammarAccess.getPropertySetAccess().getNameAssignment_2(), "rule__PropertySet__NameAssignment_2");
			builder.put(grammarAccess.getPropertySetAccess().getPropertiesAssignment_5(), "rule__PropertySet__PropertiesAssignment_5");
			builder.put(grammarAccess.getPropertySetAccess().getPropertiesAssignment_6_1(), "rule__PropertySet__PropertiesAssignment_6_1");
			builder.put(grammarAccess.getComponentInterfaceAccess().getPrivateAssignment_0(), "rule__ComponentInterface__PrivateAssignment_0");
			builder.put(grammarAccess.getComponentInterfaceAccess().getCategoryAssignment_1(), "rule__ComponentInterface__CategoryAssignment_1");
			builder.put(grammarAccess.getComponentInterfaceAccess().getNameAssignment_3(), "rule__ComponentInterface__NameAssignment_3");
			builder.put(grammarAccess.getInterfaceElementAccess().getFeaturesAssignment_0(), "rule__InterfaceElement__FeaturesAssignment_0");
			builder.put(grammarAccess.getInterfaceElementAccess().getFlowsAssignment_1(), "rule__InterfaceElement__FlowsAssignment_1");
			builder.put(grammarAccess.getInterfaceElementAccess().getFlowsAssignment_2(), "rule__InterfaceElement__FlowsAssignment_2");
			builder.put(grammarAccess.getInterfaceElementAccess().getFlowsAssignment_3(), "rule__InterfaceElement__FlowsAssignment_3");
			builder.put(grammarAccess.getInterfaceElementAccess().getOwnedPropertyAssociationsAssignment_4(), "rule__InterfaceElement__OwnedPropertyAssociationsAssignment_4");
			builder.put(grammarAccess.getInterfaceElementAccess().getAnnexSubclauseAssignment_5(), "rule__InterfaceElement__AnnexSubclauseAssignment_5");
			builder.put(grammarAccess.getComponentImplementationAccess().getPrivateAssignment_0(), "rule__ComponentImplementation__PrivateAssignment_0");
			builder.put(grammarAccess.getComponentImplementationAccess().getCategoryAssignment_1(), "rule__ComponentImplementation__CategoryAssignment_1");
			builder.put(grammarAccess.getComponentImplementationAccess().getNameAssignment_2(), "rule__ComponentImplementation__NameAssignment_2");
			builder.put(grammarAccess.getImplementationElementAccess().getConnectionsAssignment_0(), "rule__ImplementationElement__ConnectionsAssignment_0");
			builder.put(grammarAccess.getImplementationElementAccess().getBindingsAssignment_1(), "rule__ImplementationElement__BindingsAssignment_1");
			builder.put(grammarAccess.getImplementationElementAccess().getComponentsAssignment_2(), "rule__ImplementationElement__ComponentsAssignment_2");
			builder.put(grammarAccess.getImplementationElementAccess().getPathsAssignment_3(), "rule__ImplementationElement__PathsAssignment_3");
			builder.put(grammarAccess.getImplementationElementAccess().getFlowAssignmentsAssignment_4(), "rule__ImplementationElement__FlowAssignmentsAssignment_4");
			builder.put(grammarAccess.getImplementationElementAccess().getClassifierAssignmentsAssignment_5(), "rule__ImplementationElement__ClassifierAssignmentsAssignment_5");
			builder.put(grammarAccess.getImplementationElementAccess().getClassifierAssignmentsAssignment_6(), "rule__ImplementationElement__ClassifierAssignmentsAssignment_6");
			builder.put(grammarAccess.getImplementationElementAccess().getOwnedPropertyAssociationsAssignment_7(), "rule__ImplementationElement__OwnedPropertyAssociationsAssignment_7");
			builder.put(grammarAccess.getImplementationElementAccess().getAnnexSubclauseAssignment_8(), "rule__ImplementationElement__AnnexSubclauseAssignment_8");
			builder.put(grammarAccess.getComponentConfigurationAccess().getPrivateAssignment_0(), "rule__ComponentConfiguration__PrivateAssignment_0");
			builder.put(grammarAccess.getComponentConfigurationAccess().getNameAssignment_2(), "rule__ComponentConfiguration__NameAssignment_2");
			builder.put(grammarAccess.getFeatureAccess().getNameAssignment_0(), "rule__Feature__NameAssignment_0");
			builder.put(grammarAccess.getFeatureAccess().getDirectionAssignment_2(), "rule__Feature__DirectionAssignment_2");
			builder.put(grammarAccess.getFeatureAccess().getCategoryAssignment_3(), "rule__Feature__CategoryAssignment_3");
			builder.put(grammarAccess.getFeatureAccess().getTypeReferenceAssignment_4(), "rule__Feature__TypeReferenceAssignment_4");
			builder.put(grammarAccess.getFeatureAccess().getPropagationAssignment_5_0(), "rule__Feature__PropagationAssignment_5_0");
			builder.put(grammarAccess.getFeatureAccess().getPropagationAssignment_5_1(), "rule__Feature__PropagationAssignment_5_1");
			builder.put(grammarAccess.getFeatureAccess().getAnnexElementsAssignment_6(), "rule__Feature__AnnexElementsAssignment_6");
			builder.put(grammarAccess.getComponentAccess().getNameAssignment_0(), "rule__Component__NameAssignment_0");
			builder.put(grammarAccess.getComponentAccess().getCategoryAssignment_2(), "rule__Component__CategoryAssignment_2");
			builder.put(grammarAccess.getComponentAccess().getTypeReferencesAssignment_3(), "rule__Component__TypeReferencesAssignment_3");
			builder.put(grammarAccess.getConnectionAccess().getNameAssignment_0(), "rule__Connection__NameAssignment_0");
			builder.put(grammarAccess.getConnectionAccess().getAssociationTypeAssignment_2(), "rule__Connection__AssociationTypeAssignment_2");
			builder.put(grammarAccess.getConnectionAccess().getSourceAssignment_3(), "rule__Connection__SourceAssignment_3");
			builder.put(grammarAccess.getConnectionAccess().getBidirectionalAssignment_4_1(), "rule__Connection__BidirectionalAssignment_4_1");
			builder.put(grammarAccess.getConnectionAccess().getDestinationAssignment_5(), "rule__Connection__DestinationAssignment_5");
			builder.put(grammarAccess.getBindingAccess().getNameAssignment_0(), "rule__Binding__NameAssignment_0");
			builder.put(grammarAccess.getBindingAccess().getBindingTypeAssignment_2(), "rule__Binding__BindingTypeAssignment_2");
			builder.put(grammarAccess.getBindingAccess().getAssociationTypeAssignment_3(), "rule__Binding__AssociationTypeAssignment_3");
			builder.put(grammarAccess.getBindingAccess().getSourceAssignment_4(), "rule__Binding__SourceAssignment_4");
			builder.put(grammarAccess.getBindingAccess().getDestinationAssignment_6(), "rule__Binding__DestinationAssignment_6");
			builder.put(grammarAccess.getFlowPathAccess().getNameAssignment_0(), "rule__FlowPath__NameAssignment_0");
			builder.put(grammarAccess.getFlowPathAccess().getAssociationTypeAssignment_2(), "rule__FlowPath__AssociationTypeAssignment_2");
			builder.put(grammarAccess.getFlowPathAccess().getSourceAssignment_3(), "rule__FlowPath__SourceAssignment_3");
			builder.put(grammarAccess.getFlowPathAccess().getDestinationAssignment_5(), "rule__FlowPath__DestinationAssignment_5");
			builder.put(grammarAccess.getFlowSourceAccess().getNameAssignment_0(), "rule__FlowSource__NameAssignment_0");
			builder.put(grammarAccess.getFlowSourceAccess().getAssociationTypeAssignment_2(), "rule__FlowSource__AssociationTypeAssignment_2");
			builder.put(grammarAccess.getFlowSourceAccess().getDestinationAssignment_3(), "rule__FlowSource__DestinationAssignment_3");
			builder.put(grammarAccess.getFlowSinkAccess().getNameAssignment_0(), "rule__FlowSink__NameAssignment_0");
			builder.put(grammarAccess.getFlowSinkAccess().getAssociationTypeAssignment_2(), "rule__FlowSink__AssociationTypeAssignment_2");
			builder.put(grammarAccess.getFlowSinkAccess().getSourceAssignment_3(), "rule__FlowSink__SourceAssignment_3");
			builder.put(grammarAccess.getUsePropsAccess().getUsePropertiesAssignment_2(), "rule__UseProps__UsePropertiesAssignment_2");
			builder.put(grammarAccess.getUsePropsAccess().getUsePropertiesAssignment_3_1(), "rule__UseProps__UsePropertiesAssignment_3_1");
			builder.put(grammarAccess.getPropagationsAccess().getDirectionAssignment_1(), "rule__Propagations__DirectionAssignment_1");
			builder.put(grammarAccess.getPropagationsAccess().getPropagatedTypesAssignment_3(), "rule__Propagations__PropagatedTypesAssignment_3");
			builder.put(grammarAccess.getPropagationsAccess().getPropagatedTypesAssignment_4_1(), "rule__Propagations__PropagatedTypesAssignment_4_1");
			builder.put(grammarAccess.getEPropagationsAccess().getDirectionAssignment_2(), "rule__EPropagations__DirectionAssignment_2");
			builder.put(grammarAccess.getEPropagationsAccess().getPropagatedTypesAssignment_3(), "rule__EPropagations__PropagatedTypesAssignment_3");
			builder.put(grammarAccess.getEPropagationsAccess().getPropagatedTypesAssignment_4_1(), "rule__EPropagations__PropagatedTypesAssignment_4_1");
			builder.put(grammarAccess.getPathAccess().getNameAssignment_0(), "rule__Path__NameAssignment_0");
			builder.put(grammarAccess.getPathAccess().getElementsAssignment_3(), "rule__Path__ElementsAssignment_3");
			builder.put(grammarAccess.getPathAccess().getElementsAssignment_4_1(), "rule__Path__ElementsAssignment_4_1");
			builder.put(grammarAccess.getPathElementAccess().getElementAssignment_0(), "rule__PathElement__ElementAssignment_0");
			builder.put(grammarAccess.getPathElementAccess().getElementAssignment_1_0_2(), "rule__PathElement__ElementAssignment_1_0_2");
			builder.put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1_0(), "rule__Import__ImportedNamespaceAssignment_1_0");
			builder.put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1_1(), "rule__Import__ImportedNamespaceAssignment_1_1");
			builder.put(grammarAccess.getImportAccess().getAliasAssignment_2_1(), "rule__Import__AliasAssignment_2_1");
			builder.put(grammarAccess.getClassifierAssignmentAccess().getTargetAssignment_0(), "rule__ClassifierAssignment__TargetAssignment_0");
			builder.put(grammarAccess.getClassifierAssignmentAccess().getAssignedClassifiersAssignment_2_0_0(), "rule__ClassifierAssignment__AssignedClassifiersAssignment_2_0_0");
			builder.put(grammarAccess.getClassifierAssignmentAccess().getAssignedClassifiersAssignment_2_0_1_1(), "rule__ClassifierAssignment__AssignedClassifiersAssignment_2_0_1_1");
			builder.put(grammarAccess.getClassifierAssignmentPatternAccess().getAssignedClassifiersAssignment_2_0_0(), "rule__ClassifierAssignmentPattern__AssignedClassifiersAssignment_2_0_0");
			builder.put(grammarAccess.getClassifierAssignmentPatternAccess().getAssignedClassifiersAssignment_2_0_1_1(), "rule__ClassifierAssignmentPattern__AssignedClassifiersAssignment_2_0_1_1");
			builder.put(grammarAccess.getQueryExpressionAccess().getTargetPatternAssignment_2(), "rule__QueryExpression__TargetPatternAssignment_2");
			builder.put(grammarAccess.getFlowAssignmentAccess().getTargetAssignment_0(), "rule__FlowAssignment__TargetAssignment_0");
			builder.put(grammarAccess.getFlowAssignmentAccess().getElementsAssignment_3(), "rule__FlowAssignment__ElementsAssignment_3");
			builder.put(grammarAccess.getFlowAssignmentAccess().getElementsAssignment_4_1(), "rule__FlowAssignment__ElementsAssignment_4_1");
			builder.put(grammarAccess.getConfigurationElementAccess().getOwnedPropertyAssociationsAssignment_0(), "rule__ConfigurationElement__OwnedPropertyAssociationsAssignment_0");
			builder.put(grammarAccess.getConfigurationElementAccess().getBindingsAssignment_1(), "rule__ConfigurationElement__BindingsAssignment_1");
			builder.put(grammarAccess.getConfigurationElementAccess().getClassifierAssignmentsAssignment_2(), "rule__ConfigurationElement__ClassifierAssignmentsAssignment_2");
			builder.put(grammarAccess.getConfigurationElementAccess().getClassifierAssignmentsAssignment_3(), "rule__ConfigurationElement__ClassifierAssignmentsAssignment_3");
			builder.put(grammarAccess.getConfigurationElementAccess().getAnnexSubclauseAssignment_4(), "rule__ConfigurationElement__AnnexSubclauseAssignment_4");
			builder.put(grammarAccess.getParametersAccess().getParameterizedAssignment_0(), "rule__Parameters__ParameterizedAssignment_0");
			builder.put(grammarAccess.getParametersAccess().getParametersAssignment_1_0(), "rule__Parameters__ParametersAssignment_1_0");
			builder.put(grammarAccess.getParametersAccess().getParametersAssignment_1_1_1(), "rule__Parameters__ParametersAssignment_1_1_1");
			builder.put(grammarAccess.getConfigurationParameterAccess().getNameAssignment_0(), "rule__ConfigurationParameter__NameAssignment_0");
			builder.put(grammarAccess.getConfigurationParameterAccess().getTypeAssignment_2(), "rule__ConfigurationParameter__TypeAssignment_2");
			builder.put(grammarAccess.getReversableInterfaceReferenceAccess().getReverseAssignment_0(), "rule__ReversableInterfaceReference__ReverseAssignment_0");
			builder.put(grammarAccess.getReversableInterfaceReferenceAccess().getTypeAssignment_1(), "rule__ReversableInterfaceReference__TypeAssignment_1");
			builder.put(grammarAccess.getReversableTypeReferenceAccess().getReverseAssignment_0(), "rule__ReversableTypeReference__ReverseAssignment_0");
			builder.put(grammarAccess.getReversableTypeReferenceAccess().getTypeAssignment_1(), "rule__ReversableTypeReference__TypeAssignment_1");
			builder.put(grammarAccess.getTypeReferenceAccess().getTypeAssignment_0(), "rule__TypeReference__TypeAssignment_0");
			builder.put(grammarAccess.getRealizationReferenceAccess().getTypeAssignment_0(), "rule__RealizationReference__TypeAssignment_0");
			builder.put(grammarAccess.getImplementationReferenceAccess().getTypeAssignment(), "rule__ImplementationReference__TypeAssignment");
			builder.put(grammarAccess.getAnnexSubclauseAccess().getNameAssignment_1(), "rule__AnnexSubclause__NameAssignment_1");
			builder.put(grammarAccess.getAnnexElementAccess().getNameAssignment_1(), "rule__AnnexElement__NameAssignment_1");
			builder.put(grammarAccess.getPropertiesBlockAccess().getOwnedPropertyAssociationsAssignment_1(), "rule__PropertiesBlock__OwnedPropertyAssociationsAssignment_1");
			builder.put(grammarAccess.getNestedImplementationElementAccess().getFeaturesAssignment_0(), "rule__NestedImplementationElement__FeaturesAssignment_0");
			builder.put(grammarAccess.getNestedImplementationElementAccess().getConnectionsAssignment_1(), "rule__NestedImplementationElement__ConnectionsAssignment_1");
			builder.put(grammarAccess.getNestedImplementationElementAccess().getBindingsAssignment_2(), "rule__NestedImplementationElement__BindingsAssignment_2");
			builder.put(grammarAccess.getNestedImplementationElementAccess().getComponentsAssignment_3(), "rule__NestedImplementationElement__ComponentsAssignment_3");
			builder.put(grammarAccess.getNestedImplementationElementAccess().getOwnedPropertyAssociationsAssignment_4(), "rule__NestedImplementationElement__OwnedPropertyAssociationsAssignment_4");
			builder.put(grammarAccess.getConfigurationExtensionsAccess().getSuperClassifiersAssignment_0(), "rule__ConfigurationExtensions__SuperClassifiersAssignment_0");
			builder.put(grammarAccess.getConfigurationExtensionsAccess().getSuperClassifiersAssignment_1_1(), "rule__ConfigurationExtensions__SuperClassifiersAssignment_1_1");
			builder.put(grammarAccess.getImplementationExtensionsAccess().getSuperClassifiersAssignment_0(), "rule__ImplementationExtensions__SuperClassifiersAssignment_0");
			builder.put(grammarAccess.getImplementationExtensionsAccess().getSuperClassifiersAssignment_1_1(), "rule__ImplementationExtensions__SuperClassifiersAssignment_1_1");
			builder.put(grammarAccess.getInterfaceExtensionsAccess().getSuperClassifiersAssignment_0(), "rule__InterfaceExtensions__SuperClassifiersAssignment_0");
			builder.put(grammarAccess.getInterfaceExtensionsAccess().getSuperClassifiersAssignment_1_1(), "rule__InterfaceExtensions__SuperClassifiersAssignment_1_1");
			builder.put(grammarAccess.getConfigurationActualsAccess().getActualsAssignment_1_0(), "rule__ConfigurationActuals__ActualsAssignment_1_0");
			builder.put(grammarAccess.getConfigurationActualsAccess().getActualsAssignment_1_1_1(), "rule__ConfigurationActuals__ActualsAssignment_1_1_1");
			builder.put(grammarAccess.getConfigurationActualAccess().getParameterAssignment_0(), "rule__ConfigurationActual__ParameterAssignment_0");
			builder.put(grammarAccess.getConfigurationActualAccess().getAssignedClassifiersAssignment_2(), "rule__ConfigurationActual__AssignedClassifiersAssignment_2");
			builder.put(grammarAccess.getConfigurationActualAccess().getAssignedClassifiersAssignment_3_1(), "rule__ConfigurationActual__AssignedClassifiersAssignment_3_1");
			builder.put(grammarAccess.getWorkingsetAccess().getPrivateAssignment_0(), "rule__Workingset__PrivateAssignment_0");
			builder.put(grammarAccess.getWorkingsetAccess().getNameAssignment_2(), "rule__Workingset__NameAssignment_2");
			builder.put(grammarAccess.getWorkingsetAccess().getRootComponentsAssignment_5(), "rule__Workingset__RootComponentsAssignment_5");
			builder.put(grammarAccess.getExprModelAccess().getAnnexAssignment_0_1(), "rule__ExprModel__AnnexAssignment_0_1");
			builder.put(grammarAccess.getExprModelAccess().getAnnexAssignment_1_1(), "rule__ExprModel__AnnexAssignment_1_1");
			builder.put(grammarAccess.getDeclarationsAccess().getDeclsAssignment_0(), "rule__Declarations__DeclsAssignment_0");
			builder.put(grammarAccess.getDeclarationsAccess().getDeclsAssignment_1_1(), "rule__Declarations__DeclsAssignment_1_1");
			builder.put(grammarAccess.getVarDeclAccess().getConstAssignment_0_0(), "rule__VarDecl__ConstAssignment_0_0");
			builder.put(grammarAccess.getVarDeclAccess().getNameAssignment_1(), "rule__VarDecl__NameAssignment_1");
			builder.put(grammarAccess.getVarDeclAccess().getDeclTypeAssignment_2_1(), "rule__VarDecl__DeclTypeAssignment_2_1");
			builder.put(grammarAccess.getVarDeclAccess().getValueAssignment_3_1(), "rule__VarDecl__ValueAssignment_3_1");
			builder.put(grammarAccess.getFunDeclAccess().getNameAssignment_1(), "rule__FunDecl__NameAssignment_1");
			builder.put(grammarAccess.getFunDeclAccess().getResultTypeAssignment_6(), "rule__FunDecl__ResultTypeAssignment_6");
			builder.put(grammarAccess.getFunDeclAccess().getJavaAssignment_7_1_0_0(), "rule__FunDecl__JavaAssignment_7_1_0_0");
			builder.put(grammarAccess.getFunDeclAccess().getFqnAssignment_7_1_0_2(), "rule__FunDecl__FqnAssignment_7_1_0_2");
			builder.put(grammarAccess.getFunDeclAccess().getExpAssignment_7_1_1(), "rule__FunDecl__ExpAssignment_7_1_1");
			builder.put(grammarAccess.getArgsAccess().getArgsAssignment_0(), "rule__Args__ArgsAssignment_0");
			builder.put(grammarAccess.getArgsAccess().getArgsAssignment_1_1(), "rule__Args__ArgsAssignment_1_1");
			builder.put(grammarAccess.getArgumentAccess().getNameAssignment_1(), "rule__Argument__NameAssignment_1");
			builder.put(grammarAccess.getArgumentAccess().getTypeAssignment_3(), "rule__Argument__TypeAssignment_3");
			builder.put(grammarAccess.getAssertionAccess().getNameAssignment_1(), "rule__Assertion__NameAssignment_1");
			builder.put(grammarAccess.getAssertionAccess().getAssertAssignment_3(), "rule__Assertion__AssertAssignment_3");
			builder.put(grammarAccess.getRangeTypeAccess().getTypeAssignment_2(), "rule__RangeType__TypeAssignment_2");
			builder.put(grammarAccess.getCategoryAccess().getCategoryAssignment(), "rule__Category__CategoryAssignment");
			builder.put(grammarAccess.getMetaClassAccess().getClassAssignment(), "rule__MetaClass__ClassAssignment");
			builder.put(grammarAccess.getRecordTypeAccess().getFieldsAssignment_3_0(), "rule__RecordType__FieldsAssignment_3_0");
			builder.put(grammarAccess.getRecordTypeAccess().getFieldsAssignment_3_1_1(), "rule__RecordType__FieldsAssignment_3_1_1");
			builder.put(grammarAccess.getFieldAccess().getNameAssignment_1(), "rule__Field__NameAssignment_1");
			builder.put(grammarAccess.getFieldAccess().getTypeAssignment_3(), "rule__Field__TypeAssignment_3");
			builder.put(grammarAccess.getUnionTypeAccess().getFieldsAssignment_3_0(), "rule__UnionType__FieldsAssignment_3_0");
			builder.put(grammarAccess.getUnionTypeAccess().getFieldsAssignment_3_1_1(), "rule__UnionType__FieldsAssignment_3_1_1");
			builder.put(grammarAccess.getTupleTypeAccess().getFieldsAssignment_3_0(), "rule__TupleType__FieldsAssignment_3_0");
			builder.put(grammarAccess.getTupleTypeAccess().getFieldsAssignment_3_1_1(), "rule__TupleType__FieldsAssignment_3_1_1");
			builder.put(grammarAccess.getTupleFieldAccess().getTypeAssignment(), "rule__TupleField__TypeAssignment");
			builder.put(grammarAccess.getListTypeAccess().getTypeAssignment_2(), "rule__ListType__TypeAssignment_2");
			builder.put(grammarAccess.getSetTypeAccess().getTypeAssignment_2(), "rule__SetType__TypeAssignment_2");
			builder.put(grammarAccess.getBagTypeAccess().getTypeAssignment_2(), "rule__BagType__TypeAssignment_2");
			builder.put(grammarAccess.getMapTypeAccess().getDomainAssignment_1(), "rule__MapType__DomainAssignment_1");
			builder.put(grammarAccess.getMapTypeAccess().getImageAssignment_3(), "rule__MapType__ImageAssignment_3");
			builder.put(grammarAccess.getEnumTypeAccess().getLiteralsAssignment_3_0(), "rule__EnumType__LiteralsAssignment_3_0");
			builder.put(grammarAccess.getEnumTypeAccess().getLiteralsAssignment_3_1_1(), "rule__EnumType__LiteralsAssignment_3_1_1");
			builder.put(grammarAccess.getEnumLiteralAccess().getNameAssignment(), "rule__EnumLiteral__NameAssignment");
			builder.put(grammarAccess.getTypeRefAccess().getRefAssignment(), "rule__TypeRef__RefAssignment");
			builder.put(grammarAccess.getBlockExpressionAccess().getDeclsAssignment_2_0(), "rule__BlockExpression__DeclsAssignment_2_0");
			builder.put(grammarAccess.getBlockExpressionAccess().getResultAssignment_3(), "rule__BlockExpression__ResultAssignment_3");
			builder.put(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_0_0_1(), "rule__OrExpression__OperatorAssignment_1_0_0_1");
			builder.put(grammarAccess.getOrExpressionAccess().getRightAssignment_1_1(), "rule__OrExpression__RightAssignment_1_1");
			builder.put(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_0_0_1(), "rule__AndExpression__OperatorAssignment_1_0_0_1");
			builder.put(grammarAccess.getAndExpressionAccess().getRightAssignment_1_1(), "rule__AndExpression__RightAssignment_1_1");
			builder.put(grammarAccess.getEqualityExpressionAccess().getOperatorAssignment_1_0_0_1(), "rule__EqualityExpression__OperatorAssignment_1_0_0_1");
			builder.put(grammarAccess.getEqualityExpressionAccess().getRightAssignment_1_1(), "rule__EqualityExpression__RightAssignment_1_1");
			builder.put(grammarAccess.getRelationalExpressionAccess().getOperatorAssignment_1_0_0_1(), "rule__RelationalExpression__OperatorAssignment_1_0_0_1");
			builder.put(grammarAccess.getRelationalExpressionAccess().getRightAssignment_1_1(), "rule__RelationalExpression__RightAssignment_1_1");
			builder.put(grammarAccess.getAdditiveExpressionAccess().getOperatorAssignment_1_0_0_1(), "rule__AdditiveExpression__OperatorAssignment_1_0_0_1");
			builder.put(grammarAccess.getAdditiveExpressionAccess().getRightAssignment_1_1(), "rule__AdditiveExpression__RightAssignment_1_1");
			builder.put(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAssignment_1_0_0_1(), "rule__MultiplicativeExpression__OperatorAssignment_1_0_0_1");
			builder.put(grammarAccess.getMultiplicativeExpressionAccess().getRightAssignment_1_1(), "rule__MultiplicativeExpression__RightAssignment_1_1");
			builder.put(grammarAccess.getUnaryOperationAccess().getOperatorAssignment_0_1(), "rule__UnaryOperation__OperatorAssignment_0_1");
			builder.put(grammarAccess.getUnaryOperationAccess().getOperandAssignment_0_2(), "rule__UnaryOperation__OperandAssignment_0_2");
			builder.put(grammarAccess.getUnitExpressionAccess().getConvertAssignment_1_1_0(), "rule__UnitExpression__ConvertAssignment_1_1_0");
			builder.put(grammarAccess.getUnitExpressionAccess().getDropAssignment_1_1_1(), "rule__UnitExpression__DropAssignment_1_1_1");
			builder.put(grammarAccess.getUnitExpressionAccess().getUnitAssignment_1_2(), "rule__UnitExpression__UnitAssignment_1_2");
			builder.put(grammarAccess.getPropertyExpressionAccess().getPropertyAssignment_1_1(), "rule__PropertyExpression__PropertyAssignment_1_1");
			builder.put(grammarAccess.getSelectExpressionAccess().getRefAssignment_1_0_2(), "rule__SelectExpression__RefAssignment_1_0_2");
			builder.put(grammarAccess.getSelectExpressionAccess().getArgsAssignment_1_0_3_1_0(), "rule__SelectExpression__ArgsAssignment_1_0_3_1_0");
			builder.put(grammarAccess.getSelectExpressionAccess().getArgsAssignment_1_0_3_1_1_1(), "rule__SelectExpression__ArgsAssignment_1_0_3_1_1_1");
			builder.put(grammarAccess.getNamedElementRefAccess().getCoreAssignment_0(), "rule__NamedElementRef__CoreAssignment_0");
			builder.put(grammarAccess.getNamedElementRefAccess().getRefAssignment_1(), "rule__NamedElementRef__RefAssignment_1");
			builder.put(grammarAccess.getNamedElementRefAccess().getArgsAssignment_2_1_0(), "rule__NamedElementRef__ArgsAssignment_2_1_0");
			builder.put(grammarAccess.getNamedElementRefAccess().getArgsAssignment_2_1_1_1(), "rule__NamedElementRef__ArgsAssignment_2_1_1_1");
			builder.put(grammarAccess.getRangeExpressionAccess().getMinimumAssignment_2(), "rule__RangeExpression__MinimumAssignment_2");
			builder.put(grammarAccess.getRangeExpressionAccess().getMaximumAssignment_4(), "rule__RangeExpression__MaximumAssignment_4");
			builder.put(grammarAccess.getRangeExpressionAccess().getDeltaAssignment_5_1(), "rule__RangeExpression__DeltaAssignment_5_1");
			builder.put(grammarAccess.getIfExpressionAccess().getIfAssignment_2(), "rule__IfExpression__IfAssignment_2");
			builder.put(grammarAccess.getIfExpressionAccess().getThenAssignment_4(), "rule__IfExpression__ThenAssignment_4");
			builder.put(grammarAccess.getIfExpressionAccess().getElseAssignment_5_1(), "rule__IfExpression__ElseAssignment_5_1");
			builder.put(grammarAccess.getEBooleanLiteralAccess().getValueAssignment_1_0(), "rule__EBooleanLiteral__ValueAssignment_1_0");
			builder.put(grammarAccess.getEIntegerLiteralAccess().getValueAssignment_1(), "rule__EIntegerLiteral__ValueAssignment_1");
			builder.put(grammarAccess.getERealLiteralAccess().getValueAssignment_1(), "rule__ERealLiteral__ValueAssignment_1");
			builder.put(grammarAccess.getEStringLiteralAccess().getValueAssignment_1(), "rule__EStringLiteral__ValueAssignment_1");
			builder.put(grammarAccess.getExpressionListAccess().getElementsAssignment_1_0(), "rule__ExpressionList__ElementsAssignment_1_0");
			builder.put(grammarAccess.getExpressionListAccess().getElementsAssignment_1_1_1(), "rule__ExpressionList__ElementsAssignment_1_1_1");
			builder.put(grammarAccess.getRecordLiteralAccess().getFieldValuesAssignment_3_0(), "rule__RecordLiteral__FieldValuesAssignment_3_0");
			builder.put(grammarAccess.getRecordLiteralAccess().getFieldValuesAssignment_3_1_1(), "rule__RecordLiteral__FieldValuesAssignment_3_1_1");
			builder.put(grammarAccess.getFieldValueAccess().getNameAssignment_0(), "rule__FieldValue__NameAssignment_0");
			builder.put(grammarAccess.getFieldValueAccess().getValueAssignment_2(), "rule__FieldValue__ValueAssignment_2");
			builder.put(grammarAccess.getUnionLiteralAccess().getFieldValueAssignment_3(), "rule__UnionLiteral__FieldValueAssignment_3");
			builder.put(grammarAccess.getUnitsTypeAccess().getOwnedLiteralAssignment_3(), "rule__UnitsType__OwnedLiteralAssignment_3");
			builder.put(grammarAccess.getUnitsTypeAccess().getOwnedLiteralAssignment_4_1(), "rule__UnitsType__OwnedLiteralAssignment_4_1");
			builder.put(grammarAccess.getUnitLiteralAccess().getNameAssignment(), "rule__UnitLiteral__NameAssignment");
			builder.put(grammarAccess.getUnitLiteralConversionAccess().getNameAssignment_0(), "rule__UnitLiteralConversion__NameAssignment_0");
			builder.put(grammarAccess.getUnitLiteralConversionAccess().getBaseUnitAssignment_2(), "rule__UnitLiteralConversion__BaseUnitAssignment_2");
			builder.put(grammarAccess.getUnitLiteralConversionAccess().getFactorAssignment_4(), "rule__UnitLiteralConversion__FactorAssignment_4");
			builder.put(grammarAccess.getTypeDeclAccess().getNameAssignment_1(), "rule__TypeDecl__NameAssignment_1");
			builder.put(grammarAccess.getTypeDeclAccess().getTypeAssignment_3(), "rule__TypeDecl__TypeAssignment_3");
			builder.put(grammarAccess.getTypeDeclAccess().getOwnedPropertyAssociationsAssignment_4_1(), "rule__TypeDecl__OwnedPropertyAssociationsAssignment_4_1");
			builder.put(grammarAccess.getTypeDeclAccess().getOwnedPropertyAssociationsAssignment_4_2_1(), "rule__TypeDecl__OwnedPropertyAssociationsAssignment_4_2_1");
			builder.put(grammarAccess.getPropertyAssociationAccess().getTargetAssignment_0(), "rule__PropertyAssociation__TargetAssignment_0");
			builder.put(grammarAccess.getPropertyAssociationAccess().getPropertyAssignment_2(), "rule__PropertyAssociation__PropertyAssignment_2");
			builder.put(grammarAccess.getPropertyAssociationAccess().getPropertyAssociationTypeAssignment_3(), "rule__PropertyAssociation__PropertyAssociationTypeAssignment_3");
			builder.put(grammarAccess.getPropertyAssociationAccess().getValueAssignment_4(), "rule__PropertyAssociation__ValueAssignment_4");
			builder.put(grammarAccess.getModelElementReferenceAccess().getElementAssignment_0(), "rule__ModelElementReference__ElementAssignment_0");
			builder.put(grammarAccess.getModelElementReferenceAccess().getElementAssignment_1_0_2(), "rule__ModelElementReference__ElementAssignment_1_0_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private AadlV3GrammarAccess grammarAccess;

	@Override
	protected InternalAadlV3Parser createParser() {
		InternalAadlV3Parser result = new InternalAadlV3Parser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public AadlV3GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AadlV3GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
