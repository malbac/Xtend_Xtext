/*
 * generated by Xtext
 */
package org.xtext.assignment1;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class EinKauflistStandaloneSetup extends EinKauflistStandaloneSetupGenerated{

	public static void doSetup() {
		new EinKauflistStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

