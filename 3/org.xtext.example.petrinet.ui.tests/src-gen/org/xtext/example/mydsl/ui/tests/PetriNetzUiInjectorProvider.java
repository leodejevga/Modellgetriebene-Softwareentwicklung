/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.example.petrinet.ui.internal.PetrinetActivator;

public class PetriNetzUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return PetrinetActivator.getInstance().getInjector("org.xtext.example.mydsl.PetriNetz");
	}

}
