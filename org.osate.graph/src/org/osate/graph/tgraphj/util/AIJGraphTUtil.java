package org.osate.graph.tgraphj.util;

import static org.osate.aadlv3.util.AIv3API.containingComponentInstance;
import static org.osate.aadlv3.util.AIv3API.getAllComponents;
import static org.osate.aadlv3.util.AIv3API.getAllConnections;
import static org.osate.aadlv3.util.AIv3API.isLeafComponent;

import java.util.List;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleDirectedGraph;
import org.osate.av3instance.av3instance.AssociationInstance;
import org.osate.av3instance.av3instance.ComponentInstance;
import org.osate.av3instance.av3instance.FeatureInstance;
import org.osate.av3instance.av3instance.InstanceObject;

public class AIJGraphTUtil {
	
	public static Graph<ComponentInstance, NoLabelEdge> generateComponentInstanceHierarchy(ComponentInstance ci) {
        Graph<ComponentInstance, NoLabelEdge> directedGraph =
                new SimpleDirectedGraph<ComponentInstance, NoLabelEdge>(NoLabelEdge.class);
            directedGraph.addVertex(ci);
            for (ComponentInstance subci : ci.getComponents()) {
            	directedGraph.addVertex(subci);
            	directedGraph.addEdge(ci, subci);
            }
            return directedGraph;
	}

	public static Graph<InstanceObject, AssociationInstance> generateConnectionTopology(ComponentInstance root) {
        Graph<InstanceObject, AssociationInstance> directedGraph =
                new DefaultDirectedGraph<InstanceObject, AssociationInstance>(AssociationInstance.class);
		List<ComponentInstance> cis = getAllComponents(root);
		List<AssociationInstance> connis = getAllConnections(root);
		for (ComponentInstance ci : cis){
			if (isLeafComponent(ci)) {
			   directedGraph.addVertex(ci);
			}
		}
		for (AssociationInstance conni : connis){
			ComponentInstance src = containingComponentInstance(conni.getSource());
			ComponentInstance dst = containingComponentInstance(conni.getDestination());
          	if (isLeafComponent(src)&& isLeafComponent(dst)) {
    			directedGraph.addEdge(src, dst, conni);
          	}
		}
		return directedGraph;
	}


	public static Graph<InstanceObject, DefaultEdge> generatePropagationPaths(ComponentInstance root) {
        Graph<InstanceObject, DefaultEdge> directedGraph =
                new DefaultDirectedGraph<InstanceObject, DefaultEdge>(DefaultEdge.class);
		List<ComponentInstance> cis = getAllComponents(root);
		for (ComponentInstance ci : cis){
			if (isLeafComponent(ci)) {
			   directedGraph.addVertex(ci);
				List<FeatureInstance> fis = ci.getFeatures();
				for (FeatureInstance fi : fis){
				   directedGraph.addVertex(fi);
				}
			}
		}
		List<AssociationInstance> connis = getAllConnections(root);
		for (AssociationInstance conni : connis){
			InstanceObject src = conni.getSource();
			InstanceObject dst = conni.getDestination();
			   directedGraph.addVertex(dst);
			   directedGraph.addVertex(src);
    		   directedGraph.addEdge(src, dst);
		}
		return directedGraph;
	}

	
}
