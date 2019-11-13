package org.osate.graph.TokenTrace.util;
import static org.osate.aadlv3.util.AIv3API.*;
import static org.osate.graph.TokenTrace.util.TokenTraceUtil.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.EdgeReversedGraph;
import org.osate.aadlv3.aadlv3.Aadlv3Factory;
import org.osate.aadlv3.aadlv3.ConditionOperation;
import org.osate.aadlv3.aadlv3.ECollection;
import org.osate.aadlv3.aadlv3.EOperator;
import org.osate.aadlv3.aadlv3.Expression;
import org.osate.aadlv3.aadlv3.Literal;
import org.osate.aadlv3.aadlv3.MultiLiteralConstraint;
import org.osate.aadlv3.aadlv3.SetLiteral;
import org.osate.av3instance.av3instance.BehaviorRuleInstance;
import org.osate.av3instance.av3instance.ComponentInstance;
import org.osate.av3instance.av3instance.ConstrainedInstanceObject;
import org.osate.av3instance.av3instance.FeatureInstance;
import org.osate.av3instance.av3instance.GeneratorInstance;
import org.osate.av3instance.av3instance.InstanceObject;
import org.osate.av3instance.av3instance.SinkInstance;
import org.osate.av3instance.av3instance.StateInstance;
import org.osate.graph.TokenTrace.TokenType;
import org.osate.graph.TokenTrace.Token;
import org.osate.graph.TokenTrace.TokenTrace;
import org.osate.graph.TokenTrace.TokenTraceFactory;
import org.osate.graph.TokenTrace.TokenTraceType;
import org.osate.graph.util.AIJGraphTUtil;

public class FaultGraph {
	TokenTrace eventTrace = null;
	Graph<InstanceObject, DefaultEdge> graph = null;
	
	public void generateCauseGraphs(ComponentInstance root, TokenTraceType ttt, String subclauseName) {
		DefaultDirectedGraph<InstanceObject, DefaultEdge> bgraph = AIJGraphTUtil.generateBehaviorPropagationPaths(root,
				subclauseName);
		EdgeReversedGraph<InstanceObject, DefaultEdge> revgraph = new EdgeReversedGraph<InstanceObject, DefaultEdge>(
				bgraph);

		for (FeatureInstance fi : root.getFeatures()) {
			Collection<ConstrainedInstanceObject> cios = findActionCIOs(fi);
			if (cios.isEmpty()) {
				TokenTrace eTrace = generateCauseGraph(revgraph,fi, ttt);
				save(eTrace);
			} else {
				for (ConstrainedInstanceObject eroot: findActionCIOs(fi)) {
					TokenTrace eTrace = generateCauseGraph(revgraph,eroot, ttt);
					save(eTrace);
				}
			}
		}
	}

	public TokenTrace generateCauseGraph(Graph<InstanceObject, DefaultEdge> graph, InstanceObject graphRoot,
			 TokenTraceType ttt) {
		TokenTrace eTrace = generateCauseTrace(graph, graphRoot, ttt);
		TokenTraceOptimization tto = new TokenTraceOptimization();
		tto.optimizeTokenTrace(eTrace);
		TokenTraceUtil.fillProbabilities(eTrace);
		TokenTraceUtil.computeProbabilities(eTrace.getRoot());
		return eTrace;
	}
	
	public void save(TokenTrace eTrace) {
		String rootname = eTrace.getName()
				+ (eTrace.getTokenTraceType().equals(TokenTraceType.MINIMAL_CUT_SET) ? "_cutset"
						: (eTrace.getTokenTraceType().equals(TokenTraceType.TOKEN_TRACE) ? "_trace"
								: (eTrace.getTokenTraceType().equals(TokenTraceType.COMPOSITE_PARTS) ? "_parts"
										: "_tree")));
		URI ftaURI = EcoreUtil.getURI(eTrace.getInstanceRoot()).trimFragment().trimFileExtension().trimSegments(1)
				.appendSegment("reports").appendSegment("TokenTraces").appendSegment(rootname).appendFileExtension("tt");
		Resource res = eTrace.getInstanceRoot().eResource().getResourceSet().getResource(ftaURI, false);
		if (res == null) {
			res = eTrace.getInstanceRoot().eResource().getResourceSet().createResource(ftaURI);
		}
		res.getContents().clear();
		res.getContents().add(eTrace);
		try {
			res.save(null);
		} catch (IOException e) {
		}

	}
	
	public TokenTrace generateCauseTrace(Graph<InstanceObject, DefaultEdge> graph, InstanceObject fiRoot, TokenTraceType ttt){
		this.graph = graph;
		eventTrace = TokenTraceFactory.eINSTANCE.createTokenTrace();
		eventTrace.setInstanceRoot(getRoot(fiRoot));
		eventTrace.setTokenTraceType(ttt);
		// add root event
		Token rootToken = processOutgoingCIO(fiRoot);
		eventTrace.setRoot(rootToken);
		Literal lit = inferLiterals(rootToken);
		eventTrace.setInferredRootLiteral(lit);
		rootToken.setRelatedLiteral(lit);
		eventTrace.setName( eventTrace.getRoot().getName());
		return eventTrace;
	}

	public Token processOutgoingCIO(InstanceObject cioio){
		// outcio is an action in one or more bri
		// we need to have an event for the outcio and a separate subevent for each bri action
		Token found = findToken(eventTrace, cioio);
		if (found != null) {
			return found;
		}
		
		Token outcioEvent = createToken(eventTrace, cioio, TokenType.INTERMEDIATE);
		Iterable<BehaviorRuleInstance> bris = findMatchingBehaviorRuleInstances(cioio);
		for (BehaviorRuleInstance bri : bris) {
			Token condEvent = processCondition(bri.getCondition(),cioio);
			Token stateEvent = bri.getCurrentState() != null?processState(bri.getCurrentState()):null;
			if (condEvent != null&& stateEvent != null){
				EList<Token> subEvents = new BasicEList<Token>();
				subEvents.add(stateEvent);
				subEvents.add(condEvent);
				outcioEvent.getTokens().add( processEventSubgraph(subEvents, EOperator.ALL, null));
			} else if (condEvent == null&& stateEvent != null){
				outcioEvent.getTokens().add( stateEvent);
			} else if (condEvent == null&& stateEvent == null){
					outcioEvent.setTokenType(TokenType.UNDEVELOPED);
			} else if (condEvent != null&& stateEvent == null){
					outcioEvent.getTokens().add(condEvent);
			}
		}
		// now we look for edges that represent implicit flows not modeled by bris
		if (!(cioio instanceof ConstrainedInstanceObject)&&graph.containsVertex(cioio)) {
			Set<DefaultEdge> edges = graph.outgoingEdgesOf(cioio);
			for (DefaultEdge edge : edges) {
				InstanceObject edgeTarget = graph.getEdgeTarget(edge);
				InstanceObject target = getRealInstanceObject(edgeTarget);
				if (target instanceof FeatureInstance || target instanceof ComponentInstance) {
					// process incoming
					outcioEvent.getTokens().add(processIncomingCIO(edgeTarget));
				}
			}
		}
		// XXX set type if not already set to handle propagated types
		return outcioEvent;
	}
	
	public Token stateTransition(InstanceObject targetState) {
		BehaviorRuleInstance bri = containingBehaviorRuleInstance(targetState);
		Token condEvent = processCondition(bri.getCondition(),targetState);
		Token stateEvent = bri.getCurrentState() != null ? processState(bri.getCurrentState()) : null;
		if (condEvent != null && stateEvent != null) {
			EList<Token> subEvents = new BasicEList<Token>();
			subEvents.add(stateEvent);
			subEvents.add(condEvent);
			return processEventSubgraph(subEvents, EOperator.ALL, null);
		}
		if (condEvent == null && stateEvent != null) {
			return stateEvent;
		}
		if (condEvent != null && stateEvent == null) {
			return condEvent;
		}
		return null;
	}
	
	public Token processState(ConstrainedInstanceObject currentState){
		Set<DefaultEdge> targetStates = graph.outgoingEdgesOf(currentState);
		EList<Token> subEvents = new BasicEList<Token>();
		for (DefaultEdge targetStateEdge: targetStates){
			InstanceObject ts = graph.getEdgeTarget(targetStateEdge);
			Token transEvent = stateTransition(ts);
			if (transEvent != null) {
				Token tsToken = createToken(eventTrace, ts, TokenType.INTERMEDIATE);
				tsToken.getTokens().add(transEvent);
				subEvents.add(tsToken);
			}
		}
		if (subEvents.isEmpty()) {
			return null;
		}
		Token combined = processEventSubgraph(subEvents, EOperator.ANY, currentState.getInstanceObject());  // incoming
		return combined;
	}
	
	public Token processCondition(Literal cond, InstanceObject io){
		if (cond instanceof MultiLiteralConstraint){
			EList<Token> subEvents = new BasicEList<Token>();
			for (Expression el : ((MultiLiteralConstraint) cond).getElements()) {
				if (el instanceof Literal) {
					Literal literal = (Literal) el;
					Token res = processCondition(literal, io);
					if (res != null) {
						subEvents.add(res);
					}
				}
			}
			Token combined = processEventSubgraph(subEvents, (MultiLiteralConstraint) cond);
			return combined;
		} else if (cond instanceof ConstrainedInstanceObject) {
			ConstrainedInstanceObject cio = (ConstrainedInstanceObject) cond;
			// an incoming or generator
			if (cio.getInstanceObject() instanceof GeneratorInstance) {
				// generator
				return generateTokens((GeneratorInstance)cio.getInstanceObject(), cio.getConstraint());
			} else {
				// incoming cio
				return processIncomingCIO(cio);
			}
		} else {
			return null;
		}
	
	}
	
	public Token processIncomingCIO(InstanceObject cioio) {
		// incoming cio
		Set<DefaultEdge> edges = graph.outgoingEdgesOf(cioio);
		if (edges.isEmpty()){
			return generateTokens(cioio);
		} else {
			// process outgoing
			EList<Token> subEvents = new BasicEList<Token>();
			for (DefaultEdge edge : edges) {
				InstanceObject target = graph.getEdgeTarget(edge);
				Token res = processOutgoingCIO(target);
				if (res != null) {
					if (cioio instanceof ConstrainedInstanceObject) {
						Token masked = isSinkFiltered(res, cioio);
						if (masked != null) {
							subEvents.add(masked);
						}
					} else {
						Collection<ConstrainedInstanceObject> sinkcios = findSinkCIOs(cioio, null, "EM");
						if (sinkcios.isEmpty()) {
							subEvents.add(res);
						} else {
							for (ConstrainedInstanceObject sinkcio : sinkcios) {
								Token masked = isSinkFiltered(res, sinkcio);
								if (masked != null) {
									subEvents.add(masked);
								}
							}
						}
					}
				}
			}
			Token combined = processEventSubgraph(subEvents, EOperator.ANY, cioio);  // incoming
			return combined;
		}
	}
	
	
	/**
	 * generate collection of events one for each type in constraint
	 * @param cio
	 * @return
	 */
	public Token generateTokens(GeneratorInstance io, Literal constraint) {
		if (constraint == null) {
				if (((GeneratorInstance)io).getGeneratedLiterals() != null) {
					Token gentok = createToken(eventTrace, io,null, TokenType.INTERMEDIATE);
					for (ConstrainedInstanceObject cio : io.getGeneratedLiterals()) {
						gentok.getTokens().add(createToken(eventTrace, cio, TokenType.BASIC));
					}
					return gentok;
				} else {
					return createToken(eventTrace, io,null, TokenType.BASIC);
				}
		} else if (constraint instanceof ECollection) {
			// one sub event for each type in the constraint
			ECollection types = (ECollection)constraint;
			Token inEvent = createToken(eventTrace, io, null, TokenType.INTERMEDIATE);
			for (Expression el : types.getElements()) {
				if (el instanceof Literal) {
					Literal tr = (Literal) el;
					inEvent.getTokens().add(createToken(eventTrace, io, tr, TokenType.BASIC));
				}
			}
			return inEvent;
		} else {
			return createToken(eventTrace, io,constraint, TokenType.BASIC);
		}
	}
	
	public Token generateTokens(StateInstance io, Literal constraint) {
		TokenType eventType =  TokenType.BASIC ;
		if (constraint instanceof ECollection) {
			// one sub event for each type in the constraint
			ECollection types = (ECollection)constraint;
			Token inEvent = createToken(eventTrace, io, null, TokenType.INTERMEDIATE);
			for (Expression el : types.getElements()) {
				if (el instanceof Literal) {
					Literal tr = (Literal) el;
					inEvent.getTokens().add(createToken(eventTrace, io, tr, eventType));
				}
			}
			return inEvent;
		} else {
			return createToken(eventTrace, io,constraint, eventType);
		}
	}
	
	public Token generateTokens(InstanceObject cio) {
		TokenType eventType =  TokenType.BASIC ;
		InstanceObject io = getRealInstanceObject(cio);
		Literal constraint = getRealConstraint(cio);
		if (constraint instanceof ECollection) {
			// one sub event for each type in the constraint
			ECollection types = (ECollection)constraint;
			Token inEvent = createToken(eventTrace, io, null, TokenType.INTERMEDIATE);
			for (Expression el : types.getElements()) {
				if (el instanceof Literal) {
					Literal tr = (Literal) el;
					inEvent.getTokens().add(createToken(eventTrace, io, tr, eventType));
				}
			}
			return inEvent;
		} else {
			return createToken(eventTrace, io,constraint, eventType);
		}
	}
	
	public Token processEventSubgraph(EList<Token> subevents, EOperator optype, InstanceObject io) {
		Token combined = findSharedEventSubtree(eventTrace, subevents, optype, io);
		if (combined != null) {
			return combined;
		}
//		if (subevents.size() == 1){
//			return subevents.get(0);
//		}
		Token mlcEvent = createToken(eventTrace,io,TokenType.INTERMEDIATE);
		mlcEvent.setOperator(optype);
		mlcEvent.getTokens().addAll(subevents);
		return mlcEvent;
	}
	
	/**
	 * process logical multi literal expression
	 * @param subevents
	 * @param mlc
	 * @return
	 */
	public Token processEventSubgraph(EList<Token> subevents, MultiLiteralConstraint mlc) {
		Token combined = findSharedEventSubtree(eventTrace, subevents, mlc.getOperator(), null);
		if (combined != null) {
			return combined;
		}
//		if (subevents.size() == 1){
//			return subevents.get(0);
//		}
		Token mlcEvent = createToken(eventTrace,null,null,TokenType.INTERMEDIATE);
		mlcEvent.setOperator(mlc.getOperator());
		mlcEvent.setK(mlc.getK());
		mlcEvent.getTokens().addAll(subevents);
		return mlcEvent;
	}
	
	
	// populate intermediate tokens
	
	public Literal inferLiterals(Token current) {
		if (current.getRelatedLiteral() == null) {
			SetLiteral result = Aadlv3Factory.eINSTANCE.createSetLiteral();
			InstanceObject currentio = current.getRelatedInstanceObject();
			for (Token subt : current.getTokens()) {
				Literal res = inferLiterals(subt);
				if (res != null) {
					if (res instanceof ECollection) {
						for (Expression lit : ((ECollection)res).getElements()) {
							if (!isASink(currentio,(Literal)lit)) {
								result.add(EcoreUtil.copy(lit));
							} else {
								current.getLiteralSink().add((Literal)EcoreUtil.copy(lit));
							}
						}
					} else {
						if (!isASink(currentio,res)) {
							result.add(res);
						} else {
							current.getLiteralSink().add(EcoreUtil.copy(res));
						}
					}
				}
			}
			return result;
		} else {
			return EcoreUtil.copy(current.getRelatedLiteral());
		}
	}
	
	// impact processing
	
	
	public TokenTrace generateEffectGraph(ComponentInstance root, TokenTraceType ttt, String subclauseName) {
		DefaultDirectedGraph<InstanceObject, DefaultEdge> bgraph = AIJGraphTUtil.generateBehaviorPropagationPaths(root, subclauseName);
		this.graph = bgraph;
		eventTrace = TokenTraceFactory.eINSTANCE.createTokenTrace();
		eventTrace.setInstanceRoot(root);
		eventTrace.setTokenTraceType(ttt);
		Token rootToken = createToken(eventTrace, root, TokenType.SYSTEM);
		Iterable<ComponentInstance> cis = getAllLeafComponents(root);
		for (ComponentInstance ci : cis) {
			Token ciToken = createToken(eventTrace, ci, TokenType.COMPONENT);
			rootToken.getTokens().add(ciToken);
			for ( GeneratorInstance gi : ci.getGenerators()) {
				Token gtoken = processGeneratorEffects( gi);
				ciToken.getTokens().add(gtoken);
			}
		}
		setLeafTokensType();
		eventTrace.setRoot(rootToken);
		eventTrace.setName( eventTrace.getRoot().getName()+"_Effects");
		return eventTrace;
	}
	
	
	public TokenTrace generateEffectTrace(GeneratorInstance gi, TokenTraceType ttt, String subclauseName) {
		ComponentInstance root = getRoot(gi);
		ComponentInstance ci = containingComponentInstance(gi);
		DefaultDirectedGraph<InstanceObject, DefaultEdge> bgraph = AIJGraphTUtil.generateBehaviorPropagationPaths(root, subclauseName);
		this.graph = bgraph;
		eventTrace = TokenTraceFactory.eINSTANCE.createTokenTrace();
		eventTrace.setInstanceRoot(root);
		eventTrace.setTokenTraceType(ttt);
		Token ciToken = createToken(eventTrace, ci, TokenType.COMPONENT);
		Token gtoken = processGeneratorEffects( gi);
		ciToken.getTokens().add(gtoken);
		setLeafTokensType();
		eventTrace.setRoot(ciToken);
		eventTrace.setName( eventTrace.getRoot().getName()+"_Effects");
		return eventTrace;
	}

	
	public TokenTrace generateEffectTrace(ConstrainedInstanceObject startcio, TokenTraceType ttt, String subclauseName) {
		ComponentInstance root = getRoot(startcio);
		DefaultDirectedGraph<InstanceObject, DefaultEdge> bgraph = AIJGraphTUtil.generateBehaviorPropagationPaths(root, subclauseName);
		this.graph = bgraph;
		eventTrace = TokenTraceFactory.eINSTANCE.createTokenTrace();
		eventTrace.setInstanceRoot(root);
		eventTrace.setTokenTraceType(ttt);
		Token startToken = processEffects(startcio);
		setLeafTokensType();
		eventTrace.setRoot(startToken);
		eventTrace.setName( eventTrace.getRoot().getName()+"_Effects");
		return eventTrace;
	}


	private Token processGeneratorEffects( GeneratorInstance gi) {
		if (!gi.getGeneratedLiterals().isEmpty()) {
			Token startToken = createToken(eventTrace, gi, TokenType.INTERMEDIATE);
			for (ConstrainedInstanceObject cio : gi.getGeneratedLiterals()) {
				startToken.getTokens().add(processEffects(cio));
			}
			return startToken;
		} else {
			Token startToken = createToken(eventTrace, gi, TokenType.INTERMEDIATE);
			startToken.getTokens().add(processEffects(gi));
			return startToken;
		}
	}
	
	private Token processEffects(InstanceObject startcio) {
		Token startToken = createToken(eventTrace, startcio, TokenType.INTERMEDIATE);
		Set<DefaultEdge> edges = graph.outgoingEdgesOf(startcio);
		for (DefaultEdge edge : edges) {
			InstanceObject nextCioio = graph.getEdgeTarget(edge);
			processNextEffect(startToken, nextCioio);
		}
		return startToken;
	}

	private void processNextEffect(Token step, InstanceObject cioio) {
		InstanceObject target = getRealInstanceObject(cioio);
		Literal constraint = getRealConstraint(cioio);
		if (isSinkConstraint(cioio)) {
			Token nextStep = addNextStep(step, target, step.getRelatedLiteral());
			if (nextStep != null) {
				nextStep.setTokenType(TokenType.SINK);
			}
			return;
		}
		InstanceObject outVertex = cioio;
		boolean unhandled = false;
		if (constraint instanceof ECollection) {
			if (constraint.contains(step.getRelatedLiteral())) {
				// constraint contains propagated literal
				Token nextStep = addNextStep(step, target, step.getRelatedLiteral());
				if (nextStep != null) {
					if (graph.containsVertex(cioio)) {
						Set<DefaultEdge> edges = graph.outgoingEdgesOf(cioio);
						for (DefaultEdge edge : edges) {
							InstanceObject nextCioio = graph.getEdgeTarget(edge);
							processNextEffect(nextStep, nextCioio);
						}
					}
				}
				return;
			} else {
				outVertex = target;
				unhandled = true;
			}
		}
		// we have either cioio as instance object, or as Constrained IO with a single literal or no literal
		if (constraint == null|| constraint instanceof ECollection) {
			// use previous literal if cioio does not set a single literal
			constraint = step.getRelatedLiteral();
		}
		// do next step
		Token nextStep = addNextStep(step, target, constraint);
		if (nextStep != null) {
			if (unhandled) {
				nextStep.setTokenType(TokenType.UNHANDLED);
			}
			if (graph.containsVertex(outVertex)) {
				Set<DefaultEdge> edges = graph.outgoingEdgesOf(outVertex);
				for (DefaultEdge edge : edges) {
					InstanceObject nextCioio = graph.getEdgeTarget(edge);
					processNextEffect(nextStep, nextCioio);
				}
			}
		}
		return ;
	}

	private Token addNextStep(Token parent, InstanceObject io, Literal lit) {
		if (findToken(parent.getTokens(), io, lit) == null) {
			Token nextToken = findToken(eventTrace, io, lit);
			if (nextToken == parent) {
				return parent;
			}
			if (nextToken == null){
				nextToken = createToken(eventTrace, io, lit, TokenType.INTERMEDIATE);
			}
			parent.getTokens().add( nextToken);
			return nextToken;
		}
		return null;
	}
	
	
	private Token isSinkFiltered(Token tok, InstanceObject io) {
		if (isSinkConstraint(io)) {
			Literal constraint = getRealConstraint(io);
			if (constraint == null) {
				return null;
			}
			if (tok.getRelatedLiteral() != null) {
				if (constraint.contains(tok.getRelatedLiteral())) {
					return null;
				} else {
					return tok;
				}
			} else {
				// filter out sub tokens
				List<Token> toKeep = new ArrayList<Token>();
				for (Token subtok : tok.getTokens()) {
					Token res = isSinkFiltered(subtok, io);
					if (res != null) {
						toKeep.add(res);
					}
				}
				tok.getTokens().clear();
				tok.getTokens().addAll(toKeep);
				if (tok.getTokens().isEmpty()) {
					return null;
				}
		}
		}
		return tok;
	}
	
	private boolean isSinkConstraint(InstanceObject cio) {
		BehaviorRuleInstance bri = containingBehaviorRuleInstance(cio);
		return bri != null && bri.isSink();
	}
	
	private void setLeafTokensType() {
		for (Token t: eventTrace.getTokens()) {
			if (t.getTokens().isEmpty() && t.getTokenType() == TokenType.INTERMEDIATE) {
				if (containingComponentInstanceOrSelf(t.getRelatedInstanceObject()) == eventTrace.getInstanceRoot()) {
					t.setTokenType(TokenType.EXTERNAL);
				} else if (t.getTokenType() != TokenType.COMPONENT && t.getTokenType() != TokenType.SYSTEM ) {
					if(t.getRelatedInstanceObject() instanceof FeatureInstance || t.getRelatedInstanceObject() instanceof ComponentInstance) {
						t.setTokenType(TokenType.UNDEVELOPED);
					} else {
						t.setTokenType(TokenType.BASIC);
					}
				}
			}
		}
	}

}
