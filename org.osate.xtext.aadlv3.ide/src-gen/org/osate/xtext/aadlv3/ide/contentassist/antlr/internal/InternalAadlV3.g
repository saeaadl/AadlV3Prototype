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
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@lexer::header {
package org.osate.xtext.aadlv3.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.osate.xtext.aadlv3.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.osate.xtext.aadlv3.services.AadlV3GrammarAccess;

}
@parser::members {
	private AadlV3GrammarAccess grammarAccess;

	public void setGrammarAccess(AadlV3GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRulePackageDeclaration
entryRulePackageDeclaration
:
{ before(grammarAccess.getPackageDeclarationRule()); }
	 rulePackageDeclaration
{ after(grammarAccess.getPackageDeclarationRule()); } 
	 EOF 
;

// Rule PackageDeclaration
rulePackageDeclaration 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPackageDeclarationAccess().getGroup()); }
		(rule__PackageDeclaration__Group__0)
		{ after(grammarAccess.getPackageDeclarationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAnnexLibrary
entryRuleAnnexLibrary
:
{ before(grammarAccess.getAnnexLibraryRule()); }
	 ruleAnnexLibrary
{ after(grammarAccess.getAnnexLibraryRule()); } 
	 EOF 
;

// Rule AnnexLibrary
ruleAnnexLibrary 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAnnexLibraryAccess().getGroup()); }
		(rule__AnnexLibrary__Group__0)
		{ after(grammarAccess.getAnnexLibraryAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePackageElement
entryRulePackageElement
:
{ before(grammarAccess.getPackageElementRule()); }
	 rulePackageElement
{ after(grammarAccess.getPackageElementRule()); } 
	 EOF 
;

// Rule PackageElement
rulePackageElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPackageElementAccess().getAlternatives()); }
		(rule__PackageElement__Alternatives)
		{ after(grammarAccess.getPackageElementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePropertyDefinition
entryRulePropertyDefinition
:
{ before(grammarAccess.getPropertyDefinitionRule()); }
	 rulePropertyDefinition
{ after(grammarAccess.getPropertyDefinitionRule()); } 
	 EOF 
;

// Rule PropertyDefinition
rulePropertyDefinition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPropertyDefinitionAccess().getGroup()); }
		(rule__PropertyDefinition__Group__0)
		{ after(grammarAccess.getPropertyDefinitionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}


// Rule AppliesTo
ruleAppliesTo 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAppliesToAccess().getAlternatives()); }
		(rule__AppliesTo__Alternatives)
		{ after(grammarAccess.getAppliesToAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePropertySet
entryRulePropertySet
:
{ before(grammarAccess.getPropertySetRule()); }
	 rulePropertySet
{ after(grammarAccess.getPropertySetRule()); } 
	 EOF 
;

// Rule PropertySet
rulePropertySet 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPropertySetAccess().getGroup()); }
		(rule__PropertySet__Group__0)
		{ after(grammarAccess.getPropertySetAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTypeDef
entryRuleTypeDef
:
{ before(grammarAccess.getTypeDefRule()); }
	 ruleTypeDef
{ after(grammarAccess.getTypeDefRule()); } 
	 EOF 
;

// Rule TypeDef
ruleTypeDef 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeDefAccess().getGroup()); }
		(rule__TypeDef__Group__0)
		{ after(grammarAccess.getTypeDefAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePropertyAssociation
entryRulePropertyAssociation
:
{ before(grammarAccess.getPropertyAssociationRule()); }
	 rulePropertyAssociation
{ after(grammarAccess.getPropertyAssociationRule()); } 
	 EOF 
;

// Rule PropertyAssociation
rulePropertyAssociation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPropertyAssociationAccess().getGroup()); }
		(rule__PropertyAssociation__Group__0)
		{ after(grammarAccess.getPropertyAssociationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePropertyAssociationType
entryRulePropertyAssociationType
:
{ before(grammarAccess.getPropertyAssociationTypeRule()); }
	 rulePropertyAssociationType
{ after(grammarAccess.getPropertyAssociationTypeRule()); } 
	 EOF 
;

// Rule PropertyAssociationType
rulePropertyAssociationType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPropertyAssociationTypeAccess().getAlternatives()); }
		(rule__PropertyAssociationType__Alternatives)
		{ after(grammarAccess.getPropertyAssociationTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleModelElementReference
entryRuleModelElementReference
:
{ before(grammarAccess.getModelElementReferenceRule()); }
	 ruleModelElementReference
{ after(grammarAccess.getModelElementReferenceRule()); } 
	 EOF 
;

// Rule ModelElementReference
ruleModelElementReference 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelElementReferenceAccess().getGroup()); }
		(rule__ModelElementReference__Group__0)
		{ after(grammarAccess.getModelElementReferenceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNamedElementReference
entryRuleNamedElementReference
:
{ before(grammarAccess.getNamedElementReferenceRule()); }
	 ruleNamedElementReference
{ after(grammarAccess.getNamedElementReferenceRule()); } 
	 EOF 
;

// Rule NamedElementReference
ruleNamedElementReference 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNamedElementReferenceAccess().getGroup()); }
		(rule__NamedElementReference__Group__0)
		{ after(grammarAccess.getNamedElementReferenceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComponentInterface
entryRuleComponentInterface
:
{ before(grammarAccess.getComponentInterfaceRule()); }
	 ruleComponentInterface
{ after(grammarAccess.getComponentInterfaceRule()); } 
	 EOF 
;

// Rule ComponentInterface
ruleComponentInterface 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComponentInterfaceAccess().getGroup()); }
		(rule__ComponentInterface__Group__0)
		{ after(grammarAccess.getComponentInterfaceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}


// Rule InterfaceBody
ruleInterfaceBody 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInterfaceBodyAccess().getGroup()); }
		(rule__InterfaceBody__Group__0)
		{ after(grammarAccess.getInterfaceBodyAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}


// Rule InterfaceElement
ruleInterfaceElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInterfaceElementAccess().getAlternatives()); }
		(rule__InterfaceElement__Alternatives)
		{ after(grammarAccess.getInterfaceElementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComponentImplementation
entryRuleComponentImplementation
:
{ before(grammarAccess.getComponentImplementationRule()); }
	 ruleComponentImplementation
{ after(grammarAccess.getComponentImplementationRule()); } 
	 EOF 
;

// Rule ComponentImplementation
ruleComponentImplementation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComponentImplementationAccess().getGroup()); }
		(rule__ComponentImplementation__Group__0)
		{ after(grammarAccess.getComponentImplementationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}


// Rule ImplementationBody
ruleImplementationBody 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getImplementationBodyAccess().getGroup()); }
		(rule__ImplementationBody__Group__0)
		{ after(grammarAccess.getImplementationBodyAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}


// Rule ImplementationElement
ruleImplementationElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getImplementationElementAccess().getAlternatives()); }
		(rule__ImplementationElement__Alternatives)
		{ after(grammarAccess.getImplementationElementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComponentConfiguration
entryRuleComponentConfiguration
:
{ before(grammarAccess.getComponentConfigurationRule()); }
	 ruleComponentConfiguration
{ after(grammarAccess.getComponentConfigurationRule()); } 
	 EOF 
;

// Rule ComponentConfiguration
ruleComponentConfiguration 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComponentConfigurationAccess().getGroup()); }
		(rule__ComponentConfiguration__Group__0)
		{ after(grammarAccess.getComponentConfigurationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFeature
entryRuleFeature
:
{ before(grammarAccess.getFeatureRule()); }
	 ruleFeature
{ after(grammarAccess.getFeatureRule()); } 
	 EOF 
;

// Rule Feature
ruleFeature 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFeatureAccess().getGroup()); }
		(rule__Feature__Group__0)
		{ after(grammarAccess.getFeatureAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSubcomponent
entryRuleSubcomponent
:
{ before(grammarAccess.getSubcomponentRule()); }
	 ruleSubcomponent
{ after(grammarAccess.getSubcomponentRule()); } 
	 EOF 
;

// Rule Subcomponent
ruleSubcomponent 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSubcomponentAccess().getGroup()); }
		(rule__Subcomponent__Group__0)
		{ after(grammarAccess.getSubcomponentAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConnection
entryRuleConnection
:
{ before(grammarAccess.getConnectionRule()); }
	 ruleConnection
{ after(grammarAccess.getConnectionRule()); } 
	 EOF 
;

// Rule Connection
ruleConnection 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConnectionAccess().getGroup()); }
		(rule__Connection__Group__0)
		{ after(grammarAccess.getConnectionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBinding
entryRuleBinding
:
{ before(grammarAccess.getBindingRule()); }
	 ruleBinding
{ after(grammarAccess.getBindingRule()); } 
	 EOF 
;

// Rule Binding
ruleBinding 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBindingAccess().getGroup()); }
		(rule__Binding__Group__0)
		{ after(grammarAccess.getBindingAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}


// Rule UseProps
ruleUseProps 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getUsePropsAccess().getGroup()); }
		(rule__UseProps__Group__0)
		{ after(grammarAccess.getUsePropsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}


// Rule InStates
ruleInStates 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInStatesAccess().getGroup()); }
		(rule__InStates__Group__0)
		{ after(grammarAccess.getInStatesAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEndToEndFlow
entryRuleEndToEndFlow
:
{ before(grammarAccess.getEndToEndFlowRule()); }
	 ruleEndToEndFlow
{ after(grammarAccess.getEndToEndFlowRule()); } 
	 EOF 
;

// Rule EndToEndFlow
ruleEndToEndFlow 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEndToEndFlowAccess().getGroup()); }
		(rule__EndToEndFlow__Group__0)
		{ after(grammarAccess.getEndToEndFlowAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePathElement
entryRulePathElement
:
{ before(grammarAccess.getPathElementRule()); }
	 rulePathElement
{ after(grammarAccess.getPathElementRule()); } 
	 EOF 
;

// Rule PathElement
rulePathElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPathElementAccess().getGroup()); }
		(rule__PathElement__Group__0)
		{ after(grammarAccess.getPathElementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleImport
entryRuleImport
:
{ before(grammarAccess.getImportRule()); }
	 ruleImport
{ after(grammarAccess.getImportRule()); } 
	 EOF 
;

// Rule Import
ruleImport 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getImportAccess().getGroup()); }
		(rule__Import__Group__0)
		{ after(grammarAccess.getImportAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleClassifierAssignment
entryRuleClassifierAssignment
:
{ before(grammarAccess.getClassifierAssignmentRule()); }
	 ruleClassifierAssignment
{ after(grammarAccess.getClassifierAssignmentRule()); } 
	 EOF 
;

// Rule ClassifierAssignment
ruleClassifierAssignment 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getClassifierAssignmentAccess().getGroup()); }
		(rule__ClassifierAssignment__Group__0)
		{ after(grammarAccess.getClassifierAssignmentAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleClassifierAssignmentPattern
entryRuleClassifierAssignmentPattern
:
{ before(grammarAccess.getClassifierAssignmentPatternRule()); }
	 ruleClassifierAssignmentPattern
{ after(grammarAccess.getClassifierAssignmentPatternRule()); } 
	 EOF 
;

// Rule ClassifierAssignmentPattern
ruleClassifierAssignmentPattern 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getClassifierAssignmentPatternAccess().getGroup()); }
		(rule__ClassifierAssignmentPattern__Group__0)
		{ after(grammarAccess.getClassifierAssignmentPatternAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}


// Rule QueryExpression
ruleQueryExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQueryExpressionAccess().getGroup()); }
		(rule__QueryExpression__Group__0)
		{ after(grammarAccess.getQueryExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFlowAssignment
entryRuleFlowAssignment
:
{ before(grammarAccess.getFlowAssignmentRule()); }
	 ruleFlowAssignment
{ after(grammarAccess.getFlowAssignmentRule()); } 
	 EOF 
;

// Rule FlowAssignment
ruleFlowAssignment 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFlowAssignmentAccess().getGroup()); }
		(rule__FlowAssignment__Group__0)
		{ after(grammarAccess.getFlowAssignmentAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}


// Rule ConfigurationElementBlock
ruleConfigurationElementBlock 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConfigurationElementBlockAccess().getGroup()); }
		(rule__ConfigurationElementBlock__Group__0)
		{ after(grammarAccess.getConfigurationElementBlockAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}


// Rule CurlyConfigurationElementBlock
ruleCurlyConfigurationElementBlock 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCurlyConfigurationElementBlockAccess().getGroup()); }
		(rule__CurlyConfigurationElementBlock__Group__0)
		{ after(grammarAccess.getCurlyConfigurationElementBlockAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}


// Rule ConfigurationElement
ruleConfigurationElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConfigurationElementAccess().getAlternatives()); }
		(rule__ConfigurationElement__Alternatives)
		{ after(grammarAccess.getConfigurationElementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}


// Rule Parameters
ruleParameters 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParametersAccess().getGroup()); }
		(rule__Parameters__Group__0)
		{ after(grammarAccess.getParametersAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConfigurationParameter
entryRuleConfigurationParameter
:
{ before(grammarAccess.getConfigurationParameterRule()); }
	 ruleConfigurationParameter
{ after(grammarAccess.getConfigurationParameterRule()); } 
	 EOF 
;

// Rule ConfigurationParameter
ruleConfigurationParameter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConfigurationParameterAccess().getGroup()); }
		(rule__ConfigurationParameter__Group__0)
		{ after(grammarAccess.getConfigurationParameterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleReversableInterfaceReference
entryRuleReversableInterfaceReference
:
{ before(grammarAccess.getReversableInterfaceReferenceRule()); }
	 ruleReversableInterfaceReference
{ after(grammarAccess.getReversableInterfaceReferenceRule()); } 
	 EOF 
;

// Rule ReversableInterfaceReference
ruleReversableInterfaceReference 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getReversableInterfaceReferenceAccess().getGroup()); }
		(rule__ReversableInterfaceReference__Group__0)
		{ after(grammarAccess.getReversableInterfaceReferenceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleReversableTypeReference
entryRuleReversableTypeReference
:
{ before(grammarAccess.getReversableTypeReferenceRule()); }
	 ruleReversableTypeReference
{ after(grammarAccess.getReversableTypeReferenceRule()); } 
	 EOF 
;

// Rule ReversableTypeReference
ruleReversableTypeReference 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getReversableTypeReferenceAccess().getGroup()); }
		(rule__ReversableTypeReference__Group__0)
		{ after(grammarAccess.getReversableTypeReferenceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleClassifierOrTypeReference
entryRuleClassifierOrTypeReference
:
{ before(grammarAccess.getClassifierOrTypeReferenceRule()); }
	 ruleClassifierOrTypeReference
{ after(grammarAccess.getClassifierOrTypeReferenceRule()); } 
	 EOF 
;

// Rule ClassifierOrTypeReference
ruleClassifierOrTypeReference 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getClassifierOrTypeReferenceAccess().getGroup()); }
		(rule__ClassifierOrTypeReference__Group__0)
		{ after(grammarAccess.getClassifierOrTypeReferenceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTypeReference
entryRuleTypeReference
:
{ before(grammarAccess.getTypeReferenceRule()); }
	 ruleTypeReference
{ after(grammarAccess.getTypeReferenceRule()); } 
	 EOF 
;

// Rule TypeReference
ruleTypeReference 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeReferenceAccess().getTypeAssignment()); }
		(rule__TypeReference__TypeAssignment)
		{ after(grammarAccess.getTypeReferenceAccess().getTypeAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleType
entryRuleType
:
{ before(grammarAccess.getTypeRule()); }
	 ruleType
{ after(grammarAccess.getTypeRule()); } 
	 EOF 
;

// Rule Type
ruleType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeAccess().getAlternatives()); }
		(rule__Type__Alternatives)
		{ after(grammarAccess.getTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEnumerationType
entryRuleEnumerationType
:
{ before(grammarAccess.getEnumerationTypeRule()); }
	 ruleEnumerationType
{ after(grammarAccess.getEnumerationTypeRule()); } 
	 EOF 
;

// Rule EnumerationType
ruleEnumerationType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEnumerationTypeAccess().getGroup()); }
		(rule__EnumerationType__Group__0)
		{ after(grammarAccess.getEnumerationTypeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCompositeType
entryRuleCompositeType
:
{ before(grammarAccess.getCompositeTypeRule()); }
	 ruleCompositeType
{ after(grammarAccess.getCompositeTypeRule()); } 
	 EOF 
;

// Rule CompositeType
ruleCompositeType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCompositeTypeAccess().getGroup()); }
		(rule__CompositeType__Group__0)
		{ after(grammarAccess.getCompositeTypeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePrimitiveType
entryRulePrimitiveType
:
{ before(grammarAccess.getPrimitiveTypeRule()); }
	 rulePrimitiveType
{ after(grammarAccess.getPrimitiveTypeRule()); } 
	 EOF 
;

// Rule PrimitiveType
rulePrimitiveType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPrimitiveTypeAccess().getPrimitiveTypeAssignment()); }
		(rule__PrimitiveType__PrimitiveTypeAssignment)
		{ after(grammarAccess.getPrimitiveTypeAccess().getPrimitiveTypeAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleImplementationReference
entryRuleImplementationReference
:
{ before(grammarAccess.getImplementationReferenceRule()); }
	 ruleImplementationReference
{ after(grammarAccess.getImplementationReferenceRule()); } 
	 EOF 
;

// Rule ImplementationReference
ruleImplementationReference 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getImplementationReferenceAccess().getTypeAssignment()); }
		(rule__ImplementationReference__TypeAssignment)
		{ after(grammarAccess.getImplementationReferenceAccess().getTypeAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAnnexSubclause
entryRuleAnnexSubclause
:
{ before(grammarAccess.getAnnexSubclauseRule()); }
	 ruleAnnexSubclause
{ after(grammarAccess.getAnnexSubclauseRule()); } 
	 EOF 
;

// Rule AnnexSubclause
ruleAnnexSubclause 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAnnexSubclauseAccess().getDefaultAnnexSubclauseParserRuleCall()); }
		ruleDefaultAnnexSubclause
		{ after(grammarAccess.getAnnexSubclauseAccess().getDefaultAnnexSubclauseParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDefaultAnnexSubclause
entryRuleDefaultAnnexSubclause
:
{ before(grammarAccess.getDefaultAnnexSubclauseRule()); }
	 ruleDefaultAnnexSubclause
{ after(grammarAccess.getDefaultAnnexSubclauseRule()); } 
	 EOF 
;

// Rule DefaultAnnexSubclause
ruleDefaultAnnexSubclause 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDefaultAnnexSubclauseAccess().getGroup()); }
		(rule__DefaultAnnexSubclause__Group__0)
		{ after(grammarAccess.getDefaultAnnexSubclauseAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}


// Rule PropertiesBlock
rulePropertiesBlock 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPropertiesBlockAccess().getGroup()); }
		(rule__PropertiesBlock__Group__0)
		{ after(grammarAccess.getPropertiesBlockAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}


// Rule NestedComponentImplementationBlock
ruleNestedComponentImplementationBlock 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNestedComponentImplementationBlockAccess().getGroup()); }
		(rule__NestedComponentImplementationBlock__Group__0)
		{ after(grammarAccess.getNestedComponentImplementationBlockAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}


// Rule NestedImplementationElement
ruleNestedImplementationElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNestedImplementationElementAccess().getAlternatives()); }
		(rule__NestedImplementationElement__Alternatives)
		{ after(grammarAccess.getNestedImplementationElementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}


// Rule ConfigurationExtensions
ruleConfigurationExtensions 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConfigurationExtensionsAccess().getGroup()); }
		(rule__ConfigurationExtensions__Group__0)
		{ after(grammarAccess.getConfigurationExtensionsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}


// Rule ImplementationExtensions
ruleImplementationExtensions 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getImplementationExtensionsAccess().getGroup()); }
		(rule__ImplementationExtensions__Group__0)
		{ after(grammarAccess.getImplementationExtensionsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}


// Rule InterfaceExtensions
ruleInterfaceExtensions 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInterfaceExtensionsAccess().getGroup()); }
		(rule__InterfaceExtensions__Group__0)
		{ after(grammarAccess.getInterfaceExtensionsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}


// Rule ConfigurationActuals
ruleConfigurationActuals 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConfigurationActualsAccess().getGroup()); }
		(rule__ConfigurationActuals__Group__0)
		{ after(grammarAccess.getConfigurationActualsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConfigurationActual
entryRuleConfigurationActual
:
{ before(grammarAccess.getConfigurationActualRule()); }
	 ruleConfigurationActual
{ after(grammarAccess.getConfigurationActualRule()); } 
	 EOF 
;

// Rule ConfigurationActual
ruleConfigurationActual 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConfigurationActualAccess().getGroup()); }
		(rule__ConfigurationActual__Group__0)
		{ after(grammarAccess.getConfigurationActualAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleWorkingset
entryRuleWorkingset
:
{ before(grammarAccess.getWorkingsetRule()); }
	 ruleWorkingset
{ after(grammarAccess.getWorkingsetRule()); } 
	 EOF 
;

// Rule Workingset
ruleWorkingset 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getWorkingsetAccess().getGroup()); }
		(rule__Workingset__Group__0)
		{ after(grammarAccess.getWorkingsetAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInstanceConfiguration
entryRuleInstanceConfiguration
:
{ before(grammarAccess.getInstanceConfigurationRule()); }
	 ruleInstanceConfiguration
{ after(grammarAccess.getInstanceConfigurationRule()); } 
	 EOF 
;

// Rule InstanceConfiguration
ruleInstanceConfiguration 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInstanceConfigurationAccess().getGroup()); }
		(rule__InstanceConfiguration__Group__0)
		{ after(grammarAccess.getInstanceConfigurationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleProductLineConstraint
entryRuleProductLineConstraint
:
{ before(grammarAccess.getProductLineConstraintRule()); }
	 ruleProductLineConstraint
{ after(grammarAccess.getProductLineConstraintRule()); } 
	 EOF 
;

// Rule ProductLineConstraint
ruleProductLineConstraint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getProductLineConstraintAccess().getGroup()); }
		(rule__ProductLineConstraint__Group__0)
		{ after(grammarAccess.getProductLineConstraintAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBehaviorAnnotationBlock
entryRuleBehaviorAnnotationBlock
:
{ before(grammarAccess.getBehaviorAnnotationBlockRule()); }
	 ruleBehaviorAnnotationBlock
{ after(grammarAccess.getBehaviorAnnotationBlockRule()); } 
	 EOF 
;

// Rule BehaviorAnnotationBlock
ruleBehaviorAnnotationBlock 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBehaviorAnnotationBlockAccess().getGroup()); }
		(rule__BehaviorAnnotationBlock__Group__0)
		{ after(grammarAccess.getBehaviorAnnotationBlockAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}


// Rule BehaviorAnnotationElements
ruleBehaviorAnnotationElements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBehaviorAnnotationElementsAccess().getBehaviorAnnotationElementParserRuleCall()); }
		(ruleBehaviorAnnotationElement)*
		{ after(grammarAccess.getBehaviorAnnotationElementsAccess().getBehaviorAnnotationElementParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}


// Rule BehaviorAnnotationElement
ruleBehaviorAnnotationElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBehaviorAnnotationElementAccess().getElementsAssignment()); }
		(rule__BehaviorAnnotationElement__ElementsAssignment)
		{ after(grammarAccess.getBehaviorAnnotationElementAccess().getElementsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStateVariable
entryRuleStateVariable
:
{ before(grammarAccess.getStateVariableRule()); }
	 ruleStateVariable
{ after(grammarAccess.getStateVariableRule()); } 
	 EOF 
;

// Rule StateVariable
ruleStateVariable 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStateVariableAccess().getGroup()); }
		(rule__StateVariable__Group__0)
		{ after(grammarAccess.getStateVariableAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGenerator
entryRuleGenerator
:
{ before(grammarAccess.getGeneratorRule()); }
	 ruleGenerator
{ after(grammarAccess.getGeneratorRule()); } 
	 EOF 
;

// Rule Generator
ruleGenerator 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGeneratorAccess().getGroup()); }
		(rule__Generator__Group__0)
		{ after(grammarAccess.getGeneratorAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStateTransition
entryRuleStateTransition
:
{ before(grammarAccess.getStateTransitionRule()); }
	 ruleStateTransition
{ after(grammarAccess.getStateTransitionRule()); } 
	 EOF 
;

// Rule StateTransition
ruleStateTransition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStateTransitionAccess().getGroup()); }
		(rule__StateTransition__Group__0)
		{ after(grammarAccess.getStateTransitionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStateSynchronization
entryRuleStateSynchronization
:
{ before(grammarAccess.getStateSynchronizationRule()); }
	 ruleStateSynchronization
{ after(grammarAccess.getStateSynchronizationRule()); } 
	 EOF 
;

// Rule StateSynchronization
ruleStateSynchronization 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStateSynchronizationAccess().getGroup()); }
		(rule__StateSynchronization__Group__0)
		{ after(grammarAccess.getStateSynchronizationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBehavior
entryRuleBehavior
:
{ before(grammarAccess.getBehaviorRule()); }
	 ruleBehavior
{ after(grammarAccess.getBehaviorRule()); } 
	 EOF 
;

// Rule Behavior
ruleBehavior 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBehaviorAccess().getAlternatives()); }
		(rule__Behavior__Alternatives)
		{ after(grammarAccess.getBehaviorAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTokenFlow
entryRuleTokenFlow
:
{ before(grammarAccess.getTokenFlowRule()); }
	 ruleTokenFlow
{ after(grammarAccess.getTokenFlowRule()); } 
	 EOF 
;

// Rule TokenFlow
ruleTokenFlow 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTokenFlowAccess().getGroup()); }
		(rule__TokenFlow__Group__0)
		{ after(grammarAccess.getTokenFlowAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComputationalBehavior
entryRuleComputationalBehavior
:
{ before(grammarAccess.getComputationalBehaviorRule()); }
	 ruleComputationalBehavior
{ after(grammarAccess.getComputationalBehaviorRule()); } 
	 EOF 
;

// Rule ComputationalBehavior
ruleComputationalBehavior 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComputationalBehaviorAccess().getGroup()); }
		(rule__ComputationalBehavior__Group__0)
		{ after(grammarAccess.getComputationalBehaviorAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}


// Rule TokenResultBlock
ruleTokenResultBlock 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTokenResultBlockAccess().getGroup()); }
		(rule__TokenResultBlock__Group__0)
		{ after(grammarAccess.getTokenResultBlockAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTokenResult
entryRuleTokenResult
:
{ before(grammarAccess.getTokenResultRule()); }
	 ruleTokenResult
{ after(grammarAccess.getTokenResultRule()); } 
	 EOF 
;

// Rule TokenResult
ruleTokenResult 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTokenResultAccess().getAlternatives()); }
		(rule__TokenResult__Alternatives)
		{ after(grammarAccess.getTokenResultAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTokenOutput
entryRuleTokenOutput
:
{ before(grammarAccess.getTokenOutputRule()); }
	 ruleTokenOutput
{ after(grammarAccess.getTokenOutputRule()); } 
	 EOF 
;

// Rule TokenOutput
ruleTokenOutput 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTokenOutputAccess().getGroup()); }
		(rule__TokenOutput__Group__0)
		{ after(grammarAccess.getTokenOutputAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDetectionEvent
entryRuleDetectionEvent
:
{ before(grammarAccess.getDetectionEventRule()); }
	 ruleDetectionEvent
{ after(grammarAccess.getDetectionEventRule()); } 
	 EOF 
;

// Rule DetectionEvent
ruleDetectionEvent 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDetectionEventAccess().getGroup()); }
		(rule__DetectionEvent__Group__0)
		{ after(grammarAccess.getDetectionEventAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleModelElementContainsLiteral
entryRuleModelElementContainsLiteral
:
{ before(grammarAccess.getModelElementContainsLiteralRule()); }
	 ruleModelElementContainsLiteral
{ after(grammarAccess.getModelElementContainsLiteralRule()); } 
	 EOF 
;

// Rule ModelElementContainsLiteral
ruleModelElementContainsLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelElementContainsLiteralAccess().getGroup()); }
		(rule__ModelElementContainsLiteral__Group__0)
		{ after(grammarAccess.getModelElementContainsLiteralAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleModelElementContainsEnumerationLiteral
entryRuleModelElementContainsEnumerationLiteral
:
{ before(grammarAccess.getModelElementContainsEnumerationLiteralRule()); }
	 ruleModelElementContainsEnumerationLiteral
{ after(grammarAccess.getModelElementContainsEnumerationLiteralRule()); } 
	 EOF 
;

// Rule ModelElementContainsEnumerationLiteral
ruleModelElementContainsEnumerationLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelElementContainsEnumerationLiteralAccess().getGroup()); }
		(rule__ModelElementContainsEnumerationLiteral__Group__0)
		{ after(grammarAccess.getModelElementContainsEnumerationLiteralAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleModelElementEqualsLiteral
entryRuleModelElementEqualsLiteral
:
{ before(grammarAccess.getModelElementEqualsLiteralRule()); }
	 ruleModelElementEqualsLiteral
{ after(grammarAccess.getModelElementEqualsLiteralRule()); } 
	 EOF 
;

// Rule ModelElementEqualsLiteral
ruleModelElementEqualsLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelElementEqualsLiteralAccess().getGroup()); }
		(rule__ModelElementEqualsLiteral__Group__0)
		{ after(grammarAccess.getModelElementEqualsLiteralAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleModelElementEqualsEnumerationLiteral
entryRuleModelElementEqualsEnumerationLiteral
:
{ before(grammarAccess.getModelElementEqualsEnumerationLiteralRule()); }
	 ruleModelElementEqualsEnumerationLiteral
{ after(grammarAccess.getModelElementEqualsEnumerationLiteralRule()); } 
	 EOF 
;

// Rule ModelElementEqualsEnumerationLiteral
ruleModelElementEqualsEnumerationLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelElementEqualsEnumerationLiteralAccess().getGroup()); }
		(rule__ModelElementEqualsEnumerationLiteral__Group__0)
		{ after(grammarAccess.getModelElementEqualsEnumerationLiteralAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAnnotation
entryRuleAnnotation
:
{ before(grammarAccess.getAnnotationRule()); }
	 ruleAnnotation
{ after(grammarAccess.getAnnotationRule()); } 
	 EOF 
;

// Rule Annotation
ruleAnnotation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAnnotationAccess().getGroup()); }
		(rule__Annotation__Group__0)
		{ after(grammarAccess.getAnnotationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAnnotationParameter
entryRuleAnnotationParameter
:
{ before(grammarAccess.getAnnotationParameterRule()); }
	 ruleAnnotationParameter
{ after(grammarAccess.getAnnotationParameterRule()); } 
	 EOF 
;

// Rule AnnotationParameter
ruleAnnotationParameter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAnnotationParameterAccess().getGroup()); }
		(rule__AnnotationParameter__Group__0)
		{ after(grammarAccess.getAnnotationParameterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLiteral
entryRuleLiteral
:
{ before(grammarAccess.getLiteralRule()); }
	 ruleLiteral
{ after(grammarAccess.getLiteralRule()); } 
	 EOF 
;

// Rule Literal
ruleLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLiteralAccess().getAlternatives()); }
		(rule__Literal__Alternatives)
		{ after(grammarAccess.getLiteralAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePropertyReference
entryRulePropertyReference
:
{ before(grammarAccess.getPropertyReferenceRule()); }
	 rulePropertyReference
{ after(grammarAccess.getPropertyReferenceRule()); } 
	 EOF 
;

// Rule PropertyReference
rulePropertyReference 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPropertyReferenceAccess().getGroup()); }
		(rule__PropertyReference__Group__0)
		{ after(grammarAccess.getPropertyReferenceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIntegerLiteral
entryRuleIntegerLiteral
:
{ before(grammarAccess.getIntegerLiteralRule()); }
	 ruleIntegerLiteral
{ after(grammarAccess.getIntegerLiteralRule()); } 
	 EOF 
;

// Rule IntegerLiteral
ruleIntegerLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIntegerLiteralAccess().getGroup()); }
		(rule__IntegerLiteral__Group__0)
		{ after(grammarAccess.getIntegerLiteralAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRealLiteral
entryRuleRealLiteral
:
{ before(grammarAccess.getRealLiteralRule()); }
	 ruleRealLiteral
{ after(grammarAccess.getRealLiteralRule()); } 
	 EOF 
;

// Rule RealLiteral
ruleRealLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRealLiteralAccess().getGroup()); }
		(rule__RealLiteral__Group__0)
		{ after(grammarAccess.getRealLiteralAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStringLiteral
entryRuleStringLiteral
:
{ before(grammarAccess.getStringLiteralRule()); }
	 ruleStringLiteral
{ after(grammarAccess.getStringLiteralRule()); } 
	 EOF 
;

// Rule StringLiteral
ruleStringLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStringLiteralAccess().getGroup()); }
		(rule__StringLiteral__Group__0)
		{ after(grammarAccess.getStringLiteralAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEnumerationLiteral
entryRuleEnumerationLiteral
:
{ before(grammarAccess.getEnumerationLiteralRule()); }
	 ruleEnumerationLiteral
{ after(grammarAccess.getEnumerationLiteralRule()); } 
	 EOF 
;

// Rule EnumerationLiteral
ruleEnumerationLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEnumerationLiteralAccess().getGroup()); }
		(rule__EnumerationLiteral__Group__0)
		{ after(grammarAccess.getEnumerationLiteralAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNoQuoteString
entryRuleNoQuoteString
:
{ before(grammarAccess.getNoQuoteStringRule()); }
	 ruleNoQuoteString
{ after(grammarAccess.getNoQuoteStringRule()); } 
	 EOF 
;

// Rule NoQuoteString
ruleNoQuoteString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNoQuoteStringAccess().getSTRINGTerminalRuleCall()); }
		RULE_STRING
		{ after(grammarAccess.getNoQuoteStringAccess().getSTRINGTerminalRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBooleanLiteral
entryRuleBooleanLiteral
:
{ before(grammarAccess.getBooleanLiteralRule()); }
	 ruleBooleanLiteral
{ after(grammarAccess.getBooleanLiteralRule()); } 
	 EOF 
;

// Rule BooleanLiteral
ruleBooleanLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBooleanLiteralAccess().getGroup()); }
		(rule__BooleanLiteral__Group__0)
		{ after(grammarAccess.getBooleanLiteralAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleListLiteral
entryRuleListLiteral
:
{ before(grammarAccess.getListLiteralRule()); }
	 ruleListLiteral
{ after(grammarAccess.getListLiteralRule()); } 
	 EOF 
;

// Rule ListLiteral
ruleListLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getListLiteralAccess().getGroup()); }
		(rule__ListLiteral__Group__0)
		{ after(grammarAccess.getListLiteralAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEnumerationList
entryRuleEnumerationList
:
{ before(grammarAccess.getEnumerationListRule()); }
	 ruleEnumerationList
{ after(grammarAccess.getEnumerationListRule()); } 
	 EOF 
;

// Rule EnumerationList
ruleEnumerationList 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEnumerationListAccess().getGroup()); }
		(rule__EnumerationList__Group__0)
		{ after(grammarAccess.getEnumerationListAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSetLiteral
entryRuleSetLiteral
:
{ before(grammarAccess.getSetLiteralRule()); }
	 ruleSetLiteral
{ after(grammarAccess.getSetLiteralRule()); } 
	 EOF 
;

// Rule SetLiteral
ruleSetLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSetLiteralAccess().getGroup()); }
		(rule__SetLiteral__Group__0)
		{ after(grammarAccess.getSetLiteralAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDirectionalLiteral
entryRuleDirectionalLiteral
:
{ before(grammarAccess.getDirectionalLiteralRule()); }
	 ruleDirectionalLiteral
{ after(grammarAccess.getDirectionalLiteralRule()); } 
	 EOF 
;

// Rule DirectionalLiteral
ruleDirectionalLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDirectionalLiteralAccess().getGroup()); }
		(rule__DirectionalLiteral__Group__0)
		{ after(grammarAccess.getDirectionalLiteralAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMultiLiteralOperation
entryRuleMultiLiteralOperation
:
{ before(grammarAccess.getMultiLiteralOperationRule()); }
	 ruleMultiLiteralOperation
{ after(grammarAccess.getMultiLiteralOperationRule()); } 
	 EOF 
;

// Rule MultiLiteralOperation
ruleMultiLiteralOperation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMultiLiteralOperationAccess().getGroup()); }
		(rule__MultiLiteralOperation__Group__0)
		{ after(grammarAccess.getMultiLiteralOperationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQualifiedNameWithWildcard
entryRuleQualifiedNameWithWildcard
:
{ before(grammarAccess.getQualifiedNameWithWildcardRule()); }
	 ruleQualifiedNameWithWildcard
{ after(grammarAccess.getQualifiedNameWithWildcardRule()); } 
	 EOF 
;

// Rule QualifiedNameWithWildcard
ruleQualifiedNameWithWildcard 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); }
		(rule__QualifiedNameWithWildcard__Group__0)
		{ after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDottedName
entryRuleDottedName
:
{ before(grammarAccess.getDottedNameRule()); }
	 ruleDottedName
{ after(grammarAccess.getDottedNameRule()); } 
	 EOF 
;

// Rule DottedName
ruleDottedName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDottedNameAccess().getGroup()); }
		(rule__DottedName__Group__0)
		{ after(grammarAccess.getDottedNameAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName
:
{ before(grammarAccess.getQualifiedNameRule()); }
	 ruleQualifiedName
{ after(grammarAccess.getQualifiedNameRule()); } 
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQualifiedNameAccess().getGroup()); }
		(rule__QualifiedName__Group__0)
		{ after(grammarAccess.getQualifiedNameAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQualifiedTypesReference
entryRuleQualifiedTypesReference
:
{ before(grammarAccess.getQualifiedTypesReferenceRule()); }
	 ruleQualifiedTypesReference
{ after(grammarAccess.getQualifiedTypesReferenceRule()); } 
	 EOF 
;

// Rule QualifiedTypesReference
ruleQualifiedTypesReference 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQualifiedTypesReferenceAccess().getGroup()); }
		(rule__QualifiedTypesReference__Group__0)
		{ after(grammarAccess.getQualifiedTypesReferenceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQualifiedReference
entryRuleQualifiedReference
:
{ before(grammarAccess.getQualifiedReferenceRule()); }
	 ruleQualifiedReference
{ after(grammarAccess.getQualifiedReferenceRule()); } 
	 EOF 
;

// Rule QualifiedReference
ruleQualifiedReference 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQualifiedReferenceAccess().getQualifiedNameParserRuleCall()); }
		ruleQualifiedName
		{ after(grammarAccess.getQualifiedReferenceAccess().getQualifiedNameParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQualifiedDottedReference
entryRuleQualifiedDottedReference
:
{ before(grammarAccess.getQualifiedDottedReferenceRule()); }
	 ruleQualifiedDottedReference
{ after(grammarAccess.getQualifiedDottedReferenceRule()); } 
	 EOF 
;

// Rule QualifiedDottedReference
ruleQualifiedDottedReference 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQualifiedDottedReferenceAccess().getGroup()); }
		(rule__QualifiedDottedReference__Group__0)
		{ after(grammarAccess.getQualifiedDottedReferenceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComponentCategory
entryRuleComponentCategory
:
{ before(grammarAccess.getComponentCategoryRule()); }
	 ruleComponentCategory
{ after(grammarAccess.getComponentCategoryRule()); } 
	 EOF 
;

// Rule ComponentCategory
ruleComponentCategory 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComponentCategoryAccess().getAlternatives()); }
		(rule__ComponentCategory__Alternatives)
		{ after(grammarAccess.getComponentCategoryAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFeatureCategory
entryRuleFeatureCategory
:
{ before(grammarAccess.getFeatureCategoryRule()); }
	 ruleFeatureCategory
{ after(grammarAccess.getFeatureCategoryRule()); } 
	 EOF 
;

// Rule FeatureCategory
ruleFeatureCategory 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFeatureCategoryAccess().getAlternatives()); }
		(rule__FeatureCategory__Alternatives)
		{ after(grammarAccess.getFeatureCategoryAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIsFlowCategory
entryRuleIsFlowCategory
:
{ before(grammarAccess.getIsFlowCategoryRule()); }
	 ruleIsFlowCategory
{ after(grammarAccess.getIsFlowCategoryRule()); } 
	 EOF 
;

// Rule IsFlowCategory
ruleIsFlowCategory 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIsFlowCategoryAccess().getFlowKeyword()); }
		'flow'
		{ after(grammarAccess.getIsFlowCategoryAccess().getFlowKeyword()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIsBehaviorCategory
entryRuleIsBehaviorCategory
:
{ before(grammarAccess.getIsBehaviorCategoryRule()); }
	 ruleIsBehaviorCategory
{ after(grammarAccess.getIsBehaviorCategoryRule()); } 
	 EOF 
;

// Rule IsBehaviorCategory
ruleIsBehaviorCategory 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIsBehaviorCategoryAccess().getBehaviorKeyword()); }
		'behavior'
		{ after(grammarAccess.getIsBehaviorCategoryAccess().getBehaviorKeyword()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFeatureDirection
entryRuleFeatureDirection
:
{ before(grammarAccess.getFeatureDirectionRule()); }
	 ruleFeatureDirection
{ after(grammarAccess.getFeatureDirectionRule()); } 
	 EOF 
;

// Rule FeatureDirection
ruleFeatureDirection 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFeatureDirectionAccess().getAlternatives()); }
		(rule__FeatureDirection__Alternatives)
		{ after(grammarAccess.getFeatureDirectionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePropagationDirection
entryRulePropagationDirection
:
{ before(grammarAccess.getPropagationDirectionRule()); }
	 rulePropagationDirection
{ after(grammarAccess.getPropagationDirectionRule()); } 
	 EOF 
;

// Rule PropagationDirection
rulePropagationDirection 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPropagationDirectionAccess().getAlternatives()); }
		(rule__PropagationDirection__Alternatives)
		{ after(grammarAccess.getPropagationDirectionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComposite
entryRuleComposite
:
{ before(grammarAccess.getCompositeRule()); }
	 ruleComposite
{ after(grammarAccess.getCompositeRule()); } 
	 EOF 
;

// Rule Composite
ruleComposite 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCompositeAccess().getAlternatives()); }
		(rule__Composite__Alternatives)
		{ after(grammarAccess.getCompositeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePrimitive
entryRulePrimitive
:
{ before(grammarAccess.getPrimitiveRule()); }
	 rulePrimitive
{ after(grammarAccess.getPrimitiveRule()); } 
	 EOF 
;

// Rule Primitive
rulePrimitive 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPrimitiveAccess().getAlternatives()); }
		(rule__Primitive__Alternatives)
		{ after(grammarAccess.getPrimitiveAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEOperation
entryRuleEOperation
:
{ before(grammarAccess.getEOperationRule()); }
	 ruleEOperation
{ after(grammarAccess.getEOperationRule()); } 
	 EOF 
;

// Rule EOperation
ruleEOperation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEOperationAccess().getAlternatives()); }
		(rule__EOperation__Alternatives)
		{ after(grammarAccess.getEOperationAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSatisfiesOperation
entryRuleSatisfiesOperation
:
{ before(grammarAccess.getSatisfiesOperationRule()); }
	 ruleSatisfiesOperation
{ after(grammarAccess.getSatisfiesOperationRule()); } 
	 EOF 
;

// Rule SatisfiesOperation
ruleSatisfiesOperation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSatisfiesOperationAccess().getSatisfiesKeyword()); }
		'satisfies'
		{ after(grammarAccess.getSatisfiesOperationAccess().getSatisfiesKeyword()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEqualsOperation
entryRuleEqualsOperation
:
{ before(grammarAccess.getEqualsOperationRule()); }
	 ruleEqualsOperation
{ after(grammarAccess.getEqualsOperationRule()); } 
	 EOF 
;

// Rule EqualsOperation
ruleEqualsOperation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEqualsOperationAccess().getEqualsSignKeyword()); }
		'='
		{ after(grammarAccess.getEqualsOperationAccess().getEqualsSignKeyword()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInOperation
entryRuleInOperation
:
{ before(grammarAccess.getInOperationRule()); }
	 ruleInOperation
{ after(grammarAccess.getInOperationRule()); } 
	 EOF 
;

// Rule InOperation
ruleInOperation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInOperationAccess().getInKeyword()); }
		'in'
		{ after(grammarAccess.getInOperationAccess().getInKeyword()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInputOperation
entryRuleInputOperation
:
{ before(grammarAccess.getInputOperationRule()); }
	 ruleInputOperation
{ after(grammarAccess.getInputOperationRule()); } 
	 EOF 
;

// Rule InputOperation
ruleInputOperation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInputOperationAccess().getQuestionMarkKeyword()); }
		'?'
		{ after(grammarAccess.getInputOperationAccess().getQuestionMarkKeyword()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOutputOperation
entryRuleOutputOperation
:
{ before(grammarAccess.getOutputOperationRule()); }
	 ruleOutputOperation
{ after(grammarAccess.getOutputOperationRule()); } 
	 EOF 
;

// Rule OutputOperation
ruleOutputOperation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOutputOperationAccess().getExclamationMarkKeyword()); }
		'!'
		{ after(grammarAccess.getOutputOperationAccess().getExclamationMarkKeyword()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAssociationType
entryRuleAssociationType
:
{ before(grammarAccess.getAssociationTypeRule()); }
	 ruleAssociationType
{ after(grammarAccess.getAssociationTypeRule()); } 
	 EOF 
;

// Rule AssociationType
ruleAssociationType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAssociationTypeAccess().getAlternatives()); }
		(rule__AssociationType__Alternatives)
		{ after(grammarAccess.getAssociationTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIsConnection
entryRuleIsConnection
:
{ before(grammarAccess.getIsConnectionRule()); }
	 ruleIsConnection
{ after(grammarAccess.getIsConnectionRule()); } 
	 EOF 
;

// Rule IsConnection
ruleIsConnection 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIsConnectionAccess().getConnectionKeyword()); }
		'connection'
		{ after(grammarAccess.getIsConnectionAccess().getConnectionKeyword()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIsBinding
entryRuleIsBinding
:
{ before(grammarAccess.getIsBindingRule()); }
	 ruleIsBinding
{ after(grammarAccess.getIsBindingRule()); } 
	 EOF 
;

// Rule IsBinding
ruleIsBinding 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIsBindingAccess().getBindingKeyword()); }
		'binding'
		{ after(grammarAccess.getIsBindingAccess().getBindingKeyword()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIsFlow
entryRuleIsFlow
:
{ before(grammarAccess.getIsFlowRule()); }
	 ruleIsFlow
{ after(grammarAccess.getIsFlowRule()); } 
	 EOF 
;

// Rule IsFlow
ruleIsFlow 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIsFlowAccess().getFlowKeyword()); }
		'flow'
		{ after(grammarAccess.getIsFlowAccess().getFlowKeyword()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVirtualProcessorKeywords
entryRuleVirtualProcessorKeywords
:
{ before(grammarAccess.getVirtualProcessorKeywordsRule()); }
	 ruleVirtualProcessorKeywords
{ after(grammarAccess.getVirtualProcessorKeywordsRule()); } 
	 EOF 
;

// Rule VirtualProcessorKeywords
ruleVirtualProcessorKeywords 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVirtualProcessorKeywordsAccess().getGroup()); }
		(rule__VirtualProcessorKeywords__Group__0)
		{ after(grammarAccess.getVirtualProcessorKeywordsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVirtualBusKeywords
entryRuleVirtualBusKeywords
:
{ before(grammarAccess.getVirtualBusKeywordsRule()); }
	 ruleVirtualBusKeywords
{ after(grammarAccess.getVirtualBusKeywordsRule()); } 
	 EOF 
;

// Rule VirtualBusKeywords
ruleVirtualBusKeywords 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVirtualBusKeywordsAccess().getGroup()); }
		(rule__VirtualBusKeywords__Group__0)
		{ after(grammarAccess.getVirtualBusKeywordsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVirtualMemoryKeywords
entryRuleVirtualMemoryKeywords
:
{ before(grammarAccess.getVirtualMemoryKeywordsRule()); }
	 ruleVirtualMemoryKeywords
{ after(grammarAccess.getVirtualMemoryKeywordsRule()); } 
	 EOF 
;

// Rule VirtualMemoryKeywords
ruleVirtualMemoryKeywords 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVirtualMemoryKeywordsAccess().getGroup()); }
		(rule__VirtualMemoryKeywords__Group__0)
		{ after(grammarAccess.getVirtualMemoryKeywordsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVirtualDeviceKeywords
entryRuleVirtualDeviceKeywords
:
{ before(grammarAccess.getVirtualDeviceKeywordsRule()); }
	 ruleVirtualDeviceKeywords
{ after(grammarAccess.getVirtualDeviceKeywordsRule()); } 
	 EOF 
;

// Rule VirtualDeviceKeywords
ruleVirtualDeviceKeywords 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVirtualDeviceKeywordsAccess().getGroup()); }
		(rule__VirtualDeviceKeywords__Group__0)
		{ after(grammarAccess.getVirtualDeviceKeywordsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleThreadGroupKeywords
entryRuleThreadGroupKeywords
:
{ before(grammarAccess.getThreadGroupKeywordsRule()); }
	 ruleThreadGroupKeywords
{ after(grammarAccess.getThreadGroupKeywordsRule()); } 
	 EOF 
;

// Rule ThreadGroupKeywords
ruleThreadGroupKeywords 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getThreadGroupKeywordsAccess().getGroup()); }
		(rule__ThreadGroupKeywords__Group__0)
		{ after(grammarAccess.getThreadGroupKeywordsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSubprogramGroupKeywords
entryRuleSubprogramGroupKeywords
:
{ before(grammarAccess.getSubprogramGroupKeywordsRule()); }
	 ruleSubprogramGroupKeywords
{ after(grammarAccess.getSubprogramGroupKeywordsRule()); } 
	 EOF 
;

// Rule SubprogramGroupKeywords
ruleSubprogramGroupKeywords 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSubprogramGroupKeywordsAccess().getGroup()); }
		(rule__SubprogramGroupKeywords__Group__0)
		{ after(grammarAccess.getSubprogramGroupKeywordsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEndToEndFLowKeywords
entryRuleEndToEndFLowKeywords
:
{ before(grammarAccess.getEndToEndFLowKeywordsRule()); }
	 ruleEndToEndFLowKeywords
{ after(grammarAccess.getEndToEndFLowKeywordsRule()); } 
	 EOF 
;

// Rule EndToEndFLowKeywords
ruleEndToEndFLowKeywords 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEndToEndFLowKeywordsAccess().getGroup()); }
		(rule__EndToEndFLowKeywords__Group__0)
		{ after(grammarAccess.getEndToEndFLowKeywordsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInOutKeywords
entryRuleInOutKeywords
:
{ before(grammarAccess.getInOutKeywordsRule()); }
	 ruleInOutKeywords
{ after(grammarAccess.getInOutKeywordsRule()); } 
	 EOF 
;

// Rule InOutKeywords
ruleInOutKeywords 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInOutKeywordsAccess().getGroup()); }
		(rule__InOutKeywords__Group__0)
		{ after(grammarAccess.getInOutKeywordsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBusAccessKeywords
entryRuleBusAccessKeywords
:
{ before(grammarAccess.getBusAccessKeywordsRule()); }
	 ruleBusAccessKeywords
{ after(grammarAccess.getBusAccessKeywordsRule()); } 
	 EOF 
;

// Rule BusAccessKeywords
ruleBusAccessKeywords 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBusAccessKeywordsAccess().getGroup()); }
		(rule__BusAccessKeywords__Group__0)
		{ after(grammarAccess.getBusAccessKeywordsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVirtualBusAccessKeywords
entryRuleVirtualBusAccessKeywords
:
{ before(grammarAccess.getVirtualBusAccessKeywordsRule()); }
	 ruleVirtualBusAccessKeywords
{ after(grammarAccess.getVirtualBusAccessKeywordsRule()); } 
	 EOF 
;

// Rule VirtualBusAccessKeywords
ruleVirtualBusAccessKeywords 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVirtualBusAccessKeywordsAccess().getGroup()); }
		(rule__VirtualBusAccessKeywords__Group__0)
		{ after(grammarAccess.getVirtualBusAccessKeywordsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDataAccessKeywords
entryRuleDataAccessKeywords
:
{ before(grammarAccess.getDataAccessKeywordsRule()); }
	 ruleDataAccessKeywords
{ after(grammarAccess.getDataAccessKeywordsRule()); } 
	 EOF 
;

// Rule DataAccessKeywords
ruleDataAccessKeywords 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDataAccessKeywordsAccess().getGroup()); }
		(rule__DataAccessKeywords__Group__0)
		{ after(grammarAccess.getDataAccessKeywordsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSubprogramAccessKeywords
entryRuleSubprogramAccessKeywords
:
{ before(grammarAccess.getSubprogramAccessKeywordsRule()); }
	 ruleSubprogramAccessKeywords
{ after(grammarAccess.getSubprogramAccessKeywordsRule()); } 
	 EOF 
;

// Rule SubprogramAccessKeywords
ruleSubprogramAccessKeywords 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSubprogramAccessKeywordsAccess().getGroup()); }
		(rule__SubprogramAccessKeywords__Group__0)
		{ after(grammarAccess.getSubprogramAccessKeywordsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSubprogramGroupAccessKeywords
entryRuleSubprogramGroupAccessKeywords
:
{ before(grammarAccess.getSubprogramGroupAccessKeywordsRule()); }
	 ruleSubprogramGroupAccessKeywords
{ after(grammarAccess.getSubprogramGroupAccessKeywordsRule()); } 
	 EOF 
;

// Rule SubprogramGroupAccessKeywords
ruleSubprogramGroupAccessKeywords 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSubprogramGroupAccessKeywordsAccess().getGroup()); }
		(rule__SubprogramGroupAccessKeywords__Group__0)
		{ after(grammarAccess.getSubprogramGroupAccessKeywordsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleProvidesReadKeywords
entryRuleProvidesReadKeywords
:
{ before(grammarAccess.getProvidesReadKeywordsRule()); }
	 ruleProvidesReadKeywords
{ after(grammarAccess.getProvidesReadKeywordsRule()); } 
	 EOF 
;

// Rule ProvidesReadKeywords
ruleProvidesReadKeywords 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getProvidesReadKeywordsAccess().getGroup()); }
		(rule__ProvidesReadKeywords__Group__0)
		{ after(grammarAccess.getProvidesReadKeywordsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRequiresReadKeywords
entryRuleRequiresReadKeywords
:
{ before(grammarAccess.getRequiresReadKeywordsRule()); }
	 ruleRequiresReadKeywords
{ after(grammarAccess.getRequiresReadKeywordsRule()); } 
	 EOF 
;

// Rule RequiresReadKeywords
ruleRequiresReadKeywords 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRequiresReadKeywordsAccess().getGroup()); }
		(rule__RequiresReadKeywords__Group__0)
		{ after(grammarAccess.getRequiresReadKeywordsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleProvidesWriteKeywords
entryRuleProvidesWriteKeywords
:
{ before(grammarAccess.getProvidesWriteKeywordsRule()); }
	 ruleProvidesWriteKeywords
{ after(grammarAccess.getProvidesWriteKeywordsRule()); } 
	 EOF 
;

// Rule ProvidesWriteKeywords
ruleProvidesWriteKeywords 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getProvidesWriteKeywordsAccess().getGroup()); }
		(rule__ProvidesWriteKeywords__Group__0)
		{ after(grammarAccess.getProvidesWriteKeywordsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRequiresWriteKeywords
entryRuleRequiresWriteKeywords
:
{ before(grammarAccess.getRequiresWriteKeywordsRule()); }
	 ruleRequiresWriteKeywords
{ after(grammarAccess.getRequiresWriteKeywordsRule()); } 
	 EOF 
;

// Rule RequiresWriteKeywords
ruleRequiresWriteKeywords 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRequiresWriteKeywordsAccess().getGroup()); }
		(rule__RequiresWriteKeywords__Group__0)
		{ after(grammarAccess.getRequiresWriteKeywordsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleProvidesRWKeywords
entryRuleProvidesRWKeywords
:
{ before(grammarAccess.getProvidesRWKeywordsRule()); }
	 ruleProvidesRWKeywords
{ after(grammarAccess.getProvidesRWKeywordsRule()); } 
	 EOF 
;

// Rule ProvidesRWKeywords
ruleProvidesRWKeywords 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getProvidesRWKeywordsAccess().getGroup()); }
		(rule__ProvidesRWKeywords__Group__0)
		{ after(grammarAccess.getProvidesRWKeywordsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRequiresRWKeywords
entryRuleRequiresRWKeywords
:
{ before(grammarAccess.getRequiresRWKeywordsRule()); }
	 ruleRequiresRWKeywords
{ after(grammarAccess.getRequiresRWKeywordsRule()); } 
	 EOF 
;

// Rule RequiresRWKeywords
ruleRequiresRWKeywords 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRequiresRWKeywordsAccess().getGroup()); }
		(rule__RequiresRWKeywords__Group__0)
		{ after(grammarAccess.getRequiresRWKeywordsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDeclaration__Alternatives_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_5_0()); }
		(rule__PackageDeclaration__ElementsAssignment_5_0)
		{ after(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_5_0()); }
	)
	|
	(
		{ before(grammarAccess.getPackageDeclarationAccess().getAlternatives_5_1()); }
		(rule__PackageDeclaration__Alternatives_5_1)*
		{ after(grammarAccess.getPackageDeclarationAccess().getAlternatives_5_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDeclaration__Alternatives_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPackageDeclarationAccess().getImportsAssignment_5_1_0()); }
		(rule__PackageDeclaration__ImportsAssignment_5_1_0)
		{ after(grammarAccess.getPackageDeclarationAccess().getImportsAssignment_5_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_5_1_1()); }
		(rule__PackageDeclaration__ElementsAssignment_5_1_1)
		{ after(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_5_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageElement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPackageElementAccess().getPackageDeclarationParserRuleCall_0()); }
		rulePackageDeclaration
		{ after(grammarAccess.getPackageElementAccess().getPackageDeclarationParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getPackageElementAccess().getComponentInterfaceParserRuleCall_1()); }
		ruleComponentInterface
		{ after(grammarAccess.getPackageElementAccess().getComponentInterfaceParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getPackageElementAccess().getComponentImplementationParserRuleCall_2()); }
		ruleComponentImplementation
		{ after(grammarAccess.getPackageElementAccess().getComponentImplementationParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getPackageElementAccess().getComponentConfigurationParserRuleCall_3()); }
		ruleComponentConfiguration
		{ after(grammarAccess.getPackageElementAccess().getComponentConfigurationParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getPackageElementAccess().getPropertyDefinitionParserRuleCall_4()); }
		rulePropertyDefinition
		{ after(grammarAccess.getPackageElementAccess().getPropertyDefinitionParserRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getPackageElementAccess().getPropertySetParserRuleCall_5()); }
		rulePropertySet
		{ after(grammarAccess.getPackageElementAccess().getPropertySetParserRuleCall_5()); }
	)
	|
	(
		{ before(grammarAccess.getPackageElementAccess().getWorkingsetParserRuleCall_6()); }
		ruleWorkingset
		{ after(grammarAccess.getPackageElementAccess().getWorkingsetParserRuleCall_6()); }
	)
	|
	(
		{ before(grammarAccess.getPackageElementAccess().getTypeDefParserRuleCall_7()); }
		ruleTypeDef
		{ after(grammarAccess.getPackageElementAccess().getTypeDefParserRuleCall_7()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Alternatives_6_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyDefinitionAccess().getForAllAssignment_6_2_0()); }
		(rule__PropertyDefinition__ForAllAssignment_6_2_0)
		{ after(grammarAccess.getPropertyDefinitionAccess().getForAllAssignment_6_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyDefinitionAccess().getGroup_6_2_1()); }
		(rule__PropertyDefinition__Group_6_2_1__0)
		{ after(grammarAccess.getPropertyDefinitionAccess().getGroup_6_2_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AppliesTo__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAppliesToAccess().getComponentCategoriesAssignment_0()); }
		(rule__AppliesTo__ComponentCategoriesAssignment_0)
		{ after(grammarAccess.getAppliesToAccess().getComponentCategoriesAssignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getAppliesToAccess().getFeatureCategoriesAssignment_1()); }
		(rule__AppliesTo__FeatureCategoriesAssignment_1)
		{ after(grammarAccess.getAppliesToAccess().getFeatureCategoriesAssignment_1()); }
	)
	|
	(
		{ before(grammarAccess.getAppliesToAccess().getAssociationTypesAssignment_2()); }
		(rule__AppliesTo__AssociationTypesAssignment_2)
		{ after(grammarAccess.getAppliesToAccess().getAssociationTypesAssignment_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyAssociationType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyAssociationTypeAccess().getEqualsSignGreaterThanSignKeyword_0()); }
		'=>'
		{ after(grammarAccess.getPropertyAssociationTypeAccess().getEqualsSignGreaterThanSignKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyAssociationTypeAccess().getEqualsSignKeyword_1()); }
		'='
		{ after(grammarAccess.getPropertyAssociationTypeAccess().getEqualsSignKeyword_1()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyAssociationTypeAccess().getAsteriskEqualsSignGreaterThanSignKeyword_2()); }
		'*=>'
		{ after(grammarAccess.getPropertyAssociationTypeAccess().getAsteriskEqualsSignGreaterThanSignKeyword_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InterfaceElement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInterfaceElementAccess().getElementsAssignment_0()); }
		(rule__InterfaceElement__ElementsAssignment_0)
		{ after(grammarAccess.getInterfaceElementAccess().getElementsAssignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getInterfaceElementAccess().getOwnedPropertyAssociationsAssignment_1()); }
		(rule__InterfaceElement__OwnedPropertyAssociationsAssignment_1)
		{ after(grammarAccess.getInterfaceElementAccess().getOwnedPropertyAssociationsAssignment_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InterfaceElement__ElementsAlternatives_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInterfaceElementAccess().getElementsFeatureParserRuleCall_0_0_0()); }
		ruleFeature
		{ after(grammarAccess.getInterfaceElementAccess().getElementsFeatureParserRuleCall_0_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getInterfaceElementAccess().getElementsStateVariableParserRuleCall_0_0_1()); }
		ruleStateVariable
		{ after(grammarAccess.getInterfaceElementAccess().getElementsStateVariableParserRuleCall_0_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getInterfaceElementAccess().getElementsStateTransitionParserRuleCall_0_0_2()); }
		ruleStateTransition
		{ after(grammarAccess.getInterfaceElementAccess().getElementsStateTransitionParserRuleCall_0_0_2()); }
	)
	|
	(
		{ before(grammarAccess.getInterfaceElementAccess().getElementsBehaviorParserRuleCall_0_0_3()); }
		ruleBehavior
		{ after(grammarAccess.getInterfaceElementAccess().getElementsBehaviorParserRuleCall_0_0_3()); }
	)
	|
	(
		{ before(grammarAccess.getInterfaceElementAccess().getElementsGeneratorParserRuleCall_0_0_4()); }
		ruleGenerator
		{ after(grammarAccess.getInterfaceElementAccess().getElementsGeneratorParserRuleCall_0_0_4()); }
	)
	|
	(
		{ before(grammarAccess.getInterfaceElementAccess().getElementsBehaviorAnnotationBlockParserRuleCall_0_0_5()); }
		ruleBehaviorAnnotationBlock
		{ after(grammarAccess.getInterfaceElementAccess().getElementsBehaviorAnnotationBlockParserRuleCall_0_0_5()); }
	)
	|
	(
		{ before(grammarAccess.getInterfaceElementAccess().getElementsAnnexSubclauseParserRuleCall_0_0_6()); }
		ruleAnnexSubclause
		{ after(grammarAccess.getInterfaceElementAccess().getElementsAnnexSubclauseParserRuleCall_0_0_6()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplementationElement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImplementationElementAccess().getElementsAssignment_0()); }
		(rule__ImplementationElement__ElementsAssignment_0)
		{ after(grammarAccess.getImplementationElementAccess().getElementsAssignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getImplementationElementAccess().getFlowAssignmentsAssignment_1()); }
		(rule__ImplementationElement__FlowAssignmentsAssignment_1)
		{ after(grammarAccess.getImplementationElementAccess().getFlowAssignmentsAssignment_1()); }
	)
	|
	(
		{ before(grammarAccess.getImplementationElementAccess().getClassifierAssignmentsAssignment_2()); }
		(rule__ImplementationElement__ClassifierAssignmentsAssignment_2)
		{ after(grammarAccess.getImplementationElementAccess().getClassifierAssignmentsAssignment_2()); }
	)
	|
	(
		{ before(grammarAccess.getImplementationElementAccess().getClassifierAssignmentsAssignment_3()); }
		(rule__ImplementationElement__ClassifierAssignmentsAssignment_3)
		{ after(grammarAccess.getImplementationElementAccess().getClassifierAssignmentsAssignment_3()); }
	)
	|
	(
		{ before(grammarAccess.getImplementationElementAccess().getOwnedPropertyAssociationsAssignment_4()); }
		(rule__ImplementationElement__OwnedPropertyAssociationsAssignment_4)
		{ after(grammarAccess.getImplementationElementAccess().getOwnedPropertyAssociationsAssignment_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplementationElement__ElementsAlternatives_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImplementationElementAccess().getElementsConnectionParserRuleCall_0_0_0()); }
		ruleConnection
		{ after(grammarAccess.getImplementationElementAccess().getElementsConnectionParserRuleCall_0_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getImplementationElementAccess().getElementsBindingParserRuleCall_0_0_1()); }
		ruleBinding
		{ after(grammarAccess.getImplementationElementAccess().getElementsBindingParserRuleCall_0_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getImplementationElementAccess().getElementsSubcomponentParserRuleCall_0_0_2()); }
		ruleSubcomponent
		{ after(grammarAccess.getImplementationElementAccess().getElementsSubcomponentParserRuleCall_0_0_2()); }
	)
	|
	(
		{ before(grammarAccess.getImplementationElementAccess().getElementsEndToEndFlowParserRuleCall_0_0_3()); }
		ruleEndToEndFlow
		{ after(grammarAccess.getImplementationElementAccess().getElementsEndToEndFlowParserRuleCall_0_0_3()); }
	)
	|
	(
		{ before(grammarAccess.getImplementationElementAccess().getElementsBehaviorAnnotationBlockParserRuleCall_0_0_4()); }
		ruleBehaviorAnnotationBlock
		{ after(grammarAccess.getImplementationElementAccess().getElementsBehaviorAnnotationBlockParserRuleCall_0_0_4()); }
	)
	|
	(
		{ before(grammarAccess.getImplementationElementAccess().getElementsStateVariableParserRuleCall_0_0_5()); }
		ruleStateVariable
		{ after(grammarAccess.getImplementationElementAccess().getElementsStateVariableParserRuleCall_0_0_5()); }
	)
	|
	(
		{ before(grammarAccess.getImplementationElementAccess().getElementsStateTransitionParserRuleCall_0_0_6()); }
		ruleStateTransition
		{ after(grammarAccess.getImplementationElementAccess().getElementsStateTransitionParserRuleCall_0_0_6()); }
	)
	|
	(
		{ before(grammarAccess.getImplementationElementAccess().getElementsStateSynchronizationParserRuleCall_0_0_7()); }
		ruleStateSynchronization
		{ after(grammarAccess.getImplementationElementAccess().getElementsStateSynchronizationParserRuleCall_0_0_7()); }
	)
	|
	(
		{ before(grammarAccess.getImplementationElementAccess().getElementsBehaviorParserRuleCall_0_0_8()); }
		ruleBehavior
		{ after(grammarAccess.getImplementationElementAccess().getElementsBehaviorParserRuleCall_0_0_8()); }
	)
	|
	(
		{ before(grammarAccess.getImplementationElementAccess().getElementsGeneratorParserRuleCall_0_0_9()); }
		ruleGenerator
		{ after(grammarAccess.getImplementationElementAccess().getElementsGeneratorParserRuleCall_0_0_9()); }
	)
	|
	(
		{ before(grammarAccess.getImplementationElementAccess().getElementsAnnexSubclauseParserRuleCall_0_0_10()); }
		ruleAnnexSubclause
		{ after(grammarAccess.getImplementationElementAccess().getElementsAnnexSubclauseParserRuleCall_0_0_10()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Subcomponent__Alternatives_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubcomponentAccess().getGroup_5_0()); }
		(rule__Subcomponent__Group_5_0__0)
		{ after(grammarAccess.getSubcomponentAccess().getGroup_5_0()); }
	)
	|
	(
		{ before(grammarAccess.getSubcomponentAccess().getGroup_5_1()); }
		(rule__Subcomponent__Group_5_1__0)
		{ after(grammarAccess.getSubcomponentAccess().getGroup_5_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Alternatives_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConnectionAccess().getHyphenMinusGreaterThanSignKeyword_4_0()); }
		'->'
		{ after(grammarAccess.getConnectionAccess().getHyphenMinusGreaterThanSignKeyword_4_0()); }
	)
	|
	(
		{ before(grammarAccess.getConnectionAccess().getBidirectionalAssignment_4_1()); }
		(rule__Connection__BidirectionalAssignment_4_1)
		{ after(grammarAccess.getConnectionAccess().getBidirectionalAssignment_4_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InStates__InStatesAlternatives_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInStatesAccess().getInStatesModelElementContainsEnumerationLiteralParserRuleCall_1_0_0()); }
		ruleModelElementContainsEnumerationLiteral
		{ after(grammarAccess.getInStatesAccess().getInStatesModelElementContainsEnumerationLiteralParserRuleCall_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getInStatesAccess().getInStatesModelElementEqualsEnumerationLiteralParserRuleCall_1_0_1()); }
		ruleModelElementEqualsEnumerationLiteral
		{ after(grammarAccess.getInStatesAccess().getInStatesModelElementEqualsEnumerationLiteralParserRuleCall_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1_0()); }
		(rule__Import__ImportedNamespaceAssignment_1_0)
		{ after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1_1()); }
		(rule__Import__ImportedNamespaceAssignment_1_1)
		{ after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierAssignment__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClassifierAssignmentAccess().getGroup_2_0()); }
		(rule__ClassifierAssignment__Group_2_0__0)
		{ after(grammarAccess.getClassifierAssignmentAccess().getGroup_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getClassifierAssignmentAccess().getCurlyConfigurationElementBlockParserRuleCall_2_1()); }
		ruleCurlyConfigurationElementBlock
		{ after(grammarAccess.getClassifierAssignmentAccess().getCurlyConfigurationElementBlockParserRuleCall_2_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierAssignmentPattern__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClassifierAssignmentPatternAccess().getGroup_2_0()); }
		(rule__ClassifierAssignmentPattern__Group_2_0__0)
		{ after(grammarAccess.getClassifierAssignmentPatternAccess().getGroup_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getClassifierAssignmentPatternAccess().getCurlyConfigurationElementBlockParserRuleCall_2_1()); }
		ruleCurlyConfigurationElementBlock
		{ after(grammarAccess.getClassifierAssignmentPatternAccess().getCurlyConfigurationElementBlockParserRuleCall_2_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationElement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigurationElementAccess().getOwnedPropertyAssociationsAssignment_0()); }
		(rule__ConfigurationElement__OwnedPropertyAssociationsAssignment_0)
		{ after(grammarAccess.getConfigurationElementAccess().getOwnedPropertyAssociationsAssignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getConfigurationElementAccess().getElementsAssignment_1()); }
		(rule__ConfigurationElement__ElementsAssignment_1)
		{ after(grammarAccess.getConfigurationElementAccess().getElementsAssignment_1()); }
	)
	|
	(
		{ before(grammarAccess.getConfigurationElementAccess().getElementsAssignment_2()); }
		(rule__ConfigurationElement__ElementsAssignment_2)
		{ after(grammarAccess.getConfigurationElementAccess().getElementsAssignment_2()); }
	)
	|
	(
		{ before(grammarAccess.getConfigurationElementAccess().getClassifierAssignmentsAssignment_3()); }
		(rule__ConfigurationElement__ClassifierAssignmentsAssignment_3)
		{ after(grammarAccess.getConfigurationElementAccess().getClassifierAssignmentsAssignment_3()); }
	)
	|
	(
		{ before(grammarAccess.getConfigurationElementAccess().getClassifierAssignmentsAssignment_4()); }
		(rule__ConfigurationElement__ClassifierAssignmentsAssignment_4)
		{ after(grammarAccess.getConfigurationElementAccess().getClassifierAssignmentsAssignment_4()); }
	)
	|
	(
		{ before(grammarAccess.getConfigurationElementAccess().getElementsAssignment_5()); }
		(rule__ConfigurationElement__ElementsAssignment_5)
		{ after(grammarAccess.getConfigurationElementAccess().getElementsAssignment_5()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getTypeReferenceParserRuleCall_0()); }
		ruleTypeReference
		{ after(grammarAccess.getTypeAccess().getTypeReferenceParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getCompositeTypeParserRuleCall_1()); }
		ruleCompositeType
		{ after(grammarAccess.getTypeAccess().getCompositeTypeParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_2()); }
		rulePrimitiveType
		{ after(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getEnumerationTypeParserRuleCall_3()); }
		ruleEnumerationType
		{ after(grammarAccess.getTypeAccess().getEnumerationTypeParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedImplementationElement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNestedImplementationElementAccess().getFeaturesAssignment_0()); }
		(rule__NestedImplementationElement__FeaturesAssignment_0)
		{ after(grammarAccess.getNestedImplementationElementAccess().getFeaturesAssignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getNestedImplementationElementAccess().getConnectionsAssignment_1()); }
		(rule__NestedImplementationElement__ConnectionsAssignment_1)
		{ after(grammarAccess.getNestedImplementationElementAccess().getConnectionsAssignment_1()); }
	)
	|
	(
		{ before(grammarAccess.getNestedImplementationElementAccess().getBindingsAssignment_2()); }
		(rule__NestedImplementationElement__BindingsAssignment_2)
		{ after(grammarAccess.getNestedImplementationElementAccess().getBindingsAssignment_2()); }
	)
	|
	(
		{ before(grammarAccess.getNestedImplementationElementAccess().getComponentsAssignment_3()); }
		(rule__NestedImplementationElement__ComponentsAssignment_3)
		{ after(grammarAccess.getNestedImplementationElementAccess().getComponentsAssignment_3()); }
	)
	|
	(
		{ before(grammarAccess.getNestedImplementationElementAccess().getOwnedPropertyAssociationsAssignment_4()); }
		(rule__NestedImplementationElement__OwnedPropertyAssociationsAssignment_4)
		{ after(grammarAccess.getNestedImplementationElementAccess().getOwnedPropertyAssociationsAssignment_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BehaviorAnnotationElement__ElementsAlternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBehaviorAnnotationElementAccess().getElementsGeneratorParserRuleCall_0_0()); }
		ruleGenerator
		{ after(grammarAccess.getBehaviorAnnotationElementAccess().getElementsGeneratorParserRuleCall_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getBehaviorAnnotationElementAccess().getElementsStateTransitionParserRuleCall_0_1()); }
		ruleStateTransition
		{ after(grammarAccess.getBehaviorAnnotationElementAccess().getElementsStateTransitionParserRuleCall_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getBehaviorAnnotationElementAccess().getElementsStateSynchronizationParserRuleCall_0_2()); }
		ruleStateSynchronization
		{ after(grammarAccess.getBehaviorAnnotationElementAccess().getElementsStateSynchronizationParserRuleCall_0_2()); }
	)
	|
	(
		{ before(grammarAccess.getBehaviorAnnotationElementAccess().getElementsBehaviorParserRuleCall_0_3()); }
		ruleBehavior
		{ after(grammarAccess.getBehaviorAnnotationElementAccess().getElementsBehaviorParserRuleCall_0_3()); }
	)
	|
	(
		{ before(grammarAccess.getBehaviorAnnotationElementAccess().getElementsStateVariableParserRuleCall_0_4()); }
		ruleStateVariable
		{ after(grammarAccess.getBehaviorAnnotationElementAccess().getElementsStateVariableParserRuleCall_0_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateTransition__ConditionAlternatives_4_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateTransitionAccess().getConditionMultiLiteralOperationParserRuleCall_4_0_0()); }
		ruleMultiLiteralOperation
		{ after(grammarAccess.getStateTransitionAccess().getConditionMultiLiteralOperationParserRuleCall_4_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getStateTransitionAccess().getConditionModelElementContainsLiteralParserRuleCall_4_0_1()); }
		ruleModelElementContainsLiteral
		{ after(grammarAccess.getStateTransitionAccess().getConditionModelElementContainsLiteralParserRuleCall_4_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getStateTransitionAccess().getConditionModelElementReferenceParserRuleCall_4_0_2()); }
		ruleModelElementReference
		{ after(grammarAccess.getStateTransitionAccess().getConditionModelElementReferenceParserRuleCall_4_0_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateSynchronization__Alternatives_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateSynchronizationAccess().getGroup_4_0()); }
		(rule__StateSynchronization__Group_4_0__0)
		{ after(grammarAccess.getStateSynchronizationAccess().getGroup_4_0()); }
	)
	|
	(
		{ before(grammarAccess.getStateSynchronizationAccess().getGroup_4_1()); }
		(rule__StateSynchronization__Group_4_1__0)
		{ after(grammarAccess.getStateSynchronizationAccess().getGroup_4_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateSynchronization__ConditionAlternatives_4_0_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateSynchronizationAccess().getConditionMultiLiteralOperationParserRuleCall_4_0_0_0_0()); }
		ruleMultiLiteralOperation
		{ after(grammarAccess.getStateSynchronizationAccess().getConditionMultiLiteralOperationParserRuleCall_4_0_0_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getStateSynchronizationAccess().getConditionModelElementContainsEnumerationLiteralParserRuleCall_4_0_0_0_1()); }
		ruleModelElementContainsEnumerationLiteral
		{ after(grammarAccess.getStateSynchronizationAccess().getConditionModelElementContainsEnumerationLiteralParserRuleCall_4_0_0_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getStateSynchronizationAccess().getConditionModelElementEqualsEnumerationLiteralParserRuleCall_4_0_0_0_2()); }
		ruleModelElementEqualsEnumerationLiteral
		{ after(grammarAccess.getStateSynchronizationAccess().getConditionModelElementEqualsEnumerationLiteralParserRuleCall_4_0_0_0_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateSynchronization__ConditionAlternatives_4_1_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateSynchronizationAccess().getConditionMultiLiteralOperationParserRuleCall_4_1_2_0_0()); }
		ruleMultiLiteralOperation
		{ after(grammarAccess.getStateSynchronizationAccess().getConditionMultiLiteralOperationParserRuleCall_4_1_2_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getStateSynchronizationAccess().getConditionModelElementContainsEnumerationLiteralParserRuleCall_4_1_2_0_1()); }
		ruleModelElementContainsEnumerationLiteral
		{ after(grammarAccess.getStateSynchronizationAccess().getConditionModelElementContainsEnumerationLiteralParserRuleCall_4_1_2_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getStateSynchronizationAccess().getConditionModelElementEqualsEnumerationLiteralParserRuleCall_4_1_2_0_2()); }
		ruleModelElementEqualsEnumerationLiteral
		{ after(grammarAccess.getStateSynchronizationAccess().getConditionModelElementEqualsEnumerationLiteralParserRuleCall_4_1_2_0_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Behavior__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBehaviorAccess().getTokenFlowParserRuleCall_0()); }
		ruleTokenFlow
		{ after(grammarAccess.getBehaviorAccess().getTokenFlowParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getBehaviorAccess().getComputationalBehaviorParserRuleCall_1()); }
		ruleComputationalBehavior
		{ after(grammarAccess.getBehaviorAccess().getComputationalBehaviorParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenFlow__ConditionAlternatives_5_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTokenFlowAccess().getConditionMultiLiteralOperationParserRuleCall_5_0_0()); }
		ruleMultiLiteralOperation
		{ after(grammarAccess.getTokenFlowAccess().getConditionMultiLiteralOperationParserRuleCall_5_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getTokenFlowAccess().getConditionModelElementContainsLiteralParserRuleCall_5_0_1()); }
		ruleModelElementContainsLiteral
		{ after(grammarAccess.getTokenFlowAccess().getConditionModelElementContainsLiteralParserRuleCall_5_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getTokenFlowAccess().getConditionModelElementEqualsLiteralParserRuleCall_5_0_2()); }
		ruleModelElementEqualsLiteral
		{ after(grammarAccess.getTokenFlowAccess().getConditionModelElementEqualsLiteralParserRuleCall_5_0_2()); }
	)
	|
	(
		{ before(grammarAccess.getTokenFlowAccess().getConditionModelElementReferenceParserRuleCall_5_0_3()); }
		ruleModelElementReference
		{ after(grammarAccess.getTokenFlowAccess().getConditionModelElementReferenceParserRuleCall_5_0_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenFlow__Alternatives_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTokenFlowAccess().getSinkAssignment_7_0()); }
		(rule__TokenFlow__SinkAssignment_7_0)
		{ after(grammarAccess.getTokenFlowAccess().getSinkAssignment_7_0()); }
	)
	|
	(
		{ before(grammarAccess.getTokenFlowAccess().getTokenResultBlockParserRuleCall_7_1()); }
		ruleTokenResultBlock
		{ after(grammarAccess.getTokenFlowAccess().getTokenResultBlockParserRuleCall_7_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenResult__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTokenResultAccess().getTokenOutputParserRuleCall_0()); }
		ruleTokenOutput
		{ after(grammarAccess.getTokenResultAccess().getTokenOutputParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getTokenResultAccess().getDetectionEventParserRuleCall_1()); }
		ruleDetectionEvent
		{ after(grammarAccess.getTokenResultAccess().getDetectionEventParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Literal__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_0()); }
		ruleIntegerLiteral
		{ after(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getLiteralAccess().getRealLiteralParserRuleCall_1()); }
		ruleRealLiteral
		{ after(grammarAccess.getLiteralAccess().getRealLiteralParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_2()); }
		ruleStringLiteral
		{ after(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_3()); }
		ruleBooleanLiteral
		{ after(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getLiteralAccess().getPropertyReferenceParserRuleCall_4()); }
		rulePropertyReference
		{ after(grammarAccess.getLiteralAccess().getPropertyReferenceParserRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getLiteralAccess().getDirectionalLiteralParserRuleCall_5()); }
		ruleDirectionalLiteral
		{ after(grammarAccess.getLiteralAccess().getDirectionalLiteralParserRuleCall_5()); }
	)
	|
	(
		{ before(grammarAccess.getLiteralAccess().getListLiteralParserRuleCall_6()); }
		ruleListLiteral
		{ after(grammarAccess.getLiteralAccess().getListLiteralParserRuleCall_6()); }
	)
	|
	(
		{ before(grammarAccess.getLiteralAccess().getSetLiteralParserRuleCall_7()); }
		ruleSetLiteral
		{ after(grammarAccess.getLiteralAccess().getSetLiteralParserRuleCall_7()); }
	)
	|
	(
		{ before(grammarAccess.getLiteralAccess().getMultiLiteralOperationParserRuleCall_8()); }
		ruleMultiLiteralOperation
		{ after(grammarAccess.getLiteralAccess().getMultiLiteralOperationParserRuleCall_8()); }
	)
	|
	(
		{ before(grammarAccess.getLiteralAccess().getModelElementContainsLiteralParserRuleCall_9()); }
		ruleModelElementContainsLiteral
		{ after(grammarAccess.getLiteralAccess().getModelElementContainsLiteralParserRuleCall_9()); }
	)
	|
	(
		{ before(grammarAccess.getLiteralAccess().getNamedElementReferenceParserRuleCall_10()); }
		ruleNamedElementReference
		{ after(grammarAccess.getLiteralAccess().getNamedElementReferenceParserRuleCall_10()); }
	)
	|
	(
		{ before(grammarAccess.getLiteralAccess().getEnumerationLiteralParserRuleCall_11()); }
		ruleEnumerationLiteral
		{ after(grammarAccess.getLiteralAccess().getEnumerationLiteralParserRuleCall_11()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanLiteral__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBooleanLiteralAccess().getValueAssignment_1_0()); }
		(rule__BooleanLiteral__ValueAssignment_1_0)
		{ after(grammarAccess.getBooleanLiteralAccess().getValueAssignment_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_1()); }
		'false'
		{ after(grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentCategory__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentCategoryAccess().getAbstractKeyword_0()); }
		'abstract'
		{ after(grammarAccess.getComponentCategoryAccess().getAbstractKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getComponentCategoryAccess().getBusKeyword_1()); }
		'bus'
		{ after(grammarAccess.getComponentCategoryAccess().getBusKeyword_1()); }
	)
	|
	(
		{ before(grammarAccess.getComponentCategoryAccess().getDataKeyword_2()); }
		'data'
		{ after(grammarAccess.getComponentCategoryAccess().getDataKeyword_2()); }
	)
	|
	(
		{ before(grammarAccess.getComponentCategoryAccess().getDeviceKeyword_3()); }
		'device'
		{ after(grammarAccess.getComponentCategoryAccess().getDeviceKeyword_3()); }
	)
	|
	(
		{ before(grammarAccess.getComponentCategoryAccess().getMemoryKeyword_4()); }
		'memory'
		{ after(grammarAccess.getComponentCategoryAccess().getMemoryKeyword_4()); }
	)
	|
	(
		{ before(grammarAccess.getComponentCategoryAccess().getProcessKeyword_5()); }
		'process'
		{ after(grammarAccess.getComponentCategoryAccess().getProcessKeyword_5()); }
	)
	|
	(
		{ before(grammarAccess.getComponentCategoryAccess().getProcessorKeyword_6()); }
		'processor'
		{ after(grammarAccess.getComponentCategoryAccess().getProcessorKeyword_6()); }
	)
	|
	(
		{ before(grammarAccess.getComponentCategoryAccess().getSystemKeyword_7()); }
		'system'
		{ after(grammarAccess.getComponentCategoryAccess().getSystemKeyword_7()); }
	)
	|
	(
		{ before(grammarAccess.getComponentCategoryAccess().getThreadKeyword_8()); }
		'thread'
		{ after(grammarAccess.getComponentCategoryAccess().getThreadKeyword_8()); }
	)
	|
	(
		{ before(grammarAccess.getComponentCategoryAccess().getVirtualBusKeywordsParserRuleCall_9()); }
		ruleVirtualBusKeywords
		{ after(grammarAccess.getComponentCategoryAccess().getVirtualBusKeywordsParserRuleCall_9()); }
	)
	|
	(
		{ before(grammarAccess.getComponentCategoryAccess().getVirtualProcessorKeywordsParserRuleCall_10()); }
		ruleVirtualProcessorKeywords
		{ after(grammarAccess.getComponentCategoryAccess().getVirtualProcessorKeywordsParserRuleCall_10()); }
	)
	|
	(
		{ before(grammarAccess.getComponentCategoryAccess().getVirtualMemoryKeywordsParserRuleCall_11()); }
		ruleVirtualMemoryKeywords
		{ after(grammarAccess.getComponentCategoryAccess().getVirtualMemoryKeywordsParserRuleCall_11()); }
	)
	|
	(
		{ before(grammarAccess.getComponentCategoryAccess().getVirtualDeviceKeywordsParserRuleCall_12()); }
		ruleVirtualDeviceKeywords
		{ after(grammarAccess.getComponentCategoryAccess().getVirtualDeviceKeywordsParserRuleCall_12()); }
	)
	|
	(
		{ before(grammarAccess.getComponentCategoryAccess().getSubprogramKeyword_13()); }
		'subprogram'
		{ after(grammarAccess.getComponentCategoryAccess().getSubprogramKeyword_13()); }
	)
	|
	(
		{ before(grammarAccess.getComponentCategoryAccess().getSubprogramGroupKeywordsParserRuleCall_14()); }
		ruleSubprogramGroupKeywords
		{ after(grammarAccess.getComponentCategoryAccess().getSubprogramGroupKeywordsParserRuleCall_14()); }
	)
	|
	(
		{ before(grammarAccess.getComponentCategoryAccess().getThreadGroupKeywordsParserRuleCall_15()); }
		ruleThreadGroupKeywords
		{ after(grammarAccess.getComponentCategoryAccess().getThreadGroupKeywordsParserRuleCall_15()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureCategory__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureCategoryAccess().getFeatureKeyword_0()); }
		'feature'
		{ after(grammarAccess.getFeatureCategoryAccess().getFeatureKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getFeatureCategoryAccess().getPortKeyword_1()); }
		'port'
		{ after(grammarAccess.getFeatureCategoryAccess().getPortKeyword_1()); }
	)
	|
	(
		{ before(grammarAccess.getFeatureCategoryAccess().getParameterKeyword_2()); }
		'parameter'
		{ after(grammarAccess.getFeatureCategoryAccess().getParameterKeyword_2()); }
	)
	|
	(
		{ before(grammarAccess.getFeatureCategoryAccess().getDataAccessKeywordsParserRuleCall_3()); }
		ruleDataAccessKeywords
		{ after(grammarAccess.getFeatureCategoryAccess().getDataAccessKeywordsParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getFeatureCategoryAccess().getBusAccessKeywordsParserRuleCall_4()); }
		ruleBusAccessKeywords
		{ after(grammarAccess.getFeatureCategoryAccess().getBusAccessKeywordsParserRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getFeatureCategoryAccess().getVirtualBusAccessKeywordsParserRuleCall_5()); }
		ruleVirtualBusAccessKeywords
		{ after(grammarAccess.getFeatureCategoryAccess().getVirtualBusAccessKeywordsParserRuleCall_5()); }
	)
	|
	(
		{ before(grammarAccess.getFeatureCategoryAccess().getSubprogramAccessKeywordsParserRuleCall_6()); }
		ruleSubprogramAccessKeywords
		{ after(grammarAccess.getFeatureCategoryAccess().getSubprogramAccessKeywordsParserRuleCall_6()); }
	)
	|
	(
		{ before(grammarAccess.getFeatureCategoryAccess().getSubprogramGroupAccessKeywordsParserRuleCall_7()); }
		ruleSubprogramGroupAccessKeywords
		{ after(grammarAccess.getFeatureCategoryAccess().getSubprogramGroupAccessKeywordsParserRuleCall_7()); }
	)
	|
	(
		{ before(grammarAccess.getFeatureCategoryAccess().getBindingKeyword_8()); }
		'binding'
		{ after(grammarAccess.getFeatureCategoryAccess().getBindingKeyword_8()); }
	)
	|
	(
		{ before(grammarAccess.getFeatureCategoryAccess().getInterfaceKeyword_9()); }
		'interface'
		{ after(grammarAccess.getFeatureCategoryAccess().getInterfaceKeyword_9()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureDirection__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureDirectionAccess().getInKeyword_0()); }
		'in'
		{ after(grammarAccess.getFeatureDirectionAccess().getInKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getFeatureDirectionAccess().getOutKeyword_1()); }
		'out'
		{ after(grammarAccess.getFeatureDirectionAccess().getOutKeyword_1()); }
	)
	|
	(
		{ before(grammarAccess.getFeatureDirectionAccess().getInOutKeywordsParserRuleCall_2()); }
		ruleInOutKeywords
		{ after(grammarAccess.getFeatureDirectionAccess().getInOutKeywordsParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getFeatureDirectionAccess().getRequiresKeyword_3()); }
		'requires'
		{ after(grammarAccess.getFeatureDirectionAccess().getRequiresKeyword_3()); }
	)
	|
	(
		{ before(grammarAccess.getFeatureDirectionAccess().getProvidesKeyword_4()); }
		'provides'
		{ after(grammarAccess.getFeatureDirectionAccess().getProvidesKeyword_4()); }
	)
	|
	(
		{ before(grammarAccess.getFeatureDirectionAccess().getProvidesReadKeywordsParserRuleCall_5()); }
		ruleProvidesReadKeywords
		{ after(grammarAccess.getFeatureDirectionAccess().getProvidesReadKeywordsParserRuleCall_5()); }
	)
	|
	(
		{ before(grammarAccess.getFeatureDirectionAccess().getRequiresReadKeywordsParserRuleCall_6()); }
		ruleRequiresReadKeywords
		{ after(grammarAccess.getFeatureDirectionAccess().getRequiresReadKeywordsParserRuleCall_6()); }
	)
	|
	(
		{ before(grammarAccess.getFeatureDirectionAccess().getProvidesWriteKeywordsParserRuleCall_7()); }
		ruleProvidesWriteKeywords
		{ after(grammarAccess.getFeatureDirectionAccess().getProvidesWriteKeywordsParserRuleCall_7()); }
	)
	|
	(
		{ before(grammarAccess.getFeatureDirectionAccess().getRequiresWriteKeywordsParserRuleCall_8()); }
		ruleRequiresWriteKeywords
		{ after(grammarAccess.getFeatureDirectionAccess().getRequiresWriteKeywordsParserRuleCall_8()); }
	)
	|
	(
		{ before(grammarAccess.getFeatureDirectionAccess().getProvidesRWKeywordsParserRuleCall_9()); }
		ruleProvidesRWKeywords
		{ after(grammarAccess.getFeatureDirectionAccess().getProvidesRWKeywordsParserRuleCall_9()); }
	)
	|
	(
		{ before(grammarAccess.getFeatureDirectionAccess().getRequiresRWKeywordsParserRuleCall_10()); }
		ruleRequiresRWKeywords
		{ after(grammarAccess.getFeatureDirectionAccess().getRequiresRWKeywordsParserRuleCall_10()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropagationDirection__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropagationDirectionAccess().getInKeyword_0()); }
		'in'
		{ after(grammarAccess.getPropagationDirectionAccess().getInKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getPropagationDirectionAccess().getOutKeyword_1()); }
		'out'
		{ after(grammarAccess.getPropagationDirectionAccess().getOutKeyword_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Composite__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCompositeAccess().getListKeyword_0()); }
		'list'
		{ after(grammarAccess.getCompositeAccess().getListKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getCompositeAccess().getSetKeyword_1()); }
		'set'
		{ after(grammarAccess.getCompositeAccess().getSetKeyword_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primitive__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimitiveAccess().getBooleanKeyword_0()); }
		'boolean'
		{ after(grammarAccess.getPrimitiveAccess().getBooleanKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getPrimitiveAccess().getIntegerKeyword_1()); }
		'integer'
		{ after(grammarAccess.getPrimitiveAccess().getIntegerKeyword_1()); }
	)
	|
	(
		{ before(grammarAccess.getPrimitiveAccess().getRealKeyword_2()); }
		'real'
		{ after(grammarAccess.getPrimitiveAccess().getRealKeyword_2()); }
	)
	|
	(
		{ before(grammarAccess.getPrimitiveAccess().getStringKeyword_3()); }
		'string'
		{ after(grammarAccess.getPrimitiveAccess().getStringKeyword_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EOperation__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEOperationAccess().getAnyKeyword_0()); }
		'any'
		{ after(grammarAccess.getEOperationAccess().getAnyKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getEOperationAccess().getAllKeyword_1()); }
		'all'
		{ after(grammarAccess.getEOperationAccess().getAllKeyword_1()); }
	)
	|
	(
		{ before(grammarAccess.getEOperationAccess().getOneofKeyword_2()); }
		'oneof'
		{ after(grammarAccess.getEOperationAccess().getOneofKeyword_2()); }
	)
	|
	(
		{ before(grammarAccess.getEOperationAccess().getOfKeyword_3()); }
		'of'
		{ after(grammarAccess.getEOperationAccess().getOfKeyword_3()); }
	)
	|
	(
		{ before(grammarAccess.getEOperationAccess().getOrmoreKeyword_4()); }
		'ormore'
		{ after(grammarAccess.getEOperationAccess().getOrmoreKeyword_4()); }
	)
	|
	(
		{ before(grammarAccess.getEOperationAccess().getOrlessKeyword_5()); }
		'orless'
		{ after(grammarAccess.getEOperationAccess().getOrlessKeyword_5()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AssociationType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAssociationTypeAccess().getIsConnectionParserRuleCall_0()); }
		ruleIsConnection
		{ after(grammarAccess.getAssociationTypeAccess().getIsConnectionParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAssociationTypeAccess().getIsBindingParserRuleCall_1()); }
		ruleIsBinding
		{ after(grammarAccess.getAssociationTypeAccess().getIsBindingParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getAssociationTypeAccess().getIsFlowParserRuleCall_2()); }
		ruleIsFlow
		{ after(grammarAccess.getAssociationTypeAccess().getIsFlowParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDeclaration__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PackageDeclaration__Group__0__Impl
	rule__PackageDeclaration__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDeclaration__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPackageDeclarationAccess().getAnnotationsAssignment_0()); }
	(rule__PackageDeclaration__AnnotationsAssignment_0)*
	{ after(grammarAccess.getPackageDeclarationAccess().getAnnotationsAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDeclaration__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PackageDeclaration__Group__1__Impl
	rule__PackageDeclaration__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDeclaration__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPackageDeclarationAccess().getPrivateAssignment_1()); }
	(rule__PackageDeclaration__PrivateAssignment_1)?
	{ after(grammarAccess.getPackageDeclarationAccess().getPrivateAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDeclaration__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PackageDeclaration__Group__2__Impl
	rule__PackageDeclaration__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDeclaration__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_2()); }
	'package'
	{ after(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDeclaration__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PackageDeclaration__Group__3__Impl
	rule__PackageDeclaration__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDeclaration__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_3()); }
	(rule__PackageDeclaration__NameAssignment_3)
	{ after(grammarAccess.getPackageDeclarationAccess().getNameAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDeclaration__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PackageDeclaration__Group__4__Impl
	rule__PackageDeclaration__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDeclaration__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPackageDeclarationAccess().getIsKeyword_4()); }
	'is'
	{ after(grammarAccess.getPackageDeclarationAccess().getIsKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDeclaration__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PackageDeclaration__Group__5__Impl
	rule__PackageDeclaration__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDeclaration__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPackageDeclarationAccess().getAlternatives_5()); }
	(rule__PackageDeclaration__Alternatives_5)
	{ after(grammarAccess.getPackageDeclarationAccess().getAlternatives_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDeclaration__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PackageDeclaration__Group__6__Impl
	rule__PackageDeclaration__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDeclaration__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPackageDeclarationAccess().getEndKeyword_6()); }
	'end'
	{ after(grammarAccess.getPackageDeclarationAccess().getEndKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDeclaration__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PackageDeclaration__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDeclaration__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPackageDeclarationAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getPackageDeclarationAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AnnexLibrary__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnnexLibrary__Group__0__Impl
	rule__AnnexLibrary__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnexLibrary__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnexLibraryAccess().getCommercialAtKeyword_0()); }
	'@'
	{ after(grammarAccess.getAnnexLibraryAccess().getCommercialAtKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnexLibrary__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnnexLibrary__Group__1__Impl
	rule__AnnexLibrary__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnexLibrary__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnexLibraryAccess().getNameAssignment_1()); }
	(rule__AnnexLibrary__NameAssignment_1)
	{ after(grammarAccess.getAnnexLibraryAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnexLibrary__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnnexLibrary__Group__2__Impl
	rule__AnnexLibrary__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnexLibrary__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnexLibraryAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getAnnexLibraryAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnexLibrary__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnnexLibrary__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnexLibrary__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnexLibraryAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getAnnexLibraryAccess().getRightCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PropertyDefinition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyDefinition__Group__0__Impl
	rule__PropertyDefinition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyDefinitionAccess().getAnnotationsAssignment_0()); }
	(rule__PropertyDefinition__AnnotationsAssignment_0)*
	{ after(grammarAccess.getPropertyDefinitionAccess().getAnnotationsAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyDefinition__Group__1__Impl
	rule__PropertyDefinition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyDefinitionAccess().getPrivateAssignment_1()); }
	(rule__PropertyDefinition__PrivateAssignment_1)?
	{ after(grammarAccess.getPropertyDefinitionAccess().getPrivateAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyDefinition__Group__2__Impl
	rule__PropertyDefinition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyDefinitionAccess().getPropertyKeyword_2()); }
	'property'
	{ after(grammarAccess.getPropertyDefinitionAccess().getPropertyKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyDefinition__Group__3__Impl
	rule__PropertyDefinition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyDefinitionAccess().getNameAssignment_3()); }
	(rule__PropertyDefinition__NameAssignment_3)
	{ after(grammarAccess.getPropertyDefinitionAccess().getNameAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyDefinition__Group__4__Impl
	rule__PropertyDefinition__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyDefinitionAccess().getColonKeyword_4()); }
	':'
	{ after(grammarAccess.getPropertyDefinitionAccess().getColonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyDefinition__Group__5__Impl
	rule__PropertyDefinition__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyDefinitionAccess().getTypeAssignment_5()); }
	(rule__PropertyDefinition__TypeAssignment_5)
	{ after(grammarAccess.getPropertyDefinitionAccess().getTypeAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyDefinition__Group__6__Impl
	rule__PropertyDefinition__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyDefinitionAccess().getGroup_6()); }
	(rule__PropertyDefinition__Group_6__0)?
	{ after(grammarAccess.getPropertyDefinitionAccess().getGroup_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyDefinition__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PropertyDefinition__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyDefinition__Group_6__0__Impl
	rule__PropertyDefinition__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyDefinitionAccess().getForKeyword_6_0()); }
	'for'
	{ after(grammarAccess.getPropertyDefinitionAccess().getForKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyDefinition__Group_6__1__Impl
	rule__PropertyDefinition__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyDefinitionAccess().getLeftParenthesisKeyword_6_1()); }
	'('
	{ after(grammarAccess.getPropertyDefinitionAccess().getLeftParenthesisKeyword_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group_6__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyDefinition__Group_6__2__Impl
	rule__PropertyDefinition__Group_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group_6__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyDefinitionAccess().getAlternatives_6_2()); }
	(rule__PropertyDefinition__Alternatives_6_2)
	{ after(grammarAccess.getPropertyDefinitionAccess().getAlternatives_6_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group_6__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyDefinition__Group_6__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group_6__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyDefinitionAccess().getRightParenthesisKeyword_6_3()); }
	')'
	{ after(grammarAccess.getPropertyDefinitionAccess().getRightParenthesisKeyword_6_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PropertyDefinition__Group_6_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyDefinition__Group_6_2_1__0__Impl
	rule__PropertyDefinition__Group_6_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group_6_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyDefinitionAccess().getAppliesToParserRuleCall_6_2_1_0()); }
	ruleAppliesTo
	{ after(grammarAccess.getPropertyDefinitionAccess().getAppliesToParserRuleCall_6_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group_6_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyDefinition__Group_6_2_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group_6_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyDefinitionAccess().getGroup_6_2_1_1()); }
	(rule__PropertyDefinition__Group_6_2_1_1__0)*
	{ after(grammarAccess.getPropertyDefinitionAccess().getGroup_6_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PropertyDefinition__Group_6_2_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyDefinition__Group_6_2_1_1__0__Impl
	rule__PropertyDefinition__Group_6_2_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group_6_2_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyDefinitionAccess().getCommaKeyword_6_2_1_1_0()); }
	','
	{ after(grammarAccess.getPropertyDefinitionAccess().getCommaKeyword_6_2_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group_6_2_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyDefinition__Group_6_2_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group_6_2_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyDefinitionAccess().getAppliesToParserRuleCall_6_2_1_1_1()); }
	ruleAppliesTo
	{ after(grammarAccess.getPropertyDefinitionAccess().getAppliesToParserRuleCall_6_2_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PropertySet__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertySet__Group__0__Impl
	rule__PropertySet__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertySetAccess().getAnnotationsAssignment_0()); }
	(rule__PropertySet__AnnotationsAssignment_0)*
	{ after(grammarAccess.getPropertySetAccess().getAnnotationsAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertySet__Group__1__Impl
	rule__PropertySet__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertySetAccess().getPrivateAssignment_1()); }
	(rule__PropertySet__PrivateAssignment_1)?
	{ after(grammarAccess.getPropertySetAccess().getPrivateAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertySet__Group__2__Impl
	rule__PropertySet__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertySetAccess().getPropertiesKeyword_2()); }
	'properties'
	{ after(grammarAccess.getPropertySetAccess().getPropertiesKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertySet__Group__3__Impl
	rule__PropertySet__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertySetAccess().getNameAssignment_3()); }
	(rule__PropertySet__NameAssignment_3)
	{ after(grammarAccess.getPropertySetAccess().getNameAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertySet__Group__4__Impl
	rule__PropertySet__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertySetAccess().getColonKeyword_4()); }
	':'
	{ after(grammarAccess.getPropertySetAccess().getColonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertySet__Group__5__Impl
	rule__PropertySet__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertySetAccess().getLeftCurlyBracketKeyword_5()); }
	'{'
	{ after(grammarAccess.getPropertySetAccess().getLeftCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertySet__Group__6__Impl
	rule__PropertySet__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertySetAccess().getPropertiesAssignment_6()); }
	(rule__PropertySet__PropertiesAssignment_6)
	{ after(grammarAccess.getPropertySetAccess().getPropertiesAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertySet__Group__7__Impl
	rule__PropertySet__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertySetAccess().getGroup_7()); }
	(rule__PropertySet__Group_7__0)*
	{ after(grammarAccess.getPropertySetAccess().getGroup_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertySet__Group__8__Impl
	rule__PropertySet__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertySetAccess().getRightCurlyBracketKeyword_8()); }
	'}'
	{ after(grammarAccess.getPropertySetAccess().getRightCurlyBracketKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertySet__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertySetAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getPropertySetAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PropertySet__Group_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertySet__Group_7__0__Impl
	rule__PropertySet__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__Group_7__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertySetAccess().getCommaKeyword_7_0()); }
	','
	{ after(grammarAccess.getPropertySetAccess().getCommaKeyword_7_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__Group_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertySet__Group_7__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__Group_7__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertySetAccess().getPropertiesAssignment_7_1()); }
	(rule__PropertySet__PropertiesAssignment_7_1)
	{ after(grammarAccess.getPropertySetAccess().getPropertiesAssignment_7_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TypeDef__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeDef__Group__0__Impl
	rule__TypeDef__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDef__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeDefAccess().getAnnotationsAssignment_0()); }
	(rule__TypeDef__AnnotationsAssignment_0)*
	{ after(grammarAccess.getTypeDefAccess().getAnnotationsAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDef__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeDef__Group__1__Impl
	rule__TypeDef__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDef__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeDefAccess().getPrivateAssignment_1()); }
	(rule__TypeDef__PrivateAssignment_1)?
	{ after(grammarAccess.getTypeDefAccess().getPrivateAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDef__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeDef__Group__2__Impl
	rule__TypeDef__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDef__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeDefAccess().getTypeKeyword_2()); }
	'type'
	{ after(grammarAccess.getTypeDefAccess().getTypeKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDef__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeDef__Group__3__Impl
	rule__TypeDef__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDef__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeDefAccess().getNameAssignment_3()); }
	(rule__TypeDef__NameAssignment_3)
	{ after(grammarAccess.getTypeDefAccess().getNameAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDef__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeDef__Group__4__Impl
	rule__TypeDef__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDef__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeDefAccess().getGroup_4()); }
	(rule__TypeDef__Group_4__0)?
	{ after(grammarAccess.getTypeDefAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDef__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeDef__Group__5__Impl
	rule__TypeDef__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDef__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeDefAccess().getGroup_5()); }
	(rule__TypeDef__Group_5__0)?
	{ after(grammarAccess.getTypeDefAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDef__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeDef__Group__6__Impl
	rule__TypeDef__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDef__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeDefAccess().getPropertiesBlockParserRuleCall_6()); }
	(rulePropertiesBlock)?
	{ after(grammarAccess.getTypeDefAccess().getPropertiesBlockParserRuleCall_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDef__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeDef__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDef__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeDefAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getTypeDefAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TypeDef__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeDef__Group_4__0__Impl
	rule__TypeDef__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDef__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeDefAccess().getExtendsKeyword_4_0()); }
	'extends'
	{ after(grammarAccess.getTypeDefAccess().getExtendsKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDef__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeDef__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDef__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeDefAccess().getSuperTypeAssignment_4_1()); }
	(rule__TypeDef__SuperTypeAssignment_4_1)
	{ after(grammarAccess.getTypeDefAccess().getSuperTypeAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TypeDef__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeDef__Group_5__0__Impl
	rule__TypeDef__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDef__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeDefAccess().getColonKeyword_5_0()); }
	':'
	{ after(grammarAccess.getTypeDefAccess().getColonKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDef__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeDef__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDef__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeDefAccess().getBaseTypeAssignment_5_1()); }
	(rule__TypeDef__BaseTypeAssignment_5_1)
	{ after(grammarAccess.getTypeDefAccess().getBaseTypeAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PropertyAssociation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyAssociation__Group__0__Impl
	rule__PropertyAssociation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyAssociation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyAssociationAccess().getTargetAssignment_0()); }
	(rule__PropertyAssociation__TargetAssignment_0)?
	{ after(grammarAccess.getPropertyAssociationAccess().getTargetAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyAssociation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyAssociation__Group__1__Impl
	rule__PropertyAssociation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyAssociation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyAssociationAccess().getNumberSignKeyword_1()); }
	'#'
	{ after(grammarAccess.getPropertyAssociationAccess().getNumberSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyAssociation__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyAssociation__Group__2__Impl
	rule__PropertyAssociation__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyAssociation__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyAssociationAccess().getPropertyAssignment_2()); }
	(rule__PropertyAssociation__PropertyAssignment_2)
	{ after(grammarAccess.getPropertyAssociationAccess().getPropertyAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyAssociation__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyAssociation__Group__3__Impl
	rule__PropertyAssociation__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyAssociation__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyAssociationAccess().getPropertyAssociationTypeAssignment_3()); }
	(rule__PropertyAssociation__PropertyAssociationTypeAssignment_3)
	{ after(grammarAccess.getPropertyAssociationAccess().getPropertyAssociationTypeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyAssociation__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyAssociation__Group__4__Impl
	rule__PropertyAssociation__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyAssociation__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyAssociationAccess().getValueAssignment_4()); }
	(rule__PropertyAssociation__ValueAssignment_4)
	{ after(grammarAccess.getPropertyAssociationAccess().getValueAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyAssociation__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyAssociation__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyAssociation__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyAssociationAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getPropertyAssociationAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ModelElementReference__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ModelElementReference__Group__0__Impl
	rule__ModelElementReference__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementReference__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelElementReferenceAccess().getElementAssignment_0()); }
	(rule__ModelElementReference__ElementAssignment_0)
	{ after(grammarAccess.getModelElementReferenceAccess().getElementAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementReference__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ModelElementReference__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementReference__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelElementReferenceAccess().getGroup_1()); }
	(rule__ModelElementReference__Group_1__0)*
	{ after(grammarAccess.getModelElementReferenceAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ModelElementReference__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ModelElementReference__Group_1__0__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementReference__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelElementReferenceAccess().getGroup_1_0()); }
	(rule__ModelElementReference__Group_1_0__0)
	{ after(grammarAccess.getModelElementReferenceAccess().getGroup_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ModelElementReference__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ModelElementReference__Group_1_0__0__Impl
	rule__ModelElementReference__Group_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementReference__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelElementReferenceAccess().getNamedElementReferenceContextAction_1_0_0()); }
	()
	{ after(grammarAccess.getModelElementReferenceAccess().getNamedElementReferenceContextAction_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementReference__Group_1_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ModelElementReference__Group_1_0__1__Impl
	rule__ModelElementReference__Group_1_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementReference__Group_1_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelElementReferenceAccess().getFullStopKeyword_1_0_1()); }
	'.'
	{ after(grammarAccess.getModelElementReferenceAccess().getFullStopKeyword_1_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementReference__Group_1_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ModelElementReference__Group_1_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementReference__Group_1_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelElementReferenceAccess().getElementAssignment_1_0_2()); }
	(rule__ModelElementReference__ElementAssignment_1_0_2)
	{ after(grammarAccess.getModelElementReferenceAccess().getElementAssignment_1_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NamedElementReference__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedElementReference__Group__0__Impl
	rule__NamedElementReference__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedElementReference__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedElementReferenceAccess().getElementAssignment_0()); }
	(rule__NamedElementReference__ElementAssignment_0)
	{ after(grammarAccess.getNamedElementReferenceAccess().getElementAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedElementReference__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedElementReference__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedElementReference__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedElementReferenceAccess().getGroup_1()); }
	(rule__NamedElementReference__Group_1__0)*
	{ after(grammarAccess.getNamedElementReferenceAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NamedElementReference__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedElementReference__Group_1__0__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedElementReference__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedElementReferenceAccess().getGroup_1_0()); }
	(rule__NamedElementReference__Group_1_0__0)
	{ after(grammarAccess.getNamedElementReferenceAccess().getGroup_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NamedElementReference__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedElementReference__Group_1_0__0__Impl
	rule__NamedElementReference__Group_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedElementReference__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedElementReferenceAccess().getNamedElementReferenceContextAction_1_0_0()); }
	()
	{ after(grammarAccess.getNamedElementReferenceAccess().getNamedElementReferenceContextAction_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedElementReference__Group_1_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedElementReference__Group_1_0__1__Impl
	rule__NamedElementReference__Group_1_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedElementReference__Group_1_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedElementReferenceAccess().getFullStopKeyword_1_0_1()); }
	'.'
	{ after(grammarAccess.getNamedElementReferenceAccess().getFullStopKeyword_1_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedElementReference__Group_1_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedElementReference__Group_1_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedElementReference__Group_1_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedElementReferenceAccess().getElementAssignment_1_0_2()); }
	(rule__NamedElementReference__ElementAssignment_1_0_2)
	{ after(grammarAccess.getNamedElementReferenceAccess().getElementAssignment_1_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentInterface__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentInterface__Group__0__Impl
	rule__ComponentInterface__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentInterfaceAccess().getAnnotationsAssignment_0()); }
	(rule__ComponentInterface__AnnotationsAssignment_0)*
	{ after(grammarAccess.getComponentInterfaceAccess().getAnnotationsAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentInterface__Group__1__Impl
	rule__ComponentInterface__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentInterfaceAccess().getPrivateAssignment_1()); }
	(rule__ComponentInterface__PrivateAssignment_1)?
	{ after(grammarAccess.getComponentInterfaceAccess().getPrivateAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentInterface__Group__2__Impl
	rule__ComponentInterface__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentInterfaceAccess().getCategoryAssignment_2()); }
	(rule__ComponentInterface__CategoryAssignment_2)?
	{ after(grammarAccess.getComponentInterfaceAccess().getCategoryAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentInterface__Group__3__Impl
	rule__ComponentInterface__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentInterfaceAccess().getInterfaceKeyword_3()); }
	'interface'
	{ after(grammarAccess.getComponentInterfaceAccess().getInterfaceKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentInterface__Group__4__Impl
	rule__ComponentInterface__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentInterfaceAccess().getNameAssignment_4()); }
	(rule__ComponentInterface__NameAssignment_4)
	{ after(grammarAccess.getComponentInterfaceAccess().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentInterface__Group__5__Impl
	rule__ComponentInterface__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentInterfaceAccess().getGroup_5()); }
	(rule__ComponentInterface__Group_5__0)?
	{ after(grammarAccess.getComponentInterfaceAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentInterface__Group__6__Impl
	rule__ComponentInterface__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentInterfaceAccess().getInterfaceBodyParserRuleCall_6()); }
	ruleInterfaceBody
	{ after(grammarAccess.getComponentInterfaceAccess().getInterfaceBodyParserRuleCall_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentInterface__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentInterfaceAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getComponentInterfaceAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentInterface__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentInterface__Group_5__0__Impl
	rule__ComponentInterface__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentInterfaceAccess().getExtendsKeyword_5_0()); }
	'extends'
	{ after(grammarAccess.getComponentInterfaceAccess().getExtendsKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentInterface__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentInterfaceAccess().getInterfaceExtensionsParserRuleCall_5_1()); }
	ruleInterfaceExtensions
	{ after(grammarAccess.getComponentInterfaceAccess().getInterfaceExtensionsParserRuleCall_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InterfaceBody__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InterfaceBody__Group__0__Impl
	rule__InterfaceBody__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InterfaceBody__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInterfaceBodyAccess().getIsKeyword_0()); }
	'is'
	{ after(grammarAccess.getInterfaceBodyAccess().getIsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InterfaceBody__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InterfaceBody__Group__1__Impl
	rule__InterfaceBody__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__InterfaceBody__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInterfaceBodyAccess().getInterfaceElementParserRuleCall_1()); }
	(ruleInterfaceElement)*
	{ after(grammarAccess.getInterfaceBodyAccess().getInterfaceElementParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InterfaceBody__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InterfaceBody__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InterfaceBody__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInterfaceBodyAccess().getEndKeyword_2()); }
	'end'
	{ after(grammarAccess.getInterfaceBodyAccess().getEndKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentImplementation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentImplementation__Group__0__Impl
	rule__ComponentImplementation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentImplementation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentImplementationAccess().getAnnotationsAssignment_0()); }
	(rule__ComponentImplementation__AnnotationsAssignment_0)*
	{ after(grammarAccess.getComponentImplementationAccess().getAnnotationsAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentImplementation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentImplementation__Group__1__Impl
	rule__ComponentImplementation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentImplementation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentImplementationAccess().getPrivateAssignment_1()); }
	(rule__ComponentImplementation__PrivateAssignment_1)?
	{ after(grammarAccess.getComponentImplementationAccess().getPrivateAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentImplementation__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentImplementation__Group__2__Impl
	rule__ComponentImplementation__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentImplementation__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentImplementationAccess().getCategoryAssignment_2()); }
	(rule__ComponentImplementation__CategoryAssignment_2)
	{ after(grammarAccess.getComponentImplementationAccess().getCategoryAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentImplementation__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentImplementation__Group__3__Impl
	rule__ComponentImplementation__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentImplementation__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentImplementationAccess().getNameAssignment_3()); }
	(rule__ComponentImplementation__NameAssignment_3)
	{ after(grammarAccess.getComponentImplementationAccess().getNameAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentImplementation__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentImplementation__Group__4__Impl
	rule__ComponentImplementation__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentImplementation__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentImplementationAccess().getGroup_4()); }
	(rule__ComponentImplementation__Group_4__0)?
	{ after(grammarAccess.getComponentImplementationAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentImplementation__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentImplementation__Group__5__Impl
	rule__ComponentImplementation__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentImplementation__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentImplementationAccess().getImplementationBodyParserRuleCall_5()); }
	ruleImplementationBody
	{ after(grammarAccess.getComponentImplementationAccess().getImplementationBodyParserRuleCall_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentImplementation__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentImplementation__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentImplementation__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentImplementationAccess().getSemicolonKeyword_6()); }
	';'
	{ after(grammarAccess.getComponentImplementationAccess().getSemicolonKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentImplementation__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentImplementation__Group_4__0__Impl
	rule__ComponentImplementation__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentImplementation__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentImplementationAccess().getExtendsKeyword_4_0()); }
	'extends'
	{ after(grammarAccess.getComponentImplementationAccess().getExtendsKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentImplementation__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentImplementation__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentImplementation__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentImplementationAccess().getImplementationExtensionsParserRuleCall_4_1()); }
	ruleImplementationExtensions
	{ after(grammarAccess.getComponentImplementationAccess().getImplementationExtensionsParserRuleCall_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ImplementationBody__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImplementationBody__Group__0__Impl
	rule__ImplementationBody__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplementationBody__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImplementationBodyAccess().getIsKeyword_0()); }
	'is'
	{ after(grammarAccess.getImplementationBodyAccess().getIsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplementationBody__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImplementationBody__Group__1__Impl
	rule__ImplementationBody__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplementationBody__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImplementationBodyAccess().getImplementationElementParserRuleCall_1()); }
	(ruleImplementationElement)*
	{ after(grammarAccess.getImplementationBodyAccess().getImplementationElementParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplementationBody__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImplementationBody__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplementationBody__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImplementationBodyAccess().getEndKeyword_2()); }
	'end'
	{ after(grammarAccess.getImplementationBodyAccess().getEndKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentConfiguration__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentConfiguration__Group__0__Impl
	rule__ComponentConfiguration__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentConfiguration__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentConfigurationAccess().getAnnotationsAssignment_0()); }
	(rule__ComponentConfiguration__AnnotationsAssignment_0)*
	{ after(grammarAccess.getComponentConfigurationAccess().getAnnotationsAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentConfiguration__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentConfiguration__Group__1__Impl
	rule__ComponentConfiguration__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentConfiguration__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentConfigurationAccess().getPrivateAssignment_1()); }
	(rule__ComponentConfiguration__PrivateAssignment_1)?
	{ after(grammarAccess.getComponentConfigurationAccess().getPrivateAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentConfiguration__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentConfiguration__Group__2__Impl
	rule__ComponentConfiguration__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentConfiguration__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentConfigurationAccess().getConfigurationKeyword_2()); }
	'configuration'
	{ after(grammarAccess.getComponentConfigurationAccess().getConfigurationKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentConfiguration__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentConfiguration__Group__3__Impl
	rule__ComponentConfiguration__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentConfiguration__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentConfigurationAccess().getNameAssignment_3()); }
	(rule__ComponentConfiguration__NameAssignment_3)
	{ after(grammarAccess.getComponentConfigurationAccess().getNameAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentConfiguration__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentConfiguration__Group__4__Impl
	rule__ComponentConfiguration__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentConfiguration__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentConfigurationAccess().getParametersParserRuleCall_4()); }
	(ruleParameters)?
	{ after(grammarAccess.getComponentConfigurationAccess().getParametersParserRuleCall_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentConfiguration__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentConfiguration__Group__5__Impl
	rule__ComponentConfiguration__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentConfiguration__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentConfigurationAccess().getGroup_5()); }
	(rule__ComponentConfiguration__Group_5__0)?
	{ after(grammarAccess.getComponentConfigurationAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentConfiguration__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentConfiguration__Group__6__Impl
	rule__ComponentConfiguration__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentConfiguration__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentConfigurationAccess().getConfigurationElementBlockParserRuleCall_6()); }
	ruleConfigurationElementBlock
	{ after(grammarAccess.getComponentConfigurationAccess().getConfigurationElementBlockParserRuleCall_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentConfiguration__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentConfiguration__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentConfiguration__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentConfigurationAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getComponentConfigurationAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentConfiguration__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentConfiguration__Group_5__0__Impl
	rule__ComponentConfiguration__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentConfiguration__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentConfigurationAccess().getExtendsKeyword_5_0()); }
	'extends'
	{ after(grammarAccess.getComponentConfigurationAccess().getExtendsKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentConfiguration__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentConfiguration__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentConfiguration__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentConfigurationAccess().getConfigurationExtensionsParserRuleCall_5_1()); }
	ruleConfigurationExtensions
	{ after(grammarAccess.getComponentConfigurationAccess().getConfigurationExtensionsParserRuleCall_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group__0__Impl
	rule__Feature__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getAnnotationsAssignment_0()); }
	(rule__Feature__AnnotationsAssignment_0)*
	{ after(grammarAccess.getFeatureAccess().getAnnotationsAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group__1__Impl
	rule__Feature__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getNameAssignment_1()); }
	(rule__Feature__NameAssignment_1)
	{ after(grammarAccess.getFeatureAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group__2__Impl
	rule__Feature__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getFeatureAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group__3__Impl
	rule__Feature__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getDirectionAssignment_3()); }
	(rule__Feature__DirectionAssignment_3)?
	{ after(grammarAccess.getFeatureAccess().getDirectionAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group__4__Impl
	rule__Feature__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getCategoryAssignment_4()); }
	(rule__Feature__CategoryAssignment_4)
	{ after(grammarAccess.getFeatureAccess().getCategoryAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group__5__Impl
	rule__Feature__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getTypeReferenceAssignment_5()); }
	(rule__Feature__TypeReferenceAssignment_5)?
	{ after(grammarAccess.getFeatureAccess().getTypeReferenceAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group__6__Impl
	rule__Feature__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getPropertiesBlockParserRuleCall_6()); }
	(rulePropertiesBlock)?
	{ after(grammarAccess.getFeatureAccess().getPropertiesBlockParserRuleCall_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getFeatureAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Subcomponent__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Subcomponent__Group__0__Impl
	rule__Subcomponent__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Subcomponent__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubcomponentAccess().getSubcomponentAction_0()); }
	()
	{ after(grammarAccess.getSubcomponentAccess().getSubcomponentAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Subcomponent__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Subcomponent__Group__1__Impl
	rule__Subcomponent__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Subcomponent__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubcomponentAccess().getAnnotationsAssignment_1()); }
	(rule__Subcomponent__AnnotationsAssignment_1)*
	{ after(grammarAccess.getSubcomponentAccess().getAnnotationsAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Subcomponent__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Subcomponent__Group__2__Impl
	rule__Subcomponent__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Subcomponent__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubcomponentAccess().getNameAssignment_2()); }
	(rule__Subcomponent__NameAssignment_2)
	{ after(grammarAccess.getSubcomponentAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Subcomponent__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Subcomponent__Group__3__Impl
	rule__Subcomponent__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Subcomponent__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubcomponentAccess().getColonKeyword_3()); }
	':'
	{ after(grammarAccess.getSubcomponentAccess().getColonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Subcomponent__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Subcomponent__Group__4__Impl
	rule__Subcomponent__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Subcomponent__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubcomponentAccess().getCategoryAssignment_4()); }
	(rule__Subcomponent__CategoryAssignment_4)
	{ after(grammarAccess.getSubcomponentAccess().getCategoryAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Subcomponent__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Subcomponent__Group__5__Impl
	rule__Subcomponent__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Subcomponent__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubcomponentAccess().getAlternatives_5()); }
	(rule__Subcomponent__Alternatives_5)
	{ after(grammarAccess.getSubcomponentAccess().getAlternatives_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Subcomponent__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Subcomponent__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Subcomponent__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubcomponentAccess().getSemicolonKeyword_6()); }
	';'
	{ after(grammarAccess.getSubcomponentAccess().getSemicolonKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Subcomponent__Group_5_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Subcomponent__Group_5_0__0__Impl
	rule__Subcomponent__Group_5_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Subcomponent__Group_5_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubcomponentAccess().getTypeReferencesAssignment_5_0_0()); }
	(rule__Subcomponent__TypeReferencesAssignment_5_0_0)
	{ after(grammarAccess.getSubcomponentAccess().getTypeReferencesAssignment_5_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Subcomponent__Group_5_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Subcomponent__Group_5_0__1__Impl
	rule__Subcomponent__Group_5_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Subcomponent__Group_5_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubcomponentAccess().getInStatesParserRuleCall_5_0_1()); }
	(ruleInStates)?
	{ after(grammarAccess.getSubcomponentAccess().getInStatesParserRuleCall_5_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Subcomponent__Group_5_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Subcomponent__Group_5_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Subcomponent__Group_5_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubcomponentAccess().getPropertiesBlockParserRuleCall_5_0_2()); }
	(rulePropertiesBlock)?
	{ after(grammarAccess.getSubcomponentAccess().getPropertiesBlockParserRuleCall_5_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Subcomponent__Group_5_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Subcomponent__Group_5_1__0__Impl
	rule__Subcomponent__Group_5_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Subcomponent__Group_5_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubcomponentAccess().getInStatesParserRuleCall_5_1_0()); }
	(ruleInStates)?
	{ after(grammarAccess.getSubcomponentAccess().getInStatesParserRuleCall_5_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Subcomponent__Group_5_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Subcomponent__Group_5_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Subcomponent__Group_5_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubcomponentAccess().getNestedComponentImplementationBlockParserRuleCall_5_1_1()); }
	ruleNestedComponentImplementationBlock
	{ after(grammarAccess.getSubcomponentAccess().getNestedComponentImplementationBlockParserRuleCall_5_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Connection__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connection__Group__0__Impl
	rule__Connection__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectionAccess().getNameAssignment_0()); }
	(rule__Connection__NameAssignment_0)
	{ after(grammarAccess.getConnectionAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connection__Group__1__Impl
	rule__Connection__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectionAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getConnectionAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connection__Group__2__Impl
	rule__Connection__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectionAccess().getAssociationTypeAssignment_2()); }
	(rule__Connection__AssociationTypeAssignment_2)
	{ after(grammarAccess.getConnectionAccess().getAssociationTypeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connection__Group__3__Impl
	rule__Connection__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectionAccess().getSourceAssignment_3()); }
	(rule__Connection__SourceAssignment_3)
	{ after(grammarAccess.getConnectionAccess().getSourceAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connection__Group__4__Impl
	rule__Connection__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectionAccess().getAlternatives_4()); }
	(rule__Connection__Alternatives_4)
	{ after(grammarAccess.getConnectionAccess().getAlternatives_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connection__Group__5__Impl
	rule__Connection__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectionAccess().getDestinationAssignment_5()); }
	(rule__Connection__DestinationAssignment_5)
	{ after(grammarAccess.getConnectionAccess().getDestinationAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connection__Group__6__Impl
	rule__Connection__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectionAccess().getInStatesParserRuleCall_6()); }
	(ruleInStates)?
	{ after(grammarAccess.getConnectionAccess().getInStatesParserRuleCall_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connection__Group__7__Impl
	rule__Connection__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectionAccess().getPropertiesBlockParserRuleCall_7()); }
	(rulePropertiesBlock)?
	{ after(grammarAccess.getConnectionAccess().getPropertiesBlockParserRuleCall_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connection__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectionAccess().getSemicolonKeyword_8()); }
	';'
	{ after(grammarAccess.getConnectionAccess().getSemicolonKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Binding__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Binding__Group__0__Impl
	rule__Binding__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Binding__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBindingAccess().getNameAssignment_0()); }
	(rule__Binding__NameAssignment_0)
	{ after(grammarAccess.getBindingAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Binding__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Binding__Group__1__Impl
	rule__Binding__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Binding__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBindingAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getBindingAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Binding__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Binding__Group__2__Impl
	rule__Binding__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Binding__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBindingAccess().getBindingTypeAssignment_2()); }
	(rule__Binding__BindingTypeAssignment_2)?
	{ after(grammarAccess.getBindingAccess().getBindingTypeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Binding__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Binding__Group__3__Impl
	rule__Binding__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Binding__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBindingAccess().getAssociationTypeAssignment_3()); }
	(rule__Binding__AssociationTypeAssignment_3)
	{ after(grammarAccess.getBindingAccess().getAssociationTypeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Binding__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Binding__Group__4__Impl
	rule__Binding__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Binding__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBindingAccess().getSourceAssignment_4()); }
	(rule__Binding__SourceAssignment_4)
	{ after(grammarAccess.getBindingAccess().getSourceAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Binding__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Binding__Group__5__Impl
	rule__Binding__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Binding__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBindingAccess().getHyphenMinusGreaterThanSignKeyword_5()); }
	'->'
	{ after(grammarAccess.getBindingAccess().getHyphenMinusGreaterThanSignKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Binding__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Binding__Group__6__Impl
	rule__Binding__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Binding__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBindingAccess().getDestinationAssignment_6()); }
	(rule__Binding__DestinationAssignment_6)
	{ after(grammarAccess.getBindingAccess().getDestinationAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Binding__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Binding__Group__7__Impl
	rule__Binding__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Binding__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBindingAccess().getInStatesParserRuleCall_7()); }
	(ruleInStates)?
	{ after(grammarAccess.getBindingAccess().getInStatesParserRuleCall_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Binding__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Binding__Group__8__Impl
	rule__Binding__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Binding__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBindingAccess().getPropertiesBlockParserRuleCall_8()); }
	(rulePropertiesBlock)?
	{ after(grammarAccess.getBindingAccess().getPropertiesBlockParserRuleCall_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Binding__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Binding__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Binding__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBindingAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getBindingAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__UseProps__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UseProps__Group__0__Impl
	rule__UseProps__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UseProps__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUsePropsAccess().getUseKeyword_0()); }
	'use'
	{ after(grammarAccess.getUsePropsAccess().getUseKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UseProps__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UseProps__Group__1__Impl
	rule__UseProps__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__UseProps__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUsePropsAccess().getPropertiesKeyword_1()); }
	'properties'
	{ after(grammarAccess.getUsePropsAccess().getPropertiesKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UseProps__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UseProps__Group__2__Impl
	rule__UseProps__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__UseProps__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUsePropsAccess().getUsePropertiesAssignment_2()); }
	(rule__UseProps__UsePropertiesAssignment_2)
	{ after(grammarAccess.getUsePropsAccess().getUsePropertiesAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UseProps__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UseProps__Group__3__Impl
	rule__UseProps__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__UseProps__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUsePropsAccess().getGroup_3()); }
	(rule__UseProps__Group_3__0)*
	{ after(grammarAccess.getUsePropsAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UseProps__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UseProps__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UseProps__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUsePropsAccess().getSemicolonKeyword_4()); }
	';'
	{ after(grammarAccess.getUsePropsAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__UseProps__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UseProps__Group_3__0__Impl
	rule__UseProps__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UseProps__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUsePropsAccess().getCommaKeyword_3_0()); }
	','
	{ after(grammarAccess.getUsePropsAccess().getCommaKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UseProps__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UseProps__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UseProps__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUsePropsAccess().getUsePropertiesAssignment_3_1()); }
	(rule__UseProps__UsePropertiesAssignment_3_1)
	{ after(grammarAccess.getUsePropsAccess().getUsePropertiesAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InStates__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InStates__Group__0__Impl
	rule__InStates__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InStates__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInStatesAccess().getWhenKeyword_0()); }
	'when'
	{ after(grammarAccess.getInStatesAccess().getWhenKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InStates__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InStates__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InStates__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInStatesAccess().getInStatesAssignment_1()); }
	(rule__InStates__InStatesAssignment_1)
	{ after(grammarAccess.getInStatesAccess().getInStatesAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EndToEndFlow__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EndToEndFlow__Group__0__Impl
	rule__EndToEndFlow__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EndToEndFlow__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEndToEndFlowAccess().getNameAssignment_0()); }
	(rule__EndToEndFlow__NameAssignment_0)
	{ after(grammarAccess.getEndToEndFlowAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EndToEndFlow__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EndToEndFlow__Group__1__Impl
	rule__EndToEndFlow__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EndToEndFlow__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEndToEndFlowAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getEndToEndFlowAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EndToEndFlow__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EndToEndFlow__Group__2__Impl
	rule__EndToEndFlow__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EndToEndFlow__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEndToEndFlowAccess().getEndToEndFLowKeywordsParserRuleCall_2()); }
	ruleEndToEndFLowKeywords
	{ after(grammarAccess.getEndToEndFlowAccess().getEndToEndFLowKeywordsParserRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EndToEndFlow__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EndToEndFlow__Group__3__Impl
	rule__EndToEndFlow__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__EndToEndFlow__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEndToEndFlowAccess().getElementsAssignment_3()); }
	(rule__EndToEndFlow__ElementsAssignment_3)
	{ after(grammarAccess.getEndToEndFlowAccess().getElementsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EndToEndFlow__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EndToEndFlow__Group__4__Impl
	rule__EndToEndFlow__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__EndToEndFlow__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getEndToEndFlowAccess().getGroup_4()); }
		(rule__EndToEndFlow__Group_4__0)
		{ after(grammarAccess.getEndToEndFlowAccess().getGroup_4()); }
	)
	(
		{ before(grammarAccess.getEndToEndFlowAccess().getGroup_4()); }
		(rule__EndToEndFlow__Group_4__0)*
		{ after(grammarAccess.getEndToEndFlowAccess().getGroup_4()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EndToEndFlow__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EndToEndFlow__Group__5__Impl
	rule__EndToEndFlow__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__EndToEndFlow__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEndToEndFlowAccess().getPropertiesBlockParserRuleCall_5()); }
	(rulePropertiesBlock)?
	{ after(grammarAccess.getEndToEndFlowAccess().getPropertiesBlockParserRuleCall_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EndToEndFlow__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EndToEndFlow__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EndToEndFlow__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEndToEndFlowAccess().getSemicolonKeyword_6()); }
	';'
	{ after(grammarAccess.getEndToEndFlowAccess().getSemicolonKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EndToEndFlow__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EndToEndFlow__Group_4__0__Impl
	rule__EndToEndFlow__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EndToEndFlow__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEndToEndFlowAccess().getHyphenMinusGreaterThanSignKeyword_4_0()); }
	'->'
	{ after(grammarAccess.getEndToEndFlowAccess().getHyphenMinusGreaterThanSignKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EndToEndFlow__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EndToEndFlow__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EndToEndFlow__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEndToEndFlowAccess().getElementsAssignment_4_1()); }
	(rule__EndToEndFlow__ElementsAssignment_4_1)
	{ after(grammarAccess.getEndToEndFlowAccess().getElementsAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PathElement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PathElement__Group__0__Impl
	rule__PathElement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PathElement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPathElementAccess().getElementAssignment_0()); }
	(rule__PathElement__ElementAssignment_0)
	{ after(grammarAccess.getPathElementAccess().getElementAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PathElement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PathElement__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PathElement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPathElementAccess().getGroup_1()); }
	(rule__PathElement__Group_1__0)*
	{ after(grammarAccess.getPathElementAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PathElement__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PathElement__Group_1__0__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PathElement__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPathElementAccess().getGroup_1_0()); }
	(rule__PathElement__Group_1_0__0)
	{ after(grammarAccess.getPathElementAccess().getGroup_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PathElement__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PathElement__Group_1_0__0__Impl
	rule__PathElement__Group_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PathElement__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPathElementAccess().getPathElementContextAction_1_0_0()); }
	()
	{ after(grammarAccess.getPathElementAccess().getPathElementContextAction_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PathElement__Group_1_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PathElement__Group_1_0__1__Impl
	rule__PathElement__Group_1_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PathElement__Group_1_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPathElementAccess().getFullStopKeyword_1_0_1()); }
	'.'
	{ after(grammarAccess.getPathElementAccess().getFullStopKeyword_1_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PathElement__Group_1_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PathElement__Group_1_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PathElement__Group_1_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPathElementAccess().getElementAssignment_1_0_2()); }
	(rule__PathElement__ElementAssignment_1_0_2)
	{ after(grammarAccess.getPathElementAccess().getElementAssignment_1_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Import__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Import__Group__0__Impl
	rule__Import__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImportAccess().getImportKeyword_0()); }
	'import'
	{ after(grammarAccess.getImportAccess().getImportKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Import__Group__1__Impl
	rule__Import__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImportAccess().getAlternatives_1()); }
	(rule__Import__Alternatives_1)
	{ after(grammarAccess.getImportAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Import__Group__2__Impl
	rule__Import__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImportAccess().getGroup_2()); }
	(rule__Import__Group_2__0)?
	{ after(grammarAccess.getImportAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Import__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImportAccess().getSemicolonKeyword_3()); }
	';'
	{ after(grammarAccess.getImportAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Import__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Import__Group_2__0__Impl
	rule__Import__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImportAccess().getAsKeyword_2_0()); }
	'as'
	{ after(grammarAccess.getImportAccess().getAsKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Import__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImportAccess().getAliasAssignment_2_1()); }
	(rule__Import__AliasAssignment_2_1)
	{ after(grammarAccess.getImportAccess().getAliasAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ClassifierAssignment__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClassifierAssignment__Group__0__Impl
	rule__ClassifierAssignment__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierAssignment__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClassifierAssignmentAccess().getTargetAssignment_0()); }
	(rule__ClassifierAssignment__TargetAssignment_0)
	{ after(grammarAccess.getClassifierAssignmentAccess().getTargetAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierAssignment__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClassifierAssignment__Group__1__Impl
	rule__ClassifierAssignment__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierAssignment__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClassifierAssignmentAccess().getEqualsSignGreaterThanSignKeyword_1()); }
	'=>'
	{ after(grammarAccess.getClassifierAssignmentAccess().getEqualsSignGreaterThanSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierAssignment__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClassifierAssignment__Group__2__Impl
	rule__ClassifierAssignment__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierAssignment__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClassifierAssignmentAccess().getAlternatives_2()); }
	(rule__ClassifierAssignment__Alternatives_2)
	{ after(grammarAccess.getClassifierAssignmentAccess().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierAssignment__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClassifierAssignment__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierAssignment__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClassifierAssignmentAccess().getSemicolonKeyword_3()); }
	';'
	{ after(grammarAccess.getClassifierAssignmentAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ClassifierAssignment__Group_2_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClassifierAssignment__Group_2_0__0__Impl
	rule__ClassifierAssignment__Group_2_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierAssignment__Group_2_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClassifierAssignmentAccess().getAssignedClassifiersAssignment_2_0_0()); }
	(rule__ClassifierAssignment__AssignedClassifiersAssignment_2_0_0)
	{ after(grammarAccess.getClassifierAssignmentAccess().getAssignedClassifiersAssignment_2_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierAssignment__Group_2_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClassifierAssignment__Group_2_0__1__Impl
	rule__ClassifierAssignment__Group_2_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierAssignment__Group_2_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClassifierAssignmentAccess().getGroup_2_0_1()); }
	(rule__ClassifierAssignment__Group_2_0_1__0)*
	{ after(grammarAccess.getClassifierAssignmentAccess().getGroup_2_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierAssignment__Group_2_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClassifierAssignment__Group_2_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierAssignment__Group_2_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClassifierAssignmentAccess().getCurlyConfigurationElementBlockParserRuleCall_2_0_2()); }
	(ruleCurlyConfigurationElementBlock)?
	{ after(grammarAccess.getClassifierAssignmentAccess().getCurlyConfigurationElementBlockParserRuleCall_2_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ClassifierAssignment__Group_2_0_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClassifierAssignment__Group_2_0_1__0__Impl
	rule__ClassifierAssignment__Group_2_0_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierAssignment__Group_2_0_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClassifierAssignmentAccess().getCommaKeyword_2_0_1_0()); }
	','
	{ after(grammarAccess.getClassifierAssignmentAccess().getCommaKeyword_2_0_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierAssignment__Group_2_0_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClassifierAssignment__Group_2_0_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierAssignment__Group_2_0_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClassifierAssignmentAccess().getAssignedClassifiersAssignment_2_0_1_1()); }
	(rule__ClassifierAssignment__AssignedClassifiersAssignment_2_0_1_1)
	{ after(grammarAccess.getClassifierAssignmentAccess().getAssignedClassifiersAssignment_2_0_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ClassifierAssignmentPattern__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClassifierAssignmentPattern__Group__0__Impl
	rule__ClassifierAssignmentPattern__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierAssignmentPattern__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClassifierAssignmentPatternAccess().getQueryExpressionParserRuleCall_0()); }
	ruleQueryExpression
	{ after(grammarAccess.getClassifierAssignmentPatternAccess().getQueryExpressionParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierAssignmentPattern__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClassifierAssignmentPattern__Group__1__Impl
	rule__ClassifierAssignmentPattern__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierAssignmentPattern__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClassifierAssignmentPatternAccess().getEqualsSignGreaterThanSignKeyword_1()); }
	'=>'
	{ after(grammarAccess.getClassifierAssignmentPatternAccess().getEqualsSignGreaterThanSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierAssignmentPattern__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClassifierAssignmentPattern__Group__2__Impl
	rule__ClassifierAssignmentPattern__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierAssignmentPattern__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClassifierAssignmentPatternAccess().getAlternatives_2()); }
	(rule__ClassifierAssignmentPattern__Alternatives_2)
	{ after(grammarAccess.getClassifierAssignmentPatternAccess().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierAssignmentPattern__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClassifierAssignmentPattern__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierAssignmentPattern__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClassifierAssignmentPatternAccess().getSemicolonKeyword_3()); }
	';'
	{ after(grammarAccess.getClassifierAssignmentPatternAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ClassifierAssignmentPattern__Group_2_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClassifierAssignmentPattern__Group_2_0__0__Impl
	rule__ClassifierAssignmentPattern__Group_2_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierAssignmentPattern__Group_2_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClassifierAssignmentPatternAccess().getAssignedClassifiersAssignment_2_0_0()); }
	(rule__ClassifierAssignmentPattern__AssignedClassifiersAssignment_2_0_0)
	{ after(grammarAccess.getClassifierAssignmentPatternAccess().getAssignedClassifiersAssignment_2_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierAssignmentPattern__Group_2_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClassifierAssignmentPattern__Group_2_0__1__Impl
	rule__ClassifierAssignmentPattern__Group_2_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierAssignmentPattern__Group_2_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClassifierAssignmentPatternAccess().getGroup_2_0_1()); }
	(rule__ClassifierAssignmentPattern__Group_2_0_1__0)*
	{ after(grammarAccess.getClassifierAssignmentPatternAccess().getGroup_2_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierAssignmentPattern__Group_2_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClassifierAssignmentPattern__Group_2_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierAssignmentPattern__Group_2_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClassifierAssignmentPatternAccess().getCurlyConfigurationElementBlockParserRuleCall_2_0_2()); }
	(ruleCurlyConfigurationElementBlock)?
	{ after(grammarAccess.getClassifierAssignmentPatternAccess().getCurlyConfigurationElementBlockParserRuleCall_2_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ClassifierAssignmentPattern__Group_2_0_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClassifierAssignmentPattern__Group_2_0_1__0__Impl
	rule__ClassifierAssignmentPattern__Group_2_0_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierAssignmentPattern__Group_2_0_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClassifierAssignmentPatternAccess().getCommaKeyword_2_0_1_0()); }
	','
	{ after(grammarAccess.getClassifierAssignmentPatternAccess().getCommaKeyword_2_0_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierAssignmentPattern__Group_2_0_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClassifierAssignmentPattern__Group_2_0_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierAssignmentPattern__Group_2_0_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClassifierAssignmentPatternAccess().getAssignedClassifiersAssignment_2_0_1_1()); }
	(rule__ClassifierAssignmentPattern__AssignedClassifiersAssignment_2_0_1_1)
	{ after(grammarAccess.getClassifierAssignmentPatternAccess().getAssignedClassifiersAssignment_2_0_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QueryExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QueryExpression__Group__0__Impl
	rule__QueryExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQueryExpressionAccess().getAllKeyword_0()); }
	'all'
	{ after(grammarAccess.getQueryExpressionAccess().getAllKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QueryExpression__Group__1__Impl
	rule__QueryExpression__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQueryExpressionAccess().getLeftParenthesisKeyword_1()); }
	'('
	{ after(grammarAccess.getQueryExpressionAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryExpression__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QueryExpression__Group__2__Impl
	rule__QueryExpression__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryExpression__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQueryExpressionAccess().getTargetPatternAssignment_2()); }
	(rule__QueryExpression__TargetPatternAssignment_2)
	{ after(grammarAccess.getQueryExpressionAccess().getTargetPatternAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryExpression__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QueryExpression__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryExpression__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQueryExpressionAccess().getRightParenthesisKeyword_3()); }
	')'
	{ after(grammarAccess.getQueryExpressionAccess().getRightParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FlowAssignment__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FlowAssignment__Group__0__Impl
	rule__FlowAssignment__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowAssignment__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlowAssignmentAccess().getTargetAssignment_0()); }
	(rule__FlowAssignment__TargetAssignment_0)
	{ after(grammarAccess.getFlowAssignmentAccess().getTargetAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowAssignment__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FlowAssignment__Group__1__Impl
	rule__FlowAssignment__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowAssignment__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlowAssignmentAccess().getEqualsSignGreaterThanSignKeyword_1()); }
	'=>'
	{ after(grammarAccess.getFlowAssignmentAccess().getEqualsSignGreaterThanSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowAssignment__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FlowAssignment__Group__2__Impl
	rule__FlowAssignment__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowAssignment__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlowAssignmentAccess().getFlowKeyword_2()); }
	'flow'
	{ after(grammarAccess.getFlowAssignmentAccess().getFlowKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowAssignment__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FlowAssignment__Group__3__Impl
	rule__FlowAssignment__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowAssignment__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlowAssignmentAccess().getElementsAssignment_3()); }
	(rule__FlowAssignment__ElementsAssignment_3)
	{ after(grammarAccess.getFlowAssignmentAccess().getElementsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowAssignment__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FlowAssignment__Group__4__Impl
	rule__FlowAssignment__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowAssignment__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlowAssignmentAccess().getGroup_4()); }
	(rule__FlowAssignment__Group_4__0)*
	{ after(grammarAccess.getFlowAssignmentAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowAssignment__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FlowAssignment__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowAssignment__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlowAssignmentAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getFlowAssignmentAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FlowAssignment__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FlowAssignment__Group_4__0__Impl
	rule__FlowAssignment__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowAssignment__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlowAssignmentAccess().getHyphenMinusGreaterThanSignKeyword_4_0()); }
	'->'
	{ after(grammarAccess.getFlowAssignmentAccess().getHyphenMinusGreaterThanSignKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowAssignment__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FlowAssignment__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowAssignment__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlowAssignmentAccess().getElementsAssignment_4_1()); }
	(rule__FlowAssignment__ElementsAssignment_4_1)
	{ after(grammarAccess.getFlowAssignmentAccess().getElementsAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ConfigurationElementBlock__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfigurationElementBlock__Group__0__Impl
	rule__ConfigurationElementBlock__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationElementBlock__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigurationElementBlockAccess().getIsKeyword_0()); }
	'is'
	{ after(grammarAccess.getConfigurationElementBlockAccess().getIsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationElementBlock__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfigurationElementBlock__Group__1__Impl
	rule__ConfigurationElementBlock__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationElementBlock__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigurationElementBlockAccess().getConfigurationElementParserRuleCall_1()); }
	(ruleConfigurationElement)*
	{ after(grammarAccess.getConfigurationElementBlockAccess().getConfigurationElementParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationElementBlock__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfigurationElementBlock__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationElementBlock__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigurationElementBlockAccess().getEndKeyword_2()); }
	'end'
	{ after(grammarAccess.getConfigurationElementBlockAccess().getEndKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CurlyConfigurationElementBlock__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CurlyConfigurationElementBlock__Group__0__Impl
	rule__CurlyConfigurationElementBlock__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CurlyConfigurationElementBlock__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCurlyConfigurationElementBlockAccess().getLeftCurlyBracketKeyword_0()); }
	'{'
	{ after(grammarAccess.getCurlyConfigurationElementBlockAccess().getLeftCurlyBracketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CurlyConfigurationElementBlock__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CurlyConfigurationElementBlock__Group__1__Impl
	rule__CurlyConfigurationElementBlock__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CurlyConfigurationElementBlock__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getCurlyConfigurationElementBlockAccess().getConfigurationElementParserRuleCall_1()); }
		(ruleConfigurationElement)
		{ after(grammarAccess.getCurlyConfigurationElementBlockAccess().getConfigurationElementParserRuleCall_1()); }
	)
	(
		{ before(grammarAccess.getCurlyConfigurationElementBlockAccess().getConfigurationElementParserRuleCall_1()); }
		(ruleConfigurationElement)*
		{ after(grammarAccess.getCurlyConfigurationElementBlockAccess().getConfigurationElementParserRuleCall_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CurlyConfigurationElementBlock__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CurlyConfigurationElementBlock__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CurlyConfigurationElementBlock__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCurlyConfigurationElementBlockAccess().getRightCurlyBracketKeyword_2()); }
	'}'
	{ after(grammarAccess.getCurlyConfigurationElementBlockAccess().getRightCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Parameters__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Parameters__Group__0__Impl
	rule__Parameters__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameters__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParametersAccess().getParameterizedAssignment_0()); }
	(rule__Parameters__ParameterizedAssignment_0)
	{ after(grammarAccess.getParametersAccess().getParameterizedAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameters__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Parameters__Group__1__Impl
	rule__Parameters__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameters__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParametersAccess().getGroup_1()); }
	(rule__Parameters__Group_1__0)?
	{ after(grammarAccess.getParametersAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameters__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Parameters__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameters__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParametersAccess().getRightParenthesisKeyword_2()); }
	')'
	{ after(grammarAccess.getParametersAccess().getRightParenthesisKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Parameters__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Parameters__Group_1__0__Impl
	rule__Parameters__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameters__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParametersAccess().getParametersAssignment_1_0()); }
	(rule__Parameters__ParametersAssignment_1_0)
	{ after(grammarAccess.getParametersAccess().getParametersAssignment_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameters__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Parameters__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameters__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParametersAccess().getGroup_1_1()); }
	(rule__Parameters__Group_1_1__0)*
	{ after(grammarAccess.getParametersAccess().getGroup_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Parameters__Group_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Parameters__Group_1_1__0__Impl
	rule__Parameters__Group_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameters__Group_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParametersAccess().getCommaKeyword_1_1_0()); }
	','
	{ after(grammarAccess.getParametersAccess().getCommaKeyword_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameters__Group_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Parameters__Group_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameters__Group_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParametersAccess().getParametersAssignment_1_1_1()); }
	(rule__Parameters__ParametersAssignment_1_1_1)
	{ after(grammarAccess.getParametersAccess().getParametersAssignment_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ConfigurationParameter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfigurationParameter__Group__0__Impl
	rule__ConfigurationParameter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationParameter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigurationParameterAccess().getNameAssignment_0()); }
	(rule__ConfigurationParameter__NameAssignment_0)
	{ after(grammarAccess.getConfigurationParameterAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationParameter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfigurationParameter__Group__1__Impl
	rule__ConfigurationParameter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationParameter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigurationParameterAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getConfigurationParameterAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationParameter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfigurationParameter__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationParameter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigurationParameterAccess().getTypeAssignment_2()); }
	(rule__ConfigurationParameter__TypeAssignment_2)
	{ after(grammarAccess.getConfigurationParameterAccess().getTypeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ReversableInterfaceReference__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReversableInterfaceReference__Group__0__Impl
	rule__ReversableInterfaceReference__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ReversableInterfaceReference__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReversableInterfaceReferenceAccess().getReverseAssignment_0()); }
	(rule__ReversableInterfaceReference__ReverseAssignment_0)?
	{ after(grammarAccess.getReversableInterfaceReferenceAccess().getReverseAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReversableInterfaceReference__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReversableInterfaceReference__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ReversableInterfaceReference__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReversableInterfaceReferenceAccess().getTypeAssignment_1()); }
	(rule__ReversableInterfaceReference__TypeAssignment_1)
	{ after(grammarAccess.getReversableInterfaceReferenceAccess().getTypeAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ReversableTypeReference__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReversableTypeReference__Group__0__Impl
	rule__ReversableTypeReference__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ReversableTypeReference__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReversableTypeReferenceAccess().getReverseAssignment_0()); }
	(rule__ReversableTypeReference__ReverseAssignment_0)?
	{ after(grammarAccess.getReversableTypeReferenceAccess().getReverseAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReversableTypeReference__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReversableTypeReference__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ReversableTypeReference__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReversableTypeReferenceAccess().getTypeAssignment_1()); }
	(rule__ReversableTypeReference__TypeAssignment_1)
	{ after(grammarAccess.getReversableTypeReferenceAccess().getTypeAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ClassifierOrTypeReference__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClassifierOrTypeReference__Group__0__Impl
	rule__ClassifierOrTypeReference__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierOrTypeReference__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClassifierOrTypeReferenceAccess().getTypeAssignment_0()); }
	(rule__ClassifierOrTypeReference__TypeAssignment_0)
	{ after(grammarAccess.getClassifierOrTypeReferenceAccess().getTypeAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierOrTypeReference__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClassifierOrTypeReference__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierOrTypeReference__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClassifierOrTypeReferenceAccess().getConfigurationActualsParserRuleCall_1()); }
	(ruleConfigurationActuals)?
	{ after(grammarAccess.getClassifierOrTypeReferenceAccess().getConfigurationActualsParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EnumerationType__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumerationType__Group__0__Impl
	rule__EnumerationType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationType__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationTypeAccess().getEnumerationTypeAction_0()); }
	()
	{ after(grammarAccess.getEnumerationTypeAccess().getEnumerationTypeAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationType__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumerationType__Group__1__Impl
	rule__EnumerationType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationType__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationTypeAccess().getEnumKeyword_1()); }
	'enum'
	{ after(grammarAccess.getEnumerationTypeAccess().getEnumKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationType__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumerationType__Group__2__Impl
	rule__EnumerationType__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationType__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationTypeAccess().getLeftParenthesisKeyword_2()); }
	'('
	{ after(grammarAccess.getEnumerationTypeAccess().getLeftParenthesisKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationType__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumerationType__Group__3__Impl
	rule__EnumerationType__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationType__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationTypeAccess().getLiteralsAssignment_3()); }
	(rule__EnumerationType__LiteralsAssignment_3)*
	{ after(grammarAccess.getEnumerationTypeAccess().getLiteralsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationType__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumerationType__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationType__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationTypeAccess().getRightParenthesisKeyword_4()); }
	')'
	{ after(grammarAccess.getEnumerationTypeAccess().getRightParenthesisKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CompositeType__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CompositeType__Group__0__Impl
	rule__CompositeType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeType__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCompositeTypeAccess().getCompositeTypeAssignment_0()); }
	(rule__CompositeType__CompositeTypeAssignment_0)
	{ after(grammarAccess.getCompositeTypeAccess().getCompositeTypeAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeType__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CompositeType__Group__1__Impl
	rule__CompositeType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeType__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCompositeTypeAccess().getOfKeyword_1()); }
	'of'
	{ after(grammarAccess.getCompositeTypeAccess().getOfKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeType__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CompositeType__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeType__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCompositeTypeAccess().getTypeAssignment_2()); }
	(rule__CompositeType__TypeAssignment_2)
	{ after(grammarAccess.getCompositeTypeAccess().getTypeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DefaultAnnexSubclause__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefaultAnnexSubclause__Group__0__Impl
	rule__DefaultAnnexSubclause__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DefaultAnnexSubclause__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefaultAnnexSubclauseAccess().getCommercialAtKeyword_0()); }
	'@'
	{ after(grammarAccess.getDefaultAnnexSubclauseAccess().getCommercialAtKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefaultAnnexSubclause__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefaultAnnexSubclause__Group__1__Impl
	rule__DefaultAnnexSubclause__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DefaultAnnexSubclause__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefaultAnnexSubclauseAccess().getNameAssignment_1()); }
	(rule__DefaultAnnexSubclause__NameAssignment_1)
	{ after(grammarAccess.getDefaultAnnexSubclauseAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefaultAnnexSubclause__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefaultAnnexSubclause__Group__2__Impl
	rule__DefaultAnnexSubclause__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DefaultAnnexSubclause__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefaultAnnexSubclauseAccess().getBodyAssignment_2()); }
	(rule__DefaultAnnexSubclause__BodyAssignment_2)
	{ after(grammarAccess.getDefaultAnnexSubclauseAccess().getBodyAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefaultAnnexSubclause__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefaultAnnexSubclause__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DefaultAnnexSubclause__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefaultAnnexSubclauseAccess().getSemicolonKeyword_3()); }
	';'
	{ after(grammarAccess.getDefaultAnnexSubclauseAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PropertiesBlock__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertiesBlock__Group__0__Impl
	rule__PropertiesBlock__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertiesBlock__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertiesBlockAccess().getLeftCurlyBracketKeyword_0()); }
	'{'
	{ after(grammarAccess.getPropertiesBlockAccess().getLeftCurlyBracketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertiesBlock__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertiesBlock__Group__1__Impl
	rule__PropertiesBlock__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertiesBlock__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getPropertiesBlockAccess().getOwnedPropertyAssociationsAssignment_1()); }
		(rule__PropertiesBlock__OwnedPropertyAssociationsAssignment_1)
		{ after(grammarAccess.getPropertiesBlockAccess().getOwnedPropertyAssociationsAssignment_1()); }
	)
	(
		{ before(grammarAccess.getPropertiesBlockAccess().getOwnedPropertyAssociationsAssignment_1()); }
		(rule__PropertiesBlock__OwnedPropertyAssociationsAssignment_1)*
		{ after(grammarAccess.getPropertiesBlockAccess().getOwnedPropertyAssociationsAssignment_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertiesBlock__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertiesBlock__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertiesBlock__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertiesBlockAccess().getRightCurlyBracketKeyword_2()); }
	'}'
	{ after(grammarAccess.getPropertiesBlockAccess().getRightCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NestedComponentImplementationBlock__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedComponentImplementationBlock__Group__0__Impl
	rule__NestedComponentImplementationBlock__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedComponentImplementationBlock__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedComponentImplementationBlockAccess().getLeftCurlyBracketKeyword_0()); }
	'{'
	{ after(grammarAccess.getNestedComponentImplementationBlockAccess().getLeftCurlyBracketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedComponentImplementationBlock__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedComponentImplementationBlock__Group__1__Impl
	rule__NestedComponentImplementationBlock__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedComponentImplementationBlock__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getNestedComponentImplementationBlockAccess().getNestedImplementationElementParserRuleCall_1()); }
		(ruleNestedImplementationElement)
		{ after(grammarAccess.getNestedComponentImplementationBlockAccess().getNestedImplementationElementParserRuleCall_1()); }
	)
	(
		{ before(grammarAccess.getNestedComponentImplementationBlockAccess().getNestedImplementationElementParserRuleCall_1()); }
		(ruleNestedImplementationElement)*
		{ after(grammarAccess.getNestedComponentImplementationBlockAccess().getNestedImplementationElementParserRuleCall_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedComponentImplementationBlock__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedComponentImplementationBlock__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedComponentImplementationBlock__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedComponentImplementationBlockAccess().getRightCurlyBracketKeyword_2()); }
	'}'
	{ after(grammarAccess.getNestedComponentImplementationBlockAccess().getRightCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ConfigurationExtensions__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfigurationExtensions__Group__0__Impl
	rule__ConfigurationExtensions__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationExtensions__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigurationExtensionsAccess().getSuperClassifiersAssignment_0()); }
	(rule__ConfigurationExtensions__SuperClassifiersAssignment_0)
	{ after(grammarAccess.getConfigurationExtensionsAccess().getSuperClassifiersAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationExtensions__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfigurationExtensions__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationExtensions__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigurationExtensionsAccess().getGroup_1()); }
	(rule__ConfigurationExtensions__Group_1__0)*
	{ after(grammarAccess.getConfigurationExtensionsAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ConfigurationExtensions__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfigurationExtensions__Group_1__0__Impl
	rule__ConfigurationExtensions__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationExtensions__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigurationExtensionsAccess().getCommaKeyword_1_0()); }
	','
	{ after(grammarAccess.getConfigurationExtensionsAccess().getCommaKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationExtensions__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfigurationExtensions__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationExtensions__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigurationExtensionsAccess().getSuperClassifiersAssignment_1_1()); }
	(rule__ConfigurationExtensions__SuperClassifiersAssignment_1_1)
	{ after(grammarAccess.getConfigurationExtensionsAccess().getSuperClassifiersAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ImplementationExtensions__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImplementationExtensions__Group__0__Impl
	rule__ImplementationExtensions__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplementationExtensions__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImplementationExtensionsAccess().getSuperClassifiersAssignment_0()); }
	(rule__ImplementationExtensions__SuperClassifiersAssignment_0)
	{ after(grammarAccess.getImplementationExtensionsAccess().getSuperClassifiersAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplementationExtensions__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImplementationExtensions__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplementationExtensions__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImplementationExtensionsAccess().getGroup_1()); }
	(rule__ImplementationExtensions__Group_1__0)*
	{ after(grammarAccess.getImplementationExtensionsAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ImplementationExtensions__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImplementationExtensions__Group_1__0__Impl
	rule__ImplementationExtensions__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplementationExtensions__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImplementationExtensionsAccess().getCommaKeyword_1_0()); }
	','
	{ after(grammarAccess.getImplementationExtensionsAccess().getCommaKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplementationExtensions__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImplementationExtensions__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplementationExtensions__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImplementationExtensionsAccess().getSuperClassifiersAssignment_1_1()); }
	(rule__ImplementationExtensions__SuperClassifiersAssignment_1_1)
	{ after(grammarAccess.getImplementationExtensionsAccess().getSuperClassifiersAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InterfaceExtensions__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InterfaceExtensions__Group__0__Impl
	rule__InterfaceExtensions__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InterfaceExtensions__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInterfaceExtensionsAccess().getSuperClassifiersAssignment_0()); }
	(rule__InterfaceExtensions__SuperClassifiersAssignment_0)
	{ after(grammarAccess.getInterfaceExtensionsAccess().getSuperClassifiersAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InterfaceExtensions__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InterfaceExtensions__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InterfaceExtensions__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInterfaceExtensionsAccess().getGroup_1()); }
	(rule__InterfaceExtensions__Group_1__0)*
	{ after(grammarAccess.getInterfaceExtensionsAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InterfaceExtensions__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InterfaceExtensions__Group_1__0__Impl
	rule__InterfaceExtensions__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InterfaceExtensions__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInterfaceExtensionsAccess().getCommaKeyword_1_0()); }
	','
	{ after(grammarAccess.getInterfaceExtensionsAccess().getCommaKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InterfaceExtensions__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InterfaceExtensions__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InterfaceExtensions__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInterfaceExtensionsAccess().getSuperClassifiersAssignment_1_1()); }
	(rule__InterfaceExtensions__SuperClassifiersAssignment_1_1)
	{ after(grammarAccess.getInterfaceExtensionsAccess().getSuperClassifiersAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ConfigurationActuals__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfigurationActuals__Group__0__Impl
	rule__ConfigurationActuals__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationActuals__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigurationActualsAccess().getLeftParenthesisKeyword_0()); }
	'('
	{ after(grammarAccess.getConfigurationActualsAccess().getLeftParenthesisKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationActuals__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfigurationActuals__Group__1__Impl
	rule__ConfigurationActuals__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationActuals__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigurationActualsAccess().getGroup_1()); }
	(rule__ConfigurationActuals__Group_1__0)?
	{ after(grammarAccess.getConfigurationActualsAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationActuals__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfigurationActuals__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationActuals__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigurationActualsAccess().getRightParenthesisKeyword_2()); }
	')'
	{ after(grammarAccess.getConfigurationActualsAccess().getRightParenthesisKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ConfigurationActuals__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfigurationActuals__Group_1__0__Impl
	rule__ConfigurationActuals__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationActuals__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigurationActualsAccess().getActualsAssignment_1_0()); }
	(rule__ConfigurationActuals__ActualsAssignment_1_0)
	{ after(grammarAccess.getConfigurationActualsAccess().getActualsAssignment_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationActuals__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfigurationActuals__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationActuals__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigurationActualsAccess().getGroup_1_1()); }
	(rule__ConfigurationActuals__Group_1_1__0)*
	{ after(grammarAccess.getConfigurationActualsAccess().getGroup_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ConfigurationActuals__Group_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfigurationActuals__Group_1_1__0__Impl
	rule__ConfigurationActuals__Group_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationActuals__Group_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigurationActualsAccess().getCommaKeyword_1_1_0()); }
	','
	{ after(grammarAccess.getConfigurationActualsAccess().getCommaKeyword_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationActuals__Group_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfigurationActuals__Group_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationActuals__Group_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigurationActualsAccess().getActualsAssignment_1_1_1()); }
	(rule__ConfigurationActuals__ActualsAssignment_1_1_1)
	{ after(grammarAccess.getConfigurationActualsAccess().getActualsAssignment_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ConfigurationActual__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfigurationActual__Group__0__Impl
	rule__ConfigurationActual__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationActual__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigurationActualAccess().getParameterAssignment_0()); }
	(rule__ConfigurationActual__ParameterAssignment_0)
	{ after(grammarAccess.getConfigurationActualAccess().getParameterAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationActual__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfigurationActual__Group__1__Impl
	rule__ConfigurationActual__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationActual__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigurationActualAccess().getEqualsSignGreaterThanSignKeyword_1()); }
	'=>'
	{ after(grammarAccess.getConfigurationActualAccess().getEqualsSignGreaterThanSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationActual__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfigurationActual__Group__2__Impl
	rule__ConfigurationActual__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationActual__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigurationActualAccess().getAssignedClassifiersAssignment_2()); }
	(rule__ConfigurationActual__AssignedClassifiersAssignment_2)
	{ after(grammarAccess.getConfigurationActualAccess().getAssignedClassifiersAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationActual__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfigurationActual__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationActual__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigurationActualAccess().getGroup_3()); }
	(rule__ConfigurationActual__Group_3__0)*
	{ after(grammarAccess.getConfigurationActualAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ConfigurationActual__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfigurationActual__Group_3__0__Impl
	rule__ConfigurationActual__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationActual__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigurationActualAccess().getCommaKeyword_3_0()); }
	','
	{ after(grammarAccess.getConfigurationActualAccess().getCommaKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationActual__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfigurationActual__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationActual__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigurationActualAccess().getAssignedClassifiersAssignment_3_1()); }
	(rule__ConfigurationActual__AssignedClassifiersAssignment_3_1)
	{ after(grammarAccess.getConfigurationActualAccess().getAssignedClassifiersAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Workingset__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Workingset__Group__0__Impl
	rule__Workingset__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Workingset__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorkingsetAccess().getPrivateAssignment_0()); }
	(rule__Workingset__PrivateAssignment_0)?
	{ after(grammarAccess.getWorkingsetAccess().getPrivateAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Workingset__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Workingset__Group__1__Impl
	rule__Workingset__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Workingset__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorkingsetAccess().getWorkingsetKeyword_1()); }
	'workingset'
	{ after(grammarAccess.getWorkingsetAccess().getWorkingsetKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Workingset__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Workingset__Group__2__Impl
	rule__Workingset__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Workingset__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorkingsetAccess().getNameAssignment_2()); }
	(rule__Workingset__NameAssignment_2)
	{ after(grammarAccess.getWorkingsetAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Workingset__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Workingset__Group__3__Impl
	rule__Workingset__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Workingset__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorkingsetAccess().getIsKeyword_3()); }
	'is'
	{ after(grammarAccess.getWorkingsetAccess().getIsKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Workingset__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Workingset__Group__4__Impl
	rule__Workingset__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Workingset__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorkingsetAccess().getUsePropsParserRuleCall_4()); }
	(ruleUseProps)?
	{ after(grammarAccess.getWorkingsetAccess().getUsePropsParserRuleCall_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Workingset__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Workingset__Group__5__Impl
	rule__Workingset__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Workingset__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorkingsetAccess().getInstanceRootsAssignment_5()); }
	(rule__Workingset__InstanceRootsAssignment_5)*
	{ after(grammarAccess.getWorkingsetAccess().getInstanceRootsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Workingset__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Workingset__Group__6__Impl
	rule__Workingset__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Workingset__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorkingsetAccess().getEndKeyword_6()); }
	'end'
	{ after(grammarAccess.getWorkingsetAccess().getEndKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Workingset__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Workingset__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Workingset__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorkingsetAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getWorkingsetAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InstanceConfiguration__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InstanceConfiguration__Group__0__Impl
	rule__InstanceConfiguration__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InstanceConfiguration__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstanceConfigurationAccess().getInstanceConfigurationAction_0()); }
	()
	{ after(grammarAccess.getInstanceConfigurationAccess().getInstanceConfigurationAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InstanceConfiguration__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InstanceConfiguration__Group__1__Impl
	rule__InstanceConfiguration__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__InstanceConfiguration__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstanceConfigurationAccess().getNameAssignment_1()); }
	(rule__InstanceConfiguration__NameAssignment_1)
	{ after(grammarAccess.getInstanceConfigurationAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InstanceConfiguration__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InstanceConfiguration__Group__2__Impl
	rule__InstanceConfiguration__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__InstanceConfiguration__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstanceConfigurationAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getInstanceConfigurationAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InstanceConfiguration__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InstanceConfiguration__Group__3__Impl
	rule__InstanceConfiguration__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__InstanceConfiguration__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstanceConfigurationAccess().getCategoryAssignment_3()); }
	(rule__InstanceConfiguration__CategoryAssignment_3)
	{ after(grammarAccess.getInstanceConfigurationAccess().getCategoryAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InstanceConfiguration__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InstanceConfiguration__Group__4__Impl
	rule__InstanceConfiguration__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__InstanceConfiguration__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstanceConfigurationAccess().getTypeReferencesAssignment_4()); }
	(rule__InstanceConfiguration__TypeReferencesAssignment_4)
	{ after(grammarAccess.getInstanceConfigurationAccess().getTypeReferencesAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InstanceConfiguration__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InstanceConfiguration__Group__5__Impl
	rule__InstanceConfiguration__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__InstanceConfiguration__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstanceConfigurationAccess().getActionsAssignment_5()); }
	(rule__InstanceConfiguration__ActionsAssignment_5)*
	{ after(grammarAccess.getInstanceConfigurationAccess().getActionsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InstanceConfiguration__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InstanceConfiguration__Group__6__Impl
	rule__InstanceConfiguration__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__InstanceConfiguration__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstanceConfigurationAccess().getProductlineConstraintAssignment_6()); }
	(rule__InstanceConfiguration__ProductlineConstraintAssignment_6)?
	{ after(grammarAccess.getInstanceConfigurationAccess().getProductlineConstraintAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InstanceConfiguration__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InstanceConfiguration__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InstanceConfiguration__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstanceConfigurationAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getInstanceConfigurationAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ProductLineConstraint__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProductLineConstraint__Group__0__Impl
	rule__ProductLineConstraint__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductLineConstraint__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductLineConstraintAccess().getBinaryOperationAction_0()); }
	()
	{ after(grammarAccess.getProductLineConstraintAccess().getBinaryOperationAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductLineConstraint__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProductLineConstraint__Group__1__Impl
	rule__ProductLineConstraint__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductLineConstraint__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductLineConstraintAccess().getPlcKeyword_1()); }
	'plc'
	{ after(grammarAccess.getProductLineConstraintAccess().getPlcKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductLineConstraint__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProductLineConstraint__Group__2__Impl
	rule__ProductLineConstraint__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductLineConstraint__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductLineConstraintAccess().getLeftAssignment_2()); }
	(rule__ProductLineConstraint__LeftAssignment_2)
	{ after(grammarAccess.getProductLineConstraintAccess().getLeftAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductLineConstraint__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProductLineConstraint__Group__3__Impl
	rule__ProductLineConstraint__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductLineConstraint__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductLineConstraintAccess().getOperatorAssignment_3()); }
	(rule__ProductLineConstraint__OperatorAssignment_3)
	{ after(grammarAccess.getProductLineConstraintAccess().getOperatorAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductLineConstraint__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProductLineConstraint__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductLineConstraint__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductLineConstraintAccess().getRightAssignment_4()); }
	(rule__ProductLineConstraint__RightAssignment_4)
	{ after(grammarAccess.getProductLineConstraintAccess().getRightAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BehaviorAnnotationBlock__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BehaviorAnnotationBlock__Group__0__Impl
	rule__BehaviorAnnotationBlock__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BehaviorAnnotationBlock__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBehaviorAnnotationBlockAccess().getCommercialAtKeyword_0()); }
	'@'
	{ after(grammarAccess.getBehaviorAnnotationBlockAccess().getCommercialAtKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BehaviorAnnotationBlock__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BehaviorAnnotationBlock__Group__1__Impl
	rule__BehaviorAnnotationBlock__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__BehaviorAnnotationBlock__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBehaviorAnnotationBlockAccess().getNameAssignment_1()); }
	(rule__BehaviorAnnotationBlock__NameAssignment_1)
	{ after(grammarAccess.getBehaviorAnnotationBlockAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BehaviorAnnotationBlock__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BehaviorAnnotationBlock__Group__2__Impl
	rule__BehaviorAnnotationBlock__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__BehaviorAnnotationBlock__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBehaviorAnnotationBlockAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getBehaviorAnnotationBlockAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BehaviorAnnotationBlock__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BehaviorAnnotationBlock__Group__3__Impl
	rule__BehaviorAnnotationBlock__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__BehaviorAnnotationBlock__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBehaviorAnnotationBlockAccess().getBehaviorAnnotationElementsParserRuleCall_3()); }
	ruleBehaviorAnnotationElements
	{ after(grammarAccess.getBehaviorAnnotationBlockAccess().getBehaviorAnnotationElementsParserRuleCall_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BehaviorAnnotationBlock__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BehaviorAnnotationBlock__Group__4__Impl
	rule__BehaviorAnnotationBlock__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__BehaviorAnnotationBlock__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBehaviorAnnotationBlockAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getBehaviorAnnotationBlockAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BehaviorAnnotationBlock__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BehaviorAnnotationBlock__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BehaviorAnnotationBlock__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBehaviorAnnotationBlockAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getBehaviorAnnotationBlockAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StateVariable__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateVariable__Group__0__Impl
	rule__StateVariable__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StateVariable__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateVariableAccess().getAnnotationsAssignment_0()); }
	(rule__StateVariable__AnnotationsAssignment_0)*
	{ after(grammarAccess.getStateVariableAccess().getAnnotationsAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateVariable__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateVariable__Group__1__Impl
	rule__StateVariable__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__StateVariable__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateVariableAccess().getNameAssignment_1()); }
	(rule__StateVariable__NameAssignment_1)
	{ after(grammarAccess.getStateVariableAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateVariable__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateVariable__Group__2__Impl
	rule__StateVariable__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__StateVariable__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateVariableAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getStateVariableAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateVariable__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateVariable__Group__3__Impl
	rule__StateVariable__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__StateVariable__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateVariableAccess().getStateKeyword_3()); }
	'state'
	{ after(grammarAccess.getStateVariableAccess().getStateKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateVariable__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateVariable__Group__4__Impl
	rule__StateVariable__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__StateVariable__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateVariableAccess().getStateTypeAssignment_4()); }
	(rule__StateVariable__StateTypeAssignment_4)
	{ after(grammarAccess.getStateVariableAccess().getStateTypeAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateVariable__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateVariable__Group__5__Impl
	rule__StateVariable__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__StateVariable__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateVariableAccess().getGroup_5()); }
	(rule__StateVariable__Group_5__0)?
	{ after(grammarAccess.getStateVariableAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateVariable__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateVariable__Group__6__Impl
	rule__StateVariable__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__StateVariable__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateVariableAccess().getPropertiesBlockParserRuleCall_6()); }
	(rulePropertiesBlock)?
	{ after(grammarAccess.getStateVariableAccess().getPropertiesBlockParserRuleCall_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateVariable__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateVariable__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StateVariable__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateVariableAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getStateVariableAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StateVariable__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateVariable__Group_5__0__Impl
	rule__StateVariable__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StateVariable__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateVariableAccess().getEqualsSignKeyword_5_0()); }
	'='
	{ after(grammarAccess.getStateVariableAccess().getEqualsSignKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateVariable__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateVariable__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StateVariable__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateVariableAccess().getInitialStateAssignment_5_1()); }
	(rule__StateVariable__InitialStateAssignment_5_1)
	{ after(grammarAccess.getStateVariableAccess().getInitialStateAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Generator__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Generator__Group__0__Impl
	rule__Generator__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Generator__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGeneratorAccess().getAnnotationsAssignment_0()); }
	(rule__Generator__AnnotationsAssignment_0)*
	{ after(grammarAccess.getGeneratorAccess().getAnnotationsAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Generator__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Generator__Group__1__Impl
	rule__Generator__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Generator__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGeneratorAccess().getNameAssignment_1()); }
	(rule__Generator__NameAssignment_1)
	{ after(grammarAccess.getGeneratorAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Generator__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Generator__Group__2__Impl
	rule__Generator__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Generator__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGeneratorAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getGeneratorAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Generator__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Generator__Group__3__Impl
	rule__Generator__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Generator__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGeneratorAccess().getGeneratorKeyword_3()); }
	'generator'
	{ after(grammarAccess.getGeneratorAccess().getGeneratorKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Generator__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Generator__Group__4__Impl
	rule__Generator__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Generator__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGeneratorAccess().getValueAssignment_4()); }
	(rule__Generator__ValueAssignment_4)?
	{ after(grammarAccess.getGeneratorAccess().getValueAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Generator__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Generator__Group__5__Impl
	rule__Generator__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Generator__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGeneratorAccess().getInStatesParserRuleCall_5()); }
	(ruleInStates)?
	{ after(grammarAccess.getGeneratorAccess().getInStatesParserRuleCall_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Generator__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Generator__Group__6__Impl
	rule__Generator__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Generator__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGeneratorAccess().getPropertiesBlockParserRuleCall_6()); }
	(rulePropertiesBlock)?
	{ after(grammarAccess.getGeneratorAccess().getPropertiesBlockParserRuleCall_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Generator__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Generator__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Generator__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGeneratorAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getGeneratorAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StateTransition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateTransition__Group__0__Impl
	rule__StateTransition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StateTransition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateTransitionAccess().getAnnotationsAssignment_0()); }
	(rule__StateTransition__AnnotationsAssignment_0)*
	{ after(grammarAccess.getStateTransitionAccess().getAnnotationsAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateTransition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateTransition__Group__1__Impl
	rule__StateTransition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__StateTransition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateTransitionAccess().getNameAssignment_1()); }
	(rule__StateTransition__NameAssignment_1)
	{ after(grammarAccess.getStateTransitionAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateTransition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateTransition__Group__2__Impl
	rule__StateTransition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__StateTransition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateTransitionAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getStateTransitionAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateTransition__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateTransition__Group__3__Impl
	rule__StateTransition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__StateTransition__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateTransitionAccess().getTransitionKeyword_3()); }
	'transition'
	{ after(grammarAccess.getStateTransitionAccess().getTransitionKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateTransition__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateTransition__Group__4__Impl
	rule__StateTransition__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__StateTransition__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateTransitionAccess().getConditionAssignment_4()); }
	(rule__StateTransition__ConditionAssignment_4)
	{ after(grammarAccess.getStateTransitionAccess().getConditionAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateTransition__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateTransition__Group__5__Impl
	rule__StateTransition__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__StateTransition__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateTransitionAccess().getHyphenMinusGreaterThanSignKeyword_5()); }
	'->'
	{ after(grammarAccess.getStateTransitionAccess().getHyphenMinusGreaterThanSignKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateTransition__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateTransition__Group__6__Impl
	rule__StateTransition__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__StateTransition__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateTransitionAccess().getTargetStateAssignment_6()); }
	(rule__StateTransition__TargetStateAssignment_6)
	{ after(grammarAccess.getStateTransitionAccess().getTargetStateAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateTransition__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateTransition__Group__7__Impl
	rule__StateTransition__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__StateTransition__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateTransitionAccess().getInStatesParserRuleCall_7()); }
	(ruleInStates)?
	{ after(grammarAccess.getStateTransitionAccess().getInStatesParserRuleCall_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateTransition__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateTransition__Group__8__Impl
	rule__StateTransition__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__StateTransition__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateTransitionAccess().getPropertiesBlockParserRuleCall_8()); }
	(rulePropertiesBlock)?
	{ after(grammarAccess.getStateTransitionAccess().getPropertiesBlockParserRuleCall_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateTransition__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateTransition__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StateTransition__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateTransitionAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getStateTransitionAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StateSynchronization__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateSynchronization__Group__0__Impl
	rule__StateSynchronization__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StateSynchronization__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateSynchronizationAccess().getAnnotationsAssignment_0()); }
	(rule__StateSynchronization__AnnotationsAssignment_0)*
	{ after(grammarAccess.getStateSynchronizationAccess().getAnnotationsAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateSynchronization__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateSynchronization__Group__1__Impl
	rule__StateSynchronization__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__StateSynchronization__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateSynchronizationAccess().getNameAssignment_1()); }
	(rule__StateSynchronization__NameAssignment_1)
	{ after(grammarAccess.getStateSynchronizationAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateSynchronization__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateSynchronization__Group__2__Impl
	rule__StateSynchronization__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__StateSynchronization__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateSynchronizationAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getStateSynchronizationAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateSynchronization__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateSynchronization__Group__3__Impl
	rule__StateSynchronization__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__StateSynchronization__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateSynchronizationAccess().getSyncKeyword_3()); }
	'sync'
	{ after(grammarAccess.getStateSynchronizationAccess().getSyncKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateSynchronization__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateSynchronization__Group__4__Impl
	rule__StateSynchronization__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__StateSynchronization__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateSynchronizationAccess().getAlternatives_4()); }
	(rule__StateSynchronization__Alternatives_4)
	{ after(grammarAccess.getStateSynchronizationAccess().getAlternatives_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateSynchronization__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateSynchronization__Group__5__Impl
	rule__StateSynchronization__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__StateSynchronization__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateSynchronizationAccess().getInStatesParserRuleCall_5()); }
	(ruleInStates)?
	{ after(grammarAccess.getStateSynchronizationAccess().getInStatesParserRuleCall_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateSynchronization__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateSynchronization__Group__6__Impl
	rule__StateSynchronization__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__StateSynchronization__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateSynchronizationAccess().getPropertiesBlockParserRuleCall_6()); }
	(rulePropertiesBlock)?
	{ after(grammarAccess.getStateSynchronizationAccess().getPropertiesBlockParserRuleCall_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateSynchronization__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateSynchronization__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StateSynchronization__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateSynchronizationAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getStateSynchronizationAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StateSynchronization__Group_4_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateSynchronization__Group_4_0__0__Impl
	rule__StateSynchronization__Group_4_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StateSynchronization__Group_4_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateSynchronizationAccess().getConditionAssignment_4_0_0()); }
	(rule__StateSynchronization__ConditionAssignment_4_0_0)
	{ after(grammarAccess.getStateSynchronizationAccess().getConditionAssignment_4_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateSynchronization__Group_4_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateSynchronization__Group_4_0__1__Impl
	rule__StateSynchronization__Group_4_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__StateSynchronization__Group_4_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateSynchronizationAccess().getHyphenMinusGreaterThanSignKeyword_4_0_1()); }
	'->'
	{ after(grammarAccess.getStateSynchronizationAccess().getHyphenMinusGreaterThanSignKeyword_4_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateSynchronization__Group_4_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateSynchronization__Group_4_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StateSynchronization__Group_4_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateSynchronizationAccess().getTargetStateAssignment_4_0_2()); }
	(rule__StateSynchronization__TargetStateAssignment_4_0_2)
	{ after(grammarAccess.getStateSynchronizationAccess().getTargetStateAssignment_4_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StateSynchronization__Group_4_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateSynchronization__Group_4_1__0__Impl
	rule__StateSynchronization__Group_4_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StateSynchronization__Group_4_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateSynchronizationAccess().getTargetStateAssignment_4_1_0()); }
	(rule__StateSynchronization__TargetStateAssignment_4_1_0)
	{ after(grammarAccess.getStateSynchronizationAccess().getTargetStateAssignment_4_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateSynchronization__Group_4_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateSynchronization__Group_4_1__1__Impl
	rule__StateSynchronization__Group_4_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__StateSynchronization__Group_4_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateSynchronizationAccess().getHyphenMinusGreaterThanSignKeyword_4_1_1()); }
	'->'
	{ after(grammarAccess.getStateSynchronizationAccess().getHyphenMinusGreaterThanSignKeyword_4_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateSynchronization__Group_4_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateSynchronization__Group_4_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StateSynchronization__Group_4_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateSynchronizationAccess().getConditionAssignment_4_1_2()); }
	(rule__StateSynchronization__ConditionAssignment_4_1_2)
	{ after(grammarAccess.getStateSynchronizationAccess().getConditionAssignment_4_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TokenFlow__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TokenFlow__Group__0__Impl
	rule__TokenFlow__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenFlow__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTokenFlowAccess().getAnnotationsAssignment_0()); }
	(rule__TokenFlow__AnnotationsAssignment_0)*
	{ after(grammarAccess.getTokenFlowAccess().getAnnotationsAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenFlow__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TokenFlow__Group__1__Impl
	rule__TokenFlow__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenFlow__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTokenFlowAccess().getNameAssignment_1()); }
	(rule__TokenFlow__NameAssignment_1)
	{ after(grammarAccess.getTokenFlowAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenFlow__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TokenFlow__Group__2__Impl
	rule__TokenFlow__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenFlow__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTokenFlowAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getTokenFlowAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenFlow__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TokenFlow__Group__3__Impl
	rule__TokenFlow__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenFlow__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTokenFlowAccess().getCategoryAssignment_3()); }
	(rule__TokenFlow__CategoryAssignment_3)
	{ after(grammarAccess.getTokenFlowAccess().getCategoryAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenFlow__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TokenFlow__Group__4__Impl
	rule__TokenFlow__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenFlow__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTokenFlowAccess().getSourceAssignment_4()); }
	(rule__TokenFlow__SourceAssignment_4)?
	{ after(grammarAccess.getTokenFlowAccess().getSourceAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenFlow__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TokenFlow__Group__5__Impl
	rule__TokenFlow__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenFlow__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTokenFlowAccess().getConditionAssignment_5()); }
	(rule__TokenFlow__ConditionAssignment_5)
	{ after(grammarAccess.getTokenFlowAccess().getConditionAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenFlow__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TokenFlow__Group__6__Impl
	rule__TokenFlow__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenFlow__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTokenFlowAccess().getHyphenMinusGreaterThanSignKeyword_6()); }
	'->'
	{ after(grammarAccess.getTokenFlowAccess().getHyphenMinusGreaterThanSignKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenFlow__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TokenFlow__Group__7__Impl
	rule__TokenFlow__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenFlow__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTokenFlowAccess().getAlternatives_7()); }
	(rule__TokenFlow__Alternatives_7)
	{ after(grammarAccess.getTokenFlowAccess().getAlternatives_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenFlow__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TokenFlow__Group__8__Impl
	rule__TokenFlow__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenFlow__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTokenFlowAccess().getInStatesParserRuleCall_8()); }
	(ruleInStates)?
	{ after(grammarAccess.getTokenFlowAccess().getInStatesParserRuleCall_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenFlow__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TokenFlow__Group__9__Impl
	rule__TokenFlow__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenFlow__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTokenFlowAccess().getPropertiesBlockParserRuleCall_9()); }
	(rulePropertiesBlock)?
	{ after(grammarAccess.getTokenFlowAccess().getPropertiesBlockParserRuleCall_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenFlow__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TokenFlow__Group__10__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenFlow__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTokenFlowAccess().getSemicolonKeyword_10()); }
	';'
	{ after(grammarAccess.getTokenFlowAccess().getSemicolonKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComputationalBehavior__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComputationalBehavior__Group__0__Impl
	rule__ComputationalBehavior__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComputationalBehavior__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComputationalBehaviorAccess().getAnnotationsAssignment_0()); }
	(rule__ComputationalBehavior__AnnotationsAssignment_0)*
	{ after(grammarAccess.getComputationalBehaviorAccess().getAnnotationsAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComputationalBehavior__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComputationalBehavior__Group__1__Impl
	rule__ComputationalBehavior__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComputationalBehavior__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComputationalBehaviorAccess().getNameAssignment_1()); }
	(rule__ComputationalBehavior__NameAssignment_1)
	{ after(grammarAccess.getComputationalBehaviorAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComputationalBehavior__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComputationalBehavior__Group__2__Impl
	rule__ComputationalBehavior__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComputationalBehavior__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComputationalBehaviorAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getComputationalBehaviorAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComputationalBehavior__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComputationalBehavior__Group__3__Impl
	rule__ComputationalBehavior__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ComputationalBehavior__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComputationalBehaviorAccess().getCategoryAssignment_3()); }
	(rule__ComputationalBehavior__CategoryAssignment_3)
	{ after(grammarAccess.getComputationalBehaviorAccess().getCategoryAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComputationalBehavior__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComputationalBehavior__Group__4__Impl
	rule__ComputationalBehavior__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ComputationalBehavior__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComputationalBehaviorAccess().getConditionAssignment_4()); }
	(rule__ComputationalBehavior__ConditionAssignment_4)
	{ after(grammarAccess.getComputationalBehaviorAccess().getConditionAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComputationalBehavior__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComputationalBehavior__Group__5__Impl
	rule__ComputationalBehavior__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ComputationalBehavior__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComputationalBehaviorAccess().getHyphenMinusGreaterThanSignKeyword_5()); }
	'->'
	{ after(grammarAccess.getComputationalBehaviorAccess().getHyphenMinusGreaterThanSignKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComputationalBehavior__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComputationalBehavior__Group__6__Impl
	rule__ComputationalBehavior__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__ComputationalBehavior__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComputationalBehaviorAccess().getTokenResultBlockParserRuleCall_6()); }
	ruleTokenResultBlock
	{ after(grammarAccess.getComputationalBehaviorAccess().getTokenResultBlockParserRuleCall_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComputationalBehavior__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComputationalBehavior__Group__7__Impl
	rule__ComputationalBehavior__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__ComputationalBehavior__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComputationalBehaviorAccess().getInStatesParserRuleCall_7()); }
	(ruleInStates)?
	{ after(grammarAccess.getComputationalBehaviorAccess().getInStatesParserRuleCall_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComputationalBehavior__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComputationalBehavior__Group__8__Impl
	rule__ComputationalBehavior__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__ComputationalBehavior__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComputationalBehaviorAccess().getPropertiesBlockParserRuleCall_8()); }
	(rulePropertiesBlock)?
	{ after(grammarAccess.getComputationalBehaviorAccess().getPropertiesBlockParserRuleCall_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComputationalBehavior__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComputationalBehavior__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComputationalBehavior__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComputationalBehaviorAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getComputationalBehaviorAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TokenResultBlock__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TokenResultBlock__Group__0__Impl
	rule__TokenResultBlock__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenResultBlock__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTokenResultBlockAccess().getActionsAssignment_0()); }
	(rule__TokenResultBlock__ActionsAssignment_0)
	{ after(grammarAccess.getTokenResultBlockAccess().getActionsAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenResultBlock__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TokenResultBlock__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenResultBlock__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTokenResultBlockAccess().getGroup_1()); }
	(rule__TokenResultBlock__Group_1__0)*
	{ after(grammarAccess.getTokenResultBlockAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TokenResultBlock__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TokenResultBlock__Group_1__0__Impl
	rule__TokenResultBlock__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenResultBlock__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTokenResultBlockAccess().getCommaKeyword_1_0()); }
	','
	{ after(grammarAccess.getTokenResultBlockAccess().getCommaKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenResultBlock__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TokenResultBlock__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenResultBlock__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTokenResultBlockAccess().getActionsAssignment_1_1()); }
	(rule__TokenResultBlock__ActionsAssignment_1_1)
	{ after(grammarAccess.getTokenResultBlockAccess().getActionsAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TokenOutput__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TokenOutput__Group__0__Impl
	rule__TokenOutput__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenOutput__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTokenOutputAccess().getLeftAssignment_0()); }
	(rule__TokenOutput__LeftAssignment_0)
	{ after(grammarAccess.getTokenOutputAccess().getLeftAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenOutput__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TokenOutput__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenOutput__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTokenOutputAccess().getGroup_1()); }
	(rule__TokenOutput__Group_1__0)?
	{ after(grammarAccess.getTokenOutputAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TokenOutput__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TokenOutput__Group_1__0__Impl
	rule__TokenOutput__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenOutput__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTokenOutputAccess().getOperatorAssignment_1_0()); }
	(rule__TokenOutput__OperatorAssignment_1_0)
	{ after(grammarAccess.getTokenOutputAccess().getOperatorAssignment_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenOutput__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TokenOutput__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenOutput__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTokenOutputAccess().getRightAssignment_1_1()); }
	(rule__TokenOutput__RightAssignment_1_1)
	{ after(grammarAccess.getTokenOutputAccess().getRightAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DetectionEvent__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DetectionEvent__Group__0__Impl
	rule__DetectionEvent__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DetectionEvent__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDetectionEventAccess().getLeftAssignment_0()); }
	(rule__DetectionEvent__LeftAssignment_0)
	{ after(grammarAccess.getDetectionEventAccess().getLeftAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DetectionEvent__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DetectionEvent__Group__1__Impl
	rule__DetectionEvent__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DetectionEvent__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDetectionEventAccess().getOperatorAssignment_1()); }
	(rule__DetectionEvent__OperatorAssignment_1)
	{ after(grammarAccess.getDetectionEventAccess().getOperatorAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DetectionEvent__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DetectionEvent__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DetectionEvent__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDetectionEventAccess().getRightAssignment_2()); }
	(rule__DetectionEvent__RightAssignment_2)?
	{ after(grammarAccess.getDetectionEventAccess().getRightAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ModelElementContainsLiteral__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ModelElementContainsLiteral__Group__0__Impl
	rule__ModelElementContainsLiteral__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementContainsLiteral__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelElementContainsLiteralAccess().getLeftAssignment_0()); }
	(rule__ModelElementContainsLiteral__LeftAssignment_0)
	{ after(grammarAccess.getModelElementContainsLiteralAccess().getLeftAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementContainsLiteral__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ModelElementContainsLiteral__Group__1__Impl
	rule__ModelElementContainsLiteral__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementContainsLiteral__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelElementContainsLiteralAccess().getOperatorAssignment_1()); }
	(rule__ModelElementContainsLiteral__OperatorAssignment_1)
	{ after(grammarAccess.getModelElementContainsLiteralAccess().getOperatorAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementContainsLiteral__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ModelElementContainsLiteral__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementContainsLiteral__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelElementContainsLiteralAccess().getRightAssignment_2()); }
	(rule__ModelElementContainsLiteral__RightAssignment_2)
	{ after(grammarAccess.getModelElementContainsLiteralAccess().getRightAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ModelElementContainsEnumerationLiteral__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ModelElementContainsEnumerationLiteral__Group__0__Impl
	rule__ModelElementContainsEnumerationLiteral__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementContainsEnumerationLiteral__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelElementContainsEnumerationLiteralAccess().getLeftAssignment_0()); }
	(rule__ModelElementContainsEnumerationLiteral__LeftAssignment_0)
	{ after(grammarAccess.getModelElementContainsEnumerationLiteralAccess().getLeftAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementContainsEnumerationLiteral__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ModelElementContainsEnumerationLiteral__Group__1__Impl
	rule__ModelElementContainsEnumerationLiteral__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementContainsEnumerationLiteral__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelElementContainsEnumerationLiteralAccess().getOperatorAssignment_1()); }
	(rule__ModelElementContainsEnumerationLiteral__OperatorAssignment_1)
	{ after(grammarAccess.getModelElementContainsEnumerationLiteralAccess().getOperatorAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementContainsEnumerationLiteral__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ModelElementContainsEnumerationLiteral__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementContainsEnumerationLiteral__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelElementContainsEnumerationLiteralAccess().getRightAssignment_2()); }
	(rule__ModelElementContainsEnumerationLiteral__RightAssignment_2)
	{ after(grammarAccess.getModelElementContainsEnumerationLiteralAccess().getRightAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ModelElementEqualsLiteral__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ModelElementEqualsLiteral__Group__0__Impl
	rule__ModelElementEqualsLiteral__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementEqualsLiteral__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelElementEqualsLiteralAccess().getLeftAssignment_0()); }
	(rule__ModelElementEqualsLiteral__LeftAssignment_0)
	{ after(grammarAccess.getModelElementEqualsLiteralAccess().getLeftAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementEqualsLiteral__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ModelElementEqualsLiteral__Group__1__Impl
	rule__ModelElementEqualsLiteral__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementEqualsLiteral__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelElementEqualsLiteralAccess().getOperatorAssignment_1()); }
	(rule__ModelElementEqualsLiteral__OperatorAssignment_1)
	{ after(grammarAccess.getModelElementEqualsLiteralAccess().getOperatorAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementEqualsLiteral__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ModelElementEqualsLiteral__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementEqualsLiteral__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelElementEqualsLiteralAccess().getRightAssignment_2()); }
	(rule__ModelElementEqualsLiteral__RightAssignment_2)
	{ after(grammarAccess.getModelElementEqualsLiteralAccess().getRightAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ModelElementEqualsEnumerationLiteral__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ModelElementEqualsEnumerationLiteral__Group__0__Impl
	rule__ModelElementEqualsEnumerationLiteral__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementEqualsEnumerationLiteral__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelElementEqualsEnumerationLiteralAccess().getLeftAssignment_0()); }
	(rule__ModelElementEqualsEnumerationLiteral__LeftAssignment_0)
	{ after(grammarAccess.getModelElementEqualsEnumerationLiteralAccess().getLeftAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementEqualsEnumerationLiteral__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ModelElementEqualsEnumerationLiteral__Group__1__Impl
	rule__ModelElementEqualsEnumerationLiteral__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementEqualsEnumerationLiteral__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelElementEqualsEnumerationLiteralAccess().getOperatorAssignment_1()); }
	(rule__ModelElementEqualsEnumerationLiteral__OperatorAssignment_1)
	{ after(grammarAccess.getModelElementEqualsEnumerationLiteralAccess().getOperatorAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementEqualsEnumerationLiteral__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ModelElementEqualsEnumerationLiteral__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementEqualsEnumerationLiteral__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelElementEqualsEnumerationLiteralAccess().getRightAssignment_2()); }
	(rule__ModelElementEqualsEnumerationLiteral__RightAssignment_2)
	{ after(grammarAccess.getModelElementEqualsEnumerationLiteralAccess().getRightAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Annotation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group__0__Impl
	rule__Annotation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); }
	'@'
	{ after(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group__1__Impl
	rule__Annotation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getNameAssignment_1()); }
	(rule__Annotation__NameAssignment_1)
	{ after(grammarAccess.getAnnotationAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getGroup_2()); }
	(rule__Annotation__Group_2__0)?
	{ after(grammarAccess.getAnnotationAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Annotation__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group_2__0__Impl
	rule__Annotation__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0()); }
	'('
	{ after(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group_2__1__Impl
	rule__Annotation__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getParametersAssignment_2_1()); }
	(rule__Annotation__ParametersAssignment_2_1)
	{ after(grammarAccess.getAnnotationAccess().getParametersAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group_2__2__Impl
	rule__Annotation__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getGroup_2_2()); }
	(rule__Annotation__Group_2_2__0)*
	{ after(grammarAccess.getAnnotationAccess().getGroup_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_2_3()); }
	')'
	{ after(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Annotation__Group_2_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group_2_2__0__Impl
	rule__Annotation__Group_2_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group_2_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0()); }
	','
	{ after(grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group_2_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group_2_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group_2_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getParametersAssignment_2_2_1()); }
	(rule__Annotation__ParametersAssignment_2_2_1)
	{ after(grammarAccess.getAnnotationAccess().getParametersAssignment_2_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AnnotationParameter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnnotationParameter__Group__0__Impl
	rule__AnnotationParameter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationParameter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationParameterAccess().getNameAssignment_0()); }
	(rule__AnnotationParameter__NameAssignment_0)
	{ after(grammarAccess.getAnnotationParameterAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationParameter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnnotationParameter__Group__1__Impl
	rule__AnnotationParameter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationParameter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationParameterAccess().getEqualsSignKeyword_1()); }
	'='
	{ after(grammarAccess.getAnnotationParameterAccess().getEqualsSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationParameter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnnotationParameter__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationParameter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationParameterAccess().getValueAssignment_2()); }
	(rule__AnnotationParameter__ValueAssignment_2)
	{ after(grammarAccess.getAnnotationParameterAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PropertyReference__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyReference__Group__0__Impl
	rule__PropertyReference__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyReference__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyReferenceAccess().getNumberSignKeyword_0()); }
	'#'
	{ after(grammarAccess.getPropertyReferenceAccess().getNumberSignKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyReference__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyReference__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyReference__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyReferenceAccess().getElementAssignment_1()); }
	(rule__PropertyReference__ElementAssignment_1)
	{ after(grammarAccess.getPropertyReferenceAccess().getElementAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__IntegerLiteral__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerLiteral__Group__0__Impl
	rule__IntegerLiteral__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerLiteral__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerLiteralAccess().getIntegerLiteralAction_0()); }
	()
	{ after(grammarAccess.getIntegerLiteralAccess().getIntegerLiteralAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerLiteral__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerLiteral__Group__1__Impl
	rule__IntegerLiteral__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerLiteral__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerLiteralAccess().getValueAssignment_1()); }
	(rule__IntegerLiteral__ValueAssignment_1)
	{ after(grammarAccess.getIntegerLiteralAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerLiteral__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerLiteral__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerLiteral__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerLiteralAccess().getUnitAssignment_2()); }
	(rule__IntegerLiteral__UnitAssignment_2)?
	{ after(grammarAccess.getIntegerLiteralAccess().getUnitAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RealLiteral__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RealLiteral__Group__0__Impl
	rule__RealLiteral__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RealLiteral__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRealLiteralAccess().getRealLiteralAction_0()); }
	()
	{ after(grammarAccess.getRealLiteralAccess().getRealLiteralAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RealLiteral__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RealLiteral__Group__1__Impl
	rule__RealLiteral__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RealLiteral__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRealLiteralAccess().getValueAssignment_1()); }
	(rule__RealLiteral__ValueAssignment_1)
	{ after(grammarAccess.getRealLiteralAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RealLiteral__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RealLiteral__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RealLiteral__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRealLiteralAccess().getUnitAssignment_2()); }
	(rule__RealLiteral__UnitAssignment_2)?
	{ after(grammarAccess.getRealLiteralAccess().getUnitAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StringLiteral__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringLiteral__Group__0__Impl
	rule__StringLiteral__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StringLiteral__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringLiteralAccess().getStringLiteralAction_0()); }
	()
	{ after(grammarAccess.getStringLiteralAccess().getStringLiteralAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringLiteral__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringLiteral__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StringLiteral__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringLiteralAccess().getValueAssignment_1()); }
	(rule__StringLiteral__ValueAssignment_1)
	{ after(grammarAccess.getStringLiteralAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EnumerationLiteral__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumerationLiteral__Group__0__Impl
	rule__EnumerationLiteral__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationLiteral__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationLiteralAccess().getEnumerationLiteralAction_0()); }
	()
	{ after(grammarAccess.getEnumerationLiteralAccess().getEnumerationLiteralAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationLiteral__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumerationLiteral__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationLiteral__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_1()); }
	(rule__EnumerationLiteral__NameAssignment_1)
	{ after(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BooleanLiteral__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BooleanLiteral__Group__0__Impl
	rule__BooleanLiteral__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanLiteral__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0()); }
	()
	{ after(grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanLiteral__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BooleanLiteral__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanLiteral__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBooleanLiteralAccess().getAlternatives_1()); }
	(rule__BooleanLiteral__Alternatives_1)
	{ after(grammarAccess.getBooleanLiteralAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ListLiteral__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ListLiteral__Group__0__Impl
	rule__ListLiteral__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ListLiteral__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListLiteralAccess().getListLiteralAction_0()); }
	()
	{ after(grammarAccess.getListLiteralAccess().getListLiteralAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ListLiteral__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ListLiteral__Group__1__Impl
	rule__ListLiteral__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ListLiteral__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListLiteralAccess().getLeftParenthesisKeyword_1()); }
	'('
	{ after(grammarAccess.getListLiteralAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ListLiteral__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ListLiteral__Group__2__Impl
	rule__ListLiteral__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ListLiteral__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListLiteralAccess().getGroup_2()); }
	(rule__ListLiteral__Group_2__0)?
	{ after(grammarAccess.getListLiteralAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ListLiteral__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ListLiteral__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ListLiteral__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListLiteralAccess().getRightParenthesisKeyword_3()); }
	')'
	{ after(grammarAccess.getListLiteralAccess().getRightParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ListLiteral__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ListLiteral__Group_2__0__Impl
	rule__ListLiteral__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ListLiteral__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListLiteralAccess().getElementsAssignment_2_0()); }
	(rule__ListLiteral__ElementsAssignment_2_0)
	{ after(grammarAccess.getListLiteralAccess().getElementsAssignment_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ListLiteral__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ListLiteral__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ListLiteral__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListLiteralAccess().getGroup_2_1()); }
	(rule__ListLiteral__Group_2_1__0)*
	{ after(grammarAccess.getListLiteralAccess().getGroup_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ListLiteral__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ListLiteral__Group_2_1__0__Impl
	rule__ListLiteral__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ListLiteral__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListLiteralAccess().getCommaKeyword_2_1_0()); }
	','
	{ after(grammarAccess.getListLiteralAccess().getCommaKeyword_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ListLiteral__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ListLiteral__Group_2_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ListLiteral__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListLiteralAccess().getElementsAssignment_2_1_1()); }
	(rule__ListLiteral__ElementsAssignment_2_1_1)
	{ after(grammarAccess.getListLiteralAccess().getElementsAssignment_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EnumerationList__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumerationList__Group__0__Impl
	rule__EnumerationList__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationList__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationListAccess().getListLiteralAction_0()); }
	()
	{ after(grammarAccess.getEnumerationListAccess().getListLiteralAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationList__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumerationList__Group__1__Impl
	rule__EnumerationList__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationList__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationListAccess().getLeftParenthesisKeyword_1()); }
	'('
	{ after(grammarAccess.getEnumerationListAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationList__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumerationList__Group__2__Impl
	rule__EnumerationList__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationList__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationListAccess().getGroup_2()); }
	(rule__EnumerationList__Group_2__0)?
	{ after(grammarAccess.getEnumerationListAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationList__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumerationList__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationList__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationListAccess().getRightParenthesisKeyword_3()); }
	')'
	{ after(grammarAccess.getEnumerationListAccess().getRightParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EnumerationList__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumerationList__Group_2__0__Impl
	rule__EnumerationList__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationList__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationListAccess().getElementsAssignment_2_0()); }
	(rule__EnumerationList__ElementsAssignment_2_0)
	{ after(grammarAccess.getEnumerationListAccess().getElementsAssignment_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationList__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumerationList__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationList__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationListAccess().getGroup_2_1()); }
	(rule__EnumerationList__Group_2_1__0)*
	{ after(grammarAccess.getEnumerationListAccess().getGroup_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EnumerationList__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumerationList__Group_2_1__0__Impl
	rule__EnumerationList__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationList__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationListAccess().getCommaKeyword_2_1_0()); }
	','
	{ after(grammarAccess.getEnumerationListAccess().getCommaKeyword_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationList__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumerationList__Group_2_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationList__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationListAccess().getElementsAssignment_2_1_1()); }
	(rule__EnumerationList__ElementsAssignment_2_1_1)
	{ after(grammarAccess.getEnumerationListAccess().getElementsAssignment_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SetLiteral__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SetLiteral__Group__0__Impl
	rule__SetLiteral__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SetLiteral__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSetLiteralAccess().getSetLiteralAction_0()); }
	()
	{ after(grammarAccess.getSetLiteralAccess().getSetLiteralAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SetLiteral__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SetLiteral__Group__1__Impl
	rule__SetLiteral__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SetLiteral__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSetLiteralAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getSetLiteralAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SetLiteral__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SetLiteral__Group__2__Impl
	rule__SetLiteral__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SetLiteral__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSetLiteralAccess().getGroup_2()); }
	(rule__SetLiteral__Group_2__0)?
	{ after(grammarAccess.getSetLiteralAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SetLiteral__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SetLiteral__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SetLiteral__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSetLiteralAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getSetLiteralAccess().getRightCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SetLiteral__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SetLiteral__Group_2__0__Impl
	rule__SetLiteral__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SetLiteral__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSetLiteralAccess().getElementsAssignment_2_0()); }
	(rule__SetLiteral__ElementsAssignment_2_0)
	{ after(grammarAccess.getSetLiteralAccess().getElementsAssignment_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SetLiteral__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SetLiteral__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SetLiteral__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSetLiteralAccess().getGroup_2_1()); }
	(rule__SetLiteral__Group_2_1__0)*
	{ after(grammarAccess.getSetLiteralAccess().getGroup_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SetLiteral__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SetLiteral__Group_2_1__0__Impl
	rule__SetLiteral__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SetLiteral__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSetLiteralAccess().getCommaKeyword_2_1_0()); }
	','
	{ after(grammarAccess.getSetLiteralAccess().getCommaKeyword_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SetLiteral__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SetLiteral__Group_2_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SetLiteral__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSetLiteralAccess().getElementsAssignment_2_1_1()); }
	(rule__SetLiteral__ElementsAssignment_2_1_1)
	{ after(grammarAccess.getSetLiteralAccess().getElementsAssignment_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DirectionalLiteral__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DirectionalLiteral__Group__0__Impl
	rule__DirectionalLiteral__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DirectionalLiteral__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDirectionalLiteralAccess().getDirectionalLiteralAction_0()); }
	()
	{ after(grammarAccess.getDirectionalLiteralAccess().getDirectionalLiteralAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DirectionalLiteral__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DirectionalLiteral__Group__1__Impl
	rule__DirectionalLiteral__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DirectionalLiteral__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDirectionalLiteralAccess().getDirectionAssignment_1()); }
	(rule__DirectionalLiteral__DirectionAssignment_1)
	{ after(grammarAccess.getDirectionalLiteralAccess().getDirectionAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DirectionalLiteral__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DirectionalLiteral__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DirectionalLiteral__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDirectionalLiteralAccess().getValueAssignment_2()); }
	(rule__DirectionalLiteral__ValueAssignment_2)
	{ after(grammarAccess.getDirectionalLiteralAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MultiLiteralOperation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiLiteralOperation__Group__0__Impl
	rule__MultiLiteralOperation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiLiteralOperation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiLiteralOperationAccess().getMultiLiteralConstraintAction_0()); }
	()
	{ after(grammarAccess.getMultiLiteralOperationAccess().getMultiLiteralConstraintAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiLiteralOperation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiLiteralOperation__Group__1__Impl
	rule__MultiLiteralOperation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiLiteralOperation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiLiteralOperationAccess().getOperatorAssignment_1()); }
	(rule__MultiLiteralOperation__OperatorAssignment_1)
	{ after(grammarAccess.getMultiLiteralOperationAccess().getOperatorAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiLiteralOperation__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiLiteralOperation__Group__2__Impl
	rule__MultiLiteralOperation__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiLiteralOperation__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiLiteralOperationAccess().getLeftParenthesisKeyword_2()); }
	'('
	{ after(grammarAccess.getMultiLiteralOperationAccess().getLeftParenthesisKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiLiteralOperation__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiLiteralOperation__Group__3__Impl
	rule__MultiLiteralOperation__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiLiteralOperation__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiLiteralOperationAccess().getGroup_3()); }
	(rule__MultiLiteralOperation__Group_3__0)?
	{ after(grammarAccess.getMultiLiteralOperationAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiLiteralOperation__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiLiteralOperation__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiLiteralOperation__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiLiteralOperationAccess().getRightParenthesisKeyword_4()); }
	')'
	{ after(grammarAccess.getMultiLiteralOperationAccess().getRightParenthesisKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MultiLiteralOperation__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiLiteralOperation__Group_3__0__Impl
	rule__MultiLiteralOperation__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiLiteralOperation__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiLiteralOperationAccess().getElementsAssignment_3_0()); }
	(rule__MultiLiteralOperation__ElementsAssignment_3_0)
	{ after(grammarAccess.getMultiLiteralOperationAccess().getElementsAssignment_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiLiteralOperation__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiLiteralOperation__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiLiteralOperation__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiLiteralOperationAccess().getGroup_3_1()); }
	(rule__MultiLiteralOperation__Group_3_1__0)*
	{ after(grammarAccess.getMultiLiteralOperationAccess().getGroup_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MultiLiteralOperation__Group_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiLiteralOperation__Group_3_1__0__Impl
	rule__MultiLiteralOperation__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiLiteralOperation__Group_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiLiteralOperationAccess().getCommaKeyword_3_1_0()); }
	','
	{ after(grammarAccess.getMultiLiteralOperationAccess().getCommaKeyword_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiLiteralOperation__Group_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiLiteralOperation__Group_3_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiLiteralOperation__Group_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiLiteralOperationAccess().getElementsAssignment_3_1_1()); }
	(rule__MultiLiteralOperation__ElementsAssignment_3_1_1)
	{ after(grammarAccess.getMultiLiteralOperationAccess().getElementsAssignment_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedNameWithWildcard__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedNameWithWildcard__Group__0__Impl
	rule__QualifiedNameWithWildcard__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedNameWithWildcard__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); }
	ruleQualifiedName
	{ after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedNameWithWildcard__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedNameWithWildcard__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedNameWithWildcard__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameWithWildcardAccess().getColonColonAsteriskKeyword_1()); }
	'::*'
	{ after(grammarAccess.getQualifiedNameWithWildcardAccess().getColonColonAsteriskKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DottedName__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DottedName__Group__0__Impl
	rule__DottedName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DottedName__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDottedNameAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getDottedNameAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DottedName__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DottedName__Group__1__Impl
	rule__DottedName__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DottedName__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDottedNameAccess().getFullStopKeyword_1()); }
	'.'
	{ after(grammarAccess.getDottedNameAccess().getFullStopKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DottedName__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DottedName__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DottedName__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDottedNameAccess().getIDTerminalRuleCall_2()); }
	RULE_ID
	{ after(grammarAccess.getDottedNameAccess().getIDTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group__0__Impl
	rule__QualifiedName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
	(rule__QualifiedName__Group_1__0)*
	{ after(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group_1__0__Impl
	rule__QualifiedName__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0()); }
	'::'
	{ after(grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
	{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedTypesReference__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedTypesReference__Group__0__Impl
	rule__QualifiedTypesReference__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedTypesReference__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedTypesReferenceAccess().getQualifiedNameParserRuleCall_0()); }
	ruleQualifiedName
	{ after(grammarAccess.getQualifiedTypesReferenceAccess().getQualifiedNameParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedTypesReference__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedTypesReference__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedTypesReference__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedTypesReferenceAccess().getGroup_1()); }
	(rule__QualifiedTypesReference__Group_1__0)?
	{ after(grammarAccess.getQualifiedTypesReferenceAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedTypesReference__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedTypesReference__Group_1__0__Impl
	rule__QualifiedTypesReference__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedTypesReference__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedTypesReferenceAccess().getFullStopKeyword_1_0()); }
	'.'
	{ after(grammarAccess.getQualifiedTypesReferenceAccess().getFullStopKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedTypesReference__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedTypesReference__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedTypesReference__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedTypesReferenceAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
	{ after(grammarAccess.getQualifiedTypesReferenceAccess().getIDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedDottedReference__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedDottedReference__Group__0__Impl
	rule__QualifiedDottedReference__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedDottedReference__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedDottedReferenceAccess().getQualifiedNameParserRuleCall_0()); }
	ruleQualifiedName
	{ after(grammarAccess.getQualifiedDottedReferenceAccess().getQualifiedNameParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedDottedReference__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedDottedReference__Group__1__Impl
	rule__QualifiedDottedReference__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedDottedReference__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedDottedReferenceAccess().getFullStopKeyword_1()); }
	'.'
	{ after(grammarAccess.getQualifiedDottedReferenceAccess().getFullStopKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedDottedReference__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedDottedReference__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedDottedReference__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedDottedReferenceAccess().getIDTerminalRuleCall_2()); }
	RULE_ID
	{ after(grammarAccess.getQualifiedDottedReferenceAccess().getIDTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VirtualProcessorKeywords__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VirtualProcessorKeywords__Group__0__Impl
	rule__VirtualProcessorKeywords__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VirtualProcessorKeywords__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVirtualProcessorKeywordsAccess().getVirtualKeyword_0()); }
	'virtual'
	{ after(grammarAccess.getVirtualProcessorKeywordsAccess().getVirtualKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VirtualProcessorKeywords__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VirtualProcessorKeywords__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VirtualProcessorKeywords__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVirtualProcessorKeywordsAccess().getProcessorKeyword_1()); }
	'processor'
	{ after(grammarAccess.getVirtualProcessorKeywordsAccess().getProcessorKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VirtualBusKeywords__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VirtualBusKeywords__Group__0__Impl
	rule__VirtualBusKeywords__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VirtualBusKeywords__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVirtualBusKeywordsAccess().getVirtualKeyword_0()); }
	'virtual'
	{ after(grammarAccess.getVirtualBusKeywordsAccess().getVirtualKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VirtualBusKeywords__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VirtualBusKeywords__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VirtualBusKeywords__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVirtualBusKeywordsAccess().getBusKeyword_1()); }
	'bus'
	{ after(grammarAccess.getVirtualBusKeywordsAccess().getBusKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VirtualMemoryKeywords__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VirtualMemoryKeywords__Group__0__Impl
	rule__VirtualMemoryKeywords__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VirtualMemoryKeywords__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVirtualMemoryKeywordsAccess().getVirtualKeyword_0()); }
	'virtual'
	{ after(grammarAccess.getVirtualMemoryKeywordsAccess().getVirtualKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VirtualMemoryKeywords__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VirtualMemoryKeywords__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VirtualMemoryKeywords__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVirtualMemoryKeywordsAccess().getMemoryKeyword_1()); }
	'memory'
	{ after(grammarAccess.getVirtualMemoryKeywordsAccess().getMemoryKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VirtualDeviceKeywords__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VirtualDeviceKeywords__Group__0__Impl
	rule__VirtualDeviceKeywords__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VirtualDeviceKeywords__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVirtualDeviceKeywordsAccess().getVirtualKeyword_0()); }
	'virtual'
	{ after(grammarAccess.getVirtualDeviceKeywordsAccess().getVirtualKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VirtualDeviceKeywords__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VirtualDeviceKeywords__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VirtualDeviceKeywords__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVirtualDeviceKeywordsAccess().getDeviceKeyword_1()); }
	'device'
	{ after(grammarAccess.getVirtualDeviceKeywordsAccess().getDeviceKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ThreadGroupKeywords__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ThreadGroupKeywords__Group__0__Impl
	rule__ThreadGroupKeywords__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ThreadGroupKeywords__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getThreadGroupKeywordsAccess().getThreadKeyword_0()); }
	'thread'
	{ after(grammarAccess.getThreadGroupKeywordsAccess().getThreadKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ThreadGroupKeywords__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ThreadGroupKeywords__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ThreadGroupKeywords__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getThreadGroupKeywordsAccess().getGroupKeyword_1()); }
	'group'
	{ after(grammarAccess.getThreadGroupKeywordsAccess().getGroupKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SubprogramGroupKeywords__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubprogramGroupKeywords__Group__0__Impl
	rule__SubprogramGroupKeywords__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SubprogramGroupKeywords__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubprogramGroupKeywordsAccess().getSubprogramKeyword_0()); }
	'subprogram'
	{ after(grammarAccess.getSubprogramGroupKeywordsAccess().getSubprogramKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubprogramGroupKeywords__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubprogramGroupKeywords__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SubprogramGroupKeywords__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubprogramGroupKeywordsAccess().getGroupKeyword_1()); }
	'group'
	{ after(grammarAccess.getSubprogramGroupKeywordsAccess().getGroupKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EndToEndFLowKeywords__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EndToEndFLowKeywords__Group__0__Impl
	rule__EndToEndFLowKeywords__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EndToEndFLowKeywords__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEndToEndFLowKeywordsAccess().getEndKeyword_0()); }
	'end'
	{ after(grammarAccess.getEndToEndFLowKeywordsAccess().getEndKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EndToEndFLowKeywords__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EndToEndFLowKeywords__Group__1__Impl
	rule__EndToEndFLowKeywords__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EndToEndFLowKeywords__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEndToEndFLowKeywordsAccess().getToKeyword_1()); }
	'to'
	{ after(grammarAccess.getEndToEndFLowKeywordsAccess().getToKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EndToEndFLowKeywords__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EndToEndFLowKeywords__Group__2__Impl
	rule__EndToEndFLowKeywords__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EndToEndFLowKeywords__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEndToEndFLowKeywordsAccess().getEndKeyword_2()); }
	'end'
	{ after(grammarAccess.getEndToEndFLowKeywordsAccess().getEndKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EndToEndFLowKeywords__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EndToEndFLowKeywords__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EndToEndFLowKeywords__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEndToEndFLowKeywordsAccess().getFlowKeyword_3()); }
	'flow'
	{ after(grammarAccess.getEndToEndFLowKeywordsAccess().getFlowKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InOutKeywords__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InOutKeywords__Group__0__Impl
	rule__InOutKeywords__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InOutKeywords__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInOutKeywordsAccess().getInKeyword_0()); }
	'in'
	{ after(grammarAccess.getInOutKeywordsAccess().getInKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InOutKeywords__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InOutKeywords__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InOutKeywords__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInOutKeywordsAccess().getOutKeyword_1()); }
	'out'
	{ after(grammarAccess.getInOutKeywordsAccess().getOutKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BusAccessKeywords__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BusAccessKeywords__Group__0__Impl
	rule__BusAccessKeywords__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BusAccessKeywords__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBusAccessKeywordsAccess().getBusKeyword_0()); }
	'bus'
	{ after(grammarAccess.getBusAccessKeywordsAccess().getBusKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BusAccessKeywords__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BusAccessKeywords__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BusAccessKeywords__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBusAccessKeywordsAccess().getAccessKeyword_1()); }
	'access'
	{ after(grammarAccess.getBusAccessKeywordsAccess().getAccessKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VirtualBusAccessKeywords__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VirtualBusAccessKeywords__Group__0__Impl
	rule__VirtualBusAccessKeywords__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VirtualBusAccessKeywords__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVirtualBusAccessKeywordsAccess().getVirtualKeyword_0()); }
	'virtual'
	{ after(grammarAccess.getVirtualBusAccessKeywordsAccess().getVirtualKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VirtualBusAccessKeywords__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VirtualBusAccessKeywords__Group__1__Impl
	rule__VirtualBusAccessKeywords__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VirtualBusAccessKeywords__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVirtualBusAccessKeywordsAccess().getBusKeyword_1()); }
	'bus'
	{ after(grammarAccess.getVirtualBusAccessKeywordsAccess().getBusKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VirtualBusAccessKeywords__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VirtualBusAccessKeywords__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VirtualBusAccessKeywords__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVirtualBusAccessKeywordsAccess().getAccessKeyword_2()); }
	'access'
	{ after(grammarAccess.getVirtualBusAccessKeywordsAccess().getAccessKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DataAccessKeywords__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataAccessKeywords__Group__0__Impl
	rule__DataAccessKeywords__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DataAccessKeywords__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataAccessKeywordsAccess().getDataKeyword_0()); }
	'data'
	{ after(grammarAccess.getDataAccessKeywordsAccess().getDataKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataAccessKeywords__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataAccessKeywords__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DataAccessKeywords__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataAccessKeywordsAccess().getAccessKeyword_1()); }
	'access'
	{ after(grammarAccess.getDataAccessKeywordsAccess().getAccessKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SubprogramAccessKeywords__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubprogramAccessKeywords__Group__0__Impl
	rule__SubprogramAccessKeywords__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SubprogramAccessKeywords__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubprogramAccessKeywordsAccess().getSubprogramKeyword_0()); }
	'subprogram'
	{ after(grammarAccess.getSubprogramAccessKeywordsAccess().getSubprogramKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubprogramAccessKeywords__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubprogramAccessKeywords__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SubprogramAccessKeywords__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubprogramAccessKeywordsAccess().getAccessKeyword_1()); }
	'access'
	{ after(grammarAccess.getSubprogramAccessKeywordsAccess().getAccessKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SubprogramGroupAccessKeywords__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubprogramGroupAccessKeywords__Group__0__Impl
	rule__SubprogramGroupAccessKeywords__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SubprogramGroupAccessKeywords__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubprogramGroupAccessKeywordsAccess().getSubprogramKeyword_0()); }
	'subprogram'
	{ after(grammarAccess.getSubprogramGroupAccessKeywordsAccess().getSubprogramKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubprogramGroupAccessKeywords__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubprogramGroupAccessKeywords__Group__1__Impl
	rule__SubprogramGroupAccessKeywords__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SubprogramGroupAccessKeywords__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubprogramGroupAccessKeywordsAccess().getGroupKeyword_1()); }
	'group'
	{ after(grammarAccess.getSubprogramGroupAccessKeywordsAccess().getGroupKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubprogramGroupAccessKeywords__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubprogramGroupAccessKeywords__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SubprogramGroupAccessKeywords__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubprogramGroupAccessKeywordsAccess().getAccessKeyword_2()); }
	'access'
	{ after(grammarAccess.getSubprogramGroupAccessKeywordsAccess().getAccessKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ProvidesReadKeywords__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidesReadKeywords__Group__0__Impl
	rule__ProvidesReadKeywords__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidesReadKeywords__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidesReadKeywordsAccess().getProvidesKeyword_0()); }
	'provides'
	{ after(grammarAccess.getProvidesReadKeywordsAccess().getProvidesKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidesReadKeywords__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidesReadKeywords__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidesReadKeywords__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidesReadKeywordsAccess().getInKeyword_1()); }
	'in'
	{ after(grammarAccess.getProvidesReadKeywordsAccess().getInKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RequiresReadKeywords__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiresReadKeywords__Group__0__Impl
	rule__RequiresReadKeywords__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiresReadKeywords__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiresReadKeywordsAccess().getRequiresKeyword_0()); }
	'requires'
	{ after(grammarAccess.getRequiresReadKeywordsAccess().getRequiresKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiresReadKeywords__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiresReadKeywords__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiresReadKeywords__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiresReadKeywordsAccess().getInKeyword_1()); }
	'in'
	{ after(grammarAccess.getRequiresReadKeywordsAccess().getInKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ProvidesWriteKeywords__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidesWriteKeywords__Group__0__Impl
	rule__ProvidesWriteKeywords__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidesWriteKeywords__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidesWriteKeywordsAccess().getProvidesKeyword_0()); }
	'provides'
	{ after(grammarAccess.getProvidesWriteKeywordsAccess().getProvidesKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidesWriteKeywords__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidesWriteKeywords__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidesWriteKeywords__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidesWriteKeywordsAccess().getOutKeyword_1()); }
	'out'
	{ after(grammarAccess.getProvidesWriteKeywordsAccess().getOutKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RequiresWriteKeywords__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiresWriteKeywords__Group__0__Impl
	rule__RequiresWriteKeywords__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiresWriteKeywords__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiresWriteKeywordsAccess().getRequiresKeyword_0()); }
	'requires'
	{ after(grammarAccess.getRequiresWriteKeywordsAccess().getRequiresKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiresWriteKeywords__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiresWriteKeywords__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiresWriteKeywords__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiresWriteKeywordsAccess().getOutKeyword_1()); }
	'out'
	{ after(grammarAccess.getRequiresWriteKeywordsAccess().getOutKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ProvidesRWKeywords__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidesRWKeywords__Group__0__Impl
	rule__ProvidesRWKeywords__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidesRWKeywords__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidesRWKeywordsAccess().getProvidesKeyword_0()); }
	'provides'
	{ after(grammarAccess.getProvidesRWKeywordsAccess().getProvidesKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidesRWKeywords__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidesRWKeywords__Group__1__Impl
	rule__ProvidesRWKeywords__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidesRWKeywords__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidesRWKeywordsAccess().getInKeyword_1()); }
	'in'
	{ after(grammarAccess.getProvidesRWKeywordsAccess().getInKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidesRWKeywords__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidesRWKeywords__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidesRWKeywords__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidesRWKeywordsAccess().getOutKeyword_2()); }
	'out'
	{ after(grammarAccess.getProvidesRWKeywordsAccess().getOutKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RequiresRWKeywords__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiresRWKeywords__Group__0__Impl
	rule__RequiresRWKeywords__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiresRWKeywords__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiresRWKeywordsAccess().getRequiresKeyword_0()); }
	'requires'
	{ after(grammarAccess.getRequiresRWKeywordsAccess().getRequiresKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiresRWKeywords__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiresRWKeywords__Group__1__Impl
	rule__RequiresRWKeywords__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiresRWKeywords__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiresRWKeywordsAccess().getInKeyword_1()); }
	'in'
	{ after(grammarAccess.getRequiresRWKeywordsAccess().getInKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiresRWKeywords__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiresRWKeywords__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiresRWKeywords__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiresRWKeywordsAccess().getOutKeyword_2()); }
	'out'
	{ after(grammarAccess.getRequiresRWKeywordsAccess().getOutKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PackageDeclaration__AnnotationsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPackageDeclarationAccess().getAnnotationsAnnotationParserRuleCall_0_0()); }
		ruleAnnotation
		{ after(grammarAccess.getPackageDeclarationAccess().getAnnotationsAnnotationParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDeclaration__PrivateAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPackageDeclarationAccess().getPrivatePrivateKeyword_1_0()); }
		(
			{ before(grammarAccess.getPackageDeclarationAccess().getPrivatePrivateKeyword_1_0()); }
			'private'
			{ after(grammarAccess.getPackageDeclarationAccess().getPrivatePrivateKeyword_1_0()); }
		)
		{ after(grammarAccess.getPackageDeclarationAccess().getPrivatePrivateKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDeclaration__NameAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_3_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDeclaration__ElementsAssignment_5_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPackageDeclarationAccess().getElementsAnnexLibraryParserRuleCall_5_0_0()); }
		ruleAnnexLibrary
		{ after(grammarAccess.getPackageDeclarationAccess().getElementsAnnexLibraryParserRuleCall_5_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDeclaration__ImportsAssignment_5_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPackageDeclarationAccess().getImportsImportParserRuleCall_5_1_0_0()); }
		ruleImport
		{ after(grammarAccess.getPackageDeclarationAccess().getImportsImportParserRuleCall_5_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDeclaration__ElementsAssignment_5_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPackageDeclarationAccess().getElementsPackageElementParserRuleCall_5_1_1_0()); }
		rulePackageElement
		{ after(grammarAccess.getPackageDeclarationAccess().getElementsPackageElementParserRuleCall_5_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnexLibrary__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnnexLibraryAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getAnnexLibraryAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__AnnotationsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyDefinitionAccess().getAnnotationsAnnotationParserRuleCall_0_0()); }
		ruleAnnotation
		{ after(grammarAccess.getPropertyDefinitionAccess().getAnnotationsAnnotationParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__PrivateAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyDefinitionAccess().getPrivatePrivateKeyword_1_0()); }
		(
			{ before(grammarAccess.getPropertyDefinitionAccess().getPrivatePrivateKeyword_1_0()); }
			'private'
			{ after(grammarAccess.getPropertyDefinitionAccess().getPrivatePrivateKeyword_1_0()); }
		)
		{ after(grammarAccess.getPropertyDefinitionAccess().getPrivatePrivateKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__NameAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyDefinitionAccess().getNameIDTerminalRuleCall_3_0()); }
		RULE_ID
		{ after(grammarAccess.getPropertyDefinitionAccess().getNameIDTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__TypeAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyDefinitionAccess().getTypeTypeParserRuleCall_5_0()); }
		ruleType
		{ after(grammarAccess.getPropertyDefinitionAccess().getTypeTypeParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__ForAllAssignment_6_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyDefinitionAccess().getForAllAllKeyword_6_2_0_0()); }
		(
			{ before(grammarAccess.getPropertyDefinitionAccess().getForAllAllKeyword_6_2_0_0()); }
			'all'
			{ after(grammarAccess.getPropertyDefinitionAccess().getForAllAllKeyword_6_2_0_0()); }
		)
		{ after(grammarAccess.getPropertyDefinitionAccess().getForAllAllKeyword_6_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AppliesTo__ComponentCategoriesAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAppliesToAccess().getComponentCategoriesComponentCategoryParserRuleCall_0_0()); }
		ruleComponentCategory
		{ after(grammarAccess.getAppliesToAccess().getComponentCategoriesComponentCategoryParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AppliesTo__FeatureCategoriesAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAppliesToAccess().getFeatureCategoriesFeatureCategoryParserRuleCall_1_0()); }
		ruleFeatureCategory
		{ after(grammarAccess.getAppliesToAccess().getFeatureCategoriesFeatureCategoryParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AppliesTo__AssociationTypesAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAppliesToAccess().getAssociationTypesAssociationTypeParserRuleCall_2_0()); }
		ruleAssociationType
		{ after(grammarAccess.getAppliesToAccess().getAssociationTypesAssociationTypeParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__AnnotationsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertySetAccess().getAnnotationsAnnotationParserRuleCall_0_0()); }
		ruleAnnotation
		{ after(grammarAccess.getPropertySetAccess().getAnnotationsAnnotationParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__PrivateAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertySetAccess().getPrivatePrivateKeyword_1_0()); }
		(
			{ before(grammarAccess.getPropertySetAccess().getPrivatePrivateKeyword_1_0()); }
			'private'
			{ after(grammarAccess.getPropertySetAccess().getPrivatePrivateKeyword_1_0()); }
		)
		{ after(grammarAccess.getPropertySetAccess().getPrivatePrivateKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__NameAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertySetAccess().getNameIDTerminalRuleCall_3_0()); }
		RULE_ID
		{ after(grammarAccess.getPropertySetAccess().getNameIDTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__PropertiesAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertySetAccess().getPropertiesPropertyDefinitionCrossReference_6_0()); }
		(
			{ before(grammarAccess.getPropertySetAccess().getPropertiesPropertyDefinitionQualifiedReferenceParserRuleCall_6_0_1()); }
			ruleQualifiedReference
			{ after(grammarAccess.getPropertySetAccess().getPropertiesPropertyDefinitionQualifiedReferenceParserRuleCall_6_0_1()); }
		)
		{ after(grammarAccess.getPropertySetAccess().getPropertiesPropertyDefinitionCrossReference_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__PropertiesAssignment_7_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertySetAccess().getPropertiesPropertyDefinitionCrossReference_7_1_0()); }
		(
			{ before(grammarAccess.getPropertySetAccess().getPropertiesPropertyDefinitionQualifiedNameParserRuleCall_7_1_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getPropertySetAccess().getPropertiesPropertyDefinitionQualifiedNameParserRuleCall_7_1_0_1()); }
		)
		{ after(grammarAccess.getPropertySetAccess().getPropertiesPropertyDefinitionCrossReference_7_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDef__AnnotationsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeDefAccess().getAnnotationsAnnotationParserRuleCall_0_0()); }
		ruleAnnotation
		{ after(grammarAccess.getTypeDefAccess().getAnnotationsAnnotationParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDef__PrivateAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeDefAccess().getPrivatePrivateKeyword_1_0()); }
		(
			{ before(grammarAccess.getTypeDefAccess().getPrivatePrivateKeyword_1_0()); }
			'private'
			{ after(grammarAccess.getTypeDefAccess().getPrivatePrivateKeyword_1_0()); }
		)
		{ after(grammarAccess.getTypeDefAccess().getPrivatePrivateKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDef__NameAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_3_0()); }
		RULE_ID
		{ after(grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDef__SuperTypeAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeDefAccess().getSuperTypeTypeParserRuleCall_4_1_0()); }
		ruleType
		{ after(grammarAccess.getTypeDefAccess().getSuperTypeTypeParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDef__BaseTypeAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeDefAccess().getBaseTypeTypeParserRuleCall_5_1_0()); }
		ruleType
		{ after(grammarAccess.getTypeDefAccess().getBaseTypeTypeParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyAssociation__TargetAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyAssociationAccess().getTargetModelElementReferenceParserRuleCall_0_0()); }
		ruleModelElementReference
		{ after(grammarAccess.getPropertyAssociationAccess().getTargetModelElementReferenceParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyAssociation__PropertyAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyAssociationAccess().getPropertyPropertyDefinitionCrossReference_2_0()); }
		(
			{ before(grammarAccess.getPropertyAssociationAccess().getPropertyPropertyDefinitionQualifiedNameParserRuleCall_2_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getPropertyAssociationAccess().getPropertyPropertyDefinitionQualifiedNameParserRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getPropertyAssociationAccess().getPropertyPropertyDefinitionCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyAssociation__PropertyAssociationTypeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyAssociationAccess().getPropertyAssociationTypePropertyAssociationTypeParserRuleCall_3_0()); }
		rulePropertyAssociationType
		{ after(grammarAccess.getPropertyAssociationAccess().getPropertyAssociationTypePropertyAssociationTypeParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyAssociation__ValueAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyAssociationAccess().getValueLiteralParserRuleCall_4_0()); }
		ruleLiteral
		{ after(grammarAccess.getPropertyAssociationAccess().getValueLiteralParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementReference__ElementAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelElementReferenceAccess().getElementModelElementCrossReference_0_0()); }
		(
			{ before(grammarAccess.getModelElementReferenceAccess().getElementModelElementIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getModelElementReferenceAccess().getElementModelElementIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getModelElementReferenceAccess().getElementModelElementCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementReference__ElementAssignment_1_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelElementReferenceAccess().getElementModelElementCrossReference_1_0_2_0()); }
		(
			{ before(grammarAccess.getModelElementReferenceAccess().getElementModelElementIDTerminalRuleCall_1_0_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getModelElementReferenceAccess().getElementModelElementIDTerminalRuleCall_1_0_2_0_1()); }
		)
		{ after(grammarAccess.getModelElementReferenceAccess().getElementModelElementCrossReference_1_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedElementReference__ElementAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedElementReferenceAccess().getElementNamedElementCrossReference_0_0()); }
		(
			{ before(grammarAccess.getNamedElementReferenceAccess().getElementNamedElementQualifiedReferenceParserRuleCall_0_0_1()); }
			ruleQualifiedReference
			{ after(grammarAccess.getNamedElementReferenceAccess().getElementNamedElementQualifiedReferenceParserRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getNamedElementReferenceAccess().getElementNamedElementCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedElementReference__ElementAssignment_1_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedElementReferenceAccess().getElementModelElementCrossReference_1_0_2_0()); }
		(
			{ before(grammarAccess.getNamedElementReferenceAccess().getElementModelElementIDTerminalRuleCall_1_0_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getNamedElementReferenceAccess().getElementModelElementIDTerminalRuleCall_1_0_2_0_1()); }
		)
		{ after(grammarAccess.getNamedElementReferenceAccess().getElementModelElementCrossReference_1_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__AnnotationsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentInterfaceAccess().getAnnotationsAnnotationParserRuleCall_0_0()); }
		ruleAnnotation
		{ after(grammarAccess.getComponentInterfaceAccess().getAnnotationsAnnotationParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__PrivateAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentInterfaceAccess().getPrivatePrivateKeyword_1_0()); }
		(
			{ before(grammarAccess.getComponentInterfaceAccess().getPrivatePrivateKeyword_1_0()); }
			'private'
			{ after(grammarAccess.getComponentInterfaceAccess().getPrivatePrivateKeyword_1_0()); }
		)
		{ after(grammarAccess.getComponentInterfaceAccess().getPrivatePrivateKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__CategoryAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentInterfaceAccess().getCategoryComponentCategoryParserRuleCall_2_0()); }
		ruleComponentCategory
		{ after(grammarAccess.getComponentInterfaceAccess().getCategoryComponentCategoryParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentInterfaceAccess().getNameIDTerminalRuleCall_4_0()); }
		RULE_ID
		{ after(grammarAccess.getComponentInterfaceAccess().getNameIDTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InterfaceElement__ElementsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInterfaceElementAccess().getElementsAlternatives_0_0()); }
		(rule__InterfaceElement__ElementsAlternatives_0_0)
		{ after(grammarAccess.getInterfaceElementAccess().getElementsAlternatives_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InterfaceElement__OwnedPropertyAssociationsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInterfaceElementAccess().getOwnedPropertyAssociationsPropertyAssociationParserRuleCall_1_0()); }
		rulePropertyAssociation
		{ after(grammarAccess.getInterfaceElementAccess().getOwnedPropertyAssociationsPropertyAssociationParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentImplementation__AnnotationsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentImplementationAccess().getAnnotationsAnnotationParserRuleCall_0_0()); }
		ruleAnnotation
		{ after(grammarAccess.getComponentImplementationAccess().getAnnotationsAnnotationParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentImplementation__PrivateAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentImplementationAccess().getPrivatePrivateKeyword_1_0()); }
		(
			{ before(grammarAccess.getComponentImplementationAccess().getPrivatePrivateKeyword_1_0()); }
			'private'
			{ after(grammarAccess.getComponentImplementationAccess().getPrivatePrivateKeyword_1_0()); }
		)
		{ after(grammarAccess.getComponentImplementationAccess().getPrivatePrivateKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentImplementation__CategoryAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentImplementationAccess().getCategoryComponentCategoryParserRuleCall_2_0()); }
		ruleComponentCategory
		{ after(grammarAccess.getComponentImplementationAccess().getCategoryComponentCategoryParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentImplementation__NameAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentImplementationAccess().getNameDottedNameParserRuleCall_3_0()); }
		ruleDottedName
		{ after(grammarAccess.getComponentImplementationAccess().getNameDottedNameParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplementationElement__ElementsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImplementationElementAccess().getElementsAlternatives_0_0()); }
		(rule__ImplementationElement__ElementsAlternatives_0_0)
		{ after(grammarAccess.getImplementationElementAccess().getElementsAlternatives_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplementationElement__FlowAssignmentsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImplementationElementAccess().getFlowAssignmentsFlowAssignmentParserRuleCall_1_0()); }
		ruleFlowAssignment
		{ after(grammarAccess.getImplementationElementAccess().getFlowAssignmentsFlowAssignmentParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplementationElement__ClassifierAssignmentsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImplementationElementAccess().getClassifierAssignmentsClassifierAssignmentParserRuleCall_2_0()); }
		ruleClassifierAssignment
		{ after(grammarAccess.getImplementationElementAccess().getClassifierAssignmentsClassifierAssignmentParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplementationElement__ClassifierAssignmentsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImplementationElementAccess().getClassifierAssignmentsClassifierAssignmentPatternParserRuleCall_3_0()); }
		ruleClassifierAssignmentPattern
		{ after(grammarAccess.getImplementationElementAccess().getClassifierAssignmentsClassifierAssignmentPatternParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplementationElement__OwnedPropertyAssociationsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImplementationElementAccess().getOwnedPropertyAssociationsPropertyAssociationParserRuleCall_4_0()); }
		rulePropertyAssociation
		{ after(grammarAccess.getImplementationElementAccess().getOwnedPropertyAssociationsPropertyAssociationParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentConfiguration__AnnotationsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentConfigurationAccess().getAnnotationsAnnotationParserRuleCall_0_0()); }
		ruleAnnotation
		{ after(grammarAccess.getComponentConfigurationAccess().getAnnotationsAnnotationParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentConfiguration__PrivateAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentConfigurationAccess().getPrivatePrivateKeyword_1_0()); }
		(
			{ before(grammarAccess.getComponentConfigurationAccess().getPrivatePrivateKeyword_1_0()); }
			'private'
			{ after(grammarAccess.getComponentConfigurationAccess().getPrivatePrivateKeyword_1_0()); }
		)
		{ after(grammarAccess.getComponentConfigurationAccess().getPrivatePrivateKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentConfiguration__NameAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentConfigurationAccess().getNameDottedNameParserRuleCall_3_0()); }
		ruleDottedName
		{ after(grammarAccess.getComponentConfigurationAccess().getNameDottedNameParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__AnnotationsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getAnnotationsAnnotationParserRuleCall_0_0()); }
		ruleAnnotation
		{ after(grammarAccess.getFeatureAccess().getAnnotationsAnnotationParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__DirectionAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getDirectionFeatureDirectionParserRuleCall_3_0()); }
		ruleFeatureDirection
		{ after(grammarAccess.getFeatureAccess().getDirectionFeatureDirectionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__CategoryAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getCategoryFeatureCategoryParserRuleCall_4_0()); }
		ruleFeatureCategory
		{ after(grammarAccess.getFeatureAccess().getCategoryFeatureCategoryParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__TypeReferenceAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getTypeReferenceReversableTypeReferenceParserRuleCall_5_0()); }
		ruleReversableTypeReference
		{ after(grammarAccess.getFeatureAccess().getTypeReferenceReversableTypeReferenceParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Subcomponent__AnnotationsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubcomponentAccess().getAnnotationsAnnotationParserRuleCall_1_0()); }
		ruleAnnotation
		{ after(grammarAccess.getSubcomponentAccess().getAnnotationsAnnotationParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Subcomponent__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubcomponentAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getSubcomponentAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Subcomponent__CategoryAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubcomponentAccess().getCategoryComponentCategoryParserRuleCall_4_0()); }
		ruleComponentCategory
		{ after(grammarAccess.getSubcomponentAccess().getCategoryComponentCategoryParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Subcomponent__TypeReferencesAssignment_5_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubcomponentAccess().getTypeReferencesClassifierOrTypeReferenceParserRuleCall_5_0_0_0()); }
		ruleClassifierOrTypeReference
		{ after(grammarAccess.getSubcomponentAccess().getTypeReferencesClassifierOrTypeReferenceParserRuleCall_5_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConnectionAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getConnectionAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__AssociationTypeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConnectionAccess().getAssociationTypeIsConnectionParserRuleCall_2_0()); }
		ruleIsConnection
		{ after(grammarAccess.getConnectionAccess().getAssociationTypeIsConnectionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__SourceAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConnectionAccess().getSourceModelElementReferenceParserRuleCall_3_0()); }
		ruleModelElementReference
		{ after(grammarAccess.getConnectionAccess().getSourceModelElementReferenceParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__BidirectionalAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConnectionAccess().getBidirectionalLessThanSignHyphenMinusGreaterThanSignKeyword_4_1_0()); }
		(
			{ before(grammarAccess.getConnectionAccess().getBidirectionalLessThanSignHyphenMinusGreaterThanSignKeyword_4_1_0()); }
			'<->'
			{ after(grammarAccess.getConnectionAccess().getBidirectionalLessThanSignHyphenMinusGreaterThanSignKeyword_4_1_0()); }
		)
		{ after(grammarAccess.getConnectionAccess().getBidirectionalLessThanSignHyphenMinusGreaterThanSignKeyword_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__DestinationAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConnectionAccess().getDestinationModelElementReferenceParserRuleCall_5_0()); }
		ruleModelElementReference
		{ after(grammarAccess.getConnectionAccess().getDestinationModelElementReferenceParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Binding__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBindingAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getBindingAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Binding__BindingTypeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBindingAccess().getBindingTypeTypeDefCrossReference_2_0()); }
		(
			{ before(grammarAccess.getBindingAccess().getBindingTypeTypeDefQualifiedNameParserRuleCall_2_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getBindingAccess().getBindingTypeTypeDefQualifiedNameParserRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getBindingAccess().getBindingTypeTypeDefCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Binding__AssociationTypeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBindingAccess().getAssociationTypeIsBindingParserRuleCall_3_0()); }
		ruleIsBinding
		{ after(grammarAccess.getBindingAccess().getAssociationTypeIsBindingParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Binding__SourceAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBindingAccess().getSourceModelElementReferenceParserRuleCall_4_0()); }
		ruleModelElementReference
		{ after(grammarAccess.getBindingAccess().getSourceModelElementReferenceParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Binding__DestinationAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBindingAccess().getDestinationModelElementReferenceParserRuleCall_6_0()); }
		ruleModelElementReference
		{ after(grammarAccess.getBindingAccess().getDestinationModelElementReferenceParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UseProps__UsePropertiesAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUsePropsAccess().getUsePropertiesPropertySetCrossReference_2_0()); }
		(
			{ before(grammarAccess.getUsePropsAccess().getUsePropertiesPropertySetQualifiedNameParserRuleCall_2_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getUsePropsAccess().getUsePropertiesPropertySetQualifiedNameParserRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getUsePropsAccess().getUsePropertiesPropertySetCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UseProps__UsePropertiesAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUsePropsAccess().getUsePropertiesPropertySetCrossReference_3_1_0()); }
		(
			{ before(grammarAccess.getUsePropsAccess().getUsePropertiesPropertySetQualifiedNameParserRuleCall_3_1_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getUsePropsAccess().getUsePropertiesPropertySetQualifiedNameParserRuleCall_3_1_0_1()); }
		)
		{ after(grammarAccess.getUsePropsAccess().getUsePropertiesPropertySetCrossReference_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InStates__InStatesAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInStatesAccess().getInStatesAlternatives_1_0()); }
		(rule__InStates__InStatesAlternatives_1_0)
		{ after(grammarAccess.getInStatesAccess().getInStatesAlternatives_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EndToEndFlow__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEndToEndFlowAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getEndToEndFlowAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EndToEndFlow__ElementsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEndToEndFlowAccess().getElementsPathElementParserRuleCall_3_0()); }
		rulePathElement
		{ after(grammarAccess.getEndToEndFlowAccess().getElementsPathElementParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EndToEndFlow__ElementsAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEndToEndFlowAccess().getElementsPathElementParserRuleCall_4_1_0()); }
		rulePathElement
		{ after(grammarAccess.getEndToEndFlowAccess().getElementsPathElementParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PathElement__ElementAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPathElementAccess().getElementModelElementCrossReference_0_0()); }
		(
			{ before(grammarAccess.getPathElementAccess().getElementModelElementIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getPathElementAccess().getElementModelElementIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getPathElementAccess().getElementModelElementCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PathElement__ElementAssignment_1_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPathElementAccess().getElementModelElementCrossReference_1_0_2_0()); }
		(
			{ before(grammarAccess.getPathElementAccess().getElementModelElementIDTerminalRuleCall_1_0_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getPathElementAccess().getElementModelElementIDTerminalRuleCall_1_0_2_0_1()); }
		)
		{ after(grammarAccess.getPathElementAccess().getElementModelElementCrossReference_1_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__ImportedNamespaceAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0_0()); }
		ruleQualifiedNameWithWildcard
		{ after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__ImportedNamespaceAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_1_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__AliasAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImportAccess().getAliasIDTerminalRuleCall_2_1_0()); }
		RULE_ID
		{ after(grammarAccess.getImportAccess().getAliasIDTerminalRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierAssignment__TargetAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClassifierAssignmentAccess().getTargetModelElementReferenceParserRuleCall_0_0()); }
		ruleModelElementReference
		{ after(grammarAccess.getClassifierAssignmentAccess().getTargetModelElementReferenceParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierAssignment__AssignedClassifiersAssignment_2_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClassifierAssignmentAccess().getAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_2_0_0_0()); }
		ruleClassifierOrTypeReference
		{ after(grammarAccess.getClassifierAssignmentAccess().getAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_2_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierAssignment__AssignedClassifiersAssignment_2_0_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClassifierAssignmentAccess().getAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_2_0_1_1_0()); }
		ruleClassifierOrTypeReference
		{ after(grammarAccess.getClassifierAssignmentAccess().getAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_2_0_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierAssignmentPattern__AssignedClassifiersAssignment_2_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClassifierAssignmentPatternAccess().getAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_2_0_0_0()); }
		ruleClassifierOrTypeReference
		{ after(grammarAccess.getClassifierAssignmentPatternAccess().getAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_2_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierAssignmentPattern__AssignedClassifiersAssignment_2_0_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClassifierAssignmentPatternAccess().getAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_2_0_1_1_0()); }
		ruleClassifierOrTypeReference
		{ after(grammarAccess.getClassifierAssignmentPatternAccess().getAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_2_0_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryExpression__TargetPatternAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQueryExpressionAccess().getTargetPatternTypeCrossReference_2_0()); }
		(
			{ before(grammarAccess.getQueryExpressionAccess().getTargetPatternTypeQualifiedTypesReferenceParserRuleCall_2_0_1()); }
			ruleQualifiedTypesReference
			{ after(grammarAccess.getQueryExpressionAccess().getTargetPatternTypeQualifiedTypesReferenceParserRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getQueryExpressionAccess().getTargetPatternTypeCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowAssignment__TargetAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFlowAssignmentAccess().getTargetModelElementReferenceParserRuleCall_0_0()); }
		ruleModelElementReference
		{ after(grammarAccess.getFlowAssignmentAccess().getTargetModelElementReferenceParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowAssignment__ElementsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFlowAssignmentAccess().getElementsPathElementParserRuleCall_3_0()); }
		rulePathElement
		{ after(grammarAccess.getFlowAssignmentAccess().getElementsPathElementParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowAssignment__ElementsAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFlowAssignmentAccess().getElementsPathElementParserRuleCall_4_1_0()); }
		rulePathElement
		{ after(grammarAccess.getFlowAssignmentAccess().getElementsPathElementParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationElement__OwnedPropertyAssociationsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigurationElementAccess().getOwnedPropertyAssociationsPropertyAssociationParserRuleCall_0_0()); }
		rulePropertyAssociation
		{ after(grammarAccess.getConfigurationElementAccess().getOwnedPropertyAssociationsPropertyAssociationParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationElement__ElementsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigurationElementAccess().getElementsBehaviorAnnotationBlockParserRuleCall_1_0()); }
		ruleBehaviorAnnotationBlock
		{ after(grammarAccess.getConfigurationElementAccess().getElementsBehaviorAnnotationBlockParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationElement__ElementsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigurationElementAccess().getElementsBindingParserRuleCall_2_0()); }
		ruleBinding
		{ after(grammarAccess.getConfigurationElementAccess().getElementsBindingParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationElement__ClassifierAssignmentsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigurationElementAccess().getClassifierAssignmentsClassifierAssignmentParserRuleCall_3_0()); }
		ruleClassifierAssignment
		{ after(grammarAccess.getConfigurationElementAccess().getClassifierAssignmentsClassifierAssignmentParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationElement__ClassifierAssignmentsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigurationElementAccess().getClassifierAssignmentsClassifierAssignmentPatternParserRuleCall_4_0()); }
		ruleClassifierAssignmentPattern
		{ after(grammarAccess.getConfigurationElementAccess().getClassifierAssignmentsClassifierAssignmentPatternParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationElement__ElementsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigurationElementAccess().getElementsAnnexSubclauseParserRuleCall_5_0()); }
		ruleAnnexSubclause
		{ after(grammarAccess.getConfigurationElementAccess().getElementsAnnexSubclauseParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameters__ParameterizedAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParametersAccess().getParameterizedLeftParenthesisKeyword_0_0()); }
		(
			{ before(grammarAccess.getParametersAccess().getParameterizedLeftParenthesisKeyword_0_0()); }
			'('
			{ after(grammarAccess.getParametersAccess().getParameterizedLeftParenthesisKeyword_0_0()); }
		)
		{ after(grammarAccess.getParametersAccess().getParameterizedLeftParenthesisKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameters__ParametersAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParametersAccess().getParametersConfigurationParameterParserRuleCall_1_0_0()); }
		ruleConfigurationParameter
		{ after(grammarAccess.getParametersAccess().getParametersConfigurationParameterParserRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameters__ParametersAssignment_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParametersAccess().getParametersConfigurationParameterParserRuleCall_1_1_1_0()); }
		ruleConfigurationParameter
		{ after(grammarAccess.getParametersAccess().getParametersConfigurationParameterParserRuleCall_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationParameter__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigurationParameterAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getConfigurationParameterAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationParameter__TypeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigurationParameterAccess().getTypeTypeCrossReference_2_0()); }
		(
			{ before(grammarAccess.getConfigurationParameterAccess().getTypeTypeQualifiedNameParserRuleCall_2_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getConfigurationParameterAccess().getTypeTypeQualifiedNameParserRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getConfigurationParameterAccess().getTypeTypeCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReversableInterfaceReference__ReverseAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReversableInterfaceReferenceAccess().getReverseReverseKeyword_0_0()); }
		(
			{ before(grammarAccess.getReversableInterfaceReferenceAccess().getReverseReverseKeyword_0_0()); }
			'reverse'
			{ after(grammarAccess.getReversableInterfaceReferenceAccess().getReverseReverseKeyword_0_0()); }
		)
		{ after(grammarAccess.getReversableInterfaceReferenceAccess().getReverseReverseKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReversableInterfaceReference__TypeAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReversableInterfaceReferenceAccess().getTypeComponentInterfaceCrossReference_1_0()); }
		(
			{ before(grammarAccess.getReversableInterfaceReferenceAccess().getTypeComponentInterfaceQualifiedReferenceParserRuleCall_1_0_1()); }
			ruleQualifiedReference
			{ after(grammarAccess.getReversableInterfaceReferenceAccess().getTypeComponentInterfaceQualifiedReferenceParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getReversableInterfaceReferenceAccess().getTypeComponentInterfaceCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReversableTypeReference__ReverseAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReversableTypeReferenceAccess().getReverseReverseKeyword_0_0()); }
		(
			{ before(grammarAccess.getReversableTypeReferenceAccess().getReverseReverseKeyword_0_0()); }
			'reverse'
			{ after(grammarAccess.getReversableTypeReferenceAccess().getReverseReverseKeyword_0_0()); }
		)
		{ after(grammarAccess.getReversableTypeReferenceAccess().getReverseReverseKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReversableTypeReference__TypeAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReversableTypeReferenceAccess().getTypeNamedTypeCrossReference_1_0()); }
		(
			{ before(grammarAccess.getReversableTypeReferenceAccess().getTypeNamedTypeQualifiedReferenceParserRuleCall_1_0_1()); }
			ruleQualifiedReference
			{ after(grammarAccess.getReversableTypeReferenceAccess().getTypeNamedTypeQualifiedReferenceParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getReversableTypeReferenceAccess().getTypeNamedTypeCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierOrTypeReference__TypeAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClassifierOrTypeReferenceAccess().getTypeNamedTypeCrossReference_0_0()); }
		(
			{ before(grammarAccess.getClassifierOrTypeReferenceAccess().getTypeNamedTypeQualifiedTypesReferenceParserRuleCall_0_0_1()); }
			ruleQualifiedTypesReference
			{ after(grammarAccess.getClassifierOrTypeReferenceAccess().getTypeNamedTypeQualifiedTypesReferenceParserRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getClassifierOrTypeReferenceAccess().getTypeNamedTypeCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeReference__TypeAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeReferenceAccess().getTypeNamedTypeCrossReference_0()); }
		(
			{ before(grammarAccess.getTypeReferenceAccess().getTypeNamedTypeQualifiedNameParserRuleCall_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getTypeReferenceAccess().getTypeNamedTypeQualifiedNameParserRuleCall_0_1()); }
		)
		{ after(grammarAccess.getTypeReferenceAccess().getTypeNamedTypeCrossReference_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationType__LiteralsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_3_0()); }
		ruleEnumerationLiteral
		{ after(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeType__CompositeTypeAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCompositeTypeAccess().getCompositeTypeCompositeParserRuleCall_0_0()); }
		ruleComposite
		{ after(grammarAccess.getCompositeTypeAccess().getCompositeTypeCompositeParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeType__TypeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCompositeTypeAccess().getTypeTypeReferenceParserRuleCall_2_0()); }
		ruleTypeReference
		{ after(grammarAccess.getCompositeTypeAccess().getTypeTypeReferenceParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimitiveType__PrimitiveTypeAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimitiveTypeAccess().getPrimitiveTypePrimitiveParserRuleCall_0()); }
		rulePrimitive
		{ after(grammarAccess.getPrimitiveTypeAccess().getPrimitiveTypePrimitiveParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplementationReference__TypeAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImplementationReferenceAccess().getTypeComponentImplementationCrossReference_0()); }
		(
			{ before(grammarAccess.getImplementationReferenceAccess().getTypeComponentImplementationQualifiedDottedReferenceParserRuleCall_0_1()); }
			ruleQualifiedDottedReference
			{ after(grammarAccess.getImplementationReferenceAccess().getTypeComponentImplementationQualifiedDottedReferenceParserRuleCall_0_1()); }
		)
		{ after(grammarAccess.getImplementationReferenceAccess().getTypeComponentImplementationCrossReference_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefaultAnnexSubclause__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefaultAnnexSubclauseAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getDefaultAnnexSubclauseAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefaultAnnexSubclause__BodyAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefaultAnnexSubclauseAccess().getBodyANNEXTEXTTerminalRuleCall_2_0()); }
		RULE_ANNEXTEXT
		{ after(grammarAccess.getDefaultAnnexSubclauseAccess().getBodyANNEXTEXTTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertiesBlock__OwnedPropertyAssociationsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertiesBlockAccess().getOwnedPropertyAssociationsPropertyAssociationParserRuleCall_1_0()); }
		rulePropertyAssociation
		{ after(grammarAccess.getPropertiesBlockAccess().getOwnedPropertyAssociationsPropertyAssociationParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedImplementationElement__FeaturesAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNestedImplementationElementAccess().getFeaturesFeatureParserRuleCall_0_0()); }
		ruleFeature
		{ after(grammarAccess.getNestedImplementationElementAccess().getFeaturesFeatureParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedImplementationElement__ConnectionsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNestedImplementationElementAccess().getConnectionsConnectionParserRuleCall_1_0()); }
		ruleConnection
		{ after(grammarAccess.getNestedImplementationElementAccess().getConnectionsConnectionParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedImplementationElement__BindingsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNestedImplementationElementAccess().getBindingsBindingParserRuleCall_2_0()); }
		ruleBinding
		{ after(grammarAccess.getNestedImplementationElementAccess().getBindingsBindingParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedImplementationElement__ComponentsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNestedImplementationElementAccess().getComponentsSubcomponentParserRuleCall_3_0()); }
		ruleSubcomponent
		{ after(grammarAccess.getNestedImplementationElementAccess().getComponentsSubcomponentParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedImplementationElement__OwnedPropertyAssociationsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNestedImplementationElementAccess().getOwnedPropertyAssociationsPropertyAssociationParserRuleCall_4_0()); }
		rulePropertyAssociation
		{ after(grammarAccess.getNestedImplementationElementAccess().getOwnedPropertyAssociationsPropertyAssociationParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationExtensions__SuperClassifiersAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigurationExtensionsAccess().getSuperClassifiersClassifierOrTypeReferenceParserRuleCall_0_0()); }
		ruleClassifierOrTypeReference
		{ after(grammarAccess.getConfigurationExtensionsAccess().getSuperClassifiersClassifierOrTypeReferenceParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationExtensions__SuperClassifiersAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigurationExtensionsAccess().getSuperClassifiersClassifierOrTypeReferenceParserRuleCall_1_1_0()); }
		ruleClassifierOrTypeReference
		{ after(grammarAccess.getConfigurationExtensionsAccess().getSuperClassifiersClassifierOrTypeReferenceParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplementationExtensions__SuperClassifiersAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImplementationExtensionsAccess().getSuperClassifiersImplementationReferenceParserRuleCall_0_0()); }
		ruleImplementationReference
		{ after(grammarAccess.getImplementationExtensionsAccess().getSuperClassifiersImplementationReferenceParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplementationExtensions__SuperClassifiersAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImplementationExtensionsAccess().getSuperClassifiersImplementationReferenceParserRuleCall_1_1_0()); }
		ruleImplementationReference
		{ after(grammarAccess.getImplementationExtensionsAccess().getSuperClassifiersImplementationReferenceParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InterfaceExtensions__SuperClassifiersAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInterfaceExtensionsAccess().getSuperClassifiersReversableInterfaceReferenceParserRuleCall_0_0()); }
		ruleReversableInterfaceReference
		{ after(grammarAccess.getInterfaceExtensionsAccess().getSuperClassifiersReversableInterfaceReferenceParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InterfaceExtensions__SuperClassifiersAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInterfaceExtensionsAccess().getSuperClassifiersReversableInterfaceReferenceParserRuleCall_1_1_0()); }
		ruleReversableInterfaceReference
		{ after(grammarAccess.getInterfaceExtensionsAccess().getSuperClassifiersReversableInterfaceReferenceParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationActuals__ActualsAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigurationActualsAccess().getActualsConfigurationActualParserRuleCall_1_0_0()); }
		ruleConfigurationActual
		{ after(grammarAccess.getConfigurationActualsAccess().getActualsConfigurationActualParserRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationActuals__ActualsAssignment_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigurationActualsAccess().getActualsConfigurationActualParserRuleCall_1_1_1_0()); }
		ruleConfigurationActual
		{ after(grammarAccess.getConfigurationActualsAccess().getActualsConfigurationActualParserRuleCall_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationActual__ParameterAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigurationActualAccess().getParameterConfigurationParameterCrossReference_0_0()); }
		(
			{ before(grammarAccess.getConfigurationActualAccess().getParameterConfigurationParameterIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getConfigurationActualAccess().getParameterConfigurationParameterIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getConfigurationActualAccess().getParameterConfigurationParameterCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationActual__AssignedClassifiersAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigurationActualAccess().getAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_2_0()); }
		ruleClassifierOrTypeReference
		{ after(grammarAccess.getConfigurationActualAccess().getAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationActual__AssignedClassifiersAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigurationActualAccess().getAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_3_1_0()); }
		ruleClassifierOrTypeReference
		{ after(grammarAccess.getConfigurationActualAccess().getAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Workingset__PrivateAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWorkingsetAccess().getPrivatePrivateKeyword_0_0()); }
		(
			{ before(grammarAccess.getWorkingsetAccess().getPrivatePrivateKeyword_0_0()); }
			'private'
			{ after(grammarAccess.getWorkingsetAccess().getPrivatePrivateKeyword_0_0()); }
		)
		{ after(grammarAccess.getWorkingsetAccess().getPrivatePrivateKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Workingset__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWorkingsetAccess().getNameQualifiedNameParserRuleCall_2_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getWorkingsetAccess().getNameQualifiedNameParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Workingset__InstanceRootsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWorkingsetAccess().getInstanceRootsInstanceConfigurationParserRuleCall_5_0()); }
		ruleInstanceConfiguration
		{ after(grammarAccess.getWorkingsetAccess().getInstanceRootsInstanceConfigurationParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InstanceConfiguration__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInstanceConfigurationAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getInstanceConfigurationAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InstanceConfiguration__CategoryAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInstanceConfigurationAccess().getCategoryComponentCategoryParserRuleCall_3_0()); }
		ruleComponentCategory
		{ after(grammarAccess.getInstanceConfigurationAccess().getCategoryComponentCategoryParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InstanceConfiguration__TypeReferencesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInstanceConfigurationAccess().getTypeReferencesClassifierOrTypeReferenceParserRuleCall_4_0()); }
		ruleClassifierOrTypeReference
		{ after(grammarAccess.getInstanceConfigurationAccess().getTypeReferencesClassifierOrTypeReferenceParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InstanceConfiguration__ActionsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInstanceConfigurationAccess().getActionsSTRINGTerminalRuleCall_5_0()); }
		RULE_STRING
		{ after(grammarAccess.getInstanceConfigurationAccess().getActionsSTRINGTerminalRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InstanceConfiguration__ProductlineConstraintAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInstanceConfigurationAccess().getProductlineConstraintProductLineConstraintParserRuleCall_6_0()); }
		ruleProductLineConstraint
		{ after(grammarAccess.getInstanceConfigurationAccess().getProductlineConstraintProductLineConstraintParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductLineConstraint__LeftAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProductLineConstraintAccess().getLeftPropertyReferenceParserRuleCall_2_0()); }
		rulePropertyReference
		{ after(grammarAccess.getProductLineConstraintAccess().getLeftPropertyReferenceParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductLineConstraint__OperatorAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProductLineConstraintAccess().getOperatorSatisfiesOperationParserRuleCall_3_0()); }
		ruleSatisfiesOperation
		{ after(grammarAccess.getProductLineConstraintAccess().getOperatorSatisfiesOperationParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProductLineConstraint__RightAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProductLineConstraintAccess().getRightListLiteralParserRuleCall_4_0()); }
		ruleListLiteral
		{ after(grammarAccess.getProductLineConstraintAccess().getRightListLiteralParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BehaviorAnnotationBlock__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBehaviorAnnotationBlockAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getBehaviorAnnotationBlockAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BehaviorAnnotationElement__ElementsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBehaviorAnnotationElementAccess().getElementsAlternatives_0()); }
		(rule__BehaviorAnnotationElement__ElementsAlternatives_0)
		{ after(grammarAccess.getBehaviorAnnotationElementAccess().getElementsAlternatives_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateVariable__AnnotationsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateVariableAccess().getAnnotationsAnnotationParserRuleCall_0_0()); }
		ruleAnnotation
		{ after(grammarAccess.getStateVariableAccess().getAnnotationsAnnotationParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateVariable__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateVariableAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getStateVariableAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateVariable__StateTypeAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateVariableAccess().getStateTypeTypeDefCrossReference_4_0()); }
		(
			{ before(grammarAccess.getStateVariableAccess().getStateTypeTypeDefQualifiedNameParserRuleCall_4_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getStateVariableAccess().getStateTypeTypeDefQualifiedNameParserRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getStateVariableAccess().getStateTypeTypeDefCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateVariable__InitialStateAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateVariableAccess().getInitialStateEnumerationLiteralParserRuleCall_5_1_0()); }
		ruleEnumerationLiteral
		{ after(grammarAccess.getStateVariableAccess().getInitialStateEnumerationLiteralParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Generator__AnnotationsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGeneratorAccess().getAnnotationsAnnotationParserRuleCall_0_0()); }
		ruleAnnotation
		{ after(grammarAccess.getGeneratorAccess().getAnnotationsAnnotationParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Generator__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGeneratorAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getGeneratorAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Generator__ValueAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGeneratorAccess().getValueListLiteralParserRuleCall_4_0()); }
		ruleListLiteral
		{ after(grammarAccess.getGeneratorAccess().getValueListLiteralParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateTransition__AnnotationsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateTransitionAccess().getAnnotationsAnnotationParserRuleCall_0_0()); }
		ruleAnnotation
		{ after(grammarAccess.getStateTransitionAccess().getAnnotationsAnnotationParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateTransition__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateTransitionAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getStateTransitionAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateTransition__ConditionAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateTransitionAccess().getConditionAlternatives_4_0()); }
		(rule__StateTransition__ConditionAlternatives_4_0)
		{ after(grammarAccess.getStateTransitionAccess().getConditionAlternatives_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateTransition__TargetStateAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateTransitionAccess().getTargetStateModelElementEqualsEnumerationLiteralParserRuleCall_6_0()); }
		ruleModelElementEqualsEnumerationLiteral
		{ after(grammarAccess.getStateTransitionAccess().getTargetStateModelElementEqualsEnumerationLiteralParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateSynchronization__AnnotationsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateSynchronizationAccess().getAnnotationsAnnotationParserRuleCall_0_0()); }
		ruleAnnotation
		{ after(grammarAccess.getStateSynchronizationAccess().getAnnotationsAnnotationParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateSynchronization__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateSynchronizationAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getStateSynchronizationAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateSynchronization__ConditionAssignment_4_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateSynchronizationAccess().getConditionAlternatives_4_0_0_0()); }
		(rule__StateSynchronization__ConditionAlternatives_4_0_0_0)
		{ after(grammarAccess.getStateSynchronizationAccess().getConditionAlternatives_4_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateSynchronization__TargetStateAssignment_4_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateSynchronizationAccess().getTargetStateModelElementEqualsEnumerationLiteralParserRuleCall_4_0_2_0()); }
		ruleModelElementEqualsEnumerationLiteral
		{ after(grammarAccess.getStateSynchronizationAccess().getTargetStateModelElementEqualsEnumerationLiteralParserRuleCall_4_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateSynchronization__TargetStateAssignment_4_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateSynchronizationAccess().getTargetStateModelElementEqualsEnumerationLiteralParserRuleCall_4_1_0_0()); }
		ruleModelElementEqualsEnumerationLiteral
		{ after(grammarAccess.getStateSynchronizationAccess().getTargetStateModelElementEqualsEnumerationLiteralParserRuleCall_4_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateSynchronization__ConditionAssignment_4_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateSynchronizationAccess().getConditionAlternatives_4_1_2_0()); }
		(rule__StateSynchronization__ConditionAlternatives_4_1_2_0)
		{ after(grammarAccess.getStateSynchronizationAccess().getConditionAlternatives_4_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenFlow__AnnotationsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTokenFlowAccess().getAnnotationsAnnotationParserRuleCall_0_0()); }
		ruleAnnotation
		{ after(grammarAccess.getTokenFlowAccess().getAnnotationsAnnotationParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenFlow__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTokenFlowAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTokenFlowAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenFlow__CategoryAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTokenFlowAccess().getCategoryIsFlowCategoryParserRuleCall_3_0()); }
		ruleIsFlowCategory
		{ after(grammarAccess.getTokenFlowAccess().getCategoryIsFlowCategoryParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenFlow__SourceAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTokenFlowAccess().getSourceSourceKeyword_4_0()); }
		(
			{ before(grammarAccess.getTokenFlowAccess().getSourceSourceKeyword_4_0()); }
			'source'
			{ after(grammarAccess.getTokenFlowAccess().getSourceSourceKeyword_4_0()); }
		)
		{ after(grammarAccess.getTokenFlowAccess().getSourceSourceKeyword_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenFlow__ConditionAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTokenFlowAccess().getConditionAlternatives_5_0()); }
		(rule__TokenFlow__ConditionAlternatives_5_0)
		{ after(grammarAccess.getTokenFlowAccess().getConditionAlternatives_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenFlow__SinkAssignment_7_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTokenFlowAccess().getSinkSinkKeyword_7_0_0()); }
		(
			{ before(grammarAccess.getTokenFlowAccess().getSinkSinkKeyword_7_0_0()); }
			'sink'
			{ after(grammarAccess.getTokenFlowAccess().getSinkSinkKeyword_7_0_0()); }
		)
		{ after(grammarAccess.getTokenFlowAccess().getSinkSinkKeyword_7_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComputationalBehavior__AnnotationsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComputationalBehaviorAccess().getAnnotationsAnnotationParserRuleCall_0_0()); }
		ruleAnnotation
		{ after(grammarAccess.getComputationalBehaviorAccess().getAnnotationsAnnotationParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComputationalBehavior__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComputationalBehaviorAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getComputationalBehaviorAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComputationalBehavior__CategoryAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComputationalBehaviorAccess().getCategoryIsBehaviorCategoryParserRuleCall_3_0()); }
		ruleIsBehaviorCategory
		{ after(grammarAccess.getComputationalBehaviorAccess().getCategoryIsBehaviorCategoryParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComputationalBehavior__ConditionAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComputationalBehaviorAccess().getConditionLiteralParserRuleCall_4_0()); }
		ruleLiteral
		{ after(grammarAccess.getComputationalBehaviorAccess().getConditionLiteralParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenResultBlock__ActionsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTokenResultBlockAccess().getActionsTokenResultParserRuleCall_0_0()); }
		ruleTokenResult
		{ after(grammarAccess.getTokenResultBlockAccess().getActionsTokenResultParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenResultBlock__ActionsAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTokenResultBlockAccess().getActionsTokenResultParserRuleCall_1_1_0()); }
		ruleTokenResult
		{ after(grammarAccess.getTokenResultBlockAccess().getActionsTokenResultParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenOutput__LeftAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTokenOutputAccess().getLeftModelElementReferenceParserRuleCall_0_0()); }
		ruleModelElementReference
		{ after(grammarAccess.getTokenOutputAccess().getLeftModelElementReferenceParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenOutput__OperatorAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTokenOutputAccess().getOperatorEqualsOperationParserRuleCall_1_0_0()); }
		ruleEqualsOperation
		{ after(grammarAccess.getTokenOutputAccess().getOperatorEqualsOperationParserRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TokenOutput__RightAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTokenOutputAccess().getRightNamedElementReferenceParserRuleCall_1_1_0()); }
		ruleNamedElementReference
		{ after(grammarAccess.getTokenOutputAccess().getRightNamedElementReferenceParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DetectionEvent__LeftAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDetectionEventAccess().getLeftModelElementReferenceParserRuleCall_0_0()); }
		ruleModelElementReference
		{ after(grammarAccess.getDetectionEventAccess().getLeftModelElementReferenceParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DetectionEvent__OperatorAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDetectionEventAccess().getOperatorOutputOperationParserRuleCall_1_0()); }
		ruleOutputOperation
		{ after(grammarAccess.getDetectionEventAccess().getOperatorOutputOperationParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DetectionEvent__RightAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDetectionEventAccess().getRightListLiteralParserRuleCall_2_0()); }
		ruleListLiteral
		{ after(grammarAccess.getDetectionEventAccess().getRightListLiteralParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementContainsLiteral__LeftAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelElementContainsLiteralAccess().getLeftModelElementReferenceParserRuleCall_0_0()); }
		ruleModelElementReference
		{ after(grammarAccess.getModelElementContainsLiteralAccess().getLeftModelElementReferenceParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementContainsLiteral__OperatorAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelElementContainsLiteralAccess().getOperatorInOperationParserRuleCall_1_0()); }
		ruleInOperation
		{ after(grammarAccess.getModelElementContainsLiteralAccess().getOperatorInOperationParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementContainsLiteral__RightAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelElementContainsLiteralAccess().getRightListLiteralParserRuleCall_2_0()); }
		ruleListLiteral
		{ after(grammarAccess.getModelElementContainsLiteralAccess().getRightListLiteralParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementContainsEnumerationLiteral__LeftAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelElementContainsEnumerationLiteralAccess().getLeftModelElementReferenceParserRuleCall_0_0()); }
		ruleModelElementReference
		{ after(grammarAccess.getModelElementContainsEnumerationLiteralAccess().getLeftModelElementReferenceParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementContainsEnumerationLiteral__OperatorAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelElementContainsEnumerationLiteralAccess().getOperatorInOperationParserRuleCall_1_0()); }
		ruleInOperation
		{ after(grammarAccess.getModelElementContainsEnumerationLiteralAccess().getOperatorInOperationParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementContainsEnumerationLiteral__RightAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelElementContainsEnumerationLiteralAccess().getRightEnumerationListParserRuleCall_2_0()); }
		ruleEnumerationList
		{ after(grammarAccess.getModelElementContainsEnumerationLiteralAccess().getRightEnumerationListParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementEqualsLiteral__LeftAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelElementEqualsLiteralAccess().getLeftModelElementReferenceParserRuleCall_0_0()); }
		ruleModelElementReference
		{ after(grammarAccess.getModelElementEqualsLiteralAccess().getLeftModelElementReferenceParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementEqualsLiteral__OperatorAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelElementEqualsLiteralAccess().getOperatorEqualsOperationParserRuleCall_1_0()); }
		ruleEqualsOperation
		{ after(grammarAccess.getModelElementEqualsLiteralAccess().getOperatorEqualsOperationParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementEqualsLiteral__RightAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelElementEqualsLiteralAccess().getRightNamedElementReferenceParserRuleCall_2_0()); }
		ruleNamedElementReference
		{ after(grammarAccess.getModelElementEqualsLiteralAccess().getRightNamedElementReferenceParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementEqualsEnumerationLiteral__LeftAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelElementEqualsEnumerationLiteralAccess().getLeftModelElementReferenceParserRuleCall_0_0()); }
		ruleModelElementReference
		{ after(grammarAccess.getModelElementEqualsEnumerationLiteralAccess().getLeftModelElementReferenceParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementEqualsEnumerationLiteral__OperatorAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelElementEqualsEnumerationLiteralAccess().getOperatorEqualsOperationParserRuleCall_1_0()); }
		ruleEqualsOperation
		{ after(grammarAccess.getModelElementEqualsEnumerationLiteralAccess().getOperatorEqualsOperationParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelElementEqualsEnumerationLiteral__RightAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelElementEqualsEnumerationLiteralAccess().getRightEnumerationLiteralParserRuleCall_2_0()); }
		ruleEnumerationLiteral
		{ after(grammarAccess.getModelElementEqualsEnumerationLiteralAccess().getRightEnumerationLiteralParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnnotationAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getAnnotationAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__ParametersAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnnotationAccess().getParametersAnnotationParameterParserRuleCall_2_1_0()); }
		ruleAnnotationParameter
		{ after(grammarAccess.getAnnotationAccess().getParametersAnnotationParameterParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__ParametersAssignment_2_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnnotationAccess().getParametersAnnotationParameterParserRuleCall_2_2_1_0()); }
		ruleAnnotationParameter
		{ after(grammarAccess.getAnnotationAccess().getParametersAnnotationParameterParserRuleCall_2_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationParameter__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnnotationParameterAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getAnnotationParameterAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationParameter__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnnotationParameterAccess().getValueLiteralParserRuleCall_2_0()); }
		ruleLiteral
		{ after(grammarAccess.getAnnotationParameterAccess().getValueLiteralParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyReference__ElementAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyReferenceAccess().getElementPackageElementCrossReference_1_0()); }
		(
			{ before(grammarAccess.getPropertyReferenceAccess().getElementPackageElementQualifiedNameParserRuleCall_1_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getPropertyReferenceAccess().getElementPackageElementQualifiedNameParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getPropertyReferenceAccess().getElementPackageElementCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerLiteral__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_1_0()); }
		RULE_INT
		{ after(grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerLiteral__UnitAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerLiteralAccess().getUnitIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getIntegerLiteralAccess().getUnitIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RealLiteral__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRealLiteralAccess().getValueDOUBLETerminalRuleCall_1_0()); }
		RULE_DOUBLE
		{ after(grammarAccess.getRealLiteralAccess().getValueDOUBLETerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RealLiteral__UnitAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRealLiteralAccess().getUnitIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getRealLiteralAccess().getUnitIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringLiteral__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringLiteralAccess().getValueNoQuoteStringParserRuleCall_1_0()); }
		ruleNoQuoteString
		{ after(grammarAccess.getStringLiteralAccess().getValueNoQuoteStringParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationLiteral__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanLiteral__ValueAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_1_0_0()); }
		(
			{ before(grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_1_0_0()); }
			'true'
			{ after(grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_1_0_0()); }
		)
		{ after(grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ListLiteral__ElementsAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getListLiteralAccess().getElementsLiteralParserRuleCall_2_0_0()); }
		ruleLiteral
		{ after(grammarAccess.getListLiteralAccess().getElementsLiteralParserRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ListLiteral__ElementsAssignment_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getListLiteralAccess().getElementsLiteralParserRuleCall_2_1_1_0()); }
		ruleLiteral
		{ after(grammarAccess.getListLiteralAccess().getElementsLiteralParserRuleCall_2_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationList__ElementsAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumerationListAccess().getElementsEnumerationLiteralParserRuleCall_2_0_0()); }
		ruleEnumerationLiteral
		{ after(grammarAccess.getEnumerationListAccess().getElementsEnumerationLiteralParserRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationList__ElementsAssignment_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumerationListAccess().getElementsEnumerationLiteralParserRuleCall_2_1_1_0()); }
		ruleEnumerationLiteral
		{ after(grammarAccess.getEnumerationListAccess().getElementsEnumerationLiteralParserRuleCall_2_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SetLiteral__ElementsAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSetLiteralAccess().getElementsLiteralParserRuleCall_2_0_0()); }
		ruleLiteral
		{ after(grammarAccess.getSetLiteralAccess().getElementsLiteralParserRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SetLiteral__ElementsAssignment_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSetLiteralAccess().getElementsLiteralParserRuleCall_2_1_1_0()); }
		ruleLiteral
		{ after(grammarAccess.getSetLiteralAccess().getElementsLiteralParserRuleCall_2_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DirectionalLiteral__DirectionAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDirectionalLiteralAccess().getDirectionPropagationDirectionParserRuleCall_1_0()); }
		rulePropagationDirection
		{ after(grammarAccess.getDirectionalLiteralAccess().getDirectionPropagationDirectionParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DirectionalLiteral__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDirectionalLiteralAccess().getValueLiteralParserRuleCall_2_0()); }
		ruleLiteral
		{ after(grammarAccess.getDirectionalLiteralAccess().getValueLiteralParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiLiteralOperation__OperatorAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMultiLiteralOperationAccess().getOperatorEOperationParserRuleCall_1_0()); }
		ruleEOperation
		{ after(grammarAccess.getMultiLiteralOperationAccess().getOperatorEOperationParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiLiteralOperation__ElementsAssignment_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMultiLiteralOperationAccess().getElementsLiteralParserRuleCall_3_0_0()); }
		ruleLiteral
		{ after(grammarAccess.getMultiLiteralOperationAccess().getElementsLiteralParserRuleCall_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiLiteralOperation__ElementsAssignment_3_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMultiLiteralOperationAccess().getElementsLiteralParserRuleCall_3_1_1_0()); }
		ruleLiteral
		{ after(grammarAccess.getMultiLiteralOperationAccess().getElementsLiteralParserRuleCall_3_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_DOUBLE : ('0'..'9')+ '.' ('0'..'9')+;

RULE_ANNEXTEXT : '{*' ( options {greedy=false;} : . )*'*}';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
