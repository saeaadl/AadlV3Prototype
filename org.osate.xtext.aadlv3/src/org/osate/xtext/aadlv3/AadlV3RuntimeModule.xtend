/*
 * generated by Xtext 2.14.0
 */
package org.osate.xtext.aadlv3

import org.eclipse.xtext.conversion.IValueConverterService
import org.eclipse.xtext.naming.IQualifiedNameConverter

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class AadlV3RuntimeModule extends AbstractAadlV3RuntimeModule {
	
	override Class<? extends org.eclipse.xtext.naming.IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return org.osate.xtext.aadlv3.naming.AadlV3QualifiedNameProvider;
	}

	override Class<? extends IValueConverterService> bindIValueConverterService() {
		return org.osate.xtext.aadlv3.valueconversion.AadlV3ValueConverter;
	}
	
}
