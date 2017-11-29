package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.PetriNetzGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPetriNetzParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'petrinet'", "'{'", "'}'", "'place'", "':'", "','", "'out'", "'in'", "'token'", "'transition'", "'arc'", "'>'", "'<'"
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
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPetriNetzParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPetriNetzParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPetriNetzParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPetriNetz.g"; }



     	private PetriNetzGrammarAccess grammarAccess;

        public InternalPetriNetzParser(TokenStream input, PetriNetzGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Petrinet";
       	}

       	@Override
       	protected PetriNetzGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePetrinet"
    // InternalPetriNetz.g:64:1: entryRulePetrinet returns [EObject current=null] : iv_rulePetrinet= rulePetrinet EOF ;
    public final EObject entryRulePetrinet() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePetrinet = null;


        try {
            // InternalPetriNetz.g:64:49: (iv_rulePetrinet= rulePetrinet EOF )
            // InternalPetriNetz.g:65:2: iv_rulePetrinet= rulePetrinet EOF
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
    // InternalPetriNetz.g:71:1: rulePetrinet returns [EObject current=null] : (otherlv_0= 'petrinet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_places_3_0= rulePlace ) )* ( (lv_transitions_4_0= ruleTransition ) )* ( (lv_arcs_5_0= ruleArc ) )* otherlv_6= '}' ) ;
    public final EObject rulePetrinet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_places_3_0 = null;

        EObject lv_transitions_4_0 = null;

        EObject lv_arcs_5_0 = null;



        	enterRule();

        try {
            // InternalPetriNetz.g:77:2: ( (otherlv_0= 'petrinet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_places_3_0= rulePlace ) )* ( (lv_transitions_4_0= ruleTransition ) )* ( (lv_arcs_5_0= ruleArc ) )* otherlv_6= '}' ) )
            // InternalPetriNetz.g:78:2: (otherlv_0= 'petrinet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_places_3_0= rulePlace ) )* ( (lv_transitions_4_0= ruleTransition ) )* ( (lv_arcs_5_0= ruleArc ) )* otherlv_6= '}' )
            {
            // InternalPetriNetz.g:78:2: (otherlv_0= 'petrinet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_places_3_0= rulePlace ) )* ( (lv_transitions_4_0= ruleTransition ) )* ( (lv_arcs_5_0= ruleArc ) )* otherlv_6= '}' )
            // InternalPetriNetz.g:79:3: otherlv_0= 'petrinet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_places_3_0= rulePlace ) )* ( (lv_transitions_4_0= ruleTransition ) )* ( (lv_arcs_5_0= ruleArc ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPetrinetAccess().getPetrinetKeyword_0());
            		
            // InternalPetriNetz.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPetriNetz.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPetriNetz.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalPetriNetz.g:85:5: lv_name_1_0= RULE_ID
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
            		
            // InternalPetriNetz.g:105:3: ( (lv_places_3_0= rulePlace ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPetriNetz.g:106:4: (lv_places_3_0= rulePlace )
            	    {
            	    // InternalPetriNetz.g:106:4: (lv_places_3_0= rulePlace )
            	    // InternalPetriNetz.g:107:5: lv_places_3_0= rulePlace
            	    {

            	    					newCompositeNode(grammarAccess.getPetrinetAccess().getPlacesPlaceParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_places_3_0=rulePlace();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPetrinetRule());
            	    					}
            	    					add(
            	    						current,
            	    						"places",
            	    						lv_places_3_0,
            	    						"org.xtext.example.mydsl.PetriNetz.Place");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalPetriNetz.g:124:3: ( (lv_transitions_4_0= ruleTransition ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPetriNetz.g:125:4: (lv_transitions_4_0= ruleTransition )
            	    {
            	    // InternalPetriNetz.g:125:4: (lv_transitions_4_0= ruleTransition )
            	    // InternalPetriNetz.g:126:5: lv_transitions_4_0= ruleTransition
            	    {

            	    					newCompositeNode(grammarAccess.getPetrinetAccess().getTransitionsTransitionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_transitions_4_0=ruleTransition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPetrinetRule());
            	    					}
            	    					add(
            	    						current,
            	    						"transitions",
            	    						lv_transitions_4_0,
            	    						"org.xtext.example.mydsl.PetriNetz.Transition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalPetriNetz.g:143:3: ( (lv_arcs_5_0= ruleArc ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPetriNetz.g:144:4: (lv_arcs_5_0= ruleArc )
            	    {
            	    // InternalPetriNetz.g:144:4: (lv_arcs_5_0= ruleArc )
            	    // InternalPetriNetz.g:145:5: lv_arcs_5_0= ruleArc
            	    {

            	    					newCompositeNode(grammarAccess.getPetrinetAccess().getArcsArcParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_arcs_5_0=ruleArc();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPetrinetRule());
            	    					}
            	    					add(
            	    						current,
            	    						"arcs",
            	    						lv_arcs_5_0,
            	    						"org.xtext.example.mydsl.PetriNetz.Arc");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPetrinetAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalPetriNetz.g:170:1: entryRulePlace returns [EObject current=null] : iv_rulePlace= rulePlace EOF ;
    public final EObject entryRulePlace() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlace = null;


        try {
            // InternalPetriNetz.g:170:46: (iv_rulePlace= rulePlace EOF )
            // InternalPetriNetz.g:171:2: iv_rulePlace= rulePlace EOF
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
    // InternalPetriNetz.g:177:1: rulePlace returns [EObject current=null] : (otherlv_0= 'place' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_tokens_3_0= ruleToken ) ) (otherlv_4= ',' ( (lv_tokens_5_0= ruleToken ) ) )* )? otherlv_6= '{' (otherlv_7= 'out' otherlv_8= ':' ( (lv_out_9_0= rulePTArc ) ) (otherlv_10= ',' ( (lv_out_11_0= rulePTArc ) ) )* )? (otherlv_12= 'in' otherlv_13= ':' ( (lv_in_14_0= ruleTPArc ) ) (otherlv_15= ',' ( (lv_in_16_0= ruleTPArc ) ) )* )? otherlv_17= '}' ) ;
    public final EObject rulePlace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject lv_tokens_3_0 = null;

        EObject lv_tokens_5_0 = null;

        EObject lv_out_9_0 = null;

        EObject lv_out_11_0 = null;

        EObject lv_in_14_0 = null;

        EObject lv_in_16_0 = null;



        	enterRule();

        try {
            // InternalPetriNetz.g:183:2: ( (otherlv_0= 'place' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_tokens_3_0= ruleToken ) ) (otherlv_4= ',' ( (lv_tokens_5_0= ruleToken ) ) )* )? otherlv_6= '{' (otherlv_7= 'out' otherlv_8= ':' ( (lv_out_9_0= rulePTArc ) ) (otherlv_10= ',' ( (lv_out_11_0= rulePTArc ) ) )* )? (otherlv_12= 'in' otherlv_13= ':' ( (lv_in_14_0= ruleTPArc ) ) (otherlv_15= ',' ( (lv_in_16_0= ruleTPArc ) ) )* )? otherlv_17= '}' ) )
            // InternalPetriNetz.g:184:2: (otherlv_0= 'place' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_tokens_3_0= ruleToken ) ) (otherlv_4= ',' ( (lv_tokens_5_0= ruleToken ) ) )* )? otherlv_6= '{' (otherlv_7= 'out' otherlv_8= ':' ( (lv_out_9_0= rulePTArc ) ) (otherlv_10= ',' ( (lv_out_11_0= rulePTArc ) ) )* )? (otherlv_12= 'in' otherlv_13= ':' ( (lv_in_14_0= ruleTPArc ) ) (otherlv_15= ',' ( (lv_in_16_0= ruleTPArc ) ) )* )? otherlv_17= '}' )
            {
            // InternalPetriNetz.g:184:2: (otherlv_0= 'place' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_tokens_3_0= ruleToken ) ) (otherlv_4= ',' ( (lv_tokens_5_0= ruleToken ) ) )* )? otherlv_6= '{' (otherlv_7= 'out' otherlv_8= ':' ( (lv_out_9_0= rulePTArc ) ) (otherlv_10= ',' ( (lv_out_11_0= rulePTArc ) ) )* )? (otherlv_12= 'in' otherlv_13= ':' ( (lv_in_14_0= ruleTPArc ) ) (otherlv_15= ',' ( (lv_in_16_0= ruleTPArc ) ) )* )? otherlv_17= '}' )
            // InternalPetriNetz.g:185:3: otherlv_0= 'place' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_tokens_3_0= ruleToken ) ) (otherlv_4= ',' ( (lv_tokens_5_0= ruleToken ) ) )* )? otherlv_6= '{' (otherlv_7= 'out' otherlv_8= ':' ( (lv_out_9_0= rulePTArc ) ) (otherlv_10= ',' ( (lv_out_11_0= rulePTArc ) ) )* )? (otherlv_12= 'in' otherlv_13= ':' ( (lv_in_14_0= ruleTPArc ) ) (otherlv_15= ',' ( (lv_in_16_0= ruleTPArc ) ) )* )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPlaceAccess().getPlaceKeyword_0());
            		
            // InternalPetriNetz.g:189:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPetriNetz.g:190:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPetriNetz.g:190:4: (lv_name_1_0= RULE_ID )
            // InternalPetriNetz.g:191:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getPlaceAccess().getColonKeyword_2());
            		
            // InternalPetriNetz.g:211:3: ( ( (lv_tokens_3_0= ruleToken ) ) (otherlv_4= ',' ( (lv_tokens_5_0= ruleToken ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPetriNetz.g:212:4: ( (lv_tokens_3_0= ruleToken ) ) (otherlv_4= ',' ( (lv_tokens_5_0= ruleToken ) ) )*
                    {
                    // InternalPetriNetz.g:212:4: ( (lv_tokens_3_0= ruleToken ) )
                    // InternalPetriNetz.g:213:5: (lv_tokens_3_0= ruleToken )
                    {
                    // InternalPetriNetz.g:213:5: (lv_tokens_3_0= ruleToken )
                    // InternalPetriNetz.g:214:6: lv_tokens_3_0= ruleToken
                    {

                    						newCompositeNode(grammarAccess.getPlaceAccess().getTokensTokenParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_tokens_3_0=ruleToken();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPlaceRule());
                    						}
                    						add(
                    							current,
                    							"tokens",
                    							lv_tokens_3_0,
                    							"org.xtext.example.mydsl.PetriNetz.Token");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPetriNetz.g:231:4: (otherlv_4= ',' ( (lv_tokens_5_0= ruleToken ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==16) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalPetriNetz.g:232:5: otherlv_4= ',' ( (lv_tokens_5_0= ruleToken ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getPlaceAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalPetriNetz.g:236:5: ( (lv_tokens_5_0= ruleToken ) )
                    	    // InternalPetriNetz.g:237:6: (lv_tokens_5_0= ruleToken )
                    	    {
                    	    // InternalPetriNetz.g:237:6: (lv_tokens_5_0= ruleToken )
                    	    // InternalPetriNetz.g:238:7: lv_tokens_5_0= ruleToken
                    	    {

                    	    							newCompositeNode(grammarAccess.getPlaceAccess().getTokensTokenParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_tokens_5_0=ruleToken();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPlaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"tokens",
                    	    								lv_tokens_5_0,
                    	    								"org.xtext.example.mydsl.PetriNetz.Token");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getPlaceAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalPetriNetz.g:261:3: (otherlv_7= 'out' otherlv_8= ':' ( (lv_out_9_0= rulePTArc ) ) (otherlv_10= ',' ( (lv_out_11_0= rulePTArc ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPetriNetz.g:262:4: otherlv_7= 'out' otherlv_8= ':' ( (lv_out_9_0= rulePTArc ) ) (otherlv_10= ',' ( (lv_out_11_0= rulePTArc ) ) )*
                    {
                    otherlv_7=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getPlaceAccess().getOutKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getPlaceAccess().getColonKeyword_5_1());
                    			
                    // InternalPetriNetz.g:270:4: ( (lv_out_9_0= rulePTArc ) )
                    // InternalPetriNetz.g:271:5: (lv_out_9_0= rulePTArc )
                    {
                    // InternalPetriNetz.g:271:5: (lv_out_9_0= rulePTArc )
                    // InternalPetriNetz.g:272:6: lv_out_9_0= rulePTArc
                    {

                    						newCompositeNode(grammarAccess.getPlaceAccess().getOutPTArcParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_out_9_0=rulePTArc();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPlaceRule());
                    						}
                    						add(
                    							current,
                    							"out",
                    							lv_out_9_0,
                    							"org.xtext.example.mydsl.PetriNetz.PTArc");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPetriNetz.g:289:4: (otherlv_10= ',' ( (lv_out_11_0= rulePTArc ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==16) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalPetriNetz.g:290:5: otherlv_10= ',' ( (lv_out_11_0= rulePTArc ) )
                    	    {
                    	    otherlv_10=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getPlaceAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalPetriNetz.g:294:5: ( (lv_out_11_0= rulePTArc ) )
                    	    // InternalPetriNetz.g:295:6: (lv_out_11_0= rulePTArc )
                    	    {
                    	    // InternalPetriNetz.g:295:6: (lv_out_11_0= rulePTArc )
                    	    // InternalPetriNetz.g:296:7: lv_out_11_0= rulePTArc
                    	    {

                    	    							newCompositeNode(grammarAccess.getPlaceAccess().getOutPTArcParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_out_11_0=rulePTArc();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPlaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"out",
                    	    								lv_out_11_0,
                    	    								"org.xtext.example.mydsl.PetriNetz.PTArc");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalPetriNetz.g:315:3: (otherlv_12= 'in' otherlv_13= ':' ( (lv_in_14_0= ruleTPArc ) ) (otherlv_15= ',' ( (lv_in_16_0= ruleTPArc ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPetriNetz.g:316:4: otherlv_12= 'in' otherlv_13= ':' ( (lv_in_14_0= ruleTPArc ) ) (otherlv_15= ',' ( (lv_in_16_0= ruleTPArc ) ) )*
                    {
                    otherlv_12=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_12, grammarAccess.getPlaceAccess().getInKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getPlaceAccess().getColonKeyword_6_1());
                    			
                    // InternalPetriNetz.g:324:4: ( (lv_in_14_0= ruleTPArc ) )
                    // InternalPetriNetz.g:325:5: (lv_in_14_0= ruleTPArc )
                    {
                    // InternalPetriNetz.g:325:5: (lv_in_14_0= ruleTPArc )
                    // InternalPetriNetz.g:326:6: lv_in_14_0= ruleTPArc
                    {

                    						newCompositeNode(grammarAccess.getPlaceAccess().getInTPArcParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_in_14_0=ruleTPArc();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPlaceRule());
                    						}
                    						add(
                    							current,
                    							"in",
                    							lv_in_14_0,
                    							"org.xtext.example.mydsl.PetriNetz.TPArc");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPetriNetz.g:343:4: (otherlv_15= ',' ( (lv_in_16_0= ruleTPArc ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==16) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalPetriNetz.g:344:5: otherlv_15= ',' ( (lv_in_16_0= ruleTPArc ) )
                    	    {
                    	    otherlv_15=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getPlaceAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalPetriNetz.g:348:5: ( (lv_in_16_0= ruleTPArc ) )
                    	    // InternalPetriNetz.g:349:6: (lv_in_16_0= ruleTPArc )
                    	    {
                    	    // InternalPetriNetz.g:349:6: (lv_in_16_0= ruleTPArc )
                    	    // InternalPetriNetz.g:350:7: lv_in_16_0= ruleTPArc
                    	    {

                    	    							newCompositeNode(grammarAccess.getPlaceAccess().getInTPArcParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_in_16_0=ruleTPArc();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPlaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"in",
                    	    								lv_in_16_0,
                    	    								"org.xtext.example.mydsl.PetriNetz.TPArc");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_17=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getPlaceAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalPetriNetz.g:377:1: entryRuleToken returns [EObject current=null] : iv_ruleToken= ruleToken EOF ;
    public final EObject entryRuleToken() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToken = null;


        try {
            // InternalPetriNetz.g:377:46: (iv_ruleToken= ruleToken EOF )
            // InternalPetriNetz.g:378:2: iv_ruleToken= ruleToken EOF
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
    // InternalPetriNetz.g:384:1: ruleToken returns [EObject current=null] : ( () otherlv_1= 'token' ) ;
    public final EObject ruleToken() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPetriNetz.g:390:2: ( ( () otherlv_1= 'token' ) )
            // InternalPetriNetz.g:391:2: ( () otherlv_1= 'token' )
            {
            // InternalPetriNetz.g:391:2: ( () otherlv_1= 'token' )
            // InternalPetriNetz.g:392:3: () otherlv_1= 'token'
            {
            // InternalPetriNetz.g:392:3: ()
            // InternalPetriNetz.g:393:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTokenAccess().getTokenAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_2); 

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
    // InternalPetriNetz.g:407:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalPetriNetz.g:407:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalPetriNetz.g:408:2: iv_ruleTransition= ruleTransition EOF
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
    // InternalPetriNetz.g:414:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' (otherlv_4= 'in' otherlv_5= ':' ( (lv_in_6_0= rulePTArc ) ) (otherlv_7= ',' ( (lv_in_8_0= rulePTArc ) ) )* )? (otherlv_9= 'out' otherlv_10= ':' ( (lv_out_11_0= ruleTPArc ) ) (otherlv_12= ',' ( (lv_out_13_0= ruleTPArc ) ) )* )? otherlv_14= '}' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_in_6_0 = null;

        EObject lv_in_8_0 = null;

        EObject lv_out_11_0 = null;

        EObject lv_out_13_0 = null;



        	enterRule();

        try {
            // InternalPetriNetz.g:420:2: ( (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' (otherlv_4= 'in' otherlv_5= ':' ( (lv_in_6_0= rulePTArc ) ) (otherlv_7= ',' ( (lv_in_8_0= rulePTArc ) ) )* )? (otherlv_9= 'out' otherlv_10= ':' ( (lv_out_11_0= ruleTPArc ) ) (otherlv_12= ',' ( (lv_out_13_0= ruleTPArc ) ) )* )? otherlv_14= '}' ) )
            // InternalPetriNetz.g:421:2: (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' (otherlv_4= 'in' otherlv_5= ':' ( (lv_in_6_0= rulePTArc ) ) (otherlv_7= ',' ( (lv_in_8_0= rulePTArc ) ) )* )? (otherlv_9= 'out' otherlv_10= ':' ( (lv_out_11_0= ruleTPArc ) ) (otherlv_12= ',' ( (lv_out_13_0= ruleTPArc ) ) )* )? otherlv_14= '}' )
            {
            // InternalPetriNetz.g:421:2: (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' (otherlv_4= 'in' otherlv_5= ':' ( (lv_in_6_0= rulePTArc ) ) (otherlv_7= ',' ( (lv_in_8_0= rulePTArc ) ) )* )? (otherlv_9= 'out' otherlv_10= ':' ( (lv_out_11_0= ruleTPArc ) ) (otherlv_12= ',' ( (lv_out_13_0= ruleTPArc ) ) )* )? otherlv_14= '}' )
            // InternalPetriNetz.g:422:3: otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' (otherlv_4= 'in' otherlv_5= ':' ( (lv_in_6_0= rulePTArc ) ) (otherlv_7= ',' ( (lv_in_8_0= rulePTArc ) ) )* )? (otherlv_9= 'out' otherlv_10= ':' ( (lv_out_11_0= ruleTPArc ) ) (otherlv_12= ',' ( (lv_out_13_0= ruleTPArc ) ) )* )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
            		
            // InternalPetriNetz.g:426:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPetriNetz.g:427:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPetriNetz.g:427:4: (lv_name_1_0= RULE_ID )
            // InternalPetriNetz.g:428:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPetriNetz.g:452:3: (otherlv_4= 'in' otherlv_5= ':' ( (lv_in_6_0= rulePTArc ) ) (otherlv_7= ',' ( (lv_in_8_0= rulePTArc ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPetriNetz.g:453:4: otherlv_4= 'in' otherlv_5= ':' ( (lv_in_6_0= rulePTArc ) ) (otherlv_7= ',' ( (lv_in_8_0= rulePTArc ) ) )*
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getInKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getColonKeyword_4_1());
                    			
                    // InternalPetriNetz.g:461:4: ( (lv_in_6_0= rulePTArc ) )
                    // InternalPetriNetz.g:462:5: (lv_in_6_0= rulePTArc )
                    {
                    // InternalPetriNetz.g:462:5: (lv_in_6_0= rulePTArc )
                    // InternalPetriNetz.g:463:6: lv_in_6_0= rulePTArc
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getInPTArcParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_in_6_0=rulePTArc();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransitionRule());
                    						}
                    						add(
                    							current,
                    							"in",
                    							lv_in_6_0,
                    							"org.xtext.example.mydsl.PetriNetz.PTArc");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPetriNetz.g:480:4: (otherlv_7= ',' ( (lv_in_8_0= rulePTArc ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==16) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalPetriNetz.g:481:5: otherlv_7= ',' ( (lv_in_8_0= rulePTArc ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalPetriNetz.g:485:5: ( (lv_in_8_0= rulePTArc ) )
                    	    // InternalPetriNetz.g:486:6: (lv_in_8_0= rulePTArc )
                    	    {
                    	    // InternalPetriNetz.g:486:6: (lv_in_8_0= rulePTArc )
                    	    // InternalPetriNetz.g:487:7: lv_in_8_0= rulePTArc
                    	    {

                    	    							newCompositeNode(grammarAccess.getTransitionAccess().getInPTArcParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_in_8_0=rulePTArc();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"in",
                    	    								lv_in_8_0,
                    	    								"org.xtext.example.mydsl.PetriNetz.PTArc");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalPetriNetz.g:506:3: (otherlv_9= 'out' otherlv_10= ':' ( (lv_out_11_0= ruleTPArc ) ) (otherlv_12= ',' ( (lv_out_13_0= ruleTPArc ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPetriNetz.g:507:4: otherlv_9= 'out' otherlv_10= ':' ( (lv_out_11_0= ruleTPArc ) ) (otherlv_12= ',' ( (lv_out_13_0= ruleTPArc ) ) )*
                    {
                    otherlv_9=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getOutKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getTransitionAccess().getColonKeyword_5_1());
                    			
                    // InternalPetriNetz.g:515:4: ( (lv_out_11_0= ruleTPArc ) )
                    // InternalPetriNetz.g:516:5: (lv_out_11_0= ruleTPArc )
                    {
                    // InternalPetriNetz.g:516:5: (lv_out_11_0= ruleTPArc )
                    // InternalPetriNetz.g:517:6: lv_out_11_0= ruleTPArc
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getOutTPArcParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_out_11_0=ruleTPArc();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransitionRule());
                    						}
                    						add(
                    							current,
                    							"out",
                    							lv_out_11_0,
                    							"org.xtext.example.mydsl.PetriNetz.TPArc");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPetriNetz.g:534:4: (otherlv_12= ',' ( (lv_out_13_0= ruleTPArc ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==16) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalPetriNetz.g:535:5: otherlv_12= ',' ( (lv_out_13_0= ruleTPArc ) )
                    	    {
                    	    otherlv_12=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getTransitionAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalPetriNetz.g:539:5: ( (lv_out_13_0= ruleTPArc ) )
                    	    // InternalPetriNetz.g:540:6: (lv_out_13_0= ruleTPArc )
                    	    {
                    	    // InternalPetriNetz.g:540:6: (lv_out_13_0= ruleTPArc )
                    	    // InternalPetriNetz.g:541:7: lv_out_13_0= ruleTPArc
                    	    {

                    	    							newCompositeNode(grammarAccess.getTransitionAccess().getOutTPArcParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_out_13_0=ruleTPArc();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"out",
                    	    								lv_out_13_0,
                    	    								"org.xtext.example.mydsl.PetriNetz.TPArc");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_14=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalPetriNetz.g:568:1: entryRuleArc returns [EObject current=null] : iv_ruleArc= ruleArc EOF ;
    public final EObject entryRuleArc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArc = null;


        try {
            // InternalPetriNetz.g:568:44: (iv_ruleArc= ruleArc EOF )
            // InternalPetriNetz.g:569:2: iv_ruleArc= ruleArc EOF
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
    // InternalPetriNetz.g:575:1: ruleArc returns [EObject current=null] : ( (this_PTArc_0= rulePTArc | this_TPArc_1= ruleTPArc ) otherlv_2= 'arc' ( (lv_weight_3_0= RULE_INT ) ) ) ;
    public final EObject ruleArc() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_weight_3_0=null;
        EObject this_PTArc_0 = null;

        EObject this_TPArc_1 = null;



        	enterRule();

        try {
            // InternalPetriNetz.g:581:2: ( ( (this_PTArc_0= rulePTArc | this_TPArc_1= ruleTPArc ) otherlv_2= 'arc' ( (lv_weight_3_0= RULE_INT ) ) ) )
            // InternalPetriNetz.g:582:2: ( (this_PTArc_0= rulePTArc | this_TPArc_1= ruleTPArc ) otherlv_2= 'arc' ( (lv_weight_3_0= RULE_INT ) ) )
            {
            // InternalPetriNetz.g:582:2: ( (this_PTArc_0= rulePTArc | this_TPArc_1= ruleTPArc ) otherlv_2= 'arc' ( (lv_weight_3_0= RULE_INT ) ) )
            // InternalPetriNetz.g:583:3: (this_PTArc_0= rulePTArc | this_TPArc_1= ruleTPArc ) otherlv_2= 'arc' ( (lv_weight_3_0= RULE_INT ) )
            {
            // InternalPetriNetz.g:583:3: (this_PTArc_0= rulePTArc | this_TPArc_1= ruleTPArc )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==12) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==RULE_ID) ) {
                    int LA14_2 = input.LA(3);

                    if ( (LA14_2==22) ) {
                        alt14=1;
                    }
                    else if ( (LA14_2==23) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalPetriNetz.g:584:4: this_PTArc_0= rulePTArc
                    {

                    				newCompositeNode(grammarAccess.getArcAccess().getPTArcParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_16);
                    this_PTArc_0=rulePTArc();

                    state._fsp--;


                    				current = this_PTArc_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalPetriNetz.g:593:4: this_TPArc_1= ruleTPArc
                    {

                    				newCompositeNode(grammarAccess.getArcAccess().getTPArcParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_16);
                    this_TPArc_1=ruleTPArc();

                    state._fsp--;


                    				current = this_TPArc_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getArcAccess().getArcKeyword_1());
            		
            // InternalPetriNetz.g:606:3: ( (lv_weight_3_0= RULE_INT ) )
            // InternalPetriNetz.g:607:4: (lv_weight_3_0= RULE_INT )
            {
            // InternalPetriNetz.g:607:4: (lv_weight_3_0= RULE_INT )
            // InternalPetriNetz.g:608:5: lv_weight_3_0= RULE_INT
            {
            lv_weight_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_weight_3_0, grammarAccess.getArcAccess().getWeightINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArcRule());
            					}
            					setWithLastConsumed(
            						current,
            						"weight",
            						lv_weight_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleArc"


    // $ANTLR start "entryRulePTArc"
    // InternalPetriNetz.g:628:1: entryRulePTArc returns [EObject current=null] : iv_rulePTArc= rulePTArc EOF ;
    public final EObject entryRulePTArc() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePTArc = null;


        try {
            // InternalPetriNetz.g:628:46: (iv_rulePTArc= rulePTArc EOF )
            // InternalPetriNetz.g:629:2: iv_rulePTArc= rulePTArc EOF
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
    // InternalPetriNetz.g:635:1: rulePTArc returns [EObject current=null] : (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '>' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' ) ;
    public final EObject rulePTArc() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalPetriNetz.g:641:2: ( (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '>' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' ) )
            // InternalPetriNetz.g:642:2: (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '>' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' )
            {
            // InternalPetriNetz.g:642:2: (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '>' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' )
            // InternalPetriNetz.g:643:3: otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '>' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPTArcAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalPetriNetz.g:647:3: ( (otherlv_1= RULE_ID ) )
            // InternalPetriNetz.g:648:4: (otherlv_1= RULE_ID )
            {
            // InternalPetriNetz.g:648:4: (otherlv_1= RULE_ID )
            // InternalPetriNetz.g:649:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPTArcRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_1, grammarAccess.getPTArcAccess().getSrcPlaceCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getPTArcAccess().getGreaterThanSignKeyword_2());
            		
            // InternalPetriNetz.g:664:3: ( (otherlv_3= RULE_ID ) )
            // InternalPetriNetz.g:665:4: (otherlv_3= RULE_ID )
            {
            // InternalPetriNetz.g:665:4: (otherlv_3= RULE_ID )
            // InternalPetriNetz.g:666:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPTArcRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_3, grammarAccess.getPTArcAccess().getTrgTransitionCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPTArcAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalPetriNetz.g:685:1: entryRuleTPArc returns [EObject current=null] : iv_ruleTPArc= ruleTPArc EOF ;
    public final EObject entryRuleTPArc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTPArc = null;


        try {
            // InternalPetriNetz.g:685:46: (iv_ruleTPArc= ruleTPArc EOF )
            // InternalPetriNetz.g:686:2: iv_ruleTPArc= ruleTPArc EOF
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
    // InternalPetriNetz.g:692:1: ruleTPArc returns [EObject current=null] : (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '<' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' ) ;
    public final EObject ruleTPArc() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalPetriNetz.g:698:2: ( (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '<' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' ) )
            // InternalPetriNetz.g:699:2: (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '<' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' )
            {
            // InternalPetriNetz.g:699:2: (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '<' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' )
            // InternalPetriNetz.g:700:3: otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '<' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTPArcAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalPetriNetz.g:704:3: ( (otherlv_1= RULE_ID ) )
            // InternalPetriNetz.g:705:4: (otherlv_1= RULE_ID )
            {
            // InternalPetriNetz.g:705:4: (otherlv_1= RULE_ID )
            // InternalPetriNetz.g:706:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTPArcRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_1, grammarAccess.getTPArcAccess().getTrgPlaceCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getTPArcAccess().getLessThanSignKeyword_2());
            		
            // InternalPetriNetz.g:721:3: ( (otherlv_3= RULE_ID ) )
            // InternalPetriNetz.g:722:4: (otherlv_3= RULE_ID )
            {
            // InternalPetriNetz.g:722:4: (otherlv_3= RULE_ID )
            // InternalPetriNetz.g:723:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTPArcRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_3, grammarAccess.getTPArcAccess().getSrcTransitionCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTPArcAccess().getRightCurlyBracketKeyword_4());
            		

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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000107000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000103000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000062000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000052000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000032000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});

}