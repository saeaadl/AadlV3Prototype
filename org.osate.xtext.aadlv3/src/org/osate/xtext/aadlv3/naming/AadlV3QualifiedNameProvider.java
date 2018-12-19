package org.osate.xtext.aadlv3.naming;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.osate.aadlv3.aadlv3.ComponentClassifier;
import org.osate.aadlv3.aadlv3.DataType;
import org.osate.aadlv3.aadlv3.PackageDeclaration;
import org.osate.aadlv3.aadlv3.PropertyDefinition;
import org.osate.aadlv3.aadlv3.PropertySet;
import org.osate.aadlv3.aadlv3.Workingset;

public class AadlV3QualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

	@Override
	public QualifiedName getFullyQualifiedName(final EObject obj) {
		if (obj instanceof ComponentClassifier 
				|| obj instanceof PackageDeclaration || obj instanceof PropertyDefinition || obj instanceof PropertySet
				|| obj instanceof Workingset || obj instanceof DataType) {
			return super.getFullyQualifiedName(obj);
		}
		return null;
	}
}
