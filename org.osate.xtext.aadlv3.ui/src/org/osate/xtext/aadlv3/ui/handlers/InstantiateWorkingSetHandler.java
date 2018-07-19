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
import org.osate.aadlv3.aadlv3.PackageDeclaration;
import org.osate.aadlv3.aadlv3.Workingset;
import org.osate.aadlv3.instantiation.Instantiator;

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
						new Instantiator().instantiate(ws);
					}
				}
			});
		}
		return null;
	}

}
