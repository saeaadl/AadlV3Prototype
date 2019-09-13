package org.osate.graph.TokenTrace.util

import org.osate.aadlv3.aadlv3.ECollection
import org.osate.aadlv3.aadlv3.NamedElement
import org.osate.av3instance.av3instance.ComponentInstance

import static org.osate.aadlv3.util.AIv3API.*
import org.osate.graph.util.AIJGraphTUtil;
import org.jgrapht.alg.shortestpath.AllDirectedPaths
import static extension org.osate.aadlv3.util.Aadlv3Util.*
import java.util.Collection
import org.osate.aadlv3.util.Diagnostic
import java.util.ArrayList
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import org.osate.aadlv3.util.DiagnosticUtil
import org.osate.aadlv3.util.Aadlv3Util

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
		return getAllLeafComponents(root).filter[ci|val ts = ci.tokenSource; ts !== null&&!ts.elements.empty]
	}
	
	def static Collection<Diagnostic> validateTokenPropagation(ComponentInstance root, ComponentInstance target){
		val issues = new ArrayList<Diagnostic>
		val propagationgraph  = AIJGraphTUtil.generateConnectionTopology(root)
		val sources = getAllTokenSources(root)
		for (source : sources){
			val tokens = source.tokenSource.copy
			// path source to target contains vertex whose token sink contains 
			val adps = new AllDirectedPaths(propagationgraph)
			val dps = adps.getAllPaths(source, target, true, null)
			for (dp : dps){
//				if (!dp.vertexList.exists[vt|vt.tokenSink.contains(tokens)]){
//					issues.add(DiagnosticUtil.createError(source, source.toString + " token "+tokens.toString()+ " reaches "+ target.toString))
//				}
				for (vt: dp.vertexList){
					val sink = vt.tokenSink
					if (sink !== null){
						tokens.remove(vt.tokenSink)
					}
				}
			}
			if (!tokens.elements.empty){
				val tokenstring = tokens.toString
				issues.add(DiagnosticUtil.createError(source, source.toString + " token "+tokenstring+ " reaches "+ target.toString))
			}
		}
		return issues
	}
}
