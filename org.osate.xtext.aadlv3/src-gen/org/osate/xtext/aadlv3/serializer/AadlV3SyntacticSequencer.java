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
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.osate.xtext.aadlv3.services.AadlV3GrammarAccess;

@SuppressWarnings("all")
public class AadlV3SyntacticSequencer extends AbstractSyntacticSequencer {

	protected AadlV3GrammarAccess grammarAccess;
	protected AbstractElementAlias match_ComponentConfiguration_DottedNameParserRuleCall_9_q;
	protected AbstractElementAlias match_ComponentImplementation_DottedNameParserRuleCall_7_q;
	protected AbstractElementAlias match_ComponentImplementation_ExtendsKeyword_4_0_q;
	protected AbstractElementAlias match_ComponentInterface_ExtendsKeyword_3_0_q;
	protected AbstractElementAlias match_ComponentInterface_IDTerminalRuleCall_7_q;
	protected AbstractElementAlias match_ImplementationBody_SectionsImplementationBody_IsKeyword_0_or_PropertiesKeyword_3_0;
	protected AbstractElementAlias match_InterfaceBody_SectionsInterfaceBody_IsKeyword_0_or_PropertiesKeyword_2_0;
	protected AbstractElementAlias match_PackageDeclaration_QualifiedNameParserRuleCall_5_q;
	protected AbstractElementAlias match_PropertySet_IDTerminalRuleCall_7_q;
	protected AbstractElementAlias match_Workingset_SEMICOLONParserRuleCall_5_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AadlV3GrammarAccess) access;
		match_ComponentConfiguration_DottedNameParserRuleCall_9_q = new TokenAlias(false, true, grammarAccess.getComponentConfigurationAccess().getDottedNameParserRuleCall_9());
		match_ComponentImplementation_DottedNameParserRuleCall_7_q = new TokenAlias(false, true, grammarAccess.getComponentImplementationAccess().getDottedNameParserRuleCall_7());
		match_ComponentImplementation_ExtendsKeyword_4_0_q = new TokenAlias(false, true, grammarAccess.getComponentImplementationAccess().getExtendsKeyword_4_0());
		match_ComponentInterface_ExtendsKeyword_3_0_q = new TokenAlias(false, true, grammarAccess.getComponentInterfaceAccess().getExtendsKeyword_3_0());
		match_ComponentInterface_IDTerminalRuleCall_7_q = new TokenAlias(false, true, grammarAccess.getComponentInterfaceAccess().getIDTerminalRuleCall_7());
		match_ImplementationBody_SectionsImplementationBody_IsKeyword_0_or_PropertiesKeyword_3_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getImplementationBodyAccess().getIsKeyword_0()), new TokenAlias(false, false, grammarAccess.getSectionsImplementationBodyAccess().getPropertiesKeyword_3_0()));
		match_InterfaceBody_SectionsInterfaceBody_IsKeyword_0_or_PropertiesKeyword_2_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getInterfaceBodyAccess().getIsKeyword_0()), new TokenAlias(false, false, grammarAccess.getSectionsInterfaceBodyAccess().getPropertiesKeyword_2_0()));
		match_PackageDeclaration_QualifiedNameParserRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getPackageDeclarationAccess().getQualifiedNameParserRuleCall_5());
		match_PropertySet_IDTerminalRuleCall_7_q = new TokenAlias(false, true, grammarAccess.getPropertySetAccess().getIDTerminalRuleCall_7());
		match_Workingset_SEMICOLONParserRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getWorkingsetAccess().getSEMICOLONParserRuleCall_5());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getDottedNameRule())
			return getDottedNameToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getEndToEndFlowKeywordsRule())
			return getEndToEndFlowKeywordsToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getQualifiedNameRule())
			return getQualifiedNameToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSEMICOLONRule())
			return getSEMICOLONToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * DottedName:
	 * 	ID '.' ID;
	 */
	protected String getDottedNameToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ".";
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
	 * terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * QualifiedName:
	 * 	ID ('::' ID)*;
	 */
	protected String getQualifiedNameToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
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
			if (match_ComponentConfiguration_DottedNameParserRuleCall_9_q.equals(syntax))
				emit_ComponentConfiguration_DottedNameParserRuleCall_9_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ComponentImplementation_DottedNameParserRuleCall_7_q.equals(syntax))
				emit_ComponentImplementation_DottedNameParserRuleCall_7_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ComponentImplementation_ExtendsKeyword_4_0_q.equals(syntax))
				emit_ComponentImplementation_ExtendsKeyword_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ComponentInterface_ExtendsKeyword_3_0_q.equals(syntax))
				emit_ComponentInterface_ExtendsKeyword_3_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ComponentInterface_IDTerminalRuleCall_7_q.equals(syntax))
				emit_ComponentInterface_IDTerminalRuleCall_7_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ImplementationBody_SectionsImplementationBody_IsKeyword_0_or_PropertiesKeyword_3_0.equals(syntax))
				emit_ImplementationBody_SectionsImplementationBody_IsKeyword_0_or_PropertiesKeyword_3_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_InterfaceBody_SectionsInterfaceBody_IsKeyword_0_or_PropertiesKeyword_2_0.equals(syntax))
				emit_InterfaceBody_SectionsInterfaceBody_IsKeyword_0_or_PropertiesKeyword_2_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PackageDeclaration_QualifiedNameParserRuleCall_5_q.equals(syntax))
				emit_PackageDeclaration_QualifiedNameParserRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PropertySet_IDTerminalRuleCall_7_q.equals(syntax))
				emit_PropertySet_IDTerminalRuleCall_7_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Workingset_SEMICOLONParserRuleCall_5_q.equals(syntax))
				emit_Workingset_SEMICOLONParserRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     DottedName?
	 *
	 * This ambiguous syntax occurs at:
	 *     assignments+=ConfigurationAssignment 'end' (ambiguity) SEMICOLON (rule end)
	 *     propertyAssociations+=PropertyAssociation 'end' (ambiguity) SEMICOLON (rule end)
	 *     superClassifiers+=TypeReference 'end' (ambiguity) SEMICOLON (rule end)
	 */
	protected void emit_ComponentConfiguration_DottedNameParserRuleCall_9_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     DottedName?
	 *
	 * This ambiguous syntax occurs at:
	 *     assignments+=ConfigurationAssignment 'end' (ambiguity) SEMICOLON (rule end)
	 *     components+=Component 'end' (ambiguity) SEMICOLON (rule end)
	 *     connections+=Connection 'end' (ambiguity) SEMICOLON (rule end)
	 *     connections+=FeatureMapping 'end' (ambiguity) SEMICOLON (rule end)
	 *     flowAssignments+=FlowAssignment 'end' (ambiguity) SEMICOLON (rule end)
	 *     name=ID 'extends'? 'end' (ambiguity) SEMICOLON (rule end)
	 *     paths+=Path 'end' (ambiguity) SEMICOLON (rule end)
	 *     propertyAssociations+=PropertyAssociation 'end' (ambiguity) SEMICOLON (rule end)
	 *     superClassifiers+=TypeReference 'end' (ambiguity) SEMICOLON (rule end)
	 */
	protected void emit_ComponentImplementation_DottedNameParserRuleCall_7_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'extends'?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) 'connections' connections+=Connection
	 *     name=ID (ambiguity) 'connections' connections+=FeatureMapping
	 *     name=ID (ambiguity) 'end' DottedName? SEMICOLON (rule end)
	 *     name=ID (ambiguity) 'flows' flowAssignments+=FlowAssignment
	 *     name=ID (ambiguity) 'flows' paths+=Path
	 *     name=ID (ambiguity) 'is' assignments+=ConfigurationAssignment
	 *     name=ID (ambiguity) 'is' components+=Component
	 *     name=ID (ambiguity) 'is' connections+=Connection
	 *     name=ID (ambiguity) 'is' connections+=FeatureMapping
	 *     name=ID (ambiguity) 'is' flowAssignments+=FlowAssignment
	 *     name=ID (ambiguity) 'is' paths+=Path
	 *     name=ID (ambiguity) 'subcomponents' assignments+=ConfigurationAssignment
	 *     name=ID (ambiguity) 'subcomponents' components+=Component
	 *     name=ID (ambiguity) ('properties' | 'is') propertyAssociations+=PropertyAssociation
	 */
	protected void emit_ComponentImplementation_ExtendsKeyword_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'extends'?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) 'end' ID? SEMICOLON (rule end)
	 *     name=ID (ambiguity) 'features' features+=Feature
	 *     name=ID (ambiguity) 'flows' flows+=FlowPath
	 *     name=ID (ambiguity) 'flows' flows+=FlowSink
	 *     name=ID (ambiguity) 'flows' flows+=FlowSource
	 *     name=ID (ambiguity) 'is' features+=Feature
	 *     name=ID (ambiguity) 'is' flows+=FlowPath
	 *     name=ID (ambiguity) 'is' flows+=FlowSink
	 *     name=ID (ambiguity) 'is' flows+=FlowSource
	 *     name=ID (ambiguity) 'use' 'properties' useProperties+=[PropertySet|QualifiedName]
	 *     name=ID (ambiguity) ('properties' | 'is') propertyAssociations+=PropertyAssociation
	 */
	protected void emit_ComponentInterface_ExtendsKeyword_3_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ID?
	 *
	 * This ambiguous syntax occurs at:
	 *     features+=Feature 'end' (ambiguity) SEMICOLON (rule end)
	 *     flows+=FlowPath 'end' (ambiguity) SEMICOLON (rule end)
	 *     flows+=FlowSink 'end' (ambiguity) SEMICOLON (rule end)
	 *     flows+=FlowSource 'end' (ambiguity) SEMICOLON (rule end)
	 *     name=ID 'extends'? 'end' (ambiguity) SEMICOLON (rule end)
	 *     propertyAssociations+=PropertyAssociation 'end' (ambiguity) SEMICOLON (rule end)
	 *     superClassifiers+=ReversableTypeReference 'end' (ambiguity) SEMICOLON (rule end)
	 *     useProperties+=[PropertySet|QualifiedName] 'end' (ambiguity) SEMICOLON (rule end)
	 */
	protected void emit_ComponentInterface_IDTerminalRuleCall_7_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'properties' | 'is'
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID 'extends'? (ambiguity) propertyAssociations+=PropertyAssociation
	 *     superClassifiers+=TypeReference (ambiguity) propertyAssociations+=PropertyAssociation
	 */
	protected void emit_ImplementationBody_SectionsImplementationBody_IsKeyword_0_or_PropertiesKeyword_3_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'properties' | 'is'
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID 'extends'? (ambiguity) propertyAssociations+=PropertyAssociation
	 *     superClassifiers+=ReversableTypeReference (ambiguity) propertyAssociations+=PropertyAssociation
	 *     useProperties+=[PropertySet|QualifiedName] (ambiguity) propertyAssociations+=PropertyAssociation
	 */
	protected void emit_InterfaceBody_SectionsInterfaceBody_IsKeyword_0_or_PropertiesKeyword_2_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     QualifiedName?
	 *
	 * This ambiguous syntax occurs at:
	 *     elements+=ComponentConfiguration 'end' (ambiguity) SEMICOLON (rule end)
	 *     elements+=ComponentImplementation 'end' (ambiguity) SEMICOLON (rule end)
	 *     elements+=ComponentInterface 'end' (ambiguity) SEMICOLON (rule end)
	 *     elements+=PackageDeclaration 'end' (ambiguity) SEMICOLON (rule end)
	 *     elements+=PrimitiveType 'end' (ambiguity) SEMICOLON (rule end)
	 *     elements+=Property 'end' (ambiguity) SEMICOLON (rule end)
	 *     elements+=PropertySet 'end' (ambiguity) SEMICOLON (rule end)
	 *     elements+=Workingset 'end' (ambiguity) SEMICOLON (rule end)
	 *     imports+=Import 'end' (ambiguity) SEMICOLON (rule end)
	 *     name=QualifiedName 'end' (ambiguity) SEMICOLON (rule end)
	 */
	protected void emit_PackageDeclaration_QualifiedNameParserRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ID?
	 *
	 * This ambiguous syntax occurs at:
	 *     properties+=[Property|QualifiedName] 'end' (ambiguity) SEMICOLON (rule end)
	 */
	protected void emit_PropertySet_IDTerminalRuleCall_7_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
