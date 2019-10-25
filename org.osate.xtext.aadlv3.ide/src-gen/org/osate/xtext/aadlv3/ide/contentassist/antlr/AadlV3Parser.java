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
			builder.put(grammarAccess.getPropertyAssociationTypeAccess().getAlternatives(), "rule__PropertyAssociationType__Alternatives");
			builder.put(grammarAccess.getInterfaceElementAccess().getAlternatives(), "rule__InterfaceElement__Alternatives");
			builder.put(grammarAccess.getImplementationElementAccess().getAlternatives(), "rule__ImplementationElement__Alternatives");
			builder.put(grammarAccess.getConnectionAccess().getAlternatives_4(), "rule__Connection__Alternatives_4");
			builder.put(grammarAccess.getImportAccess().getAlternatives_1(), "rule__Import__Alternatives_1");
			builder.put(grammarAccess.getClassifierAssignmentAccess().getAlternatives_2(), "rule__ClassifierAssignment__Alternatives_2");
			builder.put(grammarAccess.getClassifierAssignmentPatternAccess().getAlternatives_2(), "rule__ClassifierAssignmentPattern__Alternatives_2");
			builder.put(grammarAccess.getConfigurationElementAccess().getAlternatives(), "rule__ConfigurationElement__Alternatives");
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getAnnexSubclauseAccess().getAlternatives(), "rule__AnnexSubclause__Alternatives");
			builder.put(grammarAccess.getNestedImplementationElementAccess().getAlternatives(), "rule__NestedImplementationElement__Alternatives");
			builder.put(grammarAccess.getBehaviorSpecificationElementAccess().getAlternatives(), "rule__BehaviorSpecificationElement__Alternatives");
			builder.put(grammarAccess.getEventAccess().getTypeAlternatives_2_0(), "rule__Event__TypeAlternatives_2_0");
			builder.put(grammarAccess.getBehaviorRuleAccess().getAlternatives_2(), "rule__BehaviorRule__Alternatives_2");
			builder.put(grammarAccess.getStateTransitionRuleAccess().getConditionAlternatives_2_0(), "rule__StateTransitionRule__ConditionAlternatives_2_0");
			builder.put(grammarAccess.getStateTransitionRuleAccess().getAlternatives_4(), "rule__StateTransitionRule__Alternatives_4");
			builder.put(grammarAccess.getStatelessRuleAccess().getConditionAlternatives_0_0(), "rule__StatelessRule__ConditionAlternatives_0_0");
			builder.put(grammarAccess.getStatelessRuleAccess().getAlternatives_2(), "rule__StatelessRule__Alternatives_2");
			builder.put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
			builder.put(grammarAccess.getBooleanLiteralAccess().getAlternatives_1(), "rule__BooleanLiteral__Alternatives_1");
			builder.put(grammarAccess.getComponentCategoryAccess().getAlternatives(), "rule__ComponentCategory__Alternatives");
			builder.put(grammarAccess.getFeatureCategoryAccess().getAlternatives(), "rule__FeatureCategory__Alternatives");
			builder.put(grammarAccess.getFeatureDirectionAccess().getAlternatives(), "rule__FeatureDirection__Alternatives");
			builder.put(grammarAccess.getPropagationDirectionAccess().getAlternatives(), "rule__PropagationDirection__Alternatives");
			builder.put(grammarAccess.getCompositeAccess().getAlternatives(), "rule__Composite__Alternatives");
			builder.put(grammarAccess.getPrimitiveAccess().getAlternatives(), "rule__Primitive__Alternatives");
			builder.put(grammarAccess.getEOperationAccess().getAlternatives(), "rule__EOperation__Alternatives");
			builder.put(grammarAccess.getCOperationAccess().getAlternatives(), "rule__COperation__Alternatives");
			builder.put(grammarAccess.getAssociationTypeAccess().getAlternatives(), "rule__AssociationType__Alternatives");
			builder.put(grammarAccess.getPackageDeclarationAccess().getGroup(), "rule__PackageDeclaration__Group__0");
			builder.put(grammarAccess.getAnnexLibraryAccess().getGroup(), "rule__AnnexLibrary__Group__0");
			builder.put(grammarAccess.getPropertyDefinitionAccess().getGroup(), "rule__PropertyDefinition__Group__0");
			builder.put(grammarAccess.getPropertyDefinitionAccess().getGroup_5(), "rule__PropertyDefinition__Group_5__0");
			builder.put(grammarAccess.getPropertyDefinitionAccess().getGroup_5_2_1(), "rule__PropertyDefinition__Group_5_2_1__0");
			builder.put(grammarAccess.getPropertyDefinitionAccess().getGroup_5_2_1_1(), "rule__PropertyDefinition__Group_5_2_1_1__0");
			builder.put(grammarAccess.getPropertySetAccess().getGroup(), "rule__PropertySet__Group__0");
			builder.put(grammarAccess.getPropertySetAccess().getGroup_6(), "rule__PropertySet__Group_6__0");
			builder.put(grammarAccess.getTypeDefAccess().getGroup(), "rule__TypeDef__Group__0");
			builder.put(grammarAccess.getTypeDefAccess().getGroup_3(), "rule__TypeDef__Group_3__0");
			builder.put(grammarAccess.getTypeDefAccess().getGroup_4(), "rule__TypeDef__Group_4__0");
			builder.put(grammarAccess.getConstantDefAccess().getGroup(), "rule__ConstantDef__Group__0");
			builder.put(grammarAccess.getPropertyAssociationAccess().getGroup(), "rule__PropertyAssociation__Group__0");
			builder.put(grammarAccess.getModelElementReferenceAccess().getGroup(), "rule__ModelElementReference__Group__0");
			builder.put(grammarAccess.getModelElementReferenceAccess().getGroup_1(), "rule__ModelElementReference__Group_1__0");
			builder.put(grammarAccess.getModelElementReferenceAccess().getGroup_1_0(), "rule__ModelElementReference__Group_1_0__0");
			builder.put(grammarAccess.getNamedElementReferenceAccess().getGroup(), "rule__NamedElementReference__Group__0");
			builder.put(grammarAccess.getNamedElementReferenceAccess().getGroup_1(), "rule__NamedElementReference__Group_1__0");
			builder.put(grammarAccess.getNamedElementReferenceAccess().getGroup_1_0(), "rule__NamedElementReference__Group_1_0__0");
			builder.put(grammarAccess.getComponentInterfaceAccess().getGroup(), "rule__ComponentInterface__Group__0");
			builder.put(grammarAccess.getComponentInterfaceAccess().getGroup_4(), "rule__ComponentInterface__Group_4__0");
			builder.put(grammarAccess.getInterfaceBodyAccess().getGroup(), "rule__InterfaceBody__Group__0");
			builder.put(grammarAccess.getComponentImplementationAccess().getGroup(), "rule__ComponentImplementation__Group__0");
			builder.put(grammarAccess.getComponentImplementationAccess().getGroup_3(), "rule__ComponentImplementation__Group_3__0");
			builder.put(grammarAccess.getImplementationBodyAccess().getGroup(), "rule__ImplementationBody__Group__0");
			builder.put(grammarAccess.getComponentConfigurationAccess().getGroup(), "rule__ComponentConfiguration__Group__0");
			builder.put(grammarAccess.getComponentConfigurationAccess().getGroup_4(), "rule__ComponentConfiguration__Group_4__0");
			builder.put(grammarAccess.getFeatureAccess().getGroup(), "rule__Feature__Group__0");
			builder.put(grammarAccess.getSubcomponentAccess().getGroup(), "rule__Subcomponent__Group__0");
			builder.put(grammarAccess.getConnectionAccess().getGroup(), "rule__Connection__Group__0");
			builder.put(grammarAccess.getBindingAccess().getGroup(), "rule__Binding__Group__0");
			builder.put(grammarAccess.getFlowPathAccess().getGroup(), "rule__FlowPath__Group__0");
			builder.put(grammarAccess.getFlowSourceAccess().getGroup(), "rule__FlowSource__Group__0");
			builder.put(grammarAccess.getFlowSinkAccess().getGroup(), "rule__FlowSink__Group__0");
			builder.put(grammarAccess.getUsePropsAccess().getGroup(), "rule__UseProps__Group__0");
			builder.put(grammarAccess.getUsePropsAccess().getGroup_3(), "rule__UseProps__Group_3__0");
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
			builder.put(grammarAccess.getClassifierOrTypeReferenceAccess().getGroup(), "rule__ClassifierOrTypeReference__Group__0");
			builder.put(grammarAccess.getEnumerationTypeAccess().getGroup(), "rule__EnumerationType__Group__0");
			builder.put(grammarAccess.getCompositeTypeAccess().getGroup(), "rule__CompositeType__Group__0");
			builder.put(grammarAccess.getRealizationReferenceAccess().getGroup(), "rule__RealizationReference__Group__0");
			builder.put(grammarAccess.getDefaultAnnexSubclauseAccess().getGroup(), "rule__DefaultAnnexSubclause__Group__0");
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
			builder.put(grammarAccess.getInstanceConfigurationAccess().getGroup(), "rule__InstanceConfiguration__Group__0");
			builder.put(grammarAccess.getProductLineConstraintAccess().getGroup(), "rule__ProductLineConstraint__Group__0");
			builder.put(grammarAccess.getEMSubclauseAccess().getGroup(), "rule__EMSubclause__Group__0");
			builder.put(grammarAccess.getBASubclauseAccess().getGroup(), "rule__BASubclause__Group__0");
			builder.put(grammarAccess.getBehaviorSpecificationBlockAccess().getGroup(), "rule__BehaviorSpecificationBlock__Group__0");
			builder.put(grammarAccess.getBehaviorSpecificationBlockAccess().getGroup_0(), "rule__BehaviorSpecificationBlock__Group_0__0");
			builder.put(grammarAccess.getEventAccess().getGroup(), "rule__Event__Group__0");
			builder.put(grammarAccess.getBehaviorRuleAccess().getGroup(), "rule__BehaviorRule__Group__0");
			builder.put(grammarAccess.getAssignmentAccess().getGroup(), "rule__Assignment__Group__0");
			builder.put(grammarAccess.getAssignmentAccess().getGroup_1(), "rule__Assignment__Group_1__0");
			builder.put(grammarAccess.getStateTransitionRuleAccess().getGroup(), "rule__StateTransitionRule__Group__0");
			builder.put(grammarAccess.getStateTransitionRuleAccess().getGroup_4_1(), "rule__StateTransitionRule__Group_4_1__0");
			builder.put(grammarAccess.getStateTransitionRuleAccess().getGroup_4_1_1(), "rule__StateTransitionRule__Group_4_1_1__0");
			builder.put(grammarAccess.getStatelessRuleAccess().getGroup(), "rule__StatelessRule__Group__0");
			builder.put(grammarAccess.getContainsTokenAccess().getGroup(), "rule__ContainsToken__Group__0");
			builder.put(grammarAccess.getFeatureInputAccess().getGroup(), "rule__FeatureInput__Group__0");
			builder.put(grammarAccess.getPropertyReferenceAccess().getGroup(), "rule__PropertyReference__Group__0");
			builder.put(grammarAccess.getIntegerLiteralAccess().getGroup(), "rule__IntegerLiteral__Group__0");
			builder.put(grammarAccess.getRealLiteralAccess().getGroup(), "rule__RealLiteral__Group__0");
			builder.put(grammarAccess.getStringLiteralAccess().getGroup(), "rule__StringLiteral__Group__0");
			builder.put(grammarAccess.getEnumerationLiteralAccess().getGroup(), "rule__EnumerationLiteral__Group__0");
			builder.put(grammarAccess.getBooleanLiteralAccess().getGroup(), "rule__BooleanLiteral__Group__0");
			builder.put(grammarAccess.getListLiteralAccess().getGroup(), "rule__ListLiteral__Group__0");
			builder.put(grammarAccess.getListLiteralAccess().getGroup_2(), "rule__ListLiteral__Group_2__0");
			builder.put(grammarAccess.getListLiteralAccess().getGroup_2_1(), "rule__ListLiteral__Group_2_1__0");
			builder.put(grammarAccess.getDirectionalLiteralAccess().getGroup(), "rule__DirectionalLiteral__Group__0");
			builder.put(grammarAccess.getMultiLiteralOperationAccess().getGroup(), "rule__MultiLiteralOperation__Group__0");
			builder.put(grammarAccess.getMultiLiteralOperationAccess().getGroup_3(), "rule__MultiLiteralOperation__Group_3__0");
			builder.put(grammarAccess.getMultiLiteralOperationAccess().getGroup_3_1(), "rule__MultiLiteralOperation__Group_3_1__0");
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
			builder.put(grammarAccess.getTypeDefAccess().getPrivateAssignment_0(), "rule__TypeDef__PrivateAssignment_0");
			builder.put(grammarAccess.getTypeDefAccess().getNameAssignment_2(), "rule__TypeDef__NameAssignment_2");
			builder.put(grammarAccess.getTypeDefAccess().getSuperTypeAssignment_3_1(), "rule__TypeDef__SuperTypeAssignment_3_1");
			builder.put(grammarAccess.getTypeDefAccess().getBaseTypeAssignment_4_1(), "rule__TypeDef__BaseTypeAssignment_4_1");
			builder.put(grammarAccess.getConstantDefAccess().getPrivateAssignment_0(), "rule__ConstantDef__PrivateAssignment_0");
			builder.put(grammarAccess.getConstantDefAccess().getNameAssignment_2(), "rule__ConstantDef__NameAssignment_2");
			builder.put(grammarAccess.getConstantDefAccess().getValueAssignment_4(), "rule__ConstantDef__ValueAssignment_4");
			builder.put(grammarAccess.getPropertyAssociationAccess().getTargetAssignment_0(), "rule__PropertyAssociation__TargetAssignment_0");
			builder.put(grammarAccess.getPropertyAssociationAccess().getPropertyAssignment_2(), "rule__PropertyAssociation__PropertyAssignment_2");
			builder.put(grammarAccess.getPropertyAssociationAccess().getPropertyAssociationTypeAssignment_3(), "rule__PropertyAssociation__PropertyAssociationTypeAssignment_3");
			builder.put(grammarAccess.getPropertyAssociationAccess().getValueAssignment_4(), "rule__PropertyAssociation__ValueAssignment_4");
			builder.put(grammarAccess.getModelElementReferenceAccess().getElementAssignment_0(), "rule__ModelElementReference__ElementAssignment_0");
			builder.put(grammarAccess.getModelElementReferenceAccess().getElementAssignment_1_0_2(), "rule__ModelElementReference__ElementAssignment_1_0_2");
			builder.put(grammarAccess.getNamedElementReferenceAccess().getElementAssignment_0(), "rule__NamedElementReference__ElementAssignment_0");
			builder.put(grammarAccess.getNamedElementReferenceAccess().getElementAssignment_1_0_2(), "rule__NamedElementReference__ElementAssignment_1_0_2");
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
			builder.put(grammarAccess.getSubcomponentAccess().getNameAssignment_1(), "rule__Subcomponent__NameAssignment_1");
			builder.put(grammarAccess.getSubcomponentAccess().getCategoryAssignment_3(), "rule__Subcomponent__CategoryAssignment_3");
			builder.put(grammarAccess.getSubcomponentAccess().getTypeReferencesAssignment_4(), "rule__Subcomponent__TypeReferencesAssignment_4");
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
			builder.put(grammarAccess.getClassifierOrTypeReferenceAccess().getTypeAssignment_0(), "rule__ClassifierOrTypeReference__TypeAssignment_0");
			builder.put(grammarAccess.getTypeReferenceAccess().getTypeAssignment(), "rule__TypeReference__TypeAssignment");
			builder.put(grammarAccess.getEnumerationTypeAccess().getLiteralsAssignment_3(), "rule__EnumerationType__LiteralsAssignment_3");
			builder.put(grammarAccess.getCompositeTypeAccess().getCompositeTypeAssignment_0(), "rule__CompositeType__CompositeTypeAssignment_0");
			builder.put(grammarAccess.getCompositeTypeAccess().getTypeAssignment_2(), "rule__CompositeType__TypeAssignment_2");
			builder.put(grammarAccess.getPrimitiveTypeAccess().getPrimitiveTypeAssignment(), "rule__PrimitiveType__PrimitiveTypeAssignment");
			builder.put(grammarAccess.getRealizationReferenceAccess().getTypeAssignment_0(), "rule__RealizationReference__TypeAssignment_0");
			builder.put(grammarAccess.getImplementationReferenceAccess().getTypeAssignment(), "rule__ImplementationReference__TypeAssignment");
			builder.put(grammarAccess.getDefaultAnnexSubclauseAccess().getNameAssignment_1(), "rule__DefaultAnnexSubclause__NameAssignment_1");
			builder.put(grammarAccess.getDefaultAnnexSubclauseAccess().getBodyAssignment_2(), "rule__DefaultAnnexSubclause__BodyAssignment_2");
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
			builder.put(grammarAccess.getWorkingsetAccess().getInstanceRootsAssignment_5(), "rule__Workingset__InstanceRootsAssignment_5");
			builder.put(grammarAccess.getInstanceConfigurationAccess().getNameAssignment_1(), "rule__InstanceConfiguration__NameAssignment_1");
			builder.put(grammarAccess.getInstanceConfigurationAccess().getCategoryAssignment_3(), "rule__InstanceConfiguration__CategoryAssignment_3");
			builder.put(grammarAccess.getInstanceConfigurationAccess().getTypeReferencesAssignment_4(), "rule__InstanceConfiguration__TypeReferencesAssignment_4");
			builder.put(grammarAccess.getInstanceConfigurationAccess().getActionsAssignment_5(), "rule__InstanceConfiguration__ActionsAssignment_5");
			builder.put(grammarAccess.getInstanceConfigurationAccess().getProductlineConstraintAssignment_6(), "rule__InstanceConfiguration__ProductlineConstraintAssignment_6");
			builder.put(grammarAccess.getProductLineConstraintAccess().getElementAssignment_2(), "rule__ProductLineConstraint__ElementAssignment_2");
			builder.put(grammarAccess.getProductLineConstraintAccess().getOperatorAssignment_3(), "rule__ProductLineConstraint__OperatorAssignment_3");
			builder.put(grammarAccess.getProductLineConstraintAccess().getConstraintAssignment_4(), "rule__ProductLineConstraint__ConstraintAssignment_4");
			builder.put(grammarAccess.getEMSubclauseAccess().getNameAssignment_1(), "rule__EMSubclause__NameAssignment_1");
			builder.put(grammarAccess.getBASubclauseAccess().getNameAssignment_1(), "rule__BASubclause__NameAssignment_1");
			builder.put(grammarAccess.getBehaviorSpecificationBlockAccess().getStatesAssignment_0_1(), "rule__BehaviorSpecificationBlock__StatesAssignment_0_1");
			builder.put(grammarAccess.getBehaviorSpecificationElementAccess().getGeneratorsAssignment_0(), "rule__BehaviorSpecificationElement__GeneratorsAssignment_0");
			builder.put(grammarAccess.getBehaviorSpecificationElementAccess().getRulesAssignment_1(), "rule__BehaviorSpecificationElement__RulesAssignment_1");
			builder.put(grammarAccess.getEventAccess().getNameAssignment_0(), "rule__Event__NameAssignment_0");
			builder.put(grammarAccess.getEventAccess().getTypeAssignment_2(), "rule__Event__TypeAssignment_2");
			builder.put(grammarAccess.getEventAccess().getValueAssignment_4(), "rule__Event__ValueAssignment_4");
			builder.put(grammarAccess.getBehaviorRuleAccess().getNameAssignment_0(), "rule__BehaviorRule__NameAssignment_0");
			builder.put(grammarAccess.getAssignmentAccess().getTargetAssignment_0(), "rule__Assignment__TargetAssignment_0");
			builder.put(grammarAccess.getAssignmentAccess().getValueAssignment_1_1(), "rule__Assignment__ValueAssignment_1_1");
			builder.put(grammarAccess.getCurrentStateAccess().getCurrentStateAssignment(), "rule__CurrentState__CurrentStateAssignment");
			builder.put(grammarAccess.getStateTransitionRuleAccess().getCurrentStateAssignment_0(), "rule__StateTransitionRule__CurrentStateAssignment_0");
			builder.put(grammarAccess.getStateTransitionRuleAccess().getConditionAssignment_2(), "rule__StateTransitionRule__ConditionAssignment_2");
			builder.put(grammarAccess.getStateTransitionRuleAccess().getSinkAssignment_4_0(), "rule__StateTransitionRule__SinkAssignment_4_0");
			builder.put(grammarAccess.getStateTransitionRuleAccess().getTargetStateAssignment_4_1_0(), "rule__StateTransitionRule__TargetStateAssignment_4_1_0");
			builder.put(grammarAccess.getStateTransitionRuleAccess().getActionsAssignment_4_1_1_1(), "rule__StateTransitionRule__ActionsAssignment_4_1_1_1");
			builder.put(grammarAccess.getStatelessRuleAccess().getConditionAssignment_0(), "rule__StatelessRule__ConditionAssignment_0");
			builder.put(grammarAccess.getStatelessRuleAccess().getSinkAssignment_2_0(), "rule__StatelessRule__SinkAssignment_2_0");
			builder.put(grammarAccess.getStatelessRuleAccess().getActionsAssignment_2_1(), "rule__StatelessRule__ActionsAssignment_2_1");
			builder.put(grammarAccess.getContainsTokenAccess().getElementAssignment_0(), "rule__ContainsToken__ElementAssignment_0");
			builder.put(grammarAccess.getContainsTokenAccess().getOperatorAssignment_1(), "rule__ContainsToken__OperatorAssignment_1");
			builder.put(grammarAccess.getContainsTokenAccess().getConstraintAssignment_2(), "rule__ContainsToken__ConstraintAssignment_2");
			builder.put(grammarAccess.getFeatureInputAccess().getElementAssignment_0(), "rule__FeatureInput__ElementAssignment_0");
			builder.put(grammarAccess.getFeatureInputAccess().getOperatorAssignment_1(), "rule__FeatureInput__OperatorAssignment_1");
			builder.put(grammarAccess.getPackageElementReferenceAccess().getElementAssignment(), "rule__PackageElementReference__ElementAssignment");
			builder.put(grammarAccess.getPropertyReferenceAccess().getElementAssignment_1(), "rule__PropertyReference__ElementAssignment_1");
			builder.put(grammarAccess.getIntegerLiteralAccess().getValueAssignment_1(), "rule__IntegerLiteral__ValueAssignment_1");
			builder.put(grammarAccess.getIntegerLiteralAccess().getUnitAssignment_2(), "rule__IntegerLiteral__UnitAssignment_2");
			builder.put(grammarAccess.getRealLiteralAccess().getValueAssignment_1(), "rule__RealLiteral__ValueAssignment_1");
			builder.put(grammarAccess.getRealLiteralAccess().getUnitAssignment_2(), "rule__RealLiteral__UnitAssignment_2");
			builder.put(grammarAccess.getStringLiteralAccess().getValueAssignment_1(), "rule__StringLiteral__ValueAssignment_1");
			builder.put(grammarAccess.getEnumerationLiteralAccess().getValueAssignment_1(), "rule__EnumerationLiteral__ValueAssignment_1");
			builder.put(grammarAccess.getBooleanLiteralAccess().getValueAssignment_1_0(), "rule__BooleanLiteral__ValueAssignment_1_0");
			builder.put(grammarAccess.getListLiteralAccess().getElementsAssignment_2_0(), "rule__ListLiteral__ElementsAssignment_2_0");
			builder.put(grammarAccess.getListLiteralAccess().getElementsAssignment_2_1_1(), "rule__ListLiteral__ElementsAssignment_2_1_1");
			builder.put(grammarAccess.getDirectionalLiteralAccess().getDirectionAssignment_1(), "rule__DirectionalLiteral__DirectionAssignment_1");
			builder.put(grammarAccess.getDirectionalLiteralAccess().getValueAssignment_2(), "rule__DirectionalLiteral__ValueAssignment_2");
			builder.put(grammarAccess.getMultiLiteralOperationAccess().getOperatorAssignment_1(), "rule__MultiLiteralOperation__OperatorAssignment_1");
			builder.put(grammarAccess.getMultiLiteralOperationAccess().getElementsAssignment_3_0(), "rule__MultiLiteralOperation__ElementsAssignment_3_0");
			builder.put(grammarAccess.getMultiLiteralOperationAccess().getElementsAssignment_3_1_1(), "rule__MultiLiteralOperation__ElementsAssignment_3_1_1");
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
