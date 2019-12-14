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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ANNEXTEXT", "RULE_STRING", "RULE_INT", "RULE_DOUBLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'private'", "'package'", "'is'", "'end'", "';'", "'@'", "'{'", "'}'", "'property'", "':'", "'for'", "'('", "'all'", "','", "')'", "'properties'", "'type'", "'extends'", "'constant'", "'#'", "'=>'", "'='", "'*=>'", "'.'", "'interface'", "'configuration'", "'->'", "'<->'", "'use'", "'when'", "'import'", "'as'", "'flow'", "'reverse'", "'enum'", "'of'", "'workingset'", "'plc'", "'state'", "'error'", "'recover'", "'repair'", "'transition'", "'source'", "'sink'", "'true'", "'false'", "'::*'", "'::'", "'abstract'", "'bus'", "'data'", "'device'", "'memory'", "'process'", "'processor'", "'system'", "'thread'", "'subprogram'", "'feature'", "'port'", "'parameter'", "'binding'", "'in'", "'out'", "'requires'", "'provides'", "'list'", "'set'", "'boolean'", "'integer'", "'real'", "'string'", "'any'", "'oneof'", "'ormore'", "'orless'", "'satisfies'", "'?'", "'connection'", "'virtual'", "'group'", "'to'", "'access'"
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
    public static final int RULE_INT=7;
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
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ANNEXTEXT=5;
    public static final int RULE_DOUBLE=8;
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
    // InternalAadlV3.g:89:1: rulePackageDeclaration returns [EObject current=null] : ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_private_1_0= 'private' ) )? otherlv_2= 'package' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= 'is' ( ( (lv_elements_5_0= ruleAnnexLibrary ) ) | ( ( (lv_imports_6_0= ruleImport ) ) | ( (lv_elements_7_0= rulePackageElement ) ) )* ) otherlv_8= 'end' otherlv_9= ';' ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_private_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject this_Annotation_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_elements_5_0 = null;

        EObject lv_imports_6_0 = null;

        EObject lv_elements_7_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:95:2: ( ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_private_1_0= 'private' ) )? otherlv_2= 'package' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= 'is' ( ( (lv_elements_5_0= ruleAnnexLibrary ) ) | ( ( (lv_imports_6_0= ruleImport ) ) | ( (lv_elements_7_0= rulePackageElement ) ) )* ) otherlv_8= 'end' otherlv_9= ';' ) )
            // InternalAadlV3.g:96:2: ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_private_1_0= 'private' ) )? otherlv_2= 'package' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= 'is' ( ( (lv_elements_5_0= ruleAnnexLibrary ) ) | ( ( (lv_imports_6_0= ruleImport ) ) | ( (lv_elements_7_0= rulePackageElement ) ) )* ) otherlv_8= 'end' otherlv_9= ';' )
            {
            // InternalAadlV3.g:96:2: ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_private_1_0= 'private' ) )? otherlv_2= 'package' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= 'is' ( ( (lv_elements_5_0= ruleAnnexLibrary ) ) | ( ( (lv_imports_6_0= ruleImport ) ) | ( (lv_elements_7_0= rulePackageElement ) ) )* ) otherlv_8= 'end' otherlv_9= ';' )
            // InternalAadlV3.g:97:3: (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_private_1_0= 'private' ) )? otherlv_2= 'package' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= 'is' ( ( (lv_elements_5_0= ruleAnnexLibrary ) ) | ( ( (lv_imports_6_0= ruleImport ) ) | ( (lv_elements_7_0= rulePackageElement ) ) )* ) otherlv_8= 'end' otherlv_9= ';'
            {
            // InternalAadlV3.g:97:3: (this_Annotation_0= ruleAnnotation[$current] )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAadlV3.g:98:4: this_Annotation_0= ruleAnnotation[$current]
            	    {
            	    if ( state.backtracking==0 ) {

            	      				/* */
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElement(grammarAccess.getPackageDeclarationRule());
            	      				}
            	      				newCompositeNode(grammarAccess.getPackageDeclarationAccess().getAnnotationParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    this_Annotation_0=ruleAnnotation(current);

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current = this_Annotation_0;
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalAadlV3.g:113:3: ( (lv_private_1_0= 'private' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalAadlV3.g:114:4: (lv_private_1_0= 'private' )
                    {
                    // InternalAadlV3.g:114:4: (lv_private_1_0= 'private' )
                    // InternalAadlV3.g:115:5: lv_private_1_0= 'private'
                    {
                    lv_private_1_0=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_private_1_0, grammarAccess.getPackageDeclarationAccess().getPrivatePrivateKeyword_1_0());
                      				
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

            otherlv_2=(Token)match(input,14,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_2());
              		
            }
            // InternalAadlV3.g:131:3: ( (lv_name_3_0= ruleQualifiedName ) )
            // InternalAadlV3.g:132:4: (lv_name_3_0= ruleQualifiedName )
            {
            // InternalAadlV3.g:132:4: (lv_name_3_0= ruleQualifiedName )
            // InternalAadlV3.g:133:5: lv_name_3_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_name_3_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_3_0,
              						"org.osate.xtext.aadlv3.AadlV3.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getPackageDeclarationAccess().getIsKeyword_4());
              		
            }
            // InternalAadlV3.g:154:3: ( ( (lv_elements_5_0= ruleAnnexLibrary ) ) | ( ( (lv_imports_6_0= ruleImport ) ) | ( (lv_elements_7_0= rulePackageElement ) ) )* )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_ID) ) {
                    int LA4_3 = input.LA(3);

                    if ( ((LA4_3>=13 && LA4_3<=14)||LA4_3==18||LA4_3==21||(LA4_3>=28 && LA4_3<=29)||LA4_3==31||(LA4_3>=37 && LA4_3<=38)||(LA4_3>=62 && LA4_3<=71)||LA4_3==93) ) {
                        alt4=2;
                    }
                    else if ( (LA4_3==19) ) {
                        alt4=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA4_0>=13 && LA4_0<=14)||LA4_0==16||LA4_0==21||(LA4_0>=28 && LA4_0<=29)||LA4_0==31||(LA4_0>=37 && LA4_0<=38)||LA4_0==43||LA4_0==49||(LA4_0>=62 && LA4_0<=71)||LA4_0==93) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalAadlV3.g:155:4: ( (lv_elements_5_0= ruleAnnexLibrary ) )
                    {
                    // InternalAadlV3.g:155:4: ( (lv_elements_5_0= ruleAnnexLibrary ) )
                    // InternalAadlV3.g:156:5: (lv_elements_5_0= ruleAnnexLibrary )
                    {
                    // InternalAadlV3.g:156:5: (lv_elements_5_0= ruleAnnexLibrary )
                    // InternalAadlV3.g:157:6: lv_elements_5_0= ruleAnnexLibrary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsAnnexLibraryParserRuleCall_5_0_0());
                      					
                    }
                    pushFollow(FOLLOW_8);
                    lv_elements_5_0=ruleAnnexLibrary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
                      						}
                      						add(
                      							current,
                      							"elements",
                      							lv_elements_5_0,
                      							"org.osate.xtext.aadlv3.AadlV3.AnnexLibrary");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:175:4: ( ( (lv_imports_6_0= ruleImport ) ) | ( (lv_elements_7_0= rulePackageElement ) ) )*
                    {
                    // InternalAadlV3.g:175:4: ( ( (lv_imports_6_0= ruleImport ) ) | ( (lv_elements_7_0= rulePackageElement ) ) )*
                    loop3:
                    do {
                        int alt3=3;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==43) ) {
                            alt3=1;
                        }
                        else if ( ((LA3_0>=13 && LA3_0<=14)||LA3_0==18||LA3_0==21||(LA3_0>=28 && LA3_0<=29)||LA3_0==31||(LA3_0>=37 && LA3_0<=38)||LA3_0==49||(LA3_0>=62 && LA3_0<=71)||LA3_0==93) ) {
                            alt3=2;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalAadlV3.g:176:5: ( (lv_imports_6_0= ruleImport ) )
                    	    {
                    	    // InternalAadlV3.g:176:5: ( (lv_imports_6_0= ruleImport ) )
                    	    // InternalAadlV3.g:177:6: (lv_imports_6_0= ruleImport )
                    	    {
                    	    // InternalAadlV3.g:177:6: (lv_imports_6_0= ruleImport )
                    	    // InternalAadlV3.g:178:7: lv_imports_6_0= ruleImport
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getPackageDeclarationAccess().getImportsImportParserRuleCall_5_1_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_7);
                    	    lv_imports_6_0=ruleImport();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"imports",
                    	      								lv_imports_6_0,
                    	      								"org.osate.xtext.aadlv3.AadlV3.Import");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAadlV3.g:196:5: ( (lv_elements_7_0= rulePackageElement ) )
                    	    {
                    	    // InternalAadlV3.g:196:5: ( (lv_elements_7_0= rulePackageElement ) )
                    	    // InternalAadlV3.g:197:6: (lv_elements_7_0= rulePackageElement )
                    	    {
                    	    // InternalAadlV3.g:197:6: (lv_elements_7_0= rulePackageElement )
                    	    // InternalAadlV3.g:198:7: lv_elements_7_0= rulePackageElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsPackageElementParserRuleCall_5_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_7);
                    	    lv_elements_7_0=rulePackageElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_7_0,
                    	      								"org.osate.xtext.aadlv3.AadlV3.PackageElement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getPackageDeclarationAccess().getEndKeyword_6());
              		
            }
            otherlv_9=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getPackageDeclarationAccess().getSemicolonKeyword_7());
              		
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
    // InternalAadlV3.g:229:1: entryRuleAnnexLibrary returns [EObject current=null] : iv_ruleAnnexLibrary= ruleAnnexLibrary EOF ;
    public final EObject entryRuleAnnexLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnexLibrary = null;


        try {
            // InternalAadlV3.g:229:53: (iv_ruleAnnexLibrary= ruleAnnexLibrary EOF )
            // InternalAadlV3.g:230:2: iv_ruleAnnexLibrary= ruleAnnexLibrary EOF
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
    // InternalAadlV3.g:236:1: ruleAnnexLibrary returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleAnnexLibrary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAadlV3.g:242:2: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // InternalAadlV3.g:243:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // InternalAadlV3.g:243:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // InternalAadlV3.g:244:3: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAnnexLibraryAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalAadlV3.g:248:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAadlV3.g:249:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAadlV3.g:249:4: (lv_name_1_0= RULE_ID )
            // InternalAadlV3.g:250:5: lv_name_1_0= RULE_ID
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
    // InternalAadlV3.g:278:1: entryRulePackageElement returns [EObject current=null] : iv_rulePackageElement= rulePackageElement EOF ;
    public final EObject entryRulePackageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageElement = null;


        try {
            // InternalAadlV3.g:278:55: (iv_rulePackageElement= rulePackageElement EOF )
            // InternalAadlV3.g:279:2: iv_rulePackageElement= rulePackageElement EOF
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
    // InternalAadlV3.g:285:1: rulePackageElement returns [EObject current=null] : (this_PackageDeclaration_0= rulePackageDeclaration | this_ComponentInterface_1= ruleComponentInterface | this_ComponentImplementation_2= ruleComponentImplementation | this_ComponentConfiguration_3= ruleComponentConfiguration | this_PropertyDefinition_4= rulePropertyDefinition | this_PropertySet_5= rulePropertySet | this_Workingset_6= ruleWorkingset | this_TypeDef_7= ruleTypeDef | this_ConstantDef_8= ruleConstantDef ) ;
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
            // InternalAadlV3.g:291:2: ( (this_PackageDeclaration_0= rulePackageDeclaration | this_ComponentInterface_1= ruleComponentInterface | this_ComponentImplementation_2= ruleComponentImplementation | this_ComponentConfiguration_3= ruleComponentConfiguration | this_PropertyDefinition_4= rulePropertyDefinition | this_PropertySet_5= rulePropertySet | this_Workingset_6= ruleWorkingset | this_TypeDef_7= ruleTypeDef | this_ConstantDef_8= ruleConstantDef ) )
            // InternalAadlV3.g:292:2: (this_PackageDeclaration_0= rulePackageDeclaration | this_ComponentInterface_1= ruleComponentInterface | this_ComponentImplementation_2= ruleComponentImplementation | this_ComponentConfiguration_3= ruleComponentConfiguration | this_PropertyDefinition_4= rulePropertyDefinition | this_PropertySet_5= rulePropertySet | this_Workingset_6= ruleWorkingset | this_TypeDef_7= ruleTypeDef | this_ConstantDef_8= ruleConstantDef )
            {
            // InternalAadlV3.g:292:2: (this_PackageDeclaration_0= rulePackageDeclaration | this_ComponentInterface_1= ruleComponentInterface | this_ComponentImplementation_2= ruleComponentImplementation | this_ComponentConfiguration_3= ruleComponentConfiguration | this_PropertyDefinition_4= rulePropertyDefinition | this_PropertySet_5= rulePropertySet | this_Workingset_6= ruleWorkingset | this_TypeDef_7= ruleTypeDef | this_ConstantDef_8= ruleConstantDef )
            int alt5=9;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalAadlV3.g:293:3: this_PackageDeclaration_0= rulePackageDeclaration
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
                    // InternalAadlV3.g:305:3: this_ComponentInterface_1= ruleComponentInterface
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
                    // InternalAadlV3.g:317:3: this_ComponentImplementation_2= ruleComponentImplementation
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
                    // InternalAadlV3.g:329:3: this_ComponentConfiguration_3= ruleComponentConfiguration
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
                    // InternalAadlV3.g:341:3: this_PropertyDefinition_4= rulePropertyDefinition
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
                    // InternalAadlV3.g:353:3: this_PropertySet_5= rulePropertySet
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
                    // InternalAadlV3.g:365:3: this_Workingset_6= ruleWorkingset
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
                    // InternalAadlV3.g:377:3: this_TypeDef_7= ruleTypeDef
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
                    // InternalAadlV3.g:389:3: this_ConstantDef_8= ruleConstantDef
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
    // InternalAadlV3.g:404:1: entryRulePropertyDefinition returns [EObject current=null] : iv_rulePropertyDefinition= rulePropertyDefinition EOF ;
    public final EObject entryRulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyDefinition = null;


        try {
            // InternalAadlV3.g:404:59: (iv_rulePropertyDefinition= rulePropertyDefinition EOF )
            // InternalAadlV3.g:405:2: iv_rulePropertyDefinition= rulePropertyDefinition EOF
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
    // InternalAadlV3.g:411:1: rulePropertyDefinition returns [EObject current=null] : ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_private_1_0= 'private' ) )? otherlv_2= 'property' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleType ) ) (otherlv_6= 'for' otherlv_7= '(' ( ( (lv_forAll_8_0= 'all' ) ) | (this_AppliesTo_9= ruleAppliesTo[$current] (otherlv_10= ',' this_AppliesTo_11= ruleAppliesTo[$current] )* ) ) otherlv_12= ')' )? otherlv_13= ';' ) ;
    public final EObject rulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_private_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_forAll_8_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject this_Annotation_0 = null;

        EObject lv_type_5_0 = null;

        EObject this_AppliesTo_9 = null;

        EObject this_AppliesTo_11 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:417:2: ( ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_private_1_0= 'private' ) )? otherlv_2= 'property' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleType ) ) (otherlv_6= 'for' otherlv_7= '(' ( ( (lv_forAll_8_0= 'all' ) ) | (this_AppliesTo_9= ruleAppliesTo[$current] (otherlv_10= ',' this_AppliesTo_11= ruleAppliesTo[$current] )* ) ) otherlv_12= ')' )? otherlv_13= ';' ) )
            // InternalAadlV3.g:418:2: ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_private_1_0= 'private' ) )? otherlv_2= 'property' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleType ) ) (otherlv_6= 'for' otherlv_7= '(' ( ( (lv_forAll_8_0= 'all' ) ) | (this_AppliesTo_9= ruleAppliesTo[$current] (otherlv_10= ',' this_AppliesTo_11= ruleAppliesTo[$current] )* ) ) otherlv_12= ')' )? otherlv_13= ';' )
            {
            // InternalAadlV3.g:418:2: ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_private_1_0= 'private' ) )? otherlv_2= 'property' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleType ) ) (otherlv_6= 'for' otherlv_7= '(' ( ( (lv_forAll_8_0= 'all' ) ) | (this_AppliesTo_9= ruleAppliesTo[$current] (otherlv_10= ',' this_AppliesTo_11= ruleAppliesTo[$current] )* ) ) otherlv_12= ')' )? otherlv_13= ';' )
            // InternalAadlV3.g:419:3: (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_private_1_0= 'private' ) )? otherlv_2= 'property' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleType ) ) (otherlv_6= 'for' otherlv_7= '(' ( ( (lv_forAll_8_0= 'all' ) ) | (this_AppliesTo_9= ruleAppliesTo[$current] (otherlv_10= ',' this_AppliesTo_11= ruleAppliesTo[$current] )* ) ) otherlv_12= ')' )? otherlv_13= ';'
            {
            // InternalAadlV3.g:419:3: (this_Annotation_0= ruleAnnotation[$current] )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAadlV3.g:420:4: this_Annotation_0= ruleAnnotation[$current]
            	    {
            	    if ( state.backtracking==0 ) {

            	      				/* */
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElement(grammarAccess.getPropertyDefinitionRule());
            	      				}
            	      				newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getAnnotationParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_12);
            	    this_Annotation_0=ruleAnnotation(current);

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current = this_Annotation_0;
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalAadlV3.g:435:3: ( (lv_private_1_0= 'private' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAadlV3.g:436:4: (lv_private_1_0= 'private' )
                    {
                    // InternalAadlV3.g:436:4: (lv_private_1_0= 'private' )
                    // InternalAadlV3.g:437:5: lv_private_1_0= 'private'
                    {
                    lv_private_1_0=(Token)match(input,13,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_private_1_0, grammarAccess.getPropertyDefinitionAccess().getPrivatePrivateKeyword_1_0());
                      				
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

            otherlv_2=(Token)match(input,21,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPropertyDefinitionAccess().getPropertyKeyword_2());
              		
            }
            // InternalAadlV3.g:453:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalAadlV3.g:454:4: (lv_name_3_0= RULE_ID )
            {
            // InternalAadlV3.g:454:4: (lv_name_3_0= RULE_ID )
            // InternalAadlV3.g:455:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_3_0, grammarAccess.getPropertyDefinitionAccess().getNameIDTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPropertyDefinitionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_3_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getPropertyDefinitionAccess().getColonKeyword_4());
              		
            }
            // InternalAadlV3.g:475:3: ( (lv_type_5_0= ruleType ) )
            // InternalAadlV3.g:476:4: (lv_type_5_0= ruleType )
            {
            // InternalAadlV3.g:476:4: (lv_type_5_0= ruleType )
            // InternalAadlV3.g:477:5: lv_type_5_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getTypeTypeParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_type_5_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_5_0,
              						"org.osate.xtext.aadlv3.AadlV3.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:494:3: (otherlv_6= 'for' otherlv_7= '(' ( ( (lv_forAll_8_0= 'all' ) ) | (this_AppliesTo_9= ruleAppliesTo[$current] (otherlv_10= ',' this_AppliesTo_11= ruleAppliesTo[$current] )* ) ) otherlv_12= ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAadlV3.g:495:4: otherlv_6= 'for' otherlv_7= '(' ( ( (lv_forAll_8_0= 'all' ) ) | (this_AppliesTo_9= ruleAppliesTo[$current] (otherlv_10= ',' this_AppliesTo_11= ruleAppliesTo[$current] )* ) ) otherlv_12= ')'
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getPropertyDefinitionAccess().getForKeyword_6_0());
                      			
                    }
                    otherlv_7=(Token)match(input,24,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getPropertyDefinitionAccess().getLeftParenthesisKeyword_6_1());
                      			
                    }
                    // InternalAadlV3.g:503:4: ( ( (lv_forAll_8_0= 'all' ) ) | (this_AppliesTo_9= ruleAppliesTo[$current] (otherlv_10= ',' this_AppliesTo_11= ruleAppliesTo[$current] )* ) )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==25) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==37||LA9_0==45||(LA9_0>=62 && LA9_0<=75)||(LA9_0>=92 && LA9_0<=93)) ) {
                        alt9=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalAadlV3.g:504:5: ( (lv_forAll_8_0= 'all' ) )
                            {
                            // InternalAadlV3.g:504:5: ( (lv_forAll_8_0= 'all' ) )
                            // InternalAadlV3.g:505:6: (lv_forAll_8_0= 'all' )
                            {
                            // InternalAadlV3.g:505:6: (lv_forAll_8_0= 'all' )
                            // InternalAadlV3.g:506:7: lv_forAll_8_0= 'all'
                            {
                            lv_forAll_8_0=(Token)match(input,25,FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_forAll_8_0, grammarAccess.getPropertyDefinitionAccess().getForAllAllKeyword_6_2_0_0());
                              						
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
                            // InternalAadlV3.g:519:5: (this_AppliesTo_9= ruleAppliesTo[$current] (otherlv_10= ',' this_AppliesTo_11= ruleAppliesTo[$current] )* )
                            {
                            // InternalAadlV3.g:519:5: (this_AppliesTo_9= ruleAppliesTo[$current] (otherlv_10= ',' this_AppliesTo_11= ruleAppliesTo[$current] )* )
                            // InternalAadlV3.g:520:6: this_AppliesTo_9= ruleAppliesTo[$current] (otherlv_10= ',' this_AppliesTo_11= ruleAppliesTo[$current] )*
                            {
                            if ( state.backtracking==0 ) {

                              						/* */
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getPropertyDefinitionRule());
                              						}
                              						newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getAppliesToParserRuleCall_6_2_1_0());
                              					
                            }
                            pushFollow(FOLLOW_20);
                            this_AppliesTo_9=ruleAppliesTo(current);

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current = this_AppliesTo_9;
                              						afterParserOrEnumRuleCall();
                              					
                            }
                            // InternalAadlV3.g:534:6: (otherlv_10= ',' this_AppliesTo_11= ruleAppliesTo[$current] )*
                            loop8:
                            do {
                                int alt8=2;
                                int LA8_0 = input.LA(1);

                                if ( (LA8_0==26) ) {
                                    alt8=1;
                                }


                                switch (alt8) {
                            	case 1 :
                            	    // InternalAadlV3.g:535:7: otherlv_10= ',' this_AppliesTo_11= ruleAppliesTo[$current]
                            	    {
                            	    otherlv_10=(Token)match(input,26,FOLLOW_18); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_10, grammarAccess.getPropertyDefinitionAccess().getCommaKeyword_6_2_1_1_0());
                            	      						
                            	    }
                            	    if ( state.backtracking==0 ) {

                            	      							/* */
                            	      						
                            	    }
                            	    if ( state.backtracking==0 ) {

                            	      							if (current==null) {
                            	      								current = createModelElement(grammarAccess.getPropertyDefinitionRule());
                            	      							}
                            	      							newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getAppliesToParserRuleCall_6_2_1_1_1());
                            	      						
                            	    }
                            	    pushFollow(FOLLOW_20);
                            	    this_AppliesTo_11=ruleAppliesTo(current);

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							current = this_AppliesTo_11;
                            	      							afterParserOrEnumRuleCall();
                            	      						
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop8;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,27,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getPropertyDefinitionAccess().getRightParenthesisKeyword_6_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_13=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_7());
              		
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
    // InternalAadlV3.g:570:1: ruleAppliesTo[EObject in_current] returns [EObject current=in_current] : ( ( (lv_componentCategories_0_0= ruleComponentCategory ) ) | ( (lv_featureCategories_1_0= ruleFeatureCategory ) ) | ( (lv_associationTypes_2_0= ruleAssociationType ) ) ) ;
    public final EObject ruleAppliesTo(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        AntlrDatatypeRuleToken lv_componentCategories_0_0 = null;

        AntlrDatatypeRuleToken lv_featureCategories_1_0 = null;

        AntlrDatatypeRuleToken lv_associationTypes_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:576:2: ( ( ( (lv_componentCategories_0_0= ruleComponentCategory ) ) | ( (lv_featureCategories_1_0= ruleFeatureCategory ) ) | ( (lv_associationTypes_2_0= ruleAssociationType ) ) ) )
            // InternalAadlV3.g:577:2: ( ( (lv_componentCategories_0_0= ruleComponentCategory ) ) | ( (lv_featureCategories_1_0= ruleFeatureCategory ) ) | ( (lv_associationTypes_2_0= ruleAssociationType ) ) )
            {
            // InternalAadlV3.g:577:2: ( ( (lv_componentCategories_0_0= ruleComponentCategory ) ) | ( (lv_featureCategories_1_0= ruleFeatureCategory ) ) | ( (lv_associationTypes_2_0= ruleAssociationType ) ) )
            int alt11=3;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalAadlV3.g:578:3: ( (lv_componentCategories_0_0= ruleComponentCategory ) )
                    {
                    // InternalAadlV3.g:578:3: ( (lv_componentCategories_0_0= ruleComponentCategory ) )
                    // InternalAadlV3.g:579:4: (lv_componentCategories_0_0= ruleComponentCategory )
                    {
                    // InternalAadlV3.g:579:4: (lv_componentCategories_0_0= ruleComponentCategory )
                    // InternalAadlV3.g:580:5: lv_componentCategories_0_0= ruleComponentCategory
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
                    // InternalAadlV3.g:598:3: ( (lv_featureCategories_1_0= ruleFeatureCategory ) )
                    {
                    // InternalAadlV3.g:598:3: ( (lv_featureCategories_1_0= ruleFeatureCategory ) )
                    // InternalAadlV3.g:599:4: (lv_featureCategories_1_0= ruleFeatureCategory )
                    {
                    // InternalAadlV3.g:599:4: (lv_featureCategories_1_0= ruleFeatureCategory )
                    // InternalAadlV3.g:600:5: lv_featureCategories_1_0= ruleFeatureCategory
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
                    // InternalAadlV3.g:618:3: ( (lv_associationTypes_2_0= ruleAssociationType ) )
                    {
                    // InternalAadlV3.g:618:3: ( (lv_associationTypes_2_0= ruleAssociationType ) )
                    // InternalAadlV3.g:619:4: (lv_associationTypes_2_0= ruleAssociationType )
                    {
                    // InternalAadlV3.g:619:4: (lv_associationTypes_2_0= ruleAssociationType )
                    // InternalAadlV3.g:620:5: lv_associationTypes_2_0= ruleAssociationType
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
    // InternalAadlV3.g:641:1: entryRulePropertySet returns [EObject current=null] : iv_rulePropertySet= rulePropertySet EOF ;
    public final EObject entryRulePropertySet() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertySet = null;


        try {
            // InternalAadlV3.g:641:52: (iv_rulePropertySet= rulePropertySet EOF )
            // InternalAadlV3.g:642:2: iv_rulePropertySet= rulePropertySet EOF
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
    // InternalAadlV3.g:648:1: rulePropertySet returns [EObject current=null] : ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_private_1_0= 'private' ) )? otherlv_2= 'properties' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' otherlv_5= '{' ( ( ruleQualifiedReference ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* otherlv_9= '}' otherlv_10= ';' ) ;
    public final EObject rulePropertySet() throws RecognitionException {
        EObject current = null;

        Token lv_private_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject this_Annotation_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:654:2: ( ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_private_1_0= 'private' ) )? otherlv_2= 'properties' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' otherlv_5= '{' ( ( ruleQualifiedReference ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* otherlv_9= '}' otherlv_10= ';' ) )
            // InternalAadlV3.g:655:2: ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_private_1_0= 'private' ) )? otherlv_2= 'properties' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' otherlv_5= '{' ( ( ruleQualifiedReference ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* otherlv_9= '}' otherlv_10= ';' )
            {
            // InternalAadlV3.g:655:2: ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_private_1_0= 'private' ) )? otherlv_2= 'properties' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' otherlv_5= '{' ( ( ruleQualifiedReference ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* otherlv_9= '}' otherlv_10= ';' )
            // InternalAadlV3.g:656:3: (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_private_1_0= 'private' ) )? otherlv_2= 'properties' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' otherlv_5= '{' ( ( ruleQualifiedReference ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* otherlv_9= '}' otherlv_10= ';'
            {
            // InternalAadlV3.g:656:3: (this_Annotation_0= ruleAnnotation[$current] )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAadlV3.g:657:4: this_Annotation_0= ruleAnnotation[$current]
            	    {
            	    if ( state.backtracking==0 ) {

            	      				/* */
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElement(grammarAccess.getPropertySetRule());
            	      				}
            	      				newCompositeNode(grammarAccess.getPropertySetAccess().getAnnotationParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_21);
            	    this_Annotation_0=ruleAnnotation(current);

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current = this_Annotation_0;
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalAadlV3.g:672:3: ( (lv_private_1_0= 'private' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==13) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAadlV3.g:673:4: (lv_private_1_0= 'private' )
                    {
                    // InternalAadlV3.g:673:4: (lv_private_1_0= 'private' )
                    // InternalAadlV3.g:674:5: lv_private_1_0= 'private'
                    {
                    lv_private_1_0=(Token)match(input,13,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_private_1_0, grammarAccess.getPropertySetAccess().getPrivatePrivateKeyword_1_0());
                      				
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

            otherlv_2=(Token)match(input,28,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPropertySetAccess().getPropertiesKeyword_2());
              		
            }
            // InternalAadlV3.g:690:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalAadlV3.g:691:4: (lv_name_3_0= RULE_ID )
            {
            // InternalAadlV3.g:691:4: (lv_name_3_0= RULE_ID )
            // InternalAadlV3.g:692:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_3_0, grammarAccess.getPropertySetAccess().getNameIDTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPropertySetRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_3_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getPropertySetAccess().getColonKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,19,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getPropertySetAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalAadlV3.g:716:3: ( ( ruleQualifiedReference ) )
            // InternalAadlV3.g:717:4: ( ruleQualifiedReference )
            {
            // InternalAadlV3.g:717:4: ( ruleQualifiedReference )
            // InternalAadlV3.g:718:5: ruleQualifiedReference
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

              					newCompositeNode(grammarAccess.getPropertySetAccess().getPropertiesPropertyDefinitionCrossReference_6_0());
              				
            }
            pushFollow(FOLLOW_23);
            ruleQualifiedReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:735:3: (otherlv_7= ',' ( ( ruleQualifiedName ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalAadlV3.g:736:4: otherlv_7= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_7=(Token)match(input,26,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_7, grammarAccess.getPropertySetAccess().getCommaKeyword_7_0());
            	      			
            	    }
            	    // InternalAadlV3.g:740:4: ( ( ruleQualifiedName ) )
            	    // InternalAadlV3.g:741:5: ( ruleQualifiedName )
            	    {
            	    // InternalAadlV3.g:741:5: ( ruleQualifiedName )
            	    // InternalAadlV3.g:742:6: ruleQualifiedName
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

            	      						newCompositeNode(grammarAccess.getPropertySetAccess().getPropertiesPropertyDefinitionCrossReference_7_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_23);
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
            	    break loop14;
                }
            } while (true);

            otherlv_9=(Token)match(input,20,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getPropertySetAccess().getRightCurlyBracketKeyword_8());
              		
            }
            otherlv_10=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getPropertySetAccess().getSemicolonKeyword_9());
              		
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
    // InternalAadlV3.g:772:1: entryRuleTypeDef returns [EObject current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final EObject entryRuleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDef = null;


        try {
            // InternalAadlV3.g:772:48: (iv_ruleTypeDef= ruleTypeDef EOF )
            // InternalAadlV3.g:773:2: iv_ruleTypeDef= ruleTypeDef EOF
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
    // InternalAadlV3.g:779:1: ruleTypeDef returns [EObject current=null] : ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_private_1_0= 'private' ) )? otherlv_2= 'type' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (lv_superType_5_0= ruleType ) ) )? (otherlv_6= ':' ( (lv_baseType_7_0= ruleType ) ) )? (this_PropertiesBlock_8= rulePropertiesBlock[$current] )? otherlv_9= ';' ) ;
    public final EObject ruleTypeDef() throws RecognitionException {
        EObject current = null;

        Token lv_private_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject this_Annotation_0 = null;

        EObject lv_superType_5_0 = null;

        EObject lv_baseType_7_0 = null;

        EObject this_PropertiesBlock_8 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:785:2: ( ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_private_1_0= 'private' ) )? otherlv_2= 'type' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (lv_superType_5_0= ruleType ) ) )? (otherlv_6= ':' ( (lv_baseType_7_0= ruleType ) ) )? (this_PropertiesBlock_8= rulePropertiesBlock[$current] )? otherlv_9= ';' ) )
            // InternalAadlV3.g:786:2: ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_private_1_0= 'private' ) )? otherlv_2= 'type' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (lv_superType_5_0= ruleType ) ) )? (otherlv_6= ':' ( (lv_baseType_7_0= ruleType ) ) )? (this_PropertiesBlock_8= rulePropertiesBlock[$current] )? otherlv_9= ';' )
            {
            // InternalAadlV3.g:786:2: ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_private_1_0= 'private' ) )? otherlv_2= 'type' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (lv_superType_5_0= ruleType ) ) )? (otherlv_6= ':' ( (lv_baseType_7_0= ruleType ) ) )? (this_PropertiesBlock_8= rulePropertiesBlock[$current] )? otherlv_9= ';' )
            // InternalAadlV3.g:787:3: (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_private_1_0= 'private' ) )? otherlv_2= 'type' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (lv_superType_5_0= ruleType ) ) )? (otherlv_6= ':' ( (lv_baseType_7_0= ruleType ) ) )? (this_PropertiesBlock_8= rulePropertiesBlock[$current] )? otherlv_9= ';'
            {
            // InternalAadlV3.g:787:3: (this_Annotation_0= ruleAnnotation[$current] )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==18) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAadlV3.g:788:4: this_Annotation_0= ruleAnnotation[$current]
            	    {
            	    if ( state.backtracking==0 ) {

            	      				/* */
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElement(grammarAccess.getTypeDefRule());
            	      				}
            	      				newCompositeNode(grammarAccess.getTypeDefAccess().getAnnotationParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_24);
            	    this_Annotation_0=ruleAnnotation(current);

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current = this_Annotation_0;
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalAadlV3.g:803:3: ( (lv_private_1_0= 'private' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==13) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAadlV3.g:804:4: (lv_private_1_0= 'private' )
                    {
                    // InternalAadlV3.g:804:4: (lv_private_1_0= 'private' )
                    // InternalAadlV3.g:805:5: lv_private_1_0= 'private'
                    {
                    lv_private_1_0=(Token)match(input,13,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_private_1_0, grammarAccess.getTypeDefAccess().getPrivatePrivateKeyword_1_0());
                      				
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

            otherlv_2=(Token)match(input,29,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTypeDefAccess().getTypeKeyword_2());
              		
            }
            // InternalAadlV3.g:821:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalAadlV3.g:822:4: (lv_name_3_0= RULE_ID )
            {
            // InternalAadlV3.g:822:4: (lv_name_3_0= RULE_ID )
            // InternalAadlV3.g:823:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_3_0, grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTypeDefRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_3_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalAadlV3.g:839:3: (otherlv_4= 'extends' ( (lv_superType_5_0= ruleType ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAadlV3.g:840:4: otherlv_4= 'extends' ( (lv_superType_5_0= ruleType ) )
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getTypeDefAccess().getExtendsKeyword_4_0());
                      			
                    }
                    // InternalAadlV3.g:844:4: ( (lv_superType_5_0= ruleType ) )
                    // InternalAadlV3.g:845:5: (lv_superType_5_0= ruleType )
                    {
                    // InternalAadlV3.g:845:5: (lv_superType_5_0= ruleType )
                    // InternalAadlV3.g:846:6: lv_superType_5_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypeDefAccess().getSuperTypeTypeParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_27);
                    lv_superType_5_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTypeDefRule());
                      						}
                      						set(
                      							current,
                      							"superType",
                      							lv_superType_5_0,
                      							"org.osate.xtext.aadlv3.AadlV3.Type");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalAadlV3.g:864:3: (otherlv_6= ':' ( (lv_baseType_7_0= ruleType ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAadlV3.g:865:4: otherlv_6= ':' ( (lv_baseType_7_0= ruleType ) )
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getTypeDefAccess().getColonKeyword_5_0());
                      			
                    }
                    // InternalAadlV3.g:869:4: ( (lv_baseType_7_0= ruleType ) )
                    // InternalAadlV3.g:870:5: (lv_baseType_7_0= ruleType )
                    {
                    // InternalAadlV3.g:870:5: (lv_baseType_7_0= ruleType )
                    // InternalAadlV3.g:871:6: lv_baseType_7_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypeDefAccess().getBaseTypeTypeParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_28);
                    lv_baseType_7_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTypeDefRule());
                      						}
                      						set(
                      							current,
                      							"baseType",
                      							lv_baseType_7_0,
                      							"org.osate.xtext.aadlv3.AadlV3.Type");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalAadlV3.g:889:3: (this_PropertiesBlock_8= rulePropertiesBlock[$current] )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==19) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAadlV3.g:890:4: this_PropertiesBlock_8= rulePropertiesBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getTypeDefRule());
                      				}
                      				newCompositeNode(grammarAccess.getTypeDefAccess().getPropertiesBlockParserRuleCall_6());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_PropertiesBlock_8=rulePropertiesBlock(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_PropertiesBlock_8;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getTypeDefAccess().getSemicolonKeyword_7());
              		
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
    // InternalAadlV3.g:913:1: entryRuleConstantDef returns [EObject current=null] : iv_ruleConstantDef= ruleConstantDef EOF ;
    public final EObject entryRuleConstantDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDef = null;


        try {
            // InternalAadlV3.g:913:52: (iv_ruleConstantDef= ruleConstantDef EOF )
            // InternalAadlV3.g:914:2: iv_ruleConstantDef= ruleConstantDef EOF
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
    // InternalAadlV3.g:920:1: ruleConstantDef returns [EObject current=null] : ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_private_1_0= 'private' ) )? otherlv_2= 'constant' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_value_5_0= ruleLiteral ) ) otherlv_6= ';' ) ;
    public final EObject ruleConstantDef() throws RecognitionException {
        EObject current = null;

        Token lv_private_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_Annotation_0 = null;

        EObject lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:926:2: ( ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_private_1_0= 'private' ) )? otherlv_2= 'constant' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_value_5_0= ruleLiteral ) ) otherlv_6= ';' ) )
            // InternalAadlV3.g:927:2: ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_private_1_0= 'private' ) )? otherlv_2= 'constant' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_value_5_0= ruleLiteral ) ) otherlv_6= ';' )
            {
            // InternalAadlV3.g:927:2: ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_private_1_0= 'private' ) )? otherlv_2= 'constant' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_value_5_0= ruleLiteral ) ) otherlv_6= ';' )
            // InternalAadlV3.g:928:3: (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_private_1_0= 'private' ) )? otherlv_2= 'constant' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_value_5_0= ruleLiteral ) ) otherlv_6= ';'
            {
            // InternalAadlV3.g:928:3: (this_Annotation_0= ruleAnnotation[$current] )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==18) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalAadlV3.g:929:4: this_Annotation_0= ruleAnnotation[$current]
            	    {
            	    if ( state.backtracking==0 ) {

            	      				/* */
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElement(grammarAccess.getConstantDefRule());
            	      				}
            	      				newCompositeNode(grammarAccess.getConstantDefAccess().getAnnotationParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_29);
            	    this_Annotation_0=ruleAnnotation(current);

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current = this_Annotation_0;
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // InternalAadlV3.g:944:3: ( (lv_private_1_0= 'private' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==13) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAadlV3.g:945:4: (lv_private_1_0= 'private' )
                    {
                    // InternalAadlV3.g:945:4: (lv_private_1_0= 'private' )
                    // InternalAadlV3.g:946:5: lv_private_1_0= 'private'
                    {
                    lv_private_1_0=(Token)match(input,13,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_private_1_0, grammarAccess.getConstantDefAccess().getPrivatePrivateKeyword_1_0());
                      				
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

            otherlv_2=(Token)match(input,31,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getConstantDefAccess().getConstantKeyword_2());
              		
            }
            // InternalAadlV3.g:962:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalAadlV3.g:963:4: (lv_name_3_0= RULE_ID )
            {
            // InternalAadlV3.g:963:4: (lv_name_3_0= RULE_ID )
            // InternalAadlV3.g:964:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_3_0, grammarAccess.getConstantDefAccess().getNameIDTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConstantDefRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_3_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getConstantDefAccess().getColonKeyword_4());
              		
            }
            // InternalAadlV3.g:984:3: ( (lv_value_5_0= ruleLiteral ) )
            // InternalAadlV3.g:985:4: (lv_value_5_0= ruleLiteral )
            {
            // InternalAadlV3.g:985:4: (lv_value_5_0= ruleLiteral )
            // InternalAadlV3.g:986:5: lv_value_5_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConstantDefAccess().getValueLiteralParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_value_5_0=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConstantDefRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_5_0,
              						"org.osate.xtext.aadlv3.AadlV3.Literal");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getConstantDefAccess().getSemicolonKeyword_6());
              		
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
    // InternalAadlV3.g:1011:1: entryRulePropertyAssociation returns [EObject current=null] : iv_rulePropertyAssociation= rulePropertyAssociation EOF ;
    public final EObject entryRulePropertyAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyAssociation = null;


        try {
            // InternalAadlV3.g:1011:60: (iv_rulePropertyAssociation= rulePropertyAssociation EOF )
            // InternalAadlV3.g:1012:2: iv_rulePropertyAssociation= rulePropertyAssociation EOF
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
    // InternalAadlV3.g:1018:1: rulePropertyAssociation returns [EObject current=null] : ( ( (lv_target_0_0= ruleModelElementReference ) )? otherlv_1= '#' ( ( ruleQualifiedName ) ) ( (lv_propertyAssociationType_3_0= rulePropertyAssociationType ) ) ( (lv_value_4_0= ruleLiteral ) ) otherlv_5= ';' ) ;
    public final EObject rulePropertyAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_target_0_0 = null;

        AntlrDatatypeRuleToken lv_propertyAssociationType_3_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1024:2: ( ( ( (lv_target_0_0= ruleModelElementReference ) )? otherlv_1= '#' ( ( ruleQualifiedName ) ) ( (lv_propertyAssociationType_3_0= rulePropertyAssociationType ) ) ( (lv_value_4_0= ruleLiteral ) ) otherlv_5= ';' ) )
            // InternalAadlV3.g:1025:2: ( ( (lv_target_0_0= ruleModelElementReference ) )? otherlv_1= '#' ( ( ruleQualifiedName ) ) ( (lv_propertyAssociationType_3_0= rulePropertyAssociationType ) ) ( (lv_value_4_0= ruleLiteral ) ) otherlv_5= ';' )
            {
            // InternalAadlV3.g:1025:2: ( ( (lv_target_0_0= ruleModelElementReference ) )? otherlv_1= '#' ( ( ruleQualifiedName ) ) ( (lv_propertyAssociationType_3_0= rulePropertyAssociationType ) ) ( (lv_value_4_0= ruleLiteral ) ) otherlv_5= ';' )
            // InternalAadlV3.g:1026:3: ( (lv_target_0_0= ruleModelElementReference ) )? otherlv_1= '#' ( ( ruleQualifiedName ) ) ( (lv_propertyAssociationType_3_0= rulePropertyAssociationType ) ) ( (lv_value_4_0= ruleLiteral ) ) otherlv_5= ';'
            {
            // InternalAadlV3.g:1026:3: ( (lv_target_0_0= ruleModelElementReference ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAadlV3.g:1027:4: (lv_target_0_0= ruleModelElementReference )
                    {
                    // InternalAadlV3.g:1027:4: (lv_target_0_0= ruleModelElementReference )
                    // InternalAadlV3.g:1028:5: lv_target_0_0= ruleModelElementReference
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getPropertyAssociationAccess().getTargetModelElementReferenceParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_32);
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

            otherlv_1=(Token)match(input,32,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPropertyAssociationAccess().getNumberSignKeyword_1());
              		
            }
            // InternalAadlV3.g:1049:3: ( ( ruleQualifiedName ) )
            // InternalAadlV3.g:1050:4: ( ruleQualifiedName )
            {
            // InternalAadlV3.g:1050:4: ( ruleQualifiedName )
            // InternalAadlV3.g:1051:5: ruleQualifiedName
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
            pushFollow(FOLLOW_33);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:1068:3: ( (lv_propertyAssociationType_3_0= rulePropertyAssociationType ) )
            // InternalAadlV3.g:1069:4: (lv_propertyAssociationType_3_0= rulePropertyAssociationType )
            {
            // InternalAadlV3.g:1069:4: (lv_propertyAssociationType_3_0= rulePropertyAssociationType )
            // InternalAadlV3.g:1070:5: lv_propertyAssociationType_3_0= rulePropertyAssociationType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPropertyAssociationAccess().getPropertyAssociationTypePropertyAssociationTypeParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_31);
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

            // InternalAadlV3.g:1087:3: ( (lv_value_4_0= ruleLiteral ) )
            // InternalAadlV3.g:1088:4: (lv_value_4_0= ruleLiteral )
            {
            // InternalAadlV3.g:1088:4: (lv_value_4_0= ruleLiteral )
            // InternalAadlV3.g:1089:5: lv_value_4_0= ruleLiteral
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
    // InternalAadlV3.g:1114:1: entryRulePropertyAssociationType returns [String current=null] : iv_rulePropertyAssociationType= rulePropertyAssociationType EOF ;
    public final String entryRulePropertyAssociationType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropertyAssociationType = null;


        try {
            // InternalAadlV3.g:1114:63: (iv_rulePropertyAssociationType= rulePropertyAssociationType EOF )
            // InternalAadlV3.g:1115:2: iv_rulePropertyAssociationType= rulePropertyAssociationType EOF
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
    // InternalAadlV3.g:1121:1: rulePropertyAssociationType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=>' | kw= '=' | kw= '*=>' ) ;
    public final AntlrDatatypeRuleToken rulePropertyAssociationType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:1127:2: ( (kw= '=>' | kw= '=' | kw= '*=>' ) )
            // InternalAadlV3.g:1128:2: (kw= '=>' | kw= '=' | kw= '*=>' )
            {
            // InternalAadlV3.g:1128:2: (kw= '=>' | kw= '=' | kw= '*=>' )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt23=1;
                }
                break;
            case 34:
                {
                alt23=2;
                }
                break;
            case 35:
                {
                alt23=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalAadlV3.g:1129:3: kw= '=>'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPropertyAssociationTypeAccess().getEqualsSignGreaterThanSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:1135:3: kw= '='
                    {
                    kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPropertyAssociationTypeAccess().getEqualsSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:1141:3: kw= '*=>'
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
    // InternalAadlV3.g:1150:1: entryRuleModelElementReference returns [EObject current=null] : iv_ruleModelElementReference= ruleModelElementReference EOF ;
    public final EObject entryRuleModelElementReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelElementReference = null;


        try {
            // InternalAadlV3.g:1150:62: (iv_ruleModelElementReference= ruleModelElementReference EOF )
            // InternalAadlV3.g:1151:2: iv_ruleModelElementReference= ruleModelElementReference EOF
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
    // InternalAadlV3.g:1157:1: ruleModelElementReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( '.' )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* ) ;
    public final EObject ruleModelElementReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAadlV3.g:1163:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( '.' )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* ) )
            // InternalAadlV3.g:1164:2: ( ( (otherlv_0= RULE_ID ) ) ( ( '.' )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )
            {
            // InternalAadlV3.g:1164:2: ( ( (otherlv_0= RULE_ID ) ) ( ( '.' )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )
            // InternalAadlV3.g:1165:3: ( (otherlv_0= RULE_ID ) ) ( ( '.' )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
            {
            // InternalAadlV3.g:1165:3: ( (otherlv_0= RULE_ID ) )
            // InternalAadlV3.g:1166:4: (otherlv_0= RULE_ID )
            {
            // InternalAadlV3.g:1166:4: (otherlv_0= RULE_ID )
            // InternalAadlV3.g:1167:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getModelElementReferenceRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getModelElementReferenceAccess().getElementModelElementCrossReference_0_0());
              				
            }

            }


            }

            // InternalAadlV3.g:1181:3: ( ( '.' )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==36) && (synpred34_InternalAadlV3())) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalAadlV3.g:1182:4: ( '.' )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // InternalAadlV3.g:1183:4: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    // InternalAadlV3.g:1184:5: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalAadlV3.g:1184:5: ()
            	    // InternalAadlV3.g:1185:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						/* */
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getModelElementReferenceAccess().getNamedElementReferenceContextAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,36,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getModelElementReferenceAccess().getFullStopKeyword_1_0_1());
            	      				
            	    }
            	    // InternalAadlV3.g:1198:5: ( (otherlv_3= RULE_ID ) )
            	    // InternalAadlV3.g:1199:6: (otherlv_3= RULE_ID )
            	    {
            	    // InternalAadlV3.g:1199:6: (otherlv_3= RULE_ID )
            	    // InternalAadlV3.g:1200:7: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							/* */
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getModelElementReferenceRule());
            	      							}
            	      						
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_3, grammarAccess.getModelElementReferenceAccess().getElementModelElementCrossReference_1_0_2_0());
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
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


    // $ANTLR start "entryRuleNamedElementReference"
    // InternalAadlV3.g:1220:1: entryRuleNamedElementReference returns [EObject current=null] : iv_ruleNamedElementReference= ruleNamedElementReference EOF ;
    public final EObject entryRuleNamedElementReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedElementReference = null;


        try {
            // InternalAadlV3.g:1220:62: (iv_ruleNamedElementReference= ruleNamedElementReference EOF )
            // InternalAadlV3.g:1221:2: iv_ruleNamedElementReference= ruleNamedElementReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNamedElementReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNamedElementReference=ruleNamedElementReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNamedElementReference; 
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
    // $ANTLR end "entryRuleNamedElementReference"


    // $ANTLR start "ruleNamedElementReference"
    // InternalAadlV3.g:1227:1: ruleNamedElementReference returns [EObject current=null] : ( ( ( ruleQualifiedReference ) ) ( ( '.' )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* ) ;
    public final EObject ruleNamedElementReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAadlV3.g:1233:2: ( ( ( ( ruleQualifiedReference ) ) ( ( '.' )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* ) )
            // InternalAadlV3.g:1234:2: ( ( ( ruleQualifiedReference ) ) ( ( '.' )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )
            {
            // InternalAadlV3.g:1234:2: ( ( ( ruleQualifiedReference ) ) ( ( '.' )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )
            // InternalAadlV3.g:1235:3: ( ( ruleQualifiedReference ) ) ( ( '.' )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
            {
            // InternalAadlV3.g:1235:3: ( ( ruleQualifiedReference ) )
            // InternalAadlV3.g:1236:4: ( ruleQualifiedReference )
            {
            // InternalAadlV3.g:1236:4: ( ruleQualifiedReference )
            // InternalAadlV3.g:1237:5: ruleQualifiedReference
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getNamedElementReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNamedElementReferenceAccess().getElementNamedElementCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_34);
            ruleQualifiedReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:1254:3: ( ( '.' )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==36) && (synpred35_InternalAadlV3())) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalAadlV3.g:1255:4: ( '.' )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // InternalAadlV3.g:1256:4: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    // InternalAadlV3.g:1257:5: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalAadlV3.g:1257:5: ()
            	    // InternalAadlV3.g:1258:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						/* */
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getNamedElementReferenceAccess().getNamedElementReferenceContextAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,36,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getNamedElementReferenceAccess().getFullStopKeyword_1_0_1());
            	      				
            	    }
            	    // InternalAadlV3.g:1271:5: ( (otherlv_3= RULE_ID ) )
            	    // InternalAadlV3.g:1272:6: (otherlv_3= RULE_ID )
            	    {
            	    // InternalAadlV3.g:1272:6: (otherlv_3= RULE_ID )
            	    // InternalAadlV3.g:1273:7: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							/* */
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getNamedElementReferenceRule());
            	      							}
            	      						
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_3, grammarAccess.getNamedElementReferenceAccess().getElementModelElementCrossReference_1_0_2_0());
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // $ANTLR end "ruleNamedElementReference"


    // $ANTLR start "entryRuleComponentInterface"
    // InternalAadlV3.g:1293:1: entryRuleComponentInterface returns [EObject current=null] : iv_ruleComponentInterface= ruleComponentInterface EOF ;
    public final EObject entryRuleComponentInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentInterface = null;


        try {
            // InternalAadlV3.g:1293:59: (iv_ruleComponentInterface= ruleComponentInterface EOF )
            // InternalAadlV3.g:1294:2: iv_ruleComponentInterface= ruleComponentInterface EOF
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
    // InternalAadlV3.g:1300:1: ruleComponentInterface returns [EObject current=null] : ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_private_1_0= 'private' ) )? ( (lv_category_2_0= ruleComponentCategory ) )? otherlv_3= 'interface' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' this_InterfaceExtensions_6= ruleInterfaceExtensions[$current] )? this_InterfaceBody_7= ruleInterfaceBody[$current] otherlv_8= ';' ) ;
    public final EObject ruleComponentInterface() throws RecognitionException {
        EObject current = null;

        Token lv_private_1_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject this_Annotation_0 = null;

        AntlrDatatypeRuleToken lv_category_2_0 = null;

        EObject this_InterfaceExtensions_6 = null;

        EObject this_InterfaceBody_7 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1306:2: ( ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_private_1_0= 'private' ) )? ( (lv_category_2_0= ruleComponentCategory ) )? otherlv_3= 'interface' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' this_InterfaceExtensions_6= ruleInterfaceExtensions[$current] )? this_InterfaceBody_7= ruleInterfaceBody[$current] otherlv_8= ';' ) )
            // InternalAadlV3.g:1307:2: ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_private_1_0= 'private' ) )? ( (lv_category_2_0= ruleComponentCategory ) )? otherlv_3= 'interface' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' this_InterfaceExtensions_6= ruleInterfaceExtensions[$current] )? this_InterfaceBody_7= ruleInterfaceBody[$current] otherlv_8= ';' )
            {
            // InternalAadlV3.g:1307:2: ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_private_1_0= 'private' ) )? ( (lv_category_2_0= ruleComponentCategory ) )? otherlv_3= 'interface' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' this_InterfaceExtensions_6= ruleInterfaceExtensions[$current] )? this_InterfaceBody_7= ruleInterfaceBody[$current] otherlv_8= ';' )
            // InternalAadlV3.g:1308:3: (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_private_1_0= 'private' ) )? ( (lv_category_2_0= ruleComponentCategory ) )? otherlv_3= 'interface' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' this_InterfaceExtensions_6= ruleInterfaceExtensions[$current] )? this_InterfaceBody_7= ruleInterfaceBody[$current] otherlv_8= ';'
            {
            // InternalAadlV3.g:1308:3: (this_Annotation_0= ruleAnnotation[$current] )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==18) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalAadlV3.g:1309:4: this_Annotation_0= ruleAnnotation[$current]
            	    {
            	    if ( state.backtracking==0 ) {

            	      				/* */
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElement(grammarAccess.getComponentInterfaceRule());
            	      				}
            	      				newCompositeNode(grammarAccess.getComponentInterfaceAccess().getAnnotationParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_35);
            	    this_Annotation_0=ruleAnnotation(current);

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current = this_Annotation_0;
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // InternalAadlV3.g:1324:3: ( (lv_private_1_0= 'private' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==13) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAadlV3.g:1325:4: (lv_private_1_0= 'private' )
                    {
                    // InternalAadlV3.g:1325:4: (lv_private_1_0= 'private' )
                    // InternalAadlV3.g:1326:5: lv_private_1_0= 'private'
                    {
                    lv_private_1_0=(Token)match(input,13,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_private_1_0, grammarAccess.getComponentInterfaceAccess().getPrivatePrivateKeyword_1_0());
                      				
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

            // InternalAadlV3.g:1338:3: ( (lv_category_2_0= ruleComponentCategory ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=62 && LA28_0<=71)||LA28_0==93) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAadlV3.g:1339:4: (lv_category_2_0= ruleComponentCategory )
                    {
                    // InternalAadlV3.g:1339:4: (lv_category_2_0= ruleComponentCategory )
                    // InternalAadlV3.g:1340:5: lv_category_2_0= ruleComponentCategory
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getComponentInterfaceAccess().getCategoryComponentCategoryParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_37);
                    lv_category_2_0=ruleComponentCategory();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                      					}
                      					set(
                      						current,
                      						"category",
                      						lv_category_2_0,
                      						"org.osate.xtext.aadlv3.AadlV3.ComponentCategory");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,37,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getComponentInterfaceAccess().getInterfaceKeyword_3());
              		
            }
            // InternalAadlV3.g:1361:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalAadlV3.g:1362:4: (lv_name_4_0= RULE_ID )
            {
            // InternalAadlV3.g:1362:4: (lv_name_4_0= RULE_ID )
            // InternalAadlV3.g:1363:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getComponentInterfaceAccess().getNameIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getComponentInterfaceRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalAadlV3.g:1379:3: (otherlv_5= 'extends' this_InterfaceExtensions_6= ruleInterfaceExtensions[$current] )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==30) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAadlV3.g:1380:4: otherlv_5= 'extends' this_InterfaceExtensions_6= ruleInterfaceExtensions[$current]
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getComponentInterfaceAccess().getExtendsKeyword_5_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getComponentInterfaceRule());
                      				}
                      				newCompositeNode(grammarAccess.getComponentInterfaceAccess().getInterfaceExtensionsParserRuleCall_5_1());
                      			
                    }
                    pushFollow(FOLLOW_38);
                    this_InterfaceExtensions_6=ruleInterfaceExtensions(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_InterfaceExtensions_6;
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
              			newCompositeNode(grammarAccess.getComponentInterfaceAccess().getInterfaceBodyParserRuleCall_6());
              		
            }
            pushFollow(FOLLOW_9);
            this_InterfaceBody_7=ruleInterfaceBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_InterfaceBody_7;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_8=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getComponentInterfaceAccess().getSemicolonKeyword_7());
              		
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
    // InternalAadlV3.g:1422:1: ruleInterfaceBody[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'is' (this_InterfaceElement_1= ruleInterfaceElement[$current] )* otherlv_2= 'end' ) ;
    public final EObject ruleInterfaceBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_InterfaceElement_1 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1428:2: ( (otherlv_0= 'is' (this_InterfaceElement_1= ruleInterfaceElement[$current] )* otherlv_2= 'end' ) )
            // InternalAadlV3.g:1429:2: (otherlv_0= 'is' (this_InterfaceElement_1= ruleInterfaceElement[$current] )* otherlv_2= 'end' )
            {
            // InternalAadlV3.g:1429:2: (otherlv_0= 'is' (this_InterfaceElement_1= ruleInterfaceElement[$current] )* otherlv_2= 'end' )
            // InternalAadlV3.g:1430:3: otherlv_0= 'is' (this_InterfaceElement_1= ruleInterfaceElement[$current] )* otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInterfaceBodyAccess().getIsKeyword_0());
              		
            }
            // InternalAadlV3.g:1434:3: (this_InterfaceElement_1= ruleInterfaceElement[$current] )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID||LA30_0==18||LA30_0==32) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalAadlV3.g:1435:4: this_InterfaceElement_1= ruleInterfaceElement[$current]
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
            	    pushFollow(FOLLOW_40);
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
            	    break loop30;
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
    // InternalAadlV3.g:1459:1: ruleInterfaceElement[EObject in_current] returns [EObject current=in_current] : ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_stateVariables_1_0= ruleStateVariable ) ) | ( (lv_transitions_2_0= ruleTransitionRule ) ) | ( (lv_rules_3_0= ruleBehaviorRule ) ) | ( (lv_generators_4_0= ruleGenerator ) ) | ( (lv_ownedPropertyAssociations_5_0= rulePropertyAssociation ) ) | ( (lv_annexSubclause_6_0= ruleAnnexSubclause ) ) ) ;
    public final EObject ruleInterfaceElement(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_features_0_0 = null;

        EObject lv_stateVariables_1_0 = null;

        EObject lv_transitions_2_0 = null;

        EObject lv_rules_3_0 = null;

        EObject lv_generators_4_0 = null;

        EObject lv_ownedPropertyAssociations_5_0 = null;

        EObject lv_annexSubclause_6_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1465:2: ( ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_stateVariables_1_0= ruleStateVariable ) ) | ( (lv_transitions_2_0= ruleTransitionRule ) ) | ( (lv_rules_3_0= ruleBehaviorRule ) ) | ( (lv_generators_4_0= ruleGenerator ) ) | ( (lv_ownedPropertyAssociations_5_0= rulePropertyAssociation ) ) | ( (lv_annexSubclause_6_0= ruleAnnexSubclause ) ) ) )
            // InternalAadlV3.g:1466:2: ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_stateVariables_1_0= ruleStateVariable ) ) | ( (lv_transitions_2_0= ruleTransitionRule ) ) | ( (lv_rules_3_0= ruleBehaviorRule ) ) | ( (lv_generators_4_0= ruleGenerator ) ) | ( (lv_ownedPropertyAssociations_5_0= rulePropertyAssociation ) ) | ( (lv_annexSubclause_6_0= ruleAnnexSubclause ) ) )
            {
            // InternalAadlV3.g:1466:2: ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_stateVariables_1_0= ruleStateVariable ) ) | ( (lv_transitions_2_0= ruleTransitionRule ) ) | ( (lv_rules_3_0= ruleBehaviorRule ) ) | ( (lv_generators_4_0= ruleGenerator ) ) | ( (lv_ownedPropertyAssociations_5_0= rulePropertyAssociation ) ) | ( (lv_annexSubclause_6_0= ruleAnnexSubclause ) ) )
            int alt31=7;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // InternalAadlV3.g:1467:3: ( (lv_features_0_0= ruleFeature ) )
                    {
                    // InternalAadlV3.g:1467:3: ( (lv_features_0_0= ruleFeature ) )
                    // InternalAadlV3.g:1468:4: (lv_features_0_0= ruleFeature )
                    {
                    // InternalAadlV3.g:1468:4: (lv_features_0_0= ruleFeature )
                    // InternalAadlV3.g:1469:5: lv_features_0_0= ruleFeature
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
                    // InternalAadlV3.g:1487:3: ( (lv_stateVariables_1_0= ruleStateVariable ) )
                    {
                    // InternalAadlV3.g:1487:3: ( (lv_stateVariables_1_0= ruleStateVariable ) )
                    // InternalAadlV3.g:1488:4: (lv_stateVariables_1_0= ruleStateVariable )
                    {
                    // InternalAadlV3.g:1488:4: (lv_stateVariables_1_0= ruleStateVariable )
                    // InternalAadlV3.g:1489:5: lv_stateVariables_1_0= ruleStateVariable
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getInterfaceElementAccess().getStateVariablesStateVariableParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_stateVariables_1_0=ruleStateVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getInterfaceElementRule());
                      					}
                      					add(
                      						current,
                      						"stateVariables",
                      						lv_stateVariables_1_0,
                      						"org.osate.xtext.aadlv3.AadlV3.StateVariable");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:1507:3: ( (lv_transitions_2_0= ruleTransitionRule ) )
                    {
                    // InternalAadlV3.g:1507:3: ( (lv_transitions_2_0= ruleTransitionRule ) )
                    // InternalAadlV3.g:1508:4: (lv_transitions_2_0= ruleTransitionRule )
                    {
                    // InternalAadlV3.g:1508:4: (lv_transitions_2_0= ruleTransitionRule )
                    // InternalAadlV3.g:1509:5: lv_transitions_2_0= ruleTransitionRule
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getInterfaceElementAccess().getTransitionsTransitionRuleParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_transitions_2_0=ruleTransitionRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getInterfaceElementRule());
                      					}
                      					add(
                      						current,
                      						"transitions",
                      						lv_transitions_2_0,
                      						"org.osate.xtext.aadlv3.AadlV3.TransitionRule");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAadlV3.g:1527:3: ( (lv_rules_3_0= ruleBehaviorRule ) )
                    {
                    // InternalAadlV3.g:1527:3: ( (lv_rules_3_0= ruleBehaviorRule ) )
                    // InternalAadlV3.g:1528:4: (lv_rules_3_0= ruleBehaviorRule )
                    {
                    // InternalAadlV3.g:1528:4: (lv_rules_3_0= ruleBehaviorRule )
                    // InternalAadlV3.g:1529:5: lv_rules_3_0= ruleBehaviorRule
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getInterfaceElementAccess().getRulesBehaviorRuleParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_rules_3_0=ruleBehaviorRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getInterfaceElementRule());
                      					}
                      					add(
                      						current,
                      						"rules",
                      						lv_rules_3_0,
                      						"org.osate.xtext.aadlv3.AadlV3.BehaviorRule");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalAadlV3.g:1547:3: ( (lv_generators_4_0= ruleGenerator ) )
                    {
                    // InternalAadlV3.g:1547:3: ( (lv_generators_4_0= ruleGenerator ) )
                    // InternalAadlV3.g:1548:4: (lv_generators_4_0= ruleGenerator )
                    {
                    // InternalAadlV3.g:1548:4: (lv_generators_4_0= ruleGenerator )
                    // InternalAadlV3.g:1549:5: lv_generators_4_0= ruleGenerator
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getInterfaceElementAccess().getGeneratorsGeneratorParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_generators_4_0=ruleGenerator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getInterfaceElementRule());
                      					}
                      					add(
                      						current,
                      						"generators",
                      						lv_generators_4_0,
                      						"org.osate.xtext.aadlv3.AadlV3.Generator");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalAadlV3.g:1567:3: ( (lv_ownedPropertyAssociations_5_0= rulePropertyAssociation ) )
                    {
                    // InternalAadlV3.g:1567:3: ( (lv_ownedPropertyAssociations_5_0= rulePropertyAssociation ) )
                    // InternalAadlV3.g:1568:4: (lv_ownedPropertyAssociations_5_0= rulePropertyAssociation )
                    {
                    // InternalAadlV3.g:1568:4: (lv_ownedPropertyAssociations_5_0= rulePropertyAssociation )
                    // InternalAadlV3.g:1569:5: lv_ownedPropertyAssociations_5_0= rulePropertyAssociation
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getInterfaceElementAccess().getOwnedPropertyAssociationsPropertyAssociationParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_ownedPropertyAssociations_5_0=rulePropertyAssociation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getInterfaceElementRule());
                      					}
                      					add(
                      						current,
                      						"ownedPropertyAssociations",
                      						lv_ownedPropertyAssociations_5_0,
                      						"org.osate.xtext.aadlv3.AadlV3.PropertyAssociation");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalAadlV3.g:1587:3: ( (lv_annexSubclause_6_0= ruleAnnexSubclause ) )
                    {
                    // InternalAadlV3.g:1587:3: ( (lv_annexSubclause_6_0= ruleAnnexSubclause ) )
                    // InternalAadlV3.g:1588:4: (lv_annexSubclause_6_0= ruleAnnexSubclause )
                    {
                    // InternalAadlV3.g:1588:4: (lv_annexSubclause_6_0= ruleAnnexSubclause )
                    // InternalAadlV3.g:1589:5: lv_annexSubclause_6_0= ruleAnnexSubclause
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getInterfaceElementAccess().getAnnexSubclauseAnnexSubclauseParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_annexSubclause_6_0=ruleAnnexSubclause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getInterfaceElementRule());
                      					}
                      					add(
                      						current,
                      						"annexSubclause",
                      						lv_annexSubclause_6_0,
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
    // InternalAadlV3.g:1610:1: entryRuleComponentImplementation returns [EObject current=null] : iv_ruleComponentImplementation= ruleComponentImplementation EOF ;
    public final EObject entryRuleComponentImplementation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentImplementation = null;


        try {
            // InternalAadlV3.g:1610:64: (iv_ruleComponentImplementation= ruleComponentImplementation EOF )
            // InternalAadlV3.g:1611:2: iv_ruleComponentImplementation= ruleComponentImplementation EOF
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
    // InternalAadlV3.g:1617:1: ruleComponentImplementation returns [EObject current=null] : ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_private_1_0= 'private' ) )? ( (lv_category_2_0= ruleComponentCategory ) ) ( (lv_name_3_0= ruleDottedName ) ) (otherlv_4= 'extends' this_ImplementationExtensions_5= ruleImplementationExtensions[$current] )? this_ImplementationBody_6= ruleImplementationBody[$current] otherlv_7= ';' ) ;
    public final EObject ruleComponentImplementation() throws RecognitionException {
        EObject current = null;

        Token lv_private_1_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject this_Annotation_0 = null;

        AntlrDatatypeRuleToken lv_category_2_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject this_ImplementationExtensions_5 = null;

        EObject this_ImplementationBody_6 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1623:2: ( ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_private_1_0= 'private' ) )? ( (lv_category_2_0= ruleComponentCategory ) ) ( (lv_name_3_0= ruleDottedName ) ) (otherlv_4= 'extends' this_ImplementationExtensions_5= ruleImplementationExtensions[$current] )? this_ImplementationBody_6= ruleImplementationBody[$current] otherlv_7= ';' ) )
            // InternalAadlV3.g:1624:2: ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_private_1_0= 'private' ) )? ( (lv_category_2_0= ruleComponentCategory ) ) ( (lv_name_3_0= ruleDottedName ) ) (otherlv_4= 'extends' this_ImplementationExtensions_5= ruleImplementationExtensions[$current] )? this_ImplementationBody_6= ruleImplementationBody[$current] otherlv_7= ';' )
            {
            // InternalAadlV3.g:1624:2: ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_private_1_0= 'private' ) )? ( (lv_category_2_0= ruleComponentCategory ) ) ( (lv_name_3_0= ruleDottedName ) ) (otherlv_4= 'extends' this_ImplementationExtensions_5= ruleImplementationExtensions[$current] )? this_ImplementationBody_6= ruleImplementationBody[$current] otherlv_7= ';' )
            // InternalAadlV3.g:1625:3: (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_private_1_0= 'private' ) )? ( (lv_category_2_0= ruleComponentCategory ) ) ( (lv_name_3_0= ruleDottedName ) ) (otherlv_4= 'extends' this_ImplementationExtensions_5= ruleImplementationExtensions[$current] )? this_ImplementationBody_6= ruleImplementationBody[$current] otherlv_7= ';'
            {
            // InternalAadlV3.g:1625:3: (this_Annotation_0= ruleAnnotation[$current] )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==18) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalAadlV3.g:1626:4: this_Annotation_0= ruleAnnotation[$current]
            	    {
            	    if ( state.backtracking==0 ) {

            	      				/* */
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElement(grammarAccess.getComponentImplementationRule());
            	      				}
            	      				newCompositeNode(grammarAccess.getComponentImplementationAccess().getAnnotationParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_41);
            	    this_Annotation_0=ruleAnnotation(current);

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current = this_Annotation_0;
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            // InternalAadlV3.g:1641:3: ( (lv_private_1_0= 'private' ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==13) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAadlV3.g:1642:4: (lv_private_1_0= 'private' )
                    {
                    // InternalAadlV3.g:1642:4: (lv_private_1_0= 'private' )
                    // InternalAadlV3.g:1643:5: lv_private_1_0= 'private'
                    {
                    lv_private_1_0=(Token)match(input,13,FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_private_1_0, grammarAccess.getComponentImplementationAccess().getPrivatePrivateKeyword_1_0());
                      				
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

            // InternalAadlV3.g:1655:3: ( (lv_category_2_0= ruleComponentCategory ) )
            // InternalAadlV3.g:1656:4: (lv_category_2_0= ruleComponentCategory )
            {
            // InternalAadlV3.g:1656:4: (lv_category_2_0= ruleComponentCategory )
            // InternalAadlV3.g:1657:5: lv_category_2_0= ruleComponentCategory
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComponentImplementationAccess().getCategoryComponentCategoryParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_category_2_0=ruleComponentCategory();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getComponentImplementationRule());
              					}
              					set(
              						current,
              						"category",
              						lv_category_2_0,
              						"org.osate.xtext.aadlv3.AadlV3.ComponentCategory");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:1674:3: ( (lv_name_3_0= ruleDottedName ) )
            // InternalAadlV3.g:1675:4: (lv_name_3_0= ruleDottedName )
            {
            // InternalAadlV3.g:1675:4: (lv_name_3_0= ruleDottedName )
            // InternalAadlV3.g:1676:5: lv_name_3_0= ruleDottedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComponentImplementationAccess().getNameDottedNameParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_38);
            lv_name_3_0=ruleDottedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getComponentImplementationRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_3_0,
              						"org.osate.xtext.aadlv3.AadlV3.DottedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:1693:3: (otherlv_4= 'extends' this_ImplementationExtensions_5= ruleImplementationExtensions[$current] )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==30) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAadlV3.g:1694:4: otherlv_4= 'extends' this_ImplementationExtensions_5= ruleImplementationExtensions[$current]
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getComponentImplementationAccess().getExtendsKeyword_4_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getComponentImplementationRule());
                      				}
                      				newCompositeNode(grammarAccess.getComponentImplementationAccess().getImplementationExtensionsParserRuleCall_4_1());
                      			
                    }
                    pushFollow(FOLLOW_38);
                    this_ImplementationExtensions_5=ruleImplementationExtensions(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ImplementationExtensions_5;
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
              			newCompositeNode(grammarAccess.getComponentImplementationAccess().getImplementationBodyParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_9);
            this_ImplementationBody_6=ruleImplementationBody(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ImplementationBody_6;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_7=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getComponentImplementationAccess().getSemicolonKeyword_6());
              		
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
    // InternalAadlV3.g:1736:1: ruleImplementationBody[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'is' (this_ImplementationElement_1= ruleImplementationElement[$current] )* otherlv_2= 'end' ) ;
    public final EObject ruleImplementationBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_ImplementationElement_1 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1742:2: ( (otherlv_0= 'is' (this_ImplementationElement_1= ruleImplementationElement[$current] )* otherlv_2= 'end' ) )
            // InternalAadlV3.g:1743:2: (otherlv_0= 'is' (this_ImplementationElement_1= ruleImplementationElement[$current] )* otherlv_2= 'end' )
            {
            // InternalAadlV3.g:1743:2: (otherlv_0= 'is' (this_ImplementationElement_1= ruleImplementationElement[$current] )* otherlv_2= 'end' )
            // InternalAadlV3.g:1744:3: otherlv_0= 'is' (this_ImplementationElement_1= ruleImplementationElement[$current] )* otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImplementationBodyAccess().getIsKeyword_0());
              		
            }
            // InternalAadlV3.g:1748:3: (this_ImplementationElement_1= ruleImplementationElement[$current] )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID||LA35_0==18||LA35_0==25||LA35_0==32) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalAadlV3.g:1749:4: this_ImplementationElement_1= ruleImplementationElement[$current]
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
            	    pushFollow(FOLLOW_43);
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
            	    break loop35;
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
    // InternalAadlV3.g:1773:1: ruleImplementationElement[EObject in_current] returns [EObject current=in_current] : ( ( (lv_connections_0_0= ruleConnection ) ) | ( (lv_bindings_1_0= ruleBinding ) ) | ( (lv_components_2_0= ruleSubcomponent ) ) | ( (lv_paths_3_0= ruleEndToEndFlow ) ) | ( (lv_flowAssignments_4_0= ruleFlowAssignment ) ) | ( (lv_classifierAssignments_5_0= ruleClassifierAssignment ) ) | ( (lv_classifierAssignments_6_0= ruleClassifierAssignmentPattern ) ) | ( (lv_stateVariables_7_0= ruleStateVariable ) ) | ( (lv_transitions_8_0= ruleTransitionRule ) ) | ( (lv_rules_9_0= ruleBehaviorRule ) ) | ( (lv_generators_10_0= ruleGenerator ) ) | ( (lv_ownedPropertyAssociations_11_0= rulePropertyAssociation ) ) | ( (lv_annexSubclause_12_0= ruleAnnexSubclause ) ) ) ;
    public final EObject ruleImplementationElement(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_connections_0_0 = null;

        EObject lv_bindings_1_0 = null;

        EObject lv_components_2_0 = null;

        EObject lv_paths_3_0 = null;

        EObject lv_flowAssignments_4_0 = null;

        EObject lv_classifierAssignments_5_0 = null;

        EObject lv_classifierAssignments_6_0 = null;

        EObject lv_stateVariables_7_0 = null;

        EObject lv_transitions_8_0 = null;

        EObject lv_rules_9_0 = null;

        EObject lv_generators_10_0 = null;

        EObject lv_ownedPropertyAssociations_11_0 = null;

        EObject lv_annexSubclause_12_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:1779:2: ( ( ( (lv_connections_0_0= ruleConnection ) ) | ( (lv_bindings_1_0= ruleBinding ) ) | ( (lv_components_2_0= ruleSubcomponent ) ) | ( (lv_paths_3_0= ruleEndToEndFlow ) ) | ( (lv_flowAssignments_4_0= ruleFlowAssignment ) ) | ( (lv_classifierAssignments_5_0= ruleClassifierAssignment ) ) | ( (lv_classifierAssignments_6_0= ruleClassifierAssignmentPattern ) ) | ( (lv_stateVariables_7_0= ruleStateVariable ) ) | ( (lv_transitions_8_0= ruleTransitionRule ) ) | ( (lv_rules_9_0= ruleBehaviorRule ) ) | ( (lv_generators_10_0= ruleGenerator ) ) | ( (lv_ownedPropertyAssociations_11_0= rulePropertyAssociation ) ) | ( (lv_annexSubclause_12_0= ruleAnnexSubclause ) ) ) )
            // InternalAadlV3.g:1780:2: ( ( (lv_connections_0_0= ruleConnection ) ) | ( (lv_bindings_1_0= ruleBinding ) ) | ( (lv_components_2_0= ruleSubcomponent ) ) | ( (lv_paths_3_0= ruleEndToEndFlow ) ) | ( (lv_flowAssignments_4_0= ruleFlowAssignment ) ) | ( (lv_classifierAssignments_5_0= ruleClassifierAssignment ) ) | ( (lv_classifierAssignments_6_0= ruleClassifierAssignmentPattern ) ) | ( (lv_stateVariables_7_0= ruleStateVariable ) ) | ( (lv_transitions_8_0= ruleTransitionRule ) ) | ( (lv_rules_9_0= ruleBehaviorRule ) ) | ( (lv_generators_10_0= ruleGenerator ) ) | ( (lv_ownedPropertyAssociations_11_0= rulePropertyAssociation ) ) | ( (lv_annexSubclause_12_0= ruleAnnexSubclause ) ) )
            {
            // InternalAadlV3.g:1780:2: ( ( (lv_connections_0_0= ruleConnection ) ) | ( (lv_bindings_1_0= ruleBinding ) ) | ( (lv_components_2_0= ruleSubcomponent ) ) | ( (lv_paths_3_0= ruleEndToEndFlow ) ) | ( (lv_flowAssignments_4_0= ruleFlowAssignment ) ) | ( (lv_classifierAssignments_5_0= ruleClassifierAssignment ) ) | ( (lv_classifierAssignments_6_0= ruleClassifierAssignmentPattern ) ) | ( (lv_stateVariables_7_0= ruleStateVariable ) ) | ( (lv_transitions_8_0= ruleTransitionRule ) ) | ( (lv_rules_9_0= ruleBehaviorRule ) ) | ( (lv_generators_10_0= ruleGenerator ) ) | ( (lv_ownedPropertyAssociations_11_0= rulePropertyAssociation ) ) | ( (lv_annexSubclause_12_0= ruleAnnexSubclause ) ) )
            int alt36=13;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // InternalAadlV3.g:1781:3: ( (lv_connections_0_0= ruleConnection ) )
                    {
                    // InternalAadlV3.g:1781:3: ( (lv_connections_0_0= ruleConnection ) )
                    // InternalAadlV3.g:1782:4: (lv_connections_0_0= ruleConnection )
                    {
                    // InternalAadlV3.g:1782:4: (lv_connections_0_0= ruleConnection )
                    // InternalAadlV3.g:1783:5: lv_connections_0_0= ruleConnection
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
                    // InternalAadlV3.g:1801:3: ( (lv_bindings_1_0= ruleBinding ) )
                    {
                    // InternalAadlV3.g:1801:3: ( (lv_bindings_1_0= ruleBinding ) )
                    // InternalAadlV3.g:1802:4: (lv_bindings_1_0= ruleBinding )
                    {
                    // InternalAadlV3.g:1802:4: (lv_bindings_1_0= ruleBinding )
                    // InternalAadlV3.g:1803:5: lv_bindings_1_0= ruleBinding
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
                    // InternalAadlV3.g:1821:3: ( (lv_components_2_0= ruleSubcomponent ) )
                    {
                    // InternalAadlV3.g:1821:3: ( (lv_components_2_0= ruleSubcomponent ) )
                    // InternalAadlV3.g:1822:4: (lv_components_2_0= ruleSubcomponent )
                    {
                    // InternalAadlV3.g:1822:4: (lv_components_2_0= ruleSubcomponent )
                    // InternalAadlV3.g:1823:5: lv_components_2_0= ruleSubcomponent
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
                    // InternalAadlV3.g:1841:3: ( (lv_paths_3_0= ruleEndToEndFlow ) )
                    {
                    // InternalAadlV3.g:1841:3: ( (lv_paths_3_0= ruleEndToEndFlow ) )
                    // InternalAadlV3.g:1842:4: (lv_paths_3_0= ruleEndToEndFlow )
                    {
                    // InternalAadlV3.g:1842:4: (lv_paths_3_0= ruleEndToEndFlow )
                    // InternalAadlV3.g:1843:5: lv_paths_3_0= ruleEndToEndFlow
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getImplementationElementAccess().getPathsEndToEndFlowParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_paths_3_0=ruleEndToEndFlow();

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
                      						"org.osate.xtext.aadlv3.AadlV3.EndToEndFlow");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalAadlV3.g:1861:3: ( (lv_flowAssignments_4_0= ruleFlowAssignment ) )
                    {
                    // InternalAadlV3.g:1861:3: ( (lv_flowAssignments_4_0= ruleFlowAssignment ) )
                    // InternalAadlV3.g:1862:4: (lv_flowAssignments_4_0= ruleFlowAssignment )
                    {
                    // InternalAadlV3.g:1862:4: (lv_flowAssignments_4_0= ruleFlowAssignment )
                    // InternalAadlV3.g:1863:5: lv_flowAssignments_4_0= ruleFlowAssignment
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
                    // InternalAadlV3.g:1881:3: ( (lv_classifierAssignments_5_0= ruleClassifierAssignment ) )
                    {
                    // InternalAadlV3.g:1881:3: ( (lv_classifierAssignments_5_0= ruleClassifierAssignment ) )
                    // InternalAadlV3.g:1882:4: (lv_classifierAssignments_5_0= ruleClassifierAssignment )
                    {
                    // InternalAadlV3.g:1882:4: (lv_classifierAssignments_5_0= ruleClassifierAssignment )
                    // InternalAadlV3.g:1883:5: lv_classifierAssignments_5_0= ruleClassifierAssignment
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
                    // InternalAadlV3.g:1901:3: ( (lv_classifierAssignments_6_0= ruleClassifierAssignmentPattern ) )
                    {
                    // InternalAadlV3.g:1901:3: ( (lv_classifierAssignments_6_0= ruleClassifierAssignmentPattern ) )
                    // InternalAadlV3.g:1902:4: (lv_classifierAssignments_6_0= ruleClassifierAssignmentPattern )
                    {
                    // InternalAadlV3.g:1902:4: (lv_classifierAssignments_6_0= ruleClassifierAssignmentPattern )
                    // InternalAadlV3.g:1903:5: lv_classifierAssignments_6_0= ruleClassifierAssignmentPattern
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
                    // InternalAadlV3.g:1921:3: ( (lv_stateVariables_7_0= ruleStateVariable ) )
                    {
                    // InternalAadlV3.g:1921:3: ( (lv_stateVariables_7_0= ruleStateVariable ) )
                    // InternalAadlV3.g:1922:4: (lv_stateVariables_7_0= ruleStateVariable )
                    {
                    // InternalAadlV3.g:1922:4: (lv_stateVariables_7_0= ruleStateVariable )
                    // InternalAadlV3.g:1923:5: lv_stateVariables_7_0= ruleStateVariable
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getImplementationElementAccess().getStateVariablesStateVariableParserRuleCall_7_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_stateVariables_7_0=ruleStateVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getImplementationElementRule());
                      					}
                      					add(
                      						current,
                      						"stateVariables",
                      						lv_stateVariables_7_0,
                      						"org.osate.xtext.aadlv3.AadlV3.StateVariable");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalAadlV3.g:1941:3: ( (lv_transitions_8_0= ruleTransitionRule ) )
                    {
                    // InternalAadlV3.g:1941:3: ( (lv_transitions_8_0= ruleTransitionRule ) )
                    // InternalAadlV3.g:1942:4: (lv_transitions_8_0= ruleTransitionRule )
                    {
                    // InternalAadlV3.g:1942:4: (lv_transitions_8_0= ruleTransitionRule )
                    // InternalAadlV3.g:1943:5: lv_transitions_8_0= ruleTransitionRule
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getImplementationElementAccess().getTransitionsTransitionRuleParserRuleCall_8_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_transitions_8_0=ruleTransitionRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getImplementationElementRule());
                      					}
                      					add(
                      						current,
                      						"transitions",
                      						lv_transitions_8_0,
                      						"org.osate.xtext.aadlv3.AadlV3.TransitionRule");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalAadlV3.g:1961:3: ( (lv_rules_9_0= ruleBehaviorRule ) )
                    {
                    // InternalAadlV3.g:1961:3: ( (lv_rules_9_0= ruleBehaviorRule ) )
                    // InternalAadlV3.g:1962:4: (lv_rules_9_0= ruleBehaviorRule )
                    {
                    // InternalAadlV3.g:1962:4: (lv_rules_9_0= ruleBehaviorRule )
                    // InternalAadlV3.g:1963:5: lv_rules_9_0= ruleBehaviorRule
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getImplementationElementAccess().getRulesBehaviorRuleParserRuleCall_9_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_rules_9_0=ruleBehaviorRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getImplementationElementRule());
                      					}
                      					add(
                      						current,
                      						"rules",
                      						lv_rules_9_0,
                      						"org.osate.xtext.aadlv3.AadlV3.BehaviorRule");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalAadlV3.g:1981:3: ( (lv_generators_10_0= ruleGenerator ) )
                    {
                    // InternalAadlV3.g:1981:3: ( (lv_generators_10_0= ruleGenerator ) )
                    // InternalAadlV3.g:1982:4: (lv_generators_10_0= ruleGenerator )
                    {
                    // InternalAadlV3.g:1982:4: (lv_generators_10_0= ruleGenerator )
                    // InternalAadlV3.g:1983:5: lv_generators_10_0= ruleGenerator
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getImplementationElementAccess().getGeneratorsGeneratorParserRuleCall_10_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_generators_10_0=ruleGenerator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getImplementationElementRule());
                      					}
                      					add(
                      						current,
                      						"generators",
                      						lv_generators_10_0,
                      						"org.osate.xtext.aadlv3.AadlV3.Generator");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 12 :
                    // InternalAadlV3.g:2001:3: ( (lv_ownedPropertyAssociations_11_0= rulePropertyAssociation ) )
                    {
                    // InternalAadlV3.g:2001:3: ( (lv_ownedPropertyAssociations_11_0= rulePropertyAssociation ) )
                    // InternalAadlV3.g:2002:4: (lv_ownedPropertyAssociations_11_0= rulePropertyAssociation )
                    {
                    // InternalAadlV3.g:2002:4: (lv_ownedPropertyAssociations_11_0= rulePropertyAssociation )
                    // InternalAadlV3.g:2003:5: lv_ownedPropertyAssociations_11_0= rulePropertyAssociation
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getImplementationElementAccess().getOwnedPropertyAssociationsPropertyAssociationParserRuleCall_11_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_ownedPropertyAssociations_11_0=rulePropertyAssociation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getImplementationElementRule());
                      					}
                      					add(
                      						current,
                      						"ownedPropertyAssociations",
                      						lv_ownedPropertyAssociations_11_0,
                      						"org.osate.xtext.aadlv3.AadlV3.PropertyAssociation");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 13 :
                    // InternalAadlV3.g:2021:3: ( (lv_annexSubclause_12_0= ruleAnnexSubclause ) )
                    {
                    // InternalAadlV3.g:2021:3: ( (lv_annexSubclause_12_0= ruleAnnexSubclause ) )
                    // InternalAadlV3.g:2022:4: (lv_annexSubclause_12_0= ruleAnnexSubclause )
                    {
                    // InternalAadlV3.g:2022:4: (lv_annexSubclause_12_0= ruleAnnexSubclause )
                    // InternalAadlV3.g:2023:5: lv_annexSubclause_12_0= ruleAnnexSubclause
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getImplementationElementAccess().getAnnexSubclauseAnnexSubclauseParserRuleCall_12_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_annexSubclause_12_0=ruleAnnexSubclause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getImplementationElementRule());
                      					}
                      					add(
                      						current,
                      						"annexSubclause",
                      						lv_annexSubclause_12_0,
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
    // InternalAadlV3.g:2044:1: entryRuleComponentConfiguration returns [EObject current=null] : iv_ruleComponentConfiguration= ruleComponentConfiguration EOF ;
    public final EObject entryRuleComponentConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentConfiguration = null;


        try {
            // InternalAadlV3.g:2044:63: (iv_ruleComponentConfiguration= ruleComponentConfiguration EOF )
            // InternalAadlV3.g:2045:2: iv_ruleComponentConfiguration= ruleComponentConfiguration EOF
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
    // InternalAadlV3.g:2051:1: ruleComponentConfiguration returns [EObject current=null] : ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_private_1_0= 'private' ) )? otherlv_2= 'configuration' ( (lv_name_3_0= ruleDottedName ) ) (this_Parameters_4= ruleParameters[$current] )? (otherlv_5= 'extends' this_ConfigurationExtensions_6= ruleConfigurationExtensions[$current] )? this_ConfigurationElementBlock_7= ruleConfigurationElementBlock[$current] otherlv_8= ';' ) ;
    public final EObject ruleComponentConfiguration() throws RecognitionException {
        EObject current = null;

        Token lv_private_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject this_Annotation_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject this_Parameters_4 = null;

        EObject this_ConfigurationExtensions_6 = null;

        EObject this_ConfigurationElementBlock_7 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2057:2: ( ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_private_1_0= 'private' ) )? otherlv_2= 'configuration' ( (lv_name_3_0= ruleDottedName ) ) (this_Parameters_4= ruleParameters[$current] )? (otherlv_5= 'extends' this_ConfigurationExtensions_6= ruleConfigurationExtensions[$current] )? this_ConfigurationElementBlock_7= ruleConfigurationElementBlock[$current] otherlv_8= ';' ) )
            // InternalAadlV3.g:2058:2: ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_private_1_0= 'private' ) )? otherlv_2= 'configuration' ( (lv_name_3_0= ruleDottedName ) ) (this_Parameters_4= ruleParameters[$current] )? (otherlv_5= 'extends' this_ConfigurationExtensions_6= ruleConfigurationExtensions[$current] )? this_ConfigurationElementBlock_7= ruleConfigurationElementBlock[$current] otherlv_8= ';' )
            {
            // InternalAadlV3.g:2058:2: ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_private_1_0= 'private' ) )? otherlv_2= 'configuration' ( (lv_name_3_0= ruleDottedName ) ) (this_Parameters_4= ruleParameters[$current] )? (otherlv_5= 'extends' this_ConfigurationExtensions_6= ruleConfigurationExtensions[$current] )? this_ConfigurationElementBlock_7= ruleConfigurationElementBlock[$current] otherlv_8= ';' )
            // InternalAadlV3.g:2059:3: (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_private_1_0= 'private' ) )? otherlv_2= 'configuration' ( (lv_name_3_0= ruleDottedName ) ) (this_Parameters_4= ruleParameters[$current] )? (otherlv_5= 'extends' this_ConfigurationExtensions_6= ruleConfigurationExtensions[$current] )? this_ConfigurationElementBlock_7= ruleConfigurationElementBlock[$current] otherlv_8= ';'
            {
            // InternalAadlV3.g:2059:3: (this_Annotation_0= ruleAnnotation[$current] )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==18) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalAadlV3.g:2060:4: this_Annotation_0= ruleAnnotation[$current]
            	    {
            	    if ( state.backtracking==0 ) {

            	      				/* */
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElement(grammarAccess.getComponentConfigurationRule());
            	      				}
            	      				newCompositeNode(grammarAccess.getComponentConfigurationAccess().getAnnotationParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_44);
            	    this_Annotation_0=ruleAnnotation(current);

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current = this_Annotation_0;
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            // InternalAadlV3.g:2075:3: ( (lv_private_1_0= 'private' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==13) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalAadlV3.g:2076:4: (lv_private_1_0= 'private' )
                    {
                    // InternalAadlV3.g:2076:4: (lv_private_1_0= 'private' )
                    // InternalAadlV3.g:2077:5: lv_private_1_0= 'private'
                    {
                    lv_private_1_0=(Token)match(input,13,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_private_1_0, grammarAccess.getComponentConfigurationAccess().getPrivatePrivateKeyword_1_0());
                      				
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

            otherlv_2=(Token)match(input,38,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getComponentConfigurationAccess().getConfigurationKeyword_2());
              		
            }
            // InternalAadlV3.g:2093:3: ( (lv_name_3_0= ruleDottedName ) )
            // InternalAadlV3.g:2094:4: (lv_name_3_0= ruleDottedName )
            {
            // InternalAadlV3.g:2094:4: (lv_name_3_0= ruleDottedName )
            // InternalAadlV3.g:2095:5: lv_name_3_0= ruleDottedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComponentConfigurationAccess().getNameDottedNameParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_46);
            lv_name_3_0=ruleDottedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getComponentConfigurationRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_3_0,
              						"org.osate.xtext.aadlv3.AadlV3.DottedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:2112:3: (this_Parameters_4= ruleParameters[$current] )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==24) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalAadlV3.g:2113:4: this_Parameters_4= ruleParameters[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getComponentConfigurationRule());
                      				}
                      				newCompositeNode(grammarAccess.getComponentConfigurationAccess().getParametersParserRuleCall_4());
                      			
                    }
                    pushFollow(FOLLOW_46);
                    this_Parameters_4=ruleParameters(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Parameters_4;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalAadlV3.g:2128:3: (otherlv_5= 'extends' this_ConfigurationExtensions_6= ruleConfigurationExtensions[$current] )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==30) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalAadlV3.g:2129:4: otherlv_5= 'extends' this_ConfigurationExtensions_6= ruleConfigurationExtensions[$current]
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getComponentConfigurationAccess().getExtendsKeyword_5_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getComponentConfigurationRule());
                      				}
                      				newCompositeNode(grammarAccess.getComponentConfigurationAccess().getConfigurationExtensionsParserRuleCall_5_1());
                      			
                    }
                    pushFollow(FOLLOW_46);
                    this_ConfigurationExtensions_6=ruleConfigurationExtensions(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ConfigurationExtensions_6;
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
              			newCompositeNode(grammarAccess.getComponentConfigurationAccess().getConfigurationElementBlockParserRuleCall_6());
              		
            }
            pushFollow(FOLLOW_9);
            this_ConfigurationElementBlock_7=ruleConfigurationElementBlock(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ConfigurationElementBlock_7;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_8=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getComponentConfigurationAccess().getSemicolonKeyword_7());
              		
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
    // InternalAadlV3.g:2170:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalAadlV3.g:2170:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalAadlV3.g:2171:2: iv_ruleFeature= ruleFeature EOF
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
    // InternalAadlV3.g:2177:1: ruleFeature returns [EObject current=null] : ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_category_4_0= ruleFeatureCategory ) ) ( (lv_typeReference_5_0= ruleReversableTypeReference ) )? (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? otherlv_7= ';' ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject this_Annotation_0 = null;

        AntlrDatatypeRuleToken lv_direction_3_0 = null;

        AntlrDatatypeRuleToken lv_category_4_0 = null;

        EObject lv_typeReference_5_0 = null;

        EObject this_PropertiesBlock_6 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2183:2: ( ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_category_4_0= ruleFeatureCategory ) ) ( (lv_typeReference_5_0= ruleReversableTypeReference ) )? (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? otherlv_7= ';' ) )
            // InternalAadlV3.g:2184:2: ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_category_4_0= ruleFeatureCategory ) ) ( (lv_typeReference_5_0= ruleReversableTypeReference ) )? (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? otherlv_7= ';' )
            {
            // InternalAadlV3.g:2184:2: ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_category_4_0= ruleFeatureCategory ) ) ( (lv_typeReference_5_0= ruleReversableTypeReference ) )? (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? otherlv_7= ';' )
            // InternalAadlV3.g:2185:3: (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_category_4_0= ruleFeatureCategory ) ) ( (lv_typeReference_5_0= ruleReversableTypeReference ) )? (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? otherlv_7= ';'
            {
            // InternalAadlV3.g:2185:3: (this_Annotation_0= ruleAnnotation[$current] )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==18) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalAadlV3.g:2186:4: this_Annotation_0= ruleAnnotation[$current]
            	    {
            	    if ( state.backtracking==0 ) {

            	      				/* */
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElement(grammarAccess.getFeatureRule());
            	      				}
            	      				newCompositeNode(grammarAccess.getFeatureAccess().getAnnotationParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_47);
            	    this_Annotation_0=ruleAnnotation(current);

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current = this_Annotation_0;
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            // InternalAadlV3.g:2201:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAadlV3.g:2202:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAadlV3.g:2202:4: (lv_name_1_0= RULE_ID )
            // InternalAadlV3.g:2203:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFeatureRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getColonKeyword_2());
              		
            }
            // InternalAadlV3.g:2223:3: ( (lv_direction_3_0= ruleFeatureDirection ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=76 && LA42_0<=79)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalAadlV3.g:2224:4: (lv_direction_3_0= ruleFeatureDirection )
                    {
                    // InternalAadlV3.g:2224:4: (lv_direction_3_0= ruleFeatureDirection )
                    // InternalAadlV3.g:2225:5: lv_direction_3_0= ruleFeatureDirection
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFeatureAccess().getDirectionFeatureDirectionParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_49);
                    lv_direction_3_0=ruleFeatureDirection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFeatureRule());
                      					}
                      					set(
                      						current,
                      						"direction",
                      						lv_direction_3_0,
                      						"org.osate.xtext.aadlv3.AadlV3.FeatureDirection");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalAadlV3.g:2242:3: ( (lv_category_4_0= ruleFeatureCategory ) )
            // InternalAadlV3.g:2243:4: (lv_category_4_0= ruleFeatureCategory )
            {
            // InternalAadlV3.g:2243:4: (lv_category_4_0= ruleFeatureCategory )
            // InternalAadlV3.g:2244:5: lv_category_4_0= ruleFeatureCategory
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFeatureAccess().getCategoryFeatureCategoryParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_50);
            lv_category_4_0=ruleFeatureCategory();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFeatureRule());
              					}
              					set(
              						current,
              						"category",
              						lv_category_4_0,
              						"org.osate.xtext.aadlv3.AadlV3.FeatureCategory");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:2261:3: ( (lv_typeReference_5_0= ruleReversableTypeReference ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID||LA43_0==46) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalAadlV3.g:2262:4: (lv_typeReference_5_0= ruleReversableTypeReference )
                    {
                    // InternalAadlV3.g:2262:4: (lv_typeReference_5_0= ruleReversableTypeReference )
                    // InternalAadlV3.g:2263:5: lv_typeReference_5_0= ruleReversableTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFeatureAccess().getTypeReferenceReversableTypeReferenceParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_28);
                    lv_typeReference_5_0=ruleReversableTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFeatureRule());
                      					}
                      					set(
                      						current,
                      						"typeReference",
                      						lv_typeReference_5_0,
                      						"org.osate.xtext.aadlv3.AadlV3.ReversableTypeReference");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalAadlV3.g:2280:3: (this_PropertiesBlock_6= rulePropertiesBlock[$current] )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==19) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalAadlV3.g:2281:4: this_PropertiesBlock_6= rulePropertiesBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getFeatureRule());
                      				}
                      				newCompositeNode(grammarAccess.getFeatureAccess().getPropertiesBlockParserRuleCall_6());
                      			
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

              			newLeafNode(otherlv_7, grammarAccess.getFeatureAccess().getSemicolonKeyword_7());
              		
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
    // InternalAadlV3.g:2304:1: entryRuleSubcomponent returns [EObject current=null] : iv_ruleSubcomponent= ruleSubcomponent EOF ;
    public final EObject entryRuleSubcomponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubcomponent = null;


        try {
            // InternalAadlV3.g:2304:53: (iv_ruleSubcomponent= ruleSubcomponent EOF )
            // InternalAadlV3.g:2305:2: iv_ruleSubcomponent= ruleSubcomponent EOF
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
    // InternalAadlV3.g:2311:1: ruleSubcomponent returns [EObject current=null] : ( () (this_Annotation_1= ruleAnnotation[$current] )* ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_category_4_0= ruleComponentCategory ) ) ( ( (lv_typeReferences_5_0= ruleClassifierOrTypeReference ) ) | this_NestedComponentImplementationBlock_6= ruleNestedComponentImplementationBlock[$current] ) (this_InModes_7= ruleInModes[$current] )? otherlv_8= ';' ) ;
    public final EObject ruleSubcomponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_8=null;
        EObject this_Annotation_1 = null;

        AntlrDatatypeRuleToken lv_category_4_0 = null;

        EObject lv_typeReferences_5_0 = null;

        EObject this_NestedComponentImplementationBlock_6 = null;

        EObject this_InModes_7 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2317:2: ( ( () (this_Annotation_1= ruleAnnotation[$current] )* ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_category_4_0= ruleComponentCategory ) ) ( ( (lv_typeReferences_5_0= ruleClassifierOrTypeReference ) ) | this_NestedComponentImplementationBlock_6= ruleNestedComponentImplementationBlock[$current] ) (this_InModes_7= ruleInModes[$current] )? otherlv_8= ';' ) )
            // InternalAadlV3.g:2318:2: ( () (this_Annotation_1= ruleAnnotation[$current] )* ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_category_4_0= ruleComponentCategory ) ) ( ( (lv_typeReferences_5_0= ruleClassifierOrTypeReference ) ) | this_NestedComponentImplementationBlock_6= ruleNestedComponentImplementationBlock[$current] ) (this_InModes_7= ruleInModes[$current] )? otherlv_8= ';' )
            {
            // InternalAadlV3.g:2318:2: ( () (this_Annotation_1= ruleAnnotation[$current] )* ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_category_4_0= ruleComponentCategory ) ) ( ( (lv_typeReferences_5_0= ruleClassifierOrTypeReference ) ) | this_NestedComponentImplementationBlock_6= ruleNestedComponentImplementationBlock[$current] ) (this_InModes_7= ruleInModes[$current] )? otherlv_8= ';' )
            // InternalAadlV3.g:2319:3: () (this_Annotation_1= ruleAnnotation[$current] )* ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_category_4_0= ruleComponentCategory ) ) ( ( (lv_typeReferences_5_0= ruleClassifierOrTypeReference ) ) | this_NestedComponentImplementationBlock_6= ruleNestedComponentImplementationBlock[$current] ) (this_InModes_7= ruleInModes[$current] )? otherlv_8= ';'
            {
            // InternalAadlV3.g:2319:3: ()
            // InternalAadlV3.g:2320:4: 
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

            // InternalAadlV3.g:2329:3: (this_Annotation_1= ruleAnnotation[$current] )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==18) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalAadlV3.g:2330:4: this_Annotation_1= ruleAnnotation[$current]
            	    {
            	    if ( state.backtracking==0 ) {

            	      				/* */
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElement(grammarAccess.getSubcomponentRule());
            	      				}
            	      				newCompositeNode(grammarAccess.getSubcomponentAccess().getAnnotationParserRuleCall_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_47);
            	    this_Annotation_1=ruleAnnotation(current);

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current = this_Annotation_1;
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            // InternalAadlV3.g:2345:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAadlV3.g:2346:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAadlV3.g:2346:4: (lv_name_2_0= RULE_ID )
            // InternalAadlV3.g:2347:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getSubcomponentAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSubcomponentRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSubcomponentAccess().getColonKeyword_3());
              		
            }
            // InternalAadlV3.g:2367:3: ( (lv_category_4_0= ruleComponentCategory ) )
            // InternalAadlV3.g:2368:4: (lv_category_4_0= ruleComponentCategory )
            {
            // InternalAadlV3.g:2368:4: (lv_category_4_0= ruleComponentCategory )
            // InternalAadlV3.g:2369:5: lv_category_4_0= ruleComponentCategory
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSubcomponentAccess().getCategoryComponentCategoryParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_51);
            lv_category_4_0=ruleComponentCategory();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSubcomponentRule());
              					}
              					set(
              						current,
              						"category",
              						lv_category_4_0,
              						"org.osate.xtext.aadlv3.AadlV3.ComponentCategory");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:2386:3: ( ( (lv_typeReferences_5_0= ruleClassifierOrTypeReference ) ) | this_NestedComponentImplementationBlock_6= ruleNestedComponentImplementationBlock[$current] )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID) ) {
                alt46=1;
            }
            else if ( (LA46_0==19) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalAadlV3.g:2387:4: ( (lv_typeReferences_5_0= ruleClassifierOrTypeReference ) )
                    {
                    // InternalAadlV3.g:2387:4: ( (lv_typeReferences_5_0= ruleClassifierOrTypeReference ) )
                    // InternalAadlV3.g:2388:5: (lv_typeReferences_5_0= ruleClassifierOrTypeReference )
                    {
                    // InternalAadlV3.g:2388:5: (lv_typeReferences_5_0= ruleClassifierOrTypeReference )
                    // InternalAadlV3.g:2389:6: lv_typeReferences_5_0= ruleClassifierOrTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSubcomponentAccess().getTypeReferencesClassifierOrTypeReferenceParserRuleCall_5_0_0());
                      					
                    }
                    pushFollow(FOLLOW_52);
                    lv_typeReferences_5_0=ruleClassifierOrTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSubcomponentRule());
                      						}
                      						add(
                      							current,
                      							"typeReferences",
                      							lv_typeReferences_5_0,
                      							"org.osate.xtext.aadlv3.AadlV3.ClassifierOrTypeReference");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:2407:4: this_NestedComponentImplementationBlock_6= ruleNestedComponentImplementationBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getSubcomponentRule());
                      				}
                      				newCompositeNode(grammarAccess.getSubcomponentAccess().getNestedComponentImplementationBlockParserRuleCall_5_1());
                      			
                    }
                    pushFollow(FOLLOW_52);
                    this_NestedComponentImplementationBlock_6=ruleNestedComponentImplementationBlock(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_NestedComponentImplementationBlock_6;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalAadlV3.g:2422:3: (this_InModes_7= ruleInModes[$current] )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==42) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalAadlV3.g:2423:4: this_InModes_7= ruleInModes[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getSubcomponentRule());
                      				}
                      				newCompositeNode(grammarAccess.getSubcomponentAccess().getInModesParserRuleCall_6());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_InModes_7=ruleInModes(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_InModes_7;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getSubcomponentAccess().getSemicolonKeyword_7());
              		
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
    // InternalAadlV3.g:2446:1: entryRuleConnection returns [EObject current=null] : iv_ruleConnection= ruleConnection EOF ;
    public final EObject entryRuleConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnection = null;


        try {
            // InternalAadlV3.g:2446:51: (iv_ruleConnection= ruleConnection EOF )
            // InternalAadlV3.g:2447:2: iv_ruleConnection= ruleConnection EOF
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
    // InternalAadlV3.g:2453:1: ruleConnection returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsConnection ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (otherlv_4= '->' | ( (lv_bidirectional_5_0= '<->' ) ) ) ( (lv_destination_6_0= ruleModelElementReference ) ) (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? (this_InModes_8= ruleInModes[$current] )? otherlv_9= ';' ) ;
    public final EObject ruleConnection() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token lv_bidirectional_5_0=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_associationType_2_0 = null;

        EObject lv_source_3_0 = null;

        EObject lv_destination_6_0 = null;

        EObject this_PropertiesBlock_7 = null;

        EObject this_InModes_8 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2459:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsConnection ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (otherlv_4= '->' | ( (lv_bidirectional_5_0= '<->' ) ) ) ( (lv_destination_6_0= ruleModelElementReference ) ) (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? (this_InModes_8= ruleInModes[$current] )? otherlv_9= ';' ) )
            // InternalAadlV3.g:2460:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsConnection ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (otherlv_4= '->' | ( (lv_bidirectional_5_0= '<->' ) ) ) ( (lv_destination_6_0= ruleModelElementReference ) ) (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? (this_InModes_8= ruleInModes[$current] )? otherlv_9= ';' )
            {
            // InternalAadlV3.g:2460:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsConnection ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (otherlv_4= '->' | ( (lv_bidirectional_5_0= '<->' ) ) ) ( (lv_destination_6_0= ruleModelElementReference ) ) (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? (this_InModes_8= ruleInModes[$current] )? otherlv_9= ';' )
            // InternalAadlV3.g:2461:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_associationType_2_0= ruleIsConnection ) ) ( (lv_source_3_0= ruleModelElementReference ) ) (otherlv_4= '->' | ( (lv_bidirectional_5_0= '<->' ) ) ) ( (lv_destination_6_0= ruleModelElementReference ) ) (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? (this_InModes_8= ruleInModes[$current] )? otherlv_9= ';'
            {
            // InternalAadlV3.g:2461:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:2462:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:2462:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:2463:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,22,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConnectionAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:2483:3: ( (lv_associationType_2_0= ruleIsConnection ) )
            // InternalAadlV3.g:2484:4: (lv_associationType_2_0= ruleIsConnection )
            {
            // InternalAadlV3.g:2484:4: (lv_associationType_2_0= ruleIsConnection )
            // InternalAadlV3.g:2485:5: lv_associationType_2_0= ruleIsConnection
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConnectionAccess().getAssociationTypeIsConnectionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_5);
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

            // InternalAadlV3.g:2502:3: ( (lv_source_3_0= ruleModelElementReference ) )
            // InternalAadlV3.g:2503:4: (lv_source_3_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:2503:4: (lv_source_3_0= ruleModelElementReference )
            // InternalAadlV3.g:2504:5: lv_source_3_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConnectionAccess().getSourceModelElementReferenceParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_54);
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

            // InternalAadlV3.g:2521:3: (otherlv_4= '->' | ( (lv_bidirectional_5_0= '<->' ) ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==39) ) {
                alt48=1;
            }
            else if ( (LA48_0==40) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalAadlV3.g:2522:4: otherlv_4= '->'
                    {
                    otherlv_4=(Token)match(input,39,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getConnectionAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:2527:4: ( (lv_bidirectional_5_0= '<->' ) )
                    {
                    // InternalAadlV3.g:2527:4: ( (lv_bidirectional_5_0= '<->' ) )
                    // InternalAadlV3.g:2528:5: (lv_bidirectional_5_0= '<->' )
                    {
                    // InternalAadlV3.g:2528:5: (lv_bidirectional_5_0= '<->' )
                    // InternalAadlV3.g:2529:6: lv_bidirectional_5_0= '<->'
                    {
                    lv_bidirectional_5_0=(Token)match(input,40,FOLLOW_5); if (state.failed) return current;
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

            // InternalAadlV3.g:2542:3: ( (lv_destination_6_0= ruleModelElementReference ) )
            // InternalAadlV3.g:2543:4: (lv_destination_6_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:2543:4: (lv_destination_6_0= ruleModelElementReference )
            // InternalAadlV3.g:2544:5: lv_destination_6_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConnectionAccess().getDestinationModelElementReferenceParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_55);
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

            // InternalAadlV3.g:2561:3: (this_PropertiesBlock_7= rulePropertiesBlock[$current] )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==19) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalAadlV3.g:2562:4: this_PropertiesBlock_7= rulePropertiesBlock[$current]
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
                    pushFollow(FOLLOW_52);
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

            // InternalAadlV3.g:2577:3: (this_InModes_8= ruleInModes[$current] )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==42) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalAadlV3.g:2578:4: this_InModes_8= ruleInModes[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getConnectionRule());
                      				}
                      				newCompositeNode(grammarAccess.getConnectionAccess().getInModesParserRuleCall_7());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_InModes_8=ruleInModes(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_InModes_8;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getConnectionAccess().getSemicolonKeyword_8());
              		
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
    // InternalAadlV3.g:2601:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalAadlV3.g:2601:48: (iv_ruleBinding= ruleBinding EOF )
            // InternalAadlV3.g:2602:2: iv_ruleBinding= ruleBinding EOF
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
    // InternalAadlV3.g:2608:1: ruleBinding returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) )? ( (lv_associationType_3_0= ruleIsBinding ) ) ( (lv_source_4_0= ruleModelElementReference ) ) otherlv_5= '->' ( (lv_destination_6_0= ruleModelElementReference ) ) (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? (this_InModes_8= ruleInModes[$current] )? otherlv_9= ';' ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_associationType_3_0 = null;

        EObject lv_source_4_0 = null;

        EObject lv_destination_6_0 = null;

        EObject this_PropertiesBlock_7 = null;

        EObject this_InModes_8 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2614:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) )? ( (lv_associationType_3_0= ruleIsBinding ) ) ( (lv_source_4_0= ruleModelElementReference ) ) otherlv_5= '->' ( (lv_destination_6_0= ruleModelElementReference ) ) (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? (this_InModes_8= ruleInModes[$current] )? otherlv_9= ';' ) )
            // InternalAadlV3.g:2615:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) )? ( (lv_associationType_3_0= ruleIsBinding ) ) ( (lv_source_4_0= ruleModelElementReference ) ) otherlv_5= '->' ( (lv_destination_6_0= ruleModelElementReference ) ) (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? (this_InModes_8= ruleInModes[$current] )? otherlv_9= ';' )
            {
            // InternalAadlV3.g:2615:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) )? ( (lv_associationType_3_0= ruleIsBinding ) ) ( (lv_source_4_0= ruleModelElementReference ) ) otherlv_5= '->' ( (lv_destination_6_0= ruleModelElementReference ) ) (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? (this_InModes_8= ruleInModes[$current] )? otherlv_9= ';' )
            // InternalAadlV3.g:2616:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) )? ( (lv_associationType_3_0= ruleIsBinding ) ) ( (lv_source_4_0= ruleModelElementReference ) ) otherlv_5= '->' ( (lv_destination_6_0= ruleModelElementReference ) ) (this_PropertiesBlock_7= rulePropertiesBlock[$current] )? (this_InModes_8= ruleInModes[$current] )? otherlv_9= ';'
            {
            // InternalAadlV3.g:2616:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:2617:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:2617:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:2618:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,22,FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:2638:3: ( ( ruleQualifiedName ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalAadlV3.g:2639:4: ( ruleQualifiedName )
                    {
                    // InternalAadlV3.g:2639:4: ( ruleQualifiedName )
                    // InternalAadlV3.g:2640:5: ruleQualifiedName
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
                    pushFollow(FOLLOW_57);
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

            // InternalAadlV3.g:2657:3: ( (lv_associationType_3_0= ruleIsBinding ) )
            // InternalAadlV3.g:2658:4: (lv_associationType_3_0= ruleIsBinding )
            {
            // InternalAadlV3.g:2658:4: (lv_associationType_3_0= ruleIsBinding )
            // InternalAadlV3.g:2659:5: lv_associationType_3_0= ruleIsBinding
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBindingAccess().getAssociationTypeIsBindingParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_5);
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

            // InternalAadlV3.g:2676:3: ( (lv_source_4_0= ruleModelElementReference ) )
            // InternalAadlV3.g:2677:4: (lv_source_4_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:2677:4: (lv_source_4_0= ruleModelElementReference )
            // InternalAadlV3.g:2678:5: lv_source_4_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBindingAccess().getSourceModelElementReferenceParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_58);
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

            otherlv_5=(Token)match(input,39,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getBindingAccess().getHyphenMinusGreaterThanSignKeyword_5());
              		
            }
            // InternalAadlV3.g:2699:3: ( (lv_destination_6_0= ruleModelElementReference ) )
            // InternalAadlV3.g:2700:4: (lv_destination_6_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:2700:4: (lv_destination_6_0= ruleModelElementReference )
            // InternalAadlV3.g:2701:5: lv_destination_6_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBindingAccess().getDestinationModelElementReferenceParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_55);
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

            // InternalAadlV3.g:2718:3: (this_PropertiesBlock_7= rulePropertiesBlock[$current] )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==19) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalAadlV3.g:2719:4: this_PropertiesBlock_7= rulePropertiesBlock[$current]
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
                    pushFollow(FOLLOW_52);
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

            // InternalAadlV3.g:2734:3: (this_InModes_8= ruleInModes[$current] )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==42) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalAadlV3.g:2735:4: this_InModes_8= ruleInModes[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getBindingRule());
                      				}
                      				newCompositeNode(grammarAccess.getBindingAccess().getInModesParserRuleCall_8());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_InModes_8=ruleInModes(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_InModes_8;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getBindingAccess().getSemicolonKeyword_9());
              		
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


    // $ANTLR start "ruleUseProps"
    // InternalAadlV3.g:2759:1: ruleUseProps[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'use' otherlv_1= 'properties' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleUseProps(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalAadlV3.g:2765:2: ( (otherlv_0= 'use' otherlv_1= 'properties' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ';' ) )
            // InternalAadlV3.g:2766:2: (otherlv_0= 'use' otherlv_1= 'properties' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ';' )
            {
            // InternalAadlV3.g:2766:2: (otherlv_0= 'use' otherlv_1= 'properties' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ';' )
            // InternalAadlV3.g:2767:3: otherlv_0= 'use' otherlv_1= 'properties' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getUsePropsAccess().getUseKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,28,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getUsePropsAccess().getPropertiesKeyword_1());
              		
            }
            // InternalAadlV3.g:2775:3: ( ( ruleQualifiedName ) )
            // InternalAadlV3.g:2776:4: ( ruleQualifiedName )
            {
            // InternalAadlV3.g:2776:4: ( ruleQualifiedName )
            // InternalAadlV3.g:2777:5: ruleQualifiedName
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
            pushFollow(FOLLOW_59);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:2794:3: (otherlv_3= ',' ( ( ruleQualifiedName ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==26) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalAadlV3.g:2795:4: otherlv_3= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_3=(Token)match(input,26,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getUsePropsAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalAadlV3.g:2799:4: ( ( ruleQualifiedName ) )
            	    // InternalAadlV3.g:2800:5: ( ruleQualifiedName )
            	    {
            	    // InternalAadlV3.g:2800:5: ( ruleQualifiedName )
            	    // InternalAadlV3.g:2801:6: ruleQualifiedName
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
            	    pushFollow(FOLLOW_59);
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
            	    break loop54;
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


    // $ANTLR start "ruleInModes"
    // InternalAadlV3.g:2828:1: ruleInModes[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'when' ( (lv_inModes_1_0= ruleModelElementContainsLiteral ) ) ) ;
    public final EObject ruleInModes(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        EObject lv_inModes_1_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2834:2: ( (otherlv_0= 'when' ( (lv_inModes_1_0= ruleModelElementContainsLiteral ) ) ) )
            // InternalAadlV3.g:2835:2: (otherlv_0= 'when' ( (lv_inModes_1_0= ruleModelElementContainsLiteral ) ) )
            {
            // InternalAadlV3.g:2835:2: (otherlv_0= 'when' ( (lv_inModes_1_0= ruleModelElementContainsLiteral ) ) )
            // InternalAadlV3.g:2836:3: otherlv_0= 'when' ( (lv_inModes_1_0= ruleModelElementContainsLiteral ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInModesAccess().getWhenKeyword_0());
              		
            }
            // InternalAadlV3.g:2840:3: ( (lv_inModes_1_0= ruleModelElementContainsLiteral ) )
            // InternalAadlV3.g:2841:4: (lv_inModes_1_0= ruleModelElementContainsLiteral )
            {
            // InternalAadlV3.g:2841:4: (lv_inModes_1_0= ruleModelElementContainsLiteral )
            // InternalAadlV3.g:2842:5: lv_inModes_1_0= ruleModelElementContainsLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInModesAccess().getInModesModelElementContainsLiteralParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_inModes_1_0=ruleModelElementContainsLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getInModesRule());
              					}
              					set(
              						current,
              						"inModes",
              						lv_inModes_1_0,
              						"org.osate.xtext.aadlv3.AadlV3.ModelElementContainsLiteral");
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
    // $ANTLR end "ruleInModes"


    // $ANTLR start "entryRuleEndToEndFlow"
    // InternalAadlV3.g:2863:1: entryRuleEndToEndFlow returns [EObject current=null] : iv_ruleEndToEndFlow= ruleEndToEndFlow EOF ;
    public final EObject entryRuleEndToEndFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndToEndFlow = null;


        try {
            // InternalAadlV3.g:2863:53: (iv_ruleEndToEndFlow= ruleEndToEndFlow EOF )
            // InternalAadlV3.g:2864:2: iv_ruleEndToEndFlow= ruleEndToEndFlow EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEndToEndFlowRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEndToEndFlow=ruleEndToEndFlow();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEndToEndFlow; 
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
    // $ANTLR end "entryRuleEndToEndFlow"


    // $ANTLR start "ruleEndToEndFlow"
    // InternalAadlV3.g:2870:1: ruleEndToEndFlow returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ruleEndToEndFLowKeywords ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+ (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? otherlv_7= ';' ) ;
    public final EObject ruleEndToEndFlow() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_elements_3_0 = null;

        EObject lv_elements_5_0 = null;

        EObject this_PropertiesBlock_6 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:2876:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ruleEndToEndFLowKeywords ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+ (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? otherlv_7= ';' ) )
            // InternalAadlV3.g:2877:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ruleEndToEndFLowKeywords ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+ (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? otherlv_7= ';' )
            {
            // InternalAadlV3.g:2877:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ruleEndToEndFLowKeywords ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+ (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? otherlv_7= ';' )
            // InternalAadlV3.g:2878:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ruleEndToEndFLowKeywords ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+ (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? otherlv_7= ';'
            {
            // InternalAadlV3.g:2878:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:2879:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:2879:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:2880:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getEndToEndFlowAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEndToEndFlowRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEndToEndFlowAccess().getColonKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEndToEndFlowAccess().getEndToEndFLowKeywordsParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_5);
            ruleEndToEndFLowKeywords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAadlV3.g:2910:3: ( (lv_elements_3_0= rulePathElement ) )
            // InternalAadlV3.g:2911:4: (lv_elements_3_0= rulePathElement )
            {
            // InternalAadlV3.g:2911:4: (lv_elements_3_0= rulePathElement )
            // InternalAadlV3.g:2912:5: lv_elements_3_0= rulePathElement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEndToEndFlowAccess().getElementsPathElementParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_58);
            lv_elements_3_0=rulePathElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEndToEndFlowRule());
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

            // InternalAadlV3.g:2929:3: (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )+
            int cnt55=0;
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==39) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalAadlV3.g:2930:4: otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) )
            	    {
            	    otherlv_4=(Token)match(input,39,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getEndToEndFlowAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
            	      			
            	    }
            	    // InternalAadlV3.g:2934:4: ( (lv_elements_5_0= rulePathElement ) )
            	    // InternalAadlV3.g:2935:5: (lv_elements_5_0= rulePathElement )
            	    {
            	    // InternalAadlV3.g:2935:5: (lv_elements_5_0= rulePathElement )
            	    // InternalAadlV3.g:2936:6: lv_elements_5_0= rulePathElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEndToEndFlowAccess().getElementsPathElementParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_60);
            	    lv_elements_5_0=rulePathElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getEndToEndFlowRule());
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
            	    if ( cnt55 >= 1 ) break loop55;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(55, input);
                        throw eee;
                }
                cnt55++;
            } while (true);

            // InternalAadlV3.g:2954:3: (this_PropertiesBlock_6= rulePropertiesBlock[$current] )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==19) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalAadlV3.g:2955:4: this_PropertiesBlock_6= rulePropertiesBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getEndToEndFlowRule());
                      				}
                      				newCompositeNode(grammarAccess.getEndToEndFlowAccess().getPropertiesBlockParserRuleCall_5());
                      			
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

              			newLeafNode(otherlv_7, grammarAccess.getEndToEndFlowAccess().getSemicolonKeyword_6());
              		
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
    // $ANTLR end "ruleEndToEndFlow"


    // $ANTLR start "entryRulePathElement"
    // InternalAadlV3.g:2978:1: entryRulePathElement returns [EObject current=null] : iv_rulePathElement= rulePathElement EOF ;
    public final EObject entryRulePathElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathElement = null;


        try {
            // InternalAadlV3.g:2978:52: (iv_rulePathElement= rulePathElement EOF )
            // InternalAadlV3.g:2979:2: iv_rulePathElement= rulePathElement EOF
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
    // InternalAadlV3.g:2985:1: rulePathElement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* ) ;
    public final EObject rulePathElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAadlV3.g:2991:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* ) )
            // InternalAadlV3.g:2992:2: ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )
            {
            // InternalAadlV3.g:2992:2: ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )
            // InternalAadlV3.g:2993:3: ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
            {
            // InternalAadlV3.g:2993:3: ( (otherlv_0= RULE_ID ) )
            // InternalAadlV3.g:2994:4: (otherlv_0= RULE_ID )
            {
            // InternalAadlV3.g:2994:4: (otherlv_0= RULE_ID )
            // InternalAadlV3.g:2995:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPathElementRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getPathElementAccess().getElementModelElementCrossReference_0_0());
              				
            }

            }


            }

            // InternalAadlV3.g:3009:3: ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==36) && (synpred83_InternalAadlV3())) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalAadlV3.g:3010:4: ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // InternalAadlV3.g:3021:4: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    // InternalAadlV3.g:3022:5: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalAadlV3.g:3022:5: ()
            	    // InternalAadlV3.g:3023:6: 
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

            	    otherlv_2=(Token)match(input,36,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getPathElementAccess().getFullStopKeyword_1_0_1());
            	      				
            	    }
            	    // InternalAadlV3.g:3036:5: ( (otherlv_3= RULE_ID ) )
            	    // InternalAadlV3.g:3037:6: (otherlv_3= RULE_ID )
            	    {
            	    // InternalAadlV3.g:3037:6: (otherlv_3= RULE_ID )
            	    // InternalAadlV3.g:3038:7: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							/* */
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getPathElementRule());
            	      							}
            	      						
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_3, grammarAccess.getPathElementAccess().getElementModelElementCrossReference_1_0_2_0());
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
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
    // InternalAadlV3.g:3058:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalAadlV3.g:3058:47: (iv_ruleImport= ruleImport EOF )
            // InternalAadlV3.g:3059:2: iv_ruleImport= ruleImport EOF
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
    // InternalAadlV3.g:3065:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? otherlv_5= ';' ) ;
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
            // InternalAadlV3.g:3071:2: ( (otherlv_0= 'import' ( ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? otherlv_5= ';' ) )
            // InternalAadlV3.g:3072:2: (otherlv_0= 'import' ( ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? otherlv_5= ';' )
            {
            // InternalAadlV3.g:3072:2: (otherlv_0= 'import' ( ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? otherlv_5= ';' )
            // InternalAadlV3.g:3073:3: otherlv_0= 'import' ( ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
              		
            }
            // InternalAadlV3.g:3077:3: ( ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) )
            int alt58=2;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // InternalAadlV3.g:3078:4: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
                    {
                    // InternalAadlV3.g:3078:4: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
                    // InternalAadlV3.g:3079:5: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
                    {
                    // InternalAadlV3.g:3079:5: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
                    // InternalAadlV3.g:3080:6: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_61);
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
                    // InternalAadlV3.g:3098:4: ( (lv_importedNamespace_2_0= ruleQualifiedName ) )
                    {
                    // InternalAadlV3.g:3098:4: ( (lv_importedNamespace_2_0= ruleQualifiedName ) )
                    // InternalAadlV3.g:3099:5: (lv_importedNamespace_2_0= ruleQualifiedName )
                    {
                    // InternalAadlV3.g:3099:5: (lv_importedNamespace_2_0= ruleQualifiedName )
                    // InternalAadlV3.g:3100:6: lv_importedNamespace_2_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_61);
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

            // InternalAadlV3.g:3118:3: (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==44) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalAadlV3.g:3119:4: otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,44,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getImportAccess().getAsKeyword_2_0());
                      			
                    }
                    // InternalAadlV3.g:3123:4: ( (lv_alias_4_0= RULE_ID ) )
                    // InternalAadlV3.g:3124:5: (lv_alias_4_0= RULE_ID )
                    {
                    // InternalAadlV3.g:3124:5: (lv_alias_4_0= RULE_ID )
                    // InternalAadlV3.g:3125:6: lv_alias_4_0= RULE_ID
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
    // InternalAadlV3.g:3150:1: entryRuleClassifierAssignment returns [EObject current=null] : iv_ruleClassifierAssignment= ruleClassifierAssignment EOF ;
    public final EObject entryRuleClassifierAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierAssignment = null;


        try {
            // InternalAadlV3.g:3150:61: (iv_ruleClassifierAssignment= ruleClassifierAssignment EOF )
            // InternalAadlV3.g:3151:2: iv_ruleClassifierAssignment= ruleClassifierAssignment EOF
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
    // InternalAadlV3.g:3157:1: ruleClassifierAssignment returns [EObject current=null] : ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' ( ( ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) otherlv_7= ';' ) ;
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
            // InternalAadlV3.g:3163:2: ( ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' ( ( ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) otherlv_7= ';' ) )
            // InternalAadlV3.g:3164:2: ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' ( ( ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) otherlv_7= ';' )
            {
            // InternalAadlV3.g:3164:2: ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' ( ( ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) otherlv_7= ';' )
            // InternalAadlV3.g:3165:3: ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' ( ( ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) otherlv_7= ';'
            {
            // InternalAadlV3.g:3165:3: ( (lv_target_0_0= ruleModelElementReference ) )
            // InternalAadlV3.g:3166:4: (lv_target_0_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:3166:4: (lv_target_0_0= ruleModelElementReference )
            // InternalAadlV3.g:3167:5: lv_target_0_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getClassifierAssignmentAccess().getTargetModelElementReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_62);
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

            otherlv_1=(Token)match(input,33,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getClassifierAssignmentAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            // InternalAadlV3.g:3188:3: ( ( ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID) ) {
                alt62=1;
            }
            else if ( (LA62_0==19) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalAadlV3.g:3189:4: ( ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? )
                    {
                    // InternalAadlV3.g:3189:4: ( ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? )
                    // InternalAadlV3.g:3190:5: ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )?
                    {
                    // InternalAadlV3.g:3190:5: ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) )
                    // InternalAadlV3.g:3191:6: (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference )
                    {
                    // InternalAadlV3.g:3191:6: (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference )
                    // InternalAadlV3.g:3192:7: lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getClassifierAssignmentAccess().getAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_2_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_63);
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

                    // InternalAadlV3.g:3209:5: (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==26) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalAadlV3.g:3210:6: otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_3, grammarAccess.getClassifierAssignmentAccess().getCommaKeyword_2_0_1_0());
                    	      					
                    	    }
                    	    // InternalAadlV3.g:3214:6: ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) )
                    	    // InternalAadlV3.g:3215:7: (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference )
                    	    {
                    	    // InternalAadlV3.g:3215:7: (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference )
                    	    // InternalAadlV3.g:3216:8: lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getClassifierAssignmentAccess().getAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_2_0_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_63);
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
                    	    break loop60;
                        }
                    } while (true);

                    // InternalAadlV3.g:3234:5: (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==19) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // InternalAadlV3.g:3235:6: this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current]
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
                    // InternalAadlV3.g:3252:4: this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current]
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
    // InternalAadlV3.g:3275:1: entryRuleClassifierAssignmentPattern returns [EObject current=null] : iv_ruleClassifierAssignmentPattern= ruleClassifierAssignmentPattern EOF ;
    public final EObject entryRuleClassifierAssignmentPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierAssignmentPattern = null;


        try {
            // InternalAadlV3.g:3275:68: (iv_ruleClassifierAssignmentPattern= ruleClassifierAssignmentPattern EOF )
            // InternalAadlV3.g:3276:2: iv_ruleClassifierAssignmentPattern= ruleClassifierAssignmentPattern EOF
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
    // InternalAadlV3.g:3282:1: ruleClassifierAssignmentPattern returns [EObject current=null] : (this_QueryExpression_0= ruleQueryExpression[$current] otherlv_1= '=>' ( ( ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) otherlv_7= ';' ) ;
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
            // InternalAadlV3.g:3288:2: ( (this_QueryExpression_0= ruleQueryExpression[$current] otherlv_1= '=>' ( ( ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) otherlv_7= ';' ) )
            // InternalAadlV3.g:3289:2: (this_QueryExpression_0= ruleQueryExpression[$current] otherlv_1= '=>' ( ( ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) otherlv_7= ';' )
            {
            // InternalAadlV3.g:3289:2: (this_QueryExpression_0= ruleQueryExpression[$current] otherlv_1= '=>' ( ( ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) otherlv_7= ';' )
            // InternalAadlV3.g:3290:3: this_QueryExpression_0= ruleQueryExpression[$current] otherlv_1= '=>' ( ( ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] ) otherlv_7= ';'
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
            pushFollow(FOLLOW_62);
            this_QueryExpression_0=ruleQueryExpression(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_QueryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_1=(Token)match(input,33,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getClassifierAssignmentPatternAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            // InternalAadlV3.g:3308:3: ( ( ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? ) | this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current] )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_ID) ) {
                alt65=1;
            }
            else if ( (LA65_0==19) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalAadlV3.g:3309:4: ( ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? )
                    {
                    // InternalAadlV3.g:3309:4: ( ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )? )
                    // InternalAadlV3.g:3310:5: ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )?
                    {
                    // InternalAadlV3.g:3310:5: ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) )
                    // InternalAadlV3.g:3311:6: (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference )
                    {
                    // InternalAadlV3.g:3311:6: (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference )
                    // InternalAadlV3.g:3312:7: lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getClassifierAssignmentPatternAccess().getAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_2_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_63);
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

                    // InternalAadlV3.g:3329:5: (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==26) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // InternalAadlV3.g:3330:6: otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_3, grammarAccess.getClassifierAssignmentPatternAccess().getCommaKeyword_2_0_1_0());
                    	      					
                    	    }
                    	    // InternalAadlV3.g:3334:6: ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) )
                    	    // InternalAadlV3.g:3335:7: (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference )
                    	    {
                    	    // InternalAadlV3.g:3335:7: (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference )
                    	    // InternalAadlV3.g:3336:8: lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getClassifierAssignmentPatternAccess().getAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_2_0_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_63);
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
                    	    break loop63;
                        }
                    } while (true);

                    // InternalAadlV3.g:3354:5: (this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current] )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==19) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // InternalAadlV3.g:3355:6: this_CurlyConfigurationElementBlock_5= ruleCurlyConfigurationElementBlock[$current]
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
                    // InternalAadlV3.g:3372:4: this_CurlyConfigurationElementBlock_6= ruleCurlyConfigurationElementBlock[$current]
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
    // InternalAadlV3.g:3396:1: ruleQueryExpression[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'all' otherlv_1= '(' ( ( ruleQualifiedTypesReference ) ) otherlv_3= ')' ) ;
    public final EObject ruleQueryExpression(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAadlV3.g:3402:2: ( (otherlv_0= 'all' otherlv_1= '(' ( ( ruleQualifiedTypesReference ) ) otherlv_3= ')' ) )
            // InternalAadlV3.g:3403:2: (otherlv_0= 'all' otherlv_1= '(' ( ( ruleQualifiedTypesReference ) ) otherlv_3= ')' )
            {
            // InternalAadlV3.g:3403:2: (otherlv_0= 'all' otherlv_1= '(' ( ( ruleQualifiedTypesReference ) ) otherlv_3= ')' )
            // InternalAadlV3.g:3404:3: otherlv_0= 'all' otherlv_1= '(' ( ( ruleQualifiedTypesReference ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getQueryExpressionAccess().getAllKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,24,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getQueryExpressionAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalAadlV3.g:3412:3: ( ( ruleQualifiedTypesReference ) )
            // InternalAadlV3.g:3413:4: ( ruleQualifiedTypesReference )
            {
            // InternalAadlV3.g:3413:4: ( ruleQualifiedTypesReference )
            // InternalAadlV3.g:3414:5: ruleQualifiedTypesReference
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
            pushFollow(FOLLOW_19);
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
    // InternalAadlV3.g:3439:1: entryRuleFlowAssignment returns [EObject current=null] : iv_ruleFlowAssignment= ruleFlowAssignment EOF ;
    public final EObject entryRuleFlowAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowAssignment = null;


        try {
            // InternalAadlV3.g:3439:55: (iv_ruleFlowAssignment= ruleFlowAssignment EOF )
            // InternalAadlV3.g:3440:2: iv_ruleFlowAssignment= ruleFlowAssignment EOF
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
    // InternalAadlV3.g:3446:1: ruleFlowAssignment returns [EObject current=null] : ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )* otherlv_6= ';' ) ;
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
            // InternalAadlV3.g:3452:2: ( ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )* otherlv_6= ';' ) )
            // InternalAadlV3.g:3453:2: ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )* otherlv_6= ';' )
            {
            // InternalAadlV3.g:3453:2: ( ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )* otherlv_6= ';' )
            // InternalAadlV3.g:3454:3: ( (lv_target_0_0= ruleModelElementReference ) ) otherlv_1= '=>' otherlv_2= 'flow' ( (lv_elements_3_0= rulePathElement ) ) (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )* otherlv_6= ';'
            {
            // InternalAadlV3.g:3454:3: ( (lv_target_0_0= ruleModelElementReference ) )
            // InternalAadlV3.g:3455:4: (lv_target_0_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:3455:4: (lv_target_0_0= ruleModelElementReference )
            // InternalAadlV3.g:3456:5: lv_target_0_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowAssignmentAccess().getTargetModelElementReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_62);
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

            otherlv_1=(Token)match(input,33,FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFlowAssignmentAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,45,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFlowAssignmentAccess().getFlowKeyword_2());
              		
            }
            // InternalAadlV3.g:3481:3: ( (lv_elements_3_0= rulePathElement ) )
            // InternalAadlV3.g:3482:4: (lv_elements_3_0= rulePathElement )
            {
            // InternalAadlV3.g:3482:4: (lv_elements_3_0= rulePathElement )
            // InternalAadlV3.g:3483:5: lv_elements_3_0= rulePathElement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowAssignmentAccess().getElementsPathElementParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_65);
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

            // InternalAadlV3.g:3500:3: (otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==39) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalAadlV3.g:3501:4: otherlv_4= '->' ( (lv_elements_5_0= rulePathElement ) )
            	    {
            	    otherlv_4=(Token)match(input,39,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getFlowAssignmentAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
            	      			
            	    }
            	    // InternalAadlV3.g:3505:4: ( (lv_elements_5_0= rulePathElement ) )
            	    // InternalAadlV3.g:3506:5: (lv_elements_5_0= rulePathElement )
            	    {
            	    // InternalAadlV3.g:3506:5: (lv_elements_5_0= rulePathElement )
            	    // InternalAadlV3.g:3507:6: lv_elements_5_0= rulePathElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getFlowAssignmentAccess().getElementsPathElementParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_65);
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
            	    break loop66;
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
    // InternalAadlV3.g:3534:1: ruleConfigurationElementBlock[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'is' (this_ConfigurationElement_1= ruleConfigurationElement[$current] )* otherlv_2= 'end' ) ;
    public final EObject ruleConfigurationElementBlock(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_ConfigurationElement_1 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3540:2: ( (otherlv_0= 'is' (this_ConfigurationElement_1= ruleConfigurationElement[$current] )* otherlv_2= 'end' ) )
            // InternalAadlV3.g:3541:2: (otherlv_0= 'is' (this_ConfigurationElement_1= ruleConfigurationElement[$current] )* otherlv_2= 'end' )
            {
            // InternalAadlV3.g:3541:2: (otherlv_0= 'is' (this_ConfigurationElement_1= ruleConfigurationElement[$current] )* otherlv_2= 'end' )
            // InternalAadlV3.g:3542:3: otherlv_0= 'is' (this_ConfigurationElement_1= ruleConfigurationElement[$current] )* otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConfigurationElementBlockAccess().getIsKeyword_0());
              		
            }
            // InternalAadlV3.g:3546:3: (this_ConfigurationElement_1= ruleConfigurationElement[$current] )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==RULE_ID||LA67_0==18||LA67_0==25||LA67_0==32) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalAadlV3.g:3547:4: this_ConfigurationElement_1= ruleConfigurationElement[$current]
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
            	    pushFollow(FOLLOW_43);
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
            	    break loop67;
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
    // InternalAadlV3.g:3571:1: ruleCurlyConfigurationElementBlock[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '{' (this_ConfigurationElement_1= ruleConfigurationElement[$current] )+ otherlv_2= '}' ) ;
    public final EObject ruleCurlyConfigurationElementBlock(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_ConfigurationElement_1 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3577:2: ( (otherlv_0= '{' (this_ConfigurationElement_1= ruleConfigurationElement[$current] )+ otherlv_2= '}' ) )
            // InternalAadlV3.g:3578:2: (otherlv_0= '{' (this_ConfigurationElement_1= ruleConfigurationElement[$current] )+ otherlv_2= '}' )
            {
            // InternalAadlV3.g:3578:2: (otherlv_0= '{' (this_ConfigurationElement_1= ruleConfigurationElement[$current] )+ otherlv_2= '}' )
            // InternalAadlV3.g:3579:3: otherlv_0= '{' (this_ConfigurationElement_1= ruleConfigurationElement[$current] )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCurlyConfigurationElementBlockAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalAadlV3.g:3583:3: (this_ConfigurationElement_1= ruleConfigurationElement[$current] )+
            int cnt68=0;
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==RULE_ID||LA68_0==18||LA68_0==25||LA68_0==32) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalAadlV3.g:3584:4: this_ConfigurationElement_1= ruleConfigurationElement[$current]
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
            	    pushFollow(FOLLOW_67);
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
    // InternalAadlV3.g:3608:1: ruleConfigurationElement[EObject in_current] returns [EObject current=in_current] : ( ( (lv_ownedPropertyAssociations_0_0= rulePropertyAssociation ) ) | ( (lv_bindings_1_0= ruleBinding ) ) | ( (lv_classifierAssignments_2_0= ruleClassifierAssignment ) ) | ( (lv_classifierAssignments_3_0= ruleClassifierAssignmentPattern ) ) | ( (lv_annexSubclause_4_0= ruleAnnexSubclause ) ) ) ;
    public final EObject ruleConfigurationElement(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_ownedPropertyAssociations_0_0 = null;

        EObject lv_bindings_1_0 = null;

        EObject lv_classifierAssignments_2_0 = null;

        EObject lv_classifierAssignments_3_0 = null;

        EObject lv_annexSubclause_4_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3614:2: ( ( ( (lv_ownedPropertyAssociations_0_0= rulePropertyAssociation ) ) | ( (lv_bindings_1_0= ruleBinding ) ) | ( (lv_classifierAssignments_2_0= ruleClassifierAssignment ) ) | ( (lv_classifierAssignments_3_0= ruleClassifierAssignmentPattern ) ) | ( (lv_annexSubclause_4_0= ruleAnnexSubclause ) ) ) )
            // InternalAadlV3.g:3615:2: ( ( (lv_ownedPropertyAssociations_0_0= rulePropertyAssociation ) ) | ( (lv_bindings_1_0= ruleBinding ) ) | ( (lv_classifierAssignments_2_0= ruleClassifierAssignment ) ) | ( (lv_classifierAssignments_3_0= ruleClassifierAssignmentPattern ) ) | ( (lv_annexSubclause_4_0= ruleAnnexSubclause ) ) )
            {
            // InternalAadlV3.g:3615:2: ( ( (lv_ownedPropertyAssociations_0_0= rulePropertyAssociation ) ) | ( (lv_bindings_1_0= ruleBinding ) ) | ( (lv_classifierAssignments_2_0= ruleClassifierAssignment ) ) | ( (lv_classifierAssignments_3_0= ruleClassifierAssignmentPattern ) ) | ( (lv_annexSubclause_4_0= ruleAnnexSubclause ) ) )
            int alt69=5;
            alt69 = dfa69.predict(input);
            switch (alt69) {
                case 1 :
                    // InternalAadlV3.g:3616:3: ( (lv_ownedPropertyAssociations_0_0= rulePropertyAssociation ) )
                    {
                    // InternalAadlV3.g:3616:3: ( (lv_ownedPropertyAssociations_0_0= rulePropertyAssociation ) )
                    // InternalAadlV3.g:3617:4: (lv_ownedPropertyAssociations_0_0= rulePropertyAssociation )
                    {
                    // InternalAadlV3.g:3617:4: (lv_ownedPropertyAssociations_0_0= rulePropertyAssociation )
                    // InternalAadlV3.g:3618:5: lv_ownedPropertyAssociations_0_0= rulePropertyAssociation
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
                    // InternalAadlV3.g:3636:3: ( (lv_bindings_1_0= ruleBinding ) )
                    {
                    // InternalAadlV3.g:3636:3: ( (lv_bindings_1_0= ruleBinding ) )
                    // InternalAadlV3.g:3637:4: (lv_bindings_1_0= ruleBinding )
                    {
                    // InternalAadlV3.g:3637:4: (lv_bindings_1_0= ruleBinding )
                    // InternalAadlV3.g:3638:5: lv_bindings_1_0= ruleBinding
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
                    // InternalAadlV3.g:3656:3: ( (lv_classifierAssignments_2_0= ruleClassifierAssignment ) )
                    {
                    // InternalAadlV3.g:3656:3: ( (lv_classifierAssignments_2_0= ruleClassifierAssignment ) )
                    // InternalAadlV3.g:3657:4: (lv_classifierAssignments_2_0= ruleClassifierAssignment )
                    {
                    // InternalAadlV3.g:3657:4: (lv_classifierAssignments_2_0= ruleClassifierAssignment )
                    // InternalAadlV3.g:3658:5: lv_classifierAssignments_2_0= ruleClassifierAssignment
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
                    // InternalAadlV3.g:3676:3: ( (lv_classifierAssignments_3_0= ruleClassifierAssignmentPattern ) )
                    {
                    // InternalAadlV3.g:3676:3: ( (lv_classifierAssignments_3_0= ruleClassifierAssignmentPattern ) )
                    // InternalAadlV3.g:3677:4: (lv_classifierAssignments_3_0= ruleClassifierAssignmentPattern )
                    {
                    // InternalAadlV3.g:3677:4: (lv_classifierAssignments_3_0= ruleClassifierAssignmentPattern )
                    // InternalAadlV3.g:3678:5: lv_classifierAssignments_3_0= ruleClassifierAssignmentPattern
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
                    // InternalAadlV3.g:3696:3: ( (lv_annexSubclause_4_0= ruleAnnexSubclause ) )
                    {
                    // InternalAadlV3.g:3696:3: ( (lv_annexSubclause_4_0= ruleAnnexSubclause ) )
                    // InternalAadlV3.g:3697:4: (lv_annexSubclause_4_0= ruleAnnexSubclause )
                    {
                    // InternalAadlV3.g:3697:4: (lv_annexSubclause_4_0= ruleAnnexSubclause )
                    // InternalAadlV3.g:3698:5: lv_annexSubclause_4_0= ruleAnnexSubclause
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
    // InternalAadlV3.g:3720:1: ruleParameters[EObject in_current] returns [EObject current=in_current] : ( ( (lv_parameterized_0_0= '(' ) ) ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )? otherlv_4= ')' ) ;
    public final EObject ruleParameters(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_parameterized_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameters_1_0 = null;

        EObject lv_parameters_3_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3726:2: ( ( ( (lv_parameterized_0_0= '(' ) ) ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )? otherlv_4= ')' ) )
            // InternalAadlV3.g:3727:2: ( ( (lv_parameterized_0_0= '(' ) ) ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )? otherlv_4= ')' )
            {
            // InternalAadlV3.g:3727:2: ( ( (lv_parameterized_0_0= '(' ) ) ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )? otherlv_4= ')' )
            // InternalAadlV3.g:3728:3: ( (lv_parameterized_0_0= '(' ) ) ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )? otherlv_4= ')'
            {
            // InternalAadlV3.g:3728:3: ( (lv_parameterized_0_0= '(' ) )
            // InternalAadlV3.g:3729:4: (lv_parameterized_0_0= '(' )
            {
            // InternalAadlV3.g:3729:4: (lv_parameterized_0_0= '(' )
            // InternalAadlV3.g:3730:5: lv_parameterized_0_0= '('
            {
            lv_parameterized_0_0=(Token)match(input,24,FOLLOW_68); if (state.failed) return current;
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

            // InternalAadlV3.g:3742:3: ( ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )* )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_ID) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalAadlV3.g:3743:4: ( (lv_parameters_1_0= ruleConfigurationParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )*
                    {
                    // InternalAadlV3.g:3743:4: ( (lv_parameters_1_0= ruleConfigurationParameter ) )
                    // InternalAadlV3.g:3744:5: (lv_parameters_1_0= ruleConfigurationParameter )
                    {
                    // InternalAadlV3.g:3744:5: (lv_parameters_1_0= ruleConfigurationParameter )
                    // InternalAadlV3.g:3745:6: lv_parameters_1_0= ruleConfigurationParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getParametersAccess().getParametersConfigurationParameterParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_20);
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

                    // InternalAadlV3.g:3762:4: (otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==26) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // InternalAadlV3.g:3763:5: otherlv_2= ',' ( (lv_parameters_3_0= ruleConfigurationParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,26,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getParametersAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalAadlV3.g:3767:5: ( (lv_parameters_3_0= ruleConfigurationParameter ) )
                    	    // InternalAadlV3.g:3768:6: (lv_parameters_3_0= ruleConfigurationParameter )
                    	    {
                    	    // InternalAadlV3.g:3768:6: (lv_parameters_3_0= ruleConfigurationParameter )
                    	    // InternalAadlV3.g:3769:7: lv_parameters_3_0= ruleConfigurationParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getParametersAccess().getParametersConfigurationParameterParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_20);
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
                    	    break loop70;
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
    // InternalAadlV3.g:3796:1: entryRuleConfigurationParameter returns [EObject current=null] : iv_ruleConfigurationParameter= ruleConfigurationParameter EOF ;
    public final EObject entryRuleConfigurationParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationParameter = null;


        try {
            // InternalAadlV3.g:3796:63: (iv_ruleConfigurationParameter= ruleConfigurationParameter EOF )
            // InternalAadlV3.g:3797:2: iv_ruleConfigurationParameter= ruleConfigurationParameter EOF
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
    // InternalAadlV3.g:3803:1: ruleConfigurationParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleConfigurationParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAadlV3.g:3809:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ) )
            // InternalAadlV3.g:3810:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) )
            {
            // InternalAadlV3.g:3810:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) )
            // InternalAadlV3.g:3811:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) )
            {
            // InternalAadlV3.g:3811:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAadlV3.g:3812:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAadlV3.g:3812:4: (lv_name_0_0= RULE_ID )
            // InternalAadlV3.g:3813:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,22,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConfigurationParameterAccess().getColonKeyword_1());
              		
            }
            // InternalAadlV3.g:3833:3: ( ( ruleQualifiedName ) )
            // InternalAadlV3.g:3834:4: ( ruleQualifiedName )
            {
            // InternalAadlV3.g:3834:4: ( ruleQualifiedName )
            // InternalAadlV3.g:3835:5: ruleQualifiedName
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
    // InternalAadlV3.g:3856:1: entryRuleReversableInterfaceReference returns [EObject current=null] : iv_ruleReversableInterfaceReference= ruleReversableInterfaceReference EOF ;
    public final EObject entryRuleReversableInterfaceReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReversableInterfaceReference = null;


        try {
            // InternalAadlV3.g:3856:69: (iv_ruleReversableInterfaceReference= ruleReversableInterfaceReference EOF )
            // InternalAadlV3.g:3857:2: iv_ruleReversableInterfaceReference= ruleReversableInterfaceReference EOF
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
    // InternalAadlV3.g:3863:1: ruleReversableInterfaceReference returns [EObject current=null] : ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) ) ) ;
    public final EObject ruleReversableInterfaceReference() throws RecognitionException {
        EObject current = null;

        Token lv_reverse_0_0=null;


        	enterRule();

        try {
            // InternalAadlV3.g:3869:2: ( ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) ) ) )
            // InternalAadlV3.g:3870:2: ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) ) )
            {
            // InternalAadlV3.g:3870:2: ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) ) )
            // InternalAadlV3.g:3871:3: ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) )
            {
            // InternalAadlV3.g:3871:3: ( (lv_reverse_0_0= 'reverse' ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==46) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalAadlV3.g:3872:4: (lv_reverse_0_0= 'reverse' )
                    {
                    // InternalAadlV3.g:3872:4: (lv_reverse_0_0= 'reverse' )
                    // InternalAadlV3.g:3873:5: lv_reverse_0_0= 'reverse'
                    {
                    lv_reverse_0_0=(Token)match(input,46,FOLLOW_5); if (state.failed) return current;
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

            // InternalAadlV3.g:3885:3: ( ( ruleQualifiedReference ) )
            // InternalAadlV3.g:3886:4: ( ruleQualifiedReference )
            {
            // InternalAadlV3.g:3886:4: ( ruleQualifiedReference )
            // InternalAadlV3.g:3887:5: ruleQualifiedReference
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
    // InternalAadlV3.g:3908:1: entryRuleReversableTypeReference returns [EObject current=null] : iv_ruleReversableTypeReference= ruleReversableTypeReference EOF ;
    public final EObject entryRuleReversableTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReversableTypeReference = null;


        try {
            // InternalAadlV3.g:3908:64: (iv_ruleReversableTypeReference= ruleReversableTypeReference EOF )
            // InternalAadlV3.g:3909:2: iv_ruleReversableTypeReference= ruleReversableTypeReference EOF
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
    // InternalAadlV3.g:3915:1: ruleReversableTypeReference returns [EObject current=null] : ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) ) ) ;
    public final EObject ruleReversableTypeReference() throws RecognitionException {
        EObject current = null;

        Token lv_reverse_0_0=null;


        	enterRule();

        try {
            // InternalAadlV3.g:3921:2: ( ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) ) ) )
            // InternalAadlV3.g:3922:2: ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) ) )
            {
            // InternalAadlV3.g:3922:2: ( ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) ) )
            // InternalAadlV3.g:3923:3: ( (lv_reverse_0_0= 'reverse' ) )? ( ( ruleQualifiedReference ) )
            {
            // InternalAadlV3.g:3923:3: ( (lv_reverse_0_0= 'reverse' ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==46) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalAadlV3.g:3924:4: (lv_reverse_0_0= 'reverse' )
                    {
                    // InternalAadlV3.g:3924:4: (lv_reverse_0_0= 'reverse' )
                    // InternalAadlV3.g:3925:5: lv_reverse_0_0= 'reverse'
                    {
                    lv_reverse_0_0=(Token)match(input,46,FOLLOW_5); if (state.failed) return current;
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

            // InternalAadlV3.g:3937:3: ( ( ruleQualifiedReference ) )
            // InternalAadlV3.g:3938:4: ( ruleQualifiedReference )
            {
            // InternalAadlV3.g:3938:4: ( ruleQualifiedReference )
            // InternalAadlV3.g:3939:5: ruleQualifiedReference
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
    // InternalAadlV3.g:3960:1: entryRuleClassifierOrTypeReference returns [EObject current=null] : iv_ruleClassifierOrTypeReference= ruleClassifierOrTypeReference EOF ;
    public final EObject entryRuleClassifierOrTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierOrTypeReference = null;


        try {
            // InternalAadlV3.g:3960:66: (iv_ruleClassifierOrTypeReference= ruleClassifierOrTypeReference EOF )
            // InternalAadlV3.g:3961:2: iv_ruleClassifierOrTypeReference= ruleClassifierOrTypeReference EOF
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
    // InternalAadlV3.g:3967:1: ruleClassifierOrTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedTypesReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )? ) ;
    public final EObject ruleClassifierOrTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_ConfigurationActuals_1 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:3973:2: ( ( ( ( ruleQualifiedTypesReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )? ) )
            // InternalAadlV3.g:3974:2: ( ( ( ruleQualifiedTypesReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )? )
            {
            // InternalAadlV3.g:3974:2: ( ( ( ruleQualifiedTypesReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )? )
            // InternalAadlV3.g:3975:3: ( ( ruleQualifiedTypesReference ) ) (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )?
            {
            // InternalAadlV3.g:3975:3: ( ( ruleQualifiedTypesReference ) )
            // InternalAadlV3.g:3976:4: ( ruleQualifiedTypesReference )
            {
            // InternalAadlV3.g:3976:4: ( ruleQualifiedTypesReference )
            // InternalAadlV3.g:3977:5: ruleQualifiedTypesReference
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
            pushFollow(FOLLOW_69);
            ruleQualifiedTypesReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:3994:3: (this_ConfigurationActuals_1= ruleConfigurationActuals[$current] )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==24) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalAadlV3.g:3995:4: this_ConfigurationActuals_1= ruleConfigurationActuals[$current]
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
    // InternalAadlV3.g:4014:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // InternalAadlV3.g:4014:54: (iv_ruleTypeReference= ruleTypeReference EOF )
            // InternalAadlV3.g:4015:2: iv_ruleTypeReference= ruleTypeReference EOF
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
    // InternalAadlV3.g:4021:1: ruleTypeReference returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAadlV3.g:4027:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAadlV3.g:4028:2: ( ( ruleQualifiedName ) )
            {
            // InternalAadlV3.g:4028:2: ( ( ruleQualifiedName ) )
            // InternalAadlV3.g:4029:3: ( ruleQualifiedName )
            {
            // InternalAadlV3.g:4029:3: ( ruleQualifiedName )
            // InternalAadlV3.g:4030:4: ruleQualifiedName
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
    // InternalAadlV3.g:4050:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalAadlV3.g:4050:45: (iv_ruleType= ruleType EOF )
            // InternalAadlV3.g:4051:2: iv_ruleType= ruleType EOF
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
    // InternalAadlV3.g:4057:1: ruleType returns [EObject current=null] : (this_TypeReference_0= ruleTypeReference | this_CompositeType_1= ruleCompositeType | this_PrimitiveType_2= rulePrimitiveType | this_EnumerationType_3= ruleEnumerationType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_TypeReference_0 = null;

        EObject this_CompositeType_1 = null;

        EObject this_PrimitiveType_2 = null;

        EObject this_EnumerationType_3 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4063:2: ( (this_TypeReference_0= ruleTypeReference | this_CompositeType_1= ruleCompositeType | this_PrimitiveType_2= rulePrimitiveType | this_EnumerationType_3= ruleEnumerationType ) )
            // InternalAadlV3.g:4064:2: (this_TypeReference_0= ruleTypeReference | this_CompositeType_1= ruleCompositeType | this_PrimitiveType_2= rulePrimitiveType | this_EnumerationType_3= ruleEnumerationType )
            {
            // InternalAadlV3.g:4064:2: (this_TypeReference_0= ruleTypeReference | this_CompositeType_1= ruleCompositeType | this_PrimitiveType_2= rulePrimitiveType | this_EnumerationType_3= ruleEnumerationType )
            int alt75=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt75=1;
                }
                break;
            case 80:
            case 81:
                {
                alt75=2;
                }
                break;
            case 82:
            case 83:
            case 84:
            case 85:
                {
                alt75=3;
                }
                break;
            case 47:
                {
                alt75=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // InternalAadlV3.g:4065:3: this_TypeReference_0= ruleTypeReference
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
                    // InternalAadlV3.g:4077:3: this_CompositeType_1= ruleCompositeType
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
                    // InternalAadlV3.g:4089:3: this_PrimitiveType_2= rulePrimitiveType
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
                    // InternalAadlV3.g:4101:3: this_EnumerationType_3= ruleEnumerationType
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
    // InternalAadlV3.g:4116:1: entryRuleEnumerationType returns [EObject current=null] : iv_ruleEnumerationType= ruleEnumerationType EOF ;
    public final EObject entryRuleEnumerationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationType = null;


        try {
            // InternalAadlV3.g:4116:56: (iv_ruleEnumerationType= ruleEnumerationType EOF )
            // InternalAadlV3.g:4117:2: iv_ruleEnumerationType= ruleEnumerationType EOF
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
    // InternalAadlV3.g:4123:1: ruleEnumerationType returns [EObject current=null] : ( () otherlv_1= 'enum' otherlv_2= '(' ( (lv_literals_3_0= ruleEnumerationLiteral ) )* otherlv_4= ')' ) ;
    public final EObject ruleEnumerationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_literals_3_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4129:2: ( ( () otherlv_1= 'enum' otherlv_2= '(' ( (lv_literals_3_0= ruleEnumerationLiteral ) )* otherlv_4= ')' ) )
            // InternalAadlV3.g:4130:2: ( () otherlv_1= 'enum' otherlv_2= '(' ( (lv_literals_3_0= ruleEnumerationLiteral ) )* otherlv_4= ')' )
            {
            // InternalAadlV3.g:4130:2: ( () otherlv_1= 'enum' otherlv_2= '(' ( (lv_literals_3_0= ruleEnumerationLiteral ) )* otherlv_4= ')' )
            // InternalAadlV3.g:4131:3: () otherlv_1= 'enum' otherlv_2= '(' ( (lv_literals_3_0= ruleEnumerationLiteral ) )* otherlv_4= ')'
            {
            // InternalAadlV3.g:4131:3: ()
            // InternalAadlV3.g:4132:4: 
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

            otherlv_1=(Token)match(input,47,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEnumerationTypeAccess().getEnumKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,24,FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getEnumerationTypeAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalAadlV3.g:4149:3: ( (lv_literals_3_0= ruleEnumerationLiteral ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==RULE_ID) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalAadlV3.g:4150:4: (lv_literals_3_0= ruleEnumerationLiteral )
            	    {
            	    // InternalAadlV3.g:4150:4: (lv_literals_3_0= ruleEnumerationLiteral )
            	    // InternalAadlV3.g:4151:5: lv_literals_3_0= ruleEnumerationLiteral
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_68);
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
            	    break loop76;
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
    // InternalAadlV3.g:4176:1: entryRuleCompositeType returns [EObject current=null] : iv_ruleCompositeType= ruleCompositeType EOF ;
    public final EObject entryRuleCompositeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeType = null;


        try {
            // InternalAadlV3.g:4176:54: (iv_ruleCompositeType= ruleCompositeType EOF )
            // InternalAadlV3.g:4177:2: iv_ruleCompositeType= ruleCompositeType EOF
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
    // InternalAadlV3.g:4183:1: ruleCompositeType returns [EObject current=null] : ( ( (lv_compositeType_0_0= ruleComposite ) ) otherlv_1= 'of' ( (lv_type_2_0= ruleTypeReference ) ) ) ;
    public final EObject ruleCompositeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_compositeType_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4189:2: ( ( ( (lv_compositeType_0_0= ruleComposite ) ) otherlv_1= 'of' ( (lv_type_2_0= ruleTypeReference ) ) ) )
            // InternalAadlV3.g:4190:2: ( ( (lv_compositeType_0_0= ruleComposite ) ) otherlv_1= 'of' ( (lv_type_2_0= ruleTypeReference ) ) )
            {
            // InternalAadlV3.g:4190:2: ( ( (lv_compositeType_0_0= ruleComposite ) ) otherlv_1= 'of' ( (lv_type_2_0= ruleTypeReference ) ) )
            // InternalAadlV3.g:4191:3: ( (lv_compositeType_0_0= ruleComposite ) ) otherlv_1= 'of' ( (lv_type_2_0= ruleTypeReference ) )
            {
            // InternalAadlV3.g:4191:3: ( (lv_compositeType_0_0= ruleComposite ) )
            // InternalAadlV3.g:4192:4: (lv_compositeType_0_0= ruleComposite )
            {
            // InternalAadlV3.g:4192:4: (lv_compositeType_0_0= ruleComposite )
            // InternalAadlV3.g:4193:5: lv_compositeType_0_0= ruleComposite
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCompositeTypeAccess().getCompositeTypeCompositeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_70);
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

            otherlv_1=(Token)match(input,48,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCompositeTypeAccess().getOfKeyword_1());
              		
            }
            // InternalAadlV3.g:4214:3: ( (lv_type_2_0= ruleTypeReference ) )
            // InternalAadlV3.g:4215:4: (lv_type_2_0= ruleTypeReference )
            {
            // InternalAadlV3.g:4215:4: (lv_type_2_0= ruleTypeReference )
            // InternalAadlV3.g:4216:5: lv_type_2_0= ruleTypeReference
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
    // InternalAadlV3.g:4237:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalAadlV3.g:4237:54: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalAadlV3.g:4238:2: iv_rulePrimitiveType= rulePrimitiveType EOF
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
    // InternalAadlV3.g:4244:1: rulePrimitiveType returns [EObject current=null] : ( (lv_primitiveType_0_0= rulePrimitive ) ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_primitiveType_0_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4250:2: ( ( (lv_primitiveType_0_0= rulePrimitive ) ) )
            // InternalAadlV3.g:4251:2: ( (lv_primitiveType_0_0= rulePrimitive ) )
            {
            // InternalAadlV3.g:4251:2: ( (lv_primitiveType_0_0= rulePrimitive ) )
            // InternalAadlV3.g:4252:3: (lv_primitiveType_0_0= rulePrimitive )
            {
            // InternalAadlV3.g:4252:3: (lv_primitiveType_0_0= rulePrimitive )
            // InternalAadlV3.g:4253:4: lv_primitiveType_0_0= rulePrimitive
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
    // InternalAadlV3.g:4273:1: entryRuleImplementationReference returns [EObject current=null] : iv_ruleImplementationReference= ruleImplementationReference EOF ;
    public final EObject entryRuleImplementationReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationReference = null;


        try {
            // InternalAadlV3.g:4273:64: (iv_ruleImplementationReference= ruleImplementationReference EOF )
            // InternalAadlV3.g:4274:2: iv_ruleImplementationReference= ruleImplementationReference EOF
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
    // InternalAadlV3.g:4280:1: ruleImplementationReference returns [EObject current=null] : ( ( ruleQualifiedDottedReference ) ) ;
    public final EObject ruleImplementationReference() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAadlV3.g:4286:2: ( ( ( ruleQualifiedDottedReference ) ) )
            // InternalAadlV3.g:4287:2: ( ( ruleQualifiedDottedReference ) )
            {
            // InternalAadlV3.g:4287:2: ( ( ruleQualifiedDottedReference ) )
            // InternalAadlV3.g:4288:3: ( ruleQualifiedDottedReference )
            {
            // InternalAadlV3.g:4288:3: ( ruleQualifiedDottedReference )
            // InternalAadlV3.g:4289:4: ruleQualifiedDottedReference
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
    // InternalAadlV3.g:4309:1: entryRuleAnnexSubclause returns [EObject current=null] : iv_ruleAnnexSubclause= ruleAnnexSubclause EOF ;
    public final EObject entryRuleAnnexSubclause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnexSubclause = null;


        try {
            // InternalAadlV3.g:4309:55: (iv_ruleAnnexSubclause= ruleAnnexSubclause EOF )
            // InternalAadlV3.g:4310:2: iv_ruleAnnexSubclause= ruleAnnexSubclause EOF
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
    // InternalAadlV3.g:4316:1: ruleAnnexSubclause returns [EObject current=null] : (this_BehaviorSpecification_0= ruleBehaviorSpecification | this_DefaultAnnexSubclause_1= ruleDefaultAnnexSubclause ) ;
    public final EObject ruleAnnexSubclause() throws RecognitionException {
        EObject current = null;

        EObject this_BehaviorSpecification_0 = null;

        EObject this_DefaultAnnexSubclause_1 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4322:2: ( (this_BehaviorSpecification_0= ruleBehaviorSpecification | this_DefaultAnnexSubclause_1= ruleDefaultAnnexSubclause ) )
            // InternalAadlV3.g:4323:2: (this_BehaviorSpecification_0= ruleBehaviorSpecification | this_DefaultAnnexSubclause_1= ruleDefaultAnnexSubclause )
            {
            // InternalAadlV3.g:4323:2: (this_BehaviorSpecification_0= ruleBehaviorSpecification | this_DefaultAnnexSubclause_1= ruleDefaultAnnexSubclause )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==18) ) {
                int LA77_1 = input.LA(2);

                if ( (LA77_1==RULE_ID) ) {
                    int LA77_2 = input.LA(3);

                    if ( (LA77_2==RULE_ANNEXTEXT) ) {
                        alt77=2;
                    }
                    else if ( (LA77_2==19) ) {
                        alt77=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 77, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 77, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // InternalAadlV3.g:4324:3: this_BehaviorSpecification_0= ruleBehaviorSpecification
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnnexSubclauseAccess().getBehaviorSpecificationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BehaviorSpecification_0=ruleBehaviorSpecification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BehaviorSpecification_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:4336:3: this_DefaultAnnexSubclause_1= ruleDefaultAnnexSubclause
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnnexSubclauseAccess().getDefaultAnnexSubclauseParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DefaultAnnexSubclause_1=ruleDefaultAnnexSubclause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DefaultAnnexSubclause_1;
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
    // InternalAadlV3.g:4351:1: entryRuleDefaultAnnexSubclause returns [EObject current=null] : iv_ruleDefaultAnnexSubclause= ruleDefaultAnnexSubclause EOF ;
    public final EObject entryRuleDefaultAnnexSubclause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultAnnexSubclause = null;


        try {
            // InternalAadlV3.g:4351:62: (iv_ruleDefaultAnnexSubclause= ruleDefaultAnnexSubclause EOF )
            // InternalAadlV3.g:4352:2: iv_ruleDefaultAnnexSubclause= ruleDefaultAnnexSubclause EOF
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
    // InternalAadlV3.g:4358:1: ruleDefaultAnnexSubclause returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_body_2_0= RULE_ANNEXTEXT ) ) otherlv_3= ';' ) ;
    public final EObject ruleDefaultAnnexSubclause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_body_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAadlV3.g:4364:2: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_body_2_0= RULE_ANNEXTEXT ) ) otherlv_3= ';' ) )
            // InternalAadlV3.g:4365:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_body_2_0= RULE_ANNEXTEXT ) ) otherlv_3= ';' )
            {
            // InternalAadlV3.g:4365:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_body_2_0= RULE_ANNEXTEXT ) ) otherlv_3= ';' )
            // InternalAadlV3.g:4366:3: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_body_2_0= RULE_ANNEXTEXT ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDefaultAnnexSubclauseAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalAadlV3.g:4370:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAadlV3.g:4371:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAadlV3.g:4371:4: (lv_name_1_0= RULE_ID )
            // InternalAadlV3.g:4372:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_71); if (state.failed) return current;
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

            // InternalAadlV3.g:4388:3: ( (lv_body_2_0= RULE_ANNEXTEXT ) )
            // InternalAadlV3.g:4389:4: (lv_body_2_0= RULE_ANNEXTEXT )
            {
            // InternalAadlV3.g:4389:4: (lv_body_2_0= RULE_ANNEXTEXT )
            // InternalAadlV3.g:4390:5: lv_body_2_0= RULE_ANNEXTEXT
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
    // InternalAadlV3.g:4415:1: rulePropertiesBlock[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '{' ( (lv_ownedPropertyAssociations_1_0= rulePropertyAssociation ) )+ otherlv_2= '}' ) ;
    public final EObject rulePropertiesBlock(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedPropertyAssociations_1_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4421:2: ( (otherlv_0= '{' ( (lv_ownedPropertyAssociations_1_0= rulePropertyAssociation ) )+ otherlv_2= '}' ) )
            // InternalAadlV3.g:4422:2: (otherlv_0= '{' ( (lv_ownedPropertyAssociations_1_0= rulePropertyAssociation ) )+ otherlv_2= '}' )
            {
            // InternalAadlV3.g:4422:2: (otherlv_0= '{' ( (lv_ownedPropertyAssociations_1_0= rulePropertyAssociation ) )+ otherlv_2= '}' )
            // InternalAadlV3.g:4423:3: otherlv_0= '{' ( (lv_ownedPropertyAssociations_1_0= rulePropertyAssociation ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_72); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPropertiesBlockAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalAadlV3.g:4427:3: ( (lv_ownedPropertyAssociations_1_0= rulePropertyAssociation ) )+
            int cnt78=0;
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==RULE_ID||LA78_0==32) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalAadlV3.g:4428:4: (lv_ownedPropertyAssociations_1_0= rulePropertyAssociation )
            	    {
            	    // InternalAadlV3.g:4428:4: (lv_ownedPropertyAssociations_1_0= rulePropertyAssociation )
            	    // InternalAadlV3.g:4429:5: lv_ownedPropertyAssociations_1_0= rulePropertyAssociation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getPropertiesBlockAccess().getOwnedPropertyAssociationsPropertyAssociationParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_73);
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
            	    if ( cnt78 >= 1 ) break loop78;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(78, input);
                        throw eee;
                }
                cnt78++;
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
    // InternalAadlV3.g:4455:1: ruleNestedComponentImplementationBlock[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '{' (this_NestedImplementationElement_1= ruleNestedImplementationElement[$current] )+ otherlv_2= '}' ) ;
    public final EObject ruleNestedComponentImplementationBlock(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_NestedImplementationElement_1 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4461:2: ( (otherlv_0= '{' (this_NestedImplementationElement_1= ruleNestedImplementationElement[$current] )+ otherlv_2= '}' ) )
            // InternalAadlV3.g:4462:2: (otherlv_0= '{' (this_NestedImplementationElement_1= ruleNestedImplementationElement[$current] )+ otherlv_2= '}' )
            {
            // InternalAadlV3.g:4462:2: (otherlv_0= '{' (this_NestedImplementationElement_1= ruleNestedImplementationElement[$current] )+ otherlv_2= '}' )
            // InternalAadlV3.g:4463:3: otherlv_0= '{' (this_NestedImplementationElement_1= ruleNestedImplementationElement[$current] )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_74); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNestedComponentImplementationBlockAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalAadlV3.g:4467:3: (this_NestedImplementationElement_1= ruleNestedImplementationElement[$current] )+
            int cnt79=0;
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==RULE_ID||LA79_0==18||LA79_0==32) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalAadlV3.g:4468:4: this_NestedImplementationElement_1= ruleNestedImplementationElement[$current]
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
            	    pushFollow(FOLLOW_75);
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
            	    if ( cnt79 >= 1 ) break loop79;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(79, input);
                        throw eee;
                }
                cnt79++;
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
    // InternalAadlV3.g:4492:1: ruleNestedImplementationElement[EObject in_current] returns [EObject current=in_current] : ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_bindings_2_0= ruleBinding ) ) | ( (lv_components_3_0= ruleSubcomponent ) ) | ( (lv_ownedPropertyAssociations_4_0= rulePropertyAssociation ) ) ) ;
    public final EObject ruleNestedImplementationElement(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_features_0_0 = null;

        EObject lv_connections_1_0 = null;

        EObject lv_bindings_2_0 = null;

        EObject lv_components_3_0 = null;

        EObject lv_ownedPropertyAssociations_4_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4498:2: ( ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_bindings_2_0= ruleBinding ) ) | ( (lv_components_3_0= ruleSubcomponent ) ) | ( (lv_ownedPropertyAssociations_4_0= rulePropertyAssociation ) ) ) )
            // InternalAadlV3.g:4499:2: ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_bindings_2_0= ruleBinding ) ) | ( (lv_components_3_0= ruleSubcomponent ) ) | ( (lv_ownedPropertyAssociations_4_0= rulePropertyAssociation ) ) )
            {
            // InternalAadlV3.g:4499:2: ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_bindings_2_0= ruleBinding ) ) | ( (lv_components_3_0= ruleSubcomponent ) ) | ( (lv_ownedPropertyAssociations_4_0= rulePropertyAssociation ) ) )
            int alt80=5;
            alt80 = dfa80.predict(input);
            switch (alt80) {
                case 1 :
                    // InternalAadlV3.g:4500:3: ( (lv_features_0_0= ruleFeature ) )
                    {
                    // InternalAadlV3.g:4500:3: ( (lv_features_0_0= ruleFeature ) )
                    // InternalAadlV3.g:4501:4: (lv_features_0_0= ruleFeature )
                    {
                    // InternalAadlV3.g:4501:4: (lv_features_0_0= ruleFeature )
                    // InternalAadlV3.g:4502:5: lv_features_0_0= ruleFeature
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
                    // InternalAadlV3.g:4520:3: ( (lv_connections_1_0= ruleConnection ) )
                    {
                    // InternalAadlV3.g:4520:3: ( (lv_connections_1_0= ruleConnection ) )
                    // InternalAadlV3.g:4521:4: (lv_connections_1_0= ruleConnection )
                    {
                    // InternalAadlV3.g:4521:4: (lv_connections_1_0= ruleConnection )
                    // InternalAadlV3.g:4522:5: lv_connections_1_0= ruleConnection
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
                    // InternalAadlV3.g:4540:3: ( (lv_bindings_2_0= ruleBinding ) )
                    {
                    // InternalAadlV3.g:4540:3: ( (lv_bindings_2_0= ruleBinding ) )
                    // InternalAadlV3.g:4541:4: (lv_bindings_2_0= ruleBinding )
                    {
                    // InternalAadlV3.g:4541:4: (lv_bindings_2_0= ruleBinding )
                    // InternalAadlV3.g:4542:5: lv_bindings_2_0= ruleBinding
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
                    // InternalAadlV3.g:4560:3: ( (lv_components_3_0= ruleSubcomponent ) )
                    {
                    // InternalAadlV3.g:4560:3: ( (lv_components_3_0= ruleSubcomponent ) )
                    // InternalAadlV3.g:4561:4: (lv_components_3_0= ruleSubcomponent )
                    {
                    // InternalAadlV3.g:4561:4: (lv_components_3_0= ruleSubcomponent )
                    // InternalAadlV3.g:4562:5: lv_components_3_0= ruleSubcomponent
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
                    // InternalAadlV3.g:4580:3: ( (lv_ownedPropertyAssociations_4_0= rulePropertyAssociation ) )
                    {
                    // InternalAadlV3.g:4580:3: ( (lv_ownedPropertyAssociations_4_0= rulePropertyAssociation ) )
                    // InternalAadlV3.g:4581:4: (lv_ownedPropertyAssociations_4_0= rulePropertyAssociation )
                    {
                    // InternalAadlV3.g:4581:4: (lv_ownedPropertyAssociations_4_0= rulePropertyAssociation )
                    // InternalAadlV3.g:4582:5: lv_ownedPropertyAssociations_4_0= rulePropertyAssociation
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
    // InternalAadlV3.g:4604:1: ruleConfigurationExtensions[EObject in_current] returns [EObject current=in_current] : ( ( (lv_superClassifiers_0_0= ruleClassifierOrTypeReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleClassifierOrTypeReference ) ) )* ) ;
    public final EObject ruleConfigurationExtensions(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_superClassifiers_0_0 = null;

        EObject lv_superClassifiers_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4610:2: ( ( ( (lv_superClassifiers_0_0= ruleClassifierOrTypeReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleClassifierOrTypeReference ) ) )* ) )
            // InternalAadlV3.g:4611:2: ( ( (lv_superClassifiers_0_0= ruleClassifierOrTypeReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleClassifierOrTypeReference ) ) )* )
            {
            // InternalAadlV3.g:4611:2: ( ( (lv_superClassifiers_0_0= ruleClassifierOrTypeReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleClassifierOrTypeReference ) ) )* )
            // InternalAadlV3.g:4612:3: ( (lv_superClassifiers_0_0= ruleClassifierOrTypeReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleClassifierOrTypeReference ) ) )*
            {
            // InternalAadlV3.g:4612:3: ( (lv_superClassifiers_0_0= ruleClassifierOrTypeReference ) )
            // InternalAadlV3.g:4613:4: (lv_superClassifiers_0_0= ruleClassifierOrTypeReference )
            {
            // InternalAadlV3.g:4613:4: (lv_superClassifiers_0_0= ruleClassifierOrTypeReference )
            // InternalAadlV3.g:4614:5: lv_superClassifiers_0_0= ruleClassifierOrTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConfigurationExtensionsAccess().getSuperClassifiersClassifierOrTypeReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_76);
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

            // InternalAadlV3.g:4631:3: (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleClassifierOrTypeReference ) ) )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==26) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // InternalAadlV3.g:4632:4: otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleClassifierOrTypeReference ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getConfigurationExtensionsAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalAadlV3.g:4636:4: ( (lv_superClassifiers_2_0= ruleClassifierOrTypeReference ) )
            	    // InternalAadlV3.g:4637:5: (lv_superClassifiers_2_0= ruleClassifierOrTypeReference )
            	    {
            	    // InternalAadlV3.g:4637:5: (lv_superClassifiers_2_0= ruleClassifierOrTypeReference )
            	    // InternalAadlV3.g:4638:6: lv_superClassifiers_2_0= ruleClassifierOrTypeReference
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConfigurationExtensionsAccess().getSuperClassifiersClassifierOrTypeReferenceParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_76);
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
            	    break loop81;
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
    // InternalAadlV3.g:4661:1: ruleImplementationExtensions[EObject in_current] returns [EObject current=in_current] : ( ( (lv_superClassifiers_0_0= ruleImplementationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) ) )* ) ;
    public final EObject ruleImplementationExtensions(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_superClassifiers_0_0 = null;

        EObject lv_superClassifiers_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4667:2: ( ( ( (lv_superClassifiers_0_0= ruleImplementationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) ) )* ) )
            // InternalAadlV3.g:4668:2: ( ( (lv_superClassifiers_0_0= ruleImplementationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) ) )* )
            {
            // InternalAadlV3.g:4668:2: ( ( (lv_superClassifiers_0_0= ruleImplementationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) ) )* )
            // InternalAadlV3.g:4669:3: ( (lv_superClassifiers_0_0= ruleImplementationReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) ) )*
            {
            // InternalAadlV3.g:4669:3: ( (lv_superClassifiers_0_0= ruleImplementationReference ) )
            // InternalAadlV3.g:4670:4: (lv_superClassifiers_0_0= ruleImplementationReference )
            {
            // InternalAadlV3.g:4670:4: (lv_superClassifiers_0_0= ruleImplementationReference )
            // InternalAadlV3.g:4671:5: lv_superClassifiers_0_0= ruleImplementationReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImplementationExtensionsAccess().getSuperClassifiersImplementationReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_76);
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

            // InternalAadlV3.g:4688:3: (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==26) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalAadlV3.g:4689:4: otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleImplementationReference ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getImplementationExtensionsAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalAadlV3.g:4693:4: ( (lv_superClassifiers_2_0= ruleImplementationReference ) )
            	    // InternalAadlV3.g:4694:5: (lv_superClassifiers_2_0= ruleImplementationReference )
            	    {
            	    // InternalAadlV3.g:4694:5: (lv_superClassifiers_2_0= ruleImplementationReference )
            	    // InternalAadlV3.g:4695:6: lv_superClassifiers_2_0= ruleImplementationReference
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getImplementationExtensionsAccess().getSuperClassifiersImplementationReferenceParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_76);
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
    // $ANTLR end "ruleImplementationExtensions"


    // $ANTLR start "ruleInterfaceExtensions"
    // InternalAadlV3.g:4718:1: ruleInterfaceExtensions[EObject in_current] returns [EObject current=in_current] : ( ( (lv_superClassifiers_0_0= ruleReversableInterfaceReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) ) )* ) ;
    public final EObject ruleInterfaceExtensions(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_superClassifiers_0_0 = null;

        EObject lv_superClassifiers_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4724:2: ( ( ( (lv_superClassifiers_0_0= ruleReversableInterfaceReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) ) )* ) )
            // InternalAadlV3.g:4725:2: ( ( (lv_superClassifiers_0_0= ruleReversableInterfaceReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) ) )* )
            {
            // InternalAadlV3.g:4725:2: ( ( (lv_superClassifiers_0_0= ruleReversableInterfaceReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) ) )* )
            // InternalAadlV3.g:4726:3: ( (lv_superClassifiers_0_0= ruleReversableInterfaceReference ) ) (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) ) )*
            {
            // InternalAadlV3.g:4726:3: ( (lv_superClassifiers_0_0= ruleReversableInterfaceReference ) )
            // InternalAadlV3.g:4727:4: (lv_superClassifiers_0_0= ruleReversableInterfaceReference )
            {
            // InternalAadlV3.g:4727:4: (lv_superClassifiers_0_0= ruleReversableInterfaceReference )
            // InternalAadlV3.g:4728:5: lv_superClassifiers_0_0= ruleReversableInterfaceReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInterfaceExtensionsAccess().getSuperClassifiersReversableInterfaceReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_76);
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

            // InternalAadlV3.g:4745:3: (otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==26) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // InternalAadlV3.g:4746:4: otherlv_1= ',' ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_39); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getInterfaceExtensionsAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalAadlV3.g:4750:4: ( (lv_superClassifiers_2_0= ruleReversableInterfaceReference ) )
            	    // InternalAadlV3.g:4751:5: (lv_superClassifiers_2_0= ruleReversableInterfaceReference )
            	    {
            	    // InternalAadlV3.g:4751:5: (lv_superClassifiers_2_0= ruleReversableInterfaceReference )
            	    // InternalAadlV3.g:4752:6: lv_superClassifiers_2_0= ruleReversableInterfaceReference
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getInterfaceExtensionsAccess().getSuperClassifiersReversableInterfaceReferenceParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_76);
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
            	    break loop83;
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
    // InternalAadlV3.g:4775:1: ruleConfigurationActuals[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '(' ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )? otherlv_4= ')' ) ;
    public final EObject ruleConfigurationActuals(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_actuals_1_0 = null;

        EObject lv_actuals_3_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4781:2: ( (otherlv_0= '(' ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )? otherlv_4= ')' ) )
            // InternalAadlV3.g:4782:2: (otherlv_0= '(' ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )? otherlv_4= ')' )
            {
            // InternalAadlV3.g:4782:2: (otherlv_0= '(' ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )? otherlv_4= ')' )
            // InternalAadlV3.g:4783:3: otherlv_0= '(' ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )? otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConfigurationActualsAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalAadlV3.g:4787:3: ( ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )* )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==RULE_ID) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalAadlV3.g:4788:4: ( (lv_actuals_1_0= ruleConfigurationActual ) ) (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )*
                    {
                    // InternalAadlV3.g:4788:4: ( (lv_actuals_1_0= ruleConfigurationActual ) )
                    // InternalAadlV3.g:4789:5: (lv_actuals_1_0= ruleConfigurationActual )
                    {
                    // InternalAadlV3.g:4789:5: (lv_actuals_1_0= ruleConfigurationActual )
                    // InternalAadlV3.g:4790:6: lv_actuals_1_0= ruleConfigurationActual
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConfigurationActualsAccess().getActualsConfigurationActualParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_20);
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

                    // InternalAadlV3.g:4807:4: (otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) ) )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==26) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // InternalAadlV3.g:4808:5: otherlv_2= ',' ( (lv_actuals_3_0= ruleConfigurationActual ) )
                    	    {
                    	    otherlv_2=(Token)match(input,26,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getConfigurationActualsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalAadlV3.g:4812:5: ( (lv_actuals_3_0= ruleConfigurationActual ) )
                    	    // InternalAadlV3.g:4813:6: (lv_actuals_3_0= ruleConfigurationActual )
                    	    {
                    	    // InternalAadlV3.g:4813:6: (lv_actuals_3_0= ruleConfigurationActual )
                    	    // InternalAadlV3.g:4814:7: lv_actuals_3_0= ruleConfigurationActual
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getConfigurationActualsAccess().getActualsConfigurationActualParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_20);
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
                    	    break loop84;
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
    // InternalAadlV3.g:4841:1: entryRuleConfigurationActual returns [EObject current=null] : iv_ruleConfigurationActual= ruleConfigurationActual EOF ;
    public final EObject entryRuleConfigurationActual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationActual = null;


        try {
            // InternalAadlV3.g:4841:60: (iv_ruleConfigurationActual= ruleConfigurationActual EOF )
            // InternalAadlV3.g:4842:2: iv_ruleConfigurationActual= ruleConfigurationActual EOF
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
    // InternalAadlV3.g:4848:1: ruleConfigurationActual returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* ) ;
    public final EObject ruleConfigurationActual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_assignedClassifiers_2_0 = null;

        EObject lv_assignedClassifiers_4_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:4854:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* ) )
            // InternalAadlV3.g:4855:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* )
            {
            // InternalAadlV3.g:4855:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )* )
            // InternalAadlV3.g:4856:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) ) (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )*
            {
            // InternalAadlV3.g:4856:3: ( (otherlv_0= RULE_ID ) )
            // InternalAadlV3.g:4857:4: (otherlv_0= RULE_ID )
            {
            // InternalAadlV3.g:4857:4: (otherlv_0= RULE_ID )
            // InternalAadlV3.g:4858:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConfigurationActualRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getConfigurationActualAccess().getParameterConfigurationParameterCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConfigurationActualAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            // InternalAadlV3.g:4876:3: ( (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference ) )
            // InternalAadlV3.g:4877:4: (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference )
            {
            // InternalAadlV3.g:4877:4: (lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference )
            // InternalAadlV3.g:4878:5: lv_assignedClassifiers_2_0= ruleClassifierOrTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConfigurationActualAccess().getAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_76);
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

            // InternalAadlV3.g:4895:3: (otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) ) )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==26) ) {
                    int LA86_1 = input.LA(2);

                    if ( (LA86_1==RULE_ID) ) {
                        int LA86_3 = input.LA(3);

                        if ( (LA86_3==EOF||LA86_3==24||(LA86_3>=26 && LA86_3<=27)||LA86_3==36||LA86_3==61) ) {
                            alt86=1;
                        }


                    }


                }


                switch (alt86) {
            	case 1 :
            	    // InternalAadlV3.g:4896:4: otherlv_3= ',' ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) )
            	    {
            	    otherlv_3=(Token)match(input,26,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getConfigurationActualAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalAadlV3.g:4900:4: ( (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference ) )
            	    // InternalAadlV3.g:4901:5: (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference )
            	    {
            	    // InternalAadlV3.g:4901:5: (lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference )
            	    // InternalAadlV3.g:4902:6: lv_assignedClassifiers_4_0= ruleClassifierOrTypeReference
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConfigurationActualAccess().getAssignedClassifiersClassifierOrTypeReferenceParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_76);
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
            	    break loop86;
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
    // InternalAadlV3.g:4924:1: entryRuleWorkingset returns [EObject current=null] : iv_ruleWorkingset= ruleWorkingset EOF ;
    public final EObject entryRuleWorkingset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkingset = null;


        try {
            // InternalAadlV3.g:4924:51: (iv_ruleWorkingset= ruleWorkingset EOF )
            // InternalAadlV3.g:4925:2: iv_ruleWorkingset= ruleWorkingset EOF
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
    // InternalAadlV3.g:4931:1: ruleWorkingset returns [EObject current=null] : ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'workingset' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'is' (this_UseProps_4= ruleUseProps[$current] )? ( (lv_instanceRoots_5_0= ruleInstanceConfiguration ) )* otherlv_6= 'end' otherlv_7= ';' ) ;
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
            // InternalAadlV3.g:4937:2: ( ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'workingset' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'is' (this_UseProps_4= ruleUseProps[$current] )? ( (lv_instanceRoots_5_0= ruleInstanceConfiguration ) )* otherlv_6= 'end' otherlv_7= ';' ) )
            // InternalAadlV3.g:4938:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'workingset' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'is' (this_UseProps_4= ruleUseProps[$current] )? ( (lv_instanceRoots_5_0= ruleInstanceConfiguration ) )* otherlv_6= 'end' otherlv_7= ';' )
            {
            // InternalAadlV3.g:4938:2: ( ( (lv_private_0_0= 'private' ) )? otherlv_1= 'workingset' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'is' (this_UseProps_4= ruleUseProps[$current] )? ( (lv_instanceRoots_5_0= ruleInstanceConfiguration ) )* otherlv_6= 'end' otherlv_7= ';' )
            // InternalAadlV3.g:4939:3: ( (lv_private_0_0= 'private' ) )? otherlv_1= 'workingset' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'is' (this_UseProps_4= ruleUseProps[$current] )? ( (lv_instanceRoots_5_0= ruleInstanceConfiguration ) )* otherlv_6= 'end' otherlv_7= ';'
            {
            // InternalAadlV3.g:4939:3: ( (lv_private_0_0= 'private' ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==13) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalAadlV3.g:4940:4: (lv_private_0_0= 'private' )
                    {
                    // InternalAadlV3.g:4940:4: (lv_private_0_0= 'private' )
                    // InternalAadlV3.g:4941:5: lv_private_0_0= 'private'
                    {
                    lv_private_0_0=(Token)match(input,13,FOLLOW_77); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,49,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWorkingsetAccess().getWorkingsetKeyword_1());
              		
            }
            // InternalAadlV3.g:4957:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalAadlV3.g:4958:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalAadlV3.g:4958:4: (lv_name_2_0= ruleQualifiedName )
            // InternalAadlV3.g:4959:5: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWorkingsetAccess().getNameQualifiedNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_6);
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

            otherlv_3=(Token)match(input,15,FOLLOW_78); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getWorkingsetAccess().getIsKeyword_3());
              		
            }
            // InternalAadlV3.g:4980:3: (this_UseProps_4= ruleUseProps[$current] )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==41) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalAadlV3.g:4981:4: this_UseProps_4= ruleUseProps[$current]
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
                    pushFollow(FOLLOW_79);
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

            // InternalAadlV3.g:4996:3: ( (lv_instanceRoots_5_0= ruleInstanceConfiguration ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==RULE_ID) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // InternalAadlV3.g:4997:4: (lv_instanceRoots_5_0= ruleInstanceConfiguration )
            	    {
            	    // InternalAadlV3.g:4997:4: (lv_instanceRoots_5_0= ruleInstanceConfiguration )
            	    // InternalAadlV3.g:4998:5: lv_instanceRoots_5_0= ruleInstanceConfiguration
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getWorkingsetAccess().getInstanceRootsInstanceConfigurationParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_79);
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
            	    break loop89;
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
    // InternalAadlV3.g:5027:1: entryRuleInstanceConfiguration returns [EObject current=null] : iv_ruleInstanceConfiguration= ruleInstanceConfiguration EOF ;
    public final EObject entryRuleInstanceConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceConfiguration = null;


        try {
            // InternalAadlV3.g:5027:62: (iv_ruleInstanceConfiguration= ruleInstanceConfiguration EOF )
            // InternalAadlV3.g:5028:2: iv_ruleInstanceConfiguration= ruleInstanceConfiguration EOF
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
    // InternalAadlV3.g:5034:1: ruleInstanceConfiguration returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_category_3_0= ruleComponentCategory ) ) ( (lv_typeReferences_4_0= ruleClassifierOrTypeReference ) ) ( (lv_actions_5_0= RULE_STRING ) )* ( (lv_productlineConstraint_6_0= ruleProductLineConstraint ) )? otherlv_7= ';' ) ;
    public final EObject ruleInstanceConfiguration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_actions_5_0=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_category_3_0 = null;

        EObject lv_typeReferences_4_0 = null;

        EObject lv_productlineConstraint_6_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:5040:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_category_3_0= ruleComponentCategory ) ) ( (lv_typeReferences_4_0= ruleClassifierOrTypeReference ) ) ( (lv_actions_5_0= RULE_STRING ) )* ( (lv_productlineConstraint_6_0= ruleProductLineConstraint ) )? otherlv_7= ';' ) )
            // InternalAadlV3.g:5041:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_category_3_0= ruleComponentCategory ) ) ( (lv_typeReferences_4_0= ruleClassifierOrTypeReference ) ) ( (lv_actions_5_0= RULE_STRING ) )* ( (lv_productlineConstraint_6_0= ruleProductLineConstraint ) )? otherlv_7= ';' )
            {
            // InternalAadlV3.g:5041:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_category_3_0= ruleComponentCategory ) ) ( (lv_typeReferences_4_0= ruleClassifierOrTypeReference ) ) ( (lv_actions_5_0= RULE_STRING ) )* ( (lv_productlineConstraint_6_0= ruleProductLineConstraint ) )? otherlv_7= ';' )
            // InternalAadlV3.g:5042:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_category_3_0= ruleComponentCategory ) ) ( (lv_typeReferences_4_0= ruleClassifierOrTypeReference ) ) ( (lv_actions_5_0= RULE_STRING ) )* ( (lv_productlineConstraint_6_0= ruleProductLineConstraint ) )? otherlv_7= ';'
            {
            // InternalAadlV3.g:5042:3: ()
            // InternalAadlV3.g:5043:4: 
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

            // InternalAadlV3.g:5052:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAadlV3.g:5053:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAadlV3.g:5053:4: (lv_name_1_0= RULE_ID )
            // InternalAadlV3.g:5054:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,22,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getInstanceConfigurationAccess().getColonKeyword_2());
              		
            }
            // InternalAadlV3.g:5074:3: ( (lv_category_3_0= ruleComponentCategory ) )
            // InternalAadlV3.g:5075:4: (lv_category_3_0= ruleComponentCategory )
            {
            // InternalAadlV3.g:5075:4: (lv_category_3_0= ruleComponentCategory )
            // InternalAadlV3.g:5076:5: lv_category_3_0= ruleComponentCategory
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInstanceConfigurationAccess().getCategoryComponentCategoryParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_5);
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

            // InternalAadlV3.g:5093:3: ( (lv_typeReferences_4_0= ruleClassifierOrTypeReference ) )
            // InternalAadlV3.g:5094:4: (lv_typeReferences_4_0= ruleClassifierOrTypeReference )
            {
            // InternalAadlV3.g:5094:4: (lv_typeReferences_4_0= ruleClassifierOrTypeReference )
            // InternalAadlV3.g:5095:5: lv_typeReferences_4_0= ruleClassifierOrTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInstanceConfigurationAccess().getTypeReferencesClassifierOrTypeReferenceParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_80);
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

            // InternalAadlV3.g:5112:3: ( (lv_actions_5_0= RULE_STRING ) )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==RULE_STRING) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // InternalAadlV3.g:5113:4: (lv_actions_5_0= RULE_STRING )
            	    {
            	    // InternalAadlV3.g:5113:4: (lv_actions_5_0= RULE_STRING )
            	    // InternalAadlV3.g:5114:5: lv_actions_5_0= RULE_STRING
            	    {
            	    lv_actions_5_0=(Token)match(input,RULE_STRING,FOLLOW_80); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(lv_actions_5_0, grammarAccess.getInstanceConfigurationAccess().getActionsSTRINGTerminalRuleCall_5_0());
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElement(grammarAccess.getInstanceConfigurationRule());
            	      					}
            	      					addWithLastConsumed(
            	      						current,
            	      						"actions",
            	      						lv_actions_5_0,
            	      						"org.eclipse.xtext.common.Terminals.STRING");
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop90;
                }
            } while (true);

            // InternalAadlV3.g:5130:3: ( (lv_productlineConstraint_6_0= ruleProductLineConstraint ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==50) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalAadlV3.g:5131:4: (lv_productlineConstraint_6_0= ruleProductLineConstraint )
                    {
                    // InternalAadlV3.g:5131:4: (lv_productlineConstraint_6_0= ruleProductLineConstraint )
                    // InternalAadlV3.g:5132:5: lv_productlineConstraint_6_0= ruleProductLineConstraint
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getInstanceConfigurationAccess().getProductlineConstraintProductLineConstraintParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_9);
                    lv_productlineConstraint_6_0=ruleProductLineConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getInstanceConfigurationRule());
                      					}
                      					set(
                      						current,
                      						"productlineConstraint",
                      						lv_productlineConstraint_6_0,
                      						"org.osate.xtext.aadlv3.AadlV3.ProductLineConstraint");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getInstanceConfigurationAccess().getSemicolonKeyword_7());
              		
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
    // InternalAadlV3.g:5157:1: entryRuleProductLineConstraint returns [EObject current=null] : iv_ruleProductLineConstraint= ruleProductLineConstraint EOF ;
    public final EObject entryRuleProductLineConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductLineConstraint = null;


        try {
            // InternalAadlV3.g:5157:62: (iv_ruleProductLineConstraint= ruleProductLineConstraint EOF )
            // InternalAadlV3.g:5158:2: iv_ruleProductLineConstraint= ruleProductLineConstraint EOF
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
    // InternalAadlV3.g:5164:1: ruleProductLineConstraint returns [EObject current=null] : ( () otherlv_1= 'plc' ( (lv_left_2_0= rulePropertyReference ) ) ( (lv_operator_3_0= ruleSatisfiesOperation ) ) ( (lv_right_4_0= ruleListLiteral ) ) ) ;
    public final EObject ruleProductLineConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_2_0 = null;

        AntlrDatatypeRuleToken lv_operator_3_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:5170:2: ( ( () otherlv_1= 'plc' ( (lv_left_2_0= rulePropertyReference ) ) ( (lv_operator_3_0= ruleSatisfiesOperation ) ) ( (lv_right_4_0= ruleListLiteral ) ) ) )
            // InternalAadlV3.g:5171:2: ( () otherlv_1= 'plc' ( (lv_left_2_0= rulePropertyReference ) ) ( (lv_operator_3_0= ruleSatisfiesOperation ) ) ( (lv_right_4_0= ruleListLiteral ) ) )
            {
            // InternalAadlV3.g:5171:2: ( () otherlv_1= 'plc' ( (lv_left_2_0= rulePropertyReference ) ) ( (lv_operator_3_0= ruleSatisfiesOperation ) ) ( (lv_right_4_0= ruleListLiteral ) ) )
            // InternalAadlV3.g:5172:3: () otherlv_1= 'plc' ( (lv_left_2_0= rulePropertyReference ) ) ( (lv_operator_3_0= ruleSatisfiesOperation ) ) ( (lv_right_4_0= ruleListLiteral ) )
            {
            // InternalAadlV3.g:5172:3: ()
            // InternalAadlV3.g:5173:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProductLineConstraintAccess().getBinaryOperationAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProductLineConstraintAccess().getPlcKeyword_1());
              		
            }
            // InternalAadlV3.g:5186:3: ( (lv_left_2_0= rulePropertyReference ) )
            // InternalAadlV3.g:5187:4: (lv_left_2_0= rulePropertyReference )
            {
            // InternalAadlV3.g:5187:4: (lv_left_2_0= rulePropertyReference )
            // InternalAadlV3.g:5188:5: lv_left_2_0= rulePropertyReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getProductLineConstraintAccess().getLeftPropertyReferenceParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_81);
            lv_left_2_0=rulePropertyReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getProductLineConstraintRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_2_0,
              						"org.osate.xtext.aadlv3.AadlV3.PropertyReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:5205:3: ( (lv_operator_3_0= ruleSatisfiesOperation ) )
            // InternalAadlV3.g:5206:4: (lv_operator_3_0= ruleSatisfiesOperation )
            {
            // InternalAadlV3.g:5206:4: (lv_operator_3_0= ruleSatisfiesOperation )
            // InternalAadlV3.g:5207:5: lv_operator_3_0= ruleSatisfiesOperation
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getProductLineConstraintAccess().getOperatorSatisfiesOperationParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_operator_3_0=ruleSatisfiesOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getProductLineConstraintRule());
              					}
              					set(
              						current,
              						"operator",
              						lv_operator_3_0,
              						"org.osate.xtext.aadlv3.AadlV3.SatisfiesOperation");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:5224:3: ( (lv_right_4_0= ruleListLiteral ) )
            // InternalAadlV3.g:5225:4: (lv_right_4_0= ruleListLiteral )
            {
            // InternalAadlV3.g:5225:4: (lv_right_4_0= ruleListLiteral )
            // InternalAadlV3.g:5226:5: lv_right_4_0= ruleListLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getProductLineConstraintAccess().getRightListLiteralParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_right_4_0=ruleListLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getProductLineConstraintRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_4_0,
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


    // $ANTLR start "entryRuleBehaviorSpecification"
    // InternalAadlV3.g:5247:1: entryRuleBehaviorSpecification returns [EObject current=null] : iv_ruleBehaviorSpecification= ruleBehaviorSpecification EOF ;
    public final EObject entryRuleBehaviorSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorSpecification = null;


        try {
            // InternalAadlV3.g:5247:62: (iv_ruleBehaviorSpecification= ruleBehaviorSpecification EOF )
            // InternalAadlV3.g:5248:2: iv_ruleBehaviorSpecification= ruleBehaviorSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBehaviorSpecificationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBehaviorSpecification=ruleBehaviorSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBehaviorSpecification; 
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
    // $ANTLR end "entryRuleBehaviorSpecification"


    // $ANTLR start "ruleBehaviorSpecification"
    // InternalAadlV3.g:5254:1: ruleBehaviorSpecification returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' this_BehaviorSpecificationBlock_3= ruleBehaviorSpecificationBlock[$current] otherlv_4= '}' otherlv_5= ';' ) ;
    public final EObject ruleBehaviorSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject this_BehaviorSpecificationBlock_3 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:5260:2: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' this_BehaviorSpecificationBlock_3= ruleBehaviorSpecificationBlock[$current] otherlv_4= '}' otherlv_5= ';' ) )
            // InternalAadlV3.g:5261:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' this_BehaviorSpecificationBlock_3= ruleBehaviorSpecificationBlock[$current] otherlv_4= '}' otherlv_5= ';' )
            {
            // InternalAadlV3.g:5261:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' this_BehaviorSpecificationBlock_3= ruleBehaviorSpecificationBlock[$current] otherlv_4= '}' otherlv_5= ';' )
            // InternalAadlV3.g:5262:3: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' this_BehaviorSpecificationBlock_3= ruleBehaviorSpecificationBlock[$current] otherlv_4= '}' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBehaviorSpecificationAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalAadlV3.g:5266:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAadlV3.g:5267:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAadlV3.g:5267:4: (lv_name_1_0= RULE_ID )
            // InternalAadlV3.g:5268:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getBehaviorSpecificationAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBehaviorSpecificationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_82); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getBehaviorSpecificationAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getBehaviorSpecificationRule());
              			}
              			newCompositeNode(grammarAccess.getBehaviorSpecificationAccess().getBehaviorSpecificationBlockParserRuleCall_3());
              		
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

              			newLeafNode(otherlv_4, grammarAccess.getBehaviorSpecificationAccess().getRightCurlyBracketKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getBehaviorSpecificationAccess().getSemicolonKeyword_5());
              		
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
    // $ANTLR end "ruleBehaviorSpecification"


    // $ANTLR start "ruleBehaviorSpecificationBlock"
    // InternalAadlV3.g:5315:1: ruleBehaviorSpecificationBlock[EObject in_current] returns [EObject current=in_current] : (this_BehaviorSpecificationElement_0= ruleBehaviorSpecificationElement[$current] )* ;
    public final EObject ruleBehaviorSpecificationBlock(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_BehaviorSpecificationElement_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:5321:2: ( (this_BehaviorSpecificationElement_0= ruleBehaviorSpecificationElement[$current] )* )
            // InternalAadlV3.g:5322:2: (this_BehaviorSpecificationElement_0= ruleBehaviorSpecificationElement[$current] )*
            {
            // InternalAadlV3.g:5322:2: (this_BehaviorSpecificationElement_0= ruleBehaviorSpecificationElement[$current] )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==RULE_ID||LA92_0==18) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // InternalAadlV3.g:5323:3: this_BehaviorSpecificationElement_0= ruleBehaviorSpecificationElement[$current]
            	    {
            	    if ( state.backtracking==0 ) {

            	      			/* */
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      				current = createModelElement(grammarAccess.getBehaviorSpecificationBlockRule());
            	      			}
            	      			newCompositeNode(grammarAccess.getBehaviorSpecificationBlockAccess().getBehaviorSpecificationElementParserRuleCall());
            	      		
            	    }
            	    pushFollow(FOLLOW_83);
            	    this_BehaviorSpecificationElement_0=ruleBehaviorSpecificationElement(current);

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current = this_BehaviorSpecificationElement_0;
            	      			afterParserOrEnumRuleCall();
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    break loop92;
                }
            } while (true);


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
    // InternalAadlV3.g:5342:1: ruleBehaviorSpecificationElement[EObject in_current] returns [EObject current=in_current] : ( ( (lv_generators_0_0= ruleGenerator ) ) | ( (lv_transitions_1_0= ruleTransitionRule ) ) | ( (lv_rules_2_0= ruleBehaviorRule ) ) | ( (lv_stateVariables_3_0= ruleStateVariable ) ) ) ;
    public final EObject ruleBehaviorSpecificationElement(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_generators_0_0 = null;

        EObject lv_transitions_1_0 = null;

        EObject lv_rules_2_0 = null;

        EObject lv_stateVariables_3_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:5348:2: ( ( ( (lv_generators_0_0= ruleGenerator ) ) | ( (lv_transitions_1_0= ruleTransitionRule ) ) | ( (lv_rules_2_0= ruleBehaviorRule ) ) | ( (lv_stateVariables_3_0= ruleStateVariable ) ) ) )
            // InternalAadlV3.g:5349:2: ( ( (lv_generators_0_0= ruleGenerator ) ) | ( (lv_transitions_1_0= ruleTransitionRule ) ) | ( (lv_rules_2_0= ruleBehaviorRule ) ) | ( (lv_stateVariables_3_0= ruleStateVariable ) ) )
            {
            // InternalAadlV3.g:5349:2: ( ( (lv_generators_0_0= ruleGenerator ) ) | ( (lv_transitions_1_0= ruleTransitionRule ) ) | ( (lv_rules_2_0= ruleBehaviorRule ) ) | ( (lv_stateVariables_3_0= ruleStateVariable ) ) )
            int alt93=4;
            alt93 = dfa93.predict(input);
            switch (alt93) {
                case 1 :
                    // InternalAadlV3.g:5350:3: ( (lv_generators_0_0= ruleGenerator ) )
                    {
                    // InternalAadlV3.g:5350:3: ( (lv_generators_0_0= ruleGenerator ) )
                    // InternalAadlV3.g:5351:4: (lv_generators_0_0= ruleGenerator )
                    {
                    // InternalAadlV3.g:5351:4: (lv_generators_0_0= ruleGenerator )
                    // InternalAadlV3.g:5352:5: lv_generators_0_0= ruleGenerator
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBehaviorSpecificationElementAccess().getGeneratorsGeneratorParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_generators_0_0=ruleGenerator();

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
                      						"org.osate.xtext.aadlv3.AadlV3.Generator");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:5370:3: ( (lv_transitions_1_0= ruleTransitionRule ) )
                    {
                    // InternalAadlV3.g:5370:3: ( (lv_transitions_1_0= ruleTransitionRule ) )
                    // InternalAadlV3.g:5371:4: (lv_transitions_1_0= ruleTransitionRule )
                    {
                    // InternalAadlV3.g:5371:4: (lv_transitions_1_0= ruleTransitionRule )
                    // InternalAadlV3.g:5372:5: lv_transitions_1_0= ruleTransitionRule
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBehaviorSpecificationElementAccess().getTransitionsTransitionRuleParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_transitions_1_0=ruleTransitionRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getBehaviorSpecificationElementRule());
                      					}
                      					add(
                      						current,
                      						"transitions",
                      						lv_transitions_1_0,
                      						"org.osate.xtext.aadlv3.AadlV3.TransitionRule");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:5390:3: ( (lv_rules_2_0= ruleBehaviorRule ) )
                    {
                    // InternalAadlV3.g:5390:3: ( (lv_rules_2_0= ruleBehaviorRule ) )
                    // InternalAadlV3.g:5391:4: (lv_rules_2_0= ruleBehaviorRule )
                    {
                    // InternalAadlV3.g:5391:4: (lv_rules_2_0= ruleBehaviorRule )
                    // InternalAadlV3.g:5392:5: lv_rules_2_0= ruleBehaviorRule
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBehaviorSpecificationElementAccess().getRulesBehaviorRuleParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_rules_2_0=ruleBehaviorRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getBehaviorSpecificationElementRule());
                      					}
                      					add(
                      						current,
                      						"rules",
                      						lv_rules_2_0,
                      						"org.osate.xtext.aadlv3.AadlV3.BehaviorRule");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAadlV3.g:5410:3: ( (lv_stateVariables_3_0= ruleStateVariable ) )
                    {
                    // InternalAadlV3.g:5410:3: ( (lv_stateVariables_3_0= ruleStateVariable ) )
                    // InternalAadlV3.g:5411:4: (lv_stateVariables_3_0= ruleStateVariable )
                    {
                    // InternalAadlV3.g:5411:4: (lv_stateVariables_3_0= ruleStateVariable )
                    // InternalAadlV3.g:5412:5: lv_stateVariables_3_0= ruleStateVariable
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBehaviorSpecificationElementAccess().getStateVariablesStateVariableParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_stateVariables_3_0=ruleStateVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getBehaviorSpecificationElementRule());
                      					}
                      					add(
                      						current,
                      						"stateVariables",
                      						lv_stateVariables_3_0,
                      						"org.osate.xtext.aadlv3.AadlV3.StateVariable");
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


    // $ANTLR start "entryRuleStateVariable"
    // InternalAadlV3.g:5433:1: entryRuleStateVariable returns [EObject current=null] : iv_ruleStateVariable= ruleStateVariable EOF ;
    public final EObject entryRuleStateVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateVariable = null;


        try {
            // InternalAadlV3.g:5433:54: (iv_ruleStateVariable= ruleStateVariable EOF )
            // InternalAadlV3.g:5434:2: iv_ruleStateVariable= ruleStateVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStateVariable=ruleStateVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateVariable; 
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
    // $ANTLR end "entryRuleStateVariable"


    // $ANTLR start "ruleStateVariable"
    // InternalAadlV3.g:5440:1: ruleStateVariable returns [EObject current=null] : ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'state' ( ( ruleQualifiedName ) ) ( (lv_initialState_5_0= ruleEnumerationLiteral ) )? (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? otherlv_7= ';' ) ;
    public final EObject ruleStateVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        EObject this_Annotation_0 = null;

        EObject lv_initialState_5_0 = null;

        EObject this_PropertiesBlock_6 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:5446:2: ( ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'state' ( ( ruleQualifiedName ) ) ( (lv_initialState_5_0= ruleEnumerationLiteral ) )? (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? otherlv_7= ';' ) )
            // InternalAadlV3.g:5447:2: ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'state' ( ( ruleQualifiedName ) ) ( (lv_initialState_5_0= ruleEnumerationLiteral ) )? (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? otherlv_7= ';' )
            {
            // InternalAadlV3.g:5447:2: ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'state' ( ( ruleQualifiedName ) ) ( (lv_initialState_5_0= ruleEnumerationLiteral ) )? (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? otherlv_7= ';' )
            // InternalAadlV3.g:5448:3: (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'state' ( ( ruleQualifiedName ) ) ( (lv_initialState_5_0= ruleEnumerationLiteral ) )? (this_PropertiesBlock_6= rulePropertiesBlock[$current] )? otherlv_7= ';'
            {
            // InternalAadlV3.g:5448:3: (this_Annotation_0= ruleAnnotation[$current] )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==18) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // InternalAadlV3.g:5449:4: this_Annotation_0= ruleAnnotation[$current]
            	    {
            	    if ( state.backtracking==0 ) {

            	      				/* */
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElement(grammarAccess.getStateVariableRule());
            	      				}
            	      				newCompositeNode(grammarAccess.getStateVariableAccess().getAnnotationParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_47);
            	    this_Annotation_0=ruleAnnotation(current);

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current = this_Annotation_0;
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);

            // InternalAadlV3.g:5464:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAadlV3.g:5465:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAadlV3.g:5465:4: (lv_name_1_0= RULE_ID )
            // InternalAadlV3.g:5466:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getStateVariableAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getStateVariableRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_84); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getStateVariableAccess().getColonKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,51,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getStateVariableAccess().getStateKeyword_3());
              		
            }
            // InternalAadlV3.g:5490:3: ( ( ruleQualifiedName ) )
            // InternalAadlV3.g:5491:4: ( ruleQualifiedName )
            {
            // InternalAadlV3.g:5491:4: ( ruleQualifiedName )
            // InternalAadlV3.g:5492:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getStateVariableRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStateVariableAccess().getStateTypeTypeDefCrossReference_4_0());
              				
            }
            pushFollow(FOLLOW_85);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:5509:3: ( (lv_initialState_5_0= ruleEnumerationLiteral ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==RULE_ID) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalAadlV3.g:5510:4: (lv_initialState_5_0= ruleEnumerationLiteral )
                    {
                    // InternalAadlV3.g:5510:4: (lv_initialState_5_0= ruleEnumerationLiteral )
                    // InternalAadlV3.g:5511:5: lv_initialState_5_0= ruleEnumerationLiteral
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getStateVariableAccess().getInitialStateEnumerationLiteralParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_28);
                    lv_initialState_5_0=ruleEnumerationLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getStateVariableRule());
                      					}
                      					set(
                      						current,
                      						"initialState",
                      						lv_initialState_5_0,
                      						"org.osate.xtext.aadlv3.AadlV3.EnumerationLiteral");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalAadlV3.g:5528:3: (this_PropertiesBlock_6= rulePropertiesBlock[$current] )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==19) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalAadlV3.g:5529:4: this_PropertiesBlock_6= rulePropertiesBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getStateVariableRule());
                      				}
                      				newCompositeNode(grammarAccess.getStateVariableAccess().getPropertiesBlockParserRuleCall_6());
                      			
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

              			newLeafNode(otherlv_7, grammarAccess.getStateVariableAccess().getSemicolonKeyword_7());
              		
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
    // $ANTLR end "ruleStateVariable"


    // $ANTLR start "entryRuleGenerator"
    // InternalAadlV3.g:5552:1: entryRuleGenerator returns [EObject current=null] : iv_ruleGenerator= ruleGenerator EOF ;
    public final EObject entryRuleGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenerator = null;


        try {
            // InternalAadlV3.g:5552:50: (iv_ruleGenerator= ruleGenerator EOF )
            // InternalAadlV3.g:5553:2: iv_ruleGenerator= ruleGenerator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGeneratorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGenerator=ruleGenerator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGenerator; 
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
    // $ANTLR end "entryRuleGenerator"


    // $ANTLR start "ruleGenerator"
    // InternalAadlV3.g:5559:1: ruleGenerator returns [EObject current=null] : ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_type_3_1= 'error' | lv_type_3_2= 'recover' | lv_type_3_3= 'repair' ) ) ) ( (lv_value_4_0= ruleListLiteral ) )? (this_PropertiesBlock_5= rulePropertiesBlock[$current] )? otherlv_6= ';' ) ;
    public final EObject ruleGenerator() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_1=null;
        Token lv_type_3_2=null;
        Token lv_type_3_3=null;
        Token otherlv_6=null;
        EObject this_Annotation_0 = null;

        EObject lv_value_4_0 = null;

        EObject this_PropertiesBlock_5 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:5565:2: ( ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_type_3_1= 'error' | lv_type_3_2= 'recover' | lv_type_3_3= 'repair' ) ) ) ( (lv_value_4_0= ruleListLiteral ) )? (this_PropertiesBlock_5= rulePropertiesBlock[$current] )? otherlv_6= ';' ) )
            // InternalAadlV3.g:5566:2: ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_type_3_1= 'error' | lv_type_3_2= 'recover' | lv_type_3_3= 'repair' ) ) ) ( (lv_value_4_0= ruleListLiteral ) )? (this_PropertiesBlock_5= rulePropertiesBlock[$current] )? otherlv_6= ';' )
            {
            // InternalAadlV3.g:5566:2: ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_type_3_1= 'error' | lv_type_3_2= 'recover' | lv_type_3_3= 'repair' ) ) ) ( (lv_value_4_0= ruleListLiteral ) )? (this_PropertiesBlock_5= rulePropertiesBlock[$current] )? otherlv_6= ';' )
            // InternalAadlV3.g:5567:3: (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_type_3_1= 'error' | lv_type_3_2= 'recover' | lv_type_3_3= 'repair' ) ) ) ( (lv_value_4_0= ruleListLiteral ) )? (this_PropertiesBlock_5= rulePropertiesBlock[$current] )? otherlv_6= ';'
            {
            // InternalAadlV3.g:5567:3: (this_Annotation_0= ruleAnnotation[$current] )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==18) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // InternalAadlV3.g:5568:4: this_Annotation_0= ruleAnnotation[$current]
            	    {
            	    if ( state.backtracking==0 ) {

            	      				/* */
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElement(grammarAccess.getGeneratorRule());
            	      				}
            	      				newCompositeNode(grammarAccess.getGeneratorAccess().getAnnotationParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_47);
            	    this_Annotation_0=ruleAnnotation(current);

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current = this_Annotation_0;
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop97;
                }
            } while (true);

            // InternalAadlV3.g:5583:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAadlV3.g:5584:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAadlV3.g:5584:4: (lv_name_1_0= RULE_ID )
            // InternalAadlV3.g:5585:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getGeneratorAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGeneratorRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_86); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGeneratorAccess().getColonKeyword_2());
              		
            }
            // InternalAadlV3.g:5605:3: ( ( (lv_type_3_1= 'error' | lv_type_3_2= 'recover' | lv_type_3_3= 'repair' ) ) )
            // InternalAadlV3.g:5606:4: ( (lv_type_3_1= 'error' | lv_type_3_2= 'recover' | lv_type_3_3= 'repair' ) )
            {
            // InternalAadlV3.g:5606:4: ( (lv_type_3_1= 'error' | lv_type_3_2= 'recover' | lv_type_3_3= 'repair' ) )
            // InternalAadlV3.g:5607:5: (lv_type_3_1= 'error' | lv_type_3_2= 'recover' | lv_type_3_3= 'repair' )
            {
            // InternalAadlV3.g:5607:5: (lv_type_3_1= 'error' | lv_type_3_2= 'recover' | lv_type_3_3= 'repair' )
            int alt98=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt98=1;
                }
                break;
            case 53:
                {
                alt98=2;
                }
                break;
            case 54:
                {
                alt98=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // InternalAadlV3.g:5608:6: lv_type_3_1= 'error'
                    {
                    lv_type_3_1=(Token)match(input,52,FOLLOW_87); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_type_3_1, grammarAccess.getGeneratorAccess().getTypeErrorKeyword_3_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGeneratorRule());
                      						}
                      						setWithLastConsumed(current, "type", lv_type_3_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:5619:6: lv_type_3_2= 'recover'
                    {
                    lv_type_3_2=(Token)match(input,53,FOLLOW_87); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_type_3_2, grammarAccess.getGeneratorAccess().getTypeRecoverKeyword_3_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGeneratorRule());
                      						}
                      						setWithLastConsumed(current, "type", lv_type_3_2, null);
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:5630:6: lv_type_3_3= 'repair'
                    {
                    lv_type_3_3=(Token)match(input,54,FOLLOW_87); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_type_3_3, grammarAccess.getGeneratorAccess().getTypeRepairKeyword_3_0_2());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGeneratorRule());
                      						}
                      						setWithLastConsumed(current, "type", lv_type_3_3, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            // InternalAadlV3.g:5643:3: ( (lv_value_4_0= ruleListLiteral ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==24) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalAadlV3.g:5644:4: (lv_value_4_0= ruleListLiteral )
                    {
                    // InternalAadlV3.g:5644:4: (lv_value_4_0= ruleListLiteral )
                    // InternalAadlV3.g:5645:5: lv_value_4_0= ruleListLiteral
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getGeneratorAccess().getValueListLiteralParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_28);
                    lv_value_4_0=ruleListLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getGeneratorRule());
                      					}
                      					set(
                      						current,
                      						"value",
                      						lv_value_4_0,
                      						"org.osate.xtext.aadlv3.AadlV3.ListLiteral");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalAadlV3.g:5662:3: (this_PropertiesBlock_5= rulePropertiesBlock[$current] )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==19) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalAadlV3.g:5663:4: this_PropertiesBlock_5= rulePropertiesBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getGeneratorRule());
                      				}
                      				newCompositeNode(grammarAccess.getGeneratorAccess().getPropertiesBlockParserRuleCall_5());
                      			
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

              			newLeafNode(otherlv_6, grammarAccess.getGeneratorAccess().getSemicolonKeyword_6());
              		
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
    // $ANTLR end "ruleGenerator"


    // $ANTLR start "entryRuleTransitionRule"
    // InternalAadlV3.g:5686:1: entryRuleTransitionRule returns [EObject current=null] : iv_ruleTransitionRule= ruleTransitionRule EOF ;
    public final EObject entryRuleTransitionRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionRule = null;


        try {
            // InternalAadlV3.g:5686:55: (iv_ruleTransitionRule= ruleTransitionRule EOF )
            // InternalAadlV3.g:5687:2: iv_ruleTransitionRule= ruleTransitionRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTransitionRule=ruleTransitionRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionRule; 
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
    // $ANTLR end "entryRuleTransitionRule"


    // $ANTLR start "ruleTransitionRule"
    // InternalAadlV3.g:5693:1: ruleTransitionRule returns [EObject current=null] : ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'transition' ( ( (lv_condition_4_1= ruleMultiLiteralOperation | lv_condition_4_2= ruleModelElementContainsLiteral | lv_condition_4_3= ruleModelElementReference ) ) ) otherlv_5= '->' ( (lv_targetState_6_0= ruleTargetState ) ) (otherlv_7= 'when' ( (lv_currentState_8_0= ruleCurrentState ) ) )? (this_PropertiesBlock_9= rulePropertiesBlock[$current] )? otherlv_10= ';' ) ;
    public final EObject ruleTransitionRule() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        EObject this_Annotation_0 = null;

        EObject lv_condition_4_1 = null;

        EObject lv_condition_4_2 = null;

        EObject lv_condition_4_3 = null;

        EObject lv_targetState_6_0 = null;

        EObject lv_currentState_8_0 = null;

        EObject this_PropertiesBlock_9 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:5699:2: ( ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'transition' ( ( (lv_condition_4_1= ruleMultiLiteralOperation | lv_condition_4_2= ruleModelElementContainsLiteral | lv_condition_4_3= ruleModelElementReference ) ) ) otherlv_5= '->' ( (lv_targetState_6_0= ruleTargetState ) ) (otherlv_7= 'when' ( (lv_currentState_8_0= ruleCurrentState ) ) )? (this_PropertiesBlock_9= rulePropertiesBlock[$current] )? otherlv_10= ';' ) )
            // InternalAadlV3.g:5700:2: ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'transition' ( ( (lv_condition_4_1= ruleMultiLiteralOperation | lv_condition_4_2= ruleModelElementContainsLiteral | lv_condition_4_3= ruleModelElementReference ) ) ) otherlv_5= '->' ( (lv_targetState_6_0= ruleTargetState ) ) (otherlv_7= 'when' ( (lv_currentState_8_0= ruleCurrentState ) ) )? (this_PropertiesBlock_9= rulePropertiesBlock[$current] )? otherlv_10= ';' )
            {
            // InternalAadlV3.g:5700:2: ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'transition' ( ( (lv_condition_4_1= ruleMultiLiteralOperation | lv_condition_4_2= ruleModelElementContainsLiteral | lv_condition_4_3= ruleModelElementReference ) ) ) otherlv_5= '->' ( (lv_targetState_6_0= ruleTargetState ) ) (otherlv_7= 'when' ( (lv_currentState_8_0= ruleCurrentState ) ) )? (this_PropertiesBlock_9= rulePropertiesBlock[$current] )? otherlv_10= ';' )
            // InternalAadlV3.g:5701:3: (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'transition' ( ( (lv_condition_4_1= ruleMultiLiteralOperation | lv_condition_4_2= ruleModelElementContainsLiteral | lv_condition_4_3= ruleModelElementReference ) ) ) otherlv_5= '->' ( (lv_targetState_6_0= ruleTargetState ) ) (otherlv_7= 'when' ( (lv_currentState_8_0= ruleCurrentState ) ) )? (this_PropertiesBlock_9= rulePropertiesBlock[$current] )? otherlv_10= ';'
            {
            // InternalAadlV3.g:5701:3: (this_Annotation_0= ruleAnnotation[$current] )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==18) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // InternalAadlV3.g:5702:4: this_Annotation_0= ruleAnnotation[$current]
            	    {
            	    if ( state.backtracking==0 ) {

            	      				/* */
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElement(grammarAccess.getTransitionRuleRule());
            	      				}
            	      				newCompositeNode(grammarAccess.getTransitionRuleAccess().getAnnotationParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_47);
            	    this_Annotation_0=ruleAnnotation(current);

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current = this_Annotation_0;
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop101;
                }
            } while (true);

            // InternalAadlV3.g:5717:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAadlV3.g:5718:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAadlV3.g:5718:4: (lv_name_1_0= RULE_ID )
            // InternalAadlV3.g:5719:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getTransitionRuleAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTransitionRuleRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_88); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTransitionRuleAccess().getColonKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,55,FOLLOW_89); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTransitionRuleAccess().getTransitionKeyword_3());
              		
            }
            // InternalAadlV3.g:5743:3: ( ( (lv_condition_4_1= ruleMultiLiteralOperation | lv_condition_4_2= ruleModelElementContainsLiteral | lv_condition_4_3= ruleModelElementReference ) ) )
            // InternalAadlV3.g:5744:4: ( (lv_condition_4_1= ruleMultiLiteralOperation | lv_condition_4_2= ruleModelElementContainsLiteral | lv_condition_4_3= ruleModelElementReference ) )
            {
            // InternalAadlV3.g:5744:4: ( (lv_condition_4_1= ruleMultiLiteralOperation | lv_condition_4_2= ruleModelElementContainsLiteral | lv_condition_4_3= ruleModelElementReference ) )
            // InternalAadlV3.g:5745:5: (lv_condition_4_1= ruleMultiLiteralOperation | lv_condition_4_2= ruleModelElementContainsLiteral | lv_condition_4_3= ruleModelElementReference )
            {
            // InternalAadlV3.g:5745:5: (lv_condition_4_1= ruleMultiLiteralOperation | lv_condition_4_2= ruleModelElementContainsLiteral | lv_condition_4_3= ruleModelElementReference )
            int alt102=3;
            alt102 = dfa102.predict(input);
            switch (alt102) {
                case 1 :
                    // InternalAadlV3.g:5746:6: lv_condition_4_1= ruleMultiLiteralOperation
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTransitionRuleAccess().getConditionMultiLiteralOperationParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_58);
                    lv_condition_4_1=ruleMultiLiteralOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTransitionRuleRule());
                      						}
                      						set(
                      							current,
                      							"condition",
                      							lv_condition_4_1,
                      							"org.osate.xtext.aadlv3.AadlV3.MultiLiteralOperation");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:5762:6: lv_condition_4_2= ruleModelElementContainsLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTransitionRuleAccess().getConditionModelElementContainsLiteralParserRuleCall_4_0_1());
                      					
                    }
                    pushFollow(FOLLOW_58);
                    lv_condition_4_2=ruleModelElementContainsLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTransitionRuleRule());
                      						}
                      						set(
                      							current,
                      							"condition",
                      							lv_condition_4_2,
                      							"org.osate.xtext.aadlv3.AadlV3.ModelElementContainsLiteral");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:5778:6: lv_condition_4_3= ruleModelElementReference
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTransitionRuleAccess().getConditionModelElementReferenceParserRuleCall_4_0_2());
                      					
                    }
                    pushFollow(FOLLOW_58);
                    lv_condition_4_3=ruleModelElementReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTransitionRuleRule());
                      						}
                      						set(
                      							current,
                      							"condition",
                      							lv_condition_4_3,
                      							"org.osate.xtext.aadlv3.AadlV3.ModelElementReference");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

            }


            }


            }

            otherlv_5=(Token)match(input,39,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTransitionRuleAccess().getHyphenMinusGreaterThanSignKeyword_5());
              		
            }
            // InternalAadlV3.g:5800:3: ( (lv_targetState_6_0= ruleTargetState ) )
            // InternalAadlV3.g:5801:4: (lv_targetState_6_0= ruleTargetState )
            {
            // InternalAadlV3.g:5801:4: (lv_targetState_6_0= ruleTargetState )
            // InternalAadlV3.g:5802:5: lv_targetState_6_0= ruleTargetState
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTransitionRuleAccess().getTargetStateTargetStateParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_55);
            lv_targetState_6_0=ruleTargetState();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTransitionRuleRule());
              					}
              					set(
              						current,
              						"targetState",
              						lv_targetState_6_0,
              						"org.osate.xtext.aadlv3.AadlV3.TargetState");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:5819:3: (otherlv_7= 'when' ( (lv_currentState_8_0= ruleCurrentState ) ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==42) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalAadlV3.g:5820:4: otherlv_7= 'when' ( (lv_currentState_8_0= ruleCurrentState ) )
                    {
                    otherlv_7=(Token)match(input,42,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getTransitionRuleAccess().getWhenKeyword_7_0());
                      			
                    }
                    // InternalAadlV3.g:5824:4: ( (lv_currentState_8_0= ruleCurrentState ) )
                    // InternalAadlV3.g:5825:5: (lv_currentState_8_0= ruleCurrentState )
                    {
                    // InternalAadlV3.g:5825:5: (lv_currentState_8_0= ruleCurrentState )
                    // InternalAadlV3.g:5826:6: lv_currentState_8_0= ruleCurrentState
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTransitionRuleAccess().getCurrentStateCurrentStateParserRuleCall_7_1_0());
                      					
                    }
                    pushFollow(FOLLOW_28);
                    lv_currentState_8_0=ruleCurrentState();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTransitionRuleRule());
                      						}
                      						set(
                      							current,
                      							"currentState",
                      							lv_currentState_8_0,
                      							"org.osate.xtext.aadlv3.AadlV3.CurrentState");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalAadlV3.g:5844:3: (this_PropertiesBlock_9= rulePropertiesBlock[$current] )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==19) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalAadlV3.g:5845:4: this_PropertiesBlock_9= rulePropertiesBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getTransitionRuleRule());
                      				}
                      				newCompositeNode(grammarAccess.getTransitionRuleAccess().getPropertiesBlockParserRuleCall_8());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_PropertiesBlock_9=rulePropertiesBlock(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_PropertiesBlock_9;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getTransitionRuleAccess().getSemicolonKeyword_9());
              		
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
    // $ANTLR end "ruleTransitionRule"


    // $ANTLR start "entryRuleBehaviorRule"
    // InternalAadlV3.g:5868:1: entryRuleBehaviorRule returns [EObject current=null] : iv_ruleBehaviorRule= ruleBehaviorRule EOF ;
    public final EObject entryRuleBehaviorRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorRule = null;


        try {
            // InternalAadlV3.g:5868:53: (iv_ruleBehaviorRule= ruleBehaviorRule EOF )
            // InternalAadlV3.g:5869:2: iv_ruleBehaviorRule= ruleBehaviorRule EOF
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
    // InternalAadlV3.g:5875:1: ruleBehaviorRule returns [EObject current=null] : (this_FlowPathRule_0= ruleFlowPathRule | this_FlowSourceRule_1= ruleFlowSourceRule | this_FlowSinkRule_2= ruleFlowSinkRule ) ;
    public final EObject ruleBehaviorRule() throws RecognitionException {
        EObject current = null;

        EObject this_FlowPathRule_0 = null;

        EObject this_FlowSourceRule_1 = null;

        EObject this_FlowSinkRule_2 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:5881:2: ( (this_FlowPathRule_0= ruleFlowPathRule | this_FlowSourceRule_1= ruleFlowSourceRule | this_FlowSinkRule_2= ruleFlowSinkRule ) )
            // InternalAadlV3.g:5882:2: (this_FlowPathRule_0= ruleFlowPathRule | this_FlowSourceRule_1= ruleFlowSourceRule | this_FlowSinkRule_2= ruleFlowSinkRule )
            {
            // InternalAadlV3.g:5882:2: (this_FlowPathRule_0= ruleFlowPathRule | this_FlowSourceRule_1= ruleFlowSourceRule | this_FlowSinkRule_2= ruleFlowSinkRule )
            int alt105=3;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==18) ) {
                int LA105_1 = input.LA(2);

                if ( (synpred143_InternalAadlV3()) ) {
                    alt105=1;
                }
                else if ( (synpred144_InternalAadlV3()) ) {
                    alt105=2;
                }
                else if ( (true) ) {
                    alt105=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 105, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA105_0==RULE_ID) ) {
                int LA105_2 = input.LA(2);

                if ( (synpred143_InternalAadlV3()) ) {
                    alt105=1;
                }
                else if ( (synpred144_InternalAadlV3()) ) {
                    alt105=2;
                }
                else if ( (true) ) {
                    alt105=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 105, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }
            switch (alt105) {
                case 1 :
                    // InternalAadlV3.g:5883:3: this_FlowPathRule_0= ruleFlowPathRule
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBehaviorRuleAccess().getFlowPathRuleParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FlowPathRule_0=ruleFlowPathRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FlowPathRule_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:5895:3: this_FlowSourceRule_1= ruleFlowSourceRule
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBehaviorRuleAccess().getFlowSourceRuleParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FlowSourceRule_1=ruleFlowSourceRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FlowSourceRule_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:5907:3: this_FlowSinkRule_2= ruleFlowSinkRule
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBehaviorRuleAccess().getFlowSinkRuleParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FlowSinkRule_2=ruleFlowSinkRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FlowSinkRule_2;
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
    // $ANTLR end "ruleBehaviorRule"


    // $ANTLR start "entryRuleFlowPathRule"
    // InternalAadlV3.g:5922:1: entryRuleFlowPathRule returns [EObject current=null] : iv_ruleFlowPathRule= ruleFlowPathRule EOF ;
    public final EObject entryRuleFlowPathRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowPathRule = null;


        try {
            // InternalAadlV3.g:5922:53: (iv_ruleFlowPathRule= ruleFlowPathRule EOF )
            // InternalAadlV3.g:5923:2: iv_ruleFlowPathRule= ruleFlowPathRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFlowPathRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFlowPathRule=ruleFlowPathRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFlowPathRule; 
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
    // $ANTLR end "entryRuleFlowPathRule"


    // $ANTLR start "ruleFlowPathRule"
    // InternalAadlV3.g:5929:1: ruleFlowPathRule returns [EObject current=null] : ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'flow' ( ( (lv_condition_4_1= ruleMultiLiteralOperation | lv_condition_4_2= ruleModelElementContainsLiteral | lv_condition_4_3= ruleModelElementReference ) ) ) otherlv_5= '->' ( (lv_actions_6_0= ruleAssignment ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleAssignment ) ) )* (otherlv_9= 'when' ( (lv_currentState_10_0= ruleCurrentState ) ) )? (this_PropertiesBlock_11= rulePropertiesBlock[$current] )? otherlv_12= ';' ) ;
    public final EObject ruleFlowPathRule() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        EObject this_Annotation_0 = null;

        EObject lv_condition_4_1 = null;

        EObject lv_condition_4_2 = null;

        EObject lv_condition_4_3 = null;

        EObject lv_actions_6_0 = null;

        EObject lv_actions_8_0 = null;

        EObject lv_currentState_10_0 = null;

        EObject this_PropertiesBlock_11 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:5935:2: ( ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'flow' ( ( (lv_condition_4_1= ruleMultiLiteralOperation | lv_condition_4_2= ruleModelElementContainsLiteral | lv_condition_4_3= ruleModelElementReference ) ) ) otherlv_5= '->' ( (lv_actions_6_0= ruleAssignment ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleAssignment ) ) )* (otherlv_9= 'when' ( (lv_currentState_10_0= ruleCurrentState ) ) )? (this_PropertiesBlock_11= rulePropertiesBlock[$current] )? otherlv_12= ';' ) )
            // InternalAadlV3.g:5936:2: ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'flow' ( ( (lv_condition_4_1= ruleMultiLiteralOperation | lv_condition_4_2= ruleModelElementContainsLiteral | lv_condition_4_3= ruleModelElementReference ) ) ) otherlv_5= '->' ( (lv_actions_6_0= ruleAssignment ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleAssignment ) ) )* (otherlv_9= 'when' ( (lv_currentState_10_0= ruleCurrentState ) ) )? (this_PropertiesBlock_11= rulePropertiesBlock[$current] )? otherlv_12= ';' )
            {
            // InternalAadlV3.g:5936:2: ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'flow' ( ( (lv_condition_4_1= ruleMultiLiteralOperation | lv_condition_4_2= ruleModelElementContainsLiteral | lv_condition_4_3= ruleModelElementReference ) ) ) otherlv_5= '->' ( (lv_actions_6_0= ruleAssignment ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleAssignment ) ) )* (otherlv_9= 'when' ( (lv_currentState_10_0= ruleCurrentState ) ) )? (this_PropertiesBlock_11= rulePropertiesBlock[$current] )? otherlv_12= ';' )
            // InternalAadlV3.g:5937:3: (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'flow' ( ( (lv_condition_4_1= ruleMultiLiteralOperation | lv_condition_4_2= ruleModelElementContainsLiteral | lv_condition_4_3= ruleModelElementReference ) ) ) otherlv_5= '->' ( (lv_actions_6_0= ruleAssignment ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleAssignment ) ) )* (otherlv_9= 'when' ( (lv_currentState_10_0= ruleCurrentState ) ) )? (this_PropertiesBlock_11= rulePropertiesBlock[$current] )? otherlv_12= ';'
            {
            // InternalAadlV3.g:5937:3: (this_Annotation_0= ruleAnnotation[$current] )*
            loop106:
            do {
                int alt106=2;
                int LA106_0 = input.LA(1);

                if ( (LA106_0==18) ) {
                    alt106=1;
                }


                switch (alt106) {
            	case 1 :
            	    // InternalAadlV3.g:5938:4: this_Annotation_0= ruleAnnotation[$current]
            	    {
            	    if ( state.backtracking==0 ) {

            	      				/* */
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElement(grammarAccess.getFlowPathRuleRule());
            	      				}
            	      				newCompositeNode(grammarAccess.getFlowPathRuleAccess().getAnnotationParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_47);
            	    this_Annotation_0=ruleAnnotation(current);

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current = this_Annotation_0;
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop106;
                }
            } while (true);

            // InternalAadlV3.g:5953:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAadlV3.g:5954:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAadlV3.g:5954:4: (lv_name_1_0= RULE_ID )
            // InternalAadlV3.g:5955:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getFlowPathRuleAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFlowPathRuleRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFlowPathRuleAccess().getColonKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,45,FOLLOW_89); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getFlowPathRuleAccess().getFlowKeyword_3());
              		
            }
            // InternalAadlV3.g:5979:3: ( ( (lv_condition_4_1= ruleMultiLiteralOperation | lv_condition_4_2= ruleModelElementContainsLiteral | lv_condition_4_3= ruleModelElementReference ) ) )
            // InternalAadlV3.g:5980:4: ( (lv_condition_4_1= ruleMultiLiteralOperation | lv_condition_4_2= ruleModelElementContainsLiteral | lv_condition_4_3= ruleModelElementReference ) )
            {
            // InternalAadlV3.g:5980:4: ( (lv_condition_4_1= ruleMultiLiteralOperation | lv_condition_4_2= ruleModelElementContainsLiteral | lv_condition_4_3= ruleModelElementReference ) )
            // InternalAadlV3.g:5981:5: (lv_condition_4_1= ruleMultiLiteralOperation | lv_condition_4_2= ruleModelElementContainsLiteral | lv_condition_4_3= ruleModelElementReference )
            {
            // InternalAadlV3.g:5981:5: (lv_condition_4_1= ruleMultiLiteralOperation | lv_condition_4_2= ruleModelElementContainsLiteral | lv_condition_4_3= ruleModelElementReference )
            int alt107=3;
            alt107 = dfa107.predict(input);
            switch (alt107) {
                case 1 :
                    // InternalAadlV3.g:5982:6: lv_condition_4_1= ruleMultiLiteralOperation
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFlowPathRuleAccess().getConditionMultiLiteralOperationParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_58);
                    lv_condition_4_1=ruleMultiLiteralOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFlowPathRuleRule());
                      						}
                      						set(
                      							current,
                      							"condition",
                      							lv_condition_4_1,
                      							"org.osate.xtext.aadlv3.AadlV3.MultiLiteralOperation");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:5998:6: lv_condition_4_2= ruleModelElementContainsLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFlowPathRuleAccess().getConditionModelElementContainsLiteralParserRuleCall_4_0_1());
                      					
                    }
                    pushFollow(FOLLOW_58);
                    lv_condition_4_2=ruleModelElementContainsLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFlowPathRuleRule());
                      						}
                      						set(
                      							current,
                      							"condition",
                      							lv_condition_4_2,
                      							"org.osate.xtext.aadlv3.AadlV3.ModelElementContainsLiteral");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:6014:6: lv_condition_4_3= ruleModelElementReference
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFlowPathRuleAccess().getConditionModelElementReferenceParserRuleCall_4_0_2());
                      					
                    }
                    pushFollow(FOLLOW_58);
                    lv_condition_4_3=ruleModelElementReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFlowPathRuleRule());
                      						}
                      						set(
                      							current,
                      							"condition",
                      							lv_condition_4_3,
                      							"org.osate.xtext.aadlv3.AadlV3.ModelElementReference");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

            }


            }


            }

            otherlv_5=(Token)match(input,39,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getFlowPathRuleAccess().getHyphenMinusGreaterThanSignKeyword_5());
              		
            }
            // InternalAadlV3.g:6036:3: ( (lv_actions_6_0= ruleAssignment ) )
            // InternalAadlV3.g:6037:4: (lv_actions_6_0= ruleAssignment )
            {
            // InternalAadlV3.g:6037:4: (lv_actions_6_0= ruleAssignment )
            // InternalAadlV3.g:6038:5: lv_actions_6_0= ruleAssignment
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowPathRuleAccess().getActionsAssignmentParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_90);
            lv_actions_6_0=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFlowPathRuleRule());
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

            // InternalAadlV3.g:6055:3: (otherlv_7= ',' ( (lv_actions_8_0= ruleAssignment ) ) )*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( (LA108_0==26) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // InternalAadlV3.g:6056:4: otherlv_7= ',' ( (lv_actions_8_0= ruleAssignment ) )
            	    {
            	    otherlv_7=(Token)match(input,26,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_7, grammarAccess.getFlowPathRuleAccess().getCommaKeyword_7_0());
            	      			
            	    }
            	    // InternalAadlV3.g:6060:4: ( (lv_actions_8_0= ruleAssignment ) )
            	    // InternalAadlV3.g:6061:5: (lv_actions_8_0= ruleAssignment )
            	    {
            	    // InternalAadlV3.g:6061:5: (lv_actions_8_0= ruleAssignment )
            	    // InternalAadlV3.g:6062:6: lv_actions_8_0= ruleAssignment
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getFlowPathRuleAccess().getActionsAssignmentParserRuleCall_7_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_90);
            	    lv_actions_8_0=ruleAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getFlowPathRuleRule());
            	      						}
            	      						add(
            	      							current,
            	      							"actions",
            	      							lv_actions_8_0,
            	      							"org.osate.xtext.aadlv3.AadlV3.Assignment");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop108;
                }
            } while (true);

            // InternalAadlV3.g:6080:3: (otherlv_9= 'when' ( (lv_currentState_10_0= ruleCurrentState ) ) )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==42) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalAadlV3.g:6081:4: otherlv_9= 'when' ( (lv_currentState_10_0= ruleCurrentState ) )
                    {
                    otherlv_9=(Token)match(input,42,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getFlowPathRuleAccess().getWhenKeyword_8_0());
                      			
                    }
                    // InternalAadlV3.g:6085:4: ( (lv_currentState_10_0= ruleCurrentState ) )
                    // InternalAadlV3.g:6086:5: (lv_currentState_10_0= ruleCurrentState )
                    {
                    // InternalAadlV3.g:6086:5: (lv_currentState_10_0= ruleCurrentState )
                    // InternalAadlV3.g:6087:6: lv_currentState_10_0= ruleCurrentState
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFlowPathRuleAccess().getCurrentStateCurrentStateParserRuleCall_8_1_0());
                      					
                    }
                    pushFollow(FOLLOW_28);
                    lv_currentState_10_0=ruleCurrentState();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFlowPathRuleRule());
                      						}
                      						set(
                      							current,
                      							"currentState",
                      							lv_currentState_10_0,
                      							"org.osate.xtext.aadlv3.AadlV3.CurrentState");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalAadlV3.g:6105:3: (this_PropertiesBlock_11= rulePropertiesBlock[$current] )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==19) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalAadlV3.g:6106:4: this_PropertiesBlock_11= rulePropertiesBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getFlowPathRuleRule());
                      				}
                      				newCompositeNode(grammarAccess.getFlowPathRuleAccess().getPropertiesBlockParserRuleCall_9());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_PropertiesBlock_11=rulePropertiesBlock(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_PropertiesBlock_11;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_12=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getFlowPathRuleAccess().getSemicolonKeyword_10());
              		
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
    // $ANTLR end "ruleFlowPathRule"


    // $ANTLR start "entryRuleFlowSourceRule"
    // InternalAadlV3.g:6129:1: entryRuleFlowSourceRule returns [EObject current=null] : iv_ruleFlowSourceRule= ruleFlowSourceRule EOF ;
    public final EObject entryRuleFlowSourceRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowSourceRule = null;


        try {
            // InternalAadlV3.g:6129:55: (iv_ruleFlowSourceRule= ruleFlowSourceRule EOF )
            // InternalAadlV3.g:6130:2: iv_ruleFlowSourceRule= ruleFlowSourceRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFlowSourceRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFlowSourceRule=ruleFlowSourceRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFlowSourceRule; 
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
    // $ANTLR end "entryRuleFlowSourceRule"


    // $ANTLR start "ruleFlowSourceRule"
    // InternalAadlV3.g:6136:1: ruleFlowSourceRule returns [EObject current=null] : ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'flow' ( (lv_source_4_0= 'source' ) ) ( ( ( (lv_condition_5_1= ruleMultiLiteralOperation | lv_condition_5_2= ruleModelElementContainsLiteral | lv_condition_5_3= ruleModelElementReference ) ) ) otherlv_6= '->' )? ( (lv_actions_7_0= ruleAssignment ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAssignment ) ) )* (otherlv_10= 'when' ( (lv_currentState_11_0= ruleCurrentState ) ) )? (this_PropertiesBlock_12= rulePropertiesBlock[$current] )? otherlv_13= ';' ) ;
    public final EObject ruleFlowSourceRule() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_source_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        EObject this_Annotation_0 = null;

        EObject lv_condition_5_1 = null;

        EObject lv_condition_5_2 = null;

        EObject lv_condition_5_3 = null;

        EObject lv_actions_7_0 = null;

        EObject lv_actions_9_0 = null;

        EObject lv_currentState_11_0 = null;

        EObject this_PropertiesBlock_12 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:6142:2: ( ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'flow' ( (lv_source_4_0= 'source' ) ) ( ( ( (lv_condition_5_1= ruleMultiLiteralOperation | lv_condition_5_2= ruleModelElementContainsLiteral | lv_condition_5_3= ruleModelElementReference ) ) ) otherlv_6= '->' )? ( (lv_actions_7_0= ruleAssignment ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAssignment ) ) )* (otherlv_10= 'when' ( (lv_currentState_11_0= ruleCurrentState ) ) )? (this_PropertiesBlock_12= rulePropertiesBlock[$current] )? otherlv_13= ';' ) )
            // InternalAadlV3.g:6143:2: ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'flow' ( (lv_source_4_0= 'source' ) ) ( ( ( (lv_condition_5_1= ruleMultiLiteralOperation | lv_condition_5_2= ruleModelElementContainsLiteral | lv_condition_5_3= ruleModelElementReference ) ) ) otherlv_6= '->' )? ( (lv_actions_7_0= ruleAssignment ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAssignment ) ) )* (otherlv_10= 'when' ( (lv_currentState_11_0= ruleCurrentState ) ) )? (this_PropertiesBlock_12= rulePropertiesBlock[$current] )? otherlv_13= ';' )
            {
            // InternalAadlV3.g:6143:2: ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'flow' ( (lv_source_4_0= 'source' ) ) ( ( ( (lv_condition_5_1= ruleMultiLiteralOperation | lv_condition_5_2= ruleModelElementContainsLiteral | lv_condition_5_3= ruleModelElementReference ) ) ) otherlv_6= '->' )? ( (lv_actions_7_0= ruleAssignment ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAssignment ) ) )* (otherlv_10= 'when' ( (lv_currentState_11_0= ruleCurrentState ) ) )? (this_PropertiesBlock_12= rulePropertiesBlock[$current] )? otherlv_13= ';' )
            // InternalAadlV3.g:6144:3: (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'flow' ( (lv_source_4_0= 'source' ) ) ( ( ( (lv_condition_5_1= ruleMultiLiteralOperation | lv_condition_5_2= ruleModelElementContainsLiteral | lv_condition_5_3= ruleModelElementReference ) ) ) otherlv_6= '->' )? ( (lv_actions_7_0= ruleAssignment ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAssignment ) ) )* (otherlv_10= 'when' ( (lv_currentState_11_0= ruleCurrentState ) ) )? (this_PropertiesBlock_12= rulePropertiesBlock[$current] )? otherlv_13= ';'
            {
            // InternalAadlV3.g:6144:3: (this_Annotation_0= ruleAnnotation[$current] )*
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( (LA111_0==18) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // InternalAadlV3.g:6145:4: this_Annotation_0= ruleAnnotation[$current]
            	    {
            	    if ( state.backtracking==0 ) {

            	      				/* */
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElement(grammarAccess.getFlowSourceRuleRule());
            	      				}
            	      				newCompositeNode(grammarAccess.getFlowSourceRuleAccess().getAnnotationParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_47);
            	    this_Annotation_0=ruleAnnotation(current);

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current = this_Annotation_0;
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop111;
                }
            } while (true);

            // InternalAadlV3.g:6160:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAadlV3.g:6161:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAadlV3.g:6161:4: (lv_name_1_0= RULE_ID )
            // InternalAadlV3.g:6162:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getFlowSourceRuleAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFlowSourceRuleRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFlowSourceRuleAccess().getColonKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,45,FOLLOW_91); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getFlowSourceRuleAccess().getFlowKeyword_3());
              		
            }
            // InternalAadlV3.g:6186:3: ( (lv_source_4_0= 'source' ) )
            // InternalAadlV3.g:6187:4: (lv_source_4_0= 'source' )
            {
            // InternalAadlV3.g:6187:4: (lv_source_4_0= 'source' )
            // InternalAadlV3.g:6188:5: lv_source_4_0= 'source'
            {
            lv_source_4_0=(Token)match(input,56,FOLLOW_89); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_source_4_0, grammarAccess.getFlowSourceRuleAccess().getSourceSourceKeyword_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFlowSourceRuleRule());
              					}
              					setWithLastConsumed(current, "source", true, "source");
              				
            }

            }


            }

            // InternalAadlV3.g:6200:3: ( ( ( (lv_condition_5_1= ruleMultiLiteralOperation | lv_condition_5_2= ruleModelElementContainsLiteral | lv_condition_5_3= ruleModelElementReference ) ) ) otherlv_6= '->' )?
            int alt113=2;
            alt113 = dfa113.predict(input);
            switch (alt113) {
                case 1 :
                    // InternalAadlV3.g:6201:4: ( ( (lv_condition_5_1= ruleMultiLiteralOperation | lv_condition_5_2= ruleModelElementContainsLiteral | lv_condition_5_3= ruleModelElementReference ) ) ) otherlv_6= '->'
                    {
                    // InternalAadlV3.g:6201:4: ( ( (lv_condition_5_1= ruleMultiLiteralOperation | lv_condition_5_2= ruleModelElementContainsLiteral | lv_condition_5_3= ruleModelElementReference ) ) )
                    // InternalAadlV3.g:6202:5: ( (lv_condition_5_1= ruleMultiLiteralOperation | lv_condition_5_2= ruleModelElementContainsLiteral | lv_condition_5_3= ruleModelElementReference ) )
                    {
                    // InternalAadlV3.g:6202:5: ( (lv_condition_5_1= ruleMultiLiteralOperation | lv_condition_5_2= ruleModelElementContainsLiteral | lv_condition_5_3= ruleModelElementReference ) )
                    // InternalAadlV3.g:6203:6: (lv_condition_5_1= ruleMultiLiteralOperation | lv_condition_5_2= ruleModelElementContainsLiteral | lv_condition_5_3= ruleModelElementReference )
                    {
                    // InternalAadlV3.g:6203:6: (lv_condition_5_1= ruleMultiLiteralOperation | lv_condition_5_2= ruleModelElementContainsLiteral | lv_condition_5_3= ruleModelElementReference )
                    int alt112=3;
                    alt112 = dfa112.predict(input);
                    switch (alt112) {
                        case 1 :
                            // InternalAadlV3.g:6204:7: lv_condition_5_1= ruleMultiLiteralOperation
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getFlowSourceRuleAccess().getConditionMultiLiteralOperationParserRuleCall_5_0_0_0());
                              						
                            }
                            pushFollow(FOLLOW_58);
                            lv_condition_5_1=ruleMultiLiteralOperation();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getFlowSourceRuleRule());
                              							}
                              							set(
                              								current,
                              								"condition",
                              								lv_condition_5_1,
                              								"org.osate.xtext.aadlv3.AadlV3.MultiLiteralOperation");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalAadlV3.g:6220:7: lv_condition_5_2= ruleModelElementContainsLiteral
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getFlowSourceRuleAccess().getConditionModelElementContainsLiteralParserRuleCall_5_0_0_1());
                              						
                            }
                            pushFollow(FOLLOW_58);
                            lv_condition_5_2=ruleModelElementContainsLiteral();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getFlowSourceRuleRule());
                              							}
                              							set(
                              								current,
                              								"condition",
                              								lv_condition_5_2,
                              								"org.osate.xtext.aadlv3.AadlV3.ModelElementContainsLiteral");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }
                            break;
                        case 3 :
                            // InternalAadlV3.g:6236:7: lv_condition_5_3= ruleModelElementReference
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getFlowSourceRuleAccess().getConditionModelElementReferenceParserRuleCall_5_0_0_2());
                              						
                            }
                            pushFollow(FOLLOW_58);
                            lv_condition_5_3=ruleModelElementReference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getFlowSourceRuleRule());
                              							}
                              							set(
                              								current,
                              								"condition",
                              								lv_condition_5_3,
                              								"org.osate.xtext.aadlv3.AadlV3.ModelElementReference");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }
                            break;

                    }


                    }


                    }

                    otherlv_6=(Token)match(input,39,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getFlowSourceRuleAccess().getHyphenMinusGreaterThanSignKeyword_5_1());
                      			
                    }

                    }
                    break;

            }

            // InternalAadlV3.g:6259:3: ( (lv_actions_7_0= ruleAssignment ) )
            // InternalAadlV3.g:6260:4: (lv_actions_7_0= ruleAssignment )
            {
            // InternalAadlV3.g:6260:4: (lv_actions_7_0= ruleAssignment )
            // InternalAadlV3.g:6261:5: lv_actions_7_0= ruleAssignment
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFlowSourceRuleAccess().getActionsAssignmentParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_90);
            lv_actions_7_0=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFlowSourceRuleRule());
              					}
              					add(
              						current,
              						"actions",
              						lv_actions_7_0,
              						"org.osate.xtext.aadlv3.AadlV3.Assignment");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAadlV3.g:6278:3: (otherlv_8= ',' ( (lv_actions_9_0= ruleAssignment ) ) )*
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( (LA114_0==26) ) {
                    alt114=1;
                }


                switch (alt114) {
            	case 1 :
            	    // InternalAadlV3.g:6279:4: otherlv_8= ',' ( (lv_actions_9_0= ruleAssignment ) )
            	    {
            	    otherlv_8=(Token)match(input,26,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_8, grammarAccess.getFlowSourceRuleAccess().getCommaKeyword_7_0());
            	      			
            	    }
            	    // InternalAadlV3.g:6283:4: ( (lv_actions_9_0= ruleAssignment ) )
            	    // InternalAadlV3.g:6284:5: (lv_actions_9_0= ruleAssignment )
            	    {
            	    // InternalAadlV3.g:6284:5: (lv_actions_9_0= ruleAssignment )
            	    // InternalAadlV3.g:6285:6: lv_actions_9_0= ruleAssignment
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getFlowSourceRuleAccess().getActionsAssignmentParserRuleCall_7_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_90);
            	    lv_actions_9_0=ruleAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getFlowSourceRuleRule());
            	      						}
            	      						add(
            	      							current,
            	      							"actions",
            	      							lv_actions_9_0,
            	      							"org.osate.xtext.aadlv3.AadlV3.Assignment");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop114;
                }
            } while (true);

            // InternalAadlV3.g:6303:3: (otherlv_10= 'when' ( (lv_currentState_11_0= ruleCurrentState ) ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==42) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalAadlV3.g:6304:4: otherlv_10= 'when' ( (lv_currentState_11_0= ruleCurrentState ) )
                    {
                    otherlv_10=(Token)match(input,42,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getFlowSourceRuleAccess().getWhenKeyword_8_0());
                      			
                    }
                    // InternalAadlV3.g:6308:4: ( (lv_currentState_11_0= ruleCurrentState ) )
                    // InternalAadlV3.g:6309:5: (lv_currentState_11_0= ruleCurrentState )
                    {
                    // InternalAadlV3.g:6309:5: (lv_currentState_11_0= ruleCurrentState )
                    // InternalAadlV3.g:6310:6: lv_currentState_11_0= ruleCurrentState
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFlowSourceRuleAccess().getCurrentStateCurrentStateParserRuleCall_8_1_0());
                      					
                    }
                    pushFollow(FOLLOW_28);
                    lv_currentState_11_0=ruleCurrentState();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFlowSourceRuleRule());
                      						}
                      						set(
                      							current,
                      							"currentState",
                      							lv_currentState_11_0,
                      							"org.osate.xtext.aadlv3.AadlV3.CurrentState");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalAadlV3.g:6328:3: (this_PropertiesBlock_12= rulePropertiesBlock[$current] )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==19) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalAadlV3.g:6329:4: this_PropertiesBlock_12= rulePropertiesBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getFlowSourceRuleRule());
                      				}
                      				newCompositeNode(grammarAccess.getFlowSourceRuleAccess().getPropertiesBlockParserRuleCall_9());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_PropertiesBlock_12=rulePropertiesBlock(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_PropertiesBlock_12;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_13=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getFlowSourceRuleAccess().getSemicolonKeyword_10());
              		
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
    // $ANTLR end "ruleFlowSourceRule"


    // $ANTLR start "entryRuleFlowSinkRule"
    // InternalAadlV3.g:6352:1: entryRuleFlowSinkRule returns [EObject current=null] : iv_ruleFlowSinkRule= ruleFlowSinkRule EOF ;
    public final EObject entryRuleFlowSinkRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowSinkRule = null;


        try {
            // InternalAadlV3.g:6352:53: (iv_ruleFlowSinkRule= ruleFlowSinkRule EOF )
            // InternalAadlV3.g:6353:2: iv_ruleFlowSinkRule= ruleFlowSinkRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFlowSinkRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFlowSinkRule=ruleFlowSinkRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFlowSinkRule; 
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
    // $ANTLR end "entryRuleFlowSinkRule"


    // $ANTLR start "ruleFlowSinkRule"
    // InternalAadlV3.g:6359:1: ruleFlowSinkRule returns [EObject current=null] : ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'flow' ( ( (lv_condition_4_1= ruleMultiLiteralOperation | lv_condition_4_2= ruleModelElementContainsLiteral | lv_condition_4_3= ruleModelElementReference ) ) ) otherlv_5= '->' ( (lv_sink_6_0= 'sink' ) ) (otherlv_7= 'when' ( (lv_currentState_8_0= ruleCurrentState ) ) )? (this_PropertiesBlock_9= rulePropertiesBlock[$current] )? otherlv_10= ';' ) ;
    public final EObject ruleFlowSinkRule() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_sink_6_0=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        EObject this_Annotation_0 = null;

        EObject lv_condition_4_1 = null;

        EObject lv_condition_4_2 = null;

        EObject lv_condition_4_3 = null;

        EObject lv_currentState_8_0 = null;

        EObject this_PropertiesBlock_9 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:6365:2: ( ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'flow' ( ( (lv_condition_4_1= ruleMultiLiteralOperation | lv_condition_4_2= ruleModelElementContainsLiteral | lv_condition_4_3= ruleModelElementReference ) ) ) otherlv_5= '->' ( (lv_sink_6_0= 'sink' ) ) (otherlv_7= 'when' ( (lv_currentState_8_0= ruleCurrentState ) ) )? (this_PropertiesBlock_9= rulePropertiesBlock[$current] )? otherlv_10= ';' ) )
            // InternalAadlV3.g:6366:2: ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'flow' ( ( (lv_condition_4_1= ruleMultiLiteralOperation | lv_condition_4_2= ruleModelElementContainsLiteral | lv_condition_4_3= ruleModelElementReference ) ) ) otherlv_5= '->' ( (lv_sink_6_0= 'sink' ) ) (otherlv_7= 'when' ( (lv_currentState_8_0= ruleCurrentState ) ) )? (this_PropertiesBlock_9= rulePropertiesBlock[$current] )? otherlv_10= ';' )
            {
            // InternalAadlV3.g:6366:2: ( (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'flow' ( ( (lv_condition_4_1= ruleMultiLiteralOperation | lv_condition_4_2= ruleModelElementContainsLiteral | lv_condition_4_3= ruleModelElementReference ) ) ) otherlv_5= '->' ( (lv_sink_6_0= 'sink' ) ) (otherlv_7= 'when' ( (lv_currentState_8_0= ruleCurrentState ) ) )? (this_PropertiesBlock_9= rulePropertiesBlock[$current] )? otherlv_10= ';' )
            // InternalAadlV3.g:6367:3: (this_Annotation_0= ruleAnnotation[$current] )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'flow' ( ( (lv_condition_4_1= ruleMultiLiteralOperation | lv_condition_4_2= ruleModelElementContainsLiteral | lv_condition_4_3= ruleModelElementReference ) ) ) otherlv_5= '->' ( (lv_sink_6_0= 'sink' ) ) (otherlv_7= 'when' ( (lv_currentState_8_0= ruleCurrentState ) ) )? (this_PropertiesBlock_9= rulePropertiesBlock[$current] )? otherlv_10= ';'
            {
            // InternalAadlV3.g:6367:3: (this_Annotation_0= ruleAnnotation[$current] )*
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==18) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // InternalAadlV3.g:6368:4: this_Annotation_0= ruleAnnotation[$current]
            	    {
            	    if ( state.backtracking==0 ) {

            	      				/* */
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElement(grammarAccess.getFlowSinkRuleRule());
            	      				}
            	      				newCompositeNode(grammarAccess.getFlowSinkRuleAccess().getAnnotationParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_47);
            	    this_Annotation_0=ruleAnnotation(current);

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current = this_Annotation_0;
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop117;
                }
            } while (true);

            // InternalAadlV3.g:6383:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAadlV3.g:6384:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAadlV3.g:6384:4: (lv_name_1_0= RULE_ID )
            // InternalAadlV3.g:6385:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getFlowSinkRuleAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFlowSinkRuleRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFlowSinkRuleAccess().getColonKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,45,FOLLOW_89); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getFlowSinkRuleAccess().getFlowKeyword_3());
              		
            }
            // InternalAadlV3.g:6409:3: ( ( (lv_condition_4_1= ruleMultiLiteralOperation | lv_condition_4_2= ruleModelElementContainsLiteral | lv_condition_4_3= ruleModelElementReference ) ) )
            // InternalAadlV3.g:6410:4: ( (lv_condition_4_1= ruleMultiLiteralOperation | lv_condition_4_2= ruleModelElementContainsLiteral | lv_condition_4_3= ruleModelElementReference ) )
            {
            // InternalAadlV3.g:6410:4: ( (lv_condition_4_1= ruleMultiLiteralOperation | lv_condition_4_2= ruleModelElementContainsLiteral | lv_condition_4_3= ruleModelElementReference ) )
            // InternalAadlV3.g:6411:5: (lv_condition_4_1= ruleMultiLiteralOperation | lv_condition_4_2= ruleModelElementContainsLiteral | lv_condition_4_3= ruleModelElementReference )
            {
            // InternalAadlV3.g:6411:5: (lv_condition_4_1= ruleMultiLiteralOperation | lv_condition_4_2= ruleModelElementContainsLiteral | lv_condition_4_3= ruleModelElementReference )
            int alt118=3;
            alt118 = dfa118.predict(input);
            switch (alt118) {
                case 1 :
                    // InternalAadlV3.g:6412:6: lv_condition_4_1= ruleMultiLiteralOperation
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFlowSinkRuleAccess().getConditionMultiLiteralOperationParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_58);
                    lv_condition_4_1=ruleMultiLiteralOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFlowSinkRuleRule());
                      						}
                      						set(
                      							current,
                      							"condition",
                      							lv_condition_4_1,
                      							"org.osate.xtext.aadlv3.AadlV3.MultiLiteralOperation");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:6428:6: lv_condition_4_2= ruleModelElementContainsLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFlowSinkRuleAccess().getConditionModelElementContainsLiteralParserRuleCall_4_0_1());
                      					
                    }
                    pushFollow(FOLLOW_58);
                    lv_condition_4_2=ruleModelElementContainsLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFlowSinkRuleRule());
                      						}
                      						set(
                      							current,
                      							"condition",
                      							lv_condition_4_2,
                      							"org.osate.xtext.aadlv3.AadlV3.ModelElementContainsLiteral");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:6444:6: lv_condition_4_3= ruleModelElementReference
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFlowSinkRuleAccess().getConditionModelElementReferenceParserRuleCall_4_0_2());
                      					
                    }
                    pushFollow(FOLLOW_58);
                    lv_condition_4_3=ruleModelElementReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFlowSinkRuleRule());
                      						}
                      						set(
                      							current,
                      							"condition",
                      							lv_condition_4_3,
                      							"org.osate.xtext.aadlv3.AadlV3.ModelElementReference");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

            }


            }


            }

            otherlv_5=(Token)match(input,39,FOLLOW_92); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getFlowSinkRuleAccess().getHyphenMinusGreaterThanSignKeyword_5());
              		
            }
            // InternalAadlV3.g:6466:3: ( (lv_sink_6_0= 'sink' ) )
            // InternalAadlV3.g:6467:4: (lv_sink_6_0= 'sink' )
            {
            // InternalAadlV3.g:6467:4: (lv_sink_6_0= 'sink' )
            // InternalAadlV3.g:6468:5: lv_sink_6_0= 'sink'
            {
            lv_sink_6_0=(Token)match(input,57,FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_sink_6_0, grammarAccess.getFlowSinkRuleAccess().getSinkSinkKeyword_6_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFlowSinkRuleRule());
              					}
              					setWithLastConsumed(current, "sink", true, "sink");
              				
            }

            }


            }

            // InternalAadlV3.g:6480:3: (otherlv_7= 'when' ( (lv_currentState_8_0= ruleCurrentState ) ) )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==42) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalAadlV3.g:6481:4: otherlv_7= 'when' ( (lv_currentState_8_0= ruleCurrentState ) )
                    {
                    otherlv_7=(Token)match(input,42,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getFlowSinkRuleAccess().getWhenKeyword_7_0());
                      			
                    }
                    // InternalAadlV3.g:6485:4: ( (lv_currentState_8_0= ruleCurrentState ) )
                    // InternalAadlV3.g:6486:5: (lv_currentState_8_0= ruleCurrentState )
                    {
                    // InternalAadlV3.g:6486:5: (lv_currentState_8_0= ruleCurrentState )
                    // InternalAadlV3.g:6487:6: lv_currentState_8_0= ruleCurrentState
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFlowSinkRuleAccess().getCurrentStateCurrentStateParserRuleCall_7_1_0());
                      					
                    }
                    pushFollow(FOLLOW_28);
                    lv_currentState_8_0=ruleCurrentState();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFlowSinkRuleRule());
                      						}
                      						set(
                      							current,
                      							"currentState",
                      							lv_currentState_8_0,
                      							"org.osate.xtext.aadlv3.AadlV3.CurrentState");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalAadlV3.g:6505:3: (this_PropertiesBlock_9= rulePropertiesBlock[$current] )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==19) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // InternalAadlV3.g:6506:4: this_PropertiesBlock_9= rulePropertiesBlock[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getFlowSinkRuleRule());
                      				}
                      				newCompositeNode(grammarAccess.getFlowSinkRuleAccess().getPropertiesBlockParserRuleCall_8());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_PropertiesBlock_9=rulePropertiesBlock(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_PropertiesBlock_9;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getFlowSinkRuleAccess().getSemicolonKeyword_9());
              		
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
    // $ANTLR end "ruleFlowSinkRule"


    // $ANTLR start "entryRuleAssignment"
    // InternalAadlV3.g:6529:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalAadlV3.g:6529:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalAadlV3.g:6530:2: iv_ruleAssignment= ruleAssignment EOF
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
    // InternalAadlV3.g:6536:1: ruleAssignment returns [EObject current=null] : ( ( (lv_left_0_0= ruleModelElementReference ) ) ( ( (lv_operator_1_0= ruleEqualsOperation ) ) ( (lv_right_2_0= ruleNamedElementReference ) ) )? ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        AntlrDatatypeRuleToken lv_operator_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:6542:2: ( ( ( (lv_left_0_0= ruleModelElementReference ) ) ( ( (lv_operator_1_0= ruleEqualsOperation ) ) ( (lv_right_2_0= ruleNamedElementReference ) ) )? ) )
            // InternalAadlV3.g:6543:2: ( ( (lv_left_0_0= ruleModelElementReference ) ) ( ( (lv_operator_1_0= ruleEqualsOperation ) ) ( (lv_right_2_0= ruleNamedElementReference ) ) )? )
            {
            // InternalAadlV3.g:6543:2: ( ( (lv_left_0_0= ruleModelElementReference ) ) ( ( (lv_operator_1_0= ruleEqualsOperation ) ) ( (lv_right_2_0= ruleNamedElementReference ) ) )? )
            // InternalAadlV3.g:6544:3: ( (lv_left_0_0= ruleModelElementReference ) ) ( ( (lv_operator_1_0= ruleEqualsOperation ) ) ( (lv_right_2_0= ruleNamedElementReference ) ) )?
            {
            // InternalAadlV3.g:6544:3: ( (lv_left_0_0= ruleModelElementReference ) )
            // InternalAadlV3.g:6545:4: (lv_left_0_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:6545:4: (lv_left_0_0= ruleModelElementReference )
            // InternalAadlV3.g:6546:5: lv_left_0_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignmentAccess().getLeftModelElementReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_93);
            lv_left_0_0=ruleModelElementReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssignmentRule());
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

            // InternalAadlV3.g:6563:3: ( ( (lv_operator_1_0= ruleEqualsOperation ) ) ( (lv_right_2_0= ruleNamedElementReference ) ) )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==34) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalAadlV3.g:6564:4: ( (lv_operator_1_0= ruleEqualsOperation ) ) ( (lv_right_2_0= ruleNamedElementReference ) )
                    {
                    // InternalAadlV3.g:6564:4: ( (lv_operator_1_0= ruleEqualsOperation ) )
                    // InternalAadlV3.g:6565:5: (lv_operator_1_0= ruleEqualsOperation )
                    {
                    // InternalAadlV3.g:6565:5: (lv_operator_1_0= ruleEqualsOperation )
                    // InternalAadlV3.g:6566:6: lv_operator_1_0= ruleEqualsOperation
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAssignmentAccess().getOperatorEqualsOperationParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_31);
                    lv_operator_1_0=ruleEqualsOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAssignmentRule());
                      						}
                      						set(
                      							current,
                      							"operator",
                      							lv_operator_1_0,
                      							"org.osate.xtext.aadlv3.AadlV3.EqualsOperation");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAadlV3.g:6583:4: ( (lv_right_2_0= ruleNamedElementReference ) )
                    // InternalAadlV3.g:6584:5: (lv_right_2_0= ruleNamedElementReference )
                    {
                    // InternalAadlV3.g:6584:5: (lv_right_2_0= ruleNamedElementReference )
                    // InternalAadlV3.g:6585:6: lv_right_2_0= ruleNamedElementReference
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAssignmentAccess().getRightNamedElementReferenceParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_2_0=ruleNamedElementReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAssignmentRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_2_0,
                      							"org.osate.xtext.aadlv3.AadlV3.NamedElementReference");
                      						afterParserOrEnumRuleCall();
                      					
                    }

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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleCurrentState"
    // InternalAadlV3.g:6607:1: entryRuleCurrentState returns [EObject current=null] : iv_ruleCurrentState= ruleCurrentState EOF ;
    public final EObject entryRuleCurrentState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCurrentState = null;


        try {
            // InternalAadlV3.g:6607:53: (iv_ruleCurrentState= ruleCurrentState EOF )
            // InternalAadlV3.g:6608:2: iv_ruleCurrentState= ruleCurrentState EOF
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
    // InternalAadlV3.g:6614:1: ruleCurrentState returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_currentState_2_0= ruleEnumerationLiteral ) ) ) ;
    public final EObject ruleCurrentState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_currentState_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:6620:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_currentState_2_0= ruleEnumerationLiteral ) ) ) )
            // InternalAadlV3.g:6621:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_currentState_2_0= ruleEnumerationLiteral ) ) )
            {
            // InternalAadlV3.g:6621:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_currentState_2_0= ruleEnumerationLiteral ) ) )
            // InternalAadlV3.g:6622:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_currentState_2_0= ruleEnumerationLiteral ) )
            {
            // InternalAadlV3.g:6622:3: ( (otherlv_0= RULE_ID ) )
            // InternalAadlV3.g:6623:4: (otherlv_0= RULE_ID )
            {
            // InternalAadlV3.g:6623:4: (otherlv_0= RULE_ID )
            // InternalAadlV3.g:6624:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCurrentStateRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_94); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getCurrentStateAccess().getStateVariableStateVariableCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCurrentStateAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalAadlV3.g:6642:3: ( (lv_currentState_2_0= ruleEnumerationLiteral ) )
            // InternalAadlV3.g:6643:4: (lv_currentState_2_0= ruleEnumerationLiteral )
            {
            // InternalAadlV3.g:6643:4: (lv_currentState_2_0= ruleEnumerationLiteral )
            // InternalAadlV3.g:6644:5: lv_currentState_2_0= ruleEnumerationLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCurrentStateAccess().getCurrentStateEnumerationLiteralParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_currentState_2_0=ruleEnumerationLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCurrentStateRule());
              					}
              					set(
              						current,
              						"currentState",
              						lv_currentState_2_0,
              						"org.osate.xtext.aadlv3.AadlV3.EnumerationLiteral");
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
    // $ANTLR end "ruleCurrentState"


    // $ANTLR start "entryRuleTargetState"
    // InternalAadlV3.g:6665:1: entryRuleTargetState returns [EObject current=null] : iv_ruleTargetState= ruleTargetState EOF ;
    public final EObject entryRuleTargetState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetState = null;


        try {
            // InternalAadlV3.g:6665:52: (iv_ruleTargetState= ruleTargetState EOF )
            // InternalAadlV3.g:6666:2: iv_ruleTargetState= ruleTargetState EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTargetStateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTargetState=ruleTargetState();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTargetState; 
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
    // $ANTLR end "entryRuleTargetState"


    // $ANTLR start "ruleTargetState"
    // InternalAadlV3.g:6672:1: ruleTargetState returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_currentState_2_0= ruleEnumerationLiteral ) ) ) ;
    public final EObject ruleTargetState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_currentState_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:6678:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_currentState_2_0= ruleEnumerationLiteral ) ) ) )
            // InternalAadlV3.g:6679:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_currentState_2_0= ruleEnumerationLiteral ) ) )
            {
            // InternalAadlV3.g:6679:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_currentState_2_0= ruleEnumerationLiteral ) ) )
            // InternalAadlV3.g:6680:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_currentState_2_0= ruleEnumerationLiteral ) )
            {
            // InternalAadlV3.g:6680:3: ( (otherlv_0= RULE_ID ) )
            // InternalAadlV3.g:6681:4: (otherlv_0= RULE_ID )
            {
            // InternalAadlV3.g:6681:4: (otherlv_0= RULE_ID )
            // InternalAadlV3.g:6682:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTargetStateRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_94); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getTargetStateAccess().getStateVariableStateVariableCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTargetStateAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalAadlV3.g:6700:3: ( (lv_currentState_2_0= ruleEnumerationLiteral ) )
            // InternalAadlV3.g:6701:4: (lv_currentState_2_0= ruleEnumerationLiteral )
            {
            // InternalAadlV3.g:6701:4: (lv_currentState_2_0= ruleEnumerationLiteral )
            // InternalAadlV3.g:6702:5: lv_currentState_2_0= ruleEnumerationLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTargetStateAccess().getCurrentStateEnumerationLiteralParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_currentState_2_0=ruleEnumerationLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTargetStateRule());
              					}
              					set(
              						current,
              						"currentState",
              						lv_currentState_2_0,
              						"org.osate.xtext.aadlv3.AadlV3.EnumerationLiteral");
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
    // $ANTLR end "ruleTargetState"


    // $ANTLR start "entryRuleModelElementContainsLiteral"
    // InternalAadlV3.g:6723:1: entryRuleModelElementContainsLiteral returns [EObject current=null] : iv_ruleModelElementContainsLiteral= ruleModelElementContainsLiteral EOF ;
    public final EObject entryRuleModelElementContainsLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelElementContainsLiteral = null;


        try {
            // InternalAadlV3.g:6723:68: (iv_ruleModelElementContainsLiteral= ruleModelElementContainsLiteral EOF )
            // InternalAadlV3.g:6724:2: iv_ruleModelElementContainsLiteral= ruleModelElementContainsLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelElementContainsLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModelElementContainsLiteral=ruleModelElementContainsLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModelElementContainsLiteral; 
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
    // $ANTLR end "entryRuleModelElementContainsLiteral"


    // $ANTLR start "ruleModelElementContainsLiteral"
    // InternalAadlV3.g:6730:1: ruleModelElementContainsLiteral returns [EObject current=null] : ( ( (lv_left_0_0= ruleModelElementReference ) ) ( (lv_operator_1_0= ruleInOperation ) ) ( (lv_right_2_0= ruleListLiteral ) ) ) ;
    public final EObject ruleModelElementContainsLiteral() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        AntlrDatatypeRuleToken lv_operator_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:6736:2: ( ( ( (lv_left_0_0= ruleModelElementReference ) ) ( (lv_operator_1_0= ruleInOperation ) ) ( (lv_right_2_0= ruleListLiteral ) ) ) )
            // InternalAadlV3.g:6737:2: ( ( (lv_left_0_0= ruleModelElementReference ) ) ( (lv_operator_1_0= ruleInOperation ) ) ( (lv_right_2_0= ruleListLiteral ) ) )
            {
            // InternalAadlV3.g:6737:2: ( ( (lv_left_0_0= ruleModelElementReference ) ) ( (lv_operator_1_0= ruleInOperation ) ) ( (lv_right_2_0= ruleListLiteral ) ) )
            // InternalAadlV3.g:6738:3: ( (lv_left_0_0= ruleModelElementReference ) ) ( (lv_operator_1_0= ruleInOperation ) ) ( (lv_right_2_0= ruleListLiteral ) )
            {
            // InternalAadlV3.g:6738:3: ( (lv_left_0_0= ruleModelElementReference ) )
            // InternalAadlV3.g:6739:4: (lv_left_0_0= ruleModelElementReference )
            {
            // InternalAadlV3.g:6739:4: (lv_left_0_0= ruleModelElementReference )
            // InternalAadlV3.g:6740:5: lv_left_0_0= ruleModelElementReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModelElementContainsLiteralAccess().getLeftModelElementReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_95);
            lv_left_0_0=ruleModelElementReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getModelElementContainsLiteralRule());
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

            // InternalAadlV3.g:6757:3: ( (lv_operator_1_0= ruleInOperation ) )
            // InternalAadlV3.g:6758:4: (lv_operator_1_0= ruleInOperation )
            {
            // InternalAadlV3.g:6758:4: (lv_operator_1_0= ruleInOperation )
            // InternalAadlV3.g:6759:5: lv_operator_1_0= ruleInOperation
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModelElementContainsLiteralAccess().getOperatorInOperationParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_operator_1_0=ruleInOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getModelElementContainsLiteralRule());
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

            // InternalAadlV3.g:6776:3: ( (lv_right_2_0= ruleListLiteral ) )
            // InternalAadlV3.g:6777:4: (lv_right_2_0= ruleListLiteral )
            {
            // InternalAadlV3.g:6777:4: (lv_right_2_0= ruleListLiteral )
            // InternalAadlV3.g:6778:5: lv_right_2_0= ruleListLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModelElementContainsLiteralAccess().getRightListLiteralParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_right_2_0=ruleListLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getModelElementContainsLiteralRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_2_0,
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
    // $ANTLR end "ruleModelElementContainsLiteral"


    // $ANTLR start "ruleAnnotation"
    // InternalAadlV3.g:6800:1: ruleAnnotation[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '@' ( (lv_annotations_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAnnotation(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token lv_annotations_1_0=null;


        	enterRule();

        try {
            // InternalAadlV3.g:6806:2: ( (otherlv_0= '@' ( (lv_annotations_1_0= RULE_ID ) ) ) )
            // InternalAadlV3.g:6807:2: (otherlv_0= '@' ( (lv_annotations_1_0= RULE_ID ) ) )
            {
            // InternalAadlV3.g:6807:2: (otherlv_0= '@' ( (lv_annotations_1_0= RULE_ID ) ) )
            // InternalAadlV3.g:6808:3: otherlv_0= '@' ( (lv_annotations_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalAadlV3.g:6812:3: ( (lv_annotations_1_0= RULE_ID ) )
            // InternalAadlV3.g:6813:4: (lv_annotations_1_0= RULE_ID )
            {
            // InternalAadlV3.g:6813:4: (lv_annotations_1_0= RULE_ID )
            // InternalAadlV3.g:6814:5: lv_annotations_1_0= RULE_ID
            {
            lv_annotations_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_annotations_1_0, grammarAccess.getAnnotationAccess().getAnnotationsIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAnnotationRule());
              					}
              					addWithLastConsumed(
              						current,
              						"annotations",
              						lv_annotations_1_0,
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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleLiteral"
    // InternalAadlV3.g:6834:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalAadlV3.g:6834:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalAadlV3.g:6835:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalAadlV3.g:6841:1: ruleLiteral returns [EObject current=null] : (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_PropertyReference_4= rulePropertyReference | this_DirectionalLiteral_5= ruleDirectionalLiteral | this_ListLiteral_6= ruleListLiteral | this_MultiLiteralOperation_7= ruleMultiLiteralOperation | this_ModelElementContainsLiteral_8= ruleModelElementContainsLiteral | this_NamedElementReference_9= ruleNamedElementReference ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerLiteral_0 = null;

        EObject this_RealLiteral_1 = null;

        EObject this_StringLiteral_2 = null;

        EObject this_BooleanLiteral_3 = null;

        EObject this_PropertyReference_4 = null;

        EObject this_DirectionalLiteral_5 = null;

        EObject this_ListLiteral_6 = null;

        EObject this_MultiLiteralOperation_7 = null;

        EObject this_ModelElementContainsLiteral_8 = null;

        EObject this_NamedElementReference_9 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:6847:2: ( (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_PropertyReference_4= rulePropertyReference | this_DirectionalLiteral_5= ruleDirectionalLiteral | this_ListLiteral_6= ruleListLiteral | this_MultiLiteralOperation_7= ruleMultiLiteralOperation | this_ModelElementContainsLiteral_8= ruleModelElementContainsLiteral | this_NamedElementReference_9= ruleNamedElementReference ) )
            // InternalAadlV3.g:6848:2: (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_PropertyReference_4= rulePropertyReference | this_DirectionalLiteral_5= ruleDirectionalLiteral | this_ListLiteral_6= ruleListLiteral | this_MultiLiteralOperation_7= ruleMultiLiteralOperation | this_ModelElementContainsLiteral_8= ruleModelElementContainsLiteral | this_NamedElementReference_9= ruleNamedElementReference )
            {
            // InternalAadlV3.g:6848:2: (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_PropertyReference_4= rulePropertyReference | this_DirectionalLiteral_5= ruleDirectionalLiteral | this_ListLiteral_6= ruleListLiteral | this_MultiLiteralOperation_7= ruleMultiLiteralOperation | this_ModelElementContainsLiteral_8= ruleModelElementContainsLiteral | this_NamedElementReference_9= ruleNamedElementReference )
            int alt122=10;
            alt122 = dfa122.predict(input);
            switch (alt122) {
                case 1 :
                    // InternalAadlV3.g:6849:3: this_IntegerLiteral_0= ruleIntegerLiteral
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
                    // InternalAadlV3.g:6861:3: this_RealLiteral_1= ruleRealLiteral
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
                    // InternalAadlV3.g:6873:3: this_StringLiteral_2= ruleStringLiteral
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
                    // InternalAadlV3.g:6885:3: this_BooleanLiteral_3= ruleBooleanLiteral
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
                    // InternalAadlV3.g:6897:3: this_PropertyReference_4= rulePropertyReference
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
                    // InternalAadlV3.g:6909:3: this_DirectionalLiteral_5= ruleDirectionalLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getDirectionalLiteralParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DirectionalLiteral_5=ruleDirectionalLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DirectionalLiteral_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalAadlV3.g:6921:3: this_ListLiteral_6= ruleListLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getListLiteralParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ListLiteral_6=ruleListLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ListLiteral_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalAadlV3.g:6933:3: this_MultiLiteralOperation_7= ruleMultiLiteralOperation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getMultiLiteralOperationParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MultiLiteralOperation_7=ruleMultiLiteralOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MultiLiteralOperation_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalAadlV3.g:6945:3: this_ModelElementContainsLiteral_8= ruleModelElementContainsLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getModelElementContainsLiteralParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ModelElementContainsLiteral_8=ruleModelElementContainsLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ModelElementContainsLiteral_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalAadlV3.g:6957:3: this_NamedElementReference_9= ruleNamedElementReference
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getNamedElementReferenceParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NamedElementReference_9=ruleNamedElementReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NamedElementReference_9;
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


    // $ANTLR start "entryRulePropertyReference"
    // InternalAadlV3.g:6972:1: entryRulePropertyReference returns [EObject current=null] : iv_rulePropertyReference= rulePropertyReference EOF ;
    public final EObject entryRulePropertyReference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyReference = null;


        try {
            // InternalAadlV3.g:6972:58: (iv_rulePropertyReference= rulePropertyReference EOF )
            // InternalAadlV3.g:6973:2: iv_rulePropertyReference= rulePropertyReference EOF
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
    // InternalAadlV3.g:6979:1: rulePropertyReference returns [EObject current=null] : (otherlv_0= '#' ( ( ruleQualifiedName ) ) ) ;
    public final EObject rulePropertyReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalAadlV3.g:6985:2: ( (otherlv_0= '#' ( ( ruleQualifiedName ) ) ) )
            // InternalAadlV3.g:6986:2: (otherlv_0= '#' ( ( ruleQualifiedName ) ) )
            {
            // InternalAadlV3.g:6986:2: (otherlv_0= '#' ( ( ruleQualifiedName ) ) )
            // InternalAadlV3.g:6987:3: otherlv_0= '#' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPropertyReferenceAccess().getNumberSignKeyword_0());
              		
            }
            // InternalAadlV3.g:6991:3: ( ( ruleQualifiedName ) )
            // InternalAadlV3.g:6992:4: ( ruleQualifiedName )
            {
            // InternalAadlV3.g:6992:4: ( ruleQualifiedName )
            // InternalAadlV3.g:6993:5: ruleQualifiedName
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
    // InternalAadlV3.g:7014:1: entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final EObject entryRuleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteral = null;


        try {
            // InternalAadlV3.g:7014:55: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // InternalAadlV3.g:7015:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
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
    // InternalAadlV3.g:7021:1: ruleIntegerLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= RULE_ID ) )? ) ;
    public final EObject ruleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_unit_2_0=null;


        	enterRule();

        try {
            // InternalAadlV3.g:7027:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= RULE_ID ) )? ) )
            // InternalAadlV3.g:7028:2: ( () ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= RULE_ID ) )? )
            {
            // InternalAadlV3.g:7028:2: ( () ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= RULE_ID ) )? )
            // InternalAadlV3.g:7029:3: () ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= RULE_ID ) )?
            {
            // InternalAadlV3.g:7029:3: ()
            // InternalAadlV3.g:7030:4: 
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

            // InternalAadlV3.g:7039:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalAadlV3.g:7040:4: (lv_value_1_0= RULE_INT )
            {
            // InternalAadlV3.g:7040:4: (lv_value_1_0= RULE_INT )
            // InternalAadlV3.g:7041:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_96); if (state.failed) return current;
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

            // InternalAadlV3.g:7057:3: ( (lv_unit_2_0= RULE_ID ) )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==RULE_ID) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // InternalAadlV3.g:7058:4: (lv_unit_2_0= RULE_ID )
                    {
                    // InternalAadlV3.g:7058:4: (lv_unit_2_0= RULE_ID )
                    // InternalAadlV3.g:7059:5: lv_unit_2_0= RULE_ID
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
    // InternalAadlV3.g:7079:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // InternalAadlV3.g:7079:52: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // InternalAadlV3.g:7080:2: iv_ruleRealLiteral= ruleRealLiteral EOF
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
    // InternalAadlV3.g:7086:1: ruleRealLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_DOUBLE ) ) ( (lv_unit_2_0= RULE_ID ) )? ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_unit_2_0=null;


        	enterRule();

        try {
            // InternalAadlV3.g:7092:2: ( ( () ( (lv_value_1_0= RULE_DOUBLE ) ) ( (lv_unit_2_0= RULE_ID ) )? ) )
            // InternalAadlV3.g:7093:2: ( () ( (lv_value_1_0= RULE_DOUBLE ) ) ( (lv_unit_2_0= RULE_ID ) )? )
            {
            // InternalAadlV3.g:7093:2: ( () ( (lv_value_1_0= RULE_DOUBLE ) ) ( (lv_unit_2_0= RULE_ID ) )? )
            // InternalAadlV3.g:7094:3: () ( (lv_value_1_0= RULE_DOUBLE ) ) ( (lv_unit_2_0= RULE_ID ) )?
            {
            // InternalAadlV3.g:7094:3: ()
            // InternalAadlV3.g:7095:4: 
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

            // InternalAadlV3.g:7104:3: ( (lv_value_1_0= RULE_DOUBLE ) )
            // InternalAadlV3.g:7105:4: (lv_value_1_0= RULE_DOUBLE )
            {
            // InternalAadlV3.g:7105:4: (lv_value_1_0= RULE_DOUBLE )
            // InternalAadlV3.g:7106:5: lv_value_1_0= RULE_DOUBLE
            {
            lv_value_1_0=(Token)match(input,RULE_DOUBLE,FOLLOW_96); if (state.failed) return current;
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

            // InternalAadlV3.g:7122:3: ( (lv_unit_2_0= RULE_ID ) )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==RULE_ID) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // InternalAadlV3.g:7123:4: (lv_unit_2_0= RULE_ID )
                    {
                    // InternalAadlV3.g:7123:4: (lv_unit_2_0= RULE_ID )
                    // InternalAadlV3.g:7124:5: lv_unit_2_0= RULE_ID
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
    // InternalAadlV3.g:7144:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalAadlV3.g:7144:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalAadlV3.g:7145:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalAadlV3.g:7151:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNoQuoteString ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:7157:2: ( ( () ( (lv_value_1_0= ruleNoQuoteString ) ) ) )
            // InternalAadlV3.g:7158:2: ( () ( (lv_value_1_0= ruleNoQuoteString ) ) )
            {
            // InternalAadlV3.g:7158:2: ( () ( (lv_value_1_0= ruleNoQuoteString ) ) )
            // InternalAadlV3.g:7159:3: () ( (lv_value_1_0= ruleNoQuoteString ) )
            {
            // InternalAadlV3.g:7159:3: ()
            // InternalAadlV3.g:7160:4: 
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

            // InternalAadlV3.g:7169:3: ( (lv_value_1_0= ruleNoQuoteString ) )
            // InternalAadlV3.g:7170:4: (lv_value_1_0= ruleNoQuoteString )
            {
            // InternalAadlV3.g:7170:4: (lv_value_1_0= ruleNoQuoteString )
            // InternalAadlV3.g:7171:5: lv_value_1_0= ruleNoQuoteString
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
    // InternalAadlV3.g:7192:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteral = null;


        try {
            // InternalAadlV3.g:7192:59: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // InternalAadlV3.g:7193:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
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
    // InternalAadlV3.g:7199:1: ruleEnumerationLiteral returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAadlV3.g:7205:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAadlV3.g:7206:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAadlV3.g:7206:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAadlV3.g:7207:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalAadlV3.g:7207:3: ()
            // InternalAadlV3.g:7208:4: 
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

            // InternalAadlV3.g:7217:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAadlV3.g:7218:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAadlV3.g:7218:4: (lv_name_1_0= RULE_ID )
            // InternalAadlV3.g:7219:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEnumerationLiteralRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
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
    // InternalAadlV3.g:7239:1: entryRuleNoQuoteString returns [String current=null] : iv_ruleNoQuoteString= ruleNoQuoteString EOF ;
    public final String entryRuleNoQuoteString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoQuoteString = null;


        try {
            // InternalAadlV3.g:7239:53: (iv_ruleNoQuoteString= ruleNoQuoteString EOF )
            // InternalAadlV3.g:7240:2: iv_ruleNoQuoteString= ruleNoQuoteString EOF
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
    // InternalAadlV3.g:7246:1: ruleNoQuoteString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleNoQuoteString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalAadlV3.g:7252:2: (this_STRING_0= RULE_STRING )
            // InternalAadlV3.g:7253:2: this_STRING_0= RULE_STRING
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
    // InternalAadlV3.g:7263:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalAadlV3.g:7263:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalAadlV3.g:7264:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
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
    // InternalAadlV3.g:7270:1: ruleBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalAadlV3.g:7276:2: ( ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) ) )
            // InternalAadlV3.g:7277:2: ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            {
            // InternalAadlV3.g:7277:2: ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            // InternalAadlV3.g:7278:3: () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' )
            {
            // InternalAadlV3.g:7278:3: ()
            // InternalAadlV3.g:7279:4: 
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

            // InternalAadlV3.g:7288:3: ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' )
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==58) ) {
                alt125=1;
            }
            else if ( (LA125_0==59) ) {
                alt125=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;
            }
            switch (alt125) {
                case 1 :
                    // InternalAadlV3.g:7289:4: ( (lv_value_1_0= 'true' ) )
                    {
                    // InternalAadlV3.g:7289:4: ( (lv_value_1_0= 'true' ) )
                    // InternalAadlV3.g:7290:5: (lv_value_1_0= 'true' )
                    {
                    // InternalAadlV3.g:7290:5: (lv_value_1_0= 'true' )
                    // InternalAadlV3.g:7291:6: lv_value_1_0= 'true'
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
                    // InternalAadlV3.g:7304:4: otherlv_2= 'false'
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
    // InternalAadlV3.g:7313:1: entryRuleListLiteral returns [EObject current=null] : iv_ruleListLiteral= ruleListLiteral EOF ;
    public final EObject entryRuleListLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListLiteral = null;


        try {
            // InternalAadlV3.g:7313:52: (iv_ruleListLiteral= ruleListLiteral EOF )
            // InternalAadlV3.g:7314:2: iv_ruleListLiteral= ruleListLiteral EOF
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
    // InternalAadlV3.g:7320:1: ruleListLiteral returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_elements_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleLiteral ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleListLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:7326:2: ( ( () otherlv_1= '(' ( ( (lv_elements_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleLiteral ) ) )* )? otherlv_5= ')' ) )
            // InternalAadlV3.g:7327:2: ( () otherlv_1= '(' ( ( (lv_elements_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleLiteral ) ) )* )? otherlv_5= ')' )
            {
            // InternalAadlV3.g:7327:2: ( () otherlv_1= '(' ( ( (lv_elements_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleLiteral ) ) )* )? otherlv_5= ')' )
            // InternalAadlV3.g:7328:3: () otherlv_1= '(' ( ( (lv_elements_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleLiteral ) ) )* )? otherlv_5= ')'
            {
            // InternalAadlV3.g:7328:3: ()
            // InternalAadlV3.g:7329:4: 
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

            otherlv_1=(Token)match(input,24,FOLLOW_97); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getListLiteralAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalAadlV3.g:7342:3: ( ( (lv_elements_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleLiteral ) ) )* )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==RULE_ID||(LA127_0>=RULE_STRING && LA127_0<=RULE_DOUBLE)||(LA127_0>=24 && LA127_0<=25)||LA127_0==32||LA127_0==48||(LA127_0>=58 && LA127_0<=59)||(LA127_0>=76 && LA127_0<=77)||(LA127_0>=86 && LA127_0<=89)) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // InternalAadlV3.g:7343:4: ( (lv_elements_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleLiteral ) ) )*
                    {
                    // InternalAadlV3.g:7343:4: ( (lv_elements_2_0= ruleLiteral ) )
                    // InternalAadlV3.g:7344:5: (lv_elements_2_0= ruleLiteral )
                    {
                    // InternalAadlV3.g:7344:5: (lv_elements_2_0= ruleLiteral )
                    // InternalAadlV3.g:7345:6: lv_elements_2_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getListLiteralAccess().getElementsLiteralParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_20);
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

                    // InternalAadlV3.g:7362:4: (otherlv_3= ',' ( (lv_elements_4_0= ruleLiteral ) ) )*
                    loop126:
                    do {
                        int alt126=2;
                        int LA126_0 = input.LA(1);

                        if ( (LA126_0==26) ) {
                            alt126=1;
                        }


                        switch (alt126) {
                    	case 1 :
                    	    // InternalAadlV3.g:7363:5: otherlv_3= ',' ( (lv_elements_4_0= ruleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FOLLOW_31); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getListLiteralAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalAadlV3.g:7367:5: ( (lv_elements_4_0= ruleLiteral ) )
                    	    // InternalAadlV3.g:7368:6: (lv_elements_4_0= ruleLiteral )
                    	    {
                    	    // InternalAadlV3.g:7368:6: (lv_elements_4_0= ruleLiteral )
                    	    // InternalAadlV3.g:7369:7: lv_elements_4_0= ruleLiteral
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getListLiteralAccess().getElementsLiteralParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_20);
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
                    	    break loop126;
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
    // InternalAadlV3.g:7396:1: entryRuleDirectionalLiteral returns [EObject current=null] : iv_ruleDirectionalLiteral= ruleDirectionalLiteral EOF ;
    public final EObject entryRuleDirectionalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectionalLiteral = null;


        try {
            // InternalAadlV3.g:7396:59: (iv_ruleDirectionalLiteral= ruleDirectionalLiteral EOF )
            // InternalAadlV3.g:7397:2: iv_ruleDirectionalLiteral= ruleDirectionalLiteral EOF
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
    // InternalAadlV3.g:7403:1: ruleDirectionalLiteral returns [EObject current=null] : ( () ( (lv_direction_1_0= rulePropagationDirection ) ) ( (lv_value_2_0= ruleLiteral ) ) ) ;
    public final EObject ruleDirectionalLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_direction_1_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:7409:2: ( ( () ( (lv_direction_1_0= rulePropagationDirection ) ) ( (lv_value_2_0= ruleLiteral ) ) ) )
            // InternalAadlV3.g:7410:2: ( () ( (lv_direction_1_0= rulePropagationDirection ) ) ( (lv_value_2_0= ruleLiteral ) ) )
            {
            // InternalAadlV3.g:7410:2: ( () ( (lv_direction_1_0= rulePropagationDirection ) ) ( (lv_value_2_0= ruleLiteral ) ) )
            // InternalAadlV3.g:7411:3: () ( (lv_direction_1_0= rulePropagationDirection ) ) ( (lv_value_2_0= ruleLiteral ) )
            {
            // InternalAadlV3.g:7411:3: ()
            // InternalAadlV3.g:7412:4: 
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

            // InternalAadlV3.g:7421:3: ( (lv_direction_1_0= rulePropagationDirection ) )
            // InternalAadlV3.g:7422:4: (lv_direction_1_0= rulePropagationDirection )
            {
            // InternalAadlV3.g:7422:4: (lv_direction_1_0= rulePropagationDirection )
            // InternalAadlV3.g:7423:5: lv_direction_1_0= rulePropagationDirection
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDirectionalLiteralAccess().getDirectionPropagationDirectionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_31);
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

            // InternalAadlV3.g:7440:3: ( (lv_value_2_0= ruleLiteral ) )
            // InternalAadlV3.g:7441:4: (lv_value_2_0= ruleLiteral )
            {
            // InternalAadlV3.g:7441:4: (lv_value_2_0= ruleLiteral )
            // InternalAadlV3.g:7442:5: lv_value_2_0= ruleLiteral
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
    // InternalAadlV3.g:7463:1: entryRuleMultiLiteralOperation returns [EObject current=null] : iv_ruleMultiLiteralOperation= ruleMultiLiteralOperation EOF ;
    public final EObject entryRuleMultiLiteralOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiLiteralOperation = null;


        try {
            // InternalAadlV3.g:7463:62: (iv_ruleMultiLiteralOperation= ruleMultiLiteralOperation EOF )
            // InternalAadlV3.g:7464:2: iv_ruleMultiLiteralOperation= ruleMultiLiteralOperation EOF
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
    // InternalAadlV3.g:7470:1: ruleMultiLiteralOperation returns [EObject current=null] : ( () ( (lv_operator_1_0= ruleEOperation ) ) otherlv_2= '(' ( ( (lv_elements_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleLiteral ) ) )* )? otherlv_6= ')' ) ;
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
            // InternalAadlV3.g:7476:2: ( ( () ( (lv_operator_1_0= ruleEOperation ) ) otherlv_2= '(' ( ( (lv_elements_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleLiteral ) ) )* )? otherlv_6= ')' ) )
            // InternalAadlV3.g:7477:2: ( () ( (lv_operator_1_0= ruleEOperation ) ) otherlv_2= '(' ( ( (lv_elements_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleLiteral ) ) )* )? otherlv_6= ')' )
            {
            // InternalAadlV3.g:7477:2: ( () ( (lv_operator_1_0= ruleEOperation ) ) otherlv_2= '(' ( ( (lv_elements_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleLiteral ) ) )* )? otherlv_6= ')' )
            // InternalAadlV3.g:7478:3: () ( (lv_operator_1_0= ruleEOperation ) ) otherlv_2= '(' ( ( (lv_elements_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleLiteral ) ) )* )? otherlv_6= ')'
            {
            // InternalAadlV3.g:7478:3: ()
            // InternalAadlV3.g:7479:4: 
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

            // InternalAadlV3.g:7488:3: ( (lv_operator_1_0= ruleEOperation ) )
            // InternalAadlV3.g:7489:4: (lv_operator_1_0= ruleEOperation )
            {
            // InternalAadlV3.g:7489:4: (lv_operator_1_0= ruleEOperation )
            // InternalAadlV3.g:7490:5: lv_operator_1_0= ruleEOperation
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMultiLiteralOperationAccess().getOperatorEOperationParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_17);
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

            otherlv_2=(Token)match(input,24,FOLLOW_97); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMultiLiteralOperationAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalAadlV3.g:7511:3: ( ( (lv_elements_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleLiteral ) ) )* )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==RULE_ID||(LA129_0>=RULE_STRING && LA129_0<=RULE_DOUBLE)||(LA129_0>=24 && LA129_0<=25)||LA129_0==32||LA129_0==48||(LA129_0>=58 && LA129_0<=59)||(LA129_0>=76 && LA129_0<=77)||(LA129_0>=86 && LA129_0<=89)) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalAadlV3.g:7512:4: ( (lv_elements_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleLiteral ) ) )*
                    {
                    // InternalAadlV3.g:7512:4: ( (lv_elements_3_0= ruleLiteral ) )
                    // InternalAadlV3.g:7513:5: (lv_elements_3_0= ruleLiteral )
                    {
                    // InternalAadlV3.g:7513:5: (lv_elements_3_0= ruleLiteral )
                    // InternalAadlV3.g:7514:6: lv_elements_3_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMultiLiteralOperationAccess().getElementsLiteralParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_20);
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

                    // InternalAadlV3.g:7531:4: (otherlv_4= ',' ( (lv_elements_5_0= ruleLiteral ) ) )*
                    loop128:
                    do {
                        int alt128=2;
                        int LA128_0 = input.LA(1);

                        if ( (LA128_0==26) ) {
                            alt128=1;
                        }


                        switch (alt128) {
                    	case 1 :
                    	    // InternalAadlV3.g:7532:5: otherlv_4= ',' ( (lv_elements_5_0= ruleLiteral ) )
                    	    {
                    	    otherlv_4=(Token)match(input,26,FOLLOW_31); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getMultiLiteralOperationAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalAadlV3.g:7536:5: ( (lv_elements_5_0= ruleLiteral ) )
                    	    // InternalAadlV3.g:7537:6: (lv_elements_5_0= ruleLiteral )
                    	    {
                    	    // InternalAadlV3.g:7537:6: (lv_elements_5_0= ruleLiteral )
                    	    // InternalAadlV3.g:7538:7: lv_elements_5_0= ruleLiteral
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getMultiLiteralOperationAccess().getElementsLiteralParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_20);
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
                    	    break loop128;
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
    // InternalAadlV3.g:7565:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalAadlV3.g:7565:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalAadlV3.g:7566:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalAadlV3.g:7572:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '::*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:7578:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '::*' ) )
            // InternalAadlV3.g:7579:2: (this_QualifiedName_0= ruleQualifiedName kw= '::*' )
            {
            // InternalAadlV3.g:7579:2: (this_QualifiedName_0= ruleQualifiedName kw= '::*' )
            // InternalAadlV3.g:7580:3: this_QualifiedName_0= ruleQualifiedName kw= '::*'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_98);
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
    // InternalAadlV3.g:7599:1: entryRuleDottedName returns [String current=null] : iv_ruleDottedName= ruleDottedName EOF ;
    public final String entryRuleDottedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDottedName = null;


        try {
            // InternalAadlV3.g:7599:50: (iv_ruleDottedName= ruleDottedName EOF )
            // InternalAadlV3.g:7600:2: iv_ruleDottedName= ruleDottedName EOF
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
    // InternalAadlV3.g:7606:1: ruleDottedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleDottedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAadlV3.g:7612:2: ( (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID ) )
            // InternalAadlV3.g:7613:2: (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID )
            {
            // InternalAadlV3.g:7613:2: (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID )
            // InternalAadlV3.g:7614:3: this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_99); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getDottedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,36,FOLLOW_5); if (state.failed) return current;
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
    // InternalAadlV3.g:7637:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAadlV3.g:7637:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAadlV3.g:7638:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalAadlV3.g:7644:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAadlV3.g:7650:2: ( (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* ) )
            // InternalAadlV3.g:7651:2: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* )
            {
            // InternalAadlV3.g:7651:2: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* )
            // InternalAadlV3.g:7652:3: this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_100); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalAadlV3.g:7659:3: (kw= '::' this_ID_2= RULE_ID )*
            loop130:
            do {
                int alt130=2;
                int LA130_0 = input.LA(1);

                if ( (LA130_0==61) ) {
                    alt130=1;
                }


                switch (alt130) {
            	case 1 :
            	    // InternalAadlV3.g:7660:4: kw= '::' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,61,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_100); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop130;
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
    // InternalAadlV3.g:7677:1: entryRuleQualifiedTypesReference returns [String current=null] : iv_ruleQualifiedTypesReference= ruleQualifiedTypesReference EOF ;
    public final String entryRuleQualifiedTypesReference() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedTypesReference = null;


        try {
            // InternalAadlV3.g:7677:63: (iv_ruleQualifiedTypesReference= ruleQualifiedTypesReference EOF )
            // InternalAadlV3.g:7678:2: iv_ruleQualifiedTypesReference= ruleQualifiedTypesReference EOF
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
    // InternalAadlV3.g:7684:1: ruleQualifiedTypesReference returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedTypesReference() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:7690:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )? ) )
            // InternalAadlV3.g:7691:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )? )
            {
            // InternalAadlV3.g:7691:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )? )
            // InternalAadlV3.g:7692:3: this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedTypesReferenceAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_34);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAadlV3.g:7702:3: (kw= '.' this_ID_2= RULE_ID )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==36) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // InternalAadlV3.g:7703:4: kw= '.' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,36,FOLLOW_5); if (state.failed) return current;
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
    // InternalAadlV3.g:7720:1: entryRuleQualifiedReference returns [String current=null] : iv_ruleQualifiedReference= ruleQualifiedReference EOF ;
    public final String entryRuleQualifiedReference() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedReference = null;


        try {
            // InternalAadlV3.g:7720:58: (iv_ruleQualifiedReference= ruleQualifiedReference EOF )
            // InternalAadlV3.g:7721:2: iv_ruleQualifiedReference= ruleQualifiedReference EOF
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
    // InternalAadlV3.g:7727:1: ruleQualifiedReference returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_QualifiedName_0= ruleQualifiedName ;
    public final AntlrDatatypeRuleToken ruleQualifiedReference() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:7733:2: (this_QualifiedName_0= ruleQualifiedName )
            // InternalAadlV3.g:7734:2: this_QualifiedName_0= ruleQualifiedName
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
    // InternalAadlV3.g:7747:1: entryRuleQualifiedDottedReference returns [String current=null] : iv_ruleQualifiedDottedReference= ruleQualifiedDottedReference EOF ;
    public final String entryRuleQualifiedDottedReference() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedDottedReference = null;


        try {
            // InternalAadlV3.g:7747:64: (iv_ruleQualifiedDottedReference= ruleQualifiedDottedReference EOF )
            // InternalAadlV3.g:7748:2: iv_ruleQualifiedDottedReference= ruleQualifiedDottedReference EOF
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
    // InternalAadlV3.g:7754:1: ruleQualifiedDottedReference returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.' this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedDottedReference() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:7760:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '.' this_ID_2= RULE_ID ) )
            // InternalAadlV3.g:7761:2: (this_QualifiedName_0= ruleQualifiedName kw= '.' this_ID_2= RULE_ID )
            {
            // InternalAadlV3.g:7761:2: (this_QualifiedName_0= ruleQualifiedName kw= '.' this_ID_2= RULE_ID )
            // InternalAadlV3.g:7762:3: this_QualifiedName_0= ruleQualifiedName kw= '.' this_ID_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedDottedReferenceAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_99);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,36,FOLLOW_5); if (state.failed) return current;
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
    // InternalAadlV3.g:7788:1: entryRuleComponentCategory returns [String current=null] : iv_ruleComponentCategory= ruleComponentCategory EOF ;
    public final String entryRuleComponentCategory() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComponentCategory = null;


        try {
            // InternalAadlV3.g:7788:57: (iv_ruleComponentCategory= ruleComponentCategory EOF )
            // InternalAadlV3.g:7789:2: iv_ruleComponentCategory= ruleComponentCategory EOF
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
    // InternalAadlV3.g:7795:1: ruleComponentCategory returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'abstract' | kw= 'bus' | kw= 'data' | kw= 'device' | kw= 'memory' | kw= 'process' | kw= 'processor' | kw= 'system' | kw= 'thread' | this_VirtualBusKeywords_9= ruleVirtualBusKeywords | this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords | this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords | this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords | kw= 'subprogram' | this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords | this_ThreadGroupKeywords_15= ruleThreadGroupKeywords ) ;
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
            // InternalAadlV3.g:7801:2: ( (kw= 'abstract' | kw= 'bus' | kw= 'data' | kw= 'device' | kw= 'memory' | kw= 'process' | kw= 'processor' | kw= 'system' | kw= 'thread' | this_VirtualBusKeywords_9= ruleVirtualBusKeywords | this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords | this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords | this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords | kw= 'subprogram' | this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords | this_ThreadGroupKeywords_15= ruleThreadGroupKeywords ) )
            // InternalAadlV3.g:7802:2: (kw= 'abstract' | kw= 'bus' | kw= 'data' | kw= 'device' | kw= 'memory' | kw= 'process' | kw= 'processor' | kw= 'system' | kw= 'thread' | this_VirtualBusKeywords_9= ruleVirtualBusKeywords | this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords | this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords | this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords | kw= 'subprogram' | this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords | this_ThreadGroupKeywords_15= ruleThreadGroupKeywords )
            {
            // InternalAadlV3.g:7802:2: (kw= 'abstract' | kw= 'bus' | kw= 'data' | kw= 'device' | kw= 'memory' | kw= 'process' | kw= 'processor' | kw= 'system' | kw= 'thread' | this_VirtualBusKeywords_9= ruleVirtualBusKeywords | this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords | this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords | this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords | kw= 'subprogram' | this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords | this_ThreadGroupKeywords_15= ruleThreadGroupKeywords )
            int alt132=16;
            alt132 = dfa132.predict(input);
            switch (alt132) {
                case 1 :
                    // InternalAadlV3.g:7803:3: kw= 'abstract'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getAbstractKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:7809:3: kw= 'bus'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getBusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:7815:3: kw= 'data'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getDataKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAadlV3.g:7821:3: kw= 'device'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getDeviceKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAadlV3.g:7827:3: kw= 'memory'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getMemoryKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAadlV3.g:7833:3: kw= 'process'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getProcessKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalAadlV3.g:7839:3: kw= 'processor'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getProcessorKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalAadlV3.g:7845:3: kw= 'system'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getSystemKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalAadlV3.g:7851:3: kw= 'thread'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getThreadKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalAadlV3.g:7857:3: this_VirtualBusKeywords_9= ruleVirtualBusKeywords
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
                    // InternalAadlV3.g:7868:3: this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords
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
                    // InternalAadlV3.g:7879:3: this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords
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
                    // InternalAadlV3.g:7890:3: this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords
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
                    // InternalAadlV3.g:7901:3: kw= 'subprogram'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getComponentCategoryAccess().getSubprogramKeyword_13());
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalAadlV3.g:7907:3: this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords
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
                    // InternalAadlV3.g:7918:3: this_ThreadGroupKeywords_15= ruleThreadGroupKeywords
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
    // InternalAadlV3.g:7932:1: entryRuleFeatureCategory returns [String current=null] : iv_ruleFeatureCategory= ruleFeatureCategory EOF ;
    public final String entryRuleFeatureCategory() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureCategory = null;


        try {
            // InternalAadlV3.g:7932:55: (iv_ruleFeatureCategory= ruleFeatureCategory EOF )
            // InternalAadlV3.g:7933:2: iv_ruleFeatureCategory= ruleFeatureCategory EOF
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
    // InternalAadlV3.g:7939:1: ruleFeatureCategory returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'feature' | kw= 'port' | kw= 'parameter' | this_DataAccessKeywords_3= ruleDataAccessKeywords | this_BusAccessKeywords_4= ruleBusAccessKeywords | this_VirtualBusAccessKeywords_5= ruleVirtualBusAccessKeywords | this_SubprogramAccessKeywords_6= ruleSubprogramAccessKeywords | this_SubprogramGroupAccessKeywords_7= ruleSubprogramGroupAccessKeywords | kw= 'binding' | kw= 'interface' ) ;
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
            // InternalAadlV3.g:7945:2: ( (kw= 'feature' | kw= 'port' | kw= 'parameter' | this_DataAccessKeywords_3= ruleDataAccessKeywords | this_BusAccessKeywords_4= ruleBusAccessKeywords | this_VirtualBusAccessKeywords_5= ruleVirtualBusAccessKeywords | this_SubprogramAccessKeywords_6= ruleSubprogramAccessKeywords | this_SubprogramGroupAccessKeywords_7= ruleSubprogramGroupAccessKeywords | kw= 'binding' | kw= 'interface' ) )
            // InternalAadlV3.g:7946:2: (kw= 'feature' | kw= 'port' | kw= 'parameter' | this_DataAccessKeywords_3= ruleDataAccessKeywords | this_BusAccessKeywords_4= ruleBusAccessKeywords | this_VirtualBusAccessKeywords_5= ruleVirtualBusAccessKeywords | this_SubprogramAccessKeywords_6= ruleSubprogramAccessKeywords | this_SubprogramGroupAccessKeywords_7= ruleSubprogramGroupAccessKeywords | kw= 'binding' | kw= 'interface' )
            {
            // InternalAadlV3.g:7946:2: (kw= 'feature' | kw= 'port' | kw= 'parameter' | this_DataAccessKeywords_3= ruleDataAccessKeywords | this_BusAccessKeywords_4= ruleBusAccessKeywords | this_VirtualBusAccessKeywords_5= ruleVirtualBusAccessKeywords | this_SubprogramAccessKeywords_6= ruleSubprogramAccessKeywords | this_SubprogramGroupAccessKeywords_7= ruleSubprogramGroupAccessKeywords | kw= 'binding' | kw= 'interface' )
            int alt133=10;
            alt133 = dfa133.predict(input);
            switch (alt133) {
                case 1 :
                    // InternalAadlV3.g:7947:3: kw= 'feature'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureCategoryAccess().getFeatureKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:7953:3: kw= 'port'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureCategoryAccess().getPortKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:7959:3: kw= 'parameter'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureCategoryAccess().getParameterKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAadlV3.g:7965:3: this_DataAccessKeywords_3= ruleDataAccessKeywords
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
                    // InternalAadlV3.g:7976:3: this_BusAccessKeywords_4= ruleBusAccessKeywords
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
                    // InternalAadlV3.g:7987:3: this_VirtualBusAccessKeywords_5= ruleVirtualBusAccessKeywords
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
                    // InternalAadlV3.g:7998:3: this_SubprogramAccessKeywords_6= ruleSubprogramAccessKeywords
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
                    // InternalAadlV3.g:8009:3: this_SubprogramGroupAccessKeywords_7= ruleSubprogramGroupAccessKeywords
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
                    // InternalAadlV3.g:8020:3: kw= 'binding'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureCategoryAccess().getBindingKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalAadlV3.g:8026:3: kw= 'interface'
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
    // InternalAadlV3.g:8035:1: entryRuleFeatureDirection returns [String current=null] : iv_ruleFeatureDirection= ruleFeatureDirection EOF ;
    public final String entryRuleFeatureDirection() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureDirection = null;


        try {
            // InternalAadlV3.g:8035:56: (iv_ruleFeatureDirection= ruleFeatureDirection EOF )
            // InternalAadlV3.g:8036:2: iv_ruleFeatureDirection= ruleFeatureDirection EOF
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
    // InternalAadlV3.g:8042:1: ruleFeatureDirection returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'in' | kw= 'out' | this_InOutKeywords_2= ruleInOutKeywords | kw= 'requires' | kw= 'provides' | this_ProvidesReadKeywords_5= ruleProvidesReadKeywords | this_RequiresReadKeywords_6= ruleRequiresReadKeywords | this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords | this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords | this_ProvidesRWKeywords_9= ruleProvidesRWKeywords | this_RequiresRWKeywords_10= ruleRequiresRWKeywords ) ;
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
            // InternalAadlV3.g:8048:2: ( (kw= 'in' | kw= 'out' | this_InOutKeywords_2= ruleInOutKeywords | kw= 'requires' | kw= 'provides' | this_ProvidesReadKeywords_5= ruleProvidesReadKeywords | this_RequiresReadKeywords_6= ruleRequiresReadKeywords | this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords | this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords | this_ProvidesRWKeywords_9= ruleProvidesRWKeywords | this_RequiresRWKeywords_10= ruleRequiresRWKeywords ) )
            // InternalAadlV3.g:8049:2: (kw= 'in' | kw= 'out' | this_InOutKeywords_2= ruleInOutKeywords | kw= 'requires' | kw= 'provides' | this_ProvidesReadKeywords_5= ruleProvidesReadKeywords | this_RequiresReadKeywords_6= ruleRequiresReadKeywords | this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords | this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords | this_ProvidesRWKeywords_9= ruleProvidesRWKeywords | this_RequiresRWKeywords_10= ruleRequiresRWKeywords )
            {
            // InternalAadlV3.g:8049:2: (kw= 'in' | kw= 'out' | this_InOutKeywords_2= ruleInOutKeywords | kw= 'requires' | kw= 'provides' | this_ProvidesReadKeywords_5= ruleProvidesReadKeywords | this_RequiresReadKeywords_6= ruleRequiresReadKeywords | this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords | this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords | this_ProvidesRWKeywords_9= ruleProvidesRWKeywords | this_RequiresRWKeywords_10= ruleRequiresRWKeywords )
            int alt134=11;
            alt134 = dfa134.predict(input);
            switch (alt134) {
                case 1 :
                    // InternalAadlV3.g:8050:3: kw= 'in'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureDirectionAccess().getInKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:8056:3: kw= 'out'
                    {
                    kw=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureDirectionAccess().getOutKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:8062:3: this_InOutKeywords_2= ruleInOutKeywords
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
                    // InternalAadlV3.g:8073:3: kw= 'requires'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureDirectionAccess().getRequiresKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAadlV3.g:8079:3: kw= 'provides'
                    {
                    kw=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureDirectionAccess().getProvidesKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAadlV3.g:8085:3: this_ProvidesReadKeywords_5= ruleProvidesReadKeywords
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
                    // InternalAadlV3.g:8096:3: this_RequiresReadKeywords_6= ruleRequiresReadKeywords
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
                    // InternalAadlV3.g:8107:3: this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords
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
                    // InternalAadlV3.g:8118:3: this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords
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
                    // InternalAadlV3.g:8129:3: this_ProvidesRWKeywords_9= ruleProvidesRWKeywords
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
                    // InternalAadlV3.g:8140:3: this_RequiresRWKeywords_10= ruleRequiresRWKeywords
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
    // InternalAadlV3.g:8154:1: entryRulePropagationDirection returns [String current=null] : iv_rulePropagationDirection= rulePropagationDirection EOF ;
    public final String entryRulePropagationDirection() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropagationDirection = null;


        try {
            // InternalAadlV3.g:8154:60: (iv_rulePropagationDirection= rulePropagationDirection EOF )
            // InternalAadlV3.g:8155:2: iv_rulePropagationDirection= rulePropagationDirection EOF
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
    // InternalAadlV3.g:8161:1: rulePropagationDirection returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'in' | kw= 'out' ) ;
    public final AntlrDatatypeRuleToken rulePropagationDirection() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:8167:2: ( (kw= 'in' | kw= 'out' ) )
            // InternalAadlV3.g:8168:2: (kw= 'in' | kw= 'out' )
            {
            // InternalAadlV3.g:8168:2: (kw= 'in' | kw= 'out' )
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==76) ) {
                alt135=1;
            }
            else if ( (LA135_0==77) ) {
                alt135=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 135, 0, input);

                throw nvae;
            }
            switch (alt135) {
                case 1 :
                    // InternalAadlV3.g:8169:3: kw= 'in'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPropagationDirectionAccess().getInKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:8175:3: kw= 'out'
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
    // InternalAadlV3.g:8184:1: entryRuleComposite returns [String current=null] : iv_ruleComposite= ruleComposite EOF ;
    public final String entryRuleComposite() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComposite = null;


        try {
            // InternalAadlV3.g:8184:49: (iv_ruleComposite= ruleComposite EOF )
            // InternalAadlV3.g:8185:2: iv_ruleComposite= ruleComposite EOF
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
    // InternalAadlV3.g:8191:1: ruleComposite returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'list' | kw= 'set' ) ;
    public final AntlrDatatypeRuleToken ruleComposite() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:8197:2: ( (kw= 'list' | kw= 'set' ) )
            // InternalAadlV3.g:8198:2: (kw= 'list' | kw= 'set' )
            {
            // InternalAadlV3.g:8198:2: (kw= 'list' | kw= 'set' )
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==80) ) {
                alt136=1;
            }
            else if ( (LA136_0==81) ) {
                alt136=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 136, 0, input);

                throw nvae;
            }
            switch (alt136) {
                case 1 :
                    // InternalAadlV3.g:8199:3: kw= 'list'
                    {
                    kw=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCompositeAccess().getListKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:8205:3: kw= 'set'
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
    // InternalAadlV3.g:8214:1: entryRulePrimitive returns [String current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final String entryRulePrimitive() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitive = null;


        try {
            // InternalAadlV3.g:8214:49: (iv_rulePrimitive= rulePrimitive EOF )
            // InternalAadlV3.g:8215:2: iv_rulePrimitive= rulePrimitive EOF
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
    // InternalAadlV3.g:8221:1: rulePrimitive returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'boolean' | kw= 'integer' | kw= 'real' | kw= 'string' ) ;
    public final AntlrDatatypeRuleToken rulePrimitive() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:8227:2: ( (kw= 'boolean' | kw= 'integer' | kw= 'real' | kw= 'string' ) )
            // InternalAadlV3.g:8228:2: (kw= 'boolean' | kw= 'integer' | kw= 'real' | kw= 'string' )
            {
            // InternalAadlV3.g:8228:2: (kw= 'boolean' | kw= 'integer' | kw= 'real' | kw= 'string' )
            int alt137=4;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt137=1;
                }
                break;
            case 83:
                {
                alt137=2;
                }
                break;
            case 84:
                {
                alt137=3;
                }
                break;
            case 85:
                {
                alt137=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 137, 0, input);

                throw nvae;
            }

            switch (alt137) {
                case 1 :
                    // InternalAadlV3.g:8229:3: kw= 'boolean'
                    {
                    kw=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveAccess().getBooleanKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:8235:3: kw= 'integer'
                    {
                    kw=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveAccess().getIntegerKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:8241:3: kw= 'real'
                    {
                    kw=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveAccess().getRealKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAadlV3.g:8247:3: kw= 'string'
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
    // InternalAadlV3.g:8256:1: entryRuleEOperation returns [String current=null] : iv_ruleEOperation= ruleEOperation EOF ;
    public final String entryRuleEOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEOperation = null;


        try {
            // InternalAadlV3.g:8256:50: (iv_ruleEOperation= ruleEOperation EOF )
            // InternalAadlV3.g:8257:2: iv_ruleEOperation= ruleEOperation EOF
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
    // InternalAadlV3.g:8263:1: ruleEOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'any' | kw= 'all' | kw= 'oneof' | kw= 'of' | kw= 'ormore' | kw= 'orless' ) ;
    public final AntlrDatatypeRuleToken ruleEOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:8269:2: ( (kw= 'any' | kw= 'all' | kw= 'oneof' | kw= 'of' | kw= 'ormore' | kw= 'orless' ) )
            // InternalAadlV3.g:8270:2: (kw= 'any' | kw= 'all' | kw= 'oneof' | kw= 'of' | kw= 'ormore' | kw= 'orless' )
            {
            // InternalAadlV3.g:8270:2: (kw= 'any' | kw= 'all' | kw= 'oneof' | kw= 'of' | kw= 'ormore' | kw= 'orless' )
            int alt138=6;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt138=1;
                }
                break;
            case 25:
                {
                alt138=2;
                }
                break;
            case 87:
                {
                alt138=3;
                }
                break;
            case 48:
                {
                alt138=4;
                }
                break;
            case 88:
                {
                alt138=5;
                }
                break;
            case 89:
                {
                alt138=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 138, 0, input);

                throw nvae;
            }

            switch (alt138) {
                case 1 :
                    // InternalAadlV3.g:8271:3: kw= 'any'
                    {
                    kw=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEOperationAccess().getAnyKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAadlV3.g:8277:3: kw= 'all'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEOperationAccess().getAllKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAadlV3.g:8283:3: kw= 'oneof'
                    {
                    kw=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEOperationAccess().getOneofKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAadlV3.g:8289:3: kw= 'of'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEOperationAccess().getOfKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAadlV3.g:8295:3: kw= 'ormore'
                    {
                    kw=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEOperationAccess().getOrmoreKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAadlV3.g:8301:3: kw= 'orless'
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
    // InternalAadlV3.g:8310:1: entryRuleSatisfiesOperation returns [String current=null] : iv_ruleSatisfiesOperation= ruleSatisfiesOperation EOF ;
    public final String entryRuleSatisfiesOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSatisfiesOperation = null;


        try {
            // InternalAadlV3.g:8310:58: (iv_ruleSatisfiesOperation= ruleSatisfiesOperation EOF )
            // InternalAadlV3.g:8311:2: iv_ruleSatisfiesOperation= ruleSatisfiesOperation EOF
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
    // InternalAadlV3.g:8317:1: ruleSatisfiesOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'satisfies' ;
    public final AntlrDatatypeRuleToken ruleSatisfiesOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:8323:2: (kw= 'satisfies' )
            // InternalAadlV3.g:8324:2: kw= 'satisfies'
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


    // $ANTLR start "entryRuleEqualsOperation"
    // InternalAadlV3.g:8332:1: entryRuleEqualsOperation returns [String current=null] : iv_ruleEqualsOperation= ruleEqualsOperation EOF ;
    public final String entryRuleEqualsOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEqualsOperation = null;


        try {
            // InternalAadlV3.g:8332:55: (iv_ruleEqualsOperation= ruleEqualsOperation EOF )
            // InternalAadlV3.g:8333:2: iv_ruleEqualsOperation= ruleEqualsOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualsOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEqualsOperation=ruleEqualsOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualsOperation.getText(); 
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
    // $ANTLR end "entryRuleEqualsOperation"


    // $ANTLR start "ruleEqualsOperation"
    // InternalAadlV3.g:8339:1: ruleEqualsOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleEqualsOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:8345:2: (kw= '=' )
            // InternalAadlV3.g:8346:2: kw= '='
            {
            kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getEqualsOperationAccess().getEqualsSignKeyword());
              	
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
    // $ANTLR end "ruleEqualsOperation"


    // $ANTLR start "entryRuleInOperation"
    // InternalAadlV3.g:8354:1: entryRuleInOperation returns [String current=null] : iv_ruleInOperation= ruleInOperation EOF ;
    public final String entryRuleInOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInOperation = null;


        try {
            // InternalAadlV3.g:8354:51: (iv_ruleInOperation= ruleInOperation EOF )
            // InternalAadlV3.g:8355:2: iv_ruleInOperation= ruleInOperation EOF
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
    // InternalAadlV3.g:8361:1: ruleInOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'in' ;
    public final AntlrDatatypeRuleToken ruleInOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:8367:2: (kw= 'in' )
            // InternalAadlV3.g:8368:2: kw= 'in'
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
    // InternalAadlV3.g:8376:1: entryRuleInputOperation returns [String current=null] : iv_ruleInputOperation= ruleInputOperation EOF ;
    public final String entryRuleInputOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInputOperation = null;


        try {
            // InternalAadlV3.g:8376:54: (iv_ruleInputOperation= ruleInputOperation EOF )
            // InternalAadlV3.g:8377:2: iv_ruleInputOperation= ruleInputOperation EOF
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
    // InternalAadlV3.g:8383:1: ruleInputOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '?' ;
    public final AntlrDatatypeRuleToken ruleInputOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:8389:2: (kw= '?' )
            // InternalAadlV3.g:8390:2: kw= '?'
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
    // InternalAadlV3.g:8398:1: entryRuleAssociationType returns [String current=null] : iv_ruleAssociationType= ruleAssociationType EOF ;
    public final String entryRuleAssociationType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAssociationType = null;


        try {
            // InternalAadlV3.g:8398:55: (iv_ruleAssociationType= ruleAssociationType EOF )
            // InternalAadlV3.g:8399:2: iv_ruleAssociationType= ruleAssociationType EOF
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
    // InternalAadlV3.g:8405:1: ruleAssociationType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IsConnection_0= ruleIsConnection | this_IsBinding_1= ruleIsBinding | this_IsFlow_2= ruleIsFlow ) ;
    public final AntlrDatatypeRuleToken ruleAssociationType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_IsConnection_0 = null;

        AntlrDatatypeRuleToken this_IsBinding_1 = null;

        AntlrDatatypeRuleToken this_IsFlow_2 = null;



        	enterRule();

        try {
            // InternalAadlV3.g:8411:2: ( (this_IsConnection_0= ruleIsConnection | this_IsBinding_1= ruleIsBinding | this_IsFlow_2= ruleIsFlow ) )
            // InternalAadlV3.g:8412:2: (this_IsConnection_0= ruleIsConnection | this_IsBinding_1= ruleIsBinding | this_IsFlow_2= ruleIsFlow )
            {
            // InternalAadlV3.g:8412:2: (this_IsConnection_0= ruleIsConnection | this_IsBinding_1= ruleIsBinding | this_IsFlow_2= ruleIsFlow )
            int alt139=3;
            switch ( input.LA(1) ) {
            case 92:
                {
                alt139=1;
                }
                break;
            case 75:
                {
                alt139=2;
                }
                break;
            case 45:
                {
                alt139=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 139, 0, input);

                throw nvae;
            }

            switch (alt139) {
                case 1 :
                    // InternalAadlV3.g:8413:3: this_IsConnection_0= ruleIsConnection
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
                    // InternalAadlV3.g:8424:3: this_IsBinding_1= ruleIsBinding
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
                    // InternalAadlV3.g:8435:3: this_IsFlow_2= ruleIsFlow
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
    // InternalAadlV3.g:8449:1: entryRuleIsConnection returns [String current=null] : iv_ruleIsConnection= ruleIsConnection EOF ;
    public final String entryRuleIsConnection() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIsConnection = null;


        try {
            // InternalAadlV3.g:8449:52: (iv_ruleIsConnection= ruleIsConnection EOF )
            // InternalAadlV3.g:8450:2: iv_ruleIsConnection= ruleIsConnection EOF
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
    // InternalAadlV3.g:8456:1: ruleIsConnection returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'connection' ;
    public final AntlrDatatypeRuleToken ruleIsConnection() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:8462:2: (kw= 'connection' )
            // InternalAadlV3.g:8463:2: kw= 'connection'
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
    // InternalAadlV3.g:8471:1: entryRuleIsBinding returns [String current=null] : iv_ruleIsBinding= ruleIsBinding EOF ;
    public final String entryRuleIsBinding() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIsBinding = null;


        try {
            // InternalAadlV3.g:8471:49: (iv_ruleIsBinding= ruleIsBinding EOF )
            // InternalAadlV3.g:8472:2: iv_ruleIsBinding= ruleIsBinding EOF
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
    // InternalAadlV3.g:8478:1: ruleIsBinding returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'binding' ;
    public final AntlrDatatypeRuleToken ruleIsBinding() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:8484:2: (kw= 'binding' )
            // InternalAadlV3.g:8485:2: kw= 'binding'
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


    // $ANTLR start "entryRuleIsFlow"
    // InternalAadlV3.g:8493:1: entryRuleIsFlow returns [String current=null] : iv_ruleIsFlow= ruleIsFlow EOF ;
    public final String entryRuleIsFlow() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIsFlow = null;


        try {
            // InternalAadlV3.g:8493:46: (iv_ruleIsFlow= ruleIsFlow EOF )
            // InternalAadlV3.g:8494:2: iv_ruleIsFlow= ruleIsFlow EOF
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
    // InternalAadlV3.g:8500:1: ruleIsFlow returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'flow' ;
    public final AntlrDatatypeRuleToken ruleIsFlow() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:8506:2: (kw= 'flow' )
            // InternalAadlV3.g:8507:2: kw= 'flow'
            {
            kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:8515:1: entryRuleVirtualProcessorKeywords returns [String current=null] : iv_ruleVirtualProcessorKeywords= ruleVirtualProcessorKeywords EOF ;
    public final String entryRuleVirtualProcessorKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVirtualProcessorKeywords = null;


        try {
            // InternalAadlV3.g:8515:64: (iv_ruleVirtualProcessorKeywords= ruleVirtualProcessorKeywords EOF )
            // InternalAadlV3.g:8516:2: iv_ruleVirtualProcessorKeywords= ruleVirtualProcessorKeywords EOF
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
    // InternalAadlV3.g:8522:1: ruleVirtualProcessorKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'virtual' kw= 'processor' ) ;
    public final AntlrDatatypeRuleToken ruleVirtualProcessorKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:8528:2: ( (kw= 'virtual' kw= 'processor' ) )
            // InternalAadlV3.g:8529:2: (kw= 'virtual' kw= 'processor' )
            {
            // InternalAadlV3.g:8529:2: (kw= 'virtual' kw= 'processor' )
            // InternalAadlV3.g:8530:3: kw= 'virtual' kw= 'processor'
            {
            kw=(Token)match(input,93,FOLLOW_101); if (state.failed) return current;
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
    // InternalAadlV3.g:8544:1: entryRuleVirtualBusKeywords returns [String current=null] : iv_ruleVirtualBusKeywords= ruleVirtualBusKeywords EOF ;
    public final String entryRuleVirtualBusKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVirtualBusKeywords = null;


        try {
            // InternalAadlV3.g:8544:58: (iv_ruleVirtualBusKeywords= ruleVirtualBusKeywords EOF )
            // InternalAadlV3.g:8545:2: iv_ruleVirtualBusKeywords= ruleVirtualBusKeywords EOF
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
    // InternalAadlV3.g:8551:1: ruleVirtualBusKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'virtual' kw= 'bus' ) ;
    public final AntlrDatatypeRuleToken ruleVirtualBusKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:8557:2: ( (kw= 'virtual' kw= 'bus' ) )
            // InternalAadlV3.g:8558:2: (kw= 'virtual' kw= 'bus' )
            {
            // InternalAadlV3.g:8558:2: (kw= 'virtual' kw= 'bus' )
            // InternalAadlV3.g:8559:3: kw= 'virtual' kw= 'bus'
            {
            kw=(Token)match(input,93,FOLLOW_102); if (state.failed) return current;
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
    // InternalAadlV3.g:8573:1: entryRuleVirtualMemoryKeywords returns [String current=null] : iv_ruleVirtualMemoryKeywords= ruleVirtualMemoryKeywords EOF ;
    public final String entryRuleVirtualMemoryKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVirtualMemoryKeywords = null;


        try {
            // InternalAadlV3.g:8573:61: (iv_ruleVirtualMemoryKeywords= ruleVirtualMemoryKeywords EOF )
            // InternalAadlV3.g:8574:2: iv_ruleVirtualMemoryKeywords= ruleVirtualMemoryKeywords EOF
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
    // InternalAadlV3.g:8580:1: ruleVirtualMemoryKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'virtual' kw= 'memory' ) ;
    public final AntlrDatatypeRuleToken ruleVirtualMemoryKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:8586:2: ( (kw= 'virtual' kw= 'memory' ) )
            // InternalAadlV3.g:8587:2: (kw= 'virtual' kw= 'memory' )
            {
            // InternalAadlV3.g:8587:2: (kw= 'virtual' kw= 'memory' )
            // InternalAadlV3.g:8588:3: kw= 'virtual' kw= 'memory'
            {
            kw=(Token)match(input,93,FOLLOW_103); if (state.failed) return current;
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
    // InternalAadlV3.g:8602:1: entryRuleVirtualDeviceKeywords returns [String current=null] : iv_ruleVirtualDeviceKeywords= ruleVirtualDeviceKeywords EOF ;
    public final String entryRuleVirtualDeviceKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVirtualDeviceKeywords = null;


        try {
            // InternalAadlV3.g:8602:61: (iv_ruleVirtualDeviceKeywords= ruleVirtualDeviceKeywords EOF )
            // InternalAadlV3.g:8603:2: iv_ruleVirtualDeviceKeywords= ruleVirtualDeviceKeywords EOF
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
    // InternalAadlV3.g:8609:1: ruleVirtualDeviceKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'virtual' kw= 'device' ) ;
    public final AntlrDatatypeRuleToken ruleVirtualDeviceKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:8615:2: ( (kw= 'virtual' kw= 'device' ) )
            // InternalAadlV3.g:8616:2: (kw= 'virtual' kw= 'device' )
            {
            // InternalAadlV3.g:8616:2: (kw= 'virtual' kw= 'device' )
            // InternalAadlV3.g:8617:3: kw= 'virtual' kw= 'device'
            {
            kw=(Token)match(input,93,FOLLOW_104); if (state.failed) return current;
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
    // InternalAadlV3.g:8631:1: entryRuleThreadGroupKeywords returns [String current=null] : iv_ruleThreadGroupKeywords= ruleThreadGroupKeywords EOF ;
    public final String entryRuleThreadGroupKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleThreadGroupKeywords = null;


        try {
            // InternalAadlV3.g:8631:59: (iv_ruleThreadGroupKeywords= ruleThreadGroupKeywords EOF )
            // InternalAadlV3.g:8632:2: iv_ruleThreadGroupKeywords= ruleThreadGroupKeywords EOF
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
    // InternalAadlV3.g:8638:1: ruleThreadGroupKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'thread' kw= 'group' ) ;
    public final AntlrDatatypeRuleToken ruleThreadGroupKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:8644:2: ( (kw= 'thread' kw= 'group' ) )
            // InternalAadlV3.g:8645:2: (kw= 'thread' kw= 'group' )
            {
            // InternalAadlV3.g:8645:2: (kw= 'thread' kw= 'group' )
            // InternalAadlV3.g:8646:3: kw= 'thread' kw= 'group'
            {
            kw=(Token)match(input,70,FOLLOW_105); if (state.failed) return current;
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
    // InternalAadlV3.g:8660:1: entryRuleSubprogramGroupKeywords returns [String current=null] : iv_ruleSubprogramGroupKeywords= ruleSubprogramGroupKeywords EOF ;
    public final String entryRuleSubprogramGroupKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSubprogramGroupKeywords = null;


        try {
            // InternalAadlV3.g:8660:63: (iv_ruleSubprogramGroupKeywords= ruleSubprogramGroupKeywords EOF )
            // InternalAadlV3.g:8661:2: iv_ruleSubprogramGroupKeywords= ruleSubprogramGroupKeywords EOF
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
    // InternalAadlV3.g:8667:1: ruleSubprogramGroupKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'subprogram' kw= 'group' ) ;
    public final AntlrDatatypeRuleToken ruleSubprogramGroupKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:8673:2: ( (kw= 'subprogram' kw= 'group' ) )
            // InternalAadlV3.g:8674:2: (kw= 'subprogram' kw= 'group' )
            {
            // InternalAadlV3.g:8674:2: (kw= 'subprogram' kw= 'group' )
            // InternalAadlV3.g:8675:3: kw= 'subprogram' kw= 'group'
            {
            kw=(Token)match(input,71,FOLLOW_105); if (state.failed) return current;
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


    // $ANTLR start "entryRuleEndToEndFLowKeywords"
    // InternalAadlV3.g:8689:1: entryRuleEndToEndFLowKeywords returns [String current=null] : iv_ruleEndToEndFLowKeywords= ruleEndToEndFLowKeywords EOF ;
    public final String entryRuleEndToEndFLowKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEndToEndFLowKeywords = null;


        try {
            // InternalAadlV3.g:8689:60: (iv_ruleEndToEndFLowKeywords= ruleEndToEndFLowKeywords EOF )
            // InternalAadlV3.g:8690:2: iv_ruleEndToEndFLowKeywords= ruleEndToEndFLowKeywords EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEndToEndFLowKeywordsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEndToEndFLowKeywords=ruleEndToEndFLowKeywords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEndToEndFLowKeywords.getText(); 
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
    // $ANTLR end "entryRuleEndToEndFLowKeywords"


    // $ANTLR start "ruleEndToEndFLowKeywords"
    // InternalAadlV3.g:8696:1: ruleEndToEndFLowKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'end' kw= 'to' kw= 'end' kw= 'flow' ) ;
    public final AntlrDatatypeRuleToken ruleEndToEndFLowKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:8702:2: ( (kw= 'end' kw= 'to' kw= 'end' kw= 'flow' ) )
            // InternalAadlV3.g:8703:2: (kw= 'end' kw= 'to' kw= 'end' kw= 'flow' )
            {
            // InternalAadlV3.g:8703:2: (kw= 'end' kw= 'to' kw= 'end' kw= 'flow' )
            // InternalAadlV3.g:8704:3: kw= 'end' kw= 'to' kw= 'end' kw= 'flow'
            {
            kw=(Token)match(input,16,FOLLOW_106); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getEndToEndFLowKeywordsAccess().getEndKeyword_0());
              		
            }
            kw=(Token)match(input,95,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getEndToEndFLowKeywordsAccess().getToKeyword_1());
              		
            }
            kw=(Token)match(input,16,FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getEndToEndFLowKeywordsAccess().getEndKeyword_2());
              		
            }
            kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getEndToEndFLowKeywordsAccess().getFlowKeyword_3());
              		
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
    // $ANTLR end "ruleEndToEndFLowKeywords"


    // $ANTLR start "entryRuleInOutKeywords"
    // InternalAadlV3.g:8728:1: entryRuleInOutKeywords returns [String current=null] : iv_ruleInOutKeywords= ruleInOutKeywords EOF ;
    public final String entryRuleInOutKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInOutKeywords = null;


        try {
            // InternalAadlV3.g:8728:53: (iv_ruleInOutKeywords= ruleInOutKeywords EOF )
            // InternalAadlV3.g:8729:2: iv_ruleInOutKeywords= ruleInOutKeywords EOF
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
    // InternalAadlV3.g:8735:1: ruleInOutKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'in' kw= 'out' ) ;
    public final AntlrDatatypeRuleToken ruleInOutKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:8741:2: ( (kw= 'in' kw= 'out' ) )
            // InternalAadlV3.g:8742:2: (kw= 'in' kw= 'out' )
            {
            // InternalAadlV3.g:8742:2: (kw= 'in' kw= 'out' )
            // InternalAadlV3.g:8743:3: kw= 'in' kw= 'out'
            {
            kw=(Token)match(input,76,FOLLOW_107); if (state.failed) return current;
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
    // InternalAadlV3.g:8757:1: entryRuleBusAccessKeywords returns [String current=null] : iv_ruleBusAccessKeywords= ruleBusAccessKeywords EOF ;
    public final String entryRuleBusAccessKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBusAccessKeywords = null;


        try {
            // InternalAadlV3.g:8757:57: (iv_ruleBusAccessKeywords= ruleBusAccessKeywords EOF )
            // InternalAadlV3.g:8758:2: iv_ruleBusAccessKeywords= ruleBusAccessKeywords EOF
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
    // InternalAadlV3.g:8764:1: ruleBusAccessKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'bus' kw= 'access' ) ;
    public final AntlrDatatypeRuleToken ruleBusAccessKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:8770:2: ( (kw= 'bus' kw= 'access' ) )
            // InternalAadlV3.g:8771:2: (kw= 'bus' kw= 'access' )
            {
            // InternalAadlV3.g:8771:2: (kw= 'bus' kw= 'access' )
            // InternalAadlV3.g:8772:3: kw= 'bus' kw= 'access'
            {
            kw=(Token)match(input,63,FOLLOW_108); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getBusAccessKeywordsAccess().getBusKeyword_0());
              		
            }
            kw=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:8786:1: entryRuleVirtualBusAccessKeywords returns [String current=null] : iv_ruleVirtualBusAccessKeywords= ruleVirtualBusAccessKeywords EOF ;
    public final String entryRuleVirtualBusAccessKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVirtualBusAccessKeywords = null;


        try {
            // InternalAadlV3.g:8786:64: (iv_ruleVirtualBusAccessKeywords= ruleVirtualBusAccessKeywords EOF )
            // InternalAadlV3.g:8787:2: iv_ruleVirtualBusAccessKeywords= ruleVirtualBusAccessKeywords EOF
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
    // InternalAadlV3.g:8793:1: ruleVirtualBusAccessKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'virtual' kw= 'bus' kw= 'access' ) ;
    public final AntlrDatatypeRuleToken ruleVirtualBusAccessKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:8799:2: ( (kw= 'virtual' kw= 'bus' kw= 'access' ) )
            // InternalAadlV3.g:8800:2: (kw= 'virtual' kw= 'bus' kw= 'access' )
            {
            // InternalAadlV3.g:8800:2: (kw= 'virtual' kw= 'bus' kw= 'access' )
            // InternalAadlV3.g:8801:3: kw= 'virtual' kw= 'bus' kw= 'access'
            {
            kw=(Token)match(input,93,FOLLOW_102); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVirtualBusAccessKeywordsAccess().getVirtualKeyword_0());
              		
            }
            kw=(Token)match(input,63,FOLLOW_108); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVirtualBusAccessKeywordsAccess().getBusKeyword_1());
              		
            }
            kw=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:8820:1: entryRuleDataAccessKeywords returns [String current=null] : iv_ruleDataAccessKeywords= ruleDataAccessKeywords EOF ;
    public final String entryRuleDataAccessKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDataAccessKeywords = null;


        try {
            // InternalAadlV3.g:8820:58: (iv_ruleDataAccessKeywords= ruleDataAccessKeywords EOF )
            // InternalAadlV3.g:8821:2: iv_ruleDataAccessKeywords= ruleDataAccessKeywords EOF
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
    // InternalAadlV3.g:8827:1: ruleDataAccessKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'data' kw= 'access' ) ;
    public final AntlrDatatypeRuleToken ruleDataAccessKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:8833:2: ( (kw= 'data' kw= 'access' ) )
            // InternalAadlV3.g:8834:2: (kw= 'data' kw= 'access' )
            {
            // InternalAadlV3.g:8834:2: (kw= 'data' kw= 'access' )
            // InternalAadlV3.g:8835:3: kw= 'data' kw= 'access'
            {
            kw=(Token)match(input,64,FOLLOW_108); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDataAccessKeywordsAccess().getDataKeyword_0());
              		
            }
            kw=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:8849:1: entryRuleSubprogramAccessKeywords returns [String current=null] : iv_ruleSubprogramAccessKeywords= ruleSubprogramAccessKeywords EOF ;
    public final String entryRuleSubprogramAccessKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSubprogramAccessKeywords = null;


        try {
            // InternalAadlV3.g:8849:64: (iv_ruleSubprogramAccessKeywords= ruleSubprogramAccessKeywords EOF )
            // InternalAadlV3.g:8850:2: iv_ruleSubprogramAccessKeywords= ruleSubprogramAccessKeywords EOF
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
    // InternalAadlV3.g:8856:1: ruleSubprogramAccessKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'subprogram' kw= 'access' ) ;
    public final AntlrDatatypeRuleToken ruleSubprogramAccessKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:8862:2: ( (kw= 'subprogram' kw= 'access' ) )
            // InternalAadlV3.g:8863:2: (kw= 'subprogram' kw= 'access' )
            {
            // InternalAadlV3.g:8863:2: (kw= 'subprogram' kw= 'access' )
            // InternalAadlV3.g:8864:3: kw= 'subprogram' kw= 'access'
            {
            kw=(Token)match(input,71,FOLLOW_108); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSubprogramAccessKeywordsAccess().getSubprogramKeyword_0());
              		
            }
            kw=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:8878:1: entryRuleSubprogramGroupAccessKeywords returns [String current=null] : iv_ruleSubprogramGroupAccessKeywords= ruleSubprogramGroupAccessKeywords EOF ;
    public final String entryRuleSubprogramGroupAccessKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSubprogramGroupAccessKeywords = null;


        try {
            // InternalAadlV3.g:8878:69: (iv_ruleSubprogramGroupAccessKeywords= ruleSubprogramGroupAccessKeywords EOF )
            // InternalAadlV3.g:8879:2: iv_ruleSubprogramGroupAccessKeywords= ruleSubprogramGroupAccessKeywords EOF
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
    // InternalAadlV3.g:8885:1: ruleSubprogramGroupAccessKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'subprogram' kw= 'group' kw= 'access' ) ;
    public final AntlrDatatypeRuleToken ruleSubprogramGroupAccessKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:8891:2: ( (kw= 'subprogram' kw= 'group' kw= 'access' ) )
            // InternalAadlV3.g:8892:2: (kw= 'subprogram' kw= 'group' kw= 'access' )
            {
            // InternalAadlV3.g:8892:2: (kw= 'subprogram' kw= 'group' kw= 'access' )
            // InternalAadlV3.g:8893:3: kw= 'subprogram' kw= 'group' kw= 'access'
            {
            kw=(Token)match(input,71,FOLLOW_105); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSubprogramGroupAccessKeywordsAccess().getSubprogramKeyword_0());
              		
            }
            kw=(Token)match(input,94,FOLLOW_108); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSubprogramGroupAccessKeywordsAccess().getGroupKeyword_1());
              		
            }
            kw=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
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
    // InternalAadlV3.g:8912:1: entryRuleProvidesReadKeywords returns [String current=null] : iv_ruleProvidesReadKeywords= ruleProvidesReadKeywords EOF ;
    public final String entryRuleProvidesReadKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProvidesReadKeywords = null;


        try {
            // InternalAadlV3.g:8912:60: (iv_ruleProvidesReadKeywords= ruleProvidesReadKeywords EOF )
            // InternalAadlV3.g:8913:2: iv_ruleProvidesReadKeywords= ruleProvidesReadKeywords EOF
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
    // InternalAadlV3.g:8919:1: ruleProvidesReadKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'provides' kw= 'in' ) ;
    public final AntlrDatatypeRuleToken ruleProvidesReadKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:8925:2: ( (kw= 'provides' kw= 'in' ) )
            // InternalAadlV3.g:8926:2: (kw= 'provides' kw= 'in' )
            {
            // InternalAadlV3.g:8926:2: (kw= 'provides' kw= 'in' )
            // InternalAadlV3.g:8927:3: kw= 'provides' kw= 'in'
            {
            kw=(Token)match(input,79,FOLLOW_95); if (state.failed) return current;
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
    // InternalAadlV3.g:8941:1: entryRuleRequiresReadKeywords returns [String current=null] : iv_ruleRequiresReadKeywords= ruleRequiresReadKeywords EOF ;
    public final String entryRuleRequiresReadKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRequiresReadKeywords = null;


        try {
            // InternalAadlV3.g:8941:60: (iv_ruleRequiresReadKeywords= ruleRequiresReadKeywords EOF )
            // InternalAadlV3.g:8942:2: iv_ruleRequiresReadKeywords= ruleRequiresReadKeywords EOF
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
    // InternalAadlV3.g:8948:1: ruleRequiresReadKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'requires' kw= 'in' ) ;
    public final AntlrDatatypeRuleToken ruleRequiresReadKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:8954:2: ( (kw= 'requires' kw= 'in' ) )
            // InternalAadlV3.g:8955:2: (kw= 'requires' kw= 'in' )
            {
            // InternalAadlV3.g:8955:2: (kw= 'requires' kw= 'in' )
            // InternalAadlV3.g:8956:3: kw= 'requires' kw= 'in'
            {
            kw=(Token)match(input,78,FOLLOW_95); if (state.failed) return current;
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
    // InternalAadlV3.g:8970:1: entryRuleProvidesWriteKeywords returns [String current=null] : iv_ruleProvidesWriteKeywords= ruleProvidesWriteKeywords EOF ;
    public final String entryRuleProvidesWriteKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProvidesWriteKeywords = null;


        try {
            // InternalAadlV3.g:8970:61: (iv_ruleProvidesWriteKeywords= ruleProvidesWriteKeywords EOF )
            // InternalAadlV3.g:8971:2: iv_ruleProvidesWriteKeywords= ruleProvidesWriteKeywords EOF
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
    // InternalAadlV3.g:8977:1: ruleProvidesWriteKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'provides' kw= 'out' ) ;
    public final AntlrDatatypeRuleToken ruleProvidesWriteKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:8983:2: ( (kw= 'provides' kw= 'out' ) )
            // InternalAadlV3.g:8984:2: (kw= 'provides' kw= 'out' )
            {
            // InternalAadlV3.g:8984:2: (kw= 'provides' kw= 'out' )
            // InternalAadlV3.g:8985:3: kw= 'provides' kw= 'out'
            {
            kw=(Token)match(input,79,FOLLOW_107); if (state.failed) return current;
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
    // InternalAadlV3.g:8999:1: entryRuleRequiresWriteKeywords returns [String current=null] : iv_ruleRequiresWriteKeywords= ruleRequiresWriteKeywords EOF ;
    public final String entryRuleRequiresWriteKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRequiresWriteKeywords = null;


        try {
            // InternalAadlV3.g:8999:61: (iv_ruleRequiresWriteKeywords= ruleRequiresWriteKeywords EOF )
            // InternalAadlV3.g:9000:2: iv_ruleRequiresWriteKeywords= ruleRequiresWriteKeywords EOF
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
    // InternalAadlV3.g:9006:1: ruleRequiresWriteKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'requires' kw= 'out' ) ;
    public final AntlrDatatypeRuleToken ruleRequiresWriteKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:9012:2: ( (kw= 'requires' kw= 'out' ) )
            // InternalAadlV3.g:9013:2: (kw= 'requires' kw= 'out' )
            {
            // InternalAadlV3.g:9013:2: (kw= 'requires' kw= 'out' )
            // InternalAadlV3.g:9014:3: kw= 'requires' kw= 'out'
            {
            kw=(Token)match(input,78,FOLLOW_107); if (state.failed) return current;
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
    // InternalAadlV3.g:9028:1: entryRuleProvidesRWKeywords returns [String current=null] : iv_ruleProvidesRWKeywords= ruleProvidesRWKeywords EOF ;
    public final String entryRuleProvidesRWKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProvidesRWKeywords = null;


        try {
            // InternalAadlV3.g:9028:58: (iv_ruleProvidesRWKeywords= ruleProvidesRWKeywords EOF )
            // InternalAadlV3.g:9029:2: iv_ruleProvidesRWKeywords= ruleProvidesRWKeywords EOF
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
    // InternalAadlV3.g:9035:1: ruleProvidesRWKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'provides' kw= 'in' kw= 'out' ) ;
    public final AntlrDatatypeRuleToken ruleProvidesRWKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:9041:2: ( (kw= 'provides' kw= 'in' kw= 'out' ) )
            // InternalAadlV3.g:9042:2: (kw= 'provides' kw= 'in' kw= 'out' )
            {
            // InternalAadlV3.g:9042:2: (kw= 'provides' kw= 'in' kw= 'out' )
            // InternalAadlV3.g:9043:3: kw= 'provides' kw= 'in' kw= 'out'
            {
            kw=(Token)match(input,79,FOLLOW_95); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getProvidesRWKeywordsAccess().getProvidesKeyword_0());
              		
            }
            kw=(Token)match(input,76,FOLLOW_107); if (state.failed) return current;
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
    // InternalAadlV3.g:9062:1: entryRuleRequiresRWKeywords returns [String current=null] : iv_ruleRequiresRWKeywords= ruleRequiresRWKeywords EOF ;
    public final String entryRuleRequiresRWKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRequiresRWKeywords = null;


        try {
            // InternalAadlV3.g:9062:58: (iv_ruleRequiresRWKeywords= ruleRequiresRWKeywords EOF )
            // InternalAadlV3.g:9063:2: iv_ruleRequiresRWKeywords= ruleRequiresRWKeywords EOF
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
    // InternalAadlV3.g:9069:1: ruleRequiresRWKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'requires' kw= 'in' kw= 'out' ) ;
    public final AntlrDatatypeRuleToken ruleRequiresRWKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAadlV3.g:9075:2: ( (kw= 'requires' kw= 'in' kw= 'out' ) )
            // InternalAadlV3.g:9076:2: (kw= 'requires' kw= 'in' kw= 'out' )
            {
            // InternalAadlV3.g:9076:2: (kw= 'requires' kw= 'in' kw= 'out' )
            // InternalAadlV3.g:9077:3: kw= 'requires' kw= 'in' kw= 'out'
            {
            kw=(Token)match(input,78,FOLLOW_95); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRequiresRWKeywordsAccess().getRequiresKeyword_0());
              		
            }
            kw=(Token)match(input,76,FOLLOW_107); if (state.failed) return current;
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

    // $ANTLR start synpred20_InternalAadlV3
    public final void synpred20_InternalAadlV3_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_featureCategories_1_0 = null;


        // InternalAadlV3.g:598:3: ( ( (lv_featureCategories_1_0= ruleFeatureCategory ) ) )
        // InternalAadlV3.g:598:3: ( (lv_featureCategories_1_0= ruleFeatureCategory ) )
        {
        // InternalAadlV3.g:598:3: ( (lv_featureCategories_1_0= ruleFeatureCategory ) )
        // InternalAadlV3.g:599:4: (lv_featureCategories_1_0= ruleFeatureCategory )
        {
        // InternalAadlV3.g:599:4: (lv_featureCategories_1_0= ruleFeatureCategory )
        // InternalAadlV3.g:600:5: lv_featureCategories_1_0= ruleFeatureCategory
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
    // $ANTLR end synpred20_InternalAadlV3

    // $ANTLR start synpred34_InternalAadlV3
    public final void synpred34_InternalAadlV3_fragment() throws RecognitionException {   
        // InternalAadlV3.g:1182:4: ( '.' )
        // InternalAadlV3.g:1182:5: '.'
        {
        match(input,36,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_InternalAadlV3

    // $ANTLR start synpred35_InternalAadlV3
    public final void synpred35_InternalAadlV3_fragment() throws RecognitionException {   
        // InternalAadlV3.g:1255:4: ( '.' )
        // InternalAadlV3.g:1255:5: '.'
        {
        match(input,36,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalAadlV3

    // $ANTLR start synpred83_InternalAadlV3
    public final void synpred83_InternalAadlV3_fragment() throws RecognitionException {   
        // InternalAadlV3.g:3010:4: ( ( () '.' ( ( RULE_ID ) ) ) )
        // InternalAadlV3.g:3010:5: ( () '.' ( ( RULE_ID ) ) )
        {
        // InternalAadlV3.g:3010:5: ( () '.' ( ( RULE_ID ) ) )
        // InternalAadlV3.g:3011:5: () '.' ( ( RULE_ID ) )
        {
        // InternalAadlV3.g:3011:5: ()
        // InternalAadlV3.g:3012:5: 
        {
        }

        match(input,36,FOLLOW_5); if (state.failed) return ;
        // InternalAadlV3.g:3014:5: ( ( RULE_ID ) )
        // InternalAadlV3.g:3015:6: ( RULE_ID )
        {
        // InternalAadlV3.g:3015:6: ( RULE_ID )
        // InternalAadlV3.g:3016:7: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred83_InternalAadlV3

    // $ANTLR start synpred143_InternalAadlV3
    public final void synpred143_InternalAadlV3_fragment() throws RecognitionException {   
        EObject this_FlowPathRule_0 = null;


        // InternalAadlV3.g:5883:3: (this_FlowPathRule_0= ruleFlowPathRule )
        // InternalAadlV3.g:5883:3: this_FlowPathRule_0= ruleFlowPathRule
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_FlowPathRule_0=ruleFlowPathRule();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred143_InternalAadlV3

    // $ANTLR start synpred144_InternalAadlV3
    public final void synpred144_InternalAadlV3_fragment() throws RecognitionException {   
        EObject this_FlowSourceRule_1 = null;


        // InternalAadlV3.g:5895:3: (this_FlowSourceRule_1= ruleFlowSourceRule )
        // InternalAadlV3.g:5895:3: this_FlowSourceRule_1= ruleFlowSourceRule
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_FlowSourceRule_1=ruleFlowSourceRule();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred144_InternalAadlV3

    // Delegated rules

    public final boolean synpred34_InternalAadlV3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalAadlV3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalAadlV3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalAadlV3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred83_InternalAadlV3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred83_InternalAadlV3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred143_InternalAadlV3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred143_InternalAadlV3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred144_InternalAadlV3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred144_InternalAadlV3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalAadlV3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalAadlV3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA80 dfa80 = new DFA80(this);
    protected DFA93 dfa93 = new DFA93(this);
    protected DFA102 dfa102 = new DFA102(this);
    protected DFA107 dfa107 = new DFA107(this);
    protected DFA113 dfa113 = new DFA113(this);
    protected DFA112 dfa112 = new DFA112(this);
    protected DFA118 dfa118 = new DFA118(this);
    protected DFA122 dfa122 = new DFA122(this);
    protected DFA132 dfa132 = new DFA132(this);
    protected DFA133 dfa133 = new DFA133(this);
    protected DFA134 dfa134 = new DFA134(this);
    static final String dfa_1s = "\37\uffff";
    static final String dfa_2s = "\1\15\1\4\1\16\1\uffff\11\4\1\77\1\4\7\uffff\1\15\1\uffff\6\4\1\16";
    static final String dfa_3s = "\1\135\1\4\1\135\1\uffff\10\45\1\136\1\104\1\136\7\uffff\1\135\1\uffff\6\45\1\135";
    static final String dfa_4s = "\3\uffff\1\1\13\uffff\1\2\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\3\7\uffff";
    static final String dfa_5s = "\37\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\3\3\uffff\1\1\2\uffff\1\21\6\uffff\1\22\1\24\1\uffff\1\25\5\uffff\1\17\1\20\12\uffff\1\23\14\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\16\25\uffff\1\15",
            "\1\26",
            "\1\3\6\uffff\1\21\6\uffff\1\22\1\24\1\uffff\1\25\5\uffff\1\17\1\20\12\uffff\1\23\14\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\16\25\uffff\1\15",
            "",
            "\1\27\40\uffff\1\17",
            "\1\27\40\uffff\1\17",
            "\1\27\40\uffff\1\17",
            "\1\27\40\uffff\1\17",
            "\1\27\40\uffff\1\17",
            "\1\27\40\uffff\1\17",
            "\1\27\40\uffff\1\17",
            "\1\27\40\uffff\1\17",
            "\1\27\40\uffff\1\17\70\uffff\1\30",
            "\1\32\1\uffff\1\34\1\31\1\uffff\1\33",
            "\1\27\40\uffff\1\17\70\uffff\1\35",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\36\1\3\3\uffff\1\1\2\uffff\1\21\6\uffff\1\22\1\24\1\uffff\1\25\5\uffff\1\17\1\20\27\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\16\25\uffff\1\15",
            "",
            "\1\27\40\uffff\1\17",
            "\1\27\40\uffff\1\17",
            "\1\27\40\uffff\1\17",
            "\1\27\40\uffff\1\17",
            "\1\27\40\uffff\1\17",
            "\1\27\40\uffff\1\17",
            "\1\3\6\uffff\1\21\6\uffff\1\22\1\24\1\uffff\1\25\5\uffff\1\17\1\20\27\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\16\25\uffff\1\15"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "292:2: (this_PackageDeclaration_0= rulePackageDeclaration | this_ComponentInterface_1= ruleComponentInterface | this_ComponentImplementation_2= ruleComponentImplementation | this_ComponentConfiguration_3= ruleComponentConfiguration | this_PropertyDefinition_4= rulePropertyDefinition | this_PropertySet_5= rulePropertySet | this_Workingset_6= ruleWorkingset | this_TypeDef_7= ruleTypeDef | this_ConstantDef_8= ruleConstantDef )";
        }
    }
    static final String dfa_7s = "\13\uffff";
    static final String dfa_8s = "\2\uffff\2\1\1\uffff\1\1\3\uffff\2\1";
    static final String dfa_9s = "\1\45\1\uffff\2\32\1\77\1\32\1\uffff\1\0\1\uffff\2\32";
    static final String dfa_10s = "\1\135\1\uffff\2\140\1\104\1\140\1\uffff\1\0\1\uffff\2\140";
    static final String dfa_11s = "\1\uffff\1\1\4\uffff\1\2\1\uffff\1\3\2\uffff";
    static final String dfa_12s = "\7\uffff\1\0\3\uffff}>";
    static final String[] dfa_13s = {
            "\1\6\7\uffff\1\10\20\uffff\1\1\1\2\1\3\6\1\1\5\3\6\1\7\20\uffff\1\10\1\4",
            "",
            "\2\1\104\uffff\1\6",
            "\2\1\104\uffff\1\6",
            "\1\11\1\uffff\2\1\1\uffff\1\1",
            "\2\1\102\uffff\1\12\1\uffff\1\6",
            "",
            "\1\uffff",
            "",
            "\2\1\104\uffff\1\6",
            "\2\1\104\uffff\1\6"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "577:2: ( ( (lv_componentCategories_0_0= ruleComponentCategory ) ) | ( (lv_featureCategories_1_0= ruleFeatureCategory ) ) | ( (lv_associationTypes_2_0= ruleAssociationType ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_7 = input.LA(1);

                         
                        int index11_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalAadlV3()) ) {s = 6;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index11_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\17\uffff";
    static final String dfa_15s = "\2\4\1\26\1\uffff\1\4\1\45\1\26\1\4\6\uffff\1\4";
    static final String dfa_16s = "\1\40\1\4\1\44\1\uffff\1\23\1\135\1\26\1\4\6\uffff\1\22";
    static final String dfa_17s = "\3\uffff\1\6\4\uffff\1\7\1\2\1\4\1\3\1\1\1\5\1\uffff";
    static final String dfa_18s = "\17\uffff}>";
    static final String[] dfa_19s = {
            "\1\2\15\uffff\1\1\15\uffff\1\3",
            "\1\4",
            "\1\5\11\uffff\1\3\3\uffff\1\3",
            "",
            "\1\6\1\10\14\uffff\1\7\1\10",
            "\1\14\7\uffff\1\12\5\uffff\1\11\3\15\1\13\7\uffff\2\14\6\uffff\11\14\15\uffff\1\14",
            "\1\5",
            "\1\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\6\15\uffff\1\7"
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "1466:2: ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_stateVariables_1_0= ruleStateVariable ) ) | ( (lv_transitions_2_0= ruleTransitionRule ) ) | ( (lv_rules_3_0= ruleBehaviorRule ) ) | ( (lv_generators_4_0= ruleGenerator ) ) | ( (lv_ownedPropertyAssociations_5_0= rulePropertyAssociation ) ) | ( (lv_annexSubclause_6_0= ruleAnnexSubclause ) ) )";
        }
    }
    static final String dfa_20s = "\31\uffff";
    static final String dfa_21s = "\1\4\1\26\1\4\2\uffff\4\4\10\uffff\1\40\3\uffff\1\26\1\4\1\55\1\4";
    static final String dfa_22s = "\1\40\1\44\1\4\2\uffff\1\135\1\4\1\55\1\23\10\uffff\1\44\3\uffff\1\26\1\4\1\135\1\22";
    static final String dfa_23s = "\3\uffff\1\7\1\14\4\uffff\1\12\1\11\1\4\1\2\1\3\1\1\1\13\1\10\1\uffff\1\6\1\5\1\15\4\uffff";
    static final String dfa_24s = "\31\uffff}>";
    static final String[] dfa_25s = {
            "\1\1\15\uffff\1\2\6\uffff\1\3\6\uffff\1\4",
            "\1\5\11\uffff\1\4\1\7\2\uffff\1\6",
            "\1\10",
            "",
            "",
            "\1\14\13\uffff\1\13\34\uffff\1\11\5\uffff\1\20\3\17\1\12\6\uffff\12\15\3\uffff\1\14\20\uffff\1\16\1\15",
            "\1\21",
            "\1\22\16\uffff\1\22\31\uffff\1\23",
            "\1\25\1\24\14\uffff\1\26\1\24",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\4\1\7\2\uffff\1\6",
            "",
            "",
            "",
            "\1\27",
            "\1\30",
            "\1\11\5\uffff\1\20\3\17\1\12\6\uffff\12\15\25\uffff\1\15",
            "\1\25\15\uffff\1\26"
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "1780:2: ( ( (lv_connections_0_0= ruleConnection ) ) | ( (lv_bindings_1_0= ruleBinding ) ) | ( (lv_components_2_0= ruleSubcomponent ) ) | ( (lv_paths_3_0= ruleEndToEndFlow ) ) | ( (lv_flowAssignments_4_0= ruleFlowAssignment ) ) | ( (lv_classifierAssignments_5_0= ruleClassifierAssignment ) ) | ( (lv_classifierAssignments_6_0= ruleClassifierAssignmentPattern ) ) | ( (lv_stateVariables_7_0= ruleStateVariable ) ) | ( (lv_transitions_8_0= ruleTransitionRule ) ) | ( (lv_rules_9_0= ruleBehaviorRule ) ) | ( (lv_generators_10_0= ruleGenerator ) ) | ( (lv_ownedPropertyAssociations_11_0= rulePropertyAssociation ) ) | ( (lv_annexSubclause_12_0= ruleAnnexSubclause ) ) )";
        }
    }
    static final String dfa_26s = "\6\uffff";
    static final String dfa_27s = "\1\4\1\21\1\4\2\uffff\1\21";
    static final String dfa_28s = "\1\4\1\75\1\4\2\uffff\1\75";
    static final String dfa_29s = "\3\uffff\1\1\1\2\1\uffff";
    static final String dfa_30s = "\6\uffff}>";
    static final String[] dfa_31s = {
            "\1\1",
            "\1\4\32\uffff\1\4\17\uffff\1\3\1\2",
            "\1\5",
            "",
            "",
            "\1\4\32\uffff\1\4\17\uffff\1\3\1\2"
    };

    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[][] dfa_31 = unpackEncodedStringArray(dfa_31s);

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = dfa_26;
            this.eof = dfa_26;
            this.min = dfa_27;
            this.max = dfa_28;
            this.accept = dfa_29;
            this.special = dfa_30;
            this.transition = dfa_31;
        }
        public String getDescription() {
            return "3077:3: ( ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) )";
        }
    }
    static final String dfa_32s = "\11\uffff";
    static final String dfa_33s = "\1\4\1\26\3\uffff\1\4\2\uffff\1\40";
    static final String dfa_34s = "\1\40\1\44\3\uffff\1\4\2\uffff\1\44";
    static final String dfa_35s = "\2\uffff\1\1\1\4\1\5\1\uffff\1\2\1\3\1\uffff";
    static final String dfa_36s = "\11\uffff}>";
    static final String[] dfa_37s = {
            "\1\1\15\uffff\1\4\6\uffff\1\3\6\uffff\1\2",
            "\1\6\11\uffff\1\2\1\7\2\uffff\1\5",
            "",
            "",
            "",
            "\1\10",
            "",
            "",
            "\1\2\1\7\2\uffff\1\5"
    };

    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final char[] dfa_33 = DFA.unpackEncodedStringToUnsignedChars(dfa_33s);
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[][] dfa_37 = unpackEncodedStringArray(dfa_37s);

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = dfa_32;
            this.eof = dfa_32;
            this.min = dfa_33;
            this.max = dfa_34;
            this.accept = dfa_35;
            this.special = dfa_36;
            this.transition = dfa_37;
        }
        public String getDescription() {
            return "3615:2: ( ( (lv_ownedPropertyAssociations_0_0= rulePropertyAssociation ) ) | ( (lv_bindings_1_0= ruleBinding ) ) | ( (lv_classifierAssignments_2_0= ruleClassifierAssignment ) ) | ( (lv_classifierAssignments_3_0= ruleClassifierAssignmentPattern ) ) | ( (lv_annexSubclause_4_0= ruleAnnexSubclause ) ) )";
        }
    }
    static final String dfa_38s = "\24\uffff";
    static final String dfa_39s = "\2\4\1\26\1\uffff\2\4\1\26\1\uffff\1\4\2\uffff\2\4\1\77\1\4\1\uffff\1\45\1\21\2\4";
    static final String dfa_40s = "\1\40\1\4\1\44\1\uffff\1\22\1\135\1\26\1\uffff\1\56\2\uffff\2\140\1\104\1\140\1\uffff\1\135\1\75\2\140";
    static final String dfa_41s = "\3\uffff\1\5\3\uffff\1\3\1\uffff\1\2\1\4\4\uffff\1\1\4\uffff";
    static final String dfa_42s = "\24\uffff}>";
    static final String[] dfa_43s = {
            "\1\2\15\uffff\1\1\15\uffff\1\3",
            "\1\4",
            "\1\5\11\uffff\1\3\3\uffff\1\3",
            "",
            "\1\6\15\uffff\1\1",
            "\1\7\40\uffff\1\17\30\uffff\1\12\1\13\1\14\6\12\1\16\3\17\1\10\4\17\14\uffff\1\11\1\15",
            "\1\20",
            "",
            "\1\21\14\uffff\1\17\1\uffff\1\17\32\uffff\1\17",
            "",
            "",
            "\1\12\16\uffff\1\12\114\uffff\1\17",
            "\1\12\16\uffff\1\12\114\uffff\1\17",
            "\1\22\1\uffff\2\12\1\uffff\1\12",
            "\1\12\16\uffff\1\12\112\uffff\1\23\1\uffff\1\17",
            "",
            "\1\17\30\uffff\1\12\1\13\1\14\6\12\1\16\10\17\15\uffff\1\15",
            "\1\17\1\uffff\1\17\20\uffff\1\7\2\uffff\1\7\25\uffff\1\17",
            "\1\12\16\uffff\1\12\114\uffff\1\17",
            "\1\12\16\uffff\1\12\114\uffff\1\17"
    };

    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final char[] dfa_39 = DFA.unpackEncodedStringToUnsignedChars(dfa_39s);
    static final char[] dfa_40 = DFA.unpackEncodedStringToUnsignedChars(dfa_40s);
    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final short[][] dfa_43 = unpackEncodedStringArray(dfa_43s);

    class DFA80 extends DFA {

        public DFA80(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 80;
            this.eot = dfa_38;
            this.eof = dfa_38;
            this.min = dfa_39;
            this.max = dfa_40;
            this.accept = dfa_41;
            this.special = dfa_42;
            this.transition = dfa_43;
        }
        public String getDescription() {
            return "4499:2: ( ( (lv_features_0_0= ruleFeature ) ) | ( (lv_connections_1_0= ruleConnection ) ) | ( (lv_bindings_2_0= ruleBinding ) ) | ( (lv_components_3_0= ruleSubcomponent ) ) | ( (lv_ownedPropertyAssociations_4_0= rulePropertyAssociation ) ) )";
        }
    }
    static final String dfa_44s = "\2\4\1\26\1\4\1\55\4\uffff";
    static final String dfa_45s = "\1\22\1\4\1\26\1\22\1\67\4\uffff";
    static final String dfa_46s = "\5\uffff\1\3\1\4\1\2\1\1";
    static final String[] dfa_47s = {
            "\1\2\15\uffff\1\1",
            "\1\3",
            "\1\4",
            "\1\2\15\uffff\1\1",
            "\1\5\5\uffff\1\6\3\10\1\7",
            "",
            "",
            "",
            ""
    };
    static final char[] dfa_44 = DFA.unpackEncodedStringToUnsignedChars(dfa_44s);
    static final char[] dfa_45 = DFA.unpackEncodedStringToUnsignedChars(dfa_45s);
    static final short[] dfa_46 = DFA.unpackEncodedString(dfa_46s);
    static final short[][] dfa_47 = unpackEncodedStringArray(dfa_47s);

    class DFA93 extends DFA {

        public DFA93(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 93;
            this.eot = dfa_32;
            this.eof = dfa_32;
            this.min = dfa_44;
            this.max = dfa_45;
            this.accept = dfa_46;
            this.special = dfa_36;
            this.transition = dfa_47;
        }
        public String getDescription() {
            return "5349:2: ( ( (lv_generators_0_0= ruleGenerator ) ) | ( (lv_transitions_1_0= ruleTransitionRule ) ) | ( (lv_rules_2_0= ruleBehaviorRule ) ) | ( (lv_stateVariables_3_0= ruleStateVariable ) ) )";
        }
    }
    static final String dfa_48s = "\7\uffff";
    static final String dfa_49s = "\1\4\1\uffff\1\44\1\4\2\uffff\1\44";
    static final String dfa_50s = "\1\131\1\uffff\1\114\1\4\2\uffff\1\114";
    static final String dfa_51s = "\1\uffff\1\1\2\uffff\1\2\1\3\1\uffff";
    static final String dfa_52s = "\7\uffff}>";
    static final String[] dfa_53s = {
            "\1\2\24\uffff\1\1\26\uffff\1\1\45\uffff\4\1",
            "",
            "\1\3\2\uffff\1\5\44\uffff\1\4",
            "\1\6",
            "",
            "",
            "\1\3\2\uffff\1\5\44\uffff\1\4"
    };

    static final short[] dfa_48 = DFA.unpackEncodedString(dfa_48s);
    static final char[] dfa_49 = DFA.unpackEncodedStringToUnsignedChars(dfa_49s);
    static final char[] dfa_50 = DFA.unpackEncodedStringToUnsignedChars(dfa_50s);
    static final short[] dfa_51 = DFA.unpackEncodedString(dfa_51s);
    static final short[] dfa_52 = DFA.unpackEncodedString(dfa_52s);
    static final short[][] dfa_53 = unpackEncodedStringArray(dfa_53s);

    class DFA102 extends DFA {

        public DFA102(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 102;
            this.eot = dfa_48;
            this.eof = dfa_48;
            this.min = dfa_49;
            this.max = dfa_50;
            this.accept = dfa_51;
            this.special = dfa_52;
            this.transition = dfa_53;
        }
        public String getDescription() {
            return "5745:5: (lv_condition_4_1= ruleMultiLiteralOperation | lv_condition_4_2= ruleModelElementContainsLiteral | lv_condition_4_3= ruleModelElementReference )";
        }
    }

    class DFA107 extends DFA {

        public DFA107(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 107;
            this.eot = dfa_48;
            this.eof = dfa_48;
            this.min = dfa_49;
            this.max = dfa_50;
            this.accept = dfa_51;
            this.special = dfa_52;
            this.transition = dfa_53;
        }
        public String getDescription() {
            return "5981:5: (lv_condition_4_1= ruleMultiLiteralOperation | lv_condition_4_2= ruleModelElementContainsLiteral | lv_condition_4_3= ruleModelElementReference )";
        }
    }
    static final String dfa_54s = "\1\4\1\uffff\1\21\1\4\1\uffff\1\21";
    static final String dfa_55s = "\1\131\1\uffff\1\114\1\4\1\uffff\1\114";
    static final String dfa_56s = "\1\uffff\1\1\2\uffff\1\2\1\uffff";
    static final String[] dfa_57s = {
            "\1\2\24\uffff\1\1\26\uffff\1\1\45\uffff\4\1",
            "",
            "\1\4\1\uffff\1\4\6\uffff\1\4\7\uffff\1\4\1\uffff\1\3\2\uffff\1\1\2\uffff\1\4\41\uffff\1\1",
            "\1\5",
            "",
            "\1\4\1\uffff\1\4\6\uffff\1\4\7\uffff\1\4\1\uffff\1\3\2\uffff\1\1\2\uffff\1\4\41\uffff\1\1"
    };
    static final char[] dfa_54 = DFA.unpackEncodedStringToUnsignedChars(dfa_54s);
    static final char[] dfa_55 = DFA.unpackEncodedStringToUnsignedChars(dfa_55s);
    static final short[] dfa_56 = DFA.unpackEncodedString(dfa_56s);
    static final short[][] dfa_57 = unpackEncodedStringArray(dfa_57s);

    class DFA113 extends DFA {

        public DFA113(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 113;
            this.eot = dfa_26;
            this.eof = dfa_26;
            this.min = dfa_54;
            this.max = dfa_55;
            this.accept = dfa_56;
            this.special = dfa_30;
            this.transition = dfa_57;
        }
        public String getDescription() {
            return "6200:3: ( ( ( (lv_condition_5_1= ruleMultiLiteralOperation | lv_condition_5_2= ruleModelElementContainsLiteral | lv_condition_5_3= ruleModelElementReference ) ) ) otherlv_6= '->' )?";
        }
    }

    class DFA112 extends DFA {

        public DFA112(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 112;
            this.eot = dfa_48;
            this.eof = dfa_48;
            this.min = dfa_49;
            this.max = dfa_50;
            this.accept = dfa_51;
            this.special = dfa_52;
            this.transition = dfa_53;
        }
        public String getDescription() {
            return "6203:6: (lv_condition_5_1= ruleMultiLiteralOperation | lv_condition_5_2= ruleModelElementContainsLiteral | lv_condition_5_3= ruleModelElementReference )";
        }
    }

    class DFA118 extends DFA {

        public DFA118(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 118;
            this.eot = dfa_48;
            this.eof = dfa_48;
            this.min = dfa_49;
            this.max = dfa_50;
            this.accept = dfa_51;
            this.special = dfa_52;
            this.transition = dfa_53;
        }
        public String getDescription() {
            return "6411:5: (lv_condition_4_1= ruleMultiLiteralOperation | lv_condition_4_2= ruleModelElementContainsLiteral | lv_condition_4_3= ruleModelElementReference )";
        }
    }
    static final String dfa_58s = "\16\uffff";
    static final String dfa_59s = "\11\uffff\1\12\3\uffff\1\12";
    static final String dfa_60s = "\1\4\10\uffff\1\21\1\uffff\1\4\1\uffff\1\21";
    static final String dfa_61s = "\1\131\10\uffff\1\114\1\uffff\1\4\1\uffff\1\114";
    static final String dfa_62s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\12\1\uffff\1\11\1\uffff";
    static final String dfa_63s = "\16\uffff}>";
    static final String[] dfa_64s = {
            "\1\11\1\uffff\1\3\1\1\1\2\17\uffff\1\7\1\10\6\uffff\1\5\17\uffff\1\10\11\uffff\2\4\20\uffff\2\6\10\uffff\4\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\12\10\uffff\2\12\10\uffff\1\13\30\uffff\1\12\16\uffff\1\14",
            "",
            "\1\15",
            "",
            "\1\12\10\uffff\2\12\10\uffff\1\13\47\uffff\1\14"
    };

    static final short[] dfa_58 = DFA.unpackEncodedString(dfa_58s);
    static final short[] dfa_59 = DFA.unpackEncodedString(dfa_59s);
    static final char[] dfa_60 = DFA.unpackEncodedStringToUnsignedChars(dfa_60s);
    static final char[] dfa_61 = DFA.unpackEncodedStringToUnsignedChars(dfa_61s);
    static final short[] dfa_62 = DFA.unpackEncodedString(dfa_62s);
    static final short[] dfa_63 = DFA.unpackEncodedString(dfa_63s);
    static final short[][] dfa_64 = unpackEncodedStringArray(dfa_64s);

    class DFA122 extends DFA {

        public DFA122(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 122;
            this.eot = dfa_58;
            this.eof = dfa_59;
            this.min = dfa_60;
            this.max = dfa_61;
            this.accept = dfa_62;
            this.special = dfa_63;
            this.transition = dfa_64;
        }
        public String getDescription() {
            return "6848:2: (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_PropertyReference_4= rulePropertyReference | this_DirectionalLiteral_5= ruleDirectionalLiteral | this_ListLiteral_6= ruleListLiteral | this_MultiLiteralOperation_7= ruleMultiLiteralOperation | this_ModelElementContainsLiteral_8= ruleModelElementContainsLiteral | this_NamedElementReference_9= ruleNamedElementReference )";
        }
    }
    static final String dfa_65s = "\11\uffff\1\15\1\uffff\1\23\10\uffff";
    static final String dfa_66s = "\1\76\10\uffff\1\4\1\77\1\4\10\uffff";
    static final String dfa_67s = "\1\135\10\uffff\1\136\1\104\1\136\10\uffff";
    static final String dfa_68s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\3\uffff\1\20\1\11\1\12\1\13\1\15\1\14\1\17\1\16";
    static final String[] dfa_69s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\13\25\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\15\16\uffff\1\15\6\uffff\2\15\11\uffff\1\15\70\uffff\1\14",
            "\1\16\1\uffff\1\20\1\21\1\uffff\1\17",
            "\1\23\16\uffff\1\23\6\uffff\2\23\11\uffff\1\23\70\uffff\1\22",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[] dfa_65 = DFA.unpackEncodedString(dfa_65s);
    static final char[] dfa_66 = DFA.unpackEncodedStringToUnsignedChars(dfa_66s);
    static final char[] dfa_67 = DFA.unpackEncodedStringToUnsignedChars(dfa_67s);
    static final short[] dfa_68 = DFA.unpackEncodedString(dfa_68s);
    static final short[][] dfa_69 = unpackEncodedStringArray(dfa_69s);

    class DFA132 extends DFA {

        public DFA132(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 132;
            this.eot = dfa_38;
            this.eof = dfa_65;
            this.min = dfa_66;
            this.max = dfa_67;
            this.accept = dfa_68;
            this.special = dfa_42;
            this.transition = dfa_69;
        }
        public String getDescription() {
            return "7802:2: (kw= 'abstract' | kw= 'bus' | kw= 'data' | kw= 'device' | kw= 'memory' | kw= 'process' | kw= 'processor' | kw= 'system' | kw= 'thread' | this_VirtualBusKeywords_9= ruleVirtualBusKeywords | this_VirtualProcessorKeywords_10= ruleVirtualProcessorKeywords | this_VirtualMemoryKeywords_11= ruleVirtualMemoryKeywords | this_VirtualDeviceKeywords_12= ruleVirtualDeviceKeywords | kw= 'subprogram' | this_SubprogramGroupKeywords_14= ruleSubprogramGroupKeywords | this_ThreadGroupKeywords_15= ruleThreadGroupKeywords )";
        }
    }
    static final String dfa_70s = "\14\uffff";
    static final String dfa_71s = "\1\45\6\uffff\1\136\4\uffff";
    static final String dfa_72s = "\1\135\6\uffff\1\140\4\uffff";
    static final String dfa_73s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\11\1\12\1\10\1\7";
    static final String dfa_74s = "\14\uffff}>";
    static final String[] dfa_75s = {
            "\1\11\31\uffff\1\5\1\4\6\uffff\1\7\1\1\1\2\1\3\1\10\21\uffff\1\6",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\12\1\uffff\1\13",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_70 = DFA.unpackEncodedString(dfa_70s);
    static final char[] dfa_71 = DFA.unpackEncodedStringToUnsignedChars(dfa_71s);
    static final char[] dfa_72 = DFA.unpackEncodedStringToUnsignedChars(dfa_72s);
    static final short[] dfa_73 = DFA.unpackEncodedString(dfa_73s);
    static final short[] dfa_74 = DFA.unpackEncodedString(dfa_74s);
    static final short[][] dfa_75 = unpackEncodedStringArray(dfa_75s);

    class DFA133 extends DFA {

        public DFA133(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 133;
            this.eot = dfa_70;
            this.eof = dfa_70;
            this.min = dfa_71;
            this.max = dfa_72;
            this.accept = dfa_73;
            this.special = dfa_74;
            this.transition = dfa_75;
        }
        public String getDescription() {
            return "7946:2: (kw= 'feature' | kw= 'port' | kw= 'parameter' | this_DataAccessKeywords_3= ruleDataAccessKeywords | this_BusAccessKeywords_4= ruleBusAccessKeywords | this_VirtualBusAccessKeywords_5= ruleVirtualBusAccessKeywords | this_SubprogramAccessKeywords_6= ruleSubprogramAccessKeywords | this_SubprogramGroupAccessKeywords_7= ruleSubprogramGroupAccessKeywords | kw= 'binding' | kw= 'interface' )";
        }
    }
    static final String dfa_76s = "\21\uffff";
    static final String dfa_77s = "\1\uffff\1\6\1\uffff\1\7\1\12\4\uffff\1\15\1\uffff\1\17\5\uffff";
    static final String dfa_78s = "\1\114\1\45\1\uffff\2\45\4\uffff\1\45\1\uffff\1\45\5\uffff";
    static final String dfa_79s = "\1\117\1\135\1\uffff\2\135\4\uffff\1\135\1\uffff\1\135\5\uffff";
    static final String dfa_80s = "\2\uffff\1\2\2\uffff\1\3\1\1\1\4\1\11\1\uffff\1\5\1\uffff\1\10\1\7\1\13\1\6\1\12";
    static final String dfa_81s = "\21\uffff}>";
    static final String[] dfa_82s = {
            "\1\1\1\2\1\3\1\4",
            "\1\6\31\uffff\2\6\6\uffff\5\6\1\uffff\1\5\17\uffff\1\6",
            "",
            "\1\7\31\uffff\2\7\6\uffff\5\7\1\11\1\10\17\uffff\1\7",
            "\1\12\31\uffff\2\12\6\uffff\5\12\1\13\1\14\17\uffff\1\12",
            "",
            "",
            "",
            "",
            "\1\15\31\uffff\2\15\6\uffff\5\15\1\uffff\1\16\17\uffff\1\15",
            "",
            "\1\17\31\uffff\2\17\6\uffff\5\17\1\uffff\1\20\17\uffff\1\17",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_76 = DFA.unpackEncodedString(dfa_76s);
    static final short[] dfa_77 = DFA.unpackEncodedString(dfa_77s);
    static final char[] dfa_78 = DFA.unpackEncodedStringToUnsignedChars(dfa_78s);
    static final char[] dfa_79 = DFA.unpackEncodedStringToUnsignedChars(dfa_79s);
    static final short[] dfa_80 = DFA.unpackEncodedString(dfa_80s);
    static final short[] dfa_81 = DFA.unpackEncodedString(dfa_81s);
    static final short[][] dfa_82 = unpackEncodedStringArray(dfa_82s);

    class DFA134 extends DFA {

        public DFA134(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 134;
            this.eot = dfa_76;
            this.eof = dfa_77;
            this.min = dfa_78;
            this.max = dfa_79;
            this.accept = dfa_80;
            this.special = dfa_81;
            this.transition = dfa_82;
        }
        public String getDescription() {
            return "8049:2: (kw= 'in' | kw= 'out' | this_InOutKeywords_2= ruleInOutKeywords | kw= 'requires' | kw= 'provides' | this_ProvidesReadKeywords_5= ruleProvidesReadKeywords | this_RequiresReadKeywords_6= ruleRequiresReadKeywords | this_ProvidesWriteKeywords_7= ruleProvidesWriteKeywords | this_RequiresWriteKeywords_8= ruleRequiresWriteKeywords | this_ProvidesRWKeywords_9= ruleProvidesRWKeywords | this_RequiresRWKeywords_10= ruleRequiresRWKeywords )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000046000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0xC0020860B0256000L,0x00000000200000FFL});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000246000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000800000000010L,0x00000000003F0000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0xC000202002000000L,0x0000000030000FFFL});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010046000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020046000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000404A0000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000004A0000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080046000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0C010001030001D0L,0x0000000003C03000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0xC000002000046000L,0x00000000200000FFL});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0xC000002000000000L,0x00000000200000FFL});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000040008000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000100056010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0xC000000000046000L,0x00000000200000FFL});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0xC000000000000000L,0x00000000200000FFL});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000102056010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000004000046000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000041008000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000046010L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x8000002000000000L,0x000000002000FF81L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x8000002000000000L,0x0000000020000F81L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x00004000000A0010L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000040000020000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x00000400000A0000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x00000080000A0000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000100000020000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x00000000040A0010L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000008000020000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000102046010L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000102146010L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000100100010L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000100046010L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000100146010L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000020000010010L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0004000000020040L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000146010L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000046012L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x00000000000A0010L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0070000000000000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x00000000010A0000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0001000002000010L,0x0000000003C00000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x00000400040A0000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0C0100010B0001D0L,0x0000000003C03000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});

}