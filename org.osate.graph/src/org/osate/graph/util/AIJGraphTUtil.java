package org.osate.graph.util;

import static org.osate.aadlv3.util.AIv3API.*;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EObject;
import org.jgrapht.Graph;
import org.jgrapht.graph.AsSubgraph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleDirectedGraph;
import org.osate.aadlv3.aadlv3.Literal;
import org.osate.av3instance.av3instance.AssociationInstance;
import org.osate.av3instance.av3instance.BehaviorRuleInstance;
import org.osate.av3instance.av3instance.ComponentInstance;
import org.osate.av3instance.av3instance.ConstrainedInstanceObject;
import org.osate.av3instance.av3instance.FeatureInstance;
import org.osate.av3instance.av3instance.GeneratorInstance;
import org.osate.av3instance.av3instance.InstanceObject;
import org.osate.av3instance.av3instance.StateInstance;
import org.osate.av3instance.av3instance.StateTransitionInstance;
import org.osate.graph.TokenTrace.Token;
import org.osate.graph.TokenTrace.util.TokenTraceUtil;

public class AIJGraphTUtil {

	public static Graph<ComponentInstance, NoLabelEdge> generateComponentInstanceHierarchy(ComponentInstance ci) {
		Graph<ComponentInstance, NoLabelEdge> directedGraph = new SimpleDirectedGraph<ComponentInstance, NoLabelEdge>(
				NoLabelEdge.class);
		directedGraph.addVertex(ci);
		for (ComponentInstance subci : ci.getComponents()) {
			directedGraph.addVertex(subci);
			directedGraph.addEdge(ci, subci);
		}
		return directedGraph;
	}

	public static Graph<EObject, RefEObjectEdge> generateConnectionTopology(ComponentInstance root) {
		Graph<EObject, RefEObjectEdge> directedGraph = new DefaultDirectedGraph<EObject, RefEObjectEdge>(
				RefEObjectEdge.class);
		List<AssociationInstance> connis = getAllConnections(root);
		for (AssociationInstance conni : connis) {
			if (isConnection(conni)) {
				ComponentInstance src = containingComponentInstanceOrSelf(conni.getSource());
				ComponentInstance dst = containingComponentInstanceOrSelf(conni.getDestination());
				addPath(directedGraph,src, dst, conni);
			}
		}
		return directedGraph;
	}
	
	
	private static void addPath(Graph<EObject, RefEObjectEdge> g, EObject src, EObject dst, EObject refEObject) {
		g.addVertex(dst);
		g.addVertex(src);
		RefEObjectEdge edge = new RefEObjectEdge(refEObject);
		g.addEdge(src, dst, edge);
	}

	/**
	 * generate graph based on connections and flows
	 * edges may reference instance object related to the edge, i.e., object that may have a property related to the edge.
	 * @param root
	 * @return
	 */
	public static Graph<EObject, RefEObjectEdge> generatePropagationPaths(ComponentInstance root) {
		Graph<EObject, RefEObjectEdge> directedGraph = new DefaultDirectedGraph<EObject, RefEObjectEdge>(
				RefEObjectEdge.class);
		List<AssociationInstance> connis = getAllConnections(root);
		for (AssociationInstance conni : connis) {
			InstanceObject src = conni.getSource();
			InstanceObject dst = conni.getDestination();
			addPath(directedGraph, src, dst, conni);
		}
		List<ComponentInstance> cis = getAllComponents(root);
		for (ComponentInstance ci : cis) {
			if (isLeafComponent(ci)) {
				EList<BehaviorRuleInstance> flows = ci.getBehaviorRules();
				Iterable<FeatureInstance> infeats = getAllIncomingFeatures(ci);
				Iterable<FeatureInstance> outfeats = getAllOutgoingFeatures(ci);
				for (FeatureInstance ifi : infeats) {
					if (!isFlowSource(ifi, flows)) {
						// all out features if ifi is not in a behavior rule
						for (FeatureInstance ofi : outfeats){
							addPath(directedGraph,ifi, ofi, ci);
						}
					}
				}
				for (FeatureInstance ofi : outfeats) {
					if (!isFlowDestination(ofi, flows)) {
						// all in features if ofi is not in a behavior rule
						for (FeatureInstance ifi : infeats){
							addPath(directedGraph,ifi, ofi, ci);
						}
					}
				}
				for (BehaviorRuleInstance flow : flows) {
					Iterable<ConstrainedInstanceObject> srcs =  getAllConstrainedInstanceObjects(flow.getCondition());
					EList<ConstrainedInstanceObject> dsts = flow.getActions();
					if (dsts.isEmpty()) {
						// we have a sink
						for (ConstrainedInstanceObject src : srcs) {
								addPath(directedGraph,src.getInstanceObject(),flow,flow);
						}
					} else if (!srcs.iterator().hasNext()) {
						// we have a source without a condition
							for (ConstrainedInstanceObject dst: dsts) {
								addPath(directedGraph,flow,dst.getInstanceObject(),flow);
						}
						
					} else {
						for (ConstrainedInstanceObject src : srcs) {
							for (ConstrainedInstanceObject dst: dsts) {
								addPath(directedGraph,src.getInstanceObject(),dst.getInstanceObject(),flow);
							} 
						}
					}
				}
			}
		}
		return directedGraph;
	}

	public static Graph<EObject, RefEObjectEdge> generateBehaviorPropagationPaths(ComponentInstance root, String subclauseName) {
		Graph<EObject, RefEObjectEdge> directedGraph = new DefaultDirectedGraph<EObject, RefEObjectEdge>(
				RefEObjectEdge.class);
		List<AssociationInstance> connis = getAllConnections(root);
		for (AssociationInstance conni : connis) {
			InstanceObject src = conni.getSource();
			InstanceObject dst = conni.getDestination();
			// from outgoing feature to incoming feature instance
			addPath(directedGraph, src, dst, conni);
			
			// now edges from/to CIOs related to the source and destination
			Collection<ConstrainedInstanceObject> actions = findActionCIOs(src);
			if (actions.isEmpty()) {
				// src component has no bri
				// for external connection find src condition CIO in context of dst. In case of
				// cross connection find dst condition CIOs in context of dst
				Collection<ConstrainedInstanceObject> dests = conni.isExternal()
						? findContainingConditionCIOs(dst, src, null, subclauseName)
						: findContainingConditionCIOs(dst, null, subclauseName);
				for (ConstrainedInstanceObject dstcio : dests) {
					addPath(directedGraph, src, dstcio,conni);
				}
			} else {
				for (ConstrainedInstanceObject actioncio : actions) {
					// create edges between actions of connection source and condition elements of
					// connection destination
					Collection<ConstrainedInstanceObject> dests = conni.isExternal()? findContainingConditionCIOs(dst, src,actioncio.getConstraint(), subclauseName): //findContainedActionCIOs(dst, actioncio.getConstraint()):
							findContainingConditionCIOs(dst, actioncio.getConstraint(), subclauseName);
					if (dests.isEmpty()) {
						// dst has no bri
						addPath(directedGraph, actioncio, dst,conni);

					} else {
						for (ConstrainedInstanceObject dstcio : dests) {
							addPath(directedGraph, actioncio, dstcio,conni);
						}
					}
				}
			}
		}
		List<ComponentInstance> cis = getAllComponents(root);
		for (ComponentInstance ci : cis) {
			// for each component add edges for flows from incoming to outgoing
			EList<InstanceObject> outfiAsBehavior = new UniqueEList<InstanceObject>();
			EList<BehaviorRuleInstance> bris = ci.getBehaviorRules();
			// TODO bri filtered by annotation name
			for (BehaviorRuleInstance bri : bris) {
				Iterable<ConstrainedInstanceObject> condcios = getAllConstrainedInstanceObjects(bri.getCondition());
				for (ConstrainedInstanceObject action : bri.getActions()) {
					// we need both the current state and the condition
					// path to the current state from which to trace back.
					StateInstance cs = bri.getCurrentState();
					if (cs != null) {
						// edge from current state to action
						addPath(directedGraph, cs, action, bri);
					}
					// flows from condition elements to action (cio)
					// doing the cio lets us deal with condition expressions even when no tokens are
					// involved
					for (ConstrainedInstanceObject ce : condcios) {
						// all cond to outgoing feature instance rule
						handleConditionExpression(directedGraph, ce, action,bri);
						// add ce io as path source to handle unhandled tokens
						addPath(directedGraph, ce.getInstanceObject(), action, bri);
						// generator to generator cond
						handleGenerators(directedGraph, ce,bri);
						// TODO generators if not in bri
					}
					if (bri.getAnnotations().isEmpty()) {
						outfiAsBehavior.add(action.getInstanceObject());
					}
				}
			}
			for (StateTransitionInstance sti : ci.getStateTransitions()) {
				Iterable<ConstrainedInstanceObject> condcios = getAllConstrainedInstanceObjects(sti.getCondition());
				if (sti.getTargetState() != null) {
					// we have a rule that represents a state transition with or without actions
					// the target state to action edge is already taken care of
					StateInstance ts = sti.getTargetState();
					StateInstance cs = sti.getCurrentState();
					if (cs != null && ts != null && cs != ts) {
						// edge from cs to ts
						addPath(directedGraph, cs, ts,sti);
					}
					// process conditions
					for (ConstrainedInstanceObject ce : condcios) {
						// edge from condition elements to target state
						handleConditionExpression(directedGraph, ce, ts,sti);
						// generator to generator cond
						handleGenerators(directedGraph, ce,sti);
						InstanceObject srcio = ce.getInstanceObject();
						// Subcomponent composite rule
						Iterable<ConstrainedInstanceObject> subactions = findContainedActionCIOs(srcio,ce.getConstraint());
						for (ConstrainedInstanceObject subaction : subactions) {
							// edge from matching action to cond cio
							addPath(directedGraph, subaction, ce,sti);
						}
					}
				}
			}
			for (FeatureInstance outfi : getAllOutgoingFeatures(ci)) {
				if (!outfiAsBehavior.contains(outfi)) {
					for (FeatureInstance infi : getAllIncomingFeatures(ci)) {
						if (isConnected(infi) || isConnected(outfi)) {
							// edge to represent flow from incoming feature to outgoing feature when not handled by bri without token
							addPath(directedGraph, infi, outfi,ci);
						}
					}
				}
			}

		}
		return directedGraph;
	}
	
	private static void handleGenerators(Graph<EObject, RefEObjectEdge> directedGraph, ConstrainedInstanceObject ce, InstanceObject context) {
		if (ce.getInstanceObject() instanceof GeneratorInstance) {
			GeneratorInstance gi = (GeneratorInstance) getRealInstanceObject(ce);
			EList<ConstrainedInstanceObject> cios = gi.getGeneratedLiterals(); 
			Literal constraint = getRealConstraint(ce);
			if (constraint == null) {
				if (cios.isEmpty()) {
					addPath(directedGraph, gi, ce, context);
				} else {
					for (ConstrainedInstanceObject cio : cios) {
						addPath(directedGraph, cio, ce, context);
					}
				}
			} else {
				// only those satisfying the constraint
				for (ConstrainedInstanceObject cio : cios) {
					if (constraint.contains(cio.getConstraint())) {
						addPath(directedGraph, cio, ce, context);
					}
				}
			}
		}
	}
	
	private static void handleConditionExpression(Graph<EObject, RefEObjectEdge> directedGraph, ConstrainedInstanceObject ce, InstanceObject target, InstanceObject context) {
		Literal current = ce;
		while (current.eContainer() instanceof Literal) {
			addPath(directedGraph, current, (Literal)current.eContainer(),context);
			current = (Literal)current.eContainer();
		}
		addPath(directedGraph,current,target,context);
	}

	public static AsSubgraph<InstanceObject, RefEObjectEdge> generateBehaviorPropagationPaths(DefaultDirectedGraph<InstanceObject, RefEObjectEdge> originalGraph) {
		Set<InstanceObject> vs = originalGraph.vertexSet();
		AsSubgraph<InstanceObject, RefEObjectEdge> subgraph = new AsSubgraph<InstanceObject, RefEObjectEdge>(originalGraph,vs);
	       return subgraph;

	}
	
	
}
