package org.yakindu.sct.model.sgraph.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.yakindu.base.types.Event;
import org.yakindu.sct.model.sgraph.Region;
import org.yakindu.sct.model.sgraph.SGraphFactory;
import org.yakindu.sct.model.sgraph.State;
import org.yakindu.sct.model.sgraph.Statechart;
import org.yakindu.sct.model.sgraph.Transition;
import org.yakindu.sct.model.stext.stext.InterfaceScope;
import org.yakindu.sct.model.stext.stext.ReactionTrigger;
import org.yakindu.sct.model.stext.stext.StextFactory;

public class UEB7_Test {
	protected SGraphFactory graphFactory;
	protected StextFactory textFactory;
	protected Statechart statechart;
	
	@Before
	public void setUp() {
		graphFactory = SGraphFactory.eINSTANCE;
		textFactory = StextFactory.eINSTANCE;
		statechart = graphFactory.createStatechart();
		statechart.setName("TestStateChart");
		
	}
	@Test
	public void testSemanticDuplicateTransitions() {
		// 1 a)
		ReactionTrigger reactionTrigger = textFactory.createReactionTrigger();
		Region region = graphFactory.createRegion();
		Transition transition = graphFactory.createTransition();
		
		reactionTrigger.getTriggers().add(textFactory.createTimeEventSpec());
		reactionTrigger.getTriggers().add(textFactory.createTimeEventSpec());
		transition.setTrigger(reactionTrigger);		
		State state = graphFactory.createState();
		
		state.getOutgoingTransitions().add(transition);
		state.getIncomingTransitions().add(transition);
		
		transition.setSource(state);
		transition.setTarget(state);
		
		state.setParentRegion(region);
		region.getVertices().add(state);
		statechart.getRegions().add(region);
	}
	@Test
	public void testDuplicateTransitions() {
		// 1 b)
		Region region = graphFactory.createRegion();
		
		Transition transition = graphFactory.createTransition();	
		ReactionTrigger reactionTrigger = textFactory.createReactionTrigger();
		reactionTrigger.getTriggers().add(textFactory.createAlwaysEvent());
		reactionTrigger.getTriggers().add(textFactory.createAlwaysEvent());
		transition.setTrigger(reactionTrigger);		
		
		State state = graphFactory.createState();
		
		state.getOutgoingTransitions().add(transition);
		state.getIncomingTransitions().add(transition);
		
		transition.setSource(state);
		transition.setTarget(state);
		
		state.setParentRegion(region);
		region.getVertices().add(state);
		statechart.getRegions().add(region);
	}
	@Test
	public void testDuplicateIncomingTransitionsInHierachy() {
		// 1 c)
		Region region = graphFactory.createRegion();
		Region innerRegion = graphFactory.createRegion();

		Transition transition = graphFactory.createTransition();	
		ReactionTrigger reactionTrigger = textFactory.createReactionTrigger();
		reactionTrigger.getTriggers().add(textFactory.createAlwaysEvent());
		transition.setTrigger(reactionTrigger);
		
		Transition transition2 = graphFactory.createTransition();	
		ReactionTrigger reactionTrigger2 = textFactory.createReactionTrigger();
		reactionTrigger2.getTriggers().add(textFactory.createAlwaysEvent());
		transition2.setTrigger(reactionTrigger2);	
		
		State compositeState = graphFactory.createState();
		compositeState.setParentRegion(region);
		compositeState.getRegions().add(innerRegion);
		
		State innerState = graphFactory.createState();
		innerState.setParentRegion(innerRegion);

		
		compositeState.getOutgoingTransitions().add(transition);
		compositeState.getIncomingTransitions().add(transition);
		
		transition.setSource(compositeState);
		transition.setTarget(compositeState);
		
		innerState.getOutgoingTransitions().add(transition);
		innerState.getIncomingTransitions().add(transition);
		
		transition2.setSource(innerState);
		transition2.setTarget(compositeState);
		
		region.getVertices().add(compositeState);
		statechart.getRegions().add(region);
	}

	@Test
	public void testDuplicateInterfaceNames() {
		// 2 a)
		
		InterfaceScope interfaceScope = textFactory.createInterfaceScope();
		interfaceScope.setName("NewInterface");
		
		InterfaceScope interfaceScope2 = textFactory.createInterfaceScope();
		interfaceScope2.setName("NewInterface");
		
		statechart.getScopes().add(interfaceScope);
		statechart.getScopes().add(interfaceScope2);
	}
	@Test
	public void testDuplicateEventNames() {
		// 2 b)
		// 2 c)
		InterfaceScope interfaceScope = textFactory.createInterfaceScope();
		Event event = textFactory.createEventDefinition();
		event.setName("NewEvent");
		Event event2 = textFactory.createEventDefinition();
		event2.setName("NewEvent");
		
		InterfaceScope interfaceScope2 = textFactory.createInterfaceScope();
		
		statechart.getScopes().add(interfaceScope);
		statechart.getScopes().add(interfaceScope2);
		
		Region region = graphFactory.createRegion();
		Transition transition = graphFactory.createTransition();	
		ReactionTrigger reactionTrigger = textFactory.createReactionTrigger();
		reactionTrigger.getTriggers().add(textFactory.createAlwaysEvent());
		transition.setTrigger(reactionTrigger);
		

		State state = graphFactory.createState();
		
		state.getOutgoingTransitions().add(transition);
		state.getIncomingTransitions().add(transition);
		
		transition.setSource(state);
		transition.setTarget(state);
		
		region.getVertices().add(state);
		statechart.getRegions().add(region);
	}
}
