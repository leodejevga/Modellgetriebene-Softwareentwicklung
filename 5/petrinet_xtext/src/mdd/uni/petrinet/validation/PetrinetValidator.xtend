/*
 * generated by Xtext 2.12.0
 */
package mdd.uni.petrinet.validation

import org.eclipse.xtext.validation.Check
import mdd.uni.petrinet.petrinet.PetrinetPackage
import mdd.uni.petrinet.petrinet.Petrinet
import mdd.uni.petrinet.petrinet.Transition
import mdd.uni.petrinet.petrinet.Arc
import mdd.uni.petrinet.petrinet.PTArc
import mdd.uni.petrinet.petrinet.Place
import mdd.uni.petrinet.petrinet.TPArc
import java.util.List

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class PetrinetValidator extends AbstractPetrinetValidator {

	public static val INCOMPLETE_TRANSITION = 'incompleteTransition'
	public static val DUPLICATE_EDGE = 'duplicateEdge'

	@Check
	def checkIncompleteTransition(Transition t) {
		if (t.in.size == 0 || t.out.size == 0) {
			warning('Transition has no ingoing or outgoing Arcs',
				PetrinetPackage.Literals.TRANSITION__IN, INCOMPLETE_TRANSITION)
		}
	}

	@Check
	def checkDuplicateEdges(Transition t) {
		var List<Place> in = newArrayList
		var List<Place> out = newArrayList
		var Place duplicateIN = null;
		var Place duplicateOUT = null;
		for (Arc a : t.in) {
			if (duplicateIN === null && duplicateOUT === null)
				if (a instanceof PTArc) {
					var arc = a as PTArc;
					if (in.contains(arc.source)) {
						duplicateIN = arc.source;
					} else
						in.add(arc.source);
				} else if (a instanceof TPArc) {
					var arc = a as TPArc;
					if (out.contains(arc.target)) {
						duplicateOUT = arc.target;
					} else
						out.add(arc.target);
				}
		}
		if (duplicateIN !== null) {
			error('Transition has to same incoming Edges', PetrinetPackage.Literals.PT_ARC__SOURCE, DUPLICATE_EDGE)
		}
		if (duplicateOUT !== null) {
			error('Transition has to same outgoing Edges', PetrinetPackage.Literals.TP_ARC__TARGET, DUPLICATE_EDGE)
		}
	}

}
