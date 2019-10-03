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
import org.osate.aadlv3.aadlv3.PackageDeclaration;
import org.osate.aadlv3.aadlv3.Workingset;
import org.osate.aadlv3.instantiation.Instantiator;
import org.osate.av3instance.av3instance.ComponentInstance;
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
						Workingset ws = (Workingset) pkg.getElements().get(0);
						ComponentInstance rootinstance = new Instantiator().instantiate(ws);
						// XXX TODO 
//						ComponentInstance subci = rootinstance.getComponents().get(2).getComponents().get(0);
//						new TokenPaths().validateTokenPropagation(rootinstance, subci);
//						
//						Graph ng = AIJGraphTUtil.generateComponentInstanceHierarchy(rootinstance);
//						AIJGraphXUtil.showGraph(ng);
//						Graph topo =AIJGraphTUtil.generateConnectionTopology(rootinstance);
//						AIJGraphXUtil.showGraph(topo);
//						Graph Prop =AIJGraphTUtil.generatePropagationPaths(rootinstance);
//						AIJGraphXUtil.showGraph(Prop);
//						Graph BProp =AIJGraphTUtil.generateBehaviorPropagationPaths(rootinstance,"EM");
//						AIJGraphXUtil.showGraph(BProp);
						FaultGraph fg = new FaultGraph();
						fg.generateCauseGraphs(rootinstance, TokenTraceType.TOKEN_TRACE,"EM");
//						FaultGraph fgg = new FaultGraph();
//						fgg.generateEffectGraph(rootinstance, TokenTraceType.TOKEN_TRACE,"EM");
					}
				}
			});
		}
		return null;
	}

}
