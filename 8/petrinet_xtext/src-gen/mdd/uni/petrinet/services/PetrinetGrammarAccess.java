/*
 * generated by Xtext 2.12.0
 */
package mdd.uni.petrinet.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class PetrinetGrammarAccess extends AbstractGrammarElementFinder {
	
	public class PetrinetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "mdd.uni.petrinet.Petrinet.Petrinet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPetrinetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cGroup_3.eContents().get(0);
		private final Keyword cPlacesKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3_0_1 = (Keyword)cGroup_3_0.eContents().get(1);
		private final Assignment cPlacesAssignment_3_0_2 = (Assignment)cGroup_3_0.eContents().get(2);
		private final RuleCall cPlacesPlaceParserRuleCall_3_0_2_0 = (RuleCall)cPlacesAssignment_3_0_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_0_3 = (Keyword)cGroup_3_0.eContents().get(3);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cTransitionsKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3_1_1 = (Keyword)cGroup_3_1.eContents().get(1);
		private final Assignment cTransitionsAssignment_3_1_2 = (Assignment)cGroup_3_1.eContents().get(2);
		private final RuleCall cTransitionsTransitionParserRuleCall_3_1_2_0 = (RuleCall)cTransitionsAssignment_3_1_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_1_3 = (Keyword)cGroup_3_1.eContents().get(3);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cArcsKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3_2_1 = (Keyword)cGroup_3_2.eContents().get(1);
		private final Assignment cArcsAssignment_3_2_2 = (Assignment)cGroup_3_2.eContents().get(2);
		private final RuleCall cArcsArcParserRuleCall_3_2_2_0 = (RuleCall)cArcsAssignment_3_2_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_2_3 = (Keyword)cGroup_3_2.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Petrinet:
		//	'petrinet' name=ID
		//	'{' (('places' '{' places+=Place* '}') ('transitions' '{' transitions+=Transition* '}') ('arcs' '{' arcs+=Arc* '}'))
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'petrinet' name=ID '{' (('places' '{' places+=Place* '}') ('transitions' '{' transitions+=Transition* '}') ('arcs' '{'
		//arcs+=Arc* '}')) '}'
		public Group getGroup() { return cGroup; }
		
		//'petrinet'
		public Keyword getPetrinetKeyword_0() { return cPetrinetKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('places' '{' places+=Place* '}') ('transitions' '{' transitions+=Transition* '}') ('arcs' '{' arcs+=Arc* '}')
		public Group getGroup_3() { return cGroup_3; }
		
		//'places' '{' places+=Place* '}'
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//'places'
		public Keyword getPlacesKeyword_3_0_0() { return cPlacesKeyword_3_0_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3_0_1() { return cLeftCurlyBracketKeyword_3_0_1; }
		
		//places+=Place*
		public Assignment getPlacesAssignment_3_0_2() { return cPlacesAssignment_3_0_2; }
		
		//Place
		public RuleCall getPlacesPlaceParserRuleCall_3_0_2_0() { return cPlacesPlaceParserRuleCall_3_0_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3_0_3() { return cRightCurlyBracketKeyword_3_0_3; }
		
		//'transitions' '{' transitions+=Transition* '}'
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//'transitions'
		public Keyword getTransitionsKeyword_3_1_0() { return cTransitionsKeyword_3_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3_1_1() { return cLeftCurlyBracketKeyword_3_1_1; }
		
		//transitions+=Transition*
		public Assignment getTransitionsAssignment_3_1_2() { return cTransitionsAssignment_3_1_2; }
		
		//Transition
		public RuleCall getTransitionsTransitionParserRuleCall_3_1_2_0() { return cTransitionsTransitionParserRuleCall_3_1_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3_1_3() { return cRightCurlyBracketKeyword_3_1_3; }
		
		//'arcs' '{' arcs+=Arc* '}'
		public Group getGroup_3_2() { return cGroup_3_2; }
		
		//'arcs'
		public Keyword getArcsKeyword_3_2_0() { return cArcsKeyword_3_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3_2_1() { return cLeftCurlyBracketKeyword_3_2_1; }
		
		//arcs+=Arc*
		public Assignment getArcsAssignment_3_2_2() { return cArcsAssignment_3_2_2; }
		
		//Arc
		public RuleCall getArcsArcParserRuleCall_3_2_2_0() { return cArcsArcParserRuleCall_3_2_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3_2_3() { return cRightCurlyBracketKeyword_3_2_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class PlaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "mdd.uni.petrinet.Petrinet.Place");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPlaceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cGroup_3.eContents().get(0);
		private final Keyword cTokensKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3_0_1 = (Keyword)cGroup_3_0.eContents().get(1);
		private final Assignment cTokensAssignment_3_0_2 = (Assignment)cGroup_3_0.eContents().get(2);
		private final RuleCall cTokensTokenParserRuleCall_3_0_2_0 = (RuleCall)cTokensAssignment_3_0_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_0_3 = (Keyword)cGroup_3_0.eContents().get(3);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cOutKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3_1_1 = (Keyword)cGroup_3_1.eContents().get(1);
		private final Assignment cOutAssignment_3_1_2 = (Assignment)cGroup_3_1.eContents().get(2);
		private final CrossReference cOutPTArcCrossReference_3_1_2_0 = (CrossReference)cOutAssignment_3_1_2.eContents().get(0);
		private final RuleCall cOutPTArcIDTerminalRuleCall_3_1_2_0_1 = (RuleCall)cOutPTArcCrossReference_3_1_2_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_3_1_3 = (Keyword)cGroup_3_1.eContents().get(3);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cInKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3_2_1 = (Keyword)cGroup_3_2.eContents().get(1);
		private final Assignment cInAssignment_3_2_2 = (Assignment)cGroup_3_2.eContents().get(2);
		private final CrossReference cInTPArcCrossReference_3_2_2_0 = (CrossReference)cInAssignment_3_2_2.eContents().get(0);
		private final RuleCall cInTPArcIDTerminalRuleCall_3_2_2_0_1 = (RuleCall)cInTPArcCrossReference_3_2_2_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_3_2_3 = (Keyword)cGroup_3_2.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Place:
		//	'place' name=ID
		//	'{' (('tokens' '{' tokens+=Token* '}') ('out' '{' out+=[PTArc]* '}') ('in' '{' in+=[TPArc]* '}')) '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'place' name=ID '{' (('tokens' '{' tokens+=Token* '}') ('out' '{' out+=[PTArc]* '}') ('in' '{' in+=[TPArc]* '}')) '}'
		public Group getGroup() { return cGroup; }
		
		//'place'
		public Keyword getPlaceKeyword_0() { return cPlaceKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('tokens' '{' tokens+=Token* '}') ('out' '{' out+=[PTArc]* '}') ('in' '{' in+=[TPArc]* '}')
		public Group getGroup_3() { return cGroup_3; }
		
		//'tokens' '{' tokens+=Token* '}'
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//'tokens'
		public Keyword getTokensKeyword_3_0_0() { return cTokensKeyword_3_0_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3_0_1() { return cLeftCurlyBracketKeyword_3_0_1; }
		
		//tokens+=Token*
		public Assignment getTokensAssignment_3_0_2() { return cTokensAssignment_3_0_2; }
		
		//Token
		public RuleCall getTokensTokenParserRuleCall_3_0_2_0() { return cTokensTokenParserRuleCall_3_0_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3_0_3() { return cRightCurlyBracketKeyword_3_0_3; }
		
		//'out' '{' out+=[PTArc]* '}'
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//'out'
		public Keyword getOutKeyword_3_1_0() { return cOutKeyword_3_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3_1_1() { return cLeftCurlyBracketKeyword_3_1_1; }
		
		//out+=[PTArc]*
		public Assignment getOutAssignment_3_1_2() { return cOutAssignment_3_1_2; }
		
		//[PTArc]
		public CrossReference getOutPTArcCrossReference_3_1_2_0() { return cOutPTArcCrossReference_3_1_2_0; }
		
		//ID
		public RuleCall getOutPTArcIDTerminalRuleCall_3_1_2_0_1() { return cOutPTArcIDTerminalRuleCall_3_1_2_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3_1_3() { return cRightCurlyBracketKeyword_3_1_3; }
		
		//'in' '{' in+=[TPArc]* '}'
		public Group getGroup_3_2() { return cGroup_3_2; }
		
		//'in'
		public Keyword getInKeyword_3_2_0() { return cInKeyword_3_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3_2_1() { return cLeftCurlyBracketKeyword_3_2_1; }
		
		//in+=[TPArc]*
		public Assignment getInAssignment_3_2_2() { return cInAssignment_3_2_2; }
		
		//[TPArc]
		public CrossReference getInTPArcCrossReference_3_2_2_0() { return cInTPArcCrossReference_3_2_2_0; }
		
		//ID
		public RuleCall getInTPArcIDTerminalRuleCall_3_2_2_0_1() { return cInTPArcIDTerminalRuleCall_3_2_2_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3_2_3() { return cRightCurlyBracketKeyword_3_2_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class TokenElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "mdd.uni.petrinet.Petrinet.Token");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cTokenAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cTokenKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//Token:
		//	{Token} 'token';
		@Override public ParserRule getRule() { return rule; }
		
		//{Token} 'token'
		public Group getGroup() { return cGroup; }
		
		//{Token}
		public Action getTokenAction_0() { return cTokenAction_0; }
		
		//'token'
		public Keyword getTokenKeyword_1() { return cTokenKeyword_1; }
	}
	public class TransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "mdd.uni.petrinet.Petrinet.Transition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTransitionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cGroup_3.eContents().get(0);
		private final Keyword cOutKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3_0_1 = (Keyword)cGroup_3_0.eContents().get(1);
		private final Assignment cOutAssignment_3_0_2 = (Assignment)cGroup_3_0.eContents().get(2);
		private final CrossReference cOutTPArcCrossReference_3_0_2_0 = (CrossReference)cOutAssignment_3_0_2.eContents().get(0);
		private final RuleCall cOutTPArcIDTerminalRuleCall_3_0_2_0_1 = (RuleCall)cOutTPArcCrossReference_3_0_2_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_3_0_3 = (Keyword)cGroup_3_0.eContents().get(3);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cInKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3_1_1 = (Keyword)cGroup_3_1.eContents().get(1);
		private final Assignment cInAssignment_3_1_2 = (Assignment)cGroup_3_1.eContents().get(2);
		private final CrossReference cInPTArcCrossReference_3_1_2_0 = (CrossReference)cInAssignment_3_1_2.eContents().get(0);
		private final RuleCall cInPTArcIDTerminalRuleCall_3_1_2_0_1 = (RuleCall)cInPTArcCrossReference_3_1_2_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_3_1_3 = (Keyword)cGroup_3_1.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Transition:
		//	'transition' name=ID
		//	'{' (('out' '{' out+=[TPArc]* '}') ('in' '{' in+=[PTArc]* '}')) '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'transition' name=ID '{' (('out' '{' out+=[TPArc]* '}') ('in' '{' in+=[PTArc]* '}')) '}'
		public Group getGroup() { return cGroup; }
		
		//'transition'
		public Keyword getTransitionKeyword_0() { return cTransitionKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('out' '{' out+=[TPArc]* '}') ('in' '{' in+=[PTArc]* '}')
		public Group getGroup_3() { return cGroup_3; }
		
		//'out' '{' out+=[TPArc]* '}'
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//'out'
		public Keyword getOutKeyword_3_0_0() { return cOutKeyword_3_0_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3_0_1() { return cLeftCurlyBracketKeyword_3_0_1; }
		
		//out+=[TPArc]*
		public Assignment getOutAssignment_3_0_2() { return cOutAssignment_3_0_2; }
		
		//[TPArc]
		public CrossReference getOutTPArcCrossReference_3_0_2_0() { return cOutTPArcCrossReference_3_0_2_0; }
		
		//ID
		public RuleCall getOutTPArcIDTerminalRuleCall_3_0_2_0_1() { return cOutTPArcIDTerminalRuleCall_3_0_2_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3_0_3() { return cRightCurlyBracketKeyword_3_0_3; }
		
		//'in' '{' in+=[PTArc]* '}'
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//'in'
		public Keyword getInKeyword_3_1_0() { return cInKeyword_3_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3_1_1() { return cLeftCurlyBracketKeyword_3_1_1; }
		
		//in+=[PTArc]*
		public Assignment getInAssignment_3_1_2() { return cInAssignment_3_1_2; }
		
		//[PTArc]
		public CrossReference getInPTArcCrossReference_3_1_2_0() { return cInPTArcCrossReference_3_1_2_0; }
		
		//ID
		public RuleCall getInPTArcIDTerminalRuleCall_3_1_2_0_1() { return cInPTArcIDTerminalRuleCall_3_1_2_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3_1_3() { return cRightCurlyBracketKeyword_3_1_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class ArcElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "mdd.uni.petrinet.Petrinet.Arc");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPTArcParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTPArcParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Arc:
		//	PTArc | TPArc;
		@Override public ParserRule getRule() { return rule; }
		
		//PTArc | TPArc
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//PTArc
		public RuleCall getPTArcParserRuleCall_0() { return cPTArcParserRuleCall_0; }
		
		//TPArc
		public RuleCall getTPArcParserRuleCall_1() { return cTPArcParserRuleCall_1; }
	}
	public class PTArcElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "mdd.uni.petrinet.Petrinet.PTArc");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPtarcKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cWeightKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cWeightAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cWeightINTTerminalRuleCall_3_0 = (RuleCall)cWeightAssignment_3.eContents().get(0);
		private final Keyword cPlaceKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cSourceAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cSourcePlaceCrossReference_5_0 = (CrossReference)cSourceAssignment_5.eContents().get(0);
		private final RuleCall cSourcePlaceIDTerminalRuleCall_5_0_1 = (RuleCall)cSourcePlaceCrossReference_5_0.eContents().get(1);
		private final Keyword cTransitionKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cTargetAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final CrossReference cTargetTransitionCrossReference_7_0 = (CrossReference)cTargetAssignment_7.eContents().get(0);
		private final RuleCall cTargetTransitionIDTerminalRuleCall_7_0_1 = (RuleCall)cTargetTransitionCrossReference_7_0.eContents().get(1);
		
		//PTArc:
		//	'ptarc' name=ID
		//	'weight' weight=INT
		//	'place' source=[Place]
		//	'transition' target=[Transition];
		@Override public ParserRule getRule() { return rule; }
		
		//'ptarc' name=ID 'weight' weight=INT 'place' source=[Place] 'transition' target=[Transition]
		public Group getGroup() { return cGroup; }
		
		//'ptarc'
		public Keyword getPtarcKeyword_0() { return cPtarcKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'weight'
		public Keyword getWeightKeyword_2() { return cWeightKeyword_2; }
		
		//weight=INT
		public Assignment getWeightAssignment_3() { return cWeightAssignment_3; }
		
		//INT
		public RuleCall getWeightINTTerminalRuleCall_3_0() { return cWeightINTTerminalRuleCall_3_0; }
		
		//'place'
		public Keyword getPlaceKeyword_4() { return cPlaceKeyword_4; }
		
		//source=[Place]
		public Assignment getSourceAssignment_5() { return cSourceAssignment_5; }
		
		//[Place]
		public CrossReference getSourcePlaceCrossReference_5_0() { return cSourcePlaceCrossReference_5_0; }
		
		//ID
		public RuleCall getSourcePlaceIDTerminalRuleCall_5_0_1() { return cSourcePlaceIDTerminalRuleCall_5_0_1; }
		
		//'transition'
		public Keyword getTransitionKeyword_6() { return cTransitionKeyword_6; }
		
		//target=[Transition]
		public Assignment getTargetAssignment_7() { return cTargetAssignment_7; }
		
		//[Transition]
		public CrossReference getTargetTransitionCrossReference_7_0() { return cTargetTransitionCrossReference_7_0; }
		
		//ID
		public RuleCall getTargetTransitionIDTerminalRuleCall_7_0_1() { return cTargetTransitionIDTerminalRuleCall_7_0_1; }
	}
	public class TPArcElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "mdd.uni.petrinet.Petrinet.TPArc");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTparcKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cWeightKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cWeightAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cWeightINTTerminalRuleCall_3_0 = (RuleCall)cWeightAssignment_3.eContents().get(0);
		private final Keyword cTransitionKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cSourceAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cSourceTransitionCrossReference_5_0 = (CrossReference)cSourceAssignment_5.eContents().get(0);
		private final RuleCall cSourceTransitionIDTerminalRuleCall_5_0_1 = (RuleCall)cSourceTransitionCrossReference_5_0.eContents().get(1);
		private final Keyword cPlaceKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cTargetAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final CrossReference cTargetPlaceCrossReference_7_0 = (CrossReference)cTargetAssignment_7.eContents().get(0);
		private final RuleCall cTargetPlaceIDTerminalRuleCall_7_0_1 = (RuleCall)cTargetPlaceCrossReference_7_0.eContents().get(1);
		
		//TPArc:
		//	'tparc' name=ID
		//	'weight' weight=INT
		//	'transition' source=[Transition]
		//	'place' target=[Place];
		@Override public ParserRule getRule() { return rule; }
		
		//'tparc' name=ID 'weight' weight=INT 'transition' source=[Transition] 'place' target=[Place]
		public Group getGroup() { return cGroup; }
		
		//'tparc'
		public Keyword getTparcKeyword_0() { return cTparcKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'weight'
		public Keyword getWeightKeyword_2() { return cWeightKeyword_2; }
		
		//weight=INT
		public Assignment getWeightAssignment_3() { return cWeightAssignment_3; }
		
		//INT
		public RuleCall getWeightINTTerminalRuleCall_3_0() { return cWeightINTTerminalRuleCall_3_0; }
		
		//'transition'
		public Keyword getTransitionKeyword_4() { return cTransitionKeyword_4; }
		
		//source=[Transition]
		public Assignment getSourceAssignment_5() { return cSourceAssignment_5; }
		
		//[Transition]
		public CrossReference getSourceTransitionCrossReference_5_0() { return cSourceTransitionCrossReference_5_0; }
		
		//ID
		public RuleCall getSourceTransitionIDTerminalRuleCall_5_0_1() { return cSourceTransitionIDTerminalRuleCall_5_0_1; }
		
		//'place'
		public Keyword getPlaceKeyword_6() { return cPlaceKeyword_6; }
		
		//target=[Place]
		public Assignment getTargetAssignment_7() { return cTargetAssignment_7; }
		
		//[Place]
		public CrossReference getTargetPlaceCrossReference_7_0() { return cTargetPlaceCrossReference_7_0; }
		
		//ID
		public RuleCall getTargetPlaceIDTerminalRuleCall_7_0_1() { return cTargetPlaceIDTerminalRuleCall_7_0_1; }
	}
	
	
	private final PetrinetElements pPetrinet;
	private final PlaceElements pPlace;
	private final TokenElements pToken;
	private final TransitionElements pTransition;
	private final ArcElements pArc;
	private final PTArcElements pPTArc;
	private final TPArcElements pTPArc;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public PetrinetGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pPetrinet = new PetrinetElements();
		this.pPlace = new PlaceElements();
		this.pToken = new TokenElements();
		this.pTransition = new TransitionElements();
		this.pArc = new ArcElements();
		this.pPTArc = new PTArcElements();
		this.pTPArc = new TPArcElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("mdd.uni.petrinet.Petrinet".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Petrinet:
	//	'petrinet' name=ID
	//	'{' (('places' '{' places+=Place* '}') ('transitions' '{' transitions+=Transition* '}') ('arcs' '{' arcs+=Arc* '}'))
	//	'}';
	public PetrinetElements getPetrinetAccess() {
		return pPetrinet;
	}
	
	public ParserRule getPetrinetRule() {
		return getPetrinetAccess().getRule();
	}
	
	//Place:
	//	'place' name=ID
	//	'{' (('tokens' '{' tokens+=Token* '}') ('out' '{' out+=[PTArc]* '}') ('in' '{' in+=[TPArc]* '}')) '}';
	public PlaceElements getPlaceAccess() {
		return pPlace;
	}
	
	public ParserRule getPlaceRule() {
		return getPlaceAccess().getRule();
	}
	
	//Token:
	//	{Token} 'token';
	public TokenElements getTokenAccess() {
		return pToken;
	}
	
	public ParserRule getTokenRule() {
		return getTokenAccess().getRule();
	}
	
	//Transition:
	//	'transition' name=ID
	//	'{' (('out' '{' out+=[TPArc]* '}') ('in' '{' in+=[PTArc]* '}')) '}';
	public TransitionElements getTransitionAccess() {
		return pTransition;
	}
	
	public ParserRule getTransitionRule() {
		return getTransitionAccess().getRule();
	}
	
	//Arc:
	//	PTArc | TPArc;
	public ArcElements getArcAccess() {
		return pArc;
	}
	
	public ParserRule getArcRule() {
		return getArcAccess().getRule();
	}
	
	//PTArc:
	//	'ptarc' name=ID
	//	'weight' weight=INT
	//	'place' source=[Place]
	//	'transition' target=[Transition];
	public PTArcElements getPTArcAccess() {
		return pPTArc;
	}
	
	public ParserRule getPTArcRule() {
		return getPTArcAccess().getRule();
	}
	
	//TPArc:
	//	'tparc' name=ID
	//	'weight' weight=INT
	//	'transition' source=[Transition]
	//	'place' target=[Place];
	public TPArcElements getTPArcAccess() {
		return pTPArc;
	}
	
	public ParserRule getTPArcRule() {
		return getTPArcAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}