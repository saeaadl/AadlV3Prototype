package org.osate.graph.util;

import static org.osate.aadlv3.util.AIv3API.*;

import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleDirectedGraph;
import org.osate.av3instance.av3instance.AssociationInstance;
import org.osate.av3instance.av3instance.BehaviorRuleInstance;
import org.osate.av3instance.av3instance.ComponentInstance;
import org.osate.av3instance.av3instance.ConstrainedInstanceObject;
import org.osate.av3instance.av3instance.FeatureInstance;
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
			if (!conni.isExternal()) {
				// from outgoing feature to incoming feature instance
				Iterable<ConstrainedInstanceObject> actions = findActionCIOs(src);
				for (ConstrainedInstanceObject actioncio : actions) {
					// create edges between actions of connection source and condition elements of connection destination
					Iterable<ConstrainedInstanceObject> dests = findContainingConditionCIOs(dst, actioncio.getConstraint(), subclauseName);
					for (ConstrainedInstanceObject dstcio : dests) {
						addPath(directedGraph, actioncio, dstcio);
					}
				}
			}
		}
		List<ComponentInstance> cis = getAllComponents(root);
		for (ComponentInstance ci : cis) {
			EList<BehaviorRuleInstance> bris = ci.getBehaviorRules();
			for (BehaviorRuleInstance bri: bris) {
				for (ConstrainedInstanceObject action: bri.getActions()) {
					// path to the current state from which to trace back.
//					ConstrainedInstanceObject cs = bri.getCurrentState();
//					if (cs != null) {
//						Iterable<ConstrainedInstanceObject> tss = findTargetStateCIOs(cs, subclauseName);
//						for (ConstrainedInstanceObject ts: tss) {
//							addPath(directedGraph, ts, action);
//						}
//					}
					// process conditions
					Iterable<ConstrainedInstanceObject> condcios = getAllConstrainedInstanceObjects(bri.getCondition());
					for (ConstrainedInstanceObject ce : condcios) {
						InstanceObject srcio = ce.getInstanceObject();
						InstanceObject dstio = action.getInstanceObject();
						ComponentInstance srcCi = containingComponentInstanceOrSelf(srcio);
						ComponentInstance dstCi = containingComponentInstanceOrSelf(dstio);
						// incoming to outgoing feature instance rule
						addPath(directedGraph, ce, action);
						if (isAncestor(dstCi,srcCi)) {
							// edges from action cio of subcomponent to cond cio in parent bri
							Iterable<ConstrainedInstanceObject> subactions = findContainedActionCIOs(srcio, action.getConstraint());
							for (ConstrainedInstanceObject subcio: subactions) {
								addPath(directedGraph, subcio, ce);
							}
						}
					}
				}
//				if (bri.getActions().isEmpty() && bri.getTargetState() != null) {
//					// we have a rule that represents a state transition without actions
//					ConstrainedInstanceObject ts = bri.getTargetState();
//					ConstrainedInstanceObject cs = bri.getCurrentState();
//					if (cs != null && ts != null && !cs.sameAs(ts)) {
//						Iterable<ConstrainedInstanceObject> tss = findTargetStateCIOs(cs, subclauseName);
//						for (ConstrainedInstanceObject nts: tss) {
//							addPath(directedGraph, nts, ts);
//						}
//					}
//					// process conditions
//					Iterable<ConstrainedInstanceObject> condcios = getAllConstrainedInstanceObjects(bri.getCondition());
//					for (ConstrainedInstanceObject ce : condcios) {
//						InstanceObject srcio = ce.getInstanceObject();
//						ComponentInstance srcCi = containingComponentInstanceOrSelf(srcio);
//						if (isAncestor(ci,srcCi)) {
//							// Subcomponent composite rule 
//							Iterable<ConstrainedInstanceObject> subactions = findContainedActionCIOs(srcio, ce.getConstraint(), subclauseName);
//							for (ConstrainedInstanceObject subcio: subactions) {
//								addPath(directedGraph, subcio, ts);
//							}
//						} else {
//							// incoming to outgoing feature instance rule
//							addPath(directedGraph, ce, ts);
//						}
//					}
//				}
			}
		}
		return directedGraph;
	}


}
