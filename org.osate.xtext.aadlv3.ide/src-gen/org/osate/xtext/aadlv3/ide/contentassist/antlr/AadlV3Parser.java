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
			builder.put(grammarAccess.getPackageDeclarationAccess().getAlternatives_3(), "rule__PackageDeclaration__Alternatives_3");
			builder.put(grammarAccess.getPackageElementAccess().getAlternatives(), "rule__PackageElement__Alternatives");
			builder.put(grammarAccess.getAppliesToAccess().getAlternatives(), "rule__AppliesTo__Alternatives");
			builder.put(grammarAccess.getInterfaceElementAccess().getAlternatives(), "rule__InterfaceElement__Alternatives");
			builder.put(grammarAccess.getImplementationElementAccess().getAlternatives(), "rule__ImplementationElement__Alternatives");
			builder.put(grammarAccess.getConnectionAccess().getAlternatives_4(), "rule__Connection__Alternatives_4");
			builder.put(grammarAccess.getFeatureDelegateAccess().getAlternatives_4(), "rule__FeatureDelegate__Alternatives_4");
			builder.put(grammarAccess.getImportAccess().getAlternatives_1(), "rule__Import__Alternatives_1");
			builder.put(grammarAccess.getConfigurationAssignmentAccess().getAlternatives_2(), "rule__ConfigurationAssignment__Alternatives_2");
			builder.put(grammarAccess.getConfigurationAssignmentPatternAccess().getAlternatives_2(), "rule__ConfigurationAssignmentPattern__Alternatives_2");
			builder.put(grammarAccess.getConfigurationElementAccess().getAlternatives(), "rule__ConfigurationElement__Alternatives");
			builder.put(grammarAccess.getNestedImplementationElementAccess().getAlternatives(), "rule__NestedImplementationElement__Alternatives");
			builder.put(grammarAccess.getComponentCategoryAccess().getAlternatives(), "rule__ComponentCategory__Alternatives");
			builder.put(grammarAccess.getFeatureCategoryAccess().getAlternatives(), "rule__FeatureCategory__Alternatives");
			builder.put(grammarAccess.getFeatureDirectionAccess().getAlternatives(), "rule__FeatureDirection__Alternatives");
			builder.put(grammarAccess.getAssociationTypeAccess().getAlternatives(), "rule__AssociationType__Alternatives");
			builder.put(grammarAccess.getPropertyAssociationTypeAccess().getAlternatives(), "rule__PropertyAssociationType__Alternatives");
			builder.put(grammarAccess.getPackageDeclarationAccess().getGroup(), "rule__PackageDeclaration__Group__0");
			builder.put(grammarAccess.getPropertyDefinitionAccess().getGroup(), "rule__PropertyDefinition__Group__0");
			builder.put(grammarAccess.getPropertyDefinitionAccess().getGroup_5(), "rule__PropertyDefinition__Group_5__0");
			builder.put(grammarAccess.getPropertyDefinitionAccess().getGroup_5_2(), "rule__PropertyDefinition__Group_5_2__0");
			builder.put(grammarAccess.getPropertySetAccess().getGroup(), "rule__PropertySet__Group__0");
			builder.put(grammarAccess.getPropertySetAccess().getGroup_6(), "rule__PropertySet__Group_6__0");
			builder.put(grammarAccess.getDataTypeAccess().getGroup(), "rule__DataType__Group__0");
			builder.put(grammarAccess.getComponentInterfaceAccess().getGroup(), "rule__ComponentInterface__Group__0");
			builder.put(grammarAccess.getComponentInterfaceAccess().getGroup_4(), "rule__ComponentInterface__Group_4__0");
			builder.put(grammarAccess.getInterfaceBodyAccess().getGroup(), "rule__InterfaceBody__Group__0");
			builder.put(grammarAccess.getInterfaceBodyAccess().getGroup_0(), "rule__InterfaceBody__Group_0__0");
			builder.put(grammarAccess.getInterfaceBodyAccess().getGroup_0_1(), "rule__InterfaceBody__Group_0_1__0");
			builder.put(grammarAccess.getComponentImplementationAccess().getGroup(), "rule__ComponentImplementation__Group__0");
			builder.put(grammarAccess.getComponentImplementationAccess().getGroup_3(), "rule__ComponentImplementation__Group_3__0");
			builder.put(grammarAccess.getImplementationBodyAccess().getGroup(), "rule__ImplementationBody__Group__0");
			builder.put(grammarAccess.getImplementationBodyAccess().getGroup_0(), "rule__ImplementationBody__Group_0__0");
			builder.put(grammarAccess.getImplementationBodyAccess().getGroup_0_1(), "rule__ImplementationBody__Group_0_1__0");
			builder.put(grammarAccess.getComponentConfigurationAccess().getGroup(), "rule__ComponentConfiguration__Group__0");
			builder.put(grammarAccess.getComponentConfigurationAccess().getGroup_4(), "rule__ComponentConfiguration__Group_4__0");
			builder.put(grammarAccess.getFeatureAccess().getGroup(), "rule__Feature__Group__0");
			builder.put(grammarAccess.getComponentAccess().getGroup(), "rule__Component__Group__0");
			builder.put(grammarAccess.getConnectionAccess().getGroup(), "rule__Connection__Group__0");
			builder.put(grammarAccess.getFeatureDelegateAccess().getGroup(), "rule__FeatureDelegate__Group__0");
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
			builder.put(grammarAccess.getConfigurationAssignmentAccess().getGroup(), "rule__ConfigurationAssignment__Group__0");
			builder.put(grammarAccess.getConfigurationAssignmentAccess().getGroup_2_0(), "rule__ConfigurationAssignment__Group_2_0__0");
			builder.put(grammarAccess.getConfigurationAssignmentAccess().getGroup_2_0_1(), "rule__ConfigurationAssignment__Group_2_0_1__0");
			builder.put(grammarAccess.getConfigurationAssignmentPatternAccess().getGroup(), "rule__ConfigurationAssignmentPattern__Group__0");
			builder.put(grammarAccess.getConfigurationAssignmentPatternAccess().getGroup_2_0(), "rule__ConfigurationAssignmentPattern__Group_2_0__0");
			builder.put(grammarAccess.getConfigurationAssignmentPatternAccess().getGroup_2_0_1(), "rule__ConfigurationAssignmentPattern__Group_2_0_1__0");
			builder.put(grammarAccess.getFlowAssignmentAccess().getGroup(), "rule__FlowAssignment__Group__0");
			builder.put(grammarAccess.getFlowAssignmentAccess().getGroup_4(), "rule__FlowAssignment__Group_4__0");
			builder.put(grammarAccess.getPropertyAssociationAccess().getGroup(), "rule__PropertyAssociation__Group__0");
			builder.put(grammarAccess.getPropertyValueAccess().getGroup(), "rule__PropertyValue__Group__0");
			builder.put(grammarAccess.getModelElementReferenceAccess().getGroup(), "rule__ModelElementReference__Group__0");
			builder.put(grammarAccess.getModelElementReferenceAccess().getGroup_1(), "rule__ModelElementReference__Group_1__0");
			builder.put(grammarAccess.getModelElementReferenceAccess().getGroup_1_0(), "rule__ModelElementReference__Group_1_0__0");
			builder.put(grammarAccess.getConfigurationElementBlockAccess().getGroup(), "rule__ConfigurationElementBlock__Group__0");
			builder.put(grammarAccess.getConfigurationElementBlockAccess().getGroup_0(), "rule__ConfigurationElementBlock__Group_0__0");
			builder.put(grammarAccess.getConfigurationElementBlockAccess().getGroup_0_1(), "rule__ConfigurationElementBlock__Group_0_1__0");
			builder.put(grammarAccess.getCurlyConfigurationElementBlockAccess().getGroup(), "rule__CurlyConfigurationElementBlock__Group__0");
			builder.put(grammarAccess.getCurlyConfigurationElementBlockAccess().getGroup_2(), "rule__CurlyConfigurationElementBlock__Group_2__0");
			builder.put(grammarAccess.getParametersAccess().getGroup(), "rule__Parameters__Group__0");
			builder.put(grammarAccess.getParametersAccess().getGroup_1(), "rule__Parameters__Group_1__0");
			builder.put(grammarAccess.getParametersAccess().getGroup_1_1(), "rule__Parameters__Group_1_1__0");
			builder.put(grammarAccess.getConfigurationParameterAccess().getGroup(), "rule__ConfigurationParameter__Group__0");
			builder.put(grammarAccess.getReversableInterfaceReferenceAccess().getGroup(), "rule__ReversableInterfaceReference__Group__0");
			builder.put(grammarAccess.getReversableTypeReferenceAccess().getGroup(), "rule__ReversableTypeReference__Group__0");
			builder.put(grammarAccess.getTypeReferenceAccess().getGroup(), "rule__TypeReference__Group__0");
			builder.put(grammarAccess.getRealizationReferenceAccess().getGroup(), "rule__RealizationReference__Group__0");
			builder.put(grammarAccess.getPropertiesBlockAccess().getGroup(), "rule__PropertiesBlock__Group__0");
			builder.put(grammarAccess.getPropertiesBlockAccess().getGroup_1(), "rule__PropertiesBlock__Group_1__0");
			builder.put(grammarAccess.getNestedComponentImplementationBlockAccess().getGroup(), "rule__NestedComponentImplementationBlock__Group__0");
			builder.put(grammarAccess.getNestedComponentImplementationBlockAccess().getGroup_1(), "rule__NestedComponentImplementationBlock__Group_1__0");
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
			builder.put(grammarAccess.getWorkingsetAccess().getGroup_5(), "rule__Workingset__Group_5__0");
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
			builder.put(grammarAccess.getEndToEndFlowKeywordsAccess().getGroup(), "rule__EndToEndFlowKeywords__Group__0");
			builder.put(grammarAccess.getFlowSourceKeywordsAccess().getGroup(), "rule__FlowSourceKeywords__Group__0");
			builder.put(grammarAccess.getFlowSinkKeywordsAccess().getGroup(), "rule__FlowSinkKeywords__Group__0");
			builder.put(grammarAccess.getFlowPathKeywordsAccess().getGroup(), "rule__FlowPathKeywords__Group__0");
			builder.put(grammarAccess.getInOutKeywordsAccess().getGroup(), "rule__InOutKeywords__Group__0");
			builder.put(grammarAccess.getBusAccessKeywordsAccess().getGroup(), "rule__BusAccessKeywords__Group__0");
			builder.put(grammarAccess.getVirtualBusAccessKeywordsAccess().getGroup(), "rule__VirtualBusAccessKeywords__Group__0");
			builder.put(grammarAccess.getDataAccessKeywordsAccess().getGroup(), "rule__DataAccessKeywords__Group__0");
			builder.put(grammarAccess.getSubprogramAccessKeywordsAccess().getGroup(), "rule__SubprogramAccessKeywords__Group__0");
			builder.put(grammarAccess.getSubprogramGroupAccessKeywordsAccess().getGroup(), "rule__SubprogramGroupAccessKeywords__Group__0");
			builder.put(grammarAccess.getBindingPointKeywordsAccess().getGroup(), "rule__BindingPointKeywords__Group__0");
			builder.put(grammarAccess.getProvidesReadKeywordsAccess().getGroup(), "rule__ProvidesReadKeywords__Group__0");
			builder.put(grammarAccess.getRequiresReadKeywordsAccess().getGroup(), "rule__RequiresReadKeywords__Group__0");
			builder.put(grammarAccess.getProvidesWriteKeywordsAccess().getGroup(), "rule__ProvidesWriteKeywords__Group__0");
			builder.put(grammarAccess.getRequiresWriteKeywordsAccess().getGroup(), "rule__RequiresWriteKeywords__Group__0");
			builder.put(grammarAccess.getProvidesRWKeywordsAccess().getGroup(), "rule__ProvidesRWKeywords__Group__0");
			builder.put(grammarAccess.getRequiresRWKeywordsAccess().getGroup(), "rule__RequiresRWKeywords__Group__0");
			builder.put(grammarAccess.getPackageDeclarationAccess().getPrivateAssignment_0(), "rule__PackageDeclaration__PrivateAssignment_0");
			builder.put(grammarAccess.getPackageDeclarationAccess().getNameAssignment_2(), "rule__PackageDeclaration__NameAssignment_2");
			builder.put(grammarAccess.getPackageDeclarationAccess().getImportsAssignment_3_0(), "rule__PackageDeclaration__ImportsAssignment_3_0");
			builder.put(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_3_1(), "rule__PackageDeclaration__ElementsAssignment_3_1");
			builder.put(grammarAccess.getPropertyDefinitionAccess().getPrivateAssignment_0(), "rule__PropertyDefinition__PrivateAssignment_0");
			builder.put(grammarAccess.getPropertyDefinitionAccess().getNameAssignment_2(), "rule__PropertyDefinition__NameAssignment_2");
			builder.put(grammarAccess.getPropertyDefinitionAccess().getTypeAssignment_4(), "rule__PropertyDefinition__TypeAssignment_4");
			builder.put(grammarAccess.getAppliesToAccess().getComponentCategoriesAssignment_0(), "rule__AppliesTo__ComponentCategoriesAssignment_0");
			builder.put(grammarAccess.getAppliesToAccess().getFeatureCategoriesAssignment_1(), "rule__AppliesTo__FeatureCategoriesAssignment_1");
			builder.put(grammarAccess.getAppliesToAccess().getAssociationTypesAssignment_2(), "rule__AppliesTo__AssociationTypesAssignment_2");
			builder.put(grammarAccess.getPropertySetAccess().getPrivateAssignment_0(), "rule__PropertySet__PrivateAssignment_0");
			builder.put(grammarAccess.getPropertySetAccess().getNameAssignment_2(), "rule__PropertySet__NameAssignment_2");
			builder.put(grammarAccess.getPropertySetAccess().getPropertiesAssignment_5(), "rule__PropertySet__PropertiesAssignment_5");
			builder.put(grammarAccess.getPropertySetAccess().getPropertiesAssignment_6_1(), "rule__PropertySet__PropertiesAssignment_6_1");
			builder.put(grammarAccess.getDataTypeAccess().getPrivateAssignment_0(), "rule__DataType__PrivateAssignment_0");
			builder.put(grammarAccess.getDataTypeAccess().getNameAssignment_2(), "rule__DataType__NameAssignment_2");
			builder.put(grammarAccess.getComponentInterfaceAccess().getPrivateAssignment_0(), "rule__ComponentInterface__PrivateAssignment_0");
			builder.put(grammarAccess.getComponentInterfaceAccess().getCategoryAssignment_1(), "rule__ComponentInterface__CategoryAssignment_1");
			builder.put(grammarAccess.getComponentInterfaceAccess().getNameAssignment_3(), "rule__ComponentInterface__NameAssignment_3");
			builder.put(grammarAccess.getInterfaceElementAccess().getFeaturesAssignment_0(), "rule__InterfaceElement__FeaturesAssignment_0");
			builder.put(grammarAccess.getInterfaceElementAccess().getFlowsAssignment_1(), "rule__InterfaceElement__FlowsAssignment_1");
			builder.put(grammarAccess.getInterfaceElementAccess().getFlowsAssignment_2(), "rule__InterfaceElement__FlowsAssignment_2");
			builder.put(grammarAccess.getInterfaceElementAccess().getFlowsAssignment_3(), "rule__InterfaceElement__FlowsAssignment_3");
			builder.put(grammarAccess.getInterfaceElementAccess().getPropertyAssociationsAssignment_5(), "rule__InterfaceElement__PropertyAssociationsAssignment_5");
			builder.put(grammarAccess.getComponentImplementationAccess().getPrivateAssignment_0(), "rule__ComponentImplementation__PrivateAssignment_0");
			builder.put(grammarAccess.getComponentImplementationAccess().getCategoryAssignment_1(), "rule__ComponentImplementation__CategoryAssignment_1");
			builder.put(grammarAccess.getComponentImplementationAccess().getNameAssignment_2(), "rule__ComponentImplementation__NameAssignment_2");
			builder.put(grammarAccess.getImplementationElementAccess().getConnectionsAssignment_0(), "rule__ImplementationElement__ConnectionsAssignment_0");
			builder.put(grammarAccess.getImplementationElementAccess().getConnectionsAssignment_1(), "rule__ImplementationElement__ConnectionsAssignment_1");
			builder.put(grammarAccess.getImplementationElementAccess().getBindingsAssignment_2(), "rule__ImplementationElement__BindingsAssignment_2");
			builder.put(grammarAccess.getImplementationElementAccess().getComponentsAssignment_3(), "rule__ImplementationElement__ComponentsAssignment_3");
			builder.put(grammarAccess.getImplementationElementAccess().getPathsAssignment_4(), "rule__ImplementationElement__PathsAssignment_4");
			builder.put(grammarAccess.getImplementationElementAccess().getFlowAssignmentsAssignment_5(), "rule__ImplementationElement__FlowAssignmentsAssignment_5");
			builder.put(grammarAccess.getImplementationElementAccess().getConfigurationAssignmentsAssignment_6(), "rule__ImplementationElement__ConfigurationAssignmentsAssignment_6");
			builder.put(grammarAccess.getImplementationElementAccess().getConfigurationAssignmentsAssignment_7(), "rule__ImplementationElement__ConfigurationAssignmentsAssignment_7");
			builder.put(grammarAccess.getImplementationElementAccess().getPropertyAssociationsAssignment_8(), "rule__ImplementationElement__PropertyAssociationsAssignment_8");
			builder.put(grammarAccess.getComponentConfigurationAccess().getPrivateAssignment_0(), "rule__ComponentConfiguration__PrivateAssignment_0");
			builder.put(grammarAccess.getComponentConfigurationAccess().getNameAssignment_2(), "rule__ComponentConfiguration__NameAssignment_2");
			builder.put(grammarAccess.getFeatureAccess().getNameAssignment_0(), "rule__Feature__NameAssignment_0");
			builder.put(grammarAccess.getFeatureAccess().getDirectionAssignment_2(), "rule__Feature__DirectionAssignment_2");
			builder.put(grammarAccess.getFeatureAccess().getCategoryAssignment_3(), "rule__Feature__CategoryAssignment_3");
			builder.put(grammarAccess.getFeatureAccess().getTypeReferenceAssignment_4(), "rule__Feature__TypeReferenceAssignment_4");
			builder.put(grammarAccess.getComponentAccess().getNameAssignment_0(), "rule__Component__NameAssignment_0");
			builder.put(grammarAccess.getComponentAccess().getCategoryAssignment_2(), "rule__Component__CategoryAssignment_2");
			builder.put(grammarAccess.getComponentAccess().getTypeReferencesAssignment_3(), "rule__Component__TypeReferencesAssignment_3");
			builder.put(grammarAccess.getConnectionAccess().getNameAssignment_0(), "rule__Connection__NameAssignment_0");
			builder.put(grammarAccess.getConnectionAccess().getAssociationTypeAssignment_2(), "rule__Connection__AssociationTypeAssignment_2");
			builder.put(grammarAccess.getConnectionAccess().getSourceAssignment_3(), "rule__Connection__SourceAssignment_3");
			builder.put(grammarAccess.getConnectionAccess().getBidirectionalAssignment_4_1(), "rule__Connection__BidirectionalAssignment_4_1");
			builder.put(grammarAccess.getConnectionAccess().getDestinationAssignment_5(), "rule__Connection__DestinationAssignment_5");
			builder.put(grammarAccess.getFeatureDelegateAccess().getNameAssignment_0(), "rule__FeatureDelegate__NameAssignment_0");
			builder.put(grammarAccess.getFeatureDelegateAccess().getAssociationTypeAssignment_2(), "rule__FeatureDelegate__AssociationTypeAssignment_2");
			builder.put(grammarAccess.getFeatureDelegateAccess().getSourceAssignment_3(), "rule__FeatureDelegate__SourceAssignment_3");
			builder.put(grammarAccess.getFeatureDelegateAccess().getBidirectionalAssignment_4_1(), "rule__FeatureDelegate__BidirectionalAssignment_4_1");
			builder.put(grammarAccess.getFeatureDelegateAccess().getDestinationAssignment_5(), "rule__FeatureDelegate__DestinationAssignment_5");
			builder.put(grammarAccess.getBindingAccess().getNameAssignment_0(), "rule__Binding__NameAssignment_0");
			builder.put(grammarAccess.getBindingAccess().getAssociationTypeAssignment_2(), "rule__Binding__AssociationTypeAssignment_2");
			builder.put(grammarAccess.getBindingAccess().getSourceAssignment_3(), "rule__Binding__SourceAssignment_3");
			builder.put(grammarAccess.getBindingAccess().getDestinationAssignment_5(), "rule__Binding__DestinationAssignment_5");
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
			builder.put(grammarAccess.getConfigurationAssignmentAccess().getTargetAssignment_0(), "rule__ConfigurationAssignment__TargetAssignment_0");
			builder.put(grammarAccess.getConfigurationAssignmentAccess().getAssignedClassifiersAssignment_2_0_0(), "rule__ConfigurationAssignment__AssignedClassifiersAssignment_2_0_0");
			builder.put(grammarAccess.getConfigurationAssignmentAccess().getAssignedClassifiersAssignment_2_0_1_1(), "rule__ConfigurationAssignment__AssignedClassifiersAssignment_2_0_1_1");
			builder.put(grammarAccess.getConfigurationAssignmentPatternAccess().getTargetPatternAssignment_0(), "rule__ConfigurationAssignmentPattern__TargetPatternAssignment_0");
			builder.put(grammarAccess.getConfigurationAssignmentPatternAccess().getAssignedClassifiersAssignment_2_0_0(), "rule__ConfigurationAssignmentPattern__AssignedClassifiersAssignment_2_0_0");
			builder.put(grammarAccess.getConfigurationAssignmentPatternAccess().getAssignedClassifiersAssignment_2_0_1_1(), "rule__ConfigurationAssignmentPattern__AssignedClassifiersAssignment_2_0_1_1");
			builder.put(grammarAccess.getFlowAssignmentAccess().getTargetAssignment_0(), "rule__FlowAssignment__TargetAssignment_0");
			builder.put(grammarAccess.getFlowAssignmentAccess().getElementsAssignment_3(), "rule__FlowAssignment__ElementsAssignment_3");
			builder.put(grammarAccess.getFlowAssignmentAccess().getElementsAssignment_4_1(), "rule__FlowAssignment__ElementsAssignment_4_1");
			builder.put(grammarAccess.getPropertyAssociationAccess().getTargetAssignment_0(), "rule__PropertyAssociation__TargetAssignment_0");
			builder.put(grammarAccess.getPropertyAssociationAccess().getPropertyAssignment_2(), "rule__PropertyAssociation__PropertyAssignment_2");
			builder.put(grammarAccess.getPropertyAssociationAccess().getPropertyAssociationTypeAssignment_3(), "rule__PropertyAssociation__PropertyAssociationTypeAssignment_3");
			builder.put(grammarAccess.getPropertyAssociationAccess().getValueAssignment_4(), "rule__PropertyAssociation__ValueAssignment_4");
			builder.put(grammarAccess.getPropertyValueAccess().getValueAssignment_0(), "rule__PropertyValue__ValueAssignment_0");
			builder.put(grammarAccess.getPropertyValueAccess().getUnitAssignment_1(), "rule__PropertyValue__UnitAssignment_1");
			builder.put(grammarAccess.getModelElementReferenceAccess().getElementAssignment_0(), "rule__ModelElementReference__ElementAssignment_0");
			builder.put(grammarAccess.getModelElementReferenceAccess().getElementAssignment_1_0_2(), "rule__ModelElementReference__ElementAssignment_1_0_2");
			builder.put(grammarAccess.getConfigurationElementAccess().getPropertyAssociationsAssignment_0(), "rule__ConfigurationElement__PropertyAssociationsAssignment_0");
			builder.put(grammarAccess.getConfigurationElementAccess().getBindingsAssignment_1(), "rule__ConfigurationElement__BindingsAssignment_1");
			builder.put(grammarAccess.getConfigurationElementAccess().getConfigurationAssignmentsAssignment_2(), "rule__ConfigurationElement__ConfigurationAssignmentsAssignment_2");
			builder.put(grammarAccess.getConfigurationElementAccess().getConfigurationAssignmentsAssignment_3(), "rule__ConfigurationElement__ConfigurationAssignmentsAssignment_3");
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
			builder.put(grammarAccess.getPropertiesBlockAccess().getPropertyAssociationsAssignment_1_0(), "rule__PropertiesBlock__PropertyAssociationsAssignment_1_0");
			builder.put(grammarAccess.getNestedImplementationElementAccess().getFeaturesAssignment_0(), "rule__NestedImplementationElement__FeaturesAssignment_0");
			builder.put(grammarAccess.getNestedImplementationElementAccess().getConnectionsAssignment_1(), "rule__NestedImplementationElement__ConnectionsAssignment_1");
			builder.put(grammarAccess.getNestedImplementationElementAccess().getConnectionsAssignment_2(), "rule__NestedImplementationElement__ConnectionsAssignment_2");
			builder.put(grammarAccess.getNestedImplementationElementAccess().getBindingsAssignment_3(), "rule__NestedImplementationElement__BindingsAssignment_3");
			builder.put(grammarAccess.getNestedImplementationElementAccess().getComponentsAssignment_4(), "rule__NestedImplementationElement__ComponentsAssignment_4");
			builder.put(grammarAccess.getNestedImplementationElementAccess().getPropertyAssociationsAssignment_5(), "rule__NestedImplementationElement__PropertyAssociationsAssignment_5");
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
			builder.put(grammarAccess.getWorkingsetAccess().getRootComponentsAssignment_5_0(), "rule__Workingset__RootComponentsAssignment_5_0");
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
