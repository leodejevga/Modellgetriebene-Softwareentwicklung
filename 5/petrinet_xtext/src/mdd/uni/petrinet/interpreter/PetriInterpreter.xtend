package mdd.uni.petrinet.interpreter

import org.eclipse.xtext.resource.XtextResource
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.mwe.internal.core.ast.util.Injector
import org.eclipse.ui.internal.Model
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.resource.XtextResourceSet

// Irgendwie keine Ahnung wie es gehen soll
class PetriInterpreter {
	def static void main(String[] args) {
		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
		var Injector injector = new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
		var XtextResourceSet resourceSet = injector.getInstance(typeof(XtextResourceSet));
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		var Resource resource = resourceSet.getResource(URI.createURI("platform:/resource/org.xtext.example.mydsl/src/example.mydsl"), true);
		var Model model = resource.getContents().get(0) as Model;
	}
}
