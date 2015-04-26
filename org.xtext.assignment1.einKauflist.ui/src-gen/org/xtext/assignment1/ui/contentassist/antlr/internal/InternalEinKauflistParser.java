package org.xtext.assignment1.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.assignment1.services.EinKauflistGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEinKauflistParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'category'", "'end'", "'-'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalEinKauflistParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEinKauflistParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEinKauflistParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g"; }


     
     	private EinKauflistGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(EinKauflistGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleBuyticket"
    // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:60:1: entryRuleBuyticket : ruleBuyticket EOF ;
    public final void entryRuleBuyticket() throws RecognitionException {
        try {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:61:1: ( ruleBuyticket EOF )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:62:1: ruleBuyticket EOF
            {
             before(grammarAccess.getBuyticketRule()); 
            pushFollow(FOLLOW_ruleBuyticket_in_entryRuleBuyticket61);
            ruleBuyticket();

            state._fsp--;

             after(grammarAccess.getBuyticketRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuyticket68); 

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
    // $ANTLR end "entryRuleBuyticket"


    // $ANTLR start "ruleBuyticket"
    // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:69:1: ruleBuyticket : ( ( rule__Buyticket__Group__0 ) ) ;
    public final void ruleBuyticket() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:73:2: ( ( ( rule__Buyticket__Group__0 ) ) )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:74:1: ( ( rule__Buyticket__Group__0 ) )
            {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:74:1: ( ( rule__Buyticket__Group__0 ) )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:75:1: ( rule__Buyticket__Group__0 )
            {
             before(grammarAccess.getBuyticketAccess().getGroup()); 
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:76:1: ( rule__Buyticket__Group__0 )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:76:2: rule__Buyticket__Group__0
            {
            pushFollow(FOLLOW_rule__Buyticket__Group__0_in_ruleBuyticket94);
            rule__Buyticket__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBuyticketAccess().getGroup()); 

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
    // $ANTLR end "ruleBuyticket"


    // $ANTLR start "entryRuleCategory"
    // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:88:1: entryRuleCategory : ruleCategory EOF ;
    public final void entryRuleCategory() throws RecognitionException {
        try {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:89:1: ( ruleCategory EOF )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:90:1: ruleCategory EOF
            {
             before(grammarAccess.getCategoryRule()); 
            pushFollow(FOLLOW_ruleCategory_in_entryRuleCategory121);
            ruleCategory();

            state._fsp--;

             after(grammarAccess.getCategoryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCategory128); 

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
    // $ANTLR end "entryRuleCategory"


    // $ANTLR start "ruleCategory"
    // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:97:1: ruleCategory : ( ( rule__Category__Group__0 ) ) ;
    public final void ruleCategory() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:101:2: ( ( ( rule__Category__Group__0 ) ) )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:102:1: ( ( rule__Category__Group__0 ) )
            {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:102:1: ( ( rule__Category__Group__0 ) )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:103:1: ( rule__Category__Group__0 )
            {
             before(grammarAccess.getCategoryAccess().getGroup()); 
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:104:1: ( rule__Category__Group__0 )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:104:2: rule__Category__Group__0
            {
            pushFollow(FOLLOW_rule__Category__Group__0_in_ruleCategory154);
            rule__Category__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCategoryAccess().getGroup()); 

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
    // $ANTLR end "ruleCategory"


    // $ANTLR start "entryRuleItem"
    // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:116:1: entryRuleItem : ruleItem EOF ;
    public final void entryRuleItem() throws RecognitionException {
        try {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:117:1: ( ruleItem EOF )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:118:1: ruleItem EOF
            {
             before(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_ruleItem_in_entryRuleItem181);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getItemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItem188); 

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
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:125:1: ruleItem : ( ( rule__Item__Group__0 ) ) ;
    public final void ruleItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:129:2: ( ( ( rule__Item__Group__0 ) ) )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:130:1: ( ( rule__Item__Group__0 ) )
            {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:130:1: ( ( rule__Item__Group__0 ) )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:131:1: ( rule__Item__Group__0 )
            {
             before(grammarAccess.getItemAccess().getGroup()); 
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:132:1: ( rule__Item__Group__0 )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:132:2: rule__Item__Group__0
            {
            pushFollow(FOLLOW_rule__Item__Group__0_in_ruleItem214);
            rule__Item__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getGroup()); 

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
    // $ANTLR end "ruleItem"


    // $ANTLR start "rule__Buyticket__Group__0"
    // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:146:1: rule__Buyticket__Group__0 : rule__Buyticket__Group__0__Impl rule__Buyticket__Group__1 ;
    public final void rule__Buyticket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:150:1: ( rule__Buyticket__Group__0__Impl rule__Buyticket__Group__1 )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:151:2: rule__Buyticket__Group__0__Impl rule__Buyticket__Group__1
            {
            pushFollow(FOLLOW_rule__Buyticket__Group__0__Impl_in_rule__Buyticket__Group__0248);
            rule__Buyticket__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Buyticket__Group__1_in_rule__Buyticket__Group__0251);
            rule__Buyticket__Group__1();

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
    // $ANTLR end "rule__Buyticket__Group__0"


    // $ANTLR start "rule__Buyticket__Group__0__Impl"
    // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:158:1: rule__Buyticket__Group__0__Impl : ( () ) ;
    public final void rule__Buyticket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:162:1: ( ( () ) )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:163:1: ( () )
            {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:163:1: ( () )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:164:1: ()
            {
             before(grammarAccess.getBuyticketAccess().getBuyticketAction_0()); 
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:165:1: ()
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:167:1: 
            {
            }

             after(grammarAccess.getBuyticketAccess().getBuyticketAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buyticket__Group__0__Impl"


    // $ANTLR start "rule__Buyticket__Group__1"
    // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:177:1: rule__Buyticket__Group__1 : rule__Buyticket__Group__1__Impl ;
    public final void rule__Buyticket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:181:1: ( rule__Buyticket__Group__1__Impl )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:182:2: rule__Buyticket__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Buyticket__Group__1__Impl_in_rule__Buyticket__Group__1309);
            rule__Buyticket__Group__1__Impl();

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
    // $ANTLR end "rule__Buyticket__Group__1"


    // $ANTLR start "rule__Buyticket__Group__1__Impl"
    // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:188:1: rule__Buyticket__Group__1__Impl : ( ( rule__Buyticket__CategoryAssignment_1 )* ) ;
    public final void rule__Buyticket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:192:1: ( ( ( rule__Buyticket__CategoryAssignment_1 )* ) )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:193:1: ( ( rule__Buyticket__CategoryAssignment_1 )* )
            {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:193:1: ( ( rule__Buyticket__CategoryAssignment_1 )* )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:194:1: ( rule__Buyticket__CategoryAssignment_1 )*
            {
             before(grammarAccess.getBuyticketAccess().getCategoryAssignment_1()); 
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:195:1: ( rule__Buyticket__CategoryAssignment_1 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:195:2: rule__Buyticket__CategoryAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Buyticket__CategoryAssignment_1_in_rule__Buyticket__Group__1__Impl336);
            	    rule__Buyticket__CategoryAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getBuyticketAccess().getCategoryAssignment_1()); 

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
    // $ANTLR end "rule__Buyticket__Group__1__Impl"


    // $ANTLR start "rule__Category__Group__0"
    // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:209:1: rule__Category__Group__0 : rule__Category__Group__0__Impl rule__Category__Group__1 ;
    public final void rule__Category__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:213:1: ( rule__Category__Group__0__Impl rule__Category__Group__1 )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:214:2: rule__Category__Group__0__Impl rule__Category__Group__1
            {
            pushFollow(FOLLOW_rule__Category__Group__0__Impl_in_rule__Category__Group__0371);
            rule__Category__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group__1_in_rule__Category__Group__0374);
            rule__Category__Group__1();

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
    // $ANTLR end "rule__Category__Group__0"


    // $ANTLR start "rule__Category__Group__0__Impl"
    // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:221:1: rule__Category__Group__0__Impl : ( 'category' ) ;
    public final void rule__Category__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:225:1: ( ( 'category' ) )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:226:1: ( 'category' )
            {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:226:1: ( 'category' )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:227:1: 'category'
            {
             before(grammarAccess.getCategoryAccess().getCategoryKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Category__Group__0__Impl402); 
             after(grammarAccess.getCategoryAccess().getCategoryKeyword_0()); 

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
    // $ANTLR end "rule__Category__Group__0__Impl"


    // $ANTLR start "rule__Category__Group__1"
    // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:240:1: rule__Category__Group__1 : rule__Category__Group__1__Impl rule__Category__Group__2 ;
    public final void rule__Category__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:244:1: ( rule__Category__Group__1__Impl rule__Category__Group__2 )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:245:2: rule__Category__Group__1__Impl rule__Category__Group__2
            {
            pushFollow(FOLLOW_rule__Category__Group__1__Impl_in_rule__Category__Group__1433);
            rule__Category__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group__2_in_rule__Category__Group__1436);
            rule__Category__Group__2();

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
    // $ANTLR end "rule__Category__Group__1"


    // $ANTLR start "rule__Category__Group__1__Impl"
    // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:252:1: rule__Category__Group__1__Impl : ( ( rule__Category__CategoryNameAssignment_1 ) ) ;
    public final void rule__Category__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:256:1: ( ( ( rule__Category__CategoryNameAssignment_1 ) ) )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:257:1: ( ( rule__Category__CategoryNameAssignment_1 ) )
            {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:257:1: ( ( rule__Category__CategoryNameAssignment_1 ) )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:258:1: ( rule__Category__CategoryNameAssignment_1 )
            {
             before(grammarAccess.getCategoryAccess().getCategoryNameAssignment_1()); 
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:259:1: ( rule__Category__CategoryNameAssignment_1 )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:259:2: rule__Category__CategoryNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Category__CategoryNameAssignment_1_in_rule__Category__Group__1__Impl463);
            rule__Category__CategoryNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCategoryAccess().getCategoryNameAssignment_1()); 

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
    // $ANTLR end "rule__Category__Group__1__Impl"


    // $ANTLR start "rule__Category__Group__2"
    // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:269:1: rule__Category__Group__2 : rule__Category__Group__2__Impl rule__Category__Group__3 ;
    public final void rule__Category__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:273:1: ( rule__Category__Group__2__Impl rule__Category__Group__3 )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:274:2: rule__Category__Group__2__Impl rule__Category__Group__3
            {
            pushFollow(FOLLOW_rule__Category__Group__2__Impl_in_rule__Category__Group__2493);
            rule__Category__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group__3_in_rule__Category__Group__2496);
            rule__Category__Group__3();

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
    // $ANTLR end "rule__Category__Group__2"


    // $ANTLR start "rule__Category__Group__2__Impl"
    // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:281:1: rule__Category__Group__2__Impl : ( ( rule__Category__Group_2__0 )* ) ;
    public final void rule__Category__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:285:1: ( ( ( rule__Category__Group_2__0 )* ) )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:286:1: ( ( rule__Category__Group_2__0 )* )
            {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:286:1: ( ( rule__Category__Group_2__0 )* )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:287:1: ( rule__Category__Group_2__0 )*
            {
             before(grammarAccess.getCategoryAccess().getGroup_2()); 
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:288:1: ( rule__Category__Group_2__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:288:2: rule__Category__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Category__Group_2__0_in_rule__Category__Group__2__Impl523);
            	    rule__Category__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getCategoryAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Category__Group__2__Impl"


    // $ANTLR start "rule__Category__Group__3"
    // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:298:1: rule__Category__Group__3 : rule__Category__Group__3__Impl ;
    public final void rule__Category__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:302:1: ( rule__Category__Group__3__Impl )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:303:2: rule__Category__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Category__Group__3__Impl_in_rule__Category__Group__3554);
            rule__Category__Group__3__Impl();

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
    // $ANTLR end "rule__Category__Group__3"


    // $ANTLR start "rule__Category__Group__3__Impl"
    // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:309:1: rule__Category__Group__3__Impl : ( 'end' ) ;
    public final void rule__Category__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:313:1: ( ( 'end' ) )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:314:1: ( 'end' )
            {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:314:1: ( 'end' )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:315:1: 'end'
            {
             before(grammarAccess.getCategoryAccess().getEndKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__Category__Group__3__Impl582); 
             after(grammarAccess.getCategoryAccess().getEndKeyword_3()); 

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
    // $ANTLR end "rule__Category__Group__3__Impl"


    // $ANTLR start "rule__Category__Group_2__0"
    // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:336:1: rule__Category__Group_2__0 : rule__Category__Group_2__0__Impl rule__Category__Group_2__1 ;
    public final void rule__Category__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:340:1: ( rule__Category__Group_2__0__Impl rule__Category__Group_2__1 )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:341:2: rule__Category__Group_2__0__Impl rule__Category__Group_2__1
            {
            pushFollow(FOLLOW_rule__Category__Group_2__0__Impl_in_rule__Category__Group_2__0621);
            rule__Category__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group_2__1_in_rule__Category__Group_2__0624);
            rule__Category__Group_2__1();

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
    // $ANTLR end "rule__Category__Group_2__0"


    // $ANTLR start "rule__Category__Group_2__0__Impl"
    // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:348:1: rule__Category__Group_2__0__Impl : ( '-' ) ;
    public final void rule__Category__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:352:1: ( ( '-' ) )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:353:1: ( '-' )
            {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:353:1: ( '-' )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:354:1: '-'
            {
             before(grammarAccess.getCategoryAccess().getHyphenMinusKeyword_2_0()); 
            match(input,13,FOLLOW_13_in_rule__Category__Group_2__0__Impl652); 
             after(grammarAccess.getCategoryAccess().getHyphenMinusKeyword_2_0()); 

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
    // $ANTLR end "rule__Category__Group_2__0__Impl"


    // $ANTLR start "rule__Category__Group_2__1"
    // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:367:1: rule__Category__Group_2__1 : rule__Category__Group_2__1__Impl ;
    public final void rule__Category__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:371:1: ( rule__Category__Group_2__1__Impl )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:372:2: rule__Category__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Category__Group_2__1__Impl_in_rule__Category__Group_2__1683);
            rule__Category__Group_2__1__Impl();

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
    // $ANTLR end "rule__Category__Group_2__1"


    // $ANTLR start "rule__Category__Group_2__1__Impl"
    // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:378:1: rule__Category__Group_2__1__Impl : ( ( rule__Category__ItemsAssignment_2_1 ) ) ;
    public final void rule__Category__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:382:1: ( ( ( rule__Category__ItemsAssignment_2_1 ) ) )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:383:1: ( ( rule__Category__ItemsAssignment_2_1 ) )
            {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:383:1: ( ( rule__Category__ItemsAssignment_2_1 ) )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:384:1: ( rule__Category__ItemsAssignment_2_1 )
            {
             before(grammarAccess.getCategoryAccess().getItemsAssignment_2_1()); 
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:385:1: ( rule__Category__ItemsAssignment_2_1 )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:385:2: rule__Category__ItemsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Category__ItemsAssignment_2_1_in_rule__Category__Group_2__1__Impl710);
            rule__Category__ItemsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCategoryAccess().getItemsAssignment_2_1()); 

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
    // $ANTLR end "rule__Category__Group_2__1__Impl"


    // $ANTLR start "rule__Item__Group__0"
    // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:399:1: rule__Item__Group__0 : rule__Item__Group__0__Impl rule__Item__Group__1 ;
    public final void rule__Item__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:403:1: ( rule__Item__Group__0__Impl rule__Item__Group__1 )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:404:2: rule__Item__Group__0__Impl rule__Item__Group__1
            {
            pushFollow(FOLLOW_rule__Item__Group__0__Impl_in_rule__Item__Group__0744);
            rule__Item__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Item__Group__1_in_rule__Item__Group__0747);
            rule__Item__Group__1();

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
    // $ANTLR end "rule__Item__Group__0"


    // $ANTLR start "rule__Item__Group__0__Impl"
    // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:411:1: rule__Item__Group__0__Impl : ( ( rule__Item__ItemNameAssignment_0 ) ) ;
    public final void rule__Item__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:415:1: ( ( ( rule__Item__ItemNameAssignment_0 ) ) )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:416:1: ( ( rule__Item__ItemNameAssignment_0 ) )
            {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:416:1: ( ( rule__Item__ItemNameAssignment_0 ) )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:417:1: ( rule__Item__ItemNameAssignment_0 )
            {
             before(grammarAccess.getItemAccess().getItemNameAssignment_0()); 
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:418:1: ( rule__Item__ItemNameAssignment_0 )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:418:2: rule__Item__ItemNameAssignment_0
            {
            pushFollow(FOLLOW_rule__Item__ItemNameAssignment_0_in_rule__Item__Group__0__Impl774);
            rule__Item__ItemNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getItemNameAssignment_0()); 

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
    // $ANTLR end "rule__Item__Group__0__Impl"


    // $ANTLR start "rule__Item__Group__1"
    // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:428:1: rule__Item__Group__1 : rule__Item__Group__1__Impl ;
    public final void rule__Item__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:432:1: ( rule__Item__Group__1__Impl )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:433:2: rule__Item__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Item__Group__1__Impl_in_rule__Item__Group__1804);
            rule__Item__Group__1__Impl();

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
    // $ANTLR end "rule__Item__Group__1"


    // $ANTLR start "rule__Item__Group__1__Impl"
    // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:439:1: rule__Item__Group__1__Impl : ( ( rule__Item__PriceAssignment_1 ) ) ;
    public final void rule__Item__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:443:1: ( ( ( rule__Item__PriceAssignment_1 ) ) )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:444:1: ( ( rule__Item__PriceAssignment_1 ) )
            {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:444:1: ( ( rule__Item__PriceAssignment_1 ) )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:445:1: ( rule__Item__PriceAssignment_1 )
            {
             before(grammarAccess.getItemAccess().getPriceAssignment_1()); 
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:446:1: ( rule__Item__PriceAssignment_1 )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:446:2: rule__Item__PriceAssignment_1
            {
            pushFollow(FOLLOW_rule__Item__PriceAssignment_1_in_rule__Item__Group__1__Impl831);
            rule__Item__PriceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getPriceAssignment_1()); 

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
    // $ANTLR end "rule__Item__Group__1__Impl"


    // $ANTLR start "rule__Buyticket__CategoryAssignment_1"
    // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:461:1: rule__Buyticket__CategoryAssignment_1 : ( ruleCategory ) ;
    public final void rule__Buyticket__CategoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:465:1: ( ( ruleCategory ) )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:466:1: ( ruleCategory )
            {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:466:1: ( ruleCategory )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:467:1: ruleCategory
            {
             before(grammarAccess.getBuyticketAccess().getCategoryCategoryParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCategory_in_rule__Buyticket__CategoryAssignment_1870);
            ruleCategory();

            state._fsp--;

             after(grammarAccess.getBuyticketAccess().getCategoryCategoryParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Buyticket__CategoryAssignment_1"


    // $ANTLR start "rule__Category__CategoryNameAssignment_1"
    // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:476:1: rule__Category__CategoryNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Category__CategoryNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:480:1: ( ( RULE_ID ) )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:481:1: ( RULE_ID )
            {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:481:1: ( RULE_ID )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:482:1: RULE_ID
            {
             before(grammarAccess.getCategoryAccess().getCategoryNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Category__CategoryNameAssignment_1901); 
             after(grammarAccess.getCategoryAccess().getCategoryNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Category__CategoryNameAssignment_1"


    // $ANTLR start "rule__Category__ItemsAssignment_2_1"
    // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:491:1: rule__Category__ItemsAssignment_2_1 : ( ruleItem ) ;
    public final void rule__Category__ItemsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:495:1: ( ( ruleItem ) )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:496:1: ( ruleItem )
            {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:496:1: ( ruleItem )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:497:1: ruleItem
            {
             before(grammarAccess.getCategoryAccess().getItemsItemParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleItem_in_rule__Category__ItemsAssignment_2_1932);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getCategoryAccess().getItemsItemParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Category__ItemsAssignment_2_1"


    // $ANTLR start "rule__Item__ItemNameAssignment_0"
    // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:506:1: rule__Item__ItemNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Item__ItemNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:510:1: ( ( RULE_ID ) )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:511:1: ( RULE_ID )
            {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:511:1: ( RULE_ID )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:512:1: RULE_ID
            {
             before(grammarAccess.getItemAccess().getItemNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Item__ItemNameAssignment_0963); 
             after(grammarAccess.getItemAccess().getItemNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Item__ItemNameAssignment_0"


    // $ANTLR start "rule__Item__PriceAssignment_1"
    // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:521:1: rule__Item__PriceAssignment_1 : ( RULE_INT ) ;
    public final void rule__Item__PriceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:525:1: ( ( RULE_INT ) )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:526:1: ( RULE_INT )
            {
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:526:1: ( RULE_INT )
            // ../org.xtext.assignment1.einKauflist.ui/src-gen/org/xtext/assignment1/ui/contentassist/antlr/internal/InternalEinKauflist.g:527:1: RULE_INT
            {
             before(grammarAccess.getItemAccess().getPriceINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Item__PriceAssignment_1994); 
             after(grammarAccess.getItemAccess().getPriceINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Item__PriceAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleBuyticket_in_entryRuleBuyticket61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuyticket68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Buyticket__Group__0_in_ruleBuyticket94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCategory_in_entryRuleCategory121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCategory128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group__0_in_ruleCategory154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_entryRuleItem181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItem188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group__0_in_ruleItem214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Buyticket__Group__0__Impl_in_rule__Buyticket__Group__0248 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Buyticket__Group__1_in_rule__Buyticket__Group__0251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Buyticket__Group__1__Impl_in_rule__Buyticket__Group__1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Buyticket__CategoryAssignment_1_in_rule__Buyticket__Group__1__Impl336 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__Category__Group__0__Impl_in_rule__Category__Group__0371 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Category__Group__1_in_rule__Category__Group__0374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Category__Group__0__Impl402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group__1__Impl_in_rule__Category__Group__1433 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__Category__Group__2_in_rule__Category__Group__1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__CategoryNameAssignment_1_in_rule__Category__Group__1__Impl463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group__2__Impl_in_rule__Category__Group__2493 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__Category__Group__3_in_rule__Category__Group__2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_2__0_in_rule__Category__Group__2__Impl523 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Category__Group__3__Impl_in_rule__Category__Group__3554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Category__Group__3__Impl582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_2__0__Impl_in_rule__Category__Group_2__0621 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Category__Group_2__1_in_rule__Category__Group_2__0624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Category__Group_2__0__Impl652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_2__1__Impl_in_rule__Category__Group_2__1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__ItemsAssignment_2_1_in_rule__Category__Group_2__1__Impl710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group__0__Impl_in_rule__Item__Group__0744 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Item__Group__1_in_rule__Item__Group__0747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__ItemNameAssignment_0_in_rule__Item__Group__0__Impl774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group__1__Impl_in_rule__Item__Group__1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__PriceAssignment_1_in_rule__Item__Group__1__Impl831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCategory_in_rule__Buyticket__CategoryAssignment_1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Category__CategoryNameAssignment_1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_rule__Category__ItemsAssignment_2_1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Item__ItemNameAssignment_0963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Item__PriceAssignment_1994 = new BitSet(new long[]{0x0000000000000002L});

}