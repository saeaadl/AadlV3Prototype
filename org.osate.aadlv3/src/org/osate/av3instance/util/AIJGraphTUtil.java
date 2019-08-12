package org.osate.av3instance.util;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.osate.av3instance.av3instance.ComponentInstance;

public class AIJGraphTUtil {
	
	public static Graph<ComponentInstance, DefaultEdge> generateGraph(ComponentInstance ci) {
        Graph<ComponentInstance, DefaultEdge> directedGraph =
                new DefaultDirectedGraph<ComponentInstance, DefaultEdge>(DefaultEdge.class);
            directedGraph.addVertex(ci);
            for (ComponentInstance subci : ci.getComponents()) {
            	directedGraph.addVertex(subci);
            	directedGraph.addEdge(ci, subci);
            }
            return directedGraph;
	}
	
	public static void showGraph(Graph g) {
		
	}
	
	
}
