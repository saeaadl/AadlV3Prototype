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
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.osate.xtext.aadlv3.services.AadlV3GrammarAccess;

@SuppressWarnings("all")
public class AadlV3SyntacticSequencer extends AbstractSyntacticSequencer {

	protected AadlV3GrammarAccess grammarAccess;
	protected AbstractElementAlias match_Declarations_SemicolonKeyword_2_q;
	protected AbstractElementAlias match_NamedElementRef___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q;
	protected AbstractElementAlias match_PrimaryExpression_LeftParenthesisKeyword_4_0_a;
	protected AbstractElementAlias match_PrimaryExpression_LeftParenthesisKeyword_4_0_p;
	protected AbstractElementAlias match_SelectExpression___LeftParenthesisKeyword_1_0_3_0_RightParenthesisKeyword_1_0_3_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AadlV3GrammarAccess) access;
		match_Declarations_SemicolonKeyword_2_q = new TokenAlias(false, true, grammarAccess.getDeclarationsAccess().getSemicolonKeyword_2());
		match_NamedElementRef___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getNamedElementRefAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getNamedElementRefAccess().getRightParenthesisKeyword_2_2()));
		match_PrimaryExpression_LeftParenthesisKeyword_4_0_a = new TokenAlias(true, true, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_0());
		match_PrimaryExpression_LeftParenthesisKeyword_4_0_p = new TokenAlias(true, false, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_0());
		match_SelectExpression___LeftParenthesisKeyword_1_0_3_0_RightParenthesisKeyword_1_0_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSelectExpressionAccess().getLeftParenthesisKeyword_1_0_3_0()), new TokenAlias(false, false, grammarAccess.getSelectExpressionAccess().getRightParenthesisKeyword_1_0_3_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Declarations_SemicolonKeyword_2_q.equals(syntax))
				emit_Declarations_SemicolonKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NamedElementRef___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q.equals(syntax))
				emit_NamedElementRef___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PrimaryExpression_LeftParenthesisKeyword_4_0_a.equals(syntax))
				emit_PrimaryExpression_LeftParenthesisKeyword_4_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PrimaryExpression_LeftParenthesisKeyword_4_0_p.equals(syntax))
				emit_PrimaryExpression_LeftParenthesisKeyword_4_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SelectExpression___LeftParenthesisKeyword_1_0_3_0_RightParenthesisKeyword_1_0_3_2__q.equals(syntax))
				emit_SelectExpression___LeftParenthesisKeyword_1_0_3_0_RightParenthesisKeyword_1_0_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     decls+=EDeclaration (ambiguity) (rule end)
	 */
	protected void emit_Declarations_SemicolonKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     ref=[NamedElement|QCREF] (ambiguity) (rule end)
	 */
	protected void emit_NamedElementRef___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '[' minimum=Expression
	 *     (rule start) (ambiguity) 'bag' '(' ')' (rule start)
	 *     (rule start) (ambiguity) 'bag' '(' elements+=Expression
	 *     (rule start) (ambiguity) 'false' (rule start)
	 *     (rule start) (ambiguity) 'if' if=Expression
	 *     (rule start) (ambiguity) 'list' '(' ')' (rule start)
	 *     (rule start) (ambiguity) 'list' '(' elements+=Expression
	 *     (rule start) (ambiguity) 'map' (rule start)
	 *     (rule start) (ambiguity) 'record' '(' ')' (rule start)
	 *     (rule start) (ambiguity) 'record' '(' fieldValues+=FieldValue
	 *     (rule start) (ambiguity) 'set' '(' ')' (rule start)
	 *     (rule start) (ambiguity) 'set' '(' elements+=Expression
	 *     (rule start) (ambiguity) 'tuple' '(' ')' (rule start)
	 *     (rule start) (ambiguity) 'tuple' '(' elements+=Expression
	 *     (rule start) (ambiguity) 'union' '(' fieldValue=FieldValue
	 *     (rule start) (ambiguity) '{' decls+=VarDecl
	 *     (rule start) (ambiguity) '{' result=Expression
	 *     (rule start) (ambiguity) core?='^'
	 *     (rule start) (ambiguity) operator=OpUnary
	 *     (rule start) (ambiguity) ref=[NamedElement|QCREF]
	 *     (rule start) (ambiguity) value=INTEGER_LIT
	 *     (rule start) (ambiguity) value=NoQuoteString
	 *     (rule start) (ambiguity) value=REAL_LIT
	 *     (rule start) (ambiguity) value?='true'
	 *     (rule start) (ambiguity) {BinaryOperation.left=}
	 *     (rule start) (ambiguity) {PropertyExpression.modelElement=}
	 *     (rule start) (ambiguity) {Selection.receiver=}
	 *     (rule start) (ambiguity) {UnitExpression.expression=}
	 */
	protected void emit_PrimaryExpression_LeftParenthesisKeyword_4_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '{' decls+=VarDecl
	 *     (rule start) (ambiguity) '{' result=Expression
	 *     (rule start) (ambiguity) operator=OpUnary
	 *     (rule start) (ambiguity) {BinaryOperation.left=}
	 *     (rule start) (ambiguity) {PropertyExpression.modelElement=}
	 *     (rule start) (ambiguity) {Selection.receiver=}
	 *     (rule start) (ambiguity) {UnitExpression.expression=}
	 */
	protected void emit_PrimaryExpression_LeftParenthesisKeyword_4_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     ref=[NamedElement|QCREF] (ambiguity) ')' (rule end)
	 */
	protected void emit_SelectExpression___LeftParenthesisKeyword_1_0_3_0_RightParenthesisKeyword_1_0_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
