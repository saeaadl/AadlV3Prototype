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
package org.osate.xtext.aadlv3.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class AadlV3GrammarAccess extends AbstractGrammarElementFinder {
	
	public class PackageDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.PackageDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPackageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameQualifiedNameParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cImportsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cImportsImportParserRuleCall_2_0 = (RuleCall)cImportsAssignment_2.eContents().get(0);
		private final Assignment cElementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final Alternatives cElementsAlternatives_3_0 = (Alternatives)cElementsAssignment_3.eContents().get(0);
		private final RuleCall cElementsPackageDeclarationParserRuleCall_3_0_0 = (RuleCall)cElementsAlternatives_3_0.eContents().get(0);
		private final RuleCall cElementsDataTypeParserRuleCall_3_0_1 = (RuleCall)cElementsAlternatives_3_0.eContents().get(1);
		private final RuleCall cElementsComponentInterfaceParserRuleCall_3_0_2 = (RuleCall)cElementsAlternatives_3_0.eContents().get(2);
		private final RuleCall cElementsComponentImplementationParserRuleCall_3_0_3 = (RuleCall)cElementsAlternatives_3_0.eContents().get(3);
		private final RuleCall cElementsComponentConfigurationParserRuleCall_3_0_4 = (RuleCall)cElementsAlternatives_3_0.eContents().get(4);
		private final RuleCall cElementsPropertyDefinitionParserRuleCall_3_0_5 = (RuleCall)cElementsAlternatives_3_0.eContents().get(5);
		private final RuleCall cElementsPropertySetParserRuleCall_3_0_6 = (RuleCall)cElementsAlternatives_3_0.eContents().get(6);
		private final RuleCall cElementsWorkingsetParserRuleCall_3_0_7 = (RuleCall)cElementsAlternatives_3_0.eContents().get(7);
		private final Keyword cEndKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final RuleCall cSEMICOLONParserRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		
		//PackageDeclaration av3::PackageDeclaration:
		//	'package' name=QualifiedName
		//	imports+=Import*
		//	elements+=(PackageDeclaration | DataType | ComponentInterface | ComponentImplementation | ComponentConfiguration |
		//	PropertyDefinition | PropertySet | Workingset)*
		//	'end' SEMICOLON;
		@Override public ParserRule getRule() { return rule; }
		
		//'package' name=QualifiedName imports+=Import* elements+=(PackageDeclaration | DataType | ComponentInterface |
		//ComponentImplementation | ComponentConfiguration | PropertyDefinition | PropertySet | Workingset)* 'end' SEMICOLON
		public Group getGroup() { return cGroup; }
		
		//'package'
		public Keyword getPackageKeyword_0() { return cPackageKeyword_0; }
		
		//name=QualifiedName
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_1_0() { return cNameQualifiedNameParserRuleCall_1_0; }
		
		//imports+=Import*
		public Assignment getImportsAssignment_2() { return cImportsAssignment_2; }
		
		//Import
		public RuleCall getImportsImportParserRuleCall_2_0() { return cImportsImportParserRuleCall_2_0; }
		
		//elements+=(PackageDeclaration | DataType | ComponentInterface | ComponentImplementation | ComponentConfiguration |
		//PropertyDefinition | PropertySet | Workingset)*
		public Assignment getElementsAssignment_3() { return cElementsAssignment_3; }
		
		//(PackageDeclaration | DataType | ComponentInterface | ComponentImplementation | ComponentConfiguration |
		//PropertyDefinition | PropertySet | Workingset)
		public Alternatives getElementsAlternatives_3_0() { return cElementsAlternatives_3_0; }
		
		//PackageDeclaration
		public RuleCall getElementsPackageDeclarationParserRuleCall_3_0_0() { return cElementsPackageDeclarationParserRuleCall_3_0_0; }
		
		//DataType
		public RuleCall getElementsDataTypeParserRuleCall_3_0_1() { return cElementsDataTypeParserRuleCall_3_0_1; }
		
		//ComponentInterface
		public RuleCall getElementsComponentInterfaceParserRuleCall_3_0_2() { return cElementsComponentInterfaceParserRuleCall_3_0_2; }
		
		//ComponentImplementation
		public RuleCall getElementsComponentImplementationParserRuleCall_3_0_3() { return cElementsComponentImplementationParserRuleCall_3_0_3; }
		
		//ComponentConfiguration
		public RuleCall getElementsComponentConfigurationParserRuleCall_3_0_4() { return cElementsComponentConfigurationParserRuleCall_3_0_4; }
		
		//PropertyDefinition
		public RuleCall getElementsPropertyDefinitionParserRuleCall_3_0_5() { return cElementsPropertyDefinitionParserRuleCall_3_0_5; }
		
		//PropertySet
		public RuleCall getElementsPropertySetParserRuleCall_3_0_6() { return cElementsPropertySetParserRuleCall_3_0_6; }
		
		//Workingset
		public RuleCall getElementsWorkingsetParserRuleCall_3_0_7() { return cElementsWorkingsetParserRuleCall_3_0_7; }
		
		//'end'
		public Keyword getEndKeyword_4() { return cEndKeyword_4; }
		
		//SEMICOLON
		public RuleCall getSEMICOLONParserRuleCall_5() { return cSEMICOLONParserRuleCall_5; }
	}
	public class PropertyDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.PropertyDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPropertyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cTypeTypeCrossReference_3_0 = (CrossReference)cTypeAssignment_3.eContents().get(0);
		private final RuleCall cTypeTypeQualifiedReferenceParserRuleCall_3_0_1 = (RuleCall)cTypeTypeCrossReference_3_0.eContents().get(1);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cForKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final RuleCall cAppliesToParserRuleCall_4_1 = (RuleCall)cGroup_4.eContents().get(1);
		private final Group cGroup_4_2 = (Group)cGroup_4.eContents().get(2);
		private final Keyword cCommaKeyword_4_2_0 = (Keyword)cGroup_4_2.eContents().get(0);
		private final RuleCall cAppliesToParserRuleCall_4_2_1 = (RuleCall)cGroup_4_2.eContents().get(1);
		private final RuleCall cSEMICOLONParserRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		
		//PropertyDefinition av3::PropertyDefinition:
		//	'property' name=ID ':' type=[av3::Type|QualifiedReference] ('for' AppliesTo (',' AppliesTo)*)?
		//	SEMICOLON;
		@Override public ParserRule getRule() { return rule; }
		
		//'property' name=ID ':' type=[av3::Type|QualifiedReference] ('for' AppliesTo (',' AppliesTo)*)? SEMICOLON
		public Group getGroup() { return cGroup; }
		
		//'property'
		public Keyword getPropertyKeyword_0() { return cPropertyKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//type=[av3::Type|QualifiedReference]
		public Assignment getTypeAssignment_3() { return cTypeAssignment_3; }
		
		//[av3::Type|QualifiedReference]
		public CrossReference getTypeTypeCrossReference_3_0() { return cTypeTypeCrossReference_3_0; }
		
		//QualifiedReference
		public RuleCall getTypeTypeQualifiedReferenceParserRuleCall_3_0_1() { return cTypeTypeQualifiedReferenceParserRuleCall_3_0_1; }
		
		//('for' AppliesTo (',' AppliesTo)*)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'for'
		public Keyword getForKeyword_4_0() { return cForKeyword_4_0; }
		
		//AppliesTo
		public RuleCall getAppliesToParserRuleCall_4_1() { return cAppliesToParserRuleCall_4_1; }
		
		//(',' AppliesTo)*
		public Group getGroup_4_2() { return cGroup_4_2; }
		
		//','
		public Keyword getCommaKeyword_4_2_0() { return cCommaKeyword_4_2_0; }
		
		//AppliesTo
		public RuleCall getAppliesToParserRuleCall_4_2_1() { return cAppliesToParserRuleCall_4_2_1; }
		
		//SEMICOLON
		public RuleCall getSEMICOLONParserRuleCall_5() { return cSEMICOLONParserRuleCall_5; }
	}
	public class AppliesToElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.AppliesTo");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(0);
		private final Assignment cComponentCategoriesAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cComponentCategoriesComponentCategoryParserRuleCall_0_0 = (RuleCall)cComponentCategoriesAssignment_0.eContents().get(0);
		private final Assignment cFeatureCategoriesAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cFeatureCategoriesFeatureCategoryParserRuleCall_1_0 = (RuleCall)cFeatureCategoriesAssignment_1.eContents().get(0);
		private final Assignment cAssociationTypesAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final RuleCall cAssociationTypesAssociationTypeParserRuleCall_2_0 = (RuleCall)cAssociationTypesAssignment_2.eContents().get(0);
		
		//fragment AppliesTo *:
		//	componentCategories+=ComponentCategory | featureCategories+=FeatureCategory
		//	| associationTypes+=AssociationType;
		@Override public ParserRule getRule() { return rule; }
		
		//componentCategories+=ComponentCategory | featureCategories+=FeatureCategory | associationTypes+=AssociationType
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//componentCategories+=ComponentCategory
		public Assignment getComponentCategoriesAssignment_0() { return cComponentCategoriesAssignment_0; }
		
		//ComponentCategory
		public RuleCall getComponentCategoriesComponentCategoryParserRuleCall_0_0() { return cComponentCategoriesComponentCategoryParserRuleCall_0_0; }
		
		//featureCategories+=FeatureCategory
		public Assignment getFeatureCategoriesAssignment_1() { return cFeatureCategoriesAssignment_1; }
		
		//FeatureCategory
		public RuleCall getFeatureCategoriesFeatureCategoryParserRuleCall_1_0() { return cFeatureCategoriesFeatureCategoryParserRuleCall_1_0; }
		
		//associationTypes+=AssociationType
		public Assignment getAssociationTypesAssignment_2() { return cAssociationTypesAssignment_2; }
		
		//AssociationType
		public RuleCall getAssociationTypesAssociationTypeParserRuleCall_2_0() { return cAssociationTypesAssociationTypeParserRuleCall_2_0; }
	}
	public class PropertySetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.PropertySet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPropertiesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cPropertiesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cPropertiesPropertyDefinitionCrossReference_4_0 = (CrossReference)cPropertiesAssignment_4.eContents().get(0);
		private final RuleCall cPropertiesPropertyDefinitionQualifiedReferenceParserRuleCall_4_0_1 = (RuleCall)cPropertiesPropertyDefinitionCrossReference_4_0.eContents().get(1);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cPropertiesAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final CrossReference cPropertiesPropertyDefinitionCrossReference_5_1_0 = (CrossReference)cPropertiesAssignment_5_1.eContents().get(0);
		private final RuleCall cPropertiesPropertyDefinitionQualifiedNameParserRuleCall_5_1_0_1 = (RuleCall)cPropertiesPropertyDefinitionCrossReference_5_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final RuleCall cSEMICOLONParserRuleCall_7 = (RuleCall)cGroup.eContents().get(7);
		
		//PropertySet av3::PropertySet:
		//	'properties' name=ID ':'
		//	'{' properties+=[av3::PropertyDefinition|QualifiedReference] (','
		//	properties+=[av3::PropertyDefinition|QualifiedName])* '}'
		//	SEMICOLON;
		@Override public ParserRule getRule() { return rule; }
		
		//'properties' name=ID ':' '{' properties+=[av3::PropertyDefinition|QualifiedReference] (','
		//properties+=[av3::PropertyDefinition|QualifiedName])* '}' SEMICOLON
		public Group getGroup() { return cGroup; }
		
		//'properties'
		public Keyword getPropertiesKeyword_0() { return cPropertiesKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//properties+=[av3::PropertyDefinition|QualifiedReference]
		public Assignment getPropertiesAssignment_4() { return cPropertiesAssignment_4; }
		
		//[av3::PropertyDefinition|QualifiedReference]
		public CrossReference getPropertiesPropertyDefinitionCrossReference_4_0() { return cPropertiesPropertyDefinitionCrossReference_4_0; }
		
		//QualifiedReference
		public RuleCall getPropertiesPropertyDefinitionQualifiedReferenceParserRuleCall_4_0_1() { return cPropertiesPropertyDefinitionQualifiedReferenceParserRuleCall_4_0_1; }
		
		//(',' properties+=[av3::PropertyDefinition|QualifiedName])*
		public Group getGroup_5() { return cGroup_5; }
		
		//','
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }
		
		//properties+=[av3::PropertyDefinition|QualifiedName]
		public Assignment getPropertiesAssignment_5_1() { return cPropertiesAssignment_5_1; }
		
		//[av3::PropertyDefinition|QualifiedName]
		public CrossReference getPropertiesPropertyDefinitionCrossReference_5_1_0() { return cPropertiesPropertyDefinitionCrossReference_5_1_0; }
		
		//QualifiedName
		public RuleCall getPropertiesPropertyDefinitionQualifiedNameParserRuleCall_5_1_0_1() { return cPropertiesPropertyDefinitionQualifiedNameParserRuleCall_5_1_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//SEMICOLON
		public RuleCall getSEMICOLONParserRuleCall_7() { return cSEMICOLONParserRuleCall_7; }
	}
	public class DataTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.DataType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTypeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final RuleCall cPropertiesBlockParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final RuleCall cSEMICOLONParserRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		//DataType av3::DataType:
		//	'type' name=ID PropertiesBlock? SEMICOLON;
		@Override public ParserRule getRule() { return rule; }
		
		//'type' name=ID PropertiesBlock? SEMICOLON
		public Group getGroup() { return cGroup; }
		
		//'type'
		public Keyword getTypeKeyword_0() { return cTypeKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//PropertiesBlock?
		public RuleCall getPropertiesBlockParserRuleCall_2() { return cPropertiesBlockParserRuleCall_2; }
		
		//SEMICOLON
		public RuleCall getSEMICOLONParserRuleCall_3() { return cSEMICOLONParserRuleCall_3; }
	}
	public class ComponentInterfaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ComponentInterface");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPrivateAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cPrivatePrivateKeyword_0_0 = (Keyword)cPrivateAssignment_0.eContents().get(0);
		private final Assignment cCategoryAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cCategoryComponentCategoryParserRuleCall_1_0 = (RuleCall)cCategoryAssignment_1.eContents().get(0);
		private final Keyword cInterfaceKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cExtendsKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final RuleCall cInterfaceExtensionsParserRuleCall_4_1 = (RuleCall)cGroup_4.eContents().get(1);
		private final RuleCall cInterfaceBodyParserRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final RuleCall cSEMICOLONParserRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		
		//ComponentInterface av3::ComponentInterface:
		//	private?='private'? category=ComponentCategory? 'interface' name=ID ('extends' InterfaceExtensions?)?
		//	InterfaceBody
		//	SEMICOLON;
		@Override public ParserRule getRule() { return rule; }
		
		//private?='private'? category=ComponentCategory? 'interface' name=ID ('extends' InterfaceExtensions?)? InterfaceBody
		//SEMICOLON
		public Group getGroup() { return cGroup; }
		
		//private?='private'?
		public Assignment getPrivateAssignment_0() { return cPrivateAssignment_0; }
		
		//'private'
		public Keyword getPrivatePrivateKeyword_0_0() { return cPrivatePrivateKeyword_0_0; }
		
		//category=ComponentCategory?
		public Assignment getCategoryAssignment_1() { return cCategoryAssignment_1; }
		
		//ComponentCategory
		public RuleCall getCategoryComponentCategoryParserRuleCall_1_0() { return cCategoryComponentCategoryParserRuleCall_1_0; }
		
		//'interface'
		public Keyword getInterfaceKeyword_2() { return cInterfaceKeyword_2; }
		
		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }
		
		//('extends' InterfaceExtensions?)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'extends'
		public Keyword getExtendsKeyword_4_0() { return cExtendsKeyword_4_0; }
		
		//InterfaceExtensions?
		public RuleCall getInterfaceExtensionsParserRuleCall_4_1() { return cInterfaceExtensionsParserRuleCall_4_1; }
		
		//InterfaceBody
		public RuleCall getInterfaceBodyParserRuleCall_5() { return cInterfaceBodyParserRuleCall_5; }
		
		//SEMICOLON
		public RuleCall getSEMICOLONParserRuleCall_6() { return cSEMICOLONParserRuleCall_6; }
	}
	public class InterfaceBodyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.InterfaceBody");
		private final Group cGroup = (Group)rule.eContents().get(0);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Keyword cIsKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final RuleCall cInterfaceElementParserRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final Group cGroup_0_2 = (Group)cGroup_0.eContents().get(2);
		private final RuleCall cSEMICOLONParserRuleCall_0_2_0 = (RuleCall)cGroup_0_2.eContents().get(0);
		private final RuleCall cInterfaceElementParserRuleCall_0_2_1 = (RuleCall)cGroup_0_2.eContents().get(1);
		private final RuleCall cSEMICOLONParserRuleCall_0_3 = (RuleCall)cGroup_0.eContents().get(3);
		private final Keyword cEndKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//fragment InterfaceBody *:
		//	('is' InterfaceElement (SEMICOLON InterfaceElement)* SEMICOLON?)? 'end';
		@Override public ParserRule getRule() { return rule; }
		
		//('is' InterfaceElement (SEMICOLON InterfaceElement)* SEMICOLON?)? 'end'
		public Group getGroup() { return cGroup; }
		
		//('is' InterfaceElement (SEMICOLON InterfaceElement)* SEMICOLON?)?
		public Group getGroup_0() { return cGroup_0; }
		
		//'is'
		public Keyword getIsKeyword_0_0() { return cIsKeyword_0_0; }
		
		//InterfaceElement
		public RuleCall getInterfaceElementParserRuleCall_0_1() { return cInterfaceElementParserRuleCall_0_1; }
		
		//(SEMICOLON InterfaceElement)*
		public Group getGroup_0_2() { return cGroup_0_2; }
		
		//SEMICOLON
		public RuleCall getSEMICOLONParserRuleCall_0_2_0() { return cSEMICOLONParserRuleCall_0_2_0; }
		
		//InterfaceElement
		public RuleCall getInterfaceElementParserRuleCall_0_2_1() { return cInterfaceElementParserRuleCall_0_2_1; }
		
		//SEMICOLON?
		public RuleCall getSEMICOLONParserRuleCall_0_3() { return cSEMICOLONParserRuleCall_0_3; }
		
		//'end'
		public Keyword getEndKeyword_1() { return cEndKeyword_1; }
	}
	public class InterfaceElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.InterfaceElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(0);
		private final Assignment cFeaturesAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cFeaturesFeatureParserRuleCall_0_0 = (RuleCall)cFeaturesAssignment_0.eContents().get(0);
		private final Assignment cFlowsAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cFlowsFlowPathParserRuleCall_1_0 = (RuleCall)cFlowsAssignment_1.eContents().get(0);
		private final Assignment cFlowsAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final RuleCall cFlowsFlowSourceParserRuleCall_2_0 = (RuleCall)cFlowsAssignment_2.eContents().get(0);
		private final Assignment cFlowsAssignment_3 = (Assignment)cAlternatives.eContents().get(3);
		private final RuleCall cFlowsFlowSinkParserRuleCall_3_0 = (RuleCall)cFlowsAssignment_3.eContents().get(0);
		private final Assignment cPropertyAssociationsAssignment_4 = (Assignment)cAlternatives.eContents().get(4);
		private final RuleCall cPropertyAssociationsPropertyAssociationParserRuleCall_4_0 = (RuleCall)cPropertyAssociationsAssignment_4.eContents().get(0);
		private final RuleCall cUsePropsParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		
		//fragment InterfaceElement *:
		//	features+=Feature | flows+=FlowPath | flows+=FlowSource | flows+=FlowSink | propertyAssociations+=PropertyAssociation
		//	| UseProps;
		@Override public ParserRule getRule() { return rule; }
		
		//features+=Feature | flows+=FlowPath | flows+=FlowSource | flows+=FlowSink | propertyAssociations+=PropertyAssociation |
		//UseProps
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//features+=Feature
		public Assignment getFeaturesAssignment_0() { return cFeaturesAssignment_0; }
		
		//Feature
		public RuleCall getFeaturesFeatureParserRuleCall_0_0() { return cFeaturesFeatureParserRuleCall_0_0; }
		
		//flows+=FlowPath
		public Assignment getFlowsAssignment_1() { return cFlowsAssignment_1; }
		
		//FlowPath
		public RuleCall getFlowsFlowPathParserRuleCall_1_0() { return cFlowsFlowPathParserRuleCall_1_0; }
		
		//flows+=FlowSource
		public Assignment getFlowsAssignment_2() { return cFlowsAssignment_2; }
		
		//FlowSource
		public RuleCall getFlowsFlowSourceParserRuleCall_2_0() { return cFlowsFlowSourceParserRuleCall_2_0; }
		
		//flows+=FlowSink
		public Assignment getFlowsAssignment_3() { return cFlowsAssignment_3; }
		
		//FlowSink
		public RuleCall getFlowsFlowSinkParserRuleCall_3_0() { return cFlowsFlowSinkParserRuleCall_3_0; }
		
		//propertyAssociations+=PropertyAssociation
		public Assignment getPropertyAssociationsAssignment_4() { return cPropertyAssociationsAssignment_4; }
		
		//PropertyAssociation
		public RuleCall getPropertyAssociationsPropertyAssociationParserRuleCall_4_0() { return cPropertyAssociationsPropertyAssociationParserRuleCall_4_0; }
		
		//UseProps
		public RuleCall getUsePropsParserRuleCall_5() { return cUsePropsParserRuleCall_5; }
	}
	public class ComponentImplementationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ComponentImplementation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPrivateAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cPrivatePrivateKeyword_0_0 = (Keyword)cPrivateAssignment_0.eContents().get(0);
		private final Assignment cCategoryAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cCategoryComponentCategoryParserRuleCall_1_0 = (RuleCall)cCategoryAssignment_1.eContents().get(0);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameDottedNameParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cExtendsKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final RuleCall cImplementationExtensionsParserRuleCall_3_1 = (RuleCall)cGroup_3.eContents().get(1);
		private final RuleCall cImplementationBodyParserRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		private final RuleCall cSEMICOLONParserRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		
		////fragment SectionsInterfaceBody*:
		////	('features' features+=Feature+)?
		////	&('flows' (flows+=FlowPath |  flows+=FlowSource |  flows+=FlowSink)+)?
		//// 	&('properties' propertyAssociations+=PropertyAssociation+ )?
		////;
		//ComponentImplementation av3::ComponentImplementation:
		//	private?='private'? category=ComponentCategory name=DottedName ('extends' ImplementationExtensions?)?
		//	ImplementationBody
		//	SEMICOLON;
		@Override public ParserRule getRule() { return rule; }
		
		//private?='private'? category=ComponentCategory name=DottedName ('extends' ImplementationExtensions?)? ImplementationBody
		//SEMICOLON
		public Group getGroup() { return cGroup; }
		
		//private?='private'?
		public Assignment getPrivateAssignment_0() { return cPrivateAssignment_0; }
		
		//'private'
		public Keyword getPrivatePrivateKeyword_0_0() { return cPrivatePrivateKeyword_0_0; }
		
		//category=ComponentCategory
		public Assignment getCategoryAssignment_1() { return cCategoryAssignment_1; }
		
		//ComponentCategory
		public RuleCall getCategoryComponentCategoryParserRuleCall_1_0() { return cCategoryComponentCategoryParserRuleCall_1_0; }
		
		//name=DottedName
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//DottedName
		public RuleCall getNameDottedNameParserRuleCall_2_0() { return cNameDottedNameParserRuleCall_2_0; }
		
		//('extends' ImplementationExtensions?)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'extends'
		public Keyword getExtendsKeyword_3_0() { return cExtendsKeyword_3_0; }
		
		//ImplementationExtensions?
		public RuleCall getImplementationExtensionsParserRuleCall_3_1() { return cImplementationExtensionsParserRuleCall_3_1; }
		
		//ImplementationBody
		public RuleCall getImplementationBodyParserRuleCall_4() { return cImplementationBodyParserRuleCall_4; }
		
		//SEMICOLON
		public RuleCall getSEMICOLONParserRuleCall_5() { return cSEMICOLONParserRuleCall_5; }
	}
	public class ImplementationBodyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ImplementationBody");
		private final Group cGroup = (Group)rule.eContents().get(0);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Keyword cIsKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final RuleCall cImplementationElementParserRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final Group cGroup_0_2 = (Group)cGroup_0.eContents().get(2);
		private final RuleCall cSEMICOLONParserRuleCall_0_2_0 = (RuleCall)cGroup_0_2.eContents().get(0);
		private final RuleCall cImplementationElementParserRuleCall_0_2_1 = (RuleCall)cGroup_0_2.eContents().get(1);
		private final RuleCall cSEMICOLONParserRuleCall_0_3 = (RuleCall)cGroup_0.eContents().get(3);
		private final Keyword cEndKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//fragment ImplementationBody *:
		//	('is'
		//	ImplementationElement (SEMICOLON ImplementationElement)* SEMICOLON?)?
		//	'end';
		@Override public ParserRule getRule() { return rule; }
		
		//('is' ImplementationElement (SEMICOLON ImplementationElement)* SEMICOLON?)? 'end'
		public Group getGroup() { return cGroup; }
		
		//('is' ImplementationElement (SEMICOLON ImplementationElement)* SEMICOLON?)?
		public Group getGroup_0() { return cGroup_0; }
		
		//'is'
		public Keyword getIsKeyword_0_0() { return cIsKeyword_0_0; }
		
		//ImplementationElement
		public RuleCall getImplementationElementParserRuleCall_0_1() { return cImplementationElementParserRuleCall_0_1; }
		
		//(SEMICOLON ImplementationElement)*
		public Group getGroup_0_2() { return cGroup_0_2; }
		
		//SEMICOLON
		public RuleCall getSEMICOLONParserRuleCall_0_2_0() { return cSEMICOLONParserRuleCall_0_2_0; }
		
		//ImplementationElement
		public RuleCall getImplementationElementParserRuleCall_0_2_1() { return cImplementationElementParserRuleCall_0_2_1; }
		
		//SEMICOLON?
		public RuleCall getSEMICOLONParserRuleCall_0_3() { return cSEMICOLONParserRuleCall_0_3; }
		
		//'end'
		public Keyword getEndKeyword_1() { return cEndKeyword_1; }
	}
	public class ImplementationElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ImplementationElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(0);
		private final Assignment cConnectionsAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cConnectionsConnectionParserRuleCall_0_0 = (RuleCall)cConnectionsAssignment_0.eContents().get(0);
		private final Assignment cConnectionsAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cConnectionsFeatureMappingParserRuleCall_1_0 = (RuleCall)cConnectionsAssignment_1.eContents().get(0);
		private final Assignment cComponentsAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final RuleCall cComponentsComponentParserRuleCall_2_0 = (RuleCall)cComponentsAssignment_2.eContents().get(0);
		private final Assignment cPathsAssignment_3 = (Assignment)cAlternatives.eContents().get(3);
		private final RuleCall cPathsPathParserRuleCall_3_0 = (RuleCall)cPathsAssignment_3.eContents().get(0);
		private final Assignment cFlowAssignmentsAssignment_4 = (Assignment)cAlternatives.eContents().get(4);
		private final RuleCall cFlowAssignmentsFlowAssignmentParserRuleCall_4_0 = (RuleCall)cFlowAssignmentsAssignment_4.eContents().get(0);
		private final Assignment cConfigurationAssignmentsAssignment_5 = (Assignment)cAlternatives.eContents().get(5);
		private final RuleCall cConfigurationAssignmentsConfigurationAssignmentParserRuleCall_5_0 = (RuleCall)cConfigurationAssignmentsAssignment_5.eContents().get(0);
		private final Assignment cConfigurationAssignmentsAssignment_6 = (Assignment)cAlternatives.eContents().get(6);
		private final RuleCall cConfigurationAssignmentsConfigurationAssignmentPatternParserRuleCall_6_0 = (RuleCall)cConfigurationAssignmentsAssignment_6.eContents().get(0);
		private final Assignment cPropertyAssociationsAssignment_7 = (Assignment)cAlternatives.eContents().get(7);
		private final RuleCall cPropertyAssociationsPropertyAssociationParserRuleCall_7_0 = (RuleCall)cPropertyAssociationsAssignment_7.eContents().get(0);
		
		//fragment ImplementationElement *:
		//	connections+=Connection | connections+=FeatureMapping | components+=Component
		//	| paths+=Path | flowAssignments+=FlowAssignment | configurationAssignments+=ConfigurationAssignment |
		//	configurationAssignments+=ConfigurationAssignmentPattern
		//	| propertyAssociations+=PropertyAssociation;
		@Override public ParserRule getRule() { return rule; }
		
		//connections+=Connection | connections+=FeatureMapping | components+=Component | paths+=Path |
		//flowAssignments+=FlowAssignment | configurationAssignments+=ConfigurationAssignment |
		//configurationAssignments+=ConfigurationAssignmentPattern | propertyAssociations+=PropertyAssociation
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//connections+=Connection
		public Assignment getConnectionsAssignment_0() { return cConnectionsAssignment_0; }
		
		//Connection
		public RuleCall getConnectionsConnectionParserRuleCall_0_0() { return cConnectionsConnectionParserRuleCall_0_0; }
		
		//connections+=FeatureMapping
		public Assignment getConnectionsAssignment_1() { return cConnectionsAssignment_1; }
		
		//FeatureMapping
		public RuleCall getConnectionsFeatureMappingParserRuleCall_1_0() { return cConnectionsFeatureMappingParserRuleCall_1_0; }
		
		//components+=Component
		public Assignment getComponentsAssignment_2() { return cComponentsAssignment_2; }
		
		//Component
		public RuleCall getComponentsComponentParserRuleCall_2_0() { return cComponentsComponentParserRuleCall_2_0; }
		
		//paths+=Path
		public Assignment getPathsAssignment_3() { return cPathsAssignment_3; }
		
		//Path
		public RuleCall getPathsPathParserRuleCall_3_0() { return cPathsPathParserRuleCall_3_0; }
		
		//flowAssignments+=FlowAssignment
		public Assignment getFlowAssignmentsAssignment_4() { return cFlowAssignmentsAssignment_4; }
		
		//FlowAssignment
		public RuleCall getFlowAssignmentsFlowAssignmentParserRuleCall_4_0() { return cFlowAssignmentsFlowAssignmentParserRuleCall_4_0; }
		
		//configurationAssignments+=ConfigurationAssignment
		public Assignment getConfigurationAssignmentsAssignment_5() { return cConfigurationAssignmentsAssignment_5; }
		
		//ConfigurationAssignment
		public RuleCall getConfigurationAssignmentsConfigurationAssignmentParserRuleCall_5_0() { return cConfigurationAssignmentsConfigurationAssignmentParserRuleCall_5_0; }
		
		//configurationAssignments+=ConfigurationAssignmentPattern
		public Assignment getConfigurationAssignmentsAssignment_6() { return cConfigurationAssignmentsAssignment_6; }
		
		//ConfigurationAssignmentPattern
		public RuleCall getConfigurationAssignmentsConfigurationAssignmentPatternParserRuleCall_6_0() { return cConfigurationAssignmentsConfigurationAssignmentPatternParserRuleCall_6_0; }
		
		//propertyAssociations+=PropertyAssociation
		public Assignment getPropertyAssociationsAssignment_7() { return cPropertyAssociationsAssignment_7; }
		
		//PropertyAssociation
		public RuleCall getPropertyAssociationsPropertyAssociationParserRuleCall_7_0() { return cPropertyAssociationsPropertyAssociationParserRuleCall_7_0; }
	}
	public class ComponentConfigurationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ComponentConfiguration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPrivateAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cPrivatePrivateKeyword_0_0 = (Keyword)cPrivateAssignment_0.eContents().get(0);
		private final Keyword cConfigurationKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameDottedNameParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final RuleCall cParametersParserRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Keyword cExtendsKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final RuleCall cConfigurationExtensionsParserRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final RuleCall cConfigurationElementBlockParserRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		private final RuleCall cSEMICOLONParserRuleCall_7 = (RuleCall)cGroup.eContents().get(7);
		
		////fragment SectionsImplementationBody*:
		////	('subcomponents'(components+=Component|assignments+=ConfigurationAssignment)+ )?
		//// 	&('connections' connections+=(Connection|FeatureMapping)+ )?
		//// 	&('flows' (flowAssignments+=FlowAssignment| paths+= Path )+)?
		//// 	&('properties' propertyAssociations+=PropertyAssociation+ )?
		////;
		//ComponentConfiguration av3::ComponentConfiguration:
		//	private?='private'? 'configuration' name=DottedName
		//	Parameters?
		//	'extends' ConfigurationExtensions ConfigurationElementBlock
		//	SEMICOLON;
		@Override public ParserRule getRule() { return rule; }
		
		//private?='private'? 'configuration' name=DottedName Parameters? 'extends' ConfigurationExtensions
		//ConfigurationElementBlock SEMICOLON
		public Group getGroup() { return cGroup; }
		
		//private?='private'?
		public Assignment getPrivateAssignment_0() { return cPrivateAssignment_0; }
		
		//'private'
		public Keyword getPrivatePrivateKeyword_0_0() { return cPrivatePrivateKeyword_0_0; }
		
		//'configuration'
		public Keyword getConfigurationKeyword_1() { return cConfigurationKeyword_1; }
		
		//name=DottedName
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//DottedName
		public RuleCall getNameDottedNameParserRuleCall_2_0() { return cNameDottedNameParserRuleCall_2_0; }
		
		//Parameters?
		public RuleCall getParametersParserRuleCall_3() { return cParametersParserRuleCall_3; }
		
		//'extends'
		public Keyword getExtendsKeyword_4() { return cExtendsKeyword_4; }
		
		//ConfigurationExtensions
		public RuleCall getConfigurationExtensionsParserRuleCall_5() { return cConfigurationExtensionsParserRuleCall_5; }
		
		//ConfigurationElementBlock
		public RuleCall getConfigurationElementBlockParserRuleCall_6() { return cConfigurationElementBlockParserRuleCall_6; }
		
		//SEMICOLON
		public RuleCall getSEMICOLONParserRuleCall_7() { return cSEMICOLONParserRuleCall_7; }
	}
	public class FeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.Feature");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cDirectionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDirectionFeatureDirectionParserRuleCall_2_0 = (RuleCall)cDirectionAssignment_2.eContents().get(0);
		private final Assignment cSampledAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final Keyword cSampledSampledKeyword_3_0 = (Keyword)cSampledAssignment_3.eContents().get(0);
		private final Assignment cCategoryAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cCategoryFeatureCategoryParserRuleCall_4_0 = (RuleCall)cCategoryAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Assignment cReverseAssignment_5_0 = (Assignment)cGroup_5.eContents().get(0);
		private final Keyword cReverseReverseKeyword_5_0_0 = (Keyword)cReverseAssignment_5_0.eContents().get(0);
		private final Assignment cTypeAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final CrossReference cTypeTypeCrossReference_5_1_0 = (CrossReference)cTypeAssignment_5_1.eContents().get(0);
		private final RuleCall cTypeTypeQualifiedNameParserRuleCall_5_1_0_1 = (RuleCall)cTypeTypeCrossReference_5_1_0.eContents().get(1);
		private final RuleCall cPropertiesBlockParserRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		
		//// (Instance) model elements
		//Feature av3::Feature:
		//	name=ID ':' direction=FeatureDirection? sampled?='sampled'?
		//	category=FeatureCategory (reverse?='reverse'?
		//	type=[av3::Type|QualifiedName])?
		//	PropertiesBlock?;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' direction=FeatureDirection? sampled?='sampled'? category=FeatureCategory (reverse?='reverse'?
		//type=[av3::Type|QualifiedName])? PropertiesBlock?
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//direction=FeatureDirection?
		public Assignment getDirectionAssignment_2() { return cDirectionAssignment_2; }
		
		//FeatureDirection
		public RuleCall getDirectionFeatureDirectionParserRuleCall_2_0() { return cDirectionFeatureDirectionParserRuleCall_2_0; }
		
		//sampled?='sampled'?
		public Assignment getSampledAssignment_3() { return cSampledAssignment_3; }
		
		//'sampled'
		public Keyword getSampledSampledKeyword_3_0() { return cSampledSampledKeyword_3_0; }
		
		//category=FeatureCategory
		public Assignment getCategoryAssignment_4() { return cCategoryAssignment_4; }
		
		//FeatureCategory
		public RuleCall getCategoryFeatureCategoryParserRuleCall_4_0() { return cCategoryFeatureCategoryParserRuleCall_4_0; }
		
		//(reverse?='reverse'? type=[av3::Type|QualifiedName])?
		public Group getGroup_5() { return cGroup_5; }
		
		//reverse?='reverse'?
		public Assignment getReverseAssignment_5_0() { return cReverseAssignment_5_0; }
		
		//'reverse'
		public Keyword getReverseReverseKeyword_5_0_0() { return cReverseReverseKeyword_5_0_0; }
		
		//type=[av3::Type|QualifiedName]
		public Assignment getTypeAssignment_5_1() { return cTypeAssignment_5_1; }
		
		//[av3::Type|QualifiedName]
		public CrossReference getTypeTypeCrossReference_5_1_0() { return cTypeTypeCrossReference_5_1_0; }
		
		//QualifiedName
		public RuleCall getTypeTypeQualifiedNameParserRuleCall_5_1_0_1() { return cTypeTypeQualifiedNameParserRuleCall_5_1_0_1; }
		
		//PropertiesBlock?
		public RuleCall getPropertiesBlockParserRuleCall_6() { return cPropertiesBlockParserRuleCall_6; }
	}
	public class ComponentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.Component");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cCategoryAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cCategoryComponentCategoryParserRuleCall_2_0 = (RuleCall)cCategoryAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cTypeReferencesAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cTypeReferencesTypeReferenceParserRuleCall_3_0_0 = (RuleCall)cTypeReferencesAssignment_3_0.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cCommaKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cTypeReferencesAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cTypeReferencesTypeReferenceParserRuleCall_3_1_1_0 = (RuleCall)cTypeReferencesAssignment_3_1_1.eContents().get(0);
		private final RuleCall cNestedComponentImplementationBlockParserRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		
		//Component av3::Component:
		//	name=ID ':' category=ComponentCategory (typeReferences+=TypeReference (',' typeReferences+=TypeReference?)*)?
		//	NestedComponentImplementationBlock?;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' category=ComponentCategory (typeReferences+=TypeReference (',' typeReferences+=TypeReference?)*)?
		//NestedComponentImplementationBlock?
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//category=ComponentCategory
		public Assignment getCategoryAssignment_2() { return cCategoryAssignment_2; }
		
		//ComponentCategory
		public RuleCall getCategoryComponentCategoryParserRuleCall_2_0() { return cCategoryComponentCategoryParserRuleCall_2_0; }
		
		//(typeReferences+=TypeReference (',' typeReferences+=TypeReference?)*)?
		public Group getGroup_3() { return cGroup_3; }
		
		//typeReferences+=TypeReference
		public Assignment getTypeReferencesAssignment_3_0() { return cTypeReferencesAssignment_3_0; }
		
		//TypeReference
		public RuleCall getTypeReferencesTypeReferenceParserRuleCall_3_0_0() { return cTypeReferencesTypeReferenceParserRuleCall_3_0_0; }
		
		//(',' typeReferences+=TypeReference?)*
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//','
		public Keyword getCommaKeyword_3_1_0() { return cCommaKeyword_3_1_0; }
		
		//typeReferences+=TypeReference?
		public Assignment getTypeReferencesAssignment_3_1_1() { return cTypeReferencesAssignment_3_1_1; }
		
		//TypeReference
		public RuleCall getTypeReferencesTypeReferenceParserRuleCall_3_1_1_0() { return cTypeReferencesTypeReferenceParserRuleCall_3_1_1_0; }
		
		//NestedComponentImplementationBlock?
		public RuleCall getNestedComponentImplementationBlockParserRuleCall_4() { return cNestedComponentImplementationBlockParserRuleCall_4; }
	}
	public class ConnectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.Connection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cAssociationTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAssociationTypeConnectionTypeParserRuleCall_2_0 = (RuleCall)cAssociationTypeAssignment_2.eContents().get(0);
		private final Assignment cSourceAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSourceModelElementReferenceParserRuleCall_3_0 = (RuleCall)cSourceAssignment_3.eContents().get(0);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cDestinationAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cDestinationModelElementReferenceParserRuleCall_5_0 = (RuleCall)cDestinationAssignment_5.eContents().get(0);
		private final RuleCall cPropertiesBlockParserRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		
		//Connection av3::Association:
		//	name=ID ':' associationType=ConnectionType source=ModelElementReference
		//	'->' destination=ModelElementReference PropertiesBlock?;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' associationType=ConnectionType source=ModelElementReference '->' destination=ModelElementReference
		//PropertiesBlock?
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//associationType=ConnectionType
		public Assignment getAssociationTypeAssignment_2() { return cAssociationTypeAssignment_2; }
		
		//ConnectionType
		public RuleCall getAssociationTypeConnectionTypeParserRuleCall_2_0() { return cAssociationTypeConnectionTypeParserRuleCall_2_0; }
		
		//source=ModelElementReference
		public Assignment getSourceAssignment_3() { return cSourceAssignment_3; }
		
		//ModelElementReference
		public RuleCall getSourceModelElementReferenceParserRuleCall_3_0() { return cSourceModelElementReferenceParserRuleCall_3_0; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_4() { return cHyphenMinusGreaterThanSignKeyword_4; }
		
		//destination=ModelElementReference
		public Assignment getDestinationAssignment_5() { return cDestinationAssignment_5; }
		
		//ModelElementReference
		public RuleCall getDestinationModelElementReferenceParserRuleCall_5_0() { return cDestinationModelElementReferenceParserRuleCall_5_0; }
		
		//PropertiesBlock?
		public RuleCall getPropertiesBlockParserRuleCall_6() { return cPropertiesBlockParserRuleCall_6; }
	}
	public class FeatureMappingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.FeatureMapping");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cAssociationTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAssociationTypeMappingTypeParserRuleCall_2_0 = (RuleCall)cAssociationTypeAssignment_2.eContents().get(0);
		private final Assignment cSourceAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSourceModelElementReferenceParserRuleCall_3_0 = (RuleCall)cSourceAssignment_3.eContents().get(0);
		private final Keyword cEqualsSignGreaterThanSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cDestinationAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cDestinationModelElementReferenceParserRuleCall_5_0 = (RuleCall)cDestinationAssignment_5.eContents().get(0);
		private final RuleCall cPropertiesBlockParserRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		
		//FeatureMapping av3::Association:
		//	name=ID ':' associationType=MappingType source=ModelElementReference
		//	'=>' destination=ModelElementReference PropertiesBlock?;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' associationType=MappingType source=ModelElementReference '=>' destination=ModelElementReference
		//PropertiesBlock?
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//associationType=MappingType
		public Assignment getAssociationTypeAssignment_2() { return cAssociationTypeAssignment_2; }
		
		//MappingType
		public RuleCall getAssociationTypeMappingTypeParserRuleCall_2_0() { return cAssociationTypeMappingTypeParserRuleCall_2_0; }
		
		//source=ModelElementReference
		public Assignment getSourceAssignment_3() { return cSourceAssignment_3; }
		
		//ModelElementReference
		public RuleCall getSourceModelElementReferenceParserRuleCall_3_0() { return cSourceModelElementReferenceParserRuleCall_3_0; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_4() { return cEqualsSignGreaterThanSignKeyword_4; }
		
		//destination=ModelElementReference
		public Assignment getDestinationAssignment_5() { return cDestinationAssignment_5; }
		
		//ModelElementReference
		public RuleCall getDestinationModelElementReferenceParserRuleCall_5_0() { return cDestinationModelElementReferenceParserRuleCall_5_0; }
		
		//PropertiesBlock?
		public RuleCall getPropertiesBlockParserRuleCall_6() { return cPropertiesBlockParserRuleCall_6; }
	}
	public class FlowPathElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.FlowPath");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cAssociationTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAssociationTypeFlowPathTypeParserRuleCall_2_0 = (RuleCall)cAssociationTypeAssignment_2.eContents().get(0);
		private final Assignment cSourceAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSourceModelElementReferenceParserRuleCall_3_0 = (RuleCall)cSourceAssignment_3.eContents().get(0);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cDestinationAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cDestinationModelElementReferenceParserRuleCall_5_0 = (RuleCall)cDestinationAssignment_5.eContents().get(0);
		private final RuleCall cPropertiesBlockParserRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		
		//FlowPath av3::Association:
		//	name=ID ':' associationType=FlowPathType source=ModelElementReference
		//	'->' destination=ModelElementReference PropertiesBlock?;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' associationType=FlowPathType source=ModelElementReference '->' destination=ModelElementReference
		//PropertiesBlock?
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//associationType=FlowPathType
		public Assignment getAssociationTypeAssignment_2() { return cAssociationTypeAssignment_2; }
		
		//FlowPathType
		public RuleCall getAssociationTypeFlowPathTypeParserRuleCall_2_0() { return cAssociationTypeFlowPathTypeParserRuleCall_2_0; }
		
		//source=ModelElementReference
		public Assignment getSourceAssignment_3() { return cSourceAssignment_3; }
		
		//ModelElementReference
		public RuleCall getSourceModelElementReferenceParserRuleCall_3_0() { return cSourceModelElementReferenceParserRuleCall_3_0; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_4() { return cHyphenMinusGreaterThanSignKeyword_4; }
		
		//destination=ModelElementReference
		public Assignment getDestinationAssignment_5() { return cDestinationAssignment_5; }
		
		//ModelElementReference
		public RuleCall getDestinationModelElementReferenceParserRuleCall_5_0() { return cDestinationModelElementReferenceParserRuleCall_5_0; }
		
		//PropertiesBlock?
		public RuleCall getPropertiesBlockParserRuleCall_6() { return cPropertiesBlockParserRuleCall_6; }
	}
	public class FlowSourceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.FlowSource");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cAssociationTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAssociationTypeFlowSourceTypeParserRuleCall_2_0 = (RuleCall)cAssociationTypeAssignment_2.eContents().get(0);
		private final Assignment cDestinationAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDestinationModelElementReferenceParserRuleCall_3_0 = (RuleCall)cDestinationAssignment_3.eContents().get(0);
		private final RuleCall cPropertiesBlockParserRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		
		//FlowSource av3::Association:
		//	name=ID ':' associationType=FlowSourceType destination=ModelElementReference PropertiesBlock?;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' associationType=FlowSourceType destination=ModelElementReference PropertiesBlock?
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//associationType=FlowSourceType
		public Assignment getAssociationTypeAssignment_2() { return cAssociationTypeAssignment_2; }
		
		//FlowSourceType
		public RuleCall getAssociationTypeFlowSourceTypeParserRuleCall_2_0() { return cAssociationTypeFlowSourceTypeParserRuleCall_2_0; }
		
		//destination=ModelElementReference
		public Assignment getDestinationAssignment_3() { return cDestinationAssignment_3; }
		
		//ModelElementReference
		public RuleCall getDestinationModelElementReferenceParserRuleCall_3_0() { return cDestinationModelElementReferenceParserRuleCall_3_0; }
		
		//PropertiesBlock?
		public RuleCall getPropertiesBlockParserRuleCall_4() { return cPropertiesBlockParserRuleCall_4; }
	}
	public class FlowSinkElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.FlowSink");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cAssociationTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAssociationTypeFlowSinkTypeParserRuleCall_2_0 = (RuleCall)cAssociationTypeAssignment_2.eContents().get(0);
		private final Assignment cSourceAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSourceModelElementReferenceParserRuleCall_3_0 = (RuleCall)cSourceAssignment_3.eContents().get(0);
		private final RuleCall cPropertiesBlockParserRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		
		//FlowSink av3::Association:
		//	name=ID ':' associationType=FlowSinkType source=ModelElementReference
		//	PropertiesBlock?;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' associationType=FlowSinkType source=ModelElementReference PropertiesBlock?
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//associationType=FlowSinkType
		public Assignment getAssociationTypeAssignment_2() { return cAssociationTypeAssignment_2; }
		
		//FlowSinkType
		public RuleCall getAssociationTypeFlowSinkTypeParserRuleCall_2_0() { return cAssociationTypeFlowSinkTypeParserRuleCall_2_0; }
		
		//source=ModelElementReference
		public Assignment getSourceAssignment_3() { return cSourceAssignment_3; }
		
		//ModelElementReference
		public RuleCall getSourceModelElementReferenceParserRuleCall_3_0() { return cSourceModelElementReferenceParserRuleCall_3_0; }
		
		//PropertiesBlock?
		public RuleCall getPropertiesBlockParserRuleCall_4() { return cPropertiesBlockParserRuleCall_4; }
	}
	public class UsePropsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.UseProps");
		private final Group cGroup = (Group)rule.eContents().get(0);
		private final Keyword cUseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cPropertiesKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cUsePropertiesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cUsePropertiesPropertySetCrossReference_2_0 = (CrossReference)cUsePropertiesAssignment_2.eContents().get(0);
		private final RuleCall cUsePropertiesPropertySetQualifiedNameParserRuleCall_2_0_1 = (RuleCall)cUsePropertiesPropertySetCrossReference_2_0.eContents().get(1);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCommaKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cUsePropertiesAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cUsePropertiesPropertySetCrossReference_3_1_0 = (CrossReference)cUsePropertiesAssignment_3_1.eContents().get(0);
		private final RuleCall cUsePropertiesPropertySetQualifiedNameParserRuleCall_3_1_0_1 = (RuleCall)cUsePropertiesPropertySetCrossReference_3_1_0.eContents().get(1);
		
		//fragment UseProps *:
		//	'use' 'properties' useProperties+=[av3::PropertySet|QualifiedName] (','
		//	useProperties+=[av3::PropertySet|QualifiedName])*;
		@Override public ParserRule getRule() { return rule; }
		
		//'use' 'properties' useProperties+=[av3::PropertySet|QualifiedName] (','
		//useProperties+=[av3::PropertySet|QualifiedName])*
		public Group getGroup() { return cGroup; }
		
		//'use'
		public Keyword getUseKeyword_0() { return cUseKeyword_0; }
		
		//'properties'
		public Keyword getPropertiesKeyword_1() { return cPropertiesKeyword_1; }
		
		//useProperties+=[av3::PropertySet|QualifiedName]
		public Assignment getUsePropertiesAssignment_2() { return cUsePropertiesAssignment_2; }
		
		//[av3::PropertySet|QualifiedName]
		public CrossReference getUsePropertiesPropertySetCrossReference_2_0() { return cUsePropertiesPropertySetCrossReference_2_0; }
		
		//QualifiedName
		public RuleCall getUsePropertiesPropertySetQualifiedNameParserRuleCall_2_0_1() { return cUsePropertiesPropertySetQualifiedNameParserRuleCall_2_0_1; }
		
		//(',' useProperties+=[av3::PropertySet|QualifiedName])*
		public Group getGroup_3() { return cGroup_3; }
		
		//','
		public Keyword getCommaKeyword_3_0() { return cCommaKeyword_3_0; }
		
		//useProperties+=[av3::PropertySet|QualifiedName]
		public Assignment getUsePropertiesAssignment_3_1() { return cUsePropertiesAssignment_3_1; }
		
		//[av3::PropertySet|QualifiedName]
		public CrossReference getUsePropertiesPropertySetCrossReference_3_1_0() { return cUsePropertiesPropertySetCrossReference_3_1_0; }
		
		//QualifiedName
		public RuleCall getUsePropertiesPropertySetQualifiedNameParserRuleCall_3_1_0_1() { return cUsePropertiesPropertySetQualifiedNameParserRuleCall_3_1_0_1; }
	}
	public class PathElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.Path");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cEndToEndFlowKeywordsParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Assignment cElementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cElementsPathElementParserRuleCall_3_0 = (RuleCall)cElementsAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cElementsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cElementsPathElementParserRuleCall_4_1_0 = (RuleCall)cElementsAssignment_4_1.eContents().get(0);
		private final RuleCall cPropertiesBlockParserRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		
		//Path av3::PathSequence:
		//	name=ID ':' EndToEndFlowKeywords elements+=PathElement ('->' elements+=PathElement)+
		//	PropertiesBlock?;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' EndToEndFlowKeywords elements+=PathElement ('->' elements+=PathElement)+ PropertiesBlock?
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//EndToEndFlowKeywords
		public RuleCall getEndToEndFlowKeywordsParserRuleCall_2() { return cEndToEndFlowKeywordsParserRuleCall_2; }
		
		//elements+=PathElement
		public Assignment getElementsAssignment_3() { return cElementsAssignment_3; }
		
		//PathElement
		public RuleCall getElementsPathElementParserRuleCall_3_0() { return cElementsPathElementParserRuleCall_3_0; }
		
		//('->' elements+=PathElement)+
		public Group getGroup_4() { return cGroup_4; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_4_0() { return cHyphenMinusGreaterThanSignKeyword_4_0; }
		
		//elements+=PathElement
		public Assignment getElementsAssignment_4_1() { return cElementsAssignment_4_1; }
		
		//PathElement
		public RuleCall getElementsPathElementParserRuleCall_4_1_0() { return cElementsPathElementParserRuleCall_4_1_0; }
		
		//PropertiesBlock?
		public RuleCall getPropertiesBlockParserRuleCall_5() { return cPropertiesBlockParserRuleCall_5; }
	}
	public class PathElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.PathElement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cElementAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cElementModelElementCrossReference_0_0 = (CrossReference)cElementAssignment_0.eContents().get(0);
		private final RuleCall cElementModelElementIDTerminalRuleCall_0_0_1 = (RuleCall)cElementModelElementCrossReference_0_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cGroup_1.eContents().get(0);
		private final Action cPathElementContextAction_1_0_0 = (Action)cGroup_1_0.eContents().get(0);
		private final Keyword cFullStopKeyword_1_0_1 = (Keyword)cGroup_1_0.eContents().get(1);
		private final Assignment cElementAssignment_1_0_2 = (Assignment)cGroup_1_0.eContents().get(2);
		private final CrossReference cElementModelElementCrossReference_1_0_2_0 = (CrossReference)cElementAssignment_1_0_2.eContents().get(0);
		private final RuleCall cElementModelElementIDTerminalRuleCall_1_0_2_0_1 = (RuleCall)cElementModelElementCrossReference_1_0_2_0.eContents().get(1);
		
		//PathElement av3::PathElement:
		//	element=[av3::ModelElement] => ({av3::PathElement.context=current} '.' element=[av3::ModelElement])*;
		@Override public ParserRule getRule() { return rule; }
		
		//element=[av3::ModelElement] => ({av3::PathElement.context=current} '.' element=[av3::ModelElement])*
		public Group getGroup() { return cGroup; }
		
		//element=[av3::ModelElement]
		public Assignment getElementAssignment_0() { return cElementAssignment_0; }
		
		//[av3::ModelElement]
		public CrossReference getElementModelElementCrossReference_0_0() { return cElementModelElementCrossReference_0_0; }
		
		//ID
		public RuleCall getElementModelElementIDTerminalRuleCall_0_0_1() { return cElementModelElementIDTerminalRuleCall_0_0_1; }
		
		//=> ({av3::PathElement.context=current} '.' element=[av3::ModelElement])*
		public Group getGroup_1() { return cGroup_1; }
		
		//{av3::PathElement.context=current} '.' element=[av3::ModelElement]
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//{av3::PathElement.context=current}
		public Action getPathElementContextAction_1_0_0() { return cPathElementContextAction_1_0_0; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0_1() { return cFullStopKeyword_1_0_1; }
		
		//element=[av3::ModelElement]
		public Assignment getElementAssignment_1_0_2() { return cElementAssignment_1_0_2; }
		
		//[av3::ModelElement]
		public CrossReference getElementModelElementCrossReference_1_0_2_0() { return cElementModelElementCrossReference_1_0_2_0; }
		
		//ID
		public RuleCall getElementModelElementIDTerminalRuleCall_1_0_2_0_1() { return cElementModelElementIDTerminalRuleCall_1_0_2_0_1; }
	}
	public class ImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.Import");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cImportedNamespaceAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0_0 = (RuleCall)cImportedNamespaceAssignment_1_0.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Assignment cImportedNamespaceAssignment_1_1_0 = (Assignment)cGroup_1_1.eContents().get(0);
		private final RuleCall cImportedNamespaceQualifiedNameParserRuleCall_1_1_0_0 = (RuleCall)cImportedNamespaceAssignment_1_1_0.eContents().get(0);
		private final Group cGroup_1_1_1 = (Group)cGroup_1_1.eContents().get(1);
		private final Keyword cAsKeyword_1_1_1_0 = (Keyword)cGroup_1_1_1.eContents().get(0);
		private final Assignment cAliasAssignment_1_1_1_1 = (Assignment)cGroup_1_1_1.eContents().get(1);
		private final RuleCall cAliasIDTerminalRuleCall_1_1_1_1_0 = (RuleCall)cAliasAssignment_1_1_1_1.eContents().get(0);
		private final RuleCall cSEMICOLONParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//Import av3::Import:
		//	'import' (importedNamespace=QualifiedNameWithWildcard | importedNamespace=QualifiedName ('as' alias=ID)?) SEMICOLON;
		@Override public ParserRule getRule() { return rule; }
		
		//'import' (importedNamespace=QualifiedNameWithWildcard | importedNamespace=QualifiedName ('as' alias=ID)?) SEMICOLON
		public Group getGroup() { return cGroup; }
		
		//'import'
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }
		
		//importedNamespace=QualifiedNameWithWildcard | importedNamespace=QualifiedName ('as' alias=ID)?
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//importedNamespace=QualifiedNameWithWildcard
		public Assignment getImportedNamespaceAssignment_1_0() { return cImportedNamespaceAssignment_1_0; }
		
		//QualifiedNameWithWildcard
		public RuleCall getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0_0() { return cImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0_0; }
		
		//importedNamespace=QualifiedName ('as' alias=ID)?
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//importedNamespace=QualifiedName
		public Assignment getImportedNamespaceAssignment_1_1_0() { return cImportedNamespaceAssignment_1_1_0; }
		
		//QualifiedName
		public RuleCall getImportedNamespaceQualifiedNameParserRuleCall_1_1_0_0() { return cImportedNamespaceQualifiedNameParserRuleCall_1_1_0_0; }
		
		//('as' alias=ID)?
		public Group getGroup_1_1_1() { return cGroup_1_1_1; }
		
		//'as'
		public Keyword getAsKeyword_1_1_1_0() { return cAsKeyword_1_1_1_0; }
		
		//alias=ID
		public Assignment getAliasAssignment_1_1_1_1() { return cAliasAssignment_1_1_1_1; }
		
		//ID
		public RuleCall getAliasIDTerminalRuleCall_1_1_1_1_0() { return cAliasIDTerminalRuleCall_1_1_1_1_0; }
		
		//SEMICOLON
		public RuleCall getSEMICOLONParserRuleCall_2() { return cSEMICOLONParserRuleCall_2; }
	}
	public class ConfigurationAssignmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ConfigurationAssignment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTargetAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTargetModelElementReferenceParserRuleCall_0_0 = (RuleCall)cTargetAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cAlternatives_2.eContents().get(0);
		private final Assignment cAssignedClassifiersAssignment_2_0_0 = (Assignment)cGroup_2_0.eContents().get(0);
		private final RuleCall cAssignedClassifiersTypeReferenceParserRuleCall_2_0_0_0 = (RuleCall)cAssignedClassifiersAssignment_2_0_0.eContents().get(0);
		private final Group cGroup_2_0_1 = (Group)cGroup_2_0.eContents().get(1);
		private final Keyword cCommaKeyword_2_0_1_0 = (Keyword)cGroup_2_0_1.eContents().get(0);
		private final Assignment cAssignedClassifiersAssignment_2_0_1_1 = (Assignment)cGroup_2_0_1.eContents().get(1);
		private final RuleCall cAssignedClassifiersTypeReferenceParserRuleCall_2_0_1_1_0 = (RuleCall)cAssignedClassifiersAssignment_2_0_1_1.eContents().get(0);
		private final RuleCall cCurlyConfigurationElementBlockParserRuleCall_2_0_2 = (RuleCall)cGroup_2_0.eContents().get(2);
		private final RuleCall cCurlyConfigurationElementBlockParserRuleCall_2_1 = (RuleCall)cAlternatives_2.eContents().get(1);
		
		//ConfigurationAssignment av3::ConfigurationAssignment:
		//	target=ModelElementReference '=>' (assignedClassifiers+=TypeReference (',' assignedClassifiers+=TypeReference)*
		//	CurlyConfigurationElementBlock? | CurlyConfigurationElementBlock);
		@Override public ParserRule getRule() { return rule; }
		
		//target=ModelElementReference '=>' (assignedClassifiers+=TypeReference (',' assignedClassifiers+=TypeReference)*
		//CurlyConfigurationElementBlock? | CurlyConfigurationElementBlock)
		public Group getGroup() { return cGroup; }
		
		//target=ModelElementReference
		public Assignment getTargetAssignment_0() { return cTargetAssignment_0; }
		
		//ModelElementReference
		public RuleCall getTargetModelElementReferenceParserRuleCall_0_0() { return cTargetModelElementReferenceParserRuleCall_0_0; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_1() { return cEqualsSignGreaterThanSignKeyword_1; }
		
		//assignedClassifiers+=TypeReference (',' assignedClassifiers+=TypeReference)* CurlyConfigurationElementBlock? |
		//CurlyConfigurationElementBlock
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//assignedClassifiers+=TypeReference (',' assignedClassifiers+=TypeReference)* CurlyConfigurationElementBlock?
		public Group getGroup_2_0() { return cGroup_2_0; }
		
		//assignedClassifiers+=TypeReference
		public Assignment getAssignedClassifiersAssignment_2_0_0() { return cAssignedClassifiersAssignment_2_0_0; }
		
		//TypeReference
		public RuleCall getAssignedClassifiersTypeReferenceParserRuleCall_2_0_0_0() { return cAssignedClassifiersTypeReferenceParserRuleCall_2_0_0_0; }
		
		//(',' assignedClassifiers+=TypeReference)*
		public Group getGroup_2_0_1() { return cGroup_2_0_1; }
		
		//','
		public Keyword getCommaKeyword_2_0_1_0() { return cCommaKeyword_2_0_1_0; }
		
		//assignedClassifiers+=TypeReference
		public Assignment getAssignedClassifiersAssignment_2_0_1_1() { return cAssignedClassifiersAssignment_2_0_1_1; }
		
		//TypeReference
		public RuleCall getAssignedClassifiersTypeReferenceParserRuleCall_2_0_1_1_0() { return cAssignedClassifiersTypeReferenceParserRuleCall_2_0_1_1_0; }
		
		//CurlyConfigurationElementBlock?
		public RuleCall getCurlyConfigurationElementBlockParserRuleCall_2_0_2() { return cCurlyConfigurationElementBlockParserRuleCall_2_0_2; }
		
		//CurlyConfigurationElementBlock
		public RuleCall getCurlyConfigurationElementBlockParserRuleCall_2_1() { return cCurlyConfigurationElementBlockParserRuleCall_2_1; }
	}
	public class ConfigurationAssignmentPatternElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ConfigurationAssignmentPattern");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTargetPatternAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cTargetPatternTypeCrossReference_0_0 = (CrossReference)cTargetPatternAssignment_0.eContents().get(0);
		private final RuleCall cTargetPatternTypeQualifiedTypesReferenceParserRuleCall_0_0_1 = (RuleCall)cTargetPatternTypeCrossReference_0_0.eContents().get(1);
		private final Keyword cAsteriskEqualsSignGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cAlternatives_2.eContents().get(0);
		private final Assignment cAssignedClassifiersAssignment_2_0_0 = (Assignment)cGroup_2_0.eContents().get(0);
		private final RuleCall cAssignedClassifiersTypeReferenceParserRuleCall_2_0_0_0 = (RuleCall)cAssignedClassifiersAssignment_2_0_0.eContents().get(0);
		private final Group cGroup_2_0_1 = (Group)cGroup_2_0.eContents().get(1);
		private final Keyword cCommaKeyword_2_0_1_0 = (Keyword)cGroup_2_0_1.eContents().get(0);
		private final Assignment cAssignedClassifiersAssignment_2_0_1_1 = (Assignment)cGroup_2_0_1.eContents().get(1);
		private final RuleCall cAssignedClassifiersTypeReferenceParserRuleCall_2_0_1_1_0 = (RuleCall)cAssignedClassifiersAssignment_2_0_1_1.eContents().get(0);
		private final RuleCall cCurlyConfigurationElementBlockParserRuleCall_2_0_2 = (RuleCall)cGroup_2_0.eContents().get(2);
		private final RuleCall cCurlyConfigurationElementBlockParserRuleCall_2_1 = (RuleCall)cAlternatives_2.eContents().get(1);
		
		//ConfigurationAssignmentPattern av3::ConfigurationAssignmentPattern:
		//	targetPattern=[av3::Type|QualifiedTypesReference] '*=>' (assignedClassifiers+=TypeReference (','
		//	assignedClassifiers+=TypeReference)* CurlyConfigurationElementBlock? | CurlyConfigurationElementBlock);
		@Override public ParserRule getRule() { return rule; }
		
		//targetPattern=[av3::Type|QualifiedTypesReference] '*=>' (assignedClassifiers+=TypeReference (','
		//assignedClassifiers+=TypeReference)* CurlyConfigurationElementBlock? | CurlyConfigurationElementBlock)
		public Group getGroup() { return cGroup; }
		
		//targetPattern=[av3::Type|QualifiedTypesReference]
		public Assignment getTargetPatternAssignment_0() { return cTargetPatternAssignment_0; }
		
		//[av3::Type|QualifiedTypesReference]
		public CrossReference getTargetPatternTypeCrossReference_0_0() { return cTargetPatternTypeCrossReference_0_0; }
		
		//QualifiedTypesReference
		public RuleCall getTargetPatternTypeQualifiedTypesReferenceParserRuleCall_0_0_1() { return cTargetPatternTypeQualifiedTypesReferenceParserRuleCall_0_0_1; }
		
		//'*=>'
		public Keyword getAsteriskEqualsSignGreaterThanSignKeyword_1() { return cAsteriskEqualsSignGreaterThanSignKeyword_1; }
		
		//assignedClassifiers+=TypeReference (',' assignedClassifiers+=TypeReference)* CurlyConfigurationElementBlock? |
		//CurlyConfigurationElementBlock
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//assignedClassifiers+=TypeReference (',' assignedClassifiers+=TypeReference)* CurlyConfigurationElementBlock?
		public Group getGroup_2_0() { return cGroup_2_0; }
		
		//assignedClassifiers+=TypeReference
		public Assignment getAssignedClassifiersAssignment_2_0_0() { return cAssignedClassifiersAssignment_2_0_0; }
		
		//TypeReference
		public RuleCall getAssignedClassifiersTypeReferenceParserRuleCall_2_0_0_0() { return cAssignedClassifiersTypeReferenceParserRuleCall_2_0_0_0; }
		
		//(',' assignedClassifiers+=TypeReference)*
		public Group getGroup_2_0_1() { return cGroup_2_0_1; }
		
		//','
		public Keyword getCommaKeyword_2_0_1_0() { return cCommaKeyword_2_0_1_0; }
		
		//assignedClassifiers+=TypeReference
		public Assignment getAssignedClassifiersAssignment_2_0_1_1() { return cAssignedClassifiersAssignment_2_0_1_1; }
		
		//TypeReference
		public RuleCall getAssignedClassifiersTypeReferenceParserRuleCall_2_0_1_1_0() { return cAssignedClassifiersTypeReferenceParserRuleCall_2_0_1_1_0; }
		
		//CurlyConfigurationElementBlock?
		public RuleCall getCurlyConfigurationElementBlockParserRuleCall_2_0_2() { return cCurlyConfigurationElementBlockParserRuleCall_2_0_2; }
		
		//CurlyConfigurationElementBlock
		public RuleCall getCurlyConfigurationElementBlockParserRuleCall_2_1() { return cCurlyConfigurationElementBlockParserRuleCall_2_1; }
	}
	public class FlowAssignmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.FlowAssignment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTargetAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTargetModelElementReferenceParserRuleCall_0_0 = (RuleCall)cTargetAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFlowKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cElementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cElementsPathElementParserRuleCall_3_0 = (RuleCall)cElementsAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cElementsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cElementsPathElementParserRuleCall_4_1_0 = (RuleCall)cElementsAssignment_4_1.eContents().get(0);
		
		//FlowAssignment av3::PathSequence:
		//	target=ModelElementReference '=>' 'flow'
		//	elements+=PathElement ('->' elements+=PathElement)*;
		@Override public ParserRule getRule() { return rule; }
		
		//target=ModelElementReference '=>' 'flow' elements+=PathElement ('->' elements+=PathElement)*
		public Group getGroup() { return cGroup; }
		
		//target=ModelElementReference
		public Assignment getTargetAssignment_0() { return cTargetAssignment_0; }
		
		//ModelElementReference
		public RuleCall getTargetModelElementReferenceParserRuleCall_0_0() { return cTargetModelElementReferenceParserRuleCall_0_0; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_1() { return cEqualsSignGreaterThanSignKeyword_1; }
		
		//'flow'
		public Keyword getFlowKeyword_2() { return cFlowKeyword_2; }
		
		//elements+=PathElement
		public Assignment getElementsAssignment_3() { return cElementsAssignment_3; }
		
		//PathElement
		public RuleCall getElementsPathElementParserRuleCall_3_0() { return cElementsPathElementParserRuleCall_3_0; }
		
		//('->' elements+=PathElement)*
		public Group getGroup_4() { return cGroup_4; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_4_0() { return cHyphenMinusGreaterThanSignKeyword_4_0; }
		
		//elements+=PathElement
		public Assignment getElementsAssignment_4_1() { return cElementsAssignment_4_1; }
		
		//PathElement
		public RuleCall getElementsPathElementParserRuleCall_4_1_0() { return cElementsPathElementParserRuleCall_4_1_0; }
	}
	public class PropertyAssociationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.PropertyAssociation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTargetAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTargetModelElementReferenceParserRuleCall_0_0 = (RuleCall)cTargetAssignment_0.eContents().get(0);
		private final Keyword cNumberSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cPropertyAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cPropertyPropertyDefinitionCrossReference_2_0 = (CrossReference)cPropertyAssignment_2.eContents().get(0);
		private final RuleCall cPropertyPropertyDefinitionQualifiedNameParserRuleCall_2_0_1 = (RuleCall)cPropertyPropertyDefinitionCrossReference_2_0.eContents().get(1);
		private final Assignment cPropertyAssociationTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cPropertyAssociationTypePropertyAssociationTypeParserRuleCall_3_0 = (RuleCall)cPropertyAssociationTypeAssignment_3.eContents().get(0);
		private final Keyword cEqualsSignGreaterThanSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cValueAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cValuePropertyValueParserRuleCall_5_0 = (RuleCall)cValueAssignment_5.eContents().get(0);
		
		//PropertyAssociation av3::PropertyAssociation:
		//	target=ModelElementReference? '#' property=[av3::PropertyDefinition|QualifiedName]
		//	propertyAssociationType=PropertyAssociationType?
		//	'=>' value=PropertyValue;
		@Override public ParserRule getRule() { return rule; }
		
		//target=ModelElementReference? '#' property=[av3::PropertyDefinition|QualifiedName]
		//propertyAssociationType=PropertyAssociationType? '=>' value=PropertyValue
		public Group getGroup() { return cGroup; }
		
		//target=ModelElementReference?
		public Assignment getTargetAssignment_0() { return cTargetAssignment_0; }
		
		//ModelElementReference
		public RuleCall getTargetModelElementReferenceParserRuleCall_0_0() { return cTargetModelElementReferenceParserRuleCall_0_0; }
		
		//'#'
		public Keyword getNumberSignKeyword_1() { return cNumberSignKeyword_1; }
		
		//property=[av3::PropertyDefinition|QualifiedName]
		public Assignment getPropertyAssignment_2() { return cPropertyAssignment_2; }
		
		//[av3::PropertyDefinition|QualifiedName]
		public CrossReference getPropertyPropertyDefinitionCrossReference_2_0() { return cPropertyPropertyDefinitionCrossReference_2_0; }
		
		//QualifiedName
		public RuleCall getPropertyPropertyDefinitionQualifiedNameParserRuleCall_2_0_1() { return cPropertyPropertyDefinitionQualifiedNameParserRuleCall_2_0_1; }
		
		//propertyAssociationType=PropertyAssociationType?
		public Assignment getPropertyAssociationTypeAssignment_3() { return cPropertyAssociationTypeAssignment_3; }
		
		//PropertyAssociationType
		public RuleCall getPropertyAssociationTypePropertyAssociationTypeParserRuleCall_3_0() { return cPropertyAssociationTypePropertyAssociationTypeParserRuleCall_3_0; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_4() { return cEqualsSignGreaterThanSignKeyword_4; }
		
		//value=PropertyValue
		public Assignment getValueAssignment_5() { return cValueAssignment_5; }
		
		//PropertyValue
		public RuleCall getValuePropertyValueParserRuleCall_5_0() { return cValuePropertyValueParserRuleCall_5_0; }
	}
	public class PropertyValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.PropertyValue");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//PropertyValue av3::PropertyValue:
		//	value=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//value=INT
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_0() { return cValueINTTerminalRuleCall_0; }
	}
	public class ModelElementReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ModelElementReference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cElementAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cElementModelElementCrossReference_0_0 = (CrossReference)cElementAssignment_0.eContents().get(0);
		private final RuleCall cElementModelElementIDTerminalRuleCall_0_0_1 = (RuleCall)cElementModelElementCrossReference_0_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cGroup_1.eContents().get(0);
		private final Action cModelElementReferenceContextAction_1_0_0 = (Action)cGroup_1_0.eContents().get(0);
		private final Keyword cFullStopKeyword_1_0_1 = (Keyword)cGroup_1_0.eContents().get(1);
		private final Assignment cElementAssignment_1_0_2 = (Assignment)cGroup_1_0.eContents().get(2);
		private final CrossReference cElementModelElementCrossReference_1_0_2_0 = (CrossReference)cElementAssignment_1_0_2.eContents().get(0);
		private final RuleCall cElementModelElementIDTerminalRuleCall_1_0_2_0_1 = (RuleCall)cElementModelElementCrossReference_1_0_2_0.eContents().get(1);
		
		//ModelElementReference av3::ModelElementReference:
		//	element=[av3::ModelElement] => ({av3::ModelElementReference.context=current} '.' element=[av3::ModelElement])*;
		@Override public ParserRule getRule() { return rule; }
		
		//element=[av3::ModelElement] => ({av3::ModelElementReference.context=current} '.' element=[av3::ModelElement])*
		public Group getGroup() { return cGroup; }
		
		//element=[av3::ModelElement]
		public Assignment getElementAssignment_0() { return cElementAssignment_0; }
		
		//[av3::ModelElement]
		public CrossReference getElementModelElementCrossReference_0_0() { return cElementModelElementCrossReference_0_0; }
		
		//ID
		public RuleCall getElementModelElementIDTerminalRuleCall_0_0_1() { return cElementModelElementIDTerminalRuleCall_0_0_1; }
		
		//=> ({av3::ModelElementReference.context=current} '.' element=[av3::ModelElement])*
		public Group getGroup_1() { return cGroup_1; }
		
		//{av3::ModelElementReference.context=current} '.' element=[av3::ModelElement]
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//{av3::ModelElementReference.context=current}
		public Action getModelElementReferenceContextAction_1_0_0() { return cModelElementReferenceContextAction_1_0_0; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0_1() { return cFullStopKeyword_1_0_1; }
		
		//element=[av3::ModelElement]
		public Assignment getElementAssignment_1_0_2() { return cElementAssignment_1_0_2; }
		
		//[av3::ModelElement]
		public CrossReference getElementModelElementCrossReference_1_0_2_0() { return cElementModelElementCrossReference_1_0_2_0; }
		
		//ID
		public RuleCall getElementModelElementIDTerminalRuleCall_1_0_2_0_1() { return cElementModelElementIDTerminalRuleCall_1_0_2_0_1; }
	}
	public class ConfigurationElementBlockElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ConfigurationElementBlock");
		private final Group cGroup = (Group)rule.eContents().get(0);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Keyword cIsKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final RuleCall cConfigurationElementParserRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final Group cGroup_0_2 = (Group)cGroup_0.eContents().get(2);
		private final RuleCall cSEMICOLONParserRuleCall_0_2_0 = (RuleCall)cGroup_0_2.eContents().get(0);
		private final RuleCall cConfigurationElementParserRuleCall_0_2_1 = (RuleCall)cGroup_0_2.eContents().get(1);
		private final RuleCall cSEMICOLONParserRuleCall_0_3 = (RuleCall)cGroup_0.eContents().get(3);
		private final Keyword cEndKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//fragment ConfigurationElementBlock *:
		//	('is' ConfigurationElement (SEMICOLON ConfigurationElement)* SEMICOLON?)? 'end';
		@Override public ParserRule getRule() { return rule; }
		
		//('is' ConfigurationElement (SEMICOLON ConfigurationElement)* SEMICOLON?)? 'end'
		public Group getGroup() { return cGroup; }
		
		//('is' ConfigurationElement (SEMICOLON ConfigurationElement)* SEMICOLON?)?
		public Group getGroup_0() { return cGroup_0; }
		
		//'is'
		public Keyword getIsKeyword_0_0() { return cIsKeyword_0_0; }
		
		//ConfigurationElement
		public RuleCall getConfigurationElementParserRuleCall_0_1() { return cConfigurationElementParserRuleCall_0_1; }
		
		//(SEMICOLON ConfigurationElement)*
		public Group getGroup_0_2() { return cGroup_0_2; }
		
		//SEMICOLON
		public RuleCall getSEMICOLONParserRuleCall_0_2_0() { return cSEMICOLONParserRuleCall_0_2_0; }
		
		//ConfigurationElement
		public RuleCall getConfigurationElementParserRuleCall_0_2_1() { return cConfigurationElementParserRuleCall_0_2_1; }
		
		//SEMICOLON?
		public RuleCall getSEMICOLONParserRuleCall_0_3() { return cSEMICOLONParserRuleCall_0_3; }
		
		//'end'
		public Keyword getEndKeyword_1() { return cEndKeyword_1; }
	}
	public class CurlyConfigurationElementBlockElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.CurlyConfigurationElementBlock");
		private final Group cGroup = (Group)rule.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cConfigurationElementParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final RuleCall cSEMICOLONParserRuleCall_2_0 = (RuleCall)cGroup_2.eContents().get(0);
		private final RuleCall cConfigurationElementParserRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		private final RuleCall cSEMICOLONParserRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//fragment CurlyConfigurationElementBlock *:
		//	'{' ConfigurationElement (SEMICOLON ConfigurationElement)* SEMICOLON? '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'{' ConfigurationElement (SEMICOLON ConfigurationElement)* SEMICOLON? '}'
		public Group getGroup() { return cGroup; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }
		
		//ConfigurationElement
		public RuleCall getConfigurationElementParserRuleCall_1() { return cConfigurationElementParserRuleCall_1; }
		
		//(SEMICOLON ConfigurationElement)*
		public Group getGroup_2() { return cGroup_2; }
		
		//SEMICOLON
		public RuleCall getSEMICOLONParserRuleCall_2_0() { return cSEMICOLONParserRuleCall_2_0; }
		
		//ConfigurationElement
		public RuleCall getConfigurationElementParserRuleCall_2_1() { return cConfigurationElementParserRuleCall_2_1; }
		
		//SEMICOLON?
		public RuleCall getSEMICOLONParserRuleCall_3() { return cSEMICOLONParserRuleCall_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class ConfigurationElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ConfigurationElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(0);
		private final Assignment cPropertyAssociationsAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cPropertyAssociationsPropertyAssociationParserRuleCall_0_0 = (RuleCall)cPropertyAssociationsAssignment_0.eContents().get(0);
		private final Assignment cConfigurationAssignmentsAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cConfigurationAssignmentsConfigurationAssignmentParserRuleCall_1_0 = (RuleCall)cConfigurationAssignmentsAssignment_1.eContents().get(0);
		private final Assignment cConfigurationAssignmentsAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final RuleCall cConfigurationAssignmentsConfigurationAssignmentPatternParserRuleCall_2_0 = (RuleCall)cConfigurationAssignmentsAssignment_2.eContents().get(0);
		
		//fragment ConfigurationElement *:
		//	propertyAssociations+=PropertyAssociation | configurationAssignments+=ConfigurationAssignment |
		//	configurationAssignments+=ConfigurationAssignmentPattern;
		@Override public ParserRule getRule() { return rule; }
		
		//propertyAssociations+=PropertyAssociation | configurationAssignments+=ConfigurationAssignment |
		//configurationAssignments+=ConfigurationAssignmentPattern
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//propertyAssociations+=PropertyAssociation
		public Assignment getPropertyAssociationsAssignment_0() { return cPropertyAssociationsAssignment_0; }
		
		//PropertyAssociation
		public RuleCall getPropertyAssociationsPropertyAssociationParserRuleCall_0_0() { return cPropertyAssociationsPropertyAssociationParserRuleCall_0_0; }
		
		//configurationAssignments+=ConfigurationAssignment
		public Assignment getConfigurationAssignmentsAssignment_1() { return cConfigurationAssignmentsAssignment_1; }
		
		//ConfigurationAssignment
		public RuleCall getConfigurationAssignmentsConfigurationAssignmentParserRuleCall_1_0() { return cConfigurationAssignmentsConfigurationAssignmentParserRuleCall_1_0; }
		
		//configurationAssignments+=ConfigurationAssignmentPattern
		public Assignment getConfigurationAssignmentsAssignment_2() { return cConfigurationAssignmentsAssignment_2; }
		
		//ConfigurationAssignmentPattern
		public RuleCall getConfigurationAssignmentsConfigurationAssignmentPatternParserRuleCall_2_0() { return cConfigurationAssignmentsConfigurationAssignmentPatternParserRuleCall_2_0; }
	}
	public class ParametersElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.Parameters");
		private final Group cGroup = (Group)rule.eContents().get(0);
		private final Assignment cParameterizedAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cParameterizedLeftParenthesisKeyword_0_0 = (Keyword)cParameterizedAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cParametersAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cParametersConfigurationParameterParserRuleCall_1_0_0 = (RuleCall)cParametersAssignment_1_0.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cGroup_1.eContents().get(1);
		private final Keyword cCommaKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cParametersAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cParametersConfigurationParameterParserRuleCall_1_1_1_0 = (RuleCall)cParametersAssignment_1_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//fragment Parameters *:
		//	parameterized?='(' (parameters+=ConfigurationParameter (',' parameters+=ConfigurationParameter)*)? ')';
		@Override public ParserRule getRule() { return rule; }
		
		//parameterized?='(' (parameters+=ConfigurationParameter (',' parameters+=ConfigurationParameter)*)? ')'
		public Group getGroup() { return cGroup; }
		
		//parameterized?='('
		public Assignment getParameterizedAssignment_0() { return cParameterizedAssignment_0; }
		
		//'('
		public Keyword getParameterizedLeftParenthesisKeyword_0_0() { return cParameterizedLeftParenthesisKeyword_0_0; }
		
		//(parameters+=ConfigurationParameter (',' parameters+=ConfigurationParameter)*)?
		public Group getGroup_1() { return cGroup_1; }
		
		//parameters+=ConfigurationParameter
		public Assignment getParametersAssignment_1_0() { return cParametersAssignment_1_0; }
		
		//ConfigurationParameter
		public RuleCall getParametersConfigurationParameterParserRuleCall_1_0_0() { return cParametersConfigurationParameterParserRuleCall_1_0_0; }
		
		//(',' parameters+=ConfigurationParameter)*
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//','
		public Keyword getCommaKeyword_1_1_0() { return cCommaKeyword_1_1_0; }
		
		//parameters+=ConfigurationParameter
		public Assignment getParametersAssignment_1_1_1() { return cParametersAssignment_1_1_1; }
		
		//ConfigurationParameter
		public RuleCall getParametersConfigurationParameterParserRuleCall_1_1_1_0() { return cParametersConfigurationParameterParserRuleCall_1_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
	}
	public class ConfigurationParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ConfigurationParameter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cTypeTypeCrossReference_2_0 = (CrossReference)cTypeAssignment_2.eContents().get(0);
		private final RuleCall cTypeTypeQualifiedNameParserRuleCall_2_0_1 = (RuleCall)cTypeTypeCrossReference_2_0.eContents().get(1);
		
		//ConfigurationParameter av3::ConfigurationParameter:
		//	name=ID ':' type=[av3::Type|QualifiedName];
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' type=[av3::Type|QualifiedName]
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//type=[av3::Type|QualifiedName]
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }
		
		//[av3::Type|QualifiedName]
		public CrossReference getTypeTypeCrossReference_2_0() { return cTypeTypeCrossReference_2_0; }
		
		//QualifiedName
		public RuleCall getTypeTypeQualifiedNameParserRuleCall_2_0_1() { return cTypeTypeQualifiedNameParserRuleCall_2_0_1; }
	}
	public class ReversableInterfaceReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ReversableInterfaceReference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cReverseAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cReverseReverseKeyword_0_0 = (Keyword)cReverseAssignment_0.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cTypeComponentInterfaceCrossReference_1_0 = (CrossReference)cTypeAssignment_1.eContents().get(0);
		private final RuleCall cTypeComponentInterfaceQualifiedReferenceParserRuleCall_1_0_1 = (RuleCall)cTypeComponentInterfaceCrossReference_1_0.eContents().get(1);
		
		//// reference objects for classifiers including configurations with parameter
		//ReversableInterfaceReference av3::TypeReference:
		//	reverse?='reverse'? type=[av3::ComponentInterface|QualifiedReference];
		@Override public ParserRule getRule() { return rule; }
		
		//reverse?='reverse'? type=[av3::ComponentInterface|QualifiedReference]
		public Group getGroup() { return cGroup; }
		
		//reverse?='reverse'?
		public Assignment getReverseAssignment_0() { return cReverseAssignment_0; }
		
		//'reverse'
		public Keyword getReverseReverseKeyword_0_0() { return cReverseReverseKeyword_0_0; }
		
		//type=[av3::ComponentInterface|QualifiedReference]
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }
		
		//[av3::ComponentInterface|QualifiedReference]
		public CrossReference getTypeComponentInterfaceCrossReference_1_0() { return cTypeComponentInterfaceCrossReference_1_0; }
		
		//QualifiedReference
		public RuleCall getTypeComponentInterfaceQualifiedReferenceParserRuleCall_1_0_1() { return cTypeComponentInterfaceQualifiedReferenceParserRuleCall_1_0_1; }
	}
	public class TypeReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.TypeReference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cTypeTypeCrossReference_0_0 = (CrossReference)cTypeAssignment_0.eContents().get(0);
		private final RuleCall cTypeTypeQualifiedTypesReferenceParserRuleCall_0_0_1 = (RuleCall)cTypeTypeCrossReference_0_0.eContents().get(1);
		private final RuleCall cConfigurationActualsParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//TypeReference av3::TypeReference:
		//	type=[av3::Type|QualifiedTypesReference] ConfigurationActuals?;
		@Override public ParserRule getRule() { return rule; }
		
		//type=[av3::Type|QualifiedTypesReference] ConfigurationActuals?
		public Group getGroup() { return cGroup; }
		
		//type=[av3::Type|QualifiedTypesReference]
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }
		
		//[av3::Type|QualifiedTypesReference]
		public CrossReference getTypeTypeCrossReference_0_0() { return cTypeTypeCrossReference_0_0; }
		
		//QualifiedTypesReference
		public RuleCall getTypeTypeQualifiedTypesReferenceParserRuleCall_0_0_1() { return cTypeTypeQualifiedTypesReferenceParserRuleCall_0_0_1; }
		
		//ConfigurationActuals?
		public RuleCall getConfigurationActualsParserRuleCall_1() { return cConfigurationActualsParserRuleCall_1; }
	}
	public class RealizationReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.RealizationReference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cTypeComponentRealizationCrossReference_0_0 = (CrossReference)cTypeAssignment_0.eContents().get(0);
		private final RuleCall cTypeComponentRealizationQualifiedDottedReferenceParserRuleCall_0_0_1 = (RuleCall)cTypeComponentRealizationCrossReference_0_0.eContents().get(1);
		private final RuleCall cConfigurationActualsParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//RealizationReference av3::TypeReference:
		//	type=[av3::ComponentRealization|QualifiedDottedReference] ConfigurationActuals?;
		@Override public ParserRule getRule() { return rule; }
		
		//type=[av3::ComponentRealization|QualifiedDottedReference] ConfigurationActuals?
		public Group getGroup() { return cGroup; }
		
		//type=[av3::ComponentRealization|QualifiedDottedReference]
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }
		
		//[av3::ComponentRealization|QualifiedDottedReference]
		public CrossReference getTypeComponentRealizationCrossReference_0_0() { return cTypeComponentRealizationCrossReference_0_0; }
		
		//QualifiedDottedReference
		public RuleCall getTypeComponentRealizationQualifiedDottedReferenceParserRuleCall_0_0_1() { return cTypeComponentRealizationQualifiedDottedReferenceParserRuleCall_0_0_1; }
		
		//ConfigurationActuals?
		public RuleCall getConfigurationActualsParserRuleCall_1() { return cConfigurationActualsParserRuleCall_1; }
	}
	public class ImplementationReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ImplementationReference");
		private final Assignment cTypeAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cTypeComponentImplementationCrossReference_0 = (CrossReference)cTypeAssignment.eContents().get(0);
		private final RuleCall cTypeComponentImplementationQualifiedDottedReferenceParserRuleCall_0_1 = (RuleCall)cTypeComponentImplementationCrossReference_0.eContents().get(1);
		
		//ImplementationReference av3::TypeReference:
		//	type=[av3::ComponentImplementation|QualifiedDottedReference];
		@Override public ParserRule getRule() { return rule; }
		
		//type=[av3::ComponentImplementation|QualifiedDottedReference]
		public Assignment getTypeAssignment() { return cTypeAssignment; }
		
		//[av3::ComponentImplementation|QualifiedDottedReference]
		public CrossReference getTypeComponentImplementationCrossReference_0() { return cTypeComponentImplementationCrossReference_0; }
		
		//QualifiedDottedReference
		public RuleCall getTypeComponentImplementationQualifiedDottedReferenceParserRuleCall_0_1() { return cTypeComponentImplementationQualifiedDottedReferenceParserRuleCall_0_1; }
	}
	public class PropertiesBlockElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.PropertiesBlock");
		private final Group cGroup = (Group)rule.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPropertyAssociationsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPropertyAssociationsPropertyAssociationParserRuleCall_1_0 = (RuleCall)cPropertyAssociationsAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final RuleCall cSEMICOLONParserRuleCall_2_0 = (RuleCall)cGroup_2.eContents().get(0);
		private final Assignment cPropertyAssociationsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cPropertyAssociationsPropertyAssociationParserRuleCall_2_1_0 = (RuleCall)cPropertyAssociationsAssignment_2_1.eContents().get(0);
		private final RuleCall cSEMICOLONParserRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//fragment PropertiesBlock *:
		//	'{' propertyAssociations+=PropertyAssociation (SEMICOLON propertyAssociations+=PropertyAssociation)* SEMICOLON? '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'{' propertyAssociations+=PropertyAssociation (SEMICOLON propertyAssociations+=PropertyAssociation)* SEMICOLON? '}'
		public Group getGroup() { return cGroup; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }
		
		//propertyAssociations+=PropertyAssociation
		public Assignment getPropertyAssociationsAssignment_1() { return cPropertyAssociationsAssignment_1; }
		
		//PropertyAssociation
		public RuleCall getPropertyAssociationsPropertyAssociationParserRuleCall_1_0() { return cPropertyAssociationsPropertyAssociationParserRuleCall_1_0; }
		
		//(SEMICOLON propertyAssociations+=PropertyAssociation)*
		public Group getGroup_2() { return cGroup_2; }
		
		//SEMICOLON
		public RuleCall getSEMICOLONParserRuleCall_2_0() { return cSEMICOLONParserRuleCall_2_0; }
		
		//propertyAssociations+=PropertyAssociation
		public Assignment getPropertyAssociationsAssignment_2_1() { return cPropertyAssociationsAssignment_2_1; }
		
		//PropertyAssociation
		public RuleCall getPropertyAssociationsPropertyAssociationParserRuleCall_2_1_0() { return cPropertyAssociationsPropertyAssociationParserRuleCall_2_1_0; }
		
		//SEMICOLON?
		public RuleCall getSEMICOLONParserRuleCall_3() { return cSEMICOLONParserRuleCall_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class NestedComponentImplementationBlockElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.NestedComponentImplementationBlock");
		private final Group cGroup = (Group)rule.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cNestedImplementationElementParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final RuleCall cSEMICOLONParserRuleCall_2_0 = (RuleCall)cGroup_2.eContents().get(0);
		private final RuleCall cNestedImplementationElementParserRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		private final RuleCall cSEMICOLONParserRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//// to be used for inline nested component implementations 
		//fragment NestedComponentImplementationBlock *:
		//	'{' NestedImplementationElement (SEMICOLON NestedImplementationElement)* SEMICOLON?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'{' NestedImplementationElement (SEMICOLON NestedImplementationElement)* SEMICOLON? '}'
		public Group getGroup() { return cGroup; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }
		
		//NestedImplementationElement
		public RuleCall getNestedImplementationElementParserRuleCall_1() { return cNestedImplementationElementParserRuleCall_1; }
		
		//(SEMICOLON NestedImplementationElement)*
		public Group getGroup_2() { return cGroup_2; }
		
		//SEMICOLON
		public RuleCall getSEMICOLONParserRuleCall_2_0() { return cSEMICOLONParserRuleCall_2_0; }
		
		//NestedImplementationElement
		public RuleCall getNestedImplementationElementParserRuleCall_2_1() { return cNestedImplementationElementParserRuleCall_2_1; }
		
		//SEMICOLON?
		public RuleCall getSEMICOLONParserRuleCall_3() { return cSEMICOLONParserRuleCall_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class NestedImplementationElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.NestedImplementationElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(0);
		private final Assignment cFeaturesAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cFeaturesFeatureParserRuleCall_0_0 = (RuleCall)cFeaturesAssignment_0.eContents().get(0);
		private final Assignment cConnectionsAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cConnectionsConnectionParserRuleCall_1_0 = (RuleCall)cConnectionsAssignment_1.eContents().get(0);
		private final Assignment cConnectionsAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final RuleCall cConnectionsFeatureMappingParserRuleCall_2_0 = (RuleCall)cConnectionsAssignment_2.eContents().get(0);
		private final Assignment cComponentsAssignment_3 = (Assignment)cAlternatives.eContents().get(3);
		private final RuleCall cComponentsComponentParserRuleCall_3_0 = (RuleCall)cComponentsAssignment_3.eContents().get(0);
		private final Assignment cPropertyAssociationsAssignment_4 = (Assignment)cAlternatives.eContents().get(4);
		private final RuleCall cPropertyAssociationsPropertyAssociationParserRuleCall_4_0 = (RuleCall)cPropertyAssociationsAssignment_4.eContents().get(0);
		
		//fragment NestedImplementationElement *:
		//	features+=Feature | connections+=Connection | connections+=FeatureMapping | components+=Component |
		//	propertyAssociations+=PropertyAssociation;
		@Override public ParserRule getRule() { return rule; }
		
		//features+=Feature | connections+=Connection | connections+=FeatureMapping | components+=Component |
		//propertyAssociations+=PropertyAssociation
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//features+=Feature
		public Assignment getFeaturesAssignment_0() { return cFeaturesAssignment_0; }
		
		//Feature
		public RuleCall getFeaturesFeatureParserRuleCall_0_0() { return cFeaturesFeatureParserRuleCall_0_0; }
		
		//connections+=Connection
		public Assignment getConnectionsAssignment_1() { return cConnectionsAssignment_1; }
		
		//Connection
		public RuleCall getConnectionsConnectionParserRuleCall_1_0() { return cConnectionsConnectionParserRuleCall_1_0; }
		
		//connections+=FeatureMapping
		public Assignment getConnectionsAssignment_2() { return cConnectionsAssignment_2; }
		
		//FeatureMapping
		public RuleCall getConnectionsFeatureMappingParserRuleCall_2_0() { return cConnectionsFeatureMappingParserRuleCall_2_0; }
		
		//components+=Component
		public Assignment getComponentsAssignment_3() { return cComponentsAssignment_3; }
		
		//Component
		public RuleCall getComponentsComponentParserRuleCall_3_0() { return cComponentsComponentParserRuleCall_3_0; }
		
		//propertyAssociations+=PropertyAssociation
		public Assignment getPropertyAssociationsAssignment_4() { return cPropertyAssociationsAssignment_4; }
		
		//PropertyAssociation
		public RuleCall getPropertyAssociationsPropertyAssociationParserRuleCall_4_0() { return cPropertyAssociationsPropertyAssociationParserRuleCall_4_0; }
	}
	public class ConfigurationExtensionsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ConfigurationExtensions");
		private final Group cGroup = (Group)rule.eContents().get(0);
		private final Assignment cSuperClassifiersAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cSuperClassifiersRealizationReferenceParserRuleCall_0_0 = (RuleCall)cSuperClassifiersAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCommaKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cSuperClassifiersAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cSuperClassifiersRealizationReferenceParserRuleCall_1_1_0 = (RuleCall)cSuperClassifiersAssignment_1_1.eContents().get(0);
		
		//fragment ConfigurationExtensions *:
		//	superClassifiers+=RealizationReference ("," superClassifiers+=RealizationReference)*;
		@Override public ParserRule getRule() { return rule; }
		
		//superClassifiers+=RealizationReference ("," superClassifiers+=RealizationReference)*
		public Group getGroup() { return cGroup; }
		
		//superClassifiers+=RealizationReference
		public Assignment getSuperClassifiersAssignment_0() { return cSuperClassifiersAssignment_0; }
		
		//RealizationReference
		public RuleCall getSuperClassifiersRealizationReferenceParserRuleCall_0_0() { return cSuperClassifiersRealizationReferenceParserRuleCall_0_0; }
		
		//("," superClassifiers+=RealizationReference)*
		public Group getGroup_1() { return cGroup_1; }
		
		//","
		public Keyword getCommaKeyword_1_0() { return cCommaKeyword_1_0; }
		
		//superClassifiers+=RealizationReference
		public Assignment getSuperClassifiersAssignment_1_1() { return cSuperClassifiersAssignment_1_1; }
		
		//RealizationReference
		public RuleCall getSuperClassifiersRealizationReferenceParserRuleCall_1_1_0() { return cSuperClassifiersRealizationReferenceParserRuleCall_1_1_0; }
	}
	public class ImplementationExtensionsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ImplementationExtensions");
		private final Group cGroup = (Group)rule.eContents().get(0);
		private final Assignment cSuperClassifiersAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cSuperClassifiersImplementationReferenceParserRuleCall_0_0 = (RuleCall)cSuperClassifiersAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCommaKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cSuperClassifiersAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cSuperClassifiersImplementationReferenceParserRuleCall_1_1_0 = (RuleCall)cSuperClassifiersAssignment_1_1.eContents().get(0);
		
		//fragment ImplementationExtensions *:
		//	superClassifiers+=ImplementationReference ("," superClassifiers+=ImplementationReference)*;
		@Override public ParserRule getRule() { return rule; }
		
		//superClassifiers+=ImplementationReference ("," superClassifiers+=ImplementationReference)*
		public Group getGroup() { return cGroup; }
		
		//superClassifiers+=ImplementationReference
		public Assignment getSuperClassifiersAssignment_0() { return cSuperClassifiersAssignment_0; }
		
		//ImplementationReference
		public RuleCall getSuperClassifiersImplementationReferenceParserRuleCall_0_0() { return cSuperClassifiersImplementationReferenceParserRuleCall_0_0; }
		
		//("," superClassifiers+=ImplementationReference)*
		public Group getGroup_1() { return cGroup_1; }
		
		//","
		public Keyword getCommaKeyword_1_0() { return cCommaKeyword_1_0; }
		
		//superClassifiers+=ImplementationReference
		public Assignment getSuperClassifiersAssignment_1_1() { return cSuperClassifiersAssignment_1_1; }
		
		//ImplementationReference
		public RuleCall getSuperClassifiersImplementationReferenceParserRuleCall_1_1_0() { return cSuperClassifiersImplementationReferenceParserRuleCall_1_1_0; }
	}
	public class InterfaceExtensionsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.InterfaceExtensions");
		private final Group cGroup = (Group)rule.eContents().get(0);
		private final Assignment cSuperClassifiersAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cSuperClassifiersReversableInterfaceReferenceParserRuleCall_0_0 = (RuleCall)cSuperClassifiersAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCommaKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cSuperClassifiersAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cSuperClassifiersReversableInterfaceReferenceParserRuleCall_1_1_0 = (RuleCall)cSuperClassifiersAssignment_1_1.eContents().get(0);
		
		//fragment InterfaceExtensions *:
		//	superClassifiers+=ReversableInterfaceReference ("," superClassifiers+=ReversableInterfaceReference)*;
		@Override public ParserRule getRule() { return rule; }
		
		//superClassifiers+=ReversableInterfaceReference ("," superClassifiers+=ReversableInterfaceReference)*
		public Group getGroup() { return cGroup; }
		
		//superClassifiers+=ReversableInterfaceReference
		public Assignment getSuperClassifiersAssignment_0() { return cSuperClassifiersAssignment_0; }
		
		//ReversableInterfaceReference
		public RuleCall getSuperClassifiersReversableInterfaceReferenceParserRuleCall_0_0() { return cSuperClassifiersReversableInterfaceReferenceParserRuleCall_0_0; }
		
		//("," superClassifiers+=ReversableInterfaceReference)*
		public Group getGroup_1() { return cGroup_1; }
		
		//","
		public Keyword getCommaKeyword_1_0() { return cCommaKeyword_1_0; }
		
		//superClassifiers+=ReversableInterfaceReference
		public Assignment getSuperClassifiersAssignment_1_1() { return cSuperClassifiersAssignment_1_1; }
		
		//ReversableInterfaceReference
		public RuleCall getSuperClassifiersReversableInterfaceReferenceParserRuleCall_1_1_0() { return cSuperClassifiersReversableInterfaceReferenceParserRuleCall_1_1_0; }
	}
	public class ConfigurationActualsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ConfigurationActuals");
		private final Group cGroup = (Group)rule.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cActualsAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cActualsConfigurationActualParserRuleCall_1_0_0 = (RuleCall)cActualsAssignment_1_0.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cGroup_1.eContents().get(1);
		private final Keyword cCommaKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cActualsAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cActualsConfigurationActualParserRuleCall_1_1_1_0 = (RuleCall)cActualsAssignment_1_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//fragment ConfigurationActuals *:
		//	'(' (actuals+=ConfigurationActual (',' actuals+=ConfigurationActual)*)? ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'(' (actuals+=ConfigurationActual (',' actuals+=ConfigurationActual)*)? ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//(actuals+=ConfigurationActual (',' actuals+=ConfigurationActual)*)?
		public Group getGroup_1() { return cGroup_1; }
		
		//actuals+=ConfigurationActual
		public Assignment getActualsAssignment_1_0() { return cActualsAssignment_1_0; }
		
		//ConfigurationActual
		public RuleCall getActualsConfigurationActualParserRuleCall_1_0_0() { return cActualsConfigurationActualParserRuleCall_1_0_0; }
		
		//(',' actuals+=ConfigurationActual)*
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//','
		public Keyword getCommaKeyword_1_1_0() { return cCommaKeyword_1_1_0; }
		
		//actuals+=ConfigurationActual
		public Assignment getActualsAssignment_1_1_1() { return cActualsAssignment_1_1_1; }
		
		//ConfigurationActual
		public RuleCall getActualsConfigurationActualParserRuleCall_1_1_1_0() { return cActualsConfigurationActualParserRuleCall_1_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
	}
	public class ConfigurationActualElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ConfigurationActual");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cParameterAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cParameterConfigurationParameterCrossReference_0_0 = (CrossReference)cParameterAssignment_0.eContents().get(0);
		private final RuleCall cParameterConfigurationParameterIDTerminalRuleCall_0_0_1 = (RuleCall)cParameterConfigurationParameterCrossReference_0_0.eContents().get(1);
		private final Keyword cEqualsSignGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cAssignedClassifiersAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAssignedClassifiersTypeReferenceParserRuleCall_2_0 = (RuleCall)cAssignedClassifiersAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCommaKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cAssignedClassifiersAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cAssignedClassifiersTypeReferenceParserRuleCall_3_1_0 = (RuleCall)cAssignedClassifiersAssignment_3_1.eContents().get(0);
		
		//ConfigurationActual av3::ConfigurationActual:
		//	parameter=[av3::ConfigurationParameter] '=>' assignedClassifiers+=TypeReference (','
		//	assignedClassifiers+=TypeReference)*;
		@Override public ParserRule getRule() { return rule; }
		
		//parameter=[av3::ConfigurationParameter] '=>' assignedClassifiers+=TypeReference (','
		//assignedClassifiers+=TypeReference)*
		public Group getGroup() { return cGroup; }
		
		//parameter=[av3::ConfigurationParameter]
		public Assignment getParameterAssignment_0() { return cParameterAssignment_0; }
		
		//[av3::ConfigurationParameter]
		public CrossReference getParameterConfigurationParameterCrossReference_0_0() { return cParameterConfigurationParameterCrossReference_0_0; }
		
		//ID
		public RuleCall getParameterConfigurationParameterIDTerminalRuleCall_0_0_1() { return cParameterConfigurationParameterIDTerminalRuleCall_0_0_1; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_1() { return cEqualsSignGreaterThanSignKeyword_1; }
		
		//assignedClassifiers+=TypeReference
		public Assignment getAssignedClassifiersAssignment_2() { return cAssignedClassifiersAssignment_2; }
		
		//TypeReference
		public RuleCall getAssignedClassifiersTypeReferenceParserRuleCall_2_0() { return cAssignedClassifiersTypeReferenceParserRuleCall_2_0; }
		
		//(',' assignedClassifiers+=TypeReference)*
		public Group getGroup_3() { return cGroup_3; }
		
		//','
		public Keyword getCommaKeyword_3_0() { return cCommaKeyword_3_0; }
		
		//assignedClassifiers+=TypeReference
		public Assignment getAssignedClassifiersAssignment_3_1() { return cAssignedClassifiersAssignment_3_1; }
		
		//TypeReference
		public RuleCall getAssignedClassifiersTypeReferenceParserRuleCall_3_1_0() { return cAssignedClassifiersTypeReferenceParserRuleCall_3_1_0; }
	}
	public class WorkingsetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.Workingset");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWorkingsetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameQualifiedNameParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cIsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final RuleCall cUsePropsParserRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Assignment cRootComponentsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cRootComponentsComponentParserRuleCall_4_0 = (RuleCall)cRootComponentsAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final RuleCall cSEMICOLONParserRuleCall_5_0 = (RuleCall)cGroup_5.eContents().get(0);
		private final Assignment cRootComponentsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cRootComponentsComponentParserRuleCall_5_1_0 = (RuleCall)cRootComponentsAssignment_5_1.eContents().get(0);
		private final RuleCall cSEMICOLONParserRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		private final Keyword cEndKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final RuleCall cSEMICOLONParserRuleCall_8 = (RuleCall)cGroup.eContents().get(8);
		
		//Workingset av3::Workingset:
		//	'workingset' name=QualifiedName 'is'
		//	UseProps?
		//	rootComponents+=Component (SEMICOLON rootComponents+=Component)* SEMICOLON?
		//	'end' SEMICOLON;
		@Override public ParserRule getRule() { return rule; }
		
		//'workingset' name=QualifiedName 'is' UseProps? rootComponents+=Component (SEMICOLON rootComponents+=Component)*
		//SEMICOLON? 'end' SEMICOLON
		public Group getGroup() { return cGroup; }
		
		//'workingset'
		public Keyword getWorkingsetKeyword_0() { return cWorkingsetKeyword_0; }
		
		//name=QualifiedName
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_1_0() { return cNameQualifiedNameParserRuleCall_1_0; }
		
		//'is'
		public Keyword getIsKeyword_2() { return cIsKeyword_2; }
		
		//UseProps?
		public RuleCall getUsePropsParserRuleCall_3() { return cUsePropsParserRuleCall_3; }
		
		//rootComponents+=Component
		public Assignment getRootComponentsAssignment_4() { return cRootComponentsAssignment_4; }
		
		//Component
		public RuleCall getRootComponentsComponentParserRuleCall_4_0() { return cRootComponentsComponentParserRuleCall_4_0; }
		
		//(SEMICOLON rootComponents+=Component)*
		public Group getGroup_5() { return cGroup_5; }
		
		//SEMICOLON
		public RuleCall getSEMICOLONParserRuleCall_5_0() { return cSEMICOLONParserRuleCall_5_0; }
		
		//rootComponents+=Component
		public Assignment getRootComponentsAssignment_5_1() { return cRootComponentsAssignment_5_1; }
		
		//Component
		public RuleCall getRootComponentsComponentParserRuleCall_5_1_0() { return cRootComponentsComponentParserRuleCall_5_1_0; }
		
		//SEMICOLON?
		public RuleCall getSEMICOLONParserRuleCall_6() { return cSEMICOLONParserRuleCall_6; }
		
		//'end'
		public Keyword getEndKeyword_7() { return cEndKeyword_7; }
		
		//SEMICOLON
		public RuleCall getSEMICOLONParserRuleCall_8() { return cSEMICOLONParserRuleCall_8; }
	}
	public class QualifiedNameWithWildcardElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.QualifiedNameWithWildcard");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cQualifiedNameParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cColonColonAsteriskKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//QualifiedNameWithWildcard:
		//	QualifiedName '::*';
		@Override public ParserRule getRule() { return rule; }
		
		//QualifiedName '::*'
		public Group getGroup() { return cGroup; }
		
		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall_0() { return cQualifiedNameParserRuleCall_0; }
		
		//'::*'
		public Keyword getColonColonAsteriskKeyword_1() { return cColonColonAsteriskKeyword_1; }
	}
	public class DottedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.DottedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//DottedName:
		//	ID '.' ID;
		@Override public ParserRule getRule() { return rule; }
		
		//ID '.' ID
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//'.'
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_2() { return cIDTerminalRuleCall_2; }
	}
	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cColonColonKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ID ('::' ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ('::' ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('::' ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'::'
		public Keyword getColonColonKeyword_1_0() { return cColonColonKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	public class QualifiedTypesReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.QualifiedTypesReference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cQualifiedNameParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedTypesReference:
		//	QualifiedName ('.' ID)?;
		@Override public ParserRule getRule() { return rule; }
		
		//QualifiedName ('.' ID)?
		public Group getGroup() { return cGroup; }
		
		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall_0() { return cQualifiedNameParserRuleCall_0; }
		
		//('.' ID)?
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	public class QualifiedReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.QualifiedReference");
		private final RuleCall cQualifiedNameParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//QualifiedReference:
		//	QualifiedName;
		@Override public ParserRule getRule() { return rule; }
		
		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall() { return cQualifiedNameParserRuleCall; }
	}
	public class QualifiedDottedReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.QualifiedDottedReference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cQualifiedNameParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//QualifiedDottedReference:
		//	QualifiedName '.' ID;
		@Override public ParserRule getRule() { return rule; }
		
		//QualifiedName '.' ID
		public Group getGroup() { return cGroup; }
		
		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall_0() { return cQualifiedNameParserRuleCall_0; }
		
		//'.'
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_2() { return cIDTerminalRuleCall_2; }
	}
	public class SEMICOLONElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.SEMICOLON");
		private final Keyword cSemicolonKeyword = (Keyword)rule.eContents().get(1);
		
		//SEMICOLON:
		//	';';
		@Override public ParserRule getRule() { return rule; }
		
		//';'
		public Keyword getSemicolonKeyword() { return cSemicolonKeyword; }
	}
	public class ComponentCategoryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ComponentCategory");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cAbstractKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cBusKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cDataKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cDeviceKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cMemoryKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		private final Keyword cProcessKeyword_5 = (Keyword)cAlternatives.eContents().get(5);
		private final Keyword cProcessorKeyword_6 = (Keyword)cAlternatives.eContents().get(6);
		private final Keyword cSystemKeyword_7 = (Keyword)cAlternatives.eContents().get(7);
		private final Keyword cThreadKeyword_8 = (Keyword)cAlternatives.eContents().get(8);
		private final RuleCall cVirtualBusKeywordsParserRuleCall_9 = (RuleCall)cAlternatives.eContents().get(9);
		private final RuleCall cVirtualProcessorKeywordsParserRuleCall_10 = (RuleCall)cAlternatives.eContents().get(10);
		private final RuleCall cVirtualMemoryKeywordsParserRuleCall_11 = (RuleCall)cAlternatives.eContents().get(11);
		private final RuleCall cVirtualDeviceKeywordsParserRuleCall_12 = (RuleCall)cAlternatives.eContents().get(12);
		private final Keyword cSubprogramKeyword_13 = (Keyword)cAlternatives.eContents().get(13);
		private final RuleCall cSubprogramGroupKeywordsParserRuleCall_14 = (RuleCall)cAlternatives.eContents().get(14);
		private final RuleCall cThreadGroupKeywordsParserRuleCall_15 = (RuleCall)cAlternatives.eContents().get(15);
		
		//ComponentCategory av3::ComponentCategory:
		//	'abstract' | 'bus' | 'data'
		//	| 'device' | 'memory' | 'process' | 'processor' | 'system'
		//	| 'thread' | VirtualBusKeywords | VirtualProcessorKeywords | VirtualMemoryKeywords | VirtualDeviceKeywords
		//	| 'subprogram' | SubprogramGroupKeywords | ThreadGroupKeywords;
		@Override public ParserRule getRule() { return rule; }
		
		//'abstract' | 'bus' | 'data' | 'device' | 'memory' | 'process' | 'processor' | 'system' | 'thread' | VirtualBusKeywords |
		//VirtualProcessorKeywords | VirtualMemoryKeywords | VirtualDeviceKeywords | 'subprogram' | SubprogramGroupKeywords |
		//ThreadGroupKeywords
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'abstract'
		public Keyword getAbstractKeyword_0() { return cAbstractKeyword_0; }
		
		//'bus'
		public Keyword getBusKeyword_1() { return cBusKeyword_1; }
		
		//'data'
		public Keyword getDataKeyword_2() { return cDataKeyword_2; }
		
		//'device'
		public Keyword getDeviceKeyword_3() { return cDeviceKeyword_3; }
		
		//'memory'
		public Keyword getMemoryKeyword_4() { return cMemoryKeyword_4; }
		
		//'process'
		public Keyword getProcessKeyword_5() { return cProcessKeyword_5; }
		
		//'processor'
		public Keyword getProcessorKeyword_6() { return cProcessorKeyword_6; }
		
		//'system'
		public Keyword getSystemKeyword_7() { return cSystemKeyword_7; }
		
		//'thread'
		public Keyword getThreadKeyword_8() { return cThreadKeyword_8; }
		
		//VirtualBusKeywords
		public RuleCall getVirtualBusKeywordsParserRuleCall_9() { return cVirtualBusKeywordsParserRuleCall_9; }
		
		//VirtualProcessorKeywords
		public RuleCall getVirtualProcessorKeywordsParserRuleCall_10() { return cVirtualProcessorKeywordsParserRuleCall_10; }
		
		//VirtualMemoryKeywords
		public RuleCall getVirtualMemoryKeywordsParserRuleCall_11() { return cVirtualMemoryKeywordsParserRuleCall_11; }
		
		//VirtualDeviceKeywords
		public RuleCall getVirtualDeviceKeywordsParserRuleCall_12() { return cVirtualDeviceKeywordsParserRuleCall_12; }
		
		//'subprogram'
		public Keyword getSubprogramKeyword_13() { return cSubprogramKeyword_13; }
		
		//SubprogramGroupKeywords
		public RuleCall getSubprogramGroupKeywordsParserRuleCall_14() { return cSubprogramGroupKeywordsParserRuleCall_14; }
		
		//ThreadGroupKeywords
		public RuleCall getThreadGroupKeywordsParserRuleCall_15() { return cThreadGroupKeywordsParserRuleCall_15; }
	}
	public class FeatureCategoryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.FeatureCategory");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cFeatureKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cPortKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cAccessKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final RuleCall cBusAccessKeywordsParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cBindingPointKeywordsParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final Keyword cInterfaceKeyword_5 = (Keyword)cAlternatives.eContents().get(5);
		
		//FeatureCategory av3::FeatureCategory:
		//	'feature' | 'port' | 'access'
		//	| BusAccessKeywords
		//	| BindingPointKeywords | 'interface';
		@Override public ParserRule getRule() { return rule; }
		
		//'feature' | 'port' | 'access' | BusAccessKeywords | BindingPointKeywords | 'interface'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'feature'
		public Keyword getFeatureKeyword_0() { return cFeatureKeyword_0; }
		
		//'port'
		public Keyword getPortKeyword_1() { return cPortKeyword_1; }
		
		//'access'
		public Keyword getAccessKeyword_2() { return cAccessKeyword_2; }
		
		//BusAccessKeywords
		public RuleCall getBusAccessKeywordsParserRuleCall_3() { return cBusAccessKeywordsParserRuleCall_3; }
		
		//BindingPointKeywords
		public RuleCall getBindingPointKeywordsParserRuleCall_4() { return cBindingPointKeywordsParserRuleCall_4; }
		
		//'interface'
		public Keyword getInterfaceKeyword_5() { return cInterfaceKeyword_5; }
	}
	public class FeatureDirectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.FeatureDirection");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cInKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cOutKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final RuleCall cInOutKeywordsParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final Keyword cRequiresKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cProvidesKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		private final RuleCall cProvidesReadKeywordsParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cRequiresReadKeywordsParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cProvidesWriteKeywordsParserRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);
		private final RuleCall cRequiresWriteKeywordsParserRuleCall_8 = (RuleCall)cAlternatives.eContents().get(8);
		private final RuleCall cProvidesRWKeywordsParserRuleCall_9 = (RuleCall)cAlternatives.eContents().get(9);
		private final RuleCall cRequiresRWKeywordsParserRuleCall_10 = (RuleCall)cAlternatives.eContents().get(10);
		
		//FeatureDirection av3::FeatureDirection:
		//	'in' | 'out'
		//	| InOutKeywords | 'requires' | 'provides' | ProvidesReadKeywords | RequiresReadKeywords | ProvidesWriteKeywords |
		//	RequiresWriteKeywords | ProvidesRWKeywords | RequiresRWKeywords;
		@Override public ParserRule getRule() { return rule; }
		
		//'in' | 'out' | InOutKeywords | 'requires' | 'provides' | ProvidesReadKeywords | RequiresReadKeywords |
		//ProvidesWriteKeywords | RequiresWriteKeywords | ProvidesRWKeywords | RequiresRWKeywords
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'in'
		public Keyword getInKeyword_0() { return cInKeyword_0; }
		
		//'out'
		public Keyword getOutKeyword_1() { return cOutKeyword_1; }
		
		//InOutKeywords
		public RuleCall getInOutKeywordsParserRuleCall_2() { return cInOutKeywordsParserRuleCall_2; }
		
		//'requires'
		public Keyword getRequiresKeyword_3() { return cRequiresKeyword_3; }
		
		//'provides'
		public Keyword getProvidesKeyword_4() { return cProvidesKeyword_4; }
		
		//ProvidesReadKeywords
		public RuleCall getProvidesReadKeywordsParserRuleCall_5() { return cProvidesReadKeywordsParserRuleCall_5; }
		
		//RequiresReadKeywords
		public RuleCall getRequiresReadKeywordsParserRuleCall_6() { return cRequiresReadKeywordsParserRuleCall_6; }
		
		//ProvidesWriteKeywords
		public RuleCall getProvidesWriteKeywordsParserRuleCall_7() { return cProvidesWriteKeywordsParserRuleCall_7; }
		
		//RequiresWriteKeywords
		public RuleCall getRequiresWriteKeywordsParserRuleCall_8() { return cRequiresWriteKeywordsParserRuleCall_8; }
		
		//ProvidesRWKeywords
		public RuleCall getProvidesRWKeywordsParserRuleCall_9() { return cProvidesRWKeywordsParserRuleCall_9; }
		
		//RequiresRWKeywords
		public RuleCall getRequiresRWKeywordsParserRuleCall_10() { return cRequiresRWKeywordsParserRuleCall_10; }
	}
	public class AssociationTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.AssociationType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cConnectionTypeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMappingTypeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cFlowTypeParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//AssociationType av3::AssociationType:
		//	ConnectionType | MappingType | FlowType;
		@Override public ParserRule getRule() { return rule; }
		
		//ConnectionType | MappingType | FlowType
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ConnectionType
		public RuleCall getConnectionTypeParserRuleCall_0() { return cConnectionTypeParserRuleCall_0; }
		
		//MappingType
		public RuleCall getMappingTypeParserRuleCall_1() { return cMappingTypeParserRuleCall_1; }
		
		//FlowType
		public RuleCall getFlowTypeParserRuleCall_2() { return cFlowTypeParserRuleCall_2; }
	}
	public class ConnectionTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ConnectionType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cConnectionKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cBindingKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//ConnectionType av3::AssociationType:
		//	'connection' | 'binding';
		@Override public ParserRule getRule() { return rule; }
		
		//'connection' | 'binding'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'connection'
		public Keyword getConnectionKeyword_0() { return cConnectionKeyword_0; }
		
		//'binding'
		public Keyword getBindingKeyword_1() { return cBindingKeyword_1; }
	}
	public class MappingTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.MappingType");
		private final Keyword cMappingKeyword = (Keyword)rule.eContents().get(1);
		
		//MappingType av3::AssociationType:
		//	'mapping';
		@Override public ParserRule getRule() { return rule; }
		
		//'mapping'
		public Keyword getMappingKeyword() { return cMappingKeyword; }
	}
	public class FlowPathTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.FlowPathType");
		private final RuleCall cFlowPathKeywordsParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//FlowPathType av3::AssociationType:
		//	FlowPathKeywords;
		@Override public ParserRule getRule() { return rule; }
		
		//FlowPathKeywords
		public RuleCall getFlowPathKeywordsParserRuleCall() { return cFlowPathKeywordsParserRuleCall; }
	}
	public class FlowSourceTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.FlowSourceType");
		private final RuleCall cFlowSourceKeywordsParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//FlowSourceType av3::AssociationType:
		//	FlowSourceKeywords;
		@Override public ParserRule getRule() { return rule; }
		
		//FlowSourceKeywords
		public RuleCall getFlowSourceKeywordsParserRuleCall() { return cFlowSourceKeywordsParserRuleCall; }
	}
	public class FlowSinkTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.FlowSinkType");
		private final RuleCall cFlowSinkKeywordsParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//FlowSinkType av3::AssociationType:
		//	FlowSinkKeywords;
		@Override public ParserRule getRule() { return rule; }
		
		//FlowSinkKeywords
		public RuleCall getFlowSinkKeywordsParserRuleCall() { return cFlowSinkKeywordsParserRuleCall; }
	}
	public class FlowTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.FlowType");
		private final Keyword cFlowKeyword = (Keyword)rule.eContents().get(1);
		
		//FlowType av3::AssociationType:
		//	'flow';
		@Override public ParserRule getRule() { return rule; }
		
		//'flow'
		public Keyword getFlowKeyword() { return cFlowKeyword; }
	}
	public class PropertyAssociationTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.PropertyAssociationType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cFinalKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cDefaultKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cOverrideKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		
		//PropertyAssociationType av3::PropertyAssociationType:
		//	'final' | 'default' | 'override';
		@Override public ParserRule getRule() { return rule; }
		
		//'final' | 'default' | 'override'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'final'
		public Keyword getFinalKeyword_0() { return cFinalKeyword_0; }
		
		//'default'
		public Keyword getDefaultKeyword_1() { return cDefaultKeyword_1; }
		
		//'override'
		public Keyword getOverrideKeyword_2() { return cOverrideKeyword_2; }
	}
	public class VirtualProcessorKeywordsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.VirtualProcessorKeywords");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVirtualKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cProcessorKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//VirtualProcessorKeywords:
		//	'virtual' 'processor';
		@Override public ParserRule getRule() { return rule; }
		
		//'virtual' 'processor'
		public Group getGroup() { return cGroup; }
		
		//'virtual'
		public Keyword getVirtualKeyword_0() { return cVirtualKeyword_0; }
		
		//'processor'
		public Keyword getProcessorKeyword_1() { return cProcessorKeyword_1; }
	}
	public class VirtualBusKeywordsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.VirtualBusKeywords");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVirtualKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cBusKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//VirtualBusKeywords:
		//	'virtual' 'bus';
		@Override public ParserRule getRule() { return rule; }
		
		//'virtual' 'bus'
		public Group getGroup() { return cGroup; }
		
		//'virtual'
		public Keyword getVirtualKeyword_0() { return cVirtualKeyword_0; }
		
		//'bus'
		public Keyword getBusKeyword_1() { return cBusKeyword_1; }
	}
	public class VirtualMemoryKeywordsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.VirtualMemoryKeywords");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVirtualKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cMemoryKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//VirtualMemoryKeywords:
		//	'virtual' 'memory';
		@Override public ParserRule getRule() { return rule; }
		
		//'virtual' 'memory'
		public Group getGroup() { return cGroup; }
		
		//'virtual'
		public Keyword getVirtualKeyword_0() { return cVirtualKeyword_0; }
		
		//'memory'
		public Keyword getMemoryKeyword_1() { return cMemoryKeyword_1; }
	}
	public class VirtualDeviceKeywordsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.VirtualDeviceKeywords");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVirtualKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cDeviceKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//VirtualDeviceKeywords:
		//	'virtual' 'device';
		@Override public ParserRule getRule() { return rule; }
		
		//'virtual' 'device'
		public Group getGroup() { return cGroup; }
		
		//'virtual'
		public Keyword getVirtualKeyword_0() { return cVirtualKeyword_0; }
		
		//'device'
		public Keyword getDeviceKeyword_1() { return cDeviceKeyword_1; }
	}
	public class ThreadGroupKeywordsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ThreadGroupKeywords");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cThreadKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cGroupKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//ThreadGroupKeywords:
		//	'thread' 'group';
		@Override public ParserRule getRule() { return rule; }
		
		//'thread' 'group'
		public Group getGroup() { return cGroup; }
		
		//'thread'
		public Keyword getThreadKeyword_0() { return cThreadKeyword_0; }
		
		//'group'
		public Keyword getGroupKeyword_1() { return cGroupKeyword_1; }
	}
	public class SubprogramGroupKeywordsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.SubprogramGroupKeywords");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSubprogramKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cGroupKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//SubprogramGroupKeywords:
		//	'subprogram' 'group';
		@Override public ParserRule getRule() { return rule; }
		
		//'subprogram' 'group'
		public Group getGroup() { return cGroup; }
		
		//'subprogram'
		public Keyword getSubprogramKeyword_0() { return cSubprogramKeyword_0; }
		
		//'group'
		public Keyword getGroupKeyword_1() { return cGroupKeyword_1; }
	}
	public class EndToEndFlowKeywordsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.EndToEndFlowKeywords");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEndKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cToKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cEndKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cFlowKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//EndToEndFlowKeywords:
		//	'end' 'to' 'end' 'flow';
		@Override public ParserRule getRule() { return rule; }
		
		//'end' 'to' 'end' 'flow'
		public Group getGroup() { return cGroup; }
		
		//'end'
		public Keyword getEndKeyword_0() { return cEndKeyword_0; }
		
		//'to'
		public Keyword getToKeyword_1() { return cToKeyword_1; }
		
		//'end'
		public Keyword getEndKeyword_2() { return cEndKeyword_2; }
		
		//'flow'
		public Keyword getFlowKeyword_3() { return cFlowKeyword_3; }
	}
	public class FlowSourceKeywordsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.FlowSourceKeywords");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFlowKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cSourceKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//FlowSourceKeywords:
		//	'flow' 'source';
		@Override public ParserRule getRule() { return rule; }
		
		//'flow' 'source'
		public Group getGroup() { return cGroup; }
		
		//'flow'
		public Keyword getFlowKeyword_0() { return cFlowKeyword_0; }
		
		//'source'
		public Keyword getSourceKeyword_1() { return cSourceKeyword_1; }
	}
	public class FlowSinkKeywordsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.FlowSinkKeywords");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFlowKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cSinkKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//FlowSinkKeywords:
		//	'flow' 'sink';
		@Override public ParserRule getRule() { return rule; }
		
		//'flow' 'sink'
		public Group getGroup() { return cGroup; }
		
		//'flow'
		public Keyword getFlowKeyword_0() { return cFlowKeyword_0; }
		
		//'sink'
		public Keyword getSinkKeyword_1() { return cSinkKeyword_1; }
	}
	public class FlowPathKeywordsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.FlowPathKeywords");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFlowKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cPathKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//FlowPathKeywords:
		//	'flow' 'path';
		@Override public ParserRule getRule() { return rule; }
		
		//'flow' 'path'
		public Group getGroup() { return cGroup; }
		
		//'flow'
		public Keyword getFlowKeyword_0() { return cFlowKeyword_0; }
		
		//'path'
		public Keyword getPathKeyword_1() { return cPathKeyword_1; }
	}
	public class InOutKeywordsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.InOutKeywords");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cOutKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//InOutKeywords:
		//	'in' 'out';
		@Override public ParserRule getRule() { return rule; }
		
		//'in' 'out'
		public Group getGroup() { return cGroup; }
		
		//'in'
		public Keyword getInKeyword_0() { return cInKeyword_0; }
		
		//'out'
		public Keyword getOutKeyword_1() { return cOutKeyword_1; }
	}
	public class BusAccessKeywordsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.BusAccessKeywords");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cAccessKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//BusAccessKeywords:
		//	'bus' 'access';
		@Override public ParserRule getRule() { return rule; }
		
		//'bus' 'access'
		public Group getGroup() { return cGroup; }
		
		//'bus'
		public Keyword getBusKeyword_0() { return cBusKeyword_0; }
		
		//'access'
		public Keyword getAccessKeyword_1() { return cAccessKeyword_1; }
	}
	public class BindingPointKeywordsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.BindingPointKeywords");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBindingKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cPointKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//BindingPointKeywords:
		//	'binding' 'point';
		@Override public ParserRule getRule() { return rule; }
		
		//'binding' 'point'
		public Group getGroup() { return cGroup; }
		
		//'binding'
		public Keyword getBindingKeyword_0() { return cBindingKeyword_0; }
		
		//'point'
		public Keyword getPointKeyword_1() { return cPointKeyword_1; }
	}
	public class ProvidesReadKeywordsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ProvidesReadKeywords");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProvidesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cReadKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//ProvidesReadKeywords:
		//	'provides' 'read';
		@Override public ParserRule getRule() { return rule; }
		
		//'provides' 'read'
		public Group getGroup() { return cGroup; }
		
		//'provides'
		public Keyword getProvidesKeyword_0() { return cProvidesKeyword_0; }
		
		//'read'
		public Keyword getReadKeyword_1() { return cReadKeyword_1; }
	}
	public class RequiresReadKeywordsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.RequiresReadKeywords");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRequiresKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cReadKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//RequiresReadKeywords:
		//	'requires' 'read';
		@Override public ParserRule getRule() { return rule; }
		
		//'requires' 'read'
		public Group getGroup() { return cGroup; }
		
		//'requires'
		public Keyword getRequiresKeyword_0() { return cRequiresKeyword_0; }
		
		//'read'
		public Keyword getReadKeyword_1() { return cReadKeyword_1; }
	}
	public class ProvidesWriteKeywordsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ProvidesWriteKeywords");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProvidesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cWriteKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//ProvidesWriteKeywords:
		//	'provides' 'write';
		@Override public ParserRule getRule() { return rule; }
		
		//'provides' 'write'
		public Group getGroup() { return cGroup; }
		
		//'provides'
		public Keyword getProvidesKeyword_0() { return cProvidesKeyword_0; }
		
		//'write'
		public Keyword getWriteKeyword_1() { return cWriteKeyword_1; }
	}
	public class RequiresWriteKeywordsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.RequiresWriteKeywords");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRequiresKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cWriteKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//RequiresWriteKeywords:
		//	'requires' 'write';
		@Override public ParserRule getRule() { return rule; }
		
		//'requires' 'write'
		public Group getGroup() { return cGroup; }
		
		//'requires'
		public Keyword getRequiresKeyword_0() { return cRequiresKeyword_0; }
		
		//'write'
		public Keyword getWriteKeyword_1() { return cWriteKeyword_1; }
	}
	public class ProvidesRWKeywordsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ProvidesRWKeywords");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProvidesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cReadwriteKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//ProvidesRWKeywords:
		//	'provides' 'readwrite';
		@Override public ParserRule getRule() { return rule; }
		
		//'provides' 'readwrite'
		public Group getGroup() { return cGroup; }
		
		//'provides'
		public Keyword getProvidesKeyword_0() { return cProvidesKeyword_0; }
		
		//'readwrite'
		public Keyword getReadwriteKeyword_1() { return cReadwriteKeyword_1; }
	}
	public class RequiresRWKeywordsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.RequiresRWKeywords");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRequiresKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cReadwriteKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//RequiresRWKeywords:
		//	'requires' 'readwrite';
		@Override public ParserRule getRule() { return rule; }
		
		//'requires' 'readwrite'
		public Group getGroup() { return cGroup; }
		
		//'requires'
		public Keyword getRequiresKeyword_0() { return cRequiresKeyword_0; }
		
		//'readwrite'
		public Keyword getReadwriteKeyword_1() { return cReadwriteKeyword_1; }
	}
	
	
	private final PackageDeclarationElements pPackageDeclaration;
	private final PropertyDefinitionElements pPropertyDefinition;
	private final AppliesToElements pAppliesTo;
	private final PropertySetElements pPropertySet;
	private final DataTypeElements pDataType;
	private final ComponentInterfaceElements pComponentInterface;
	private final InterfaceBodyElements pInterfaceBody;
	private final InterfaceElementElements pInterfaceElement;
	private final ComponentImplementationElements pComponentImplementation;
	private final ImplementationBodyElements pImplementationBody;
	private final ImplementationElementElements pImplementationElement;
	private final ComponentConfigurationElements pComponentConfiguration;
	private final FeatureElements pFeature;
	private final ComponentElements pComponent;
	private final ConnectionElements pConnection;
	private final FeatureMappingElements pFeatureMapping;
	private final FlowPathElements pFlowPath;
	private final FlowSourceElements pFlowSource;
	private final FlowSinkElements pFlowSink;
	private final UsePropsElements pUseProps;
	private final PathElements pPath;
	private final PathElementElements pPathElement;
	private final ImportElements pImport;
	private final ConfigurationAssignmentElements pConfigurationAssignment;
	private final ConfigurationAssignmentPatternElements pConfigurationAssignmentPattern;
	private final FlowAssignmentElements pFlowAssignment;
	private final PropertyAssociationElements pPropertyAssociation;
	private final PropertyValueElements pPropertyValue;
	private final ModelElementReferenceElements pModelElementReference;
	private final ConfigurationElementBlockElements pConfigurationElementBlock;
	private final CurlyConfigurationElementBlockElements pCurlyConfigurationElementBlock;
	private final ConfigurationElementElements pConfigurationElement;
	private final ParametersElements pParameters;
	private final ConfigurationParameterElements pConfigurationParameter;
	private final ReversableInterfaceReferenceElements pReversableInterfaceReference;
	private final TypeReferenceElements pTypeReference;
	private final RealizationReferenceElements pRealizationReference;
	private final ImplementationReferenceElements pImplementationReference;
	private final PropertiesBlockElements pPropertiesBlock;
	private final NestedComponentImplementationBlockElements pNestedComponentImplementationBlock;
	private final NestedImplementationElementElements pNestedImplementationElement;
	private final ConfigurationExtensionsElements pConfigurationExtensions;
	private final ImplementationExtensionsElements pImplementationExtensions;
	private final InterfaceExtensionsElements pInterfaceExtensions;
	private final ConfigurationActualsElements pConfigurationActuals;
	private final ConfigurationActualElements pConfigurationActual;
	private final WorkingsetElements pWorkingset;
	private final QualifiedNameWithWildcardElements pQualifiedNameWithWildcard;
	private final DottedNameElements pDottedName;
	private final QualifiedNameElements pQualifiedName;
	private final QualifiedTypesReferenceElements pQualifiedTypesReference;
	private final QualifiedReferenceElements pQualifiedReference;
	private final QualifiedDottedReferenceElements pQualifiedDottedReference;
	private final SEMICOLONElements pSEMICOLON;
	private final ComponentCategoryElements pComponentCategory;
	private final FeatureCategoryElements pFeatureCategory;
	private final FeatureDirectionElements pFeatureDirection;
	private final AssociationTypeElements pAssociationType;
	private final ConnectionTypeElements pConnectionType;
	private final MappingTypeElements pMappingType;
	private final FlowPathTypeElements pFlowPathType;
	private final FlowSourceTypeElements pFlowSourceType;
	private final FlowSinkTypeElements pFlowSinkType;
	private final FlowTypeElements pFlowType;
	private final PropertyAssociationTypeElements pPropertyAssociationType;
	private final VirtualProcessorKeywordsElements pVirtualProcessorKeywords;
	private final VirtualBusKeywordsElements pVirtualBusKeywords;
	private final VirtualMemoryKeywordsElements pVirtualMemoryKeywords;
	private final VirtualDeviceKeywordsElements pVirtualDeviceKeywords;
	private final ThreadGroupKeywordsElements pThreadGroupKeywords;
	private final SubprogramGroupKeywordsElements pSubprogramGroupKeywords;
	private final EndToEndFlowKeywordsElements pEndToEndFlowKeywords;
	private final FlowSourceKeywordsElements pFlowSourceKeywords;
	private final FlowSinkKeywordsElements pFlowSinkKeywords;
	private final FlowPathKeywordsElements pFlowPathKeywords;
	private final InOutKeywordsElements pInOutKeywords;
	private final BusAccessKeywordsElements pBusAccessKeywords;
	private final BindingPointKeywordsElements pBindingPointKeywords;
	private final ProvidesReadKeywordsElements pProvidesReadKeywords;
	private final RequiresReadKeywordsElements pRequiresReadKeywords;
	private final ProvidesWriteKeywordsElements pProvidesWriteKeywords;
	private final RequiresWriteKeywordsElements pRequiresWriteKeywords;
	private final ProvidesRWKeywordsElements pProvidesRWKeywords;
	private final RequiresRWKeywordsElements pRequiresRWKeywords;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public AadlV3GrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pPackageDeclaration = new PackageDeclarationElements();
		this.pPropertyDefinition = new PropertyDefinitionElements();
		this.pAppliesTo = new AppliesToElements();
		this.pPropertySet = new PropertySetElements();
		this.pDataType = new DataTypeElements();
		this.pComponentInterface = new ComponentInterfaceElements();
		this.pInterfaceBody = new InterfaceBodyElements();
		this.pInterfaceElement = new InterfaceElementElements();
		this.pComponentImplementation = new ComponentImplementationElements();
		this.pImplementationBody = new ImplementationBodyElements();
		this.pImplementationElement = new ImplementationElementElements();
		this.pComponentConfiguration = new ComponentConfigurationElements();
		this.pFeature = new FeatureElements();
		this.pComponent = new ComponentElements();
		this.pConnection = new ConnectionElements();
		this.pFeatureMapping = new FeatureMappingElements();
		this.pFlowPath = new FlowPathElements();
		this.pFlowSource = new FlowSourceElements();
		this.pFlowSink = new FlowSinkElements();
		this.pUseProps = new UsePropsElements();
		this.pPath = new PathElements();
		this.pPathElement = new PathElementElements();
		this.pImport = new ImportElements();
		this.pConfigurationAssignment = new ConfigurationAssignmentElements();
		this.pConfigurationAssignmentPattern = new ConfigurationAssignmentPatternElements();
		this.pFlowAssignment = new FlowAssignmentElements();
		this.pPropertyAssociation = new PropertyAssociationElements();
		this.pPropertyValue = new PropertyValueElements();
		this.pModelElementReference = new ModelElementReferenceElements();
		this.pConfigurationElementBlock = new ConfigurationElementBlockElements();
		this.pCurlyConfigurationElementBlock = new CurlyConfigurationElementBlockElements();
		this.pConfigurationElement = new ConfigurationElementElements();
		this.pParameters = new ParametersElements();
		this.pConfigurationParameter = new ConfigurationParameterElements();
		this.pReversableInterfaceReference = new ReversableInterfaceReferenceElements();
		this.pTypeReference = new TypeReferenceElements();
		this.pRealizationReference = new RealizationReferenceElements();
		this.pImplementationReference = new ImplementationReferenceElements();
		this.pPropertiesBlock = new PropertiesBlockElements();
		this.pNestedComponentImplementationBlock = new NestedComponentImplementationBlockElements();
		this.pNestedImplementationElement = new NestedImplementationElementElements();
		this.pConfigurationExtensions = new ConfigurationExtensionsElements();
		this.pImplementationExtensions = new ImplementationExtensionsElements();
		this.pInterfaceExtensions = new InterfaceExtensionsElements();
		this.pConfigurationActuals = new ConfigurationActualsElements();
		this.pConfigurationActual = new ConfigurationActualElements();
		this.pWorkingset = new WorkingsetElements();
		this.pQualifiedNameWithWildcard = new QualifiedNameWithWildcardElements();
		this.pDottedName = new DottedNameElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pQualifiedTypesReference = new QualifiedTypesReferenceElements();
		this.pQualifiedReference = new QualifiedReferenceElements();
		this.pQualifiedDottedReference = new QualifiedDottedReferenceElements();
		this.pSEMICOLON = new SEMICOLONElements();
		this.pComponentCategory = new ComponentCategoryElements();
		this.pFeatureCategory = new FeatureCategoryElements();
		this.pFeatureDirection = new FeatureDirectionElements();
		this.pAssociationType = new AssociationTypeElements();
		this.pConnectionType = new ConnectionTypeElements();
		this.pMappingType = new MappingTypeElements();
		this.pFlowPathType = new FlowPathTypeElements();
		this.pFlowSourceType = new FlowSourceTypeElements();
		this.pFlowSinkType = new FlowSinkTypeElements();
		this.pFlowType = new FlowTypeElements();
		this.pPropertyAssociationType = new PropertyAssociationTypeElements();
		this.pVirtualProcessorKeywords = new VirtualProcessorKeywordsElements();
		this.pVirtualBusKeywords = new VirtualBusKeywordsElements();
		this.pVirtualMemoryKeywords = new VirtualMemoryKeywordsElements();
		this.pVirtualDeviceKeywords = new VirtualDeviceKeywordsElements();
		this.pThreadGroupKeywords = new ThreadGroupKeywordsElements();
		this.pSubprogramGroupKeywords = new SubprogramGroupKeywordsElements();
		this.pEndToEndFlowKeywords = new EndToEndFlowKeywordsElements();
		this.pFlowSourceKeywords = new FlowSourceKeywordsElements();
		this.pFlowSinkKeywords = new FlowSinkKeywordsElements();
		this.pFlowPathKeywords = new FlowPathKeywordsElements();
		this.pInOutKeywords = new InOutKeywordsElements();
		this.pBusAccessKeywords = new BusAccessKeywordsElements();
		this.pBindingPointKeywords = new BindingPointKeywordsElements();
		this.pProvidesReadKeywords = new ProvidesReadKeywordsElements();
		this.pRequiresReadKeywords = new RequiresReadKeywordsElements();
		this.pProvidesWriteKeywords = new ProvidesWriteKeywordsElements();
		this.pRequiresWriteKeywords = new RequiresWriteKeywordsElements();
		this.pProvidesRWKeywords = new ProvidesRWKeywordsElements();
		this.pRequiresRWKeywords = new RequiresRWKeywordsElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.osate.xtext.aadlv3.AadlV3".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//PackageDeclaration av3::PackageDeclaration:
	//	'package' name=QualifiedName
	//	imports+=Import*
	//	elements+=(PackageDeclaration | DataType | ComponentInterface | ComponentImplementation | ComponentConfiguration |
	//	PropertyDefinition | PropertySet | Workingset)*
	//	'end' SEMICOLON;
	public PackageDeclarationElements getPackageDeclarationAccess() {
		return pPackageDeclaration;
	}
	
	public ParserRule getPackageDeclarationRule() {
		return getPackageDeclarationAccess().getRule();
	}
	
	//PropertyDefinition av3::PropertyDefinition:
	//	'property' name=ID ':' type=[av3::Type|QualifiedReference] ('for' AppliesTo (',' AppliesTo)*)?
	//	SEMICOLON;
	public PropertyDefinitionElements getPropertyDefinitionAccess() {
		return pPropertyDefinition;
	}
	
	public ParserRule getPropertyDefinitionRule() {
		return getPropertyDefinitionAccess().getRule();
	}
	
	//fragment AppliesTo *:
	//	componentCategories+=ComponentCategory | featureCategories+=FeatureCategory
	//	| associationTypes+=AssociationType;
	public AppliesToElements getAppliesToAccess() {
		return pAppliesTo;
	}
	
	public ParserRule getAppliesToRule() {
		return getAppliesToAccess().getRule();
	}
	
	//PropertySet av3::PropertySet:
	//	'properties' name=ID ':'
	//	'{' properties+=[av3::PropertyDefinition|QualifiedReference] (','
	//	properties+=[av3::PropertyDefinition|QualifiedName])* '}'
	//	SEMICOLON;
	public PropertySetElements getPropertySetAccess() {
		return pPropertySet;
	}
	
	public ParserRule getPropertySetRule() {
		return getPropertySetAccess().getRule();
	}
	
	//DataType av3::DataType:
	//	'type' name=ID PropertiesBlock? SEMICOLON;
	public DataTypeElements getDataTypeAccess() {
		return pDataType;
	}
	
	public ParserRule getDataTypeRule() {
		return getDataTypeAccess().getRule();
	}
	
	//ComponentInterface av3::ComponentInterface:
	//	private?='private'? category=ComponentCategory? 'interface' name=ID ('extends' InterfaceExtensions?)?
	//	InterfaceBody
	//	SEMICOLON;
	public ComponentInterfaceElements getComponentInterfaceAccess() {
		return pComponentInterface;
	}
	
	public ParserRule getComponentInterfaceRule() {
		return getComponentInterfaceAccess().getRule();
	}
	
	//fragment InterfaceBody *:
	//	('is' InterfaceElement (SEMICOLON InterfaceElement)* SEMICOLON?)? 'end';
	public InterfaceBodyElements getInterfaceBodyAccess() {
		return pInterfaceBody;
	}
	
	public ParserRule getInterfaceBodyRule() {
		return getInterfaceBodyAccess().getRule();
	}
	
	//fragment InterfaceElement *:
	//	features+=Feature | flows+=FlowPath | flows+=FlowSource | flows+=FlowSink | propertyAssociations+=PropertyAssociation
	//	| UseProps;
	public InterfaceElementElements getInterfaceElementAccess() {
		return pInterfaceElement;
	}
	
	public ParserRule getInterfaceElementRule() {
		return getInterfaceElementAccess().getRule();
	}
	
	////fragment SectionsInterfaceBody*:
	////	('features' features+=Feature+)?
	////	&('flows' (flows+=FlowPath |  flows+=FlowSource |  flows+=FlowSink)+)?
	//// 	&('properties' propertyAssociations+=PropertyAssociation+ )?
	////;
	//ComponentImplementation av3::ComponentImplementation:
	//	private?='private'? category=ComponentCategory name=DottedName ('extends' ImplementationExtensions?)?
	//	ImplementationBody
	//	SEMICOLON;
	public ComponentImplementationElements getComponentImplementationAccess() {
		return pComponentImplementation;
	}
	
	public ParserRule getComponentImplementationRule() {
		return getComponentImplementationAccess().getRule();
	}
	
	//fragment ImplementationBody *:
	//	('is'
	//	ImplementationElement (SEMICOLON ImplementationElement)* SEMICOLON?)?
	//	'end';
	public ImplementationBodyElements getImplementationBodyAccess() {
		return pImplementationBody;
	}
	
	public ParserRule getImplementationBodyRule() {
		return getImplementationBodyAccess().getRule();
	}
	
	//fragment ImplementationElement *:
	//	connections+=Connection | connections+=FeatureMapping | components+=Component
	//	| paths+=Path | flowAssignments+=FlowAssignment | configurationAssignments+=ConfigurationAssignment |
	//	configurationAssignments+=ConfigurationAssignmentPattern
	//	| propertyAssociations+=PropertyAssociation;
	public ImplementationElementElements getImplementationElementAccess() {
		return pImplementationElement;
	}
	
	public ParserRule getImplementationElementRule() {
		return getImplementationElementAccess().getRule();
	}
	
	////fragment SectionsImplementationBody*:
	////	('subcomponents'(components+=Component|assignments+=ConfigurationAssignment)+ )?
	//// 	&('connections' connections+=(Connection|FeatureMapping)+ )?
	//// 	&('flows' (flowAssignments+=FlowAssignment| paths+= Path )+)?
	//// 	&('properties' propertyAssociations+=PropertyAssociation+ )?
	////;
	//ComponentConfiguration av3::ComponentConfiguration:
	//	private?='private'? 'configuration' name=DottedName
	//	Parameters?
	//	'extends' ConfigurationExtensions ConfigurationElementBlock
	//	SEMICOLON;
	public ComponentConfigurationElements getComponentConfigurationAccess() {
		return pComponentConfiguration;
	}
	
	public ParserRule getComponentConfigurationRule() {
		return getComponentConfigurationAccess().getRule();
	}
	
	//// (Instance) model elements
	//Feature av3::Feature:
	//	name=ID ':' direction=FeatureDirection? sampled?='sampled'?
	//	category=FeatureCategory (reverse?='reverse'?
	//	type=[av3::Type|QualifiedName])?
	//	PropertiesBlock?;
	public FeatureElements getFeatureAccess() {
		return pFeature;
	}
	
	public ParserRule getFeatureRule() {
		return getFeatureAccess().getRule();
	}
	
	//Component av3::Component:
	//	name=ID ':' category=ComponentCategory (typeReferences+=TypeReference (',' typeReferences+=TypeReference?)*)?
	//	NestedComponentImplementationBlock?;
	public ComponentElements getComponentAccess() {
		return pComponent;
	}
	
	public ParserRule getComponentRule() {
		return getComponentAccess().getRule();
	}
	
	//Connection av3::Association:
	//	name=ID ':' associationType=ConnectionType source=ModelElementReference
	//	'->' destination=ModelElementReference PropertiesBlock?;
	public ConnectionElements getConnectionAccess() {
		return pConnection;
	}
	
	public ParserRule getConnectionRule() {
		return getConnectionAccess().getRule();
	}
	
	//FeatureMapping av3::Association:
	//	name=ID ':' associationType=MappingType source=ModelElementReference
	//	'=>' destination=ModelElementReference PropertiesBlock?;
	public FeatureMappingElements getFeatureMappingAccess() {
		return pFeatureMapping;
	}
	
	public ParserRule getFeatureMappingRule() {
		return getFeatureMappingAccess().getRule();
	}
	
	//FlowPath av3::Association:
	//	name=ID ':' associationType=FlowPathType source=ModelElementReference
	//	'->' destination=ModelElementReference PropertiesBlock?;
	public FlowPathElements getFlowPathAccess() {
		return pFlowPath;
	}
	
	public ParserRule getFlowPathRule() {
		return getFlowPathAccess().getRule();
	}
	
	//FlowSource av3::Association:
	//	name=ID ':' associationType=FlowSourceType destination=ModelElementReference PropertiesBlock?;
	public FlowSourceElements getFlowSourceAccess() {
		return pFlowSource;
	}
	
	public ParserRule getFlowSourceRule() {
		return getFlowSourceAccess().getRule();
	}
	
	//FlowSink av3::Association:
	//	name=ID ':' associationType=FlowSinkType source=ModelElementReference
	//	PropertiesBlock?;
	public FlowSinkElements getFlowSinkAccess() {
		return pFlowSink;
	}
	
	public ParserRule getFlowSinkRule() {
		return getFlowSinkAccess().getRule();
	}
	
	//fragment UseProps *:
	//	'use' 'properties' useProperties+=[av3::PropertySet|QualifiedName] (','
	//	useProperties+=[av3::PropertySet|QualifiedName])*;
	public UsePropsElements getUsePropsAccess() {
		return pUseProps;
	}
	
	public ParserRule getUsePropsRule() {
		return getUsePropsAccess().getRule();
	}
	
	//Path av3::PathSequence:
	//	name=ID ':' EndToEndFlowKeywords elements+=PathElement ('->' elements+=PathElement)+
	//	PropertiesBlock?;
	public PathElements getPathAccess() {
		return pPath;
	}
	
	public ParserRule getPathRule() {
		return getPathAccess().getRule();
	}
	
	//PathElement av3::PathElement:
	//	element=[av3::ModelElement] => ({av3::PathElement.context=current} '.' element=[av3::ModelElement])*;
	public PathElementElements getPathElementAccess() {
		return pPathElement;
	}
	
	public ParserRule getPathElementRule() {
		return getPathElementAccess().getRule();
	}
	
	//Import av3::Import:
	//	'import' (importedNamespace=QualifiedNameWithWildcard | importedNamespace=QualifiedName ('as' alias=ID)?) SEMICOLON;
	public ImportElements getImportAccess() {
		return pImport;
	}
	
	public ParserRule getImportRule() {
		return getImportAccess().getRule();
	}
	
	//ConfigurationAssignment av3::ConfigurationAssignment:
	//	target=ModelElementReference '=>' (assignedClassifiers+=TypeReference (',' assignedClassifiers+=TypeReference)*
	//	CurlyConfigurationElementBlock? | CurlyConfigurationElementBlock);
	public ConfigurationAssignmentElements getConfigurationAssignmentAccess() {
		return pConfigurationAssignment;
	}
	
	public ParserRule getConfigurationAssignmentRule() {
		return getConfigurationAssignmentAccess().getRule();
	}
	
	//ConfigurationAssignmentPattern av3::ConfigurationAssignmentPattern:
	//	targetPattern=[av3::Type|QualifiedTypesReference] '*=>' (assignedClassifiers+=TypeReference (','
	//	assignedClassifiers+=TypeReference)* CurlyConfigurationElementBlock? | CurlyConfigurationElementBlock);
	public ConfigurationAssignmentPatternElements getConfigurationAssignmentPatternAccess() {
		return pConfigurationAssignmentPattern;
	}
	
	public ParserRule getConfigurationAssignmentPatternRule() {
		return getConfigurationAssignmentPatternAccess().getRule();
	}
	
	//FlowAssignment av3::PathSequence:
	//	target=ModelElementReference '=>' 'flow'
	//	elements+=PathElement ('->' elements+=PathElement)*;
	public FlowAssignmentElements getFlowAssignmentAccess() {
		return pFlowAssignment;
	}
	
	public ParserRule getFlowAssignmentRule() {
		return getFlowAssignmentAccess().getRule();
	}
	
	//PropertyAssociation av3::PropertyAssociation:
	//	target=ModelElementReference? '#' property=[av3::PropertyDefinition|QualifiedName]
	//	propertyAssociationType=PropertyAssociationType?
	//	'=>' value=PropertyValue;
	public PropertyAssociationElements getPropertyAssociationAccess() {
		return pPropertyAssociation;
	}
	
	public ParserRule getPropertyAssociationRule() {
		return getPropertyAssociationAccess().getRule();
	}
	
	//PropertyValue av3::PropertyValue:
	//	value=INT;
	public PropertyValueElements getPropertyValueAccess() {
		return pPropertyValue;
	}
	
	public ParserRule getPropertyValueRule() {
		return getPropertyValueAccess().getRule();
	}
	
	//ModelElementReference av3::ModelElementReference:
	//	element=[av3::ModelElement] => ({av3::ModelElementReference.context=current} '.' element=[av3::ModelElement])*;
	public ModelElementReferenceElements getModelElementReferenceAccess() {
		return pModelElementReference;
	}
	
	public ParserRule getModelElementReferenceRule() {
		return getModelElementReferenceAccess().getRule();
	}
	
	//fragment ConfigurationElementBlock *:
	//	('is' ConfigurationElement (SEMICOLON ConfigurationElement)* SEMICOLON?)? 'end';
	public ConfigurationElementBlockElements getConfigurationElementBlockAccess() {
		return pConfigurationElementBlock;
	}
	
	public ParserRule getConfigurationElementBlockRule() {
		return getConfigurationElementBlockAccess().getRule();
	}
	
	//fragment CurlyConfigurationElementBlock *:
	//	'{' ConfigurationElement (SEMICOLON ConfigurationElement)* SEMICOLON? '}';
	public CurlyConfigurationElementBlockElements getCurlyConfigurationElementBlockAccess() {
		return pCurlyConfigurationElementBlock;
	}
	
	public ParserRule getCurlyConfigurationElementBlockRule() {
		return getCurlyConfigurationElementBlockAccess().getRule();
	}
	
	//fragment ConfigurationElement *:
	//	propertyAssociations+=PropertyAssociation | configurationAssignments+=ConfigurationAssignment |
	//	configurationAssignments+=ConfigurationAssignmentPattern;
	public ConfigurationElementElements getConfigurationElementAccess() {
		return pConfigurationElement;
	}
	
	public ParserRule getConfigurationElementRule() {
		return getConfigurationElementAccess().getRule();
	}
	
	//fragment Parameters *:
	//	parameterized?='(' (parameters+=ConfigurationParameter (',' parameters+=ConfigurationParameter)*)? ')';
	public ParametersElements getParametersAccess() {
		return pParameters;
	}
	
	public ParserRule getParametersRule() {
		return getParametersAccess().getRule();
	}
	
	//ConfigurationParameter av3::ConfigurationParameter:
	//	name=ID ':' type=[av3::Type|QualifiedName];
	public ConfigurationParameterElements getConfigurationParameterAccess() {
		return pConfigurationParameter;
	}
	
	public ParserRule getConfigurationParameterRule() {
		return getConfigurationParameterAccess().getRule();
	}
	
	//// reference objects for classifiers including configurations with parameter
	//ReversableInterfaceReference av3::TypeReference:
	//	reverse?='reverse'? type=[av3::ComponentInterface|QualifiedReference];
	public ReversableInterfaceReferenceElements getReversableInterfaceReferenceAccess() {
		return pReversableInterfaceReference;
	}
	
	public ParserRule getReversableInterfaceReferenceRule() {
		return getReversableInterfaceReferenceAccess().getRule();
	}
	
	//TypeReference av3::TypeReference:
	//	type=[av3::Type|QualifiedTypesReference] ConfigurationActuals?;
	public TypeReferenceElements getTypeReferenceAccess() {
		return pTypeReference;
	}
	
	public ParserRule getTypeReferenceRule() {
		return getTypeReferenceAccess().getRule();
	}
	
	//RealizationReference av3::TypeReference:
	//	type=[av3::ComponentRealization|QualifiedDottedReference] ConfigurationActuals?;
	public RealizationReferenceElements getRealizationReferenceAccess() {
		return pRealizationReference;
	}
	
	public ParserRule getRealizationReferenceRule() {
		return getRealizationReferenceAccess().getRule();
	}
	
	//ImplementationReference av3::TypeReference:
	//	type=[av3::ComponentImplementation|QualifiedDottedReference];
	public ImplementationReferenceElements getImplementationReferenceAccess() {
		return pImplementationReference;
	}
	
	public ParserRule getImplementationReferenceRule() {
		return getImplementationReferenceAccess().getRule();
	}
	
	//fragment PropertiesBlock *:
	//	'{' propertyAssociations+=PropertyAssociation (SEMICOLON propertyAssociations+=PropertyAssociation)* SEMICOLON? '}';
	public PropertiesBlockElements getPropertiesBlockAccess() {
		return pPropertiesBlock;
	}
	
	public ParserRule getPropertiesBlockRule() {
		return getPropertiesBlockAccess().getRule();
	}
	
	//// to be used for inline nested component implementations 
	//fragment NestedComponentImplementationBlock *:
	//	'{' NestedImplementationElement (SEMICOLON NestedImplementationElement)* SEMICOLON?
	//	'}';
	public NestedComponentImplementationBlockElements getNestedComponentImplementationBlockAccess() {
		return pNestedComponentImplementationBlock;
	}
	
	public ParserRule getNestedComponentImplementationBlockRule() {
		return getNestedComponentImplementationBlockAccess().getRule();
	}
	
	//fragment NestedImplementationElement *:
	//	features+=Feature | connections+=Connection | connections+=FeatureMapping | components+=Component |
	//	propertyAssociations+=PropertyAssociation;
	public NestedImplementationElementElements getNestedImplementationElementAccess() {
		return pNestedImplementationElement;
	}
	
	public ParserRule getNestedImplementationElementRule() {
		return getNestedImplementationElementAccess().getRule();
	}
	
	//fragment ConfigurationExtensions *:
	//	superClassifiers+=RealizationReference ("," superClassifiers+=RealizationReference)*;
	public ConfigurationExtensionsElements getConfigurationExtensionsAccess() {
		return pConfigurationExtensions;
	}
	
	public ParserRule getConfigurationExtensionsRule() {
		return getConfigurationExtensionsAccess().getRule();
	}
	
	//fragment ImplementationExtensions *:
	//	superClassifiers+=ImplementationReference ("," superClassifiers+=ImplementationReference)*;
	public ImplementationExtensionsElements getImplementationExtensionsAccess() {
		return pImplementationExtensions;
	}
	
	public ParserRule getImplementationExtensionsRule() {
		return getImplementationExtensionsAccess().getRule();
	}
	
	//fragment InterfaceExtensions *:
	//	superClassifiers+=ReversableInterfaceReference ("," superClassifiers+=ReversableInterfaceReference)*;
	public InterfaceExtensionsElements getInterfaceExtensionsAccess() {
		return pInterfaceExtensions;
	}
	
	public ParserRule getInterfaceExtensionsRule() {
		return getInterfaceExtensionsAccess().getRule();
	}
	
	//fragment ConfigurationActuals *:
	//	'(' (actuals+=ConfigurationActual (',' actuals+=ConfigurationActual)*)? ')';
	public ConfigurationActualsElements getConfigurationActualsAccess() {
		return pConfigurationActuals;
	}
	
	public ParserRule getConfigurationActualsRule() {
		return getConfigurationActualsAccess().getRule();
	}
	
	//ConfigurationActual av3::ConfigurationActual:
	//	parameter=[av3::ConfigurationParameter] '=>' assignedClassifiers+=TypeReference (','
	//	assignedClassifiers+=TypeReference)*;
	public ConfigurationActualElements getConfigurationActualAccess() {
		return pConfigurationActual;
	}
	
	public ParserRule getConfigurationActualRule() {
		return getConfigurationActualAccess().getRule();
	}
	
	//Workingset av3::Workingset:
	//	'workingset' name=QualifiedName 'is'
	//	UseProps?
	//	rootComponents+=Component (SEMICOLON rootComponents+=Component)* SEMICOLON?
	//	'end' SEMICOLON;
	public WorkingsetElements getWorkingsetAccess() {
		return pWorkingset;
	}
	
	public ParserRule getWorkingsetRule() {
		return getWorkingsetAccess().getRule();
	}
	
	//QualifiedNameWithWildcard:
	//	QualifiedName '::*';
	public QualifiedNameWithWildcardElements getQualifiedNameWithWildcardAccess() {
		return pQualifiedNameWithWildcard;
	}
	
	public ParserRule getQualifiedNameWithWildcardRule() {
		return getQualifiedNameWithWildcardAccess().getRule();
	}
	
	//DottedName:
	//	ID '.' ID;
	public DottedNameElements getDottedNameAccess() {
		return pDottedName;
	}
	
	public ParserRule getDottedNameRule() {
		return getDottedNameAccess().getRule();
	}
	
	//QualifiedName:
	//	ID ('::' ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}
	
	//QualifiedTypesReference:
	//	QualifiedName ('.' ID)?;
	public QualifiedTypesReferenceElements getQualifiedTypesReferenceAccess() {
		return pQualifiedTypesReference;
	}
	
	public ParserRule getQualifiedTypesReferenceRule() {
		return getQualifiedTypesReferenceAccess().getRule();
	}
	
	//QualifiedReference:
	//	QualifiedName;
	public QualifiedReferenceElements getQualifiedReferenceAccess() {
		return pQualifiedReference;
	}
	
	public ParserRule getQualifiedReferenceRule() {
		return getQualifiedReferenceAccess().getRule();
	}
	
	//QualifiedDottedReference:
	//	QualifiedName '.' ID;
	public QualifiedDottedReferenceElements getQualifiedDottedReferenceAccess() {
		return pQualifiedDottedReference;
	}
	
	public ParserRule getQualifiedDottedReferenceRule() {
		return getQualifiedDottedReferenceAccess().getRule();
	}
	
	//SEMICOLON:
	//	';';
	public SEMICOLONElements getSEMICOLONAccess() {
		return pSEMICOLON;
	}
	
	public ParserRule getSEMICOLONRule() {
		return getSEMICOLONAccess().getRule();
	}
	
	//ComponentCategory av3::ComponentCategory:
	//	'abstract' | 'bus' | 'data'
	//	| 'device' | 'memory' | 'process' | 'processor' | 'system'
	//	| 'thread' | VirtualBusKeywords | VirtualProcessorKeywords | VirtualMemoryKeywords | VirtualDeviceKeywords
	//	| 'subprogram' | SubprogramGroupKeywords | ThreadGroupKeywords;
	public ComponentCategoryElements getComponentCategoryAccess() {
		return pComponentCategory;
	}
	
	public ParserRule getComponentCategoryRule() {
		return getComponentCategoryAccess().getRule();
	}
	
	//FeatureCategory av3::FeatureCategory:
	//	'feature' | 'port' | 'access'
	//	| BusAccessKeywords
	//	| BindingPointKeywords | 'interface';
	public FeatureCategoryElements getFeatureCategoryAccess() {
		return pFeatureCategory;
	}
	
	public ParserRule getFeatureCategoryRule() {
		return getFeatureCategoryAccess().getRule();
	}
	
	//FeatureDirection av3::FeatureDirection:
	//	'in' | 'out'
	//	| InOutKeywords | 'requires' | 'provides' | ProvidesReadKeywords | RequiresReadKeywords | ProvidesWriteKeywords |
	//	RequiresWriteKeywords | ProvidesRWKeywords | RequiresRWKeywords;
	public FeatureDirectionElements getFeatureDirectionAccess() {
		return pFeatureDirection;
	}
	
	public ParserRule getFeatureDirectionRule() {
		return getFeatureDirectionAccess().getRule();
	}
	
	//AssociationType av3::AssociationType:
	//	ConnectionType | MappingType | FlowType;
	public AssociationTypeElements getAssociationTypeAccess() {
		return pAssociationType;
	}
	
	public ParserRule getAssociationTypeRule() {
		return getAssociationTypeAccess().getRule();
	}
	
	//ConnectionType av3::AssociationType:
	//	'connection' | 'binding';
	public ConnectionTypeElements getConnectionTypeAccess() {
		return pConnectionType;
	}
	
	public ParserRule getConnectionTypeRule() {
		return getConnectionTypeAccess().getRule();
	}
	
	//MappingType av3::AssociationType:
	//	'mapping';
	public MappingTypeElements getMappingTypeAccess() {
		return pMappingType;
	}
	
	public ParserRule getMappingTypeRule() {
		return getMappingTypeAccess().getRule();
	}
	
	//FlowPathType av3::AssociationType:
	//	FlowPathKeywords;
	public FlowPathTypeElements getFlowPathTypeAccess() {
		return pFlowPathType;
	}
	
	public ParserRule getFlowPathTypeRule() {
		return getFlowPathTypeAccess().getRule();
	}
	
	//FlowSourceType av3::AssociationType:
	//	FlowSourceKeywords;
	public FlowSourceTypeElements getFlowSourceTypeAccess() {
		return pFlowSourceType;
	}
	
	public ParserRule getFlowSourceTypeRule() {
		return getFlowSourceTypeAccess().getRule();
	}
	
	//FlowSinkType av3::AssociationType:
	//	FlowSinkKeywords;
	public FlowSinkTypeElements getFlowSinkTypeAccess() {
		return pFlowSinkType;
	}
	
	public ParserRule getFlowSinkTypeRule() {
		return getFlowSinkTypeAccess().getRule();
	}
	
	//FlowType av3::AssociationType:
	//	'flow';
	public FlowTypeElements getFlowTypeAccess() {
		return pFlowType;
	}
	
	public ParserRule getFlowTypeRule() {
		return getFlowTypeAccess().getRule();
	}
	
	//PropertyAssociationType av3::PropertyAssociationType:
	//	'final' | 'default' | 'override';
	public PropertyAssociationTypeElements getPropertyAssociationTypeAccess() {
		return pPropertyAssociationType;
	}
	
	public ParserRule getPropertyAssociationTypeRule() {
		return getPropertyAssociationTypeAccess().getRule();
	}
	
	//VirtualProcessorKeywords:
	//	'virtual' 'processor';
	public VirtualProcessorKeywordsElements getVirtualProcessorKeywordsAccess() {
		return pVirtualProcessorKeywords;
	}
	
	public ParserRule getVirtualProcessorKeywordsRule() {
		return getVirtualProcessorKeywordsAccess().getRule();
	}
	
	//VirtualBusKeywords:
	//	'virtual' 'bus';
	public VirtualBusKeywordsElements getVirtualBusKeywordsAccess() {
		return pVirtualBusKeywords;
	}
	
	public ParserRule getVirtualBusKeywordsRule() {
		return getVirtualBusKeywordsAccess().getRule();
	}
	
	//VirtualMemoryKeywords:
	//	'virtual' 'memory';
	public VirtualMemoryKeywordsElements getVirtualMemoryKeywordsAccess() {
		return pVirtualMemoryKeywords;
	}
	
	public ParserRule getVirtualMemoryKeywordsRule() {
		return getVirtualMemoryKeywordsAccess().getRule();
	}
	
	//VirtualDeviceKeywords:
	//	'virtual' 'device';
	public VirtualDeviceKeywordsElements getVirtualDeviceKeywordsAccess() {
		return pVirtualDeviceKeywords;
	}
	
	public ParserRule getVirtualDeviceKeywordsRule() {
		return getVirtualDeviceKeywordsAccess().getRule();
	}
	
	//ThreadGroupKeywords:
	//	'thread' 'group';
	public ThreadGroupKeywordsElements getThreadGroupKeywordsAccess() {
		return pThreadGroupKeywords;
	}
	
	public ParserRule getThreadGroupKeywordsRule() {
		return getThreadGroupKeywordsAccess().getRule();
	}
	
	//SubprogramGroupKeywords:
	//	'subprogram' 'group';
	public SubprogramGroupKeywordsElements getSubprogramGroupKeywordsAccess() {
		return pSubprogramGroupKeywords;
	}
	
	public ParserRule getSubprogramGroupKeywordsRule() {
		return getSubprogramGroupKeywordsAccess().getRule();
	}
	
	//EndToEndFlowKeywords:
	//	'end' 'to' 'end' 'flow';
	public EndToEndFlowKeywordsElements getEndToEndFlowKeywordsAccess() {
		return pEndToEndFlowKeywords;
	}
	
	public ParserRule getEndToEndFlowKeywordsRule() {
		return getEndToEndFlowKeywordsAccess().getRule();
	}
	
	//FlowSourceKeywords:
	//	'flow' 'source';
	public FlowSourceKeywordsElements getFlowSourceKeywordsAccess() {
		return pFlowSourceKeywords;
	}
	
	public ParserRule getFlowSourceKeywordsRule() {
		return getFlowSourceKeywordsAccess().getRule();
	}
	
	//FlowSinkKeywords:
	//	'flow' 'sink';
	public FlowSinkKeywordsElements getFlowSinkKeywordsAccess() {
		return pFlowSinkKeywords;
	}
	
	public ParserRule getFlowSinkKeywordsRule() {
		return getFlowSinkKeywordsAccess().getRule();
	}
	
	//FlowPathKeywords:
	//	'flow' 'path';
	public FlowPathKeywordsElements getFlowPathKeywordsAccess() {
		return pFlowPathKeywords;
	}
	
	public ParserRule getFlowPathKeywordsRule() {
		return getFlowPathKeywordsAccess().getRule();
	}
	
	//InOutKeywords:
	//	'in' 'out';
	public InOutKeywordsElements getInOutKeywordsAccess() {
		return pInOutKeywords;
	}
	
	public ParserRule getInOutKeywordsRule() {
		return getInOutKeywordsAccess().getRule();
	}
	
	//BusAccessKeywords:
	//	'bus' 'access';
	public BusAccessKeywordsElements getBusAccessKeywordsAccess() {
		return pBusAccessKeywords;
	}
	
	public ParserRule getBusAccessKeywordsRule() {
		return getBusAccessKeywordsAccess().getRule();
	}
	
	//BindingPointKeywords:
	//	'binding' 'point';
	public BindingPointKeywordsElements getBindingPointKeywordsAccess() {
		return pBindingPointKeywords;
	}
	
	public ParserRule getBindingPointKeywordsRule() {
		return getBindingPointKeywordsAccess().getRule();
	}
	
	//ProvidesReadKeywords:
	//	'provides' 'read';
	public ProvidesReadKeywordsElements getProvidesReadKeywordsAccess() {
		return pProvidesReadKeywords;
	}
	
	public ParserRule getProvidesReadKeywordsRule() {
		return getProvidesReadKeywordsAccess().getRule();
	}
	
	//RequiresReadKeywords:
	//	'requires' 'read';
	public RequiresReadKeywordsElements getRequiresReadKeywordsAccess() {
		return pRequiresReadKeywords;
	}
	
	public ParserRule getRequiresReadKeywordsRule() {
		return getRequiresReadKeywordsAccess().getRule();
	}
	
	//ProvidesWriteKeywords:
	//	'provides' 'write';
	public ProvidesWriteKeywordsElements getProvidesWriteKeywordsAccess() {
		return pProvidesWriteKeywords;
	}
	
	public ParserRule getProvidesWriteKeywordsRule() {
		return getProvidesWriteKeywordsAccess().getRule();
	}
	
	//RequiresWriteKeywords:
	//	'requires' 'write';
	public RequiresWriteKeywordsElements getRequiresWriteKeywordsAccess() {
		return pRequiresWriteKeywords;
	}
	
	public ParserRule getRequiresWriteKeywordsRule() {
		return getRequiresWriteKeywordsAccess().getRule();
	}
	
	//ProvidesRWKeywords:
	//	'provides' 'readwrite';
	public ProvidesRWKeywordsElements getProvidesRWKeywordsAccess() {
		return pProvidesRWKeywords;
	}
	
	public ParserRule getProvidesRWKeywordsRule() {
		return getProvidesRWKeywordsAccess().getRule();
	}
	
	//RequiresRWKeywords:
	//	'requires' 'readwrite';
	public RequiresRWKeywordsElements getRequiresRWKeywordsAccess() {
		return pRequiresRWKeywords;
	}
	
	public ParserRule getRequiresRWKeywordsRule() {
		return getRequiresRWKeywordsAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
