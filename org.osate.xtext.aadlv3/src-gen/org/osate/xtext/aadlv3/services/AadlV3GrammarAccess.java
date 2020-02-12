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
		private final Assignment cAnnotationsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAnnotationsAnnotationParserRuleCall_0_0 = (RuleCall)cAnnotationsAssignment_0.eContents().get(0);
		private final Assignment cPrivateAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cPrivatePrivateKeyword_1_0 = (Keyword)cPrivateAssignment_1.eContents().get(0);
		private final Keyword cPackageKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameQualifiedNameParserRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cIsKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Alternatives cAlternatives_5 = (Alternatives)cGroup.eContents().get(5);
		private final Assignment cElementsAssignment_5_0 = (Assignment)cAlternatives_5.eContents().get(0);
		private final RuleCall cElementsAnnexLibraryParserRuleCall_5_0_0 = (RuleCall)cElementsAssignment_5_0.eContents().get(0);
		private final Alternatives cAlternatives_5_1 = (Alternatives)cAlternatives_5.eContents().get(1);
		private final Assignment cImportsAssignment_5_1_0 = (Assignment)cAlternatives_5_1.eContents().get(0);
		private final RuleCall cImportsImportParserRuleCall_5_1_0_0 = (RuleCall)cImportsAssignment_5_1_0.eContents().get(0);
		private final Assignment cElementsAssignment_5_1_1 = (Assignment)cAlternatives_5_1.eContents().get(1);
		private final RuleCall cElementsPackageElementParserRuleCall_5_1_1_0 = (RuleCall)cElementsAssignment_5_1_1.eContents().get(0);
		private final Keyword cEndKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//PackageDeclaration av3::PackageDeclaration:
		//	annotations+=Annotation* private?='private'? 'package' name=QualifiedName 'is' (elements+=AnnexLibrary |
		//	(imports+=Import | elements+=PackageElement)*) 'end' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//annotations+=Annotation* private?='private'? 'package' name=QualifiedName 'is' (elements+=AnnexLibrary |
		//(imports+=Import | elements+=PackageElement)*) 'end' ';'
		public Group getGroup() { return cGroup; }
		
		//annotations+=Annotation*
		public Assignment getAnnotationsAssignment_0() { return cAnnotationsAssignment_0; }
		
		//Annotation
		public RuleCall getAnnotationsAnnotationParserRuleCall_0_0() { return cAnnotationsAnnotationParserRuleCall_0_0; }
		
		//private?='private'?
		public Assignment getPrivateAssignment_1() { return cPrivateAssignment_1; }
		
		//'private'
		public Keyword getPrivatePrivateKeyword_1_0() { return cPrivatePrivateKeyword_1_0; }
		
		//'package'
		public Keyword getPackageKeyword_2() { return cPackageKeyword_2; }
		
		//name=QualifiedName
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_3_0() { return cNameQualifiedNameParserRuleCall_3_0; }
		
		//'is'
		public Keyword getIsKeyword_4() { return cIsKeyword_4; }
		
		//(elements+=AnnexLibrary | (imports+=Import | elements+=PackageElement)*)
		public Alternatives getAlternatives_5() { return cAlternatives_5; }
		
		//elements+=AnnexLibrary
		public Assignment getElementsAssignment_5_0() { return cElementsAssignment_5_0; }
		
		//AnnexLibrary
		public RuleCall getElementsAnnexLibraryParserRuleCall_5_0_0() { return cElementsAnnexLibraryParserRuleCall_5_0_0; }
		
		//(imports+=Import | elements+=PackageElement)*
		public Alternatives getAlternatives_5_1() { return cAlternatives_5_1; }
		
		//imports+=Import
		public Assignment getImportsAssignment_5_1_0() { return cImportsAssignment_5_1_0; }
		
		//Import
		public RuleCall getImportsImportParserRuleCall_5_1_0_0() { return cImportsImportParserRuleCall_5_1_0_0; }
		
		//elements+=PackageElement
		public Assignment getElementsAssignment_5_1_1() { return cElementsAssignment_5_1_1; }
		
		//PackageElement
		public RuleCall getElementsPackageElementParserRuleCall_5_1_1_0() { return cElementsPackageElementParserRuleCall_5_1_1_0; }
		
		//'end'
		public Keyword getEndKeyword_6() { return cEndKeyword_6; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
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
		
		//PackageElement av3::PackageElement:
		//	PackageDeclaration | ComponentInterface | ComponentImplementation | ComponentConfiguration | PropertyDefinition |
		//	PropertySet | Workingset | TypeDef;
		@Override public ParserRule getRule() { return rule; }
		
		//PackageDeclaration | ComponentInterface | ComponentImplementation | ComponentConfiguration | PropertyDefinition |
		//PropertySet | Workingset | TypeDef
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
	}
	public class PropertyDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.PropertyDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAnnotationsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAnnotationsAnnotationParserRuleCall_0_0 = (RuleCall)cAnnotationsAssignment_0.eContents().get(0);
		private final Assignment cPrivateAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cPrivatePrivateKeyword_1_0 = (Keyword)cPrivateAssignment_1.eContents().get(0);
		private final Keyword cPropertyKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cColonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cTypeAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cTypeTypeParserRuleCall_5_0 = (RuleCall)cTypeAssignment_5.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cForKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Alternatives cAlternatives_6_2 = (Alternatives)cGroup_6.eContents().get(2);
		private final Assignment cForAllAssignment_6_2_0 = (Assignment)cAlternatives_6_2.eContents().get(0);
		private final Keyword cForAllAllKeyword_6_2_0_0 = (Keyword)cForAllAssignment_6_2_0.eContents().get(0);
		private final Group cGroup_6_2_1 = (Group)cAlternatives_6_2.eContents().get(1);
		private final RuleCall cAppliesToParserRuleCall_6_2_1_0 = (RuleCall)cGroup_6_2_1.eContents().get(0);
		private final Group cGroup_6_2_1_1 = (Group)cGroup_6_2_1.eContents().get(1);
		private final Keyword cCommaKeyword_6_2_1_1_0 = (Keyword)cGroup_6_2_1_1.eContents().get(0);
		private final RuleCall cAppliesToParserRuleCall_6_2_1_1_1 = (RuleCall)cGroup_6_2_1_1.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_6_3 = (Keyword)cGroup_6.eContents().get(3);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//PropertyDefinition av3::PropertyDefinition:
		//	annotations+=Annotation* private?='private'? 'property' name=ID ':' type=Type ('for' '(' (forAll?='all' | AppliesTo
		//	(',' AppliesTo)*) ')')? ';';
		@Override public ParserRule getRule() { return rule; }
		
		//annotations+=Annotation* private?='private'? 'property' name=ID ':' type=Type ('for' '(' (forAll?='all' | AppliesTo (','
		//AppliesTo)*) ')')? ';'
		public Group getGroup() { return cGroup; }
		
		//annotations+=Annotation*
		public Assignment getAnnotationsAssignment_0() { return cAnnotationsAssignment_0; }
		
		//Annotation
		public RuleCall getAnnotationsAnnotationParserRuleCall_0_0() { return cAnnotationsAnnotationParserRuleCall_0_0; }
		
		//private?='private'?
		public Assignment getPrivateAssignment_1() { return cPrivateAssignment_1; }
		
		//'private'
		public Keyword getPrivatePrivateKeyword_1_0() { return cPrivatePrivateKeyword_1_0; }
		
		//'property'
		public Keyword getPropertyKeyword_2() { return cPropertyKeyword_2; }
		
		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }
		
		//':'
		public Keyword getColonKeyword_4() { return cColonKeyword_4; }
		
		//type=Type
		public Assignment getTypeAssignment_5() { return cTypeAssignment_5; }
		
		//Type
		public RuleCall getTypeTypeParserRuleCall_5_0() { return cTypeTypeParserRuleCall_5_0; }
		
		//('for' '(' (forAll?='all' | AppliesTo (',' AppliesTo)*) ')')?
		public Group getGroup_6() { return cGroup_6; }
		
		//'for'
		public Keyword getForKeyword_6_0() { return cForKeyword_6_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_6_1() { return cLeftParenthesisKeyword_6_1; }
		
		//(forAll?='all' | AppliesTo (',' AppliesTo)*)
		public Alternatives getAlternatives_6_2() { return cAlternatives_6_2; }
		
		//forAll?='all'
		public Assignment getForAllAssignment_6_2_0() { return cForAllAssignment_6_2_0; }
		
		//'all'
		public Keyword getForAllAllKeyword_6_2_0_0() { return cForAllAllKeyword_6_2_0_0; }
		
		//AppliesTo (',' AppliesTo)*
		public Group getGroup_6_2_1() { return cGroup_6_2_1; }
		
		//AppliesTo
		public RuleCall getAppliesToParserRuleCall_6_2_1_0() { return cAppliesToParserRuleCall_6_2_1_0; }
		
		//(',' AppliesTo)*
		public Group getGroup_6_2_1_1() { return cGroup_6_2_1_1; }
		
		//','
		public Keyword getCommaKeyword_6_2_1_1_0() { return cCommaKeyword_6_2_1_1_0; }
		
		//AppliesTo
		public RuleCall getAppliesToParserRuleCall_6_2_1_1_1() { return cAppliesToParserRuleCall_6_2_1_1_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_6_3() { return cRightParenthesisKeyword_6_3; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
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
		private final Assignment cAnnotationsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAnnotationsAnnotationParserRuleCall_0_0 = (RuleCall)cAnnotationsAssignment_0.eContents().get(0);
		private final Assignment cPrivateAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cPrivatePrivateKeyword_1_0 = (Keyword)cPrivateAssignment_1.eContents().get(0);
		private final Keyword cPropertiesKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cColonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cLeftCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cPropertiesAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final CrossReference cPropertiesPropertyDefinitionCrossReference_6_0 = (CrossReference)cPropertiesAssignment_6.eContents().get(0);
		private final RuleCall cPropertiesPropertyDefinitionQualifiedReferenceParserRuleCall_6_0_1 = (RuleCall)cPropertiesPropertyDefinitionCrossReference_6_0.eContents().get(1);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cCommaKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cPropertiesAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final CrossReference cPropertiesPropertyDefinitionCrossReference_7_1_0 = (CrossReference)cPropertiesAssignment_7_1.eContents().get(0);
		private final RuleCall cPropertiesPropertyDefinitionQualifiedNameParserRuleCall_7_1_0_1 = (RuleCall)cPropertiesPropertyDefinitionCrossReference_7_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//PropertySet av3::PropertySet:
		//	annotations+=Annotation* private?='private'? 'properties' name=ID ':' '{'
		//	properties+=[av3::PropertyDefinition|QualifiedReference] (',' properties+=[av3::PropertyDefinition|QualifiedName])*
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//annotations+=Annotation* private?='private'? 'properties' name=ID ':' '{'
		//properties+=[av3::PropertyDefinition|QualifiedReference] (',' properties+=[av3::PropertyDefinition|QualifiedName])*
		//'}' ';'
		public Group getGroup() { return cGroup; }
		
		//annotations+=Annotation*
		public Assignment getAnnotationsAssignment_0() { return cAnnotationsAssignment_0; }
		
		//Annotation
		public RuleCall getAnnotationsAnnotationParserRuleCall_0_0() { return cAnnotationsAnnotationParserRuleCall_0_0; }
		
		//private?='private'?
		public Assignment getPrivateAssignment_1() { return cPrivateAssignment_1; }
		
		//'private'
		public Keyword getPrivatePrivateKeyword_1_0() { return cPrivatePrivateKeyword_1_0; }
		
		//'properties'
		public Keyword getPropertiesKeyword_2() { return cPropertiesKeyword_2; }
		
		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }
		
		//':'
		public Keyword getColonKeyword_4() { return cColonKeyword_4; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_5() { return cLeftCurlyBracketKeyword_5; }
		
		//properties+=[av3::PropertyDefinition|QualifiedReference]
		public Assignment getPropertiesAssignment_6() { return cPropertiesAssignment_6; }
		
		//[av3::PropertyDefinition|QualifiedReference]
		public CrossReference getPropertiesPropertyDefinitionCrossReference_6_0() { return cPropertiesPropertyDefinitionCrossReference_6_0; }
		
		//QualifiedReference
		public RuleCall getPropertiesPropertyDefinitionQualifiedReferenceParserRuleCall_6_0_1() { return cPropertiesPropertyDefinitionQualifiedReferenceParserRuleCall_6_0_1; }
		
		//(',' properties+=[av3::PropertyDefinition|QualifiedName])*
		public Group getGroup_7() { return cGroup_7; }
		
		//','
		public Keyword getCommaKeyword_7_0() { return cCommaKeyword_7_0; }
		
		//properties+=[av3::PropertyDefinition|QualifiedName]
		public Assignment getPropertiesAssignment_7_1() { return cPropertiesAssignment_7_1; }
		
		//[av3::PropertyDefinition|QualifiedName]
		public CrossReference getPropertiesPropertyDefinitionCrossReference_7_1_0() { return cPropertiesPropertyDefinitionCrossReference_7_1_0; }
		
		//QualifiedName
		public RuleCall getPropertiesPropertyDefinitionQualifiedNameParserRuleCall_7_1_0_1() { return cPropertiesPropertyDefinitionQualifiedNameParserRuleCall_7_1_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
	}
	public class TypeDefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.TypeDef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAnnotationsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAnnotationsAnnotationParserRuleCall_0_0 = (RuleCall)cAnnotationsAssignment_0.eContents().get(0);
		private final Assignment cPrivateAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cPrivatePrivateKeyword_1_0 = (Keyword)cPrivateAssignment_1.eContents().get(0);
		private final Keyword cTypeKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cExtendsKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cSuperTypeAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cSuperTypeTypeParserRuleCall_4_1_0 = (RuleCall)cSuperTypeAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cColonKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cBaseTypeAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cBaseTypeTypeParserRuleCall_5_1_0 = (RuleCall)cBaseTypeAssignment_5_1.eContents().get(0);
		private final RuleCall cPropertiesBlockParserRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//TypeDef av3::TypeDef:
		//	annotations+=Annotation* private?='private'? 'type' name=ID ('extends' superType=Type)? (':' baseType=Type)?
		//	PropertiesBlock? ';';
		@Override public ParserRule getRule() { return rule; }
		
		//annotations+=Annotation* private?='private'? 'type' name=ID ('extends' superType=Type)? (':' baseType=Type)?
		//PropertiesBlock? ';'
		public Group getGroup() { return cGroup; }
		
		//annotations+=Annotation*
		public Assignment getAnnotationsAssignment_0() { return cAnnotationsAssignment_0; }
		
		//Annotation
		public RuleCall getAnnotationsAnnotationParserRuleCall_0_0() { return cAnnotationsAnnotationParserRuleCall_0_0; }
		
		//private?='private'?
		public Assignment getPrivateAssignment_1() { return cPrivateAssignment_1; }
		
		//'private'
		public Keyword getPrivatePrivateKeyword_1_0() { return cPrivatePrivateKeyword_1_0; }
		
		//'type'
		public Keyword getTypeKeyword_2() { return cTypeKeyword_2; }
		
		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }
		
		//('extends' superType=Type)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'extends'
		public Keyword getExtendsKeyword_4_0() { return cExtendsKeyword_4_0; }
		
		//superType=Type
		public Assignment getSuperTypeAssignment_4_1() { return cSuperTypeAssignment_4_1; }
		
		//Type
		public RuleCall getSuperTypeTypeParserRuleCall_4_1_0() { return cSuperTypeTypeParserRuleCall_4_1_0; }
		
		//(':' baseType=Type)?
		public Group getGroup_5() { return cGroup_5; }
		
		//':'
		public Keyword getColonKeyword_5_0() { return cColonKeyword_5_0; }
		
		//baseType=Type
		public Assignment getBaseTypeAssignment_5_1() { return cBaseTypeAssignment_5_1; }
		
		//Type
		public RuleCall getBaseTypeTypeParserRuleCall_5_1_0() { return cBaseTypeTypeParserRuleCall_5_1_0; }
		
		//PropertiesBlock?
		public RuleCall getPropertiesBlockParserRuleCall_6() { return cPropertiesBlockParserRuleCall_6; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
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
		private final Action cNamedElementReferenceContextAction_1_0_0 = (Action)cGroup_1_0.eContents().get(0);
		private final Keyword cFullStopKeyword_1_0_1 = (Keyword)cGroup_1_0.eContents().get(1);
		private final Assignment cElementAssignment_1_0_2 = (Assignment)cGroup_1_0.eContents().get(2);
		private final CrossReference cElementModelElementCrossReference_1_0_2_0 = (CrossReference)cElementAssignment_1_0_2.eContents().get(0);
		private final RuleCall cElementModelElementIDTerminalRuleCall_1_0_2_0_1 = (RuleCall)cElementModelElementCrossReference_1_0_2_0.eContents().get(1);
		
		//ModelElementReference av3::NamedElementReference:
		//	element=[av3::ModelElement] -> ({av3::NamedElementReference.context=current} '.' element=[av3::ModelElement])*;
		@Override public ParserRule getRule() { return rule; }
		
		//// => or -> both work
		// element=[av3::ModelElement] -> ({av3::NamedElementReference.context=current} '.'
		//element=[av3::ModelElement])*
		public Group getGroup() { return cGroup; }
		
		//// => or -> both work
		// element=[av3::ModelElement]
		public Assignment getElementAssignment_0() { return cElementAssignment_0; }
		
		//[av3::ModelElement]
		public CrossReference getElementModelElementCrossReference_0_0() { return cElementModelElementCrossReference_0_0; }
		
		//ID
		public RuleCall getElementModelElementIDTerminalRuleCall_0_0_1() { return cElementModelElementIDTerminalRuleCall_0_0_1; }
		
		//-> ({av3::NamedElementReference.context=current} '.' element=[av3::ModelElement])*
		public Group getGroup_1() { return cGroup_1; }
		
		//({av3::NamedElementReference.context=current} '.' element=[av3::ModelElement])
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//{av3::NamedElementReference.context=current}
		public Action getNamedElementReferenceContextAction_1_0_0() { return cNamedElementReferenceContextAction_1_0_0; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0_1() { return cFullStopKeyword_1_0_1; }
		
		//element=[av3::ModelElement]
		public Assignment getElementAssignment_1_0_2() { return cElementAssignment_1_0_2; }
		
		//[av3::ModelElement]
		public CrossReference getElementModelElementCrossReference_1_0_2_0() { return cElementModelElementCrossReference_1_0_2_0; }
		
		//ID
		public RuleCall getElementModelElementIDTerminalRuleCall_1_0_2_0_1() { return cElementModelElementIDTerminalRuleCall_1_0_2_0_1; }
	}
	public class NamedElementReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.NamedElementReference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cElementAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cElementNamedElementCrossReference_0_0 = (CrossReference)cElementAssignment_0.eContents().get(0);
		private final RuleCall cElementNamedElementQualifiedReferenceParserRuleCall_0_0_1 = (RuleCall)cElementNamedElementCrossReference_0_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cGroup_1.eContents().get(0);
		private final Action cNamedElementReferenceContextAction_1_0_0 = (Action)cGroup_1_0.eContents().get(0);
		private final Keyword cFullStopKeyword_1_0_1 = (Keyword)cGroup_1_0.eContents().get(1);
		private final Assignment cElementAssignment_1_0_2 = (Assignment)cGroup_1_0.eContents().get(2);
		private final CrossReference cElementModelElementCrossReference_1_0_2_0 = (CrossReference)cElementAssignment_1_0_2.eContents().get(0);
		private final RuleCall cElementModelElementIDTerminalRuleCall_1_0_2_0_1 = (RuleCall)cElementModelElementCrossReference_1_0_2_0.eContents().get(1);
		
		//NamedElementReference av3::NamedElementReference:
		//	element=[av3::NamedElement|QualifiedReference] -> ({av3::NamedElementReference.context=current} '.'
		//	element=[av3::ModelElement])*;
		@Override public ParserRule getRule() { return rule; }
		
		//// => or -> both work
		// element=[av3::NamedElement|QualifiedReference] -> ({av3::NamedElementReference.context=current}
		//'.' element=[av3::ModelElement])*
		public Group getGroup() { return cGroup; }
		
		//// => or -> both work
		// element=[av3::NamedElement|QualifiedReference]
		public Assignment getElementAssignment_0() { return cElementAssignment_0; }
		
		//[av3::NamedElement|QualifiedReference]
		public CrossReference getElementNamedElementCrossReference_0_0() { return cElementNamedElementCrossReference_0_0; }
		
		//QualifiedReference
		public RuleCall getElementNamedElementQualifiedReferenceParserRuleCall_0_0_1() { return cElementNamedElementQualifiedReferenceParserRuleCall_0_0_1; }
		
		//-> ({av3::NamedElementReference.context=current} '.' element=[av3::ModelElement])*
		public Group getGroup_1() { return cGroup_1; }
		
		//({av3::NamedElementReference.context=current} '.' element=[av3::ModelElement])
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//{av3::NamedElementReference.context=current}
		public Action getNamedElementReferenceContextAction_1_0_0() { return cNamedElementReferenceContextAction_1_0_0; }
		
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
		private final Assignment cAnnotationsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAnnotationsAnnotationParserRuleCall_0_0 = (RuleCall)cAnnotationsAssignment_0.eContents().get(0);
		private final Assignment cPrivateAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cPrivatePrivateKeyword_1_0 = (Keyword)cPrivateAssignment_1.eContents().get(0);
		private final Assignment cCategoryAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cCategoryComponentCategoryParserRuleCall_2_0 = (RuleCall)cCategoryAssignment_2.eContents().get(0);
		private final Keyword cInterfaceKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameIDTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cExtendsKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final RuleCall cInterfaceExtensionsParserRuleCall_5_1 = (RuleCall)cGroup_5.eContents().get(1);
		private final RuleCall cInterfaceBodyParserRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//ComponentInterface av3::ComponentInterface:
		//	annotations+=Annotation* private?='private'? category=ComponentCategory? 'interface' name=ID ('extends'
		//	InterfaceExtensions)? InterfaceBody ';';
		@Override public ParserRule getRule() { return rule; }
		
		//annotations+=Annotation* private?='private'? category=ComponentCategory? 'interface' name=ID ('extends'
		//InterfaceExtensions)? InterfaceBody ';'
		public Group getGroup() { return cGroup; }
		
		//annotations+=Annotation*
		public Assignment getAnnotationsAssignment_0() { return cAnnotationsAssignment_0; }
		
		//Annotation
		public RuleCall getAnnotationsAnnotationParserRuleCall_0_0() { return cAnnotationsAnnotationParserRuleCall_0_0; }
		
		//private?='private'?
		public Assignment getPrivateAssignment_1() { return cPrivateAssignment_1; }
		
		//'private'
		public Keyword getPrivatePrivateKeyword_1_0() { return cPrivatePrivateKeyword_1_0; }
		
		//category=ComponentCategory?
		public Assignment getCategoryAssignment_2() { return cCategoryAssignment_2; }
		
		//ComponentCategory
		public RuleCall getCategoryComponentCategoryParserRuleCall_2_0() { return cCategoryComponentCategoryParserRuleCall_2_0; }
		
		//'interface'
		public Keyword getInterfaceKeyword_3() { return cInterfaceKeyword_3; }
		
		//name=ID
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_4_0() { return cNameIDTerminalRuleCall_4_0; }
		
		//('extends' InterfaceExtensions)?
		public Group getGroup_5() { return cGroup_5; }
		
		//'extends'
		public Keyword getExtendsKeyword_5_0() { return cExtendsKeyword_5_0; }
		
		//InterfaceExtensions
		public RuleCall getInterfaceExtensionsParserRuleCall_5_1() { return cInterfaceExtensionsParserRuleCall_5_1; }
		
		//InterfaceBody
		public RuleCall getInterfaceBodyParserRuleCall_6() { return cInterfaceBodyParserRuleCall_6; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
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
		private final Assignment cElementsAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final Alternatives cElementsAlternatives_0_0 = (Alternatives)cElementsAssignment_0.eContents().get(0);
		private final RuleCall cElementsFeatureParserRuleCall_0_0_0 = (RuleCall)cElementsAlternatives_0_0.eContents().get(0);
		private final RuleCall cElementsStateVariableParserRuleCall_0_0_1 = (RuleCall)cElementsAlternatives_0_0.eContents().get(1);
		private final RuleCall cElementsStateTransitionParserRuleCall_0_0_2 = (RuleCall)cElementsAlternatives_0_0.eContents().get(2);
		private final RuleCall cElementsBehaviorParserRuleCall_0_0_3 = (RuleCall)cElementsAlternatives_0_0.eContents().get(3);
		private final RuleCall cElementsGeneratorParserRuleCall_0_0_4 = (RuleCall)cElementsAlternatives_0_0.eContents().get(4);
		private final RuleCall cElementsBehaviorAnnotationBlockParserRuleCall_0_0_5 = (RuleCall)cElementsAlternatives_0_0.eContents().get(5);
		private final RuleCall cElementsAnnexSubclauseParserRuleCall_0_0_6 = (RuleCall)cElementsAlternatives_0_0.eContents().get(6);
		private final Assignment cOwnedPropertyAssociationsAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cOwnedPropertyAssociationsPropertyAssociationParserRuleCall_1_0 = (RuleCall)cOwnedPropertyAssociationsAssignment_1.eContents().get(0);
		
		//fragment InterfaceElement *:
		//	elements+=(Feature | StateVariable | StateTransition | Behavior | Generator | BehaviorAnnotationBlock |
		//	AnnexSubclause) | ownedPropertyAssociations+=PropertyAssociation;
		@Override public ParserRule getRule() { return rule; }
		
		//elements+=(Feature | StateVariable | StateTransition | Behavior | Generator | BehaviorAnnotationBlock | AnnexSubclause)
		//| ownedPropertyAssociations+=PropertyAssociation
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//elements+=(Feature | StateVariable | StateTransition | Behavior | Generator | BehaviorAnnotationBlock | AnnexSubclause)
		public Assignment getElementsAssignment_0() { return cElementsAssignment_0; }
		
		//(Feature | StateVariable | StateTransition | Behavior | Generator | BehaviorAnnotationBlock | AnnexSubclause)
		public Alternatives getElementsAlternatives_0_0() { return cElementsAlternatives_0_0; }
		
		//Feature
		public RuleCall getElementsFeatureParserRuleCall_0_0_0() { return cElementsFeatureParserRuleCall_0_0_0; }
		
		//StateVariable
		public RuleCall getElementsStateVariableParserRuleCall_0_0_1() { return cElementsStateVariableParserRuleCall_0_0_1; }
		
		//StateTransition
		public RuleCall getElementsStateTransitionParserRuleCall_0_0_2() { return cElementsStateTransitionParserRuleCall_0_0_2; }
		
		//Behavior
		public RuleCall getElementsBehaviorParserRuleCall_0_0_3() { return cElementsBehaviorParserRuleCall_0_0_3; }
		
		//Generator
		public RuleCall getElementsGeneratorParserRuleCall_0_0_4() { return cElementsGeneratorParserRuleCall_0_0_4; }
		
		//BehaviorAnnotationBlock
		public RuleCall getElementsBehaviorAnnotationBlockParserRuleCall_0_0_5() { return cElementsBehaviorAnnotationBlockParserRuleCall_0_0_5; }
		
		//AnnexSubclause
		public RuleCall getElementsAnnexSubclauseParserRuleCall_0_0_6() { return cElementsAnnexSubclauseParserRuleCall_0_0_6; }
		
		//ownedPropertyAssociations+=PropertyAssociation
		public Assignment getOwnedPropertyAssociationsAssignment_1() { return cOwnedPropertyAssociationsAssignment_1; }
		
		//PropertyAssociation
		public RuleCall getOwnedPropertyAssociationsPropertyAssociationParserRuleCall_1_0() { return cOwnedPropertyAssociationsPropertyAssociationParserRuleCall_1_0; }
	}
	public class ComponentImplementationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ComponentImplementation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAnnotationsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAnnotationsAnnotationParserRuleCall_0_0 = (RuleCall)cAnnotationsAssignment_0.eContents().get(0);
		private final Assignment cPrivateAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cPrivatePrivateKeyword_1_0 = (Keyword)cPrivateAssignment_1.eContents().get(0);
		private final Assignment cCategoryAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cCategoryComponentCategoryParserRuleCall_2_0 = (RuleCall)cCategoryAssignment_2.eContents().get(0);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameDottedNameParserRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cExtendsKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final RuleCall cImplementationExtensionsParserRuleCall_4_1 = (RuleCall)cGroup_4.eContents().get(1);
		private final RuleCall cImplementationBodyParserRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//ComponentImplementation av3::ComponentImplementation:
		//	annotations+=Annotation* private?='private'? category=ComponentCategory name=DottedName ('extends'
		//	ImplementationExtensions)? ImplementationBody ';';
		@Override public ParserRule getRule() { return rule; }
		
		//annotations+=Annotation* private?='private'? category=ComponentCategory name=DottedName ('extends'
		//ImplementationExtensions)? ImplementationBody ';'
		public Group getGroup() { return cGroup; }
		
		//annotations+=Annotation*
		public Assignment getAnnotationsAssignment_0() { return cAnnotationsAssignment_0; }
		
		//Annotation
		public RuleCall getAnnotationsAnnotationParserRuleCall_0_0() { return cAnnotationsAnnotationParserRuleCall_0_0; }
		
		//private?='private'?
		public Assignment getPrivateAssignment_1() { return cPrivateAssignment_1; }
		
		//'private'
		public Keyword getPrivatePrivateKeyword_1_0() { return cPrivatePrivateKeyword_1_0; }
		
		//category=ComponentCategory
		public Assignment getCategoryAssignment_2() { return cCategoryAssignment_2; }
		
		//ComponentCategory
		public RuleCall getCategoryComponentCategoryParserRuleCall_2_0() { return cCategoryComponentCategoryParserRuleCall_2_0; }
		
		//name=DottedName
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//DottedName
		public RuleCall getNameDottedNameParserRuleCall_3_0() { return cNameDottedNameParserRuleCall_3_0; }
		
		//('extends' ImplementationExtensions)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'extends'
		public Keyword getExtendsKeyword_4_0() { return cExtendsKeyword_4_0; }
		
		//ImplementationExtensions
		public RuleCall getImplementationExtensionsParserRuleCall_4_1() { return cImplementationExtensionsParserRuleCall_4_1; }
		
		//ImplementationBody
		public RuleCall getImplementationBodyParserRuleCall_5() { return cImplementationBodyParserRuleCall_5; }
		
		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
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
		private final Assignment cElementsAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final Alternatives cElementsAlternatives_0_0 = (Alternatives)cElementsAssignment_0.eContents().get(0);
		private final RuleCall cElementsConnectionParserRuleCall_0_0_0 = (RuleCall)cElementsAlternatives_0_0.eContents().get(0);
		private final RuleCall cElementsBindingParserRuleCall_0_0_1 = (RuleCall)cElementsAlternatives_0_0.eContents().get(1);
		private final RuleCall cElementsSubcomponentParserRuleCall_0_0_2 = (RuleCall)cElementsAlternatives_0_0.eContents().get(2);
		private final RuleCall cElementsEndToEndFlowParserRuleCall_0_0_3 = (RuleCall)cElementsAlternatives_0_0.eContents().get(3);
		private final RuleCall cElementsBehaviorAnnotationBlockParserRuleCall_0_0_4 = (RuleCall)cElementsAlternatives_0_0.eContents().get(4);
		private final RuleCall cElementsStateVariableParserRuleCall_0_0_5 = (RuleCall)cElementsAlternatives_0_0.eContents().get(5);
		private final RuleCall cElementsStateTransitionParserRuleCall_0_0_6 = (RuleCall)cElementsAlternatives_0_0.eContents().get(6);
		private final RuleCall cElementsStateSynchronizationParserRuleCall_0_0_7 = (RuleCall)cElementsAlternatives_0_0.eContents().get(7);
		private final RuleCall cElementsBehaviorParserRuleCall_0_0_8 = (RuleCall)cElementsAlternatives_0_0.eContents().get(8);
		private final RuleCall cElementsGeneratorParserRuleCall_0_0_9 = (RuleCall)cElementsAlternatives_0_0.eContents().get(9);
		private final RuleCall cElementsAnnexSubclauseParserRuleCall_0_0_10 = (RuleCall)cElementsAlternatives_0_0.eContents().get(10);
		private final Assignment cFlowAssignmentsAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cFlowAssignmentsFlowAssignmentParserRuleCall_1_0 = (RuleCall)cFlowAssignmentsAssignment_1.eContents().get(0);
		private final Assignment cClassifierAssignmentsAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final RuleCall cClassifierAssignmentsClassifierAssignmentParserRuleCall_2_0 = (RuleCall)cClassifierAssignmentsAssignment_2.eContents().get(0);
		private final Assignment cClassifierAssignmentsAssignment_3 = (Assignment)cAlternatives.eContents().get(3);
		private final RuleCall cClassifierAssignmentsClassifierAssignmentPatternParserRuleCall_3_0 = (RuleCall)cClassifierAssignmentsAssignment_3.eContents().get(0);
		private final Assignment cConnectionAssignmentsAssignment_4 = (Assignment)cAlternatives.eContents().get(4);
		private final RuleCall cConnectionAssignmentsConnectionAssignmentParserRuleCall_4_0 = (RuleCall)cConnectionAssignmentsAssignment_4.eContents().get(0);
		private final Assignment cOwnedPropertyAssociationsAssignment_5 = (Assignment)cAlternatives.eContents().get(5);
		private final RuleCall cOwnedPropertyAssociationsPropertyAssociationParserRuleCall_5_0 = (RuleCall)cOwnedPropertyAssociationsAssignment_5.eContents().get(0);
		
		//fragment ImplementationElement *:
		//	elements+=(Connection | Binding | Subcomponent | EndToEndFlow | BehaviorAnnotationBlock | StateVariable |
		//	StateTransition | StateSynchronization | Behavior | Generator | AnnexSubclause) | flowAssignments+=FlowAssignment |
		//	classifierAssignments+=ClassifierAssignment | classifierAssignments+=ClassifierAssignmentPattern |
		//	connectionAssignments+=ConnectionAssignment | ownedPropertyAssociations+=PropertyAssociation;
		@Override public ParserRule getRule() { return rule; }
		
		//elements+=(Connection | Binding | Subcomponent | EndToEndFlow | BehaviorAnnotationBlock | StateVariable |
		//StateTransition | StateSynchronization | Behavior | Generator | AnnexSubclause) | flowAssignments+=FlowAssignment |
		//classifierAssignments+=ClassifierAssignment | classifierAssignments+=ClassifierAssignmentPattern |
		//connectionAssignments+=ConnectionAssignment | ownedPropertyAssociations+=PropertyAssociation
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//elements+=(Connection | Binding | Subcomponent | EndToEndFlow | BehaviorAnnotationBlock | StateVariable |
		//StateTransition | StateSynchronization | Behavior | Generator | AnnexSubclause)
		public Assignment getElementsAssignment_0() { return cElementsAssignment_0; }
		
		//(Connection | Binding | Subcomponent | EndToEndFlow | BehaviorAnnotationBlock | StateVariable | StateTransition |
		//StateSynchronization | Behavior | Generator | AnnexSubclause)
		public Alternatives getElementsAlternatives_0_0() { return cElementsAlternatives_0_0; }
		
		//Connection
		public RuleCall getElementsConnectionParserRuleCall_0_0_0() { return cElementsConnectionParserRuleCall_0_0_0; }
		
		//Binding
		public RuleCall getElementsBindingParserRuleCall_0_0_1() { return cElementsBindingParserRuleCall_0_0_1; }
		
		//Subcomponent
		public RuleCall getElementsSubcomponentParserRuleCall_0_0_2() { return cElementsSubcomponentParserRuleCall_0_0_2; }
		
		//EndToEndFlow
		public RuleCall getElementsEndToEndFlowParserRuleCall_0_0_3() { return cElementsEndToEndFlowParserRuleCall_0_0_3; }
		
		//BehaviorAnnotationBlock
		public RuleCall getElementsBehaviorAnnotationBlockParserRuleCall_0_0_4() { return cElementsBehaviorAnnotationBlockParserRuleCall_0_0_4; }
		
		//StateVariable
		public RuleCall getElementsStateVariableParserRuleCall_0_0_5() { return cElementsStateVariableParserRuleCall_0_0_5; }
		
		//StateTransition
		public RuleCall getElementsStateTransitionParserRuleCall_0_0_6() { return cElementsStateTransitionParserRuleCall_0_0_6; }
		
		//StateSynchronization
		public RuleCall getElementsStateSynchronizationParserRuleCall_0_0_7() { return cElementsStateSynchronizationParserRuleCall_0_0_7; }
		
		//Behavior
		public RuleCall getElementsBehaviorParserRuleCall_0_0_8() { return cElementsBehaviorParserRuleCall_0_0_8; }
		
		//Generator
		public RuleCall getElementsGeneratorParserRuleCall_0_0_9() { return cElementsGeneratorParserRuleCall_0_0_9; }
		
		//AnnexSubclause
		public RuleCall getElementsAnnexSubclauseParserRuleCall_0_0_10() { return cElementsAnnexSubclauseParserRuleCall_0_0_10; }
		
		//flowAssignments+=FlowAssignment
		public Assignment getFlowAssignmentsAssignment_1() { return cFlowAssignmentsAssignment_1; }
		
		//FlowAssignment
		public RuleCall getFlowAssignmentsFlowAssignmentParserRuleCall_1_0() { return cFlowAssignmentsFlowAssignmentParserRuleCall_1_0; }
		
		//classifierAssignments+=ClassifierAssignment
		public Assignment getClassifierAssignmentsAssignment_2() { return cClassifierAssignmentsAssignment_2; }
		
		//ClassifierAssignment
		public RuleCall getClassifierAssignmentsClassifierAssignmentParserRuleCall_2_0() { return cClassifierAssignmentsClassifierAssignmentParserRuleCall_2_0; }
		
		//classifierAssignments+=ClassifierAssignmentPattern
		public Assignment getClassifierAssignmentsAssignment_3() { return cClassifierAssignmentsAssignment_3; }
		
		//ClassifierAssignmentPattern
		public RuleCall getClassifierAssignmentsClassifierAssignmentPatternParserRuleCall_3_0() { return cClassifierAssignmentsClassifierAssignmentPatternParserRuleCall_3_0; }
		
		//connectionAssignments+=ConnectionAssignment
		public Assignment getConnectionAssignmentsAssignment_4() { return cConnectionAssignmentsAssignment_4; }
		
		//ConnectionAssignment
		public RuleCall getConnectionAssignmentsConnectionAssignmentParserRuleCall_4_0() { return cConnectionAssignmentsConnectionAssignmentParserRuleCall_4_0; }
		
		//ownedPropertyAssociations+=PropertyAssociation
		public Assignment getOwnedPropertyAssociationsAssignment_5() { return cOwnedPropertyAssociationsAssignment_5; }
		
		//PropertyAssociation
		public RuleCall getOwnedPropertyAssociationsPropertyAssociationParserRuleCall_5_0() { return cOwnedPropertyAssociationsPropertyAssociationParserRuleCall_5_0; }
	}
	public class ComponentConfigurationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ComponentConfiguration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAnnotationsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAnnotationsAnnotationParserRuleCall_0_0 = (RuleCall)cAnnotationsAssignment_0.eContents().get(0);
		private final Assignment cPrivateAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cPrivatePrivateKeyword_1_0 = (Keyword)cPrivateAssignment_1.eContents().get(0);
		private final Keyword cConfigurationKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameDottedNameParserRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final RuleCall cParametersParserRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cExtendsKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final RuleCall cConfigurationExtensionsParserRuleCall_5_1 = (RuleCall)cGroup_5.eContents().get(1);
		private final RuleCall cConfigurationElementBlockParserRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//ComponentConfiguration av3::ComponentConfiguration:
		//	annotations+=Annotation* private?='private'? 'configuration' name=DottedName Parameters? ('extends'
		//	ConfigurationExtensions)? ConfigurationElementBlock ';';
		@Override public ParserRule getRule() { return rule; }
		
		//annotations+=Annotation* private?='private'? 'configuration' name=DottedName Parameters? ('extends'
		//ConfigurationExtensions)? ConfigurationElementBlock ';'
		public Group getGroup() { return cGroup; }
		
		//annotations+=Annotation*
		public Assignment getAnnotationsAssignment_0() { return cAnnotationsAssignment_0; }
		
		//Annotation
		public RuleCall getAnnotationsAnnotationParserRuleCall_0_0() { return cAnnotationsAnnotationParserRuleCall_0_0; }
		
		//private?='private'?
		public Assignment getPrivateAssignment_1() { return cPrivateAssignment_1; }
		
		//'private'
		public Keyword getPrivatePrivateKeyword_1_0() { return cPrivatePrivateKeyword_1_0; }
		
		//'configuration'
		public Keyword getConfigurationKeyword_2() { return cConfigurationKeyword_2; }
		
		//name=DottedName
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//DottedName
		public RuleCall getNameDottedNameParserRuleCall_3_0() { return cNameDottedNameParserRuleCall_3_0; }
		
		//Parameters?
		public RuleCall getParametersParserRuleCall_4() { return cParametersParserRuleCall_4; }
		
		//('extends' ConfigurationExtensions)?
		public Group getGroup_5() { return cGroup_5; }
		
		//'extends'
		public Keyword getExtendsKeyword_5_0() { return cExtendsKeyword_5_0; }
		
		//ConfigurationExtensions
		public RuleCall getConfigurationExtensionsParserRuleCall_5_1() { return cConfigurationExtensionsParserRuleCall_5_1; }
		
		//ConfigurationElementBlock
		public RuleCall getConfigurationElementBlockParserRuleCall_6() { return cConfigurationElementBlockParserRuleCall_6; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}
	public class FeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.Feature");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAnnotationsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAnnotationsAnnotationParserRuleCall_0_0 = (RuleCall)cAnnotationsAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDirectionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDirectionFeatureDirectionParserRuleCall_3_0 = (RuleCall)cDirectionAssignment_3.eContents().get(0);
		private final Assignment cCategoryAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cCategoryFeatureCategoryParserRuleCall_4_0 = (RuleCall)cCategoryAssignment_4.eContents().get(0);
		private final Assignment cTypeReferenceAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cTypeReferenceReversableTypeReferenceParserRuleCall_5_0 = (RuleCall)cTypeReferenceAssignment_5.eContents().get(0);
		private final RuleCall cPropertiesBlockParserRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//// (Instance) model elements
		// Feature av3::Feature:
		//	annotations+=Annotation* name=ID ':' direction=FeatureDirection? category=FeatureCategory
		//	typeReference=ReversableTypeReference? PropertiesBlock? ';';
		@Override public ParserRule getRule() { return rule; }
		
		//annotations+=Annotation* name=ID ':' direction=FeatureDirection? category=FeatureCategory
		//typeReference=ReversableTypeReference? PropertiesBlock? ';'
		public Group getGroup() { return cGroup; }
		
		//annotations+=Annotation*
		public Assignment getAnnotationsAssignment_0() { return cAnnotationsAssignment_0; }
		
		//Annotation
		public RuleCall getAnnotationsAnnotationParserRuleCall_0_0() { return cAnnotationsAnnotationParserRuleCall_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//direction=FeatureDirection?
		public Assignment getDirectionAssignment_3() { return cDirectionAssignment_3; }
		
		//FeatureDirection
		public RuleCall getDirectionFeatureDirectionParserRuleCall_3_0() { return cDirectionFeatureDirectionParserRuleCall_3_0; }
		
		//category=FeatureCategory
		public Assignment getCategoryAssignment_4() { return cCategoryAssignment_4; }
		
		//FeatureCategory
		public RuleCall getCategoryFeatureCategoryParserRuleCall_4_0() { return cCategoryFeatureCategoryParserRuleCall_4_0; }
		
		//typeReference=ReversableTypeReference?
		public Assignment getTypeReferenceAssignment_5() { return cTypeReferenceAssignment_5; }
		
		//ReversableTypeReference
		public RuleCall getTypeReferenceReversableTypeReferenceParserRuleCall_5_0() { return cTypeReferenceReversableTypeReferenceParserRuleCall_5_0; }
		
		//PropertiesBlock?
		public RuleCall getPropertiesBlockParserRuleCall_6() { return cPropertiesBlockParserRuleCall_6; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}
	public class SubcomponentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.Subcomponent");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSubcomponentAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cAnnotationsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAnnotationsAnnotationParserRuleCall_1_0 = (RuleCall)cAnnotationsAssignment_1.eContents().get(0);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cCategoryAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cCategoryComponentCategoryParserRuleCall_4_0 = (RuleCall)cCategoryAssignment_4.eContents().get(0);
		private final Alternatives cAlternatives_5 = (Alternatives)cGroup.eContents().get(5);
		private final Group cGroup_5_0 = (Group)cAlternatives_5.eContents().get(0);
		private final Assignment cTypeReferencesAssignment_5_0_0 = (Assignment)cGroup_5_0.eContents().get(0);
		private final RuleCall cTypeReferencesClassifierOrTypeReferenceParserRuleCall_5_0_0_0 = (RuleCall)cTypeReferencesAssignment_5_0_0.eContents().get(0);
		private final RuleCall cInStatesParserRuleCall_5_0_1 = (RuleCall)cGroup_5_0.eContents().get(1);
		private final RuleCall cPropertiesBlockParserRuleCall_5_0_2 = (RuleCall)cGroup_5_0.eContents().get(2);
		private final Group cGroup_5_1 = (Group)cAlternatives_5.eContents().get(1);
		private final RuleCall cInStatesParserRuleCall_5_1_0 = (RuleCall)cGroup_5_1.eContents().get(0);
		private final RuleCall cNestedComponentImplementationBlockParserRuleCall_5_1_1 = (RuleCall)cGroup_5_1.eContents().get(1);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Subcomponent av3::Subcomponent:
		//	{av3::Subcomponent} annotations+=Annotation* name=ID ':' category=ComponentCategory
		//	(typeReferences+=ClassifierOrTypeReference InStates? PropertiesBlock? | InStates? NestedComponentImplementationBlock)
		//	';';
		@Override public ParserRule getRule() { return rule; }
		
		//{av3::Subcomponent} annotations+=Annotation* name=ID ':' category=ComponentCategory
		//(typeReferences+=ClassifierOrTypeReference InStates? PropertiesBlock? | InStates? NestedComponentImplementationBlock)
		//';'
		public Group getGroup() { return cGroup; }
		
		//{av3::Subcomponent}
		public Action getSubcomponentAction_0() { return cSubcomponentAction_0; }
		
		//annotations+=Annotation*
		public Assignment getAnnotationsAssignment_1() { return cAnnotationsAssignment_1; }
		
		//Annotation
		public RuleCall getAnnotationsAnnotationParserRuleCall_1_0() { return cAnnotationsAnnotationParserRuleCall_1_0; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//':'
		public Keyword getColonKeyword_3() { return cColonKeyword_3; }
		
		//category=ComponentCategory
		public Assignment getCategoryAssignment_4() { return cCategoryAssignment_4; }
		
		//ComponentCategory
		public RuleCall getCategoryComponentCategoryParserRuleCall_4_0() { return cCategoryComponentCategoryParserRuleCall_4_0; }
		
		//(typeReferences+=ClassifierOrTypeReference InStates? PropertiesBlock? | InStates? NestedComponentImplementationBlock)
		public Alternatives getAlternatives_5() { return cAlternatives_5; }
		
		//typeReferences+=ClassifierOrTypeReference InStates? PropertiesBlock?
		public Group getGroup_5_0() { return cGroup_5_0; }
		
		//typeReferences+=ClassifierOrTypeReference
		public Assignment getTypeReferencesAssignment_5_0_0() { return cTypeReferencesAssignment_5_0_0; }
		
		//ClassifierOrTypeReference
		public RuleCall getTypeReferencesClassifierOrTypeReferenceParserRuleCall_5_0_0_0() { return cTypeReferencesClassifierOrTypeReferenceParserRuleCall_5_0_0_0; }
		
		//InStates?
		public RuleCall getInStatesParserRuleCall_5_0_1() { return cInStatesParserRuleCall_5_0_1; }
		
		//PropertiesBlock?
		public RuleCall getPropertiesBlockParserRuleCall_5_0_2() { return cPropertiesBlockParserRuleCall_5_0_2; }
		
		//InStates? NestedComponentImplementationBlock
		public Group getGroup_5_1() { return cGroup_5_1; }
		
		//InStates?
		public RuleCall getInStatesParserRuleCall_5_1_0() { return cInStatesParserRuleCall_5_1_0; }
		
		//NestedComponentImplementationBlock
		public RuleCall getNestedComponentImplementationBlockParserRuleCall_5_1_1() { return cNestedComponentImplementationBlockParserRuleCall_5_1_1; }
		
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
		private final RuleCall cInStatesParserRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		private final RuleCall cPropertiesBlockParserRuleCall_7 = (RuleCall)cGroup.eContents().get(7);
		private final Keyword cSemicolonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//Connection av3::Association:
		//	name=ID ':' associationType=IsConnection source=ModelElementReference ('->' | bidirectional?='<->')
		//	destination=ModelElementReference InStates? PropertiesBlock? ';';
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' associationType=IsConnection source=ModelElementReference ('->' | bidirectional?='<->')
		//destination=ModelElementReference InStates? PropertiesBlock? ';'
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
		
		//('->' | bidirectional?='<->')
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
		
		//InStates?
		public RuleCall getInStatesParserRuleCall_6() { return cInStatesParserRuleCall_6; }
		
		//PropertiesBlock?
		public RuleCall getPropertiesBlockParserRuleCall_7() { return cPropertiesBlockParserRuleCall_7; }
		
		//';'
		public Keyword getSemicolonKeyword_8() { return cSemicolonKeyword_8; }
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
		private final RuleCall cInStatesParserRuleCall_7 = (RuleCall)cGroup.eContents().get(7);
		private final RuleCall cPropertiesBlockParserRuleCall_8 = (RuleCall)cGroup.eContents().get(8);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//Binding av3::Association:
		//	name=ID ':' bindingType=[av3::TypeDef|QualifiedName]? associationType=IsBinding source=ModelElementReference '->'
		//	destination=ModelElementReference InStates? PropertiesBlock? ';';
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' bindingType=[av3::TypeDef|QualifiedName]? associationType=IsBinding source=ModelElementReference '->'
		//destination=ModelElementReference InStates? PropertiesBlock? ';'
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
		
		//InStates?
		public RuleCall getInStatesParserRuleCall_7() { return cInStatesParserRuleCall_7; }
		
		//PropertiesBlock?
		public RuleCall getPropertiesBlockParserRuleCall_8() { return cPropertiesBlockParserRuleCall_8; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
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
	public class InStatesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.InStates");
		private final Group cGroup = (Group)rule.eContents().get(0);
		private final Keyword cWhenKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cInStatesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cInStatesAlternatives_1_0 = (Alternatives)cInStatesAssignment_1.eContents().get(0);
		private final RuleCall cInStatesModelElementContainsEnumerationLiteralParserRuleCall_1_0_0 = (RuleCall)cInStatesAlternatives_1_0.eContents().get(0);
		private final RuleCall cInStatesModelElementEqualsEnumerationLiteralParserRuleCall_1_0_1 = (RuleCall)cInStatesAlternatives_1_0.eContents().get(1);
		
		//fragment InStates *:
		//	'when' inStates=(ModelElementContainsEnumerationLiteral | ModelElementEqualsEnumerationLiteral);
		@Override public ParserRule getRule() { return rule; }
		
		//'when' inStates=(ModelElementContainsEnumerationLiteral | ModelElementEqualsEnumerationLiteral)
		public Group getGroup() { return cGroup; }
		
		//'when'
		public Keyword getWhenKeyword_0() { return cWhenKeyword_0; }
		
		//inStates=(ModelElementContainsEnumerationLiteral | ModelElementEqualsEnumerationLiteral)
		public Assignment getInStatesAssignment_1() { return cInStatesAssignment_1; }
		
		//(ModelElementContainsEnumerationLiteral | ModelElementEqualsEnumerationLiteral)
		public Alternatives getInStatesAlternatives_1_0() { return cInStatesAlternatives_1_0; }
		
		//ModelElementContainsEnumerationLiteral
		public RuleCall getInStatesModelElementContainsEnumerationLiteralParserRuleCall_1_0_0() { return cInStatesModelElementContainsEnumerationLiteralParserRuleCall_1_0_0; }
		
		//ModelElementEqualsEnumerationLiteral
		public RuleCall getInStatesModelElementEqualsEnumerationLiteralParserRuleCall_1_0_1() { return cInStatesModelElementEqualsEnumerationLiteralParserRuleCall_1_0_1; }
	}
	public class EndToEndFlowElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.EndToEndFlow");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cEndToEndFLowKeywordsParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Assignment cElementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cElementsPathElementParserRuleCall_3_0 = (RuleCall)cElementsAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cElementsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cElementsPathElementParserRuleCall_4_1_0 = (RuleCall)cElementsAssignment_4_1.eContents().get(0);
		private final RuleCall cPropertiesBlockParserRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//EndToEndFlow av3::PathSequence:
		//	name=ID ':' EndToEndFLowKeywords elements+=PathElement ('->' elements+=PathElement)+ PropertiesBlock? ';';
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' EndToEndFLowKeywords elements+=PathElement ('->' elements+=PathElement)+ PropertiesBlock? ';'
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//EndToEndFLowKeywords
		public RuleCall getEndToEndFLowKeywordsParserRuleCall_2() { return cEndToEndFLowKeywordsParserRuleCall_2; }
		
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
		
		//({av3::PathElement.context=current} '.' element=[av3::ModelElement])
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
		
		//(importedNamespace=QualifiedNameWithWildcard | importedNamespace=QualifiedName)
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
		
		//(assignedClassifiers+=ClassifierOrTypeReference (',' assignedClassifiers+=ClassifierOrTypeReference)*
		//CurlyConfigurationElementBlock? | CurlyConfigurationElementBlock)
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
		
		//(assignedClassifiers+=ClassifierOrTypeReference (',' assignedClassifiers+=ClassifierOrTypeReference)*
		//CurlyConfigurationElementBlock? | CurlyConfigurationElementBlock)
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
	public class ConnectionAssignmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ConnectionAssignment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTargetAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTargetModelElementReferenceParserRuleCall_0_0 = (RuleCall)cTargetAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cConnectionKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cElementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cElementsPathElementParserRuleCall_3_0 = (RuleCall)cElementsAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cElementsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cElementsPathElementParserRuleCall_4_1_0 = (RuleCall)cElementsAssignment_4_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//ConnectionAssignment av3::PathSequence:
		//	target=ModelElementReference '=>' 'connection' elements+=PathElement ('->' elements+=PathElement)* ';';
		@Override public ParserRule getRule() { return rule; }
		
		//target=ModelElementReference '=>' 'connection' elements+=PathElement ('->' elements+=PathElement)* ';'
		public Group getGroup() { return cGroup; }
		
		//target=ModelElementReference
		public Assignment getTargetAssignment_0() { return cTargetAssignment_0; }
		
		//ModelElementReference
		public RuleCall getTargetModelElementReferenceParserRuleCall_0_0() { return cTargetModelElementReferenceParserRuleCall_0_0; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_1() { return cEqualsSignGreaterThanSignKeyword_1; }
		
		//'connection'
		public Keyword getConnectionKeyword_2() { return cConnectionKeyword_2; }
		
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
		private final Assignment cElementsAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final Alternatives cElementsAlternatives_1_0 = (Alternatives)cElementsAssignment_1.eContents().get(0);
		private final RuleCall cElementsBehaviorAnnotationBlockParserRuleCall_1_0_0 = (RuleCall)cElementsAlternatives_1_0.eContents().get(0);
		private final RuleCall cElementsEndToEndFlowParserRuleCall_1_0_1 = (RuleCall)cElementsAlternatives_1_0.eContents().get(1);
		private final RuleCall cElementsBehaviorAnnotationBlockParserRuleCall_1_0_2 = (RuleCall)cElementsAlternatives_1_0.eContents().get(2);
		private final RuleCall cElementsStateVariableParserRuleCall_1_0_3 = (RuleCall)cElementsAlternatives_1_0.eContents().get(3);
		private final RuleCall cElementsStateTransitionParserRuleCall_1_0_4 = (RuleCall)cElementsAlternatives_1_0.eContents().get(4);
		private final RuleCall cElementsStateSynchronizationParserRuleCall_1_0_5 = (RuleCall)cElementsAlternatives_1_0.eContents().get(5);
		private final RuleCall cElementsBehaviorParserRuleCall_1_0_6 = (RuleCall)cElementsAlternatives_1_0.eContents().get(6);
		private final RuleCall cElementsGeneratorParserRuleCall_1_0_7 = (RuleCall)cElementsAlternatives_1_0.eContents().get(7);
		private final RuleCall cElementsBindingParserRuleCall_1_0_8 = (RuleCall)cElementsAlternatives_1_0.eContents().get(8);
		private final Assignment cFlowAssignmentsAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final RuleCall cFlowAssignmentsFlowAssignmentParserRuleCall_2_0 = (RuleCall)cFlowAssignmentsAssignment_2.eContents().get(0);
		private final Assignment cClassifierAssignmentsAssignment_3 = (Assignment)cAlternatives.eContents().get(3);
		private final RuleCall cClassifierAssignmentsClassifierAssignmentParserRuleCall_3_0 = (RuleCall)cClassifierAssignmentsAssignment_3.eContents().get(0);
		private final Assignment cClassifierAssignmentsAssignment_4 = (Assignment)cAlternatives.eContents().get(4);
		private final RuleCall cClassifierAssignmentsClassifierAssignmentPatternParserRuleCall_4_0 = (RuleCall)cClassifierAssignmentsAssignment_4.eContents().get(0);
		private final Assignment cElementsAssignment_5 = (Assignment)cAlternatives.eContents().get(5);
		private final RuleCall cElementsAnnexSubclauseParserRuleCall_5_0 = (RuleCall)cElementsAssignment_5.eContents().get(0);
		
		//fragment ConfigurationElement *:
		//	ownedPropertyAssociations+=PropertyAssociation | elements+=(BehaviorAnnotationBlock | EndToEndFlow |
		//	BehaviorAnnotationBlock | StateVariable | StateTransition | StateSynchronization | Behavior | Generator | Binding) |
		//	flowAssignments+=FlowAssignment | classifierAssignments+=ClassifierAssignment |
		//	classifierAssignments+=ClassifierAssignmentPattern | elements+=AnnexSubclause;
		@Override public ParserRule getRule() { return rule; }
		
		//ownedPropertyAssociations+=PropertyAssociation | elements+=(BehaviorAnnotationBlock | EndToEndFlow |
		//BehaviorAnnotationBlock | StateVariable | StateTransition | StateSynchronization | Behavior | Generator | Binding) |
		//flowAssignments+=FlowAssignment | classifierAssignments+=ClassifierAssignment |
		//classifierAssignments+=ClassifierAssignmentPattern | elements+=AnnexSubclause
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ownedPropertyAssociations+=PropertyAssociation
		public Assignment getOwnedPropertyAssociationsAssignment_0() { return cOwnedPropertyAssociationsAssignment_0; }
		
		//PropertyAssociation
		public RuleCall getOwnedPropertyAssociationsPropertyAssociationParserRuleCall_0_0() { return cOwnedPropertyAssociationsPropertyAssociationParserRuleCall_0_0; }
		
		//elements+=(BehaviorAnnotationBlock | EndToEndFlow | BehaviorAnnotationBlock | StateVariable | StateTransition |
		//StateSynchronization | Behavior | Generator | Binding)
		public Assignment getElementsAssignment_1() { return cElementsAssignment_1; }
		
		//(BehaviorAnnotationBlock | EndToEndFlow | BehaviorAnnotationBlock | StateVariable | StateTransition |
		//StateSynchronization | Behavior | Generator | Binding)
		public Alternatives getElementsAlternatives_1_0() { return cElementsAlternatives_1_0; }
		
		//BehaviorAnnotationBlock
		public RuleCall getElementsBehaviorAnnotationBlockParserRuleCall_1_0_0() { return cElementsBehaviorAnnotationBlockParserRuleCall_1_0_0; }
		
		//EndToEndFlow
		public RuleCall getElementsEndToEndFlowParserRuleCall_1_0_1() { return cElementsEndToEndFlowParserRuleCall_1_0_1; }
		
		//BehaviorAnnotationBlock
		public RuleCall getElementsBehaviorAnnotationBlockParserRuleCall_1_0_2() { return cElementsBehaviorAnnotationBlockParserRuleCall_1_0_2; }
		
		//StateVariable
		public RuleCall getElementsStateVariableParserRuleCall_1_0_3() { return cElementsStateVariableParserRuleCall_1_0_3; }
		
		//StateTransition
		public RuleCall getElementsStateTransitionParserRuleCall_1_0_4() { return cElementsStateTransitionParserRuleCall_1_0_4; }
		
		//StateSynchronization
		public RuleCall getElementsStateSynchronizationParserRuleCall_1_0_5() { return cElementsStateSynchronizationParserRuleCall_1_0_5; }
		
		//Behavior
		public RuleCall getElementsBehaviorParserRuleCall_1_0_6() { return cElementsBehaviorParserRuleCall_1_0_6; }
		
		//Generator
		public RuleCall getElementsGeneratorParserRuleCall_1_0_7() { return cElementsGeneratorParserRuleCall_1_0_7; }
		
		//Binding
		public RuleCall getElementsBindingParserRuleCall_1_0_8() { return cElementsBindingParserRuleCall_1_0_8; }
		
		//flowAssignments+=FlowAssignment
		public Assignment getFlowAssignmentsAssignment_2() { return cFlowAssignmentsAssignment_2; }
		
		//FlowAssignment
		public RuleCall getFlowAssignmentsFlowAssignmentParserRuleCall_2_0() { return cFlowAssignmentsFlowAssignmentParserRuleCall_2_0; }
		
		//classifierAssignments+=ClassifierAssignment
		public Assignment getClassifierAssignmentsAssignment_3() { return cClassifierAssignmentsAssignment_3; }
		
		//ClassifierAssignment
		public RuleCall getClassifierAssignmentsClassifierAssignmentParserRuleCall_3_0() { return cClassifierAssignmentsClassifierAssignmentParserRuleCall_3_0; }
		
		//classifierAssignments+=ClassifierAssignmentPattern
		public Assignment getClassifierAssignmentsAssignment_4() { return cClassifierAssignmentsAssignment_4; }
		
		//ClassifierAssignmentPattern
		public RuleCall getClassifierAssignmentsClassifierAssignmentPatternParserRuleCall_4_0() { return cClassifierAssignmentsClassifierAssignmentPatternParserRuleCall_4_0; }
		
		//elements+=AnnexSubclause
		public Assignment getElementsAssignment_5() { return cElementsAssignment_5; }
		
		//AnnexSubclause
		public RuleCall getElementsAnnexSubclauseParserRuleCall_5_0() { return cElementsAnnexSubclauseParserRuleCall_5_0; }
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
		private final RuleCall cDefaultAnnexSubclauseParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//AnnexSubclause av3::AnnexSubclause:
		//	DefaultAnnexSubclause;
		@Override public ParserRule getRule() { return rule; }
		
		//DefaultAnnexSubclause
		public RuleCall getDefaultAnnexSubclauseParserRuleCall() { return cDefaultAnnexSubclauseParserRuleCall; }
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
		private final Assignment cActionsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cActionsSTRINGTerminalRuleCall_5_0 = (RuleCall)cActionsAssignment_5.eContents().get(0);
		private final Assignment cProductlineConstraintAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cProductlineConstraintProductLineConstraintParserRuleCall_6_0 = (RuleCall)cProductlineConstraintAssignment_6.eContents().get(0);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//InstanceConfiguration av3::InstanceConfiguration:
		//	{av3::InstanceConfiguration} name=ID ':' category=ComponentCategory typeReferences+=ClassifierOrTypeReference
		//	actions+=STRING* productlineConstraint=ProductLineConstraint? ';';
		@Override public ParserRule getRule() { return rule; }
		
		//{av3::InstanceConfiguration} name=ID ':' category=ComponentCategory typeReferences+=ClassifierOrTypeReference
		//actions+=STRING* productlineConstraint=ProductLineConstraint? ';'
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
		
		//actions+=STRING*
		public Assignment getActionsAssignment_5() { return cActionsAssignment_5; }
		
		//STRING
		public RuleCall getActionsSTRINGTerminalRuleCall_5_0() { return cActionsSTRINGTerminalRuleCall_5_0; }
		
		//productlineConstraint=ProductLineConstraint?
		public Assignment getProductlineConstraintAssignment_6() { return cProductlineConstraintAssignment_6; }
		
		//ProductLineConstraint
		public RuleCall getProductlineConstraintProductLineConstraintParserRuleCall_6_0() { return cProductlineConstraintProductLineConstraintParserRuleCall_6_0; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}
	public class ProductLineConstraintElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ProductLineConstraint");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cBinaryOperationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cPlcKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cLeftAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLeftPropertyReferenceParserRuleCall_2_0 = (RuleCall)cLeftAssignment_2.eContents().get(0);
		private final Assignment cOperatorAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cOperatorSatisfiesOperationParserRuleCall_3_0 = (RuleCall)cOperatorAssignment_3.eContents().get(0);
		private final Assignment cRightAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cRightListLiteralParserRuleCall_4_0 = (RuleCall)cRightAssignment_4.eContents().get(0);
		
		//ProductLineConstraint av3::BinaryOperation:
		//	{av3::BinaryOperation} 'plc' left=PropertyReference operator=SatisfiesOperation right=ListLiteral;
		@Override public ParserRule getRule() { return rule; }
		
		//{av3::BinaryOperation} 'plc' left=PropertyReference operator=SatisfiesOperation right=ListLiteral
		public Group getGroup() { return cGroup; }
		
		//{av3::BinaryOperation}
		public Action getBinaryOperationAction_0() { return cBinaryOperationAction_0; }
		
		//'plc'
		public Keyword getPlcKeyword_1() { return cPlcKeyword_1; }
		
		//left=PropertyReference
		public Assignment getLeftAssignment_2() { return cLeftAssignment_2; }
		
		//PropertyReference
		public RuleCall getLeftPropertyReferenceParserRuleCall_2_0() { return cLeftPropertyReferenceParserRuleCall_2_0; }
		
		//operator=SatisfiesOperation
		public Assignment getOperatorAssignment_3() { return cOperatorAssignment_3; }
		
		//SatisfiesOperation
		public RuleCall getOperatorSatisfiesOperationParserRuleCall_3_0() { return cOperatorSatisfiesOperationParserRuleCall_3_0; }
		
		//right=ListLiteral
		public Assignment getRightAssignment_4() { return cRightAssignment_4; }
		
		//ListLiteral
		public RuleCall getRightListLiteralParserRuleCall_4_0() { return cRightListLiteralParserRuleCall_4_0; }
	}
	public class BehaviorAnnotationBlockElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.BehaviorAnnotationBlock");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCommercialAtKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final RuleCall cBehaviorAnnotationElementsParserRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//// Behavior specification including error behavior
		// BehaviorAnnotationBlock av3::AnnotationBlock:
		//	'@' name=ID '{' BehaviorAnnotationElements '}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'@' name=ID '{' BehaviorAnnotationElements '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'@'
		public Keyword getCommercialAtKeyword_0() { return cCommercialAtKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//BehaviorAnnotationElements
		public RuleCall getBehaviorAnnotationElementsParserRuleCall_3() { return cBehaviorAnnotationElementsParserRuleCall_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class BehaviorAnnotationElementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.BehaviorAnnotationElements");
		private final RuleCall cBehaviorAnnotationElementParserRuleCall = (RuleCall)rule.eContents().get(0);
		
		//fragment BehaviorAnnotationElements *:
		//	BehaviorAnnotationElement*;
		@Override public ParserRule getRule() { return rule; }
		
		//BehaviorAnnotationElement*
		public RuleCall getBehaviorAnnotationElementParserRuleCall() { return cBehaviorAnnotationElementParserRuleCall; }
	}
	public class BehaviorAnnotationElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.BehaviorAnnotationElement");
		private final Assignment cElementsAssignment = (Assignment)rule.eContents().get(0);
		private final Alternatives cElementsAlternatives_0 = (Alternatives)cElementsAssignment.eContents().get(0);
		private final RuleCall cElementsGeneratorParserRuleCall_0_0 = (RuleCall)cElementsAlternatives_0.eContents().get(0);
		private final RuleCall cElementsStateTransitionParserRuleCall_0_1 = (RuleCall)cElementsAlternatives_0.eContents().get(1);
		private final RuleCall cElementsStateSynchronizationParserRuleCall_0_2 = (RuleCall)cElementsAlternatives_0.eContents().get(2);
		private final RuleCall cElementsBehaviorParserRuleCall_0_3 = (RuleCall)cElementsAlternatives_0.eContents().get(3);
		private final RuleCall cElementsStateVariableParserRuleCall_0_4 = (RuleCall)cElementsAlternatives_0.eContents().get(4);
		
		//fragment BehaviorAnnotationElement *:
		//	elements+=(Generator | StateTransition | StateSynchronization | Behavior | StateVariable);
		@Override public ParserRule getRule() { return rule; }
		
		//elements+=(Generator | StateTransition | StateSynchronization | Behavior | StateVariable)
		public Assignment getElementsAssignment() { return cElementsAssignment; }
		
		//(Generator | StateTransition | StateSynchronization | Behavior | StateVariable)
		public Alternatives getElementsAlternatives_0() { return cElementsAlternatives_0; }
		
		//Generator
		public RuleCall getElementsGeneratorParserRuleCall_0_0() { return cElementsGeneratorParserRuleCall_0_0; }
		
		//StateTransition
		public RuleCall getElementsStateTransitionParserRuleCall_0_1() { return cElementsStateTransitionParserRuleCall_0_1; }
		
		//StateSynchronization
		public RuleCall getElementsStateSynchronizationParserRuleCall_0_2() { return cElementsStateSynchronizationParserRuleCall_0_2; }
		
		//Behavior
		public RuleCall getElementsBehaviorParserRuleCall_0_3() { return cElementsBehaviorParserRuleCall_0_3; }
		
		//StateVariable
		public RuleCall getElementsStateVariableParserRuleCall_0_4() { return cElementsStateVariableParserRuleCall_0_4; }
	}
	public class StateVariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.StateVariable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAnnotationsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAnnotationsAnnotationParserRuleCall_0_0 = (RuleCall)cAnnotationsAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cStateKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cStateTypeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cStateTypeTypeDefCrossReference_4_0 = (CrossReference)cStateTypeAssignment_4.eContents().get(0);
		private final RuleCall cStateTypeTypeDefQualifiedNameParserRuleCall_4_0_1 = (RuleCall)cStateTypeTypeDefCrossReference_4_0.eContents().get(1);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cEqualsSignKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cInitialStateAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cInitialStateEnumerationLiteralParserRuleCall_5_1_0 = (RuleCall)cInitialStateAssignment_5_1.eContents().get(0);
		private final RuleCall cPropertiesBlockParserRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//StateVariable av3::StateVariable:
		//	annotations+=Annotation* name=ID ':' 'state' stateType=[av3::TypeDef|QualifiedName] ('='
		//	initialState=EnumerationLiteral)? PropertiesBlock? ';';
		@Override public ParserRule getRule() { return rule; }
		
		//annotations+=Annotation* name=ID ':' 'state' stateType=[av3::TypeDef|QualifiedName] ('='
		//initialState=EnumerationLiteral)? PropertiesBlock? ';'
		public Group getGroup() { return cGroup; }
		
		//annotations+=Annotation*
		public Assignment getAnnotationsAssignment_0() { return cAnnotationsAssignment_0; }
		
		//Annotation
		public RuleCall getAnnotationsAnnotationParserRuleCall_0_0() { return cAnnotationsAnnotationParserRuleCall_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//'state'
		public Keyword getStateKeyword_3() { return cStateKeyword_3; }
		
		//stateType=[av3::TypeDef|QualifiedName]
		public Assignment getStateTypeAssignment_4() { return cStateTypeAssignment_4; }
		
		//[av3::TypeDef|QualifiedName]
		public CrossReference getStateTypeTypeDefCrossReference_4_0() { return cStateTypeTypeDefCrossReference_4_0; }
		
		//QualifiedName
		public RuleCall getStateTypeTypeDefQualifiedNameParserRuleCall_4_0_1() { return cStateTypeTypeDefQualifiedNameParserRuleCall_4_0_1; }
		
		//('=' initialState=EnumerationLiteral)?
		public Group getGroup_5() { return cGroup_5; }
		
		//'='
		public Keyword getEqualsSignKeyword_5_0() { return cEqualsSignKeyword_5_0; }
		
		//initialState=EnumerationLiteral
		public Assignment getInitialStateAssignment_5_1() { return cInitialStateAssignment_5_1; }
		
		//EnumerationLiteral
		public RuleCall getInitialStateEnumerationLiteralParserRuleCall_5_1_0() { return cInitialStateEnumerationLiteralParserRuleCall_5_1_0; }
		
		//PropertiesBlock?
		public RuleCall getPropertiesBlockParserRuleCall_6() { return cPropertiesBlockParserRuleCall_6; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}
	public class GeneratorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.Generator");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAnnotationsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAnnotationsAnnotationParserRuleCall_0_0 = (RuleCall)cAnnotationsAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cGeneratorKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cValueListLiteralParserRuleCall_4_0 = (RuleCall)cValueAssignment_4.eContents().get(0);
		private final RuleCall cInStatesParserRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final RuleCall cPropertiesBlockParserRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Generator av3::Generator:
		//	annotations+=Annotation* name=ID ':' 'generator' value=ListLiteral? InStates? PropertiesBlock? ';';
		@Override public ParserRule getRule() { return rule; }
		
		//annotations+=Annotation* name=ID ':' 'generator' value=ListLiteral? InStates? PropertiesBlock? ';'
		public Group getGroup() { return cGroup; }
		
		//annotations+=Annotation*
		public Assignment getAnnotationsAssignment_0() { return cAnnotationsAssignment_0; }
		
		//Annotation
		public RuleCall getAnnotationsAnnotationParserRuleCall_0_0() { return cAnnotationsAnnotationParserRuleCall_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//'generator'
		public Keyword getGeneratorKeyword_3() { return cGeneratorKeyword_3; }
		
		//value=ListLiteral?
		public Assignment getValueAssignment_4() { return cValueAssignment_4; }
		
		//ListLiteral
		public RuleCall getValueListLiteralParserRuleCall_4_0() { return cValueListLiteralParserRuleCall_4_0; }
		
		//InStates?
		public RuleCall getInStatesParserRuleCall_5() { return cInStatesParserRuleCall_5; }
		
		//PropertiesBlock?
		public RuleCall getPropertiesBlockParserRuleCall_6() { return cPropertiesBlockParserRuleCall_6; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}
	public class StateTransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.StateTransition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAnnotationsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAnnotationsAnnotationParserRuleCall_0_0 = (RuleCall)cAnnotationsAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cTransitionKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cConditionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final Alternatives cConditionAlternatives_4_0 = (Alternatives)cConditionAssignment_4.eContents().get(0);
		private final RuleCall cConditionMultiLiteralOperationParserRuleCall_4_0_0 = (RuleCall)cConditionAlternatives_4_0.eContents().get(0);
		private final RuleCall cConditionModelElementContainsLiteralParserRuleCall_4_0_1 = (RuleCall)cConditionAlternatives_4_0.eContents().get(1);
		private final RuleCall cConditionModelElementReferenceParserRuleCall_4_0_2 = (RuleCall)cConditionAlternatives_4_0.eContents().get(2);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cTargetStateAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cTargetStateModelElementEqualsEnumerationLiteralParserRuleCall_6_0 = (RuleCall)cTargetStateAssignment_6.eContents().get(0);
		private final RuleCall cInStatesParserRuleCall_7 = (RuleCall)cGroup.eContents().get(7);
		private final RuleCall cPropertiesBlockParserRuleCall_8 = (RuleCall)cGroup.eContents().get(8);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//StateTransition av3::StateTransition:
		//	annotations+=Annotation* name=ID ':' 'transition' condition=(MultiLiteralOperation | ModelElementContainsLiteral |
		//	ModelElementReference) '->' targetState=ModelElementEqualsEnumerationLiteral InStates? PropertiesBlock? ';';
		@Override public ParserRule getRule() { return rule; }
		
		//annotations+=Annotation* name=ID ':' 'transition' condition=(MultiLiteralOperation | ModelElementContainsLiteral |
		//ModelElementReference) '->' targetState=ModelElementEqualsEnumerationLiteral InStates? PropertiesBlock? ';'
		public Group getGroup() { return cGroup; }
		
		//annotations+=Annotation*
		public Assignment getAnnotationsAssignment_0() { return cAnnotationsAssignment_0; }
		
		//Annotation
		public RuleCall getAnnotationsAnnotationParserRuleCall_0_0() { return cAnnotationsAnnotationParserRuleCall_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//'transition'
		public Keyword getTransitionKeyword_3() { return cTransitionKeyword_3; }
		
		//condition=(MultiLiteralOperation | ModelElementContainsLiteral | ModelElementReference)
		public Assignment getConditionAssignment_4() { return cConditionAssignment_4; }
		
		//(MultiLiteralOperation | ModelElementContainsLiteral | ModelElementReference)
		public Alternatives getConditionAlternatives_4_0() { return cConditionAlternatives_4_0; }
		
		//MultiLiteralOperation
		public RuleCall getConditionMultiLiteralOperationParserRuleCall_4_0_0() { return cConditionMultiLiteralOperationParserRuleCall_4_0_0; }
		
		//ModelElementContainsLiteral
		public RuleCall getConditionModelElementContainsLiteralParserRuleCall_4_0_1() { return cConditionModelElementContainsLiteralParserRuleCall_4_0_1; }
		
		//ModelElementReference
		public RuleCall getConditionModelElementReferenceParserRuleCall_4_0_2() { return cConditionModelElementReferenceParserRuleCall_4_0_2; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_5() { return cHyphenMinusGreaterThanSignKeyword_5; }
		
		//targetState=ModelElementEqualsEnumerationLiteral
		public Assignment getTargetStateAssignment_6() { return cTargetStateAssignment_6; }
		
		//ModelElementEqualsEnumerationLiteral
		public RuleCall getTargetStateModelElementEqualsEnumerationLiteralParserRuleCall_6_0() { return cTargetStateModelElementEqualsEnumerationLiteralParserRuleCall_6_0; }
		
		//InStates?
		public RuleCall getInStatesParserRuleCall_7() { return cInStatesParserRuleCall_7; }
		
		//PropertiesBlock?
		public RuleCall getPropertiesBlockParserRuleCall_8() { return cPropertiesBlockParserRuleCall_8; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
	}
	public class StateSynchronizationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.StateSynchronization");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAnnotationsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAnnotationsAnnotationParserRuleCall_0_0 = (RuleCall)cAnnotationsAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cSyncKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Alternatives cAlternatives_4 = (Alternatives)cGroup.eContents().get(4);
		private final Group cGroup_4_0 = (Group)cAlternatives_4.eContents().get(0);
		private final Assignment cConditionAssignment_4_0_0 = (Assignment)cGroup_4_0.eContents().get(0);
		private final Alternatives cConditionAlternatives_4_0_0_0 = (Alternatives)cConditionAssignment_4_0_0.eContents().get(0);
		private final RuleCall cConditionMultiLiteralOperationParserRuleCall_4_0_0_0_0 = (RuleCall)cConditionAlternatives_4_0_0_0.eContents().get(0);
		private final RuleCall cConditionModelElementContainsEnumerationLiteralParserRuleCall_4_0_0_0_1 = (RuleCall)cConditionAlternatives_4_0_0_0.eContents().get(1);
		private final RuleCall cConditionModelElementEqualsEnumerationLiteralParserRuleCall_4_0_0_0_2 = (RuleCall)cConditionAlternatives_4_0_0_0.eContents().get(2);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_4_0_1 = (Keyword)cGroup_4_0.eContents().get(1);
		private final Assignment cTargetStateAssignment_4_0_2 = (Assignment)cGroup_4_0.eContents().get(2);
		private final RuleCall cTargetStateModelElementEqualsEnumerationLiteralParserRuleCall_4_0_2_0 = (RuleCall)cTargetStateAssignment_4_0_2.eContents().get(0);
		private final Group cGroup_4_1 = (Group)cAlternatives_4.eContents().get(1);
		private final Assignment cTargetStateAssignment_4_1_0 = (Assignment)cGroup_4_1.eContents().get(0);
		private final RuleCall cTargetStateModelElementEqualsEnumerationLiteralParserRuleCall_4_1_0_0 = (RuleCall)cTargetStateAssignment_4_1_0.eContents().get(0);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_4_1_1 = (Keyword)cGroup_4_1.eContents().get(1);
		private final Assignment cConditionAssignment_4_1_2 = (Assignment)cGroup_4_1.eContents().get(2);
		private final Alternatives cConditionAlternatives_4_1_2_0 = (Alternatives)cConditionAssignment_4_1_2.eContents().get(0);
		private final RuleCall cConditionMultiLiteralOperationParserRuleCall_4_1_2_0_0 = (RuleCall)cConditionAlternatives_4_1_2_0.eContents().get(0);
		private final RuleCall cConditionModelElementContainsEnumerationLiteralParserRuleCall_4_1_2_0_1 = (RuleCall)cConditionAlternatives_4_1_2_0.eContents().get(1);
		private final RuleCall cConditionModelElementEqualsEnumerationLiteralParserRuleCall_4_1_2_0_2 = (RuleCall)cConditionAlternatives_4_1_2_0.eContents().get(2);
		private final RuleCall cInStatesParserRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final RuleCall cPropertiesBlockParserRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//StateSynchronization av3::StateSynchronization:
		//	annotations+=Annotation* name=ID ':' 'sync' (condition=(MultiLiteralOperation |
		//	ModelElementContainsEnumerationLiteral | ModelElementEqualsEnumerationLiteral) '->'
		//	targetState=ModelElementEqualsEnumerationLiteral | targetState=ModelElementEqualsEnumerationLiteral '->'
		//	condition=(MultiLiteralOperation | ModelElementContainsEnumerationLiteral | ModelElementEqualsEnumerationLiteral))
		//	InStates? PropertiesBlock? ';';
		@Override public ParserRule getRule() { return rule; }
		
		//annotations+=Annotation* name=ID ':' 'sync' (condition=(MultiLiteralOperation | ModelElementContainsEnumerationLiteral |
		//ModelElementEqualsEnumerationLiteral) '->' targetState=ModelElementEqualsEnumerationLiteral |
		//targetState=ModelElementEqualsEnumerationLiteral '->' condition=(MultiLiteralOperation |
		//ModelElementContainsEnumerationLiteral | ModelElementEqualsEnumerationLiteral)) InStates? PropertiesBlock? ';'
		public Group getGroup() { return cGroup; }
		
		//annotations+=Annotation*
		public Assignment getAnnotationsAssignment_0() { return cAnnotationsAssignment_0; }
		
		//Annotation
		public RuleCall getAnnotationsAnnotationParserRuleCall_0_0() { return cAnnotationsAnnotationParserRuleCall_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//'sync'
		public Keyword getSyncKeyword_3() { return cSyncKeyword_3; }
		
		//(condition=(MultiLiteralOperation | ModelElementContainsEnumerationLiteral | ModelElementEqualsEnumerationLiteral) '->'
		//targetState=ModelElementEqualsEnumerationLiteral | targetState=ModelElementEqualsEnumerationLiteral '->'
		//condition=(MultiLiteralOperation | ModelElementContainsEnumerationLiteral | ModelElementEqualsEnumerationLiteral))
		public Alternatives getAlternatives_4() { return cAlternatives_4; }
		
		//condition=(MultiLiteralOperation | ModelElementContainsEnumerationLiteral | ModelElementEqualsEnumerationLiteral) '->'
		//targetState=ModelElementEqualsEnumerationLiteral
		public Group getGroup_4_0() { return cGroup_4_0; }
		
		//condition=(MultiLiteralOperation | ModelElementContainsEnumerationLiteral | ModelElementEqualsEnumerationLiteral)
		public Assignment getConditionAssignment_4_0_0() { return cConditionAssignment_4_0_0; }
		
		//(MultiLiteralOperation | ModelElementContainsEnumerationLiteral | ModelElementEqualsEnumerationLiteral)
		public Alternatives getConditionAlternatives_4_0_0_0() { return cConditionAlternatives_4_0_0_0; }
		
		//MultiLiteralOperation
		public RuleCall getConditionMultiLiteralOperationParserRuleCall_4_0_0_0_0() { return cConditionMultiLiteralOperationParserRuleCall_4_0_0_0_0; }
		
		//ModelElementContainsEnumerationLiteral
		public RuleCall getConditionModelElementContainsEnumerationLiteralParserRuleCall_4_0_0_0_1() { return cConditionModelElementContainsEnumerationLiteralParserRuleCall_4_0_0_0_1; }
		
		//ModelElementEqualsEnumerationLiteral
		public RuleCall getConditionModelElementEqualsEnumerationLiteralParserRuleCall_4_0_0_0_2() { return cConditionModelElementEqualsEnumerationLiteralParserRuleCall_4_0_0_0_2; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_4_0_1() { return cHyphenMinusGreaterThanSignKeyword_4_0_1; }
		
		//targetState=ModelElementEqualsEnumerationLiteral
		public Assignment getTargetStateAssignment_4_0_2() { return cTargetStateAssignment_4_0_2; }
		
		//ModelElementEqualsEnumerationLiteral
		public RuleCall getTargetStateModelElementEqualsEnumerationLiteralParserRuleCall_4_0_2_0() { return cTargetStateModelElementEqualsEnumerationLiteralParserRuleCall_4_0_2_0; }
		
		//targetState=ModelElementEqualsEnumerationLiteral '->' condition=(MultiLiteralOperation |
		//ModelElementContainsEnumerationLiteral | ModelElementEqualsEnumerationLiteral)
		public Group getGroup_4_1() { return cGroup_4_1; }
		
		//targetState=ModelElementEqualsEnumerationLiteral
		public Assignment getTargetStateAssignment_4_1_0() { return cTargetStateAssignment_4_1_0; }
		
		//ModelElementEqualsEnumerationLiteral
		public RuleCall getTargetStateModelElementEqualsEnumerationLiteralParserRuleCall_4_1_0_0() { return cTargetStateModelElementEqualsEnumerationLiteralParserRuleCall_4_1_0_0; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_4_1_1() { return cHyphenMinusGreaterThanSignKeyword_4_1_1; }
		
		//condition=(MultiLiteralOperation | ModelElementContainsEnumerationLiteral | ModelElementEqualsEnumerationLiteral)
		public Assignment getConditionAssignment_4_1_2() { return cConditionAssignment_4_1_2; }
		
		//(MultiLiteralOperation | ModelElementContainsEnumerationLiteral | ModelElementEqualsEnumerationLiteral)
		public Alternatives getConditionAlternatives_4_1_2_0() { return cConditionAlternatives_4_1_2_0; }
		
		//MultiLiteralOperation
		public RuleCall getConditionMultiLiteralOperationParserRuleCall_4_1_2_0_0() { return cConditionMultiLiteralOperationParserRuleCall_4_1_2_0_0; }
		
		//ModelElementContainsEnumerationLiteral
		public RuleCall getConditionModelElementContainsEnumerationLiteralParserRuleCall_4_1_2_0_1() { return cConditionModelElementContainsEnumerationLiteralParserRuleCall_4_1_2_0_1; }
		
		//ModelElementEqualsEnumerationLiteral
		public RuleCall getConditionModelElementEqualsEnumerationLiteralParserRuleCall_4_1_2_0_2() { return cConditionModelElementEqualsEnumerationLiteralParserRuleCall_4_1_2_0_2; }
		
		//InStates?
		public RuleCall getInStatesParserRuleCall_5() { return cInStatesParserRuleCall_5; }
		
		//PropertiesBlock?
		public RuleCall getPropertiesBlockParserRuleCall_6() { return cPropertiesBlockParserRuleCall_6; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}
	public class BehaviorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.Behavior");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cTokenFlowParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cComputationalBehaviorParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Behavior av3::Behavior:
		//	TokenFlow | ComputationalBehavior;
		@Override public ParserRule getRule() { return rule; }
		
		//TokenFlow | ComputationalBehavior
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//TokenFlow
		public RuleCall getTokenFlowParserRuleCall_0() { return cTokenFlowParserRuleCall_0; }
		
		//ComputationalBehavior
		public RuleCall getComputationalBehaviorParserRuleCall_1() { return cComputationalBehaviorParserRuleCall_1; }
	}
	public class TokenFlowElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.TokenFlow");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAnnotationsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAnnotationsAnnotationParserRuleCall_0_0 = (RuleCall)cAnnotationsAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cCategoryAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cCategoryIsFlowCategoryParserRuleCall_3_0 = (RuleCall)cCategoryAssignment_3.eContents().get(0);
		private final Alternatives cAlternatives_4 = (Alternatives)cGroup.eContents().get(4);
		private final Group cGroup_4_0 = (Group)cAlternatives_4.eContents().get(0);
		private final Assignment cConditionAssignment_4_0_0 = (Assignment)cGroup_4_0.eContents().get(0);
		private final Alternatives cConditionAlternatives_4_0_0_0 = (Alternatives)cConditionAssignment_4_0_0.eContents().get(0);
		private final RuleCall cConditionMultiLiteralOperationParserRuleCall_4_0_0_0_0 = (RuleCall)cConditionAlternatives_4_0_0_0.eContents().get(0);
		private final RuleCall cConditionModelElementContainsLiteralParserRuleCall_4_0_0_0_1 = (RuleCall)cConditionAlternatives_4_0_0_0.eContents().get(1);
		private final RuleCall cConditionModelElementEqualsLiteralParserRuleCall_4_0_0_0_2 = (RuleCall)cConditionAlternatives_4_0_0_0.eContents().get(2);
		private final RuleCall cConditionModelElementReferenceParserRuleCall_4_0_0_0_3 = (RuleCall)cConditionAlternatives_4_0_0_0.eContents().get(3);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_4_0_1 = (Keyword)cGroup_4_0.eContents().get(1);
		private final Alternatives cAlternatives_4_0_2 = (Alternatives)cGroup_4_0.eContents().get(2);
		private final Assignment cSinkAssignment_4_0_2_0 = (Assignment)cAlternatives_4_0_2.eContents().get(0);
		private final Keyword cSinkSinkKeyword_4_0_2_0_0 = (Keyword)cSinkAssignment_4_0_2_0.eContents().get(0);
		private final RuleCall cTokenResultBlockParserRuleCall_4_0_2_1 = (RuleCall)cAlternatives_4_0_2.eContents().get(1);
		private final Group cGroup_4_1 = (Group)cAlternatives_4.eContents().get(1);
		private final Assignment cSourceAssignment_4_1_0 = (Assignment)cGroup_4_1.eContents().get(0);
		private final Keyword cSourceSourceKeyword_4_1_0_0 = (Keyword)cSourceAssignment_4_1_0.eContents().get(0);
		private final Assignment cConditionAssignment_4_1_1 = (Assignment)cGroup_4_1.eContents().get(1);
		private final Alternatives cConditionAlternatives_4_1_1_0 = (Alternatives)cConditionAssignment_4_1_1.eContents().get(0);
		private final RuleCall cConditionMultiLiteralOperationParserRuleCall_4_1_1_0_0 = (RuleCall)cConditionAlternatives_4_1_1_0.eContents().get(0);
		private final RuleCall cConditionModelElementContainsLiteralParserRuleCall_4_1_1_0_1 = (RuleCall)cConditionAlternatives_4_1_1_0.eContents().get(1);
		private final RuleCall cConditionModelElementEqualsLiteralParserRuleCall_4_1_1_0_2 = (RuleCall)cConditionAlternatives_4_1_1_0.eContents().get(2);
		private final RuleCall cConditionModelElementReferenceParserRuleCall_4_1_1_0_3 = (RuleCall)cConditionAlternatives_4_1_1_0.eContents().get(3);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_4_1_2 = (Keyword)cGroup_4_1.eContents().get(2);
		private final RuleCall cTokenResultBlockParserRuleCall_4_1_3 = (RuleCall)cGroup_4_1.eContents().get(3);
		private final RuleCall cInStatesParserRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final RuleCall cPropertiesBlockParserRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		////
		// //FlowPath returns av3::Behavior :
		// //	(annotations+=Annotation )*
		//
		////	name=ID ':' 'flow' condition =(ListLiteral | ModelElementReference) '->'  ( sink?='sink' | (actions+=FlowOutput (',' actions+=FlowOutput)* ))
		//
		////	(InStates )? PropertiesBlock?';'
		// //;
		// //FlowSource returns av3::Behavior :
		// //	(annotations+=Annotation )*
		//
		////	name=ID ':' 'flow'  source?='source' (condition =(ListLiteral | ModelElementReference)? '->' )?  actions+=FlowOutput (',' actions+=FlowOutput)* 
		//
		////	(InStates )? PropertiesBlock?';'
		// //;
		// //
		// //FlowOutput returns av3::BinaryOperation:
		//
		////	left= ModelElementReference 
		// //;
		// TokenFlow av3::Behavior:
		//	annotations+=Annotation* name=ID ':' category=IsFlowCategory (condition=(MultiLiteralOperation |
		//	ModelElementContainsLiteral | ModelElementEqualsLiteral | ModelElementReference) '->' (sink?='sink' |
		//	TokenResultBlock) | source?='source' condition=(MultiLiteralOperation | ModelElementContainsLiteral |
		//	ModelElementEqualsLiteral | ModelElementReference)? '->' TokenResultBlock) InStates? PropertiesBlock? ';';
		@Override public ParserRule getRule() { return rule; }
		
		//annotations+=Annotation* name=ID ':' category=IsFlowCategory (condition=(MultiLiteralOperation |
		//ModelElementContainsLiteral | ModelElementEqualsLiteral | ModelElementReference) '->' (sink?='sink' |
		//TokenResultBlock) | source?='source' condition=(MultiLiteralOperation | ModelElementContainsLiteral |
		//ModelElementEqualsLiteral | ModelElementReference)? '->' TokenResultBlock) InStates? PropertiesBlock? ';'
		public Group getGroup() { return cGroup; }
		
		//annotations+=Annotation*
		public Assignment getAnnotationsAssignment_0() { return cAnnotationsAssignment_0; }
		
		//Annotation
		public RuleCall getAnnotationsAnnotationParserRuleCall_0_0() { return cAnnotationsAnnotationParserRuleCall_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//category=IsFlowCategory
		public Assignment getCategoryAssignment_3() { return cCategoryAssignment_3; }
		
		//IsFlowCategory
		public RuleCall getCategoryIsFlowCategoryParserRuleCall_3_0() { return cCategoryIsFlowCategoryParserRuleCall_3_0; }
		
		//(condition=(MultiLiteralOperation | ModelElementContainsLiteral | ModelElementEqualsLiteral | ModelElementReference)
		//'->' (sink?='sink' | TokenResultBlock) | source?='source' condition=(MultiLiteralOperation |
		//ModelElementContainsLiteral | ModelElementEqualsLiteral | ModelElementReference)? '->' TokenResultBlock)
		public Alternatives getAlternatives_4() { return cAlternatives_4; }
		
		//condition=(MultiLiteralOperation | ModelElementContainsLiteral | ModelElementEqualsLiteral | ModelElementReference) '->'
		//(sink?='sink' | TokenResultBlock)
		public Group getGroup_4_0() { return cGroup_4_0; }
		
		//condition=(MultiLiteralOperation | ModelElementContainsLiteral | ModelElementEqualsLiteral | ModelElementReference)
		public Assignment getConditionAssignment_4_0_0() { return cConditionAssignment_4_0_0; }
		
		//(MultiLiteralOperation | ModelElementContainsLiteral | ModelElementEqualsLiteral | ModelElementReference)
		public Alternatives getConditionAlternatives_4_0_0_0() { return cConditionAlternatives_4_0_0_0; }
		
		//MultiLiteralOperation
		public RuleCall getConditionMultiLiteralOperationParserRuleCall_4_0_0_0_0() { return cConditionMultiLiteralOperationParserRuleCall_4_0_0_0_0; }
		
		//ModelElementContainsLiteral
		public RuleCall getConditionModelElementContainsLiteralParserRuleCall_4_0_0_0_1() { return cConditionModelElementContainsLiteralParserRuleCall_4_0_0_0_1; }
		
		//ModelElementEqualsLiteral
		public RuleCall getConditionModelElementEqualsLiteralParserRuleCall_4_0_0_0_2() { return cConditionModelElementEqualsLiteralParserRuleCall_4_0_0_0_2; }
		
		//ModelElementReference
		public RuleCall getConditionModelElementReferenceParserRuleCall_4_0_0_0_3() { return cConditionModelElementReferenceParserRuleCall_4_0_0_0_3; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_4_0_1() { return cHyphenMinusGreaterThanSignKeyword_4_0_1; }
		
		//(sink?='sink' | TokenResultBlock)
		public Alternatives getAlternatives_4_0_2() { return cAlternatives_4_0_2; }
		
		//sink?='sink'
		public Assignment getSinkAssignment_4_0_2_0() { return cSinkAssignment_4_0_2_0; }
		
		//'sink'
		public Keyword getSinkSinkKeyword_4_0_2_0_0() { return cSinkSinkKeyword_4_0_2_0_0; }
		
		//TokenResultBlock
		public RuleCall getTokenResultBlockParserRuleCall_4_0_2_1() { return cTokenResultBlockParserRuleCall_4_0_2_1; }
		
		//source?='source' condition=(MultiLiteralOperation | ModelElementContainsLiteral | ModelElementEqualsLiteral |
		//ModelElementReference)? '->' TokenResultBlock
		public Group getGroup_4_1() { return cGroup_4_1; }
		
		//source?='source'
		public Assignment getSourceAssignment_4_1_0() { return cSourceAssignment_4_1_0; }
		
		//'source'
		public Keyword getSourceSourceKeyword_4_1_0_0() { return cSourceSourceKeyword_4_1_0_0; }
		
		//condition=(MultiLiteralOperation | ModelElementContainsLiteral | ModelElementEqualsLiteral | ModelElementReference)?
		public Assignment getConditionAssignment_4_1_1() { return cConditionAssignment_4_1_1; }
		
		//(MultiLiteralOperation | ModelElementContainsLiteral | ModelElementEqualsLiteral | ModelElementReference)
		public Alternatives getConditionAlternatives_4_1_1_0() { return cConditionAlternatives_4_1_1_0; }
		
		//MultiLiteralOperation
		public RuleCall getConditionMultiLiteralOperationParserRuleCall_4_1_1_0_0() { return cConditionMultiLiteralOperationParserRuleCall_4_1_1_0_0; }
		
		//ModelElementContainsLiteral
		public RuleCall getConditionModelElementContainsLiteralParserRuleCall_4_1_1_0_1() { return cConditionModelElementContainsLiteralParserRuleCall_4_1_1_0_1; }
		
		//ModelElementEqualsLiteral
		public RuleCall getConditionModelElementEqualsLiteralParserRuleCall_4_1_1_0_2() { return cConditionModelElementEqualsLiteralParserRuleCall_4_1_1_0_2; }
		
		//ModelElementReference
		public RuleCall getConditionModelElementReferenceParserRuleCall_4_1_1_0_3() { return cConditionModelElementReferenceParserRuleCall_4_1_1_0_3; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_4_1_2() { return cHyphenMinusGreaterThanSignKeyword_4_1_2; }
		
		//TokenResultBlock
		public RuleCall getTokenResultBlockParserRuleCall_4_1_3() { return cTokenResultBlockParserRuleCall_4_1_3; }
		
		//InStates?
		public RuleCall getInStatesParserRuleCall_5() { return cInStatesParserRuleCall_5; }
		
		//PropertiesBlock?
		public RuleCall getPropertiesBlockParserRuleCall_6() { return cPropertiesBlockParserRuleCall_6; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}
	public class ComputationalBehaviorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ComputationalBehavior");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAnnotationsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAnnotationsAnnotationParserRuleCall_0_0 = (RuleCall)cAnnotationsAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cCategoryAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cCategoryIsBehaviorCategoryParserRuleCall_3_0 = (RuleCall)cCategoryAssignment_3.eContents().get(0);
		private final Assignment cConditionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cConditionLiteralParserRuleCall_4_0 = (RuleCall)cConditionAssignment_4.eContents().get(0);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final RuleCall cTokenResultBlockParserRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		private final RuleCall cInStatesParserRuleCall_7 = (RuleCall)cGroup.eContents().get(7);
		private final RuleCall cPropertiesBlockParserRuleCall_8 = (RuleCall)cGroup.eContents().get(8);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//ComputationalBehavior av3::Behavior:
		//	annotations+=Annotation* name=ID ':' category=IsBehaviorCategory condition=Literal '->' TokenResultBlock InStates?
		//	PropertiesBlock? ';';
		@Override public ParserRule getRule() { return rule; }
		
		//annotations+=Annotation* name=ID ':' category=IsBehaviorCategory condition=Literal '->' TokenResultBlock InStates?
		//PropertiesBlock? ';'
		public Group getGroup() { return cGroup; }
		
		//annotations+=Annotation*
		public Assignment getAnnotationsAssignment_0() { return cAnnotationsAssignment_0; }
		
		//Annotation
		public RuleCall getAnnotationsAnnotationParserRuleCall_0_0() { return cAnnotationsAnnotationParserRuleCall_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//category=IsBehaviorCategory
		public Assignment getCategoryAssignment_3() { return cCategoryAssignment_3; }
		
		//IsBehaviorCategory
		public RuleCall getCategoryIsBehaviorCategoryParserRuleCall_3_0() { return cCategoryIsBehaviorCategoryParserRuleCall_3_0; }
		
		//condition=Literal
		public Assignment getConditionAssignment_4() { return cConditionAssignment_4; }
		
		//Literal
		public RuleCall getConditionLiteralParserRuleCall_4_0() { return cConditionLiteralParserRuleCall_4_0; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_5() { return cHyphenMinusGreaterThanSignKeyword_5; }
		
		//TokenResultBlock
		public RuleCall getTokenResultBlockParserRuleCall_6() { return cTokenResultBlockParserRuleCall_6; }
		
		//InStates?
		public RuleCall getInStatesParserRuleCall_7() { return cInStatesParserRuleCall_7; }
		
		//PropertiesBlock?
		public RuleCall getPropertiesBlockParserRuleCall_8() { return cPropertiesBlockParserRuleCall_8; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
	}
	public class TokenResultBlockElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.TokenResultBlock");
		private final Group cGroup = (Group)rule.eContents().get(0);
		private final Assignment cActionsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cActionsTokenResultParserRuleCall_0_0 = (RuleCall)cActionsAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCommaKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cActionsAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cActionsTokenResultParserRuleCall_1_1_0 = (RuleCall)cActionsAssignment_1_1.eContents().get(0);
		
		//fragment TokenResultBlock *:
		//	actions+=TokenResult (',' actions+=TokenResult)*;
		@Override public ParserRule getRule() { return rule; }
		
		//actions+=TokenResult (',' actions+=TokenResult)*
		public Group getGroup() { return cGroup; }
		
		//actions+=TokenResult
		public Assignment getActionsAssignment_0() { return cActionsAssignment_0; }
		
		//TokenResult
		public RuleCall getActionsTokenResultParserRuleCall_0_0() { return cActionsTokenResultParserRuleCall_0_0; }
		
		//(',' actions+=TokenResult)*
		public Group getGroup_1() { return cGroup_1; }
		
		//','
		public Keyword getCommaKeyword_1_0() { return cCommaKeyword_1_0; }
		
		//actions+=TokenResult
		public Assignment getActionsAssignment_1_1() { return cActionsAssignment_1_1; }
		
		//TokenResult
		public RuleCall getActionsTokenResultParserRuleCall_1_1_0() { return cActionsTokenResultParserRuleCall_1_1_0; }
	}
	public class TokenResultElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.TokenResult");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cTokenOutputParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDetectionEventParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//TokenResult av3::BinaryOperation:
		//	TokenOutput | DetectionEvent;
		@Override public ParserRule getRule() { return rule; }
		
		//TokenOutput | DetectionEvent
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//TokenOutput
		public RuleCall getTokenOutputParserRuleCall_0() { return cTokenOutputParserRuleCall_0; }
		
		//DetectionEvent
		public RuleCall getDetectionEventParserRuleCall_1() { return cDetectionEventParserRuleCall_1; }
	}
	public class TokenOutputElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.TokenOutput");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLeftAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cLeftModelElementReferenceParserRuleCall_0_0 = (RuleCall)cLeftAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cOperatorAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cOperatorEqualsOperationParserRuleCall_1_0_0 = (RuleCall)cOperatorAssignment_1_0.eContents().get(0);
		private final Assignment cRightAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRightNamedElementReferenceParserRuleCall_1_1_0 = (RuleCall)cRightAssignment_1_1.eContents().get(0);
		
		//TokenOutput av3::BinaryOperation:
		//	left=ModelElementReference (operator=EqualsOperation right=NamedElementReference)?;
		@Override public ParserRule getRule() { return rule; }
		
		//left=ModelElementReference (operator=EqualsOperation right=NamedElementReference)?
		public Group getGroup() { return cGroup; }
		
		//left=ModelElementReference
		public Assignment getLeftAssignment_0() { return cLeftAssignment_0; }
		
		//ModelElementReference
		public RuleCall getLeftModelElementReferenceParserRuleCall_0_0() { return cLeftModelElementReferenceParserRuleCall_0_0; }
		
		//(operator=EqualsOperation right=NamedElementReference)?
		public Group getGroup_1() { return cGroup_1; }
		
		//operator=EqualsOperation
		public Assignment getOperatorAssignment_1_0() { return cOperatorAssignment_1_0; }
		
		//EqualsOperation
		public RuleCall getOperatorEqualsOperationParserRuleCall_1_0_0() { return cOperatorEqualsOperationParserRuleCall_1_0_0; }
		
		//right=NamedElementReference
		public Assignment getRightAssignment_1_1() { return cRightAssignment_1_1; }
		
		//NamedElementReference
		public RuleCall getRightNamedElementReferenceParserRuleCall_1_1_0() { return cRightNamedElementReferenceParserRuleCall_1_1_0; }
	}
	public class DetectionEventElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.DetectionEvent");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLeftAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cLeftModelElementReferenceParserRuleCall_0_0 = (RuleCall)cLeftAssignment_0.eContents().get(0);
		private final Assignment cOperatorAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cOperatorOutputOperationParserRuleCall_1_0 = (RuleCall)cOperatorAssignment_1.eContents().get(0);
		private final Assignment cRightAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cRightListLiteralParserRuleCall_2_0 = (RuleCall)cRightAssignment_2.eContents().get(0);
		
		//DetectionEvent av3::BinaryOperation:
		//	left=ModelElementReference operator=OutputOperation right=ListLiteral?;
		@Override public ParserRule getRule() { return rule; }
		
		//left=ModelElementReference operator=OutputOperation right=ListLiteral?
		public Group getGroup() { return cGroup; }
		
		//left=ModelElementReference
		public Assignment getLeftAssignment_0() { return cLeftAssignment_0; }
		
		//ModelElementReference
		public RuleCall getLeftModelElementReferenceParserRuleCall_0_0() { return cLeftModelElementReferenceParserRuleCall_0_0; }
		
		//operator=OutputOperation
		public Assignment getOperatorAssignment_1() { return cOperatorAssignment_1; }
		
		//OutputOperation
		public RuleCall getOperatorOutputOperationParserRuleCall_1_0() { return cOperatorOutputOperationParserRuleCall_1_0; }
		
		//right=ListLiteral?
		public Assignment getRightAssignment_2() { return cRightAssignment_2; }
		
		//ListLiteral
		public RuleCall getRightListLiteralParserRuleCall_2_0() { return cRightListLiteralParserRuleCall_2_0; }
	}
	public class ModelElementContainsLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ModelElementContainsLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLeftAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cLeftModelElementReferenceParserRuleCall_0_0 = (RuleCall)cLeftAssignment_0.eContents().get(0);
		private final Assignment cOperatorAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cOperatorInOperationParserRuleCall_1_0 = (RuleCall)cOperatorAssignment_1.eContents().get(0);
		private final Assignment cRightAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cRightListLiteralParserRuleCall_2_0 = (RuleCall)cRightAssignment_2.eContents().get(0);
		
		//ModelElementContainsLiteral av3::BinaryOperation:
		//	left=ModelElementReference operator=InOperation right=ListLiteral;
		@Override public ParserRule getRule() { return rule; }
		
		//left=ModelElementReference operator=InOperation right=ListLiteral
		public Group getGroup() { return cGroup; }
		
		//left=ModelElementReference
		public Assignment getLeftAssignment_0() { return cLeftAssignment_0; }
		
		//ModelElementReference
		public RuleCall getLeftModelElementReferenceParserRuleCall_0_0() { return cLeftModelElementReferenceParserRuleCall_0_0; }
		
		//operator=InOperation
		public Assignment getOperatorAssignment_1() { return cOperatorAssignment_1; }
		
		//InOperation
		public RuleCall getOperatorInOperationParserRuleCall_1_0() { return cOperatorInOperationParserRuleCall_1_0; }
		
		//right=ListLiteral
		public Assignment getRightAssignment_2() { return cRightAssignment_2; }
		
		//ListLiteral
		public RuleCall getRightListLiteralParserRuleCall_2_0() { return cRightListLiteralParserRuleCall_2_0; }
	}
	public class ModelElementContainsEnumerationLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ModelElementContainsEnumerationLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLeftAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cLeftModelElementReferenceParserRuleCall_0_0 = (RuleCall)cLeftAssignment_0.eContents().get(0);
		private final Assignment cOperatorAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cOperatorInOperationParserRuleCall_1_0 = (RuleCall)cOperatorAssignment_1.eContents().get(0);
		private final Assignment cRightAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cRightEnumerationListParserRuleCall_2_0 = (RuleCall)cRightAssignment_2.eContents().get(0);
		
		//ModelElementContainsEnumerationLiteral av3::BinaryOperation:
		//	left=ModelElementReference operator=InOperation right=EnumerationList;
		@Override public ParserRule getRule() { return rule; }
		
		//left=ModelElementReference operator=InOperation right=EnumerationList
		public Group getGroup() { return cGroup; }
		
		//left=ModelElementReference
		public Assignment getLeftAssignment_0() { return cLeftAssignment_0; }
		
		//ModelElementReference
		public RuleCall getLeftModelElementReferenceParserRuleCall_0_0() { return cLeftModelElementReferenceParserRuleCall_0_0; }
		
		//operator=InOperation
		public Assignment getOperatorAssignment_1() { return cOperatorAssignment_1; }
		
		//InOperation
		public RuleCall getOperatorInOperationParserRuleCall_1_0() { return cOperatorInOperationParserRuleCall_1_0; }
		
		//right=EnumerationList
		public Assignment getRightAssignment_2() { return cRightAssignment_2; }
		
		//EnumerationList
		public RuleCall getRightEnumerationListParserRuleCall_2_0() { return cRightEnumerationListParserRuleCall_2_0; }
	}
	public class ModelElementEqualsLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ModelElementEqualsLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLeftAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cLeftModelElementReferenceParserRuleCall_0_0 = (RuleCall)cLeftAssignment_0.eContents().get(0);
		private final Assignment cOperatorAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cOperatorEqualsOperationParserRuleCall_1_0 = (RuleCall)cOperatorAssignment_1.eContents().get(0);
		private final Assignment cRightAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cRightNamedElementReferenceParserRuleCall_2_0 = (RuleCall)cRightAssignment_2.eContents().get(0);
		
		//ModelElementEqualsLiteral av3::BinaryOperation:
		//	left=ModelElementReference operator=EqualsOperation right=NamedElementReference;
		@Override public ParserRule getRule() { return rule; }
		
		//left=ModelElementReference operator=EqualsOperation right=NamedElementReference
		public Group getGroup() { return cGroup; }
		
		//left=ModelElementReference
		public Assignment getLeftAssignment_0() { return cLeftAssignment_0; }
		
		//ModelElementReference
		public RuleCall getLeftModelElementReferenceParserRuleCall_0_0() { return cLeftModelElementReferenceParserRuleCall_0_0; }
		
		//operator=EqualsOperation
		public Assignment getOperatorAssignment_1() { return cOperatorAssignment_1; }
		
		//EqualsOperation
		public RuleCall getOperatorEqualsOperationParserRuleCall_1_0() { return cOperatorEqualsOperationParserRuleCall_1_0; }
		
		//right=NamedElementReference
		public Assignment getRightAssignment_2() { return cRightAssignment_2; }
		
		//NamedElementReference
		public RuleCall getRightNamedElementReferenceParserRuleCall_2_0() { return cRightNamedElementReferenceParserRuleCall_2_0; }
	}
	public class ModelElementEqualsEnumerationLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ModelElementEqualsEnumerationLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLeftAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cLeftModelElementReferenceParserRuleCall_0_0 = (RuleCall)cLeftAssignment_0.eContents().get(0);
		private final Assignment cOperatorAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cOperatorEqualsOperationParserRuleCall_1_0 = (RuleCall)cOperatorAssignment_1.eContents().get(0);
		private final Assignment cRightAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cRightEnumerationLiteralParserRuleCall_2_0 = (RuleCall)cRightAssignment_2.eContents().get(0);
		
		//ModelElementEqualsEnumerationLiteral av3::BinaryOperation:
		//	left=ModelElementReference operator=EqualsOperation right=EnumerationLiteral;
		@Override public ParserRule getRule() { return rule; }
		
		//left=ModelElementReference operator=EqualsOperation right=EnumerationLiteral
		public Group getGroup() { return cGroup; }
		
		//left=ModelElementReference
		public Assignment getLeftAssignment_0() { return cLeftAssignment_0; }
		
		//ModelElementReference
		public RuleCall getLeftModelElementReferenceParserRuleCall_0_0() { return cLeftModelElementReferenceParserRuleCall_0_0; }
		
		//operator=EqualsOperation
		public Assignment getOperatorAssignment_1() { return cOperatorAssignment_1; }
		
		//EqualsOperation
		public RuleCall getOperatorEqualsOperationParserRuleCall_1_0() { return cOperatorEqualsOperationParserRuleCall_1_0; }
		
		//right=EnumerationLiteral
		public Assignment getRightAssignment_2() { return cRightAssignment_2; }
		
		//EnumerationLiteral
		public RuleCall getRightEnumerationLiteralParserRuleCall_2_0() { return cRightEnumerationLiteralParserRuleCall_2_0; }
	}
	public class FeatureInputElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.FeatureInput");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLeftAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cLeftModelElementReferenceParserRuleCall_0_0 = (RuleCall)cLeftAssignment_0.eContents().get(0);
		private final Assignment cOperatorAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cOperatorInputOperationParserRuleCall_1_0 = (RuleCall)cOperatorAssignment_1.eContents().get(0);
		
		//FeatureInput av3::BinaryOperation:
		//	left=ModelElementReference operator=InputOperation;
		@Override public ParserRule getRule() { return rule; }
		
		//left=ModelElementReference operator=InputOperation
		public Group getGroup() { return cGroup; }
		
		//left=ModelElementReference
		public Assignment getLeftAssignment_0() { return cLeftAssignment_0; }
		
		//ModelElementReference
		public RuleCall getLeftModelElementReferenceParserRuleCall_0_0() { return cLeftModelElementReferenceParserRuleCall_0_0; }
		
		//operator=InputOperation
		public Assignment getOperatorAssignment_1() { return cOperatorAssignment_1; }
		
		//InputOperation
		public RuleCall getOperatorInputOperationParserRuleCall_1_0() { return cOperatorInputOperationParserRuleCall_1_0; }
	}
	public class AnnotationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.Annotation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCommercialAtKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLeftParenthesisKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cParametersAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cParametersAnnotationParameterParserRuleCall_2_1_0 = (RuleCall)cParametersAssignment_2_1.eContents().get(0);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cCommaKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cParametersAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final RuleCall cParametersAnnotationParameterParserRuleCall_2_2_1_0 = (RuleCall)cParametersAssignment_2_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		
		//// Annotations
		// Annotation av3::Annotation:
		//	'@' name=ID ('(' parameters+=AnnotationParameter (',' parameters+=AnnotationParameter)* ')')?;
		@Override public ParserRule getRule() { return rule; }
		
		//'@' name=ID ('(' parameters+=AnnotationParameter (',' parameters+=AnnotationParameter)* ')')?
		public Group getGroup() { return cGroup; }
		
		//'@'
		public Keyword getCommercialAtKeyword_0() { return cCommercialAtKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('(' parameters+=AnnotationParameter (',' parameters+=AnnotationParameter)* ')')?
		public Group getGroup_2() { return cGroup_2; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2_0() { return cLeftParenthesisKeyword_2_0; }
		
		//parameters+=AnnotationParameter
		public Assignment getParametersAssignment_2_1() { return cParametersAssignment_2_1; }
		
		//AnnotationParameter
		public RuleCall getParametersAnnotationParameterParserRuleCall_2_1_0() { return cParametersAnnotationParameterParserRuleCall_2_1_0; }
		
		//(',' parameters+=AnnotationParameter)*
		public Group getGroup_2_2() { return cGroup_2_2; }
		
		//','
		public Keyword getCommaKeyword_2_2_0() { return cCommaKeyword_2_2_0; }
		
		//parameters+=AnnotationParameter
		public Assignment getParametersAssignment_2_2_1() { return cParametersAssignment_2_2_1; }
		
		//AnnotationParameter
		public RuleCall getParametersAnnotationParameterParserRuleCall_2_2_1_0() { return cParametersAnnotationParameterParserRuleCall_2_2_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2_3() { return cRightParenthesisKeyword_2_3; }
	}
	public class AnnotationParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.AnnotationParameter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueLiteralParserRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//AnnotationParameter av3::NameValuePair:
		//	name=ID '=' value=Literal;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID '=' value=Literal
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }
		
		//value=Literal
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//Literal
		public RuleCall getValueLiteralParserRuleCall_2_0() { return cValueLiteralParserRuleCall_2_0; }
	}
	public class LiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.Literal");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cIntegerLiteralParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cRealLiteralParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cStringLiteralParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cBooleanLiteralParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cPropertyReferenceParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cDirectionalLiteralParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cListLiteralParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cSetLiteralParserRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);
		private final RuleCall cMultiLiteralOperationParserRuleCall_8 = (RuleCall)cAlternatives.eContents().get(8);
		private final RuleCall cModelElementContainsLiteralParserRuleCall_9 = (RuleCall)cAlternatives.eContents().get(9);
		private final RuleCall cNamedElementReferenceParserRuleCall_10 = (RuleCall)cAlternatives.eContents().get(10);
		private final RuleCall cEnumerationLiteralParserRuleCall_11 = (RuleCall)cAlternatives.eContents().get(11);
		
		//// expression/constraint language
		// Literal av3::Literal:
		//	IntegerLiteral | RealLiteral | StringLiteral | BooleanLiteral | PropertyReference | DirectionalLiteral | ListLiteral
		//	| SetLiteral | MultiLiteralOperation | ModelElementContainsLiteral | NamedElementReference | EnumerationLiteral
		//	//| FeatureInput
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//IntegerLiteral | RealLiteral | StringLiteral | BooleanLiteral | PropertyReference | DirectionalLiteral | ListLiteral |
		//SetLiteral | MultiLiteralOperation | ModelElementContainsLiteral | NamedElementReference | EnumerationLiteral
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
		
		//DirectionalLiteral
		public RuleCall getDirectionalLiteralParserRuleCall_5() { return cDirectionalLiteralParserRuleCall_5; }
		
		//ListLiteral
		public RuleCall getListLiteralParserRuleCall_6() { return cListLiteralParserRuleCall_6; }
		
		//SetLiteral
		public RuleCall getSetLiteralParserRuleCall_7() { return cSetLiteralParserRuleCall_7; }
		
		//MultiLiteralOperation
		public RuleCall getMultiLiteralOperationParserRuleCall_8() { return cMultiLiteralOperationParserRuleCall_8; }
		
		//ModelElementContainsLiteral
		public RuleCall getModelElementContainsLiteralParserRuleCall_9() { return cModelElementContainsLiteralParserRuleCall_9; }
		
		//NamedElementReference
		public RuleCall getNamedElementReferenceParserRuleCall_10() { return cNamedElementReferenceParserRuleCall_10; }
		
		//EnumerationLiteral
		public RuleCall getEnumerationLiteralParserRuleCall_11() { return cEnumerationLiteralParserRuleCall_11; }
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
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//EnumerationLiteral av3::EnumerationLiteral:
		//	{av3::EnumerationLiteral} name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//{av3::EnumerationLiteral} name=ID
		public Group getGroup() { return cGroup; }
		
		//{av3::EnumerationLiteral}
		public Action getEnumerationLiteralAction_0() { return cEnumerationLiteralAction_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
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
		
		//(value?='true' | 'false')
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
	public class EnumerationListElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.EnumerationList");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cListLiteralAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cElementsAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cElementsEnumerationLiteralParserRuleCall_2_0_0 = (RuleCall)cElementsAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Keyword cCommaKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cElementsAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cElementsEnumerationLiteralParserRuleCall_2_1_1_0 = (RuleCall)cElementsAssignment_2_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//EnumerationList av3::ListLiteral:
		//	{av3::ListLiteral} '(' (elements+=EnumerationLiteral (',' elements+=EnumerationLiteral)*)? ')';
		@Override public ParserRule getRule() { return rule; }
		
		//{av3::ListLiteral} '(' (elements+=EnumerationLiteral (',' elements+=EnumerationLiteral)*)? ')'
		public Group getGroup() { return cGroup; }
		
		//{av3::ListLiteral}
		public Action getListLiteralAction_0() { return cListLiteralAction_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//(elements+=EnumerationLiteral (',' elements+=EnumerationLiteral)*)?
		public Group getGroup_2() { return cGroup_2; }
		
		//elements+=EnumerationLiteral
		public Assignment getElementsAssignment_2_0() { return cElementsAssignment_2_0; }
		
		//EnumerationLiteral
		public RuleCall getElementsEnumerationLiteralParserRuleCall_2_0_0() { return cElementsEnumerationLiteralParserRuleCall_2_0_0; }
		
		//(',' elements+=EnumerationLiteral)*
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//','
		public Keyword getCommaKeyword_2_1_0() { return cCommaKeyword_2_1_0; }
		
		//elements+=EnumerationLiteral
		public Assignment getElementsAssignment_2_1_1() { return cElementsAssignment_2_1_1; }
		
		//EnumerationLiteral
		public RuleCall getElementsEnumerationLiteralParserRuleCall_2_1_1_0() { return cElementsEnumerationLiteralParserRuleCall_2_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class SetLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.SetLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSetLiteralAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cElementsAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cElementsLiteralParserRuleCall_2_0_0 = (RuleCall)cElementsAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Keyword cCommaKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cElementsAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cElementsLiteralParserRuleCall_2_1_1_0 = (RuleCall)cElementsAssignment_2_1_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//SetLiteral av3::SetLiteral:
		//	{av3::SetLiteral} '{' (elements+=Literal (',' elements+=Literal)*)? '}';
		@Override public ParserRule getRule() { return rule; }
		
		//{av3::SetLiteral} '{' (elements+=Literal (',' elements+=Literal)*)? '}'
		public Group getGroup() { return cGroup; }
		
		//{av3::SetLiteral}
		public Action getSetLiteralAction_0() { return cSetLiteralAction_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
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
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
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
	public class BehaviorCategoryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.BehaviorCategory");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cFlowKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cTokenKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cBehaviorKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cSyncKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		
		//BehaviorCategory av3::BehaviorCategory:
		//	'flow' | 'token' | 'behavior' | 'sync';
		@Override public ParserRule getRule() { return rule; }
		
		//'flow' | 'token' | 'behavior' | 'sync'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'flow'
		public Keyword getFlowKeyword_0() { return cFlowKeyword_0; }
		
		//'token'
		public Keyword getTokenKeyword_1() { return cTokenKeyword_1; }
		
		//'behavior'
		public Keyword getBehaviorKeyword_2() { return cBehaviorKeyword_2; }
		
		//'sync'
		public Keyword getSyncKeyword_3() { return cSyncKeyword_3; }
	}
	public class IsFlowCategoryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.IsFlowCategory");
		private final Keyword cFlowKeyword = (Keyword)rule.eContents().get(1);
		
		//IsFlowCategory av3::BehaviorCategory:
		//	'flow';
		@Override public ParserRule getRule() { return rule; }
		
		//'flow'
		public Keyword getFlowKeyword() { return cFlowKeyword; }
	}
	public class IsSyncCategoryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.IsSyncCategory");
		private final Keyword cSyncKeyword = (Keyword)rule.eContents().get(1);
		
		//IsSyncCategory av3::BehaviorCategory:
		//	'sync';
		@Override public ParserRule getRule() { return rule; }
		
		//'sync'
		public Keyword getSyncKeyword() { return cSyncKeyword; }
	}
	public class IsTokenCategoryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.IsTokenCategory");
		private final Keyword cTokenKeyword = (Keyword)rule.eContents().get(1);
		
		//IsTokenCategory av3::BehaviorCategory:
		//	'token';
		@Override public ParserRule getRule() { return rule; }
		
		//'token'
		public Keyword getTokenKeyword() { return cTokenKeyword; }
	}
	public class IsBehaviorCategoryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.IsBehaviorCategory");
		private final Keyword cBehaviorKeyword = (Keyword)rule.eContents().get(1);
		
		//IsBehaviorCategory av3::BehaviorCategory:
		//	'behavior';
		@Override public ParserRule getRule() { return rule; }
		
		//'behavior'
		public Keyword getBehaviorKeyword() { return cBehaviorKeyword; }
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
	public class BinaryOperationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.BinaryOperation");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cInKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cContainsKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cEqualsKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cSatisfiesKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cExclamationMarkKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		private final Keyword cQuestionMarkKeyword_5 = (Keyword)cAlternatives.eContents().get(5);
		
		//BinaryOperation av3::BinaryOperator:
		//	'in' | 'contains' | 'equals' | 'satisfies' | '!' | '?';
		@Override public ParserRule getRule() { return rule; }
		
		//'in' | 'contains' | 'equals' | 'satisfies' | '!' | '?'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'in'
		public Keyword getInKeyword_0() { return cInKeyword_0; }
		
		//'contains'
		public Keyword getContainsKeyword_1() { return cContainsKeyword_1; }
		
		//'equals'
		public Keyword getEqualsKeyword_2() { return cEqualsKeyword_2; }
		
		//'satisfies'
		public Keyword getSatisfiesKeyword_3() { return cSatisfiesKeyword_3; }
		
		//'!'
		public Keyword getExclamationMarkKeyword_4() { return cExclamationMarkKeyword_4; }
		
		//'?'
		public Keyword getQuestionMarkKeyword_5() { return cQuestionMarkKeyword_5; }
	}
	public class SatisfiesOperationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.SatisfiesOperation");
		private final Keyword cSatisfiesKeyword = (Keyword)rule.eContents().get(1);
		
		//SatisfiesOperation av3::BinaryOperator:
		//	'satisfies';
		@Override public ParserRule getRule() { return rule; }
		
		//'satisfies'
		public Keyword getSatisfiesKeyword() { return cSatisfiesKeyword; }
	}
	public class EqualsOperationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.EqualsOperation");
		private final Keyword cEqualsSignKeyword = (Keyword)rule.eContents().get(1);
		
		//EqualsOperation av3::BinaryOperator:
		//	'=';
		@Override public ParserRule getRule() { return rule; }
		
		//'='
		public Keyword getEqualsSignKeyword() { return cEqualsSignKeyword; }
	}
	public class InOperationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.InOperation");
		private final Keyword cInKeyword = (Keyword)rule.eContents().get(1);
		
		//InOperation av3::BinaryOperator:
		//	'in';
		@Override public ParserRule getRule() { return rule; }
		
		//'in'
		public Keyword getInKeyword() { return cInKeyword; }
	}
	public class InputOperationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.InputOperation");
		private final Keyword cQuestionMarkKeyword = (Keyword)rule.eContents().get(1);
		
		//InputOperation av3::BinaryOperator:
		//	'?';
		@Override public ParserRule getRule() { return rule; }
		
		//'?'
		public Keyword getQuestionMarkKeyword() { return cQuestionMarkKeyword; }
	}
	public class OutputOperationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.OutputOperation");
		private final Keyword cExclamationMarkKeyword = (Keyword)rule.eContents().get(1);
		
		//OutputOperation av3::BinaryOperator:
		//	'!';
		@Override public ParserRule getRule() { return rule; }
		
		//'!'
		public Keyword getExclamationMarkKeyword() { return cExclamationMarkKeyword; }
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
	public class EndToEndFLowKeywordsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.EndToEndFLowKeywords");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEndKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cToKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cEndKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cFlowKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//EndToEndFLowKeywords:
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
	private final PropertyAssociationElements pPropertyAssociation;
	private final PropertyAssociationTypeElements pPropertyAssociationType;
	private final ModelElementReferenceElements pModelElementReference;
	private final NamedElementReferenceElements pNamedElementReference;
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
	private final UsePropsElements pUseProps;
	private final InStatesElements pInStates;
	private final EndToEndFlowElements pEndToEndFlow;
	private final PathElementElements pPathElement;
	private final ImportElements pImport;
	private final ClassifierAssignmentElements pClassifierAssignment;
	private final ClassifierAssignmentPatternElements pClassifierAssignmentPattern;
	private final QueryExpressionElements pQueryExpression;
	private final FlowAssignmentElements pFlowAssignment;
	private final ConnectionAssignmentElements pConnectionAssignment;
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
	private final BehaviorAnnotationBlockElements pBehaviorAnnotationBlock;
	private final BehaviorAnnotationElementsElements pBehaviorAnnotationElements;
	private final BehaviorAnnotationElementElements pBehaviorAnnotationElement;
	private final StateVariableElements pStateVariable;
	private final GeneratorElements pGenerator;
	private final StateTransitionElements pStateTransition;
	private final StateSynchronizationElements pStateSynchronization;
	private final BehaviorElements pBehavior;
	private final TokenFlowElements pTokenFlow;
	private final ComputationalBehaviorElements pComputationalBehavior;
	private final TokenResultBlockElements pTokenResultBlock;
	private final TokenResultElements pTokenResult;
	private final TokenOutputElements pTokenOutput;
	private final DetectionEventElements pDetectionEvent;
	private final ModelElementContainsLiteralElements pModelElementContainsLiteral;
	private final ModelElementContainsEnumerationLiteralElements pModelElementContainsEnumerationLiteral;
	private final ModelElementEqualsLiteralElements pModelElementEqualsLiteral;
	private final ModelElementEqualsEnumerationLiteralElements pModelElementEqualsEnumerationLiteral;
	private final FeatureInputElements pFeatureInput;
	private final AnnotationElements pAnnotation;
	private final AnnotationParameterElements pAnnotationParameter;
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
	private final EnumerationListElements pEnumerationList;
	private final SetLiteralElements pSetLiteral;
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
	private final BehaviorCategoryElements pBehaviorCategory;
	private final IsFlowCategoryElements pIsFlowCategory;
	private final IsSyncCategoryElements pIsSyncCategory;
	private final IsTokenCategoryElements pIsTokenCategory;
	private final IsBehaviorCategoryElements pIsBehaviorCategory;
	private final FeatureDirectionElements pFeatureDirection;
	private final PropagationDirectionElements pPropagationDirection;
	private final CompositeElements pComposite;
	private final PrimitiveElements pPrimitive;
	private final EOperationElements pEOperation;
	private final BinaryOperationElements pBinaryOperation;
	private final SatisfiesOperationElements pSatisfiesOperation;
	private final EqualsOperationElements pEqualsOperation;
	private final InOperationElements pInOperation;
	private final InputOperationElements pInputOperation;
	private final OutputOperationElements pOutputOperation;
	private final AssociationTypeElements pAssociationType;
	private final IsConnectionElements pIsConnection;
	private final IsBindingElements pIsBinding;
	private final IsFlowElements pIsFlow;
	private final VirtualProcessorKeywordsElements pVirtualProcessorKeywords;
	private final VirtualBusKeywordsElements pVirtualBusKeywords;
	private final VirtualMemoryKeywordsElements pVirtualMemoryKeywords;
	private final VirtualDeviceKeywordsElements pVirtualDeviceKeywords;
	private final ThreadGroupKeywordsElements pThreadGroupKeywords;
	private final SubprogramGroupKeywordsElements pSubprogramGroupKeywords;
	private final EndToEndFLowKeywordsElements pEndToEndFLowKeywords;
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
		this.pPropertyAssociation = new PropertyAssociationElements();
		this.pPropertyAssociationType = new PropertyAssociationTypeElements();
		this.pModelElementReference = new ModelElementReferenceElements();
		this.pNamedElementReference = new NamedElementReferenceElements();
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
		this.pUseProps = new UsePropsElements();
		this.pInStates = new InStatesElements();
		this.pEndToEndFlow = new EndToEndFlowElements();
		this.pPathElement = new PathElementElements();
		this.pImport = new ImportElements();
		this.pClassifierAssignment = new ClassifierAssignmentElements();
		this.pClassifierAssignmentPattern = new ClassifierAssignmentPatternElements();
		this.pQueryExpression = new QueryExpressionElements();
		this.pFlowAssignment = new FlowAssignmentElements();
		this.pConnectionAssignment = new ConnectionAssignmentElements();
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
		this.pBehaviorAnnotationBlock = new BehaviorAnnotationBlockElements();
		this.pBehaviorAnnotationElements = new BehaviorAnnotationElementsElements();
		this.pBehaviorAnnotationElement = new BehaviorAnnotationElementElements();
		this.pStateVariable = new StateVariableElements();
		this.pGenerator = new GeneratorElements();
		this.pStateTransition = new StateTransitionElements();
		this.pStateSynchronization = new StateSynchronizationElements();
		this.pBehavior = new BehaviorElements();
		this.pTokenFlow = new TokenFlowElements();
		this.pComputationalBehavior = new ComputationalBehaviorElements();
		this.pTokenResultBlock = new TokenResultBlockElements();
		this.pTokenResult = new TokenResultElements();
		this.pTokenOutput = new TokenOutputElements();
		this.pDetectionEvent = new DetectionEventElements();
		this.pModelElementContainsLiteral = new ModelElementContainsLiteralElements();
		this.pModelElementContainsEnumerationLiteral = new ModelElementContainsEnumerationLiteralElements();
		this.pModelElementEqualsLiteral = new ModelElementEqualsLiteralElements();
		this.pModelElementEqualsEnumerationLiteral = new ModelElementEqualsEnumerationLiteralElements();
		this.pFeatureInput = new FeatureInputElements();
		this.pAnnotation = new AnnotationElements();
		this.pAnnotationParameter = new AnnotationParameterElements();
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
		this.pEnumerationList = new EnumerationListElements();
		this.pSetLiteral = new SetLiteralElements();
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
		this.pBehaviorCategory = new BehaviorCategoryElements();
		this.pIsFlowCategory = new IsFlowCategoryElements();
		this.pIsSyncCategory = new IsSyncCategoryElements();
		this.pIsTokenCategory = new IsTokenCategoryElements();
		this.pIsBehaviorCategory = new IsBehaviorCategoryElements();
		this.pFeatureDirection = new FeatureDirectionElements();
		this.pPropagationDirection = new PropagationDirectionElements();
		this.pComposite = new CompositeElements();
		this.pPrimitive = new PrimitiveElements();
		this.pEOperation = new EOperationElements();
		this.pBinaryOperation = new BinaryOperationElements();
		this.pSatisfiesOperation = new SatisfiesOperationElements();
		this.pEqualsOperation = new EqualsOperationElements();
		this.pInOperation = new InOperationElements();
		this.pInputOperation = new InputOperationElements();
		this.pOutputOperation = new OutputOperationElements();
		this.pAssociationType = new AssociationTypeElements();
		this.pIsConnection = new IsConnectionElements();
		this.pIsBinding = new IsBindingElements();
		this.pIsFlow = new IsFlowElements();
		this.pVirtualProcessorKeywords = new VirtualProcessorKeywordsElements();
		this.pVirtualBusKeywords = new VirtualBusKeywordsElements();
		this.pVirtualMemoryKeywords = new VirtualMemoryKeywordsElements();
		this.pVirtualDeviceKeywords = new VirtualDeviceKeywordsElements();
		this.pThreadGroupKeywords = new ThreadGroupKeywordsElements();
		this.pSubprogramGroupKeywords = new SubprogramGroupKeywordsElements();
		this.pEndToEndFLowKeywords = new EndToEndFLowKeywordsElements();
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
	//	annotations+=Annotation* private?='private'? 'package' name=QualifiedName 'is' (elements+=AnnexLibrary |
	//	(imports+=Import | elements+=PackageElement)*) 'end' ';';
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
	//	PropertySet | Workingset | TypeDef;
	public PackageElementElements getPackageElementAccess() {
		return pPackageElement;
	}
	
	public ParserRule getPackageElementRule() {
		return getPackageElementAccess().getRule();
	}
	
	//PropertyDefinition av3::PropertyDefinition:
	//	annotations+=Annotation* private?='private'? 'property' name=ID ':' type=Type ('for' '(' (forAll?='all' | AppliesTo
	//	(',' AppliesTo)*) ')')? ';';
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
	//	annotations+=Annotation* private?='private'? 'properties' name=ID ':' '{'
	//	properties+=[av3::PropertyDefinition|QualifiedReference] (',' properties+=[av3::PropertyDefinition|QualifiedName])*
	//	'}' ';';
	public PropertySetElements getPropertySetAccess() {
		return pPropertySet;
	}
	
	public ParserRule getPropertySetRule() {
		return getPropertySetAccess().getRule();
	}
	
	//TypeDef av3::TypeDef:
	//	annotations+=Annotation* private?='private'? 'type' name=ID ('extends' superType=Type)? (':' baseType=Type)?
	//	PropertiesBlock? ';';
	public TypeDefElements getTypeDefAccess() {
		return pTypeDef;
	}
	
	public ParserRule getTypeDefRule() {
		return getTypeDefAccess().getRule();
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
	
	//ModelElementReference av3::NamedElementReference:
	//	element=[av3::ModelElement] -> ({av3::NamedElementReference.context=current} '.' element=[av3::ModelElement])*;
	public ModelElementReferenceElements getModelElementReferenceAccess() {
		return pModelElementReference;
	}
	
	public ParserRule getModelElementReferenceRule() {
		return getModelElementReferenceAccess().getRule();
	}
	
	//NamedElementReference av3::NamedElementReference:
	//	element=[av3::NamedElement|QualifiedReference] -> ({av3::NamedElementReference.context=current} '.'
	//	element=[av3::ModelElement])*;
	public NamedElementReferenceElements getNamedElementReferenceAccess() {
		return pNamedElementReference;
	}
	
	public ParserRule getNamedElementReferenceRule() {
		return getNamedElementReferenceAccess().getRule();
	}
	
	//ComponentInterface av3::ComponentInterface:
	//	annotations+=Annotation* private?='private'? category=ComponentCategory? 'interface' name=ID ('extends'
	//	InterfaceExtensions)? InterfaceBody ';';
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
	//	elements+=(Feature | StateVariable | StateTransition | Behavior | Generator | BehaviorAnnotationBlock |
	//	AnnexSubclause) | ownedPropertyAssociations+=PropertyAssociation;
	public InterfaceElementElements getInterfaceElementAccess() {
		return pInterfaceElement;
	}
	
	public ParserRule getInterfaceElementRule() {
		return getInterfaceElementAccess().getRule();
	}
	
	//ComponentImplementation av3::ComponentImplementation:
	//	annotations+=Annotation* private?='private'? category=ComponentCategory name=DottedName ('extends'
	//	ImplementationExtensions)? ImplementationBody ';';
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
	//	elements+=(Connection | Binding | Subcomponent | EndToEndFlow | BehaviorAnnotationBlock | StateVariable |
	//	StateTransition | StateSynchronization | Behavior | Generator | AnnexSubclause) | flowAssignments+=FlowAssignment |
	//	classifierAssignments+=ClassifierAssignment | classifierAssignments+=ClassifierAssignmentPattern |
	//	connectionAssignments+=ConnectionAssignment | ownedPropertyAssociations+=PropertyAssociation;
	public ImplementationElementElements getImplementationElementAccess() {
		return pImplementationElement;
	}
	
	public ParserRule getImplementationElementRule() {
		return getImplementationElementAccess().getRule();
	}
	
	//ComponentConfiguration av3::ComponentConfiguration:
	//	annotations+=Annotation* private?='private'? 'configuration' name=DottedName Parameters? ('extends'
	//	ConfigurationExtensions)? ConfigurationElementBlock ';';
	public ComponentConfigurationElements getComponentConfigurationAccess() {
		return pComponentConfiguration;
	}
	
	public ParserRule getComponentConfigurationRule() {
		return getComponentConfigurationAccess().getRule();
	}
	
	//// (Instance) model elements
	// Feature av3::Feature:
	//	annotations+=Annotation* name=ID ':' direction=FeatureDirection? category=FeatureCategory
	//	typeReference=ReversableTypeReference? PropertiesBlock? ';';
	public FeatureElements getFeatureAccess() {
		return pFeature;
	}
	
	public ParserRule getFeatureRule() {
		return getFeatureAccess().getRule();
	}
	
	//Subcomponent av3::Subcomponent:
	//	{av3::Subcomponent} annotations+=Annotation* name=ID ':' category=ComponentCategory
	//	(typeReferences+=ClassifierOrTypeReference InStates? PropertiesBlock? | InStates? NestedComponentImplementationBlock)
	//	';';
	public SubcomponentElements getSubcomponentAccess() {
		return pSubcomponent;
	}
	
	public ParserRule getSubcomponentRule() {
		return getSubcomponentAccess().getRule();
	}
	
	//Connection av3::Association:
	//	name=ID ':' associationType=IsConnection source=ModelElementReference ('->' | bidirectional?='<->')
	//	destination=ModelElementReference InStates? PropertiesBlock? ';';
	public ConnectionElements getConnectionAccess() {
		return pConnection;
	}
	
	public ParserRule getConnectionRule() {
		return getConnectionAccess().getRule();
	}
	
	//Binding av3::Association:
	//	name=ID ':' bindingType=[av3::TypeDef|QualifiedName]? associationType=IsBinding source=ModelElementReference '->'
	//	destination=ModelElementReference InStates? PropertiesBlock? ';';
	public BindingElements getBindingAccess() {
		return pBinding;
	}
	
	public ParserRule getBindingRule() {
		return getBindingAccess().getRule();
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
	
	//fragment InStates *:
	//	'when' inStates=(ModelElementContainsEnumerationLiteral | ModelElementEqualsEnumerationLiteral);
	public InStatesElements getInStatesAccess() {
		return pInStates;
	}
	
	public ParserRule getInStatesRule() {
		return getInStatesAccess().getRule();
	}
	
	//EndToEndFlow av3::PathSequence:
	//	name=ID ':' EndToEndFLowKeywords elements+=PathElement ('->' elements+=PathElement)+ PropertiesBlock? ';';
	public EndToEndFlowElements getEndToEndFlowAccess() {
		return pEndToEndFlow;
	}
	
	public ParserRule getEndToEndFlowRule() {
		return getEndToEndFlowAccess().getRule();
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
	
	//ConnectionAssignment av3::PathSequence:
	//	target=ModelElementReference '=>' 'connection' elements+=PathElement ('->' elements+=PathElement)* ';';
	public ConnectionAssignmentElements getConnectionAssignmentAccess() {
		return pConnectionAssignment;
	}
	
	public ParserRule getConnectionAssignmentRule() {
		return getConnectionAssignmentAccess().getRule();
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
	//	ownedPropertyAssociations+=PropertyAssociation | elements+=(BehaviorAnnotationBlock | EndToEndFlow |
	//	BehaviorAnnotationBlock | StateVariable | StateTransition | StateSynchronization | Behavior | Generator | Binding) |
	//	flowAssignments+=FlowAssignment | classifierAssignments+=ClassifierAssignment |
	//	classifierAssignments+=ClassifierAssignmentPattern | elements+=AnnexSubclause;
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
	//	DefaultAnnexSubclause;
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
	//	actions+=STRING* productlineConstraint=ProductLineConstraint? ';';
	public InstanceConfigurationElements getInstanceConfigurationAccess() {
		return pInstanceConfiguration;
	}
	
	public ParserRule getInstanceConfigurationRule() {
		return getInstanceConfigurationAccess().getRule();
	}
	
	//ProductLineConstraint av3::BinaryOperation:
	//	{av3::BinaryOperation} 'plc' left=PropertyReference operator=SatisfiesOperation right=ListLiteral;
	public ProductLineConstraintElements getProductLineConstraintAccess() {
		return pProductLineConstraint;
	}
	
	public ParserRule getProductLineConstraintRule() {
		return getProductLineConstraintAccess().getRule();
	}
	
	//// Behavior specification including error behavior
	// BehaviorAnnotationBlock av3::AnnotationBlock:
	//	'@' name=ID '{' BehaviorAnnotationElements '}' ';';
	public BehaviorAnnotationBlockElements getBehaviorAnnotationBlockAccess() {
		return pBehaviorAnnotationBlock;
	}
	
	public ParserRule getBehaviorAnnotationBlockRule() {
		return getBehaviorAnnotationBlockAccess().getRule();
	}
	
	//fragment BehaviorAnnotationElements *:
	//	BehaviorAnnotationElement*;
	public BehaviorAnnotationElementsElements getBehaviorAnnotationElementsAccess() {
		return pBehaviorAnnotationElements;
	}
	
	public ParserRule getBehaviorAnnotationElementsRule() {
		return getBehaviorAnnotationElementsAccess().getRule();
	}
	
	//fragment BehaviorAnnotationElement *:
	//	elements+=(Generator | StateTransition | StateSynchronization | Behavior | StateVariable);
	public BehaviorAnnotationElementElements getBehaviorAnnotationElementAccess() {
		return pBehaviorAnnotationElement;
	}
	
	public ParserRule getBehaviorAnnotationElementRule() {
		return getBehaviorAnnotationElementAccess().getRule();
	}
	
	//StateVariable av3::StateVariable:
	//	annotations+=Annotation* name=ID ':' 'state' stateType=[av3::TypeDef|QualifiedName] ('='
	//	initialState=EnumerationLiteral)? PropertiesBlock? ';';
	public StateVariableElements getStateVariableAccess() {
		return pStateVariable;
	}
	
	public ParserRule getStateVariableRule() {
		return getStateVariableAccess().getRule();
	}
	
	//Generator av3::Generator:
	//	annotations+=Annotation* name=ID ':' 'generator' value=ListLiteral? InStates? PropertiesBlock? ';';
	public GeneratorElements getGeneratorAccess() {
		return pGenerator;
	}
	
	public ParserRule getGeneratorRule() {
		return getGeneratorAccess().getRule();
	}
	
	//StateTransition av3::StateTransition:
	//	annotations+=Annotation* name=ID ':' 'transition' condition=(MultiLiteralOperation | ModelElementContainsLiteral |
	//	ModelElementReference) '->' targetState=ModelElementEqualsEnumerationLiteral InStates? PropertiesBlock? ';';
	public StateTransitionElements getStateTransitionAccess() {
		return pStateTransition;
	}
	
	public ParserRule getStateTransitionRule() {
		return getStateTransitionAccess().getRule();
	}
	
	//StateSynchronization av3::StateSynchronization:
	//	annotations+=Annotation* name=ID ':' 'sync' (condition=(MultiLiteralOperation |
	//	ModelElementContainsEnumerationLiteral | ModelElementEqualsEnumerationLiteral) '->'
	//	targetState=ModelElementEqualsEnumerationLiteral | targetState=ModelElementEqualsEnumerationLiteral '->'
	//	condition=(MultiLiteralOperation | ModelElementContainsEnumerationLiteral | ModelElementEqualsEnumerationLiteral))
	//	InStates? PropertiesBlock? ';';
	public StateSynchronizationElements getStateSynchronizationAccess() {
		return pStateSynchronization;
	}
	
	public ParserRule getStateSynchronizationRule() {
		return getStateSynchronizationAccess().getRule();
	}
	
	//Behavior av3::Behavior:
	//	TokenFlow | ComputationalBehavior;
	public BehaviorElements getBehaviorAccess() {
		return pBehavior;
	}
	
	public ParserRule getBehaviorRule() {
		return getBehaviorAccess().getRule();
	}
	
	////
	// //FlowPath returns av3::Behavior :
	// //	(annotations+=Annotation )*
	//
	////	name=ID ':' 'flow' condition =(ListLiteral | ModelElementReference) '->'  ( sink?='sink' | (actions+=FlowOutput (',' actions+=FlowOutput)* ))
	//
	////	(InStates )? PropertiesBlock?';'
	// //;
	// //FlowSource returns av3::Behavior :
	// //	(annotations+=Annotation )*
	//
	////	name=ID ':' 'flow'  source?='source' (condition =(ListLiteral | ModelElementReference)? '->' )?  actions+=FlowOutput (',' actions+=FlowOutput)* 
	//
	////	(InStates )? PropertiesBlock?';'
	// //;
	// //
	// //FlowOutput returns av3::BinaryOperation:
	//
	////	left= ModelElementReference 
	// //;
	// TokenFlow av3::Behavior:
	//	annotations+=Annotation* name=ID ':' category=IsFlowCategory (condition=(MultiLiteralOperation |
	//	ModelElementContainsLiteral | ModelElementEqualsLiteral | ModelElementReference) '->' (sink?='sink' |
	//	TokenResultBlock) | source?='source' condition=(MultiLiteralOperation | ModelElementContainsLiteral |
	//	ModelElementEqualsLiteral | ModelElementReference)? '->' TokenResultBlock) InStates? PropertiesBlock? ';';
	public TokenFlowElements getTokenFlowAccess() {
		return pTokenFlow;
	}
	
	public ParserRule getTokenFlowRule() {
		return getTokenFlowAccess().getRule();
	}
	
	//ComputationalBehavior av3::Behavior:
	//	annotations+=Annotation* name=ID ':' category=IsBehaviorCategory condition=Literal '->' TokenResultBlock InStates?
	//	PropertiesBlock? ';';
	public ComputationalBehaviorElements getComputationalBehaviorAccess() {
		return pComputationalBehavior;
	}
	
	public ParserRule getComputationalBehaviorRule() {
		return getComputationalBehaviorAccess().getRule();
	}
	
	//fragment TokenResultBlock *:
	//	actions+=TokenResult (',' actions+=TokenResult)*;
	public TokenResultBlockElements getTokenResultBlockAccess() {
		return pTokenResultBlock;
	}
	
	public ParserRule getTokenResultBlockRule() {
		return getTokenResultBlockAccess().getRule();
	}
	
	//TokenResult av3::BinaryOperation:
	//	TokenOutput | DetectionEvent;
	public TokenResultElements getTokenResultAccess() {
		return pTokenResult;
	}
	
	public ParserRule getTokenResultRule() {
		return getTokenResultAccess().getRule();
	}
	
	//TokenOutput av3::BinaryOperation:
	//	left=ModelElementReference (operator=EqualsOperation right=NamedElementReference)?;
	public TokenOutputElements getTokenOutputAccess() {
		return pTokenOutput;
	}
	
	public ParserRule getTokenOutputRule() {
		return getTokenOutputAccess().getRule();
	}
	
	//DetectionEvent av3::BinaryOperation:
	//	left=ModelElementReference operator=OutputOperation right=ListLiteral?;
	public DetectionEventElements getDetectionEventAccess() {
		return pDetectionEvent;
	}
	
	public ParserRule getDetectionEventRule() {
		return getDetectionEventAccess().getRule();
	}
	
	//ModelElementContainsLiteral av3::BinaryOperation:
	//	left=ModelElementReference operator=InOperation right=ListLiteral;
	public ModelElementContainsLiteralElements getModelElementContainsLiteralAccess() {
		return pModelElementContainsLiteral;
	}
	
	public ParserRule getModelElementContainsLiteralRule() {
		return getModelElementContainsLiteralAccess().getRule();
	}
	
	//ModelElementContainsEnumerationLiteral av3::BinaryOperation:
	//	left=ModelElementReference operator=InOperation right=EnumerationList;
	public ModelElementContainsEnumerationLiteralElements getModelElementContainsEnumerationLiteralAccess() {
		return pModelElementContainsEnumerationLiteral;
	}
	
	public ParserRule getModelElementContainsEnumerationLiteralRule() {
		return getModelElementContainsEnumerationLiteralAccess().getRule();
	}
	
	//ModelElementEqualsLiteral av3::BinaryOperation:
	//	left=ModelElementReference operator=EqualsOperation right=NamedElementReference;
	public ModelElementEqualsLiteralElements getModelElementEqualsLiteralAccess() {
		return pModelElementEqualsLiteral;
	}
	
	public ParserRule getModelElementEqualsLiteralRule() {
		return getModelElementEqualsLiteralAccess().getRule();
	}
	
	//ModelElementEqualsEnumerationLiteral av3::BinaryOperation:
	//	left=ModelElementReference operator=EqualsOperation right=EnumerationLiteral;
	public ModelElementEqualsEnumerationLiteralElements getModelElementEqualsEnumerationLiteralAccess() {
		return pModelElementEqualsEnumerationLiteral;
	}
	
	public ParserRule getModelElementEqualsEnumerationLiteralRule() {
		return getModelElementEqualsEnumerationLiteralAccess().getRule();
	}
	
	//FeatureInput av3::BinaryOperation:
	//	left=ModelElementReference operator=InputOperation;
	public FeatureInputElements getFeatureInputAccess() {
		return pFeatureInput;
	}
	
	public ParserRule getFeatureInputRule() {
		return getFeatureInputAccess().getRule();
	}
	
	//// Annotations
	// Annotation av3::Annotation:
	//	'@' name=ID ('(' parameters+=AnnotationParameter (',' parameters+=AnnotationParameter)* ')')?;
	public AnnotationElements getAnnotationAccess() {
		return pAnnotation;
	}
	
	public ParserRule getAnnotationRule() {
		return getAnnotationAccess().getRule();
	}
	
	//AnnotationParameter av3::NameValuePair:
	//	name=ID '=' value=Literal;
	public AnnotationParameterElements getAnnotationParameterAccess() {
		return pAnnotationParameter;
	}
	
	public ParserRule getAnnotationParameterRule() {
		return getAnnotationParameterAccess().getRule();
	}
	
	//// expression/constraint language
	// Literal av3::Literal:
	//	IntegerLiteral | RealLiteral | StringLiteral | BooleanLiteral | PropertyReference | DirectionalLiteral | ListLiteral
	//	| SetLiteral | MultiLiteralOperation | ModelElementContainsLiteral | NamedElementReference | EnumerationLiteral
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
	//	{av3::EnumerationLiteral} name=ID;
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
	
	//EnumerationList av3::ListLiteral:
	//	{av3::ListLiteral} '(' (elements+=EnumerationLiteral (',' elements+=EnumerationLiteral)*)? ')';
	public EnumerationListElements getEnumerationListAccess() {
		return pEnumerationList;
	}
	
	public ParserRule getEnumerationListRule() {
		return getEnumerationListAccess().getRule();
	}
	
	//SetLiteral av3::SetLiteral:
	//	{av3::SetLiteral} '{' (elements+=Literal (',' elements+=Literal)*)? '}';
	public SetLiteralElements getSetLiteralAccess() {
		return pSetLiteral;
	}
	
	public ParserRule getSetLiteralRule() {
		return getSetLiteralAccess().getRule();
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
	
	//BehaviorCategory av3::BehaviorCategory:
	//	'flow' | 'token' | 'behavior' | 'sync';
	public BehaviorCategoryElements getBehaviorCategoryAccess() {
		return pBehaviorCategory;
	}
	
	public ParserRule getBehaviorCategoryRule() {
		return getBehaviorCategoryAccess().getRule();
	}
	
	//IsFlowCategory av3::BehaviorCategory:
	//	'flow';
	public IsFlowCategoryElements getIsFlowCategoryAccess() {
		return pIsFlowCategory;
	}
	
	public ParserRule getIsFlowCategoryRule() {
		return getIsFlowCategoryAccess().getRule();
	}
	
	//IsSyncCategory av3::BehaviorCategory:
	//	'sync';
	public IsSyncCategoryElements getIsSyncCategoryAccess() {
		return pIsSyncCategory;
	}
	
	public ParserRule getIsSyncCategoryRule() {
		return getIsSyncCategoryAccess().getRule();
	}
	
	//IsTokenCategory av3::BehaviorCategory:
	//	'token';
	public IsTokenCategoryElements getIsTokenCategoryAccess() {
		return pIsTokenCategory;
	}
	
	public ParserRule getIsTokenCategoryRule() {
		return getIsTokenCategoryAccess().getRule();
	}
	
	//IsBehaviorCategory av3::BehaviorCategory:
	//	'behavior';
	public IsBehaviorCategoryElements getIsBehaviorCategoryAccess() {
		return pIsBehaviorCategory;
	}
	
	public ParserRule getIsBehaviorCategoryRule() {
		return getIsBehaviorCategoryAccess().getRule();
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
	
	//BinaryOperation av3::BinaryOperator:
	//	'in' | 'contains' | 'equals' | 'satisfies' | '!' | '?';
	public BinaryOperationElements getBinaryOperationAccess() {
		return pBinaryOperation;
	}
	
	public ParserRule getBinaryOperationRule() {
		return getBinaryOperationAccess().getRule();
	}
	
	//SatisfiesOperation av3::BinaryOperator:
	//	'satisfies';
	public SatisfiesOperationElements getSatisfiesOperationAccess() {
		return pSatisfiesOperation;
	}
	
	public ParserRule getSatisfiesOperationRule() {
		return getSatisfiesOperationAccess().getRule();
	}
	
	//EqualsOperation av3::BinaryOperator:
	//	'=';
	public EqualsOperationElements getEqualsOperationAccess() {
		return pEqualsOperation;
	}
	
	public ParserRule getEqualsOperationRule() {
		return getEqualsOperationAccess().getRule();
	}
	
	//InOperation av3::BinaryOperator:
	//	'in';
	public InOperationElements getInOperationAccess() {
		return pInOperation;
	}
	
	public ParserRule getInOperationRule() {
		return getInOperationAccess().getRule();
	}
	
	//InputOperation av3::BinaryOperator:
	//	'?';
	public InputOperationElements getInputOperationAccess() {
		return pInputOperation;
	}
	
	public ParserRule getInputOperationRule() {
		return getInputOperationAccess().getRule();
	}
	
	//OutputOperation av3::BinaryOperator:
	//	'!';
	public OutputOperationElements getOutputOperationAccess() {
		return pOutputOperation;
	}
	
	public ParserRule getOutputOperationRule() {
		return getOutputOperationAccess().getRule();
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
	
	//EndToEndFLowKeywords:
	//	'end' 'to' 'end' 'flow';
	public EndToEndFLowKeywordsElements getEndToEndFLowKeywordsAccess() {
		return pEndToEndFLowKeywords;
	}
	
	public ParserRule getEndToEndFLowKeywordsRule() {
		return getEndToEndFLowKeywordsAccess().getRule();
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
