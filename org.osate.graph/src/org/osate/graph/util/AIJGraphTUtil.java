package org.osate.graph.util;

import static org.osate.aadlv3.util.AIv3API.*;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleDirectedGraph;
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
	
	private static void addPath(Graph<InstanceObject, DefaultEdge> g, InstanceObject src, InstanceObject dst) {
		g.addVertex(dst);
		g.addVertex(src);
		g.addEdge(src, dst);
	}

	public static Graph<InstanceObject, DefaultEdge> generatePropagationPaths(ComponentInstance root) {
		Graph<InstanceObject, DefaultEdge> directedGraph = new DefaultDirectedGraph<InstanceObject, DefaultEdge>(
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

	public static DefaultDirectedGraph<InstanceObject, DefaultEdge> generateBehaviorPropagationPaths(ComponentInstance root, String subclauseName) {
		DefaultDirectedGraph<InstanceObject, DefaultEdge> directedGraph = new DefaultDirectedGraph<InstanceObject, DefaultEdge>(
				DefaultEdge.class);
		List<AssociationInstance> connis = getAllConnections(root);
		for (AssociationInstance conni : connis) {
			InstanceObject src = conni.getSource();
			InstanceObject dst = conni.getDestination();
			// from outgoing feature to incoming feature instance
			Collection<ConstrainedInstanceObject> actions = findActionCIOs(src);
			if (actions.isEmpty()) {
				// src component has no bri
				// for external connection find src condition CIO in context of dst. In case of cross connection find dst condition CIOs in context of dst
				Collection<ConstrainedInstanceObject> dests = conni.isExternal()? findContainingConditionCIOs(dst, src,null, subclauseName)://findContainedActionCIOs(dst, null):
						 findContainingConditionCIOs(dst, null, subclauseName);
				if (dests.isEmpty()) {
					// dst has no bri
					addPath(directedGraph, src, dst);

				} else {
					for (ConstrainedInstanceObject dstcio : dests) {
						addPath(directedGraph, src, dstcio);
					}
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
			EList<ConstrainedInstanceObject> actions = ci.getActions();
			EList<InstanceObject> outfiAsAction = new UniqueEList<InstanceObject>();
			for (ConstrainedInstanceObject action : actions) {
				outfiAsAction.add(action.getInstanceObject());
			}
			for (FeatureInstance outfi : getAllOutgoingFeatures(ci)) {
				if (!outfiAsAction.contains(outfi)) {
					for (FeatureInstance infi : getAllIncomingFeatures(ci)) {
						if (isConnected(infi) || isConnected(outfi)) {
							// edge to represent flow from incoming feature to outgoing feature when not handled by bri
							addPath(directedGraph, infi, outfi);
						}
					}
				}
			}
			EList<BehaviorRuleInstance> bris = ci.getBehaviorRules();
			for (BehaviorRuleInstance bri : bris) {
				Iterable<ConstrainedInstanceObject> condcios = getAllConstrainedInstanceObjects(bri.getCondition());
				for (ConstrainedInstanceObject action : bri.getActions()) {
					// path to the current state from which to trace back.
						ConstrainedInstanceObject cs = bri.getCurrentState();
						if (cs != null) {
							// edge from current state to action
							addPath(directedGraph, cs,action );
							Iterable<ConstrainedInstanceObject> tss = findTargetStateCIOs(cs, subclauseName);
							for (ConstrainedInstanceObject ts: tss) {
								// edge from target state of different BRI to current state in current bri
								addPath(directedGraph, ts, cs);
							}
						}
					// process conditions
					for (ConstrainedInstanceObject ce : condcios) {
						// all cond to outgoing feature instance rule
						addPath(directedGraph, ce, action);
						// generator to generator cond
						if (ce.getInstanceObject() instanceof GeneratorInstance) {
							addPath(directedGraph,ce.getInstanceObject(),ce);
						}
					}
				}
				if (bri.getActions().isEmpty() && bri.getTargetState() != null) {
					// we have a rule that represents a state transition without actions
					ConstrainedInstanceObject ts = bri.getTargetState();
					ConstrainedInstanceObject cs = bri.getCurrentState();
					if (cs != null && ts != null && !cs.sameAs(ts)) {
						// edge from cs to ts
						addPath(directedGraph, cs, ts);
						Iterable<ConstrainedInstanceObject> tss = findTargetStateCIOs(cs, subclauseName);
						for (ConstrainedInstanceObject nts : tss) {
							// from target state in different BRI to same state as current state in current bri
							addPath(directedGraph, nts, cs);
						}
					}
					// process conditions
					for (ConstrainedInstanceObject ce : condcios) {
						// edge from condition elements to target state
						addPath(directedGraph, ce, ts);
						// generator to generator cond
						if (ce.getInstanceObject() instanceof GeneratorInstance) {
							addPath(directedGraph,ce.getInstanceObject(),ce);
						}
						InstanceObject srcio = ce.getInstanceObject();
						// Subcomponent composite rule
						Iterable<ConstrainedInstanceObject> subactions = findContainedActionCIOs(srcio,ce.getConstraint());
						for (ConstrainedInstanceObject subaction : subactions) {
							// edge from matching action to cond cio
							addPath(directedGraph, subaction, ce);
						}
					}
				}
				// deal with sinks
				if (isASink(bri)) {
					for (ConstrainedInstanceObject ce : condcios) {
						// edge from condition elements to sink
						if (ci.getSinks() != null) {
							addPath(directedGraph, ce, ci.getSinks());
						}
					}
				}
			}
		}
		return directedGraph;
	}

}
