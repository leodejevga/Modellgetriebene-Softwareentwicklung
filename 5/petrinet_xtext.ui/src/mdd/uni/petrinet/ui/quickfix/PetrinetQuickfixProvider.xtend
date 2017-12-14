/*
 * generated by Xtext 2.12.0
 */
package mdd.uni.petrinet.ui.quickfix

import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.validation.Issue
import mdd.uni.petrinet.validation.PetrinetValidator
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor

/**
 * Custom quickfixes.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
class PetrinetQuickfixProvider extends DefaultQuickfixProvider {
	
	@Fix(PetrinetValidator.DUPLICATE_EDGE)
	def fixDoubleEdges(Issue issue, IssueResolutionAcceptor acceptor){
		acceptor.accept(issue, "Remove doubles", "Remove the double Edge", "")[
			context |
			//Kante L�schen
		]
	}
	@Fix(PetrinetValidator.INCOMPLETE_TRANSITION)
	def fixIncompleteTransition(Issue issue, IssueResolutionAcceptor acceptor){
		acceptor.accept(issue, "Add connection", "Add connection to a random Place", "")[
			context |
			//Arc zu einem Place hinzuff�gen
		]
	}

	/* Beispiel 1 aus der Vorlesung
	@Fix(PetrinetValidator.INVALID_NAME)
	def capitalizeName(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Capitalize name', 'Capitalize the name.', 'upcase.png') [
			context |
			val xtextDocument = context.xtextDocument
			val firstLetter = xtextDocument.get(issue.offset, 1)
			xtextDocument.replace(issue.offset, 1, firstLetter.toUpperCase)
		]
	}
	*
	*/
	
	/* Beispiel 2 aus der Vorlesung
	@Fix(CMValidator.NONUNIQUE_NAMES)
	def rename(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'rename Type', 'Rename the type.', 'upcase.png')[
			context | 
			val xtextDocument = context.xtextDocument
			xtextDocument.replace(issue.offset + issue.length, 0, "2")	
		]
	}
	* 
	*/
	
	/* Beispiel 3 aus der Vorlesung
	@Fix(PetrinetValidator.INVALID_NAME)
	def setDefaultFeature(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Set feature', 'Set a default feature.','upcase.png', new Mod());
	}
	
	
	static class Mod implements ISemanticModification {
		override apply (EObject element, IModificationContext context) {
			val Property p = CMFactory.eINSTANCE.createProperty()
			p.name = "defaultProperty"
			val simpleTypes = element.eContainer.eContents.filter[t]t instanceof SimpleType]
			
			if (simpleTypes.size > 0){
				val t = simpleTypes.get(0) as SimpleType p.setType(t)
			}
			(element as Entity).getFeatures().add(p)
		}
		
	}
	*/
}