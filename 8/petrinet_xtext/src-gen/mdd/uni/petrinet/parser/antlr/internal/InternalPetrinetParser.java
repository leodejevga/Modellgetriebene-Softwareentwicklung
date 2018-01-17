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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPetrinetParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'petrinet'", "'{'", "'places'", "'}'", "'transitions'", "'arcs'", "'place'", "'tokens'", "'out'", "'in'", "'token'", "'transition'", "'ptarc'", "'weight'", "'tparc'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPetrinetParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPetrinetParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPetrinetParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPetrinet.g"; }



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




    // $ANTLR start "entryRulePetrinet"
    // InternalPetrinet.g:64:1: entryRulePetrinet returns [EObject current=null] : iv_rulePetrinet= rulePetrinet EOF ;
    public final EObject entryRulePetrinet() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePetrinet = null;


        try {
            // InternalPetrinet.g:64:49: (iv_rulePetrinet= rulePetrinet EOF )
            // InternalPetrinet.g:65:2: iv_rulePetrinet= rulePetrinet EOF
            {
             newCompositeNode(grammarAccess.getPetrinetRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePetrinet=rulePetrinet();

            state._fsp--;

             current =iv_rulePetrinet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePetrinet"


    // $ANTLR start "rulePetrinet"
    // InternalPetrinet.g:71:1: rulePetrinet returns [EObject current=null] : (otherlv_0= 'petrinet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'places' otherlv_4= '{' ( (lv_places_5_0= rulePlace ) )* otherlv_6= '}' ) (otherlv_7= 'transitions' otherlv_8= '{' ( (lv_transitions_9_0= ruleTransition ) )* otherlv_10= '}' ) (otherlv_11= 'arcs' otherlv_12= '{' ( (lv_arcs_13_0= ruleArc ) )* otherlv_14= '}' ) ) otherlv_15= '}' ) ;
    public final EObject rulePetrinet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_places_5_0 = null;

        EObject lv_transitions_9_0 = null;

        EObject lv_arcs_13_0 = null;



        	enterRule();

        try {
            // InternalPetrinet.g:77:2: ( (otherlv_0= 'petrinet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'places' otherlv_4= '{' ( (lv_places_5_0= rulePlace ) )* otherlv_6= '}' ) (otherlv_7= 'transitions' otherlv_8= '{' ( (lv_transitions_9_0= ruleTransition ) )* otherlv_10= '}' ) (otherlv_11= 'arcs' otherlv_12= '{' ( (lv_arcs_13_0= ruleArc ) )* otherlv_14= '}' ) ) otherlv_15= '}' ) )
            // InternalPetrinet.g:78:2: (otherlv_0= 'petrinet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'places' otherlv_4= '{' ( (lv_places_5_0= rulePlace ) )* otherlv_6= '}' ) (otherlv_7= 'transitions' otherlv_8= '{' ( (lv_transitions_9_0= ruleTransition ) )* otherlv_10= '}' ) (otherlv_11= 'arcs' otherlv_12= '{' ( (lv_arcs_13_0= ruleArc ) )* otherlv_14= '}' ) ) otherlv_15= '}' )
            {
            // InternalPetrinet.g:78:2: (otherlv_0= 'petrinet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'places' otherlv_4= '{' ( (lv_places_5_0= rulePlace ) )* otherlv_6= '}' ) (otherlv_7= 'transitions' otherlv_8= '{' ( (lv_transitions_9_0= ruleTransition ) )* otherlv_10= '}' ) (otherlv_11= 'arcs' otherlv_12= '{' ( (lv_arcs_13_0= ruleArc ) )* otherlv_14= '}' ) ) otherlv_15= '}' )
            // InternalPetrinet.g:79:3: otherlv_0= 'petrinet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'places' otherlv_4= '{' ( (lv_places_5_0= rulePlace ) )* otherlv_6= '}' ) (otherlv_7= 'transitions' otherlv_8= '{' ( (lv_transitions_9_0= ruleTransition ) )* otherlv_10= '}' ) (otherlv_11= 'arcs' otherlv_12= '{' ( (lv_arcs_13_0= ruleArc ) )* otherlv_14= '}' ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPetrinetAccess().getPetrinetKeyword_0());
            		
            // InternalPetrinet.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPetrinet.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPetrinet.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalPetrinet.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPetrinetAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPetrinetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getPetrinetAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPetrinet.g:105:3: ( (otherlv_3= 'places' otherlv_4= '{' ( (lv_places_5_0= rulePlace ) )* otherlv_6= '}' ) (otherlv_7= 'transitions' otherlv_8= '{' ( (lv_transitions_9_0= ruleTransition ) )* otherlv_10= '}' ) (otherlv_11= 'arcs' otherlv_12= '{' ( (lv_arcs_13_0= ruleArc ) )* otherlv_14= '}' ) )
            // InternalPetrinet.g:106:4: (otherlv_3= 'places' otherlv_4= '{' ( (lv_places_5_0= rulePlace ) )* otherlv_6= '}' ) (otherlv_7= 'transitions' otherlv_8= '{' ( (lv_transitions_9_0= ruleTransition ) )* otherlv_10= '}' ) (otherlv_11= 'arcs' otherlv_12= '{' ( (lv_arcs_13_0= ruleArc ) )* otherlv_14= '}' )
            {
            // InternalPetrinet.g:106:4: (otherlv_3= 'places' otherlv_4= '{' ( (lv_places_5_0= rulePlace ) )* otherlv_6= '}' )
            // InternalPetrinet.g:107:5: otherlv_3= 'places' otherlv_4= '{' ( (lv_places_5_0= rulePlace ) )* otherlv_6= '}'
            {
            otherlv_3=(Token)match(input,13,FOLLOW_4); 

            					newLeafNode(otherlv_3, grammarAccess.getPetrinetAccess().getPlacesKeyword_3_0_0());
            				
            otherlv_4=(Token)match(input,12,FOLLOW_6); 

            					newLeafNode(otherlv_4, grammarAccess.getPetrinetAccess().getLeftCurlyBracketKeyword_3_0_1());
            				
            // InternalPetrinet.g:115:5: ( (lv_places_5_0= rulePlace ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPetrinet.g:116:6: (lv_places_5_0= rulePlace )
            	    {
            	    // InternalPetrinet.g:116:6: (lv_places_5_0= rulePlace )
            	    // InternalPetrinet.g:117:7: lv_places_5_0= rulePlace
            	    {

            	    							newCompositeNode(grammarAccess.getPetrinetAccess().getPlacesPlaceParserRuleCall_3_0_2_0());
            	    						
            	    pushFollow(FOLLOW_6);
            	    lv_places_5_0=rulePlace();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getPetrinetRule());
            	    							}
            	    							add(
            	    								current,
            	    								"places",
            	    								lv_places_5_0,
            	    								"mdd.uni.petrinet.Petrinet.Place");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_7); 

            					newLeafNode(otherlv_6, grammarAccess.getPetrinetAccess().getRightCurlyBracketKeyword_3_0_3());
            				

            }

            // InternalPetrinet.g:139:4: (otherlv_7= 'transitions' otherlv_8= '{' ( (lv_transitions_9_0= ruleTransition ) )* otherlv_10= '}' )
            // InternalPetrinet.g:140:5: otherlv_7= 'transitions' otherlv_8= '{' ( (lv_transitions_9_0= ruleTransition ) )* otherlv_10= '}'
            {
            otherlv_7=(Token)match(input,15,FOLLOW_4); 

            					newLeafNode(otherlv_7, grammarAccess.getPetrinetAccess().getTransitionsKeyword_3_1_0());
            				
            otherlv_8=(Token)match(input,12,FOLLOW_8); 

            					newLeafNode(otherlv_8, grammarAccess.getPetrinetAccess().getLeftCurlyBracketKeyword_3_1_1());
            				
            // InternalPetrinet.g:148:5: ( (lv_transitions_9_0= ruleTransition ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPetrinet.g:149:6: (lv_transitions_9_0= ruleTransition )
            	    {
            	    // InternalPetrinet.g:149:6: (lv_transitions_9_0= ruleTransition )
            	    // InternalPetrinet.g:150:7: lv_transitions_9_0= ruleTransition
            	    {

            	    							newCompositeNode(grammarAccess.getPetrinetAccess().getTransitionsTransitionParserRuleCall_3_1_2_0());
            	    						
            	    pushFollow(FOLLOW_8);
            	    lv_transitions_9_0=ruleTransition();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getPetrinetRule());
            	    							}
            	    							add(
            	    								current,
            	    								"transitions",
            	    								lv_transitions_9_0,
            	    								"mdd.uni.petrinet.Petrinet.Transition");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_10=(Token)match(input,14,FOLLOW_9); 

            					newLeafNode(otherlv_10, grammarAccess.getPetrinetAccess().getRightCurlyBracketKeyword_3_1_3());
            				

            }

            // InternalPetrinet.g:172:4: (otherlv_11= 'arcs' otherlv_12= '{' ( (lv_arcs_13_0= ruleArc ) )* otherlv_14= '}' )
            // InternalPetrinet.g:173:5: otherlv_11= 'arcs' otherlv_12= '{' ( (lv_arcs_13_0= ruleArc ) )* otherlv_14= '}'
            {
            otherlv_11=(Token)match(input,16,FOLLOW_4); 

            					newLeafNode(otherlv_11, grammarAccess.getPetrinetAccess().getArcsKeyword_3_2_0());
            				
            otherlv_12=(Token)match(input,12,FOLLOW_10); 

            					newLeafNode(otherlv_12, grammarAccess.getPetrinetAccess().getLeftCurlyBracketKeyword_3_2_1());
            				
            // InternalPetrinet.g:181:5: ( (lv_arcs_13_0= ruleArc ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==23||LA3_0==25) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPetrinet.g:182:6: (lv_arcs_13_0= ruleArc )
            	    {
            	    // InternalPetrinet.g:182:6: (lv_arcs_13_0= ruleArc )
            	    // InternalPetrinet.g:183:7: lv_arcs_13_0= ruleArc
            	    {

            	    							newCompositeNode(grammarAccess.getPetrinetAccess().getArcsArcParserRuleCall_3_2_2_0());
            	    						
            	    pushFollow(FOLLOW_10);
            	    lv_arcs_13_0=ruleArc();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getPetrinetRule());
            	    							}
            	    							add(
            	    								current,
            	    								"arcs",
            	    								lv_arcs_13_0,
            	    								"mdd.uni.petrinet.Petrinet.Arc");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_14=(Token)match(input,14,FOLLOW_11); 

            					newLeafNode(otherlv_14, grammarAccess.getPetrinetAccess().getRightCurlyBracketKeyword_3_2_3());
            				

            }


            }

            otherlv_15=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getPetrinetAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePetrinet"


    // $ANTLR start "entryRulePlace"
    // InternalPetrinet.g:214:1: entryRulePlace returns [EObject current=null] : iv_rulePlace= rulePlace EOF ;
    public final EObject entryRulePlace() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlace = null;


        try {
            // InternalPetrinet.g:214:46: (iv_rulePlace= rulePlace EOF )
            // InternalPetrinet.g:215:2: iv_rulePlace= rulePlace EOF
            {
             newCompositeNode(grammarAccess.getPlaceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlace=rulePlace();

            state._fsp--;

             current =iv_rulePlace; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlace"


    // $ANTLR start "rulePlace"
    // InternalPetrinet.g:221:1: rulePlace returns [EObject current=null] : (otherlv_0= 'place' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'tokens' otherlv_4= '{' ( (lv_tokens_5_0= ruleToken ) )* otherlv_6= '}' ) (otherlv_7= 'out' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' ) (otherlv_11= 'in' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )* otherlv_14= '}' ) ) otherlv_15= '}' ) ;
    public final EObject rulePlace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_tokens_5_0 = null;



        	enterRule();

        try {
            // InternalPetrinet.g:227:2: ( (otherlv_0= 'place' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'tokens' otherlv_4= '{' ( (lv_tokens_5_0= ruleToken ) )* otherlv_6= '}' ) (otherlv_7= 'out' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' ) (otherlv_11= 'in' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )* otherlv_14= '}' ) ) otherlv_15= '}' ) )
            // InternalPetrinet.g:228:2: (otherlv_0= 'place' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'tokens' otherlv_4= '{' ( (lv_tokens_5_0= ruleToken ) )* otherlv_6= '}' ) (otherlv_7= 'out' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' ) (otherlv_11= 'in' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )* otherlv_14= '}' ) ) otherlv_15= '}' )
            {
            // InternalPetrinet.g:228:2: (otherlv_0= 'place' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'tokens' otherlv_4= '{' ( (lv_tokens_5_0= ruleToken ) )* otherlv_6= '}' ) (otherlv_7= 'out' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' ) (otherlv_11= 'in' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )* otherlv_14= '}' ) ) otherlv_15= '}' )
            // InternalPetrinet.g:229:3: otherlv_0= 'place' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'tokens' otherlv_4= '{' ( (lv_tokens_5_0= ruleToken ) )* otherlv_6= '}' ) (otherlv_7= 'out' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' ) (otherlv_11= 'in' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )* otherlv_14= '}' ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPlaceAccess().getPlaceKeyword_0());
            		
            // InternalPetrinet.g:233:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPetrinet.g:234:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPetrinet.g:234:4: (lv_name_1_0= RULE_ID )
            // InternalPetrinet.g:235:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlaceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlaceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getPlaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPetrinet.g:255:3: ( (otherlv_3= 'tokens' otherlv_4= '{' ( (lv_tokens_5_0= ruleToken ) )* otherlv_6= '}' ) (otherlv_7= 'out' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' ) (otherlv_11= 'in' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )* otherlv_14= '}' ) )
            // InternalPetrinet.g:256:4: (otherlv_3= 'tokens' otherlv_4= '{' ( (lv_tokens_5_0= ruleToken ) )* otherlv_6= '}' ) (otherlv_7= 'out' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' ) (otherlv_11= 'in' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )* otherlv_14= '}' )
            {
            // InternalPetrinet.g:256:4: (otherlv_3= 'tokens' otherlv_4= '{' ( (lv_tokens_5_0= ruleToken ) )* otherlv_6= '}' )
            // InternalPetrinet.g:257:5: otherlv_3= 'tokens' otherlv_4= '{' ( (lv_tokens_5_0= ruleToken ) )* otherlv_6= '}'
            {
            otherlv_3=(Token)match(input,18,FOLLOW_4); 

            					newLeafNode(otherlv_3, grammarAccess.getPlaceAccess().getTokensKeyword_3_0_0());
            				
            otherlv_4=(Token)match(input,12,FOLLOW_13); 

            					newLeafNode(otherlv_4, grammarAccess.getPlaceAccess().getLeftCurlyBracketKeyword_3_0_1());
            				
            // InternalPetrinet.g:265:5: ( (lv_tokens_5_0= ruleToken ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPetrinet.g:266:6: (lv_tokens_5_0= ruleToken )
            	    {
            	    // InternalPetrinet.g:266:6: (lv_tokens_5_0= ruleToken )
            	    // InternalPetrinet.g:267:7: lv_tokens_5_0= ruleToken
            	    {

            	    							newCompositeNode(grammarAccess.getPlaceAccess().getTokensTokenParserRuleCall_3_0_2_0());
            	    						
            	    pushFollow(FOLLOW_13);
            	    lv_tokens_5_0=ruleToken();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getPlaceRule());
            	    							}
            	    							add(
            	    								current,
            	    								"tokens",
            	    								lv_tokens_5_0,
            	    								"mdd.uni.petrinet.Petrinet.Token");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14); 

            					newLeafNode(otherlv_6, grammarAccess.getPlaceAccess().getRightCurlyBracketKeyword_3_0_3());
            				

            }

            // InternalPetrinet.g:289:4: (otherlv_7= 'out' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' )
            // InternalPetrinet.g:290:5: otherlv_7= 'out' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )* otherlv_10= '}'
            {
            otherlv_7=(Token)match(input,19,FOLLOW_4); 

            					newLeafNode(otherlv_7, grammarAccess.getPlaceAccess().getOutKeyword_3_1_0());
            				
            otherlv_8=(Token)match(input,12,FOLLOW_15); 

            					newLeafNode(otherlv_8, grammarAccess.getPlaceAccess().getLeftCurlyBracketKeyword_3_1_1());
            				
            // InternalPetrinet.g:298:5: ( (otherlv_9= RULE_ID ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPetrinet.g:299:6: (otherlv_9= RULE_ID )
            	    {
            	    // InternalPetrinet.g:299:6: (otherlv_9= RULE_ID )
            	    // InternalPetrinet.g:300:7: otherlv_9= RULE_ID
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getPlaceRule());
            	    							}
            	    						
            	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_15); 

            	    							newLeafNode(otherlv_9, grammarAccess.getPlaceAccess().getOutPTArcCrossReference_3_1_2_0());
            	    						

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_10=(Token)match(input,14,FOLLOW_16); 

            					newLeafNode(otherlv_10, grammarAccess.getPlaceAccess().getRightCurlyBracketKeyword_3_1_3());
            				

            }

            // InternalPetrinet.g:316:4: (otherlv_11= 'in' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )* otherlv_14= '}' )
            // InternalPetrinet.g:317:5: otherlv_11= 'in' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )* otherlv_14= '}'
            {
            otherlv_11=(Token)match(input,20,FOLLOW_4); 

            					newLeafNode(otherlv_11, grammarAccess.getPlaceAccess().getInKeyword_3_2_0());
            				
            otherlv_12=(Token)match(input,12,FOLLOW_15); 

            					newLeafNode(otherlv_12, grammarAccess.getPlaceAccess().getLeftCurlyBracketKeyword_3_2_1());
            				
            // InternalPetrinet.g:325:5: ( (otherlv_13= RULE_ID ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPetrinet.g:326:6: (otherlv_13= RULE_ID )
            	    {
            	    // InternalPetrinet.g:326:6: (otherlv_13= RULE_ID )
            	    // InternalPetrinet.g:327:7: otherlv_13= RULE_ID
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getPlaceRule());
            	    							}
            	    						
            	    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_15); 

            	    							newLeafNode(otherlv_13, grammarAccess.getPlaceAccess().getInTPArcCrossReference_3_2_2_0());
            	    						

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_14=(Token)match(input,14,FOLLOW_11); 

            					newLeafNode(otherlv_14, grammarAccess.getPlaceAccess().getRightCurlyBracketKeyword_3_2_3());
            				

            }


            }

            otherlv_15=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getPlaceAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlace"


    // $ANTLR start "entryRuleToken"
    // InternalPetrinet.g:352:1: entryRuleToken returns [EObject current=null] : iv_ruleToken= ruleToken EOF ;
    public final EObject entryRuleToken() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToken = null;


        try {
            // InternalPetrinet.g:352:46: (iv_ruleToken= ruleToken EOF )
            // InternalPetrinet.g:353:2: iv_ruleToken= ruleToken EOF
            {
             newCompositeNode(grammarAccess.getTokenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleToken=ruleToken();

            state._fsp--;

             current =iv_ruleToken; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleToken"


    // $ANTLR start "ruleToken"
    // InternalPetrinet.g:359:1: ruleToken returns [EObject current=null] : ( () otherlv_1= 'token' ) ;
    public final EObject ruleToken() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPetrinet.g:365:2: ( ( () otherlv_1= 'token' ) )
            // InternalPetrinet.g:366:2: ( () otherlv_1= 'token' )
            {
            // InternalPetrinet.g:366:2: ( () otherlv_1= 'token' )
            // InternalPetrinet.g:367:3: () otherlv_1= 'token'
            {
            // InternalPetrinet.g:367:3: ()
            // InternalPetrinet.g:368:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTokenAccess().getTokenAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getTokenAccess().getTokenKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleToken"


    // $ANTLR start "entryRuleTransition"
    // InternalPetrinet.g:382:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalPetrinet.g:382:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalPetrinet.g:383:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalPetrinet.g:389:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'out' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' ) (otherlv_7= 'in' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' ) ) otherlv_11= '}' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalPetrinet.g:395:2: ( (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'out' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' ) (otherlv_7= 'in' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' ) ) otherlv_11= '}' ) )
            // InternalPetrinet.g:396:2: (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'out' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' ) (otherlv_7= 'in' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' ) ) otherlv_11= '}' )
            {
            // InternalPetrinet.g:396:2: (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'out' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' ) (otherlv_7= 'in' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' ) ) otherlv_11= '}' )
            // InternalPetrinet.g:397:3: otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'out' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' ) (otherlv_7= 'in' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
            		
            // InternalPetrinet.g:401:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPetrinet.g:402:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPetrinet.g:402:4: (lv_name_1_0= RULE_ID )
            // InternalPetrinet.g:403:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPetrinet.g:423:3: ( (otherlv_3= 'out' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' ) (otherlv_7= 'in' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' ) )
            // InternalPetrinet.g:424:4: (otherlv_3= 'out' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' ) (otherlv_7= 'in' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' )
            {
            // InternalPetrinet.g:424:4: (otherlv_3= 'out' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )
            // InternalPetrinet.g:425:5: otherlv_3= 'out' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}'
            {
            otherlv_3=(Token)match(input,19,FOLLOW_4); 

            					newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getOutKeyword_3_0_0());
            				
            otherlv_4=(Token)match(input,12,FOLLOW_15); 

            					newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_3_0_1());
            				
            // InternalPetrinet.g:433:5: ( (otherlv_5= RULE_ID ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPetrinet.g:434:6: (otherlv_5= RULE_ID )
            	    {
            	    // InternalPetrinet.g:434:6: (otherlv_5= RULE_ID )
            	    // InternalPetrinet.g:435:7: otherlv_5= RULE_ID
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getTransitionRule());
            	    							}
            	    						
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_15); 

            	    							newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getOutTPArcCrossReference_3_0_2_0());
            	    						

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_16); 

            					newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_3_0_3());
            				

            }

            // InternalPetrinet.g:451:4: (otherlv_7= 'in' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' )
            // InternalPetrinet.g:452:5: otherlv_7= 'in' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )* otherlv_10= '}'
            {
            otherlv_7=(Token)match(input,20,FOLLOW_4); 

            					newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getInKeyword_3_1_0());
            				
            otherlv_8=(Token)match(input,12,FOLLOW_15); 

            					newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_3_1_1());
            				
            // InternalPetrinet.g:460:5: ( (otherlv_9= RULE_ID ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPetrinet.g:461:6: (otherlv_9= RULE_ID )
            	    {
            	    // InternalPetrinet.g:461:6: (otherlv_9= RULE_ID )
            	    // InternalPetrinet.g:462:7: otherlv_9= RULE_ID
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getTransitionRule());
            	    							}
            	    						
            	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_15); 

            	    							newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getInPTArcCrossReference_3_1_2_0());
            	    						

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_10=(Token)match(input,14,FOLLOW_11); 

            					newLeafNode(otherlv_10, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_3_1_3());
            				

            }


            }

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleArc"
    // InternalPetrinet.g:487:1: entryRuleArc returns [EObject current=null] : iv_ruleArc= ruleArc EOF ;
    public final EObject entryRuleArc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArc = null;


        try {
            // InternalPetrinet.g:487:44: (iv_ruleArc= ruleArc EOF )
            // InternalPetrinet.g:488:2: iv_ruleArc= ruleArc EOF
            {
             newCompositeNode(grammarAccess.getArcRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArc=ruleArc();

            state._fsp--;

             current =iv_ruleArc; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArc"


    // $ANTLR start "ruleArc"
    // InternalPetrinet.g:494:1: ruleArc returns [EObject current=null] : (this_PTArc_0= rulePTArc | this_TPArc_1= ruleTPArc ) ;
    public final EObject ruleArc() throws RecognitionException {
        EObject current = null;

        EObject this_PTArc_0 = null;

        EObject this_TPArc_1 = null;



        	enterRule();

        try {
            // InternalPetrinet.g:500:2: ( (this_PTArc_0= rulePTArc | this_TPArc_1= ruleTPArc ) )
            // InternalPetrinet.g:501:2: (this_PTArc_0= rulePTArc | this_TPArc_1= ruleTPArc )
            {
            // InternalPetrinet.g:501:2: (this_PTArc_0= rulePTArc | this_TPArc_1= ruleTPArc )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            else if ( (LA9_0==25) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalPetrinet.g:502:3: this_PTArc_0= rulePTArc
                    {

                    			newCompositeNode(grammarAccess.getArcAccess().getPTArcParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PTArc_0=rulePTArc();

                    state._fsp--;


                    			current = this_PTArc_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPetrinet.g:511:3: this_TPArc_1= ruleTPArc
                    {

                    			newCompositeNode(grammarAccess.getArcAccess().getTPArcParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TPArc_1=ruleTPArc();

                    state._fsp--;


                    			current = this_TPArc_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArc"


    // $ANTLR start "entryRulePTArc"
    // InternalPetrinet.g:523:1: entryRulePTArc returns [EObject current=null] : iv_rulePTArc= rulePTArc EOF ;
    public final EObject entryRulePTArc() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePTArc = null;


        try {
            // InternalPetrinet.g:523:46: (iv_rulePTArc= rulePTArc EOF )
            // InternalPetrinet.g:524:2: iv_rulePTArc= rulePTArc EOF
            {
             newCompositeNode(grammarAccess.getPTArcRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePTArc=rulePTArc();

            state._fsp--;

             current =iv_rulePTArc; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePTArc"


    // $ANTLR start "rulePTArc"
    // InternalPetrinet.g:530:1: rulePTArc returns [EObject current=null] : (otherlv_0= 'ptarc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'weight' ( (lv_weight_3_0= RULE_INT ) ) otherlv_4= 'place' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'transition' ( (otherlv_7= RULE_ID ) ) ) ;
    public final EObject rulePTArc() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_weight_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalPetrinet.g:536:2: ( (otherlv_0= 'ptarc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'weight' ( (lv_weight_3_0= RULE_INT ) ) otherlv_4= 'place' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'transition' ( (otherlv_7= RULE_ID ) ) ) )
            // InternalPetrinet.g:537:2: (otherlv_0= 'ptarc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'weight' ( (lv_weight_3_0= RULE_INT ) ) otherlv_4= 'place' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'transition' ( (otherlv_7= RULE_ID ) ) )
            {
            // InternalPetrinet.g:537:2: (otherlv_0= 'ptarc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'weight' ( (lv_weight_3_0= RULE_INT ) ) otherlv_4= 'place' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'transition' ( (otherlv_7= RULE_ID ) ) )
            // InternalPetrinet.g:538:3: otherlv_0= 'ptarc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'weight' ( (lv_weight_3_0= RULE_INT ) ) otherlv_4= 'place' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'transition' ( (otherlv_7= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPTArcAccess().getPtarcKeyword_0());
            		
            // InternalPetrinet.g:542:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPetrinet.g:543:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPetrinet.g:543:4: (lv_name_1_0= RULE_ID )
            // InternalPetrinet.g:544:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPTArcAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPTArcRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getPTArcAccess().getWeightKeyword_2());
            		
            // InternalPetrinet.g:564:3: ( (lv_weight_3_0= RULE_INT ) )
            // InternalPetrinet.g:565:4: (lv_weight_3_0= RULE_INT )
            {
            // InternalPetrinet.g:565:4: (lv_weight_3_0= RULE_INT )
            // InternalPetrinet.g:566:5: lv_weight_3_0= RULE_INT
            {
            lv_weight_3_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_weight_3_0, grammarAccess.getPTArcAccess().getWeightINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPTArcRule());
            					}
            					setWithLastConsumed(
            						current,
            						"weight",
            						lv_weight_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getPTArcAccess().getPlaceKeyword_4());
            		
            // InternalPetrinet.g:586:3: ( (otherlv_5= RULE_ID ) )
            // InternalPetrinet.g:587:4: (otherlv_5= RULE_ID )
            {
            // InternalPetrinet.g:587:4: (otherlv_5= RULE_ID )
            // InternalPetrinet.g:588:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPTArcRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_5, grammarAccess.getPTArcAccess().getSourcePlaceCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getPTArcAccess().getTransitionKeyword_6());
            		
            // InternalPetrinet.g:603:3: ( (otherlv_7= RULE_ID ) )
            // InternalPetrinet.g:604:4: (otherlv_7= RULE_ID )
            {
            // InternalPetrinet.g:604:4: (otherlv_7= RULE_ID )
            // InternalPetrinet.g:605:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPTArcRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_7, grammarAccess.getPTArcAccess().getTargetTransitionCrossReference_7_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePTArc"


    // $ANTLR start "entryRuleTPArc"
    // InternalPetrinet.g:620:1: entryRuleTPArc returns [EObject current=null] : iv_ruleTPArc= ruleTPArc EOF ;
    public final EObject entryRuleTPArc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTPArc = null;


        try {
            // InternalPetrinet.g:620:46: (iv_ruleTPArc= ruleTPArc EOF )
            // InternalPetrinet.g:621:2: iv_ruleTPArc= ruleTPArc EOF
            {
             newCompositeNode(grammarAccess.getTPArcRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTPArc=ruleTPArc();

            state._fsp--;

             current =iv_ruleTPArc; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTPArc"


    // $ANTLR start "ruleTPArc"
    // InternalPetrinet.g:627:1: ruleTPArc returns [EObject current=null] : (otherlv_0= 'tparc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'weight' ( (lv_weight_3_0= RULE_INT ) ) otherlv_4= 'transition' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'place' ( (otherlv_7= RULE_ID ) ) ) ;
    public final EObject ruleTPArc() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_weight_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalPetrinet.g:633:2: ( (otherlv_0= 'tparc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'weight' ( (lv_weight_3_0= RULE_INT ) ) otherlv_4= 'transition' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'place' ( (otherlv_7= RULE_ID ) ) ) )
            // InternalPetrinet.g:634:2: (otherlv_0= 'tparc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'weight' ( (lv_weight_3_0= RULE_INT ) ) otherlv_4= 'transition' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'place' ( (otherlv_7= RULE_ID ) ) )
            {
            // InternalPetrinet.g:634:2: (otherlv_0= 'tparc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'weight' ( (lv_weight_3_0= RULE_INT ) ) otherlv_4= 'transition' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'place' ( (otherlv_7= RULE_ID ) ) )
            // InternalPetrinet.g:635:3: otherlv_0= 'tparc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'weight' ( (lv_weight_3_0= RULE_INT ) ) otherlv_4= 'transition' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'place' ( (otherlv_7= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTPArcAccess().getTparcKeyword_0());
            		
            // InternalPetrinet.g:639:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPetrinet.g:640:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPetrinet.g:640:4: (lv_name_1_0= RULE_ID )
            // InternalPetrinet.g:641:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTPArcAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTPArcRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getTPArcAccess().getWeightKeyword_2());
            		
            // InternalPetrinet.g:661:3: ( (lv_weight_3_0= RULE_INT ) )
            // InternalPetrinet.g:662:4: (lv_weight_3_0= RULE_INT )
            {
            // InternalPetrinet.g:662:4: (lv_weight_3_0= RULE_INT )
            // InternalPetrinet.g:663:5: lv_weight_3_0= RULE_INT
            {
            lv_weight_3_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_weight_3_0, grammarAccess.getTPArcAccess().getWeightINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTPArcRule());
            					}
            					setWithLastConsumed(
            						current,
            						"weight",
            						lv_weight_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getTPArcAccess().getTransitionKeyword_4());
            		
            // InternalPetrinet.g:683:3: ( (otherlv_5= RULE_ID ) )
            // InternalPetrinet.g:684:4: (otherlv_5= RULE_ID )
            {
            // InternalPetrinet.g:684:4: (otherlv_5= RULE_ID )
            // InternalPetrinet.g:685:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTPArcRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_5, grammarAccess.getTPArcAccess().getSourceTransitionCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getTPArcAccess().getPlaceKeyword_6());
            		
            // InternalPetrinet.g:700:3: ( (otherlv_7= RULE_ID ) )
            // InternalPetrinet.g:701:4: (otherlv_7= RULE_ID )
            {
            // InternalPetrinet.g:701:4: (otherlv_7= RULE_ID )
            // InternalPetrinet.g:702:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTPArcRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_7, grammarAccess.getTPArcAccess().getTargetPlaceCrossReference_7_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTPArc"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002804000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});

}