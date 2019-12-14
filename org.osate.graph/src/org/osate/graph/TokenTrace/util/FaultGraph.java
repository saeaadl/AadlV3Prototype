package org.osate.graph.TokenTrace.util;
import static org.osate.aadlv3.util.AIv3API.containingBehaviorRuleInstance;
import static org.osate.aadlv3.util.AIv3API.containingComponentInstance;
import static org.osate.aadlv3.util.AIv3API.containingComponentInstanceOrSelf;
import static org.osate.aadlv3.util.AIv3API.findActionCIOs;
import static org.osate.aadlv3.util.AIv3API.getAllLeafComponents;
import static org.osate.aadlv3.util.AIv3API.getRealConstraint;
import static org.osate.aadlv3.util.AIv3API.getRealInstanceObject;
import static org.osate.aadlv3.util.AIv3API.getRoot;
import static org.osate.aadlv3.util.AIv3API.isASink;
import static org.osate.graph.TokenTrace.util.TokenTraceUtil.createToken;
import static org.osate.graph.TokenTrace.util.TokenTraceUtil.findSharedEventSubtree;
import static org.osate.graph.TokenTrace.util.TokenTraceUtil.findToken;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.jgrapht.Graph;
import org.jgrapht.graph.AsSubgraph;
import org.jgrapht.graph.EdgeReversedGraph;
import org.osate.aadlv3.aadlv3.Aadlv3Factory;
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
import org.osate.av3instance.av3instance.StateInstance;
import org.osate.graph.TokenTrace.Token;
import org.osate.graph.TokenTrace.TokenTrace;
import org.osate.graph.TokenTrace.TokenTraceFactory;
import org.osate.graph.TokenTrace.TokenTraceType;
import org.osate.graph.TokenTrace.TokenType;
import org.osate.graph.util.AIJGraphTUtil;
import org.osate.graph.util.RefEObjectEdge;

public class FaultGraph {
	TokenTrace eventTrace = null;
	Graph<EObject, RefEObjectEdge> graph = null;
	
	public void generateCauseGraphs(ComponentInstance root, TokenTraceType ttt, String subclauseName) {
		Graph<EObject, RefEObjectEdge> bgraph = AIJGraphTUtil.generateBehaviorPropagationPaths(root,
				subclauseName);
		Graph<EObject, RefEObjectEdge> revgraph = new EdgeReversedGraph<EObject, RefEObjectEdge>(
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

	public TokenTrace generateCauseGraph(Graph<EObject, RefEObjectEdge> graph, InstanceObject graphRoot,
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
	
	public TokenTrace generateCauseTrace(Graph<EObject, RefEObjectEdge> graph, InstanceObject fiRoot, TokenTraceType ttt){
		this.graph = graph;
		eventTrace = TokenTraceFactory.eINSTANCE.createTokenTrace();
		eventTrace.setInstanceRoot(getRoot(fiRoot));
		eventTrace.setTokenTraceType(ttt);
		// add root event
		Token rootToken = processCause(fiRoot);
		eventTrace.setRoot(rootToken);
		Literal lit = inferLiterals(rootToken);
		eventTrace.setInferredRootLiteral(lit);
		rootToken.setTokenLiteral(lit);
		eventTrace.setName( eventTrace.getRoot().getName());
		return eventTrace;
	}

	
	public Token processCause(EObject eo) {
		if (eo instanceof InstanceObject) {
			Token found = findToken(eventTrace, (InstanceObject)eo);
			if (found != null) {
				return found;
			}
		}
		
		Set<RefEObjectEdge> edges = graph.outgoingEdgesOf(eo);
//		if (edges.isEmpty()) {
//			return null;
//		}
		EList<Token> subEvents = new BasicEList<Token>();
		for (RefEObjectEdge edge : edges) {
			EObject edgeTarget = graph.getEdgeTarget(edge);
			Token res = processCause(edgeTarget);
			if (res != null) {
				// incoming CIO has literals and is part of a sink specification
				if (isSinkConstraint(edgeTarget)) {
					// filter out tokens masked by sink
					Token notMasked = sinkFilteredToken(res, edgeTarget);
					if (notMasked != null) {
						subEvents.add(notMasked);
					}
				} else {
					subEvents.add(res);
				}
			}
		}
		return processTokenSubgraph(subEvents, eo);
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
			if (io instanceof GeneratorInstance) {
				if (!((GeneratorInstance) io).getGeneratedLiterals().isEmpty()) {
					Token gentok = createToken(eventTrace, io, null, TokenType.INTERMEDIATE);
					for (ConstrainedInstanceObject glit : ((GeneratorInstance) io).getGeneratedLiterals()) {
						gentok.getTokens().add(createToken(eventTrace, cio, TokenType.BASIC));
					}
					return gentok;
				}
			}
			return createToken(eventTrace, io,constraint, eventType);
		}
	}
	
	
	/**
	 * process logical multi literal expression
	 * @param subtokens
	 * @param mlc
	 * @return
	 */
	public Token processTokenSubgraph(EList<Token> subtokens, EObject eo) {
		if (subtokens.isEmpty()) {
			if (eo instanceof StateInstance) {
				return null;
			}
			if (eo instanceof ConstrainedInstanceObject) {
				ConstrainedInstanceObject cio = (ConstrainedInstanceObject) eo;
				return generateTokens(cio);
			}
			return createToken(eventTrace, (InstanceObject)eo,null, TokenType.BASIC);
		}
		EOperator operator = eo instanceof MultiLiteralConstraint? ((MultiLiteralConstraint)eo).getOperator():EOperator.ANY;
		Token combined = findSharedEventSubtree(eventTrace, subtokens,operator, null);
		if (combined != null) {
			return combined;
		}
//		if (subevents.size() == 1){
//			return subevents.get(0);
//		}
		Token mlcEvent = createToken(eventTrace,null,null,TokenType.INTERMEDIATE);
		mlcEvent.setOperator(operator);
		if (eo instanceof MultiLiteralConstraint) {
			mlcEvent.setK(((MultiLiteralConstraint)eo).getK());
		}
		mlcEvent.getTokens().addAll(subtokens);
		return mlcEvent;
	}
	
	
	// populate intermediate tokens
	
	public Literal inferLiterals(Token current) {
		if (current.getTokenLiteral() == null) {
			SetLiteral result = Aadlv3Factory.eINSTANCE.createSetLiteral();
			EObject currentio = current.getRelatedEObject();
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
			return EcoreUtil.copy(current.getTokenLiteral());
		}
	}
	
	// impact processing
	
	
	public TokenTrace generateEffectGraph(ComponentInstance root, TokenTraceType ttt, String subclauseName) {
		Graph<EObject, RefEObjectEdge> bgraph = AIJGraphTUtil.generateBehaviorPropagationPaths(root, subclauseName);
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
		Graph<EObject, RefEObjectEdge> bgraph = AIJGraphTUtil.generateBehaviorPropagationPaths(root, subclauseName);
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
		Graph<EObject, RefEObjectEdge> bgraph = AIJGraphTUtil.generateBehaviorPropagationPaths(root, subclauseName);
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
		Set<RefEObjectEdge> edges = graph.outgoingEdgesOf(startcio);
		for (RefEObjectEdge edge : edges) {
			EObject nextCioio = graph.getEdgeTarget(edge);
			processNextEffect(startToken, nextCioio);
		}
		return startToken;
	}

	private void processNextEffect(Token step, EObject cioio) {
		InstanceObject target = getRealInstanceObject(cioio);
		Literal constraint = getRealConstraint(cioio);
		if (isSinkConstraint(cioio)) {
			Token nextStep = addNextStep(step, target, step.getTokenLiteral());
			if (nextStep != null) {
				nextStep.setTokenType(TokenType.SINK);
			}
			return;
		}
		EObject outVertex = cioio;
		boolean unhandled = false;
		if (constraint instanceof ECollection) {
			if (constraint.contains(step.getTokenLiteral())) {
				// constraint contains propagated literal
				Token nextStep = addNextStep(step, target, step.getTokenLiteral());
				if (nextStep != null) {
					if (graph.containsVertex(cioio)) {
						Set<RefEObjectEdge> edges = graph.outgoingEdgesOf(cioio);
						for (RefEObjectEdge edge : edges) {
							EObject nextCioio = graph.getEdgeTarget(edge);
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
			constraint = step.getTokenLiteral();
		}
		// do next step
		Token nextStep = addNextStep(step, target, constraint);
		if (nextStep != null) {
			if (unhandled) {
				nextStep.setTokenType(TokenType.UNHANDLED);
			}
			if (graph.containsVertex(outVertex)) {
				Set<RefEObjectEdge> edges = graph.outgoingEdgesOf(outVertex);
				for (RefEObjectEdge edge : edges) {
					EObject nextCioio = graph.getEdgeTarget(edge);
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
	
	
	/**
	 * return token if its literals are not masked.
	 * If the token has no literals then check all subtokens and remove those whose literals are masked by the sink.
	 * Effectively we look for the first set of tokens/subtokens with literals to check.
	 * return null if  
	 * @param tok
	 * @param io
	 * @return
	 */
	private Token sinkFilteredToken(Token tok, EObject io) {
		Literal constraint = getRealConstraint(io);
		if (constraint == null) {
			// all tokens are masked by sink
			return null;
		}
		if (tok.getTokenLiteral() != null) {
			if (constraint.contains(tok.getTokenLiteral())) {
				return null;
			} else {
				return tok;
			}
		} else {
			// filter out sub tokens
			List<Token> toKeep = new ArrayList<Token>();
			for (Token subtok : tok.getTokens()) {
				Token res = sinkFilteredToken(subtok, io);
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
		return tok;
	}
	
	private boolean isSinkConstraint(EObject cio) {
		BehaviorRuleInstance bri = containingBehaviorRuleInstance(cio);
		return bri != null && bri.isSink();
	}
	
	private void setLeafTokensType() {
		for (Token t: eventTrace.getTokens()) {
			if (t.getTokens().isEmpty() && t.getTokenType() == TokenType.INTERMEDIATE) {
				if (containingComponentInstanceOrSelf(t.getRelatedEObject()) == eventTrace.getInstanceRoot()) {
					t.setTokenType(TokenType.EXTERNAL);
				} else if (t.getTokenType() != TokenType.COMPONENT && t.getTokenType() != TokenType.SYSTEM ) {
					if(t.getRelatedEObject() instanceof FeatureInstance || t.getRelatedEObject() instanceof ComponentInstance) {
						t.setTokenType(TokenType.UNDEVELOPED);
					} else {
						t.setTokenType(TokenType.BASIC);
					}
				}
			}
		}
	}
	
// effects as subgraph	
	
	public Set<EObject> generateEffectSubGraph(Graph<EObject, RefEObjectEdge> bgraph) {
		this.graph = bgraph;
		Set<EObject> vsubset = new HashSet<EObject>();
		Set<EObject> vset = bgraph.vertexSet();
		for (EObject vertex : vset) {
			if (vertex instanceof GeneratorInstance) {
				vsubset.add(vertex);
			}
		}
		return vsubset;
	}
	
//	DepthFirstIterator<V,E>
	
	
	// effects as subgraph
	
	public Graph <EObject, RefEObjectEdge> generateEffectsSubgraph(Graph <EObject, RefEObjectEdge> bgraph, InstanceObject startio) {
		Set<EObject> effectvset = generateEffectVertices(bgraph, startio);
		AsSubgraph<EObject, RefEObjectEdge> subgraph = new AsSubgraph<EObject, RefEObjectEdge>(bgraph,effectvset);
        return subgraph;
	}
	
	
	public Set<EObject> generateEffectVertices(Graph<EObject, RefEObjectEdge> bgraph, InstanceObject startio) {
		Set<EObject> vsubset = new HashSet<EObject>();
		vsubset.add(startio);
		Set<RefEObjectEdge> edges = graph.outgoingEdgesOf(startio);
		for (RefEObjectEdge edge : edges) {
			EObject nextCioio = graph.getEdgeTarget(edge);
			processNextEffect(vsubset, nextCioio,getRealConstraint(startio));
		}
		return vsubset;
	}

	// deal with the cioio
	private void processNextEffect(Set<EObject> vsubset, EObject cioio, Literal effect) {
		InstanceObject target = getRealInstanceObject(cioio);
		Literal constraint = getRealConstraint(cioio);
		if (isSinkConstraint(cioio)) {
			vsubset.add(cioio);
			return;
		}
		EObject outVertex = cioio;
		Literal outEffect = effect;
		if (constraint != null && cioio instanceof ConstrainedInstanceObject && cioio.eContainer() instanceof ComponentInstance) {
			outEffect = constraint;
		}
		if (constraint instanceof ECollection) {
			if (constraint.contains(effect)) {
				// constraint contains propagated literal
				if (vsubset.add(cioio)) {
					if (graph.containsVertex(cioio)) {
						Set<RefEObjectEdge> edges = graph.outgoingEdgesOf(cioio);
						for (RefEObjectEdge edge : edges) {
							EObject nextCioio = graph.getEdgeTarget(edge);
							processNextEffect(vsubset, nextCioio, outEffect); 
						}
					}
				}
				return;
			} else {
				outVertex = target;
			}
		}
		// we have either cioio as instance object, or as Constrained IO with a single literal or no literal
		// do next step
		if (vsubset.add(cioio)) {
			if (graph.containsVertex(outVertex)) {
				Set<RefEObjectEdge> edges = graph.outgoingEdgesOf(outVertex);
				for (RefEObjectEdge edge : edges) {
					EObject nextCioio = graph.getEdgeTarget(edge);
					processNextEffect(vsubset, nextCioio, outEffect);
				}
			}
		}
		return ;
	}

}
