package org.xtext.assignment1.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.assignment1.services.EinKauflistGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEinKauflistParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'category'", "'-'", "'end'"
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
    public String getGrammarFileName() { return "../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g"; }



     	private EinKauflistGrammarAccess grammarAccess;
     	
        public InternalEinKauflistParser(TokenStream input, EinKauflistGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Buyticket";	
       	}
       	
       	@Override
       	protected EinKauflistGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleBuyticket"
    // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:67:1: entryRuleBuyticket returns [EObject current=null] : iv_ruleBuyticket= ruleBuyticket EOF ;
    public final EObject entryRuleBuyticket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuyticket = null;


        try {
            // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:68:2: (iv_ruleBuyticket= ruleBuyticket EOF )
            // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:69:2: iv_ruleBuyticket= ruleBuyticket EOF
            {
             newCompositeNode(grammarAccess.getBuyticketRule()); 
            pushFollow(FOLLOW_ruleBuyticket_in_entryRuleBuyticket75);
            iv_ruleBuyticket=ruleBuyticket();

            state._fsp--;

             current =iv_ruleBuyticket; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuyticket85); 

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
    // $ANTLR end "entryRuleBuyticket"


    // $ANTLR start "ruleBuyticket"
    // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:76:1: ruleBuyticket returns [EObject current=null] : ( () ( (lv_category_1_0= ruleCategory ) )* ) ;
    public final EObject ruleBuyticket() throws RecognitionException {
        EObject current = null;

        EObject lv_category_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:79:28: ( ( () ( (lv_category_1_0= ruleCategory ) )* ) )
            // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:80:1: ( () ( (lv_category_1_0= ruleCategory ) )* )
            {
            // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:80:1: ( () ( (lv_category_1_0= ruleCategory ) )* )
            // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:80:2: () ( (lv_category_1_0= ruleCategory ) )*
            {
            // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:80:2: ()
            // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBuyticketAccess().getBuyticketAction_0(),
                        current);
                

            }

            // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:86:2: ( (lv_category_1_0= ruleCategory ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:87:1: (lv_category_1_0= ruleCategory )
            	    {
            	    // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:87:1: (lv_category_1_0= ruleCategory )
            	    // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:88:3: lv_category_1_0= ruleCategory
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBuyticketAccess().getCategoryCategoryParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCategory_in_ruleBuyticket140);
            	    lv_category_1_0=ruleCategory();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBuyticketRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"category",
            	            		lv_category_1_0, 
            	            		"Category");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleBuyticket"


    // $ANTLR start "entryRuleCategory"
    // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:112:1: entryRuleCategory returns [EObject current=null] : iv_ruleCategory= ruleCategory EOF ;
    public final EObject entryRuleCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategory = null;


        try {
            // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:113:2: (iv_ruleCategory= ruleCategory EOF )
            // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:114:2: iv_ruleCategory= ruleCategory EOF
            {
             newCompositeNode(grammarAccess.getCategoryRule()); 
            pushFollow(FOLLOW_ruleCategory_in_entryRuleCategory177);
            iv_ruleCategory=ruleCategory();

            state._fsp--;

             current =iv_ruleCategory; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCategory187); 

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
    // $ANTLR end "entryRuleCategory"


    // $ANTLR start "ruleCategory"
    // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:121:1: ruleCategory returns [EObject current=null] : (otherlv_0= 'category' ( (lv_categoryName_1_0= RULE_ID ) ) (otherlv_2= '-' ( (lv_items_3_0= ruleItem ) ) )* otherlv_4= 'end' ) ;
    public final EObject ruleCategory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_categoryName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_items_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:124:28: ( (otherlv_0= 'category' ( (lv_categoryName_1_0= RULE_ID ) ) (otherlv_2= '-' ( (lv_items_3_0= ruleItem ) ) )* otherlv_4= 'end' ) )
            // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:125:1: (otherlv_0= 'category' ( (lv_categoryName_1_0= RULE_ID ) ) (otherlv_2= '-' ( (lv_items_3_0= ruleItem ) ) )* otherlv_4= 'end' )
            {
            // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:125:1: (otherlv_0= 'category' ( (lv_categoryName_1_0= RULE_ID ) ) (otherlv_2= '-' ( (lv_items_3_0= ruleItem ) ) )* otherlv_4= 'end' )
            // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:125:3: otherlv_0= 'category' ( (lv_categoryName_1_0= RULE_ID ) ) (otherlv_2= '-' ( (lv_items_3_0= ruleItem ) ) )* otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleCategory224); 

                	newLeafNode(otherlv_0, grammarAccess.getCategoryAccess().getCategoryKeyword_0());
                
            // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:129:1: ( (lv_categoryName_1_0= RULE_ID ) )
            // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:130:1: (lv_categoryName_1_0= RULE_ID )
            {
            // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:130:1: (lv_categoryName_1_0= RULE_ID )
            // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:131:3: lv_categoryName_1_0= RULE_ID
            {
            lv_categoryName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCategory241); 

            			newLeafNode(lv_categoryName_1_0, grammarAccess.getCategoryAccess().getCategoryNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCategoryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"categoryName",
                    		lv_categoryName_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:147:2: (otherlv_2= '-' ( (lv_items_3_0= ruleItem ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:147:4: otherlv_2= '-' ( (lv_items_3_0= ruleItem ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleCategory259); 

            	        	newLeafNode(otherlv_2, grammarAccess.getCategoryAccess().getHyphenMinusKeyword_2_0());
            	        
            	    // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:151:1: ( (lv_items_3_0= ruleItem ) )
            	    // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:152:1: (lv_items_3_0= ruleItem )
            	    {
            	    // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:152:1: (lv_items_3_0= ruleItem )
            	    // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:153:3: lv_items_3_0= ruleItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCategoryAccess().getItemsItemParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleItem_in_ruleCategory280);
            	    lv_items_3_0=ruleItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCategoryRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"items",
            	            		lv_items_3_0, 
            	            		"Item");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleCategory294); 

                	newLeafNode(otherlv_4, grammarAccess.getCategoryAccess().getEndKeyword_3());
                

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
    // $ANTLR end "ruleCategory"


    // $ANTLR start "entryRuleItem"
    // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:181:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:182:2: (iv_ruleItem= ruleItem EOF )
            // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:183:2: iv_ruleItem= ruleItem EOF
            {
             newCompositeNode(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_ruleItem_in_entryRuleItem330);
            iv_ruleItem=ruleItem();

            state._fsp--;

             current =iv_ruleItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItem340); 

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
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:190:1: ruleItem returns [EObject current=null] : ( ( (lv_itemName_0_0= RULE_ID ) ) ( (lv_price_1_0= RULE_INT ) ) ) ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        Token lv_itemName_0_0=null;
        Token lv_price_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:193:28: ( ( ( (lv_itemName_0_0= RULE_ID ) ) ( (lv_price_1_0= RULE_INT ) ) ) )
            // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:194:1: ( ( (lv_itemName_0_0= RULE_ID ) ) ( (lv_price_1_0= RULE_INT ) ) )
            {
            // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:194:1: ( ( (lv_itemName_0_0= RULE_ID ) ) ( (lv_price_1_0= RULE_INT ) ) )
            // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:194:2: ( (lv_itemName_0_0= RULE_ID ) ) ( (lv_price_1_0= RULE_INT ) )
            {
            // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:194:2: ( (lv_itemName_0_0= RULE_ID ) )
            // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:195:1: (lv_itemName_0_0= RULE_ID )
            {
            // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:195:1: (lv_itemName_0_0= RULE_ID )
            // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:196:3: lv_itemName_0_0= RULE_ID
            {
            lv_itemName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleItem382); 

            			newLeafNode(lv_itemName_0_0, grammarAccess.getItemAccess().getItemNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getItemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"itemName",
                    		lv_itemName_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:212:2: ( (lv_price_1_0= RULE_INT ) )
            // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:213:1: (lv_price_1_0= RULE_INT )
            {
            // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:213:1: (lv_price_1_0= RULE_INT )
            // ../org.xtext.assignment1.einKauflist/src-gen/org/xtext/assignment1/parser/antlr/internal/InternalEinKauflist.g:214:3: lv_price_1_0= RULE_INT
            {
            lv_price_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleItem404); 

            			newLeafNode(lv_price_1_0, grammarAccess.getItemAccess().getPriceINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getItemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"price",
                    		lv_price_1_0, 
                    		"INT");
            	    

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
    // $ANTLR end "ruleItem"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleBuyticket_in_entryRuleBuyticket75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuyticket85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCategory_in_ruleBuyticket140 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleCategory_in_entryRuleCategory177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCategory187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleCategory224 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCategory241 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleCategory259 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleItem_in_ruleCategory280 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_13_in_ruleCategory294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_entryRuleItem330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItem340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleItem382 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleItem404 = new BitSet(new long[]{0x0000000000000002L});

}