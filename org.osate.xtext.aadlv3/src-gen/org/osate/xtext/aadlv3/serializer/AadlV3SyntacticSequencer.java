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
package org.osate.xtext.aadlv3.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.osate.xtext.aadlv3.services.AadlV3GrammarAccess;

@SuppressWarnings("all")
public class AadlV3SyntacticSequencer extends AbstractSyntacticSequencer {

	protected AadlV3GrammarAccess grammarAccess;
	protected AbstractElementAlias match_ComponentImplementation_ExtendsKeyword_3_0_q;
	protected AbstractElementAlias match_ComponentInterface_ExtendsKeyword_4_0_q;
	protected AbstractElementAlias match_ConfigurationElementBlock_SEMICOLONParserRuleCall_0_3_q;
	protected AbstractElementAlias match_CurlyConfigurationElementBlock_SEMICOLONParserRuleCall_3_q;
	protected AbstractElementAlias match_ImplementationBody_SEMICOLONParserRuleCall_0_3_q;
	protected AbstractElementAlias match_InterfaceBody_SEMICOLONParserRuleCall_0_3_q;
	protected AbstractElementAlias match_NestedComponentImplementationBlock_SEMICOLONParserRuleCall_3_q;
	protected AbstractElementAlias match_PropertiesBlock_SEMICOLONParserRuleCall_3_q;
	protected AbstractElementAlias match_Workingset_SEMICOLONParserRuleCall_7_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AadlV3GrammarAccess) access;
		match_ComponentImplementation_ExtendsKeyword_3_0_q = new TokenAlias(false, true, grammarAccess.getComponentImplementationAccess().getExtendsKeyword_3_0());
		match_ComponentInterface_ExtendsKeyword_4_0_q = new TokenAlias(false, true, grammarAccess.getComponentInterfaceAccess().getExtendsKeyword_4_0());
		match_ConfigurationElementBlock_SEMICOLONParserRuleCall_0_3_q = new TokenAlias(false, true, grammarAccess.getConfigurationElementBlockAccess().getSEMICOLONParserRuleCall_0_3());
		match_CurlyConfigurationElementBlock_SEMICOLONParserRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getCurlyConfigurationElementBlockAccess().getSEMICOLONParserRuleCall_3());
		match_ImplementationBody_SEMICOLONParserRuleCall_0_3_q = new TokenAlias(false, true, grammarAccess.getImplementationBodyAccess().getSEMICOLONParserRuleCall_0_3());
		match_InterfaceBody_SEMICOLONParserRuleCall_0_3_q = new TokenAlias(false, true, grammarAccess.getInterfaceBodyAccess().getSEMICOLONParserRuleCall_0_3());
		match_NestedComponentImplementationBlock_SEMICOLONParserRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getNestedComponentImplementationBlockAccess().getSEMICOLONParserRuleCall_3());
		match_PropertiesBlock_SEMICOLONParserRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getPropertiesBlockAccess().getSEMICOLONParserRuleCall_3());
		match_Workingset_SEMICOLONParserRuleCall_7_q = new TokenAlias(false, true, grammarAccess.getWorkingsetAccess().getSEMICOLONParserRuleCall_7());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getEndToEndFlowKeywordsRule())
			return getEndToEndFlowKeywordsToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSEMICOLONRule())
			return getSEMICOLONToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * EndToEndFlowKeywords: 'end''to''end''flow';
	 */
	protected String getEndToEndFlowKeywordsToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "endtoendflow";
	}
	
	/**
	 * SEMICOLON:
	 * 	';';
	 */
	protected String getSEMICOLONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ";";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_ComponentImplementation_ExtendsKeyword_3_0_q.equals(syntax))
				emit_ComponentImplementation_ExtendsKeyword_3_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ComponentInterface_ExtendsKeyword_4_0_q.equals(syntax))
				emit_ComponentInterface_ExtendsKeyword_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ConfigurationElementBlock_SEMICOLONParserRuleCall_0_3_q.equals(syntax))
				emit_ConfigurationElementBlock_SEMICOLONParserRuleCall_0_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_CurlyConfigurationElementBlock_SEMICOLONParserRuleCall_3_q.equals(syntax))
				emit_CurlyConfigurationElementBlock_SEMICOLONParserRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ImplementationBody_SEMICOLONParserRuleCall_0_3_q.equals(syntax))
				emit_ImplementationBody_SEMICOLONParserRuleCall_0_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_InterfaceBody_SEMICOLONParserRuleCall_0_3_q.equals(syntax))
				emit_InterfaceBody_SEMICOLONParserRuleCall_0_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NestedComponentImplementationBlock_SEMICOLONParserRuleCall_3_q.equals(syntax))
				emit_NestedComponentImplementationBlock_SEMICOLONParserRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PropertiesBlock_SEMICOLONParserRuleCall_3_q.equals(syntax))
				emit_PropertiesBlock_SEMICOLONParserRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Workingset_SEMICOLONParserRuleCall_7_q.equals(syntax))
				emit_Workingset_SEMICOLONParserRuleCall_7_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'extends'?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=DottedName (ambiguity) 'end' (rule end)
	 *     name=DottedName (ambiguity) 'is' bindings+=Binding
	 *     name=DottedName (ambiguity) 'is' components+=Component
	 *     name=DottedName (ambiguity) 'is' configurationAssignments+=ConfigurationAssignment
	 *     name=DottedName (ambiguity) 'is' configurationAssignments+=ConfigurationAssignmentPattern
	 *     name=DottedName (ambiguity) 'is' connections+=Connection
	 *     name=DottedName (ambiguity) 'is' connections+=FeatureDelegate
	 *     name=DottedName (ambiguity) 'is' flowAssignments+=FlowAssignment
	 *     name=DottedName (ambiguity) 'is' paths+=Path
	 *     name=DottedName (ambiguity) 'is' propertyAssociations+=PropertyAssociation
	 */
	protected void emit_ComponentImplementation_ExtendsKeyword_3_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'extends'?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) 'end' (rule end)
	 *     name=ID (ambiguity) 'is' 'use' 'properties' useProperties+=[PropertySet|QualifiedName]
	 *     name=ID (ambiguity) 'is' features+=Feature
	 *     name=ID (ambiguity) 'is' flows+=FlowPath
	 *     name=ID (ambiguity) 'is' flows+=FlowSink
	 *     name=ID (ambiguity) 'is' flows+=FlowSource
	 *     name=ID (ambiguity) 'is' propertyAssociations+=PropertyAssociation
	 */
	protected void emit_ComponentInterface_ExtendsKeyword_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     SEMICOLON?
	 *
	 * This ambiguous syntax occurs at:
	 *     bindings+=Binding (ambiguity) 'end' (rule end)
	 *     configurationAssignments+=ConfigurationAssignment (ambiguity) 'end' (rule end)
	 *     configurationAssignments+=ConfigurationAssignmentPattern (ambiguity) 'end' (rule end)
	 *     propertyAssociations+=PropertyAssociation (ambiguity) 'end' (rule end)
	 */
	protected void emit_ConfigurationElementBlock_SEMICOLONParserRuleCall_0_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     SEMICOLON?
	 *
	 * This ambiguous syntax occurs at:
	 *     bindings+=Binding (ambiguity) '}' (rule end)
	 *     configurationAssignments+=ConfigurationAssignment (ambiguity) '}' (rule end)
	 *     configurationAssignments+=ConfigurationAssignmentPattern (ambiguity) '}' (rule end)
	 *     propertyAssociations+=PropertyAssociation (ambiguity) '}' (rule end)
	 */
	protected void emit_CurlyConfigurationElementBlock_SEMICOLONParserRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     SEMICOLON?
	 *
	 * This ambiguous syntax occurs at:
	 *     bindings+=Binding (ambiguity) 'end' (rule end)
	 *     components+=Component (ambiguity) 'end' (rule end)
	 *     configurationAssignments+=ConfigurationAssignment (ambiguity) 'end' (rule end)
	 *     configurationAssignments+=ConfigurationAssignmentPattern (ambiguity) 'end' (rule end)
	 *     connections+=Connection (ambiguity) 'end' (rule end)
	 *     connections+=FeatureDelegate (ambiguity) 'end' (rule end)
	 *     flowAssignments+=FlowAssignment (ambiguity) 'end' (rule end)
	 *     paths+=Path (ambiguity) 'end' (rule end)
	 *     propertyAssociations+=PropertyAssociation (ambiguity) 'end' (rule end)
	 */
	protected void emit_ImplementationBody_SEMICOLONParserRuleCall_0_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     SEMICOLON?
	 *
	 * This ambiguous syntax occurs at:
	 *     features+=Feature (ambiguity) 'end' (rule end)
	 *     flows+=FlowPath (ambiguity) 'end' (rule end)
	 *     flows+=FlowSink (ambiguity) 'end' (rule end)
	 *     flows+=FlowSource (ambiguity) 'end' (rule end)
	 *     propertyAssociations+=PropertyAssociation (ambiguity) 'end' (rule end)
	 *     useProperties+=[PropertySet|QualifiedName] (ambiguity) 'end' (rule end)
	 */
	protected void emit_InterfaceBody_SEMICOLONParserRuleCall_0_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     SEMICOLON?
	 *
	 * This ambiguous syntax occurs at:
	 *     bindings+=Binding (ambiguity) '}' (rule end)
	 *     components+=Component (ambiguity) '}' (rule end)
	 *     connections+=Connection (ambiguity) '}' (rule end)
	 *     connections+=FeatureDelegate (ambiguity) '}' (rule end)
	 *     features+=Feature (ambiguity) '}' (rule end)
	 *     propertyAssociations+=PropertyAssociation (ambiguity) '}' (rule end)
	 */
	protected void emit_NestedComponentImplementationBlock_SEMICOLONParserRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     SEMICOLON?
	 *
	 * This ambiguous syntax occurs at:
	 *     propertyAssociations+=PropertyAssociation (ambiguity) '}' (rule end)
	 *     propertyAssociations+=PropertyAssociation (ambiguity) '}' SEMICOLON (rule end)
	 */
	protected void emit_PropertiesBlock_SEMICOLONParserRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     SEMICOLON?
	 *
	 * This ambiguous syntax occurs at:
	 *     rootComponents+=Component (ambiguity) 'end' (rule end)
	 */
	protected void emit_Workingset_SEMICOLONParserRuleCall_7_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
