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
grammar InternalAadlV3;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.osate.xtext.aadlv3.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.osate.xtext.aadlv3.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.osate.xtext.aadlv3.services.AadlV3GrammarAccess;

}

@parser::members {

 	private AadlV3GrammarAccess grammarAccess;

    public InternalAadlV3Parser(TokenStream input, AadlV3GrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "PackageDeclaration";
   	}

   	@Override
   	protected AadlV3GrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRulePackageDeclaration
entryRulePackageDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPackageDeclarationRule()); }
	iv_rulePackageDeclaration=rulePackageDeclaration
	{ $current=$iv_rulePackageDeclaration.current; }
	EOF;

// Rule PackageDeclaration
rulePackageDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='package'
		{
			newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0());
				}
				lv_name_1_0=ruleQualifiedName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.osate.xtext.aadlv3.AadlV3.QualifiedName");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getImportsImportParserRuleCall_2_0());
				}
				lv_imports_2_0=ruleImport
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
					}
					add(
						$current,
						"imports",
						lv_imports_2_0,
						"org.osate.xtext.aadlv3.AadlV3.Import");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsPackageDeclarationParserRuleCall_3_0_0());
					}
					lv_elements_3_1=rulePackageDeclaration
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
						}
						add(
							$current,
							"elements",
							lv_elements_3_1,
							"org.osate.xtext.aadlv3.AadlV3.PackageDeclaration");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsPrimitiveTypeParserRuleCall_3_0_1());
					}
					lv_elements_3_2=rulePrimitiveType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
						}
						add(
							$current,
							"elements",
							lv_elements_3_2,
							"org.osate.xtext.aadlv3.AadlV3.PrimitiveType");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsComponentInterfaceParserRuleCall_3_0_2());
					}
					lv_elements_3_3=ruleComponentInterface
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
						}
						add(
							$current,
							"elements",
							lv_elements_3_3,
							"org.osate.xtext.aadlv3.AadlV3.ComponentInterface");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsComponentImplementationParserRuleCall_3_0_3());
					}
					lv_elements_3_4=ruleComponentImplementation
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
						}
						add(
							$current,
							"elements",
							lv_elements_3_4,
							"org.osate.xtext.aadlv3.AadlV3.ComponentImplementation");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsComponentConfigurationParserRuleCall_3_0_4());
					}
					lv_elements_3_5=ruleComponentConfiguration
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
						}
						add(
							$current,
							"elements",
							lv_elements_3_5,
							"org.osate.xtext.aadlv3.AadlV3.ComponentConfiguration");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsPropertyParserRuleCall_3_0_5());
					}
					lv_elements_3_6=ruleProperty
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
						}
						add(
							$current,
							"elements",
							lv_elements_3_6,
							"org.osate.xtext.aadlv3.AadlV3.Property");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsPropertySetParserRuleCall_3_0_6());
					}
					lv_elements_3_7=rulePropertySet
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
						}
						add(
							$current,
							"elements",
							lv_elements_3_7,
							"org.osate.xtext.aadlv3.AadlV3.PropertySet");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsWorkingsetParserRuleCall_3_0_7());
					}
					lv_elements_3_8=ruleWorkingset
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
						}
						add(
							$current,
							"elements",
							lv_elements_3_8,
							"org.osate.xtext.aadlv3.AadlV3.Workingset");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_4='end'
		{
			newLeafNode(otherlv_4, grammarAccess.getPackageDeclarationAccess().getEndKeyword_4());
		}
		{
			newCompositeNode(grammarAccess.getPackageDeclarationAccess().getSEMICOLONParserRuleCall_5());
		}
		ruleSEMICOLON
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleProperty
entryRuleProperty returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPropertyRule()); }
	iv_ruleProperty=ruleProperty
	{ $current=$iv_ruleProperty.current; }
	EOF;

// Rule Property
ruleProperty returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='property'
		{
			newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getPropertyKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPropertyRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPropertyRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getPropertyAccess().getTypeTypeCrossReference_2_0());
				}
				ruleQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		{
			newCompositeNode(grammarAccess.getPropertyAccess().getSEMICOLONParserRuleCall_3());
		}
		ruleSEMICOLON
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRulePropertySet
entryRulePropertySet returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPropertySetRule()); }
	iv_rulePropertySet=rulePropertySet
	{ $current=$iv_rulePropertySet.current; }
	EOF;

// Rule PropertySet
rulePropertySet returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='properties'
		{
			newLeafNode(otherlv_0, grammarAccess.getPropertySetAccess().getPropertiesKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPropertySetAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPropertySetRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPropertySetRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getPropertySetAccess().getPropertiesPropertyCrossReference_2_0());
				}
				ruleQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3=','
			{
				newLeafNode(otherlv_3, grammarAccess.getPropertySetAccess().getCommaKeyword_3_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPropertySetRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getPropertySetAccess().getPropertiesPropertyCrossReference_3_1_0());
					}
					ruleQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_5='end'
		{
			newLeafNode(otherlv_5, grammarAccess.getPropertySetAccess().getEndKeyword_4());
		}
		{
			newCompositeNode(grammarAccess.getPropertySetAccess().getSEMICOLONParserRuleCall_5());
		}
		ruleSEMICOLON
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRulePrimitiveType
entryRulePrimitiveType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimitiveTypeRule()); }
	iv_rulePrimitiveType=rulePrimitiveType
	{ $current=$iv_rulePrimitiveType.current; }
	EOF;

// Rule PrimitiveType
rulePrimitiveType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='type'
		{
			newLeafNode(otherlv_0, grammarAccess.getPrimitiveTypeAccess().getTypeKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPrimitiveTypeAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPrimitiveTypeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getPrimitiveTypeRule());
				}
				newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getPropertiesBlockParserRuleCall_2());
			}
			this_PropertiesBlock_2=rulePropertiesBlock[$current]
			{
				$current = $this_PropertiesBlock_2.current;
				afterParserOrEnumRuleCall();
			}
		)?
		{
			newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getSEMICOLONParserRuleCall_3());
		}
		ruleSEMICOLON
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleComponentInterface
entryRuleComponentInterface returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentInterfaceRule()); }
	iv_ruleComponentInterface=ruleComponentInterface
	{ $current=$iv_ruleComponentInterface.current; }
	EOF;

// Rule ComponentInterface
ruleComponentInterface returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_private_0_0='private'
				{
					newLeafNode(lv_private_0_0, grammarAccess.getComponentInterfaceAccess().getPrivatePrivateKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponentInterfaceRule());
					}
					setWithLastConsumed($current, "private", true, "private");
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentInterfaceAccess().getCategoryComponentCategoryParserRuleCall_1_0());
				}
				lv_category_1_0=ruleComponentCategory
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
					}
					set(
						$current,
						"category",
						lv_category_1_0,
						"org.osate.xtext.aadlv3.AadlV3.ComponentCategory");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_2='interface'
		{
			newLeafNode(otherlv_2, grammarAccess.getComponentInterfaceAccess().getInterfaceKeyword_2());
		}
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getComponentInterfaceAccess().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponentInterfaceRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_4='extends'
			{
				newLeafNode(otherlv_4, grammarAccess.getComponentInterfaceAccess().getExtendsKeyword_4_0());
			}
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponentInterfaceRule());
					}
					newCompositeNode(grammarAccess.getComponentInterfaceAccess().getInterfaceExtensionsParserRuleCall_4_1());
				}
				this_InterfaceExtensions_5=ruleInterfaceExtensions[$current]
				{
					$current = $this_InterfaceExtensions_5.current;
					afterParserOrEnumRuleCall();
				}
			)?
		)?
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getComponentInterfaceRule());
				}
				newCompositeNode(grammarAccess.getComponentInterfaceAccess().getInterfaceBodyParserRuleCall_5());
			}
			this_InterfaceBody_6=ruleInterfaceBody[$current]
			{
				$current = $this_InterfaceBody_6.current;
				afterParserOrEnumRuleCall();
			}
		)?
		(
			otherlv_7='use'
			{
				newLeafNode(otherlv_7, grammarAccess.getComponentInterfaceAccess().getUseKeyword_6_0());
			}
			otherlv_8='properties'
			{
				newLeafNode(otherlv_8, grammarAccess.getComponentInterfaceAccess().getPropertiesKeyword_6_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getComponentInterfaceRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getUsePropertiesPropertySetCrossReference_6_2_0());
					}
					ruleQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_10=','
				{
					newLeafNode(otherlv_10, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_6_3_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getComponentInterfaceRule());
							}
						}
						{
							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getUsePropertiesPropertySetCrossReference_6_3_1_0());
						}
						ruleQualifiedName
						{
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			{
				newCompositeNode(grammarAccess.getComponentInterfaceAccess().getSEMICOLONParserRuleCall_6_4());
			}
			ruleSEMICOLON
			{
				afterParserOrEnumRuleCall();
			}
		)?
		otherlv_13='end'
		{
			newLeafNode(otherlv_13, grammarAccess.getComponentInterfaceAccess().getEndKeyword_7());
		}
		{
			newCompositeNode(grammarAccess.getComponentInterfaceAccess().getSEMICOLONParserRuleCall_8());
		}
		ruleSEMICOLON
		{
			afterParserOrEnumRuleCall();
		}
	)
;


// Rule InterfaceBody
ruleInterfaceBody[EObject in_current]  returns [EObject current=in_current]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='is'
		{
			newLeafNode(otherlv_0, grammarAccess.getInterfaceBodyAccess().getIsKeyword_0());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getInterfaceBodyAccess().getFeaturesFeatureParserRuleCall_1_0_0());
					}
					lv_features_1_0=ruleFeature
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getInterfaceBodyRule());
						}
						add(
							$current,
							"features",
							lv_features_1_0,
							"org.osate.xtext.aadlv3.AadlV3.Feature");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getInterfaceBodyAccess().getFlowsFlowPathParserRuleCall_1_1_0());
					}
					lv_flows_2_0=ruleFlowPath
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getInterfaceBodyRule());
						}
						add(
							$current,
							"flows",
							lv_flows_2_0,
							"org.osate.xtext.aadlv3.AadlV3.FlowPath");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getInterfaceBodyAccess().getFlowsFlowSourceParserRuleCall_1_2_0());
					}
					lv_flows_3_0=ruleFlowSource
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getInterfaceBodyRule());
						}
						add(
							$current,
							"flows",
							lv_flows_3_0,
							"org.osate.xtext.aadlv3.AadlV3.FlowSource");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getInterfaceBodyAccess().getFlowsFlowSinkParserRuleCall_1_3_0());
					}
					lv_flows_4_0=ruleFlowSink
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getInterfaceBodyRule());
						}
						add(
							$current,
							"flows",
							lv_flows_4_0,
							"org.osate.xtext.aadlv3.AadlV3.FlowSink");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getInterfaceBodyAccess().getPropertyAssociationsPropertyAssociationParserRuleCall_1_4_0());
					}
					lv_propertyAssociations_5_0=rulePropertyAssociation
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getInterfaceBodyRule());
						}
						add(
							$current,
							"propertyAssociations",
							lv_propertyAssociations_5_0,
							"org.osate.xtext.aadlv3.AadlV3.PropertyAssociation");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleComponentImplementation
entryRuleComponentImplementation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentImplementationRule()); }
	iv_ruleComponentImplementation=ruleComponentImplementation
	{ $current=$iv_ruleComponentImplementation.current; }
	EOF;

// Rule ComponentImplementation
ruleComponentImplementation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_private_0_0='private'
				{
					newLeafNode(lv_private_0_0, grammarAccess.getComponentImplementationAccess().getPrivatePrivateKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponentImplementationRule());
					}
					setWithLastConsumed($current, "private", true, "private");
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentImplementationAccess().getCategoryComponentCategoryParserRuleCall_1_0());
				}
				lv_category_1_0=ruleComponentCategory
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentImplementationRule());
					}
					set(
						$current,
						"category",
						lv_category_1_0,
						"org.osate.xtext.aadlv3.AadlV3.ComponentCategory");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentImplementationAccess().getNameQualifiedNameParserRuleCall_2_0());
				}
				lv_name_2_0=ruleQualifiedName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentImplementationRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.osate.xtext.aadlv3.AadlV3.QualifiedName");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3='extends'
			{
				newLeafNode(otherlv_3, grammarAccess.getComponentImplementationAccess().getExtendsKeyword_3_0());
			}
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponentImplementationRule());
					}
					newCompositeNode(grammarAccess.getComponentImplementationAccess().getImplementationExtensionsParserRuleCall_3_1());
				}
				this_ImplementationExtensions_4=ruleImplementationExtensions[$current]
				{
					$current = $this_ImplementationExtensions_4.current;
					afterParserOrEnumRuleCall();
				}
			)?
		)?
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getComponentImplementationRule());
				}
				newCompositeNode(grammarAccess.getComponentImplementationAccess().getImplementationBodyParserRuleCall_4());
			}
			this_ImplementationBody_5=ruleImplementationBody[$current]
			{
				$current = $this_ImplementationBody_5.current;
				afterParserOrEnumRuleCall();
			}
		)?
		otherlv_6='end'
		{
			newLeafNode(otherlv_6, grammarAccess.getComponentImplementationAccess().getEndKeyword_5());
		}
		{
			newCompositeNode(grammarAccess.getComponentImplementationAccess().getSEMICOLONParserRuleCall_6());
		}
		ruleSEMICOLON
		{
			afterParserOrEnumRuleCall();
		}
	)
;


// Rule ImplementationBody
ruleImplementationBody[EObject in_current]  returns [EObject current=in_current]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='is'
		{
			newLeafNode(otherlv_0, grammarAccess.getImplementationBodyAccess().getIsKeyword_0());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getImplementationBodyAccess().getConnectionsConnectionParserRuleCall_1_0_0());
					}
					lv_connections_1_0=ruleConnection
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getImplementationBodyRule());
						}
						add(
							$current,
							"connections",
							lv_connections_1_0,
							"org.osate.xtext.aadlv3.AadlV3.Connection");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getImplementationBodyAccess().getConnectionsFeatureMappingParserRuleCall_1_1_0());
					}
					lv_connections_2_0=ruleFeatureMapping
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getImplementationBodyRule());
						}
						add(
							$current,
							"connections",
							lv_connections_2_0,
							"org.osate.xtext.aadlv3.AadlV3.FeatureMapping");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getImplementationBodyAccess().getComponentsComponentParserRuleCall_1_2_0());
					}
					lv_components_3_0=ruleComponent
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getImplementationBodyRule());
						}
						add(
							$current,
							"components",
							lv_components_3_0,
							"org.osate.xtext.aadlv3.AadlV3.Component");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getImplementationBodyAccess().getPathsPathParserRuleCall_1_3_0());
					}
					lv_paths_4_0=rulePath
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getImplementationBodyRule());
						}
						add(
							$current,
							"paths",
							lv_paths_4_0,
							"org.osate.xtext.aadlv3.AadlV3.Path");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getImplementationBodyAccess().getFlowAssignmentsFlowAssignmentParserRuleCall_1_4_0());
					}
					lv_flowAssignments_5_0=ruleFlowAssignment
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getImplementationBodyRule());
						}
						add(
							$current,
							"flowAssignments",
							lv_flowAssignments_5_0,
							"org.osate.xtext.aadlv3.AadlV3.FlowAssignment");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getImplementationBodyAccess().getAssignmentsConfigurationAssignmentParserRuleCall_1_5_0());
					}
					lv_assignments_6_0=ruleConfigurationAssignment
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getImplementationBodyRule());
						}
						add(
							$current,
							"assignments",
							lv_assignments_6_0,
							"org.osate.xtext.aadlv3.AadlV3.ConfigurationAssignment");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getImplementationBodyAccess().getPropertyAssociationsPropertyAssociationParserRuleCall_1_6_0());
					}
					lv_propertyAssociations_7_0=rulePropertyAssociation
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getImplementationBodyRule());
						}
						add(
							$current,
							"propertyAssociations",
							lv_propertyAssociations_7_0,
							"org.osate.xtext.aadlv3.AadlV3.PropertyAssociation");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleComponentConfiguration
entryRuleComponentConfiguration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentConfigurationRule()); }
	iv_ruleComponentConfiguration=ruleComponentConfiguration
	{ $current=$iv_ruleComponentConfiguration.current; }
	EOF;

// Rule ComponentConfiguration
ruleComponentConfiguration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_private_0_0='private'
				{
					newLeafNode(lv_private_0_0, grammarAccess.getComponentConfigurationAccess().getPrivatePrivateKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponentConfigurationRule());
					}
					setWithLastConsumed($current, "private", true, "private");
				}
			)
		)?
		otherlv_1='configuration'
		{
			newLeafNode(otherlv_1, grammarAccess.getComponentConfigurationAccess().getConfigurationKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentConfigurationAccess().getNameQualifiedNameParserRuleCall_2_0());
				}
				lv_name_2_0=ruleQualifiedName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentConfigurationRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.osate.xtext.aadlv3.AadlV3.QualifiedName");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getComponentConfigurationRule());
				}
				newCompositeNode(grammarAccess.getComponentConfigurationAccess().getParametersParserRuleCall_3());
			}
			this_Parameters_3=ruleParameters[$current]
			{
				$current = $this_Parameters_3.current;
				afterParserOrEnumRuleCall();
			}
		)?
		otherlv_4='extends'
		{
			newLeafNode(otherlv_4, grammarAccess.getComponentConfigurationAccess().getExtendsKeyword_4());
		}
		{
			if ($current==null) {
				$current = createModelElement(grammarAccess.getComponentConfigurationRule());
			}
			newCompositeNode(grammarAccess.getComponentConfigurationAccess().getClassifierExtensionsParserRuleCall_5());
		}
		this_ClassifierExtensions_5=ruleClassifierExtensions[$current]
		{
			$current = $this_ClassifierExtensions_5.current;
			afterParserOrEnumRuleCall();
		}
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getComponentConfigurationRule());
				}
				newCompositeNode(grammarAccess.getComponentConfigurationAccess().getConfigurationElementBlockParserRuleCall_6());
			}
			this_ConfigurationElementBlock_6=ruleConfigurationElementBlock[$current]
			{
				$current = $this_ConfigurationElementBlock_6.current;
				afterParserOrEnumRuleCall();
			}
		)?
		otherlv_7='end'
		{
			newLeafNode(otherlv_7, grammarAccess.getComponentConfigurationAccess().getEndKeyword_7());
		}
		{
			newCompositeNode(grammarAccess.getComponentConfigurationAccess().getSEMICOLONParserRuleCall_8());
		}
		ruleSEMICOLON
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleFeature
entryRuleFeature returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFeatureRule()); }
	iv_ruleFeature=ruleFeature
	{ $current=$iv_ruleFeature.current; }
	EOF;

// Rule Feature
ruleFeature returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFeatureRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFeatureAccess().getDirectionFeatureDirectionParserRuleCall_2_0());
				}
				lv_direction_2_0=ruleFeatureDirection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureRule());
					}
					set(
						$current,
						"direction",
						lv_direction_2_0,
						"org.osate.xtext.aadlv3.AadlV3.FeatureDirection");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				lv_sampled_3_0='sampled'
				{
					newLeafNode(lv_sampled_3_0, grammarAccess.getFeatureAccess().getSampledSampledKeyword_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFeatureRule());
					}
					setWithLastConsumed($current, "sampled", true, "sampled");
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getFeatureAccess().getCategoryFeatureCategoryParserRuleCall_4_0());
				}
				lv_category_4_0=ruleFeatureCategory
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureRule());
					}
					set(
						$current,
						"category",
						lv_category_4_0,
						"org.osate.xtext.aadlv3.AadlV3.FeatureCategory");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_reverse_5_0='reverse'
				{
					newLeafNode(lv_reverse_5_0, grammarAccess.getFeatureAccess().getReverseReverseKeyword_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFeatureRule());
					}
					setWithLastConsumed($current, "reverse", true, "reverse");
				}
			)
		)?
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFeatureRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_6_0());
				}
				ruleQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getFeatureRule());
				}
				newCompositeNode(grammarAccess.getFeatureAccess().getPropertiesBlockParserRuleCall_7());
			}
			this_PropertiesBlock_7=rulePropertiesBlock[$current]
			{
				$current = $this_PropertiesBlock_7.current;
				afterParserOrEnumRuleCall();
			}
		)?
		{
			newCompositeNode(grammarAccess.getFeatureAccess().getSEMICOLONParserRuleCall_8());
		}
		ruleSEMICOLON
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleComponent
entryRuleComponent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentRule()); }
	iv_ruleComponent=ruleComponent
	{ $current=$iv_ruleComponent.current; }
	EOF;

// Rule Component
ruleComponent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponentRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getComponentAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentAccess().getCategoryComponentCategoryParserRuleCall_2_0());
				}
				lv_category_2_0=ruleComponentCategory
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentRule());
					}
					set(
						$current,
						"category",
						lv_category_2_0,
						"org.osate.xtext.aadlv3.AadlV3.ComponentCategory");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentAccess().getTypeReferenceTypeReferenceParserRuleCall_3_0());
				}
				lv_typeReference_3_0=ruleTypeReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentRule());
					}
					set(
						$current,
						"typeReference",
						lv_typeReference_3_0,
						"org.osate.xtext.aadlv3.AadlV3.TypeReference");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getComponentRule());
				}
				newCompositeNode(grammarAccess.getComponentAccess().getNestedComponentImplementationBlockParserRuleCall_4());
			}
			this_NestedComponentImplementationBlock_4=ruleNestedComponentImplementationBlock[$current]
			{
				$current = $this_NestedComponentImplementationBlock_4.current;
				afterParserOrEnumRuleCall();
			}
		)?
		{
			newCompositeNode(grammarAccess.getComponentAccess().getSEMICOLONParserRuleCall_5());
		}
		ruleSEMICOLON
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleConnection
entryRuleConnection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConnectionRule()); }
	iv_ruleConnection=ruleConnection
	{ $current=$iv_ruleConnection.current; }
	EOF;

// Rule Connection
ruleConnection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getConnectionAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConnectionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getConnectionAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConnectionAccess().getAssociationTypeConnectionTypeParserRuleCall_2_0());
				}
				lv_associationType_2_0=ruleConnectionType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConnectionRule());
					}
					set(
						$current,
						"associationType",
						lv_associationType_2_0,
						"org.osate.xtext.aadlv3.AadlV3.ConnectionType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getConnectionAccess().getSourceModelElementReferenceParserRuleCall_3_0());
				}
				lv_source_3_0=ruleModelElementReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConnectionRule());
					}
					set(
						$current,
						"source",
						lv_source_3_0,
						"org.osate.xtext.aadlv3.AadlV3.ModelElementReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='->'
		{
			newLeafNode(otherlv_4, grammarAccess.getConnectionAccess().getHyphenMinusGreaterThanSignKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConnectionAccess().getDestinationModelElementReferenceParserRuleCall_5_0());
				}
				lv_destination_5_0=ruleModelElementReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConnectionRule());
					}
					set(
						$current,
						"destination",
						lv_destination_5_0,
						"org.osate.xtext.aadlv3.AadlV3.ModelElementReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getConnectionRule());
				}
				newCompositeNode(grammarAccess.getConnectionAccess().getPropertiesBlockParserRuleCall_6());
			}
			this_PropertiesBlock_6=rulePropertiesBlock[$current]
			{
				$current = $this_PropertiesBlock_6.current;
				afterParserOrEnumRuleCall();
			}
		)?
		{
			newCompositeNode(grammarAccess.getConnectionAccess().getSEMICOLONParserRuleCall_7());
		}
		ruleSEMICOLON
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleFeatureMapping
entryRuleFeatureMapping returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFeatureMappingRule()); }
	iv_ruleFeatureMapping=ruleFeatureMapping
	{ $current=$iv_ruleFeatureMapping.current; }
	EOF;

// Rule FeatureMapping
ruleFeatureMapping returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getFeatureMappingAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFeatureMappingRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getFeatureMappingAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFeatureMappingAccess().getAssociationTypeMappingTypeParserRuleCall_2_0());
				}
				lv_associationType_2_0=ruleMappingType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureMappingRule());
					}
					set(
						$current,
						"associationType",
						lv_associationType_2_0,
						"org.osate.xtext.aadlv3.AadlV3.MappingType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFeatureMappingAccess().getSourceModelElementReferenceParserRuleCall_3_0());
				}
				lv_source_3_0=ruleModelElementReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureMappingRule());
					}
					set(
						$current,
						"source",
						lv_source_3_0,
						"org.osate.xtext.aadlv3.AadlV3.ModelElementReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='->'
		{
			newLeafNode(otherlv_4, grammarAccess.getFeatureMappingAccess().getHyphenMinusGreaterThanSignKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFeatureMappingAccess().getDestinationModelElementReferenceParserRuleCall_5_0());
				}
				lv_destination_5_0=ruleModelElementReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureMappingRule());
					}
					set(
						$current,
						"destination",
						lv_destination_5_0,
						"org.osate.xtext.aadlv3.AadlV3.ModelElementReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getFeatureMappingRule());
				}
				newCompositeNode(grammarAccess.getFeatureMappingAccess().getPropertiesBlockParserRuleCall_6());
			}
			this_PropertiesBlock_6=rulePropertiesBlock[$current]
			{
				$current = $this_PropertiesBlock_6.current;
				afterParserOrEnumRuleCall();
			}
		)?
		{
			newCompositeNode(grammarAccess.getFeatureMappingAccess().getSEMICOLONParserRuleCall_7());
		}
		ruleSEMICOLON
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleFlowPath
entryRuleFlowPath returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFlowPathRule()); }
	iv_ruleFlowPath=ruleFlowPath
	{ $current=$iv_ruleFlowPath.current; }
	EOF;

// Rule FlowPath
ruleFlowPath returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getFlowPathAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFlowPathRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getFlowPathAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFlowPathAccess().getAssociationTypeFlowPathTypeParserRuleCall_2_0());
				}
				lv_associationType_2_0=ruleFlowPathType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFlowPathRule());
					}
					set(
						$current,
						"associationType",
						lv_associationType_2_0,
						"org.osate.xtext.aadlv3.AadlV3.FlowPathType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFlowPathAccess().getSourceModelElementReferenceParserRuleCall_3_0());
				}
				lv_source_3_0=ruleModelElementReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFlowPathRule());
					}
					set(
						$current,
						"source",
						lv_source_3_0,
						"org.osate.xtext.aadlv3.AadlV3.ModelElementReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='->'
		{
			newLeafNode(otherlv_4, grammarAccess.getFlowPathAccess().getHyphenMinusGreaterThanSignKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFlowPathAccess().getDestinationModelElementReferenceParserRuleCall_5_0());
				}
				lv_destination_5_0=ruleModelElementReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFlowPathRule());
					}
					set(
						$current,
						"destination",
						lv_destination_5_0,
						"org.osate.xtext.aadlv3.AadlV3.ModelElementReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getFlowPathRule());
				}
				newCompositeNode(grammarAccess.getFlowPathAccess().getPropertiesBlockParserRuleCall_6());
			}
			this_PropertiesBlock_6=rulePropertiesBlock[$current]
			{
				$current = $this_PropertiesBlock_6.current;
				afterParserOrEnumRuleCall();
			}
		)?
		{
			newCompositeNode(grammarAccess.getFlowPathAccess().getSEMICOLONParserRuleCall_7());
		}
		ruleSEMICOLON
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleFlowSource
entryRuleFlowSource returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFlowSourceRule()); }
	iv_ruleFlowSource=ruleFlowSource
	{ $current=$iv_ruleFlowSource.current; }
	EOF;

// Rule FlowSource
ruleFlowSource returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getFlowSourceAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFlowSourceRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getFlowSourceAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFlowSourceAccess().getAssociationTypeFlowSourceTypeParserRuleCall_2_0());
				}
				lv_associationType_2_0=ruleFlowSourceType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFlowSourceRule());
					}
					set(
						$current,
						"associationType",
						lv_associationType_2_0,
						"org.osate.xtext.aadlv3.AadlV3.FlowSourceType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFlowSourceAccess().getDestinationModelElementReferenceParserRuleCall_3_0());
				}
				lv_destination_3_0=ruleModelElementReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFlowSourceRule());
					}
					set(
						$current,
						"destination",
						lv_destination_3_0,
						"org.osate.xtext.aadlv3.AadlV3.ModelElementReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getFlowSourceRule());
				}
				newCompositeNode(grammarAccess.getFlowSourceAccess().getPropertiesBlockParserRuleCall_4());
			}
			this_PropertiesBlock_4=rulePropertiesBlock[$current]
			{
				$current = $this_PropertiesBlock_4.current;
				afterParserOrEnumRuleCall();
			}
		)?
		{
			newCompositeNode(grammarAccess.getFlowSourceAccess().getSEMICOLONParserRuleCall_5());
		}
		ruleSEMICOLON
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleFlowSink
entryRuleFlowSink returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFlowSinkRule()); }
	iv_ruleFlowSink=ruleFlowSink
	{ $current=$iv_ruleFlowSink.current; }
	EOF;

// Rule FlowSink
ruleFlowSink returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getFlowSinkAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFlowSinkRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getFlowSinkAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFlowSinkAccess().getAssociationTypeFlowSinkTypeParserRuleCall_2_0());
				}
				lv_associationType_2_0=ruleFlowSinkType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFlowSinkRule());
					}
					set(
						$current,
						"associationType",
						lv_associationType_2_0,
						"org.osate.xtext.aadlv3.AadlV3.FlowSinkType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFlowSinkAccess().getSourceModelElementReferenceParserRuleCall_3_0());
				}
				lv_source_3_0=ruleModelElementReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFlowSinkRule());
					}
					set(
						$current,
						"source",
						lv_source_3_0,
						"org.osate.xtext.aadlv3.AadlV3.ModelElementReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getFlowSinkRule());
				}
				newCompositeNode(grammarAccess.getFlowSinkAccess().getPropertiesBlockParserRuleCall_4());
			}
			this_PropertiesBlock_4=rulePropertiesBlock[$current]
			{
				$current = $this_PropertiesBlock_4.current;
				afterParserOrEnumRuleCall();
			}
		)?
		{
			newCompositeNode(grammarAccess.getFlowSinkAccess().getSEMICOLONParserRuleCall_5());
		}
		ruleSEMICOLON
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRulePath
entryRulePath returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPathRule()); }
	iv_rulePath=rulePath
	{ $current=$iv_rulePath.current; }
	EOF;

// Rule Path
rulePath returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getPathAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPathRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getPathAccess().getColonKeyword_1());
		}
		{
			newCompositeNode(grammarAccess.getPathAccess().getEndToEndFlowKeywordsParserRuleCall_2());
		}
		ruleEndToEndFlowKeywords
		{
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPathAccess().getElementsPathElementParserRuleCall_3_0());
				}
				lv_elements_3_0=rulePathElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPathRule());
					}
					add(
						$current,
						"elements",
						lv_elements_3_0,
						"org.osate.xtext.aadlv3.AadlV3.PathElement");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4='->'
			{
				newLeafNode(otherlv_4, grammarAccess.getPathAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPathAccess().getElementsPathElementParserRuleCall_4_1_0());
					}
					lv_elements_5_0=rulePathElement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPathRule());
						}
						add(
							$current,
							"elements",
							lv_elements_5_0,
							"org.osate.xtext.aadlv3.AadlV3.PathElement");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)+
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getPathRule());
				}
				newCompositeNode(grammarAccess.getPathAccess().getPropertiesBlockParserRuleCall_5());
			}
			this_PropertiesBlock_6=rulePropertiesBlock[$current]
			{
				$current = $this_PropertiesBlock_6.current;
				afterParserOrEnumRuleCall();
			}
		)?
		{
			newCompositeNode(grammarAccess.getPathAccess().getSEMICOLONParserRuleCall_6());
		}
		ruleSEMICOLON
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRulePathElement
entryRulePathElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPathElementRule()); }
	iv_rulePathElement=rulePathElement
	{ $current=$iv_rulePathElement.current; }
	EOF;

// Rule PathElement
rulePathElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPathElementRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getPathElementAccess().getElementModelElementCrossReference_0_0());
				}
			)
		)
		(
			((
				(
				)
				'.'
				(
					(
						RULE_ID
					)
				)
			)
			)=>
			(
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getPathElementAccess().getPathElementContextAction_1_0_0(),
							$current);
					}
				)
				otherlv_2='.'
				{
					newLeafNode(otherlv_2, grammarAccess.getPathElementAccess().getFullStopKeyword_1_0_1());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getPathElementRule());
							}
						}
						otherlv_3=RULE_ID
						{
							newLeafNode(otherlv_3, grammarAccess.getPathElementAccess().getElementModelElementCrossReference_1_0_2_0());
						}
					)
				)
			)
		)*
	)
;

// Entry rule entryRuleImport
entryRuleImport returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getImportRule()); }
	iv_ruleImport=ruleImport
	{ $current=$iv_ruleImport.current; }
	EOF;

// Rule Import
ruleImport returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='import'
		{
			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
				}
				lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImportRule());
					}
					set(
						$current,
						"importedNamespace",
						lv_importedNamespace_1_0,
						"org.osate.xtext.aadlv3.AadlV3.QualifiedNameWithWildcard");
					afterParserOrEnumRuleCall();
				}
			)
		)
		{
			newCompositeNode(grammarAccess.getImportAccess().getSEMICOLONParserRuleCall_2());
		}
		ruleSEMICOLON
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleConfigurationAssignment
entryRuleConfigurationAssignment returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConfigurationAssignmentRule()); }
	iv_ruleConfigurationAssignment=ruleConfigurationAssignment
	{ $current=$iv_ruleConfigurationAssignment.current; }
	EOF;

// Rule ConfigurationAssignment
ruleConfigurationAssignment returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getConfigurationAssignmentAccess().getTargetModelElementReferenceParserRuleCall_0_0());
				}
				lv_target_0_0=ruleModelElementReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConfigurationAssignmentRule());
					}
					set(
						$current,
						"target",
						lv_target_0_0,
						"org.osate.xtext.aadlv3.AadlV3.ModelElementReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='=>'
		{
			newLeafNode(otherlv_1, grammarAccess.getConfigurationAssignmentAccess().getEqualsSignGreaterThanSignKeyword_1());
		}
		(
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getConfigurationAssignmentAccess().getValueTypeReferenceParserRuleCall_2_0_0_0());
						}
						lv_value_2_0=ruleTypeReference
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getConfigurationAssignmentRule());
							}
							set(
								$current,
								"value",
								lv_value_2_0,
								"org.osate.xtext.aadlv3.AadlV3.TypeReference");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getConfigurationAssignmentRule());
						}
						newCompositeNode(grammarAccess.getConfigurationAssignmentAccess().getCurlyConfigurationElementBlockParserRuleCall_2_0_1());
					}
					this_CurlyConfigurationElementBlock_3=ruleCurlyConfigurationElementBlock[$current]
					{
						$current = $this_CurlyConfigurationElementBlock_3.current;
						afterParserOrEnumRuleCall();
					}
				)?
			)
			    |
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getConfigurationAssignmentRule());
				}
				newCompositeNode(grammarAccess.getConfigurationAssignmentAccess().getCurlyConfigurationElementBlockParserRuleCall_2_1());
			}
			this_CurlyConfigurationElementBlock_4=ruleCurlyConfigurationElementBlock[$current]
			{
				$current = $this_CurlyConfigurationElementBlock_4.current;
				afterParserOrEnumRuleCall();
			}
		)
		{
			newCompositeNode(grammarAccess.getConfigurationAssignmentAccess().getSEMICOLONParserRuleCall_3());
		}
		ruleSEMICOLON
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleFlowAssignment
entryRuleFlowAssignment returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFlowAssignmentRule()); }
	iv_ruleFlowAssignment=ruleFlowAssignment
	{ $current=$iv_ruleFlowAssignment.current; }
	EOF;

// Rule FlowAssignment
ruleFlowAssignment returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getFlowAssignmentAccess().getTargetModelElementReferenceParserRuleCall_0_0());
				}
				lv_target_0_0=ruleModelElementReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFlowAssignmentRule());
					}
					set(
						$current,
						"target",
						lv_target_0_0,
						"org.osate.xtext.aadlv3.AadlV3.ModelElementReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='=>'
		{
			newLeafNode(otherlv_1, grammarAccess.getFlowAssignmentAccess().getEqualsSignGreaterThanSignKeyword_1());
		}
		otherlv_2='flow'
		{
			newLeafNode(otherlv_2, grammarAccess.getFlowAssignmentAccess().getFlowKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFlowAssignmentAccess().getElementsPathElementParserRuleCall_3_0());
				}
				lv_elements_3_0=rulePathElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFlowAssignmentRule());
					}
					add(
						$current,
						"elements",
						lv_elements_3_0,
						"org.osate.xtext.aadlv3.AadlV3.PathElement");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4='->'
			{
				newLeafNode(otherlv_4, grammarAccess.getFlowAssignmentAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFlowAssignmentAccess().getElementsPathElementParserRuleCall_4_1_0());
					}
					lv_elements_5_0=rulePathElement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFlowAssignmentRule());
						}
						add(
							$current,
							"elements",
							lv_elements_5_0,
							"org.osate.xtext.aadlv3.AadlV3.PathElement");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		{
			newCompositeNode(grammarAccess.getFlowAssignmentAccess().getSEMICOLONParserRuleCall_5());
		}
		ruleSEMICOLON
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRulePropertyAssociation
entryRulePropertyAssociation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPropertyAssociationRule()); }
	iv_rulePropertyAssociation=rulePropertyAssociation
	{ $current=$iv_rulePropertyAssociation.current; }
	EOF;

// Rule PropertyAssociation
rulePropertyAssociation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getPropertyAssociationAccess().getTargetPropertyReferenceParserRuleCall_0_0());
				}
				lv_target_0_0=rulePropertyReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPropertyAssociationRule());
					}
					set(
						$current,
						"target",
						lv_target_0_0,
						"org.osate.xtext.aadlv3.AadlV3.PropertyReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='=>'
		{
			newLeafNode(otherlv_1, grammarAccess.getPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPropertyAssociationAccess().getValuePropertyValueParserRuleCall_2_0());
				}
				lv_value_2_0=rulePropertyValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPropertyAssociationRule());
					}
					set(
						$current,
						"value",
						lv_value_2_0,
						"org.osate.xtext.aadlv3.AadlV3.PropertyValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
		{
			newCompositeNode(grammarAccess.getPropertyAssociationAccess().getSEMICOLONParserRuleCall_3());
		}
		ruleSEMICOLON
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRulePropertyValue
entryRulePropertyValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPropertyValueRule()); }
	iv_rulePropertyValue=rulePropertyValue
	{ $current=$iv_rulePropertyValue.current; }
	EOF;

// Rule PropertyValue
rulePropertyValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_value_0_0=RULE_INT
			{
				newLeafNode(lv_value_0_0, grammarAccess.getPropertyValueAccess().getValueINTTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getPropertyValueRule());
				}
				setWithLastConsumed(
					$current,
					"value",
					lv_value_0_0,
					"org.eclipse.xtext.common.Terminals.INT");
			}
		)
	)
;

// Entry rule entryRuleModelElementReference
entryRuleModelElementReference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelElementReferenceRule()); }
	iv_ruleModelElementReference=ruleModelElementReference
	{ $current=$iv_ruleModelElementReference.current; }
	EOF;

// Rule ModelElementReference
ruleModelElementReference returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelElementReferenceRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getModelElementReferenceAccess().getElementModelElementCrossReference_0_0());
				}
			)
		)
		(
			((
				(
				)
				'.'
				(
					(
						RULE_ID
					)
				)
			)
			)=>
			(
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getModelElementReferenceAccess().getModelElementReferenceContextAction_1_0_0(),
							$current);
					}
				)
				otherlv_2='.'
				{
					newLeafNode(otherlv_2, grammarAccess.getModelElementReferenceAccess().getFullStopKeyword_1_0_1());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getModelElementReferenceRule());
							}
						}
						otherlv_3=RULE_ID
						{
							newLeafNode(otherlv_3, grammarAccess.getModelElementReferenceAccess().getElementModelElementCrossReference_1_0_2_0());
						}
					)
				)
			)
		)*
	)
;

// Entry rule entryRulePropertyReference
entryRulePropertyReference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPropertyReferenceRule()); }
	iv_rulePropertyReference=rulePropertyReference
	{ $current=$iv_rulePropertyReference.current; }
	EOF;

// Rule PropertyReference
rulePropertyReference returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPropertyReferenceRule());
						}
					}
					otherlv_0=RULE_ID
					{
						newLeafNode(otherlv_0, grammarAccess.getPropertyReferenceAccess().getElementModelElementCrossReference_0_0_0());
					}
				)
			)
			(
				((
					(
					)
					'.'
					(
						(
							RULE_ID
						)
					)
				)
				)=>
				(
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getPropertyReferenceAccess().getModelElementReferenceContextAction_0_1_0_0(),
								$current);
						}
					)
					otherlv_2='.'
					{
						newLeafNode(otherlv_2, grammarAccess.getPropertyReferenceAccess().getFullStopKeyword_0_1_0_1());
					}
					(
						(
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getPropertyReferenceRule());
								}
							}
							otherlv_3=RULE_ID
							{
								newLeafNode(otherlv_3, grammarAccess.getPropertyReferenceAccess().getElementModelElementCrossReference_0_1_0_2_0());
							}
						)
					)
				)
			)*
		)?
		otherlv_4='#'
		{
			newLeafNode(otherlv_4, grammarAccess.getPropertyReferenceAccess().getNumberSignKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPropertyReferenceRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getPropertyReferenceAccess().getPropertyPropertyCrossReference_2_0());
				}
				ruleQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;


// Rule ConfigurationElementBlock
ruleConfigurationElementBlock[EObject in_current]  returns [EObject current=in_current]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='is'
		{
			newLeafNode(otherlv_0, grammarAccess.getConfigurationElementBlockAccess().getIsKeyword_0());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getConfigurationElementBlockAccess().getPropertyAssociationsPropertyAssociationParserRuleCall_1_0_0());
					}
					lv_propertyAssociations_1_0=rulePropertyAssociation
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConfigurationElementBlockRule());
						}
						add(
							$current,
							"propertyAssociations",
							lv_propertyAssociations_1_0,
							"org.osate.xtext.aadlv3.AadlV3.PropertyAssociation");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getConfigurationElementBlockAccess().getAssignmentsConfigurationAssignmentParserRuleCall_1_1_0());
					}
					lv_assignments_2_0=ruleConfigurationAssignment
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConfigurationElementBlockRule());
						}
						add(
							$current,
							"assignments",
							lv_assignments_2_0,
							"org.osate.xtext.aadlv3.AadlV3.ConfigurationAssignment");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)+
	)
;


// Rule CurlyConfigurationElementBlock
ruleCurlyConfigurationElementBlock[EObject in_current]  returns [EObject current=in_current]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='{'
		{
			newLeafNode(otherlv_0, grammarAccess.getCurlyConfigurationElementBlockAccess().getLeftCurlyBracketKeyword_0());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getCurlyConfigurationElementBlockAccess().getPropertyAssociationsPropertyAssociationParserRuleCall_1_0_0());
					}
					lv_propertyAssociations_1_0=rulePropertyAssociation
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCurlyConfigurationElementBlockRule());
						}
						add(
							$current,
							"propertyAssociations",
							lv_propertyAssociations_1_0,
							"org.osate.xtext.aadlv3.AadlV3.PropertyAssociation");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getCurlyConfigurationElementBlockAccess().getAssignmentsConfigurationAssignmentParserRuleCall_1_1_0());
					}
					lv_assignments_2_0=ruleConfigurationAssignment
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCurlyConfigurationElementBlockRule());
						}
						add(
							$current,
							"assignments",
							lv_assignments_2_0,
							"org.osate.xtext.aadlv3.AadlV3.ConfigurationAssignment");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getCurlyConfigurationElementBlockAccess().getRightCurlyBracketKeyword_2());
		}
	)
;


// Rule Parameters
ruleParameters[EObject in_current]  returns [EObject current=in_current]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_parameterized_0_0='('
				{
					newLeafNode(lv_parameterized_0_0, grammarAccess.getParametersAccess().getParameterizedLeftParenthesisKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParametersRule());
					}
					setWithLastConsumed($current, "parameterized", true, "(");
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getParametersAccess().getParametersConfigurationParameterParserRuleCall_1_0_0());
					}
					lv_parameters_1_0=ruleConfigurationParameter
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getParametersRule());
						}
						add(
							$current,
							"parameters",
							lv_parameters_1_0,
							"org.osate.xtext.aadlv3.AadlV3.ConfigurationParameter");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_2=','
				{
					newLeafNode(otherlv_2, grammarAccess.getParametersAccess().getCommaKeyword_1_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getParametersAccess().getParametersConfigurationParameterParserRuleCall_1_1_1_0());
						}
						lv_parameters_3_0=ruleConfigurationParameter
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getParametersRule());
							}
							add(
								$current,
								"parameters",
								lv_parameters_3_0,
								"org.osate.xtext.aadlv3.AadlV3.ConfigurationParameter");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getParametersAccess().getRightParenthesisKeyword_2());
		}
	)
;

// Entry rule entryRuleConfigurationParameter
entryRuleConfigurationParameter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConfigurationParameterRule()); }
	iv_ruleConfigurationParameter=ruleConfigurationParameter
	{ $current=$iv_ruleConfigurationParameter.current; }
	EOF;

// Rule ConfigurationParameter
ruleConfigurationParameter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getConfigurationParameterAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConfigurationParameterRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getConfigurationParameterAccess().getColonKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConfigurationParameterRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getConfigurationParameterAccess().getTypeTypeCrossReference_2_0());
				}
				ruleQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleReversableInterfaceReference
entryRuleReversableInterfaceReference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getReversableInterfaceReferenceRule()); }
	iv_ruleReversableInterfaceReference=ruleReversableInterfaceReference
	{ $current=$iv_ruleReversableInterfaceReference.current; }
	EOF;

// Rule ReversableInterfaceReference
ruleReversableInterfaceReference returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_reverse_0_0='reverse'
				{
					newLeafNode(lv_reverse_0_0, grammarAccess.getReversableInterfaceReferenceAccess().getReverseReverseKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReversableInterfaceReferenceRule());
					}
					setWithLastConsumed($current, "reverse", true, "reverse");
				}
			)
		)?
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReversableInterfaceReferenceRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getReversableInterfaceReferenceAccess().getTypeComponentInterfaceCrossReference_1_0());
				}
				ruleQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleTypeReference
entryRuleTypeReference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeReferenceRule()); }
	iv_ruleTypeReference=ruleTypeReference
	{ $current=$iv_ruleTypeReference.current; }
	EOF;

// Rule TypeReference
ruleTypeReference returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTypeReferenceRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTypeReferenceAccess().getTypeTypeCrossReference_0_0());
				}
				ruleQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getTypeReferenceRule());
				}
				newCompositeNode(grammarAccess.getTypeReferenceAccess().getConfigurationActualsParserRuleCall_1());
			}
			this_ConfigurationActuals_1=ruleConfigurationActuals[$current]
			{
				$current = $this_ConfigurationActuals_1.current;
				afterParserOrEnumRuleCall();
			}
		)?
	)
;

// Entry rule entryRuleImplementationReference
entryRuleImplementationReference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getImplementationReferenceRule()); }
	iv_ruleImplementationReference=ruleImplementationReference
	{ $current=$iv_ruleImplementationReference.current; }
	EOF;

// Rule ImplementationReference
ruleImplementationReference returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getImplementationReferenceRule());
				}
			}
			{
				newCompositeNode(grammarAccess.getImplementationReferenceAccess().getTypeComponentImplementationCrossReference_0());
			}
			ruleQualifiedName
			{
				afterParserOrEnumRuleCall();
			}
		)
	)
;


// Rule PropertiesBlock
rulePropertiesBlock[EObject in_current]  returns [EObject current=in_current]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='{'
		{
			newLeafNode(otherlv_0, grammarAccess.getPropertiesBlockAccess().getLeftCurlyBracketKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPropertiesBlockAccess().getPropertyAssociationsPropertyAssociationParserRuleCall_1_0());
				}
				lv_propertyAssociations_1_0=rulePropertyAssociation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPropertiesBlockRule());
					}
					add(
						$current,
						"propertyAssociations",
						lv_propertyAssociations_1_0,
						"org.osate.xtext.aadlv3.AadlV3.PropertyAssociation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_2='}'
		{
			newLeafNode(otherlv_2, grammarAccess.getPropertiesBlockAccess().getRightCurlyBracketKeyword_2());
		}
	)
;


// Rule NestedComponentImplementationBlock
ruleNestedComponentImplementationBlock[EObject in_current]  returns [EObject current=in_current]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='{'
		{
			newLeafNode(otherlv_0, grammarAccess.getNestedComponentImplementationBlockAccess().getLeftCurlyBracketKeyword_0());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getNestedComponentImplementationBlockAccess().getFeaturesFeatureParserRuleCall_1_0_0());
					}
					lv_features_1_0=ruleFeature
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNestedComponentImplementationBlockRule());
						}
						add(
							$current,
							"features",
							lv_features_1_0,
							"org.osate.xtext.aadlv3.AadlV3.Feature");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getNestedComponentImplementationBlockAccess().getConnectionsConnectionParserRuleCall_1_1_0());
					}
					lv_connections_2_0=ruleConnection
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNestedComponentImplementationBlockRule());
						}
						add(
							$current,
							"connections",
							lv_connections_2_0,
							"org.osate.xtext.aadlv3.AadlV3.Connection");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getNestedComponentImplementationBlockAccess().getConnectionsFeatureMappingParserRuleCall_1_2_0());
					}
					lv_connections_3_0=ruleFeatureMapping
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNestedComponentImplementationBlockRule());
						}
						add(
							$current,
							"connections",
							lv_connections_3_0,
							"org.osate.xtext.aadlv3.AadlV3.FeatureMapping");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getNestedComponentImplementationBlockAccess().getComponentsComponentParserRuleCall_1_3_0());
					}
					lv_components_4_0=ruleComponent
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNestedComponentImplementationBlockRule());
						}
						add(
							$current,
							"components",
							lv_components_4_0,
							"org.osate.xtext.aadlv3.AadlV3.Component");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getNestedComponentImplementationBlockAccess().getPropertyAssociationsPropertyAssociationParserRuleCall_1_4_0());
					}
					lv_propertyAssociations_5_0=rulePropertyAssociation
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNestedComponentImplementationBlockRule());
						}
						add(
							$current,
							"propertyAssociations",
							lv_propertyAssociations_5_0,
							"org.osate.xtext.aadlv3.AadlV3.PropertyAssociation");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getNestedComponentImplementationBlockAccess().getRightCurlyBracketKeyword_2());
		}
	)
;


// Rule ClassifierExtensions
ruleClassifierExtensions[EObject in_current]  returns [EObject current=in_current]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getClassifierExtensionsAccess().getSuperClassifiersTypeReferenceParserRuleCall_0_0());
				}
				lv_superClassifiers_0_0=ruleTypeReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getClassifierExtensionsRule());
					}
					add(
						$current,
						"superClassifiers",
						lv_superClassifiers_0_0,
						"org.osate.xtext.aadlv3.AadlV3.TypeReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1=','
			{
				newLeafNode(otherlv_1, grammarAccess.getClassifierExtensionsAccess().getCommaKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getClassifierExtensionsAccess().getSuperClassifiersTypeReferenceParserRuleCall_1_1_0());
					}
					lv_superClassifiers_2_0=ruleTypeReference
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getClassifierExtensionsRule());
						}
						add(
							$current,
							"superClassifiers",
							lv_superClassifiers_2_0,
							"org.osate.xtext.aadlv3.AadlV3.TypeReference");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;


// Rule ImplementationExtensions
ruleImplementationExtensions[EObject in_current]  returns [EObject current=in_current]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getImplementationExtensionsAccess().getSuperClassifiersImplementationReferenceParserRuleCall_0_0());
				}
				lv_superClassifiers_0_0=ruleImplementationReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImplementationExtensionsRule());
					}
					add(
						$current,
						"superClassifiers",
						lv_superClassifiers_0_0,
						"org.osate.xtext.aadlv3.AadlV3.ImplementationReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1=','
			{
				newLeafNode(otherlv_1, grammarAccess.getImplementationExtensionsAccess().getCommaKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getImplementationExtensionsAccess().getSuperClassifiersImplementationReferenceParserRuleCall_1_1_0());
					}
					lv_superClassifiers_2_0=ruleImplementationReference
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getImplementationExtensionsRule());
						}
						add(
							$current,
							"superClassifiers",
							lv_superClassifiers_2_0,
							"org.osate.xtext.aadlv3.AadlV3.ImplementationReference");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;


// Rule InterfaceExtensions
ruleInterfaceExtensions[EObject in_current]  returns [EObject current=in_current]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getInterfaceExtensionsAccess().getSuperClassifiersReversableInterfaceReferenceParserRuleCall_0_0());
				}
				lv_superClassifiers_0_0=ruleReversableInterfaceReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInterfaceExtensionsRule());
					}
					add(
						$current,
						"superClassifiers",
						lv_superClassifiers_0_0,
						"org.osate.xtext.aadlv3.AadlV3.ReversableInterfaceReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1=','
			{
				newLeafNode(otherlv_1, grammarAccess.getInterfaceExtensionsAccess().getCommaKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getInterfaceExtensionsAccess().getSuperClassifiersReversableInterfaceReferenceParserRuleCall_1_1_0());
					}
					lv_superClassifiers_2_0=ruleReversableInterfaceReference
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getInterfaceExtensionsRule());
						}
						add(
							$current,
							"superClassifiers",
							lv_superClassifiers_2_0,
							"org.osate.xtext.aadlv3.AadlV3.ReversableInterfaceReference");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;


// Rule ConfigurationActuals
ruleConfigurationActuals[EObject in_current]  returns [EObject current=in_current]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getConfigurationActualsAccess().getLeftParenthesisKeyword_0());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getConfigurationActualsAccess().getActualsConfigurationActualParserRuleCall_1_0_0());
					}
					lv_actuals_1_0=ruleConfigurationActual
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConfigurationActualsRule());
						}
						add(
							$current,
							"actuals",
							lv_actuals_1_0,
							"org.osate.xtext.aadlv3.AadlV3.ConfigurationActual");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_2=','
				{
					newLeafNode(otherlv_2, grammarAccess.getConfigurationActualsAccess().getCommaKeyword_1_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getConfigurationActualsAccess().getActualsConfigurationActualParserRuleCall_1_1_1_0());
						}
						lv_actuals_3_0=ruleConfigurationActual
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getConfigurationActualsRule());
							}
							add(
								$current,
								"actuals",
								lv_actuals_3_0,
								"org.osate.xtext.aadlv3.AadlV3.ConfigurationActual");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getConfigurationActualsAccess().getRightParenthesisKeyword_2());
		}
	)
;

// Entry rule entryRuleConfigurationActual
entryRuleConfigurationActual returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConfigurationActualRule()); }
	iv_ruleConfigurationActual=ruleConfigurationActual
	{ $current=$iv_ruleConfigurationActual.current; }
	EOF;

// Rule ConfigurationActual
ruleConfigurationActual returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConfigurationActualRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getConfigurationActualAccess().getParameterConfigurationParameterCrossReference_0_0());
				}
			)
		)
		otherlv_1='=>'
		{
			newLeafNode(otherlv_1, grammarAccess.getConfigurationActualAccess().getEqualsSignGreaterThanSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConfigurationActualAccess().getValueTypeReferenceParserRuleCall_2_0());
				}
				lv_value_2_0=ruleTypeReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConfigurationActualRule());
					}
					set(
						$current,
						"value",
						lv_value_2_0,
						"org.osate.xtext.aadlv3.AadlV3.TypeReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleWorkingset
entryRuleWorkingset returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWorkingsetRule()); }
	iv_ruleWorkingset=ruleWorkingset
	{ $current=$iv_ruleWorkingset.current; }
	EOF;

// Rule Workingset
ruleWorkingset returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='workingset'
		{
			newLeafNode(otherlv_0, grammarAccess.getWorkingsetAccess().getWorkingsetKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWorkingsetAccess().getNameQualifiedNameParserRuleCall_1_0());
				}
				lv_name_1_0=ruleQualifiedName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWorkingsetRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.osate.xtext.aadlv3.AadlV3.QualifiedName");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='is'
		{
			newLeafNode(otherlv_2, grammarAccess.getWorkingsetAccess().getIsKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWorkingsetAccess().getRootComponentsComponentParserRuleCall_3_0());
				}
				lv_rootComponents_3_0=ruleComponent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWorkingsetRule());
					}
					add(
						$current,
						"rootComponents",
						lv_rootComponents_3_0,
						"org.osate.xtext.aadlv3.AadlV3.Component");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='end'
		{
			newLeafNode(otherlv_4, grammarAccess.getWorkingsetAccess().getEndKeyword_4());
		}
		(
			{
				newCompositeNode(grammarAccess.getWorkingsetAccess().getSEMICOLONParserRuleCall_5());
			}
			ruleSEMICOLON
			{
				afterParserOrEnumRuleCall();
			}
		)?
	)
;

// Entry rule entryRuleQualifiedNameWithWildcard
entryRuleQualifiedNameWithWildcard returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); }
	iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard
	{ $current=$iv_ruleQualifiedNameWithWildcard.current.getText(); }
	EOF;

// Rule QualifiedNameWithWildcard
ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
		}
		this_QualifiedName_0=ruleQualifiedName
		{
			$current.merge(this_QualifiedName_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		(
			kw='.*'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
			}
		)?
	)
;

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); }
	iv_ruleQualifiedName=ruleQualifiedName
	{ $current=$iv_ruleQualifiedName.current.getText(); }
	EOF;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

// Entry rule entryRuleSEMICOLON
entryRuleSEMICOLON returns [String current=null]:
	{ newCompositeNode(grammarAccess.getSEMICOLONRule()); }
	iv_ruleSEMICOLON=ruleSEMICOLON
	{ $current=$iv_ruleSEMICOLON.current.getText(); }
	EOF;

// Rule SEMICOLON
ruleSEMICOLON returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw=';'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getSEMICOLONAccess().getSemicolonKeyword());
	}
;

// Entry rule entryRuleComponentCategory
entryRuleComponentCategory returns [String current=null]:
	{ newCompositeNode(grammarAccess.getComponentCategoryRule()); }
	iv_ruleComponentCategory=ruleComponentCategory
	{ $current=$iv_ruleComponentCategory.current.getText(); }
	EOF;

// Rule ComponentCategory
ruleComponentCategory returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='component'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getComponentKeyword_0());
		}
		    |
		kw='bus'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getBusKeyword_1());
		}
		    |
		kw='data'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getDataKeyword_2());
		}
		    |
		kw='device'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getDeviceKeyword_3());
		}
		    |
		kw='memory'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getMemoryKeyword_4());
		}
		    |
		kw='process'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getProcessKeyword_5());
		}
		    |
		kw='processor'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getProcessorKeyword_6());
		}
		    |
		kw='system'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getSystemKeyword_7());
		}
		    |
		kw='thread'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getThreadKeyword_8());
		}
		    |
		{
			newCompositeNode(grammarAccess.getComponentCategoryAccess().getVirtualBusKeywordsParserRuleCall_9());
		}
		this_VirtualBusKeywords_9=ruleVirtualBusKeywords
		{
			$current.merge(this_VirtualBusKeywords_9);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getComponentCategoryAccess().getVirtualProcessorKeywordsParserRuleCall_10());
		}
		this_VirtualProcessorKeywords_10=ruleVirtualProcessorKeywords
		{
			$current.merge(this_VirtualProcessorKeywords_10);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getComponentCategoryAccess().getVirtualMemoryKeywordsParserRuleCall_11());
		}
		this_VirtualMemoryKeywords_11=ruleVirtualMemoryKeywords
		{
			$current.merge(this_VirtualMemoryKeywords_11);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getComponentCategoryAccess().getVirtualDeviceKeywordsParserRuleCall_12());
		}
		this_VirtualDeviceKeywords_12=ruleVirtualDeviceKeywords
		{
			$current.merge(this_VirtualDeviceKeywords_12);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		kw='subprogram'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getSubprogramKeyword_13());
		}
		    |
		{
			newCompositeNode(grammarAccess.getComponentCategoryAccess().getSubprogramGroupKeywordsParserRuleCall_14());
		}
		this_SubprogramGroupKeywords_14=ruleSubprogramGroupKeywords
		{
			$current.merge(this_SubprogramGroupKeywords_14);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getComponentCategoryAccess().getThreadGroupKeywordsParserRuleCall_15());
		}
		this_ThreadGroupKeywords_15=ruleThreadGroupKeywords
		{
			$current.merge(this_ThreadGroupKeywords_15);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleFeatureCategory
entryRuleFeatureCategory returns [String current=null]:
	{ newCompositeNode(grammarAccess.getFeatureCategoryRule()); }
	iv_ruleFeatureCategory=ruleFeatureCategory
	{ $current=$iv_ruleFeatureCategory.current.getText(); }
	EOF;

// Rule FeatureCategory
ruleFeatureCategory returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='feature'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getFeatureCategoryAccess().getFeatureKeyword_0());
		}
		    |
		kw='port'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getFeatureCategoryAccess().getPortKeyword_1());
		}
		    |
		kw='access'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getFeatureCategoryAccess().getAccessKeyword_2());
		}
		    |
		{
			newCompositeNode(grammarAccess.getFeatureCategoryAccess().getBusAccessKeywordsParserRuleCall_3());
		}
		this_BusAccessKeywords_3=ruleBusAccessKeywords
		{
			$current.merge(this_BusAccessKeywords_3);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		kw='binding'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getFeatureCategoryAccess().getBindingKeyword_4());
		}
		    |
		kw='interface'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getFeatureCategoryAccess().getInterfaceKeyword_5());
		}
	)
;

// Entry rule entryRuleFeatureDirection
entryRuleFeatureDirection returns [String current=null]:
	{ newCompositeNode(grammarAccess.getFeatureDirectionRule()); }
	iv_ruleFeatureDirection=ruleFeatureDirection
	{ $current=$iv_ruleFeatureDirection.current.getText(); }
	EOF;

// Rule FeatureDirection
ruleFeatureDirection returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='in'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getFeatureDirectionAccess().getInKeyword_0());
		}
		    |
		kw='out'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getFeatureDirectionAccess().getOutKeyword_1());
		}
		    |
		{
			newCompositeNode(grammarAccess.getFeatureDirectionAccess().getInOutKeywordsParserRuleCall_2());
		}
		this_InOutKeywords_2=ruleInOutKeywords
		{
			$current.merge(this_InOutKeywords_2);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		kw='requires'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getFeatureDirectionAccess().getRequiresKeyword_3());
		}
		    |
		kw='provides'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getFeatureDirectionAccess().getProvidesKeyword_4());
		}
		    |
		{
			newCompositeNode(grammarAccess.getFeatureDirectionAccess().getProvidesReadKeywordsParserRuleCall_5());
		}
		this_ProvidesReadKeywords_5=ruleProvidesReadKeywords
		{
			$current.merge(this_ProvidesReadKeywords_5);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFeatureDirectionAccess().getRequiresReadKeywordsParserRuleCall_6());
		}
		this_RequiresReadKeywords_6=ruleRequiresReadKeywords
		{
			$current.merge(this_RequiresReadKeywords_6);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFeatureDirectionAccess().getProvidesWriteKeywordsParserRuleCall_7());
		}
		this_ProvidesWriteKeywords_7=ruleProvidesWriteKeywords
		{
			$current.merge(this_ProvidesWriteKeywords_7);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFeatureDirectionAccess().getRequiresWriteKeywordsParserRuleCall_8());
		}
		this_RequiresWriteKeywords_8=ruleRequiresWriteKeywords
		{
			$current.merge(this_RequiresWriteKeywords_8);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFeatureDirectionAccess().getProvidesRWKeywordsParserRuleCall_9());
		}
		this_ProvidesRWKeywords_9=ruleProvidesRWKeywords
		{
			$current.merge(this_ProvidesRWKeywords_9);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFeatureDirectionAccess().getRequiresRWKeywordsParserRuleCall_10());
		}
		this_RequiresRWKeywords_10=ruleRequiresRWKeywords
		{
			$current.merge(this_RequiresRWKeywords_10);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleConnectionType
entryRuleConnectionType returns [String current=null]:
	{ newCompositeNode(grammarAccess.getConnectionTypeRule()); }
	iv_ruleConnectionType=ruleConnectionType
	{ $current=$iv_ruleConnectionType.current.getText(); }
	EOF;

// Rule ConnectionType
ruleConnectionType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='connection'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getConnectionTypeAccess().getConnectionKeyword_0());
		}
		    |
		kw='binding'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getConnectionTypeAccess().getBindingKeyword_1());
		}
	)
;

// Entry rule entryRuleMappingType
entryRuleMappingType returns [String current=null]:
	{ newCompositeNode(grammarAccess.getMappingTypeRule()); }
	iv_ruleMappingType=ruleMappingType
	{ $current=$iv_ruleMappingType.current.getText(); }
	EOF;

// Rule MappingType
ruleMappingType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='mapping'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getMappingTypeAccess().getMappingKeyword());
	}
;

// Entry rule entryRuleFlowPathType
entryRuleFlowPathType returns [String current=null]:
	{ newCompositeNode(grammarAccess.getFlowPathTypeRule()); }
	iv_ruleFlowPathType=ruleFlowPathType
	{ $current=$iv_ruleFlowPathType.current.getText(); }
	EOF;

// Rule FlowPathType
ruleFlowPathType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getFlowPathTypeAccess().getFlowPathKeywordsParserRuleCall());
	}
	this_FlowPathKeywords_0=ruleFlowPathKeywords
	{
		$current.merge(this_FlowPathKeywords_0);
	}
	{
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleFlowSourceType
entryRuleFlowSourceType returns [String current=null]:
	{ newCompositeNode(grammarAccess.getFlowSourceTypeRule()); }
	iv_ruleFlowSourceType=ruleFlowSourceType
	{ $current=$iv_ruleFlowSourceType.current.getText(); }
	EOF;

// Rule FlowSourceType
ruleFlowSourceType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getFlowSourceTypeAccess().getFlowSourceKeywordsParserRuleCall());
	}
	this_FlowSourceKeywords_0=ruleFlowSourceKeywords
	{
		$current.merge(this_FlowSourceKeywords_0);
	}
	{
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleFlowSinkType
entryRuleFlowSinkType returns [String current=null]:
	{ newCompositeNode(grammarAccess.getFlowSinkTypeRule()); }
	iv_ruleFlowSinkType=ruleFlowSinkType
	{ $current=$iv_ruleFlowSinkType.current.getText(); }
	EOF;

// Rule FlowSinkType
ruleFlowSinkType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getFlowSinkTypeAccess().getFlowSinkKeywordsParserRuleCall());
	}
	this_FlowSinkKeywords_0=ruleFlowSinkKeywords
	{
		$current.merge(this_FlowSinkKeywords_0);
	}
	{
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleVirtualProcessorKeywords
entryRuleVirtualProcessorKeywords returns [String current=null]:
	{ newCompositeNode(grammarAccess.getVirtualProcessorKeywordsRule()); }
	iv_ruleVirtualProcessorKeywords=ruleVirtualProcessorKeywords
	{ $current=$iv_ruleVirtualProcessorKeywords.current.getText(); }
	EOF;

// Rule VirtualProcessorKeywords
ruleVirtualProcessorKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='virtual'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getVirtualProcessorKeywordsAccess().getVirtualKeyword_0());
		}
		kw='processor'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getVirtualProcessorKeywordsAccess().getProcessorKeyword_1());
		}
	)
;

// Entry rule entryRuleVirtualBusKeywords
entryRuleVirtualBusKeywords returns [String current=null]:
	{ newCompositeNode(grammarAccess.getVirtualBusKeywordsRule()); }
	iv_ruleVirtualBusKeywords=ruleVirtualBusKeywords
	{ $current=$iv_ruleVirtualBusKeywords.current.getText(); }
	EOF;

// Rule VirtualBusKeywords
ruleVirtualBusKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='virtual'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getVirtualBusKeywordsAccess().getVirtualKeyword_0());
		}
		kw='bus'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getVirtualBusKeywordsAccess().getBusKeyword_1());
		}
	)
;

// Entry rule entryRuleVirtualMemoryKeywords
entryRuleVirtualMemoryKeywords returns [String current=null]:
	{ newCompositeNode(grammarAccess.getVirtualMemoryKeywordsRule()); }
	iv_ruleVirtualMemoryKeywords=ruleVirtualMemoryKeywords
	{ $current=$iv_ruleVirtualMemoryKeywords.current.getText(); }
	EOF;

// Rule VirtualMemoryKeywords
ruleVirtualMemoryKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='virtual'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getVirtualMemoryKeywordsAccess().getVirtualKeyword_0());
		}
		kw='memory'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getVirtualMemoryKeywordsAccess().getMemoryKeyword_1());
		}
	)
;

// Entry rule entryRuleVirtualDeviceKeywords
entryRuleVirtualDeviceKeywords returns [String current=null]:
	{ newCompositeNode(grammarAccess.getVirtualDeviceKeywordsRule()); }
	iv_ruleVirtualDeviceKeywords=ruleVirtualDeviceKeywords
	{ $current=$iv_ruleVirtualDeviceKeywords.current.getText(); }
	EOF;

// Rule VirtualDeviceKeywords
ruleVirtualDeviceKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='virtual'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getVirtualDeviceKeywordsAccess().getVirtualKeyword_0());
		}
		kw='device'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getVirtualDeviceKeywordsAccess().getDeviceKeyword_1());
		}
	)
;

// Entry rule entryRuleThreadGroupKeywords
entryRuleThreadGroupKeywords returns [String current=null]:
	{ newCompositeNode(grammarAccess.getThreadGroupKeywordsRule()); }
	iv_ruleThreadGroupKeywords=ruleThreadGroupKeywords
	{ $current=$iv_ruleThreadGroupKeywords.current.getText(); }
	EOF;

// Rule ThreadGroupKeywords
ruleThreadGroupKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='thread'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getThreadGroupKeywordsAccess().getThreadKeyword_0());
		}
		kw='group'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getThreadGroupKeywordsAccess().getGroupKeyword_1());
		}
	)
;

// Entry rule entryRuleSubprogramGroupKeywords
entryRuleSubprogramGroupKeywords returns [String current=null]:
	{ newCompositeNode(grammarAccess.getSubprogramGroupKeywordsRule()); }
	iv_ruleSubprogramGroupKeywords=ruleSubprogramGroupKeywords
	{ $current=$iv_ruleSubprogramGroupKeywords.current.getText(); }
	EOF;

// Rule SubprogramGroupKeywords
ruleSubprogramGroupKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='subprogram'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getSubprogramGroupKeywordsAccess().getSubprogramKeyword_0());
		}
		kw='group'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getSubprogramGroupKeywordsAccess().getGroupKeyword_1());
		}
	)
;

// Entry rule entryRuleEndToEndFlowKeywords
entryRuleEndToEndFlowKeywords returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEndToEndFlowKeywordsRule()); }
	iv_ruleEndToEndFlowKeywords=ruleEndToEndFlowKeywords
	{ $current=$iv_ruleEndToEndFlowKeywords.current.getText(); }
	EOF;

// Rule EndToEndFlowKeywords
ruleEndToEndFlowKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='end'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEndToEndFlowKeywordsAccess().getEndKeyword_0());
		}
		kw='to'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEndToEndFlowKeywordsAccess().getToKeyword_1());
		}
		kw='end'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEndToEndFlowKeywordsAccess().getEndKeyword_2());
		}
		kw='flow'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEndToEndFlowKeywordsAccess().getFlowKeyword_3());
		}
	)
;

// Entry rule entryRuleFlowSourceKeywords
entryRuleFlowSourceKeywords returns [String current=null]:
	{ newCompositeNode(grammarAccess.getFlowSourceKeywordsRule()); }
	iv_ruleFlowSourceKeywords=ruleFlowSourceKeywords
	{ $current=$iv_ruleFlowSourceKeywords.current.getText(); }
	EOF;

// Rule FlowSourceKeywords
ruleFlowSourceKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='flow'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getFlowSourceKeywordsAccess().getFlowKeyword_0());
		}
		kw='source'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getFlowSourceKeywordsAccess().getSourceKeyword_1());
		}
	)
;

// Entry rule entryRuleFlowSinkKeywords
entryRuleFlowSinkKeywords returns [String current=null]:
	{ newCompositeNode(grammarAccess.getFlowSinkKeywordsRule()); }
	iv_ruleFlowSinkKeywords=ruleFlowSinkKeywords
	{ $current=$iv_ruleFlowSinkKeywords.current.getText(); }
	EOF;

// Rule FlowSinkKeywords
ruleFlowSinkKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='flow'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getFlowSinkKeywordsAccess().getFlowKeyword_0());
		}
		kw='sink'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getFlowSinkKeywordsAccess().getSinkKeyword_1());
		}
	)
;

// Entry rule entryRuleFlowPathKeywords
entryRuleFlowPathKeywords returns [String current=null]:
	{ newCompositeNode(grammarAccess.getFlowPathKeywordsRule()); }
	iv_ruleFlowPathKeywords=ruleFlowPathKeywords
	{ $current=$iv_ruleFlowPathKeywords.current.getText(); }
	EOF;

// Rule FlowPathKeywords
ruleFlowPathKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='flow'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getFlowPathKeywordsAccess().getFlowKeyword_0());
		}
		kw='path'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getFlowPathKeywordsAccess().getPathKeyword_1());
		}
	)
;

// Entry rule entryRuleInOutKeywords
entryRuleInOutKeywords returns [String current=null]:
	{ newCompositeNode(grammarAccess.getInOutKeywordsRule()); }
	iv_ruleInOutKeywords=ruleInOutKeywords
	{ $current=$iv_ruleInOutKeywords.current.getText(); }
	EOF;

// Rule InOutKeywords
ruleInOutKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='in'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getInOutKeywordsAccess().getInKeyword_0());
		}
		kw='out'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getInOutKeywordsAccess().getOutKeyword_1());
		}
	)
;

// Entry rule entryRuleBusAccessKeywords
entryRuleBusAccessKeywords returns [String current=null]:
	{ newCompositeNode(grammarAccess.getBusAccessKeywordsRule()); }
	iv_ruleBusAccessKeywords=ruleBusAccessKeywords
	{ $current=$iv_ruleBusAccessKeywords.current.getText(); }
	EOF;

// Rule BusAccessKeywords
ruleBusAccessKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='bus'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBusAccessKeywordsAccess().getBusKeyword_0());
		}
		kw='access'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBusAccessKeywordsAccess().getAccessKeyword_1());
		}
	)
;

// Entry rule entryRuleProvidesReadKeywords
entryRuleProvidesReadKeywords returns [String current=null]:
	{ newCompositeNode(grammarAccess.getProvidesReadKeywordsRule()); }
	iv_ruleProvidesReadKeywords=ruleProvidesReadKeywords
	{ $current=$iv_ruleProvidesReadKeywords.current.getText(); }
	EOF;

// Rule ProvidesReadKeywords
ruleProvidesReadKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='provides'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getProvidesReadKeywordsAccess().getProvidesKeyword_0());
		}
		kw='read'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getProvidesReadKeywordsAccess().getReadKeyword_1());
		}
	)
;

// Entry rule entryRuleRequiresReadKeywords
entryRuleRequiresReadKeywords returns [String current=null]:
	{ newCompositeNode(grammarAccess.getRequiresReadKeywordsRule()); }
	iv_ruleRequiresReadKeywords=ruleRequiresReadKeywords
	{ $current=$iv_ruleRequiresReadKeywords.current.getText(); }
	EOF;

// Rule RequiresReadKeywords
ruleRequiresReadKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='requires'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getRequiresReadKeywordsAccess().getRequiresKeyword_0());
		}
		kw='read'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getRequiresReadKeywordsAccess().getReadKeyword_1());
		}
	)
;

// Entry rule entryRuleProvidesWriteKeywords
entryRuleProvidesWriteKeywords returns [String current=null]:
	{ newCompositeNode(grammarAccess.getProvidesWriteKeywordsRule()); }
	iv_ruleProvidesWriteKeywords=ruleProvidesWriteKeywords
	{ $current=$iv_ruleProvidesWriteKeywords.current.getText(); }
	EOF;

// Rule ProvidesWriteKeywords
ruleProvidesWriteKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='provides'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getProvidesWriteKeywordsAccess().getProvidesKeyword_0());
		}
		kw='write'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getProvidesWriteKeywordsAccess().getWriteKeyword_1());
		}
	)
;

// Entry rule entryRuleRequiresWriteKeywords
entryRuleRequiresWriteKeywords returns [String current=null]:
	{ newCompositeNode(grammarAccess.getRequiresWriteKeywordsRule()); }
	iv_ruleRequiresWriteKeywords=ruleRequiresWriteKeywords
	{ $current=$iv_ruleRequiresWriteKeywords.current.getText(); }
	EOF;

// Rule RequiresWriteKeywords
ruleRequiresWriteKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='requires'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getRequiresWriteKeywordsAccess().getRequiresKeyword_0());
		}
		kw='write'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getRequiresWriteKeywordsAccess().getWriteKeyword_1());
		}
	)
;

// Entry rule entryRuleProvidesRWKeywords
entryRuleProvidesRWKeywords returns [String current=null]:
	{ newCompositeNode(grammarAccess.getProvidesRWKeywordsRule()); }
	iv_ruleProvidesRWKeywords=ruleProvidesRWKeywords
	{ $current=$iv_ruleProvidesRWKeywords.current.getText(); }
	EOF;

// Rule ProvidesRWKeywords
ruleProvidesRWKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='provides'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getProvidesRWKeywordsAccess().getProvidesKeyword_0());
		}
		kw='readwrite'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getProvidesRWKeywordsAccess().getReadwriteKeyword_1());
		}
	)
;

// Entry rule entryRuleRequiresRWKeywords
entryRuleRequiresRWKeywords returns [String current=null]:
	{ newCompositeNode(grammarAccess.getRequiresRWKeywordsRule()); }
	iv_ruleRequiresRWKeywords=ruleRequiresRWKeywords
	{ $current=$iv_ruleRequiresRWKeywords.current.getText(); }
	EOF;

// Rule RequiresRWKeywords
ruleRequiresRWKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='requires'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getRequiresRWKeywordsAccess().getRequiresKeyword_0());
		}
		kw='readwrite'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getRequiresRWKeywordsAccess().getReadwriteKeyword_1());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
