package org.osate.aadlv3.util;

import org.eclipse.emf.ecore.EObject;

public class DiagnosticUtil {
	
	public static void error(EObject target, String message){
		Diagnostic error = new Diagnostic();
		error.setMessage(message);
		error.setSourceReference(target);
		error.setType(DiagnosticType.ERROR);
		if (error.eResource() != null) {
			error.eResource().getErrors().add(error);
		}
	}
	
	public static void warning(EObject target, String message){
		Diagnostic warning = new Diagnostic();
		warning.setMessage(message);
		warning.setSourceReference(target);
		warning.setType(DiagnosticType.WARNING);
		if (warning.eResource() != null) {
			warning.eResource().getWarnings().add(warning);
		}
	}

}
