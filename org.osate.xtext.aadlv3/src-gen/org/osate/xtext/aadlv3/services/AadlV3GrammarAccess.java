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
		private final RuleCall cElementsPrimitiveTypeParserRuleCall_3_0_1 = (RuleCall)cElementsAlternatives_3_0.eContents().get(1);
		private final RuleCall cElementsComponentInterfaceParserRuleCall_3_0_2 = (RuleCall)cElementsAlternatives_3_0.eContents().get(2);
		private final RuleCall cElementsComponentImplementationParserRuleCall_3_0_3 = (RuleCall)cElementsAlternatives_3_0.eContents().get(3);
		private final RuleCall cElementsComponentConfigurationParserRuleCall_3_0_4 = (RuleCall)cElementsAlternatives_3_0.eContents().get(4);
		private final RuleCall cElementsPropertyParserRuleCall_3_0_5 = (RuleCall)cElementsAlternatives_3_0.eContents().get(5);
		private final RuleCall cElementsPropertySetParserRuleCall_3_0_6 = (RuleCall)cElementsAlternatives_3_0.eContents().get(6);
		private final RuleCall cElementsWorkingsetParserRuleCall_3_0_7 = (RuleCall)cElementsAlternatives_3_0.eContents().get(7);
		private final Keyword cEndKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final RuleCall cSEMICOLONParserRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		
		//PackageDeclaration av3::PackageDeclaration:
		//	'package' name=QualifiedName
		//	imports+=Import*
		//	elements+=(PackageDeclaration | PrimitiveType | ComponentInterface | ComponentImplementation | ComponentConfiguration
		//	| Property | PropertySet | Workingset)*
		//	'end' SEMICOLON;
		@Override public ParserRule getRule() { return rule; }
		
		//'package' name=QualifiedName imports+=Import* elements+=(PackageDeclaration | PrimitiveType | ComponentInterface |
		//ComponentImplementation | ComponentConfiguration | Property | PropertySet | Workingset)* 'end' SEMICOLON
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
		
		//elements+=(PackageDeclaration | PrimitiveType | ComponentInterface | ComponentImplementation | ComponentConfiguration |
		//Property | PropertySet | Workingset)*
		public Assignment getElementsAssignment_3() { return cElementsAssignment_3; }
		
		//(PackageDeclaration | PrimitiveType | ComponentInterface | ComponentImplementation | ComponentConfiguration | Property |
		//PropertySet | Workingset)
		public Alternatives getElementsAlternatives_3_0() { return cElementsAlternatives_3_0; }
		
		//PackageDeclaration
		public RuleCall getElementsPackageDeclarationParserRuleCall_3_0_0() { return cElementsPackageDeclarationParserRuleCall_3_0_0; }
		
		//PrimitiveType
		public RuleCall getElementsPrimitiveTypeParserRuleCall_3_0_1() { return cElementsPrimitiveTypeParserRuleCall_3_0_1; }
		
		//ComponentInterface
		public RuleCall getElementsComponentInterfaceParserRuleCall_3_0_2() { return cElementsComponentInterfaceParserRuleCall_3_0_2; }
		
		//ComponentImplementation
		public RuleCall getElementsComponentImplementationParserRuleCall_3_0_3() { return cElementsComponentImplementationParserRuleCall_3_0_3; }
		
		//ComponentConfiguration
		public RuleCall getElementsComponentConfigurationParserRuleCall_3_0_4() { return cElementsComponentConfigurationParserRuleCall_3_0_4; }
		
		//Property
		public RuleCall getElementsPropertyParserRuleCall_3_0_5() { return cElementsPropertyParserRuleCall_3_0_5; }
		
		//PropertySet
		public RuleCall getElementsPropertySetParserRuleCall_3_0_6() { return cElementsPropertySetParserRuleCall_3_0_6; }
		
		//Workingset
		public RuleCall getElementsWorkingsetParserRuleCall_3_0_7() { return cElementsWorkingsetParserRuleCall_3_0_7; }
		
		//'end'
		public Keyword getEndKeyword_4() { return cEndKeyword_4; }
		
		//SEMICOLON
		public RuleCall getSEMICOLONParserRuleCall_5() { return cSEMICOLONParserRuleCall_5; }
	}
	public class PropertyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.Property");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPropertyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cTypeTypeCrossReference_2_0 = (CrossReference)cTypeAssignment_2.eContents().get(0);
		private final RuleCall cTypeTypeQualifiedNameParserRuleCall_2_0_1 = (RuleCall)cTypeTypeCrossReference_2_0.eContents().get(1);
		private final RuleCall cSEMICOLONParserRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		//Property av3::Property:
		//	'property' name=ID type=[av3::Type|QualifiedName] SEMICOLON;
		@Override public ParserRule getRule() { return rule; }
		
		//'property' name=ID type=[av3::Type|QualifiedName] SEMICOLON
		public Group getGroup() { return cGroup; }
		
		//'property'
		public Keyword getPropertyKeyword_0() { return cPropertyKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//type=[av3::Type|QualifiedName]
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }
		
		//[av3::Type|QualifiedName]
		public CrossReference getTypeTypeCrossReference_2_0() { return cTypeTypeCrossReference_2_0; }
		
		//QualifiedName
		public RuleCall getTypeTypeQualifiedNameParserRuleCall_2_0_1() { return cTypeTypeQualifiedNameParserRuleCall_2_0_1; }
		
		//SEMICOLON
		public RuleCall getSEMICOLONParserRuleCall_3() { return cSEMICOLONParserRuleCall_3; }
	}
	public class PropertySetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.PropertySet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPropertiesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cPropertiesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cPropertiesPropertyCrossReference_2_0 = (CrossReference)cPropertiesAssignment_2.eContents().get(0);
		private final RuleCall cPropertiesPropertyQualifiedNameParserRuleCall_2_0_1 = (RuleCall)cPropertiesPropertyCrossReference_2_0.eContents().get(1);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCommaKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cPropertiesAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cPropertiesPropertyCrossReference_3_1_0 = (CrossReference)cPropertiesAssignment_3_1.eContents().get(0);
		private final RuleCall cPropertiesPropertyQualifiedNameParserRuleCall_3_1_0_1 = (RuleCall)cPropertiesPropertyCrossReference_3_1_0.eContents().get(1);
		private final Keyword cEndKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final RuleCall cSEMICOLONParserRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		
		//PropertySet av3::PropertySet:
		//	'properties' name=ID
		//	properties+=[av3::Property|QualifiedName] (',' properties+=[av3::Property|QualifiedName])*
		//	'end' SEMICOLON;
		@Override public ParserRule getRule() { return rule; }
		
		//'properties' name=ID properties+=[av3::Property|QualifiedName] (',' properties+=[av3::Property|QualifiedName])* 'end'
		//SEMICOLON
		public Group getGroup() { return cGroup; }
		
		//'properties'
		public Keyword getPropertiesKeyword_0() { return cPropertiesKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//properties+=[av3::Property|QualifiedName]
		public Assignment getPropertiesAssignment_2() { return cPropertiesAssignment_2; }
		
		//[av3::Property|QualifiedName]
		public CrossReference getPropertiesPropertyCrossReference_2_0() { return cPropertiesPropertyCrossReference_2_0; }
		
		//QualifiedName
		public RuleCall getPropertiesPropertyQualifiedNameParserRuleCall_2_0_1() { return cPropertiesPropertyQualifiedNameParserRuleCall_2_0_1; }
		
		//(',' properties+=[av3::Property|QualifiedName])*
		public Group getGroup_3() { return cGroup_3; }
		
		//','
		public Keyword getCommaKeyword_3_0() { return cCommaKeyword_3_0; }
		
		//properties+=[av3::Property|QualifiedName]
		public Assignment getPropertiesAssignment_3_1() { return cPropertiesAssignment_3_1; }
		
		//[av3::Property|QualifiedName]
		public CrossReference getPropertiesPropertyCrossReference_3_1_0() { return cPropertiesPropertyCrossReference_3_1_0; }
		
		//QualifiedName
		public RuleCall getPropertiesPropertyQualifiedNameParserRuleCall_3_1_0_1() { return cPropertiesPropertyQualifiedNameParserRuleCall_3_1_0_1; }
		
		//'end'
		public Keyword getEndKeyword_4() { return cEndKeyword_4; }
		
		//SEMICOLON
		public RuleCall getSEMICOLONParserRuleCall_5() { return cSEMICOLONParserRuleCall_5; }
	}
	public class PrimitiveTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.PrimitiveType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTypeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final RuleCall cPropertiesBlockParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final RuleCall cSEMICOLONParserRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		//PrimitiveType av3::PrimitiveType:
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
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cUseKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Keyword cPropertiesKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Assignment cUsePropertiesAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final CrossReference cUsePropertiesPropertySetCrossReference_6_2_0 = (CrossReference)cUsePropertiesAssignment_6_2.eContents().get(0);
		private final RuleCall cUsePropertiesPropertySetQualifiedNameParserRuleCall_6_2_0_1 = (RuleCall)cUsePropertiesPropertySetCrossReference_6_2_0.eContents().get(1);
		private final Group cGroup_6_3 = (Group)cGroup_6.eContents().get(3);
		private final Keyword cCommaKeyword_6_3_0 = (Keyword)cGroup_6_3.eContents().get(0);
		private final Assignment cUsePropertiesAssignment_6_3_1 = (Assignment)cGroup_6_3.eContents().get(1);
		private final CrossReference cUsePropertiesPropertySetCrossReference_6_3_1_0 = (CrossReference)cUsePropertiesAssignment_6_3_1.eContents().get(0);
		private final RuleCall cUsePropertiesPropertySetQualifiedNameParserRuleCall_6_3_1_0_1 = (RuleCall)cUsePropertiesPropertySetCrossReference_6_3_1_0.eContents().get(1);
		private final RuleCall cSEMICOLONParserRuleCall_6_4 = (RuleCall)cGroup_6.eContents().get(4);
		private final Keyword cEndKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final RuleCall cSEMICOLONParserRuleCall_8 = (RuleCall)cGroup.eContents().get(8);
		
		//ComponentInterface av3::ComponentInterface:
		//	private?='private' category=ComponentCategory? 'interface' name=ID ('extends' InterfaceExtensions?)?
		//	InterfaceBody? ('use' 'properties' useProperties+=[av3::PropertySet|QualifiedName] (','
		//	useProperties+=[av3::PropertySet|QualifiedName])* SEMICOLON)?
		//	'end' SEMICOLON;
		@Override public ParserRule getRule() { return rule; }
		
		//private?='private' category=ComponentCategory? 'interface' name=ID ('extends' InterfaceExtensions?)? InterfaceBody?
		//('use' 'properties' useProperties+=[av3::PropertySet|QualifiedName] (','
		//useProperties+=[av3::PropertySet|QualifiedName])* SEMICOLON)? 'end' SEMICOLON
		public Group getGroup() { return cGroup; }
		
		//private?='private'
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
		
		//InterfaceBody?
		public RuleCall getInterfaceBodyParserRuleCall_5() { return cInterfaceBodyParserRuleCall_5; }
		
		//('use' 'properties' useProperties+=[av3::PropertySet|QualifiedName] (','
		//useProperties+=[av3::PropertySet|QualifiedName])* SEMICOLON)?
		public Group getGroup_6() { return cGroup_6; }
		
		//'use'
		public Keyword getUseKeyword_6_0() { return cUseKeyword_6_0; }
		
		//'properties'
		public Keyword getPropertiesKeyword_6_1() { return cPropertiesKeyword_6_1; }
		
		//useProperties+=[av3::PropertySet|QualifiedName]
		public Assignment getUsePropertiesAssignment_6_2() { return cUsePropertiesAssignment_6_2; }
		
		//[av3::PropertySet|QualifiedName]
		public CrossReference getUsePropertiesPropertySetCrossReference_6_2_0() { return cUsePropertiesPropertySetCrossReference_6_2_0; }
		
		//QualifiedName
		public RuleCall getUsePropertiesPropertySetQualifiedNameParserRuleCall_6_2_0_1() { return cUsePropertiesPropertySetQualifiedNameParserRuleCall_6_2_0_1; }
		
		//(',' useProperties+=[av3::PropertySet|QualifiedName])*
		public Group getGroup_6_3() { return cGroup_6_3; }
		
		//','
		public Keyword getCommaKeyword_6_3_0() { return cCommaKeyword_6_3_0; }
		
		//useProperties+=[av3::PropertySet|QualifiedName]
		public Assignment getUsePropertiesAssignment_6_3_1() { return cUsePropertiesAssignment_6_3_1; }
		
		//[av3::PropertySet|QualifiedName]
		public CrossReference getUsePropertiesPropertySetCrossReference_6_3_1_0() { return cUsePropertiesPropertySetCrossReference_6_3_1_0; }
		
		//QualifiedName
		public RuleCall getUsePropertiesPropertySetQualifiedNameParserRuleCall_6_3_1_0_1() { return cUsePropertiesPropertySetQualifiedNameParserRuleCall_6_3_1_0_1; }
		
		//SEMICOLON
		public RuleCall getSEMICOLONParserRuleCall_6_4() { return cSEMICOLONParserRuleCall_6_4; }
		
		//'end'
		public Keyword getEndKeyword_7() { return cEndKeyword_7; }
		
		//SEMICOLON
		public RuleCall getSEMICOLONParserRuleCall_8() { return cSEMICOLONParserRuleCall_8; }
	}
	public class InterfaceBodyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.InterfaceBody");
		private final Group cGroup = (Group)rule.eContents().get(0);
		private final Keyword cIsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cFeaturesAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cFeaturesFeatureParserRuleCall_1_0_0 = (RuleCall)cFeaturesAssignment_1_0.eContents().get(0);
		private final Assignment cFlowsAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cFlowsFlowPathParserRuleCall_1_1_0 = (RuleCall)cFlowsAssignment_1_1.eContents().get(0);
		private final Assignment cFlowsAssignment_1_2 = (Assignment)cAlternatives_1.eContents().get(2);
		private final RuleCall cFlowsFlowSourceParserRuleCall_1_2_0 = (RuleCall)cFlowsAssignment_1_2.eContents().get(0);
		private final Assignment cFlowsAssignment_1_3 = (Assignment)cAlternatives_1.eContents().get(3);
		private final RuleCall cFlowsFlowSinkParserRuleCall_1_3_0 = (RuleCall)cFlowsAssignment_1_3.eContents().get(0);
		private final Assignment cPropertyAssociationsAssignment_1_4 = (Assignment)cAlternatives_1.eContents().get(4);
		private final RuleCall cPropertyAssociationsPropertyAssociationParserRuleCall_1_4_0 = (RuleCall)cPropertyAssociationsAssignment_1_4.eContents().get(0);
		
		//fragment InterfaceBody *:
		//	'is' (features+=Feature | flows+=FlowPath | flows+=FlowSource | flows+=FlowSink |
		//	propertyAssociations+=PropertyAssociation)*;
		@Override public ParserRule getRule() { return rule; }
		
		//'is' (features+=Feature | flows+=FlowPath | flows+=FlowSource | flows+=FlowSink |
		//propertyAssociations+=PropertyAssociation)*
		public Group getGroup() { return cGroup; }
		
		//'is'
		public Keyword getIsKeyword_0() { return cIsKeyword_0; }
		
		//(features+=Feature | flows+=FlowPath | flows+=FlowSource | flows+=FlowSink | propertyAssociations+=PropertyAssociation)*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//features+=Feature
		public Assignment getFeaturesAssignment_1_0() { return cFeaturesAssignment_1_0; }
		
		//Feature
		public RuleCall getFeaturesFeatureParserRuleCall_1_0_0() { return cFeaturesFeatureParserRuleCall_1_0_0; }
		
		//flows+=FlowPath
		public Assignment getFlowsAssignment_1_1() { return cFlowsAssignment_1_1; }
		
		//FlowPath
		public RuleCall getFlowsFlowPathParserRuleCall_1_1_0() { return cFlowsFlowPathParserRuleCall_1_1_0; }
		
		//flows+=FlowSource
		public Assignment getFlowsAssignment_1_2() { return cFlowsAssignment_1_2; }
		
		//FlowSource
		public RuleCall getFlowsFlowSourceParserRuleCall_1_2_0() { return cFlowsFlowSourceParserRuleCall_1_2_0; }
		
		//flows+=FlowSink
		public Assignment getFlowsAssignment_1_3() { return cFlowsAssignment_1_3; }
		
		//FlowSink
		public RuleCall getFlowsFlowSinkParserRuleCall_1_3_0() { return cFlowsFlowSinkParserRuleCall_1_3_0; }
		
		//propertyAssociations+=PropertyAssociation
		public Assignment getPropertyAssociationsAssignment_1_4() { return cPropertyAssociationsAssignment_1_4; }
		
		//PropertyAssociation
		public RuleCall getPropertyAssociationsPropertyAssociationParserRuleCall_1_4_0() { return cPropertyAssociationsPropertyAssociationParserRuleCall_1_4_0; }
	}
	public class ComponentImplementationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ComponentImplementation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPrivateAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cPrivatePrivateKeyword_0_0 = (Keyword)cPrivateAssignment_0.eContents().get(0);
		private final Assignment cCategoryAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cCategoryComponentCategoryParserRuleCall_1_0 = (RuleCall)cCategoryAssignment_1.eContents().get(0);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameQualifiedNameParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cExtendsKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final RuleCall cImplementationExtensionsParserRuleCall_3_1 = (RuleCall)cGroup_3.eContents().get(1);
		private final RuleCall cImplementationBodyParserRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		private final Keyword cEndKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final RuleCall cSEMICOLONParserRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		
		//ComponentImplementation av3::ComponentImplementation:
		//	private?='private' category=ComponentCategory name=QualifiedName ('extends' ImplementationExtensions?)?
		//	ImplementationBody?
		//	'end' SEMICOLON;
		@Override public ParserRule getRule() { return rule; }
		
		//private?='private' category=ComponentCategory name=QualifiedName ('extends' ImplementationExtensions?)?
		//ImplementationBody? 'end' SEMICOLON
		public Group getGroup() { return cGroup; }
		
		//private?='private'
		public Assignment getPrivateAssignment_0() { return cPrivateAssignment_0; }
		
		//'private'
		public Keyword getPrivatePrivateKeyword_0_0() { return cPrivatePrivateKeyword_0_0; }
		
		//category=ComponentCategory
		public Assignment getCategoryAssignment_1() { return cCategoryAssignment_1; }
		
		//ComponentCategory
		public RuleCall getCategoryComponentCategoryParserRuleCall_1_0() { return cCategoryComponentCategoryParserRuleCall_1_0; }
		
		//name=QualifiedName
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_2_0() { return cNameQualifiedNameParserRuleCall_2_0; }
		
		//('extends' ImplementationExtensions?)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'extends'
		public Keyword getExtendsKeyword_3_0() { return cExtendsKeyword_3_0; }
		
		//ImplementationExtensions?
		public RuleCall getImplementationExtensionsParserRuleCall_3_1() { return cImplementationExtensionsParserRuleCall_3_1; }
		
		//ImplementationBody?
		public RuleCall getImplementationBodyParserRuleCall_4() { return cImplementationBodyParserRuleCall_4; }
		
		//'end'
		public Keyword getEndKeyword_5() { return cEndKeyword_5; }
		
		//SEMICOLON
		public RuleCall getSEMICOLONParserRuleCall_6() { return cSEMICOLONParserRuleCall_6; }
	}
	public class ImplementationBodyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ImplementationBody");
		private final Group cGroup = (Group)rule.eContents().get(0);
		private final Keyword cIsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cConnectionsAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cConnectionsConnectionParserRuleCall_1_0_0 = (RuleCall)cConnectionsAssignment_1_0.eContents().get(0);
		private final Assignment cConnectionsAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cConnectionsFeatureMappingParserRuleCall_1_1_0 = (RuleCall)cConnectionsAssignment_1_1.eContents().get(0);
		private final Assignment cComponentsAssignment_1_2 = (Assignment)cAlternatives_1.eContents().get(2);
		private final RuleCall cComponentsComponentParserRuleCall_1_2_0 = (RuleCall)cComponentsAssignment_1_2.eContents().get(0);
		private final Assignment cPathsAssignment_1_3 = (Assignment)cAlternatives_1.eContents().get(3);
		private final RuleCall cPathsPathParserRuleCall_1_3_0 = (RuleCall)cPathsAssignment_1_3.eContents().get(0);
		private final Assignment cFlowAssignmentsAssignment_1_4 = (Assignment)cAlternatives_1.eContents().get(4);
		private final RuleCall cFlowAssignmentsFlowAssignmentParserRuleCall_1_4_0 = (RuleCall)cFlowAssignmentsAssignment_1_4.eContents().get(0);
		private final Assignment cAssignmentsAssignment_1_5 = (Assignment)cAlternatives_1.eContents().get(5);
		private final RuleCall cAssignmentsConfigurationAssignmentParserRuleCall_1_5_0 = (RuleCall)cAssignmentsAssignment_1_5.eContents().get(0);
		private final Assignment cPropertyAssociationsAssignment_1_6 = (Assignment)cAlternatives_1.eContents().get(6);
		private final RuleCall cPropertyAssociationsPropertyAssociationParserRuleCall_1_6_0 = (RuleCall)cPropertyAssociationsAssignment_1_6.eContents().get(0);
		
		//fragment ImplementationBody *:
		//	'is' (connections+=Connection | connections+=FeatureMapping | components+=Component | paths+=Path |
		//	flowAssignments+=FlowAssignment | assignments+=ConfigurationAssignment | propertyAssociations+=PropertyAssociation)*;
		@Override public ParserRule getRule() { return rule; }
		
		//'is' (connections+=Connection | connections+=FeatureMapping | components+=Component | paths+=Path |
		//flowAssignments+=FlowAssignment | assignments+=ConfigurationAssignment | propertyAssociations+=PropertyAssociation)*
		public Group getGroup() { return cGroup; }
		
		//'is'
		public Keyword getIsKeyword_0() { return cIsKeyword_0; }
		
		//(connections+=Connection | connections+=FeatureMapping | components+=Component | paths+=Path |
		//flowAssignments+=FlowAssignment | assignments+=ConfigurationAssignment | propertyAssociations+=PropertyAssociation)*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//connections+=Connection
		public Assignment getConnectionsAssignment_1_0() { return cConnectionsAssignment_1_0; }
		
		//Connection
		public RuleCall getConnectionsConnectionParserRuleCall_1_0_0() { return cConnectionsConnectionParserRuleCall_1_0_0; }
		
		//connections+=FeatureMapping
		public Assignment getConnectionsAssignment_1_1() { return cConnectionsAssignment_1_1; }
		
		//FeatureMapping
		public RuleCall getConnectionsFeatureMappingParserRuleCall_1_1_0() { return cConnectionsFeatureMappingParserRuleCall_1_1_0; }
		
		//components+=Component
		public Assignment getComponentsAssignment_1_2() { return cComponentsAssignment_1_2; }
		
		//Component
		public RuleCall getComponentsComponentParserRuleCall_1_2_0() { return cComponentsComponentParserRuleCall_1_2_0; }
		
		//paths+=Path
		public Assignment getPathsAssignment_1_3() { return cPathsAssignment_1_3; }
		
		//Path
		public RuleCall getPathsPathParserRuleCall_1_3_0() { return cPathsPathParserRuleCall_1_3_0; }
		
		//flowAssignments+=FlowAssignment
		public Assignment getFlowAssignmentsAssignment_1_4() { return cFlowAssignmentsAssignment_1_4; }
		
		//FlowAssignment
		public RuleCall getFlowAssignmentsFlowAssignmentParserRuleCall_1_4_0() { return cFlowAssignmentsFlowAssignmentParserRuleCall_1_4_0; }
		
		//assignments+=ConfigurationAssignment
		public Assignment getAssignmentsAssignment_1_5() { return cAssignmentsAssignment_1_5; }
		
		//ConfigurationAssignment
		public RuleCall getAssignmentsConfigurationAssignmentParserRuleCall_1_5_0() { return cAssignmentsConfigurationAssignmentParserRuleCall_1_5_0; }
		
		//propertyAssociations+=PropertyAssociation
		public Assignment getPropertyAssociationsAssignment_1_6() { return cPropertyAssociationsAssignment_1_6; }
		
		//PropertyAssociation
		public RuleCall getPropertyAssociationsPropertyAssociationParserRuleCall_1_6_0() { return cPropertyAssociationsPropertyAssociationParserRuleCall_1_6_0; }
	}
	public class ComponentConfigurationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ComponentConfiguration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPrivateAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cPrivatePrivateKeyword_0_0 = (Keyword)cPrivateAssignment_0.eContents().get(0);
		private final Keyword cConfigurationKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameQualifiedNameParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final RuleCall cParametersParserRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Keyword cExtendsKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final RuleCall cClassifierExtensionsParserRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final RuleCall cConfigurationElementBlockParserRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		private final Keyword cEndKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final RuleCall cSEMICOLONParserRuleCall_8 = (RuleCall)cGroup.eContents().get(8);
		
		//ComponentConfiguration av3::ComponentConfiguration:
		//	private?='private' 'configuration' name=QualifiedName
		//	Parameters?
		//	'extends' ClassifierExtensions ConfigurationElementBlock?
		//	'end' SEMICOLON;
		@Override public ParserRule getRule() { return rule; }
		
		//private?='private' 'configuration' name=QualifiedName Parameters? 'extends' ClassifierExtensions
		//ConfigurationElementBlock? 'end' SEMICOLON
		public Group getGroup() { return cGroup; }
		
		//private?='private'
		public Assignment getPrivateAssignment_0() { return cPrivateAssignment_0; }
		
		//'private'
		public Keyword getPrivatePrivateKeyword_0_0() { return cPrivatePrivateKeyword_0_0; }
		
		//'configuration'
		public Keyword getConfigurationKeyword_1() { return cConfigurationKeyword_1; }
		
		//name=QualifiedName
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_2_0() { return cNameQualifiedNameParserRuleCall_2_0; }
		
		//Parameters?
		public RuleCall getParametersParserRuleCall_3() { return cParametersParserRuleCall_3; }
		
		//'extends'
		public Keyword getExtendsKeyword_4() { return cExtendsKeyword_4; }
		
		//ClassifierExtensions
		public RuleCall getClassifierExtensionsParserRuleCall_5() { return cClassifierExtensionsParserRuleCall_5; }
		
		//ConfigurationElementBlock?
		public RuleCall getConfigurationElementBlockParserRuleCall_6() { return cConfigurationElementBlockParserRuleCall_6; }
		
		//'end'
		public Keyword getEndKeyword_7() { return cEndKeyword_7; }
		
		//SEMICOLON
		public RuleCall getSEMICOLONParserRuleCall_8() { return cSEMICOLONParserRuleCall_8; }
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
		private final Assignment cReverseAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final Keyword cReverseReverseKeyword_5_0 = (Keyword)cReverseAssignment_5.eContents().get(0);
		private final Assignment cTypeAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final CrossReference cTypeTypeCrossReference_6_0 = (CrossReference)cTypeAssignment_6.eContents().get(0);
		private final RuleCall cTypeTypeQualifiedNameParserRuleCall_6_0_1 = (RuleCall)cTypeTypeCrossReference_6_0.eContents().get(1);
		private final RuleCall cPropertiesBlockParserRuleCall_7 = (RuleCall)cGroup.eContents().get(7);
		private final RuleCall cSEMICOLONParserRuleCall_8 = (RuleCall)cGroup.eContents().get(8);
		
		//// (Instance) model elements
		//Feature av3::Feature:
		//	name=ID ':' direction=FeatureDirection? sampled?='sampled'? category=FeatureCategory
		//	reverse?='reverse'? type=[av3::Type|QualifiedName]? PropertiesBlock?
		//	SEMICOLON;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' direction=FeatureDirection? sampled?='sampled'? category=FeatureCategory reverse?='reverse'?
		//type=[av3::Type|QualifiedName]? PropertiesBlock? SEMICOLON
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
		
		//reverse?='reverse'?
		public Assignment getReverseAssignment_5() { return cReverseAssignment_5; }
		
		//'reverse'
		public Keyword getReverseReverseKeyword_5_0() { return cReverseReverseKeyword_5_0; }
		
		//type=[av3::Type|QualifiedName]?
		public Assignment getTypeAssignment_6() { return cTypeAssignment_6; }
		
		//[av3::Type|QualifiedName]
		public CrossReference getTypeTypeCrossReference_6_0() { return cTypeTypeCrossReference_6_0; }
		
		//QualifiedName
		public RuleCall getTypeTypeQualifiedNameParserRuleCall_6_0_1() { return cTypeTypeQualifiedNameParserRuleCall_6_0_1; }
		
		//PropertiesBlock?
		public RuleCall getPropertiesBlockParserRuleCall_7() { return cPropertiesBlockParserRuleCall_7; }
		
		//SEMICOLON
		public RuleCall getSEMICOLONParserRuleCall_8() { return cSEMICOLONParserRuleCall_8; }
	}
	public class ComponentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.Component");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cCategoryAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cCategoryComponentCategoryParserRuleCall_2_0 = (RuleCall)cCategoryAssignment_2.eContents().get(0);
		private final Assignment cTypeReferenceAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTypeReferenceTypeReferenceParserRuleCall_3_0 = (RuleCall)cTypeReferenceAssignment_3.eContents().get(0);
		private final RuleCall cNestedComponentImplementationBlockParserRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		private final RuleCall cSEMICOLONParserRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		
		//Component av3::Component:
		//	name=ID ':' category=ComponentCategory
		//	typeReference=TypeReference? NestedComponentImplementationBlock?
		//	SEMICOLON;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' category=ComponentCategory typeReference=TypeReference? NestedComponentImplementationBlock? SEMICOLON
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
		
		//typeReference=TypeReference?
		public Assignment getTypeReferenceAssignment_3() { return cTypeReferenceAssignment_3; }
		
		//TypeReference
		public RuleCall getTypeReferenceTypeReferenceParserRuleCall_3_0() { return cTypeReferenceTypeReferenceParserRuleCall_3_0; }
		
		//NestedComponentImplementationBlock?
		public RuleCall getNestedComponentImplementationBlockParserRuleCall_4() { return cNestedComponentImplementationBlockParserRuleCall_4; }
		
		//SEMICOLON
		public RuleCall getSEMICOLONParserRuleCall_5() { return cSEMICOLONParserRuleCall_5; }
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
		private final RuleCall cSEMICOLONParserRuleCall_7 = (RuleCall)cGroup.eContents().get(7);
		
		//Connection av3::Association:
		//	name=ID ':' associationType=ConnectionType source=ModelElementReference
		//	'->' destination=ModelElementReference PropertiesBlock? SEMICOLON;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' associationType=ConnectionType source=ModelElementReference '->' destination=ModelElementReference
		//PropertiesBlock? SEMICOLON
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
		
		//SEMICOLON
		public RuleCall getSEMICOLONParserRuleCall_7() { return cSEMICOLONParserRuleCall_7; }
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
		private final Keyword cHyphenMinusGreaterThanSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cDestinationAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cDestinationModelElementReferenceParserRuleCall_5_0 = (RuleCall)cDestinationAssignment_5.eContents().get(0);
		private final RuleCall cPropertiesBlockParserRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		private final RuleCall cSEMICOLONParserRuleCall_7 = (RuleCall)cGroup.eContents().get(7);
		
		//FeatureMapping av3::Association:
		//	name=ID ':' associationType=MappingType source=ModelElementReference
		//	'->' destination=ModelElementReference PropertiesBlock? SEMICOLON;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' associationType=MappingType source=ModelElementReference '->' destination=ModelElementReference
		//PropertiesBlock? SEMICOLON
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
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_4() { return cHyphenMinusGreaterThanSignKeyword_4; }
		
		//destination=ModelElementReference
		public Assignment getDestinationAssignment_5() { return cDestinationAssignment_5; }
		
		//ModelElementReference
		public RuleCall getDestinationModelElementReferenceParserRuleCall_5_0() { return cDestinationModelElementReferenceParserRuleCall_5_0; }
		
		//PropertiesBlock?
		public RuleCall getPropertiesBlockParserRuleCall_6() { return cPropertiesBlockParserRuleCall_6; }
		
		//SEMICOLON
		public RuleCall getSEMICOLONParserRuleCall_7() { return cSEMICOLONParserRuleCall_7; }
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
		private final RuleCall cSEMICOLONParserRuleCall_7 = (RuleCall)cGroup.eContents().get(7);
		
		//FlowPath av3::Association:
		//	name=ID ':' associationType=FlowPathType source=ModelElementReference
		//	'->' destination=ModelElementReference PropertiesBlock? SEMICOLON;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' associationType=FlowPathType source=ModelElementReference '->' destination=ModelElementReference
		//PropertiesBlock? SEMICOLON
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
		
		//SEMICOLON
		public RuleCall getSEMICOLONParserRuleCall_7() { return cSEMICOLONParserRuleCall_7; }
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
		private final RuleCall cSEMICOLONParserRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		
		//FlowSource av3::Association:
		//	name=ID ':' associationType=FlowSourceType destination=ModelElementReference PropertiesBlock? SEMICOLON;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' associationType=FlowSourceType destination=ModelElementReference PropertiesBlock? SEMICOLON
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
		
		//SEMICOLON
		public RuleCall getSEMICOLONParserRuleCall_5() { return cSEMICOLONParserRuleCall_5; }
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
		private final RuleCall cSEMICOLONParserRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		
		//FlowSink av3::Association:
		//	name=ID ':' associationType=FlowSinkType source=ModelElementReference
		//	PropertiesBlock? SEMICOLON;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' associationType=FlowSinkType source=ModelElementReference PropertiesBlock? SEMICOLON
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
		
		//SEMICOLON
		public RuleCall getSEMICOLONParserRuleCall_5() { return cSEMICOLONParserRuleCall_5; }
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
		private final RuleCall cSEMICOLONParserRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		
		//Path av3::PathSequence:
		//	name=ID ':' EndToEndFlowKeywords elements+=PathElement ('->' elements+=PathElement)+
		//	PropertiesBlock? SEMICOLON;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' EndToEndFlowKeywords elements+=PathElement ('->' elements+=PathElement)+ PropertiesBlock? SEMICOLON
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
		
		//SEMICOLON
		public RuleCall getSEMICOLONParserRuleCall_6() { return cSEMICOLONParserRuleCall_6; }
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
		private final Assignment cImportedNamespaceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0 = (RuleCall)cImportedNamespaceAssignment_1.eContents().get(0);
		private final RuleCall cSEMICOLONParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//Import av3::Import:
		//	'import' importedNamespace=QualifiedNameWithWildcard SEMICOLON;
		@Override public ParserRule getRule() { return rule; }
		
		//'import' importedNamespace=QualifiedNameWithWildcard SEMICOLON
		public Group getGroup() { return cGroup; }
		
		//'import'
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }
		
		//importedNamespace=QualifiedNameWithWildcard
		public Assignment getImportedNamespaceAssignment_1() { return cImportedNamespaceAssignment_1; }
		
		//QualifiedNameWithWildcard
		public RuleCall getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0() { return cImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0; }
		
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
		private final Assignment cValueAssignment_2_0_0 = (Assignment)cGroup_2_0.eContents().get(0);
		private final RuleCall cValueTypeReferenceParserRuleCall_2_0_0_0 = (RuleCall)cValueAssignment_2_0_0.eContents().get(0);
		private final RuleCall cCurlyConfigurationElementBlockParserRuleCall_2_0_1 = (RuleCall)cGroup_2_0.eContents().get(1);
		private final RuleCall cCurlyConfigurationElementBlockParserRuleCall_2_1 = (RuleCall)cAlternatives_2.eContents().get(1);
		private final RuleCall cSEMICOLONParserRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		//ConfigurationAssignment av3::ConfigurationAssignment:
		//	target=ModelElementReference '=>' (value=TypeReference CurlyConfigurationElementBlock? |
		//	CurlyConfigurationElementBlock) SEMICOLON;
		@Override public ParserRule getRule() { return rule; }
		
		//target=ModelElementReference '=>' (value=TypeReference CurlyConfigurationElementBlock? | CurlyConfigurationElementBlock)
		//SEMICOLON
		public Group getGroup() { return cGroup; }
		
		//target=ModelElementReference
		public Assignment getTargetAssignment_0() { return cTargetAssignment_0; }
		
		//ModelElementReference
		public RuleCall getTargetModelElementReferenceParserRuleCall_0_0() { return cTargetModelElementReferenceParserRuleCall_0_0; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_1() { return cEqualsSignGreaterThanSignKeyword_1; }
		
		//value=TypeReference CurlyConfigurationElementBlock? | CurlyConfigurationElementBlock
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//value=TypeReference CurlyConfigurationElementBlock?
		public Group getGroup_2_0() { return cGroup_2_0; }
		
		//value=TypeReference
		public Assignment getValueAssignment_2_0_0() { return cValueAssignment_2_0_0; }
		
		//TypeReference
		public RuleCall getValueTypeReferenceParserRuleCall_2_0_0_0() { return cValueTypeReferenceParserRuleCall_2_0_0_0; }
		
		//CurlyConfigurationElementBlock?
		public RuleCall getCurlyConfigurationElementBlockParserRuleCall_2_0_1() { return cCurlyConfigurationElementBlockParserRuleCall_2_0_1; }
		
		//CurlyConfigurationElementBlock
		public RuleCall getCurlyConfigurationElementBlockParserRuleCall_2_1() { return cCurlyConfigurationElementBlockParserRuleCall_2_1; }
		
		//SEMICOLON
		public RuleCall getSEMICOLONParserRuleCall_3() { return cSEMICOLONParserRuleCall_3; }
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
		private final RuleCall cSEMICOLONParserRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		
		//FlowAssignment av3::PathSequence:
		//	target=ModelElementReference '=>' 'flow'
		//	elements+=PathElement ('->' elements+=PathElement)*
		//	SEMICOLON;
		@Override public ParserRule getRule() { return rule; }
		
		//target=ModelElementReference '=>' 'flow' elements+=PathElement ('->' elements+=PathElement)* SEMICOLON
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
		
		//SEMICOLON
		public RuleCall getSEMICOLONParserRuleCall_5() { return cSEMICOLONParserRuleCall_5; }
	}
	public class PropertyAssociationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.PropertyAssociation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTargetAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTargetPropertyReferenceParserRuleCall_0_0 = (RuleCall)cTargetAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValuePropertyValueParserRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		private final RuleCall cSEMICOLONParserRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		//PropertyAssociation av3::PropertyAssociation:
		//	target=PropertyReference '=>'
		//	value=PropertyValue SEMICOLON;
		@Override public ParserRule getRule() { return rule; }
		
		//target=PropertyReference '=>' value=PropertyValue SEMICOLON
		public Group getGroup() { return cGroup; }
		
		//target=PropertyReference
		public Assignment getTargetAssignment_0() { return cTargetAssignment_0; }
		
		//PropertyReference
		public RuleCall getTargetPropertyReferenceParserRuleCall_0_0() { return cTargetPropertyReferenceParserRuleCall_0_0; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_1() { return cEqualsSignGreaterThanSignKeyword_1; }
		
		//value=PropertyValue
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//PropertyValue
		public RuleCall getValuePropertyValueParserRuleCall_2_0() { return cValuePropertyValueParserRuleCall_2_0; }
		
		//SEMICOLON
		public RuleCall getSEMICOLONParserRuleCall_3() { return cSEMICOLONParserRuleCall_3; }
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
	public class PropertyReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.PropertyReference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Assignment cElementAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final CrossReference cElementModelElementCrossReference_0_0_0 = (CrossReference)cElementAssignment_0_0.eContents().get(0);
		private final RuleCall cElementModelElementIDTerminalRuleCall_0_0_0_1 = (RuleCall)cElementModelElementCrossReference_0_0_0.eContents().get(1);
		private final Group cGroup_0_1 = (Group)cGroup_0.eContents().get(1);
		private final Group cGroup_0_1_0 = (Group)cGroup_0_1.eContents().get(0);
		private final Action cModelElementReferenceContextAction_0_1_0_0 = (Action)cGroup_0_1_0.eContents().get(0);
		private final Keyword cFullStopKeyword_0_1_0_1 = (Keyword)cGroup_0_1_0.eContents().get(1);
		private final Assignment cElementAssignment_0_1_0_2 = (Assignment)cGroup_0_1_0.eContents().get(2);
		private final CrossReference cElementModelElementCrossReference_0_1_0_2_0 = (CrossReference)cElementAssignment_0_1_0_2.eContents().get(0);
		private final RuleCall cElementModelElementIDTerminalRuleCall_0_1_0_2_0_1 = (RuleCall)cElementModelElementCrossReference_0_1_0_2_0.eContents().get(1);
		private final Keyword cNumberSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cPropertyAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cPropertyPropertyCrossReference_2_0 = (CrossReference)cPropertyAssignment_2.eContents().get(0);
		private final RuleCall cPropertyPropertyQualifiedNameParserRuleCall_2_0_1 = (RuleCall)cPropertyPropertyCrossReference_2_0.eContents().get(1);
		
		//PropertyReference av3::ModelElementReference:
		//	(element=[av3::ModelElement] => ({av3::ModelElementReference.context=current} '.' element=[av3::ModelElement])*)? '#'
		//	property=[av3::Property|QualifiedName];
		@Override public ParserRule getRule() { return rule; }
		
		//(element=[av3::ModelElement] => ({av3::ModelElementReference.context=current} '.' element=[av3::ModelElement])*)? '#'
		//property=[av3::Property|QualifiedName]
		public Group getGroup() { return cGroup; }
		
		//(element=[av3::ModelElement] => ({av3::ModelElementReference.context=current} '.' element=[av3::ModelElement])*)?
		public Group getGroup_0() { return cGroup_0; }
		
		//element=[av3::ModelElement]
		public Assignment getElementAssignment_0_0() { return cElementAssignment_0_0; }
		
		//[av3::ModelElement]
		public CrossReference getElementModelElementCrossReference_0_0_0() { return cElementModelElementCrossReference_0_0_0; }
		
		//ID
		public RuleCall getElementModelElementIDTerminalRuleCall_0_0_0_1() { return cElementModelElementIDTerminalRuleCall_0_0_0_1; }
		
		//=> ({av3::ModelElementReference.context=current} '.' element=[av3::ModelElement])*
		public Group getGroup_0_1() { return cGroup_0_1; }
		
		//{av3::ModelElementReference.context=current} '.' element=[av3::ModelElement]
		public Group getGroup_0_1_0() { return cGroup_0_1_0; }
		
		//{av3::ModelElementReference.context=current}
		public Action getModelElementReferenceContextAction_0_1_0_0() { return cModelElementReferenceContextAction_0_1_0_0; }
		
		//'.'
		public Keyword getFullStopKeyword_0_1_0_1() { return cFullStopKeyword_0_1_0_1; }
		
		//element=[av3::ModelElement]
		public Assignment getElementAssignment_0_1_0_2() { return cElementAssignment_0_1_0_2; }
		
		//[av3::ModelElement]
		public CrossReference getElementModelElementCrossReference_0_1_0_2_0() { return cElementModelElementCrossReference_0_1_0_2_0; }
		
		//ID
		public RuleCall getElementModelElementIDTerminalRuleCall_0_1_0_2_0_1() { return cElementModelElementIDTerminalRuleCall_0_1_0_2_0_1; }
		
		//'#'
		public Keyword getNumberSignKeyword_1() { return cNumberSignKeyword_1; }
		
		//property=[av3::Property|QualifiedName]
		public Assignment getPropertyAssignment_2() { return cPropertyAssignment_2; }
		
		//[av3::Property|QualifiedName]
		public CrossReference getPropertyPropertyCrossReference_2_0() { return cPropertyPropertyCrossReference_2_0; }
		
		//QualifiedName
		public RuleCall getPropertyPropertyQualifiedNameParserRuleCall_2_0_1() { return cPropertyPropertyQualifiedNameParserRuleCall_2_0_1; }
	}
	public class ConfigurationElementBlockElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ConfigurationElementBlock");
		private final Group cGroup = (Group)rule.eContents().get(0);
		private final Keyword cIsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cPropertyAssociationsAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cPropertyAssociationsPropertyAssociationParserRuleCall_1_0_0 = (RuleCall)cPropertyAssociationsAssignment_1_0.eContents().get(0);
		private final Assignment cAssignmentsAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cAssignmentsConfigurationAssignmentParserRuleCall_1_1_0 = (RuleCall)cAssignmentsAssignment_1_1.eContents().get(0);
		
		//fragment ConfigurationElementBlock *:
		//	'is' (propertyAssociations+=PropertyAssociation | assignments+=ConfigurationAssignment)+;
		@Override public ParserRule getRule() { return rule; }
		
		//'is' (propertyAssociations+=PropertyAssociation | assignments+=ConfigurationAssignment)+
		public Group getGroup() { return cGroup; }
		
		//'is'
		public Keyword getIsKeyword_0() { return cIsKeyword_0; }
		
		//(propertyAssociations+=PropertyAssociation | assignments+=ConfigurationAssignment)+
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//propertyAssociations+=PropertyAssociation
		public Assignment getPropertyAssociationsAssignment_1_0() { return cPropertyAssociationsAssignment_1_0; }
		
		//PropertyAssociation
		public RuleCall getPropertyAssociationsPropertyAssociationParserRuleCall_1_0_0() { return cPropertyAssociationsPropertyAssociationParserRuleCall_1_0_0; }
		
		//assignments+=ConfigurationAssignment
		public Assignment getAssignmentsAssignment_1_1() { return cAssignmentsAssignment_1_1; }
		
		//ConfigurationAssignment
		public RuleCall getAssignmentsConfigurationAssignmentParserRuleCall_1_1_0() { return cAssignmentsConfigurationAssignmentParserRuleCall_1_1_0; }
	}
	public class CurlyConfigurationElementBlockElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.CurlyConfigurationElementBlock");
		private final Group cGroup = (Group)rule.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cPropertyAssociationsAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cPropertyAssociationsPropertyAssociationParserRuleCall_1_0_0 = (RuleCall)cPropertyAssociationsAssignment_1_0.eContents().get(0);
		private final Assignment cAssignmentsAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cAssignmentsConfigurationAssignmentParserRuleCall_1_1_0 = (RuleCall)cAssignmentsAssignment_1_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//fragment CurlyConfigurationElementBlock *:
		//	'{' (propertyAssociations+=PropertyAssociation | assignments+=ConfigurationAssignment)* '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'{' (propertyAssociations+=PropertyAssociation | assignments+=ConfigurationAssignment)* '}'
		public Group getGroup() { return cGroup; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }
		
		//(propertyAssociations+=PropertyAssociation | assignments+=ConfigurationAssignment)*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//propertyAssociations+=PropertyAssociation
		public Assignment getPropertyAssociationsAssignment_1_0() { return cPropertyAssociationsAssignment_1_0; }
		
		//PropertyAssociation
		public RuleCall getPropertyAssociationsPropertyAssociationParserRuleCall_1_0_0() { return cPropertyAssociationsPropertyAssociationParserRuleCall_1_0_0; }
		
		//assignments+=ConfigurationAssignment
		public Assignment getAssignmentsAssignment_1_1() { return cAssignmentsAssignment_1_1; }
		
		//ConfigurationAssignment
		public RuleCall getAssignmentsConfigurationAssignmentParserRuleCall_1_1_0() { return cAssignmentsConfigurationAssignmentParserRuleCall_1_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_2() { return cRightCurlyBracketKeyword_2; }
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
		private final RuleCall cTypeComponentInterfaceQualifiedNameParserRuleCall_1_0_1 = (RuleCall)cTypeComponentInterfaceCrossReference_1_0.eContents().get(1);
		
		//// reference objects for classifiers including configurations with parameter
		//ReversableInterfaceReference av3::TypeReference:
		//	reverse?='reverse'? type=[av3::ComponentInterface|QualifiedName];
		@Override public ParserRule getRule() { return rule; }
		
		//reverse?='reverse'? type=[av3::ComponentInterface|QualifiedName]
		public Group getGroup() { return cGroup; }
		
		//reverse?='reverse'?
		public Assignment getReverseAssignment_0() { return cReverseAssignment_0; }
		
		//'reverse'
		public Keyword getReverseReverseKeyword_0_0() { return cReverseReverseKeyword_0_0; }
		
		//type=[av3::ComponentInterface|QualifiedName]
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }
		
		//[av3::ComponentInterface|QualifiedName]
		public CrossReference getTypeComponentInterfaceCrossReference_1_0() { return cTypeComponentInterfaceCrossReference_1_0; }
		
		//QualifiedName
		public RuleCall getTypeComponentInterfaceQualifiedNameParserRuleCall_1_0_1() { return cTypeComponentInterfaceQualifiedNameParserRuleCall_1_0_1; }
	}
	public class TypeReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.TypeReference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cTypeTypeCrossReference_0_0 = (CrossReference)cTypeAssignment_0.eContents().get(0);
		private final RuleCall cTypeTypeQualifiedNameParserRuleCall_0_0_1 = (RuleCall)cTypeTypeCrossReference_0_0.eContents().get(1);
		private final RuleCall cConfigurationActualsParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//TypeReference av3::TypeReference:
		//	type=[av3::Type|QualifiedName] ConfigurationActuals?;
		@Override public ParserRule getRule() { return rule; }
		
		//type=[av3::Type|QualifiedName] ConfigurationActuals?
		public Group getGroup() { return cGroup; }
		
		//type=[av3::Type|QualifiedName]
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }
		
		//[av3::Type|QualifiedName]
		public CrossReference getTypeTypeCrossReference_0_0() { return cTypeTypeCrossReference_0_0; }
		
		//QualifiedName
		public RuleCall getTypeTypeQualifiedNameParserRuleCall_0_0_1() { return cTypeTypeQualifiedNameParserRuleCall_0_0_1; }
		
		//ConfigurationActuals?
		public RuleCall getConfigurationActualsParserRuleCall_1() { return cConfigurationActualsParserRuleCall_1; }
	}
	public class ImplementationReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ImplementationReference");
		private final Assignment cTypeAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cTypeComponentImplementationCrossReference_0 = (CrossReference)cTypeAssignment.eContents().get(0);
		private final RuleCall cTypeComponentImplementationQualifiedNameParserRuleCall_0_1 = (RuleCall)cTypeComponentImplementationCrossReference_0.eContents().get(1);
		
		//ImplementationReference av3::TypeReference:
		//	type=[av3::ComponentImplementation|QualifiedName];
		@Override public ParserRule getRule() { return rule; }
		
		//type=[av3::ComponentImplementation|QualifiedName]
		public Assignment getTypeAssignment() { return cTypeAssignment; }
		
		//[av3::ComponentImplementation|QualifiedName]
		public CrossReference getTypeComponentImplementationCrossReference_0() { return cTypeComponentImplementationCrossReference_0; }
		
		//QualifiedName
		public RuleCall getTypeComponentImplementationQualifiedNameParserRuleCall_0_1() { return cTypeComponentImplementationQualifiedNameParserRuleCall_0_1; }
	}
	public class PropertiesBlockElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.PropertiesBlock");
		private final Group cGroup = (Group)rule.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPropertyAssociationsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPropertyAssociationsPropertyAssociationParserRuleCall_1_0 = (RuleCall)cPropertyAssociationsAssignment_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//fragment PropertiesBlock *:
		//	'{' propertyAssociations+=PropertyAssociation* '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'{' propertyAssociations+=PropertyAssociation* '}'
		public Group getGroup() { return cGroup; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }
		
		//propertyAssociations+=PropertyAssociation*
		public Assignment getPropertyAssociationsAssignment_1() { return cPropertyAssociationsAssignment_1; }
		
		//PropertyAssociation
		public RuleCall getPropertyAssociationsPropertyAssociationParserRuleCall_1_0() { return cPropertyAssociationsPropertyAssociationParserRuleCall_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_2() { return cRightCurlyBracketKeyword_2; }
	}
	public class NestedComponentImplementationBlockElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.NestedComponentImplementationBlock");
		private final Group cGroup = (Group)rule.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cFeaturesAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cFeaturesFeatureParserRuleCall_1_0_0 = (RuleCall)cFeaturesAssignment_1_0.eContents().get(0);
		private final Assignment cConnectionsAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cConnectionsConnectionParserRuleCall_1_1_0 = (RuleCall)cConnectionsAssignment_1_1.eContents().get(0);
		private final Assignment cConnectionsAssignment_1_2 = (Assignment)cAlternatives_1.eContents().get(2);
		private final RuleCall cConnectionsFeatureMappingParserRuleCall_1_2_0 = (RuleCall)cConnectionsAssignment_1_2.eContents().get(0);
		private final Assignment cComponentsAssignment_1_3 = (Assignment)cAlternatives_1.eContents().get(3);
		private final RuleCall cComponentsComponentParserRuleCall_1_3_0 = (RuleCall)cComponentsAssignment_1_3.eContents().get(0);
		private final Assignment cPropertyAssociationsAssignment_1_4 = (Assignment)cAlternatives_1.eContents().get(4);
		private final RuleCall cPropertyAssociationsPropertyAssociationParserRuleCall_1_4_0 = (RuleCall)cPropertyAssociationsAssignment_1_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//// to be used for inline nested component implementations 
		//fragment NestedComponentImplementationBlock *:
		//	'{' (features+=Feature | connections+=Connection | connections+=FeatureMapping | components+=Component |
		//	propertyAssociations+=PropertyAssociation)* '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'{' (features+=Feature | connections+=Connection | connections+=FeatureMapping | components+=Component |
		//propertyAssociations+=PropertyAssociation)* '}'
		public Group getGroup() { return cGroup; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }
		
		//(features+=Feature | connections+=Connection | connections+=FeatureMapping | components+=Component |
		//propertyAssociations+=PropertyAssociation)*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//features+=Feature
		public Assignment getFeaturesAssignment_1_0() { return cFeaturesAssignment_1_0; }
		
		//Feature
		public RuleCall getFeaturesFeatureParserRuleCall_1_0_0() { return cFeaturesFeatureParserRuleCall_1_0_0; }
		
		//connections+=Connection
		public Assignment getConnectionsAssignment_1_1() { return cConnectionsAssignment_1_1; }
		
		//Connection
		public RuleCall getConnectionsConnectionParserRuleCall_1_1_0() { return cConnectionsConnectionParserRuleCall_1_1_0; }
		
		//connections+=FeatureMapping
		public Assignment getConnectionsAssignment_1_2() { return cConnectionsAssignment_1_2; }
		
		//FeatureMapping
		public RuleCall getConnectionsFeatureMappingParserRuleCall_1_2_0() { return cConnectionsFeatureMappingParserRuleCall_1_2_0; }
		
		//components+=Component
		public Assignment getComponentsAssignment_1_3() { return cComponentsAssignment_1_3; }
		
		//Component
		public RuleCall getComponentsComponentParserRuleCall_1_3_0() { return cComponentsComponentParserRuleCall_1_3_0; }
		
		//propertyAssociations+=PropertyAssociation
		public Assignment getPropertyAssociationsAssignment_1_4() { return cPropertyAssociationsAssignment_1_4; }
		
		//PropertyAssociation
		public RuleCall getPropertyAssociationsPropertyAssociationParserRuleCall_1_4_0() { return cPropertyAssociationsPropertyAssociationParserRuleCall_1_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_2() { return cRightCurlyBracketKeyword_2; }
	}
	public class ClassifierExtensionsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ClassifierExtensions");
		private final Group cGroup = (Group)rule.eContents().get(0);
		private final Assignment cSuperClassifiersAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cSuperClassifiersTypeReferenceParserRuleCall_0_0 = (RuleCall)cSuperClassifiersAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCommaKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cSuperClassifiersAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cSuperClassifiersTypeReferenceParserRuleCall_1_1_0 = (RuleCall)cSuperClassifiersAssignment_1_1.eContents().get(0);
		
		//fragment ClassifierExtensions *:
		//	superClassifiers+=TypeReference ("," superClassifiers+=TypeReference)*;
		@Override public ParserRule getRule() { return rule; }
		
		//superClassifiers+=TypeReference ("," superClassifiers+=TypeReference)*
		public Group getGroup() { return cGroup; }
		
		//superClassifiers+=TypeReference
		public Assignment getSuperClassifiersAssignment_0() { return cSuperClassifiersAssignment_0; }
		
		//TypeReference
		public RuleCall getSuperClassifiersTypeReferenceParserRuleCall_0_0() { return cSuperClassifiersTypeReferenceParserRuleCall_0_0; }
		
		//("," superClassifiers+=TypeReference)*
		public Group getGroup_1() { return cGroup_1; }
		
		//","
		public Keyword getCommaKeyword_1_0() { return cCommaKeyword_1_0; }
		
		//superClassifiers+=TypeReference
		public Assignment getSuperClassifiersAssignment_1_1() { return cSuperClassifiersAssignment_1_1; }
		
		//TypeReference
		public RuleCall getSuperClassifiersTypeReferenceParserRuleCall_1_1_0() { return cSuperClassifiersTypeReferenceParserRuleCall_1_1_0; }
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
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueTypeReferenceParserRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//ConfigurationActual av3::ConfigurationActual:
		//	parameter=[av3::ConfigurationParameter] '=>' value=TypeReference;
		@Override public ParserRule getRule() { return rule; }
		
		//parameter=[av3::ConfigurationParameter] '=>' value=TypeReference
		public Group getGroup() { return cGroup; }
		
		//parameter=[av3::ConfigurationParameter]
		public Assignment getParameterAssignment_0() { return cParameterAssignment_0; }
		
		//[av3::ConfigurationParameter]
		public CrossReference getParameterConfigurationParameterCrossReference_0_0() { return cParameterConfigurationParameterCrossReference_0_0; }
		
		//ID
		public RuleCall getParameterConfigurationParameterIDTerminalRuleCall_0_0_1() { return cParameterConfigurationParameterIDTerminalRuleCall_0_0_1; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_1() { return cEqualsSignGreaterThanSignKeyword_1; }
		
		//value=TypeReference
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//TypeReference
		public RuleCall getValueTypeReferenceParserRuleCall_2_0() { return cValueTypeReferenceParserRuleCall_2_0; }
	}
	public class WorkingsetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.Workingset");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWorkingsetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameQualifiedNameParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cIsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cRootComponentsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cRootComponentsComponentParserRuleCall_3_0 = (RuleCall)cRootComponentsAssignment_3.eContents().get(0);
		private final Keyword cEndKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final RuleCall cSEMICOLONParserRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		
		//Workingset av3::Workingset:
		//	'workingset' name=QualifiedName 'is' rootComponents+=Component* 'end' SEMICOLON?;
		@Override public ParserRule getRule() { return rule; }
		
		//'workingset' name=QualifiedName 'is' rootComponents+=Component* 'end' SEMICOLON?
		public Group getGroup() { return cGroup; }
		
		//'workingset'
		public Keyword getWorkingsetKeyword_0() { return cWorkingsetKeyword_0; }
		
		//name=QualifiedName
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_1_0() { return cNameQualifiedNameParserRuleCall_1_0; }
		
		//'is'
		public Keyword getIsKeyword_2() { return cIsKeyword_2; }
		
		//rootComponents+=Component*
		public Assignment getRootComponentsAssignment_3() { return cRootComponentsAssignment_3; }
		
		//Component
		public RuleCall getRootComponentsComponentParserRuleCall_3_0() { return cRootComponentsComponentParserRuleCall_3_0; }
		
		//'end'
		public Keyword getEndKeyword_4() { return cEndKeyword_4; }
		
		//SEMICOLON?
		public RuleCall getSEMICOLONParserRuleCall_5() { return cSEMICOLONParserRuleCall_5; }
	}
	public class QualifiedNameWithWildcardElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.QualifiedNameWithWildcard");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cQualifiedNameParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cFullStopAsteriskKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//QualifiedNameWithWildcard:
		//	QualifiedName '.*'?;
		@Override public ParserRule getRule() { return rule; }
		
		//QualifiedName '.*'?
		public Group getGroup() { return cGroup; }
		
		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall_0() { return cQualifiedNameParserRuleCall_0; }
		
		//'.*'?
		public Keyword getFullStopAsteriskKeyword_1() { return cFullStopAsteriskKeyword_1; }
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
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ID ('.' ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ('.' ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('.' ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
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
		private final Keyword cComponentKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
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
		//	'component' | 'bus' | 'data'
		//	| 'device' | 'memory' | 'process' | 'processor' | 'system'
		//	| 'thread' | VirtualBusKeywords | VirtualProcessorKeywords | VirtualMemoryKeywords | VirtualDeviceKeywords
		//	| 'subprogram' | SubprogramGroupKeywords | ThreadGroupKeywords;
		@Override public ParserRule getRule() { return rule; }
		
		//'component' | 'bus' | 'data' | 'device' | 'memory' | 'process' | 'processor' | 'system' | 'thread' | VirtualBusKeywords
		//| VirtualProcessorKeywords | VirtualMemoryKeywords | VirtualDeviceKeywords | 'subprogram' | SubprogramGroupKeywords |
		//ThreadGroupKeywords
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'component'
		public Keyword getComponentKeyword_0() { return cComponentKeyword_0; }
		
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
		private final Keyword cBindingKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		private final Keyword cInterfaceKeyword_5 = (Keyword)cAlternatives.eContents().get(5);
		
		//FeatureCategory av3::FeatureCategory:
		//	'feature' | 'port' | 'access'
		//	| BusAccessKeywords | 'binding' | 'interface';
		@Override public ParserRule getRule() { return rule; }
		
		//'feature' | 'port' | 'access' | BusAccessKeywords | 'binding' | 'interface'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'feature'
		public Keyword getFeatureKeyword_0() { return cFeatureKeyword_0; }
		
		//'port'
		public Keyword getPortKeyword_1() { return cPortKeyword_1; }
		
		//'access'
		public Keyword getAccessKeyword_2() { return cAccessKeyword_2; }
		
		//BusAccessKeywords
		public RuleCall getBusAccessKeywordsParserRuleCall_3() { return cBusAccessKeywordsParserRuleCall_3; }
		
		//'binding'
		public Keyword getBindingKeyword_4() { return cBindingKeyword_4; }
		
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
	public class ConnectionTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.ConnectionType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cFeatureKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cBusKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cBindingKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cInterfaceKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cPortKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		private final Keyword cDataKeyword_5 = (Keyword)cAlternatives.eContents().get(5);
		
		//ConnectionType av3::AssociationType:
		//	'feature' | 'bus' | 'binding' | 'interface' | 'port' | 'data';
		@Override public ParserRule getRule() { return rule; }
		
		//'feature' | 'bus' | 'binding' | 'interface' | 'port' | 'data'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'feature'
		public Keyword getFeatureKeyword_0() { return cFeatureKeyword_0; }
		
		//'bus'
		public Keyword getBusKeyword_1() { return cBusKeyword_1; }
		
		//'binding'
		public Keyword getBindingKeyword_2() { return cBindingKeyword_2; }
		
		//'interface'
		public Keyword getInterfaceKeyword_3() { return cInterfaceKeyword_3; }
		
		//'port'
		public Keyword getPortKeyword_4() { return cPortKeyword_4; }
		
		//'data'
		public Keyword getDataKeyword_5() { return cDataKeyword_5; }
	}
	public class MappingTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.xtext.aadlv3.AadlV3.MappingType");
		private final Keyword cMapKeyword = (Keyword)rule.eContents().get(1);
		
		//MappingType av3::AssociationType:
		//	'map';
		@Override public ParserRule getRule() { return rule; }
		
		//'map'
		public Keyword getMapKeyword() { return cMapKeyword; }
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
	private final PropertyElements pProperty;
	private final PropertySetElements pPropertySet;
	private final PrimitiveTypeElements pPrimitiveType;
	private final ComponentInterfaceElements pComponentInterface;
	private final InterfaceBodyElements pInterfaceBody;
	private final ComponentImplementationElements pComponentImplementation;
	private final ImplementationBodyElements pImplementationBody;
	private final ComponentConfigurationElements pComponentConfiguration;
	private final FeatureElements pFeature;
	private final ComponentElements pComponent;
	private final ConnectionElements pConnection;
	private final FeatureMappingElements pFeatureMapping;
	private final FlowPathElements pFlowPath;
	private final FlowSourceElements pFlowSource;
	private final FlowSinkElements pFlowSink;
	private final PathElements pPath;
	private final PathElementElements pPathElement;
	private final ImportElements pImport;
	private final ConfigurationAssignmentElements pConfigurationAssignment;
	private final FlowAssignmentElements pFlowAssignment;
	private final PropertyAssociationElements pPropertyAssociation;
	private final PropertyValueElements pPropertyValue;
	private final ModelElementReferenceElements pModelElementReference;
	private final PropertyReferenceElements pPropertyReference;
	private final ConfigurationElementBlockElements pConfigurationElementBlock;
	private final CurlyConfigurationElementBlockElements pCurlyConfigurationElementBlock;
	private final ParametersElements pParameters;
	private final ConfigurationParameterElements pConfigurationParameter;
	private final ReversableInterfaceReferenceElements pReversableInterfaceReference;
	private final TypeReferenceElements pTypeReference;
	private final ImplementationReferenceElements pImplementationReference;
	private final PropertiesBlockElements pPropertiesBlock;
	private final NestedComponentImplementationBlockElements pNestedComponentImplementationBlock;
	private final ClassifierExtensionsElements pClassifierExtensions;
	private final ImplementationExtensionsElements pImplementationExtensions;
	private final InterfaceExtensionsElements pInterfaceExtensions;
	private final ConfigurationActualsElements pConfigurationActuals;
	private final ConfigurationActualElements pConfigurationActual;
	private final WorkingsetElements pWorkingset;
	private final QualifiedNameWithWildcardElements pQualifiedNameWithWildcard;
	private final DottedNameElements pDottedName;
	private final QualifiedNameElements pQualifiedName;
	private final SEMICOLONElements pSEMICOLON;
	private final ComponentCategoryElements pComponentCategory;
	private final FeatureCategoryElements pFeatureCategory;
	private final FeatureDirectionElements pFeatureDirection;
	private final ConnectionTypeElements pConnectionType;
	private final MappingTypeElements pMappingType;
	private final FlowPathTypeElements pFlowPathType;
	private final FlowSourceTypeElements pFlowSourceType;
	private final FlowSinkTypeElements pFlowSinkType;
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
		this.pProperty = new PropertyElements();
		this.pPropertySet = new PropertySetElements();
		this.pPrimitiveType = new PrimitiveTypeElements();
		this.pComponentInterface = new ComponentInterfaceElements();
		this.pInterfaceBody = new InterfaceBodyElements();
		this.pComponentImplementation = new ComponentImplementationElements();
		this.pImplementationBody = new ImplementationBodyElements();
		this.pComponentConfiguration = new ComponentConfigurationElements();
		this.pFeature = new FeatureElements();
		this.pComponent = new ComponentElements();
		this.pConnection = new ConnectionElements();
		this.pFeatureMapping = new FeatureMappingElements();
		this.pFlowPath = new FlowPathElements();
		this.pFlowSource = new FlowSourceElements();
		this.pFlowSink = new FlowSinkElements();
		this.pPath = new PathElements();
		this.pPathElement = new PathElementElements();
		this.pImport = new ImportElements();
		this.pConfigurationAssignment = new ConfigurationAssignmentElements();
		this.pFlowAssignment = new FlowAssignmentElements();
		this.pPropertyAssociation = new PropertyAssociationElements();
		this.pPropertyValue = new PropertyValueElements();
		this.pModelElementReference = new ModelElementReferenceElements();
		this.pPropertyReference = new PropertyReferenceElements();
		this.pConfigurationElementBlock = new ConfigurationElementBlockElements();
		this.pCurlyConfigurationElementBlock = new CurlyConfigurationElementBlockElements();
		this.pParameters = new ParametersElements();
		this.pConfigurationParameter = new ConfigurationParameterElements();
		this.pReversableInterfaceReference = new ReversableInterfaceReferenceElements();
		this.pTypeReference = new TypeReferenceElements();
		this.pImplementationReference = new ImplementationReferenceElements();
		this.pPropertiesBlock = new PropertiesBlockElements();
		this.pNestedComponentImplementationBlock = new NestedComponentImplementationBlockElements();
		this.pClassifierExtensions = new ClassifierExtensionsElements();
		this.pImplementationExtensions = new ImplementationExtensionsElements();
		this.pInterfaceExtensions = new InterfaceExtensionsElements();
		this.pConfigurationActuals = new ConfigurationActualsElements();
		this.pConfigurationActual = new ConfigurationActualElements();
		this.pWorkingset = new WorkingsetElements();
		this.pQualifiedNameWithWildcard = new QualifiedNameWithWildcardElements();
		this.pDottedName = new DottedNameElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pSEMICOLON = new SEMICOLONElements();
		this.pComponentCategory = new ComponentCategoryElements();
		this.pFeatureCategory = new FeatureCategoryElements();
		this.pFeatureDirection = new FeatureDirectionElements();
		this.pConnectionType = new ConnectionTypeElements();
		this.pMappingType = new MappingTypeElements();
		this.pFlowPathType = new FlowPathTypeElements();
		this.pFlowSourceType = new FlowSourceTypeElements();
		this.pFlowSinkType = new FlowSinkTypeElements();
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
	//	elements+=(PackageDeclaration | PrimitiveType | ComponentInterface | ComponentImplementation | ComponentConfiguration
	//	| Property | PropertySet | Workingset)*
	//	'end' SEMICOLON;
	public PackageDeclarationElements getPackageDeclarationAccess() {
		return pPackageDeclaration;
	}
	
	public ParserRule getPackageDeclarationRule() {
		return getPackageDeclarationAccess().getRule();
	}
	
	//Property av3::Property:
	//	'property' name=ID type=[av3::Type|QualifiedName] SEMICOLON;
	public PropertyElements getPropertyAccess() {
		return pProperty;
	}
	
	public ParserRule getPropertyRule() {
		return getPropertyAccess().getRule();
	}
	
	//PropertySet av3::PropertySet:
	//	'properties' name=ID
	//	properties+=[av3::Property|QualifiedName] (',' properties+=[av3::Property|QualifiedName])*
	//	'end' SEMICOLON;
	public PropertySetElements getPropertySetAccess() {
		return pPropertySet;
	}
	
	public ParserRule getPropertySetRule() {
		return getPropertySetAccess().getRule();
	}
	
	//PrimitiveType av3::PrimitiveType:
	//	'type' name=ID PropertiesBlock? SEMICOLON;
	public PrimitiveTypeElements getPrimitiveTypeAccess() {
		return pPrimitiveType;
	}
	
	public ParserRule getPrimitiveTypeRule() {
		return getPrimitiveTypeAccess().getRule();
	}
	
	//ComponentInterface av3::ComponentInterface:
	//	private?='private' category=ComponentCategory? 'interface' name=ID ('extends' InterfaceExtensions?)?
	//	InterfaceBody? ('use' 'properties' useProperties+=[av3::PropertySet|QualifiedName] (','
	//	useProperties+=[av3::PropertySet|QualifiedName])* SEMICOLON)?
	//	'end' SEMICOLON;
	public ComponentInterfaceElements getComponentInterfaceAccess() {
		return pComponentInterface;
	}
	
	public ParserRule getComponentInterfaceRule() {
		return getComponentInterfaceAccess().getRule();
	}
	
	//fragment InterfaceBody *:
	//	'is' (features+=Feature | flows+=FlowPath | flows+=FlowSource | flows+=FlowSink |
	//	propertyAssociations+=PropertyAssociation)*;
	public InterfaceBodyElements getInterfaceBodyAccess() {
		return pInterfaceBody;
	}
	
	public ParserRule getInterfaceBodyRule() {
		return getInterfaceBodyAccess().getRule();
	}
	
	//ComponentImplementation av3::ComponentImplementation:
	//	private?='private' category=ComponentCategory name=QualifiedName ('extends' ImplementationExtensions?)?
	//	ImplementationBody?
	//	'end' SEMICOLON;
	public ComponentImplementationElements getComponentImplementationAccess() {
		return pComponentImplementation;
	}
	
	public ParserRule getComponentImplementationRule() {
		return getComponentImplementationAccess().getRule();
	}
	
	//fragment ImplementationBody *:
	//	'is' (connections+=Connection | connections+=FeatureMapping | components+=Component | paths+=Path |
	//	flowAssignments+=FlowAssignment | assignments+=ConfigurationAssignment | propertyAssociations+=PropertyAssociation)*;
	public ImplementationBodyElements getImplementationBodyAccess() {
		return pImplementationBody;
	}
	
	public ParserRule getImplementationBodyRule() {
		return getImplementationBodyAccess().getRule();
	}
	
	//ComponentConfiguration av3::ComponentConfiguration:
	//	private?='private' 'configuration' name=QualifiedName
	//	Parameters?
	//	'extends' ClassifierExtensions ConfigurationElementBlock?
	//	'end' SEMICOLON;
	public ComponentConfigurationElements getComponentConfigurationAccess() {
		return pComponentConfiguration;
	}
	
	public ParserRule getComponentConfigurationRule() {
		return getComponentConfigurationAccess().getRule();
	}
	
	//// (Instance) model elements
	//Feature av3::Feature:
	//	name=ID ':' direction=FeatureDirection? sampled?='sampled'? category=FeatureCategory
	//	reverse?='reverse'? type=[av3::Type|QualifiedName]? PropertiesBlock?
	//	SEMICOLON;
	public FeatureElements getFeatureAccess() {
		return pFeature;
	}
	
	public ParserRule getFeatureRule() {
		return getFeatureAccess().getRule();
	}
	
	//Component av3::Component:
	//	name=ID ':' category=ComponentCategory
	//	typeReference=TypeReference? NestedComponentImplementationBlock?
	//	SEMICOLON;
	public ComponentElements getComponentAccess() {
		return pComponent;
	}
	
	public ParserRule getComponentRule() {
		return getComponentAccess().getRule();
	}
	
	//Connection av3::Association:
	//	name=ID ':' associationType=ConnectionType source=ModelElementReference
	//	'->' destination=ModelElementReference PropertiesBlock? SEMICOLON;
	public ConnectionElements getConnectionAccess() {
		return pConnection;
	}
	
	public ParserRule getConnectionRule() {
		return getConnectionAccess().getRule();
	}
	
	//FeatureMapping av3::Association:
	//	name=ID ':' associationType=MappingType source=ModelElementReference
	//	'->' destination=ModelElementReference PropertiesBlock? SEMICOLON;
	public FeatureMappingElements getFeatureMappingAccess() {
		return pFeatureMapping;
	}
	
	public ParserRule getFeatureMappingRule() {
		return getFeatureMappingAccess().getRule();
	}
	
	//FlowPath av3::Association:
	//	name=ID ':' associationType=FlowPathType source=ModelElementReference
	//	'->' destination=ModelElementReference PropertiesBlock? SEMICOLON;
	public FlowPathElements getFlowPathAccess() {
		return pFlowPath;
	}
	
	public ParserRule getFlowPathRule() {
		return getFlowPathAccess().getRule();
	}
	
	//FlowSource av3::Association:
	//	name=ID ':' associationType=FlowSourceType destination=ModelElementReference PropertiesBlock? SEMICOLON;
	public FlowSourceElements getFlowSourceAccess() {
		return pFlowSource;
	}
	
	public ParserRule getFlowSourceRule() {
		return getFlowSourceAccess().getRule();
	}
	
	//FlowSink av3::Association:
	//	name=ID ':' associationType=FlowSinkType source=ModelElementReference
	//	PropertiesBlock? SEMICOLON;
	public FlowSinkElements getFlowSinkAccess() {
		return pFlowSink;
	}
	
	public ParserRule getFlowSinkRule() {
		return getFlowSinkAccess().getRule();
	}
	
	//Path av3::PathSequence:
	//	name=ID ':' EndToEndFlowKeywords elements+=PathElement ('->' elements+=PathElement)+
	//	PropertiesBlock? SEMICOLON;
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
	//	'import' importedNamespace=QualifiedNameWithWildcard SEMICOLON;
	public ImportElements getImportAccess() {
		return pImport;
	}
	
	public ParserRule getImportRule() {
		return getImportAccess().getRule();
	}
	
	//ConfigurationAssignment av3::ConfigurationAssignment:
	//	target=ModelElementReference '=>' (value=TypeReference CurlyConfigurationElementBlock? |
	//	CurlyConfigurationElementBlock) SEMICOLON;
	public ConfigurationAssignmentElements getConfigurationAssignmentAccess() {
		return pConfigurationAssignment;
	}
	
	public ParserRule getConfigurationAssignmentRule() {
		return getConfigurationAssignmentAccess().getRule();
	}
	
	//FlowAssignment av3::PathSequence:
	//	target=ModelElementReference '=>' 'flow'
	//	elements+=PathElement ('->' elements+=PathElement)*
	//	SEMICOLON;
	public FlowAssignmentElements getFlowAssignmentAccess() {
		return pFlowAssignment;
	}
	
	public ParserRule getFlowAssignmentRule() {
		return getFlowAssignmentAccess().getRule();
	}
	
	//PropertyAssociation av3::PropertyAssociation:
	//	target=PropertyReference '=>'
	//	value=PropertyValue SEMICOLON;
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
	
	//PropertyReference av3::ModelElementReference:
	//	(element=[av3::ModelElement] => ({av3::ModelElementReference.context=current} '.' element=[av3::ModelElement])*)? '#'
	//	property=[av3::Property|QualifiedName];
	public PropertyReferenceElements getPropertyReferenceAccess() {
		return pPropertyReference;
	}
	
	public ParserRule getPropertyReferenceRule() {
		return getPropertyReferenceAccess().getRule();
	}
	
	//fragment ConfigurationElementBlock *:
	//	'is' (propertyAssociations+=PropertyAssociation | assignments+=ConfigurationAssignment)+;
	public ConfigurationElementBlockElements getConfigurationElementBlockAccess() {
		return pConfigurationElementBlock;
	}
	
	public ParserRule getConfigurationElementBlockRule() {
		return getConfigurationElementBlockAccess().getRule();
	}
	
	//fragment CurlyConfigurationElementBlock *:
	//	'{' (propertyAssociations+=PropertyAssociation | assignments+=ConfigurationAssignment)* '}';
	public CurlyConfigurationElementBlockElements getCurlyConfigurationElementBlockAccess() {
		return pCurlyConfigurationElementBlock;
	}
	
	public ParserRule getCurlyConfigurationElementBlockRule() {
		return getCurlyConfigurationElementBlockAccess().getRule();
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
	//	reverse?='reverse'? type=[av3::ComponentInterface|QualifiedName];
	public ReversableInterfaceReferenceElements getReversableInterfaceReferenceAccess() {
		return pReversableInterfaceReference;
	}
	
	public ParserRule getReversableInterfaceReferenceRule() {
		return getReversableInterfaceReferenceAccess().getRule();
	}
	
	//TypeReference av3::TypeReference:
	//	type=[av3::Type|QualifiedName] ConfigurationActuals?;
	public TypeReferenceElements getTypeReferenceAccess() {
		return pTypeReference;
	}
	
	public ParserRule getTypeReferenceRule() {
		return getTypeReferenceAccess().getRule();
	}
	
	//ImplementationReference av3::TypeReference:
	//	type=[av3::ComponentImplementation|QualifiedName];
	public ImplementationReferenceElements getImplementationReferenceAccess() {
		return pImplementationReference;
	}
	
	public ParserRule getImplementationReferenceRule() {
		return getImplementationReferenceAccess().getRule();
	}
	
	//fragment PropertiesBlock *:
	//	'{' propertyAssociations+=PropertyAssociation* '}';
	public PropertiesBlockElements getPropertiesBlockAccess() {
		return pPropertiesBlock;
	}
	
	public ParserRule getPropertiesBlockRule() {
		return getPropertiesBlockAccess().getRule();
	}
	
	//// to be used for inline nested component implementations 
	//fragment NestedComponentImplementationBlock *:
	//	'{' (features+=Feature | connections+=Connection | connections+=FeatureMapping | components+=Component |
	//	propertyAssociations+=PropertyAssociation)* '}';
	public NestedComponentImplementationBlockElements getNestedComponentImplementationBlockAccess() {
		return pNestedComponentImplementationBlock;
	}
	
	public ParserRule getNestedComponentImplementationBlockRule() {
		return getNestedComponentImplementationBlockAccess().getRule();
	}
	
	//fragment ClassifierExtensions *:
	//	superClassifiers+=TypeReference ("," superClassifiers+=TypeReference)*;
	public ClassifierExtensionsElements getClassifierExtensionsAccess() {
		return pClassifierExtensions;
	}
	
	public ParserRule getClassifierExtensionsRule() {
		return getClassifierExtensionsAccess().getRule();
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
	//	parameter=[av3::ConfigurationParameter] '=>' value=TypeReference;
	public ConfigurationActualElements getConfigurationActualAccess() {
		return pConfigurationActual;
	}
	
	public ParserRule getConfigurationActualRule() {
		return getConfigurationActualAccess().getRule();
	}
	
	//Workingset av3::Workingset:
	//	'workingset' name=QualifiedName 'is' rootComponents+=Component* 'end' SEMICOLON?;
	public WorkingsetElements getWorkingsetAccess() {
		return pWorkingset;
	}
	
	public ParserRule getWorkingsetRule() {
		return getWorkingsetAccess().getRule();
	}
	
	//QualifiedNameWithWildcard:
	//	QualifiedName '.*'?;
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
	//	ID ('.' ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
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
	//	'component' | 'bus' | 'data'
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
	//	| BusAccessKeywords | 'binding' | 'interface';
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
	
	//ConnectionType av3::AssociationType:
	//	'feature' | 'bus' | 'binding' | 'interface' | 'port' | 'data';
	public ConnectionTypeElements getConnectionTypeAccess() {
		return pConnectionType;
	}
	
	public ParserRule getConnectionTypeRule() {
		return getConnectionTypeAccess().getRule();
	}
	
	//MappingType av3::AssociationType:
	//	'map';
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
