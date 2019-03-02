package org.osate.aadlv3.design;

import java.util.Objects;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.GlobalURIEditorOpener;
import org.osate.av3instance.av3instance.InstanceObject;

public class OpenInstanceAction extends AadlInstanceAction {

	@Override
	public void perform(InstanceObject io) {
		final URI uri = EcoreUtil.getURI(io);
		if (uri != null) {
			if (io.eResource() instanceof XtextResource) {
				final XtextResource res = (XtextResource) io.eResource();
				final GlobalURIEditorOpener opener = Objects.requireNonNull(
						(GlobalURIEditorOpener) res.getResourceServiceProvider().get(GlobalURIEditorOpener.class),
						"unable to get global URI Editor opener");
				opener.open(uri, true);
			} else {
				openDefaultEditor(io);
			}
		}
	}

	protected IEditorPart openDefaultEditor(InstanceObject io)  {
		try {
			Resource eResource = io.eResource();
			URI eUri = eResource.getURI();
			if (eUri.isPlatformResource()) {
				String platformString = eUri.toPlatformString(true);
				IResource instanceFile = ResourcesPlugin.getWorkspace().getRoot().findMember(platformString);
				IMarker gotoMarker = instanceFile.createMarker("org.osate.av3.AadlGotoMarker");
				gotoMarker.setAttribute(EValidator.URI_ATTRIBUTE, EcoreUtil.getURI(io).toString());
				IWorkbenchPage page = getWorkbench().getActiveWorkbenchWindow().getActivePage();
				IEditorPart res = IDE.openEditor(page, gotoMarker);
				instanceFile.deleteMarkers("org.osate.av3.AadlGotoMarker", false, IResource.DEPTH_ZERO);
				return res;
			}
		} catch (CoreException e) {
		}
		return null;
	}

	protected IEditorPart openDefaultEditor(IFile file) throws PartInitException {
		IWorkbenchPage page = getWorkbench().getActiveWorkbenchWindow().getActivePage();
		return IDE.openEditor(page, file);
	}


	protected IWorkbench getWorkbench() {
		IWorkbench wb = PlatformUI.getWorkbench();
		if (wb == null)
			throw new IllegalStateException("No workbench");
		return wb;
	}

}
