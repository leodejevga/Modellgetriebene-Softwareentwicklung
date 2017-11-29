package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.PetriNetzGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPetriNetzParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(PetriNetzGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRulePetrinet"
    // InternalPetriNetz.g:53:1: entryRulePetrinet : rulePetrinet EOF ;
    public final void entryRulePetrinet() throws RecognitionException {
        try {
            // InternalPetriNetz.g:54:1: ( rulePetrinet EOF )
            // InternalPetriNetz.g:55:1: rulePetrinet EOF
            {
             before(grammarAccess.getPetrinetRule()); 
            pushFollow(FOLLOW_1);
            rulePetrinet();

            state._fsp--;

             after(grammarAccess.getPetrinetRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePetrinet"


    // $ANTLR start "rulePetrinet"
    // InternalPetriNetz.g:62:1: rulePetrinet : ( ( rule__Petrinet__Group__0 ) ) ;
    public final void rulePetrinet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:66:2: ( ( ( rule__Petrinet__Group__0 ) ) )
            // InternalPetriNetz.g:67:2: ( ( rule__Petrinet__Group__0 ) )
            {
            // InternalPetriNetz.g:67:2: ( ( rule__Petrinet__Group__0 ) )
            // InternalPetriNetz.g:68:3: ( rule__Petrinet__Group__0 )
            {
             before(grammarAccess.getPetrinetAccess().getGroup()); 
            // InternalPetriNetz.g:69:3: ( rule__Petrinet__Group__0 )
            // InternalPetriNetz.g:69:4: rule__Petrinet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Petrinet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPetrinetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePetrinet"


    // $ANTLR start "entryRulePlace"
    // InternalPetriNetz.g:78:1: entryRulePlace : rulePlace EOF ;
    public final void entryRulePlace() throws RecognitionException {
        try {
            // InternalPetriNetz.g:79:1: ( rulePlace EOF )
            // InternalPetriNetz.g:80:1: rulePlace EOF
            {
             before(grammarAccess.getPlaceRule()); 
            pushFollow(FOLLOW_1);
            rulePlace();

            state._fsp--;

             after(grammarAccess.getPlaceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlace"


    // $ANTLR start "rulePlace"
    // InternalPetriNetz.g:87:1: rulePlace : ( ( rule__Place__Group__0 ) ) ;
    public final void rulePlace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:91:2: ( ( ( rule__Place__Group__0 ) ) )
            // InternalPetriNetz.g:92:2: ( ( rule__Place__Group__0 ) )
            {
            // InternalPetriNetz.g:92:2: ( ( rule__Place__Group__0 ) )
            // InternalPetriNetz.g:93:3: ( rule__Place__Group__0 )
            {
             before(grammarAccess.getPlaceAccess().getGroup()); 
            // InternalPetriNetz.g:94:3: ( rule__Place__Group__0 )
            // InternalPetriNetz.g:94:4: rule__Place__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Place__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlace"


    // $ANTLR start "entryRuleToken"
    // InternalPetriNetz.g:103:1: entryRuleToken : ruleToken EOF ;
    public final void entryRuleToken() throws RecognitionException {
        try {
            // InternalPetriNetz.g:104:1: ( ruleToken EOF )
            // InternalPetriNetz.g:105:1: ruleToken EOF
            {
             before(grammarAccess.getTokenRule()); 
            pushFollow(FOLLOW_1);
            ruleToken();

            state._fsp--;

             after(grammarAccess.getTokenRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleToken"


    // $ANTLR start "ruleToken"
    // InternalPetriNetz.g:112:1: ruleToken : ( ( rule__Token__Group__0 ) ) ;
    public final void ruleToken() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:116:2: ( ( ( rule__Token__Group__0 ) ) )
            // InternalPetriNetz.g:117:2: ( ( rule__Token__Group__0 ) )
            {
            // InternalPetriNetz.g:117:2: ( ( rule__Token__Group__0 ) )
            // InternalPetriNetz.g:118:3: ( rule__Token__Group__0 )
            {
             before(grammarAccess.getTokenAccess().getGroup()); 
            // InternalPetriNetz.g:119:3: ( rule__Token__Group__0 )
            // InternalPetriNetz.g:119:4: rule__Token__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Token__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTokenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleToken"


    // $ANTLR start "entryRuleTransition"
    // InternalPetriNetz.g:128:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalPetriNetz.g:129:1: ( ruleTransition EOF )
            // InternalPetriNetz.g:130:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalPetriNetz.g:137:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:141:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalPetriNetz.g:142:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalPetriNetz.g:142:2: ( ( rule__Transition__Group__0 ) )
            // InternalPetriNetz.g:143:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalPetriNetz.g:144:3: ( rule__Transition__Group__0 )
            // InternalPetriNetz.g:144:4: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleArc"
    // InternalPetriNetz.g:153:1: entryRuleArc : ruleArc EOF ;
    public final void entryRuleArc() throws RecognitionException {
        try {
            // InternalPetriNetz.g:154:1: ( ruleArc EOF )
            // InternalPetriNetz.g:155:1: ruleArc EOF
            {
             before(grammarAccess.getArcRule()); 
            pushFollow(FOLLOW_1);
            ruleArc();

            state._fsp--;

             after(grammarAccess.getArcRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArc"


    // $ANTLR start "ruleArc"
    // InternalPetriNetz.g:162:1: ruleArc : ( ( rule__Arc__Group__0 ) ) ;
    public final void ruleArc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:166:2: ( ( ( rule__Arc__Group__0 ) ) )
            // InternalPetriNetz.g:167:2: ( ( rule__Arc__Group__0 ) )
            {
            // InternalPetriNetz.g:167:2: ( ( rule__Arc__Group__0 ) )
            // InternalPetriNetz.g:168:3: ( rule__Arc__Group__0 )
            {
             before(grammarAccess.getArcAccess().getGroup()); 
            // InternalPetriNetz.g:169:3: ( rule__Arc__Group__0 )
            // InternalPetriNetz.g:169:4: rule__Arc__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Arc__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArcAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArc"


    // $ANTLR start "entryRulePTArc"
    // InternalPetriNetz.g:178:1: entryRulePTArc : rulePTArc EOF ;
    public final void entryRulePTArc() throws RecognitionException {
        try {
            // InternalPetriNetz.g:179:1: ( rulePTArc EOF )
            // InternalPetriNetz.g:180:1: rulePTArc EOF
            {
             before(grammarAccess.getPTArcRule()); 
            pushFollow(FOLLOW_1);
            rulePTArc();

            state._fsp--;

             after(grammarAccess.getPTArcRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePTArc"


    // $ANTLR start "rulePTArc"
    // InternalPetriNetz.g:187:1: rulePTArc : ( ( rule__PTArc__Group__0 ) ) ;
    public final void rulePTArc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:191:2: ( ( ( rule__PTArc__Group__0 ) ) )
            // InternalPetriNetz.g:192:2: ( ( rule__PTArc__Group__0 ) )
            {
            // InternalPetriNetz.g:192:2: ( ( rule__PTArc__Group__0 ) )
            // InternalPetriNetz.g:193:3: ( rule__PTArc__Group__0 )
            {
             before(grammarAccess.getPTArcAccess().getGroup()); 
            // InternalPetriNetz.g:194:3: ( rule__PTArc__Group__0 )
            // InternalPetriNetz.g:194:4: rule__PTArc__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PTArc__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPTArcAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePTArc"


    // $ANTLR start "entryRuleTPArc"
    // InternalPetriNetz.g:203:1: entryRuleTPArc : ruleTPArc EOF ;
    public final void entryRuleTPArc() throws RecognitionException {
        try {
            // InternalPetriNetz.g:204:1: ( ruleTPArc EOF )
            // InternalPetriNetz.g:205:1: ruleTPArc EOF
            {
             before(grammarAccess.getTPArcRule()); 
            pushFollow(FOLLOW_1);
            ruleTPArc();

            state._fsp--;

             after(grammarAccess.getTPArcRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTPArc"


    // $ANTLR start "ruleTPArc"
    // InternalPetriNetz.g:212:1: ruleTPArc : ( ( rule__TPArc__Group__0 ) ) ;
    public final void ruleTPArc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:216:2: ( ( ( rule__TPArc__Group__0 ) ) )
            // InternalPetriNetz.g:217:2: ( ( rule__TPArc__Group__0 ) )
            {
            // InternalPetriNetz.g:217:2: ( ( rule__TPArc__Group__0 ) )
            // InternalPetriNetz.g:218:3: ( rule__TPArc__Group__0 )
            {
             before(grammarAccess.getTPArcAccess().getGroup()); 
            // InternalPetriNetz.g:219:3: ( rule__TPArc__Group__0 )
            // InternalPetriNetz.g:219:4: rule__TPArc__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TPArc__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTPArcAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTPArc"


    // $ANTLR start "rule__Arc__Alternatives_0"
    // InternalPetriNetz.g:227:1: rule__Arc__Alternatives_0 : ( ( rulePTArc ) | ( ruleTPArc ) );
    public final void rule__Arc__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:231:1: ( ( rulePTArc ) | ( ruleTPArc ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_ID) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==23) ) {
                        alt1=2;
                    }
                    else if ( (LA1_2==22) ) {
                        alt1=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalPetriNetz.g:232:2: ( rulePTArc )
                    {
                    // InternalPetriNetz.g:232:2: ( rulePTArc )
                    // InternalPetriNetz.g:233:3: rulePTArc
                    {
                     before(grammarAccess.getArcAccess().getPTArcParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    rulePTArc();

                    state._fsp--;

                     after(grammarAccess.getArcAccess().getPTArcParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPetriNetz.g:238:2: ( ruleTPArc )
                    {
                    // InternalPetriNetz.g:238:2: ( ruleTPArc )
                    // InternalPetriNetz.g:239:3: ruleTPArc
                    {
                     before(grammarAccess.getArcAccess().getTPArcParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTPArc();

                    state._fsp--;

                     after(grammarAccess.getArcAccess().getTPArcParserRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Alternatives_0"


    // $ANTLR start "rule__Petrinet__Group__0"
    // InternalPetriNetz.g:248:1: rule__Petrinet__Group__0 : rule__Petrinet__Group__0__Impl rule__Petrinet__Group__1 ;
    public final void rule__Petrinet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:252:1: ( rule__Petrinet__Group__0__Impl rule__Petrinet__Group__1 )
            // InternalPetriNetz.g:253:2: rule__Petrinet__Group__0__Impl rule__Petrinet__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Petrinet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Petrinet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__0"


    // $ANTLR start "rule__Petrinet__Group__0__Impl"
    // InternalPetriNetz.g:260:1: rule__Petrinet__Group__0__Impl : ( 'petrinet' ) ;
    public final void rule__Petrinet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:264:1: ( ( 'petrinet' ) )
            // InternalPetriNetz.g:265:1: ( 'petrinet' )
            {
            // InternalPetriNetz.g:265:1: ( 'petrinet' )
            // InternalPetriNetz.g:266:2: 'petrinet'
            {
             before(grammarAccess.getPetrinetAccess().getPetrinetKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getPetrinetAccess().getPetrinetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__0__Impl"


    // $ANTLR start "rule__Petrinet__Group__1"
    // InternalPetriNetz.g:275:1: rule__Petrinet__Group__1 : rule__Petrinet__Group__1__Impl rule__Petrinet__Group__2 ;
    public final void rule__Petrinet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:279:1: ( rule__Petrinet__Group__1__Impl rule__Petrinet__Group__2 )
            // InternalPetriNetz.g:280:2: rule__Petrinet__Group__1__Impl rule__Petrinet__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Petrinet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Petrinet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__1"


    // $ANTLR start "rule__Petrinet__Group__1__Impl"
    // InternalPetriNetz.g:287:1: rule__Petrinet__Group__1__Impl : ( ( rule__Petrinet__NameAssignment_1 ) ) ;
    public final void rule__Petrinet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:291:1: ( ( ( rule__Petrinet__NameAssignment_1 ) ) )
            // InternalPetriNetz.g:292:1: ( ( rule__Petrinet__NameAssignment_1 ) )
            {
            // InternalPetriNetz.g:292:1: ( ( rule__Petrinet__NameAssignment_1 ) )
            // InternalPetriNetz.g:293:2: ( rule__Petrinet__NameAssignment_1 )
            {
             before(grammarAccess.getPetrinetAccess().getNameAssignment_1()); 
            // InternalPetriNetz.g:294:2: ( rule__Petrinet__NameAssignment_1 )
            // InternalPetriNetz.g:294:3: rule__Petrinet__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Petrinet__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPetrinetAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__1__Impl"


    // $ANTLR start "rule__Petrinet__Group__2"
    // InternalPetriNetz.g:302:1: rule__Petrinet__Group__2 : rule__Petrinet__Group__2__Impl rule__Petrinet__Group__3 ;
    public final void rule__Petrinet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:306:1: ( rule__Petrinet__Group__2__Impl rule__Petrinet__Group__3 )
            // InternalPetriNetz.g:307:2: rule__Petrinet__Group__2__Impl rule__Petrinet__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Petrinet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Petrinet__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__2"


    // $ANTLR start "rule__Petrinet__Group__2__Impl"
    // InternalPetriNetz.g:314:1: rule__Petrinet__Group__2__Impl : ( '{' ) ;
    public final void rule__Petrinet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:318:1: ( ( '{' ) )
            // InternalPetriNetz.g:319:1: ( '{' )
            {
            // InternalPetriNetz.g:319:1: ( '{' )
            // InternalPetriNetz.g:320:2: '{'
            {
             before(grammarAccess.getPetrinetAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPetrinetAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__2__Impl"


    // $ANTLR start "rule__Petrinet__Group__3"
    // InternalPetriNetz.g:329:1: rule__Petrinet__Group__3 : rule__Petrinet__Group__3__Impl rule__Petrinet__Group__4 ;
    public final void rule__Petrinet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:333:1: ( rule__Petrinet__Group__3__Impl rule__Petrinet__Group__4 )
            // InternalPetriNetz.g:334:2: rule__Petrinet__Group__3__Impl rule__Petrinet__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Petrinet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Petrinet__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__3"


    // $ANTLR start "rule__Petrinet__Group__3__Impl"
    // InternalPetriNetz.g:341:1: rule__Petrinet__Group__3__Impl : ( ( rule__Petrinet__PlacesAssignment_3 )* ) ;
    public final void rule__Petrinet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:345:1: ( ( ( rule__Petrinet__PlacesAssignment_3 )* ) )
            // InternalPetriNetz.g:346:1: ( ( rule__Petrinet__PlacesAssignment_3 )* )
            {
            // InternalPetriNetz.g:346:1: ( ( rule__Petrinet__PlacesAssignment_3 )* )
            // InternalPetriNetz.g:347:2: ( rule__Petrinet__PlacesAssignment_3 )*
            {
             before(grammarAccess.getPetrinetAccess().getPlacesAssignment_3()); 
            // InternalPetriNetz.g:348:2: ( rule__Petrinet__PlacesAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPetriNetz.g:348:3: rule__Petrinet__PlacesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Petrinet__PlacesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getPetrinetAccess().getPlacesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__3__Impl"


    // $ANTLR start "rule__Petrinet__Group__4"
    // InternalPetriNetz.g:356:1: rule__Petrinet__Group__4 : rule__Petrinet__Group__4__Impl rule__Petrinet__Group__5 ;
    public final void rule__Petrinet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:360:1: ( rule__Petrinet__Group__4__Impl rule__Petrinet__Group__5 )
            // InternalPetriNetz.g:361:2: rule__Petrinet__Group__4__Impl rule__Petrinet__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Petrinet__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Petrinet__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__4"


    // $ANTLR start "rule__Petrinet__Group__4__Impl"
    // InternalPetriNetz.g:368:1: rule__Petrinet__Group__4__Impl : ( ( rule__Petrinet__TransitionsAssignment_4 )* ) ;
    public final void rule__Petrinet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:372:1: ( ( ( rule__Petrinet__TransitionsAssignment_4 )* ) )
            // InternalPetriNetz.g:373:1: ( ( rule__Petrinet__TransitionsAssignment_4 )* )
            {
            // InternalPetriNetz.g:373:1: ( ( rule__Petrinet__TransitionsAssignment_4 )* )
            // InternalPetriNetz.g:374:2: ( rule__Petrinet__TransitionsAssignment_4 )*
            {
             before(grammarAccess.getPetrinetAccess().getTransitionsAssignment_4()); 
            // InternalPetriNetz.g:375:2: ( rule__Petrinet__TransitionsAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPetriNetz.g:375:3: rule__Petrinet__TransitionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Petrinet__TransitionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getPetrinetAccess().getTransitionsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__4__Impl"


    // $ANTLR start "rule__Petrinet__Group__5"
    // InternalPetriNetz.g:383:1: rule__Petrinet__Group__5 : rule__Petrinet__Group__5__Impl rule__Petrinet__Group__6 ;
    public final void rule__Petrinet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:387:1: ( rule__Petrinet__Group__5__Impl rule__Petrinet__Group__6 )
            // InternalPetriNetz.g:388:2: rule__Petrinet__Group__5__Impl rule__Petrinet__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Petrinet__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Petrinet__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__5"


    // $ANTLR start "rule__Petrinet__Group__5__Impl"
    // InternalPetriNetz.g:395:1: rule__Petrinet__Group__5__Impl : ( ( rule__Petrinet__ArcsAssignment_5 )* ) ;
    public final void rule__Petrinet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:399:1: ( ( ( rule__Petrinet__ArcsAssignment_5 )* ) )
            // InternalPetriNetz.g:400:1: ( ( rule__Petrinet__ArcsAssignment_5 )* )
            {
            // InternalPetriNetz.g:400:1: ( ( rule__Petrinet__ArcsAssignment_5 )* )
            // InternalPetriNetz.g:401:2: ( rule__Petrinet__ArcsAssignment_5 )*
            {
             before(grammarAccess.getPetrinetAccess().getArcsAssignment_5()); 
            // InternalPetriNetz.g:402:2: ( rule__Petrinet__ArcsAssignment_5 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPetriNetz.g:402:3: rule__Petrinet__ArcsAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Petrinet__ArcsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getPetrinetAccess().getArcsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__5__Impl"


    // $ANTLR start "rule__Petrinet__Group__6"
    // InternalPetriNetz.g:410:1: rule__Petrinet__Group__6 : rule__Petrinet__Group__6__Impl ;
    public final void rule__Petrinet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:414:1: ( rule__Petrinet__Group__6__Impl )
            // InternalPetriNetz.g:415:2: rule__Petrinet__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Petrinet__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__6"


    // $ANTLR start "rule__Petrinet__Group__6__Impl"
    // InternalPetriNetz.g:421:1: rule__Petrinet__Group__6__Impl : ( '}' ) ;
    public final void rule__Petrinet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:425:1: ( ( '}' ) )
            // InternalPetriNetz.g:426:1: ( '}' )
            {
            // InternalPetriNetz.g:426:1: ( '}' )
            // InternalPetriNetz.g:427:2: '}'
            {
             before(grammarAccess.getPetrinetAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPetrinetAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__6__Impl"


    // $ANTLR start "rule__Place__Group__0"
    // InternalPetriNetz.g:437:1: rule__Place__Group__0 : rule__Place__Group__0__Impl rule__Place__Group__1 ;
    public final void rule__Place__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:441:1: ( rule__Place__Group__0__Impl rule__Place__Group__1 )
            // InternalPetriNetz.g:442:2: rule__Place__Group__0__Impl rule__Place__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Place__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__0"


    // $ANTLR start "rule__Place__Group__0__Impl"
    // InternalPetriNetz.g:449:1: rule__Place__Group__0__Impl : ( 'place' ) ;
    public final void rule__Place__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:453:1: ( ( 'place' ) )
            // InternalPetriNetz.g:454:1: ( 'place' )
            {
            // InternalPetriNetz.g:454:1: ( 'place' )
            // InternalPetriNetz.g:455:2: 'place'
            {
             before(grammarAccess.getPlaceAccess().getPlaceKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getPlaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__0__Impl"


    // $ANTLR start "rule__Place__Group__1"
    // InternalPetriNetz.g:464:1: rule__Place__Group__1 : rule__Place__Group__1__Impl rule__Place__Group__2 ;
    public final void rule__Place__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:468:1: ( rule__Place__Group__1__Impl rule__Place__Group__2 )
            // InternalPetriNetz.g:469:2: rule__Place__Group__1__Impl rule__Place__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Place__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__1"


    // $ANTLR start "rule__Place__Group__1__Impl"
    // InternalPetriNetz.g:476:1: rule__Place__Group__1__Impl : ( ( rule__Place__NameAssignment_1 ) ) ;
    public final void rule__Place__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:480:1: ( ( ( rule__Place__NameAssignment_1 ) ) )
            // InternalPetriNetz.g:481:1: ( ( rule__Place__NameAssignment_1 ) )
            {
            // InternalPetriNetz.g:481:1: ( ( rule__Place__NameAssignment_1 ) )
            // InternalPetriNetz.g:482:2: ( rule__Place__NameAssignment_1 )
            {
             before(grammarAccess.getPlaceAccess().getNameAssignment_1()); 
            // InternalPetriNetz.g:483:2: ( rule__Place__NameAssignment_1 )
            // InternalPetriNetz.g:483:3: rule__Place__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Place__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPlaceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__1__Impl"


    // $ANTLR start "rule__Place__Group__2"
    // InternalPetriNetz.g:491:1: rule__Place__Group__2 : rule__Place__Group__2__Impl rule__Place__Group__3 ;
    public final void rule__Place__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:495:1: ( rule__Place__Group__2__Impl rule__Place__Group__3 )
            // InternalPetriNetz.g:496:2: rule__Place__Group__2__Impl rule__Place__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Place__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__2"


    // $ANTLR start "rule__Place__Group__2__Impl"
    // InternalPetriNetz.g:503:1: rule__Place__Group__2__Impl : ( ':' ) ;
    public final void rule__Place__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:507:1: ( ( ':' ) )
            // InternalPetriNetz.g:508:1: ( ':' )
            {
            // InternalPetriNetz.g:508:1: ( ':' )
            // InternalPetriNetz.g:509:2: ':'
            {
             before(grammarAccess.getPlaceAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__2__Impl"


    // $ANTLR start "rule__Place__Group__3"
    // InternalPetriNetz.g:518:1: rule__Place__Group__3 : rule__Place__Group__3__Impl rule__Place__Group__4 ;
    public final void rule__Place__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:522:1: ( rule__Place__Group__3__Impl rule__Place__Group__4 )
            // InternalPetriNetz.g:523:2: rule__Place__Group__3__Impl rule__Place__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Place__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__3"


    // $ANTLR start "rule__Place__Group__3__Impl"
    // InternalPetriNetz.g:530:1: rule__Place__Group__3__Impl : ( ( rule__Place__Group_3__0 )? ) ;
    public final void rule__Place__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:534:1: ( ( ( rule__Place__Group_3__0 )? ) )
            // InternalPetriNetz.g:535:1: ( ( rule__Place__Group_3__0 )? )
            {
            // InternalPetriNetz.g:535:1: ( ( rule__Place__Group_3__0 )? )
            // InternalPetriNetz.g:536:2: ( rule__Place__Group_3__0 )?
            {
             before(grammarAccess.getPlaceAccess().getGroup_3()); 
            // InternalPetriNetz.g:537:2: ( rule__Place__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPetriNetz.g:537:3: rule__Place__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Place__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPlaceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__3__Impl"


    // $ANTLR start "rule__Place__Group__4"
    // InternalPetriNetz.g:545:1: rule__Place__Group__4 : rule__Place__Group__4__Impl rule__Place__Group__5 ;
    public final void rule__Place__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:549:1: ( rule__Place__Group__4__Impl rule__Place__Group__5 )
            // InternalPetriNetz.g:550:2: rule__Place__Group__4__Impl rule__Place__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Place__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__4"


    // $ANTLR start "rule__Place__Group__4__Impl"
    // InternalPetriNetz.g:557:1: rule__Place__Group__4__Impl : ( '{' ) ;
    public final void rule__Place__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:561:1: ( ( '{' ) )
            // InternalPetriNetz.g:562:1: ( '{' )
            {
            // InternalPetriNetz.g:562:1: ( '{' )
            // InternalPetriNetz.g:563:2: '{'
            {
             before(grammarAccess.getPlaceAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__4__Impl"


    // $ANTLR start "rule__Place__Group__5"
    // InternalPetriNetz.g:572:1: rule__Place__Group__5 : rule__Place__Group__5__Impl rule__Place__Group__6 ;
    public final void rule__Place__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:576:1: ( rule__Place__Group__5__Impl rule__Place__Group__6 )
            // InternalPetriNetz.g:577:2: rule__Place__Group__5__Impl rule__Place__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Place__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__5"


    // $ANTLR start "rule__Place__Group__5__Impl"
    // InternalPetriNetz.g:584:1: rule__Place__Group__5__Impl : ( ( rule__Place__Group_5__0 )? ) ;
    public final void rule__Place__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:588:1: ( ( ( rule__Place__Group_5__0 )? ) )
            // InternalPetriNetz.g:589:1: ( ( rule__Place__Group_5__0 )? )
            {
            // InternalPetriNetz.g:589:1: ( ( rule__Place__Group_5__0 )? )
            // InternalPetriNetz.g:590:2: ( rule__Place__Group_5__0 )?
            {
             before(grammarAccess.getPlaceAccess().getGroup_5()); 
            // InternalPetriNetz.g:591:2: ( rule__Place__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPetriNetz.g:591:3: rule__Place__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Place__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPlaceAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__5__Impl"


    // $ANTLR start "rule__Place__Group__6"
    // InternalPetriNetz.g:599:1: rule__Place__Group__6 : rule__Place__Group__6__Impl rule__Place__Group__7 ;
    public final void rule__Place__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:603:1: ( rule__Place__Group__6__Impl rule__Place__Group__7 )
            // InternalPetriNetz.g:604:2: rule__Place__Group__6__Impl rule__Place__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Place__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__6"


    // $ANTLR start "rule__Place__Group__6__Impl"
    // InternalPetriNetz.g:611:1: rule__Place__Group__6__Impl : ( ( rule__Place__Group_6__0 )? ) ;
    public final void rule__Place__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:615:1: ( ( ( rule__Place__Group_6__0 )? ) )
            // InternalPetriNetz.g:616:1: ( ( rule__Place__Group_6__0 )? )
            {
            // InternalPetriNetz.g:616:1: ( ( rule__Place__Group_6__0 )? )
            // InternalPetriNetz.g:617:2: ( rule__Place__Group_6__0 )?
            {
             before(grammarAccess.getPlaceAccess().getGroup_6()); 
            // InternalPetriNetz.g:618:2: ( rule__Place__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPetriNetz.g:618:3: rule__Place__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Place__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPlaceAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__6__Impl"


    // $ANTLR start "rule__Place__Group__7"
    // InternalPetriNetz.g:626:1: rule__Place__Group__7 : rule__Place__Group__7__Impl ;
    public final void rule__Place__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:630:1: ( rule__Place__Group__7__Impl )
            // InternalPetriNetz.g:631:2: rule__Place__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Place__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__7"


    // $ANTLR start "rule__Place__Group__7__Impl"
    // InternalPetriNetz.g:637:1: rule__Place__Group__7__Impl : ( '}' ) ;
    public final void rule__Place__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:641:1: ( ( '}' ) )
            // InternalPetriNetz.g:642:1: ( '}' )
            {
            // InternalPetriNetz.g:642:1: ( '}' )
            // InternalPetriNetz.g:643:2: '}'
            {
             before(grammarAccess.getPlaceAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__7__Impl"


    // $ANTLR start "rule__Place__Group_3__0"
    // InternalPetriNetz.g:653:1: rule__Place__Group_3__0 : rule__Place__Group_3__0__Impl rule__Place__Group_3__1 ;
    public final void rule__Place__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:657:1: ( rule__Place__Group_3__0__Impl rule__Place__Group_3__1 )
            // InternalPetriNetz.g:658:2: rule__Place__Group_3__0__Impl rule__Place__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Place__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_3__0"


    // $ANTLR start "rule__Place__Group_3__0__Impl"
    // InternalPetriNetz.g:665:1: rule__Place__Group_3__0__Impl : ( ( rule__Place__TokensAssignment_3_0 ) ) ;
    public final void rule__Place__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:669:1: ( ( ( rule__Place__TokensAssignment_3_0 ) ) )
            // InternalPetriNetz.g:670:1: ( ( rule__Place__TokensAssignment_3_0 ) )
            {
            // InternalPetriNetz.g:670:1: ( ( rule__Place__TokensAssignment_3_0 ) )
            // InternalPetriNetz.g:671:2: ( rule__Place__TokensAssignment_3_0 )
            {
             before(grammarAccess.getPlaceAccess().getTokensAssignment_3_0()); 
            // InternalPetriNetz.g:672:2: ( rule__Place__TokensAssignment_3_0 )
            // InternalPetriNetz.g:672:3: rule__Place__TokensAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Place__TokensAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getPlaceAccess().getTokensAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_3__0__Impl"


    // $ANTLR start "rule__Place__Group_3__1"
    // InternalPetriNetz.g:680:1: rule__Place__Group_3__1 : rule__Place__Group_3__1__Impl ;
    public final void rule__Place__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:684:1: ( rule__Place__Group_3__1__Impl )
            // InternalPetriNetz.g:685:2: rule__Place__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Place__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_3__1"


    // $ANTLR start "rule__Place__Group_3__1__Impl"
    // InternalPetriNetz.g:691:1: rule__Place__Group_3__1__Impl : ( ( rule__Place__Group_3_1__0 )* ) ;
    public final void rule__Place__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:695:1: ( ( ( rule__Place__Group_3_1__0 )* ) )
            // InternalPetriNetz.g:696:1: ( ( rule__Place__Group_3_1__0 )* )
            {
            // InternalPetriNetz.g:696:1: ( ( rule__Place__Group_3_1__0 )* )
            // InternalPetriNetz.g:697:2: ( rule__Place__Group_3_1__0 )*
            {
             before(grammarAccess.getPlaceAccess().getGroup_3_1()); 
            // InternalPetriNetz.g:698:2: ( rule__Place__Group_3_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPetriNetz.g:698:3: rule__Place__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Place__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getPlaceAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_3__1__Impl"


    // $ANTLR start "rule__Place__Group_3_1__0"
    // InternalPetriNetz.g:707:1: rule__Place__Group_3_1__0 : rule__Place__Group_3_1__0__Impl rule__Place__Group_3_1__1 ;
    public final void rule__Place__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:711:1: ( rule__Place__Group_3_1__0__Impl rule__Place__Group_3_1__1 )
            // InternalPetriNetz.g:712:2: rule__Place__Group_3_1__0__Impl rule__Place__Group_3_1__1
            {
            pushFollow(FOLLOW_14);
            rule__Place__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_3_1__0"


    // $ANTLR start "rule__Place__Group_3_1__0__Impl"
    // InternalPetriNetz.g:719:1: rule__Place__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Place__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:723:1: ( ( ',' ) )
            // InternalPetriNetz.g:724:1: ( ',' )
            {
            // InternalPetriNetz.g:724:1: ( ',' )
            // InternalPetriNetz.g:725:2: ','
            {
             before(grammarAccess.getPlaceAccess().getCommaKeyword_3_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_3_1__0__Impl"


    // $ANTLR start "rule__Place__Group_3_1__1"
    // InternalPetriNetz.g:734:1: rule__Place__Group_3_1__1 : rule__Place__Group_3_1__1__Impl ;
    public final void rule__Place__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:738:1: ( rule__Place__Group_3_1__1__Impl )
            // InternalPetriNetz.g:739:2: rule__Place__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Place__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_3_1__1"


    // $ANTLR start "rule__Place__Group_3_1__1__Impl"
    // InternalPetriNetz.g:745:1: rule__Place__Group_3_1__1__Impl : ( ( rule__Place__TokensAssignment_3_1_1 ) ) ;
    public final void rule__Place__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:749:1: ( ( ( rule__Place__TokensAssignment_3_1_1 ) ) )
            // InternalPetriNetz.g:750:1: ( ( rule__Place__TokensAssignment_3_1_1 ) )
            {
            // InternalPetriNetz.g:750:1: ( ( rule__Place__TokensAssignment_3_1_1 ) )
            // InternalPetriNetz.g:751:2: ( rule__Place__TokensAssignment_3_1_1 )
            {
             before(grammarAccess.getPlaceAccess().getTokensAssignment_3_1_1()); 
            // InternalPetriNetz.g:752:2: ( rule__Place__TokensAssignment_3_1_1 )
            // InternalPetriNetz.g:752:3: rule__Place__TokensAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Place__TokensAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPlaceAccess().getTokensAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_3_1__1__Impl"


    // $ANTLR start "rule__Place__Group_5__0"
    // InternalPetriNetz.g:761:1: rule__Place__Group_5__0 : rule__Place__Group_5__0__Impl rule__Place__Group_5__1 ;
    public final void rule__Place__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:765:1: ( rule__Place__Group_5__0__Impl rule__Place__Group_5__1 )
            // InternalPetriNetz.g:766:2: rule__Place__Group_5__0__Impl rule__Place__Group_5__1
            {
            pushFollow(FOLLOW_9);
            rule__Place__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_5__0"


    // $ANTLR start "rule__Place__Group_5__0__Impl"
    // InternalPetriNetz.g:773:1: rule__Place__Group_5__0__Impl : ( 'out' ) ;
    public final void rule__Place__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:777:1: ( ( 'out' ) )
            // InternalPetriNetz.g:778:1: ( 'out' )
            {
            // InternalPetriNetz.g:778:1: ( 'out' )
            // InternalPetriNetz.g:779:2: 'out'
            {
             before(grammarAccess.getPlaceAccess().getOutKeyword_5_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getOutKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_5__0__Impl"


    // $ANTLR start "rule__Place__Group_5__1"
    // InternalPetriNetz.g:788:1: rule__Place__Group_5__1 : rule__Place__Group_5__1__Impl rule__Place__Group_5__2 ;
    public final void rule__Place__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:792:1: ( rule__Place__Group_5__1__Impl rule__Place__Group_5__2 )
            // InternalPetriNetz.g:793:2: rule__Place__Group_5__1__Impl rule__Place__Group_5__2
            {
            pushFollow(FOLLOW_4);
            rule__Place__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_5__1"


    // $ANTLR start "rule__Place__Group_5__1__Impl"
    // InternalPetriNetz.g:800:1: rule__Place__Group_5__1__Impl : ( ':' ) ;
    public final void rule__Place__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:804:1: ( ( ':' ) )
            // InternalPetriNetz.g:805:1: ( ':' )
            {
            // InternalPetriNetz.g:805:1: ( ':' )
            // InternalPetriNetz.g:806:2: ':'
            {
             before(grammarAccess.getPlaceAccess().getColonKeyword_5_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getColonKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_5__1__Impl"


    // $ANTLR start "rule__Place__Group_5__2"
    // InternalPetriNetz.g:815:1: rule__Place__Group_5__2 : rule__Place__Group_5__2__Impl rule__Place__Group_5__3 ;
    public final void rule__Place__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:819:1: ( rule__Place__Group_5__2__Impl rule__Place__Group_5__3 )
            // InternalPetriNetz.g:820:2: rule__Place__Group_5__2__Impl rule__Place__Group_5__3
            {
            pushFollow(FOLLOW_12);
            rule__Place__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_5__2"


    // $ANTLR start "rule__Place__Group_5__2__Impl"
    // InternalPetriNetz.g:827:1: rule__Place__Group_5__2__Impl : ( ( rule__Place__OutAssignment_5_2 ) ) ;
    public final void rule__Place__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:831:1: ( ( ( rule__Place__OutAssignment_5_2 ) ) )
            // InternalPetriNetz.g:832:1: ( ( rule__Place__OutAssignment_5_2 ) )
            {
            // InternalPetriNetz.g:832:1: ( ( rule__Place__OutAssignment_5_2 ) )
            // InternalPetriNetz.g:833:2: ( rule__Place__OutAssignment_5_2 )
            {
             before(grammarAccess.getPlaceAccess().getOutAssignment_5_2()); 
            // InternalPetriNetz.g:834:2: ( rule__Place__OutAssignment_5_2 )
            // InternalPetriNetz.g:834:3: rule__Place__OutAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Place__OutAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getPlaceAccess().getOutAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_5__2__Impl"


    // $ANTLR start "rule__Place__Group_5__3"
    // InternalPetriNetz.g:842:1: rule__Place__Group_5__3 : rule__Place__Group_5__3__Impl ;
    public final void rule__Place__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:846:1: ( rule__Place__Group_5__3__Impl )
            // InternalPetriNetz.g:847:2: rule__Place__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Place__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_5__3"


    // $ANTLR start "rule__Place__Group_5__3__Impl"
    // InternalPetriNetz.g:853:1: rule__Place__Group_5__3__Impl : ( ( rule__Place__Group_5_3__0 )* ) ;
    public final void rule__Place__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:857:1: ( ( ( rule__Place__Group_5_3__0 )* ) )
            // InternalPetriNetz.g:858:1: ( ( rule__Place__Group_5_3__0 )* )
            {
            // InternalPetriNetz.g:858:1: ( ( rule__Place__Group_5_3__0 )* )
            // InternalPetriNetz.g:859:2: ( rule__Place__Group_5_3__0 )*
            {
             before(grammarAccess.getPlaceAccess().getGroup_5_3()); 
            // InternalPetriNetz.g:860:2: ( rule__Place__Group_5_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPetriNetz.g:860:3: rule__Place__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Place__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getPlaceAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_5__3__Impl"


    // $ANTLR start "rule__Place__Group_5_3__0"
    // InternalPetriNetz.g:869:1: rule__Place__Group_5_3__0 : rule__Place__Group_5_3__0__Impl rule__Place__Group_5_3__1 ;
    public final void rule__Place__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:873:1: ( rule__Place__Group_5_3__0__Impl rule__Place__Group_5_3__1 )
            // InternalPetriNetz.g:874:2: rule__Place__Group_5_3__0__Impl rule__Place__Group_5_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Place__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_5_3__0"


    // $ANTLR start "rule__Place__Group_5_3__0__Impl"
    // InternalPetriNetz.g:881:1: rule__Place__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Place__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:885:1: ( ( ',' ) )
            // InternalPetriNetz.g:886:1: ( ',' )
            {
            // InternalPetriNetz.g:886:1: ( ',' )
            // InternalPetriNetz.g:887:2: ','
            {
             before(grammarAccess.getPlaceAccess().getCommaKeyword_5_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_5_3__0__Impl"


    // $ANTLR start "rule__Place__Group_5_3__1"
    // InternalPetriNetz.g:896:1: rule__Place__Group_5_3__1 : rule__Place__Group_5_3__1__Impl ;
    public final void rule__Place__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:900:1: ( rule__Place__Group_5_3__1__Impl )
            // InternalPetriNetz.g:901:2: rule__Place__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Place__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_5_3__1"


    // $ANTLR start "rule__Place__Group_5_3__1__Impl"
    // InternalPetriNetz.g:907:1: rule__Place__Group_5_3__1__Impl : ( ( rule__Place__OutAssignment_5_3_1 ) ) ;
    public final void rule__Place__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:911:1: ( ( ( rule__Place__OutAssignment_5_3_1 ) ) )
            // InternalPetriNetz.g:912:1: ( ( rule__Place__OutAssignment_5_3_1 ) )
            {
            // InternalPetriNetz.g:912:1: ( ( rule__Place__OutAssignment_5_3_1 ) )
            // InternalPetriNetz.g:913:2: ( rule__Place__OutAssignment_5_3_1 )
            {
             before(grammarAccess.getPlaceAccess().getOutAssignment_5_3_1()); 
            // InternalPetriNetz.g:914:2: ( rule__Place__OutAssignment_5_3_1 )
            // InternalPetriNetz.g:914:3: rule__Place__OutAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Place__OutAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPlaceAccess().getOutAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_5_3__1__Impl"


    // $ANTLR start "rule__Place__Group_6__0"
    // InternalPetriNetz.g:923:1: rule__Place__Group_6__0 : rule__Place__Group_6__0__Impl rule__Place__Group_6__1 ;
    public final void rule__Place__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:927:1: ( rule__Place__Group_6__0__Impl rule__Place__Group_6__1 )
            // InternalPetriNetz.g:928:2: rule__Place__Group_6__0__Impl rule__Place__Group_6__1
            {
            pushFollow(FOLLOW_9);
            rule__Place__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_6__0"


    // $ANTLR start "rule__Place__Group_6__0__Impl"
    // InternalPetriNetz.g:935:1: rule__Place__Group_6__0__Impl : ( 'in' ) ;
    public final void rule__Place__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:939:1: ( ( 'in' ) )
            // InternalPetriNetz.g:940:1: ( 'in' )
            {
            // InternalPetriNetz.g:940:1: ( 'in' )
            // InternalPetriNetz.g:941:2: 'in'
            {
             before(grammarAccess.getPlaceAccess().getInKeyword_6_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getInKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_6__0__Impl"


    // $ANTLR start "rule__Place__Group_6__1"
    // InternalPetriNetz.g:950:1: rule__Place__Group_6__1 : rule__Place__Group_6__1__Impl rule__Place__Group_6__2 ;
    public final void rule__Place__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:954:1: ( rule__Place__Group_6__1__Impl rule__Place__Group_6__2 )
            // InternalPetriNetz.g:955:2: rule__Place__Group_6__1__Impl rule__Place__Group_6__2
            {
            pushFollow(FOLLOW_4);
            rule__Place__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_6__1"


    // $ANTLR start "rule__Place__Group_6__1__Impl"
    // InternalPetriNetz.g:962:1: rule__Place__Group_6__1__Impl : ( ':' ) ;
    public final void rule__Place__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:966:1: ( ( ':' ) )
            // InternalPetriNetz.g:967:1: ( ':' )
            {
            // InternalPetriNetz.g:967:1: ( ':' )
            // InternalPetriNetz.g:968:2: ':'
            {
             before(grammarAccess.getPlaceAccess().getColonKeyword_6_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getColonKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_6__1__Impl"


    // $ANTLR start "rule__Place__Group_6__2"
    // InternalPetriNetz.g:977:1: rule__Place__Group_6__2 : rule__Place__Group_6__2__Impl rule__Place__Group_6__3 ;
    public final void rule__Place__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:981:1: ( rule__Place__Group_6__2__Impl rule__Place__Group_6__3 )
            // InternalPetriNetz.g:982:2: rule__Place__Group_6__2__Impl rule__Place__Group_6__3
            {
            pushFollow(FOLLOW_12);
            rule__Place__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_6__2"


    // $ANTLR start "rule__Place__Group_6__2__Impl"
    // InternalPetriNetz.g:989:1: rule__Place__Group_6__2__Impl : ( ( rule__Place__InAssignment_6_2 ) ) ;
    public final void rule__Place__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:993:1: ( ( ( rule__Place__InAssignment_6_2 ) ) )
            // InternalPetriNetz.g:994:1: ( ( rule__Place__InAssignment_6_2 ) )
            {
            // InternalPetriNetz.g:994:1: ( ( rule__Place__InAssignment_6_2 ) )
            // InternalPetriNetz.g:995:2: ( rule__Place__InAssignment_6_2 )
            {
             before(grammarAccess.getPlaceAccess().getInAssignment_6_2()); 
            // InternalPetriNetz.g:996:2: ( rule__Place__InAssignment_6_2 )
            // InternalPetriNetz.g:996:3: rule__Place__InAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Place__InAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getPlaceAccess().getInAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_6__2__Impl"


    // $ANTLR start "rule__Place__Group_6__3"
    // InternalPetriNetz.g:1004:1: rule__Place__Group_6__3 : rule__Place__Group_6__3__Impl ;
    public final void rule__Place__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1008:1: ( rule__Place__Group_6__3__Impl )
            // InternalPetriNetz.g:1009:2: rule__Place__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Place__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_6__3"


    // $ANTLR start "rule__Place__Group_6__3__Impl"
    // InternalPetriNetz.g:1015:1: rule__Place__Group_6__3__Impl : ( ( rule__Place__Group_6_3__0 )* ) ;
    public final void rule__Place__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1019:1: ( ( ( rule__Place__Group_6_3__0 )* ) )
            // InternalPetriNetz.g:1020:1: ( ( rule__Place__Group_6_3__0 )* )
            {
            // InternalPetriNetz.g:1020:1: ( ( rule__Place__Group_6_3__0 )* )
            // InternalPetriNetz.g:1021:2: ( rule__Place__Group_6_3__0 )*
            {
             before(grammarAccess.getPlaceAccess().getGroup_6_3()); 
            // InternalPetriNetz.g:1022:2: ( rule__Place__Group_6_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPetriNetz.g:1022:3: rule__Place__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Place__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getPlaceAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_6__3__Impl"


    // $ANTLR start "rule__Place__Group_6_3__0"
    // InternalPetriNetz.g:1031:1: rule__Place__Group_6_3__0 : rule__Place__Group_6_3__0__Impl rule__Place__Group_6_3__1 ;
    public final void rule__Place__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1035:1: ( rule__Place__Group_6_3__0__Impl rule__Place__Group_6_3__1 )
            // InternalPetriNetz.g:1036:2: rule__Place__Group_6_3__0__Impl rule__Place__Group_6_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Place__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_6_3__0"


    // $ANTLR start "rule__Place__Group_6_3__0__Impl"
    // InternalPetriNetz.g:1043:1: rule__Place__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Place__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1047:1: ( ( ',' ) )
            // InternalPetriNetz.g:1048:1: ( ',' )
            {
            // InternalPetriNetz.g:1048:1: ( ',' )
            // InternalPetriNetz.g:1049:2: ','
            {
             before(grammarAccess.getPlaceAccess().getCommaKeyword_6_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_6_3__0__Impl"


    // $ANTLR start "rule__Place__Group_6_3__1"
    // InternalPetriNetz.g:1058:1: rule__Place__Group_6_3__1 : rule__Place__Group_6_3__1__Impl ;
    public final void rule__Place__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1062:1: ( rule__Place__Group_6_3__1__Impl )
            // InternalPetriNetz.g:1063:2: rule__Place__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Place__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_6_3__1"


    // $ANTLR start "rule__Place__Group_6_3__1__Impl"
    // InternalPetriNetz.g:1069:1: rule__Place__Group_6_3__1__Impl : ( ( rule__Place__InAssignment_6_3_1 ) ) ;
    public final void rule__Place__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1073:1: ( ( ( rule__Place__InAssignment_6_3_1 ) ) )
            // InternalPetriNetz.g:1074:1: ( ( rule__Place__InAssignment_6_3_1 ) )
            {
            // InternalPetriNetz.g:1074:1: ( ( rule__Place__InAssignment_6_3_1 ) )
            // InternalPetriNetz.g:1075:2: ( rule__Place__InAssignment_6_3_1 )
            {
             before(grammarAccess.getPlaceAccess().getInAssignment_6_3_1()); 
            // InternalPetriNetz.g:1076:2: ( rule__Place__InAssignment_6_3_1 )
            // InternalPetriNetz.g:1076:3: rule__Place__InAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Place__InAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPlaceAccess().getInAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_6_3__1__Impl"


    // $ANTLR start "rule__Token__Group__0"
    // InternalPetriNetz.g:1085:1: rule__Token__Group__0 : rule__Token__Group__0__Impl rule__Token__Group__1 ;
    public final void rule__Token__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1089:1: ( rule__Token__Group__0__Impl rule__Token__Group__1 )
            // InternalPetriNetz.g:1090:2: rule__Token__Group__0__Impl rule__Token__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Token__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Token__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Token__Group__0"


    // $ANTLR start "rule__Token__Group__0__Impl"
    // InternalPetriNetz.g:1097:1: rule__Token__Group__0__Impl : ( () ) ;
    public final void rule__Token__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1101:1: ( ( () ) )
            // InternalPetriNetz.g:1102:1: ( () )
            {
            // InternalPetriNetz.g:1102:1: ( () )
            // InternalPetriNetz.g:1103:2: ()
            {
             before(grammarAccess.getTokenAccess().getTokenAction_0()); 
            // InternalPetriNetz.g:1104:2: ()
            // InternalPetriNetz.g:1104:3: 
            {
            }

             after(grammarAccess.getTokenAccess().getTokenAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Token__Group__0__Impl"


    // $ANTLR start "rule__Token__Group__1"
    // InternalPetriNetz.g:1112:1: rule__Token__Group__1 : rule__Token__Group__1__Impl ;
    public final void rule__Token__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1116:1: ( rule__Token__Group__1__Impl )
            // InternalPetriNetz.g:1117:2: rule__Token__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Token__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Token__Group__1"


    // $ANTLR start "rule__Token__Group__1__Impl"
    // InternalPetriNetz.g:1123:1: rule__Token__Group__1__Impl : ( 'token' ) ;
    public final void rule__Token__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1127:1: ( ( 'token' ) )
            // InternalPetriNetz.g:1128:1: ( 'token' )
            {
            // InternalPetriNetz.g:1128:1: ( 'token' )
            // InternalPetriNetz.g:1129:2: 'token'
            {
             before(grammarAccess.getTokenAccess().getTokenKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTokenAccess().getTokenKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Token__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // InternalPetriNetz.g:1139:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1143:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalPetriNetz.g:1144:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // InternalPetriNetz.g:1151:1: rule__Transition__Group__0__Impl : ( 'transition' ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1155:1: ( ( 'transition' ) )
            // InternalPetriNetz.g:1156:1: ( 'transition' )
            {
            // InternalPetriNetz.g:1156:1: ( 'transition' )
            // InternalPetriNetz.g:1157:2: 'transition'
            {
             before(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // InternalPetriNetz.g:1166:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1170:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalPetriNetz.g:1171:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // InternalPetriNetz.g:1178:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__NameAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1182:1: ( ( ( rule__Transition__NameAssignment_1 ) ) )
            // InternalPetriNetz.g:1183:1: ( ( rule__Transition__NameAssignment_1 ) )
            {
            // InternalPetriNetz.g:1183:1: ( ( rule__Transition__NameAssignment_1 ) )
            // InternalPetriNetz.g:1184:2: ( rule__Transition__NameAssignment_1 )
            {
             before(grammarAccess.getTransitionAccess().getNameAssignment_1()); 
            // InternalPetriNetz.g:1185:2: ( rule__Transition__NameAssignment_1 )
            // InternalPetriNetz.g:1185:3: rule__Transition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // InternalPetriNetz.g:1193:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1197:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalPetriNetz.g:1198:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // InternalPetriNetz.g:1205:1: rule__Transition__Group__2__Impl : ( ':' ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1209:1: ( ( ':' ) )
            // InternalPetriNetz.g:1210:1: ( ':' )
            {
            // InternalPetriNetz.g:1210:1: ( ':' )
            // InternalPetriNetz.g:1211:2: ':'
            {
             before(grammarAccess.getTransitionAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // InternalPetriNetz.g:1220:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1224:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalPetriNetz.g:1225:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // InternalPetriNetz.g:1232:1: rule__Transition__Group__3__Impl : ( '{' ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1236:1: ( ( '{' ) )
            // InternalPetriNetz.g:1237:1: ( '{' )
            {
            // InternalPetriNetz.g:1237:1: ( '{' )
            // InternalPetriNetz.g:1238:2: '{'
            {
             before(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__4"
    // InternalPetriNetz.g:1247:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl rule__Transition__Group__5 ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1251:1: ( rule__Transition__Group__4__Impl rule__Transition__Group__5 )
            // InternalPetriNetz.g:1252:2: rule__Transition__Group__4__Impl rule__Transition__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Transition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4"


    // $ANTLR start "rule__Transition__Group__4__Impl"
    // InternalPetriNetz.g:1259:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__Group_4__0 )? ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1263:1: ( ( ( rule__Transition__Group_4__0 )? ) )
            // InternalPetriNetz.g:1264:1: ( ( rule__Transition__Group_4__0 )? )
            {
            // InternalPetriNetz.g:1264:1: ( ( rule__Transition__Group_4__0 )? )
            // InternalPetriNetz.g:1265:2: ( rule__Transition__Group_4__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_4()); 
            // InternalPetriNetz.g:1266:2: ( rule__Transition__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPetriNetz.g:1266:3: rule__Transition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4__Impl"


    // $ANTLR start "rule__Transition__Group__5"
    // InternalPetriNetz.g:1274:1: rule__Transition__Group__5 : rule__Transition__Group__5__Impl rule__Transition__Group__6 ;
    public final void rule__Transition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1278:1: ( rule__Transition__Group__5__Impl rule__Transition__Group__6 )
            // InternalPetriNetz.g:1279:2: rule__Transition__Group__5__Impl rule__Transition__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Transition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5"


    // $ANTLR start "rule__Transition__Group__5__Impl"
    // InternalPetriNetz.g:1286:1: rule__Transition__Group__5__Impl : ( ( rule__Transition__Group_5__0 )? ) ;
    public final void rule__Transition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1290:1: ( ( ( rule__Transition__Group_5__0 )? ) )
            // InternalPetriNetz.g:1291:1: ( ( rule__Transition__Group_5__0 )? )
            {
            // InternalPetriNetz.g:1291:1: ( ( rule__Transition__Group_5__0 )? )
            // InternalPetriNetz.g:1292:2: ( rule__Transition__Group_5__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_5()); 
            // InternalPetriNetz.g:1293:2: ( rule__Transition__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPetriNetz.g:1293:3: rule__Transition__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5__Impl"


    // $ANTLR start "rule__Transition__Group__6"
    // InternalPetriNetz.g:1301:1: rule__Transition__Group__6 : rule__Transition__Group__6__Impl ;
    public final void rule__Transition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1305:1: ( rule__Transition__Group__6__Impl )
            // InternalPetriNetz.g:1306:2: rule__Transition__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__6"


    // $ANTLR start "rule__Transition__Group__6__Impl"
    // InternalPetriNetz.g:1312:1: rule__Transition__Group__6__Impl : ( '}' ) ;
    public final void rule__Transition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1316:1: ( ( '}' ) )
            // InternalPetriNetz.g:1317:1: ( '}' )
            {
            // InternalPetriNetz.g:1317:1: ( '}' )
            // InternalPetriNetz.g:1318:2: '}'
            {
             before(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__6__Impl"


    // $ANTLR start "rule__Transition__Group_4__0"
    // InternalPetriNetz.g:1328:1: rule__Transition__Group_4__0 : rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 ;
    public final void rule__Transition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1332:1: ( rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 )
            // InternalPetriNetz.g:1333:2: rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__Transition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__0"


    // $ANTLR start "rule__Transition__Group_4__0__Impl"
    // InternalPetriNetz.g:1340:1: rule__Transition__Group_4__0__Impl : ( 'in' ) ;
    public final void rule__Transition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1344:1: ( ( 'in' ) )
            // InternalPetriNetz.g:1345:1: ( 'in' )
            {
            // InternalPetriNetz.g:1345:1: ( 'in' )
            // InternalPetriNetz.g:1346:2: 'in'
            {
             before(grammarAccess.getTransitionAccess().getInKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getInKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__0__Impl"


    // $ANTLR start "rule__Transition__Group_4__1"
    // InternalPetriNetz.g:1355:1: rule__Transition__Group_4__1 : rule__Transition__Group_4__1__Impl rule__Transition__Group_4__2 ;
    public final void rule__Transition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1359:1: ( rule__Transition__Group_4__1__Impl rule__Transition__Group_4__2 )
            // InternalPetriNetz.g:1360:2: rule__Transition__Group_4__1__Impl rule__Transition__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__Transition__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__1"


    // $ANTLR start "rule__Transition__Group_4__1__Impl"
    // InternalPetriNetz.g:1367:1: rule__Transition__Group_4__1__Impl : ( ':' ) ;
    public final void rule__Transition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1371:1: ( ( ':' ) )
            // InternalPetriNetz.g:1372:1: ( ':' )
            {
            // InternalPetriNetz.g:1372:1: ( ':' )
            // InternalPetriNetz.g:1373:2: ':'
            {
             before(grammarAccess.getTransitionAccess().getColonKeyword_4_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getColonKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__1__Impl"


    // $ANTLR start "rule__Transition__Group_4__2"
    // InternalPetriNetz.g:1382:1: rule__Transition__Group_4__2 : rule__Transition__Group_4__2__Impl rule__Transition__Group_4__3 ;
    public final void rule__Transition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1386:1: ( rule__Transition__Group_4__2__Impl rule__Transition__Group_4__3 )
            // InternalPetriNetz.g:1387:2: rule__Transition__Group_4__2__Impl rule__Transition__Group_4__3
            {
            pushFollow(FOLLOW_12);
            rule__Transition__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__2"


    // $ANTLR start "rule__Transition__Group_4__2__Impl"
    // InternalPetriNetz.g:1394:1: rule__Transition__Group_4__2__Impl : ( ( rule__Transition__InAssignment_4_2 ) ) ;
    public final void rule__Transition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1398:1: ( ( ( rule__Transition__InAssignment_4_2 ) ) )
            // InternalPetriNetz.g:1399:1: ( ( rule__Transition__InAssignment_4_2 ) )
            {
            // InternalPetriNetz.g:1399:1: ( ( rule__Transition__InAssignment_4_2 ) )
            // InternalPetriNetz.g:1400:2: ( rule__Transition__InAssignment_4_2 )
            {
             before(grammarAccess.getTransitionAccess().getInAssignment_4_2()); 
            // InternalPetriNetz.g:1401:2: ( rule__Transition__InAssignment_4_2 )
            // InternalPetriNetz.g:1401:3: rule__Transition__InAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Transition__InAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getInAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__2__Impl"


    // $ANTLR start "rule__Transition__Group_4__3"
    // InternalPetriNetz.g:1409:1: rule__Transition__Group_4__3 : rule__Transition__Group_4__3__Impl ;
    public final void rule__Transition__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1413:1: ( rule__Transition__Group_4__3__Impl )
            // InternalPetriNetz.g:1414:2: rule__Transition__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__3"


    // $ANTLR start "rule__Transition__Group_4__3__Impl"
    // InternalPetriNetz.g:1420:1: rule__Transition__Group_4__3__Impl : ( ( rule__Transition__Group_4_3__0 )* ) ;
    public final void rule__Transition__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1424:1: ( ( ( rule__Transition__Group_4_3__0 )* ) )
            // InternalPetriNetz.g:1425:1: ( ( rule__Transition__Group_4_3__0 )* )
            {
            // InternalPetriNetz.g:1425:1: ( ( rule__Transition__Group_4_3__0 )* )
            // InternalPetriNetz.g:1426:2: ( rule__Transition__Group_4_3__0 )*
            {
             before(grammarAccess.getTransitionAccess().getGroup_4_3()); 
            // InternalPetriNetz.g:1427:2: ( rule__Transition__Group_4_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==16) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPetriNetz.g:1427:3: rule__Transition__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Transition__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__3__Impl"


    // $ANTLR start "rule__Transition__Group_4_3__0"
    // InternalPetriNetz.g:1436:1: rule__Transition__Group_4_3__0 : rule__Transition__Group_4_3__0__Impl rule__Transition__Group_4_3__1 ;
    public final void rule__Transition__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1440:1: ( rule__Transition__Group_4_3__0__Impl rule__Transition__Group_4_3__1 )
            // InternalPetriNetz.g:1441:2: rule__Transition__Group_4_3__0__Impl rule__Transition__Group_4_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Transition__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4_3__0"


    // $ANTLR start "rule__Transition__Group_4_3__0__Impl"
    // InternalPetriNetz.g:1448:1: rule__Transition__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Transition__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1452:1: ( ( ',' ) )
            // InternalPetriNetz.g:1453:1: ( ',' )
            {
            // InternalPetriNetz.g:1453:1: ( ',' )
            // InternalPetriNetz.g:1454:2: ','
            {
             before(grammarAccess.getTransitionAccess().getCommaKeyword_4_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4_3__0__Impl"


    // $ANTLR start "rule__Transition__Group_4_3__1"
    // InternalPetriNetz.g:1463:1: rule__Transition__Group_4_3__1 : rule__Transition__Group_4_3__1__Impl ;
    public final void rule__Transition__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1467:1: ( rule__Transition__Group_4_3__1__Impl )
            // InternalPetriNetz.g:1468:2: rule__Transition__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4_3__1"


    // $ANTLR start "rule__Transition__Group_4_3__1__Impl"
    // InternalPetriNetz.g:1474:1: rule__Transition__Group_4_3__1__Impl : ( ( rule__Transition__InAssignment_4_3_1 ) ) ;
    public final void rule__Transition__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1478:1: ( ( ( rule__Transition__InAssignment_4_3_1 ) ) )
            // InternalPetriNetz.g:1479:1: ( ( rule__Transition__InAssignment_4_3_1 ) )
            {
            // InternalPetriNetz.g:1479:1: ( ( rule__Transition__InAssignment_4_3_1 ) )
            // InternalPetriNetz.g:1480:2: ( rule__Transition__InAssignment_4_3_1 )
            {
             before(grammarAccess.getTransitionAccess().getInAssignment_4_3_1()); 
            // InternalPetriNetz.g:1481:2: ( rule__Transition__InAssignment_4_3_1 )
            // InternalPetriNetz.g:1481:3: rule__Transition__InAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__InAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getInAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4_3__1__Impl"


    // $ANTLR start "rule__Transition__Group_5__0"
    // InternalPetriNetz.g:1490:1: rule__Transition__Group_5__0 : rule__Transition__Group_5__0__Impl rule__Transition__Group_5__1 ;
    public final void rule__Transition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1494:1: ( rule__Transition__Group_5__0__Impl rule__Transition__Group_5__1 )
            // InternalPetriNetz.g:1495:2: rule__Transition__Group_5__0__Impl rule__Transition__Group_5__1
            {
            pushFollow(FOLLOW_9);
            rule__Transition__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5__0"


    // $ANTLR start "rule__Transition__Group_5__0__Impl"
    // InternalPetriNetz.g:1502:1: rule__Transition__Group_5__0__Impl : ( 'out' ) ;
    public final void rule__Transition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1506:1: ( ( 'out' ) )
            // InternalPetriNetz.g:1507:1: ( 'out' )
            {
            // InternalPetriNetz.g:1507:1: ( 'out' )
            // InternalPetriNetz.g:1508:2: 'out'
            {
             before(grammarAccess.getTransitionAccess().getOutKeyword_5_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getOutKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5__0__Impl"


    // $ANTLR start "rule__Transition__Group_5__1"
    // InternalPetriNetz.g:1517:1: rule__Transition__Group_5__1 : rule__Transition__Group_5__1__Impl rule__Transition__Group_5__2 ;
    public final void rule__Transition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1521:1: ( rule__Transition__Group_5__1__Impl rule__Transition__Group_5__2 )
            // InternalPetriNetz.g:1522:2: rule__Transition__Group_5__1__Impl rule__Transition__Group_5__2
            {
            pushFollow(FOLLOW_4);
            rule__Transition__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5__1"


    // $ANTLR start "rule__Transition__Group_5__1__Impl"
    // InternalPetriNetz.g:1529:1: rule__Transition__Group_5__1__Impl : ( ':' ) ;
    public final void rule__Transition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1533:1: ( ( ':' ) )
            // InternalPetriNetz.g:1534:1: ( ':' )
            {
            // InternalPetriNetz.g:1534:1: ( ':' )
            // InternalPetriNetz.g:1535:2: ':'
            {
             before(grammarAccess.getTransitionAccess().getColonKeyword_5_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getColonKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5__1__Impl"


    // $ANTLR start "rule__Transition__Group_5__2"
    // InternalPetriNetz.g:1544:1: rule__Transition__Group_5__2 : rule__Transition__Group_5__2__Impl rule__Transition__Group_5__3 ;
    public final void rule__Transition__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1548:1: ( rule__Transition__Group_5__2__Impl rule__Transition__Group_5__3 )
            // InternalPetriNetz.g:1549:2: rule__Transition__Group_5__2__Impl rule__Transition__Group_5__3
            {
            pushFollow(FOLLOW_12);
            rule__Transition__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5__2"


    // $ANTLR start "rule__Transition__Group_5__2__Impl"
    // InternalPetriNetz.g:1556:1: rule__Transition__Group_5__2__Impl : ( ( rule__Transition__OutAssignment_5_2 ) ) ;
    public final void rule__Transition__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1560:1: ( ( ( rule__Transition__OutAssignment_5_2 ) ) )
            // InternalPetriNetz.g:1561:1: ( ( rule__Transition__OutAssignment_5_2 ) )
            {
            // InternalPetriNetz.g:1561:1: ( ( rule__Transition__OutAssignment_5_2 ) )
            // InternalPetriNetz.g:1562:2: ( rule__Transition__OutAssignment_5_2 )
            {
             before(grammarAccess.getTransitionAccess().getOutAssignment_5_2()); 
            // InternalPetriNetz.g:1563:2: ( rule__Transition__OutAssignment_5_2 )
            // InternalPetriNetz.g:1563:3: rule__Transition__OutAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Transition__OutAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getOutAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5__2__Impl"


    // $ANTLR start "rule__Transition__Group_5__3"
    // InternalPetriNetz.g:1571:1: rule__Transition__Group_5__3 : rule__Transition__Group_5__3__Impl ;
    public final void rule__Transition__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1575:1: ( rule__Transition__Group_5__3__Impl )
            // InternalPetriNetz.g:1576:2: rule__Transition__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5__3"


    // $ANTLR start "rule__Transition__Group_5__3__Impl"
    // InternalPetriNetz.g:1582:1: rule__Transition__Group_5__3__Impl : ( ( rule__Transition__Group_5_3__0 )* ) ;
    public final void rule__Transition__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1586:1: ( ( ( rule__Transition__Group_5_3__0 )* ) )
            // InternalPetriNetz.g:1587:1: ( ( rule__Transition__Group_5_3__0 )* )
            {
            // InternalPetriNetz.g:1587:1: ( ( rule__Transition__Group_5_3__0 )* )
            // InternalPetriNetz.g:1588:2: ( rule__Transition__Group_5_3__0 )*
            {
             before(grammarAccess.getTransitionAccess().getGroup_5_3()); 
            // InternalPetriNetz.g:1589:2: ( rule__Transition__Group_5_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==16) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPetriNetz.g:1589:3: rule__Transition__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Transition__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5__3__Impl"


    // $ANTLR start "rule__Transition__Group_5_3__0"
    // InternalPetriNetz.g:1598:1: rule__Transition__Group_5_3__0 : rule__Transition__Group_5_3__0__Impl rule__Transition__Group_5_3__1 ;
    public final void rule__Transition__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1602:1: ( rule__Transition__Group_5_3__0__Impl rule__Transition__Group_5_3__1 )
            // InternalPetriNetz.g:1603:2: rule__Transition__Group_5_3__0__Impl rule__Transition__Group_5_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Transition__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5_3__0"


    // $ANTLR start "rule__Transition__Group_5_3__0__Impl"
    // InternalPetriNetz.g:1610:1: rule__Transition__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Transition__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1614:1: ( ( ',' ) )
            // InternalPetriNetz.g:1615:1: ( ',' )
            {
            // InternalPetriNetz.g:1615:1: ( ',' )
            // InternalPetriNetz.g:1616:2: ','
            {
             before(grammarAccess.getTransitionAccess().getCommaKeyword_5_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5_3__0__Impl"


    // $ANTLR start "rule__Transition__Group_5_3__1"
    // InternalPetriNetz.g:1625:1: rule__Transition__Group_5_3__1 : rule__Transition__Group_5_3__1__Impl ;
    public final void rule__Transition__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1629:1: ( rule__Transition__Group_5_3__1__Impl )
            // InternalPetriNetz.g:1630:2: rule__Transition__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5_3__1"


    // $ANTLR start "rule__Transition__Group_5_3__1__Impl"
    // InternalPetriNetz.g:1636:1: rule__Transition__Group_5_3__1__Impl : ( ( rule__Transition__OutAssignment_5_3_1 ) ) ;
    public final void rule__Transition__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1640:1: ( ( ( rule__Transition__OutAssignment_5_3_1 ) ) )
            // InternalPetriNetz.g:1641:1: ( ( rule__Transition__OutAssignment_5_3_1 ) )
            {
            // InternalPetriNetz.g:1641:1: ( ( rule__Transition__OutAssignment_5_3_1 ) )
            // InternalPetriNetz.g:1642:2: ( rule__Transition__OutAssignment_5_3_1 )
            {
             before(grammarAccess.getTransitionAccess().getOutAssignment_5_3_1()); 
            // InternalPetriNetz.g:1643:2: ( rule__Transition__OutAssignment_5_3_1 )
            // InternalPetriNetz.g:1643:3: rule__Transition__OutAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__OutAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getOutAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5_3__1__Impl"


    // $ANTLR start "rule__Arc__Group__0"
    // InternalPetriNetz.g:1652:1: rule__Arc__Group__0 : rule__Arc__Group__0__Impl rule__Arc__Group__1 ;
    public final void rule__Arc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1656:1: ( rule__Arc__Group__0__Impl rule__Arc__Group__1 )
            // InternalPetriNetz.g:1657:2: rule__Arc__Group__0__Impl rule__Arc__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Arc__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arc__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__0"


    // $ANTLR start "rule__Arc__Group__0__Impl"
    // InternalPetriNetz.g:1664:1: rule__Arc__Group__0__Impl : ( ( rule__Arc__Alternatives_0 ) ) ;
    public final void rule__Arc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1668:1: ( ( ( rule__Arc__Alternatives_0 ) ) )
            // InternalPetriNetz.g:1669:1: ( ( rule__Arc__Alternatives_0 ) )
            {
            // InternalPetriNetz.g:1669:1: ( ( rule__Arc__Alternatives_0 ) )
            // InternalPetriNetz.g:1670:2: ( rule__Arc__Alternatives_0 )
            {
             before(grammarAccess.getArcAccess().getAlternatives_0()); 
            // InternalPetriNetz.g:1671:2: ( rule__Arc__Alternatives_0 )
            // InternalPetriNetz.g:1671:3: rule__Arc__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Arc__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getArcAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__0__Impl"


    // $ANTLR start "rule__Arc__Group__1"
    // InternalPetriNetz.g:1679:1: rule__Arc__Group__1 : rule__Arc__Group__1__Impl rule__Arc__Group__2 ;
    public final void rule__Arc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1683:1: ( rule__Arc__Group__1__Impl rule__Arc__Group__2 )
            // InternalPetriNetz.g:1684:2: rule__Arc__Group__1__Impl rule__Arc__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Arc__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arc__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__1"


    // $ANTLR start "rule__Arc__Group__1__Impl"
    // InternalPetriNetz.g:1691:1: rule__Arc__Group__1__Impl : ( 'arc' ) ;
    public final void rule__Arc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1695:1: ( ( 'arc' ) )
            // InternalPetriNetz.g:1696:1: ( 'arc' )
            {
            // InternalPetriNetz.g:1696:1: ( 'arc' )
            // InternalPetriNetz.g:1697:2: 'arc'
            {
             before(grammarAccess.getArcAccess().getArcKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getArcAccess().getArcKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__1__Impl"


    // $ANTLR start "rule__Arc__Group__2"
    // InternalPetriNetz.g:1706:1: rule__Arc__Group__2 : rule__Arc__Group__2__Impl ;
    public final void rule__Arc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1710:1: ( rule__Arc__Group__2__Impl )
            // InternalPetriNetz.g:1711:2: rule__Arc__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Arc__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__2"


    // $ANTLR start "rule__Arc__Group__2__Impl"
    // InternalPetriNetz.g:1717:1: rule__Arc__Group__2__Impl : ( ( rule__Arc__WeightAssignment_2 ) ) ;
    public final void rule__Arc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1721:1: ( ( ( rule__Arc__WeightAssignment_2 ) ) )
            // InternalPetriNetz.g:1722:1: ( ( rule__Arc__WeightAssignment_2 ) )
            {
            // InternalPetriNetz.g:1722:1: ( ( rule__Arc__WeightAssignment_2 ) )
            // InternalPetriNetz.g:1723:2: ( rule__Arc__WeightAssignment_2 )
            {
             before(grammarAccess.getArcAccess().getWeightAssignment_2()); 
            // InternalPetriNetz.g:1724:2: ( rule__Arc__WeightAssignment_2 )
            // InternalPetriNetz.g:1724:3: rule__Arc__WeightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Arc__WeightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getArcAccess().getWeightAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__2__Impl"


    // $ANTLR start "rule__PTArc__Group__0"
    // InternalPetriNetz.g:1733:1: rule__PTArc__Group__0 : rule__PTArc__Group__0__Impl rule__PTArc__Group__1 ;
    public final void rule__PTArc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1737:1: ( rule__PTArc__Group__0__Impl rule__PTArc__Group__1 )
            // InternalPetriNetz.g:1738:2: rule__PTArc__Group__0__Impl rule__PTArc__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__PTArc__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PTArc__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PTArc__Group__0"


    // $ANTLR start "rule__PTArc__Group__0__Impl"
    // InternalPetriNetz.g:1745:1: rule__PTArc__Group__0__Impl : ( '{' ) ;
    public final void rule__PTArc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1749:1: ( ( '{' ) )
            // InternalPetriNetz.g:1750:1: ( '{' )
            {
            // InternalPetriNetz.g:1750:1: ( '{' )
            // InternalPetriNetz.g:1751:2: '{'
            {
             before(grammarAccess.getPTArcAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPTArcAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PTArc__Group__0__Impl"


    // $ANTLR start "rule__PTArc__Group__1"
    // InternalPetriNetz.g:1760:1: rule__PTArc__Group__1 : rule__PTArc__Group__1__Impl rule__PTArc__Group__2 ;
    public final void rule__PTArc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1764:1: ( rule__PTArc__Group__1__Impl rule__PTArc__Group__2 )
            // InternalPetriNetz.g:1765:2: rule__PTArc__Group__1__Impl rule__PTArc__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__PTArc__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PTArc__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PTArc__Group__1"


    // $ANTLR start "rule__PTArc__Group__1__Impl"
    // InternalPetriNetz.g:1772:1: rule__PTArc__Group__1__Impl : ( ( rule__PTArc__SrcAssignment_1 ) ) ;
    public final void rule__PTArc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1776:1: ( ( ( rule__PTArc__SrcAssignment_1 ) ) )
            // InternalPetriNetz.g:1777:1: ( ( rule__PTArc__SrcAssignment_1 ) )
            {
            // InternalPetriNetz.g:1777:1: ( ( rule__PTArc__SrcAssignment_1 ) )
            // InternalPetriNetz.g:1778:2: ( rule__PTArc__SrcAssignment_1 )
            {
             before(grammarAccess.getPTArcAccess().getSrcAssignment_1()); 
            // InternalPetriNetz.g:1779:2: ( rule__PTArc__SrcAssignment_1 )
            // InternalPetriNetz.g:1779:3: rule__PTArc__SrcAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PTArc__SrcAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPTArcAccess().getSrcAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PTArc__Group__1__Impl"


    // $ANTLR start "rule__PTArc__Group__2"
    // InternalPetriNetz.g:1787:1: rule__PTArc__Group__2 : rule__PTArc__Group__2__Impl rule__PTArc__Group__3 ;
    public final void rule__PTArc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1791:1: ( rule__PTArc__Group__2__Impl rule__PTArc__Group__3 )
            // InternalPetriNetz.g:1792:2: rule__PTArc__Group__2__Impl rule__PTArc__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__PTArc__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PTArc__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PTArc__Group__2"


    // $ANTLR start "rule__PTArc__Group__2__Impl"
    // InternalPetriNetz.g:1799:1: rule__PTArc__Group__2__Impl : ( '>' ) ;
    public final void rule__PTArc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1803:1: ( ( '>' ) )
            // InternalPetriNetz.g:1804:1: ( '>' )
            {
            // InternalPetriNetz.g:1804:1: ( '>' )
            // InternalPetriNetz.g:1805:2: '>'
            {
             before(grammarAccess.getPTArcAccess().getGreaterThanSignKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPTArcAccess().getGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PTArc__Group__2__Impl"


    // $ANTLR start "rule__PTArc__Group__3"
    // InternalPetriNetz.g:1814:1: rule__PTArc__Group__3 : rule__PTArc__Group__3__Impl rule__PTArc__Group__4 ;
    public final void rule__PTArc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1818:1: ( rule__PTArc__Group__3__Impl rule__PTArc__Group__4 )
            // InternalPetriNetz.g:1819:2: rule__PTArc__Group__3__Impl rule__PTArc__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__PTArc__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PTArc__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PTArc__Group__3"


    // $ANTLR start "rule__PTArc__Group__3__Impl"
    // InternalPetriNetz.g:1826:1: rule__PTArc__Group__3__Impl : ( ( rule__PTArc__TrgAssignment_3 ) ) ;
    public final void rule__PTArc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1830:1: ( ( ( rule__PTArc__TrgAssignment_3 ) ) )
            // InternalPetriNetz.g:1831:1: ( ( rule__PTArc__TrgAssignment_3 ) )
            {
            // InternalPetriNetz.g:1831:1: ( ( rule__PTArc__TrgAssignment_3 ) )
            // InternalPetriNetz.g:1832:2: ( rule__PTArc__TrgAssignment_3 )
            {
             before(grammarAccess.getPTArcAccess().getTrgAssignment_3()); 
            // InternalPetriNetz.g:1833:2: ( rule__PTArc__TrgAssignment_3 )
            // InternalPetriNetz.g:1833:3: rule__PTArc__TrgAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PTArc__TrgAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPTArcAccess().getTrgAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PTArc__Group__3__Impl"


    // $ANTLR start "rule__PTArc__Group__4"
    // InternalPetriNetz.g:1841:1: rule__PTArc__Group__4 : rule__PTArc__Group__4__Impl ;
    public final void rule__PTArc__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1845:1: ( rule__PTArc__Group__4__Impl )
            // InternalPetriNetz.g:1846:2: rule__PTArc__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PTArc__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PTArc__Group__4"


    // $ANTLR start "rule__PTArc__Group__4__Impl"
    // InternalPetriNetz.g:1852:1: rule__PTArc__Group__4__Impl : ( '}' ) ;
    public final void rule__PTArc__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1856:1: ( ( '}' ) )
            // InternalPetriNetz.g:1857:1: ( '}' )
            {
            // InternalPetriNetz.g:1857:1: ( '}' )
            // InternalPetriNetz.g:1858:2: '}'
            {
             before(grammarAccess.getPTArcAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPTArcAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PTArc__Group__4__Impl"


    // $ANTLR start "rule__TPArc__Group__0"
    // InternalPetriNetz.g:1868:1: rule__TPArc__Group__0 : rule__TPArc__Group__0__Impl rule__TPArc__Group__1 ;
    public final void rule__TPArc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1872:1: ( rule__TPArc__Group__0__Impl rule__TPArc__Group__1 )
            // InternalPetriNetz.g:1873:2: rule__TPArc__Group__0__Impl rule__TPArc__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TPArc__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TPArc__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TPArc__Group__0"


    // $ANTLR start "rule__TPArc__Group__0__Impl"
    // InternalPetriNetz.g:1880:1: rule__TPArc__Group__0__Impl : ( '{' ) ;
    public final void rule__TPArc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1884:1: ( ( '{' ) )
            // InternalPetriNetz.g:1885:1: ( '{' )
            {
            // InternalPetriNetz.g:1885:1: ( '{' )
            // InternalPetriNetz.g:1886:2: '{'
            {
             before(grammarAccess.getTPArcAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTPArcAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TPArc__Group__0__Impl"


    // $ANTLR start "rule__TPArc__Group__1"
    // InternalPetriNetz.g:1895:1: rule__TPArc__Group__1 : rule__TPArc__Group__1__Impl rule__TPArc__Group__2 ;
    public final void rule__TPArc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1899:1: ( rule__TPArc__Group__1__Impl rule__TPArc__Group__2 )
            // InternalPetriNetz.g:1900:2: rule__TPArc__Group__1__Impl rule__TPArc__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__TPArc__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TPArc__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TPArc__Group__1"


    // $ANTLR start "rule__TPArc__Group__1__Impl"
    // InternalPetriNetz.g:1907:1: rule__TPArc__Group__1__Impl : ( ( rule__TPArc__TrgAssignment_1 ) ) ;
    public final void rule__TPArc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1911:1: ( ( ( rule__TPArc__TrgAssignment_1 ) ) )
            // InternalPetriNetz.g:1912:1: ( ( rule__TPArc__TrgAssignment_1 ) )
            {
            // InternalPetriNetz.g:1912:1: ( ( rule__TPArc__TrgAssignment_1 ) )
            // InternalPetriNetz.g:1913:2: ( rule__TPArc__TrgAssignment_1 )
            {
             before(grammarAccess.getTPArcAccess().getTrgAssignment_1()); 
            // InternalPetriNetz.g:1914:2: ( rule__TPArc__TrgAssignment_1 )
            // InternalPetriNetz.g:1914:3: rule__TPArc__TrgAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TPArc__TrgAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTPArcAccess().getTrgAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TPArc__Group__1__Impl"


    // $ANTLR start "rule__TPArc__Group__2"
    // InternalPetriNetz.g:1922:1: rule__TPArc__Group__2 : rule__TPArc__Group__2__Impl rule__TPArc__Group__3 ;
    public final void rule__TPArc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1926:1: ( rule__TPArc__Group__2__Impl rule__TPArc__Group__3 )
            // InternalPetriNetz.g:1927:2: rule__TPArc__Group__2__Impl rule__TPArc__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__TPArc__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TPArc__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TPArc__Group__2"


    // $ANTLR start "rule__TPArc__Group__2__Impl"
    // InternalPetriNetz.g:1934:1: rule__TPArc__Group__2__Impl : ( '<' ) ;
    public final void rule__TPArc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1938:1: ( ( '<' ) )
            // InternalPetriNetz.g:1939:1: ( '<' )
            {
            // InternalPetriNetz.g:1939:1: ( '<' )
            // InternalPetriNetz.g:1940:2: '<'
            {
             before(grammarAccess.getTPArcAccess().getLessThanSignKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTPArcAccess().getLessThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TPArc__Group__2__Impl"


    // $ANTLR start "rule__TPArc__Group__3"
    // InternalPetriNetz.g:1949:1: rule__TPArc__Group__3 : rule__TPArc__Group__3__Impl rule__TPArc__Group__4 ;
    public final void rule__TPArc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1953:1: ( rule__TPArc__Group__3__Impl rule__TPArc__Group__4 )
            // InternalPetriNetz.g:1954:2: rule__TPArc__Group__3__Impl rule__TPArc__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__TPArc__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TPArc__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TPArc__Group__3"


    // $ANTLR start "rule__TPArc__Group__3__Impl"
    // InternalPetriNetz.g:1961:1: rule__TPArc__Group__3__Impl : ( ( rule__TPArc__SrcAssignment_3 ) ) ;
    public final void rule__TPArc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1965:1: ( ( ( rule__TPArc__SrcAssignment_3 ) ) )
            // InternalPetriNetz.g:1966:1: ( ( rule__TPArc__SrcAssignment_3 ) )
            {
            // InternalPetriNetz.g:1966:1: ( ( rule__TPArc__SrcAssignment_3 ) )
            // InternalPetriNetz.g:1967:2: ( rule__TPArc__SrcAssignment_3 )
            {
             before(grammarAccess.getTPArcAccess().getSrcAssignment_3()); 
            // InternalPetriNetz.g:1968:2: ( rule__TPArc__SrcAssignment_3 )
            // InternalPetriNetz.g:1968:3: rule__TPArc__SrcAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TPArc__SrcAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTPArcAccess().getSrcAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TPArc__Group__3__Impl"


    // $ANTLR start "rule__TPArc__Group__4"
    // InternalPetriNetz.g:1976:1: rule__TPArc__Group__4 : rule__TPArc__Group__4__Impl ;
    public final void rule__TPArc__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1980:1: ( rule__TPArc__Group__4__Impl )
            // InternalPetriNetz.g:1981:2: rule__TPArc__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TPArc__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TPArc__Group__4"


    // $ANTLR start "rule__TPArc__Group__4__Impl"
    // InternalPetriNetz.g:1987:1: rule__TPArc__Group__4__Impl : ( '}' ) ;
    public final void rule__TPArc__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:1991:1: ( ( '}' ) )
            // InternalPetriNetz.g:1992:1: ( '}' )
            {
            // InternalPetriNetz.g:1992:1: ( '}' )
            // InternalPetriNetz.g:1993:2: '}'
            {
             before(grammarAccess.getTPArcAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTPArcAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TPArc__Group__4__Impl"


    // $ANTLR start "rule__Petrinet__NameAssignment_1"
    // InternalPetriNetz.g:2003:1: rule__Petrinet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Petrinet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:2007:1: ( ( RULE_ID ) )
            // InternalPetriNetz.g:2008:2: ( RULE_ID )
            {
            // InternalPetriNetz.g:2008:2: ( RULE_ID )
            // InternalPetriNetz.g:2009:3: RULE_ID
            {
             before(grammarAccess.getPetrinetAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPetrinetAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__NameAssignment_1"


    // $ANTLR start "rule__Petrinet__PlacesAssignment_3"
    // InternalPetriNetz.g:2018:1: rule__Petrinet__PlacesAssignment_3 : ( rulePlace ) ;
    public final void rule__Petrinet__PlacesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:2022:1: ( ( rulePlace ) )
            // InternalPetriNetz.g:2023:2: ( rulePlace )
            {
            // InternalPetriNetz.g:2023:2: ( rulePlace )
            // InternalPetriNetz.g:2024:3: rulePlace
            {
             before(grammarAccess.getPetrinetAccess().getPlacesPlaceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePlace();

            state._fsp--;

             after(grammarAccess.getPetrinetAccess().getPlacesPlaceParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__PlacesAssignment_3"


    // $ANTLR start "rule__Petrinet__TransitionsAssignment_4"
    // InternalPetriNetz.g:2033:1: rule__Petrinet__TransitionsAssignment_4 : ( ruleTransition ) ;
    public final void rule__Petrinet__TransitionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:2037:1: ( ( ruleTransition ) )
            // InternalPetriNetz.g:2038:2: ( ruleTransition )
            {
            // InternalPetriNetz.g:2038:2: ( ruleTransition )
            // InternalPetriNetz.g:2039:3: ruleTransition
            {
             before(grammarAccess.getPetrinetAccess().getTransitionsTransitionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getPetrinetAccess().getTransitionsTransitionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__TransitionsAssignment_4"


    // $ANTLR start "rule__Petrinet__ArcsAssignment_5"
    // InternalPetriNetz.g:2048:1: rule__Petrinet__ArcsAssignment_5 : ( ruleArc ) ;
    public final void rule__Petrinet__ArcsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:2052:1: ( ( ruleArc ) )
            // InternalPetriNetz.g:2053:2: ( ruleArc )
            {
            // InternalPetriNetz.g:2053:2: ( ruleArc )
            // InternalPetriNetz.g:2054:3: ruleArc
            {
             before(grammarAccess.getPetrinetAccess().getArcsArcParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleArc();

            state._fsp--;

             after(grammarAccess.getPetrinetAccess().getArcsArcParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__ArcsAssignment_5"


    // $ANTLR start "rule__Place__NameAssignment_1"
    // InternalPetriNetz.g:2063:1: rule__Place__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Place__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:2067:1: ( ( RULE_ID ) )
            // InternalPetriNetz.g:2068:2: ( RULE_ID )
            {
            // InternalPetriNetz.g:2068:2: ( RULE_ID )
            // InternalPetriNetz.g:2069:3: RULE_ID
            {
             before(grammarAccess.getPlaceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__NameAssignment_1"


    // $ANTLR start "rule__Place__TokensAssignment_3_0"
    // InternalPetriNetz.g:2078:1: rule__Place__TokensAssignment_3_0 : ( ruleToken ) ;
    public final void rule__Place__TokensAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:2082:1: ( ( ruleToken ) )
            // InternalPetriNetz.g:2083:2: ( ruleToken )
            {
            // InternalPetriNetz.g:2083:2: ( ruleToken )
            // InternalPetriNetz.g:2084:3: ruleToken
            {
             before(grammarAccess.getPlaceAccess().getTokensTokenParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleToken();

            state._fsp--;

             after(grammarAccess.getPlaceAccess().getTokensTokenParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__TokensAssignment_3_0"


    // $ANTLR start "rule__Place__TokensAssignment_3_1_1"
    // InternalPetriNetz.g:2093:1: rule__Place__TokensAssignment_3_1_1 : ( ruleToken ) ;
    public final void rule__Place__TokensAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:2097:1: ( ( ruleToken ) )
            // InternalPetriNetz.g:2098:2: ( ruleToken )
            {
            // InternalPetriNetz.g:2098:2: ( ruleToken )
            // InternalPetriNetz.g:2099:3: ruleToken
            {
             before(grammarAccess.getPlaceAccess().getTokensTokenParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleToken();

            state._fsp--;

             after(grammarAccess.getPlaceAccess().getTokensTokenParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__TokensAssignment_3_1_1"


    // $ANTLR start "rule__Place__OutAssignment_5_2"
    // InternalPetriNetz.g:2108:1: rule__Place__OutAssignment_5_2 : ( rulePTArc ) ;
    public final void rule__Place__OutAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:2112:1: ( ( rulePTArc ) )
            // InternalPetriNetz.g:2113:2: ( rulePTArc )
            {
            // InternalPetriNetz.g:2113:2: ( rulePTArc )
            // InternalPetriNetz.g:2114:3: rulePTArc
            {
             before(grammarAccess.getPlaceAccess().getOutPTArcParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            rulePTArc();

            state._fsp--;

             after(grammarAccess.getPlaceAccess().getOutPTArcParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__OutAssignment_5_2"


    // $ANTLR start "rule__Place__OutAssignment_5_3_1"
    // InternalPetriNetz.g:2123:1: rule__Place__OutAssignment_5_3_1 : ( rulePTArc ) ;
    public final void rule__Place__OutAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:2127:1: ( ( rulePTArc ) )
            // InternalPetriNetz.g:2128:2: ( rulePTArc )
            {
            // InternalPetriNetz.g:2128:2: ( rulePTArc )
            // InternalPetriNetz.g:2129:3: rulePTArc
            {
             before(grammarAccess.getPlaceAccess().getOutPTArcParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePTArc();

            state._fsp--;

             after(grammarAccess.getPlaceAccess().getOutPTArcParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__OutAssignment_5_3_1"


    // $ANTLR start "rule__Place__InAssignment_6_2"
    // InternalPetriNetz.g:2138:1: rule__Place__InAssignment_6_2 : ( ruleTPArc ) ;
    public final void rule__Place__InAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:2142:1: ( ( ruleTPArc ) )
            // InternalPetriNetz.g:2143:2: ( ruleTPArc )
            {
            // InternalPetriNetz.g:2143:2: ( ruleTPArc )
            // InternalPetriNetz.g:2144:3: ruleTPArc
            {
             before(grammarAccess.getPlaceAccess().getInTPArcParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTPArc();

            state._fsp--;

             after(grammarAccess.getPlaceAccess().getInTPArcParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__InAssignment_6_2"


    // $ANTLR start "rule__Place__InAssignment_6_3_1"
    // InternalPetriNetz.g:2153:1: rule__Place__InAssignment_6_3_1 : ( ruleTPArc ) ;
    public final void rule__Place__InAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:2157:1: ( ( ruleTPArc ) )
            // InternalPetriNetz.g:2158:2: ( ruleTPArc )
            {
            // InternalPetriNetz.g:2158:2: ( ruleTPArc )
            // InternalPetriNetz.g:2159:3: ruleTPArc
            {
             before(grammarAccess.getPlaceAccess().getInTPArcParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTPArc();

            state._fsp--;

             after(grammarAccess.getPlaceAccess().getInTPArcParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__InAssignment_6_3_1"


    // $ANTLR start "rule__Transition__NameAssignment_1"
    // InternalPetriNetz.g:2168:1: rule__Transition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Transition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:2172:1: ( ( RULE_ID ) )
            // InternalPetriNetz.g:2173:2: ( RULE_ID )
            {
            // InternalPetriNetz.g:2173:2: ( RULE_ID )
            // InternalPetriNetz.g:2174:3: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__NameAssignment_1"


    // $ANTLR start "rule__Transition__InAssignment_4_2"
    // InternalPetriNetz.g:2183:1: rule__Transition__InAssignment_4_2 : ( rulePTArc ) ;
    public final void rule__Transition__InAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:2187:1: ( ( rulePTArc ) )
            // InternalPetriNetz.g:2188:2: ( rulePTArc )
            {
            // InternalPetriNetz.g:2188:2: ( rulePTArc )
            // InternalPetriNetz.g:2189:3: rulePTArc
            {
             before(grammarAccess.getTransitionAccess().getInPTArcParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            rulePTArc();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getInPTArcParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__InAssignment_4_2"


    // $ANTLR start "rule__Transition__InAssignment_4_3_1"
    // InternalPetriNetz.g:2198:1: rule__Transition__InAssignment_4_3_1 : ( rulePTArc ) ;
    public final void rule__Transition__InAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:2202:1: ( ( rulePTArc ) )
            // InternalPetriNetz.g:2203:2: ( rulePTArc )
            {
            // InternalPetriNetz.g:2203:2: ( rulePTArc )
            // InternalPetriNetz.g:2204:3: rulePTArc
            {
             before(grammarAccess.getTransitionAccess().getInPTArcParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePTArc();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getInPTArcParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__InAssignment_4_3_1"


    // $ANTLR start "rule__Transition__OutAssignment_5_2"
    // InternalPetriNetz.g:2213:1: rule__Transition__OutAssignment_5_2 : ( ruleTPArc ) ;
    public final void rule__Transition__OutAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:2217:1: ( ( ruleTPArc ) )
            // InternalPetriNetz.g:2218:2: ( ruleTPArc )
            {
            // InternalPetriNetz.g:2218:2: ( ruleTPArc )
            // InternalPetriNetz.g:2219:3: ruleTPArc
            {
             before(grammarAccess.getTransitionAccess().getOutTPArcParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTPArc();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getOutTPArcParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__OutAssignment_5_2"


    // $ANTLR start "rule__Transition__OutAssignment_5_3_1"
    // InternalPetriNetz.g:2228:1: rule__Transition__OutAssignment_5_3_1 : ( ruleTPArc ) ;
    public final void rule__Transition__OutAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:2232:1: ( ( ruleTPArc ) )
            // InternalPetriNetz.g:2233:2: ( ruleTPArc )
            {
            // InternalPetriNetz.g:2233:2: ( ruleTPArc )
            // InternalPetriNetz.g:2234:3: ruleTPArc
            {
             before(grammarAccess.getTransitionAccess().getOutTPArcParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTPArc();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getOutTPArcParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__OutAssignment_5_3_1"


    // $ANTLR start "rule__Arc__WeightAssignment_2"
    // InternalPetriNetz.g:2243:1: rule__Arc__WeightAssignment_2 : ( RULE_INT ) ;
    public final void rule__Arc__WeightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:2247:1: ( ( RULE_INT ) )
            // InternalPetriNetz.g:2248:2: ( RULE_INT )
            {
            // InternalPetriNetz.g:2248:2: ( RULE_INT )
            // InternalPetriNetz.g:2249:3: RULE_INT
            {
             before(grammarAccess.getArcAccess().getWeightINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getArcAccess().getWeightINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__WeightAssignment_2"


    // $ANTLR start "rule__PTArc__SrcAssignment_1"
    // InternalPetriNetz.g:2258:1: rule__PTArc__SrcAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__PTArc__SrcAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:2262:1: ( ( ( RULE_ID ) ) )
            // InternalPetriNetz.g:2263:2: ( ( RULE_ID ) )
            {
            // InternalPetriNetz.g:2263:2: ( ( RULE_ID ) )
            // InternalPetriNetz.g:2264:3: ( RULE_ID )
            {
             before(grammarAccess.getPTArcAccess().getSrcPlaceCrossReference_1_0()); 
            // InternalPetriNetz.g:2265:3: ( RULE_ID )
            // InternalPetriNetz.g:2266:4: RULE_ID
            {
             before(grammarAccess.getPTArcAccess().getSrcPlaceIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPTArcAccess().getSrcPlaceIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getPTArcAccess().getSrcPlaceCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PTArc__SrcAssignment_1"


    // $ANTLR start "rule__PTArc__TrgAssignment_3"
    // InternalPetriNetz.g:2277:1: rule__PTArc__TrgAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__PTArc__TrgAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:2281:1: ( ( ( RULE_ID ) ) )
            // InternalPetriNetz.g:2282:2: ( ( RULE_ID ) )
            {
            // InternalPetriNetz.g:2282:2: ( ( RULE_ID ) )
            // InternalPetriNetz.g:2283:3: ( RULE_ID )
            {
             before(grammarAccess.getPTArcAccess().getTrgTransitionCrossReference_3_0()); 
            // InternalPetriNetz.g:2284:3: ( RULE_ID )
            // InternalPetriNetz.g:2285:4: RULE_ID
            {
             before(grammarAccess.getPTArcAccess().getTrgTransitionIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPTArcAccess().getTrgTransitionIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getPTArcAccess().getTrgTransitionCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PTArc__TrgAssignment_3"


    // $ANTLR start "rule__TPArc__TrgAssignment_1"
    // InternalPetriNetz.g:2296:1: rule__TPArc__TrgAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__TPArc__TrgAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:2300:1: ( ( ( RULE_ID ) ) )
            // InternalPetriNetz.g:2301:2: ( ( RULE_ID ) )
            {
            // InternalPetriNetz.g:2301:2: ( ( RULE_ID ) )
            // InternalPetriNetz.g:2302:3: ( RULE_ID )
            {
             before(grammarAccess.getTPArcAccess().getTrgPlaceCrossReference_1_0()); 
            // InternalPetriNetz.g:2303:3: ( RULE_ID )
            // InternalPetriNetz.g:2304:4: RULE_ID
            {
             before(grammarAccess.getTPArcAccess().getTrgPlaceIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTPArcAccess().getTrgPlaceIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getTPArcAccess().getTrgPlaceCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TPArc__TrgAssignment_1"


    // $ANTLR start "rule__TPArc__SrcAssignment_3"
    // InternalPetriNetz.g:2315:1: rule__TPArc__SrcAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__TPArc__SrcAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNetz.g:2319:1: ( ( ( RULE_ID ) ) )
            // InternalPetriNetz.g:2320:2: ( ( RULE_ID ) )
            {
            // InternalPetriNetz.g:2320:2: ( ( RULE_ID ) )
            // InternalPetriNetz.g:2321:3: ( RULE_ID )
            {
             before(grammarAccess.getTPArcAccess().getSrcTransitionCrossReference_3_0()); 
            // InternalPetriNetz.g:2322:3: ( RULE_ID )
            // InternalPetriNetz.g:2323:4: RULE_ID
            {
             before(grammarAccess.getTPArcAccess().getSrcTransitionIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTPArcAccess().getSrcTransitionIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getTPArcAccess().getSrcTransitionCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TPArc__SrcAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000107000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000062000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});

}