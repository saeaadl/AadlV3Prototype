package org.osate.xtext.emv3.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.osate.xtext.emv3.services.Emv3GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEmv3Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'emv3'", "'Type'", "'for'", "'{'", "'}'", "'propagation'", "'::'", "'.'"
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
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalEmv3Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEmv3Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEmv3Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalEmv3.g"; }



     	private Emv3GrammarAccess grammarAccess;

        public InternalEmv3Parser(TokenStream input, Emv3GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "PackageEMV3";
       	}

       	@Override
       	protected Emv3GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePackageEMV3"
    // InternalEmv3.g:64:1: entryRulePackageEMV3 returns [EObject current=null] : iv_rulePackageEMV3= rulePackageEMV3 EOF ;
    public final EObject entryRulePackageEMV3() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageEMV3 = null;


        try {
            // InternalEmv3.g:64:52: (iv_rulePackageEMV3= rulePackageEMV3 EOF )
            // InternalEmv3.g:65:2: iv_rulePackageEMV3= rulePackageEMV3 EOF
            {
             newCompositeNode(grammarAccess.getPackageEMV3Rule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackageEMV3=rulePackageEMV3();

            state._fsp--;

             current =iv_rulePackageEMV3; 
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
    // $ANTLR end "entryRulePackageEMV3"


    // $ANTLR start "rulePackageEMV3"
    // InternalEmv3.g:71:1: rulePackageEMV3 returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'emv3' ( ( (lv_elements_3_0= ruleSubclause ) )+ | ( (lv_elements_4_0= ruleErrorType ) )+ ) ) ;
    public final EObject rulePackageEMV3() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_3_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalEmv3.g:77:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'emv3' ( ( (lv_elements_3_0= ruleSubclause ) )+ | ( (lv_elements_4_0= ruleErrorType ) )+ ) ) )
            // InternalEmv3.g:78:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'emv3' ( ( (lv_elements_3_0= ruleSubclause ) )+ | ( (lv_elements_4_0= ruleErrorType ) )+ ) )
            {
            // InternalEmv3.g:78:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'emv3' ( ( (lv_elements_3_0= ruleSubclause ) )+ | ( (lv_elements_4_0= ruleErrorType ) )+ ) )
            // InternalEmv3.g:79:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'emv3' ( ( (lv_elements_3_0= ruleSubclause ) )+ | ( (lv_elements_4_0= ruleErrorType ) )+ )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageEMV3Access().getPackageKeyword_0());
            		
            // InternalEmv3.g:83:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalEmv3.g:84:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalEmv3.g:84:4: (lv_name_1_0= ruleQualifiedName )
            // InternalEmv3.g:85:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getPackageEMV3Access().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackageEMV3Rule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.osate.xtext.emv3.Emv3.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageEMV3Access().getEmv3Keyword_2());
            		
            // InternalEmv3.g:106:3: ( ( (lv_elements_3_0= ruleSubclause ) )+ | ( (lv_elements_4_0= ruleErrorType ) )+ )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalEmv3.g:107:4: ( (lv_elements_3_0= ruleSubclause ) )+
                    {
                    // InternalEmv3.g:107:4: ( (lv_elements_3_0= ruleSubclause ) )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalEmv3.g:108:5: (lv_elements_3_0= ruleSubclause )
                    	    {
                    	    // InternalEmv3.g:108:5: (lv_elements_3_0= ruleSubclause )
                    	    // InternalEmv3.g:109:6: lv_elements_3_0= ruleSubclause
                    	    {

                    	    						newCompositeNode(grammarAccess.getPackageEMV3Access().getElementsSubclauseParserRuleCall_3_0_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_3_0=ruleSubclause();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPackageEMV3Rule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"elements",
                    	    							lv_elements_3_0,
                    	    							"org.osate.xtext.emv3.Emv3.Subclause");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalEmv3.g:127:4: ( (lv_elements_4_0= ruleErrorType ) )+
                    {
                    // InternalEmv3.g:127:4: ( (lv_elements_4_0= ruleErrorType ) )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==13) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalEmv3.g:128:5: (lv_elements_4_0= ruleErrorType )
                    	    {
                    	    // InternalEmv3.g:128:5: (lv_elements_4_0= ruleErrorType )
                    	    // InternalEmv3.g:129:6: lv_elements_4_0= ruleErrorType
                    	    {

                    	    						newCompositeNode(grammarAccess.getPackageEMV3Access().getElementsErrorTypeParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_elements_4_0=ruleErrorType();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPackageEMV3Rule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"elements",
                    	    							lv_elements_4_0,
                    	    							"org.osate.xtext.emv3.Emv3.ErrorType");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    }
                    break;

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
    // $ANTLR end "rulePackageEMV3"


    // $ANTLR start "entryRuleErrorType"
    // InternalEmv3.g:151:1: entryRuleErrorType returns [EObject current=null] : iv_ruleErrorType= ruleErrorType EOF ;
    public final EObject entryRuleErrorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleErrorType = null;


        try {
            // InternalEmv3.g:151:50: (iv_ruleErrorType= ruleErrorType EOF )
            // InternalEmv3.g:152:2: iv_ruleErrorType= ruleErrorType EOF
            {
             newCompositeNode(grammarAccess.getErrorTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleErrorType=ruleErrorType();

            state._fsp--;

             current =iv_ruleErrorType; 
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
    // $ANTLR end "entryRuleErrorType"


    // $ANTLR start "ruleErrorType"
    // InternalEmv3.g:158:1: ruleErrorType returns [EObject current=null] : ( () otherlv_1= 'Type' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleErrorType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalEmv3.g:164:2: ( ( () otherlv_1= 'Type' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalEmv3.g:165:2: ( () otherlv_1= 'Type' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalEmv3.g:165:2: ( () otherlv_1= 'Type' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalEmv3.g:166:3: () otherlv_1= 'Type' ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalEmv3.g:166:3: ()
            // InternalEmv3.g:167:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getErrorTypeAccess().getErrorTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getErrorTypeAccess().getTypeKeyword_1());
            		
            // InternalEmv3.g:177:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalEmv3.g:178:4: (lv_name_2_0= RULE_ID )
            {
            // InternalEmv3.g:178:4: (lv_name_2_0= RULE_ID )
            // InternalEmv3.g:179:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getErrorTypeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getErrorTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleErrorType"


    // $ANTLR start "entryRuleSubclause"
    // InternalEmv3.g:199:1: entryRuleSubclause returns [EObject current=null] : iv_ruleSubclause= ruleSubclause EOF ;
    public final EObject entryRuleSubclause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubclause = null;


        try {
            // InternalEmv3.g:199:50: (iv_ruleSubclause= ruleSubclause EOF )
            // InternalEmv3.g:200:2: iv_ruleSubclause= ruleSubclause EOF
            {
             newCompositeNode(grammarAccess.getSubclauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubclause=ruleSubclause();

            state._fsp--;

             current =iv_ruleSubclause; 
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
    // $ANTLR end "entryRuleSubclause"


    // $ANTLR start "ruleSubclause"
    // InternalEmv3.g:206:1: ruleSubclause returns [EObject current=null] : ( () otherlv_1= 'for' ( (lv_name_2_0= ruleClassifierName ) ) otherlv_3= '{' ( (lv_emv3statement_4_0= ruleErrorPropagation ) ) otherlv_5= '}' ) ;
    public final EObject ruleSubclause() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_emv3statement_4_0 = null;



        	enterRule();

        try {
            // InternalEmv3.g:212:2: ( ( () otherlv_1= 'for' ( (lv_name_2_0= ruleClassifierName ) ) otherlv_3= '{' ( (lv_emv3statement_4_0= ruleErrorPropagation ) ) otherlv_5= '}' ) )
            // InternalEmv3.g:213:2: ( () otherlv_1= 'for' ( (lv_name_2_0= ruleClassifierName ) ) otherlv_3= '{' ( (lv_emv3statement_4_0= ruleErrorPropagation ) ) otherlv_5= '}' )
            {
            // InternalEmv3.g:213:2: ( () otherlv_1= 'for' ( (lv_name_2_0= ruleClassifierName ) ) otherlv_3= '{' ( (lv_emv3statement_4_0= ruleErrorPropagation ) ) otherlv_5= '}' )
            // InternalEmv3.g:214:3: () otherlv_1= 'for' ( (lv_name_2_0= ruleClassifierName ) ) otherlv_3= '{' ( (lv_emv3statement_4_0= ruleErrorPropagation ) ) otherlv_5= '}'
            {
            // InternalEmv3.g:214:3: ()
            // InternalEmv3.g:215:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSubclauseAccess().getEmv3SubclauseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSubclauseAccess().getForKeyword_1());
            		
            // InternalEmv3.g:225:3: ( (lv_name_2_0= ruleClassifierName ) )
            // InternalEmv3.g:226:4: (lv_name_2_0= ruleClassifierName )
            {
            // InternalEmv3.g:226:4: (lv_name_2_0= ruleClassifierName )
            // InternalEmv3.g:227:5: lv_name_2_0= ruleClassifierName
            {

            					newCompositeNode(grammarAccess.getSubclauseAccess().getNameClassifierNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_2_0=ruleClassifierName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubclauseRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.osate.xtext.emv3.Emv3.ClassifierName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getSubclauseAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEmv3.g:248:3: ( (lv_emv3statement_4_0= ruleErrorPropagation ) )
            // InternalEmv3.g:249:4: (lv_emv3statement_4_0= ruleErrorPropagation )
            {
            // InternalEmv3.g:249:4: (lv_emv3statement_4_0= ruleErrorPropagation )
            // InternalEmv3.g:250:5: lv_emv3statement_4_0= ruleErrorPropagation
            {

            					newCompositeNode(grammarAccess.getSubclauseAccess().getEmv3statementErrorPropagationParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_emv3statement_4_0=ruleErrorPropagation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubclauseRule());
            					}
            					add(
            						current,
            						"emv3statement",
            						lv_emv3statement_4_0,
            						"org.osate.xtext.emv3.Emv3.ErrorPropagation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSubclauseAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleSubclause"


    // $ANTLR start "entryRuleErrorPropagation"
    // InternalEmv3.g:275:1: entryRuleErrorPropagation returns [EObject current=null] : iv_ruleErrorPropagation= ruleErrorPropagation EOF ;
    public final EObject entryRuleErrorPropagation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleErrorPropagation = null;


        try {
            // InternalEmv3.g:275:57: (iv_ruleErrorPropagation= ruleErrorPropagation EOF )
            // InternalEmv3.g:276:2: iv_ruleErrorPropagation= ruleErrorPropagation EOF
            {
             newCompositeNode(grammarAccess.getErrorPropagationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleErrorPropagation=ruleErrorPropagation();

            state._fsp--;

             current =iv_ruleErrorPropagation; 
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
    // $ANTLR end "entryRuleErrorPropagation"


    // $ANTLR start "ruleErrorPropagation"
    // InternalEmv3.g:282:1: ruleErrorPropagation returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'propagation' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleErrorPropagation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalEmv3.g:288:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'propagation' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalEmv3.g:289:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'propagation' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalEmv3.g:289:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'propagation' ( (otherlv_2= RULE_ID ) ) )
            // InternalEmv3.g:290:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'propagation' ( (otherlv_2= RULE_ID ) )
            {
            // InternalEmv3.g:290:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalEmv3.g:291:4: (lv_name_0_0= RULE_ID )
            {
            // InternalEmv3.g:291:4: (lv_name_0_0= RULE_ID )
            // InternalEmv3.g:292:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_0_0, grammarAccess.getErrorPropagationAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getErrorPropagationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getErrorPropagationAccess().getPropagationKeyword_1());
            		
            // InternalEmv3.g:312:3: ( (otherlv_2= RULE_ID ) )
            // InternalEmv3.g:313:4: (otherlv_2= RULE_ID )
            {
            // InternalEmv3.g:313:4: (otherlv_2= RULE_ID )
            // InternalEmv3.g:314:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getErrorPropagationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getErrorPropagationAccess().getTypeErrorTypeCrossReference_2_0());
            				

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
    // $ANTLR end "ruleErrorPropagation"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalEmv3.g:329:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalEmv3.g:329:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalEmv3.g:330:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalEmv3.g:336:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalEmv3.g:342:2: ( (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* ) )
            // InternalEmv3.g:343:2: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* )
            {
            // InternalEmv3.g:343:2: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* )
            // InternalEmv3.g:344:3: this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalEmv3.g:351:3: (kw= '::' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEmv3.g:352:4: kw= '::' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,18,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleClassifierName"
    // InternalEmv3.g:369:1: entryRuleClassifierName returns [String current=null] : iv_ruleClassifierName= ruleClassifierName EOF ;
    public final String entryRuleClassifierName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassifierName = null;


        try {
            // InternalEmv3.g:369:54: (iv_ruleClassifierName= ruleClassifierName EOF )
            // InternalEmv3.g:370:2: iv_ruleClassifierName= ruleClassifierName EOF
            {
             newCompositeNode(grammarAccess.getClassifierNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassifierName=ruleClassifierName();

            state._fsp--;

             current =iv_ruleClassifierName.getText(); 
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
    // $ANTLR end "entryRuleClassifierName"


    // $ANTLR start "ruleClassifierName"
    // InternalEmv3.g:376:1: ruleClassifierName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleClassifierName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalEmv3.g:382:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) )
            // InternalEmv3.g:383:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            {
            // InternalEmv3.g:383:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            // InternalEmv3.g:384:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getClassifierNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalEmv3.g:391:3: (kw= '.' this_ID_2= RULE_ID )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEmv3.g:392:4: kw= '.' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,19,FOLLOW_3); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getClassifierNameAccess().getFullStopKeyword_1_0());
                    			
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    				current.merge(this_ID_2);
                    			

                    				newLeafNode(this_ID_2, grammarAccess.getClassifierNameAccess().getIDTerminalRuleCall_1_1());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleClassifierName"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080002L});

}