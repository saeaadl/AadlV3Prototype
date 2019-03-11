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
	protected AbstractElementAlias match_ConfigurationElementBlock_SemicolonKeyword_0_1_1_q;
	protected AbstractElementAlias match_CurlyConfigurationElementBlock_SemicolonKeyword_3_q;
	protected AbstractElementAlias match_DataType_SemicolonKeyword_4_q;
	protected AbstractElementAlias match_ImplementationBody_SemicolonKeyword_0_1_1_q;
	protected AbstractElementAlias match_Import_SemicolonKeyword_3_q;
	protected AbstractElementAlias match_InterfaceBody_SemicolonKeyword_0_1_1_q;
	protected AbstractElementAlias match_NestedComponentImplementationBlock_SemicolonKeyword_1_1_q;
	protected AbstractElementAlias match_PropertiesBlock_SemicolonKeyword_1_1_q;
	protected AbstractElementAlias match_PropertyDefinition_SemicolonKeyword_6_q;
	protected AbstractElementAlias match_PropertySet_SemicolonKeyword_8_q;
	protected AbstractElementAlias match_Workingset_SemicolonKeyword_5_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AadlV3GrammarAccess) access;
		match_ComponentImplementation_ExtendsKeyword_3_0_q = new TokenAlias(false, true, grammarAccess.getComponentImplementationAccess().getExtendsKeyword_3_0());
		match_ComponentInterface_ExtendsKeyword_4_0_q = new TokenAlias(false, true, grammarAccess.getComponentInterfaceAccess().getExtendsKeyword_4_0());
		match_ConfigurationElementBlock_SemicolonKeyword_0_1_1_q = new TokenAlias(false, true, grammarAccess.getConfigurationElementBlockAccess().getSemicolonKeyword_0_1_1());
		match_CurlyConfigurationElementBlock_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getCurlyConfigurationElementBlockAccess().getSemicolonKeyword_3());
		match_DataType_SemicolonKeyword_4_q = new TokenAlias(false, true, grammarAccess.getDataTypeAccess().getSemicolonKeyword_4());
		match_ImplementationBody_SemicolonKeyword_0_1_1_q = new TokenAlias(false, true, grammarAccess.getImplementationBodyAccess().getSemicolonKeyword_0_1_1());
		match_Import_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getImportAccess().getSemicolonKeyword_3());
		match_InterfaceBody_SemicolonKeyword_0_1_1_q = new TokenAlias(false, true, grammarAccess.getInterfaceBodyAccess().getSemicolonKeyword_0_1_1());
		match_NestedComponentImplementationBlock_SemicolonKeyword_1_1_q = new TokenAlias(false, true, grammarAccess.getNestedComponentImplementationBlockAccess().getSemicolonKeyword_1_1());
		match_PropertiesBlock_SemicolonKeyword_1_1_q = new TokenAlias(false, true, grammarAccess.getPropertiesBlockAccess().getSemicolonKeyword_1_1());
		match_PropertyDefinition_SemicolonKeyword_6_q = new TokenAlias(false, true, grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_6());
		match_PropertySet_SemicolonKeyword_8_q = new TokenAlias(false, true, grammarAccess.getPropertySetAccess().getSemicolonKeyword_8());
		match_Workingset_SemicolonKeyword_5_1_q = new TokenAlias(false, true, grammarAccess.getWorkingsetAccess().getSemicolonKeyword_5_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getEndToEndFlowKeywordsRule())
			return getEndToEndFlowKeywordsToken(semanticObject, ruleCall, node);
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
			else if (match_ConfigurationElementBlock_SemicolonKeyword_0_1_1_q.equals(syntax))
				emit_ConfigurationElementBlock_SemicolonKeyword_0_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_CurlyConfigurationElementBlock_SemicolonKeyword_3_q.equals(syntax))
				emit_CurlyConfigurationElementBlock_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DataType_SemicolonKeyword_4_q.equals(syntax))
				emit_DataType_SemicolonKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ImplementationBody_SemicolonKeyword_0_1_1_q.equals(syntax))
				emit_ImplementationBody_SemicolonKeyword_0_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Import_SemicolonKeyword_3_q.equals(syntax))
				emit_Import_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_InterfaceBody_SemicolonKeyword_0_1_1_q.equals(syntax))
				emit_InterfaceBody_SemicolonKeyword_0_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NestedComponentImplementationBlock_SemicolonKeyword_1_1_q.equals(syntax))
				emit_NestedComponentImplementationBlock_SemicolonKeyword_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PropertiesBlock_SemicolonKeyword_1_1_q.equals(syntax))
				emit_PropertiesBlock_SemicolonKeyword_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PropertyDefinition_SemicolonKeyword_6_q.equals(syntax))
				emit_PropertyDefinition_SemicolonKeyword_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PropertySet_SemicolonKeyword_8_q.equals(syntax))
				emit_PropertySet_SemicolonKeyword_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Workingset_SemicolonKeyword_5_1_q.equals(syntax))
				emit_Workingset_SemicolonKeyword_5_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
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
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     bindings+=Binding (ambiguity) 'end' (rule end)
	 *     bindings+=Binding (ambiguity) bindings+=Binding
	 *     bindings+=Binding (ambiguity) configurationAssignments+=ConfigurationAssignment
	 *     bindings+=Binding (ambiguity) configurationAssignments+=ConfigurationAssignmentPattern
	 *     bindings+=Binding (ambiguity) propertyAssociations+=PropertyAssociation
	 *     configurationAssignments+=ConfigurationAssignment (ambiguity) 'end' (rule end)
	 *     configurationAssignments+=ConfigurationAssignment (ambiguity) bindings+=Binding
	 *     configurationAssignments+=ConfigurationAssignment (ambiguity) configurationAssignments+=ConfigurationAssignment
	 *     configurationAssignments+=ConfigurationAssignment (ambiguity) configurationAssignments+=ConfigurationAssignmentPattern
	 *     configurationAssignments+=ConfigurationAssignment (ambiguity) propertyAssociations+=PropertyAssociation
	 *     configurationAssignments+=ConfigurationAssignmentPattern (ambiguity) 'end' (rule end)
	 *     configurationAssignments+=ConfigurationAssignmentPattern (ambiguity) bindings+=Binding
	 *     configurationAssignments+=ConfigurationAssignmentPattern (ambiguity) configurationAssignments+=ConfigurationAssignment
	 *     configurationAssignments+=ConfigurationAssignmentPattern (ambiguity) configurationAssignments+=ConfigurationAssignmentPattern
	 *     configurationAssignments+=ConfigurationAssignmentPattern (ambiguity) propertyAssociations+=PropertyAssociation
	 *     propertyAssociations+=PropertyAssociation (ambiguity) 'end' (rule end)
	 *     propertyAssociations+=PropertyAssociation (ambiguity) bindings+=Binding
	 *     propertyAssociations+=PropertyAssociation (ambiguity) configurationAssignments+=ConfigurationAssignment
	 *     propertyAssociations+=PropertyAssociation (ambiguity) configurationAssignments+=ConfigurationAssignmentPattern
	 *     propertyAssociations+=PropertyAssociation (ambiguity) propertyAssociations+=PropertyAssociation
	 */
	protected void emit_ConfigurationElementBlock_SemicolonKeyword_0_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     bindings+=Binding (ambiguity) '}' (rule end)
	 *     configurationAssignments+=ConfigurationAssignment (ambiguity) '}' (rule end)
	 *     configurationAssignments+=ConfigurationAssignmentPattern (ambiguity) '}' (rule end)
	 *     propertyAssociations+=PropertyAssociation (ambiguity) '}' (rule end)
	 */
	protected void emit_CurlyConfigurationElementBlock_SemicolonKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) (rule end)
	 *     propertyAssociations+=PropertyAssociation ';'? '}' (ambiguity) (rule end)
	 */
	protected void emit_DataType_SemicolonKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     bindings+=Binding (ambiguity) 'end' (rule end)
	 *     bindings+=Binding (ambiguity) bindings+=Binding
	 *     bindings+=Binding (ambiguity) components+=Component
	 *     bindings+=Binding (ambiguity) configurationAssignments+=ConfigurationAssignment
	 *     bindings+=Binding (ambiguity) configurationAssignments+=ConfigurationAssignmentPattern
	 *     bindings+=Binding (ambiguity) connections+=Connection
	 *     bindings+=Binding (ambiguity) connections+=FeatureDelegate
	 *     bindings+=Binding (ambiguity) flowAssignments+=FlowAssignment
	 *     bindings+=Binding (ambiguity) paths+=Path
	 *     bindings+=Binding (ambiguity) propertyAssociations+=PropertyAssociation
	 *     components+=Component (ambiguity) 'end' (rule end)
	 *     components+=Component (ambiguity) bindings+=Binding
	 *     components+=Component (ambiguity) components+=Component
	 *     components+=Component (ambiguity) configurationAssignments+=ConfigurationAssignment
	 *     components+=Component (ambiguity) configurationAssignments+=ConfigurationAssignmentPattern
	 *     components+=Component (ambiguity) connections+=Connection
	 *     components+=Component (ambiguity) connections+=FeatureDelegate
	 *     components+=Component (ambiguity) flowAssignments+=FlowAssignment
	 *     components+=Component (ambiguity) paths+=Path
	 *     components+=Component (ambiguity) propertyAssociations+=PropertyAssociation
	 *     configurationAssignments+=ConfigurationAssignment (ambiguity) 'end' (rule end)
	 *     configurationAssignments+=ConfigurationAssignment (ambiguity) bindings+=Binding
	 *     configurationAssignments+=ConfigurationAssignment (ambiguity) components+=Component
	 *     configurationAssignments+=ConfigurationAssignment (ambiguity) configurationAssignments+=ConfigurationAssignment
	 *     configurationAssignments+=ConfigurationAssignment (ambiguity) configurationAssignments+=ConfigurationAssignmentPattern
	 *     configurationAssignments+=ConfigurationAssignment (ambiguity) connections+=Connection
	 *     configurationAssignments+=ConfigurationAssignment (ambiguity) connections+=FeatureDelegate
	 *     configurationAssignments+=ConfigurationAssignment (ambiguity) flowAssignments+=FlowAssignment
	 *     configurationAssignments+=ConfigurationAssignment (ambiguity) paths+=Path
	 *     configurationAssignments+=ConfigurationAssignment (ambiguity) propertyAssociations+=PropertyAssociation
	 *     configurationAssignments+=ConfigurationAssignmentPattern (ambiguity) 'end' (rule end)
	 *     configurationAssignments+=ConfigurationAssignmentPattern (ambiguity) bindings+=Binding
	 *     configurationAssignments+=ConfigurationAssignmentPattern (ambiguity) components+=Component
	 *     configurationAssignments+=ConfigurationAssignmentPattern (ambiguity) configurationAssignments+=ConfigurationAssignment
	 *     configurationAssignments+=ConfigurationAssignmentPattern (ambiguity) configurationAssignments+=ConfigurationAssignmentPattern
	 *     configurationAssignments+=ConfigurationAssignmentPattern (ambiguity) connections+=Connection
	 *     configurationAssignments+=ConfigurationAssignmentPattern (ambiguity) connections+=FeatureDelegate
	 *     configurationAssignments+=ConfigurationAssignmentPattern (ambiguity) flowAssignments+=FlowAssignment
	 *     configurationAssignments+=ConfigurationAssignmentPattern (ambiguity) paths+=Path
	 *     configurationAssignments+=ConfigurationAssignmentPattern (ambiguity) propertyAssociations+=PropertyAssociation
	 *     connections+=Connection (ambiguity) 'end' (rule end)
	 *     connections+=Connection (ambiguity) bindings+=Binding
	 *     connections+=Connection (ambiguity) components+=Component
	 *     connections+=Connection (ambiguity) configurationAssignments+=ConfigurationAssignment
	 *     connections+=Connection (ambiguity) configurationAssignments+=ConfigurationAssignmentPattern
	 *     connections+=Connection (ambiguity) connections+=Connection
	 *     connections+=Connection (ambiguity) connections+=FeatureDelegate
	 *     connections+=Connection (ambiguity) flowAssignments+=FlowAssignment
	 *     connections+=Connection (ambiguity) paths+=Path
	 *     connections+=Connection (ambiguity) propertyAssociations+=PropertyAssociation
	 *     connections+=FeatureDelegate (ambiguity) 'end' (rule end)
	 *     connections+=FeatureDelegate (ambiguity) bindings+=Binding
	 *     connections+=FeatureDelegate (ambiguity) components+=Component
	 *     connections+=FeatureDelegate (ambiguity) configurationAssignments+=ConfigurationAssignment
	 *     connections+=FeatureDelegate (ambiguity) configurationAssignments+=ConfigurationAssignmentPattern
	 *     connections+=FeatureDelegate (ambiguity) connections+=Connection
	 *     connections+=FeatureDelegate (ambiguity) connections+=FeatureDelegate
	 *     connections+=FeatureDelegate (ambiguity) flowAssignments+=FlowAssignment
	 *     connections+=FeatureDelegate (ambiguity) paths+=Path
	 *     connections+=FeatureDelegate (ambiguity) propertyAssociations+=PropertyAssociation
	 *     flowAssignments+=FlowAssignment (ambiguity) 'end' (rule end)
	 *     flowAssignments+=FlowAssignment (ambiguity) bindings+=Binding
	 *     flowAssignments+=FlowAssignment (ambiguity) components+=Component
	 *     flowAssignments+=FlowAssignment (ambiguity) configurationAssignments+=ConfigurationAssignment
	 *     flowAssignments+=FlowAssignment (ambiguity) configurationAssignments+=ConfigurationAssignmentPattern
	 *     flowAssignments+=FlowAssignment (ambiguity) connections+=Connection
	 *     flowAssignments+=FlowAssignment (ambiguity) connections+=FeatureDelegate
	 *     flowAssignments+=FlowAssignment (ambiguity) flowAssignments+=FlowAssignment
	 *     flowAssignments+=FlowAssignment (ambiguity) paths+=Path
	 *     flowAssignments+=FlowAssignment (ambiguity) propertyAssociations+=PropertyAssociation
	 *     paths+=Path (ambiguity) 'end' (rule end)
	 *     paths+=Path (ambiguity) bindings+=Binding
	 *     paths+=Path (ambiguity) components+=Component
	 *     paths+=Path (ambiguity) configurationAssignments+=ConfigurationAssignment
	 *     paths+=Path (ambiguity) configurationAssignments+=ConfigurationAssignmentPattern
	 *     paths+=Path (ambiguity) connections+=Connection
	 *     paths+=Path (ambiguity) connections+=FeatureDelegate
	 *     paths+=Path (ambiguity) flowAssignments+=FlowAssignment
	 *     paths+=Path (ambiguity) paths+=Path
	 *     paths+=Path (ambiguity) propertyAssociations+=PropertyAssociation
	 *     propertyAssociations+=PropertyAssociation (ambiguity) 'end' (rule end)
	 *     propertyAssociations+=PropertyAssociation (ambiguity) bindings+=Binding
	 *     propertyAssociations+=PropertyAssociation (ambiguity) components+=Component
	 *     propertyAssociations+=PropertyAssociation (ambiguity) configurationAssignments+=ConfigurationAssignment
	 *     propertyAssociations+=PropertyAssociation (ambiguity) configurationAssignments+=ConfigurationAssignmentPattern
	 *     propertyAssociations+=PropertyAssociation (ambiguity) connections+=Connection
	 *     propertyAssociations+=PropertyAssociation (ambiguity) connections+=FeatureDelegate
	 *     propertyAssociations+=PropertyAssociation (ambiguity) flowAssignments+=FlowAssignment
	 *     propertyAssociations+=PropertyAssociation (ambiguity) paths+=Path
	 *     propertyAssociations+=PropertyAssociation (ambiguity) propertyAssociations+=PropertyAssociation
	 */
	protected void emit_ImplementationBody_SemicolonKeyword_0_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     alias=ID (ambiguity) (rule end)
	 *     importedNamespace=QualifiedName (ambiguity) (rule end)
	 *     importedNamespace=QualifiedNameWithWildcard (ambiguity) (rule end)
	 */
	protected void emit_Import_SemicolonKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     features+=Feature (ambiguity) 'end' (rule end)
	 *     features+=Feature (ambiguity) 'use' 'properties' useProperties+=[PropertySet|QualifiedName]
	 *     features+=Feature (ambiguity) features+=Feature
	 *     features+=Feature (ambiguity) flows+=FlowPath
	 *     features+=Feature (ambiguity) flows+=FlowSink
	 *     features+=Feature (ambiguity) flows+=FlowSource
	 *     features+=Feature (ambiguity) propertyAssociations+=PropertyAssociation
	 *     flows+=FlowPath (ambiguity) 'end' (rule end)
	 *     flows+=FlowPath (ambiguity) 'use' 'properties' useProperties+=[PropertySet|QualifiedName]
	 *     flows+=FlowPath (ambiguity) features+=Feature
	 *     flows+=FlowPath (ambiguity) flows+=FlowPath
	 *     flows+=FlowPath (ambiguity) flows+=FlowSink
	 *     flows+=FlowPath (ambiguity) flows+=FlowSource
	 *     flows+=FlowPath (ambiguity) propertyAssociations+=PropertyAssociation
	 *     flows+=FlowSink (ambiguity) 'end' (rule end)
	 *     flows+=FlowSink (ambiguity) 'use' 'properties' useProperties+=[PropertySet|QualifiedName]
	 *     flows+=FlowSink (ambiguity) features+=Feature
	 *     flows+=FlowSink (ambiguity) flows+=FlowPath
	 *     flows+=FlowSink (ambiguity) flows+=FlowSink
	 *     flows+=FlowSink (ambiguity) flows+=FlowSource
	 *     flows+=FlowSink (ambiguity) propertyAssociations+=PropertyAssociation
	 *     flows+=FlowSource (ambiguity) 'end' (rule end)
	 *     flows+=FlowSource (ambiguity) 'use' 'properties' useProperties+=[PropertySet|QualifiedName]
	 *     flows+=FlowSource (ambiguity) features+=Feature
	 *     flows+=FlowSource (ambiguity) flows+=FlowPath
	 *     flows+=FlowSource (ambiguity) flows+=FlowSink
	 *     flows+=FlowSource (ambiguity) flows+=FlowSource
	 *     flows+=FlowSource (ambiguity) propertyAssociations+=PropertyAssociation
	 *     propertyAssociations+=PropertyAssociation (ambiguity) 'end' (rule end)
	 *     propertyAssociations+=PropertyAssociation (ambiguity) 'use' 'properties' useProperties+=[PropertySet|QualifiedName]
	 *     propertyAssociations+=PropertyAssociation (ambiguity) features+=Feature
	 *     propertyAssociations+=PropertyAssociation (ambiguity) flows+=FlowPath
	 *     propertyAssociations+=PropertyAssociation (ambiguity) flows+=FlowSink
	 *     propertyAssociations+=PropertyAssociation (ambiguity) flows+=FlowSource
	 *     propertyAssociations+=PropertyAssociation (ambiguity) propertyAssociations+=PropertyAssociation
	 *     useProperties+=[PropertySet|QualifiedName] (ambiguity) 'end' (rule end)
	 *     useProperties+=[PropertySet|QualifiedName] (ambiguity) 'use' 'properties' useProperties+=[PropertySet|QualifiedName]
	 *     useProperties+=[PropertySet|QualifiedName] (ambiguity) features+=Feature
	 *     useProperties+=[PropertySet|QualifiedName] (ambiguity) flows+=FlowPath
	 *     useProperties+=[PropertySet|QualifiedName] (ambiguity) flows+=FlowSink
	 *     useProperties+=[PropertySet|QualifiedName] (ambiguity) flows+=FlowSource
	 *     useProperties+=[PropertySet|QualifiedName] (ambiguity) propertyAssociations+=PropertyAssociation
	 */
	protected void emit_InterfaceBody_SemicolonKeyword_0_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     bindings+=Binding (ambiguity) '}' (rule end)
	 *     bindings+=Binding (ambiguity) bindings+=Binding
	 *     bindings+=Binding (ambiguity) components+=Component
	 *     bindings+=Binding (ambiguity) connections+=Connection
	 *     bindings+=Binding (ambiguity) connections+=FeatureDelegate
	 *     bindings+=Binding (ambiguity) features+=Feature
	 *     bindings+=Binding (ambiguity) propertyAssociations+=PropertyAssociation
	 *     components+=Component (ambiguity) '}' (rule end)
	 *     components+=Component (ambiguity) bindings+=Binding
	 *     components+=Component (ambiguity) components+=Component
	 *     components+=Component (ambiguity) connections+=Connection
	 *     components+=Component (ambiguity) connections+=FeatureDelegate
	 *     components+=Component (ambiguity) features+=Feature
	 *     components+=Component (ambiguity) propertyAssociations+=PropertyAssociation
	 *     connections+=Connection (ambiguity) '}' (rule end)
	 *     connections+=Connection (ambiguity) bindings+=Binding
	 *     connections+=Connection (ambiguity) components+=Component
	 *     connections+=Connection (ambiguity) connections+=Connection
	 *     connections+=Connection (ambiguity) connections+=FeatureDelegate
	 *     connections+=Connection (ambiguity) features+=Feature
	 *     connections+=Connection (ambiguity) propertyAssociations+=PropertyAssociation
	 *     connections+=FeatureDelegate (ambiguity) '}' (rule end)
	 *     connections+=FeatureDelegate (ambiguity) bindings+=Binding
	 *     connections+=FeatureDelegate (ambiguity) components+=Component
	 *     connections+=FeatureDelegate (ambiguity) connections+=Connection
	 *     connections+=FeatureDelegate (ambiguity) connections+=FeatureDelegate
	 *     connections+=FeatureDelegate (ambiguity) features+=Feature
	 *     connections+=FeatureDelegate (ambiguity) propertyAssociations+=PropertyAssociation
	 *     features+=Feature (ambiguity) '}' (rule end)
	 *     features+=Feature (ambiguity) bindings+=Binding
	 *     features+=Feature (ambiguity) components+=Component
	 *     features+=Feature (ambiguity) connections+=Connection
	 *     features+=Feature (ambiguity) connections+=FeatureDelegate
	 *     features+=Feature (ambiguity) features+=Feature
	 *     features+=Feature (ambiguity) propertyAssociations+=PropertyAssociation
	 *     propertyAssociations+=PropertyAssociation (ambiguity) '}' (rule end)
	 *     propertyAssociations+=PropertyAssociation (ambiguity) bindings+=Binding
	 *     propertyAssociations+=PropertyAssociation (ambiguity) components+=Component
	 *     propertyAssociations+=PropertyAssociation (ambiguity) connections+=Connection
	 *     propertyAssociations+=PropertyAssociation (ambiguity) connections+=FeatureDelegate
	 *     propertyAssociations+=PropertyAssociation (ambiguity) features+=Feature
	 *     propertyAssociations+=PropertyAssociation (ambiguity) propertyAssociations+=PropertyAssociation
	 */
	protected void emit_NestedComponentImplementationBlock_SemicolonKeyword_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     propertyAssociations+=PropertyAssociation (ambiguity) '}' ';'? (rule end)
	 *     propertyAssociations+=PropertyAssociation (ambiguity) '}' (rule end)
	 *     propertyAssociations+=PropertyAssociation (ambiguity) propertyAssociations+=PropertyAssociation
	 */
	protected void emit_PropertiesBlock_SemicolonKeyword_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     associationTypes+=AssociationType (ambiguity) (rule end)
	 *     componentCategories+=ComponentCategory (ambiguity) (rule end)
	 *     featureCategories+=FeatureCategory (ambiguity) (rule end)
	 *     forAll?='all' (ambiguity) (rule end)
	 *     type=[Type|QualifiedReference] (ambiguity) (rule end)
	 */
	protected void emit_PropertyDefinition_SemicolonKeyword_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     properties+=[PropertyDefinition|QualifiedName] '}' (ambiguity) (rule end)
	 *     properties+=[PropertyDefinition|QualifiedReference] '}' (ambiguity) (rule end)
	 */
	protected void emit_PropertySet_SemicolonKeyword_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     rootComponents+=Component (ambiguity) 'end' (rule end)
	 *     rootComponents+=Component (ambiguity) rootComponents+=Component
	 */
	protected void emit_Workingset_SemicolonKeyword_5_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
