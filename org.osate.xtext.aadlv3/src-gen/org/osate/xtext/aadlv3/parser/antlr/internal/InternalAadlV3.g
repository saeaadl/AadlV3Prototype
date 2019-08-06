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
import org.eclipse.emf.common.util.Enumerator;
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
		otherlv_3='is'
		{
			newLeafNode(otherlv_3, grammarAccess.getPackageDeclarationAccess().getIsKeyword_3());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsAnnexLibraryParserRuleCall_4_0_0());
					}
					lv_elements_4_0=ruleAnnexLibrary
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
						}
						add(
							$current,
							"elements",
							lv_elements_4_0,
							"org.osate.xtext.aadlv3.AadlV3.AnnexLibrary");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getPackageDeclarationAccess().getImportsImportParserRuleCall_4_1_0_0());
						}
						lv_imports_5_0=ruleImport
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
							}
							add(
								$current,
								"imports",
								lv_imports_5_0,
								"org.osate.xtext.aadlv3.AadlV3.Import");
							afterParserOrEnumRuleCall();
						}
					)
				)
				    |
				(
					(
						{
							newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsPackageElementParserRuleCall_4_1_1_0());
						}
						lv_elements_6_0=rulePackageElement
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
							}
							add(
								$current,
								"elements",
								lv_elements_6_0,
								"org.osate.xtext.aadlv3.AadlV3.PackageElement");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)
		otherlv_7='end'
		{
			newLeafNode(otherlv_7, grammarAccess.getPackageDeclarationAccess().getEndKeyword_5());
		}
		otherlv_8=';'
		{
			newLeafNode(otherlv_8, grammarAccess.getPackageDeclarationAccess().getSemicolonKeyword_6());
		}
	)
;

// Entry rule entryRuleAnnexLibrary
entryRuleAnnexLibrary returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAnnexLibraryRule()); }
	iv_ruleAnnexLibrary=ruleAnnexLibrary
	{ $current=$iv_ruleAnnexLibrary.current; }
	EOF;

// Rule AnnexLibrary
ruleAnnexLibrary returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='@'
		{
			newLeafNode(otherlv_0, grammarAccess.getAnnexLibraryAccess().getCommercialAtKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getAnnexLibraryAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAnnexLibraryRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.osate.expr.Expr.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getAnnexLibraryAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getAnnexLibraryAccess().getRightCurlyBracketKeyword_3());
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
			newCompositeNode(grammarAccess.getPackageElementAccess().getComponentInterfaceParserRuleCall_1());
		}
		this_ComponentInterface_1=ruleComponentInterface
		{
			$current = $this_ComponentInterface_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPackageElementAccess().getComponentImplementationParserRuleCall_2());
		}
		this_ComponentImplementation_2=ruleComponentImplementation
		{
			$current = $this_ComponentImplementation_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPackageElementAccess().getComponentConfigurationParserRuleCall_3());
		}
		this_ComponentConfiguration_3=ruleComponentConfiguration
		{
			$current = $this_ComponentConfiguration_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPackageElementAccess().getPropertyDefinitionParserRuleCall_4());
		}
		this_PropertyDefinition_4=rulePropertyDefinition
		{
			$current = $this_PropertyDefinition_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPackageElementAccess().getPropertySetParserRuleCall_5());
		}
		this_PropertySet_5=rulePropertySet
		{
			$current = $this_PropertySet_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPackageElementAccess().getWorkingsetParserRuleCall_6());
		}
		this_Workingset_6=ruleWorkingset
		{
			$current = $this_Workingset_6.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPackageElementAccess().getTypeDeclParserRuleCall_7());
		}
		this_TypeDecl_7=ruleTypeDecl
		{
			$current = $this_TypeDecl_7.current;
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
						"org.osate.expr.Expr.ID");
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
					newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getTypeClassifierOrTypeCrossReference_4_0());
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
			otherlv_6='('
			{
				newLeafNode(otherlv_6, grammarAccess.getPropertyDefinitionAccess().getLeftParenthesisKeyword_5_1());
			}
			(
				(
					(
						lv_forAll_7_0='all'
						{
							newLeafNode(lv_forAll_7_0, grammarAccess.getPropertyDefinitionAccess().getForAllAllKeyword_5_2_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getPropertyDefinitionRule());
							}
							setWithLastConsumed($current, "forAll", true, "all");
						}
					)
				)
				    |
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPropertyDefinitionRule());
						}
						newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getAppliesToParserRuleCall_5_2_1_0());
					}
					this_AppliesTo_8=ruleAppliesTo[$current]
					{
						$current = $this_AppliesTo_8.current;
						afterParserOrEnumRuleCall();
					}
					(
						otherlv_9=','
						{
							newLeafNode(otherlv_9, grammarAccess.getPropertyDefinitionAccess().getCommaKeyword_5_2_1_1_0());
						}
						{
							/* */
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getPropertyDefinitionRule());
							}
							newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getAppliesToParserRuleCall_5_2_1_1_1());
						}
						this_AppliesTo_10=ruleAppliesTo[$current]
						{
							$current = $this_AppliesTo_10.current;
							afterParserOrEnumRuleCall();
						}
					)*
				)
			)
			otherlv_11=')'
			{
				newLeafNode(otherlv_11, grammarAccess.getPropertyDefinitionAccess().getRightParenthesisKeyword_5_3());
			}
		)?
		otherlv_12=';'
		{
			newLeafNode(otherlv_12, grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_6());
		}
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
						"org.osate.expr.Expr.ID");
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
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getPropertySetAccess().getSemicolonKeyword_8());
		}
	)
;

// Entry rule entryRuleTypeDecl
entryRuleTypeDecl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeDeclRule()); }
	iv_ruleTypeDecl=ruleTypeDecl
	{ $current=$iv_ruleTypeDecl.current; }
	EOF;

// Rule TypeDecl
ruleTypeDecl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='type'
		{
			newLeafNode(otherlv_0, grammarAccess.getTypeDeclAccess().getTypeKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getTypeDeclAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTypeDeclRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.osate.expr.Expr.ID");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getTypeDeclAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTypeDeclAccess().getTypeTypeParserRuleCall_3_0());
				}
				lv_type_3_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTypeDeclRule());
					}
					set(
						$current,
						"type",
						lv_type_3_0,
						"org.osate.expr.Expr.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4='{'
			{
				newLeafNode(otherlv_4, grammarAccess.getTypeDeclAccess().getLeftCurlyBracketKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTypeDeclAccess().getOwnedPropertyAssociationsPropertyAssociationParserRuleCall_4_1_0());
					}
					lv_ownedPropertyAssociations_5_0=rulePropertyAssociation
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTypeDeclRule());
						}
						add(
							$current,
							"ownedPropertyAssociations",
							lv_ownedPropertyAssociations_5_0,
							"org.osate.xtext.aadlv3.AadlV3.PropertyAssociation");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_6=';'
				{
					newLeafNode(otherlv_6, grammarAccess.getTypeDeclAccess().getSemicolonKeyword_4_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getTypeDeclAccess().getOwnedPropertyAssociationsPropertyAssociationParserRuleCall_4_2_1_0());
						}
						lv_ownedPropertyAssociations_7_0=rulePropertyAssociation
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getTypeDeclRule());
							}
							add(
								$current,
								"ownedPropertyAssociations",
								lv_ownedPropertyAssociations_7_0,
								"org.osate.xtext.aadlv3.AadlV3.PropertyAssociation");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_8='}'
			{
				newLeafNode(otherlv_8, grammarAccess.getTypeDeclAccess().getRightCurlyBracketKeyword_4_3());
			}
		)?
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
				ruleQCREF
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
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getPropertyAssociationAccess().getSemicolonKeyword_5());
		}
	)
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
		kw='='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getPropertyAssociationTypeAccess().getEqualsSignKeyword_1());
		}
		    |
		kw='*=>'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getPropertyAssociationTypeAccess().getAsteriskEqualsSignGreaterThanSignKeyword_2());
		}
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
			{
				newCompositeNode(grammarAccess.getPropertyValueAccess().getExprExpressionParserRuleCall_0());
			}
			lv_expr_0_0=ruleExpression
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getPropertyValueRule());
				}
				set(
					$current,
					"expr",
					lv_expr_0_0,
					"org.osate.expr.Expr.Expression");
				afterParserOrEnumRuleCall();
			}
		)
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
						"org.osate.expr.Expr.ID");
				}
			)
		)
		(
			otherlv_4='extends'
			{
				newLeafNode(otherlv_4, grammarAccess.getComponentInterfaceAccess().getExtendsKeyword_4_0());
			}
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
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getComponentInterfaceAccess().getSemicolonKeyword_6());
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
			{
				/* */
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getInterfaceBodyRule());
				}
				newCompositeNode(grammarAccess.getInterfaceBodyAccess().getInterfaceElementParserRuleCall_1());
			}
			this_InterfaceElement_1=ruleInterfaceElement[$current]
			{
				$current = $this_InterfaceElement_1.current;
				afterParserOrEnumRuleCall();
			}
		)*
		otherlv_2='end'
		{
			newLeafNode(otherlv_2, grammarAccess.getInterfaceBodyAccess().getEndKeyword_2());
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
		(
			(
				{
					newCompositeNode(grammarAccess.getInterfaceElementAccess().getOwnedPropertyAssociationsPropertyAssociationParserRuleCall_4_0());
				}
				lv_ownedPropertyAssociations_4_0=rulePropertyAssociation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInterfaceElementRule());
					}
					add(
						$current,
						"ownedPropertyAssociations",
						lv_ownedPropertyAssociations_4_0,
						"org.osate.xtext.aadlv3.AadlV3.PropertyAssociation");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getInterfaceElementAccess().getAnnexSubclauseAnnexSubclauseParserRuleCall_5_0());
				}
				lv_annexSubclause_5_0=ruleAnnexSubclause
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInterfaceElementRule());
					}
					add(
						$current,
						"annexSubclause",
						lv_annexSubclause_5_0,
						"org.osate.xtext.aadlv3.AadlV3.AnnexSubclause");
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
		otherlv_6=';'
		{
			newLeafNode(otherlv_6, grammarAccess.getComponentImplementationAccess().getSemicolonKeyword_5());
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
			{
				/* */
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getImplementationBodyRule());
				}
				newCompositeNode(grammarAccess.getImplementationBodyAccess().getImplementationElementParserRuleCall_1());
			}
			this_ImplementationElement_1=ruleImplementationElement[$current]
			{
				$current = $this_ImplementationElement_1.current;
				afterParserOrEnumRuleCall();
			}
		)*
		otherlv_2='end'
		{
			newLeafNode(otherlv_2, grammarAccess.getImplementationBodyAccess().getEndKeyword_2());
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
					newCompositeNode(grammarAccess.getImplementationElementAccess().getBindingsBindingParserRuleCall_1_0());
				}
				lv_bindings_1_0=ruleBinding
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImplementationElementRule());
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
					newCompositeNode(grammarAccess.getImplementationElementAccess().getComponentsComponentParserRuleCall_2_0());
				}
				lv_components_2_0=ruleComponent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImplementationElementRule());
					}
					add(
						$current,
						"components",
						lv_components_2_0,
						"org.osate.xtext.aadlv3.AadlV3.Component");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getImplementationElementAccess().getPathsPathParserRuleCall_3_0());
				}
				lv_paths_3_0=rulePath
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImplementationElementRule());
					}
					add(
						$current,
						"paths",
						lv_paths_3_0,
						"org.osate.xtext.aadlv3.AadlV3.Path");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getImplementationElementAccess().getFlowAssignmentsFlowAssignmentParserRuleCall_4_0());
				}
				lv_flowAssignments_4_0=ruleFlowAssignment
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImplementationElementRule());
					}
					add(
						$current,
						"flowAssignments",
						lv_flowAssignments_4_0,
						"org.osate.xtext.aadlv3.AadlV3.FlowAssignment");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getImplementationElementAccess().getClassifierAssignmentsClassifierAssignmentParserRuleCall_5_0());
				}
				lv_classifierAssignments_5_0=ruleClassifierAssignment
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImplementationElementRule());
					}
					add(
						$current,
						"classifierAssignments",
						lv_classifierAssignments_5_0,
						"org.osate.xtext.aadlv3.AadlV3.ClassifierAssignment");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getImplementationElementAccess().getClassifierAssignmentsClassifierAssignmentPatternParserRuleCall_6_0());
				}
				lv_classifierAssignments_6_0=ruleClassifierAssignmentPattern
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImplementationElementRule());
					}
					add(
						$current,
						"classifierAssignments",
						lv_classifierAssignments_6_0,
						"org.osate.xtext.aadlv3.AadlV3.ClassifierAssignmentPattern");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getImplementationElementAccess().getOwnedPropertyAssociationsPropertyAssociationParserRuleCall_7_0());
				}
				lv_ownedPropertyAssociations_7_0=rulePropertyAssociation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImplementationElementRule());
					}
					add(
						$current,
						"ownedPropertyAssociations",
						lv_ownedPropertyAssociations_7_0,
						"org.osate.xtext.aadlv3.AadlV3.PropertyAssociation");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getImplementationElementAccess().getAnnexSubclauseAnnexSubclauseParserRuleCall_8_0());
				}
				lv_annexSubclause_8_0=ruleAnnexSubclause
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImplementationElementRule());
					}
					add(
						$current,
						"annexSubclause",
						lv_annexSubclause_8_0,
						"org.osate.xtext.aadlv3.AadlV3.AnnexSubclause");
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
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getComponentConfigurationAccess().getSemicolonKeyword_6());
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
						"org.osate.expr.Expr.ID");
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
			(
				(
					{
						newCompositeNode(grammarAccess.getFeatureAccess().getPropagationPropagationsParserRuleCall_5_0_0());
					}
					lv_propagation_5_0=rulePropagations
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFeatureRule());
						}
						set(
							$current,
							"propagation",
							lv_propagation_5_0,
							"org.osate.xtext.aadlv3.AadlV3.Propagations");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getFeatureAccess().getPropagationEPropagationsParserRuleCall_5_1_0());
					}
					lv_propagation_6_0=ruleEPropagations
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFeatureRule());
						}
						set(
							$current,
							"propagation",
							lv_propagation_6_0,
							"org.osate.xtext.aadlv3.AadlV3.EPropagations");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getFeatureAccess().getAnnexElementsAnnexElementParserRuleCall_6_0());
				}
				lv_annexElements_7_0=ruleAnnexElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureRule());
					}
					add(
						$current,
						"annexElements",
						lv_annexElements_7_0,
						"org.osate.xtext.aadlv3.AadlV3.AnnexElement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			{
				/* */
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getFeatureRule());
				}
				newCompositeNode(grammarAccess.getFeatureAccess().getPropertiesBlockParserRuleCall_7());
			}
			this_PropertiesBlock_8=rulePropertiesBlock[$current]
			{
				$current = $this_PropertiesBlock_8.current;
				afterParserOrEnumRuleCall();
			}
		)?
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getFeatureAccess().getSemicolonKeyword_8());
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
						"org.osate.expr.Expr.ID");
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
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getComponentAccess().getSemicolonKeyword_5());
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
						"org.osate.expr.Expr.ID");
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
					newCompositeNode(grammarAccess.getConnectionAccess().getAssociationTypeIsConnectionParserRuleCall_2_0());
				}
				lv_associationType_2_0=ruleIsConnection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConnectionRule());
					}
					set(
						$current,
						"associationType",
						lv_associationType_2_0,
						"org.osate.xtext.aadlv3.AadlV3.IsConnection");
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
		otherlv_8=';'
		{
			newLeafNode(otherlv_8, grammarAccess.getConnectionAccess().getSemicolonKeyword_7());
		}
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
						"org.osate.expr.Expr.ID");
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
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBindingRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getBindingAccess().getBindingTypeTypeDeclCrossReference_2_0());
				}
				ruleQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getBindingAccess().getAssociationTypeIsBindingParserRuleCall_3_0());
				}
				lv_associationType_3_0=ruleIsBinding
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBindingRule());
					}
					set(
						$current,
						"associationType",
						lv_associationType_3_0,
						"org.osate.xtext.aadlv3.AadlV3.IsBinding");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getBindingAccess().getSourceModelElementReferenceParserRuleCall_4_0());
				}
				lv_source_4_0=ruleModelElementReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBindingRule());
					}
					set(
						$current,
						"source",
						lv_source_4_0,
						"org.osate.xtext.aadlv3.AadlV3.ModelElementReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='->'
		{
			newLeafNode(otherlv_5, grammarAccess.getBindingAccess().getHyphenMinusGreaterThanSignKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBindingAccess().getDestinationModelElementReferenceParserRuleCall_6_0());
				}
				lv_destination_6_0=ruleModelElementReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBindingRule());
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
					$current = createModelElement(grammarAccess.getBindingRule());
				}
				newCompositeNode(grammarAccess.getBindingAccess().getPropertiesBlockParserRuleCall_7());
			}
			this_PropertiesBlock_7=rulePropertiesBlock[$current]
			{
				$current = $this_PropertiesBlock_7.current;
				afterParserOrEnumRuleCall();
			}
		)?
		otherlv_8=';'
		{
			newLeafNode(otherlv_8, grammarAccess.getBindingAccess().getSemicolonKeyword_8());
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
						"org.osate.expr.Expr.ID");
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
					newCompositeNode(grammarAccess.getFlowPathAccess().getAssociationTypeIsFlowParserRuleCall_2_0());
				}
				lv_associationType_2_0=ruleIsFlow
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFlowPathRule());
					}
					set(
						$current,
						"associationType",
						lv_associationType_2_0,
						"org.osate.xtext.aadlv3.AadlV3.IsFlow");
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
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getFlowPathAccess().getSemicolonKeyword_7());
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
						"org.osate.expr.Expr.ID");
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
					newCompositeNode(grammarAccess.getFlowSourceAccess().getAssociationTypeIsFlowSourceParserRuleCall_2_0());
				}
				lv_associationType_2_0=ruleIsFlowSource
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFlowSourceRule());
					}
					set(
						$current,
						"associationType",
						lv_associationType_2_0,
						"org.osate.xtext.aadlv3.AadlV3.IsFlowSource");
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
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getFlowSourceAccess().getSemicolonKeyword_5());
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
						"org.osate.expr.Expr.ID");
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
					newCompositeNode(grammarAccess.getFlowSinkAccess().getAssociationTypeIsFlowSinkParserRuleCall_2_0());
				}
				lv_associationType_2_0=ruleIsFlowSink
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFlowSinkRule());
					}
					set(
						$current,
						"associationType",
						lv_associationType_2_0,
						"org.osate.xtext.aadlv3.AadlV3.IsFlowSink");
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
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getFlowSinkAccess().getSemicolonKeyword_5());
		}
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
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getUsePropsAccess().getSemicolonKeyword_4());
		}
	)
;

// Entry rule entryRulePropagations
entryRulePropagations returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPropagationsRule()); }
	iv_rulePropagations=rulePropagations
	{ $current=$iv_rulePropagations.current; }
	EOF;

// Rule Propagations
rulePropagations returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='propagates'
		{
			newLeafNode(otherlv_0, grammarAccess.getPropagationsAccess().getPropagatesKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPropagationsAccess().getDirectionFeatureDirectionParserRuleCall_1_0());
				}
				lv_direction_1_0=ruleFeatureDirection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPropagationsRule());
					}
					set(
						$current,
						"direction",
						lv_direction_1_0,
						"org.osate.xtext.aadlv3.AadlV3.FeatureDirection");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getPropagationsAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPropagationsRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getPropagationsAccess().getPropagatedTypesClassifierOrTypeCrossReference_3_0());
				}
				ruleQualifiedTypesReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4=','
			{
				newLeafNode(otherlv_4, grammarAccess.getPropagationsAccess().getCommaKeyword_4_0());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPropagationsRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getPropagationsAccess().getPropagatedTypesClassifierOrTypeCrossReference_4_1_0());
					}
					ruleQualifiedTypesReference
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getPropagationsAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleEPropagations
entryRuleEPropagations returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEPropagationsRule()); }
	iv_ruleEPropagations=ruleEPropagations
	{ $current=$iv_ruleEPropagations.current; }
	EOF;

// Rule EPropagations
ruleEPropagations returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='@e'
		{
			newLeafNode(otherlv_0, grammarAccess.getEPropagationsAccess().getEKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getEPropagationsAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEPropagationsAccess().getDirectionFeatureDirectionParserRuleCall_2_0());
				}
				lv_direction_2_0=ruleFeatureDirection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEPropagationsRule());
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
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEPropagationsRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getEPropagationsAccess().getPropagatedTypesClassifierOrTypeCrossReference_3_0());
				}
				ruleQualifiedTypesReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4=','
			{
				newLeafNode(otherlv_4, grammarAccess.getEPropagationsAccess().getCommaKeyword_4_0());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEPropagationsRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getEPropagationsAccess().getPropagatedTypesClassifierOrTypeCrossReference_4_1_0());
					}
					ruleQualifiedTypesReference
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getEPropagationsAccess().getRightCurlyBracketKeyword_5());
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
						"org.osate.expr.Expr.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getPathAccess().getColonKeyword_1());
		}
		otherlv_2='flow'
		{
			newLeafNode(otherlv_2, grammarAccess.getPathAccess().getFlowKeyword_2());
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
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getPathAccess().getSemicolonKeyword_6());
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
							"org.osate.expr.Expr.ID");
					}
				)
			)
		)?
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getImportAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleClassifierAssignment
entryRuleClassifierAssignment returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClassifierAssignmentRule()); }
	iv_ruleClassifierAssignment=ruleClassifierAssignment
	{ $current=$iv_ruleClassifierAssignment.current; }
	EOF;

// Rule ClassifierAssignment
ruleClassifierAssignment returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getClassifierAssignmentAccess().getTargetModelElementReferenceParserRuleCall_0_0());
				}
				lv_target_0_0=ruleModelElementReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getClassifierAssignmentRule());
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
			newLeafNode(otherlv_1, grammarAccess.getClassifierAssignmentAccess().getEqualsSignGreaterThanSignKeyword_1());
		}
		(
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getClassifierAssignmentAccess().getAssignedClassifiersTypeReferenceParserRuleCall_2_0_0_0());
						}
						lv_assignedClassifiers_2_0=ruleTypeReference
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getClassifierAssignmentRule());
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
						newLeafNode(otherlv_3, grammarAccess.getClassifierAssignmentAccess().getCommaKeyword_2_0_1_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getClassifierAssignmentAccess().getAssignedClassifiersTypeReferenceParserRuleCall_2_0_1_1_0());
							}
							lv_assignedClassifiers_4_0=ruleTypeReference
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getClassifierAssignmentRule());
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
							$current = createModelElement(grammarAccess.getClassifierAssignmentRule());
						}
						newCompositeNode(grammarAccess.getClassifierAssignmentAccess().getCurlyConfigurationElementBlockParserRuleCall_2_0_2());
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
					$current = createModelElement(grammarAccess.getClassifierAssignmentRule());
				}
				newCompositeNode(grammarAccess.getClassifierAssignmentAccess().getCurlyConfigurationElementBlockParserRuleCall_2_1());
			}
			this_CurlyConfigurationElementBlock_6=ruleCurlyConfigurationElementBlock[$current]
			{
				$current = $this_CurlyConfigurationElementBlock_6.current;
				afterParserOrEnumRuleCall();
			}
		)
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getClassifierAssignmentAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleClassifierAssignmentPattern
entryRuleClassifierAssignmentPattern returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClassifierAssignmentPatternRule()); }
	iv_ruleClassifierAssignmentPattern=ruleClassifierAssignmentPattern
	{ $current=$iv_ruleClassifierAssignmentPattern.current; }
	EOF;

// Rule ClassifierAssignmentPattern
ruleClassifierAssignmentPattern returns [EObject current=null]
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
			if ($current==null) {
				$current = createModelElement(grammarAccess.getClassifierAssignmentPatternRule());
			}
			newCompositeNode(grammarAccess.getClassifierAssignmentPatternAccess().getQueryExpressionParserRuleCall_0());
		}
		this_QueryExpression_0=ruleQueryExpression[$current]
		{
			$current = $this_QueryExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		otherlv_1='=>'
		{
			newLeafNode(otherlv_1, grammarAccess.getClassifierAssignmentPatternAccess().getEqualsSignGreaterThanSignKeyword_1());
		}
		(
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getClassifierAssignmentPatternAccess().getAssignedClassifiersTypeReferenceParserRuleCall_2_0_0_0());
						}
						lv_assignedClassifiers_2_0=ruleTypeReference
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getClassifierAssignmentPatternRule());
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
						newLeafNode(otherlv_3, grammarAccess.getClassifierAssignmentPatternAccess().getCommaKeyword_2_0_1_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getClassifierAssignmentPatternAccess().getAssignedClassifiersTypeReferenceParserRuleCall_2_0_1_1_0());
							}
							lv_assignedClassifiers_4_0=ruleTypeReference
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getClassifierAssignmentPatternRule());
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
							$current = createModelElement(grammarAccess.getClassifierAssignmentPatternRule());
						}
						newCompositeNode(grammarAccess.getClassifierAssignmentPatternAccess().getCurlyConfigurationElementBlockParserRuleCall_2_0_2());
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
					$current = createModelElement(grammarAccess.getClassifierAssignmentPatternRule());
				}
				newCompositeNode(grammarAccess.getClassifierAssignmentPatternAccess().getCurlyConfigurationElementBlockParserRuleCall_2_1());
			}
			this_CurlyConfigurationElementBlock_6=ruleCurlyConfigurationElementBlock[$current]
			{
				$current = $this_CurlyConfigurationElementBlock_6.current;
				afterParserOrEnumRuleCall();
			}
		)
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getClassifierAssignmentPatternAccess().getSemicolonKeyword_3());
		}
	)
;


// Rule QueryExpression
ruleQueryExpression[EObject in_current]  returns [EObject current=in_current]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='all'
		{
			newLeafNode(otherlv_0, grammarAccess.getQueryExpressionAccess().getAllKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getQueryExpressionAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getQueryExpressionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getQueryExpressionAccess().getTargetPatternClassifierOrTypeCrossReference_2_0());
				}
				ruleQualifiedTypesReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getQueryExpressionAccess().getRightParenthesisKeyword_3());
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
		otherlv_6=';'
		{
			newLeafNode(otherlv_6, grammarAccess.getFlowAssignmentAccess().getSemicolonKeyword_5());
		}
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
			{
				/* */
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getConfigurationElementBlockRule());
				}
				newCompositeNode(grammarAccess.getConfigurationElementBlockAccess().getConfigurationElementParserRuleCall_1());
			}
			this_ConfigurationElement_1=ruleConfigurationElement[$current]
			{
				$current = $this_ConfigurationElement_1.current;
				afterParserOrEnumRuleCall();
			}
		)*
		otherlv_2='end'
		{
			newLeafNode(otherlv_2, grammarAccess.getConfigurationElementBlockAccess().getEndKeyword_2());
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
		(
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
		)+
		otherlv_2='}'
		{
			newLeafNode(otherlv_2, grammarAccess.getCurlyConfigurationElementBlockAccess().getRightCurlyBracketKeyword_2());
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
					newCompositeNode(grammarAccess.getConfigurationElementAccess().getOwnedPropertyAssociationsPropertyAssociationParserRuleCall_0_0());
				}
				lv_ownedPropertyAssociations_0_0=rulePropertyAssociation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConfigurationElementRule());
					}
					add(
						$current,
						"ownedPropertyAssociations",
						lv_ownedPropertyAssociations_0_0,
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
					newCompositeNode(grammarAccess.getConfigurationElementAccess().getClassifierAssignmentsClassifierAssignmentParserRuleCall_2_0());
				}
				lv_classifierAssignments_2_0=ruleClassifierAssignment
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConfigurationElementRule());
					}
					add(
						$current,
						"classifierAssignments",
						lv_classifierAssignments_2_0,
						"org.osate.xtext.aadlv3.AadlV3.ClassifierAssignment");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getConfigurationElementAccess().getClassifierAssignmentsClassifierAssignmentPatternParserRuleCall_3_0());
				}
				lv_classifierAssignments_3_0=ruleClassifierAssignmentPattern
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConfigurationElementRule());
					}
					add(
						$current,
						"classifierAssignments",
						lv_classifierAssignments_3_0,
						"org.osate.xtext.aadlv3.AadlV3.ClassifierAssignmentPattern");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getConfigurationElementAccess().getAnnexSubclauseAnnexSubclauseParserRuleCall_4_0());
				}
				lv_annexSubclause_4_0=ruleAnnexSubclause
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConfigurationElementRule());
					}
					add(
						$current,
						"annexSubclause",
						lv_annexSubclause_4_0,
						"org.osate.xtext.aadlv3.AadlV3.AnnexSubclause");
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
						"org.osate.expr.Expr.ID");
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
					newCompositeNode(grammarAccess.getConfigurationParameterAccess().getTypeClassifierOrTypeCrossReference_2_0());
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
					newCompositeNode(grammarAccess.getReversableTypeReferenceAccess().getTypeClassifierOrTypeCrossReference_1_0());
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
					newCompositeNode(grammarAccess.getTypeReferenceAccess().getTypeClassifierOrTypeCrossReference_0_0());
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

// Entry rule entryRuleAnnexSubclause
entryRuleAnnexSubclause returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAnnexSubclauseRule()); }
	iv_ruleAnnexSubclause=ruleAnnexSubclause
	{ $current=$iv_ruleAnnexSubclause.current; }
	EOF;

// Rule AnnexSubclause
ruleAnnexSubclause returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='@'
		{
			newLeafNode(otherlv_0, grammarAccess.getAnnexSubclauseAccess().getCommercialAtKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getAnnexSubclauseAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAnnexSubclauseRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.osate.expr.Expr.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getAnnexSubclauseAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getAnnexSubclauseAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleAnnexElement
entryRuleAnnexElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAnnexElementRule()); }
	iv_ruleAnnexElement=ruleAnnexElement
	{ $current=$iv_ruleAnnexElement.current; }
	EOF;

// Rule AnnexElement
ruleAnnexElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='@'
		{
			newLeafNode(otherlv_0, grammarAccess.getAnnexElementAccess().getCommercialAtKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getAnnexElementAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAnnexElementRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.osate.expr.Expr.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getAnnexElementAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getAnnexElementAccess().getRightCurlyBracketKeyword_3());
		}
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
					newCompositeNode(grammarAccess.getPropertiesBlockAccess().getOwnedPropertyAssociationsPropertyAssociationParserRuleCall_1_0());
				}
				lv_ownedPropertyAssociations_1_0=rulePropertyAssociation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPropertiesBlockRule());
					}
					add(
						$current,
						"ownedPropertyAssociations",
						lv_ownedPropertyAssociations_1_0,
						"org.osate.xtext.aadlv3.AadlV3.PropertyAssociation");
					afterParserOrEnumRuleCall();
				}
			)
		)+
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
			{
				/* */
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getNestedComponentImplementationBlockRule());
				}
				newCompositeNode(grammarAccess.getNestedComponentImplementationBlockAccess().getNestedImplementationElementParserRuleCall_1());
			}
			this_NestedImplementationElement_1=ruleNestedImplementationElement[$current]
			{
				$current = $this_NestedImplementationElement_1.current;
				afterParserOrEnumRuleCall();
			}
		)+
		otherlv_2='}'
		{
			newLeafNode(otherlv_2, grammarAccess.getNestedComponentImplementationBlockAccess().getRightCurlyBracketKeyword_2());
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
					newCompositeNode(grammarAccess.getNestedImplementationElementAccess().getBindingsBindingParserRuleCall_2_0());
				}
				lv_bindings_2_0=ruleBinding
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNestedImplementationElementRule());
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
					newCompositeNode(grammarAccess.getNestedImplementationElementAccess().getComponentsComponentParserRuleCall_3_0());
				}
				lv_components_3_0=ruleComponent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNestedImplementationElementRule());
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
					newCompositeNode(grammarAccess.getNestedImplementationElementAccess().getOwnedPropertyAssociationsPropertyAssociationParserRuleCall_4_0());
				}
				lv_ownedPropertyAssociations_4_0=rulePropertyAssociation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNestedImplementationElementRule());
					}
					add(
						$current,
						"ownedPropertyAssociations",
						lv_ownedPropertyAssociations_4_0,
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
					newCompositeNode(grammarAccess.getConfigurationExtensionsAccess().getSuperClassifiersTypeReferenceParserRuleCall_0_0());
				}
				lv_superClassifiers_0_0=ruleTypeReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConfigurationExtensionsRule());
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
				newLeafNode(otherlv_1, grammarAccess.getConfigurationExtensionsAccess().getCommaKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getConfigurationExtensionsAccess().getSuperClassifiersTypeReferenceParserRuleCall_1_1_0());
					}
					lv_superClassifiers_2_0=ruleTypeReference
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConfigurationExtensionsRule());
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
				{
					newCompositeNode(grammarAccess.getWorkingsetAccess().getRootComponentsComponentParserRuleCall_5_0());
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
		)*
		otherlv_6='end'
		{
			newLeafNode(otherlv_6, grammarAccess.getWorkingsetAccess().getEndKeyword_6());
		}
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getWorkingsetAccess().getSemicolonKeyword_7());
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
		kw='parameter'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getFeatureCategoryAccess().getParameterKeyword_2());
		}
		    |
		{
			newCompositeNode(grammarAccess.getFeatureCategoryAccess().getDataAccessKeywordsParserRuleCall_3());
		}
		this_DataAccessKeywords_3=ruleDataAccessKeywords
		{
			$current.merge(this_DataAccessKeywords_3);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFeatureCategoryAccess().getBusAccessKeywordsParserRuleCall_4());
		}
		this_BusAccessKeywords_4=ruleBusAccessKeywords
		{
			$current.merge(this_BusAccessKeywords_4);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFeatureCategoryAccess().getVirtualBusAccessKeywordsParserRuleCall_5());
		}
		this_VirtualBusAccessKeywords_5=ruleVirtualBusAccessKeywords
		{
			$current.merge(this_VirtualBusAccessKeywords_5);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFeatureCategoryAccess().getSubprogramAccessKeywordsParserRuleCall_6());
		}
		this_SubprogramAccessKeywords_6=ruleSubprogramAccessKeywords
		{
			$current.merge(this_SubprogramAccessKeywords_6);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFeatureCategoryAccess().getSubprogramGroupAccessKeywordsParserRuleCall_7());
		}
		this_SubprogramGroupAccessKeywords_7=ruleSubprogramGroupAccessKeywords
		{
			$current.merge(this_SubprogramGroupAccessKeywords_7);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		kw='binding'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getFeatureCategoryAccess().getBindingKeyword_8());
		}
		    |
		kw='interface'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getFeatureCategoryAccess().getInterfaceKeyword_9());
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
			newCompositeNode(grammarAccess.getAssociationTypeAccess().getIsConnectionParserRuleCall_0());
		}
		this_IsConnection_0=ruleIsConnection
		{
			$current.merge(this_IsConnection_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAssociationTypeAccess().getIsBindingParserRuleCall_1());
		}
		this_IsBinding_1=ruleIsBinding
		{
			$current.merge(this_IsBinding_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAssociationTypeAccess().getIsFlowParserRuleCall_2());
		}
		this_IsFlow_2=ruleIsFlow
		{
			$current.merge(this_IsFlow_2);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleIsConnection
entryRuleIsConnection returns [String current=null]:
	{ newCompositeNode(grammarAccess.getIsConnectionRule()); }
	iv_ruleIsConnection=ruleIsConnection
	{ $current=$iv_ruleIsConnection.current.getText(); }
	EOF;

// Rule IsConnection
ruleIsConnection returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='connection'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getIsConnectionAccess().getConnectionKeyword());
	}
;

// Entry rule entryRuleIsBinding
entryRuleIsBinding returns [String current=null]:
	{ newCompositeNode(grammarAccess.getIsBindingRule()); }
	iv_ruleIsBinding=ruleIsBinding
	{ $current=$iv_ruleIsBinding.current.getText(); }
	EOF;

// Rule IsBinding
ruleIsBinding returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='binding'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getIsBindingAccess().getBindingKeyword());
	}
;

// Entry rule entryRuleIsFlowSource
entryRuleIsFlowSource returns [String current=null]:
	{ newCompositeNode(grammarAccess.getIsFlowSourceRule()); }
	iv_ruleIsFlowSource=ruleIsFlowSource
	{ $current=$iv_ruleIsFlowSource.current.getText(); }
	EOF;

// Rule IsFlowSource
ruleIsFlowSource returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getIsFlowSourceAccess().getFlowSourceKeywordsParserRuleCall());
	}
	this_FlowSourceKeywords_0=ruleFlowSourceKeywords
	{
		$current.merge(this_FlowSourceKeywords_0);
	}
	{
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleIsFlowSink
entryRuleIsFlowSink returns [String current=null]:
	{ newCompositeNode(grammarAccess.getIsFlowSinkRule()); }
	iv_ruleIsFlowSink=ruleIsFlowSink
	{ $current=$iv_ruleIsFlowSink.current.getText(); }
	EOF;

// Rule IsFlowSink
ruleIsFlowSink returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getIsFlowSinkAccess().getFlowSinkKeywordsParserRuleCall());
	}
	this_FlowSinkKeywords_0=ruleFlowSinkKeywords
	{
		$current.merge(this_FlowSinkKeywords_0);
	}
	{
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleIsFlow
entryRuleIsFlow returns [String current=null]:
	{ newCompositeNode(grammarAccess.getIsFlowRule()); }
	iv_ruleIsFlow=ruleIsFlow
	{ $current=$iv_ruleIsFlow.current.getText(); }
	EOF;

// Rule IsFlow
ruleIsFlow returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='flow'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getIsFlowAccess().getFlowKeyword());
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

// Entry rule entryRuleExprLibrary
entryRuleExprLibrary returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExprLibraryRule()); }
	iv_ruleExprLibrary=ruleExprLibrary
	{ $current=$iv_ruleExprLibrary.current; }
	EOF;

// Rule ExprLibrary
ruleExprLibrary returns [EObject current=null]
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
				$current = forceCreateModelElement(
					grammarAccess.getExprLibraryAccess().getExprLibraryAction_0(),
					$current);
			}
		)
		(
			{
				/* */
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getExprLibraryRule());
				}
				newCompositeNode(grammarAccess.getExprLibraryAccess().getDeclarationsParserRuleCall_1());
			}
			this_Declarations_1=ruleDeclarations[$current]
			{
				$current = $this_Declarations_1.current;
				afterParserOrEnumRuleCall();
			}
		)?
	)
;

// Entry rule entryRuleExprSubclause
entryRuleExprSubclause returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExprSubclauseRule()); }
	iv_ruleExprSubclause=ruleExprSubclause
	{ $current=$iv_ruleExprSubclause.current; }
	EOF;

// Rule ExprSubclause
ruleExprSubclause returns [EObject current=null]
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
				$current = forceCreateModelElement(
					grammarAccess.getExprSubclauseAccess().getExprSubclauseAction_0(),
					$current);
			}
		)
		(
			{
				/* */
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getExprSubclauseRule());
				}
				newCompositeNode(grammarAccess.getExprSubclauseAccess().getDeclarationsParserRuleCall_1());
			}
			this_Declarations_1=ruleDeclarations[$current]
			{
				$current = $this_Declarations_1.current;
				afterParserOrEnumRuleCall();
			}
		)?
	)
;


// Rule Declarations
ruleDeclarations[EObject in_current]  returns [EObject current=in_current]
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
					newCompositeNode(grammarAccess.getDeclarationsAccess().getDeclsEDeclarationParserRuleCall_0_0());
				}
				lv_decls_0_0=ruleEDeclaration
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDeclarationsRule());
					}
					add(
						$current,
						"decls",
						lv_decls_0_0,
						"org.osate.expr.Expr.EDeclaration");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1=';'
			{
				newLeafNode(otherlv_1, grammarAccess.getDeclarationsAccess().getSemicolonKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDeclarationsAccess().getDeclsEDeclarationParserRuleCall_1_1_0());
					}
					lv_decls_2_0=ruleEDeclaration
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDeclarationsRule());
						}
						add(
							$current,
							"decls",
							lv_decls_2_0,
							"org.osate.expr.Expr.EDeclaration");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		(
			otherlv_3=';'
			{
				newLeafNode(otherlv_3, grammarAccess.getDeclarationsAccess().getSemicolonKeyword_2());
			}
		)?
	)
;

// Entry rule entryRuleEDeclaration
entryRuleEDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEDeclarationRule()); }
	iv_ruleEDeclaration=ruleEDeclaration
	{ $current=$iv_ruleEDeclaration.current; }
	EOF;

// Rule EDeclaration
ruleEDeclaration returns [EObject current=null]
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
			newCompositeNode(grammarAccess.getEDeclarationAccess().getVarDeclParserRuleCall_0());
		}
		this_VarDecl_0=ruleVarDecl
		{
			$current = $this_VarDecl_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getEDeclarationAccess().getFunDeclParserRuleCall_1());
		}
		this_FunDecl_1=ruleFunDecl
		{
			$current = $this_FunDecl_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getEDeclarationAccess().getAssertionParserRuleCall_2());
		}
		this_Assertion_2=ruleAssertion
		{
			$current = $this_Assertion_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleVarDecl
entryRuleVarDecl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVarDeclRule()); }
	iv_ruleVarDecl=ruleVarDecl
	{ $current=$iv_ruleVarDecl.current; }
	EOF;

// Rule VarDecl
ruleVarDecl returns [EObject current=null]
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
					lv_const_0_0='val'
					{
						newLeafNode(lv_const_0_0, grammarAccess.getVarDeclAccess().getConstValKeyword_0_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVarDeclRule());
						}
						setWithLastConsumed($current, "const", true, "val");
					}
				)
			)
			    |
			otherlv_1='var'
			{
				newLeafNode(otherlv_1, grammarAccess.getVarDeclAccess().getVarKeyword_0_1());
			}
		)
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVarDeclAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVarDeclRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.osate.expr.Expr.ID");
				}
			)
		)
		(
			otherlv_3=':'
			{
				newLeafNode(otherlv_3, grammarAccess.getVarDeclAccess().getColonKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVarDeclAccess().getDeclTypeTypeParserRuleCall_2_1_0());
					}
					lv_declType_4_0=ruleType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVarDeclRule());
						}
						set(
							$current,
							"declType",
							lv_declType_4_0,
							"org.osate.expr.Expr.Type");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_5='='
			{
				newLeafNode(otherlv_5, grammarAccess.getVarDeclAccess().getEqualsSignKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVarDeclAccess().getValueExpressionParserRuleCall_3_1_0());
					}
					lv_value_6_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVarDeclRule());
						}
						set(
							$current,
							"value",
							lv_value_6_0,
							"org.osate.expr.Expr.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleFunDecl
entryRuleFunDecl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunDeclRule()); }
	iv_ruleFunDecl=ruleFunDecl
	{ $current=$iv_ruleFunDecl.current; }
	EOF;

// Rule FunDecl
ruleFunDecl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='def'
		{
			newLeafNode(otherlv_0, grammarAccess.getFunDeclAccess().getDefKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getFunDeclAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFunDeclRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.osate.expr.Expr.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getFunDeclAccess().getLeftParenthesisKeyword_2());
		}
		{
			/* */
		}
		{
			if ($current==null) {
				$current = createModelElement(grammarAccess.getFunDeclRule());
			}
			newCompositeNode(grammarAccess.getFunDeclAccess().getArgsParserRuleCall_3());
		}
		this_Args_3=ruleArgs[$current]
		{
			$current = $this_Args_3.current;
			afterParserOrEnumRuleCall();
		}
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getFunDeclAccess().getRightParenthesisKeyword_4());
		}
		otherlv_5=':'
		{
			newLeafNode(otherlv_5, grammarAccess.getFunDeclAccess().getColonKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFunDeclAccess().getResultTypeTypeParserRuleCall_6_0());
				}
				lv_resultType_6_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFunDeclRule());
					}
					set(
						$current,
						"resultType",
						lv_resultType_6_0,
						"org.osate.expr.Expr.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_7='='
			{
				newLeafNode(otherlv_7, grammarAccess.getFunDeclAccess().getEqualsSignKeyword_7_0());
			}
			(
				(
					(
						(
							lv_java_8_0='java'
							{
								newLeafNode(lv_java_8_0, grammarAccess.getFunDeclAccess().getJavaJavaKeyword_7_1_0_0_0());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getFunDeclRule());
								}
								setWithLastConsumed($current, "java", true, "java");
							}
						)
					)
					otherlv_9=':'
					{
						newLeafNode(otherlv_9, grammarAccess.getFunDeclAccess().getColonKeyword_7_1_0_1());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getFunDeclAccess().getFqnJavaFQNParserRuleCall_7_1_0_2_0());
							}
							lv_fqn_10_0=ruleJavaFQN
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getFunDeclRule());
								}
								set(
									$current,
									"fqn",
									lv_fqn_10_0,
									"org.osate.expr.Expr.JavaFQN");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)
				    |
				(
					(
						{
							newCompositeNode(grammarAccess.getFunDeclAccess().getExpExpressionParserRuleCall_7_1_1_0());
						}
						lv_exp_11_0=ruleExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getFunDeclRule());
							}
							set(
								$current,
								"exp",
								lv_exp_11_0,
								"org.osate.expr.Expr.Expression");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)?
	)
;

// Entry rule entryRuleJavaFQN
entryRuleJavaFQN returns [String current=null]:
	{ newCompositeNode(grammarAccess.getJavaFQNRule()); }
	iv_ruleJavaFQN=ruleJavaFQN
	{ $current=$iv_ruleJavaFQN.current.getText(); }
	EOF;

// Rule JavaFQN
ruleJavaFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
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
			newLeafNode(this_ID_0, grammarAccess.getJavaFQNAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getJavaFQNAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getJavaFQNAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;


// Rule Args
ruleArgs[EObject in_current]  returns [EObject current=in_current]
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
					newCompositeNode(grammarAccess.getArgsAccess().getArgsArgumentParserRuleCall_0_0());
				}
				lv_args_0_0=ruleArgument
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getArgsRule());
					}
					add(
						$current,
						"args",
						lv_args_0_0,
						"org.osate.expr.Expr.Argument");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1=','
			{
				newLeafNode(otherlv_1, grammarAccess.getArgsAccess().getCommaKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getArgsAccess().getArgsArgumentParserRuleCall_1_1_0());
					}
					lv_args_2_0=ruleArgument
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getArgsRule());
						}
						add(
							$current,
							"args",
							lv_args_2_0,
							"org.osate.expr.Expr.Argument");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)?
;

// Entry rule entryRuleArgument
entryRuleArgument returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getArgumentRule()); }
	iv_ruleArgument=ruleArgument
	{ $current=$iv_ruleArgument.current; }
	EOF;

// Rule Argument
ruleArgument returns [EObject current=null]
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
				$current = forceCreateModelElement(
					grammarAccess.getArgumentAccess().getArgumentAction_0(),
					$current);
			}
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getArgumentRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.osate.expr.Expr.ID");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getArgumentAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getArgumentAccess().getTypeTypeParserRuleCall_3_0());
				}
				lv_type_3_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getArgumentRule());
					}
					set(
						$current,
						"type",
						lv_type_3_0,
						"org.osate.expr.Expr.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleAssertion
entryRuleAssertion returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAssertionRule()); }
	iv_ruleAssertion=ruleAssertion
	{ $current=$iv_ruleAssertion.current; }
	EOF;

// Rule Assertion
ruleAssertion returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='assert'
		{
			newLeafNode(otherlv_0, grammarAccess.getAssertionAccess().getAssertKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getAssertionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAssertionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.osate.expr.Expr.ID");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getAssertionAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAssertionAccess().getAssertExpressionParserRuleCall_3_0());
				}
				lv_assert_3_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAssertionRule());
					}
					set(
						$current,
						"assert",
						lv_assert_3_0,
						"org.osate.expr.Expr.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleType
entryRuleType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	iv_ruleType=ruleType
	{ $current=$iv_ruleType.current; }
	EOF;

// Rule Type
ruleType returns [EObject current=null]
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
			newCompositeNode(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0());
		}
		this_PrimitiveType_0=rulePrimitiveType
		{
			$current = $this_PrimitiveType_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getTypeAccess().getRangeTypeParserRuleCall_1());
		}
		this_RangeType_1=ruleRangeType
		{
			$current = $this_RangeType_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getTypeAccess().getCategoryParserRuleCall_2());
		}
		this_Category_2=ruleCategory
		{
			$current = $this_Category_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getTypeAccess().getMetaClassParserRuleCall_3());
		}
		this_MetaClass_3=ruleMetaClass
		{
			$current = $this_MetaClass_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getTypeAccess().getRecordTypeParserRuleCall_4());
		}
		this_RecordType_4=ruleRecordType
		{
			$current = $this_RecordType_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getTypeAccess().getUnionTypeParserRuleCall_5());
		}
		this_UnionType_5=ruleUnionType
		{
			$current = $this_UnionType_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getTypeAccess().getTupleTypeParserRuleCall_6());
		}
		this_TupleType_6=ruleTupleType
		{
			$current = $this_TupleType_6.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getTypeAccess().getListTypeParserRuleCall_7());
		}
		this_ListType_7=ruleListType
		{
			$current = $this_ListType_7.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getTypeAccess().getSetTypeParserRuleCall_8());
		}
		this_SetType_8=ruleSetType
		{
			$current = $this_SetType_8.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getTypeAccess().getBagTypeParserRuleCall_9());
		}
		this_BagType_9=ruleBagType
		{
			$current = $this_BagType_9.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getTypeAccess().getMapTypeParserRuleCall_10());
		}
		this_MapType_10=ruleMapType
		{
			$current = $this_MapType_10.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getTypeAccess().getEnumTypeParserRuleCall_11());
		}
		this_EnumType_11=ruleEnumType
		{
			$current = $this_EnumType_11.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getTypeAccess().getTypeRefParserRuleCall_12());
		}
		this_TypeRef_12=ruleTypeRef
		{
			$current = $this_TypeRef_12.current;
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
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getPrimitiveTypeAccess().getEBooleanAction_0_0(),
						$current);
				}
			)
			otherlv_1='bool'
			{
				newLeafNode(otherlv_1, grammarAccess.getPrimitiveTypeAccess().getBoolKeyword_0_1());
			}
		)
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getENumberTypeParserRuleCall_1());
		}
		this_ENumberType_2=ruleENumberType
		{
			$current = $this_ENumberType_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getPrimitiveTypeAccess().getEStringAction_2_0(),
						$current);
				}
			)
			otherlv_4='string'
			{
				newLeafNode(otherlv_4, grammarAccess.getPrimitiveTypeAccess().getStringKeyword_2_1());
			}
		)
	)
;

// Entry rule entryRuleENumberType
entryRuleENumberType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getENumberTypeRule()); }
	iv_ruleENumberType=ruleENumberType
	{ $current=$iv_ruleENumberType.current; }
	EOF;

// Rule ENumberType
ruleENumberType returns [EObject current=null]
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
			newCompositeNode(grammarAccess.getENumberTypeAccess().getEIntegerParserRuleCall_0());
		}
		this_EInteger_0=ruleEInteger
		{
			$current = $this_EInteger_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getENumberTypeAccess().getERealParserRuleCall_1());
		}
		this_EReal_1=ruleEReal
		{
			$current = $this_EReal_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEInteger
entryRuleEInteger returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEIntegerRule()); }
	iv_ruleEInteger=ruleEInteger
	{ $current=$iv_ruleEInteger.current; }
	EOF;

// Rule EInteger
ruleEInteger returns [EObject current=null]
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
				$current = forceCreateModelElement(
					grammarAccess.getEIntegerAccess().getEIntegerAction_0(),
					$current);
			}
		)
		otherlv_1='int'
		{
			newLeafNode(otherlv_1, grammarAccess.getEIntegerAccess().getIntKeyword_1());
		}
	)
;

// Entry rule entryRuleEReal
entryRuleEReal returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getERealRule()); }
	iv_ruleEReal=ruleEReal
	{ $current=$iv_ruleEReal.current; }
	EOF;

// Rule EReal
ruleEReal returns [EObject current=null]
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
				$current = forceCreateModelElement(
					grammarAccess.getERealAccess().getERealAction_0(),
					$current);
			}
		)
		otherlv_1='real'
		{
			newLeafNode(otherlv_1, grammarAccess.getERealAccess().getRealKeyword_1());
		}
	)
;

// Entry rule entryRuleRangeType
entryRuleRangeType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRangeTypeRule()); }
	iv_ruleRangeType=ruleRangeType
	{ $current=$iv_ruleRangeType.current; }
	EOF;

// Rule RangeType
ruleRangeType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='range'
		{
			newLeafNode(otherlv_0, grammarAccess.getRangeTypeAccess().getRangeKeyword_0());
		}
		otherlv_1='of'
		{
			newLeafNode(otherlv_1, grammarAccess.getRangeTypeAccess().getOfKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRangeTypeAccess().getTypeTypeParserRuleCall_2_0());
				}
				lv_type_2_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRangeTypeRule());
					}
					set(
						$current,
						"type",
						lv_type_2_0,
						"org.osate.expr.Expr.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleCategory
entryRuleCategory returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCategoryRule()); }
	iv_ruleCategory=ruleCategory
	{ $current=$iv_ruleCategory.current; }
	EOF;

// Rule Category
ruleCategory returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getCategoryAccess().getCategoryComponentCategoryParserRuleCall_0());
			}
			lv_category_0_0=ruleComponentCategory
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getCategoryRule());
				}
				set(
					$current,
					"category",
					lv_category_0_0,
					"org.osate.xtext.aadlv3.AadlV3.ComponentCategory");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleMetaClass
entryRuleMetaClass returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMetaClassRule()); }
	iv_ruleMetaClass=ruleMetaClass
	{ $current=$iv_ruleMetaClass.current; }
	EOF;

// Rule MetaClass
ruleMetaClass returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getMetaClassAccess().getClassMetaClassEnumEnumRuleCall_0());
			}
			lv_class_0_0=ruleMetaClassEnum
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getMetaClassRule());
				}
				set(
					$current,
					"class",
					lv_class_0_0,
					"org.osate.expr.Expr.MetaClassEnum");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleRecordType
entryRuleRecordType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRecordTypeRule()); }
	iv_ruleRecordType=ruleRecordType
	{ $current=$iv_ruleRecordType.current; }
	EOF;

// Rule RecordType
ruleRecordType returns [EObject current=null]
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
				$current = forceCreateModelElement(
					grammarAccess.getRecordTypeAccess().getRecordTypeAction_0(),
					$current);
			}
		)
		otherlv_1='record'
		{
			newLeafNode(otherlv_1, grammarAccess.getRecordTypeAccess().getRecordKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getRecordTypeAccess().getFieldsFieldParserRuleCall_3_0_0());
					}
					lv_fields_3_0=ruleField
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRecordTypeRule());
						}
						add(
							$current,
							"fields",
							lv_fields_3_0,
							"org.osate.expr.Expr.Field");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getRecordTypeAccess().getCommaKeyword_3_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getRecordTypeAccess().getFieldsFieldParserRuleCall_3_1_1_0());
						}
						lv_fields_5_0=ruleField
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getRecordTypeRule());
							}
							add(
								$current,
								"fields",
								lv_fields_5_0,
								"org.osate.expr.Expr.Field");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getRecordTypeAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleField
entryRuleField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFieldRule()); }
	iv_ruleField=ruleField
	{ $current=$iv_ruleField.current; }
	EOF;

// Rule Field
ruleField returns [EObject current=null]
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
				$current = forceCreateModelElement(
					grammarAccess.getFieldAccess().getFieldAction_0(),
					$current);
			}
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFieldRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.osate.expr.Expr.ID");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getFieldAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFieldAccess().getTypeTypeParserRuleCall_3_0());
				}
				lv_type_3_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFieldRule());
					}
					set(
						$current,
						"type",
						lv_type_3_0,
						"org.osate.expr.Expr.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleUnionType
entryRuleUnionType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnionTypeRule()); }
	iv_ruleUnionType=ruleUnionType
	{ $current=$iv_ruleUnionType.current; }
	EOF;

// Rule UnionType
ruleUnionType returns [EObject current=null]
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
				$current = forceCreateModelElement(
					grammarAccess.getUnionTypeAccess().getUnionTypeAction_0(),
					$current);
			}
		)
		otherlv_1='union'
		{
			newLeafNode(otherlv_1, grammarAccess.getUnionTypeAccess().getUnionKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getUnionTypeAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getUnionTypeAccess().getFieldsFieldParserRuleCall_3_0_0());
					}
					lv_fields_3_0=ruleField
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getUnionTypeRule());
						}
						add(
							$current,
							"fields",
							lv_fields_3_0,
							"org.osate.expr.Expr.Field");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getUnionTypeAccess().getCommaKeyword_3_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getUnionTypeAccess().getFieldsFieldParserRuleCall_3_1_1_0());
						}
						lv_fields_5_0=ruleField
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getUnionTypeRule());
							}
							add(
								$current,
								"fields",
								lv_fields_5_0,
								"org.osate.expr.Expr.Field");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getUnionTypeAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleTupleType
entryRuleTupleType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTupleTypeRule()); }
	iv_ruleTupleType=ruleTupleType
	{ $current=$iv_ruleTupleType.current; }
	EOF;

// Rule TupleType
ruleTupleType returns [EObject current=null]
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
				$current = forceCreateModelElement(
					grammarAccess.getTupleTypeAccess().getTupleTypeAction_0(),
					$current);
			}
		)
		otherlv_1='tuple'
		{
			newLeafNode(otherlv_1, grammarAccess.getTupleTypeAccess().getTupleKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getTupleTypeAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getTupleTypeAccess().getFieldsTupleFieldParserRuleCall_3_0_0());
					}
					lv_fields_3_0=ruleTupleField
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTupleTypeRule());
						}
						add(
							$current,
							"fields",
							lv_fields_3_0,
							"org.osate.expr.Expr.TupleField");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getTupleTypeAccess().getCommaKeyword_3_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getTupleTypeAccess().getFieldsTupleFieldParserRuleCall_3_1_1_0());
						}
						lv_fields_5_0=ruleTupleField
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getTupleTypeRule());
							}
							add(
								$current,
								"fields",
								lv_fields_5_0,
								"org.osate.expr.Expr.TupleField");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getTupleTypeAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleTupleField
entryRuleTupleField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTupleFieldRule()); }
	iv_ruleTupleField=ruleTupleField
	{ $current=$iv_ruleTupleField.current; }
	EOF;

// Rule TupleField
ruleTupleField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getTupleFieldAccess().getTypeTypeParserRuleCall_0());
			}
			lv_type_0_0=ruleType
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getTupleFieldRule());
				}
				set(
					$current,
					"type",
					lv_type_0_0,
					"org.osate.expr.Expr.Type");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleListType
entryRuleListType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getListTypeRule()); }
	iv_ruleListType=ruleListType
	{ $current=$iv_ruleListType.current; }
	EOF;

// Rule ListType
ruleListType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='list'
		{
			newLeafNode(otherlv_0, grammarAccess.getListTypeAccess().getListKeyword_0());
		}
		otherlv_1='of'
		{
			newLeafNode(otherlv_1, grammarAccess.getListTypeAccess().getOfKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getListTypeAccess().getTypeTypeParserRuleCall_2_0());
				}
				lv_type_2_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getListTypeRule());
					}
					set(
						$current,
						"type",
						lv_type_2_0,
						"org.osate.expr.Expr.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSetType
entryRuleSetType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSetTypeRule()); }
	iv_ruleSetType=ruleSetType
	{ $current=$iv_ruleSetType.current; }
	EOF;

// Rule SetType
ruleSetType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='set'
		{
			newLeafNode(otherlv_0, grammarAccess.getSetTypeAccess().getSetKeyword_0());
		}
		otherlv_1='of'
		{
			newLeafNode(otherlv_1, grammarAccess.getSetTypeAccess().getOfKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSetTypeAccess().getTypeTypeParserRuleCall_2_0());
				}
				lv_type_2_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSetTypeRule());
					}
					set(
						$current,
						"type",
						lv_type_2_0,
						"org.osate.expr.Expr.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleBagType
entryRuleBagType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBagTypeRule()); }
	iv_ruleBagType=ruleBagType
	{ $current=$iv_ruleBagType.current; }
	EOF;

// Rule BagType
ruleBagType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='bag'
		{
			newLeafNode(otherlv_0, grammarAccess.getBagTypeAccess().getBagKeyword_0());
		}
		otherlv_1='of'
		{
			newLeafNode(otherlv_1, grammarAccess.getBagTypeAccess().getOfKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBagTypeAccess().getTypeTypeParserRuleCall_2_0());
				}
				lv_type_2_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBagTypeRule());
					}
					set(
						$current,
						"type",
						lv_type_2_0,
						"org.osate.expr.Expr.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleMapType
entryRuleMapType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMapTypeRule()); }
	iv_ruleMapType=ruleMapType
	{ $current=$iv_ruleMapType.current; }
	EOF;

// Rule MapType
ruleMapType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='map'
		{
			newLeafNode(otherlv_0, grammarAccess.getMapTypeAccess().getMapKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMapTypeAccess().getDomainTypeParserRuleCall_1_0());
				}
				lv_domain_1_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMapTypeRule());
					}
					set(
						$current,
						"domain",
						lv_domain_1_0,
						"org.osate.expr.Expr.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='->'
		{
			newLeafNode(otherlv_2, grammarAccess.getMapTypeAccess().getHyphenMinusGreaterThanSignKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMapTypeAccess().getImageTypeParserRuleCall_3_0());
				}
				lv_image_3_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMapTypeRule());
					}
					set(
						$current,
						"image",
						lv_image_3_0,
						"org.osate.expr.Expr.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleEnumType
entryRuleEnumType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEnumTypeRule()); }
	iv_ruleEnumType=ruleEnumType
	{ $current=$iv_ruleEnumType.current; }
	EOF;

// Rule EnumType
ruleEnumType returns [EObject current=null]
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
				$current = forceCreateModelElement(
					grammarAccess.getEnumTypeAccess().getEnumTypeAction_0(),
					$current);
			}
		)
		otherlv_1='enum'
		{
			newLeafNode(otherlv_1, grammarAccess.getEnumTypeAccess().getEnumKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getEnumTypeAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getEnumTypeAccess().getLiteralsEnumLiteralParserRuleCall_3_0_0());
					}
					lv_literals_3_0=ruleEnumLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEnumTypeRule());
						}
						add(
							$current,
							"literals",
							lv_literals_3_0,
							"org.osate.expr.Expr.EnumLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getEnumTypeAccess().getCommaKeyword_3_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getEnumTypeAccess().getLiteralsEnumLiteralParserRuleCall_3_1_1_0());
						}
						lv_literals_5_0=ruleEnumLiteral
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getEnumTypeRule());
							}
							add(
								$current,
								"literals",
								lv_literals_5_0,
								"org.osate.expr.Expr.EnumLiteral");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getEnumTypeAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleEnumLiteral
entryRuleEnumLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEnumLiteralRule()); }
	iv_ruleEnumLiteral=ruleEnumLiteral
	{ $current=$iv_ruleEnumLiteral.current; }
	EOF;

// Rule EnumLiteral
ruleEnumLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getEnumLiteralAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getEnumLiteralRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.osate.expr.Expr.ID");
			}
		)
	)
;

// Entry rule entryRuleTypeRef
entryRuleTypeRef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeRefRule()); }
	iv_ruleTypeRef=ruleTypeRef
	{ $current=$iv_ruleTypeRef.current; }
	EOF;

// Rule TypeRef
ruleTypeRef returns [EObject current=null]
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
					$current = createModelElement(grammarAccess.getTypeRefRule());
				}
			}
			{
				newCompositeNode(grammarAccess.getTypeRefAccess().getRefNamedElementCrossReference_0());
			}
			ruleQCREF
			{
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	iv_ruleExpression=ruleExpression
	{ $current=$iv_ruleExpression.current; }
	EOF;

// Rule Expression
ruleExpression returns [EObject current=null]
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
			newCompositeNode(grammarAccess.getExpressionAccess().getOrExpressionParserRuleCall_0());
		}
		this_OrExpression_0=ruleOrExpression
		{
			$current = $this_OrExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getExpressionAccess().getBlockExpressionParserRuleCall_1());
		}
		this_BlockExpression_1=ruleBlockExpression
		{
			$current = $this_BlockExpression_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleBlockExpression
entryRuleBlockExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBlockExpressionRule()); }
	iv_ruleBlockExpression=ruleBlockExpression
	{ $current=$iv_ruleBlockExpression.current; }
	EOF;

// Rule BlockExpression
ruleBlockExpression returns [EObject current=null]
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
				$current = forceCreateModelElement(
					grammarAccess.getBlockExpressionAccess().getBlockAction_0(),
					$current);
			}
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getBlockExpressionAccess().getDeclsVarDeclParserRuleCall_2_0_0());
					}
					lv_decls_2_0=ruleVarDecl
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBlockExpressionRule());
						}
						add(
							$current,
							"decls",
							lv_decls_2_0,
							"org.osate.expr.Expr.VarDecl");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_3=';'
			{
				newLeafNode(otherlv_3, grammarAccess.getBlockExpressionAccess().getSemicolonKeyword_2_1());
			}
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getBlockExpressionAccess().getResultExpressionParserRuleCall_3_0());
				}
				lv_result_4_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBlockExpressionRule());
					}
					set(
						$current,
						"result",
						lv_result_4_0,
						"org.osate.expr.Expr.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getBlockExpressionAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleOrExpression
entryRuleOrExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOrExpressionRule()); }
	iv_ruleOrExpression=ruleOrExpression
	{ $current=$iv_ruleOrExpression.current; }
	EOF;

// Rule OrExpression
ruleOrExpression returns [EObject current=null]
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
			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
		}
		this_AndExpression_0=ruleAndExpression
		{
			$current = $this_AndExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				((
					(
					)
					(
						(
							ruleOpOr
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
								grammarAccess.getOrExpressionAccess().getBinaryOperationLeftAction_1_0_0_0(),
								$current);
						}
					)
					(
						(
							{
								newCompositeNode(grammarAccess.getOrExpressionAccess().getOperatorOpOrParserRuleCall_1_0_0_1_0());
							}
							lv_operator_2_0=ruleOpOr
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getOrExpressionRule());
								}
								set(
									$current,
									"operator",
									lv_operator_2_0,
									"org.osate.expr.Expr.OpOr");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_1_0());
					}
					lv_right_3_0=ruleAndExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOrExpressionRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.osate.expr.Expr.AndExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleOpOr
entryRuleOpOr returns [String current=null]:
	{ newCompositeNode(grammarAccess.getOpOrRule()); }
	iv_ruleOpOr=ruleOpOr
	{ $current=$iv_ruleOpOr.current.getText(); }
	EOF;

// Rule OpOr
ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='or'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOpOrAccess().getOrKeyword_0());
		}
		    |
		kw='||'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOpOrAccess().getVerticalLineVerticalLineKeyword_1());
		}
	)
;

// Entry rule entryRuleAndExpression
entryRuleAndExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAndExpressionRule()); }
	iv_ruleAndExpression=ruleAndExpression
	{ $current=$iv_ruleAndExpression.current; }
	EOF;

// Rule AndExpression
ruleAndExpression returns [EObject current=null]
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
			newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0());
		}
		this_EqualityExpression_0=ruleEqualityExpression
		{
			$current = $this_EqualityExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				((
					(
					)
					(
						(
							ruleOpAnd
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
								grammarAccess.getAndExpressionAccess().getBinaryOperationLeftAction_1_0_0_0(),
								$current);
						}
					)
					(
						(
							{
								newCompositeNode(grammarAccess.getAndExpressionAccess().getOperatorOpAndParserRuleCall_1_0_0_1_0());
							}
							lv_operator_2_0=ruleOpAnd
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getAndExpressionRule());
								}
								set(
									$current,
									"operator",
									lv_operator_2_0,
									"org.osate.expr.Expr.OpAnd");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightEqualityExpressionParserRuleCall_1_1_0());
					}
					lv_right_3_0=ruleEqualityExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAndExpressionRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.osate.expr.Expr.EqualityExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleOpAnd
entryRuleOpAnd returns [String current=null]:
	{ newCompositeNode(grammarAccess.getOpAndRule()); }
	iv_ruleOpAnd=ruleOpAnd
	{ $current=$iv_ruleOpAnd.current.getText(); }
	EOF;

// Rule OpAnd
ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='and'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOpAndAccess().getAndKeyword_0());
		}
		    |
		kw='&&'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOpAndAccess().getAmpersandAmpersandKeyword_1());
		}
	)
;

// Entry rule entryRuleEqualityExpression
entryRuleEqualityExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEqualityExpressionRule()); }
	iv_ruleEqualityExpression=ruleEqualityExpression
	{ $current=$iv_ruleEqualityExpression.current; }
	EOF;

// Rule EqualityExpression
ruleEqualityExpression returns [EObject current=null]
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
			newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRelationalExpressionParserRuleCall_0());
		}
		this_RelationalExpression_0=ruleRelationalExpression
		{
			$current = $this_RelationalExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				((
					(
					)
					(
						(
							ruleOpEquality
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
								grammarAccess.getEqualityExpressionAccess().getBinaryOperationLeftAction_1_0_0_0(),
								$current);
						}
					)
					(
						(
							{
								newCompositeNode(grammarAccess.getEqualityExpressionAccess().getOperatorOpEqualityParserRuleCall_1_0_0_1_0());
							}
							lv_operator_2_0=ruleOpEquality
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
								}
								set(
									$current,
									"operator",
									lv_operator_2_0,
									"org.osate.expr.Expr.OpEquality");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRightRelationalExpressionParserRuleCall_1_1_0());
					}
					lv_right_3_0=ruleRelationalExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.osate.expr.Expr.RelationalExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleOpEquality
entryRuleOpEquality returns [String current=null]:
	{ newCompositeNode(grammarAccess.getOpEqualityRule()); }
	iv_ruleOpEquality=ruleOpEquality
	{ $current=$iv_ruleOpEquality.current.getText(); }
	EOF;

// Rule OpEquality
ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='=='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0());
		}
		    |
		kw='!='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1());
		}
	)
;

// Entry rule entryRuleRelationalExpression
entryRuleRelationalExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRelationalExpressionRule()); }
	iv_ruleRelationalExpression=ruleRelationalExpression
	{ $current=$iv_ruleRelationalExpression.current; }
	EOF;

// Rule RelationalExpression
ruleRelationalExpression returns [EObject current=null]
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
			newCompositeNode(grammarAccess.getRelationalExpressionAccess().getAdditiveExpressionParserRuleCall_0());
		}
		this_AdditiveExpression_0=ruleAdditiveExpression
		{
			$current = $this_AdditiveExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				((
					(
					)
					(
						(
							ruleOpCompare
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
								grammarAccess.getRelationalExpressionAccess().getBinaryOperationLeftAction_1_0_0_0(),
								$current);
						}
					)
					(
						(
							{
								newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorOpCompareParserRuleCall_1_0_0_1_0());
							}
							lv_operator_2_0=ruleOpCompare
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
								}
								set(
									$current,
									"operator",
									lv_operator_2_0,
									"org.osate.expr.Expr.OpCompare");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightAdditiveExpressionParserRuleCall_1_1_0());
					}
					lv_right_3_0=ruleAdditiveExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.osate.expr.Expr.AdditiveExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleOpCompare
entryRuleOpCompare returns [String current=null]:
	{ newCompositeNode(grammarAccess.getOpCompareRule()); }
	iv_ruleOpCompare=ruleOpCompare
	{ $current=$iv_ruleOpCompare.current.getText(); }
	EOF;

// Rule OpCompare
ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='>='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0());
		}
		    |
		kw='<='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1());
		}
		    |
		kw='>'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2());
		}
		    |
		kw='<'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_3());
		}
		    |
		kw='><'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignLessThanSignKeyword_4());
		}
	)
;

// Entry rule entryRuleAdditiveExpression
entryRuleAdditiveExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAdditiveExpressionRule()); }
	iv_ruleAdditiveExpression=ruleAdditiveExpression
	{ $current=$iv_ruleAdditiveExpression.current; }
	EOF;

// Rule AdditiveExpression
ruleAdditiveExpression returns [EObject current=null]
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
			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
		}
		this_MultiplicativeExpression_0=ruleMultiplicativeExpression
		{
			$current = $this_MultiplicativeExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				((
					(
					)
					(
						(
							ruleOpAdd
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
								grammarAccess.getAdditiveExpressionAccess().getBinaryOperationLeftAction_1_0_0_0(),
								$current);
						}
					)
					(
						(
							{
								newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorOpAddParserRuleCall_1_0_0_1_0());
							}
							lv_operator_2_0=ruleOpAdd
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
								}
								set(
									$current,
									"operator",
									lv_operator_2_0,
									"org.osate.expr.Expr.OpAdd");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_1_0());
					}
					lv_right_3_0=ruleMultiplicativeExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.osate.expr.Expr.MultiplicativeExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleOpAdd
entryRuleOpAdd returns [String current=null]:
	{ newCompositeNode(grammarAccess.getOpAddRule()); }
	iv_ruleOpAdd=ruleOpAdd
	{ $current=$iv_ruleOpAdd.current.getText(); }
	EOF;

// Rule OpAdd
ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='+'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0());
		}
		    |
		kw='-'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1());
		}
	)
;

// Entry rule entryRuleMultiplicativeExpression
entryRuleMultiplicativeExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); }
	iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression
	{ $current=$iv_ruleMultiplicativeExpression.current; }
	EOF;

// Rule MultiplicativeExpression
ruleMultiplicativeExpression returns [EObject current=null]
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
			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getUnaryOperationParserRuleCall_0());
		}
		this_UnaryOperation_0=ruleUnaryOperation
		{
			$current = $this_UnaryOperation_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				((
					(
					)
					(
						(
							ruleOpMulti
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
								grammarAccess.getMultiplicativeExpressionAccess().getBinaryOperationLeftAction_1_0_0_0(),
								$current);
						}
					)
					(
						(
							{
								newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorOpMultiParserRuleCall_1_0_0_1_0());
							}
							lv_operator_2_0=ruleOpMulti
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
								}
								set(
									$current,
									"operator",
									lv_operator_2_0,
									"org.osate.expr.Expr.OpMulti");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightUnaryOperationParserRuleCall_1_1_0());
					}
					lv_right_3_0=ruleUnaryOperation
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.osate.expr.Expr.UnaryOperation");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleOpMulti
entryRuleOpMulti returns [String current=null]:
	{ newCompositeNode(grammarAccess.getOpMultiRule()); }
	iv_ruleOpMulti=ruleOpMulti
	{ $current=$iv_ruleOpMulti.current.getText(); }
	EOF;

// Rule OpMulti
ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='*'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0());
		}
		    |
		kw='/'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_1());
		}
		    |
		kw='div'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOpMultiAccess().getDivKeyword_2());
		}
		    |
		kw='mod'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOpMultiAccess().getModKeyword_3());
		}
	)
;

// Entry rule entryRuleUnaryOperation
entryRuleUnaryOperation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnaryOperationRule()); }
	iv_ruleUnaryOperation=ruleUnaryOperation
	{ $current=$iv_ruleUnaryOperation.current; }
	EOF;

// Rule UnaryOperation
ruleUnaryOperation returns [EObject current=null]
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
					$current = forceCreateModelElement(
						grammarAccess.getUnaryOperationAccess().getUnaryOperationAction_0_0(),
						$current);
				}
			)
			(
				((
					ruleOpUnary
				)
				)=>
				(
					{
						newCompositeNode(grammarAccess.getUnaryOperationAccess().getOperatorOpUnaryParserRuleCall_0_1_0());
					}
					lv_operator_1_0=ruleOpUnary
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getUnaryOperationRule());
						}
						set(
							$current,
							"operator",
							lv_operator_1_0,
							"org.osate.expr.Expr.OpUnary");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getUnaryOperationAccess().getOperandUnitExpressionParserRuleCall_0_2_0());
					}
					lv_operand_2_0=ruleUnitExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getUnaryOperationRule());
						}
						set(
							$current,
							"operand",
							lv_operand_2_0,
							"org.osate.expr.Expr.UnitExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getUnaryOperationAccess().getUnitExpressionParserRuleCall_1());
		}
		this_UnitExpression_3=ruleUnitExpression
		{
			$current = $this_UnitExpression_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleOpUnary
entryRuleOpUnary returns [String current=null]:
	{ newCompositeNode(grammarAccess.getOpUnaryRule()); }
	iv_ruleOpUnary=ruleOpUnary
	{ $current=$iv_ruleOpUnary.current.getText(); }
	EOF;

// Rule OpUnary
ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='not'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOpUnaryAccess().getNotKeyword_0());
		}
		    |
		kw='-'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1());
		}
		    |
		kw='+'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOpUnaryAccess().getPlusSignKeyword_2());
		}
	)
;

// Entry rule entryRuleUnitExpression
entryRuleUnitExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnitExpressionRule()); }
	iv_ruleUnitExpression=ruleUnitExpression
	{ $current=$iv_ruleUnitExpression.current; }
	EOF;

// Rule UnitExpression
ruleUnitExpression returns [EObject current=null]
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
			newCompositeNode(grammarAccess.getUnitExpressionAccess().getPropertyExpressionParserRuleCall_0());
		}
		this_PropertyExpression_0=rulePropertyExpression
		{
			$current = $this_PropertyExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getUnitExpressionAccess().getUnitExpressionExpressionAction_1_0(),
						$current);
				}
			)
			(
				(
					(
						lv_convert_2_0='%'
						{
							newLeafNode(lv_convert_2_0, grammarAccess.getUnitExpressionAccess().getConvertPercentSignKeyword_1_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getUnitExpressionRule());
							}
							setWithLastConsumed($current, "convert", true, "\%");
						}
					)
				)
				    |
				(
					(
						lv_drop_3_0='in'
						{
							newLeafNode(lv_drop_3_0, grammarAccess.getUnitExpressionAccess().getDropInKeyword_1_1_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getUnitExpressionRule());
							}
							setWithLastConsumed($current, "drop", true, "in");
						}
					)
				)
			)?
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getUnitExpressionRule());
						}
					}
					otherlv_4=RULE_ID
					{
						newLeafNode(otherlv_4, grammarAccess.getUnitExpressionAccess().getUnitUnitLiteralCrossReference_1_2_0());
					}
				)
			)
		)?
	)
;

// Entry rule entryRulePropertyExpression
entryRulePropertyExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPropertyExpressionRule()); }
	iv_rulePropertyExpression=rulePropertyExpression
	{ $current=$iv_rulePropertyExpression.current; }
	EOF;

// Rule PropertyExpression
rulePropertyExpression returns [EObject current=null]
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
			newCompositeNode(grammarAccess.getPropertyExpressionAccess().getSelectExpressionParserRuleCall_0());
		}
		this_SelectExpression_0=ruleSelectExpression
		{
			$current = $this_SelectExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				((
					(
					)
					'#'
				)
				)=>
				(
					(
						{
							/* */
						}
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getPropertyExpressionAccess().getPropertyExpressionModelElementAction_1_0_0_0(),
								$current);
						}
					)
					otherlv_2='#'
					{
						newLeafNode(otherlv_2, grammarAccess.getPropertyExpressionAccess().getNumberSignKeyword_1_0_0_1());
					}
				)
			)
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPropertyExpressionRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getPropertyExpressionAccess().getPropertyPropertyDefinitionCrossReference_1_1_0());
					}
					ruleQPREF
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleSelectExpression
entryRuleSelectExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSelectExpressionRule()); }
	iv_ruleSelectExpression=ruleSelectExpression
	{ $current=$iv_ruleSelectExpression.current; }
	EOF;

// Rule SelectExpression
ruleSelectExpression returns [EObject current=null]
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
			newCompositeNode(grammarAccess.getSelectExpressionAccess().getPrimaryExpressionParserRuleCall_0());
		}
		this_PrimaryExpression_0=rulePrimaryExpression
		{
			$current = $this_PrimaryExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			((
				(
				)
				'.'
				(
					(
						ruleQCREF
					)
				)
				(
					'('
					(
						(
							(
								ruleExpression
							)
						)
						(
							','
							(
								(
									ruleExpression
								)
							)
						)*
					)?
					')'
				)?
			)
			)=>
			(
				(
					{
						/* */
					}
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getSelectExpressionAccess().getSelectionReceiverAction_1_0_0(),
							$current);
					}
				)
				otherlv_2='.'
				{
					newLeafNode(otherlv_2, grammarAccess.getSelectExpressionAccess().getFullStopKeyword_1_0_1());
				}
				(
					(
						{
							/* */
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getSelectExpressionRule());
							}
						}
						{
							newCompositeNode(grammarAccess.getSelectExpressionAccess().getRefNamedElementCrossReference_1_0_2_0());
						}
						ruleQCREF
						{
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					otherlv_4='('
					{
						newLeafNode(otherlv_4, grammarAccess.getSelectExpressionAccess().getLeftParenthesisKeyword_1_0_3_0());
					}
					(
						(
							(
								{
									newCompositeNode(grammarAccess.getSelectExpressionAccess().getArgsExpressionParserRuleCall_1_0_3_1_0_0());
								}
								lv_args_5_0=ruleExpression
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getSelectExpressionRule());
									}
									add(
										$current,
										"args",
										lv_args_5_0,
										"org.osate.expr.Expr.Expression");
									afterParserOrEnumRuleCall();
								}
							)
						)
						(
							otherlv_6=','
							{
								newLeafNode(otherlv_6, grammarAccess.getSelectExpressionAccess().getCommaKeyword_1_0_3_1_1_0());
							}
							(
								(
									{
										newCompositeNode(grammarAccess.getSelectExpressionAccess().getArgsExpressionParserRuleCall_1_0_3_1_1_1_0());
									}
									lv_args_7_0=ruleExpression
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getSelectExpressionRule());
										}
										add(
											$current,
											"args",
											lv_args_7_0,
											"org.osate.expr.Expr.Expression");
										afterParserOrEnumRuleCall();
									}
								)
							)
						)*
					)?
					otherlv_8=')'
					{
						newLeafNode(otherlv_8, grammarAccess.getSelectExpressionAccess().getRightParenthesisKeyword_1_0_3_2());
					}
				)?
			)
		)*
	)
;

// Entry rule entryRulePrimaryExpression
entryRulePrimaryExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimaryExpressionRule()); }
	iv_rulePrimaryExpression=rulePrimaryExpression
	{ $current=$iv_rulePrimaryExpression.current; }
	EOF;

// Rule PrimaryExpression
rulePrimaryExpression returns [EObject current=null]
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
			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getNamedElementRefParserRuleCall_0());
		}
		this_NamedElementRef_0=ruleNamedElementRef
		{
			$current = $this_NamedElementRef_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getRangeExpressionParserRuleCall_1());
		}
		this_RangeExpression_1=ruleRangeExpression
		{
			$current = $this_RangeExpression_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getIfExpressionParserRuleCall_2());
		}
		this_IfExpression_2=ruleIfExpression
		{
			$current = $this_IfExpression_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_3());
		}
		this_Literal_3=ruleLiteral
		{
			$current = $this_Literal_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			otherlv_4='('
			{
				newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_0());
			}
			{
				/* */
			}
			{
				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_4_1());
			}
			this_Expression_5=ruleExpression
			{
				$current = $this_Expression_5.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_6=')'
			{
				newLeafNode(otherlv_6, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_4_2());
			}
		)
	)
;

// Entry rule entryRuleNamedElementRef
entryRuleNamedElementRef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNamedElementRefRule()); }
	iv_ruleNamedElementRef=ruleNamedElementRef
	{ $current=$iv_ruleNamedElementRef.current; }
	EOF;

// Rule NamedElementRef
ruleNamedElementRef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_core_0_0='^'
				{
					newLeafNode(lv_core_0_0, grammarAccess.getNamedElementRefAccess().getCoreCircumflexAccentKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNamedElementRefRule());
					}
					setWithLastConsumed($current, "core", true, "^");
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
						$current = createModelElement(grammarAccess.getNamedElementRefRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getNamedElementRefAccess().getRefNamedElementCrossReference_1_0());
				}
				ruleQCREF
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2='('
			{
				newLeafNode(otherlv_2, grammarAccess.getNamedElementRefAccess().getLeftParenthesisKeyword_2_0());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getNamedElementRefAccess().getArgsExpressionParserRuleCall_2_1_0_0());
						}
						lv_args_3_0=ruleExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getNamedElementRefRule());
							}
							add(
								$current,
								"args",
								lv_args_3_0,
								"org.osate.expr.Expr.Expression");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					otherlv_4=','
					{
						newLeafNode(otherlv_4, grammarAccess.getNamedElementRefAccess().getCommaKeyword_2_1_1_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getNamedElementRefAccess().getArgsExpressionParserRuleCall_2_1_1_1_0());
							}
							lv_args_5_0=ruleExpression
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getNamedElementRefRule());
								}
								add(
									$current,
									"args",
									lv_args_5_0,
									"org.osate.expr.Expr.Expression");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)*
			)?
			otherlv_6=')'
			{
				newLeafNode(otherlv_6, grammarAccess.getNamedElementRefAccess().getRightParenthesisKeyword_2_2());
			}
		)?
	)
;

// Entry rule entryRuleRangeExpression
entryRuleRangeExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRangeExpressionRule()); }
	iv_ruleRangeExpression=ruleRangeExpression
	{ $current=$iv_ruleRangeExpression.current; }
	EOF;

// Rule RangeExpression
ruleRangeExpression returns [EObject current=null]
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
				$current = forceCreateModelElement(
					grammarAccess.getRangeExpressionAccess().getRangeAction_0(),
					$current);
			}
		)
		otherlv_1='['
		{
			newLeafNode(otherlv_1, grammarAccess.getRangeExpressionAccess().getLeftSquareBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRangeExpressionAccess().getMinimumExpressionParserRuleCall_2_0());
				}
				lv_minimum_2_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRangeExpressionRule());
					}
					set(
						$current,
						"minimum",
						lv_minimum_2_0,
						"org.osate.expr.Expr.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='..'
		{
			newLeafNode(otherlv_3, grammarAccess.getRangeExpressionAccess().getFullStopFullStopKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRangeExpressionAccess().getMaximumExpressionParserRuleCall_4_0());
				}
				lv_maximum_4_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRangeExpressionRule());
					}
					set(
						$current,
						"maximum",
						lv_maximum_4_0,
						"org.osate.expr.Expr.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				('delta')=>
				otherlv_5='delta'
				{
					newLeafNode(otherlv_5, grammarAccess.getRangeExpressionAccess().getDeltaKeyword_5_0());
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getRangeExpressionAccess().getDeltaExpressionParserRuleCall_5_1_0());
					}
					lv_delta_6_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRangeExpressionRule());
						}
						set(
							$current,
							"delta",
							lv_delta_6_0,
							"org.osate.expr.Expr.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_7=']'
		{
			newLeafNode(otherlv_7, grammarAccess.getRangeExpressionAccess().getRightSquareBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleIfExpression
entryRuleIfExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIfExpressionRule()); }
	iv_ruleIfExpression=ruleIfExpression
	{ $current=$iv_ruleIfExpression.current; }
	EOF;

// Rule IfExpression
ruleIfExpression returns [EObject current=null]
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
				$current = forceCreateModelElement(
					grammarAccess.getIfExpressionAccess().getConditionalAction_0(),
					$current);
			}
		)
		otherlv_1='if'
		{
			newLeafNode(otherlv_1, grammarAccess.getIfExpressionAccess().getIfKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIfExpressionAccess().getIfExpressionParserRuleCall_2_0());
				}
				lv_if_2_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIfExpressionRule());
					}
					set(
						$current,
						"if",
						lv_if_2_0,
						"org.osate.expr.Expr.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='then'
		{
			newLeafNode(otherlv_3, grammarAccess.getIfExpressionAccess().getThenKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIfExpressionAccess().getThenExpressionParserRuleCall_4_0());
				}
				lv_then_4_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIfExpressionRule());
					}
					set(
						$current,
						"then",
						lv_then_4_0,
						"org.osate.expr.Expr.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5='else'
			{
				newLeafNode(otherlv_5, grammarAccess.getIfExpressionAccess().getElseKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getIfExpressionAccess().getElseExpressionParserRuleCall_5_1_0());
					}
					lv_else_6_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getIfExpressionRule());
						}
						set(
							$current,
							"else",
							lv_else_6_0,
							"org.osate.expr.Expr.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_7='endif'
		{
			newLeafNode(otherlv_7, grammarAccess.getIfExpressionAccess().getEndifKeyword_6());
		}
	)
;

// Entry rule entryRuleLiteral
entryRuleLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLiteralRule()); }
	iv_ruleLiteral=ruleLiteral
	{ $current=$iv_ruleLiteral.current; }
	EOF;

// Rule Literal
ruleLiteral returns [EObject current=null]
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
			newCompositeNode(grammarAccess.getLiteralAccess().getEBooleanLiteralParserRuleCall_0());
		}
		this_EBooleanLiteral_0=ruleEBooleanLiteral
		{
			$current = $this_EBooleanLiteral_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_1());
		}
		this_NumberLiteral_1=ruleNumberLiteral
		{
			$current = $this_NumberLiteral_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getLiteralAccess().getEStringLiteralParserRuleCall_2());
		}
		this_EStringLiteral_2=ruleEStringLiteral
		{
			$current = $this_EStringLiteral_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getLiteralAccess().getListLiteralParserRuleCall_3());
		}
		this_ListLiteral_3=ruleListLiteral
		{
			$current = $this_ListLiteral_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getLiteralAccess().getSetLiteralParserRuleCall_4());
		}
		this_SetLiteral_4=ruleSetLiteral
		{
			$current = $this_SetLiteral_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getLiteralAccess().getRecordLiteralParserRuleCall_5());
		}
		this_RecordLiteral_5=ruleRecordLiteral
		{
			$current = $this_RecordLiteral_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getLiteralAccess().getUnionLiteralParserRuleCall_6());
		}
		this_UnionLiteral_6=ruleUnionLiteral
		{
			$current = $this_UnionLiteral_6.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getLiteralAccess().getTupleLiteralParserRuleCall_7());
		}
		this_TupleLiteral_7=ruleTupleLiteral
		{
			$current = $this_TupleLiteral_7.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getLiteralAccess().getBagLiteralParserRuleCall_8());
		}
		this_BagLiteral_8=ruleBagLiteral
		{
			$current = $this_BagLiteral_8.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getLiteralAccess().getMapLiteralParserRuleCall_9());
		}
		this_MapLiteral_9=ruleMapLiteral
		{
			$current = $this_MapLiteral_9.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleWrappedNamedElement
entryRuleWrappedNamedElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWrappedNamedElementRule()); }
	iv_ruleWrappedNamedElement=ruleWrappedNamedElement
	{ $current=$iv_ruleWrappedNamedElement.current; }
	EOF;

// Rule WrappedNamedElement
ruleWrappedNamedElement returns [EObject current=null]
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
				$current = forceCreateModelElement(
					grammarAccess.getWrappedNamedElementAccess().getWrappedNamedElementAction_0(),
					$current);
			}
		)
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWrappedNamedElementRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getWrappedNamedElementAccess().getElemNamedElementCrossReference_1_0());
				}
			)
		)
	)
;

// Entry rule entryRuleEBooleanLiteral
entryRuleEBooleanLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEBooleanLiteralRule()); }
	iv_ruleEBooleanLiteral=ruleEBooleanLiteral
	{ $current=$iv_ruleEBooleanLiteral.current; }
	EOF;

// Rule EBooleanLiteral
ruleEBooleanLiteral returns [EObject current=null]
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
				$current = forceCreateModelElement(
					grammarAccess.getEBooleanLiteralAccess().getEBooleanLiteralAction_0(),
					$current);
			}
		)
		(
			(
				(
					lv_value_1_0='true'
					{
						newLeafNode(lv_value_1_0, grammarAccess.getEBooleanLiteralAccess().getValueTrueKeyword_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEBooleanLiteralRule());
						}
						setWithLastConsumed($current, "value", true, "true");
					}
				)
			)
			    |
			otherlv_2='false'
			{
				newLeafNode(otherlv_2, grammarAccess.getEBooleanLiteralAccess().getFalseKeyword_1_1());
			}
		)
	)
;

// Entry rule entryRuleNumberLiteral
entryRuleNumberLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNumberLiteralRule()); }
	iv_ruleNumberLiteral=ruleNumberLiteral
	{ $current=$iv_ruleNumberLiteral.current; }
	EOF;

// Rule NumberLiteral
ruleNumberLiteral returns [EObject current=null]
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
			newCompositeNode(grammarAccess.getNumberLiteralAccess().getEIntegerLiteralParserRuleCall_0());
		}
		this_EIntegerLiteral_0=ruleEIntegerLiteral
		{
			$current = $this_EIntegerLiteral_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getNumberLiteralAccess().getERealLiteralParserRuleCall_1());
		}
		this_ERealLiteral_1=ruleERealLiteral
		{
			$current = $this_ERealLiteral_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEIntegerLiteral
entryRuleEIntegerLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEIntegerLiteralRule()); }
	iv_ruleEIntegerLiteral=ruleEIntegerLiteral
	{ $current=$iv_ruleEIntegerLiteral.current; }
	EOF;

// Rule EIntegerLiteral
ruleEIntegerLiteral returns [EObject current=null]
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
				$current = forceCreateModelElement(
					grammarAccess.getEIntegerLiteralAccess().getEIntegerLiteralAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getEIntegerLiteralAccess().getValueINTVALUEParserRuleCall_1_0());
				}
				lv_value_1_0=ruleINTVALUE
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEIntegerLiteralRule());
					}
					set(
						$current,
						"value",
						lv_value_1_0,
						"org.osate.expr.Expr.INTVALUE");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleERealLiteral
entryRuleERealLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getERealLiteralRule()); }
	iv_ruleERealLiteral=ruleERealLiteral
	{ $current=$iv_ruleERealLiteral.current; }
	EOF;

// Rule ERealLiteral
ruleERealLiteral returns [EObject current=null]
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
				$current = forceCreateModelElement(
					grammarAccess.getERealLiteralAccess().getERealLiteralAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getERealLiteralAccess().getValueSignedRealParserRuleCall_1_0());
				}
				lv_value_1_0=ruleSignedReal
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getERealLiteralRule());
					}
					set(
						$current,
						"value",
						lv_value_1_0,
						"org.osate.expr.Expr.SignedReal");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSignedReal
entryRuleSignedReal returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSignedRealRule()); }
	iv_ruleSignedReal=ruleSignedReal
	{ $current=$iv_ruleSignedReal.current; }
	EOF;

// Rule SignedReal
ruleSignedReal returns [EObject current=null]
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
				$current = forceCreateModelElement(
					grammarAccess.getSignedRealAccess().getRealAction_0(),
					$current);
			}
		)
		this_REAL_LIT_1=RULE_REAL_LIT
		{
			newLeafNode(this_REAL_LIT_1, grammarAccess.getSignedRealAccess().getREAL_LITTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleEStringLiteral
entryRuleEStringLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEStringLiteralRule()); }
	iv_ruleEStringLiteral=ruleEStringLiteral
	{ $current=$iv_ruleEStringLiteral.current; }
	EOF;

// Rule EStringLiteral
ruleEStringLiteral returns [EObject current=null]
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
				$current = forceCreateModelElement(
					grammarAccess.getEStringLiteralAccess().getEStringLiteralAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getEStringLiteralAccess().getValueNoQuoteStringParserRuleCall_1_0());
				}
				lv_value_1_0=ruleNoQuoteString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEStringLiteralRule());
					}
					set(
						$current,
						"value",
						lv_value_1_0,
						"org.osate.expr.Expr.NoQuoteString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;


// Rule ExpressionList
ruleExpressionList[EObject in_current]  returns [EObject current=in_current]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getExpressionListAccess().getLeftParenthesisKeyword_0());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getExpressionListAccess().getElementsExpressionParserRuleCall_1_0_0());
					}
					lv_elements_1_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExpressionListRule());
						}
						add(
							$current,
							"elements",
							lv_elements_1_0,
							"org.osate.expr.Expr.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_2=','
				{
					newLeafNode(otherlv_2, grammarAccess.getExpressionListAccess().getCommaKeyword_1_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getExpressionListAccess().getElementsExpressionParserRuleCall_1_1_1_0());
						}
						lv_elements_3_0=ruleExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getExpressionListRule());
							}
							add(
								$current,
								"elements",
								lv_elements_3_0,
								"org.osate.expr.Expr.Expression");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getExpressionListAccess().getRightParenthesisKeyword_2());
		}
	)
;

// Entry rule entryRuleListLiteral
entryRuleListLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getListLiteralRule()); }
	iv_ruleListLiteral=ruleListLiteral
	{ $current=$iv_ruleListLiteral.current; }
	EOF;

// Rule ListLiteral
ruleListLiteral returns [EObject current=null]
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
				$current = forceCreateModelElement(
					grammarAccess.getListLiteralAccess().getListLiteralAction_0(),
					$current);
			}
		)
		otherlv_1='list'
		{
			newLeafNode(otherlv_1, grammarAccess.getListLiteralAccess().getListKeyword_1());
		}
		{
			/* */
		}
		{
			if ($current==null) {
				$current = createModelElement(grammarAccess.getListLiteralRule());
			}
			newCompositeNode(grammarAccess.getListLiteralAccess().getExpressionListParserRuleCall_2());
		}
		this_ExpressionList_2=ruleExpressionList[$current]
		{
			$current = $this_ExpressionList_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleSetLiteral
entryRuleSetLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSetLiteralRule()); }
	iv_ruleSetLiteral=ruleSetLiteral
	{ $current=$iv_ruleSetLiteral.current; }
	EOF;

// Rule SetLiteral
ruleSetLiteral returns [EObject current=null]
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
				$current = forceCreateModelElement(
					grammarAccess.getSetLiteralAccess().getSetLiteralAction_0(),
					$current);
			}
		)
		otherlv_1='set'
		{
			newLeafNode(otherlv_1, grammarAccess.getSetLiteralAccess().getSetKeyword_1());
		}
		{
			/* */
		}
		{
			if ($current==null) {
				$current = createModelElement(grammarAccess.getSetLiteralRule());
			}
			newCompositeNode(grammarAccess.getSetLiteralAccess().getExpressionListParserRuleCall_2());
		}
		this_ExpressionList_2=ruleExpressionList[$current]
		{
			$current = $this_ExpressionList_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleRecordLiteral
entryRuleRecordLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRecordLiteralRule()); }
	iv_ruleRecordLiteral=ruleRecordLiteral
	{ $current=$iv_ruleRecordLiteral.current; }
	EOF;

// Rule RecordLiteral
ruleRecordLiteral returns [EObject current=null]
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
				$current = forceCreateModelElement(
					grammarAccess.getRecordLiteralAccess().getRecordLiteralAction_0(),
					$current);
			}
		)
		otherlv_1='record'
		{
			newLeafNode(otherlv_1, grammarAccess.getRecordLiteralAccess().getRecordKeyword_1());
		}
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getRecordLiteralAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getRecordLiteralAccess().getFieldValuesFieldValueParserRuleCall_3_0_0());
					}
					lv_fieldValues_3_0=ruleFieldValue
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRecordLiteralRule());
						}
						add(
							$current,
							"fieldValues",
							lv_fieldValues_3_0,
							"org.osate.expr.Expr.FieldValue");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getRecordLiteralAccess().getCommaKeyword_3_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getRecordLiteralAccess().getFieldValuesFieldValueParserRuleCall_3_1_1_0());
						}
						lv_fieldValues_5_0=ruleFieldValue
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getRecordLiteralRule());
							}
							add(
								$current,
								"fieldValues",
								lv_fieldValues_5_0,
								"org.osate.expr.Expr.FieldValue");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getRecordLiteralAccess().getRightParenthesisKeyword_4());
		}
	)
;

// Entry rule entryRuleFieldValue
entryRuleFieldValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFieldValueRule()); }
	iv_ruleFieldValue=ruleFieldValue
	{ $current=$iv_ruleFieldValue.current; }
	EOF;

// Rule FieldValue
ruleFieldValue returns [EObject current=null]
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
					newLeafNode(lv_name_0_0, grammarAccess.getFieldValueAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFieldValueRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.osate.expr.Expr.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getFieldValueAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFieldValueAccess().getValueExpressionParserRuleCall_2_0());
				}
				lv_value_2_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFieldValueRule());
					}
					set(
						$current,
						"value",
						lv_value_2_0,
						"org.osate.expr.Expr.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleUnionLiteral
entryRuleUnionLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnionLiteralRule()); }
	iv_ruleUnionLiteral=ruleUnionLiteral
	{ $current=$iv_ruleUnionLiteral.current; }
	EOF;

// Rule UnionLiteral
ruleUnionLiteral returns [EObject current=null]
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
				$current = forceCreateModelElement(
					grammarAccess.getUnionLiteralAccess().getUnionLiteralAction_0(),
					$current);
			}
		)
		otherlv_1='union'
		{
			newLeafNode(otherlv_1, grammarAccess.getUnionLiteralAccess().getUnionKeyword_1());
		}
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getUnionLiteralAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getUnionLiteralAccess().getFieldValueFieldValueParserRuleCall_3_0());
				}
				lv_fieldValue_3_0=ruleFieldValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUnionLiteralRule());
					}
					set(
						$current,
						"fieldValue",
						lv_fieldValue_3_0,
						"org.osate.expr.Expr.FieldValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getUnionLiteralAccess().getRightParenthesisKeyword_4());
		}
	)
;

// Entry rule entryRuleTupleLiteral
entryRuleTupleLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTupleLiteralRule()); }
	iv_ruleTupleLiteral=ruleTupleLiteral
	{ $current=$iv_ruleTupleLiteral.current; }
	EOF;

// Rule TupleLiteral
ruleTupleLiteral returns [EObject current=null]
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
				$current = forceCreateModelElement(
					grammarAccess.getTupleLiteralAccess().getTupleLiteralAction_0(),
					$current);
			}
		)
		otherlv_1='tuple'
		{
			newLeafNode(otherlv_1, grammarAccess.getTupleLiteralAccess().getTupleKeyword_1());
		}
		{
			/* */
		}
		{
			if ($current==null) {
				$current = createModelElement(grammarAccess.getTupleLiteralRule());
			}
			newCompositeNode(grammarAccess.getTupleLiteralAccess().getExpressionListParserRuleCall_2());
		}
		this_ExpressionList_2=ruleExpressionList[$current]
		{
			$current = $this_ExpressionList_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleBagLiteral
entryRuleBagLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBagLiteralRule()); }
	iv_ruleBagLiteral=ruleBagLiteral
	{ $current=$iv_ruleBagLiteral.current; }
	EOF;

// Rule BagLiteral
ruleBagLiteral returns [EObject current=null]
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
				$current = forceCreateModelElement(
					grammarAccess.getBagLiteralAccess().getBagLiteralAction_0(),
					$current);
			}
		)
		otherlv_1='bag'
		{
			newLeafNode(otherlv_1, grammarAccess.getBagLiteralAccess().getBagKeyword_1());
		}
		{
			/* */
		}
		{
			if ($current==null) {
				$current = createModelElement(grammarAccess.getBagLiteralRule());
			}
			newCompositeNode(grammarAccess.getBagLiteralAccess().getExpressionListParserRuleCall_2());
		}
		this_ExpressionList_2=ruleExpressionList[$current]
		{
			$current = $this_ExpressionList_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleMapLiteral
entryRuleMapLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMapLiteralRule()); }
	iv_ruleMapLiteral=ruleMapLiteral
	{ $current=$iv_ruleMapLiteral.current; }
	EOF;

// Rule MapLiteral
ruleMapLiteral returns [EObject current=null]
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
				$current = forceCreateModelElement(
					grammarAccess.getMapLiteralAccess().getMapLiteralAction_0(),
					$current);
			}
		)
		otherlv_1='map'
		{
			newLeafNode(otherlv_1, grammarAccess.getMapLiteralAccess().getMapKeyword_1());
		}
	)
;

// Entry rule entryRuleUnitLiteral
entryRuleUnitLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnitLiteralRule()); }
	iv_ruleUnitLiteral=ruleUnitLiteral
	{ $current=$iv_ruleUnitLiteral.current; }
	EOF;

// Rule UnitLiteral
ruleUnitLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getUnitLiteralAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getUnitLiteralRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.osate.expr.Expr.ID");
			}
		)
	)
;

// Entry rule entryRuleUnitLiteralConversion
entryRuleUnitLiteralConversion returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnitLiteralConversionRule()); }
	iv_ruleUnitLiteralConversion=ruleUnitLiteralConversion
	{ $current=$iv_ruleUnitLiteralConversion.current; }
	EOF;

// Rule UnitLiteralConversion
ruleUnitLiteralConversion returns [EObject current=null]
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
					newLeafNode(lv_name_0_0, grammarAccess.getUnitLiteralConversionAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnitLiteralConversionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.osate.expr.Expr.ID");
				}
			)
		)
		otherlv_1='=>'
		{
			newLeafNode(otherlv_1, grammarAccess.getUnitLiteralConversionAccess().getEqualsSignGreaterThanSignKeyword_1());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnitLiteralConversionRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getUnitLiteralConversionAccess().getBaseUnitUnitLiteralCrossReference_2_0());
				}
			)
		)
		otherlv_3='*'
		{
			newLeafNode(otherlv_3, grammarAccess.getUnitLiteralConversionAccess().getAsteriskKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getUnitLiteralConversionAccess().getFactorNumberValueParserRuleCall_4_0());
				}
				lv_factor_4_0=ruleNumberValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUnitLiteralConversionRule());
					}
					set(
						$current,
						"factor",
						lv_factor_4_0,
						"org.osate.expr.Expr.NumberValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleNumberValue
entryRuleNumberValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNumberValueRule()); }
	iv_ruleNumberValue=ruleNumberValue
	{ $current=$iv_ruleNumberValue.current; }
	EOF;

// Rule NumberValue
ruleNumberValue returns [EObject current=null]
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
			newCompositeNode(grammarAccess.getNumberValueAccess().getEIntegerLiteralParserRuleCall_0());
		}
		this_EIntegerLiteral_0=ruleEIntegerLiteral
		{
			$current = $this_EIntegerLiteral_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getNumberValueAccess().getERealLiteralParserRuleCall_1());
		}
		this_ERealLiteral_1=ruleERealLiteral
		{
			$current = $this_ERealLiteral_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleINTVALUE
entryRuleINTVALUE returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getINTVALUERule()); }
	iv_ruleINTVALUE=ruleINTVALUE
	{ $current=$iv_ruleINTVALUE.current; }
	EOF;

// Rule INTVALUE
ruleINTVALUE returns [EObject current=null]
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
				$current = forceCreateModelElement(
					grammarAccess.getINTVALUEAccess().getIntegerAction_0(),
					$current);
			}
		)
		this_INTEGER_LIT_1=RULE_INTEGER_LIT
		{
			newLeafNode(this_INTEGER_LIT_1, grammarAccess.getINTVALUEAccess().getINTEGER_LITTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleQCREF
entryRuleQCREF returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQCREFRule()); }
	iv_ruleQCREF=ruleQCREF
	{ $current=$iv_ruleQCREF.current.getText(); }
	EOF;

// Rule QCREF
ruleQCREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			this_ID_0=RULE_ID
			{
				$current.merge(this_ID_0);
			}
			{
				newLeafNode(this_ID_0, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_0_0());
			}
			kw='::'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQCREFAccess().getColonColonKeyword_0_1());
			}
		)*
		this_ID_2=RULE_ID
		{
			$current.merge(this_ID_2);
		}
		{
			newLeafNode(this_ID_2, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleQPREF
entryRuleQPREF returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQPREFRule()); }
	iv_ruleQPREF=ruleQPREF
	{ $current=$iv_ruleQPREF.current.getText(); }
	EOF;

// Rule QPREF
ruleQPREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			this_ID_0=RULE_ID
			{
				$current.merge(this_ID_0);
			}
			{
				newLeafNode(this_ID_0, grammarAccess.getQPREFAccess().getIDTerminalRuleCall_0_0());
			}
			kw='::'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQPREFAccess().getColonColonKeyword_0_1());
			}
		)*
		this_ID_2=RULE_ID
		{
			$current.merge(this_ID_2);
		}
		{
			newLeafNode(this_ID_2, grammarAccess.getQPREFAccess().getIDTerminalRuleCall_1());
		}
		(
			kw=':'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQPREFAccess().getColonKeyword_2_0());
			}
			this_ID_4=RULE_ID
			{
				$current.merge(this_ID_4);
			}
			{
				newLeafNode(this_ID_4, grammarAccess.getQPREFAccess().getIDTerminalRuleCall_2_1());
			}
		)?
	)
;

// Entry rule entryRuleNoQuoteString
entryRuleNoQuoteString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getNoQuoteStringRule()); }
	iv_ruleNoQuoteString=ruleNoQuoteString
	{ $current=$iv_ruleNoQuoteString.current.getText(); }
	EOF;

// Rule NoQuoteString
ruleNoQuoteString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_STRING_0=RULE_STRING
	{
		$current.merge(this_STRING_0);
	}
	{
		newLeafNode(this_STRING_0, grammarAccess.getNoQuoteStringAccess().getSTRINGTerminalRuleCall());
	}
;

// Rule MetaClassEnum
ruleMetaClassEnum returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='component'
			{
				$current = grammarAccess.getMetaClassEnumAccess().getCOMPONENTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getMetaClassEnumAccess().getCOMPONENTEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='feature'
			{
				$current = grammarAccess.getMetaClassEnumAccess().getFEATUREEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getMetaClassEnumAccess().getFEATUREEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='connection'
			{
				$current = grammarAccess.getMetaClassEnumAccess().getCONNECTIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getMetaClassEnumAccess().getCONNECTIONEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='flow'
			{
				$current = grammarAccess.getMetaClassEnumAccess().getFLOWEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getMetaClassEnumAccess().getFLOWEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='mode'
			{
				$current = grammarAccess.getMetaClassEnumAccess().getMODEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getMetaClassEnumAccess().getMODEEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='property'
			{
				$current = grammarAccess.getMetaClassEnumAccess().getPROPERTYEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getMetaClassEnumAccess().getPROPERTYEnumLiteralDeclaration_5());
			}
		)
	)
;

fragment RULE_EXPONENT : ('e'|'E') ('+'|'-')? RULE_DIGIT+;

fragment RULE_INT_EXPONENT : ('e'|'E') '+'? RULE_DIGIT+;

RULE_REAL_LIT : RULE_DIGIT+ ('_' RULE_DIGIT+)* '.' RULE_DIGIT+ ('_' RULE_DIGIT+)* RULE_EXPONENT?;

RULE_INTEGER_LIT : RULE_DIGIT+ ('_' RULE_DIGIT+)* ('#' RULE_BASED_INTEGER '#' RULE_INT_EXPONENT?|RULE_INT_EXPONENT?);

fragment RULE_DIGIT : '0'..'9';

fragment RULE_EXTENDED_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F');

fragment RULE_BASED_INTEGER : ('2'|'8'|'X');

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ID : ('a'..'z'|'A'..'Z') ('_'? ('a'..'z'|'A'..'Z'|'0'..'9'))*;

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;
