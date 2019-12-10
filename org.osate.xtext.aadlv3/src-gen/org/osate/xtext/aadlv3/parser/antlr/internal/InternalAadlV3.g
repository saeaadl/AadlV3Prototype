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
				{
					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getAnnotationsAnnotationParserRuleCall_0_0());
				}
				lv_annotations_0_0=ruleAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_0_0,
						"org.osate.xtext.aadlv3.AadlV3.Annotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				lv_private_1_0='private'
				{
					newLeafNode(lv_private_1_0, grammarAccess.getPackageDeclarationAccess().getPrivatePrivateKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPackageDeclarationRule());
					}
					setWithLastConsumed($current, "private", true, "private");
				}
			)
		)?
		otherlv_2='package'
		{
			newLeafNode(otherlv_2, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_3_0());
				}
				lv_name_3_0=ruleQualifiedName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
					}
					set(
						$current,
						"name",
						lv_name_3_0,
						"org.osate.xtext.aadlv3.AadlV3.QualifiedName");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='is'
		{
			newLeafNode(otherlv_4, grammarAccess.getPackageDeclarationAccess().getIsKeyword_4());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsAnnexLibraryParserRuleCall_5_0_0());
					}
					lv_elements_5_0=ruleAnnexLibrary
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
						}
						add(
							$current,
							"elements",
							lv_elements_5_0,
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
							newCompositeNode(grammarAccess.getPackageDeclarationAccess().getImportsImportParserRuleCall_5_1_0_0());
						}
						lv_imports_6_0=ruleImport
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
							}
							add(
								$current,
								"imports",
								lv_imports_6_0,
								"org.osate.xtext.aadlv3.AadlV3.Import");
							afterParserOrEnumRuleCall();
						}
					)
				)
				    |
				(
					(
						{
							newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsPackageElementParserRuleCall_5_1_1_0());
						}
						lv_elements_7_0=rulePackageElement
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
							}
							add(
								$current,
								"elements",
								lv_elements_7_0,
								"org.osate.xtext.aadlv3.AadlV3.PackageElement");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)
		otherlv_8='end'
		{
			newLeafNode(otherlv_8, grammarAccess.getPackageDeclarationAccess().getEndKeyword_6());
		}
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getPackageDeclarationAccess().getSemicolonKeyword_7());
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
						"org.eclipse.xtext.common.Terminals.ID");
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
			newCompositeNode(grammarAccess.getPackageElementAccess().getTypeDefParserRuleCall_7());
		}
		this_TypeDef_7=ruleTypeDef
		{
			$current = $this_TypeDef_7.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPackageElementAccess().getConstantDefParserRuleCall_8());
		}
		this_ConstantDef_8=ruleConstantDef
		{
			$current = $this_ConstantDef_8.current;
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
				{
					newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getAnnotationsAnnotationParserRuleCall_0_0());
				}
				lv_annotations_0_0=ruleAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_0_0,
						"org.osate.xtext.aadlv3.AadlV3.Annotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				lv_private_1_0='private'
				{
					newLeafNode(lv_private_1_0, grammarAccess.getPropertyDefinitionAccess().getPrivatePrivateKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPropertyDefinitionRule());
					}
					setWithLastConsumed($current, "private", true, "private");
				}
			)
		)?
		otherlv_2='property'
		{
			newLeafNode(otherlv_2, grammarAccess.getPropertyDefinitionAccess().getPropertyKeyword_2());
		}
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getPropertyDefinitionAccess().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPropertyDefinitionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_4=':'
		{
			newLeafNode(otherlv_4, grammarAccess.getPropertyDefinitionAccess().getColonKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getTypeTypeParserRuleCall_5_0());
				}
				lv_type_5_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
					}
					set(
						$current,
						"type",
						lv_type_5_0,
						"org.osate.xtext.aadlv3.AadlV3.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_6='for'
			{
				newLeafNode(otherlv_6, grammarAccess.getPropertyDefinitionAccess().getForKeyword_6_0());
			}
			otherlv_7='('
			{
				newLeafNode(otherlv_7, grammarAccess.getPropertyDefinitionAccess().getLeftParenthesisKeyword_6_1());
			}
			(
				(
					(
						lv_forAll_8_0='all'
						{
							newLeafNode(lv_forAll_8_0, grammarAccess.getPropertyDefinitionAccess().getForAllAllKeyword_6_2_0_0());
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
						newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getAppliesToParserRuleCall_6_2_1_0());
					}
					this_AppliesTo_9=ruleAppliesTo[$current]
					{
						$current = $this_AppliesTo_9.current;
						afterParserOrEnumRuleCall();
					}
					(
						otherlv_10=','
						{
							newLeafNode(otherlv_10, grammarAccess.getPropertyDefinitionAccess().getCommaKeyword_6_2_1_1_0());
						}
						{
							/* */
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getPropertyDefinitionRule());
							}
							newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getAppliesToParserRuleCall_6_2_1_1_1());
						}
						this_AppliesTo_11=ruleAppliesTo[$current]
						{
							$current = $this_AppliesTo_11.current;
							afterParserOrEnumRuleCall();
						}
					)*
				)
			)
			otherlv_12=')'
			{
				newLeafNode(otherlv_12, grammarAccess.getPropertyDefinitionAccess().getRightParenthesisKeyword_6_3());
			}
		)?
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_7());
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
				{
					newCompositeNode(grammarAccess.getPropertySetAccess().getAnnotationsAnnotationParserRuleCall_0_0());
				}
				lv_annotations_0_0=ruleAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPropertySetRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_0_0,
						"org.osate.xtext.aadlv3.AadlV3.Annotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				lv_private_1_0='private'
				{
					newLeafNode(lv_private_1_0, grammarAccess.getPropertySetAccess().getPrivatePrivateKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPropertySetRule());
					}
					setWithLastConsumed($current, "private", true, "private");
				}
			)
		)?
		otherlv_2='properties'
		{
			newLeafNode(otherlv_2, grammarAccess.getPropertySetAccess().getPropertiesKeyword_2());
		}
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getPropertySetAccess().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPropertySetRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_4=':'
		{
			newLeafNode(otherlv_4, grammarAccess.getPropertySetAccess().getColonKeyword_4());
		}
		otherlv_5='{'
		{
			newLeafNode(otherlv_5, grammarAccess.getPropertySetAccess().getLeftCurlyBracketKeyword_5());
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
					newCompositeNode(grammarAccess.getPropertySetAccess().getPropertiesPropertyDefinitionCrossReference_6_0());
				}
				ruleQualifiedReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_7=','
			{
				newLeafNode(otherlv_7, grammarAccess.getPropertySetAccess().getCommaKeyword_7_0());
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
						newCompositeNode(grammarAccess.getPropertySetAccess().getPropertiesPropertyDefinitionCrossReference_7_1_0());
					}
					ruleQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getPropertySetAccess().getRightCurlyBracketKeyword_8());
		}
		otherlv_10=';'
		{
			newLeafNode(otherlv_10, grammarAccess.getPropertySetAccess().getSemicolonKeyword_9());
		}
	)
;

// Entry rule entryRuleTypeDef
entryRuleTypeDef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeDefRule()); }
	iv_ruleTypeDef=ruleTypeDef
	{ $current=$iv_ruleTypeDef.current; }
	EOF;

// Rule TypeDef
ruleTypeDef returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getTypeDefAccess().getAnnotationsAnnotationParserRuleCall_0_0());
				}
				lv_annotations_0_0=ruleAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTypeDefRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_0_0,
						"org.osate.xtext.aadlv3.AadlV3.Annotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				lv_private_1_0='private'
				{
					newLeafNode(lv_private_1_0, grammarAccess.getTypeDefAccess().getPrivatePrivateKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTypeDefRule());
					}
					setWithLastConsumed($current, "private", true, "private");
				}
			)
		)?
		otherlv_2='type'
		{
			newLeafNode(otherlv_2, grammarAccess.getTypeDefAccess().getTypeKeyword_2());
		}
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTypeDefRule());
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
				newLeafNode(otherlv_4, grammarAccess.getTypeDefAccess().getExtendsKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTypeDefAccess().getSuperTypeTypeParserRuleCall_4_1_0());
					}
					lv_superType_5_0=ruleType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTypeDefRule());
						}
						set(
							$current,
							"superType",
							lv_superType_5_0,
							"org.osate.xtext.aadlv3.AadlV3.Type");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_6=':'
			{
				newLeafNode(otherlv_6, grammarAccess.getTypeDefAccess().getColonKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTypeDefAccess().getBaseTypeTypeParserRuleCall_5_1_0());
					}
					lv_baseType_7_0=ruleType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTypeDefRule());
						}
						set(
							$current,
							"baseType",
							lv_baseType_7_0,
							"org.osate.xtext.aadlv3.AadlV3.Type");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			{
				/* */
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getTypeDefRule());
				}
				newCompositeNode(grammarAccess.getTypeDefAccess().getPropertiesBlockParserRuleCall_6());
			}
			this_PropertiesBlock_8=rulePropertiesBlock[$current]
			{
				$current = $this_PropertiesBlock_8.current;
				afterParserOrEnumRuleCall();
			}
		)?
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getTypeDefAccess().getSemicolonKeyword_7());
		}
	)
;

// Entry rule entryRuleConstantDef
entryRuleConstantDef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConstantDefRule()); }
	iv_ruleConstantDef=ruleConstantDef
	{ $current=$iv_ruleConstantDef.current; }
	EOF;

// Rule ConstantDef
ruleConstantDef returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getConstantDefAccess().getAnnotationsAnnotationParserRuleCall_0_0());
				}
				lv_annotations_0_0=ruleAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConstantDefRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_0_0,
						"org.osate.xtext.aadlv3.AadlV3.Annotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				lv_private_1_0='private'
				{
					newLeafNode(lv_private_1_0, grammarAccess.getConstantDefAccess().getPrivatePrivateKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConstantDefRule());
					}
					setWithLastConsumed($current, "private", true, "private");
				}
			)
		)?
		otherlv_2='constant'
		{
			newLeafNode(otherlv_2, grammarAccess.getConstantDefAccess().getConstantKeyword_2());
		}
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getConstantDefAccess().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConstantDefRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_4=':'
		{
			newLeafNode(otherlv_4, grammarAccess.getConstantDefAccess().getColonKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConstantDefAccess().getValueLiteralParserRuleCall_5_0());
				}
				lv_value_5_0=ruleLiteral
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConstantDefRule());
					}
					set(
						$current,
						"value",
						lv_value_5_0,
						"org.osate.xtext.aadlv3.AadlV3.Literal");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6=';'
		{
			newLeafNode(otherlv_6, grammarAccess.getConstantDefAccess().getSemicolonKeyword_6());
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
					newCompositeNode(grammarAccess.getPropertyAssociationAccess().getValueLiteralParserRuleCall_4_0());
				}
				lv_value_4_0=ruleLiteral
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPropertyAssociationRule());
					}
					set(
						$current,
						"value",
						lv_value_4_0,
						"org.osate.xtext.aadlv3.AadlV3.Literal");
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
							grammarAccess.getModelElementReferenceAccess().getNamedElementReferenceContextAction_1_0_0(),
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

// Entry rule entryRuleNamedElementReference
entryRuleNamedElementReference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNamedElementReferenceRule()); }
	iv_ruleNamedElementReference=ruleNamedElementReference
	{ $current=$iv_ruleNamedElementReference.current; }
	EOF;

// Rule NamedElementReference
ruleNamedElementReference returns [EObject current=null]
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
						$current = createModelElement(grammarAccess.getNamedElementReferenceRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getNamedElementReferenceAccess().getElementNamedElementCrossReference_0_0());
				}
				ruleQualifiedReference
				{
					afterParserOrEnumRuleCall();
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
							grammarAccess.getNamedElementReferenceAccess().getNamedElementReferenceContextAction_1_0_0(),
							$current);
					}
				)
				otherlv_2='.'
				{
					newLeafNode(otherlv_2, grammarAccess.getNamedElementReferenceAccess().getFullStopKeyword_1_0_1());
				}
				(
					(
						{
							/* */
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getNamedElementReferenceRule());
							}
						}
						otherlv_3=RULE_ID
						{
							newLeafNode(otherlv_3, grammarAccess.getNamedElementReferenceAccess().getElementModelElementCrossReference_1_0_2_0());
						}
					)
				)
			)
		)*
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
				{
					newCompositeNode(grammarAccess.getComponentInterfaceAccess().getAnnotationsAnnotationParserRuleCall_0_0());
				}
				lv_annotations_0_0=ruleAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_0_0,
						"org.osate.xtext.aadlv3.AadlV3.Annotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				lv_private_1_0='private'
				{
					newLeafNode(lv_private_1_0, grammarAccess.getComponentInterfaceAccess().getPrivatePrivateKeyword_1_0());
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
					newCompositeNode(grammarAccess.getComponentInterfaceAccess().getCategoryComponentCategoryParserRuleCall_2_0());
				}
				lv_category_2_0=ruleComponentCategory
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
					}
					set(
						$current,
						"category",
						lv_category_2_0,
						"org.osate.xtext.aadlv3.AadlV3.ComponentCategory");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_3='interface'
		{
			newLeafNode(otherlv_3, grammarAccess.getComponentInterfaceAccess().getInterfaceKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_ID
				{
					newLeafNode(lv_name_4_0, grammarAccess.getComponentInterfaceAccess().getNameIDTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponentInterfaceRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_4_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_5='extends'
			{
				newLeafNode(otherlv_5, grammarAccess.getComponentInterfaceAccess().getExtendsKeyword_5_0());
			}
			{
				/* */
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getComponentInterfaceRule());
				}
				newCompositeNode(grammarAccess.getComponentInterfaceAccess().getInterfaceExtensionsParserRuleCall_5_1());
			}
			this_InterfaceExtensions_6=ruleInterfaceExtensions[$current]
			{
				$current = $this_InterfaceExtensions_6.current;
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
			newCompositeNode(grammarAccess.getComponentInterfaceAccess().getInterfaceBodyParserRuleCall_6());
		}
		this_InterfaceBody_7=ruleInterfaceBody[$current]
		{
			$current = $this_InterfaceBody_7.current;
			afterParserOrEnumRuleCall();
		}
		otherlv_8=';'
		{
			newLeafNode(otherlv_8, grammarAccess.getComponentInterfaceAccess().getSemicolonKeyword_7());
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
					newCompositeNode(grammarAccess.getInterfaceElementAccess().getStateVariablesStateVariableParserRuleCall_1_0());
				}
				lv_stateVariables_1_0=ruleStateVariable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInterfaceElementRule());
					}
					add(
						$current,
						"stateVariables",
						lv_stateVariables_1_0,
						"org.osate.xtext.aadlv3.AadlV3.StateVariable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getInterfaceElementAccess().getBehaviorRulesTransitionRuleParserRuleCall_2_0());
				}
				lv_behaviorRules_2_0=ruleTransitionRule
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInterfaceElementRule());
					}
					add(
						$current,
						"behaviorRules",
						lv_behaviorRules_2_0,
						"org.osate.xtext.aadlv3.AadlV3.TransitionRule");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getInterfaceElementAccess().getBehaviorRulesFlowRuleParserRuleCall_3_0());
				}
				lv_behaviorRules_3_0=ruleFlowRule
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInterfaceElementRule());
					}
					add(
						$current,
						"behaviorRules",
						lv_behaviorRules_3_0,
						"org.osate.xtext.aadlv3.AadlV3.FlowRule");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getInterfaceElementAccess().getGeneratorsGeneratorParserRuleCall_4_0());
				}
				lv_generators_4_0=ruleGenerator
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInterfaceElementRule());
					}
					add(
						$current,
						"generators",
						lv_generators_4_0,
						"org.osate.xtext.aadlv3.AadlV3.Generator");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getInterfaceElementAccess().getOwnedPropertyAssociationsPropertyAssociationParserRuleCall_5_0());
				}
				lv_ownedPropertyAssociations_5_0=rulePropertyAssociation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInterfaceElementRule());
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
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getInterfaceElementAccess().getAnnexSubclauseAnnexSubclauseParserRuleCall_6_0());
				}
				lv_annexSubclause_6_0=ruleAnnexSubclause
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInterfaceElementRule());
					}
					add(
						$current,
						"annexSubclause",
						lv_annexSubclause_6_0,
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
				{
					newCompositeNode(grammarAccess.getComponentImplementationAccess().getAnnotationsAnnotationParserRuleCall_0_0());
				}
				lv_annotations_0_0=ruleAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentImplementationRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_0_0,
						"org.osate.xtext.aadlv3.AadlV3.Annotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				lv_private_1_0='private'
				{
					newLeafNode(lv_private_1_0, grammarAccess.getComponentImplementationAccess().getPrivatePrivateKeyword_1_0());
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
					newCompositeNode(grammarAccess.getComponentImplementationAccess().getCategoryComponentCategoryParserRuleCall_2_0());
				}
				lv_category_2_0=ruleComponentCategory
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentImplementationRule());
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
					newCompositeNode(grammarAccess.getComponentImplementationAccess().getNameDottedNameParserRuleCall_3_0());
				}
				lv_name_3_0=ruleDottedName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentImplementationRule());
					}
					set(
						$current,
						"name",
						lv_name_3_0,
						"org.osate.xtext.aadlv3.AadlV3.DottedName");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4='extends'
			{
				newLeafNode(otherlv_4, grammarAccess.getComponentImplementationAccess().getExtendsKeyword_4_0());
			}
			{
				/* */
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getComponentImplementationRule());
				}
				newCompositeNode(grammarAccess.getComponentImplementationAccess().getImplementationExtensionsParserRuleCall_4_1());
			}
			this_ImplementationExtensions_5=ruleImplementationExtensions[$current]
			{
				$current = $this_ImplementationExtensions_5.current;
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
			newCompositeNode(grammarAccess.getComponentImplementationAccess().getImplementationBodyParserRuleCall_5());
		}
		this_ImplementationBody_6=ruleImplementationBody[$current]
		{
			$current = $this_ImplementationBody_6.current;
			afterParserOrEnumRuleCall();
		}
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getComponentImplementationAccess().getSemicolonKeyword_6());
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
					newCompositeNode(grammarAccess.getImplementationElementAccess().getComponentsSubcomponentParserRuleCall_2_0());
				}
				lv_components_2_0=ruleSubcomponent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImplementationElementRule());
					}
					add(
						$current,
						"components",
						lv_components_2_0,
						"org.osate.xtext.aadlv3.AadlV3.Subcomponent");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getImplementationElementAccess().getPathsEndToEndFlowParserRuleCall_3_0());
				}
				lv_paths_3_0=ruleEndToEndFlow
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImplementationElementRule());
					}
					add(
						$current,
						"paths",
						lv_paths_3_0,
						"org.osate.xtext.aadlv3.AadlV3.EndToEndFlow");
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
					newCompositeNode(grammarAccess.getImplementationElementAccess().getStateVariablesStateVariableParserRuleCall_7_0());
				}
				lv_stateVariables_7_0=ruleStateVariable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImplementationElementRule());
					}
					add(
						$current,
						"stateVariables",
						lv_stateVariables_7_0,
						"org.osate.xtext.aadlv3.AadlV3.StateVariable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getImplementationElementAccess().getBehaviorRulesTransitionRuleParserRuleCall_8_0());
				}
				lv_behaviorRules_8_0=ruleTransitionRule
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImplementationElementRule());
					}
					add(
						$current,
						"behaviorRules",
						lv_behaviorRules_8_0,
						"org.osate.xtext.aadlv3.AadlV3.TransitionRule");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getImplementationElementAccess().getBehaviorRulesFlowRuleParserRuleCall_9_0());
				}
				lv_behaviorRules_9_0=ruleFlowRule
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImplementationElementRule());
					}
					add(
						$current,
						"behaviorRules",
						lv_behaviorRules_9_0,
						"org.osate.xtext.aadlv3.AadlV3.FlowRule");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getImplementationElementAccess().getGeneratorsGeneratorParserRuleCall_10_0());
				}
				lv_generators_10_0=ruleGenerator
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImplementationElementRule());
					}
					add(
						$current,
						"generators",
						lv_generators_10_0,
						"org.osate.xtext.aadlv3.AadlV3.Generator");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getImplementationElementAccess().getOwnedPropertyAssociationsPropertyAssociationParserRuleCall_11_0());
				}
				lv_ownedPropertyAssociations_11_0=rulePropertyAssociation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImplementationElementRule());
					}
					add(
						$current,
						"ownedPropertyAssociations",
						lv_ownedPropertyAssociations_11_0,
						"org.osate.xtext.aadlv3.AadlV3.PropertyAssociation");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getImplementationElementAccess().getAnnexSubclauseAnnexSubclauseParserRuleCall_12_0());
				}
				lv_annexSubclause_12_0=ruleAnnexSubclause
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImplementationElementRule());
					}
					add(
						$current,
						"annexSubclause",
						lv_annexSubclause_12_0,
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
				{
					newCompositeNode(grammarAccess.getComponentConfigurationAccess().getAnnotationsAnnotationParserRuleCall_0_0());
				}
				lv_annotations_0_0=ruleAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentConfigurationRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_0_0,
						"org.osate.xtext.aadlv3.AadlV3.Annotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				lv_private_1_0='private'
				{
					newLeafNode(lv_private_1_0, grammarAccess.getComponentConfigurationAccess().getPrivatePrivateKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponentConfigurationRule());
					}
					setWithLastConsumed($current, "private", true, "private");
				}
			)
		)?
		otherlv_2='configuration'
		{
			newLeafNode(otherlv_2, grammarAccess.getComponentConfigurationAccess().getConfigurationKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentConfigurationAccess().getNameDottedNameParserRuleCall_3_0());
				}
				lv_name_3_0=ruleDottedName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentConfigurationRule());
					}
					set(
						$current,
						"name",
						lv_name_3_0,
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
				newCompositeNode(grammarAccess.getComponentConfigurationAccess().getParametersParserRuleCall_4());
			}
			this_Parameters_4=ruleParameters[$current]
			{
				$current = $this_Parameters_4.current;
				afterParserOrEnumRuleCall();
			}
		)?
		(
			otherlv_5='extends'
			{
				newLeafNode(otherlv_5, grammarAccess.getComponentConfigurationAccess().getExtendsKeyword_5_0());
			}
			{
				/* */
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getComponentConfigurationRule());
				}
				newCompositeNode(grammarAccess.getComponentConfigurationAccess().getConfigurationExtensionsParserRuleCall_5_1());
			}
			this_ConfigurationExtensions_6=ruleConfigurationExtensions[$current]
			{
				$current = $this_ConfigurationExtensions_6.current;
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
			newCompositeNode(grammarAccess.getComponentConfigurationAccess().getConfigurationElementBlockParserRuleCall_6());
		}
		this_ConfigurationElementBlock_7=ruleConfigurationElementBlock[$current]
		{
			$current = $this_ConfigurationElementBlock_7.current;
			afterParserOrEnumRuleCall();
		}
		otherlv_8=';'
		{
			newLeafNode(otherlv_8, grammarAccess.getComponentConfigurationAccess().getSemicolonKeyword_7());
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
				{
					newCompositeNode(grammarAccess.getFeatureAccess().getAnnotationsAnnotationParserRuleCall_0_0());
				}
				lv_annotations_0_0=ruleAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_0_0,
						"org.osate.xtext.aadlv3.AadlV3.Annotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFeatureRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFeatureAccess().getDirectionFeatureDirectionParserRuleCall_3_0());
				}
				lv_direction_3_0=ruleFeatureDirection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureRule());
					}
					set(
						$current,
						"direction",
						lv_direction_3_0,
						"org.osate.xtext.aadlv3.AadlV3.FeatureDirection");
					afterParserOrEnumRuleCall();
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
				{
					newCompositeNode(grammarAccess.getFeatureAccess().getTypeReferenceReversableTypeReferenceParserRuleCall_5_0());
				}
				lv_typeReference_5_0=ruleReversableTypeReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureRule());
					}
					set(
						$current,
						"typeReference",
						lv_typeReference_5_0,
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
				newCompositeNode(grammarAccess.getFeatureAccess().getPropertiesBlockParserRuleCall_6());
			}
			this_PropertiesBlock_6=rulePropertiesBlock[$current]
			{
				$current = $this_PropertiesBlock_6.current;
				afterParserOrEnumRuleCall();
			}
		)?
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getFeatureAccess().getSemicolonKeyword_7());
		}
	)
;

// Entry rule entryRuleSubcomponent
entryRuleSubcomponent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSubcomponentRule()); }
	iv_ruleSubcomponent=ruleSubcomponent
	{ $current=$iv_ruleSubcomponent.current; }
	EOF;

// Rule Subcomponent
ruleSubcomponent returns [EObject current=null]
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
					grammarAccess.getSubcomponentAccess().getSubcomponentAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getSubcomponentAccess().getAnnotationsAnnotationParserRuleCall_1_0());
				}
				lv_annotations_1_0=ruleAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSubcomponentRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_1_0,
						"org.osate.xtext.aadlv3.AadlV3.Annotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getSubcomponentAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSubcomponentRule());
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
			newLeafNode(otherlv_3, grammarAccess.getSubcomponentAccess().getColonKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSubcomponentAccess().getCategoryComponentCategoryParserRuleCall_4_0());
				}
				lv_category_4_0=ruleComponentCategory
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSubcomponentRule());
					}
					set(
						$current,
						"category",
						lv_category_4_0,
						"org.osate.xtext.aadlv3.AadlV3.ComponentCategory");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getSubcomponentAccess().getTypeReferencesClassifierOrTypeReferenceParserRuleCall_5_0());
				}
				lv_typeReferences_5_0=ruleClassifierOrTypeReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSubcomponentRule());
					}
					add(
						$current,
						"typeReferences",
						lv_typeReferences_5_0,
						"org.osate.xtext.aadlv3.AadlV3.ClassifierOrTypeReference");
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
					$current = createModelElement(grammarAccess.getSubcomponentRule());
				}
				newCompositeNode(grammarAccess.getSubcomponentAccess().getNestedComponentImplementationBlockParserRuleCall_6());
			}
			this_NestedComponentImplementationBlock_6=ruleNestedComponentImplementationBlock[$current]
			{
				$current = $this_NestedComponentImplementationBlock_6.current;
				afterParserOrEnumRuleCall();
			}
		)?
		(
			{
				/* */
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getSubcomponentRule());
				}
				newCompositeNode(grammarAccess.getSubcomponentAccess().getInModesParserRuleCall_7());
			}
			this_InModes_7=ruleInModes[$current]
			{
				$current = $this_InModes_7.current;
				afterParserOrEnumRuleCall();
			}
		)?
		otherlv_8=';'
		{
			newLeafNode(otherlv_8, grammarAccess.getSubcomponentAccess().getSemicolonKeyword_8());
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
		(
			{
				/* */
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getConnectionRule());
				}
				newCompositeNode(grammarAccess.getConnectionAccess().getInModesParserRuleCall_7());
			}
			this_InModes_8=ruleInModes[$current]
			{
				$current = $this_InModes_8.current;
				afterParserOrEnumRuleCall();
			}
		)?
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getConnectionAccess().getSemicolonKeyword_8());
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
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBindingRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getBindingAccess().getBindingTypeTypeDefCrossReference_2_0());
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
		(
			{
				/* */
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getBindingRule());
				}
				newCompositeNode(grammarAccess.getBindingAccess().getInModesParserRuleCall_8());
			}
			this_InModes_8=ruleInModes[$current]
			{
				$current = $this_InModes_8.current;
				afterParserOrEnumRuleCall();
			}
		)?
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getBindingAccess().getSemicolonKeyword_9());
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


// Rule InModes
ruleInModes[EObject in_current]  returns [EObject current=in_current]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='when'
		{
			newLeafNode(otherlv_0, grammarAccess.getInModesAccess().getWhenKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInModesAccess().getInModesModelElementContainsLiteralParserRuleCall_1_0());
				}
				lv_inModes_1_0=ruleModelElementContainsLiteral
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInModesRule());
					}
					set(
						$current,
						"inModes",
						lv_inModes_1_0,
						"org.osate.xtext.aadlv3.AadlV3.ModelElementContainsLiteral");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleEndToEndFlow
entryRuleEndToEndFlow returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEndToEndFlowRule()); }
	iv_ruleEndToEndFlow=ruleEndToEndFlow
	{ $current=$iv_ruleEndToEndFlow.current; }
	EOF;

// Rule EndToEndFlow
ruleEndToEndFlow returns [EObject current=null]
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
					newLeafNode(lv_name_0_0, grammarAccess.getEndToEndFlowAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEndToEndFlowRule());
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
			newLeafNode(otherlv_1, grammarAccess.getEndToEndFlowAccess().getColonKeyword_1());
		}
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getEndToEndFlowAccess().getEndToEndFLowKeywordsParserRuleCall_2());
		}
		ruleEndToEndFLowKeywords
		{
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEndToEndFlowAccess().getElementsPathElementParserRuleCall_3_0());
				}
				lv_elements_3_0=rulePathElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEndToEndFlowRule());
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
				newLeafNode(otherlv_4, grammarAccess.getEndToEndFlowAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getEndToEndFlowAccess().getElementsPathElementParserRuleCall_4_1_0());
					}
					lv_elements_5_0=rulePathElement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEndToEndFlowRule());
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
					$current = createModelElement(grammarAccess.getEndToEndFlowRule());
				}
				newCompositeNode(grammarAccess.getEndToEndFlowAccess().getPropertiesBlockParserRuleCall_5());
			}
			this_PropertiesBlock_6=rulePropertiesBlock[$current]
			{
				$current = $this_PropertiesBlock_6.current;
				afterParserOrEnumRuleCall();
			}
		)?
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getEndToEndFlowAccess().getSemicolonKeyword_6());
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
							"org.eclipse.xtext.common.Terminals.ID");
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
							newCompositeNode(grammarAccess.getClassifierAssignmentAccess().getAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_2_0_0_0());
						}
						lv_assignedClassifiers_2_0=ruleClassifierOrTypeReference
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getClassifierAssignmentRule());
							}
							add(
								$current,
								"assignedClassifiers",
								lv_assignedClassifiers_2_0,
								"org.osate.xtext.aadlv3.AadlV3.ClassifierOrTypeReference");
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
								newCompositeNode(grammarAccess.getClassifierAssignmentAccess().getAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_2_0_1_1_0());
							}
							lv_assignedClassifiers_4_0=ruleClassifierOrTypeReference
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getClassifierAssignmentRule());
								}
								add(
									$current,
									"assignedClassifiers",
									lv_assignedClassifiers_4_0,
									"org.osate.xtext.aadlv3.AadlV3.ClassifierOrTypeReference");
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
							newCompositeNode(grammarAccess.getClassifierAssignmentPatternAccess().getAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_2_0_0_0());
						}
						lv_assignedClassifiers_2_0=ruleClassifierOrTypeReference
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getClassifierAssignmentPatternRule());
							}
							add(
								$current,
								"assignedClassifiers",
								lv_assignedClassifiers_2_0,
								"org.osate.xtext.aadlv3.AadlV3.ClassifierOrTypeReference");
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
								newCompositeNode(grammarAccess.getClassifierAssignmentPatternAccess().getAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_2_0_1_1_0());
							}
							lv_assignedClassifiers_4_0=ruleClassifierOrTypeReference
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getClassifierAssignmentPatternRule());
								}
								add(
									$current,
									"assignedClassifiers",
									lv_assignedClassifiers_4_0,
									"org.osate.xtext.aadlv3.AadlV3.ClassifierOrTypeReference");
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
					newCompositeNode(grammarAccess.getQueryExpressionAccess().getTargetPatternTypeCrossReference_2_0());
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
					newCompositeNode(grammarAccess.getReversableTypeReferenceAccess().getTypeNamedTypeCrossReference_1_0());
				}
				ruleQualifiedReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleClassifierOrTypeReference
entryRuleClassifierOrTypeReference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClassifierOrTypeReferenceRule()); }
	iv_ruleClassifierOrTypeReference=ruleClassifierOrTypeReference
	{ $current=$iv_ruleClassifierOrTypeReference.current; }
	EOF;

// Rule ClassifierOrTypeReference
ruleClassifierOrTypeReference returns [EObject current=null]
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
						$current = createModelElement(grammarAccess.getClassifierOrTypeReferenceRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getClassifierOrTypeReferenceAccess().getTypeNamedTypeCrossReference_0_0());
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
					$current = createModelElement(grammarAccess.getClassifierOrTypeReferenceRule());
				}
				newCompositeNode(grammarAccess.getClassifierOrTypeReferenceAccess().getConfigurationActualsParserRuleCall_1());
			}
			this_ConfigurationActuals_1=ruleConfigurationActuals[$current]
			{
				$current = $this_ConfigurationActuals_1.current;
				afterParserOrEnumRuleCall();
			}
		)?
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
			{
				/* */
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getTypeReferenceRule());
				}
			}
			{
				newCompositeNode(grammarAccess.getTypeReferenceAccess().getTypeNamedTypeCrossReference_0());
			}
			ruleQualifiedName
			{
				afterParserOrEnumRuleCall();
			}
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
			newCompositeNode(grammarAccess.getTypeAccess().getTypeReferenceParserRuleCall_0());
		}
		this_TypeReference_0=ruleTypeReference
		{
			$current = $this_TypeReference_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getTypeAccess().getCompositeTypeParserRuleCall_1());
		}
		this_CompositeType_1=ruleCompositeType
		{
			$current = $this_CompositeType_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_2());
		}
		this_PrimitiveType_2=rulePrimitiveType
		{
			$current = $this_PrimitiveType_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getTypeAccess().getEnumerationTypeParserRuleCall_3());
		}
		this_EnumerationType_3=ruleEnumerationType
		{
			$current = $this_EnumerationType_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEnumerationType
entryRuleEnumerationType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEnumerationTypeRule()); }
	iv_ruleEnumerationType=ruleEnumerationType
	{ $current=$iv_ruleEnumerationType.current; }
	EOF;

// Rule EnumerationType
ruleEnumerationType returns [EObject current=null]
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
					grammarAccess.getEnumerationTypeAccess().getEnumerationTypeAction_0(),
					$current);
			}
		)
		otherlv_1='enum'
		{
			newLeafNode(otherlv_1, grammarAccess.getEnumerationTypeAccess().getEnumKeyword_1());
		}
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getEnumerationTypeAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_3_0());
				}
				lv_literals_3_0=ruleEnumerationLiteral
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEnumerationTypeRule());
					}
					add(
						$current,
						"literals",
						lv_literals_3_0,
						"org.osate.xtext.aadlv3.AadlV3.EnumerationLiteral");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getEnumerationTypeAccess().getRightParenthesisKeyword_4());
		}
	)
;

// Entry rule entryRuleCompositeType
entryRuleCompositeType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCompositeTypeRule()); }
	iv_ruleCompositeType=ruleCompositeType
	{ $current=$iv_ruleCompositeType.current; }
	EOF;

// Rule CompositeType
ruleCompositeType returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getCompositeTypeAccess().getCompositeTypeCompositeParserRuleCall_0_0());
				}
				lv_compositeType_0_0=ruleComposite
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCompositeTypeRule());
					}
					set(
						$current,
						"compositeType",
						lv_compositeType_0_0,
						"org.osate.xtext.aadlv3.AadlV3.Composite");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='of'
		{
			newLeafNode(otherlv_1, grammarAccess.getCompositeTypeAccess().getOfKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCompositeTypeAccess().getTypeTypeReferenceParserRuleCall_2_0());
				}
				lv_type_2_0=ruleTypeReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCompositeTypeRule());
					}
					set(
						$current,
						"type",
						lv_type_2_0,
						"org.osate.xtext.aadlv3.AadlV3.TypeReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
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
			{
				newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getPrimitiveTypePrimitiveParserRuleCall_0());
			}
			lv_primitiveType_0_0=rulePrimitive
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getPrimitiveTypeRule());
				}
				set(
					$current,
					"primitiveType",
					lv_primitiveType_0_0,
					"org.osate.xtext.aadlv3.AadlV3.Primitive");
				afterParserOrEnumRuleCall();
			}
		)
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
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getAnnexSubclauseAccess().getBehaviorSpecificationParserRuleCall_0());
		}
		this_BehaviorSpecification_0=ruleBehaviorSpecification
		{
			$current = $this_BehaviorSpecification_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getAnnexSubclauseAccess().getDefaultAnnexSubclauseParserRuleCall_1());
		}
		this_DefaultAnnexSubclause_1=ruleDefaultAnnexSubclause
		{
			$current = $this_DefaultAnnexSubclause_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDefaultAnnexSubclause
entryRuleDefaultAnnexSubclause returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDefaultAnnexSubclauseRule()); }
	iv_ruleDefaultAnnexSubclause=ruleDefaultAnnexSubclause
	{ $current=$iv_ruleDefaultAnnexSubclause.current; }
	EOF;

// Rule DefaultAnnexSubclause
ruleDefaultAnnexSubclause returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='@'
		{
			newLeafNode(otherlv_0, grammarAccess.getDefaultAnnexSubclauseAccess().getCommercialAtKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDefaultAnnexSubclauseAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDefaultAnnexSubclauseRule());
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
				lv_body_2_0=RULE_ANNEXTEXT
				{
					newLeafNode(lv_body_2_0, grammarAccess.getDefaultAnnexSubclauseAccess().getBodyANNEXTEXTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDefaultAnnexSubclauseRule());
					}
					setWithLastConsumed(
						$current,
						"body",
						lv_body_2_0,
						"org.osate.xtext.aadlv3.AadlV3.ANNEXTEXT");
				}
			)
		)
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getDefaultAnnexSubclauseAccess().getSemicolonKeyword_3());
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
					newCompositeNode(grammarAccess.getNestedImplementationElementAccess().getComponentsSubcomponentParserRuleCall_3_0());
				}
				lv_components_3_0=ruleSubcomponent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNestedImplementationElementRule());
					}
					add(
						$current,
						"components",
						lv_components_3_0,
						"org.osate.xtext.aadlv3.AadlV3.Subcomponent");
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
					newCompositeNode(grammarAccess.getConfigurationExtensionsAccess().getSuperClassifiersClassifierOrTypeReferenceParserRuleCall_0_0());
				}
				lv_superClassifiers_0_0=ruleClassifierOrTypeReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConfigurationExtensionsRule());
					}
					add(
						$current,
						"superClassifiers",
						lv_superClassifiers_0_0,
						"org.osate.xtext.aadlv3.AadlV3.ClassifierOrTypeReference");
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
						newCompositeNode(grammarAccess.getConfigurationExtensionsAccess().getSuperClassifiersClassifierOrTypeReferenceParserRuleCall_1_1_0());
					}
					lv_superClassifiers_2_0=ruleClassifierOrTypeReference
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConfigurationExtensionsRule());
						}
						add(
							$current,
							"superClassifiers",
							lv_superClassifiers_2_0,
							"org.osate.xtext.aadlv3.AadlV3.ClassifierOrTypeReference");
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
					newCompositeNode(grammarAccess.getConfigurationActualAccess().getAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_2_0());
				}
				lv_assignedClassifiers_2_0=ruleClassifierOrTypeReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConfigurationActualRule());
					}
					add(
						$current,
						"assignedClassifiers",
						lv_assignedClassifiers_2_0,
						"org.osate.xtext.aadlv3.AadlV3.ClassifierOrTypeReference");
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
						newCompositeNode(grammarAccess.getConfigurationActualAccess().getAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_3_1_0());
					}
					lv_assignedClassifiers_4_0=ruleClassifierOrTypeReference
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConfigurationActualRule());
						}
						add(
							$current,
							"assignedClassifiers",
							lv_assignedClassifiers_4_0,
							"org.osate.xtext.aadlv3.AadlV3.ClassifierOrTypeReference");
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
					newCompositeNode(grammarAccess.getWorkingsetAccess().getInstanceRootsInstanceConfigurationParserRuleCall_5_0());
				}
				lv_instanceRoots_5_0=ruleInstanceConfiguration
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWorkingsetRule());
					}
					add(
						$current,
						"instanceRoots",
						lv_instanceRoots_5_0,
						"org.osate.xtext.aadlv3.AadlV3.InstanceConfiguration");
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

// Entry rule entryRuleInstanceConfiguration
entryRuleInstanceConfiguration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInstanceConfigurationRule()); }
	iv_ruleInstanceConfiguration=ruleInstanceConfiguration
	{ $current=$iv_ruleInstanceConfiguration.current; }
	EOF;

// Rule InstanceConfiguration
ruleInstanceConfiguration returns [EObject current=null]
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
					grammarAccess.getInstanceConfigurationAccess().getInstanceConfigurationAction_0(),
					$current);
			}
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getInstanceConfigurationAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInstanceConfigurationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getInstanceConfigurationAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInstanceConfigurationAccess().getCategoryComponentCategoryParserRuleCall_3_0());
				}
				lv_category_3_0=ruleComponentCategory
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInstanceConfigurationRule());
					}
					set(
						$current,
						"category",
						lv_category_3_0,
						"org.osate.xtext.aadlv3.AadlV3.ComponentCategory");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getInstanceConfigurationAccess().getTypeReferencesClassifierOrTypeReferenceParserRuleCall_4_0());
				}
				lv_typeReferences_4_0=ruleClassifierOrTypeReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInstanceConfigurationRule());
					}
					add(
						$current,
						"typeReferences",
						lv_typeReferences_4_0,
						"org.osate.xtext.aadlv3.AadlV3.ClassifierOrTypeReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_actions_5_0=RULE_STRING
				{
					newLeafNode(lv_actions_5_0, grammarAccess.getInstanceConfigurationAccess().getActionsSTRINGTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInstanceConfigurationRule());
					}
					addWithLastConsumed(
						$current,
						"actions",
						lv_actions_5_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getInstanceConfigurationAccess().getProductlineConstraintProductLineConstraintParserRuleCall_6_0());
				}
				lv_productlineConstraint_6_0=ruleProductLineConstraint
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInstanceConfigurationRule());
					}
					set(
						$current,
						"productlineConstraint",
						lv_productlineConstraint_6_0,
						"org.osate.xtext.aadlv3.AadlV3.ProductLineConstraint");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getInstanceConfigurationAccess().getSemicolonKeyword_7());
		}
	)
;

// Entry rule entryRuleProductLineConstraint
entryRuleProductLineConstraint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProductLineConstraintRule()); }
	iv_ruleProductLineConstraint=ruleProductLineConstraint
	{ $current=$iv_ruleProductLineConstraint.current; }
	EOF;

// Rule ProductLineConstraint
ruleProductLineConstraint returns [EObject current=null]
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
					grammarAccess.getProductLineConstraintAccess().getBinaryOperationAction_0(),
					$current);
			}
		)
		otherlv_1='plc'
		{
			newLeafNode(otherlv_1, grammarAccess.getProductLineConstraintAccess().getPlcKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProductLineConstraintAccess().getLeftPropertyReferenceParserRuleCall_2_0());
				}
				lv_left_2_0=rulePropertyReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProductLineConstraintRule());
					}
					set(
						$current,
						"left",
						lv_left_2_0,
						"org.osate.xtext.aadlv3.AadlV3.PropertyReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getProductLineConstraintAccess().getOperatorSatisfiesOperationParserRuleCall_3_0());
				}
				lv_operator_3_0=ruleSatisfiesOperation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProductLineConstraintRule());
					}
					set(
						$current,
						"operator",
						lv_operator_3_0,
						"org.osate.xtext.aadlv3.AadlV3.SatisfiesOperation");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getProductLineConstraintAccess().getRightListLiteralParserRuleCall_4_0());
				}
				lv_right_4_0=ruleListLiteral
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProductLineConstraintRule());
					}
					set(
						$current,
						"right",
						lv_right_4_0,
						"org.osate.xtext.aadlv3.AadlV3.ListLiteral");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleBehaviorSpecification
entryRuleBehaviorSpecification returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBehaviorSpecificationRule()); }
	iv_ruleBehaviorSpecification=ruleBehaviorSpecification
	{ $current=$iv_ruleBehaviorSpecification.current; }
	EOF;

// Rule BehaviorSpecification
ruleBehaviorSpecification returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='@'
		{
			newLeafNode(otherlv_0, grammarAccess.getBehaviorSpecificationAccess().getCommercialAtKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getBehaviorSpecificationAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBehaviorSpecificationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getBehaviorSpecificationAccess().getLeftCurlyBracketKeyword_2());
		}
		{
			/* */
		}
		{
			if ($current==null) {
				$current = createModelElement(grammarAccess.getBehaviorSpecificationRule());
			}
			newCompositeNode(grammarAccess.getBehaviorSpecificationAccess().getBehaviorSpecificationBlockParserRuleCall_3());
		}
		this_BehaviorSpecificationBlock_3=ruleBehaviorSpecificationBlock[$current]
		{
			$current = $this_BehaviorSpecificationBlock_3.current;
			afterParserOrEnumRuleCall();
		}
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getBehaviorSpecificationAccess().getRightCurlyBracketKeyword_4());
		}
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getBehaviorSpecificationAccess().getSemicolonKeyword_5());
		}
	)
;


// Rule BehaviorSpecificationBlock
ruleBehaviorSpecificationBlock[EObject in_current]  returns [EObject current=in_current]
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
				$current = createModelElement(grammarAccess.getBehaviorSpecificationBlockRule());
			}
			newCompositeNode(grammarAccess.getBehaviorSpecificationBlockAccess().getBehaviorSpecificationElementParserRuleCall());
		}
		this_BehaviorSpecificationElement_0=ruleBehaviorSpecificationElement[$current]
		{
			$current = $this_BehaviorSpecificationElement_0.current;
			afterParserOrEnumRuleCall();
		}
	)*
;


// Rule BehaviorSpecificationElement
ruleBehaviorSpecificationElement[EObject in_current]  returns [EObject current=in_current]
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
					newCompositeNode(grammarAccess.getBehaviorSpecificationElementAccess().getGeneratorsGeneratorParserRuleCall_0_0());
				}
				lv_generators_0_0=ruleGenerator
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBehaviorSpecificationElementRule());
					}
					add(
						$current,
						"generators",
						lv_generators_0_0,
						"org.osate.xtext.aadlv3.AadlV3.Generator");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getBehaviorSpecificationElementAccess().getRulesTransitionRuleParserRuleCall_1_0());
				}
				lv_rules_1_0=ruleTransitionRule
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBehaviorSpecificationElementRule());
					}
					add(
						$current,
						"rules",
						lv_rules_1_0,
						"org.osate.xtext.aadlv3.AadlV3.TransitionRule");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getBehaviorSpecificationElementAccess().getRulesFlowRuleParserRuleCall_2_0());
				}
				lv_rules_2_0=ruleFlowRule
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBehaviorSpecificationElementRule());
					}
					add(
						$current,
						"rules",
						lv_rules_2_0,
						"org.osate.xtext.aadlv3.AadlV3.FlowRule");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getBehaviorSpecificationElementAccess().getStateVariablesStateVariableParserRuleCall_3_0());
				}
				lv_stateVariables_3_0=ruleStateVariable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBehaviorSpecificationElementRule());
					}
					add(
						$current,
						"stateVariables",
						lv_stateVariables_3_0,
						"org.osate.xtext.aadlv3.AadlV3.StateVariable");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleStateVariable
entryRuleStateVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateVariableRule()); }
	iv_ruleStateVariable=ruleStateVariable
	{ $current=$iv_ruleStateVariable.current; }
	EOF;

// Rule StateVariable
ruleStateVariable returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getStateVariableAccess().getAnnotationsAnnotationParserRuleCall_0_0());
				}
				lv_annotations_0_0=ruleAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateVariableRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_0_0,
						"org.osate.xtext.aadlv3.AadlV3.Annotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getStateVariableAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateVariableRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getStateVariableAccess().getColonKeyword_2());
		}
		otherlv_3='state'
		{
			newLeafNode(otherlv_3, grammarAccess.getStateVariableAccess().getStateKeyword_3());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateVariableRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getStateVariableAccess().getStateTypeTypeDefCrossReference_4_0());
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
					newCompositeNode(grammarAccess.getStateVariableAccess().getInitialStateEnumerationLiteralParserRuleCall_5_0());
				}
				lv_initialState_5_0=ruleEnumerationLiteral
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateVariableRule());
					}
					set(
						$current,
						"initialState",
						lv_initialState_5_0,
						"org.osate.xtext.aadlv3.AadlV3.EnumerationLiteral");
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
					$current = createModelElement(grammarAccess.getStateVariableRule());
				}
				newCompositeNode(grammarAccess.getStateVariableAccess().getPropertiesBlockParserRuleCall_6());
			}
			this_PropertiesBlock_6=rulePropertiesBlock[$current]
			{
				$current = $this_PropertiesBlock_6.current;
				afterParserOrEnumRuleCall();
			}
		)?
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getStateVariableAccess().getSemicolonKeyword_7());
		}
	)
;

// Entry rule entryRuleGenerator
entryRuleGenerator returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGeneratorRule()); }
	iv_ruleGenerator=ruleGenerator
	{ $current=$iv_ruleGenerator.current; }
	EOF;

// Rule Generator
ruleGenerator returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getGeneratorAccess().getAnnotationsAnnotationParserRuleCall_0_0());
				}
				lv_annotations_0_0=ruleAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGeneratorRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_0_0,
						"org.osate.xtext.aadlv3.AadlV3.Annotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getGeneratorAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGeneratorRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getGeneratorAccess().getColonKeyword_2());
		}
		(
			(
				(
					lv_type_3_1='error'
					{
						newLeafNode(lv_type_3_1, grammarAccess.getGeneratorAccess().getTypeErrorKeyword_3_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGeneratorRule());
						}
						setWithLastConsumed($current, "type", lv_type_3_1, null);
					}
					    |
					lv_type_3_2='recover'
					{
						newLeafNode(lv_type_3_2, grammarAccess.getGeneratorAccess().getTypeRecoverKeyword_3_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGeneratorRule());
						}
						setWithLastConsumed($current, "type", lv_type_3_2, null);
					}
					    |
					lv_type_3_3='repair'
					{
						newLeafNode(lv_type_3_3, grammarAccess.getGeneratorAccess().getTypeRepairKeyword_3_0_2());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGeneratorRule());
						}
						setWithLastConsumed($current, "type", lv_type_3_3, null);
					}
				)
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGeneratorAccess().getValueListLiteralParserRuleCall_4_0());
				}
				lv_value_4_0=ruleListLiteral
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGeneratorRule());
					}
					set(
						$current,
						"value",
						lv_value_4_0,
						"org.osate.xtext.aadlv3.AadlV3.ListLiteral");
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
					$current = createModelElement(grammarAccess.getGeneratorRule());
				}
				newCompositeNode(grammarAccess.getGeneratorAccess().getPropertiesBlockParserRuleCall_5());
			}
			this_PropertiesBlock_5=rulePropertiesBlock[$current]
			{
				$current = $this_PropertiesBlock_5.current;
				afterParserOrEnumRuleCall();
			}
		)?
		otherlv_6=';'
		{
			newLeafNode(otherlv_6, grammarAccess.getGeneratorAccess().getSemicolonKeyword_6());
		}
	)
;

// Entry rule entryRuleTransitionRule
entryRuleTransitionRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransitionRuleRule()); }
	iv_ruleTransitionRule=ruleTransitionRule
	{ $current=$iv_ruleTransitionRule.current; }
	EOF;

// Rule TransitionRule
ruleTransitionRule returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getTransitionRuleAccess().getAnnotationsAnnotationParserRuleCall_0_0());
				}
				lv_annotations_0_0=ruleAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTransitionRuleRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_0_0,
						"org.osate.xtext.aadlv3.AadlV3.Annotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getTransitionRuleAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRuleRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getTransitionRuleAccess().getColonKeyword_2());
		}
		otherlv_3='transition'
		{
			newLeafNode(otherlv_3, grammarAccess.getTransitionRuleAccess().getTransitionKeyword_3());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getTransitionRuleAccess().getConditionMultiLiteralOperationParserRuleCall_4_0_0());
					}
					lv_condition_4_1=ruleMultiLiteralOperation
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTransitionRuleRule());
						}
						set(
							$current,
							"condition",
							lv_condition_4_1,
							"org.osate.xtext.aadlv3.AadlV3.MultiLiteralOperation");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getTransitionRuleAccess().getConditionModelElementContainsLiteralParserRuleCall_4_0_1());
					}
					lv_condition_4_2=ruleModelElementContainsLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTransitionRuleRule());
						}
						set(
							$current,
							"condition",
							lv_condition_4_2,
							"org.osate.xtext.aadlv3.AadlV3.ModelElementContainsLiteral");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getTransitionRuleAccess().getConditionModelElementReferenceParserRuleCall_4_0_2());
					}
					lv_condition_4_3=ruleModelElementReference
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTransitionRuleRule());
						}
						set(
							$current,
							"condition",
							lv_condition_4_3,
							"org.osate.xtext.aadlv3.AadlV3.ModelElementReference");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		otherlv_5='->'
		{
			newLeafNode(otherlv_5, grammarAccess.getTransitionRuleAccess().getHyphenMinusGreaterThanSignKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTransitionRuleAccess().getTargetStateTargetStateParserRuleCall_6_0());
				}
				lv_targetState_6_0=ruleTargetState
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTransitionRuleRule());
					}
					set(
						$current,
						"targetState",
						lv_targetState_6_0,
						"org.osate.xtext.aadlv3.AadlV3.TargetState");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='when'
		{
			newLeafNode(otherlv_7, grammarAccess.getTransitionRuleAccess().getWhenKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTransitionRuleAccess().getCurrentStateCurrentStateParserRuleCall_8_0());
				}
				lv_currentState_8_0=ruleCurrentState
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTransitionRuleRule());
					}
					set(
						$current,
						"currentState",
						lv_currentState_8_0,
						"org.osate.xtext.aadlv3.AadlV3.CurrentState");
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
					$current = createModelElement(grammarAccess.getTransitionRuleRule());
				}
				newCompositeNode(grammarAccess.getTransitionRuleAccess().getPropertiesBlockParserRuleCall_9());
			}
			this_PropertiesBlock_9=rulePropertiesBlock[$current]
			{
				$current = $this_PropertiesBlock_9.current;
				afterParserOrEnumRuleCall();
			}
		)?
		otherlv_10=';'
		{
			newLeafNode(otherlv_10, grammarAccess.getTransitionRuleAccess().getSemicolonKeyword_10());
		}
	)
;

// Entry rule entryRuleFlowRule
entryRuleFlowRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFlowRuleRule()); }
	iv_ruleFlowRule=ruleFlowRule
	{ $current=$iv_ruleFlowRule.current; }
	EOF;

// Rule FlowRule
ruleFlowRule returns [EObject current=null]
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
			newCompositeNode(grammarAccess.getFlowRuleAccess().getFlowPathRuleParserRuleCall_0());
		}
		this_FlowPathRule_0=ruleFlowPathRule
		{
			$current = $this_FlowPathRule_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getFlowRuleAccess().getFlowSourceRuleParserRuleCall_1());
		}
		this_FlowSourceRule_1=ruleFlowSourceRule
		{
			$current = $this_FlowSourceRule_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getFlowRuleAccess().getFlowSinkRuleParserRuleCall_2());
		}
		this_FlowSinkRule_2=ruleFlowSinkRule
		{
			$current = $this_FlowSinkRule_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleFlowPathRule
entryRuleFlowPathRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFlowPathRuleRule()); }
	iv_ruleFlowPathRule=ruleFlowPathRule
	{ $current=$iv_ruleFlowPathRule.current; }
	EOF;

// Rule FlowPathRule
ruleFlowPathRule returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getFlowPathRuleAccess().getAnnotationsAnnotationParserRuleCall_0_0());
				}
				lv_annotations_0_0=ruleAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFlowPathRuleRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_0_0,
						"org.osate.xtext.aadlv3.AadlV3.Annotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getFlowPathRuleAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFlowPathRuleRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getFlowPathRuleAccess().getColonKeyword_2());
		}
		otherlv_3='flow'
		{
			newLeafNode(otherlv_3, grammarAccess.getFlowPathRuleAccess().getFlowKeyword_3());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getFlowPathRuleAccess().getConditionMultiLiteralOperationParserRuleCall_4_0_0());
					}
					lv_condition_4_1=ruleMultiLiteralOperation
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFlowPathRuleRule());
						}
						set(
							$current,
							"condition",
							lv_condition_4_1,
							"org.osate.xtext.aadlv3.AadlV3.MultiLiteralOperation");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getFlowPathRuleAccess().getConditionModelElementContainsLiteralParserRuleCall_4_0_1());
					}
					lv_condition_4_2=ruleModelElementContainsLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFlowPathRuleRule());
						}
						set(
							$current,
							"condition",
							lv_condition_4_2,
							"org.osate.xtext.aadlv3.AadlV3.ModelElementContainsLiteral");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getFlowPathRuleAccess().getConditionModelElementReferenceParserRuleCall_4_0_2());
					}
					lv_condition_4_3=ruleModelElementReference
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFlowPathRuleRule());
						}
						set(
							$current,
							"condition",
							lv_condition_4_3,
							"org.osate.xtext.aadlv3.AadlV3.ModelElementReference");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		otherlv_5='->'
		{
			newLeafNode(otherlv_5, grammarAccess.getFlowPathRuleAccess().getHyphenMinusGreaterThanSignKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFlowPathRuleAccess().getActionsAssignmentParserRuleCall_6_0());
				}
				lv_actions_6_0=ruleAssignment
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFlowPathRuleRule());
					}
					add(
						$current,
						"actions",
						lv_actions_6_0,
						"org.osate.xtext.aadlv3.AadlV3.Assignment");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_7=','
			{
				newLeafNode(otherlv_7, grammarAccess.getFlowPathRuleAccess().getCommaKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFlowPathRuleAccess().getActionsAssignmentParserRuleCall_7_1_0());
					}
					lv_actions_8_0=ruleAssignment
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFlowPathRuleRule());
						}
						add(
							$current,
							"actions",
							lv_actions_8_0,
							"org.osate.xtext.aadlv3.AadlV3.Assignment");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		(
			otherlv_9='when'
			{
				newLeafNode(otherlv_9, grammarAccess.getFlowPathRuleAccess().getWhenKeyword_8_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFlowPathRuleAccess().getCurrentStateCurrentStateParserRuleCall_8_1_0());
					}
					lv_currentState_10_0=ruleCurrentState
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFlowPathRuleRule());
						}
						set(
							$current,
							"currentState",
							lv_currentState_10_0,
							"org.osate.xtext.aadlv3.AadlV3.CurrentState");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			{
				/* */
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getFlowPathRuleRule());
				}
				newCompositeNode(grammarAccess.getFlowPathRuleAccess().getPropertiesBlockParserRuleCall_9());
			}
			this_PropertiesBlock_11=rulePropertiesBlock[$current]
			{
				$current = $this_PropertiesBlock_11.current;
				afterParserOrEnumRuleCall();
			}
		)?
		otherlv_12=';'
		{
			newLeafNode(otherlv_12, grammarAccess.getFlowPathRuleAccess().getSemicolonKeyword_10());
		}
	)
;

// Entry rule entryRuleFlowSourceRule
entryRuleFlowSourceRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFlowSourceRuleRule()); }
	iv_ruleFlowSourceRule=ruleFlowSourceRule
	{ $current=$iv_ruleFlowSourceRule.current; }
	EOF;

// Rule FlowSourceRule
ruleFlowSourceRule returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getFlowSourceRuleAccess().getAnnotationsAnnotationParserRuleCall_0_0());
				}
				lv_annotations_0_0=ruleAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFlowSourceRuleRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_0_0,
						"org.osate.xtext.aadlv3.AadlV3.Annotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getFlowSourceRuleAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFlowSourceRuleRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getFlowSourceRuleAccess().getColonKeyword_2());
		}
		otherlv_3='flow'
		{
			newLeafNode(otherlv_3, grammarAccess.getFlowSourceRuleAccess().getFlowKeyword_3());
		}
		(
			(
				lv_source_4_0='source'
				{
					newLeafNode(lv_source_4_0, grammarAccess.getFlowSourceRuleAccess().getSourceSourceKeyword_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFlowSourceRuleRule());
					}
					setWithLastConsumed($current, "source", true, "source");
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getFlowSourceRuleAccess().getConditionMultiLiteralOperationParserRuleCall_5_0_0());
					}
					lv_condition_5_1=ruleMultiLiteralOperation
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFlowSourceRuleRule());
						}
						set(
							$current,
							"condition",
							lv_condition_5_1,
							"org.osate.xtext.aadlv3.AadlV3.MultiLiteralOperation");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getFlowSourceRuleAccess().getConditionModelElementContainsLiteralParserRuleCall_5_0_1());
					}
					lv_condition_5_2=ruleModelElementContainsLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFlowSourceRuleRule());
						}
						set(
							$current,
							"condition",
							lv_condition_5_2,
							"org.osate.xtext.aadlv3.AadlV3.ModelElementContainsLiteral");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getFlowSourceRuleAccess().getConditionModelElementReferenceParserRuleCall_5_0_2());
					}
					lv_condition_5_3=ruleModelElementReference
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFlowSourceRuleRule());
						}
						set(
							$current,
							"condition",
							lv_condition_5_3,
							"org.osate.xtext.aadlv3.AadlV3.ModelElementReference");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_6='->'
			{
				newLeafNode(otherlv_6, grammarAccess.getFlowSourceRuleAccess().getHyphenMinusGreaterThanSignKeyword_6_0());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getFlowSourceRuleAccess().getActionsAssignmentParserRuleCall_6_1_0_0());
						}
						lv_actions_7_0=ruleAssignment
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getFlowSourceRuleRule());
							}
							add(
								$current,
								"actions",
								lv_actions_7_0,
								"org.osate.xtext.aadlv3.AadlV3.Assignment");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					otherlv_8=','
					{
						newLeafNode(otherlv_8, grammarAccess.getFlowSourceRuleAccess().getCommaKeyword_6_1_1_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getFlowSourceRuleAccess().getActionsAssignmentParserRuleCall_6_1_1_1_0());
							}
							lv_actions_9_0=ruleAssignment
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getFlowSourceRuleRule());
								}
								add(
									$current,
									"actions",
									lv_actions_9_0,
									"org.osate.xtext.aadlv3.AadlV3.Assignment");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)*
			)
		)?
		(
			otherlv_10='when'
			{
				newLeafNode(otherlv_10, grammarAccess.getFlowSourceRuleAccess().getWhenKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFlowSourceRuleAccess().getCurrentStateCurrentStateParserRuleCall_7_1_0());
					}
					lv_currentState_11_0=ruleCurrentState
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFlowSourceRuleRule());
						}
						set(
							$current,
							"currentState",
							lv_currentState_11_0,
							"org.osate.xtext.aadlv3.AadlV3.CurrentState");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			{
				/* */
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getFlowSourceRuleRule());
				}
				newCompositeNode(grammarAccess.getFlowSourceRuleAccess().getPropertiesBlockParserRuleCall_8());
			}
			this_PropertiesBlock_12=rulePropertiesBlock[$current]
			{
				$current = $this_PropertiesBlock_12.current;
				afterParserOrEnumRuleCall();
			}
		)?
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getFlowSourceRuleAccess().getSemicolonKeyword_9());
		}
	)
;

// Entry rule entryRuleFlowSinkRule
entryRuleFlowSinkRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFlowSinkRuleRule()); }
	iv_ruleFlowSinkRule=ruleFlowSinkRule
	{ $current=$iv_ruleFlowSinkRule.current; }
	EOF;

// Rule FlowSinkRule
ruleFlowSinkRule returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getFlowSinkRuleAccess().getAnnotationsAnnotationParserRuleCall_0_0());
				}
				lv_annotations_0_0=ruleAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFlowSinkRuleRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_0_0,
						"org.osate.xtext.aadlv3.AadlV3.Annotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getFlowSinkRuleAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFlowSinkRuleRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getFlowSinkRuleAccess().getColonKeyword_2());
		}
		otherlv_3='flow'
		{
			newLeafNode(otherlv_3, grammarAccess.getFlowSinkRuleAccess().getFlowKeyword_3());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getFlowSinkRuleAccess().getConditionMultiLiteralOperationParserRuleCall_4_0_0());
					}
					lv_condition_4_1=ruleMultiLiteralOperation
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFlowSinkRuleRule());
						}
						set(
							$current,
							"condition",
							lv_condition_4_1,
							"org.osate.xtext.aadlv3.AadlV3.MultiLiteralOperation");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getFlowSinkRuleAccess().getConditionModelElementContainsLiteralParserRuleCall_4_0_1());
					}
					lv_condition_4_2=ruleModelElementContainsLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFlowSinkRuleRule());
						}
						set(
							$current,
							"condition",
							lv_condition_4_2,
							"org.osate.xtext.aadlv3.AadlV3.ModelElementContainsLiteral");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getFlowSinkRuleAccess().getConditionModelElementReferenceParserRuleCall_4_0_2());
					}
					lv_condition_4_3=ruleModelElementReference
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFlowSinkRuleRule());
						}
						set(
							$current,
							"condition",
							lv_condition_4_3,
							"org.osate.xtext.aadlv3.AadlV3.ModelElementReference");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		otherlv_5='->'
		{
			newLeafNode(otherlv_5, grammarAccess.getFlowSinkRuleAccess().getHyphenMinusGreaterThanSignKeyword_5());
		}
		(
			(
				lv_sink_6_0='sink'
				{
					newLeafNode(lv_sink_6_0, grammarAccess.getFlowSinkRuleAccess().getSinkSinkKeyword_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFlowSinkRuleRule());
					}
					setWithLastConsumed($current, "sink", true, "sink");
				}
			)
		)
		(
			otherlv_7='when'
			{
				newLeafNode(otherlv_7, grammarAccess.getFlowSinkRuleAccess().getWhenKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFlowSinkRuleAccess().getCurrentStateCurrentStateParserRuleCall_7_1_0());
					}
					lv_currentState_8_0=ruleCurrentState
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFlowSinkRuleRule());
						}
						set(
							$current,
							"currentState",
							lv_currentState_8_0,
							"org.osate.xtext.aadlv3.AadlV3.CurrentState");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			{
				/* */
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getFlowSinkRuleRule());
				}
				newCompositeNode(grammarAccess.getFlowSinkRuleAccess().getPropertiesBlockParserRuleCall_8());
			}
			this_PropertiesBlock_9=rulePropertiesBlock[$current]
			{
				$current = $this_PropertiesBlock_9.current;
				afterParserOrEnumRuleCall();
			}
		)?
		otherlv_10=';'
		{
			newLeafNode(otherlv_10, grammarAccess.getFlowSinkRuleAccess().getSemicolonKeyword_9());
		}
	)
;

// Entry rule entryRuleAssignment
entryRuleAssignment returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAssignmentRule()); }
	iv_ruleAssignment=ruleAssignment
	{ $current=$iv_ruleAssignment.current; }
	EOF;

// Rule Assignment
ruleAssignment returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getAssignmentAccess().getLeftModelElementReferenceParserRuleCall_0_0());
				}
				lv_left_0_0=ruleModelElementReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAssignmentRule());
					}
					set(
						$current,
						"left",
						lv_left_0_0,
						"org.osate.xtext.aadlv3.AadlV3.ModelElementReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getAssignmentAccess().getOperatorEqualsOperationParserRuleCall_1_0_0());
					}
					lv_operator_1_0=ruleEqualsOperation
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAssignmentRule());
						}
						set(
							$current,
							"operator",
							lv_operator_1_0,
							"org.osate.xtext.aadlv3.AadlV3.EqualsOperation");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getAssignmentAccess().getRightNamedElementReferenceParserRuleCall_1_1_0());
					}
					lv_right_2_0=ruleNamedElementReference
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAssignmentRule());
						}
						set(
							$current,
							"right",
							lv_right_2_0,
							"org.osate.xtext.aadlv3.AadlV3.NamedElementReference");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleCurrentState
entryRuleCurrentState returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCurrentStateRule()); }
	iv_ruleCurrentState=ruleCurrentState
	{ $current=$iv_ruleCurrentState.current; }
	EOF;

// Rule CurrentState
ruleCurrentState returns [EObject current=null]
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
						$current = createModelElement(grammarAccess.getCurrentStateRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getCurrentStateAccess().getStateVariableStateVariableCrossReference_0_0());
				}
			)
		)
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getCurrentStateAccess().getEqualsSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCurrentStateAccess().getCurrentStateEnumerationLiteralParserRuleCall_2_0());
				}
				lv_currentState_2_0=ruleEnumerationLiteral
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCurrentStateRule());
					}
					set(
						$current,
						"currentState",
						lv_currentState_2_0,
						"org.osate.xtext.aadlv3.AadlV3.EnumerationLiteral");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleTargetState
entryRuleTargetState returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTargetStateRule()); }
	iv_ruleTargetState=ruleTargetState
	{ $current=$iv_ruleTargetState.current; }
	EOF;

// Rule TargetState
ruleTargetState returns [EObject current=null]
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
						$current = createModelElement(grammarAccess.getTargetStateRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getTargetStateAccess().getStateVariableStateVariableCrossReference_0_0());
				}
			)
		)
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getTargetStateAccess().getEqualsSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTargetStateAccess().getCurrentStateEnumerationLiteralParserRuleCall_2_0());
				}
				lv_currentState_2_0=ruleEnumerationLiteral
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTargetStateRule());
					}
					set(
						$current,
						"currentState",
						lv_currentState_2_0,
						"org.osate.xtext.aadlv3.AadlV3.EnumerationLiteral");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleModelElementContainsLiteral
entryRuleModelElementContainsLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelElementContainsLiteralRule()); }
	iv_ruleModelElementContainsLiteral=ruleModelElementContainsLiteral
	{ $current=$iv_ruleModelElementContainsLiteral.current; }
	EOF;

// Rule ModelElementContainsLiteral
ruleModelElementContainsLiteral returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getModelElementContainsLiteralAccess().getLeftModelElementReferenceParserRuleCall_0_0());
				}
				lv_left_0_0=ruleModelElementReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelElementContainsLiteralRule());
					}
					set(
						$current,
						"left",
						lv_left_0_0,
						"org.osate.xtext.aadlv3.AadlV3.ModelElementReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getModelElementContainsLiteralAccess().getOperatorInOperationParserRuleCall_1_0());
				}
				lv_operator_1_0=ruleInOperation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelElementContainsLiteralRule());
					}
					set(
						$current,
						"operator",
						lv_operator_1_0,
						"org.osate.xtext.aadlv3.AadlV3.InOperation");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getModelElementContainsLiteralAccess().getRightListLiteralParserRuleCall_2_0());
				}
				lv_right_2_0=ruleListLiteral
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelElementContainsLiteralRule());
					}
					set(
						$current,
						"right",
						lv_right_2_0,
						"org.osate.xtext.aadlv3.AadlV3.ListLiteral");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleAnnotation
entryRuleAnnotation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAnnotationRule()); }
	iv_ruleAnnotation=ruleAnnotation
	{ $current=$iv_ruleAnnotation.current; }
	EOF;

// Rule Annotation
ruleAnnotation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='@'
		{
			newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getAnnotationAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAnnotationRule());
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
			otherlv_2='('
			{
				newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getAnnotationAccess().getValueLiteralParserRuleCall_2_1_0_0());
						}
						lv_value_3_0=ruleLiteral
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getAnnotationRule());
							}
							set(
								$current,
								"value",
								lv_value_3_0,
								"org.osate.xtext.aadlv3.AadlV3.Literal");
							afterParserOrEnumRuleCall();
						}
					)
				)
				    |
				(
					(
						{
							newCompositeNode(grammarAccess.getAnnotationAccess().getNameValuePairsNameValuePairParserRuleCall_2_1_1_0());
						}
						lv_nameValuePairs_4_0=ruleNameValuePair
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getAnnotationRule());
							}
							add(
								$current,
								"nameValuePairs",
								lv_nameValuePairs_4_0,
								"org.osate.xtext.aadlv3.AadlV3.NameValuePair");
							afterParserOrEnumRuleCall();
						}
					)
				)+
			)
			otherlv_5=')'
			{
				newLeafNode(otherlv_5, grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_2_2());
			}
		)?
	)
;

// Entry rule entryRuleNameValuePair
entryRuleNameValuePair returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNameValuePairRule()); }
	iv_ruleNameValuePair=ruleNameValuePair
	{ $current=$iv_ruleNameValuePair.current; }
	EOF;

// Rule NameValuePair
ruleNameValuePair returns [EObject current=null]
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
					newLeafNode(lv_name_0_0, grammarAccess.getNameValuePairAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNameValuePairRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getNameValuePairAccess().getEqualsSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getNameValuePairAccess().getValueLiteralParserRuleCall_2_0());
				}
				lv_value_2_0=ruleLiteral
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNameValuePairRule());
					}
					set(
						$current,
						"value",
						lv_value_2_0,
						"org.osate.xtext.aadlv3.AadlV3.Literal");
					afterParserOrEnumRuleCall();
				}
			)
		)
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
			newCompositeNode(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_0());
		}
		this_IntegerLiteral_0=ruleIntegerLiteral
		{
			$current = $this_IntegerLiteral_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getLiteralAccess().getRealLiteralParserRuleCall_1());
		}
		this_RealLiteral_1=ruleRealLiteral
		{
			$current = $this_RealLiteral_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_2());
		}
		this_StringLiteral_2=ruleStringLiteral
		{
			$current = $this_StringLiteral_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_3());
		}
		this_BooleanLiteral_3=ruleBooleanLiteral
		{
			$current = $this_BooleanLiteral_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getLiteralAccess().getPropertyReferenceParserRuleCall_4());
		}
		this_PropertyReference_4=rulePropertyReference
		{
			$current = $this_PropertyReference_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getLiteralAccess().getDirectionalLiteralParserRuleCall_5());
		}
		this_DirectionalLiteral_5=ruleDirectionalLiteral
		{
			$current = $this_DirectionalLiteral_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getLiteralAccess().getListLiteralParserRuleCall_6());
		}
		this_ListLiteral_6=ruleListLiteral
		{
			$current = $this_ListLiteral_6.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getLiteralAccess().getMultiLiteralOperationParserRuleCall_7());
		}
		this_MultiLiteralOperation_7=ruleMultiLiteralOperation
		{
			$current = $this_MultiLiteralOperation_7.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getLiteralAccess().getModelElementContainsLiteralParserRuleCall_8());
		}
		this_ModelElementContainsLiteral_8=ruleModelElementContainsLiteral
		{
			$current = $this_ModelElementContainsLiteral_8.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getLiteralAccess().getNamedElementReferenceParserRuleCall_9());
		}
		this_NamedElementReference_9=ruleNamedElementReference
		{
			$current = $this_NamedElementReference_9.current;
			afterParserOrEnumRuleCall();
		}
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
		otherlv_0='#'
		{
			newLeafNode(otherlv_0, grammarAccess.getPropertyReferenceAccess().getNumberSignKeyword_0());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPropertyReferenceRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getPropertyReferenceAccess().getElementPackageElementCrossReference_1_0());
				}
				ruleQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleIntegerLiteral
entryRuleIntegerLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIntegerLiteralRule()); }
	iv_ruleIntegerLiteral=ruleIntegerLiteral
	{ $current=$iv_ruleIntegerLiteral.current; }
	EOF;

// Rule IntegerLiteral
ruleIntegerLiteral returns [EObject current=null]
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
					grammarAccess.getIntegerLiteralAccess().getIntegerLiteralAction_0(),
					$current);
			}
		)
		(
			(
				lv_value_1_0=RULE_INT
				{
					newLeafNode(lv_value_1_0, grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIntegerLiteralRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			(
				lv_unit_2_0=RULE_ID
				{
					newLeafNode(lv_unit_2_0, grammarAccess.getIntegerLiteralAccess().getUnitIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIntegerLiteralRule());
					}
					setWithLastConsumed(
						$current,
						"unit",
						lv_unit_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)?
	)
;

// Entry rule entryRuleRealLiteral
entryRuleRealLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRealLiteralRule()); }
	iv_ruleRealLiteral=ruleRealLiteral
	{ $current=$iv_ruleRealLiteral.current; }
	EOF;

// Rule RealLiteral
ruleRealLiteral returns [EObject current=null]
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
					grammarAccess.getRealLiteralAccess().getRealLiteralAction_0(),
					$current);
			}
		)
		(
			(
				lv_value_1_0=RULE_DOUBLE
				{
					newLeafNode(lv_value_1_0, grammarAccess.getRealLiteralAccess().getValueDOUBLETerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRealLiteralRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_1_0,
						"org.osate.xtext.aadlv3.AadlV3.DOUBLE");
				}
			)
		)
		(
			(
				lv_unit_2_0=RULE_ID
				{
					newLeafNode(lv_unit_2_0, grammarAccess.getRealLiteralAccess().getUnitIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRealLiteralRule());
					}
					setWithLastConsumed(
						$current,
						"unit",
						lv_unit_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)?
	)
;

// Entry rule entryRuleStringLiteral
entryRuleStringLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStringLiteralRule()); }
	iv_ruleStringLiteral=ruleStringLiteral
	{ $current=$iv_ruleStringLiteral.current; }
	EOF;

// Rule StringLiteral
ruleStringLiteral returns [EObject current=null]
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
					grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getStringLiteralAccess().getValueNoQuoteStringParserRuleCall_1_0());
				}
				lv_value_1_0=ruleNoQuoteString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStringLiteralRule());
					}
					set(
						$current,
						"value",
						lv_value_1_0,
						"org.osate.xtext.aadlv3.AadlV3.NoQuoteString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleEnumerationLiteral
entryRuleEnumerationLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEnumerationLiteralRule()); }
	iv_ruleEnumerationLiteral=ruleEnumerationLiteral
	{ $current=$iv_ruleEnumerationLiteral.current; }
	EOF;

// Rule EnumerationLiteral
ruleEnumerationLiteral returns [EObject current=null]
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
					grammarAccess.getEnumerationLiteralAccess().getEnumerationLiteralAction_0(),
					$current);
			}
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEnumerationLiteralRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
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

// Entry rule entryRuleBooleanLiteral
entryRuleBooleanLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBooleanLiteralRule()); }
	iv_ruleBooleanLiteral=ruleBooleanLiteral
	{ $current=$iv_ruleBooleanLiteral.current; }
	EOF;

// Rule BooleanLiteral
ruleBooleanLiteral returns [EObject current=null]
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
					grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(),
					$current);
			}
		)
		(
			(
				(
					lv_value_1_0='true'
					{
						newLeafNode(lv_value_1_0, grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getBooleanLiteralRule());
						}
						setWithLastConsumed($current, "value", true, "true");
					}
				)
			)
			    |
			otherlv_2='false'
			{
				newLeafNode(otherlv_2, grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_1());
			}
		)
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
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getListLiteralAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getListLiteralAccess().getElementsLiteralParserRuleCall_2_0_0());
					}
					lv_elements_2_0=ruleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getListLiteralRule());
						}
						add(
							$current,
							"elements",
							lv_elements_2_0,
							"org.osate.xtext.aadlv3.AadlV3.Literal");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_3=','
				{
					newLeafNode(otherlv_3, grammarAccess.getListLiteralAccess().getCommaKeyword_2_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getListLiteralAccess().getElementsLiteralParserRuleCall_2_1_1_0());
						}
						lv_elements_4_0=ruleLiteral
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getListLiteralRule());
							}
							add(
								$current,
								"elements",
								lv_elements_4_0,
								"org.osate.xtext.aadlv3.AadlV3.Literal");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getListLiteralAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleDirectionalLiteral
entryRuleDirectionalLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDirectionalLiteralRule()); }
	iv_ruleDirectionalLiteral=ruleDirectionalLiteral
	{ $current=$iv_ruleDirectionalLiteral.current; }
	EOF;

// Rule DirectionalLiteral
ruleDirectionalLiteral returns [EObject current=null]
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
					grammarAccess.getDirectionalLiteralAccess().getDirectionalLiteralAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDirectionalLiteralAccess().getDirectionPropagationDirectionParserRuleCall_1_0());
				}
				lv_direction_1_0=rulePropagationDirection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDirectionalLiteralRule());
					}
					set(
						$current,
						"direction",
						lv_direction_1_0,
						"org.osate.xtext.aadlv3.AadlV3.PropagationDirection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDirectionalLiteralAccess().getValueLiteralParserRuleCall_2_0());
				}
				lv_value_2_0=ruleLiteral
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDirectionalLiteralRule());
					}
					set(
						$current,
						"value",
						lv_value_2_0,
						"org.osate.xtext.aadlv3.AadlV3.Literal");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleMultiLiteralOperation
entryRuleMultiLiteralOperation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMultiLiteralOperationRule()); }
	iv_ruleMultiLiteralOperation=ruleMultiLiteralOperation
	{ $current=$iv_ruleMultiLiteralOperation.current; }
	EOF;

// Rule MultiLiteralOperation
ruleMultiLiteralOperation returns [EObject current=null]
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
					grammarAccess.getMultiLiteralOperationAccess().getMultiLiteralConstraintAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getMultiLiteralOperationAccess().getOperatorEOperationParserRuleCall_1_0());
				}
				lv_operator_1_0=ruleEOperation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMultiLiteralOperationRule());
					}
					set(
						$current,
						"operator",
						lv_operator_1_0,
						"org.osate.xtext.aadlv3.AadlV3.EOperation");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getMultiLiteralOperationAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getMultiLiteralOperationAccess().getElementsLiteralParserRuleCall_3_0_0());
					}
					lv_elements_3_0=ruleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMultiLiteralOperationRule());
						}
						add(
							$current,
							"elements",
							lv_elements_3_0,
							"org.osate.xtext.aadlv3.AadlV3.Literal");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getMultiLiteralOperationAccess().getCommaKeyword_3_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getMultiLiteralOperationAccess().getElementsLiteralParserRuleCall_3_1_1_0());
						}
						lv_elements_5_0=ruleLiteral
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMultiLiteralOperationRule());
							}
							add(
								$current,
								"elements",
								lv_elements_5_0,
								"org.osate.xtext.aadlv3.AadlV3.Literal");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getMultiLiteralOperationAccess().getRightParenthesisKeyword_4());
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

// Entry rule entryRulePropagationDirection
entryRulePropagationDirection returns [String current=null]:
	{ newCompositeNode(grammarAccess.getPropagationDirectionRule()); }
	iv_rulePropagationDirection=rulePropagationDirection
	{ $current=$iv_rulePropagationDirection.current.getText(); }
	EOF;

// Rule PropagationDirection
rulePropagationDirection returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
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
			newLeafNode(kw, grammarAccess.getPropagationDirectionAccess().getInKeyword_0());
		}
		    |
		kw='out'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getPropagationDirectionAccess().getOutKeyword_1());
		}
	)
;

// Entry rule entryRuleComposite
entryRuleComposite returns [String current=null]:
	{ newCompositeNode(grammarAccess.getCompositeRule()); }
	iv_ruleComposite=ruleComposite
	{ $current=$iv_ruleComposite.current.getText(); }
	EOF;

// Rule Composite
ruleComposite returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='list'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCompositeAccess().getListKeyword_0());
		}
		    |
		kw='set'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCompositeAccess().getSetKeyword_1());
		}
	)
;

// Entry rule entryRulePrimitive
entryRulePrimitive returns [String current=null]:
	{ newCompositeNode(grammarAccess.getPrimitiveRule()); }
	iv_rulePrimitive=rulePrimitive
	{ $current=$iv_rulePrimitive.current.getText(); }
	EOF;

// Rule Primitive
rulePrimitive returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='boolean'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getPrimitiveAccess().getBooleanKeyword_0());
		}
		    |
		kw='integer'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getPrimitiveAccess().getIntegerKeyword_1());
		}
		    |
		kw='real'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getPrimitiveAccess().getRealKeyword_2());
		}
		    |
		kw='string'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getPrimitiveAccess().getStringKeyword_3());
		}
	)
;

// Entry rule entryRuleEOperation
entryRuleEOperation returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEOperationRule()); }
	iv_ruleEOperation=ruleEOperation
	{ $current=$iv_ruleEOperation.current.getText(); }
	EOF;

// Rule EOperation
ruleEOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='any'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEOperationAccess().getAnyKeyword_0());
		}
		    |
		kw='all'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEOperationAccess().getAllKeyword_1());
		}
		    |
		kw='oneof'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEOperationAccess().getOneofKeyword_2());
		}
		    |
		kw='of'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEOperationAccess().getOfKeyword_3());
		}
		    |
		kw='ormore'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEOperationAccess().getOrmoreKeyword_4());
		}
		    |
		kw='orless'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEOperationAccess().getOrlessKeyword_5());
		}
	)
;

// Entry rule entryRuleSatisfiesOperation
entryRuleSatisfiesOperation returns [String current=null]:
	{ newCompositeNode(grammarAccess.getSatisfiesOperationRule()); }
	iv_ruleSatisfiesOperation=ruleSatisfiesOperation
	{ $current=$iv_ruleSatisfiesOperation.current.getText(); }
	EOF;

// Rule SatisfiesOperation
ruleSatisfiesOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='satisfies'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getSatisfiesOperationAccess().getSatisfiesKeyword());
	}
;

// Entry rule entryRuleEqualsOperation
entryRuleEqualsOperation returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEqualsOperationRule()); }
	iv_ruleEqualsOperation=ruleEqualsOperation
	{ $current=$iv_ruleEqualsOperation.current.getText(); }
	EOF;

// Rule EqualsOperation
ruleEqualsOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='='
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getEqualsOperationAccess().getEqualsSignKeyword());
	}
;

// Entry rule entryRuleInOperation
entryRuleInOperation returns [String current=null]:
	{ newCompositeNode(grammarAccess.getInOperationRule()); }
	iv_ruleInOperation=ruleInOperation
	{ $current=$iv_ruleInOperation.current.getText(); }
	EOF;

// Rule InOperation
ruleInOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='in'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getInOperationAccess().getInKeyword());
	}
;

// Entry rule entryRuleInputOperation
entryRuleInputOperation returns [String current=null]:
	{ newCompositeNode(grammarAccess.getInputOperationRule()); }
	iv_ruleInputOperation=ruleInputOperation
	{ $current=$iv_ruleInputOperation.current.getText(); }
	EOF;

// Rule InputOperation
ruleInputOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='?'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getInputOperationAccess().getQuestionMarkKeyword());
	}
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

// Entry rule entryRuleEndToEndFLowKeywords
entryRuleEndToEndFLowKeywords returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEndToEndFLowKeywordsRule()); }
	iv_ruleEndToEndFLowKeywords=ruleEndToEndFLowKeywords
	{ $current=$iv_ruleEndToEndFLowKeywords.current.getText(); }
	EOF;

// Rule EndToEndFLowKeywords
ruleEndToEndFLowKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
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
			newLeafNode(kw, grammarAccess.getEndToEndFLowKeywordsAccess().getEndKeyword_0());
		}
		kw='to'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEndToEndFLowKeywordsAccess().getToKeyword_1());
		}
		kw='end'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEndToEndFLowKeywordsAccess().getEndKeyword_2());
		}
		kw='flow'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEndToEndFLowKeywordsAccess().getFlowKeyword_3());
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

RULE_DOUBLE : ('0'..'9')+ '.' ('0'..'9')+;

RULE_ANNEXTEXT : '{*' ( options {greedy=false;} : . )*'*}';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
