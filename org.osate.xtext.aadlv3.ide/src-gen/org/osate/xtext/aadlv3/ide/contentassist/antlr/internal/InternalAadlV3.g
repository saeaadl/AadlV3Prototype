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

// Entry rule entryRuleComponent
entryRuleComponent
:
{ before(grammarAccess.getComponentRule()); }
	 ruleComponent
{ after(grammarAccess.getComponentRule()); } 
	 EOF 
;

// Rule Component
ruleComponent 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComponentAccess().getGroup()); }
		(rule__Component__Group__0)
		{ after(grammarAccess.getComponentAccess().getGroup()); }
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

// Entry rule entryRuleExprLibrary
entryRuleExprLibrary
:
{ before(grammarAccess.getExprLibraryRule()); }
	 ruleExprLibrary
{ after(grammarAccess.getExprLibraryRule()); } 
	 EOF 
;

// Rule ExprLibrary
ruleExprLibrary 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExprLibraryAccess().getGroup()); }
		(rule__ExprLibrary__Group__0)
		{ after(grammarAccess.getExprLibraryAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExprSubclause
entryRuleExprSubclause
:
{ before(grammarAccess.getExprSubclauseRule()); }
	 ruleExprSubclause
{ after(grammarAccess.getExprSubclauseRule()); } 
	 EOF 
;

// Rule ExprSubclause
ruleExprSubclause 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExprSubclauseAccess().getGroup()); }
		(rule__ExprSubclause__Group__0)
		{ after(grammarAccess.getExprSubclauseAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}


// Rule Declarations
ruleDeclarations 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDeclarationsAccess().getGroup()); }
		(rule__Declarations__Group__0)
		{ after(grammarAccess.getDeclarationsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEDeclaration
entryRuleEDeclaration
:
{ before(grammarAccess.getEDeclarationRule()); }
	 ruleEDeclaration
{ after(grammarAccess.getEDeclarationRule()); } 
	 EOF 
;

// Rule EDeclaration
ruleEDeclaration 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEDeclarationAccess().getAlternatives()); }
		(rule__EDeclaration__Alternatives)
		{ after(grammarAccess.getEDeclarationAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVarDecl
entryRuleVarDecl
:
{ before(grammarAccess.getVarDeclRule()); }
	 ruleVarDecl
{ after(grammarAccess.getVarDeclRule()); } 
	 EOF 
;

// Rule VarDecl
ruleVarDecl 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVarDeclAccess().getGroup()); }
		(rule__VarDecl__Group__0)
		{ after(grammarAccess.getVarDeclAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFunDecl
entryRuleFunDecl
:
{ before(grammarAccess.getFunDeclRule()); }
	 ruleFunDecl
{ after(grammarAccess.getFunDeclRule()); } 
	 EOF 
;

// Rule FunDecl
ruleFunDecl 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFunDeclAccess().getGroup()); }
		(rule__FunDecl__Group__0)
		{ after(grammarAccess.getFunDeclAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleJavaFQN
entryRuleJavaFQN
:
{ before(grammarAccess.getJavaFQNRule()); }
	 ruleJavaFQN
{ after(grammarAccess.getJavaFQNRule()); } 
	 EOF 
;

// Rule JavaFQN
ruleJavaFQN 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getJavaFQNAccess().getGroup()); }
		(rule__JavaFQN__Group__0)
		{ after(grammarAccess.getJavaFQNAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}


// Rule Args
ruleArgs 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getArgsAccess().getGroup()); }
		(rule__Args__Group__0)?
		{ after(grammarAccess.getArgsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleArgument
entryRuleArgument
:
{ before(grammarAccess.getArgumentRule()); }
	 ruleArgument
{ after(grammarAccess.getArgumentRule()); } 
	 EOF 
;

// Rule Argument
ruleArgument 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getArgumentAccess().getGroup()); }
		(rule__Argument__Group__0)
		{ after(grammarAccess.getArgumentAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAssertion
entryRuleAssertion
:
{ before(grammarAccess.getAssertionRule()); }
	 ruleAssertion
{ after(grammarAccess.getAssertionRule()); } 
	 EOF 
;

// Rule Assertion
ruleAssertion 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAssertionAccess().getGroup()); }
		(rule__Assertion__Group__0)
		{ after(grammarAccess.getAssertionAccess().getGroup()); }
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
		{ before(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); }
		(rule__PrimitiveType__Alternatives)
		{ after(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleENumberType
entryRuleENumberType
:
{ before(grammarAccess.getENumberTypeRule()); }
	 ruleENumberType
{ after(grammarAccess.getENumberTypeRule()); } 
	 EOF 
;

// Rule ENumberType
ruleENumberType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getENumberTypeAccess().getAlternatives()); }
		(rule__ENumberType__Alternatives)
		{ after(grammarAccess.getENumberTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEInteger
entryRuleEInteger
:
{ before(grammarAccess.getEIntegerRule()); }
	 ruleEInteger
{ after(grammarAccess.getEIntegerRule()); } 
	 EOF 
;

// Rule EInteger
ruleEInteger 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEIntegerAccess().getGroup()); }
		(rule__EInteger__Group__0)
		{ after(grammarAccess.getEIntegerAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEReal
entryRuleEReal
:
{ before(grammarAccess.getERealRule()); }
	 ruleEReal
{ after(grammarAccess.getERealRule()); } 
	 EOF 
;

// Rule EReal
ruleEReal 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getERealAccess().getGroup()); }
		(rule__EReal__Group__0)
		{ after(grammarAccess.getERealAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRangeType
entryRuleRangeType
:
{ before(grammarAccess.getRangeTypeRule()); }
	 ruleRangeType
{ after(grammarAccess.getRangeTypeRule()); } 
	 EOF 
;

// Rule RangeType
ruleRangeType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRangeTypeAccess().getGroup()); }
		(rule__RangeType__Group__0)
		{ after(grammarAccess.getRangeTypeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCategory
entryRuleCategory
:
{ before(grammarAccess.getCategoryRule()); }
	 ruleCategory
{ after(grammarAccess.getCategoryRule()); } 
	 EOF 
;

// Rule Category
ruleCategory 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCategoryAccess().getCategoryAssignment()); }
		(rule__Category__CategoryAssignment)
		{ after(grammarAccess.getCategoryAccess().getCategoryAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMetaClass
entryRuleMetaClass
:
{ before(grammarAccess.getMetaClassRule()); }
	 ruleMetaClass
{ after(grammarAccess.getMetaClassRule()); } 
	 EOF 
;

// Rule MetaClass
ruleMetaClass 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMetaClassAccess().getClassAssignment()); }
		(rule__MetaClass__ClassAssignment)
		{ after(grammarAccess.getMetaClassAccess().getClassAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRecordType
entryRuleRecordType
:
{ before(grammarAccess.getRecordTypeRule()); }
	 ruleRecordType
{ after(grammarAccess.getRecordTypeRule()); } 
	 EOF 
;

// Rule RecordType
ruleRecordType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRecordTypeAccess().getGroup()); }
		(rule__RecordType__Group__0)
		{ after(grammarAccess.getRecordTypeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleField
entryRuleField
:
{ before(grammarAccess.getFieldRule()); }
	 ruleField
{ after(grammarAccess.getFieldRule()); } 
	 EOF 
;

// Rule Field
ruleField 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFieldAccess().getGroup()); }
		(rule__Field__Group__0)
		{ after(grammarAccess.getFieldAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleUnionType
entryRuleUnionType
:
{ before(grammarAccess.getUnionTypeRule()); }
	 ruleUnionType
{ after(grammarAccess.getUnionTypeRule()); } 
	 EOF 
;

// Rule UnionType
ruleUnionType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getUnionTypeAccess().getGroup()); }
		(rule__UnionType__Group__0)
		{ after(grammarAccess.getUnionTypeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTupleType
entryRuleTupleType
:
{ before(grammarAccess.getTupleTypeRule()); }
	 ruleTupleType
{ after(grammarAccess.getTupleTypeRule()); } 
	 EOF 
;

// Rule TupleType
ruleTupleType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTupleTypeAccess().getGroup()); }
		(rule__TupleType__Group__0)
		{ after(grammarAccess.getTupleTypeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTupleField
entryRuleTupleField
:
{ before(grammarAccess.getTupleFieldRule()); }
	 ruleTupleField
{ after(grammarAccess.getTupleFieldRule()); } 
	 EOF 
;

// Rule TupleField
ruleTupleField 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTupleFieldAccess().getTypeAssignment()); }
		(rule__TupleField__TypeAssignment)
		{ after(grammarAccess.getTupleFieldAccess().getTypeAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleListType
entryRuleListType
:
{ before(grammarAccess.getListTypeRule()); }
	 ruleListType
{ after(grammarAccess.getListTypeRule()); } 
	 EOF 
;

// Rule ListType
ruleListType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getListTypeAccess().getGroup()); }
		(rule__ListType__Group__0)
		{ after(grammarAccess.getListTypeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSetType
entryRuleSetType
:
{ before(grammarAccess.getSetTypeRule()); }
	 ruleSetType
{ after(grammarAccess.getSetTypeRule()); } 
	 EOF 
;

// Rule SetType
ruleSetType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSetTypeAccess().getGroup()); }
		(rule__SetType__Group__0)
		{ after(grammarAccess.getSetTypeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBagType
entryRuleBagType
:
{ before(grammarAccess.getBagTypeRule()); }
	 ruleBagType
{ after(grammarAccess.getBagTypeRule()); } 
	 EOF 
;

// Rule BagType
ruleBagType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBagTypeAccess().getGroup()); }
		(rule__BagType__Group__0)
		{ after(grammarAccess.getBagTypeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMapType
entryRuleMapType
:
{ before(grammarAccess.getMapTypeRule()); }
	 ruleMapType
{ after(grammarAccess.getMapTypeRule()); } 
	 EOF 
;

// Rule MapType
ruleMapType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMapTypeAccess().getGroup()); }
		(rule__MapType__Group__0)
		{ after(grammarAccess.getMapTypeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEnumType
entryRuleEnumType
:
{ before(grammarAccess.getEnumTypeRule()); }
	 ruleEnumType
{ after(grammarAccess.getEnumTypeRule()); } 
	 EOF 
;

// Rule EnumType
ruleEnumType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEnumTypeAccess().getGroup()); }
		(rule__EnumType__Group__0)
		{ after(grammarAccess.getEnumTypeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEnumLiteral
entryRuleEnumLiteral
:
{ before(grammarAccess.getEnumLiteralRule()); }
	 ruleEnumLiteral
{ after(grammarAccess.getEnumLiteralRule()); } 
	 EOF 
;

// Rule EnumLiteral
ruleEnumLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEnumLiteralAccess().getNameAssignment()); }
		(rule__EnumLiteral__NameAssignment)
		{ after(grammarAccess.getEnumLiteralAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTypeRef
entryRuleTypeRef
:
{ before(grammarAccess.getTypeRefRule()); }
	 ruleTypeRef
{ after(grammarAccess.getTypeRefRule()); } 
	 EOF 
;

// Rule TypeRef
ruleTypeRef 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeRefAccess().getRefAssignment()); }
		(rule__TypeRef__RefAssignment)
		{ after(grammarAccess.getTypeRefAccess().getRefAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExpression
entryRuleExpression
:
{ before(grammarAccess.getExpressionRule()); }
	 ruleExpression
{ after(grammarAccess.getExpressionRule()); } 
	 EOF 
;

// Rule Expression
ruleExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpressionAccess().getAlternatives()); }
		(rule__Expression__Alternatives)
		{ after(grammarAccess.getExpressionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBlockExpression
entryRuleBlockExpression
:
{ before(grammarAccess.getBlockExpressionRule()); }
	 ruleBlockExpression
{ after(grammarAccess.getBlockExpressionRule()); } 
	 EOF 
;

// Rule BlockExpression
ruleBlockExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBlockExpressionAccess().getGroup()); }
		(rule__BlockExpression__Group__0)
		{ after(grammarAccess.getBlockExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOrExpression
entryRuleOrExpression
:
{ before(grammarAccess.getOrExpressionRule()); }
	 ruleOrExpression
{ after(grammarAccess.getOrExpressionRule()); } 
	 EOF 
;

// Rule OrExpression
ruleOrExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOrExpressionAccess().getGroup()); }
		(rule__OrExpression__Group__0)
		{ after(grammarAccess.getOrExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOpOr
entryRuleOpOr
:
{ before(grammarAccess.getOpOrRule()); }
	 ruleOpOr
{ after(grammarAccess.getOpOrRule()); } 
	 EOF 
;

// Rule OpOr
ruleOpOr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOpOrAccess().getAlternatives()); }
		(rule__OpOr__Alternatives)
		{ after(grammarAccess.getOpOrAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAndExpression
entryRuleAndExpression
:
{ before(grammarAccess.getAndExpressionRule()); }
	 ruleAndExpression
{ after(grammarAccess.getAndExpressionRule()); } 
	 EOF 
;

// Rule AndExpression
ruleAndExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAndExpressionAccess().getGroup()); }
		(rule__AndExpression__Group__0)
		{ after(grammarAccess.getAndExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOpAnd
entryRuleOpAnd
:
{ before(grammarAccess.getOpAndRule()); }
	 ruleOpAnd
{ after(grammarAccess.getOpAndRule()); } 
	 EOF 
;

// Rule OpAnd
ruleOpAnd 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOpAndAccess().getAlternatives()); }
		(rule__OpAnd__Alternatives)
		{ after(grammarAccess.getOpAndAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEqualityExpression
entryRuleEqualityExpression
:
{ before(grammarAccess.getEqualityExpressionRule()); }
	 ruleEqualityExpression
{ after(grammarAccess.getEqualityExpressionRule()); } 
	 EOF 
;

// Rule EqualityExpression
ruleEqualityExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEqualityExpressionAccess().getGroup()); }
		(rule__EqualityExpression__Group__0)
		{ after(grammarAccess.getEqualityExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOpEquality
entryRuleOpEquality
:
{ before(grammarAccess.getOpEqualityRule()); }
	 ruleOpEquality
{ after(grammarAccess.getOpEqualityRule()); } 
	 EOF 
;

// Rule OpEquality
ruleOpEquality 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOpEqualityAccess().getAlternatives()); }
		(rule__OpEquality__Alternatives)
		{ after(grammarAccess.getOpEqualityAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRelationalExpression
entryRuleRelationalExpression
:
{ before(grammarAccess.getRelationalExpressionRule()); }
	 ruleRelationalExpression
{ after(grammarAccess.getRelationalExpressionRule()); } 
	 EOF 
;

// Rule RelationalExpression
ruleRelationalExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRelationalExpressionAccess().getGroup()); }
		(rule__RelationalExpression__Group__0)
		{ after(grammarAccess.getRelationalExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOpCompare
entryRuleOpCompare
:
{ before(grammarAccess.getOpCompareRule()); }
	 ruleOpCompare
{ after(grammarAccess.getOpCompareRule()); } 
	 EOF 
;

// Rule OpCompare
ruleOpCompare 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOpCompareAccess().getAlternatives()); }
		(rule__OpCompare__Alternatives)
		{ after(grammarAccess.getOpCompareAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAdditiveExpression
entryRuleAdditiveExpression
:
{ before(grammarAccess.getAdditiveExpressionRule()); }
	 ruleAdditiveExpression
{ after(grammarAccess.getAdditiveExpressionRule()); } 
	 EOF 
;

// Rule AdditiveExpression
ruleAdditiveExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAdditiveExpressionAccess().getGroup()); }
		(rule__AdditiveExpression__Group__0)
		{ after(grammarAccess.getAdditiveExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOpAdd
entryRuleOpAdd
:
{ before(grammarAccess.getOpAddRule()); }
	 ruleOpAdd
{ after(grammarAccess.getOpAddRule()); } 
	 EOF 
;

// Rule OpAdd
ruleOpAdd 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOpAddAccess().getAlternatives()); }
		(rule__OpAdd__Alternatives)
		{ after(grammarAccess.getOpAddAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMultiplicativeExpression
entryRuleMultiplicativeExpression
:
{ before(grammarAccess.getMultiplicativeExpressionRule()); }
	 ruleMultiplicativeExpression
{ after(grammarAccess.getMultiplicativeExpressionRule()); } 
	 EOF 
;

// Rule MultiplicativeExpression
ruleMultiplicativeExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); }
		(rule__MultiplicativeExpression__Group__0)
		{ after(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOpMulti
entryRuleOpMulti
:
{ before(grammarAccess.getOpMultiRule()); }
	 ruleOpMulti
{ after(grammarAccess.getOpMultiRule()); } 
	 EOF 
;

// Rule OpMulti
ruleOpMulti 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOpMultiAccess().getAlternatives()); }
		(rule__OpMulti__Alternatives)
		{ after(grammarAccess.getOpMultiAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleUnaryOperation
entryRuleUnaryOperation
:
{ before(grammarAccess.getUnaryOperationRule()); }
	 ruleUnaryOperation
{ after(grammarAccess.getUnaryOperationRule()); } 
	 EOF 
;

// Rule UnaryOperation
ruleUnaryOperation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getUnaryOperationAccess().getAlternatives()); }
		(rule__UnaryOperation__Alternatives)
		{ after(grammarAccess.getUnaryOperationAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOpUnary
entryRuleOpUnary
:
{ before(grammarAccess.getOpUnaryRule()); }
	 ruleOpUnary
{ after(grammarAccess.getOpUnaryRule()); } 
	 EOF 
;

// Rule OpUnary
ruleOpUnary 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOpUnaryAccess().getAlternatives()); }
		(rule__OpUnary__Alternatives)
		{ after(grammarAccess.getOpUnaryAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleUnitExpression
entryRuleUnitExpression
:
{ before(grammarAccess.getUnitExpressionRule()); }
	 ruleUnitExpression
{ after(grammarAccess.getUnitExpressionRule()); } 
	 EOF 
;

// Rule UnitExpression
ruleUnitExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getUnitExpressionAccess().getGroup()); }
		(rule__UnitExpression__Group__0)
		{ after(grammarAccess.getUnitExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePropertyExpression
entryRulePropertyExpression
:
{ before(grammarAccess.getPropertyExpressionRule()); }
	 rulePropertyExpression
{ after(grammarAccess.getPropertyExpressionRule()); } 
	 EOF 
;

// Rule PropertyExpression
rulePropertyExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPropertyExpressionAccess().getGroup()); }
		(rule__PropertyExpression__Group__0)
		{ after(grammarAccess.getPropertyExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSelectExpression
entryRuleSelectExpression
:
{ before(grammarAccess.getSelectExpressionRule()); }
	 ruleSelectExpression
{ after(grammarAccess.getSelectExpressionRule()); } 
	 EOF 
;

// Rule SelectExpression
ruleSelectExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSelectExpressionAccess().getGroup()); }
		(rule__SelectExpression__Group__0)
		{ after(grammarAccess.getSelectExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePrimaryExpression
entryRulePrimaryExpression
:
{ before(grammarAccess.getPrimaryExpressionRule()); }
	 rulePrimaryExpression
{ after(grammarAccess.getPrimaryExpressionRule()); } 
	 EOF 
;

// Rule PrimaryExpression
rulePrimaryExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); }
		(rule__PrimaryExpression__Alternatives)
		{ after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNamedElementRef
entryRuleNamedElementRef
:
{ before(grammarAccess.getNamedElementRefRule()); }
	 ruleNamedElementRef
{ after(grammarAccess.getNamedElementRefRule()); } 
	 EOF 
;

// Rule NamedElementRef
ruleNamedElementRef 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNamedElementRefAccess().getGroup()); }
		(rule__NamedElementRef__Group__0)
		{ after(grammarAccess.getNamedElementRefAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRangeExpression
entryRuleRangeExpression
:
{ before(grammarAccess.getRangeExpressionRule()); }
	 ruleRangeExpression
{ after(grammarAccess.getRangeExpressionRule()); } 
	 EOF 
;

// Rule RangeExpression
ruleRangeExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRangeExpressionAccess().getGroup()); }
		(rule__RangeExpression__Group__0)
		{ after(grammarAccess.getRangeExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIfExpression
entryRuleIfExpression
:
{ before(grammarAccess.getIfExpressionRule()); }
	 ruleIfExpression
{ after(grammarAccess.getIfExpressionRule()); } 
	 EOF 
;

// Rule IfExpression
ruleIfExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIfExpressionAccess().getGroup()); }
		(rule__IfExpression__Group__0)
		{ after(grammarAccess.getIfExpressionAccess().getGroup()); }
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

// Entry rule entryRuleEBooleanLiteral
entryRuleEBooleanLiteral
:
{ before(grammarAccess.getEBooleanLiteralRule()); }
	 ruleEBooleanLiteral
{ after(grammarAccess.getEBooleanLiteralRule()); } 
	 EOF 
;

// Rule EBooleanLiteral
ruleEBooleanLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEBooleanLiteralAccess().getGroup()); }
		(rule__EBooleanLiteral__Group__0)
		{ after(grammarAccess.getEBooleanLiteralAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNumberLiteral
entryRuleNumberLiteral
:
{ before(grammarAccess.getNumberLiteralRule()); }
	 ruleNumberLiteral
{ after(grammarAccess.getNumberLiteralRule()); } 
	 EOF 
;

// Rule NumberLiteral
ruleNumberLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNumberLiteralAccess().getAlternatives()); }
		(rule__NumberLiteral__Alternatives)
		{ after(grammarAccess.getNumberLiteralAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEIntegerLiteral
entryRuleEIntegerLiteral
:
{ before(grammarAccess.getEIntegerLiteralRule()); }
	 ruleEIntegerLiteral
{ after(grammarAccess.getEIntegerLiteralRule()); } 
	 EOF 
;

// Rule EIntegerLiteral
ruleEIntegerLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEIntegerLiteralAccess().getGroup()); }
		(rule__EIntegerLiteral__Group__0)
		{ after(grammarAccess.getEIntegerLiteralAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleERealLiteral
entryRuleERealLiteral
:
{ before(grammarAccess.getERealLiteralRule()); }
	 ruleERealLiteral
{ after(grammarAccess.getERealLiteralRule()); } 
	 EOF 
;

// Rule ERealLiteral
ruleERealLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getERealLiteralAccess().getGroup()); }
		(rule__ERealLiteral__Group__0)
		{ after(grammarAccess.getERealLiteralAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEStringLiteral
entryRuleEStringLiteral
:
{ before(grammarAccess.getEStringLiteralRule()); }
	 ruleEStringLiteral
{ after(grammarAccess.getEStringLiteralRule()); } 
	 EOF 
;

// Rule EStringLiteral
ruleEStringLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEStringLiteralAccess().getGroup()); }
		(rule__EStringLiteral__Group__0)
		{ after(grammarAccess.getEStringLiteralAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}


// Rule ExpressionList
ruleExpressionList 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpressionListAccess().getGroup()); }
		(rule__ExpressionList__Group__0)
		{ after(grammarAccess.getExpressionListAccess().getGroup()); }
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

// Entry rule entryRuleRecordLiteral
entryRuleRecordLiteral
:
{ before(grammarAccess.getRecordLiteralRule()); }
	 ruleRecordLiteral
{ after(grammarAccess.getRecordLiteralRule()); } 
	 EOF 
;

// Rule RecordLiteral
ruleRecordLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRecordLiteralAccess().getGroup()); }
		(rule__RecordLiteral__Group__0)
		{ after(grammarAccess.getRecordLiteralAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFieldValue
entryRuleFieldValue
:
{ before(grammarAccess.getFieldValueRule()); }
	 ruleFieldValue
{ after(grammarAccess.getFieldValueRule()); } 
	 EOF 
;

// Rule FieldValue
ruleFieldValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFieldValueAccess().getGroup()); }
		(rule__FieldValue__Group__0)
		{ after(grammarAccess.getFieldValueAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleUnionLiteral
entryRuleUnionLiteral
:
{ before(grammarAccess.getUnionLiteralRule()); }
	 ruleUnionLiteral
{ after(grammarAccess.getUnionLiteralRule()); } 
	 EOF 
;

// Rule UnionLiteral
ruleUnionLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getUnionLiteralAccess().getGroup()); }
		(rule__UnionLiteral__Group__0)
		{ after(grammarAccess.getUnionLiteralAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTupleLiteral
entryRuleTupleLiteral
:
{ before(grammarAccess.getTupleLiteralRule()); }
	 ruleTupleLiteral
{ after(grammarAccess.getTupleLiteralRule()); } 
	 EOF 
;

// Rule TupleLiteral
ruleTupleLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTupleLiteralAccess().getGroup()); }
		(rule__TupleLiteral__Group__0)
		{ after(grammarAccess.getTupleLiteralAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBagLiteral
entryRuleBagLiteral
:
{ before(grammarAccess.getBagLiteralRule()); }
	 ruleBagLiteral
{ after(grammarAccess.getBagLiteralRule()); } 
	 EOF 
;

// Rule BagLiteral
ruleBagLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBagLiteralAccess().getGroup()); }
		(rule__BagLiteral__Group__0)
		{ after(grammarAccess.getBagLiteralAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMapLiteral
entryRuleMapLiteral
:
{ before(grammarAccess.getMapLiteralRule()); }
	 ruleMapLiteral
{ after(grammarAccess.getMapLiteralRule()); } 
	 EOF 
;

// Rule MapLiteral
ruleMapLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMapLiteralAccess().getGroup()); }
		(rule__MapLiteral__Group__0)
		{ after(grammarAccess.getMapLiteralAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleUnitsType
entryRuleUnitsType
:
{ before(grammarAccess.getUnitsTypeRule()); }
	 ruleUnitsType
{ after(grammarAccess.getUnitsTypeRule()); } 
	 EOF 
;

// Rule UnitsType
ruleUnitsType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getUnitsTypeAccess().getGroup()); }
		(rule__UnitsType__Group__0)
		{ after(grammarAccess.getUnitsTypeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleUnitLiteral
entryRuleUnitLiteral
:
{ before(grammarAccess.getUnitLiteralRule()); }
	 ruleUnitLiteral
{ after(grammarAccess.getUnitLiteralRule()); } 
	 EOF 
;

// Rule UnitLiteral
ruleUnitLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getUnitLiteralAccess().getNameAssignment()); }
		(rule__UnitLiteral__NameAssignment)
		{ after(grammarAccess.getUnitLiteralAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleUnitLiteralConversion
entryRuleUnitLiteralConversion
:
{ before(grammarAccess.getUnitLiteralConversionRule()); }
	 ruleUnitLiteralConversion
{ after(grammarAccess.getUnitLiteralConversionRule()); } 
	 EOF 
;

// Rule UnitLiteralConversion
ruleUnitLiteralConversion 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getUnitLiteralConversionAccess().getGroup()); }
		(rule__UnitLiteralConversion__Group__0)
		{ after(grammarAccess.getUnitLiteralConversionAccess().getGroup()); }
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

// Entry rule entryRuleQCREF
entryRuleQCREF
:
{ before(grammarAccess.getQCREFRule()); }
	 ruleQCREF
{ after(grammarAccess.getQCREFRule()); } 
	 EOF 
;

// Rule QCREF
ruleQCREF 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQCREFAccess().getGroup()); }
		(rule__QCREF__Group__0)
		{ after(grammarAccess.getQCREFAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQPREF
entryRuleQPREF
:
{ before(grammarAccess.getQPREFRule()); }
	 ruleQPREF
{ after(grammarAccess.getQPREFRule()); } 
	 EOF 
;

// Rule QPREF
ruleQPREF 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQPREFAccess().getGroup()); }
		(rule__QPREF__Group__0)
		{ after(grammarAccess.getQPREFAccess().getGroup()); }
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

// Rule MetaClassEnum
ruleMetaClassEnum
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMetaClassEnumAccess().getAlternatives()); }
		(rule__MetaClassEnum__Alternatives)
		{ after(grammarAccess.getMetaClassEnumAccess().getAlternatives()); }
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

rule__EDeclaration__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEDeclarationAccess().getVarDeclParserRuleCall_0()); }
		ruleVarDecl
		{ after(grammarAccess.getEDeclarationAccess().getVarDeclParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEDeclarationAccess().getFunDeclParserRuleCall_1()); }
		ruleFunDecl
		{ after(grammarAccess.getEDeclarationAccess().getFunDeclParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getEDeclarationAccess().getAssertionParserRuleCall_2()); }
		ruleAssertion
		{ after(grammarAccess.getEDeclarationAccess().getAssertionParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDecl__Alternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVarDeclAccess().getConstAssignment_0_0()); }
		(rule__VarDecl__ConstAssignment_0_0)
		{ after(grammarAccess.getVarDeclAccess().getConstAssignment_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getVarDeclAccess().getVarKeyword_0_1()); }
		'var'
		{ after(grammarAccess.getVarDeclAccess().getVarKeyword_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FunDecl__Alternatives_7_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunDeclAccess().getGroup_7_1_0()); }
		(rule__FunDecl__Group_7_1_0__0)
		{ after(grammarAccess.getFunDeclAccess().getGroup_7_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getFunDeclAccess().getExpAssignment_7_1_1()); }
		(rule__FunDecl__ExpAssignment_7_1_1)
		{ after(grammarAccess.getFunDeclAccess().getExpAssignment_7_1_1()); }
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
		{ before(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0()); }
		rulePrimitiveType
		{ after(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getRangeTypeParserRuleCall_1()); }
		ruleRangeType
		{ after(grammarAccess.getTypeAccess().getRangeTypeParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getCategoryParserRuleCall_2()); }
		ruleCategory
		{ after(grammarAccess.getTypeAccess().getCategoryParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getMetaClassParserRuleCall_3()); }
		ruleMetaClass
		{ after(grammarAccess.getTypeAccess().getMetaClassParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getRecordTypeParserRuleCall_4()); }
		ruleRecordType
		{ after(grammarAccess.getTypeAccess().getRecordTypeParserRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getUnionTypeParserRuleCall_5()); }
		ruleUnionType
		{ after(grammarAccess.getTypeAccess().getUnionTypeParserRuleCall_5()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getTupleTypeParserRuleCall_6()); }
		ruleTupleType
		{ after(grammarAccess.getTypeAccess().getTupleTypeParserRuleCall_6()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getListTypeParserRuleCall_7()); }
		ruleListType
		{ after(grammarAccess.getTypeAccess().getListTypeParserRuleCall_7()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getSetTypeParserRuleCall_8()); }
		ruleSetType
		{ after(grammarAccess.getTypeAccess().getSetTypeParserRuleCall_8()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getBagTypeParserRuleCall_9()); }
		ruleBagType
		{ after(grammarAccess.getTypeAccess().getBagTypeParserRuleCall_9()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getMapTypeParserRuleCall_10()); }
		ruleMapType
		{ after(grammarAccess.getTypeAccess().getMapTypeParserRuleCall_10()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getEnumTypeParserRuleCall_11()); }
		ruleEnumType
		{ after(grammarAccess.getTypeAccess().getEnumTypeParserRuleCall_11()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getTypeRefParserRuleCall_12()); }
		ruleTypeRef
		{ after(grammarAccess.getTypeAccess().getTypeRefParserRuleCall_12()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getUnitsTypeParserRuleCall_13()); }
		ruleUnitsType
		{ after(grammarAccess.getTypeAccess().getUnitsTypeParserRuleCall_13()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimitiveType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimitiveTypeAccess().getGroup_0()); }
		(rule__PrimitiveType__Group_0__0)
		{ after(grammarAccess.getPrimitiveTypeAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getPrimitiveTypeAccess().getENumberTypeParserRuleCall_1()); }
		ruleENumberType
		{ after(grammarAccess.getPrimitiveTypeAccess().getENumberTypeParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getPrimitiveTypeAccess().getGroup_2()); }
		(rule__PrimitiveType__Group_2__0)
		{ after(grammarAccess.getPrimitiveTypeAccess().getGroup_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ENumberType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getENumberTypeAccess().getEIntegerParserRuleCall_0()); }
		ruleEInteger
		{ after(grammarAccess.getENumberTypeAccess().getEIntegerParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getENumberTypeAccess().getERealParserRuleCall_1()); }
		ruleEReal
		{ after(grammarAccess.getENumberTypeAccess().getERealParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionAccess().getOrExpressionParserRuleCall_0()); }
		ruleOrExpression
		{ after(grammarAccess.getExpressionAccess().getOrExpressionParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getExpressionAccess().getBlockExpressionParserRuleCall_1()); }
		ruleBlockExpression
		{ after(grammarAccess.getExpressionAccess().getBlockExpressionParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpOr__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOpOrAccess().getOrKeyword_0()); }
		'or'
		{ after(grammarAccess.getOpOrAccess().getOrKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getOpOrAccess().getVerticalLineVerticalLineKeyword_1()); }
		'||'
		{ after(grammarAccess.getOpOrAccess().getVerticalLineVerticalLineKeyword_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpAnd__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOpAndAccess().getAndKeyword_0()); }
		'and'
		{ after(grammarAccess.getOpAndAccess().getAndKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getOpAndAccess().getAmpersandAmpersandKeyword_1()); }
		'&&'
		{ after(grammarAccess.getOpAndAccess().getAmpersandAmpersandKeyword_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpEquality__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); }
		'=='
		{ after(grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); }
		'!='
		{ after(grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpCompare__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); }
		'>='
		{ after(grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); }
		'<='
		{ after(grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); }
	)
	|
	(
		{ before(grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); }
		'>'
		{ after(grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); }
	)
	|
	(
		{ before(grammarAccess.getOpCompareAccess().getLessThanSignKeyword_3()); }
		'<'
		{ after(grammarAccess.getOpCompareAccess().getLessThanSignKeyword_3()); }
	)
	|
	(
		{ before(grammarAccess.getOpCompareAccess().getGreaterThanSignLessThanSignKeyword_4()); }
		'><'
		{ after(grammarAccess.getOpCompareAccess().getGreaterThanSignLessThanSignKeyword_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpAdd__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); }
		'+'
		{ after(grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1()); }
		'-'
		{ after(grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpMulti__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); }
		'*'
		{ after(grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getOpMultiAccess().getSolidusKeyword_1()); }
		'/'
		{ after(grammarAccess.getOpMultiAccess().getSolidusKeyword_1()); }
	)
	|
	(
		{ before(grammarAccess.getOpMultiAccess().getDivKeyword_2()); }
		'div'
		{ after(grammarAccess.getOpMultiAccess().getDivKeyword_2()); }
	)
	|
	(
		{ before(grammarAccess.getOpMultiAccess().getModKeyword_3()); }
		'mod'
		{ after(grammarAccess.getOpMultiAccess().getModKeyword_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnaryOperation__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnaryOperationAccess().getGroup_0()); }
		(rule__UnaryOperation__Group_0__0)
		{ after(grammarAccess.getUnaryOperationAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getUnaryOperationAccess().getUnitExpressionParserRuleCall_1()); }
		ruleUnitExpression
		{ after(grammarAccess.getUnaryOperationAccess().getUnitExpressionParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpUnary__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOpUnaryAccess().getNotKeyword_0()); }
		'not'
		{ after(grammarAccess.getOpUnaryAccess().getNotKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); }
		'-'
		{ after(grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); }
	)
	|
	(
		{ before(grammarAccess.getOpUnaryAccess().getPlusSignKeyword_2()); }
		'+'
		{ after(grammarAccess.getOpUnaryAccess().getPlusSignKeyword_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitExpression__Alternatives_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnitExpressionAccess().getConvertAssignment_1_1_0()); }
		(rule__UnitExpression__ConvertAssignment_1_1_0)
		{ after(grammarAccess.getUnitExpressionAccess().getConvertAssignment_1_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getUnitExpressionAccess().getDropAssignment_1_1_1()); }
		(rule__UnitExpression__DropAssignment_1_1_1)
		{ after(grammarAccess.getUnitExpressionAccess().getDropAssignment_1_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpression__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimaryExpressionAccess().getNamedElementRefParserRuleCall_0()); }
		ruleNamedElementRef
		{ after(grammarAccess.getPrimaryExpressionAccess().getNamedElementRefParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getPrimaryExpressionAccess().getRangeExpressionParserRuleCall_1()); }
		ruleRangeExpression
		{ after(grammarAccess.getPrimaryExpressionAccess().getRangeExpressionParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getPrimaryExpressionAccess().getIfExpressionParserRuleCall_2()); }
		ruleIfExpression
		{ after(grammarAccess.getPrimaryExpressionAccess().getIfExpressionParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_3()); }
		ruleLiteral
		{ after(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getPrimaryExpressionAccess().getGroup_4()); }
		(rule__PrimaryExpression__Group_4__0)
		{ after(grammarAccess.getPrimaryExpressionAccess().getGroup_4()); }
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
		{ before(grammarAccess.getLiteralAccess().getEBooleanLiteralParserRuleCall_0()); }
		ruleEBooleanLiteral
		{ after(grammarAccess.getLiteralAccess().getEBooleanLiteralParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_1()); }
		ruleNumberLiteral
		{ after(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getLiteralAccess().getEStringLiteralParserRuleCall_2()); }
		ruleEStringLiteral
		{ after(grammarAccess.getLiteralAccess().getEStringLiteralParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getLiteralAccess().getListLiteralParserRuleCall_3()); }
		ruleListLiteral
		{ after(grammarAccess.getLiteralAccess().getListLiteralParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getLiteralAccess().getSetLiteralParserRuleCall_4()); }
		ruleSetLiteral
		{ after(grammarAccess.getLiteralAccess().getSetLiteralParserRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getLiteralAccess().getRecordLiteralParserRuleCall_5()); }
		ruleRecordLiteral
		{ after(grammarAccess.getLiteralAccess().getRecordLiteralParserRuleCall_5()); }
	)
	|
	(
		{ before(grammarAccess.getLiteralAccess().getUnionLiteralParserRuleCall_6()); }
		ruleUnionLiteral
		{ after(grammarAccess.getLiteralAccess().getUnionLiteralParserRuleCall_6()); }
	)
	|
	(
		{ before(grammarAccess.getLiteralAccess().getTupleLiteralParserRuleCall_7()); }
		ruleTupleLiteral
		{ after(grammarAccess.getLiteralAccess().getTupleLiteralParserRuleCall_7()); }
	)
	|
	(
		{ before(grammarAccess.getLiteralAccess().getBagLiteralParserRuleCall_8()); }
		ruleBagLiteral
		{ after(grammarAccess.getLiteralAccess().getBagLiteralParserRuleCall_8()); }
	)
	|
	(
		{ before(grammarAccess.getLiteralAccess().getMapLiteralParserRuleCall_9()); }
		ruleMapLiteral
		{ after(grammarAccess.getLiteralAccess().getMapLiteralParserRuleCall_9()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EBooleanLiteral__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEBooleanLiteralAccess().getValueAssignment_1_0()); }
		(rule__EBooleanLiteral__ValueAssignment_1_0)
		{ after(grammarAccess.getEBooleanLiteralAccess().getValueAssignment_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getEBooleanLiteralAccess().getFalseKeyword_1_1()); }
		'false'
		{ after(grammarAccess.getEBooleanLiteralAccess().getFalseKeyword_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NumberLiteral__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNumberLiteralAccess().getEIntegerLiteralParserRuleCall_0()); }
		ruleEIntegerLiteral
		{ after(grammarAccess.getNumberLiteralAccess().getEIntegerLiteralParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getNumberLiteralAccess().getERealLiteralParserRuleCall_1()); }
		ruleERealLiteral
		{ after(grammarAccess.getNumberLiteralAccess().getERealLiteralParserRuleCall_1()); }
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

rule__MetaClassEnum__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMetaClassEnumAccess().getCOMPONENTEnumLiteralDeclaration_0()); }
		('component')
		{ after(grammarAccess.getMetaClassEnumAccess().getCOMPONENTEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getMetaClassEnumAccess().getFEATUREEnumLiteralDeclaration_1()); }
		('feature')
		{ after(grammarAccess.getMetaClassEnumAccess().getFEATUREEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getMetaClassEnumAccess().getCONNECTIONEnumLiteralDeclaration_2()); }
		('connection')
		{ after(grammarAccess.getMetaClassEnumAccess().getCONNECTIONEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getMetaClassEnumAccess().getFLOWEnumLiteralDeclaration_3()); }
		('flow')
		{ after(grammarAccess.getMetaClassEnumAccess().getFLOWEnumLiteralDeclaration_3()); }
	)
	|
	(
		{ before(grammarAccess.getMetaClassEnumAccess().getMODEEnumLiteralDeclaration_4()); }
		('mode')
		{ after(grammarAccess.getMetaClassEnumAccess().getMODEEnumLiteralDeclaration_4()); }
	)
	|
	(
		{ before(grammarAccess.getMetaClassEnumAccess().getPROPERTYEnumLiteralDeclaration_5()); }
		('property')
		{ after(grammarAccess.getMetaClassEnumAccess().getPROPERTYEnumLiteralDeclaration_5()); }
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


rule__Component__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Component__Group__0__Impl
	rule__Component__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentAccess().getNameAssignment_0()); }
	(rule__Component__NameAssignment_0)
	{ after(grammarAccess.getComponentAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Component__Group__1__Impl
	rule__Component__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getComponentAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Component__Group__2__Impl
	rule__Component__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentAccess().getCategoryAssignment_2()); }
	(rule__Component__CategoryAssignment_2)
	{ after(grammarAccess.getComponentAccess().getCategoryAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Component__Group__3__Impl
	rule__Component__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentAccess().getTypeReferencesAssignment_3()); }
	(rule__Component__TypeReferencesAssignment_3)?
	{ after(grammarAccess.getComponentAccess().getTypeReferencesAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Component__Group__4__Impl
	rule__Component__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentAccess().getNestedComponentImplementationBlockParserRuleCall_4()); }
	(ruleNestedComponentImplementationBlock)?
	{ after(grammarAccess.getComponentAccess().getNestedComponentImplementationBlockParserRuleCall_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Component__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getComponentAccess().getSemicolonKeyword_5()); }
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


rule__ExprLibrary__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExprLibrary__Group__0__Impl
	rule__ExprLibrary__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExprLibrary__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExprLibraryAccess().getExprLibraryAction_0()); }
	()
	{ after(grammarAccess.getExprLibraryAccess().getExprLibraryAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExprLibrary__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExprLibrary__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExprLibrary__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExprLibraryAccess().getDeclarationsParserRuleCall_1()); }
	(ruleDeclarations)?
	{ after(grammarAccess.getExprLibraryAccess().getDeclarationsParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExprSubclause__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExprSubclause__Group__0__Impl
	rule__ExprSubclause__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExprSubclause__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExprSubclauseAccess().getExprSubclauseAction_0()); }
	()
	{ after(grammarAccess.getExprSubclauseAccess().getExprSubclauseAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExprSubclause__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExprSubclause__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExprSubclause__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExprSubclauseAccess().getDeclarationsParserRuleCall_1()); }
	(ruleDeclarations)?
	{ after(grammarAccess.getExprSubclauseAccess().getDeclarationsParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Declarations__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Declarations__Group__0__Impl
	rule__Declarations__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Declarations__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeclarationsAccess().getDeclsAssignment_0()); }
	(rule__Declarations__DeclsAssignment_0)
	{ after(grammarAccess.getDeclarationsAccess().getDeclsAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Declarations__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Declarations__Group__1__Impl
	rule__Declarations__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Declarations__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeclarationsAccess().getGroup_1()); }
	(rule__Declarations__Group_1__0)*
	{ after(grammarAccess.getDeclarationsAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Declarations__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Declarations__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Declarations__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeclarationsAccess().getSemicolonKeyword_2()); }
	(';')?
	{ after(grammarAccess.getDeclarationsAccess().getSemicolonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Declarations__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Declarations__Group_1__0__Impl
	rule__Declarations__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Declarations__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeclarationsAccess().getSemicolonKeyword_1_0()); }
	';'
	{ after(grammarAccess.getDeclarationsAccess().getSemicolonKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Declarations__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Declarations__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Declarations__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeclarationsAccess().getDeclsAssignment_1_1()); }
	(rule__Declarations__DeclsAssignment_1_1)
	{ after(grammarAccess.getDeclarationsAccess().getDeclsAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VarDecl__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarDecl__Group__0__Impl
	rule__VarDecl__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDecl__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarDeclAccess().getAlternatives_0()); }
	(rule__VarDecl__Alternatives_0)
	{ after(grammarAccess.getVarDeclAccess().getAlternatives_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDecl__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarDecl__Group__1__Impl
	rule__VarDecl__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDecl__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarDeclAccess().getNameAssignment_1()); }
	(rule__VarDecl__NameAssignment_1)
	{ after(grammarAccess.getVarDeclAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDecl__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarDecl__Group__2__Impl
	rule__VarDecl__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDecl__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarDeclAccess().getGroup_2()); }
	(rule__VarDecl__Group_2__0)?
	{ after(grammarAccess.getVarDeclAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDecl__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarDecl__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDecl__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarDeclAccess().getGroup_3()); }
	(rule__VarDecl__Group_3__0)?
	{ after(grammarAccess.getVarDeclAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VarDecl__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarDecl__Group_2__0__Impl
	rule__VarDecl__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDecl__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarDeclAccess().getColonKeyword_2_0()); }
	':'
	{ after(grammarAccess.getVarDeclAccess().getColonKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDecl__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarDecl__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDecl__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarDeclAccess().getDeclTypeAssignment_2_1()); }
	(rule__VarDecl__DeclTypeAssignment_2_1)
	{ after(grammarAccess.getVarDeclAccess().getDeclTypeAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VarDecl__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarDecl__Group_3__0__Impl
	rule__VarDecl__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDecl__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarDeclAccess().getEqualsSignKeyword_3_0()); }
	'='
	{ after(grammarAccess.getVarDeclAccess().getEqualsSignKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDecl__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarDecl__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDecl__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarDeclAccess().getValueAssignment_3_1()); }
	(rule__VarDecl__ValueAssignment_3_1)
	{ after(grammarAccess.getVarDeclAccess().getValueAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FunDecl__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FunDecl__Group__0__Impl
	rule__FunDecl__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FunDecl__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunDeclAccess().getDefKeyword_0()); }
	'def'
	{ after(grammarAccess.getFunDeclAccess().getDefKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FunDecl__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FunDecl__Group__1__Impl
	rule__FunDecl__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FunDecl__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunDeclAccess().getNameAssignment_1()); }
	(rule__FunDecl__NameAssignment_1)
	{ after(grammarAccess.getFunDeclAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FunDecl__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FunDecl__Group__2__Impl
	rule__FunDecl__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__FunDecl__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunDeclAccess().getLeftParenthesisKeyword_2()); }
	'('
	{ after(grammarAccess.getFunDeclAccess().getLeftParenthesisKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FunDecl__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FunDecl__Group__3__Impl
	rule__FunDecl__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__FunDecl__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunDeclAccess().getArgsParserRuleCall_3()); }
	ruleArgs
	{ after(grammarAccess.getFunDeclAccess().getArgsParserRuleCall_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FunDecl__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FunDecl__Group__4__Impl
	rule__FunDecl__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__FunDecl__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunDeclAccess().getRightParenthesisKeyword_4()); }
	')'
	{ after(grammarAccess.getFunDeclAccess().getRightParenthesisKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FunDecl__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FunDecl__Group__5__Impl
	rule__FunDecl__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__FunDecl__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunDeclAccess().getColonKeyword_5()); }
	':'
	{ after(grammarAccess.getFunDeclAccess().getColonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FunDecl__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FunDecl__Group__6__Impl
	rule__FunDecl__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__FunDecl__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunDeclAccess().getResultTypeAssignment_6()); }
	(rule__FunDecl__ResultTypeAssignment_6)
	{ after(grammarAccess.getFunDeclAccess().getResultTypeAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FunDecl__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FunDecl__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FunDecl__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunDeclAccess().getGroup_7()); }
	(rule__FunDecl__Group_7__0)?
	{ after(grammarAccess.getFunDeclAccess().getGroup_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FunDecl__Group_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FunDecl__Group_7__0__Impl
	rule__FunDecl__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FunDecl__Group_7__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunDeclAccess().getEqualsSignKeyword_7_0()); }
	'='
	{ after(grammarAccess.getFunDeclAccess().getEqualsSignKeyword_7_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FunDecl__Group_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FunDecl__Group_7__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FunDecl__Group_7__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunDeclAccess().getAlternatives_7_1()); }
	(rule__FunDecl__Alternatives_7_1)
	{ after(grammarAccess.getFunDeclAccess().getAlternatives_7_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FunDecl__Group_7_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FunDecl__Group_7_1_0__0__Impl
	rule__FunDecl__Group_7_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FunDecl__Group_7_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunDeclAccess().getJavaAssignment_7_1_0_0()); }
	(rule__FunDecl__JavaAssignment_7_1_0_0)
	{ after(grammarAccess.getFunDeclAccess().getJavaAssignment_7_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FunDecl__Group_7_1_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FunDecl__Group_7_1_0__1__Impl
	rule__FunDecl__Group_7_1_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FunDecl__Group_7_1_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunDeclAccess().getColonKeyword_7_1_0_1()); }
	':'
	{ after(grammarAccess.getFunDeclAccess().getColonKeyword_7_1_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FunDecl__Group_7_1_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FunDecl__Group_7_1_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FunDecl__Group_7_1_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunDeclAccess().getFqnAssignment_7_1_0_2()); }
	(rule__FunDecl__FqnAssignment_7_1_0_2)
	{ after(grammarAccess.getFunDeclAccess().getFqnAssignment_7_1_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__JavaFQN__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JavaFQN__Group__0__Impl
	rule__JavaFQN__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__JavaFQN__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJavaFQNAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getJavaFQNAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__JavaFQN__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JavaFQN__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__JavaFQN__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJavaFQNAccess().getGroup_1()); }
	(rule__JavaFQN__Group_1__0)*
	{ after(grammarAccess.getJavaFQNAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__JavaFQN__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JavaFQN__Group_1__0__Impl
	rule__JavaFQN__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__JavaFQN__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJavaFQNAccess().getFullStopKeyword_1_0()); }
	'.'
	{ after(grammarAccess.getJavaFQNAccess().getFullStopKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__JavaFQN__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JavaFQN__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__JavaFQN__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJavaFQNAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
	{ after(grammarAccess.getJavaFQNAccess().getIDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Args__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Args__Group__0__Impl
	rule__Args__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Args__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArgsAccess().getArgsAssignment_0()); }
	(rule__Args__ArgsAssignment_0)
	{ after(grammarAccess.getArgsAccess().getArgsAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Args__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Args__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Args__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArgsAccess().getGroup_1()); }
	(rule__Args__Group_1__0)*
	{ after(grammarAccess.getArgsAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Args__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Args__Group_1__0__Impl
	rule__Args__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Args__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArgsAccess().getCommaKeyword_1_0()); }
	','
	{ after(grammarAccess.getArgsAccess().getCommaKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Args__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Args__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Args__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArgsAccess().getArgsAssignment_1_1()); }
	(rule__Args__ArgsAssignment_1_1)
	{ after(grammarAccess.getArgsAccess().getArgsAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Argument__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Argument__Group__0__Impl
	rule__Argument__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArgumentAccess().getArgumentAction_0()); }
	()
	{ after(grammarAccess.getArgumentAccess().getArgumentAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Argument__Group__1__Impl
	rule__Argument__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArgumentAccess().getNameAssignment_1()); }
	(rule__Argument__NameAssignment_1)
	{ after(grammarAccess.getArgumentAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Argument__Group__2__Impl
	rule__Argument__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArgumentAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getArgumentAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Argument__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArgumentAccess().getTypeAssignment_3()); }
	(rule__Argument__TypeAssignment_3)
	{ after(grammarAccess.getArgumentAccess().getTypeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Assertion__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Assertion__Group__0__Impl
	rule__Assertion__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Assertion__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssertionAccess().getAssertKeyword_0()); }
	'assert'
	{ after(grammarAccess.getAssertionAccess().getAssertKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Assertion__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Assertion__Group__1__Impl
	rule__Assertion__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Assertion__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssertionAccess().getNameAssignment_1()); }
	(rule__Assertion__NameAssignment_1)
	{ after(grammarAccess.getAssertionAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Assertion__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Assertion__Group__2__Impl
	rule__Assertion__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Assertion__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssertionAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getAssertionAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Assertion__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Assertion__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Assertion__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssertionAccess().getAssertAssignment_3()); }
	(rule__Assertion__AssertAssignment_3)
	{ after(grammarAccess.getAssertionAccess().getAssertAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PrimitiveType__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimitiveType__Group_0__0__Impl
	rule__PrimitiveType__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimitiveType__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimitiveTypeAccess().getEBooleanAction_0_0()); }
	()
	{ after(grammarAccess.getPrimitiveTypeAccess().getEBooleanAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimitiveType__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimitiveType__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimitiveType__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimitiveTypeAccess().getBoolKeyword_0_1()); }
	'bool'
	{ after(grammarAccess.getPrimitiveTypeAccess().getBoolKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PrimitiveType__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimitiveType__Group_2__0__Impl
	rule__PrimitiveType__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimitiveType__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimitiveTypeAccess().getEStringAction_2_0()); }
	()
	{ after(grammarAccess.getPrimitiveTypeAccess().getEStringAction_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimitiveType__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimitiveType__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimitiveType__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimitiveTypeAccess().getStringKeyword_2_1()); }
	'string'
	{ after(grammarAccess.getPrimitiveTypeAccess().getStringKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EInteger__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EInteger__Group__0__Impl
	rule__EInteger__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EInteger__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEIntegerAccess().getEIntegerAction_0()); }
	()
	{ after(grammarAccess.getEIntegerAccess().getEIntegerAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EInteger__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EInteger__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EInteger__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEIntegerAccess().getIntKeyword_1()); }
	'int'
	{ after(grammarAccess.getEIntegerAccess().getIntKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EReal__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EReal__Group__0__Impl
	rule__EReal__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EReal__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getERealAccess().getERealAction_0()); }
	()
	{ after(grammarAccess.getERealAccess().getERealAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EReal__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EReal__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EReal__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getERealAccess().getRealKeyword_1()); }
	'real'
	{ after(grammarAccess.getERealAccess().getRealKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RangeType__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RangeType__Group__0__Impl
	rule__RangeType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RangeType__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRangeTypeAccess().getRangeKeyword_0()); }
	'range'
	{ after(grammarAccess.getRangeTypeAccess().getRangeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RangeType__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RangeType__Group__1__Impl
	rule__RangeType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RangeType__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRangeTypeAccess().getOfKeyword_1()); }
	'of'
	{ after(grammarAccess.getRangeTypeAccess().getOfKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RangeType__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RangeType__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RangeType__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRangeTypeAccess().getTypeAssignment_2()); }
	(rule__RangeType__TypeAssignment_2)
	{ after(grammarAccess.getRangeTypeAccess().getTypeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RecordType__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RecordType__Group__0__Impl
	rule__RecordType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordType__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRecordTypeAccess().getRecordTypeAction_0()); }
	()
	{ after(grammarAccess.getRecordTypeAccess().getRecordTypeAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordType__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RecordType__Group__1__Impl
	rule__RecordType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordType__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRecordTypeAccess().getRecordKeyword_1()); }
	'record'
	{ after(grammarAccess.getRecordTypeAccess().getRecordKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordType__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RecordType__Group__2__Impl
	rule__RecordType__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordType__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordType__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RecordType__Group__3__Impl
	rule__RecordType__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordType__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRecordTypeAccess().getGroup_3()); }
	(rule__RecordType__Group_3__0)?
	{ after(grammarAccess.getRecordTypeAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordType__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RecordType__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordType__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRecordTypeAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getRecordTypeAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RecordType__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RecordType__Group_3__0__Impl
	rule__RecordType__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordType__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRecordTypeAccess().getFieldsAssignment_3_0()); }
	(rule__RecordType__FieldsAssignment_3_0)
	{ after(grammarAccess.getRecordTypeAccess().getFieldsAssignment_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordType__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RecordType__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordType__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRecordTypeAccess().getGroup_3_1()); }
	(rule__RecordType__Group_3_1__0)*
	{ after(grammarAccess.getRecordTypeAccess().getGroup_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RecordType__Group_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RecordType__Group_3_1__0__Impl
	rule__RecordType__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordType__Group_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRecordTypeAccess().getCommaKeyword_3_1_0()); }
	','
	{ after(grammarAccess.getRecordTypeAccess().getCommaKeyword_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordType__Group_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RecordType__Group_3_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordType__Group_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRecordTypeAccess().getFieldsAssignment_3_1_1()); }
	(rule__RecordType__FieldsAssignment_3_1_1)
	{ after(grammarAccess.getRecordTypeAccess().getFieldsAssignment_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Field__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Field__Group__0__Impl
	rule__Field__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFieldAccess().getFieldAction_0()); }
	()
	{ after(grammarAccess.getFieldAccess().getFieldAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Field__Group__1__Impl
	rule__Field__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFieldAccess().getNameAssignment_1()); }
	(rule__Field__NameAssignment_1)
	{ after(grammarAccess.getFieldAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Field__Group__2__Impl
	rule__Field__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFieldAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getFieldAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Field__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFieldAccess().getTypeAssignment_3()); }
	(rule__Field__TypeAssignment_3)
	{ after(grammarAccess.getFieldAccess().getTypeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__UnionType__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnionType__Group__0__Impl
	rule__UnionType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UnionType__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnionTypeAccess().getUnionTypeAction_0()); }
	()
	{ after(grammarAccess.getUnionTypeAccess().getUnionTypeAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnionType__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnionType__Group__1__Impl
	rule__UnionType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__UnionType__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnionTypeAccess().getUnionKeyword_1()); }
	'union'
	{ after(grammarAccess.getUnionTypeAccess().getUnionKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnionType__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnionType__Group__2__Impl
	rule__UnionType__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__UnionType__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnionTypeAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getUnionTypeAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnionType__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnionType__Group__3__Impl
	rule__UnionType__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__UnionType__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnionTypeAccess().getGroup_3()); }
	(rule__UnionType__Group_3__0)?
	{ after(grammarAccess.getUnionTypeAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnionType__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnionType__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UnionType__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnionTypeAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getUnionTypeAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__UnionType__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnionType__Group_3__0__Impl
	rule__UnionType__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UnionType__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnionTypeAccess().getFieldsAssignment_3_0()); }
	(rule__UnionType__FieldsAssignment_3_0)
	{ after(grammarAccess.getUnionTypeAccess().getFieldsAssignment_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnionType__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnionType__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UnionType__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnionTypeAccess().getGroup_3_1()); }
	(rule__UnionType__Group_3_1__0)*
	{ after(grammarAccess.getUnionTypeAccess().getGroup_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__UnionType__Group_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnionType__Group_3_1__0__Impl
	rule__UnionType__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UnionType__Group_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnionTypeAccess().getCommaKeyword_3_1_0()); }
	','
	{ after(grammarAccess.getUnionTypeAccess().getCommaKeyword_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnionType__Group_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnionType__Group_3_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UnionType__Group_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnionTypeAccess().getFieldsAssignment_3_1_1()); }
	(rule__UnionType__FieldsAssignment_3_1_1)
	{ after(grammarAccess.getUnionTypeAccess().getFieldsAssignment_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TupleType__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TupleType__Group__0__Impl
	rule__TupleType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TupleType__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTupleTypeAccess().getTupleTypeAction_0()); }
	()
	{ after(grammarAccess.getTupleTypeAccess().getTupleTypeAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TupleType__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TupleType__Group__1__Impl
	rule__TupleType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TupleType__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTupleTypeAccess().getTupleKeyword_1()); }
	'tuple'
	{ after(grammarAccess.getTupleTypeAccess().getTupleKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TupleType__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TupleType__Group__2__Impl
	rule__TupleType__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TupleType__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTupleTypeAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getTupleTypeAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TupleType__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TupleType__Group__3__Impl
	rule__TupleType__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TupleType__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTupleTypeAccess().getGroup_3()); }
	(rule__TupleType__Group_3__0)?
	{ after(grammarAccess.getTupleTypeAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TupleType__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TupleType__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TupleType__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTupleTypeAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getTupleTypeAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TupleType__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TupleType__Group_3__0__Impl
	rule__TupleType__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TupleType__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTupleTypeAccess().getFieldsAssignment_3_0()); }
	(rule__TupleType__FieldsAssignment_3_0)
	{ after(grammarAccess.getTupleTypeAccess().getFieldsAssignment_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TupleType__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TupleType__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TupleType__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTupleTypeAccess().getGroup_3_1()); }
	(rule__TupleType__Group_3_1__0)*
	{ after(grammarAccess.getTupleTypeAccess().getGroup_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TupleType__Group_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TupleType__Group_3_1__0__Impl
	rule__TupleType__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TupleType__Group_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTupleTypeAccess().getCommaKeyword_3_1_0()); }
	','
	{ after(grammarAccess.getTupleTypeAccess().getCommaKeyword_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TupleType__Group_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TupleType__Group_3_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TupleType__Group_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTupleTypeAccess().getFieldsAssignment_3_1_1()); }
	(rule__TupleType__FieldsAssignment_3_1_1)
	{ after(grammarAccess.getTupleTypeAccess().getFieldsAssignment_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ListType__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ListType__Group__0__Impl
	rule__ListType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ListType__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListTypeAccess().getListKeyword_0()); }
	'list'
	{ after(grammarAccess.getListTypeAccess().getListKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ListType__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ListType__Group__1__Impl
	rule__ListType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ListType__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListTypeAccess().getOfKeyword_1()); }
	'of'
	{ after(grammarAccess.getListTypeAccess().getOfKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ListType__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ListType__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ListType__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListTypeAccess().getTypeAssignment_2()); }
	(rule__ListType__TypeAssignment_2)
	{ after(grammarAccess.getListTypeAccess().getTypeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SetType__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SetType__Group__0__Impl
	rule__SetType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SetType__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSetTypeAccess().getSetKeyword_0()); }
	'set'
	{ after(grammarAccess.getSetTypeAccess().getSetKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SetType__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SetType__Group__1__Impl
	rule__SetType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SetType__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSetTypeAccess().getOfKeyword_1()); }
	'of'
	{ after(grammarAccess.getSetTypeAccess().getOfKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SetType__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SetType__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SetType__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSetTypeAccess().getTypeAssignment_2()); }
	(rule__SetType__TypeAssignment_2)
	{ after(grammarAccess.getSetTypeAccess().getTypeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BagType__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BagType__Group__0__Impl
	rule__BagType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BagType__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBagTypeAccess().getBagKeyword_0()); }
	'bag'
	{ after(grammarAccess.getBagTypeAccess().getBagKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BagType__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BagType__Group__1__Impl
	rule__BagType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__BagType__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBagTypeAccess().getOfKeyword_1()); }
	'of'
	{ after(grammarAccess.getBagTypeAccess().getOfKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BagType__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BagType__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BagType__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBagTypeAccess().getTypeAssignment_2()); }
	(rule__BagType__TypeAssignment_2)
	{ after(grammarAccess.getBagTypeAccess().getTypeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MapType__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MapType__Group__0__Impl
	rule__MapType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MapType__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMapTypeAccess().getMapKeyword_0()); }
	'map'
	{ after(grammarAccess.getMapTypeAccess().getMapKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MapType__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MapType__Group__1__Impl
	rule__MapType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MapType__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMapTypeAccess().getDomainAssignment_1()); }
	(rule__MapType__DomainAssignment_1)
	{ after(grammarAccess.getMapTypeAccess().getDomainAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MapType__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MapType__Group__2__Impl
	rule__MapType__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MapType__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMapTypeAccess().getHyphenMinusGreaterThanSignKeyword_2()); }
	'->'
	{ after(grammarAccess.getMapTypeAccess().getHyphenMinusGreaterThanSignKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MapType__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MapType__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MapType__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMapTypeAccess().getImageAssignment_3()); }
	(rule__MapType__ImageAssignment_3)
	{ after(grammarAccess.getMapTypeAccess().getImageAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EnumType__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumType__Group__0__Impl
	rule__EnumType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumType__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumTypeAccess().getEnumTypeAction_0()); }
	()
	{ after(grammarAccess.getEnumTypeAccess().getEnumTypeAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumType__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumType__Group__1__Impl
	rule__EnumType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumType__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumTypeAccess().getEnumKeyword_1()); }
	'enum'
	{ after(grammarAccess.getEnumTypeAccess().getEnumKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumType__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumType__Group__2__Impl
	rule__EnumType__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumType__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumTypeAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getEnumTypeAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumType__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumType__Group__3__Impl
	rule__EnumType__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumType__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumTypeAccess().getGroup_3()); }
	(rule__EnumType__Group_3__0)?
	{ after(grammarAccess.getEnumTypeAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumType__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumType__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumType__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumTypeAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getEnumTypeAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EnumType__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumType__Group_3__0__Impl
	rule__EnumType__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumType__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumTypeAccess().getLiteralsAssignment_3_0()); }
	(rule__EnumType__LiteralsAssignment_3_0)
	{ after(grammarAccess.getEnumTypeAccess().getLiteralsAssignment_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumType__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumType__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumType__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumTypeAccess().getGroup_3_1()); }
	(rule__EnumType__Group_3_1__0)*
	{ after(grammarAccess.getEnumTypeAccess().getGroup_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EnumType__Group_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumType__Group_3_1__0__Impl
	rule__EnumType__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumType__Group_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumTypeAccess().getCommaKeyword_3_1_0()); }
	','
	{ after(grammarAccess.getEnumTypeAccess().getCommaKeyword_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumType__Group_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumType__Group_3_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumType__Group_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumTypeAccess().getLiteralsAssignment_3_1_1()); }
	(rule__EnumType__LiteralsAssignment_3_1_1)
	{ after(grammarAccess.getEnumTypeAccess().getLiteralsAssignment_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BlockExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BlockExpression__Group__0__Impl
	rule__BlockExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BlockExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBlockExpressionAccess().getBlockAction_0()); }
	()
	{ after(grammarAccess.getBlockExpressionAccess().getBlockAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BlockExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BlockExpression__Group__1__Impl
	rule__BlockExpression__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__BlockExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBlockExpressionAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getBlockExpressionAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BlockExpression__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BlockExpression__Group__2__Impl
	rule__BlockExpression__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__BlockExpression__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBlockExpressionAccess().getGroup_2()); }
	(rule__BlockExpression__Group_2__0)*
	{ after(grammarAccess.getBlockExpressionAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BlockExpression__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BlockExpression__Group__3__Impl
	rule__BlockExpression__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__BlockExpression__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBlockExpressionAccess().getResultAssignment_3()); }
	(rule__BlockExpression__ResultAssignment_3)
	{ after(grammarAccess.getBlockExpressionAccess().getResultAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BlockExpression__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BlockExpression__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BlockExpression__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBlockExpressionAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getBlockExpressionAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BlockExpression__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BlockExpression__Group_2__0__Impl
	rule__BlockExpression__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BlockExpression__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBlockExpressionAccess().getDeclsAssignment_2_0()); }
	(rule__BlockExpression__DeclsAssignment_2_0)
	{ after(grammarAccess.getBlockExpressionAccess().getDeclsAssignment_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BlockExpression__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BlockExpression__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BlockExpression__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBlockExpressionAccess().getSemicolonKeyword_2_1()); }
	';'
	{ after(grammarAccess.getBlockExpressionAccess().getSemicolonKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OrExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpression__Group__0__Impl
	rule__OrExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); }
	ruleAndExpression
	{ after(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpression__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExpressionAccess().getGroup_1()); }
	(rule__OrExpression__Group_1__0)*
	{ after(grammarAccess.getOrExpressionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OrExpression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpression__Group_1__0__Impl
	rule__OrExpression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExpressionAccess().getGroup_1_0()); }
	(rule__OrExpression__Group_1_0__0)
	{ after(grammarAccess.getOrExpressionAccess().getGroup_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpression__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExpressionAccess().getRightAssignment_1_1()); }
	(rule__OrExpression__RightAssignment_1_1)
	{ after(grammarAccess.getOrExpressionAccess().getRightAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OrExpression__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpression__Group_1_0__0__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExpressionAccess().getGroup_1_0_0()); }
	(rule__OrExpression__Group_1_0_0__0)
	{ after(grammarAccess.getOrExpressionAccess().getGroup_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OrExpression__Group_1_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpression__Group_1_0_0__0__Impl
	rule__OrExpression__Group_1_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__Group_1_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); }
	()
	{ after(grammarAccess.getOrExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__Group_1_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpression__Group_1_0_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__Group_1_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_0_0_1()); }
	(rule__OrExpression__OperatorAssignment_1_0_0_1)
	{ after(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AndExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpression__Group__0__Impl
	rule__AndExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0()); }
	ruleEqualityExpression
	{ after(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpression__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExpressionAccess().getGroup_1()); }
	(rule__AndExpression__Group_1__0)*
	{ after(grammarAccess.getAndExpressionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AndExpression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpression__Group_1__0__Impl
	rule__AndExpression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExpressionAccess().getGroup_1_0()); }
	(rule__AndExpression__Group_1_0__0)
	{ after(grammarAccess.getAndExpressionAccess().getGroup_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpression__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExpressionAccess().getRightAssignment_1_1()); }
	(rule__AndExpression__RightAssignment_1_1)
	{ after(grammarAccess.getAndExpressionAccess().getRightAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AndExpression__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpression__Group_1_0__0__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExpressionAccess().getGroup_1_0_0()); }
	(rule__AndExpression__Group_1_0_0__0)
	{ after(grammarAccess.getAndExpressionAccess().getGroup_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AndExpression__Group_1_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpression__Group_1_0_0__0__Impl
	rule__AndExpression__Group_1_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__Group_1_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); }
	()
	{ after(grammarAccess.getAndExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__Group_1_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpression__Group_1_0_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__Group_1_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_0_0_1()); }
	(rule__AndExpression__OperatorAssignment_1_0_0_1)
	{ after(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EqualityExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EqualityExpression__Group__0__Impl
	rule__EqualityExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EqualityExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEqualityExpressionAccess().getRelationalExpressionParserRuleCall_0()); }
	ruleRelationalExpression
	{ after(grammarAccess.getEqualityExpressionAccess().getRelationalExpressionParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EqualityExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EqualityExpression__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EqualityExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEqualityExpressionAccess().getGroup_1()); }
	(rule__EqualityExpression__Group_1__0)*
	{ after(grammarAccess.getEqualityExpressionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EqualityExpression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EqualityExpression__Group_1__0__Impl
	rule__EqualityExpression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EqualityExpression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEqualityExpressionAccess().getGroup_1_0()); }
	(rule__EqualityExpression__Group_1_0__0)
	{ after(grammarAccess.getEqualityExpressionAccess().getGroup_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EqualityExpression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EqualityExpression__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EqualityExpression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEqualityExpressionAccess().getRightAssignment_1_1()); }
	(rule__EqualityExpression__RightAssignment_1_1)
	{ after(grammarAccess.getEqualityExpressionAccess().getRightAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EqualityExpression__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EqualityExpression__Group_1_0__0__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EqualityExpression__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEqualityExpressionAccess().getGroup_1_0_0()); }
	(rule__EqualityExpression__Group_1_0_0__0)
	{ after(grammarAccess.getEqualityExpressionAccess().getGroup_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EqualityExpression__Group_1_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EqualityExpression__Group_1_0_0__0__Impl
	rule__EqualityExpression__Group_1_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EqualityExpression__Group_1_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEqualityExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); }
	()
	{ after(grammarAccess.getEqualityExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EqualityExpression__Group_1_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EqualityExpression__Group_1_0_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EqualityExpression__Group_1_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEqualityExpressionAccess().getOperatorAssignment_1_0_0_1()); }
	(rule__EqualityExpression__OperatorAssignment_1_0_0_1)
	{ after(grammarAccess.getEqualityExpressionAccess().getOperatorAssignment_1_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RelationalExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RelationalExpression__Group__0__Impl
	rule__RelationalExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationalExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationalExpressionAccess().getAdditiveExpressionParserRuleCall_0()); }
	ruleAdditiveExpression
	{ after(grammarAccess.getRelationalExpressionAccess().getAdditiveExpressionParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationalExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RelationalExpression__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationalExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationalExpressionAccess().getGroup_1()); }
	(rule__RelationalExpression__Group_1__0)*
	{ after(grammarAccess.getRelationalExpressionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RelationalExpression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RelationalExpression__Group_1__0__Impl
	rule__RelationalExpression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationalExpression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationalExpressionAccess().getGroup_1_0()); }
	(rule__RelationalExpression__Group_1_0__0)
	{ after(grammarAccess.getRelationalExpressionAccess().getGroup_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationalExpression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RelationalExpression__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationalExpression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationalExpressionAccess().getRightAssignment_1_1()); }
	(rule__RelationalExpression__RightAssignment_1_1)
	{ after(grammarAccess.getRelationalExpressionAccess().getRightAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RelationalExpression__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RelationalExpression__Group_1_0__0__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationalExpression__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationalExpressionAccess().getGroup_1_0_0()); }
	(rule__RelationalExpression__Group_1_0_0__0)
	{ after(grammarAccess.getRelationalExpressionAccess().getGroup_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RelationalExpression__Group_1_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RelationalExpression__Group_1_0_0__0__Impl
	rule__RelationalExpression__Group_1_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationalExpression__Group_1_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationalExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); }
	()
	{ after(grammarAccess.getRelationalExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationalExpression__Group_1_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RelationalExpression__Group_1_0_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationalExpression__Group_1_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationalExpressionAccess().getOperatorAssignment_1_0_0_1()); }
	(rule__RelationalExpression__OperatorAssignment_1_0_0_1)
	{ after(grammarAccess.getRelationalExpressionAccess().getOperatorAssignment_1_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AdditiveExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AdditiveExpression__Group__0__Impl
	rule__AdditiveExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AdditiveExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); }
	ruleMultiplicativeExpression
	{ after(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AdditiveExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AdditiveExpression__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AdditiveExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAdditiveExpressionAccess().getGroup_1()); }
	(rule__AdditiveExpression__Group_1__0)*
	{ after(grammarAccess.getAdditiveExpressionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AdditiveExpression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AdditiveExpression__Group_1__0__Impl
	rule__AdditiveExpression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AdditiveExpression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAdditiveExpressionAccess().getGroup_1_0()); }
	(rule__AdditiveExpression__Group_1_0__0)
	{ after(grammarAccess.getAdditiveExpressionAccess().getGroup_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AdditiveExpression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AdditiveExpression__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AdditiveExpression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAdditiveExpressionAccess().getRightAssignment_1_1()); }
	(rule__AdditiveExpression__RightAssignment_1_1)
	{ after(grammarAccess.getAdditiveExpressionAccess().getRightAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AdditiveExpression__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AdditiveExpression__Group_1_0__0__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AdditiveExpression__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAdditiveExpressionAccess().getGroup_1_0_0()); }
	(rule__AdditiveExpression__Group_1_0_0__0)
	{ after(grammarAccess.getAdditiveExpressionAccess().getGroup_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AdditiveExpression__Group_1_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AdditiveExpression__Group_1_0_0__0__Impl
	rule__AdditiveExpression__Group_1_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AdditiveExpression__Group_1_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAdditiveExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); }
	()
	{ after(grammarAccess.getAdditiveExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AdditiveExpression__Group_1_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AdditiveExpression__Group_1_0_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AdditiveExpression__Group_1_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAdditiveExpressionAccess().getOperatorAssignment_1_0_0_1()); }
	(rule__AdditiveExpression__OperatorAssignment_1_0_0_1)
	{ after(grammarAccess.getAdditiveExpressionAccess().getOperatorAssignment_1_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MultiplicativeExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiplicativeExpression__Group__0__Impl
	rule__MultiplicativeExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplicativeExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplicativeExpressionAccess().getUnaryOperationParserRuleCall_0()); }
	ruleUnaryOperation
	{ after(grammarAccess.getMultiplicativeExpressionAccess().getUnaryOperationParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplicativeExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiplicativeExpression__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplicativeExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); }
	(rule__MultiplicativeExpression__Group_1__0)*
	{ after(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MultiplicativeExpression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiplicativeExpression__Group_1__0__Impl
	rule__MultiplicativeExpression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplicativeExpression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0()); }
	(rule__MultiplicativeExpression__Group_1_0__0)
	{ after(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplicativeExpression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiplicativeExpression__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplicativeExpression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplicativeExpressionAccess().getRightAssignment_1_1()); }
	(rule__MultiplicativeExpression__RightAssignment_1_1)
	{ after(grammarAccess.getMultiplicativeExpressionAccess().getRightAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MultiplicativeExpression__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiplicativeExpression__Group_1_0__0__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplicativeExpression__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0_0()); }
	(rule__MultiplicativeExpression__Group_1_0_0__0)
	{ after(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MultiplicativeExpression__Group_1_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiplicativeExpression__Group_1_0_0__0__Impl
	rule__MultiplicativeExpression__Group_1_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplicativeExpression__Group_1_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplicativeExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); }
	()
	{ after(grammarAccess.getMultiplicativeExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplicativeExpression__Group_1_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiplicativeExpression__Group_1_0_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplicativeExpression__Group_1_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAssignment_1_0_0_1()); }
	(rule__MultiplicativeExpression__OperatorAssignment_1_0_0_1)
	{ after(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAssignment_1_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__UnaryOperation__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnaryOperation__Group_0__0__Impl
	rule__UnaryOperation__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UnaryOperation__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnaryOperationAccess().getUnaryOperationAction_0_0()); }
	()
	{ after(grammarAccess.getUnaryOperationAccess().getUnaryOperationAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnaryOperation__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnaryOperation__Group_0__1__Impl
	rule__UnaryOperation__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__UnaryOperation__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnaryOperationAccess().getOperatorAssignment_0_1()); }
	(rule__UnaryOperation__OperatorAssignment_0_1)
	{ after(grammarAccess.getUnaryOperationAccess().getOperatorAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnaryOperation__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnaryOperation__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UnaryOperation__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnaryOperationAccess().getOperandAssignment_0_2()); }
	(rule__UnaryOperation__OperandAssignment_0_2)
	{ after(grammarAccess.getUnaryOperationAccess().getOperandAssignment_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__UnitExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnitExpression__Group__0__Impl
	rule__UnitExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitExpressionAccess().getPropertyExpressionParserRuleCall_0()); }
	rulePropertyExpression
	{ after(grammarAccess.getUnitExpressionAccess().getPropertyExpressionParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnitExpression__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitExpressionAccess().getGroup_1()); }
	(rule__UnitExpression__Group_1__0)?
	{ after(grammarAccess.getUnitExpressionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__UnitExpression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnitExpression__Group_1__0__Impl
	rule__UnitExpression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitExpression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitExpressionAccess().getUnitExpressionExpressionAction_1_0()); }
	()
	{ after(grammarAccess.getUnitExpressionAccess().getUnitExpressionExpressionAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitExpression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnitExpression__Group_1__1__Impl
	rule__UnitExpression__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitExpression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitExpressionAccess().getAlternatives_1_1()); }
	(rule__UnitExpression__Alternatives_1_1)?
	{ after(grammarAccess.getUnitExpressionAccess().getAlternatives_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitExpression__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnitExpression__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitExpression__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitExpressionAccess().getUnitAssignment_1_2()); }
	(rule__UnitExpression__UnitAssignment_1_2)
	{ after(grammarAccess.getUnitExpressionAccess().getUnitAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PropertyExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyExpression__Group__0__Impl
	rule__PropertyExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyExpressionAccess().getSelectExpressionParserRuleCall_0()); }
	ruleSelectExpression
	{ after(grammarAccess.getPropertyExpressionAccess().getSelectExpressionParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyExpression__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyExpressionAccess().getGroup_1()); }
	(rule__PropertyExpression__Group_1__0)?
	{ after(grammarAccess.getPropertyExpressionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PropertyExpression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyExpression__Group_1__0__Impl
	rule__PropertyExpression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyExpression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyExpressionAccess().getGroup_1_0()); }
	(rule__PropertyExpression__Group_1_0__0)
	{ after(grammarAccess.getPropertyExpressionAccess().getGroup_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyExpression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyExpression__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyExpression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyExpressionAccess().getPropertyAssignment_1_1()); }
	(rule__PropertyExpression__PropertyAssignment_1_1)
	{ after(grammarAccess.getPropertyExpressionAccess().getPropertyAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PropertyExpression__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyExpression__Group_1_0__0__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyExpression__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyExpressionAccess().getGroup_1_0_0()); }
	(rule__PropertyExpression__Group_1_0_0__0)
	{ after(grammarAccess.getPropertyExpressionAccess().getGroup_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PropertyExpression__Group_1_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyExpression__Group_1_0_0__0__Impl
	rule__PropertyExpression__Group_1_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyExpression__Group_1_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyExpressionAccess().getPropertyExpressionModelElementAction_1_0_0_0()); }
	()
	{ after(grammarAccess.getPropertyExpressionAccess().getPropertyExpressionModelElementAction_1_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyExpression__Group_1_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyExpression__Group_1_0_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyExpression__Group_1_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyExpressionAccess().getNumberSignKeyword_1_0_0_1()); }
	'#'
	{ after(grammarAccess.getPropertyExpressionAccess().getNumberSignKeyword_1_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SelectExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SelectExpression__Group__0__Impl
	rule__SelectExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SelectExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSelectExpressionAccess().getPrimaryExpressionParserRuleCall_0()); }
	rulePrimaryExpression
	{ after(grammarAccess.getSelectExpressionAccess().getPrimaryExpressionParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SelectExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SelectExpression__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SelectExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSelectExpressionAccess().getGroup_1()); }
	(rule__SelectExpression__Group_1__0)*
	{ after(grammarAccess.getSelectExpressionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SelectExpression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SelectExpression__Group_1__0__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SelectExpression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSelectExpressionAccess().getGroup_1_0()); }
	(rule__SelectExpression__Group_1_0__0)
	{ after(grammarAccess.getSelectExpressionAccess().getGroup_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SelectExpression__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SelectExpression__Group_1_0__0__Impl
	rule__SelectExpression__Group_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SelectExpression__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSelectExpressionAccess().getSelectionReceiverAction_1_0_0()); }
	()
	{ after(grammarAccess.getSelectExpressionAccess().getSelectionReceiverAction_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SelectExpression__Group_1_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SelectExpression__Group_1_0__1__Impl
	rule__SelectExpression__Group_1_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SelectExpression__Group_1_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSelectExpressionAccess().getFullStopKeyword_1_0_1()); }
	'.'
	{ after(grammarAccess.getSelectExpressionAccess().getFullStopKeyword_1_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SelectExpression__Group_1_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SelectExpression__Group_1_0__2__Impl
	rule__SelectExpression__Group_1_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SelectExpression__Group_1_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSelectExpressionAccess().getRefAssignment_1_0_2()); }
	(rule__SelectExpression__RefAssignment_1_0_2)
	{ after(grammarAccess.getSelectExpressionAccess().getRefAssignment_1_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SelectExpression__Group_1_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SelectExpression__Group_1_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SelectExpression__Group_1_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSelectExpressionAccess().getGroup_1_0_3()); }
	(rule__SelectExpression__Group_1_0_3__0)?
	{ after(grammarAccess.getSelectExpressionAccess().getGroup_1_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SelectExpression__Group_1_0_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SelectExpression__Group_1_0_3__0__Impl
	rule__SelectExpression__Group_1_0_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SelectExpression__Group_1_0_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSelectExpressionAccess().getLeftParenthesisKeyword_1_0_3_0()); }
	'('
	{ after(grammarAccess.getSelectExpressionAccess().getLeftParenthesisKeyword_1_0_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SelectExpression__Group_1_0_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SelectExpression__Group_1_0_3__1__Impl
	rule__SelectExpression__Group_1_0_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SelectExpression__Group_1_0_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSelectExpressionAccess().getGroup_1_0_3_1()); }
	(rule__SelectExpression__Group_1_0_3_1__0)?
	{ after(grammarAccess.getSelectExpressionAccess().getGroup_1_0_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SelectExpression__Group_1_0_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SelectExpression__Group_1_0_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SelectExpression__Group_1_0_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSelectExpressionAccess().getRightParenthesisKeyword_1_0_3_2()); }
	')'
	{ after(grammarAccess.getSelectExpressionAccess().getRightParenthesisKeyword_1_0_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SelectExpression__Group_1_0_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SelectExpression__Group_1_0_3_1__0__Impl
	rule__SelectExpression__Group_1_0_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SelectExpression__Group_1_0_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSelectExpressionAccess().getArgsAssignment_1_0_3_1_0()); }
	(rule__SelectExpression__ArgsAssignment_1_0_3_1_0)
	{ after(grammarAccess.getSelectExpressionAccess().getArgsAssignment_1_0_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SelectExpression__Group_1_0_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SelectExpression__Group_1_0_3_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SelectExpression__Group_1_0_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSelectExpressionAccess().getGroup_1_0_3_1_1()); }
	(rule__SelectExpression__Group_1_0_3_1_1__0)*
	{ after(grammarAccess.getSelectExpressionAccess().getGroup_1_0_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SelectExpression__Group_1_0_3_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SelectExpression__Group_1_0_3_1_1__0__Impl
	rule__SelectExpression__Group_1_0_3_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SelectExpression__Group_1_0_3_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSelectExpressionAccess().getCommaKeyword_1_0_3_1_1_0()); }
	','
	{ after(grammarAccess.getSelectExpressionAccess().getCommaKeyword_1_0_3_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SelectExpression__Group_1_0_3_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SelectExpression__Group_1_0_3_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SelectExpression__Group_1_0_3_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSelectExpressionAccess().getArgsAssignment_1_0_3_1_1_1()); }
	(rule__SelectExpression__ArgsAssignment_1_0_3_1_1_1)
	{ after(grammarAccess.getSelectExpressionAccess().getArgsAssignment_1_0_3_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PrimaryExpression__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimaryExpression__Group_4__0__Impl
	rule__PrimaryExpression__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpression__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_0()); }
	'('
	{ after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpression__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimaryExpression__Group_4__1__Impl
	rule__PrimaryExpression__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpression__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_4_1()); }
	ruleExpression
	{ after(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpression__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimaryExpression__Group_4__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpression__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_4_2()); }
	')'
	{ after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NamedElementRef__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedElementRef__Group__0__Impl
	rule__NamedElementRef__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedElementRef__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedElementRefAccess().getCoreAssignment_0()); }
	(rule__NamedElementRef__CoreAssignment_0)?
	{ after(grammarAccess.getNamedElementRefAccess().getCoreAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedElementRef__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedElementRef__Group__1__Impl
	rule__NamedElementRef__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedElementRef__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedElementRefAccess().getRefAssignment_1()); }
	(rule__NamedElementRef__RefAssignment_1)
	{ after(grammarAccess.getNamedElementRefAccess().getRefAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedElementRef__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedElementRef__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedElementRef__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedElementRefAccess().getGroup_2()); }
	(rule__NamedElementRef__Group_2__0)?
	{ after(grammarAccess.getNamedElementRefAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NamedElementRef__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedElementRef__Group_2__0__Impl
	rule__NamedElementRef__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedElementRef__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedElementRefAccess().getLeftParenthesisKeyword_2_0()); }
	'('
	{ after(grammarAccess.getNamedElementRefAccess().getLeftParenthesisKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedElementRef__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedElementRef__Group_2__1__Impl
	rule__NamedElementRef__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedElementRef__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedElementRefAccess().getGroup_2_1()); }
	(rule__NamedElementRef__Group_2_1__0)?
	{ after(grammarAccess.getNamedElementRefAccess().getGroup_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedElementRef__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedElementRef__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedElementRef__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedElementRefAccess().getRightParenthesisKeyword_2_2()); }
	')'
	{ after(grammarAccess.getNamedElementRefAccess().getRightParenthesisKeyword_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NamedElementRef__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedElementRef__Group_2_1__0__Impl
	rule__NamedElementRef__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedElementRef__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedElementRefAccess().getArgsAssignment_2_1_0()); }
	(rule__NamedElementRef__ArgsAssignment_2_1_0)
	{ after(grammarAccess.getNamedElementRefAccess().getArgsAssignment_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedElementRef__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedElementRef__Group_2_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedElementRef__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedElementRefAccess().getGroup_2_1_1()); }
	(rule__NamedElementRef__Group_2_1_1__0)*
	{ after(grammarAccess.getNamedElementRefAccess().getGroup_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NamedElementRef__Group_2_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedElementRef__Group_2_1_1__0__Impl
	rule__NamedElementRef__Group_2_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedElementRef__Group_2_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedElementRefAccess().getCommaKeyword_2_1_1_0()); }
	','
	{ after(grammarAccess.getNamedElementRefAccess().getCommaKeyword_2_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedElementRef__Group_2_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamedElementRef__Group_2_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedElementRef__Group_2_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamedElementRefAccess().getArgsAssignment_2_1_1_1()); }
	(rule__NamedElementRef__ArgsAssignment_2_1_1_1)
	{ after(grammarAccess.getNamedElementRefAccess().getArgsAssignment_2_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RangeExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RangeExpression__Group__0__Impl
	rule__RangeExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RangeExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRangeExpressionAccess().getRangeAction_0()); }
	()
	{ after(grammarAccess.getRangeExpressionAccess().getRangeAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RangeExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RangeExpression__Group__1__Impl
	rule__RangeExpression__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RangeExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRangeExpressionAccess().getLeftSquareBracketKeyword_1()); }
	'['
	{ after(grammarAccess.getRangeExpressionAccess().getLeftSquareBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RangeExpression__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RangeExpression__Group__2__Impl
	rule__RangeExpression__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__RangeExpression__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRangeExpressionAccess().getMinimumAssignment_2()); }
	(rule__RangeExpression__MinimumAssignment_2)
	{ after(grammarAccess.getRangeExpressionAccess().getMinimumAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RangeExpression__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RangeExpression__Group__3__Impl
	rule__RangeExpression__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__RangeExpression__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRangeExpressionAccess().getFullStopFullStopKeyword_3()); }
	'..'
	{ after(grammarAccess.getRangeExpressionAccess().getFullStopFullStopKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RangeExpression__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RangeExpression__Group__4__Impl
	rule__RangeExpression__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__RangeExpression__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRangeExpressionAccess().getMaximumAssignment_4()); }
	(rule__RangeExpression__MaximumAssignment_4)
	{ after(grammarAccess.getRangeExpressionAccess().getMaximumAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RangeExpression__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RangeExpression__Group__5__Impl
	rule__RangeExpression__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__RangeExpression__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRangeExpressionAccess().getGroup_5()); }
	(rule__RangeExpression__Group_5__0)?
	{ after(grammarAccess.getRangeExpressionAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RangeExpression__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RangeExpression__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RangeExpression__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRangeExpressionAccess().getRightSquareBracketKeyword_6()); }
	']'
	{ after(grammarAccess.getRangeExpressionAccess().getRightSquareBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RangeExpression__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RangeExpression__Group_5__0__Impl
	rule__RangeExpression__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RangeExpression__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRangeExpressionAccess().getDeltaKeyword_5_0()); }
	('delta')
	{ after(grammarAccess.getRangeExpressionAccess().getDeltaKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RangeExpression__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RangeExpression__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RangeExpression__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRangeExpressionAccess().getDeltaAssignment_5_1()); }
	(rule__RangeExpression__DeltaAssignment_5_1)
	{ after(grammarAccess.getRangeExpressionAccess().getDeltaAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__IfExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IfExpression__Group__0__Impl
	rule__IfExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IfExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIfExpressionAccess().getConditionalAction_0()); }
	()
	{ after(grammarAccess.getIfExpressionAccess().getConditionalAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IfExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IfExpression__Group__1__Impl
	rule__IfExpression__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__IfExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIfExpressionAccess().getIfKeyword_1()); }
	'if'
	{ after(grammarAccess.getIfExpressionAccess().getIfKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IfExpression__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IfExpression__Group__2__Impl
	rule__IfExpression__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__IfExpression__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIfExpressionAccess().getIfAssignment_2()); }
	(rule__IfExpression__IfAssignment_2)
	{ after(grammarAccess.getIfExpressionAccess().getIfAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IfExpression__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IfExpression__Group__3__Impl
	rule__IfExpression__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__IfExpression__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIfExpressionAccess().getThenKeyword_3()); }
	'then'
	{ after(grammarAccess.getIfExpressionAccess().getThenKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IfExpression__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IfExpression__Group__4__Impl
	rule__IfExpression__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__IfExpression__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIfExpressionAccess().getThenAssignment_4()); }
	(rule__IfExpression__ThenAssignment_4)
	{ after(grammarAccess.getIfExpressionAccess().getThenAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IfExpression__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IfExpression__Group__5__Impl
	rule__IfExpression__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__IfExpression__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIfExpressionAccess().getGroup_5()); }
	(rule__IfExpression__Group_5__0)?
	{ after(grammarAccess.getIfExpressionAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IfExpression__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IfExpression__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IfExpression__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIfExpressionAccess().getEndifKeyword_6()); }
	'endif'
	{ after(grammarAccess.getIfExpressionAccess().getEndifKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__IfExpression__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IfExpression__Group_5__0__Impl
	rule__IfExpression__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IfExpression__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIfExpressionAccess().getElseKeyword_5_0()); }
	'else'
	{ after(grammarAccess.getIfExpressionAccess().getElseKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IfExpression__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IfExpression__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IfExpression__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIfExpressionAccess().getElseAssignment_5_1()); }
	(rule__IfExpression__ElseAssignment_5_1)
	{ after(grammarAccess.getIfExpressionAccess().getElseAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EBooleanLiteral__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EBooleanLiteral__Group__0__Impl
	rule__EBooleanLiteral__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EBooleanLiteral__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEBooleanLiteralAccess().getEBooleanLiteralAction_0()); }
	()
	{ after(grammarAccess.getEBooleanLiteralAccess().getEBooleanLiteralAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EBooleanLiteral__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EBooleanLiteral__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EBooleanLiteral__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEBooleanLiteralAccess().getAlternatives_1()); }
	(rule__EBooleanLiteral__Alternatives_1)
	{ after(grammarAccess.getEBooleanLiteralAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EIntegerLiteral__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EIntegerLiteral__Group__0__Impl
	rule__EIntegerLiteral__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EIntegerLiteral__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEIntegerLiteralAccess().getEIntegerLiteralAction_0()); }
	()
	{ after(grammarAccess.getEIntegerLiteralAccess().getEIntegerLiteralAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EIntegerLiteral__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EIntegerLiteral__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EIntegerLiteral__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEIntegerLiteralAccess().getValueAssignment_1()); }
	(rule__EIntegerLiteral__ValueAssignment_1)
	{ after(grammarAccess.getEIntegerLiteralAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ERealLiteral__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ERealLiteral__Group__0__Impl
	rule__ERealLiteral__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ERealLiteral__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getERealLiteralAccess().getERealLiteralAction_0()); }
	()
	{ after(grammarAccess.getERealLiteralAccess().getERealLiteralAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ERealLiteral__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ERealLiteral__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ERealLiteral__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getERealLiteralAccess().getValueAssignment_1()); }
	(rule__ERealLiteral__ValueAssignment_1)
	{ after(grammarAccess.getERealLiteralAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EStringLiteral__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EStringLiteral__Group__0__Impl
	rule__EStringLiteral__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EStringLiteral__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEStringLiteralAccess().getEStringLiteralAction_0()); }
	()
	{ after(grammarAccess.getEStringLiteralAccess().getEStringLiteralAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EStringLiteral__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EStringLiteral__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EStringLiteral__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEStringLiteralAccess().getValueAssignment_1()); }
	(rule__EStringLiteral__ValueAssignment_1)
	{ after(grammarAccess.getEStringLiteralAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExpressionList__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpressionList__Group__0__Impl
	rule__ExpressionList__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionList__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionListAccess().getLeftParenthesisKeyword_0()); }
	'('
	{ after(grammarAccess.getExpressionListAccess().getLeftParenthesisKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionList__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpressionList__Group__1__Impl
	rule__ExpressionList__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionList__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionListAccess().getGroup_1()); }
	(rule__ExpressionList__Group_1__0)?
	{ after(grammarAccess.getExpressionListAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionList__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpressionList__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionList__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionListAccess().getRightParenthesisKeyword_2()); }
	')'
	{ after(grammarAccess.getExpressionListAccess().getRightParenthesisKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExpressionList__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpressionList__Group_1__0__Impl
	rule__ExpressionList__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionList__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionListAccess().getElementsAssignment_1_0()); }
	(rule__ExpressionList__ElementsAssignment_1_0)
	{ after(grammarAccess.getExpressionListAccess().getElementsAssignment_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionList__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpressionList__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionList__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionListAccess().getGroup_1_1()); }
	(rule__ExpressionList__Group_1_1__0)*
	{ after(grammarAccess.getExpressionListAccess().getGroup_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExpressionList__Group_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpressionList__Group_1_1__0__Impl
	rule__ExpressionList__Group_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionList__Group_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionListAccess().getCommaKeyword_1_1_0()); }
	','
	{ after(grammarAccess.getExpressionListAccess().getCommaKeyword_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionList__Group_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpressionList__Group_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionList__Group_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionListAccess().getElementsAssignment_1_1_1()); }
	(rule__ExpressionList__ElementsAssignment_1_1_1)
	{ after(grammarAccess.getExpressionListAccess().getElementsAssignment_1_1_1()); }
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
	{ before(grammarAccess.getListLiteralAccess().getListKeyword_1()); }
	'list'
	{ after(grammarAccess.getListLiteralAccess().getListKeyword_1()); }
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
	{ before(grammarAccess.getListLiteralAccess().getExpressionListParserRuleCall_2()); }
	ruleExpressionList
	{ after(grammarAccess.getListLiteralAccess().getExpressionListParserRuleCall_2()); }
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
	{ before(grammarAccess.getSetLiteralAccess().getSetKeyword_1()); }
	'set'
	{ after(grammarAccess.getSetLiteralAccess().getSetKeyword_1()); }
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
	{ before(grammarAccess.getSetLiteralAccess().getExpressionListParserRuleCall_2()); }
	ruleExpressionList
	{ after(grammarAccess.getSetLiteralAccess().getExpressionListParserRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RecordLiteral__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RecordLiteral__Group__0__Impl
	rule__RecordLiteral__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordLiteral__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRecordLiteralAccess().getRecordLiteralAction_0()); }
	()
	{ after(grammarAccess.getRecordLiteralAccess().getRecordLiteralAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordLiteral__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RecordLiteral__Group__1__Impl
	rule__RecordLiteral__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordLiteral__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRecordLiteralAccess().getRecordKeyword_1()); }
	'record'
	{ after(grammarAccess.getRecordLiteralAccess().getRecordKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordLiteral__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RecordLiteral__Group__2__Impl
	rule__RecordLiteral__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordLiteral__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRecordLiteralAccess().getLeftParenthesisKeyword_2()); }
	'('
	{ after(grammarAccess.getRecordLiteralAccess().getLeftParenthesisKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordLiteral__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RecordLiteral__Group__3__Impl
	rule__RecordLiteral__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordLiteral__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRecordLiteralAccess().getGroup_3()); }
	(rule__RecordLiteral__Group_3__0)?
	{ after(grammarAccess.getRecordLiteralAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordLiteral__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RecordLiteral__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordLiteral__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRecordLiteralAccess().getRightParenthesisKeyword_4()); }
	')'
	{ after(grammarAccess.getRecordLiteralAccess().getRightParenthesisKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RecordLiteral__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RecordLiteral__Group_3__0__Impl
	rule__RecordLiteral__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordLiteral__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRecordLiteralAccess().getFieldValuesAssignment_3_0()); }
	(rule__RecordLiteral__FieldValuesAssignment_3_0)
	{ after(grammarAccess.getRecordLiteralAccess().getFieldValuesAssignment_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordLiteral__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RecordLiteral__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordLiteral__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRecordLiteralAccess().getGroup_3_1()); }
	(rule__RecordLiteral__Group_3_1__0)*
	{ after(grammarAccess.getRecordLiteralAccess().getGroup_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RecordLiteral__Group_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RecordLiteral__Group_3_1__0__Impl
	rule__RecordLiteral__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordLiteral__Group_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRecordLiteralAccess().getCommaKeyword_3_1_0()); }
	','
	{ after(grammarAccess.getRecordLiteralAccess().getCommaKeyword_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordLiteral__Group_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RecordLiteral__Group_3_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordLiteral__Group_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRecordLiteralAccess().getFieldValuesAssignment_3_1_1()); }
	(rule__RecordLiteral__FieldValuesAssignment_3_1_1)
	{ after(grammarAccess.getRecordLiteralAccess().getFieldValuesAssignment_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FieldValue__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FieldValue__Group__0__Impl
	rule__FieldValue__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldValue__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFieldValueAccess().getNameAssignment_0()); }
	(rule__FieldValue__NameAssignment_0)
	{ after(grammarAccess.getFieldValueAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldValue__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FieldValue__Group__1__Impl
	rule__FieldValue__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldValue__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFieldValueAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getFieldValueAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldValue__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FieldValue__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldValue__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFieldValueAccess().getValueAssignment_2()); }
	(rule__FieldValue__ValueAssignment_2)
	{ after(grammarAccess.getFieldValueAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__UnionLiteral__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnionLiteral__Group__0__Impl
	rule__UnionLiteral__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UnionLiteral__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnionLiteralAccess().getUnionLiteralAction_0()); }
	()
	{ after(grammarAccess.getUnionLiteralAccess().getUnionLiteralAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnionLiteral__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnionLiteral__Group__1__Impl
	rule__UnionLiteral__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__UnionLiteral__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnionLiteralAccess().getUnionKeyword_1()); }
	'union'
	{ after(grammarAccess.getUnionLiteralAccess().getUnionKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnionLiteral__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnionLiteral__Group__2__Impl
	rule__UnionLiteral__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__UnionLiteral__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnionLiteralAccess().getLeftParenthesisKeyword_2()); }
	'('
	{ after(grammarAccess.getUnionLiteralAccess().getLeftParenthesisKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnionLiteral__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnionLiteral__Group__3__Impl
	rule__UnionLiteral__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__UnionLiteral__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnionLiteralAccess().getFieldValueAssignment_3()); }
	(rule__UnionLiteral__FieldValueAssignment_3)
	{ after(grammarAccess.getUnionLiteralAccess().getFieldValueAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnionLiteral__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnionLiteral__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UnionLiteral__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnionLiteralAccess().getRightParenthesisKeyword_4()); }
	')'
	{ after(grammarAccess.getUnionLiteralAccess().getRightParenthesisKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TupleLiteral__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TupleLiteral__Group__0__Impl
	rule__TupleLiteral__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TupleLiteral__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTupleLiteralAccess().getTupleLiteralAction_0()); }
	()
	{ after(grammarAccess.getTupleLiteralAccess().getTupleLiteralAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TupleLiteral__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TupleLiteral__Group__1__Impl
	rule__TupleLiteral__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TupleLiteral__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTupleLiteralAccess().getTupleKeyword_1()); }
	'tuple'
	{ after(grammarAccess.getTupleLiteralAccess().getTupleKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TupleLiteral__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TupleLiteral__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TupleLiteral__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTupleLiteralAccess().getExpressionListParserRuleCall_2()); }
	ruleExpressionList
	{ after(grammarAccess.getTupleLiteralAccess().getExpressionListParserRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BagLiteral__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BagLiteral__Group__0__Impl
	rule__BagLiteral__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BagLiteral__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBagLiteralAccess().getBagLiteralAction_0()); }
	()
	{ after(grammarAccess.getBagLiteralAccess().getBagLiteralAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BagLiteral__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BagLiteral__Group__1__Impl
	rule__BagLiteral__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__BagLiteral__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBagLiteralAccess().getBagKeyword_1()); }
	'bag'
	{ after(grammarAccess.getBagLiteralAccess().getBagKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BagLiteral__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BagLiteral__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BagLiteral__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBagLiteralAccess().getExpressionListParserRuleCall_2()); }
	ruleExpressionList
	{ after(grammarAccess.getBagLiteralAccess().getExpressionListParserRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MapLiteral__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MapLiteral__Group__0__Impl
	rule__MapLiteral__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MapLiteral__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMapLiteralAccess().getMapLiteralAction_0()); }
	()
	{ after(grammarAccess.getMapLiteralAccess().getMapLiteralAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MapLiteral__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MapLiteral__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MapLiteral__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMapLiteralAccess().getMapKeyword_1()); }
	'map'
	{ after(grammarAccess.getMapLiteralAccess().getMapKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__UnitsType__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnitsType__Group__0__Impl
	rule__UnitsType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitsType__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitsTypeAccess().getUnitsTypeAction_0()); }
	()
	{ after(grammarAccess.getUnitsTypeAccess().getUnitsTypeAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitsType__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnitsType__Group__1__Impl
	rule__UnitsType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitsType__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitsTypeAccess().getUnitsKeyword_1()); }
	'units'
	{ after(grammarAccess.getUnitsTypeAccess().getUnitsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitsType__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnitsType__Group__2__Impl
	rule__UnitsType__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitsType__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitsTypeAccess().getLeftParenthesisKeyword_2()); }
	'('
	{ after(grammarAccess.getUnitsTypeAccess().getLeftParenthesisKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitsType__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnitsType__Group__3__Impl
	rule__UnitsType__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitsType__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitsTypeAccess().getOwnedLiteralAssignment_3()); }
	(rule__UnitsType__OwnedLiteralAssignment_3)
	{ after(grammarAccess.getUnitsTypeAccess().getOwnedLiteralAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitsType__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnitsType__Group__4__Impl
	rule__UnitsType__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitsType__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitsTypeAccess().getGroup_4()); }
	(rule__UnitsType__Group_4__0)*
	{ after(grammarAccess.getUnitsTypeAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitsType__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnitsType__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitsType__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitsTypeAccess().getRightParenthesisKeyword_5()); }
	')'
	{ after(grammarAccess.getUnitsTypeAccess().getRightParenthesisKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__UnitsType__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnitsType__Group_4__0__Impl
	rule__UnitsType__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitsType__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitsTypeAccess().getCommaKeyword_4_0()); }
	','
	{ after(grammarAccess.getUnitsTypeAccess().getCommaKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitsType__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnitsType__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitsType__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitsTypeAccess().getOwnedLiteralAssignment_4_1()); }
	(rule__UnitsType__OwnedLiteralAssignment_4_1)
	{ after(grammarAccess.getUnitsTypeAccess().getOwnedLiteralAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__UnitLiteralConversion__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnitLiteralConversion__Group__0__Impl
	rule__UnitLiteralConversion__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitLiteralConversion__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitLiteralConversionAccess().getNameAssignment_0()); }
	(rule__UnitLiteralConversion__NameAssignment_0)
	{ after(grammarAccess.getUnitLiteralConversionAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitLiteralConversion__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnitLiteralConversion__Group__1__Impl
	rule__UnitLiteralConversion__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitLiteralConversion__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitLiteralConversionAccess().getEqualsSignGreaterThanSignKeyword_1()); }
	'=>'
	{ after(grammarAccess.getUnitLiteralConversionAccess().getEqualsSignGreaterThanSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitLiteralConversion__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnitLiteralConversion__Group__2__Impl
	rule__UnitLiteralConversion__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitLiteralConversion__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitLiteralConversionAccess().getBaseUnitAssignment_2()); }
	(rule__UnitLiteralConversion__BaseUnitAssignment_2)
	{ after(grammarAccess.getUnitLiteralConversionAccess().getBaseUnitAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitLiteralConversion__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnitLiteralConversion__Group__3__Impl
	rule__UnitLiteralConversion__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitLiteralConversion__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitLiteralConversionAccess().getAsteriskKeyword_3()); }
	'*'
	{ after(grammarAccess.getUnitLiteralConversionAccess().getAsteriskKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitLiteralConversion__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnitLiteralConversion__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitLiteralConversion__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitLiteralConversionAccess().getFactorAssignment_4()); }
	(rule__UnitLiteralConversion__FactorAssignment_4)
	{ after(grammarAccess.getUnitLiteralConversionAccess().getFactorAssignment_4()); }
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


rule__QCREF__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QCREF__Group__0__Impl
	rule__QCREF__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QCREF__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQCREFAccess().getGroup_0()); }
	(rule__QCREF__Group_0__0)*
	{ after(grammarAccess.getQCREFAccess().getGroup_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QCREF__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QCREF__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QCREF__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQCREFAccess().getIDTerminalRuleCall_1()); }
	RULE_ID
	{ after(grammarAccess.getQCREFAccess().getIDTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QCREF__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QCREF__Group_0__0__Impl
	rule__QCREF__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QCREF__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQCREFAccess().getIDTerminalRuleCall_0_0()); }
	RULE_ID
	{ after(grammarAccess.getQCREFAccess().getIDTerminalRuleCall_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QCREF__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QCREF__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QCREF__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQCREFAccess().getColonColonKeyword_0_1()); }
	'::'
	{ after(grammarAccess.getQCREFAccess().getColonColonKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QPREF__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QPREF__Group__0__Impl
	rule__QPREF__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QPREF__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQPREFAccess().getGroup_0()); }
	(rule__QPREF__Group_0__0)*
	{ after(grammarAccess.getQPREFAccess().getGroup_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QPREF__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QPREF__Group__1__Impl
	rule__QPREF__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__QPREF__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQPREFAccess().getIDTerminalRuleCall_1()); }
	RULE_ID
	{ after(grammarAccess.getQPREFAccess().getIDTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QPREF__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QPREF__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QPREF__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQPREFAccess().getGroup_2()); }
	(rule__QPREF__Group_2__0)?
	{ after(grammarAccess.getQPREFAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QPREF__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QPREF__Group_0__0__Impl
	rule__QPREF__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QPREF__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQPREFAccess().getIDTerminalRuleCall_0_0()); }
	RULE_ID
	{ after(grammarAccess.getQPREFAccess().getIDTerminalRuleCall_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QPREF__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QPREF__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QPREF__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQPREFAccess().getColonColonKeyword_0_1()); }
	'::'
	{ after(grammarAccess.getQPREFAccess().getColonColonKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QPREF__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QPREF__Group_2__0__Impl
	rule__QPREF__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QPREF__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQPREFAccess().getColonKeyword_2_0()); }
	':'
	{ after(grammarAccess.getQPREFAccess().getColonKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QPREF__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QPREF__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QPREF__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQPREFAccess().getIDTerminalRuleCall_2_1()); }
	RULE_ID
	{ after(grammarAccess.getQPREFAccess().getIDTerminalRuleCall_2_1()); }
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
		{ before(grammarAccess.getImplementationElementAccess().getComponentsComponentParserRuleCall_2_0()); }
		ruleComponent
		{ after(grammarAccess.getImplementationElementAccess().getComponentsComponentParserRuleCall_2_0()); }
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

rule__Component__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__CategoryAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentAccess().getCategoryComponentCategoryParserRuleCall_2_0()); }
		ruleComponentCategory
		{ after(grammarAccess.getComponentAccess().getCategoryComponentCategoryParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__TypeReferencesAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentAccess().getTypeReferencesTypeReferenceParserRuleCall_3_0()); }
		ruleTypeReference
		{ after(grammarAccess.getComponentAccess().getTypeReferencesTypeReferenceParserRuleCall_3_0()); }
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
		{ before(grammarAccess.getNestedImplementationElementAccess().getComponentsComponentParserRuleCall_3_0()); }
		ruleComponent
		{ after(grammarAccess.getNestedImplementationElementAccess().getComponentsComponentParserRuleCall_3_0()); }
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
		{ before(grammarAccess.getWorkingsetAccess().getRootComponentsComponentParserRuleCall_5_0()); }
		ruleComponent
		{ after(grammarAccess.getWorkingsetAccess().getRootComponentsComponentParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Declarations__DeclsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDeclarationsAccess().getDeclsEDeclarationParserRuleCall_0_0()); }
		ruleEDeclaration
		{ after(grammarAccess.getDeclarationsAccess().getDeclsEDeclarationParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Declarations__DeclsAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDeclarationsAccess().getDeclsEDeclarationParserRuleCall_1_1_0()); }
		ruleEDeclaration
		{ after(grammarAccess.getDeclarationsAccess().getDeclsEDeclarationParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDecl__ConstAssignment_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVarDeclAccess().getConstValKeyword_0_0_0()); }
		(
			{ before(grammarAccess.getVarDeclAccess().getConstValKeyword_0_0_0()); }
			'val'
			{ after(grammarAccess.getVarDeclAccess().getConstValKeyword_0_0_0()); }
		)
		{ after(grammarAccess.getVarDeclAccess().getConstValKeyword_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDecl__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVarDeclAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getVarDeclAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDecl__DeclTypeAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVarDeclAccess().getDeclTypeTypeParserRuleCall_2_1_0()); }
		ruleType
		{ after(grammarAccess.getVarDeclAccess().getDeclTypeTypeParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDecl__ValueAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVarDeclAccess().getValueExpressionParserRuleCall_3_1_0()); }
		ruleExpression
		{ after(grammarAccess.getVarDeclAccess().getValueExpressionParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FunDecl__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunDeclAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getFunDeclAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FunDecl__ResultTypeAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunDeclAccess().getResultTypeTypeParserRuleCall_6_0()); }
		ruleType
		{ after(grammarAccess.getFunDeclAccess().getResultTypeTypeParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FunDecl__JavaAssignment_7_1_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunDeclAccess().getJavaJavaKeyword_7_1_0_0_0()); }
		(
			{ before(grammarAccess.getFunDeclAccess().getJavaJavaKeyword_7_1_0_0_0()); }
			'java'
			{ after(grammarAccess.getFunDeclAccess().getJavaJavaKeyword_7_1_0_0_0()); }
		)
		{ after(grammarAccess.getFunDeclAccess().getJavaJavaKeyword_7_1_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FunDecl__FqnAssignment_7_1_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunDeclAccess().getFqnJavaFQNParserRuleCall_7_1_0_2_0()); }
		ruleJavaFQN
		{ after(grammarAccess.getFunDeclAccess().getFqnJavaFQNParserRuleCall_7_1_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FunDecl__ExpAssignment_7_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunDeclAccess().getExpExpressionParserRuleCall_7_1_1_0()); }
		ruleExpression
		{ after(grammarAccess.getFunDeclAccess().getExpExpressionParserRuleCall_7_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Args__ArgsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getArgsAccess().getArgsArgumentParserRuleCall_0_0()); }
		ruleArgument
		{ after(grammarAccess.getArgsAccess().getArgsArgumentParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Args__ArgsAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getArgsAccess().getArgsArgumentParserRuleCall_1_1_0()); }
		ruleArgument
		{ after(grammarAccess.getArgsAccess().getArgsArgumentParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__TypeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getArgumentAccess().getTypeTypeParserRuleCall_3_0()); }
		ruleType
		{ after(grammarAccess.getArgumentAccess().getTypeTypeParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Assertion__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAssertionAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getAssertionAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Assertion__AssertAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAssertionAccess().getAssertExpressionParserRuleCall_3_0()); }
		ruleExpression
		{ after(grammarAccess.getAssertionAccess().getAssertExpressionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RangeType__TypeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRangeTypeAccess().getTypeTypeParserRuleCall_2_0()); }
		ruleType
		{ after(grammarAccess.getRangeTypeAccess().getTypeTypeParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Category__CategoryAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCategoryAccess().getCategoryComponentCategoryParserRuleCall_0()); }
		ruleComponentCategory
		{ after(grammarAccess.getCategoryAccess().getCategoryComponentCategoryParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MetaClass__ClassAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMetaClassAccess().getClassMetaClassEnumEnumRuleCall_0()); }
		ruleMetaClassEnum
		{ after(grammarAccess.getMetaClassAccess().getClassMetaClassEnumEnumRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordType__FieldsAssignment_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRecordTypeAccess().getFieldsFieldParserRuleCall_3_0_0()); }
		ruleField
		{ after(grammarAccess.getRecordTypeAccess().getFieldsFieldParserRuleCall_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordType__FieldsAssignment_3_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRecordTypeAccess().getFieldsFieldParserRuleCall_3_1_1_0()); }
		ruleField
		{ after(grammarAccess.getRecordTypeAccess().getFieldsFieldParserRuleCall_3_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__TypeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFieldAccess().getTypeTypeParserRuleCall_3_0()); }
		ruleType
		{ after(grammarAccess.getFieldAccess().getTypeTypeParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnionType__FieldsAssignment_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnionTypeAccess().getFieldsFieldParserRuleCall_3_0_0()); }
		ruleField
		{ after(grammarAccess.getUnionTypeAccess().getFieldsFieldParserRuleCall_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnionType__FieldsAssignment_3_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnionTypeAccess().getFieldsFieldParserRuleCall_3_1_1_0()); }
		ruleField
		{ after(grammarAccess.getUnionTypeAccess().getFieldsFieldParserRuleCall_3_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TupleType__FieldsAssignment_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTupleTypeAccess().getFieldsTupleFieldParserRuleCall_3_0_0()); }
		ruleTupleField
		{ after(grammarAccess.getTupleTypeAccess().getFieldsTupleFieldParserRuleCall_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TupleType__FieldsAssignment_3_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTupleTypeAccess().getFieldsTupleFieldParserRuleCall_3_1_1_0()); }
		ruleTupleField
		{ after(grammarAccess.getTupleTypeAccess().getFieldsTupleFieldParserRuleCall_3_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TupleField__TypeAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTupleFieldAccess().getTypeTypeParserRuleCall_0()); }
		ruleType
		{ after(grammarAccess.getTupleFieldAccess().getTypeTypeParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ListType__TypeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getListTypeAccess().getTypeTypeParserRuleCall_2_0()); }
		ruleType
		{ after(grammarAccess.getListTypeAccess().getTypeTypeParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SetType__TypeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSetTypeAccess().getTypeTypeParserRuleCall_2_0()); }
		ruleType
		{ after(grammarAccess.getSetTypeAccess().getTypeTypeParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BagType__TypeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBagTypeAccess().getTypeTypeParserRuleCall_2_0()); }
		ruleType
		{ after(grammarAccess.getBagTypeAccess().getTypeTypeParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MapType__DomainAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMapTypeAccess().getDomainTypeParserRuleCall_1_0()); }
		ruleType
		{ after(grammarAccess.getMapTypeAccess().getDomainTypeParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MapType__ImageAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMapTypeAccess().getImageTypeParserRuleCall_3_0()); }
		ruleType
		{ after(grammarAccess.getMapTypeAccess().getImageTypeParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumType__LiteralsAssignment_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumTypeAccess().getLiteralsEnumLiteralParserRuleCall_3_0_0()); }
		ruleEnumLiteral
		{ after(grammarAccess.getEnumTypeAccess().getLiteralsEnumLiteralParserRuleCall_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumType__LiteralsAssignment_3_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumTypeAccess().getLiteralsEnumLiteralParserRuleCall_3_1_1_0()); }
		ruleEnumLiteral
		{ after(grammarAccess.getEnumTypeAccess().getLiteralsEnumLiteralParserRuleCall_3_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumLiteral__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumLiteralAccess().getNameIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getEnumLiteralAccess().getNameIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeRef__RefAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeRefAccess().getRefNamedElementCrossReference_0()); }
		(
			{ before(grammarAccess.getTypeRefAccess().getRefNamedElementQCREFParserRuleCall_0_1()); }
			ruleQCREF
			{ after(grammarAccess.getTypeRefAccess().getRefNamedElementQCREFParserRuleCall_0_1()); }
		)
		{ after(grammarAccess.getTypeRefAccess().getRefNamedElementCrossReference_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BlockExpression__DeclsAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBlockExpressionAccess().getDeclsVarDeclParserRuleCall_2_0_0()); }
		ruleVarDecl
		{ after(grammarAccess.getBlockExpressionAccess().getDeclsVarDeclParserRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BlockExpression__ResultAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBlockExpressionAccess().getResultExpressionParserRuleCall_3_0()); }
		ruleExpression
		{ after(grammarAccess.getBlockExpressionAccess().getResultExpressionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__OperatorAssignment_1_0_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOrExpressionAccess().getOperatorOpOrParserRuleCall_1_0_0_1_0()); }
		ruleOpOr
		{ after(grammarAccess.getOrExpressionAccess().getOperatorOpOrParserRuleCall_1_0_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__RightAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_1_0()); }
		ruleAndExpression
		{ after(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__OperatorAssignment_1_0_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAndExpressionAccess().getOperatorOpAndParserRuleCall_1_0_0_1_0()); }
		ruleOpAnd
		{ after(grammarAccess.getAndExpressionAccess().getOperatorOpAndParserRuleCall_1_0_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__RightAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAndExpressionAccess().getRightEqualityExpressionParserRuleCall_1_1_0()); }
		ruleEqualityExpression
		{ after(grammarAccess.getAndExpressionAccess().getRightEqualityExpressionParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EqualityExpression__OperatorAssignment_1_0_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEqualityExpressionAccess().getOperatorOpEqualityParserRuleCall_1_0_0_1_0()); }
		ruleOpEquality
		{ after(grammarAccess.getEqualityExpressionAccess().getOperatorOpEqualityParserRuleCall_1_0_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EqualityExpression__RightAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEqualityExpressionAccess().getRightRelationalExpressionParserRuleCall_1_1_0()); }
		ruleRelationalExpression
		{ after(grammarAccess.getEqualityExpressionAccess().getRightRelationalExpressionParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationalExpression__OperatorAssignment_1_0_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRelationalExpressionAccess().getOperatorOpCompareParserRuleCall_1_0_0_1_0()); }
		ruleOpCompare
		{ after(grammarAccess.getRelationalExpressionAccess().getOperatorOpCompareParserRuleCall_1_0_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationalExpression__RightAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRelationalExpressionAccess().getRightAdditiveExpressionParserRuleCall_1_1_0()); }
		ruleAdditiveExpression
		{ after(grammarAccess.getRelationalExpressionAccess().getRightAdditiveExpressionParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AdditiveExpression__OperatorAssignment_1_0_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAdditiveExpressionAccess().getOperatorOpAddParserRuleCall_1_0_0_1_0()); }
		ruleOpAdd
		{ after(grammarAccess.getAdditiveExpressionAccess().getOperatorOpAddParserRuleCall_1_0_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AdditiveExpression__RightAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_1_0()); }
		ruleMultiplicativeExpression
		{ after(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplicativeExpression__OperatorAssignment_1_0_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMultiplicativeExpressionAccess().getOperatorOpMultiParserRuleCall_1_0_0_1_0()); }
		ruleOpMulti
		{ after(grammarAccess.getMultiplicativeExpressionAccess().getOperatorOpMultiParserRuleCall_1_0_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplicativeExpression__RightAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMultiplicativeExpressionAccess().getRightUnaryOperationParserRuleCall_1_1_0()); }
		ruleUnaryOperation
		{ after(grammarAccess.getMultiplicativeExpressionAccess().getRightUnaryOperationParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnaryOperation__OperatorAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnaryOperationAccess().getOperatorOpUnaryParserRuleCall_0_1_0()); }
		ruleOpUnary
		{ after(grammarAccess.getUnaryOperationAccess().getOperatorOpUnaryParserRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnaryOperation__OperandAssignment_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnaryOperationAccess().getOperandUnitExpressionParserRuleCall_0_2_0()); }
		ruleUnitExpression
		{ after(grammarAccess.getUnaryOperationAccess().getOperandUnitExpressionParserRuleCall_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitExpression__ConvertAssignment_1_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnitExpressionAccess().getConvertPercentSignKeyword_1_1_0_0()); }
		(
			{ before(grammarAccess.getUnitExpressionAccess().getConvertPercentSignKeyword_1_1_0_0()); }
			'%'
			{ after(grammarAccess.getUnitExpressionAccess().getConvertPercentSignKeyword_1_1_0_0()); }
		)
		{ after(grammarAccess.getUnitExpressionAccess().getConvertPercentSignKeyword_1_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitExpression__DropAssignment_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnitExpressionAccess().getDropInKeyword_1_1_1_0()); }
		(
			{ before(grammarAccess.getUnitExpressionAccess().getDropInKeyword_1_1_1_0()); }
			'in'
			{ after(grammarAccess.getUnitExpressionAccess().getDropInKeyword_1_1_1_0()); }
		)
		{ after(grammarAccess.getUnitExpressionAccess().getDropInKeyword_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitExpression__UnitAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnitExpressionAccess().getUnitUnitLiteralCrossReference_1_2_0()); }
		(
			{ before(grammarAccess.getUnitExpressionAccess().getUnitUnitLiteralIDTerminalRuleCall_1_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getUnitExpressionAccess().getUnitUnitLiteralIDTerminalRuleCall_1_2_0_1()); }
		)
		{ after(grammarAccess.getUnitExpressionAccess().getUnitUnitLiteralCrossReference_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyExpression__PropertyAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyExpressionAccess().getPropertyPropertyDefinitionCrossReference_1_1_0()); }
		(
			{ before(grammarAccess.getPropertyExpressionAccess().getPropertyPropertyDefinitionQPREFParserRuleCall_1_1_0_1()); }
			ruleQPREF
			{ after(grammarAccess.getPropertyExpressionAccess().getPropertyPropertyDefinitionQPREFParserRuleCall_1_1_0_1()); }
		)
		{ after(grammarAccess.getPropertyExpressionAccess().getPropertyPropertyDefinitionCrossReference_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SelectExpression__RefAssignment_1_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSelectExpressionAccess().getRefNamedElementCrossReference_1_0_2_0()); }
		(
			{ before(grammarAccess.getSelectExpressionAccess().getRefNamedElementQCREFParserRuleCall_1_0_2_0_1()); }
			ruleQCREF
			{ after(grammarAccess.getSelectExpressionAccess().getRefNamedElementQCREFParserRuleCall_1_0_2_0_1()); }
		)
		{ after(grammarAccess.getSelectExpressionAccess().getRefNamedElementCrossReference_1_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SelectExpression__ArgsAssignment_1_0_3_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSelectExpressionAccess().getArgsExpressionParserRuleCall_1_0_3_1_0_0()); }
		ruleExpression
		{ after(grammarAccess.getSelectExpressionAccess().getArgsExpressionParserRuleCall_1_0_3_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SelectExpression__ArgsAssignment_1_0_3_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSelectExpressionAccess().getArgsExpressionParserRuleCall_1_0_3_1_1_1_0()); }
		ruleExpression
		{ after(grammarAccess.getSelectExpressionAccess().getArgsExpressionParserRuleCall_1_0_3_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedElementRef__CoreAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedElementRefAccess().getCoreCircumflexAccentKeyword_0_0()); }
		(
			{ before(grammarAccess.getNamedElementRefAccess().getCoreCircumflexAccentKeyword_0_0()); }
			'^'
			{ after(grammarAccess.getNamedElementRefAccess().getCoreCircumflexAccentKeyword_0_0()); }
		)
		{ after(grammarAccess.getNamedElementRefAccess().getCoreCircumflexAccentKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedElementRef__RefAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedElementRefAccess().getRefNamedElementCrossReference_1_0()); }
		(
			{ before(grammarAccess.getNamedElementRefAccess().getRefNamedElementQCREFParserRuleCall_1_0_1()); }
			ruleQCREF
			{ after(grammarAccess.getNamedElementRefAccess().getRefNamedElementQCREFParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getNamedElementRefAccess().getRefNamedElementCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedElementRef__ArgsAssignment_2_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedElementRefAccess().getArgsExpressionParserRuleCall_2_1_0_0()); }
		ruleExpression
		{ after(grammarAccess.getNamedElementRefAccess().getArgsExpressionParserRuleCall_2_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedElementRef__ArgsAssignment_2_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedElementRefAccess().getArgsExpressionParserRuleCall_2_1_1_1_0()); }
		ruleExpression
		{ after(grammarAccess.getNamedElementRefAccess().getArgsExpressionParserRuleCall_2_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RangeExpression__MinimumAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRangeExpressionAccess().getMinimumExpressionParserRuleCall_2_0()); }
		ruleExpression
		{ after(grammarAccess.getRangeExpressionAccess().getMinimumExpressionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RangeExpression__MaximumAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRangeExpressionAccess().getMaximumExpressionParserRuleCall_4_0()); }
		ruleExpression
		{ after(grammarAccess.getRangeExpressionAccess().getMaximumExpressionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RangeExpression__DeltaAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRangeExpressionAccess().getDeltaExpressionParserRuleCall_5_1_0()); }
		ruleExpression
		{ after(grammarAccess.getRangeExpressionAccess().getDeltaExpressionParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IfExpression__IfAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIfExpressionAccess().getIfExpressionParserRuleCall_2_0()); }
		ruleExpression
		{ after(grammarAccess.getIfExpressionAccess().getIfExpressionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IfExpression__ThenAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIfExpressionAccess().getThenExpressionParserRuleCall_4_0()); }
		ruleExpression
		{ after(grammarAccess.getIfExpressionAccess().getThenExpressionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IfExpression__ElseAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIfExpressionAccess().getElseExpressionParserRuleCall_5_1_0()); }
		ruleExpression
		{ after(grammarAccess.getIfExpressionAccess().getElseExpressionParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EBooleanLiteral__ValueAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEBooleanLiteralAccess().getValueTrueKeyword_1_0_0()); }
		(
			{ before(grammarAccess.getEBooleanLiteralAccess().getValueTrueKeyword_1_0_0()); }
			'true'
			{ after(grammarAccess.getEBooleanLiteralAccess().getValueTrueKeyword_1_0_0()); }
		)
		{ after(grammarAccess.getEBooleanLiteralAccess().getValueTrueKeyword_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EIntegerLiteral__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEIntegerLiteralAccess().getValueINTEGER_LITTerminalRuleCall_1_0()); }
		RULE_INTEGER_LIT
		{ after(grammarAccess.getEIntegerLiteralAccess().getValueINTEGER_LITTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ERealLiteral__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getERealLiteralAccess().getValueREAL_LITTerminalRuleCall_1_0()); }
		RULE_REAL_LIT
		{ after(grammarAccess.getERealLiteralAccess().getValueREAL_LITTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EStringLiteral__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEStringLiteralAccess().getValueNoQuoteStringParserRuleCall_1_0()); }
		ruleNoQuoteString
		{ after(grammarAccess.getEStringLiteralAccess().getValueNoQuoteStringParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionList__ElementsAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionListAccess().getElementsExpressionParserRuleCall_1_0_0()); }
		ruleExpression
		{ after(grammarAccess.getExpressionListAccess().getElementsExpressionParserRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionList__ElementsAssignment_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionListAccess().getElementsExpressionParserRuleCall_1_1_1_0()); }
		ruleExpression
		{ after(grammarAccess.getExpressionListAccess().getElementsExpressionParserRuleCall_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordLiteral__FieldValuesAssignment_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRecordLiteralAccess().getFieldValuesFieldValueParserRuleCall_3_0_0()); }
		ruleFieldValue
		{ after(grammarAccess.getRecordLiteralAccess().getFieldValuesFieldValueParserRuleCall_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordLiteral__FieldValuesAssignment_3_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRecordLiteralAccess().getFieldValuesFieldValueParserRuleCall_3_1_1_0()); }
		ruleFieldValue
		{ after(grammarAccess.getRecordLiteralAccess().getFieldValuesFieldValueParserRuleCall_3_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldValue__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFieldValueAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getFieldValueAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldValue__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFieldValueAccess().getValueExpressionParserRuleCall_2_0()); }
		ruleExpression
		{ after(grammarAccess.getFieldValueAccess().getValueExpressionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnionLiteral__FieldValueAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnionLiteralAccess().getFieldValueFieldValueParserRuleCall_3_0()); }
		ruleFieldValue
		{ after(grammarAccess.getUnionLiteralAccess().getFieldValueFieldValueParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitsType__OwnedLiteralAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnitsTypeAccess().getOwnedLiteralUnitLiteralParserRuleCall_3_0()); }
		ruleUnitLiteral
		{ after(grammarAccess.getUnitsTypeAccess().getOwnedLiteralUnitLiteralParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitsType__OwnedLiteralAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnitsTypeAccess().getOwnedLiteralUnitLiteralConversionParserRuleCall_4_1_0()); }
		ruleUnitLiteralConversion
		{ after(grammarAccess.getUnitsTypeAccess().getOwnedLiteralUnitLiteralConversionParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitLiteral__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnitLiteralAccess().getNameIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getUnitLiteralAccess().getNameIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitLiteralConversion__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnitLiteralConversionAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getUnitLiteralConversionAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitLiteralConversion__BaseUnitAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnitLiteralConversionAccess().getBaseUnitUnitLiteralCrossReference_2_0()); }
		(
			{ before(grammarAccess.getUnitLiteralConversionAccess().getBaseUnitUnitLiteralIDTerminalRuleCall_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getUnitLiteralConversionAccess().getBaseUnitUnitLiteralIDTerminalRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getUnitLiteralConversionAccess().getBaseUnitUnitLiteralCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitLiteralConversion__FactorAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnitLiteralConversionAccess().getFactorINTEGER_LITTerminalRuleCall_4_0()); }
		RULE_INTEGER_LIT
		{ after(grammarAccess.getUnitLiteralConversionAccess().getFactorINTEGER_LITTerminalRuleCall_4_0()); }
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
			{ before(grammarAccess.getPropertyAssociationAccess().getPropertyPropertyDefinitionQCREFParserRuleCall_2_0_1()); }
			ruleQCREF
			{ after(grammarAccess.getPropertyAssociationAccess().getPropertyPropertyDefinitionQCREFParserRuleCall_2_0_1()); }
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
		{ before(grammarAccess.getPropertyAssociationAccess().getValueExpressionParserRuleCall_4_0()); }
		ruleExpression
		{ after(grammarAccess.getPropertyAssociationAccess().getValueExpressionParserRuleCall_4_0()); }
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

fragment RULE_EXPONENT : ('e'|'E') ('+'|'-')? RULE_INT;

fragment RULE_INT_EXPONENT : ('e'|'E') '+'? RULE_INT;

RULE_REAL_LIT : RULE_INT '.' RULE_INT RULE_EXPONENT?;

RULE_INTEGER_LIT : RULE_INT RULE_INT_EXPONENT?;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

fragment RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
