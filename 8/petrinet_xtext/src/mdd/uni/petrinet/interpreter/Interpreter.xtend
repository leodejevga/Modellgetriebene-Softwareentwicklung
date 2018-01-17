package mdd.uni.petrinet.interpreter

import mdd.uni.petrinet.PetrinetStandaloneSetup
import mdd.uni.petrinet.petrinet.Petrinet
import mdd.uni.petrinet.petrinet.Transition
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet
import java.util.Random
import mdd.uni.petrinet.petrinet.Place
import mdd.uni.petrinet.petrinet.PetrinetFactory

class Interpreter {
	private static var String input
	private static var Petrinet petrinet
	
	def static void main(String[] args) {
		input = args.get(0)
		var injector = new PetrinetStandaloneSetup().createInjectorAndDoEMFRegistration();
		var resourceSet = injector.getInstance(XtextResourceSet);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		var inputURI = URI.createFileURI(input)
		var resource = resourceSet.getResource(inputURI, true);
		petrinet = resource.getContents().get(0) as Petrinet;
		println('Loaded ' + input)
		
		if (!petrinet.fireRandomTransition()) {
			println('No enabled transition found.')
			return
		}
		
		var inputFileString = inputURI.toFileString
		var savePath = inputFileString.substring(0, inputFileString.lastIndexOf(inputURI.lastSegment)) + 'output.pnx'
		var saveResource = resourceSet.createResource(URI.createFileURI(savePath))
		saveResource.contents.add(petrinet)
		saveResource.save(null)
		println('Saved changes to ' + savePath)
	}
	
	def static boolean fireRandomTransition(Petrinet petrinet) {
		var transitions = petrinet.transitions.filter[t | t.isEnabled].toList
		if (transitions.empty) {
			return false
		}
		var index = new Random().nextInt(transitions.size)
		transitions.get(index).fire
		return true
	}
	
	def static isEnabled(Transition trans) {
		return trans.in.forall[ptarc | ptarc.source.tokens.size >=  ptarc.weight]
	}		
	
	def static fire(Transition trans) {
		trans.in.forEach[ptarc | 
			val place = ptarc.source  
			place.removeTokens(ptarc.weight)
		]
		trans.out.forEach[tparc |
			val place = tparc.target
			place.addTokens(tparc.weight)
		]
		println('Fired transition ' + trans.name)
	}
	
	def static removeTokens(Place p, int number) {
		for (var i = 0; i < number; i++) {
			p.tokens.remove(p.tokens.last)			
		}
	}
	
	def static addTokens(Place p, int number) {
		for (var i = 0; i < number; i++) {
			val token = PetrinetFactory.eINSTANCE.createToken
			p.tokens.add(token)			
		}
	}
}