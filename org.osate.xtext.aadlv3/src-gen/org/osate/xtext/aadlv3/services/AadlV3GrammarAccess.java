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
		private final Assignment cPrivateAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cPrivatePrivateKeyword_0_0 = (Keyword)cPrivateAssignment_0.eContents().get(0);
		private final Keyword cPackageKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameQualifiedNameParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cIsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Alternatives cAlternatives_4 = (Alternatives)cGroup.eContents().get(4);
		private final Assignment cElementsAssignment_4_0 = (Assignment)cAlternatives_4.eContents().get(0);
		private final RuleCall cElementsAnnexLibraryParserRuleCall_4_0_0 = (RuleCall)cElementsAssignment_4_0.eContents().get(0);
		private final Alternatives cAlternatives_4_1 = (Alternatives)cAlternatives_4.eContents().get(1);
		private final Assignment cImportsAssignment_4_1_0 = (Assignment)cAlternatives_4_1.eContents().get(0);
		private final RuleCall cImportsImportParserRuleCall_4_1_0_0 = (RuleCall)cImportsAssignment_4_1_0.eContents().get(0);
		private final Assignment cElementsAssignment_4_1_1 = (Assignment)cAlternatives_4_1.eContents().get(1);
		private final RuleCall cElementsPackageElementParserRuleCall_4_1_1_0 = (RuleCall)cElementsAssignment_4_1_1.eContents().get(0);
		private final Keyword cEndKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//PackageDeclaration av3::PackageDeclaration:
		//	private?='private'? 'package' name=QualifiedName 'is' (elements+=AnnexLibrary | (imports+=Import |
		//	elements+=PackageElement)*) 'end' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//private?='private'? 'package' name=QualifiedName 'is' (elements+=AnnexLibrary | (imports+=Import |
		//elements+=PackageElement)*) 'end' ';'
		public Group getGroup() { return cGroup; }
		
		//private?='private'?
		public Assignment getPrivateAssignment_0() { return cPrivateAssignment_0; }
		
		//'private'
		public Keyword getPrivatePrivateKeyword_0_0() { return cPrivatePrivateKeyword_0_0; }
		
		//'package'
		public Keyword getPackageKeyword_1() { return cPackageKeyword_1; }
		
		//name=QualifiedName
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_2_0() { return cNameQualifiedNameParserRuleCall_2_0; }
		
		//'is'
		public Keyword getIsKeyword_3() { return cIsKeyword_3; }
		
		//elements+=AnnexLibrary | (imports+=Import | elements+=PackageElement)*
		public Alternatives getAlternatives_4() { return cAlternatives_4; }
		
		//elements+=AnnexLibrary
		public Assignment getElementsAssignment_4_0() { return cElementsAssignment_4_0; }
		
		//AnnexLibrary
		public RuleCall getElementsAnnexLibraryParserRuleCall_4_0_0() { return cElementsAnnexLibraryParserRuleCall_4_0_0; }
		
		//(imports+=Import | elements+=PackageElement)*
		public Alternatives getAlternatives_4_1() { return cAlternatives_4_1; }
		
		//imports+=Import
		public Assignment getImportsAssignment_4_1_0() { return cImportsAssignment_4_1_0; }
		
		//Import
		public RuleCall getImportsImportParserRuleCall_4_1_0_0() { return cImportsImportParserRuleCall_4_1_0_0; }
		
		//elements+=PackageElement
		public Assignment getElementsAssignment_4_1_1() { return cElementsAssignment_4_1_1; }
		
		//PackageElement
		public RuleCall getElementsPackageElementParserRuleCall_4_1_1_0() { return cElementsPackageElementParserRuleCall_4_1_1_0; }
		
		//'end'
		public Keyword getEndKeyword_5() { return cEndKeyword_5; }
		
		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}
	public class AnnexLibraryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.AnnexLibrary");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCommercialAtKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//AnnexLibrary av3::AnnexLibrary:
		//	'@' name=ID '{' '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'@' name=ID '{' '}'
		public Group getGroup() { return cGroup; }
		
		//'@'
		public Keyword getCommercialAtKeyword_0() { return cCommercialAtKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class PackageElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.PackageElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPackageDeclarationParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cComponentInterfaceParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cComponentImplementationParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cComponentConfigurationParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cPropertyDefinitionParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cPropertySetParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cWorkingsetParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cTypeDefParserRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);
		private final RuleCall cConstantDefParserRuleCall_8 = (RuleCall)cAlternatives.eContents().get(8);
		
		//PackageElement av3::PackageElement:
		//	PackageDeclaration | ComponentInterface | ComponentImplementation | ComponentConfiguration | PropertyDefinition |
		//	PropertySet | Workingset | TypeDef | ConstantDef;
		@Override public ParserRule getRule() { return rule; }
		
		//PackageDeclaration | ComponentInterface | ComponentImplementation | ComponentConfiguration | PropertyDefinition |
		//PropertySet | Workingset | TypeDef | ConstantDef
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//PackageDeclaration
		public RuleCall getPackageDeclarationParserRuleCall_0() { return cPackageDeclarationParserRuleCall_0; }
		
		//ComponentInterface
		public RuleCall getComponentInterfaceParserRuleCall_1() { return cComponentInterfaceParserRuleCall_1; }
		
		//ComponentImplementation
		public RuleCall getComponentImplementationParserRuleCall_2() { return cComponentImplementationParserRuleCall_2; }
		
		//ComponentConfiguration
		public RuleCall getComponentConfigurationParserRuleCall_3() { return cComponentConfigurationParserRuleCall_3; }
		
		//PropertyDefinition
		public RuleCall getPropertyDefinitionParserRuleCall_4() { return cPropertyDefinitionParserRuleCall_4; }
		
		//PropertySet
		public RuleCall getPropertySetParserRuleCall_5() { return cPropertySetParserRuleCall_5; }
		
		//Workingset
		public RuleCall getWorkingsetParserRuleCall_6() { return cWorkingsetParserRuleCall_6; }
		
		//TypeDef
		public RuleCall getTypeDefParserRuleCall_7() { return cTypeDefParserRuleCall_7; }
		
		//ConstantDef
		public RuleCall getConstantDefParserRuleCall_8() { return cConstantDefParserRuleCall_8; }
	}
	public class PropertyDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.PropertyDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPrivateAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cPrivatePrivateKeyword_0_0 = (Keyword)cPrivateAssignment_0.eContents().get(0);
		private final Keyword cPropertyKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTypeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTypeTypeParserRuleCall_4_0 = (RuleCall)cTypeAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cForKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Alternatives cAlternatives_5_2 = (Alternatives)cGroup_5.eContents().get(2);
		private final Assignment cForAllAssignment_5_2_0 = (Assignment)cAlternatives_5_2.eContents().get(0);
		private final Keyword cForAllAllKeyword_5_2_0_0 = (Keyword)cForAllAssignment_5_2_0.eContents().get(0);
		private final Group cGroup_5_2_1 = (Group)cAlternatives_5_2.eContents().get(1);
		private final RuleCall cAppliesToParserRuleCall_5_2_1_0 = (RuleCall)cGroup_5_2_1.eContents().get(0);
		private final Group cGroup_5_2_1_1 = (Group)cGroup_5_2_1.eContents().get(1);
		private final Keyword cCommaKeyword_5_2_1_1_0 = (Keyword)cGroup_5_2_1_1.eContents().get(0);
		private final RuleCall cAppliesToParserRuleCall_5_2_1_1_1 = (RuleCall)cGroup_5_2_1_1.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_5_3 = (Keyword)cGroup_5.eContents().get(3);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//PropertyDefinition av3::PropertyDefinition:
		//	private?='private'? 'property' name=ID ':' type=Type ('for' '(' (forAll?='all' | AppliesTo (',' AppliesTo)*) ')')?
		//	';';
		@Override public ParserRule getRule() { return rule; }
		
		//private?='private'? 'property' name=ID ':' type=Type ('for' '(' (forAll?='all' | AppliesTo (',' AppliesTo)*) ')')? ';'
		public Group getGroup() { return cGroup; }
		
		//private?='private'?
		public Assignment getPrivateAssignment_0() { return cPrivateAssignment_0; }
		
		//'private'
		public Keyword getPrivatePrivateKeyword_0_0() { return cPrivatePrivateKeyword_0_0; }
		
		//'property'
		public Keyword getPropertyKeyword_1() { return cPropertyKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//':'
		public Keyword getColonKeyword_3() { return cColonKeyword_3; }
		
		//type=Type
		public Assignment getTypeAssignment_4() { return cTypeAssignment_4; }
		
		//Type
		public RuleCall getTypeTypeParserRuleCall_4_0() { return cTypeTypeParserRuleCall_4_0; }
		
		//('for' '(' (forAll?='all' | AppliesTo (',' AppliesTo)*) ')')?
		public Group getGroup_5() { return cGroup_5; }
		
		//'for'
		public Keyword getForKeyword_5_0() { return cForKeyword_5_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_5_1() { return cLeftParenthesisKeyword_5_1; }
		
		//forAll?='all' | AppliesTo (',' AppliesTo)*
		public Alternatives getAlternatives_5_2() { return cAlternatives_5_2; }
		
		//forAll?='all'
		public Assignment getForAllAssignment_5_2_0() { return cForAllAssignment_5_2_0; }
		
		//'all'
		public Keyword getForAllAllKeyword_5_2_0_0() { return cForAllAllKeyword_5_2_0_0; }
		
		//AppliesTo (',' AppliesTo)*
		public Group getGroup_5_2_1() { return cGroup_5_2_1; }
		
		//AppliesTo
		public RuleCall getAppliesToParserRuleCall_5_2_1_0() { return cAppliesToParserRuleCall_5_2_1_0; }
		
		//(',' AppliesTo)*
		public Group getGroup_5_2_1_1() { return cGroup_5_2_1_1; }
		
		//','
		public Keyword getCommaKeyword_5_2_1_1_0() { return cCommaKeyword_5_2_1_1_0; }
		
		//AppliesTo
		public RuleCall getAppliesToParserRuleCall_5_2_1_1_1() { return cAppliesToParserRuleCall_5_2_1_1_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_5_3() { return cRightParenthesisKeyword_5_3; }
		
		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
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
		//	componentCategories+=ComponentCategory | featureCategories+=FeatureCategory | associationTypes+=AssociationType;
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
		private final Assignment cPrivateAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cPrivatePrivateKeyword_0_0 = (Keyword)cPrivateAssignment_0.eContents().get(0);
		private final Keyword cPropertiesKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cPropertiesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cPropertiesPropertyDefinitionCrossReference_5_0 = (CrossReference)cPropertiesAssignment_5.eContents().get(0);
		private final RuleCall cPropertiesPropertyDefinitionQualifiedReferenceParserRuleCall_5_0_1 = (RuleCall)cPropertiesPropertyDefinitionCrossReference_5_0.eContents().get(1);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cCommaKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cPropertiesAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final CrossReference cPropertiesPropertyDefinitionCrossReference_6_1_0 = (CrossReference)cPropertiesAssignment_6_1.eContents().get(0);
		private final RuleCall cPropertiesPropertyDefinitionQualifiedNameParserRuleCall_6_1_0_1 = (RuleCall)cPropertiesPropertyDefinitionCrossReference_6_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cSemicolonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//PropertySet av3::PropertySet:
		//	private?='private'? 'properties' name=ID ':' '{' properties+=[av3::PropertyDefinition|QualifiedReference] (','
		//	properties+=[av3::PropertyDefinition|QualifiedName])* '}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//private?='private'? 'properties' name=ID ':' '{' properties+=[av3::PropertyDefinition|QualifiedReference] (','
		//properties+=[av3::PropertyDefinition|QualifiedName])* '}' ';'
		public Group getGroup() { return cGroup; }
		
		//private?='private'?
		public Assignment getPrivateAssignment_0() { return cPrivateAssignment_0; }
		
		//'private'
		public Keyword getPrivatePrivateKeyword_0_0() { return cPrivatePrivateKeyword_0_0; }
		
		//'properties'
		public Keyword getPropertiesKeyword_1() { return cPropertiesKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//':'
		public Keyword getColonKeyword_3() { return cColonKeyword_3; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }
		
		//properties+=[av3::PropertyDefinition|QualifiedReference]
		public Assignment getPropertiesAssignment_5() { return cPropertiesAssignment_5; }
		
		//[av3::PropertyDefinition|QualifiedReference]
		public CrossReference getPropertiesPropertyDefinitionCrossReference_5_0() { return cPropertiesPropertyDefinitionCrossReference_5_0; }
		
		//QualifiedReference
		public RuleCall getPropertiesPropertyDefinitionQualifiedReferenceParserRuleCall_5_0_1() { return cPropertiesPropertyDefinitionQualifiedReferenceParserRuleCall_5_0_1; }
		
		//(',' properties+=[av3::PropertyDefinition|QualifiedName])*
		public Group getGroup_6() { return cGroup_6; }
		
		//','
		public Keyword getCommaKeyword_6_0() { return cCommaKeyword_6_0; }
		
		//properties+=[av3::PropertyDefinition|QualifiedName]
		public Assignment getPropertiesAssignment_6_1() { return cPropertiesAssignment_6_1; }
		
		//[av3::PropertyDefinition|QualifiedName]
		public CrossReference getPropertiesPropertyDefinitionCrossReference_6_1_0() { return cPropertiesPropertyDefinitionCrossReference_6_1_0; }
		
		//QualifiedName
		public RuleCall getPropertiesPropertyDefinitionQualifiedNameParserRuleCall_6_1_0_1() { return cPropertiesPropertyDefinitionQualifiedNameParserRuleCall_6_1_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
		
		//';'
		public Keyword getSemicolonKeyword_8() { return cSemicolonKeyword_8; }
	}
	public class TypeDefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.TypeDef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPrivateAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cPrivatePrivateKeyword_0_0 = (Keyword)cPrivateAssignment_0.eContents().get(0);
		private final Keyword cTypeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cExtendsKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cSuperTypeAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cSuperTypeTypeParserRuleCall_3_1_0 = (RuleCall)cSuperTypeAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cColonKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cBaseTypeAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cBaseTypeTypeParserRuleCall_4_1_0 = (RuleCall)cBaseTypeAssignment_4_1.eContents().get(0);
		private final RuleCall cPropertiesBlockParserRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//TypeDef av3::TypeDef:
		//	private?='private'? 'type' name=ID ('extends' superType=Type)? (':' baseType=Type)? PropertiesBlock? ';';
		@Override public ParserRule getRule() { return rule; }
		
		//private?='private'? 'type' name=ID ('extends' superType=Type)? (':' baseType=Type)? PropertiesBlock? ';'
		public Group getGroup() { return cGroup; }
		
		//private?='private'?
		public Assignment getPrivateAssignment_0() { return cPrivateAssignment_0; }
		
		//'private'
		public Keyword getPrivatePrivateKeyword_0_0() { return cPrivatePrivateKeyword_0_0; }
		
		//'type'
		public Keyword getTypeKeyword_1() { return cTypeKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//('extends' superType=Type)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'extends'
		public Keyword getExtendsKeyword_3_0() { return cExtendsKeyword_3_0; }
		
		//superType=Type
		public Assignment getSuperTypeAssignment_3_1() { return cSuperTypeAssignment_3_1; }
		
		//Type
		public RuleCall getSuperTypeTypeParserRuleCall_3_1_0() { return cSuperTypeTypeParserRuleCall_3_1_0; }
		
		//(':' baseType=Type)?
		public Group getGroup_4() { return cGroup_4; }
		
		//':'
		public Keyword getColonKeyword_4_0() { return cColonKeyword_4_0; }
		
		//baseType=Type
		public Assignment getBaseTypeAssignment_4_1() { return cBaseTypeAssignment_4_1; }
		
		//Type
		public RuleCall getBaseTypeTypeParserRuleCall_4_1_0() { return cBaseTypeTypeParserRuleCall_4_1_0; }
		
		//PropertiesBlock?
		public RuleCall getPropertiesBlockParserRuleCall_5() { return cPropertiesBlockParserRuleCall_5; }
		
		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}
	public class ConstantDefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ConstantDef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPrivateAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cPrivatePrivateKeyword_0_0 = (Keyword)cPrivateAssignment_0.eContents().get(0);
		private final Keyword cConstantKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cValueLiteralParserRuleCall_4_0 = (RuleCall)cValueAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//ConstantDef av3::Constant:
		//	private?='private'? 'constant' name=ID ':' value=Literal ';';
		@Override public ParserRule getRule() { return rule; }
		
		//private?='private'? 'constant' name=ID ':' value=Literal ';'
		public Group getGroup() { return cGroup; }
		
		//private?='private'?
		public Assignment getPrivateAssignment_0() { return cPrivateAssignment_0; }
		
		//'private'
		public Keyword getPrivatePrivateKeyword_0_0() { return cPrivatePrivateKeyword_0_0; }
		
		//'constant'
		public Keyword getConstantKeyword_1() { return cConstantKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//':'
		public Keyword getColonKeyword_3() { return cColonKeyword_3; }
		
		//value=Literal
		public Assignment getValueAssignment_4() { return cValueAssignment_4; }
		
		//Literal
		public RuleCall getValueLiteralParserRuleCall_4_0() { return cValueLiteralParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
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
		private final Assignment cValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cValueLiteralParserRuleCall_4_0 = (RuleCall)cValueAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//PropertyAssociation av3::PropertyAssociation:
		//	target=ModelElementReference? '#' property=[av3::PropertyDefinition|QualifiedName]
		//	propertyAssociationType=PropertyAssociationType value=Literal ';';
		@Override public ParserRule getRule() { return rule; }
		
		//target=ModelElementReference? '#' property=[av3::PropertyDefinition|QualifiedName]
		//propertyAssociationType=PropertyAssociationType value=Literal ';'
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
		
		//propertyAssociationType=PropertyAssociationType
		public Assignment getPropertyAssociationTypeAssignment_3() { return cPropertyAssociationTypeAssignment_3; }
		
		//PropertyAssociationType
		public RuleCall getPropertyAssociationTypePropertyAssociationTypeParserRuleCall_3_0() { return cPropertyAssociationTypePropertyAssociationTypeParserRuleCall_3_0; }
		
		//value=Literal
		public Assignment getValueAssignment_4() { return cValueAssignment_4; }
		
		//Literal
		public RuleCall getValueLiteralParserRuleCall_4_0() { return cValueLiteralParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class PropertyAssociationTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.PropertyAssociationType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cEqualsSignGreaterThanSignKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cAsteriskEqualsSignGreaterThanSignKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		
		//PropertyAssociationType av3::PropertyAssociationType:
		//	'=>' | '=' | '*=>';
		@Override public ParserRule getRule() { return rule; }
		
		//'=>' | '=' | '*=>'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_0() { return cEqualsSignGreaterThanSignKeyword_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }
		
		//'*=>'
		public Keyword getAsteriskEqualsSignGreaterThanSignKeyword_2() { return cAsteriskEqualsSignGreaterThanSignKeyword_2; }
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
		//	element=[av3::ModelElement] -> ({av3::ModelElementReference.context=current} '.' element=[av3::ModelElement])*;
		@Override public ParserRule getRule() { return rule; }
		
		//// => or -> both work
		// element=[av3::ModelElement] -> ({av3::ModelElementReference.context=current} '.'
		//element=[av3::ModelElement])*
		public Group getGroup() { return cGroup; }
		
		//// => or -> both work
		// element=[av3::ModelElement]
		public Assignment getElementAssignment_0() { return cElementAssignment_0; }
		
		//[av3::ModelElement]
		public CrossReference getElementModelElementCrossReference_0_0() { return cElementModelElementCrossReference_0_0; }
		
		//ID
		public RuleCall getElementModelElementIDTerminalRuleCall_0_0_1() { return cElementModelElementIDTerminalRuleCall_0_0_1; }
		
		//-> ({av3::ModelElementReference.context=current} '.' element=[av3::ModelElement])*
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
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//ComponentInterface av3::ComponentInterface:
		//	private?='private'? category=ComponentCategory? 'interface' name=ID ('extends' InterfaceExtensions)? InterfaceBody
		//	';';
		@Override public ParserRule getRule() { return rule; }
		
		//private?='private'? category=ComponentCategory? 'interface' name=ID ('extends' InterfaceExtensions)? InterfaceBody ';'
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
		
		//('extends' InterfaceExtensions)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'extends'
		public Keyword getExtendsKeyword_4_0() { return cExtendsKeyword_4_0; }
		
		//InterfaceExtensions
		public RuleCall getInterfaceExtensionsParserRuleCall_4_1() { return cInterfaceExtensionsParserRuleCall_4_1; }
		
		//InterfaceBody
		public RuleCall getInterfaceBodyParserRuleCall_5() { return cInterfaceBodyParserRuleCall_5; }
		
		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}
	public class InterfaceBodyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.InterfaceBody");
		private final Group cGroup = (Group)rule.eContents().get(0);
		private final Keyword cIsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cInterfaceElementParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cEndKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//fragment InterfaceBody *:
		//	'is' InterfaceElement* 'end';
		@Override public ParserRule getRule() { return rule; }
		
		//'is' InterfaceElement* 'end'
		public Group getGroup() { return cGroup; }
		
		//'is'
		public Keyword getIsKeyword_0() { return cIsKeyword_0; }
		
		//InterfaceElement*
		public RuleCall getInterfaceElementParserRuleCall_1() { return cInterfaceElementParserRuleCall_1; }
		
		//'end'
		public Keyword getEndKeyword_2() { return cEndKeyword_2; }
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
		private final Assignment cOwnedPropertyAssociationsAssignment_4 = (Assignment)cAlternatives.eContents().get(4);
		private final RuleCall cOwnedPropertyAssociationsPropertyAssociationParserRuleCall_4_0 = (RuleCall)cOwnedPropertyAssociationsAssignment_4.eContents().get(0);
		private final Assignment cAnnexSubclauseAssignment_5 = (Assignment)cAlternatives.eContents().get(5);
		private final RuleCall cAnnexSubclauseAnnexSubclauseParserRuleCall_5_0 = (RuleCall)cAnnexSubclauseAssignment_5.eContents().get(0);
		
		//fragment InterfaceElement *:
		//	features+=Feature | flows+=FlowPath | flows+=FlowSource | flows+=FlowSink |
		//	ownedPropertyAssociations+=PropertyAssociation | annexSubclause+=AnnexSubclause;
		@Override public ParserRule getRule() { return rule; }
		
		//features+=Feature | flows+=FlowPath | flows+=FlowSource | flows+=FlowSink |
		//ownedPropertyAssociations+=PropertyAssociation | annexSubclause+=AnnexSubclause
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
		
		//ownedPropertyAssociations+=PropertyAssociation
		public Assignment getOwnedPropertyAssociationsAssignment_4() { return cOwnedPropertyAssociationsAssignment_4; }
		
		//PropertyAssociation
		public RuleCall getOwnedPropertyAssociationsPropertyAssociationParserRuleCall_4_0() { return cOwnedPropertyAssociationsPropertyAssociationParserRuleCall_4_0; }
		
		//annexSubclause+=AnnexSubclause
		public Assignment getAnnexSubclauseAssignment_5() { return cAnnexSubclauseAssignment_5; }
		
		//AnnexSubclause
		public RuleCall getAnnexSubclauseAnnexSubclauseParserRuleCall_5_0() { return cAnnexSubclauseAnnexSubclauseParserRuleCall_5_0; }
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
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//ComponentImplementation av3::ComponentImplementation:
		//	private?='private'? category=ComponentCategory name=DottedName ('extends' ImplementationExtensions)?
		//	ImplementationBody ';';
		@Override public ParserRule getRule() { return rule; }
		
		//private?='private'? category=ComponentCategory name=DottedName ('extends' ImplementationExtensions)? ImplementationBody
		//';'
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
		
		//('extends' ImplementationExtensions)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'extends'
		public Keyword getExtendsKeyword_3_0() { return cExtendsKeyword_3_0; }
		
		//ImplementationExtensions
		public RuleCall getImplementationExtensionsParserRuleCall_3_1() { return cImplementationExtensionsParserRuleCall_3_1; }
		
		//ImplementationBody
		public RuleCall getImplementationBodyParserRuleCall_4() { return cImplementationBodyParserRuleCall_4; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class ImplementationBodyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ImplementationBody");
		private final Group cGroup = (Group)rule.eContents().get(0);
		private final Keyword cIsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cImplementationElementParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cEndKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//fragment ImplementationBody *:
		//	'is' ImplementationElement* 'end';
		@Override public ParserRule getRule() { return rule; }
		
		//'is' ImplementationElement* 'end'
		public Group getGroup() { return cGroup; }
		
		//'is'
		public Keyword getIsKeyword_0() { return cIsKeyword_0; }
		
		//ImplementationElement*
		public RuleCall getImplementationElementParserRuleCall_1() { return cImplementationElementParserRuleCall_1; }
		
		//'end'
		public Keyword getEndKeyword_2() { return cEndKeyword_2; }
	}
	public class ImplementationElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ImplementationElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(0);
		private final Assignment cConnectionsAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cConnectionsConnectionParserRuleCall_0_0 = (RuleCall)cConnectionsAssignment_0.eContents().get(0);
		private final Assignment cBindingsAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cBindingsBindingParserRuleCall_1_0 = (RuleCall)cBindingsAssignment_1.eContents().get(0);
		private final Assignment cComponentsAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final RuleCall cComponentsSubcomponentParserRuleCall_2_0 = (RuleCall)cComponentsAssignment_2.eContents().get(0);
		private final Assignment cPathsAssignment_3 = (Assignment)cAlternatives.eContents().get(3);
		private final RuleCall cPathsPathParserRuleCall_3_0 = (RuleCall)cPathsAssignment_3.eContents().get(0);
		private final Assignment cFlowAssignmentsAssignment_4 = (Assignment)cAlternatives.eContents().get(4);
		private final RuleCall cFlowAssignmentsFlowAssignmentParserRuleCall_4_0 = (RuleCall)cFlowAssignmentsAssignment_4.eContents().get(0);
		private final Assignment cClassifierAssignmentsAssignment_5 = (Assignment)cAlternatives.eContents().get(5);
		private final RuleCall cClassifierAssignmentsClassifierAssignmentParserRuleCall_5_0 = (RuleCall)cClassifierAssignmentsAssignment_5.eContents().get(0);
		private final Assignment cClassifierAssignmentsAssignment_6 = (Assignment)cAlternatives.eContents().get(6);
		private final RuleCall cClassifierAssignmentsClassifierAssignmentPatternParserRuleCall_6_0 = (RuleCall)cClassifierAssignmentsAssignment_6.eContents().get(0);
		private final Assignment cOwnedPropertyAssociationsAssignment_7 = (Assignment)cAlternatives.eContents().get(7);
		private final RuleCall cOwnedPropertyAssociationsPropertyAssociationParserRuleCall_7_0 = (RuleCall)cOwnedPropertyAssociationsAssignment_7.eContents().get(0);
		private final Assignment cAnnexSubclauseAssignment_8 = (Assignment)cAlternatives.eContents().get(8);
		private final RuleCall cAnnexSubclauseAnnexSubclauseParserRuleCall_8_0 = (RuleCall)cAnnexSubclauseAssignment_8.eContents().get(0);
		
		//fragment ImplementationElement *:
		//	connections+=Connection | bindings+=Binding | components+=Subcomponent | paths+=Path |
		//	flowAssignments+=FlowAssignment | classifierAssignments+=ClassifierAssignment |
		//	classifierAssignments+=ClassifierAssignmentPattern | ownedPropertyAssociations+=PropertyAssociation |
		//	annexSubclause+=AnnexSubclause;
		@Override public ParserRule getRule() { return rule; }
		
		//connections+=Connection | bindings+=Binding | components+=Subcomponent | paths+=Path | flowAssignments+=FlowAssignment |
		//classifierAssignments+=ClassifierAssignment | classifierAssignments+=ClassifierAssignmentPattern |
		//ownedPropertyAssociations+=PropertyAssociation | annexSubclause+=AnnexSubclause
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//connections+=Connection
		public Assignment getConnectionsAssignment_0() { return cConnectionsAssignment_0; }
		
		//Connection
		public RuleCall getConnectionsConnectionParserRuleCall_0_0() { return cConnectionsConnectionParserRuleCall_0_0; }
		
		//bindings+=Binding
		public Assignment getBindingsAssignment_1() { return cBindingsAssignment_1; }
		
		//Binding
		public RuleCall getBindingsBindingParserRuleCall_1_0() { return cBindingsBindingParserRuleCall_1_0; }
		
		//components+=Subcomponent
		public Assignment getComponentsAssignment_2() { return cComponentsAssignment_2; }
		
		//Subcomponent
		public RuleCall getComponentsSubcomponentParserRuleCall_2_0() { return cComponentsSubcomponentParserRuleCall_2_0; }
		
		//paths+=Path
		public Assignment getPathsAssignment_3() { return cPathsAssignment_3; }
		
		//Path
		public RuleCall getPathsPathParserRuleCall_3_0() { return cPathsPathParserRuleCall_3_0; }
		
		//flowAssignments+=FlowAssignment
		public Assignment getFlowAssignmentsAssignment_4() { return cFlowAssignmentsAssignment_4; }
		
		//FlowAssignment
		public RuleCall getFlowAssignmentsFlowAssignmentParserRuleCall_4_0() { return cFlowAssignmentsFlowAssignmentParserRuleCall_4_0; }
		
		//classifierAssignments+=ClassifierAssignment
		public Assignment getClassifierAssignmentsAssignment_5() { return cClassifierAssignmentsAssignment_5; }
		
		//ClassifierAssignment
		public RuleCall getClassifierAssignmentsClassifierAssignmentParserRuleCall_5_0() { return cClassifierAssignmentsClassifierAssignmentParserRuleCall_5_0; }
		
		//classifierAssignments+=ClassifierAssignmentPattern
		public Assignment getClassifierAssignmentsAssignment_6() { return cClassifierAssignmentsAssignment_6; }
		
		//ClassifierAssignmentPattern
		public RuleCall getClassifierAssignmentsClassifierAssignmentPatternParserRuleCall_6_0() { return cClassifierAssignmentsClassifierAssignmentPatternParserRuleCall_6_0; }
		
		//ownedPropertyAssociations+=PropertyAssociation
		public Assignment getOwnedPropertyAssociationsAssignment_7() { return cOwnedPropertyAssociationsAssignment_7; }
		
		//PropertyAssociation
		public RuleCall getOwnedPropertyAssociationsPropertyAssociationParserRuleCall_7_0() { return cOwnedPropertyAssociationsPropertyAssociationParserRuleCall_7_0; }
		
		//annexSubclause+=AnnexSubclause
		public Assignment getAnnexSubclauseAssignment_8() { return cAnnexSubclauseAssignment_8; }
		
		//AnnexSubclause
		public RuleCall getAnnexSubclauseAnnexSubclauseParserRuleCall_8_0() { return cAnnexSubclauseAnnexSubclauseParserRuleCall_8_0; }
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
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cExtendsKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final RuleCall cConfigurationExtensionsParserRuleCall_4_1 = (RuleCall)cGroup_4.eContents().get(1);
		private final RuleCall cConfigurationElementBlockParserRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//ComponentConfiguration av3::ComponentConfiguration:
		//	private?='private'? 'configuration' name=DottedName Parameters? ('extends' ConfigurationExtensions)?
		//	ConfigurationElementBlock ';';
		@Override public ParserRule getRule() { return rule; }
		
		//private?='private'? 'configuration' name=DottedName Parameters? ('extends' ConfigurationExtensions)?
		//ConfigurationElementBlock ';'
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
		
		//('extends' ConfigurationExtensions)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'extends'
		public Keyword getExtendsKeyword_4_0() { return cExtendsKeyword_4_0; }
		
		//ConfigurationExtensions
		public RuleCall getConfigurationExtensionsParserRuleCall_4_1() { return cConfigurationExtensionsParserRuleCall_4_1; }
		
		//ConfigurationElementBlock
		public RuleCall getConfigurationElementBlockParserRuleCall_5() { return cConfigurationElementBlockParserRuleCall_5; }
		
		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}
	public class FeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.Feature");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cDirectionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDirectionFeatureDirectionParserRuleCall_2_0 = (RuleCall)cDirectionAssignment_2.eContents().get(0);
		private final Assignment cCategoryAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cCategoryFeatureCategoryParserRuleCall_3_0 = (RuleCall)cCategoryAssignment_3.eContents().get(0);
		private final Assignment cTypeReferenceAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTypeReferenceReversableTypeReferenceParserRuleCall_4_0 = (RuleCall)cTypeReferenceAssignment_4.eContents().get(0);
		private final RuleCall cPropertiesBlockParserRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//// (Instance) model elements
		// Feature av3::Feature:
		//	name=ID ':' direction=FeatureDirection? category=FeatureCategory typeReference=ReversableTypeReference?
		//	PropertiesBlock? ';';
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' direction=FeatureDirection? category=FeatureCategory typeReference=ReversableTypeReference? PropertiesBlock?
		//';'
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
		
		//category=FeatureCategory
		public Assignment getCategoryAssignment_3() { return cCategoryAssignment_3; }
		
		//FeatureCategory
		public RuleCall getCategoryFeatureCategoryParserRuleCall_3_0() { return cCategoryFeatureCategoryParserRuleCall_3_0; }
		
		//typeReference=ReversableTypeReference?
		public Assignment getTypeReferenceAssignment_4() { return cTypeReferenceAssignment_4; }
		
		//ReversableTypeReference
		public RuleCall getTypeReferenceReversableTypeReferenceParserRuleCall_4_0() { return cTypeReferenceReversableTypeReferenceParserRuleCall_4_0; }
		
		//PropertiesBlock?
		public RuleCall getPropertiesBlockParserRuleCall_5() { return cPropertiesBlockParserRuleCall_5; }
		
		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}
	public class SubcomponentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.Subcomponent");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSubcomponentAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cCategoryAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cCategoryComponentCategoryParserRuleCall_3_0 = (RuleCall)cCategoryAssignment_3.eContents().get(0);
		private final Assignment cTypeReferencesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTypeReferencesClassifierOrTypeReferenceParserRuleCall_4_0 = (RuleCall)cTypeReferencesAssignment_4.eContents().get(0);
		private final RuleCall cNestedComponentImplementationBlockParserRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Subcomponent av3::Subcomponent:
		//	{av3::Subcomponent} name=ID ':' category=ComponentCategory typeReferences+=ClassifierOrTypeReference
		//	//(',' typeReferences+=TypeReference?)* 
		//? NestedComponentImplementationBlock? ';';
		@Override public ParserRule getRule() { return rule; }
		
		//{av3::Subcomponent} name=ID ':' category=ComponentCategory typeReferences+=ClassifierOrTypeReference
		////(',' typeReferences+=TypeReference?)* 
		//? NestedComponentImplementationBlock? ';'
		public Group getGroup() { return cGroup; }
		
		//{av3::Subcomponent}
		public Action getSubcomponentAction_0() { return cSubcomponentAction_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//category=ComponentCategory
		public Assignment getCategoryAssignment_3() { return cCategoryAssignment_3; }
		
		//ComponentCategory
		public RuleCall getCategoryComponentCategoryParserRuleCall_3_0() { return cCategoryComponentCategoryParserRuleCall_3_0; }
		
		//typeReferences+=ClassifierOrTypeReference //(',' typeReferences+=TypeReference?)* 
		//?
		public Assignment getTypeReferencesAssignment_4() { return cTypeReferencesAssignment_4; }
		
		//ClassifierOrTypeReference
		public RuleCall getTypeReferencesClassifierOrTypeReferenceParserRuleCall_4_0() { return cTypeReferencesClassifierOrTypeReferenceParserRuleCall_4_0; }
		
		//NestedComponentImplementationBlock?
		public RuleCall getNestedComponentImplementationBlockParserRuleCall_5() { return cNestedComponentImplementationBlockParserRuleCall_5; }
		
		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}
	public class ConnectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.Connection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cAssociationTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAssociationTypeIsConnectionParserRuleCall_2_0 = (RuleCall)cAssociationTypeAssignment_2.eContents().get(0);
		private final Assignment cSourceAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSourceModelElementReferenceParserRuleCall_3_0 = (RuleCall)cSourceAssignment_3.eContents().get(0);
		private final Alternatives cAlternatives_4 = (Alternatives)cGroup.eContents().get(4);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_4_0 = (Keyword)cAlternatives_4.eContents().get(0);
		private final Assignment cBidirectionalAssignment_4_1 = (Assignment)cAlternatives_4.eContents().get(1);
		private final Keyword cBidirectionalLessThanSignHyphenMinusGreaterThanSignKeyword_4_1_0 = (Keyword)cBidirectionalAssignment_4_1.eContents().get(0);
		private final Assignment cDestinationAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cDestinationModelElementReferenceParserRuleCall_5_0 = (RuleCall)cDestinationAssignment_5.eContents().get(0);
		private final RuleCall cPropertiesBlockParserRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Connection av3::Association:
		//	name=ID ':' associationType=IsConnection source=ModelElementReference ('->' | bidirectional?='<->')
		//	destination=ModelElementReference PropertiesBlock? ';';
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' associationType=IsConnection source=ModelElementReference ('->' | bidirectional?='<->')
		//destination=ModelElementReference PropertiesBlock? ';'
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//associationType=IsConnection
		public Assignment getAssociationTypeAssignment_2() { return cAssociationTypeAssignment_2; }
		
		//IsConnection
		public RuleCall getAssociationTypeIsConnectionParserRuleCall_2_0() { return cAssociationTypeIsConnectionParserRuleCall_2_0; }
		
		//source=ModelElementReference
		public Assignment getSourceAssignment_3() { return cSourceAssignment_3; }
		
		//ModelElementReference
		public RuleCall getSourceModelElementReferenceParserRuleCall_3_0() { return cSourceModelElementReferenceParserRuleCall_3_0; }
		
		//'->' | bidirectional?='<->'
		public Alternatives getAlternatives_4() { return cAlternatives_4; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_4_0() { return cHyphenMinusGreaterThanSignKeyword_4_0; }
		
		//bidirectional?='<->'
		public Assignment getBidirectionalAssignment_4_1() { return cBidirectionalAssignment_4_1; }
		
		//'<->'
		public Keyword getBidirectionalLessThanSignHyphenMinusGreaterThanSignKeyword_4_1_0() { return cBidirectionalLessThanSignHyphenMinusGreaterThanSignKeyword_4_1_0; }
		
		//destination=ModelElementReference
		public Assignment getDestinationAssignment_5() { return cDestinationAssignment_5; }
		
		//ModelElementReference
		public RuleCall getDestinationModelElementReferenceParserRuleCall_5_0() { return cDestinationModelElementReferenceParserRuleCall_5_0; }
		
		//PropertiesBlock?
		public RuleCall getPropertiesBlockParserRuleCall_6() { return cPropertiesBlockParserRuleCall_6; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}
	public class BindingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.Binding");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cBindingTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cBindingTypeTypeDefCrossReference_2_0 = (CrossReference)cBindingTypeAssignment_2.eContents().get(0);
		private final RuleCall cBindingTypeTypeDefQualifiedNameParserRuleCall_2_0_1 = (RuleCall)cBindingTypeTypeDefCrossReference_2_0.eContents().get(1);
		private final Assignment cAssociationTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAssociationTypeIsBindingParserRuleCall_3_0 = (RuleCall)cAssociationTypeAssignment_3.eContents().get(0);
		private final Assignment cSourceAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSourceModelElementReferenceParserRuleCall_4_0 = (RuleCall)cSourceAssignment_4.eContents().get(0);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cDestinationAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cDestinationModelElementReferenceParserRuleCall_6_0 = (RuleCall)cDestinationAssignment_6.eContents().get(0);
		private final RuleCall cPropertiesBlockParserRuleCall_7 = (RuleCall)cGroup.eContents().get(7);
		private final Keyword cSemicolonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//Binding av3::Association:
		//	name=ID ':' bindingType=[av3::TypeDef|QualifiedName]? associationType=IsBinding source=ModelElementReference '->'
		//	destination=ModelElementReference PropertiesBlock? ';';
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' bindingType=[av3::TypeDef|QualifiedName]? associationType=IsBinding source=ModelElementReference '->'
		//destination=ModelElementReference PropertiesBlock? ';'
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//bindingType=[av3::TypeDef|QualifiedName]?
		public Assignment getBindingTypeAssignment_2() { return cBindingTypeAssignment_2; }
		
		//[av3::TypeDef|QualifiedName]
		public CrossReference getBindingTypeTypeDefCrossReference_2_0() { return cBindingTypeTypeDefCrossReference_2_0; }
		
		//QualifiedName
		public RuleCall getBindingTypeTypeDefQualifiedNameParserRuleCall_2_0_1() { return cBindingTypeTypeDefQualifiedNameParserRuleCall_2_0_1; }
		
		//associationType=IsBinding
		public Assignment getAssociationTypeAssignment_3() { return cAssociationTypeAssignment_3; }
		
		//IsBinding
		public RuleCall getAssociationTypeIsBindingParserRuleCall_3_0() { return cAssociationTypeIsBindingParserRuleCall_3_0; }
		
		//source=ModelElementReference
		public Assignment getSourceAssignment_4() { return cSourceAssignment_4; }
		
		//ModelElementReference
		public RuleCall getSourceModelElementReferenceParserRuleCall_4_0() { return cSourceModelElementReferenceParserRuleCall_4_0; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_5() { return cHyphenMinusGreaterThanSignKeyword_5; }
		
		//destination=ModelElementReference
		public Assignment getDestinationAssignment_6() { return cDestinationAssignment_6; }
		
		//ModelElementReference
		public RuleCall getDestinationModelElementReferenceParserRuleCall_6_0() { return cDestinationModelElementReferenceParserRuleCall_6_0; }
		
		//PropertiesBlock?
		public RuleCall getPropertiesBlockParserRuleCall_7() { return cPropertiesBlockParserRuleCall_7; }
		
		//';'
		public Keyword getSemicolonKeyword_8() { return cSemicolonKeyword_8; }
	}
	public class FlowPathElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.FlowPath");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cAssociationTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAssociationTypeIsFlowParserRuleCall_2_0 = (RuleCall)cAssociationTypeAssignment_2.eContents().get(0);
		private final Assignment cSourceAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSourceModelElementReferenceParserRuleCall_3_0 = (RuleCall)cSourceAssignment_3.eContents().get(0);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cDestinationAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cDestinationModelElementReferenceParserRuleCall_5_0 = (RuleCall)cDestinationAssignment_5.eContents().get(0);
		private final RuleCall cPropertiesBlockParserRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//FlowPath av3::Association:
		//	name=ID ':' associationType=IsFlow source=ModelElementReference '->' destination=ModelElementReference
		//	PropertiesBlock? ';';
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' associationType=IsFlow source=ModelElementReference '->' destination=ModelElementReference PropertiesBlock?
		//';'
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//associationType=IsFlow
		public Assignment getAssociationTypeAssignment_2() { return cAssociationTypeAssignment_2; }
		
		//IsFlow
		public RuleCall getAssociationTypeIsFlowParserRuleCall_2_0() { return cAssociationTypeIsFlowParserRuleCall_2_0; }
		
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
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}
	public class FlowSourceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.FlowSource");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cAssociationTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAssociationTypeIsFlowSourceParserRuleCall_2_0 = (RuleCall)cAssociationTypeAssignment_2.eContents().get(0);
		private final Assignment cDestinationAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDestinationModelElementReferenceParserRuleCall_3_0 = (RuleCall)cDestinationAssignment_3.eContents().get(0);
		private final RuleCall cPropertiesBlockParserRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//FlowSource av3::Association:
		//	name=ID ':' associationType=IsFlowSource destination=ModelElementReference PropertiesBlock? ';';
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' associationType=IsFlowSource destination=ModelElementReference PropertiesBlock? ';'
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//associationType=IsFlowSource
		public Assignment getAssociationTypeAssignment_2() { return cAssociationTypeAssignment_2; }
		
		//IsFlowSource
		public RuleCall getAssociationTypeIsFlowSourceParserRuleCall_2_0() { return cAssociationTypeIsFlowSourceParserRuleCall_2_0; }
		
		//destination=ModelElementReference
		public Assignment getDestinationAssignment_3() { return cDestinationAssignment_3; }
		
		//ModelElementReference
		public RuleCall getDestinationModelElementReferenceParserRuleCall_3_0() { return cDestinationModelElementReferenceParserRuleCall_3_0; }
		
		//PropertiesBlock?
		public RuleCall getPropertiesBlockParserRuleCall_4() { return cPropertiesBlockParserRuleCall_4; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class FlowSinkElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.FlowSink");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cAssociationTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAssociationTypeIsFlowSinkParserRuleCall_2_0 = (RuleCall)cAssociationTypeAssignment_2.eContents().get(0);
		private final Assignment cSourceAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSourceModelElementReferenceParserRuleCall_3_0 = (RuleCall)cSourceAssignment_3.eContents().get(0);
		private final RuleCall cPropertiesBlockParserRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//FlowSink av3::Association:
		//	name=ID ':' associationType=IsFlowSink source=ModelElementReference PropertiesBlock? ';';
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' associationType=IsFlowSink source=ModelElementReference PropertiesBlock? ';'
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//associationType=IsFlowSink
		public Assignment getAssociationTypeAssignment_2() { return cAssociationTypeAssignment_2; }
		
		//IsFlowSink
		public RuleCall getAssociationTypeIsFlowSinkParserRuleCall_2_0() { return cAssociationTypeIsFlowSinkParserRuleCall_2_0; }
		
		//source=ModelElementReference
		public Assignment getSourceAssignment_3() { return cSourceAssignment_3; }
		
		//ModelElementReference
		public RuleCall getSourceModelElementReferenceParserRuleCall_3_0() { return cSourceModelElementReferenceParserRuleCall_3_0; }
		
		//PropertiesBlock?
		public RuleCall getPropertiesBlockParserRuleCall_4() { return cPropertiesBlockParserRuleCall_4; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
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
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//fragment UseProps *:
		//	'use' 'properties' useProperties+=[av3::PropertySet|QualifiedName] (','
		//	useProperties+=[av3::PropertySet|QualifiedName])* ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'use' 'properties' useProperties+=[av3::PropertySet|QualifiedName] (','
		//useProperties+=[av3::PropertySet|QualifiedName])* ';'
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
		
		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class PathElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.Path");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFlowKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cElementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cElementsPathElementParserRuleCall_3_0 = (RuleCall)cElementsAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cElementsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cElementsPathElementParserRuleCall_4_1_0 = (RuleCall)cElementsAssignment_4_1.eContents().get(0);
		private final RuleCall cPropertiesBlockParserRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Path av3::PathSequence:
		//	name=ID ':' 'flow' elements+=PathElement ('->' elements+=PathElement)+ PropertiesBlock? ';';
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' 'flow' elements+=PathElement ('->' elements+=PathElement)+ PropertiesBlock? ';'
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//'flow'
		public Keyword getFlowKeyword_2() { return cFlowKeyword_2; }
		
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
		
		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
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
		private final Assignment cImportedNamespaceAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cImportedNamespaceQualifiedNameParserRuleCall_1_1_0 = (RuleCall)cImportedNamespaceAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cAsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cAliasAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cAliasIDTerminalRuleCall_2_1_0 = (RuleCall)cAliasAssignment_2_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Import av3::Import:
		//	'import' (importedNamespace=QualifiedNameWithWildcard | importedNamespace=QualifiedName) ('as' alias=ID)? ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'import' (importedNamespace=QualifiedNameWithWildcard | importedNamespace=QualifiedName) ('as' alias=ID)? ';'
		public Group getGroup() { return cGroup; }
		
		//'import'
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }
		
		//importedNamespace=QualifiedNameWithWildcard | importedNamespace=QualifiedName
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//importedNamespace=QualifiedNameWithWildcard
		public Assignment getImportedNamespaceAssignment_1_0() { return cImportedNamespaceAssignment_1_0; }
		
		//QualifiedNameWithWildcard
		public RuleCall getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0_0() { return cImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0_0; }
		
		//importedNamespace=QualifiedName
		public Assignment getImportedNamespaceAssignment_1_1() { return cImportedNamespaceAssignment_1_1; }
		
		//QualifiedName
		public RuleCall getImportedNamespaceQualifiedNameParserRuleCall_1_1_0() { return cImportedNamespaceQualifiedNameParserRuleCall_1_1_0; }
		
		//('as' alias=ID)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'as'
		public Keyword getAsKeyword_2_0() { return cAsKeyword_2_0; }
		
		//alias=ID
		public Assignment getAliasAssignment_2_1() { return cAliasAssignment_2_1; }
		
		//ID
		public RuleCall getAliasIDTerminalRuleCall_2_1_0() { return cAliasIDTerminalRuleCall_2_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class ClassifierAssignmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ClassifierAssignment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTargetAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTargetModelElementReferenceParserRuleCall_0_0 = (RuleCall)cTargetAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cAlternatives_2.eContents().get(0);
		private final Assignment cAssignedClassifiersAssignment_2_0_0 = (Assignment)cGroup_2_0.eContents().get(0);
		private final RuleCall cAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_2_0_0_0 = (RuleCall)cAssignedClassifiersAssignment_2_0_0.eContents().get(0);
		private final Group cGroup_2_0_1 = (Group)cGroup_2_0.eContents().get(1);
		private final Keyword cCommaKeyword_2_0_1_0 = (Keyword)cGroup_2_0_1.eContents().get(0);
		private final Assignment cAssignedClassifiersAssignment_2_0_1_1 = (Assignment)cGroup_2_0_1.eContents().get(1);
		private final RuleCall cAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_2_0_1_1_0 = (RuleCall)cAssignedClassifiersAssignment_2_0_1_1.eContents().get(0);
		private final RuleCall cCurlyConfigurationElementBlockParserRuleCall_2_0_2 = (RuleCall)cGroup_2_0.eContents().get(2);
		private final RuleCall cCurlyConfigurationElementBlockParserRuleCall_2_1 = (RuleCall)cAlternatives_2.eContents().get(1);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//ClassifierAssignment av3::ClassifierAssignment:
		//	target=ModelElementReference '=>' (assignedClassifiers+=ClassifierOrTypeReference (','
		//	assignedClassifiers+=ClassifierOrTypeReference)* CurlyConfigurationElementBlock? | CurlyConfigurationElementBlock)
		//	';';
		@Override public ParserRule getRule() { return rule; }
		
		//target=ModelElementReference '=>' (assignedClassifiers+=ClassifierOrTypeReference (','
		//assignedClassifiers+=ClassifierOrTypeReference)* CurlyConfigurationElementBlock? | CurlyConfigurationElementBlock) ';'
		public Group getGroup() { return cGroup; }
		
		//target=ModelElementReference
		public Assignment getTargetAssignment_0() { return cTargetAssignment_0; }
		
		//ModelElementReference
		public RuleCall getTargetModelElementReferenceParserRuleCall_0_0() { return cTargetModelElementReferenceParserRuleCall_0_0; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_1() { return cEqualsSignGreaterThanSignKeyword_1; }
		
		//assignedClassifiers+=ClassifierOrTypeReference (',' assignedClassifiers+=ClassifierOrTypeReference)*
		//CurlyConfigurationElementBlock? | CurlyConfigurationElementBlock
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//assignedClassifiers+=ClassifierOrTypeReference (',' assignedClassifiers+=ClassifierOrTypeReference)*
		//CurlyConfigurationElementBlock?
		public Group getGroup_2_0() { return cGroup_2_0; }
		
		//assignedClassifiers+=ClassifierOrTypeReference
		public Assignment getAssignedClassifiersAssignment_2_0_0() { return cAssignedClassifiersAssignment_2_0_0; }
		
		//ClassifierOrTypeReference
		public RuleCall getAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_2_0_0_0() { return cAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_2_0_0_0; }
		
		//(',' assignedClassifiers+=ClassifierOrTypeReference)*
		public Group getGroup_2_0_1() { return cGroup_2_0_1; }
		
		//','
		public Keyword getCommaKeyword_2_0_1_0() { return cCommaKeyword_2_0_1_0; }
		
		//assignedClassifiers+=ClassifierOrTypeReference
		public Assignment getAssignedClassifiersAssignment_2_0_1_1() { return cAssignedClassifiersAssignment_2_0_1_1; }
		
		//ClassifierOrTypeReference
		public RuleCall getAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_2_0_1_1_0() { return cAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_2_0_1_1_0; }
		
		//CurlyConfigurationElementBlock?
		public RuleCall getCurlyConfigurationElementBlockParserRuleCall_2_0_2() { return cCurlyConfigurationElementBlockParserRuleCall_2_0_2; }
		
		//CurlyConfigurationElementBlock
		public RuleCall getCurlyConfigurationElementBlockParserRuleCall_2_1() { return cCurlyConfigurationElementBlockParserRuleCall_2_1; }
		
		//';'
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class ClassifierAssignmentPatternElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ClassifierAssignmentPattern");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cQueryExpressionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cEqualsSignGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cAlternatives_2.eContents().get(0);
		private final Assignment cAssignedClassifiersAssignment_2_0_0 = (Assignment)cGroup_2_0.eContents().get(0);
		private final RuleCall cAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_2_0_0_0 = (RuleCall)cAssignedClassifiersAssignment_2_0_0.eContents().get(0);
		private final Group cGroup_2_0_1 = (Group)cGroup_2_0.eContents().get(1);
		private final Keyword cCommaKeyword_2_0_1_0 = (Keyword)cGroup_2_0_1.eContents().get(0);
		private final Assignment cAssignedClassifiersAssignment_2_0_1_1 = (Assignment)cGroup_2_0_1.eContents().get(1);
		private final RuleCall cAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_2_0_1_1_0 = (RuleCall)cAssignedClassifiersAssignment_2_0_1_1.eContents().get(0);
		private final RuleCall cCurlyConfigurationElementBlockParserRuleCall_2_0_2 = (RuleCall)cGroup_2_0.eContents().get(2);
		private final RuleCall cCurlyConfigurationElementBlockParserRuleCall_2_1 = (RuleCall)cAlternatives_2.eContents().get(1);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//ClassifierAssignmentPattern av3::ClassifierAssignmentPattern:
		//	QueryExpression '=>' (assignedClassifiers+=ClassifierOrTypeReference (','
		//	assignedClassifiers+=ClassifierOrTypeReference)* CurlyConfigurationElementBlock? | CurlyConfigurationElementBlock)
		//	';';
		@Override public ParserRule getRule() { return rule; }
		
		//QueryExpression '=>' (assignedClassifiers+=ClassifierOrTypeReference (','
		//assignedClassifiers+=ClassifierOrTypeReference)* CurlyConfigurationElementBlock? | CurlyConfigurationElementBlock) ';'
		public Group getGroup() { return cGroup; }
		
		//QueryExpression
		public RuleCall getQueryExpressionParserRuleCall_0() { return cQueryExpressionParserRuleCall_0; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_1() { return cEqualsSignGreaterThanSignKeyword_1; }
		
		//assignedClassifiers+=ClassifierOrTypeReference (',' assignedClassifiers+=ClassifierOrTypeReference)*
		//CurlyConfigurationElementBlock? | CurlyConfigurationElementBlock
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//assignedClassifiers+=ClassifierOrTypeReference (',' assignedClassifiers+=ClassifierOrTypeReference)*
		//CurlyConfigurationElementBlock?
		public Group getGroup_2_0() { return cGroup_2_0; }
		
		//assignedClassifiers+=ClassifierOrTypeReference
		public Assignment getAssignedClassifiersAssignment_2_0_0() { return cAssignedClassifiersAssignment_2_0_0; }
		
		//ClassifierOrTypeReference
		public RuleCall getAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_2_0_0_0() { return cAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_2_0_0_0; }
		
		//(',' assignedClassifiers+=ClassifierOrTypeReference)*
		public Group getGroup_2_0_1() { return cGroup_2_0_1; }
		
		//','
		public Keyword getCommaKeyword_2_0_1_0() { return cCommaKeyword_2_0_1_0; }
		
		//assignedClassifiers+=ClassifierOrTypeReference
		public Assignment getAssignedClassifiersAssignment_2_0_1_1() { return cAssignedClassifiersAssignment_2_0_1_1; }
		
		//ClassifierOrTypeReference
		public RuleCall getAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_2_0_1_1_0() { return cAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_2_0_1_1_0; }
		
		//CurlyConfigurationElementBlock?
		public RuleCall getCurlyConfigurationElementBlockParserRuleCall_2_0_2() { return cCurlyConfigurationElementBlockParserRuleCall_2_0_2; }
		
		//CurlyConfigurationElementBlock
		public RuleCall getCurlyConfigurationElementBlockParserRuleCall_2_1() { return cCurlyConfigurationElementBlockParserRuleCall_2_1; }
		
		//';'
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class QueryExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.QueryExpression");
		private final Group cGroup = (Group)rule.eContents().get(0);
		private final Keyword cAllKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTargetPatternAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cTargetPatternTypeCrossReference_2_0 = (CrossReference)cTargetPatternAssignment_2.eContents().get(0);
		private final RuleCall cTargetPatternTypeQualifiedTypesReferenceParserRuleCall_2_0_1 = (RuleCall)cTargetPatternTypeCrossReference_2_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//fragment QueryExpression *:
		//	'all' '(' targetPattern=[av3::Type|QualifiedTypesReference] ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'all' '(' targetPattern=[av3::Type|QualifiedTypesReference] ')'
		public Group getGroup() { return cGroup; }
		
		//'all'
		public Keyword getAllKeyword_0() { return cAllKeyword_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//targetPattern=[av3::Type|QualifiedTypesReference]
		public Assignment getTargetPatternAssignment_2() { return cTargetPatternAssignment_2; }
		
		//[av3::Type|QualifiedTypesReference]
		public CrossReference getTargetPatternTypeCrossReference_2_0() { return cTargetPatternTypeCrossReference_2_0; }
		
		//QualifiedTypesReference
		public RuleCall getTargetPatternTypeQualifiedTypesReferenceParserRuleCall_2_0_1() { return cTargetPatternTypeQualifiedTypesReferenceParserRuleCall_2_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
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
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//FlowAssignment av3::PathSequence:
		//	target=ModelElementReference '=>' 'flow' elements+=PathElement ('->' elements+=PathElement)* ';';
		@Override public ParserRule getRule() { return rule; }
		
		//target=ModelElementReference '=>' 'flow' elements+=PathElement ('->' elements+=PathElement)* ';'
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
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class ConfigurationElementBlockElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ConfigurationElementBlock");
		private final Group cGroup = (Group)rule.eContents().get(0);
		private final Keyword cIsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cConfigurationElementParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cEndKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//fragment ConfigurationElementBlock *:
		//	'is' ConfigurationElement* 'end';
		@Override public ParserRule getRule() { return rule; }
		
		//'is' ConfigurationElement* 'end'
		public Group getGroup() { return cGroup; }
		
		//'is'
		public Keyword getIsKeyword_0() { return cIsKeyword_0; }
		
		//ConfigurationElement*
		public RuleCall getConfigurationElementParserRuleCall_1() { return cConfigurationElementParserRuleCall_1; }
		
		//'end'
		public Keyword getEndKeyword_2() { return cEndKeyword_2; }
	}
	public class CurlyConfigurationElementBlockElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.CurlyConfigurationElementBlock");
		private final Group cGroup = (Group)rule.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cConfigurationElementParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//fragment CurlyConfigurationElementBlock *:
		//	'{' ConfigurationElement+ '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'{' ConfigurationElement+ '}'
		public Group getGroup() { return cGroup; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }
		
		//ConfigurationElement+
		public RuleCall getConfigurationElementParserRuleCall_1() { return cConfigurationElementParserRuleCall_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_2() { return cRightCurlyBracketKeyword_2; }
	}
	public class ConfigurationElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ConfigurationElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(0);
		private final Assignment cOwnedPropertyAssociationsAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cOwnedPropertyAssociationsPropertyAssociationParserRuleCall_0_0 = (RuleCall)cOwnedPropertyAssociationsAssignment_0.eContents().get(0);
		private final Assignment cBindingsAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cBindingsBindingParserRuleCall_1_0 = (RuleCall)cBindingsAssignment_1.eContents().get(0);
		private final Assignment cClassifierAssignmentsAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final RuleCall cClassifierAssignmentsClassifierAssignmentParserRuleCall_2_0 = (RuleCall)cClassifierAssignmentsAssignment_2.eContents().get(0);
		private final Assignment cClassifierAssignmentsAssignment_3 = (Assignment)cAlternatives.eContents().get(3);
		private final RuleCall cClassifierAssignmentsClassifierAssignmentPatternParserRuleCall_3_0 = (RuleCall)cClassifierAssignmentsAssignment_3.eContents().get(0);
		private final Assignment cAnnexSubclauseAssignment_4 = (Assignment)cAlternatives.eContents().get(4);
		private final RuleCall cAnnexSubclauseAnnexSubclauseParserRuleCall_4_0 = (RuleCall)cAnnexSubclauseAssignment_4.eContents().get(0);
		
		//fragment ConfigurationElement *:
		//	ownedPropertyAssociations+=PropertyAssociation | bindings+=Binding | classifierAssignments+=ClassifierAssignment |
		//	classifierAssignments+=ClassifierAssignmentPattern | annexSubclause+=AnnexSubclause;
		@Override public ParserRule getRule() { return rule; }
		
		//ownedPropertyAssociations+=PropertyAssociation | bindings+=Binding | classifierAssignments+=ClassifierAssignment |
		//classifierAssignments+=ClassifierAssignmentPattern | annexSubclause+=AnnexSubclause
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ownedPropertyAssociations+=PropertyAssociation
		public Assignment getOwnedPropertyAssociationsAssignment_0() { return cOwnedPropertyAssociationsAssignment_0; }
		
		//PropertyAssociation
		public RuleCall getOwnedPropertyAssociationsPropertyAssociationParserRuleCall_0_0() { return cOwnedPropertyAssociationsPropertyAssociationParserRuleCall_0_0; }
		
		//bindings+=Binding
		public Assignment getBindingsAssignment_1() { return cBindingsAssignment_1; }
		
		//Binding
		public RuleCall getBindingsBindingParserRuleCall_1_0() { return cBindingsBindingParserRuleCall_1_0; }
		
		//classifierAssignments+=ClassifierAssignment
		public Assignment getClassifierAssignmentsAssignment_2() { return cClassifierAssignmentsAssignment_2; }
		
		//ClassifierAssignment
		public RuleCall getClassifierAssignmentsClassifierAssignmentParserRuleCall_2_0() { return cClassifierAssignmentsClassifierAssignmentParserRuleCall_2_0; }
		
		//classifierAssignments+=ClassifierAssignmentPattern
		public Assignment getClassifierAssignmentsAssignment_3() { return cClassifierAssignmentsAssignment_3; }
		
		//ClassifierAssignmentPattern
		public RuleCall getClassifierAssignmentsClassifierAssignmentPatternParserRuleCall_3_0() { return cClassifierAssignmentsClassifierAssignmentPatternParserRuleCall_3_0; }
		
		//annexSubclause+=AnnexSubclause
		public Assignment getAnnexSubclauseAssignment_4() { return cAnnexSubclauseAssignment_4; }
		
		//AnnexSubclause
		public RuleCall getAnnexSubclauseAnnexSubclauseParserRuleCall_4_0() { return cAnnexSubclauseAnnexSubclauseParserRuleCall_4_0; }
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
		// ReversableInterfaceReference
		//av3::TypeReference:
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
	public class ReversableTypeReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ReversableTypeReference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cReverseAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cReverseReverseKeyword_0_0 = (Keyword)cReverseAssignment_0.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cTypeNamedTypeCrossReference_1_0 = (CrossReference)cTypeAssignment_1.eContents().get(0);
		private final RuleCall cTypeNamedTypeQualifiedReferenceParserRuleCall_1_0_1 = (RuleCall)cTypeNamedTypeCrossReference_1_0.eContents().get(1);
		
		//ReversableTypeReference av3::TypeReference:
		//	reverse?='reverse'? type=[av3::NamedType|QualifiedReference];
		@Override public ParserRule getRule() { return rule; }
		
		//reverse?='reverse'? type=[av3::NamedType|QualifiedReference]
		public Group getGroup() { return cGroup; }
		
		//reverse?='reverse'?
		public Assignment getReverseAssignment_0() { return cReverseAssignment_0; }
		
		//'reverse'
		public Keyword getReverseReverseKeyword_0_0() { return cReverseReverseKeyword_0_0; }
		
		//type=[av3::NamedType|QualifiedReference]
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }
		
		//[av3::NamedType|QualifiedReference]
		public CrossReference getTypeNamedTypeCrossReference_1_0() { return cTypeNamedTypeCrossReference_1_0; }
		
		//QualifiedReference
		public RuleCall getTypeNamedTypeQualifiedReferenceParserRuleCall_1_0_1() { return cTypeNamedTypeQualifiedReferenceParserRuleCall_1_0_1; }
	}
	public class ClassifierOrTypeReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ClassifierOrTypeReference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cTypeNamedTypeCrossReference_0_0 = (CrossReference)cTypeAssignment_0.eContents().get(0);
		private final RuleCall cTypeNamedTypeQualifiedTypesReferenceParserRuleCall_0_0_1 = (RuleCall)cTypeNamedTypeCrossReference_0_0.eContents().get(1);
		private final RuleCall cConfigurationActualsParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//ClassifierOrTypeReference av3::TypeReference:
		//	type=[av3::NamedType|QualifiedTypesReference] ConfigurationActuals?;
		@Override public ParserRule getRule() { return rule; }
		
		//type=[av3::NamedType|QualifiedTypesReference] ConfigurationActuals?
		public Group getGroup() { return cGroup; }
		
		//type=[av3::NamedType|QualifiedTypesReference]
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }
		
		//[av3::NamedType|QualifiedTypesReference]
		public CrossReference getTypeNamedTypeCrossReference_0_0() { return cTypeNamedTypeCrossReference_0_0; }
		
		//QualifiedTypesReference
		public RuleCall getTypeNamedTypeQualifiedTypesReferenceParserRuleCall_0_0_1() { return cTypeNamedTypeQualifiedTypesReferenceParserRuleCall_0_0_1; }
		
		//ConfigurationActuals?
		public RuleCall getConfigurationActualsParserRuleCall_1() { return cConfigurationActualsParserRuleCall_1; }
	}
	public class TypeReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.TypeReference");
		private final Assignment cTypeAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cTypeNamedTypeCrossReference_0 = (CrossReference)cTypeAssignment.eContents().get(0);
		private final RuleCall cTypeNamedTypeQualifiedNameParserRuleCall_0_1 = (RuleCall)cTypeNamedTypeCrossReference_0.eContents().get(1);
		
		//TypeReference av3::TypeReference:
		//	type=[av3::NamedType|QualifiedName];
		@Override public ParserRule getRule() { return rule; }
		
		//type=[av3::NamedType|QualifiedName]
		public Assignment getTypeAssignment() { return cTypeAssignment; }
		
		//[av3::NamedType|QualifiedName]
		public CrossReference getTypeNamedTypeCrossReference_0() { return cTypeNamedTypeCrossReference_0; }
		
		//QualifiedName
		public RuleCall getTypeNamedTypeQualifiedNameParserRuleCall_0_1() { return cTypeNamedTypeQualifiedNameParserRuleCall_0_1; }
	}
	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cTypeReferenceParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cCompositeTypeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cPrimitiveTypeParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cEnumerationTypeParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//Type av3::Type:
		//	TypeReference | CompositeType | PrimitiveType | EnumerationType;
		@Override public ParserRule getRule() { return rule; }
		
		//TypeReference | CompositeType | PrimitiveType | EnumerationType
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//TypeReference
		public RuleCall getTypeReferenceParserRuleCall_0() { return cTypeReferenceParserRuleCall_0; }
		
		//CompositeType
		public RuleCall getCompositeTypeParserRuleCall_1() { return cCompositeTypeParserRuleCall_1; }
		
		//PrimitiveType
		public RuleCall getPrimitiveTypeParserRuleCall_2() { return cPrimitiveTypeParserRuleCall_2; }
		
		//EnumerationType
		public RuleCall getEnumerationTypeParserRuleCall_3() { return cEnumerationTypeParserRuleCall_3; }
	}
	public class EnumerationTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.EnumerationType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEnumerationTypeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cEnumKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cLiteralsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cLiteralsEnumerationLiteralParserRuleCall_3_0 = (RuleCall)cLiteralsAssignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//EnumerationType av3::EnumerationType:
		//	{av3::EnumerationType} 'enum' '(' literals+=EnumerationLiteral* ')';
		@Override public ParserRule getRule() { return rule; }
		
		//{av3::EnumerationType} 'enum' '(' literals+=EnumerationLiteral* ')'
		public Group getGroup() { return cGroup; }
		
		//{av3::EnumerationType}
		public Action getEnumerationTypeAction_0() { return cEnumerationTypeAction_0; }
		
		//'enum'
		public Keyword getEnumKeyword_1() { return cEnumKeyword_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//literals+=EnumerationLiteral*
		public Assignment getLiteralsAssignment_3() { return cLiteralsAssignment_3; }
		
		//EnumerationLiteral
		public RuleCall getLiteralsEnumerationLiteralParserRuleCall_3_0() { return cLiteralsEnumerationLiteralParserRuleCall_3_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}
	public class CompositeTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.CompositeType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCompositeTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cCompositeTypeCompositeParserRuleCall_0_0 = (RuleCall)cCompositeTypeAssignment_0.eContents().get(0);
		private final Keyword cOfKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeTypeReferenceParserRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		
		//CompositeType av3::CompositeType:
		//	compositeType=Composite 'of' type=TypeReference;
		@Override public ParserRule getRule() { return rule; }
		
		//compositeType=Composite 'of' type=TypeReference
		public Group getGroup() { return cGroup; }
		
		//compositeType=Composite
		public Assignment getCompositeTypeAssignment_0() { return cCompositeTypeAssignment_0; }
		
		//Composite
		public RuleCall getCompositeTypeCompositeParserRuleCall_0_0() { return cCompositeTypeCompositeParserRuleCall_0_0; }
		
		//'of'
		public Keyword getOfKeyword_1() { return cOfKeyword_1; }
		
		//type=TypeReference
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }
		
		//TypeReference
		public RuleCall getTypeTypeReferenceParserRuleCall_2_0() { return cTypeTypeReferenceParserRuleCall_2_0; }
	}
	public class PrimitiveTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.PrimitiveType");
		private final Assignment cPrimitiveTypeAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cPrimitiveTypePrimitiveParserRuleCall_0 = (RuleCall)cPrimitiveTypeAssignment.eContents().get(0);
		
		//PrimitiveType av3::PrimitiveType:
		//	primitiveType=Primitive;
		@Override public ParserRule getRule() { return rule; }
		
		//primitiveType=Primitive
		public Assignment getPrimitiveTypeAssignment() { return cPrimitiveTypeAssignment; }
		
		//Primitive
		public RuleCall getPrimitiveTypePrimitiveParserRuleCall_0() { return cPrimitiveTypePrimitiveParserRuleCall_0; }
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
	public class AnnexSubclauseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.AnnexSubclause");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cEMSubclauseParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cBASubclauseParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cDefaultAnnexSubclauseParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//AnnexSubclause av3::AnnexSubclause:
		//	EMSubclause | BASubclause | DefaultAnnexSubclause;
		@Override public ParserRule getRule() { return rule; }
		
		//EMSubclause | BASubclause | DefaultAnnexSubclause
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//EMSubclause
		public RuleCall getEMSubclauseParserRuleCall_0() { return cEMSubclauseParserRuleCall_0; }
		
		//BASubclause
		public RuleCall getBASubclauseParserRuleCall_1() { return cBASubclauseParserRuleCall_1; }
		
		//DefaultAnnexSubclause
		public RuleCall getDefaultAnnexSubclauseParserRuleCall_2() { return cDefaultAnnexSubclauseParserRuleCall_2; }
	}
	public class DefaultAnnexSubclauseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.DefaultAnnexSubclause");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCommercialAtKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cBodyAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cBodyANNEXTEXTTerminalRuleCall_2_0 = (RuleCall)cBodyAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//DefaultAnnexSubclause av3::DefaultAnnexSubclause:
		//	'@' name=ID body=ANNEXTEXT ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'@' name=ID body=ANNEXTEXT ';'
		public Group getGroup() { return cGroup; }
		
		//'@'
		public Keyword getCommercialAtKeyword_0() { return cCommercialAtKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//body=ANNEXTEXT
		public Assignment getBodyAssignment_2() { return cBodyAssignment_2; }
		
		//ANNEXTEXT
		public RuleCall getBodyANNEXTEXTTerminalRuleCall_2_0() { return cBodyANNEXTEXTTerminalRuleCall_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class PropertiesBlockElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.PropertiesBlock");
		private final Group cGroup = (Group)rule.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cOwnedPropertyAssociationsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cOwnedPropertyAssociationsPropertyAssociationParserRuleCall_1_0 = (RuleCall)cOwnedPropertyAssociationsAssignment_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//fragment PropertiesBlock *:
		//	'{' ownedPropertyAssociations+=PropertyAssociation+ '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'{' ownedPropertyAssociations+=PropertyAssociation+ '}'
		public Group getGroup() { return cGroup; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }
		
		//ownedPropertyAssociations+=PropertyAssociation+
		public Assignment getOwnedPropertyAssociationsAssignment_1() { return cOwnedPropertyAssociationsAssignment_1; }
		
		//PropertyAssociation
		public RuleCall getOwnedPropertyAssociationsPropertyAssociationParserRuleCall_1_0() { return cOwnedPropertyAssociationsPropertyAssociationParserRuleCall_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_2() { return cRightCurlyBracketKeyword_2; }
	}
	public class NestedComponentImplementationBlockElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.NestedComponentImplementationBlock");
		private final Group cGroup = (Group)rule.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cNestedImplementationElementParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//// to be used for inline nested component implementations 
		// fragment NestedComponentImplementationBlock *:
		//	'{' NestedImplementationElement+ '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'{' NestedImplementationElement+ '}'
		public Group getGroup() { return cGroup; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }
		
		//NestedImplementationElement+
		public RuleCall getNestedImplementationElementParserRuleCall_1() { return cNestedImplementationElementParserRuleCall_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_2() { return cRightCurlyBracketKeyword_2; }
	}
	public class NestedImplementationElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.NestedImplementationElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(0);
		private final Assignment cFeaturesAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cFeaturesFeatureParserRuleCall_0_0 = (RuleCall)cFeaturesAssignment_0.eContents().get(0);
		private final Assignment cConnectionsAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cConnectionsConnectionParserRuleCall_1_0 = (RuleCall)cConnectionsAssignment_1.eContents().get(0);
		private final Assignment cBindingsAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final RuleCall cBindingsBindingParserRuleCall_2_0 = (RuleCall)cBindingsAssignment_2.eContents().get(0);
		private final Assignment cComponentsAssignment_3 = (Assignment)cAlternatives.eContents().get(3);
		private final RuleCall cComponentsSubcomponentParserRuleCall_3_0 = (RuleCall)cComponentsAssignment_3.eContents().get(0);
		private final Assignment cOwnedPropertyAssociationsAssignment_4 = (Assignment)cAlternatives.eContents().get(4);
		private final RuleCall cOwnedPropertyAssociationsPropertyAssociationParserRuleCall_4_0 = (RuleCall)cOwnedPropertyAssociationsAssignment_4.eContents().get(0);
		
		//fragment NestedImplementationElement *:
		//	features+=Feature | connections+=Connection | bindings+=Binding | components+=Subcomponent |
		//	ownedPropertyAssociations+=PropertyAssociation;
		@Override public ParserRule getRule() { return rule; }
		
		//features+=Feature | connections+=Connection | bindings+=Binding | components+=Subcomponent |
		//ownedPropertyAssociations+=PropertyAssociation
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//features+=Feature
		public Assignment getFeaturesAssignment_0() { return cFeaturesAssignment_0; }
		
		//Feature
		public RuleCall getFeaturesFeatureParserRuleCall_0_0() { return cFeaturesFeatureParserRuleCall_0_0; }
		
		//connections+=Connection
		public Assignment getConnectionsAssignment_1() { return cConnectionsAssignment_1; }
		
		//Connection
		public RuleCall getConnectionsConnectionParserRuleCall_1_0() { return cConnectionsConnectionParserRuleCall_1_0; }
		
		//bindings+=Binding
		public Assignment getBindingsAssignment_2() { return cBindingsAssignment_2; }
		
		//Binding
		public RuleCall getBindingsBindingParserRuleCall_2_0() { return cBindingsBindingParserRuleCall_2_0; }
		
		//components+=Subcomponent
		public Assignment getComponentsAssignment_3() { return cComponentsAssignment_3; }
		
		//Subcomponent
		public RuleCall getComponentsSubcomponentParserRuleCall_3_0() { return cComponentsSubcomponentParserRuleCall_3_0; }
		
		//ownedPropertyAssociations+=PropertyAssociation
		public Assignment getOwnedPropertyAssociationsAssignment_4() { return cOwnedPropertyAssociationsAssignment_4; }
		
		//PropertyAssociation
		public RuleCall getOwnedPropertyAssociationsPropertyAssociationParserRuleCall_4_0() { return cOwnedPropertyAssociationsPropertyAssociationParserRuleCall_4_0; }
	}
	public class ConfigurationExtensionsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ConfigurationExtensions");
		private final Group cGroup = (Group)rule.eContents().get(0);
		private final Assignment cSuperClassifiersAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cSuperClassifiersClassifierOrTypeReferenceParserRuleCall_0_0 = (RuleCall)cSuperClassifiersAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCommaKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cSuperClassifiersAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cSuperClassifiersClassifierOrTypeReferenceParserRuleCall_1_1_0 = (RuleCall)cSuperClassifiersAssignment_1_1.eContents().get(0);
		
		//fragment ConfigurationExtensions *:
		//	superClassifiers+=ClassifierOrTypeReference ("," superClassifiers+=ClassifierOrTypeReference)*;
		@Override public ParserRule getRule() { return rule; }
		
		//superClassifiers+=ClassifierOrTypeReference ("," superClassifiers+=ClassifierOrTypeReference)*
		public Group getGroup() { return cGroup; }
		
		//superClassifiers+=ClassifierOrTypeReference
		public Assignment getSuperClassifiersAssignment_0() { return cSuperClassifiersAssignment_0; }
		
		//ClassifierOrTypeReference
		public RuleCall getSuperClassifiersClassifierOrTypeReferenceParserRuleCall_0_0() { return cSuperClassifiersClassifierOrTypeReferenceParserRuleCall_0_0; }
		
		//("," superClassifiers+=ClassifierOrTypeReference)*
		public Group getGroup_1() { return cGroup_1; }
		
		//","
		public Keyword getCommaKeyword_1_0() { return cCommaKeyword_1_0; }
		
		//superClassifiers+=ClassifierOrTypeReference
		public Assignment getSuperClassifiersAssignment_1_1() { return cSuperClassifiersAssignment_1_1; }
		
		//ClassifierOrTypeReference
		public RuleCall getSuperClassifiersClassifierOrTypeReferenceParserRuleCall_1_1_0() { return cSuperClassifiersClassifierOrTypeReferenceParserRuleCall_1_1_0; }
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
		private final RuleCall cAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_2_0 = (RuleCall)cAssignedClassifiersAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCommaKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cAssignedClassifiersAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_3_1_0 = (RuleCall)cAssignedClassifiersAssignment_3_1.eContents().get(0);
		
		//ConfigurationActual av3::ConfigurationActual:
		//	parameter=[av3::ConfigurationParameter] '=>' assignedClassifiers+=ClassifierOrTypeReference (','
		//	assignedClassifiers+=ClassifierOrTypeReference)*;
		@Override public ParserRule getRule() { return rule; }
		
		//parameter=[av3::ConfigurationParameter] '=>' assignedClassifiers+=ClassifierOrTypeReference (','
		//assignedClassifiers+=ClassifierOrTypeReference)*
		public Group getGroup() { return cGroup; }
		
		//parameter=[av3::ConfigurationParameter]
		public Assignment getParameterAssignment_0() { return cParameterAssignment_0; }
		
		//[av3::ConfigurationParameter]
		public CrossReference getParameterConfigurationParameterCrossReference_0_0() { return cParameterConfigurationParameterCrossReference_0_0; }
		
		//ID
		public RuleCall getParameterConfigurationParameterIDTerminalRuleCall_0_0_1() { return cParameterConfigurationParameterIDTerminalRuleCall_0_0_1; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_1() { return cEqualsSignGreaterThanSignKeyword_1; }
		
		//assignedClassifiers+=ClassifierOrTypeReference
		public Assignment getAssignedClassifiersAssignment_2() { return cAssignedClassifiersAssignment_2; }
		
		//ClassifierOrTypeReference
		public RuleCall getAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_2_0() { return cAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_2_0; }
		
		//(',' assignedClassifiers+=ClassifierOrTypeReference)*
		public Group getGroup_3() { return cGroup_3; }
		
		//','
		public Keyword getCommaKeyword_3_0() { return cCommaKeyword_3_0; }
		
		//assignedClassifiers+=ClassifierOrTypeReference
		public Assignment getAssignedClassifiersAssignment_3_1() { return cAssignedClassifiersAssignment_3_1; }
		
		//ClassifierOrTypeReference
		public RuleCall getAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_3_1_0() { return cAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_3_1_0; }
	}
	public class WorkingsetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.Workingset");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPrivateAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cPrivatePrivateKeyword_0_0 = (Keyword)cPrivateAssignment_0.eContents().get(0);
		private final Keyword cWorkingsetKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameQualifiedNameParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cIsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final RuleCall cUsePropsParserRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		private final Assignment cInstanceRootsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cInstanceRootsInstanceConfigurationParserRuleCall_5_0 = (RuleCall)cInstanceRootsAssignment_5.eContents().get(0);
		private final Keyword cEndKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Workingset av3::Workingset:
		//	private?='private'? 'workingset' name=QualifiedName 'is' UseProps? instanceRoots+=InstanceConfiguration* 'end' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//private?='private'? 'workingset' name=QualifiedName 'is' UseProps? instanceRoots+=InstanceConfiguration* 'end' ';'
		public Group getGroup() { return cGroup; }
		
		//private?='private'?
		public Assignment getPrivateAssignment_0() { return cPrivateAssignment_0; }
		
		//'private'
		public Keyword getPrivatePrivateKeyword_0_0() { return cPrivatePrivateKeyword_0_0; }
		
		//'workingset'
		public Keyword getWorkingsetKeyword_1() { return cWorkingsetKeyword_1; }
		
		//name=QualifiedName
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_2_0() { return cNameQualifiedNameParserRuleCall_2_0; }
		
		//'is'
		public Keyword getIsKeyword_3() { return cIsKeyword_3; }
		
		//UseProps?
		public RuleCall getUsePropsParserRuleCall_4() { return cUsePropsParserRuleCall_4; }
		
		//instanceRoots+=InstanceConfiguration*
		public Assignment getInstanceRootsAssignment_5() { return cInstanceRootsAssignment_5; }
		
		//InstanceConfiguration
		public RuleCall getInstanceRootsInstanceConfigurationParserRuleCall_5_0() { return cInstanceRootsInstanceConfigurationParserRuleCall_5_0; }
		
		//'end'
		public Keyword getEndKeyword_6() { return cEndKeyword_6; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}
	public class InstanceConfigurationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.InstanceConfiguration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cInstanceConfigurationAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cCategoryAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cCategoryComponentCategoryParserRuleCall_3_0 = (RuleCall)cCategoryAssignment_3.eContents().get(0);
		private final Assignment cTypeReferencesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTypeReferencesClassifierOrTypeReferenceParserRuleCall_4_0 = (RuleCall)cTypeReferencesAssignment_4.eContents().get(0);
		private final Assignment cProductlineConstraintAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cProductlineConstraintProductLineConstraintParserRuleCall_5_0 = (RuleCall)cProductlineConstraintAssignment_5.eContents().get(0);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//InstanceConfiguration av3::InstanceConfiguration:
		//	{av3::InstanceConfiguration} name=ID ':' category=ComponentCategory typeReferences+=ClassifierOrTypeReference
		//	productlineConstraint=ProductLineConstraint? ';';
		@Override public ParserRule getRule() { return rule; }
		
		//{av3::InstanceConfiguration} name=ID ':' category=ComponentCategory typeReferences+=ClassifierOrTypeReference
		//productlineConstraint=ProductLineConstraint? ';'
		public Group getGroup() { return cGroup; }
		
		//{av3::InstanceConfiguration}
		public Action getInstanceConfigurationAction_0() { return cInstanceConfigurationAction_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//category=ComponentCategory
		public Assignment getCategoryAssignment_3() { return cCategoryAssignment_3; }
		
		//ComponentCategory
		public RuleCall getCategoryComponentCategoryParserRuleCall_3_0() { return cCategoryComponentCategoryParserRuleCall_3_0; }
		
		//typeReferences+=ClassifierOrTypeReference
		public Assignment getTypeReferencesAssignment_4() { return cTypeReferencesAssignment_4; }
		
		//ClassifierOrTypeReference
		public RuleCall getTypeReferencesClassifierOrTypeReferenceParserRuleCall_4_0() { return cTypeReferencesClassifierOrTypeReferenceParserRuleCall_4_0; }
		
		//productlineConstraint=ProductLineConstraint?
		public Assignment getProductlineConstraintAssignment_5() { return cProductlineConstraintAssignment_5; }
		
		//ProductLineConstraint
		public RuleCall getProductlineConstraintProductLineConstraintParserRuleCall_5_0() { return cProductlineConstraintProductLineConstraintParserRuleCall_5_0; }
		
		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}
	public class ProductLineConstraintElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ProductLineConstraint");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cConditionOperationAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cElementAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cElementPropertyReferenceParserRuleCall_1_0 = (RuleCall)cElementAssignment_1.eContents().get(0);
		private final Assignment cOperatorAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cOperatorSatisfiesOperationParserRuleCall_2_0 = (RuleCall)cOperatorAssignment_2.eContents().get(0);
		private final Assignment cConstraintAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cConstraintListLiteralParserRuleCall_3_0 = (RuleCall)cConstraintAssignment_3.eContents().get(0);
		
		//ProductLineConstraint av3::ConditionOperation:
		//	{av3::ConditionOperation} element=PropertyReference operator=SatisfiesOperation constraint=ListLiteral;
		@Override public ParserRule getRule() { return rule; }
		
		//{av3::ConditionOperation} element=PropertyReference operator=SatisfiesOperation constraint=ListLiteral
		public Group getGroup() { return cGroup; }
		
		//{av3::ConditionOperation}
		public Action getConditionOperationAction_0() { return cConditionOperationAction_0; }
		
		//element=PropertyReference
		public Assignment getElementAssignment_1() { return cElementAssignment_1; }
		
		//PropertyReference
		public RuleCall getElementPropertyReferenceParserRuleCall_1_0() { return cElementPropertyReferenceParserRuleCall_1_0; }
		
		//operator=SatisfiesOperation
		public Assignment getOperatorAssignment_2() { return cOperatorAssignment_2; }
		
		//SatisfiesOperation
		public RuleCall getOperatorSatisfiesOperationParserRuleCall_2_0() { return cOperatorSatisfiesOperationParserRuleCall_2_0; }
		
		//constraint=ListLiteral
		public Assignment getConstraintAssignment_3() { return cConstraintAssignment_3; }
		
		//ListLiteral
		public RuleCall getConstraintListLiteralParserRuleCall_3_0() { return cConstraintListLiteralParserRuleCall_3_0; }
	}
	public class EMSubclauseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.EMSubclause");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCommercialAtKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cNameEMKeyword_1_0 = (Keyword)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final RuleCall cBehaviorSpecificationBlockParserRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//// Behavior specification including error behavior
		// EMSubclause av3::EMSubclause:
		//	'@' name='EM' '{' BehaviorSpecificationBlock '}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'@' name='EM' '{' BehaviorSpecificationBlock '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'@'
		public Keyword getCommercialAtKeyword_0() { return cCommercialAtKeyword_0; }
		
		//name='EM'
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//'EM'
		public Keyword getNameEMKeyword_1_0() { return cNameEMKeyword_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//BehaviorSpecificationBlock
		public RuleCall getBehaviorSpecificationBlockParserRuleCall_3() { return cBehaviorSpecificationBlockParserRuleCall_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class BASubclauseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.BASubclause");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCommercialAtKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cNameBAKeyword_1_0 = (Keyword)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final RuleCall cBehaviorSpecificationBlockParserRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//BASubclause av3::BASubclause:
		//	'@' name='BA' '{' BehaviorSpecificationBlock '}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'@' name='BA' '{' BehaviorSpecificationBlock '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'@'
		public Keyword getCommercialAtKeyword_0() { return cCommercialAtKeyword_0; }
		
		//name='BA'
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//'BA'
		public Keyword getNameBAKeyword_1_0() { return cNameBAKeyword_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//BehaviorSpecificationBlock
		public RuleCall getBehaviorSpecificationBlockParserRuleCall_3() { return cBehaviorSpecificationBlockParserRuleCall_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class BehaviorSpecificationBlockElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.BehaviorSpecificationBlock");
		private final Group cGroup = (Group)rule.eContents().get(0);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Keyword cUseKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Keyword cStatesKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cStatesAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final CrossReference cStatesTypeDefCrossReference_0_2_0 = (CrossReference)cStatesAssignment_0_2.eContents().get(0);
		private final RuleCall cStatesTypeDefQualifiedNameParserRuleCall_0_2_0_1 = (RuleCall)cStatesTypeDefCrossReference_0_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_0_3 = (Keyword)cGroup_0.eContents().get(3);
		private final RuleCall cBehaviorSpecificationElementParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//fragment BehaviorSpecificationBlock *:
		//	('use' 'states' states=[av3::TypeDef|QualifiedName] ';')? BehaviorSpecificationElement*;
		@Override public ParserRule getRule() { return rule; }
		
		//('use' 'states' states=[av3::TypeDef|QualifiedName] ';')? BehaviorSpecificationElement*
		public Group getGroup() { return cGroup; }
		
		//('use' 'states' states=[av3::TypeDef|QualifiedName] ';')?
		public Group getGroup_0() { return cGroup_0; }
		
		//'use'
		public Keyword getUseKeyword_0_0() { return cUseKeyword_0_0; }
		
		//'states'
		public Keyword getStatesKeyword_0_1() { return cStatesKeyword_0_1; }
		
		//states=[av3::TypeDef|QualifiedName]
		public Assignment getStatesAssignment_0_2() { return cStatesAssignment_0_2; }
		
		//[av3::TypeDef|QualifiedName]
		public CrossReference getStatesTypeDefCrossReference_0_2_0() { return cStatesTypeDefCrossReference_0_2_0; }
		
		//QualifiedName
		public RuleCall getStatesTypeDefQualifiedNameParserRuleCall_0_2_0_1() { return cStatesTypeDefQualifiedNameParserRuleCall_0_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_0_3() { return cSemicolonKeyword_0_3; }
		
		//BehaviorSpecificationElement*
		public RuleCall getBehaviorSpecificationElementParserRuleCall_1() { return cBehaviorSpecificationElementParserRuleCall_1; }
	}
	public class BehaviorSpecificationElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.BehaviorSpecificationElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(0);
		private final Assignment cGeneratorsAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cGeneratorsEventParserRuleCall_0_0 = (RuleCall)cGeneratorsAssignment_0.eContents().get(0);
		private final Assignment cRulesAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cRulesBehaviorRuleParserRuleCall_1_0 = (RuleCall)cRulesAssignment_1.eContents().get(0);
		
		//fragment BehaviorSpecificationElement *:
		//	generators+=Event | rules+=BehaviorRule;
		@Override public ParserRule getRule() { return rule; }
		
		//generators+=Event | rules+=BehaviorRule
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//generators+=Event
		public Assignment getGeneratorsAssignment_0() { return cGeneratorsAssignment_0; }
		
		//Event
		public RuleCall getGeneratorsEventParserRuleCall_0_0() { return cGeneratorsEventParserRuleCall_0_0; }
		
		//rules+=BehaviorRule
		public Assignment getRulesAssignment_1() { return cRulesAssignment_1; }
		
		//BehaviorRule
		public RuleCall getRulesBehaviorRuleParserRuleCall_1_0() { return cRulesBehaviorRuleParserRuleCall_1_0; }
	}
	public class EventElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.Event");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Alternatives cTypeAlternatives_2_0 = (Alternatives)cTypeAssignment_2.eContents().get(0);
		private final Keyword cTypeErrorKeyword_2_0_0 = (Keyword)cTypeAlternatives_2_0.eContents().get(0);
		private final Keyword cTypeRecoverKeyword_2_0_1 = (Keyword)cTypeAlternatives_2_0.eContents().get(1);
		private final Keyword cTypeRepairKeyword_2_0_2 = (Keyword)cTypeAlternatives_2_0.eContents().get(2);
		private final Keyword cEventKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cValueLiteralParserRuleCall_4_0 = (RuleCall)cValueAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Event av3::Generator:
		//	name=ID ':' type=('error' | 'recover' | 'repair') 'event' value=Literal? ';';
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' type=('error' | 'recover' | 'repair') 'event' value=Literal? ';'
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//type=('error' | 'recover' | 'repair')
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }
		
		//('error' | 'recover' | 'repair')
		public Alternatives getTypeAlternatives_2_0() { return cTypeAlternatives_2_0; }
		
		//'error'
		public Keyword getTypeErrorKeyword_2_0_0() { return cTypeErrorKeyword_2_0_0; }
		
		//'recover'
		public Keyword getTypeRecoverKeyword_2_0_1() { return cTypeRecoverKeyword_2_0_1; }
		
		//'repair'
		public Keyword getTypeRepairKeyword_2_0_2() { return cTypeRepairKeyword_2_0_2; }
		
		//'event'
		public Keyword getEventKeyword_3() { return cEventKeyword_3; }
		
		//value=Literal?
		public Assignment getValueAssignment_4() { return cValueAssignment_4; }
		
		//Literal
		public RuleCall getValueLiteralParserRuleCall_4_0() { return cValueLiteralParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class BehaviorRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.BehaviorRule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final RuleCall cStateTransitionRuleParserRuleCall_2_0 = (RuleCall)cAlternatives_2.eContents().get(0);
		private final RuleCall cStatelessRuleParserRuleCall_2_1 = (RuleCall)cAlternatives_2.eContents().get(1);
		
		//BehaviorRule av3::BehaviorRule:
		//	name=ID ':' (StateTransitionRule | StatelessRule);
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' (StateTransitionRule | StatelessRule)
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//StateTransitionRule | StatelessRule
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//StateTransitionRule
		public RuleCall getStateTransitionRuleParserRuleCall_2_0() { return cStateTransitionRuleParserRuleCall_2_0; }
		
		//StatelessRule
		public RuleCall getStatelessRuleParserRuleCall_2_1() { return cStatelessRuleParserRuleCall_2_1; }
	}
	public class AssignmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.Assignment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTargetAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTargetModelElementReferenceParserRuleCall_0_0 = (RuleCall)cTargetAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cValueAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cValueTypeReferenceParserRuleCall_1_1_0 = (RuleCall)cValueAssignment_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		
		//Assignment av3::Assignment:
		//	target=ModelElementReference ('(' value=TypeReference ')')?;
		@Override public ParserRule getRule() { return rule; }
		
		//target=ModelElementReference ('(' value=TypeReference ')')?
		public Group getGroup() { return cGroup; }
		
		//target=ModelElementReference
		public Assignment getTargetAssignment_0() { return cTargetAssignment_0; }
		
		//ModelElementReference
		public RuleCall getTargetModelElementReferenceParserRuleCall_0_0() { return cTargetModelElementReferenceParserRuleCall_0_0; }
		
		//('(' value=TypeReference ')')?
		public Group getGroup_1() { return cGroup_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_0() { return cLeftParenthesisKeyword_1_0; }
		
		//value=TypeReference
		public Assignment getValueAssignment_1_1() { return cValueAssignment_1_1; }
		
		//TypeReference
		public RuleCall getValueTypeReferenceParserRuleCall_1_1_0() { return cValueTypeReferenceParserRuleCall_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_2() { return cRightParenthesisKeyword_1_2; }
	}
	public class CurrentStateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.CurrentState");
		private final Assignment cCurrentStateAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cCurrentStateEnumerationLiteralParserRuleCall_0 = (RuleCall)cCurrentStateAssignment.eContents().get(0);
		
		//CurrentState av3::StateSpecification:
		//	currentState=EnumerationLiteral;
		@Override public ParserRule getRule() { return rule; }
		
		//currentState=EnumerationLiteral
		public Assignment getCurrentStateAssignment() { return cCurrentStateAssignment; }
		
		//EnumerationLiteral
		public RuleCall getCurrentStateEnumerationLiteralParserRuleCall_0() { return cCurrentStateEnumerationLiteralParserRuleCall_0; }
	}
	public class StateTransitionRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.StateTransitionRule");
		private final Group cGroup = (Group)rule.eContents().get(0);
		private final Assignment cCurrentStateAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cCurrentStateCurrentStateParserRuleCall_0_0 = (RuleCall)cCurrentStateAssignment_0.eContents().get(0);
		private final Keyword cHyphenMinusLeftSquareBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cConditionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Alternatives cConditionAlternatives_2_0 = (Alternatives)cConditionAssignment_2.eContents().get(0);
		private final RuleCall cConditionMultiLiteralOperationParserRuleCall_2_0_0 = (RuleCall)cConditionAlternatives_2_0.eContents().get(0);
		private final RuleCall cConditionContainsTokenParserRuleCall_2_0_1 = (RuleCall)cConditionAlternatives_2_0.eContents().get(1);
		private final RuleCall cConditionModelElementReferenceParserRuleCall_2_0_2 = (RuleCall)cConditionAlternatives_2_0.eContents().get(2);
		private final Keyword cRightSquareBracketHyphenMinusGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTargetStateAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTargetStateCurrentStateParserRuleCall_4_0 = (RuleCall)cTargetStateAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cLeftCurlyBracketKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cActionsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cActionsAssignmentParserRuleCall_5_1_0 = (RuleCall)cActionsAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_2 = (Keyword)cGroup_5.eContents().get(2);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//fragment StateTransitionRule *:
		//	currentState=CurrentState '-[' condition=(MultiLiteralOperation | ContainsToken | ModelElementReference) ']->'
		//	targetState=CurrentState ('{' actions+=Assignment* '}')? ';';
		@Override public ParserRule getRule() { return rule; }
		
		//currentState=CurrentState '-[' condition=(MultiLiteralOperation | ContainsToken | ModelElementReference) ']->'
		//targetState=CurrentState ('{' actions+=Assignment* '}')? ';'
		public Group getGroup() { return cGroup; }
		
		//currentState=CurrentState
		public Assignment getCurrentStateAssignment_0() { return cCurrentStateAssignment_0; }
		
		//CurrentState
		public RuleCall getCurrentStateCurrentStateParserRuleCall_0_0() { return cCurrentStateCurrentStateParserRuleCall_0_0; }
		
		//'-['
		public Keyword getHyphenMinusLeftSquareBracketKeyword_1() { return cHyphenMinusLeftSquareBracketKeyword_1; }
		
		//condition=(MultiLiteralOperation | ContainsToken | ModelElementReference)
		public Assignment getConditionAssignment_2() { return cConditionAssignment_2; }
		
		//(MultiLiteralOperation | ContainsToken | ModelElementReference)
		public Alternatives getConditionAlternatives_2_0() { return cConditionAlternatives_2_0; }
		
		//MultiLiteralOperation
		public RuleCall getConditionMultiLiteralOperationParserRuleCall_2_0_0() { return cConditionMultiLiteralOperationParserRuleCall_2_0_0; }
		
		//ContainsToken
		public RuleCall getConditionContainsTokenParserRuleCall_2_0_1() { return cConditionContainsTokenParserRuleCall_2_0_1; }
		
		//ModelElementReference
		public RuleCall getConditionModelElementReferenceParserRuleCall_2_0_2() { return cConditionModelElementReferenceParserRuleCall_2_0_2; }
		
		//']->'
		public Keyword getRightSquareBracketHyphenMinusGreaterThanSignKeyword_3() { return cRightSquareBracketHyphenMinusGreaterThanSignKeyword_3; }
		
		//targetState=CurrentState
		public Assignment getTargetStateAssignment_4() { return cTargetStateAssignment_4; }
		
		//CurrentState
		public RuleCall getTargetStateCurrentStateParserRuleCall_4_0() { return cTargetStateCurrentStateParserRuleCall_4_0; }
		
		//('{' actions+=Assignment* '}')?
		public Group getGroup_5() { return cGroup_5; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_5_0() { return cLeftCurlyBracketKeyword_5_0; }
		
		//actions+=Assignment*
		public Assignment getActionsAssignment_5_1() { return cActionsAssignment_5_1; }
		
		//Assignment
		public RuleCall getActionsAssignmentParserRuleCall_5_1_0() { return cActionsAssignmentParserRuleCall_5_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5_2() { return cRightCurlyBracketKeyword_5_2; }
		
		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}
	public class StatelessRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.StatelessRule");
		private final Group cGroup = (Group)rule.eContents().get(0);
		private final Assignment cConditionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Alternatives cConditionAlternatives_0_0 = (Alternatives)cConditionAssignment_0.eContents().get(0);
		private final RuleCall cConditionMultiLiteralOperationParserRuleCall_0_0_0 = (RuleCall)cConditionAlternatives_0_0.eContents().get(0);
		private final RuleCall cConditionContainsTokenParserRuleCall_0_0_1 = (RuleCall)cConditionAlternatives_0_0.eContents().get(1);
		private final RuleCall cConditionModelElementReferenceParserRuleCall_0_0_2 = (RuleCall)cConditionAlternatives_0_0.eContents().get(2);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cActionsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cActionsAssignmentParserRuleCall_2_0 = (RuleCall)cActionsAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//fragment StatelessRule *:
		//	condition=(MultiLiteralOperation | ContainsToken | ModelElementReference)? '->' actions+=Assignment* ';';
		@Override public ParserRule getRule() { return rule; }
		
		//condition=(MultiLiteralOperation | ContainsToken | ModelElementReference)? '->' actions+=Assignment* ';'
		public Group getGroup() { return cGroup; }
		
		//condition=(MultiLiteralOperation | ContainsToken | ModelElementReference)?
		public Assignment getConditionAssignment_0() { return cConditionAssignment_0; }
		
		//(MultiLiteralOperation | ContainsToken | ModelElementReference)
		public Alternatives getConditionAlternatives_0_0() { return cConditionAlternatives_0_0; }
		
		//MultiLiteralOperation
		public RuleCall getConditionMultiLiteralOperationParserRuleCall_0_0_0() { return cConditionMultiLiteralOperationParserRuleCall_0_0_0; }
		
		//ContainsToken
		public RuleCall getConditionContainsTokenParserRuleCall_0_0_1() { return cConditionContainsTokenParserRuleCall_0_0_1; }
		
		//ModelElementReference
		public RuleCall getConditionModelElementReferenceParserRuleCall_0_0_2() { return cConditionModelElementReferenceParserRuleCall_0_0_2; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_1() { return cHyphenMinusGreaterThanSignKeyword_1; }
		
		//actions+=Assignment*
		public Assignment getActionsAssignment_2() { return cActionsAssignment_2; }
		
		//Assignment
		public RuleCall getActionsAssignmentParserRuleCall_2_0() { return cActionsAssignmentParserRuleCall_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class ContainsTokenElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ContainsToken");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cElementAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cElementModelElementReferenceParserRuleCall_0_0 = (RuleCall)cElementAssignment_0.eContents().get(0);
		private final Assignment cOperatorAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cOperatorInOperationParserRuleCall_1_0 = (RuleCall)cOperatorAssignment_1.eContents().get(0);
		private final Assignment cConstraintAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cConstraintLiteralParserRuleCall_2_0 = (RuleCall)cConstraintAssignment_2.eContents().get(0);
		
		//ContainsToken av3::ConditionOperation:
		//	element=ModelElementReference operator=InOperation constraint=Literal;
		@Override public ParserRule getRule() { return rule; }
		
		//element=ModelElementReference operator=InOperation constraint=Literal
		public Group getGroup() { return cGroup; }
		
		//element=ModelElementReference
		public Assignment getElementAssignment_0() { return cElementAssignment_0; }
		
		//ModelElementReference
		public RuleCall getElementModelElementReferenceParserRuleCall_0_0() { return cElementModelElementReferenceParserRuleCall_0_0; }
		
		//operator=InOperation
		public Assignment getOperatorAssignment_1() { return cOperatorAssignment_1; }
		
		//InOperation
		public RuleCall getOperatorInOperationParserRuleCall_1_0() { return cOperatorInOperationParserRuleCall_1_0; }
		
		//constraint=Literal
		public Assignment getConstraintAssignment_2() { return cConstraintAssignment_2; }
		
		//Literal
		public RuleCall getConstraintLiteralParserRuleCall_2_0() { return cConstraintLiteralParserRuleCall_2_0; }
	}
	public class FeatureInputElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.FeatureInput");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cElementAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cElementModelElementReferenceParserRuleCall_0_0 = (RuleCall)cElementAssignment_0.eContents().get(0);
		private final Assignment cOperatorAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cOperatorInputOperationParserRuleCall_1_0 = (RuleCall)cOperatorAssignment_1.eContents().get(0);
		
		//FeatureInput av3::ConditionOperation:
		//	element=ModelElementReference operator=InputOperation;
		@Override public ParserRule getRule() { return rule; }
		
		//element=ModelElementReference operator=InputOperation
		public Group getGroup() { return cGroup; }
		
		//element=ModelElementReference
		public Assignment getElementAssignment_0() { return cElementAssignment_0; }
		
		//ModelElementReference
		public RuleCall getElementModelElementReferenceParserRuleCall_0_0() { return cElementModelElementReferenceParserRuleCall_0_0; }
		
		//operator=InputOperation
		public Assignment getOperatorAssignment_1() { return cOperatorAssignment_1; }
		
		//InputOperation
		public RuleCall getOperatorInputOperationParserRuleCall_1_0() { return cOperatorInputOperationParserRuleCall_1_0; }
	}
	public class LiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.Literal");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cIntegerLiteralParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cRealLiteralParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cStringLiteralParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cBooleanLiteralParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cPropertyReferenceParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cTypeReferenceParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cDirectionalLiteralParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cListLiteralParserRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);
		private final RuleCall cMultiLiteralOperationParserRuleCall_8 = (RuleCall)cAlternatives.eContents().get(8);
		private final RuleCall cContainsTokenParserRuleCall_9 = (RuleCall)cAlternatives.eContents().get(9);
		private final RuleCall cEnumerationLiteralParserRuleCall_10 = (RuleCall)cAlternatives.eContents().get(10);
		private final RuleCall cModelElementReferenceParserRuleCall_11 = (RuleCall)cAlternatives.eContents().get(11);
		
		//// expression/constraint language
		// Literal av3::Literal:
		//	IntegerLiteral | RealLiteral | StringLiteral | BooleanLiteral | PropertyReference | TypeReference |
		//	DirectionalLiteral | ListLiteral | MultiLiteralOperation | ContainsToken | EnumerationLiteral | ModelElementReference
		//	//| FeatureInput
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//IntegerLiteral | RealLiteral | StringLiteral | BooleanLiteral | PropertyReference | TypeReference | DirectionalLiteral |
		//ListLiteral | MultiLiteralOperation | ContainsToken | EnumerationLiteral | ModelElementReference
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//IntegerLiteral
		public RuleCall getIntegerLiteralParserRuleCall_0() { return cIntegerLiteralParserRuleCall_0; }
		
		//RealLiteral
		public RuleCall getRealLiteralParserRuleCall_1() { return cRealLiteralParserRuleCall_1; }
		
		//StringLiteral
		public RuleCall getStringLiteralParserRuleCall_2() { return cStringLiteralParserRuleCall_2; }
		
		//BooleanLiteral
		public RuleCall getBooleanLiteralParserRuleCall_3() { return cBooleanLiteralParserRuleCall_3; }
		
		//PropertyReference
		public RuleCall getPropertyReferenceParserRuleCall_4() { return cPropertyReferenceParserRuleCall_4; }
		
		//TypeReference
		public RuleCall getTypeReferenceParserRuleCall_5() { return cTypeReferenceParserRuleCall_5; }
		
		//DirectionalLiteral
		public RuleCall getDirectionalLiteralParserRuleCall_6() { return cDirectionalLiteralParserRuleCall_6; }
		
		//ListLiteral
		public RuleCall getListLiteralParserRuleCall_7() { return cListLiteralParserRuleCall_7; }
		
		//MultiLiteralOperation
		public RuleCall getMultiLiteralOperationParserRuleCall_8() { return cMultiLiteralOperationParserRuleCall_8; }
		
		//ContainsToken
		public RuleCall getContainsTokenParserRuleCall_9() { return cContainsTokenParserRuleCall_9; }
		
		//EnumerationLiteral
		public RuleCall getEnumerationLiteralParserRuleCall_10() { return cEnumerationLiteralParserRuleCall_10; }
		
		//ModelElementReference
		public RuleCall getModelElementReferenceParserRuleCall_11() { return cModelElementReferenceParserRuleCall_11; }
	}
	public class PackageElementReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.PackageElementReference");
		private final Assignment cElementAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cElementPackageElementCrossReference_0 = (CrossReference)cElementAssignment.eContents().get(0);
		private final RuleCall cElementPackageElementQualifiedNameParserRuleCall_0_1 = (RuleCall)cElementPackageElementCrossReference_0.eContents().get(1);
		
		//PackageElementReference av3::PackageElementReference:
		//	element=[av3::PackageElement|QualifiedName];
		@Override public ParserRule getRule() { return rule; }
		
		//element=[av3::PackageElement|QualifiedName]
		public Assignment getElementAssignment() { return cElementAssignment; }
		
		//[av3::PackageElement|QualifiedName]
		public CrossReference getElementPackageElementCrossReference_0() { return cElementPackageElementCrossReference_0; }
		
		//QualifiedName
		public RuleCall getElementPackageElementQualifiedNameParserRuleCall_0_1() { return cElementPackageElementQualifiedNameParserRuleCall_0_1; }
	}
	public class PropertyReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.PropertyReference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cElementAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cElementPackageElementCrossReference_1_0 = (CrossReference)cElementAssignment_1.eContents().get(0);
		private final RuleCall cElementPackageElementQualifiedNameParserRuleCall_1_0_1 = (RuleCall)cElementPackageElementCrossReference_1_0.eContents().get(1);
		
		//PropertyReference av3::PackageElementReference:
		//	'#' element=[av3::PackageElement|QualifiedName];
		@Override public ParserRule getRule() { return rule; }
		
		//'#' element=[av3::PackageElement|QualifiedName]
		public Group getGroup() { return cGroup; }
		
		//'#'
		public Keyword getNumberSignKeyword_0() { return cNumberSignKeyword_0; }
		
		//element=[av3::PackageElement|QualifiedName]
		public Assignment getElementAssignment_1() { return cElementAssignment_1; }
		
		//[av3::PackageElement|QualifiedName]
		public CrossReference getElementPackageElementCrossReference_1_0() { return cElementPackageElementCrossReference_1_0; }
		
		//QualifiedName
		public RuleCall getElementPackageElementQualifiedNameParserRuleCall_1_0_1() { return cElementPackageElementQualifiedNameParserRuleCall_1_0_1; }
	}
	public class IntegerLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.IntegerLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cIntegerLiteralAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		private final Assignment cUnitAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cUnitIDTerminalRuleCall_2_0 = (RuleCall)cUnitAssignment_2.eContents().get(0);
		
		//IntegerLiteral av3::Literal:
		//	{av3::IntegerLiteral} value=INT unit=ID?;
		@Override public ParserRule getRule() { return rule; }
		
		//{av3::IntegerLiteral} value=INT unit=ID?
		public Group getGroup() { return cGroup; }
		
		//{av3::IntegerLiteral}
		public Action getIntegerLiteralAction_0() { return cIntegerLiteralAction_0; }
		
		//value=INT
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_1_0() { return cValueINTTerminalRuleCall_1_0; }
		
		//unit=ID?
		public Assignment getUnitAssignment_2() { return cUnitAssignment_2; }
		
		//ID
		public RuleCall getUnitIDTerminalRuleCall_2_0() { return cUnitIDTerminalRuleCall_2_0; }
	}
	public class RealLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.RealLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cRealLiteralAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueDOUBLETerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		private final Assignment cUnitAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cUnitIDTerminalRuleCall_2_0 = (RuleCall)cUnitAssignment_2.eContents().get(0);
		
		//RealLiteral av3::Literal:
		//	{av3::RealLiteral} value=DOUBLE unit=ID?;
		@Override public ParserRule getRule() { return rule; }
		
		//{av3::RealLiteral} value=DOUBLE unit=ID?
		public Group getGroup() { return cGroup; }
		
		//{av3::RealLiteral}
		public Action getRealLiteralAction_0() { return cRealLiteralAction_0; }
		
		//value=DOUBLE
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//DOUBLE
		public RuleCall getValueDOUBLETerminalRuleCall_1_0() { return cValueDOUBLETerminalRuleCall_1_0; }
		
		//unit=ID?
		public Assignment getUnitAssignment_2() { return cUnitAssignment_2; }
		
		//ID
		public RuleCall getUnitIDTerminalRuleCall_2_0() { return cUnitIDTerminalRuleCall_2_0; }
	}
	public class StringLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.StringLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cStringLiteralAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueNoQuoteStringParserRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//StringLiteral av3::Literal:
		//	{av3::StringLiteral} value=NoQuoteString;
		@Override public ParserRule getRule() { return rule; }
		
		//{av3::StringLiteral} value=NoQuoteString
		public Group getGroup() { return cGroup; }
		
		//{av3::StringLiteral}
		public Action getStringLiteralAction_0() { return cStringLiteralAction_0; }
		
		//value=NoQuoteString
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//NoQuoteString
		public RuleCall getValueNoQuoteStringParserRuleCall_1_0() { return cValueNoQuoteStringParserRuleCall_1_0; }
	}
	public class EnumerationLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.EnumerationLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEnumerationLiteralAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueIDTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//EnumerationLiteral av3::EnumerationLiteral:
		//	{av3::EnumerationLiteral} value=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//{av3::EnumerationLiteral} value=ID
		public Group getGroup() { return cGroup; }
		
		//{av3::EnumerationLiteral}
		public Action getEnumerationLiteralAction_0() { return cEnumerationLiteralAction_0; }
		
		//value=ID
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//ID
		public RuleCall getValueIDTerminalRuleCall_1_0() { return cValueIDTerminalRuleCall_1_0; }
	}
	public class NoQuoteStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.NoQuoteString");
		private final RuleCall cSTRINGTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//NoQuoteString:
		//	STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//// remove quotes from string in ValueConverter
		// STRING
		public RuleCall getSTRINGTerminalRuleCall() { return cSTRINGTerminalRuleCall; }
	}
	public class BooleanLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.BooleanLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cBooleanLiteralAction_0 = (Action)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final Keyword cValueTrueKeyword_1_0_0 = (Keyword)cValueAssignment_1_0.eContents().get(0);
		private final Keyword cFalseKeyword_1_1 = (Keyword)cAlternatives_1.eContents().get(1);
		
		//BooleanLiteral av3::Literal:
		//	{av3::BooleanLiteral} (value?='true' | 'false');
		@Override public ParserRule getRule() { return rule; }
		
		//{av3::BooleanLiteral} (value?='true' | 'false')
		public Group getGroup() { return cGroup; }
		
		//{av3::BooleanLiteral}
		public Action getBooleanLiteralAction_0() { return cBooleanLiteralAction_0; }
		
		//value?='true' | 'false'
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//value?='true'
		public Assignment getValueAssignment_1_0() { return cValueAssignment_1_0; }
		
		//'true'
		public Keyword getValueTrueKeyword_1_0_0() { return cValueTrueKeyword_1_0_0; }
		
		//'false'
		public Keyword getFalseKeyword_1_1() { return cFalseKeyword_1_1; }
	}
	public class ListLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ListLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cListLiteralAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cElementsAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cElementsLiteralParserRuleCall_2_0_0 = (RuleCall)cElementsAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Keyword cCommaKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cElementsAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cElementsLiteralParserRuleCall_2_1_1_0 = (RuleCall)cElementsAssignment_2_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//ListLiteral av3::ListLiteral:
		//	{av3::ListLiteral} '(' (elements+=Literal (',' elements+=Literal)*)? ')';
		@Override public ParserRule getRule() { return rule; }
		
		//{av3::ListLiteral} '(' (elements+=Literal (',' elements+=Literal)*)? ')'
		public Group getGroup() { return cGroup; }
		
		//{av3::ListLiteral}
		public Action getListLiteralAction_0() { return cListLiteralAction_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//(elements+=Literal (',' elements+=Literal)*)?
		public Group getGroup_2() { return cGroup_2; }
		
		//elements+=Literal
		public Assignment getElementsAssignment_2_0() { return cElementsAssignment_2_0; }
		
		//Literal
		public RuleCall getElementsLiteralParserRuleCall_2_0_0() { return cElementsLiteralParserRuleCall_2_0_0; }
		
		//(',' elements+=Literal)*
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//','
		public Keyword getCommaKeyword_2_1_0() { return cCommaKeyword_2_1_0; }
		
		//elements+=Literal
		public Assignment getElementsAssignment_2_1_1() { return cElementsAssignment_2_1_1; }
		
		//Literal
		public RuleCall getElementsLiteralParserRuleCall_2_1_1_0() { return cElementsLiteralParserRuleCall_2_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class DirectionalLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.DirectionalLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDirectionalLiteralAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cDirectionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDirectionPropagationDirectionParserRuleCall_1_0 = (RuleCall)cDirectionAssignment_1.eContents().get(0);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueLiteralParserRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//DirectionalLiteral av3::DirectionalLiteral:
		//	{av3::DirectionalLiteral} direction=PropagationDirection value=Literal;
		@Override public ParserRule getRule() { return rule; }
		
		//{av3::DirectionalLiteral} direction=PropagationDirection value=Literal
		public Group getGroup() { return cGroup; }
		
		//{av3::DirectionalLiteral}
		public Action getDirectionalLiteralAction_0() { return cDirectionalLiteralAction_0; }
		
		//direction=PropagationDirection
		public Assignment getDirectionAssignment_1() { return cDirectionAssignment_1; }
		
		//PropagationDirection
		public RuleCall getDirectionPropagationDirectionParserRuleCall_1_0() { return cDirectionPropagationDirectionParserRuleCall_1_0; }
		
		//value=Literal
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//Literal
		public RuleCall getValueLiteralParserRuleCall_2_0() { return cValueLiteralParserRuleCall_2_0; }
	}
	public class MultiLiteralOperationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.MultiLiteralOperation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMultiLiteralConstraintAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cOperatorAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cOperatorEOperationParserRuleCall_1_0 = (RuleCall)cOperatorAssignment_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cElementsAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cElementsLiteralParserRuleCall_3_0_0 = (RuleCall)cElementsAssignment_3_0.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cCommaKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cElementsAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cElementsLiteralParserRuleCall_3_1_1_0 = (RuleCall)cElementsAssignment_3_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//MultiLiteralOperation av3::MultiLiteralConstraint:
		//	{av3::MultiLiteralConstraint} operator=EOperation '(' (elements+=Literal (',' elements+=Literal)*)? ')';
		@Override public ParserRule getRule() { return rule; }
		
		//{av3::MultiLiteralConstraint} operator=EOperation '(' (elements+=Literal (',' elements+=Literal)*)? ')'
		public Group getGroup() { return cGroup; }
		
		//{av3::MultiLiteralConstraint}
		public Action getMultiLiteralConstraintAction_0() { return cMultiLiteralConstraintAction_0; }
		
		//operator=EOperation
		public Assignment getOperatorAssignment_1() { return cOperatorAssignment_1; }
		
		//EOperation
		public RuleCall getOperatorEOperationParserRuleCall_1_0() { return cOperatorEOperationParserRuleCall_1_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//(elements+=Literal (',' elements+=Literal)*)?
		public Group getGroup_3() { return cGroup_3; }
		
		//elements+=Literal
		public Assignment getElementsAssignment_3_0() { return cElementsAssignment_3_0; }
		
		//Literal
		public RuleCall getElementsLiteralParserRuleCall_3_0_0() { return cElementsLiteralParserRuleCall_3_0_0; }
		
		//(',' elements+=Literal)*
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//','
		public Keyword getCommaKeyword_3_1_0() { return cCommaKeyword_3_1_0; }
		
		//elements+=Literal
		public Assignment getElementsAssignment_3_1_1() { return cElementsAssignment_3_1_1; }
		
		//Literal
		public RuleCall getElementsLiteralParserRuleCall_3_1_1_0() { return cElementsLiteralParserRuleCall_3_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
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
		//	'abstract' | 'bus' | 'data' | 'device' | 'memory' | 'process' | 'processor' | 'system' | 'thread' |
		//	VirtualBusKeywords | VirtualProcessorKeywords | VirtualMemoryKeywords | VirtualDeviceKeywords | 'subprogram' |
		//	SubprogramGroupKeywords | ThreadGroupKeywords;
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
		private final Keyword cParameterKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final RuleCall cDataAccessKeywordsParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cBusAccessKeywordsParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cVirtualBusAccessKeywordsParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cSubprogramAccessKeywordsParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cSubprogramGroupAccessKeywordsParserRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);
		private final Keyword cBindingKeyword_8 = (Keyword)cAlternatives.eContents().get(8);
		private final Keyword cInterfaceKeyword_9 = (Keyword)cAlternatives.eContents().get(9);
		
		//FeatureCategory av3::FeatureCategory:
		//	'feature' | 'port' | 'parameter' | DataAccessKeywords | BusAccessKeywords | VirtualBusAccessKeywords |
		//	SubprogramAccessKeywords | SubprogramGroupAccessKeywords | 'binding' | 'interface';
		@Override public ParserRule getRule() { return rule; }
		
		//'feature' | 'port' | 'parameter' | DataAccessKeywords | BusAccessKeywords | VirtualBusAccessKeywords |
		//SubprogramAccessKeywords | SubprogramGroupAccessKeywords | 'binding' | 'interface'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'feature'
		public Keyword getFeatureKeyword_0() { return cFeatureKeyword_0; }
		
		//'port'
		public Keyword getPortKeyword_1() { return cPortKeyword_1; }
		
		//'parameter'
		public Keyword getParameterKeyword_2() { return cParameterKeyword_2; }
		
		//DataAccessKeywords
		public RuleCall getDataAccessKeywordsParserRuleCall_3() { return cDataAccessKeywordsParserRuleCall_3; }
		
		//BusAccessKeywords
		public RuleCall getBusAccessKeywordsParserRuleCall_4() { return cBusAccessKeywordsParserRuleCall_4; }
		
		//VirtualBusAccessKeywords
		public RuleCall getVirtualBusAccessKeywordsParserRuleCall_5() { return cVirtualBusAccessKeywordsParserRuleCall_5; }
		
		//SubprogramAccessKeywords
		public RuleCall getSubprogramAccessKeywordsParserRuleCall_6() { return cSubprogramAccessKeywordsParserRuleCall_6; }
		
		//SubprogramGroupAccessKeywords
		public RuleCall getSubprogramGroupAccessKeywordsParserRuleCall_7() { return cSubprogramGroupAccessKeywordsParserRuleCall_7; }
		
		//'binding'
		public Keyword getBindingKeyword_8() { return cBindingKeyword_8; }
		
		//'interface'
		public Keyword getInterfaceKeyword_9() { return cInterfaceKeyword_9; }
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
		//	'in' | 'out' | InOutKeywords | 'requires' | 'provides' | ProvidesReadKeywords | RequiresReadKeywords |
		//	ProvidesWriteKeywords | RequiresWriteKeywords | ProvidesRWKeywords | RequiresRWKeywords;
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
	public class PropagationDirectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.PropagationDirection");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cInKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cOutKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//PropagationDirection av3::FeatureDirection:
		//	'in' | 'out';
		@Override public ParserRule getRule() { return rule; }
		
		//'in' | 'out'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'in'
		public Keyword getInKeyword_0() { return cInKeyword_0; }
		
		//'out'
		public Keyword getOutKeyword_1() { return cOutKeyword_1; }
	}
	public class CompositeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.Composite");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cListKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cSetKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//Composite av3::Composite:
		//	'list' | 'set';
		@Override public ParserRule getRule() { return rule; }
		
		//'list' | 'set'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'list'
		public Keyword getListKeyword_0() { return cListKeyword_0; }
		
		//'set'
		public Keyword getSetKeyword_1() { return cSetKeyword_1; }
	}
	public class PrimitiveElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.Primitive");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cBooleanKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cIntegerKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cRealKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cStringKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		
		//Primitive av3::Primitive:
		//	'boolean' | 'integer' | 'real' | 'string';
		@Override public ParserRule getRule() { return rule; }
		
		//'boolean' | 'integer' | 'real' | 'string'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'boolean'
		public Keyword getBooleanKeyword_0() { return cBooleanKeyword_0; }
		
		//'integer'
		public Keyword getIntegerKeyword_1() { return cIntegerKeyword_1; }
		
		//'real'
		public Keyword getRealKeyword_2() { return cRealKeyword_2; }
		
		//'string'
		public Keyword getStringKeyword_3() { return cStringKeyword_3; }
	}
	public class EOperationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.EOperation");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cAnyKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cAllKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cOneofKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cOfKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cOrmoreKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		private final Keyword cOrlessKeyword_5 = (Keyword)cAlternatives.eContents().get(5);
		
		//EOperation av3::EOperator:
		//	'any' | 'all' | 'oneof' | 'of' | 'ormore' | 'orless';
		@Override public ParserRule getRule() { return rule; }
		
		//'any' | 'all' | 'oneof' | 'of' | 'ormore' | 'orless'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'any'
		public Keyword getAnyKeyword_0() { return cAnyKeyword_0; }
		
		//'all'
		public Keyword getAllKeyword_1() { return cAllKeyword_1; }
		
		//'oneof'
		public Keyword getOneofKeyword_2() { return cOneofKeyword_2; }
		
		//'of'
		public Keyword getOfKeyword_3() { return cOfKeyword_3; }
		
		//'ormore'
		public Keyword getOrmoreKeyword_4() { return cOrmoreKeyword_4; }
		
		//'orless'
		public Keyword getOrlessKeyword_5() { return cOrlessKeyword_5; }
	}
	public class COperationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.COperation");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cInKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cContainsKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cEqualsKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cSatisfiesKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cQuestionMarkKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		
		//COperation av3::COperator:
		//	'in' | 'contains' | 'equals' | 'satisfies' | '?';
		@Override public ParserRule getRule() { return rule; }
		
		//'in' | 'contains' | 'equals' | 'satisfies' | '?'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'in'
		public Keyword getInKeyword_0() { return cInKeyword_0; }
		
		//'contains'
		public Keyword getContainsKeyword_1() { return cContainsKeyword_1; }
		
		//'equals'
		public Keyword getEqualsKeyword_2() { return cEqualsKeyword_2; }
		
		//'satisfies'
		public Keyword getSatisfiesKeyword_3() { return cSatisfiesKeyword_3; }
		
		//'?'
		public Keyword getQuestionMarkKeyword_4() { return cQuestionMarkKeyword_4; }
	}
	public class SatisfiesOperationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.SatisfiesOperation");
		private final Keyword cSatisfiesKeyword = (Keyword)rule.eContents().get(1);
		
		//SatisfiesOperation av3::COperator:
		//	'satisfies';
		@Override public ParserRule getRule() { return rule; }
		
		//'satisfies'
		public Keyword getSatisfiesKeyword() { return cSatisfiesKeyword; }
	}
	public class InOperationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.InOperation");
		private final Keyword cInKeyword = (Keyword)rule.eContents().get(1);
		
		//InOperation av3::COperator:
		//	'in';
		@Override public ParserRule getRule() { return rule; }
		
		//'in'
		public Keyword getInKeyword() { return cInKeyword; }
	}
	public class InputOperationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.InputOperation");
		private final Keyword cQuestionMarkKeyword = (Keyword)rule.eContents().get(1);
		
		//InputOperation av3::COperator:
		//	'?';
		@Override public ParserRule getRule() { return rule; }
		
		//'?'
		public Keyword getQuestionMarkKeyword() { return cQuestionMarkKeyword; }
	}
	public class AssociationTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.AssociationType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cIsConnectionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIsBindingParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cIsFlowParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//AssociationType av3::AssociationType:
		//	IsConnection | IsBinding | IsFlow;
		@Override public ParserRule getRule() { return rule; }
		
		//IsConnection | IsBinding | IsFlow
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//IsConnection
		public RuleCall getIsConnectionParserRuleCall_0() { return cIsConnectionParserRuleCall_0; }
		
		//IsBinding
		public RuleCall getIsBindingParserRuleCall_1() { return cIsBindingParserRuleCall_1; }
		
		//IsFlow
		public RuleCall getIsFlowParserRuleCall_2() { return cIsFlowParserRuleCall_2; }
	}
	public class IsConnectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.IsConnection");
		private final Keyword cConnectionKeyword = (Keyword)rule.eContents().get(1);
		
		//IsConnection av3::AssociationType:
		//	'connection';
		@Override public ParserRule getRule() { return rule; }
		
		//'connection'
		public Keyword getConnectionKeyword() { return cConnectionKeyword; }
	}
	public class IsBindingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.IsBinding");
		private final Keyword cBindingKeyword = (Keyword)rule.eContents().get(1);
		
		//IsBinding av3::AssociationType:
		//	'binding';
		@Override public ParserRule getRule() { return rule; }
		
		//'binding'
		public Keyword getBindingKeyword() { return cBindingKeyword; }
	}
	public class IsFlowSourceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.IsFlowSource");
		private final RuleCall cFlowSourceKeywordsParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//IsFlowSource av3::AssociationType:
		//	FlowSourceKeywords;
		@Override public ParserRule getRule() { return rule; }
		
		//FlowSourceKeywords
		public RuleCall getFlowSourceKeywordsParserRuleCall() { return cFlowSourceKeywordsParserRuleCall; }
	}
	public class IsFlowSinkElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.IsFlowSink");
		private final RuleCall cFlowSinkKeywordsParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//IsFlowSink av3::AssociationType:
		//	FlowSinkKeywords;
		@Override public ParserRule getRule() { return rule; }
		
		//FlowSinkKeywords
		public RuleCall getFlowSinkKeywordsParserRuleCall() { return cFlowSinkKeywordsParserRuleCall; }
	}
	public class IsFlowElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.IsFlow");
		private final Keyword cFlowKeyword = (Keyword)rule.eContents().get(1);
		
		//IsFlow av3::AssociationType:
		//	'flow';
		@Override public ParserRule getRule() { return rule; }
		
		//'flow'
		public Keyword getFlowKeyword() { return cFlowKeyword; }
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
	public class InOutKeywordsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.InOutKeywords");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cOutKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		////FlowPathKeywords: 'flow';
		// InOutKeywords:
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
	public class VirtualBusAccessKeywordsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.VirtualBusAccessKeywords");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVirtualKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cBusKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cAccessKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//VirtualBusAccessKeywords:
		//	'virtual' 'bus' 'access';
		@Override public ParserRule getRule() { return rule; }
		
		//'virtual' 'bus' 'access'
		public Group getGroup() { return cGroup; }
		
		//'virtual'
		public Keyword getVirtualKeyword_0() { return cVirtualKeyword_0; }
		
		//'bus'
		public Keyword getBusKeyword_1() { return cBusKeyword_1; }
		
		//'access'
		public Keyword getAccessKeyword_2() { return cAccessKeyword_2; }
	}
	public class DataAccessKeywordsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.DataAccessKeywords");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDataKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cAccessKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//DataAccessKeywords:
		//	'data' 'access';
		@Override public ParserRule getRule() { return rule; }
		
		//'data' 'access'
		public Group getGroup() { return cGroup; }
		
		//'data'
		public Keyword getDataKeyword_0() { return cDataKeyword_0; }
		
		//'access'
		public Keyword getAccessKeyword_1() { return cAccessKeyword_1; }
	}
	public class SubprogramAccessKeywordsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.SubprogramAccessKeywords");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSubprogramKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cAccessKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//SubprogramAccessKeywords:
		//	'subprogram' 'access';
		@Override public ParserRule getRule() { return rule; }
		
		//'subprogram' 'access'
		public Group getGroup() { return cGroup; }
		
		//'subprogram'
		public Keyword getSubprogramKeyword_0() { return cSubprogramKeyword_0; }
		
		//'access'
		public Keyword getAccessKeyword_1() { return cAccessKeyword_1; }
	}
	public class SubprogramGroupAccessKeywordsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.SubprogramGroupAccessKeywords");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSubprogramKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cGroupKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cAccessKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//SubprogramGroupAccessKeywords:
		//	'subprogram' 'group' 'access';
		@Override public ParserRule getRule() { return rule; }
		
		//'subprogram' 'group' 'access'
		public Group getGroup() { return cGroup; }
		
		//'subprogram'
		public Keyword getSubprogramKeyword_0() { return cSubprogramKeyword_0; }
		
		//'group'
		public Keyword getGroupKeyword_1() { return cGroupKeyword_1; }
		
		//'access'
		public Keyword getAccessKeyword_2() { return cAccessKeyword_2; }
	}
	public class ProvidesReadKeywordsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ProvidesReadKeywords");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProvidesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cInKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//ProvidesReadKeywords:
		//	'provides' 'in';
		@Override public ParserRule getRule() { return rule; }
		
		//'provides' 'in'
		public Group getGroup() { return cGroup; }
		
		//'provides'
		public Keyword getProvidesKeyword_0() { return cProvidesKeyword_0; }
		
		//'in'
		public Keyword getInKeyword_1() { return cInKeyword_1; }
	}
	public class RequiresReadKeywordsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.RequiresReadKeywords");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRequiresKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cInKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//RequiresReadKeywords:
		//	'requires' 'in';
		@Override public ParserRule getRule() { return rule; }
		
		//'requires' 'in'
		public Group getGroup() { return cGroup; }
		
		//'requires'
		public Keyword getRequiresKeyword_0() { return cRequiresKeyword_0; }
		
		//'in'
		public Keyword getInKeyword_1() { return cInKeyword_1; }
	}
	public class ProvidesWriteKeywordsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ProvidesWriteKeywords");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProvidesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cOutKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//ProvidesWriteKeywords:
		//	'provides' 'out';
		@Override public ParserRule getRule() { return rule; }
		
		//'provides' 'out'
		public Group getGroup() { return cGroup; }
		
		//'provides'
		public Keyword getProvidesKeyword_0() { return cProvidesKeyword_0; }
		
		//'out'
		public Keyword getOutKeyword_1() { return cOutKeyword_1; }
	}
	public class RequiresWriteKeywordsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.RequiresWriteKeywords");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRequiresKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cOutKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//RequiresWriteKeywords:
		//	'requires' 'out';
		@Override public ParserRule getRule() { return rule; }
		
		//'requires' 'out'
		public Group getGroup() { return cGroup; }
		
		//'requires'
		public Keyword getRequiresKeyword_0() { return cRequiresKeyword_0; }
		
		//'out'
		public Keyword getOutKeyword_1() { return cOutKeyword_1; }
	}
	public class ProvidesRWKeywordsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ProvidesRWKeywords");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProvidesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cInKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cOutKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//ProvidesRWKeywords:
		//	'provides' 'in' 'out';
		@Override public ParserRule getRule() { return rule; }
		
		//'provides' 'in' 'out'
		public Group getGroup() { return cGroup; }
		
		//'provides'
		public Keyword getProvidesKeyword_0() { return cProvidesKeyword_0; }
		
		//'in'
		public Keyword getInKeyword_1() { return cInKeyword_1; }
		
		//'out'
		public Keyword getOutKeyword_2() { return cOutKeyword_2; }
	}
	public class RequiresRWKeywordsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.RequiresRWKeywords");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRequiresKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cInKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cOutKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//RequiresRWKeywords:
		//	'requires' 'in' 'out';
		@Override public ParserRule getRule() { return rule; }
		
		//'requires' 'in' 'out'
		public Group getGroup() { return cGroup; }
		
		//'requires'
		public Keyword getRequiresKeyword_0() { return cRequiresKeyword_0; }
		
		//'in'
		public Keyword getInKeyword_1() { return cInKeyword_1; }
		
		//'out'
		public Keyword getOutKeyword_2() { return cOutKeyword_2; }
	}
	
	
	private final PackageDeclarationElements pPackageDeclaration;
	private final AnnexLibraryElements pAnnexLibrary;
	private final PackageElementElements pPackageElement;
	private final PropertyDefinitionElements pPropertyDefinition;
	private final AppliesToElements pAppliesTo;
	private final PropertySetElements pPropertySet;
	private final TypeDefElements pTypeDef;
	private final ConstantDefElements pConstantDef;
	private final PropertyAssociationElements pPropertyAssociation;
	private final PropertyAssociationTypeElements pPropertyAssociationType;
	private final ModelElementReferenceElements pModelElementReference;
	private final ComponentInterfaceElements pComponentInterface;
	private final InterfaceBodyElements pInterfaceBody;
	private final InterfaceElementElements pInterfaceElement;
	private final ComponentImplementationElements pComponentImplementation;
	private final ImplementationBodyElements pImplementationBody;
	private final ImplementationElementElements pImplementationElement;
	private final ComponentConfigurationElements pComponentConfiguration;
	private final FeatureElements pFeature;
	private final SubcomponentElements pSubcomponent;
	private final ConnectionElements pConnection;
	private final BindingElements pBinding;
	private final FlowPathElements pFlowPath;
	private final FlowSourceElements pFlowSource;
	private final FlowSinkElements pFlowSink;
	private final UsePropsElements pUseProps;
	private final PathElements pPath;
	private final PathElementElements pPathElement;
	private final ImportElements pImport;
	private final ClassifierAssignmentElements pClassifierAssignment;
	private final ClassifierAssignmentPatternElements pClassifierAssignmentPattern;
	private final QueryExpressionElements pQueryExpression;
	private final FlowAssignmentElements pFlowAssignment;
	private final ConfigurationElementBlockElements pConfigurationElementBlock;
	private final CurlyConfigurationElementBlockElements pCurlyConfigurationElementBlock;
	private final ConfigurationElementElements pConfigurationElement;
	private final ParametersElements pParameters;
	private final ConfigurationParameterElements pConfigurationParameter;
	private final ReversableInterfaceReferenceElements pReversableInterfaceReference;
	private final ReversableTypeReferenceElements pReversableTypeReference;
	private final ClassifierOrTypeReferenceElements pClassifierOrTypeReference;
	private final TypeReferenceElements pTypeReference;
	private final TypeElements pType;
	private final EnumerationTypeElements pEnumerationType;
	private final CompositeTypeElements pCompositeType;
	private final PrimitiveTypeElements pPrimitiveType;
	private final RealizationReferenceElements pRealizationReference;
	private final ImplementationReferenceElements pImplementationReference;
	private final AnnexSubclauseElements pAnnexSubclause;
	private final DefaultAnnexSubclauseElements pDefaultAnnexSubclause;
	private final PropertiesBlockElements pPropertiesBlock;
	private final NestedComponentImplementationBlockElements pNestedComponentImplementationBlock;
	private final NestedImplementationElementElements pNestedImplementationElement;
	private final ConfigurationExtensionsElements pConfigurationExtensions;
	private final ImplementationExtensionsElements pImplementationExtensions;
	private final InterfaceExtensionsElements pInterfaceExtensions;
	private final ConfigurationActualsElements pConfigurationActuals;
	private final ConfigurationActualElements pConfigurationActual;
	private final WorkingsetElements pWorkingset;
	private final InstanceConfigurationElements pInstanceConfiguration;
	private final ProductLineConstraintElements pProductLineConstraint;
	private final EMSubclauseElements pEMSubclause;
	private final BASubclauseElements pBASubclause;
	private final BehaviorSpecificationBlockElements pBehaviorSpecificationBlock;
	private final BehaviorSpecificationElementElements pBehaviorSpecificationElement;
	private final EventElements pEvent;
	private final BehaviorRuleElements pBehaviorRule;
	private final AssignmentElements pAssignment;
	private final CurrentStateElements pCurrentState;
	private final StateTransitionRuleElements pStateTransitionRule;
	private final StatelessRuleElements pStatelessRule;
	private final ContainsTokenElements pContainsToken;
	private final FeatureInputElements pFeatureInput;
	private final LiteralElements pLiteral;
	private final PackageElementReferenceElements pPackageElementReference;
	private final PropertyReferenceElements pPropertyReference;
	private final IntegerLiteralElements pIntegerLiteral;
	private final RealLiteralElements pRealLiteral;
	private final TerminalRule tDOUBLE;
	private final StringLiteralElements pStringLiteral;
	private final EnumerationLiteralElements pEnumerationLiteral;
	private final NoQuoteStringElements pNoQuoteString;
	private final BooleanLiteralElements pBooleanLiteral;
	private final ListLiteralElements pListLiteral;
	private final DirectionalLiteralElements pDirectionalLiteral;
	private final MultiLiteralOperationElements pMultiLiteralOperation;
	private final QualifiedNameWithWildcardElements pQualifiedNameWithWildcard;
	private final DottedNameElements pDottedName;
	private final QualifiedNameElements pQualifiedName;
	private final QualifiedTypesReferenceElements pQualifiedTypesReference;
	private final QualifiedReferenceElements pQualifiedReference;
	private final QualifiedDottedReferenceElements pQualifiedDottedReference;
	private final ComponentCategoryElements pComponentCategory;
	private final FeatureCategoryElements pFeatureCategory;
	private final FeatureDirectionElements pFeatureDirection;
	private final PropagationDirectionElements pPropagationDirection;
	private final CompositeElements pComposite;
	private final PrimitiveElements pPrimitive;
	private final EOperationElements pEOperation;
	private final COperationElements pCOperation;
	private final SatisfiesOperationElements pSatisfiesOperation;
	private final InOperationElements pInOperation;
	private final InputOperationElements pInputOperation;
	private final AssociationTypeElements pAssociationType;
	private final IsConnectionElements pIsConnection;
	private final IsBindingElements pIsBinding;
	private final IsFlowSourceElements pIsFlowSource;
	private final IsFlowSinkElements pIsFlowSink;
	private final IsFlowElements pIsFlow;
	private final VirtualProcessorKeywordsElements pVirtualProcessorKeywords;
	private final VirtualBusKeywordsElements pVirtualBusKeywords;
	private final VirtualMemoryKeywordsElements pVirtualMemoryKeywords;
	private final VirtualDeviceKeywordsElements pVirtualDeviceKeywords;
	private final ThreadGroupKeywordsElements pThreadGroupKeywords;
	private final SubprogramGroupKeywordsElements pSubprogramGroupKeywords;
	private final FlowSourceKeywordsElements pFlowSourceKeywords;
	private final FlowSinkKeywordsElements pFlowSinkKeywords;
	private final InOutKeywordsElements pInOutKeywords;
	private final BusAccessKeywordsElements pBusAccessKeywords;
	private final VirtualBusAccessKeywordsElements pVirtualBusAccessKeywords;
	private final DataAccessKeywordsElements pDataAccessKeywords;
	private final SubprogramAccessKeywordsElements pSubprogramAccessKeywords;
	private final SubprogramGroupAccessKeywordsElements pSubprogramGroupAccessKeywords;
	private final ProvidesReadKeywordsElements pProvidesReadKeywords;
	private final RequiresReadKeywordsElements pRequiresReadKeywords;
	private final ProvidesWriteKeywordsElements pProvidesWriteKeywords;
	private final RequiresWriteKeywordsElements pRequiresWriteKeywords;
	private final ProvidesRWKeywordsElements pProvidesRWKeywords;
	private final RequiresRWKeywordsElements pRequiresRWKeywords;
	private final TerminalRule tANNEXTEXT;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public AadlV3GrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pPackageDeclaration = new PackageDeclarationElements();
		this.pAnnexLibrary = new AnnexLibraryElements();
		this.pPackageElement = new PackageElementElements();
		this.pPropertyDefinition = new PropertyDefinitionElements();
		this.pAppliesTo = new AppliesToElements();
		this.pPropertySet = new PropertySetElements();
		this.pTypeDef = new TypeDefElements();
		this.pConstantDef = new ConstantDefElements();
		this.pPropertyAssociation = new PropertyAssociationElements();
		this.pPropertyAssociationType = new PropertyAssociationTypeElements();
		this.pModelElementReference = new ModelElementReferenceElements();
		this.pComponentInterface = new ComponentInterfaceElements();
		this.pInterfaceBody = new InterfaceBodyElements();
		this.pInterfaceElement = new InterfaceElementElements();
		this.pComponentImplementation = new ComponentImplementationElements();
		this.pImplementationBody = new ImplementationBodyElements();
		this.pImplementationElement = new ImplementationElementElements();
		this.pComponentConfiguration = new ComponentConfigurationElements();
		this.pFeature = new FeatureElements();
		this.pSubcomponent = new SubcomponentElements();
		this.pConnection = new ConnectionElements();
		this.pBinding = new BindingElements();
		this.pFlowPath = new FlowPathElements();
		this.pFlowSource = new FlowSourceElements();
		this.pFlowSink = new FlowSinkElements();
		this.pUseProps = new UsePropsElements();
		this.pPath = new PathElements();
		this.pPathElement = new PathElementElements();
		this.pImport = new ImportElements();
		this.pClassifierAssignment = new ClassifierAssignmentElements();
		this.pClassifierAssignmentPattern = new ClassifierAssignmentPatternElements();
		this.pQueryExpression = new QueryExpressionElements();
		this.pFlowAssignment = new FlowAssignmentElements();
		this.pConfigurationElementBlock = new ConfigurationElementBlockElements();
		this.pCurlyConfigurationElementBlock = new CurlyConfigurationElementBlockElements();
		this.pConfigurationElement = new ConfigurationElementElements();
		this.pParameters = new ParametersElements();
		this.pConfigurationParameter = new ConfigurationParameterElements();
		this.pReversableInterfaceReference = new ReversableInterfaceReferenceElements();
		this.pReversableTypeReference = new ReversableTypeReferenceElements();
		this.pClassifierOrTypeReference = new ClassifierOrTypeReferenceElements();
		this.pTypeReference = new TypeReferenceElements();
		this.pType = new TypeElements();
		this.pEnumerationType = new EnumerationTypeElements();
		this.pCompositeType = new CompositeTypeElements();
		this.pPrimitiveType = new PrimitiveTypeElements();
		this.pRealizationReference = new RealizationReferenceElements();
		this.pImplementationReference = new ImplementationReferenceElements();
		this.pAnnexSubclause = new AnnexSubclauseElements();
		this.pDefaultAnnexSubclause = new DefaultAnnexSubclauseElements();
		this.pPropertiesBlock = new PropertiesBlockElements();
		this.pNestedComponentImplementationBlock = new NestedComponentImplementationBlockElements();
		this.pNestedImplementationElement = new NestedImplementationElementElements();
		this.pConfigurationExtensions = new ConfigurationExtensionsElements();
		this.pImplementationExtensions = new ImplementationExtensionsElements();
		this.pInterfaceExtensions = new InterfaceExtensionsElements();
		this.pConfigurationActuals = new ConfigurationActualsElements();
		this.pConfigurationActual = new ConfigurationActualElements();
		this.pWorkingset = new WorkingsetElements();
		this.pInstanceConfiguration = new InstanceConfigurationElements();
		this.pProductLineConstraint = new ProductLineConstraintElements();
		this.pEMSubclause = new EMSubclauseElements();
		this.pBASubclause = new BASubclauseElements();
		this.pBehaviorSpecificationBlock = new BehaviorSpecificationBlockElements();
		this.pBehaviorSpecificationElement = new BehaviorSpecificationElementElements();
		this.pEvent = new EventElements();
		this.pBehaviorRule = new BehaviorRuleElements();
		this.pAssignment = new AssignmentElements();
		this.pCurrentState = new CurrentStateElements();
		this.pStateTransitionRule = new StateTransitionRuleElements();
		this.pStatelessRule = new StatelessRuleElements();
		this.pContainsToken = new ContainsTokenElements();
		this.pFeatureInput = new FeatureInputElements();
		this.pLiteral = new LiteralElements();
		this.pPackageElementReference = new PackageElementReferenceElements();
		this.pPropertyReference = new PropertyReferenceElements();
		this.pIntegerLiteral = new IntegerLiteralElements();
		this.pRealLiteral = new RealLiteralElements();
		this.tDOUBLE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.DOUBLE");
		this.pStringLiteral = new StringLiteralElements();
		this.pEnumerationLiteral = new EnumerationLiteralElements();
		this.pNoQuoteString = new NoQuoteStringElements();
		this.pBooleanLiteral = new BooleanLiteralElements();
		this.pListLiteral = new ListLiteralElements();
		this.pDirectionalLiteral = new DirectionalLiteralElements();
		this.pMultiLiteralOperation = new MultiLiteralOperationElements();
		this.pQualifiedNameWithWildcard = new QualifiedNameWithWildcardElements();
		this.pDottedName = new DottedNameElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pQualifiedTypesReference = new QualifiedTypesReferenceElements();
		this.pQualifiedReference = new QualifiedReferenceElements();
		this.pQualifiedDottedReference = new QualifiedDottedReferenceElements();
		this.pComponentCategory = new ComponentCategoryElements();
		this.pFeatureCategory = new FeatureCategoryElements();
		this.pFeatureDirection = new FeatureDirectionElements();
		this.pPropagationDirection = new PropagationDirectionElements();
		this.pComposite = new CompositeElements();
		this.pPrimitive = new PrimitiveElements();
		this.pEOperation = new EOperationElements();
		this.pCOperation = new COperationElements();
		this.pSatisfiesOperation = new SatisfiesOperationElements();
		this.pInOperation = new InOperationElements();
		this.pInputOperation = new InputOperationElements();
		this.pAssociationType = new AssociationTypeElements();
		this.pIsConnection = new IsConnectionElements();
		this.pIsBinding = new IsBindingElements();
		this.pIsFlowSource = new IsFlowSourceElements();
		this.pIsFlowSink = new IsFlowSinkElements();
		this.pIsFlow = new IsFlowElements();
		this.pVirtualProcessorKeywords = new VirtualProcessorKeywordsElements();
		this.pVirtualBusKeywords = new VirtualBusKeywordsElements();
		this.pVirtualMemoryKeywords = new VirtualMemoryKeywordsElements();
		this.pVirtualDeviceKeywords = new VirtualDeviceKeywordsElements();
		this.pThreadGroupKeywords = new ThreadGroupKeywordsElements();
		this.pSubprogramGroupKeywords = new SubprogramGroupKeywordsElements();
		this.pFlowSourceKeywords = new FlowSourceKeywordsElements();
		this.pFlowSinkKeywords = new FlowSinkKeywordsElements();
		this.pInOutKeywords = new InOutKeywordsElements();
		this.pBusAccessKeywords = new BusAccessKeywordsElements();
		this.pVirtualBusAccessKeywords = new VirtualBusAccessKeywordsElements();
		this.pDataAccessKeywords = new DataAccessKeywordsElements();
		this.pSubprogramAccessKeywords = new SubprogramAccessKeywordsElements();
		this.pSubprogramGroupAccessKeywords = new SubprogramGroupAccessKeywordsElements();
		this.pProvidesReadKeywords = new ProvidesReadKeywordsElements();
		this.pRequiresReadKeywords = new RequiresReadKeywordsElements();
		this.pProvidesWriteKeywords = new ProvidesWriteKeywordsElements();
		this.pRequiresWriteKeywords = new RequiresWriteKeywordsElements();
		this.pProvidesRWKeywords = new ProvidesRWKeywordsElements();
		this.pRequiresRWKeywords = new RequiresRWKeywordsElements();
		this.tANNEXTEXT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ANNEXTEXT");
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
	//	private?='private'? 'package' name=QualifiedName 'is' (elements+=AnnexLibrary | (imports+=Import |
	//	elements+=PackageElement)*) 'end' ';';
	public PackageDeclarationElements getPackageDeclarationAccess() {
		return pPackageDeclaration;
	}
	
	public ParserRule getPackageDeclarationRule() {
		return getPackageDeclarationAccess().getRule();
	}
	
	//AnnexLibrary av3::AnnexLibrary:
	//	'@' name=ID '{' '}';
	public AnnexLibraryElements getAnnexLibraryAccess() {
		return pAnnexLibrary;
	}
	
	public ParserRule getAnnexLibraryRule() {
		return getAnnexLibraryAccess().getRule();
	}
	
	//PackageElement av3::PackageElement:
	//	PackageDeclaration | ComponentInterface | ComponentImplementation | ComponentConfiguration | PropertyDefinition |
	//	PropertySet | Workingset | TypeDef | ConstantDef;
	public PackageElementElements getPackageElementAccess() {
		return pPackageElement;
	}
	
	public ParserRule getPackageElementRule() {
		return getPackageElementAccess().getRule();
	}
	
	//PropertyDefinition av3::PropertyDefinition:
	//	private?='private'? 'property' name=ID ':' type=Type ('for' '(' (forAll?='all' | AppliesTo (',' AppliesTo)*) ')')?
	//	';';
	public PropertyDefinitionElements getPropertyDefinitionAccess() {
		return pPropertyDefinition;
	}
	
	public ParserRule getPropertyDefinitionRule() {
		return getPropertyDefinitionAccess().getRule();
	}
	
	//fragment AppliesTo *:
	//	componentCategories+=ComponentCategory | featureCategories+=FeatureCategory | associationTypes+=AssociationType;
	public AppliesToElements getAppliesToAccess() {
		return pAppliesTo;
	}
	
	public ParserRule getAppliesToRule() {
		return getAppliesToAccess().getRule();
	}
	
	//PropertySet av3::PropertySet:
	//	private?='private'? 'properties' name=ID ':' '{' properties+=[av3::PropertyDefinition|QualifiedReference] (','
	//	properties+=[av3::PropertyDefinition|QualifiedName])* '}' ';';
	public PropertySetElements getPropertySetAccess() {
		return pPropertySet;
	}
	
	public ParserRule getPropertySetRule() {
		return getPropertySetAccess().getRule();
	}
	
	//TypeDef av3::TypeDef:
	//	private?='private'? 'type' name=ID ('extends' superType=Type)? (':' baseType=Type)? PropertiesBlock? ';';
	public TypeDefElements getTypeDefAccess() {
		return pTypeDef;
	}
	
	public ParserRule getTypeDefRule() {
		return getTypeDefAccess().getRule();
	}
	
	//ConstantDef av3::Constant:
	//	private?='private'? 'constant' name=ID ':' value=Literal ';';
	public ConstantDefElements getConstantDefAccess() {
		return pConstantDef;
	}
	
	public ParserRule getConstantDefRule() {
		return getConstantDefAccess().getRule();
	}
	
	//PropertyAssociation av3::PropertyAssociation:
	//	target=ModelElementReference? '#' property=[av3::PropertyDefinition|QualifiedName]
	//	propertyAssociationType=PropertyAssociationType value=Literal ';';
	public PropertyAssociationElements getPropertyAssociationAccess() {
		return pPropertyAssociation;
	}
	
	public ParserRule getPropertyAssociationRule() {
		return getPropertyAssociationAccess().getRule();
	}
	
	//PropertyAssociationType av3::PropertyAssociationType:
	//	'=>' | '=' | '*=>';
	public PropertyAssociationTypeElements getPropertyAssociationTypeAccess() {
		return pPropertyAssociationType;
	}
	
	public ParserRule getPropertyAssociationTypeRule() {
		return getPropertyAssociationTypeAccess().getRule();
	}
	
	//ModelElementReference av3::ModelElementReference:
	//	element=[av3::ModelElement] -> ({av3::ModelElementReference.context=current} '.' element=[av3::ModelElement])*;
	public ModelElementReferenceElements getModelElementReferenceAccess() {
		return pModelElementReference;
	}
	
	public ParserRule getModelElementReferenceRule() {
		return getModelElementReferenceAccess().getRule();
	}
	
	//ComponentInterface av3::ComponentInterface:
	//	private?='private'? category=ComponentCategory? 'interface' name=ID ('extends' InterfaceExtensions)? InterfaceBody
	//	';';
	public ComponentInterfaceElements getComponentInterfaceAccess() {
		return pComponentInterface;
	}
	
	public ParserRule getComponentInterfaceRule() {
		return getComponentInterfaceAccess().getRule();
	}
	
	//fragment InterfaceBody *:
	//	'is' InterfaceElement* 'end';
	public InterfaceBodyElements getInterfaceBodyAccess() {
		return pInterfaceBody;
	}
	
	public ParserRule getInterfaceBodyRule() {
		return getInterfaceBodyAccess().getRule();
	}
	
	//fragment InterfaceElement *:
	//	features+=Feature | flows+=FlowPath | flows+=FlowSource | flows+=FlowSink |
	//	ownedPropertyAssociations+=PropertyAssociation | annexSubclause+=AnnexSubclause;
	public InterfaceElementElements getInterfaceElementAccess() {
		return pInterfaceElement;
	}
	
	public ParserRule getInterfaceElementRule() {
		return getInterfaceElementAccess().getRule();
	}
	
	//ComponentImplementation av3::ComponentImplementation:
	//	private?='private'? category=ComponentCategory name=DottedName ('extends' ImplementationExtensions)?
	//	ImplementationBody ';';
	public ComponentImplementationElements getComponentImplementationAccess() {
		return pComponentImplementation;
	}
	
	public ParserRule getComponentImplementationRule() {
		return getComponentImplementationAccess().getRule();
	}
	
	//fragment ImplementationBody *:
	//	'is' ImplementationElement* 'end';
	public ImplementationBodyElements getImplementationBodyAccess() {
		return pImplementationBody;
	}
	
	public ParserRule getImplementationBodyRule() {
		return getImplementationBodyAccess().getRule();
	}
	
	//fragment ImplementationElement *:
	//	connections+=Connection | bindings+=Binding | components+=Subcomponent | paths+=Path |
	//	flowAssignments+=FlowAssignment | classifierAssignments+=ClassifierAssignment |
	//	classifierAssignments+=ClassifierAssignmentPattern | ownedPropertyAssociations+=PropertyAssociation |
	//	annexSubclause+=AnnexSubclause;
	public ImplementationElementElements getImplementationElementAccess() {
		return pImplementationElement;
	}
	
	public ParserRule getImplementationElementRule() {
		return getImplementationElementAccess().getRule();
	}
	
	//ComponentConfiguration av3::ComponentConfiguration:
	//	private?='private'? 'configuration' name=DottedName Parameters? ('extends' ConfigurationExtensions)?
	//	ConfigurationElementBlock ';';
	public ComponentConfigurationElements getComponentConfigurationAccess() {
		return pComponentConfiguration;
	}
	
	public ParserRule getComponentConfigurationRule() {
		return getComponentConfigurationAccess().getRule();
	}
	
	//// (Instance) model elements
	// Feature av3::Feature:
	//	name=ID ':' direction=FeatureDirection? category=FeatureCategory typeReference=ReversableTypeReference?
	//	PropertiesBlock? ';';
	public FeatureElements getFeatureAccess() {
		return pFeature;
	}
	
	public ParserRule getFeatureRule() {
		return getFeatureAccess().getRule();
	}
	
	//Subcomponent av3::Subcomponent:
	//	{av3::Subcomponent} name=ID ':' category=ComponentCategory typeReferences+=ClassifierOrTypeReference
	//	//(',' typeReferences+=TypeReference?)* 
	//? NestedComponentImplementationBlock? ';';
	public SubcomponentElements getSubcomponentAccess() {
		return pSubcomponent;
	}
	
	public ParserRule getSubcomponentRule() {
		return getSubcomponentAccess().getRule();
	}
	
	//Connection av3::Association:
	//	name=ID ':' associationType=IsConnection source=ModelElementReference ('->' | bidirectional?='<->')
	//	destination=ModelElementReference PropertiesBlock? ';';
	public ConnectionElements getConnectionAccess() {
		return pConnection;
	}
	
	public ParserRule getConnectionRule() {
		return getConnectionAccess().getRule();
	}
	
	//Binding av3::Association:
	//	name=ID ':' bindingType=[av3::TypeDef|QualifiedName]? associationType=IsBinding source=ModelElementReference '->'
	//	destination=ModelElementReference PropertiesBlock? ';';
	public BindingElements getBindingAccess() {
		return pBinding;
	}
	
	public ParserRule getBindingRule() {
		return getBindingAccess().getRule();
	}
	
	//FlowPath av3::Association:
	//	name=ID ':' associationType=IsFlow source=ModelElementReference '->' destination=ModelElementReference
	//	PropertiesBlock? ';';
	public FlowPathElements getFlowPathAccess() {
		return pFlowPath;
	}
	
	public ParserRule getFlowPathRule() {
		return getFlowPathAccess().getRule();
	}
	
	//FlowSource av3::Association:
	//	name=ID ':' associationType=IsFlowSource destination=ModelElementReference PropertiesBlock? ';';
	public FlowSourceElements getFlowSourceAccess() {
		return pFlowSource;
	}
	
	public ParserRule getFlowSourceRule() {
		return getFlowSourceAccess().getRule();
	}
	
	//FlowSink av3::Association:
	//	name=ID ':' associationType=IsFlowSink source=ModelElementReference PropertiesBlock? ';';
	public FlowSinkElements getFlowSinkAccess() {
		return pFlowSink;
	}
	
	public ParserRule getFlowSinkRule() {
		return getFlowSinkAccess().getRule();
	}
	
	//fragment UseProps *:
	//	'use' 'properties' useProperties+=[av3::PropertySet|QualifiedName] (','
	//	useProperties+=[av3::PropertySet|QualifiedName])* ';';
	public UsePropsElements getUsePropsAccess() {
		return pUseProps;
	}
	
	public ParserRule getUsePropsRule() {
		return getUsePropsAccess().getRule();
	}
	
	//Path av3::PathSequence:
	//	name=ID ':' 'flow' elements+=PathElement ('->' elements+=PathElement)+ PropertiesBlock? ';';
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
	//	'import' (importedNamespace=QualifiedNameWithWildcard | importedNamespace=QualifiedName) ('as' alias=ID)? ';';
	public ImportElements getImportAccess() {
		return pImport;
	}
	
	public ParserRule getImportRule() {
		return getImportAccess().getRule();
	}
	
	//ClassifierAssignment av3::ClassifierAssignment:
	//	target=ModelElementReference '=>' (assignedClassifiers+=ClassifierOrTypeReference (','
	//	assignedClassifiers+=ClassifierOrTypeReference)* CurlyConfigurationElementBlock? | CurlyConfigurationElementBlock)
	//	';';
	public ClassifierAssignmentElements getClassifierAssignmentAccess() {
		return pClassifierAssignment;
	}
	
	public ParserRule getClassifierAssignmentRule() {
		return getClassifierAssignmentAccess().getRule();
	}
	
	//ClassifierAssignmentPattern av3::ClassifierAssignmentPattern:
	//	QueryExpression '=>' (assignedClassifiers+=ClassifierOrTypeReference (','
	//	assignedClassifiers+=ClassifierOrTypeReference)* CurlyConfigurationElementBlock? | CurlyConfigurationElementBlock)
	//	';';
	public ClassifierAssignmentPatternElements getClassifierAssignmentPatternAccess() {
		return pClassifierAssignmentPattern;
	}
	
	public ParserRule getClassifierAssignmentPatternRule() {
		return getClassifierAssignmentPatternAccess().getRule();
	}
	
	//fragment QueryExpression *:
	//	'all' '(' targetPattern=[av3::Type|QualifiedTypesReference] ')';
	public QueryExpressionElements getQueryExpressionAccess() {
		return pQueryExpression;
	}
	
	public ParserRule getQueryExpressionRule() {
		return getQueryExpressionAccess().getRule();
	}
	
	//FlowAssignment av3::PathSequence:
	//	target=ModelElementReference '=>' 'flow' elements+=PathElement ('->' elements+=PathElement)* ';';
	public FlowAssignmentElements getFlowAssignmentAccess() {
		return pFlowAssignment;
	}
	
	public ParserRule getFlowAssignmentRule() {
		return getFlowAssignmentAccess().getRule();
	}
	
	//fragment ConfigurationElementBlock *:
	//	'is' ConfigurationElement* 'end';
	public ConfigurationElementBlockElements getConfigurationElementBlockAccess() {
		return pConfigurationElementBlock;
	}
	
	public ParserRule getConfigurationElementBlockRule() {
		return getConfigurationElementBlockAccess().getRule();
	}
	
	//fragment CurlyConfigurationElementBlock *:
	//	'{' ConfigurationElement+ '}';
	public CurlyConfigurationElementBlockElements getCurlyConfigurationElementBlockAccess() {
		return pCurlyConfigurationElementBlock;
	}
	
	public ParserRule getCurlyConfigurationElementBlockRule() {
		return getCurlyConfigurationElementBlockAccess().getRule();
	}
	
	//fragment ConfigurationElement *:
	//	ownedPropertyAssociations+=PropertyAssociation | bindings+=Binding | classifierAssignments+=ClassifierAssignment |
	//	classifierAssignments+=ClassifierAssignmentPattern | annexSubclause+=AnnexSubclause;
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
	// ReversableInterfaceReference
	//av3::TypeReference:
	//	reverse?='reverse'? type=[av3::ComponentInterface|QualifiedReference];
	public ReversableInterfaceReferenceElements getReversableInterfaceReferenceAccess() {
		return pReversableInterfaceReference;
	}
	
	public ParserRule getReversableInterfaceReferenceRule() {
		return getReversableInterfaceReferenceAccess().getRule();
	}
	
	//ReversableTypeReference av3::TypeReference:
	//	reverse?='reverse'? type=[av3::NamedType|QualifiedReference];
	public ReversableTypeReferenceElements getReversableTypeReferenceAccess() {
		return pReversableTypeReference;
	}
	
	public ParserRule getReversableTypeReferenceRule() {
		return getReversableTypeReferenceAccess().getRule();
	}
	
	//ClassifierOrTypeReference av3::TypeReference:
	//	type=[av3::NamedType|QualifiedTypesReference] ConfigurationActuals?;
	public ClassifierOrTypeReferenceElements getClassifierOrTypeReferenceAccess() {
		return pClassifierOrTypeReference;
	}
	
	public ParserRule getClassifierOrTypeReferenceRule() {
		return getClassifierOrTypeReferenceAccess().getRule();
	}
	
	//TypeReference av3::TypeReference:
	//	type=[av3::NamedType|QualifiedName];
	public TypeReferenceElements getTypeReferenceAccess() {
		return pTypeReference;
	}
	
	public ParserRule getTypeReferenceRule() {
		return getTypeReferenceAccess().getRule();
	}
	
	//Type av3::Type:
	//	TypeReference | CompositeType | PrimitiveType | EnumerationType;
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}
	
	//EnumerationType av3::EnumerationType:
	//	{av3::EnumerationType} 'enum' '(' literals+=EnumerationLiteral* ')';
	public EnumerationTypeElements getEnumerationTypeAccess() {
		return pEnumerationType;
	}
	
	public ParserRule getEnumerationTypeRule() {
		return getEnumerationTypeAccess().getRule();
	}
	
	//CompositeType av3::CompositeType:
	//	compositeType=Composite 'of' type=TypeReference;
	public CompositeTypeElements getCompositeTypeAccess() {
		return pCompositeType;
	}
	
	public ParserRule getCompositeTypeRule() {
		return getCompositeTypeAccess().getRule();
	}
	
	//PrimitiveType av3::PrimitiveType:
	//	primitiveType=Primitive;
	public PrimitiveTypeElements getPrimitiveTypeAccess() {
		return pPrimitiveType;
	}
	
	public ParserRule getPrimitiveTypeRule() {
		return getPrimitiveTypeAccess().getRule();
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
	
	//AnnexSubclause av3::AnnexSubclause:
	//	EMSubclause | BASubclause | DefaultAnnexSubclause;
	public AnnexSubclauseElements getAnnexSubclauseAccess() {
		return pAnnexSubclause;
	}
	
	public ParserRule getAnnexSubclauseRule() {
		return getAnnexSubclauseAccess().getRule();
	}
	
	//DefaultAnnexSubclause av3::DefaultAnnexSubclause:
	//	'@' name=ID body=ANNEXTEXT ';';
	public DefaultAnnexSubclauseElements getDefaultAnnexSubclauseAccess() {
		return pDefaultAnnexSubclause;
	}
	
	public ParserRule getDefaultAnnexSubclauseRule() {
		return getDefaultAnnexSubclauseAccess().getRule();
	}
	
	//fragment PropertiesBlock *:
	//	'{' ownedPropertyAssociations+=PropertyAssociation+ '}';
	public PropertiesBlockElements getPropertiesBlockAccess() {
		return pPropertiesBlock;
	}
	
	public ParserRule getPropertiesBlockRule() {
		return getPropertiesBlockAccess().getRule();
	}
	
	//// to be used for inline nested component implementations 
	// fragment NestedComponentImplementationBlock *:
	//	'{' NestedImplementationElement+ '}';
	public NestedComponentImplementationBlockElements getNestedComponentImplementationBlockAccess() {
		return pNestedComponentImplementationBlock;
	}
	
	public ParserRule getNestedComponentImplementationBlockRule() {
		return getNestedComponentImplementationBlockAccess().getRule();
	}
	
	//fragment NestedImplementationElement *:
	//	features+=Feature | connections+=Connection | bindings+=Binding | components+=Subcomponent |
	//	ownedPropertyAssociations+=PropertyAssociation;
	public NestedImplementationElementElements getNestedImplementationElementAccess() {
		return pNestedImplementationElement;
	}
	
	public ParserRule getNestedImplementationElementRule() {
		return getNestedImplementationElementAccess().getRule();
	}
	
	//fragment ConfigurationExtensions *:
	//	superClassifiers+=ClassifierOrTypeReference ("," superClassifiers+=ClassifierOrTypeReference)*;
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
	//	parameter=[av3::ConfigurationParameter] '=>' assignedClassifiers+=ClassifierOrTypeReference (','
	//	assignedClassifiers+=ClassifierOrTypeReference)*;
	public ConfigurationActualElements getConfigurationActualAccess() {
		return pConfigurationActual;
	}
	
	public ParserRule getConfigurationActualRule() {
		return getConfigurationActualAccess().getRule();
	}
	
	//Workingset av3::Workingset:
	//	private?='private'? 'workingset' name=QualifiedName 'is' UseProps? instanceRoots+=InstanceConfiguration* 'end' ';';
	public WorkingsetElements getWorkingsetAccess() {
		return pWorkingset;
	}
	
	public ParserRule getWorkingsetRule() {
		return getWorkingsetAccess().getRule();
	}
	
	//InstanceConfiguration av3::InstanceConfiguration:
	//	{av3::InstanceConfiguration} name=ID ':' category=ComponentCategory typeReferences+=ClassifierOrTypeReference
	//	productlineConstraint=ProductLineConstraint? ';';
	public InstanceConfigurationElements getInstanceConfigurationAccess() {
		return pInstanceConfiguration;
	}
	
	public ParserRule getInstanceConfigurationRule() {
		return getInstanceConfigurationAccess().getRule();
	}
	
	//ProductLineConstraint av3::ConditionOperation:
	//	{av3::ConditionOperation} element=PropertyReference operator=SatisfiesOperation constraint=ListLiteral;
	public ProductLineConstraintElements getProductLineConstraintAccess() {
		return pProductLineConstraint;
	}
	
	public ParserRule getProductLineConstraintRule() {
		return getProductLineConstraintAccess().getRule();
	}
	
	//// Behavior specification including error behavior
	// EMSubclause av3::EMSubclause:
	//	'@' name='EM' '{' BehaviorSpecificationBlock '}' ';';
	public EMSubclauseElements getEMSubclauseAccess() {
		return pEMSubclause;
	}
	
	public ParserRule getEMSubclauseRule() {
		return getEMSubclauseAccess().getRule();
	}
	
	//BASubclause av3::BASubclause:
	//	'@' name='BA' '{' BehaviorSpecificationBlock '}' ';';
	public BASubclauseElements getBASubclauseAccess() {
		return pBASubclause;
	}
	
	public ParserRule getBASubclauseRule() {
		return getBASubclauseAccess().getRule();
	}
	
	//fragment BehaviorSpecificationBlock *:
	//	('use' 'states' states=[av3::TypeDef|QualifiedName] ';')? BehaviorSpecificationElement*;
	public BehaviorSpecificationBlockElements getBehaviorSpecificationBlockAccess() {
		return pBehaviorSpecificationBlock;
	}
	
	public ParserRule getBehaviorSpecificationBlockRule() {
		return getBehaviorSpecificationBlockAccess().getRule();
	}
	
	//fragment BehaviorSpecificationElement *:
	//	generators+=Event | rules+=BehaviorRule;
	public BehaviorSpecificationElementElements getBehaviorSpecificationElementAccess() {
		return pBehaviorSpecificationElement;
	}
	
	public ParserRule getBehaviorSpecificationElementRule() {
		return getBehaviorSpecificationElementAccess().getRule();
	}
	
	//Event av3::Generator:
	//	name=ID ':' type=('error' | 'recover' | 'repair') 'event' value=Literal? ';';
	public EventElements getEventAccess() {
		return pEvent;
	}
	
	public ParserRule getEventRule() {
		return getEventAccess().getRule();
	}
	
	//BehaviorRule av3::BehaviorRule:
	//	name=ID ':' (StateTransitionRule | StatelessRule);
	public BehaviorRuleElements getBehaviorRuleAccess() {
		return pBehaviorRule;
	}
	
	public ParserRule getBehaviorRuleRule() {
		return getBehaviorRuleAccess().getRule();
	}
	
	//Assignment av3::Assignment:
	//	target=ModelElementReference ('(' value=TypeReference ')')?;
	public AssignmentElements getAssignmentAccess() {
		return pAssignment;
	}
	
	public ParserRule getAssignmentRule() {
		return getAssignmentAccess().getRule();
	}
	
	//CurrentState av3::StateSpecification:
	//	currentState=EnumerationLiteral;
	public CurrentStateElements getCurrentStateAccess() {
		return pCurrentState;
	}
	
	public ParserRule getCurrentStateRule() {
		return getCurrentStateAccess().getRule();
	}
	
	//fragment StateTransitionRule *:
	//	currentState=CurrentState '-[' condition=(MultiLiteralOperation | ContainsToken | ModelElementReference) ']->'
	//	targetState=CurrentState ('{' actions+=Assignment* '}')? ';';
	public StateTransitionRuleElements getStateTransitionRuleAccess() {
		return pStateTransitionRule;
	}
	
	public ParserRule getStateTransitionRuleRule() {
		return getStateTransitionRuleAccess().getRule();
	}
	
	//fragment StatelessRule *:
	//	condition=(MultiLiteralOperation | ContainsToken | ModelElementReference)? '->' actions+=Assignment* ';';
	public StatelessRuleElements getStatelessRuleAccess() {
		return pStatelessRule;
	}
	
	public ParserRule getStatelessRuleRule() {
		return getStatelessRuleAccess().getRule();
	}
	
	//ContainsToken av3::ConditionOperation:
	//	element=ModelElementReference operator=InOperation constraint=Literal;
	public ContainsTokenElements getContainsTokenAccess() {
		return pContainsToken;
	}
	
	public ParserRule getContainsTokenRule() {
		return getContainsTokenAccess().getRule();
	}
	
	//FeatureInput av3::ConditionOperation:
	//	element=ModelElementReference operator=InputOperation;
	public FeatureInputElements getFeatureInputAccess() {
		return pFeatureInput;
	}
	
	public ParserRule getFeatureInputRule() {
		return getFeatureInputAccess().getRule();
	}
	
	//// expression/constraint language
	// Literal av3::Literal:
	//	IntegerLiteral | RealLiteral | StringLiteral | BooleanLiteral | PropertyReference | TypeReference |
	//	DirectionalLiteral | ListLiteral | MultiLiteralOperation | ContainsToken | EnumerationLiteral | ModelElementReference
	//	//| FeatureInput
	//;
	public LiteralElements getLiteralAccess() {
		return pLiteral;
	}
	
	public ParserRule getLiteralRule() {
		return getLiteralAccess().getRule();
	}
	
	//PackageElementReference av3::PackageElementReference:
	//	element=[av3::PackageElement|QualifiedName];
	public PackageElementReferenceElements getPackageElementReferenceAccess() {
		return pPackageElementReference;
	}
	
	public ParserRule getPackageElementReferenceRule() {
		return getPackageElementReferenceAccess().getRule();
	}
	
	//PropertyReference av3::PackageElementReference:
	//	'#' element=[av3::PackageElement|QualifiedName];
	public PropertyReferenceElements getPropertyReferenceAccess() {
		return pPropertyReference;
	}
	
	public ParserRule getPropertyReferenceRule() {
		return getPropertyReferenceAccess().getRule();
	}
	
	//IntegerLiteral av3::Literal:
	//	{av3::IntegerLiteral} value=INT unit=ID?;
	public IntegerLiteralElements getIntegerLiteralAccess() {
		return pIntegerLiteral;
	}
	
	public ParserRule getIntegerLiteralRule() {
		return getIntegerLiteralAccess().getRule();
	}
	
	//RealLiteral av3::Literal:
	//	{av3::RealLiteral} value=DOUBLE unit=ID?;
	public RealLiteralElements getRealLiteralAccess() {
		return pRealLiteral;
	}
	
	public ParserRule getRealLiteralRule() {
		return getRealLiteralAccess().getRule();
	}
	
	//terminal DOUBLE returns ecore::EDouble:
	//	'0'..'9'+ '.' '0'..'9'+;
	public TerminalRule getDOUBLERule() {
		return tDOUBLE;
	}
	
	//StringLiteral av3::Literal:
	//	{av3::StringLiteral} value=NoQuoteString;
	public StringLiteralElements getStringLiteralAccess() {
		return pStringLiteral;
	}
	
	public ParserRule getStringLiteralRule() {
		return getStringLiteralAccess().getRule();
	}
	
	//EnumerationLiteral av3::EnumerationLiteral:
	//	{av3::EnumerationLiteral} value=ID;
	public EnumerationLiteralElements getEnumerationLiteralAccess() {
		return pEnumerationLiteral;
	}
	
	public ParserRule getEnumerationLiteralRule() {
		return getEnumerationLiteralAccess().getRule();
	}
	
	//NoQuoteString:
	//	STRING;
	public NoQuoteStringElements getNoQuoteStringAccess() {
		return pNoQuoteString;
	}
	
	public ParserRule getNoQuoteStringRule() {
		return getNoQuoteStringAccess().getRule();
	}
	
	//BooleanLiteral av3::Literal:
	//	{av3::BooleanLiteral} (value?='true' | 'false');
	public BooleanLiteralElements getBooleanLiteralAccess() {
		return pBooleanLiteral;
	}
	
	public ParserRule getBooleanLiteralRule() {
		return getBooleanLiteralAccess().getRule();
	}
	
	//ListLiteral av3::ListLiteral:
	//	{av3::ListLiteral} '(' (elements+=Literal (',' elements+=Literal)*)? ')';
	public ListLiteralElements getListLiteralAccess() {
		return pListLiteral;
	}
	
	public ParserRule getListLiteralRule() {
		return getListLiteralAccess().getRule();
	}
	
	//DirectionalLiteral av3::DirectionalLiteral:
	//	{av3::DirectionalLiteral} direction=PropagationDirection value=Literal;
	public DirectionalLiteralElements getDirectionalLiteralAccess() {
		return pDirectionalLiteral;
	}
	
	public ParserRule getDirectionalLiteralRule() {
		return getDirectionalLiteralAccess().getRule();
	}
	
	//MultiLiteralOperation av3::MultiLiteralConstraint:
	//	{av3::MultiLiteralConstraint} operator=EOperation '(' (elements+=Literal (',' elements+=Literal)*)? ')';
	public MultiLiteralOperationElements getMultiLiteralOperationAccess() {
		return pMultiLiteralOperation;
	}
	
	public ParserRule getMultiLiteralOperationRule() {
		return getMultiLiteralOperationAccess().getRule();
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
	
	//ComponentCategory av3::ComponentCategory:
	//	'abstract' | 'bus' | 'data' | 'device' | 'memory' | 'process' | 'processor' | 'system' | 'thread' |
	//	VirtualBusKeywords | VirtualProcessorKeywords | VirtualMemoryKeywords | VirtualDeviceKeywords | 'subprogram' |
	//	SubprogramGroupKeywords | ThreadGroupKeywords;
	public ComponentCategoryElements getComponentCategoryAccess() {
		return pComponentCategory;
	}
	
	public ParserRule getComponentCategoryRule() {
		return getComponentCategoryAccess().getRule();
	}
	
	//FeatureCategory av3::FeatureCategory:
	//	'feature' | 'port' | 'parameter' | DataAccessKeywords | BusAccessKeywords | VirtualBusAccessKeywords |
	//	SubprogramAccessKeywords | SubprogramGroupAccessKeywords | 'binding' | 'interface';
	public FeatureCategoryElements getFeatureCategoryAccess() {
		return pFeatureCategory;
	}
	
	public ParserRule getFeatureCategoryRule() {
		return getFeatureCategoryAccess().getRule();
	}
	
	//FeatureDirection av3::FeatureDirection:
	//	'in' | 'out' | InOutKeywords | 'requires' | 'provides' | ProvidesReadKeywords | RequiresReadKeywords |
	//	ProvidesWriteKeywords | RequiresWriteKeywords | ProvidesRWKeywords | RequiresRWKeywords;
	public FeatureDirectionElements getFeatureDirectionAccess() {
		return pFeatureDirection;
	}
	
	public ParserRule getFeatureDirectionRule() {
		return getFeatureDirectionAccess().getRule();
	}
	
	//PropagationDirection av3::FeatureDirection:
	//	'in' | 'out';
	public PropagationDirectionElements getPropagationDirectionAccess() {
		return pPropagationDirection;
	}
	
	public ParserRule getPropagationDirectionRule() {
		return getPropagationDirectionAccess().getRule();
	}
	
	//Composite av3::Composite:
	//	'list' | 'set';
	public CompositeElements getCompositeAccess() {
		return pComposite;
	}
	
	public ParserRule getCompositeRule() {
		return getCompositeAccess().getRule();
	}
	
	//Primitive av3::Primitive:
	//	'boolean' | 'integer' | 'real' | 'string';
	public PrimitiveElements getPrimitiveAccess() {
		return pPrimitive;
	}
	
	public ParserRule getPrimitiveRule() {
		return getPrimitiveAccess().getRule();
	}
	
	//EOperation av3::EOperator:
	//	'any' | 'all' | 'oneof' | 'of' | 'ormore' | 'orless';
	public EOperationElements getEOperationAccess() {
		return pEOperation;
	}
	
	public ParserRule getEOperationRule() {
		return getEOperationAccess().getRule();
	}
	
	//COperation av3::COperator:
	//	'in' | 'contains' | 'equals' | 'satisfies' | '?';
	public COperationElements getCOperationAccess() {
		return pCOperation;
	}
	
	public ParserRule getCOperationRule() {
		return getCOperationAccess().getRule();
	}
	
	//SatisfiesOperation av3::COperator:
	//	'satisfies';
	public SatisfiesOperationElements getSatisfiesOperationAccess() {
		return pSatisfiesOperation;
	}
	
	public ParserRule getSatisfiesOperationRule() {
		return getSatisfiesOperationAccess().getRule();
	}
	
	//InOperation av3::COperator:
	//	'in';
	public InOperationElements getInOperationAccess() {
		return pInOperation;
	}
	
	public ParserRule getInOperationRule() {
		return getInOperationAccess().getRule();
	}
	
	//InputOperation av3::COperator:
	//	'?';
	public InputOperationElements getInputOperationAccess() {
		return pInputOperation;
	}
	
	public ParserRule getInputOperationRule() {
		return getInputOperationAccess().getRule();
	}
	
	//AssociationType av3::AssociationType:
	//	IsConnection | IsBinding | IsFlow;
	public AssociationTypeElements getAssociationTypeAccess() {
		return pAssociationType;
	}
	
	public ParserRule getAssociationTypeRule() {
		return getAssociationTypeAccess().getRule();
	}
	
	//IsConnection av3::AssociationType:
	//	'connection';
	public IsConnectionElements getIsConnectionAccess() {
		return pIsConnection;
	}
	
	public ParserRule getIsConnectionRule() {
		return getIsConnectionAccess().getRule();
	}
	
	//IsBinding av3::AssociationType:
	//	'binding';
	public IsBindingElements getIsBindingAccess() {
		return pIsBinding;
	}
	
	public ParserRule getIsBindingRule() {
		return getIsBindingAccess().getRule();
	}
	
	//IsFlowSource av3::AssociationType:
	//	FlowSourceKeywords;
	public IsFlowSourceElements getIsFlowSourceAccess() {
		return pIsFlowSource;
	}
	
	public ParserRule getIsFlowSourceRule() {
		return getIsFlowSourceAccess().getRule();
	}
	
	//IsFlowSink av3::AssociationType:
	//	FlowSinkKeywords;
	public IsFlowSinkElements getIsFlowSinkAccess() {
		return pIsFlowSink;
	}
	
	public ParserRule getIsFlowSinkRule() {
		return getIsFlowSinkAccess().getRule();
	}
	
	//IsFlow av3::AssociationType:
	//	'flow';
	public IsFlowElements getIsFlowAccess() {
		return pIsFlow;
	}
	
	public ParserRule getIsFlowRule() {
		return getIsFlowAccess().getRule();
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
	
	////FlowPathKeywords: 'flow';
	// InOutKeywords:
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
	
	//VirtualBusAccessKeywords:
	//	'virtual' 'bus' 'access';
	public VirtualBusAccessKeywordsElements getVirtualBusAccessKeywordsAccess() {
		return pVirtualBusAccessKeywords;
	}
	
	public ParserRule getVirtualBusAccessKeywordsRule() {
		return getVirtualBusAccessKeywordsAccess().getRule();
	}
	
	//DataAccessKeywords:
	//	'data' 'access';
	public DataAccessKeywordsElements getDataAccessKeywordsAccess() {
		return pDataAccessKeywords;
	}
	
	public ParserRule getDataAccessKeywordsRule() {
		return getDataAccessKeywordsAccess().getRule();
	}
	
	//SubprogramAccessKeywords:
	//	'subprogram' 'access';
	public SubprogramAccessKeywordsElements getSubprogramAccessKeywordsAccess() {
		return pSubprogramAccessKeywords;
	}
	
	public ParserRule getSubprogramAccessKeywordsRule() {
		return getSubprogramAccessKeywordsAccess().getRule();
	}
	
	//SubprogramGroupAccessKeywords:
	//	'subprogram' 'group' 'access';
	public SubprogramGroupAccessKeywordsElements getSubprogramGroupAccessKeywordsAccess() {
		return pSubprogramGroupAccessKeywords;
	}
	
	public ParserRule getSubprogramGroupAccessKeywordsRule() {
		return getSubprogramGroupAccessKeywordsAccess().getRule();
	}
	
	//ProvidesReadKeywords:
	//	'provides' 'in';
	public ProvidesReadKeywordsElements getProvidesReadKeywordsAccess() {
		return pProvidesReadKeywords;
	}
	
	public ParserRule getProvidesReadKeywordsRule() {
		return getProvidesReadKeywordsAccess().getRule();
	}
	
	//RequiresReadKeywords:
	//	'requires' 'in';
	public RequiresReadKeywordsElements getRequiresReadKeywordsAccess() {
		return pRequiresReadKeywords;
	}
	
	public ParserRule getRequiresReadKeywordsRule() {
		return getRequiresReadKeywordsAccess().getRule();
	}
	
	//ProvidesWriteKeywords:
	//	'provides' 'out';
	public ProvidesWriteKeywordsElements getProvidesWriteKeywordsAccess() {
		return pProvidesWriteKeywords;
	}
	
	public ParserRule getProvidesWriteKeywordsRule() {
		return getProvidesWriteKeywordsAccess().getRule();
	}
	
	//RequiresWriteKeywords:
	//	'requires' 'out';
	public RequiresWriteKeywordsElements getRequiresWriteKeywordsAccess() {
		return pRequiresWriteKeywords;
	}
	
	public ParserRule getRequiresWriteKeywordsRule() {
		return getRequiresWriteKeywordsAccess().getRule();
	}
	
	//ProvidesRWKeywords:
	//	'provides' 'in' 'out';
	public ProvidesRWKeywordsElements getProvidesRWKeywordsAccess() {
		return pProvidesRWKeywords;
	}
	
	public ParserRule getProvidesRWKeywordsRule() {
		return getProvidesRWKeywordsAccess().getRule();
	}
	
	//RequiresRWKeywords:
	//	'requires' 'in' 'out';
	public RequiresRWKeywordsElements getRequiresRWKeywordsAccess() {
		return pRequiresRWKeywords;
	}
	
	public ParserRule getRequiresRWKeywordsRule() {
		return getRequiresRWKeywordsAccess().getRule();
	}
	
	//terminal ANNEXTEXT:
	//	'{*'->'*}';
	public TerminalRule getANNEXTEXTRule() {
		return tANNEXTEXT;
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
