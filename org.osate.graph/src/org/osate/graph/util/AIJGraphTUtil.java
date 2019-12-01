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

	public static Graph<InstanceObject, AssociationInstance> generateConnectionTopology(ComponentInstance root) {
		Graph<InstanceObject, AssociationInstance> directedGraph = new DefaultDirectedGraph<InstanceObject, AssociationInstance>(
				AssociationInstance.class);
		List<AssociationInstance> connis = getAllConnections(root);
		for (AssociationInstance conni : connis) {
			if (isConnection(conni)) {
				ComponentInstance src = containingComponentInstanceOrSelf(conni.getSource());
				ComponentInstance dst = containingComponentInstanceOrSelf(conni.getDestination());
				directedGraph.addVertex(dst);
				directedGraph.addVertex(src);
				directedGraph.addEdge(src, dst, conni);
			}
		}
		return directedGraph;
	}
	
	private static void addPath(Graph<EObject, DefaultEdge> g, EObject src, EObject dst) {
		g.addVertex(dst);
		g.addVertex(src);
		g.addEdge(src, dst);
	}

	public static Graph<EObject, DefaultEdge> generatePropagationPaths(ComponentInstance root) {
		Graph<EObject, DefaultEdge> directedGraph = new DefaultDirectedGraph<EObject, DefaultEdge>(
				DefaultEdge.class);
		List<AssociationInstance> connis = getAllConnections(root);
		for (AssociationInstance conni : connis) {
			InstanceObject src = conni.getSource();
			InstanceObject dst = conni.getDestination();
			addPath(directedGraph, src, dst);
		}
		List<ComponentInstance> cis = getAllComponents(root);
		for (ComponentInstance ci : cis) {
			if (isLeafComponent(ci)) {
				EList<AssociationInstance> flows = ci.getFlowspecs();
				Iterable<FeatureInstance> infeats = getAllIncomingFeatures(ci);
				Iterable<FeatureInstance> outfeats = getAllOutgoingFeatures(ci);
				for (FeatureInstance ifi : infeats) {
					if (!isFlowSource(ifi, flows)) {
						// all out features
						for (FeatureInstance ofi : outfeats){
							directedGraph.addEdge(ifi, ofi);
						}
					}
				}
				for (FeatureInstance ofi : outfeats) {
					if (!isFlowDestination(ofi, flows)) {
						// all in features
						for (FeatureInstance ifi : infeats){
							directedGraph.addEdge(ifi, ofi);
						}
					}
				}
				for (AssociationInstance flow : flows) {
					InstanceObject src = flow.getSource();
					InstanceObject dst = flow.getDestination();
					if (src != null) {
						directedGraph.addVertex(src);
					}
					if (dst != null) {
						directedGraph.addVertex(dst);
					}
					if (src == null || dst == null) {
						directedGraph.addVertex(ci);
					}
					directedGraph.addEdge(src != null ? src : ci, dst != null ? dst : ci);
				}
			}
		}
		return directedGraph;
	}

	public static Graph<EObject, DefaultEdge> generateBehaviorPropagationPaths(ComponentInstance root, String subclauseName) {
		Graph<EObject, DefaultEdge> directedGraph = new DefaultDirectedGraph<EObject, DefaultEdge>(
				DefaultEdge.class);
		List<AssociationInstance> connis = getAllConnections(root);
		for (AssociationInstance conni : connis) {
			InstanceObject src = conni.getSource();
			InstanceObject dst = conni.getDestination();
			// from outgoing feature to incoming feature instance
			addPath(directedGraph, src, dst);
			
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
					addPath(directedGraph, src, dstcio);
				}
			} else {
				for (ConstrainedInstanceObject actioncio : actions) {
					// create edges between actions of connection source and condition elements of
					// connection destination
					Collection<ConstrainedInstanceObject> dests = conni.isExternal()? findContainingConditionCIOs(dst, src,actioncio.getConstraint(), subclauseName): //findContainedActionCIOs(dst, actioncio.getConstraint()):
							findContainingConditionCIOs(dst, actioncio.getConstraint(), subclauseName);
					if (dests.isEmpty()) {
						// dst has no bri
						addPath(directedGraph, actioncio, dst);

					} else {
						for (ConstrainedInstanceObject dstcio : dests) {
							addPath(directedGraph, actioncio, dstcio);
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
			for (BehaviorRuleInstance bri : bris) {
				Iterable<ConstrainedInstanceObject> condcios = getAllConstrainedInstanceObjects(bri.getCondition());
				for (ConstrainedInstanceObject action : bri.getActions()) {
					if (bri.getTargetState() != null) {
						addPath(directedGraph, bri.getTargetState(), action);
					} else {
						// we need both the current state and the condition
						// path to the current state from which to trace back.
						StateInstance cs = bri.getCurrentState();
						if (cs != null) {
							// edge from current state to action
							addPath(directedGraph, cs, action);
						}
						// flows from condition elements to action (cio) 
						// doing the cio lets us deal with condition expressions even when no tokens are involved
						for (ConstrainedInstanceObject ce : condcios) {
							// all cond to outgoing feature instance rule
							handleConditionExpression(directedGraph, ce, action);
							// add ce io as path source to handle unhandled tokens
							addPath(directedGraph, ce.getInstanceObject(), action);
							// generator to generator cond
							handleGenerators(directedGraph, ce);
						}
					}
					if (action.getConstraint() == null) {
						outfiAsBehavior.add(action.getInstanceObject());
					}
				}
				if (bri.getTargetState() != null) {
					// we have a rule that represents a state transition with or without actions
					// the target state to action edge is already taken care of
					StateInstance ts = bri.getTargetState();
					StateInstance cs = bri.getCurrentState();
					if (cs != null && ts != null && cs != ts) {
						// edge from cs to ts
						addPath(directedGraph, cs, ts);
					}
					// process conditions
					for (ConstrainedInstanceObject ce : condcios) {
						// edge from condition elements to target state
						handleConditionExpression(directedGraph, ce, ts);
						// generator to generator cond
						handleGenerators(directedGraph, ce);
						InstanceObject srcio = ce.getInstanceObject();
						// Subcomponent composite rule
						Iterable<ConstrainedInstanceObject> subactions = findContainedActionCIOs(srcio,ce.getConstraint());
						for (ConstrainedInstanceObject subaction : subactions) {
							// edge from matching action to cond cio
							addPath(directedGraph, subaction, ce);
						}
					}
				}
			}
			for (FeatureInstance outfi : getAllOutgoingFeatures(ci)) {
				if (!outfiAsBehavior.contains(outfi)) {
					for (FeatureInstance infi : getAllIncomingFeatures(ci)) {
						if (isConnected(infi) || isConnected(outfi)) {
							// edge to represent flow from incoming feature to outgoing feature when not handled by bri without token
							addPath(directedGraph, infi, outfi);
						}
					}
				}
			}

		}
		return directedGraph;
	}
	
	private static void handleGenerators(Graph<EObject, DefaultEdge> directedGraph, ConstrainedInstanceObject ce) {
		if (ce.getInstanceObject() instanceof GeneratorInstance) {
			GeneratorInstance gi = (GeneratorInstance) getRealInstanceObject(ce);
			EList<ConstrainedInstanceObject> cios = gi.getGeneratedLiterals(); 
			Literal constraint = getRealConstraint(ce);
			if (constraint == null) {
				if (cios.isEmpty()) {
					addPath(directedGraph, gi, ce);
				} else {
					for (ConstrainedInstanceObject cio : cios) {
						addPath(directedGraph, cio, ce);
					}
				}
			} else {
				// only those satisfying the constraint
				for (ConstrainedInstanceObject cio : cios) {
					if (constraint.contains(cio.getConstraint())) {
						addPath(directedGraph, cio, ce);
					}
				}
			}
		}
	}
	
	private static void handleConditionExpression(Graph<EObject, DefaultEdge> directedGraph, ConstrainedInstanceObject ce, InstanceObject target) {
		Literal current = ce;
		while (current.eContainer() instanceof Literal) {
			addPath(directedGraph, current, (Literal)current.eContainer());
			current = (Literal)current.eContainer();
		}
		addPath(directedGraph,current,target);
	}

	public static AsSubgraph<InstanceObject, DefaultEdge> generateBehaviorPropagationPaths(DefaultDirectedGraph<InstanceObject, DefaultEdge> originalGraph) {
		Set<InstanceObject> vs = originalGraph.vertexSet();
		AsSubgraph<InstanceObject, DefaultEdge> subgraph = new AsSubgraph<InstanceObject, DefaultEdge>(originalGraph,vs);
	       return subgraph;

	}
	
	
}
