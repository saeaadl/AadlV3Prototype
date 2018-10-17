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
	protected AbstractElementAlias match_ComponentImplementation_ExtendsKeyword_2_0_q;
	protected AbstractElementAlias match_ComponentInterface_ExtendsKeyword_3_0_q;
	protected AbstractElementAlias match_Workingset_SEMICOLONParserRuleCall_5_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AadlV3GrammarAccess) access;
		match_ComponentImplementation_ExtendsKeyword_2_0_q = new TokenAlias(false, true, grammarAccess.getComponentImplementationAccess().getExtendsKeyword_2_0());
		match_ComponentInterface_ExtendsKeyword_3_0_q = new TokenAlias(false, true, grammarAccess.getComponentInterfaceAccess().getExtendsKeyword_3_0());
		match_Workingset_SEMICOLONParserRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getWorkingsetAccess().getSEMICOLONParserRuleCall_5());
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
			if (match_ComponentImplementation_ExtendsKeyword_2_0_q.equals(syntax))
				emit_ComponentImplementation_ExtendsKeyword_2_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ComponentInterface_ExtendsKeyword_3_0_q.equals(syntax))
				emit_ComponentInterface_ExtendsKeyword_3_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Workingset_SEMICOLONParserRuleCall_5_q.equals(syntax))
				emit_Workingset_SEMICOLONParserRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'extends'?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=QualifiedName (ambiguity) 'is' assignments+=ConfigurationAssignment
	 *     name=QualifiedName (ambiguity) 'is' components+=Component
	 *     name=QualifiedName (ambiguity) 'is' connections+=Connection
	 *     name=QualifiedName (ambiguity) 'is' connections+=FeatureMapping
	 *     name=QualifiedName (ambiguity) 'is' flowAssignments+=FlowAssignment
	 *     name=QualifiedName (ambiguity) 'is' paths+=Path
	 *     name=QualifiedName (ambiguity) 'is' propertyAssociations+=PropertyAssociation
	 */
	protected void emit_ComponentImplementation_ExtendsKeyword_2_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'extends'?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) 'is' features+=Feature
	 *     name=ID (ambiguity) 'is' flows+=FlowPath
	 *     name=ID (ambiguity) 'is' flows+=FlowSink
	 *     name=ID (ambiguity) 'is' flows+=FlowSource
	 *     name=ID (ambiguity) 'is' propertyAssociations+=PropertyAssociation
	 */
	protected void emit_ComponentInterface_ExtendsKeyword_3_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     SEMICOLON?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=QualifiedName 'is' 'end' (ambiguity) (rule end)
	 *     rootComponents+=Component 'end' (ambiguity) (rule end)
	 */
	protected void emit_Workingset_SEMICOLONParserRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
