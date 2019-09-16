package org.osate.xtext.aadlv3.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.osate.xtext.aadlv3.services.AadlV3GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
/**
 * Copyright 2018 Carnegie Mellon University. All Rights Reserved.
 * 
 * NO WARRANTY. THIS CARNEGIE MELLON UNIVERSITY AND SOFTWARE ENGINEERING INSTITUTE
 * MATERIAL IS FURNISHED ON AN AS-IS BASIS. CARNEGIE MELLON UNIVERSITY MAKES NO
 * WARRANTIES OF ANY KIND, EITHER EXPRESSED OR IMPLIED, AS TO ANY MATTER INCLUDING,
 * BUT NOT LIMITED TO, WARRANTY OF FITNESS FOR PURPOSE OR MERCHANTABILITY,
 * EXCLUSIVITY, OR RESULTS OBTAINED FROM USE OF THE MATERIAL. CARNEGIE MELLON
 * UNIVERSITY DOES NOT MAKE ANY WARRANTY OF ANY KIND WITH RESPECT TO FREEDOM FROM
 * PATENT, TRADEMARK, OR COPYRIGHT INFRINGEMENT.
 *
 * Released under the Eclipse Public License (http://www.eclipse.org/org/documents/epl-v10.php)
 * 
 * See COPYRIGHT file for full details.
 */
@SuppressWarnings("all")
public class InternalAadlV3Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ANNEXTEXT", "RULE_INT", "RULE_DOUBLE", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'private'", "'package'", "'is'", "'end'", "';'", "'@'", "'{'", "'}'", "'property'", "':'", "'for'", "'('", "'all'", "','", "')'", "'properties'", "'type'", "'extends'", "'constant'", "'#'", "'=>'", "'='", "'*=>'", "'.'", "'interface'", "'configuration'", "'->'", "'<->'", "'use'", "'flow'", "'import'", "'as'", "'reverse'", "'enum'", "'of'", "'workingset'", "'EM'", "'BA'", "'states'", "'error'", "'recover'", "'repair'", "'event'", "'-['", "']->'", "'true'", "'false'", "'::*'", "'::'", "'abstract'", "'bus'", "'data'", "'device'", "'memory'", "'process'", "'processor'", "'system'", "'thread'", "'subprogram'", "'feature'", "'port'", "'parameter'", "'binding'", "'in'", "'out'", "'requires'", "'provides'", "'list'", "'set'", "'boolean'", "'integer'", "'real'", "'string'", "'any'", "'oneof'", "'ormore'", "'orless'", "'satisfies'", "'?'", "'connection'", "'virtual'", "'group'", "'source'", "'sink'", "'access'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ANNEXTEXT=5;
    public static final int RULE_DOUBLE=7;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalAadlV3Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAadlV3Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAadlV3Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalAadlV3.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private AadlV3GrammarAccess grammarAccess;

        public InternalAadlV3Parser(TokenStream input, AadlV3GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "PackageDeclaration";
       	}

       	@Override
       	protected AadlV3GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePackageDeclaration"
    // InternalAadlV3.g:82:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // InternalAadlV3.g:82:59: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // InternalAadlV3.g:83:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePackageDeclaration=rulePackageDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackageDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // InternalAadlV3.g:89:1: rulePackageDeclaration returns [EObject current=null] : ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'is' ( ( (lv_elements_4_0= ruleAnnexLibrary ) ) | ( ( (lv_imports_5_0= ruleImport ) ) | ( (lv_elements_6_0= rulePackageElement ) ) )* ) otherlv_7= 'end' otherlv_8= ';' ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_private_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_elements_4_0 = null;

        EObject lv_imports_5_0 = null;

        EObject lv_elements_6_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:95:2: ( ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'is' ( ( (lv_elements_4_0= ruleAnnexLibrary ) ) | ( ( (lv_imports_5_0= ruleImport ) ) | ( (lv_elements_6_0= rulePackageElement ) ) )* ) otherlv_7= 'end' otherlv_8= ';' ) )
            // InternalAadlV3.g:96:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'is' ( ( (lv_elements_4_0= ruleAnnexLibrary ) ) | ( ( (lv_imports_5_0= ruleImport ) ) | ( (lv_elements_6_0= rulePackageElement ) ) )* ) otherlv_7= 'end' otherlv_8= ';' )
            {
            // InternalAadlV3.g:96:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'is' ( ( (lv_elements_4_0= ruleAnnexLibrary ) ) | ( ( (lv_imports_5_0= ruleImport ) ) | ( (lv_elements_6_0= rulePackageElement ) ) )* ) otherlv_7= 'end' otherlv_8= ';' )
            // InternalAadlV3.g:97:3: ( (lv_private_0_0= 'private' ) )? otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'is' ( ( (lv_elements_4_0= ruleAnnexLibrary ) ) | ( ( (lv_imports_5_0= ruleImport ) ) | ( (lv_elements_6_0= rulePackageElement ) ) )* ) otherlv_7= 'end' otherlv_8= ';'
            {
            // InternalAadlV3.g:97:3: ( (lv_private_0_0= 'private' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalAadlV3.g:98:4: (lv_private_0_0= 'private' )
                    {
                    // InternalAadlV3.g:98:4: (lv_private_0_0= 'private' )
                    // InternalAadlV3.g:99:5: lv_private_0_0= 'private'
                    {
                    lv_private_0_0=(Token)match(input,13,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_private_0_0, grammarAccess.getPackageDeclarationAccess().getPrivatePrivateKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPackageDeclarationRule());
                      					}
                      					setWithLastConsumed(current, "private", true, "private");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,14,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_1());
              		
            }
            // InternalAadlV3.g:115:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalAadlV3.g:116:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalAadlV3.g:116:4: (lv_name_2_0= ruleQualifiedName )
            // InternalAadlV3.g:117:5: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.osate.xtext.aadlv3.AadlV3.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getPackageDeclarationAccess().getIsKeyword_3());
              		
            }
            // InternalAadlV3.g:138:3: ( ( (lv_elements_4_0= ruleAnnexLibrary ) ) | ( ( (lv_imports_5_0= ruleImport ) ) | ( (lv_elements_6_0= rulePackageElement ) ) )* )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=13 && LA3_0<=14)||LA3_0==16||LA3_0==21||(LA3_0>=28 && LA3_0<=29)||LA3_0==31||(LA3_0>=37 && LA3_0<=38)||LA3_0==43||LA3_0==48||(LA3_0>=62 && LA3_0<=71)||LA3_0==93) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalAadlV3.g:139:4: ( (lv_elements_4_0= ruleAnnexLibrary ) )
                    {
                    // InternalAadlV3.g:139:4: ( (lv_elements_4_0= ruleAnnexLibrary ) )
                    // InternalAadlV3.g:140:5: (lv_elements_4_0= ruleAnnexLibrary )
                    {
                    // InternalAadlV3.g:140:5: (lv_elements_4_0= ruleAnnexLibrary )
                    // InternalAadlV3.g:141:6: lv_elements_4_0= ruleAnnexLibrary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsAnnexLibraryParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_7);
                    lv_elements_4_0=ruleAnnexLibrary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
                      						}
                      						add(
                      							current,
                      							"elements",
                      							lv_elements_4_0,
                      							"org.osate.xtext.aadlv3.AadlV3.AnnexLibrary");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:159:4: ( ( (lv_imports_5_0= ruleImport ) ) | ( (lv_elements_6_0= rulePackageElement ) ) )*
                    {
                    // InternalAadlV3.g:159:4: ( ( (lv_imports_5_0= ruleImport ) ) | ( (lv_elements_6_0= rulePackageElement ) ) )*
                    loop2:
                    do {
                        int alt2=3;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==43) ) {
                            alt2=1;
                        }
                        else if ( ((LA2_0>=13 && LA2_0<=14)||LA2_0==21||(LA2_0>=28 && LA2_0<=29)||LA2_0==31||(LA2_0>=37 && LA2_0<=38)||LA2_0==48||(LA2_0>=62 && LA2_0<=71)||LA2_0==93) ) {
                            alt2=2;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalAadlV3.g:160:5: ( (lv_imports_5_0= ruleImport ) )
                    	    {
                    	    // InternalAadlV3.g:160:5: ( (lv_imports_5_0= ruleImport ) )
                    	    // InternalAadlV3.g:161:6: (lv_imports_5_0= ruleImport )
                    	    {
                    	    // InternalAadlV3.g:161:6: (lv_imports_5_0= ruleImport )
                    	    // InternalAadlV3.g:162:7: lv_imports_5_0= ruleImport
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getPackageDeclarationAccess().getImportsImportParserRuleCall_4_1_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_8);
                    	    lv_imports_5_0=ruleImport();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"imports",
                    	      								lv_imports_5_0,
                    	      								"org.osate.xtext.aadlv3.AadlV3.Import");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAadlV3.g:180:5: ( (lv_elements_6_0= rulePackageElement ) )
                    	    {
                    	    // InternalAadlV3.g:180:5: ( (lv_elements_6_0= rulePackageElement ) )
                    	    // InternalAadlV3.g:181:6: (lv_elements_6_0= rulePackageElement )
                    	    {
                    	    // InternalAadlV3.g:181:6: (lv_elements_6_0= rulePackageElement )
                    	    // InternalAadlV3.g:182:7: lv_elements_6_0= rulePackageElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsPackageElementParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_8);
                    	    lv_elements_6_0=rulePackageElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_6_0,
                    	      								"org.osate.xtext.aadlv3.AadlV3.PackageElement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getPackageDeclarationAccess().getEndKeyword_5());
              		
            }
            otherlv_8=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getPackageDeclarationAccess().getSemicolonKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleAnnexLibrary"
    // InternalAadlV3.g:213:1: entryRuleAnnexLibrary returns [EObject current=null] : iv_ruleAnnexLibrary= ruleAnnexLibrary EOF ;
    public final EObject entryRuleAnnexLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnexLibrary = null;


        try {
            // InternalAadlV3.g:213:53: (iv_ruleAnnexLibrary= ruleAnnexLibrary EOF )
            // InternalAadlV3.g:214:2: iv_ruleAnnexLibrary= ruleAnnexLibrary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnexLibraryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAnnexLibrary=ruleAnnexLibrary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnexLibrary; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAnnexLibrary"


    // $ANTLR start "ruleAnnexLibrary"
    // InternalAadlV3.g:220:1: ruleAnnexLibrary returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleAnnexLibrary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAadlV3.g:226:2: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // InternalAadlV3.g:227:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // InternalAadlV3.g:227:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // InternalAadlV3.g:228:3: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAnnexLibraryAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalAadlV3.g:232:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAadlV3.g:233:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAadlV3.g:233:4: (lv_name_1_0= RULE_ID )
            // InternalAadlV3.g:234:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getAnnexLibraryAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAnnexLibraryRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAnnexLibraryAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAnnexLibraryAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAnnexLibrary"


    // $ANTLR start "entryRulePackageElement"
    // InternalAadlV3.g:262:1: entryRulePackageElement returns [EObject current=null] : iv_rulePackageElement= rulePackageElement EOF ;
    public final EObject entryRulePackageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageElement = null;


        try {
            // InternalAadlV3.g:262:55: (iv_rulePackageElement= rulePackageElement EOF )
            // InternalAadlV3.g:263:2: iv_rulePackageElement= rulePackageElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePackageElement=rulePackageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackageElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePackageElement"


    // $ANTLR start "rulePackageElement"
    // InternalAadlV3.g:269:1: rulePackageElement returns [EObject current=null] : (this_PackageDeclaration_0= rulePackageDeclaration | this_ComponentInterface_1= ruleComponentInterface | this_ComponentImplementation_2= ruleComponentImplementation | this_ComponentConfiguration_3= ruleComponentConfiguration | this_PropertyDefinition_4= rulePropertyDefinition | this_PropertySet_5= rulePropertySet | this_Workingset_6= ruleWorkingset | this_TypeDef_7= ruleTypeDef | this_ConstantDef_8= ruleConstantDef ) ;
    public final EObject rulePackageElement() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDeclaration_0 = null;

        EObject this_ComponentInterface_1 = null;

        EObject this_ComponentImplementation_2 = null;

        EObject this_ComponentConfiguration_3 = null;

        EObject this_PropertyDefinition_4 = null;

        EObject this_PropertySet_5 = null;

        EObject this_Workingset_6 = null;

        EObject this_TypeDef_7 = null;

        EObject this_ConstantDef_8 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:275:2: ( (this_PackageDeclaration_0= rulePackageDeclaration | this_ComponentInterface_1= ruleComponentInterface | this_ComponentImplementation_2= ruleComponentImplementation | this_ComponentConfiguration_3= ruleComponentConfiguration | this_PropertyDefinition_4= rulePropertyDefinition | this_PropertySet_5= rulePropertySet | this_Workingset_6= ruleWorkingset | this_TypeDef_7= ruleTypeDef | this_ConstantDef_8= ruleConstantDef ) )
            // InternalAadlV3.g:276:2: (this_PackageDeclaration_0= rulePackageDeclaration | this_ComponentInterface_1= ruleComponentInterface | this_ComponentImplementation_2= ruleComponentImplementation | this_ComponentConfiguration_3= ruleComponentConfiguration | this_PropertyDefinition_4= rulePropertyDefinition | this_PropertySet_5= rulePropertySet | this_Workingset_6= ruleWorkingset | this_TypeDef_7= ruleTypeDef | this_ConstantDef_8= ruleConstantDef )
            {
            // InternalAadlV3.g:276:2: (this_PackageDeclaration_0= rulePackageDeclaration | this_ComponentInterface_1= ruleComponentInterface | this_ComponentImplementation_2= ruleComponentImplementation | this_ComponentConfiguration_3= ruleComponentConfiguration | this_PropertyDefinition_4= rulePropertyDefinition | this_PropertySet_5= rulePropertySet | this_Workingset_6= ruleWorkingset | this_TypeDef_7= ruleTypeDef | this_ConstantDef_8= ruleConstantDef )
            int alt4=9;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalAadlV3.g:277:3: this_PackageDeclaration_0= rulePackageDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPackageElementAccess().getPackageDeclarationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PackageDeclaration_0=rulePackageDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PackageDeclaration_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:289:3: this_ComponentInterface_1= ruleComponentInterface
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPackageElementAccess().getComponentInterfaceParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ComponentInterface_1=ruleComponentInterface();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ComponentInterface_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:301:3: this_ComponentImplementation_2= ruleComponentImplementation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPackageElementAccess().getComponentImplementationParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ComponentImplementation_2=ruleComponentImplementation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ComponentImplementation_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAadlV3.g:313:3: this_ComponentConfiguration_3= ruleComponentConfiguration
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPackageElementAccess().getComponentConfigurationParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ComponentConfiguration_3=ruleComponentConfiguration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ComponentConfiguration_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAadlV3.g:325:3: this_PropertyDefinition_4= rulePropertyDefinition
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPackageElementAccess().getPropertyDefinitionParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PropertyDefinition_4=rulePropertyDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PropertyDefinition_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAadlV3.g:337:3: this_PropertySet_5= rulePropertySet
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPackageElementAccess().getPropertySetParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PropertySet_5=rulePropertySet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PropertySet_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalAadlV3.g:349:3: this_Workingset_6= ruleWorkingset
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPackageElementAccess().getWorkingsetParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Workingset_6=ruleWorkingset();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Workingset_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalAadlV3.g:361:3: this_TypeDef_7= ruleTypeDef
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPackageElementAccess().getTypeDefParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TypeDef_7=ruleTypeDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeDef_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalAadlV3.g:373:3: this_ConstantDef_8= ruleConstantDef
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPackageElementAccess().getConstantDefParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConstantDef_8=ruleConstantDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConstantDef_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePackageElement"


    // $ANTLR start "entryRulePropertyDefinition"
    // InternalAadlV3.g:388:1: entryRulePropertyDefinition returns [EObject current=null] : iv_rulePropertyDefinition= rulePropertyDefinition EOF ;
    public final EObject entryRulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyDefinition = null;


        try {
            // InternalAadlV3.g:388:59: (iv_rulePropertyDefinition= rulePropertyDefinition EOF )
            // InternalAadlV3.g:389:2: iv_rulePropertyDefinition= rulePropertyDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePropertyDefinition=rulePropertyDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePropertyDefinition"


    // $ANTLR start "rulePropertyDefinition"
    // InternalAadlV3.g:395:1: rulePropertyDefinition returns [EObject current=null] : ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'property' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) (otherlv_5= 'for' otherlv_6= '(' ( ( (lv_forAll_7_0= 'all' ) ) | (this_AppliesTo_8= ruleAppliesTo[$current] (otherlv_9= ',' this_AppliesTo_10= ruleAppliesTo[$current] )* ) ) otherlv_11= ')' )? otherlv_12= ';' ) ;
    public final EObject rulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_private_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_forAll_7_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_type_4_0 = null;

        EObject this_AppliesTo_8 = null;

        EObject this_AppliesTo_10 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:401:2: ( ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'property' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) (otherlv_5= 'for' otherlv_6= '(' ( ( (lv_forAll_7_0= 'all' ) ) | (this_AppliesTo_8= ruleAppliesTo[$current] (otherlv_9= ',' this_AppliesTo_10= ruleAppliesTo[$current] )* ) ) otherlv_11= ')' )? otherlv_12= ';' ) )
            // InternalAadlV3.g:402:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'property' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) (otherlv_5= 'for' otherlv_6= '(' ( ( (lv_forAll_7_0= 'all' ) ) | (this_AppliesTo_8= ruleAppliesTo[$current] (otherlv_9= ',' this_AppliesTo_10= ruleAppliesTo[$current] )* ) ) otherlv_11= ')' )? otherlv_12= ';' )
            {
            // InternalAadlV3.g:402:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'property' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) (otherlv_5= 'for' otherlv_6= '(' ( ( (lv_forAll_7_0= 'all' ) ) | (this_AppliesTo_8= ruleAppliesTo[$current] (otherlv_9= ',' this_AppliesTo_10= ruleAppliesTo[$current] )* ) ) otherlv_11= ')' )? otherlv_12= ';' )
            // InternalAadlV3.g:403:3: ( (lv_private_0_0= 'private' ) )? otherlv_1= 'property' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) (otherlv_5= 'for' otherlv_6= '(' ( ( (lv_forAll_7_0= 'all' ) ) | (this_AppliesTo_8= ruleAppliesTo[$current] (otherlv_9= ',' this_AppliesTo_10= ruleAppliesTo[$current] )* ) ) otherlv_11= ')' )? otherlv_12= ';'
            {
            // InternalAadlV3.g:403:3: ( (lv_private_0_0= 'private' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAadlV3.g:404:4: (lv_private_0_0= 'private' )
                    {
                    // InternalAadlV3.g:404:4: (lv_private_0_0= 'private' )
                    // InternalAadlV3.g:405:5: lv_private_0_0= 'private'
                    {
                    lv_private_0_0=(Token)match(input,13,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_private_0_0, grammarAccess.getPropertyDefinitionAccess().getPrivatePrivateKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPropertyDefinitionRule());
                      					}
                      					setWithLastConsumed(current, "private", true, "private");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPropertyDefinitionAccess().getPropertyKeyword_1());
              		
            }
            // InternalAadlV3.g:421:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAadlV3.g:422:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAadlV3.g:422:4: (lv_name_2_0= RULE_ID )
            // InternalAadlV3.g:423:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getPropertyDefinitionAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPropertyDefinitionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getPropertyDefinitionAccess().getColonKeyword_3());
              		
            }
            // InternalAadlV3.g:443:3: ( (lv_type_4_0= ruleType ) )
            // InternalAadlV3.g:444:4: (lv_type_4_0= ruleType )
            {
            // InternalAadlV3.g:444:4: (lv_type_4_0= ruleType )
            // InternalAadlV3.g:445:5: lv_type_4_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getTypeTypeParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_type_4_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_4_0,
              						"org.osate.xtext.aadlv3.AadlV3.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:462:3: (otherlv_5= 'for' otherlv_6= '(' ( ( (lv_forAll_7_0= 'all' ) ) | (this_AppliesTo_8= ruleAppliesTo[$current] (otherlv_9= ',' this_AppliesTo_10= ruleAppliesTo[$current] )* ) ) otherlv_11= ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAadlV3.g:463:4: otherlv_5= 'for' otherlv_6= '(' ( ( (lv_forAll_7_0= 'all' ) ) | (this_AppliesTo_8= ruleAppliesTo[$current] (otherlv_9= ',' this_AppliesTo_10= ruleAppliesTo[$current] )* ) ) otherlv_11= ')'
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getPropertyDefinitionAccess().getForKeyword_5_0());
                      			
                    }
                    otherlv_6=(Token)match(input,24,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getPropertyDefinitionAccess().getLeftParenthesisKeyword_5_1());
                      			
                    }
                    // InternalAadlV3.g:471:4: ( ( (lv_forAll_7_0= 'all' ) ) | (this_AppliesTo_8= ruleAppliesTo[$current] (otherlv_9= ',' this_AppliesTo_10= ruleAppliesTo[$current] )* ) )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==25) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==37||LA7_0==42||(LA7_0>=62 && LA7_0<=75)||(LA7_0>=92 && LA7_0<=93)) ) {
                        alt7=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalAadlV3.g:472:5: ( (lv_forAll_7_0= 'all' ) )
                            {
                            // InternalAadlV3.g:472:5: ( (lv_forAll_7_0= 'all' ) )
                            // InternalAadlV3.g:473:6: (lv_forAll_7_0= 'all' )
                            {
                            // InternalAadlV3.g:473:6: (lv_forAll_7_0= 'all' )
                            // InternalAadlV3.g:474:7: lv_forAll_7_0= 'all'
                            {
                            lv_forAll_7_0=(Token)match(input,25,FOLLOW_18); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_forAll_7_0, grammarAccess.getPropertyDefinitionAccess().getForAllAllKeyword_5_2_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getPropertyDefinitionRule());
                              							}
                              							setWithLastConsumed(current, "forAll", true, "all");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAadlV3.g:487:5: (this_AppliesTo_8= ruleAppliesTo[$current] (otherlv_9= ',' this_AppliesTo_10= ruleAppliesTo[$current] )* )
                            {
                            // InternalAadlV3.g:487:5: (this_AppliesTo_8= ruleAppliesTo[$current] (otherlv_9= ',' this_AppliesTo_10= ruleAppliesTo[$current] )* )
                            // InternalAadlV3.g:488:6: this_AppliesTo_8= ruleAppliesTo[$current] (otherlv_9= ',' this_AppliesTo_10= ruleAppliesTo[$current] )*
                            {
                            if ( state.backtracking==0 ) {

                              						/* */
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getPropertyDefinitionRule());
                              						}
                              						newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getAppliesToParserRuleCall_5_2_1_0());
                              					
                            }
                            pushFollow(FOLLOW_19);
                            this_AppliesTo_8=ruleAppliesTo(current);

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current = this_AppliesTo_8;
                              						afterParserOrEnumRuleCall();
                              					
                            }
                            // InternalAadlV3.g:502:6: (otherlv_9= ',' this_AppliesTo_10= ruleAppliesTo[$current] )*
                            loop6:
                            do {
                                int alt6=2;
                                int LA6_0 = input.LA(1);

                                if ( (LA6_0==26) ) {
                                    alt6=1;
                                }


                                switch (alt6) {
                            	case 1 :
                            	    // InternalAadlV3.g:503:7: otherlv_9= ',' this_AppliesTo_10= ruleAppliesTo[$current]
                            	    {
                            	    otherlv_9=(Token)match(input,26,FOLLOW_17); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_9, grammarAccess.getPropertyDefinitionAccess().getCommaKeyword_5_2_1_1_0());
                            	      						
                            	    }
                            	    if ( state.backtracking==0 ) {

                            	      							/* */
                            	      						
                            	    }
                            	    if ( state.backtracking==0 ) {

                            	      							if (current==null) {
                            	      								current = createModelElement(grammarAccess.getPropertyDefinitionRule());
                            	      							}
                            	      							newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getAppliesToParserRuleCall_5_2_1_1_1());
                            	      						
                            	    }
                            	    pushFollow(FOLLOW_19);
                            	    this_AppliesTo_10=ruleAppliesTo(current);

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							current = this_AppliesTo_10;
                            	      							afterParserOrEnumRuleCall();
                            	      						
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop6;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,27,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getPropertyDefinitionAccess().getRightParenthesisKeyword_5_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_12=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePropertyDefinition"


    // $ANTLR start "ruleAppliesTo"
    // InternalAadlV3.g:538:1: ruleAppliesTo[EObject in_current] returns [EObject current=in_current] : ( ( (lv_componentCategories_0_0= ruleComponentCategory ) ) | ( (lv_featureCategories_1_0= ruleFeatureCategory ) ) | ( (lv_associationTypes_2_0= ruleAssociationType ) ) ) ;
    public final EObject ruleAppliesTo(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        AntlrDatatypeRuleToken lv_componentCategories_0_0 = null;

        AntlrDatatypeRuleToken lv_featureCategories_1_0 = null;

        AntlrDatatypeRuleToken lv_associationTypes_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:544:2: ( ( ( (lv_componentCategories_0_0= ruleComponentCategory ) ) | ( (lv_featureCategories_1_0= ruleFeatureCategory ) ) | ( (lv_associationTypes_2_0= ruleAssociationType ) ) ) )
            // InternalAadlV3.g:545:2: ( ( (lv_componentCategories_0_0= ruleComponentCategory ) ) | ( (lv_featureCategories_1_0= ruleFeatureCategory ) ) | ( (lv_associationTypes_2_0= ruleAssociationType ) ) )
            {
            // InternalAadlV3.g:545:2: ( ( (lv_componentCategories_0_0= ruleComponentCategory ) ) | ( (lv_featureCategories_1_0= ruleFeatureCategory ) ) | ( (lv_associationTypes_2_0= ruleAssociationType ) ) )
            int alt9=3;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalAadlV3.g:546:3: ( (lv_componentCategories_0_0= ruleComponentCategory ) )
                    {
                    // InternalAadlV3.g:546:3: ( (lv_componentCategories_0_0= ruleComponentCategory ) )
                    // InternalAadlV3.g:547:4: (lv_componentCategories_0_0= ruleComponentCategory )
                    {
                    // InternalAadlV3.g:547:4: (lv_componentCategories_0_0= ruleComponentCategory )
                    // InternalAadlV3.g:548:5: lv_componentCategories_0_0= ruleComponentCategory
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAppliesToAccess().getComponentCategoriesComponentCategoryParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_componentCategories_0_0=ruleComponentCategory();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getAppliesToRule());
                      					}
                      					add(
                      						current,
                      						"componentCategories",
                      						lv_componentCategories_0_0,
                      						"org.osate.xtext.aadlv3.AadlV3.ComponentCategory");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:566:3: ( (lv_featureCategories_1_0= ruleFeatureCategory ) )
                    {
                    // InternalAadlV3.g:566:3: ( (lv_featureCategories_1_0= ruleFeatureCategory ) )
                    // InternalAadlV3.g:567:4: (lv_featureCategories_1_0= ruleFeatureCategory )
                    {
                    // InternalAadlV3.g:567:4: (lv_featureCategories_1_0= ruleFeatureCategory )
                    // InternalAadlV3.g:568:5: lv_featureCategories_1_0= ruleFeatureCategory
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAppliesToAccess().getFeatureCategoriesFeatureCategoryParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_featureCategories_1_0=ruleFeatureCategory();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getAppliesToRule());
                      					}
                      					add(
                      						current,
                      						"featureCategories",
                      						lv_featureCategories_1_0,
                      						"org.osate.xtext.aadlv3.AadlV3.FeatureCategory");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:586:3: ( (lv_associationTypes_2_0= ruleAssociationType ) )
                    {
                    // InternalAadlV3.g:586:3: ( (lv_associationTypes_2_0= ruleAssociationType ) )
                    // InternalAadlV3.g:587:4: (lv_associationTypes_2_0= ruleAssociationType )
                    {
                    // InternalAadlV3.g:587:4: (lv_associationTypes_2_0= ruleAssociationType )
                    // InternalAadlV3.g:588:5: lv_associationTypes_2_0= ruleAssociationType
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAppliesToAccess().getAssociationTypesAssociationTypeParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_associationTypes_2_0=ruleAssociationType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getAppliesToRule());
                      					}
                      					add(
                      						current,
                      						"associationTypes",
                      						lv_associationTypes_2_0,
                      						"org.osate.xtext.aadlv3.AadlV3.AssociationType");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAppliesTo"


    // $ANTLR start "entryRulePropertySet"
    // InternalAadlV3.g:609:1: entryRulePropertySet returns [EObject current=null] : iv_rulePropertySet= rulePropertySet EOF ;
    public final EObject entryRulePropertySet() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertySet = null;


        try {
            // InternalAadlV3.g:609:52: (iv_rulePropertySet= rulePropertySet EOF )
            // InternalAadlV3.g:610:2: iv_rulePropertySet= rulePropertySet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertySetRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePropertySet=rulePropertySet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertySet; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePropertySet"


    // $ANTLR start "rulePropertySet"
    // InternalAadlV3.g:616:1: rulePropertySet returns [EObject current=null] : ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'properties' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= '{' ( ( ruleQualifiedReference ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= '}' otherlv_9= ';' ) ;
    public final EObject rulePropertySet() throws RecognitionException {
        EObject current = null;

        Token lv_private_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalAadlV3.g:622:2: ( ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'properties' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= '{' ( ( ruleQualifiedReference ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= '}' otherlv_9= ';' ) )
            // InternalAadlV3.g:623:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'properties' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= '{' ( ( ruleQualifiedReference ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= '}' otherlv_9= ';' )
            {
            // InternalAadlV3.g:623:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'properties' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= '{' ( ( ruleQualifiedReference ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= '}' otherlv_9= ';' )
            // InternalAadlV3.g:624:3: ( (lv_private_0_0= 'private' ) )? otherlv_1= 'properties' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= '{' ( ( ruleQualifiedReference ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= '}' otherlv_9= ';'
            {
            // InternalAadlV3.g:624:3: ( (lv_private_0_0= 'private' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAadlV3.g:625:4: (lv_private_0_0= 'private' )
                    {
                    // InternalAadlV3.g:625:4: (lv_private_0_0= 'private' )
                    // InternalAadlV3.g:626:5: lv_private_0_0= 'private'
                    {
                    lv_private_0_0=(Token)match(input,13,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_private_0_0, grammarAccess.getPropertySetAccess().getPrivatePrivateKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPropertySetRule());
                      					}
                      					setWithLastConsumed(current, "private", true, "private");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,28,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPropertySetAccess().getPropertiesKeyword_1());
              		
            }
            // InternalAadlV3.g:642:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAadlV3.g:643:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAadlV3.g:643:4: (lv_name_2_0= RULE_ID )
            // InternalAadlV3.g:644:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getPropertySetAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPropertySetRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getPropertySetAccess().getColonKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getPropertySetAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalAadlV3.g:668:3: ( ( ruleQualifiedReference ) )
            // InternalAadlV3.g:669:4: ( ruleQualifiedReference )
            {
            // InternalAadlV3.g:669:4: ( ruleQualifiedReference )
            // InternalAadlV3.g:670:5: ruleQualifiedReference
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPropertySetRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPropertySetAccess().getPropertiesPropertyDefinitionCrossReference_5_0());
              				
            }
            pushFollow(FOLLOW_21);
            ruleQualifiedReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:687:3: (otherlv_6= ',' ( ( ruleQualifiedName ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAadlV3.g:688:4: otherlv_6= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_6=(Token)match(input,26,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getPropertySetAccess().getCommaKeyword_6_0());
            	      			
            	    }
            	    // InternalAadlV3.g:692:4: ( ( ruleQualifiedName ) )
            	    // InternalAadlV3.g:693:5: ( ruleQualifiedName )
            	    {
            	    // InternalAadlV3.g:693:5: ( ruleQualifiedName )
            	    // InternalAadlV3.g:694:6: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      						/* */
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getPropertySetRule());
            	      						}
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPropertySetAccess().getPropertiesPropertyDefinitionCrossReference_6_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_21);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_8=(Token)match(input,20,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getPropertySetAccess().getRightCurlyBracketKeyword_7());
              		
            }
            otherlv_9=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getPropertySetAccess().getSemicolonKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePropertySet"


    // $ANTLR start "entryRuleTypeDef"
    // InternalAadlV3.g:724:1: entryRuleTypeDef returns [EObject current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final EObject entryRuleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDef = null;


        try {
            // InternalAadlV3.g:724:48: (iv_ruleTypeDef= ruleTypeDef EOF )
            // InternalAadlV3.g:725:2: iv_ruleTypeDef= ruleTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeDef=ruleTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeDef"


    // $ANTLR start "ruleTypeDef"
    // InternalAadlV3.g:731:1: ruleTypeDef returns [EObject current=null] : ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_superType_4_0= ruleType ) ) )? (otherlv_5= ':' ( (lv_baseType_6_0= ruleType ) ) )? (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? otherlv_8= ';' ) ;
    public final EObject ruleTypeDef() throws RecognitionException {
        EObject current = null;

        Token lv_private_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_superType_4_0 = null;

        EObject lv_baseType_6_0 = null;

        EObject this_PropertiesBlock_7 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:737:2: ( ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_superType_4_0= ruleType ) ) )? (otherlv_5= ':' ( (lv_baseType_6_0= ruleType ) ) )? (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? otherlv_8= ';' ) )
            // InternalAadlV3.g:738:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_superType_4_0= ruleType ) ) )? (otherlv_5= ':' ( (lv_baseType_6_0= ruleType ) ) )? (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? otherlv_8= ';' )
            {
            // InternalAadlV3.g:738:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_superType_4_0= ruleType ) ) )? (otherlv_5= ':' ( (lv_baseType_6_0= ruleType ) ) )? (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? otherlv_8= ';' )
            // InternalAadlV3.g:739:3: ( (lv_private_0_0= 'private' ) )? otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_superType_4_0= ruleType ) ) )? (otherlv_5= ':' ( (lv_baseType_6_0= ruleType ) ) )? (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? otherlv_8= ';'
            {
            // InternalAadlV3.g:739:3: ( (lv_private_0_0= 'private' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAadlV3.g:740:4: (lv_private_0_0= 'private' )
                    {
                    // InternalAadlV3.g:740:4: (lv_private_0_0= 'private' )
                    // InternalAadlV3.g:741:5: lv_private_0_0= 'private'
                    {
                    lv_private_0_0=(Token)match(input,13,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_private_0_0, grammarAccess.getTypeDefAccess().getPrivatePrivateKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getTypeDefRule());
                      					}
                      					setWithLastConsumed(current, "private", true, "private");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,29,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTypeDefAccess().getTypeKeyword_1());
              		
            }
            // InternalAadlV3.g:757:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAadlV3.g:758:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAadlV3.g:758:4: (lv_name_2_0= RULE_ID )
            // InternalAadlV3.g:759:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTypeDefRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalAadlV3.g:775:3: (otherlv_3= 'extends' ( (lv_superType_4_0= ruleType ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAadlV3.g:776:4: otherlv_3= 'extends' ( (lv_superType_4_0= ruleType ) )
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getTypeDefAccess().getExtendsKeyword_3_0());
                      			
                    }
                    // InternalAadlV3.g:780:4: ( (lv_superType_4_0= ruleType ) )
                    // InternalAadlV3.g:781:5: (lv_superType_4_0= ruleType )
                    {
                    // InternalAadlV3.g:781:5: (lv_superType_4_0= ruleType )
                    // InternalAadlV3.g:782:6: lv_superType_4_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypeDefAccess().getSuperTypeTypeParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_24);
                    lv_superType_4_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTypeDefRule());
                      						}
                      						set(
                      							current,
                      							"superType",
                      							lv_superType_4_0,
                      							"org.osate.xtext.aadlv3.AadlV3.Type");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalAadlV3.g:800:3: (otherlv_5= ':' ( (lv_baseType_6_0= ruleType ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAadlV3.g:801:4: otherlv_5= ':' ( (lv_baseType_6_0= ruleType ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getTypeDefAccess().getColonKeyword_4_0());
                      			
                    }
                    // InternalAadlV3.g:805:4: ( (lv_baseType_6_0= ruleType ) )
                    // InternalAadlV3.g:806:5: (lv_baseType_6_0= ruleType )
                    {
                    // InternalAadlV3.g:806:5: (lv_baseType_6_0= ruleType )
                    // InternalAadlV3.g:807:6: lv_baseType_6_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypeDefAccess().getBaseTypeTypeParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_25);
                    lv_baseType_6_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTypeDefRule());
                      						}
                      						set(
                      							current,
                      							"baseType",
                      							lv_baseType_6_0,
                      							"org.osate.xtext.aadlv3.AadlV3.Type");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalAadlV3.g:825:3: (this_PropertiesBlock_7= rulePropertiesBlock[$current] )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAadlV3.g:826:4: this_PropertiesBlock_7= rulePropertiesBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getTypeDefRule());
                      				}
                      				newCompositeNode(grammarAccess.getTypeDefAccess().getPropertiesBlockParserRuleCall_5());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_PropertiesBlock_7=rulePropertiesBlock(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_PropertiesBlock_7;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getTypeDefAccess().getSemicolonKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTypeDef"


    // $ANTLR start "entryRuleConstantDef"
    // InternalAadlV3.g:849:1: entryRuleConstantDef returns [EObject current=null] : iv_ruleConstantDef= ruleConstantDef EOF ;
    public final EObject entryRuleConstantDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDef = null;


        try {
            // InternalAadlV3.g:849:52: (iv_ruleConstantDef= ruleConstantDef EOF )
            // InternalAadlV3.g:850:2: iv_ruleConstantDef= ruleConstantDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstantDef=ruleConstantDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantDef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstantDef"


    // $ANTLR start "ruleConstantDef"
    // InternalAadlV3.g:856:1: ruleConstantDef returns [EObject current=null] : ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'constant' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_value_4_0= ruleLiteral ) ) otherlv_5= ';' ) ;
    public final EObject ruleConstantDef() throws RecognitionException {
        EObject current = null;

        Token lv_private_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:862:2: ( ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'constant' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_value_4_0= ruleLiteral ) ) otherlv_5= ';' ) )
            // InternalAadlV3.g:863:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'constant' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_value_4_0= ruleLiteral ) ) otherlv_5= ';' )
            {
            // InternalAadlV3.g:863:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'constant' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_value_4_0= ruleLiteral ) ) otherlv_5= ';' )
            // InternalAadlV3.g:864:3: ( (lv_private_0_0= 'private' ) )? otherlv_1= 'constant' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_value_4_0= ruleLiteral ) ) otherlv_5= ';'
            {
            // InternalAadlV3.g:864:3: ( (lv_private_0_0= 'private' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==13) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAadlV3.g:865:4: (lv_private_0_0= 'private' )
                    {
                    // InternalAadlV3.g:865:4: (lv_private_0_0= 'private' )
                    // InternalAadlV3.g:866:5: lv_private_0_0= 'private'
                    {
                    lv_private_0_0=(Token)match(input,13,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_private_0_0, grammarAccess.getConstantDefAccess().getPrivatePrivateKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getConstantDefRule());
                      					}
                      					setWithLastConsumed(current, "private", true, "private");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,31,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConstantDefAccess().getConstantKeyword_1());
              		
            }
            // InternalAadlV3.g:882:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAadlV3.g:883:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAadlV3.g:883:4: (lv_name_2_0= RULE_ID )
            // InternalAadlV3.g:884:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getConstantDefAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConstantDefRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getConstantDefAccess().getColonKeyword_3());
              		
            }
            // InternalAadlV3.g:904:3: ( (lv_value_4_0= ruleLiteral ) )
            // InternalAadlV3.g:905:4: (lv_value_4_0= ruleLiteral )
            {
            // InternalAadlV3.g:905:4: (lv_value_4_0= ruleLiteral )
            // InternalAadlV3.g:906:5: lv_value_4_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConstantDefAccess().getValueLiteralParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_value_4_0=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConstantDefRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_4_0,
              						"org.osate.xtext.aadlv3.AadlV3.Literal");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getConstantDefAccess().getSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConstantDef"


    // $ANTLR start "entryRulePropertyAssociation"
    // InternalAadlV3.g:931:1: entryRulePropertyAssociation returns [EObject current=null] : iv_rulePropertyAssociation= rulePropertyAssociation EOF ;
    public final EObject entryRulePropertyAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyAssociation = null;


        try {
            // InternalAadlV3.g:931:60: (iv_rulePropertyAssociation= rulePropertyAssociation EOF )
            // InternalAadlV3.g:932:2: iv_rulePropertyAssociation= rulePropertyAssociation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyAssociationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePropertyAssociation=rulePropertyAssociation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyAssociation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePropertyAssociation"


    // $ANTLR start "rulePropertyAssociation"
    // InternalAadlV3.g:938:1: rulePropertyAssociation returns [EObject current=null] : ( ( (lv_target_0_0= ruleModelElementReference ) )? otherlv_1= '#' ( ( ruleQualifiedName ) ) ( (lv_propertyAssociationType_3_0= rulePropertyAssociationType ) ) ( (lv_value_4_0= ruleLiteral ) ) otherlv_5= ';' ) ;
    public final EObject rulePropertyAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_target_0_0 = null;

        AntlrDatatypeRuleToken lv_propertyAssociationType_3_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:944:2: ( ( ( (lv_target_0_0= ruleModelElementReference ) )? otherlv_1= '#' ( ( ruleQualifiedName ) ) ( (lv_propertyAssociationType_3_0= rulePropertyAssociationType ) ) ( (lv_value_4_0= ruleLiteral ) ) otherlv_5= ';' ) )
            // InternalAadlV3.g:945:2: ( ( (lv_target_0_0= ruleModelElementReference ) )? otherlv_1= '#' ( ( ruleQualifiedName ) ) ( (lv_propertyAssociationType_3_0= rulePropertyAssociationType ) ) ( (lv_value_4_0= ruleLiteral ) ) otherlv_5= ';' )
            {
            // InternalAadlV3.g:945:2: ( ( (lv_target_0_0= ruleModelElementReference ) )? otherlv_1= '#' ( ( ruleQualifiedName ) ) ( (lv_propertyAssociationType_3_0= rulePropertyAssociationType ) ) ( (lv_value_4_0= ruleLiteral ) ) otherlv_5= ';' )
            // InternalAadlV3.g:946:3: ( (lv_target_0_0= ruleModelElementReference ) )? otherlv_1= '#' ( ( ruleQualifiedName ) ) ( (lv_propertyAssociationType_3_0= rulePropertyAssociationType ) ) ( (lv_value_4_0= ruleLiteral ) ) otherlv_5= ';'
            {
            // InternalAadlV3.g:946:3: ( (lv_target_0_0= ruleModelElementReference ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAadlV3.g:947:4: (lv_target_0_0= ruleModelElementReference )
                    {
                    // InternalAadlV3.g:947:4: (lv_target_0_0= ruleModelElementReference )
                    // InternalAadlV3.g:948:5: lv_target_0_0= ruleModelElementReference
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getPropertyAssociationAccess().getTargetModelElementReferenceParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_28);
                    lv_target_0_0=ruleModelElementReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getPropertyAssociationRule());
                      					}
                      					set(
                      						current,
                      						"target",
                      						lv_target_0_0,
                      						"org.osate.xtext.aadlv3.AadlV3.ModelElementReference");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,32,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPropertyAssociationAccess().getNumberSignKeyword_1());
              		
            }
            // InternalAadlV3.g:969:3: ( ( ruleQualifiedName ) )
            // InternalAadlV3.g:970:4: ( ruleQualifiedName )
            {
            // InternalAadlV3.g:970:4: ( ruleQualifiedName )
            // InternalAadlV3.g:971:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPropertyAssociationRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPropertyAssociationAccess().getPropertyPropertyDefinitionCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_29);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:988:3: ( (lv_propertyAssociationType_3_0= rulePropertyAssociationType ) )
            // InternalAadlV3.g:989:4: (lv_propertyAssociationType_3_0= rulePropertyAssociationType )
            {
            // InternalAadlV3.g:989:4: (lv_propertyAssociationType_3_0= rulePropertyAssociationType )
            // InternalAadlV3.g:990:5: lv_propertyAssociationType_3_0= rulePropertyAssociationType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPropertyAssociationAccess().getPropertyAssociationTypePropertyAssociationTypeParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_27);
            lv_propertyAssociationType_3_0=rulePropertyAssociationType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPropertyAssociationRule());
              					}
              					set(
              						current,
              						"propertyAssociationType",
              						lv_propertyAssociationType_3_0,
              						"org.osate.xtext.aadlv3.AadlV3.PropertyAssociationType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:1007:3: ( (lv_value_4_0= ruleLiteral ) )
            // InternalAadlV3.g:1008:4: (lv_value_4_0= ruleLiteral )
            {
            // InternalAadlV3.g:1008:4: (lv_value_4_0= ruleLiteral )
            // InternalAadlV3.g:1009:5: lv_value_4_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPropertyAssociationAccess().getValueLiteralParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_value_4_0=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPropertyAssociationRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_4_0,
              						"org.osate.xtext.aadlv3.AadlV3.Literal");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getPropertyAssociationAccess().getSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePropertyAssociation"


    // $ANTLR start "entryRulePropertyAssociationType"
    // InternalAadlV3.g:1034:1: entryRulePropertyAssociationType returns [String current=null] : iv_rulePropertyAssociationType= rulePropertyAssociationType EOF ;
    public final String entryRulePropertyAssociationType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropertyAssociationType = null;


        try {
            // InternalAadlV3.g:1034:63: (iv_rulePropertyAssociationType= rulePropertyAssociationType EOF )
            // InternalAadlV3.g:1035:2: iv_rulePropertyAssociationType= rulePropertyAssociationType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyAssociationTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePropertyAssociationType=rulePropertyAssociationType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyAssociationType.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePropertyAssociationType"


    // $ANTLR start "rulePropertyAssociationType"
    // InternalAadlV3.g:1041:1: rulePropertyAssociationType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=>' | kw= '=' | kw= '*=>' ) ;
    public final AntlrDatatypeRuleToken rulePropertyAssociationType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:1047:2: ( (kw= '=>' | kw= '=' | kw= '*=>' ) )
            // InternalAadlV3.g:1048:2: (kw= '=>' | kw= '=' | kw= '*=>' )
            {
            // InternalAadlV3.g:1048:2: (kw= '=>' | kw= '=' | kw= '*=>' )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt18=1;
                }
                break;
            case 34:
                {
                alt18=2;
                }
                break;
            case 35:
                {
                alt18=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalAadlV3.g:1049:3: kw= '=>'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPropertyAssociationTypeAccess().getEqualsSignGreaterThanSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:1055:3: kw= '='
                    {
                    kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPropertyAssociationTypeAccess().getEqualsSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:1061:3: kw= '*=>'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPropertyAssociationTypeAccess().getAsteriskEqualsSignGreaterThanSignKeyword_2());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePropertyAssociationType"


    // $ANTLR start "entryRuleModelElementReference"
    // InternalAadlV3.g:1070:1: entryRuleModelElementReference returns [EObject current=null] : iv_ruleModelElementReference= ruleModelElementReference EOF ;
    public final EObject entryRuleModelElementReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelElementReference = null;


        try {
            // InternalAadlV3.g:1070:62: (iv_ruleModelElementReference= ruleModelElementReference EOF )
            // InternalAadlV3.g:1071:2: iv_ruleModelElementReference= ruleModelElementReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelElementReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModelElementReference=ruleModelElementReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModelElementReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModelElementReference"


    // $ANTLR start "ruleModelElementReference"
    // InternalAadlV3.g:1077:1: ruleModelElementReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( '.' )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* ) ;
    public final EObject ruleModelElementReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAadlV3.g:1083:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( '.' )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* ) )
            // InternalAadlV3.g:1084:2: ( ( (otherlv_0= RULE_ID ) ) ( ( '.' )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )
            {
            // InternalAadlV3.g:1084:2: ( ( (otherlv_0= RULE_ID ) ) ( ( '.' )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )
            // InternalAadlV3.g:1085:3: ( (otherlv_0= RULE_ID ) ) ( ( '.' )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
            {
            // InternalAadlV3.g:1085:3: ( (otherlv_0= RULE_ID ) )
            // InternalAadlV3.g:1086:4: (otherlv_0= RULE_ID )
            {
            // InternalAadlV3.g:1086:4: (otherlv_0= RULE_ID )
            // InternalAadlV3.g:1087:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getModelElementReferenceRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getModelElementReferenceAccess().getElementModelElementCrossReference_0_0());
              				
            }

            }


            }

            // InternalAadlV3.g:1101:3: ( ( '.' )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==36) && (synpred29_InternalAadlV3())) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalAadlV3.g:1102:4: ( '.' )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // InternalAadlV3.g:1103:4: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    // InternalAadlV3.g:1104:5: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalAadlV3.g:1104:5: ()
            	    // InternalAadlV3.g:1105:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						/* */
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getModelElementReferenceAccess().getModelElementReferenceContextAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,36,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getModelElementReferenceAccess().getFullStopKeyword_1_0_1());
            	      				
            	    }
            	    // InternalAadlV3.g:1118:5: ( (otherlv_3= RULE_ID ) )
            	    // InternalAadlV3.g:1119:6: (otherlv_3= RULE_ID )
            	    {
            	    // InternalAadlV3.g:1119:6: (otherlv_3= RULE_ID )
            	    // InternalAadlV3.g:1120:7: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							/* */
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getModelElementReferenceRule());
            	      							}
            	      						
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_3, grammarAccess.getModelElementReferenceAccess().getElementModelElementCrossReference_1_0_2_0());
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleModelElementReference"


    // $ANTLR start "entryRuleComponentInterface"
    // InternalAadlV3.g:1140:1: entryRuleComponentInterface returns [EObject current=null] : iv_ruleComponentInterface= ruleComponentInterface EOF ;
    public final EObject entryRuleComponentInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentInterface = null;


        try {
            // InternalAadlV3.g:1140:59: (iv_ruleComponentInterface= ruleComponentInterface EOF )
            // InternalAadlV3.g:1141:2: iv_ruleComponentInterface= ruleComponentInterface EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComponentInterfaceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComponentInterface=ruleComponentInterface();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComponentInterface; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComponentInterface"


    // $ANTLR start "ruleComponentInterface"
    // InternalAadlV3.g:1147:1: ruleComponentInterface returns [EObject current=null] : ( ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) )? otherlv_2= 'interface' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )? this_InterfaceBody_6= ruleInterfaceBody[$current] otherlv_7= ';' ) ;
    public final EObject ruleComponentInterface() throws RecognitionException {
        EObject current = null;

        Token lv_private_0_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_category_1_0 = null;

        EObject this_InterfaceExtensions_5 = null;

        EObject this_InterfaceBody_6 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1153:2: ( ( ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) )? otherlv_2= 'interface' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )? this_InterfaceBody_6= ruleInterfaceBody[$current] otherlv_7= ';' ) )
            // InternalAadlV3.g:1154:2: ( ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) )? otherlv_2= 'interface' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )? this_InterfaceBody_6= ruleInterfaceBody[$current] otherlv_7= ';' )
            {
            // InternalAadlV3.g:1154:2: ( ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) )? otherlv_2= 'interface' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )? this_InterfaceBody_6= ruleInterfaceBody[$current] otherlv_7= ';' )
            // InternalAadlV3.g:1155:3: ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) )? otherlv_2= 'interface' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )? this_InterfaceBody_6= ruleInterfaceBody[$current] otherlv_7= ';'
            {
            // InternalAadlV3.g:1155:3: ( (lv_private_0_0= 'private' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==13) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAadlV3.g:1156:4: (lv_private_0_0= 'private' )
                    {
                    // InternalAadlV3.g:1156:4: (lv_private_0_0= 'private' )
                    // InternalAadlV3.g:1157:5: lv_private_0_0= 'private'
                    {
                    lv_private_0_0=(Token)match(input,13,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_private_0_0, grammarAccess.getComponentInterfaceAccess().getPrivatePrivateKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getComponentInterfaceRule());
                      					}
                      					setWithLastConsumed(current, "private", true, "private");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalAadlV3.g:1169:3: ( (lv_category_1_0= ruleComponentCategory ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=62 && LA21_0<=71)||LA21_0==93) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAadlV3.g:1170:4: (lv_category_1_0= ruleComponentCategory )
                    {
                    // InternalAadlV3.g:1170:4: (lv_category_1_0= ruleComponentCategory )
                    // InternalAadlV3.g:1171:5: lv_category_1_0= ruleComponentCategory
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getComponentInterfaceAccess().getCategoryComponentCategoryParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_32);
                    lv_category_1_0=ruleComponentCategory();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                      					}
                      					set(
                      						current,
                      						"category",
                      						lv_category_1_0,
                      						"org.osate.xtext.aadlv3.AadlV3.ComponentCategory");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,37,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getComponentInterfaceAccess().getInterfaceKeyword_2());
              		
            }
            // InternalAadlV3.g:1192:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalAadlV3.g:1193:4: (lv_name_3_0= RULE_ID )
            {
            // InternalAadlV3.g:1193:4: (lv_name_3_0= RULE_ID )
            // InternalAadlV3.g:1194:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_3_0, grammarAccess.getComponentInterfaceAccess().getNameIDTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getComponentInterfaceRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_3_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalAadlV3.g:1210:3: (otherlv_4= 'extends' this_InterfaceExtensions_5= ruleInterfaceExtensions[$current] )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==30) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAadlV3.g:1211:4: otherlv_4= 'extends' this_InterfaceExtensions_5= ruleInterfaceExtensions[$current]
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getComponentInterfaceAccess().getExtendsKeyword_4_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getComponentInterfaceRule());
                      				}
                      				newCompositeNode(grammarAccess.getComponentInterfaceAccess().getInterfaceExtensionsParserRuleCall_4_1());
                      			
                    }
                    pushFollow(FOLLOW_33);
                    this_InterfaceExtensions_5=ruleInterfaceExtensions(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_InterfaceExtensions_5;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getComponentInterfaceRule());
              			}
              			newCompositeNode(grammarAccess.getComponentInterfaceAccess().getInterfaceBodyParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_9);
            this_InterfaceBody_6=ruleInterfaceBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_InterfaceBody_6;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_7=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getComponentInterfaceAccess().getSemicolonKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleComponentInterface"


    // $ANTLR start "ruleInterfaceBody"
    // InternalAadlV3.g:1253:1: ruleInterfaceBody[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'is' (this_InterfaceElement_1= ruleInterfaceElement[$current] )* otherlv_2= 'end' ) ;
    public final EObject ruleInterfaceBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_InterfaceElement_1 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1259:2: ( (otherlv_0= 'is' (this_InterfaceElement_1= ruleInterfaceElement[$current] )* otherlv_2= 'end' ) )
            // InternalAadlV3.g:1260:2: (otherlv_0= 'is' (this_InterfaceElement_1= ruleInterfaceElement[$current] )* otherlv_2= 'end' )
            {
            // InternalAadlV3.g:1260:2: (otherlv_0= 'is' (this_InterfaceElement_1= ruleInterfaceElement[$current] )* otherlv_2= 'end' )
            // InternalAadlV3.g:1261:3: otherlv_0= 'is' (this_InterfaceElement_1= ruleInterfaceElement[$current] )* otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInterfaceBodyAccess().getIsKeyword_0());
              		
            }
            // InternalAadlV3.g:1265:3: (this_InterfaceElement_1= ruleInterfaceElement[$current] )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID||LA23_0==18||LA23_0==32) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalAadlV3.g:1266:4: this_InterfaceElement_1= ruleInterfaceElement[$current]
            	    {
            	    if ( state.backtracking==0 ) {

            	      				/* */
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElement(grammarAccess.getInterfaceBodyRule());
            	      				}
            	      				newCompositeNode(grammarAccess.getInterfaceBodyAccess().getInterfaceElementParserRuleCall_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_35);
            	    this_InterfaceElement_1=ruleInterfaceElement(current);

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current = this_InterfaceElement_1;
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_2=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getInterfaceBodyAccess().getEndKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleInterfaceBody"


    // $ANTLR start "ruleInterfaceElement"
    // InternalAadlV3.g:1290:1: ruleInterfaceElement[EObject in_current] returns [EObject current=in_current] : ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_flows_1_0= ruleFlowPath ) ) | ( (lv_flows_2_0= ruleFlowSource ) ) | ( (lv_flows_3_0= ruleFlowSink ) ) | ( (lv_ownedPropertyAssociations_4_0= rulePropertyAssociation ) ) | ( (lv_annexSubclause_5_0= ruleAnnexSubclause ) ) ) ;
    public final EObject ruleInterfaceElement(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_features_0_0 = null;

        EObject lv_flows_1_0 = null;

        EObject lv_flows_2_0 = null;

        EObject lv_flows_3_0 = null;

        EObject lv_ownedPropertyAssociations_4_0 = null;

        EObject lv_annexSubclause_5_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1296:2: ( ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_flows_1_0= ruleFlowPath ) ) | ( (lv_flows_2_0= ruleFlowSource ) ) | ( (lv_flows_3_0= ruleFlowSink ) ) | ( (lv_ownedPropertyAssociations_4_0= rulePropertyAssociation ) ) | ( (lv_annexSubclause_5_0= ruleAnnexSubclause ) ) ) )
            // InternalAadlV3.g:1297:2: ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_flows_1_0= ruleFlowPath ) ) | ( (lv_flows_2_0= ruleFlowSource ) ) | ( (lv_flows_3_0= ruleFlowSink ) ) | ( (lv_ownedPropertyAssociations_4_0= rulePropertyAssociation ) ) | ( (lv_annexSubclause_5_0= ruleAnnexSubclause ) ) )
            {
            // InternalAadlV3.g:1297:2: ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_flows_1_0= ruleFlowPath ) ) | ( (lv_flows_2_0= ruleFlowSource ) ) | ( (lv_flows_3_0= ruleFlowSink ) ) | ( (lv_ownedPropertyAssociations_4_0= rulePropertyAssociation ) ) | ( (lv_annexSubclause_5_0= ruleAnnexSubclause ) ) )
            int alt24=6;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // InternalAadlV3.g:1298:3: ( (lv_features_0_0= ruleFeature ) )
                    {
                    // InternalAadlV3.g:1298:3: ( (lv_features_0_0= ruleFeature ) )
                    // InternalAadlV3.g:1299:4: (lv_features_0_0= ruleFeature )
                    {
                    // InternalAadlV3.g:1299:4: (lv_features_0_0= ruleFeature )
                    // InternalAadlV3.g:1300:5: lv_features_0_0= ruleFeature
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getInterfaceElementAccess().getFeaturesFeatureParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_features_0_0=ruleFeature();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getInterfaceElementRule());
                      					}
                      					add(
                      						current,
                      						"features",
                      						lv_features_0_0,
                      						"org.osate.xtext.aadlv3.AadlV3.Feature");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:1318:3: ( (lv_flows_1_0= ruleFlowPath ) )
                    {
                    // InternalAadlV3.g:1318:3: ( (lv_flows_1_0= ruleFlowPath ) )
                    // InternalAadlV3.g:1319:4: (lv_flows_1_0= ruleFlowPath )
                    {
                    // InternalAadlV3.g:1319:4: (lv_flows_1_0= ruleFlowPath )
                    // InternalAadlV3.g:1320:5: lv_flows_1_0= ruleFlowPath
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getInterfaceElementAccess().getFlowsFlowPathParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_flows_1_0=ruleFlowPath();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getInterfaceElementRule());
                      					}
                      					add(
                      						current,
                      						"flows",
                      						lv_flows_1_0,
                      						"org.osate.xtext.aadlv3.AadlV3.FlowPath");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:1338:3: ( (lv_flows_2_0= ruleFlowSource ) )
                    {
                    // InternalAadlV3.g:1338:3: ( (lv_flows_2_0= ruleFlowSource ) )
                    // InternalAadlV3.g:1339:4: (lv_flows_2_0= ruleFlowSource )
                    {
                    // InternalAadlV3.g:1339:4: (lv_flows_2_0= ruleFlowSource )
                    // InternalAadlV3.g:1340:5: lv_flows_2_0= ruleFlowSource
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getInterfaceElementAccess().getFlowsFlowSourceParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_flows_2_0=ruleFlowSource();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getInterfaceElementRule());
                      					}
                      					add(
                      						current,
                      						"flows",
                      						lv_flows_2_0,
                      						"org.osate.xtext.aadlv3.AadlV3.FlowSource");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAadlV3.g:1358:3: ( (lv_flows_3_0= ruleFlowSink ) )
                    {
                    // InternalAadlV3.g:1358:3: ( (lv_flows_3_0= ruleFlowSink ) )
                    // InternalAadlV3.g:1359:4: (lv_flows_3_0= ruleFlowSink )
                    {
                    // InternalAadlV3.g:1359:4: (lv_flows_3_0= ruleFlowSink )
                    // InternalAadlV3.g:1360:5: lv_flows_3_0= ruleFlowSink
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getInterfaceElementAccess().getFlowsFlowSinkParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_flows_3_0=ruleFlowSink();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getInterfaceElementRule());
                      					}
                      					add(
                      						current,
                      						"flows",
                      						lv_flows_3_0,
                      						"org.osate.xtext.aadlv3.AadlV3.FlowSink");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalAadlV3.g:1378:3: ( (lv_ownedPropertyAssociations_4_0= rulePropertyAssociation ) )
                    {
                    // InternalAadlV3.g:1378:3: ( (lv_ownedPropertyAssociations_4_0= rulePropertyAssociation ) )
                    // InternalAadlV3.g:1379:4: (lv_ownedPropertyAssociations_4_0= rulePropertyAssociation )
                    {
                    // InternalAadlV3.g:1379:4: (lv_ownedPropertyAssociations_4_0= rulePropertyAssociation )
                    // InternalAadlV3.g:1380:5: lv_ownedPropertyAssociations_4_0= rulePropertyAssociation
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getInterfaceElementAccess().getOwnedPropertyAssociationsPropertyAssociationParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_ownedPropertyAssociations_4_0=rulePropertyAssociation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getInterfaceElementRule());
                      					}
                      					add(
                      						current,
                      						"ownedPropertyAssociations",
                      						lv_ownedPropertyAssociations_4_0,
                      						"org.osate.xtext.aadlv3.AadlV3.PropertyAssociation");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalAadlV3.g:1398:3: ( (lv_annexSubclause_5_0= ruleAnnexSubclause ) )
                    {
                    // InternalAadlV3.g:1398:3: ( (lv_annexSubclause_5_0= ruleAnnexSubclause ) )
                    // InternalAadlV3.g:1399:4: (lv_annexSubclause_5_0= ruleAnnexSubclause )
                    {
                    // InternalAadlV3.g:1399:4: (lv_annexSubclause_5_0= ruleAnnexSubclause )
                    // InternalAadlV3.g:1400:5: lv_annexSubclause_5_0= ruleAnnexSubclause
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getInterfaceElementAccess().getAnnexSubclauseAnnexSubclauseParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_annexSubclause_5_0=ruleAnnexSubclause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getInterfaceElementRule());
                      					}
                      					add(
                      						current,
                      						"annexSubclause",
                      						lv_annexSubclause_5_0,
                      						"org.osate.xtext.aadlv3.AadlV3.AnnexSubclause");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleInterfaceElement"


    // $ANTLR start "entryRuleComponentImplementation"
    // InternalAadlV3.g:1421:1: entryRuleComponentImplementation returns [EObject current=null] : iv_ruleComponentImplementation= ruleComponentImplementation EOF ;
    public final EObject entryRuleComponentImplementation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentImplementation = null;


        try {
            // InternalAadlV3.g:1421:64: (iv_ruleComponentImplementation= ruleComponentImplementation EOF )
            // InternalAadlV3.g:1422:2: iv_ruleComponentImplementation= ruleComponentImplementation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComponentImplementationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComponentImplementation=ruleComponentImplementation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComponentImplementation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComponentImplementation"


    // $ANTLR start "ruleComponentImplementation"
    // InternalAadlV3.g:1428:1: ruleComponentImplementation returns [EObject current=null] : ( ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) ) ( (lv_name_2_0= ruleDottedName ) ) (otherlv_3= 'extends' this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )? this_ImplementationBody_5= ruleImplementationBody[$current] otherlv_6= ';' ) ;
    public final EObject ruleComponentImplementation() throws RecognitionException {
        EObject current = null;

        Token lv_private_0_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_category_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject this_ImplementationExtensions_4 = null;

        EObject this_ImplementationBody_5 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1434:2: ( ( ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) ) ( (lv_name_2_0= ruleDottedName ) ) (otherlv_3= 'extends' this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )? this_ImplementationBody_5= ruleImplementationBody[$current] otherlv_6= ';' ) )
            // InternalAadlV3.g:1435:2: ( ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) ) ( (lv_name_2_0= ruleDottedName ) ) (otherlv_3= 'extends' this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )? this_ImplementationBody_5= ruleImplementationBody[$current] otherlv_6= ';' )
            {
            // InternalAadlV3.g:1435:2: ( ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) ) ( (lv_name_2_0= ruleDottedName ) ) (otherlv_3= 'extends' this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )? this_ImplementationBody_5= ruleImplementationBody[$current] otherlv_6= ';' )
            // InternalAadlV3.g:1436:3: ( (lv_private_0_0= 'private' ) )? ( (lv_category_1_0= ruleComponentCategory ) ) ( (lv_name_2_0= ruleDottedName ) ) (otherlv_3= 'extends' this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )? this_ImplementationBody_5= ruleImplementationBody[$current] otherlv_6= ';'
            {
            // InternalAadlV3.g:1436:3: ( (lv_private_0_0= 'private' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==13) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAadlV3.g:1437:4: (lv_private_0_0= 'private' )
                    {
                    // InternalAadlV3.g:1437:4: (lv_private_0_0= 'private' )
                    // InternalAadlV3.g:1438:5: lv_private_0_0= 'private'
                    {
                    lv_private_0_0=(Token)match(input,13,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_private_0_0, grammarAccess.getComponentImplementationAccess().getPrivatePrivateKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getComponentImplementationRule());
                      					}
                      					setWithLastConsumed(current, "private", true, "private");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalAadlV3.g:1450:3: ( (lv_category_1_0= ruleComponentCategory ) )
            // InternalAadlV3.g:1451:4: (lv_category_1_0= ruleComponentCategory )
            {
            // InternalAadlV3.g:1451:4: (lv_category_1_0= ruleComponentCategory )
            // InternalAadlV3.g:1452:5: lv_category_1_0= ruleComponentCategory
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComponentImplementationAccess().getCategoryComponentCategoryParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_category_1_0=ruleComponentCategory();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getComponentImplementationRule());
              					}
              					set(
              						current,
              						"category",
              						lv_category_1_0,
              						"org.osate.xtext.aadlv3.AadlV3.ComponentCategory");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:1469:3: ( (lv_name_2_0= ruleDottedName ) )
            // InternalAadlV3.g:1470:4: (lv_name_2_0= ruleDottedName )
            {
            // InternalAadlV3.g:1470:4: (lv_name_2_0= ruleDottedName )
            // InternalAadlV3.g:1471:5: lv_name_2_0= ruleDottedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComponentImplementationAccess().getNameDottedNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_33);
            lv_name_2_0=ruleDottedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getComponentImplementationRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.osate.xtext.aadlv3.AadlV3.DottedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:1488:3: (otherlv_3= 'extends' this_ImplementationExtensions_4= ruleImplementationExtensions[$current] )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==30) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAadlV3.g:1489:4: otherlv_3= 'extends' this_ImplementationExtensions_4= ruleImplementationExtensions[$current]
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getComponentImplementationAccess().getExtendsKeyword_3_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getComponentImplementationRule());
                      				}
                      				newCompositeNode(grammarAccess.getComponentImplementationAccess().getImplementationExtensionsParserRuleCall_3_1());
                      			
                    }
                    pushFollow(FOLLOW_33);
                    this_ImplementationExtensions_4=ruleImplementationExtensions(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ImplementationExtensions_4;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getComponentImplementationRule());
              			}
              			newCompositeNode(grammarAccess.getComponentImplementationAccess().getImplementationBodyParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_9);
            this_ImplementationBody_5=ruleImplementationBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ImplementationBody_5;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_6=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getComponentImplementationAccess().getSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleComponentImplementation"


    // $ANTLR start "ruleImplementationBody"
    // InternalAadlV3.g:1531:1: ruleImplementationBody[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'is' (this_ImplementationElement_1= ruleImplementationElement[$current] )* otherlv_2= 'end' ) ;
    public final EObject ruleImplementationBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_ImplementationElement_1 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1537:2: ( (otherlv_0= 'is' (this_ImplementationElement_1= ruleImplementationElement[$current] )* otherlv_2= 'end' ) )
            // InternalAadlV3.g:1538:2: (otherlv_0= 'is' (this_ImplementationElement_1= ruleImplementationElement[$current] )* otherlv_2= 'end' )
            {
            // InternalAadlV3.g:1538:2: (otherlv_0= 'is' (this_ImplementationElement_1= ruleImplementationElement[$current] )* otherlv_2= 'end' )
            // InternalAadlV3.g:1539:3: otherlv_0= 'is' (this_ImplementationElement_1= ruleImplementationElement[$current] )* otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImplementationBodyAccess().getIsKeyword_0());
              		
            }
            // InternalAadlV3.g:1543:3: (this_ImplementationElement_1= ruleImplementationElement[$current] )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID||LA27_0==18||LA27_0==25||LA27_0==32) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalAadlV3.g:1544:4: this_ImplementationElement_1= ruleImplementationElement[$current]
            	    {
            	    if ( state.backtracking==0 ) {

            	      				/* */
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElement(grammarAccess.getImplementationBodyRule());
            	      				}
            	      				newCompositeNode(grammarAccess.getImplementationBodyAccess().getImplementationElementParserRuleCall_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_37);
            	    this_ImplementationElement_1=ruleImplementationElement(current);

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current = this_ImplementationElement_1;
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_2=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getImplementationBodyAccess().getEndKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleImplementationBody"


    // $ANTLR start "ruleImplementationElement"
    // InternalAadlV3.g:1568:1: ruleImplementationElement[EObject in_current] returns [EObject current=in_current] : ( ( (lv_connections_0_0= ruleConnection ) ) | ( (lv_bindings_1_0= ruleBinding ) ) | ( (lv_components_2_0= ruleSubcomponent ) ) | ( (lv_paths_3_0= rulePath ) ) | ( (lv_flowAssignments_4_0= ruleFlowAssignment ) ) | ( (lv_classifierAssignments_5_0= ruleClassifierAssignment ) ) | ( (lv_classifierAssignments_6_0= ruleClassifierAssignmentPattern ) ) | ( (lv_ownedPropertyAssociations_7_0= rulePropertyAssociation ) ) | ( (lv_annexSubclause_8_0= ruleAnnexSubclause ) ) ) ;
    public final EObject ruleImplementationElement(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_connections_0_0 = null;

        EObject lv_bindings_1_0 = null;

        EObject lv_components_2_0 = null;

        EObject lv_paths_3_0 = null;

        EObject lv_flowAssignments_4_0 = null;

        EObject lv_classifierAssignments_5_0 = null;

        EObject lv_classifierAssignments_6_0 = null;

        EObject lv_ownedPropertyAssociations_7_0 = null;

        EObject lv_annexSubclause_8_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1574:2: ( ( ( (lv_connections_0_0= ruleConnection ) ) | ( (lv_bindings_1_0= ruleBinding ) ) | ( (lv_components_2_0= ruleSubcomponent ) ) | ( (lv_paths_3_0= rulePath ) ) | ( (lv_flowAssignments_4_0= ruleFlowAssignment ) ) | ( (lv_classifierAssignments_5_0= ruleClassifierAssignment ) ) | ( (lv_classifierAssignments_6_0= ruleClassifierAssignmentPattern ) ) | ( (lv_ownedPropertyAssociations_7_0= rulePropertyAssociation ) ) | ( (lv_annexSubclause_8_0= ruleAnnexSubclause ) ) ) )
            // InternalAadlV3.g:1575:2: ( ( (lv_connections_0_0= ruleConnection ) ) | ( (lv_bindings_1_0= ruleBinding ) ) | ( (lv_components_2_0= ruleSubcomponent ) ) | ( (lv_paths_3_0= rulePath ) ) | ( (lv_flowAssignments_4_0= ruleFlowAssignment ) ) | ( (lv_classifierAssignments_5_0= ruleClassifierAssignment ) ) | ( (lv_classifierAssignments_6_0= ruleClassifierAssignmentPattern ) ) | ( (lv_ownedPropertyAssociations_7_0= rulePropertyAssociation ) ) | ( (lv_annexSubclause_8_0= ruleAnnexSubclause ) ) )
            {
            // InternalAadlV3.g:1575:2: ( ( (lv_connections_0_0= ruleConnection ) ) | ( (lv_bindings_1_0= ruleBinding ) ) | ( (lv_components_2_0= ruleSubcomponent ) ) | ( (lv_paths_3_0= rulePath ) ) | ( (lv_flowAssignments_4_0= ruleFlowAssignment ) ) | ( (lv_classifierAssignments_5_0= ruleClassifierAssignment ) ) | ( (lv_classifierAssignments_6_0= ruleClassifierAssignmentPattern ) ) | ( (lv_ownedPropertyAssociations_7_0= rulePropertyAssociation ) ) | ( (lv_annexSubclause_8_0= ruleAnnexSubclause ) ) )
            int alt28=9;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // InternalAadlV3.g:1576:3: ( (lv_connections_0_0= ruleConnection ) )
                    {
                    // InternalAadlV3.g:1576:3: ( (lv_connections_0_0= ruleConnection ) )
                    // InternalAadlV3.g:1577:4: (lv_connections_0_0= ruleConnection )
                    {
                    // InternalAadlV3.g:1577:4: (lv_connections_0_0= ruleConnection )
                    // InternalAadlV3.g:1578:5: lv_connections_0_0= ruleConnection
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getImplementationElementAccess().getConnectionsConnectionParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_connections_0_0=ruleConnection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getImplementationElementRule());
                      					}
                      					add(
                      						current,
                      						"connections",
                      						lv_connections_0_0,
                      						"org.osate.xtext.aadlv3.AadlV3.Connection");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:1596:3: ( (lv_bindings_1_0= ruleBinding ) )
                    {
                    // InternalAadlV3.g:1596:3: ( (lv_bindings_1_0= ruleBinding ) )
                    // InternalAadlV3.g:1597:4: (lv_bindings_1_0= ruleBinding )
                    {
                    // InternalAadlV3.g:1597:4: (lv_bindings_1_0= ruleBinding )
                    // InternalAadlV3.g:1598:5: lv_bindings_1_0= ruleBinding
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getImplementationElementAccess().getBindingsBindingParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_bindings_1_0=ruleBinding();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getImplementationElementRule());
                      					}
                      					add(
                      						current,
                      						"bindings",
                      						lv_bindings_1_0,
                      						"org.osate.xtext.aadlv3.AadlV3.Binding");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:1616:3: ( (lv_components_2_0= ruleSubcomponent ) )
                    {
                    // InternalAadlV3.g:1616:3: ( (lv_components_2_0= ruleSubcomponent ) )
                    // InternalAadlV3.g:1617:4: (lv_components_2_0= ruleSubcomponent )
                    {
                    // InternalAadlV3.g:1617:4: (lv_components_2_0= ruleSubcomponent )
                    // InternalAadlV3.g:1618:5: lv_components_2_0= ruleSubcomponent
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getImplementationElementAccess().getComponentsSubcomponentParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_components_2_0=ruleSubcomponent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getImplementationElementRule());
                      					}
                      					add(
                      						current,
                      						"components",
                      						lv_components_2_0,
                      						"org.osate.xtext.aadlv3.AadlV3.Subcomponent");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAadlV3.g:1636:3: ( (lv_paths_3_0= rulePath ) )
                    {
                    // InternalAadlV3.g:1636:3: ( (lv_paths_3_0= rulePath ) )
                    // InternalAadlV3.g:1637:4: (lv_paths_3_0= rulePath )
                    {
                    // InternalAadlV3.g:1637:4: (lv_paths_3_0= rulePath )
                    // InternalAadlV3.g:1638:5: lv_paths_3_0= rulePath
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getImplementationElementAccess().getPathsPathParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_paths_3_0=rulePath();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getImplementationElementRule());
                      					}
                      					add(
                      						current,
                      						"paths",
                      						lv_paths_3_0,
                      						"org.osate.xtext.aadlv3.AadlV3.Path");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalAadlV3.g:1656:3: ( (lv_flowAssignments_4_0= ruleFlowAssignment ) )
                    {
                    // InternalAadlV3.g:1656:3: ( (lv_flowAssignments_4_0= ruleFlowAssignment ) )
                    // InternalAadlV3.g:1657:4: (lv_flowAssignments_4_0= ruleFlowAssignment )
                    {
                    // InternalAadlV3.g:1657:4: (lv_flowAssignments_4_0= ruleFlowAssignment )
                    // InternalAadlV3.g:1658:5: lv_flowAssignments_4_0= ruleFlowAssignment
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getImplementationElementAccess().getFlowAssignmentsFlowAssignmentParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_flowAssignments_4_0=ruleFlowAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getImplementationElementRule());
                      					}
                      					add(
                      						current,
                      						"flowAssignments",
                      						lv_flowAssignments_4_0,
                      						"org.osate.xtext.aadlv3.AadlV3.FlowAssignment");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalAadlV3.g:1676:3: ( (lv_classifierAssignments_5_0= ruleClassifierAssignment ) )
                    {
                    // InternalAadlV3.g:1676:3: ( (lv_classifierAssignments_5_0= ruleClassifierAssignment ) )
                    // InternalAadlV3.g:1677:4: (lv_classifierAssignments_5_0= ruleClassifierAssignment )
                    {
                    // InternalAadlV3.g:1677:4: (lv_classifierAssignments_5_0= ruleClassifierAssignment )
                    // InternalAadlV3.g:1678:5: lv_classifierAssignments_5_0= ruleClassifierAssignment
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getImplementationElementAccess().getClassifierAssignmentsClassifierAssignmentParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_classifierAssignments_5_0=ruleClassifierAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getImplementationElementRule());
                      					}
                      					add(
                      						current,
                      						"classifierAssignments",
                      						lv_classifierAssignments_5_0,
                      						"org.osate.xtext.aadlv3.AadlV3.ClassifierAssignment");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalAadlV3.g:1696:3: ( (lv_classifierAssignments_6_0= ruleClassifierAssignmentPattern ) )
                    {
                    // InternalAadlV3.g:1696:3: ( (lv_classifierAssignments_6_0= ruleClassifierAssignmentPattern ) )
                    // InternalAadlV3.g:1697:4: (lv_classifierAssignments_6_0= ruleClassifierAssignmentPattern )
                    {
                    // InternalAadlV3.g:1697:4: (lv_classifierAssignments_6_0= ruleClassifierAssignmentPattern )
                    // InternalAadlV3.g:1698:5: lv_classifierAssignments_6_0= ruleClassifierAssignmentPattern
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getImplementationElementAccess().getClassifierAssignmentsClassifierAssignmentPatternParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_classifierAssignments_6_0=ruleClassifierAssignmentPattern();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getImplementationElementRule());
                      					}
                      					add(
                      						current,
                      						"classifierAssignments",
                      						lv_classifierAssignments_6_0,
                      						"org.osate.xtext.aadlv3.AadlV3.ClassifierAssignmentPattern");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalAadlV3.g:1716:3: ( (lv_ownedPropertyAssociations_7_0= rulePropertyAssociation ) )
                    {
                    // InternalAadlV3.g:1716:3: ( (lv_ownedPropertyAssociations_7_0= rulePropertyAssociation ) )
                    // InternalAadlV3.g:1717:4: (lv_ownedPropertyAssociations_7_0= rulePropertyAssociation )
                    {
                    // InternalAadlV3.g:1717:4: (lv_ownedPropertyAssociations_7_0= rulePropertyAssociation )
                    // InternalAadlV3.g:1718:5: lv_ownedPropertyAssociations_7_0= rulePropertyAssociation
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getImplementationElementAccess().getOwnedPropertyAssociationsPropertyAssociationParserRuleCall_7_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_ownedPropertyAssociations_7_0=rulePropertyAssociation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getImplementationElementRule());
                      					}
                      					add(
                      						current,
                      						"ownedPropertyAssociations",
                      						lv_ownedPropertyAssociations_7_0,
                      						"org.osate.xtext.aadlv3.AadlV3.PropertyAssociation");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalAadlV3.g:1736:3: ( (lv_annexSubclause_8_0= ruleAnnexSubclause ) )
                    {
                    // InternalAadlV3.g:1736:3: ( (lv_annexSubclause_8_0= ruleAnnexSubclause ) )
                    // InternalAadlV3.g:1737:4: (lv_annexSubclause_8_0= ruleAnnexSubclause )
                    {
                    // InternalAadlV3.g:1737:4: (lv_annexSubclause_8_0= ruleAnnexSubclause )
                    // InternalAadlV3.g:1738:5: lv_annexSubclause_8_0= ruleAnnexSubclause
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getImplementationElementAccess().getAnnexSubclauseAnnexSubclauseParserRuleCall_8_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_annexSubclause_8_0=ruleAnnexSubclause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getImplementationElementRule());
                      					}
                      					add(
                      						current,
                      						"annexSubclause",
                      						lv_annexSubclause_8_0,
                      						"org.osate.xtext.aadlv3.AadlV3.AnnexSubclause");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleImplementationElement"


    // $ANTLR start "entryRuleComponentConfiguration"
    // InternalAadlV3.g:1759:1: entryRuleComponentConfiguration returns [EObject current=null] : iv_ruleComponentConfiguration= ruleComponentConfiguration EOF ;
    public final EObject entryRuleComponentConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentConfiguration = null;


        try {
            // InternalAadlV3.g:1759:63: (iv_ruleComponentConfiguration= ruleComponentConfiguration EOF )
            // InternalAadlV3.g:1760:2: iv_ruleComponentConfiguration= ruleComponentConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComponentConfigurationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComponentConfiguration=ruleComponentConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComponentConfiguration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComponentConfiguration"


    // $ANTLR start "ruleComponentConfiguration"
    // InternalAadlV3.g:1766:1: ruleComponentConfiguration returns [EObject current=null] : ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'configuration' ( (lv_name_2_0= ruleDottedName ) ) (this_Parameters_3= ruleParameters[$current] )? (otherlv_4= 'extends' this_ConfigurationExtensions_5= ruleConfigurationExtensions[$current] )? this_ConfigurationElementBlock_6= ruleConfigurationElementBlock[$current] otherlv_7= ';' ) ;
    public final EObject ruleComponentConfiguration() throws RecognitionException {
        EObject current = null;

        Token lv_private_0_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject this_Parameters_3 = null;

        EObject this_ConfigurationExtensions_5 = null;

        EObject this_ConfigurationElementBlock_6 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1772:2: ( ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'configuration' ( (lv_name_2_0= ruleDottedName ) ) (this_Parameters_3= ruleParameters[$current] )? (otherlv_4= 'extends' this_ConfigurationExtensions_5= ruleConfigurationExtensions[$current] )? this_ConfigurationElementBlock_6= ruleConfigurationElementBlock[$current] otherlv_7= ';' ) )
            // InternalAadlV3.g:1773:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'configuration' ( (lv_name_2_0= ruleDottedName ) ) (this_Parameters_3= ruleParameters[$current] )? (otherlv_4= 'extends' this_ConfigurationExtensions_5= ruleConfigurationExtensions[$current] )? this_ConfigurationElementBlock_6= ruleConfigurationElementBlock[$current] otherlv_7= ';' )
            {
            // InternalAadlV3.g:1773:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'configuration' ( (lv_name_2_0= ruleDottedName ) ) (this_Parameters_3= ruleParameters[$current] )? (otherlv_4= 'extends' this_ConfigurationExtensions_5= ruleConfigurationExtensions[$current] )? this_ConfigurationElementBlock_6= ruleConfigurationElementBlock[$current] otherlv_7= ';' )
            // InternalAadlV3.g:1774:3: ( (lv_private_0_0= 'private' ) )? otherlv_1= 'configuration' ( (lv_name_2_0= ruleDottedName ) ) (this_Parameters_3= ruleParameters[$current] )? (otherlv_4= 'extends' this_ConfigurationExtensions_5= ruleConfigurationExtensions[$current] )? this_ConfigurationElementBlock_6= ruleConfigurationElementBlock[$current] otherlv_7= ';'
            {
            // InternalAadlV3.g:1774:3: ( (lv_private_0_0= 'private' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==13) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAadlV3.g:1775:4: (lv_private_0_0= 'private' )
                    {
                    // InternalAadlV3.g:1775:4: (lv_private_0_0= 'private' )
                    // InternalAadlV3.g:1776:5: lv_private_0_0= 'private'
                    {
                    lv_private_0_0=(Token)match(input,13,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_private_0_0, grammarAccess.getComponentConfigurationAccess().getPrivatePrivateKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getComponentConfigurationRule());
                      					}
                      					setWithLastConsumed(current, "private", true, "private");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,38,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getComponentConfigurationAccess().getConfigurationKeyword_1());
              		
            }
            // InternalAadlV3.g:1792:3: ( (lv_name_2_0= ruleDottedName ) )
            // InternalAadlV3.g:1793:4: (lv_name_2_0= ruleDottedName )
            {
            // InternalAadlV3.g:1793:4: (lv_name_2_0= ruleDottedName )
            // InternalAadlV3.g:1794:5: lv_name_2_0= ruleDottedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComponentConfigurationAccess().getNameDottedNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_39);
            lv_name_2_0=ruleDottedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getComponentConfigurationRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.osate.xtext.aadlv3.AadlV3.DottedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:1811:3: (this_Parameters_3= ruleParameters[$current] )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==24) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAadlV3.g:1812:4: this_Parameters_3= ruleParameters[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getComponentConfigurationRule());
                      				}
                      				newCompositeNode(grammarAccess.getComponentConfigurationAccess().getParametersParserRuleCall_3());
                      			
                    }
                    pushFollow(FOLLOW_39);
                    this_Parameters_3=ruleParameters(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Parameters_3;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalAadlV3.g:1827:3: (otherlv_4= 'extends' this_ConfigurationExtensions_5= ruleConfigurationExtensions[$current] )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==30) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAadlV3.g:1828:4: otherlv_4= 'extends' this_ConfigurationExtensions_5= ruleConfigurationExtensions[$current]
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getComponentConfigurationAccess().getExtendsKeyword_4_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getComponentConfigurationRule());
                      				}
                      				newCompositeNode(grammarAccess.getComponentConfigurationAccess().getConfigurationExtensionsParserRuleCall_4_1());
                      			
                    }
                    pushFollow(FOLLOW_39);
                    this_ConfigurationExtensions_5=ruleConfigurationExtensions(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ConfigurationExtensions_5;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getComponentConfigurationRule());
              			}
              			newCompositeNode(grammarAccess.getComponentConfigurationAccess().getConfigurationElementBlockParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_9);
            this_ConfigurationElementBlock_6=ruleConfigurationElementBlock(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ConfigurationElementBlock_6;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_7=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getComponentConfigurationAccess().getSemicolonKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleComponentConfiguration"


    // $ANTLR start "entryRuleFeature"
    // InternalAadlV3.g:1869:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalAadlV3.g:1869:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalAadlV3.g:1870:2: iv_ruleFeature= ruleFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeature; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalAadlV3.g:1876:1: ruleFeature returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_category_3_0= ruleFeatureCategory ) ) ( (lv_typeReference_4_0= ruleReversableTypeReference ) )? (this_PropertiesBlock_5= rulePropertiesBlock[$current] )? otherlv_6= ';' ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_direction_2_0 = null;

        AntlrDatatypeRuleToken lv_category_3_0 = null;

        EObject lv_typeReference_4_0 = null;

        EObject this_PropertiesBlock_5 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1882:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_category_3_0= ruleFeatureCategory ) ) ( (lv_typeReference_4_0= ruleReversableTypeReference ) )? (this_PropertiesBlock_5= rulePropertiesBlock[$current] )? otherlv_6= ';' ) )
            // InternalAadlV3.g:1883:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_category_3_0= ruleFeatureCategory ) ) ( (lv_typeReference_4_0= ruleReversableTypeReference ) )? (this_PropertiesBlock_5= rulePropertiesBlock[$current] )? otherlv_6= ';' )
            {
            // InternalAadlV3.g:1883:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_category_3_0= ruleFeatureCategory ) ) ( (lv_typeReference_4_0= ruleReversableTypeReference ) )? (this_PropertiesBlock_5= rulePropertiesBlock[$current] )? otherlv_6= ';' )
            // InternalAadlV3.g:1884:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_category_3_0= ruleFeatureCategory ) ) ( (lv_typeReference_4_0= ruleReversableTypeReference ) )? (this_PropertiesBlock_5= rulePropertiesBlock[$current] )? otherlv_6= ';'
            {
            // InternalAadlV3.g:1884:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:1885:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:1885:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:1886:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFeatureRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:1906:3: ( (lv_direction_2_0= ruleFeatureDirection ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=76 && LA32_0<=79)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAadlV3.g:1907:4: (lv_direction_2_0= ruleFeatureDirection )
                    {
                    // InternalAadlV3.g:1907:4: (lv_direction_2_0= ruleFeatureDirection )
                    // InternalAadlV3.g:1908:5: lv_direction_2_0= ruleFeatureDirection
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFeatureAccess().getDirectionFeatureDirectionParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_41);
                    lv_direction_2_0=ruleFeatureDirection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFeatureRule());
                      					}
                      					set(
                      						current,
                      						"direction",
                      						lv_direction_2_0,
                      						"org.osate.xtext.aadlv3.AadlV3.FeatureDirection");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalAadlV3.g:1925:3: ( (lv_category_3_0= ruleFeatureCategory ) )
            // InternalAadlV3.g:1926:4: (lv_category_3_0= ruleFeatureCategory )
            {
            // InternalAadlV3.g:1926:4: (lv_category_3_0= ruleFeatureCategory )
            // InternalAadlV3.g:1927:5: lv_category_3_0= ruleFeatureCategory
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFeatureAccess().getCategoryFeatureCategoryParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_42);
            lv_category_3_0=ruleFeatureCategory();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFeatureRule());
              					}
              					set(
              						current,
              						"category",
              						lv_category_3_0,
              						"org.osate.xtext.aadlv3.AadlV3.FeatureCategory");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:1944:3: ( (lv_typeReference_4_0= ruleReversableTypeReference ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID||LA33_0==45) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAadlV3.g:1945:4: (lv_typeReference_4_0= ruleReversableTypeReference )
                    {
                    // InternalAadlV3.g:1945:4: (lv_typeReference_4_0= ruleReversableTypeReference )
                    // InternalAadlV3.g:1946:5: lv_typeReference_4_0= ruleReversableTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFeatureAccess().getTypeReferenceReversableTypeReferenceParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_25);
                    lv_typeReference_4_0=ruleReversableTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFeatureRule());
                      					}
                      					set(
                      						current,
                      						"typeReference",
                      						lv_typeReference_4_0,
                      						"org.osate.xtext.aadlv3.AadlV3.ReversableTypeReference");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalAadlV3.g:1963:3: (this_PropertiesBlock_5= rulePropertiesBlock[$current] )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==19) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAadlV3.g:1964:4: this_PropertiesBlock_5= rulePropertiesBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getFeatureRule());
                      				}
                      				newCompositeNode(grammarAccess.getFeatureAccess().getPropertiesBlockParserRuleCall_5());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_PropertiesBlock_5=rulePropertiesBlock(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_PropertiesBlock_5;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getFeatureAccess().getSemicolonKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleSubcomponent"
    // InternalAadlV3.g:1987:1: entryRuleSubcomponent returns [EObject current=null] : iv_ruleSubcomponent= ruleSubcomponent EOF ;
    public final EObject entryRuleSubcomponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubcomponent = null;


        try {
            // InternalAadlV3.g:1987:53: (iv_ruleSubcomponent= ruleSubcomponent EOF )
            // InternalAadlV3.g:1988:2: iv_ruleSubcomponent= ruleSubcomponent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubcomponentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSubcomponent=ruleSubcomponent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubcomponent; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSubcomponent"


    // $ANTLR start "ruleSubcomponent"
    // InternalAadlV3.g:1994:1: ruleSubcomponent returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_category_3_0= ruleComponentCategory ) ) ( (lv_typeReferences_4_0= ruleClassifierOrTypeReference ) )? (this_NestedComponentImplementationBlock_5= ruleNestedComponentImplementationBlock[$current] )? otherlv_6= ';' ) ;
    public final EObject ruleSubcomponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_category_3_0 = null;

        EObject lv_typeReferences_4_0 = null;

        EObject this_NestedComponentImplementationBlock_5 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2000:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_category_3_0= ruleComponentCategory ) ) ( (lv_typeReferences_4_0= ruleClassifierOrTypeReference ) )? (this_NestedComponentImplementationBlock_5= ruleNestedComponentImplementationBlock[$current] )? otherlv_6= ';' ) )
            // InternalAadlV3.g:2001:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_category_3_0= ruleComponentCategory ) ) ( (lv_typeReferences_4_0= ruleClassifierOrTypeReference ) )? (this_NestedComponentImplementationBlock_5= ruleNestedComponentImplementationBlock[$current] )? otherlv_6= ';' )
            {
            // InternalAadlV3.g:2001:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_category_3_0= ruleComponentCategory ) ) ( (lv_typeReferences_4_0= ruleClassifierOrTypeReference ) )? (this_NestedComponentImplementationBlock_5= ruleNestedComponentImplementationBlock[$current] )? otherlv_6= ';' )
            // InternalAadlV3.g:2002:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_category_3_0= ruleComponentCategory ) ) ( (lv_typeReferences_4_0= ruleClassifierOrTypeReference ) )? (this_NestedComponentImplementationBlock_5= ruleNestedComponentImplementationBlock[$current] )? otherlv_6= ';'
            {
            // InternalAadlV3.g:2002:3: ()
            // InternalAadlV3.g:2003:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSubcomponentAccess().getSubcomponentAction_0(),
              					current);
              			
            }

            }

            // InternalAadlV3.g:2012:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAadlV3.g:2013:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAadlV3.g:2013:4: (lv_name_1_0= RULE_ID )
            // InternalAadlV3.g:2014:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getSubcomponentAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSubcomponentRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSubcomponentAccess().getColonKeyword_2());
              		
            }
            // InternalAadlV3.g:2034:3: ( (lv_category_3_0= ruleComponentCategory ) )
            // InternalAadlV3.g:2035:4: (lv_category_3_0= ruleComponentCategory )
            {
            // InternalAadlV3.g:2035:4: (lv_category_3_0= ruleComponentCategory )
            // InternalAadlV3.g:2036:5: lv_category_3_0= ruleComponentCategory
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSubcomponentAccess().getCategoryComponentCategoryParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_43);
            lv_category_3_0=ruleComponentCategory();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSubcomponentRule());
              					}
              					set(
              						current,
              						"category",
              						lv_category_3_0,
              						"org.osate.xtext.aadlv3.AadlV3.ComponentCategory");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:2053:3: ( (lv_typeReferences_4_0= ruleClassifierOrTypeReference ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalAadlV3.g:2054:4: (lv_typeReferences_4_0= ruleClassifierOrTypeReference )
                    {
                    // InternalAadlV3.g:2054:4: (lv_typeReferences_4_0= ruleClassifierOrTypeReference )
                    // InternalAadlV3.g:2055:5: lv_typeReferences_4_0= ruleClassifierOrTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSubcomponentAccess().getTypeReferencesClassifierOrTypeReferenceParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_25);
                    lv_typeReferences_4_0=ruleClassifierOrTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSubcomponentRule());
                      					}
                      					add(
                      						current,
                      						"typeReferences",
                      						lv_typeReferences_4_0,
                      						"org.osate.xtext.aadlv3.AadlV3.ClassifierOrTypeReference");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalAadlV3.g:2072:3: (this_NestedComponentImplementationBlock_5= ruleNestedComponentImplementationBlock[$current] )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==19) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAadlV3.g:2073:4: this_NestedComponentImplementationBlock_5= ruleNestedComponentImplementationBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getSubcomponentRule());
                      				}
                      				newCompositeNode(grammarAccess.getSubcomponentAccess().getNestedComponentImplementationBlockParserRuleCall_5());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_NestedComponentImplementationBlock_5=ruleNestedComponentImplementationBlock(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_NestedComponentImplementationBlock_5;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getSubcomponentAccess().getSemicolonKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSubcomponent"


    // $ANTLR start "entryRuleConnection"
    // InternalAadlV3.g:2096:1: entryRuleConnection returns [EObject current=null] : iv_ruleConnection= ruleConnection EOF ;
    public final EObject entryRuleConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnection = null;


        try {
            // InternalAadlV3.g:2096:51: (iv_ruleConnection= ruleConnection EOF )
            // InternalAadlV3.g:2097:2: iv_ruleConnection= ruleConnection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConnectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConnection=ruleConnection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConnection; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConnection"


    // $ANTLR start "ruleConnection"
    // InternalAadlV3.g:2103:1: ruleConnection returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsConnection ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (otherlv_4= '->' | ( (lv_bidirectional_5_0= '<->' ) ) ) ( (lv_destination_6_0= ruleModelElementReference ) ) (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? otherlv_8= ';' ) ;
    public final EObject ruleConnection() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token lv_bidirectional_5_0=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_associationType_2_0 = null;

        EObject lv_source_3_0 = null;

        EObject lv_destination_6_0 = null;

        EObject this_PropertiesBlock_7 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2109:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsConnection ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (otherlv_4= '->' | ( (lv_bidirectional_5_0= '<->' ) ) ) ( (lv_destination_6_0= ruleModelElementReference ) ) (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? otherlv_8= ';' ) )
            // InternalAadlV3.g:2110:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsConnection ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (otherlv_4= '->' | ( (lv_bidirectional_5_0= '<->' ) ) ) ( (lv_destination_6_0= ruleModelElementReference ) ) (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? otherlv_8= ';' )
            {
            // InternalAadlV3.g:2110:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsConnection ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (otherlv_4= '->' | ( (lv_bidirectional_5_0= '<->' ) ) ) ( (lv_destination_6_0= ruleModelElementReference ) ) (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? otherlv_8= ';' )
            // InternalAadlV3.g:2111:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsConnection ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (otherlv_4= '->' | ( (lv_bidirectional_5_0= '<->' ) ) ) ( (lv_destination_6_0= ruleModelElementReference ) ) (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? otherlv_8= ';'
            {
            // InternalAadlV3.g:2111:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:2112:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:2112:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:2113:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getConnectionAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConnectionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConnectionAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:2133:3: ( (lv_associationType_2_0= ruleIsConnection ) )
            // InternalAadlV3.g:2134:4: (lv_associationType_2_0= ruleIsConnection )
            {
            // InternalAadlV3.g:2134:4: (lv_associationType_2_0= ruleIsConnection )
            // InternalAadlV3.g:2135:5: lv_associationType_2_0= ruleIsConnection
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConnectionAccess().getAssociationTypeIsConnectionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_associationType_2_0=ruleIsConnection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConnectionRule());
              					}
              					set(
              						current,
              						"associationType",
              						lv_associationType_2_0,
              						"org.osate.xtext.aadlv3.AadlV3.IsConnection");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:2152:3: ( (lv_source_3_0= ruleModelElementReference ) )
            // InternalAadlV3.g:2153:4: (lv_source_3_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:2153:4: (lv_source_3_0= ruleModelElementReference )
            // InternalAadlV3.g:2154:5: lv_source_3_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConnectionAccess().getSourceModelElementReferenceParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_45);
            lv_source_3_0=ruleModelElementReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConnectionRule());
              					}
              					set(
              						current,
              						"source",
              						lv_source_3_0,
              						"org.osate.xtext.aadlv3.AadlV3.ModelElementReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:2171:3: (otherlv_4= '->' | ( (lv_bidirectional_5_0= '<->' ) ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==39) ) {
                alt37=1;
            }
            else if ( (LA37_0==40) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalAadlV3.g:2172:4: otherlv_4= '->'
                    {
                    otherlv_4=(Token)match(input,39,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getConnectionAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:2177:4: ( (lv_bidirectional_5_0= '<->' ) )
                    {
                    // InternalAadlV3.g:2177:4: ( (lv_bidirectional_5_0= '<->' ) )
                    // InternalAadlV3.g:2178:5: (lv_bidirectional_5_0= '<->' )
                    {
                    // InternalAadlV3.g:2178:5: (lv_bidirectional_5_0= '<->' )
                    // InternalAadlV3.g:2179:6: lv_bidirectional_5_0= '<->'
                    {
                    lv_bidirectional_5_0=(Token)match(input,40,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_bidirectional_5_0, grammarAccess.getConnectionAccess().getBidirectionalLessThanSignHyphenMinusGreaterThanSignKeyword_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConnectionRule());
                      						}
                      						setWithLastConsumed(current, "bidirectional", true, "<->");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalAadlV3.g:2192:3: ( (lv_destination_6_0= ruleModelElementReference ) )
            // InternalAadlV3.g:2193:4: (lv_destination_6_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:2193:4: (lv_destination_6_0= ruleModelElementReference )
            // InternalAadlV3.g:2194:5: lv_destination_6_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConnectionAccess().getDestinationModelElementReferenceParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_destination_6_0=ruleModelElementReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConnectionRule());
              					}
              					set(
              						current,
              						"destination",
              						lv_destination_6_0,
              						"org.osate.xtext.aadlv3.AadlV3.ModelElementReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:2211:3: (this_PropertiesBlock_7= rulePropertiesBlock[$current] )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==19) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalAadlV3.g:2212:4: this_PropertiesBlock_7= rulePropertiesBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getConnectionRule());
                      				}
                      				newCompositeNode(grammarAccess.getConnectionAccess().getPropertiesBlockParserRuleCall_6());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_PropertiesBlock_7=rulePropertiesBlock(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_PropertiesBlock_7;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getConnectionAccess().getSemicolonKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConnection"


    // $ANTLR start "entryRuleBinding"
    // InternalAadlV3.g:2235:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalAadlV3.g:2235:48: (iv_ruleBinding= ruleBinding EOF )
            // InternalAadlV3.g:2236:2: iv_ruleBinding= ruleBinding EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBindingRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBinding=ruleBinding();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinding; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // InternalAadlV3.g:2242:1: ruleBinding returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) )? ( (lv_associationType_3_0= ruleIsBinding ) ) ( (lv_source_4_0= ruleModelElementReference ) ) otherlv_5= '->' ( (lv_destination_6_0= ruleModelElementReference ) ) (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? otherlv_8= ';' ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_associationType_3_0 = null;

        EObject lv_source_4_0 = null;

        EObject lv_destination_6_0 = null;

        EObject this_PropertiesBlock_7 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2248:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) )? ( (lv_associationType_3_0= ruleIsBinding ) ) ( (lv_source_4_0= ruleModelElementReference ) ) otherlv_5= '->' ( (lv_destination_6_0= ruleModelElementReference ) ) (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? otherlv_8= ';' ) )
            // InternalAadlV3.g:2249:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) )? ( (lv_associationType_3_0= ruleIsBinding ) ) ( (lv_source_4_0= ruleModelElementReference ) ) otherlv_5= '->' ( (lv_destination_6_0= ruleModelElementReference ) ) (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? otherlv_8= ';' )
            {
            // InternalAadlV3.g:2249:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) )? ( (lv_associationType_3_0= ruleIsBinding ) ) ( (lv_source_4_0= ruleModelElementReference ) ) otherlv_5= '->' ( (lv_destination_6_0= ruleModelElementReference ) ) (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? otherlv_8= ';' )
            // InternalAadlV3.g:2250:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) )? ( (lv_associationType_3_0= ruleIsBinding ) ) ( (lv_source_4_0= ruleModelElementReference ) ) otherlv_5= '->' ( (lv_destination_6_0= ruleModelElementReference ) ) (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? otherlv_8= ';'
            {
            // InternalAadlV3.g:2250:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:2251:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:2251:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:2252:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getBindingAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBindingRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:2272:3: ( ( ruleQualifiedName ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalAadlV3.g:2273:4: ( ruleQualifiedName )
                    {
                    // InternalAadlV3.g:2273:4: ( ruleQualifiedName )
                    // InternalAadlV3.g:2274:5: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBindingRule());
                      					}
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBindingAccess().getBindingTypeTypeDefCrossReference_2_0());
                      				
                    }
                    pushFollow(FOLLOW_47);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalAadlV3.g:2291:3: ( (lv_associationType_3_0= ruleIsBinding ) )
            // InternalAadlV3.g:2292:4: (lv_associationType_3_0= ruleIsBinding )
            {
            // InternalAadlV3.g:2292:4: (lv_associationType_3_0= ruleIsBinding )
            // InternalAadlV3.g:2293:5: lv_associationType_3_0= ruleIsBinding
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBindingAccess().getAssociationTypeIsBindingParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_associationType_3_0=ruleIsBinding();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBindingRule());
              					}
              					set(
              						current,
              						"associationType",
              						lv_associationType_3_0,
              						"org.osate.xtext.aadlv3.AadlV3.IsBinding");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:2310:3: ( (lv_source_4_0= ruleModelElementReference ) )
            // InternalAadlV3.g:2311:4: (lv_source_4_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:2311:4: (lv_source_4_0= ruleModelElementReference )
            // InternalAadlV3.g:2312:5: lv_source_4_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBindingAccess().getSourceModelElementReferenceParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_48);
            lv_source_4_0=ruleModelElementReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBindingRule());
              					}
              					set(
              						current,
              						"source",
              						lv_source_4_0,
              						"org.osate.xtext.aadlv3.AadlV3.ModelElementReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,39,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getBindingAccess().getHyphenMinusGreaterThanSignKeyword_5());
              		
            }
            // InternalAadlV3.g:2333:3: ( (lv_destination_6_0= ruleModelElementReference ) )
            // InternalAadlV3.g:2334:4: (lv_destination_6_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:2334:4: (lv_destination_6_0= ruleModelElementReference )
            // InternalAadlV3.g:2335:5: lv_destination_6_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBindingAccess().getDestinationModelElementReferenceParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_destination_6_0=ruleModelElementReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBindingRule());
              					}
              					set(
              						current,
              						"destination",
              						lv_destination_6_0,
              						"org.osate.xtext.aadlv3.AadlV3.ModelElementReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:2352:3: (this_PropertiesBlock_7= rulePropertiesBlock[$current] )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==19) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalAadlV3.g:2353:4: this_PropertiesBlock_7= rulePropertiesBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getBindingRule());
                      				}
                      				newCompositeNode(grammarAccess.getBindingAccess().getPropertiesBlockParserRuleCall_7());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_PropertiesBlock_7=rulePropertiesBlock(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_PropertiesBlock_7;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getBindingAccess().getSemicolonKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleFlowPath"
    // InternalAadlV3.g:2376:1: entryRuleFlowPath returns [EObject current=null] : iv_ruleFlowPath= ruleFlowPath EOF ;
    public final EObject entryRuleFlowPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowPath = null;


        try {
            // InternalAadlV3.g:2376:49: (iv_ruleFlowPath= ruleFlowPath EOF )
            // InternalAadlV3.g:2377:2: iv_ruleFlowPath= ruleFlowPath EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFlowPathRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFlowPath=ruleFlowPath();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFlowPath; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFlowPath"


    // $ANTLR start "ruleFlowPath"
    // InternalAadlV3.g:2383:1: ruleFlowPath returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsFlow ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? otherlv_7= ';' ) ;
    public final EObject ruleFlowPath() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_associationType_2_0 = null;

        EObject lv_source_3_0 = null;

        EObject lv_destination_5_0 = null;

        EObject this_PropertiesBlock_6 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2389:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsFlow ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? otherlv_7= ';' ) )
            // InternalAadlV3.g:2390:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsFlow ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? otherlv_7= ';' )
            {
            // InternalAadlV3.g:2390:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsFlow ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? otherlv_7= ';' )
            // InternalAadlV3.g:2391:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsFlow ) ) ( (lv_source_3_0= ruleModelElementReference ) ) otherlv_4= '->' ( (lv_destination_5_0= ruleModelElementReference ) ) (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? otherlv_7= ';'
            {
            // InternalAadlV3.g:2391:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:2392:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:2392:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:2393:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getFlowPathAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFlowPathRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFlowPathAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:2413:3: ( (lv_associationType_2_0= ruleIsFlow ) )
            // InternalAadlV3.g:2414:4: (lv_associationType_2_0= ruleIsFlow )
            {
            // InternalAadlV3.g:2414:4: (lv_associationType_2_0= ruleIsFlow )
            // InternalAadlV3.g:2415:5: lv_associationType_2_0= ruleIsFlow
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowPathAccess().getAssociationTypeIsFlowParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_associationType_2_0=ruleIsFlow();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFlowPathRule());
              					}
              					set(
              						current,
              						"associationType",
              						lv_associationType_2_0,
              						"org.osate.xtext.aadlv3.AadlV3.IsFlow");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:2432:3: ( (lv_source_3_0= ruleModelElementReference ) )
            // InternalAadlV3.g:2433:4: (lv_source_3_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:2433:4: (lv_source_3_0= ruleModelElementReference )
            // InternalAadlV3.g:2434:5: lv_source_3_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowPathAccess().getSourceModelElementReferenceParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_48);
            lv_source_3_0=ruleModelElementReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFlowPathRule());
              					}
              					set(
              						current,
              						"source",
              						lv_source_3_0,
              						"org.osate.xtext.aadlv3.AadlV3.ModelElementReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,39,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getFlowPathAccess().getHyphenMinusGreaterThanSignKeyword_4());
              		
            }
            // InternalAadlV3.g:2455:3: ( (lv_destination_5_0= ruleModelElementReference ) )
            // InternalAadlV3.g:2456:4: (lv_destination_5_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:2456:4: (lv_destination_5_0= ruleModelElementReference )
            // InternalAadlV3.g:2457:5: lv_destination_5_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowPathAccess().getDestinationModelElementReferenceParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_destination_5_0=ruleModelElementReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFlowPathRule());
              					}
              					set(
              						current,
              						"destination",
              						lv_destination_5_0,
              						"org.osate.xtext.aadlv3.AadlV3.ModelElementReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:2474:3: (this_PropertiesBlock_6= rulePropertiesBlock[$current] )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==19) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalAadlV3.g:2475:4: this_PropertiesBlock_6= rulePropertiesBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getFlowPathRule());
                      				}
                      				newCompositeNode(grammarAccess.getFlowPathAccess().getPropertiesBlockParserRuleCall_6());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_PropertiesBlock_6=rulePropertiesBlock(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_PropertiesBlock_6;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getFlowPathAccess().getSemicolonKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFlowPath"


    // $ANTLR start "entryRuleFlowSource"
    // InternalAadlV3.g:2498:1: entryRuleFlowSource returns [EObject current=null] : iv_ruleFlowSource= ruleFlowSource EOF ;
    public final EObject entryRuleFlowSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowSource = null;


        try {
            // InternalAadlV3.g:2498:51: (iv_ruleFlowSource= ruleFlowSource EOF )
            // InternalAadlV3.g:2499:2: iv_ruleFlowSource= ruleFlowSource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFlowSourceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFlowSource=ruleFlowSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFlowSource; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFlowSource"


    // $ANTLR start "ruleFlowSource"
    // InternalAadlV3.g:2505:1: ruleFlowSource returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsFlowSource ) ) ( (lv_destination_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? otherlv_5= ';' ) ;
    public final EObject ruleFlowSource() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_associationType_2_0 = null;

        EObject lv_destination_3_0 = null;

        EObject this_PropertiesBlock_4 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2511:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsFlowSource ) ) ( (lv_destination_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? otherlv_5= ';' ) )
            // InternalAadlV3.g:2512:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsFlowSource ) ) ( (lv_destination_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? otherlv_5= ';' )
            {
            // InternalAadlV3.g:2512:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsFlowSource ) ) ( (lv_destination_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? otherlv_5= ';' )
            // InternalAadlV3.g:2513:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsFlowSource ) ) ( (lv_destination_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? otherlv_5= ';'
            {
            // InternalAadlV3.g:2513:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:2514:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:2514:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:2515:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getFlowSourceAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFlowSourceRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFlowSourceAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:2535:3: ( (lv_associationType_2_0= ruleIsFlowSource ) )
            // InternalAadlV3.g:2536:4: (lv_associationType_2_0= ruleIsFlowSource )
            {
            // InternalAadlV3.g:2536:4: (lv_associationType_2_0= ruleIsFlowSource )
            // InternalAadlV3.g:2537:5: lv_associationType_2_0= ruleIsFlowSource
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowSourceAccess().getAssociationTypeIsFlowSourceParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_associationType_2_0=ruleIsFlowSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFlowSourceRule());
              					}
              					set(
              						current,
              						"associationType",
              						lv_associationType_2_0,
              						"org.osate.xtext.aadlv3.AadlV3.IsFlowSource");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:2554:3: ( (lv_destination_3_0= ruleModelElementReference ) )
            // InternalAadlV3.g:2555:4: (lv_destination_3_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:2555:4: (lv_destination_3_0= ruleModelElementReference )
            // InternalAadlV3.g:2556:5: lv_destination_3_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowSourceAccess().getDestinationModelElementReferenceParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_destination_3_0=ruleModelElementReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFlowSourceRule());
              					}
              					set(
              						current,
              						"destination",
              						lv_destination_3_0,
              						"org.osate.xtext.aadlv3.AadlV3.ModelElementReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:2573:3: (this_PropertiesBlock_4= rulePropertiesBlock[$current] )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==19) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalAadlV3.g:2574:4: this_PropertiesBlock_4= rulePropertiesBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getFlowSourceRule());
                      				}
                      				newCompositeNode(grammarAccess.getFlowSourceAccess().getPropertiesBlockParserRuleCall_4());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_PropertiesBlock_4=rulePropertiesBlock(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_PropertiesBlock_4;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getFlowSourceAccess().getSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFlowSource"


    // $ANTLR start "entryRuleFlowSink"
    // InternalAadlV3.g:2597:1: entryRuleFlowSink returns [EObject current=null] : iv_ruleFlowSink= ruleFlowSink EOF ;
    public final EObject entryRuleFlowSink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowSink = null;


        try {
            // InternalAadlV3.g:2597:49: (iv_ruleFlowSink= ruleFlowSink EOF )
            // InternalAadlV3.g:2598:2: iv_ruleFlowSink= ruleFlowSink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFlowSinkRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFlowSink=ruleFlowSink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFlowSink; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFlowSink"


    // $ANTLR start "ruleFlowSink"
    // InternalAadlV3.g:2604:1: ruleFlowSink returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsFlowSink ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? otherlv_5= ';' ) ;
    public final EObject ruleFlowSink() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_associationType_2_0 = null;

        EObject lv_source_3_0 = null;

        EObject this_PropertiesBlock_4 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2610:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsFlowSink ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? otherlv_5= ';' ) )
            // InternalAadlV3.g:2611:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsFlowSink ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? otherlv_5= ';' )
            {
            // InternalAadlV3.g:2611:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsFlowSink ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? otherlv_5= ';' )
            // InternalAadlV3.g:2612:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsFlowSink ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (this_PropertiesBlock_4= rulePropertiesBlock[$current] )? otherlv_5= ';'
            {
            // InternalAadlV3.g:2612:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:2613:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:2613:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:2614:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getFlowSinkAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFlowSinkRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFlowSinkAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:2634:3: ( (lv_associationType_2_0= ruleIsFlowSink ) )
            // InternalAadlV3.g:2635:4: (lv_associationType_2_0= ruleIsFlowSink )
            {
            // InternalAadlV3.g:2635:4: (lv_associationType_2_0= ruleIsFlowSink )
            // InternalAadlV3.g:2636:5: lv_associationType_2_0= ruleIsFlowSink
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowSinkAccess().getAssociationTypeIsFlowSinkParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_associationType_2_0=ruleIsFlowSink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFlowSinkRule());
              					}
              					set(
              						current,
              						"associationType",
              						lv_associationType_2_0,
              						"org.osate.xtext.aadlv3.AadlV3.IsFlowSink");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:2653:3: ( (lv_source_3_0= ruleModelElementReference ) )
            // InternalAadlV3.g:2654:4: (lv_source_3_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:2654:4: (lv_source_3_0= ruleModelElementReference )
            // InternalAadlV3.g:2655:5: lv_source_3_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowSinkAccess().getSourceModelElementReferenceParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_source_3_0=ruleModelElementReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFlowSinkRule());
              					}
              					set(
              						current,
              						"source",
              						lv_source_3_0,
              						"org.osate.xtext.aadlv3.AadlV3.ModelElementReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:2672:3: (this_PropertiesBlock_4= rulePropertiesBlock[$current] )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==19) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalAadlV3.g:2673:4: this_PropertiesBlock_4= rulePropertiesBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getFlowSinkRule());
                      				}
                      				newCompositeNode(grammarAccess.getFlowSinkAccess().getPropertiesBlockParserRuleCall_4());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_PropertiesBlock_4=rulePropertiesBlock(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_PropertiesBlock_4;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getFlowSinkAccess().getSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFlowSink"


    // $ANTLR start "ruleUseProps"
    // InternalAadlV3.g:2697:1: ruleUseProps[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'use' otherlv_1= 'properties' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleUseProps(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalAadlV3.g:2703:2: ( (otherlv_0= 'use' otherlv_1= 'properties' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ';' ) )
            // InternalAadlV3.g:2704:2: (otherlv_0= 'use' otherlv_1= 'properties' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ';' )
            {
            // InternalAadlV3.g:2704:2: (otherlv_0= 'use' otherlv_1= 'properties' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ';' )
            // InternalAadlV3.g:2705:3: otherlv_0= 'use' otherlv_1= 'properties' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getUsePropsAccess().getUseKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,28,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getUsePropsAccess().getPropertiesKeyword_1());
              		
            }
            // InternalAadlV3.g:2713:3: ( ( ruleQualifiedName ) )
            // InternalAadlV3.g:2714:4: ( ruleQualifiedName )
            {
            // InternalAadlV3.g:2714:4: ( ruleQualifiedName )
            // InternalAadlV3.g:2715:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getUsePropsRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUsePropsAccess().getUsePropertiesPropertySetCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_50);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:2732:3: (otherlv_3= ',' ( ( ruleQualifiedName ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==26) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalAadlV3.g:2733:4: otherlv_3= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_3=(Token)match(input,26,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getUsePropsAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalAadlV3.g:2737:4: ( ( ruleQualifiedName ) )
            	    // InternalAadlV3.g:2738:5: ( ruleQualifiedName )
            	    {
            	    // InternalAadlV3.g:2738:5: ( ruleQualifiedName )
            	    // InternalAadlV3.g:2739:6: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      						/* */
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getUsePropsRule());
            	      						}
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getUsePropsAccess().getUsePropertiesPropertySetCrossReference_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_50);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getUsePropsAccess().getSemicolonKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUseProps"


    // $ANTLR start "entryRulePath"
    // InternalAadlV3.g:2765:1: entryRulePath returns [EObject current=null] : iv_rulePath= rulePath EOF ;
    public final EObject entryRulePath() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePath = null;


        try {
            // InternalAadlV3.g:2765:45: (iv_rulePath= rulePath EOF )
            // InternalAadlV3.g:2766:2: iv_rulePath= rulePath EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPathRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePath=rulePath();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePath; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePath"


    // $ANTLR start "rulePath"
    // InternalAadlV3.g:2772:1: rulePath returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+ (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? otherlv_7= ';' ) ;
    public final EObject rulePath() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_elements_3_0 = null;

        EObject lv_elements_5_0 = null;

        EObject this_PropertiesBlock_6 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2778:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+ (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? otherlv_7= ';' ) )
            // InternalAadlV3.g:2779:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+ (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? otherlv_7= ';' )
            {
            // InternalAadlV3.g:2779:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+ (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? otherlv_7= ';' )
            // InternalAadlV3.g:2780:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+ (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? otherlv_7= ';'
            {
            // InternalAadlV3.g:2780:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:2781:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:2781:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:2782:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getPathAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPathRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPathAccess().getColonKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,42,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPathAccess().getFlowKeyword_2());
              		
            }
            // InternalAadlV3.g:2806:3: ( (lv_elements_3_0= rulePathElement ) )
            // InternalAadlV3.g:2807:4: (lv_elements_3_0= rulePathElement )
            {
            // InternalAadlV3.g:2807:4: (lv_elements_3_0= rulePathElement )
            // InternalAadlV3.g:2808:5: lv_elements_3_0= rulePathElement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPathAccess().getElementsPathElementParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_48);
            lv_elements_3_0=rulePathElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPathRule());
              					}
              					add(
              						current,
              						"elements",
              						lv_elements_3_0,
              						"org.osate.xtext.aadlv3.AadlV3.PathElement");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:2825:3: (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+
            int cnt45=0;
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==39) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalAadlV3.g:2826:4: otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) )
            	    {
            	    otherlv_4=(Token)match(input,39,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getPathAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
            	      			
            	    }
            	    // InternalAadlV3.g:2830:4: ( (lv_elements_5_0= rulePathElement ) )
            	    // InternalAadlV3.g:2831:5: (lv_elements_5_0= rulePathElement )
            	    {
            	    // InternalAadlV3.g:2831:5: (lv_elements_5_0= rulePathElement )
            	    // InternalAadlV3.g:2832:6: lv_elements_5_0= rulePathElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPathAccess().getElementsPathElementParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_51);
            	    lv_elements_5_0=rulePathElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPathRule());
            	      						}
            	      						add(
            	      							current,
            	      							"elements",
            	      							lv_elements_5_0,
            	      							"org.osate.xtext.aadlv3.AadlV3.PathElement");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt45 >= 1 ) break loop45;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        throw eee;
                }
                cnt45++;
            } while (true);

            // InternalAadlV3.g:2850:3: (this_PropertiesBlock_6= rulePropertiesBlock[$current] )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==19) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalAadlV3.g:2851:4: this_PropertiesBlock_6= rulePropertiesBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getPathRule());
                      				}
                      				newCompositeNode(grammarAccess.getPathAccess().getPropertiesBlockParserRuleCall_5());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_PropertiesBlock_6=rulePropertiesBlock(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_PropertiesBlock_6;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getPathAccess().getSemicolonKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePath"


    // $ANTLR start "entryRulePathElement"
    // InternalAadlV3.g:2874:1: entryRulePathElement returns [EObject current=null] : iv_rulePathElement= rulePathElement EOF ;
    public final EObject entryRulePathElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathElement = null;


        try {
            // InternalAadlV3.g:2874:52: (iv_rulePathElement= rulePathElement EOF )
            // InternalAadlV3.g:2875:2: iv_rulePathElement= rulePathElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPathElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePathElement=rulePathElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePathElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePathElement"


    // $ANTLR start "rulePathElement"
    // InternalAadlV3.g:2881:1: rulePathElement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* ) ;
    public final EObject rulePathElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAadlV3.g:2887:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* ) )
            // InternalAadlV3.g:2888:2: ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )
            {
            // InternalAadlV3.g:2888:2: ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )
            // InternalAadlV3.g:2889:3: ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
            {
            // InternalAadlV3.g:2889:3: ( (otherlv_0= RULE_ID ) )
            // InternalAadlV3.g:2890:4: (otherlv_0= RULE_ID )
            {
            // InternalAadlV3.g:2890:4: (otherlv_0= RULE_ID )
            // InternalAadlV3.g:2891:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPathElementRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getPathElementAccess().getElementModelElementCrossReference_0_0());
              				
            }

            }


            }

            // InternalAadlV3.g:2905:3: ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==36) && (synpred68_InternalAadlV3())) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalAadlV3.g:2906:4: ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // InternalAadlV3.g:2917:4: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    // InternalAadlV3.g:2918:5: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalAadlV3.g:2918:5: ()
            	    // InternalAadlV3.g:2919:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						/* */
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getPathElementAccess().getPathElementContextAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,36,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getPathElementAccess().getFullStopKeyword_1_0_1());
            	      				
            	    }
            	    // InternalAadlV3.g:2932:5: ( (otherlv_3= RULE_ID ) )
            	    // InternalAadlV3.g:2933:6: (otherlv_3= RULE_ID )
            	    {
            	    // InternalAadlV3.g:2933:6: (otherlv_3= RULE_ID )
            	    // InternalAadlV3.g:2934:7: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							/* */
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getPathElementRule());
            	      							}
            	      						
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_3, grammarAccess.getPathElementAccess().getElementModelElementCrossReference_1_0_2_0());
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePathElement"


    // $ANTLR start "entryRuleImport"
    // InternalAadlV3.g:2954:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalAadlV3.g:2954:47: (iv_ruleImport= ruleImport EOF )
            // InternalAadlV3.g:2955:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalAadlV3.g:2961:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token lv_alias_4_0=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2967:2: ( (otherlv_0= 'import' ( ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? otherlv_5= ';' ) )
            // InternalAadlV3.g:2968:2: (otherlv_0= 'import' ( ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? otherlv_5= ';' )
            {
            // InternalAadlV3.g:2968:2: (otherlv_0= 'import' ( ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? otherlv_5= ';' )
            // InternalAadlV3.g:2969:3: otherlv_0= 'import' ( ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
              		
            }
            // InternalAadlV3.g:2973:3: ( ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) )
            int alt48=2;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // InternalAadlV3.g:2974:4: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
                    {
                    // InternalAadlV3.g:2974:4: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
                    // InternalAadlV3.g:2975:5: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
                    {
                    // InternalAadlV3.g:2975:5: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
                    // InternalAadlV3.g:2976:6: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_52);
                    lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getImportRule());
                      						}
                      						set(
                      							current,
                      							"importedNamespace",
                      							lv_importedNamespace_1_0,
                      							"org.osate.xtext.aadlv3.AadlV3.QualifiedNameWithWildcard");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:2994:4: ( (lv_importedNamespace_2_0= ruleQualifiedName ) )
                    {
                    // InternalAadlV3.g:2994:4: ( (lv_importedNamespace_2_0= ruleQualifiedName ) )
                    // InternalAadlV3.g:2995:5: (lv_importedNamespace_2_0= ruleQualifiedName )
                    {
                    // InternalAadlV3.g:2995:5: (lv_importedNamespace_2_0= ruleQualifiedName )
                    // InternalAadlV3.g:2996:6: lv_importedNamespace_2_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_52);
                    lv_importedNamespace_2_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getImportRule());
                      						}
                      						set(
                      							current,
                      							"importedNamespace",
                      							lv_importedNamespace_2_0,
                      							"org.osate.xtext.aadlv3.AadlV3.QualifiedName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalAadlV3.g:3014:3: (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==44) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalAadlV3.g:3015:4: otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,44,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getImportAccess().getAsKeyword_2_0());
                      			
                    }
                    // InternalAadlV3.g:3019:4: ( (lv_alias_4_0= RULE_ID ) )
                    // InternalAadlV3.g:3020:5: (lv_alias_4_0= RULE_ID )
                    {
                    // InternalAadlV3.g:3020:5: (lv_alias_4_0= RULE_ID )
                    // InternalAadlV3.g:3021:6: lv_alias_4_0= RULE_ID
                    {
                    lv_alias_4_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_alias_4_0, grammarAccess.getImportAccess().getAliasIDTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getImportRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"alias",
                      							lv_alias_4_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getImportAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleClassifierAssignment"
    // InternalAadlV3.g:3046:1: entryRuleClassifierAssignment returns [EObject current=null] : iv_ruleClassifierAssignment= ruleClassifierAssignment EOF ;
    public final EObject entryRuleClassifierAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierAssignment = null;


        try {
            // InternalAadlV3.g:3046:61: (iv_ruleClassifierAssignment= ruleClassifierAssignment EOF )
            // InternalAadlV3.g:3047:2: iv_ruleClassifierAssignment= ruleClassifierAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassifierAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleClassifierAssignment=ruleClassifierAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassifierAssignment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleClassifierAssignment"


    // $ANTLR start "ruleClassifierAssignment"
    // InternalAadlV3.g:3053:1: ruleClassifierAssignment returns [EObject current=null] : ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' ( ( ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) otherlv_7= ';' ) ;
    public final EObject ruleClassifierAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        EObject lv_target_0_0 = null;

        EObject lv_assignedClassifiers_2_0 = null;

        EObject lv_assignedClassifiers_4_0 = null;

        EObject this_CurlyConfigurationElementBlock_5 = null;

        EObject this_CurlyConfigurationElementBlock_6 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3059:2: ( ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' ( ( ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) otherlv_7= ';' ) )
            // InternalAadlV3.g:3060:2: ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' ( ( ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) otherlv_7= ';' )
            {
            // InternalAadlV3.g:3060:2: ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' ( ( ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) otherlv_7= ';' )
            // InternalAadlV3.g:3061:3: ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' ( ( ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) otherlv_7= ';'
            {
            // InternalAadlV3.g:3061:3: ( (lv_target_0_0= ruleModelElementReference ) )
            // InternalAadlV3.g:3062:4: (lv_target_0_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:3062:4: (lv_target_0_0= ruleModelElementReference )
            // InternalAadlV3.g:3063:5: lv_target_0_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getClassifierAssignmentAccess().getTargetModelElementReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_53);
            lv_target_0_0=ruleModelElementReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getClassifierAssignmentRule());
              					}
              					set(
              						current,
              						"target",
              						lv_target_0_0,
              						"org.osate.xtext.aadlv3.AadlV3.ModelElementReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getClassifierAssignmentAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            // InternalAadlV3.g:3084:3: ( ( ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                alt52=1;
            }
            else if ( (LA52_0==19) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalAadlV3.g:3085:4: ( ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? )
                    {
                    // InternalAadlV3.g:3085:4: ( ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? )
                    // InternalAadlV3.g:3086:5: ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )?
                    {
                    // InternalAadlV3.g:3086:5: ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) )
                    // InternalAadlV3.g:3087:6: (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference )
                    {
                    // InternalAadlV3.g:3087:6: (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference )
                    // InternalAadlV3.g:3088:7: lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getClassifierAssignmentAccess().getAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_2_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_55);
                    lv_assignedClassifiers_2_0=ruleClassifierOrTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getClassifierAssignmentRule());
                      							}
                      							add(
                      								current,
                      								"assignedClassifiers",
                      								lv_assignedClassifiers_2_0,
                      								"org.osate.xtext.aadlv3.AadlV3.ClassifierOrTypeReference");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalAadlV3.g:3105:5: (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==26) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalAadlV3.g:3106:6: otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_3, grammarAccess.getClassifierAssignmentAccess().getCommaKeyword_2_0_1_0());
                    	      					
                    	    }
                    	    // InternalAadlV3.g:3110:6: ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) )
                    	    // InternalAadlV3.g:3111:7: (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference )
                    	    {
                    	    // InternalAadlV3.g:3111:7: (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference )
                    	    // InternalAadlV3.g:3112:8: lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getClassifierAssignmentAccess().getAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_2_0_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_55);
                    	    lv_assignedClassifiers_4_0=ruleClassifierOrTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getClassifierAssignmentRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"assignedClassifiers",
                    	      									lv_assignedClassifiers_4_0,
                    	      									"org.osate.xtext.aadlv3.AadlV3.ClassifierOrTypeReference");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    // InternalAadlV3.g:3130:5: (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==19) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalAadlV3.g:3131:6: this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current]
                            {
                            if ( state.backtracking==0 ) {

                              						/* */
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getClassifierAssignmentRule());
                              						}
                              						newCompositeNode(grammarAccess.getClassifierAssignmentAccess().getCurlyConfigurationElementBlockParserRuleCall_2_0_2());
                              					
                            }
                            pushFollow(FOLLOW_9);
                            this_CurlyConfigurationElementBlock_5=ruleCurlyConfigurationElementBlock(current);

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current = this_CurlyConfigurationElementBlock_5;
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:3148:4: this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getClassifierAssignmentRule());
                      				}
                      				newCompositeNode(grammarAccess.getClassifierAssignmentAccess().getCurlyConfigurationElementBlockParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_CurlyConfigurationElementBlock_6=ruleCurlyConfigurationElementBlock(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_CurlyConfigurationElementBlock_6;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getClassifierAssignmentAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleClassifierAssignment"


    // $ANTLR start "entryRuleClassifierAssignmentPattern"
    // InternalAadlV3.g:3171:1: entryRuleClassifierAssignmentPattern returns [EObject current=null] : iv_ruleClassifierAssignmentPattern= ruleClassifierAssignmentPattern EOF ;
    public final EObject entryRuleClassifierAssignmentPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierAssignmentPattern = null;


        try {
            // InternalAadlV3.g:3171:68: (iv_ruleClassifierAssignmentPattern= ruleClassifierAssignmentPattern EOF )
            // InternalAadlV3.g:3172:2: iv_ruleClassifierAssignmentPattern= ruleClassifierAssignmentPattern EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassifierAssignmentPatternRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleClassifierAssignmentPattern=ruleClassifierAssignmentPattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassifierAssignmentPattern; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleClassifierAssignmentPattern"


    // $ANTLR start "ruleClassifierAssignmentPattern"
    // InternalAadlV3.g:3178:1: ruleClassifierAssignmentPattern returns [EObject current=null] : (this_QueryExpression_0= ruleQueryExpression[$current] otherlv_1= '=>' ( ( ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) otherlv_7= ';' ) ;
    public final EObject ruleClassifierAssignmentPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        EObject this_QueryExpression_0 = null;

        EObject lv_assignedClassifiers_2_0 = null;

        EObject lv_assignedClassifiers_4_0 = null;

        EObject this_CurlyConfigurationElementBlock_5 = null;

        EObject this_CurlyConfigurationElementBlock_6 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3184:2: ( (this_QueryExpression_0= ruleQueryExpression[$current] otherlv_1= '=>' ( ( ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) otherlv_7= ';' ) )
            // InternalAadlV3.g:3185:2: (this_QueryExpression_0= ruleQueryExpression[$current] otherlv_1= '=>' ( ( ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) otherlv_7= ';' )
            {
            // InternalAadlV3.g:3185:2: (this_QueryExpression_0= ruleQueryExpression[$current] otherlv_1= '=>' ( ( ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) otherlv_7= ';' )
            // InternalAadlV3.g:3186:3: this_QueryExpression_0= ruleQueryExpression[$current] otherlv_1= '=>' ( ( ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) otherlv_7= ';'
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getClassifierAssignmentPatternRule());
              			}
              			newCompositeNode(grammarAccess.getClassifierAssignmentPatternAccess().getQueryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_53);
            this_QueryExpression_0=ruleQueryExpression(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_QueryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_1=(Token)match(input,33,FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getClassifierAssignmentPatternAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            // InternalAadlV3.g:3204:3: ( ( ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                alt55=1;
            }
            else if ( (LA55_0==19) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalAadlV3.g:3205:4: ( ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? )
                    {
                    // InternalAadlV3.g:3205:4: ( ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? )
                    // InternalAadlV3.g:3206:5: ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )?
                    {
                    // InternalAadlV3.g:3206:5: ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) )
                    // InternalAadlV3.g:3207:6: (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference )
                    {
                    // InternalAadlV3.g:3207:6: (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference )
                    // InternalAadlV3.g:3208:7: lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getClassifierAssignmentPatternAccess().getAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_2_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_55);
                    lv_assignedClassifiers_2_0=ruleClassifierOrTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getClassifierAssignmentPatternRule());
                      							}
                      							add(
                      								current,
                      								"assignedClassifiers",
                      								lv_assignedClassifiers_2_0,
                      								"org.osate.xtext.aadlv3.AadlV3.ClassifierOrTypeReference");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalAadlV3.g:3225:5: (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==26) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalAadlV3.g:3226:6: otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_3, grammarAccess.getClassifierAssignmentPatternAccess().getCommaKeyword_2_0_1_0());
                    	      					
                    	    }
                    	    // InternalAadlV3.g:3230:6: ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) )
                    	    // InternalAadlV3.g:3231:7: (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference )
                    	    {
                    	    // InternalAadlV3.g:3231:7: (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference )
                    	    // InternalAadlV3.g:3232:8: lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getClassifierAssignmentPatternAccess().getAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_2_0_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_55);
                    	    lv_assignedClassifiers_4_0=ruleClassifierOrTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getClassifierAssignmentPatternRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"assignedClassifiers",
                    	      									lv_assignedClassifiers_4_0,
                    	      									"org.osate.xtext.aadlv3.AadlV3.ClassifierOrTypeReference");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);

                    // InternalAadlV3.g:3250:5: (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==19) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalAadlV3.g:3251:6: this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current]
                            {
                            if ( state.backtracking==0 ) {

                              						/* */
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getClassifierAssignmentPatternRule());
                              						}
                              						newCompositeNode(grammarAccess.getClassifierAssignmentPatternAccess().getCurlyConfigurationElementBlockParserRuleCall_2_0_2());
                              					
                            }
                            pushFollow(FOLLOW_9);
                            this_CurlyConfigurationElementBlock_5=ruleCurlyConfigurationElementBlock(current);

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current = this_CurlyConfigurationElementBlock_5;
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:3268:4: this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getClassifierAssignmentPatternRule());
                      				}
                      				newCompositeNode(grammarAccess.getClassifierAssignmentPatternAccess().getCurlyConfigurationElementBlockParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_CurlyConfigurationElementBlock_6=ruleCurlyConfigurationElementBlock(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_CurlyConfigurationElementBlock_6;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getClassifierAssignmentPatternAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleClassifierAssignmentPattern"


    // $ANTLR start "ruleQueryExpression"
    // InternalAadlV3.g:3292:1: ruleQueryExpression[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'all' otherlv_1= '(' ( ( ruleQualifiedTypesReference ) ) otherlv_3= ')' ) ;
    public final EObject ruleQueryExpression(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAadlV3.g:3298:2: ( (otherlv_0= 'all' otherlv_1= '(' ( ( ruleQualifiedTypesReference ) ) otherlv_3= ')' ) )
            // InternalAadlV3.g:3299:2: (otherlv_0= 'all' otherlv_1= '(' ( ( ruleQualifiedTypesReference ) ) otherlv_3= ')' )
            {
            // InternalAadlV3.g:3299:2: (otherlv_0= 'all' otherlv_1= '(' ( ( ruleQualifiedTypesReference ) ) otherlv_3= ')' )
            // InternalAadlV3.g:3300:3: otherlv_0= 'all' otherlv_1= '(' ( ( ruleQualifiedTypesReference ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getQueryExpressionAccess().getAllKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,24,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getQueryExpressionAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalAadlV3.g:3308:3: ( ( ruleQualifiedTypesReference ) )
            // InternalAadlV3.g:3309:4: ( ruleQualifiedTypesReference )
            {
            // InternalAadlV3.g:3309:4: ( ruleQualifiedTypesReference )
            // InternalAadlV3.g:3310:5: ruleQualifiedTypesReference
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getQueryExpressionRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getQueryExpressionAccess().getTargetPatternTypeCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_18);
            ruleQualifiedTypesReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getQueryExpressionAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQueryExpression"


    // $ANTLR start "entryRuleFlowAssignment"
    // InternalAadlV3.g:3335:1: entryRuleFlowAssignment returns [EObject current=null] : iv_ruleFlowAssignment= ruleFlowAssignment EOF ;
    public final EObject entryRuleFlowAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowAssignment = null;


        try {
            // InternalAadlV3.g:3335:55: (iv_ruleFlowAssignment= ruleFlowAssignment EOF )
            // InternalAadlV3.g:3336:2: iv_ruleFlowAssignment= ruleFlowAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFlowAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFlowAssignment=ruleFlowAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFlowAssignment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFlowAssignment"


    // $ANTLR start "ruleFlowAssignment"
    // InternalAadlV3.g:3342:1: ruleFlowAssignment returns [EObject current=null] : ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )* otherlv_6= ';' ) ;
    public final EObject ruleFlowAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_target_0_0 = null;

        EObject lv_elements_3_0 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3348:2: ( ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )* otherlv_6= ';' ) )
            // InternalAadlV3.g:3349:2: ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )* otherlv_6= ';' )
            {
            // InternalAadlV3.g:3349:2: ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )* otherlv_6= ';' )
            // InternalAadlV3.g:3350:3: ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )* otherlv_6= ';'
            {
            // InternalAadlV3.g:3350:3: ( (lv_target_0_0= ruleModelElementReference ) )
            // InternalAadlV3.g:3351:4: (lv_target_0_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:3351:4: (lv_target_0_0= ruleModelElementReference )
            // InternalAadlV3.g:3352:5: lv_target_0_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowAssignmentAccess().getTargetModelElementReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_53);
            lv_target_0_0=ruleModelElementReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFlowAssignmentRule());
              					}
              					set(
              						current,
              						"target",
              						lv_target_0_0,
              						"org.osate.xtext.aadlv3.AadlV3.ModelElementReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFlowAssignmentAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,42,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFlowAssignmentAccess().getFlowKeyword_2());
              		
            }
            // InternalAadlV3.g:3377:3: ( (lv_elements_3_0= rulePathElement ) )
            // InternalAadlV3.g:3378:4: (lv_elements_3_0= rulePathElement )
            {
            // InternalAadlV3.g:3378:4: (lv_elements_3_0= rulePathElement )
            // InternalAadlV3.g:3379:5: lv_elements_3_0= rulePathElement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowAssignmentAccess().getElementsPathElementParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_56);
            lv_elements_3_0=rulePathElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFlowAssignmentRule());
              					}
              					add(
              						current,
              						"elements",
              						lv_elements_3_0,
              						"org.osate.xtext.aadlv3.AadlV3.PathElement");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:3396:3: (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==39) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalAadlV3.g:3397:4: otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) )
            	    {
            	    otherlv_4=(Token)match(input,39,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getFlowAssignmentAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
            	      			
            	    }
            	    // InternalAadlV3.g:3401:4: ( (lv_elements_5_0= rulePathElement ) )
            	    // InternalAadlV3.g:3402:5: (lv_elements_5_0= rulePathElement )
            	    {
            	    // InternalAadlV3.g:3402:5: (lv_elements_5_0= rulePathElement )
            	    // InternalAadlV3.g:3403:6: lv_elements_5_0= rulePathElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getFlowAssignmentAccess().getElementsPathElementParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_56);
            	    lv_elements_5_0=rulePathElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getFlowAssignmentRule());
            	      						}
            	      						add(
            	      							current,
            	      							"elements",
            	      							lv_elements_5_0,
            	      							"org.osate.xtext.aadlv3.AadlV3.PathElement");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getFlowAssignmentAccess().getSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFlowAssignment"


    // $ANTLR start "ruleConfigurationElementBlock"
    // InternalAadlV3.g:3430:1: ruleConfigurationElementBlock[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'is' (this_ConfigurationElement_1= ruleConfigurationElement[$current] )* otherlv_2= 'end' ) ;
    public final EObject ruleConfigurationElementBlock(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_ConfigurationElement_1 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3436:2: ( (otherlv_0= 'is' (this_ConfigurationElement_1= ruleConfigurationElement[$current] )* otherlv_2= 'end' ) )
            // InternalAadlV3.g:3437:2: (otherlv_0= 'is' (this_ConfigurationElement_1= ruleConfigurationElement[$current] )* otherlv_2= 'end' )
            {
            // InternalAadlV3.g:3437:2: (otherlv_0= 'is' (this_ConfigurationElement_1= ruleConfigurationElement[$current] )* otherlv_2= 'end' )
            // InternalAadlV3.g:3438:3: otherlv_0= 'is' (this_ConfigurationElement_1= ruleConfigurationElement[$current] )* otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConfigurationElementBlockAccess().getIsKeyword_0());
              		
            }
            // InternalAadlV3.g:3442:3: (this_ConfigurationElement_1= ruleConfigurationElement[$current] )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==RULE_ID||LA57_0==18||LA57_0==25||LA57_0==32) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalAadlV3.g:3443:4: this_ConfigurationElement_1= ruleConfigurationElement[$current]
            	    {
            	    if ( state.backtracking==0 ) {

            	      				/* */
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElement(grammarAccess.getConfigurationElementBlockRule());
            	      				}
            	      				newCompositeNode(grammarAccess.getConfigurationElementBlockAccess().getConfigurationElementParserRuleCall_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_37);
            	    this_ConfigurationElement_1=ruleConfigurationElement(current);

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current = this_ConfigurationElement_1;
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            otherlv_2=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getConfigurationElementBlockAccess().getEndKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConfigurationElementBlock"


    // $ANTLR start "ruleCurlyConfigurationElementBlock"
    // InternalAadlV3.g:3467:1: ruleCurlyConfigurationElementBlock[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '{' (this_ConfigurationElement_1= ruleConfigurationElement[$current] )+ otherlv_2= '}' ) ;
    public final EObject ruleCurlyConfigurationElementBlock(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_ConfigurationElement_1 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3473:2: ( (otherlv_0= '{' (this_ConfigurationElement_1= ruleConfigurationElement[$current] )+ otherlv_2= '}' ) )
            // InternalAadlV3.g:3474:2: (otherlv_0= '{' (this_ConfigurationElement_1= ruleConfigurationElement[$current] )+ otherlv_2= '}' )
            {
            // InternalAadlV3.g:3474:2: (otherlv_0= '{' (this_ConfigurationElement_1= ruleConfigurationElement[$current] )+ otherlv_2= '}' )
            // InternalAadlV3.g:3475:3: otherlv_0= '{' (this_ConfigurationElement_1= ruleConfigurationElement[$current] )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCurlyConfigurationElementBlockAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalAadlV3.g:3479:3: (this_ConfigurationElement_1= ruleConfigurationElement[$current] )+
            int cnt58=0;
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==RULE_ID||LA58_0==18||LA58_0==25||LA58_0==32) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalAadlV3.g:3480:4: this_ConfigurationElement_1= ruleConfigurationElement[$current]
            	    {
            	    if ( state.backtracking==0 ) {

            	      				/* */
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElement(grammarAccess.getCurlyConfigurationElementBlockRule());
            	      				}
            	      				newCompositeNode(grammarAccess.getCurlyConfigurationElementBlockAccess().getConfigurationElementParserRuleCall_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_58);
            	    this_ConfigurationElement_1=ruleConfigurationElement(current);

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current = this_ConfigurationElement_1;
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt58 >= 1 ) break loop58;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(58, input);
                        throw eee;
                }
                cnt58++;
            } while (true);

            otherlv_2=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCurlyConfigurationElementBlockAccess().getRightCurlyBracketKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCurlyConfigurationElementBlock"


    // $ANTLR start "ruleConfigurationElement"
    // InternalAadlV3.g:3504:1: ruleConfigurationElement[EObject in_current] returns [EObject current=in_current] : ( ( (lv_ownedPropertyAssociations_0_0= rulePropertyAssociation ) ) | ( (lv_bindings_1_0= ruleBinding ) ) | ( (lv_classifierAssignments_2_0= ruleClassifierAssignment ) ) | ( (lv_classifierAssignments_3_0= ruleClassifierAssignmentPattern ) ) | ( (lv_annexSubclause_4_0= ruleAnnexSubclause ) ) ) ;
    public final EObject ruleConfigurationElement(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_ownedPropertyAssociations_0_0 = null;

        EObject lv_bindings_1_0 = null;

        EObject lv_classifierAssignments_2_0 = null;

        EObject lv_classifierAssignments_3_0 = null;

        EObject lv_annexSubclause_4_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3510:2: ( ( ( (lv_ownedPropertyAssociations_0_0= rulePropertyAssociation ) ) | ( (lv_bindings_1_0= ruleBinding ) ) | ( (lv_classifierAssignments_2_0= ruleClassifierAssignment ) ) | ( (lv_classifierAssignments_3_0= ruleClassifierAssignmentPattern ) ) | ( (lv_annexSubclause_4_0= ruleAnnexSubclause ) ) ) )
            // InternalAadlV3.g:3511:2: ( ( (lv_ownedPropertyAssociations_0_0= rulePropertyAssociation ) ) | ( (lv_bindings_1_0= ruleBinding ) ) | ( (lv_classifierAssignments_2_0= ruleClassifierAssignment ) ) | ( (lv_classifierAssignments_3_0= ruleClassifierAssignmentPattern ) ) | ( (lv_annexSubclause_4_0= ruleAnnexSubclause ) ) )
            {
            // InternalAadlV3.g:3511:2: ( ( (lv_ownedPropertyAssociations_0_0= rulePropertyAssociation ) ) | ( (lv_bindings_1_0= ruleBinding ) ) | ( (lv_classifierAssignments_2_0= ruleClassifierAssignment ) ) | ( (lv_classifierAssignments_3_0= ruleClassifierAssignmentPattern ) ) | ( (lv_annexSubclause_4_0= ruleAnnexSubclause ) ) )
            int alt59=5;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // InternalAadlV3.g:3512:3: ( (lv_ownedPropertyAssociations_0_0= rulePropertyAssociation ) )
                    {
                    // InternalAadlV3.g:3512:3: ( (lv_ownedPropertyAssociations_0_0= rulePropertyAssociation ) )
                    // InternalAadlV3.g:3513:4: (lv_ownedPropertyAssociations_0_0= rulePropertyAssociation )
                    {
                    // InternalAadlV3.g:3513:4: (lv_ownedPropertyAssociations_0_0= rulePropertyAssociation )
                    // InternalAadlV3.g:3514:5: lv_ownedPropertyAssociations_0_0= rulePropertyAssociation
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getConfigurationElementAccess().getOwnedPropertyAssociationsPropertyAssociationParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_ownedPropertyAssociations_0_0=rulePropertyAssociation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getConfigurationElementRule());
                      					}
                      					add(
                      						current,
                      						"ownedPropertyAssociations",
                      						lv_ownedPropertyAssociations_0_0,
                      						"org.osate.xtext.aadlv3.AadlV3.PropertyAssociation");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:3532:3: ( (lv_bindings_1_0= ruleBinding ) )
                    {
                    // InternalAadlV3.g:3532:3: ( (lv_bindings_1_0= ruleBinding ) )
                    // InternalAadlV3.g:3533:4: (lv_bindings_1_0= ruleBinding )
                    {
                    // InternalAadlV3.g:3533:4: (lv_bindings_1_0= ruleBinding )
                    // InternalAadlV3.g:3534:5: lv_bindings_1_0= ruleBinding
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getConfigurationElementAccess().getBindingsBindingParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_bindings_1_0=ruleBinding();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getConfigurationElementRule());
                      					}
                      					add(
                      						current,
                      						"bindings",
                      						lv_bindings_1_0,
                      						"org.osate.xtext.aadlv3.AadlV3.Binding");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:3552:3: ( (lv_classifierAssignments_2_0= ruleClassifierAssignment ) )
                    {
                    // InternalAadlV3.g:3552:3: ( (lv_classifierAssignments_2_0= ruleClassifierAssignment ) )
                    // InternalAadlV3.g:3553:4: (lv_classifierAssignments_2_0= ruleClassifierAssignment )
                    {
                    // InternalAadlV3.g:3553:4: (lv_classifierAssignments_2_0= ruleClassifierAssignment )
                    // InternalAadlV3.g:3554:5: lv_classifierAssignments_2_0= ruleClassifierAssignment
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getConfigurationElementAccess().getClassifierAssignmentsClassifierAssignmentParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_classifierAssignments_2_0=ruleClassifierAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getConfigurationElementRule());
                      					}
                      					add(
                      						current,
                      						"classifierAssignments",
                      						lv_classifierAssignments_2_0,
                      						"org.osate.xtext.aadlv3.AadlV3.ClassifierAssignment");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAadlV3.g:3572:3: ( (lv_classifierAssignments_3_0= ruleClassifierAssignmentPattern ) )
                    {
                    // InternalAadlV3.g:3572:3: ( (lv_classifierAssignments_3_0= ruleClassifierAssignmentPattern ) )
                    // InternalAadlV3.g:3573:4: (lv_classifierAssignments_3_0= ruleClassifierAssignmentPattern )
                    {
                    // InternalAadlV3.g:3573:4: (lv_classifierAssignments_3_0= ruleClassifierAssignmentPattern )
                    // InternalAadlV3.g:3574:5: lv_classifierAssignments_3_0= ruleClassifierAssignmentPattern
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getConfigurationElementAccess().getClassifierAssignmentsClassifierAssignmentPatternParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_classifierAssignments_3_0=ruleClassifierAssignmentPattern();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getConfigurationElementRule());
                      					}
                      					add(
                      						current,
                      						"classifierAssignments",
                      						lv_classifierAssignments_3_0,
                      						"org.osate.xtext.aadlv3.AadlV3.ClassifierAssignmentPattern");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalAadlV3.g:3592:3: ( (lv_annexSubclause_4_0= ruleAnnexSubclause ) )
                    {
                    // InternalAadlV3.g:3592:3: ( (lv_annexSubclause_4_0= ruleAnnexSubclause ) )
                    // InternalAadlV3.g:3593:4: (lv_annexSubclause_4_0= ruleAnnexSubclause )
                    {
                    // InternalAadlV3.g:3593:4: (lv_annexSubclause_4_0= ruleAnnexSubclause )
                    // InternalAadlV3.g:3594:5: lv_annexSubclause_4_0= ruleAnnexSubclause
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getConfigurationElementAccess().getAnnexSubclauseAnnexSubclauseParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_annexSubclause_4_0=ruleAnnexSubclause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getConfigurationElementRule());
                      					}
                      					add(
                      						current,
                      						"annexSubclause",
                      						lv_annexSubclause_4_0,
                      						"org.osate.xtext.aadlv3.AadlV3.AnnexSubclause");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConfigurationElement"


    // $ANTLR start "ruleParameters"
    // InternalAadlV3.g:3616:1: ruleParameters[EObject in_current] returns [EObject current=in_current] : ( ( (lv_parameterized_0_0= '(' ) ) ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )? otherlv_4= ')' ) ;
    public final EObject ruleParameters(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_parameterized_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameters_1_0 = null;

        EObject lv_parameters_3_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3622:2: ( ( ( (lv_parameterized_0_0= '(' ) ) ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )? otherlv_4= ')' ) )
            // InternalAadlV3.g:3623:2: ( ( (lv_parameterized_0_0= '(' ) ) ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )? otherlv_4= ')' )
            {
            // InternalAadlV3.g:3623:2: ( ( (lv_parameterized_0_0= '(' ) ) ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )? otherlv_4= ')' )
            // InternalAadlV3.g:3624:3: ( (lv_parameterized_0_0= '(' ) ) ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )? otherlv_4= ')'
            {
            // InternalAadlV3.g:3624:3: ( (lv_parameterized_0_0= '(' ) )
            // InternalAadlV3.g:3625:4: (lv_parameterized_0_0= '(' )
            {
            // InternalAadlV3.g:3625:4: (lv_parameterized_0_0= '(' )
            // InternalAadlV3.g:3626:5: lv_parameterized_0_0= '('
            {
            lv_parameterized_0_0=(Token)match(input,24,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_parameterized_0_0, grammarAccess.getParametersAccess().getParameterizedLeftParenthesisKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getParametersRule());
              					}
              					setWithLastConsumed(current, "parameterized", true, "(");
              				
            }

            }


            }

            // InternalAadlV3.g:3638:3: ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalAadlV3.g:3639:4: ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )*
                    {
                    // InternalAadlV3.g:3639:4: ( (lv_parameters_1_0= ruleConfigurationParameter ) )
                    // InternalAadlV3.g:3640:5: (lv_parameters_1_0= ruleConfigurationParameter )
                    {
                    // InternalAadlV3.g:3640:5: (lv_parameters_1_0= ruleConfigurationParameter )
                    // InternalAadlV3.g:3641:6: lv_parameters_1_0= ruleConfigurationParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getParametersAccess().getParametersConfigurationParameterParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
                    lv_parameters_1_0=ruleConfigurationParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getParametersRule());
                      						}
                      						add(
                      							current,
                      							"parameters",
                      							lv_parameters_1_0,
                      							"org.osate.xtext.aadlv3.AadlV3.ConfigurationParameter");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAadlV3.g:3658:4: (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==26) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalAadlV3.g:3659:5: otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,26,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getParametersAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalAadlV3.g:3663:5: ( (lv_parameters_3_0= ruleConfigurationParameter ) )
                    	    // InternalAadlV3.g:3664:6: (lv_parameters_3_0= ruleConfigurationParameter )
                    	    {
                    	    // InternalAadlV3.g:3664:6: (lv_parameters_3_0= ruleConfigurationParameter )
                    	    // InternalAadlV3.g:3665:7: lv_parameters_3_0= ruleConfigurationParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getParametersAccess().getParametersConfigurationParameterParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_19);
                    	    lv_parameters_3_0=ruleConfigurationParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getParametersRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"parameters",
                    	      								lv_parameters_3_0,
                    	      								"org.osate.xtext.aadlv3.AadlV3.ConfigurationParameter");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getParametersAccess().getRightParenthesisKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleParameters"


    // $ANTLR start "entryRuleConfigurationParameter"
    // InternalAadlV3.g:3692:1: entryRuleConfigurationParameter returns [EObject current=null] : iv_ruleConfigurationParameter= ruleConfigurationParameter EOF ;
    public final EObject entryRuleConfigurationParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationParameter = null;


        try {
            // InternalAadlV3.g:3692:63: (iv_ruleConfigurationParameter= ruleConfigurationParameter EOF )
            // InternalAadlV3.g:3693:2: iv_ruleConfigurationParameter= ruleConfigurationParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigurationParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfigurationParameter=ruleConfigurationParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigurationParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConfigurationParameter"


    // $ANTLR start "ruleConfigurationParameter"
    // InternalAadlV3.g:3699:1: ruleConfigurationParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleConfigurationParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAadlV3.g:3705:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ) )
            // InternalAadlV3.g:3706:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) )
            {
            // InternalAadlV3.g:3706:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) )
            // InternalAadlV3.g:3707:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) )
            {
            // InternalAadlV3.g:3707:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:3708:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:3708:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:3709:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getConfigurationParameterAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConfigurationParameterRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConfigurationParameterAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:3729:3: ( ( ruleQualifiedName ) )
            // InternalAadlV3.g:3730:4: ( ruleQualifiedName )
            {
            // InternalAadlV3.g:3730:4: ( ruleQualifiedName )
            // InternalAadlV3.g:3731:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConfigurationParameterRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConfigurationParameterAccess().getTypeTypeCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConfigurationParameter"


    // $ANTLR start "entryRuleReversableInterfaceReference"
    // InternalAadlV3.g:3752:1: entryRuleReversableInterfaceReference returns [EObject current=null] : iv_ruleReversableInterfaceReference= ruleReversableInterfaceReference EOF ;
    public final EObject entryRuleReversableInterfaceReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReversableInterfaceReference = null;


        try {
            // InternalAadlV3.g:3752:69: (iv_ruleReversableInterfaceReference= ruleReversableInterfaceReference EOF )
            // InternalAadlV3.g:3753:2: iv_ruleReversableInterfaceReference= ruleReversableInterfaceReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReversableInterfaceReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReversableInterfaceReference=ruleReversableInterfaceReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReversableInterfaceReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReversableInterfaceReference"


    // $ANTLR start "ruleReversableInterfaceReference"
    // InternalAadlV3.g:3759:1: ruleReversableInterfaceReference returns [EObject current=null] : ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) ) ) ;
    public final EObject ruleReversableInterfaceReference() throws RecognitionException {
        EObject current = null;

        Token lv_reverse_0_0=null;


        	enterRule();

        try {
            // InternalAadlV3.g:3765:2: ( ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) ) ) )
            // InternalAadlV3.g:3766:2: ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) ) )
            {
            // InternalAadlV3.g:3766:2: ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) ) )
            // InternalAadlV3.g:3767:3: ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) )
            {
            // InternalAadlV3.g:3767:3: ( (lv_reverse_0_0= 'reverse' ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==45) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalAadlV3.g:3768:4: (lv_reverse_0_0= 'reverse' )
                    {
                    // InternalAadlV3.g:3768:4: (lv_reverse_0_0= 'reverse' )
                    // InternalAadlV3.g:3769:5: lv_reverse_0_0= 'reverse'
                    {
                    lv_reverse_0_0=(Token)match(input,45,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_reverse_0_0, grammarAccess.getReversableInterfaceReferenceAccess().getReverseReverseKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getReversableInterfaceReferenceRule());
                      					}
                      					setWithLastConsumed(current, "reverse", true, "reverse");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalAadlV3.g:3781:3: ( ( ruleQualifiedReference ) )
            // InternalAadlV3.g:3782:4: ( ruleQualifiedReference )
            {
            // InternalAadlV3.g:3782:4: ( ruleQualifiedReference )
            // InternalAadlV3.g:3783:5: ruleQualifiedReference
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getReversableInterfaceReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReversableInterfaceReferenceAccess().getTypeComponentInterfaceCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleReversableInterfaceReference"


    // $ANTLR start "entryRuleReversableTypeReference"
    // InternalAadlV3.g:3804:1: entryRuleReversableTypeReference returns [EObject current=null] : iv_ruleReversableTypeReference= ruleReversableTypeReference EOF ;
    public final EObject entryRuleReversableTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReversableTypeReference = null;


        try {
            // InternalAadlV3.g:3804:64: (iv_ruleReversableTypeReference= ruleReversableTypeReference EOF )
            // InternalAadlV3.g:3805:2: iv_ruleReversableTypeReference= ruleReversableTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReversableTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReversableTypeReference=ruleReversableTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReversableTypeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReversableTypeReference"


    // $ANTLR start "ruleReversableTypeReference"
    // InternalAadlV3.g:3811:1: ruleReversableTypeReference returns [EObject current=null] : ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) ) ) ;
    public final EObject ruleReversableTypeReference() throws RecognitionException {
        EObject current = null;

        Token lv_reverse_0_0=null;


        	enterRule();

        try {
            // InternalAadlV3.g:3817:2: ( ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) ) ) )
            // InternalAadlV3.g:3818:2: ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) ) )
            {
            // InternalAadlV3.g:3818:2: ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) ) )
            // InternalAadlV3.g:3819:3: ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) )
            {
            // InternalAadlV3.g:3819:3: ( (lv_reverse_0_0= 'reverse' ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==45) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalAadlV3.g:3820:4: (lv_reverse_0_0= 'reverse' )
                    {
                    // InternalAadlV3.g:3820:4: (lv_reverse_0_0= 'reverse' )
                    // InternalAadlV3.g:3821:5: lv_reverse_0_0= 'reverse'
                    {
                    lv_reverse_0_0=(Token)match(input,45,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_reverse_0_0, grammarAccess.getReversableTypeReferenceAccess().getReverseReverseKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getReversableTypeReferenceRule());
                      					}
                      					setWithLastConsumed(current, "reverse", true, "reverse");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalAadlV3.g:3833:3: ( ( ruleQualifiedReference ) )
            // InternalAadlV3.g:3834:4: ( ruleQualifiedReference )
            {
            // InternalAadlV3.g:3834:4: ( ruleQualifiedReference )
            // InternalAadlV3.g:3835:5: ruleQualifiedReference
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getReversableTypeReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReversableTypeReferenceAccess().getTypeNamedTypeCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleReversableTypeReference"


    // $ANTLR start "entryRuleClassifierOrTypeReference"
    // InternalAadlV3.g:3856:1: entryRuleClassifierOrTypeReference returns [EObject current=null] : iv_ruleClassifierOrTypeReference= ruleClassifierOrTypeReference EOF ;
    public final EObject entryRuleClassifierOrTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierOrTypeReference = null;


        try {
            // InternalAadlV3.g:3856:66: (iv_ruleClassifierOrTypeReference= ruleClassifierOrTypeReference EOF )
            // InternalAadlV3.g:3857:2: iv_ruleClassifierOrTypeReference= ruleClassifierOrTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassifierOrTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleClassifierOrTypeReference=ruleClassifierOrTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassifierOrTypeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleClassifierOrTypeReference"


    // $ANTLR start "ruleClassifierOrTypeReference"
    // InternalAadlV3.g:3863:1: ruleClassifierOrTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedTypesReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )? ) ;
    public final EObject ruleClassifierOrTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_ConfigurationActuals_1 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3869:2: ( ( ( ( ruleQualifiedTypesReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )? ) )
            // InternalAadlV3.g:3870:2: ( ( ( ruleQualifiedTypesReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )? )
            {
            // InternalAadlV3.g:3870:2: ( ( ( ruleQualifiedTypesReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )? )
            // InternalAadlV3.g:3871:3: ( ( ruleQualifiedTypesReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )?
            {
            // InternalAadlV3.g:3871:3: ( ( ruleQualifiedTypesReference ) )
            // InternalAadlV3.g:3872:4: ( ruleQualifiedTypesReference )
            {
            // InternalAadlV3.g:3872:4: ( ruleQualifiedTypesReference )
            // InternalAadlV3.g:3873:5: ruleQualifiedTypesReference
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getClassifierOrTypeReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getClassifierOrTypeReferenceAccess().getTypeNamedTypeCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_60);
            ruleQualifiedTypesReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:3890:3: (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==24) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalAadlV3.g:3891:4: this_ConfigurationActuals_1= ruleConfigurationActuals[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getClassifierOrTypeReferenceRule());
                      				}
                      				newCompositeNode(grammarAccess.getClassifierOrTypeReferenceAccess().getConfigurationActualsParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ConfigurationActuals_1=ruleConfigurationActuals(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ConfigurationActuals_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleClassifierOrTypeReference"


    // $ANTLR start "entryRuleTypeReference"
    // InternalAadlV3.g:3910:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // InternalAadlV3.g:3910:54: (iv_ruleTypeReference= ruleTypeReference EOF )
            // InternalAadlV3.g:3911:2: iv_ruleTypeReference= ruleTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeReference=ruleTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeReference"


    // $ANTLR start "ruleTypeReference"
    // InternalAadlV3.g:3917:1: ruleTypeReference returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAadlV3.g:3923:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAadlV3.g:3924:2: ( ( ruleQualifiedName ) )
            {
            // InternalAadlV3.g:3924:2: ( ( ruleQualifiedName ) )
            // InternalAadlV3.g:3925:3: ( ruleQualifiedName )
            {
            // InternalAadlV3.g:3925:3: ( ruleQualifiedName )
            // InternalAadlV3.g:3926:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getTypeReferenceRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getTypeReferenceAccess().getTypeNamedTypeCrossReference_0());
              			
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTypeReference"


    // $ANTLR start "entryRuleType"
    // InternalAadlV3.g:3946:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalAadlV3.g:3946:45: (iv_ruleType= ruleType EOF )
            // InternalAadlV3.g:3947:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalAadlV3.g:3953:1: ruleType returns [EObject current=null] : (this_TypeReference_0= ruleTypeReference | this_CompositeType_1= ruleCompositeType | this_PrimitiveType_2= rulePrimitiveType | this_EnumerationType_3= ruleEnumerationType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_TypeReference_0 = null;

        EObject this_CompositeType_1 = null;

        EObject this_PrimitiveType_2 = null;

        EObject this_EnumerationType_3 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3959:2: ( (this_TypeReference_0= ruleTypeReference | this_CompositeType_1= ruleCompositeType | this_PrimitiveType_2= rulePrimitiveType | this_EnumerationType_3= ruleEnumerationType ) )
            // InternalAadlV3.g:3960:2: (this_TypeReference_0= ruleTypeReference | this_CompositeType_1= ruleCompositeType | this_PrimitiveType_2= rulePrimitiveType | this_EnumerationType_3= ruleEnumerationType )
            {
            // InternalAadlV3.g:3960:2: (this_TypeReference_0= ruleTypeReference | this_CompositeType_1= ruleCompositeType | this_PrimitiveType_2= rulePrimitiveType | this_EnumerationType_3= ruleEnumerationType )
            int alt65=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt65=1;
                }
                break;
            case 80:
            case 81:
                {
                alt65=2;
                }
                break;
            case 82:
            case 83:
            case 84:
            case 85:
                {
                alt65=3;
                }
                break;
            case 46:
                {
                alt65=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // InternalAadlV3.g:3961:3: this_TypeReference_0= ruleTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAccess().getTypeReferenceParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TypeReference_0=ruleTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeReference_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:3973:3: this_CompositeType_1= ruleCompositeType
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAccess().getCompositeTypeParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CompositeType_1=ruleCompositeType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CompositeType_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:3985:3: this_PrimitiveType_2= rulePrimitiveType
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimitiveType_2=rulePrimitiveType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrimitiveType_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAadlV3.g:3997:3: this_EnumerationType_3= ruleEnumerationType
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAccess().getEnumerationTypeParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EnumerationType_3=ruleEnumerationType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EnumerationType_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleEnumerationType"
    // InternalAadlV3.g:4012:1: entryRuleEnumerationType returns [EObject current=null] : iv_ruleEnumerationType= ruleEnumerationType EOF ;
    public final EObject entryRuleEnumerationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationType = null;


        try {
            // InternalAadlV3.g:4012:56: (iv_ruleEnumerationType= ruleEnumerationType EOF )
            // InternalAadlV3.g:4013:2: iv_ruleEnumerationType= ruleEnumerationType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumerationType=ruleEnumerationType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumerationType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumerationType"


    // $ANTLR start "ruleEnumerationType"
    // InternalAadlV3.g:4019:1: ruleEnumerationType returns [EObject current=null] : ( () otherlv_1= 'enum' otherlv_2= '(' ( (lv_literals_3_0= ruleEnumerationLiteral ) )* otherlv_4= ')' ) ;
    public final EObject ruleEnumerationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_literals_3_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4025:2: ( ( () otherlv_1= 'enum' otherlv_2= '(' ( (lv_literals_3_0= ruleEnumerationLiteral ) )* otherlv_4= ')' ) )
            // InternalAadlV3.g:4026:2: ( () otherlv_1= 'enum' otherlv_2= '(' ( (lv_literals_3_0= ruleEnumerationLiteral ) )* otherlv_4= ')' )
            {
            // InternalAadlV3.g:4026:2: ( () otherlv_1= 'enum' otherlv_2= '(' ( (lv_literals_3_0= ruleEnumerationLiteral ) )* otherlv_4= ')' )
            // InternalAadlV3.g:4027:3: () otherlv_1= 'enum' otherlv_2= '(' ( (lv_literals_3_0= ruleEnumerationLiteral ) )* otherlv_4= ')'
            {
            // InternalAadlV3.g:4027:3: ()
            // InternalAadlV3.g:4028:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getEnumerationTypeAccess().getEnumerationTypeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEnumerationTypeAccess().getEnumKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,24,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getEnumerationTypeAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalAadlV3.g:4045:3: ( (lv_literals_3_0= ruleEnumerationLiteral ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==RULE_ID) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalAadlV3.g:4046:4: (lv_literals_3_0= ruleEnumerationLiteral )
            	    {
            	    // InternalAadlV3.g:4046:4: (lv_literals_3_0= ruleEnumerationLiteral )
            	    // InternalAadlV3.g:4047:5: lv_literals_3_0= ruleEnumerationLiteral
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_59);
            	    lv_literals_3_0=ruleEnumerationLiteral();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEnumerationTypeRule());
            	      					}
            	      					add(
            	      						current,
            	      						"literals",
            	      						lv_literals_3_0,
            	      						"org.osate.xtext.aadlv3.AadlV3.EnumerationLiteral");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            otherlv_4=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getEnumerationTypeAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEnumerationType"


    // $ANTLR start "entryRuleCompositeType"
    // InternalAadlV3.g:4072:1: entryRuleCompositeType returns [EObject current=null] : iv_ruleCompositeType= ruleCompositeType EOF ;
    public final EObject entryRuleCompositeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeType = null;


        try {
            // InternalAadlV3.g:4072:54: (iv_ruleCompositeType= ruleCompositeType EOF )
            // InternalAadlV3.g:4073:2: iv_ruleCompositeType= ruleCompositeType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCompositeType=ruleCompositeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositeType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCompositeType"


    // $ANTLR start "ruleCompositeType"
    // InternalAadlV3.g:4079:1: ruleCompositeType returns [EObject current=null] : ( ( (lv_compositeType_0_0= ruleComposite ) ) otherlv_1= 'of' ( (lv_type_2_0= ruleTypeReference ) ) ) ;
    public final EObject ruleCompositeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_compositeType_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4085:2: ( ( ( (lv_compositeType_0_0= ruleComposite ) ) otherlv_1= 'of' ( (lv_type_2_0= ruleTypeReference ) ) ) )
            // InternalAadlV3.g:4086:2: ( ( (lv_compositeType_0_0= ruleComposite ) ) otherlv_1= 'of' ( (lv_type_2_0= ruleTypeReference ) ) )
            {
            // InternalAadlV3.g:4086:2: ( ( (lv_compositeType_0_0= ruleComposite ) ) otherlv_1= 'of' ( (lv_type_2_0= ruleTypeReference ) ) )
            // InternalAadlV3.g:4087:3: ( (lv_compositeType_0_0= ruleComposite ) ) otherlv_1= 'of' ( (lv_type_2_0= ruleTypeReference ) )
            {
            // InternalAadlV3.g:4087:3: ( (lv_compositeType_0_0= ruleComposite ) )
            // InternalAadlV3.g:4088:4: (lv_compositeType_0_0= ruleComposite )
            {
            // InternalAadlV3.g:4088:4: (lv_compositeType_0_0= ruleComposite )
            // InternalAadlV3.g:4089:5: lv_compositeType_0_0= ruleComposite
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCompositeTypeAccess().getCompositeTypeCompositeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_61);
            lv_compositeType_0_0=ruleComposite();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCompositeTypeRule());
              					}
              					set(
              						current,
              						"compositeType",
              						lv_compositeType_0_0,
              						"org.osate.xtext.aadlv3.AadlV3.Composite");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,47,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCompositeTypeAccess().getOfKeyword_1());
              		
            }
            // InternalAadlV3.g:4110:3: ( (lv_type_2_0= ruleTypeReference ) )
            // InternalAadlV3.g:4111:4: (lv_type_2_0= ruleTypeReference )
            {
            // InternalAadlV3.g:4111:4: (lv_type_2_0= ruleTypeReference )
            // InternalAadlV3.g:4112:5: lv_type_2_0= ruleTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCompositeTypeAccess().getTypeTypeReferenceParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCompositeTypeRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"org.osate.xtext.aadlv3.AadlV3.TypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCompositeType"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalAadlV3.g:4133:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalAadlV3.g:4133:54: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalAadlV3.g:4134:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalAadlV3.g:4140:1: rulePrimitiveType returns [EObject current=null] : ( (lv_primitiveType_0_0= rulePrimitive ) ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_primitiveType_0_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4146:2: ( ( (lv_primitiveType_0_0= rulePrimitive ) ) )
            // InternalAadlV3.g:4147:2: ( (lv_primitiveType_0_0= rulePrimitive ) )
            {
            // InternalAadlV3.g:4147:2: ( (lv_primitiveType_0_0= rulePrimitive ) )
            // InternalAadlV3.g:4148:3: (lv_primitiveType_0_0= rulePrimitive )
            {
            // InternalAadlV3.g:4148:3: (lv_primitiveType_0_0= rulePrimitive )
            // InternalAadlV3.g:4149:4: lv_primitiveType_0_0= rulePrimitive
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getPrimitiveTypePrimitiveParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_primitiveType_0_0=rulePrimitive();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getPrimitiveTypeRule());
              				}
              				set(
              					current,
              					"primitiveType",
              					lv_primitiveType_0_0,
              					"org.osate.xtext.aadlv3.AadlV3.Primitive");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleImplementationReference"
    // InternalAadlV3.g:4169:1: entryRuleImplementationReference returns [EObject current=null] : iv_ruleImplementationReference= ruleImplementationReference EOF ;
    public final EObject entryRuleImplementationReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationReference = null;


        try {
            // InternalAadlV3.g:4169:64: (iv_ruleImplementationReference= ruleImplementationReference EOF )
            // InternalAadlV3.g:4170:2: iv_ruleImplementationReference= ruleImplementationReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplementationReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImplementationReference=ruleImplementationReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplementationReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImplementationReference"


    // $ANTLR start "ruleImplementationReference"
    // InternalAadlV3.g:4176:1: ruleImplementationReference returns [EObject current=null] : ( ( ruleQualifiedDottedReference ) ) ;
    public final EObject ruleImplementationReference() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAadlV3.g:4182:2: ( ( ( ruleQualifiedDottedReference ) ) )
            // InternalAadlV3.g:4183:2: ( ( ruleQualifiedDottedReference ) )
            {
            // InternalAadlV3.g:4183:2: ( ( ruleQualifiedDottedReference ) )
            // InternalAadlV3.g:4184:3: ( ruleQualifiedDottedReference )
            {
            // InternalAadlV3.g:4184:3: ( ruleQualifiedDottedReference )
            // InternalAadlV3.g:4185:4: ruleQualifiedDottedReference
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getImplementationReferenceRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getImplementationReferenceAccess().getTypeComponentImplementationCrossReference_0());
              			
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedDottedReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleImplementationReference"


    // $ANTLR start "entryRuleAnnexSubclause"
    // InternalAadlV3.g:4205:1: entryRuleAnnexSubclause returns [EObject current=null] : iv_ruleAnnexSubclause= ruleAnnexSubclause EOF ;
    public final EObject entryRuleAnnexSubclause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnexSubclause = null;


        try {
            // InternalAadlV3.g:4205:55: (iv_ruleAnnexSubclause= ruleAnnexSubclause EOF )
            // InternalAadlV3.g:4206:2: iv_ruleAnnexSubclause= ruleAnnexSubclause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnexSubclauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAnnexSubclause=ruleAnnexSubclause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnexSubclause; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAnnexSubclause"


    // $ANTLR start "ruleAnnexSubclause"
    // InternalAadlV3.g:4212:1: ruleAnnexSubclause returns [EObject current=null] : (this_EMSubclause_0= ruleEMSubclause | this_BASubclause_1= ruleBASubclause | this_DefaultAnnexSubclause_2= ruleDefaultAnnexSubclause ) ;
    public final EObject ruleAnnexSubclause() throws RecognitionException {
        EObject current = null;

        EObject this_EMSubclause_0 = null;

        EObject this_BASubclause_1 = null;

        EObject this_DefaultAnnexSubclause_2 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4218:2: ( (this_EMSubclause_0= ruleEMSubclause | this_BASubclause_1= ruleBASubclause | this_DefaultAnnexSubclause_2= ruleDefaultAnnexSubclause ) )
            // InternalAadlV3.g:4219:2: (this_EMSubclause_0= ruleEMSubclause | this_BASubclause_1= ruleBASubclause | this_DefaultAnnexSubclause_2= ruleDefaultAnnexSubclause )
            {
            // InternalAadlV3.g:4219:2: (this_EMSubclause_0= ruleEMSubclause | this_BASubclause_1= ruleBASubclause | this_DefaultAnnexSubclause_2= ruleDefaultAnnexSubclause )
            int alt67=3;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==18) ) {
                switch ( input.LA(2) ) {
                case 50:
                    {
                    alt67=2;
                    }
                    break;
                case RULE_ID:
                    {
                    alt67=3;
                    }
                    break;
                case 49:
                    {
                    alt67=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // InternalAadlV3.g:4220:3: this_EMSubclause_0= ruleEMSubclause
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnnexSubclauseAccess().getEMSubclauseParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EMSubclause_0=ruleEMSubclause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EMSubclause_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:4232:3: this_BASubclause_1= ruleBASubclause
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnnexSubclauseAccess().getBASubclauseParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BASubclause_1=ruleBASubclause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BASubclause_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:4244:3: this_DefaultAnnexSubclause_2= ruleDefaultAnnexSubclause
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnnexSubclauseAccess().getDefaultAnnexSubclauseParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DefaultAnnexSubclause_2=ruleDefaultAnnexSubclause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DefaultAnnexSubclause_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAnnexSubclause"


    // $ANTLR start "entryRuleDefaultAnnexSubclause"
    // InternalAadlV3.g:4259:1: entryRuleDefaultAnnexSubclause returns [EObject current=null] : iv_ruleDefaultAnnexSubclause= ruleDefaultAnnexSubclause EOF ;
    public final EObject entryRuleDefaultAnnexSubclause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultAnnexSubclause = null;


        try {
            // InternalAadlV3.g:4259:62: (iv_ruleDefaultAnnexSubclause= ruleDefaultAnnexSubclause EOF )
            // InternalAadlV3.g:4260:2: iv_ruleDefaultAnnexSubclause= ruleDefaultAnnexSubclause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultAnnexSubclauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefaultAnnexSubclause=ruleDefaultAnnexSubclause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultAnnexSubclause; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDefaultAnnexSubclause"


    // $ANTLR start "ruleDefaultAnnexSubclause"
    // InternalAadlV3.g:4266:1: ruleDefaultAnnexSubclause returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_body_2_0= RULE_ANNEXTEXT ) ) otherlv_3= ';' ) ;
    public final EObject ruleDefaultAnnexSubclause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_body_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4272:2: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_body_2_0= RULE_ANNEXTEXT ) ) otherlv_3= ';' ) )
            // InternalAadlV3.g:4273:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_body_2_0= RULE_ANNEXTEXT ) ) otherlv_3= ';' )
            {
            // InternalAadlV3.g:4273:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_body_2_0= RULE_ANNEXTEXT ) ) otherlv_3= ';' )
            // InternalAadlV3.g:4274:3: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_body_2_0= RULE_ANNEXTEXT ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDefaultAnnexSubclauseAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalAadlV3.g:4278:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAadlV3.g:4279:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAadlV3.g:4279:4: (lv_name_1_0= RULE_ID )
            // InternalAadlV3.g:4280:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDefaultAnnexSubclauseAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDefaultAnnexSubclauseRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalAadlV3.g:4296:3: ( (lv_body_2_0= RULE_ANNEXTEXT ) )
            // InternalAadlV3.g:4297:4: (lv_body_2_0= RULE_ANNEXTEXT )
            {
            // InternalAadlV3.g:4297:4: (lv_body_2_0= RULE_ANNEXTEXT )
            // InternalAadlV3.g:4298:5: lv_body_2_0= RULE_ANNEXTEXT
            {
            lv_body_2_0=(Token)match(input,RULE_ANNEXTEXT,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_body_2_0, grammarAccess.getDefaultAnnexSubclauseAccess().getBodyANNEXTEXTTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDefaultAnnexSubclauseRule());
              					}
              					setWithLastConsumed(
              						current,
              						"body",
              						lv_body_2_0,
              						"org.osate.xtext.aadlv3.AadlV3.ANNEXTEXT");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDefaultAnnexSubclauseAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDefaultAnnexSubclause"


    // $ANTLR start "rulePropertiesBlock"
    // InternalAadlV3.g:4323:1: rulePropertiesBlock[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '{' ( (lv_ownedPropertyAssociations_1_0= rulePropertyAssociation ) )+ otherlv_2= '}' ) ;
    public final EObject rulePropertiesBlock(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedPropertyAssociations_1_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4329:2: ( (otherlv_0= '{' ( (lv_ownedPropertyAssociations_1_0= rulePropertyAssociation ) )+ otherlv_2= '}' ) )
            // InternalAadlV3.g:4330:2: (otherlv_0= '{' ( (lv_ownedPropertyAssociations_1_0= rulePropertyAssociation ) )+ otherlv_2= '}' )
            {
            // InternalAadlV3.g:4330:2: (otherlv_0= '{' ( (lv_ownedPropertyAssociations_1_0= rulePropertyAssociation ) )+ otherlv_2= '}' )
            // InternalAadlV3.g:4331:3: otherlv_0= '{' ( (lv_ownedPropertyAssociations_1_0= rulePropertyAssociation ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_63); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPropertiesBlockAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalAadlV3.g:4335:3: ( (lv_ownedPropertyAssociations_1_0= rulePropertyAssociation ) )+
            int cnt68=0;
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==RULE_ID||LA68_0==32) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalAadlV3.g:4336:4: (lv_ownedPropertyAssociations_1_0= rulePropertyAssociation )
            	    {
            	    // InternalAadlV3.g:4336:4: (lv_ownedPropertyAssociations_1_0= rulePropertyAssociation )
            	    // InternalAadlV3.g:4337:5: lv_ownedPropertyAssociations_1_0= rulePropertyAssociation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getPropertiesBlockAccess().getOwnedPropertyAssociationsPropertyAssociationParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_64);
            	    lv_ownedPropertyAssociations_1_0=rulePropertyAssociation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getPropertiesBlockRule());
            	      					}
            	      					add(
            	      						current,
            	      						"ownedPropertyAssociations",
            	      						lv_ownedPropertyAssociations_1_0,
            	      						"org.osate.xtext.aadlv3.AadlV3.PropertyAssociation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt68 >= 1 ) break loop68;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(68, input);
                        throw eee;
                }
                cnt68++;
            } while (true);

            otherlv_2=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPropertiesBlockAccess().getRightCurlyBracketKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePropertiesBlock"


    // $ANTLR start "ruleNestedComponentImplementationBlock"
    // InternalAadlV3.g:4363:1: ruleNestedComponentImplementationBlock[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '{' (this_NestedImplementationElement_1= ruleNestedImplementationElement[$current] )+ otherlv_2= '}' ) ;
    public final EObject ruleNestedComponentImplementationBlock(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_NestedImplementationElement_1 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4369:2: ( (otherlv_0= '{' (this_NestedImplementationElement_1= ruleNestedImplementationElement[$current] )+ otherlv_2= '}' ) )
            // InternalAadlV3.g:4370:2: (otherlv_0= '{' (this_NestedImplementationElement_1= ruleNestedImplementationElement[$current] )+ otherlv_2= '}' )
            {
            // InternalAadlV3.g:4370:2: (otherlv_0= '{' (this_NestedImplementationElement_1= ruleNestedImplementationElement[$current] )+ otherlv_2= '}' )
            // InternalAadlV3.g:4371:3: otherlv_0= '{' (this_NestedImplementationElement_1= ruleNestedImplementationElement[$current] )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_63); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNestedComponentImplementationBlockAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalAadlV3.g:4375:3: (this_NestedImplementationElement_1= ruleNestedImplementationElement[$current] )+
            int cnt69=0;
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==RULE_ID||LA69_0==32) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalAadlV3.g:4376:4: this_NestedImplementationElement_1= ruleNestedImplementationElement[$current]
            	    {
            	    if ( state.backtracking==0 ) {

            	      				/* */
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElement(grammarAccess.getNestedComponentImplementationBlockRule());
            	      				}
            	      				newCompositeNode(grammarAccess.getNestedComponentImplementationBlockAccess().getNestedImplementationElementParserRuleCall_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_64);
            	    this_NestedImplementationElement_1=ruleNestedImplementationElement(current);

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current = this_NestedImplementationElement_1;
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt69 >= 1 ) break loop69;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(69, input);
                        throw eee;
                }
                cnt69++;
            } while (true);

            otherlv_2=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getNestedComponentImplementationBlockAccess().getRightCurlyBracketKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNestedComponentImplementationBlock"


    // $ANTLR start "ruleNestedImplementationElement"
    // InternalAadlV3.g:4400:1: ruleNestedImplementationElement[EObject in_current] returns [EObject current=in_current] : ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_bindings_2_0= ruleBinding ) ) | ( (lv_components_3_0= ruleSubcomponent ) ) | ( (lv_ownedPropertyAssociations_4_0= rulePropertyAssociation ) ) ) ;
    public final EObject ruleNestedImplementationElement(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_features_0_0 = null;

        EObject lv_connections_1_0 = null;

        EObject lv_bindings_2_0 = null;

        EObject lv_components_3_0 = null;

        EObject lv_ownedPropertyAssociations_4_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4406:2: ( ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_bindings_2_0= ruleBinding ) ) | ( (lv_components_3_0= ruleSubcomponent ) ) | ( (lv_ownedPropertyAssociations_4_0= rulePropertyAssociation ) ) ) )
            // InternalAadlV3.g:4407:2: ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_bindings_2_0= ruleBinding ) ) | ( (lv_components_3_0= ruleSubcomponent ) ) | ( (lv_ownedPropertyAssociations_4_0= rulePropertyAssociation ) ) )
            {
            // InternalAadlV3.g:4407:2: ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_bindings_2_0= ruleBinding ) ) | ( (lv_components_3_0= ruleSubcomponent ) ) | ( (lv_ownedPropertyAssociations_4_0= rulePropertyAssociation ) ) )
            int alt70=5;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // InternalAadlV3.g:4408:3: ( (lv_features_0_0= ruleFeature ) )
                    {
                    // InternalAadlV3.g:4408:3: ( (lv_features_0_0= ruleFeature ) )
                    // InternalAadlV3.g:4409:4: (lv_features_0_0= ruleFeature )
                    {
                    // InternalAadlV3.g:4409:4: (lv_features_0_0= ruleFeature )
                    // InternalAadlV3.g:4410:5: lv_features_0_0= ruleFeature
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNestedImplementationElementAccess().getFeaturesFeatureParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_features_0_0=ruleFeature();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getNestedImplementationElementRule());
                      					}
                      					add(
                      						current,
                      						"features",
                      						lv_features_0_0,
                      						"org.osate.xtext.aadlv3.AadlV3.Feature");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:4428:3: ( (lv_connections_1_0= ruleConnection ) )
                    {
                    // InternalAadlV3.g:4428:3: ( (lv_connections_1_0= ruleConnection ) )
                    // InternalAadlV3.g:4429:4: (lv_connections_1_0= ruleConnection )
                    {
                    // InternalAadlV3.g:4429:4: (lv_connections_1_0= ruleConnection )
                    // InternalAadlV3.g:4430:5: lv_connections_1_0= ruleConnection
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNestedImplementationElementAccess().getConnectionsConnectionParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_connections_1_0=ruleConnection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getNestedImplementationElementRule());
                      					}
                      					add(
                      						current,
                      						"connections",
                      						lv_connections_1_0,
                      						"org.osate.xtext.aadlv3.AadlV3.Connection");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:4448:3: ( (lv_bindings_2_0= ruleBinding ) )
                    {
                    // InternalAadlV3.g:4448:3: ( (lv_bindings_2_0= ruleBinding ) )
                    // InternalAadlV3.g:4449:4: (lv_bindings_2_0= ruleBinding )
                    {
                    // InternalAadlV3.g:4449:4: (lv_bindings_2_0= ruleBinding )
                    // InternalAadlV3.g:4450:5: lv_bindings_2_0= ruleBinding
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNestedImplementationElementAccess().getBindingsBindingParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_bindings_2_0=ruleBinding();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getNestedImplementationElementRule());
                      					}
                      					add(
                      						current,
                      						"bindings",
                      						lv_bindings_2_0,
                      						"org.osate.xtext.aadlv3.AadlV3.Binding");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAadlV3.g:4468:3: ( (lv_components_3_0= ruleSubcomponent ) )
                    {
                    // InternalAadlV3.g:4468:3: ( (lv_components_3_0= ruleSubcomponent ) )
                    // InternalAadlV3.g:4469:4: (lv_components_3_0= ruleSubcomponent )
                    {
                    // InternalAadlV3.g:4469:4: (lv_components_3_0= ruleSubcomponent )
                    // InternalAadlV3.g:4470:5: lv_components_3_0= ruleSubcomponent
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNestedImplementationElementAccess().getComponentsSubcomponentParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_components_3_0=ruleSubcomponent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getNestedImplementationElementRule());
                      					}
                      					add(
                      						current,
                      						"components",
                      						lv_components_3_0,
                      						"org.osate.xtext.aadlv3.AadlV3.Subcomponent");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalAadlV3.g:4488:3: ( (lv_ownedPropertyAssociations_4_0= rulePropertyAssociation ) )
                    {
                    // InternalAadlV3.g:4488:3: ( (lv_ownedPropertyAssociations_4_0= rulePropertyAssociation ) )
                    // InternalAadlV3.g:4489:4: (lv_ownedPropertyAssociations_4_0= rulePropertyAssociation )
                    {
                    // InternalAadlV3.g:4489:4: (lv_ownedPropertyAssociations_4_0= rulePropertyAssociation )
                    // InternalAadlV3.g:4490:5: lv_ownedPropertyAssociations_4_0= rulePropertyAssociation
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNestedImplementationElementAccess().getOwnedPropertyAssociationsPropertyAssociationParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_ownedPropertyAssociations_4_0=rulePropertyAssociation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getNestedImplementationElementRule());
                      					}
                      					add(
                      						current,
                      						"ownedPropertyAssociations",
                      						lv_ownedPropertyAssociations_4_0,
                      						"org.osate.xtext.aadlv3.AadlV3.PropertyAssociation");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNestedImplementationElement"


    // $ANTLR start "ruleConfigurationExtensions"
    // InternalAadlV3.g:4512:1: ruleConfigurationExtensions[EObject in_current] returns [EObject current=in_current] : ( ( (lv_superClassifiers_0_0= ruleClassifierOrTypeReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleClassifierOrTypeReference ) ) )* ) ;
    public final EObject ruleConfigurationExtensions(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_superClassifiers_0_0 = null;

        EObject lv_superClassifiers_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4518:2: ( ( ( (lv_superClassifiers_0_0= ruleClassifierOrTypeReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleClassifierOrTypeReference ) ) )* ) )
            // InternalAadlV3.g:4519:2: ( ( (lv_superClassifiers_0_0= ruleClassifierOrTypeReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleClassifierOrTypeReference ) ) )* )
            {
            // InternalAadlV3.g:4519:2: ( ( (lv_superClassifiers_0_0= ruleClassifierOrTypeReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleClassifierOrTypeReference ) ) )* )
            // InternalAadlV3.g:4520:3: ( (lv_superClassifiers_0_0= ruleClassifierOrTypeReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleClassifierOrTypeReference ) ) )*
            {
            // InternalAadlV3.g:4520:3: ( (lv_superClassifiers_0_0= ruleClassifierOrTypeReference ) )
            // InternalAadlV3.g:4521:4: (lv_superClassifiers_0_0= ruleClassifierOrTypeReference )
            {
            // InternalAadlV3.g:4521:4: (lv_superClassifiers_0_0= ruleClassifierOrTypeReference )
            // InternalAadlV3.g:4522:5: lv_superClassifiers_0_0= ruleClassifierOrTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConfigurationExtensionsAccess().getSuperClassifiersClassifierOrTypeReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_65);
            lv_superClassifiers_0_0=ruleClassifierOrTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConfigurationExtensionsRule());
              					}
              					add(
              						current,
              						"superClassifiers",
              						lv_superClassifiers_0_0,
              						"org.osate.xtext.aadlv3.AadlV3.ClassifierOrTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:4539:3: (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleClassifierOrTypeReference ) ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==26) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalAadlV3.g:4540:4: otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleClassifierOrTypeReference ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getConfigurationExtensionsAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalAadlV3.g:4544:4: ( (lv_superClassifiers_2_0= ruleClassifierOrTypeReference ) )
            	    // InternalAadlV3.g:4545:5: (lv_superClassifiers_2_0= ruleClassifierOrTypeReference )
            	    {
            	    // InternalAadlV3.g:4545:5: (lv_superClassifiers_2_0= ruleClassifierOrTypeReference )
            	    // InternalAadlV3.g:4546:6: lv_superClassifiers_2_0= ruleClassifierOrTypeReference
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConfigurationExtensionsAccess().getSuperClassifiersClassifierOrTypeReferenceParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_65);
            	    lv_superClassifiers_2_0=ruleClassifierOrTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getConfigurationExtensionsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"superClassifiers",
            	      							lv_superClassifiers_2_0,
            	      							"org.osate.xtext.aadlv3.AadlV3.ClassifierOrTypeReference");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConfigurationExtensions"


    // $ANTLR start "ruleImplementationExtensions"
    // InternalAadlV3.g:4569:1: ruleImplementationExtensions[EObject in_current] returns [EObject current=in_current] : ( ( (lv_superClassifiers_0_0= ruleImplementationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) ) )* ) ;
    public final EObject ruleImplementationExtensions(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_superClassifiers_0_0 = null;

        EObject lv_superClassifiers_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4575:2: ( ( ( (lv_superClassifiers_0_0= ruleImplementationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) ) )* ) )
            // InternalAadlV3.g:4576:2: ( ( (lv_superClassifiers_0_0= ruleImplementationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) ) )* )
            {
            // InternalAadlV3.g:4576:2: ( ( (lv_superClassifiers_0_0= ruleImplementationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) ) )* )
            // InternalAadlV3.g:4577:3: ( (lv_superClassifiers_0_0= ruleImplementationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) ) )*
            {
            // InternalAadlV3.g:4577:3: ( (lv_superClassifiers_0_0= ruleImplementationReference ) )
            // InternalAadlV3.g:4578:4: (lv_superClassifiers_0_0= ruleImplementationReference )
            {
            // InternalAadlV3.g:4578:4: (lv_superClassifiers_0_0= ruleImplementationReference )
            // InternalAadlV3.g:4579:5: lv_superClassifiers_0_0= ruleImplementationReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImplementationExtensionsAccess().getSuperClassifiersImplementationReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_65);
            lv_superClassifiers_0_0=ruleImplementationReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getImplementationExtensionsRule());
              					}
              					add(
              						current,
              						"superClassifiers",
              						lv_superClassifiers_0_0,
              						"org.osate.xtext.aadlv3.AadlV3.ImplementationReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:4596:3: (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==26) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalAadlV3.g:4597:4: otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getImplementationExtensionsAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalAadlV3.g:4601:4: ( (lv_superClassifiers_2_0= ruleImplementationReference ) )
            	    // InternalAadlV3.g:4602:5: (lv_superClassifiers_2_0= ruleImplementationReference )
            	    {
            	    // InternalAadlV3.g:4602:5: (lv_superClassifiers_2_0= ruleImplementationReference )
            	    // InternalAadlV3.g:4603:6: lv_superClassifiers_2_0= ruleImplementationReference
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getImplementationExtensionsAccess().getSuperClassifiersImplementationReferenceParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_65);
            	    lv_superClassifiers_2_0=ruleImplementationReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getImplementationExtensionsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"superClassifiers",
            	      							lv_superClassifiers_2_0,
            	      							"org.osate.xtext.aadlv3.AadlV3.ImplementationReference");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleImplementationExtensions"


    // $ANTLR start "ruleInterfaceExtensions"
    // InternalAadlV3.g:4626:1: ruleInterfaceExtensions[EObject in_current] returns [EObject current=in_current] : ( ( (lv_superClassifiers_0_0= ruleReversableInterfaceReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) ) )* ) ;
    public final EObject ruleInterfaceExtensions(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_superClassifiers_0_0 = null;

        EObject lv_superClassifiers_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4632:2: ( ( ( (lv_superClassifiers_0_0= ruleReversableInterfaceReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) ) )* ) )
            // InternalAadlV3.g:4633:2: ( ( (lv_superClassifiers_0_0= ruleReversableInterfaceReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) ) )* )
            {
            // InternalAadlV3.g:4633:2: ( ( (lv_superClassifiers_0_0= ruleReversableInterfaceReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) ) )* )
            // InternalAadlV3.g:4634:3: ( (lv_superClassifiers_0_0= ruleReversableInterfaceReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) ) )*
            {
            // InternalAadlV3.g:4634:3: ( (lv_superClassifiers_0_0= ruleReversableInterfaceReference ) )
            // InternalAadlV3.g:4635:4: (lv_superClassifiers_0_0= ruleReversableInterfaceReference )
            {
            // InternalAadlV3.g:4635:4: (lv_superClassifiers_0_0= ruleReversableInterfaceReference )
            // InternalAadlV3.g:4636:5: lv_superClassifiers_0_0= ruleReversableInterfaceReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInterfaceExtensionsAccess().getSuperClassifiersReversableInterfaceReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_65);
            lv_superClassifiers_0_0=ruleReversableInterfaceReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getInterfaceExtensionsRule());
              					}
              					add(
              						current,
              						"superClassifiers",
              						lv_superClassifiers_0_0,
              						"org.osate.xtext.aadlv3.AadlV3.ReversableInterfaceReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:4653:3: (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==26) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalAadlV3.g:4654:4: otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getInterfaceExtensionsAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalAadlV3.g:4658:4: ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) )
            	    // InternalAadlV3.g:4659:5: (lv_superClassifiers_2_0= ruleReversableInterfaceReference )
            	    {
            	    // InternalAadlV3.g:4659:5: (lv_superClassifiers_2_0= ruleReversableInterfaceReference )
            	    // InternalAadlV3.g:4660:6: lv_superClassifiers_2_0= ruleReversableInterfaceReference
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getInterfaceExtensionsAccess().getSuperClassifiersReversableInterfaceReferenceParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_65);
            	    lv_superClassifiers_2_0=ruleReversableInterfaceReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getInterfaceExtensionsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"superClassifiers",
            	      							lv_superClassifiers_2_0,
            	      							"org.osate.xtext.aadlv3.AadlV3.ReversableInterfaceReference");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleInterfaceExtensions"


    // $ANTLR start "ruleConfigurationActuals"
    // InternalAadlV3.g:4683:1: ruleConfigurationActuals[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '(' ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )? otherlv_4= ')' ) ;
    public final EObject ruleConfigurationActuals(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_actuals_1_0 = null;

        EObject lv_actuals_3_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4689:2: ( (otherlv_0= '(' ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )? otherlv_4= ')' ) )
            // InternalAadlV3.g:4690:2: (otherlv_0= '(' ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )? otherlv_4= ')' )
            {
            // InternalAadlV3.g:4690:2: (otherlv_0= '(' ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )? otherlv_4= ')' )
            // InternalAadlV3.g:4691:3: otherlv_0= '(' ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )? otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConfigurationActualsAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalAadlV3.g:4695:3: ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_ID) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalAadlV3.g:4696:4: ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )*
                    {
                    // InternalAadlV3.g:4696:4: ( (lv_actuals_1_0= ruleConfigurationActual ) )
                    // InternalAadlV3.g:4697:5: (lv_actuals_1_0= ruleConfigurationActual )
                    {
                    // InternalAadlV3.g:4697:5: (lv_actuals_1_0= ruleConfigurationActual )
                    // InternalAadlV3.g:4698:6: lv_actuals_1_0= ruleConfigurationActual
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConfigurationActualsAccess().getActualsConfigurationActualParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
                    lv_actuals_1_0=ruleConfigurationActual();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConfigurationActualsRule());
                      						}
                      						add(
                      							current,
                      							"actuals",
                      							lv_actuals_1_0,
                      							"org.osate.xtext.aadlv3.AadlV3.ConfigurationActual");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAadlV3.g:4715:4: (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==26) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // InternalAadlV3.g:4716:5: otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) )
                    	    {
                    	    otherlv_2=(Token)match(input,26,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getConfigurationActualsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalAadlV3.g:4720:5: ( (lv_actuals_3_0= ruleConfigurationActual ) )
                    	    // InternalAadlV3.g:4721:6: (lv_actuals_3_0= ruleConfigurationActual )
                    	    {
                    	    // InternalAadlV3.g:4721:6: (lv_actuals_3_0= ruleConfigurationActual )
                    	    // InternalAadlV3.g:4722:7: lv_actuals_3_0= ruleConfigurationActual
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getConfigurationActualsAccess().getActualsConfigurationActualParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_19);
                    	    lv_actuals_3_0=ruleConfigurationActual();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getConfigurationActualsRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"actuals",
                    	      								lv_actuals_3_0,
                    	      								"org.osate.xtext.aadlv3.AadlV3.ConfigurationActual");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getConfigurationActualsAccess().getRightParenthesisKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConfigurationActuals"


    // $ANTLR start "entryRuleConfigurationActual"
    // InternalAadlV3.g:4749:1: entryRuleConfigurationActual returns [EObject current=null] : iv_ruleConfigurationActual= ruleConfigurationActual EOF ;
    public final EObject entryRuleConfigurationActual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationActual = null;


        try {
            // InternalAadlV3.g:4749:60: (iv_ruleConfigurationActual= ruleConfigurationActual EOF )
            // InternalAadlV3.g:4750:2: iv_ruleConfigurationActual= ruleConfigurationActual EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigurationActualRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfigurationActual=ruleConfigurationActual();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigurationActual; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConfigurationActual"


    // $ANTLR start "ruleConfigurationActual"
    // InternalAadlV3.g:4756:1: ruleConfigurationActual returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* ) ;
    public final EObject ruleConfigurationActual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_assignedClassifiers_2_0 = null;

        EObject lv_assignedClassifiers_4_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4762:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* ) )
            // InternalAadlV3.g:4763:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* )
            {
            // InternalAadlV3.g:4763:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* )
            // InternalAadlV3.g:4764:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )*
            {
            // InternalAadlV3.g:4764:3: ( (otherlv_0= RULE_ID ) )
            // InternalAadlV3.g:4765:4: (otherlv_0= RULE_ID )
            {
            // InternalAadlV3.g:4765:4: (otherlv_0= RULE_ID )
            // InternalAadlV3.g:4766:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConfigurationActualRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getConfigurationActualAccess().getParameterConfigurationParameterCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConfigurationActualAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            // InternalAadlV3.g:4784:3: ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) )
            // InternalAadlV3.g:4785:4: (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference )
            {
            // InternalAadlV3.g:4785:4: (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference )
            // InternalAadlV3.g:4786:5: lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConfigurationActualAccess().getAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_65);
            lv_assignedClassifiers_2_0=ruleClassifierOrTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConfigurationActualRule());
              					}
              					add(
              						current,
              						"assignedClassifiers",
              						lv_assignedClassifiers_2_0,
              						"org.osate.xtext.aadlv3.AadlV3.ClassifierOrTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:4803:3: (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==26) ) {
                    int LA76_1 = input.LA(2);

                    if ( (LA76_1==RULE_ID) ) {
                        int LA76_3 = input.LA(3);

                        if ( (LA76_3==EOF||LA76_3==24||(LA76_3>=26 && LA76_3<=27)||LA76_3==36||LA76_3==61) ) {
                            alt76=1;
                        }


                    }


                }


                switch (alt76) {
            	case 1 :
            	    // InternalAadlV3.g:4804:4: otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) )
            	    {
            	    otherlv_3=(Token)match(input,26,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getConfigurationActualAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalAadlV3.g:4808:4: ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) )
            	    // InternalAadlV3.g:4809:5: (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference )
            	    {
            	    // InternalAadlV3.g:4809:5: (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference )
            	    // InternalAadlV3.g:4810:6: lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConfigurationActualAccess().getAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_65);
            	    lv_assignedClassifiers_4_0=ruleClassifierOrTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getConfigurationActualRule());
            	      						}
            	      						add(
            	      							current,
            	      							"assignedClassifiers",
            	      							lv_assignedClassifiers_4_0,
            	      							"org.osate.xtext.aadlv3.AadlV3.ClassifierOrTypeReference");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConfigurationActual"


    // $ANTLR start "entryRuleWorkingset"
    // InternalAadlV3.g:4832:1: entryRuleWorkingset returns [EObject current=null] : iv_ruleWorkingset= ruleWorkingset EOF ;
    public final EObject entryRuleWorkingset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkingset = null;


        try {
            // InternalAadlV3.g:4832:51: (iv_ruleWorkingset= ruleWorkingset EOF )
            // InternalAadlV3.g:4833:2: iv_ruleWorkingset= ruleWorkingset EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWorkingsetRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWorkingset=ruleWorkingset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWorkingset; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleWorkingset"


    // $ANTLR start "ruleWorkingset"
    // InternalAadlV3.g:4839:1: ruleWorkingset returns [EObject current=null] : ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'workingset' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'is' (this_UseProps_4= ruleUseProps[$current] )? ( (lv_instanceRoots_5_0= ruleInstanceConfiguration ) )* otherlv_6= 'end' otherlv_7= ';' ) ;
    public final EObject ruleWorkingset() throws RecognitionException {
        EObject current = null;

        Token lv_private_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject this_UseProps_4 = null;

        EObject lv_instanceRoots_5_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4845:2: ( ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'workingset' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'is' (this_UseProps_4= ruleUseProps[$current] )? ( (lv_instanceRoots_5_0= ruleInstanceConfiguration ) )* otherlv_6= 'end' otherlv_7= ';' ) )
            // InternalAadlV3.g:4846:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'workingset' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'is' (this_UseProps_4= ruleUseProps[$current] )? ( (lv_instanceRoots_5_0= ruleInstanceConfiguration ) )* otherlv_6= 'end' otherlv_7= ';' )
            {
            // InternalAadlV3.g:4846:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'workingset' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'is' (this_UseProps_4= ruleUseProps[$current] )? ( (lv_instanceRoots_5_0= ruleInstanceConfiguration ) )* otherlv_6= 'end' otherlv_7= ';' )
            // InternalAadlV3.g:4847:3: ( (lv_private_0_0= 'private' ) )? otherlv_1= 'workingset' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'is' (this_UseProps_4= ruleUseProps[$current] )? ( (lv_instanceRoots_5_0= ruleInstanceConfiguration ) )* otherlv_6= 'end' otherlv_7= ';'
            {
            // InternalAadlV3.g:4847:3: ( (lv_private_0_0= 'private' ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==13) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalAadlV3.g:4848:4: (lv_private_0_0= 'private' )
                    {
                    // InternalAadlV3.g:4848:4: (lv_private_0_0= 'private' )
                    // InternalAadlV3.g:4849:5: lv_private_0_0= 'private'
                    {
                    lv_private_0_0=(Token)match(input,13,FOLLOW_66); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_private_0_0, grammarAccess.getWorkingsetAccess().getPrivatePrivateKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getWorkingsetRule());
                      					}
                      					setWithLastConsumed(current, "private", true, "private");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,48,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWorkingsetAccess().getWorkingsetKeyword_1());
              		
            }
            // InternalAadlV3.g:4865:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalAadlV3.g:4866:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalAadlV3.g:4866:4: (lv_name_2_0= ruleQualifiedName )
            // InternalAadlV3.g:4867:5: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWorkingsetAccess().getNameQualifiedNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWorkingsetRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.osate.xtext.aadlv3.AadlV3.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_67); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getWorkingsetAccess().getIsKeyword_3());
              		
            }
            // InternalAadlV3.g:4888:3: (this_UseProps_4= ruleUseProps[$current] )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==41) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalAadlV3.g:4889:4: this_UseProps_4= ruleUseProps[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getWorkingsetRule());
                      				}
                      				newCompositeNode(grammarAccess.getWorkingsetAccess().getUsePropsParserRuleCall_4());
                      			
                    }
                    pushFollow(FOLLOW_68);
                    this_UseProps_4=ruleUseProps(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_UseProps_4;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalAadlV3.g:4904:3: ( (lv_instanceRoots_5_0= ruleInstanceConfiguration ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==RULE_ID) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalAadlV3.g:4905:4: (lv_instanceRoots_5_0= ruleInstanceConfiguration )
            	    {
            	    // InternalAadlV3.g:4905:4: (lv_instanceRoots_5_0= ruleInstanceConfiguration )
            	    // InternalAadlV3.g:4906:5: lv_instanceRoots_5_0= ruleInstanceConfiguration
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getWorkingsetAccess().getInstanceRootsInstanceConfigurationParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_68);
            	    lv_instanceRoots_5_0=ruleInstanceConfiguration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getWorkingsetRule());
            	      					}
            	      					add(
            	      						current,
            	      						"instanceRoots",
            	      						lv_instanceRoots_5_0,
            	      						"org.osate.xtext.aadlv3.AadlV3.InstanceConfiguration");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getWorkingsetAccess().getEndKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getWorkingsetAccess().getSemicolonKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleWorkingset"


    // $ANTLR start "entryRuleInstanceConfiguration"
    // InternalAadlV3.g:4935:1: entryRuleInstanceConfiguration returns [EObject current=null] : iv_ruleInstanceConfiguration= ruleInstanceConfiguration EOF ;
    public final EObject entryRuleInstanceConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceConfiguration = null;


        try {
            // InternalAadlV3.g:4935:62: (iv_ruleInstanceConfiguration= ruleInstanceConfiguration EOF )
            // InternalAadlV3.g:4936:2: iv_ruleInstanceConfiguration= ruleInstanceConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstanceConfigurationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInstanceConfiguration=ruleInstanceConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstanceConfiguration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInstanceConfiguration"


    // $ANTLR start "ruleInstanceConfiguration"
    // InternalAadlV3.g:4942:1: ruleInstanceConfiguration returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_category_3_0= ruleComponentCategory ) ) ( (lv_typeReferences_4_0= ruleClassifierOrTypeReference ) ) ( (lv_productlineConstraint_5_0= ruleProductLineConstraint ) )? otherlv_6= ';' ) ;
    public final EObject ruleInstanceConfiguration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_category_3_0 = null;

        EObject lv_typeReferences_4_0 = null;

        EObject lv_productlineConstraint_5_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4948:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_category_3_0= ruleComponentCategory ) ) ( (lv_typeReferences_4_0= ruleClassifierOrTypeReference ) ) ( (lv_productlineConstraint_5_0= ruleProductLineConstraint ) )? otherlv_6= ';' ) )
            // InternalAadlV3.g:4949:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_category_3_0= ruleComponentCategory ) ) ( (lv_typeReferences_4_0= ruleClassifierOrTypeReference ) ) ( (lv_productlineConstraint_5_0= ruleProductLineConstraint ) )? otherlv_6= ';' )
            {
            // InternalAadlV3.g:4949:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_category_3_0= ruleComponentCategory ) ) ( (lv_typeReferences_4_0= ruleClassifierOrTypeReference ) ) ( (lv_productlineConstraint_5_0= ruleProductLineConstraint ) )? otherlv_6= ';' )
            // InternalAadlV3.g:4950:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_category_3_0= ruleComponentCategory ) ) ( (lv_typeReferences_4_0= ruleClassifierOrTypeReference ) ) ( (lv_productlineConstraint_5_0= ruleProductLineConstraint ) )? otherlv_6= ';'
            {
            // InternalAadlV3.g:4950:3: ()
            // InternalAadlV3.g:4951:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getInstanceConfigurationAccess().getInstanceConfigurationAction_0(),
              					current);
              			
            }

            }

            // InternalAadlV3.g:4960:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAadlV3.g:4961:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAadlV3.g:4961:4: (lv_name_1_0= RULE_ID )
            // InternalAadlV3.g:4962:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getInstanceConfigurationAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInstanceConfigurationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getInstanceConfigurationAccess().getColonKeyword_2());
              		
            }
            // InternalAadlV3.g:4982:3: ( (lv_category_3_0= ruleComponentCategory ) )
            // InternalAadlV3.g:4983:4: (lv_category_3_0= ruleComponentCategory )
            {
            // InternalAadlV3.g:4983:4: (lv_category_3_0= ruleComponentCategory )
            // InternalAadlV3.g:4984:5: lv_category_3_0= ruleComponentCategory
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInstanceConfigurationAccess().getCategoryComponentCategoryParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_category_3_0=ruleComponentCategory();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getInstanceConfigurationRule());
              					}
              					set(
              						current,
              						"category",
              						lv_category_3_0,
              						"org.osate.xtext.aadlv3.AadlV3.ComponentCategory");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:5001:3: ( (lv_typeReferences_4_0= ruleClassifierOrTypeReference ) )
            // InternalAadlV3.g:5002:4: (lv_typeReferences_4_0= ruleClassifierOrTypeReference )
            {
            // InternalAadlV3.g:5002:4: (lv_typeReferences_4_0= ruleClassifierOrTypeReference )
            // InternalAadlV3.g:5003:5: lv_typeReferences_4_0= ruleClassifierOrTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInstanceConfigurationAccess().getTypeReferencesClassifierOrTypeReferenceParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_69);
            lv_typeReferences_4_0=ruleClassifierOrTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getInstanceConfigurationRule());
              					}
              					add(
              						current,
              						"typeReferences",
              						lv_typeReferences_4_0,
              						"org.osate.xtext.aadlv3.AadlV3.ClassifierOrTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:5020:3: ( (lv_productlineConstraint_5_0= ruleProductLineConstraint ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==32) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalAadlV3.g:5021:4: (lv_productlineConstraint_5_0= ruleProductLineConstraint )
                    {
                    // InternalAadlV3.g:5021:4: (lv_productlineConstraint_5_0= ruleProductLineConstraint )
                    // InternalAadlV3.g:5022:5: lv_productlineConstraint_5_0= ruleProductLineConstraint
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getInstanceConfigurationAccess().getProductlineConstraintProductLineConstraintParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_9);
                    lv_productlineConstraint_5_0=ruleProductLineConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getInstanceConfigurationRule());
                      					}
                      					set(
                      						current,
                      						"productlineConstraint",
                      						lv_productlineConstraint_5_0,
                      						"org.osate.xtext.aadlv3.AadlV3.ProductLineConstraint");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getInstanceConfigurationAccess().getSemicolonKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleInstanceConfiguration"


    // $ANTLR start "entryRuleProductLineConstraint"
    // InternalAadlV3.g:5047:1: entryRuleProductLineConstraint returns [EObject current=null] : iv_ruleProductLineConstraint= ruleProductLineConstraint EOF ;
    public final EObject entryRuleProductLineConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductLineConstraint = null;


        try {
            // InternalAadlV3.g:5047:62: (iv_ruleProductLineConstraint= ruleProductLineConstraint EOF )
            // InternalAadlV3.g:5048:2: iv_ruleProductLineConstraint= ruleProductLineConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProductLineConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProductLineConstraint=ruleProductLineConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProductLineConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProductLineConstraint"


    // $ANTLR start "ruleProductLineConstraint"
    // InternalAadlV3.g:5054:1: ruleProductLineConstraint returns [EObject current=null] : ( () ( (lv_left_1_0= rulePropertyReference ) ) ( (lv_operator_2_0= ruleSatisfiesOperation ) ) ( (lv_right_3_0= ruleListLiteral ) ) ) ;
    public final EObject ruleProductLineConstraint() throws RecognitionException {
        EObject current = null;

        EObject lv_left_1_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:5060:2: ( ( () ( (lv_left_1_0= rulePropertyReference ) ) ( (lv_operator_2_0= ruleSatisfiesOperation ) ) ( (lv_right_3_0= ruleListLiteral ) ) ) )
            // InternalAadlV3.g:5061:2: ( () ( (lv_left_1_0= rulePropertyReference ) ) ( (lv_operator_2_0= ruleSatisfiesOperation ) ) ( (lv_right_3_0= ruleListLiteral ) ) )
            {
            // InternalAadlV3.g:5061:2: ( () ( (lv_left_1_0= rulePropertyReference ) ) ( (lv_operator_2_0= ruleSatisfiesOperation ) ) ( (lv_right_3_0= ruleListLiteral ) ) )
            // InternalAadlV3.g:5062:3: () ( (lv_left_1_0= rulePropertyReference ) ) ( (lv_operator_2_0= ruleSatisfiesOperation ) ) ( (lv_right_3_0= ruleListLiteral ) )
            {
            // InternalAadlV3.g:5062:3: ()
            // InternalAadlV3.g:5063:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProductLineConstraintAccess().getConditionOperationAction_0(),
              					current);
              			
            }

            }

            // InternalAadlV3.g:5072:3: ( (lv_left_1_0= rulePropertyReference ) )
            // InternalAadlV3.g:5073:4: (lv_left_1_0= rulePropertyReference )
            {
            // InternalAadlV3.g:5073:4: (lv_left_1_0= rulePropertyReference )
            // InternalAadlV3.g:5074:5: lv_left_1_0= rulePropertyReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getProductLineConstraintAccess().getLeftPropertyReferenceParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_70);
            lv_left_1_0=rulePropertyReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getProductLineConstraintRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_1_0,
              						"org.osate.xtext.aadlv3.AadlV3.PropertyReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:5091:3: ( (lv_operator_2_0= ruleSatisfiesOperation ) )
            // InternalAadlV3.g:5092:4: (lv_operator_2_0= ruleSatisfiesOperation )
            {
            // InternalAadlV3.g:5092:4: (lv_operator_2_0= ruleSatisfiesOperation )
            // InternalAadlV3.g:5093:5: lv_operator_2_0= ruleSatisfiesOperation
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getProductLineConstraintAccess().getOperatorSatisfiesOperationParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_operator_2_0=ruleSatisfiesOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getProductLineConstraintRule());
              					}
              					set(
              						current,
              						"operator",
              						lv_operator_2_0,
              						"org.osate.xtext.aadlv3.AadlV3.SatisfiesOperation");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:5110:3: ( (lv_right_3_0= ruleListLiteral ) )
            // InternalAadlV3.g:5111:4: (lv_right_3_0= ruleListLiteral )
            {
            // InternalAadlV3.g:5111:4: (lv_right_3_0= ruleListLiteral )
            // InternalAadlV3.g:5112:5: lv_right_3_0= ruleListLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getProductLineConstraintAccess().getRightListLiteralParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_right_3_0=ruleListLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getProductLineConstraintRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_3_0,
              						"org.osate.xtext.aadlv3.AadlV3.ListLiteral");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleProductLineConstraint"


    // $ANTLR start "entryRuleEMSubclause"
    // InternalAadlV3.g:5133:1: entryRuleEMSubclause returns [EObject current=null] : iv_ruleEMSubclause= ruleEMSubclause EOF ;
    public final EObject entryRuleEMSubclause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMSubclause = null;


        try {
            // InternalAadlV3.g:5133:52: (iv_ruleEMSubclause= ruleEMSubclause EOF )
            // InternalAadlV3.g:5134:2: iv_ruleEMSubclause= ruleEMSubclause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEMSubclauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEMSubclause=ruleEMSubclause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEMSubclause; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEMSubclause"


    // $ANTLR start "ruleEMSubclause"
    // InternalAadlV3.g:5140:1: ruleEMSubclause returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= 'EM' ) ) otherlv_2= '{' this_BehaviorSpecificationBlock_3= ruleBehaviorSpecificationBlock[$current] otherlv_4= '}' otherlv_5= ';' ) ;
    public final EObject ruleEMSubclause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject this_BehaviorSpecificationBlock_3 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:5146:2: ( (otherlv_0= '@' ( (lv_name_1_0= 'EM' ) ) otherlv_2= '{' this_BehaviorSpecificationBlock_3= ruleBehaviorSpecificationBlock[$current] otherlv_4= '}' otherlv_5= ';' ) )
            // InternalAadlV3.g:5147:2: (otherlv_0= '@' ( (lv_name_1_0= 'EM' ) ) otherlv_2= '{' this_BehaviorSpecificationBlock_3= ruleBehaviorSpecificationBlock[$current] otherlv_4= '}' otherlv_5= ';' )
            {
            // InternalAadlV3.g:5147:2: (otherlv_0= '@' ( (lv_name_1_0= 'EM' ) ) otherlv_2= '{' this_BehaviorSpecificationBlock_3= ruleBehaviorSpecificationBlock[$current] otherlv_4= '}' otherlv_5= ';' )
            // InternalAadlV3.g:5148:3: otherlv_0= '@' ( (lv_name_1_0= 'EM' ) ) otherlv_2= '{' this_BehaviorSpecificationBlock_3= ruleBehaviorSpecificationBlock[$current] otherlv_4= '}' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEMSubclauseAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalAadlV3.g:5152:3: ( (lv_name_1_0= 'EM' ) )
            // InternalAadlV3.g:5153:4: (lv_name_1_0= 'EM' )
            {
            // InternalAadlV3.g:5153:4: (lv_name_1_0= 'EM' )
            // InternalAadlV3.g:5154:5: lv_name_1_0= 'EM'
            {
            lv_name_1_0=(Token)match(input,49,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getEMSubclauseAccess().getNameEMKeyword_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEMSubclauseRule());
              					}
              					setWithLastConsumed(current, "name", lv_name_1_0, "EM");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_72); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getEMSubclauseAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getEMSubclauseRule());
              			}
              			newCompositeNode(grammarAccess.getEMSubclauseAccess().getBehaviorSpecificationBlockParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_11);
            this_BehaviorSpecificationBlock_3=ruleBehaviorSpecificationBlock(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BehaviorSpecificationBlock_3;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,20,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getEMSubclauseAccess().getRightCurlyBracketKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getEMSubclauseAccess().getSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEMSubclause"


    // $ANTLR start "entryRuleBASubclause"
    // InternalAadlV3.g:5196:1: entryRuleBASubclause returns [EObject current=null] : iv_ruleBASubclause= ruleBASubclause EOF ;
    public final EObject entryRuleBASubclause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBASubclause = null;


        try {
            // InternalAadlV3.g:5196:52: (iv_ruleBASubclause= ruleBASubclause EOF )
            // InternalAadlV3.g:5197:2: iv_ruleBASubclause= ruleBASubclause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBASubclauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBASubclause=ruleBASubclause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBASubclause; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBASubclause"


    // $ANTLR start "ruleBASubclause"
    // InternalAadlV3.g:5203:1: ruleBASubclause returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= 'BA' ) ) otherlv_2= '{' this_BehaviorSpecificationBlock_3= ruleBehaviorSpecificationBlock[$current] otherlv_4= '}' otherlv_5= ';' ) ;
    public final EObject ruleBASubclause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject this_BehaviorSpecificationBlock_3 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:5209:2: ( (otherlv_0= '@' ( (lv_name_1_0= 'BA' ) ) otherlv_2= '{' this_BehaviorSpecificationBlock_3= ruleBehaviorSpecificationBlock[$current] otherlv_4= '}' otherlv_5= ';' ) )
            // InternalAadlV3.g:5210:2: (otherlv_0= '@' ( (lv_name_1_0= 'BA' ) ) otherlv_2= '{' this_BehaviorSpecificationBlock_3= ruleBehaviorSpecificationBlock[$current] otherlv_4= '}' otherlv_5= ';' )
            {
            // InternalAadlV3.g:5210:2: (otherlv_0= '@' ( (lv_name_1_0= 'BA' ) ) otherlv_2= '{' this_BehaviorSpecificationBlock_3= ruleBehaviorSpecificationBlock[$current] otherlv_4= '}' otherlv_5= ';' )
            // InternalAadlV3.g:5211:3: otherlv_0= '@' ( (lv_name_1_0= 'BA' ) ) otherlv_2= '{' this_BehaviorSpecificationBlock_3= ruleBehaviorSpecificationBlock[$current] otherlv_4= '}' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_73); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBASubclauseAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalAadlV3.g:5215:3: ( (lv_name_1_0= 'BA' ) )
            // InternalAadlV3.g:5216:4: (lv_name_1_0= 'BA' )
            {
            // InternalAadlV3.g:5216:4: (lv_name_1_0= 'BA' )
            // InternalAadlV3.g:5217:5: lv_name_1_0= 'BA'
            {
            lv_name_1_0=(Token)match(input,50,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getBASubclauseAccess().getNameBAKeyword_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBASubclauseRule());
              					}
              					setWithLastConsumed(current, "name", lv_name_1_0, "BA");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_72); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getBASubclauseAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getBASubclauseRule());
              			}
              			newCompositeNode(grammarAccess.getBASubclauseAccess().getBehaviorSpecificationBlockParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_11);
            this_BehaviorSpecificationBlock_3=ruleBehaviorSpecificationBlock(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BehaviorSpecificationBlock_3;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,20,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getBASubclauseAccess().getRightCurlyBracketKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getBASubclauseAccess().getSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBASubclause"


    // $ANTLR start "ruleBehaviorSpecificationBlock"
    // InternalAadlV3.g:5260:1: ruleBehaviorSpecificationBlock[EObject in_current] returns [EObject current=in_current] : ( (otherlv_0= 'use' otherlv_1= 'states' ( ( ruleQualifiedName ) ) otherlv_3= ';' )? (this_BehaviorSpecificationElement_4= ruleBehaviorSpecificationElement[$current] )* ) ;
    public final EObject ruleBehaviorSpecificationBlock(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_BehaviorSpecificationElement_4 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:5266:2: ( ( (otherlv_0= 'use' otherlv_1= 'states' ( ( ruleQualifiedName ) ) otherlv_3= ';' )? (this_BehaviorSpecificationElement_4= ruleBehaviorSpecificationElement[$current] )* ) )
            // InternalAadlV3.g:5267:2: ( (otherlv_0= 'use' otherlv_1= 'states' ( ( ruleQualifiedName ) ) otherlv_3= ';' )? (this_BehaviorSpecificationElement_4= ruleBehaviorSpecificationElement[$current] )* )
            {
            // InternalAadlV3.g:5267:2: ( (otherlv_0= 'use' otherlv_1= 'states' ( ( ruleQualifiedName ) ) otherlv_3= ';' )? (this_BehaviorSpecificationElement_4= ruleBehaviorSpecificationElement[$current] )* )
            // InternalAadlV3.g:5268:3: (otherlv_0= 'use' otherlv_1= 'states' ( ( ruleQualifiedName ) ) otherlv_3= ';' )? (this_BehaviorSpecificationElement_4= ruleBehaviorSpecificationElement[$current] )*
            {
            // InternalAadlV3.g:5268:3: (otherlv_0= 'use' otherlv_1= 'states' ( ( ruleQualifiedName ) ) otherlv_3= ';' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==41) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalAadlV3.g:5269:4: otherlv_0= 'use' otherlv_1= 'states' ( ( ruleQualifiedName ) ) otherlv_3= ';'
                    {
                    otherlv_0=(Token)match(input,41,FOLLOW_74); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getBehaviorSpecificationBlockAccess().getUseKeyword_0_0());
                      			
                    }
                    otherlv_1=(Token)match(input,51,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getBehaviorSpecificationBlockAccess().getStatesKeyword_0_1());
                      			
                    }
                    // InternalAadlV3.g:5277:4: ( ( ruleQualifiedName ) )
                    // InternalAadlV3.g:5278:5: ( ruleQualifiedName )
                    {
                    // InternalAadlV3.g:5278:5: ( ruleQualifiedName )
                    // InternalAadlV3.g:5279:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getBehaviorSpecificationBlockRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBehaviorSpecificationBlockAccess().getStatesTypeDefCrossReference_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,17,FOLLOW_75); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getBehaviorSpecificationBlockAccess().getSemicolonKeyword_0_3());
                      			
                    }

                    }
                    break;

            }

            // InternalAadlV3.g:5301:3: (this_BehaviorSpecificationElement_4= ruleBehaviorSpecificationElement[$current] )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==RULE_ID) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalAadlV3.g:5302:4: this_BehaviorSpecificationElement_4= ruleBehaviorSpecificationElement[$current]
            	    {
            	    if ( state.backtracking==0 ) {

            	      				/* */
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElement(grammarAccess.getBehaviorSpecificationBlockRule());
            	      				}
            	      				newCompositeNode(grammarAccess.getBehaviorSpecificationBlockAccess().getBehaviorSpecificationElementParserRuleCall_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_75);
            	    this_BehaviorSpecificationElement_4=ruleBehaviorSpecificationElement(current);

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current = this_BehaviorSpecificationElement_4;
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBehaviorSpecificationBlock"


    // $ANTLR start "ruleBehaviorSpecificationElement"
    // InternalAadlV3.g:5322:1: ruleBehaviorSpecificationElement[EObject in_current] returns [EObject current=in_current] : ( ( (lv_generators_0_0= ruleEvent ) ) | ( (lv_rules_1_0= ruleBehaviorRule ) ) ) ;
    public final EObject ruleBehaviorSpecificationElement(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_generators_0_0 = null;

        EObject lv_rules_1_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:5328:2: ( ( ( (lv_generators_0_0= ruleEvent ) ) | ( (lv_rules_1_0= ruleBehaviorRule ) ) ) )
            // InternalAadlV3.g:5329:2: ( ( (lv_generators_0_0= ruleEvent ) ) | ( (lv_rules_1_0= ruleBehaviorRule ) ) )
            {
            // InternalAadlV3.g:5329:2: ( ( (lv_generators_0_0= ruleEvent ) ) | ( (lv_rules_1_0= ruleBehaviorRule ) ) )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==RULE_ID) ) {
                int LA83_1 = input.LA(2);

                if ( (LA83_1==22) ) {
                    int LA83_2 = input.LA(3);

                    if ( ((LA83_2>=52 && LA83_2<=54)) ) {
                        alt83=1;
                    }
                    else if ( (LA83_2==RULE_ID||LA83_2==25||LA83_2==39||LA83_2==47||(LA83_2>=86 && LA83_2<=89)) ) {
                        alt83=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 83, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 83, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // InternalAadlV3.g:5330:3: ( (lv_generators_0_0= ruleEvent ) )
                    {
                    // InternalAadlV3.g:5330:3: ( (lv_generators_0_0= ruleEvent ) )
                    // InternalAadlV3.g:5331:4: (lv_generators_0_0= ruleEvent )
                    {
                    // InternalAadlV3.g:5331:4: (lv_generators_0_0= ruleEvent )
                    // InternalAadlV3.g:5332:5: lv_generators_0_0= ruleEvent
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBehaviorSpecificationElementAccess().getGeneratorsEventParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_generators_0_0=ruleEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getBehaviorSpecificationElementRule());
                      					}
                      					add(
                      						current,
                      						"generators",
                      						lv_generators_0_0,
                      						"org.osate.xtext.aadlv3.AadlV3.Event");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:5350:3: ( (lv_rules_1_0= ruleBehaviorRule ) )
                    {
                    // InternalAadlV3.g:5350:3: ( (lv_rules_1_0= ruleBehaviorRule ) )
                    // InternalAadlV3.g:5351:4: (lv_rules_1_0= ruleBehaviorRule )
                    {
                    // InternalAadlV3.g:5351:4: (lv_rules_1_0= ruleBehaviorRule )
                    // InternalAadlV3.g:5352:5: lv_rules_1_0= ruleBehaviorRule
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBehaviorSpecificationElementAccess().getRulesBehaviorRuleParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_rules_1_0=ruleBehaviorRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getBehaviorSpecificationElementRule());
                      					}
                      					add(
                      						current,
                      						"rules",
                      						lv_rules_1_0,
                      						"org.osate.xtext.aadlv3.AadlV3.BehaviorRule");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBehaviorSpecificationElement"


    // $ANTLR start "entryRuleEvent"
    // InternalAadlV3.g:5373:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalAadlV3.g:5373:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalAadlV3.g:5374:2: iv_ruleEvent= ruleEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEvent; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalAadlV3.g:5380:1: ruleEvent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_type_2_1= 'error' | lv_type_2_2= 'recover' | lv_type_2_3= 'repair' ) ) ) otherlv_3= 'event' ( (lv_value_4_0= ruleLiteral ) )? otherlv_5= ';' ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_type_2_1=null;
        Token lv_type_2_2=null;
        Token lv_type_2_3=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:5386:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_type_2_1= 'error' | lv_type_2_2= 'recover' | lv_type_2_3= 'repair' ) ) ) otherlv_3= 'event' ( (lv_value_4_0= ruleLiteral ) )? otherlv_5= ';' ) )
            // InternalAadlV3.g:5387:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_type_2_1= 'error' | lv_type_2_2= 'recover' | lv_type_2_3= 'repair' ) ) ) otherlv_3= 'event' ( (lv_value_4_0= ruleLiteral ) )? otherlv_5= ';' )
            {
            // InternalAadlV3.g:5387:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_type_2_1= 'error' | lv_type_2_2= 'recover' | lv_type_2_3= 'repair' ) ) ) otherlv_3= 'event' ( (lv_value_4_0= ruleLiteral ) )? otherlv_5= ';' )
            // InternalAadlV3.g:5388:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_type_2_1= 'error' | lv_type_2_2= 'recover' | lv_type_2_3= 'repair' ) ) ) otherlv_3= 'event' ( (lv_value_4_0= ruleLiteral ) )? otherlv_5= ';'
            {
            // InternalAadlV3.g:5388:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:5389:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:5389:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:5390:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEventRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_76); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEventAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:5410:3: ( ( (lv_type_2_1= 'error' | lv_type_2_2= 'recover' | lv_type_2_3= 'repair' ) ) )
            // InternalAadlV3.g:5411:4: ( (lv_type_2_1= 'error' | lv_type_2_2= 'recover' | lv_type_2_3= 'repair' ) )
            {
            // InternalAadlV3.g:5411:4: ( (lv_type_2_1= 'error' | lv_type_2_2= 'recover' | lv_type_2_3= 'repair' ) )
            // InternalAadlV3.g:5412:5: (lv_type_2_1= 'error' | lv_type_2_2= 'recover' | lv_type_2_3= 'repair' )
            {
            // InternalAadlV3.g:5412:5: (lv_type_2_1= 'error' | lv_type_2_2= 'recover' | lv_type_2_3= 'repair' )
            int alt84=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt84=1;
                }
                break;
            case 53:
                {
                alt84=2;
                }
                break;
            case 54:
                {
                alt84=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // InternalAadlV3.g:5413:6: lv_type_2_1= 'error'
                    {
                    lv_type_2_1=(Token)match(input,52,FOLLOW_77); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_type_2_1, grammarAccess.getEventAccess().getTypeErrorKeyword_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getEventRule());
                      						}
                      						setWithLastConsumed(current, "type", lv_type_2_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:5424:6: lv_type_2_2= 'recover'
                    {
                    lv_type_2_2=(Token)match(input,53,FOLLOW_77); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_type_2_2, grammarAccess.getEventAccess().getTypeRecoverKeyword_2_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getEventRule());
                      						}
                      						setWithLastConsumed(current, "type", lv_type_2_2, null);
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:5435:6: lv_type_2_3= 'repair'
                    {
                    lv_type_2_3=(Token)match(input,54,FOLLOW_77); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_type_2_3, grammarAccess.getEventAccess().getTypeRepairKeyword_2_0_2());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getEventRule());
                      						}
                      						setWithLastConsumed(current, "type", lv_type_2_3, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,55,FOLLOW_78); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getEventAccess().getEventKeyword_3());
              		
            }
            // InternalAadlV3.g:5452:3: ( (lv_value_4_0= ruleLiteral ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==RULE_ID||(LA85_0>=RULE_INT && LA85_0<=RULE_STRING)||(LA85_0>=24 && LA85_0<=25)||LA85_0==32||LA85_0==47||(LA85_0>=58 && LA85_0<=59)||(LA85_0>=76 && LA85_0<=77)||(LA85_0>=86 && LA85_0<=89)) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalAadlV3.g:5453:4: (lv_value_4_0= ruleLiteral )
                    {
                    // InternalAadlV3.g:5453:4: (lv_value_4_0= ruleLiteral )
                    // InternalAadlV3.g:5454:5: lv_value_4_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEventAccess().getValueLiteralParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_9);
                    lv_value_4_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEventRule());
                      					}
                      					set(
                      						current,
                      						"value",
                      						lv_value_4_0,
                      						"org.osate.xtext.aadlv3.AadlV3.Literal");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getEventAccess().getSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleBehaviorRule"
    // InternalAadlV3.g:5479:1: entryRuleBehaviorRule returns [EObject current=null] : iv_ruleBehaviorRule= ruleBehaviorRule EOF ;
    public final EObject entryRuleBehaviorRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorRule = null;


        try {
            // InternalAadlV3.g:5479:53: (iv_ruleBehaviorRule= ruleBehaviorRule EOF )
            // InternalAadlV3.g:5480:2: iv_ruleBehaviorRule= ruleBehaviorRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBehaviorRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBehaviorRule=ruleBehaviorRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBehaviorRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBehaviorRule"


    // $ANTLR start "ruleBehaviorRule"
    // InternalAadlV3.g:5486:1: ruleBehaviorRule returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' (this_StateTransitionRule_2= ruleStateTransitionRule[$current] | this_StatelessRule_3= ruleStatelessRule[$current] ) ) ;
    public final EObject ruleBehaviorRule() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject this_StateTransitionRule_2 = null;

        EObject this_StatelessRule_3 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:5492:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' (this_StateTransitionRule_2= ruleStateTransitionRule[$current] | this_StatelessRule_3= ruleStatelessRule[$current] ) ) )
            // InternalAadlV3.g:5493:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' (this_StateTransitionRule_2= ruleStateTransitionRule[$current] | this_StatelessRule_3= ruleStatelessRule[$current] ) )
            {
            // InternalAadlV3.g:5493:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' (this_StateTransitionRule_2= ruleStateTransitionRule[$current] | this_StatelessRule_3= ruleStatelessRule[$current] ) )
            // InternalAadlV3.g:5494:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' (this_StateTransitionRule_2= ruleStateTransitionRule[$current] | this_StatelessRule_3= ruleStatelessRule[$current] )
            {
            // InternalAadlV3.g:5494:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:5495:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:5495:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:5496:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getBehaviorRuleAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBehaviorRuleRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_79); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBehaviorRuleAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:5516:3: (this_StateTransitionRule_2= ruleStateTransitionRule[$current] | this_StatelessRule_3= ruleStatelessRule[$current] )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==RULE_ID) ) {
                int LA86_1 = input.LA(2);

                if ( (LA86_1==36||LA86_1==39||LA86_1==76) ) {
                    alt86=2;
                }
                else if ( (LA86_1==56) ) {
                    alt86=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 86, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA86_0==25||LA86_0==39||LA86_0==47||(LA86_0>=86 && LA86_0<=89)) ) {
                alt86=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // InternalAadlV3.g:5517:4: this_StateTransitionRule_2= ruleStateTransitionRule[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getBehaviorRuleRule());
                      				}
                      				newCompositeNode(grammarAccess.getBehaviorRuleAccess().getStateTransitionRuleParserRuleCall_2_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_StateTransitionRule_2=ruleStateTransitionRule(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_StateTransitionRule_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:5532:4: this_StatelessRule_3= ruleStatelessRule[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getBehaviorRuleRule());
                      				}
                      				newCompositeNode(grammarAccess.getBehaviorRuleAccess().getStatelessRuleParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_StatelessRule_3=ruleStatelessRule(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_StatelessRule_3;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBehaviorRule"


    // $ANTLR start "entryRuleAssignment"
    // InternalAadlV3.g:5551:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalAadlV3.g:5551:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalAadlV3.g:5552:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalAadlV3.g:5558:1: ruleAssignment returns [EObject current=null] : ( ( (lv_target_0_0= ruleModelElementReference ) ) (otherlv_1= '(' ( (lv_value_2_0= ruleTypeReference ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_target_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:5564:2: ( ( ( (lv_target_0_0= ruleModelElementReference ) ) (otherlv_1= '(' ( (lv_value_2_0= ruleTypeReference ) ) otherlv_3= ')' )? ) )
            // InternalAadlV3.g:5565:2: ( ( (lv_target_0_0= ruleModelElementReference ) ) (otherlv_1= '(' ( (lv_value_2_0= ruleTypeReference ) ) otherlv_3= ')' )? )
            {
            // InternalAadlV3.g:5565:2: ( ( (lv_target_0_0= ruleModelElementReference ) ) (otherlv_1= '(' ( (lv_value_2_0= ruleTypeReference ) ) otherlv_3= ')' )? )
            // InternalAadlV3.g:5566:3: ( (lv_target_0_0= ruleModelElementReference ) ) (otherlv_1= '(' ( (lv_value_2_0= ruleTypeReference ) ) otherlv_3= ')' )?
            {
            // InternalAadlV3.g:5566:3: ( (lv_target_0_0= ruleModelElementReference ) )
            // InternalAadlV3.g:5567:4: (lv_target_0_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:5567:4: (lv_target_0_0= ruleModelElementReference )
            // InternalAadlV3.g:5568:5: lv_target_0_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignmentAccess().getTargetModelElementReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_60);
            lv_target_0_0=ruleModelElementReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssignmentRule());
              					}
              					set(
              						current,
              						"target",
              						lv_target_0_0,
              						"org.osate.xtext.aadlv3.AadlV3.ModelElementReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:5585:3: (otherlv_1= '(' ( (lv_value_2_0= ruleTypeReference ) ) otherlv_3= ')' )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==24) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalAadlV3.g:5586:4: otherlv_1= '(' ( (lv_value_2_0= ruleTypeReference ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalAadlV3.g:5590:4: ( (lv_value_2_0= ruleTypeReference ) )
                    // InternalAadlV3.g:5591:5: (lv_value_2_0= ruleTypeReference )
                    {
                    // InternalAadlV3.g:5591:5: (lv_value_2_0= ruleTypeReference )
                    // InternalAadlV3.g:5592:6: lv_value_2_0= ruleTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAssignmentAccess().getValueTypeReferenceParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
                    lv_value_2_0=ruleTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAssignmentRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_2_0,
                      							"org.osate.xtext.aadlv3.AadlV3.TypeReference");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getAssignmentAccess().getRightParenthesisKeyword_1_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleCurrentState"
    // InternalAadlV3.g:5618:1: entryRuleCurrentState returns [EObject current=null] : iv_ruleCurrentState= ruleCurrentState EOF ;
    public final EObject entryRuleCurrentState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCurrentState = null;


        try {
            // InternalAadlV3.g:5618:53: (iv_ruleCurrentState= ruleCurrentState EOF )
            // InternalAadlV3.g:5619:2: iv_ruleCurrentState= ruleCurrentState EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCurrentStateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCurrentState=ruleCurrentState();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCurrentState; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCurrentState"


    // $ANTLR start "ruleCurrentState"
    // InternalAadlV3.g:5625:1: ruleCurrentState returns [EObject current=null] : ( (lv_currentState_0_0= ruleEnumerationLiteral ) ) ;
    public final EObject ruleCurrentState() throws RecognitionException {
        EObject current = null;

        EObject lv_currentState_0_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:5631:2: ( ( (lv_currentState_0_0= ruleEnumerationLiteral ) ) )
            // InternalAadlV3.g:5632:2: ( (lv_currentState_0_0= ruleEnumerationLiteral ) )
            {
            // InternalAadlV3.g:5632:2: ( (lv_currentState_0_0= ruleEnumerationLiteral ) )
            // InternalAadlV3.g:5633:3: (lv_currentState_0_0= ruleEnumerationLiteral )
            {
            // InternalAadlV3.g:5633:3: (lv_currentState_0_0= ruleEnumerationLiteral )
            // InternalAadlV3.g:5634:4: lv_currentState_0_0= ruleEnumerationLiteral
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getCurrentStateAccess().getCurrentStateEnumerationLiteralParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_currentState_0_0=ruleEnumerationLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getCurrentStateRule());
              				}
              				set(
              					current,
              					"currentState",
              					lv_currentState_0_0,
              					"org.osate.xtext.aadlv3.AadlV3.EnumerationLiteral");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCurrentState"


    // $ANTLR start "ruleStateTransitionRule"
    // InternalAadlV3.g:5655:1: ruleStateTransitionRule[EObject in_current] returns [EObject current=in_current] : ( ( (lv_guard_0_0= ruleCurrentState ) ) otherlv_1= '-[' ( ( (lv_condition_2_1= ruleMultiLiteralOperation | lv_condition_2_2= ruleContainsToken | lv_condition_2_3= ruleModelElementReference ) ) ) otherlv_3= ']->' ( (lv_targetState_4_0= ruleCurrentState ) ) (otherlv_5= '{' ( (lv_actions_6_0= ruleAssignment ) )* otherlv_7= '}' )? otherlv_8= ';' ) ;
    public final EObject ruleStateTransitionRule(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_guard_0_0 = null;

        EObject lv_condition_2_1 = null;

        EObject lv_condition_2_2 = null;

        EObject lv_condition_2_3 = null;

        EObject lv_targetState_4_0 = null;

        EObject lv_actions_6_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:5661:2: ( ( ( (lv_guard_0_0= ruleCurrentState ) ) otherlv_1= '-[' ( ( (lv_condition_2_1= ruleMultiLiteralOperation | lv_condition_2_2= ruleContainsToken | lv_condition_2_3= ruleModelElementReference ) ) ) otherlv_3= ']->' ( (lv_targetState_4_0= ruleCurrentState ) ) (otherlv_5= '{' ( (lv_actions_6_0= ruleAssignment ) )* otherlv_7= '}' )? otherlv_8= ';' ) )
            // InternalAadlV3.g:5662:2: ( ( (lv_guard_0_0= ruleCurrentState ) ) otherlv_1= '-[' ( ( (lv_condition_2_1= ruleMultiLiteralOperation | lv_condition_2_2= ruleContainsToken | lv_condition_2_3= ruleModelElementReference ) ) ) otherlv_3= ']->' ( (lv_targetState_4_0= ruleCurrentState ) ) (otherlv_5= '{' ( (lv_actions_6_0= ruleAssignment ) )* otherlv_7= '}' )? otherlv_8= ';' )
            {
            // InternalAadlV3.g:5662:2: ( ( (lv_guard_0_0= ruleCurrentState ) ) otherlv_1= '-[' ( ( (lv_condition_2_1= ruleMultiLiteralOperation | lv_condition_2_2= ruleContainsToken | lv_condition_2_3= ruleModelElementReference ) ) ) otherlv_3= ']->' ( (lv_targetState_4_0= ruleCurrentState ) ) (otherlv_5= '{' ( (lv_actions_6_0= ruleAssignment ) )* otherlv_7= '}' )? otherlv_8= ';' )
            // InternalAadlV3.g:5663:3: ( (lv_guard_0_0= ruleCurrentState ) ) otherlv_1= '-[' ( ( (lv_condition_2_1= ruleMultiLiteralOperation | lv_condition_2_2= ruleContainsToken | lv_condition_2_3= ruleModelElementReference ) ) ) otherlv_3= ']->' ( (lv_targetState_4_0= ruleCurrentState ) ) (otherlv_5= '{' ( (lv_actions_6_0= ruleAssignment ) )* otherlv_7= '}' )? otherlv_8= ';'
            {
            // InternalAadlV3.g:5663:3: ( (lv_guard_0_0= ruleCurrentState ) )
            // InternalAadlV3.g:5664:4: (lv_guard_0_0= ruleCurrentState )
            {
            // InternalAadlV3.g:5664:4: (lv_guard_0_0= ruleCurrentState )
            // InternalAadlV3.g:5665:5: lv_guard_0_0= ruleCurrentState
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStateTransitionRuleAccess().getGuardCurrentStateParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_80);
            lv_guard_0_0=ruleCurrentState();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStateTransitionRuleRule());
              					}
              					set(
              						current,
              						"guard",
              						lv_guard_0_0,
              						"org.osate.xtext.aadlv3.AadlV3.CurrentState");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,56,FOLLOW_81); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getStateTransitionRuleAccess().getHyphenMinusLeftSquareBracketKeyword_1());
              		
            }
            // InternalAadlV3.g:5686:3: ( ( (lv_condition_2_1= ruleMultiLiteralOperation | lv_condition_2_2= ruleContainsToken | lv_condition_2_3= ruleModelElementReference ) ) )
            // InternalAadlV3.g:5687:4: ( (lv_condition_2_1= ruleMultiLiteralOperation | lv_condition_2_2= ruleContainsToken | lv_condition_2_3= ruleModelElementReference ) )
            {
            // InternalAadlV3.g:5687:4: ( (lv_condition_2_1= ruleMultiLiteralOperation | lv_condition_2_2= ruleContainsToken | lv_condition_2_3= ruleModelElementReference ) )
            // InternalAadlV3.g:5688:5: (lv_condition_2_1= ruleMultiLiteralOperation | lv_condition_2_2= ruleContainsToken | lv_condition_2_3= ruleModelElementReference )
            {
            // InternalAadlV3.g:5688:5: (lv_condition_2_1= ruleMultiLiteralOperation | lv_condition_2_2= ruleContainsToken | lv_condition_2_3= ruleModelElementReference )
            int alt88=3;
            alt88 = dfa88.predict(input);
            switch (alt88) {
                case 1 :
                    // InternalAadlV3.g:5689:6: lv_condition_2_1= ruleMultiLiteralOperation
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStateTransitionRuleAccess().getConditionMultiLiteralOperationParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_82);
                    lv_condition_2_1=ruleMultiLiteralOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStateTransitionRuleRule());
                      						}
                      						set(
                      							current,
                      							"condition",
                      							lv_condition_2_1,
                      							"org.osate.xtext.aadlv3.AadlV3.MultiLiteralOperation");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:5705:6: lv_condition_2_2= ruleContainsToken
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStateTransitionRuleAccess().getConditionContainsTokenParserRuleCall_2_0_1());
                      					
                    }
                    pushFollow(FOLLOW_82);
                    lv_condition_2_2=ruleContainsToken();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStateTransitionRuleRule());
                      						}
                      						set(
                      							current,
                      							"condition",
                      							lv_condition_2_2,
                      							"org.osate.xtext.aadlv3.AadlV3.ContainsToken");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:5721:6: lv_condition_2_3= ruleModelElementReference
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStateTransitionRuleAccess().getConditionModelElementReferenceParserRuleCall_2_0_2());
                      					
                    }
                    pushFollow(FOLLOW_82);
                    lv_condition_2_3=ruleModelElementReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStateTransitionRuleRule());
                      						}
                      						set(
                      							current,
                      							"condition",
                      							lv_condition_2_3,
                      							"org.osate.xtext.aadlv3.AadlV3.ModelElementReference");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,57,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getStateTransitionRuleAccess().getRightSquareBracketHyphenMinusGreaterThanSignKeyword_3());
              		
            }
            // InternalAadlV3.g:5743:3: ( (lv_targetState_4_0= ruleCurrentState ) )
            // InternalAadlV3.g:5744:4: (lv_targetState_4_0= ruleCurrentState )
            {
            // InternalAadlV3.g:5744:4: (lv_targetState_4_0= ruleCurrentState )
            // InternalAadlV3.g:5745:5: lv_targetState_4_0= ruleCurrentState
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStateTransitionRuleAccess().getTargetStateCurrentStateParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_targetState_4_0=ruleCurrentState();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStateTransitionRuleRule());
              					}
              					set(
              						current,
              						"targetState",
              						lv_targetState_4_0,
              						"org.osate.xtext.aadlv3.AadlV3.CurrentState");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:5762:3: (otherlv_5= '{' ( (lv_actions_6_0= ruleAssignment ) )* otherlv_7= '}' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==19) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalAadlV3.g:5763:4: otherlv_5= '{' ( (lv_actions_6_0= ruleAssignment ) )* otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_83); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getStateTransitionRuleAccess().getLeftCurlyBracketKeyword_5_0());
                      			
                    }
                    // InternalAadlV3.g:5767:4: ( (lv_actions_6_0= ruleAssignment ) )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==RULE_ID) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // InternalAadlV3.g:5768:5: (lv_actions_6_0= ruleAssignment )
                    	    {
                    	    // InternalAadlV3.g:5768:5: (lv_actions_6_0= ruleAssignment )
                    	    // InternalAadlV3.g:5769:6: lv_actions_6_0= ruleAssignment
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getStateTransitionRuleAccess().getActionsAssignmentParserRuleCall_5_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_83);
                    	    lv_actions_6_0=ruleAssignment();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getStateTransitionRuleRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"actions",
                    	      							lv_actions_6_0,
                    	      							"org.osate.xtext.aadlv3.AadlV3.Assignment");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop89;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,20,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getStateTransitionRuleAccess().getRightCurlyBracketKeyword_5_2());
                      			
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getStateTransitionRuleAccess().getSemicolonKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStateTransitionRule"


    // $ANTLR start "ruleStatelessRule"
    // InternalAadlV3.g:5800:1: ruleStatelessRule[EObject in_current] returns [EObject current=in_current] : ( ( ( (lv_condition_0_1= ruleMultiLiteralOperation | lv_condition_0_2= ruleContainsToken | lv_condition_0_3= ruleModelElementReference ) ) )? otherlv_1= '->' ( (lv_actions_2_0= ruleAssignment ) )* otherlv_3= ';' ) ;
    public final EObject ruleStatelessRule(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_0_1 = null;

        EObject lv_condition_0_2 = null;

        EObject lv_condition_0_3 = null;

        EObject lv_actions_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:5806:2: ( ( ( ( (lv_condition_0_1= ruleMultiLiteralOperation | lv_condition_0_2= ruleContainsToken | lv_condition_0_3= ruleModelElementReference ) ) )? otherlv_1= '->' ( (lv_actions_2_0= ruleAssignment ) )* otherlv_3= ';' ) )
            // InternalAadlV3.g:5807:2: ( ( ( (lv_condition_0_1= ruleMultiLiteralOperation | lv_condition_0_2= ruleContainsToken | lv_condition_0_3= ruleModelElementReference ) ) )? otherlv_1= '->' ( (lv_actions_2_0= ruleAssignment ) )* otherlv_3= ';' )
            {
            // InternalAadlV3.g:5807:2: ( ( ( (lv_condition_0_1= ruleMultiLiteralOperation | lv_condition_0_2= ruleContainsToken | lv_condition_0_3= ruleModelElementReference ) ) )? otherlv_1= '->' ( (lv_actions_2_0= ruleAssignment ) )* otherlv_3= ';' )
            // InternalAadlV3.g:5808:3: ( ( (lv_condition_0_1= ruleMultiLiteralOperation | lv_condition_0_2= ruleContainsToken | lv_condition_0_3= ruleModelElementReference ) ) )? otherlv_1= '->' ( (lv_actions_2_0= ruleAssignment ) )* otherlv_3= ';'
            {
            // InternalAadlV3.g:5808:3: ( ( (lv_condition_0_1= ruleMultiLiteralOperation | lv_condition_0_2= ruleContainsToken | lv_condition_0_3= ruleModelElementReference ) ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==RULE_ID||LA92_0==25||LA92_0==47||(LA92_0>=86 && LA92_0<=89)) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalAadlV3.g:5809:4: ( (lv_condition_0_1= ruleMultiLiteralOperation | lv_condition_0_2= ruleContainsToken | lv_condition_0_3= ruleModelElementReference ) )
                    {
                    // InternalAadlV3.g:5809:4: ( (lv_condition_0_1= ruleMultiLiteralOperation | lv_condition_0_2= ruleContainsToken | lv_condition_0_3= ruleModelElementReference ) )
                    // InternalAadlV3.g:5810:5: (lv_condition_0_1= ruleMultiLiteralOperation | lv_condition_0_2= ruleContainsToken | lv_condition_0_3= ruleModelElementReference )
                    {
                    // InternalAadlV3.g:5810:5: (lv_condition_0_1= ruleMultiLiteralOperation | lv_condition_0_2= ruleContainsToken | lv_condition_0_3= ruleModelElementReference )
                    int alt91=3;
                    alt91 = dfa91.predict(input);
                    switch (alt91) {
                        case 1 :
                            // InternalAadlV3.g:5811:6: lv_condition_0_1= ruleMultiLiteralOperation
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getStatelessRuleAccess().getConditionMultiLiteralOperationParserRuleCall_0_0_0());
                              					
                            }
                            pushFollow(FOLLOW_48);
                            lv_condition_0_1=ruleMultiLiteralOperation();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getStatelessRuleRule());
                              						}
                              						set(
                              							current,
                              							"condition",
                              							lv_condition_0_1,
                              							"org.osate.xtext.aadlv3.AadlV3.MultiLiteralOperation");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalAadlV3.g:5827:6: lv_condition_0_2= ruleContainsToken
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getStatelessRuleAccess().getConditionContainsTokenParserRuleCall_0_0_1());
                              					
                            }
                            pushFollow(FOLLOW_48);
                            lv_condition_0_2=ruleContainsToken();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getStatelessRuleRule());
                              						}
                              						set(
                              							current,
                              							"condition",
                              							lv_condition_0_2,
                              							"org.osate.xtext.aadlv3.AadlV3.ContainsToken");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }
                            break;
                        case 3 :
                            // InternalAadlV3.g:5843:6: lv_condition_0_3= ruleModelElementReference
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getStatelessRuleAccess().getConditionModelElementReferenceParserRuleCall_0_0_2());
                              					
                            }
                            pushFollow(FOLLOW_48);
                            lv_condition_0_3=ruleModelElementReference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getStatelessRuleRule());
                              						}
                              						set(
                              							current,
                              							"condition",
                              							lv_condition_0_3,
                              							"org.osate.xtext.aadlv3.AadlV3.ModelElementReference");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,39,FOLLOW_84); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getStatelessRuleAccess().getHyphenMinusGreaterThanSignKeyword_1());
              		
            }
            // InternalAadlV3.g:5865:3: ( (lv_actions_2_0= ruleAssignment ) )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==RULE_ID) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // InternalAadlV3.g:5866:4: (lv_actions_2_0= ruleAssignment )
            	    {
            	    // InternalAadlV3.g:5866:4: (lv_actions_2_0= ruleAssignment )
            	    // InternalAadlV3.g:5867:5: lv_actions_2_0= ruleAssignment
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getStatelessRuleAccess().getActionsAssignmentParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_84);
            	    lv_actions_2_0=ruleAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getStatelessRuleRule());
            	      					}
            	      					add(
            	      						current,
            	      						"actions",
            	      						lv_actions_2_0,
            	      						"org.osate.xtext.aadlv3.AadlV3.Assignment");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop93;
                }
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getStatelessRuleAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStatelessRule"


    // $ANTLR start "entryRuleContainsToken"
    // InternalAadlV3.g:5892:1: entryRuleContainsToken returns [EObject current=null] : iv_ruleContainsToken= ruleContainsToken EOF ;
    public final EObject entryRuleContainsToken() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainsToken = null;


        try {
            // InternalAadlV3.g:5892:54: (iv_ruleContainsToken= ruleContainsToken EOF )
            // InternalAadlV3.g:5893:2: iv_ruleContainsToken= ruleContainsToken EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainsTokenRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContainsToken=ruleContainsToken();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainsToken; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleContainsToken"


    // $ANTLR start "ruleContainsToken"
    // InternalAadlV3.g:5899:1: ruleContainsToken returns [EObject current=null] : ( ( (lv_left_0_0= ruleModelElementReference ) ) ( (lv_operator_1_0= ruleInOperation ) ) ( (lv_right_2_0= ruleLiteral ) ) ) ;
    public final EObject ruleContainsToken() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        AntlrDatatypeRuleToken lv_operator_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:5905:2: ( ( ( (lv_left_0_0= ruleModelElementReference ) ) ( (lv_operator_1_0= ruleInOperation ) ) ( (lv_right_2_0= ruleLiteral ) ) ) )
            // InternalAadlV3.g:5906:2: ( ( (lv_left_0_0= ruleModelElementReference ) ) ( (lv_operator_1_0= ruleInOperation ) ) ( (lv_right_2_0= ruleLiteral ) ) )
            {
            // InternalAadlV3.g:5906:2: ( ( (lv_left_0_0= ruleModelElementReference ) ) ( (lv_operator_1_0= ruleInOperation ) ) ( (lv_right_2_0= ruleLiteral ) ) )
            // InternalAadlV3.g:5907:3: ( (lv_left_0_0= ruleModelElementReference ) ) ( (lv_operator_1_0= ruleInOperation ) ) ( (lv_right_2_0= ruleLiteral ) )
            {
            // InternalAadlV3.g:5907:3: ( (lv_left_0_0= ruleModelElementReference ) )
            // InternalAadlV3.g:5908:4: (lv_left_0_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:5908:4: (lv_left_0_0= ruleModelElementReference )
            // InternalAadlV3.g:5909:5: lv_left_0_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getContainsTokenAccess().getLeftModelElementReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_85);
            lv_left_0_0=ruleModelElementReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getContainsTokenRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_0_0,
              						"org.osate.xtext.aadlv3.AadlV3.ModelElementReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:5926:3: ( (lv_operator_1_0= ruleInOperation ) )
            // InternalAadlV3.g:5927:4: (lv_operator_1_0= ruleInOperation )
            {
            // InternalAadlV3.g:5927:4: (lv_operator_1_0= ruleInOperation )
            // InternalAadlV3.g:5928:5: lv_operator_1_0= ruleInOperation
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getContainsTokenAccess().getOperatorInOperationParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_27);
            lv_operator_1_0=ruleInOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getContainsTokenRule());
              					}
              					set(
              						current,
              						"operator",
              						lv_operator_1_0,
              						"org.osate.xtext.aadlv3.AadlV3.InOperation");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:5945:3: ( (lv_right_2_0= ruleLiteral ) )
            // InternalAadlV3.g:5946:4: (lv_right_2_0= ruleLiteral )
            {
            // InternalAadlV3.g:5946:4: (lv_right_2_0= ruleLiteral )
            // InternalAadlV3.g:5947:5: lv_right_2_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getContainsTokenAccess().getRightLiteralParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_right_2_0=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getContainsTokenRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_2_0,
              						"org.osate.xtext.aadlv3.AadlV3.Literal");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleContainsToken"


    // $ANTLR start "entryRuleLiteral"
    // InternalAadlV3.g:5968:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalAadlV3.g:5968:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalAadlV3.g:5969:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalAadlV3.g:5975:1: ruleLiteral returns [EObject current=null] : (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_PropertyReference_4= rulePropertyReference | this_PackageElementReference_5= rulePackageElementReference | this_DirectionalLiteral_6= ruleDirectionalLiteral | this_ListLiteral_7= ruleListLiteral | this_MultiLiteralOperation_8= ruleMultiLiteralOperation | this_ContainsToken_9= ruleContainsToken | this_EnumerationLiteral_10= ruleEnumerationLiteral | this_ModelElementReference_11= ruleModelElementReference ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerLiteral_0 = null;

        EObject this_RealLiteral_1 = null;

        EObject this_StringLiteral_2 = null;

        EObject this_BooleanLiteral_3 = null;

        EObject this_PropertyReference_4 = null;

        EObject this_PackageElementReference_5 = null;

        EObject this_DirectionalLiteral_6 = null;

        EObject this_ListLiteral_7 = null;

        EObject this_MultiLiteralOperation_8 = null;

        EObject this_ContainsToken_9 = null;

        EObject this_EnumerationLiteral_10 = null;

        EObject this_ModelElementReference_11 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:5981:2: ( (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_PropertyReference_4= rulePropertyReference | this_PackageElementReference_5= rulePackageElementReference | this_DirectionalLiteral_6= ruleDirectionalLiteral | this_ListLiteral_7= ruleListLiteral | this_MultiLiteralOperation_8= ruleMultiLiteralOperation | this_ContainsToken_9= ruleContainsToken | this_EnumerationLiteral_10= ruleEnumerationLiteral | this_ModelElementReference_11= ruleModelElementReference ) )
            // InternalAadlV3.g:5982:2: (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_PropertyReference_4= rulePropertyReference | this_PackageElementReference_5= rulePackageElementReference | this_DirectionalLiteral_6= ruleDirectionalLiteral | this_ListLiteral_7= ruleListLiteral | this_MultiLiteralOperation_8= ruleMultiLiteralOperation | this_ContainsToken_9= ruleContainsToken | this_EnumerationLiteral_10= ruleEnumerationLiteral | this_ModelElementReference_11= ruleModelElementReference )
            {
            // InternalAadlV3.g:5982:2: (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_PropertyReference_4= rulePropertyReference | this_PackageElementReference_5= rulePackageElementReference | this_DirectionalLiteral_6= ruleDirectionalLiteral | this_ListLiteral_7= ruleListLiteral | this_MultiLiteralOperation_8= ruleMultiLiteralOperation | this_ContainsToken_9= ruleContainsToken | this_EnumerationLiteral_10= ruleEnumerationLiteral | this_ModelElementReference_11= ruleModelElementReference )
            int alt94=12;
            alt94 = dfa94.predict(input);
            switch (alt94) {
                case 1 :
                    // InternalAadlV3.g:5983:3: this_IntegerLiteral_0= ruleIntegerLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IntegerLiteral_0=ruleIntegerLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IntegerLiteral_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:5995:3: this_RealLiteral_1= ruleRealLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getRealLiteralParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RealLiteral_1=ruleRealLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RealLiteral_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:6007:3: this_StringLiteral_2= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_2=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringLiteral_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAadlV3.g:6019:3: this_BooleanLiteral_3= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanLiteral_3=ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanLiteral_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAadlV3.g:6031:3: this_PropertyReference_4= rulePropertyReference
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getPropertyReferenceParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PropertyReference_4=rulePropertyReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PropertyReference_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAadlV3.g:6043:3: this_PackageElementReference_5= rulePackageElementReference
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getPackageElementReferenceParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PackageElementReference_5=rulePackageElementReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PackageElementReference_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalAadlV3.g:6055:3: this_DirectionalLiteral_6= ruleDirectionalLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getDirectionalLiteralParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DirectionalLiteral_6=ruleDirectionalLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DirectionalLiteral_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalAadlV3.g:6067:3: this_ListLiteral_7= ruleListLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getListLiteralParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ListLiteral_7=ruleListLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ListLiteral_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalAadlV3.g:6079:3: this_MultiLiteralOperation_8= ruleMultiLiteralOperation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getMultiLiteralOperationParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MultiLiteralOperation_8=ruleMultiLiteralOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MultiLiteralOperation_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalAadlV3.g:6091:3: this_ContainsToken_9= ruleContainsToken
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getContainsTokenParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ContainsToken_9=ruleContainsToken();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ContainsToken_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalAadlV3.g:6103:3: this_EnumerationLiteral_10= ruleEnumerationLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getEnumerationLiteralParserRuleCall_10());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EnumerationLiteral_10=ruleEnumerationLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EnumerationLiteral_10;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalAadlV3.g:6115:3: this_ModelElementReference_11= ruleModelElementReference
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getModelElementReferenceParserRuleCall_11());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ModelElementReference_11=ruleModelElementReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ModelElementReference_11;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRulePackageElementReference"
    // InternalAadlV3.g:6130:1: entryRulePackageElementReference returns [EObject current=null] : iv_rulePackageElementReference= rulePackageElementReference EOF ;
    public final EObject entryRulePackageElementReference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageElementReference = null;


        try {
            // InternalAadlV3.g:6130:64: (iv_rulePackageElementReference= rulePackageElementReference EOF )
            // InternalAadlV3.g:6131:2: iv_rulePackageElementReference= rulePackageElementReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageElementReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePackageElementReference=rulePackageElementReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackageElementReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePackageElementReference"


    // $ANTLR start "rulePackageElementReference"
    // InternalAadlV3.g:6137:1: rulePackageElementReference returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject rulePackageElementReference() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAadlV3.g:6143:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAadlV3.g:6144:2: ( ( ruleQualifiedName ) )
            {
            // InternalAadlV3.g:6144:2: ( ( ruleQualifiedName ) )
            // InternalAadlV3.g:6145:3: ( ruleQualifiedName )
            {
            // InternalAadlV3.g:6145:3: ( ruleQualifiedName )
            // InternalAadlV3.g:6146:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getPackageElementReferenceRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getPackageElementReferenceAccess().getElementPackageElementCrossReference_0());
              			
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePackageElementReference"


    // $ANTLR start "entryRulePropertyReference"
    // InternalAadlV3.g:6166:1: entryRulePropertyReference returns [EObject current=null] : iv_rulePropertyReference= rulePropertyReference EOF ;
    public final EObject entryRulePropertyReference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyReference = null;


        try {
            // InternalAadlV3.g:6166:58: (iv_rulePropertyReference= rulePropertyReference EOF )
            // InternalAadlV3.g:6167:2: iv_rulePropertyReference= rulePropertyReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePropertyReference=rulePropertyReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePropertyReference"


    // $ANTLR start "rulePropertyReference"
    // InternalAadlV3.g:6173:1: rulePropertyReference returns [EObject current=null] : (otherlv_0= '#' ( ( ruleQualifiedName ) ) ) ;
    public final EObject rulePropertyReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalAadlV3.g:6179:2: ( (otherlv_0= '#' ( ( ruleQualifiedName ) ) ) )
            // InternalAadlV3.g:6180:2: (otherlv_0= '#' ( ( ruleQualifiedName ) ) )
            {
            // InternalAadlV3.g:6180:2: (otherlv_0= '#' ( ( ruleQualifiedName ) ) )
            // InternalAadlV3.g:6181:3: otherlv_0= '#' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPropertyReferenceAccess().getNumberSignKeyword_0());
              		
            }
            // InternalAadlV3.g:6185:3: ( ( ruleQualifiedName ) )
            // InternalAadlV3.g:6186:4: ( ruleQualifiedName )
            {
            // InternalAadlV3.g:6186:4: ( ruleQualifiedName )
            // InternalAadlV3.g:6187:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPropertyReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPropertyReferenceAccess().getElementPackageElementCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePropertyReference"


    // $ANTLR start "entryRuleIntegerLiteral"
    // InternalAadlV3.g:6208:1: entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final EObject entryRuleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteral = null;


        try {
            // InternalAadlV3.g:6208:55: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // InternalAadlV3.g:6209:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntegerLiteral"


    // $ANTLR start "ruleIntegerLiteral"
    // InternalAadlV3.g:6215:1: ruleIntegerLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= RULE_ID ) )? ) ;
    public final EObject ruleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_unit_2_0=null;


        	enterRule();

        try {
            // InternalAadlV3.g:6221:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= RULE_ID ) )? ) )
            // InternalAadlV3.g:6222:2: ( () ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= RULE_ID ) )? )
            {
            // InternalAadlV3.g:6222:2: ( () ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= RULE_ID ) )? )
            // InternalAadlV3.g:6223:3: () ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= RULE_ID ) )?
            {
            // InternalAadlV3.g:6223:3: ()
            // InternalAadlV3.g:6224:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIntegerLiteralAccess().getIntegerLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalAadlV3.g:6233:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalAadlV3.g:6234:4: (lv_value_1_0= RULE_INT )
            {
            // InternalAadlV3.g:6234:4: (lv_value_1_0= RULE_INT )
            // InternalAadlV3.g:6235:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_75); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_1_0, grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getIntegerLiteralRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_1_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            // InternalAadlV3.g:6251:3: ( (lv_unit_2_0= RULE_ID ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==RULE_ID) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalAadlV3.g:6252:4: (lv_unit_2_0= RULE_ID )
                    {
                    // InternalAadlV3.g:6252:4: (lv_unit_2_0= RULE_ID )
                    // InternalAadlV3.g:6253:5: lv_unit_2_0= RULE_ID
                    {
                    lv_unit_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_unit_2_0, grammarAccess.getIntegerLiteralAccess().getUnitIDTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getIntegerLiteralRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"unit",
                      						lv_unit_2_0,
                      						"org.eclipse.xtext.common.Terminals.ID");
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIntegerLiteral"


    // $ANTLR start "entryRuleRealLiteral"
    // InternalAadlV3.g:6273:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // InternalAadlV3.g:6273:52: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // InternalAadlV3.g:6274:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRealLiteral"


    // $ANTLR start "ruleRealLiteral"
    // InternalAadlV3.g:6280:1: ruleRealLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_DOUBLE ) ) ( (lv_unit_2_0= RULE_ID ) )? ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_unit_2_0=null;


        	enterRule();

        try {
            // InternalAadlV3.g:6286:2: ( ( () ( (lv_value_1_0= RULE_DOUBLE ) ) ( (lv_unit_2_0= RULE_ID ) )? ) )
            // InternalAadlV3.g:6287:2: ( () ( (lv_value_1_0= RULE_DOUBLE ) ) ( (lv_unit_2_0= RULE_ID ) )? )
            {
            // InternalAadlV3.g:6287:2: ( () ( (lv_value_1_0= RULE_DOUBLE ) ) ( (lv_unit_2_0= RULE_ID ) )? )
            // InternalAadlV3.g:6288:3: () ( (lv_value_1_0= RULE_DOUBLE ) ) ( (lv_unit_2_0= RULE_ID ) )?
            {
            // InternalAadlV3.g:6288:3: ()
            // InternalAadlV3.g:6289:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRealLiteralAccess().getRealLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalAadlV3.g:6298:3: ( (lv_value_1_0= RULE_DOUBLE ) )
            // InternalAadlV3.g:6299:4: (lv_value_1_0= RULE_DOUBLE )
            {
            // InternalAadlV3.g:6299:4: (lv_value_1_0= RULE_DOUBLE )
            // InternalAadlV3.g:6300:5: lv_value_1_0= RULE_DOUBLE
            {
            lv_value_1_0=(Token)match(input,RULE_DOUBLE,FOLLOW_75); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_1_0, grammarAccess.getRealLiteralAccess().getValueDOUBLETerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRealLiteralRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_1_0,
              						"org.osate.xtext.aadlv3.AadlV3.DOUBLE");
              				
            }

            }


            }

            // InternalAadlV3.g:6316:3: ( (lv_unit_2_0= RULE_ID ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==RULE_ID) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalAadlV3.g:6317:4: (lv_unit_2_0= RULE_ID )
                    {
                    // InternalAadlV3.g:6317:4: (lv_unit_2_0= RULE_ID )
                    // InternalAadlV3.g:6318:5: lv_unit_2_0= RULE_ID
                    {
                    lv_unit_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_unit_2_0, grammarAccess.getRealLiteralAccess().getUnitIDTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getRealLiteralRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"unit",
                      						lv_unit_2_0,
                      						"org.eclipse.xtext.common.Terminals.ID");
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRealLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalAadlV3.g:6338:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalAadlV3.g:6338:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalAadlV3.g:6339:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalAadlV3.g:6345:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNoQuoteString ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:6351:2: ( ( () ( (lv_value_1_0= ruleNoQuoteString ) ) ) )
            // InternalAadlV3.g:6352:2: ( () ( (lv_value_1_0= ruleNoQuoteString ) ) )
            {
            // InternalAadlV3.g:6352:2: ( () ( (lv_value_1_0= ruleNoQuoteString ) ) )
            // InternalAadlV3.g:6353:3: () ( (lv_value_1_0= ruleNoQuoteString ) )
            {
            // InternalAadlV3.g:6353:3: ()
            // InternalAadlV3.g:6354:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalAadlV3.g:6363:3: ( (lv_value_1_0= ruleNoQuoteString ) )
            // InternalAadlV3.g:6364:4: (lv_value_1_0= ruleNoQuoteString )
            {
            // InternalAadlV3.g:6364:4: (lv_value_1_0= ruleNoQuoteString )
            // InternalAadlV3.g:6365:5: lv_value_1_0= ruleNoQuoteString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStringLiteralAccess().getValueNoQuoteStringParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleNoQuoteString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStringLiteralRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_1_0,
              						"org.osate.xtext.aadlv3.AadlV3.NoQuoteString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleEnumerationLiteral"
    // InternalAadlV3.g:6386:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteral = null;


        try {
            // InternalAadlV3.g:6386:59: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // InternalAadlV3.g:6387:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumerationLiteral=ruleEnumerationLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumerationLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumerationLiteral"


    // $ANTLR start "ruleEnumerationLiteral"
    // InternalAadlV3.g:6393:1: ruleEnumerationLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalAadlV3.g:6399:2: ( ( () ( (lv_value_1_0= RULE_ID ) ) ) )
            // InternalAadlV3.g:6400:2: ( () ( (lv_value_1_0= RULE_ID ) ) )
            {
            // InternalAadlV3.g:6400:2: ( () ( (lv_value_1_0= RULE_ID ) ) )
            // InternalAadlV3.g:6401:3: () ( (lv_value_1_0= RULE_ID ) )
            {
            // InternalAadlV3.g:6401:3: ()
            // InternalAadlV3.g:6402:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getEnumerationLiteralAccess().getEnumerationLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalAadlV3.g:6411:3: ( (lv_value_1_0= RULE_ID ) )
            // InternalAadlV3.g:6412:4: (lv_value_1_0= RULE_ID )
            {
            // InternalAadlV3.g:6412:4: (lv_value_1_0= RULE_ID )
            // InternalAadlV3.g:6413:5: lv_value_1_0= RULE_ID
            {
            lv_value_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_1_0, grammarAccess.getEnumerationLiteralAccess().getValueIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEnumerationLiteralRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEnumerationLiteral"


    // $ANTLR start "entryRuleNoQuoteString"
    // InternalAadlV3.g:6433:1: entryRuleNoQuoteString returns [String current=null] : iv_ruleNoQuoteString= ruleNoQuoteString EOF ;
    public final String entryRuleNoQuoteString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoQuoteString = null;


        try {
            // InternalAadlV3.g:6433:53: (iv_ruleNoQuoteString= ruleNoQuoteString EOF )
            // InternalAadlV3.g:6434:2: iv_ruleNoQuoteString= ruleNoQuoteString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNoQuoteStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNoQuoteString=ruleNoQuoteString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNoQuoteString.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNoQuoteString"


    // $ANTLR start "ruleNoQuoteString"
    // InternalAadlV3.g:6440:1: ruleNoQuoteString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleNoQuoteString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalAadlV3.g:6446:2: (this_STRING_0= RULE_STRING )
            // InternalAadlV3.g:6447:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STRING_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_STRING_0, grammarAccess.getNoQuoteStringAccess().getSTRINGTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNoQuoteString"


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalAadlV3.g:6457:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalAadlV3.g:6457:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalAadlV3.g:6458:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalAadlV3.g:6464:1: ruleBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalAadlV3.g:6470:2: ( ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) ) )
            // InternalAadlV3.g:6471:2: ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            {
            // InternalAadlV3.g:6471:2: ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            // InternalAadlV3.g:6472:3: () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' )
            {
            // InternalAadlV3.g:6472:3: ()
            // InternalAadlV3.g:6473:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalAadlV3.g:6482:3: ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==58) ) {
                alt97=1;
            }
            else if ( (LA97_0==59) ) {
                alt97=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }
            switch (alt97) {
                case 1 :
                    // InternalAadlV3.g:6483:4: ( (lv_value_1_0= 'true' ) )
                    {
                    // InternalAadlV3.g:6483:4: ( (lv_value_1_0= 'true' ) )
                    // InternalAadlV3.g:6484:5: (lv_value_1_0= 'true' )
                    {
                    // InternalAadlV3.g:6484:5: (lv_value_1_0= 'true' )
                    // InternalAadlV3.g:6485:6: lv_value_1_0= 'true'
                    {
                    lv_value_1_0=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_1_0, grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getBooleanLiteralRule());
                      						}
                      						setWithLastConsumed(current, "value", true, "true");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:6498:4: otherlv_2= 'false'
                    {
                    otherlv_2=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleListLiteral"
    // InternalAadlV3.g:6507:1: entryRuleListLiteral returns [EObject current=null] : iv_ruleListLiteral= ruleListLiteral EOF ;
    public final EObject entryRuleListLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListLiteral = null;


        try {
            // InternalAadlV3.g:6507:52: (iv_ruleListLiteral= ruleListLiteral EOF )
            // InternalAadlV3.g:6508:2: iv_ruleListLiteral= ruleListLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleListLiteral=ruleListLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleListLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleListLiteral"


    // $ANTLR start "ruleListLiteral"
    // InternalAadlV3.g:6514:1: ruleListLiteral returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_elements_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleLiteral ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleListLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:6520:2: ( ( () otherlv_1= '(' ( ( (lv_elements_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleLiteral ) ) )* )? otherlv_5= ')' ) )
            // InternalAadlV3.g:6521:2: ( () otherlv_1= '(' ( ( (lv_elements_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleLiteral ) ) )* )? otherlv_5= ')' )
            {
            // InternalAadlV3.g:6521:2: ( () otherlv_1= '(' ( ( (lv_elements_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleLiteral ) ) )* )? otherlv_5= ')' )
            // InternalAadlV3.g:6522:3: () otherlv_1= '(' ( ( (lv_elements_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleLiteral ) ) )* )? otherlv_5= ')'
            {
            // InternalAadlV3.g:6522:3: ()
            // InternalAadlV3.g:6523:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getListLiteralAccess().getListLiteralAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,24,FOLLOW_86); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getListLiteralAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalAadlV3.g:6536:3: ( ( (lv_elements_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleLiteral ) ) )* )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==RULE_ID||(LA99_0>=RULE_INT && LA99_0<=RULE_STRING)||(LA99_0>=24 && LA99_0<=25)||LA99_0==32||LA99_0==47||(LA99_0>=58 && LA99_0<=59)||(LA99_0>=76 && LA99_0<=77)||(LA99_0>=86 && LA99_0<=89)) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalAadlV3.g:6537:4: ( (lv_elements_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleLiteral ) ) )*
                    {
                    // InternalAadlV3.g:6537:4: ( (lv_elements_2_0= ruleLiteral ) )
                    // InternalAadlV3.g:6538:5: (lv_elements_2_0= ruleLiteral )
                    {
                    // InternalAadlV3.g:6538:5: (lv_elements_2_0= ruleLiteral )
                    // InternalAadlV3.g:6539:6: lv_elements_2_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getListLiteralAccess().getElementsLiteralParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
                    lv_elements_2_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getListLiteralRule());
                      						}
                      						add(
                      							current,
                      							"elements",
                      							lv_elements_2_0,
                      							"org.osate.xtext.aadlv3.AadlV3.Literal");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAadlV3.g:6556:4: (otherlv_3= ',' ( (lv_elements_4_0= ruleLiteral ) ) )*
                    loop98:
                    do {
                        int alt98=2;
                        int LA98_0 = input.LA(1);

                        if ( (LA98_0==26) ) {
                            alt98=1;
                        }


                        switch (alt98) {
                    	case 1 :
                    	    // InternalAadlV3.g:6557:5: otherlv_3= ',' ( (lv_elements_4_0= ruleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FOLLOW_27); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getListLiteralAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalAadlV3.g:6561:5: ( (lv_elements_4_0= ruleLiteral ) )
                    	    // InternalAadlV3.g:6562:6: (lv_elements_4_0= ruleLiteral )
                    	    {
                    	    // InternalAadlV3.g:6562:6: (lv_elements_4_0= ruleLiteral )
                    	    // InternalAadlV3.g:6563:7: lv_elements_4_0= ruleLiteral
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getListLiteralAccess().getElementsLiteralParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_19);
                    	    lv_elements_4_0=ruleLiteral();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getListLiteralRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_4_0,
                    	      								"org.osate.xtext.aadlv3.AadlV3.Literal");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop98;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getListLiteralAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleListLiteral"


    // $ANTLR start "entryRuleDirectionalLiteral"
    // InternalAadlV3.g:6590:1: entryRuleDirectionalLiteral returns [EObject current=null] : iv_ruleDirectionalLiteral= ruleDirectionalLiteral EOF ;
    public final EObject entryRuleDirectionalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectionalLiteral = null;


        try {
            // InternalAadlV3.g:6590:59: (iv_ruleDirectionalLiteral= ruleDirectionalLiteral EOF )
            // InternalAadlV3.g:6591:2: iv_ruleDirectionalLiteral= ruleDirectionalLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDirectionalLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDirectionalLiteral=ruleDirectionalLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDirectionalLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDirectionalLiteral"


    // $ANTLR start "ruleDirectionalLiteral"
    // InternalAadlV3.g:6597:1: ruleDirectionalLiteral returns [EObject current=null] : ( () ( (lv_direction_1_0= rulePropagationDirection ) ) ( (lv_value_2_0= ruleLiteral ) ) ) ;
    public final EObject ruleDirectionalLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_direction_1_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:6603:2: ( ( () ( (lv_direction_1_0= rulePropagationDirection ) ) ( (lv_value_2_0= ruleLiteral ) ) ) )
            // InternalAadlV3.g:6604:2: ( () ( (lv_direction_1_0= rulePropagationDirection ) ) ( (lv_value_2_0= ruleLiteral ) ) )
            {
            // InternalAadlV3.g:6604:2: ( () ( (lv_direction_1_0= rulePropagationDirection ) ) ( (lv_value_2_0= ruleLiteral ) ) )
            // InternalAadlV3.g:6605:3: () ( (lv_direction_1_0= rulePropagationDirection ) ) ( (lv_value_2_0= ruleLiteral ) )
            {
            // InternalAadlV3.g:6605:3: ()
            // InternalAadlV3.g:6606:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDirectionalLiteralAccess().getDirectionalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalAadlV3.g:6615:3: ( (lv_direction_1_0= rulePropagationDirection ) )
            // InternalAadlV3.g:6616:4: (lv_direction_1_0= rulePropagationDirection )
            {
            // InternalAadlV3.g:6616:4: (lv_direction_1_0= rulePropagationDirection )
            // InternalAadlV3.g:6617:5: lv_direction_1_0= rulePropagationDirection
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDirectionalLiteralAccess().getDirectionPropagationDirectionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_27);
            lv_direction_1_0=rulePropagationDirection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDirectionalLiteralRule());
              					}
              					set(
              						current,
              						"direction",
              						lv_direction_1_0,
              						"org.osate.xtext.aadlv3.AadlV3.PropagationDirection");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:6634:3: ( (lv_value_2_0= ruleLiteral ) )
            // InternalAadlV3.g:6635:4: (lv_value_2_0= ruleLiteral )
            {
            // InternalAadlV3.g:6635:4: (lv_value_2_0= ruleLiteral )
            // InternalAadlV3.g:6636:5: lv_value_2_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDirectionalLiteralAccess().getValueLiteralParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDirectionalLiteralRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"org.osate.xtext.aadlv3.AadlV3.Literal");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDirectionalLiteral"


    // $ANTLR start "entryRuleMultiLiteralOperation"
    // InternalAadlV3.g:6657:1: entryRuleMultiLiteralOperation returns [EObject current=null] : iv_ruleMultiLiteralOperation= ruleMultiLiteralOperation EOF ;
    public final EObject entryRuleMultiLiteralOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiLiteralOperation = null;


        try {
            // InternalAadlV3.g:6657:62: (iv_ruleMultiLiteralOperation= ruleMultiLiteralOperation EOF )
            // InternalAadlV3.g:6658:2: iv_ruleMultiLiteralOperation= ruleMultiLiteralOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiLiteralOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiLiteralOperation=ruleMultiLiteralOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiLiteralOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultiLiteralOperation"


    // $ANTLR start "ruleMultiLiteralOperation"
    // InternalAadlV3.g:6664:1: ruleMultiLiteralOperation returns [EObject current=null] : ( () ( (lv_operator_1_0= ruleEOperation ) ) otherlv_2= '(' ( ( (lv_elements_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleLiteral ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleMultiLiteralOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_operator_1_0 = null;

        EObject lv_elements_3_0 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:6670:2: ( ( () ( (lv_operator_1_0= ruleEOperation ) ) otherlv_2= '(' ( ( (lv_elements_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleLiteral ) ) )* )? otherlv_6= ')' ) )
            // InternalAadlV3.g:6671:2: ( () ( (lv_operator_1_0= ruleEOperation ) ) otherlv_2= '(' ( ( (lv_elements_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleLiteral ) ) )* )? otherlv_6= ')' )
            {
            // InternalAadlV3.g:6671:2: ( () ( (lv_operator_1_0= ruleEOperation ) ) otherlv_2= '(' ( ( (lv_elements_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleLiteral ) ) )* )? otherlv_6= ')' )
            // InternalAadlV3.g:6672:3: () ( (lv_operator_1_0= ruleEOperation ) ) otherlv_2= '(' ( ( (lv_elements_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleLiteral ) ) )* )? otherlv_6= ')'
            {
            // InternalAadlV3.g:6672:3: ()
            // InternalAadlV3.g:6673:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getMultiLiteralOperationAccess().getMultiLiteralConstraintAction_0(),
              					current);
              			
            }

            }

            // InternalAadlV3.g:6682:3: ( (lv_operator_1_0= ruleEOperation ) )
            // InternalAadlV3.g:6683:4: (lv_operator_1_0= ruleEOperation )
            {
            // InternalAadlV3.g:6683:4: (lv_operator_1_0= ruleEOperation )
            // InternalAadlV3.g:6684:5: lv_operator_1_0= ruleEOperation
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMultiLiteralOperationAccess().getOperatorEOperationParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_operator_1_0=ruleEOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMultiLiteralOperationRule());
              					}
              					set(
              						current,
              						"operator",
              						lv_operator_1_0,
              						"org.osate.xtext.aadlv3.AadlV3.EOperation");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_86); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMultiLiteralOperationAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalAadlV3.g:6705:3: ( ( (lv_elements_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleLiteral ) ) )* )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==RULE_ID||(LA101_0>=RULE_INT && LA101_0<=RULE_STRING)||(LA101_0>=24 && LA101_0<=25)||LA101_0==32||LA101_0==47||(LA101_0>=58 && LA101_0<=59)||(LA101_0>=76 && LA101_0<=77)||(LA101_0>=86 && LA101_0<=89)) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalAadlV3.g:6706:4: ( (lv_elements_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleLiteral ) ) )*
                    {
                    // InternalAadlV3.g:6706:4: ( (lv_elements_3_0= ruleLiteral ) )
                    // InternalAadlV3.g:6707:5: (lv_elements_3_0= ruleLiteral )
                    {
                    // InternalAadlV3.g:6707:5: (lv_elements_3_0= ruleLiteral )
                    // InternalAadlV3.g:6708:6: lv_elements_3_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMultiLiteralOperationAccess().getElementsLiteralParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
                    lv_elements_3_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMultiLiteralOperationRule());
                      						}
                      						add(
                      							current,
                      							"elements",
                      							lv_elements_3_0,
                      							"org.osate.xtext.aadlv3.AadlV3.Literal");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAadlV3.g:6725:4: (otherlv_4= ',' ( (lv_elements_5_0= ruleLiteral ) ) )*
                    loop100:
                    do {
                        int alt100=2;
                        int LA100_0 = input.LA(1);

                        if ( (LA100_0==26) ) {
                            alt100=1;
                        }


                        switch (alt100) {
                    	case 1 :
                    	    // InternalAadlV3.g:6726:5: otherlv_4= ',' ( (lv_elements_5_0= ruleLiteral ) )
                    	    {
                    	    otherlv_4=(Token)match(input,26,FOLLOW_27); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getMultiLiteralOperationAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalAadlV3.g:6730:5: ( (lv_elements_5_0= ruleLiteral ) )
                    	    // InternalAadlV3.g:6731:6: (lv_elements_5_0= ruleLiteral )
                    	    {
                    	    // InternalAadlV3.g:6731:6: (lv_elements_5_0= ruleLiteral )
                    	    // InternalAadlV3.g:6732:7: lv_elements_5_0= ruleLiteral
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getMultiLiteralOperationAccess().getElementsLiteralParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_19);
                    	    lv_elements_5_0=ruleLiteral();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getMultiLiteralOperationRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_5_0,
                    	      								"org.osate.xtext.aadlv3.AadlV3.Literal");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop100;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getMultiLiteralOperationAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMultiLiteralOperation"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalAadlV3.g:6759:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalAadlV3.g:6759:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalAadlV3.g:6760:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalAadlV3.g:6766:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '::*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:6772:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '::*' ) )
            // InternalAadlV3.g:6773:2: (this_QualifiedName_0= ruleQualifiedName kw= '::*' )
            {
            // InternalAadlV3.g:6773:2: (this_QualifiedName_0= ruleQualifiedName kw= '::*' )
            // InternalAadlV3.g:6774:3: this_QualifiedName_0= ruleQualifiedName kw= '::*'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_87);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getColonColonAsteriskKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleDottedName"
    // InternalAadlV3.g:6793:1: entryRuleDottedName returns [String current=null] : iv_ruleDottedName= ruleDottedName EOF ;
    public final String entryRuleDottedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDottedName = null;


        try {
            // InternalAadlV3.g:6793:50: (iv_ruleDottedName= ruleDottedName EOF )
            // InternalAadlV3.g:6794:2: iv_ruleDottedName= ruleDottedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDottedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDottedName=ruleDottedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDottedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDottedName"


    // $ANTLR start "ruleDottedName"
    // InternalAadlV3.g:6800:1: ruleDottedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleDottedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAadlV3.g:6806:2: ( (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID ) )
            // InternalAadlV3.g:6807:2: (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID )
            {
            // InternalAadlV3.g:6807:2: (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID )
            // InternalAadlV3.g:6808:3: this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_88); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getDottedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,36,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDottedNameAccess().getFullStopKeyword_1());
              		
            }
            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_2, grammarAccess.getDottedNameAccess().getIDTerminalRuleCall_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDottedName"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalAadlV3.g:6831:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAadlV3.g:6831:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAadlV3.g:6832:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAadlV3.g:6838:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAadlV3.g:6844:2: ( (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* ) )
            // InternalAadlV3.g:6845:2: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* )
            {
            // InternalAadlV3.g:6845:2: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* )
            // InternalAadlV3.g:6846:3: this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_89); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalAadlV3.g:6853:3: (kw= '::' this_ID_2= RULE_ID )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==61) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // InternalAadlV3.g:6854:4: kw= '::' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,61,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_89); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop102;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedTypesReference"
    // InternalAadlV3.g:6871:1: entryRuleQualifiedTypesReference returns [String current=null] : iv_ruleQualifiedTypesReference= ruleQualifiedTypesReference EOF ;
    public final String entryRuleQualifiedTypesReference() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedTypesReference = null;


        try {
            // InternalAadlV3.g:6871:63: (iv_ruleQualifiedTypesReference= ruleQualifiedTypesReference EOF )
            // InternalAadlV3.g:6872:2: iv_ruleQualifiedTypesReference= ruleQualifiedTypesReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedTypesReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedTypesReference=ruleQualifiedTypesReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedTypesReference.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedTypesReference"


    // $ANTLR start "ruleQualifiedTypesReference"
    // InternalAadlV3.g:6878:1: ruleQualifiedTypesReference returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedTypesReference() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:6884:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )? ) )
            // InternalAadlV3.g:6885:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )? )
            {
            // InternalAadlV3.g:6885:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )? )
            // InternalAadlV3.g:6886:3: this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedTypesReferenceAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_30);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAadlV3.g:6896:3: (kw= '.' this_ID_2= RULE_ID )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==36) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalAadlV3.g:6897:4: kw= '.' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,36,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getQualifiedTypesReferenceAccess().getFullStopKeyword_1_0());
                      			
                    }
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ID_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_2, grammarAccess.getQualifiedTypesReferenceAccess().getIDTerminalRuleCall_1_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQualifiedTypesReference"


    // $ANTLR start "entryRuleQualifiedReference"
    // InternalAadlV3.g:6914:1: entryRuleQualifiedReference returns [String current=null] : iv_ruleQualifiedReference= ruleQualifiedReference EOF ;
    public final String entryRuleQualifiedReference() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedReference = null;


        try {
            // InternalAadlV3.g:6914:58: (iv_ruleQualifiedReference= ruleQualifiedReference EOF )
            // InternalAadlV3.g:6915:2: iv_ruleQualifiedReference= ruleQualifiedReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedReference=ruleQualifiedReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedReference.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedReference"


    // $ANTLR start "ruleQualifiedReference"
    // InternalAadlV3.g:6921:1: ruleQualifiedReference returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_QualifiedName_0= ruleQualifiedName ;
    public final AntlrDatatypeRuleToken ruleQualifiedReference() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:6927:2: (this_QualifiedName_0= ruleQualifiedName )
            // InternalAadlV3.g:6928:2: this_QualifiedName_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getQualifiedReferenceAccess().getQualifiedNameParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQualifiedReference"


    // $ANTLR start "entryRuleQualifiedDottedReference"
    // InternalAadlV3.g:6941:1: entryRuleQualifiedDottedReference returns [String current=null] : iv_ruleQualifiedDottedReference= ruleQualifiedDottedReference EOF ;
    public final String entryRuleQualifiedDottedReference() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedDottedReference = null;


        try {
            // InternalAadlV3.g:6941:64: (iv_ruleQualifiedDottedReference= ruleQualifiedDottedReference EOF )
            // InternalAadlV3.g:6942:2: iv_ruleQualifiedDottedReference= ruleQualifiedDottedReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedDottedReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedDottedReference=ruleQualifiedDottedReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedDottedReference.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedDottedReference"


    // $ANTLR start "ruleQualifiedDottedReference"
    // InternalAadlV3.g:6948:1: ruleQualifiedDottedReference returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.' this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedDottedReference() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:6954:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '.' this_ID_2= RULE_ID ) )
            // InternalAadlV3.g:6955:2: (this_QualifiedName_0= ruleQualifiedName kw= '.' this_ID_2= RULE_ID )
            {
            // InternalAadlV3.g:6955:2: (this_QualifiedName_0= ruleQualifiedName kw= '.' this_ID_2= RULE_ID )
            // InternalAadlV3.g:6956:3: this_QualifiedName_0= ruleQualifiedName kw= '.' this_ID_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedDottedReferenceAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_88);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,36,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getQualifiedDottedReferenceAccess().getFullStopKeyword_1());
              		
            }
            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_2, grammarAccess.getQualifiedDottedReferenceAccess().getIDTerminalRuleCall_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQualifiedDottedReference"


    // $ANTLR start "entryRuleComponentCategory"
    // InternalAadlV3.g:6982:1: entryRuleComponentCategory returns [String current=null] : iv_ruleComponentCategory= ruleComponentCategory EOF ;
    public final String entryRuleComponentCategory() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComponentCategory = null;


        try {
            // InternalAadlV3.g:6982:57: (iv_ruleComponentCategory= ruleComponentCategory EOF )
            // InternalAadlV3.g:6983:2: iv_ruleComponentCategory= ruleComponentCategory EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComponentCategoryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComponentCategory=ruleComponentCategory();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComponentCategory.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComponentCategory"


    // $ANTLR start "ruleComponentCategory"
    // InternalAadlV3.g:6989:1: ruleComponentCategory returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'abstract' | kw= 'bus' | kw= 'data' | kw= 'device' | kw= 'memory' | kw= 'process' | kw= 'processor' | kw= 'system' | kw= 'thread' | this_VirtualBusKeywords_9= ruleVirtualBusKeywords | this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords | this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords | this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords | kw= 'subprogram' | this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords | this_ThreadGroupKeywords_15= ruleThreadGroupKeywords ) ;
    public final AntlrDatatypeRuleToken ruleComponentCategory() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_VirtualBusKeywords_9 = null;

        AntlrDatatypeRuleToken this_VirtualProcessorKeywords_10 = null;

        AntlrDatatypeRuleToken this_VirtualMemoryKeywords_11 = null;

        AntlrDatatypeRuleToken this_VirtualDeviceKeywords_12 = null;

        AntlrDatatypeRuleToken this_SubprogramGroupKeywords_14 = null;

        AntlrDatatypeRuleToken this_ThreadGroupKeywords_15 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:6995:2: ( (kw= 'abstract' | kw= 'bus' | kw= 'data' | kw= 'device' | kw= 'memory' | kw= 'process' | kw= 'processor' | kw= 'system' | kw= 'thread' | this_VirtualBusKeywords_9= ruleVirtualBusKeywords | this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords | this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords | this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords | kw= 'subprogram' | this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords | this_ThreadGroupKeywords_15= ruleThreadGroupKeywords ) )
            // InternalAadlV3.g:6996:2: (kw= 'abstract' | kw= 'bus' | kw= 'data' | kw= 'device' | kw= 'memory' | kw= 'process' | kw= 'processor' | kw= 'system' | kw= 'thread' | this_VirtualBusKeywords_9= ruleVirtualBusKeywords | this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords | this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords | this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords | kw= 'subprogram' | this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords | this_ThreadGroupKeywords_15= ruleThreadGroupKeywords )
            {
            // InternalAadlV3.g:6996:2: (kw= 'abstract' | kw= 'bus' | kw= 'data' | kw= 'device' | kw= 'memory' | kw= 'process' | kw= 'processor' | kw= 'system' | kw= 'thread' | this_VirtualBusKeywords_9= ruleVirtualBusKeywords | this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords | this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords | this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords | kw= 'subprogram' | this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords | this_ThreadGroupKeywords_15= ruleThreadGroupKeywords )
            int alt104=16;
            alt104 = dfa104.predict(input);
            switch (alt104) {
                case 1 :
                    // InternalAadlV3.g:6997:3: kw= 'abstract'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getAbstractKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:7003:3: kw= 'bus'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getBusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:7009:3: kw= 'data'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getDataKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAadlV3.g:7015:3: kw= 'device'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getDeviceKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAadlV3.g:7021:3: kw= 'memory'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getMemoryKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAadlV3.g:7027:3: kw= 'process'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getProcessKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalAadlV3.g:7033:3: kw= 'processor'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getProcessorKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalAadlV3.g:7039:3: kw= 'system'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getSystemKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalAadlV3.g:7045:3: kw= 'thread'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getThreadKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalAadlV3.g:7051:3: this_VirtualBusKeywords_9= ruleVirtualBusKeywords
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComponentCategoryAccess().getVirtualBusKeywordsParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VirtualBusKeywords_9=ruleVirtualBusKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_VirtualBusKeywords_9);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalAadlV3.g:7062:3: this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComponentCategoryAccess().getVirtualProcessorKeywordsParserRuleCall_10());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VirtualProcessorKeywords_10=ruleVirtualProcessorKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_VirtualProcessorKeywords_10);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalAadlV3.g:7073:3: this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComponentCategoryAccess().getVirtualMemoryKeywordsParserRuleCall_11());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VirtualMemoryKeywords_11=ruleVirtualMemoryKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_VirtualMemoryKeywords_11);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalAadlV3.g:7084:3: this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComponentCategoryAccess().getVirtualDeviceKeywordsParserRuleCall_12());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VirtualDeviceKeywords_12=ruleVirtualDeviceKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_VirtualDeviceKeywords_12);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalAadlV3.g:7095:3: kw= 'subprogram'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getSubprogramKeyword_13());
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalAadlV3.g:7101:3: this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComponentCategoryAccess().getSubprogramGroupKeywordsParserRuleCall_14());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SubprogramGroupKeywords_14=ruleSubprogramGroupKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_SubprogramGroupKeywords_14);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 16 :
                    // InternalAadlV3.g:7112:3: this_ThreadGroupKeywords_15= ruleThreadGroupKeywords
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComponentCategoryAccess().getThreadGroupKeywordsParserRuleCall_15());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ThreadGroupKeywords_15=ruleThreadGroupKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ThreadGroupKeywords_15);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleComponentCategory"


    // $ANTLR start "entryRuleFeatureCategory"
    // InternalAadlV3.g:7126:1: entryRuleFeatureCategory returns [String current=null] : iv_ruleFeatureCategory= ruleFeatureCategory EOF ;
    public final String entryRuleFeatureCategory() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureCategory = null;


        try {
            // InternalAadlV3.g:7126:55: (iv_ruleFeatureCategory= ruleFeatureCategory EOF )
            // InternalAadlV3.g:7127:2: iv_ruleFeatureCategory= ruleFeatureCategory EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureCategoryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFeatureCategory=ruleFeatureCategory();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCategory.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFeatureCategory"


    // $ANTLR start "ruleFeatureCategory"
    // InternalAadlV3.g:7133:1: ruleFeatureCategory returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'feature' | kw= 'port' | kw= 'parameter' | this_DataAccessKeywords_3= ruleDataAccessKeywords | this_BusAccessKeywords_4= ruleBusAccessKeywords | this_VirtualBusAccessKeywords_5= ruleVirtualBusAccessKeywords | this_SubprogramAccessKeywords_6= ruleSubprogramAccessKeywords | this_SubprogramGroupAccessKeywords_7= ruleSubprogramGroupAccessKeywords | kw= 'binding' | kw= 'interface' ) ;
    public final AntlrDatatypeRuleToken ruleFeatureCategory() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_DataAccessKeywords_3 = null;

        AntlrDatatypeRuleToken this_BusAccessKeywords_4 = null;

        AntlrDatatypeRuleToken this_VirtualBusAccessKeywords_5 = null;

        AntlrDatatypeRuleToken this_SubprogramAccessKeywords_6 = null;

        AntlrDatatypeRuleToken this_SubprogramGroupAccessKeywords_7 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:7139:2: ( (kw= 'feature' | kw= 'port' | kw= 'parameter' | this_DataAccessKeywords_3= ruleDataAccessKeywords | this_BusAccessKeywords_4= ruleBusAccessKeywords | this_VirtualBusAccessKeywords_5= ruleVirtualBusAccessKeywords | this_SubprogramAccessKeywords_6= ruleSubprogramAccessKeywords | this_SubprogramGroupAccessKeywords_7= ruleSubprogramGroupAccessKeywords | kw= 'binding' | kw= 'interface' ) )
            // InternalAadlV3.g:7140:2: (kw= 'feature' | kw= 'port' | kw= 'parameter' | this_DataAccessKeywords_3= ruleDataAccessKeywords | this_BusAccessKeywords_4= ruleBusAccessKeywords | this_VirtualBusAccessKeywords_5= ruleVirtualBusAccessKeywords | this_SubprogramAccessKeywords_6= ruleSubprogramAccessKeywords | this_SubprogramGroupAccessKeywords_7= ruleSubprogramGroupAccessKeywords | kw= 'binding' | kw= 'interface' )
            {
            // InternalAadlV3.g:7140:2: (kw= 'feature' | kw= 'port' | kw= 'parameter' | this_DataAccessKeywords_3= ruleDataAccessKeywords | this_BusAccessKeywords_4= ruleBusAccessKeywords | this_VirtualBusAccessKeywords_5= ruleVirtualBusAccessKeywords | this_SubprogramAccessKeywords_6= ruleSubprogramAccessKeywords | this_SubprogramGroupAccessKeywords_7= ruleSubprogramGroupAccessKeywords | kw= 'binding' | kw= 'interface' )
            int alt105=10;
            alt105 = dfa105.predict(input);
            switch (alt105) {
                case 1 :
                    // InternalAadlV3.g:7141:3: kw= 'feature'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureCategoryAccess().getFeatureKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:7147:3: kw= 'port'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureCategoryAccess().getPortKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:7153:3: kw= 'parameter'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureCategoryAccess().getParameterKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAadlV3.g:7159:3: this_DataAccessKeywords_3= ruleDataAccessKeywords
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureCategoryAccess().getDataAccessKeywordsParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DataAccessKeywords_3=ruleDataAccessKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_DataAccessKeywords_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAadlV3.g:7170:3: this_BusAccessKeywords_4= ruleBusAccessKeywords
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureCategoryAccess().getBusAccessKeywordsParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BusAccessKeywords_4=ruleBusAccessKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_BusAccessKeywords_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAadlV3.g:7181:3: this_VirtualBusAccessKeywords_5= ruleVirtualBusAccessKeywords
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureCategoryAccess().getVirtualBusAccessKeywordsParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VirtualBusAccessKeywords_5=ruleVirtualBusAccessKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_VirtualBusAccessKeywords_5);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalAadlV3.g:7192:3: this_SubprogramAccessKeywords_6= ruleSubprogramAccessKeywords
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureCategoryAccess().getSubprogramAccessKeywordsParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SubprogramAccessKeywords_6=ruleSubprogramAccessKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_SubprogramAccessKeywords_6);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalAadlV3.g:7203:3: this_SubprogramGroupAccessKeywords_7= ruleSubprogramGroupAccessKeywords
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureCategoryAccess().getSubprogramGroupAccessKeywordsParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SubprogramGroupAccessKeywords_7=ruleSubprogramGroupAccessKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_SubprogramGroupAccessKeywords_7);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalAadlV3.g:7214:3: kw= 'binding'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureCategoryAccess().getBindingKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalAadlV3.g:7220:3: kw= 'interface'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureCategoryAccess().getInterfaceKeyword_9());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFeatureCategory"


    // $ANTLR start "entryRuleFeatureDirection"
    // InternalAadlV3.g:7229:1: entryRuleFeatureDirection returns [String current=null] : iv_ruleFeatureDirection= ruleFeatureDirection EOF ;
    public final String entryRuleFeatureDirection() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureDirection = null;


        try {
            // InternalAadlV3.g:7229:56: (iv_ruleFeatureDirection= ruleFeatureDirection EOF )
            // InternalAadlV3.g:7230:2: iv_ruleFeatureDirection= ruleFeatureDirection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureDirectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFeatureDirection=ruleFeatureDirection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureDirection.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFeatureDirection"


    // $ANTLR start "ruleFeatureDirection"
    // InternalAadlV3.g:7236:1: ruleFeatureDirection returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'in' | kw= 'out' | this_InOutKeywords_2= ruleInOutKeywords | kw= 'requires' | kw= 'provides' | this_ProvidesReadKeywords_5= ruleProvidesReadKeywords | this_RequiresReadKeywords_6= ruleRequiresReadKeywords | this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords | this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords | this_ProvidesRWKeywords_9= ruleProvidesRWKeywords | this_RequiresRWKeywords_10= ruleRequiresRWKeywords ) ;
    public final AntlrDatatypeRuleToken ruleFeatureDirection() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_InOutKeywords_2 = null;

        AntlrDatatypeRuleToken this_ProvidesReadKeywords_5 = null;

        AntlrDatatypeRuleToken this_RequiresReadKeywords_6 = null;

        AntlrDatatypeRuleToken this_ProvidesWriteKeywords_7 = null;

        AntlrDatatypeRuleToken this_RequiresWriteKeywords_8 = null;

        AntlrDatatypeRuleToken this_ProvidesRWKeywords_9 = null;

        AntlrDatatypeRuleToken this_RequiresRWKeywords_10 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:7242:2: ( (kw= 'in' | kw= 'out' | this_InOutKeywords_2= ruleInOutKeywords | kw= 'requires' | kw= 'provides' | this_ProvidesReadKeywords_5= ruleProvidesReadKeywords | this_RequiresReadKeywords_6= ruleRequiresReadKeywords | this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords | this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords | this_ProvidesRWKeywords_9= ruleProvidesRWKeywords | this_RequiresRWKeywords_10= ruleRequiresRWKeywords ) )
            // InternalAadlV3.g:7243:2: (kw= 'in' | kw= 'out' | this_InOutKeywords_2= ruleInOutKeywords | kw= 'requires' | kw= 'provides' | this_ProvidesReadKeywords_5= ruleProvidesReadKeywords | this_RequiresReadKeywords_6= ruleRequiresReadKeywords | this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords | this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords | this_ProvidesRWKeywords_9= ruleProvidesRWKeywords | this_RequiresRWKeywords_10= ruleRequiresRWKeywords )
            {
            // InternalAadlV3.g:7243:2: (kw= 'in' | kw= 'out' | this_InOutKeywords_2= ruleInOutKeywords | kw= 'requires' | kw= 'provides' | this_ProvidesReadKeywords_5= ruleProvidesReadKeywords | this_RequiresReadKeywords_6= ruleRequiresReadKeywords | this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords | this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords | this_ProvidesRWKeywords_9= ruleProvidesRWKeywords | this_RequiresRWKeywords_10= ruleRequiresRWKeywords )
            int alt106=11;
            alt106 = dfa106.predict(input);
            switch (alt106) {
                case 1 :
                    // InternalAadlV3.g:7244:3: kw= 'in'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureDirectionAccess().getInKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:7250:3: kw= 'out'
                    {
                    kw=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureDirectionAccess().getOutKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:7256:3: this_InOutKeywords_2= ruleInOutKeywords
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureDirectionAccess().getInOutKeywordsParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_InOutKeywords_2=ruleInOutKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_InOutKeywords_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAadlV3.g:7267:3: kw= 'requires'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureDirectionAccess().getRequiresKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAadlV3.g:7273:3: kw= 'provides'
                    {
                    kw=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureDirectionAccess().getProvidesKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAadlV3.g:7279:3: this_ProvidesReadKeywords_5= ruleProvidesReadKeywords
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureDirectionAccess().getProvidesReadKeywordsParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ProvidesReadKeywords_5=ruleProvidesReadKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ProvidesReadKeywords_5);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalAadlV3.g:7290:3: this_RequiresReadKeywords_6= ruleRequiresReadKeywords
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureDirectionAccess().getRequiresReadKeywordsParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RequiresReadKeywords_6=ruleRequiresReadKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_RequiresReadKeywords_6);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalAadlV3.g:7301:3: this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureDirectionAccess().getProvidesWriteKeywordsParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ProvidesWriteKeywords_7=ruleProvidesWriteKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ProvidesWriteKeywords_7);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalAadlV3.g:7312:3: this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureDirectionAccess().getRequiresWriteKeywordsParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RequiresWriteKeywords_8=ruleRequiresWriteKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_RequiresWriteKeywords_8);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalAadlV3.g:7323:3: this_ProvidesRWKeywords_9= ruleProvidesRWKeywords
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureDirectionAccess().getProvidesRWKeywordsParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ProvidesRWKeywords_9=ruleProvidesRWKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ProvidesRWKeywords_9);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalAadlV3.g:7334:3: this_RequiresRWKeywords_10= ruleRequiresRWKeywords
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureDirectionAccess().getRequiresRWKeywordsParserRuleCall_10());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RequiresRWKeywords_10=ruleRequiresRWKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_RequiresRWKeywords_10);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFeatureDirection"


    // $ANTLR start "entryRulePropagationDirection"
    // InternalAadlV3.g:7348:1: entryRulePropagationDirection returns [String current=null] : iv_rulePropagationDirection= rulePropagationDirection EOF ;
    public final String entryRulePropagationDirection() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropagationDirection = null;


        try {
            // InternalAadlV3.g:7348:60: (iv_rulePropagationDirection= rulePropagationDirection EOF )
            // InternalAadlV3.g:7349:2: iv_rulePropagationDirection= rulePropagationDirection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropagationDirectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePropagationDirection=rulePropagationDirection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropagationDirection.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePropagationDirection"


    // $ANTLR start "rulePropagationDirection"
    // InternalAadlV3.g:7355:1: rulePropagationDirection returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'in' | kw= 'out' ) ;
    public final AntlrDatatypeRuleToken rulePropagationDirection() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:7361:2: ( (kw= 'in' | kw= 'out' ) )
            // InternalAadlV3.g:7362:2: (kw= 'in' | kw= 'out' )
            {
            // InternalAadlV3.g:7362:2: (kw= 'in' | kw= 'out' )
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==76) ) {
                alt107=1;
            }
            else if ( (LA107_0==77) ) {
                alt107=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }
            switch (alt107) {
                case 1 :
                    // InternalAadlV3.g:7363:3: kw= 'in'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPropagationDirectionAccess().getInKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:7369:3: kw= 'out'
                    {
                    kw=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPropagationDirectionAccess().getOutKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePropagationDirection"


    // $ANTLR start "entryRuleComposite"
    // InternalAadlV3.g:7378:1: entryRuleComposite returns [String current=null] : iv_ruleComposite= ruleComposite EOF ;
    public final String entryRuleComposite() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComposite = null;


        try {
            // InternalAadlV3.g:7378:49: (iv_ruleComposite= ruleComposite EOF )
            // InternalAadlV3.g:7379:2: iv_ruleComposite= ruleComposite EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComposite=ruleComposite();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComposite.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComposite"


    // $ANTLR start "ruleComposite"
    // InternalAadlV3.g:7385:1: ruleComposite returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'list' | kw= 'set' ) ;
    public final AntlrDatatypeRuleToken ruleComposite() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:7391:2: ( (kw= 'list' | kw= 'set' ) )
            // InternalAadlV3.g:7392:2: (kw= 'list' | kw= 'set' )
            {
            // InternalAadlV3.g:7392:2: (kw= 'list' | kw= 'set' )
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==80) ) {
                alt108=1;
            }
            else if ( (LA108_0==81) ) {
                alt108=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }
            switch (alt108) {
                case 1 :
                    // InternalAadlV3.g:7393:3: kw= 'list'
                    {
                    kw=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCompositeAccess().getListKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:7399:3: kw= 'set'
                    {
                    kw=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCompositeAccess().getSetKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleComposite"


    // $ANTLR start "entryRulePrimitive"
    // InternalAadlV3.g:7408:1: entryRulePrimitive returns [String current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final String entryRulePrimitive() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitive = null;


        try {
            // InternalAadlV3.g:7408:49: (iv_rulePrimitive= rulePrimitive EOF )
            // InternalAadlV3.g:7409:2: iv_rulePrimitive= rulePrimitive EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimitive=rulePrimitive();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitive.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // InternalAadlV3.g:7415:1: rulePrimitive returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'boolean' | kw= 'integer' | kw= 'real' | kw= 'string' ) ;
    public final AntlrDatatypeRuleToken rulePrimitive() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:7421:2: ( (kw= 'boolean' | kw= 'integer' | kw= 'real' | kw= 'string' ) )
            // InternalAadlV3.g:7422:2: (kw= 'boolean' | kw= 'integer' | kw= 'real' | kw= 'string' )
            {
            // InternalAadlV3.g:7422:2: (kw= 'boolean' | kw= 'integer' | kw= 'real' | kw= 'string' )
            int alt109=4;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt109=1;
                }
                break;
            case 83:
                {
                alt109=2;
                }
                break;
            case 84:
                {
                alt109=3;
                }
                break;
            case 85:
                {
                alt109=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }

            switch (alt109) {
                case 1 :
                    // InternalAadlV3.g:7423:3: kw= 'boolean'
                    {
                    kw=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveAccess().getBooleanKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:7429:3: kw= 'integer'
                    {
                    kw=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveAccess().getIntegerKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:7435:3: kw= 'real'
                    {
                    kw=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveAccess().getRealKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAadlV3.g:7441:3: kw= 'string'
                    {
                    kw=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveAccess().getStringKeyword_3());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "entryRuleEOperation"
    // InternalAadlV3.g:7450:1: entryRuleEOperation returns [String current=null] : iv_ruleEOperation= ruleEOperation EOF ;
    public final String entryRuleEOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEOperation = null;


        try {
            // InternalAadlV3.g:7450:50: (iv_ruleEOperation= ruleEOperation EOF )
            // InternalAadlV3.g:7451:2: iv_ruleEOperation= ruleEOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEOperation=ruleEOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEOperation.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEOperation"


    // $ANTLR start "ruleEOperation"
    // InternalAadlV3.g:7457:1: ruleEOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'any' | kw= 'all' | kw= 'oneof' | kw= 'of' | kw= 'ormore' | kw= 'orless' ) ;
    public final AntlrDatatypeRuleToken ruleEOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:7463:2: ( (kw= 'any' | kw= 'all' | kw= 'oneof' | kw= 'of' | kw= 'ormore' | kw= 'orless' ) )
            // InternalAadlV3.g:7464:2: (kw= 'any' | kw= 'all' | kw= 'oneof' | kw= 'of' | kw= 'ormore' | kw= 'orless' )
            {
            // InternalAadlV3.g:7464:2: (kw= 'any' | kw= 'all' | kw= 'oneof' | kw= 'of' | kw= 'ormore' | kw= 'orless' )
            int alt110=6;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt110=1;
                }
                break;
            case 25:
                {
                alt110=2;
                }
                break;
            case 87:
                {
                alt110=3;
                }
                break;
            case 47:
                {
                alt110=4;
                }
                break;
            case 88:
                {
                alt110=5;
                }
                break;
            case 89:
                {
                alt110=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }

            switch (alt110) {
                case 1 :
                    // InternalAadlV3.g:7465:3: kw= 'any'
                    {
                    kw=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEOperationAccess().getAnyKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:7471:3: kw= 'all'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEOperationAccess().getAllKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:7477:3: kw= 'oneof'
                    {
                    kw=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEOperationAccess().getOneofKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAadlV3.g:7483:3: kw= 'of'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEOperationAccess().getOfKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAadlV3.g:7489:3: kw= 'ormore'
                    {
                    kw=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEOperationAccess().getOrmoreKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAadlV3.g:7495:3: kw= 'orless'
                    {
                    kw=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEOperationAccess().getOrlessKeyword_5());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEOperation"


    // $ANTLR start "entryRuleSatisfiesOperation"
    // InternalAadlV3.g:7504:1: entryRuleSatisfiesOperation returns [String current=null] : iv_ruleSatisfiesOperation= ruleSatisfiesOperation EOF ;
    public final String entryRuleSatisfiesOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSatisfiesOperation = null;


        try {
            // InternalAadlV3.g:7504:58: (iv_ruleSatisfiesOperation= ruleSatisfiesOperation EOF )
            // InternalAadlV3.g:7505:2: iv_ruleSatisfiesOperation= ruleSatisfiesOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSatisfiesOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSatisfiesOperation=ruleSatisfiesOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSatisfiesOperation.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSatisfiesOperation"


    // $ANTLR start "ruleSatisfiesOperation"
    // InternalAadlV3.g:7511:1: ruleSatisfiesOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'satisfies' ;
    public final AntlrDatatypeRuleToken ruleSatisfiesOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:7517:2: (kw= 'satisfies' )
            // InternalAadlV3.g:7518:2: kw= 'satisfies'
            {
            kw=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getSatisfiesOperationAccess().getSatisfiesKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSatisfiesOperation"


    // $ANTLR start "entryRuleInOperation"
    // InternalAadlV3.g:7526:1: entryRuleInOperation returns [String current=null] : iv_ruleInOperation= ruleInOperation EOF ;
    public final String entryRuleInOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInOperation = null;


        try {
            // InternalAadlV3.g:7526:51: (iv_ruleInOperation= ruleInOperation EOF )
            // InternalAadlV3.g:7527:2: iv_ruleInOperation= ruleInOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInOperation=ruleInOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInOperation.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInOperation"


    // $ANTLR start "ruleInOperation"
    // InternalAadlV3.g:7533:1: ruleInOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'in' ;
    public final AntlrDatatypeRuleToken ruleInOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:7539:2: (kw= 'in' )
            // InternalAadlV3.g:7540:2: kw= 'in'
            {
            kw=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getInOperationAccess().getInKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleInOperation"


    // $ANTLR start "entryRuleInputOperation"
    // InternalAadlV3.g:7548:1: entryRuleInputOperation returns [String current=null] : iv_ruleInputOperation= ruleInputOperation EOF ;
    public final String entryRuleInputOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInputOperation = null;


        try {
            // InternalAadlV3.g:7548:54: (iv_ruleInputOperation= ruleInputOperation EOF )
            // InternalAadlV3.g:7549:2: iv_ruleInputOperation= ruleInputOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInputOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInputOperation=ruleInputOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInputOperation.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInputOperation"


    // $ANTLR start "ruleInputOperation"
    // InternalAadlV3.g:7555:1: ruleInputOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '?' ;
    public final AntlrDatatypeRuleToken ruleInputOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:7561:2: (kw= '?' )
            // InternalAadlV3.g:7562:2: kw= '?'
            {
            kw=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getInputOperationAccess().getQuestionMarkKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleInputOperation"


    // $ANTLR start "entryRuleAssociationType"
    // InternalAadlV3.g:7570:1: entryRuleAssociationType returns [String current=null] : iv_ruleAssociationType= ruleAssociationType EOF ;
    public final String entryRuleAssociationType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAssociationType = null;


        try {
            // InternalAadlV3.g:7570:55: (iv_ruleAssociationType= ruleAssociationType EOF )
            // InternalAadlV3.g:7571:2: iv_ruleAssociationType= ruleAssociationType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssociationTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssociationType=ruleAssociationType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssociationType.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssociationType"


    // $ANTLR start "ruleAssociationType"
    // InternalAadlV3.g:7577:1: ruleAssociationType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IsConnection_0= ruleIsConnection | this_IsBinding_1= ruleIsBinding | this_IsFlow_2= ruleIsFlow ) ;
    public final AntlrDatatypeRuleToken ruleAssociationType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_IsConnection_0 = null;

        AntlrDatatypeRuleToken this_IsBinding_1 = null;

        AntlrDatatypeRuleToken this_IsFlow_2 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:7583:2: ( (this_IsConnection_0= ruleIsConnection | this_IsBinding_1= ruleIsBinding | this_IsFlow_2= ruleIsFlow ) )
            // InternalAadlV3.g:7584:2: (this_IsConnection_0= ruleIsConnection | this_IsBinding_1= ruleIsBinding | this_IsFlow_2= ruleIsFlow )
            {
            // InternalAadlV3.g:7584:2: (this_IsConnection_0= ruleIsConnection | this_IsBinding_1= ruleIsBinding | this_IsFlow_2= ruleIsFlow )
            int alt111=3;
            switch ( input.LA(1) ) {
            case 92:
                {
                alt111=1;
                }
                break;
            case 75:
                {
                alt111=2;
                }
                break;
            case 42:
                {
                alt111=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }

            switch (alt111) {
                case 1 :
                    // InternalAadlV3.g:7585:3: this_IsConnection_0= ruleIsConnection
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAssociationTypeAccess().getIsConnectionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IsConnection_0=ruleIsConnection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_IsConnection_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:7596:3: this_IsBinding_1= ruleIsBinding
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAssociationTypeAccess().getIsBindingParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IsBinding_1=ruleIsBinding();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_IsBinding_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:7607:3: this_IsFlow_2= ruleIsFlow
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAssociationTypeAccess().getIsFlowParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IsFlow_2=ruleIsFlow();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_IsFlow_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAssociationType"


    // $ANTLR start "entryRuleIsConnection"
    // InternalAadlV3.g:7621:1: entryRuleIsConnection returns [String current=null] : iv_ruleIsConnection= ruleIsConnection EOF ;
    public final String entryRuleIsConnection() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIsConnection = null;


        try {
            // InternalAadlV3.g:7621:52: (iv_ruleIsConnection= ruleIsConnection EOF )
            // InternalAadlV3.g:7622:2: iv_ruleIsConnection= ruleIsConnection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIsConnectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIsConnection=ruleIsConnection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIsConnection.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIsConnection"


    // $ANTLR start "ruleIsConnection"
    // InternalAadlV3.g:7628:1: ruleIsConnection returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'connection' ;
    public final AntlrDatatypeRuleToken ruleIsConnection() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:7634:2: (kw= 'connection' )
            // InternalAadlV3.g:7635:2: kw= 'connection'
            {
            kw=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getIsConnectionAccess().getConnectionKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIsConnection"


    // $ANTLR start "entryRuleIsBinding"
    // InternalAadlV3.g:7643:1: entryRuleIsBinding returns [String current=null] : iv_ruleIsBinding= ruleIsBinding EOF ;
    public final String entryRuleIsBinding() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIsBinding = null;


        try {
            // InternalAadlV3.g:7643:49: (iv_ruleIsBinding= ruleIsBinding EOF )
            // InternalAadlV3.g:7644:2: iv_ruleIsBinding= ruleIsBinding EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIsBindingRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIsBinding=ruleIsBinding();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIsBinding.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIsBinding"


    // $ANTLR start "ruleIsBinding"
    // InternalAadlV3.g:7650:1: ruleIsBinding returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'binding' ;
    public final AntlrDatatypeRuleToken ruleIsBinding() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:7656:2: (kw= 'binding' )
            // InternalAadlV3.g:7657:2: kw= 'binding'
            {
            kw=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getIsBindingAccess().getBindingKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIsBinding"


    // $ANTLR start "entryRuleIsFlowSource"
    // InternalAadlV3.g:7665:1: entryRuleIsFlowSource returns [String current=null] : iv_ruleIsFlowSource= ruleIsFlowSource EOF ;
    public final String entryRuleIsFlowSource() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIsFlowSource = null;


        try {
            // InternalAadlV3.g:7665:52: (iv_ruleIsFlowSource= ruleIsFlowSource EOF )
            // InternalAadlV3.g:7666:2: iv_ruleIsFlowSource= ruleIsFlowSource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIsFlowSourceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIsFlowSource=ruleIsFlowSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIsFlowSource.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIsFlowSource"


    // $ANTLR start "ruleIsFlowSource"
    // InternalAadlV3.g:7672:1: ruleIsFlowSource returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_FlowSourceKeywords_0= ruleFlowSourceKeywords ;
    public final AntlrDatatypeRuleToken ruleIsFlowSource() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FlowSourceKeywords_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:7678:2: (this_FlowSourceKeywords_0= ruleFlowSourceKeywords )
            // InternalAadlV3.g:7679:2: this_FlowSourceKeywords_0= ruleFlowSourceKeywords
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getIsFlowSourceAccess().getFlowSourceKeywordsParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_FlowSourceKeywords_0=ruleFlowSourceKeywords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_FlowSourceKeywords_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIsFlowSource"


    // $ANTLR start "entryRuleIsFlowSink"
    // InternalAadlV3.g:7692:1: entryRuleIsFlowSink returns [String current=null] : iv_ruleIsFlowSink= ruleIsFlowSink EOF ;
    public final String entryRuleIsFlowSink() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIsFlowSink = null;


        try {
            // InternalAadlV3.g:7692:50: (iv_ruleIsFlowSink= ruleIsFlowSink EOF )
            // InternalAadlV3.g:7693:2: iv_ruleIsFlowSink= ruleIsFlowSink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIsFlowSinkRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIsFlowSink=ruleIsFlowSink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIsFlowSink.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIsFlowSink"


    // $ANTLR start "ruleIsFlowSink"
    // InternalAadlV3.g:7699:1: ruleIsFlowSink returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_FlowSinkKeywords_0= ruleFlowSinkKeywords ;
    public final AntlrDatatypeRuleToken ruleIsFlowSink() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FlowSinkKeywords_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:7705:2: (this_FlowSinkKeywords_0= ruleFlowSinkKeywords )
            // InternalAadlV3.g:7706:2: this_FlowSinkKeywords_0= ruleFlowSinkKeywords
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getIsFlowSinkAccess().getFlowSinkKeywordsParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_FlowSinkKeywords_0=ruleFlowSinkKeywords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_FlowSinkKeywords_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIsFlowSink"


    // $ANTLR start "entryRuleIsFlow"
    // InternalAadlV3.g:7719:1: entryRuleIsFlow returns [String current=null] : iv_ruleIsFlow= ruleIsFlow EOF ;
    public final String entryRuleIsFlow() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIsFlow = null;


        try {
            // InternalAadlV3.g:7719:46: (iv_ruleIsFlow= ruleIsFlow EOF )
            // InternalAadlV3.g:7720:2: iv_ruleIsFlow= ruleIsFlow EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIsFlowRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIsFlow=ruleIsFlow();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIsFlow.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIsFlow"


    // $ANTLR start "ruleIsFlow"
    // InternalAadlV3.g:7726:1: ruleIsFlow returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'flow' ;
    public final AntlrDatatypeRuleToken ruleIsFlow() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:7732:2: (kw= 'flow' )
            // InternalAadlV3.g:7733:2: kw= 'flow'
            {
            kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getIsFlowAccess().getFlowKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIsFlow"


    // $ANTLR start "entryRuleVirtualProcessorKeywords"
    // InternalAadlV3.g:7741:1: entryRuleVirtualProcessorKeywords returns [String current=null] : iv_ruleVirtualProcessorKeywords= ruleVirtualProcessorKeywords EOF ;
    public final String entryRuleVirtualProcessorKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVirtualProcessorKeywords = null;


        try {
            // InternalAadlV3.g:7741:64: (iv_ruleVirtualProcessorKeywords= ruleVirtualProcessorKeywords EOF )
            // InternalAadlV3.g:7742:2: iv_ruleVirtualProcessorKeywords= ruleVirtualProcessorKeywords EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVirtualProcessorKeywordsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVirtualProcessorKeywords=ruleVirtualProcessorKeywords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVirtualProcessorKeywords.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVirtualProcessorKeywords"


    // $ANTLR start "ruleVirtualProcessorKeywords"
    // InternalAadlV3.g:7748:1: ruleVirtualProcessorKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'virtual' kw= 'processor' ) ;
    public final AntlrDatatypeRuleToken ruleVirtualProcessorKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:7754:2: ( (kw= 'virtual' kw= 'processor' ) )
            // InternalAadlV3.g:7755:2: (kw= 'virtual' kw= 'processor' )
            {
            // InternalAadlV3.g:7755:2: (kw= 'virtual' kw= 'processor' )
            // InternalAadlV3.g:7756:3: kw= 'virtual' kw= 'processor'
            {
            kw=(Token)match(input,93,FOLLOW_90); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVirtualProcessorKeywordsAccess().getVirtualKeyword_0());
              		
            }
            kw=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVirtualProcessorKeywordsAccess().getProcessorKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVirtualProcessorKeywords"


    // $ANTLR start "entryRuleVirtualBusKeywords"
    // InternalAadlV3.g:7770:1: entryRuleVirtualBusKeywords returns [String current=null] : iv_ruleVirtualBusKeywords= ruleVirtualBusKeywords EOF ;
    public final String entryRuleVirtualBusKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVirtualBusKeywords = null;


        try {
            // InternalAadlV3.g:7770:58: (iv_ruleVirtualBusKeywords= ruleVirtualBusKeywords EOF )
            // InternalAadlV3.g:7771:2: iv_ruleVirtualBusKeywords= ruleVirtualBusKeywords EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVirtualBusKeywordsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVirtualBusKeywords=ruleVirtualBusKeywords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVirtualBusKeywords.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVirtualBusKeywords"


    // $ANTLR start "ruleVirtualBusKeywords"
    // InternalAadlV3.g:7777:1: ruleVirtualBusKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'virtual' kw= 'bus' ) ;
    public final AntlrDatatypeRuleToken ruleVirtualBusKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:7783:2: ( (kw= 'virtual' kw= 'bus' ) )
            // InternalAadlV3.g:7784:2: (kw= 'virtual' kw= 'bus' )
            {
            // InternalAadlV3.g:7784:2: (kw= 'virtual' kw= 'bus' )
            // InternalAadlV3.g:7785:3: kw= 'virtual' kw= 'bus'
            {
            kw=(Token)match(input,93,FOLLOW_91); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVirtualBusKeywordsAccess().getVirtualKeyword_0());
              		
            }
            kw=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVirtualBusKeywordsAccess().getBusKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVirtualBusKeywords"


    // $ANTLR start "entryRuleVirtualMemoryKeywords"
    // InternalAadlV3.g:7799:1: entryRuleVirtualMemoryKeywords returns [String current=null] : iv_ruleVirtualMemoryKeywords= ruleVirtualMemoryKeywords EOF ;
    public final String entryRuleVirtualMemoryKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVirtualMemoryKeywords = null;


        try {
            // InternalAadlV3.g:7799:61: (iv_ruleVirtualMemoryKeywords= ruleVirtualMemoryKeywords EOF )
            // InternalAadlV3.g:7800:2: iv_ruleVirtualMemoryKeywords= ruleVirtualMemoryKeywords EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVirtualMemoryKeywordsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVirtualMemoryKeywords=ruleVirtualMemoryKeywords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVirtualMemoryKeywords.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVirtualMemoryKeywords"


    // $ANTLR start "ruleVirtualMemoryKeywords"
    // InternalAadlV3.g:7806:1: ruleVirtualMemoryKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'virtual' kw= 'memory' ) ;
    public final AntlrDatatypeRuleToken ruleVirtualMemoryKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:7812:2: ( (kw= 'virtual' kw= 'memory' ) )
            // InternalAadlV3.g:7813:2: (kw= 'virtual' kw= 'memory' )
            {
            // InternalAadlV3.g:7813:2: (kw= 'virtual' kw= 'memory' )
            // InternalAadlV3.g:7814:3: kw= 'virtual' kw= 'memory'
            {
            kw=(Token)match(input,93,FOLLOW_92); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVirtualMemoryKeywordsAccess().getVirtualKeyword_0());
              		
            }
            kw=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVirtualMemoryKeywordsAccess().getMemoryKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVirtualMemoryKeywords"


    // $ANTLR start "entryRuleVirtualDeviceKeywords"
    // InternalAadlV3.g:7828:1: entryRuleVirtualDeviceKeywords returns [String current=null] : iv_ruleVirtualDeviceKeywords= ruleVirtualDeviceKeywords EOF ;
    public final String entryRuleVirtualDeviceKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVirtualDeviceKeywords = null;


        try {
            // InternalAadlV3.g:7828:61: (iv_ruleVirtualDeviceKeywords= ruleVirtualDeviceKeywords EOF )
            // InternalAadlV3.g:7829:2: iv_ruleVirtualDeviceKeywords= ruleVirtualDeviceKeywords EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVirtualDeviceKeywordsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVirtualDeviceKeywords=ruleVirtualDeviceKeywords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVirtualDeviceKeywords.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVirtualDeviceKeywords"


    // $ANTLR start "ruleVirtualDeviceKeywords"
    // InternalAadlV3.g:7835:1: ruleVirtualDeviceKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'virtual' kw= 'device' ) ;
    public final AntlrDatatypeRuleToken ruleVirtualDeviceKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:7841:2: ( (kw= 'virtual' kw= 'device' ) )
            // InternalAadlV3.g:7842:2: (kw= 'virtual' kw= 'device' )
            {
            // InternalAadlV3.g:7842:2: (kw= 'virtual' kw= 'device' )
            // InternalAadlV3.g:7843:3: kw= 'virtual' kw= 'device'
            {
            kw=(Token)match(input,93,FOLLOW_93); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVirtualDeviceKeywordsAccess().getVirtualKeyword_0());
              		
            }
            kw=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVirtualDeviceKeywordsAccess().getDeviceKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVirtualDeviceKeywords"


    // $ANTLR start "entryRuleThreadGroupKeywords"
    // InternalAadlV3.g:7857:1: entryRuleThreadGroupKeywords returns [String current=null] : iv_ruleThreadGroupKeywords= ruleThreadGroupKeywords EOF ;
    public final String entryRuleThreadGroupKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleThreadGroupKeywords = null;


        try {
            // InternalAadlV3.g:7857:59: (iv_ruleThreadGroupKeywords= ruleThreadGroupKeywords EOF )
            // InternalAadlV3.g:7858:2: iv_ruleThreadGroupKeywords= ruleThreadGroupKeywords EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getThreadGroupKeywordsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleThreadGroupKeywords=ruleThreadGroupKeywords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleThreadGroupKeywords.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleThreadGroupKeywords"


    // $ANTLR start "ruleThreadGroupKeywords"
    // InternalAadlV3.g:7864:1: ruleThreadGroupKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'thread' kw= 'group' ) ;
    public final AntlrDatatypeRuleToken ruleThreadGroupKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:7870:2: ( (kw= 'thread' kw= 'group' ) )
            // InternalAadlV3.g:7871:2: (kw= 'thread' kw= 'group' )
            {
            // InternalAadlV3.g:7871:2: (kw= 'thread' kw= 'group' )
            // InternalAadlV3.g:7872:3: kw= 'thread' kw= 'group'
            {
            kw=(Token)match(input,70,FOLLOW_94); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getThreadGroupKeywordsAccess().getThreadKeyword_0());
              		
            }
            kw=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getThreadGroupKeywordsAccess().getGroupKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleThreadGroupKeywords"


    // $ANTLR start "entryRuleSubprogramGroupKeywords"
    // InternalAadlV3.g:7886:1: entryRuleSubprogramGroupKeywords returns [String current=null] : iv_ruleSubprogramGroupKeywords= ruleSubprogramGroupKeywords EOF ;
    public final String entryRuleSubprogramGroupKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSubprogramGroupKeywords = null;


        try {
            // InternalAadlV3.g:7886:63: (iv_ruleSubprogramGroupKeywords= ruleSubprogramGroupKeywords EOF )
            // InternalAadlV3.g:7887:2: iv_ruleSubprogramGroupKeywords= ruleSubprogramGroupKeywords EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubprogramGroupKeywordsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSubprogramGroupKeywords=ruleSubprogramGroupKeywords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubprogramGroupKeywords.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSubprogramGroupKeywords"


    // $ANTLR start "ruleSubprogramGroupKeywords"
    // InternalAadlV3.g:7893:1: ruleSubprogramGroupKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'subprogram' kw= 'group' ) ;
    public final AntlrDatatypeRuleToken ruleSubprogramGroupKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:7899:2: ( (kw= 'subprogram' kw= 'group' ) )
            // InternalAadlV3.g:7900:2: (kw= 'subprogram' kw= 'group' )
            {
            // InternalAadlV3.g:7900:2: (kw= 'subprogram' kw= 'group' )
            // InternalAadlV3.g:7901:3: kw= 'subprogram' kw= 'group'
            {
            kw=(Token)match(input,71,FOLLOW_94); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSubprogramGroupKeywordsAccess().getSubprogramKeyword_0());
              		
            }
            kw=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSubprogramGroupKeywordsAccess().getGroupKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSubprogramGroupKeywords"


    // $ANTLR start "entryRuleFlowSourceKeywords"
    // InternalAadlV3.g:7915:1: entryRuleFlowSourceKeywords returns [String current=null] : iv_ruleFlowSourceKeywords= ruleFlowSourceKeywords EOF ;
    public final String entryRuleFlowSourceKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFlowSourceKeywords = null;


        try {
            // InternalAadlV3.g:7915:58: (iv_ruleFlowSourceKeywords= ruleFlowSourceKeywords EOF )
            // InternalAadlV3.g:7916:2: iv_ruleFlowSourceKeywords= ruleFlowSourceKeywords EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFlowSourceKeywordsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFlowSourceKeywords=ruleFlowSourceKeywords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFlowSourceKeywords.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFlowSourceKeywords"


    // $ANTLR start "ruleFlowSourceKeywords"
    // InternalAadlV3.g:7922:1: ruleFlowSourceKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'flow' kw= 'source' ) ;
    public final AntlrDatatypeRuleToken ruleFlowSourceKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:7928:2: ( (kw= 'flow' kw= 'source' ) )
            // InternalAadlV3.g:7929:2: (kw= 'flow' kw= 'source' )
            {
            // InternalAadlV3.g:7929:2: (kw= 'flow' kw= 'source' )
            // InternalAadlV3.g:7930:3: kw= 'flow' kw= 'source'
            {
            kw=(Token)match(input,42,FOLLOW_95); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFlowSourceKeywordsAccess().getFlowKeyword_0());
              		
            }
            kw=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFlowSourceKeywordsAccess().getSourceKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFlowSourceKeywords"


    // $ANTLR start "entryRuleFlowSinkKeywords"
    // InternalAadlV3.g:7944:1: entryRuleFlowSinkKeywords returns [String current=null] : iv_ruleFlowSinkKeywords= ruleFlowSinkKeywords EOF ;
    public final String entryRuleFlowSinkKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFlowSinkKeywords = null;


        try {
            // InternalAadlV3.g:7944:56: (iv_ruleFlowSinkKeywords= ruleFlowSinkKeywords EOF )
            // InternalAadlV3.g:7945:2: iv_ruleFlowSinkKeywords= ruleFlowSinkKeywords EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFlowSinkKeywordsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFlowSinkKeywords=ruleFlowSinkKeywords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFlowSinkKeywords.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFlowSinkKeywords"


    // $ANTLR start "ruleFlowSinkKeywords"
    // InternalAadlV3.g:7951:1: ruleFlowSinkKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'flow' kw= 'sink' ) ;
    public final AntlrDatatypeRuleToken ruleFlowSinkKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:7957:2: ( (kw= 'flow' kw= 'sink' ) )
            // InternalAadlV3.g:7958:2: (kw= 'flow' kw= 'sink' )
            {
            // InternalAadlV3.g:7958:2: (kw= 'flow' kw= 'sink' )
            // InternalAadlV3.g:7959:3: kw= 'flow' kw= 'sink'
            {
            kw=(Token)match(input,42,FOLLOW_96); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFlowSinkKeywordsAccess().getFlowKeyword_0());
              		
            }
            kw=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFlowSinkKeywordsAccess().getSinkKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFlowSinkKeywords"


    // $ANTLR start "entryRuleInOutKeywords"
    // InternalAadlV3.g:7973:1: entryRuleInOutKeywords returns [String current=null] : iv_ruleInOutKeywords= ruleInOutKeywords EOF ;
    public final String entryRuleInOutKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInOutKeywords = null;


        try {
            // InternalAadlV3.g:7973:53: (iv_ruleInOutKeywords= ruleInOutKeywords EOF )
            // InternalAadlV3.g:7974:2: iv_ruleInOutKeywords= ruleInOutKeywords EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInOutKeywordsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInOutKeywords=ruleInOutKeywords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInOutKeywords.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInOutKeywords"


    // $ANTLR start "ruleInOutKeywords"
    // InternalAadlV3.g:7980:1: ruleInOutKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'in' kw= 'out' ) ;
    public final AntlrDatatypeRuleToken ruleInOutKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:7986:2: ( (kw= 'in' kw= 'out' ) )
            // InternalAadlV3.g:7987:2: (kw= 'in' kw= 'out' )
            {
            // InternalAadlV3.g:7987:2: (kw= 'in' kw= 'out' )
            // InternalAadlV3.g:7988:3: kw= 'in' kw= 'out'
            {
            kw=(Token)match(input,76,FOLLOW_97); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getInOutKeywordsAccess().getInKeyword_0());
              		
            }
            kw=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getInOutKeywordsAccess().getOutKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleInOutKeywords"


    // $ANTLR start "entryRuleBusAccessKeywords"
    // InternalAadlV3.g:8002:1: entryRuleBusAccessKeywords returns [String current=null] : iv_ruleBusAccessKeywords= ruleBusAccessKeywords EOF ;
    public final String entryRuleBusAccessKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBusAccessKeywords = null;


        try {
            // InternalAadlV3.g:8002:57: (iv_ruleBusAccessKeywords= ruleBusAccessKeywords EOF )
            // InternalAadlV3.g:8003:2: iv_ruleBusAccessKeywords= ruleBusAccessKeywords EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBusAccessKeywordsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBusAccessKeywords=ruleBusAccessKeywords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBusAccessKeywords.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBusAccessKeywords"


    // $ANTLR start "ruleBusAccessKeywords"
    // InternalAadlV3.g:8009:1: ruleBusAccessKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'bus' kw= 'access' ) ;
    public final AntlrDatatypeRuleToken ruleBusAccessKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:8015:2: ( (kw= 'bus' kw= 'access' ) )
            // InternalAadlV3.g:8016:2: (kw= 'bus' kw= 'access' )
            {
            // InternalAadlV3.g:8016:2: (kw= 'bus' kw= 'access' )
            // InternalAadlV3.g:8017:3: kw= 'bus' kw= 'access'
            {
            kw=(Token)match(input,63,FOLLOW_98); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getBusAccessKeywordsAccess().getBusKeyword_0());
              		
            }
            kw=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getBusAccessKeywordsAccess().getAccessKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBusAccessKeywords"


    // $ANTLR start "entryRuleVirtualBusAccessKeywords"
    // InternalAadlV3.g:8031:1: entryRuleVirtualBusAccessKeywords returns [String current=null] : iv_ruleVirtualBusAccessKeywords= ruleVirtualBusAccessKeywords EOF ;
    public final String entryRuleVirtualBusAccessKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVirtualBusAccessKeywords = null;


        try {
            // InternalAadlV3.g:8031:64: (iv_ruleVirtualBusAccessKeywords= ruleVirtualBusAccessKeywords EOF )
            // InternalAadlV3.g:8032:2: iv_ruleVirtualBusAccessKeywords= ruleVirtualBusAccessKeywords EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVirtualBusAccessKeywordsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVirtualBusAccessKeywords=ruleVirtualBusAccessKeywords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVirtualBusAccessKeywords.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVirtualBusAccessKeywords"


    // $ANTLR start "ruleVirtualBusAccessKeywords"
    // InternalAadlV3.g:8038:1: ruleVirtualBusAccessKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'virtual' kw= 'bus' kw= 'access' ) ;
    public final AntlrDatatypeRuleToken ruleVirtualBusAccessKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:8044:2: ( (kw= 'virtual' kw= 'bus' kw= 'access' ) )
            // InternalAadlV3.g:8045:2: (kw= 'virtual' kw= 'bus' kw= 'access' )
            {
            // InternalAadlV3.g:8045:2: (kw= 'virtual' kw= 'bus' kw= 'access' )
            // InternalAadlV3.g:8046:3: kw= 'virtual' kw= 'bus' kw= 'access'
            {
            kw=(Token)match(input,93,FOLLOW_91); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVirtualBusAccessKeywordsAccess().getVirtualKeyword_0());
              		
            }
            kw=(Token)match(input,63,FOLLOW_98); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVirtualBusAccessKeywordsAccess().getBusKeyword_1());
              		
            }
            kw=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVirtualBusAccessKeywordsAccess().getAccessKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVirtualBusAccessKeywords"


    // $ANTLR start "entryRuleDataAccessKeywords"
    // InternalAadlV3.g:8065:1: entryRuleDataAccessKeywords returns [String current=null] : iv_ruleDataAccessKeywords= ruleDataAccessKeywords EOF ;
    public final String entryRuleDataAccessKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDataAccessKeywords = null;


        try {
            // InternalAadlV3.g:8065:58: (iv_ruleDataAccessKeywords= ruleDataAccessKeywords EOF )
            // InternalAadlV3.g:8066:2: iv_ruleDataAccessKeywords= ruleDataAccessKeywords EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataAccessKeywordsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDataAccessKeywords=ruleDataAccessKeywords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataAccessKeywords.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDataAccessKeywords"


    // $ANTLR start "ruleDataAccessKeywords"
    // InternalAadlV3.g:8072:1: ruleDataAccessKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'data' kw= 'access' ) ;
    public final AntlrDatatypeRuleToken ruleDataAccessKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:8078:2: ( (kw= 'data' kw= 'access' ) )
            // InternalAadlV3.g:8079:2: (kw= 'data' kw= 'access' )
            {
            // InternalAadlV3.g:8079:2: (kw= 'data' kw= 'access' )
            // InternalAadlV3.g:8080:3: kw= 'data' kw= 'access'
            {
            kw=(Token)match(input,64,FOLLOW_98); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDataAccessKeywordsAccess().getDataKeyword_0());
              		
            }
            kw=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDataAccessKeywordsAccess().getAccessKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDataAccessKeywords"


    // $ANTLR start "entryRuleSubprogramAccessKeywords"
    // InternalAadlV3.g:8094:1: entryRuleSubprogramAccessKeywords returns [String current=null] : iv_ruleSubprogramAccessKeywords= ruleSubprogramAccessKeywords EOF ;
    public final String entryRuleSubprogramAccessKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSubprogramAccessKeywords = null;


        try {
            // InternalAadlV3.g:8094:64: (iv_ruleSubprogramAccessKeywords= ruleSubprogramAccessKeywords EOF )
            // InternalAadlV3.g:8095:2: iv_ruleSubprogramAccessKeywords= ruleSubprogramAccessKeywords EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubprogramAccessKeywordsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSubprogramAccessKeywords=ruleSubprogramAccessKeywords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubprogramAccessKeywords.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSubprogramAccessKeywords"


    // $ANTLR start "ruleSubprogramAccessKeywords"
    // InternalAadlV3.g:8101:1: ruleSubprogramAccessKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'subprogram' kw= 'access' ) ;
    public final AntlrDatatypeRuleToken ruleSubprogramAccessKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:8107:2: ( (kw= 'subprogram' kw= 'access' ) )
            // InternalAadlV3.g:8108:2: (kw= 'subprogram' kw= 'access' )
            {
            // InternalAadlV3.g:8108:2: (kw= 'subprogram' kw= 'access' )
            // InternalAadlV3.g:8109:3: kw= 'subprogram' kw= 'access'
            {
            kw=(Token)match(input,71,FOLLOW_98); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSubprogramAccessKeywordsAccess().getSubprogramKeyword_0());
              		
            }
            kw=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSubprogramAccessKeywordsAccess().getAccessKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSubprogramAccessKeywords"


    // $ANTLR start "entryRuleSubprogramGroupAccessKeywords"
    // InternalAadlV3.g:8123:1: entryRuleSubprogramGroupAccessKeywords returns [String current=null] : iv_ruleSubprogramGroupAccessKeywords= ruleSubprogramGroupAccessKeywords EOF ;
    public final String entryRuleSubprogramGroupAccessKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSubprogramGroupAccessKeywords = null;


        try {
            // InternalAadlV3.g:8123:69: (iv_ruleSubprogramGroupAccessKeywords= ruleSubprogramGroupAccessKeywords EOF )
            // InternalAadlV3.g:8124:2: iv_ruleSubprogramGroupAccessKeywords= ruleSubprogramGroupAccessKeywords EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubprogramGroupAccessKeywordsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSubprogramGroupAccessKeywords=ruleSubprogramGroupAccessKeywords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubprogramGroupAccessKeywords.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSubprogramGroupAccessKeywords"


    // $ANTLR start "ruleSubprogramGroupAccessKeywords"
    // InternalAadlV3.g:8130:1: ruleSubprogramGroupAccessKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'subprogram' kw= 'group' kw= 'access' ) ;
    public final AntlrDatatypeRuleToken ruleSubprogramGroupAccessKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:8136:2: ( (kw= 'subprogram' kw= 'group' kw= 'access' ) )
            // InternalAadlV3.g:8137:2: (kw= 'subprogram' kw= 'group' kw= 'access' )
            {
            // InternalAadlV3.g:8137:2: (kw= 'subprogram' kw= 'group' kw= 'access' )
            // InternalAadlV3.g:8138:3: kw= 'subprogram' kw= 'group' kw= 'access'
            {
            kw=(Token)match(input,71,FOLLOW_94); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSubprogramGroupAccessKeywordsAccess().getSubprogramKeyword_0());
              		
            }
            kw=(Token)match(input,94,FOLLOW_98); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSubprogramGroupAccessKeywordsAccess().getGroupKeyword_1());
              		
            }
            kw=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSubprogramGroupAccessKeywordsAccess().getAccessKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSubprogramGroupAccessKeywords"


    // $ANTLR start "entryRuleProvidesReadKeywords"
    // InternalAadlV3.g:8157:1: entryRuleProvidesReadKeywords returns [String current=null] : iv_ruleProvidesReadKeywords= ruleProvidesReadKeywords EOF ;
    public final String entryRuleProvidesReadKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProvidesReadKeywords = null;


        try {
            // InternalAadlV3.g:8157:60: (iv_ruleProvidesReadKeywords= ruleProvidesReadKeywords EOF )
            // InternalAadlV3.g:8158:2: iv_ruleProvidesReadKeywords= ruleProvidesReadKeywords EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProvidesReadKeywordsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProvidesReadKeywords=ruleProvidesReadKeywords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProvidesReadKeywords.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProvidesReadKeywords"


    // $ANTLR start "ruleProvidesReadKeywords"
    // InternalAadlV3.g:8164:1: ruleProvidesReadKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'provides' kw= 'in' ) ;
    public final AntlrDatatypeRuleToken ruleProvidesReadKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:8170:2: ( (kw= 'provides' kw= 'in' ) )
            // InternalAadlV3.g:8171:2: (kw= 'provides' kw= 'in' )
            {
            // InternalAadlV3.g:8171:2: (kw= 'provides' kw= 'in' )
            // InternalAadlV3.g:8172:3: kw= 'provides' kw= 'in'
            {
            kw=(Token)match(input,79,FOLLOW_85); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getProvidesReadKeywordsAccess().getProvidesKeyword_0());
              		
            }
            kw=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getProvidesReadKeywordsAccess().getInKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleProvidesReadKeywords"


    // $ANTLR start "entryRuleRequiresReadKeywords"
    // InternalAadlV3.g:8186:1: entryRuleRequiresReadKeywords returns [String current=null] : iv_ruleRequiresReadKeywords= ruleRequiresReadKeywords EOF ;
    public final String entryRuleRequiresReadKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRequiresReadKeywords = null;


        try {
            // InternalAadlV3.g:8186:60: (iv_ruleRequiresReadKeywords= ruleRequiresReadKeywords EOF )
            // InternalAadlV3.g:8187:2: iv_ruleRequiresReadKeywords= ruleRequiresReadKeywords EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRequiresReadKeywordsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRequiresReadKeywords=ruleRequiresReadKeywords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRequiresReadKeywords.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRequiresReadKeywords"


    // $ANTLR start "ruleRequiresReadKeywords"
    // InternalAadlV3.g:8193:1: ruleRequiresReadKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'requires' kw= 'in' ) ;
    public final AntlrDatatypeRuleToken ruleRequiresReadKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:8199:2: ( (kw= 'requires' kw= 'in' ) )
            // InternalAadlV3.g:8200:2: (kw= 'requires' kw= 'in' )
            {
            // InternalAadlV3.g:8200:2: (kw= 'requires' kw= 'in' )
            // InternalAadlV3.g:8201:3: kw= 'requires' kw= 'in'
            {
            kw=(Token)match(input,78,FOLLOW_85); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRequiresReadKeywordsAccess().getRequiresKeyword_0());
              		
            }
            kw=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRequiresReadKeywordsAccess().getInKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRequiresReadKeywords"


    // $ANTLR start "entryRuleProvidesWriteKeywords"
    // InternalAadlV3.g:8215:1: entryRuleProvidesWriteKeywords returns [String current=null] : iv_ruleProvidesWriteKeywords= ruleProvidesWriteKeywords EOF ;
    public final String entryRuleProvidesWriteKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProvidesWriteKeywords = null;


        try {
            // InternalAadlV3.g:8215:61: (iv_ruleProvidesWriteKeywords= ruleProvidesWriteKeywords EOF )
            // InternalAadlV3.g:8216:2: iv_ruleProvidesWriteKeywords= ruleProvidesWriteKeywords EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProvidesWriteKeywordsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProvidesWriteKeywords=ruleProvidesWriteKeywords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProvidesWriteKeywords.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProvidesWriteKeywords"


    // $ANTLR start "ruleProvidesWriteKeywords"
    // InternalAadlV3.g:8222:1: ruleProvidesWriteKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'provides' kw= 'out' ) ;
    public final AntlrDatatypeRuleToken ruleProvidesWriteKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:8228:2: ( (kw= 'provides' kw= 'out' ) )
            // InternalAadlV3.g:8229:2: (kw= 'provides' kw= 'out' )
            {
            // InternalAadlV3.g:8229:2: (kw= 'provides' kw= 'out' )
            // InternalAadlV3.g:8230:3: kw= 'provides' kw= 'out'
            {
            kw=(Token)match(input,79,FOLLOW_97); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getProvidesWriteKeywordsAccess().getProvidesKeyword_0());
              		
            }
            kw=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getProvidesWriteKeywordsAccess().getOutKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleProvidesWriteKeywords"


    // $ANTLR start "entryRuleRequiresWriteKeywords"
    // InternalAadlV3.g:8244:1: entryRuleRequiresWriteKeywords returns [String current=null] : iv_ruleRequiresWriteKeywords= ruleRequiresWriteKeywords EOF ;
    public final String entryRuleRequiresWriteKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRequiresWriteKeywords = null;


        try {
            // InternalAadlV3.g:8244:61: (iv_ruleRequiresWriteKeywords= ruleRequiresWriteKeywords EOF )
            // InternalAadlV3.g:8245:2: iv_ruleRequiresWriteKeywords= ruleRequiresWriteKeywords EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRequiresWriteKeywordsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRequiresWriteKeywords=ruleRequiresWriteKeywords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRequiresWriteKeywords.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRequiresWriteKeywords"


    // $ANTLR start "ruleRequiresWriteKeywords"
    // InternalAadlV3.g:8251:1: ruleRequiresWriteKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'requires' kw= 'out' ) ;
    public final AntlrDatatypeRuleToken ruleRequiresWriteKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:8257:2: ( (kw= 'requires' kw= 'out' ) )
            // InternalAadlV3.g:8258:2: (kw= 'requires' kw= 'out' )
            {
            // InternalAadlV3.g:8258:2: (kw= 'requires' kw= 'out' )
            // InternalAadlV3.g:8259:3: kw= 'requires' kw= 'out'
            {
            kw=(Token)match(input,78,FOLLOW_97); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRequiresWriteKeywordsAccess().getRequiresKeyword_0());
              		
            }
            kw=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRequiresWriteKeywordsAccess().getOutKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRequiresWriteKeywords"


    // $ANTLR start "entryRuleProvidesRWKeywords"
    // InternalAadlV3.g:8273:1: entryRuleProvidesRWKeywords returns [String current=null] : iv_ruleProvidesRWKeywords= ruleProvidesRWKeywords EOF ;
    public final String entryRuleProvidesRWKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProvidesRWKeywords = null;


        try {
            // InternalAadlV3.g:8273:58: (iv_ruleProvidesRWKeywords= ruleProvidesRWKeywords EOF )
            // InternalAadlV3.g:8274:2: iv_ruleProvidesRWKeywords= ruleProvidesRWKeywords EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProvidesRWKeywordsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProvidesRWKeywords=ruleProvidesRWKeywords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProvidesRWKeywords.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProvidesRWKeywords"


    // $ANTLR start "ruleProvidesRWKeywords"
    // InternalAadlV3.g:8280:1: ruleProvidesRWKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'provides' kw= 'in' kw= 'out' ) ;
    public final AntlrDatatypeRuleToken ruleProvidesRWKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:8286:2: ( (kw= 'provides' kw= 'in' kw= 'out' ) )
            // InternalAadlV3.g:8287:2: (kw= 'provides' kw= 'in' kw= 'out' )
            {
            // InternalAadlV3.g:8287:2: (kw= 'provides' kw= 'in' kw= 'out' )
            // InternalAadlV3.g:8288:3: kw= 'provides' kw= 'in' kw= 'out'
            {
            kw=(Token)match(input,79,FOLLOW_85); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getProvidesRWKeywordsAccess().getProvidesKeyword_0());
              		
            }
            kw=(Token)match(input,76,FOLLOW_97); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getProvidesRWKeywordsAccess().getInKeyword_1());
              		
            }
            kw=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getProvidesRWKeywordsAccess().getOutKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleProvidesRWKeywords"


    // $ANTLR start "entryRuleRequiresRWKeywords"
    // InternalAadlV3.g:8307:1: entryRuleRequiresRWKeywords returns [String current=null] : iv_ruleRequiresRWKeywords= ruleRequiresRWKeywords EOF ;
    public final String entryRuleRequiresRWKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRequiresRWKeywords = null;


        try {
            // InternalAadlV3.g:8307:58: (iv_ruleRequiresRWKeywords= ruleRequiresRWKeywords EOF )
            // InternalAadlV3.g:8308:2: iv_ruleRequiresRWKeywords= ruleRequiresRWKeywords EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRequiresRWKeywordsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRequiresRWKeywords=ruleRequiresRWKeywords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRequiresRWKeywords.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRequiresRWKeywords"


    // $ANTLR start "ruleRequiresRWKeywords"
    // InternalAadlV3.g:8314:1: ruleRequiresRWKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'requires' kw= 'in' kw= 'out' ) ;
    public final AntlrDatatypeRuleToken ruleRequiresRWKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:8320:2: ( (kw= 'requires' kw= 'in' kw= 'out' ) )
            // InternalAadlV3.g:8321:2: (kw= 'requires' kw= 'in' kw= 'out' )
            {
            // InternalAadlV3.g:8321:2: (kw= 'requires' kw= 'in' kw= 'out' )
            // InternalAadlV3.g:8322:3: kw= 'requires' kw= 'in' kw= 'out'
            {
            kw=(Token)match(input,78,FOLLOW_85); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRequiresRWKeywordsAccess().getRequiresKeyword_0());
              		
            }
            kw=(Token)match(input,76,FOLLOW_97); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRequiresRWKeywordsAccess().getInKeyword_1());
              		
            }
            kw=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRequiresRWKeywordsAccess().getOutKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRequiresRWKeywords"

    // $ANTLR start synpred18_InternalAadlV3
    public final void synpred18_InternalAadlV3_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_featureCategories_1_0 = null;


        // InternalAadlV3.g:566:3: ( ( (lv_featureCategories_1_0= ruleFeatureCategory ) ) )
        // InternalAadlV3.g:566:3: ( (lv_featureCategories_1_0= ruleFeatureCategory ) )
        {
        // InternalAadlV3.g:566:3: ( (lv_featureCategories_1_0= ruleFeatureCategory ) )
        // InternalAadlV3.g:567:4: (lv_featureCategories_1_0= ruleFeatureCategory )
        {
        // InternalAadlV3.g:567:4: (lv_featureCategories_1_0= ruleFeatureCategory )
        // InternalAadlV3.g:568:5: lv_featureCategories_1_0= ruleFeatureCategory
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getAppliesToAccess().getFeatureCategoriesFeatureCategoryParserRuleCall_1_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_featureCategories_1_0=ruleFeatureCategory();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred18_InternalAadlV3

    // $ANTLR start synpred29_InternalAadlV3
    public final void synpred29_InternalAadlV3_fragment() throws RecognitionException {   
        // InternalAadlV3.g:1102:4: ( '.' )
        // InternalAadlV3.g:1102:5: '.'
        {
        match(input,36,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalAadlV3

    // $ANTLR start synpred68_InternalAadlV3
    public final void synpred68_InternalAadlV3_fragment() throws RecognitionException {   
        // InternalAadlV3.g:2906:4: ( ( () '.' ( ( RULE_ID ) ) ) )
        // InternalAadlV3.g:2906:5: ( () '.' ( ( RULE_ID ) ) )
        {
        // InternalAadlV3.g:2906:5: ( () '.' ( ( RULE_ID ) ) )
        // InternalAadlV3.g:2907:5: () '.' ( ( RULE_ID ) )
        {
        // InternalAadlV3.g:2907:5: ()
        // InternalAadlV3.g:2908:5: 
        {
        }

        match(input,36,FOLLOW_4); if (state.failed) return ;
        // InternalAadlV3.g:2910:5: ( ( RULE_ID ) )
        // InternalAadlV3.g:2911:6: ( RULE_ID )
        {
        // InternalAadlV3.g:2911:6: ( RULE_ID )
        // InternalAadlV3.g:2912:7: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred68_InternalAadlV3

    // $ANTLR start synpred132_InternalAadlV3
    public final void synpred132_InternalAadlV3_fragment() throws RecognitionException {   
        EObject this_PackageElementReference_5 = null;


        // InternalAadlV3.g:6043:3: (this_PackageElementReference_5= rulePackageElementReference )
        // InternalAadlV3.g:6043:3: this_PackageElementReference_5= rulePackageElementReference
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_PackageElementReference_5=rulePackageElementReference();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred132_InternalAadlV3

    // $ANTLR start synpred137_InternalAadlV3
    public final void synpred137_InternalAadlV3_fragment() throws RecognitionException {   
        EObject this_EnumerationLiteral_10 = null;


        // InternalAadlV3.g:6103:3: (this_EnumerationLiteral_10= ruleEnumerationLiteral )
        // InternalAadlV3.g:6103:3: this_EnumerationLiteral_10= ruleEnumerationLiteral
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_EnumerationLiteral_10=ruleEnumerationLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred137_InternalAadlV3

    // Delegated rules

    public final boolean synpred29_InternalAadlV3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalAadlV3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred137_InternalAadlV3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred137_InternalAadlV3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalAadlV3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalAadlV3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred68_InternalAadlV3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred68_InternalAadlV3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred132_InternalAadlV3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred132_InternalAadlV3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA48 dfa48 = new DFA48(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA88 dfa88 = new DFA88(this);
    protected DFA91 dfa91 = new DFA91(this);
    protected DFA94 dfa94 = new DFA94(this);
    protected DFA104 dfa104 = new DFA104(this);
    protected DFA105 dfa105 = new DFA105(this);
    protected DFA106 dfa106 = new DFA106(this);
    static final String dfa_1s = "\34\uffff";
    static final String dfa_2s = "\1\15\1\16\1\uffff\11\4\1\77\1\4\10\uffff\6\4";
    static final String dfa_3s = "\2\135\1\uffff\10\45\1\136\1\104\1\136\10\uffff\6\45";
    static final String dfa_4s = "\2\uffff\1\1\13\uffff\1\2\1\4\1\5\1\6\1\7\1\10\1\11\1\3\6\uffff";
    static final String dfa_5s = "\34\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\6\uffff\1\20\6\uffff\1\21\1\23\1\uffff\1\24\5\uffff\1\16\1\17\11\uffff\1\22\15\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\15\25\uffff\1\14",
            "\1\2\6\uffff\1\20\6\uffff\1\21\1\23\1\uffff\1\24\5\uffff\1\16\1\17\11\uffff\1\22\15\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\15\25\uffff\1\14",
            "",
            "\1\25\40\uffff\1\16",
            "\1\25\40\uffff\1\16",
            "\1\25\40\uffff\1\16",
            "\1\25\40\uffff\1\16",
            "\1\25\40\uffff\1\16",
            "\1\25\40\uffff\1\16",
            "\1\25\40\uffff\1\16",
            "\1\25\40\uffff\1\16",
            "\1\25\40\uffff\1\16\70\uffff\1\26",
            "\1\27\1\uffff\1\31\1\32\1\uffff\1\30",
            "\1\25\40\uffff\1\16\70\uffff\1\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\25\40\uffff\1\16",
            "\1\25\40\uffff\1\16",
            "\1\25\40\uffff\1\16",
            "\1\25\40\uffff\1\16",
            "\1\25\40\uffff\1\16",
            "\1\25\40\uffff\1\16"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "276:2: (this_PackageDeclaration_0= rulePackageDeclaration | this_ComponentInterface_1= ruleComponentInterface | this_ComponentImplementation_2= ruleComponentImplementation | this_ComponentConfiguration_3= ruleComponentConfiguration | this_PropertyDefinition_4= rulePropertyDefinition | this_PropertySet_5= rulePropertySet | this_Workingset_6= ruleWorkingset | this_TypeDef_7= ruleTypeDef | this_ConstantDef_8= ruleConstantDef )";
        }
    }
    static final String dfa_7s = "\13\uffff";
    static final String dfa_8s = "\2\uffff\2\1\1\uffff\1\1\3\uffff\2\1";
    static final String dfa_9s = "\1\45\1\uffff\2\32\1\77\1\32\1\uffff\1\0\1\uffff\2\32";
    static final String dfa_10s = "\1\135\1\uffff\2\141\1\104\1\141\1\uffff\1\0\1\uffff\2\141";
    static final String dfa_11s = "\1\uffff\1\1\4\uffff\1\2\1\uffff\1\3\2\uffff";
    static final String dfa_12s = "\7\uffff\1\0\3\uffff}>";
    static final String[] dfa_13s = {
            "\1\6\4\uffff\1\10\23\uffff\1\1\1\2\1\3\6\1\1\5\3\6\1\7\20\uffff\1\10\1\4",
            "",
            "\2\1\105\uffff\1\6",
            "\2\1\105\uffff\1\6",
            "\1\11\1\uffff\2\1\1\uffff\1\1",
            "\2\1\102\uffff\1\12\2\uffff\1\6",
            "",
            "\1\uffff",
            "",
            "\2\1\105\uffff\1\6",
            "\2\1\105\uffff\1\6"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "545:2: ( ( (lv_componentCategories_0_0= ruleComponentCategory ) ) | ( (lv_featureCategories_1_0= ruleFeatureCategory ) ) | ( (lv_associationTypes_2_0= ruleAssociationType ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_7 = input.LA(1);

                         
                        int index9_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalAadlV3()) ) {s = 6;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index9_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\12\uffff";
    static final String dfa_15s = "\1\4\1\26\2\uffff\1\45\1\4\4\uffff";
    static final String dfa_16s = "\1\40\1\44\2\uffff\1\135\1\140\4\uffff";
    static final String dfa_17s = "\2\uffff\1\5\1\6\2\uffff\1\1\1\4\1\3\1\2";
    static final String dfa_18s = "\12\uffff}>";
    static final String[] dfa_19s = {
            "\1\1\15\uffff\1\3\15\uffff\1\2",
            "\1\4\11\uffff\1\2\3\uffff\1\2",
            "",
            "",
            "\1\6\4\uffff\1\5\24\uffff\2\6\6\uffff\11\6\15\uffff\1\6",
            "\1\11\132\uffff\1\10\1\7",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "1297:2: ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_flows_1_0= ruleFlowPath ) ) | ( (lv_flows_2_0= ruleFlowSource ) ) | ( (lv_flows_3_0= ruleFlowSink ) ) | ( (lv_ownedPropertyAssociations_4_0= rulePropertyAssociation ) ) | ( (lv_annexSubclause_5_0= ruleAnnexSubclause ) ) )";
        }
    }
    static final String dfa_20s = "\17\uffff";
    static final String dfa_21s = "\1\4\1\26\3\uffff\3\4\1\40\6\uffff";
    static final String dfa_22s = "\1\40\1\44\3\uffff\1\4\1\52\1\135\1\44\6\uffff";
    static final String dfa_23s = "\2\uffff\1\7\1\10\1\11\4\uffff\1\6\1\5\1\3\1\4\1\1\1\2";
    static final String dfa_24s = "\17\uffff}>";
    static final String[] dfa_25s = {
            "\1\1\15\uffff\1\4\6\uffff\1\2\6\uffff\1\3",
            "\1\7\11\uffff\1\3\1\6\2\uffff\1\5",
            "",
            "",
            "",
            "\1\10",
            "\1\11\16\uffff\1\11\26\uffff\1\12",
            "\1\16\45\uffff\1\14\23\uffff\12\13\3\uffff\1\16\20\uffff\1\15\1\13",
            "\1\3\1\6\2\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "1575:2: ( ( (lv_connections_0_0= ruleConnection ) ) | ( (lv_bindings_1_0= ruleBinding ) ) | ( (lv_components_2_0= ruleSubcomponent ) ) | ( (lv_paths_3_0= rulePath ) ) | ( (lv_flowAssignments_4_0= ruleFlowAssignment ) ) | ( (lv_classifierAssignments_5_0= ruleClassifierAssignment ) ) | ( (lv_classifierAssignments_6_0= ruleClassifierAssignmentPattern ) ) | ( (lv_ownedPropertyAssociations_7_0= rulePropertyAssociation ) ) | ( (lv_annexSubclause_8_0= ruleAnnexSubclause ) ) )";
        }
    }
    static final String dfa_26s = "\6\uffff";
    static final String dfa_27s = "\1\4\1\21\1\4\2\uffff\1\21";
    static final String dfa_28s = "\1\4\1\75\1\4\2\uffff\1\75";
    static final String dfa_29s = "\3\uffff\1\2\1\1\1\uffff";
    static final String dfa_30s = "\6\uffff}>";
    static final String[] dfa_31s = {
            "\1\1",
            "\1\3\32\uffff\1\3\17\uffff\1\4\1\2",
            "\1\5",
            "",
            "",
            "\1\3\32\uffff\1\3\17\uffff\1\4\1\2"
    };

    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[][] dfa_31 = unpackEncodedStringArray(dfa_31s);

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = dfa_26;
            this.eof = dfa_26;
            this.min = dfa_27;
            this.max = dfa_28;
            this.accept = dfa_29;
            this.special = dfa_30;
            this.transition = dfa_31;
        }
        public String getDescription() {
            return "2973:3: ( ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) )";
        }
    }
    static final String dfa_32s = "\11\uffff";
    static final String dfa_33s = "\1\4\1\26\4\uffff\1\4\1\uffff\1\40";
    static final String dfa_34s = "\1\40\1\44\4\uffff\1\4\1\uffff\1\44";
    static final String dfa_35s = "\2\uffff\1\1\1\4\1\5\1\2\1\uffff\1\3\1\uffff";
    static final String dfa_36s = "\11\uffff}>";
    static final String[] dfa_37s = {
            "\1\1\15\uffff\1\4\6\uffff\1\3\6\uffff\1\2",
            "\1\5\11\uffff\1\2\1\7\2\uffff\1\6",
            "",
            "",
            "",
            "",
            "\1\10",
            "",
            "\1\2\1\7\2\uffff\1\6"
    };

    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final char[] dfa_33 = DFA.unpackEncodedStringToUnsignedChars(dfa_33s);
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[][] dfa_37 = unpackEncodedStringArray(dfa_37s);

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = dfa_32;
            this.eof = dfa_32;
            this.min = dfa_33;
            this.max = dfa_34;
            this.accept = dfa_35;
            this.special = dfa_36;
            this.transition = dfa_37;
        }
        public String getDescription() {
            return "3511:2: ( ( (lv_ownedPropertyAssociations_0_0= rulePropertyAssociation ) ) | ( (lv_bindings_1_0= ruleBinding ) ) | ( (lv_classifierAssignments_2_0= ruleClassifierAssignment ) ) | ( (lv_classifierAssignments_3_0= ruleClassifierAssignmentPattern ) ) | ( (lv_annexSubclause_4_0= ruleAnnexSubclause ) ) )";
        }
    }
    static final String dfa_38s = "\20\uffff";
    static final String dfa_39s = "\1\4\1\26\1\uffff\1\4\1\uffff\2\4\1\77\2\4\3\uffff\2\4\1\21";
    static final String dfa_40s = "\1\40\1\44\1\uffff\1\135\1\uffff\2\141\1\104\1\141\1\55\3\uffff\2\141\1\75";
    static final String dfa_41s = "\2\uffff\1\5\1\uffff\1\1\5\uffff\1\4\1\2\1\3\3\uffff";
    static final String dfa_42s = "\20\uffff}>";
    static final String[] dfa_43s = {
            "\1\1\33\uffff\1\2",
            "\1\3\11\uffff\1\2\3\uffff\1\2",
            "",
            "\1\14\40\uffff\1\4\30\uffff\1\12\1\6\1\5\6\12\1\10\3\4\1\11\4\4\14\uffff\1\13\1\7",
            "",
            "\1\12\14\uffff\1\12\1\uffff\1\12\115\uffff\1\4",
            "\1\12\14\uffff\1\12\1\uffff\1\12\115\uffff\1\4",
            "\1\15\1\uffff\2\12\1\uffff\1\12",
            "\1\12\14\uffff\1\12\1\uffff\1\12\112\uffff\1\16\2\uffff\1\4",
            "\1\17\14\uffff\1\4\1\uffff\1\4\31\uffff\1\4",
            "",
            "",
            "",
            "\1\12\14\uffff\1\12\1\uffff\1\12\115\uffff\1\4",
            "\1\12\14\uffff\1\12\1\uffff\1\12\115\uffff\1\4",
            "\1\4\1\uffff\1\4\20\uffff\1\14\2\uffff\1\14\25\uffff\1\4"
    };

    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final char[] dfa_39 = DFA.unpackEncodedStringToUnsignedChars(dfa_39s);
    static final char[] dfa_40 = DFA.unpackEncodedStringToUnsignedChars(dfa_40s);
    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final short[][] dfa_43 = unpackEncodedStringArray(dfa_43s);

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = dfa_38;
            this.eof = dfa_38;
            this.min = dfa_39;
            this.max = dfa_40;
            this.accept = dfa_41;
            this.special = dfa_42;
            this.transition = dfa_43;
        }
        public String getDescription() {
            return "4407:2: ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_bindings_2_0= ruleBinding ) ) | ( (lv_components_3_0= ruleSubcomponent ) ) | ( (lv_ownedPropertyAssociations_4_0= rulePropertyAssociation ) ) )";
        }
    }
    static final String dfa_44s = "\7\uffff";
    static final String dfa_45s = "\1\4\1\uffff\1\44\1\4\2\uffff\1\44";
    static final String dfa_46s = "\1\131\1\uffff\1\114\1\4\2\uffff\1\114";
    static final String dfa_47s = "\1\uffff\1\1\2\uffff\1\3\1\2\1\uffff";
    static final String dfa_48s = "\7\uffff}>";
    static final String[] dfa_49s = {
            "\1\2\24\uffff\1\1\25\uffff\1\1\46\uffff\4\1",
            "",
            "\1\3\24\uffff\1\4\22\uffff\1\5",
            "\1\6",
            "",
            "",
            "\1\3\24\uffff\1\4\22\uffff\1\5"
    };

    static final short[] dfa_44 = DFA.unpackEncodedString(dfa_44s);
    static final char[] dfa_45 = DFA.unpackEncodedStringToUnsignedChars(dfa_45s);
    static final char[] dfa_46 = DFA.unpackEncodedStringToUnsignedChars(dfa_46s);
    static final short[] dfa_47 = DFA.unpackEncodedString(dfa_47s);
    static final short[] dfa_48 = DFA.unpackEncodedString(dfa_48s);
    static final short[][] dfa_49 = unpackEncodedStringArray(dfa_49s);

    class DFA88 extends DFA {

        public DFA88(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 88;
            this.eot = dfa_44;
            this.eof = dfa_44;
            this.min = dfa_45;
            this.max = dfa_46;
            this.accept = dfa_47;
            this.special = dfa_48;
            this.transition = dfa_49;
        }
        public String getDescription() {
            return "5688:5: (lv_condition_2_1= ruleMultiLiteralOperation | lv_condition_2_2= ruleContainsToken | lv_condition_2_3= ruleModelElementReference )";
        }
    }
    static final String[] dfa_50s = {
            "\1\2\24\uffff\1\1\25\uffff\1\1\46\uffff\4\1",
            "",
            "\1\3\2\uffff\1\4\44\uffff\1\5",
            "\1\6",
            "",
            "",
            "\1\3\2\uffff\1\4\44\uffff\1\5"
    };
    static final short[][] dfa_50 = unpackEncodedStringArray(dfa_50s);

    class DFA91 extends DFA {

        public DFA91(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 91;
            this.eot = dfa_44;
            this.eof = dfa_44;
            this.min = dfa_45;
            this.max = dfa_46;
            this.accept = dfa_47;
            this.special = dfa_48;
            this.transition = dfa_50;
        }
        public String getDescription() {
            return "5810:5: (lv_condition_0_1= ruleMultiLiteralOperation | lv_condition_0_2= ruleContainsToken | lv_condition_0_3= ruleModelElementReference )";
        }
    }
    static final String dfa_51s = "\16\uffff";
    static final String dfa_52s = "\1\4\5\uffff\1\44\7\uffff";
    static final String dfa_53s = "\1\131\5\uffff\1\114\7\uffff";
    static final String dfa_54s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\1\10\1\11\1\12\1\6\1\13\1\14";
    static final String dfa_55s = "\6\uffff\1\0\7\uffff}>";
    static final String[] dfa_56s = {
            "\1\6\1\uffff\1\1\1\2\1\3\17\uffff\1\10\1\11\6\uffff\1\5\16\uffff\1\11\12\uffff\2\4\20\uffff\2\7\10\uffff\4\11",
            "",
            "",
            "",
            "",
            "",
            "\1\12\47\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_51 = DFA.unpackEncodedString(dfa_51s);
    static final char[] dfa_52 = DFA.unpackEncodedStringToUnsignedChars(dfa_52s);
    static final char[] dfa_53 = DFA.unpackEncodedStringToUnsignedChars(dfa_53s);
    static final short[] dfa_54 = DFA.unpackEncodedString(dfa_54s);
    static final short[] dfa_55 = DFA.unpackEncodedString(dfa_55s);
    static final short[][] dfa_56 = unpackEncodedStringArray(dfa_56s);

    class DFA94 extends DFA {

        public DFA94(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 94;
            this.eot = dfa_51;
            this.eof = dfa_51;
            this.min = dfa_52;
            this.max = dfa_53;
            this.accept = dfa_54;
            this.special = dfa_55;
            this.transition = dfa_56;
        }
        public String getDescription() {
            return "5982:2: (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_PropertyReference_4= rulePropertyReference | this_PackageElementReference_5= rulePackageElementReference | this_DirectionalLiteral_6= ruleDirectionalLiteral | this_ListLiteral_7= ruleListLiteral | this_MultiLiteralOperation_8= ruleMultiLiteralOperation | this_ContainsToken_9= ruleContainsToken | this_EnumerationLiteral_10= ruleEnumerationLiteral | this_ModelElementReference_11= ruleModelElementReference )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA94_6 = input.LA(1);

                         
                        int index94_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA94_6==36||LA94_6==76) ) {s = 10;}

                        else if ( (synpred132_InternalAadlV3()) ) {s = 11;}

                        else if ( (synpred137_InternalAadlV3()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index94_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 94, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_57s = "\24\uffff";
    static final String dfa_58s = "\11\uffff\1\15\1\uffff\1\23\10\uffff";
    static final String dfa_59s = "\1\76\10\uffff\1\4\1\77\1\4\10\uffff";
    static final String dfa_60s = "\1\135\10\uffff\1\136\1\104\1\136\10\uffff";
    static final String dfa_61s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\3\uffff\1\20\1\11\1\13\1\15\1\14\1\12\1\17\1\16";
    static final String dfa_62s = "\24\uffff}>";
    static final String[] dfa_63s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\13\25\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\15\14\uffff\1\15\1\uffff\1\15\6\uffff\2\15\11\uffff\1\15\70\uffff\1\14",
            "\1\21\1\uffff\1\17\1\20\1\uffff\1\16",
            "\1\23\14\uffff\1\23\1\uffff\1\23\6\uffff\2\23\11\uffff\1\23\70\uffff\1\22",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_57 = DFA.unpackEncodedString(dfa_57s);
    static final short[] dfa_58 = DFA.unpackEncodedString(dfa_58s);
    static final char[] dfa_59 = DFA.unpackEncodedStringToUnsignedChars(dfa_59s);
    static final char[] dfa_60 = DFA.unpackEncodedStringToUnsignedChars(dfa_60s);
    static final short[] dfa_61 = DFA.unpackEncodedString(dfa_61s);
    static final short[] dfa_62 = DFA.unpackEncodedString(dfa_62s);
    static final short[][] dfa_63 = unpackEncodedStringArray(dfa_63s);

    class DFA104 extends DFA {

        public DFA104(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 104;
            this.eot = dfa_57;
            this.eof = dfa_58;
            this.min = dfa_59;
            this.max = dfa_60;
            this.accept = dfa_61;
            this.special = dfa_62;
            this.transition = dfa_63;
        }
        public String getDescription() {
            return "6996:2: (kw= 'abstract' | kw= 'bus' | kw= 'data' | kw= 'device' | kw= 'memory' | kw= 'process' | kw= 'processor' | kw= 'system' | kw= 'thread' | this_VirtualBusKeywords_9= ruleVirtualBusKeywords | this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords | this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords | this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords | kw= 'subprogram' | this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords | this_ThreadGroupKeywords_15= ruleThreadGroupKeywords )";
        }
    }
    static final String dfa_64s = "\14\uffff";
    static final String dfa_65s = "\1\45\6\uffff\1\136\4\uffff";
    static final String dfa_66s = "\1\135\6\uffff\1\141\4\uffff";
    static final String dfa_67s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\11\1\12\1\10\1\7";
    static final String dfa_68s = "\14\uffff}>";
    static final String[] dfa_69s = {
            "\1\11\31\uffff\1\5\1\4\6\uffff\1\7\1\1\1\2\1\3\1\10\21\uffff\1\6",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\12\2\uffff\1\13",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_64 = DFA.unpackEncodedString(dfa_64s);
    static final char[] dfa_65 = DFA.unpackEncodedStringToUnsignedChars(dfa_65s);
    static final char[] dfa_66 = DFA.unpackEncodedStringToUnsignedChars(dfa_66s);
    static final short[] dfa_67 = DFA.unpackEncodedString(dfa_67s);
    static final short[] dfa_68 = DFA.unpackEncodedString(dfa_68s);
    static final short[][] dfa_69 = unpackEncodedStringArray(dfa_69s);

    class DFA105 extends DFA {

        public DFA105(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 105;
            this.eot = dfa_64;
            this.eof = dfa_64;
            this.min = dfa_65;
            this.max = dfa_66;
            this.accept = dfa_67;
            this.special = dfa_68;
            this.transition = dfa_69;
        }
        public String getDescription() {
            return "7140:2: (kw= 'feature' | kw= 'port' | kw= 'parameter' | this_DataAccessKeywords_3= ruleDataAccessKeywords | this_BusAccessKeywords_4= ruleBusAccessKeywords | this_VirtualBusAccessKeywords_5= ruleVirtualBusAccessKeywords | this_SubprogramAccessKeywords_6= ruleSubprogramAccessKeywords | this_SubprogramGroupAccessKeywords_7= ruleSubprogramGroupAccessKeywords | kw= 'binding' | kw= 'interface' )";
        }
    }
    static final String dfa_70s = "\21\uffff";
    static final String dfa_71s = "\1\uffff\1\5\1\uffff\1\11\1\14\3\uffff\1\16\1\uffff\1\20\6\uffff";
    static final String dfa_72s = "\1\114\1\45\1\uffff\2\45\3\uffff\1\45\1\uffff\1\45\6\uffff";
    static final String dfa_73s = "\1\117\1\135\1\uffff\2\135\3\uffff\1\135\1\uffff\1\135\6\uffff";
    static final String dfa_74s = "\2\uffff\1\2\2\uffff\1\1\1\3\1\11\1\uffff\1\4\1\uffff\1\10\1\5\1\13\1\7\1\12\1\6";
    static final String dfa_75s = "\21\uffff}>";
    static final String[] dfa_76s = {
            "\1\1\1\2\1\3\1\4",
            "\1\5\31\uffff\2\5\6\uffff\5\5\1\uffff\1\6\17\uffff\1\5",
            "",
            "\1\11\31\uffff\2\11\6\uffff\5\11\1\10\1\7\17\uffff\1\11",
            "\1\14\31\uffff\2\14\6\uffff\5\14\1\12\1\13\17\uffff\1\14",
            "",
            "",
            "",
            "\1\16\31\uffff\2\16\6\uffff\5\16\1\uffff\1\15\17\uffff\1\16",
            "",
            "\1\20\31\uffff\2\20\6\uffff\5\20\1\uffff\1\17\17\uffff\1\20",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_70 = DFA.unpackEncodedString(dfa_70s);
    static final short[] dfa_71 = DFA.unpackEncodedString(dfa_71s);
    static final char[] dfa_72 = DFA.unpackEncodedStringToUnsignedChars(dfa_72s);
    static final char[] dfa_73 = DFA.unpackEncodedStringToUnsignedChars(dfa_73s);
    static final short[] dfa_74 = DFA.unpackEncodedString(dfa_74s);
    static final short[] dfa_75 = DFA.unpackEncodedString(dfa_75s);
    static final short[][] dfa_76 = unpackEncodedStringArray(dfa_76s);

    class DFA106 extends DFA {

        public DFA106(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 106;
            this.eot = dfa_70;
            this.eof = dfa_71;
            this.min = dfa_72;
            this.max = dfa_73;
            this.accept = dfa_74;
            this.special = dfa_75;
            this.transition = dfa_76;
        }
        public String getDescription() {
            return "7243:2: (kw= 'in' | kw= 'out' | this_InOutKeywords_2= ruleInOutKeywords | kw= 'requires' | kw= 'provides' | this_ProvidesReadKeywords_5= ruleProvidesReadKeywords | this_RequiresReadKeywords_6= ruleRequiresReadKeywords | this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords | this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords | this_ProvidesRWKeywords_9= ruleProvidesRWKeywords | this_RequiresRWKeywords_10= ruleRequiresRWKeywords )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0xC0010860B0256000L,0x00000000200000FFL});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0xC0010860B0216000L,0x00000000200000FFL});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000400000000010L,0x00000000003F0000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0xC000042002000000L,0x0000000030000FFFL});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000404A0000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000004A0000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0C008001030001D0L,0x0000000003C03000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0xC000002000000000L,0x00000000200000FFL});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000040008000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000100050010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0xC000000000000000L,0x00000000200000FFL});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000102050010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000041008000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x8000002000000000L,0x000000002000FF81L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x8000002000000000L,0x0000000020000F81L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00002000000A0010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00000000000A0010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x00000080000A0000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000100000020000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x00000000040A0010L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000008000020000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000102040010L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000102140010L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000100100010L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000020000010010L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000100020000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000020000100010L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0070000000000000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0C008001030201D0L,0x0000000003C03000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000808002000010L,0x0000000003C00000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000800002000010L,0x0000000003C00000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0C0080010B0001D0L,0x0000000003C03000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});

}