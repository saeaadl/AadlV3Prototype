package org.osate.graph.util;

import static org.osate.aadlv3.util.AIv3API.*;

import java.util.List;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

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
				ComponentInstance src = connectionEndComponentInstance(conni.getSource());
				ComponentInstance dst = connectionEndComponentInstance(conni.getDestination());
				directedGraph.addVertex(dst);
				directedGraph.addVertex(src);
				directedGraph.addEdge(src, dst, conni);
			}
		}
		return directedGraph;
	}

	public static Graph<InstanceObject, DefaultEdge> generatePropagationPaths(ComponentInstance root) {
		Graph<InstanceObject, DefaultEdge> directedGraph = new DefaultDirectedGraph<InstanceObject, DefaultEdge>(
				DefaultEdge.class);
		List<AssociationInstance> connis = getAllConnections(root);
		for (AssociationInstance conni : connis) {
			InstanceObject src = conni.getSource();
			InstanceObject dst = conni.getDestination();
			directedGraph.addVertex(dst);
			directedGraph.addVertex(src);
			directedGraph.addEdge(src, dst);
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

	public static Graph<InstanceObject, DefaultEdge> generateBehaviorPropagationPaths(ComponentInstance root, String subclauseName) {
		Graph<InstanceObject, DefaultEdge> directedGraph = new DefaultDirectedGraph<InstanceObject, DefaultEdge>(
				DefaultEdge.class);
		List<AssociationInstance> connis = getAllConnections(root);
		for (AssociationInstance conni : connis) {
			String s = conni.toString();
			InstanceObject src = conni.getSource();
			InstanceObject dst = conni.getDestination();
			ComponentInstance dstComp = connectionEndComponentInstance(dst);
			Iterable<ConstrainedInstanceObject> sources = findConnectionSourceCIOs(src, subclauseName);
			for (ConstrainedInstanceObject srccio : sources) {
				// create edges between actions of connection source and condition elements of connection destination
				Iterable<ConstrainedInstanceObject> dests = findConnectionDestinationCIOs(dstComp, srccio, subclauseName);
				for (ConstrainedInstanceObject dstcio : dests) {
					directedGraph.addVertex(dstcio);
					directedGraph.addVertex(srccio);
					directedGraph.addEdge(srccio, dstcio);
				}
				// create edges between condition element and actions
				BehaviorRuleInstance bri = containingBehaviorRuleInstance(srccio);
				Iterable<ConstrainedInstanceObject> condcios = getAllConstrainedInstanceObjects(bri.getCondition());
				for (ConstrainedInstanceObject ce : condcios) {
					directedGraph.addVertex(srccio);
					directedGraph.addVertex(ce);
					directedGraph.addEdge(ce, srccio);
				}
			}
		}
		return directedGraph;
	}

	public static Graph<Token, DefaultEdge> generateTokenTrace(ComponentInstance root) {
		Graph<Token, DefaultEdge> directedGraph = new DefaultDirectedGraph<Token, DefaultEdge>(DefaultEdge.class);
		List<ComponentInstance> cis = getAllComponents(root);
		for (ComponentInstance ci : cis) {
			if (isLeafComponent(ci)) {
				Token t = TokenTraceUtil.createToken(ci, null);
				directedGraph.addVertex(t);
			}
		}
		return directedGraph;
	}

}
