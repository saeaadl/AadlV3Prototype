package org.osate.graph.TokenTrace.util

import org.jgrapht.graph.DefaultEdge
import org.jgrapht.graph.EdgeReversedGraph
import org.osate.aadlv3.aadlv3.ECollection
import org.osate.aadlv3.aadlv3.Literal
import org.osate.aadlv3.aadlv3.MultiLiteralConstraint
import org.osate.aadlv3.aadlv3.TypeReference
import org.osate.av3instance.av3instance.ComponentInstance
import org.osate.av3instance.av3instance.ConstrainedInstanceObject
import org.osate.av3instance.av3instance.InstanceObject
import org.osate.graph.TokenTrace.Event
import org.osate.graph.TokenTrace.EventType
import org.osate.graph.TokenTrace.TokenTrace
import org.osate.graph.TokenTrace.TokenTraceFactory
import org.osate.graph.TokenTrace.TokenTraceType
import org.osate.graph.util.AIJGraphTUtil

import static org.osate.graph.TokenTrace.util.TokenTraceUtil.*

import static extension org.osate.aadlv3.util.AIv3API.*
import org.osate.aadlv3.aadlv3.EOperator
import org.osate.av3instance.av3instance.StateInstance
import org.osate.aadlv3.aadlv3.Generator
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.BasicEList
import org.osate.av3instance.av3instance.BehaviorRuleInstance
import org.eclipse.core.runtime.IStatus
import org.eclipse.emf.common.util.URI
import org.eclipse.core.runtime.Path
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.core.runtime.Status
import java.io.IOException

class FaultGraph {
	
	var static TokenTrace eventTrace = null;
	var static EdgeReversedGraph<InstanceObject, DefaultEdge> graph = null;
	
	def void generateFaultGraph(ComponentInstance root) {
		val bgraph = AIJGraphTUtil.generateBehaviorPropagationPaths(root, "EM");
		val revgraph = new EdgeReversedGraph<InstanceObject, DefaultEdge>(bgraph);
		val outprops = root.getBehaviorRules().filter[bri|!bri.actions.empty].map[bri|bri.actions].flatten;
		for (outprop : outprops) {
			val eTrace = revgraph.generateEventTrace(root, outprop);

			val ftaURI = EcoreUtil.getURI(eventTrace.getInstanceRoot()).trimFragment().trimFileExtension().
				trimSegments(1).appendSegment("reports").appendSegment("fta").appendSegment(eventTrace.getName()).
				appendFileExtension("faulttree");
//			AadlUtil.makeSureFoldersExist(new Path(ftaURI.toPlatformString(true)));
			val res = eventTrace.getInstanceRoot().eResource().getResourceSet().createResource(ftaURI);
			res.getContents().add(eventTrace);
			try {
				res.save(null);
			} catch (IOException e) {
			}
		}

	}
			
	
	def TokenTrace generateEventTrace(EdgeReversedGraph<InstanceObject, DefaultEdge> graph, ComponentInstance root, ConstrainedInstanceObject eRoot){
		this.graph = graph;
		eventTrace = TokenTraceFactory.eINSTANCE.createTokenTrace();
		eventTrace.instanceRoot = root;
		eventTrace.tokenTraceType = TokenTraceType.TOKEN_TRACE;
		// add root event
		val rootEvent = processOutgoingCIO(eRoot);
		return eventTrace;
	}
	
	def Event processOutgoingCIO(ConstrainedInstanceObject outcio){
		val found = findToken(eventTrace, outcio);
		if (found !== null) return found as Event;
		
		val outcioEvent = createEvent(eventTrace, outcio, EventType.INTERMEDIATE)
		val bri = outcio.containingBehaviorRuleInstance;
		val condEvent = bri.condition.processCondition(outcio.constraint as TypeReference);
		if (bri.currentState !== null){
			val stateEvent = processState(bri.currentState, outcio.constraint as TypeReference)
			if (condEvent !== null){
				val subEvents = new BasicEList<Event>();
				subEvents += stateEvent
				subEvents += condEvent
				outcioEvent.tokens += processEventSubgraph(subEvents, EOperator.ALL, null)
			} else {
				outcioEvent.tokens += stateEvent
			}
		} else {
			if (condEvent === null){
				outcioEvent.type = EventType.UNDEVELOPED
			} else {
				outcioEvent.tokens += condEvent
			}
		}
		return outcioEvent
	}
	
	def Event stateTransition(BehaviorRuleInstance bri, TypeReference tref){
				val condEvent = bri.condition.processCondition(tref);
		if (bri.currentState !== null){
			val stateEvent = processState(bri.currentState, tref)
			if (condEvent !== null){
				val subEvents = new BasicEList<Event>();
				subEvents += stateEvent
				subEvents += condEvent
				return processEventSubgraph(subEvents, EOperator.ALL, null)
			} else {
				return stateEvent
			}
		} else {
			return condEvent
		}
		
	}
	
	def Event processState(ConstrainedInstanceObject currentState, TypeReference tref){
		val context = currentState.containingComponentInstance
		val csEvent = createEvent(eventTrace, currentState, EventType.BASIC)
		val sTrans = context.behaviorRules.filter[bri|bri.targetState.sameAs(currentState)]
		for (bri : sTrans){
			val transEvent = stateTransition(bri,tref)
		}
		return csEvent;
	}
	
	def Event processCondition(Literal cond, TypeReference tref){
		if (cond instanceof MultiLiteralConstraint){
			val subevents = cond.elements.map[lit|(lit as Literal).processCondition(tref)];
			val combined = processEventSubgraph(subevents, cond.operator, null)
			return combined;
		} else if (cond instanceof ConstrainedInstanceObject){
			// single literal (CIO)
			// map type
			// we have incoming or generator
			val edges = graph.outgoingEdgesOf(cond);
			if (edges.empty){
				val eventType = cond.instanceObject instanceof Generator ? EventType.BASIC : EventType.UNDEVELOPED;
				if (cond.constraint instanceof ECollection){
					// one sub event for each type in the constraint
					val types = cond.constraint as ECollection;
					val inEvent = createEvent(eventTrace, cond.instanceObject, tref, EventType.INTERMEDIATE);
					val subevents = types.elements.map[tr|createEvent(eventTrace,cond.instanceObject, tr as TypeReference, eventType)]
					inEvent.tokens +=subevents;
					return inEvent;
				} else {
					val cioEvent = createEvent(eventTrace, cond, eventType);
					return cioEvent;
				}
			} else {
				// process outgoing
				val subevents = edges.map[edge|(graph.getEdgeTarget(edge) as ConstrainedInstanceObject).processOutgoingCIO()]
				val combined = processEventSubgraph(subevents, EOperator.ANY, cond.instanceObject)  // incoming
				return combined;
			}
		}
	}
	
	def processEventSubgraph(Iterable<Event> subevents, EOperator optype, InstanceObject io) {
		val combined = findSharedEventSubtree(eventTrace, subevents, optype, io);
		if (combined !== null) {
			return combined;
		}
		val mlcEvent = createUniqueIntermediateEvent(eventTrace, optype, io);
		mlcEvent.tokens += subevents;
		return mlcEvent;
	}
}