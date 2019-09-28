package org.osate.graph.TokenTrace.util;
import static org.osate.aadlv3.util.AIv3API.*;
import static org.osate.graph.TokenTrace.util.TokenTraceUtil.*;

import java.io.IOException;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.EdgeReversedGraph;
import org.osate.aadlv3.aadlv3.ECollection;
import org.osate.aadlv3.aadlv3.EOperator;
import org.osate.aadlv3.aadlv3.Expression;
import org.osate.aadlv3.aadlv3.Literal;
import org.osate.aadlv3.aadlv3.MultiLiteralConstraint;
import org.osate.aadlv3.aadlv3.TypeReference;
import org.osate.av3instance.av3instance.BehaviorRuleInstance;
import org.osate.av3instance.av3instance.ComponentInstance;
import org.osate.av3instance.av3instance.ConstrainedInstanceObject;
import org.osate.av3instance.av3instance.FeatureInstance;
import org.osate.av3instance.av3instance.GeneratorInstance;
import org.osate.av3instance.av3instance.InstanceObject;
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
	
	public void generateCauseGraph(ComponentInstance root) {
		DefaultDirectedGraph<InstanceObject, DefaultEdge> bgraph = AIJGraphTUtil.generateBehaviorPropagationPaths(root,
				"EM");
		EdgeReversedGraph<InstanceObject, DefaultEdge> revgraph = new EdgeReversedGraph<InstanceObject, DefaultEdge>(
				bgraph);

		for (FeatureInstance fi : root.getFeatures()) {
			for (ConstrainedInstanceObject eroot: findActionCIOs(fi)) {
				TokenTrace eTrace = generateEventTrace(revgraph, root, eroot);
				TokenTraceOptimization tto = new TokenTraceOptimization(eTrace);
				tto.optimizeFaultTrace(TokenTraceType.TOKEN_TRACE);
				TokenTraceUtil.fillProbabilities(eTrace);
				TokenTraceUtil.computeProbabilities(eTrace.getRoot());

				String rootname = eTrace.getName()
						+ (eTrace.getTokenTraceType().equals(TokenTraceType.MINIMAL_CUT_SET) ? "_cutset"
								: (eTrace.getTokenTraceType().equals(TokenTraceType.TOKEN_TRACE) ? "_trace"
										: (eTrace.getTokenTraceType().equals(TokenTraceType.COMPOSITE_PARTS) ? "_parts"
												: "_tree")));
				URI ftaURI = EcoreUtil.getURI(eTrace.getInstanceRoot()).trimFragment().trimFileExtension().trimSegments(1)
						.appendSegment("reports").appendSegment("fta").appendSegment(rootname).appendFileExtension("tt");
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
		}
	}			
	
	public TokenTrace generateEventTrace(Graph<InstanceObject, DefaultEdge> graph, ComponentInstance root, ConstrainedInstanceObject eRoot){
		this.graph = graph;
		eventTrace = TokenTraceFactory.eINSTANCE.createTokenTrace();
		eventTrace.setInstanceRoot(root);
		eventTrace.setTokenTraceType(TokenTraceType.TOKEN_TRACE);
		// add root event
		eventTrace.setRoot(processOutgoingCIO(eRoot.getInstanceObject(), eRoot.getConstraint()));
		eventTrace.setName( eventTrace.getRoot().getName());
		return eventTrace;
	}

	public Token processOutgoingCIO(InstanceObject io, Literal lit){
		// outcio is an action in one or more bri
		// we need to have an event for the outcio and a separate subevent for each bri action
		Token found = findToken(eventTrace, io, lit);
		if (found != null) {
			return found;
		}
		
		Token outcioEvent = createToken(eventTrace, io, lit, TokenType.INTERMEDIATE);
		Iterable<BehaviorRuleInstance> bris = findMatchingBehaviorRuleInstances(io,lit);
		for (BehaviorRuleInstance bri : bris) {
			Token condEvent = processCondition(bri.getCondition(),io, lit);
			Token stateEvent = bri.getCurrentState() != null?processState(bri.getCurrentState(), lit):null;
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
		return outcioEvent;
	}
	
	public Token stateTransition(BehaviorRuleInstance bri, Literal tref) {
		ConstrainedInstanceObject targetState = bri.getTargetState();
		if (targetState == null) {
			return null;
		}
		Token condEvent = processCondition(bri.getCondition(),targetState.getInstanceObject(), targetState.getConstraint());
		Token stateEvent = bri.getCurrentState() != null ? processState(bri.getCurrentState(), tref) : null;
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
	
	public Token processState(ConstrainedInstanceObject currentState, Literal tref){
		ComponentInstance context = containingComponentInstance(currentState);
		 EList<BehaviorRuleInstance> sTrans = context.getBehaviorRules();
		 Token csEvent = createToken(eventTrace, currentState.getInstanceObject(),tref, TokenType.INTERMEDIATE);
		for (BehaviorRuleInstance bri : sTrans){
			if (currentState.sameAs(bri.getTargetState())) {
				csEvent.getTokens().add( stateTransition(bri,tref));
			}
		}
		if (csEvent.getTokens().isEmpty()) {
			return null;
		}
		return csEvent;
	}
	
	public Token processCondition(Literal cond, InstanceObject io, Literal constraint){
		if (cond instanceof MultiLiteralConstraint){
			EList<Token> subEvents = new BasicEList<Token>();
			for (Expression el : ((MultiLiteralConstraint) cond).getElements()) {
				if (el instanceof Literal) {
					Literal literal = (Literal) el;
					Token res = processCondition(literal, io, constraint);
					if (res != null) {
						subEvents.add(res);
					}
				}
			}
			Token combined = processEventSubgraph(subEvents, (MultiLiteralConstraint) cond);// AIv3API.containingBehaviorRuleInstance(cond));
			return combined;
		} else if (cond instanceof ConstrainedInstanceObject){
			ConstrainedInstanceObject cio = (ConstrainedInstanceObject)cond;
//			if (isAncestor(containingComponentInstanceOrSelf(outcio.getInstanceObject()),containingComponentInstanceOrSelf(cio.getInstanceObject()))) {
//				// an outgoing
//				EList<ConstrainedInstanceObject> nextoutcios = findOutCIOs(cio,outcio);
//				if (nextoutcios.isEmpty()) {
//					return null;
//				}
//				EList<Event> subEvents = new BasicEList<Event>();
//				for (ConstrainedInstanceObject nextoutcio : nextoutcios) {
//					Event res = processOutgoingCIO(nextoutcio);
//					if (res != null) {
//						subEvents.add(res);
//					}
//				}
//				return processEventSubgraph(subEvents, EOperator.ANY, cio.getInstanceObject());  // multiple bris with outcio
//			} else {
				// an incoming or generator
				if (cio.getInstanceObject() instanceof GeneratorInstance) {
					// generator
					return generateEvents(cio.getInstanceObject(), cio.getConstraint());
				} else {
					// incoming cio
					Set<DefaultEdge> edges = graph.outgoingEdgesOf(cio);
					if (edges.isEmpty()){
						return generateEvents(cio.getInstanceObject(), cio.getConstraint());
					} else {
						// process outgoing
						EList<Token> subEvents = new BasicEList<Token>();
						for (DefaultEdge edge : edges) {
							InstanceObject target = graph.getEdgeTarget(edge);
							Literal tlit = null;
							if (target instanceof ConstrainedInstanceObject) {
								ConstrainedInstanceObject tcio = (ConstrainedInstanceObject)target;
								target = tcio.getInstanceObject();
								tlit = tcio.getConstraint();
							}
							
							Token res = processOutgoingCIO(target, tlit);
							if (res != null) {
								subEvents.add(res);
							}
						}
						Token combined = processEventSubgraph(subEvents, EOperator.ANY, cio.getInstanceObject());  // incoming
						return combined;
					}
				}
//			}
		} else {
			return null;
		}
	
	}
	
	
	/**
	 * generate collection of events one for each type in constraint
	 * @param cio
	 * @return
	 */
	public Token generateEvents(InstanceObject io, Literal constraint) {
		TokenType eventType = io instanceof GeneratorInstance || io instanceof StateInstance  ? TokenType.BASIC : TokenType.UNDEVELOPED;
		if (constraint instanceof ECollection) {
			// one sub event for each type in the constraint
			ECollection types = (ECollection)constraint;
			Token inEvent = createToken(eventTrace, io, null, TokenType.INTERMEDIATE);
			for (Expression el : types.getElements()) {
				if (el instanceof TypeReference) {
					TypeReference tr = (TypeReference) el;
					inEvent.getTokens().add(createToken(eventTrace, io, tr, eventType));
				}
			}
			return inEvent;
		} else {
			return createToken(eventTrace, io,(TypeReference)constraint, eventType);
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
		Token mlcEvent = createToken(eventTrace,io,null,TokenType.INTERMEDIATE);
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
	
	// impact processing
	
	
	public void generateEffectGraph(ComponentInstance root) {
		DefaultDirectedGraph<InstanceObject, DefaultEdge> bgraph = AIJGraphTUtil.generateBehaviorPropagationPaths(root, "EM");
		 
		 //		 outprops = root.getBehaviorRules().filter[bri|!bri.actions.empty].map[bri|bri.actions].flatten;
		for ( GeneratorInstance gi : root.getGenerators()) {
				TokenTrace eTrace = generateEventTrace(bgraph,root, gi);
				String rootname = eTrace.getName() + (eTrace.getTokenTraceType().equals(TokenTraceType.MINIMAL_CUT_SET) ? "_cutset"
						: (eTrace.getTokenTraceType().equals(TokenTraceType.TOKEN_TRACE) ? "_trace"
								: (eTrace.getTokenTraceType().equals(TokenTraceType.COMPOSITE_PARTS) ? "_parts" : "_tree")));
				URI ftaURI = EcoreUtil.getURI(eTrace.getInstanceRoot()).trimFragment().trimFileExtension().
						trimSegments(1).appendSegment("reports").appendSegment("fta").appendSegment(rootname).
						appendFileExtension("fg");
				Resource res = eTrace.getInstanceRoot().eResource().getResourceSet().getResource(ftaURI, false);
				if (res == null){
					res = eTrace.getInstanceRoot().eResource().getResourceSet().createResource(ftaURI);
				}
				res.getContents().clear();
				res.getContents().add(eTrace);
				try {
					res.save(null);
				} catch (IOException e) {
				}
			}
	}

	
	public TokenTrace generateEventTrace(Graph<InstanceObject, DefaultEdge> graph, ComponentInstance root, GeneratorInstance gi){
		this.graph = graph;
		eventTrace = TokenTraceFactory.eINSTANCE.createTokenTrace();
		eventTrace.setInstanceRoot(root);
		eventTrace.setTokenTraceType(TokenTraceType.TOKEN_TRACE);
		// add root event
		Token eventRoot = generateEvents(gi, gi.getValue());
		eventTrace.setRoot(eventRoot);
		eventTrace.setName( eventTrace.getRoot().getName());
		return eventTrace;
	}

	


}
