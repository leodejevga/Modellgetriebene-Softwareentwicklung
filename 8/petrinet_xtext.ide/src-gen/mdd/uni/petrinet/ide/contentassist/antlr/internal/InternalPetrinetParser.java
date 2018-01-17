package mdd.uni.petrinet.ide.contentassist.antlr.internal;

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
import mdd.uni.petrinet.services.PetrinetGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPetrinetParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'petrinet'", "'{'", "'}'", "'places'", "'transitions'", "'arcs'", "'place'", "'tokens'", "'out'", "'in'", "'token'", "'transition'", "'ptarc'", "'weight'", "'tparc'"
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

    	public void setGrammarAccess(PetrinetGrammarAccess grammarAccess) {
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
    // InternalPetrinet.g:53:1: entryRulePetrinet : rulePetrinet EOF ;
    public final void entryRulePetrinet() throws RecognitionException {
        try {
            // InternalPetrinet.g:54:1: ( rulePetrinet EOF )
            // InternalPetrinet.g:55:1: rulePetrinet EOF
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
    // InternalPetrinet.g:62:1: rulePetrinet : ( ( rule__Petrinet__Group__0 ) ) ;
    public final void rulePetrinet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:66:2: ( ( ( rule__Petrinet__Group__0 ) ) )
            // InternalPetrinet.g:67:2: ( ( rule__Petrinet__Group__0 ) )
            {
            // InternalPetrinet.g:67:2: ( ( rule__Petrinet__Group__0 ) )
            // InternalPetrinet.g:68:3: ( rule__Petrinet__Group__0 )
            {
             before(grammarAccess.getPetrinetAccess().getGroup()); 
            // InternalPetrinet.g:69:3: ( rule__Petrinet__Group__0 )
            // InternalPetrinet.g:69:4: rule__Petrinet__Group__0
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
    // InternalPetrinet.g:78:1: entryRulePlace : rulePlace EOF ;
    public final void entryRulePlace() throws RecognitionException {
        try {
            // InternalPetrinet.g:79:1: ( rulePlace EOF )
            // InternalPetrinet.g:80:1: rulePlace EOF
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
    // InternalPetrinet.g:87:1: rulePlace : ( ( rule__Place__Group__0 ) ) ;
    public final void rulePlace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:91:2: ( ( ( rule__Place__Group__0 ) ) )
            // InternalPetrinet.g:92:2: ( ( rule__Place__Group__0 ) )
            {
            // InternalPetrinet.g:92:2: ( ( rule__Place__Group__0 ) )
            // InternalPetrinet.g:93:3: ( rule__Place__Group__0 )
            {
             before(grammarAccess.getPlaceAccess().getGroup()); 
            // InternalPetrinet.g:94:3: ( rule__Place__Group__0 )
            // InternalPetrinet.g:94:4: rule__Place__Group__0
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
    // InternalPetrinet.g:103:1: entryRuleToken : ruleToken EOF ;
    public final void entryRuleToken() throws RecognitionException {
        try {
            // InternalPetrinet.g:104:1: ( ruleToken EOF )
            // InternalPetrinet.g:105:1: ruleToken EOF
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
    // InternalPetrinet.g:112:1: ruleToken : ( ( rule__Token__Group__0 ) ) ;
    public final void ruleToken() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:116:2: ( ( ( rule__Token__Group__0 ) ) )
            // InternalPetrinet.g:117:2: ( ( rule__Token__Group__0 ) )
            {
            // InternalPetrinet.g:117:2: ( ( rule__Token__Group__0 ) )
            // InternalPetrinet.g:118:3: ( rule__Token__Group__0 )
            {
             before(grammarAccess.getTokenAccess().getGroup()); 
            // InternalPetrinet.g:119:3: ( rule__Token__Group__0 )
            // InternalPetrinet.g:119:4: rule__Token__Group__0
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
    // InternalPetrinet.g:128:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalPetrinet.g:129:1: ( ruleTransition EOF )
            // InternalPetrinet.g:130:1: ruleTransition EOF
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
    // InternalPetrinet.g:137:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:141:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalPetrinet.g:142:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalPetrinet.g:142:2: ( ( rule__Transition__Group__0 ) )
            // InternalPetrinet.g:143:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalPetrinet.g:144:3: ( rule__Transition__Group__0 )
            // InternalPetrinet.g:144:4: rule__Transition__Group__0
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
    // InternalPetrinet.g:153:1: entryRuleArc : ruleArc EOF ;
    public final void entryRuleArc() throws RecognitionException {
        try {
            // InternalPetrinet.g:154:1: ( ruleArc EOF )
            // InternalPetrinet.g:155:1: ruleArc EOF
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
    // InternalPetrinet.g:162:1: ruleArc : ( ( rule__Arc__Alternatives ) ) ;
    public final void ruleArc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:166:2: ( ( ( rule__Arc__Alternatives ) ) )
            // InternalPetrinet.g:167:2: ( ( rule__Arc__Alternatives ) )
            {
            // InternalPetrinet.g:167:2: ( ( rule__Arc__Alternatives ) )
            // InternalPetrinet.g:168:3: ( rule__Arc__Alternatives )
            {
             before(grammarAccess.getArcAccess().getAlternatives()); 
            // InternalPetrinet.g:169:3: ( rule__Arc__Alternatives )
            // InternalPetrinet.g:169:4: rule__Arc__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Arc__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArcAccess().getAlternatives()); 

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
    // InternalPetrinet.g:178:1: entryRulePTArc : rulePTArc EOF ;
    public final void entryRulePTArc() throws RecognitionException {
        try {
            // InternalPetrinet.g:179:1: ( rulePTArc EOF )
            // InternalPetrinet.g:180:1: rulePTArc EOF
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
    // InternalPetrinet.g:187:1: rulePTArc : ( ( rule__PTArc__Group__0 ) ) ;
    public final void rulePTArc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:191:2: ( ( ( rule__PTArc__Group__0 ) ) )
            // InternalPetrinet.g:192:2: ( ( rule__PTArc__Group__0 ) )
            {
            // InternalPetrinet.g:192:2: ( ( rule__PTArc__Group__0 ) )
            // InternalPetrinet.g:193:3: ( rule__PTArc__Group__0 )
            {
             before(grammarAccess.getPTArcAccess().getGroup()); 
            // InternalPetrinet.g:194:3: ( rule__PTArc__Group__0 )
            // InternalPetrinet.g:194:4: rule__PTArc__Group__0
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
    // InternalPetrinet.g:203:1: entryRuleTPArc : ruleTPArc EOF ;
    public final void entryRuleTPArc() throws RecognitionException {
        try {
            // InternalPetrinet.g:204:1: ( ruleTPArc EOF )
            // InternalPetrinet.g:205:1: ruleTPArc EOF
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
    // InternalPetrinet.g:212:1: ruleTPArc : ( ( rule__TPArc__Group__0 ) ) ;
    public final void ruleTPArc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:216:2: ( ( ( rule__TPArc__Group__0 ) ) )
            // InternalPetrinet.g:217:2: ( ( rule__TPArc__Group__0 ) )
            {
            // InternalPetrinet.g:217:2: ( ( rule__TPArc__Group__0 ) )
            // InternalPetrinet.g:218:3: ( rule__TPArc__Group__0 )
            {
             before(grammarAccess.getTPArcAccess().getGroup()); 
            // InternalPetrinet.g:219:3: ( rule__TPArc__Group__0 )
            // InternalPetrinet.g:219:4: rule__TPArc__Group__0
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


    // $ANTLR start "rule__Arc__Alternatives"
    // InternalPetrinet.g:227:1: rule__Arc__Alternatives : ( ( rulePTArc ) | ( ruleTPArc ) );
    public final void rule__Arc__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:231:1: ( ( rulePTArc ) | ( ruleTPArc ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==23) ) {
                alt1=1;
            }
            else if ( (LA1_0==25) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalPetrinet.g:232:2: ( rulePTArc )
                    {
                    // InternalPetrinet.g:232:2: ( rulePTArc )
                    // InternalPetrinet.g:233:3: rulePTArc
                    {
                     before(grammarAccess.getArcAccess().getPTArcParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePTArc();

                    state._fsp--;

                     after(grammarAccess.getArcAccess().getPTArcParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPetrinet.g:238:2: ( ruleTPArc )
                    {
                    // InternalPetrinet.g:238:2: ( ruleTPArc )
                    // InternalPetrinet.g:239:3: ruleTPArc
                    {
                     before(grammarAccess.getArcAccess().getTPArcParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTPArc();

                    state._fsp--;

                     after(grammarAccess.getArcAccess().getTPArcParserRuleCall_1()); 

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
    // $ANTLR end "rule__Arc__Alternatives"


    // $ANTLR start "rule__Petrinet__Group__0"
    // InternalPetrinet.g:248:1: rule__Petrinet__Group__0 : rule__Petrinet__Group__0__Impl rule__Petrinet__Group__1 ;
    public final void rule__Petrinet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:252:1: ( rule__Petrinet__Group__0__Impl rule__Petrinet__Group__1 )
            // InternalPetrinet.g:253:2: rule__Petrinet__Group__0__Impl rule__Petrinet__Group__1
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
    // InternalPetrinet.g:260:1: rule__Petrinet__Group__0__Impl : ( 'petrinet' ) ;
    public final void rule__Petrinet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:264:1: ( ( 'petrinet' ) )
            // InternalPetrinet.g:265:1: ( 'petrinet' )
            {
            // InternalPetrinet.g:265:1: ( 'petrinet' )
            // InternalPetrinet.g:266:2: 'petrinet'
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
    // InternalPetrinet.g:275:1: rule__Petrinet__Group__1 : rule__Petrinet__Group__1__Impl rule__Petrinet__Group__2 ;
    public final void rule__Petrinet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:279:1: ( rule__Petrinet__Group__1__Impl rule__Petrinet__Group__2 )
            // InternalPetrinet.g:280:2: rule__Petrinet__Group__1__Impl rule__Petrinet__Group__2
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
    // InternalPetrinet.g:287:1: rule__Petrinet__Group__1__Impl : ( ( rule__Petrinet__NameAssignment_1 ) ) ;
    public final void rule__Petrinet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:291:1: ( ( ( rule__Petrinet__NameAssignment_1 ) ) )
            // InternalPetrinet.g:292:1: ( ( rule__Petrinet__NameAssignment_1 ) )
            {
            // InternalPetrinet.g:292:1: ( ( rule__Petrinet__NameAssignment_1 ) )
            // InternalPetrinet.g:293:2: ( rule__Petrinet__NameAssignment_1 )
            {
             before(grammarAccess.getPetrinetAccess().getNameAssignment_1()); 
            // InternalPetrinet.g:294:2: ( rule__Petrinet__NameAssignment_1 )
            // InternalPetrinet.g:294:3: rule__Petrinet__NameAssignment_1
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
    // InternalPetrinet.g:302:1: rule__Petrinet__Group__2 : rule__Petrinet__Group__2__Impl rule__Petrinet__Group__3 ;
    public final void rule__Petrinet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:306:1: ( rule__Petrinet__Group__2__Impl rule__Petrinet__Group__3 )
            // InternalPetrinet.g:307:2: rule__Petrinet__Group__2__Impl rule__Petrinet__Group__3
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
    // InternalPetrinet.g:314:1: rule__Petrinet__Group__2__Impl : ( '{' ) ;
    public final void rule__Petrinet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:318:1: ( ( '{' ) )
            // InternalPetrinet.g:319:1: ( '{' )
            {
            // InternalPetrinet.g:319:1: ( '{' )
            // InternalPetrinet.g:320:2: '{'
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
    // InternalPetrinet.g:329:1: rule__Petrinet__Group__3 : rule__Petrinet__Group__3__Impl rule__Petrinet__Group__4 ;
    public final void rule__Petrinet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:333:1: ( rule__Petrinet__Group__3__Impl rule__Petrinet__Group__4 )
            // InternalPetrinet.g:334:2: rule__Petrinet__Group__3__Impl rule__Petrinet__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalPetrinet.g:341:1: rule__Petrinet__Group__3__Impl : ( ( rule__Petrinet__Group_3__0 ) ) ;
    public final void rule__Petrinet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:345:1: ( ( ( rule__Petrinet__Group_3__0 ) ) )
            // InternalPetrinet.g:346:1: ( ( rule__Petrinet__Group_3__0 ) )
            {
            // InternalPetrinet.g:346:1: ( ( rule__Petrinet__Group_3__0 ) )
            // InternalPetrinet.g:347:2: ( rule__Petrinet__Group_3__0 )
            {
             before(grammarAccess.getPetrinetAccess().getGroup_3()); 
            // InternalPetrinet.g:348:2: ( rule__Petrinet__Group_3__0 )
            // InternalPetrinet.g:348:3: rule__Petrinet__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__Petrinet__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getPetrinetAccess().getGroup_3()); 

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
    // InternalPetrinet.g:356:1: rule__Petrinet__Group__4 : rule__Petrinet__Group__4__Impl ;
    public final void rule__Petrinet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:360:1: ( rule__Petrinet__Group__4__Impl )
            // InternalPetrinet.g:361:2: rule__Petrinet__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Petrinet__Group__4__Impl();

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
    // InternalPetrinet.g:367:1: rule__Petrinet__Group__4__Impl : ( '}' ) ;
    public final void rule__Petrinet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:371:1: ( ( '}' ) )
            // InternalPetrinet.g:372:1: ( '}' )
            {
            // InternalPetrinet.g:372:1: ( '}' )
            // InternalPetrinet.g:373:2: '}'
            {
             before(grammarAccess.getPetrinetAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPetrinetAccess().getRightCurlyBracketKeyword_4()); 

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


    // $ANTLR start "rule__Petrinet__Group_3__0"
    // InternalPetrinet.g:383:1: rule__Petrinet__Group_3__0 : rule__Petrinet__Group_3__0__Impl rule__Petrinet__Group_3__1 ;
    public final void rule__Petrinet__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:387:1: ( rule__Petrinet__Group_3__0__Impl rule__Petrinet__Group_3__1 )
            // InternalPetrinet.g:388:2: rule__Petrinet__Group_3__0__Impl rule__Petrinet__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Petrinet__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Petrinet__Group_3__1();

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
    // $ANTLR end "rule__Petrinet__Group_3__0"


    // $ANTLR start "rule__Petrinet__Group_3__0__Impl"
    // InternalPetrinet.g:395:1: rule__Petrinet__Group_3__0__Impl : ( ( rule__Petrinet__Group_3_0__0 ) ) ;
    public final void rule__Petrinet__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:399:1: ( ( ( rule__Petrinet__Group_3_0__0 ) ) )
            // InternalPetrinet.g:400:1: ( ( rule__Petrinet__Group_3_0__0 ) )
            {
            // InternalPetrinet.g:400:1: ( ( rule__Petrinet__Group_3_0__0 ) )
            // InternalPetrinet.g:401:2: ( rule__Petrinet__Group_3_0__0 )
            {
             before(grammarAccess.getPetrinetAccess().getGroup_3_0()); 
            // InternalPetrinet.g:402:2: ( rule__Petrinet__Group_3_0__0 )
            // InternalPetrinet.g:402:3: rule__Petrinet__Group_3_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Petrinet__Group_3_0__0();

            state._fsp--;


            }

             after(grammarAccess.getPetrinetAccess().getGroup_3_0()); 

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
    // $ANTLR end "rule__Petrinet__Group_3__0__Impl"


    // $ANTLR start "rule__Petrinet__Group_3__1"
    // InternalPetrinet.g:410:1: rule__Petrinet__Group_3__1 : rule__Petrinet__Group_3__1__Impl rule__Petrinet__Group_3__2 ;
    public final void rule__Petrinet__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:414:1: ( rule__Petrinet__Group_3__1__Impl rule__Petrinet__Group_3__2 )
            // InternalPetrinet.g:415:2: rule__Petrinet__Group_3__1__Impl rule__Petrinet__Group_3__2
            {
            pushFollow(FOLLOW_8);
            rule__Petrinet__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Petrinet__Group_3__2();

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
    // $ANTLR end "rule__Petrinet__Group_3__1"


    // $ANTLR start "rule__Petrinet__Group_3__1__Impl"
    // InternalPetrinet.g:422:1: rule__Petrinet__Group_3__1__Impl : ( ( rule__Petrinet__Group_3_1__0 ) ) ;
    public final void rule__Petrinet__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:426:1: ( ( ( rule__Petrinet__Group_3_1__0 ) ) )
            // InternalPetrinet.g:427:1: ( ( rule__Petrinet__Group_3_1__0 ) )
            {
            // InternalPetrinet.g:427:1: ( ( rule__Petrinet__Group_3_1__0 ) )
            // InternalPetrinet.g:428:2: ( rule__Petrinet__Group_3_1__0 )
            {
             before(grammarAccess.getPetrinetAccess().getGroup_3_1()); 
            // InternalPetrinet.g:429:2: ( rule__Petrinet__Group_3_1__0 )
            // InternalPetrinet.g:429:3: rule__Petrinet__Group_3_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Petrinet__Group_3_1__0();

            state._fsp--;


            }

             after(grammarAccess.getPetrinetAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__Petrinet__Group_3__1__Impl"


    // $ANTLR start "rule__Petrinet__Group_3__2"
    // InternalPetrinet.g:437:1: rule__Petrinet__Group_3__2 : rule__Petrinet__Group_3__2__Impl ;
    public final void rule__Petrinet__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:441:1: ( rule__Petrinet__Group_3__2__Impl )
            // InternalPetrinet.g:442:2: rule__Petrinet__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Petrinet__Group_3__2__Impl();

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
    // $ANTLR end "rule__Petrinet__Group_3__2"


    // $ANTLR start "rule__Petrinet__Group_3__2__Impl"
    // InternalPetrinet.g:448:1: rule__Petrinet__Group_3__2__Impl : ( ( rule__Petrinet__Group_3_2__0 ) ) ;
    public final void rule__Petrinet__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:452:1: ( ( ( rule__Petrinet__Group_3_2__0 ) ) )
            // InternalPetrinet.g:453:1: ( ( rule__Petrinet__Group_3_2__0 ) )
            {
            // InternalPetrinet.g:453:1: ( ( rule__Petrinet__Group_3_2__0 ) )
            // InternalPetrinet.g:454:2: ( rule__Petrinet__Group_3_2__0 )
            {
             before(grammarAccess.getPetrinetAccess().getGroup_3_2()); 
            // InternalPetrinet.g:455:2: ( rule__Petrinet__Group_3_2__0 )
            // InternalPetrinet.g:455:3: rule__Petrinet__Group_3_2__0
            {
            pushFollow(FOLLOW_2);
            rule__Petrinet__Group_3_2__0();

            state._fsp--;


            }

             after(grammarAccess.getPetrinetAccess().getGroup_3_2()); 

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
    // $ANTLR end "rule__Petrinet__Group_3__2__Impl"


    // $ANTLR start "rule__Petrinet__Group_3_0__0"
    // InternalPetrinet.g:464:1: rule__Petrinet__Group_3_0__0 : rule__Petrinet__Group_3_0__0__Impl rule__Petrinet__Group_3_0__1 ;
    public final void rule__Petrinet__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:468:1: ( rule__Petrinet__Group_3_0__0__Impl rule__Petrinet__Group_3_0__1 )
            // InternalPetrinet.g:469:2: rule__Petrinet__Group_3_0__0__Impl rule__Petrinet__Group_3_0__1
            {
            pushFollow(FOLLOW_4);
            rule__Petrinet__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Petrinet__Group_3_0__1();

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
    // $ANTLR end "rule__Petrinet__Group_3_0__0"


    // $ANTLR start "rule__Petrinet__Group_3_0__0__Impl"
    // InternalPetrinet.g:476:1: rule__Petrinet__Group_3_0__0__Impl : ( 'places' ) ;
    public final void rule__Petrinet__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:480:1: ( ( 'places' ) )
            // InternalPetrinet.g:481:1: ( 'places' )
            {
            // InternalPetrinet.g:481:1: ( 'places' )
            // InternalPetrinet.g:482:2: 'places'
            {
             before(grammarAccess.getPetrinetAccess().getPlacesKeyword_3_0_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPetrinetAccess().getPlacesKeyword_3_0_0()); 

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
    // $ANTLR end "rule__Petrinet__Group_3_0__0__Impl"


    // $ANTLR start "rule__Petrinet__Group_3_0__1"
    // InternalPetrinet.g:491:1: rule__Petrinet__Group_3_0__1 : rule__Petrinet__Group_3_0__1__Impl rule__Petrinet__Group_3_0__2 ;
    public final void rule__Petrinet__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:495:1: ( rule__Petrinet__Group_3_0__1__Impl rule__Petrinet__Group_3_0__2 )
            // InternalPetrinet.g:496:2: rule__Petrinet__Group_3_0__1__Impl rule__Petrinet__Group_3_0__2
            {
            pushFollow(FOLLOW_9);
            rule__Petrinet__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Petrinet__Group_3_0__2();

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
    // $ANTLR end "rule__Petrinet__Group_3_0__1"


    // $ANTLR start "rule__Petrinet__Group_3_0__1__Impl"
    // InternalPetrinet.g:503:1: rule__Petrinet__Group_3_0__1__Impl : ( '{' ) ;
    public final void rule__Petrinet__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:507:1: ( ( '{' ) )
            // InternalPetrinet.g:508:1: ( '{' )
            {
            // InternalPetrinet.g:508:1: ( '{' )
            // InternalPetrinet.g:509:2: '{'
            {
             before(grammarAccess.getPetrinetAccess().getLeftCurlyBracketKeyword_3_0_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPetrinetAccess().getLeftCurlyBracketKeyword_3_0_1()); 

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
    // $ANTLR end "rule__Petrinet__Group_3_0__1__Impl"


    // $ANTLR start "rule__Petrinet__Group_3_0__2"
    // InternalPetrinet.g:518:1: rule__Petrinet__Group_3_0__2 : rule__Petrinet__Group_3_0__2__Impl rule__Petrinet__Group_3_0__3 ;
    public final void rule__Petrinet__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:522:1: ( rule__Petrinet__Group_3_0__2__Impl rule__Petrinet__Group_3_0__3 )
            // InternalPetrinet.g:523:2: rule__Petrinet__Group_3_0__2__Impl rule__Petrinet__Group_3_0__3
            {
            pushFollow(FOLLOW_9);
            rule__Petrinet__Group_3_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Petrinet__Group_3_0__3();

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
    // $ANTLR end "rule__Petrinet__Group_3_0__2"


    // $ANTLR start "rule__Petrinet__Group_3_0__2__Impl"
    // InternalPetrinet.g:530:1: rule__Petrinet__Group_3_0__2__Impl : ( ( rule__Petrinet__PlacesAssignment_3_0_2 )* ) ;
    public final void rule__Petrinet__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:534:1: ( ( ( rule__Petrinet__PlacesAssignment_3_0_2 )* ) )
            // InternalPetrinet.g:535:1: ( ( rule__Petrinet__PlacesAssignment_3_0_2 )* )
            {
            // InternalPetrinet.g:535:1: ( ( rule__Petrinet__PlacesAssignment_3_0_2 )* )
            // InternalPetrinet.g:536:2: ( rule__Petrinet__PlacesAssignment_3_0_2 )*
            {
             before(grammarAccess.getPetrinetAccess().getPlacesAssignment_3_0_2()); 
            // InternalPetrinet.g:537:2: ( rule__Petrinet__PlacesAssignment_3_0_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPetrinet.g:537:3: rule__Petrinet__PlacesAssignment_3_0_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Petrinet__PlacesAssignment_3_0_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getPetrinetAccess().getPlacesAssignment_3_0_2()); 

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
    // $ANTLR end "rule__Petrinet__Group_3_0__2__Impl"


    // $ANTLR start "rule__Petrinet__Group_3_0__3"
    // InternalPetrinet.g:545:1: rule__Petrinet__Group_3_0__3 : rule__Petrinet__Group_3_0__3__Impl ;
    public final void rule__Petrinet__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:549:1: ( rule__Petrinet__Group_3_0__3__Impl )
            // InternalPetrinet.g:550:2: rule__Petrinet__Group_3_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Petrinet__Group_3_0__3__Impl();

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
    // $ANTLR end "rule__Petrinet__Group_3_0__3"


    // $ANTLR start "rule__Petrinet__Group_3_0__3__Impl"
    // InternalPetrinet.g:556:1: rule__Petrinet__Group_3_0__3__Impl : ( '}' ) ;
    public final void rule__Petrinet__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:560:1: ( ( '}' ) )
            // InternalPetrinet.g:561:1: ( '}' )
            {
            // InternalPetrinet.g:561:1: ( '}' )
            // InternalPetrinet.g:562:2: '}'
            {
             before(grammarAccess.getPetrinetAccess().getRightCurlyBracketKeyword_3_0_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPetrinetAccess().getRightCurlyBracketKeyword_3_0_3()); 

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
    // $ANTLR end "rule__Petrinet__Group_3_0__3__Impl"


    // $ANTLR start "rule__Petrinet__Group_3_1__0"
    // InternalPetrinet.g:572:1: rule__Petrinet__Group_3_1__0 : rule__Petrinet__Group_3_1__0__Impl rule__Petrinet__Group_3_1__1 ;
    public final void rule__Petrinet__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:576:1: ( rule__Petrinet__Group_3_1__0__Impl rule__Petrinet__Group_3_1__1 )
            // InternalPetrinet.g:577:2: rule__Petrinet__Group_3_1__0__Impl rule__Petrinet__Group_3_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Petrinet__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Petrinet__Group_3_1__1();

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
    // $ANTLR end "rule__Petrinet__Group_3_1__0"


    // $ANTLR start "rule__Petrinet__Group_3_1__0__Impl"
    // InternalPetrinet.g:584:1: rule__Petrinet__Group_3_1__0__Impl : ( 'transitions' ) ;
    public final void rule__Petrinet__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:588:1: ( ( 'transitions' ) )
            // InternalPetrinet.g:589:1: ( 'transitions' )
            {
            // InternalPetrinet.g:589:1: ( 'transitions' )
            // InternalPetrinet.g:590:2: 'transitions'
            {
             before(grammarAccess.getPetrinetAccess().getTransitionsKeyword_3_1_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPetrinetAccess().getTransitionsKeyword_3_1_0()); 

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
    // $ANTLR end "rule__Petrinet__Group_3_1__0__Impl"


    // $ANTLR start "rule__Petrinet__Group_3_1__1"
    // InternalPetrinet.g:599:1: rule__Petrinet__Group_3_1__1 : rule__Petrinet__Group_3_1__1__Impl rule__Petrinet__Group_3_1__2 ;
    public final void rule__Petrinet__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:603:1: ( rule__Petrinet__Group_3_1__1__Impl rule__Petrinet__Group_3_1__2 )
            // InternalPetrinet.g:604:2: rule__Petrinet__Group_3_1__1__Impl rule__Petrinet__Group_3_1__2
            {
            pushFollow(FOLLOW_11);
            rule__Petrinet__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Petrinet__Group_3_1__2();

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
    // $ANTLR end "rule__Petrinet__Group_3_1__1"


    // $ANTLR start "rule__Petrinet__Group_3_1__1__Impl"
    // InternalPetrinet.g:611:1: rule__Petrinet__Group_3_1__1__Impl : ( '{' ) ;
    public final void rule__Petrinet__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:615:1: ( ( '{' ) )
            // InternalPetrinet.g:616:1: ( '{' )
            {
            // InternalPetrinet.g:616:1: ( '{' )
            // InternalPetrinet.g:617:2: '{'
            {
             before(grammarAccess.getPetrinetAccess().getLeftCurlyBracketKeyword_3_1_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPetrinetAccess().getLeftCurlyBracketKeyword_3_1_1()); 

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
    // $ANTLR end "rule__Petrinet__Group_3_1__1__Impl"


    // $ANTLR start "rule__Petrinet__Group_3_1__2"
    // InternalPetrinet.g:626:1: rule__Petrinet__Group_3_1__2 : rule__Petrinet__Group_3_1__2__Impl rule__Petrinet__Group_3_1__3 ;
    public final void rule__Petrinet__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:630:1: ( rule__Petrinet__Group_3_1__2__Impl rule__Petrinet__Group_3_1__3 )
            // InternalPetrinet.g:631:2: rule__Petrinet__Group_3_1__2__Impl rule__Petrinet__Group_3_1__3
            {
            pushFollow(FOLLOW_11);
            rule__Petrinet__Group_3_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Petrinet__Group_3_1__3();

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
    // $ANTLR end "rule__Petrinet__Group_3_1__2"


    // $ANTLR start "rule__Petrinet__Group_3_1__2__Impl"
    // InternalPetrinet.g:638:1: rule__Petrinet__Group_3_1__2__Impl : ( ( rule__Petrinet__TransitionsAssignment_3_1_2 )* ) ;
    public final void rule__Petrinet__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:642:1: ( ( ( rule__Petrinet__TransitionsAssignment_3_1_2 )* ) )
            // InternalPetrinet.g:643:1: ( ( rule__Petrinet__TransitionsAssignment_3_1_2 )* )
            {
            // InternalPetrinet.g:643:1: ( ( rule__Petrinet__TransitionsAssignment_3_1_2 )* )
            // InternalPetrinet.g:644:2: ( rule__Petrinet__TransitionsAssignment_3_1_2 )*
            {
             before(grammarAccess.getPetrinetAccess().getTransitionsAssignment_3_1_2()); 
            // InternalPetrinet.g:645:2: ( rule__Petrinet__TransitionsAssignment_3_1_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPetrinet.g:645:3: rule__Petrinet__TransitionsAssignment_3_1_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Petrinet__TransitionsAssignment_3_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getPetrinetAccess().getTransitionsAssignment_3_1_2()); 

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
    // $ANTLR end "rule__Petrinet__Group_3_1__2__Impl"


    // $ANTLR start "rule__Petrinet__Group_3_1__3"
    // InternalPetrinet.g:653:1: rule__Petrinet__Group_3_1__3 : rule__Petrinet__Group_3_1__3__Impl ;
    public final void rule__Petrinet__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:657:1: ( rule__Petrinet__Group_3_1__3__Impl )
            // InternalPetrinet.g:658:2: rule__Petrinet__Group_3_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Petrinet__Group_3_1__3__Impl();

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
    // $ANTLR end "rule__Petrinet__Group_3_1__3"


    // $ANTLR start "rule__Petrinet__Group_3_1__3__Impl"
    // InternalPetrinet.g:664:1: rule__Petrinet__Group_3_1__3__Impl : ( '}' ) ;
    public final void rule__Petrinet__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:668:1: ( ( '}' ) )
            // InternalPetrinet.g:669:1: ( '}' )
            {
            // InternalPetrinet.g:669:1: ( '}' )
            // InternalPetrinet.g:670:2: '}'
            {
             before(grammarAccess.getPetrinetAccess().getRightCurlyBracketKeyword_3_1_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPetrinetAccess().getRightCurlyBracketKeyword_3_1_3()); 

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
    // $ANTLR end "rule__Petrinet__Group_3_1__3__Impl"


    // $ANTLR start "rule__Petrinet__Group_3_2__0"
    // InternalPetrinet.g:680:1: rule__Petrinet__Group_3_2__0 : rule__Petrinet__Group_3_2__0__Impl rule__Petrinet__Group_3_2__1 ;
    public final void rule__Petrinet__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:684:1: ( rule__Petrinet__Group_3_2__0__Impl rule__Petrinet__Group_3_2__1 )
            // InternalPetrinet.g:685:2: rule__Petrinet__Group_3_2__0__Impl rule__Petrinet__Group_3_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Petrinet__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Petrinet__Group_3_2__1();

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
    // $ANTLR end "rule__Petrinet__Group_3_2__0"


    // $ANTLR start "rule__Petrinet__Group_3_2__0__Impl"
    // InternalPetrinet.g:692:1: rule__Petrinet__Group_3_2__0__Impl : ( 'arcs' ) ;
    public final void rule__Petrinet__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:696:1: ( ( 'arcs' ) )
            // InternalPetrinet.g:697:1: ( 'arcs' )
            {
            // InternalPetrinet.g:697:1: ( 'arcs' )
            // InternalPetrinet.g:698:2: 'arcs'
            {
             before(grammarAccess.getPetrinetAccess().getArcsKeyword_3_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPetrinetAccess().getArcsKeyword_3_2_0()); 

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
    // $ANTLR end "rule__Petrinet__Group_3_2__0__Impl"


    // $ANTLR start "rule__Petrinet__Group_3_2__1"
    // InternalPetrinet.g:707:1: rule__Petrinet__Group_3_2__1 : rule__Petrinet__Group_3_2__1__Impl rule__Petrinet__Group_3_2__2 ;
    public final void rule__Petrinet__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:711:1: ( rule__Petrinet__Group_3_2__1__Impl rule__Petrinet__Group_3_2__2 )
            // InternalPetrinet.g:712:2: rule__Petrinet__Group_3_2__1__Impl rule__Petrinet__Group_3_2__2
            {
            pushFollow(FOLLOW_13);
            rule__Petrinet__Group_3_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Petrinet__Group_3_2__2();

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
    // $ANTLR end "rule__Petrinet__Group_3_2__1"


    // $ANTLR start "rule__Petrinet__Group_3_2__1__Impl"
    // InternalPetrinet.g:719:1: rule__Petrinet__Group_3_2__1__Impl : ( '{' ) ;
    public final void rule__Petrinet__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:723:1: ( ( '{' ) )
            // InternalPetrinet.g:724:1: ( '{' )
            {
            // InternalPetrinet.g:724:1: ( '{' )
            // InternalPetrinet.g:725:2: '{'
            {
             before(grammarAccess.getPetrinetAccess().getLeftCurlyBracketKeyword_3_2_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPetrinetAccess().getLeftCurlyBracketKeyword_3_2_1()); 

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
    // $ANTLR end "rule__Petrinet__Group_3_2__1__Impl"


    // $ANTLR start "rule__Petrinet__Group_3_2__2"
    // InternalPetrinet.g:734:1: rule__Petrinet__Group_3_2__2 : rule__Petrinet__Group_3_2__2__Impl rule__Petrinet__Group_3_2__3 ;
    public final void rule__Petrinet__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:738:1: ( rule__Petrinet__Group_3_2__2__Impl rule__Petrinet__Group_3_2__3 )
            // InternalPetrinet.g:739:2: rule__Petrinet__Group_3_2__2__Impl rule__Petrinet__Group_3_2__3
            {
            pushFollow(FOLLOW_13);
            rule__Petrinet__Group_3_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Petrinet__Group_3_2__3();

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
    // $ANTLR end "rule__Petrinet__Group_3_2__2"


    // $ANTLR start "rule__Petrinet__Group_3_2__2__Impl"
    // InternalPetrinet.g:746:1: rule__Petrinet__Group_3_2__2__Impl : ( ( rule__Petrinet__ArcsAssignment_3_2_2 )* ) ;
    public final void rule__Petrinet__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:750:1: ( ( ( rule__Petrinet__ArcsAssignment_3_2_2 )* ) )
            // InternalPetrinet.g:751:1: ( ( rule__Petrinet__ArcsAssignment_3_2_2 )* )
            {
            // InternalPetrinet.g:751:1: ( ( rule__Petrinet__ArcsAssignment_3_2_2 )* )
            // InternalPetrinet.g:752:2: ( rule__Petrinet__ArcsAssignment_3_2_2 )*
            {
             before(grammarAccess.getPetrinetAccess().getArcsAssignment_3_2_2()); 
            // InternalPetrinet.g:753:2: ( rule__Petrinet__ArcsAssignment_3_2_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==23||LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPetrinet.g:753:3: rule__Petrinet__ArcsAssignment_3_2_2
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Petrinet__ArcsAssignment_3_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getPetrinetAccess().getArcsAssignment_3_2_2()); 

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
    // $ANTLR end "rule__Petrinet__Group_3_2__2__Impl"


    // $ANTLR start "rule__Petrinet__Group_3_2__3"
    // InternalPetrinet.g:761:1: rule__Petrinet__Group_3_2__3 : rule__Petrinet__Group_3_2__3__Impl ;
    public final void rule__Petrinet__Group_3_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:765:1: ( rule__Petrinet__Group_3_2__3__Impl )
            // InternalPetrinet.g:766:2: rule__Petrinet__Group_3_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Petrinet__Group_3_2__3__Impl();

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
    // $ANTLR end "rule__Petrinet__Group_3_2__3"


    // $ANTLR start "rule__Petrinet__Group_3_2__3__Impl"
    // InternalPetrinet.g:772:1: rule__Petrinet__Group_3_2__3__Impl : ( '}' ) ;
    public final void rule__Petrinet__Group_3_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:776:1: ( ( '}' ) )
            // InternalPetrinet.g:777:1: ( '}' )
            {
            // InternalPetrinet.g:777:1: ( '}' )
            // InternalPetrinet.g:778:2: '}'
            {
             before(grammarAccess.getPetrinetAccess().getRightCurlyBracketKeyword_3_2_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPetrinetAccess().getRightCurlyBracketKeyword_3_2_3()); 

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
    // $ANTLR end "rule__Petrinet__Group_3_2__3__Impl"


    // $ANTLR start "rule__Place__Group__0"
    // InternalPetrinet.g:788:1: rule__Place__Group__0 : rule__Place__Group__0__Impl rule__Place__Group__1 ;
    public final void rule__Place__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:792:1: ( rule__Place__Group__0__Impl rule__Place__Group__1 )
            // InternalPetrinet.g:793:2: rule__Place__Group__0__Impl rule__Place__Group__1
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
    // InternalPetrinet.g:800:1: rule__Place__Group__0__Impl : ( 'place' ) ;
    public final void rule__Place__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:804:1: ( ( 'place' ) )
            // InternalPetrinet.g:805:1: ( 'place' )
            {
            // InternalPetrinet.g:805:1: ( 'place' )
            // InternalPetrinet.g:806:2: 'place'
            {
             before(grammarAccess.getPlaceAccess().getPlaceKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalPetrinet.g:815:1: rule__Place__Group__1 : rule__Place__Group__1__Impl rule__Place__Group__2 ;
    public final void rule__Place__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:819:1: ( rule__Place__Group__1__Impl rule__Place__Group__2 )
            // InternalPetrinet.g:820:2: rule__Place__Group__1__Impl rule__Place__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalPetrinet.g:827:1: rule__Place__Group__1__Impl : ( ( rule__Place__NameAssignment_1 ) ) ;
    public final void rule__Place__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:831:1: ( ( ( rule__Place__NameAssignment_1 ) ) )
            // InternalPetrinet.g:832:1: ( ( rule__Place__NameAssignment_1 ) )
            {
            // InternalPetrinet.g:832:1: ( ( rule__Place__NameAssignment_1 ) )
            // InternalPetrinet.g:833:2: ( rule__Place__NameAssignment_1 )
            {
             before(grammarAccess.getPlaceAccess().getNameAssignment_1()); 
            // InternalPetrinet.g:834:2: ( rule__Place__NameAssignment_1 )
            // InternalPetrinet.g:834:3: rule__Place__NameAssignment_1
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
    // InternalPetrinet.g:842:1: rule__Place__Group__2 : rule__Place__Group__2__Impl rule__Place__Group__3 ;
    public final void rule__Place__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:846:1: ( rule__Place__Group__2__Impl rule__Place__Group__3 )
            // InternalPetrinet.g:847:2: rule__Place__Group__2__Impl rule__Place__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalPetrinet.g:854:1: rule__Place__Group__2__Impl : ( '{' ) ;
    public final void rule__Place__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:858:1: ( ( '{' ) )
            // InternalPetrinet.g:859:1: ( '{' )
            {
            // InternalPetrinet.g:859:1: ( '{' )
            // InternalPetrinet.g:860:2: '{'
            {
             before(grammarAccess.getPlaceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getLeftCurlyBracketKeyword_2()); 

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
    // InternalPetrinet.g:869:1: rule__Place__Group__3 : rule__Place__Group__3__Impl rule__Place__Group__4 ;
    public final void rule__Place__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:873:1: ( rule__Place__Group__3__Impl rule__Place__Group__4 )
            // InternalPetrinet.g:874:2: rule__Place__Group__3__Impl rule__Place__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalPetrinet.g:881:1: rule__Place__Group__3__Impl : ( ( rule__Place__Group_3__0 ) ) ;
    public final void rule__Place__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:885:1: ( ( ( rule__Place__Group_3__0 ) ) )
            // InternalPetrinet.g:886:1: ( ( rule__Place__Group_3__0 ) )
            {
            // InternalPetrinet.g:886:1: ( ( rule__Place__Group_3__0 ) )
            // InternalPetrinet.g:887:2: ( rule__Place__Group_3__0 )
            {
             before(grammarAccess.getPlaceAccess().getGroup_3()); 
            // InternalPetrinet.g:888:2: ( rule__Place__Group_3__0 )
            // InternalPetrinet.g:888:3: rule__Place__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__Place__Group_3__0();

            state._fsp--;


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
    // InternalPetrinet.g:896:1: rule__Place__Group__4 : rule__Place__Group__4__Impl ;
    public final void rule__Place__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:900:1: ( rule__Place__Group__4__Impl )
            // InternalPetrinet.g:901:2: rule__Place__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Place__Group__4__Impl();

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
    // InternalPetrinet.g:907:1: rule__Place__Group__4__Impl : ( '}' ) ;
    public final void rule__Place__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:911:1: ( ( '}' ) )
            // InternalPetrinet.g:912:1: ( '}' )
            {
            // InternalPetrinet.g:912:1: ( '}' )
            // InternalPetrinet.g:913:2: '}'
            {
             before(grammarAccess.getPlaceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getRightCurlyBracketKeyword_4()); 

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


    // $ANTLR start "rule__Place__Group_3__0"
    // InternalPetrinet.g:923:1: rule__Place__Group_3__0 : rule__Place__Group_3__0__Impl rule__Place__Group_3__1 ;
    public final void rule__Place__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:927:1: ( rule__Place__Group_3__0__Impl rule__Place__Group_3__1 )
            // InternalPetrinet.g:928:2: rule__Place__Group_3__0__Impl rule__Place__Group_3__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalPetrinet.g:935:1: rule__Place__Group_3__0__Impl : ( ( rule__Place__Group_3_0__0 ) ) ;
    public final void rule__Place__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:939:1: ( ( ( rule__Place__Group_3_0__0 ) ) )
            // InternalPetrinet.g:940:1: ( ( rule__Place__Group_3_0__0 ) )
            {
            // InternalPetrinet.g:940:1: ( ( rule__Place__Group_3_0__0 ) )
            // InternalPetrinet.g:941:2: ( rule__Place__Group_3_0__0 )
            {
             before(grammarAccess.getPlaceAccess().getGroup_3_0()); 
            // InternalPetrinet.g:942:2: ( rule__Place__Group_3_0__0 )
            // InternalPetrinet.g:942:3: rule__Place__Group_3_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Place__Group_3_0__0();

            state._fsp--;


            }

             after(grammarAccess.getPlaceAccess().getGroup_3_0()); 

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
    // InternalPetrinet.g:950:1: rule__Place__Group_3__1 : rule__Place__Group_3__1__Impl rule__Place__Group_3__2 ;
    public final void rule__Place__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:954:1: ( rule__Place__Group_3__1__Impl rule__Place__Group_3__2 )
            // InternalPetrinet.g:955:2: rule__Place__Group_3__1__Impl rule__Place__Group_3__2
            {
            pushFollow(FOLLOW_17);
            rule__Place__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group_3__2();

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
    // InternalPetrinet.g:962:1: rule__Place__Group_3__1__Impl : ( ( rule__Place__Group_3_1__0 ) ) ;
    public final void rule__Place__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:966:1: ( ( ( rule__Place__Group_3_1__0 ) ) )
            // InternalPetrinet.g:967:1: ( ( rule__Place__Group_3_1__0 ) )
            {
            // InternalPetrinet.g:967:1: ( ( rule__Place__Group_3_1__0 ) )
            // InternalPetrinet.g:968:2: ( rule__Place__Group_3_1__0 )
            {
             before(grammarAccess.getPlaceAccess().getGroup_3_1()); 
            // InternalPetrinet.g:969:2: ( rule__Place__Group_3_1__0 )
            // InternalPetrinet.g:969:3: rule__Place__Group_3_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Place__Group_3_1__0();

            state._fsp--;


            }

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


    // $ANTLR start "rule__Place__Group_3__2"
    // InternalPetrinet.g:977:1: rule__Place__Group_3__2 : rule__Place__Group_3__2__Impl ;
    public final void rule__Place__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:981:1: ( rule__Place__Group_3__2__Impl )
            // InternalPetrinet.g:982:2: rule__Place__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Place__Group_3__2__Impl();

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
    // $ANTLR end "rule__Place__Group_3__2"


    // $ANTLR start "rule__Place__Group_3__2__Impl"
    // InternalPetrinet.g:988:1: rule__Place__Group_3__2__Impl : ( ( rule__Place__Group_3_2__0 ) ) ;
    public final void rule__Place__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:992:1: ( ( ( rule__Place__Group_3_2__0 ) ) )
            // InternalPetrinet.g:993:1: ( ( rule__Place__Group_3_2__0 ) )
            {
            // InternalPetrinet.g:993:1: ( ( rule__Place__Group_3_2__0 ) )
            // InternalPetrinet.g:994:2: ( rule__Place__Group_3_2__0 )
            {
             before(grammarAccess.getPlaceAccess().getGroup_3_2()); 
            // InternalPetrinet.g:995:2: ( rule__Place__Group_3_2__0 )
            // InternalPetrinet.g:995:3: rule__Place__Group_3_2__0
            {
            pushFollow(FOLLOW_2);
            rule__Place__Group_3_2__0();

            state._fsp--;


            }

             after(grammarAccess.getPlaceAccess().getGroup_3_2()); 

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
    // $ANTLR end "rule__Place__Group_3__2__Impl"


    // $ANTLR start "rule__Place__Group_3_0__0"
    // InternalPetrinet.g:1004:1: rule__Place__Group_3_0__0 : rule__Place__Group_3_0__0__Impl rule__Place__Group_3_0__1 ;
    public final void rule__Place__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1008:1: ( rule__Place__Group_3_0__0__Impl rule__Place__Group_3_0__1 )
            // InternalPetrinet.g:1009:2: rule__Place__Group_3_0__0__Impl rule__Place__Group_3_0__1
            {
            pushFollow(FOLLOW_4);
            rule__Place__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group_3_0__1();

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
    // $ANTLR end "rule__Place__Group_3_0__0"


    // $ANTLR start "rule__Place__Group_3_0__0__Impl"
    // InternalPetrinet.g:1016:1: rule__Place__Group_3_0__0__Impl : ( 'tokens' ) ;
    public final void rule__Place__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1020:1: ( ( 'tokens' ) )
            // InternalPetrinet.g:1021:1: ( 'tokens' )
            {
            // InternalPetrinet.g:1021:1: ( 'tokens' )
            // InternalPetrinet.g:1022:2: 'tokens'
            {
             before(grammarAccess.getPlaceAccess().getTokensKeyword_3_0_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getTokensKeyword_3_0_0()); 

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
    // $ANTLR end "rule__Place__Group_3_0__0__Impl"


    // $ANTLR start "rule__Place__Group_3_0__1"
    // InternalPetrinet.g:1031:1: rule__Place__Group_3_0__1 : rule__Place__Group_3_0__1__Impl rule__Place__Group_3_0__2 ;
    public final void rule__Place__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1035:1: ( rule__Place__Group_3_0__1__Impl rule__Place__Group_3_0__2 )
            // InternalPetrinet.g:1036:2: rule__Place__Group_3_0__1__Impl rule__Place__Group_3_0__2
            {
            pushFollow(FOLLOW_18);
            rule__Place__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group_3_0__2();

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
    // $ANTLR end "rule__Place__Group_3_0__1"


    // $ANTLR start "rule__Place__Group_3_0__1__Impl"
    // InternalPetrinet.g:1043:1: rule__Place__Group_3_0__1__Impl : ( '{' ) ;
    public final void rule__Place__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1047:1: ( ( '{' ) )
            // InternalPetrinet.g:1048:1: ( '{' )
            {
            // InternalPetrinet.g:1048:1: ( '{' )
            // InternalPetrinet.g:1049:2: '{'
            {
             before(grammarAccess.getPlaceAccess().getLeftCurlyBracketKeyword_3_0_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getLeftCurlyBracketKeyword_3_0_1()); 

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
    // $ANTLR end "rule__Place__Group_3_0__1__Impl"


    // $ANTLR start "rule__Place__Group_3_0__2"
    // InternalPetrinet.g:1058:1: rule__Place__Group_3_0__2 : rule__Place__Group_3_0__2__Impl rule__Place__Group_3_0__3 ;
    public final void rule__Place__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1062:1: ( rule__Place__Group_3_0__2__Impl rule__Place__Group_3_0__3 )
            // InternalPetrinet.g:1063:2: rule__Place__Group_3_0__2__Impl rule__Place__Group_3_0__3
            {
            pushFollow(FOLLOW_18);
            rule__Place__Group_3_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group_3_0__3();

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
    // $ANTLR end "rule__Place__Group_3_0__2"


    // $ANTLR start "rule__Place__Group_3_0__2__Impl"
    // InternalPetrinet.g:1070:1: rule__Place__Group_3_0__2__Impl : ( ( rule__Place__TokensAssignment_3_0_2 )* ) ;
    public final void rule__Place__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1074:1: ( ( ( rule__Place__TokensAssignment_3_0_2 )* ) )
            // InternalPetrinet.g:1075:1: ( ( rule__Place__TokensAssignment_3_0_2 )* )
            {
            // InternalPetrinet.g:1075:1: ( ( rule__Place__TokensAssignment_3_0_2 )* )
            // InternalPetrinet.g:1076:2: ( rule__Place__TokensAssignment_3_0_2 )*
            {
             before(grammarAccess.getPlaceAccess().getTokensAssignment_3_0_2()); 
            // InternalPetrinet.g:1077:2: ( rule__Place__TokensAssignment_3_0_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPetrinet.g:1077:3: rule__Place__TokensAssignment_3_0_2
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Place__TokensAssignment_3_0_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getPlaceAccess().getTokensAssignment_3_0_2()); 

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
    // $ANTLR end "rule__Place__Group_3_0__2__Impl"


    // $ANTLR start "rule__Place__Group_3_0__3"
    // InternalPetrinet.g:1085:1: rule__Place__Group_3_0__3 : rule__Place__Group_3_0__3__Impl ;
    public final void rule__Place__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1089:1: ( rule__Place__Group_3_0__3__Impl )
            // InternalPetrinet.g:1090:2: rule__Place__Group_3_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Place__Group_3_0__3__Impl();

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
    // $ANTLR end "rule__Place__Group_3_0__3"


    // $ANTLR start "rule__Place__Group_3_0__3__Impl"
    // InternalPetrinet.g:1096:1: rule__Place__Group_3_0__3__Impl : ( '}' ) ;
    public final void rule__Place__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1100:1: ( ( '}' ) )
            // InternalPetrinet.g:1101:1: ( '}' )
            {
            // InternalPetrinet.g:1101:1: ( '}' )
            // InternalPetrinet.g:1102:2: '}'
            {
             before(grammarAccess.getPlaceAccess().getRightCurlyBracketKeyword_3_0_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getRightCurlyBracketKeyword_3_0_3()); 

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
    // $ANTLR end "rule__Place__Group_3_0__3__Impl"


    // $ANTLR start "rule__Place__Group_3_1__0"
    // InternalPetrinet.g:1112:1: rule__Place__Group_3_1__0 : rule__Place__Group_3_1__0__Impl rule__Place__Group_3_1__1 ;
    public final void rule__Place__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1116:1: ( rule__Place__Group_3_1__0__Impl rule__Place__Group_3_1__1 )
            // InternalPetrinet.g:1117:2: rule__Place__Group_3_1__0__Impl rule__Place__Group_3_1__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalPetrinet.g:1124:1: rule__Place__Group_3_1__0__Impl : ( 'out' ) ;
    public final void rule__Place__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1128:1: ( ( 'out' ) )
            // InternalPetrinet.g:1129:1: ( 'out' )
            {
            // InternalPetrinet.g:1129:1: ( 'out' )
            // InternalPetrinet.g:1130:2: 'out'
            {
             before(grammarAccess.getPlaceAccess().getOutKeyword_3_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getOutKeyword_3_1_0()); 

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
    // InternalPetrinet.g:1139:1: rule__Place__Group_3_1__1 : rule__Place__Group_3_1__1__Impl rule__Place__Group_3_1__2 ;
    public final void rule__Place__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1143:1: ( rule__Place__Group_3_1__1__Impl rule__Place__Group_3_1__2 )
            // InternalPetrinet.g:1144:2: rule__Place__Group_3_1__1__Impl rule__Place__Group_3_1__2
            {
            pushFollow(FOLLOW_20);
            rule__Place__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group_3_1__2();

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
    // InternalPetrinet.g:1151:1: rule__Place__Group_3_1__1__Impl : ( '{' ) ;
    public final void rule__Place__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1155:1: ( ( '{' ) )
            // InternalPetrinet.g:1156:1: ( '{' )
            {
            // InternalPetrinet.g:1156:1: ( '{' )
            // InternalPetrinet.g:1157:2: '{'
            {
             before(grammarAccess.getPlaceAccess().getLeftCurlyBracketKeyword_3_1_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getLeftCurlyBracketKeyword_3_1_1()); 

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


    // $ANTLR start "rule__Place__Group_3_1__2"
    // InternalPetrinet.g:1166:1: rule__Place__Group_3_1__2 : rule__Place__Group_3_1__2__Impl rule__Place__Group_3_1__3 ;
    public final void rule__Place__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1170:1: ( rule__Place__Group_3_1__2__Impl rule__Place__Group_3_1__3 )
            // InternalPetrinet.g:1171:2: rule__Place__Group_3_1__2__Impl rule__Place__Group_3_1__3
            {
            pushFollow(FOLLOW_20);
            rule__Place__Group_3_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group_3_1__3();

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
    // $ANTLR end "rule__Place__Group_3_1__2"


    // $ANTLR start "rule__Place__Group_3_1__2__Impl"
    // InternalPetrinet.g:1178:1: rule__Place__Group_3_1__2__Impl : ( ( rule__Place__OutAssignment_3_1_2 )* ) ;
    public final void rule__Place__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1182:1: ( ( ( rule__Place__OutAssignment_3_1_2 )* ) )
            // InternalPetrinet.g:1183:1: ( ( rule__Place__OutAssignment_3_1_2 )* )
            {
            // InternalPetrinet.g:1183:1: ( ( rule__Place__OutAssignment_3_1_2 )* )
            // InternalPetrinet.g:1184:2: ( rule__Place__OutAssignment_3_1_2 )*
            {
             before(grammarAccess.getPlaceAccess().getOutAssignment_3_1_2()); 
            // InternalPetrinet.g:1185:2: ( rule__Place__OutAssignment_3_1_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPetrinet.g:1185:3: rule__Place__OutAssignment_3_1_2
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Place__OutAssignment_3_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getPlaceAccess().getOutAssignment_3_1_2()); 

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
    // $ANTLR end "rule__Place__Group_3_1__2__Impl"


    // $ANTLR start "rule__Place__Group_3_1__3"
    // InternalPetrinet.g:1193:1: rule__Place__Group_3_1__3 : rule__Place__Group_3_1__3__Impl ;
    public final void rule__Place__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1197:1: ( rule__Place__Group_3_1__3__Impl )
            // InternalPetrinet.g:1198:2: rule__Place__Group_3_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Place__Group_3_1__3__Impl();

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
    // $ANTLR end "rule__Place__Group_3_1__3"


    // $ANTLR start "rule__Place__Group_3_1__3__Impl"
    // InternalPetrinet.g:1204:1: rule__Place__Group_3_1__3__Impl : ( '}' ) ;
    public final void rule__Place__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1208:1: ( ( '}' ) )
            // InternalPetrinet.g:1209:1: ( '}' )
            {
            // InternalPetrinet.g:1209:1: ( '}' )
            // InternalPetrinet.g:1210:2: '}'
            {
             before(grammarAccess.getPlaceAccess().getRightCurlyBracketKeyword_3_1_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getRightCurlyBracketKeyword_3_1_3()); 

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
    // $ANTLR end "rule__Place__Group_3_1__3__Impl"


    // $ANTLR start "rule__Place__Group_3_2__0"
    // InternalPetrinet.g:1220:1: rule__Place__Group_3_2__0 : rule__Place__Group_3_2__0__Impl rule__Place__Group_3_2__1 ;
    public final void rule__Place__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1224:1: ( rule__Place__Group_3_2__0__Impl rule__Place__Group_3_2__1 )
            // InternalPetrinet.g:1225:2: rule__Place__Group_3_2__0__Impl rule__Place__Group_3_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Place__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group_3_2__1();

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
    // $ANTLR end "rule__Place__Group_3_2__0"


    // $ANTLR start "rule__Place__Group_3_2__0__Impl"
    // InternalPetrinet.g:1232:1: rule__Place__Group_3_2__0__Impl : ( 'in' ) ;
    public final void rule__Place__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1236:1: ( ( 'in' ) )
            // InternalPetrinet.g:1237:1: ( 'in' )
            {
            // InternalPetrinet.g:1237:1: ( 'in' )
            // InternalPetrinet.g:1238:2: 'in'
            {
             before(grammarAccess.getPlaceAccess().getInKeyword_3_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getInKeyword_3_2_0()); 

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
    // $ANTLR end "rule__Place__Group_3_2__0__Impl"


    // $ANTLR start "rule__Place__Group_3_2__1"
    // InternalPetrinet.g:1247:1: rule__Place__Group_3_2__1 : rule__Place__Group_3_2__1__Impl rule__Place__Group_3_2__2 ;
    public final void rule__Place__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1251:1: ( rule__Place__Group_3_2__1__Impl rule__Place__Group_3_2__2 )
            // InternalPetrinet.g:1252:2: rule__Place__Group_3_2__1__Impl rule__Place__Group_3_2__2
            {
            pushFollow(FOLLOW_20);
            rule__Place__Group_3_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group_3_2__2();

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
    // $ANTLR end "rule__Place__Group_3_2__1"


    // $ANTLR start "rule__Place__Group_3_2__1__Impl"
    // InternalPetrinet.g:1259:1: rule__Place__Group_3_2__1__Impl : ( '{' ) ;
    public final void rule__Place__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1263:1: ( ( '{' ) )
            // InternalPetrinet.g:1264:1: ( '{' )
            {
            // InternalPetrinet.g:1264:1: ( '{' )
            // InternalPetrinet.g:1265:2: '{'
            {
             before(grammarAccess.getPlaceAccess().getLeftCurlyBracketKeyword_3_2_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getLeftCurlyBracketKeyword_3_2_1()); 

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
    // $ANTLR end "rule__Place__Group_3_2__1__Impl"


    // $ANTLR start "rule__Place__Group_3_2__2"
    // InternalPetrinet.g:1274:1: rule__Place__Group_3_2__2 : rule__Place__Group_3_2__2__Impl rule__Place__Group_3_2__3 ;
    public final void rule__Place__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1278:1: ( rule__Place__Group_3_2__2__Impl rule__Place__Group_3_2__3 )
            // InternalPetrinet.g:1279:2: rule__Place__Group_3_2__2__Impl rule__Place__Group_3_2__3
            {
            pushFollow(FOLLOW_20);
            rule__Place__Group_3_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group_3_2__3();

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
    // $ANTLR end "rule__Place__Group_3_2__2"


    // $ANTLR start "rule__Place__Group_3_2__2__Impl"
    // InternalPetrinet.g:1286:1: rule__Place__Group_3_2__2__Impl : ( ( rule__Place__InAssignment_3_2_2 )* ) ;
    public final void rule__Place__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1290:1: ( ( ( rule__Place__InAssignment_3_2_2 )* ) )
            // InternalPetrinet.g:1291:1: ( ( rule__Place__InAssignment_3_2_2 )* )
            {
            // InternalPetrinet.g:1291:1: ( ( rule__Place__InAssignment_3_2_2 )* )
            // InternalPetrinet.g:1292:2: ( rule__Place__InAssignment_3_2_2 )*
            {
             before(grammarAccess.getPlaceAccess().getInAssignment_3_2_2()); 
            // InternalPetrinet.g:1293:2: ( rule__Place__InAssignment_3_2_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPetrinet.g:1293:3: rule__Place__InAssignment_3_2_2
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Place__InAssignment_3_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPlaceAccess().getInAssignment_3_2_2()); 

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
    // $ANTLR end "rule__Place__Group_3_2__2__Impl"


    // $ANTLR start "rule__Place__Group_3_2__3"
    // InternalPetrinet.g:1301:1: rule__Place__Group_3_2__3 : rule__Place__Group_3_2__3__Impl ;
    public final void rule__Place__Group_3_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1305:1: ( rule__Place__Group_3_2__3__Impl )
            // InternalPetrinet.g:1306:2: rule__Place__Group_3_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Place__Group_3_2__3__Impl();

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
    // $ANTLR end "rule__Place__Group_3_2__3"


    // $ANTLR start "rule__Place__Group_3_2__3__Impl"
    // InternalPetrinet.g:1312:1: rule__Place__Group_3_2__3__Impl : ( '}' ) ;
    public final void rule__Place__Group_3_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1316:1: ( ( '}' ) )
            // InternalPetrinet.g:1317:1: ( '}' )
            {
            // InternalPetrinet.g:1317:1: ( '}' )
            // InternalPetrinet.g:1318:2: '}'
            {
             before(grammarAccess.getPlaceAccess().getRightCurlyBracketKeyword_3_2_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getRightCurlyBracketKeyword_3_2_3()); 

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
    // $ANTLR end "rule__Place__Group_3_2__3__Impl"


    // $ANTLR start "rule__Token__Group__0"
    // InternalPetrinet.g:1328:1: rule__Token__Group__0 : rule__Token__Group__0__Impl rule__Token__Group__1 ;
    public final void rule__Token__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1332:1: ( rule__Token__Group__0__Impl rule__Token__Group__1 )
            // InternalPetrinet.g:1333:2: rule__Token__Group__0__Impl rule__Token__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalPetrinet.g:1340:1: rule__Token__Group__0__Impl : ( () ) ;
    public final void rule__Token__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1344:1: ( ( () ) )
            // InternalPetrinet.g:1345:1: ( () )
            {
            // InternalPetrinet.g:1345:1: ( () )
            // InternalPetrinet.g:1346:2: ()
            {
             before(grammarAccess.getTokenAccess().getTokenAction_0()); 
            // InternalPetrinet.g:1347:2: ()
            // InternalPetrinet.g:1347:3: 
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
    // InternalPetrinet.g:1355:1: rule__Token__Group__1 : rule__Token__Group__1__Impl ;
    public final void rule__Token__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1359:1: ( rule__Token__Group__1__Impl )
            // InternalPetrinet.g:1360:2: rule__Token__Group__1__Impl
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
    // InternalPetrinet.g:1366:1: rule__Token__Group__1__Impl : ( 'token' ) ;
    public final void rule__Token__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1370:1: ( ( 'token' ) )
            // InternalPetrinet.g:1371:1: ( 'token' )
            {
            // InternalPetrinet.g:1371:1: ( 'token' )
            // InternalPetrinet.g:1372:2: 'token'
            {
             before(grammarAccess.getTokenAccess().getTokenKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalPetrinet.g:1382:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1386:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalPetrinet.g:1387:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
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
    // InternalPetrinet.g:1394:1: rule__Transition__Group__0__Impl : ( 'transition' ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1398:1: ( ( 'transition' ) )
            // InternalPetrinet.g:1399:1: ( 'transition' )
            {
            // InternalPetrinet.g:1399:1: ( 'transition' )
            // InternalPetrinet.g:1400:2: 'transition'
            {
             before(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalPetrinet.g:1409:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1413:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalPetrinet.g:1414:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalPetrinet.g:1421:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__NameAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1425:1: ( ( ( rule__Transition__NameAssignment_1 ) ) )
            // InternalPetrinet.g:1426:1: ( ( rule__Transition__NameAssignment_1 ) )
            {
            // InternalPetrinet.g:1426:1: ( ( rule__Transition__NameAssignment_1 ) )
            // InternalPetrinet.g:1427:2: ( rule__Transition__NameAssignment_1 )
            {
             before(grammarAccess.getTransitionAccess().getNameAssignment_1()); 
            // InternalPetrinet.g:1428:2: ( rule__Transition__NameAssignment_1 )
            // InternalPetrinet.g:1428:3: rule__Transition__NameAssignment_1
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
    // InternalPetrinet.g:1436:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1440:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalPetrinet.g:1441:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalPetrinet.g:1448:1: rule__Transition__Group__2__Impl : ( '{' ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1452:1: ( ( '{' ) )
            // InternalPetrinet.g:1453:1: ( '{' )
            {
            // InternalPetrinet.g:1453:1: ( '{' )
            // InternalPetrinet.g:1454:2: '{'
            {
             before(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_2()); 

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
    // InternalPetrinet.g:1463:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1467:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalPetrinet.g:1468:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalPetrinet.g:1475:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__Group_3__0 ) ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1479:1: ( ( ( rule__Transition__Group_3__0 ) ) )
            // InternalPetrinet.g:1480:1: ( ( rule__Transition__Group_3__0 ) )
            {
            // InternalPetrinet.g:1480:1: ( ( rule__Transition__Group_3__0 ) )
            // InternalPetrinet.g:1481:2: ( rule__Transition__Group_3__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup_3()); 
            // InternalPetrinet.g:1482:2: ( rule__Transition__Group_3__0 )
            // InternalPetrinet.g:1482:3: rule__Transition__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup_3()); 

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
    // InternalPetrinet.g:1490:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1494:1: ( rule__Transition__Group__4__Impl )
            // InternalPetrinet.g:1495:2: rule__Transition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__4__Impl();

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
    // InternalPetrinet.g:1501:1: rule__Transition__Group__4__Impl : ( '}' ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1505:1: ( ( '}' ) )
            // InternalPetrinet.g:1506:1: ( '}' )
            {
            // InternalPetrinet.g:1506:1: ( '}' )
            // InternalPetrinet.g:1507:2: '}'
            {
             before(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_4()); 

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


    // $ANTLR start "rule__Transition__Group_3__0"
    // InternalPetrinet.g:1517:1: rule__Transition__Group_3__0 : rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1 ;
    public final void rule__Transition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1521:1: ( rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1 )
            // InternalPetrinet.g:1522:2: rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1
            {
            pushFollow(FOLLOW_17);
            rule__Transition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_3__1();

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
    // $ANTLR end "rule__Transition__Group_3__0"


    // $ANTLR start "rule__Transition__Group_3__0__Impl"
    // InternalPetrinet.g:1529:1: rule__Transition__Group_3__0__Impl : ( ( rule__Transition__Group_3_0__0 ) ) ;
    public final void rule__Transition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1533:1: ( ( ( rule__Transition__Group_3_0__0 ) ) )
            // InternalPetrinet.g:1534:1: ( ( rule__Transition__Group_3_0__0 ) )
            {
            // InternalPetrinet.g:1534:1: ( ( rule__Transition__Group_3_0__0 ) )
            // InternalPetrinet.g:1535:2: ( rule__Transition__Group_3_0__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup_3_0()); 
            // InternalPetrinet.g:1536:2: ( rule__Transition__Group_3_0__0 )
            // InternalPetrinet.g:1536:3: rule__Transition__Group_3_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_3_0__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup_3_0()); 

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
    // $ANTLR end "rule__Transition__Group_3__0__Impl"


    // $ANTLR start "rule__Transition__Group_3__1"
    // InternalPetrinet.g:1544:1: rule__Transition__Group_3__1 : rule__Transition__Group_3__1__Impl ;
    public final void rule__Transition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1548:1: ( rule__Transition__Group_3__1__Impl )
            // InternalPetrinet.g:1549:2: rule__Transition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_3__1__Impl();

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
    // $ANTLR end "rule__Transition__Group_3__1"


    // $ANTLR start "rule__Transition__Group_3__1__Impl"
    // InternalPetrinet.g:1555:1: rule__Transition__Group_3__1__Impl : ( ( rule__Transition__Group_3_1__0 ) ) ;
    public final void rule__Transition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1559:1: ( ( ( rule__Transition__Group_3_1__0 ) ) )
            // InternalPetrinet.g:1560:1: ( ( rule__Transition__Group_3_1__0 ) )
            {
            // InternalPetrinet.g:1560:1: ( ( rule__Transition__Group_3_1__0 ) )
            // InternalPetrinet.g:1561:2: ( rule__Transition__Group_3_1__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup_3_1()); 
            // InternalPetrinet.g:1562:2: ( rule__Transition__Group_3_1__0 )
            // InternalPetrinet.g:1562:3: rule__Transition__Group_3_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_3_1__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__Transition__Group_3__1__Impl"


    // $ANTLR start "rule__Transition__Group_3_0__0"
    // InternalPetrinet.g:1571:1: rule__Transition__Group_3_0__0 : rule__Transition__Group_3_0__0__Impl rule__Transition__Group_3_0__1 ;
    public final void rule__Transition__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1575:1: ( rule__Transition__Group_3_0__0__Impl rule__Transition__Group_3_0__1 )
            // InternalPetrinet.g:1576:2: rule__Transition__Group_3_0__0__Impl rule__Transition__Group_3_0__1
            {
            pushFollow(FOLLOW_4);
            rule__Transition__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_3_0__1();

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
    // $ANTLR end "rule__Transition__Group_3_0__0"


    // $ANTLR start "rule__Transition__Group_3_0__0__Impl"
    // InternalPetrinet.g:1583:1: rule__Transition__Group_3_0__0__Impl : ( 'out' ) ;
    public final void rule__Transition__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1587:1: ( ( 'out' ) )
            // InternalPetrinet.g:1588:1: ( 'out' )
            {
            // InternalPetrinet.g:1588:1: ( 'out' )
            // InternalPetrinet.g:1589:2: 'out'
            {
             before(grammarAccess.getTransitionAccess().getOutKeyword_3_0_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getOutKeyword_3_0_0()); 

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
    // $ANTLR end "rule__Transition__Group_3_0__0__Impl"


    // $ANTLR start "rule__Transition__Group_3_0__1"
    // InternalPetrinet.g:1598:1: rule__Transition__Group_3_0__1 : rule__Transition__Group_3_0__1__Impl rule__Transition__Group_3_0__2 ;
    public final void rule__Transition__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1602:1: ( rule__Transition__Group_3_0__1__Impl rule__Transition__Group_3_0__2 )
            // InternalPetrinet.g:1603:2: rule__Transition__Group_3_0__1__Impl rule__Transition__Group_3_0__2
            {
            pushFollow(FOLLOW_20);
            rule__Transition__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_3_0__2();

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
    // $ANTLR end "rule__Transition__Group_3_0__1"


    // $ANTLR start "rule__Transition__Group_3_0__1__Impl"
    // InternalPetrinet.g:1610:1: rule__Transition__Group_3_0__1__Impl : ( '{' ) ;
    public final void rule__Transition__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1614:1: ( ( '{' ) )
            // InternalPetrinet.g:1615:1: ( '{' )
            {
            // InternalPetrinet.g:1615:1: ( '{' )
            // InternalPetrinet.g:1616:2: '{'
            {
             before(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_3_0_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_3_0_1()); 

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
    // $ANTLR end "rule__Transition__Group_3_0__1__Impl"


    // $ANTLR start "rule__Transition__Group_3_0__2"
    // InternalPetrinet.g:1625:1: rule__Transition__Group_3_0__2 : rule__Transition__Group_3_0__2__Impl rule__Transition__Group_3_0__3 ;
    public final void rule__Transition__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1629:1: ( rule__Transition__Group_3_0__2__Impl rule__Transition__Group_3_0__3 )
            // InternalPetrinet.g:1630:2: rule__Transition__Group_3_0__2__Impl rule__Transition__Group_3_0__3
            {
            pushFollow(FOLLOW_20);
            rule__Transition__Group_3_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_3_0__3();

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
    // $ANTLR end "rule__Transition__Group_3_0__2"


    // $ANTLR start "rule__Transition__Group_3_0__2__Impl"
    // InternalPetrinet.g:1637:1: rule__Transition__Group_3_0__2__Impl : ( ( rule__Transition__OutAssignment_3_0_2 )* ) ;
    public final void rule__Transition__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1641:1: ( ( ( rule__Transition__OutAssignment_3_0_2 )* ) )
            // InternalPetrinet.g:1642:1: ( ( rule__Transition__OutAssignment_3_0_2 )* )
            {
            // InternalPetrinet.g:1642:1: ( ( rule__Transition__OutAssignment_3_0_2 )* )
            // InternalPetrinet.g:1643:2: ( rule__Transition__OutAssignment_3_0_2 )*
            {
             before(grammarAccess.getTransitionAccess().getOutAssignment_3_0_2()); 
            // InternalPetrinet.g:1644:2: ( rule__Transition__OutAssignment_3_0_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPetrinet.g:1644:3: rule__Transition__OutAssignment_3_0_2
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Transition__OutAssignment_3_0_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getOutAssignment_3_0_2()); 

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
    // $ANTLR end "rule__Transition__Group_3_0__2__Impl"


    // $ANTLR start "rule__Transition__Group_3_0__3"
    // InternalPetrinet.g:1652:1: rule__Transition__Group_3_0__3 : rule__Transition__Group_3_0__3__Impl ;
    public final void rule__Transition__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1656:1: ( rule__Transition__Group_3_0__3__Impl )
            // InternalPetrinet.g:1657:2: rule__Transition__Group_3_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_3_0__3__Impl();

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
    // $ANTLR end "rule__Transition__Group_3_0__3"


    // $ANTLR start "rule__Transition__Group_3_0__3__Impl"
    // InternalPetrinet.g:1663:1: rule__Transition__Group_3_0__3__Impl : ( '}' ) ;
    public final void rule__Transition__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1667:1: ( ( '}' ) )
            // InternalPetrinet.g:1668:1: ( '}' )
            {
            // InternalPetrinet.g:1668:1: ( '}' )
            // InternalPetrinet.g:1669:2: '}'
            {
             before(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_3_0_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_3_0_3()); 

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
    // $ANTLR end "rule__Transition__Group_3_0__3__Impl"


    // $ANTLR start "rule__Transition__Group_3_1__0"
    // InternalPetrinet.g:1679:1: rule__Transition__Group_3_1__0 : rule__Transition__Group_3_1__0__Impl rule__Transition__Group_3_1__1 ;
    public final void rule__Transition__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1683:1: ( rule__Transition__Group_3_1__0__Impl rule__Transition__Group_3_1__1 )
            // InternalPetrinet.g:1684:2: rule__Transition__Group_3_1__0__Impl rule__Transition__Group_3_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Transition__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_3_1__1();

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
    // $ANTLR end "rule__Transition__Group_3_1__0"


    // $ANTLR start "rule__Transition__Group_3_1__0__Impl"
    // InternalPetrinet.g:1691:1: rule__Transition__Group_3_1__0__Impl : ( 'in' ) ;
    public final void rule__Transition__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1695:1: ( ( 'in' ) )
            // InternalPetrinet.g:1696:1: ( 'in' )
            {
            // InternalPetrinet.g:1696:1: ( 'in' )
            // InternalPetrinet.g:1697:2: 'in'
            {
             before(grammarAccess.getTransitionAccess().getInKeyword_3_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getInKeyword_3_1_0()); 

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
    // $ANTLR end "rule__Transition__Group_3_1__0__Impl"


    // $ANTLR start "rule__Transition__Group_3_1__1"
    // InternalPetrinet.g:1706:1: rule__Transition__Group_3_1__1 : rule__Transition__Group_3_1__1__Impl rule__Transition__Group_3_1__2 ;
    public final void rule__Transition__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1710:1: ( rule__Transition__Group_3_1__1__Impl rule__Transition__Group_3_1__2 )
            // InternalPetrinet.g:1711:2: rule__Transition__Group_3_1__1__Impl rule__Transition__Group_3_1__2
            {
            pushFollow(FOLLOW_20);
            rule__Transition__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_3_1__2();

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
    // $ANTLR end "rule__Transition__Group_3_1__1"


    // $ANTLR start "rule__Transition__Group_3_1__1__Impl"
    // InternalPetrinet.g:1718:1: rule__Transition__Group_3_1__1__Impl : ( '{' ) ;
    public final void rule__Transition__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1722:1: ( ( '{' ) )
            // InternalPetrinet.g:1723:1: ( '{' )
            {
            // InternalPetrinet.g:1723:1: ( '{' )
            // InternalPetrinet.g:1724:2: '{'
            {
             before(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_3_1_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_3_1_1()); 

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
    // $ANTLR end "rule__Transition__Group_3_1__1__Impl"


    // $ANTLR start "rule__Transition__Group_3_1__2"
    // InternalPetrinet.g:1733:1: rule__Transition__Group_3_1__2 : rule__Transition__Group_3_1__2__Impl rule__Transition__Group_3_1__3 ;
    public final void rule__Transition__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1737:1: ( rule__Transition__Group_3_1__2__Impl rule__Transition__Group_3_1__3 )
            // InternalPetrinet.g:1738:2: rule__Transition__Group_3_1__2__Impl rule__Transition__Group_3_1__3
            {
            pushFollow(FOLLOW_20);
            rule__Transition__Group_3_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_3_1__3();

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
    // $ANTLR end "rule__Transition__Group_3_1__2"


    // $ANTLR start "rule__Transition__Group_3_1__2__Impl"
    // InternalPetrinet.g:1745:1: rule__Transition__Group_3_1__2__Impl : ( ( rule__Transition__InAssignment_3_1_2 )* ) ;
    public final void rule__Transition__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1749:1: ( ( ( rule__Transition__InAssignment_3_1_2 )* ) )
            // InternalPetrinet.g:1750:1: ( ( rule__Transition__InAssignment_3_1_2 )* )
            {
            // InternalPetrinet.g:1750:1: ( ( rule__Transition__InAssignment_3_1_2 )* )
            // InternalPetrinet.g:1751:2: ( rule__Transition__InAssignment_3_1_2 )*
            {
             before(grammarAccess.getTransitionAccess().getInAssignment_3_1_2()); 
            // InternalPetrinet.g:1752:2: ( rule__Transition__InAssignment_3_1_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPetrinet.g:1752:3: rule__Transition__InAssignment_3_1_2
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Transition__InAssignment_3_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getInAssignment_3_1_2()); 

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
    // $ANTLR end "rule__Transition__Group_3_1__2__Impl"


    // $ANTLR start "rule__Transition__Group_3_1__3"
    // InternalPetrinet.g:1760:1: rule__Transition__Group_3_1__3 : rule__Transition__Group_3_1__3__Impl ;
    public final void rule__Transition__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1764:1: ( rule__Transition__Group_3_1__3__Impl )
            // InternalPetrinet.g:1765:2: rule__Transition__Group_3_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_3_1__3__Impl();

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
    // $ANTLR end "rule__Transition__Group_3_1__3"


    // $ANTLR start "rule__Transition__Group_3_1__3__Impl"
    // InternalPetrinet.g:1771:1: rule__Transition__Group_3_1__3__Impl : ( '}' ) ;
    public final void rule__Transition__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1775:1: ( ( '}' ) )
            // InternalPetrinet.g:1776:1: ( '}' )
            {
            // InternalPetrinet.g:1776:1: ( '}' )
            // InternalPetrinet.g:1777:2: '}'
            {
             before(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_3_1_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_3_1_3()); 

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
    // $ANTLR end "rule__Transition__Group_3_1__3__Impl"


    // $ANTLR start "rule__PTArc__Group__0"
    // InternalPetrinet.g:1787:1: rule__PTArc__Group__0 : rule__PTArc__Group__0__Impl rule__PTArc__Group__1 ;
    public final void rule__PTArc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1791:1: ( rule__PTArc__Group__0__Impl rule__PTArc__Group__1 )
            // InternalPetrinet.g:1792:2: rule__PTArc__Group__0__Impl rule__PTArc__Group__1
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
    // InternalPetrinet.g:1799:1: rule__PTArc__Group__0__Impl : ( 'ptarc' ) ;
    public final void rule__PTArc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1803:1: ( ( 'ptarc' ) )
            // InternalPetrinet.g:1804:1: ( 'ptarc' )
            {
            // InternalPetrinet.g:1804:1: ( 'ptarc' )
            // InternalPetrinet.g:1805:2: 'ptarc'
            {
             before(grammarAccess.getPTArcAccess().getPtarcKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPTArcAccess().getPtarcKeyword_0()); 

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
    // InternalPetrinet.g:1814:1: rule__PTArc__Group__1 : rule__PTArc__Group__1__Impl rule__PTArc__Group__2 ;
    public final void rule__PTArc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1818:1: ( rule__PTArc__Group__1__Impl rule__PTArc__Group__2 )
            // InternalPetrinet.g:1819:2: rule__PTArc__Group__1__Impl rule__PTArc__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalPetrinet.g:1826:1: rule__PTArc__Group__1__Impl : ( ( rule__PTArc__NameAssignment_1 ) ) ;
    public final void rule__PTArc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1830:1: ( ( ( rule__PTArc__NameAssignment_1 ) ) )
            // InternalPetrinet.g:1831:1: ( ( rule__PTArc__NameAssignment_1 ) )
            {
            // InternalPetrinet.g:1831:1: ( ( rule__PTArc__NameAssignment_1 ) )
            // InternalPetrinet.g:1832:2: ( rule__PTArc__NameAssignment_1 )
            {
             before(grammarAccess.getPTArcAccess().getNameAssignment_1()); 
            // InternalPetrinet.g:1833:2: ( rule__PTArc__NameAssignment_1 )
            // InternalPetrinet.g:1833:3: rule__PTArc__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PTArc__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPTArcAccess().getNameAssignment_1()); 

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
    // InternalPetrinet.g:1841:1: rule__PTArc__Group__2 : rule__PTArc__Group__2__Impl rule__PTArc__Group__3 ;
    public final void rule__PTArc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1845:1: ( rule__PTArc__Group__2__Impl rule__PTArc__Group__3 )
            // InternalPetrinet.g:1846:2: rule__PTArc__Group__2__Impl rule__PTArc__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalPetrinet.g:1853:1: rule__PTArc__Group__2__Impl : ( 'weight' ) ;
    public final void rule__PTArc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1857:1: ( ( 'weight' ) )
            // InternalPetrinet.g:1858:1: ( 'weight' )
            {
            // InternalPetrinet.g:1858:1: ( 'weight' )
            // InternalPetrinet.g:1859:2: 'weight'
            {
             before(grammarAccess.getPTArcAccess().getWeightKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPTArcAccess().getWeightKeyword_2()); 

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
    // InternalPetrinet.g:1868:1: rule__PTArc__Group__3 : rule__PTArc__Group__3__Impl rule__PTArc__Group__4 ;
    public final void rule__PTArc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1872:1: ( rule__PTArc__Group__3__Impl rule__PTArc__Group__4 )
            // InternalPetrinet.g:1873:2: rule__PTArc__Group__3__Impl rule__PTArc__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalPetrinet.g:1880:1: rule__PTArc__Group__3__Impl : ( ( rule__PTArc__WeightAssignment_3 ) ) ;
    public final void rule__PTArc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1884:1: ( ( ( rule__PTArc__WeightAssignment_3 ) ) )
            // InternalPetrinet.g:1885:1: ( ( rule__PTArc__WeightAssignment_3 ) )
            {
            // InternalPetrinet.g:1885:1: ( ( rule__PTArc__WeightAssignment_3 ) )
            // InternalPetrinet.g:1886:2: ( rule__PTArc__WeightAssignment_3 )
            {
             before(grammarAccess.getPTArcAccess().getWeightAssignment_3()); 
            // InternalPetrinet.g:1887:2: ( rule__PTArc__WeightAssignment_3 )
            // InternalPetrinet.g:1887:3: rule__PTArc__WeightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PTArc__WeightAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPTArcAccess().getWeightAssignment_3()); 

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
    // InternalPetrinet.g:1895:1: rule__PTArc__Group__4 : rule__PTArc__Group__4__Impl rule__PTArc__Group__5 ;
    public final void rule__PTArc__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1899:1: ( rule__PTArc__Group__4__Impl rule__PTArc__Group__5 )
            // InternalPetrinet.g:1900:2: rule__PTArc__Group__4__Impl rule__PTArc__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__PTArc__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PTArc__Group__5();

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
    // InternalPetrinet.g:1907:1: rule__PTArc__Group__4__Impl : ( 'place' ) ;
    public final void rule__PTArc__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1911:1: ( ( 'place' ) )
            // InternalPetrinet.g:1912:1: ( 'place' )
            {
            // InternalPetrinet.g:1912:1: ( 'place' )
            // InternalPetrinet.g:1913:2: 'place'
            {
             before(grammarAccess.getPTArcAccess().getPlaceKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPTArcAccess().getPlaceKeyword_4()); 

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


    // $ANTLR start "rule__PTArc__Group__5"
    // InternalPetrinet.g:1922:1: rule__PTArc__Group__5 : rule__PTArc__Group__5__Impl rule__PTArc__Group__6 ;
    public final void rule__PTArc__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1926:1: ( rule__PTArc__Group__5__Impl rule__PTArc__Group__6 )
            // InternalPetrinet.g:1927:2: rule__PTArc__Group__5__Impl rule__PTArc__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__PTArc__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PTArc__Group__6();

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
    // $ANTLR end "rule__PTArc__Group__5"


    // $ANTLR start "rule__PTArc__Group__5__Impl"
    // InternalPetrinet.g:1934:1: rule__PTArc__Group__5__Impl : ( ( rule__PTArc__SourceAssignment_5 ) ) ;
    public final void rule__PTArc__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1938:1: ( ( ( rule__PTArc__SourceAssignment_5 ) ) )
            // InternalPetrinet.g:1939:1: ( ( rule__PTArc__SourceAssignment_5 ) )
            {
            // InternalPetrinet.g:1939:1: ( ( rule__PTArc__SourceAssignment_5 ) )
            // InternalPetrinet.g:1940:2: ( rule__PTArc__SourceAssignment_5 )
            {
             before(grammarAccess.getPTArcAccess().getSourceAssignment_5()); 
            // InternalPetrinet.g:1941:2: ( rule__PTArc__SourceAssignment_5 )
            // InternalPetrinet.g:1941:3: rule__PTArc__SourceAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__PTArc__SourceAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPTArcAccess().getSourceAssignment_5()); 

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
    // $ANTLR end "rule__PTArc__Group__5__Impl"


    // $ANTLR start "rule__PTArc__Group__6"
    // InternalPetrinet.g:1949:1: rule__PTArc__Group__6 : rule__PTArc__Group__6__Impl rule__PTArc__Group__7 ;
    public final void rule__PTArc__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1953:1: ( rule__PTArc__Group__6__Impl rule__PTArc__Group__7 )
            // InternalPetrinet.g:1954:2: rule__PTArc__Group__6__Impl rule__PTArc__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__PTArc__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PTArc__Group__7();

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
    // $ANTLR end "rule__PTArc__Group__6"


    // $ANTLR start "rule__PTArc__Group__6__Impl"
    // InternalPetrinet.g:1961:1: rule__PTArc__Group__6__Impl : ( 'transition' ) ;
    public final void rule__PTArc__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1965:1: ( ( 'transition' ) )
            // InternalPetrinet.g:1966:1: ( 'transition' )
            {
            // InternalPetrinet.g:1966:1: ( 'transition' )
            // InternalPetrinet.g:1967:2: 'transition'
            {
             before(grammarAccess.getPTArcAccess().getTransitionKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPTArcAccess().getTransitionKeyword_6()); 

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
    // $ANTLR end "rule__PTArc__Group__6__Impl"


    // $ANTLR start "rule__PTArc__Group__7"
    // InternalPetrinet.g:1976:1: rule__PTArc__Group__7 : rule__PTArc__Group__7__Impl ;
    public final void rule__PTArc__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1980:1: ( rule__PTArc__Group__7__Impl )
            // InternalPetrinet.g:1981:2: rule__PTArc__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PTArc__Group__7__Impl();

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
    // $ANTLR end "rule__PTArc__Group__7"


    // $ANTLR start "rule__PTArc__Group__7__Impl"
    // InternalPetrinet.g:1987:1: rule__PTArc__Group__7__Impl : ( ( rule__PTArc__TargetAssignment_7 ) ) ;
    public final void rule__PTArc__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:1991:1: ( ( ( rule__PTArc__TargetAssignment_7 ) ) )
            // InternalPetrinet.g:1992:1: ( ( rule__PTArc__TargetAssignment_7 ) )
            {
            // InternalPetrinet.g:1992:1: ( ( rule__PTArc__TargetAssignment_7 ) )
            // InternalPetrinet.g:1993:2: ( rule__PTArc__TargetAssignment_7 )
            {
             before(grammarAccess.getPTArcAccess().getTargetAssignment_7()); 
            // InternalPetrinet.g:1994:2: ( rule__PTArc__TargetAssignment_7 )
            // InternalPetrinet.g:1994:3: rule__PTArc__TargetAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__PTArc__TargetAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getPTArcAccess().getTargetAssignment_7()); 

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
    // $ANTLR end "rule__PTArc__Group__7__Impl"


    // $ANTLR start "rule__TPArc__Group__0"
    // InternalPetrinet.g:2003:1: rule__TPArc__Group__0 : rule__TPArc__Group__0__Impl rule__TPArc__Group__1 ;
    public final void rule__TPArc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:2007:1: ( rule__TPArc__Group__0__Impl rule__TPArc__Group__1 )
            // InternalPetrinet.g:2008:2: rule__TPArc__Group__0__Impl rule__TPArc__Group__1
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
    // InternalPetrinet.g:2015:1: rule__TPArc__Group__0__Impl : ( 'tparc' ) ;
    public final void rule__TPArc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:2019:1: ( ( 'tparc' ) )
            // InternalPetrinet.g:2020:1: ( 'tparc' )
            {
            // InternalPetrinet.g:2020:1: ( 'tparc' )
            // InternalPetrinet.g:2021:2: 'tparc'
            {
             before(grammarAccess.getTPArcAccess().getTparcKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTPArcAccess().getTparcKeyword_0()); 

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
    // InternalPetrinet.g:2030:1: rule__TPArc__Group__1 : rule__TPArc__Group__1__Impl rule__TPArc__Group__2 ;
    public final void rule__TPArc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:2034:1: ( rule__TPArc__Group__1__Impl rule__TPArc__Group__2 )
            // InternalPetrinet.g:2035:2: rule__TPArc__Group__1__Impl rule__TPArc__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalPetrinet.g:2042:1: rule__TPArc__Group__1__Impl : ( ( rule__TPArc__NameAssignment_1 ) ) ;
    public final void rule__TPArc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:2046:1: ( ( ( rule__TPArc__NameAssignment_1 ) ) )
            // InternalPetrinet.g:2047:1: ( ( rule__TPArc__NameAssignment_1 ) )
            {
            // InternalPetrinet.g:2047:1: ( ( rule__TPArc__NameAssignment_1 ) )
            // InternalPetrinet.g:2048:2: ( rule__TPArc__NameAssignment_1 )
            {
             before(grammarAccess.getTPArcAccess().getNameAssignment_1()); 
            // InternalPetrinet.g:2049:2: ( rule__TPArc__NameAssignment_1 )
            // InternalPetrinet.g:2049:3: rule__TPArc__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TPArc__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTPArcAccess().getNameAssignment_1()); 

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
    // InternalPetrinet.g:2057:1: rule__TPArc__Group__2 : rule__TPArc__Group__2__Impl rule__TPArc__Group__3 ;
    public final void rule__TPArc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:2061:1: ( rule__TPArc__Group__2__Impl rule__TPArc__Group__3 )
            // InternalPetrinet.g:2062:2: rule__TPArc__Group__2__Impl rule__TPArc__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalPetrinet.g:2069:1: rule__TPArc__Group__2__Impl : ( 'weight' ) ;
    public final void rule__TPArc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:2073:1: ( ( 'weight' ) )
            // InternalPetrinet.g:2074:1: ( 'weight' )
            {
            // InternalPetrinet.g:2074:1: ( 'weight' )
            // InternalPetrinet.g:2075:2: 'weight'
            {
             before(grammarAccess.getTPArcAccess().getWeightKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTPArcAccess().getWeightKeyword_2()); 

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
    // InternalPetrinet.g:2084:1: rule__TPArc__Group__3 : rule__TPArc__Group__3__Impl rule__TPArc__Group__4 ;
    public final void rule__TPArc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:2088:1: ( rule__TPArc__Group__3__Impl rule__TPArc__Group__4 )
            // InternalPetrinet.g:2089:2: rule__TPArc__Group__3__Impl rule__TPArc__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalPetrinet.g:2096:1: rule__TPArc__Group__3__Impl : ( ( rule__TPArc__WeightAssignment_3 ) ) ;
    public final void rule__TPArc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:2100:1: ( ( ( rule__TPArc__WeightAssignment_3 ) ) )
            // InternalPetrinet.g:2101:1: ( ( rule__TPArc__WeightAssignment_3 ) )
            {
            // InternalPetrinet.g:2101:1: ( ( rule__TPArc__WeightAssignment_3 ) )
            // InternalPetrinet.g:2102:2: ( rule__TPArc__WeightAssignment_3 )
            {
             before(grammarAccess.getTPArcAccess().getWeightAssignment_3()); 
            // InternalPetrinet.g:2103:2: ( rule__TPArc__WeightAssignment_3 )
            // InternalPetrinet.g:2103:3: rule__TPArc__WeightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TPArc__WeightAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTPArcAccess().getWeightAssignment_3()); 

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
    // InternalPetrinet.g:2111:1: rule__TPArc__Group__4 : rule__TPArc__Group__4__Impl rule__TPArc__Group__5 ;
    public final void rule__TPArc__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:2115:1: ( rule__TPArc__Group__4__Impl rule__TPArc__Group__5 )
            // InternalPetrinet.g:2116:2: rule__TPArc__Group__4__Impl rule__TPArc__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__TPArc__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TPArc__Group__5();

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
    // InternalPetrinet.g:2123:1: rule__TPArc__Group__4__Impl : ( 'transition' ) ;
    public final void rule__TPArc__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:2127:1: ( ( 'transition' ) )
            // InternalPetrinet.g:2128:1: ( 'transition' )
            {
            // InternalPetrinet.g:2128:1: ( 'transition' )
            // InternalPetrinet.g:2129:2: 'transition'
            {
             before(grammarAccess.getTPArcAccess().getTransitionKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTPArcAccess().getTransitionKeyword_4()); 

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


    // $ANTLR start "rule__TPArc__Group__5"
    // InternalPetrinet.g:2138:1: rule__TPArc__Group__5 : rule__TPArc__Group__5__Impl rule__TPArc__Group__6 ;
    public final void rule__TPArc__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:2142:1: ( rule__TPArc__Group__5__Impl rule__TPArc__Group__6 )
            // InternalPetrinet.g:2143:2: rule__TPArc__Group__5__Impl rule__TPArc__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__TPArc__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TPArc__Group__6();

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
    // $ANTLR end "rule__TPArc__Group__5"


    // $ANTLR start "rule__TPArc__Group__5__Impl"
    // InternalPetrinet.g:2150:1: rule__TPArc__Group__5__Impl : ( ( rule__TPArc__SourceAssignment_5 ) ) ;
    public final void rule__TPArc__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:2154:1: ( ( ( rule__TPArc__SourceAssignment_5 ) ) )
            // InternalPetrinet.g:2155:1: ( ( rule__TPArc__SourceAssignment_5 ) )
            {
            // InternalPetrinet.g:2155:1: ( ( rule__TPArc__SourceAssignment_5 ) )
            // InternalPetrinet.g:2156:2: ( rule__TPArc__SourceAssignment_5 )
            {
             before(grammarAccess.getTPArcAccess().getSourceAssignment_5()); 
            // InternalPetrinet.g:2157:2: ( rule__TPArc__SourceAssignment_5 )
            // InternalPetrinet.g:2157:3: rule__TPArc__SourceAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__TPArc__SourceAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTPArcAccess().getSourceAssignment_5()); 

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
    // $ANTLR end "rule__TPArc__Group__5__Impl"


    // $ANTLR start "rule__TPArc__Group__6"
    // InternalPetrinet.g:2165:1: rule__TPArc__Group__6 : rule__TPArc__Group__6__Impl rule__TPArc__Group__7 ;
    public final void rule__TPArc__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:2169:1: ( rule__TPArc__Group__6__Impl rule__TPArc__Group__7 )
            // InternalPetrinet.g:2170:2: rule__TPArc__Group__6__Impl rule__TPArc__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__TPArc__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TPArc__Group__7();

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
    // $ANTLR end "rule__TPArc__Group__6"


    // $ANTLR start "rule__TPArc__Group__6__Impl"
    // InternalPetrinet.g:2177:1: rule__TPArc__Group__6__Impl : ( 'place' ) ;
    public final void rule__TPArc__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:2181:1: ( ( 'place' ) )
            // InternalPetrinet.g:2182:1: ( 'place' )
            {
            // InternalPetrinet.g:2182:1: ( 'place' )
            // InternalPetrinet.g:2183:2: 'place'
            {
             before(grammarAccess.getTPArcAccess().getPlaceKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTPArcAccess().getPlaceKeyword_6()); 

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
    // $ANTLR end "rule__TPArc__Group__6__Impl"


    // $ANTLR start "rule__TPArc__Group__7"
    // InternalPetrinet.g:2192:1: rule__TPArc__Group__7 : rule__TPArc__Group__7__Impl ;
    public final void rule__TPArc__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:2196:1: ( rule__TPArc__Group__7__Impl )
            // InternalPetrinet.g:2197:2: rule__TPArc__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TPArc__Group__7__Impl();

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
    // $ANTLR end "rule__TPArc__Group__7"


    // $ANTLR start "rule__TPArc__Group__7__Impl"
    // InternalPetrinet.g:2203:1: rule__TPArc__Group__7__Impl : ( ( rule__TPArc__TargetAssignment_7 ) ) ;
    public final void rule__TPArc__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:2207:1: ( ( ( rule__TPArc__TargetAssignment_7 ) ) )
            // InternalPetrinet.g:2208:1: ( ( rule__TPArc__TargetAssignment_7 ) )
            {
            // InternalPetrinet.g:2208:1: ( ( rule__TPArc__TargetAssignment_7 ) )
            // InternalPetrinet.g:2209:2: ( rule__TPArc__TargetAssignment_7 )
            {
             before(grammarAccess.getTPArcAccess().getTargetAssignment_7()); 
            // InternalPetrinet.g:2210:2: ( rule__TPArc__TargetAssignment_7 )
            // InternalPetrinet.g:2210:3: rule__TPArc__TargetAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__TPArc__TargetAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getTPArcAccess().getTargetAssignment_7()); 

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
    // $ANTLR end "rule__TPArc__Group__7__Impl"


    // $ANTLR start "rule__Petrinet__NameAssignment_1"
    // InternalPetrinet.g:2219:1: rule__Petrinet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Petrinet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:2223:1: ( ( RULE_ID ) )
            // InternalPetrinet.g:2224:2: ( RULE_ID )
            {
            // InternalPetrinet.g:2224:2: ( RULE_ID )
            // InternalPetrinet.g:2225:3: RULE_ID
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


    // $ANTLR start "rule__Petrinet__PlacesAssignment_3_0_2"
    // InternalPetrinet.g:2234:1: rule__Petrinet__PlacesAssignment_3_0_2 : ( rulePlace ) ;
    public final void rule__Petrinet__PlacesAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:2238:1: ( ( rulePlace ) )
            // InternalPetrinet.g:2239:2: ( rulePlace )
            {
            // InternalPetrinet.g:2239:2: ( rulePlace )
            // InternalPetrinet.g:2240:3: rulePlace
            {
             before(grammarAccess.getPetrinetAccess().getPlacesPlaceParserRuleCall_3_0_2_0()); 
            pushFollow(FOLLOW_2);
            rulePlace();

            state._fsp--;

             after(grammarAccess.getPetrinetAccess().getPlacesPlaceParserRuleCall_3_0_2_0()); 

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
    // $ANTLR end "rule__Petrinet__PlacesAssignment_3_0_2"


    // $ANTLR start "rule__Petrinet__TransitionsAssignment_3_1_2"
    // InternalPetrinet.g:2249:1: rule__Petrinet__TransitionsAssignment_3_1_2 : ( ruleTransition ) ;
    public final void rule__Petrinet__TransitionsAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:2253:1: ( ( ruleTransition ) )
            // InternalPetrinet.g:2254:2: ( ruleTransition )
            {
            // InternalPetrinet.g:2254:2: ( ruleTransition )
            // InternalPetrinet.g:2255:3: ruleTransition
            {
             before(grammarAccess.getPetrinetAccess().getTransitionsTransitionParserRuleCall_3_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getPetrinetAccess().getTransitionsTransitionParserRuleCall_3_1_2_0()); 

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
    // $ANTLR end "rule__Petrinet__TransitionsAssignment_3_1_2"


    // $ANTLR start "rule__Petrinet__ArcsAssignment_3_2_2"
    // InternalPetrinet.g:2264:1: rule__Petrinet__ArcsAssignment_3_2_2 : ( ruleArc ) ;
    public final void rule__Petrinet__ArcsAssignment_3_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:2268:1: ( ( ruleArc ) )
            // InternalPetrinet.g:2269:2: ( ruleArc )
            {
            // InternalPetrinet.g:2269:2: ( ruleArc )
            // InternalPetrinet.g:2270:3: ruleArc
            {
             before(grammarAccess.getPetrinetAccess().getArcsArcParserRuleCall_3_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleArc();

            state._fsp--;

             after(grammarAccess.getPetrinetAccess().getArcsArcParserRuleCall_3_2_2_0()); 

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
    // $ANTLR end "rule__Petrinet__ArcsAssignment_3_2_2"


    // $ANTLR start "rule__Place__NameAssignment_1"
    // InternalPetrinet.g:2279:1: rule__Place__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Place__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:2283:1: ( ( RULE_ID ) )
            // InternalPetrinet.g:2284:2: ( RULE_ID )
            {
            // InternalPetrinet.g:2284:2: ( RULE_ID )
            // InternalPetrinet.g:2285:3: RULE_ID
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


    // $ANTLR start "rule__Place__TokensAssignment_3_0_2"
    // InternalPetrinet.g:2294:1: rule__Place__TokensAssignment_3_0_2 : ( ruleToken ) ;
    public final void rule__Place__TokensAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:2298:1: ( ( ruleToken ) )
            // InternalPetrinet.g:2299:2: ( ruleToken )
            {
            // InternalPetrinet.g:2299:2: ( ruleToken )
            // InternalPetrinet.g:2300:3: ruleToken
            {
             before(grammarAccess.getPlaceAccess().getTokensTokenParserRuleCall_3_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleToken();

            state._fsp--;

             after(grammarAccess.getPlaceAccess().getTokensTokenParserRuleCall_3_0_2_0()); 

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
    // $ANTLR end "rule__Place__TokensAssignment_3_0_2"


    // $ANTLR start "rule__Place__OutAssignment_3_1_2"
    // InternalPetrinet.g:2309:1: rule__Place__OutAssignment_3_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__Place__OutAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:2313:1: ( ( ( RULE_ID ) ) )
            // InternalPetrinet.g:2314:2: ( ( RULE_ID ) )
            {
            // InternalPetrinet.g:2314:2: ( ( RULE_ID ) )
            // InternalPetrinet.g:2315:3: ( RULE_ID )
            {
             before(grammarAccess.getPlaceAccess().getOutPTArcCrossReference_3_1_2_0()); 
            // InternalPetrinet.g:2316:3: ( RULE_ID )
            // InternalPetrinet.g:2317:4: RULE_ID
            {
             before(grammarAccess.getPlaceAccess().getOutPTArcIDTerminalRuleCall_3_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getOutPTArcIDTerminalRuleCall_3_1_2_0_1()); 

            }

             after(grammarAccess.getPlaceAccess().getOutPTArcCrossReference_3_1_2_0()); 

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
    // $ANTLR end "rule__Place__OutAssignment_3_1_2"


    // $ANTLR start "rule__Place__InAssignment_3_2_2"
    // InternalPetrinet.g:2328:1: rule__Place__InAssignment_3_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__Place__InAssignment_3_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:2332:1: ( ( ( RULE_ID ) ) )
            // InternalPetrinet.g:2333:2: ( ( RULE_ID ) )
            {
            // InternalPetrinet.g:2333:2: ( ( RULE_ID ) )
            // InternalPetrinet.g:2334:3: ( RULE_ID )
            {
             before(grammarAccess.getPlaceAccess().getInTPArcCrossReference_3_2_2_0()); 
            // InternalPetrinet.g:2335:3: ( RULE_ID )
            // InternalPetrinet.g:2336:4: RULE_ID
            {
             before(grammarAccess.getPlaceAccess().getInTPArcIDTerminalRuleCall_3_2_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getInTPArcIDTerminalRuleCall_3_2_2_0_1()); 

            }

             after(grammarAccess.getPlaceAccess().getInTPArcCrossReference_3_2_2_0()); 

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
    // $ANTLR end "rule__Place__InAssignment_3_2_2"


    // $ANTLR start "rule__Transition__NameAssignment_1"
    // InternalPetrinet.g:2347:1: rule__Transition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Transition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:2351:1: ( ( RULE_ID ) )
            // InternalPetrinet.g:2352:2: ( RULE_ID )
            {
            // InternalPetrinet.g:2352:2: ( RULE_ID )
            // InternalPetrinet.g:2353:3: RULE_ID
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


    // $ANTLR start "rule__Transition__OutAssignment_3_0_2"
    // InternalPetrinet.g:2362:1: rule__Transition__OutAssignment_3_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__OutAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:2366:1: ( ( ( RULE_ID ) ) )
            // InternalPetrinet.g:2367:2: ( ( RULE_ID ) )
            {
            // InternalPetrinet.g:2367:2: ( ( RULE_ID ) )
            // InternalPetrinet.g:2368:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getOutTPArcCrossReference_3_0_2_0()); 
            // InternalPetrinet.g:2369:3: ( RULE_ID )
            // InternalPetrinet.g:2370:4: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getOutTPArcIDTerminalRuleCall_3_0_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getOutTPArcIDTerminalRuleCall_3_0_2_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getOutTPArcCrossReference_3_0_2_0()); 

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
    // $ANTLR end "rule__Transition__OutAssignment_3_0_2"


    // $ANTLR start "rule__Transition__InAssignment_3_1_2"
    // InternalPetrinet.g:2381:1: rule__Transition__InAssignment_3_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__InAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:2385:1: ( ( ( RULE_ID ) ) )
            // InternalPetrinet.g:2386:2: ( ( RULE_ID ) )
            {
            // InternalPetrinet.g:2386:2: ( ( RULE_ID ) )
            // InternalPetrinet.g:2387:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getInPTArcCrossReference_3_1_2_0()); 
            // InternalPetrinet.g:2388:3: ( RULE_ID )
            // InternalPetrinet.g:2389:4: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getInPTArcIDTerminalRuleCall_3_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getInPTArcIDTerminalRuleCall_3_1_2_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getInPTArcCrossReference_3_1_2_0()); 

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
    // $ANTLR end "rule__Transition__InAssignment_3_1_2"


    // $ANTLR start "rule__PTArc__NameAssignment_1"
    // InternalPetrinet.g:2400:1: rule__PTArc__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PTArc__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:2404:1: ( ( RULE_ID ) )
            // InternalPetrinet.g:2405:2: ( RULE_ID )
            {
            // InternalPetrinet.g:2405:2: ( RULE_ID )
            // InternalPetrinet.g:2406:3: RULE_ID
            {
             before(grammarAccess.getPTArcAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPTArcAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__PTArc__NameAssignment_1"


    // $ANTLR start "rule__PTArc__WeightAssignment_3"
    // InternalPetrinet.g:2415:1: rule__PTArc__WeightAssignment_3 : ( RULE_INT ) ;
    public final void rule__PTArc__WeightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:2419:1: ( ( RULE_INT ) )
            // InternalPetrinet.g:2420:2: ( RULE_INT )
            {
            // InternalPetrinet.g:2420:2: ( RULE_INT )
            // InternalPetrinet.g:2421:3: RULE_INT
            {
             before(grammarAccess.getPTArcAccess().getWeightINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPTArcAccess().getWeightINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__PTArc__WeightAssignment_3"


    // $ANTLR start "rule__PTArc__SourceAssignment_5"
    // InternalPetrinet.g:2430:1: rule__PTArc__SourceAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__PTArc__SourceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:2434:1: ( ( ( RULE_ID ) ) )
            // InternalPetrinet.g:2435:2: ( ( RULE_ID ) )
            {
            // InternalPetrinet.g:2435:2: ( ( RULE_ID ) )
            // InternalPetrinet.g:2436:3: ( RULE_ID )
            {
             before(grammarAccess.getPTArcAccess().getSourcePlaceCrossReference_5_0()); 
            // InternalPetrinet.g:2437:3: ( RULE_ID )
            // InternalPetrinet.g:2438:4: RULE_ID
            {
             before(grammarAccess.getPTArcAccess().getSourcePlaceIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPTArcAccess().getSourcePlaceIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getPTArcAccess().getSourcePlaceCrossReference_5_0()); 

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
    // $ANTLR end "rule__PTArc__SourceAssignment_5"


    // $ANTLR start "rule__PTArc__TargetAssignment_7"
    // InternalPetrinet.g:2449:1: rule__PTArc__TargetAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__PTArc__TargetAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:2453:1: ( ( ( RULE_ID ) ) )
            // InternalPetrinet.g:2454:2: ( ( RULE_ID ) )
            {
            // InternalPetrinet.g:2454:2: ( ( RULE_ID ) )
            // InternalPetrinet.g:2455:3: ( RULE_ID )
            {
             before(grammarAccess.getPTArcAccess().getTargetTransitionCrossReference_7_0()); 
            // InternalPetrinet.g:2456:3: ( RULE_ID )
            // InternalPetrinet.g:2457:4: RULE_ID
            {
             before(grammarAccess.getPTArcAccess().getTargetTransitionIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPTArcAccess().getTargetTransitionIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getPTArcAccess().getTargetTransitionCrossReference_7_0()); 

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
    // $ANTLR end "rule__PTArc__TargetAssignment_7"


    // $ANTLR start "rule__TPArc__NameAssignment_1"
    // InternalPetrinet.g:2468:1: rule__TPArc__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TPArc__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:2472:1: ( ( RULE_ID ) )
            // InternalPetrinet.g:2473:2: ( RULE_ID )
            {
            // InternalPetrinet.g:2473:2: ( RULE_ID )
            // InternalPetrinet.g:2474:3: RULE_ID
            {
             before(grammarAccess.getTPArcAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTPArcAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__TPArc__NameAssignment_1"


    // $ANTLR start "rule__TPArc__WeightAssignment_3"
    // InternalPetrinet.g:2483:1: rule__TPArc__WeightAssignment_3 : ( RULE_INT ) ;
    public final void rule__TPArc__WeightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:2487:1: ( ( RULE_INT ) )
            // InternalPetrinet.g:2488:2: ( RULE_INT )
            {
            // InternalPetrinet.g:2488:2: ( RULE_INT )
            // InternalPetrinet.g:2489:3: RULE_INT
            {
             before(grammarAccess.getTPArcAccess().getWeightINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTPArcAccess().getWeightINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__TPArc__WeightAssignment_3"


    // $ANTLR start "rule__TPArc__SourceAssignment_5"
    // InternalPetrinet.g:2498:1: rule__TPArc__SourceAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__TPArc__SourceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:2502:1: ( ( ( RULE_ID ) ) )
            // InternalPetrinet.g:2503:2: ( ( RULE_ID ) )
            {
            // InternalPetrinet.g:2503:2: ( ( RULE_ID ) )
            // InternalPetrinet.g:2504:3: ( RULE_ID )
            {
             before(grammarAccess.getTPArcAccess().getSourceTransitionCrossReference_5_0()); 
            // InternalPetrinet.g:2505:3: ( RULE_ID )
            // InternalPetrinet.g:2506:4: RULE_ID
            {
             before(grammarAccess.getTPArcAccess().getSourceTransitionIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTPArcAccess().getSourceTransitionIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getTPArcAccess().getSourceTransitionCrossReference_5_0()); 

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
    // $ANTLR end "rule__TPArc__SourceAssignment_5"


    // $ANTLR start "rule__TPArc__TargetAssignment_7"
    // InternalPetrinet.g:2517:1: rule__TPArc__TargetAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__TPArc__TargetAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetrinet.g:2521:1: ( ( ( RULE_ID ) ) )
            // InternalPetrinet.g:2522:2: ( ( RULE_ID ) )
            {
            // InternalPetrinet.g:2522:2: ( ( RULE_ID ) )
            // InternalPetrinet.g:2523:3: ( RULE_ID )
            {
             before(grammarAccess.getTPArcAccess().getTargetPlaceCrossReference_7_0()); 
            // InternalPetrinet.g:2524:3: ( RULE_ID )
            // InternalPetrinet.g:2525:4: RULE_ID
            {
             before(grammarAccess.getTPArcAccess().getTargetPlaceIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTPArcAccess().getTargetPlaceIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getTPArcAccess().getTargetPlaceCrossReference_7_0()); 

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
    // $ANTLR end "rule__TPArc__TargetAssignment_7"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002802000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002800002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000400000L});

}