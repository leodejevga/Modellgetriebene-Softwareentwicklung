/**
 * generated by Xtext 2.12.0
 */
package mdd.uni.petrinet.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import mdd.uni.petrinet.PetrinetRuntimeModule;
import mdd.uni.petrinet.PetrinetStandaloneSetup;
import mdd.uni.petrinet.ide.PetrinetIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class PetrinetIdeSetup extends PetrinetStandaloneSetup {
  @Override
  public Injector createInjector() {
    PetrinetRuntimeModule _petrinetRuntimeModule = new PetrinetRuntimeModule();
    PetrinetIdeModule _petrinetIdeModule = new PetrinetIdeModule();
    return Guice.createInjector(Modules2.mixin(_petrinetRuntimeModule, _petrinetIdeModule));
  }
}