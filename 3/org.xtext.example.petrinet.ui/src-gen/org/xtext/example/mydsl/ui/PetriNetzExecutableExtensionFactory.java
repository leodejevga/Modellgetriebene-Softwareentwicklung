/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.example.petrinet.ui.internal.PetrinetActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class PetriNetzExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return PetrinetActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return PetrinetActivator.getInstance().getInjector(PetrinetActivator.ORG_XTEXT_EXAMPLE_MYDSL_PETRINETZ);
	}
	
}
