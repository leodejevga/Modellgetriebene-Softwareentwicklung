/*
 * generated by Xtext 2.12.0
 */
package mdd.uni.petrinet.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import petrinet_xtext.ui.internal.Petrinet_xtextActivator;

public class PetrinetUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return Petrinet_xtextActivator.getInstance().getInjector("mdd.uni.petrinet.Petrinet");
	}

}
