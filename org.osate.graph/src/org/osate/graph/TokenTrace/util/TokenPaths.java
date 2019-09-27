package org.osate.graph.TokenTrace.util;
import org.osate.aadlv3.aadlv3.ECollection;
import org.osate.aadlv3.aadlv3.Expression;
import org.osate.aadlv3.aadlv3.NamedElement;
import org.osate.av3instance.av3instance.AssociationInstance;
import org.osate.av3instance.av3instance.ComponentInstance;
import org.osate.av3instance.av3instance.InstanceObject;

import static org.osate.aadlv3.util.AIv3API.*;
import org.osate.graph.util.AIJGraphTUtil;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.alg.shortestpath.AllDirectedPaths;
import static  org.osate.aadlv3.util.Aadlv3Util.*;
import java.util.Collection;
import java.util.List;

import org.osate.aadlv3.util.Diagnostic;
import java.util.ArrayList;
import static  org.eclipse.emf.ecore.util.EcoreUtil.*;
import org.osate.aadlv3.util.DiagnosticUtil;
import org.osate.aadlv3.util.Aadlv3Util;

public class TokenPaths {


	String TokenSource = "TokenSource";
	 String TokenSink = "TokenSink";
	
	public ECollection getTokenSource(NamedElement ne){
		return (ECollection)getOwnedPropertyValue(ne,TokenSource); 
	}
	
	public ECollection getTokenSink(NamedElement ne){
		return (ECollection)getOwnedPropertyValue(ne,TokenSink);
	}
	
	public EList<ComponentInstance> getAllTokenSources(ComponentInstance root){
		Iterable<ComponentInstance> leaves = getAllLeafComponents(root);
		EList<ComponentInstance> res = new BasicEList<ComponentInstance>();
		for (ComponentInstance leaf: leaves) {
			ECollection ts = getTokenSource(leaf);
			if (ts != null && !ts.getElements().isEmpty()) {
				res.add(leaf);
			}
		}
		return res;
	}
	
	public Collection<Diagnostic> validateTokenPropagation(ComponentInstance root, ComponentInstance target){
		Collection<Diagnostic> issues = new ArrayList<Diagnostic>();
		Graph<InstanceObject, AssociationInstance> propagationgraph = AIJGraphTUtil.generateConnectionTopology(root);
		EList<ComponentInstance> sources = getAllTokenSources(root);
		for (ComponentInstance source : sources){
			ECollection tokens = EcoreUtil.copy(getTokenSource(source));
			// path source to target contains vertex whose token sink contains 
			AllDirectedPaths<InstanceObject, AssociationInstance> adps = new AllDirectedPaths<InstanceObject, AssociationInstance>(propagationgraph);
			List<GraphPath<InstanceObject, AssociationInstance>> dps = adps.getAllPaths(source, target, true, null);
			for (GraphPath<InstanceObject, AssociationInstance> dp : dps){
				for (InstanceObject vt: dp.getVertexList()){
					  EList<Expression> sink = getTokenSink(vt).getElements();
					 for ( Expression se: sink) {
						 tokens.getElements().remove(se);
					 }
				}
			}
			if (!tokens.getElements().isEmpty()){
				String tokenstring = tokens.toString();
				issues.add(DiagnosticUtil.createError(source, source.toString() + " token "+tokenstring+ " reaches "+ target.toString()));
			}
		}
		return issues;
	}

}
