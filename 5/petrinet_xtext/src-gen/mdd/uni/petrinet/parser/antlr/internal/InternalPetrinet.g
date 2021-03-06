/*
 * generated by Xtext 2.12.0
 */
grammar InternalPetrinet;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package mdd.uni.petrinet.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package mdd.uni.petrinet.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import mdd.uni.petrinet.services.PetrinetGrammarAccess;

}

@parser::members {

 	private PetrinetGrammarAccess grammarAccess;

    public InternalPetrinetParser(TokenStream input, PetrinetGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Petrinet";
   	}

   	@Override
   	protected PetrinetGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRulePetrinet
entryRulePetrinet returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPetrinetRule()); }
	iv_rulePetrinet=rulePetrinet
	{ $current=$iv_rulePetrinet.current; }
	EOF;

// Rule Petrinet
rulePetrinet returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='petrinet'
		{
			newLeafNode(otherlv_0, grammarAccess.getPetrinetAccess().getPetrinetKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPetrinetAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPetrinetRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getPetrinetAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getPetrinetAccess().getUnorderedGroup_3());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getPetrinetAccess().getUnorderedGroup_3(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getPetrinetAccess().getUnorderedGroup_3(), 0);
					}
								({true}?=>(otherlv_4='places'
								{
									newLeafNode(otherlv_4, grammarAccess.getPetrinetAccess().getPlacesKeyword_3_0_0());
								}
								otherlv_5='{'
								{
									newLeafNode(otherlv_5, grammarAccess.getPetrinetAccess().getLeftCurlyBracketKeyword_3_0_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getPetrinetAccess().getPlacesPlaceParserRuleCall_3_0_2_0());
										}
										lv_places_6_0=rulePlace
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getPetrinetRule());
											}
											add(
												$current,
												"places",
												lv_places_6_0,
												"mdd.uni.petrinet.Petrinet.Place");
											afterParserOrEnumRuleCall();
										}
									)
								)*
								otherlv_7='}'
								{
									newLeafNode(otherlv_7, grammarAccess.getPetrinetAccess().getRightCurlyBracketKeyword_3_0_3());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPetrinetAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getPetrinetAccess().getUnorderedGroup_3(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getPetrinetAccess().getUnorderedGroup_3(), 1);
					}
								({true}?=>(otherlv_8='transitions'
								{
									newLeafNode(otherlv_8, grammarAccess.getPetrinetAccess().getTransitionsKeyword_3_1_0());
								}
								otherlv_9='{'
								{
									newLeafNode(otherlv_9, grammarAccess.getPetrinetAccess().getLeftCurlyBracketKeyword_3_1_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getPetrinetAccess().getTransitionsTransitionParserRuleCall_3_1_2_0());
										}
										lv_transitions_10_0=ruleTransition
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getPetrinetRule());
											}
											add(
												$current,
												"transitions",
												lv_transitions_10_0,
												"mdd.uni.petrinet.Petrinet.Transition");
											afterParserOrEnumRuleCall();
										}
									)
								)*
								otherlv_11='}'
								{
									newLeafNode(otherlv_11, grammarAccess.getPetrinetAccess().getRightCurlyBracketKeyword_3_1_3());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPetrinetAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getPetrinetAccess().getUnorderedGroup_3(), 2)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getPetrinetAccess().getUnorderedGroup_3(), 2);
					}
								({true}?=>(otherlv_12='arcs'
								{
									newLeafNode(otherlv_12, grammarAccess.getPetrinetAccess().getArcsKeyword_3_2_0());
								}
								otherlv_13='{'
								{
									newLeafNode(otherlv_13, grammarAccess.getPetrinetAccess().getLeftCurlyBracketKeyword_3_2_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getPetrinetAccess().getArcsArcParserRuleCall_3_2_2_0());
										}
										lv_arcs_14_0=ruleArc
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getPetrinetRule());
											}
											add(
												$current,
												"arcs",
												lv_arcs_14_0,
												"mdd.uni.petrinet.Petrinet.Arc");
											afterParserOrEnumRuleCall();
										}
									)
								)*
								otherlv_15='}'
								{
									newLeafNode(otherlv_15, grammarAccess.getPetrinetAccess().getRightCurlyBracketKeyword_3_2_3());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPetrinetAccess().getUnorderedGroup_3());
					}
				)
			)
					)+
					{getUnorderedGroupHelper().canLeave(grammarAccess.getPetrinetAccess().getUnorderedGroup_3())}?
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getPetrinetAccess().getUnorderedGroup_3());
				}
		)
		otherlv_16='}'
		{
			newLeafNode(otherlv_16, grammarAccess.getPetrinetAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRulePlace
entryRulePlace returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPlaceRule()); }
	iv_rulePlace=rulePlace
	{ $current=$iv_rulePlace.current; }
	EOF;

// Rule Place
rulePlace returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='place'
		{
			newLeafNode(otherlv_0, grammarAccess.getPlaceAccess().getPlaceKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPlaceAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPlaceRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getPlaceAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getPlaceAccess().getUnorderedGroup_3());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getPlaceAccess().getUnorderedGroup_3(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getPlaceAccess().getUnorderedGroup_3(), 0);
					}
								({true}?=>(otherlv_4='tokens'
								{
									newLeafNode(otherlv_4, grammarAccess.getPlaceAccess().getTokensKeyword_3_0_0());
								}
								otherlv_5='{'
								{
									newLeafNode(otherlv_5, grammarAccess.getPlaceAccess().getLeftCurlyBracketKeyword_3_0_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getPlaceAccess().getTokensTokenParserRuleCall_3_0_2_0());
										}
										lv_tokens_6_0=ruleToken
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getPlaceRule());
											}
											add(
												$current,
												"tokens",
												lv_tokens_6_0,
												"mdd.uni.petrinet.Petrinet.Token");
											afterParserOrEnumRuleCall();
										}
									)
								)*
								otherlv_7='}'
								{
									newLeafNode(otherlv_7, grammarAccess.getPlaceAccess().getRightCurlyBracketKeyword_3_0_3());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPlaceAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getPlaceAccess().getUnorderedGroup_3(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getPlaceAccess().getUnorderedGroup_3(), 1);
					}
								({true}?=>(otherlv_8='out'
								{
									newLeafNode(otherlv_8, grammarAccess.getPlaceAccess().getOutKeyword_3_1_0());
								}
								otherlv_9='{'
								{
									newLeafNode(otherlv_9, grammarAccess.getPlaceAccess().getLeftCurlyBracketKeyword_3_1_1());
								}
								(
									(
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getPlaceRule());
											}
										}
										otherlv_10=RULE_ID
										{
											newLeafNode(otherlv_10, grammarAccess.getPlaceAccess().getOutPTArcCrossReference_3_1_2_0());
										}
									)
								)*
								otherlv_11='}'
								{
									newLeafNode(otherlv_11, grammarAccess.getPlaceAccess().getRightCurlyBracketKeyword_3_1_3());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPlaceAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getPlaceAccess().getUnorderedGroup_3(), 2)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getPlaceAccess().getUnorderedGroup_3(), 2);
					}
								({true}?=>(otherlv_12='in'
								{
									newLeafNode(otherlv_12, grammarAccess.getPlaceAccess().getInKeyword_3_2_0());
								}
								otherlv_13='{'
								{
									newLeafNode(otherlv_13, grammarAccess.getPlaceAccess().getLeftCurlyBracketKeyword_3_2_1());
								}
								(
									(
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getPlaceRule());
											}
										}
										otherlv_14=RULE_ID
										{
											newLeafNode(otherlv_14, grammarAccess.getPlaceAccess().getInTPArcCrossReference_3_2_2_0());
										}
									)
								)*
								otherlv_15='}'
								{
									newLeafNode(otherlv_15, grammarAccess.getPlaceAccess().getRightCurlyBracketKeyword_3_2_3());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPlaceAccess().getUnorderedGroup_3());
					}
				)
			)
					)+
					{getUnorderedGroupHelper().canLeave(grammarAccess.getPlaceAccess().getUnorderedGroup_3())}?
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getPlaceAccess().getUnorderedGroup_3());
				}
		)
		otherlv_16='}'
		{
			newLeafNode(otherlv_16, grammarAccess.getPlaceAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleToken
entryRuleToken returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTokenRule()); }
	iv_ruleToken=ruleToken
	{ $current=$iv_ruleToken.current; }
	EOF;

// Rule Token
ruleToken returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getTokenAccess().getTokenAction_0(),
					$current);
			}
		)
		otherlv_1='token'
		{
			newLeafNode(otherlv_1, grammarAccess.getTokenAccess().getTokenKeyword_1());
		}
	)
;

// Entry rule entryRuleTransition
entryRuleTransition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransitionRule()); }
	iv_ruleTransition=ruleTransition
	{ $current=$iv_ruleTransition.current; }
	EOF;

// Rule Transition
ruleTransition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='transition'
		{
			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getTransitionAccess().getUnorderedGroup_3());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getTransitionAccess().getUnorderedGroup_3(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getTransitionAccess().getUnorderedGroup_3(), 0);
					}
								({true}?=>(otherlv_4='out'
								{
									newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getOutKeyword_3_0_0());
								}
								otherlv_5='{'
								{
									newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_3_0_1());
								}
								(
									(
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getTransitionRule());
											}
										}
										otherlv_6=RULE_ID
										{
											newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getOutTPArcCrossReference_3_0_2_0());
										}
									)
								)*
								otherlv_7='}'
								{
									newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_3_0_3());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTransitionAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getTransitionAccess().getUnorderedGroup_3(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getTransitionAccess().getUnorderedGroup_3(), 1);
					}
								({true}?=>(otherlv_8='in'
								{
									newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getInKeyword_3_1_0());
								}
								otherlv_9='{'
								{
									newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_3_1_1());
								}
								(
									(
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getTransitionRule());
											}
										}
										otherlv_10=RULE_ID
										{
											newLeafNode(otherlv_10, grammarAccess.getTransitionAccess().getInPTArcCrossReference_3_1_2_0());
										}
									)
								)*
								otherlv_11='}'
								{
									newLeafNode(otherlv_11, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_3_1_3());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTransitionAccess().getUnorderedGroup_3());
					}
				)
			)
					)+
					{getUnorderedGroupHelper().canLeave(grammarAccess.getTransitionAccess().getUnorderedGroup_3())}?
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getTransitionAccess().getUnorderedGroup_3());
				}
		)
		otherlv_12='}'
		{
			newLeafNode(otherlv_12, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleArc
entryRuleArc returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getArcRule()); }
	iv_ruleArc=ruleArc
	{ $current=$iv_ruleArc.current; }
	EOF;

// Rule Arc
ruleArc returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getArcAccess().getPTArcParserRuleCall_0());
		}
		this_PTArc_0=rulePTArc
		{
			$current = $this_PTArc_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getArcAccess().getTPArcParserRuleCall_1());
		}
		this_TPArc_1=ruleTPArc
		{
			$current = $this_TPArc_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRulePTArc
entryRulePTArc returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPTArcRule()); }
	iv_rulePTArc=rulePTArc
	{ $current=$iv_rulePTArc.current; }
	EOF;

// Rule PTArc
rulePTArc returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ptarc'
		{
			newLeafNode(otherlv_0, grammarAccess.getPTArcAccess().getPtarcKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPTArcAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPTArcRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='weight'
		{
			newLeafNode(otherlv_2, grammarAccess.getPTArcAccess().getWeightKeyword_2());
		}
		(
			(
				lv_weight_3_0=RULE_INT
				{
					newLeafNode(lv_weight_3_0, grammarAccess.getPTArcAccess().getWeightINTTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPTArcRule());
					}
					setWithLastConsumed(
						$current,
						"weight",
						lv_weight_3_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_4='place'
		{
			newLeafNode(otherlv_4, grammarAccess.getPTArcAccess().getPlaceKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPTArcRule());
					}
				}
				otherlv_5=RULE_ID
				{
					newLeafNode(otherlv_5, grammarAccess.getPTArcAccess().getSourcePlaceCrossReference_5_0());
				}
			)
		)
		otherlv_6='transition'
		{
			newLeafNode(otherlv_6, grammarAccess.getPTArcAccess().getTransitionKeyword_6());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPTArcRule());
					}
				}
				otherlv_7=RULE_ID
				{
					newLeafNode(otherlv_7, grammarAccess.getPTArcAccess().getTargetTransitionCrossReference_7_0());
				}
			)
		)
	)
;

// Entry rule entryRuleTPArc
entryRuleTPArc returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTPArcRule()); }
	iv_ruleTPArc=ruleTPArc
	{ $current=$iv_ruleTPArc.current; }
	EOF;

// Rule TPArc
ruleTPArc returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='tparc'
		{
			newLeafNode(otherlv_0, grammarAccess.getTPArcAccess().getTparcKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getTPArcAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTPArcRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='weight'
		{
			newLeafNode(otherlv_2, grammarAccess.getTPArcAccess().getWeightKeyword_2());
		}
		(
			(
				lv_weight_3_0=RULE_INT
				{
					newLeafNode(lv_weight_3_0, grammarAccess.getTPArcAccess().getWeightINTTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTPArcRule());
					}
					setWithLastConsumed(
						$current,
						"weight",
						lv_weight_3_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_4='transition'
		{
			newLeafNode(otherlv_4, grammarAccess.getTPArcAccess().getTransitionKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTPArcRule());
					}
				}
				otherlv_5=RULE_ID
				{
					newLeafNode(otherlv_5, grammarAccess.getTPArcAccess().getSourceTransitionCrossReference_5_0());
				}
			)
		)
		otherlv_6='place'
		{
			newLeafNode(otherlv_6, grammarAccess.getTPArcAccess().getPlaceKeyword_6());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTPArcRule());
					}
				}
				otherlv_7=RULE_ID
				{
					newLeafNode(otherlv_7, grammarAccess.getTPArcAccess().getTargetPlaceCrossReference_7_0());
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
