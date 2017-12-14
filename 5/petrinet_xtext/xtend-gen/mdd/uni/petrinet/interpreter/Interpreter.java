package mdd.uni.petrinet.interpreter;

import com.google.inject.Injector;
import mdd.uni.petrinet.PetrinetStandaloneSetup;
import mdd.uni.petrinet.petrinet.Petrinet;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.mwe.utils.StandaloneSetup;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class Interpreter {
  public static void main(final String[] args) {
    try {
      new StandaloneSetup().setPlatformUri("../");
      Injector injector = new PetrinetStandaloneSetup().createInjectorAndDoEMFRegistration();
      XtextResourceSet resourceSet = injector.<XtextResourceSet>getInstance(XtextResourceSet.class);
      resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
      Resource resource = resourceSet.getResource(URI.createURI("platform:/resource/petrinet_xtext/model/petrinet.pnx"), true);
      EObject _get = resource.getContents().get(0);
      Petrinet petrinet = ((Petrinet) _get);
      Resource saveResource = resourceSet.createResource(URI.createURI("platform:/resource/petrinet_xtext/model/output.pnx"));
      saveResource.getContents().add(petrinet);
      saveResource.save(null);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
