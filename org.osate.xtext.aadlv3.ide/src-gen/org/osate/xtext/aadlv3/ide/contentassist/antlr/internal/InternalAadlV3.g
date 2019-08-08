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

// Entry rule entryRuleTypeDecl
entryRuleTypeDecl
:
{ before(grammarAccess.getTypeDeclRule()); }
	 ruleTypeDecl
{ after(grammarAccess.getTypeDeclRule()); } 
	 EOF 
;

// Rule TypeDecl
ruleTypeDecl 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeDeclAccess().getGroup()); }
		(rule__TypeDecl__Group__0)
		{ after(grammarAccess.getTypeDeclAccess().getGroup()); }
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

// Entry rule entryRuleFlowPath
entryRuleFlowPath
:
{ before(grammarAccess.getFlowPathRule()); }
	 ruleFlowPath
{ after(grammarAccess.getFlowPathRule()); } 
	 EOF 
;

// Rule FlowPath
ruleFlowPath 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFlowPathAccess().getGroup()); }
		(rule__FlowPath__Group__0)
		{ after(grammarAccess.getFlowPathAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFlowSource
entryRuleFlowSource
:
{ before(grammarAccess.getFlowSourceRule()); }
	 ruleFlowSource
{ after(grammarAccess.getFlowSourceRule()); } 
	 EOF 
;

// Rule FlowSource
ruleFlowSource 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFlowSourceAccess().getGroup()); }
		(rule__FlowSource__Group__0)
		{ after(grammarAccess.getFlowSourceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFlowSink
entryRuleFlowSink
:
{ before(grammarAccess.getFlowSinkRule()); }
	 ruleFlowSink
{ after(grammarAccess.getFlowSinkRule()); } 
	 EOF 
;

// Rule FlowSink
ruleFlowSink 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFlowSinkAccess().getGroup()); }
		(rule__FlowSink__Group__0)
		{ after(grammarAccess.getFlowSinkAccess().getGroup()); }
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

// Entry rule entryRulePropagations
entryRulePropagations
:
{ before(grammarAccess.getPropagationsRule()); }
	 rulePropagations
{ after(grammarAccess.getPropagationsRule()); } 
	 EOF 
;

// Rule Propagations
rulePropagations 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPropagationsAccess().getGroup()); }
		(rule__Propagations__Group__0)
		{ after(grammarAccess.getPropagationsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEPropagations
entryRuleEPropagations
:
{ before(grammarAccess.getEPropagationsRule()); }
	 ruleEPropagations
{ after(grammarAccess.getEPropagationsRule()); } 
	 EOF 
;

// Rule EPropagations
ruleEPropagations 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEPropagationsAccess().getGroup()); }
		(rule__EPropagations__Group__0)
		{ after(grammarAccess.getEPropagationsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePath
entryRulePath
:
{ before(grammarAccess.getPathRule()); }
	 rulePath
{ after(grammarAccess.getPathRule()); } 
	 EOF 
;

// Rule Path
rulePath 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPathAccess().getGroup()); }
		(rule__Path__Group__0)
		{ after(grammarAccess.getPathAccess().getGroup()); }
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
		{ before(grammarAccess.getTypeReferenceAccess().getGroup()); }
		(rule__TypeReference__Group__0)
		{ after(grammarAccess.getTypeReferenceAccess().getGroup()); }
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
		{ before(grammarAccess.getAnnexSubclauseAccess().getGroup()); }
		(rule__AnnexSubclause__Group__0)
		{ after(grammarAccess.getAnnexSubclauseAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAnnexElement
entryRuleAnnexElement
:
{ before(grammarAccess.getAnnexElementRule()); }
	 ruleAnnexElement
{ after(grammarAccess.getAnnexElementRule()); } 
	 EOF 
;

// Rule AnnexElement
ruleAnnexElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAnnexElementAccess().getGroup()); }
		(rule__AnnexElement__Group__0)
		{ after(grammarAccess.getAnnexElementAccess().getGroup()); }
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

// Entry rule entryRuleIsFlowSource
entryRuleIsFlowSource
:
{ before(grammarAccess.getIsFlowSourceRule()); }
	 ruleIsFlowSource
{ after(grammarAccess.getIsFlowSourceRule()); } 
	 EOF 
;

// Rule IsFlowSource
ruleIsFlowSource 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIsFlowSourceAccess().getFlowSourceKeywordsParserRuleCall()); }
		ruleFlowSourceKeywords
		{ after(grammarAccess.getIsFlowSourceAccess().getFlowSourceKeywordsParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIsFlowSink
entryRuleIsFlowSink
:
{ before(grammarAccess.getIsFlowSinkRule()); }
	 ruleIsFlowSink
{ after(grammarAccess.getIsFlowSinkRule()); } 
	 EOF 
;

// Rule IsFlowSink
ruleIsFlowSink 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIsFlowSinkAccess().getFlowSinkKeywordsParserRuleCall()); }
		ruleFlowSinkKeywords
		{ after(grammarAccess.getIsFlowSinkAccess().getFlowSinkKeywordsParserRuleCall()); }
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

// Entry rule entryRuleFlowSourceKeywords
entryRuleFlowSourceKeywords
:
{ before(grammarAccess.getFlowSourceKeywordsRule()); }
	 ruleFlowSourceKeywords
{ after(grammarAccess.getFlowSourceKeywordsRule()); } 
	 EOF 
;

// Rule FlowSourceKeywords
ruleFlowSourceKeywords 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFlowSourceKeywordsAccess().getGroup()); }
		(rule__FlowSourceKeywords__Group__0)
		{ after(grammarAccess.getFlowSourceKeywordsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFlowSinkKeywords
entryRuleFlowSinkKeywords
:
{ before(grammarAccess.getFlowSinkKeywordsRule()); }
	 ruleFlowSinkKeywords
{ after(grammarAccess.getFlowSinkKeywordsRule()); } 
	 EOF 
;

// Rule FlowSinkKeywords
ruleFlowSinkKeywords 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFlowSinkKeywordsAccess().getGroup()); }
		(rule__FlowSinkKeywords__Group__0)
		{ after(grammarAccess.getFlowSinkKeywordsAccess().getGroup()); }
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

rule__PackageDeclaration__Alternatives_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_4_0()); }
		(rule__PackageDeclaration__ElementsAssignment_4_0)
		{ after(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_4_0()); }
	)
	|
	(
		{ before(grammarAccess.getPackageDeclarationAccess().getAlternatives_4_1()); }
		(rule__PackageDeclaration__Alternatives_4_1)*
		{ after(grammarAccess.getPackageDeclarationAccess().getAlternatives_4_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDeclaration__Alternatives_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPackageDeclarationAccess().getImportsAssignment_4_1_0()); }
		(rule__PackageDeclaration__ImportsAssignment_4_1_0)
		{ after(grammarAccess.getPackageDeclarationAccess().getImportsAssignment_4_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_4_1_1()); }
		(rule__PackageDeclaration__ElementsAssignment_4_1_1)
		{ after(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_4_1_1()); }
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
		{ before(grammarAccess.getPackageElementAccess().getTypeDeclParserRuleCall_7()); }
		ruleTypeDecl
		{ after(grammarAccess.getPackageElementAccess().getTypeDeclParserRuleCall_7()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Alternatives_5_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyDefinitionAccess().getForAllAssignment_5_2_0()); }
		(rule__PropertyDefinition__ForAllAssignment_5_2_0)
		{ after(grammarAccess.getPropertyDefinitionAccess().getForAllAssignment_5_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyDefinitionAccess().getGroup_5_2_1()); }
		(rule__PropertyDefinition__Group_5_2_1__0)
		{ after(grammarAccess.getPropertyDefinitionAccess().getGroup_5_2_1()); }
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
		{ before(grammarAccess.getInterfaceElementAccess().getFeaturesAssignment_0()); }
		(rule__InterfaceElement__FeaturesAssignment_0)
		{ after(grammarAccess.getInterfaceElementAccess().getFeaturesAssignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getInterfaceElementAccess().getFlowsAssignment_1()); }
		(rule__InterfaceElement__FlowsAssignment_1)
		{ after(grammarAccess.getInterfaceElementAccess().getFlowsAssignment_1()); }
	)
	|
	(
		{ before(grammarAccess.getInterfaceElementAccess().getFlowsAssignment_2()); }
		(rule__InterfaceElement__FlowsAssignment_2)
		{ after(grammarAccess.getInterfaceElementAccess().getFlowsAssignment_2()); }
	)
	|
	(
		{ before(grammarAccess.getInterfaceElementAccess().getFlowsAssignment_3()); }
		(rule__InterfaceElement__FlowsAssignment_3)
		{ after(grammarAccess.getInterfaceElementAccess().getFlowsAssignment_3()); }
	)
	|
	(
		{ before(grammarAccess.getInterfaceElementAccess().getOwnedPropertyAssociationsAssignment_4()); }
		(rule__InterfaceElement__OwnedPropertyAssociationsAssignment_4)
		{ after(grammarAccess.getInterfaceElementAccess().getOwnedPropertyAssociationsAssignment_4()); }
	)
	|
	(
		{ before(grammarAccess.getInterfaceElementAccess().getAnnexSubclauseAssignment_5()); }
		(rule__InterfaceElement__AnnexSubclauseAssignment_5)
		{ after(grammarAccess.getInterfaceElementAccess().getAnnexSubclauseAssignment_5()); }
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
		{ before(grammarAccess.getImplementationElementAccess().getConnectionsAssignment_0()); }
		(rule__ImplementationElement__ConnectionsAssignment_0)
		{ after(grammarAccess.getImplementationElementAccess().getConnectionsAssignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getImplementationElementAccess().getBindingsAssignment_1()); }
		(rule__ImplementationElement__BindingsAssignment_1)
		{ after(grammarAccess.getImplementationElementAccess().getBindingsAssignment_1()); }
	)
	|
	(
		{ before(grammarAccess.getImplementationElementAccess().getComponentsAssignment_2()); }
		(rule__ImplementationElement__ComponentsAssignment_2)
		{ after(grammarAccess.getImplementationElementAccess().getComponentsAssignment_2()); }
	)
	|
	(
		{ before(grammarAccess.getImplementationElementAccess().getPathsAssignment_3()); }
		(rule__ImplementationElement__PathsAssignment_3)
		{ after(grammarAccess.getImplementationElementAccess().getPathsAssignment_3()); }
	)
	|
	(
		{ before(grammarAccess.getImplementationElementAccess().getFlowAssignmentsAssignment_4()); }
		(rule__ImplementationElement__FlowAssignmentsAssignment_4)
		{ after(grammarAccess.getImplementationElementAccess().getFlowAssignmentsAssignment_4()); }
	)
	|
	(
		{ before(grammarAccess.getImplementationElementAccess().getClassifierAssignmentsAssignment_5()); }
		(rule__ImplementationElement__ClassifierAssignmentsAssignment_5)
		{ after(grammarAccess.getImplementationElementAccess().getClassifierAssignmentsAssignment_5()); }
	)
	|
	(
		{ before(grammarAccess.getImplementationElementAccess().getClassifierAssignmentsAssignment_6()); }
		(rule__ImplementationElement__ClassifierAssignmentsAssignment_6)
		{ after(grammarAccess.getImplementationElementAccess().getClassifierAssignmentsAssignment_6()); }
	)
	|
	(
		{ before(grammarAccess.getImplementationElementAccess().getOwnedPropertyAssociationsAssignment_7()); }
		(rule__ImplementationElement__OwnedPropertyAssociationsAssignment_7)
		{ after(grammarAccess.getImplementationElementAccess().getOwnedPropertyAssociationsAssignment_7()); }
	)
	|
	(
		{ before(grammarAccess.getImplementationElementAccess().getAnnexSubclauseAssignment_8()); }
		(rule__ImplementationElement__AnnexSubclauseAssignment_8)
		{ after(grammarAccess.getImplementationElementAccess().getAnnexSubclauseAssignment_8()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Alternatives_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getPropagationAssignment_5_0()); }
		(rule__Feature__PropagationAssignment_5_0)
		{ after(grammarAccess.getFeatureAccess().getPropagationAssignment_5_0()); }
	)
	|
	(
		{ before(grammarAccess.getFeatureAccess().getPropagationAssignment_5_1()); }
		(rule__Feature__PropagationAssignment_5_1)
		{ after(grammarAccess.getFeatureAccess().getPropagationAssignment_5_1()); }
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
		{ before(grammarAccess.getConfigurationElementAccess().getBindingsAssignment_1()); }
		(rule__ConfigurationElement__BindingsAssignment_1)
		{ after(grammarAccess.getConfigurationElementAccess().getBindingsAssignment_1()); }
	)
	|
	(
		{ before(grammarAccess.getConfigurationElementAccess().getClassifierAssignmentsAssignment_2()); }
		(rule__ConfigurationElement__ClassifierAssignmentsAssignment_2)
		{ after(grammarAccess.getConfigurationElementAccess().getClassifierAssignmentsAssignment_2()); }
	)
	|
	(
		{ before(grammarAccess.getConfigurationElementAccess().getClassifierAssignmentsAssignment_3()); }
		(rule__ConfigurationElement__ClassifierAssignmentsAssignment_3)
		{ after(grammarAccess.getConfigurationElementAccess().getClassifierAssignmentsAssignment_3()); }
	)
	|
	(
		{ before(grammarAccess.getConfigurationElementAccess().getAnnexSubclauseAssignment_4()); }
		(rule__ConfigurationElement__AnnexSubclauseAssignment_4)
		{ after(grammarAccess.getConfigurationElementAccess().getAnnexSubclauseAssignment_4()); }
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
	{ before(grammarAccess.getPackageDeclarationAccess().getPrivateAssignment_0()); }
	(rule__PackageDeclaration__PrivateAssignment_0)?
	{ after(grammarAccess.getPackageDeclarationAccess().getPrivateAssignment_0()); }
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
	{ before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_1()); }
	'package'
	{ after(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_1()); }
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
	{ before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_2()); }
	(rule__PackageDeclaration__NameAssignment_2)
	{ after(grammarAccess.getPackageDeclarationAccess().getNameAssignment_2()); }
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
	{ before(grammarAccess.getPackageDeclarationAccess().getIsKeyword_3()); }
	'is'
	{ after(grammarAccess.getPackageDeclarationAccess().getIsKeyword_3()); }
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
	{ before(grammarAccess.getPackageDeclarationAccess().getAlternatives_4()); }
	(rule__PackageDeclaration__Alternatives_4)
	{ after(grammarAccess.getPackageDeclarationAccess().getAlternatives_4()); }
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
	{ before(grammarAccess.getPackageDeclarationAccess().getEndKeyword_5()); }
	'end'
	{ after(grammarAccess.getPackageDeclarationAccess().getEndKeyword_5()); }
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
	{ before(grammarAccess.getPackageDeclarationAccess().getSemicolonKeyword_6()); }
	';'
	{ after(grammarAccess.getPackageDeclarationAccess().getSemicolonKeyword_6()); }
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
	{ before(grammarAccess.getPropertyDefinitionAccess().getPrivateAssignment_0()); }
	(rule__PropertyDefinition__PrivateAssignment_0)?
	{ after(grammarAccess.getPropertyDefinitionAccess().getPrivateAssignment_0()); }
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
	{ before(grammarAccess.getPropertyDefinitionAccess().getPropertyKeyword_1()); }
	'property'
	{ after(grammarAccess.getPropertyDefinitionAccess().getPropertyKeyword_1()); }
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
	{ before(grammarAccess.getPropertyDefinitionAccess().getNameAssignment_2()); }
	(rule__PropertyDefinition__NameAssignment_2)
	{ after(grammarAccess.getPropertyDefinitionAccess().getNameAssignment_2()); }
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
	{ before(grammarAccess.getPropertyDefinitionAccess().getColonKeyword_3()); }
	':'
	{ after(grammarAccess.getPropertyDefinitionAccess().getColonKeyword_3()); }
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
	{ before(grammarAccess.getPropertyDefinitionAccess().getTypeAssignment_4()); }
	(rule__PropertyDefinition__TypeAssignment_4)
	{ after(grammarAccess.getPropertyDefinitionAccess().getTypeAssignment_4()); }
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
	{ before(grammarAccess.getPropertyDefinitionAccess().getGroup_5()); }
	(rule__PropertyDefinition__Group_5__0)?
	{ after(grammarAccess.getPropertyDefinitionAccess().getGroup_5()); }
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
	{ before(grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_6()); }
	';'
	{ after(grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PropertyDefinition__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyDefinition__Group_5__0__Impl
	rule__PropertyDefinition__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyDefinitionAccess().getForKeyword_5_0()); }
	'for'
	{ after(grammarAccess.getPropertyDefinitionAccess().getForKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyDefinition__Group_5__1__Impl
	rule__PropertyDefinition__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyDefinitionAccess().getLeftParenthesisKeyword_5_1()); }
	'('
	{ after(grammarAccess.getPropertyDefinitionAccess().getLeftParenthesisKeyword_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyDefinition__Group_5__2__Impl
	rule__PropertyDefinition__Group_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group_5__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyDefinitionAccess().getAlternatives_5_2()); }
	(rule__PropertyDefinition__Alternatives_5_2)
	{ after(grammarAccess.getPropertyDefinitionAccess().getAlternatives_5_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group_5__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyDefinition__Group_5__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group_5__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyDefinitionAccess().getRightParenthesisKeyword_5_3()); }
	')'
	{ after(grammarAccess.getPropertyDefinitionAccess().getRightParenthesisKeyword_5_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PropertyDefinition__Group_5_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyDefinition__Group_5_2_1__0__Impl
	rule__PropertyDefinition__Group_5_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group_5_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyDefinitionAccess().getAppliesToParserRuleCall_5_2_1_0()); }
	ruleAppliesTo
	{ after(grammarAccess.getPropertyDefinitionAccess().getAppliesToParserRuleCall_5_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group_5_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyDefinition__Group_5_2_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group_5_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyDefinitionAccess().getGroup_5_2_1_1()); }
	(rule__PropertyDefinition__Group_5_2_1_1__0)*
	{ after(grammarAccess.getPropertyDefinitionAccess().getGroup_5_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PropertyDefinition__Group_5_2_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyDefinition__Group_5_2_1_1__0__Impl
	rule__PropertyDefinition__Group_5_2_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group_5_2_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyDefinitionAccess().getCommaKeyword_5_2_1_1_0()); }
	','
	{ after(grammarAccess.getPropertyDefinitionAccess().getCommaKeyword_5_2_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group_5_2_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyDefinition__Group_5_2_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group_5_2_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyDefinitionAccess().getAppliesToParserRuleCall_5_2_1_1_1()); }
	ruleAppliesTo
	{ after(grammarAccess.getPropertyDefinitionAccess().getAppliesToParserRuleCall_5_2_1_1_1()); }
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
	{ before(grammarAccess.getPropertySetAccess().getPrivateAssignment_0()); }
	(rule__PropertySet__PrivateAssignment_0)?
	{ after(grammarAccess.getPropertySetAccess().getPrivateAssignment_0()); }
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
	{ before(grammarAccess.getPropertySetAccess().getPropertiesKeyword_1()); }
	'properties'
	{ after(grammarAccess.getPropertySetAccess().getPropertiesKeyword_1()); }
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
	{ before(grammarAccess.getPropertySetAccess().getNameAssignment_2()); }
	(rule__PropertySet__NameAssignment_2)
	{ after(grammarAccess.getPropertySetAccess().getNameAssignment_2()); }
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
	{ before(grammarAccess.getPropertySetAccess().getColonKeyword_3()); }
	':'
	{ after(grammarAccess.getPropertySetAccess().getColonKeyword_3()); }
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
	{ before(grammarAccess.getPropertySetAccess().getLeftCurlyBracketKeyword_4()); }
	'{'
	{ after(grammarAccess.getPropertySetAccess().getLeftCurlyBracketKeyword_4()); }
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
	{ before(grammarAccess.getPropertySetAccess().getPropertiesAssignment_5()); }
	(rule__PropertySet__PropertiesAssignment_5)
	{ after(grammarAccess.getPropertySetAccess().getPropertiesAssignment_5()); }
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
	{ before(grammarAccess.getPropertySetAccess().getGroup_6()); }
	(rule__PropertySet__Group_6__0)*
	{ after(grammarAccess.getPropertySetAccess().getGroup_6()); }
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
	{ before(grammarAccess.getPropertySetAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getPropertySetAccess().getRightCurlyBracketKeyword_7()); }
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
	{ before(grammarAccess.getPropertySetAccess().getSemicolonKeyword_8()); }
	';'
	{ after(grammarAccess.getPropertySetAccess().getSemicolonKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PropertySet__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertySet__Group_6__0__Impl
	rule__PropertySet__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertySetAccess().getCommaKeyword_6_0()); }
	','
	{ after(grammarAccess.getPropertySetAccess().getCommaKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertySet__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertySetAccess().getPropertiesAssignment_6_1()); }
	(rule__PropertySet__PropertiesAssignment_6_1)
	{ after(grammarAccess.getPropertySetAccess().getPropertiesAssignment_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TypeDecl__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeDecl__Group__0__Impl
	rule__TypeDecl__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDecl__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeDeclAccess().getPrivateAssignment_0()); }
	(rule__TypeDecl__PrivateAssignment_0)?
	{ after(grammarAccess.getTypeDeclAccess().getPrivateAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDecl__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeDecl__Group__1__Impl
	rule__TypeDecl__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDecl__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeDeclAccess().getTypeKeyword_1()); }
	'type'
	{ after(grammarAccess.getTypeDeclAccess().getTypeKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDecl__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeDecl__Group__2__Impl
	rule__TypeDecl__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDecl__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeDeclAccess().getNameAssignment_2()); }
	(rule__TypeDecl__NameAssignment_2)
	{ after(grammarAccess.getTypeDeclAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDecl__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeDecl__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDecl__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeDeclAccess().getPropertiesBlockParserRuleCall_3()); }
	(rulePropertiesBlock)?
	{ after(grammarAccess.getTypeDeclAccess().getPropertiesBlockParserRuleCall_3()); }
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
	{ before(grammarAccess.getModelElementReferenceAccess().getModelElementReferenceContextAction_1_0_0()); }
	()
	{ after(grammarAccess.getModelElementReferenceAccess().getModelElementReferenceContextAction_1_0_0()); }
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
	{ before(grammarAccess.getIntegerLiteralAccess().getValueAssignment_0()); }
	(rule__IntegerLiteral__ValueAssignment_0)
	{ after(grammarAccess.getIntegerLiteralAccess().getValueAssignment_0()); }
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
	{ before(grammarAccess.getIntegerLiteralAccess().getUnitAssignment_1()); }
	(rule__IntegerLiteral__UnitAssignment_1)?
	{ after(grammarAccess.getIntegerLiteralAccess().getUnitAssignment_1()); }
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
	{ before(grammarAccess.getComponentInterfaceAccess().getPrivateAssignment_0()); }
	(rule__ComponentInterface__PrivateAssignment_0)?
	{ after(grammarAccess.getComponentInterfaceAccess().getPrivateAssignment_0()); }
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
	{ before(grammarAccess.getComponentInterfaceAccess().getCategoryAssignment_1()); }
	(rule__ComponentInterface__CategoryAssignment_1)?
	{ after(grammarAccess.getComponentInterfaceAccess().getCategoryAssignment_1()); }
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
	{ before(grammarAccess.getComponentInterfaceAccess().getInterfaceKeyword_2()); }
	'interface'
	{ after(grammarAccess.getComponentInterfaceAccess().getInterfaceKeyword_2()); }
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
	{ before(grammarAccess.getComponentInterfaceAccess().getNameAssignment_3()); }
	(rule__ComponentInterface__NameAssignment_3)
	{ after(grammarAccess.getComponentInterfaceAccess().getNameAssignment_3()); }
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
	{ before(grammarAccess.getComponentInterfaceAccess().getGroup_4()); }
	(rule__ComponentInterface__Group_4__0)?
	{ after(grammarAccess.getComponentInterfaceAccess().getGroup_4()); }
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
	{ before(grammarAccess.getComponentInterfaceAccess().getInterfaceBodyParserRuleCall_5()); }
	ruleInterfaceBody
	{ after(grammarAccess.getComponentInterfaceAccess().getInterfaceBodyParserRuleCall_5()); }
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
	{ before(grammarAccess.getComponentInterfaceAccess().getSemicolonKeyword_6()); }
	';'
	{ after(grammarAccess.getComponentInterfaceAccess().getSemicolonKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentInterface__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentInterface__Group_4__0__Impl
	rule__ComponentInterface__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentInterfaceAccess().getExtendsKeyword_4_0()); }
	'extends'
	{ after(grammarAccess.getComponentInterfaceAccess().getExtendsKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentInterface__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentInterfaceAccess().getInterfaceExtensionsParserRuleCall_4_1()); }
	ruleInterfaceExtensions
	{ after(grammarAccess.getComponentInterfaceAccess().getInterfaceExtensionsParserRuleCall_4_1()); }
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
	{ before(grammarAccess.getComponentImplementationAccess().getPrivateAssignment_0()); }
	(rule__ComponentImplementation__PrivateAssignment_0)?
	{ after(grammarAccess.getComponentImplementationAccess().getPrivateAssignment_0()); }
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
	{ before(grammarAccess.getComponentImplementationAccess().getCategoryAssignment_1()); }
	(rule__ComponentImplementation__CategoryAssignment_1)
	{ after(grammarAccess.getComponentImplementationAccess().getCategoryAssignment_1()); }
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
	{ before(grammarAccess.getComponentImplementationAccess().getNameAssignment_2()); }
	(rule__ComponentImplementation__NameAssignment_2)
	{ after(grammarAccess.getComponentImplementationAccess().getNameAssignment_2()); }
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
	{ before(grammarAccess.getComponentImplementationAccess().getGroup_3()); }
	(rule__ComponentImplementation__Group_3__0)?
	{ after(grammarAccess.getComponentImplementationAccess().getGroup_3()); }
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
	{ before(grammarAccess.getComponentImplementationAccess().getImplementationBodyParserRuleCall_4()); }
	ruleImplementationBody
	{ after(grammarAccess.getComponentImplementationAccess().getImplementationBodyParserRuleCall_4()); }
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
	{ before(grammarAccess.getComponentImplementationAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getComponentImplementationAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentImplementation__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentImplementation__Group_3__0__Impl
	rule__ComponentImplementation__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentImplementation__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentImplementationAccess().getExtendsKeyword_3_0()); }
	'extends'
	{ after(grammarAccess.getComponentImplementationAccess().getExtendsKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentImplementation__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentImplementation__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentImplementation__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentImplementationAccess().getImplementationExtensionsParserRuleCall_3_1()); }
	ruleImplementationExtensions
	{ after(grammarAccess.getComponentImplementationAccess().getImplementationExtensionsParserRuleCall_3_1()); }
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
	{ before(grammarAccess.getComponentConfigurationAccess().getPrivateAssignment_0()); }
	(rule__ComponentConfiguration__PrivateAssignment_0)?
	{ after(grammarAccess.getComponentConfigurationAccess().getPrivateAssignment_0()); }
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
	{ before(grammarAccess.getComponentConfigurationAccess().getConfigurationKeyword_1()); }
	'configuration'
	{ after(grammarAccess.getComponentConfigurationAccess().getConfigurationKeyword_1()); }
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
	{ before(grammarAccess.getComponentConfigurationAccess().getNameAssignment_2()); }
	(rule__ComponentConfiguration__NameAssignment_2)
	{ after(grammarAccess.getComponentConfigurationAccess().getNameAssignment_2()); }
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
	{ before(grammarAccess.getComponentConfigurationAccess().getParametersParserRuleCall_3()); }
	(ruleParameters)?
	{ after(grammarAccess.getComponentConfigurationAccess().getParametersParserRuleCall_3()); }
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
	{ before(grammarAccess.getComponentConfigurationAccess().getGroup_4()); }
	(rule__ComponentConfiguration__Group_4__0)?
	{ after(grammarAccess.getComponentConfigurationAccess().getGroup_4()); }
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
	{ before(grammarAccess.getComponentConfigurationAccess().getConfigurationElementBlockParserRuleCall_5()); }
	ruleConfigurationElementBlock
	{ after(grammarAccess.getComponentConfigurationAccess().getConfigurationElementBlockParserRuleCall_5()); }
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
	{ before(grammarAccess.getComponentConfigurationAccess().getSemicolonKeyword_6()); }
	';'
	{ after(grammarAccess.getComponentConfigurationAccess().getSemicolonKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentConfiguration__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentConfiguration__Group_4__0__Impl
	rule__ComponentConfiguration__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentConfiguration__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentConfigurationAccess().getExtendsKeyword_4_0()); }
	'extends'
	{ after(grammarAccess.getComponentConfigurationAccess().getExtendsKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentConfiguration__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentConfiguration__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentConfiguration__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentConfigurationAccess().getConfigurationExtensionsParserRuleCall_4_1()); }
	ruleConfigurationExtensions
	{ after(grammarAccess.getComponentConfigurationAccess().getConfigurationExtensionsParserRuleCall_4_1()); }
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
	{ before(grammarAccess.getFeatureAccess().getNameAssignment_0()); }
	(rule__Feature__NameAssignment_0)
	{ after(grammarAccess.getFeatureAccess().getNameAssignment_0()); }
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
	{ before(grammarAccess.getFeatureAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getFeatureAccess().getColonKeyword_1()); }
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
	{ before(grammarAccess.getFeatureAccess().getDirectionAssignment_2()); }
	(rule__Feature__DirectionAssignment_2)?
	{ after(grammarAccess.getFeatureAccess().getDirectionAssignment_2()); }
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
	{ before(grammarAccess.getFeatureAccess().getCategoryAssignment_3()); }
	(rule__Feature__CategoryAssignment_3)
	{ after(grammarAccess.getFeatureAccess().getCategoryAssignment_3()); }
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
	{ before(grammarAccess.getFeatureAccess().getTypeReferenceAssignment_4()); }
	(rule__Feature__TypeReferenceAssignment_4)?
	{ after(grammarAccess.getFeatureAccess().getTypeReferenceAssignment_4()); }
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
	{ before(grammarAccess.getFeatureAccess().getAlternatives_5()); }
	(rule__Feature__Alternatives_5)?
	{ after(grammarAccess.getFeatureAccess().getAlternatives_5()); }
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
	{ before(grammarAccess.getFeatureAccess().getAnnexElementsAssignment_6()); }
	(rule__Feature__AnnexElementsAssignment_6)*
	{ after(grammarAccess.getFeatureAccess().getAnnexElementsAssignment_6()); }
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
	rule__Feature__Group__8
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
	{ before(grammarAccess.getFeatureAccess().getPropertiesBlockParserRuleCall_7()); }
	(rulePropertiesBlock)?
	{ after(grammarAccess.getFeatureAccess().getPropertiesBlockParserRuleCall_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getSemicolonKeyword_8()); }
	';'
	{ after(grammarAccess.getFeatureAccess().getSemicolonKeyword_8()); }
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
	{ before(grammarAccess.getSubcomponentAccess().getNameAssignment_0()); }
	(rule__Subcomponent__NameAssignment_0)
	{ after(grammarAccess.getSubcomponentAccess().getNameAssignment_0()); }
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
	{ before(grammarAccess.getSubcomponentAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getSubcomponentAccess().getColonKeyword_1()); }
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
	{ before(grammarAccess.getSubcomponentAccess().getCategoryAssignment_2()); }
	(rule__Subcomponent__CategoryAssignment_2)
	{ after(grammarAccess.getSubcomponentAccess().getCategoryAssignment_2()); }
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
	{ before(grammarAccess.getSubcomponentAccess().getTypeReferencesAssignment_3()); }
	(rule__Subcomponent__TypeReferencesAssignment_3)?
	{ after(grammarAccess.getSubcomponentAccess().getTypeReferencesAssignment_3()); }
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
	{ before(grammarAccess.getSubcomponentAccess().getNestedComponentImplementationBlockParserRuleCall_4()); }
	(ruleNestedComponentImplementationBlock)?
	{ after(grammarAccess.getSubcomponentAccess().getNestedComponentImplementationBlockParserRuleCall_4()); }
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
	{ before(grammarAccess.getSubcomponentAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getSubcomponentAccess().getSemicolonKeyword_5()); }
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
	{ before(grammarAccess.getConnectionAccess().getPropertiesBlockParserRuleCall_6()); }
	(rulePropertiesBlock)?
	{ after(grammarAccess.getConnectionAccess().getPropertiesBlockParserRuleCall_6()); }
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
	{ before(grammarAccess.getConnectionAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getConnectionAccess().getSemicolonKeyword_7()); }
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
	{ before(grammarAccess.getBindingAccess().getPropertiesBlockParserRuleCall_7()); }
	(rulePropertiesBlock)?
	{ after(grammarAccess.getBindingAccess().getPropertiesBlockParserRuleCall_7()); }
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
	{ before(grammarAccess.getBindingAccess().getSemicolonKeyword_8()); }
	';'
	{ after(grammarAccess.getBindingAccess().getSemicolonKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FlowPath__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FlowPath__Group__0__Impl
	rule__FlowPath__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowPath__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlowPathAccess().getNameAssignment_0()); }
	(rule__FlowPath__NameAssignment_0)
	{ after(grammarAccess.getFlowPathAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowPath__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FlowPath__Group__1__Impl
	rule__FlowPath__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowPath__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlowPathAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getFlowPathAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowPath__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FlowPath__Group__2__Impl
	rule__FlowPath__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowPath__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlowPathAccess().getAssociationTypeAssignment_2()); }
	(rule__FlowPath__AssociationTypeAssignment_2)
	{ after(grammarAccess.getFlowPathAccess().getAssociationTypeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowPath__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FlowPath__Group__3__Impl
	rule__FlowPath__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowPath__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlowPathAccess().getSourceAssignment_3()); }
	(rule__FlowPath__SourceAssignment_3)
	{ after(grammarAccess.getFlowPathAccess().getSourceAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowPath__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FlowPath__Group__4__Impl
	rule__FlowPath__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowPath__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlowPathAccess().getHyphenMinusGreaterThanSignKeyword_4()); }
	'->'
	{ after(grammarAccess.getFlowPathAccess().getHyphenMinusGreaterThanSignKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowPath__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FlowPath__Group__5__Impl
	rule__FlowPath__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowPath__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlowPathAccess().getDestinationAssignment_5()); }
	(rule__FlowPath__DestinationAssignment_5)
	{ after(grammarAccess.getFlowPathAccess().getDestinationAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowPath__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FlowPath__Group__6__Impl
	rule__FlowPath__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowPath__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlowPathAccess().getPropertiesBlockParserRuleCall_6()); }
	(rulePropertiesBlock)?
	{ after(grammarAccess.getFlowPathAccess().getPropertiesBlockParserRuleCall_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowPath__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FlowPath__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowPath__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlowPathAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getFlowPathAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FlowSource__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FlowSource__Group__0__Impl
	rule__FlowSource__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowSource__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlowSourceAccess().getNameAssignment_0()); }
	(rule__FlowSource__NameAssignment_0)
	{ after(grammarAccess.getFlowSourceAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowSource__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FlowSource__Group__1__Impl
	rule__FlowSource__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowSource__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlowSourceAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getFlowSourceAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowSource__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FlowSource__Group__2__Impl
	rule__FlowSource__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowSource__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlowSourceAccess().getAssociationTypeAssignment_2()); }
	(rule__FlowSource__AssociationTypeAssignment_2)
	{ after(grammarAccess.getFlowSourceAccess().getAssociationTypeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowSource__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FlowSource__Group__3__Impl
	rule__FlowSource__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowSource__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlowSourceAccess().getDestinationAssignment_3()); }
	(rule__FlowSource__DestinationAssignment_3)
	{ after(grammarAccess.getFlowSourceAccess().getDestinationAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowSource__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FlowSource__Group__4__Impl
	rule__FlowSource__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowSource__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlowSourceAccess().getPropertiesBlockParserRuleCall_4()); }
	(rulePropertiesBlock)?
	{ after(grammarAccess.getFlowSourceAccess().getPropertiesBlockParserRuleCall_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowSource__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FlowSource__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowSource__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlowSourceAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getFlowSourceAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FlowSink__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FlowSink__Group__0__Impl
	rule__FlowSink__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowSink__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlowSinkAccess().getNameAssignment_0()); }
	(rule__FlowSink__NameAssignment_0)
	{ after(grammarAccess.getFlowSinkAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowSink__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FlowSink__Group__1__Impl
	rule__FlowSink__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowSink__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlowSinkAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getFlowSinkAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowSink__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FlowSink__Group__2__Impl
	rule__FlowSink__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowSink__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlowSinkAccess().getAssociationTypeAssignment_2()); }
	(rule__FlowSink__AssociationTypeAssignment_2)
	{ after(grammarAccess.getFlowSinkAccess().getAssociationTypeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowSink__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FlowSink__Group__3__Impl
	rule__FlowSink__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowSink__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlowSinkAccess().getSourceAssignment_3()); }
	(rule__FlowSink__SourceAssignment_3)
	{ after(grammarAccess.getFlowSinkAccess().getSourceAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowSink__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FlowSink__Group__4__Impl
	rule__FlowSink__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowSink__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlowSinkAccess().getPropertiesBlockParserRuleCall_4()); }
	(rulePropertiesBlock)?
	{ after(grammarAccess.getFlowSinkAccess().getPropertiesBlockParserRuleCall_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowSink__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FlowSink__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowSink__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlowSinkAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getFlowSinkAccess().getSemicolonKeyword_5()); }
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


rule__Propagations__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Propagations__Group__0__Impl
	rule__Propagations__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Propagations__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropagationsAccess().getPropagatesKeyword_0()); }
	'propagates'
	{ after(grammarAccess.getPropagationsAccess().getPropagatesKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Propagations__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Propagations__Group__1__Impl
	rule__Propagations__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Propagations__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropagationsAccess().getDirectionAssignment_1()); }
	(rule__Propagations__DirectionAssignment_1)?
	{ after(grammarAccess.getPropagationsAccess().getDirectionAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Propagations__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Propagations__Group__2__Impl
	rule__Propagations__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Propagations__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropagationsAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getPropagationsAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Propagations__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Propagations__Group__3__Impl
	rule__Propagations__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Propagations__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropagationsAccess().getPropagatedTypesAssignment_3()); }
	(rule__Propagations__PropagatedTypesAssignment_3)
	{ after(grammarAccess.getPropagationsAccess().getPropagatedTypesAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Propagations__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Propagations__Group__4__Impl
	rule__Propagations__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Propagations__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropagationsAccess().getGroup_4()); }
	(rule__Propagations__Group_4__0)*
	{ after(grammarAccess.getPropagationsAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Propagations__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Propagations__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Propagations__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropagationsAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getPropagationsAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Propagations__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Propagations__Group_4__0__Impl
	rule__Propagations__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Propagations__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropagationsAccess().getCommaKeyword_4_0()); }
	','
	{ after(grammarAccess.getPropagationsAccess().getCommaKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Propagations__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Propagations__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Propagations__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropagationsAccess().getPropagatedTypesAssignment_4_1()); }
	(rule__Propagations__PropagatedTypesAssignment_4_1)
	{ after(grammarAccess.getPropagationsAccess().getPropagatedTypesAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EPropagations__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EPropagations__Group__0__Impl
	rule__EPropagations__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EPropagations__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEPropagationsAccess().getEKeyword_0()); }
	'@e'
	{ after(grammarAccess.getEPropagationsAccess().getEKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EPropagations__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EPropagations__Group__1__Impl
	rule__EPropagations__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EPropagations__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEPropagationsAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getEPropagationsAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EPropagations__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EPropagations__Group__2__Impl
	rule__EPropagations__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EPropagations__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEPropagationsAccess().getDirectionAssignment_2()); }
	(rule__EPropagations__DirectionAssignment_2)?
	{ after(grammarAccess.getEPropagationsAccess().getDirectionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EPropagations__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EPropagations__Group__3__Impl
	rule__EPropagations__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__EPropagations__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEPropagationsAccess().getPropagatedTypesAssignment_3()); }
	(rule__EPropagations__PropagatedTypesAssignment_3)
	{ after(grammarAccess.getEPropagationsAccess().getPropagatedTypesAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EPropagations__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EPropagations__Group__4__Impl
	rule__EPropagations__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__EPropagations__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEPropagationsAccess().getGroup_4()); }
	(rule__EPropagations__Group_4__0)*
	{ after(grammarAccess.getEPropagationsAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EPropagations__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EPropagations__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EPropagations__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEPropagationsAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getEPropagationsAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EPropagations__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EPropagations__Group_4__0__Impl
	rule__EPropagations__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EPropagations__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEPropagationsAccess().getCommaKeyword_4_0()); }
	','
	{ after(grammarAccess.getEPropagationsAccess().getCommaKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EPropagations__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EPropagations__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EPropagations__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEPropagationsAccess().getPropagatedTypesAssignment_4_1()); }
	(rule__EPropagations__PropagatedTypesAssignment_4_1)
	{ after(grammarAccess.getEPropagationsAccess().getPropagatedTypesAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Path__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Path__Group__0__Impl
	rule__Path__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Path__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPathAccess().getNameAssignment_0()); }
	(rule__Path__NameAssignment_0)
	{ after(grammarAccess.getPathAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Path__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Path__Group__1__Impl
	rule__Path__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Path__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPathAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getPathAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Path__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Path__Group__2__Impl
	rule__Path__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Path__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPathAccess().getFlowKeyword_2()); }
	'flow'
	{ after(grammarAccess.getPathAccess().getFlowKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Path__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Path__Group__3__Impl
	rule__Path__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Path__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPathAccess().getElementsAssignment_3()); }
	(rule__Path__ElementsAssignment_3)
	{ after(grammarAccess.getPathAccess().getElementsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Path__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Path__Group__4__Impl
	rule__Path__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Path__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getPathAccess().getGroup_4()); }
		(rule__Path__Group_4__0)
		{ after(grammarAccess.getPathAccess().getGroup_4()); }
	)
	(
		{ before(grammarAccess.getPathAccess().getGroup_4()); }
		(rule__Path__Group_4__0)*
		{ after(grammarAccess.getPathAccess().getGroup_4()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Path__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Path__Group__5__Impl
	rule__Path__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Path__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPathAccess().getPropertiesBlockParserRuleCall_5()); }
	(rulePropertiesBlock)?
	{ after(grammarAccess.getPathAccess().getPropertiesBlockParserRuleCall_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Path__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Path__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Path__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPathAccess().getSemicolonKeyword_6()); }
	';'
	{ after(grammarAccess.getPathAccess().getSemicolonKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Path__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Path__Group_4__0__Impl
	rule__Path__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Path__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPathAccess().getHyphenMinusGreaterThanSignKeyword_4_0()); }
	'->'
	{ after(grammarAccess.getPathAccess().getHyphenMinusGreaterThanSignKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Path__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Path__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Path__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPathAccess().getElementsAssignment_4_1()); }
	(rule__Path__ElementsAssignment_4_1)
	{ after(grammarAccess.getPathAccess().getElementsAssignment_4_1()); }
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


rule__TypeReference__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeReference__Group__0__Impl
	rule__TypeReference__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeReference__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeReferenceAccess().getTypeAssignment_0()); }
	(rule__TypeReference__TypeAssignment_0)
	{ after(grammarAccess.getTypeReferenceAccess().getTypeAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeReference__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeReference__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeReference__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeReferenceAccess().getConfigurationActualsParserRuleCall_1()); }
	(ruleConfigurationActuals)?
	{ after(grammarAccess.getTypeReferenceAccess().getConfigurationActualsParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AnnexSubclause__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnnexSubclause__Group__0__Impl
	rule__AnnexSubclause__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnexSubclause__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnexSubclauseAccess().getCommercialAtKeyword_0()); }
	'@'
	{ after(grammarAccess.getAnnexSubclauseAccess().getCommercialAtKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnexSubclause__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnnexSubclause__Group__1__Impl
	rule__AnnexSubclause__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnexSubclause__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnexSubclauseAccess().getNameAssignment_1()); }
	(rule__AnnexSubclause__NameAssignment_1)
	{ after(grammarAccess.getAnnexSubclauseAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnexSubclause__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnnexSubclause__Group__2__Impl
	rule__AnnexSubclause__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnexSubclause__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnexSubclauseAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getAnnexSubclauseAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnexSubclause__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnnexSubclause__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnexSubclause__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnexSubclauseAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getAnnexSubclauseAccess().getRightCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AnnexElement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnnexElement__Group__0__Impl
	rule__AnnexElement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnexElement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnexElementAccess().getCommercialAtKeyword_0()); }
	'@'
	{ after(grammarAccess.getAnnexElementAccess().getCommercialAtKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnexElement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnnexElement__Group__1__Impl
	rule__AnnexElement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnexElement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnexElementAccess().getNameAssignment_1()); }
	(rule__AnnexElement__NameAssignment_1)
	{ after(grammarAccess.getAnnexElementAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnexElement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnnexElement__Group__2__Impl
	rule__AnnexElement__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnexElement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnexElementAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getAnnexElementAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnexElement__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnnexElement__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnexElement__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnexElementAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getAnnexElementAccess().getRightCurlyBracketKeyword_3()); }
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
	{ before(grammarAccess.getWorkingsetAccess().getRootComponentsAssignment_5()); }
	(rule__Workingset__RootComponentsAssignment_5)*
	{ after(grammarAccess.getWorkingsetAccess().getRootComponentsAssignment_5()); }
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


rule__FlowSourceKeywords__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FlowSourceKeywords__Group__0__Impl
	rule__FlowSourceKeywords__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowSourceKeywords__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlowSourceKeywordsAccess().getFlowKeyword_0()); }
	'flow'
	{ after(grammarAccess.getFlowSourceKeywordsAccess().getFlowKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowSourceKeywords__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FlowSourceKeywords__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowSourceKeywords__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlowSourceKeywordsAccess().getSourceKeyword_1()); }
	'source'
	{ after(grammarAccess.getFlowSourceKeywordsAccess().getSourceKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FlowSinkKeywords__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FlowSinkKeywords__Group__0__Impl
	rule__FlowSinkKeywords__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowSinkKeywords__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlowSinkKeywordsAccess().getFlowKeyword_0()); }
	'flow'
	{ after(grammarAccess.getFlowSinkKeywordsAccess().getFlowKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowSinkKeywords__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FlowSinkKeywords__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowSinkKeywords__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlowSinkKeywordsAccess().getSinkKeyword_1()); }
	'sink'
	{ after(grammarAccess.getFlowSinkKeywordsAccess().getSinkKeyword_1()); }
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


rule__PackageDeclaration__PrivateAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPackageDeclarationAccess().getPrivatePrivateKeyword_0_0()); }
		(
			{ before(grammarAccess.getPackageDeclarationAccess().getPrivatePrivateKeyword_0_0()); }
			'private'
			{ after(grammarAccess.getPackageDeclarationAccess().getPrivatePrivateKeyword_0_0()); }
		)
		{ after(grammarAccess.getPackageDeclarationAccess().getPrivatePrivateKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDeclaration__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_2_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDeclaration__ElementsAssignment_4_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPackageDeclarationAccess().getElementsAnnexLibraryParserRuleCall_4_0_0()); }
		ruleAnnexLibrary
		{ after(grammarAccess.getPackageDeclarationAccess().getElementsAnnexLibraryParserRuleCall_4_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDeclaration__ImportsAssignment_4_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPackageDeclarationAccess().getImportsImportParserRuleCall_4_1_0_0()); }
		ruleImport
		{ after(grammarAccess.getPackageDeclarationAccess().getImportsImportParserRuleCall_4_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDeclaration__ElementsAssignment_4_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPackageDeclarationAccess().getElementsPackageElementParserRuleCall_4_1_1_0()); }
		rulePackageElement
		{ after(grammarAccess.getPackageDeclarationAccess().getElementsPackageElementParserRuleCall_4_1_1_0()); }
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

rule__PropertyDefinition__PrivateAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyDefinitionAccess().getPrivatePrivateKeyword_0_0()); }
		(
			{ before(grammarAccess.getPropertyDefinitionAccess().getPrivatePrivateKeyword_0_0()); }
			'private'
			{ after(grammarAccess.getPropertyDefinitionAccess().getPrivatePrivateKeyword_0_0()); }
		)
		{ after(grammarAccess.getPropertyDefinitionAccess().getPrivatePrivateKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyDefinitionAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getPropertyDefinitionAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__TypeAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyDefinitionAccess().getTypeClassifierOrTypeCrossReference_4_0()); }
		(
			{ before(grammarAccess.getPropertyDefinitionAccess().getTypeClassifierOrTypeQualifiedReferenceParserRuleCall_4_0_1()); }
			ruleQualifiedReference
			{ after(grammarAccess.getPropertyDefinitionAccess().getTypeClassifierOrTypeQualifiedReferenceParserRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getPropertyDefinitionAccess().getTypeClassifierOrTypeCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__ForAllAssignment_5_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyDefinitionAccess().getForAllAllKeyword_5_2_0_0()); }
		(
			{ before(grammarAccess.getPropertyDefinitionAccess().getForAllAllKeyword_5_2_0_0()); }
			'all'
			{ after(grammarAccess.getPropertyDefinitionAccess().getForAllAllKeyword_5_2_0_0()); }
		)
		{ after(grammarAccess.getPropertyDefinitionAccess().getForAllAllKeyword_5_2_0_0()); }
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

rule__PropertySet__PrivateAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertySetAccess().getPrivatePrivateKeyword_0_0()); }
		(
			{ before(grammarAccess.getPropertySetAccess().getPrivatePrivateKeyword_0_0()); }
			'private'
			{ after(grammarAccess.getPropertySetAccess().getPrivatePrivateKeyword_0_0()); }
		)
		{ after(grammarAccess.getPropertySetAccess().getPrivatePrivateKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertySetAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getPropertySetAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__PropertiesAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertySetAccess().getPropertiesPropertyDefinitionCrossReference_5_0()); }
		(
			{ before(grammarAccess.getPropertySetAccess().getPropertiesPropertyDefinitionQualifiedReferenceParserRuleCall_5_0_1()); }
			ruleQualifiedReference
			{ after(grammarAccess.getPropertySetAccess().getPropertiesPropertyDefinitionQualifiedReferenceParserRuleCall_5_0_1()); }
		)
		{ after(grammarAccess.getPropertySetAccess().getPropertiesPropertyDefinitionCrossReference_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__PropertiesAssignment_6_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertySetAccess().getPropertiesPropertyDefinitionCrossReference_6_1_0()); }
		(
			{ before(grammarAccess.getPropertySetAccess().getPropertiesPropertyDefinitionQualifiedNameParserRuleCall_6_1_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getPropertySetAccess().getPropertiesPropertyDefinitionQualifiedNameParserRuleCall_6_1_0_1()); }
		)
		{ after(grammarAccess.getPropertySetAccess().getPropertiesPropertyDefinitionCrossReference_6_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDecl__PrivateAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeDeclAccess().getPrivatePrivateKeyword_0_0()); }
		(
			{ before(grammarAccess.getTypeDeclAccess().getPrivatePrivateKeyword_0_0()); }
			'private'
			{ after(grammarAccess.getTypeDeclAccess().getPrivatePrivateKeyword_0_0()); }
		)
		{ after(grammarAccess.getTypeDeclAccess().getPrivatePrivateKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDecl__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeDeclAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getTypeDeclAccess().getNameIDTerminalRuleCall_2_0()); }
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
		{ before(grammarAccess.getPropertyAssociationAccess().getValueIntegerLiteralParserRuleCall_4_0()); }
		ruleIntegerLiteral
		{ after(grammarAccess.getPropertyAssociationAccess().getValueIntegerLiteralParserRuleCall_4_0()); }
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

rule__IntegerLiteral__ValueAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_0_0()); }
		RULE_INT
		{ after(grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerLiteral__UnitAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerLiteralAccess().getUnitSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getIntegerLiteralAccess().getUnitSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__PrivateAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentInterfaceAccess().getPrivatePrivateKeyword_0_0()); }
		(
			{ before(grammarAccess.getComponentInterfaceAccess().getPrivatePrivateKeyword_0_0()); }
			'private'
			{ after(grammarAccess.getComponentInterfaceAccess().getPrivatePrivateKeyword_0_0()); }
		)
		{ after(grammarAccess.getComponentInterfaceAccess().getPrivatePrivateKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__CategoryAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentInterfaceAccess().getCategoryComponentCategoryParserRuleCall_1_0()); }
		ruleComponentCategory
		{ after(grammarAccess.getComponentInterfaceAccess().getCategoryComponentCategoryParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__NameAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentInterfaceAccess().getNameIDTerminalRuleCall_3_0()); }
		RULE_ID
		{ after(grammarAccess.getComponentInterfaceAccess().getNameIDTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InterfaceElement__FeaturesAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInterfaceElementAccess().getFeaturesFeatureParserRuleCall_0_0()); }
		ruleFeature
		{ after(grammarAccess.getInterfaceElementAccess().getFeaturesFeatureParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InterfaceElement__FlowsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInterfaceElementAccess().getFlowsFlowPathParserRuleCall_1_0()); }
		ruleFlowPath
		{ after(grammarAccess.getInterfaceElementAccess().getFlowsFlowPathParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InterfaceElement__FlowsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInterfaceElementAccess().getFlowsFlowSourceParserRuleCall_2_0()); }
		ruleFlowSource
		{ after(grammarAccess.getInterfaceElementAccess().getFlowsFlowSourceParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InterfaceElement__FlowsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInterfaceElementAccess().getFlowsFlowSinkParserRuleCall_3_0()); }
		ruleFlowSink
		{ after(grammarAccess.getInterfaceElementAccess().getFlowsFlowSinkParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InterfaceElement__OwnedPropertyAssociationsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInterfaceElementAccess().getOwnedPropertyAssociationsPropertyAssociationParserRuleCall_4_0()); }
		rulePropertyAssociation
		{ after(grammarAccess.getInterfaceElementAccess().getOwnedPropertyAssociationsPropertyAssociationParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InterfaceElement__AnnexSubclauseAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInterfaceElementAccess().getAnnexSubclauseAnnexSubclauseParserRuleCall_5_0()); }
		ruleAnnexSubclause
		{ after(grammarAccess.getInterfaceElementAccess().getAnnexSubclauseAnnexSubclauseParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentImplementation__PrivateAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentImplementationAccess().getPrivatePrivateKeyword_0_0()); }
		(
			{ before(grammarAccess.getComponentImplementationAccess().getPrivatePrivateKeyword_0_0()); }
			'private'
			{ after(grammarAccess.getComponentImplementationAccess().getPrivatePrivateKeyword_0_0()); }
		)
		{ after(grammarAccess.getComponentImplementationAccess().getPrivatePrivateKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentImplementation__CategoryAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentImplementationAccess().getCategoryComponentCategoryParserRuleCall_1_0()); }
		ruleComponentCategory
		{ after(grammarAccess.getComponentImplementationAccess().getCategoryComponentCategoryParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentImplementation__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentImplementationAccess().getNameDottedNameParserRuleCall_2_0()); }
		ruleDottedName
		{ after(grammarAccess.getComponentImplementationAccess().getNameDottedNameParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplementationElement__ConnectionsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImplementationElementAccess().getConnectionsConnectionParserRuleCall_0_0()); }
		ruleConnection
		{ after(grammarAccess.getImplementationElementAccess().getConnectionsConnectionParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplementationElement__BindingsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImplementationElementAccess().getBindingsBindingParserRuleCall_1_0()); }
		ruleBinding
		{ after(grammarAccess.getImplementationElementAccess().getBindingsBindingParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplementationElement__ComponentsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImplementationElementAccess().getComponentsSubcomponentParserRuleCall_2_0()); }
		ruleSubcomponent
		{ after(grammarAccess.getImplementationElementAccess().getComponentsSubcomponentParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplementationElement__PathsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImplementationElementAccess().getPathsPathParserRuleCall_3_0()); }
		rulePath
		{ after(grammarAccess.getImplementationElementAccess().getPathsPathParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplementationElement__FlowAssignmentsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImplementationElementAccess().getFlowAssignmentsFlowAssignmentParserRuleCall_4_0()); }
		ruleFlowAssignment
		{ after(grammarAccess.getImplementationElementAccess().getFlowAssignmentsFlowAssignmentParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplementationElement__ClassifierAssignmentsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImplementationElementAccess().getClassifierAssignmentsClassifierAssignmentParserRuleCall_5_0()); }
		ruleClassifierAssignment
		{ after(grammarAccess.getImplementationElementAccess().getClassifierAssignmentsClassifierAssignmentParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplementationElement__ClassifierAssignmentsAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImplementationElementAccess().getClassifierAssignmentsClassifierAssignmentPatternParserRuleCall_6_0()); }
		ruleClassifierAssignmentPattern
		{ after(grammarAccess.getImplementationElementAccess().getClassifierAssignmentsClassifierAssignmentPatternParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplementationElement__OwnedPropertyAssociationsAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImplementationElementAccess().getOwnedPropertyAssociationsPropertyAssociationParserRuleCall_7_0()); }
		rulePropertyAssociation
		{ after(grammarAccess.getImplementationElementAccess().getOwnedPropertyAssociationsPropertyAssociationParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplementationElement__AnnexSubclauseAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImplementationElementAccess().getAnnexSubclauseAnnexSubclauseParserRuleCall_8_0()); }
		ruleAnnexSubclause
		{ after(grammarAccess.getImplementationElementAccess().getAnnexSubclauseAnnexSubclauseParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentConfiguration__PrivateAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentConfigurationAccess().getPrivatePrivateKeyword_0_0()); }
		(
			{ before(grammarAccess.getComponentConfigurationAccess().getPrivatePrivateKeyword_0_0()); }
			'private'
			{ after(grammarAccess.getComponentConfigurationAccess().getPrivatePrivateKeyword_0_0()); }
		)
		{ after(grammarAccess.getComponentConfigurationAccess().getPrivatePrivateKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentConfiguration__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentConfigurationAccess().getNameDottedNameParserRuleCall_2_0()); }
		ruleDottedName
		{ after(grammarAccess.getComponentConfigurationAccess().getNameDottedNameParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__DirectionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getDirectionFeatureDirectionParserRuleCall_2_0()); }
		ruleFeatureDirection
		{ after(grammarAccess.getFeatureAccess().getDirectionFeatureDirectionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__CategoryAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getCategoryFeatureCategoryParserRuleCall_3_0()); }
		ruleFeatureCategory
		{ after(grammarAccess.getFeatureAccess().getCategoryFeatureCategoryParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__TypeReferenceAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getTypeReferenceReversableTypeReferenceParserRuleCall_4_0()); }
		ruleReversableTypeReference
		{ after(grammarAccess.getFeatureAccess().getTypeReferenceReversableTypeReferenceParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__PropagationAssignment_5_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getPropagationPropagationsParserRuleCall_5_0_0()); }
		rulePropagations
		{ after(grammarAccess.getFeatureAccess().getPropagationPropagationsParserRuleCall_5_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__PropagationAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getPropagationEPropagationsParserRuleCall_5_1_0()); }
		ruleEPropagations
		{ after(grammarAccess.getFeatureAccess().getPropagationEPropagationsParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__AnnexElementsAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getAnnexElementsAnnexElementParserRuleCall_6_0()); }
		ruleAnnexElement
		{ after(grammarAccess.getFeatureAccess().getAnnexElementsAnnexElementParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Subcomponent__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubcomponentAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getSubcomponentAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Subcomponent__CategoryAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubcomponentAccess().getCategoryComponentCategoryParserRuleCall_2_0()); }
		ruleComponentCategory
		{ after(grammarAccess.getSubcomponentAccess().getCategoryComponentCategoryParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Subcomponent__TypeReferencesAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubcomponentAccess().getTypeReferencesTypeReferenceParserRuleCall_3_0()); }
		ruleTypeReference
		{ after(grammarAccess.getSubcomponentAccess().getTypeReferencesTypeReferenceParserRuleCall_3_0()); }
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
		{ before(grammarAccess.getBindingAccess().getBindingTypeTypeDeclCrossReference_2_0()); }
		(
			{ before(grammarAccess.getBindingAccess().getBindingTypeTypeDeclQualifiedNameParserRuleCall_2_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getBindingAccess().getBindingTypeTypeDeclQualifiedNameParserRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getBindingAccess().getBindingTypeTypeDeclCrossReference_2_0()); }
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

rule__FlowPath__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFlowPathAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getFlowPathAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowPath__AssociationTypeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFlowPathAccess().getAssociationTypeIsFlowParserRuleCall_2_0()); }
		ruleIsFlow
		{ after(grammarAccess.getFlowPathAccess().getAssociationTypeIsFlowParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowPath__SourceAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFlowPathAccess().getSourceModelElementReferenceParserRuleCall_3_0()); }
		ruleModelElementReference
		{ after(grammarAccess.getFlowPathAccess().getSourceModelElementReferenceParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowPath__DestinationAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFlowPathAccess().getDestinationModelElementReferenceParserRuleCall_5_0()); }
		ruleModelElementReference
		{ after(grammarAccess.getFlowPathAccess().getDestinationModelElementReferenceParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowSource__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFlowSourceAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getFlowSourceAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowSource__AssociationTypeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFlowSourceAccess().getAssociationTypeIsFlowSourceParserRuleCall_2_0()); }
		ruleIsFlowSource
		{ after(grammarAccess.getFlowSourceAccess().getAssociationTypeIsFlowSourceParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowSource__DestinationAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFlowSourceAccess().getDestinationModelElementReferenceParserRuleCall_3_0()); }
		ruleModelElementReference
		{ after(grammarAccess.getFlowSourceAccess().getDestinationModelElementReferenceParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowSink__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFlowSinkAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getFlowSinkAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowSink__AssociationTypeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFlowSinkAccess().getAssociationTypeIsFlowSinkParserRuleCall_2_0()); }
		ruleIsFlowSink
		{ after(grammarAccess.getFlowSinkAccess().getAssociationTypeIsFlowSinkParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowSink__SourceAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFlowSinkAccess().getSourceModelElementReferenceParserRuleCall_3_0()); }
		ruleModelElementReference
		{ after(grammarAccess.getFlowSinkAccess().getSourceModelElementReferenceParserRuleCall_3_0()); }
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

rule__Propagations__DirectionAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropagationsAccess().getDirectionFeatureDirectionParserRuleCall_1_0()); }
		ruleFeatureDirection
		{ after(grammarAccess.getPropagationsAccess().getDirectionFeatureDirectionParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Propagations__PropagatedTypesAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropagationsAccess().getPropagatedTypesClassifierOrTypeCrossReference_3_0()); }
		(
			{ before(grammarAccess.getPropagationsAccess().getPropagatedTypesClassifierOrTypeQualifiedTypesReferenceParserRuleCall_3_0_1()); }
			ruleQualifiedTypesReference
			{ after(grammarAccess.getPropagationsAccess().getPropagatedTypesClassifierOrTypeQualifiedTypesReferenceParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getPropagationsAccess().getPropagatedTypesClassifierOrTypeCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Propagations__PropagatedTypesAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropagationsAccess().getPropagatedTypesClassifierOrTypeCrossReference_4_1_0()); }
		(
			{ before(grammarAccess.getPropagationsAccess().getPropagatedTypesClassifierOrTypeQualifiedTypesReferenceParserRuleCall_4_1_0_1()); }
			ruleQualifiedTypesReference
			{ after(grammarAccess.getPropagationsAccess().getPropagatedTypesClassifierOrTypeQualifiedTypesReferenceParserRuleCall_4_1_0_1()); }
		)
		{ after(grammarAccess.getPropagationsAccess().getPropagatedTypesClassifierOrTypeCrossReference_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EPropagations__DirectionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEPropagationsAccess().getDirectionFeatureDirectionParserRuleCall_2_0()); }
		ruleFeatureDirection
		{ after(grammarAccess.getEPropagationsAccess().getDirectionFeatureDirectionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EPropagations__PropagatedTypesAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEPropagationsAccess().getPropagatedTypesClassifierOrTypeCrossReference_3_0()); }
		(
			{ before(grammarAccess.getEPropagationsAccess().getPropagatedTypesClassifierOrTypeQualifiedTypesReferenceParserRuleCall_3_0_1()); }
			ruleQualifiedTypesReference
			{ after(grammarAccess.getEPropagationsAccess().getPropagatedTypesClassifierOrTypeQualifiedTypesReferenceParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getEPropagationsAccess().getPropagatedTypesClassifierOrTypeCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EPropagations__PropagatedTypesAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEPropagationsAccess().getPropagatedTypesClassifierOrTypeCrossReference_4_1_0()); }
		(
			{ before(grammarAccess.getEPropagationsAccess().getPropagatedTypesClassifierOrTypeQualifiedTypesReferenceParserRuleCall_4_1_0_1()); }
			ruleQualifiedTypesReference
			{ after(grammarAccess.getEPropagationsAccess().getPropagatedTypesClassifierOrTypeQualifiedTypesReferenceParserRuleCall_4_1_0_1()); }
		)
		{ after(grammarAccess.getEPropagationsAccess().getPropagatedTypesClassifierOrTypeCrossReference_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Path__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPathAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getPathAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Path__ElementsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPathAccess().getElementsPathElementParserRuleCall_3_0()); }
		rulePathElement
		{ after(grammarAccess.getPathAccess().getElementsPathElementParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Path__ElementsAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPathAccess().getElementsPathElementParserRuleCall_4_1_0()); }
		rulePathElement
		{ after(grammarAccess.getPathAccess().getElementsPathElementParserRuleCall_4_1_0()); }
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
		{ before(grammarAccess.getClassifierAssignmentAccess().getAssignedClassifiersTypeReferenceParserRuleCall_2_0_0_0()); }
		ruleTypeReference
		{ after(grammarAccess.getClassifierAssignmentAccess().getAssignedClassifiersTypeReferenceParserRuleCall_2_0_0_0()); }
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
		{ before(grammarAccess.getClassifierAssignmentAccess().getAssignedClassifiersTypeReferenceParserRuleCall_2_0_1_1_0()); }
		ruleTypeReference
		{ after(grammarAccess.getClassifierAssignmentAccess().getAssignedClassifiersTypeReferenceParserRuleCall_2_0_1_1_0()); }
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
		{ before(grammarAccess.getClassifierAssignmentPatternAccess().getAssignedClassifiersTypeReferenceParserRuleCall_2_0_0_0()); }
		ruleTypeReference
		{ after(grammarAccess.getClassifierAssignmentPatternAccess().getAssignedClassifiersTypeReferenceParserRuleCall_2_0_0_0()); }
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
		{ before(grammarAccess.getClassifierAssignmentPatternAccess().getAssignedClassifiersTypeReferenceParserRuleCall_2_0_1_1_0()); }
		ruleTypeReference
		{ after(grammarAccess.getClassifierAssignmentPatternAccess().getAssignedClassifiersTypeReferenceParserRuleCall_2_0_1_1_0()); }
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
		{ before(grammarAccess.getQueryExpressionAccess().getTargetPatternClassifierOrTypeCrossReference_2_0()); }
		(
			{ before(grammarAccess.getQueryExpressionAccess().getTargetPatternClassifierOrTypeQualifiedTypesReferenceParserRuleCall_2_0_1()); }
			ruleQualifiedTypesReference
			{ after(grammarAccess.getQueryExpressionAccess().getTargetPatternClassifierOrTypeQualifiedTypesReferenceParserRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getQueryExpressionAccess().getTargetPatternClassifierOrTypeCrossReference_2_0()); }
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

rule__ConfigurationElement__BindingsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigurationElementAccess().getBindingsBindingParserRuleCall_1_0()); }
		ruleBinding
		{ after(grammarAccess.getConfigurationElementAccess().getBindingsBindingParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationElement__ClassifierAssignmentsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigurationElementAccess().getClassifierAssignmentsClassifierAssignmentParserRuleCall_2_0()); }
		ruleClassifierAssignment
		{ after(grammarAccess.getConfigurationElementAccess().getClassifierAssignmentsClassifierAssignmentParserRuleCall_2_0()); }
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
		{ before(grammarAccess.getConfigurationElementAccess().getClassifierAssignmentsClassifierAssignmentPatternParserRuleCall_3_0()); }
		ruleClassifierAssignmentPattern
		{ after(grammarAccess.getConfigurationElementAccess().getClassifierAssignmentsClassifierAssignmentPatternParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationElement__AnnexSubclauseAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigurationElementAccess().getAnnexSubclauseAnnexSubclauseParserRuleCall_4_0()); }
		ruleAnnexSubclause
		{ after(grammarAccess.getConfigurationElementAccess().getAnnexSubclauseAnnexSubclauseParserRuleCall_4_0()); }
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
		{ before(grammarAccess.getConfigurationParameterAccess().getTypeClassifierOrTypeCrossReference_2_0()); }
		(
			{ before(grammarAccess.getConfigurationParameterAccess().getTypeClassifierOrTypeQualifiedNameParserRuleCall_2_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getConfigurationParameterAccess().getTypeClassifierOrTypeQualifiedNameParserRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getConfigurationParameterAccess().getTypeClassifierOrTypeCrossReference_2_0()); }
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
		{ before(grammarAccess.getReversableTypeReferenceAccess().getTypeClassifierOrTypeCrossReference_1_0()); }
		(
			{ before(grammarAccess.getReversableTypeReferenceAccess().getTypeClassifierOrTypeQualifiedReferenceParserRuleCall_1_0_1()); }
			ruleQualifiedReference
			{ after(grammarAccess.getReversableTypeReferenceAccess().getTypeClassifierOrTypeQualifiedReferenceParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getReversableTypeReferenceAccess().getTypeClassifierOrTypeCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeReference__TypeAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeReferenceAccess().getTypeClassifierOrTypeCrossReference_0_0()); }
		(
			{ before(grammarAccess.getTypeReferenceAccess().getTypeClassifierOrTypeQualifiedTypesReferenceParserRuleCall_0_0_1()); }
			ruleQualifiedTypesReference
			{ after(grammarAccess.getTypeReferenceAccess().getTypeClassifierOrTypeQualifiedTypesReferenceParserRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getTypeReferenceAccess().getTypeClassifierOrTypeCrossReference_0_0()); }
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

rule__AnnexSubclause__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnnexSubclauseAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getAnnexSubclauseAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnexElement__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnnexElementAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getAnnexElementAccess().getNameIDTerminalRuleCall_1_0()); }
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
		{ before(grammarAccess.getConfigurationExtensionsAccess().getSuperClassifiersTypeReferenceParserRuleCall_0_0()); }
		ruleTypeReference
		{ after(grammarAccess.getConfigurationExtensionsAccess().getSuperClassifiersTypeReferenceParserRuleCall_0_0()); }
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
		{ before(grammarAccess.getConfigurationExtensionsAccess().getSuperClassifiersTypeReferenceParserRuleCall_1_1_0()); }
		ruleTypeReference
		{ after(grammarAccess.getConfigurationExtensionsAccess().getSuperClassifiersTypeReferenceParserRuleCall_1_1_0()); }
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
		{ before(grammarAccess.getConfigurationActualAccess().getAssignedClassifiersTypeReferenceParserRuleCall_2_0()); }
		ruleTypeReference
		{ after(grammarAccess.getConfigurationActualAccess().getAssignedClassifiersTypeReferenceParserRuleCall_2_0()); }
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
		{ before(grammarAccess.getConfigurationActualAccess().getAssignedClassifiersTypeReferenceParserRuleCall_3_1_0()); }
		ruleTypeReference
		{ after(grammarAccess.getConfigurationActualAccess().getAssignedClassifiersTypeReferenceParserRuleCall_3_1_0()); }
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

rule__Workingset__RootComponentsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWorkingsetAccess().getRootComponentsSubcomponentParserRuleCall_5_0()); }
		ruleSubcomponent
		{ after(grammarAccess.getWorkingsetAccess().getRootComponentsSubcomponentParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
