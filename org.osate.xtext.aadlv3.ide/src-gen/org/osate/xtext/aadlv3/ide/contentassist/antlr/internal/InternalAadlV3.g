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

// Entry rule entryRuleProperty
entryRuleProperty
:
{ before(grammarAccess.getPropertyRule()); }
	 ruleProperty
{ after(grammarAccess.getPropertyRule()); } 
	 EOF 
;

// Rule Property
ruleProperty 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPropertyAccess().getGroup()); }
		(rule__Property__Group__0)
		{ after(grammarAccess.getPropertyAccess().getGroup()); }
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
		{ before(grammarAccess.getPrimitiveTypeAccess().getGroup()); }
		(rule__PrimitiveType__Group__0)
		{ after(grammarAccess.getPrimitiveTypeAccess().getGroup()); }
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


// Rule SectionsInterfaceBody
ruleSectionsInterfaceBody 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSectionsInterfaceBodyAccess().getGroup()); }
		(rule__SectionsInterfaceBody__Group__0)
		{ after(grammarAccess.getSectionsInterfaceBodyAccess().getGroup()); }
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


// Rule SectionsImplementationBody
ruleSectionsImplementationBody 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSectionsImplementationBodyAccess().getGroup()); }
		(rule__SectionsImplementationBody__Group__0)
		{ after(grammarAccess.getSectionsImplementationBodyAccess().getGroup()); }
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

// Entry rule entryRuleFeatureMapping
entryRuleFeatureMapping
:
{ before(grammarAccess.getFeatureMappingRule()); }
	 ruleFeatureMapping
{ after(grammarAccess.getFeatureMappingRule()); } 
	 EOF 
;

// Rule FeatureMapping
ruleFeatureMapping 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFeatureMappingAccess().getGroup()); }
		(rule__FeatureMapping__Group__0)
		{ after(grammarAccess.getFeatureMappingAccess().getGroup()); }
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

// Entry rule entryRuleConfigurationAssignment
entryRuleConfigurationAssignment
:
{ before(grammarAccess.getConfigurationAssignmentRule()); }
	 ruleConfigurationAssignment
{ after(grammarAccess.getConfigurationAssignmentRule()); } 
	 EOF 
;

// Rule ConfigurationAssignment
ruleConfigurationAssignment 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConfigurationAssignmentAccess().getGroup()); }
		(rule__ConfigurationAssignment__Group__0)
		{ after(grammarAccess.getConfigurationAssignmentAccess().getGroup()); }
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

// Entry rule entryRulePropertyValue
entryRulePropertyValue
:
{ before(grammarAccess.getPropertyValueRule()); }
	 rulePropertyValue
{ after(grammarAccess.getPropertyValueRule()); } 
	 EOF 
;

// Rule PropertyValue
rulePropertyValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPropertyValueAccess().getValueAssignment()); }
		(rule__PropertyValue__ValueAssignment)
		{ after(grammarAccess.getPropertyValueAccess().getValueAssignment()); }
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


// Rule PropertyElement
rulePropertyElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPropertyElementAccess().getPropertyAssociationsAssignment()); }
		(rule__PropertyElement__PropertyAssociationsAssignment)
		{ after(grammarAccess.getPropertyElementAccess().getPropertyAssociationsAssignment()); }
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
		{ before(grammarAccess.getConfigurationElementAccess().getAssignmentsAssignment()); }
		(rule__ConfigurationElement__AssignmentsAssignment)
		{ after(grammarAccess.getConfigurationElementAccess().getAssignmentsAssignment()); }
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


// Rule ClassifierExtensions
ruleClassifierExtensions 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getClassifierExtensionsAccess().getGroup()); }
		(rule__ClassifierExtensions__Group__0)
		{ after(grammarAccess.getClassifierExtensionsAccess().getGroup()); }
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

// Entry rule entryRuleSEMICOLON
entryRuleSEMICOLON
:
{ before(grammarAccess.getSEMICOLONRule()); }
	 ruleSEMICOLON
{ after(grammarAccess.getSEMICOLONRule()); } 
	 EOF 
;

// Rule SEMICOLON
ruleSEMICOLON 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSEMICOLONAccess().getSemicolonKeyword()); }
		';'
		{ after(grammarAccess.getSEMICOLONAccess().getSemicolonKeyword()); }
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

// Entry rule entryRuleConnectionType
entryRuleConnectionType
:
{ before(grammarAccess.getConnectionTypeRule()); }
	 ruleConnectionType
{ after(grammarAccess.getConnectionTypeRule()); } 
	 EOF 
;

// Rule ConnectionType
ruleConnectionType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConnectionTypeAccess().getAlternatives()); }
		(rule__ConnectionType__Alternatives)
		{ after(grammarAccess.getConnectionTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMappingType
entryRuleMappingType
:
{ before(grammarAccess.getMappingTypeRule()); }
	 ruleMappingType
{ after(grammarAccess.getMappingTypeRule()); } 
	 EOF 
;

// Rule MappingType
ruleMappingType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMappingTypeAccess().getMappingKeyword()); }
		'mapping'
		{ after(grammarAccess.getMappingTypeAccess().getMappingKeyword()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFlowPathType
entryRuleFlowPathType
:
{ before(grammarAccess.getFlowPathTypeRule()); }
	 ruleFlowPathType
{ after(grammarAccess.getFlowPathTypeRule()); } 
	 EOF 
;

// Rule FlowPathType
ruleFlowPathType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFlowPathTypeAccess().getFlowPathKeywordsParserRuleCall()); }
		ruleFlowPathKeywords
		{ after(grammarAccess.getFlowPathTypeAccess().getFlowPathKeywordsParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFlowSourceType
entryRuleFlowSourceType
:
{ before(grammarAccess.getFlowSourceTypeRule()); }
	 ruleFlowSourceType
{ after(grammarAccess.getFlowSourceTypeRule()); } 
	 EOF 
;

// Rule FlowSourceType
ruleFlowSourceType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFlowSourceTypeAccess().getFlowSourceKeywordsParserRuleCall()); }
		ruleFlowSourceKeywords
		{ after(grammarAccess.getFlowSourceTypeAccess().getFlowSourceKeywordsParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFlowSinkType
entryRuleFlowSinkType
:
{ before(grammarAccess.getFlowSinkTypeRule()); }
	 ruleFlowSinkType
{ after(grammarAccess.getFlowSinkTypeRule()); } 
	 EOF 
;

// Rule FlowSinkType
ruleFlowSinkType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFlowSinkTypeAccess().getFlowSinkKeywordsParserRuleCall()); }
		ruleFlowSinkKeywords
		{ after(grammarAccess.getFlowSinkTypeAccess().getFlowSinkKeywordsParserRuleCall()); }
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

// Entry rule entryRuleEndToEndFlowKeywords
entryRuleEndToEndFlowKeywords
:
{ before(grammarAccess.getEndToEndFlowKeywordsRule()); }
	 ruleEndToEndFlowKeywords
{ after(grammarAccess.getEndToEndFlowKeywordsRule()); } 
	 EOF 
;

// Rule EndToEndFlowKeywords
ruleEndToEndFlowKeywords 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEndToEndFlowKeywordsAccess().getGroup()); }
		(rule__EndToEndFlowKeywords__Group__0)
		{ after(grammarAccess.getEndToEndFlowKeywordsAccess().getGroup()); }
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

// Entry rule entryRuleFlowPathKeywords
entryRuleFlowPathKeywords
:
{ before(grammarAccess.getFlowPathKeywordsRule()); }
	 ruleFlowPathKeywords
{ after(grammarAccess.getFlowPathKeywordsRule()); } 
	 EOF 
;

// Rule FlowPathKeywords
ruleFlowPathKeywords 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFlowPathKeywordsAccess().getGroup()); }
		(rule__FlowPathKeywords__Group__0)
		{ after(grammarAccess.getFlowPathKeywordsAccess().getGroup()); }
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

rule__PackageDeclaration__ElementsAlternatives_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPackageDeclarationAccess().getElementsPackageDeclarationParserRuleCall_3_0_0()); }
		rulePackageDeclaration
		{ after(grammarAccess.getPackageDeclarationAccess().getElementsPackageDeclarationParserRuleCall_3_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getPackageDeclarationAccess().getElementsPrimitiveTypeParserRuleCall_3_0_1()); }
		rulePrimitiveType
		{ after(grammarAccess.getPackageDeclarationAccess().getElementsPrimitiveTypeParserRuleCall_3_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getPackageDeclarationAccess().getElementsComponentInterfaceParserRuleCall_3_0_2()); }
		ruleComponentInterface
		{ after(grammarAccess.getPackageDeclarationAccess().getElementsComponentInterfaceParserRuleCall_3_0_2()); }
	)
	|
	(
		{ before(grammarAccess.getPackageDeclarationAccess().getElementsComponentImplementationParserRuleCall_3_0_3()); }
		ruleComponentImplementation
		{ after(grammarAccess.getPackageDeclarationAccess().getElementsComponentImplementationParserRuleCall_3_0_3()); }
	)
	|
	(
		{ before(grammarAccess.getPackageDeclarationAccess().getElementsComponentConfigurationParserRuleCall_3_0_4()); }
		ruleComponentConfiguration
		{ after(grammarAccess.getPackageDeclarationAccess().getElementsComponentConfigurationParserRuleCall_3_0_4()); }
	)
	|
	(
		{ before(grammarAccess.getPackageDeclarationAccess().getElementsPropertyParserRuleCall_3_0_5()); }
		ruleProperty
		{ after(grammarAccess.getPackageDeclarationAccess().getElementsPropertyParserRuleCall_3_0_5()); }
	)
	|
	(
		{ before(grammarAccess.getPackageDeclarationAccess().getElementsPropertySetParserRuleCall_3_0_6()); }
		rulePropertySet
		{ after(grammarAccess.getPackageDeclarationAccess().getElementsPropertySetParserRuleCall_3_0_6()); }
	)
	|
	(
		{ before(grammarAccess.getPackageDeclarationAccess().getElementsWorkingsetParserRuleCall_3_0_7()); }
		ruleWorkingset
		{ after(grammarAccess.getPackageDeclarationAccess().getElementsWorkingsetParserRuleCall_3_0_7()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__Alternatives_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentInterfaceAccess().getSectionsInterfaceBodyParserRuleCall_5_0()); }
		ruleSectionsInterfaceBody
		{ after(grammarAccess.getComponentInterfaceAccess().getSectionsInterfaceBodyParserRuleCall_5_0()); }
	)
	|
	(
		{ before(grammarAccess.getComponentInterfaceAccess().getInterfaceBodyParserRuleCall_5_1()); }
		ruleInterfaceBody
		{ after(grammarAccess.getComponentInterfaceAccess().getInterfaceBodyParserRuleCall_5_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsInterfaceBody__Alternatives_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSectionsInterfaceBodyAccess().getFlowsAssignment_1_1_0()); }
		(rule__SectionsInterfaceBody__FlowsAssignment_1_1_0)
		{ after(grammarAccess.getSectionsInterfaceBodyAccess().getFlowsAssignment_1_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getSectionsInterfaceBodyAccess().getFlowsAssignment_1_1_1()); }
		(rule__SectionsInterfaceBody__FlowsAssignment_1_1_1)
		{ after(grammarAccess.getSectionsInterfaceBodyAccess().getFlowsAssignment_1_1_1()); }
	)
	|
	(
		{ before(grammarAccess.getSectionsInterfaceBodyAccess().getFlowsAssignment_1_1_2()); }
		(rule__SectionsInterfaceBody__FlowsAssignment_1_1_2)
		{ after(grammarAccess.getSectionsInterfaceBodyAccess().getFlowsAssignment_1_1_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InterfaceBody__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInterfaceBodyAccess().getFeaturesAssignment_1_0()); }
		(rule__InterfaceBody__FeaturesAssignment_1_0)
		{ after(grammarAccess.getInterfaceBodyAccess().getFeaturesAssignment_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getInterfaceBodyAccess().getFlowsAssignment_1_1()); }
		(rule__InterfaceBody__FlowsAssignment_1_1)
		{ after(grammarAccess.getInterfaceBodyAccess().getFlowsAssignment_1_1()); }
	)
	|
	(
		{ before(grammarAccess.getInterfaceBodyAccess().getFlowsAssignment_1_2()); }
		(rule__InterfaceBody__FlowsAssignment_1_2)
		{ after(grammarAccess.getInterfaceBodyAccess().getFlowsAssignment_1_2()); }
	)
	|
	(
		{ before(grammarAccess.getInterfaceBodyAccess().getFlowsAssignment_1_3()); }
		(rule__InterfaceBody__FlowsAssignment_1_3)
		{ after(grammarAccess.getInterfaceBodyAccess().getFlowsAssignment_1_3()); }
	)
	|
	(
		{ before(grammarAccess.getInterfaceBodyAccess().getPropertyElementParserRuleCall_1_4()); }
		rulePropertyElement
		{ after(grammarAccess.getInterfaceBodyAccess().getPropertyElementParserRuleCall_1_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentImplementation__Alternatives_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentImplementationAccess().getSectionsImplementationBodyParserRuleCall_5_0()); }
		ruleSectionsImplementationBody
		{ after(grammarAccess.getComponentImplementationAccess().getSectionsImplementationBodyParserRuleCall_5_0()); }
	)
	|
	(
		{ before(grammarAccess.getComponentImplementationAccess().getImplementationBodyParserRuleCall_5_1()); }
		ruleImplementationBody
		{ after(grammarAccess.getComponentImplementationAccess().getImplementationBodyParserRuleCall_5_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsImplementationBody__Alternatives_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSectionsImplementationBodyAccess().getComponentsAssignment_0_1_0()); }
		(rule__SectionsImplementationBody__ComponentsAssignment_0_1_0)
		{ after(grammarAccess.getSectionsImplementationBodyAccess().getComponentsAssignment_0_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getSectionsImplementationBodyAccess().getAssignmentsAssignment_0_1_1()); }
		(rule__SectionsImplementationBody__AssignmentsAssignment_0_1_1)
		{ after(grammarAccess.getSectionsImplementationBodyAccess().getAssignmentsAssignment_0_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsImplementationBody__ConnectionsAlternatives_1_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSectionsImplementationBodyAccess().getConnectionsConnectionParserRuleCall_1_1_0_0()); }
		ruleConnection
		{ after(grammarAccess.getSectionsImplementationBodyAccess().getConnectionsConnectionParserRuleCall_1_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getSectionsImplementationBodyAccess().getConnectionsFeatureMappingParserRuleCall_1_1_0_1()); }
		ruleFeatureMapping
		{ after(grammarAccess.getSectionsImplementationBodyAccess().getConnectionsFeatureMappingParserRuleCall_1_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsImplementationBody__Alternatives_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSectionsImplementationBodyAccess().getFlowAssignmentsAssignment_2_1_0()); }
		(rule__SectionsImplementationBody__FlowAssignmentsAssignment_2_1_0)
		{ after(grammarAccess.getSectionsImplementationBodyAccess().getFlowAssignmentsAssignment_2_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getSectionsImplementationBodyAccess().getPathsAssignment_2_1_1()); }
		(rule__SectionsImplementationBody__PathsAssignment_2_1_1)
		{ after(grammarAccess.getSectionsImplementationBodyAccess().getPathsAssignment_2_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplementationBody__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImplementationBodyAccess().getConnectionsAssignment_1_0()); }
		(rule__ImplementationBody__ConnectionsAssignment_1_0)
		{ after(grammarAccess.getImplementationBodyAccess().getConnectionsAssignment_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getImplementationBodyAccess().getConnectionsAssignment_1_1()); }
		(rule__ImplementationBody__ConnectionsAssignment_1_1)
		{ after(grammarAccess.getImplementationBodyAccess().getConnectionsAssignment_1_1()); }
	)
	|
	(
		{ before(grammarAccess.getImplementationBodyAccess().getComponentsAssignment_1_2()); }
		(rule__ImplementationBody__ComponentsAssignment_1_2)
		{ after(grammarAccess.getImplementationBodyAccess().getComponentsAssignment_1_2()); }
	)
	|
	(
		{ before(grammarAccess.getImplementationBodyAccess().getPathsAssignment_1_3()); }
		(rule__ImplementationBody__PathsAssignment_1_3)
		{ after(grammarAccess.getImplementationBodyAccess().getPathsAssignment_1_3()); }
	)
	|
	(
		{ before(grammarAccess.getImplementationBodyAccess().getFlowAssignmentsAssignment_1_4()); }
		(rule__ImplementationBody__FlowAssignmentsAssignment_1_4)
		{ after(grammarAccess.getImplementationBodyAccess().getFlowAssignmentsAssignment_1_4()); }
	)
	|
	(
		{ before(grammarAccess.getImplementationBodyAccess().getAssignmentsAssignment_1_5()); }
		(rule__ImplementationBody__AssignmentsAssignment_1_5)
		{ after(grammarAccess.getImplementationBodyAccess().getAssignmentsAssignment_1_5()); }
	)
	|
	(
		{ before(grammarAccess.getImplementationBodyAccess().getPropertyElementParserRuleCall_1_6()); }
		rulePropertyElement
		{ after(grammarAccess.getImplementationBodyAccess().getPropertyElementParserRuleCall_1_6()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationAssignment__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigurationAssignmentAccess().getGroup_2_0()); }
		(rule__ConfigurationAssignment__Group_2_0__0)
		{ after(grammarAccess.getConfigurationAssignmentAccess().getGroup_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getConfigurationAssignmentAccess().getCurlyConfigurationElementBlockParserRuleCall_2_1()); }
		ruleCurlyConfigurationElementBlock
		{ after(grammarAccess.getConfigurationAssignmentAccess().getCurlyConfigurationElementBlockParserRuleCall_2_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationElementBlock__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigurationElementBlockAccess().getPropertyAssociationsAssignment_1_0()); }
		(rule__ConfigurationElementBlock__PropertyAssociationsAssignment_1_0)
		{ after(grammarAccess.getConfigurationElementBlockAccess().getPropertyAssociationsAssignment_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getConfigurationElementBlockAccess().getAssignmentsAssignment_1_1()); }
		(rule__ConfigurationElementBlock__AssignmentsAssignment_1_1)
		{ after(grammarAccess.getConfigurationElementBlockAccess().getAssignmentsAssignment_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CurlyConfigurationElementBlock__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCurlyConfigurationElementBlockAccess().getPropertyElementParserRuleCall_1_0()); }
		rulePropertyElement
		{ after(grammarAccess.getCurlyConfigurationElementBlockAccess().getPropertyElementParserRuleCall_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getCurlyConfigurationElementBlockAccess().getConfigurationElementParserRuleCall_1_1()); }
		ruleConfigurationElement
		{ after(grammarAccess.getCurlyConfigurationElementBlockAccess().getConfigurationElementParserRuleCall_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeReference__Alternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeReferenceAccess().getGroup_0_0()); }
		(rule__TypeReference__Group_0_0__0)
		{ after(grammarAccess.getTypeReferenceAccess().getGroup_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getTypeReferenceAccess().getTypeAssignment_0_1()); }
		(rule__TypeReference__TypeAssignment_0_1)
		{ after(grammarAccess.getTypeReferenceAccess().getTypeAssignment_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedComponentImplementationBlock__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNestedComponentImplementationBlockAccess().getFeaturesAssignment_1_0()); }
		(rule__NestedComponentImplementationBlock__FeaturesAssignment_1_0)
		{ after(grammarAccess.getNestedComponentImplementationBlockAccess().getFeaturesAssignment_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getNestedComponentImplementationBlockAccess().getConnectionsAssignment_1_1()); }
		(rule__NestedComponentImplementationBlock__ConnectionsAssignment_1_1)
		{ after(grammarAccess.getNestedComponentImplementationBlockAccess().getConnectionsAssignment_1_1()); }
	)
	|
	(
		{ before(grammarAccess.getNestedComponentImplementationBlockAccess().getConnectionsAssignment_1_2()); }
		(rule__NestedComponentImplementationBlock__ConnectionsAssignment_1_2)
		{ after(grammarAccess.getNestedComponentImplementationBlockAccess().getConnectionsAssignment_1_2()); }
	)
	|
	(
		{ before(grammarAccess.getNestedComponentImplementationBlockAccess().getComponentsAssignment_1_3()); }
		(rule__NestedComponentImplementationBlock__ComponentsAssignment_1_3)
		{ after(grammarAccess.getNestedComponentImplementationBlockAccess().getComponentsAssignment_1_3()); }
	)
	|
	(
		{ before(grammarAccess.getNestedComponentImplementationBlockAccess().getPropertyElementParserRuleCall_1_4()); }
		rulePropertyElement
		{ after(grammarAccess.getNestedComponentImplementationBlockAccess().getPropertyElementParserRuleCall_1_4()); }
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
		{ before(grammarAccess.getComponentCategoryAccess().getComponentKeyword_0()); }
		'component'
		{ after(grammarAccess.getComponentCategoryAccess().getComponentKeyword_0()); }
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
		{ before(grammarAccess.getFeatureCategoryAccess().getAccessKeyword_2()); }
		'access'
		{ after(grammarAccess.getFeatureCategoryAccess().getAccessKeyword_2()); }
	)
	|
	(
		{ before(grammarAccess.getFeatureCategoryAccess().getBusAccessKeywordsParserRuleCall_3()); }
		ruleBusAccessKeywords
		{ after(grammarAccess.getFeatureCategoryAccess().getBusAccessKeywordsParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getFeatureCategoryAccess().getBindingKeyword_4()); }
		'binding'
		{ after(grammarAccess.getFeatureCategoryAccess().getBindingKeyword_4()); }
	)
	|
	(
		{ before(grammarAccess.getFeatureCategoryAccess().getInterfaceKeyword_5()); }
		'interface'
		{ after(grammarAccess.getFeatureCategoryAccess().getInterfaceKeyword_5()); }
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

rule__ConnectionType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConnectionTypeAccess().getFeatureKeyword_0()); }
		'feature'
		{ after(grammarAccess.getConnectionTypeAccess().getFeatureKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getConnectionTypeAccess().getBusKeyword_1()); }
		'bus'
		{ after(grammarAccess.getConnectionTypeAccess().getBusKeyword_1()); }
	)
	|
	(
		{ before(grammarAccess.getConnectionTypeAccess().getBindingKeyword_2()); }
		'binding'
		{ after(grammarAccess.getConnectionTypeAccess().getBindingKeyword_2()); }
	)
	|
	(
		{ before(grammarAccess.getConnectionTypeAccess().getInterfaceKeyword_3()); }
		'interface'
		{ after(grammarAccess.getConnectionTypeAccess().getInterfaceKeyword_3()); }
	)
	|
	(
		{ before(grammarAccess.getConnectionTypeAccess().getPortKeyword_4()); }
		'port'
		{ after(grammarAccess.getConnectionTypeAccess().getPortKeyword_4()); }
	)
	|
	(
		{ before(grammarAccess.getConnectionTypeAccess().getDataKeyword_5()); }
		'data'
		{ after(grammarAccess.getConnectionTypeAccess().getDataKeyword_5()); }
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
	{ before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); }
	'package'
	{ after(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); }
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
	{ before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); }
	(rule__PackageDeclaration__NameAssignment_1)
	{ after(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); }
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
	{ before(grammarAccess.getPackageDeclarationAccess().getImportsAssignment_2()); }
	(rule__PackageDeclaration__ImportsAssignment_2)*
	{ after(grammarAccess.getPackageDeclarationAccess().getImportsAssignment_2()); }
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
	{ before(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_3()); }
	(rule__PackageDeclaration__ElementsAssignment_3)*
	{ after(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_3()); }
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
	{ before(grammarAccess.getPackageDeclarationAccess().getEndKeyword_4()); }
	'end'
	{ after(grammarAccess.getPackageDeclarationAccess().getEndKeyword_4()); }
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
	{ before(grammarAccess.getPackageDeclarationAccess().getQualifiedNameParserRuleCall_5()); }
	(ruleQualifiedName)?
	{ after(grammarAccess.getPackageDeclarationAccess().getQualifiedNameParserRuleCall_5()); }
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
	{ before(grammarAccess.getPackageDeclarationAccess().getSEMICOLONParserRuleCall_6()); }
	ruleSEMICOLON
	{ after(grammarAccess.getPackageDeclarationAccess().getSEMICOLONParserRuleCall_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Property__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Property__Group__0__Impl
	rule__Property__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyAccess().getPropertyKeyword_0()); }
	'property'
	{ after(grammarAccess.getPropertyAccess().getPropertyKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Property__Group__1__Impl
	rule__Property__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyAccess().getNameAssignment_1()); }
	(rule__Property__NameAssignment_1)
	{ after(grammarAccess.getPropertyAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Property__Group__2__Impl
	rule__Property__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyAccess().getTypeAssignment_2()); }
	(rule__Property__TypeAssignment_2)
	{ after(grammarAccess.getPropertyAccess().getTypeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Property__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyAccess().getSEMICOLONParserRuleCall_3()); }
	ruleSEMICOLON
	{ after(grammarAccess.getPropertyAccess().getSEMICOLONParserRuleCall_3()); }
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
	{ before(grammarAccess.getPropertySetAccess().getNameAssignment_0()); }
	(rule__PropertySet__NameAssignment_0)
	{ after(grammarAccess.getPropertySetAccess().getNameAssignment_0()); }
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
	{ before(grammarAccess.getPropertySetAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getPropertySetAccess().getColonKeyword_1()); }
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
	{ before(grammarAccess.getPropertySetAccess().getIsKeyword_3()); }
	'is'
	{ after(grammarAccess.getPropertySetAccess().getIsKeyword_3()); }
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
	{ before(grammarAccess.getPropertySetAccess().getPropertiesAssignment_4()); }
	(rule__PropertySet__PropertiesAssignment_4)
	{ after(grammarAccess.getPropertySetAccess().getPropertiesAssignment_4()); }
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
	{ before(grammarAccess.getPropertySetAccess().getGroup_5()); }
	(rule__PropertySet__Group_5__0)*
	{ after(grammarAccess.getPropertySetAccess().getGroup_5()); }
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
	{ before(grammarAccess.getPropertySetAccess().getEndKeyword_6()); }
	'end'
	{ after(grammarAccess.getPropertySetAccess().getEndKeyword_6()); }
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
	{ before(grammarAccess.getPropertySetAccess().getIDTerminalRuleCall_7()); }
	(RULE_ID)?
	{ after(grammarAccess.getPropertySetAccess().getIDTerminalRuleCall_7()); }
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
	{ before(grammarAccess.getPropertySetAccess().getSEMICOLONParserRuleCall_8()); }
	ruleSEMICOLON
	{ after(grammarAccess.getPropertySetAccess().getSEMICOLONParserRuleCall_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PropertySet__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertySet__Group_5__0__Impl
	rule__PropertySet__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertySetAccess().getCommaKeyword_5_0()); }
	','
	{ after(grammarAccess.getPropertySetAccess().getCommaKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertySet__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertySetAccess().getPropertiesAssignment_5_1()); }
	(rule__PropertySet__PropertiesAssignment_5_1)
	{ after(grammarAccess.getPropertySetAccess().getPropertiesAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PrimitiveType__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimitiveType__Group__0__Impl
	rule__PrimitiveType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimitiveType__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimitiveTypeAccess().getTypeKeyword_0()); }
	'type'
	{ after(grammarAccess.getPrimitiveTypeAccess().getTypeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimitiveType__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimitiveType__Group__1__Impl
	rule__PrimitiveType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimitiveType__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimitiveTypeAccess().getNameAssignment_1()); }
	(rule__PrimitiveType__NameAssignment_1)
	{ after(grammarAccess.getPrimitiveTypeAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimitiveType__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimitiveType__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimitiveType__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimitiveTypeAccess().getSEMICOLONParserRuleCall_2()); }
	ruleSEMICOLON
	{ after(grammarAccess.getPrimitiveTypeAccess().getSEMICOLONParserRuleCall_2()); }
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
	{ before(grammarAccess.getComponentInterfaceAccess().getCategoryAssignment_0()); }
	(rule__ComponentInterface__CategoryAssignment_0)?
	{ after(grammarAccess.getComponentInterfaceAccess().getCategoryAssignment_0()); }
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
	{ before(grammarAccess.getComponentInterfaceAccess().getInterfaceKeyword_1()); }
	'interface'
	{ after(grammarAccess.getComponentInterfaceAccess().getInterfaceKeyword_1()); }
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
	{ before(grammarAccess.getComponentInterfaceAccess().getNameAssignment_2()); }
	(rule__ComponentInterface__NameAssignment_2)
	{ after(grammarAccess.getComponentInterfaceAccess().getNameAssignment_2()); }
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
	{ before(grammarAccess.getComponentInterfaceAccess().getGroup_3()); }
	(rule__ComponentInterface__Group_3__0)?
	{ after(grammarAccess.getComponentInterfaceAccess().getGroup_3()); }
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
	{ before(grammarAccess.getComponentInterfaceAccess().getAlternatives_5()); }
	(rule__ComponentInterface__Alternatives_5)
	{ after(grammarAccess.getComponentInterfaceAccess().getAlternatives_5()); }
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
	{ before(grammarAccess.getComponentInterfaceAccess().getEndKeyword_6()); }
	'end'
	{ after(grammarAccess.getComponentInterfaceAccess().getEndKeyword_6()); }
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
	rule__ComponentInterface__Group__8
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
	{ before(grammarAccess.getComponentInterfaceAccess().getIDTerminalRuleCall_7()); }
	(RULE_ID)?
	{ after(grammarAccess.getComponentInterfaceAccess().getIDTerminalRuleCall_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentInterface__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentInterfaceAccess().getSEMICOLONParserRuleCall_8()); }
	ruleSEMICOLON
	{ after(grammarAccess.getComponentInterfaceAccess().getSEMICOLONParserRuleCall_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentInterface__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentInterface__Group_3__0__Impl
	rule__ComponentInterface__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentInterfaceAccess().getExtendsKeyword_3_0()); }
	'extends'
	{ after(grammarAccess.getComponentInterfaceAccess().getExtendsKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentInterface__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentInterfaceAccess().getInterfaceExtensionsParserRuleCall_3_1()); }
	(ruleInterfaceExtensions)?
	{ after(grammarAccess.getComponentInterfaceAccess().getInterfaceExtensionsParserRuleCall_3_1()); }
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
	{ before(grammarAccess.getComponentInterfaceAccess().getUseKeyword_4_0()); }
	'use'
	{ after(grammarAccess.getComponentInterfaceAccess().getUseKeyword_4_0()); }
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
	rule__ComponentInterface__Group_4__2
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
	{ before(grammarAccess.getComponentInterfaceAccess().getPropertiesKeyword_4_1()); }
	'properties'
	{ after(grammarAccess.getComponentInterfaceAccess().getPropertiesKeyword_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentInterface__Group_4__2__Impl
	rule__ComponentInterface__Group_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentInterfaceAccess().getUsePropertiesAssignment_4_2()); }
	(rule__ComponentInterface__UsePropertiesAssignment_4_2)
	{ after(grammarAccess.getComponentInterfaceAccess().getUsePropertiesAssignment_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__Group_4__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentInterface__Group_4__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__Group_4__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentInterfaceAccess().getGroup_4_3()); }
	(rule__ComponentInterface__Group_4_3__0)*
	{ after(grammarAccess.getComponentInterfaceAccess().getGroup_4_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentInterface__Group_4_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentInterface__Group_4_3__0__Impl
	rule__ComponentInterface__Group_4_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__Group_4_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_4_3_0()); }
	','
	{ after(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_4_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__Group_4_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentInterface__Group_4_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__Group_4_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentInterfaceAccess().getUsePropertiesAssignment_4_3_1()); }
	(rule__ComponentInterface__UsePropertiesAssignment_4_3_1)
	{ after(grammarAccess.getComponentInterfaceAccess().getUsePropertiesAssignment_4_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SectionsInterfaceBody__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SectionsInterfaceBody__Group__0__Impl
	rule__SectionsInterfaceBody__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsInterfaceBody__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSectionsInterfaceBodyAccess().getGroup_0()); }
	(rule__SectionsInterfaceBody__Group_0__0)?
	{ after(grammarAccess.getSectionsInterfaceBodyAccess().getGroup_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsInterfaceBody__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SectionsInterfaceBody__Group__1__Impl
	rule__SectionsInterfaceBody__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsInterfaceBody__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSectionsInterfaceBodyAccess().getGroup_1()); }
	(rule__SectionsInterfaceBody__Group_1__0)?
	{ after(grammarAccess.getSectionsInterfaceBodyAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsInterfaceBody__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SectionsInterfaceBody__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsInterfaceBody__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSectionsInterfaceBodyAccess().getGroup_2()); }
	(rule__SectionsInterfaceBody__Group_2__0)?
	{ after(grammarAccess.getSectionsInterfaceBodyAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SectionsInterfaceBody__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SectionsInterfaceBody__Group_0__0__Impl
	rule__SectionsInterfaceBody__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsInterfaceBody__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSectionsInterfaceBodyAccess().getFeaturesKeyword_0_0()); }
	'features'
	{ after(grammarAccess.getSectionsInterfaceBodyAccess().getFeaturesKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsInterfaceBody__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SectionsInterfaceBody__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsInterfaceBody__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getSectionsInterfaceBodyAccess().getFeaturesAssignment_0_1()); }
		(rule__SectionsInterfaceBody__FeaturesAssignment_0_1)
		{ after(grammarAccess.getSectionsInterfaceBodyAccess().getFeaturesAssignment_0_1()); }
	)
	(
		{ before(grammarAccess.getSectionsInterfaceBodyAccess().getFeaturesAssignment_0_1()); }
		(rule__SectionsInterfaceBody__FeaturesAssignment_0_1)*
		{ after(grammarAccess.getSectionsInterfaceBodyAccess().getFeaturesAssignment_0_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SectionsInterfaceBody__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SectionsInterfaceBody__Group_1__0__Impl
	rule__SectionsInterfaceBody__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsInterfaceBody__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSectionsInterfaceBodyAccess().getFlowsKeyword_1_0()); }
	'flows'
	{ after(grammarAccess.getSectionsInterfaceBodyAccess().getFlowsKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsInterfaceBody__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SectionsInterfaceBody__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsInterfaceBody__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getSectionsInterfaceBodyAccess().getAlternatives_1_1()); }
		(rule__SectionsInterfaceBody__Alternatives_1_1)
		{ after(grammarAccess.getSectionsInterfaceBodyAccess().getAlternatives_1_1()); }
	)
	(
		{ before(grammarAccess.getSectionsInterfaceBodyAccess().getAlternatives_1_1()); }
		(rule__SectionsInterfaceBody__Alternatives_1_1)*
		{ after(grammarAccess.getSectionsInterfaceBodyAccess().getAlternatives_1_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SectionsInterfaceBody__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SectionsInterfaceBody__Group_2__0__Impl
	rule__SectionsInterfaceBody__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsInterfaceBody__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSectionsInterfaceBodyAccess().getPropertiesKeyword_2_0()); }
	'properties'
	{ after(grammarAccess.getSectionsInterfaceBodyAccess().getPropertiesKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsInterfaceBody__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SectionsInterfaceBody__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsInterfaceBody__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getSectionsInterfaceBodyAccess().getPropertyElementParserRuleCall_2_1()); }
		(rulePropertyElement)
		{ after(grammarAccess.getSectionsInterfaceBodyAccess().getPropertyElementParserRuleCall_2_1()); }
	)
	(
		{ before(grammarAccess.getSectionsInterfaceBodyAccess().getPropertyElementParserRuleCall_2_1()); }
		(rulePropertyElement)*
		{ after(grammarAccess.getSectionsInterfaceBodyAccess().getPropertyElementParserRuleCall_2_1()); }
	)
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
	{ before(grammarAccess.getInterfaceBodyAccess().getAlternatives_1()); }
	(rule__InterfaceBody__Alternatives_1)*
	{ after(grammarAccess.getInterfaceBodyAccess().getAlternatives_1()); }
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
	{ before(grammarAccess.getComponentImplementationAccess().getCategoryAssignment_0()); }
	(rule__ComponentImplementation__CategoryAssignment_0)
	{ after(grammarAccess.getComponentImplementationAccess().getCategoryAssignment_0()); }
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
	{ before(grammarAccess.getComponentImplementationAccess().getInterfaceAssignment_1()); }
	(rule__ComponentImplementation__InterfaceAssignment_1)
	{ after(grammarAccess.getComponentImplementationAccess().getInterfaceAssignment_1()); }
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
	{ before(grammarAccess.getComponentImplementationAccess().getFullStopKeyword_2()); }
	'.'
	{ after(grammarAccess.getComponentImplementationAccess().getFullStopKeyword_2()); }
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
	{ before(grammarAccess.getComponentImplementationAccess().getAlternatives_5()); }
	(rule__ComponentImplementation__Alternatives_5)
	{ after(grammarAccess.getComponentImplementationAccess().getAlternatives_5()); }
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
	rule__ComponentImplementation__Group__7
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
	{ before(grammarAccess.getComponentImplementationAccess().getEndKeyword_6()); }
	'end'
	{ after(grammarAccess.getComponentImplementationAccess().getEndKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentImplementation__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentImplementation__Group__7__Impl
	rule__ComponentImplementation__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentImplementation__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentImplementationAccess().getDottedNameParserRuleCall_7()); }
	(ruleDottedName)?
	{ after(grammarAccess.getComponentImplementationAccess().getDottedNameParserRuleCall_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentImplementation__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentImplementation__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentImplementation__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentImplementationAccess().getSEMICOLONParserRuleCall_8()); }
	ruleSEMICOLON
	{ after(grammarAccess.getComponentImplementationAccess().getSEMICOLONParserRuleCall_8()); }
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
	{ before(grammarAccess.getComponentImplementationAccess().getClassifierExtensionsParserRuleCall_4_1()); }
	(ruleClassifierExtensions)?
	{ after(grammarAccess.getComponentImplementationAccess().getClassifierExtensionsParserRuleCall_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SectionsImplementationBody__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SectionsImplementationBody__Group__0__Impl
	rule__SectionsImplementationBody__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsImplementationBody__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSectionsImplementationBodyAccess().getGroup_0()); }
	(rule__SectionsImplementationBody__Group_0__0)?
	{ after(grammarAccess.getSectionsImplementationBodyAccess().getGroup_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsImplementationBody__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SectionsImplementationBody__Group__1__Impl
	rule__SectionsImplementationBody__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsImplementationBody__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSectionsImplementationBodyAccess().getGroup_1()); }
	(rule__SectionsImplementationBody__Group_1__0)?
	{ after(grammarAccess.getSectionsImplementationBodyAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsImplementationBody__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SectionsImplementationBody__Group__2__Impl
	rule__SectionsImplementationBody__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsImplementationBody__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSectionsImplementationBodyAccess().getGroup_2()); }
	(rule__SectionsImplementationBody__Group_2__0)?
	{ after(grammarAccess.getSectionsImplementationBodyAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsImplementationBody__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SectionsImplementationBody__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsImplementationBody__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSectionsImplementationBodyAccess().getGroup_3()); }
	(rule__SectionsImplementationBody__Group_3__0)?
	{ after(grammarAccess.getSectionsImplementationBodyAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SectionsImplementationBody__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SectionsImplementationBody__Group_0__0__Impl
	rule__SectionsImplementationBody__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsImplementationBody__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSectionsImplementationBodyAccess().getSubcomponentsKeyword_0_0()); }
	'subcomponents'
	{ after(grammarAccess.getSectionsImplementationBodyAccess().getSubcomponentsKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsImplementationBody__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SectionsImplementationBody__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsImplementationBody__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getSectionsImplementationBodyAccess().getAlternatives_0_1()); }
		(rule__SectionsImplementationBody__Alternatives_0_1)
		{ after(grammarAccess.getSectionsImplementationBodyAccess().getAlternatives_0_1()); }
	)
	(
		{ before(grammarAccess.getSectionsImplementationBodyAccess().getAlternatives_0_1()); }
		(rule__SectionsImplementationBody__Alternatives_0_1)*
		{ after(grammarAccess.getSectionsImplementationBodyAccess().getAlternatives_0_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SectionsImplementationBody__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SectionsImplementationBody__Group_1__0__Impl
	rule__SectionsImplementationBody__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsImplementationBody__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSectionsImplementationBodyAccess().getConnectionsKeyword_1_0()); }
	'connections'
	{ after(grammarAccess.getSectionsImplementationBodyAccess().getConnectionsKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsImplementationBody__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SectionsImplementationBody__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsImplementationBody__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getSectionsImplementationBodyAccess().getConnectionsAssignment_1_1()); }
		(rule__SectionsImplementationBody__ConnectionsAssignment_1_1)
		{ after(grammarAccess.getSectionsImplementationBodyAccess().getConnectionsAssignment_1_1()); }
	)
	(
		{ before(grammarAccess.getSectionsImplementationBodyAccess().getConnectionsAssignment_1_1()); }
		(rule__SectionsImplementationBody__ConnectionsAssignment_1_1)*
		{ after(grammarAccess.getSectionsImplementationBodyAccess().getConnectionsAssignment_1_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SectionsImplementationBody__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SectionsImplementationBody__Group_2__0__Impl
	rule__SectionsImplementationBody__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsImplementationBody__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSectionsImplementationBodyAccess().getFlowsKeyword_2_0()); }
	'flows'
	{ after(grammarAccess.getSectionsImplementationBodyAccess().getFlowsKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsImplementationBody__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SectionsImplementationBody__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsImplementationBody__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getSectionsImplementationBodyAccess().getAlternatives_2_1()); }
		(rule__SectionsImplementationBody__Alternatives_2_1)
		{ after(grammarAccess.getSectionsImplementationBodyAccess().getAlternatives_2_1()); }
	)
	(
		{ before(grammarAccess.getSectionsImplementationBodyAccess().getAlternatives_2_1()); }
		(rule__SectionsImplementationBody__Alternatives_2_1)*
		{ after(grammarAccess.getSectionsImplementationBodyAccess().getAlternatives_2_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SectionsImplementationBody__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SectionsImplementationBody__Group_3__0__Impl
	rule__SectionsImplementationBody__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsImplementationBody__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSectionsImplementationBodyAccess().getPropertiesKeyword_3_0()); }
	'properties'
	{ after(grammarAccess.getSectionsImplementationBodyAccess().getPropertiesKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsImplementationBody__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SectionsImplementationBody__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsImplementationBody__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getSectionsImplementationBodyAccess().getPropertyElementParserRuleCall_3_1()); }
		(rulePropertyElement)
		{ after(grammarAccess.getSectionsImplementationBodyAccess().getPropertyElementParserRuleCall_3_1()); }
	)
	(
		{ before(grammarAccess.getSectionsImplementationBodyAccess().getPropertyElementParserRuleCall_3_1()); }
		(rulePropertyElement)*
		{ after(grammarAccess.getSectionsImplementationBodyAccess().getPropertyElementParserRuleCall_3_1()); }
	)
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
	{ before(grammarAccess.getImplementationBodyAccess().getAlternatives_1()); }
	(rule__ImplementationBody__Alternatives_1)*
	{ after(grammarAccess.getImplementationBodyAccess().getAlternatives_1()); }
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
	{ before(grammarAccess.getComponentConfigurationAccess().getConfigurationKeyword_0()); }
	'configuration'
	{ after(grammarAccess.getComponentConfigurationAccess().getConfigurationKeyword_0()); }
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
	{ before(grammarAccess.getComponentConfigurationAccess().getInterfaceAssignment_1()); }
	(rule__ComponentConfiguration__InterfaceAssignment_1)
	{ after(grammarAccess.getComponentConfigurationAccess().getInterfaceAssignment_1()); }
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
	{ before(grammarAccess.getComponentConfigurationAccess().getFullStopKeyword_2()); }
	'.'
	{ after(grammarAccess.getComponentConfigurationAccess().getFullStopKeyword_2()); }
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
	{ before(grammarAccess.getComponentConfigurationAccess().getExtendsKeyword_5()); }
	'extends'
	{ after(grammarAccess.getComponentConfigurationAccess().getExtendsKeyword_5()); }
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
	{ before(grammarAccess.getComponentConfigurationAccess().getClassifierExtensionsParserRuleCall_6()); }
	ruleClassifierExtensions
	{ after(grammarAccess.getComponentConfigurationAccess().getClassifierExtensionsParserRuleCall_6()); }
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
	rule__ComponentConfiguration__Group__8
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
	{ before(grammarAccess.getComponentConfigurationAccess().getConfigurationElementBlockParserRuleCall_7()); }
	(ruleConfigurationElementBlock)?
	{ after(grammarAccess.getComponentConfigurationAccess().getConfigurationElementBlockParserRuleCall_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentConfiguration__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentConfiguration__Group__8__Impl
	rule__ComponentConfiguration__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentConfiguration__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentConfigurationAccess().getEndKeyword_8()); }
	'end'
	{ after(grammarAccess.getComponentConfigurationAccess().getEndKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentConfiguration__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentConfiguration__Group__9__Impl
	rule__ComponentConfiguration__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentConfiguration__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentConfigurationAccess().getDottedNameParserRuleCall_9()); }
	(ruleDottedName)?
	{ after(grammarAccess.getComponentConfigurationAccess().getDottedNameParserRuleCall_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentConfiguration__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentConfiguration__Group__10__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentConfiguration__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentConfigurationAccess().getSEMICOLONParserRuleCall_10()); }
	ruleSEMICOLON
	{ after(grammarAccess.getComponentConfigurationAccess().getSEMICOLONParserRuleCall_10()); }
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
	{ before(grammarAccess.getFeatureAccess().getSampledAssignment_3()); }
	(rule__Feature__SampledAssignment_3)?
	{ after(grammarAccess.getFeatureAccess().getSampledAssignment_3()); }
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
	{ before(grammarAccess.getFeatureAccess().getReverseAssignment_5()); }
	(rule__Feature__ReverseAssignment_5)?
	{ after(grammarAccess.getFeatureAccess().getReverseAssignment_5()); }
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
	{ before(grammarAccess.getFeatureAccess().getTypeAssignment_6()); }
	(rule__Feature__TypeAssignment_6)?
	{ after(grammarAccess.getFeatureAccess().getTypeAssignment_6()); }
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
	{ before(grammarAccess.getFeatureAccess().getSEMICOLONParserRuleCall_8()); }
	ruleSEMICOLON
	{ after(grammarAccess.getFeatureAccess().getSEMICOLONParserRuleCall_8()); }
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
	{ before(grammarAccess.getComponentAccess().getTypeReferenceAssignment_3()); }
	(rule__Component__TypeReferenceAssignment_3)?
	{ after(grammarAccess.getComponentAccess().getTypeReferenceAssignment_3()); }
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
	{ before(grammarAccess.getComponentAccess().getSEMICOLONParserRuleCall_5()); }
	ruleSEMICOLON
	{ after(grammarAccess.getComponentAccess().getSEMICOLONParserRuleCall_5()); }
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
	{ before(grammarAccess.getConnectionAccess().getHyphenMinusGreaterThanSignKeyword_4()); }
	'->'
	{ after(grammarAccess.getConnectionAccess().getHyphenMinusGreaterThanSignKeyword_4()); }
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
	{ before(grammarAccess.getConnectionAccess().getSEMICOLONParserRuleCall_7()); }
	ruleSEMICOLON
	{ after(grammarAccess.getConnectionAccess().getSEMICOLONParserRuleCall_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FeatureMapping__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FeatureMapping__Group__0__Impl
	rule__FeatureMapping__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureMapping__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureMappingAccess().getNameAssignment_0()); }
	(rule__FeatureMapping__NameAssignment_0)
	{ after(grammarAccess.getFeatureMappingAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureMapping__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FeatureMapping__Group__1__Impl
	rule__FeatureMapping__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureMapping__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureMappingAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getFeatureMappingAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureMapping__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FeatureMapping__Group__2__Impl
	rule__FeatureMapping__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureMapping__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureMappingAccess().getAssociationTypeAssignment_2()); }
	(rule__FeatureMapping__AssociationTypeAssignment_2)
	{ after(grammarAccess.getFeatureMappingAccess().getAssociationTypeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureMapping__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FeatureMapping__Group__3__Impl
	rule__FeatureMapping__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureMapping__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureMappingAccess().getSourceAssignment_3()); }
	(rule__FeatureMapping__SourceAssignment_3)
	{ after(grammarAccess.getFeatureMappingAccess().getSourceAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureMapping__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FeatureMapping__Group__4__Impl
	rule__FeatureMapping__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureMapping__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureMappingAccess().getEqualsSignGreaterThanSignKeyword_4()); }
	'=>'
	{ after(grammarAccess.getFeatureMappingAccess().getEqualsSignGreaterThanSignKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureMapping__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FeatureMapping__Group__5__Impl
	rule__FeatureMapping__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureMapping__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureMappingAccess().getDestinationAssignment_5()); }
	(rule__FeatureMapping__DestinationAssignment_5)
	{ after(grammarAccess.getFeatureMappingAccess().getDestinationAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureMapping__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FeatureMapping__Group__6__Impl
	rule__FeatureMapping__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureMapping__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureMappingAccess().getPropertiesBlockParserRuleCall_6()); }
	(rulePropertiesBlock)?
	{ after(grammarAccess.getFeatureMappingAccess().getPropertiesBlockParserRuleCall_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureMapping__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FeatureMapping__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureMapping__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureMappingAccess().getSEMICOLONParserRuleCall_7()); }
	ruleSEMICOLON
	{ after(grammarAccess.getFeatureMappingAccess().getSEMICOLONParserRuleCall_7()); }
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
	{ before(grammarAccess.getFlowPathAccess().getSEMICOLONParserRuleCall_7()); }
	ruleSEMICOLON
	{ after(grammarAccess.getFlowPathAccess().getSEMICOLONParserRuleCall_7()); }
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
	{ before(grammarAccess.getFlowSourceAccess().getSEMICOLONParserRuleCall_5()); }
	ruleSEMICOLON
	{ after(grammarAccess.getFlowSourceAccess().getSEMICOLONParserRuleCall_5()); }
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
	{ before(grammarAccess.getFlowSinkAccess().getSEMICOLONParserRuleCall_5()); }
	ruleSEMICOLON
	{ after(grammarAccess.getFlowSinkAccess().getSEMICOLONParserRuleCall_5()); }
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
	{ before(grammarAccess.getPathAccess().getEndToEndFlowKeywordsParserRuleCall_2()); }
	ruleEndToEndFlowKeywords
	{ after(grammarAccess.getPathAccess().getEndToEndFlowKeywordsParserRuleCall_2()); }
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
	{ before(grammarAccess.getPathAccess().getSEMICOLONParserRuleCall_6()); }
	ruleSEMICOLON
	{ after(grammarAccess.getPathAccess().getSEMICOLONParserRuleCall_6()); }
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
	{ before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); }
	(rule__Import__ImportedNamespaceAssignment_1)
	{ after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); }
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
	{ before(grammarAccess.getImportAccess().getSEMICOLONParserRuleCall_2()); }
	ruleSEMICOLON
	{ after(grammarAccess.getImportAccess().getSEMICOLONParserRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ConfigurationAssignment__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfigurationAssignment__Group__0__Impl
	rule__ConfigurationAssignment__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationAssignment__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigurationAssignmentAccess().getTargetAssignment_0()); }
	(rule__ConfigurationAssignment__TargetAssignment_0)
	{ after(grammarAccess.getConfigurationAssignmentAccess().getTargetAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationAssignment__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfigurationAssignment__Group__1__Impl
	rule__ConfigurationAssignment__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationAssignment__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigurationAssignmentAccess().getEqualsSignGreaterThanSignKeyword_1()); }
	'=>'
	{ after(grammarAccess.getConfigurationAssignmentAccess().getEqualsSignGreaterThanSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationAssignment__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfigurationAssignment__Group__2__Impl
	rule__ConfigurationAssignment__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationAssignment__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigurationAssignmentAccess().getAlternatives_2()); }
	(rule__ConfigurationAssignment__Alternatives_2)
	{ after(grammarAccess.getConfigurationAssignmentAccess().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationAssignment__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfigurationAssignment__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationAssignment__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigurationAssignmentAccess().getSEMICOLONParserRuleCall_3()); }
	ruleSEMICOLON
	{ after(grammarAccess.getConfigurationAssignmentAccess().getSEMICOLONParserRuleCall_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ConfigurationAssignment__Group_2_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfigurationAssignment__Group_2_0__0__Impl
	rule__ConfigurationAssignment__Group_2_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationAssignment__Group_2_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigurationAssignmentAccess().getValueAssignment_2_0_0()); }
	(rule__ConfigurationAssignment__ValueAssignment_2_0_0)
	{ after(grammarAccess.getConfigurationAssignmentAccess().getValueAssignment_2_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationAssignment__Group_2_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfigurationAssignment__Group_2_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationAssignment__Group_2_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigurationAssignmentAccess().getCurlyConfigurationElementBlockParserRuleCall_2_0_1()); }
	(ruleCurlyConfigurationElementBlock)?
	{ after(grammarAccess.getConfigurationAssignmentAccess().getCurlyConfigurationElementBlockParserRuleCall_2_0_1()); }
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
	{ before(grammarAccess.getFlowAssignmentAccess().getSEMICOLONParserRuleCall_5()); }
	ruleSEMICOLON
	{ after(grammarAccess.getFlowAssignmentAccess().getSEMICOLONParserRuleCall_5()); }
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
	(rule__PropertyAssociation__TargetAssignment_0)
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
	{ before(grammarAccess.getPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1()); }
	'=>'
	{ after(grammarAccess.getPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1()); }
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
	{ before(grammarAccess.getPropertyAssociationAccess().getValueAssignment_2()); }
	(rule__PropertyAssociation__ValueAssignment_2)
	{ after(grammarAccess.getPropertyAssociationAccess().getValueAssignment_2()); }
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
	{ before(grammarAccess.getPropertyAssociationAccess().getSEMICOLONParserRuleCall_3()); }
	ruleSEMICOLON
	{ after(grammarAccess.getPropertyAssociationAccess().getSEMICOLONParserRuleCall_3()); }
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
	{ before(grammarAccess.getPropertyReferenceAccess().getGroup_0()); }
	(rule__PropertyReference__Group_0__0)?
	{ after(grammarAccess.getPropertyReferenceAccess().getGroup_0()); }
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
	rule__PropertyReference__Group__2
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
	{ before(grammarAccess.getPropertyReferenceAccess().getNumberSignKeyword_1()); }
	'#'
	{ after(grammarAccess.getPropertyReferenceAccess().getNumberSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyReference__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyReference__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyReference__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyReferenceAccess().getPropertyAssignment_2()); }
	(rule__PropertyReference__PropertyAssignment_2)
	{ after(grammarAccess.getPropertyReferenceAccess().getPropertyAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PropertyReference__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyReference__Group_0__0__Impl
	rule__PropertyReference__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyReference__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyReferenceAccess().getElementAssignment_0_0()); }
	(rule__PropertyReference__ElementAssignment_0_0)
	{ after(grammarAccess.getPropertyReferenceAccess().getElementAssignment_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyReference__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyReference__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyReference__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyReferenceAccess().getGroup_0_1()); }
	(rule__PropertyReference__Group_0_1__0)*
	{ after(grammarAccess.getPropertyReferenceAccess().getGroup_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PropertyReference__Group_0_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyReference__Group_0_1__0__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyReference__Group_0_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyReferenceAccess().getGroup_0_1_0()); }
	(rule__PropertyReference__Group_0_1_0__0)
	{ after(grammarAccess.getPropertyReferenceAccess().getGroup_0_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PropertyReference__Group_0_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyReference__Group_0_1_0__0__Impl
	rule__PropertyReference__Group_0_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyReference__Group_0_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyReferenceAccess().getModelElementReferenceContextAction_0_1_0_0()); }
	()
	{ after(grammarAccess.getPropertyReferenceAccess().getModelElementReferenceContextAction_0_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyReference__Group_0_1_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyReference__Group_0_1_0__1__Impl
	rule__PropertyReference__Group_0_1_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyReference__Group_0_1_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyReferenceAccess().getFullStopKeyword_0_1_0_1()); }
	'.'
	{ after(grammarAccess.getPropertyReferenceAccess().getFullStopKeyword_0_1_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyReference__Group_0_1_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyReference__Group_0_1_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyReference__Group_0_1_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyReferenceAccess().getElementAssignment_0_1_0_2()); }
	(rule__PropertyReference__ElementAssignment_0_1_0_2)
	{ after(grammarAccess.getPropertyReferenceAccess().getElementAssignment_0_1_0_2()); }
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
	(
		{ before(grammarAccess.getConfigurationElementBlockAccess().getAlternatives_1()); }
		(rule__ConfigurationElementBlock__Alternatives_1)
		{ after(grammarAccess.getConfigurationElementBlockAccess().getAlternatives_1()); }
	)
	(
		{ before(grammarAccess.getConfigurationElementBlockAccess().getAlternatives_1()); }
		(rule__ConfigurationElementBlock__Alternatives_1)*
		{ after(grammarAccess.getConfigurationElementBlockAccess().getAlternatives_1()); }
	)
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
	{ before(grammarAccess.getCurlyConfigurationElementBlockAccess().getAlternatives_1()); }
	(rule__CurlyConfigurationElementBlock__Alternatives_1)*
	{ after(grammarAccess.getCurlyConfigurationElementBlockAccess().getAlternatives_1()); }
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
	rule__ReversableTypeReference__Group__2
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

rule__ReversableTypeReference__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReversableTypeReference__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ReversableTypeReference__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReversableTypeReferenceAccess().getConfigurationActualsParserRuleCall_2()); }
	(ruleConfigurationActuals)?
	{ after(grammarAccess.getReversableTypeReferenceAccess().getConfigurationActualsParserRuleCall_2()); }
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
	{ before(grammarAccess.getTypeReferenceAccess().getAlternatives_0()); }
	(rule__TypeReference__Alternatives_0)
	{ after(grammarAccess.getTypeReferenceAccess().getAlternatives_0()); }
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


rule__TypeReference__Group_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeReference__Group_0_0__0__Impl
	rule__TypeReference__Group_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeReference__Group_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeReferenceAccess().getComponentinterfaceAssignment_0_0_0()); }
	(rule__TypeReference__ComponentinterfaceAssignment_0_0_0)
	{ after(grammarAccess.getTypeReferenceAccess().getComponentinterfaceAssignment_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeReference__Group_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeReference__Group_0_0__1__Impl
	rule__TypeReference__Group_0_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeReference__Group_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeReferenceAccess().getFullStopKeyword_0_0_1()); }
	'.'
	{ after(grammarAccess.getTypeReferenceAccess().getFullStopKeyword_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeReference__Group_0_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeReference__Group_0_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeReference__Group_0_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeReferenceAccess().getTypeAssignment_0_0_2()); }
	(rule__TypeReference__TypeAssignment_0_0_2)
	{ after(grammarAccess.getTypeReferenceAccess().getTypeAssignment_0_0_2()); }
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
	{ before(grammarAccess.getPropertiesBlockAccess().getPropertyElementParserRuleCall_1()); }
	(rulePropertyElement)*
	{ after(grammarAccess.getPropertiesBlockAccess().getPropertyElementParserRuleCall_1()); }
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
	{ before(grammarAccess.getNestedComponentImplementationBlockAccess().getAlternatives_1()); }
	(rule__NestedComponentImplementationBlock__Alternatives_1)*
	{ after(grammarAccess.getNestedComponentImplementationBlockAccess().getAlternatives_1()); }
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


rule__ClassifierExtensions__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClassifierExtensions__Group__0__Impl
	rule__ClassifierExtensions__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierExtensions__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClassifierExtensionsAccess().getSuperClassifiersAssignment_0()); }
	(rule__ClassifierExtensions__SuperClassifiersAssignment_0)
	{ after(grammarAccess.getClassifierExtensionsAccess().getSuperClassifiersAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierExtensions__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClassifierExtensions__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierExtensions__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClassifierExtensionsAccess().getGroup_1()); }
	(rule__ClassifierExtensions__Group_1__0)*
	{ after(grammarAccess.getClassifierExtensionsAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ClassifierExtensions__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClassifierExtensions__Group_1__0__Impl
	rule__ClassifierExtensions__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierExtensions__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClassifierExtensionsAccess().getCommaKeyword_1_0()); }
	','
	{ after(grammarAccess.getClassifierExtensionsAccess().getCommaKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierExtensions__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClassifierExtensions__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierExtensions__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClassifierExtensionsAccess().getSuperClassifiersAssignment_1_1()); }
	(rule__ClassifierExtensions__SuperClassifiersAssignment_1_1)
	{ after(grammarAccess.getClassifierExtensionsAccess().getSuperClassifiersAssignment_1_1()); }
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
	{ before(grammarAccess.getConfigurationActualAccess().getValueAssignment_2()); }
	(rule__ConfigurationActual__ValueAssignment_2)
	{ after(grammarAccess.getConfigurationActualAccess().getValueAssignment_2()); }
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
	{ before(grammarAccess.getWorkingsetAccess().getWorkingsetKeyword_0()); }
	'workingset'
	{ after(grammarAccess.getWorkingsetAccess().getWorkingsetKeyword_0()); }
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
	{ before(grammarAccess.getWorkingsetAccess().getNameAssignment_1()); }
	(rule__Workingset__NameAssignment_1)
	{ after(grammarAccess.getWorkingsetAccess().getNameAssignment_1()); }
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
	{ before(grammarAccess.getWorkingsetAccess().getIsKeyword_2()); }
	'is'
	{ after(grammarAccess.getWorkingsetAccess().getIsKeyword_2()); }
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
	{ before(grammarAccess.getWorkingsetAccess().getRootComponentsAssignment_3()); }
	(rule__Workingset__RootComponentsAssignment_3)*
	{ after(grammarAccess.getWorkingsetAccess().getRootComponentsAssignment_3()); }
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
	{ before(grammarAccess.getWorkingsetAccess().getEndKeyword_4()); }
	'end'
	{ after(grammarAccess.getWorkingsetAccess().getEndKeyword_4()); }
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
	{ before(grammarAccess.getWorkingsetAccess().getSEMICOLONParserRuleCall_5()); }
	(ruleSEMICOLON)?
	{ after(grammarAccess.getWorkingsetAccess().getSEMICOLONParserRuleCall_5()); }
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
	('::*')?
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


rule__EndToEndFlowKeywords__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EndToEndFlowKeywords__Group__0__Impl
	rule__EndToEndFlowKeywords__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EndToEndFlowKeywords__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEndToEndFlowKeywordsAccess().getEndKeyword_0()); }
	'end'
	{ after(grammarAccess.getEndToEndFlowKeywordsAccess().getEndKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EndToEndFlowKeywords__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EndToEndFlowKeywords__Group__1__Impl
	rule__EndToEndFlowKeywords__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EndToEndFlowKeywords__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEndToEndFlowKeywordsAccess().getToKeyword_1()); }
	'to'
	{ after(grammarAccess.getEndToEndFlowKeywordsAccess().getToKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EndToEndFlowKeywords__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EndToEndFlowKeywords__Group__2__Impl
	rule__EndToEndFlowKeywords__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EndToEndFlowKeywords__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEndToEndFlowKeywordsAccess().getEndKeyword_2()); }
	'end'
	{ after(grammarAccess.getEndToEndFlowKeywordsAccess().getEndKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EndToEndFlowKeywords__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EndToEndFlowKeywords__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EndToEndFlowKeywords__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEndToEndFlowKeywordsAccess().getFlowKeyword_3()); }
	'flow'
	{ after(grammarAccess.getEndToEndFlowKeywordsAccess().getFlowKeyword_3()); }
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


rule__FlowPathKeywords__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FlowPathKeywords__Group__0__Impl
	rule__FlowPathKeywords__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowPathKeywords__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlowPathKeywordsAccess().getFlowKeyword_0()); }
	'flow'
	{ after(grammarAccess.getFlowPathKeywordsAccess().getFlowKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowPathKeywords__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FlowPathKeywords__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FlowPathKeywords__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFlowPathKeywordsAccess().getPathKeyword_1()); }
	'path'
	{ after(grammarAccess.getFlowPathKeywordsAccess().getPathKeyword_1()); }
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
	{ before(grammarAccess.getProvidesReadKeywordsAccess().getReadKeyword_1()); }
	'read'
	{ after(grammarAccess.getProvidesReadKeywordsAccess().getReadKeyword_1()); }
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
	{ before(grammarAccess.getRequiresReadKeywordsAccess().getReadKeyword_1()); }
	'read'
	{ after(grammarAccess.getRequiresReadKeywordsAccess().getReadKeyword_1()); }
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
	{ before(grammarAccess.getProvidesWriteKeywordsAccess().getWriteKeyword_1()); }
	'write'
	{ after(grammarAccess.getProvidesWriteKeywordsAccess().getWriteKeyword_1()); }
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
	{ before(grammarAccess.getRequiresWriteKeywordsAccess().getWriteKeyword_1()); }
	'write'
	{ after(grammarAccess.getRequiresWriteKeywordsAccess().getWriteKeyword_1()); }
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
	{ before(grammarAccess.getProvidesRWKeywordsAccess().getReadwriteKeyword_1()); }
	'readwrite'
	{ after(grammarAccess.getProvidesRWKeywordsAccess().getReadwriteKeyword_1()); }
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
	{ before(grammarAccess.getRequiresRWKeywordsAccess().getReadwriteKeyword_1()); }
	'readwrite'
	{ after(grammarAccess.getRequiresRWKeywordsAccess().getReadwriteKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PackageDeclaration__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDeclaration__ImportsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPackageDeclarationAccess().getImportsImportParserRuleCall_2_0()); }
		ruleImport
		{ after(grammarAccess.getPackageDeclarationAccess().getImportsImportParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDeclaration__ElementsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPackageDeclarationAccess().getElementsAlternatives_3_0()); }
		(rule__PackageDeclaration__ElementsAlternatives_3_0)
		{ after(grammarAccess.getPackageDeclarationAccess().getElementsAlternatives_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__TypeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyAccess().getTypeTypeCrossReference_2_0()); }
		(
			{ before(grammarAccess.getPropertyAccess().getTypeTypeQualifiedNameParserRuleCall_2_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getPropertyAccess().getTypeTypeQualifiedNameParserRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getPropertyAccess().getTypeTypeCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertySetAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getPropertySetAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__PropertiesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertySetAccess().getPropertiesPropertyCrossReference_4_0()); }
		(
			{ before(grammarAccess.getPropertySetAccess().getPropertiesPropertyQualifiedNameParserRuleCall_4_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getPropertySetAccess().getPropertiesPropertyQualifiedNameParserRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getPropertySetAccess().getPropertiesPropertyCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertySet__PropertiesAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertySetAccess().getPropertiesPropertyCrossReference_5_1_0()); }
		(
			{ before(grammarAccess.getPropertySetAccess().getPropertiesPropertyQualifiedNameParserRuleCall_5_1_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getPropertySetAccess().getPropertiesPropertyQualifiedNameParserRuleCall_5_1_0_1()); }
		)
		{ after(grammarAccess.getPropertySetAccess().getPropertiesPropertyCrossReference_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimitiveType__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimitiveTypeAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getPrimitiveTypeAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__CategoryAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentInterfaceAccess().getCategoryComponentCategoryParserRuleCall_0_0()); }
		ruleComponentCategory
		{ after(grammarAccess.getComponentInterfaceAccess().getCategoryComponentCategoryParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentInterfaceAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getComponentInterfaceAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__UsePropertiesAssignment_4_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentInterfaceAccess().getUsePropertiesPropertySetCrossReference_4_2_0()); }
		(
			{ before(grammarAccess.getComponentInterfaceAccess().getUsePropertiesPropertySetQualifiedNameParserRuleCall_4_2_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getComponentInterfaceAccess().getUsePropertiesPropertySetQualifiedNameParserRuleCall_4_2_0_1()); }
		)
		{ after(grammarAccess.getComponentInterfaceAccess().getUsePropertiesPropertySetCrossReference_4_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInterface__UsePropertiesAssignment_4_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentInterfaceAccess().getUsePropertiesPropertySetCrossReference_4_3_1_0()); }
		(
			{ before(grammarAccess.getComponentInterfaceAccess().getUsePropertiesPropertySetQualifiedNameParserRuleCall_4_3_1_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getComponentInterfaceAccess().getUsePropertiesPropertySetQualifiedNameParserRuleCall_4_3_1_0_1()); }
		)
		{ after(grammarAccess.getComponentInterfaceAccess().getUsePropertiesPropertySetCrossReference_4_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsInterfaceBody__FeaturesAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSectionsInterfaceBodyAccess().getFeaturesFeatureParserRuleCall_0_1_0()); }
		ruleFeature
		{ after(grammarAccess.getSectionsInterfaceBodyAccess().getFeaturesFeatureParserRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsInterfaceBody__FlowsAssignment_1_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSectionsInterfaceBodyAccess().getFlowsFlowPathParserRuleCall_1_1_0_0()); }
		ruleFlowPath
		{ after(grammarAccess.getSectionsInterfaceBodyAccess().getFlowsFlowPathParserRuleCall_1_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsInterfaceBody__FlowsAssignment_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSectionsInterfaceBodyAccess().getFlowsFlowSourceParserRuleCall_1_1_1_0()); }
		ruleFlowSource
		{ after(grammarAccess.getSectionsInterfaceBodyAccess().getFlowsFlowSourceParserRuleCall_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsInterfaceBody__FlowsAssignment_1_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSectionsInterfaceBodyAccess().getFlowsFlowSinkParserRuleCall_1_1_2_0()); }
		ruleFlowSink
		{ after(grammarAccess.getSectionsInterfaceBodyAccess().getFlowsFlowSinkParserRuleCall_1_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InterfaceBody__FeaturesAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInterfaceBodyAccess().getFeaturesFeatureParserRuleCall_1_0_0()); }
		ruleFeature
		{ after(grammarAccess.getInterfaceBodyAccess().getFeaturesFeatureParserRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InterfaceBody__FlowsAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInterfaceBodyAccess().getFlowsFlowPathParserRuleCall_1_1_0()); }
		ruleFlowPath
		{ after(grammarAccess.getInterfaceBodyAccess().getFlowsFlowPathParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InterfaceBody__FlowsAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInterfaceBodyAccess().getFlowsFlowSourceParserRuleCall_1_2_0()); }
		ruleFlowSource
		{ after(grammarAccess.getInterfaceBodyAccess().getFlowsFlowSourceParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InterfaceBody__FlowsAssignment_1_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInterfaceBodyAccess().getFlowsFlowSinkParserRuleCall_1_3_0()); }
		ruleFlowSink
		{ after(grammarAccess.getInterfaceBodyAccess().getFlowsFlowSinkParserRuleCall_1_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentImplementation__CategoryAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentImplementationAccess().getCategoryComponentCategoryParserRuleCall_0_0()); }
		ruleComponentCategory
		{ after(grammarAccess.getComponentImplementationAccess().getCategoryComponentCategoryParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentImplementation__InterfaceAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentImplementationAccess().getInterfaceComponentInterfaceCrossReference_1_0()); }
		(
			{ before(grammarAccess.getComponentImplementationAccess().getInterfaceComponentInterfaceQualifiedNameParserRuleCall_1_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getComponentImplementationAccess().getInterfaceComponentInterfaceQualifiedNameParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getComponentImplementationAccess().getInterfaceComponentInterfaceCrossReference_1_0()); }
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
		{ before(grammarAccess.getComponentImplementationAccess().getNameIDTerminalRuleCall_3_0()); }
		RULE_ID
		{ after(grammarAccess.getComponentImplementationAccess().getNameIDTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsImplementationBody__ComponentsAssignment_0_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSectionsImplementationBodyAccess().getComponentsComponentParserRuleCall_0_1_0_0()); }
		ruleComponent
		{ after(grammarAccess.getSectionsImplementationBodyAccess().getComponentsComponentParserRuleCall_0_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsImplementationBody__AssignmentsAssignment_0_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSectionsImplementationBodyAccess().getAssignmentsConfigurationAssignmentParserRuleCall_0_1_1_0()); }
		ruleConfigurationAssignment
		{ after(grammarAccess.getSectionsImplementationBodyAccess().getAssignmentsConfigurationAssignmentParserRuleCall_0_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsImplementationBody__ConnectionsAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSectionsImplementationBodyAccess().getConnectionsAlternatives_1_1_0()); }
		(rule__SectionsImplementationBody__ConnectionsAlternatives_1_1_0)
		{ after(grammarAccess.getSectionsImplementationBodyAccess().getConnectionsAlternatives_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsImplementationBody__FlowAssignmentsAssignment_2_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSectionsImplementationBodyAccess().getFlowAssignmentsFlowAssignmentParserRuleCall_2_1_0_0()); }
		ruleFlowAssignment
		{ after(grammarAccess.getSectionsImplementationBodyAccess().getFlowAssignmentsFlowAssignmentParserRuleCall_2_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SectionsImplementationBody__PathsAssignment_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSectionsImplementationBodyAccess().getPathsPathParserRuleCall_2_1_1_0()); }
		rulePath
		{ after(grammarAccess.getSectionsImplementationBodyAccess().getPathsPathParserRuleCall_2_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplementationBody__ConnectionsAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImplementationBodyAccess().getConnectionsConnectionParserRuleCall_1_0_0()); }
		ruleConnection
		{ after(grammarAccess.getImplementationBodyAccess().getConnectionsConnectionParserRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplementationBody__ConnectionsAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImplementationBodyAccess().getConnectionsFeatureMappingParserRuleCall_1_1_0()); }
		ruleFeatureMapping
		{ after(grammarAccess.getImplementationBodyAccess().getConnectionsFeatureMappingParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplementationBody__ComponentsAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImplementationBodyAccess().getComponentsComponentParserRuleCall_1_2_0()); }
		ruleComponent
		{ after(grammarAccess.getImplementationBodyAccess().getComponentsComponentParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplementationBody__PathsAssignment_1_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImplementationBodyAccess().getPathsPathParserRuleCall_1_3_0()); }
		rulePath
		{ after(grammarAccess.getImplementationBodyAccess().getPathsPathParserRuleCall_1_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplementationBody__FlowAssignmentsAssignment_1_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImplementationBodyAccess().getFlowAssignmentsFlowAssignmentParserRuleCall_1_4_0()); }
		ruleFlowAssignment
		{ after(grammarAccess.getImplementationBodyAccess().getFlowAssignmentsFlowAssignmentParserRuleCall_1_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplementationBody__AssignmentsAssignment_1_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImplementationBodyAccess().getAssignmentsConfigurationAssignmentParserRuleCall_1_5_0()); }
		ruleConfigurationAssignment
		{ after(grammarAccess.getImplementationBodyAccess().getAssignmentsConfigurationAssignmentParserRuleCall_1_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentConfiguration__InterfaceAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentConfigurationAccess().getInterfaceComponentInterfaceCrossReference_1_0()); }
		(
			{ before(grammarAccess.getComponentConfigurationAccess().getInterfaceComponentInterfaceQualifiedNameParserRuleCall_1_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getComponentConfigurationAccess().getInterfaceComponentInterfaceQualifiedNameParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getComponentConfigurationAccess().getInterfaceComponentInterfaceCrossReference_1_0()); }
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
		{ before(grammarAccess.getComponentConfigurationAccess().getNameIDTerminalRuleCall_3_0()); }
		RULE_ID
		{ after(grammarAccess.getComponentConfigurationAccess().getNameIDTerminalRuleCall_3_0()); }
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

rule__Feature__SampledAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getSampledSampledKeyword_3_0()); }
		(
			{ before(grammarAccess.getFeatureAccess().getSampledSampledKeyword_3_0()); }
			'sampled'
			{ after(grammarAccess.getFeatureAccess().getSampledSampledKeyword_3_0()); }
		)
		{ after(grammarAccess.getFeatureAccess().getSampledSampledKeyword_3_0()); }
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

rule__Feature__ReverseAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getReverseReverseKeyword_5_0()); }
		(
			{ before(grammarAccess.getFeatureAccess().getReverseReverseKeyword_5_0()); }
			'reverse'
			{ after(grammarAccess.getFeatureAccess().getReverseReverseKeyword_5_0()); }
		)
		{ after(grammarAccess.getFeatureAccess().getReverseReverseKeyword_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__TypeAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_6_0()); }
		(
			{ before(grammarAccess.getFeatureAccess().getTypeTypeQualifiedNameParserRuleCall_6_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getFeatureAccess().getTypeTypeQualifiedNameParserRuleCall_6_0_1()); }
		)
		{ after(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_6_0()); }
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

rule__Component__TypeReferenceAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentAccess().getTypeReferenceTypeReferenceParserRuleCall_3_0()); }
		ruleTypeReference
		{ after(grammarAccess.getComponentAccess().getTypeReferenceTypeReferenceParserRuleCall_3_0()); }
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
		{ before(grammarAccess.getConnectionAccess().getAssociationTypeConnectionTypeParserRuleCall_2_0()); }
		ruleConnectionType
		{ after(grammarAccess.getConnectionAccess().getAssociationTypeConnectionTypeParserRuleCall_2_0()); }
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

rule__FeatureMapping__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureMappingAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getFeatureMappingAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureMapping__AssociationTypeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureMappingAccess().getAssociationTypeMappingTypeParserRuleCall_2_0()); }
		ruleMappingType
		{ after(grammarAccess.getFeatureMappingAccess().getAssociationTypeMappingTypeParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureMapping__SourceAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureMappingAccess().getSourceModelElementReferenceParserRuleCall_3_0()); }
		ruleModelElementReference
		{ after(grammarAccess.getFeatureMappingAccess().getSourceModelElementReferenceParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureMapping__DestinationAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureMappingAccess().getDestinationModelElementReferenceParserRuleCall_5_0()); }
		ruleModelElementReference
		{ after(grammarAccess.getFeatureMappingAccess().getDestinationModelElementReferenceParserRuleCall_5_0()); }
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
		{ before(grammarAccess.getFlowPathAccess().getAssociationTypeFlowPathTypeParserRuleCall_2_0()); }
		ruleFlowPathType
		{ after(grammarAccess.getFlowPathAccess().getAssociationTypeFlowPathTypeParserRuleCall_2_0()); }
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
		{ before(grammarAccess.getFlowSourceAccess().getAssociationTypeFlowSourceTypeParserRuleCall_2_0()); }
		ruleFlowSourceType
		{ after(grammarAccess.getFlowSourceAccess().getAssociationTypeFlowSourceTypeParserRuleCall_2_0()); }
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
		{ before(grammarAccess.getFlowSinkAccess().getAssociationTypeFlowSinkTypeParserRuleCall_2_0()); }
		ruleFlowSinkType
		{ after(grammarAccess.getFlowSinkAccess().getAssociationTypeFlowSinkTypeParserRuleCall_2_0()); }
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

rule__Import__ImportedNamespaceAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); }
		ruleQualifiedNameWithWildcard
		{ after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationAssignment__TargetAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigurationAssignmentAccess().getTargetModelElementReferenceParserRuleCall_0_0()); }
		ruleModelElementReference
		{ after(grammarAccess.getConfigurationAssignmentAccess().getTargetModelElementReferenceParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationAssignment__ValueAssignment_2_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigurationAssignmentAccess().getValueTypeReferenceParserRuleCall_2_0_0_0()); }
		ruleTypeReference
		{ after(grammarAccess.getConfigurationAssignmentAccess().getValueTypeReferenceParserRuleCall_2_0_0_0()); }
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

rule__PropertyAssociation__TargetAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyAssociationAccess().getTargetPropertyReferenceParserRuleCall_0_0()); }
		rulePropertyReference
		{ after(grammarAccess.getPropertyAssociationAccess().getTargetPropertyReferenceParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyAssociation__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyAssociationAccess().getValuePropertyValueParserRuleCall_2_0()); }
		rulePropertyValue
		{ after(grammarAccess.getPropertyAssociationAccess().getValuePropertyValueParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyValue__ValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyValueAccess().getValueINTTerminalRuleCall_0()); }
		RULE_INT
		{ after(grammarAccess.getPropertyValueAccess().getValueINTTerminalRuleCall_0()); }
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

rule__PropertyReference__ElementAssignment_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyReferenceAccess().getElementModelElementCrossReference_0_0_0()); }
		(
			{ before(grammarAccess.getPropertyReferenceAccess().getElementModelElementIDTerminalRuleCall_0_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getPropertyReferenceAccess().getElementModelElementIDTerminalRuleCall_0_0_0_1()); }
		)
		{ after(grammarAccess.getPropertyReferenceAccess().getElementModelElementCrossReference_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyReference__ElementAssignment_0_1_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyReferenceAccess().getElementModelElementCrossReference_0_1_0_2_0()); }
		(
			{ before(grammarAccess.getPropertyReferenceAccess().getElementModelElementIDTerminalRuleCall_0_1_0_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getPropertyReferenceAccess().getElementModelElementIDTerminalRuleCall_0_1_0_2_0_1()); }
		)
		{ after(grammarAccess.getPropertyReferenceAccess().getElementModelElementCrossReference_0_1_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyReference__PropertyAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyReferenceAccess().getPropertyPropertyCrossReference_2_0()); }
		(
			{ before(grammarAccess.getPropertyReferenceAccess().getPropertyPropertyQualifiedNameParserRuleCall_2_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getPropertyReferenceAccess().getPropertyPropertyQualifiedNameParserRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getPropertyReferenceAccess().getPropertyPropertyCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationElementBlock__PropertyAssociationsAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigurationElementBlockAccess().getPropertyAssociationsPropertyAssociationParserRuleCall_1_0_0()); }
		rulePropertyAssociation
		{ after(grammarAccess.getConfigurationElementBlockAccess().getPropertyAssociationsPropertyAssociationParserRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationElementBlock__AssignmentsAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigurationElementBlockAccess().getAssignmentsConfigurationAssignmentParserRuleCall_1_1_0()); }
		ruleConfigurationAssignment
		{ after(grammarAccess.getConfigurationElementBlockAccess().getAssignmentsConfigurationAssignmentParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyElement__PropertyAssociationsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyElementAccess().getPropertyAssociationsPropertyAssociationParserRuleCall_0()); }
		rulePropertyAssociation
		{ after(grammarAccess.getPropertyElementAccess().getPropertyAssociationsPropertyAssociationParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigurationElement__AssignmentsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigurationElementAccess().getAssignmentsConfigurationAssignmentParserRuleCall_0()); }
		ruleConfigurationAssignment
		{ after(grammarAccess.getConfigurationElementAccess().getAssignmentsConfigurationAssignmentParserRuleCall_0()); }
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
		{ before(grammarAccess.getReversableTypeReferenceAccess().getTypeTypeCrossReference_1_0()); }
		(
			{ before(grammarAccess.getReversableTypeReferenceAccess().getTypeTypeQualifiedNameParserRuleCall_1_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getReversableTypeReferenceAccess().getTypeTypeQualifiedNameParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getReversableTypeReferenceAccess().getTypeTypeCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeReference__ComponentinterfaceAssignment_0_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeReferenceAccess().getComponentinterfaceComponentInterfaceCrossReference_0_0_0_0()); }
		(
			{ before(grammarAccess.getTypeReferenceAccess().getComponentinterfaceComponentInterfaceQualifiedNameParserRuleCall_0_0_0_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getTypeReferenceAccess().getComponentinterfaceComponentInterfaceQualifiedNameParserRuleCall_0_0_0_0_1()); }
		)
		{ after(grammarAccess.getTypeReferenceAccess().getComponentinterfaceComponentInterfaceCrossReference_0_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeReference__TypeAssignment_0_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeReferenceAccess().getTypeTypeCrossReference_0_0_2_0()); }
		(
			{ before(grammarAccess.getTypeReferenceAccess().getTypeTypeIDTerminalRuleCall_0_0_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getTypeReferenceAccess().getTypeTypeIDTerminalRuleCall_0_0_2_0_1()); }
		)
		{ after(grammarAccess.getTypeReferenceAccess().getTypeTypeCrossReference_0_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeReference__TypeAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeReferenceAccess().getTypeTypeCrossReference_0_1_0()); }
		(
			{ before(grammarAccess.getTypeReferenceAccess().getTypeTypeQualifiedNameParserRuleCall_0_1_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getTypeReferenceAccess().getTypeTypeQualifiedNameParserRuleCall_0_1_0_1()); }
		)
		{ after(grammarAccess.getTypeReferenceAccess().getTypeTypeCrossReference_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedComponentImplementationBlock__FeaturesAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNestedComponentImplementationBlockAccess().getFeaturesFeatureParserRuleCall_1_0_0()); }
		ruleFeature
		{ after(grammarAccess.getNestedComponentImplementationBlockAccess().getFeaturesFeatureParserRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedComponentImplementationBlock__ConnectionsAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNestedComponentImplementationBlockAccess().getConnectionsConnectionParserRuleCall_1_1_0()); }
		ruleConnection
		{ after(grammarAccess.getNestedComponentImplementationBlockAccess().getConnectionsConnectionParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedComponentImplementationBlock__ConnectionsAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNestedComponentImplementationBlockAccess().getConnectionsFeatureMappingParserRuleCall_1_2_0()); }
		ruleFeatureMapping
		{ after(grammarAccess.getNestedComponentImplementationBlockAccess().getConnectionsFeatureMappingParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedComponentImplementationBlock__ComponentsAssignment_1_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNestedComponentImplementationBlockAccess().getComponentsComponentParserRuleCall_1_3_0()); }
		ruleComponent
		{ after(grammarAccess.getNestedComponentImplementationBlockAccess().getComponentsComponentParserRuleCall_1_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierExtensions__SuperClassifiersAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClassifierExtensionsAccess().getSuperClassifiersTypeReferenceParserRuleCall_0_0()); }
		ruleTypeReference
		{ after(grammarAccess.getClassifierExtensionsAccess().getSuperClassifiersTypeReferenceParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassifierExtensions__SuperClassifiersAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClassifierExtensionsAccess().getSuperClassifiersTypeReferenceParserRuleCall_1_1_0()); }
		ruleTypeReference
		{ after(grammarAccess.getClassifierExtensionsAccess().getSuperClassifiersTypeReferenceParserRuleCall_1_1_0()); }
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
		{ before(grammarAccess.getInterfaceExtensionsAccess().getSuperClassifiersReversableTypeReferenceParserRuleCall_0_0()); }
		ruleReversableTypeReference
		{ after(grammarAccess.getInterfaceExtensionsAccess().getSuperClassifiersReversableTypeReferenceParserRuleCall_0_0()); }
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
		{ before(grammarAccess.getInterfaceExtensionsAccess().getSuperClassifiersReversableTypeReferenceParserRuleCall_1_1_0()); }
		ruleReversableTypeReference
		{ after(grammarAccess.getInterfaceExtensionsAccess().getSuperClassifiersReversableTypeReferenceParserRuleCall_1_1_0()); }
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

rule__ConfigurationActual__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigurationActualAccess().getValueTypeReferenceParserRuleCall_2_0()); }
		ruleTypeReference
		{ after(grammarAccess.getConfigurationActualAccess().getValueTypeReferenceParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Workingset__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWorkingsetAccess().getNameQualifiedNameParserRuleCall_1_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getWorkingsetAccess().getNameQualifiedNameParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Workingset__RootComponentsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWorkingsetAccess().getRootComponentsComponentParserRuleCall_3_0()); }
		ruleComponent
		{ after(grammarAccess.getWorkingsetAccess().getRootComponentsComponentParserRuleCall_3_0()); }
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
