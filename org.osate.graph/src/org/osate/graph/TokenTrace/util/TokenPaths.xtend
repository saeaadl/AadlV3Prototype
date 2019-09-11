package org.osate.graph.TokenTrace.util

import org.osate.aadlv3.aadlv3.ECollection
import org.osate.aadlv3.aadlv3.NamedElement
import org.osate.av3instance.av3instance.ComponentInstance

import static org.osate.aadlv3.util.Aadlv3Util.*
import static org.osate.aadlv3.util.AIv3API.*
import org.osate.graph.util.AIJGraphTUtil;
import org.jgrapht.alg.shortestpath.AllDirectedPaths
import static extension org.osate.aadlv3.util.Aadlv3Util.*

class TokenPaths {
	


	val static String TokenSource = "TokenSource";
	val static String TokenSink = "TokenSink";
	
	def static ECollection getTokenSource(NamedElement ne){
		return getOwnedPropertyValue(ne,TokenSource) as ECollection
	}
	
	def static ECollection getTokenSink(NamedElement ne){
		return getOwnedPropertyValue(ne,TokenSink) as ECollection
	}
	
	def static Iterable<ComponentInstance> getAllTokenSources(ComponentInstance root){
		return getAllLeafComponents(root).filter[ci|ci.tokenSource.elements.empty]
	}
	
	def static boolean ok(ComponentInstance root, ComponentInstance target){
		val propagationgraph  = AIJGraphTUtil.generatePropagationPaths(root)
		val sources = getAllTokenSources(root)
		for (source : sources){
			val tokens = source.tokenSource
			// path source to target contains vertex whose token sink contains 
			val adps = new AllDirectedPaths(propagationgraph)
			val dps = adps.getAllPaths(source, target, true, null)
			for (dp : dps){
				dp.vertexList.exists[vt|vt.tokenSink.contains(tokens)]
			}
		}
		return true
	}
}
