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
	backtrack=true;
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

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/

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
		(
			(
				lv_private_0_0='private'
				{
					newLeafNode(lv_private_0_0, grammarAccess.getPackageDeclarationAccess().getPrivatePrivateKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPackageDeclarationRule());
					}
					setWithLastConsumed($current, "private", true, "private");
				}
			)
		)?
		otherlv_1='package'
		{
			newLeafNode(otherlv_1, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_2_0());
				}
				lv_name_2_0=ruleQualifiedName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
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
			(
				(
					{
						newCompositeNode(grammarAccess.getPackageDeclarationAccess().getImportsImportParserRuleCall_3_0_0());
					}
					lv_imports_3_0=ruleImport
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
						}
						add(
							$current,
							"imports",
							lv_imports_3_0,
							"org.osate.xtext.aadlv3.AadlV3.Import");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsPackageElementParserRuleCall_3_1_0());
					}
					lv_elements_4_0=rulePackageElement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
						}
						add(
							$current,
							"elements",
							lv_elements_4_0,
							"org.osate.xtext.aadlv3.AadlV3.PackageElement");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_5='end'
		{
			newLeafNode(otherlv_5, grammarAccess.getPackageDeclarationAccess().getEndKeyword_4());
		}
	)
;

// Entry rule entryRulePackageElement
entryRulePackageElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPackageElementRule()); }
	iv_rulePackageElement=rulePackageElement
	{ $current=$iv_rulePackageElement.current; }
	EOF;

// Rule PackageElement
rulePackageElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPackageElementAccess().getPackageDeclarationParserRuleCall_0());
		}
		this_PackageDeclaration_0=rulePackageDeclaration
		{
			$current = $this_PackageDeclaration_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPackageElementAccess().getDataTypeParserRuleCall_1());
		}
		this_DataType_1=ruleDataType
		{
			$current = $this_DataType_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPackageElementAccess().getComponentInterfaceParserRuleCall_2());
		}
		this_ComponentInterface_2=ruleComponentInterface
		{
			$current = $this_ComponentInterface_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPackageElementAccess().getComponentImplementationParserRuleCall_3());
		}
		this_ComponentImplementation_3=ruleComponentImplementation
		{
			$current = $this_ComponentImplementation_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPackageElementAccess().getComponentConfigurationParserRuleCall_4());
		}
		this_ComponentConfiguration_4=ruleComponentConfiguration
		{
			$current = $this_ComponentConfiguration_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPackageElementAccess().getPropertyDefinitionParserRuleCall_5());
		}
		this_PropertyDefinition_5=rulePropertyDefinition
		{
			$current = $this_PropertyDefinition_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPackageElementAccess().getPropertySetParserRuleCall_6());
		}
		this_PropertySet_6=rulePropertySet
		{
			$current = $this_PropertySet_6.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPackageElementAccess().getWorkingsetParserRuleCall_7());
		}
		this_Workingset_7=ruleWorkingset
		{
			$current = $this_Workingset_7.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRulePropertyDefinition
entryRulePropertyDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPropertyDefinitionRule()); }
	iv_rulePropertyDefinition=rulePropertyDefinition
	{ $current=$iv_rulePropertyDefinition.current; }
	EOF;

// Rule PropertyDefinition
rulePropertyDefinition returns [EObject current=null]
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
					newLeafNode(lv_private_0_0, grammarAccess.getPropertyDefinitionAccess().getPrivatePrivateKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPropertyDefinitionRule());
					}
					setWithLastConsumed($current, "private", true, "private");
				}
			)
		)?
		otherlv_1='property'
		{
			newLeafNode(otherlv_1, grammarAccess.getPropertyDefinitionAccess().getPropertyKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getPropertyDefinitionAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPropertyDefinitionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3=':'
		{
			newLeafNode(otherlv_3, grammarAccess.getPropertyDefinitionAccess().getColonKeyword_3());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPropertyDefinitionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getTypeTypeCrossReference_4_0());
				}
				ruleQualifiedReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5='for'
			{
				newLeafNode(otherlv_5, grammarAccess.getPropertyDefinitionAccess().getForKeyword_5_0());
			}
			{
				/* */
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getPropertyDefinitionRule());
				}
				newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getAppliesToParserRuleCall_5_1());
			}
			this_AppliesTo_6=ruleAppliesTo[$current]
			{
				$current = $this_AppliesTo_6.current;
				afterParserOrEnumRuleCall();
			}
			(
				otherlv_7=','
				{
					newLeafNode(otherlv_7, grammarAccess.getPropertyDefinitionAccess().getCommaKeyword_5_2_0());
				}
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPropertyDefinitionRule());
					}
					newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getAppliesToParserRuleCall_5_2_1());
				}
				this_AppliesTo_8=ruleAppliesTo[$current]
				{
					$current = $this_AppliesTo_8.current;
					afterParserOrEnumRuleCall();
				}
			)*
		)?
		(
			otherlv_9=';'
			{
				newLeafNode(otherlv_9, grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_6());
			}
		)?
	)
;


// Rule AppliesTo
ruleAppliesTo[EObject in_current]  returns [EObject current=in_current]
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
					newCompositeNode(grammarAccess.getAppliesToAccess().getComponentCategoriesComponentCategoryParserRuleCall_0_0());
				}
				lv_componentCategories_0_0=ruleComponentCategory
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAppliesToRule());
					}
					add(
						$current,
						"componentCategories",
						lv_componentCategories_0_0,
						"org.osate.xtext.aadlv3.AadlV3.ComponentCategory");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getAppliesToAccess().getFeatureCategoriesFeatureCategoryParserRuleCall_1_0());
				}
				lv_featureCategories_1_0=ruleFeatureCategory
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAppliesToRule());
					}
					add(
						$current,
						"featureCategories",
						lv_featureCategories_1_0,
						"org.osate.xtext.aadlv3.AadlV3.FeatureCategory");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getAppliesToAccess().getAssociationTypesAssociationTypeParserRuleCall_2_0());
				}
				lv_associationTypes_2_0=ruleAssociationType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAppliesToRule());
					}
					add(
						$current,
						"associationTypes",
						lv_associationTypes_2_0,
						"org.osate.xtext.aadlv3.AadlV3.AssociationType");
					afterParserOrEnumRuleCall();
				}
			)
		)
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
		(
			(
				lv_private_0_0='private'
				{
					newLeafNode(lv_private_0_0, grammarAccess.getPropertySetAccess().getPrivatePrivateKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPropertySetRule());
					}
					setWithLastConsumed($current, "private", true, "private");
				}
			)
		)?
		otherlv_1='properties'
		{
			newLeafNode(otherlv_1, grammarAccess.getPropertySetAccess().getPropertiesKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getPropertySetAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPropertySetRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3=':'
		{
			newLeafNode(otherlv_3, grammarAccess.getPropertySetAccess().getColonKeyword_3());
		}
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getPropertySetAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPropertySetRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getPropertySetAccess().getPropertiesPropertyDefinitionCrossReference_5_0());
				}
				ruleQualifiedReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_6=','
			{
				newLeafNode(otherlv_6, grammarAccess.getPropertySetAccess().getCommaKeyword_6_0());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPropertySetRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getPropertySetAccess().getPropertiesPropertyDefinitionCrossReference_6_1_0());
					}
					ruleQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getPropertySetAccess().getRightCurlyBracketKeyword_7());
		}
		(
			otherlv_9=';'
			{
				newLeafNode(otherlv_9, grammarAccess.getPropertySetAccess().getSemicolonKeyword_8());
			}
		)?
	)
;

// Entry rule entryRuleDataType
entryRuleDataType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDataTypeRule()); }
	iv_ruleDataType=ruleDataType
	{ $current=$iv_ruleDataType.current; }
	EOF;

// Rule DataType
ruleDataType returns [EObject current=null]
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
					newLeafNode(lv_private_0_0, grammarAccess.getDataTypeAccess().getPrivatePrivateKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDataTypeRule());
					}
					setWithLastConsumed($current, "private", true, "private");
				}
			)
		)?
		otherlv_1='type'
		{
			newLeafNode(otherlv_1, grammarAccess.getDataTypeAccess().getTypeKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDataTypeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			{
				/* */
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getDataTypeRule());
				}
				newCompositeNode(grammarAccess.getDataTypeAccess().getPropertiesBlockParserRuleCall_3());
			}
			this_PropertiesBlock_3=rulePropertiesBlock[$current]
			{
				$current = $this_PropertiesBlock_3.current;
				afterParserOrEnumRuleCall();
			}
		)?
		(
			otherlv_4=';'
			{
				newLeafNode(otherlv_4, grammarAccess.getDataTypeAccess().getSemicolonKeyword_4());
			}
		)?
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
					/* */
				}
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
		{
			/* */
		}
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
		(
			otherlv_0='is'
			{
				newLeafNode(otherlv_0, grammarAccess.getInterfaceBodyAccess().getIsKeyword_0_0());
			}
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInterfaceBodyRule());
					}
					newCompositeNode(grammarAccess.getInterfaceBodyAccess().getInterfaceElementParserRuleCall_0_1_0());
				}
				this_InterfaceElement_1=ruleInterfaceElement[$current]
				{
					$current = $this_InterfaceElement_1.current;
					afterParserOrEnumRuleCall();
				}
				(
					otherlv_2=';'
					{
						newLeafNode(otherlv_2, grammarAccess.getInterfaceBodyAccess().getSemicolonKeyword_0_1_1());
					}
				)?
			)+
		)?
		otherlv_3='end'
		{
			newLeafNode(otherlv_3, grammarAccess.getInterfaceBodyAccess().getEndKeyword_1());
		}
	)
;


// Rule InterfaceElement
ruleInterfaceElement[EObject in_current]  returns [EObject current=in_current]
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
					newCompositeNode(grammarAccess.getInterfaceElementAccess().getFeaturesFeatureParserRuleCall_0_0());
				}
				lv_features_0_0=ruleFeature
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInterfaceElementRule());
					}
					add(
						$current,
						"features",
						lv_features_0_0,
						"org.osate.xtext.aadlv3.AadlV3.Feature");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getInterfaceElementAccess().getFlowsFlowPathParserRuleCall_1_0());
				}
				lv_flows_1_0=ruleFlowPath
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInterfaceElementRule());
					}
					add(
						$current,
						"flows",
						lv_flows_1_0,
						"org.osate.xtext.aadlv3.AadlV3.FlowPath");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getInterfaceElementAccess().getFlowsFlowSourceParserRuleCall_2_0());
				}
				lv_flows_2_0=ruleFlowSource
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInterfaceElementRule());
					}
					add(
						$current,
						"flows",
						lv_flows_2_0,
						"org.osate.xtext.aadlv3.AadlV3.FlowSource");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getInterfaceElementAccess().getFlowsFlowSinkParserRuleCall_3_0());
				}
				lv_flows_3_0=ruleFlowSink
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInterfaceElementRule());
					}
					add(
						$current,
						"flows",
						lv_flows_3_0,
						"org.osate.xtext.aadlv3.AadlV3.FlowSink");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		{
			/* */
		}
		{
			if ($current==null) {
				$current = createModelElement(grammarAccess.getInterfaceElementRule());
			}
			newCompositeNode(grammarAccess.getInterfaceElementAccess().getUsePropsParserRuleCall_4());
		}
		this_UseProps_4=ruleUseProps[$current]
		{
			$current = $this_UseProps_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getInterfaceElementAccess().getPropertyAssociationsPropertyAssociationParserRuleCall_5_0());
				}
				lv_propertyAssociations_5_0=rulePropertyAssociation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInterfaceElementRule());
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
					newCompositeNode(grammarAccess.getComponentImplementationAccess().getNameDottedNameParserRuleCall_2_0());
				}
				lv_name_2_0=ruleDottedName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentImplementationRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.osate.xtext.aadlv3.AadlV3.DottedName");
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
					/* */
				}
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
		{
			/* */
		}
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
		(
			otherlv_0='is'
			{
				newLeafNode(otherlv_0, grammarAccess.getImplementationBodyAccess().getIsKeyword_0_0());
			}
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getImplementationBodyRule());
					}
					newCompositeNode(grammarAccess.getImplementationBodyAccess().getImplementationElementParserRuleCall_0_1_0());
				}
				this_ImplementationElement_1=ruleImplementationElement[$current]
				{
					$current = $this_ImplementationElement_1.current;
					afterParserOrEnumRuleCall();
				}
				(
					otherlv_2=';'
					{
						newLeafNode(otherlv_2, grammarAccess.getImplementationBodyAccess().getSemicolonKeyword_0_1_1());
					}
				)?
			)+
		)?
		otherlv_3='end'
		{
			newLeafNode(otherlv_3, grammarAccess.getImplementationBodyAccess().getEndKeyword_1());
		}
	)
;


// Rule ImplementationElement
ruleImplementationElement[EObject in_current]  returns [EObject current=in_current]
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
					newCompositeNode(grammarAccess.getImplementationElementAccess().getConnectionsConnectionParserRuleCall_0_0());
				}
				lv_connections_0_0=ruleConnection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImplementationElementRule());
					}
					add(
						$current,
						"connections",
						lv_connections_0_0,
						"org.osate.xtext.aadlv3.AadlV3.Connection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getImplementationElementAccess().getConnectionsFeatureDelegateParserRuleCall_1_0());
				}
				lv_connections_1_0=ruleFeatureDelegate
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImplementationElementRule());
					}
					add(
						$current,
						"connections",
						lv_connections_1_0,
						"org.osate.xtext.aadlv3.AadlV3.FeatureDelegate");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getImplementationElementAccess().getBindingsBindingParserRuleCall_2_0());
				}
				lv_bindings_2_0=ruleBinding
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImplementationElementRule());
					}
					add(
						$current,
						"bindings",
						lv_bindings_2_0,
						"org.osate.xtext.aadlv3.AadlV3.Binding");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getImplementationElementAccess().getComponentsComponentParserRuleCall_3_0());
				}
				lv_components_3_0=ruleComponent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImplementationElementRule());
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
					newCompositeNode(grammarAccess.getImplementationElementAccess().getPathsPathParserRuleCall_4_0());
				}
				lv_paths_4_0=rulePath
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImplementationElementRule());
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
					newCompositeNode(grammarAccess.getImplementationElementAccess().getFlowAssignmentsFlowAssignmentParserRuleCall_5_0());
				}
				lv_flowAssignments_5_0=ruleFlowAssignment
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImplementationElementRule());
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
					newCompositeNode(grammarAccess.getImplementationElementAccess().getConfigurationAssignmentsConfigurationAssignmentParserRuleCall_6_0());
				}
				lv_configurationAssignments_6_0=ruleConfigurationAssignment
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImplementationElementRule());
					}
					add(
						$current,
						"configurationAssignments",
						lv_configurationAssignments_6_0,
						"org.osate.xtext.aadlv3.AadlV3.ConfigurationAssignment");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getImplementationElementAccess().getConfigurationAssignmentsConfigurationAssignmentPatternParserRuleCall_7_0());
				}
				lv_configurationAssignments_7_0=ruleConfigurationAssignmentPattern
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImplementationElementRule());
					}
					add(
						$current,
						"configurationAssignments",
						lv_configurationAssignments_7_0,
						"org.osate.xtext.aadlv3.AadlV3.ConfigurationAssignmentPattern");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getImplementationElementAccess().getPropertyAssociationsPropertyAssociationParserRuleCall_8_0());
				}
				lv_propertyAssociations_8_0=rulePropertyAssociation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImplementationElementRule());
					}
					add(
						$current,
						"propertyAssociations",
						lv_propertyAssociations_8_0,
						"org.osate.xtext.aadlv3.AadlV3.PropertyAssociation");
					afterParserOrEnumRuleCall();
				}
			)
		)
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
					newCompositeNode(grammarAccess.getComponentConfigurationAccess().getNameDottedNameParserRuleCall_2_0());
				}
				lv_name_2_0=ruleDottedName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentConfigurationRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.osate.xtext.aadlv3.AadlV3.DottedName");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			{
				/* */
			}
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
		(
			otherlv_4='extends'
			{
				newLeafNode(otherlv_4, grammarAccess.getComponentConfigurationAccess().getExtendsKeyword_4_0());
			}
			{
				/* */
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getComponentConfigurationRule());
				}
				newCompositeNode(grammarAccess.getComponentConfigurationAccess().getConfigurationExtensionsParserRuleCall_4_1());
			}
			this_ConfigurationExtensions_5=ruleConfigurationExtensions[$current]
			{
				$current = $this_ConfigurationExtensions_5.current;
				afterParserOrEnumRuleCall();
			}
		)?
		{
			/* */
		}
		{
			if ($current==null) {
				$current = createModelElement(grammarAccess.getComponentConfigurationRule());
			}
			newCompositeNode(grammarAccess.getComponentConfigurationAccess().getConfigurationElementBlockParserRuleCall_5());
		}
		this_ConfigurationElementBlock_6=ruleConfigurationElementBlock[$current]
		{
			$current = $this_ConfigurationElementBlock_6.current;
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
				{
					newCompositeNode(grammarAccess.getFeatureAccess().getCategoryFeatureCategoryParserRuleCall_3_0());
				}
				lv_category_3_0=ruleFeatureCategory
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureRule());
					}
					set(
						$current,
						"category",
						lv_category_3_0,
						"org.osate.xtext.aadlv3.AadlV3.FeatureCategory");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFeatureAccess().getTypeReferenceReversableTypeReferenceParserRuleCall_4_0());
				}
				lv_typeReference_4_0=ruleReversableTypeReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureRule());
					}
					set(
						$current,
						"typeReference",
						lv_typeReference_4_0,
						"org.osate.xtext.aadlv3.AadlV3.ReversableTypeReference");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			{
				/* */
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getFeatureRule());
				}
				newCompositeNode(grammarAccess.getFeatureAccess().getPropertiesBlockParserRuleCall_5());
			}
			this_PropertiesBlock_5=rulePropertiesBlock[$current]
			{
				$current = $this_PropertiesBlock_5.current;
				afterParserOrEnumRuleCall();
			}
		)?
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
					newCompositeNode(grammarAccess.getComponentAccess().getTypeReferencesTypeReferenceParserRuleCall_3_0());
				}
				lv_typeReferences_3_0=ruleTypeReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentRule());
					}
					add(
						$current,
						"typeReferences",
						lv_typeReferences_3_0,
						"org.osate.xtext.aadlv3.AadlV3.TypeReference");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			{
				/* */
			}
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
		(
			otherlv_4='->'
			{
				newLeafNode(otherlv_4, grammarAccess.getConnectionAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
			}
			    |
			(
				(
					lv_bidirectional_5_0='<->'
					{
						newLeafNode(lv_bidirectional_5_0, grammarAccess.getConnectionAccess().getBidirectionalLessThanSignHyphenMinusGreaterThanSignKeyword_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getConnectionRule());
						}
						setWithLastConsumed($current, "bidirectional", true, "<->");
					}
				)
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getConnectionAccess().getDestinationModelElementReferenceParserRuleCall_5_0());
				}
				lv_destination_6_0=ruleModelElementReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConnectionRule());
					}
					set(
						$current,
						"destination",
						lv_destination_6_0,
						"org.osate.xtext.aadlv3.AadlV3.ModelElementReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			{
				/* */
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getConnectionRule());
				}
				newCompositeNode(grammarAccess.getConnectionAccess().getPropertiesBlockParserRuleCall_6());
			}
			this_PropertiesBlock_7=rulePropertiesBlock[$current]
			{
				$current = $this_PropertiesBlock_7.current;
				afterParserOrEnumRuleCall();
			}
		)?
	)
;

// Entry rule entryRuleFeatureDelegate
entryRuleFeatureDelegate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFeatureDelegateRule()); }
	iv_ruleFeatureDelegate=ruleFeatureDelegate
	{ $current=$iv_ruleFeatureDelegate.current; }
	EOF;

// Rule FeatureDelegate
ruleFeatureDelegate returns [EObject current=null]
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
					newLeafNode(lv_name_0_0, grammarAccess.getFeatureDelegateAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFeatureDelegateRule());
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
			newLeafNode(otherlv_1, grammarAccess.getFeatureDelegateAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFeatureDelegateAccess().getAssociationTypeDelegateTypeParserRuleCall_2_0());
				}
				lv_associationType_2_0=ruleDelegateType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureDelegateRule());
					}
					set(
						$current,
						"associationType",
						lv_associationType_2_0,
						"org.osate.xtext.aadlv3.AadlV3.DelegateType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFeatureDelegateAccess().getSourceModelElementReferenceParserRuleCall_3_0());
				}
				lv_source_3_0=ruleModelElementReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureDelegateRule());
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
			otherlv_4='->'
			{
				newLeafNode(otherlv_4, grammarAccess.getFeatureDelegateAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
			}
			    |
			(
				(
					lv_bidirectional_5_0='<->'
					{
						newLeafNode(lv_bidirectional_5_0, grammarAccess.getFeatureDelegateAccess().getBidirectionalLessThanSignHyphenMinusGreaterThanSignKeyword_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getFeatureDelegateRule());
						}
						setWithLastConsumed($current, "bidirectional", true, "<->");
					}
				)
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFeatureDelegateAccess().getDestinationModelElementReferenceParserRuleCall_5_0());
				}
				lv_destination_6_0=ruleModelElementReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureDelegateRule());
					}
					set(
						$current,
						"destination",
						lv_destination_6_0,
						"org.osate.xtext.aadlv3.AadlV3.ModelElementReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			{
				/* */
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getFeatureDelegateRule());
				}
				newCompositeNode(grammarAccess.getFeatureDelegateAccess().getPropertiesBlockParserRuleCall_6());
			}
			this_PropertiesBlock_7=rulePropertiesBlock[$current]
			{
				$current = $this_PropertiesBlock_7.current;
				afterParserOrEnumRuleCall();
			}
		)?
	)
;

// Entry rule entryRuleBinding
entryRuleBinding returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBindingRule()); }
	iv_ruleBinding=ruleBinding
	{ $current=$iv_ruleBinding.current; }
	EOF;

// Rule Binding
ruleBinding returns [EObject current=null]
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
					newLeafNode(lv_name_0_0, grammarAccess.getBindingAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBindingRule());
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
			newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBindingAccess().getAssociationTypeBindingTypeParserRuleCall_2_0());
				}
				lv_associationType_2_0=ruleBindingType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBindingRule());
					}
					set(
						$current,
						"associationType",
						lv_associationType_2_0,
						"org.osate.xtext.aadlv3.AadlV3.BindingType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getBindingAccess().getSourceModelElementReferenceParserRuleCall_3_0());
				}
				lv_source_3_0=ruleModelElementReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBindingRule());
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
			newLeafNode(otherlv_4, grammarAccess.getBindingAccess().getHyphenMinusGreaterThanSignKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBindingAccess().getDestinationModelElementReferenceParserRuleCall_5_0());
				}
				lv_destination_5_0=ruleModelElementReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBindingRule());
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
				/* */
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getBindingRule());
				}
				newCompositeNode(grammarAccess.getBindingAccess().getPropertiesBlockParserRuleCall_6());
			}
			this_PropertiesBlock_6=rulePropertiesBlock[$current]
			{
				$current = $this_PropertiesBlock_6.current;
				afterParserOrEnumRuleCall();
			}
		)?
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
				/* */
			}
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
				/* */
			}
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
				/* */
			}
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
	)
;


// Rule UseProps
ruleUseProps[EObject in_current]  returns [EObject current=in_current]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='use'
		{
			newLeafNode(otherlv_0, grammarAccess.getUsePropsAccess().getUseKeyword_0());
		}
		otherlv_1='properties'
		{
			newLeafNode(otherlv_1, grammarAccess.getUsePropsAccess().getPropertiesKeyword_1());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUsePropsRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getUsePropsAccess().getUsePropertiesPropertySetCrossReference_2_0());
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
				newLeafNode(otherlv_3, grammarAccess.getUsePropsAccess().getCommaKeyword_3_0());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getUsePropsRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getUsePropsAccess().getUsePropertiesPropertySetCrossReference_3_1_0());
					}
					ruleQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
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
			/* */
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
				/* */
			}
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
					/* */
				}
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
						/* */
					}
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
							/* */
						}
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
				(
					{
						newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0_0());
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
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_1_0());
					}
					lv_importedNamespace_2_0=ruleQualifiedName
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getImportRule());
						}
						set(
							$current,
							"importedNamespace",
							lv_importedNamespace_2_0,
							"org.osate.xtext.aadlv3.AadlV3.QualifiedName");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		(
			otherlv_3='as'
			{
				newLeafNode(otherlv_3, grammarAccess.getImportAccess().getAsKeyword_2_0());
			}
			(
				(
					lv_alias_4_0=RULE_ID
					{
						newLeafNode(lv_alias_4_0, grammarAccess.getImportAccess().getAliasIDTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getImportRule());
						}
						setWithLastConsumed(
							$current,
							"alias",
							lv_alias_4_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)?
		(
			otherlv_5=';'
			{
				newLeafNode(otherlv_5, grammarAccess.getImportAccess().getSemicolonKeyword_3());
			}
		)?
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
							newCompositeNode(grammarAccess.getConfigurationAssignmentAccess().getAssignedClassifiersTypeReferenceParserRuleCall_2_0_0_0());
						}
						lv_assignedClassifiers_2_0=ruleTypeReference
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getConfigurationAssignmentRule());
							}
							add(
								$current,
								"assignedClassifiers",
								lv_assignedClassifiers_2_0,
								"org.osate.xtext.aadlv3.AadlV3.TypeReference");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					otherlv_3=','
					{
						newLeafNode(otherlv_3, grammarAccess.getConfigurationAssignmentAccess().getCommaKeyword_2_0_1_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getConfigurationAssignmentAccess().getAssignedClassifiersTypeReferenceParserRuleCall_2_0_1_1_0());
							}
							lv_assignedClassifiers_4_0=ruleTypeReference
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getConfigurationAssignmentRule());
								}
								add(
									$current,
									"assignedClassifiers",
									lv_assignedClassifiers_4_0,
									"org.osate.xtext.aadlv3.AadlV3.TypeReference");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)*
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getConfigurationAssignmentRule());
						}
						newCompositeNode(grammarAccess.getConfigurationAssignmentAccess().getCurlyConfigurationElementBlockParserRuleCall_2_0_2());
					}
					this_CurlyConfigurationElementBlock_5=ruleCurlyConfigurationElementBlock[$current]
					{
						$current = $this_CurlyConfigurationElementBlock_5.current;
						afterParserOrEnumRuleCall();
					}
				)?
			)
			    |
			{
				/* */
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getConfigurationAssignmentRule());
				}
				newCompositeNode(grammarAccess.getConfigurationAssignmentAccess().getCurlyConfigurationElementBlockParserRuleCall_2_1());
			}
			this_CurlyConfigurationElementBlock_6=ruleCurlyConfigurationElementBlock[$current]
			{
				$current = $this_CurlyConfigurationElementBlock_6.current;
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleConfigurationAssignmentPattern
entryRuleConfigurationAssignmentPattern returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConfigurationAssignmentPatternRule()); }
	iv_ruleConfigurationAssignmentPattern=ruleConfigurationAssignmentPattern
	{ $current=$iv_ruleConfigurationAssignmentPattern.current; }
	EOF;

// Rule ConfigurationAssignmentPattern
ruleConfigurationAssignmentPattern returns [EObject current=null]
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
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConfigurationAssignmentPatternRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getConfigurationAssignmentPatternAccess().getTargetPatternTypeCrossReference_0_0());
				}
				ruleQualifiedTypesReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='*=>'
		{
			newLeafNode(otherlv_1, grammarAccess.getConfigurationAssignmentPatternAccess().getAsteriskEqualsSignGreaterThanSignKeyword_1());
		}
		(
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getConfigurationAssignmentPatternAccess().getAssignedClassifiersTypeReferenceParserRuleCall_2_0_0_0());
						}
						lv_assignedClassifiers_2_0=ruleTypeReference
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getConfigurationAssignmentPatternRule());
							}
							add(
								$current,
								"assignedClassifiers",
								lv_assignedClassifiers_2_0,
								"org.osate.xtext.aadlv3.AadlV3.TypeReference");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					otherlv_3=','
					{
						newLeafNode(otherlv_3, grammarAccess.getConfigurationAssignmentPatternAccess().getCommaKeyword_2_0_1_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getConfigurationAssignmentPatternAccess().getAssignedClassifiersTypeReferenceParserRuleCall_2_0_1_1_0());
							}
							lv_assignedClassifiers_4_0=ruleTypeReference
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getConfigurationAssignmentPatternRule());
								}
								add(
									$current,
									"assignedClassifiers",
									lv_assignedClassifiers_4_0,
									"org.osate.xtext.aadlv3.AadlV3.TypeReference");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)*
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getConfigurationAssignmentPatternRule());
						}
						newCompositeNode(grammarAccess.getConfigurationAssignmentPatternAccess().getCurlyConfigurationElementBlockParserRuleCall_2_0_2());
					}
					this_CurlyConfigurationElementBlock_5=ruleCurlyConfigurationElementBlock[$current]
					{
						$current = $this_CurlyConfigurationElementBlock_5.current;
						afterParserOrEnumRuleCall();
					}
				)?
			)
			    |
			{
				/* */
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getConfigurationAssignmentPatternRule());
				}
				newCompositeNode(grammarAccess.getConfigurationAssignmentPatternAccess().getCurlyConfigurationElementBlockParserRuleCall_2_1());
			}
			this_CurlyConfigurationElementBlock_6=ruleCurlyConfigurationElementBlock[$current]
			{
				$current = $this_CurlyConfigurationElementBlock_6.current;
				afterParserOrEnumRuleCall();
			}
		)
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
					newCompositeNode(grammarAccess.getPropertyAssociationAccess().getTargetModelElementReferenceParserRuleCall_0_0());
				}
				lv_target_0_0=ruleModelElementReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPropertyAssociationRule());
					}
					set(
						$current,
						"target",
						lv_target_0_0,
						"org.osate.xtext.aadlv3.AadlV3.ModelElementReference");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_1='#'
		{
			newLeafNode(otherlv_1, grammarAccess.getPropertyAssociationAccess().getNumberSignKeyword_1());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPropertyAssociationRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getPropertyAssociationAccess().getPropertyPropertyDefinitionCrossReference_2_0());
				}
				ruleQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getPropertyAssociationAccess().getPropertyAssociationTypePropertyAssociationTypeParserRuleCall_3_0());
				}
				lv_propertyAssociationType_3_0=rulePropertyAssociationType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPropertyAssociationRule());
					}
					set(
						$current,
						"propertyAssociationType",
						lv_propertyAssociationType_3_0,
						"org.osate.xtext.aadlv3.AadlV3.PropertyAssociationType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getPropertyAssociationAccess().getValuePropertyValueParserRuleCall_4_0());
				}
				lv_value_4_0=rulePropertyValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPropertyAssociationRule());
					}
					set(
						$current,
						"value",
						lv_value_4_0,
						"org.osate.xtext.aadlv3.AadlV3.PropertyValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
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
			(
				lv_value_0_0=RULE_INT
				{
					newLeafNode(lv_value_0_0, grammarAccess.getPropertyValueAccess().getValueINTTerminalRuleCall_0_0());
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
		(
			(
				lv_unit_1_0=RULE_ID
				{
					newLeafNode(lv_unit_1_0, grammarAccess.getPropertyValueAccess().getUnitIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPropertyValueRule());
					}
					setWithLastConsumed(
						$current,
						"unit",
						lv_unit_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)?
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
					/* */
				}
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
			('.')=>
			(
				(
					{
						/* */
					}
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
							/* */
						}
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


// Rule ConfigurationElementBlock
ruleConfigurationElementBlock[EObject in_current]  returns [EObject current=in_current]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='is'
			{
				newLeafNode(otherlv_0, grammarAccess.getConfigurationElementBlockAccess().getIsKeyword_0_0());
			}
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConfigurationElementBlockRule());
					}
					newCompositeNode(grammarAccess.getConfigurationElementBlockAccess().getConfigurationElementParserRuleCall_0_1_0());
				}
				this_ConfigurationElement_1=ruleConfigurationElement[$current]
				{
					$current = $this_ConfigurationElement_1.current;
					afterParserOrEnumRuleCall();
				}
				(
					otherlv_2=';'
					{
						newLeafNode(otherlv_2, grammarAccess.getConfigurationElementBlockAccess().getSemicolonKeyword_0_1_1());
					}
				)?
			)+
		)?
		otherlv_3='end'
		{
			newLeafNode(otherlv_3, grammarAccess.getConfigurationElementBlockAccess().getEndKeyword_1());
		}
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
		{
			/* */
		}
		{
			if ($current==null) {
				$current = createModelElement(grammarAccess.getCurlyConfigurationElementBlockRule());
			}
			newCompositeNode(grammarAccess.getCurlyConfigurationElementBlockAccess().getConfigurationElementParserRuleCall_1());
		}
		this_ConfigurationElement_1=ruleConfigurationElement[$current]
		{
			$current = $this_ConfigurationElement_1.current;
			afterParserOrEnumRuleCall();
		}
		(
			otherlv_2=';'
			{
				newLeafNode(otherlv_2, grammarAccess.getCurlyConfigurationElementBlockAccess().getSemicolonKeyword_2_0());
			}
			{
				/* */
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getCurlyConfigurationElementBlockRule());
				}
				newCompositeNode(grammarAccess.getCurlyConfigurationElementBlockAccess().getConfigurationElementParserRuleCall_2_1());
			}
			this_ConfigurationElement_3=ruleConfigurationElement[$current]
			{
				$current = $this_ConfigurationElement_3.current;
				afterParserOrEnumRuleCall();
			}
		)*
		(
			otherlv_4=';'
			{
				newLeafNode(otherlv_4, grammarAccess.getCurlyConfigurationElementBlockAccess().getSemicolonKeyword_3());
			}
		)?
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getCurlyConfigurationElementBlockAccess().getRightCurlyBracketKeyword_4());
		}
	)
;


// Rule ConfigurationElement
ruleConfigurationElement[EObject in_current]  returns [EObject current=in_current]
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
					newCompositeNode(grammarAccess.getConfigurationElementAccess().getPropertyAssociationsPropertyAssociationParserRuleCall_0_0());
				}
				lv_propertyAssociations_0_0=rulePropertyAssociation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConfigurationElementRule());
					}
					add(
						$current,
						"propertyAssociations",
						lv_propertyAssociations_0_0,
						"org.osate.xtext.aadlv3.AadlV3.PropertyAssociation");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getConfigurationElementAccess().getBindingsBindingParserRuleCall_1_0());
				}
				lv_bindings_1_0=ruleBinding
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConfigurationElementRule());
					}
					add(
						$current,
						"bindings",
						lv_bindings_1_0,
						"org.osate.xtext.aadlv3.AadlV3.Binding");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getConfigurationElementAccess().getConfigurationAssignmentsConfigurationAssignmentParserRuleCall_2_0());
				}
				lv_configurationAssignments_2_0=ruleConfigurationAssignment
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConfigurationElementRule());
					}
					add(
						$current,
						"configurationAssignments",
						lv_configurationAssignments_2_0,
						"org.osate.xtext.aadlv3.AadlV3.ConfigurationAssignment");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getConfigurationElementAccess().getConfigurationAssignmentsConfigurationAssignmentPatternParserRuleCall_3_0());
				}
				lv_configurationAssignments_3_0=ruleConfigurationAssignmentPattern
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConfigurationElementRule());
					}
					add(
						$current,
						"configurationAssignments",
						lv_configurationAssignments_3_0,
						"org.osate.xtext.aadlv3.AadlV3.ConfigurationAssignmentPattern");
					afterParserOrEnumRuleCall();
				}
			)
		)
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
					/* */
				}
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
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReversableInterfaceReferenceRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getReversableInterfaceReferenceAccess().getTypeComponentInterfaceCrossReference_1_0());
				}
				ruleQualifiedReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleReversableTypeReference
entryRuleReversableTypeReference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getReversableTypeReferenceRule()); }
	iv_ruleReversableTypeReference=ruleReversableTypeReference
	{ $current=$iv_ruleReversableTypeReference.current; }
	EOF;

// Rule ReversableTypeReference
ruleReversableTypeReference returns [EObject current=null]
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
					newLeafNode(lv_reverse_0_0, grammarAccess.getReversableTypeReferenceAccess().getReverseReverseKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReversableTypeReferenceRule());
					}
					setWithLastConsumed($current, "reverse", true, "reverse");
				}
			)
		)?
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReversableTypeReferenceRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getReversableTypeReferenceAccess().getTypeTypeCrossReference_1_0());
				}
				ruleQualifiedReference
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
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTypeReferenceRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTypeReferenceAccess().getTypeTypeCrossReference_0_0());
				}
				ruleQualifiedTypesReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			{
				/* */
			}
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

// Entry rule entryRuleRealizationReference
entryRuleRealizationReference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRealizationReferenceRule()); }
	iv_ruleRealizationReference=ruleRealizationReference
	{ $current=$iv_ruleRealizationReference.current; }
	EOF;

// Rule RealizationReference
ruleRealizationReference returns [EObject current=null]
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
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRealizationReferenceRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getRealizationReferenceAccess().getTypeComponentRealizationCrossReference_0_0());
				}
				ruleQualifiedDottedReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			{
				/* */
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getRealizationReferenceRule());
				}
				newCompositeNode(grammarAccess.getRealizationReferenceAccess().getConfigurationActualsParserRuleCall_1());
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
				/* */
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getImplementationReferenceRule());
				}
			}
			{
				newCompositeNode(grammarAccess.getImplementationReferenceAccess().getTypeComponentImplementationCrossReference_0());
			}
			ruleQualifiedDottedReference
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
				(
					{
						newCompositeNode(grammarAccess.getPropertiesBlockAccess().getPropertyAssociationsPropertyAssociationParserRuleCall_1_0_0());
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
			)
			(
				otherlv_2=';'
				{
					newLeafNode(otherlv_2, grammarAccess.getPropertiesBlockAccess().getSemicolonKeyword_1_1());
				}
			)?
		)+
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getPropertiesBlockAccess().getRightCurlyBracketKeyword_2());
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
			{
				/* */
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getNestedComponentImplementationBlockRule());
				}
				newCompositeNode(grammarAccess.getNestedComponentImplementationBlockAccess().getNestedImplementationElementParserRuleCall_1_0());
			}
			this_NestedImplementationElement_1=ruleNestedImplementationElement[$current]
			{
				$current = $this_NestedImplementationElement_1.current;
				afterParserOrEnumRuleCall();
			}
			(
				otherlv_2=';'
				{
					newLeafNode(otherlv_2, grammarAccess.getNestedComponentImplementationBlockAccess().getSemicolonKeyword_1_1());
				}
			)?
		)+
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getNestedComponentImplementationBlockAccess().getRightCurlyBracketKeyword_2());
		}
	)
;


// Rule NestedImplementationElement
ruleNestedImplementationElement[EObject in_current]  returns [EObject current=in_current]
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
					newCompositeNode(grammarAccess.getNestedImplementationElementAccess().getFeaturesFeatureParserRuleCall_0_0());
				}
				lv_features_0_0=ruleFeature
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNestedImplementationElementRule());
					}
					add(
						$current,
						"features",
						lv_features_0_0,
						"org.osate.xtext.aadlv3.AadlV3.Feature");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getNestedImplementationElementAccess().getConnectionsConnectionParserRuleCall_1_0());
				}
				lv_connections_1_0=ruleConnection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNestedImplementationElementRule());
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
					newCompositeNode(grammarAccess.getNestedImplementationElementAccess().getConnectionsFeatureDelegateParserRuleCall_2_0());
				}
				lv_connections_2_0=ruleFeatureDelegate
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNestedImplementationElementRule());
					}
					add(
						$current,
						"connections",
						lv_connections_2_0,
						"org.osate.xtext.aadlv3.AadlV3.FeatureDelegate");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getNestedImplementationElementAccess().getBindingsBindingParserRuleCall_3_0());
				}
				lv_bindings_3_0=ruleBinding
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNestedImplementationElementRule());
					}
					add(
						$current,
						"bindings",
						lv_bindings_3_0,
						"org.osate.xtext.aadlv3.AadlV3.Binding");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getNestedImplementationElementAccess().getComponentsComponentParserRuleCall_4_0());
				}
				lv_components_4_0=ruleComponent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNestedImplementationElementRule());
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
					newCompositeNode(grammarAccess.getNestedImplementationElementAccess().getPropertyAssociationsPropertyAssociationParserRuleCall_5_0());
				}
				lv_propertyAssociations_5_0=rulePropertyAssociation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNestedImplementationElementRule());
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
	)
;


// Rule ConfigurationExtensions
ruleConfigurationExtensions[EObject in_current]  returns [EObject current=in_current]
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
					newCompositeNode(grammarAccess.getConfigurationExtensionsAccess().getSuperClassifiersRealizationReferenceParserRuleCall_0_0());
				}
				lv_superClassifiers_0_0=ruleRealizationReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConfigurationExtensionsRule());
					}
					add(
						$current,
						"superClassifiers",
						lv_superClassifiers_0_0,
						"org.osate.xtext.aadlv3.AadlV3.RealizationReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1=','
			{
				newLeafNode(otherlv_1, grammarAccess.getConfigurationExtensionsAccess().getCommaKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getConfigurationExtensionsAccess().getSuperClassifiersRealizationReferenceParserRuleCall_1_1_0());
					}
					lv_superClassifiers_2_0=ruleRealizationReference
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConfigurationExtensionsRule());
						}
						add(
							$current,
							"superClassifiers",
							lv_superClassifiers_2_0,
							"org.osate.xtext.aadlv3.AadlV3.RealizationReference");
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
					/* */
				}
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
					newCompositeNode(grammarAccess.getConfigurationActualAccess().getAssignedClassifiersTypeReferenceParserRuleCall_2_0());
				}
				lv_assignedClassifiers_2_0=ruleTypeReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConfigurationActualRule());
					}
					add(
						$current,
						"assignedClassifiers",
						lv_assignedClassifiers_2_0,
						"org.osate.xtext.aadlv3.AadlV3.TypeReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3=','
			{
				newLeafNode(otherlv_3, grammarAccess.getConfigurationActualAccess().getCommaKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getConfigurationActualAccess().getAssignedClassifiersTypeReferenceParserRuleCall_3_1_0());
					}
					lv_assignedClassifiers_4_0=ruleTypeReference
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConfigurationActualRule());
						}
						add(
							$current,
							"assignedClassifiers",
							lv_assignedClassifiers_4_0,
							"org.osate.xtext.aadlv3.AadlV3.TypeReference");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
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
		(
			(
				lv_private_0_0='private'
				{
					newLeafNode(lv_private_0_0, grammarAccess.getWorkingsetAccess().getPrivatePrivateKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWorkingsetRule());
					}
					setWithLastConsumed($current, "private", true, "private");
				}
			)
		)?
		otherlv_1='workingset'
		{
			newLeafNode(otherlv_1, grammarAccess.getWorkingsetAccess().getWorkingsetKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWorkingsetAccess().getNameQualifiedNameParserRuleCall_2_0());
				}
				lv_name_2_0=ruleQualifiedName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWorkingsetRule());
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
		otherlv_3='is'
		{
			newLeafNode(otherlv_3, grammarAccess.getWorkingsetAccess().getIsKeyword_3());
		}
		(
			{
				/* */
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getWorkingsetRule());
				}
				newCompositeNode(grammarAccess.getWorkingsetAccess().getUsePropsParserRuleCall_4());
			}
			this_UseProps_4=ruleUseProps[$current]
			{
				$current = $this_UseProps_4.current;
				afterParserOrEnumRuleCall();
			}
		)?
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getWorkingsetAccess().getRootComponentsComponentParserRuleCall_5_0_0());
					}
					lv_rootComponents_5_0=ruleComponent
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getWorkingsetRule());
						}
						add(
							$current,
							"rootComponents",
							lv_rootComponents_5_0,
							"org.osate.xtext.aadlv3.AadlV3.Component");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_6=';'
				{
					newLeafNode(otherlv_6, grammarAccess.getWorkingsetAccess().getSemicolonKeyword_5_1());
				}
			)?
		)*
		otherlv_7='end'
		{
			newLeafNode(otherlv_7, grammarAccess.getWorkingsetAccess().getEndKeyword_6());
		}
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
		kw='::*'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getColonColonAsteriskKeyword_1());
		}
	)
;

// Entry rule entryRuleDottedName
entryRuleDottedName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDottedNameRule()); }
	iv_ruleDottedName=ruleDottedName
	{ $current=$iv_ruleDottedName.current.getText(); }
	EOF;

// Rule DottedName
ruleDottedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
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
			newLeafNode(this_ID_0, grammarAccess.getDottedNameAccess().getIDTerminalRuleCall_0());
		}
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDottedNameAccess().getFullStopKeyword_1());
		}
		this_ID_2=RULE_ID
		{
			$current.merge(this_ID_2);
		}
		{
			newLeafNode(this_ID_2, grammarAccess.getDottedNameAccess().getIDTerminalRuleCall_2());
		}
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
			kw='::'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0());
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

// Entry rule entryRuleQualifiedTypesReference
entryRuleQualifiedTypesReference returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedTypesReferenceRule()); }
	iv_ruleQualifiedTypesReference=ruleQualifiedTypesReference
	{ $current=$iv_ruleQualifiedTypesReference.current.getText(); }
	EOF;

// Rule QualifiedTypesReference
ruleQualifiedTypesReference returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getQualifiedTypesReferenceAccess().getQualifiedNameParserRuleCall_0());
		}
		this_QualifiedName_0=ruleQualifiedName
		{
			$current.merge(this_QualifiedName_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedTypesReferenceAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getQualifiedTypesReferenceAccess().getIDTerminalRuleCall_1_1());
			}
		)?
	)
;

// Entry rule entryRuleQualifiedReference
entryRuleQualifiedReference returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedReferenceRule()); }
	iv_ruleQualifiedReference=ruleQualifiedReference
	{ $current=$iv_ruleQualifiedReference.current.getText(); }
	EOF;

// Rule QualifiedReference
ruleQualifiedReference returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getQualifiedReferenceAccess().getQualifiedNameParserRuleCall());
	}
	this_QualifiedName_0=ruleQualifiedName
	{
		$current.merge(this_QualifiedName_0);
	}
	{
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleQualifiedDottedReference
entryRuleQualifiedDottedReference returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedDottedReferenceRule()); }
	iv_ruleQualifiedDottedReference=ruleQualifiedDottedReference
	{ $current=$iv_ruleQualifiedDottedReference.current.getText(); }
	EOF;

// Rule QualifiedDottedReference
ruleQualifiedDottedReference returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getQualifiedDottedReferenceAccess().getQualifiedNameParserRuleCall_0());
		}
		this_QualifiedName_0=ruleQualifiedName
		{
			$current.merge(this_QualifiedName_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getQualifiedDottedReferenceAccess().getFullStopKeyword_1());
		}
		this_ID_2=RULE_ID
		{
			$current.merge(this_ID_2);
		}
		{
			newLeafNode(this_ID_2, grammarAccess.getQualifiedDottedReferenceAccess().getIDTerminalRuleCall_2());
		}
	)
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
		kw='abstract'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getAbstractKeyword_0());
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
		{
			newCompositeNode(grammarAccess.getFeatureCategoryAccess().getDataAccessKeywordsParserRuleCall_2());
		}
		this_DataAccessKeywords_2=ruleDataAccessKeywords
		{
			$current.merge(this_DataAccessKeywords_2);
		}
		{
			afterParserOrEnumRuleCall();
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
		{
			newCompositeNode(grammarAccess.getFeatureCategoryAccess().getVirtualBusAccessKeywordsParserRuleCall_4());
		}
		this_VirtualBusAccessKeywords_4=ruleVirtualBusAccessKeywords
		{
			$current.merge(this_VirtualBusAccessKeywords_4);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFeatureCategoryAccess().getSubprogramAccessKeywordsParserRuleCall_5());
		}
		this_SubprogramAccessKeywords_5=ruleSubprogramAccessKeywords
		{
			$current.merge(this_SubprogramAccessKeywords_5);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFeatureCategoryAccess().getSubprogramGroupAccessKeywordsParserRuleCall_6());
		}
		this_SubprogramGroupAccessKeywords_6=ruleSubprogramGroupAccessKeywords
		{
			$current.merge(this_SubprogramGroupAccessKeywords_6);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFeatureCategoryAccess().getBindingPointKeywordsParserRuleCall_7());
		}
		this_BindingPointKeywords_7=ruleBindingPointKeywords
		{
			$current.merge(this_BindingPointKeywords_7);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		kw='interface'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getFeatureCategoryAccess().getInterfaceKeyword_8());
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

// Entry rule entryRuleAssociationType
entryRuleAssociationType returns [String current=null]:
	{ newCompositeNode(grammarAccess.getAssociationTypeRule()); }
	iv_ruleAssociationType=ruleAssociationType
	{ $current=$iv_ruleAssociationType.current.getText(); }
	EOF;

// Rule AssociationType
ruleAssociationType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAssociationTypeAccess().getConnectionTypeParserRuleCall_0());
		}
		this_ConnectionType_0=ruleConnectionType
		{
			$current.merge(this_ConnectionType_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAssociationTypeAccess().getBindingTypeParserRuleCall_1());
		}
		this_BindingType_1=ruleBindingType
		{
			$current.merge(this_BindingType_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAssociationTypeAccess().getDelegateTypeParserRuleCall_2());
		}
		this_DelegateType_2=ruleDelegateType
		{
			$current.merge(this_DelegateType_2);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAssociationTypeAccess().getFlowTypeParserRuleCall_3());
		}
		this_FlowType_3=ruleFlowType
		{
			$current.merge(this_FlowType_3);
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
	kw='connection'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getConnectionTypeAccess().getConnectionKeyword());
	}
;

// Entry rule entryRuleBindingType
entryRuleBindingType returns [String current=null]:
	{ newCompositeNode(grammarAccess.getBindingTypeRule()); }
	iv_ruleBindingType=ruleBindingType
	{ $current=$iv_ruleBindingType.current.getText(); }
	EOF;

// Rule BindingType
ruleBindingType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='binding'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getBindingTypeAccess().getBindingKeyword());
	}
;

// Entry rule entryRuleDelegateType
entryRuleDelegateType returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDelegateTypeRule()); }
	iv_ruleDelegateType=ruleDelegateType
	{ $current=$iv_ruleDelegateType.current.getText(); }
	EOF;

// Rule DelegateType
ruleDelegateType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='delegate'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getDelegateTypeAccess().getDelegateKeyword());
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

// Entry rule entryRuleFlowType
entryRuleFlowType returns [String current=null]:
	{ newCompositeNode(grammarAccess.getFlowTypeRule()); }
	iv_ruleFlowType=ruleFlowType
	{ $current=$iv_ruleFlowType.current.getText(); }
	EOF;

// Rule FlowType
ruleFlowType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='flow'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getFlowTypeAccess().getFlowKeyword());
	}
;

// Entry rule entryRulePropertyAssociationType
entryRulePropertyAssociationType returns [String current=null]:
	{ newCompositeNode(grammarAccess.getPropertyAssociationTypeRule()); }
	iv_rulePropertyAssociationType=rulePropertyAssociationType
	{ $current=$iv_rulePropertyAssociationType.current.getText(); }
	EOF;

// Rule PropertyAssociationType
rulePropertyAssociationType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='=>'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getPropertyAssociationTypeAccess().getEqualsSignGreaterThanSignKeyword_0());
		}
		    |
		kw='*=>'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getPropertyAssociationTypeAccess().getAsteriskEqualsSignGreaterThanSignKeyword_1());
		}
		    |
		kw='>=>'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getPropertyAssociationTypeAccess().getGreaterThanSignEqualsSignGreaterThanSignKeyword_2());
		}
	)
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

// Entry rule entryRuleVirtualBusAccessKeywords
entryRuleVirtualBusAccessKeywords returns [String current=null]:
	{ newCompositeNode(grammarAccess.getVirtualBusAccessKeywordsRule()); }
	iv_ruleVirtualBusAccessKeywords=ruleVirtualBusAccessKeywords
	{ $current=$iv_ruleVirtualBusAccessKeywords.current.getText(); }
	EOF;

// Rule VirtualBusAccessKeywords
ruleVirtualBusAccessKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
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
			newLeafNode(kw, grammarAccess.getVirtualBusAccessKeywordsAccess().getVirtualKeyword_0());
		}
		kw='bus'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getVirtualBusAccessKeywordsAccess().getBusKeyword_1());
		}
		kw='access'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getVirtualBusAccessKeywordsAccess().getAccessKeyword_2());
		}
	)
;

// Entry rule entryRuleDataAccessKeywords
entryRuleDataAccessKeywords returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDataAccessKeywordsRule()); }
	iv_ruleDataAccessKeywords=ruleDataAccessKeywords
	{ $current=$iv_ruleDataAccessKeywords.current.getText(); }
	EOF;

// Rule DataAccessKeywords
ruleDataAccessKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='data'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDataAccessKeywordsAccess().getDataKeyword_0());
		}
		kw='access'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDataAccessKeywordsAccess().getAccessKeyword_1());
		}
	)
;

// Entry rule entryRuleSubprogramAccessKeywords
entryRuleSubprogramAccessKeywords returns [String current=null]:
	{ newCompositeNode(grammarAccess.getSubprogramAccessKeywordsRule()); }
	iv_ruleSubprogramAccessKeywords=ruleSubprogramAccessKeywords
	{ $current=$iv_ruleSubprogramAccessKeywords.current.getText(); }
	EOF;

// Rule SubprogramAccessKeywords
ruleSubprogramAccessKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
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
			newLeafNode(kw, grammarAccess.getSubprogramAccessKeywordsAccess().getSubprogramKeyword_0());
		}
		kw='access'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getSubprogramAccessKeywordsAccess().getAccessKeyword_1());
		}
	)
;

// Entry rule entryRuleSubprogramGroupAccessKeywords
entryRuleSubprogramGroupAccessKeywords returns [String current=null]:
	{ newCompositeNode(grammarAccess.getSubprogramGroupAccessKeywordsRule()); }
	iv_ruleSubprogramGroupAccessKeywords=ruleSubprogramGroupAccessKeywords
	{ $current=$iv_ruleSubprogramGroupAccessKeywords.current.getText(); }
	EOF;

// Rule SubprogramGroupAccessKeywords
ruleSubprogramGroupAccessKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
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
			newLeafNode(kw, grammarAccess.getSubprogramGroupAccessKeywordsAccess().getSubprogramKeyword_0());
		}
		kw='group'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getSubprogramGroupAccessKeywordsAccess().getGroupKeyword_1());
		}
		kw='access'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getSubprogramGroupAccessKeywordsAccess().getAccessKeyword_2());
		}
	)
;

// Entry rule entryRuleBindingPointKeywords
entryRuleBindingPointKeywords returns [String current=null]:
	{ newCompositeNode(grammarAccess.getBindingPointKeywordsRule()); }
	iv_ruleBindingPointKeywords=ruleBindingPointKeywords
	{ $current=$iv_ruleBindingPointKeywords.current.getText(); }
	EOF;

// Rule BindingPointKeywords
ruleBindingPointKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='binding'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBindingPointKeywordsAccess().getBindingKeyword_0());
		}
		kw='point'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBindingPointKeywordsAccess().getPointKeyword_1());
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
		kw='in'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getProvidesReadKeywordsAccess().getInKeyword_1());
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
		kw='in'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getRequiresReadKeywordsAccess().getInKeyword_1());
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
		kw='out'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getProvidesWriteKeywordsAccess().getOutKeyword_1());
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
		kw='out'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getRequiresWriteKeywordsAccess().getOutKeyword_1());
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
		kw='in'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getProvidesRWKeywordsAccess().getInKeyword_1());
		}
		kw='out'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getProvidesRWKeywordsAccess().getOutKeyword_2());
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
		kw='in'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getRequiresRWKeywordsAccess().getInKeyword_1());
		}
		kw='out'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getRequiresRWKeywordsAccess().getOutKeyword_2());
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
