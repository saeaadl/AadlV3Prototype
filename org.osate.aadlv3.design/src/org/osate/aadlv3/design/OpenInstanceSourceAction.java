package org.osate.aadlv3.design;

import java.util.Objects;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.GlobalURIEditorOpener;
import org.osate.aadlv3.util.AIv3API;
import org.osate.aadlv3.util.Aadlv3Util;
import org.osate.av3instance.av3instance.InstanceObject;

public class OpenInstanceSourceAction extends AadlInstanceAction {

	@Override
	public void perform(InstanceObject io) {
		EObject source = AIv3API.getInstanceOrigin(io);
		final URI uri = EcoreUtil.getURI(source);
		if (uri != null) {
			if (source.eResource() instanceof XtextResource) {
				final XtextResource res = (XtextResource) source.eResource();
				final GlobalURIEditorOpener opener = Objects.requireNonNull(
						(GlobalURIEditorOpener) res.getResourceServiceProvider().get(GlobalURIEditorOpener.class),
						"unable to get global URI Editor opener");
				opener.open(uri, true);
			}
		}
	}

}
