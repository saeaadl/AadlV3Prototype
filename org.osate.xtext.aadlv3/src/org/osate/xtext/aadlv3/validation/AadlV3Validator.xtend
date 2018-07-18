/*
 * generated by Xtext 2.14.0
 */
package org.osate.xtext.aadlv3.validation

import org.osate.aadlv3.aadlv3.ComponentInterface
import org.eclipse.xtext.validation.Check
import org.osate.aadlv3.aadlv3.Aadlv3Package
import static extension org.osate.aadlv3.util.Aadlv3Util.*

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class AadlV3Validator extends AbstractAadlV3Validator {
	
	public static val ONLY_SUPER_INTERFACES = 'OnlySuperInterfaces'

	@Check
	def checkComponentInterface(ComponentInterface cif) {
		cif.checkComponentInterfaceExtensions()
	}
	
	def checkComponentInterfaceExtensions(ComponentInterface cif){
		if (!cif.allComponentClassifiers.forall[scif|scif instanceof ComponentInterface]){
			error('Name should start with a capital', 
					Aadlv3Package.Literals.COMPONENT_CLASSIFIER__SUPER_CLASSIFIERS,
					ONLY_SUPER_INTERFACES)
		}
	}
	
}
