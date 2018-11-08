package org.osate.xtext.aadlv3.naming;
import org.eclipse.xtext.naming.IQualifiedNameConverter;

public class AadlV3QualifiedNameConverter extends IQualifiedNameConverter.DefaultImpl {
	@Override
	public String getDelimiter() {
		return "::";
	}

}
