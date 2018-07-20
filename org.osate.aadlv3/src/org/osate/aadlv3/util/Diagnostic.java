package org.osate.aadlv3.util;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

public class Diagnostic extends MinimalEObjectImpl.Container implements org.eclipse.emf.ecore.resource.Resource.Diagnostic {

	protected static final DiagnosticType TYPE_EDEFAULT = DiagnosticType.NONE;

	protected DiagnosticType type = TYPE_EDEFAULT;

	protected static final String MESSAGE_EDEFAULT = null;

	protected String message = MESSAGE_EDEFAULT;

	protected EObject sourceReference;

	protected static final String EXCEPTION_TYPE_EDEFAULT = null;

	protected String exceptionType = EXCEPTION_TYPE_EDEFAULT;

	protected EList<Diagnostic> issues;

	protected static final String SOURCE_EDEFAULT = null;

	protected String source = SOURCE_EDEFAULT;

	protected Diagnostic() {
		super();
	}

	public DiagnosticType getType() {
		return type;
	}

	public void setType(DiagnosticType newType) {
		type = newType == null ? TYPE_EDEFAULT : newType;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String newMessage) {
		message = newMessage;
	}

	public EObject getSourceReference() {
		if (sourceReference != null && sourceReference.eIsProxy()) {
			InternalEObject oldSourceReference = (InternalEObject)sourceReference;
			sourceReference = eResolveProxy(oldSourceReference);
		}
		return sourceReference;
	}

	public EObject basicGetSourceReference() {
		return sourceReference;
	}

	public void setSourceReference(EObject newSourceReference) {
		sourceReference = newSourceReference;
	}

	public String getExceptionType() {
		return exceptionType;
	}

	public void setExceptionType(String newExceptionType) {
		exceptionType = newExceptionType;
	}

	public EList<Diagnostic> getIssues() {
		if (issues == null) {
			issues = new BasicEList<Diagnostic>();
		}
		return issues;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String newSource) {
		source = newSource;
	}


	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", message: ");
		result.append(message);
		result.append(", exceptionType: ");
		result.append(exceptionType);
		result.append(", source: ");
		result.append(source);
		result.append(')');
		return result.toString();
	}

	@Deprecated
	@Override
	public String getLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Deprecated
	@Override
	public int getLine() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Deprecated
	@Override
	public int getColumn() {
		// TODO Auto-generated method stub
		return 0;
	}

} //DiagnosticImpl
