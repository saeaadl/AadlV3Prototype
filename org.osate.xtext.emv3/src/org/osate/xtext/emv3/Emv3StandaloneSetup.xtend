/*
 * generated by Xtext 2.16.0
 */
package org.osate.xtext.emv3


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class Emv3StandaloneSetup extends Emv3StandaloneSetupGenerated {

	def static void doSetup() {
		new Emv3StandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}