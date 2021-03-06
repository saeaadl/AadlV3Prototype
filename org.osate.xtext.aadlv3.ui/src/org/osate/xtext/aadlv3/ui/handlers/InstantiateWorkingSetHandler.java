package org.osate.xtext.aadlv3.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.jgrapht.Graph;
import org.osate.aadlv3.aadlv3.InstanceConfiguration;
import org.osate.aadlv3.aadlv3.PackageDeclaration;
import org.osate.aadlv3.aadlv3.PropertyDefinition;
import org.osate.aadlv3.aadlv3.Workingset;
import org.osate.aadlv3.instantiation.Instantiator;
import org.osate.aadlv3.util.Aadlv3Util;
import org.osate.av3instance.av3instance.ComponentInstance;
import org.osate.graph.TokenTrace.TokenTrace;
import org.osate.graph.TokenTrace.TokenTraceType;
import org.osate.graph.TokenTrace.util.FaultGraph;
import org.osate.graph.TokenTrace.util.TokenPaths;
import org.osate.graph.util.AIJGraphTUtil;
import org.osate.graph.util.AIJGraphXUtil;

public class InstantiateWorkingSetHandler extends AbstractHandler {

	@SuppressWarnings("unchecked")
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		IWorkbench wb = PlatformUI.getWorkbench();
		IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
		IWorkbenchPage page = win.getActivePage();
		IEditorPart activeEditor = page.getActiveEditor();
		if (activeEditor == null) {
			return null;
		}
		XtextEditor xtextEditor = (XtextEditor) activeEditor.getAdapter(XtextEditor.class);
		if (xtextEditor != null) {
			IXtextDocument iXTextDoc = xtextEditor.getDocument();
			iXTextDoc.modify(new IUnitOfWork.Void() {
				@Override
				public void process(Object state) throws Exception {
					EObject rootObject = ((Resource) state).getContents().get(0);
					if (rootObject instanceof PackageDeclaration) {
						PackageDeclaration pkg = (PackageDeclaration) rootObject;
						if (pkg.getElements().get(0) instanceof Workingset) {
							Workingset ws = (Workingset) pkg.getElements().get(0);
							Iterable<PropertyDefinition> expectedProperties = Aadlv3Util.getExpectedProperties(ws);
							for (InstanceConfiguration iroot : ws.getInstanceRoots()) {
								ComponentInstance rootinstance = new Instantiator().instantiate(iroot,expectedProperties);
								analyze(rootinstance, iroot.getActions());
							}
						}
					}
				}
			});
		}
		return null;
	}
	
	private void analyze (ComponentInstance rootinstance, Iterable<String> actions){
		String annotation = "";
		for (String action : actions) {
			if (action.startsWith("@")){
				annotation = action.length() == 1 ? "":action.substring(1);
			} else {
				switch( action) {
				case "causetrace": {
					FaultGraph fg = new FaultGraph();
					fg.generateCauseGraphs(rootinstance, TokenTraceType.TOKEN_TRACE,annotation);
					break;
				}
				case "causegraph": {
					FaultGraph fg = new FaultGraph();
					fg.generateCauseGraphs(rootinstance, TokenTraceType.TOKEN_GRAPH,annotation);
					break;
				}
				case "causecutset": {
					FaultGraph fg = new FaultGraph();
					fg.generateCauseGraphs(rootinstance, TokenTraceType.MINIMAL_CUT_SET,annotation);
					break;
				}
				case "effecttrace": {
					FaultGraph fgg = new FaultGraph();
					TokenTrace eventTrace = fgg.generateEffectGraph(rootinstance, TokenTraceType.TOKEN_TRACE,annotation);
					fgg.save(eventTrace);

					break;
				}
				case "tokenpropagation":{
					ComponentInstance subci = rootinstance.getComponents().get(2).getComponents().get(0);
					new TokenPaths().validateTokenPropagation(rootinstance, subci);
					break;
				}
				}
			}
		}
		// XXX TODO 
//		
//		Graph ng = AIJGraphTUtil.generateComponentInstanceHierarchy(rootinstance);
//		AIJGraphXUtil.showGraph(ng);
//		Graph topo =AIJGraphTUtil.generateConnectionTopology(rootinstance);
//		AIJGraphXUtil.showGraph(topo);
//		Graph Prop =AIJGraphTUtil.generatePropagationPaths(rootinstance);
//		AIJGraphXUtil.showGraph(Prop);
		Graph BProp =AIJGraphTUtil.generateBehaviorPropagationPaths(rootinstance,"EM");
		AIJGraphXUtil.showGraph(BProp);

	}
}
